package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f6a8: ImageVector
    get() {
        val current = _emoji1f6a8
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f6a8",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M34.16 28.812 L31.244 2.678 C31.074 1.153 29.785 0 28.251 0 H7.664 C6.119 0 4.825 1.168 4.667 2.704 l-2.67 26.108 H34.16z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 34.16 28.812
                moveTo(x = 34.16f, y = 28.812f)
                // L 31.244 2.678
                lineTo(x = 31.244f, y = 2.678f)
                // C 31.074 1.153 29.785 0 28.251 0
                curveTo(
                    x1 = 31.074f,
                    y1 = 1.153f,
                    x2 = 29.785f,
                    y2 = 0.0f,
                    x3 = 28.251f,
                    y3 = 0.0f,
                )
                // H 7.664
                horizontalLineTo(x = 7.664f)
                // C 6.119 0 4.825 1.168 4.667 2.704
                curveTo(
                    x1 = 6.119f,
                    y1 = 0.0f,
                    x2 = 4.825f,
                    y2 = 1.168f,
                    x3 = 4.667f,
                    y3 = 2.704f,
                )
                // l -2.67 26.108
                lineToRelative(dx = -2.67f, dy = 26.108f)
                // H 34.16z
                horizontalLineTo(x = 34.16f)
                close()
            }
            // M18.069 14 m-9.366 0 a9.366 9.366 0 1 1 18.732 0 a9.366 9.366 0 1 1 -18.732 0
            path(
                fill = SolidColor(Color(0xFFBE1931)),
            ) {
                // M 18.069 14
                moveTo(x = 18.069f, y = 14.0f)
                // m -9.366 0
                moveToRelative(dx = -9.366f, dy = 0.0f)
                // a 9.366 9.366 0 1 1 18.732 0
                arcToRelative(
                    a = 9.366f,
                    b = 9.366f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 18.732f,
                    dy1 = 0.0f,
                )
                // a 9.366 9.366 0 1 1 -18.732 0
                arcToRelative(
                    a = 9.366f,
                    b = 9.366f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -18.732f,
                    dy1 = 0.0f,
                )
            }
            // M35.521 29.18 H0.479 L0 34 c0 2 2 2 2 2 h32 s2 0 2 -2 l-0.479 -4.82z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 35.521 29.18
                moveTo(x = 35.521f, y = 29.18f)
                // H 0.479
                horizontalLineTo(x = 0.479f)
                // L 0 34
                lineTo(x = 0.0f, y = 34.0f)
                // c 0 2 2 2 2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                // h 32
                horizontalLineToRelative(dx = 32.0f)
                // s 2 0 2 -2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // l -0.479 -4.82z
                lineToRelative(dx = -0.479f, dy = -4.82f)
                close()
            }
            // M35.594 29.912 l-0.073 -0.732 C35.38 28.442 34.751 28 34 28 H2 c-0.751 0 -1.38 0.442 -1.521 1.18 l-0.073 0.732 h35.188z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 35.594 29.912
                moveTo(x = 35.594f, y = 29.912f)
                // l -0.073 -0.732
                lineToRelative(dx = -0.073f, dy = -0.732f)
                // C 35.38 28.442 34.751 28 34 28
                curveTo(
                    x1 = 35.38f,
                    y1 = 28.442f,
                    x2 = 34.751f,
                    y2 = 28.0f,
                    x3 = 34.0f,
                    y3 = 28.0f,
                )
                // H 2
                horizontalLineTo(x = 2.0f)
                // c -0.751 0 -1.38 0.442 -1.521 1.18
                curveToRelative(
                    dx1 = -0.751f,
                    dy1 = 0.0f,
                    dx2 = -1.38f,
                    dy2 = 0.442f,
                    dx3 = -1.521f,
                    dy3 = 1.18f,
                )
                // l -0.073 0.732
                lineToRelative(dx = -0.073f, dy = 0.732f)
                // h 35.188z
                horizontalLineToRelative(dx = 35.188f)
                close()
            }
            // M29.647 13.63 l-7.668 -1.248 4.539 -6.308 c0.107 -0.148 0.091 -0.354 -0.039 -0.484 -0.131 -0.129 -0.336 -0.146 -0.484 -0.039 l-6.309 4.538 -1.247 -7.667 c-0.029 -0.181 -0.187 -0.314 -0.37 -0.314 s-0.341 0.133 -0.37 0.314 l-1.248 7.667 -6.308 -4.538 c-0.149 -0.107 -0.353 -0.09 -0.484 0.039 -0.13 0.131 -0.146 0.335 -0.039 0.484 l4.538 6.308 L6.49 13.63 c-0.181 0.029 -0.314 0.186 -0.314 0.37 s0.133 0.341 0.314 0.37 l7.668 1.248 -4.538 6.308 c-0.107 0.149 -0.091 0.354 0.039 0.484 0.131 0.129 0.335 0.146 0.484 0.039 l6.308 -4.538 1.248 7.667 c0.029 0.182 0.187 0.314 0.37 0.314 s0.341 -0.134 0.37 -0.314 l1.247 -7.667 6.308 4.538 c0.148 0.106 0.354 0.09 0.484 -0.039 0.13 -0.131 0.146 -0.335 0.039 -0.484 l-4.538 -6.308 7.668 -1.248 c0.182 -0.029 0.314 -0.187 0.314 -0.37 s-0.132 -0.341 -0.314 -0.37z
            path(
                fill = SolidColor(Color(0xFFEC9DAD)),
            ) {
                // M 29.647 13.63
                moveTo(x = 29.647f, y = 13.63f)
                // l -7.668 -1.248
                lineToRelative(dx = -7.668f, dy = -1.248f)
                // l 4.539 -6.308
                lineToRelative(dx = 4.539f, dy = -6.308f)
                // c 0.107 -0.148 0.091 -0.354 -0.039 -0.484
                curveToRelative(
                    dx1 = 0.107f,
                    dy1 = -0.148f,
                    dx2 = 0.091f,
                    dy2 = -0.354f,
                    dx3 = -0.039f,
                    dy3 = -0.484f,
                )
                // c -0.131 -0.129 -0.336 -0.146 -0.484 -0.039
                curveToRelative(
                    dx1 = -0.131f,
                    dy1 = -0.129f,
                    dx2 = -0.336f,
                    dy2 = -0.146f,
                    dx3 = -0.484f,
                    dy3 = -0.039f,
                )
                // l -6.309 4.538
                lineToRelative(dx = -6.309f, dy = 4.538f)
                // l -1.247 -7.667
                lineToRelative(dx = -1.247f, dy = -7.667f)
                // c -0.029 -0.181 -0.187 -0.314 -0.37 -0.314
                curveToRelative(
                    dx1 = -0.029f,
                    dy1 = -0.181f,
                    dx2 = -0.187f,
                    dy2 = -0.314f,
                    dx3 = -0.37f,
                    dy3 = -0.314f,
                )
                // s -0.341 0.133 -0.37 0.314
                reflectiveCurveToRelative(
                    dx1 = -0.341f,
                    dy1 = 0.133f,
                    dx2 = -0.37f,
                    dy2 = 0.314f,
                )
                // l -1.248 7.667
                lineToRelative(dx = -1.248f, dy = 7.667f)
                // l -6.308 -4.538
                lineToRelative(dx = -6.308f, dy = -4.538f)
                // c -0.149 -0.107 -0.353 -0.09 -0.484 0.039
                curveToRelative(
                    dx1 = -0.149f,
                    dy1 = -0.107f,
                    dx2 = -0.353f,
                    dy2 = -0.09f,
                    dx3 = -0.484f,
                    dy3 = 0.039f,
                )
                // c -0.13 0.131 -0.146 0.335 -0.039 0.484
                curveToRelative(
                    dx1 = -0.13f,
                    dy1 = 0.131f,
                    dx2 = -0.146f,
                    dy2 = 0.335f,
                    dx3 = -0.039f,
                    dy3 = 0.484f,
                )
                // l 4.538 6.308
                lineToRelative(dx = 4.538f, dy = 6.308f)
                // L 6.49 13.63
                lineTo(x = 6.49f, y = 13.63f)
                // c -0.181 0.029 -0.314 0.186 -0.314 0.37
                curveToRelative(
                    dx1 = -0.181f,
                    dy1 = 0.029f,
                    dx2 = -0.314f,
                    dy2 = 0.186f,
                    dx3 = -0.314f,
                    dy3 = 0.37f,
                )
                // s 0.133 0.341 0.314 0.37
                reflectiveCurveToRelative(
                    dx1 = 0.133f,
                    dy1 = 0.341f,
                    dx2 = 0.314f,
                    dy2 = 0.37f,
                )
                // l 7.668 1.248
                lineToRelative(dx = 7.668f, dy = 1.248f)
                // l -4.538 6.308
                lineToRelative(dx = -4.538f, dy = 6.308f)
                // c -0.107 0.149 -0.091 0.354 0.039 0.484
                curveToRelative(
                    dx1 = -0.107f,
                    dy1 = 0.149f,
                    dx2 = -0.091f,
                    dy2 = 0.354f,
                    dx3 = 0.039f,
                    dy3 = 0.484f,
                )
                // c 0.131 0.129 0.335 0.146 0.484 0.039
                curveToRelative(
                    dx1 = 0.131f,
                    dy1 = 0.129f,
                    dx2 = 0.335f,
                    dy2 = 0.146f,
                    dx3 = 0.484f,
                    dy3 = 0.039f,
                )
                // l 6.308 -4.538
                lineToRelative(dx = 6.308f, dy = -4.538f)
                // l 1.248 7.667
                lineToRelative(dx = 1.248f, dy = 7.667f)
                // c 0.029 0.182 0.187 0.314 0.37 0.314
                curveToRelative(
                    dx1 = 0.029f,
                    dy1 = 0.182f,
                    dx2 = 0.187f,
                    dy2 = 0.314f,
                    dx3 = 0.37f,
                    dy3 = 0.314f,
                )
                // s 0.341 -0.134 0.37 -0.314
                reflectiveCurveToRelative(
                    dx1 = 0.341f,
                    dy1 = -0.134f,
                    dx2 = 0.37f,
                    dy2 = -0.314f,
                )
                // l 1.247 -7.667
                lineToRelative(dx = 1.247f, dy = -7.667f)
                // l 6.308 4.538
                lineToRelative(dx = 6.308f, dy = 4.538f)
                // c 0.148 0.106 0.354 0.09 0.484 -0.039
                curveToRelative(
                    dx1 = 0.148f,
                    dy1 = 0.106f,
                    dx2 = 0.354f,
                    dy2 = 0.09f,
                    dx3 = 0.484f,
                    dy3 = -0.039f,
                )
                // c 0.13 -0.131 0.146 -0.335 0.039 -0.484
                curveToRelative(
                    dx1 = 0.13f,
                    dy1 = -0.131f,
                    dx2 = 0.146f,
                    dy2 = -0.335f,
                    dx3 = 0.039f,
                    dy3 = -0.484f,
                )
                // l -4.538 -6.308
                lineToRelative(dx = -4.538f, dy = -6.308f)
                // l 7.668 -1.248
                lineToRelative(dx = 7.668f, dy = -1.248f)
                // c 0.182 -0.029 0.314 -0.187 0.314 -0.37
                curveToRelative(
                    dx1 = 0.182f,
                    dy1 = -0.029f,
                    dx2 = 0.314f,
                    dy2 = -0.187f,
                    dx3 = 0.314f,
                    dy3 = -0.37f,
                )
                // s -0.132 -0.341 -0.314 -0.37z
                reflectiveCurveToRelative(
                    dx1 = -0.132f,
                    dy1 = -0.341f,
                    dx2 = -0.314f,
                    dy2 = -0.37f,
                )
                close()
            }
        }.build().also { _emoji1f6a8 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f6a8: ImageVector? = null
