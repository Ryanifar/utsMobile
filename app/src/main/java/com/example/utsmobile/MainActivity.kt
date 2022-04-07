package com.example.utsmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.utsmobile.adapter.ItemAdapter
import com.example.utsmobile.data.dataMobil

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = dataMobil.myData
        val recyclerView = findViewById<RecyclerView>(R.id.rvList)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ItemAdapter(this,data)
        recyclerView.setHasFixedSize(true)

    }
}