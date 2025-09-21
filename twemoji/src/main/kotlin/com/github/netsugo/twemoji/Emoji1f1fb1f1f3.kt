package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1fb1f1f3: ImageVector
    get() {
        val current = _emoji1f1fb1f1f3
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1fb1f1f3",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M32 5 H4 C1.791 5 0 6.791 0 9 v18 c0 2.209 1.791 4 4 4 h28 c2.209 0 4 -1.791 4 -4 V9 c0 -2.209 -1.791 -4 -4 -4z
            path(
                fill = SolidColor(Color(0xFFDA251D)),
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
            // M19.753 16.037 L18 10.642 l-1.753 5.395 h-5.672 l4.589 3.333 -1.753 5.395 L18 21.431 l4.589 3.334 -1.753 -5.395 4.589 -3.333z
            path(
                fill = SolidColor(Color(0xFFFFFF00)),
            ) {
                // M 19.753 16.037
                moveTo(x = 19.753f, y = 16.037f)
                // L 18 10.642
                lineTo(x = 18.0f, y = 10.642f)
                // l -1.753 5.395
                lineToRelative(dx = -1.753f, dy = 5.395f)
                // h -5.672
                horizontalLineToRelative(dx = -5.672f)
                // l 4.589 3.333
                lineToRelative(dx = 4.589f, dy = 3.333f)
                // l -1.753 5.395
                lineToRelative(dx = -1.753f, dy = 5.395f)
                // L 18 21.431
                lineTo(x = 18.0f, y = 21.431f)
                // l 4.589 3.334
                lineToRelative(dx = 4.589f, dy = 3.334f)
                // l -1.753 -5.395
                lineToRelative(dx = -1.753f, dy = -5.395f)
                // l 4.589 -3.333z
                lineToRelative(dx = 4.589f, dy = -3.333f)
                close()
            }
        }.build().also { _emoji1f1fb1f1f3 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1fb1f1f3: ImageVector? = null
