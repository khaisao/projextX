package com.example.baseproject.di

import com.example.baseproject.navigation.FeatureNavigation
import com.example.baseproject.navigation.FeatureNavigatorImpl
import com.example.core.navigationComponent.BaseNavigator
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped

@Module
@InstallIn(ActivityComponent::class)
abstract class NavigationModule {

    @Binds
    @ActivityScoped
    abstract fun provideBaseNavigation(navigation: FeatureNavigatorImpl): BaseNavigator


    @Binds
    @ActivityScoped
    abstract fun provideFeatureNavigation(navigation: FeatureNavigatorImpl): FeatureNavigation
}