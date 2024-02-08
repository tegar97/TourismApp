package com.tegar.tourismapp.favorite

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.tegar.tourismapp.core.domain.usecase.TourismUseCase

class FavoriteViewModel(tourismUseCase: TourismUseCase) : ViewModel(){
    val favoriteTourism = tourismUseCase.getFavoriteTourism().asLiveData()


}