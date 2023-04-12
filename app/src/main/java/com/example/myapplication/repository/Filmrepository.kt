package com.example.myapplication.repository

import com.example.myapplication.R
import com.example.myapplication.models.Filmmodel

class Filmrepository {
    private val filmlList = mutableListOf<Filmmodel>()


    fun getListOfData() : MutableList<Filmmodel>{

        filmlList.add(
            Filmmodel(
                R.drawable.onepice,
                "One piece",
                "The best"
            ))
        filmlList.add(
            Filmmodel(
                R.drawable.img_3,
                "Howls moving castle",
                "Mysterious world"
            ))
        filmlList.add(
            Filmmodel(
                R.drawable.img,
                "Spirited away",
                "The girl who wants to save her parents"
            ))
        filmlList.add(
            Filmmodel(
                R.drawable.img_1,
                "Naruto",
                "The way of Hokage"
            ))
        filmlList.add(
            Filmmodel(
                R.drawable.img_2,
                "MHA",
                "Plus ultra"
            ))



        return filmlList
    }
}