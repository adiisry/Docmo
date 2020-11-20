package com.aditech.docmo.home

import android.app.FragmentManager
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.FragmentTransaction
import com.aditech.docmo.R
import com.aditech.docmo.sign.signin.SignInActivity
import com.aditech.docmo.utils.Preferences
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.google.firebase.database.DatabaseReference
import kotlinx.android.synthetic.main.fragment_setting.*
import kotlinx.android.synthetic.main.fragment_setting.tv_nama

/**
 * A simple [Fragment] subclass.
 * Use the [SettingFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SettingFragment : Fragment() {

    private lateinit var preferences: Preferences


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_setting, container, false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        preferences = Preferences(activity!!.applicationContext)

        tv_nama.setText(preferences.getValues("nama"))
        tv_email.setText(preferences.getValues("email"))
        tv_username.setText(preferences.getValues("username"))
        tv_role2.setText(preferences.getValues("role"))

        Glide.with(this)
            .load(preferences.getValues("url"))
            .apply(RequestOptions.circleCropTransform())
            .into(iv_profil2)

        btn_keluar.setOnClickListener {

            preferences.clear()
            Toast.makeText(context, "Keluar", Toast.LENGTH_LONG).show()

            val intent = Intent(context, SignInActivity::class.java)
            startActivity(intent)
        }
    }
}