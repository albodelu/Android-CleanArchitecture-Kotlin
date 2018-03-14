package com.fernandocejas.sample.features.movies

import android.content.Context
import android.content.Intent
import com.fernandocejas.sample.BaseActivity

class MoviesActivity : BaseActivity() {

    companion object {
        @JvmStatic
        fun callingIntent(context: Context): Intent {
            val intent = Intent(context, MoviesActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            return intent
        }
    }

    override fun fragment() = MoviesFragment()
}
