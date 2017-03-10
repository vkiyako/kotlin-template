package com.example.vkiyako.kotlintemplate

import android.app.Application
import android.content.Context
import com.example.vkiyako.kotlintemplate.di.component.AppComponent
import com.example.vkiyako.kotlintemplate.di.component.DaggerAppComponent
import com.example.vkiyako.kotlintemplate.di.module.AppModule

class App : Application() {

    companion object {
        private lateinit var context: Context
        private var _appComponent: AppComponent? = null

        fun getAppComponent(): AppComponent {
            if (_appComponent == null) {
                _appComponent = DaggerAppComponent.builder().appModule(AppModule(context)).build()
            }
            return _appComponent!!
        }
    }

    override fun onCreate() {
        context = this
        super.onCreate()
    }
}