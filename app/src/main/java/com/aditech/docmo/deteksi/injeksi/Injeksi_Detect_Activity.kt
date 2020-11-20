package com.aditech.docmo.deteksi.injeksi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AlertDialog
import com.aditech.docmo.R
import com.aditech.docmo.deteksi.karbu.DetektifHasilKarbuActivity
import com.aditech.docmo.home.HomeActivity
import com.aditech.docmo.home.detektif.DetectFragment
import kotlinx.android.synthetic.main.activity_injeksi_detect_.*
import kotlinx.android.synthetic.main.activity_karburator_detect_.*
import kotlinx.android.synthetic.main.activity_karburator_detect_.autoCompleteTextView10
import kotlinx.android.synthetic.main.activity_karburator_detect_.autoCompleteTextView11
import kotlinx.android.synthetic.main.activity_karburator_detect_.autoCompleteTextView12
import kotlinx.android.synthetic.main.activity_karburator_detect_.autoCompleteTextView13
import kotlinx.android.synthetic.main.activity_karburator_detect_.autoCompleteTextView14
import kotlinx.android.synthetic.main.activity_karburator_detect_.autoCompleteTextView2
import kotlinx.android.synthetic.main.activity_karburator_detect_.autoCompleteTextView3
import kotlinx.android.synthetic.main.activity_karburator_detect_.autoCompleteTextView4
import kotlinx.android.synthetic.main.activity_karburator_detect_.autoCompleteTextView5
import kotlinx.android.synthetic.main.activity_karburator_detect_.autoCompleteTextView6
import kotlinx.android.synthetic.main.activity_karburator_detect_.autoCompleteTextView7
import kotlinx.android.synthetic.main.activity_karburator_detect_.autoCompleteTextView8
import kotlinx.android.synthetic.main.activity_karburator_detect_.autoCompleteTextView9
import kotlinx.android.synthetic.main.activity_karburator_detect_.btn_deteksi
import kotlinx.android.synthetic.main.activity_karburator_detect_.checkBox
import kotlinx.android.synthetic.main.activity_karburator_detect_.checkBox10
import kotlinx.android.synthetic.main.activity_karburator_detect_.checkBox11
import kotlinx.android.synthetic.main.activity_karburator_detect_.checkBox12
import kotlinx.android.synthetic.main.activity_karburator_detect_.checkBox13
import kotlinx.android.synthetic.main.activity_karburator_detect_.checkBox2
import kotlinx.android.synthetic.main.activity_karburator_detect_.checkBox3
import kotlinx.android.synthetic.main.activity_karburator_detect_.checkBox4
import kotlinx.android.synthetic.main.activity_karburator_detect_.checkBox5
import kotlinx.android.synthetic.main.activity_karburator_detect_.checkBox6
import kotlinx.android.synthetic.main.activity_karburator_detect_.checkBox7
import kotlinx.android.synthetic.main.activity_karburator_detect_.checkBox8
import kotlinx.android.synthetic.main.activity_karburator_detect_.checkBox9
import kotlinx.android.synthetic.main.activity_karburator_detect_.autoCompleteTextView as autoCompleteTextView

