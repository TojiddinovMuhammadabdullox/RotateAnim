package com.example.mdan11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import com.example.mdan11.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        binding.alphabtn.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.alpha_anim)
            binding.imageView.startAnimation(animation)
        }
        binding.rotateBtn.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.rotate_anim)
            binding.imageView.startAnimation(animation)
        }
    }
}