package com.example.biggernumber

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        playGame()
    }
    fun playGame(){
        var winPoint = 0
        var losePoint = 0
        //Left Button Clicked
        btnLeft.setOnClickListener {
            val leftNum = btnLeft.text.toString().toInt()
            val rightNum = btnRight.text.toString().toInt()



            if(leftNum > rightNum ){
                //Change of background color
                gameInterface.setBackgroundColor(Color.GREEN)
                Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show()
                winPoint++
                win_point.text = winPoint.toString()
            }
            else{
                Toast.makeText(this, "Wrong Answer", Toast.LENGTH_SHORT).show()
                //Change of background color
                gameInterface.setBackgroundColor(Color.RED)
                losePoint++
                lose_point.text = losePoint.toString()
            }
            reStart()
        }
        //Right Button Clicked
        btnRight.setOnClickListener {
            val leftNum = btnLeft.text.toString().toInt()
            val rightNum = btnRight.text.toString().toInt()
            if(leftNum < rightNum ){
                //Change of background color
                gameInterface.setBackgroundColor(Color.GREEN)
                Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show()
                winPoint++
                win_point.text = winPoint.toString()
            }
            else{
                Toast.makeText(this, "Wrong Answer", Toast.LENGTH_SHORT).show()
                //Change of background color
                gameInterface.setBackgroundColor(Color.RED)
                losePoint++
                lose_point.text = losePoint.toString()
            }
            reStart()
        }
    }
    fun reStart(){
        val randomValue1 = Random.nextInt(1,10)
        val randomValue2 = Random.nextInt(1,10)
        btnLeft.text = randomValue1.toString()
        btnRight.text = randomValue2.toString()
    }

}