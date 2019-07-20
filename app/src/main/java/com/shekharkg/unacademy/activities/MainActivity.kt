package com.shekharkg.unacademy.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.shekharkg.unacademy.R
import com.shekharkg.unacademy.adapters.ImageAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val urls = Array<String>(5) {
            when (it) {
                0 -> ""
                1 -> ""
                2 -> ""
                3 -> ""
                4 -> ""
                else -> ""
            }
        }


        recyclerView.adapter = ImageAdapter(this, urls)
    }
}
