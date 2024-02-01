package com.tegar.tourismapp.core.domain.repository

import androidx.lifecycle.LiveData
import com.tegar.tourismapp.core.data.Resource
import com.tegar.tourismapp.core.domain.model.Tourism

interface ITourismRepository {

    fun getAllTourism() : LiveData<Resource<List<Tourism>>>

    fun getFavoriteTourism() : LiveData<List<Tourism>>

    fun setFavoriteTourism(tourism: Tourism, state: Boolean)




}