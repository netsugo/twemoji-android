package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f17e: ImageVector
    get() {
        val current = _emoji1f17e
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f17e",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 32 c0 2.209 -1.791 4 -4 4 H4 c-2.209 0 -4 -1.791 -4 -4 V4 c0 -2.209 1.791 -4 4 -4 h28 c2.209 0 4 1.791 4 4 v28z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 36 32
                moveTo(x = 36.0f, y = 32.0f)
                // c 0 2.209 -1.791 4 -4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = -1.791f,
                    dy2 = 4.0f,
                    dx3 = -4.0f,
                    dy3 = 4.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // c -2.209 0 -4 -1.791 -4 -4
                curveToRelative(
                    dx1 = -2.209f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = -1.791f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
                // c 0 -2.209 1.791 -4 4 -4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.209f,
                    dx2 = 1.791f,
                    dy2 = -4.0f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // c 2.209 0 4 1.791 4 4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = 1.791f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // v 28z
                verticalLineToRelative(dy = 28.0f)
                close()
            }
            // M6.993 18.001 c0 -6.656 4.48 -11.776 11.007 -11.776 6.432 0 11.008 5.28 11.008 11.776 0 6.623 -4.449 11.774 -11.008 11.774 -6.496 0 -11.007 -5.151 -11.007 -11.774z M24.016 18.001 c0 -3.872 -2.016 -7.36 -6.016 -7.36 s-6.015 3.488 -6.015 7.36 c0 3.903 1.952 7.359 6.015 7.359 4.065 0 6.016 -3.456 6.016 -7.359z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 6.993 18.001
                moveTo(x = 6.993f, y = 18.001f)
                // c 0 -6.656 4.48 -11.776 11.007 -11.776
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -6.656f,
                    dx2 = 4.48f,
                    dy2 = -11.776f,
                    dx3 = 11.007f,
                    dy3 = -11.776f,
                )
                // c 6.432 0 11.008 5.28 11.008 11.776
                curveToRelative(
                    dx1 = 6.432f,
                    dy1 = 0.0f,
                    dx2 = 11.008f,
                    dy2 = 5.28f,
                    dx3 = 11.008f,
                    dy3 = 11.776f,
                )
                // c 0 6.623 -4.449 11.774 -11.008 11.774
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 6.623f,
                    dx2 = -4.449f,
                    dy2 = 11.774f,
                    dx3 = -11.008f,
                    dy3 = 11.774f,
                )
                // c -6.496 0 -11.007 -5.151 -11.007 -11.774z
                curveToRelative(
                    dx1 = -6.496f,
                    dy1 = 0.0f,
                    dx2 = -11.007f,
                    dy2 = -5.151f,
                    dx3 = -11.007f,
                    dy3 = -11.774f,
                )
                close()
                // M 24.016 18.001
                moveTo(x = 24.016f, y = 18.001f)
                // c 0 -3.872 -2.016 -7.36 -6.016 -7.36
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.872f,
                    dx2 = -2.016f,
                    dy2 = -7.36f,
                    dx3 = -6.016f,
                    dy3 = -7.36f,
                )
                // s -6.015 3.488 -6.015 7.36
                reflectiveCurveToRelative(
                    dx1 = -6.015f,
                    dy1 = 3.488f,
                    dx2 = -6.015f,
                    dy2 = 7.36f,
                )
                // c 0 3.903 1.952 7.359 6.015 7.359
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.903f,
                    dx2 = 1.952f,
                    dy2 = 7.359f,
                    dx3 = 6.015f,
                    dy3 = 7.359f,
                )
                // c 4.065 0 6.016 -3.456 6.016 -7.359z
                curveToRelative(
                    dx1 = 4.065f,
                    dy1 = 0.0f,
                    dx2 = 6.016f,
                    dy2 = -3.456f,
                    dx3 = 6.016f,
                    dy3 = -7.359f,
                )
                close()
            }
        }.build().also { _emoji1f17e = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f17e: ImageVector? = null
