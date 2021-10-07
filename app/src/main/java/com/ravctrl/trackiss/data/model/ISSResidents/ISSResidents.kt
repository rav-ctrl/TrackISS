package com.ravctrl.trackiss.data.model.ISSResidents


import com.google.gson.annotations.SerializedName

data class ISSResidents(
    @SerializedName("message")
    val message: String,
    @SerializedName("number")
    val number: Int,
    @SerializedName("people")
    val people: List<People>
)