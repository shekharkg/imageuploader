package com.shekharkg.unacademy.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.shekharkg.unacademy.R
import com.shekharkg.unacademy.viewholders.ImageViewHolder

/**
 * Created by shekhar on 2019-07-20.
 */
class ImageAdapter(context: Context, var urls: Array<String>) : RecyclerView.Adapter<ImageViewHolder>() {

    private var errorDrawable = context.resources.getDrawable(R.drawable.ic_error_black_24dp, null)

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): ImageViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_image_view, viewGroup, false)
        return ImageViewHolder(view, errorDrawable)
    }

    override fun getItemCount(): Int {
        return urls.size
    }

    override fun onBindViewHolder(viewHolder: ImageViewHolder, position: Int) {
        viewHolder.onBind(urls[position])
    }

}