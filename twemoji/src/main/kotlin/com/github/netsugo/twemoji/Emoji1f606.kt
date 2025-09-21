package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f606: ImageVector
    get() {
        val current = _emoji1f606
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f606",
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
            // M18 22 c-3.623 0 -6.027 -0.422 -9 -1 -0.679 -0.131 -2 0 -2 2 0 4 4.595 9 11 9 6.404 0 11 -5 11 -9 0 -2 -1.321 -2.132 -2 -2 -2.973 0.578 -5.377 1 -9 1z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 18 22
                moveTo(x = 18.0f, y = 22.0f)
                // c -3.623 0 -6.027 -0.422 -9 -1
                curveToRelative(
                    dx1 = -3.623f,
                    dy1 = 0.0f,
                    dx2 = -6.027f,
                    dy2 = -0.422f,
                    dx3 = -9.0f,
                    dy3 = -1.0f,
                )
                // c -0.679 -0.131 -2 0 -2 2
                curveToRelative(
                    dx1 = -0.679f,
                    dy1 = -0.131f,
                    dx2 = -2.0f,
                    dy2 = 0.0f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // c 0 4 4.595 9 11 9
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.0f,
                    dx2 = 4.595f,
                    dy2 = 9.0f,
                    dx3 = 11.0f,
                    dy3 = 9.0f,
                )
                // c 6.404 0 11 -5 11 -9
                curveToRelative(
                    dx1 = 6.404f,
                    dy1 = 0.0f,
                    dx2 = 11.0f,
                    dy2 = -5.0f,
                    dx3 = 11.0f,
                    dy3 = -9.0f,
                )
                // c 0 -2 -1.321 -2.132 -2 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                    dx2 = -1.321f,
                    dy2 = -2.132f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // c -2.973 0.578 -5.377 1 -9 1z
                curveToRelative(
                    dx1 = -2.973f,
                    dy1 = 0.578f,
                    dx2 = -5.377f,
                    dy2 = 1.0f,
                    dx3 = -9.0f,
                    dy3 = 1.0f,
                )
                close()
            }
            // M9 23 s3 1 9 1 9 -1 9 -1 -2 4 -9 4 -9 -4 -9 -4z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 9 23
                moveTo(x = 9.0f, y = 23.0f)
                // s 3 1 9 1
                reflectiveCurveToRelative(
                    dx1 = 3.0f,
                    dy1 = 1.0f,
                    dx2 = 9.0f,
                    dy2 = 1.0f,
                )
                // s 9 -1 9 -1
                reflectiveCurveToRelative(
                    dx1 = 9.0f,
                    dy1 = -1.0f,
                    dx2 = 9.0f,
                    dy2 = -1.0f,
                )
                // s -2 4 -9 4
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 4.0f,
                    dx2 = -9.0f,
                    dy2 = 4.0f,
                )
                // s -9 -4 -9 -4z
                reflectiveCurveToRelative(
                    dx1 = -9.0f,
                    dy1 = -4.0f,
                    dx2 = -9.0f,
                    dy2 = -4.0f,
                )
                close()
            }
            // M6.001 20 c-0.304 0 -0.604 -0.138 -0.801 -0.4 -0.332 -0.441 -0.242 -1.068 0.2 -1.399 0.143 -0.107 2.951 -2.183 6.856 -2.933 C9.781 14.027 7.034 14 6.999 14 c-0.552 -0.002 -0.999 -0.45 -0.998 -1.002 0 -0.551 0.447 -0.998 0.999 -0.998 0.221 0 5.452 0.038 8.707 3.293 0.286 0.286 0.372 0.716 0.217 1.09 -0.155 0.374 -0.52 0.617 -0.924 0.617 -4.613 0 -8.363 2.772 -8.4 2.8 -0.18 0.135 -0.391 0.2 -0.599 0.2z M29.999 19.999 c-0.208 0 -0.418 -0.064 -0.598 -0.198 C29.363 19.772 25.59 17 21 17 c-0.404 0 -0.77 -0.243 -0.924 -0.617 -0.155 -0.374 -0.069 -0.804 0.217 -1.09 C23.549 12.038 28.779 12 29 12 c0.552 0 0.998 0.447 0.999 0.998 0.001 0.552 -0.446 1 -0.997 1.002 -0.036 0 -2.783 0.027 -5.258 1.268 3.905 0.75 6.713 2.825 6.855 2.933 0.441 0.331 0.531 0.956 0.201 1.398 -0.196 0.261 -0.496 0.4 -0.801 0.4z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 6.001 20
                moveTo(x = 6.001f, y = 20.0f)
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
                // C 9.781 14.027 7.034 14 6.999 14
                curveTo(
                    x1 = 9.781f,
                    y1 = 14.027f,
                    x2 = 7.034f,
                    y2 = 14.0f,
                    x3 = 6.999f,
                    y3 = 14.0f,
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
                // c -0.155 0.374 -0.52 0.617 -0.924 0.617
                curveToRelative(
                    dx1 = -0.155f,
                    dy1 = 0.374f,
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
                // M 29.999 19.999
                moveTo(x = 29.999f, y = 19.999f)
                // c -0.208 0 -0.418 -0.064 -0.598 -0.198
                curveToRelative(
                    dx1 = -0.208f,
                    dy1 = 0.0f,
                    dx2 = -0.418f,
                    dy2 = -0.064f,
                    dx3 = -0.598f,
                    dy3 = -0.198f,
                )
                // C 29.363 19.772 25.59 17 21 17
                curveTo(
                    x1 = 29.363f,
                    y1 = 19.772f,
                    x2 = 25.59f,
                    y2 = 17.0f,
                    x3 = 21.0f,
                    y3 = 17.0f,
                )
                // c -0.404 0 -0.77 -0.243 -0.924 -0.617
                curveToRelative(
                    dx1 = -0.404f,
                    dy1 = 0.0f,
                    dx2 = -0.77f,
                    dy2 = -0.243f,
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
                // C 23.549 12.038 28.779 12 29 12
                curveTo(
                    x1 = 23.549f,
                    y1 = 12.038f,
                    x2 = 28.779f,
                    y2 = 12.0f,
                    x3 = 29.0f,
                    y3 = 12.0f,
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
                // c 3.905 0.75 6.713 2.825 6.855 2.933
                curveToRelative(
                    dx1 = 3.905f,
                    dy1 = 0.75f,
                    dx2 = 6.713f,
                    dy2 = 2.825f,
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
        }.build().also { _emoji1f606 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f606: ImageVector? = null
