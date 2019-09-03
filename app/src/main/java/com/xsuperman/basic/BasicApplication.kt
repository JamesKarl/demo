package com.xsuperman.basic

import android.app.Application
import android.content.Context
import com.google.firebase.FirebaseApp
import com.xsuperman.basic.db.objectbox.initObjectBox
import timber.log.Timber

private lateinit var theApplication: Application

val Any.appContext
    get() = theApplication


class BasicApplication : Application() {

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        theApplication = this
    }

    override fun onCreate() {
        super.onCreate()
        FirebaseApp.initializeApp(this)
        Timber.plant(Timber.DebugTree())
        initObjectBox(this)
    }
}