package com.konkuk.kusls

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class KuslsApplication : Application(){
    override fun onCreate(){
        super.onCreate()
    }
}