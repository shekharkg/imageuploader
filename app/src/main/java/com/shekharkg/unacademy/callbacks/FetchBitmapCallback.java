package com.shekharkg.unacademy.callbacks;

import android.graphics.Bitmap;

/**
 * Created by shekhar on 2019-07-20.
 * Tricog Health Services Pvt Ltd © 2019 | All rights reserved
 */
public interface FetchBitmapCallback {

    void onBitmapFetched(Bitmap bitmap);

    void onBitmapFetchFailed(String error);

}
