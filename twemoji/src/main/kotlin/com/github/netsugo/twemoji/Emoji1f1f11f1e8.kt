package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1f11f1e8: ImageVector
    get() {
        val current = _emoji1f1f11f1e8
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1f11f1e8",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M32 5 H4 C1.791 5 0 6.791 0 9 v18 c0 2.209 1.791 4 4 4 h28 c2.209 0 4 -1.791 4 -4 V9 c0 -2.209 -1.791 -4 -4 -4z
            path(
                fill = SolidColor(Color(0xFF66CCFF)),
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
            // M9.333 28.747 l2.346 -2.909 L18 10.2 l6.321 15.638 2.346 2.909 L18 7.34z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 9.333 28.747
                moveTo(x = 9.333f, y = 28.747f)
                // l 2.346 -2.909
                lineToRelative(dx = 2.346f, dy = -2.909f)
                // L 18 10.2
                lineTo(x = 18.0f, y = 10.2f)
                // l 6.321 15.638
                lineToRelative(dx = 6.321f, dy = 15.638f)
                // l 2.346 2.909
                lineToRelative(dx = 2.346f, dy = 2.909f)
                // L 18 7.34z
                lineTo(x = 18.0f, y = 7.34f)
                close()
            }
            // M24.321 25.838 L18 10.2 l-6.321 15.638 L18 18z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 24.321 25.838
                moveTo(x = 24.321f, y = 25.838f)
                // L 18 10.2
                lineTo(x = 18.0f, y = 10.2f)
                // l -6.321 15.638
                lineToRelative(dx = -6.321f, dy = 15.638f)
                // L 18 18z
                lineTo(x = 18.0f, y = 18.0f)
                close()
            }
            // M18 18 l-6.321 7.838 -2.346 2.909 h17.334 l-2.346 -2.909z
            path(
                fill = SolidColor(Color(0xFFFCD116)),
            ) {
                // M 18 18
                moveTo(x = 18.0f, y = 18.0f)
                // l -6.321 7.838
                lineToRelative(dx = -6.321f, dy = 7.838f)
                // l -2.346 2.909
                lineToRelative(dx = -2.346f, dy = 2.909f)
                // h 17.334
                horizontalLineToRelative(dx = 17.334f)
                // l -2.346 -2.909z
                lineToRelative(dx = -2.346f, dy = -2.909f)
                close()
            }
        }.build().also { _emoji1f1f11f1e8 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1f11f1e8: ImageVector? = null
