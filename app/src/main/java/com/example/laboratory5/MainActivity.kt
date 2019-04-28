package com.example.laboratory5

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var tittles = arrayListOf<String>()
    private var cants = arrayListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tittles.add("Apples")
        cants.add("0")

        tittles.add("Oranges")
        cants.add("0")

        var recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        var adapter = RecyclerViewAdapter(tittles,cants,this)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}
