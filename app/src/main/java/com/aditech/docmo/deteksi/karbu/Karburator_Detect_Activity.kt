package com.aditech.docmo.deteksi.karbu

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.CheckBox
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.aditech.docmo.R
import com.aditech.docmo.home.HomeActivity
import com.aditech.docmo.home.detektif.DetectFragment
import com.aditech.docmo.sign.signup.SignUpActivity
import kotlinx.android.synthetic.main.activity_karburator_detect_.*


class Karburator_Detect_Activity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_karburator_detect_)

        iv_btn_back.setOnClickListener{
            val intent1 = Intent(this@Karburator_Detect_Activity, HomeActivity::class.java)
            startActivity(intent1)
        }


        var btnProses = btn_deteksi
        var GK1 = checkBox
        var GK2 = checkBox2
        var GK3 = checkBox3
        var GK4 = checkBox4
        var GK5 = checkBox5
        var GK6 = checkBox6
        var GK7 = checkBox7
        var GK8 = checkBox8
        var GK9 = checkBox9
        var GK10 = checkBox10
        var GK11 = checkBox11
        var GK12 = checkBox12
        var GK13 = checkBox13
        var GK14 = checkBox14

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

//        chkGejala1.setText("Performa mesin berkurang")
//        chkGejala2.setText("Mesin tidak mau hidup")
//        chkGejala3.setText("Suara berlebihan pada knalpot")
//        chkGejala4.setText("Suara berlebihan pada mesin")
//        chkGejala5.setText("Panas mesin berlebihan")
//        chkGejala6.setText("Oli berkurang")
//        chkGejala7.setText("Bahan bakar boros")
//        chkGejala8.setText("Suara meletus saat gas turun")
//        chkGejala9.setText("Tekanan pada oli kecil")
//        chkGejala10.setText("Starter motor tidak bertenaga")
//        chkGejala11.setText("Kopling sering slip")
//        chkGejala12.setText("Transmisi sering slip saat ganti gigi")
//        chkGejala13.setText("Perseneling susah ganti gigi")
//        chkGejala14.setText("Air radiator cepat berkurang")

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


        txtNilaiGejala1.setOnClickListener {
            AlertDialog.Builder(this@Karburator_Detect_Activity)
                .setTitle("Pilihlah Nilai Gejala 1").setAdapter(adapterGejala1
                ) { dialog, which ->
                    txtNilaiGejala1.setText(nilaiKeyakinanGejala1[which])
                    dialog.dismiss()
                }.create().show()
        }

        txtNilaiGejala2.setOnClickListener {
            AlertDialog.Builder(this@Karburator_Detect_Activity)
                .setTitle("Pilihlah Nilai Gejala 2").setAdapter(adapterGejala2
                ) { dialog, which ->
                    txtNilaiGejala2.setText(nilaiKeyakinanGejala2[which])
                    dialog.dismiss()
                }.create().show()
        }

        txtNilaiGejala3.setOnClickListener {
            AlertDialog.Builder(this@Karburator_Detect_Activity)
                .setTitle("Pilihlah Nilai Gejala 3").setAdapter(adapterGejala3
                ) { dialog, which ->
                    txtNilaiGejala3.setText(nilaiKeyakinanGejala3[which])
                    dialog.dismiss()
                }.create().show()
        }

        txtNilaiGejala4.setOnClickListener {
            AlertDialog.Builder(this@Karburator_Detect_Activity)
                .setTitle("Pilihlah Nilai Gejala 4").setAdapter(adapterGejala4
                ) { dialog, which ->
                    txtNilaiGejala4.setText(nilaiKeyakinanGejala4[which])
                    dialog.dismiss()
                }.create().show()
        }

        txtNilaiGejala5.setOnClickListener {
            AlertDialog.Builder(this@Karburator_Detect_Activity)
                .setTitle("Pilihlah Nilai Gejala 5").setAdapter(adapterGejala5
                ) { dialog, which ->
                    txtNilaiGejala5.setText(nilaiKeyakinanGejala5[which])
                    dialog.dismiss()
                }.create().show()
        }

        txtNilaiGejala6.setOnClickListener {
            AlertDialog.Builder(this@Karburator_Detect_Activity)
                .setTitle("Pilihlah Nilai Gejala 6").setAdapter(adapterGejala6
                ) { dialog, which ->
                    txtNilaiGejala6.setText(nilaiKeyakinanGejala6[which])
                    dialog.dismiss()
                }.create().show()
        }

        txtNilaiGejala7.setOnClickListener {
            AlertDialog.Builder(this@Karburator_Detect_Activity)
                .setTitle("Pilihlah Nilai Gejala 7").setAdapter(adapterGejala7
                ) { dialog, which ->
                    txtNilaiGejala7.setText(nilaiKeyakinanGejala7[which])
                    dialog.dismiss()
                }.create().show()
        }

        txtNilaiGejala8.setOnClickListener {
            AlertDialog.Builder(this@Karburator_Detect_Activity)
                .setTitle("Pilihlah Nilai Gejala 8").setAdapter(adapterGejala8
                ) { dialog, which ->
                    txtNilaiGejala8.setText(nilaiKeyakinanGejala8[which])
                    dialog.dismiss()
                }.create().show()
        }

        txtNilaiGejala9.setOnClickListener {
            AlertDialog.Builder(this@Karburator_Detect_Activity)
                .setTitle("Pilihlah Nilai Gejala 9").setAdapter(adapterGejala9
                ) { dialog, which ->
                    txtNilaiGejala9.setText(nilaiKeyakinanGejala9[which])
                    dialog.dismiss()
                }.create().show()
        }

        txtNilaiGejala10.setOnClickListener {
            AlertDialog.Builder(this@Karburator_Detect_Activity)
                .setTitle("Pilihlah Nilai Gejala 10").setAdapter(adapterGejala10
                ) { dialog, which ->
                    txtNilaiGejala10.setText(nilaiKeyakinanGejala10[which])
                    dialog.dismiss()
                }.create().show()
        }

        txtNilaiGejala11.setOnClickListener {
            AlertDialog.Builder(this@Karburator_Detect_Activity)
                .setTitle("Pilihlah Nilai Gejala 11").setAdapter(adapterGejala11
                ) { dialog, which ->
                    txtNilaiGejala11.setText(nilaiKeyakinanGejala11[which])
                    dialog.dismiss()
                }.create().show()
        }

        txtNilaiGejala12.setOnClickListener {
            AlertDialog.Builder(this@Karburator_Detect_Activity)
                .setTitle("Pilihlah Nilai Gejala 12").setAdapter(adapterGejala12
                ) { dialog, which ->
                    txtNilaiGejala12.setText(nilaiKeyakinanGejala12[which])
                    dialog.dismiss()
                }.create().show()
        }

        txtNilaiGejala13.setOnClickListener {
            AlertDialog.Builder(this@Karburator_Detect_Activity)
                .setTitle("Pilihlah Nilai Gejala 13").setAdapter(adapterGejala13
                ) { dialog, which ->
                    txtNilaiGejala13.setText(nilaiKeyakinanGejala13[which])
                    dialog.dismiss()
                }.create().show()
        }

        txtNilaiGejala14.setOnClickListener {
            AlertDialog.Builder(this@Karburator_Detect_Activity)
                .setTitle("Pilihlah Nilai Gejala 14").setAdapter(adapterGejala14
                ) { dialog, which ->
                    txtNilaiGejala14.setText(nilaiKeyakinanGejala14[which])
                    dialog.dismiss()
                }.create().show()
        }


        btnProses.setOnClickListener {

            var NamaKerusakan = ""
            var PersentaseKerusakan = ""

            // AND && dan OR ||

            // KERUSAKAN 1
            if (GK1.isChecked && GK3.isChecked && GK6.isChecked) {

                //  Nilai dari PAKAR
                val nilaiGejala1 = 0.4
                val nilaiGejala3 = 0.6
                val nilaiGejala6 = 0.2

                // Nilai Inputan dari USER
                val doubleGejala1 = txtNilaiGejala1.text.toString().toDouble()
                val doubleGejala3 = txtNilaiGejala3.text.toString().toDouble()
                val doubleGejala6 = txtNilaiGejala6.text.toString().toDouble()

                val hasilHitunganGejala1 = nilaiGejala1 * doubleGejala1
                val hasilHitunganGejala3 = nilaiGejala3 * doubleGejala3
                val hasilHitunganGejala6 = nilaiGejala6 * doubleGejala6

                val Combine_CF1_CF3 = hasilHitunganGejala1 + hasilHitunganGejala3 * (1 - hasilHitunganGejala1)
                val Combine_CFold_CF6 = Combine_CF1_CF3 + hasilHitunganGejala6 * (1 - Combine_CF1_CF3)
                val hasilHitungGejala1 = Math.floor(Combine_CFold_CF6 * 100).toString()


                NamaKerusakan += "Sistem pembuangan\n"
                PersentaseKerusakan += hasilHitungGejala1+"%\n"
            }

            // KERUSAKAN 2
            if (GK2.isChecked && GK4.isChecked && GK5.isChecked && GK6.isChecked && GK9.isChecked) {

                //  Nilai dari PAKAR
                val nilaiGejala2 = 0.8
                val nilaiGejala4 = 0.8
                val nilaiGejala5 = 0.8
                val nilaiGejala6 = 0.8
                val nilaiGejala9 = 0.4

                // Nilai Inputan dari USER
                val doubleGejala2 = txtNilaiGejala2.text.toString().toDouble()
                val doubleGejala4 = txtNilaiGejala4.text.toString().toDouble()
                val doubleGejala5 = txtNilaiGejala5.text.toString().toDouble()
                val doubleGejala6 = txtNilaiGejala6.text.toString().toDouble()
                val doubleGejala9 = txtNilaiGejala9.text.toString().toDouble()

                val hasilHitunganGejala2 = nilaiGejala2 * doubleGejala2
                val hasilHitunganGejala4 = nilaiGejala4 * doubleGejala4
                val hasilHitunganGejala5 = nilaiGejala5 * doubleGejala5
                val hasilHitunganGejala6 = nilaiGejala6 * doubleGejala6
                val hasilHitunganGejala9 = nilaiGejala9 * doubleGejala9

                val Combine_CF2_CF4 = hasilHitunganGejala2 + hasilHitunganGejala4 * (1 - hasilHitunganGejala2)
                val Combine_CFold_CF5 = Combine_CF2_CF4 + hasilHitunganGejala5 * (1 - Combine_CF2_CF4)
                val Combine_CFold_CF6 = Combine_CFold_CF5 + hasilHitunganGejala6 * (1 - Combine_CFold_CF5)
                val Combine_CFold_CF9 = Combine_CFold_CF6 + hasilHitunganGejala9 * (1 - Combine_CFold_CF6)
                val hasilHitungGejala2 = Math.floor(Combine_CFold_CF9 * 100).toString()

                NamaKerusakan += "Sistem Pelumasan\n"
                PersentaseKerusakan += hasilHitungGejala2+"%\n"
            }

            // KERUSAKAN 3
            if (GK1.isChecked && GK2.isChecked && GK7.isChecked && GK8.isChecked) {

                //  Nilai dari PAKAR
                val nilaiGejala1 = 0.8
                val nilaiGejala2 = 0.2
                val nilaiGejala7 = 0.8
                val nilaiGejala8 = 0.8

                // Nilai Inputan dari USER
                val doubleGejala1 = txtNilaiGejala1.text.toString().toDouble()
                val doubleGejala2 = txtNilaiGejala2.text.toString().toDouble()
                val doubleGejala7 = txtNilaiGejala7.text.toString().toDouble()
                val doubleGejala8 = txtNilaiGejala8.text.toString().toDouble()

                val hasilHitunganGejala1 = nilaiGejala1 * doubleGejala1
                val hasilHitunganGejala2 = nilaiGejala2 * doubleGejala2
                val hasilHitunganGejala7 = nilaiGejala7 * doubleGejala7
                val hasilHitunganGejala8 = nilaiGejala8 * doubleGejala8

                val Combine_CF1_CF2 = hasilHitunganGejala1 + hasilHitunganGejala2 * (1 - hasilHitunganGejala1)
                val Combine_CFold_CF7 = Combine_CF1_CF2 + hasilHitunganGejala7 * (1 - Combine_CF1_CF2)
                val Combine_CFold_CF8 = Combine_CFold_CF7 + hasilHitunganGejala8 * (1 - Combine_CFold_CF7)
                val hasilHitungGejala3 = Math.floor(Combine_CFold_CF8 * 100).toString()

                NamaKerusakan += "Sistem bahan bakar\n"
                PersentaseKerusakan += hasilHitungGejala3+"%\n"
            }

            // KERUSAKAN 4
            if (GK1.isChecked && GK2.isChecked && GK4.isChecked && GK5.isChecked) {

                //  Nilai dari PAKAR
                val nilaiGejala1 = 0.8
                val nilaiGejala2 = 0.2
                val nilaiGejala4 = 0.8
                val nilaiGejala5 = 0.2

                // Nilai Inputan dari USER
                val doubleGejala1 = txtNilaiGejala1.text.toString().toDouble()
                val doubleGejala2 = txtNilaiGejala2.text.toString().toDouble()
                val doubleGejala4 = txtNilaiGejala4.text.toString().toDouble()
                val doubleGejala5 = txtNilaiGejala5.text.toString().toDouble()

                val hasilHitunganGejala1 = nilaiGejala1 * doubleGejala1
                val hasilHitunganGejala2 = nilaiGejala2 * doubleGejala2
                val hasilHitunganGejala4 = nilaiGejala4 * doubleGejala4
                val hasilHitunganGejala5 = nilaiGejala5 * doubleGejala5

                val Combine_CF1_CF2 = hasilHitunganGejala1 + hasilHitunganGejala2 * (1 - hasilHitunganGejala1)
                val Combine_CFold_CF4 = Combine_CF1_CF2 + hasilHitunganGejala4 * (1 - Combine_CF1_CF2)
                val Combine_CFold_CF5 = Combine_CFold_CF4 + hasilHitunganGejala5 * (1 - Combine_CFold_CF4)
                val hasilHitungGejala4 = Math.floor(Combine_CFold_CF5 * 100).toString()

                NamaKerusakan += "Kepala silinder klep-klep\n"
                PersentaseKerusakan += hasilHitungGejala4+"%\n"
            }

            // KERUSAKAN 5
            if (GK1.isChecked && GK2.isChecked && GK4.isChecked && GK5.isChecked) {

                //  Nilai dari PAKAR
                val nilaiGejala1 = 0.8
                val nilaiGejala2 = 0.6
                val nilaiGejala4 = 0.4
                val nilaiGejala5 = 0.4

                // Nilai Inputan dari USER
                val doubleGejala1 = txtNilaiGejala1.text.toString().toDouble()
                val doubleGejala2 = txtNilaiGejala2.text.toString().toDouble()
                val doubleGejala4 = txtNilaiGejala4.text.toString().toDouble()
                val doubleGejala5 = txtNilaiGejala5.text.toString().toDouble()

                val hasilHitunganGejala1 = nilaiGejala1 * doubleGejala1
                val hasilHitunganGejala2 = nilaiGejala2 * doubleGejala2
                val hasilHitunganGejala4 = nilaiGejala4 * doubleGejala4
                val hasilHitunganGejala5 = nilaiGejala5 * doubleGejala5

                val Combine_CF1_CF2 = hasilHitunganGejala1 + hasilHitunganGejala2 * (1 - hasilHitunganGejala1)
                val Combine_CFold_CF4 = Combine_CF1_CF2 + hasilHitunganGejala4 * (1 - Combine_CF1_CF2)
                val Combine_CFold_CF5 = Combine_CFold_CF4 + hasilHitunganGejala5 * (1 - Combine_CFold_CF4)
                val hasilHitungGejala5 = Math.floor(Combine_CFold_CF5 * 100).toString()

                NamaKerusakan += "Piston\n"
                PersentaseKerusakan += hasilHitungGejala5+"%\n"
            }

            // KERUSAKAN 6
            if (GK1.isChecked && GK11.isChecked && GK12.isChecked && GK13.isChecked) {

                //  Nilai dari PAKAR
                val nilaiGejala1 = 0.8
                val nilaiGejala11 = 1.0
                val nilaiGejala12 = 1.0
                val nilaiGejala13 = 1.0

                // Nilai Inputan dari USER
                val doubleGejala1 = txtNilaiGejala1.text.toString().toDouble()
                val doubleGejala11 = txtNilaiGejala11.text.toString().toDouble()
                val doubleGejala12 = txtNilaiGejala12.text.toString().toDouble()
                val doubleGejala13 = txtNilaiGejala13.text.toString().toDouble()

                val hasilHitunganGejala1 = nilaiGejala1 * doubleGejala1
                val hasilHitunganGejala11 = nilaiGejala11 * doubleGejala11
                val hasilHitunganGejala12 = nilaiGejala12 * doubleGejala12
                val hasilHitunganGejala13 = nilaiGejala13 * doubleGejala13

                val Combine_CF1_CF11 = hasilHitunganGejala1 + hasilHitunganGejala11 * (1 - hasilHitunganGejala1)
                val Combine_CFold_CF12 = Combine_CF1_CF11 + hasilHitunganGejala12 * (1 - Combine_CF1_CF11)
                val Combine_CFold_CF13 = Combine_CFold_CF12 + hasilHitunganGejala13 * (1 - Combine_CFold_CF12)
                val hasilHitungGejala6 = Math.floor(Combine_CFold_CF13 * 100).toString()

                NamaKerusakan += "Kopling dan gigi transmisi\n"
                PersentaseKerusakan += hasilHitungGejala6+"%\n"
            }

            // KERUSAKAN 7
            if (GK2.isChecked && GK10.isChecked) {

                //  Nilai dari PAKAR
                val nilaiGejala1 = 0.8
                val nilaiGejala10 = 0.8

                // Nilai Inputan dari USER
                val doubleGejala1 = txtNilaiGejala1.text.toString().toDouble()
                val doubleGejala10 = txtNilaiGejala10.text.toString().toDouble()

                val hasilHitunganGejala1 = nilaiGejala1 * doubleGejala1
                val hasilHitunganGejala10 = nilaiGejala10 * doubleGejala10

                val Combine_CF1_CF11 = hasilHitunganGejala1 + hasilHitunganGejala10 * (1 - hasilHitunganGejala1)
                val hasilHitungGejala7 = Math.floor(Combine_CF1_CF11 * 100).toString()

                NamaKerusakan += "Starter listrik\n"
                PersentaseKerusakan += hasilHitungGejala7+"%\n"
            }

            // KERUSAKAN 8
            if (GK4.isChecked && GK12.isChecked && GK13.isChecked) {

                //  Nilai dari PAKAR
                val nilaiGejala1 = 0.8
                val nilaiGejala12 = 0.2
                val nilaiGejala13 = 0.2

                // Nilai Inputan dari USER
                val doubleGejala1 = txtNilaiGejala1.text.toString().toDouble()
                val doubleGejala12 = txtNilaiGejala12.text.toString().toDouble()
                val doubleGejala13 = txtNilaiGejala13.text.toString().toDouble()

                val hasilHitunganGejala1 = nilaiGejala1 * doubleGejala1
                val hasilHitunganGejala12 = nilaiGejala12 * doubleGejala12
                val hasilHitunganGejala13 = nilaiGejala13 * doubleGejala13

                val Combine_CF1_CF12 = hasilHitunganGejala1 + hasilHitunganGejala12 * (1 - hasilHitunganGejala1)
                val Combine_CFold_CF13 = Combine_CF1_CF12 + hasilHitunganGejala13 * (1 - Combine_CF1_CF12)
                val hasilHitungGejala8 = Math.floor(Combine_CFold_CF13 * 100).toString()

                NamaKerusakan += "Kickstarter dan Crankshaft\n"
                PersentaseKerusakan += hasilHitungGejala8+"%\n"
            }

            // KERUSAKAN 9
            if (GK2.isChecked && GK8.isChecked) {

                //  Nilai dari PAKAR
                val nilaiGejala1 = 0.2
                val nilaiGejala8 = 0.8

                // Nilai Inputan dari USER
                val doubleGejala1 = txtNilaiGejala1.text.toString().toDouble()
                val doubleGejala8 = txtNilaiGejala8.text.toString().toDouble()

                val hasilHitunganGejala1 = nilaiGejala1 * doubleGejala1
                val hasilHitunganGejala8 = nilaiGejala8 * doubleGejala8

                val Combine_CF1_CF8 = hasilHitunganGejala1 + hasilHitunganGejala8 * (1 - hasilHitunganGejala1)
                val hasilHitungGejala9 = Math.floor(Combine_CF1_CF8 * 100).toString()

                NamaKerusakan += "Sistem pengapian\n"
                PersentaseKerusakan += hasilHitungGejala9+"%\n"
            }

            // KERUSAKAN 10
            if (GK5.isChecked && GK14.isChecked) {

                //  Nilai dari PAKAR
                val nilaiGejala5 = 0.8
                val nilaiGejala14 = 0.8

                // Nilai Inputan dari USER
                val doubleGejala5 = txtNilaiGejala5.text.toString().toDouble()
                val doubleGejala14 = txtNilaiGejala14.text.toString().toDouble()

                val hasilHitunganGejala5 = nilaiGejala5 * doubleGejala5
                val hasilHitunganGejala14 = nilaiGejala14 * doubleGejala14

                val Combine_CF5_CF14 = hasilHitunganGejala5 + hasilHitunganGejala14 * (1 - hasilHitunganGejala5)
                val hasilHitungGejala10 = Math.floor(Combine_CF5_CF14 * 100).toString()

                NamaKerusakan += "Radiator\n"
                PersentaseKerusakan += hasilHitungGejala10+"%\n"
            }



            var goDetect = Intent(this@Karburator_Detect_Activity, DetektifHasilKarbuActivity::class.java)
            goDetect.putExtra("namakerusakan", NamaKerusakan)
            goDetect.putExtra("persentasekerusakan", PersentaseKerusakan)
            startActivity(goDetect)
        }


    }
}


