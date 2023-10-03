package com.example.cstomview.base

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.LinearLayout
import com.example.cstomview.R

class CustomViewOne(private val mContext: Context) : LinearLayout(mContext) {
    private var viewGroup: ViewGroup? = null
    fun openLayoutHome() {
        viewGroup!!.addView(this)
    }

    fun closeLayoutHome() {
        if (parent != null && viewGroup != null) viewGroup!!.removeView(this)
    }

    override fun setTag(tag: Any) {
        if (tag is ViewGroup) {
            viewGroup = tag
        }
        super.setTag(tag)
    }

    override fun onFinishInflate() {
        super.onFinishInflate()

    }

    // Destroy View
    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
    }

    companion object {
        fun getFromHome(context: Context?, viewGroup: ViewGroup): CustomViewOne {
            val homePartial = LayoutInflater.from(context)
                .inflate(R.layout.view_tab_home, viewGroup, false) as CustomViewOne
            homePartial.setTag(viewGroup)
            return homePartial
        }
    }
}
