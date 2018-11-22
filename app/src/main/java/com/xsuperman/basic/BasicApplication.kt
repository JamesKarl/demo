package com.xsuperman.basic

import android.app.Application
import timber.log.Timber

class BasicApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}