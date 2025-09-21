package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1f11f1fb: ImageVector
    get() {
        val current = _emoji1f1f11f1fb
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1f11f1fb",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M32 5 L4 5 C1.791 5 0 6.791 0 9 v6 h36 L36 9 c0 -2.209 -1.791 -4 -4 -4z M32 31 L4 31 c-2.209 0 -4 -1.791 -4 -4 v-6 h36 v6 c0 2.209 -1.791 4 -4 4z
            path(
                fill = SolidColor(Color(0xFF9E3039)),
            ) {
                // M 32 5
                moveTo(x = 32.0f, y = 5.0f)
                // L 4 5
                lineTo(x = 4.0f, y = 5.0f)
                // C 1.791 5 0 6.791 0 9
                curveTo(
                    x1 = 1.791f,
                    y1 = 5.0f,
                    x2 = 0.0f,
                    y2 = 6.791f,
                    x3 = 0.0f,
                    y3 = 9.0f,
                )
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // L 36 9
                lineTo(x = 36.0f, y = 9.0f)
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
                // M 32 31
                moveTo(x = 32.0f, y = 31.0f)
                // L 4 31
                lineTo(x = 4.0f, y = 31.0f)
                // c -2.209 0 -4 -1.791 -4 -4
                curveToRelative(
                    dx1 = -2.209f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = -1.791f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // c 0 2.209 -1.791 4 -4 4z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = -1.791f,
                    dy2 = 4.0f,
                    dx3 = -4.0f,
                    dy3 = 4.0f,
                )
                close()
            }
            // M0 15 h36 v6 H0z
            path(
                fill = SolidColor(Color(0xFFEEEEEE)),
            ) {
                // M 0 15
                moveTo(x = 0.0f, y = 15.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // H 0z
                horizontalLineTo(x = 0.0f)
                close()
            }
        }.build().also { _emoji1f1f11f1fb = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1f11f1fb: ImageVector? = null
