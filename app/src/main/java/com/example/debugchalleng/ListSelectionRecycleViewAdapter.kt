package com.example.debugchalleng

import android.content.Context
import android.text.BoringLayout.make
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView



class ListSelectionRecyclerViewAdapter(private val stateAndCapitals: ArrayList<ArrayList<String>>,cont: Context) :
    RecyclerView.Adapter<ListSelectionViewHolder>() {
    val cont=cont
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListSelectionViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_selection_view_holder, parent, false)

        return ListSelectionViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListSelectionViewHolder, position: Int) {
        holder.listPosition.text = (position+1).toString()                                            //fixed by adding 1 to position
        holder.listTitle.text = "${stateAndCapitals[position][0]} : ${stateAndCapitals[position][1]}"//fixed by adding ${stateAndCapitals[position][0]} :
        holder.hold.setOnClickListener {
            Toast.makeText(cont," ${stateAndCapitals[position][0]} : ${stateAndCapitals[position][1]} ",Toast.LENGTH_SHORT).show()
        }

    }

    override fun getItemCount(): Int {
        return stateAndCapitals.size
    }

}