package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f635: ImageVector
    get() {
        val current = _emoji1f635
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f635",
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
            // M13 27 a5 6 0 1 0 10 0 a5 6 0 1 0 -10 0z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 13 27
                moveTo(x = 13.0f, y = 27.0f)
                // a 5 6 0 1 0 10 0
                arcToRelative(
                    a = 5.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 10.0f,
                    dy1 = 0.0f,
                )
                // a 5 6 0 1 0 -10 0z
                arcToRelative(
                    a = 5.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -10.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M5.999 11 c-0.208 0 -0.419 -0.065 -0.599 -0.2 -0.442 -0.331 -0.531 -0.958 -0.2 -1.4 C8.462 5.05 12.816 5 13 5 c0.552 0 1 0.448 1 1 0 0.551 -0.445 0.998 -0.996 1 -0.155 0.002 -3.568 0.086 -6.204 3.6 -0.196 0.262 -0.497 0.4 -0.801 0.4z M30.001 11 c-0.305 0 -0.604 -0.138 -0.801 -0.4 -2.64 -3.521 -6.061 -3.598 -6.206 -3.6 -0.55 -0.006 -0.994 -0.456 -0.991 -1.005 C22.006 5.444 22.45 5 23 5 c0.184 0 4.537 0.05 7.8 4.4 0.332 0.442 0.242 1.069 -0.2 1.4 -0.18 0.135 -0.39 0.2 -0.599 0.2z M13.914 15.5 l1.793 -1.793 c0.391 -0.391 0.391 -1.023 0 -1.414 s-1.023 -0.391 -1.414 0 L12.5 14.086 l-1.793 -1.793 c-0.391 -0.391 -1.023 -0.391 -1.414 0 s-0.391 1.023 0 1.414 l1.793 1.793 -1.793 1.793 c-0.391 0.391 -0.391 1.023 0 1.414 0.195 0.195 0.451 0.293 0.707 0.293 s0.512 -0.098 0.707 -0.293 l1.793 -1.793 1.793 1.793 c0.195 0.195 0.451 0.293 0.707 0.293 s0.512 -0.098 0.707 -0.293 c0.391 -0.391 0.391 -1.023 0 -1.414 L13.914 15.5z M24.914 15.5 l1.793 -1.793 c0.391 -0.391 0.391 -1.023 0 -1.414 s-1.023 -0.391 -1.414 0 L23.5 14.086 l-1.793 -1.793 c-0.391 -0.391 -1.023 -0.391 -1.414 0 s-0.391 1.023 0 1.414 l1.793 1.793 -1.793 1.793 c-0.391 0.391 -0.391 1.023 0 1.414 0.195 0.195 0.451 0.293 0.707 0.293 s0.512 -0.098 0.707 -0.293 l1.793 -1.793 1.793 1.793 c0.195 0.195 0.451 0.293 0.707 0.293 s0.512 -0.098 0.707 -0.293 c0.391 -0.391 0.391 -1.023 0 -1.414 L24.914 15.5z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 5.999 11
                moveTo(x = 5.999f, y = 11.0f)
                // c -0.208 0 -0.419 -0.065 -0.599 -0.2
                curveToRelative(
                    dx1 = -0.208f,
                    dy1 = 0.0f,
                    dx2 = -0.419f,
                    dy2 = -0.065f,
                    dx3 = -0.599f,
                    dy3 = -0.2f,
                )
                // c -0.442 -0.331 -0.531 -0.958 -0.2 -1.4
                curveToRelative(
                    dx1 = -0.442f,
                    dy1 = -0.331f,
                    dx2 = -0.531f,
                    dy2 = -0.958f,
                    dx3 = -0.2f,
                    dy3 = -1.4f,
                )
                // C 8.462 5.05 12.816 5 13 5
                curveTo(
                    x1 = 8.462f,
                    y1 = 5.05f,
                    x2 = 12.816f,
                    y2 = 5.0f,
                    x3 = 13.0f,
                    y3 = 5.0f,
                )
                // c 0.552 0 1 0.448 1 1
                curveToRelative(
                    dx1 = 0.552f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.448f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // c 0 0.551 -0.445 0.998 -0.996 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.551f,
                    dx2 = -0.445f,
                    dy2 = 0.998f,
                    dx3 = -0.996f,
                    dy3 = 1.0f,
                )
                // c -0.155 0.002 -3.568 0.086 -6.204 3.6
                curveToRelative(
                    dx1 = -0.155f,
                    dy1 = 0.002f,
                    dx2 = -3.568f,
                    dy2 = 0.086f,
                    dx3 = -6.204f,
                    dy3 = 3.6f,
                )
                // c -0.196 0.262 -0.497 0.4 -0.801 0.4z
                curveToRelative(
                    dx1 = -0.196f,
                    dy1 = 0.262f,
                    dx2 = -0.497f,
                    dy2 = 0.4f,
                    dx3 = -0.801f,
                    dy3 = 0.4f,
                )
                close()
                // M 30.001 11
                moveTo(x = 30.001f, y = 11.0f)
                // c -0.305 0 -0.604 -0.138 -0.801 -0.4
                curveToRelative(
                    dx1 = -0.305f,
                    dy1 = 0.0f,
                    dx2 = -0.604f,
                    dy2 = -0.138f,
                    dx3 = -0.801f,
                    dy3 = -0.4f,
                )
                // c -2.64 -3.521 -6.061 -3.598 -6.206 -3.6
                curveToRelative(
                    dx1 = -2.64f,
                    dy1 = -3.521f,
                    dx2 = -6.061f,
                    dy2 = -3.598f,
                    dx3 = -6.206f,
                    dy3 = -3.6f,
                )
                // c -0.55 -0.006 -0.994 -0.456 -0.991 -1.005
                curveToRelative(
                    dx1 = -0.55f,
                    dy1 = -0.006f,
                    dx2 = -0.994f,
                    dy2 = -0.456f,
                    dx3 = -0.991f,
                    dy3 = -1.005f,
                )
                // C 22.006 5.444 22.45 5 23 5
                curveTo(
                    x1 = 22.006f,
                    y1 = 5.444f,
                    x2 = 22.45f,
                    y2 = 5.0f,
                    x3 = 23.0f,
                    y3 = 5.0f,
                )
                // c 0.184 0 4.537 0.05 7.8 4.4
                curveToRelative(
                    dx1 = 0.184f,
                    dy1 = 0.0f,
                    dx2 = 4.537f,
                    dy2 = 0.05f,
                    dx3 = 7.8f,
                    dy3 = 4.4f,
                )
                // c 0.332 0.442 0.242 1.069 -0.2 1.4
                curveToRelative(
                    dx1 = 0.332f,
                    dy1 = 0.442f,
                    dx2 = 0.242f,
                    dy2 = 1.069f,
                    dx3 = -0.2f,
                    dy3 = 1.4f,
                )
                // c -0.18 0.135 -0.39 0.2 -0.599 0.2z
                curveToRelative(
                    dx1 = -0.18f,
                    dy1 = 0.135f,
                    dx2 = -0.39f,
                    dy2 = 0.2f,
                    dx3 = -0.599f,
                    dy3 = 0.2f,
                )
                close()
                // M 13.914 15.5
                moveTo(x = 13.914f, y = 15.5f)
                // l 1.793 -1.793
                lineToRelative(dx = 1.793f, dy = -1.793f)
                // c 0.391 -0.391 0.391 -1.023 0 -1.414
                curveToRelative(
                    dx1 = 0.391f,
                    dy1 = -0.391f,
                    dx2 = 0.391f,
                    dy2 = -1.023f,
                    dx3 = 0.0f,
                    dy3 = -1.414f,
                )
                // s -1.023 -0.391 -1.414 0
                reflectiveCurveToRelative(
                    dx1 = -1.023f,
                    dy1 = -0.391f,
                    dx2 = -1.414f,
                    dy2 = 0.0f,
                )
                // L 12.5 14.086
                lineTo(x = 12.5f, y = 14.086f)
                // l -1.793 -1.793
                lineToRelative(dx = -1.793f, dy = -1.793f)
                // c -0.391 -0.391 -1.023 -0.391 -1.414 0
                curveToRelative(
                    dx1 = -0.391f,
                    dy1 = -0.391f,
                    dx2 = -1.023f,
                    dy2 = -0.391f,
                    dx3 = -1.414f,
                    dy3 = 0.0f,
                )
                // s -0.391 1.023 0 1.414
                reflectiveCurveToRelative(
                    dx1 = -0.391f,
                    dy1 = 1.023f,
                    dx2 = 0.0f,
                    dy2 = 1.414f,
                )
                // l 1.793 1.793
                lineToRelative(dx = 1.793f, dy = 1.793f)
                // l -1.793 1.793
                lineToRelative(dx = -1.793f, dy = 1.793f)
                // c -0.391 0.391 -0.391 1.023 0 1.414
                curveToRelative(
                    dx1 = -0.391f,
                    dy1 = 0.391f,
                    dx2 = -0.391f,
                    dy2 = 1.023f,
                    dx3 = 0.0f,
                    dy3 = 1.414f,
                )
                // c 0.195 0.195 0.451 0.293 0.707 0.293
                curveToRelative(
                    dx1 = 0.195f,
                    dy1 = 0.195f,
                    dx2 = 0.451f,
                    dy2 = 0.293f,
                    dx3 = 0.707f,
                    dy3 = 0.293f,
                )
                // s 0.512 -0.098 0.707 -0.293
                reflectiveCurveToRelative(
                    dx1 = 0.512f,
                    dy1 = -0.098f,
                    dx2 = 0.707f,
                    dy2 = -0.293f,
                )
                // l 1.793 -1.793
                lineToRelative(dx = 1.793f, dy = -1.793f)
                // l 1.793 1.793
                lineToRelative(dx = 1.793f, dy = 1.793f)
                // c 0.195 0.195 0.451 0.293 0.707 0.293
                curveToRelative(
                    dx1 = 0.195f,
                    dy1 = 0.195f,
                    dx2 = 0.451f,
                    dy2 = 0.293f,
                    dx3 = 0.707f,
                    dy3 = 0.293f,
                )
                // s 0.512 -0.098 0.707 -0.293
                reflectiveCurveToRelative(
                    dx1 = 0.512f,
                    dy1 = -0.098f,
                    dx2 = 0.707f,
                    dy2 = -0.293f,
                )
                // c 0.391 -0.391 0.391 -1.023 0 -1.414
                curveToRelative(
                    dx1 = 0.391f,
                    dy1 = -0.391f,
                    dx2 = 0.391f,
                    dy2 = -1.023f,
                    dx3 = 0.0f,
                    dy3 = -1.414f,
                )
                // L 13.914 15.5z
                lineTo(x = 13.914f, y = 15.5f)
                close()
                // M 24.914 15.5
                moveTo(x = 24.914f, y = 15.5f)
                // l 1.793 -1.793
                lineToRelative(dx = 1.793f, dy = -1.793f)
                // c 0.391 -0.391 0.391 -1.023 0 -1.414
                curveToRelative(
                    dx1 = 0.391f,
                    dy1 = -0.391f,
                    dx2 = 0.391f,
                    dy2 = -1.023f,
                    dx3 = 0.0f,
                    dy3 = -1.414f,
                )
                // s -1.023 -0.391 -1.414 0
                reflectiveCurveToRelative(
                    dx1 = -1.023f,
                    dy1 = -0.391f,
                    dx2 = -1.414f,
                    dy2 = 0.0f,
                )
                // L 23.5 14.086
                lineTo(x = 23.5f, y = 14.086f)
                // l -1.793 -1.793
                lineToRelative(dx = -1.793f, dy = -1.793f)
                // c -0.391 -0.391 -1.023 -0.391 -1.414 0
                curveToRelative(
                    dx1 = -0.391f,
                    dy1 = -0.391f,
                    dx2 = -1.023f,
                    dy2 = -0.391f,
                    dx3 = -1.414f,
                    dy3 = 0.0f,
                )
                // s -0.391 1.023 0 1.414
                reflectiveCurveToRelative(
                    dx1 = -0.391f,
                    dy1 = 1.023f,
                    dx2 = 0.0f,
                    dy2 = 1.414f,
                )
                // l 1.793 1.793
                lineToRelative(dx = 1.793f, dy = 1.793f)
                // l -1.793 1.793
                lineToRelative(dx = -1.793f, dy = 1.793f)
                // c -0.391 0.391 -0.391 1.023 0 1.414
                curveToRelative(
                    dx1 = -0.391f,
                    dy1 = 0.391f,
                    dx2 = -0.391f,
                    dy2 = 1.023f,
                    dx3 = 0.0f,
                    dy3 = 1.414f,
                )
                // c 0.195 0.195 0.451 0.293 0.707 0.293
                curveToRelative(
                    dx1 = 0.195f,
                    dy1 = 0.195f,
                    dx2 = 0.451f,
                    dy2 = 0.293f,
                    dx3 = 0.707f,
                    dy3 = 0.293f,
                )
                // s 0.512 -0.098 0.707 -0.293
                reflectiveCurveToRelative(
                    dx1 = 0.512f,
                    dy1 = -0.098f,
                    dx2 = 0.707f,
                    dy2 = -0.293f,
                )
                // l 1.793 -1.793
                lineToRelative(dx = 1.793f, dy = -1.793f)
                // l 1.793 1.793
                lineToRelative(dx = 1.793f, dy = 1.793f)
                // c 0.195 0.195 0.451 0.293 0.707 0.293
                curveToRelative(
                    dx1 = 0.195f,
                    dy1 = 0.195f,
                    dx2 = 0.451f,
                    dy2 = 0.293f,
                    dx3 = 0.707f,
                    dy3 = 0.293f,
                )
                // s 0.512 -0.098 0.707 -0.293
                reflectiveCurveToRelative(
                    dx1 = 0.512f,
                    dy1 = -0.098f,
                    dx2 = 0.707f,
                    dy2 = -0.293f,
                )
                // c 0.391 -0.391 0.391 -1.023 0 -1.414
                curveToRelative(
                    dx1 = 0.391f,
                    dy1 = -0.391f,
                    dx2 = 0.391f,
                    dy2 = -1.023f,
                    dx3 = 0.0f,
                    dy3 = -1.414f,
                )
                // L 24.914 15.5z
                lineTo(x = 24.914f, y = 15.5f)
                close()
            }
        }.build().also { _emoji1f635 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f635: ImageVector? = null
