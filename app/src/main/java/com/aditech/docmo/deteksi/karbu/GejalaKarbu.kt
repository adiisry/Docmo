package com.aditech.docmo.deteksi.karbu

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class GejalaKarbu (
    var Gejala1:String ?="",
    var Gejala2:String ?="",
    var Gejala3:String ?="",
    var Gejala4:String ?="",
    var Gejala5:String ?="",
    var Gejala6:String ?="",
    var Gejala7:String ?="",
    var Gejala8:String ?="",
    var Gejala9:String ?="",
    var Gejala10:String ?="",
    var Gejala11:String ?="",
    var Gejala12:String ?="",
    var Gejala13:String ?=""
) : Parcelable