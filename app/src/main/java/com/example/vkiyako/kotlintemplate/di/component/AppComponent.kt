package com.example.vkiyako.kotlintemplate.di.component

import com.example.vkiyako.kotlintemplate.di.module.AppModule
import com.example.vkiyako.kotlintemplate.di.scope.PerApplication
import dagger.Component


@PerApplication
@Component(modules = arrayOf(AppModule::class))
interface AppComponent
