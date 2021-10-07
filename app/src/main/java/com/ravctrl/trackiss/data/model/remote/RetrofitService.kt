package com.ravctrl.trackiss.data.model.remote

import com.google.gson.GsonBuilder
import com.ravctrl.trackiss.data.model.ISSLocation.ISSLocation
import com.ravctrl.trackiss.data.model.ISSResidents.ISSResidents
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface RetrofitService {

    @GET("/iss-now.json")
    suspend fun getCoordinates(): Response<ISSLocation>

    @GET("/astros.json")
    suspend fun getResidents(): Response<ISSResidents>

    companion object{
        val BASE_URL: String = "http://api.open-notify.org/"
        fun getRetrofitInstance(): Retrofit {
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
                .build()
        }
    }

}