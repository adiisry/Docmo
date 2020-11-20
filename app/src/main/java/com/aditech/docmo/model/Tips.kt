package com.aditech.docmo.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Tips (
    var desc:String ? ="",
    var judul:String ? ="",
    var poster:String ? =""
) : Parcelable