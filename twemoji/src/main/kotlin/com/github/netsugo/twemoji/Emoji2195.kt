package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji2195: ImageVector
    get() {
        val current = _emoji2195
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji2195",
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
            // M27 13 L18 3 9 13z M18 33 l9 -10 L9 23z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 27 13
                moveTo(x = 27.0f, y = 13.0f)
                // L 18 3
                lineTo(x = 18.0f, y = 3.0f)
                // L 9 13z
                lineTo(x = 9.0f, y = 13.0f)
                close()
                // M 18 33
                moveTo(x = 18.0f, y = 33.0f)
                // l 9 -10
                lineToRelative(dx = 9.0f, dy = -10.0f)
                // L 9 23z
                lineTo(x = 9.0f, y = 23.0f)
                close()
            }
            // M14 12 h8 v12 h-8z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 14 12
                moveTo(x = 14.0f, y = 12.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // h -8z
                horizontalLineToRelative(dx = -8.0f)
                close()
            }
        }.build().also { _emoji2195 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji2195: ImageVector? = null
