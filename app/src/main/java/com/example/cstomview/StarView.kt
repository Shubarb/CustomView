package com.example.cstomview

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.View

class StarView(context: Context, attrs: AttributeSet? = null) : View(context, attrs) {

    private val starPaint = Paint()

    init {
        // Thiết lập màu sắc và kiểu vẽ cho ngôi sao
        starPaint.color = resources.getColor(android.R.color.holo_orange_dark)
        starPaint.style = Paint.Style.FILL
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        // Lấy kích thước của Custom View
        val width = width.toFloat()
        val height = height.toFloat()

        // Vẽ ngôi sao
        val cx = width / 2
        val cy = height / 2
        val outerRadius = width / 2
        val innerRadius = outerRadius / 2
        val angle = Math.toRadians(36.0)

        val startX = cx
        val startY = cy - outerRadius

        val path = Path()
        path.moveTo(startX, startY)

        for (i in 1 until 5) {
            val x = (cx - startX) * Math.cos(angle) - (cy - startY) * Math.sin(angle) + startX
            val y = (cx - startX) * Math.sin(angle) + (cy - startY) * Math.cos(angle) + startY
            path.lineTo(x.toFloat(), y.toFloat())

            val x1 = (cx - startX) * Math.cos(2 * angle) - (cy - startY) * Math.sin(2 * angle) + startX
            val y1 = (cx - startX) * Math.sin(2 * angle) + (cy - startY) * Math.cos(2 * angle) + startY
            path.lineTo(x1.toFloat(), y1.toFloat())
        }

        path.close()
        canvas.drawPath(path, starPaint)
    }
}