package com.example.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_splash_screen.*

class Splash_Screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val move_1 = AnimationUtils.loadAnimation(this@Splash_Screen,R.anim.splash_1)
            splash_logo.startAnimation(move_1)

        val move_2 = AnimationUtils.loadAnimation(this@Splash_Screen,R.anim.splash_2)
        splash_txt.startAnimation(move_2)

        val move_3 = AnimationUtils.loadAnimation(this@Splash_Screen,R.anim.splash_3)
        splash_btn.startAnimation(move_3)

        splash_btn.setOnClickListener{
            val intent = Intent(this@Splash_Screen,Home_Screen::class.java)
            startActivity(intent)
            finish()
        }


    }
}