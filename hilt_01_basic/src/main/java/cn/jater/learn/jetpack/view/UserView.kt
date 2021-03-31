package cn.jater.learn.jetpack.view

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import cn.jater.learn.jetpack.data.User
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class UserView(context: Context, attributeSet: AttributeSet?): AppCompatTextView(context, attributeSet) {
    @Inject lateinit var user: User

    @SuppressLint("SetTextI18n")
    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        text = "${user.name} feeling ${user.mood}"
    }
}