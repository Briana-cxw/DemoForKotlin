package com.example.demoforbluetooth

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("BaseActivity", javaClass.simpleName)
        BaseActivity::class.java
    }
}