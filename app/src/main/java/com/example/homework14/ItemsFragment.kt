package com.example.homework14

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.homework13.BaseFragment
import com.example.homework14.databinding.FragmentItemsBinding

class ItemsFragment : BaseFragment<FragmentItemsBinding>(FragmentItemsBinding::inflate) {
    override fun setup() {
        binding.tvBase.text = "Zdarovaaaaaaaaaa"

    }
}