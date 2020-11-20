package com.aditech.docmo.sign.signin

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.aditech.docmo.home.HomeActivity
import com.aditech.docmo.R
import com.aditech.docmo.sign.signup.SignUpActivity
import com.aditech.docmo.utils.Preferences
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_sign_in.*


class SignInActivity : AppCompatActivity() {

    lateinit var iUsername: String
    lateinit var iPassword: String
    lateinit var nDatabase: DatabaseReference
    lateinit var preference: Preferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        nDatabase = FirebaseDatabase.getInstance().getReference("User")
        preference = Preferences(this)

        preference.setValues("onboarding", "1")
        if (preference.getValues("status").equals("1")) {
            finishAffinity()

            val intent = Intent(this@SignInActivity,
                HomeActivity::class.java)
            startActivity(intent)
        }

        btn_login.setOnClickListener {
            iUsername = et_username.text.toString()
            iPassword = et_password.text.toString()

            if (iUsername.equals("")) {
                et_username.error = "Silahkan masukkan username"
                et_username.requestFocus()
            } else if (iPassword.equals("")) {
                et_password.error = "Silahkan masukkan username"
                et_password.requestFocus()
            } else {

                var statusUsername = iUsername.indexOf(".")
                if (statusUsername >= 0) {
                    et_username.error = "Silahkan tulis Username Anda tanpa ."
                    et_username.requestFocus()

                } else {
                    pushLogin(iUsername, iPassword)
                }
            }
        }

        btn_signup.setOnClickListener {
            var goSignup = Intent(this@SignInActivity, SignUpActivity::class.java)
            startActivity(goSignup)
        }
    }

    private fun pushLogin(iUsername: String, iPassword: String) {
        nDatabase.child(iUsername).addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {

                val user = dataSnapshot.getValue(User::class.java)
                if (user == null) {
                    Toast.makeText(
                        this@SignInActivity, "Username tidak ditemukan", Toast.LENGTH_LONG).show()
                } else {
                    if (user.password.equals(iPassword)) {
                        Toast.makeText(this@SignInActivity, "Selamat Datang", Toast.LENGTH_LONG).show()

                        preference.setValues("nama", user.nama.toString())
                        preference.setValues("email", user.email.toString())
                        preference.setValues("username", user.username.toString())
                        preference.setValues("password", user.password.toString())
                        preference.setValues("role", user.role.toString())
                        preference.setValues("url", user.url.toString())
                        preference.setValues("status", "1")

                        finishAffinity()

                        val intent = Intent(this@SignInActivity, HomeActivity::class.java)
                        startActivity(intent)
                    } else {
                        Toast.makeText(
                            this@SignInActivity, "Password Anda salah",
                            Toast.LENGTH_LONG
                        ).show()
                    }

                }
            }

            override fun onCancelled(databaseError: DatabaseError) {
                Toast.makeText(
                    this@SignInActivity, ""+databaseError.message, Toast.LENGTH_LONG).show()
            }

        })
    }
}


