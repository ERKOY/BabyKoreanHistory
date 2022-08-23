package org.minifleet.babykoreanhistory2_minifleet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.minifleet.babykoreanhistory2_minifleet.databinding.ActivityDanwonBinding

class DanwonActivity : AppCompatActivity() {
    lateinit var binding: ActivityDanwonBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDanwonBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTitleUnAe.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.danwon1.setOnClickListener {
            val intent = Intent(this, QuizActivity::class.java)
            startActivity(intent)
        }
        binding.danwon2.setOnClickListener {
            val intent = Intent(this, QuizActivity::class.java)
            startActivity(intent)
        }
    }
}