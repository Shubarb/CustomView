package com.example.cstomview

import android.annotation.SuppressLint
import android.graphics.Rect
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.ImageView

class MainActivity2 : AppCompatActivity() {
    private lateinit var imageView1: ImageView
    private lateinit var imageView2: ImageView
    private var isImageView1Visible = true

    private var offsetX = 0f
    private var offsetY = 0f

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        imageView1 = findViewById(R.id.imageView1)
        imageView2 = findViewById(R.id.imageView2)

        imageView1.setOnTouchListener { _, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    offsetX = event.x - imageView1.x
                    offsetY = event.y - imageView1.y
                }
                MotionEvent.ACTION_MOVE -> {
                    imageView1.x = event.x - offsetX
                    imageView1.y = event.y - offsetY
                }
                MotionEvent.ACTION_UP -> {
                    if (isImageView1Visible && isImageView2Overlap()) {
                        imageView1.visibility = View.GONE
                        isImageView1Visible = false
                    }
                }
            }
            true
        }
    }

    private fun isImageView2Overlap(): Boolean {
        val imageView1Rect = Rect()
        val imageView2Rect = Rect()

        imageView1.getGlobalVisibleRect(imageView1Rect)
        imageView2.getGlobalVisibleRect(imageView2Rect)

        return imageView1Rect.intersect(imageView2Rect)
    }
}