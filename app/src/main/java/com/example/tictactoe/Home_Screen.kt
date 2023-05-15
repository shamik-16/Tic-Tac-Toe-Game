package com.example.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_home_screen.*

class Home_Screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)

        btn_startgame.setOnClickListener{

            if(ed_1.text.toString() == ""){
                Toast.makeText(this@Home_Screen,"Player one name is empty",Toast.LENGTH_LONG).show()
            }
            else if(ed_1.text.length > 8){
                Toast.makeText(this@Home_Screen,"Player one name is too long",Toast.LENGTH_LONG).show()
            }
            else if(ed_2.text.toString() == ""){
                Toast.makeText(this@Home_Screen,"Player two name is empty",Toast.LENGTH_LONG).show()
            }
            else if(ed_2.text.length > 8){
                Toast.makeText(this@Home_Screen,"Player two name is too long",Toast.LENGTH_LONG).show()
            }
            else {
                val intent = Intent(this@Home_Screen, MainActivity::class.java)
                intent.putExtra("player1", ed_1.text.toString())
                intent.putExtra("player2", ed_2.text.toString())
                startActivity(intent)
            }
        }

    }
}