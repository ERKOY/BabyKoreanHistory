package org.minifleet.babykoreanhistory2_minifleet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.minifleet.babykoreanhistory2_minifleet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnDanwon.setOnClickListener {
            val intent = Intent(this, DanwonActivity::class.java)
            startActivity(intent)
        }

        binding.btnHoicha.setOnClickListener {
            val intent = Intent(this, HoichaActivity::class.java)
            startActivity(intent)
        }


    }


}