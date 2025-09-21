package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji23ef: ImageVector
    get() {
        val current = _emoji23ef
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji23ef",
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
            // M6 7 l13 11 L6 29z M26 7 h4 v22 h-4z M19 7 h4 v22 h-4z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 6 7
                moveTo(x = 6.0f, y = 7.0f)
                // l 13 11
                lineToRelative(dx = 13.0f, dy = 11.0f)
                // L 6 29z
                lineTo(x = 6.0f, y = 29.0f)
                close()
                // M 26 7
                moveTo(x = 26.0f, y = 7.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 22
                verticalLineToRelative(dy = 22.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
                // M 19 7
                moveTo(x = 19.0f, y = 7.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 22
                verticalLineToRelative(dy = 22.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
        }.build().also { _emoji23ef = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji23ef: ImageVector? = null
