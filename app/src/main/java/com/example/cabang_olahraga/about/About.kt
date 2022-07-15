package com.example.cabang_olahraga.about

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.cabang_olahraga.R

class About : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_about)
        supportActionBar?.title = "About Me"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}