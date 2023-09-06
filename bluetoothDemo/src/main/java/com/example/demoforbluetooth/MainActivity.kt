package com.example.demoforbluetooth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.demoforkotlin.R
import kotlinx.android.synthetic.main.activity_main.btn1

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1.setOnClickListener{
            val p = Person("",1)

        }
    }
}