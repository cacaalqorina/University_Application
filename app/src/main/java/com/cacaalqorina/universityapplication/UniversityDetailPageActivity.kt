package com.cacaalqorina.universityapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide

class UniversityDetailPageActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_UNIVERSITY = "extra_university"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_university_detail_page)

        supportActionBar?.title = "Details"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val university = intent.getParcelableExtra<University>(EXTRA_UNIVERSITY) as University

        val ivCover : ImageView = findViewById(R.id.iv_detailCover)
        val tvName : TextView = findViewById(R.id.tv_detailTitle)
        val tvAccreditation : TextView = findViewById(R.id.tv_detailAccreditation)
        val tvAddress: TextView = findViewById(R.id.tv_detailAddress)
        val tvScience: TextView = findViewById(R.id.tv_detailSince)
        val tvSynopsis: TextView = findViewById(R.id.tv_detailSynopsis)

        Glide.with(this)
            .load(university.cover)
            .into(ivCover)

        tvName.text = university.name
        tvAccreditation.text = university.accreditation
        tvAddress.text = university.address
        tvScience.text = university.standingYear.toString()
        tvSynopsis.text = university.synopsis
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.action_share, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.action_share -> {
                Toast.makeText(this, "Tautan Dibagikan", Toast.LENGTH_SHORT).show()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}