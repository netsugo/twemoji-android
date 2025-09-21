package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f630: ImageVector
    get() {
        val current = _emoji1f630
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f630",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 18 c0 9.941 -8.059 18 -18 18 -9.94 0 -18 -8.059 -18 -18 C0 8.06 8.06 0 18 0 c9.941 0 18 8.06 18 18
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 36 18
                moveTo(x = 36.0f, y = 18.0f)
                // c 0 9.941 -8.059 18 -18 18
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 9.941f,
                    dx2 = -8.059f,
                    dy2 = 18.0f,
                    dx3 = -18.0f,
                    dy3 = 18.0f,
                )
                // c -9.94 0 -18 -8.059 -18 -18
                curveToRelative(
                    dx1 = -9.94f,
                    dy1 = 0.0f,
                    dx2 = -18.0f,
                    dy2 = -8.059f,
                    dx3 = -18.0f,
                    dy3 = -18.0f,
                )
                // C 0 8.06 8.06 0 18 0
                curveTo(
                    x1 = 0.0f,
                    y1 = 8.06f,
                    x2 = 8.06f,
                    y2 = 0.0f,
                    x3 = 18.0f,
                    y3 = 0.0f,
                )
                // c 9.941 0 18 8.06 18 18
                curveToRelative(
                    dx1 = 9.941f,
                    dy1 = 0.0f,
                    dx2 = 18.0f,
                    dy2 = 8.06f,
                    dx3 = 18.0f,
                    dy3 = 18.0f,
                )
            }
            // M9 16.5 a2.5 3.5 0 1 0 5 0 a2.5 3.5 0 1 0 -5 0z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 9 16.5
                moveTo(x = 9.0f, y = 16.5f)
                // a 2.5 3.5 0 1 0 5 0
                arcToRelative(
                    a = 2.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // a 2.5 3.5 0 1 0 -5 0z
                arcToRelative(
                    a = 2.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -5.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M22 16.5 a2.5 3.5 0 1 0 5 0 a2.5 3.5 0 1 0 -5 0z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 22 16.5
                moveTo(x = 22.0f, y = 16.5f)
                // a 2.5 3.5 0 1 0 5 0
                arcToRelative(
                    a = 2.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // a 2.5 3.5 0 1 0 -5 0z
                arcToRelative(
                    a = 2.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -5.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M23.485 27.879 C23.474 27.835 22.34 23.5 18 23.5 s-5.474 4.335 -5.484 4.379 c-0.053 0.213 0.043 0.431 0.231 0.544 0.187 0.112 0.433 0.086 0.596 -0.06 0.01 -0.008 1.014 -0.863 4.657 -0.863 3.59 0 4.617 0.83 4.656 0.863 0.095 0.09 0.219 0.137 0.344 0.137 0.084 0 0.169 -0.021 0.246 -0.064 0.196 -0.112 0.294 -0.339 0.239 -0.557z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 23.485 27.879
                moveTo(x = 23.485f, y = 27.879f)
                // C 23.474 27.835 22.34 23.5 18 23.5
                curveTo(
                    x1 = 23.474f,
                    y1 = 27.835f,
                    x2 = 22.34f,
                    y2 = 23.5f,
                    x3 = 18.0f,
                    y3 = 23.5f,
                )
                // s -5.474 4.335 -5.484 4.379
                reflectiveCurveToRelative(
                    dx1 = -5.474f,
                    dy1 = 4.335f,
                    dx2 = -5.484f,
                    dy2 = 4.379f,
                )
                // c -0.053 0.213 0.043 0.431 0.231 0.544
                curveToRelative(
                    dx1 = -0.053f,
                    dy1 = 0.213f,
                    dx2 = 0.043f,
                    dy2 = 0.431f,
                    dx3 = 0.231f,
                    dy3 = 0.544f,
                )
                // c 0.187 0.112 0.433 0.086 0.596 -0.06
                curveToRelative(
                    dx1 = 0.187f,
                    dy1 = 0.112f,
                    dx2 = 0.433f,
                    dy2 = 0.086f,
                    dx3 = 0.596f,
                    dy3 = -0.06f,
                )
                // c 0.01 -0.008 1.014 -0.863 4.657 -0.863
                curveToRelative(
                    dx1 = 0.01f,
                    dy1 = -0.008f,
                    dx2 = 1.014f,
                    dy2 = -0.863f,
                    dx3 = 4.657f,
                    dy3 = -0.863f,
                )
                // c 3.59 0 4.617 0.83 4.656 0.863
                curveToRelative(
                    dx1 = 3.59f,
                    dy1 = 0.0f,
                    dx2 = 4.617f,
                    dy2 = 0.83f,
                    dx3 = 4.656f,
                    dy3 = 0.863f,
                )
                // c 0.095 0.09 0.219 0.137 0.344 0.137
                curveToRelative(
                    dx1 = 0.095f,
                    dy1 = 0.09f,
                    dx2 = 0.219f,
                    dy2 = 0.137f,
                    dx3 = 0.344f,
                    dy3 = 0.137f,
                )
                // c 0.084 0 0.169 -0.021 0.246 -0.064
                curveToRelative(
                    dx1 = 0.084f,
                    dy1 = 0.0f,
                    dx2 = 0.169f,
                    dy2 = -0.021f,
                    dx3 = 0.246f,
                    dy3 = -0.064f,
                )
                // c 0.196 -0.112 0.294 -0.339 0.239 -0.557z
                curveToRelative(
                    dx1 = 0.196f,
                    dy1 = -0.112f,
                    dx2 = 0.294f,
                    dy2 = -0.339f,
                    dx3 = 0.239f,
                    dy3 = -0.557f,
                )
                close()
            }
            // M10 30 c0 2.762 -2.238 5 -5 5 s-5 -2.238 -5 -5 4 -10 5 -10 5 7.238 5 10z
            path(
                fill = SolidColor(Color(0xFF5DADEC)),
            ) {
                // M 10 30
                moveTo(x = 10.0f, y = 30.0f)
                // c 0 2.762 -2.238 5 -5 5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.762f,
                    dx2 = -2.238f,
                    dy2 = 5.0f,
                    dx3 = -5.0f,
                    dy3 = 5.0f,
                )
                // s -5 -2.238 -5 -5
                reflectiveCurveToRelative(
                    dx1 = -5.0f,
                    dy1 = -2.238f,
                    dx2 = -5.0f,
                    dy2 = -5.0f,
                )
                // s 4 -10 5 -10
                reflectiveCurveToRelative(
                    dx1 = 4.0f,
                    dy1 = -10.0f,
                    dx2 = 5.0f,
                    dy2 = -10.0f,
                )
                // s 5 7.238 5 10z
                reflectiveCurveToRelative(
                    dx1 = 5.0f,
                    dy1 = 7.238f,
                    dx2 = 5.0f,
                    dy2 = 10.0f,
                )
                close()
            }
            // M18 11 c8.749 0 16.033 4.509 17.656 10.484 0.222 -1.128 0.344 -2.292 0.344 -3.484 0 -9.94 -8.059 -18 -18 -18 C8.06 0 0 8.06 0 18 c0 1.192 0.123 2.356 0.344 3.484 C1.967 15.509 9.252 11 18 11z
            path(
                fill = SolidColor(Color(0xFFBDDDF4)),
            ) {
                // M 18 11
                moveTo(x = 18.0f, y = 11.0f)
                // c 8.749 0 16.033 4.509 17.656 10.484
                curveToRelative(
                    dx1 = 8.749f,
                    dy1 = 0.0f,
                    dx2 = 16.033f,
                    dy2 = 4.509f,
                    dx3 = 17.656f,
                    dy3 = 10.484f,
                )
                // c 0.222 -1.128 0.344 -2.292 0.344 -3.484
                curveToRelative(
                    dx1 = 0.222f,
                    dy1 = -1.128f,
                    dx2 = 0.344f,
                    dy2 = -2.292f,
                    dx3 = 0.344f,
                    dy3 = -3.484f,
                )
                // c 0 -9.94 -8.059 -18 -18 -18
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -9.94f,
                    dx2 = -8.059f,
                    dy2 = -18.0f,
                    dx3 = -18.0f,
                    dy3 = -18.0f,
                )
                // C 8.06 0 0 8.06 0 18
                curveTo(
                    x1 = 8.06f,
                    y1 = 0.0f,
                    x2 = 0.0f,
                    y2 = 8.06f,
                    x3 = 0.0f,
                    y3 = 18.0f,
                )
                // c 0 1.192 0.123 2.356 0.344 3.484
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.192f,
                    dx2 = 0.123f,
                    dy2 = 2.356f,
                    dx3 = 0.344f,
                    dy3 = 3.484f,
                )
                // C 1.967 15.509 9.252 11 18 11z
                curveTo(
                    x1 = 1.967f,
                    y1 = 15.509f,
                    x2 = 9.252f,
                    y2 = 11.0f,
                    x3 = 18.0f,
                    y3 = 11.0f,
                )
                close()
            }
            // M30 12 c-5.554 0 -7.802 -4.367 -7.895 -4.553 -0.247 -0.494 -0.047 -1.095 0.447 -1.342 0.492 -0.247 1.092 -0.048 1.34 0.443 C23.967 6.694 25.713 10 30 10 c0.553 0 1 0.448 1 1 s-0.447 1 -1 1z M6 12 c-0.552 0 -1 -0.448 -1 -1 s0.448 -1 1 -1 c5.083 0 5.996 -3.12 6.033 -3.253 0.145 -0.528 0.69 -0.848 1.219 -0.709 0.53 0.139 0.851 0.673 0.718 1.205 C13.921 7.437 12.704 12 6 12z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 30 12
                moveTo(x = 30.0f, y = 12.0f)
                // c -5.554 0 -7.802 -4.367 -7.895 -4.553
                curveToRelative(
                    dx1 = -5.554f,
                    dy1 = 0.0f,
                    dx2 = -7.802f,
                    dy2 = -4.367f,
                    dx3 = -7.895f,
                    dy3 = -4.553f,
                )
                // c -0.247 -0.494 -0.047 -1.095 0.447 -1.342
                curveToRelative(
                    dx1 = -0.247f,
                    dy1 = -0.494f,
                    dx2 = -0.047f,
                    dy2 = -1.095f,
                    dx3 = 0.447f,
                    dy3 = -1.342f,
                )
                // c 0.492 -0.247 1.092 -0.048 1.34 0.443
                curveToRelative(
                    dx1 = 0.492f,
                    dy1 = -0.247f,
                    dx2 = 1.092f,
                    dy2 = -0.048f,
                    dx3 = 1.34f,
                    dy3 = 0.443f,
                )
                // C 23.967 6.694 25.713 10 30 10
                curveTo(
                    x1 = 23.967f,
                    y1 = 6.694f,
                    x2 = 25.713f,
                    y2 = 10.0f,
                    x3 = 30.0f,
                    y3 = 10.0f,
                )
                // c 0.553 0 1 0.448 1 1
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.448f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // s -0.447 1 -1 1z
                reflectiveCurveToRelative(
                    dx1 = -0.447f,
                    dy1 = 1.0f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                close()
                // M 6 12
                moveTo(x = 6.0f, y = 12.0f)
                // c -0.552 0 -1 -0.448 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.448f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // s 0.448 -1 1 -1
                reflectiveCurveToRelative(
                    dx1 = 0.448f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // c 5.083 0 5.996 -3.12 6.033 -3.253
                curveToRelative(
                    dx1 = 5.083f,
                    dy1 = 0.0f,
                    dx2 = 5.996f,
                    dy2 = -3.12f,
                    dx3 = 6.033f,
                    dy3 = -3.253f,
                )
                // c 0.145 -0.528 0.69 -0.848 1.219 -0.709
                curveToRelative(
                    dx1 = 0.145f,
                    dy1 = -0.528f,
                    dx2 = 0.69f,
                    dy2 = -0.848f,
                    dx3 = 1.219f,
                    dy3 = -0.709f,
                )
                // c 0.53 0.139 0.851 0.673 0.718 1.205
                curveToRelative(
                    dx1 = 0.53f,
                    dy1 = 0.139f,
                    dx2 = 0.851f,
                    dy2 = 0.673f,
                    dx3 = 0.718f,
                    dy3 = 1.205f,
                )
                // C 13.921 7.437 12.704 12 6 12z
                curveTo(
                    x1 = 13.921f,
                    y1 = 7.437f,
                    x2 = 12.704f,
                    y2 = 12.0f,
                    x3 = 6.0f,
                    y3 = 12.0f,
                )
                close()
            }
        }.build().also { _emoji1f630 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f630: ImageVector? = null
