package com.luthfi.sanggar

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inisialisasi menu berdasarkan ID dari layout XML
        val menuJadwal = findViewById<LinearLayout>(R.id.menuJadwal)
        val menuSpp = findViewById<LinearLayout>(R.id.menuSpp)
        val menuEvaluasi = findViewById<LinearLayout>(R.id.menuEvaluasi)
        val menuEvent = findViewById<LinearLayout>(R.id.menuEvent)

        // Listener untuk menu Jadwal
        menuJadwal.setOnClickListener {
            val intent = Intent(this, JadwalActivity::class.java)
            startActivity(intent)
        }

        // Listener untuk menu SPP
        menuSpp.setOnClickListener {
            val intent = Intent(this, SppActivity::class.java)
            startActivity(intent)
        }

        // Listener untuk menu Evaluasi
        menuEvaluasi.setOnClickListener {
            val intent = Intent(this, EvaluasiActivity::class.java)
            startActivity(intent)
        }

        // Listener untuk menu Event
        menuEvent.setOnClickListener {
            val intent = Intent(this, EventActivity::class.java)
            startActivity(intent)
        }
    }
}
