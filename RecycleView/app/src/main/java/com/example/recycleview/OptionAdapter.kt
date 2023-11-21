package com.example.recycleview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class OptionAdapter(
    var optionNameList: ArrayList<String>,
    var detailsList: ArrayList<String>,
    var imgList: ArrayList<Int>,
    var context: Context) : RecyclerView.Adapter<OptionAdapter.OptionViewHolder>() {


    class OptionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var textViewOptionName: TextView = itemView.findViewById(R.id.option1)
        var textViewDetail: TextView = itemView.findViewById(R.id.txt1)
        var imageView: ImageView = itemView.findViewById(R.id.img1)
        var cardView: CardView = itemView.findViewById(R.id.c1)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OptionViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_design,parent,false)
        return OptionViewHolder(view)
    }

    override fun getItemCount(): Int {
        return optionNameList.size
    }

    override fun onBindViewHolder(holder: OptionViewHolder, position: Int) {
        holder.textViewOptionName.text = optionNameList.get(position)
        holder.textViewDetail.text = detailsList.get(position)
        holder.imageView.setImageResource(imgList.get(position))

        holder.cardView.setOnClickListener {
            Toast.makeText(context,"You selected the ${optionNameList.get(position)}", Toast.LENGTH_LONG).show()

        }
    }
}