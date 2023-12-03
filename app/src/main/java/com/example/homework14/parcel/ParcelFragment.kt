package com.example.homework14.parcel

import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.homework14.BaseFragment
import com.example.homework14.databinding.FragmentParcelsBinding
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import kotlin.random.Random

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
    }

    override fun setupListeners() {
        binding.btnAddParcel.setOnClickListener(){
            viewModel.addParcel()
        }
    }

    override fun bindData() {
        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED){
                viewModel.parcelFlow.collect{
                    adapter.submitList(it)
                }
            }
        }
    }
}