package com.example.cstomview

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class CyclerView(context: Context, attrs: AttributeSet? = null) : View(context, attrs) {

    private val circlePaint = Paint()

    init {
        // Thiết lập màu sắc và kiểu vẽ cho hình tròn
        circlePaint.color = Color.BLUE
        circlePaint.style = Paint.Style.FILL
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        // Lấy kích thước của Custom View
        val width = width.toFloat()
        val height = height.toFloat()

        // Tính tọa độ của tâm của hình tròn
        val cx = width / 2
        val cy = height / 2

        // Tính bán kính của hình tròn
        val radius = Math.min(cx, cy)

        // Vẽ hình tròn
        canvas.drawCircle(cx, cy, radius, circlePaint)
    }
}