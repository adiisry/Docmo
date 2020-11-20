package com.aditech.docmo.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aditech.docmo.R
import com.aditech.docmo.sign.signin.SignInActivity
import kotlinx.android.synthetic.main.activity_onboarding_one.*

class OnboardingTwoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_onboarding_two)

        btn_lanjut.setOnClickListener{
            var intent = Intent(this@OnboardingTwoActivity, OnboardingThreeActivity::class.java)
            startActivity(intent)
        }
        btn_lewati.setOnClickListener{
            var intent = Intent(this@OnboardingTwoActivity, SignInActivity::class.java)
            startActivity(intent)
        }
    }
}
