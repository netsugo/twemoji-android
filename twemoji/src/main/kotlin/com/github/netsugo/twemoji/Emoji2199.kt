package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji2199: ImageVector
    get() {
        val current = _emoji2199
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji2199",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 4 c0 -2.209 -1.791 -4 -4 -4 H4 C1.791 0 0 1.791 0 4 v28 c0 2.209 1.791 4 4 4 h28 c2.209 0 4 -1.791 4 -4 V4z
            path(
                fill = SolidColor(Color(0xFF3B88C3)),
            ) {
                // M 36 4
                moveTo(x = 36.0f, y = 4.0f)
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
                // v 28
                verticalLineToRelative(dy = 28.0f)
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
                // V 4z
                verticalLineTo(y = 4.0f)
                close()
            }
            // M9 11 v16 h16z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 9 11
                moveTo(x = 9.0f, y = 11.0f)
                // v 16
                verticalLineToRelative(dy = 16.0f)
                // h 16z
                horizontalLineToRelative(dx = 16.0f)
                close()
            }
            // M9.53 20.814 L23.343 7 29 12.657 15.186 26.471z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 9.53 20.814
                moveTo(x = 9.53f, y = 20.814f)
                // L 23.343 7
                lineTo(x = 23.343f, y = 7.0f)
                // L 29 12.657
                lineTo(x = 29.0f, y = 12.657f)
                // L 15.186 26.471z
                lineTo(x = 15.186f, y = 26.471f)
                close()
            }
        }.build().also { _emoji2199 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji2199: ImageVector? = null
