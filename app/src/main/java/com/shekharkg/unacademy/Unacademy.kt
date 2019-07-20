package com.shekharkg.unacademy

import android.app.Application
import com.shekharkg.unacademy.cache.ImageCache

/**
 * Created by shekhar on 2019-07-20.
 * Tricog Health Services Pvt Ltd © 2019 | All rights reserved
 */
class Unacademy : Application() {

    private val maxMemory = (Runtime.getRuntime().maxMemory() / 1024).toInt()
    private val cacheSize = maxMemory / 8

    override fun onCreate() {
        super.onCreate()

        ImageCache.getCache(cacheSize)

    }


}
