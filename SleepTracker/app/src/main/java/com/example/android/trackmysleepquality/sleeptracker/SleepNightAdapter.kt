package com.example.android.trackmysleepquality.sleeptracker

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.android.trackmysleepquality.TextItemViewHolder
import com.example.android.trackmysleepquality.database.SleepNight
import com.example.android.trackmysleepquality.databinding.ListItemSleepNightBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.lang.ClassCastException

private const val ITEM_VIEW_TYPE_HEADER = 0
private const val ITEM_VIEW_TYPE_ITEM = 1

class SleepNightAdapter(val clickListener: SleepNightListener) :
    ListAdapter<DataItem,RecyclerView.ViewHolder>(SleepNightDiffCallback()){

    private val adapterScope = CoroutineScope(Dispatchers.Default)

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

    fun addHeaderAndSubmitList(list: List<SleepNight>?){
        adapterScope.launch {
           val items = when(list){
               null -> listOf(DataItem.Header)
               else -> listOf(DataItem.Header) + list.map { DataItem.SleepNightItem(it) }
           }

           withContext(Dispatchers.Main){
               submitList(items)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when(viewType){
            ITEM_VIEW_TYPE_HEADER -> TextItemViewHolder.from(parent)
            ITEM_VIEW_TYPE_ITEM -> SleepNightViewHolder.from(parent)
            else -> throw ClassCastException("Unknown viewType $viewType")
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when(getItem(position)){
            is DataItem.Header -> ITEM_VIEW_TYPE_HEADER
            is DataItem.SleepNightItem -> ITEM_VIEW_TYPE_ITEM
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is SleepNightViewHolder -> {
                val item = getItem(position) as DataItem.SleepNightItem
                holder.bind(item.sleepNight,clickListener)
            }

            is TextItemViewHolder -> {
                val mTextView = holder.itemView as TextView
                mTextView.text = "Sleep Data"
            }
        }


    }


}


class SleepNightDiffCallback : DiffUtil.ItemCallback<DataItem>(){
    override fun areItemsTheSame(oldItem: DataItem, newItem: DataItem): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: DataItem, newItem: DataItem): Boolean {
        return oldItem == newItem
    }

}


class SleepNightListener(val clickListener: (sleepId:Long) -> Unit){
    fun onClick(night: SleepNight) = clickListener(night.nightId)
}

sealed class DataItem{
    data class SleepNightItem(val sleepNight:SleepNight) : DataItem() {
        override val id: Long
            get() = sleepNight.nightId
    }

    object Header : DataItem(){
        override val id: Long
            get() = Long.MIN_VALUE

    }

    abstract val id:Long
}

























