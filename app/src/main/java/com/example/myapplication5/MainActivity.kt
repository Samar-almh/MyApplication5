package com.example.myapplication5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        t_button.setOnClickListener{
       val toast=Toast.makeText(
            this,
           R.string.correct_mas,
            Toast.LENGTH_LONG)
                toast.setGravity(Gravity.TOP,0,0)
            toast.show()
}

        f_button.setOnClickListener{
            val toast=Toast.makeText(
            this,
                R.string.incorrect_mas,
                Toast.LENGTH_LONG)
                    toast.setGravity(Gravity.TOP,0,0)
                toast.show()
        }


    }
}