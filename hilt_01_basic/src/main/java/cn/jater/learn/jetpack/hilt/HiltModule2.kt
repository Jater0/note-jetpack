package cn.jater.learn.jetpack.hilt

import android.app.Activity
import cn.jater.learn.jetpack.data.User
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
object HiltModule2 {
    @Provides
    fun provideUser(): User {
        val user = User()
        user.name = "朱镇涛"
        user.mood = "Happy"
        return user
    }
}