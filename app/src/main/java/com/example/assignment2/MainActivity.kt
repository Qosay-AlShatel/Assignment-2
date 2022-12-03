package com.example.assignment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bt : Button = findViewById(R.id.predictBT)

        bt.setOnClickListener()
        {
            var dialogFragment = Predictions()

            dialogFragment.show(supportFragmentManager, "Custom Dialog")
        }

    }

    fun receivePrediction(name : String)
    {
        val tv : TextView = findViewById(R.id.tv1)
        tv.text = name
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val f1 = Qualified()
        val f2 = Matches()
        when (item.itemId) {
            R.id.item1 -> supportFragmentManager.beginTransaction().apply {
                replace(R.id.FLfragment, f1)
                commit()
            }

            R.id.item2 -> supportFragmentManager.beginTransaction().apply {
                replace(R.id.FLfragment, f2)
                commit()
            }
        }

        return super.onOptionsItemSelected(item)
    }
}