package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji25c0: ImageVector
    get() {
        val current = _emoji25c0
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji25c0",
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
            // M28 7 L6 18 l22 11z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 28 7
                moveTo(x = 28.0f, y = 7.0f)
                // L 6 18
                lineTo(x = 6.0f, y = 18.0f)
                // l 22 11z
                lineToRelative(dx = 22.0f, dy = 11.0f)
                close()
            }
        }.build().also { _emoji25c0 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji25c0: ImageVector? = null
