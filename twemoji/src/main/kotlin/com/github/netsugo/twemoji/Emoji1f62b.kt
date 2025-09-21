package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f62b: ImageVector
    get() {
        val current = _emoji1f62b
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f62b",
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
            // M18 21.5 c-9.333 0 -10.485 8.354 -10.496 8.438 -0.021 0.171 0.046 0.34 0.179 0.449 0.09 0.074 0.203 0.113 0.317 0.113 0.053 0 0.106 -0.009 0.158 -0.025 0.059 -0.02 5.968 -1.975 9.842 -1.975 5.595 0 9.745 1.933 9.786 1.952 0.161 0.077 0.358 0.06 0.507 -0.047 0.147 -0.107 0.226 -0.286 0.203 -0.468 C28.485 29.854 27.333 21.5 18 21.5z M29 10 c-5.554 0 -7.802 -4.367 -7.895 -4.553 -0.247 -0.494 -0.047 -1.095 0.447 -1.342 0.493 -0.246 1.092 -0.048 1.34 0.443 C22.967 4.694 24.713 8 29 8 c0.553 0 1 0.448 1 1 s-0.447 1 -1 1z M7 10 c-0.552 0 -1 -0.448 -1 -1 s0.448 -1 1 -1 c5.083 0 5.996 -3.12 6.033 -3.253 0.145 -0.528 0.692 -0.848 1.219 -0.709 0.53 0.139 0.851 0.673 0.718 1.205 C14.921 5.437 13.704 10 7 10z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 18 21.5
                moveTo(x = 18.0f, y = 21.5f)
                // c -9.333 0 -10.485 8.354 -10.496 8.438
                curveToRelative(
                    dx1 = -9.333f,
                    dy1 = 0.0f,
                    dx2 = -10.485f,
                    dy2 = 8.354f,
                    dx3 = -10.496f,
                    dy3 = 8.438f,
                )
                // c -0.021 0.171 0.046 0.34 0.179 0.449
                curveToRelative(
                    dx1 = -0.021f,
                    dy1 = 0.171f,
                    dx2 = 0.046f,
                    dy2 = 0.34f,
                    dx3 = 0.179f,
                    dy3 = 0.449f,
                )
                // c 0.09 0.074 0.203 0.113 0.317 0.113
                curveToRelative(
                    dx1 = 0.09f,
                    dy1 = 0.074f,
                    dx2 = 0.203f,
                    dy2 = 0.113f,
                    dx3 = 0.317f,
                    dy3 = 0.113f,
                )
                // c 0.053 0 0.106 -0.009 0.158 -0.025
                curveToRelative(
                    dx1 = 0.053f,
                    dy1 = 0.0f,
                    dx2 = 0.106f,
                    dy2 = -0.009f,
                    dx3 = 0.158f,
                    dy3 = -0.025f,
                )
                // c 0.059 -0.02 5.968 -1.975 9.842 -1.975
                curveToRelative(
                    dx1 = 0.059f,
                    dy1 = -0.02f,
                    dx2 = 5.968f,
                    dy2 = -1.975f,
                    dx3 = 9.842f,
                    dy3 = -1.975f,
                )
                // c 5.595 0 9.745 1.933 9.786 1.952
                curveToRelative(
                    dx1 = 5.595f,
                    dy1 = 0.0f,
                    dx2 = 9.745f,
                    dy2 = 1.933f,
                    dx3 = 9.786f,
                    dy3 = 1.952f,
                )
                // c 0.161 0.077 0.358 0.06 0.507 -0.047
                curveToRelative(
                    dx1 = 0.161f,
                    dy1 = 0.077f,
                    dx2 = 0.358f,
                    dy2 = 0.06f,
                    dx3 = 0.507f,
                    dy3 = -0.047f,
                )
                // c 0.147 -0.107 0.226 -0.286 0.203 -0.468
                curveToRelative(
                    dx1 = 0.147f,
                    dy1 = -0.107f,
                    dx2 = 0.226f,
                    dy2 = -0.286f,
                    dx3 = 0.203f,
                    dy3 = -0.468f,
                )
                // C 28.485 29.854 27.333 21.5 18 21.5z
                curveTo(
                    x1 = 28.485f,
                    y1 = 29.854f,
                    x2 = 27.333f,
                    y2 = 21.5f,
                    x3 = 18.0f,
                    y3 = 21.5f,
                )
                close()
                // M 29 10
                moveTo(x = 29.0f, y = 10.0f)
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
                // c 0.493 -0.246 1.092 -0.048 1.34 0.443
                curveToRelative(
                    dx1 = 0.493f,
                    dy1 = -0.246f,
                    dx2 = 1.092f,
                    dy2 = -0.048f,
                    dx3 = 1.34f,
                    dy3 = 0.443f,
                )
                // C 22.967 4.694 24.713 8 29 8
                curveTo(
                    x1 = 22.967f,
                    y1 = 4.694f,
                    x2 = 24.713f,
                    y2 = 8.0f,
                    x3 = 29.0f,
                    y3 = 8.0f,
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
                // M 7 10
                moveTo(x = 7.0f, y = 10.0f)
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
                // C 14.921 5.437 13.704 10 7 10z
                curveTo(
                    x1 = 14.921f,
                    y1 = 5.437f,
                    x2 = 13.704f,
                    y2 = 10.0f,
                    x3 = 7.0f,
                    y3 = 10.0f,
                )
                close()
            }
            // M18 23 c4 0 6 2 6 2 H12 s2 -2 6 -2z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 18 23
                moveTo(x = 18.0f, y = 23.0f)
                // c 4 0 6 2 6 2
                curveToRelative(
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                    dx2 = 6.0f,
                    dy2 = 2.0f,
                    dx3 = 6.0f,
                    dy3 = 2.0f,
                )
                // H 12
                horizontalLineTo(x = 12.0f)
                // s 2 -2 6 -2z
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                    dx2 = 6.0f,
                    dy2 = -2.0f,
                )
                close()
            }
            // M6.001 19 c-0.304 0 -0.604 -0.138 -0.801 -0.4 -0.332 -0.441 -0.242 -1.068 0.2 -1.399 0.143 -0.107 2.951 -2.183 6.856 -2.933 C9.781 13.027 7.034 13 6.999 13 c-0.552 -0.002 -0.999 -0.45 -0.998 -1.002 0 -0.551 0.447 -0.998 0.999 -0.998 0.221 0 5.452 0.038 8.707 3.293 0.286 0.286 0.372 0.716 0.217 1.09 -0.155 0.373 -0.52 0.617 -0.924 0.617 -4.613 0 -8.363 2.772 -8.4 2.8 -0.18 0.135 -0.391 0.2 -0.599 0.2z M29.999 18.999 c-0.208 0 -0.418 -0.064 -0.598 -0.198 C29.363 18.772 25.59 16 21 16 c-0.404 0 -0.77 -0.244 -0.924 -0.617 -0.155 -0.374 -0.069 -0.804 0.217 -1.09 C23.549 11.038 28.779 11 29 11 c0.552 0 0.998 0.447 0.999 0.998 0.001 0.552 -0.446 1 -0.997 1.002 -0.036 0 -2.783 0.027 -5.258 1.268 3.905 0.75 6.713 2.826 6.855 2.933 0.441 0.331 0.531 0.956 0.201 1.398 -0.196 0.261 -0.496 0.4 -0.801 0.4z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 6.001 19
                moveTo(x = 6.001f, y = 19.0f)
                // c -0.304 0 -0.604 -0.138 -0.801 -0.4
                curveToRelative(
                    dx1 = -0.304f,
                    dy1 = 0.0f,
                    dx2 = -0.604f,
                    dy2 = -0.138f,
                    dx3 = -0.801f,
                    dy3 = -0.4f,
                )
                // c -0.332 -0.441 -0.242 -1.068 0.2 -1.399
                curveToRelative(
                    dx1 = -0.332f,
                    dy1 = -0.441f,
                    dx2 = -0.242f,
                    dy2 = -1.068f,
                    dx3 = 0.2f,
                    dy3 = -1.399f,
                )
                // c 0.143 -0.107 2.951 -2.183 6.856 -2.933
                curveToRelative(
                    dx1 = 0.143f,
                    dy1 = -0.107f,
                    dx2 = 2.951f,
                    dy2 = -2.183f,
                    dx3 = 6.856f,
                    dy3 = -2.933f,
                )
                // C 9.781 13.027 7.034 13 6.999 13
                curveTo(
                    x1 = 9.781f,
                    y1 = 13.027f,
                    x2 = 7.034f,
                    y2 = 13.0f,
                    x3 = 6.999f,
                    y3 = 13.0f,
                )
                // c -0.552 -0.002 -0.999 -0.45 -0.998 -1.002
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = -0.002f,
                    dx2 = -0.999f,
                    dy2 = -0.45f,
                    dx3 = -0.998f,
                    dy3 = -1.002f,
                )
                // c 0 -0.551 0.447 -0.998 0.999 -0.998
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.551f,
                    dx2 = 0.447f,
                    dy2 = -0.998f,
                    dx3 = 0.999f,
                    dy3 = -0.998f,
                )
                // c 0.221 0 5.452 0.038 8.707 3.293
                curveToRelative(
                    dx1 = 0.221f,
                    dy1 = 0.0f,
                    dx2 = 5.452f,
                    dy2 = 0.038f,
                    dx3 = 8.707f,
                    dy3 = 3.293f,
                )
                // c 0.286 0.286 0.372 0.716 0.217 1.09
                curveToRelative(
                    dx1 = 0.286f,
                    dy1 = 0.286f,
                    dx2 = 0.372f,
                    dy2 = 0.716f,
                    dx3 = 0.217f,
                    dy3 = 1.09f,
                )
                // c -0.155 0.373 -0.52 0.617 -0.924 0.617
                curveToRelative(
                    dx1 = -0.155f,
                    dy1 = 0.373f,
                    dx2 = -0.52f,
                    dy2 = 0.617f,
                    dx3 = -0.924f,
                    dy3 = 0.617f,
                )
                // c -4.613 0 -8.363 2.772 -8.4 2.8
                curveToRelative(
                    dx1 = -4.613f,
                    dy1 = 0.0f,
                    dx2 = -8.363f,
                    dy2 = 2.772f,
                    dx3 = -8.4f,
                    dy3 = 2.8f,
                )
                // c -0.18 0.135 -0.391 0.2 -0.599 0.2z
                curveToRelative(
                    dx1 = -0.18f,
                    dy1 = 0.135f,
                    dx2 = -0.391f,
                    dy2 = 0.2f,
                    dx3 = -0.599f,
                    dy3 = 0.2f,
                )
                close()
                // M 29.999 18.999
                moveTo(x = 29.999f, y = 18.999f)
                // c -0.208 0 -0.418 -0.064 -0.598 -0.198
                curveToRelative(
                    dx1 = -0.208f,
                    dy1 = 0.0f,
                    dx2 = -0.418f,
                    dy2 = -0.064f,
                    dx3 = -0.598f,
                    dy3 = -0.198f,
                )
                // C 29.363 18.772 25.59 16 21 16
                curveTo(
                    x1 = 29.363f,
                    y1 = 18.772f,
                    x2 = 25.59f,
                    y2 = 16.0f,
                    x3 = 21.0f,
                    y3 = 16.0f,
                )
                // c -0.404 0 -0.77 -0.244 -0.924 -0.617
                curveToRelative(
                    dx1 = -0.404f,
                    dy1 = 0.0f,
                    dx2 = -0.77f,
                    dy2 = -0.244f,
                    dx3 = -0.924f,
                    dy3 = -0.617f,
                )
                // c -0.155 -0.374 -0.069 -0.804 0.217 -1.09
                curveToRelative(
                    dx1 = -0.155f,
                    dy1 = -0.374f,
                    dx2 = -0.069f,
                    dy2 = -0.804f,
                    dx3 = 0.217f,
                    dy3 = -1.09f,
                )
                // C 23.549 11.038 28.779 11 29 11
                curveTo(
                    x1 = 23.549f,
                    y1 = 11.038f,
                    x2 = 28.779f,
                    y2 = 11.0f,
                    x3 = 29.0f,
                    y3 = 11.0f,
                )
                // c 0.552 0 0.998 0.447 0.999 0.998
                curveToRelative(
                    dx1 = 0.552f,
                    dy1 = 0.0f,
                    dx2 = 0.998f,
                    dy2 = 0.447f,
                    dx3 = 0.999f,
                    dy3 = 0.998f,
                )
                // c 0.001 0.552 -0.446 1 -0.997 1.002
                curveToRelative(
                    dx1 = 0.001f,
                    dy1 = 0.552f,
                    dx2 = -0.446f,
                    dy2 = 1.0f,
                    dx3 = -0.997f,
                    dy3 = 1.002f,
                )
                // c -0.036 0 -2.783 0.027 -5.258 1.268
                curveToRelative(
                    dx1 = -0.036f,
                    dy1 = 0.0f,
                    dx2 = -2.783f,
                    dy2 = 0.027f,
                    dx3 = -5.258f,
                    dy3 = 1.268f,
                )
                // c 3.905 0.75 6.713 2.826 6.855 2.933
                curveToRelative(
                    dx1 = 3.905f,
                    dy1 = 0.75f,
                    dx2 = 6.713f,
                    dy2 = 2.826f,
                    dx3 = 6.855f,
                    dy3 = 2.933f,
                )
                // c 0.441 0.331 0.531 0.956 0.201 1.398
                curveToRelative(
                    dx1 = 0.441f,
                    dy1 = 0.331f,
                    dx2 = 0.531f,
                    dy2 = 0.956f,
                    dx3 = 0.201f,
                    dy3 = 1.398f,
                )
                // c -0.196 0.261 -0.496 0.4 -0.801 0.4z
                curveToRelative(
                    dx1 = -0.196f,
                    dy1 = 0.261f,
                    dx2 = -0.496f,
                    dy2 = 0.4f,
                    dx3 = -0.801f,
                    dy3 = 0.4f,
                )
                close()
            }
        }.build().also { _emoji1f62b = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f62b: ImageVector? = null
