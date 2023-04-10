package com.example.timetable

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RVAdapter (
    private val days: List<String>
        ): RecyclerView.Adapter<RVAdapter.NewViewHolder>() {

    class NewViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val tvDay: TextView = itemView.findViewById(R.id.tvDay)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.day_rv_item,
            parent, false
        )
        return NewViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return days.size
    }

    override fun onBindViewHolder(holder: NewViewHolder, position: Int) {
        holder.tvDay.text = days[position]
    }
}