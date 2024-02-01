package com.tegar.tourismapp.core.domain.usecase

import androidx.lifecycle.LiveData
import com.tegar.tourismapp.core.data.Resource
import com.tegar.tourismapp.core.domain.model.Tourism
import com.tegar.tourismapp.core.domain.repository.ITourismRepository

class TourismInteractor(private val tourismRepository: ITourismRepository) : TourismUseCase{
    override fun getAllTourism(): LiveData<Resource<List<Tourism>>> = tourismRepository.getAllTourism()

    override fun getFavoriteTourism(): LiveData<List<Tourism>> = tourismRepository.getFavoriteTourism()

    override fun setFavoriteTourism(tourism: Tourism, state: Boolean)  = tourismRepository.setFavoriteTourism(tourism,state)
}