package com.shekharkg.unacademy.callbacks

import android.graphics.Bitmap

/**
 * Created by shekhar on 2019-07-20.
 * Tricog Health Services Pvt Ltd © 2019 | All rights reserved
 */
interface FetchBitmapCallback {

    fun onBitmapFetched(bitmap: Bitmap)

    fun onBitmapFetchFailed(error: String)

}
