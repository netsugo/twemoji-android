package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f500: ImageVector
    get() {
        val current = _emoji1f500
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f500",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 32 c0 2.209 -1.791 4 -4 4 H4 c-2.209 0 -4 -1.791 -4 -4 V4 c0 -2.209 1.791 -4 4 -4 h28 c2.209 0 4 1.791 4 4 v28z
            path(
                fill = SolidColor(Color(0xFF3B88C3)),
            ) {
                // M 36 32
                moveTo(x = 36.0f, y = 32.0f)
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
                // V 4
                verticalLineTo(y = 4.0f)
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
                // v 28z
                verticalLineToRelative(dy = 28.0f)
                close()
            }
            // M12.953 15.717 c0.549 -1.394 1.234 -2.861 2.175 -4.142 C13.95 10.064 12.351 9 10 9 L7 9 v4 h3 c1.307 0 2.119 0.896 2.953 2.717z M19.48 21.141 c-0.478 1.314 -1.059 2.777 -1.852 4.132 C18.718 26.318 20.117 27 22 27 h3 v-4 h-3 c-1.082 0 -1.822 -0.62 -2.52 -1.859z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 12.953 15.717
                moveTo(x = 12.953f, y = 15.717f)
                // c 0.549 -1.394 1.234 -2.861 2.175 -4.142
                curveToRelative(
                    dx1 = 0.549f,
                    dy1 = -1.394f,
                    dx2 = 1.234f,
                    dy2 = -2.861f,
                    dx3 = 2.175f,
                    dy3 = -4.142f,
                )
                // C 13.95 10.064 12.351 9 10 9
                curveTo(
                    x1 = 13.95f,
                    y1 = 10.064f,
                    x2 = 12.351f,
                    y2 = 9.0f,
                    x3 = 10.0f,
                    y3 = 9.0f,
                )
                // L 7 9
                lineTo(x = 7.0f, y = 9.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // c 1.307 0 2.119 0.896 2.953 2.717z
                curveToRelative(
                    dx1 = 1.307f,
                    dy1 = 0.0f,
                    dx2 = 2.119f,
                    dy2 = 0.896f,
                    dx3 = 2.953f,
                    dy3 = 2.717f,
                )
                close()
                // M 19.48 21.141
                moveTo(x = 19.48f, y = 21.141f)
                // c -0.478 1.314 -1.059 2.777 -1.852 4.132
                curveToRelative(
                    dx1 = -0.478f,
                    dy1 = 1.314f,
                    dx2 = -1.059f,
                    dy2 = 2.777f,
                    dx3 = -1.852f,
                    dy3 = 4.132f,
                )
                // C 18.718 26.318 20.117 27 22 27
                curveTo(
                    x1 = 18.718f,
                    y1 = 26.318f,
                    x2 = 20.117f,
                    y2 = 27.0f,
                    x3 = 22.0f,
                    y3 = 27.0f,
                )
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // c -1.082 0 -1.822 -0.62 -2.52 -1.859z
                curveToRelative(
                    dx1 = -1.082f,
                    dy1 = 0.0f,
                    dx2 = -1.822f,
                    dy2 = -0.62f,
                    dx3 = -2.52f,
                    dy3 = -1.859f,
                )
                close()
            }
            // M10 27 H7 v-4 h3 c1.884 0 2.739 -1.816 4.117 -5.673 C15.441 13.617 17.09 9 22 9 h3 v4 h-3 c-1.885 0 -2.739 1.817 -4.117 5.673 C16.559 22.383 14.91 27 10 27z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 10 27
                moveTo(x = 10.0f, y = 27.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // c 1.884 0 2.739 -1.816 4.117 -5.673
                curveToRelative(
                    dx1 = 1.884f,
                    dy1 = 0.0f,
                    dx2 = 2.739f,
                    dy2 = -1.816f,
                    dx3 = 4.117f,
                    dy3 = -5.673f,
                )
                // C 15.441 13.617 17.09 9 22 9
                curveTo(
                    x1 = 15.441f,
                    y1 = 13.617f,
                    x2 = 17.09f,
                    y2 = 9.0f,
                    x3 = 22.0f,
                    y3 = 9.0f,
                )
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // c -1.885 0 -2.739 1.817 -4.117 5.673
                curveToRelative(
                    dx1 = -1.885f,
                    dy1 = 0.0f,
                    dx2 = -2.739f,
                    dy2 = 1.817f,
                    dx3 = -4.117f,
                    dy3 = 5.673f,
                )
                // C 16.559 22.383 14.91 27 10 27z
                curveTo(
                    x1 = 16.559f,
                    y1 = 22.383f,
                    x2 = 14.91f,
                    y2 = 27.0f,
                    x3 = 10.0f,
                    y3 = 27.0f,
                )
                close()
            }
            // M30.2 11 L23 5 v12z M30.2 25 L23 19 v12z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 30.2 11
                moveTo(x = 30.2f, y = 11.0f)
                // L 23 5
                lineTo(x = 23.0f, y = 5.0f)
                // v 12z
                verticalLineToRelative(dy = 12.0f)
                close()
                // M 30.2 25
                moveTo(x = 30.2f, y = 25.0f)
                // L 23 19
                lineTo(x = 23.0f, y = 19.0f)
                // v 12z
                verticalLineToRelative(dy = 12.0f)
                close()
            }
        }.build().also { _emoji1f500 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f500: ImageVector? = null
