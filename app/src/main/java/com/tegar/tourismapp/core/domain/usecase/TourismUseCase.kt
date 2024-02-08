package com.tegar.tourismapp.core.domain.usecase

import androidx.lifecycle.LiveData
import com.tegar.tourismapp.core.data.Resource
import com.tegar.tourismapp.core.domain.model.Tourism
import kotlinx.coroutines.flow.Flow

interface TourismUseCase {
    fun getAllTourism(): Flow<Resource<List<Tourism>>>
    fun getFavoriteTourism(): Flow<List<Tourism>>
    fun setFavoriteTourism(tourism: Tourism, state: Boolean)
}