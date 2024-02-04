package com.tegar.tourismapp.core.di
import android.content.Context
import com.tegar.tourismapp.core.data.TourismRepository
import com.tegar.tourismapp.core.data.source.local.LocalDataSource
import com.tegar.tourismapp.core.data.source.local.room.TourismDatabase
import com.tegar.tourismapp.core.data.source.remote.RemoteDataSource
import com.tegar.tourismapp.core.data.source.remote.network.ApiConfig
import com.tegar.tourismapp.core.domain.repository.ITourismRepository
import com.tegar.tourismapp.core.domain.usecase.TourismInteractor
import com.tegar.tourismapp.core.domain.usecase.TourismUseCase
import com.tegar.tourismapp.core.utils.AppExecutors
import com.tegar.tourismapp.core.utils.JsonHelper

object Injection {

    private fun provideRepository(context: Context)  : ITourismRepository{

        val database = TourismDatabase.getInstance(context)

        val remoteDataSource = RemoteDataSource.getInstance(ApiConfig.provideApiService())
        val localDataSource = LocalDataSource.getInstance(database.tourismDao())
        val appExecutors = AppExecutors()

        return TourismRepository.getInstance(remoteDataSource, localDataSource, appExecutors)

    }

    fun provideTourismUseCase(context: Context): TourismUseCase {
        val repository = provideRepository(context)
        return TourismInteractor(repository)
    }
}