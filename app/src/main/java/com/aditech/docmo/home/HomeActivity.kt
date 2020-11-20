package com.aditech.docmo.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.aditech.docmo.R
import com.aditech.docmo.home.dashboard.DashboardFragment
import com.aditech.docmo.home.detektif.DetectFragment
import com.aditech.docmo.home.SettingFragment
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val fragmentHome = DashboardFragment()
        val fragmentDetect = DetectFragment()
        val fragmentSetting = SettingFragment()

        setFragment(fragmentHome)

        iv_menu1.setOnClickListener {
            setFragment(fragmentHome)

            changeIcon(iv_menu1, R.drawable.home_active)
            changeIcon(iv_menu2, R.drawable.detect_inactive)
            changeIcon(iv_menu3, R.drawable.person_inactive)
        }

        iv_menu2.setOnClickListener {
            setFragment(fragmentDetect)

            changeIcon(iv_menu1, R.drawable.home_inactive)
            changeIcon(iv_menu2, R.drawable.detect_active)
            changeIcon(iv_menu3, R.drawable.person_inactive)
        }

        iv_menu3.setOnClickListener {
            setFragment(fragmentSetting)

            changeIcon(iv_menu1, R.drawable.home_inactive)
            changeIcon(iv_menu2, R.drawable.detect_inactive)
            changeIcon(iv_menu3, R.drawable.person_active)
        }
    }

    private fun setFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmenTransaction = fragmentManager.beginTransaction()
        fragmenTransaction.replace(R.id.layout_frame, fragment)
        fragmenTransaction.commit()
    }

    
    private fun changeIcon(imageView: ImageView, int: Int) {
        imageView.setImageResource(int)
    }
}