class Injeksi_Detect_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_injeksi_detect_)

        iv_btn_back2.setOnClickListener{
            val intent1 = Intent(this@Injeksi_Detect_Activity, HomeActivity::class.java)
            startActivity(intent1)
        }

        var btnProses = btn_deteksi
        var GIN1 = checkBox
        var GIN2 = checkBox2
        var GIN3 = checkBox3
        var GIN4 = checkBox4
        var GIN5 = checkBox5
        var GIN6 = checkBox6
        var GIN7 = checkBox7
        var GIN8 = checkBox8
        var GIN9 = checkBox9
        var GIN10 = checkBox10
        var GIN11 = checkBox11
        var GIN12 = checkBox12
        var GIN13 = checkBox13
        var GIN14 = checkBox19
        var GIN15 = checkBox15
        var GIN16 = checkBox16
        var GIN17 = checkBox17


        var txtNilaiGejala1 = autoCompleteTextView
        var txtNilaiGejala2 = autoCompleteTextView2
        var txtNilaiGejala3 = autoCompleteTextView3
        var txtNilaiGejala4 = autoCompleteTextView4
        var txtNilaiGejala5 = autoCompleteTextView5
        var txtNilaiGejala6 = autoCompleteTextView6
        var txtNilaiGejala7 = autoCompleteTextView7
        var txtNilaiGejala8 = autoCompleteTextView8
        var txtNilaiGejala9 = autoCompleteTextView9
        var txtNilaiGejala10 = autoCompleteTextView10
        var txtNilaiGejala11 = autoCompleteTextView11
        var txtNilaiGejala12 = autoCompleteTextView12
        var txtNilaiGejala13 = autoCompleteTextView13
        var txtNilaiGejala14 = autoCompleteTextView14
        var txtNilaiGejala15 = autoCompleteTextView15
        var txtNilaiGejala16 = autoCompleteTextView16
        var txtNilaiGejala17 = autoCompleteTextView17

        var nilaiKeyakinanGejala1 = arrayOf("", "0", "0.2", "0.4", "0.6", "0.8", "1")
        var nilaiKeyakinanGejala2 = arrayOf("", "0", "0.2", "0.4", "0.6", "0.8", "1")
        var nilaiKeyakinanGejala3 = arrayOf("", "0", "0.2", "0.4", "0.6", "0.8", "1")
        var nilaiKeyakinanGejala4 = arrayOf("", "0", "0.2", "0.4", "0.6", "0.8", "1")
        var nilaiKeyakinanGejala5 = arrayOf("", "0", "0.2", "0.4", "0.6", "0.8", "1")
        var nilaiKeyakinanGejala6 = arrayOf("", "0", "0.2", "0.4", "0.6", "0.8", "1")
        var nilaiKeyakinanGejala7 = arrayOf("", "0", "0.2", "0.4", "0.6", "0.8", "1")
        var nilaiKeyakinanGejala8 = arrayOf("", "0", "0.2", "0.4", "0.6", "0.8", "1")
        var nilaiKeyakinanGejala9 = arrayOf("", "0", "0.2", "0.4", "0.6", "0.8", "1")
        var nilaiKeyakinanGejala10 = arrayOf("", "0", "0.2", "0.4", "0.6", "0.8", "1")
        var nilaiKeyakinanGejala11 = arrayOf("", "0", "0.2", "0.4", "0.6", "0.8", "1")
        var nilaiKeyakinanGejala12 = arrayOf("", "0", "0.2", "0.4", "0.6", "0.8", "1")
        var nilaiKeyakinanGejala13 = arrayOf("", "0", "0.2", "0.4", "0.6", "0.8", "1")
        var nilaiKeyakinanGejala14 = arrayOf("", "0", "0.2", "0.4", "0.6", "0.8", "1")
        var nilaiKeyakinanGejala15 = arrayOf("", "0", "0.2", "0.4", "0.6", "0.8", "1")
        var nilaiKeyakinanGejala16 = arrayOf("", "0", "0.2", "0.4", "0.6", "0.8", "1")
        var nilaiKeyakinanGejala17 = arrayOf("", "0", "0.2", "0.4", "0.6", "0.8", "1")

        GIN1.setText("Distater listrik tidak bisa")
        GIN2.setText("Klakson tidak bunyi")
        GIN3.setText("Reating dan lampu tidak bekerja")
        GIN4.setText("Kelistrikan mati")
        GIN5.setText("Distater manual sulit")
        GIN6.setText("Suara knalpot sering meletus-meletus")
        GIN7.setText("Tarikan berat")
        GIN8.setText("Keluar asap kehitaman pada knalpot")
        GIN9.setText("Mesin mudah panas")
        GIN10.setText("Bahan bakar boros")
        GIN11.setText("Suara mesin kasar")
        GIN12.setText("Kecepatan tidak optimal")
        GIN13.setText("Kampas kopling lambat")
        GIN14.setText("Lari mrebet-mrebet")
        GIN15.setText("Motor mati (tidak bisa hidup sama sekali)")
        GIN16.setText("Tanda mesin di spedometer nyala terus/kedap-kedip")
        GIN17.setText("Tanda mesin di spedometer nyala terus/kedap-kedip")


        val adapterGejala1 =
            ArrayAdapter(this, android.R.layout.select_dialog_item, nilaiKeyakinanGejala1)
        txtNilaiGejala1.threshold = 1
        txtNilaiGejala1.setAdapter(adapterGejala1)

        val adapterGejala2 =
            ArrayAdapter(this, android.R.layout.select_dialog_item, nilaiKeyakinanGejala2)
        txtNilaiGejala2.threshold = 1
        txtNilaiGejala2.setAdapter(adapterGejala2)

        val adapterGejala3 =
            ArrayAdapter(this, android.R.layout.select_dialog_item, nilaiKeyakinanGejala3)
        txtNilaiGejala3.threshold = 1
        txtNilaiGejala3.setAdapter(adapterGejala3)

        val adapterGejala4 =
            ArrayAdapter(this, android.R.layout.select_dialog_item, nilaiKeyakinanGejala4)
        txtNilaiGejala4.threshold = 1
        txtNilaiGejala4.setAdapter(adapterGejala4)

        val adapterGejala5 =
            ArrayAdapter(this, android.R.layout.select_dialog_item, nilaiKeyakinanGejala5)
        txtNilaiGejala5.threshold = 1
        txtNilaiGejala5.setAdapter(adapterGejala5)

        val adapterGejala6 =
            ArrayAdapter(this, android.R.layout.select_dialog_item, nilaiKeyakinanGejala6)
        txtNilaiGejala6.threshold = 1
        txtNilaiGejala6.setAdapter(adapterGejala6)

        val adapterGejala7 =
            ArrayAdapter(this, android.R.layout.select_dialog_item, nilaiKeyakinanGejala7)
        txtNilaiGejala7.threshold = 1
        txtNilaiGejala7.setAdapter(adapterGejala7)

        val adapterGejala8 =
            ArrayAdapter(this, android.R.layout.select_dialog_item, nilaiKeyakinanGejala8)
        txtNilaiGejala8.threshold = 1
        txtNilaiGejala8.setAdapter(adapterGejala8)

        val adapterGejala9 =
            ArrayAdapter(this, android.R.layout.select_dialog_item, nilaiKeyakinanGejala9)
        txtNilaiGejala9.threshold = 1
        txtNilaiGejala9.setAdapter(adapterGejala9)

        val adapterGejala10 =
            ArrayAdapter(this, android.R.layout.select_dialog_item, nilaiKeyakinanGejala10)
        txtNilaiGejala10.threshold = 1
        txtNilaiGejala10.setAdapter(adapterGejala10)

        val adapterGejala11 =
            ArrayAdapter(this, android.R.layout.select_dialog_item, nilaiKeyakinanGejala11)
        txtNilaiGejala11.threshold = 1
        txtNilaiGejala11.setAdapter(adapterGejala11)

        val adapterGejala12 =
            ArrayAdapter(this, android.R.layout.select_dialog_item, nilaiKeyakinanGejala12)
        txtNilaiGejala12.threshold = 1
        txtNilaiGejala12.setAdapter(adapterGejala12)

        val adapterGejala13 =
            ArrayAdapter(this, android.R.layout.select_dialog_item, nilaiKeyakinanGejala13)
        txtNilaiGejala13.threshold = 1
        txtNilaiGejala13.setAdapter(adapterGejala13)

        val adapterGejala14 =
            ArrayAdapter(this, android.R.layout.select_dialog_item, nilaiKeyakinanGejala14)
        txtNilaiGejala14.threshold = 1
        txtNilaiGejala14.setAdapter(adapterGejala14)

        val adapterGejala15 =
            ArrayAdapter(this, android.R.layout.select_dialog_item, nilaiKeyakinanGejala15)
        txtNilaiGejala15.threshold = 1
        txtNilaiGejala15.setAdapter(adapterGejala15)

        val adapterGejala16 =
            ArrayAdapter(this, android.R.layout.select_dialog_item, nilaiKeyakinanGejala16)
        txtNilaiGejala16.threshold = 1
        txtNilaiGejala16.setAdapter(adapterGejala16)

        val adapterGejala17 =
            ArrayAdapter(this, android.R.layout.select_dialog_item, nilaiKeyakinanGejala17)
        txtNilaiGejala17.threshold = 1
        txtNilaiGejala17.setAdapter(adapterGejala17)


        txtNilaiGejala1.setOnClickListener {
            AlertDialog.Builder(this@Injeksi_Detect_Activity)
                .setTitle("Pilihlah Nilai Gejala 1").setAdapter(adapterGejala1
                ) { dialog, which ->
                    txtNilaiGejala1.setText(nilaiKeyakinanGejala1[which])
                    dialog.dismiss()
                }.create().show()
        }

        txtNilaiGejala2.setOnClickListener {
            AlertDialog.Builder(this@Injeksi_Detect_Activity)
                .setTitle("Pilihlah Nilai Gejala 2").setAdapter(adapterGejala2
                ) { dialog, which ->
                    txtNilaiGejala2.setText(nilaiKeyakinanGejala2[which])
                    dialog.dismiss()
                }.create().show()
        }

        txtNilaiGejala3.setOnClickListener {
            AlertDialog.Builder(this@Injeksi_Detect_Activity)
                .setTitle("Pilihlah Nilai Gejala 3").setAdapter(adapterGejala3
                ) { dialog, which ->
                    txtNilaiGejala3.setText(nilaiKeyakinanGejala3[which])
                    dialog.dismiss()
                }.create().show()
        }

        txtNilaiGejala4.setOnClickListener {
            AlertDialog.Builder(this@Injeksi_Detect_Activity)
                .setTitle("Pilihlah Nilai Gejala 4").setAdapter(adapterGejala4
                ) { dialog, which ->
                    txtNilaiGejala4.setText(nilaiKeyakinanGejala4[which])
                    dialog.dismiss()
                }.create().show()
        }

        txtNilaiGejala5.setOnClickListener {
            AlertDialog.Builder(this@Injeksi_Detect_Activity)
                .setTitle("Pilihlah Nilai Gejala 5").setAdapter(adapterGejala5
                ) { dialog, which ->
                    txtNilaiGejala5.setText(nilaiKeyakinanGejala5[which])
                    dialog.dismiss()
                }.create().show()
        }

        txtNilaiGejala6.setOnClickListener {
            AlertDialog.Builder(this@Injeksi_Detect_Activity)
                .setTitle("Pilihlah Nilai Gejala 6").setAdapter(adapterGejala6
                ) { dialog, which ->
                    txtNilaiGejala6.setText(nilaiKeyakinanGejala6[which])
                    dialog.dismiss()
                }.create().show()
        }

        txtNilaiGejala7.setOnClickListener {
            AlertDialog.Builder(this@Injeksi_Detect_Activity)
                .setTitle("Pilihlah Nilai Gejala 7").setAdapter(adapterGejala6
                ) { dialog, which ->
                    txtNilaiGejala7.setText(nilaiKeyakinanGejala7[which])
                    dialog.dismiss()
                }.create().show()
        }

        txtNilaiGejala8.setOnClickListener {
            AlertDialog.Builder(this@Injeksi_Detect_Activity)
                .setTitle("Pilihlah Nilai Gejala 8").setAdapter(adapterGejala8
                ) { dialog, which ->
                    txtNilaiGejala8.setText(nilaiKeyakinanGejala8[which])
                    dialog.dismiss()
                }.create().show()
        }

        txtNilaiGejala9.setOnClickListener {
            AlertDialog.Builder(this@Injeksi_Detect_Activity)
                .setTitle("Pilihlah Nilai Gejala 9").setAdapter(adapterGejala9
                ) { dialog, which ->
                    txtNilaiGejala9.setText(nilaiKeyakinanGejala9[which])
                    dialog.dismiss()
                }.create().show()
        }

        txtNilaiGejala10.setOnClickListener {
            AlertDialog.Builder(this@Injeksi_Detect_Activity)
                .setTitle("Pilihlah Nilai Gejala 10").setAdapter(adapterGejala10
                ) { dialog, which ->
                    txtNilaiGejala10.setText(nilaiKeyakinanGejala10[which])
                    dialog.dismiss()
                }.create().show()
        }

        txtNilaiGejala11.setOnClickListener {
            AlertDialog.Builder(this@Injeksi_Detect_Activity)
                .setTitle("Pilihlah Nilai Gejala 11").setAdapter(adapterGejala11
                ) { dialog, which ->
                    txtNilaiGejala11.setText(nilaiKeyakinanGejala11[which])
                    dialog.dismiss()
                }.create().show()
        }

        txtNilaiGejala12.setOnClickListener {
            AlertDialog.Builder(this@Injeksi_Detect_Activity)
                .setTitle("Pilihlah Nilai Gejala 12").setAdapter(adapterGejala12
                ) { dialog, which ->
                    txtNilaiGejala12.setText(nilaiKeyakinanGejala12[which])
                    dialog.dismiss()
                }.create().show()
        }

        txtNilaiGejala13.setOnClickListener {
            AlertDialog.Builder(this@Injeksi_Detect_Activity)
                .setTitle("Pilihlah Nilai Gejala 13").setAdapter(adapterGejala13
                ) { dialog, which ->
                    txtNilaiGejala13.setText(nilaiKeyakinanGejala13[which])
                    dialog.dismiss()
                }.create().show()
        }

        txtNilaiGejala14.setOnClickListener {
            AlertDialog.Builder(this@Injeksi_Detect_Activity)
                .setTitle("Pilihlah Nilai Gejala 14").setAdapter(adapterGejala14
                ) { dialog, which ->
                    txtNilaiGejala14.setText(nilaiKeyakinanGejala14[which])
                    dialog.dismiss()
                }.create().show()
        }

        txtNilaiGejala15.setOnClickListener {
            AlertDialog.Builder(this@Injeksi_Detect_Activity)
                .setTitle("Pilihlah Nilai Gejala 15").setAdapter(adapterGejala15
                ) { dialog, which ->
                    txtNilaiGejala15.setText(nilaiKeyakinanGejala15[which])
                    dialog.dismiss()
                }.create().show()
        }

        txtNilaiGejala16.setOnClickListener {
            AlertDialog.Builder(this@Injeksi_Detect_Activity)
                .setTitle("Pilihlah Nilai Gejala 16").setAdapter(adapterGejala16
                ) { dialog, which ->
                    txtNilaiGejala16.setText(nilaiKeyakinanGejala16[which])
                    dialog.dismiss()
                }.create().show()
        }

        txtNilaiGejala17.setOnClickListener {
            AlertDialog.Builder(this@Injeksi_Detect_Activity)
                .setTitle("Pilihlah Nilai Gejala 17").setAdapter(adapterGejala17
                ) { dialog, which ->
                    txtNilaiGejala17.setText(nilaiKeyakinanGejala17[which])
                    dialog.dismiss()
                }.create().show()
        }



        btnProses.setOnClickListener {

            var NamaKerusakan = ""
            var PersentaseKerusakan = ""

            // AND && dan OR ||

            // GEJALA 1
            if (GIN1.isChecked && GIN2.isChecked && GIN3.isChecked && GIN4.isChecked) {

                //  Nilai dari PAKAR
                val nilaiGejala1 = 0.8
                val nilaiGejala2 = 0.8
                val nilaiGejala3 = 0.8
                val nilaiGejala4 = 0.8

                // Nilai Inputan dari USER
                val doubleGejala1 = txtNilaiGejala1.text.toString().toDouble()
                val doubleGejala2 = txtNilaiGejala2.text.toString().toDouble()
                val doubleGejala3 = txtNilaiGejala3.text.toString().toDouble()
                val doubleGejala4 = txtNilaiGejala4.text.toString().toDouble()

                val hasilHitunganGejala1 = nilaiGejala1 * doubleGejala1
                val hasilHitunganGejala2 = nilaiGejala2 * doubleGejala2
                val hasilHitunganGejala3 = nilaiGejala3 * doubleGejala3
                val hasilHitunganGejala4 = nilaiGejala4 * doubleGejala4

                val Combine_CF1_CF2 = hasilHitunganGejala1 + hasilHitunganGejala2 * (1 - hasilHitunganGejala1)
                val Combine_CFold_CF3 = Combine_CF1_CF2 + hasilHitunganGejala3 * (1 - Combine_CF1_CF2)
                val Combine_CFold_CF4 = Combine_CFold_CF3 + hasilHitunganGejala4 * (1 - Combine_CFold_CF3)
                val hasilHitungGejala1 = Math.floor(Combine_CFold_CF4 * 100).toString()

                NamaKerusakan += "ACCU\n"
                PersentaseKerusakan += hasilHitungGejala1+"%\n"
            }

            // GEJALA 2
            if (GIN5.isChecked && GIN6.isChecked && GIN7.isChecked && GIN8.isChecked) {

                //  Nilai dari PAKAR
                val nilaiGejala5 = 0.8
                val nilaiGejala6 = 0.8
                val nilaiGejala7 = 0.2
                val nilaiGejala8 = 0.4

                // Nilai Inputan dari USER
                val doubleGejala5 = txtNilaiGejala5.text.toString().toDouble()
                val doubleGejala6 = txtNilaiGejala6.text.toString().toDouble()
                val doubleGejala7 = txtNilaiGejala7.text.toString().toDouble()
                val doubleGejala8 = txtNilaiGejala8.text.toString().toDouble()

                val hasilHitunganGejala5 = nilaiGejala5 * doubleGejala5
                val hasilHitunganGejala6 = nilaiGejala6 * doubleGejala6
                val hasilHitunganGejala7 = nilaiGejala7 * doubleGejala7
                val hasilHitunganGejala8 = nilaiGejala8 * doubleGejala8

                val Combine_CF5_CF6 = hasilHitunganGejala5 + hasilHitunganGejala6 * (1 - hasilHitunganGejala5)
                val Combine_CFold_CF7 = Combine_CF5_CF6 + hasilHitunganGejala7 * (1 - Combine_CF5_CF6)
                val Combine_CFold_CF8 = Combine_CFold_CF7 + hasilHitunganGejala8 * (1 - Combine_CFold_CF7)
                val hasilHitungGejala2 = Math.floor(Combine_CFold_CF8 * 100).toString()

                NamaKerusakan += "Busi\n"
                PersentaseKerusakan += hasilHitungGejala2+"%\n"
            }

            // GEJALA 3
            if (GIN7.isChecked && GIN9.isChecked && GIN11.isChecked) {

                //  Nilai dari PAKAR
                val nilaiGejala7 = 0.8
                val nilaiGejala9 = 0.8
                val nilaiGejala11 = 0.2

                // Nilai Inputan dari USER
                val doubleGejala7 = txtNilaiGejala7.text.toString().toDouble()
                val doubleGejala9 = txtNilaiGejala9.text.toString().toDouble()
                val doubleGejala11 = txtNilaiGejala11.text.toString().toDouble()

                val hasilHitunganGejala7 = nilaiGejala7 * doubleGejala7
                val hasilHitunganGejala9 = nilaiGejala9 * doubleGejala9
                val hasilHitunganGejala11 = nilaiGejala11 * doubleGejala11

                val Combine_CF7_CF9 = hasilHitunganGejala7 + hasilHitunganGejala9 * (1 - hasilHitunganGejala7)
                val Combine_CFold_CF11 = Combine_CF7_CF9 + hasilHitunganGejala11 * (1 - Combine_CF7_CF9)
                val hasilHitungGejala3 = Math.floor(Combine_CFold_CF11 * 100).toString()

                NamaKerusakan += "Celah klep\n"
                PersentaseKerusakan += hasilHitungGejala3+"%\n"
            }

            // GEJALA 4
            if (GIN1.isChecked && GIN5.isChecked && GIN7.isChecked && GIN10.isChecked) {

                //  Nilai dari PAKAR
                val nilaiGejala1 = 0.8
                val nilaiGejala5 = 0.8
                val nilaiGejala7 = 0.2
                val nilaiGejala10 = 0.6

                // Nilai Inputan dari USER
                val doubleGejala1 = txtNilaiGejala1.text.toString().toDouble()
                val doubleGejala5 = txtNilaiGejala5.text.toString().toDouble()
                val doubleGejala7 = txtNilaiGejala7.text.toString().toDouble()
                val doubleGejala10 = txtNilaiGejala10.text.toString().toDouble()

                val hasilHitunganGejala1 = nilaiGejala1 * doubleGejala1
                val hasilHitunganGejala5 = nilaiGejala5 * doubleGejala5
                val hasilHitunganGejala7 = nilaiGejala7 * doubleGejala7
                val hasilHitunganGejala10 = nilaiGejala10 * doubleGejala10

                val Combine_CF1_CF5 = hasilHitunganGejala1 + hasilHitunganGejala5 * (1 - hasilHitunganGejala1)
                val Combine_CFold_CF7 = Combine_CF1_CF5 + hasilHitunganGejala7 * (1 - Combine_CF1_CF5)
                val Combine_CFold_CF10 = Combine_CFold_CF7 + hasilHitunganGejala10 * (1 - Combine_CFold_CF7)
                val hasilHitungGejala4 = Math.floor(Combine_CFold_CF10 * 100).toString()

                NamaKerusakan += "Injector\n"
                PersentaseKerusakan += hasilHitungGejala4+"%\n"
            }

            // GEJALA 5
            if (GIN5.isChecked && GIN7.isChecked && GIN11.isChecked && GIN12.isChecked) {

                //  Nilai dari PAKAR
                val nilaiGejala5 = 0.2
                val nilaiGejala7 = 0.8
                val nilaiGejala11 = 0.4
                val nilaiGejala12 = 0.6

                // Nilai Inputan dari USER
                val doubleGejala5 = txtNilaiGejala5.text.toString().toDouble()
                val doubleGejala7 = txtNilaiGejala7.text.toString().toDouble()
                val doubleGejala11 = txtNilaiGejala11.text.toString().toDouble()
                val doubleGejala12 = txtNilaiGejala12.text.toString().toDouble()

                val hasilHitunganGejala5 = nilaiGejala5 * doubleGejala5
                val hasilHitunganGejala7 = nilaiGejala7 * doubleGejala7
                val hasilHitunganGejala11 = nilaiGejala11 * doubleGejala11
                val hasilHitunganGejala12 = nilaiGejala12 * doubleGejala12

                val Combine_CF5_CF7 = hasilHitunganGejala5 + hasilHitunganGejala7 * (1 - hasilHitunganGejala5)
                val Combine_CFold_CF11 = Combine_CF5_CF7 + hasilHitunganGejala11 * (1 - Combine_CF5_CF7)
                val Combine_CFold_CF12 = Combine_CFold_CF11 + hasilHitunganGejala12 * (1 - Combine_CFold_CF11)
                val hasilHitungGejala5 = Math.floor(Combine_CFold_CF12 * 100).toString()

                NamaKerusakan += "Roller\n"
                PersentaseKerusakan += hasilHitungGejala5+"%\n"
            }

            // GEJALA 6
            if (GIN7.isChecked && GIN11.isChecked && GIN13.isChecked) {

                //  Nilai dari PAKAR
                val nilaiGejala7 = 0.8
                val nilaiGejala11 = 0.8
                val nilaiGejala13 = 0.8

                // Nilai Inputan dari USER
                val doubleGejala7 = txtNilaiGejala7.text.toString().toDouble()
                val doubleGejala11 = txtNilaiGejala11.text.toString().toDouble()
                val doubleGejala13 = txtNilaiGejala13.text.toString().toDouble()

                val hasilHitunganGejala7 = nilaiGejala7 * doubleGejala7
                val hasilHitunganGejala11 = nilaiGejala11 * doubleGejala11
                val hasilHitunganGejala13 = nilaiGejala13 * doubleGejala13

                val Combine_CF7_CF11 = hasilHitunganGejala7 + hasilHitunganGejala11 * (1 - hasilHitunganGejala7)
                val Combine_CFold_CF13 = Combine_CF7_CF11 + hasilHitunganGejala13 * (1 - Combine_CF7_CF11)
                val hasilHitungGejala6 = Math.floor(Combine_CFold_CF13 * 100).toString()

                NamaKerusakan += "CVT\n"
                PersentaseKerusakan += hasilHitungGejala6+"%\n"
            }

            // GEJALA 7
            if (GIN4.isChecked && GIN14.isChecked && GIN15.isChecked && GIN16.isChecked) {

                //  Nilai dari PAKAR
                val nilaiGejala4 = 0.8
                val nilaiGejala14 = 0.6
                val nilaiGejala15 = 0.2
                val nilaiGejala16 = 0.8

                // Nilai Inputan dari USER
                val doubleGejala4 = txtNilaiGejala4.text.toString().toDouble()
                val doubleGejala14 = txtNilaiGejala14.text.toString().toDouble()
                val doubleGejala15 = txtNilaiGejala15.text.toString().toDouble()
                val doubleGejala16 = txtNilaiGejala16.text.toString().toDouble()

                val hasilHitunganGejala4 = nilaiGejala4 * doubleGejala4
                val hasilHitunganGejala14 = nilaiGejala14 * doubleGejala14
                val hasilHitunganGejala15 = nilaiGejala15 * doubleGejala15
                val hasilHitunganGejala16 = nilaiGejala16 * doubleGejala16

                val Combine_CF4_CF14 = hasilHitunganGejala4 + hasilHitunganGejala14 * (1 - hasilHitunganGejala4)
                val Combine_CFold_CF15 = Combine_CF4_CF14 + hasilHitunganGejala15 * (1 - Combine_CF4_CF14)
                val Combine_CFold_CF16 = Combine_CFold_CF15 + hasilHitunganGejala16 * (1 - Combine_CFold_CF15)
                val hasilHitungGejala7 = Math.floor(Combine_CFold_CF16 * 100).toString()

                NamaKerusakan += "ECM/ECU\n"
                PersentaseKerusakan += hasilHitungGejala7+"%\n"
            }

            // GEJALA 8
            if (GIN9.isChecked && GIN17.isChecked) {

                //  Nilai dari PAKAR
                val nilaiGejala9 = 0.8
                val nilaiGejala17 = 0.8

                // Nilai Inputan dari USER
                val doubleGejala9 = txtNilaiGejala9.text.toString().toDouble()
                val doubleGejala17 = txtNilaiGejala17.text.toString().toDouble()

                val hasilHitunganGejala9 = nilaiGejala9 * doubleGejala9
                val hasilHitunganGejala17 = nilaiGejala17 * doubleGejala17

                val Combine_CF9_CF17 = hasilHitunganGejala9 + hasilHitunganGejala17 * (1 - hasilHitunganGejala9)
                val hasilHitungGejala8 = Math.floor(Combine_CF9_CF17 * 100).toString()

                NamaKerusakan += "Radiator\n"
                PersentaseKerusakan += hasilHitungGejala8+"%\n"
            }

            var goDetect = Intent(this@Injeksi_Detect_Activity, DetektifHasilInjeksiActivity::class.java)
            goDetect.putExtra("namakerusakan", NamaKerusakan)
            goDetect.putExtra("persentasekerusakan", PersentaseKerusakan)
            startActivity(goDetect)
        }

    }
}