package com.xsuperman.basic.home.login

import timber.log.Timber

class LoginPresenter {
    fun login(user: User) {
        Timber.d("login: $user")
    }
}