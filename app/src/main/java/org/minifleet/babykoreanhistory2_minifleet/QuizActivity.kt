package org.minifleet.babykoreanhistory2_minifleet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.minifleet.babykoreanhistory2_minifleet.databinding.ActivityQuizBinding

class QuizActivity : AppCompatActivity() {

    lateinit var binding: ActivityQuizBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTitleUnAe.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.btnMainActivity.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }

}