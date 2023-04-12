package com.example.myapplication.fragments

import FilmAdapter
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentFilmBinding
import com.example.myapplication.models.Filmmodel
import com.example.myapplication.repository.Filmrepository


class FilmFragment : Fragment() {

     private lateinit var binding: FragmentFilmBinding
     private var repository = Filmrepository()
    private var FilmAdapter = FilmAdapter(repository.getListOfData(),this::OnItemClick)
    private fun OnItemClick( data : Filmmodel){
        findNavController().navigate(FilmFragmentDirections.actionFilmFragmentToDetailFragment(data))

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFilmBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recyclerFilm.layoutManager = LinearLayoutManager(context)
        binding.recyclerFilm.adapter= FilmAdapter
    }


    }