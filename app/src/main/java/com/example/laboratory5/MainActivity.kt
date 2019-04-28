package com.example.laboratory5

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {

    var tittle: String = "Apples"

    private var tittles = arrayListOf<String>()
    private var cants = arrayListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (intent.getStringExtra("Tittle") != null) {
            tittle = intent.getStringExtra("Tittle")
            println(tittle)

            tittles.add(tittle)
            cants.add("0")
        }

        tittles.add("Apples")
        cants.add("0")

        tittles.add("Oranges")
        cants.add("0")

        var recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        var adapter = RecyclerViewAdapter(tittles,cants,this)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        if (item != null) {
            if (item.itemId == R.id.item1){
                val intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)
            }
            else if (item.itemId == R.id.item2){
                this.tittles.clear()
                this.cants.clear()
            }
        }


        return super.onOptionsItemSelected(item)
    }


}
