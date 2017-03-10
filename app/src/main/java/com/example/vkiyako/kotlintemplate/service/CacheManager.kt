package com.example.vkiyako.kotlintemplate.service

import io.reactivex.Observable

class CacheManager(private val observableManager: ObservableManager) {

    fun <T> makeObservableCached(observable: Observable<T>, cacheKey: String): Observable<T> {
        return observable.compose { observable ->
            observable.doOnSubscribe {
                observableManager.addObservable(cacheKey, observable)
            }.doOnTerminate { observableManager.removeObservable(cacheKey) }
        }
    }
}