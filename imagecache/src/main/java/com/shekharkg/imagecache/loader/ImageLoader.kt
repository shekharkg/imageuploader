package com.shekharkg.imagecache.loader

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.AsyncTask
import com.shekharkg.imagecache.cache.ImageCache
import com.shekharkg.imagecache.callback.FetchBitmapCallback
import java.io.IOException
import java.net.HttpURLConnection
import java.net.URL

/**
 * Created by shekhar on 2019-07-20.
 */
class ImageLoader(private val callback: FetchBitmapCallback?) : AsyncTask<String, Void, Bitmap>() {

    override fun onPreExecute() {
        super.onPreExecute()

    }

    override fun doInBackground(vararg urls: String): Bitmap? {
        if (urls[0].isNotEmpty()) {
            val url = urls[0]

            var bitmap: Bitmap? = ImageCache.getBitmap(url)

            if (bitmap == null) {
                bitmap = getBitmapFromURL(url)

                if (bitmap != null)
                    ImageCache.putBitmap(url, bitmap)
            }
            return bitmap
        }
        return null
    }


    override fun onPostExecute(bitmap: Bitmap?) {
        super.onPostExecute(bitmap)

        if (callback != null) {
            if (bitmap == null)
                callback.onBitmapFetchFailed("Unable to fetch bitmap...")
            else
                callback.onBitmapFetched(bitmap)
        }
    }


    private fun getBitmapFromURL(src: String): Bitmap? {
        return try {
            val url = URL(src)
            val connection = url.openConnection() as HttpURLConnection
            connection.doInput = true
            connection.connect()
            val input = connection.inputStream
            BitmapFactory.decodeStream(input)
        } catch (e: IOException) {
            e.printStackTrace()
            null
        }

    }
}
