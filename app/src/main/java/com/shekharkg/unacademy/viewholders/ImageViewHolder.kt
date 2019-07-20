package com.shekharkg.unacademy.viewholders

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.support.v7.widget.RecyclerView
import android.view.View
import com.shekharkg.imagecache.callback.FetchBitmapCallback
import com.shekharkg.imagecache.loader.ImageLoader
import kotlinx.android.synthetic.main.item_image_view.view.*

/**
 * Created by shekhar on 2019-07-20.
 */
class ImageViewHolder(itemView: View, var errorDrawable: Drawable) : RecyclerView.ViewHolder(itemView),
    FetchBitmapCallback {

    override fun onBitmapFetched(bitmap: Bitmap) {
        itemView.imageView.setImageBitmap(bitmap)
        itemView.progressBar.visibility = View.GONE
    }

    override fun onBitmapFetchFailed(error: String) {
        itemView.imageView.setImageDrawable(errorDrawable)
        itemView.progressBar.visibility = View.GONE
    }

    fun onBind(url: String?) {
        itemView.imageView.setImageDrawable(null)
        itemView.progressBar.visibility = View.VISIBLE
        ImageLoader(this).execute(url)
    }


}