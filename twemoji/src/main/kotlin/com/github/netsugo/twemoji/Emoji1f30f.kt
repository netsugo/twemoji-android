package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f30f: ImageVector
    get() {
        val current = _emoji1f30f
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f30f",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M18 18 m-18 0 a18 18 0 1 1 36 0 a18 18 0 1 1 -36 0
            path(
                fill = SolidColor(Color(0xFF88C9F9)),
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
            // M2.812 25.375 c-0.062 -1 -0.062 -1.187 -0.062 -2.375 s0.562 -1 1.125 -1.562 0.438 -0.625 1.375 -1.241 0.438 -1.321 0.375 -1.696 -0.625 -0.063 -1.563 0.061 -0.624 -0.312 -1.187 -0.562 -0.812 -0.625 -1.188 -1.75 -0.438 -1.438 -0.312 -2.375 0.563 -0.063 0.625 0.937 0.938 0.625 0.938 1.25 1.25 1.312 1.562 1.5 1.188 -0.938 1.5 -1.25 0.688 -0.75 0.812 -1 1.688 -0.438 2 -0.438 1.062 0.938 1.062 1.375 0.375 1.625 0.688 2.312 1 0.812 1.625 1.312 0.938 0.062 0.938 0.062 -0.25 -1.062 -0.25 -1.938 0.75 -1.625 0.75 -1.625 1.188 0.875 1.25 1.125 1 1.125 1.062 1.562 0.562 1 1.483 1.125 0.267 -1.062 0.579 -1.875 0.75 -0.938 1.312 -1.062 1 -0.625 1.375 -1.125 1.062 -1.188 1 -1.75 -0.25 -0.938 -0.5 -1.625 0.75 -0.938 1.188 -1.75 0 0 1 -0.25 0.562 -0.25 0.75 -0.625 0.312 -0.75 0.125 -1.438 -0.875 0 -1.562 0 S22.938 7.75 23 7 s0.938 -0.562 1.562 -0.625 0.812 0.812 1 1 2.125 -1.25 2.625 -1.938 -0.437 -0.499 -0.187 -0.789 -1.5 -0.349 -2.188 -0.46 -2.437 -0.188 -3.124 -0.612 -3.312 -0.104 -4 0.237 -1.125 -0.029 -1.438 -0.5 -1.625 -0.235 -2 -0.5 -0.75 0.437 -1.25 0.625 -0.688 0.25 -1.312 -0.125 0.187 -0.813 -0.688 -1.125 c-0.586 -0.209 -1.288 -0.087 -2.38 -0.111 C3.902 5.092 0 11.087 0 18 c0 3.42 0.971 6.605 2.627 9.327 0.308 -0.518 0.231 -1.217 0.185 -1.952z M17.312 24.188 c0.438 0.062 1.688 0 0.688 -0.812 s-1.562 -0.188 -1.438 -1.125 -0.625 -0.938 -0.625 -0.938 c0 0.688 -0.5 1.438 0 2.125 s0.938 0.687 1.375 0.75z
            path(
                fill = SolidColor(Color(0xFF5C913B)),
            ) {
                // M 2.812 25.375
                moveTo(x = 2.812f, y = 25.375f)
                // c -0.062 -1 -0.062 -1.187 -0.062 -2.375
                curveToRelative(
                    dx1 = -0.062f,
                    dy1 = -1.0f,
                    dx2 = -0.062f,
                    dy2 = -1.187f,
                    dx3 = -0.062f,
                    dy3 = -2.375f,
                )
                // s 0.562 -1 1.125 -1.562
                reflectiveCurveToRelative(
                    dx1 = 0.562f,
                    dy1 = -1.0f,
                    dx2 = 1.125f,
                    dy2 = -1.562f,
                )
                // s 0.438 -0.625 1.375 -1.241
                reflectiveCurveToRelative(
                    dx1 = 0.438f,
                    dy1 = -0.625f,
                    dx2 = 1.375f,
                    dy2 = -1.241f,
                )
                // s 0.438 -1.321 0.375 -1.696
                reflectiveCurveToRelative(
                    dx1 = 0.438f,
                    dy1 = -1.321f,
                    dx2 = 0.375f,
                    dy2 = -1.696f,
                )
                // s -0.625 -0.063 -1.563 0.061
                reflectiveCurveToRelative(
                    dx1 = -0.625f,
                    dy1 = -0.063f,
                    dx2 = -1.563f,
                    dy2 = 0.061f,
                )
                // s -0.624 -0.312 -1.187 -0.562
                reflectiveCurveToRelative(
                    dx1 = -0.624f,
                    dy1 = -0.312f,
                    dx2 = -1.187f,
                    dy2 = -0.562f,
                )
                // s -0.812 -0.625 -1.188 -1.75
                reflectiveCurveToRelative(
                    dx1 = -0.812f,
                    dy1 = -0.625f,
                    dx2 = -1.188f,
                    dy2 = -1.75f,
                )
                // s -0.438 -1.438 -0.312 -2.375
                reflectiveCurveToRelative(
                    dx1 = -0.438f,
                    dy1 = -1.438f,
                    dx2 = -0.312f,
                    dy2 = -2.375f,
                )
                // s 0.563 -0.063 0.625 0.937
                reflectiveCurveToRelative(
                    dx1 = 0.563f,
                    dy1 = -0.063f,
                    dx2 = 0.625f,
                    dy2 = 0.937f,
                )
                // s 0.938 0.625 0.938 1.25
                reflectiveCurveToRelative(
                    dx1 = 0.938f,
                    dy1 = 0.625f,
                    dx2 = 0.938f,
                    dy2 = 1.25f,
                )
                // s 1.25 1.312 1.562 1.5
                reflectiveCurveToRelative(
                    dx1 = 1.25f,
                    dy1 = 1.312f,
                    dx2 = 1.562f,
                    dy2 = 1.5f,
                )
                // s 1.188 -0.938 1.5 -1.25
                reflectiveCurveToRelative(
                    dx1 = 1.188f,
                    dy1 = -0.938f,
                    dx2 = 1.5f,
                    dy2 = -1.25f,
                )
                // s 0.688 -0.75 0.812 -1
                reflectiveCurveToRelative(
                    dx1 = 0.688f,
                    dy1 = -0.75f,
                    dx2 = 0.812f,
                    dy2 = -1.0f,
                )
                // s 1.688 -0.438 2 -0.438
                reflectiveCurveToRelative(
                    dx1 = 1.688f,
                    dy1 = -0.438f,
                    dx2 = 2.0f,
                    dy2 = -0.438f,
                )
                // s 1.062 0.938 1.062 1.375
                reflectiveCurveToRelative(
                    dx1 = 1.062f,
                    dy1 = 0.938f,
                    dx2 = 1.062f,
                    dy2 = 1.375f,
                )
                // s 0.375 1.625 0.688 2.312
                reflectiveCurveToRelative(
                    dx1 = 0.375f,
                    dy1 = 1.625f,
                    dx2 = 0.688f,
                    dy2 = 2.312f,
                )
                // s 1 0.812 1.625 1.312
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.812f,
                    dx2 = 1.625f,
                    dy2 = 1.312f,
                )
                // s 0.938 0.062 0.938 0.062
                reflectiveCurveToRelative(
                    dx1 = 0.938f,
                    dy1 = 0.062f,
                    dx2 = 0.938f,
                    dy2 = 0.062f,
                )
                // s -0.25 -1.062 -0.25 -1.938
                reflectiveCurveToRelative(
                    dx1 = -0.25f,
                    dy1 = -1.062f,
                    dx2 = -0.25f,
                    dy2 = -1.938f,
                )
                // s 0.75 -1.625 0.75 -1.625
                reflectiveCurveToRelative(
                    dx1 = 0.75f,
                    dy1 = -1.625f,
                    dx2 = 0.75f,
                    dy2 = -1.625f,
                )
                // s 1.188 0.875 1.25 1.125
                reflectiveCurveToRelative(
                    dx1 = 1.188f,
                    dy1 = 0.875f,
                    dx2 = 1.25f,
                    dy2 = 1.125f,
                )
                // s 1 1.125 1.062 1.562
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = 1.125f,
                    dx2 = 1.062f,
                    dy2 = 1.562f,
                )
                // s 0.562 1 1.483 1.125
                reflectiveCurveToRelative(
                    dx1 = 0.562f,
                    dy1 = 1.0f,
                    dx2 = 1.483f,
                    dy2 = 1.125f,
                )
                // s 0.267 -1.062 0.579 -1.875
                reflectiveCurveToRelative(
                    dx1 = 0.267f,
                    dy1 = -1.062f,
                    dx2 = 0.579f,
                    dy2 = -1.875f,
                )
                // s 0.75 -0.938 1.312 -1.062
                reflectiveCurveToRelative(
                    dx1 = 0.75f,
                    dy1 = -0.938f,
                    dx2 = 1.312f,
                    dy2 = -1.062f,
                )
                // s 1 -0.625 1.375 -1.125
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = -0.625f,
                    dx2 = 1.375f,
                    dy2 = -1.125f,
                )
                // s 1.062 -1.188 1 -1.75
                reflectiveCurveToRelative(
                    dx1 = 1.062f,
                    dy1 = -1.188f,
                    dx2 = 1.0f,
                    dy2 = -1.75f,
                )
                // s -0.25 -0.938 -0.5 -1.625
                reflectiveCurveToRelative(
                    dx1 = -0.25f,
                    dy1 = -0.938f,
                    dx2 = -0.5f,
                    dy2 = -1.625f,
                )
                // s 0.75 -0.938 1.188 -1.75
                reflectiveCurveToRelative(
                    dx1 = 0.75f,
                    dy1 = -0.938f,
                    dx2 = 1.188f,
                    dy2 = -1.75f,
                )
                // s 0 0 1 -0.25
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -0.25f,
                )
                // s 0.562 -0.25 0.75 -0.625
                reflectiveCurveToRelative(
                    dx1 = 0.562f,
                    dy1 = -0.25f,
                    dx2 = 0.75f,
                    dy2 = -0.625f,
                )
                // s 0.312 -0.75 0.125 -1.438
                reflectiveCurveToRelative(
                    dx1 = 0.312f,
                    dy1 = -0.75f,
                    dx2 = 0.125f,
                    dy2 = -1.438f,
                )
                // s -0.875 0 -1.562 0
                reflectiveCurveToRelative(
                    dx1 = -0.875f,
                    dy1 = 0.0f,
                    dx2 = -1.562f,
                    dy2 = 0.0f,
                )
                // S 22.938 7.75 23 7
                reflectiveCurveTo(
                    x1 = 22.938f,
                    y1 = 7.75f,
                    x2 = 23.0f,
                    y2 = 7.0f,
                )
                // s 0.938 -0.562 1.562 -0.625
                reflectiveCurveToRelative(
                    dx1 = 0.938f,
                    dy1 = -0.562f,
                    dx2 = 1.562f,
                    dy2 = -0.625f,
                )
                // s 0.812 0.812 1 1
                reflectiveCurveToRelative(
                    dx1 = 0.812f,
                    dy1 = 0.812f,
                    dx2 = 1.0f,
                    dy2 = 1.0f,
                )
                // s 2.125 -1.25 2.625 -1.938
                reflectiveCurveToRelative(
                    dx1 = 2.125f,
                    dy1 = -1.25f,
                    dx2 = 2.625f,
                    dy2 = -1.938f,
                )
                // s -0.437 -0.499 -0.187 -0.789
                reflectiveCurveToRelative(
                    dx1 = -0.437f,
                    dy1 = -0.499f,
                    dx2 = -0.187f,
                    dy2 = -0.789f,
                )
                // s -1.5 -0.349 -2.188 -0.46
                reflectiveCurveToRelative(
                    dx1 = -1.5f,
                    dy1 = -0.349f,
                    dx2 = -2.188f,
                    dy2 = -0.46f,
                )
                // s -2.437 -0.188 -3.124 -0.612
                reflectiveCurveToRelative(
                    dx1 = -2.437f,
                    dy1 = -0.188f,
                    dx2 = -3.124f,
                    dy2 = -0.612f,
                )
                // s -3.312 -0.104 -4 0.237
                reflectiveCurveToRelative(
                    dx1 = -3.312f,
                    dy1 = -0.104f,
                    dx2 = -4.0f,
                    dy2 = 0.237f,
                )
                // s -1.125 -0.029 -1.438 -0.5
                reflectiveCurveToRelative(
                    dx1 = -1.125f,
                    dy1 = -0.029f,
                    dx2 = -1.438f,
                    dy2 = -0.5f,
                )
                // s -1.625 -0.235 -2 -0.5
                reflectiveCurveToRelative(
                    dx1 = -1.625f,
                    dy1 = -0.235f,
                    dx2 = -2.0f,
                    dy2 = -0.5f,
                )
                // s -0.75 0.437 -1.25 0.625
                reflectiveCurveToRelative(
                    dx1 = -0.75f,
                    dy1 = 0.437f,
                    dx2 = -1.25f,
                    dy2 = 0.625f,
                )
                // s -0.688 0.25 -1.312 -0.125
                reflectiveCurveToRelative(
                    dx1 = -0.688f,
                    dy1 = 0.25f,
                    dx2 = -1.312f,
                    dy2 = -0.125f,
                )
                // s 0.187 -0.813 -0.688 -1.125
                reflectiveCurveToRelative(
                    dx1 = 0.187f,
                    dy1 = -0.813f,
                    dx2 = -0.688f,
                    dy2 = -1.125f,
                )
                // c -0.586 -0.209 -1.288 -0.087 -2.38 -0.111
                curveToRelative(
                    dx1 = -0.586f,
                    dy1 = -0.209f,
                    dx2 = -1.288f,
                    dy2 = -0.087f,
                    dx3 = -2.38f,
                    dy3 = -0.111f,
                )
                // C 3.902 5.092 0 11.087 0 18
                curveTo(
                    x1 = 3.902f,
                    y1 = 5.092f,
                    x2 = 0.0f,
                    y2 = 11.087f,
                    x3 = 0.0f,
                    y3 = 18.0f,
                )
                // c 0 3.42 0.971 6.605 2.627 9.327
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.42f,
                    dx2 = 0.971f,
                    dy2 = 6.605f,
                    dx3 = 2.627f,
                    dy3 = 9.327f,
                )
                // c 0.308 -0.518 0.231 -1.217 0.185 -1.952z
                curveToRelative(
                    dx1 = 0.308f,
                    dy1 = -0.518f,
                    dx2 = 0.231f,
                    dy2 = -1.217f,
                    dx3 = 0.185f,
                    dy3 = -1.952f,
                )
                close()
                // M 17.312 24.188
                moveTo(x = 17.312f, y = 24.188f)
                // c 0.438 0.062 1.688 0 0.688 -0.812
                curveToRelative(
                    dx1 = 0.438f,
                    dy1 = 0.062f,
                    dx2 = 1.688f,
                    dy2 = 0.0f,
                    dx3 = 0.688f,
                    dy3 = -0.812f,
                )
                // s -1.562 -0.188 -1.438 -1.125
                reflectiveCurveToRelative(
                    dx1 = -1.562f,
                    dy1 = -0.188f,
                    dx2 = -1.438f,
                    dy2 = -1.125f,
                )
                // s -0.625 -0.938 -0.625 -0.938
                reflectiveCurveToRelative(
                    dx1 = -0.625f,
                    dy1 = -0.938f,
                    dx2 = -0.625f,
                    dy2 = -0.938f,
                )
                // c 0 0.688 -0.5 1.438 0 2.125
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.688f,
                    dx2 = -0.5f,
                    dy2 = 1.438f,
                    dx3 = 0.0f,
                    dy3 = 2.125f,
                )
                // s 0.938 0.687 1.375 0.75z
                reflectiveCurveToRelative(
                    dx1 = 0.938f,
                    dy1 = 0.687f,
                    dx2 = 1.375f,
                    dy2 = 0.75f,
                )
                close()
            }
            // M23.688 13.75 c-1 -0.812 -0.25 -0.562 -0.125 -1.5 s-0.625 -0.938 -0.625 -0.938 c0 0.688 -0.5 1.438 0 2.125 s-1 1.25 -0.562 1.312 2.312 -0.187 1.312 -0.999z M19.808 23.5 c0.62 0.688 0.38 0 1.192 -0.312 s-0.688 -1 -1.188 -1.375 -0.997 -0.389 -1.434 0.438 c-0.496 0.937 0.81 0.561 1.43 1.249z M27.125 24.75 c-0.312 -0.375 -1 -0.562 -1.75 -0.545 -0.75 0.018 -0.688 -0.83 -1.438 -0.768 s-1.286 -0.504 -1.625 -0.679 c-0.737 -0.38 -0.25 0.491 0 1.446 s1.188 0.232 2.062 0.732 0.938 -0.188 1.75 0.062 1.125 0.812 1.904 0.75 -0.59 -0.623 -0.903 -0.998z M25.5 27.5 c-0.312 -0.625 -1.226 -1.188 -1.601 -1.505 s-0.962 -0.424 -1.462 -0.24 -0.812 0 -1.062 -0.495 -0.688 -0.322 -1.062 -0.26 -1.875 0.688 -2.75 1.125 -1.273 0.817 -1.847 1.375 c-0.898 0.874 -0.403 0.312 0 0.875 0.403 0.562 -0.442 2.312 -0.504 3.312 s1.602 -0.312 2.227 -0.438 0.441 -0.5 0.941 -0.875 0.825 -0.463 1.374 0.037 c0.549 0.5 1.268 0.963 1.268 1.525 s1.979 1.5 2.729 1.125 1.188 -1.125 1.875 -1.75 0.438 -1.812 0.625 -2.562 -0.439 -0.624 -0.751 -1.249z
            path(
                fill = SolidColor(Color(0xFF5C913B)),
            ) {
                // M 23.688 13.75
                moveTo(x = 23.688f, y = 13.75f)
                // c -1 -0.812 -0.25 -0.562 -0.125 -1.5
                curveToRelative(
                    dx1 = -1.0f,
                    dy1 = -0.812f,
                    dx2 = -0.25f,
                    dy2 = -0.562f,
                    dx3 = -0.125f,
                    dy3 = -1.5f,
                )
                // s -0.625 -0.938 -0.625 -0.938
                reflectiveCurveToRelative(
                    dx1 = -0.625f,
                    dy1 = -0.938f,
                    dx2 = -0.625f,
                    dy2 = -0.938f,
                )
                // c 0 0.688 -0.5 1.438 0 2.125
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.688f,
                    dx2 = -0.5f,
                    dy2 = 1.438f,
                    dx3 = 0.0f,
                    dy3 = 2.125f,
                )
                // s -1 1.25 -0.562 1.312
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 1.25f,
                    dx2 = -0.562f,
                    dy2 = 1.312f,
                )
                // s 2.312 -0.187 1.312 -0.999z
                reflectiveCurveToRelative(
                    dx1 = 2.312f,
                    dy1 = -0.187f,
                    dx2 = 1.312f,
                    dy2 = -0.999f,
                )
                close()
                // M 19.808 23.5
                moveTo(x = 19.808f, y = 23.5f)
                // c 0.62 0.688 0.38 0 1.192 -0.312
                curveToRelative(
                    dx1 = 0.62f,
                    dy1 = 0.688f,
                    dx2 = 0.38f,
                    dy2 = 0.0f,
                    dx3 = 1.192f,
                    dy3 = -0.312f,
                )
                // s -0.688 -1 -1.188 -1.375
                reflectiveCurveToRelative(
                    dx1 = -0.688f,
                    dy1 = -1.0f,
                    dx2 = -1.188f,
                    dy2 = -1.375f,
                )
                // s -0.997 -0.389 -1.434 0.438
                reflectiveCurveToRelative(
                    dx1 = -0.997f,
                    dy1 = -0.389f,
                    dx2 = -1.434f,
                    dy2 = 0.438f,
                )
                // c -0.496 0.937 0.81 0.561 1.43 1.249z
                curveToRelative(
                    dx1 = -0.496f,
                    dy1 = 0.937f,
                    dx2 = 0.81f,
                    dy2 = 0.561f,
                    dx3 = 1.43f,
                    dy3 = 1.249f,
                )
                close()
                // M 27.125 24.75
                moveTo(x = 27.125f, y = 24.75f)
                // c -0.312 -0.375 -1 -0.562 -1.75 -0.545
                curveToRelative(
                    dx1 = -0.312f,
                    dy1 = -0.375f,
                    dx2 = -1.0f,
                    dy2 = -0.562f,
                    dx3 = -1.75f,
                    dy3 = -0.545f,
                )
                // c -0.75 0.018 -0.688 -0.83 -1.438 -0.768
                curveToRelative(
                    dx1 = -0.75f,
                    dy1 = 0.018f,
                    dx2 = -0.688f,
                    dy2 = -0.83f,
                    dx3 = -1.438f,
                    dy3 = -0.768f,
                )
                // s -1.286 -0.504 -1.625 -0.679
                reflectiveCurveToRelative(
                    dx1 = -1.286f,
                    dy1 = -0.504f,
                    dx2 = -1.625f,
                    dy2 = -0.679f,
                )
                // c -0.737 -0.38 -0.25 0.491 0 1.446
                curveToRelative(
                    dx1 = -0.737f,
                    dy1 = -0.38f,
                    dx2 = -0.25f,
                    dy2 = 0.491f,
                    dx3 = 0.0f,
                    dy3 = 1.446f,
                )
                // s 1.188 0.232 2.062 0.732
                reflectiveCurveToRelative(
                    dx1 = 1.188f,
                    dy1 = 0.232f,
                    dx2 = 2.062f,
                    dy2 = 0.732f,
                )
                // s 0.938 -0.188 1.75 0.062
                reflectiveCurveToRelative(
                    dx1 = 0.938f,
                    dy1 = -0.188f,
                    dx2 = 1.75f,
                    dy2 = 0.062f,
                )
                // s 1.125 0.812 1.904 0.75
                reflectiveCurveToRelative(
                    dx1 = 1.125f,
                    dy1 = 0.812f,
                    dx2 = 1.904f,
                    dy2 = 0.75f,
                )
                // s -0.59 -0.623 -0.903 -0.998z
                reflectiveCurveToRelative(
                    dx1 = -0.59f,
                    dy1 = -0.623f,
                    dx2 = -0.903f,
                    dy2 = -0.998f,
                )
                close()
                // M 25.5 27.5
                moveTo(x = 25.5f, y = 27.5f)
                // c -0.312 -0.625 -1.226 -1.188 -1.601 -1.505
                curveToRelative(
                    dx1 = -0.312f,
                    dy1 = -0.625f,
                    dx2 = -1.226f,
                    dy2 = -1.188f,
                    dx3 = -1.601f,
                    dy3 = -1.505f,
                )
                // s -0.962 -0.424 -1.462 -0.24
                reflectiveCurveToRelative(
                    dx1 = -0.962f,
                    dy1 = -0.424f,
                    dx2 = -1.462f,
                    dy2 = -0.24f,
                )
                // s -0.812 0 -1.062 -0.495
                reflectiveCurveToRelative(
                    dx1 = -0.812f,
                    dy1 = 0.0f,
                    dx2 = -1.062f,
                    dy2 = -0.495f,
                )
                // s -0.688 -0.322 -1.062 -0.26
                reflectiveCurveToRelative(
                    dx1 = -0.688f,
                    dy1 = -0.322f,
                    dx2 = -1.062f,
                    dy2 = -0.26f,
                )
                // s -1.875 0.688 -2.75 1.125
                reflectiveCurveToRelative(
                    dx1 = -1.875f,
                    dy1 = 0.688f,
                    dx2 = -2.75f,
                    dy2 = 1.125f,
                )
                // s -1.273 0.817 -1.847 1.375
                reflectiveCurveToRelative(
                    dx1 = -1.273f,
                    dy1 = 0.817f,
                    dx2 = -1.847f,
                    dy2 = 1.375f,
                )
                // c -0.898 0.874 -0.403 0.312 0 0.875
                curveToRelative(
                    dx1 = -0.898f,
                    dy1 = 0.874f,
                    dx2 = -0.403f,
                    dy2 = 0.312f,
                    dx3 = 0.0f,
                    dy3 = 0.875f,
                )
                // c 0.403 0.562 -0.442 2.312 -0.504 3.312
                curveToRelative(
                    dx1 = 0.403f,
                    dy1 = 0.562f,
                    dx2 = -0.442f,
                    dy2 = 2.312f,
                    dx3 = -0.504f,
                    dy3 = 3.312f,
                )
                // s 1.602 -0.312 2.227 -0.438
                reflectiveCurveToRelative(
                    dx1 = 1.602f,
                    dy1 = -0.312f,
                    dx2 = 2.227f,
                    dy2 = -0.438f,
                )
                // s 0.441 -0.5 0.941 -0.875
                reflectiveCurveToRelative(
                    dx1 = 0.441f,
                    dy1 = -0.5f,
                    dx2 = 0.941f,
                    dy2 = -0.875f,
                )
                // s 0.825 -0.463 1.374 0.037
                reflectiveCurveToRelative(
                    dx1 = 0.825f,
                    dy1 = -0.463f,
                    dx2 = 1.374f,
                    dy2 = 0.037f,
                )
                // c 0.549 0.5 1.268 0.963 1.268 1.525
                curveToRelative(
                    dx1 = 0.549f,
                    dy1 = 0.5f,
                    dx2 = 1.268f,
                    dy2 = 0.963f,
                    dx3 = 1.268f,
                    dy3 = 1.525f,
                )
                // s 1.979 1.5 2.729 1.125
                reflectiveCurveToRelative(
                    dx1 = 1.979f,
                    dy1 = 1.5f,
                    dx2 = 2.729f,
                    dy2 = 1.125f,
                )
                // s 1.188 -1.125 1.875 -1.75
                reflectiveCurveToRelative(
                    dx1 = 1.188f,
                    dy1 = -1.125f,
                    dx2 = 1.875f,
                    dy2 = -1.75f,
                )
                // s 0.438 -1.812 0.625 -2.562
                reflectiveCurveToRelative(
                    dx1 = 0.438f,
                    dy1 = -1.812f,
                    dx2 = 0.625f,
                    dy2 = -2.562f,
                )
                // s -0.439 -0.624 -0.751 -1.249z
                reflectiveCurveToRelative(
                    dx1 = -0.439f,
                    dy1 = -0.624f,
                    dx2 = -0.751f,
                    dy2 = -1.249f,
                )
                close()
            }
        }.build().also { _emoji1f30f = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f30f: ImageVector? = null
