package com.xsuperman.basic.home.login

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

data class User(
    @get:Bindable
    var username: String,
    @get:Bindable
    var password: String
) : BaseObservable()