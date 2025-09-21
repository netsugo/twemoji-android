package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1e61f1ea: ImageVector
    get() {
        val current = _emoji1f1e61f1ea
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1e61f1ea",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M32 5 H9 v9 h27 V9 c0 -2.209 -1.791 -4 -4 -4z
            path(
                fill = SolidColor(Color(0xFF068241)),
            ) {
                // M 32 5
                moveTo(x = 32.0f, y = 5.0f)
                // H 9
                horizontalLineTo(x = 9.0f)
                // v 9
                verticalLineToRelative(dy = 9.0f)
                // h 27
                horizontalLineToRelative(dx = 27.0f)
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
            // M9 14 h27 v8 H9z
            path(
                fill = SolidColor(Color(0xFFEEEEEE)),
            ) {
                // M 9 14
                moveTo(x = 9.0f, y = 14.0f)
                // h 27
                horizontalLineToRelative(dx = 27.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // H 9z
                horizontalLineTo(x = 9.0f)
                close()
            }
            // M9 31 h23 c2.209 0 4 -1.791 4 -4 v-5 H9 v9z
            path(
                fill = SolidColor(Color(0xFF141414)),
            ) {
                // M 9 31
                moveTo(x = 9.0f, y = 31.0f)
                // h 23
                horizontalLineToRelative(dx = 23.0f)
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
                // H 9
                horizontalLineTo(x = 9.0f)
                // v 9z
                verticalLineToRelative(dy = 9.0f)
                close()
            }
            // M4 5 C1.791 5 0 6.791 0 9 v18 c0 2.209 1.791 4 4 4 h5 V5 H4z
            path(
                fill = SolidColor(Color(0xFFEC2028)),
            ) {
                // M 4 5
                moveTo(x = 4.0f, y = 5.0f)
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
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // V 5
                verticalLineTo(y = 5.0f)
                // H 4z
                horizontalLineTo(x = 4.0f)
                close()
            }
        }.build().also { _emoji1f1e61f1ea = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1e61f1ea: ImageVector? = null
