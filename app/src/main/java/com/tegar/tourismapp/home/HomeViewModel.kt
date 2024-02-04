package com.tegar.tourismapp.home

import androidx.lifecycle.ViewModel
import com.tegar.tourismapp.core.domain.usecase.TourismUseCase

class HomeViewModel(tourismUseCase: TourismUseCase) : ViewModel(){
    val tourism = tourismUseCase.getAllTourism()
}