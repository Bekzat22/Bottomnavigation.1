package com.example.myapplication.repository

import com.example.myapplication.models.Filmmodel

class TextRepository {
    private val textlList = mutableListOf<Filmmodel>()


    fun getListOfData() : MutableList<Filmmodel>{

        textlList.add(
            Filmmodel(
                1,
                "The best",
                "The best"
            )
        )
        textlList.add(
            Filmmodel(
                1,
                "The best",
                "The best"
            )
        )
        textlList.add(
            Filmmodel(
               1,
                "The best",
                "The best"
            )
        )
        textlList.add(
            Filmmodel(
                1,
                "The best",
                "The best"
            )
        )
        textlList.add(
            Filmmodel(
              1,
                "The best",
                "The best"
            )
        )



        return textlList
    }
}