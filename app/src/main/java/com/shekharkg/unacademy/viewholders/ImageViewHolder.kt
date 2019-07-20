package com.shekharkg.unacademy.viewholders

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.support.v7.widget.RecyclerView
import android.view.View
import com.shekharkg.unacademy.callbacks.FetchBitmapCallback
import com.shekharkg.unacademy.loader.ImageLoader
import kotlinx.android.synthetic.main.item_image_view.view.*

/**
 * Created by shekhar on 2019-07-20.
 */
class ImageViewHolder(itemView: View, var errorDrawable: Drawable) : RecyclerView.ViewHolder(itemView),
    FetchBitmapCallback {

    override fun onBitmapFetched(bitmap: Bitmap) {
        itemView.imageView.setImageBitmap(bitmap)
    }

    override fun onBitmapFetchFailed(error: String) {
        itemView.imageView.setImageDrawable(errorDrawable)
    }

    fun onBind(url: String?) {
        ImageLoader(this).execute(url)
    }


}