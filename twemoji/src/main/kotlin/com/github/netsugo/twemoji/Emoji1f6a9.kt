package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f6a9: ImageVector
    get() {
        val current = _emoji1f6a9
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f6a9",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M13 34 s0 2 -2 2 -2 -2 -2 -2 V2 s0 -2 2 -2 2 2 2 2 v32z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 13 34
                moveTo(x = 13.0f, y = 34.0f)
                // s 0 2 -2 2
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                    dx2 = -2.0f,
                    dy2 = 2.0f,
                )
                // s -2 -2 -2 -2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                    dx2 = -2.0f,
                    dy2 = -2.0f,
                )
                // V 2
                verticalLineTo(y = 2.0f)
                // s 0 -2 2 -2
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // s 2 2 2 2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                )
                // v 32z
                verticalLineToRelative(dy = 32.0f)
                close()
            }
            // M11 4 c0 -2.2 1.636 -3.25 3.636 -2.333 l16.727 7.667 c2 0.917 2 2.417 0 3.333 l-16.727 7.667 C12.636 21.25 11 20.2 11 18 V4z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 11 4
                moveTo(x = 11.0f, y = 4.0f)
                // c 0 -2.2 1.636 -3.25 3.636 -2.333
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.2f,
                    dx2 = 1.636f,
                    dy2 = -3.25f,
                    dx3 = 3.636f,
                    dy3 = -2.333f,
                )
                // l 16.727 7.667
                lineToRelative(dx = 16.727f, dy = 7.667f)
                // c 2 0.917 2 2.417 0 3.333
                curveToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.917f,
                    dx2 = 2.0f,
                    dy2 = 2.417f,
                    dx3 = 0.0f,
                    dy3 = 3.333f,
                )
                // l -16.727 7.667
                lineToRelative(dx = -16.727f, dy = 7.667f)
                // C 12.636 21.25 11 20.2 11 18
                curveTo(
                    x1 = 12.636f,
                    y1 = 21.25f,
                    x2 = 11.0f,
                    y2 = 20.2f,
                    x3 = 11.0f,
                    y3 = 18.0f,
                )
                // V 4z
                verticalLineTo(y = 4.0f)
                close()
            }
        }.build().also { _emoji1f6a9 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f6a9: ImageVector? = null
