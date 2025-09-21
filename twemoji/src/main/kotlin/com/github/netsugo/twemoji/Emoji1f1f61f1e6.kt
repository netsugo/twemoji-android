package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1f61f1e6: ImageVector
    get() {
        val current = _emoji1f1f61f1e6
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1f61f1e6",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M32 5 H11 v26 h21 c2.209 0 4 -1.791 4 -4 V9 c0 -2.209 -1.791 -4 -4 -4z
            path(
                fill = SolidColor(Color(0xFF8D1B3D)),
            ) {
                // M 32 5
                moveTo(x = 32.0f, y = 5.0f)
                // H 11
                horizontalLineTo(x = 11.0f)
                // v 26
                verticalLineToRelative(dy = 26.0f)
                // h 21
                horizontalLineToRelative(dx = 21.0f)
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
            // M11 28.111 l5.295 -1.444 L11 25.222 l5.295 -1.444 L11 22.333 l5.295 -1.444 L11 19.444 16.295 18 11 16.556 l5.295 -1.444 L11 13.667 l5.295 -1.444 L11 10.778 l5.295 -1.445 L11 7.889 l5.295 -1.444 L11 5 H4 C1.791 5 0 6.791 0 9 v18 c0 2.209 1.791 4 4 4 h7 l5.295 -1.444 L11 28.111z
            path(
                fill = SolidColor(Color(0xFFEEEEEE)),
            ) {
                // M 11 28.111
                moveTo(x = 11.0f, y = 28.111f)
                // l 5.295 -1.444
                lineToRelative(dx = 5.295f, dy = -1.444f)
                // L 11 25.222
                lineTo(x = 11.0f, y = 25.222f)
                // l 5.295 -1.444
                lineToRelative(dx = 5.295f, dy = -1.444f)
                // L 11 22.333
                lineTo(x = 11.0f, y = 22.333f)
                // l 5.295 -1.444
                lineToRelative(dx = 5.295f, dy = -1.444f)
                // L 11 19.444
                lineTo(x = 11.0f, y = 19.444f)
                // L 16.295 18
                lineTo(x = 16.295f, y = 18.0f)
                // L 11 16.556
                lineTo(x = 11.0f, y = 16.556f)
                // l 5.295 -1.444
                lineToRelative(dx = 5.295f, dy = -1.444f)
                // L 11 13.667
                lineTo(x = 11.0f, y = 13.667f)
                // l 5.295 -1.444
                lineToRelative(dx = 5.295f, dy = -1.444f)
                // L 11 10.778
                lineTo(x = 11.0f, y = 10.778f)
                // l 5.295 -1.445
                lineToRelative(dx = 5.295f, dy = -1.445f)
                // L 11 7.889
                lineTo(x = 11.0f, y = 7.889f)
                // l 5.295 -1.444
                lineToRelative(dx = 5.295f, dy = -1.444f)
                // L 11 5
                lineTo(x = 11.0f, y = 5.0f)
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
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // l 5.295 -1.444
                lineToRelative(dx = 5.295f, dy = -1.444f)
                // L 11 28.111z
                lineTo(x = 11.0f, y = 28.111f)
                close()
            }
        }.build().also { _emoji1f1f61f1e6 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1f61f1e6: ImageVector? = null
