package com.example.android.trackmysleepquality.sleeptracker

import android.content.res.Resources
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.android.trackmysleepquality.R
import com.example.android.trackmysleepquality.TextItemViewHolder
import com.example.android.trackmysleepquality.convertDurationToFormatted
import com.example.android.trackmysleepquality.convertNumericQualityToString
import com.example.android.trackmysleepquality.database.SleepNight

class SleepNightAdapter : RecyclerView.Adapter<SleepNightAdapter.SleepNightViewHolder>(){

    var data = listOf<SleepNight>()
    set(value) {
            field = value
            notifyDataSetChanged()
    }

    class SleepNightViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val sleepLength: TextView = itemView.findViewById(R.id.sleep_length)
        val quality: TextView = itemView.findViewById(R.id.quality_string)
        val qualityImage: ImageView = itemView.findViewById(R.id.quality_image)
        val res = itemView.context.resources

        fun bind(item: SleepNight){
            sleepLength.text = convertDurationToFormatted(item.startTimeMilli, item.endTimeMilli, res)
            quality.text = convertNumericQualityToString(item.sleepQuality, res)
            qualityImage.setImageResource(when (item.sleepQuality) {
                0 -> R.drawable.ic_sleep_0
                1 -> R.drawable.ic_sleep_1
                2 -> R.drawable.ic_sleep_2
                3 -> R.drawable.ic_sleep_3
                4 -> R.drawable.ic_sleep_4
                5 -> R.drawable.ic_sleep_5
                else -> R.drawable.ic_sleep_active
            })
        }


        companion object {
            fun from(parent: ViewGroup) : SleepNightViewHolder{
                val inflater = LayoutInflater.from(parent.context)
                val view = inflater.inflate(R.layout.list_item_sleep_night, parent, false)
                return SleepNightViewHolder(view)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SleepNightViewHolder {
        return SleepNightViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: SleepNightViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item)

    }

    override fun getItemCount(): Int  = data.size


}