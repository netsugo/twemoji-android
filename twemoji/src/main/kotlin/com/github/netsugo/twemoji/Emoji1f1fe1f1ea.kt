package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1fe1f1ea: ImageVector
    get() {
        val current = _emoji1f1fe1f1ea
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1fe1f1ea",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M0 27.063 C0 29.272 1.791 31 4 31 h28 c2.209 0 4 -1.728 4 -3.937 V22 H0 v5.063z
            path(
                fill = SolidColor(Color(0xFF141414)),
            ) {
                // M 0 27.063
                moveTo(x = 0.0f, y = 27.063f)
                // C 0 29.272 1.791 31 4 31
                curveTo(
                    x1 = 0.0f,
                    y1 = 29.272f,
                    x2 = 1.791f,
                    y2 = 31.0f,
                    x3 = 4.0f,
                    y3 = 31.0f,
                )
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // c 2.209 0 4 -1.728 4 -3.937
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = -1.728f,
                    dx3 = 4.0f,
                    dy3 = -3.937f,
                )
                // V 22
                verticalLineTo(y = 22.0f)
                // H 0
                horizontalLineTo(x = 0.0f)
                // v 5.063z
                verticalLineToRelative(dy = 5.063f)
                close()
            }
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
            // M32 5 H4 C1.791 5 0 6.854 0 9.063 V14 h36 V9.063 C36 6.854 34.209 5 32 5z
            path(
                fill = SolidColor(Color(0xFFCE1126)),
            ) {
                // M 32 5
                moveTo(x = 32.0f, y = 5.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // C 1.791 5 0 6.854 0 9.063
                curveTo(
                    x1 = 1.791f,
                    y1 = 5.0f,
                    x2 = 0.0f,
                    y2 = 6.854f,
                    x3 = 0.0f,
                    y3 = 9.063f,
                )
                // V 14
                verticalLineTo(y = 14.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // V 9.063
                verticalLineTo(y = 9.063f)
                // C 36 6.854 34.209 5 32 5z
                curveTo(
                    x1 = 36.0f,
                    y1 = 6.854f,
                    x2 = 34.209f,
                    y2 = 5.0f,
                    x3 = 32.0f,
                    y3 = 5.0f,
                )
                close()
            }
        }.build().also { _emoji1f1fe1f1ea = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1fe1f1ea: ImageVector? = null
