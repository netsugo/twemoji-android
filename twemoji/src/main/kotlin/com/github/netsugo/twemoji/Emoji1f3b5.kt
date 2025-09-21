package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f3b5: ImageVector
    get() {
        val current = _emoji1f3b5
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f3b5",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M34.209 0.206 L11.791 2.793 C10.806 2.907 10 3.811 10 4.803 v18.782 C9.09 23.214 8.075 23 7 23 c-3.865 0 -7 2.685 -7 6 0 3.314 3.135 6 7 6 s7 -2.686 7 -6 V10.539 l18 -2.077 v13.124 c-0.91 -0.372 -1.925 -0.586 -3 -0.586 -3.865 0 -7 2.685 -7 6 0 3.314 3.135 6 7 6 s7 -2.686 7 -6 V1.803 c0 -0.992 -0.806 -1.71 -1.791 -1.597z
            path(
                fill = SolidColor(Color(0xFF5DADEC)),
            ) {
                // M 34.209 0.206
                moveTo(x = 34.209f, y = 0.206f)
                // L 11.791 2.793
                lineTo(x = 11.791f, y = 2.793f)
                // C 10.806 2.907 10 3.811 10 4.803
                curveTo(
                    x1 = 10.806f,
                    y1 = 2.907f,
                    x2 = 10.0f,
                    y2 = 3.811f,
                    x3 = 10.0f,
                    y3 = 4.803f,
                )
                // v 18.782
                verticalLineToRelative(dy = 18.782f)
                // C 9.09 23.214 8.075 23 7 23
                curveTo(
                    x1 = 9.09f,
                    y1 = 23.214f,
                    x2 = 8.075f,
                    y2 = 23.0f,
                    x3 = 7.0f,
                    y3 = 23.0f,
                )
                // c -3.865 0 -7 2.685 -7 6
                curveToRelative(
                    dx1 = -3.865f,
                    dy1 = 0.0f,
                    dx2 = -7.0f,
                    dy2 = 2.685f,
                    dx3 = -7.0f,
                    dy3 = 6.0f,
                )
                // c 0 3.314 3.135 6 7 6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.314f,
                    dx2 = 3.135f,
                    dy2 = 6.0f,
                    dx3 = 7.0f,
                    dy3 = 6.0f,
                )
                // s 7 -2.686 7 -6
                reflectiveCurveToRelative(
                    dx1 = 7.0f,
                    dy1 = -2.686f,
                    dx2 = 7.0f,
                    dy2 = -6.0f,
                )
                // V 10.539
                verticalLineTo(y = 10.539f)
                // l 18 -2.077
                lineToRelative(dx = 18.0f, dy = -2.077f)
                // v 13.124
                verticalLineToRelative(dy = 13.124f)
                // c -0.91 -0.372 -1.925 -0.586 -3 -0.586
                curveToRelative(
                    dx1 = -0.91f,
                    dy1 = -0.372f,
                    dx2 = -1.925f,
                    dy2 = -0.586f,
                    dx3 = -3.0f,
                    dy3 = -0.586f,
                )
                // c -3.865 0 -7 2.685 -7 6
                curveToRelative(
                    dx1 = -3.865f,
                    dy1 = 0.0f,
                    dx2 = -7.0f,
                    dy2 = 2.685f,
                    dx3 = -7.0f,
                    dy3 = 6.0f,
                )
                // c 0 3.314 3.135 6 7 6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.314f,
                    dx2 = 3.135f,
                    dy2 = 6.0f,
                    dx3 = 7.0f,
                    dy3 = 6.0f,
                )
                // s 7 -2.686 7 -6
                reflectiveCurveToRelative(
                    dx1 = 7.0f,
                    dy1 = -2.686f,
                    dx2 = 7.0f,
                    dy2 = -6.0f,
                )
                // V 1.803
                verticalLineTo(y = 1.803f)
                // c 0 -0.992 -0.806 -1.71 -1.791 -1.597z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.992f,
                    dx2 = -0.806f,
                    dy2 = -1.71f,
                    dx3 = -1.791f,
                    dy3 = -1.597f,
                )
                close()
            }
        }.build().also { _emoji1f3b5 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f3b5: ImageVector? = null
