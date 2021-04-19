package com.sedra.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val items = listOf(
                "https://mir-s3-cdn-cf.behance.net/project_modules/max_1200/b4628d42915793.57dc399830145.jpg",
                "https://i.pinimg.com/originals/9e/a2/21/9ea22153e26c339100f14380ea04af86.jpg",
                "https://mir-s3-cdn-cf.behance.net/project_modules/max_1200/b4628d42915793.57dc399830145.jpg",
                "https://i.pinimg.com/originals/9e/a2/21/9ea22153e26c339100f14380ea04af86.jpg",
                "https://mir-s3-cdn-cf.behance.net/project_modules/max_1200/b4628d42915793.57dc399830145.jpg",
                "https://mir-s3-cdn-cf.behance.net/project_modules/max_1200/b4628d42915793.57dc399830145.jpg",
                "https://i.pinimg.com/originals/9e/a2/21/9ea22153e26c339100f14380ea04af86.jpg",
                "https://mir-s3-cdn-cf.behance.net/project_modules/max_1200/b4628d42915793.57dc399830145.jpg",
                "https://i.pinimg.com/originals/9e/a2/21/9ea22153e26c339100f14380ea04af86.jpg",

                )
        val rv = findViewById<RecyclerView>(R.id.rv)
        val adapter = ObliqueAdapter(items)
        rv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rv.setHasFixedSize(false)
        rv.adapter = adapter
    }
}