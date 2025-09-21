package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f641: ImageVector
    get() {
        val current = _emoji1f641
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f641",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M18 18 m-18 0 a18 18 0 1 1 36 0 a18 18 0 1 1 -36 0
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 18 18
                moveTo(x = 18.0f, y = 18.0f)
                // m -18 0
                moveToRelative(dx = -18.0f, dy = 0.0f)
                // a 18 18 0 1 1 36 0
                arcToRelative(
                    a = 18.0f,
                    b = 18.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 36.0f,
                    dy1 = 0.0f,
                )
                // a 18 18 0 1 1 -36 0
                arcToRelative(
                    a = 18.0f,
                    b = 18.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -36.0f,
                    dy1 = 0.0f,
                )
            }
            // M25.485 27.379 C25.44 27.2 24.317 23 18 23 c-6.318 0 -7.44 4.2 -7.485 4.379 -0.055 0.217 0.043 0.442 0.237 0.554 0.195 0.111 0.439 0.078 0.6 -0.077 C11.371 27.837 13.306 26 18 26 s6.63 1.837 6.648 1.855 c0.096 0.095 0.224 0.145 0.352 0.145 0.084 0 0.169 -0.021 0.246 -0.064 0.196 -0.112 0.294 -0.339 0.239 -0.557z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 25.485 27.379
                moveTo(x = 25.485f, y = 27.379f)
                // C 25.44 27.2 24.317 23 18 23
                curveTo(
                    x1 = 25.44f,
                    y1 = 27.2f,
                    x2 = 24.317f,
                    y2 = 23.0f,
                    x3 = 18.0f,
                    y3 = 23.0f,
                )
                // c -6.318 0 -7.44 4.2 -7.485 4.379
                curveToRelative(
                    dx1 = -6.318f,
                    dy1 = 0.0f,
                    dx2 = -7.44f,
                    dy2 = 4.2f,
                    dx3 = -7.485f,
                    dy3 = 4.379f,
                )
                // c -0.055 0.217 0.043 0.442 0.237 0.554
                curveToRelative(
                    dx1 = -0.055f,
                    dy1 = 0.217f,
                    dx2 = 0.043f,
                    dy2 = 0.442f,
                    dx3 = 0.237f,
                    dy3 = 0.554f,
                )
                // c 0.195 0.111 0.439 0.078 0.6 -0.077
                curveToRelative(
                    dx1 = 0.195f,
                    dy1 = 0.111f,
                    dx2 = 0.439f,
                    dy2 = 0.078f,
                    dx3 = 0.6f,
                    dy3 = -0.077f,
                )
                // C 11.371 27.837 13.306 26 18 26
                curveTo(
                    x1 = 11.371f,
                    y1 = 27.837f,
                    x2 = 13.306f,
                    y2 = 26.0f,
                    x3 = 18.0f,
                    y3 = 26.0f,
                )
                // s 6.63 1.837 6.648 1.855
                reflectiveCurveToRelative(
                    dx1 = 6.63f,
                    dy1 = 1.837f,
                    dx2 = 6.648f,
                    dy2 = 1.855f,
                )
                // c 0.096 0.095 0.224 0.145 0.352 0.145
                curveToRelative(
                    dx1 = 0.096f,
                    dy1 = 0.095f,
                    dx2 = 0.224f,
                    dy2 = 0.145f,
                    dx3 = 0.352f,
                    dy3 = 0.145f,
                )
                // c 0.084 0 0.169 -0.021 0.246 -0.064
                curveToRelative(
                    dx1 = 0.084f,
                    dy1 = 0.0f,
                    dx2 = 0.169f,
                    dy2 = -0.021f,
                    dx3 = 0.246f,
                    dy3 = -0.064f,
                )
                // c 0.196 -0.112 0.294 -0.339 0.239 -0.557z
                curveToRelative(
                    dx1 = 0.196f,
                    dy1 = -0.112f,
                    dx2 = 0.294f,
                    dy2 = -0.339f,
                    dx3 = 0.239f,
                    dy3 = -0.557f,
                )
                close()
            }
            // M9.5 13.5 a2.5 3.5 0 1 0 5 0 a2.5 3.5 0 1 0 -5 0z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 9.5 13.5
                moveTo(x = 9.5f, y = 13.5f)
                // a 2.5 3.5 0 1 0 5 0
                arcToRelative(
                    a = 2.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // a 2.5 3.5 0 1 0 -5 0z
                arcToRelative(
                    a = 2.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -5.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M21.5 13.5 a2.5 3.5 0 1 0 5 0 a2.5 3.5 0 1 0 -5 0z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 21.5 13.5
                moveTo(x = 21.5f, y = 13.5f)
                // a 2.5 3.5 0 1 0 5 0
                arcToRelative(
                    a = 2.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // a 2.5 3.5 0 1 0 -5 0z
                arcToRelative(
                    a = 2.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -5.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _emoji1f641 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f641: ImageVector? = null
