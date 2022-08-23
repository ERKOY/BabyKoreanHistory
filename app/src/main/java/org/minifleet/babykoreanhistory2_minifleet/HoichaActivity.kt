package org.minifleet.babykoreanhistory2_minifleet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.minifleet.babykoreanhistory2_minifleet.databinding.ActivityHoichaBinding

class HoichaActivity : AppCompatActivity() {
    lateinit var binding: ActivityHoichaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHoichaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTitleUnAe.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.hoicha51.setOnClickListener {
            val intent = Intent(this, QuizActivity::class.java)
            startActivity(intent)
        }

    }
}