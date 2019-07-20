package com.shekharkg.imagecache.callback

import android.graphics.Bitmap

/**
 * Created by shekhar on 2019-07-20.
 */
interface FetchBitmapCallback {

    fun onBitmapFetched(bitmap: Bitmap, position: Int?)

    fun onBitmapFetchFailed(error: String, position: Int?)

}
