package com.example.giuakylttd

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R

class adapter(private val dataSet: List<data>) : RecyclerView.Adapter<adapter.ViewHolderItem>() {

        inner class ViewHolderItem(view: View) : RecyclerView.ViewHolder(view){
            val name: TextView = view.findViewById(R.id.tv_name)
        }
        @SuppressLint("InflateParams")
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderItem {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recyclerview,null)
            return ViewHolderItem(view)
        }

        override fun onBindViewHolder(holder: ViewHolderItem, position: Int) {
            val item = dataSet[position]
            holder.name.text = item.thudo

        }
        override fun getItemCount() : Int = dataSet.size

}