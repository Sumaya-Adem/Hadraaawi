package com.example.hadraawipeom.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.hadraawipeom.R

class DetailsActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val title = intent.getStringExtra("title")
        val content = intent.getStringExtra("content")

        findViewById<TextView>(R.id.titleText).text = title
        findViewById<TextView>(R.id.contentText).text = content
    }
}