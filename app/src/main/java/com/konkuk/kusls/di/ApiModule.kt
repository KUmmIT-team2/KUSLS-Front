package com.konkuk.kusls.di

import com.konkuk.kusls.data.service.AuthService
import com.konkuk.kusls.data.service.CollegeService
import com.konkuk.kusls.data.service.DepartmentService
import com.konkuk.kusls.data.service.MyService
import com.konkuk.kusls.data.service.QnaService
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

    @Provides
    @Singleton
    fun provideQnaService(retrofit: Retrofit): QnaService =
        retrofit.create(QnaService::class.java)

    @Provides
    fun providesAuthService(retrofit: Retrofit): AuthService =
        retrofit.create(AuthService::class.java)

    @Provides
    fun providesDepartmentService(retrofit: Retrofit): DepartmentService =
        retrofit.create(DepartmentService::class.java)

    @Provides
    fun providesCollegeService(retrofit: Retrofit): CollegeService =
        retrofit.create(CollegeService::class.java)


}