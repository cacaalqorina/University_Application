package com.cacaalqorina.universityapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvUniversity: RecyclerView
    private var list: ArrayList<University> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = "University List"

        rvUniversity = findViewById(R.id.rv_list_university)
        rvUniversity.setHasFixedSize(true)

        list.addAll(UniversityData.UniversityListData)
        showRecyclerView()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.action_aboutme, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.action_about -> {
                val  moveIntent = Intent(this, AboutPageActivity::class.java)
                startActivity(moveIntent)
            }
        }

        return super.onOptionsItemSelected(item)
    }

    private fun showRecyclerView(){
        rvUniversity.layoutManager = LinearLayoutManager(this)
        val cardViewAdapter = CardViewUniversityAdapter(list)
        rvUniversity.adapter = cardViewAdapter
    }
}