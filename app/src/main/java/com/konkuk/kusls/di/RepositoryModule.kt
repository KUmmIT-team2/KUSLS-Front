package com.konkuk.kusls.di

import com.konkuk.kusls.data.repositoryimpl.TestRepositoryImpl
import com.konkuk.kusls.domain.repository.TestRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun bindsTestRepository(testRepositoryImpl: TestRepositoryImpl): TestRepository
}