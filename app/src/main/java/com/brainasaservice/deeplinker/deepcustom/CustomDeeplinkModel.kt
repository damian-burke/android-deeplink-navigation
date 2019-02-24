package com.brainasaservice.deeplinker.deepcustom

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CustomDeeplinkModel(
        val name: String
) : Parcelable
