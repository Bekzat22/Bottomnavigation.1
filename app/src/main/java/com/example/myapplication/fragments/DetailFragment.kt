package com.example.myapplication.fragments

import android.os.Bundle
import android.telecom.Call.Details
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentAnimalsBinding
import com.example.myapplication.databinding.FragmentDetailBinding
import com.example.myapplication.databinding.FragmentFilmBinding
import com.example.myapplication.models.Filmmodel
import com.example.myapplication.fragments.DetailFragment as DetailFragment1

class DetailFragment : Fragment(R.layout.fragment_detail)  {

    private lateinit var binding :FragmentDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentDetailBinding.inflate(inflater,container,false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val args: DetailFragmentArgs by navArgs()
        binding.descriptionTextView.text= args.data.detail

    }

}

