package com.ravctrl.trackiss.data.model.ISSLocation


import com.google.gson.annotations.SerializedName

data class ISSLocation(
    @SerializedName("iss_position")
    val issPosition: IssPosition,
    @SerializedName("message")
    val message: String,
    @SerializedName("timestamp")
    val timestamp: Int
)