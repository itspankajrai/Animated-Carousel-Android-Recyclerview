package com.rai.seamless.animatedcarousel

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil3.load
import com.rai.seamless.animatedcarousel.databinding.ItemCarouselViewBinding

class CarouselAdapter(private val items: List<String>) : RecyclerView.Adapter<CarouselAdapter.ViewHolder>() {

        inner class ViewHolder(private val binding: ItemCarouselViewBinding) : RecyclerView.ViewHolder(binding.root) {
            fun bind(item: String) {
                binding.carouselImage.load(data =item )
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val binding = ItemCarouselViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return ViewHolder(binding)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
                holder.bind(items[position])
        }

        override fun getItemCount(): Int = items.size
}