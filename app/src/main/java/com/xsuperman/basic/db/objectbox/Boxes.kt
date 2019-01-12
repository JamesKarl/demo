package com.xsuperman.basic.db.objectbox

import android.app.Application
import io.objectbox.Box
import io.objectbox.BoxStore


private lateinit var boxStore: BoxStore
private lateinit var boxStoreOfCurrentAccount: BoxStore

val appAccountStore: Box<AppAccount> by lazy { boxStoreOfCurrentAccount.boxFor<AppAccount>(AppAccount::class.java) }

fun initObjectBox(application: Application) {
    /*boxStore = MyObjectBox.builder()
        .androidContext(application)
        .androidContext(application).build()

    boxStoreOfCurrentAccount = MyObjectBox.builder()
        .name("1232")
        .baseDirectory(application.filesDir).build()*/
}
