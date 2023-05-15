package com.example.tictactoe

import android.app.Dialog
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.dialog_box.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var p1 = intent.getStringExtra("player1")
        var p2 = intent.getStringExtra("player2")

        txt_p1.text = p1
        txt_p2.text = p2


        btn_restart.setOnClickListener{
            Restart()
            txt_score_1.text = "Score : 0"
            txt_score_2.text = "Score : 0"
        }

    }

    var count = 0
    var flag = 0
    var score_1 = 0
    var score_2 = 0




    fun Draw(view: View) {

        var btn_current = view as Button

        var dialog = Dialog(this@MainActivity)
        dialog.setContentView(R.layout.dialog_box)
        dialog.setCancelable(false)

        if(btn_current.text == ""){

            if(flag == 0){
                btn_current.text = "X"
                btn_current.setTextColor(Color.RED)
                count++
                flag = 1
                txt_turn_2.text = "Your Turn"
                txt_turn_1.text = ""
            }
            else{
                btn_current.text = "O"
                btn_current.setTextColor(Color.parseColor("#008EFF"))
                count++
                flag = 0
                txt_turn_1.text = "Your Turn"
                txt_turn_2.text = ""
            }

            val txt_1 = btn_1.text
            val txt_2 = btn_2.text
            val txt_3 = btn_3.text
            val txt_4 = btn_4.text
            val txt_5 = btn_5.text
            val txt_6 = btn_6.text
            val txt_7 = btn_7.text
            val txt_8 = btn_8.text
            val txt_9 = btn_9.text


            if(txt_1 == txt_2 && txt_2 == txt_3 && txt_3 != ""){

                if(txt_1 == "X"){
                    score_1++
                    txt_score_1.text = "Score : $score_1"
                    dialog.txt_winner.text = txt_p1.text
                }
                else{
                    score_2++
                    txt_score_2.text = "Score : $score_2"
                    dialog.txt_winner.text = txt_p2.text
                }

                dialog.show()

            }

            else if(txt_4 == txt_5 && txt_5 == txt_6 && txt_6 != ""){

                if(txt_4 == "X"){
                    score_1++
                    txt_score_1.text = "Score : $score_1"
                    dialog.txt_winner.text = txt_p1.text
                }
                else{
                    score_2++
                    txt_score_2.text = "Score : $score_2"
                    dialog.txt_winner.text = txt_p2.text
                }

                dialog.show()

            }

            else if(txt_7 == txt_8 && txt_8 == txt_9 && txt_9 != ""){

                if(txt_7 == "X"){
                    score_1++
                    txt_score_1.text = "Score : $score_1"
                    dialog.txt_winner.text = txt_p1.text
                }
                else{
                    score_2++
                    txt_score_2.text = "Score : $score_2"
                    dialog.txt_winner.text = txt_p2.text
                }

                dialog.show()

            }

            else if(txt_1 == txt_4 && txt_4 == txt_7 && txt_7 != ""){

                if(txt_1 == "X"){
                    score_1++
                    txt_score_1.text = "Score : $score_1"
                    dialog.txt_winner.text = txt_p1.text
                }
                else{
                    score_2++
                    txt_score_2.text = "Score : $score_2"
                    dialog.txt_winner.text = txt_p2.text
                }

                dialog.show()

            }

            else if(txt_2 == txt_5 && txt_5 == txt_8 && txt_8 != ""){

                if(txt_2 == "X"){
                    score_1++
                    txt_score_1.text = "Score : $score_1"
                    dialog.txt_winner.text = txt_p1.text
                }
                else{
                    score_2++
                    txt_score_2.text = "Score : $score_2"
                    dialog.txt_winner.text = txt_p2.text
                }

                dialog.show()

            }

            else if(txt_3 == txt_6 && txt_6 == txt_9 && txt_9 != ""){

                if(txt_3 == "X"){
                    score_1++
                    txt_score_1.text = "Score : $score_1"
                    dialog.txt_winner.text = txt_p1.text
                }
                else{
                    score_2++
                    txt_score_2.text = "Score : $score_2"
                    dialog.txt_winner.text = txt_p2.text
                }

                dialog.show()

            }

            else if(txt_1 == txt_5 && txt_5 == txt_9 && txt_9 != ""){

                if(txt_1 == "X"){
                    score_1++
                    txt_score_1.text = "Score : $score_1"
                    dialog.txt_winner.text = txt_p1.text
                }
                else{
                    score_2++
                    txt_score_2.text = "Score : $score_2"
                    dialog.txt_winner.text = txt_p2.text
                }

                dialog.show()

            }

            else if(txt_3 == txt_5 && txt_5 == txt_7 && txt_7 != ""){

                if(txt_3 == "X"){
                    score_1++
                    txt_score_1.text = "Score : $score_1"
                    dialog.txt_winner.text = txt_p1.text
                }
                else{
                    score_2++
                    txt_score_2.text = "Score : $score_2"
                    dialog.txt_winner.text = txt_p2.text
                }

                dialog.show()

            }

            else if(count == 9){

                dialog.txt_t_winner.text = "No Winner"
                dialog.txt_winner.text = "Match Drawn"
                dialog.show()

            }

        }

        dialog.btn_newgame.setOnClickListener{
            Restart()
            dialog.dismiss()
        }

    }



    // Restart and new game function

    fun Restart(){

        btn_1.text = ""
        btn_2.text = ""
        btn_3.text = ""
        btn_4.text = ""
        btn_5.text = ""
        btn_6.text = ""
        btn_7.text = ""
        btn_8.text = ""
        btn_9.text = ""

        txt_turn_1.text = "Your Turn"
        txt_turn_2.text = ""

        count = 0
        flag = 0


    }

}