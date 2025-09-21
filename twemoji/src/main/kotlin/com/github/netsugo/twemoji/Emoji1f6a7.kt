package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f6a7: ImageVector
    get() {
        val current = _emoji1f6a7
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f6a7",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 15 c0 2.209 -1.791 4 -4 4 H4 c-2.209 0 -4 -1.791 -4 -4 V7 c0 -2.209 1.791 -4 4 -4 h28 c2.209 0 4 1.791 4 4 v8z
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 36 15
                moveTo(x = 36.0f, y = 15.0f)
                // c 0 2.209 -1.791 4 -4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = -1.791f,
                    dy2 = 4.0f,
                    dx3 = -4.0f,
                    dy3 = 4.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // c -2.209 0 -4 -1.791 -4 -4
                curveToRelative(
                    dx1 = -2.209f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = -1.791f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                // V 7
                verticalLineTo(y = 7.0f)
                // c 0 -2.209 1.791 -4 4 -4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.209f,
                    dx2 = 1.791f,
                    dy2 = -4.0f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // c 2.209 0 4 1.791 4 4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = 1.791f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // v 8z
                verticalLineToRelative(dy = 8.0f)
                close()
            }
            // M6 3 L4 3 C1.791 3 0 4.791 0 7 v2 l6 -6z M12 3 L0 15 c0 1.36 0.682 2.558 1.72 3.28 L17 3 h-5z M7 19 h5 L28 3 h-5z M23 19 L35.892 6.108 c-0.281 -1.23 -1.126 -2.24 -2.252 -2.748 L18 19 h5z M36 15 v-3 l-7 7 h3 c2.209 0 4 -1.791 4 -4z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 6 3
                moveTo(x = 6.0f, y = 3.0f)
                // L 4 3
                lineTo(x = 4.0f, y = 3.0f)
                // C 1.791 3 0 4.791 0 7
                curveTo(
                    x1 = 1.791f,
                    y1 = 3.0f,
                    x2 = 0.0f,
                    y2 = 4.791f,
                    x3 = 0.0f,
                    y3 = 7.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // l 6 -6z
                lineToRelative(dx = 6.0f, dy = -6.0f)
                close()
                // M 12 3
                moveTo(x = 12.0f, y = 3.0f)
                // L 0 15
                lineTo(x = 0.0f, y = 15.0f)
                // c 0 1.36 0.682 2.558 1.72 3.28
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.36f,
                    dx2 = 0.682f,
                    dy2 = 2.558f,
                    dx3 = 1.72f,
                    dy3 = 3.28f,
                )
                // L 17 3
                lineTo(x = 17.0f, y = 3.0f)
                // h -5z
                horizontalLineToRelative(dx = -5.0f)
                close()
                // M 7 19
                moveTo(x = 7.0f, y = 19.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // L 28 3
                lineTo(x = 28.0f, y = 3.0f)
                // h -5z
                horizontalLineToRelative(dx = -5.0f)
                close()
                // M 23 19
                moveTo(x = 23.0f, y = 19.0f)
                // L 35.892 6.108
                lineTo(x = 35.892f, y = 6.108f)
                // c -0.281 -1.23 -1.126 -2.24 -2.252 -2.748
                curveToRelative(
                    dx1 = -0.281f,
                    dy1 = -1.23f,
                    dx2 = -1.126f,
                    dy2 = -2.24f,
                    dx3 = -2.252f,
                    dy3 = -2.748f,
                )
                // L 18 19
                lineTo(x = 18.0f, y = 19.0f)
                // h 5z
                horizontalLineToRelative(dx = 5.0f)
                close()
                // M 36 15
                moveTo(x = 36.0f, y = 15.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // l -7 7
                lineToRelative(dx = -7.0f, dy = 7.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // c 2.209 0 4 -1.791 4 -4z
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = -1.791f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                close()
            }
            // M4 19 h5 v14 L4 33z M27 19 h5 v14 h-5z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 4 19
                moveTo(x = 4.0f, y = 19.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // L 4 33z
                lineTo(x = 4.0f, y = 33.0f)
                close()
                // M 27 19
                moveTo(x = 27.0f, y = 19.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // h -5z
                horizontalLineToRelative(dx = -5.0f)
                close()
            }
        }.build().also { _emoji1f6a7 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f6a7: ImageVector? = null
