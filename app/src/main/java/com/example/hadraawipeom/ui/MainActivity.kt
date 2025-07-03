package com.example.hadraawipeom.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.hadraawi.adapter.PoemAdapter
import com.example.hadraawi.data.Poem
import com.example.hadraawipeom.R

class MainActivity : AppCompatActivity() {

    private val poems = listOf(
        Poem("Hadraawi","Jacayl", "Jacayl waa dareen qalbi taabanaya",R.color.light_orange_1),
        Poem("Hadraawi","Geesinimo", "Geesinimo waa hibo qofka u gaar ah",R.color.light_orange_1),
        Poem("Hadraawi","Dhib iyo Dheef", "Dhibka kadib dheef baa imaaneysa", R.color.light_orange_1)
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val adapter = PoemAdapter(poems) { selectedPoem ->
            val intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra("title", selectedPoem.title)
            intent.putExtra("content", selectedPoem.content)
            startActivity(intent)
        }

        recyclerView.adapter = adapter
    }
}