package cn.jater.learn.jetpack.data

import dagger.hilt.android.scopes.ActivityScoped

@ActivityScoped
data class User constructor(var id: Int, var name: String, var mood: String) {
    constructor(): this(1, "Jater", "Sad")
}