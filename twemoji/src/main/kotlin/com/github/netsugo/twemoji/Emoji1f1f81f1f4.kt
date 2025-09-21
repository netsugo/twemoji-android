package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1f81f1f4: ImageVector
    get() {
        val current = _emoji1f1f81f1f4
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1f81f1f4",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M32 5 H4 C1.791 5 0 6.791 0 9 v18 c0 2.209 1.791 4 4 4 h28 c2.209 0 4 -1.791 4 -4 V9 c0 -2.209 -1.791 -4 -4 -4z
            path(
                fill = SolidColor(Color(0xFF4189DD)),
            ) {
                // M 32 5
                moveTo(x = 32.0f, y = 5.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // C 1.791 5 0 6.791 0 9
                curveTo(
                    x1 = 1.791f,
                    y1 = 5.0f,
                    x2 = 0.0f,
                    y2 = 6.791f,
                    x3 = 0.0f,
                    y3 = 9.0f,
                )
                // v 18
                verticalLineToRelative(dy = 18.0f)
                // c 0 2.209 1.791 4 4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = 1.791f,
                    dy2 = 4.0f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // c 2.209 0 4 -1.791 4 -4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = -1.791f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // V 9
                verticalLineTo(y = 9.0f)
                // c 0 -2.209 -1.791 -4 -4 -4z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.209f,
                    dx2 = -1.791f,
                    dy2 = -4.0f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                close()
            }
            // M19.405 16.066 L18 11.741 l-1.405 4.325 h-4.548 l3.679 2.673 -1.405 4.325 L18 20.391 l3.679 2.673 -1.405 -4.325 3.679 -2.673z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 19.405 16.066
                moveTo(x = 19.405f, y = 16.066f)
                // L 18 11.741
                lineTo(x = 18.0f, y = 11.741f)
                // l -1.405 4.325
                lineToRelative(dx = -1.405f, dy = 4.325f)
                // h -4.548
                horizontalLineToRelative(dx = -4.548f)
                // l 3.679 2.673
                lineToRelative(dx = 3.679f, dy = 2.673f)
                // l -1.405 4.325
                lineToRelative(dx = -1.405f, dy = 4.325f)
                // L 18 20.391
                lineTo(x = 18.0f, y = 20.391f)
                // l 3.679 2.673
                lineToRelative(dx = 3.679f, dy = 2.673f)
                // l -1.405 -4.325
                lineToRelative(dx = -1.405f, dy = -4.325f)
                // l 3.679 -2.673z
                lineToRelative(dx = 3.679f, dy = -2.673f)
                close()
            }
        }.build().also { _emoji1f1f81f1f4 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1f81f1f4: ImageVector? = null
