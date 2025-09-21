package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f62f: ImageVector
    get() {
        val current = _emoji1f62f
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f62f",
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
            // M15 25.5 a3 3.5 0 1 0 6 0 a3 3.5 0 1 0 -6 0z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 15 25.5
                moveTo(x = 15.0f, y = 25.5f)
                // a 3 3.5 0 1 0 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // a 3 3.5 0 1 0 -6 0z
                arcToRelative(
                    a = 3.0f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M31.001 11 c-0.305 0 -0.604 -0.138 -0.801 -0.4 -2.64 -3.521 -6.061 -3.598 -6.206 -3.6 -0.55 -0.006 -0.994 -0.456 -0.991 -1.005 C23.006 5.444 23.45 5 24 5 c0.184 0 4.537 0.05 7.8 4.4 0.332 0.442 0.242 1.069 -0.2 1.4 -0.18 0.135 -0.39 0.2 -0.599 0.2z M4.999 11 c-0.208 0 -0.419 -0.065 -0.599 -0.2 -0.442 -0.331 -0.531 -0.958 -0.2 -1.4 C7.462 5.05 11.816 5 12 5 c0.552 0 1 0.448 1 1 0 0.551 -0.445 0.998 -0.996 1 -0.155 0.002 -3.568 0.086 -6.204 3.6 -0.196 0.262 -0.497 0.4 -0.801 0.4z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 31.001 11
                moveTo(x = 31.001f, y = 11.0f)
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
                // C 23.006 5.444 23.45 5 24 5
                curveTo(
                    x1 = 23.006f,
                    y1 = 5.444f,
                    x2 = 23.45f,
                    y2 = 5.0f,
                    x3 = 24.0f,
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
                // M 4.999 11
                moveTo(x = 4.999f, y = 11.0f)
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
                // C 7.462 5.05 11.816 5 12 5
                curveTo(
                    x1 = 7.462f,
                    y1 = 5.05f,
                    x2 = 11.816f,
                    y2 = 5.0f,
                    x3 = 12.0f,
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
            }
            // M9.5 14.5 a2.5 3.5 0 1 0 5 0 a2.5 3.5 0 1 0 -5 0z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 9.5 14.5
                moveTo(x = 9.5f, y = 14.5f)
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
            // M21.5 14.5 a2.5 3.5 0 1 0 5 0 a2.5 3.5 0 1 0 -5 0z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 21.5 14.5
                moveTo(x = 21.5f, y = 14.5f)
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
        }.build().also { _emoji1f62f = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f62f: ImageVector? = null
