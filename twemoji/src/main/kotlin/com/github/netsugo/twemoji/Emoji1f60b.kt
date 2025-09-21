package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f60b: ImageVector
    get() {
        val current = _emoji1f60b
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f60b",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M18 18 m-18 0 a18 18 0 1 1 36 0 a18 18 0 1 1 -36 0
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 18 18
                moveTo(x = 18.0f, y = 18.0f)
                // m -18 0
                moveToRelative(dx = -18.0f, dy = 0.0f)
                // a 18 18 0 1 1 36 0
                arcToRelative(
                    a = 18.0f,
                    b = 18.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 36.0f,
                    dy1 = 0.0f,
                )
                // a 18 18 0 1 1 -36 0
                arcToRelative(
                    a = 18.0f,
                    b = 18.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -36.0f,
                    dy1 = 0.0f,
                )
            }
            // M6.999 17 c-0.15 0 -0.303 -0.034 -0.446 -0.105 -0.494 -0.247 -0.694 -0.848 -0.447 -1.342 C6.158 15.448 7.424 13 11 13 c3.577 0 4.842 2.449 4.894 2.553 0.247 0.494 0.046 1.095 -0.447 1.342 -0.491 0.247 -1.085 0.049 -1.336 -0.436 C14.067 16.378 13.28 15 11 15 c-2.317 0 -3.099 1.433 -3.106 1.447 -0.175 0.351 -0.528 0.553 -0.895 0.553z M29 17 c0.15 0 0.303 -0.034 0.446 -0.105 0.494 -0.247 0.694 -0.848 0.447 -1.342 -0.052 -0.105 -1.318 -2.553 -4.894 -2.553 -3.577 0 -4.842 2.449 -4.894 2.553 -0.247 0.494 -0.046 1.095 0.447 1.342 0.491 0.247 1.085 0.049 1.336 -0.436 0.044 -0.081 0.831 -1.459 3.111 -1.459 2.317 0 3.099 1.433 3.106 1.447 0.175 0.351 0.528 0.553 0.895 0.553z M29.503 23.52 c0.323 -0.749 0.461 -1.257 0.466 -1.277 0.134 -0.534 -0.19 -1.075 -0.725 -1.21 -0.536 -0.136 -1.077 0.188 -1.215 0.723 C27.955 22.051 26.081 29 18 29 s-9.955 -6.949 -10.03 -7.245 c-0.138 -0.534 -0.679 -0.858 -1.215 -0.723 -0.534 0.135 -0.858 0.676 -0.725 1.21 C6.052 22.33 8.331 31 18 31 c1.65 0 3.07 -0.266 4.315 -0.685 4.33 -1.458 6.374 -4.91 7.188 -6.795z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 6.999 17
                moveTo(x = 6.999f, y = 17.0f)
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
                // C 6.158 15.448 7.424 13 11 13
                curveTo(
                    x1 = 6.158f,
                    y1 = 15.448f,
                    x2 = 7.424f,
                    y2 = 13.0f,
                    x3 = 11.0f,
                    y3 = 13.0f,
                )
                // c 3.577 0 4.842 2.449 4.894 2.553
                curveToRelative(
                    dx1 = 3.577f,
                    dy1 = 0.0f,
                    dx2 = 4.842f,
                    dy2 = 2.449f,
                    dx3 = 4.894f,
                    dy3 = 2.553f,
                )
                // c 0.247 0.494 0.046 1.095 -0.447 1.342
                curveToRelative(
                    dx1 = 0.247f,
                    dy1 = 0.494f,
                    dx2 = 0.046f,
                    dy2 = 1.095f,
                    dx3 = -0.447f,
                    dy3 = 1.342f,
                )
                // c -0.491 0.247 -1.085 0.049 -1.336 -0.436
                curveToRelative(
                    dx1 = -0.491f,
                    dy1 = 0.247f,
                    dx2 = -1.085f,
                    dy2 = 0.049f,
                    dx3 = -1.336f,
                    dy3 = -0.436f,
                )
                // C 14.067 16.378 13.28 15 11 15
                curveTo(
                    x1 = 14.067f,
                    y1 = 16.378f,
                    x2 = 13.28f,
                    y2 = 15.0f,
                    x3 = 11.0f,
                    y3 = 15.0f,
                )
                // c -2.317 0 -3.099 1.433 -3.106 1.447
                curveToRelative(
                    dx1 = -2.317f,
                    dy1 = 0.0f,
                    dx2 = -3.099f,
                    dy2 = 1.433f,
                    dx3 = -3.106f,
                    dy3 = 1.447f,
                )
                // c -0.175 0.351 -0.528 0.553 -0.895 0.553z
                curveToRelative(
                    dx1 = -0.175f,
                    dy1 = 0.351f,
                    dx2 = -0.528f,
                    dy2 = 0.553f,
                    dx3 = -0.895f,
                    dy3 = 0.553f,
                )
                close()
                // M 29 17
                moveTo(x = 29.0f, y = 17.0f)
                // c 0.15 0 0.303 -0.034 0.446 -0.105
                curveToRelative(
                    dx1 = 0.15f,
                    dy1 = 0.0f,
                    dx2 = 0.303f,
                    dy2 = -0.034f,
                    dx3 = 0.446f,
                    dy3 = -0.105f,
                )
                // c 0.494 -0.247 0.694 -0.848 0.447 -1.342
                curveToRelative(
                    dx1 = 0.494f,
                    dy1 = -0.247f,
                    dx2 = 0.694f,
                    dy2 = -0.848f,
                    dx3 = 0.447f,
                    dy3 = -1.342f,
                )
                // c -0.052 -0.105 -1.318 -2.553 -4.894 -2.553
                curveToRelative(
                    dx1 = -0.052f,
                    dy1 = -0.105f,
                    dx2 = -1.318f,
                    dy2 = -2.553f,
                    dx3 = -4.894f,
                    dy3 = -2.553f,
                )
                // c -3.577 0 -4.842 2.449 -4.894 2.553
                curveToRelative(
                    dx1 = -3.577f,
                    dy1 = 0.0f,
                    dx2 = -4.842f,
                    dy2 = 2.449f,
                    dx3 = -4.894f,
                    dy3 = 2.553f,
                )
                // c -0.247 0.494 -0.046 1.095 0.447 1.342
                curveToRelative(
                    dx1 = -0.247f,
                    dy1 = 0.494f,
                    dx2 = -0.046f,
                    dy2 = 1.095f,
                    dx3 = 0.447f,
                    dy3 = 1.342f,
                )
                // c 0.491 0.247 1.085 0.049 1.336 -0.436
                curveToRelative(
                    dx1 = 0.491f,
                    dy1 = 0.247f,
                    dx2 = 1.085f,
                    dy2 = 0.049f,
                    dx3 = 1.336f,
                    dy3 = -0.436f,
                )
                // c 0.044 -0.081 0.831 -1.459 3.111 -1.459
                curveToRelative(
                    dx1 = 0.044f,
                    dy1 = -0.081f,
                    dx2 = 0.831f,
                    dy2 = -1.459f,
                    dx3 = 3.111f,
                    dy3 = -1.459f,
                )
                // c 2.317 0 3.099 1.433 3.106 1.447
                curveToRelative(
                    dx1 = 2.317f,
                    dy1 = 0.0f,
                    dx2 = 3.099f,
                    dy2 = 1.433f,
                    dx3 = 3.106f,
                    dy3 = 1.447f,
                )
                // c 0.175 0.351 0.528 0.553 0.895 0.553z
                curveToRelative(
                    dx1 = 0.175f,
                    dy1 = 0.351f,
                    dx2 = 0.528f,
                    dy2 = 0.553f,
                    dx3 = 0.895f,
                    dy3 = 0.553f,
                )
                close()
                // M 29.503 23.52
                moveTo(x = 29.503f, y = 23.52f)
                // c 0.323 -0.749 0.461 -1.257 0.466 -1.277
                curveToRelative(
                    dx1 = 0.323f,
                    dy1 = -0.749f,
                    dx2 = 0.461f,
                    dy2 = -1.257f,
                    dx3 = 0.466f,
                    dy3 = -1.277f,
                )
                // c 0.134 -0.534 -0.19 -1.075 -0.725 -1.21
                curveToRelative(
                    dx1 = 0.134f,
                    dy1 = -0.534f,
                    dx2 = -0.19f,
                    dy2 = -1.075f,
                    dx3 = -0.725f,
                    dy3 = -1.21f,
                )
                // c -0.536 -0.136 -1.077 0.188 -1.215 0.723
                curveToRelative(
                    dx1 = -0.536f,
                    dy1 = -0.136f,
                    dx2 = -1.077f,
                    dy2 = 0.188f,
                    dx3 = -1.215f,
                    dy3 = 0.723f,
                )
                // C 27.955 22.051 26.081 29 18 29
                curveTo(
                    x1 = 27.955f,
                    y1 = 22.051f,
                    x2 = 26.081f,
                    y2 = 29.0f,
                    x3 = 18.0f,
                    y3 = 29.0f,
                )
                // s -9.955 -6.949 -10.03 -7.245
                reflectiveCurveToRelative(
                    dx1 = -9.955f,
                    dy1 = -6.949f,
                    dx2 = -10.03f,
                    dy2 = -7.245f,
                )
                // c -0.138 -0.534 -0.679 -0.858 -1.215 -0.723
                curveToRelative(
                    dx1 = -0.138f,
                    dy1 = -0.534f,
                    dx2 = -0.679f,
                    dy2 = -0.858f,
                    dx3 = -1.215f,
                    dy3 = -0.723f,
                )
                // c -0.534 0.135 -0.858 0.676 -0.725 1.21
                curveToRelative(
                    dx1 = -0.534f,
                    dy1 = 0.135f,
                    dx2 = -0.858f,
                    dy2 = 0.676f,
                    dx3 = -0.725f,
                    dy3 = 1.21f,
                )
                // C 6.052 22.33 8.331 31 18 31
                curveTo(
                    x1 = 6.052f,
                    y1 = 22.33f,
                    x2 = 8.331f,
                    y2 = 31.0f,
                    x3 = 18.0f,
                    y3 = 31.0f,
                )
                // c 1.65 0 3.07 -0.266 4.315 -0.685
                curveToRelative(
                    dx1 = 1.65f,
                    dy1 = 0.0f,
                    dx2 = 3.07f,
                    dy2 = -0.266f,
                    dx3 = 4.315f,
                    dy3 = -0.685f,
                )
                // c 4.33 -1.458 6.374 -4.91 7.188 -6.795z
                curveToRelative(
                    dx1 = 4.33f,
                    dy1 = -1.458f,
                    dx2 = 6.374f,
                    dy2 = -4.91f,
                    dx3 = 7.188f,
                    dy3 = -6.795f,
                )
                close()
            }
            // M32.407 26.681 l-2.956 -3.051 s-0.68 -0.438 -1.273 0.568 c-0.78 1.322 -2.075 2.935 -3.934 4.171 -0.781 0.519 -2.139 1.189 -2.697 1.318 -0.735 0.169 -0.388 0.964 -0.388 0.964 0.585 -0.127 1.051 -0.301 1.051 -0.301 l0.296 0.296 2.726 2.726 c1.728 1.728 5 2 7 0 s1.904 -4.962 0.175 -6.691z
            path(
                fill = SolidColor(Color(0xFFE75B70)),
            ) {
                // M 32.407 26.681
                moveTo(x = 32.407f, y = 26.681f)
                // l -2.956 -3.051
                lineToRelative(dx = -2.956f, dy = -3.051f)
                // s -0.68 -0.438 -1.273 0.568
                reflectiveCurveToRelative(
                    dx1 = -0.68f,
                    dy1 = -0.438f,
                    dx2 = -1.273f,
                    dy2 = 0.568f,
                )
                // c -0.78 1.322 -2.075 2.935 -3.934 4.171
                curveToRelative(
                    dx1 = -0.78f,
                    dy1 = 1.322f,
                    dx2 = -2.075f,
                    dy2 = 2.935f,
                    dx3 = -3.934f,
                    dy3 = 4.171f,
                )
                // c -0.781 0.519 -2.139 1.189 -2.697 1.318
                curveToRelative(
                    dx1 = -0.781f,
                    dy1 = 0.519f,
                    dx2 = -2.139f,
                    dy2 = 1.189f,
                    dx3 = -2.697f,
                    dy3 = 1.318f,
                )
                // c -0.735 0.169 -0.388 0.964 -0.388 0.964
                curveToRelative(
                    dx1 = -0.735f,
                    dy1 = 0.169f,
                    dx2 = -0.388f,
                    dy2 = 0.964f,
                    dx3 = -0.388f,
                    dy3 = 0.964f,
                )
                // c 0.585 -0.127 1.051 -0.301 1.051 -0.301
                curveToRelative(
                    dx1 = 0.585f,
                    dy1 = -0.127f,
                    dx2 = 1.051f,
                    dy2 = -0.301f,
                    dx3 = 1.051f,
                    dy3 = -0.301f,
                )
                // l 0.296 0.296
                lineToRelative(dx = 0.296f, dy = 0.296f)
                // l 2.726 2.726
                lineToRelative(dx = 2.726f, dy = 2.726f)
                // c 1.728 1.728 5 2 7 0
                curveToRelative(
                    dx1 = 1.728f,
                    dy1 = 1.728f,
                    dx2 = 5.0f,
                    dy2 = 2.0f,
                    dx3 = 7.0f,
                    dy3 = 0.0f,
                )
                // s 1.904 -4.962 0.175 -6.691z
                reflectiveCurveToRelative(
                    dx1 = 1.904f,
                    dy1 = -4.962f,
                    dx2 = 0.175f,
                    dy2 = -6.691f,
                )
                close()
            }
            // M29.915 31.074 c0.213 -0.213 0.213 -0.558 0 -0.771 l-3.629 -3.629 -0.796 0.748 3.653 3.653 c0.213 0.212 0.559 0.212 0.772 -0.001z
            path(
                fill = SolidColor(Color(0xFFDE3146)),
            ) {
                // M 29.915 31.074
                moveTo(x = 29.915f, y = 31.074f)
                // c 0.213 -0.213 0.213 -0.558 0 -0.771
                curveToRelative(
                    dx1 = 0.213f,
                    dy1 = -0.213f,
                    dx2 = 0.213f,
                    dy2 = -0.558f,
                    dx3 = 0.0f,
                    dy3 = -0.771f,
                )
                // l -3.629 -3.629
                lineToRelative(dx = -3.629f, dy = -3.629f)
                // l -0.796 0.748
                lineToRelative(dx = -0.796f, dy = 0.748f)
                // l 3.653 3.653
                lineToRelative(dx = 3.653f, dy = 3.653f)
                // c 0.213 0.212 0.559 0.212 0.772 -0.001z
                curveToRelative(
                    dx1 = 0.213f,
                    dy1 = 0.212f,
                    dx2 = 0.559f,
                    dy2 = 0.212f,
                    dx3 = 0.772f,
                    dy3 = -0.001f,
                )
                close()
            }
        }.build().also { _emoji1f60b = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f60b: ImageVector? = null
