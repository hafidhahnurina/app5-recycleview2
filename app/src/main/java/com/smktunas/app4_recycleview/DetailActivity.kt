package com.smktunas.app4_recycleview

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val judul = intent.getStringExtra("judul")
        val penulis = intent.getStringExtra("penulis")
        val tahun = intent.getStringExtra("tahun")

        findViewById<TextView>(R.id.tvJudul).text = judul
        findViewById<TextView>(R.id.tvPenulis).text = penulis
        findViewById<TextView>(R.id.tvTahun).text = tahun

        val btnKembali = findViewById<Button>(R.id.btKembali)
        btnKembali.setOnClickListener {
            finish()
        }
    }
}
