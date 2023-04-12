package com.example.myapplication.fragments

import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.R
import com.example.myapplication.adapters.TextAdapter
import com.example.myapplication.databinding.FragmentTextBinding
import com.example.myapplication.repository.Filmrepository
import com.example.myapplication.repository.TextRepository


class TextFragment : Fragment() {
   private lateinit var binding: FragmentTextBinding
    private var repository = TextRepository()
    private var Adapter = TextAdapter(repository.getListOfData())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       binding=FragmentTextBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recyclerText
        binding.recyclerText.layoutManager = LinearLayoutManager(context)
        binding.recyclerText.adapter= Adapter
    }


}