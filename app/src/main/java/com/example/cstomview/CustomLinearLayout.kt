package com.example.cstomview

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView


class CustomLinearLayout : LinearLayout {
    private var textView: TextView? = null
    private var button: Button? = null

    constructor(context: Context?) : super(context) {
        init()
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        init()
    }

    private fun init() {
        LayoutInflater.from(context).inflate(R.layout.custom_linear_layout, this, true)
        textView = findViewById<TextView>(R.id.text_view)
        button = findViewById(R.id.button)
    }

    fun setText(text: String?) {
        textView!!.text = text
    }

    fun setButtonText(buttonText: String?) {
        button!!.setText(buttonText)
    }
}
