package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f528: ImageVector
    get() {
        val current = _emoji1f528
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f528",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M29.879 33.879 C31.045 35.045 32.9 35.1 34 34 s1.045 -2.955 -0.121 -4.121 L12.121 8.121 C10.955 6.955 9.1 6.9 8 8 s-1.045 2.955 0.121 4.121 l21.758 21.758z
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 29.879 33.879
                moveTo(x = 29.879f, y = 33.879f)
                // C 31.045 35.045 32.9 35.1 34 34
                curveTo(
                    x1 = 31.045f,
                    y1 = 35.045f,
                    x2 = 32.9f,
                    y2 = 35.1f,
                    x3 = 34.0f,
                    y3 = 34.0f,
                )
                // s 1.045 -2.955 -0.121 -4.121
                reflectiveCurveToRelative(
                    dx1 = 1.045f,
                    dy1 = -2.955f,
                    dx2 = -0.121f,
                    dy2 = -4.121f,
                )
                // L 12.121 8.121
                lineTo(x = 12.121f, y = 8.121f)
                // C 10.955 6.955 9.1 6.9 8 8
                curveTo(
                    x1 = 10.955f,
                    y1 = 6.955f,
                    x2 = 9.1f,
                    y2 = 6.9f,
                    x3 = 8.0f,
                    y3 = 8.0f,
                )
                // s -1.045 2.955 0.121 4.121
                reflectiveCurveToRelative(
                    dx1 = -1.045f,
                    dy1 = 2.955f,
                    dx2 = 0.121f,
                    dy2 = 4.121f,
                )
                // l 21.758 21.758z
                lineToRelative(dx = 21.758f, dy = 21.758f)
                close()
            }
            // M22 3 s-6 -3 -11 2 l-7 7 s-1 -1 -2 0 l-1 1 s-1 1 0 2 l4 4 s1 1 2 0 l1 -1 s1 -1 0 -2 l-0.078 -0.078 c0.77 -0.743 1.923 -1.5 3.078 -0.922 l4 -4 s-1 -3 1 -5 3 -2 5 -2 1 -1 1 -1z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 22 3
                moveTo(x = 22.0f, y = 3.0f)
                // s -6 -3 -11 2
                reflectiveCurveToRelative(
                    dx1 = -6.0f,
                    dy1 = -3.0f,
                    dx2 = -11.0f,
                    dy2 = 2.0f,
                )
                // l -7 7
                lineToRelative(dx = -7.0f, dy = 7.0f)
                // s -1 -1 -2 0
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                    dx2 = -2.0f,
                    dy2 = 0.0f,
                )
                // l -1 1
                lineToRelative(dx = -1.0f, dy = 1.0f)
                // s -1 1 0 2
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                    dx2 = 0.0f,
                    dy2 = 2.0f,
                )
                // l 4 4
                lineToRelative(dx = 4.0f, dy = 4.0f)
                // s 1 1 2 0
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                    dx2 = 2.0f,
                    dy2 = 0.0f,
                )
                // l 1 -1
                lineToRelative(dx = 1.0f, dy = -1.0f)
                // s 1 -1 0 -2
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                    dx2 = 0.0f,
                    dy2 = -2.0f,
                )
                // l -0.078 -0.078
                lineToRelative(dx = -0.078f, dy = -0.078f)
                // c 0.77 -0.743 1.923 -1.5 3.078 -0.922
                curveToRelative(
                    dx1 = 0.77f,
                    dy1 = -0.743f,
                    dx2 = 1.923f,
                    dy2 = -1.5f,
                    dx3 = 3.078f,
                    dy3 = -0.922f,
                )
                // l 4 -4
                lineToRelative(dx = 4.0f, dy = -4.0f)
                // s -1 -3 1 -5
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = -3.0f,
                    dx2 = 1.0f,
                    dy2 = -5.0f,
                )
                // s 3 -2 5 -2
                reflectiveCurveToRelative(
                    dx1 = 3.0f,
                    dy1 = -2.0f,
                    dx2 = 5.0f,
                    dy2 = -2.0f,
                )
                // s 1 -1 1 -1z
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                close()
            }
        }.build().also { _emoji1f528 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f528: ImageVector? = null
