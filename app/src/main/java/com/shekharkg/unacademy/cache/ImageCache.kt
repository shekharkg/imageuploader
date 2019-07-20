package com.shekharkg.unacademy.cache

import android.content.ComponentCallbacks2
import android.content.res.Configuration
import android.graphics.Bitmap
import android.util.LruCache

/**
 * Created by shekhar on 2019-07-20.
 */
class ImageCache
/**
 * @param maxSize for caches that do not override [.sizeOf], this is
 * the maximum number of entries in the cache. For all other caches,
 * this is the maximum sum of the sizes of the entries in this cache.
 */
private constructor(maxSize: Int) : LruCache<String, Bitmap>(maxSize), ComponentCallbacks2 {

    override fun onTrimMemory(level: Int) {
        if (cache == null)
            return

        if (level >= ComponentCallbacks2.TRIM_MEMORY_MODERATE)
            cache!!.evictAll()
        else if (level >= ComponentCallbacks2.TRIM_MEMORY_BACKGROUND)
            cache!!.trimToSize(cache!!.size() / 2)
    }

    override fun onConfigurationChanged(newConfig: Configuration) {

    }

    override fun onLowMemory() {

    }

    companion object {

        private var cache: ImageCache? = null

        fun getCache(maxSize: Int): ImageCache {
            if (cache == null)
                cache = ImageCache(maxSize)

            return cache!!
        }
    }
}
