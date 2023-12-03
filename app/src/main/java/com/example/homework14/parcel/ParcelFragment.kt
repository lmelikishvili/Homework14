package com.example.homework14.parcel

import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.homework14.BaseFragment
import com.example.homework14.databinding.FragmentParcelsBinding

class ParcelFragment : BaseFragment<FragmentParcelsBinding>(FragmentParcelsBinding::inflate) {
    private val viewModel: ParcelViewModel by viewModels()
    private val adapter: ParcelAdapter by lazy {
        ParcelAdapter()
    }
    override fun setup() {
        with(binding){
            parcelRecyclerView.layoutManager = LinearLayoutManager(requireContext())
            parcelRecyclerView.setHasFixedSize(true)
            parcelRecyclerView.adapter = adapter
        }
        adapter.submitList(viewModel.parcelList)
    }



    override fun setupListeners() {
        binding.btnAddParcel.setOnClickListener(){
            addParcel()
        }
    }

    private fun addParcel(){

    }
}