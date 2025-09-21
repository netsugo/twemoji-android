package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f424: ImageVector
    get() {
        val current = _emoji1f424
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f424",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M8.512 15.93 c0 1.657 1.974 2 -0.512 2 -2.485 0 -6 -1 -6 -2 s1.526 -3 4.012 -3 2.5 1.343 2.5 3z
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 8.512 15.93
                moveTo(x = 8.512f, y = 15.93f)
                // c 0 1.657 1.974 2 -0.512 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.657f,
                    dx2 = 1.974f,
                    dy2 = 2.0f,
                    dx3 = -0.512f,
                    dy3 = 2.0f,
                )
                // c -2.485 0 -6 -1 -6 -2
                curveToRelative(
                    dx1 = -2.485f,
                    dy1 = 0.0f,
                    dx2 = -6.0f,
                    dy2 = -1.0f,
                    dx3 = -6.0f,
                    dy3 = -2.0f,
                )
                // s 1.526 -3 4.012 -3
                reflectiveCurveToRelative(
                    dx1 = 1.526f,
                    dy1 = -3.0f,
                    dx2 = 4.012f,
                    dy2 = -3.0f,
                )
                // s 2.5 1.343 2.5 3z
                reflectiveCurveToRelative(
                    dx1 = 2.5f,
                    dy1 = 1.343f,
                    dx2 = 2.5f,
                    dy2 = 3.0f,
                )
                close()
            }
            // M27.88 33.027 c-0.098 -0.18 -0.25 -0.302 -0.418 -0.391 C25.865 30.931 27 28.93 27 28.93 c0 -0.553 1 -2 0 -2 l-1 1 c-1 1 -1 4 -1 4 h-2 c-0.553 0 -1 0.447 -1 1 0 0.553 0.447 1 1 1 h1.107 l-0.222 0.12 c-0.486 0.263 -0.667 0.869 -0.404 1.355 s0.869 0.667 1.356 0.404 l2.639 -1.427 c0.486 -0.262 0.667 -0.868 0.404 -1.355z M20.88 33.027 c-0.098 -0.18 -0.25 -0.302 -0.418 -0.391 C18.865 30.931 20 28.93 20 28.93 c0 -0.553 1 -2 0 -2 l-1 1 c-1 1 -1 4 -1 4 h-2 c-0.553 0 -1 0.447 -1 1 0 0.553 0.447 1 1 1 h1.108 l-0.222 0.12 c-0.486 0.263 -0.667 0.869 -0.404 1.355 s0.869 0.667 1.356 0.404 l2.639 -1.427 c0.485 -0.262 0.666 -0.868 0.403 -1.355z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 27.88 33.027
                moveTo(x = 27.88f, y = 33.027f)
                // c -0.098 -0.18 -0.25 -0.302 -0.418 -0.391
                curveToRelative(
                    dx1 = -0.098f,
                    dy1 = -0.18f,
                    dx2 = -0.25f,
                    dy2 = -0.302f,
                    dx3 = -0.418f,
                    dy3 = -0.391f,
                )
                // C 25.865 30.931 27 28.93 27 28.93
                curveTo(
                    x1 = 25.865f,
                    y1 = 30.931f,
                    x2 = 27.0f,
                    y2 = 28.93f,
                    x3 = 27.0f,
                    y3 = 28.93f,
                )
                // c 0 -0.553 1 -2 0 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.553f,
                    dx2 = 1.0f,
                    dy2 = -2.0f,
                    dx3 = 0.0f,
                    dy3 = -2.0f,
                )
                // l -1 1
                lineToRelative(dx = -1.0f, dy = 1.0f)
                // c -1 1 -1 4 -1 4
                curveToRelative(
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                    dx2 = -1.0f,
                    dy2 = 4.0f,
                    dx3 = -1.0f,
                    dy3 = 4.0f,
                )
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // c -0.553 0 -1 0.447 -1 1
                curveToRelative(
                    dx1 = -0.553f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = 0.447f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // c 0 0.553 0.447 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = 0.447f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // h 1.107
                horizontalLineToRelative(dx = 1.107f)
                // l -0.222 0.12
                lineToRelative(dx = -0.222f, dy = 0.12f)
                // c -0.486 0.263 -0.667 0.869 -0.404 1.355
                curveToRelative(
                    dx1 = -0.486f,
                    dy1 = 0.263f,
                    dx2 = -0.667f,
                    dy2 = 0.869f,
                    dx3 = -0.404f,
                    dy3 = 1.355f,
                )
                // s 0.869 0.667 1.356 0.404
                reflectiveCurveToRelative(
                    dx1 = 0.869f,
                    dy1 = 0.667f,
                    dx2 = 1.356f,
                    dy2 = 0.404f,
                )
                // l 2.639 -1.427
                lineToRelative(dx = 2.639f, dy = -1.427f)
                // c 0.486 -0.262 0.667 -0.868 0.404 -1.355z
                curveToRelative(
                    dx1 = 0.486f,
                    dy1 = -0.262f,
                    dx2 = 0.667f,
                    dy2 = -0.868f,
                    dx3 = 0.404f,
                    dy3 = -1.355f,
                )
                close()
                // M 20.88 33.027
                moveTo(x = 20.88f, y = 33.027f)
                // c -0.098 -0.18 -0.25 -0.302 -0.418 -0.391
                curveToRelative(
                    dx1 = -0.098f,
                    dy1 = -0.18f,
                    dx2 = -0.25f,
                    dy2 = -0.302f,
                    dx3 = -0.418f,
                    dy3 = -0.391f,
                )
                // C 18.865 30.931 20 28.93 20 28.93
                curveTo(
                    x1 = 18.865f,
                    y1 = 30.931f,
                    x2 = 20.0f,
                    y2 = 28.93f,
                    x3 = 20.0f,
                    y3 = 28.93f,
                )
                // c 0 -0.553 1 -2 0 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.553f,
                    dx2 = 1.0f,
                    dy2 = -2.0f,
                    dx3 = 0.0f,
                    dy3 = -2.0f,
                )
                // l -1 1
                lineToRelative(dx = -1.0f, dy = 1.0f)
                // c -1 1 -1 4 -1 4
                curveToRelative(
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                    dx2 = -1.0f,
                    dy2 = 4.0f,
                    dx3 = -1.0f,
                    dy3 = 4.0f,
                )
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // c -0.553 0 -1 0.447 -1 1
                curveToRelative(
                    dx1 = -0.553f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = 0.447f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // c 0 0.553 0.447 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = 0.447f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // h 1.108
                horizontalLineToRelative(dx = 1.108f)
                // l -0.222 0.12
                lineToRelative(dx = -0.222f, dy = 0.12f)
                // c -0.486 0.263 -0.667 0.869 -0.404 1.355
                curveToRelative(
                    dx1 = -0.486f,
                    dy1 = 0.263f,
                    dx2 = -0.667f,
                    dy2 = 0.869f,
                    dx3 = -0.404f,
                    dy3 = 1.355f,
                )
                // s 0.869 0.667 1.356 0.404
                reflectiveCurveToRelative(
                    dx1 = 0.869f,
                    dy1 = 0.667f,
                    dx2 = 1.356f,
                    dy2 = 0.404f,
                )
                // l 2.639 -1.427
                lineToRelative(dx = 2.639f, dy = -1.427f)
                // c 0.485 -0.262 0.666 -0.868 0.403 -1.355z
                curveToRelative(
                    dx1 = 0.485f,
                    dy1 = -0.262f,
                    dx2 = 0.666f,
                    dy2 = -0.868f,
                    dx3 = 0.403f,
                    dy3 = -1.355f,
                )
                close()
            }
            // M35.217 17.305 c-1.342 0 -7.904 4.613 -11.553 -5.375 -0.005 -0.014 -0.012 -0.024 -0.018 -0.038 -0.956 -3.453 -3.809 -6.113 -7.367 -6.789 l-0.037 -0.042 C18.389 3.684 19 4.707 19 3.93 c0 -1.179 -2.083 -1.303 -4 0.012 -1.917 -1.315 -4 -1.191 -4 -0.012 0 0.761 0.583 -0.208 2.623 1.044 C8.788 5.417 5 9.479 5 14.43 c0 4.478 3.103 8.223 7.273 9.227 1.003 4.171 4.748 7.273 9.227 7.273 3.953 0 6.934 -1.678 8.99 -3.999 0.555 -0.626 0.111 0.602 0.842 0.235 4.24 -2.132 5.168 -9.861 3.885 -9.861z
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 35.217 17.305
                moveTo(x = 35.217f, y = 17.305f)
                // c -1.342 0 -7.904 4.613 -11.553 -5.375
                curveToRelative(
                    dx1 = -1.342f,
                    dy1 = 0.0f,
                    dx2 = -7.904f,
                    dy2 = 4.613f,
                    dx3 = -11.553f,
                    dy3 = -5.375f,
                )
                // c -0.005 -0.014 -0.012 -0.024 -0.018 -0.038
                curveToRelative(
                    dx1 = -0.005f,
                    dy1 = -0.014f,
                    dx2 = -0.012f,
                    dy2 = -0.024f,
                    dx3 = -0.018f,
                    dy3 = -0.038f,
                )
                // c -0.956 -3.453 -3.809 -6.113 -7.367 -6.789
                curveToRelative(
                    dx1 = -0.956f,
                    dy1 = -3.453f,
                    dx2 = -3.809f,
                    dy2 = -6.113f,
                    dx3 = -7.367f,
                    dy3 = -6.789f,
                )
                // l -0.037 -0.042
                lineToRelative(dx = -0.037f, dy = -0.042f)
                // C 18.389 3.684 19 4.707 19 3.93
                curveTo(
                    x1 = 18.389f,
                    y1 = 3.684f,
                    x2 = 19.0f,
                    y2 = 4.707f,
                    x3 = 19.0f,
                    y3 = 3.93f,
                )
                // c 0 -1.179 -2.083 -1.303 -4 0.012
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.179f,
                    dx2 = -2.083f,
                    dy2 = -1.303f,
                    dx3 = -4.0f,
                    dy3 = 0.012f,
                )
                // c -1.917 -1.315 -4 -1.191 -4 -0.012
                curveToRelative(
                    dx1 = -1.917f,
                    dy1 = -1.315f,
                    dx2 = -4.0f,
                    dy2 = -1.191f,
                    dx3 = -4.0f,
                    dy3 = -0.012f,
                )
                // c 0 0.761 0.583 -0.208 2.623 1.044
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.761f,
                    dx2 = 0.583f,
                    dy2 = -0.208f,
                    dx3 = 2.623f,
                    dy3 = 1.044f,
                )
                // C 8.788 5.417 5 9.479 5 14.43
                curveTo(
                    x1 = 8.788f,
                    y1 = 5.417f,
                    x2 = 5.0f,
                    y2 = 9.479f,
                    x3 = 5.0f,
                    y3 = 14.43f,
                )
                // c 0 4.478 3.103 8.223 7.273 9.227
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.478f,
                    dx2 = 3.103f,
                    dy2 = 8.223f,
                    dx3 = 7.273f,
                    dy3 = 9.227f,
                )
                // c 1.003 4.171 4.748 7.273 9.227 7.273
                curveToRelative(
                    dx1 = 1.003f,
                    dy1 = 4.171f,
                    dx2 = 4.748f,
                    dy2 = 7.273f,
                    dx3 = 9.227f,
                    dy3 = 7.273f,
                )
                // c 3.953 0 6.934 -1.678 8.99 -3.999
                curveToRelative(
                    dx1 = 3.953f,
                    dy1 = 0.0f,
                    dx2 = 6.934f,
                    dy2 = -1.678f,
                    dx3 = 8.99f,
                    dy3 = -3.999f,
                )
                // c 0.555 -0.626 0.111 0.602 0.842 0.235
                curveToRelative(
                    dx1 = 0.555f,
                    dy1 = -0.626f,
                    dx2 = 0.111f,
                    dy2 = 0.602f,
                    dx3 = 0.842f,
                    dy3 = 0.235f,
                )
                // c 4.24 -2.132 5.168 -9.861 3.885 -9.861z
                curveToRelative(
                    dx1 = 4.24f,
                    dy1 = -2.132f,
                    dx2 = 5.168f,
                    dy2 = -9.861f,
                    dx3 = 3.885f,
                    dy3 = -9.861f,
                )
                close()
            }
            // M12.5 13.43 m-1.5 0 a1.5 1.5 0 1 1 3 0 a1.5 1.5 0 1 1 -3 0
            path(
                fill = SolidColor(Color(0xFF662113)),
            ) {
                // M 12.5 13.43
                moveTo(x = 12.5f, y = 13.43f)
                // m -1.5 0
                moveToRelative(dx = -1.5f, dy = 0.0f)
                // a 1.5 1.5 0 1 1 3 0
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = 0.0f,
                )
                // a 1.5 1.5 0 1 1 -3 0
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = 0.0f,
                )
            }
            // M21.81 15.93 s-2 10 10 10 c1 0 0 2 -4 2 s-9.999 -5 -7 -11 c0.633 -1.265 1 -1 1 -1z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 21.81 15.93
                moveTo(x = 21.81f, y = 15.93f)
                // s -2 10 10 10
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 10.0f,
                    dx2 = 10.0f,
                    dy2 = 10.0f,
                )
                // c 1 0 0 2 -4 2
                curveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                    dx2 = 0.0f,
                    dy2 = 2.0f,
                    dx3 = -4.0f,
                    dy3 = 2.0f,
                )
                // s -9.999 -5 -7 -11
                reflectiveCurveToRelative(
                    dx1 = -9.999f,
                    dy1 = -5.0f,
                    dx2 = -7.0f,
                    dy2 = -11.0f,
                )
                // c 0.633 -1.265 1 -1 1 -1z
                curveToRelative(
                    dx1 = 0.633f,
                    dy1 = -1.265f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                close()
            }
        }.build().also { _emoji1f424 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f424: ImageVector? = null
