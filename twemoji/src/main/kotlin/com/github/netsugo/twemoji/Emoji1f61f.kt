package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f61f: ImageVector
    get() {
        val current = _emoji1f61f
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f61f",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 18 c0 9.941 -8.059 18 -18 18 S0 27.941 0 18 8.059 0 18 0 s18 8.059 18 18
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
                // S 0 27.941 0 18
                reflectiveCurveTo(
                    x1 = 0.0f,
                    y1 = 27.941f,
                    x2 = 0.0f,
                    y2 = 18.0f,
                )
                // S 8.059 0 18 0
                reflectiveCurveTo(
                    x1 = 8.059f,
                    y1 = 0.0f,
                    x2 = 18.0f,
                    y2 = 0.0f,
                )
                // s 18 8.059 18 18
                reflectiveCurveToRelative(
                    dx1 = 18.0f,
                    dy1 = 8.059f,
                    dx2 = 18.0f,
                    dy2 = 18.0f,
                )
            }
            // M23.485 28.879 C23.474 28.835 22.34 24.5 18 24.5 s-5.474 4.335 -5.485 4.379 c-0.053 0.213 0.044 0.431 0.232 0.544 0.188 0.112 0.433 0.086 0.596 -0.06 0.009 -0.008 1.013 -0.863 4.657 -0.863 3.59 0 4.617 0.83 4.656 0.863 0.095 0.09 0.219 0.137 0.344 0.137 0.084 0 0.169 -0.021 0.246 -0.064 0.196 -0.112 0.294 -0.339 0.239 -0.557z M29 12 c-5.554 0 -7.802 -4.367 -7.895 -4.553 -0.247 -0.494 -0.047 -1.095 0.447 -1.342 0.493 -0.247 1.092 -0.048 1.34 0.443 C22.967 6.694 24.713 10 29 10 c0.553 0 1 0.448 1 1 s-0.447 1 -1 1z M7 12 c-0.552 0 -1 -0.448 -1 -1 s0.448 -1 1 -1 c5.083 0 5.996 -3.12 6.033 -3.253 0.145 -0.528 0.692 -0.848 1.219 -0.709 0.53 0.139 0.851 0.673 0.718 1.205 C14.921 7.437 13.704 12 7 12z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 23.485 28.879
                moveTo(x = 23.485f, y = 28.879f)
                // C 23.474 28.835 22.34 24.5 18 24.5
                curveTo(
                    x1 = 23.474f,
                    y1 = 28.835f,
                    x2 = 22.34f,
                    y2 = 24.5f,
                    x3 = 18.0f,
                    y3 = 24.5f,
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
                // c 0.009 -0.008 1.013 -0.863 4.657 -0.863
                curveToRelative(
                    dx1 = 0.009f,
                    dy1 = -0.008f,
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
                // M 29 12
                moveTo(x = 29.0f, y = 12.0f)
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
                // c 0.493 -0.247 1.092 -0.048 1.34 0.443
                curveToRelative(
                    dx1 = 0.493f,
                    dy1 = -0.247f,
                    dx2 = 1.092f,
                    dy2 = -0.048f,
                    dx3 = 1.34f,
                    dy3 = 0.443f,
                )
                // C 22.967 6.694 24.713 10 29 10
                curveTo(
                    x1 = 22.967f,
                    y1 = 6.694f,
                    x2 = 24.713f,
                    y2 = 10.0f,
                    x3 = 29.0f,
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
                // M 7 12
                moveTo(x = 7.0f, y = 12.0f)
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
                // c 0.145 -0.528 0.692 -0.848 1.219 -0.709
                curveToRelative(
                    dx1 = 0.145f,
                    dy1 = -0.528f,
                    dx2 = 0.692f,
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
                // C 14.921 7.437 13.704 12 7 12z
                curveTo(
                    x1 = 14.921f,
                    y1 = 7.437f,
                    x2 = 13.704f,
                    y2 = 12.0f,
                    x3 = 7.0f,
                    y3 = 12.0f,
                )
                close()
            }
            // M9.5 16.5 a2.5 3.5 0 1 0 5 0 a2.5 3.5 0 1 0 -5 0z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 9.5 16.5
                moveTo(x = 9.5f, y = 16.5f)
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
            // M21.5 16.5 a2.5 3.5 0 1 0 5 0 a2.5 3.5 0 1 0 -5 0z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 21.5 16.5
                moveTo(x = 21.5f, y = 16.5f)
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
        }.build().also { _emoji1f61f = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f61f: ImageVector? = null
