package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lifecycle.addObserver(observer())

        Log.d("MAIN", "Activity OnCreatre")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MAIN", "Activity onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MAIN","Activity on Pause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MAIN", "Activity on Destroy")
    }
}