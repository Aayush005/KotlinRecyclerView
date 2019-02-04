package com.sekreative.kotlinrecyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout

/**
 * Created by Aayush on 02/05/2019
 */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val rvRecyclerView = findViewById<RecyclerView>(R.id.sample_recyclerView)

        rvRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        var adapter = CustomAdapter(this, Helper.Companion.getVersionsList())
        rvRecyclerView.adapter = adapter
    }
}
