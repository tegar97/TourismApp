package com.tegar.tourismapp.favorite

import androidx.lifecycle.ViewModel
import com.tegar.tourismapp.core.domain.usecase.TourismUseCase

class FavoriteViewModel(tourismUseCase: TourismUseCase) : ViewModel(){
    val favoriteTourism = tourismUseCase.getFavoriteTourism()


}