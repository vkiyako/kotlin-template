package com.example.vkiyako.kotlintemplate.di.module

import android.content.Context
import com.example.vkiyako.kotlintemplate.di.scope.PerApplication
import dagger.Module
import dagger.Provides

@Module
class AppModule(private val context: Context) {

    @PerApplication
    @Provides
    fun provideContext() = context
}