package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji2194: ImageVector
    get() {
        val current = _emoji2194
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji2194",
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
            // M13 9 L3 18 l10 9z M33 18 L23 9 v18z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 13 9
                moveTo(x = 13.0f, y = 9.0f)
                // L 3 18
                lineTo(x = 3.0f, y = 18.0f)
                // l 10 9z
                lineToRelative(dx = 10.0f, dy = 9.0f)
                close()
                // M 33 18
                moveTo(x = 33.0f, y = 18.0f)
                // L 23 9
                lineTo(x = 23.0f, y = 9.0f)
                // v 18z
                verticalLineToRelative(dy = 18.0f)
                close()
            }
            // M12 14 h12 v8 H12z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 12 14
                moveTo(x = 12.0f, y = 14.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // H 12z
                horizontalLineTo(x = 12.0f)
                close()
            }
        }.build().also { _emoji2194 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji2194: ImageVector? = null
