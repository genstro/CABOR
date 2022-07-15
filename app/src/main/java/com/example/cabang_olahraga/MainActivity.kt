package com.example.cabang_olahraga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cabang_olahraga.about.About
import com.example.cabang_olahraga.sport.SportAdapter
import com.example.cabang_olahraga.sport.SportData
import com.example.submission2.sport.Sport

class MainActivity : AppCompatActivity() {
    private lateinit var rvSport: RecyclerView
    private var list: ArrayList<Sport> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionbar = supportActionBar
        actionbar!!.title= "Cabang Olahraga"

        rvSport = findViewById(R.id.rv_sports)
        rvSport.setHasFixedSize(true)

        list.addAll(SportData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvSport.layoutManager = LinearLayoutManager(this)
        val sportAdapter = SportAdapter(list)
        rvSport.adapter = sportAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.about -> {
                val iAbout = Intent(this@MainActivity, About::class.java)
                startActivity(iAbout)
            }
        }
    }
}