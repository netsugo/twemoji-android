package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji21aa: ImageVector
    get() {
        val current = _emoji21aa
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji21aa",
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
            // M29.2 25 L22 19 v4 h-4 c-3.865 0 -7 -3.135 -7 -7 0 -3.866 3.135 -7 7 -7 h8 V5 h-8 C11.926 5 7 9.925 7 16 c0 6.074 4.926 11 11 11 h4 v4 l7.2 -6z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 29.2 25
                moveTo(x = 29.2f, y = 25.0f)
                // L 22 19
                lineTo(x = 22.0f, y = 19.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // c -3.865 0 -7 -3.135 -7 -7
                curveToRelative(
                    dx1 = -3.865f,
                    dy1 = 0.0f,
                    dx2 = -7.0f,
                    dy2 = -3.135f,
                    dx3 = -7.0f,
                    dy3 = -7.0f,
                )
                // c 0 -3.866 3.135 -7 7 -7
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.866f,
                    dx2 = 3.135f,
                    dy2 = -7.0f,
                    dx3 = 7.0f,
                    dy3 = -7.0f,
                )
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // V 5
                verticalLineTo(y = 5.0f)
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // C 11.926 5 7 9.925 7 16
                curveTo(
                    x1 = 11.926f,
                    y1 = 5.0f,
                    x2 = 7.0f,
                    y2 = 9.925f,
                    x3 = 7.0f,
                    y3 = 16.0f,
                )
                // c 0 6.074 4.926 11 11 11
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 6.074f,
                    dx2 = 4.926f,
                    dy2 = 11.0f,
                    dx3 = 11.0f,
                    dy3 = 11.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // l 7.2 -6z
                lineToRelative(dx = 7.2f, dy = -6.0f)
                close()
            }
        }.build().also { _emoji21aa = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji21aa: ImageVector? = null
