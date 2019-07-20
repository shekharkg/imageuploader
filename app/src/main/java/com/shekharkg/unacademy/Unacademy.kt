package com.shekharkg.unacademy

import android.app.Application
import com.shekharkg.unacademy.cache.ImageCache

/**
 * Created by shekhar on 2019-07-20.
 * Tricog Health Services Pvt Ltd © 2019 | All rights reserved
 */
class Unacademy : Application() {

    private val cacheMaxSize = 50

    override fun onCreate() {
        super.onCreate()

        ImageCache.getCache(cacheMaxSize)

    }


}
