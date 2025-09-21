package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1ed1f1fa: ImageVector
    get() {
        val current = _emoji1f1ed1f1fa
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1ed1f1fa",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M0 14 h36 v8 H0z
            path(
                fill = SolidColor(Color(0xFFEEEEEE)),
            ) {
                // M 0 14
                moveTo(x = 0.0f, y = 14.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // H 0z
                horizontalLineTo(x = 0.0f)
                close()
            }
            // M32 5 H4 C1.791 5 0 6.791 0 9 v5 h36 V9 c0 -2.209 -1.791 -4 -4 -4z
            path(
                fill = SolidColor(Color(0xFFCD2A3E)),
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
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
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
            // M4 31 h28 c2.209 0 4 -1.791 4 -4 v-5 H0 v5 c0 2.209 1.791 4 4 4z
            path(
                fill = SolidColor(Color(0xFF436F4D)),
            ) {
                // M 4 31
                moveTo(x = 4.0f, y = 31.0f)
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
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // H 0
                horizontalLineTo(x = 0.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // c 0 2.209 1.791 4 4 4z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = 1.791f,
                    dy2 = 4.0f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                close()
            }
        }.build().also { _emoji1f1ed1f1fa = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1ed1f1fa: ImageVector? = null
