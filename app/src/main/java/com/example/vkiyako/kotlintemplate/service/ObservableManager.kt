package com.example.vkiyako.kotlintemplate.service

import io.reactivex.Observable

class ObservableManager {
    private val observableMap: MutableMap<String, Observable<*>> = HashMap()

    fun addObservable(cacheKey: String, observable: Observable<*>) = observableMap.put(cacheKey, observable)

    fun <T> getObservable(cacheKey: String) = observableMap.get(cacheKey)

    fun removeObservable(cacheKey: String) = observableMap.remove(cacheKey)
}