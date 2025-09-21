package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji2197: ImageVector
    get() {
        val current = _emoji2197
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji2197",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M0 32 c0 2.209 1.791 4 4 4 h28 c2.209 0 4 -1.791 4 -4 V4 c0 -2.209 -1.791 -4 -4 -4 H4 C1.791 0 0 1.791 0 4 v28z
            path(
                fill = SolidColor(Color(0xFF3B88C3)),
            ) {
                // M 0 32
                moveTo(x = 0.0f, y = 32.0f)
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
                // V 4
                verticalLineTo(y = 4.0f)
                // c 0 -2.209 -1.791 -4 -4 -4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.209f,
                    dx2 = -1.791f,
                    dy2 = -4.0f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // C 1.791 0 0 1.791 0 4
                curveTo(
                    x1 = 1.791f,
                    y1 = 0.0f,
                    x2 = 0.0f,
                    y2 = 1.791f,
                    x3 = 0.0f,
                    y3 = 4.0f,
                )
                // v 28z
                verticalLineToRelative(dy = 28.0f)
                close()
            }
            // M27 25 V9 H11z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 27 25
                moveTo(x = 27.0f, y = 25.0f)
                // V 9
                verticalLineTo(y = 9.0f)
                // H 11z
                horizontalLineTo(x = 11.0f)
                close()
            }
            // M7 23.343 L19.816 10.53 l5.656 5.657 L12.657 29z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 7 23.343
                moveTo(x = 7.0f, y = 23.343f)
                // L 19.816 10.53
                lineTo(x = 19.816f, y = 10.53f)
                // l 5.656 5.657
                lineToRelative(dx = 5.656f, dy = 5.657f)
                // L 12.657 29z
                lineTo(x = 12.657f, y = 29.0f)
                close()
            }
        }.build().also { _emoji2197 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji2197: ImageVector? = null
