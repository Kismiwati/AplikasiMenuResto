package com.kismiwati.aplikasimenu_resto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.kismiwati.aplikasimenu_resto.adapter.ItemAdapter
import com.kismiwati.aplikasimenu_resto.data.Datasource

class MinumanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_minuman)

        //digunakan untuk menginisialisasi data
        val myDataset = Datasource().loadMinum()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view1)
        recyclerView.adapter = ItemAdapter(this, myDataset)

        recyclerView.setHasFixedSize(true)
    }
}