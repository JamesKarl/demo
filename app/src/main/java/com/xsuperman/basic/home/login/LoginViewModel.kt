package com.xsuperman.basic.home.login

import androidx.lifecycle.ViewModel
import timber.log.Timber

class LoginViewModel : ViewModel() {
    val user = User("James", "1234")

    fun login(user: User) {
        Timber.d("login: $user")
    }
}
