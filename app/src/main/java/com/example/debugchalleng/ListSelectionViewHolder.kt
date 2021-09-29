package com.example.debugchalleng

import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListSelectionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val hold: LinearLayout = itemView.findViewById(R.id.hold)
    val listPosition: TextView = itemView.findViewById(R.id.itemNumber)
    val listTitle: TextView = itemView.findViewById(R.id.itemString)
}