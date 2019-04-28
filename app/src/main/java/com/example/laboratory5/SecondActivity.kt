package com.example.laboratory5

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        val insertButton = findViewById<Button>(R.id.commentButton)
        insertButton.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("Tittle", findViewById<EditText>(R.id.editText).text)
            startActivity(intent)
        }
    }

}
