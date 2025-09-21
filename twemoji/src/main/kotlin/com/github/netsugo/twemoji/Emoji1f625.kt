package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f625: ImageVector
    get() {
        val current = _emoji1f625
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f625",
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
            // M23.485 27.879 C23.474 27.835 22.34 23.5 18 23.5 s-5.474 4.335 -5.485 4.379 c-0.053 0.213 0.044 0.431 0.232 0.544 0.188 0.112 0.433 0.086 0.596 -0.06 0.009 -0.007 1.013 -0.863 4.657 -0.863 3.59 0 4.617 0.83 4.656 0.863 0.095 0.091 0.219 0.137 0.344 0.137 0.084 0 0.169 -0.021 0.246 -0.064 0.196 -0.111 0.294 -0.339 0.239 -0.557z
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
                // s -5.474 4.335 -5.485 4.379
                reflectiveCurveToRelative(
                    dx1 = -5.474f,
                    dy1 = 4.335f,
                    dx2 = -5.485f,
                    dy2 = 4.379f,
                )
                // c -0.053 0.213 0.044 0.431 0.232 0.544
                curveToRelative(
                    dx1 = -0.053f,
                    dy1 = 0.213f,
                    dx2 = 0.044f,
                    dy2 = 0.431f,
                    dx3 = 0.232f,
                    dy3 = 0.544f,
                )
                // c 0.188 0.112 0.433 0.086 0.596 -0.06
                curveToRelative(
                    dx1 = 0.188f,
                    dy1 = 0.112f,
                    dx2 = 0.433f,
                    dy2 = 0.086f,
                    dx3 = 0.596f,
                    dy3 = -0.06f,
                )
                // c 0.009 -0.007 1.013 -0.863 4.657 -0.863
                curveToRelative(
                    dx1 = 0.009f,
                    dy1 = -0.007f,
                    dx2 = 1.013f,
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
                // c 0.095 0.091 0.219 0.137 0.344 0.137
                curveToRelative(
                    dx1 = 0.095f,
                    dy1 = 0.091f,
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
                // c 0.196 -0.111 0.294 -0.339 0.239 -0.557z
                curveToRelative(
                    dx1 = 0.196f,
                    dy1 = -0.111f,
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
            // M30 13 c-5.554 0 -7.802 -4.367 -7.895 -4.553 -0.247 -0.494 -0.047 -1.095 0.447 -1.342 0.492 -0.247 1.092 -0.048 1.34 0.443 C23.967 7.694 25.713 11 30 11 c0.553 0 1 0.448 1 1 0 0.553 -0.447 1 -1 1z M6 13 c-0.552 0 -1 -0.448 -1 -1 s0.448 -1 1 -1 c5.083 0 5.996 -3.12 6.033 -3.253 0.145 -0.528 0.69 -0.848 1.219 -0.709 0.53 0.139 0.851 0.673 0.718 1.205 C13.921 8.437 12.704 13 6 13z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 30 13
                moveTo(x = 30.0f, y = 13.0f)
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
                // C 23.967 7.694 25.713 11 30 11
                curveTo(
                    x1 = 23.967f,
                    y1 = 7.694f,
                    x2 = 25.713f,
                    y2 = 11.0f,
                    x3 = 30.0f,
                    y3 = 11.0f,
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
                // c 0 0.553 -0.447 1 -1 1z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                close()
                // M 6 13
                moveTo(x = 6.0f, y = 13.0f)
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
                // C 13.921 8.437 12.704 13 6 13z
                curveTo(
                    x1 = 13.921f,
                    y1 = 8.437f,
                    x2 = 12.704f,
                    y2 = 13.0f,
                    x3 = 6.0f,
                    y3 = 13.0f,
                )
                close()
            }
        }.build().also { _emoji1f625 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f625: ImageVector? = null
