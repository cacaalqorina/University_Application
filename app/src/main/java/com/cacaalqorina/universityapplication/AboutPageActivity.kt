package com.cacaalqorina.universityapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AboutPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_page)

        supportActionBar?.title = "About Me"
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)
    }

}