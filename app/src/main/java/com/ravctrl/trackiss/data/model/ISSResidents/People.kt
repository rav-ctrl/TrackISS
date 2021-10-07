package com.ravctrl.trackiss.data.model.ISSResidents


import com.google.gson.annotations.SerializedName

data class People(
    @SerializedName("craft")
    val craft: String,
    @SerializedName("name")
    val name: String
)