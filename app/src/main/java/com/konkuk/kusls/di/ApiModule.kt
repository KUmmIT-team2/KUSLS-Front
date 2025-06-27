package com.konkuk.kusls.di

import com.konkuk.kusls.data.service.MyService
import com.konkuk.kusls.data.service.TestService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApiModule {
    @Provides
    @Singleton
    fun providesTestService(retrofit: Retrofit): TestService =
        retrofit.create(TestService::class.java)

    @Provides
    @Singleton
    fun providesMyService(retrofit: Retrofit): MyService =
        retrofit.create(MyService::class.java)

}