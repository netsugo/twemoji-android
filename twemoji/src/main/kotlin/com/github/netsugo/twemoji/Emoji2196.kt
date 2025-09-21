package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji2196: ImageVector
    get() {
        val current = _emoji2196
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji2196",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 32 c0 2.209 -1.791 4 -4 4 H4 c-2.209 0 -4 -1.791 -4 -4 V4 c0 -2.209 1.791 -4 4 -4 h28 c2.209 0 4 1.791 4 4 v28z
            path(
                fill = SolidColor(Color(0xFF3B88C3)),
            ) {
                // M 36 32
                moveTo(x = 36.0f, y = 32.0f)
                // c 0 2.209 -1.791 4 -4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = -1.791f,
                    dy2 = 4.0f,
                    dx3 = -4.0f,
                    dy3 = 4.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // c -2.209 0 -4 -1.791 -4 -4
                curveToRelative(
                    dx1 = -2.209f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = -1.791f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
                // c 0 -2.209 1.791 -4 4 -4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.209f,
                    dx2 = 1.791f,
                    dy2 = -4.0f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // c 2.209 0 4 1.791 4 4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = 1.791f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // v 28z
                verticalLineToRelative(dy = 28.0f)
                close()
            }
            // M9 25 V9 h16z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 9 25
                moveTo(x = 9.0f, y = 25.0f)
                // V 9
                verticalLineTo(y = 9.0f)
                // h 16z
                horizontalLineToRelative(dx = 16.0f)
                close()
            }
            // M10.028 15.686 l5.657 -5.657 L29 23.343 23.342 29z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 10.028 15.686
                moveTo(x = 10.028f, y = 15.686f)
                // l 5.657 -5.657
                lineToRelative(dx = 5.657f, dy = -5.657f)
                // L 29 23.343
                lineTo(x = 29.0f, y = 23.343f)
                // L 23.342 29z
                lineTo(x = 23.342f, y = 29.0f)
                close()
            }
        }.build().also { _emoji2196 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji2196: ImageVector? = null
