package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji231a: ImageVector
    get() {
        val current = _emoji231a
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji231a",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M25 32 c0 2.209 -1.791 4 -4 4 h-6 c-2.209 0 -4 -1.791 -4 -4 V4 c0 -2.209 1.791 -4 4 -4 h6 c2.209 0 4 1.791 4 4 v28z
            path(
                fill = SolidColor(Color(0xFF31373D)),
            ) {
                // M 25 32
                moveTo(x = 25.0f, y = 32.0f)
                // c 0 2.209 -1.791 4 -4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = -1.791f,
                    dy2 = 4.0f,
                    dx3 = -4.0f,
                    dy3 = 4.0f,
                )
                // h -6
                horizontalLineToRelative(dx = -6.0f)
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
                // h 6
                horizontalLineToRelative(dx = 6.0f)
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
            // M32 18 c0 -1.104 -0.896 -2 -2 -2 h-1 c-1.104 0 -2 0.896 -2 2 s0.896 2 2 2 h1 c1.104 0 2 -0.896 2 -2z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 32 18
                moveTo(x = 32.0f, y = 18.0f)
                // c 0 -1.104 -0.896 -2 -2 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.104f,
                    dx2 = -0.896f,
                    dy2 = -2.0f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // c -1.104 0 -2 0.896 -2 2
                curveToRelative(
                    dx1 = -1.104f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = 0.896f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // s 0.896 2 2 2
                reflectiveCurveToRelative(
                    dx1 = 0.896f,
                    dy1 = 2.0f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // c 1.104 0 2 -0.896 2 -2z
                curveToRelative(
                    dx1 = 1.104f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = -0.896f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                close()
            }
            // M6 18 c0 -6.627 5.373 -12 12 -12 6.628 0 12 5.373 12 12 s-5.372 12 -12 12 c-6.627 0 -12 -5.373 -12 -12z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 6 18
                moveTo(x = 6.0f, y = 18.0f)
                // c 0 -6.627 5.373 -12 12 -12
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -6.627f,
                    dx2 = 5.373f,
                    dy2 = -12.0f,
                    dx3 = 12.0f,
                    dy3 = -12.0f,
                )
                // c 6.628 0 12 5.373 12 12
                curveToRelative(
                    dx1 = 6.628f,
                    dy1 = 0.0f,
                    dx2 = 12.0f,
                    dy2 = 5.373f,
                    dx3 = 12.0f,
                    dy3 = 12.0f,
                )
                // s -5.372 12 -12 12
                reflectiveCurveToRelative(
                    dx1 = -5.372f,
                    dy1 = 12.0f,
                    dx2 = -12.0f,
                    dy2 = 12.0f,
                )
                // c -6.627 0 -12 -5.373 -12 -12z
                curveToRelative(
                    dx1 = -6.627f,
                    dy1 = 0.0f,
                    dx2 = -12.0f,
                    dy2 = -5.373f,
                    dx3 = -12.0f,
                    dy3 = -12.0f,
                )
                close()
            }
            // M10 18 c0 -4.418 3.582 -8 8 -8 4.419 0 8 3.582 8 8 s-3.581 8 -8 8 c-4.418 0 -8 -3.582 -8 -8z
            path(
                fill = SolidColor(Color(0xFFF5F8FA)),
            ) {
                // M 10 18
                moveTo(x = 10.0f, y = 18.0f)
                // c 0 -4.418 3.582 -8 8 -8
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.418f,
                    dx2 = 3.582f,
                    dy2 = -8.0f,
                    dx3 = 8.0f,
                    dy3 = -8.0f,
                )
                // c 4.419 0 8 3.582 8 8
                curveToRelative(
                    dx1 = 4.419f,
                    dy1 = 0.0f,
                    dx2 = 8.0f,
                    dy2 = 3.582f,
                    dx3 = 8.0f,
                    dy3 = 8.0f,
                )
                // s -3.581 8 -8 8
                reflectiveCurveToRelative(
                    dx1 = -3.581f,
                    dy1 = 8.0f,
                    dx2 = -8.0f,
                    dy2 = 8.0f,
                )
                // c -4.418 0 -8 -3.582 -8 -8z
                curveToRelative(
                    dx1 = -4.418f,
                    dy1 = 0.0f,
                    dx2 = -8.0f,
                    dy2 = -3.582f,
                    dx3 = -8.0f,
                    dy3 = -8.0f,
                )
                close()
            }
            // M23 22 c-0.175 0 -0.353 -0.046 -0.514 -0.143 l-5 -3 c-0.301 -0.18 -0.486 -0.505 -0.486 -0.857 v-7 c0 -0.552 0.448 -1 1 -1 s1 0.448 1 1 v6.434 l4.516 2.708 c0.474 0.284 0.627 0.898 0.343 1.372 -0.188 0.313 -0.519 0.486 -0.859 0.486z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 23 22
                moveTo(x = 23.0f, y = 22.0f)
                // c -0.175 0 -0.353 -0.046 -0.514 -0.143
                curveToRelative(
                    dx1 = -0.175f,
                    dy1 = 0.0f,
                    dx2 = -0.353f,
                    dy2 = -0.046f,
                    dx3 = -0.514f,
                    dy3 = -0.143f,
                )
                // l -5 -3
                lineToRelative(dx = -5.0f, dy = -3.0f)
                // c -0.301 -0.18 -0.486 -0.505 -0.486 -0.857
                curveToRelative(
                    dx1 = -0.301f,
                    dy1 = -0.18f,
                    dx2 = -0.486f,
                    dy2 = -0.505f,
                    dx3 = -0.486f,
                    dy3 = -0.857f,
                )
                // v -7
                verticalLineToRelative(dy = -7.0f)
                // c 0 -0.552 0.448 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = 0.448f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // s 1 0.448 1 1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.448f,
                    dx2 = 1.0f,
                    dy2 = 1.0f,
                )
                // v 6.434
                verticalLineToRelative(dy = 6.434f)
                // l 4.516 2.708
                lineToRelative(dx = 4.516f, dy = 2.708f)
                // c 0.474 0.284 0.627 0.898 0.343 1.372
                curveToRelative(
                    dx1 = 0.474f,
                    dy1 = 0.284f,
                    dx2 = 0.627f,
                    dy2 = 0.898f,
                    dx3 = 0.343f,
                    dy3 = 1.372f,
                )
                // c -0.188 0.313 -0.519 0.486 -0.859 0.486z
                curveToRelative(
                    dx1 = -0.188f,
                    dy1 = 0.313f,
                    dx2 = -0.519f,
                    dy2 = 0.486f,
                    dx3 = -0.859f,
                    dy3 = 0.486f,
                )
                close()
            }
        }.build().also { _emoji231a = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji231a: ImageVector? = null
