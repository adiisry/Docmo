package com.aditech.docmo.deteksi.karbu

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aditech.docmo.R
import com.aditech.docmo.home.HomeActivity
import com.aditech.docmo.home.dashboard.DashboardFragment
import com.aditech.docmo.home.detektif.DetectFragment
import kotlinx.android.synthetic.main.activity_detektif_hasil_karbu.*


class DetektifHasilKarbuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detektif_hasil_karbu)

        iv_btn_back.setOnClickListener{
            val intent1 = Intent(this@DetektifHasilKarbuActivity, Karburator_Detect_Activity::class.java)
            startActivity(intent1)
        }

        iv_btn_again.setOnClickListener{
            val intent2 = Intent(this@DetektifHasilKarbuActivity, Karburator_Detect_Activity::class.java)
            startActivity(intent2)
        }

        iv_btn_home.setOnClickListener{
            val intent3 = Intent(this@DetektifHasilKarbuActivity, HomeActivity::class.java)
            startActivity(intent3)
        }

        var intent = intent
        var namakerusakan = intent.getStringExtra("namakerusakan")
        var kerusakan = intent.getStringExtra("persentasekerusakan")

        var persentasetv = tv_persentase
        var kerusakantv = tv_kerusakan

        persentasetv.setText (kerusakan)
        kerusakantv.setText (namakerusakan)


    }
}