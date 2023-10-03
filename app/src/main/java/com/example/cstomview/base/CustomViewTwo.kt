package com.example.cstomview.base

import android.content.Context
import android.util.AttributeSet
import android.widget.RelativeLayout

class CustomViewTwo : RelativeLayout {
    private var mContext: Context

    constructor(context: Context) : super(context) {
        mContext = context
        initViews()
        initEVENT()
        abcasdkas()
    }

    constructor(context: Context?, attrs: AttributeSet?, mContext: Context) : super(
        context,
        attrs
    ) {
        this.mContext = mContext
        initViews()
        initEVENT()
        abcasdkas()
    }

    private fun initViews() {
        // TODO --> for event
    }

    private fun initEVENT() {
        // TODO --> for event
    }

    fun abcasdkas() {}
}
