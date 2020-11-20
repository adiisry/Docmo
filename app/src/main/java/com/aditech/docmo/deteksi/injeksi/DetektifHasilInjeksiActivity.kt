package com.aditech.docmo.deteksi.injeksi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aditech.docmo.R
import com.aditech.docmo.home.HomeActivity
import com.aditech.docmo.home.dashboard.DashboardFragment
import com.aditech.docmo.home.detektif.DetectFragment
import kotlinx.android.synthetic.main.activity_detektif_hasil_injeksi.*
import kotlinx.android.synthetic.main.activity_detektif_hasil_karbu.tv_kerusakan
import kotlinx.android.synthetic.main.activity_detektif_hasil_karbu.tv_persentase
import kotlinx.android.synthetic.main.activity_detektif_hasil_karbu.iv_btn_back as iv_btn_back1

class DetektifHasilInjeksiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detektif_hasil_injeksi)

        iv_btn_back.setOnClickListener{
            val intent1 = Intent(this@DetektifHasilInjeksiActivity, Injeksi_Detect_Activity::class.java)
            startActivity(intent1)
        }

        iv_btn_again1.setOnClickListener{
            val intent2 = Intent(this@DetektifHasilInjeksiActivity, Injeksi_Detect_Activity::class.java)
            startActivity(intent2)
        }

        iv_btn_home1.setOnClickListener{
            val intent3 = Intent(this@DetektifHasilInjeksiActivity, HomeActivity::class.java)
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