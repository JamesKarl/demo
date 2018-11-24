package com.xsuperman.basic.db.objectbox

import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id


@Entity
data class AppAccount(
    @Id
    var id: Long = 0,
    var userId: String = "",
    var password: String = ""
)