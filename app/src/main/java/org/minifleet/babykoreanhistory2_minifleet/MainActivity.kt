package org.minifleet.babykoreanhistory2_minifleet

import android.content.Intent
import android.database.sqlite.SQLiteOpenHelper
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import org.minifleet.babykoreanhistory2_minifleet.databinding.ActivityMainBinding
import org.minifleet.babykoreanhistory2_minifleet.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val model: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        binding.lifecycleOwner = this
        binding.mainViewModel = model

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