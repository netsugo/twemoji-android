package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji26f8: ImageVector
    get() {
        val current = _emoji26f8
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji26f8",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M26 33 c2 2 -11 2 -9 0 3 0 3 -3 3 -3 h3 s0 3 3 3z M12 33 c2 2 -11 2 -9 0 3 0 3 -3 3 -3 h3 s0 3 3 3z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 26 33
                moveTo(x = 26.0f, y = 33.0f)
                // c 2 2 -11 2 -9 0
                curveToRelative(
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                    dx2 = -11.0f,
                    dy2 = 2.0f,
                    dx3 = -9.0f,
                    dy3 = 0.0f,
                )
                // c 3 0 3 -3 3 -3
                curveToRelative(
                    dx1 = 3.0f,
                    dy1 = 0.0f,
                    dx2 = 3.0f,
                    dy2 = -3.0f,
                    dx3 = 3.0f,
                    dy3 = -3.0f,
                )
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // s 0 3 3 3z
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.0f,
                    dx2 = 3.0f,
                    dy2 = 3.0f,
                )
                close()
                // M 12 33
                moveTo(x = 12.0f, y = 33.0f)
                // c 2 2 -11 2 -9 0
                curveToRelative(
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                    dx2 = -11.0f,
                    dy2 = 2.0f,
                    dx3 = -9.0f,
                    dy3 = 0.0f,
                )
                // c 3 0 3 -3 3 -3
                curveToRelative(
                    dx1 = 3.0f,
                    dy1 = 0.0f,
                    dx2 = 3.0f,
                    dy2 = -3.0f,
                    dx3 = 3.0f,
                    dy3 = -3.0f,
                )
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // s 0 3 3 3z
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.0f,
                    dx2 = 3.0f,
                    dy2 = 3.0f,
                )
                close()
            }
            // M30 36 H2 c-1.104 0 -2.104 -3 -1 -3 h28 c3 0 3 -3 4 -4 5 3 2 7 -3 7z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 30 36
                moveTo(x = 30.0f, y = 36.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // c -1.104 0 -2.104 -3 -1 -3
                curveToRelative(
                    dx1 = -1.104f,
                    dy1 = 0.0f,
                    dx2 = -2.104f,
                    dy2 = -3.0f,
                    dx3 = -1.0f,
                    dy3 = -3.0f,
                )
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // c 3 0 3 -3 4 -4
                curveToRelative(
                    dx1 = 3.0f,
                    dy1 = 0.0f,
                    dx2 = 3.0f,
                    dy2 = -3.0f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // c 5 3 2 7 -3 7z
                curveToRelative(
                    dx1 = 5.0f,
                    dy1 = 3.0f,
                    dx2 = 2.0f,
                    dy2 = 7.0f,
                    dx3 = -3.0f,
                    dy3 = 7.0f,
                )
                close()
            }
            // M1 28 c0 -9 2 -14 2 -21 0 -2.279 13 -2 13 0 s-1.5 10 5 13 c6.268 2.893 15 2 15 8 H1z
            path(
                fill = SolidColor(Color(0xFFE6E7E8)),
            ) {
                // M 1 28
                moveTo(x = 1.0f, y = 28.0f)
                // c 0 -9 2 -14 2 -21
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -9.0f,
                    dx2 = 2.0f,
                    dy2 = -14.0f,
                    dx3 = 2.0f,
                    dy3 = -21.0f,
                )
                // c 0 -2.279 13 -2 13 0
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.279f,
                    dx2 = 13.0f,
                    dy2 = -2.0f,
                    dx3 = 13.0f,
                    dy3 = 0.0f,
                )
                // s -1.5 10 5 13
                reflectiveCurveToRelative(
                    dx1 = -1.5f,
                    dy1 = 10.0f,
                    dx2 = 5.0f,
                    dy2 = 13.0f,
                )
                // c 6.268 2.893 15 2 15 8
                curveToRelative(
                    dx1 = 6.268f,
                    dy1 = 2.893f,
                    dx2 = 15.0f,
                    dy2 = 2.0f,
                    dx3 = 15.0f,
                    dy3 = 8.0f,
                )
                // H 1z
                horizontalLineTo(x = 1.0f)
                close()
            }
            // M36 28 c-24 0 -19.001 -1 -25 -1 H1 v1 c0 1.104 0.896 2 2 2 h8 c2.333 0 0.398 -2.041 3 -1 5 2 20 1 20 1 1.104 0 2 -0.896 2 -2z
            path(
                fill = SolidColor(Color(0xFFE6E7E8)),
            ) {
                // M 36 28
                moveTo(x = 36.0f, y = 28.0f)
                // c -24 0 -19.001 -1 -25 -1
                curveToRelative(
                    dx1 = -24.0f,
                    dy1 = 0.0f,
                    dx2 = -19.001f,
                    dy2 = -1.0f,
                    dx3 = -25.0f,
                    dy3 = -1.0f,
                )
                // H 1
                horizontalLineTo(x = 1.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // c 0 1.104 0.896 2 2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = 0.896f,
                    dy2 = 2.0f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // c 2.333 0 0.398 -2.041 3 -1
                curveToRelative(
                    dx1 = 2.333f,
                    dy1 = 0.0f,
                    dx2 = 0.398f,
                    dy2 = -2.041f,
                    dx3 = 3.0f,
                    dy3 = -1.0f,
                )
                // c 5 2 20 1 20 1
                curveToRelative(
                    dx1 = 5.0f,
                    dy1 = 2.0f,
                    dx2 = 20.0f,
                    dy2 = 1.0f,
                    dx3 = 20.0f,
                    dy3 = 1.0f,
                )
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
            // M16.312 20.75 c-0.25 0 -0.5 -0.093 -0.694 -0.28 -0.398 -0.383 -0.409 -1.017 -0.025 -1.414 l1.688 -1.75 c0.384 -0.396 1.017 -0.408 1.414 -0.025 0.398 0.383 0.409 1.016 0.025 1.414 l-1.688 1.75 c-0.196 0.202 -0.458 0.305 -0.72 0.305z M19.999 23 c-0.15 0 -0.303 -0.034 -0.446 -0.105 -0.494 -0.247 -0.694 -0.848 -0.447 -1.342 l1 -2 c0.248 -0.494 0.848 -0.692 1.342 -0.447 0.494 0.247 0.694 0.848 0.447 1.342 l-1 2 c-0.176 0.35 -0.529 0.552 -0.896 0.552z M24.001 24 c-0.047 0 -0.095 -0.003 -0.143 -0.01 -0.547 -0.079 -0.927 -0.585 -0.849 -1.132 l0.209 -1.458 c0.079 -0.547 0.587 -0.923 1.132 -0.849 0.547 0.079 0.927 0.585 0.849 1.132 l-0.209 1.458 c-0.072 0.5 -0.5 0.859 -0.989 0.859z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 16.312 20.75
                moveTo(x = 16.312f, y = 20.75f)
                // c -0.25 0 -0.5 -0.093 -0.694 -0.28
                curveToRelative(
                    dx1 = -0.25f,
                    dy1 = 0.0f,
                    dx2 = -0.5f,
                    dy2 = -0.093f,
                    dx3 = -0.694f,
                    dy3 = -0.28f,
                )
                // c -0.398 -0.383 -0.409 -1.017 -0.025 -1.414
                curveToRelative(
                    dx1 = -0.398f,
                    dy1 = -0.383f,
                    dx2 = -0.409f,
                    dy2 = -1.017f,
                    dx3 = -0.025f,
                    dy3 = -1.414f,
                )
                // l 1.688 -1.75
                lineToRelative(dx = 1.688f, dy = -1.75f)
                // c 0.384 -0.396 1.017 -0.408 1.414 -0.025
                curveToRelative(
                    dx1 = 0.384f,
                    dy1 = -0.396f,
                    dx2 = 1.017f,
                    dy2 = -0.408f,
                    dx3 = 1.414f,
                    dy3 = -0.025f,
                )
                // c 0.398 0.383 0.409 1.016 0.025 1.414
                curveToRelative(
                    dx1 = 0.398f,
                    dy1 = 0.383f,
                    dx2 = 0.409f,
                    dy2 = 1.016f,
                    dx3 = 0.025f,
                    dy3 = 1.414f,
                )
                // l -1.688 1.75
                lineToRelative(dx = -1.688f, dy = 1.75f)
                // c -0.196 0.202 -0.458 0.305 -0.72 0.305z
                curveToRelative(
                    dx1 = -0.196f,
                    dy1 = 0.202f,
                    dx2 = -0.458f,
                    dy2 = 0.305f,
                    dx3 = -0.72f,
                    dy3 = 0.305f,
                )
                close()
                // M 19.999 23
                moveTo(x = 19.999f, y = 23.0f)
                // c -0.15 0 -0.303 -0.034 -0.446 -0.105
                curveToRelative(
                    dx1 = -0.15f,
                    dy1 = 0.0f,
                    dx2 = -0.303f,
                    dy2 = -0.034f,
                    dx3 = -0.446f,
                    dy3 = -0.105f,
                )
                // c -0.494 -0.247 -0.694 -0.848 -0.447 -1.342
                curveToRelative(
                    dx1 = -0.494f,
                    dy1 = -0.247f,
                    dx2 = -0.694f,
                    dy2 = -0.848f,
                    dx3 = -0.447f,
                    dy3 = -1.342f,
                )
                // l 1 -2
                lineToRelative(dx = 1.0f, dy = -2.0f)
                // c 0.248 -0.494 0.848 -0.692 1.342 -0.447
                curveToRelative(
                    dx1 = 0.248f,
                    dy1 = -0.494f,
                    dx2 = 0.848f,
                    dy2 = -0.692f,
                    dx3 = 1.342f,
                    dy3 = -0.447f,
                )
                // c 0.494 0.247 0.694 0.848 0.447 1.342
                curveToRelative(
                    dx1 = 0.494f,
                    dy1 = 0.247f,
                    dx2 = 0.694f,
                    dy2 = 0.848f,
                    dx3 = 0.447f,
                    dy3 = 1.342f,
                )
                // l -1 2
                lineToRelative(dx = -1.0f, dy = 2.0f)
                // c -0.176 0.35 -0.529 0.552 -0.896 0.552z
                curveToRelative(
                    dx1 = -0.176f,
                    dy1 = 0.35f,
                    dx2 = -0.529f,
                    dy2 = 0.552f,
                    dx3 = -0.896f,
                    dy3 = 0.552f,
                )
                close()
                // M 24.001 24
                moveTo(x = 24.001f, y = 24.0f)
                // c -0.047 0 -0.095 -0.003 -0.143 -0.01
                curveToRelative(
                    dx1 = -0.047f,
                    dy1 = 0.0f,
                    dx2 = -0.095f,
                    dy2 = -0.003f,
                    dx3 = -0.143f,
                    dy3 = -0.01f,
                )
                // c -0.547 -0.079 -0.927 -0.585 -0.849 -1.132
                curveToRelative(
                    dx1 = -0.547f,
                    dy1 = -0.079f,
                    dx2 = -0.927f,
                    dy2 = -0.585f,
                    dx3 = -0.849f,
                    dy3 = -1.132f,
                )
                // l 0.209 -1.458
                lineToRelative(dx = 0.209f, dy = -1.458f)
                // c 0.079 -0.547 0.587 -0.923 1.132 -0.849
                curveToRelative(
                    dx1 = 0.079f,
                    dy1 = -0.547f,
                    dx2 = 0.587f,
                    dy2 = -0.923f,
                    dx3 = 1.132f,
                    dy3 = -0.849f,
                )
                // c 0.547 0.079 0.927 0.585 0.849 1.132
                curveToRelative(
                    dx1 = 0.547f,
                    dy1 = 0.079f,
                    dx2 = 0.927f,
                    dy2 = 0.585f,
                    dx3 = 0.849f,
                    dy3 = 1.132f,
                )
                // l -0.209 1.458
                lineToRelative(dx = -0.209f, dy = 1.458f)
                // c -0.072 0.5 -0.5 0.859 -0.989 0.859z
                curveToRelative(
                    dx1 = -0.072f,
                    dy1 = 0.5f,
                    dx2 = -0.5f,
                    dy2 = 0.859f,
                    dx3 = -0.989f,
                    dy3 = 0.859f,
                )
                close()
            }
        }.build().also { _emoji26f8 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji26f8: ImageVector? = null
