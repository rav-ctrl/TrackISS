package com.ravctrl.trackiss.domain

import com.ravctrl.trackiss.data.model.ISSLocation.IssPosition
import com.ravctrl.trackiss.data.model.ISSResidents.People

interface Repo {

    suspend fun getCoordinates(): IssPosition?

    suspend fun getResidents(): List<People>?

}