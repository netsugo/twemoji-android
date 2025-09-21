package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1f21f1f2: ImageVector
    get() {
        val current = _emoji1f1f21f1f2
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1f21f1f2",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M0 27 c0 2.209 1.791 4 4 4 h28 c2.209 0 4 -1.791 4 -4 v-4 H0 v4z
            path(
                fill = SolidColor(Color(0xFFEA2839)),
            ) {
                // M 0 27
                moveTo(x = 0.0f, y = 27.0f)
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
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // H 0
                horizontalLineTo(x = 0.0f)
                // v 4z
                verticalLineToRelative(dy = 4.0f)
                close()
            }
            // M0 13 h36 v10 H0z
            path(
                fill = SolidColor(Color(0xFF34B232)),
            ) {
                // M 0 13
                moveTo(x = 0.0f, y = 13.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // H 0z
                horizontalLineTo(x = 0.0f)
                close()
            }
            // M32 5 H4 C1.791 5 0 6.791 0 9 v4 h36 V9 c0 -2.209 -1.791 -4 -4 -4z
            path(
                fill = SolidColor(Color(0xFFFECB01)),
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
                // v 4
                verticalLineToRelative(dy = 4.0f)
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
            // M18 8.76 L20.353 16 h7.613 l-6.159 4.333 2.352 7.169 L18 22.992 l-6.159 4.458 2.353 -7.107 L8.035 16 h7.613z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 18 8.76
                moveTo(x = 18.0f, y = 8.76f)
                // L 20.353 16
                lineTo(x = 20.353f, y = 16.0f)
                // h 7.613
                horizontalLineToRelative(dx = 7.613f)
                // l -6.159 4.333
                lineToRelative(dx = -6.159f, dy = 4.333f)
                // l 2.352 7.169
                lineToRelative(dx = 2.352f, dy = 7.169f)
                // L 18 22.992
                lineTo(x = 18.0f, y = 22.992f)
                // l -6.159 4.458
                lineToRelative(dx = -6.159f, dy = 4.458f)
                // l 2.353 -7.107
                lineToRelative(dx = 2.353f, dy = -7.107f)
                // L 8.035 16
                lineTo(x = 8.035f, y = 16.0f)
                // h 7.613z
                horizontalLineToRelative(dx = 7.613f)
                close()
            }
        }.build().also { _emoji1f1f21f1f2 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1f21f1f2: ImageVector? = null
