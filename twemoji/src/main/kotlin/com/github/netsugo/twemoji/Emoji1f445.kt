package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f445: ImageVector
    get() {
        val current = _emoji1f445
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f445",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 7.5 C36 12 27.941 19 18 19 S0 12 0 7.5 C0 6 3 9 18 9 s18 -3 18 -1.5z
            path(
                fill = SolidColor(Color(0xFF662113)),
            ) {
                // M 36 7.5
                moveTo(x = 36.0f, y = 7.5f)
                // C 36 12 27.941 19 18 19
                curveTo(
                    x1 = 36.0f,
                    y1 = 12.0f,
                    x2 = 27.941f,
                    y2 = 19.0f,
                    x3 = 18.0f,
                    y3 = 19.0f,
                )
                // S 0 12 0 7.5
                reflectiveCurveTo(
                    x1 = 0.0f,
                    y1 = 12.0f,
                    x2 = 0.0f,
                    y2 = 7.5f,
                )
                // C 0 6 3 9 18 9
                curveTo(
                    x1 = 0.0f,
                    y1 = 6.0f,
                    x2 = 3.0f,
                    y2 = 9.0f,
                    x3 = 18.0f,
                    y3 = 9.0f,
                )
                // s 18 -3 18 -1.5z
                reflectiveCurveToRelative(
                    dx1 = 18.0f,
                    dy1 = -3.0f,
                    dx2 = 18.0f,
                    dy2 = -1.5f,
                )
                close()
            }
            // M18 11 c-6 0 -11 -1 -11 -1 v12 c0 6.075 4.925 11 11 11 s11 -4.925 11 -11 V10 s-5 1 -11 1z
            path(
                fill = SolidColor(Color(0xFFEA596E)),
            ) {
                // M 18 11
                moveTo(x = 18.0f, y = 11.0f)
                // c -6 0 -11 -1 -11 -1
                curveToRelative(
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                    dx2 = -11.0f,
                    dy2 = -1.0f,
                    dx3 = -11.0f,
                    dy3 = -1.0f,
                )
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // c 0 6.075 4.925 11 11 11
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 6.075f,
                    dx2 = 4.925f,
                    dy2 = 11.0f,
                    dx3 = 11.0f,
                    dy3 = 11.0f,
                )
                // s 11 -4.925 11 -11
                reflectiveCurveToRelative(
                    dx1 = 11.0f,
                    dy1 = -4.925f,
                    dx2 = 11.0f,
                    dy2 = -11.0f,
                )
                // V 10
                verticalLineTo(y = 10.0f)
                // s -5 1 -11 1z
                reflectiveCurveToRelative(
                    dx1 = -5.0f,
                    dy1 = 1.0f,
                    dx2 = -11.0f,
                    dy2 = 1.0f,
                )
                close()
            }
            // M19 29 c0 0.553 -0.448 1 -1 1 s-1 -0.447 -1 -1 V13 c0 -0.552 0.448 -1 1 -1 s1 0.448 1 1 v16z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 19 29
                moveTo(x = 19.0f, y = 29.0f)
                // c 0 0.553 -0.448 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.448f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // s -1 -0.447 -1 -1
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = -0.447f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                )
                // V 13
                verticalLineTo(y = 13.0f)
                // c 0 -0.552 0.448 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = 0.448f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // s 1 0.448 1 1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.448f,
                    dx2 = 1.0f,
                    dy2 = 1.0f,
                )
                // v 16z
                verticalLineToRelative(dy = 16.0f)
                close()
            }
        }.build().also { _emoji1f445 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f445: ImageVector? = null
