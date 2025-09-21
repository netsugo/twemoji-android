package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1e71f1ed: ImageVector
    get() {
        val current = _emoji1f1e71f1ed
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1e71f1ed",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M15 6 L8 5 H4 C1.791 5 0 6.791 0 9 v18 c0 2.209 1.791 4 4 4 h4 l7 -1 V6z
            path(
                fill = SolidColor(Color(0xFFEEEEEE)),
            ) {
                // M 15 6
                moveTo(x = 15.0f, y = 6.0f)
                // L 8 5
                lineTo(x = 8.0f, y = 5.0f)
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
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // l 7 -1
                lineToRelative(dx = 7.0f, dy = -1.0f)
                // V 6z
                verticalLineTo(y = 6.0f)
                close()
            }
            // M32 5 H8 l6.081 2.6 L8 10.2 l6.081 2.6 L8 15.4 l6.081 2.6 L8 20.6 l6.081 2.6 L8 25.8 l6.081 2.6 L8 31 h24 c2.209 0 4 -1.791 4 -4 V9 c0 -2.209 -1.791 -4 -4 -4z
            path(
                fill = SolidColor(Color(0xFFCE1126)),
            ) {
                // M 32 5
                moveTo(x = 32.0f, y = 5.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // l 6.081 2.6
                lineToRelative(dx = 6.081f, dy = 2.6f)
                // L 8 10.2
                lineTo(x = 8.0f, y = 10.2f)
                // l 6.081 2.6
                lineToRelative(dx = 6.081f, dy = 2.6f)
                // L 8 15.4
                lineTo(x = 8.0f, y = 15.4f)
                // l 6.081 2.6
                lineToRelative(dx = 6.081f, dy = 2.6f)
                // L 8 20.6
                lineTo(x = 8.0f, y = 20.6f)
                // l 6.081 2.6
                lineToRelative(dx = 6.081f, dy = 2.6f)
                // L 8 25.8
                lineTo(x = 8.0f, y = 25.8f)
                // l 6.081 2.6
                lineToRelative(dx = 6.081f, dy = 2.6f)
                // L 8 31
                lineTo(x = 8.0f, y = 31.0f)
                // h 24
                horizontalLineToRelative(dx = 24.0f)
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
        }.build().also { _emoji1f1e71f1ed = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1e71f1ed: ImageVector? = null
