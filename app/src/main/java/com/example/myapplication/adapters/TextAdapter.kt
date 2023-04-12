package com.example.myapplication.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.adapters.TextAdapter.TextViewHolder
import com.example.myapplication.databinding.ItemFilmBinding
import com.example.myapplication.models.Filmmodel

class TextAdapter(private var listModel: MutableList<Filmmodel>) : RecyclerView.Adapter<TextViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextViewHolder {
        val binding = ItemFilmBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TextViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return listModel.size
    }

    override fun onBindViewHolder(holder: TextViewHolder, position: Int) {
        val model = listModel[position]
        holder.bind(model)
    }

    inner class TextViewHolder(private val binding: ItemFilmBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(model: Filmmodel) {
            binding.apply {
                binding.txtFilmItem.text = model.name
            }
        }
    }
}