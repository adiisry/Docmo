package com.aditech.docmo.sign.signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.aditech.docmo.R
import com.aditech.docmo.sign.signin.User
import com.aditech.docmo.utils.Preferences
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity() {

    lateinit var sNama:String
    lateinit var sEmail:String
    lateinit var sUsername:String
    lateinit var sPassword:String
    lateinit var sRole:String

    private lateinit var mDatabaseReference: DatabaseReference
    private lateinit var mFirebaseInstance : FirebaseDatabase
    private lateinit var mDatabase:DatabaseReference
    private lateinit var preferences: Preferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        mFirebaseInstance = FirebaseDatabase.getInstance()
        mDatabase = FirebaseDatabase.getInstance().getReference()
        mDatabaseReference = mFirebaseInstance.getReference("User")

        preferences = Preferences(this)

        btn_lanjutkan.setOnClickListener{

            sNama = et_nama.text.toString()
            sEmail = et_email.text.toString()
            sUsername = et_username.text.toString()
            sPassword = et_password.text.toString()
            sRole = et_role.text.toString()

            if (sNama.equals("")){
                et_nama.error = "Silahkan isi nama Anda"
                et_nama.requestFocus()
            } else if (sEmail.equals("")){
                et_email.error = "Silahkan isi email Anda"
                et_email.requestFocus()
            } else if (sUsername.equals("")){
                et_username.error = "Silahkan isi username Anda"
                et_username.requestFocus()
            } else if (sPassword.equals("")){
                et_password.error = "Silahkan isi password Anda"
                et_password.requestFocus()
            } else if (sRole.equals("")){
                et_role.error = "Silahkan isi role Anda"
                et_role.requestFocus()
            } else {
                saveUsername (sNama, sEmail, sUsername, sPassword, sRole)
            }
        }
    }

    private fun saveUsername(sNama: String, sEmail: String, sUsername: String, sPassword: String, sRole: String) {
        val user = User()
        user.nama = sNama
        user.email = sEmail
        user.username = sUsername
        user.password = sPassword
        user.role = sRole

        if (sUsername != null){
            checkingUsername(sUsername, user)
        }
    }

    private fun checkingUsername(iUsername: String, data: User) {
        mDatabaseReference.child(iUsername).addValueEventListener(object : ValueEventListener{
            override fun onCancelled(databaseError: DatabaseError) {
                Toast.makeText(this@SignUpActivity, "User sudah digunakan"+databaseError.message, Toast.LENGTH_LONG).show()
            }

            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val user = dataSnapshot.getValue(User::class.java)
                if (user == null) {
                    mDatabaseReference.child(iUsername).setValue(data)

                    preferences.setValues("nama", data.nama.toString())
                    preferences.setValues("email", data.email.toString())
                    preferences.setValues("username", data.username.toString())
                    preferences.setValues("password", data.password.toString())
                    preferences.setValues("role", data.role.toString())
                    preferences.setValues("url", "")
                    preferences.setValues("status", "1")

                    val intent = Intent(this@SignUpActivity,
                        SignUpPhotoscreenActivity::class.java).putExtra("data", data)
                    startActivity(intent)
                } else {
                    Toast.makeText(this@SignUpActivity, "", Toast.LENGTH_LONG).show()
                }
            }

        })
    }
}
