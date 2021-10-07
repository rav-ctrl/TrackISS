package com.ravctrl.trackiss.domain

import com.ravctrl.trackiss.data.model.ISSLocation.IssPosition
import com.ravctrl.trackiss.data.model.ISSResidents.People
import com.ravctrl.trackiss.data.remote.RetrofitService
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class Repo_impl: Repo {

    val retService = RetrofitService
        .getRetrofitInstance()
        .create(RetrofitService::class.java)


    override suspend fun getCoordinates(): IssPosition? {
        return retService.getCoordinates().body()?.issPosition
    }

    override suspend fun getResidents(): List<People>? {
        return retService.getResidents().body()?.people
    }

}