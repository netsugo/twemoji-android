package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1f31f1ec: ImageVector
    get() {
        val current = _emoji1f1f31f1ec
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1f31f1ec",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M4 5 C1.791 5 0 6.791 0 9 v18 c0 2.209 1.791 4 4 4 h8 V5 H4z
            path(
                fill = SolidColor(Color(0xFF009A49)),
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
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // V 5
                verticalLineTo(y = 5.0f)
                // H 4z
                horizontalLineTo(x = 4.0f)
                close()
            }
            // M12 5 h12 v26 H12z
            path(
                fill = SolidColor(Color(0xFFEEEEEE)),
            ) {
                // M 12 5
                moveTo(x = 12.0f, y = 5.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // v 26
                verticalLineToRelative(dy = 26.0f)
                // H 12z
                horizontalLineTo(x = 12.0f)
                close()
            }
            // M32 5 h-8 v26 h8 c2.209 0 4 -1.791 4 -4 V9 c0 -2.209 -1.791 -4 -4 -4z
            path(
                fill = SolidColor(Color(0xFF009A49)),
            ) {
                // M 32 5
                moveTo(x = 32.0f, y = 5.0f)
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // v 26
                verticalLineToRelative(dy = 26.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
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
        }.build().also { _emoji1f1f31f1ec = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1f31f1ec: ImageVector? = null
