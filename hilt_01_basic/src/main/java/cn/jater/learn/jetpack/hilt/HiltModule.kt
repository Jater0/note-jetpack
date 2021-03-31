package cn.jater.learn.jetpack.hilt

import cn.jater.learn.jetpack.data.User
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class HiltModule {
    @Binds abstract fun bindAny(user: User): Any
}