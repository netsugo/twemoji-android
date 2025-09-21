package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f6ab: ImageVector
    get() {
        val current = _emoji1f6ab
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f6ab",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M18 0 C8.059 0 0 8.059 0 18 s8.059 18 18 18 18 -8.059 18 -18 S27.941 0 18 0z M31 18 c0 2.565 -0.753 4.95 -2.035 6.965 L11.036 7.036 C13.05 5.753 15.435 5 18 5 c7.18 0 13 5.821 13 13z M5 18 c0 -2.565 0.753 -4.95 2.036 -6.964 l17.929 17.929 C22.95 30.247 20.565 31 18 31 c-7.179 0 -13 -5.82 -13 -13z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 18 0
                moveTo(x = 18.0f, y = 0.0f)
                // C 8.059 0 0 8.059 0 18
                curveTo(
                    x1 = 8.059f,
                    y1 = 0.0f,
                    x2 = 0.0f,
                    y2 = 8.059f,
                    x3 = 0.0f,
                    y3 = 18.0f,
                )
                // s 8.059 18 18 18
                reflectiveCurveToRelative(
                    dx1 = 8.059f,
                    dy1 = 18.0f,
                    dx2 = 18.0f,
                    dy2 = 18.0f,
                )
                // s 18 -8.059 18 -18
                reflectiveCurveToRelative(
                    dx1 = 18.0f,
                    dy1 = -8.059f,
                    dx2 = 18.0f,
                    dy2 = -18.0f,
                )
                // S 27.941 0 18 0z
                reflectiveCurveTo(
                    x1 = 27.941f,
                    y1 = 0.0f,
                    x2 = 18.0f,
                    y2 = 0.0f,
                )
                close()
                // M 31 18
                moveTo(x = 31.0f, y = 18.0f)
                // c 0 2.565 -0.753 4.95 -2.035 6.965
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.565f,
                    dx2 = -0.753f,
                    dy2 = 4.95f,
                    dx3 = -2.035f,
                    dy3 = 6.965f,
                )
                // L 11.036 7.036
                lineTo(x = 11.036f, y = 7.036f)
                // C 13.05 5.753 15.435 5 18 5
                curveTo(
                    x1 = 13.05f,
                    y1 = 5.753f,
                    x2 = 15.435f,
                    y2 = 5.0f,
                    x3 = 18.0f,
                    y3 = 5.0f,
                )
                // c 7.18 0 13 5.821 13 13z
                curveToRelative(
                    dx1 = 7.18f,
                    dy1 = 0.0f,
                    dx2 = 13.0f,
                    dy2 = 5.821f,
                    dx3 = 13.0f,
                    dy3 = 13.0f,
                )
                close()
                // M 5 18
                moveTo(x = 5.0f, y = 18.0f)
                // c 0 -2.565 0.753 -4.95 2.036 -6.964
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.565f,
                    dx2 = 0.753f,
                    dy2 = -4.95f,
                    dx3 = 2.036f,
                    dy3 = -6.964f,
                )
                // l 17.929 17.929
                lineToRelative(dx = 17.929f, dy = 17.929f)
                // C 22.95 30.247 20.565 31 18 31
                curveTo(
                    x1 = 22.95f,
                    y1 = 30.247f,
                    x2 = 20.565f,
                    y2 = 31.0f,
                    x3 = 18.0f,
                    y3 = 31.0f,
                )
                // c -7.179 0 -13 -5.82 -13 -13z
                curveToRelative(
                    dx1 = -7.179f,
                    dy1 = 0.0f,
                    dx2 = -13.0f,
                    dy2 = -5.82f,
                    dx3 = -13.0f,
                    dy3 = -13.0f,
                )
                close()
            }
        }.build().also { _emoji1f6ab = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f6ab: ImageVector? = null
