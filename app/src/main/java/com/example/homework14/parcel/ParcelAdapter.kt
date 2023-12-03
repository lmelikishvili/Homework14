package com.example.homework14.parcel

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.homework14.databinding.ParcelItemBinding

class ParcelAdapter: ListAdapter<Parcel,ParcelAdapter.ParcelVH>(ParcelDiffutil()) {

    class ParcelDiffutil: DiffUtil.ItemCallback<Parcel>(){
        override fun areItemsTheSame(oldItem: Parcel, newItem: Parcel): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Parcel, newItem: Parcel): Boolean {
            return oldItem == newItem
        }

    }
    
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ParcelVH(ParcelItemBinding.inflate(
        LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: ParcelVH, position: Int) {
        holder.bind()
    }

    inner class ParcelVH(private val binding: ParcelItemBinding): RecyclerView.ViewHolder(binding.root){
        private lateinit var parcel: Parcel
        fun bind(){
            parcel = currentList[adapterPosition]
            with(binding){
                tvID.text = "ID ${parcel.id}"
                tvTitle.text = parcel.title
                tvWeight.text = "${parcel.weight} KG"
            }
            if(parcel.status == Parcel.Status.DELIVERED){
                binding.tvStatus.text = "DELIVERED"
                binding.tvStatus.setTextColor(Color.parseColor("#008000"))
            }else{
                binding.tvStatus.text = "IN PROGRESS"
                binding.tvStatus.setTextColor(Color.parseColor("#f25454"))
            }
        }
    }
}