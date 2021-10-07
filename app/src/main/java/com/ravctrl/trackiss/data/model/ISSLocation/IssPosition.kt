package com.ravctrl.trackiss.data.model.ISSLocation


import com.google.gson.annotations.SerializedName

data class IssPosition(
    @SerializedName("latitude")
    val latitude: String,
    @SerializedName("longitude")
    val longitude: String
)