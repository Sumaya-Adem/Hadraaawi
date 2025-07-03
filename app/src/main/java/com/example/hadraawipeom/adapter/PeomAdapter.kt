package com.example.hadraawi.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.hadraawi.data.Poem
import com.example.hadraawipeom.R

class PoemAdapter (
    private val poems: List<Poem>,
    private val onClick: (Poem) -> Unit
) : RecyclerView.Adapter<PoemAdapter.PoemViewHolder>()
{
    inner class PoemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleText: TextView = itemView.findViewById(R.id.titleText)
        val backgroundImage: ImageView = itemView.findViewById(R.id.backgroundImage)

        init {
            itemView.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    onClick(poems[position])
                }
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PoemViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_peom, parent, false)
        return PoemViewHolder(view)
    }

    override fun getItemCount():Int =poems.size

    override fun onBindViewHolder(holder: PoemViewHolder, position: Int) {
        val poem = poems[position]
        holder.titleText.text = poem.title
//        holder.backgroundImage.setImageResource(poem.imageResId)
    }
}