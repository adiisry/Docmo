package com.aditech.docmo.home.detektif

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.aditech.docmo.deteksi.injeksi.Injeksi_Detect_Activity
import com.aditech.docmo.deteksi.karbu.Karburator_Detect_Activity
import com.aditech.docmo.R
import kotlinx.android.synthetic.main.fragment_detect.*


/**
 * A simple [Fragment] subclass.
 * Use the [DetectFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DetectFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detect, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        btn_karbu.setOnClickListener {
            var intent = Intent(this@DetectFragment.context, Karburator_Detect_Activity::class.java)
            startActivity(intent)
        }

        btn_injeksi.setOnClickListener {
            var intent = Intent(this@DetectFragment.context, Injeksi_Detect_Activity::class.java)
            startActivity(intent)
        }

    }
}