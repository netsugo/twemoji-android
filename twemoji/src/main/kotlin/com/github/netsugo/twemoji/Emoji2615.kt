package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji2615: ImageVector
    get() {
        val current = _emoji2615
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji2615",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M0 26 a18 10 0 1 0 36 0 a18 10 0 1 0 -36 0z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 0 26
                moveTo(x = 0.0f, y = 26.0f)
                // a 18 10 0 1 0 36 0
                arcToRelative(
                    a = 18.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 36.0f,
                    dy1 = 0.0f,
                )
                // a 18 10 0 1 0 -36 0z
                arcToRelative(
                    a = 18.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -36.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M0 24 a18 10 0 1 0 36 0 a18 10 0 1 0 -36 0z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 0 24
                moveTo(x = 0.0f, y = 24.0f)
                // a 18 10 0 1 0 36 0
                arcToRelative(
                    a = 18.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 36.0f,
                    dy1 = 0.0f,
                )
                // a 18 10 0 1 0 -36 0z
                arcToRelative(
                    a = 18.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -36.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M18 31 C3.042 31 1 16 1 12 h34 c0 2 -1.958 19 -17 19z
            path(
                fill = SolidColor(Color(0xFFF5F8FA)),
            ) {
                // M 18 31
                moveTo(x = 18.0f, y = 31.0f)
                // C 3.042 31 1 16 1 12
                curveTo(
                    x1 = 3.042f,
                    y1 = 31.0f,
                    x2 = 1.0f,
                    y2 = 16.0f,
                    x3 = 1.0f,
                    y3 = 12.0f,
                )
                // h 34
                horizontalLineToRelative(dx = 34.0f)
                // c 0 2 -1.958 19 -17 19z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                    dx2 = -1.958f,
                    dy2 = 19.0f,
                    dx3 = -17.0f,
                    dy3 = 19.0f,
                )
                close()
            }
            // M34.385 9.644 c2.442 -10.123 -9.781 -7.706 -12.204 -5.799 -1.34 -0.148 -2.736 -0.234 -4.181 -0.234 -9.389 0 -17 3.229 -17 8.444 C1 17.271 8.611 21.5 18 21.5 s17 -4.229 17 -9.444 c0 -0.863 -0.226 -1.664 -0.615 -2.412z M31.882 6.952 c-1.357 -0.938 -3.102 -1.694 -5.121 -2.25 1.875 -0.576 4.551 -0.309 5.121 2.25z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 34.385 9.644
                moveTo(x = 34.385f, y = 9.644f)
                // c 2.442 -10.123 -9.781 -7.706 -12.204 -5.799
                curveToRelative(
                    dx1 = 2.442f,
                    dy1 = -10.123f,
                    dx2 = -9.781f,
                    dy2 = -7.706f,
                    dx3 = -12.204f,
                    dy3 = -5.799f,
                )
                // c -1.34 -0.148 -2.736 -0.234 -4.181 -0.234
                curveToRelative(
                    dx1 = -1.34f,
                    dy1 = -0.148f,
                    dx2 = -2.736f,
                    dy2 = -0.234f,
                    dx3 = -4.181f,
                    dy3 = -0.234f,
                )
                // c -9.389 0 -17 3.229 -17 8.444
                curveToRelative(
                    dx1 = -9.389f,
                    dy1 = 0.0f,
                    dx2 = -17.0f,
                    dy2 = 3.229f,
                    dx3 = -17.0f,
                    dy3 = 8.444f,
                )
                // C 1 17.271 8.611 21.5 18 21.5
                curveTo(
                    x1 = 1.0f,
                    y1 = 17.271f,
                    x2 = 8.611f,
                    y2 = 21.5f,
                    x3 = 18.0f,
                    y3 = 21.5f,
                )
                // s 17 -4.229 17 -9.444
                reflectiveCurveToRelative(
                    dx1 = 17.0f,
                    dy1 = -4.229f,
                    dx2 = 17.0f,
                    dy2 = -9.444f,
                )
                // c 0 -0.863 -0.226 -1.664 -0.615 -2.412z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.863f,
                    dx2 = -0.226f,
                    dy2 = -1.664f,
                    dx3 = -0.615f,
                    dy3 = -2.412f,
                )
                close()
                // M 31.882 6.952
                moveTo(x = 31.882f, y = 6.952f)
                // c -1.357 -0.938 -3.102 -1.694 -5.121 -2.25
                curveToRelative(
                    dx1 = -1.357f,
                    dy1 = -0.938f,
                    dx2 = -3.102f,
                    dy2 = -1.694f,
                    dx3 = -5.121f,
                    dy3 = -2.25f,
                )
                // c 1.875 -0.576 4.551 -0.309 5.121 2.25z
                curveToRelative(
                    dx1 = 1.875f,
                    dy1 = -0.576f,
                    dx2 = 4.551f,
                    dy2 = -0.309f,
                    dx3 = 5.121f,
                    dy3 = 2.25f,
                )
                close()
            }
            // M3 13 a15 7 0 1 0 30 0 a15 7 0 1 0 -30 0z
            path(
                fill = SolidColor(Color(0xFF8A4B38)),
            ) {
                // M 3 13
                moveTo(x = 3.0f, y = 13.0f)
                // a 15 7 0 1 0 30 0
                arcToRelative(
                    a = 15.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 30.0f,
                    dy1 = 0.0f,
                )
                // a 15 7 0 1 0 -30 0z
                arcToRelative(
                    a = 15.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -30.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M20 17 c-0.256 0 -0.512 -0.098 -0.707 -0.293 -2.337 -2.337 -2.376 -4.885 -0.125 -8.262 0.739 -1.109 0.9 -2.246 0.478 -3.377 -0.461 -1.236 -1.438 -1.996 -1.731 -2.077 -0.553 0 -0.958 -0.443 -0.958 -0.996 0 -0.552 0.491 -0.995 1.043 -0.995 0.997 0 2.395 1.153 3.183 2.625 1.034 1.933 0.91 4.039 -0.351 5.929 -1.961 2.942 -1.531 4.332 -0.125 5.738 0.391 0.391 0.391 1.023 0 1.414 -0.195 0.196 -0.451 0.294 -0.707 0.294z M14 15 c-0.256 0 -0.512 -0.098 -0.707 -0.293 -2.337 -2.337 -2.376 -4.885 -0.125 -8.262 0.727 -1.091 0.893 -2.083 0.494 -2.947 -0.444 -0.961 -1.431 -1.469 -1.684 -1.499 -0.552 0 -0.989 -0.447 -0.989 -1 0 -0.552 0.458 -1 1.011 -1 0.997 0 2.585 0.974 3.36 2.423 0.481 0.899 1.052 2.761 -0.528 5.131 -1.961 2.942 -1.531 4.332 -0.125 5.738 0.391 0.391 0.391 1.023 0 1.414 -0.195 0.197 -0.451 0.295 -0.707 0.295z
            path(
                fill = SolidColor(Color(0xFFD99E82)),
            ) {
                // M 20 17
                moveTo(x = 20.0f, y = 17.0f)
                // c -0.256 0 -0.512 -0.098 -0.707 -0.293
                curveToRelative(
                    dx1 = -0.256f,
                    dy1 = 0.0f,
                    dx2 = -0.512f,
                    dy2 = -0.098f,
                    dx3 = -0.707f,
                    dy3 = -0.293f,
                )
                // c -2.337 -2.337 -2.376 -4.885 -0.125 -8.262
                curveToRelative(
                    dx1 = -2.337f,
                    dy1 = -2.337f,
                    dx2 = -2.376f,
                    dy2 = -4.885f,
                    dx3 = -0.125f,
                    dy3 = -8.262f,
                )
                // c 0.739 -1.109 0.9 -2.246 0.478 -3.377
                curveToRelative(
                    dx1 = 0.739f,
                    dy1 = -1.109f,
                    dx2 = 0.9f,
                    dy2 = -2.246f,
                    dx3 = 0.478f,
                    dy3 = -3.377f,
                )
                // c -0.461 -1.236 -1.438 -1.996 -1.731 -2.077
                curveToRelative(
                    dx1 = -0.461f,
                    dy1 = -1.236f,
                    dx2 = -1.438f,
                    dy2 = -1.996f,
                    dx3 = -1.731f,
                    dy3 = -2.077f,
                )
                // c -0.553 0 -0.958 -0.443 -0.958 -0.996
                curveToRelative(
                    dx1 = -0.553f,
                    dy1 = 0.0f,
                    dx2 = -0.958f,
                    dy2 = -0.443f,
                    dx3 = -0.958f,
                    dy3 = -0.996f,
                )
                // c 0 -0.552 0.491 -0.995 1.043 -0.995
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = 0.491f,
                    dy2 = -0.995f,
                    dx3 = 1.043f,
                    dy3 = -0.995f,
                )
                // c 0.997 0 2.395 1.153 3.183 2.625
                curveToRelative(
                    dx1 = 0.997f,
                    dy1 = 0.0f,
                    dx2 = 2.395f,
                    dy2 = 1.153f,
                    dx3 = 3.183f,
                    dy3 = 2.625f,
                )
                // c 1.034 1.933 0.91 4.039 -0.351 5.929
                curveToRelative(
                    dx1 = 1.034f,
                    dy1 = 1.933f,
                    dx2 = 0.91f,
                    dy2 = 4.039f,
                    dx3 = -0.351f,
                    dy3 = 5.929f,
                )
                // c -1.961 2.942 -1.531 4.332 -0.125 5.738
                curveToRelative(
                    dx1 = -1.961f,
                    dy1 = 2.942f,
                    dx2 = -1.531f,
                    dy2 = 4.332f,
                    dx3 = -0.125f,
                    dy3 = 5.738f,
                )
                // c 0.391 0.391 0.391 1.023 0 1.414
                curveToRelative(
                    dx1 = 0.391f,
                    dy1 = 0.391f,
                    dx2 = 0.391f,
                    dy2 = 1.023f,
                    dx3 = 0.0f,
                    dy3 = 1.414f,
                )
                // c -0.195 0.196 -0.451 0.294 -0.707 0.294z
                curveToRelative(
                    dx1 = -0.195f,
                    dy1 = 0.196f,
                    dx2 = -0.451f,
                    dy2 = 0.294f,
                    dx3 = -0.707f,
                    dy3 = 0.294f,
                )
                close()
                // M 14 15
                moveTo(x = 14.0f, y = 15.0f)
                // c -0.256 0 -0.512 -0.098 -0.707 -0.293
                curveToRelative(
                    dx1 = -0.256f,
                    dy1 = 0.0f,
                    dx2 = -0.512f,
                    dy2 = -0.098f,
                    dx3 = -0.707f,
                    dy3 = -0.293f,
                )
                // c -2.337 -2.337 -2.376 -4.885 -0.125 -8.262
                curveToRelative(
                    dx1 = -2.337f,
                    dy1 = -2.337f,
                    dx2 = -2.376f,
                    dy2 = -4.885f,
                    dx3 = -0.125f,
                    dy3 = -8.262f,
                )
                // c 0.727 -1.091 0.893 -2.083 0.494 -2.947
                curveToRelative(
                    dx1 = 0.727f,
                    dy1 = -1.091f,
                    dx2 = 0.893f,
                    dy2 = -2.083f,
                    dx3 = 0.494f,
                    dy3 = -2.947f,
                )
                // c -0.444 -0.961 -1.431 -1.469 -1.684 -1.499
                curveToRelative(
                    dx1 = -0.444f,
                    dy1 = -0.961f,
                    dx2 = -1.431f,
                    dy2 = -1.469f,
                    dx3 = -1.684f,
                    dy3 = -1.499f,
                )
                // c -0.552 0 -0.989 -0.447 -0.989 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -0.989f,
                    dy2 = -0.447f,
                    dx3 = -0.989f,
                    dy3 = -1.0f,
                )
                // c 0 -0.552 0.458 -1 1.011 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = 0.458f,
                    dy2 = -1.0f,
                    dx3 = 1.011f,
                    dy3 = -1.0f,
                )
                // c 0.997 0 2.585 0.974 3.36 2.423
                curveToRelative(
                    dx1 = 0.997f,
                    dy1 = 0.0f,
                    dx2 = 2.585f,
                    dy2 = 0.974f,
                    dx3 = 3.36f,
                    dy3 = 2.423f,
                )
                // c 0.481 0.899 1.052 2.761 -0.528 5.131
                curveToRelative(
                    dx1 = 0.481f,
                    dy1 = 0.899f,
                    dx2 = 1.052f,
                    dy2 = 2.761f,
                    dx3 = -0.528f,
                    dy3 = 5.131f,
                )
                // c -1.961 2.942 -1.531 4.332 -0.125 5.738
                curveToRelative(
                    dx1 = -1.961f,
                    dy1 = 2.942f,
                    dx2 = -1.531f,
                    dy2 = 4.332f,
                    dx3 = -0.125f,
                    dy3 = 5.738f,
                )
                // c 0.391 0.391 0.391 1.023 0 1.414
                curveToRelative(
                    dx1 = 0.391f,
                    dy1 = 0.391f,
                    dx2 = 0.391f,
                    dy2 = 1.023f,
                    dx3 = 0.0f,
                    dy3 = 1.414f,
                )
                // c -0.195 0.197 -0.451 0.295 -0.707 0.295z
                curveToRelative(
                    dx1 = -0.195f,
                    dy1 = 0.197f,
                    dx2 = -0.451f,
                    dy2 = 0.295f,
                    dx3 = -0.707f,
                    dy3 = 0.295f,
                )
                close()
            }
        }.build().also { _emoji2615 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji2615: ImageVector? = null
