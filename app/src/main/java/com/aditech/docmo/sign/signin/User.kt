package com.aditech.docmo.sign.signin

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class User (
    var nama:String ?="",
    var email:String ?="",
    var username:String ?="",
    var password:String ?="",
    var role:String ?="",
    var url:String ?=""

) : Parcelable