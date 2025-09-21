package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji2763: ImageVector
    get() {
        val current = _emoji2763
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji2763",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M18 4 C14.875 -2.375 6 -0.731 6 7 c0 7.062 12 17 12 17 s12 -9.938 12 -17 c0 -7.731 -8.875 -9.375 -12 -3z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 18 4
                moveTo(x = 18.0f, y = 4.0f)
                // C 14.875 -2.375 6 -0.731 6 7
                curveTo(
                    x1 = 14.875f,
                    y1 = -2.375f,
                    x2 = 6.0f,
                    y2 = -0.731f,
                    x3 = 6.0f,
                    y3 = 7.0f,
                )
                // c 0 7.062 12 17 12 17
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 7.062f,
                    dx2 = 12.0f,
                    dy2 = 17.0f,
                    dx3 = 12.0f,
                    dy3 = 17.0f,
                )
                // s 12 -9.938 12 -17
                reflectiveCurveToRelative(
                    dx1 = 12.0f,
                    dy1 = -9.938f,
                    dx2 = 12.0f,
                    dy2 = -17.0f,
                )
                // c 0 -7.731 -8.875 -9.375 -12 -3z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -7.731f,
                    dx2 = -8.875f,
                    dy2 = -9.375f,
                    dx3 = -12.0f,
                    dy3 = -3.0f,
                )
                close()
            }
            // M18 31 m-5 0 a5 5 0 1 1 10 0 a5 5 0 1 1 -10 0
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 18 31
                moveTo(x = 18.0f, y = 31.0f)
                // m -5 0
                moveToRelative(dx = -5.0f, dy = 0.0f)
                // a 5 5 0 1 1 10 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 10.0f,
                    dy1 = 0.0f,
                )
                // a 5 5 0 1 1 -10 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -10.0f,
                    dy1 = 0.0f,
                )
            }
        }.build().also { _emoji2763 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji2763: ImageVector? = null
