package com.example.android.trackmysleepquality.sleeptracker

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.android.trackmysleepquality.database.SleepNight
import com.example.android.trackmysleepquality.databinding.ListItemSleepNightBinding

class SleepNightAdapter(val clickListener: SleepNightListener) :
    ListAdapter<SleepNight,SleepNightAdapter.SleepNightViewHolder>(SleepNightDiffCallback()){

    class SleepNightViewHolder
        private constructor(val binding: ListItemSleepNightBinding) : RecyclerView.ViewHolder(binding.root){

        fun bind(item: SleepNight, clickListener: SleepNightListener) {
            binding.sleep = item
            binding.clickListener = clickListener
            binding.executePendingBindings()
        }


        companion object {
            fun from(parent: ViewGroup) : SleepNightViewHolder{
                val inflater = LayoutInflater.from(parent.context)
                val binding = ListItemSleepNightBinding.inflate(inflater,parent,false)
                return SleepNightViewHolder(binding)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SleepNightViewHolder {
        return SleepNightViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: SleepNightViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item,clickListener)
    }


}


class SleepNightDiffCallback : DiffUtil.ItemCallback<SleepNight>(){
    override fun areItemsTheSame(oldItem: SleepNight, newItem: SleepNight): Boolean {
        return oldItem.nightId == newItem.nightId
    }

    override fun areContentsTheSame(oldItem: SleepNight, newItem: SleepNight): Boolean {
        return oldItem == newItem
    }

}


class SleepNightListener(val clickListener: (sleepId:Long) -> Unit){
    fun onClick(night: SleepNight) = clickListener(night.nightId)
}

























