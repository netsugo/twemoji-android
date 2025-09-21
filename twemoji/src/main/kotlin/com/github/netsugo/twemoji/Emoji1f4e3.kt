package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f4e3: ImageVector
    get() {
        val current = _emoji1f4e3
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f4e3",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M14 19 c-3.314 0 -6 2.687 -6 6 s2.686 6 6 6 6 -2.687 6 -6 -2.687 -6 -6 -6z M14 29 c-2.209 0 -4 -1.791 -4 -4 s1.791 -4 4 -4 4 1.791 4 4 -1.791 4 -4 4z
            path(
                fill = SolidColor(Color(0xFF3B88C3)),
            ) {
                // M 14 19
                moveTo(x = 14.0f, y = 19.0f)
                // c -3.314 0 -6 2.687 -6 6
                curveToRelative(
                    dx1 = -3.314f,
                    dy1 = 0.0f,
                    dx2 = -6.0f,
                    dy2 = 2.687f,
                    dx3 = -6.0f,
                    dy3 = 6.0f,
                )
                // s 2.686 6 6 6
                reflectiveCurveToRelative(
                    dx1 = 2.686f,
                    dy1 = 6.0f,
                    dx2 = 6.0f,
                    dy2 = 6.0f,
                )
                // s 6 -2.687 6 -6
                reflectiveCurveToRelative(
                    dx1 = 6.0f,
                    dy1 = -2.687f,
                    dx2 = 6.0f,
                    dy2 = -6.0f,
                )
                // s -2.687 -6 -6 -6z
                reflectiveCurveToRelative(
                    dx1 = -2.687f,
                    dy1 = -6.0f,
                    dx2 = -6.0f,
                    dy2 = -6.0f,
                )
                close()
                // M 14 29
                moveTo(x = 14.0f, y = 29.0f)
                // c -2.209 0 -4 -1.791 -4 -4
                curveToRelative(
                    dx1 = -2.209f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = -1.791f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                // s 1.791 -4 4 -4
                reflectiveCurveToRelative(
                    dx1 = 1.791f,
                    dy1 = -4.0f,
                    dx2 = 4.0f,
                    dy2 = -4.0f,
                )
                // s 4 1.791 4 4
                reflectiveCurveToRelative(
                    dx1 = 4.0f,
                    dy1 = 1.791f,
                    dx2 = 4.0f,
                    dy2 = 4.0f,
                )
                // s -1.791 4 -4 4z
                reflectiveCurveToRelative(
                    dx1 = -1.791f,
                    dy1 = 4.0f,
                    dx2 = -4.0f,
                    dy2 = 4.0f,
                )
                close()
            }
            // M1.783 14.023 v0.02 C0.782 14.263 0 15.939 0 18 s0.782 3.737 1.783 3.956 v0.021 l28.701 7.972 V6.064 L1.783 14.023z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 1.783 14.023
                moveTo(x = 1.783f, y = 14.023f)
                // v 0.02
                verticalLineToRelative(dy = 0.02f)
                // C 0.782 14.263 0 15.939 0 18
                curveTo(
                    x1 = 0.782f,
                    y1 = 14.263f,
                    x2 = 0.0f,
                    y2 = 15.939f,
                    x3 = 0.0f,
                    y3 = 18.0f,
                )
                // s 0.782 3.737 1.783 3.956
                reflectiveCurveToRelative(
                    dx1 = 0.782f,
                    dy1 = 3.737f,
                    dx2 = 1.783f,
                    dy2 = 3.956f,
                )
                // v 0.021
                verticalLineToRelative(dy = 0.021f)
                // l 28.701 7.972
                lineToRelative(dx = 28.701f, dy = 7.972f)
                // V 6.064
                verticalLineTo(y = 6.064f)
                // L 1.783 14.023z
                lineTo(x = 1.783f, y = 14.023f)
                close()
            }
            // M26 18 a5 12 0 1 0 10 0 a5 12 0 1 0 -10 0z
            path(
                fill = SolidColor(Color(0xFF226699)),
            ) {
                // M 26 18
                moveTo(x = 26.0f, y = 18.0f)
                // a 5 12 0 1 0 10 0
                arcToRelative(
                    a = 5.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 10.0f,
                    dy1 = 0.0f,
                )
                // a 5 12 0 1 0 -10 0z
                arcToRelative(
                    a = 5.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -10.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _emoji1f4e3 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f4e3: ImageVector? = null
