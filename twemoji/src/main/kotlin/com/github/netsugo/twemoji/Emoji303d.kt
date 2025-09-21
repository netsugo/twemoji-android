package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji303d: ImageVector
    get() {
        val current = _emoji303d
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji303d",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M35.361 29.179 C26.777 4.5 23.551 4.5 22 4.5 c-3.125 0 -4.538 3.18 -5.785 5.985 -0.1 0.225 -0.217 0.485 -0.339 0.754 -0.486 0.939 -1.266 0.939 -1.752 0 -0.122 -0.269 -0.239 -0.529 -0.339 -0.754 C12.538 7.68 11.125 4.5 8 4.5 5.696 4.5 2.534 6.583 0.548 16.51 c-0.271 1.354 0.607 2.67 1.96 2.941 1.351 0.272 2.67 -0.607 2.942 -1.96 0.547 -1.835 1.748 -5.663 1.748 -5.663 0.429 -1.001 1.177 -1.031 1.672 -0.078 0.125 0.273 0.243 0.537 0.344 0.765 0.183 0.412 0.371 0.831 0.566 1.248 l0.003 0.007 c0.195 0.416 0.398 0.828 0.615 1.226 l0.003 0.004 c1.043 1.917 2.394 3.5 4.598 3.5 2.661 0 4.08 -2.307 5.212 -4.724 l0.012 -0.024 c0.193 -0.413 0.379 -0.829 0.561 -1.237 0.091 -0.205 0.197 -0.441 0.308 -0.685 0.446 -0.881 1.188 -0.803 1.654 0.182 0 0 3.902 8.748 5.594 12.519 0.801 2.095 1.583 4.231 2.299 6.29 0.359 1.032 1.327 1.68 2.361 1.68 0.272 0 0.55 -0.045 0.821 -0.14 1.304 -0.454 1.993 -1.879 1.54 -3.182z
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 35.361 29.179
                moveTo(x = 35.361f, y = 29.179f)
                // C 26.777 4.5 23.551 4.5 22 4.5
                curveTo(
                    x1 = 26.777f,
                    y1 = 4.5f,
                    x2 = 23.551f,
                    y2 = 4.5f,
                    x3 = 22.0f,
                    y3 = 4.5f,
                )
                // c -3.125 0 -4.538 3.18 -5.785 5.985
                curveToRelative(
                    dx1 = -3.125f,
                    dy1 = 0.0f,
                    dx2 = -4.538f,
                    dy2 = 3.18f,
                    dx3 = -5.785f,
                    dy3 = 5.985f,
                )
                // c -0.1 0.225 -0.217 0.485 -0.339 0.754
                curveToRelative(
                    dx1 = -0.1f,
                    dy1 = 0.225f,
                    dx2 = -0.217f,
                    dy2 = 0.485f,
                    dx3 = -0.339f,
                    dy3 = 0.754f,
                )
                // c -0.486 0.939 -1.266 0.939 -1.752 0
                curveToRelative(
                    dx1 = -0.486f,
                    dy1 = 0.939f,
                    dx2 = -1.266f,
                    dy2 = 0.939f,
                    dx3 = -1.752f,
                    dy3 = 0.0f,
                )
                // c -0.122 -0.269 -0.239 -0.529 -0.339 -0.754
                curveToRelative(
                    dx1 = -0.122f,
                    dy1 = -0.269f,
                    dx2 = -0.239f,
                    dy2 = -0.529f,
                    dx3 = -0.339f,
                    dy3 = -0.754f,
                )
                // C 12.538 7.68 11.125 4.5 8 4.5
                curveTo(
                    x1 = 12.538f,
                    y1 = 7.68f,
                    x2 = 11.125f,
                    y2 = 4.5f,
                    x3 = 8.0f,
                    y3 = 4.5f,
                )
                // C 5.696 4.5 2.534 6.583 0.548 16.51
                curveTo(
                    x1 = 5.696f,
                    y1 = 4.5f,
                    x2 = 2.534f,
                    y2 = 6.583f,
                    x3 = 0.548f,
                    y3 = 16.51f,
                )
                // c -0.271 1.354 0.607 2.67 1.96 2.941
                curveToRelative(
                    dx1 = -0.271f,
                    dy1 = 1.354f,
                    dx2 = 0.607f,
                    dy2 = 2.67f,
                    dx3 = 1.96f,
                    dy3 = 2.941f,
                )
                // c 1.351 0.272 2.67 -0.607 2.942 -1.96
                curveToRelative(
                    dx1 = 1.351f,
                    dy1 = 0.272f,
                    dx2 = 2.67f,
                    dy2 = -0.607f,
                    dx3 = 2.942f,
                    dy3 = -1.96f,
                )
                // c 0.547 -1.835 1.748 -5.663 1.748 -5.663
                curveToRelative(
                    dx1 = 0.547f,
                    dy1 = -1.835f,
                    dx2 = 1.748f,
                    dy2 = -5.663f,
                    dx3 = 1.748f,
                    dy3 = -5.663f,
                )
                // c 0.429 -1.001 1.177 -1.031 1.672 -0.078
                curveToRelative(
                    dx1 = 0.429f,
                    dy1 = -1.001f,
                    dx2 = 1.177f,
                    dy2 = -1.031f,
                    dx3 = 1.672f,
                    dy3 = -0.078f,
                )
                // c 0.125 0.273 0.243 0.537 0.344 0.765
                curveToRelative(
                    dx1 = 0.125f,
                    dy1 = 0.273f,
                    dx2 = 0.243f,
                    dy2 = 0.537f,
                    dx3 = 0.344f,
                    dy3 = 0.765f,
                )
                // c 0.183 0.412 0.371 0.831 0.566 1.248
                curveToRelative(
                    dx1 = 0.183f,
                    dy1 = 0.412f,
                    dx2 = 0.371f,
                    dy2 = 0.831f,
                    dx3 = 0.566f,
                    dy3 = 1.248f,
                )
                // l 0.003 0.007
                lineToRelative(dx = 0.003f, dy = 0.007f)
                // c 0.195 0.416 0.398 0.828 0.615 1.226
                curveToRelative(
                    dx1 = 0.195f,
                    dy1 = 0.416f,
                    dx2 = 0.398f,
                    dy2 = 0.828f,
                    dx3 = 0.615f,
                    dy3 = 1.226f,
                )
                // l 0.003 0.004
                lineToRelative(dx = 0.003f, dy = 0.004f)
                // c 1.043 1.917 2.394 3.5 4.598 3.5
                curveToRelative(
                    dx1 = 1.043f,
                    dy1 = 1.917f,
                    dx2 = 2.394f,
                    dy2 = 3.5f,
                    dx3 = 4.598f,
                    dy3 = 3.5f,
                )
                // c 2.661 0 4.08 -2.307 5.212 -4.724
                curveToRelative(
                    dx1 = 2.661f,
                    dy1 = 0.0f,
                    dx2 = 4.08f,
                    dy2 = -2.307f,
                    dx3 = 5.212f,
                    dy3 = -4.724f,
                )
                // l 0.012 -0.024
                lineToRelative(dx = 0.012f, dy = -0.024f)
                // c 0.193 -0.413 0.379 -0.829 0.561 -1.237
                curveToRelative(
                    dx1 = 0.193f,
                    dy1 = -0.413f,
                    dx2 = 0.379f,
                    dy2 = -0.829f,
                    dx3 = 0.561f,
                    dy3 = -1.237f,
                )
                // c 0.091 -0.205 0.197 -0.441 0.308 -0.685
                curveToRelative(
                    dx1 = 0.091f,
                    dy1 = -0.205f,
                    dx2 = 0.197f,
                    dy2 = -0.441f,
                    dx3 = 0.308f,
                    dy3 = -0.685f,
                )
                // c 0.446 -0.881 1.188 -0.803 1.654 0.182
                curveToRelative(
                    dx1 = 0.446f,
                    dy1 = -0.881f,
                    dx2 = 1.188f,
                    dy2 = -0.803f,
                    dx3 = 1.654f,
                    dy3 = 0.182f,
                )
                // c 0 0 3.902 8.748 5.594 12.519
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 3.902f,
                    dy2 = 8.748f,
                    dx3 = 5.594f,
                    dy3 = 12.519f,
                )
                // c 0.801 2.095 1.583 4.231 2.299 6.29
                curveToRelative(
                    dx1 = 0.801f,
                    dy1 = 2.095f,
                    dx2 = 1.583f,
                    dy2 = 4.231f,
                    dx3 = 2.299f,
                    dy3 = 6.29f,
                )
                // c 0.359 1.032 1.327 1.68 2.361 1.68
                curveToRelative(
                    dx1 = 0.359f,
                    dy1 = 1.032f,
                    dx2 = 1.327f,
                    dy2 = 1.68f,
                    dx3 = 2.361f,
                    dy3 = 1.68f,
                )
                // c 0.272 0 0.55 -0.045 0.821 -0.14
                curveToRelative(
                    dx1 = 0.272f,
                    dy1 = 0.0f,
                    dx2 = 0.55f,
                    dy2 = -0.045f,
                    dx3 = 0.821f,
                    dy3 = -0.14f,
                )
                // c 1.304 -0.454 1.993 -1.879 1.54 -3.182z
                curveToRelative(
                    dx1 = 1.304f,
                    dy1 = -0.454f,
                    dx2 = 1.993f,
                    dy2 = -1.879f,
                    dx3 = 1.54f,
                    dy3 = -3.182f,
                )
                close()
            }
        }.build().also { _emoji303d = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji303d: ImageVector? = null
