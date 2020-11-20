package com.aditech.docmo.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aditech.docmo.R
import com.aditech.docmo.model.Tips
import com.bumptech.glide.Glide
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    private lateinit var mDatabase : DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        iv_btn_back.setOnClickListener{
            var intent = Intent(this@DetailActivity, HomeActivity::class.java)
            startActivity(intent)
        }

        val data = intent.getParcelableExtra<Tips>("data")

        mDatabase = FirebaseDatabase.getInstance().getReference("Tips")
            .child(data.judul.toString())

        tv_judul.text = data.judul
        tv_desc.text = data.desc

        Glide.with(this)
            .load(data.poster)
            .into(iv_poster)
    }
}