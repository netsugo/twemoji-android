package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji2b55: ImageVector
    get() {
        val current = _emoji2b55
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji2b55",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M18 0 C8.059 0 0 8.059 0 18 s8.059 18 18 18 18 -8.059 18 -18 S27.941 0 18 0z M18 30 c-6.627 0 -12 -5.373 -12 -12 S11.373 6 18 6 s12 5.373 12 12 -5.373 12 -12 12z
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
                // M 18 30
                moveTo(x = 18.0f, y = 30.0f)
                // c -6.627 0 -12 -5.373 -12 -12
                curveToRelative(
                    dx1 = -6.627f,
                    dy1 = 0.0f,
                    dx2 = -12.0f,
                    dy2 = -5.373f,
                    dx3 = -12.0f,
                    dy3 = -12.0f,
                )
                // S 11.373 6 18 6
                reflectiveCurveTo(
                    x1 = 11.373f,
                    y1 = 6.0f,
                    x2 = 18.0f,
                    y2 = 6.0f,
                )
                // s 12 5.373 12 12
                reflectiveCurveToRelative(
                    dx1 = 12.0f,
                    dy1 = 5.373f,
                    dx2 = 12.0f,
                    dy2 = 12.0f,
                )
                // s -5.373 12 -12 12z
                reflectiveCurveToRelative(
                    dx1 = -5.373f,
                    dy1 = 12.0f,
                    dx2 = -12.0f,
                    dy2 = 12.0f,
                )
                close()
            }
        }.build().also { _emoji2b55 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji2b55: ImageVector? = null
