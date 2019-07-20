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

        val urls = Array(10) {
            when (it) {
                0 -> "https://homepages.cae.wisc.edu/~ece533/images/airplane.png"
                1 -> "https://homepages.cae.wisc.edu/~ece533/images/arctichare.png"
                2 -> "https://homepages.cae.wisc.edu/~ece533/images/baboon.png"
                3 -> "https://homepages.cae.wisc.edu/~ece533/images/barbara.png"
                4 -> "https://homepages.cae.wisc.edu/~ece533/images/boat.png"
                else -> "https://homepages.cae.wisc.edu/~ece533/images/cat.png"
            }
        }


        recyclerView.adapter = ImageAdapter(this, urls)
    }
}
