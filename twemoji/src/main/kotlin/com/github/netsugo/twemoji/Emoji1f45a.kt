package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f45a: ImageVector
    get() {
        val current = _emoji1f45a
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f45a",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M12 3 h12 s-1 3 -6 3 -6 -3 -6 -3z
            path(
                fill = SolidColor(Color(0xFF553788)),
            ) {
                // M 12 3
                moveTo(x = 12.0f, y = 3.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // s -1 3 -6 3
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 3.0f,
                    dx2 = -6.0f,
                    dy2 = 3.0f,
                )
                // s -6 -3 -6 -3z
                reflectiveCurveToRelative(
                    dx1 = -6.0f,
                    dy1 = -3.0f,
                    dx2 = -6.0f,
                    dy2 = -3.0f,
                )
                close()
            }
            // M30.559 16.823 L35 11 c-4 -2 -11 -8 -11 -8 s-2 4 -6 4 -6 -4 -6 -4 -7 6 -11 8 l4.439 5.824 L10 15 s0.25 16 -3 19 c0 0 5 1 11 1 s11 -1 11 -1 c-3.25 -3 -3 -19 -3 -19 l4.559 1.823z
            path(
                fill = SolidColor(Color(0xFFAA8DD8)),
            ) {
                // M 30.559 16.823
                moveTo(x = 30.559f, y = 16.823f)
                // L 35 11
                lineTo(x = 35.0f, y = 11.0f)
                // c -4 -2 -11 -8 -11 -8
                curveToRelative(
                    dx1 = -4.0f,
                    dy1 = -2.0f,
                    dx2 = -11.0f,
                    dy2 = -8.0f,
                    dx3 = -11.0f,
                    dy3 = -8.0f,
                )
                // s -2 4 -6 4
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 4.0f,
                    dx2 = -6.0f,
                    dy2 = 4.0f,
                )
                // s -6 -4 -6 -4
                reflectiveCurveToRelative(
                    dx1 = -6.0f,
                    dy1 = -4.0f,
                    dx2 = -6.0f,
                    dy2 = -4.0f,
                )
                // s -7 6 -11 8
                reflectiveCurveToRelative(
                    dx1 = -7.0f,
                    dy1 = 6.0f,
                    dx2 = -11.0f,
                    dy2 = 8.0f,
                )
                // l 4.439 5.824
                lineToRelative(dx = 4.439f, dy = 5.824f)
                // L 10 15
                lineTo(x = 10.0f, y = 15.0f)
                // s 0.25 16 -3 19
                reflectiveCurveToRelative(
                    dx1 = 0.25f,
                    dy1 = 16.0f,
                    dx2 = -3.0f,
                    dy2 = 19.0f,
                )
                // c 0 0 5 1 11 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 5.0f,
                    dy2 = 1.0f,
                    dx3 = 11.0f,
                    dy3 = 1.0f,
                )
                // s 11 -1 11 -1
                reflectiveCurveToRelative(
                    dx1 = 11.0f,
                    dy1 = -1.0f,
                    dx2 = 11.0f,
                    dy2 = -1.0f,
                )
                // c -3.25 -3 -3 -19 -3 -19
                curveToRelative(
                    dx1 = -3.25f,
                    dy1 = -3.0f,
                    dx2 = -3.0f,
                    dy2 = -19.0f,
                    dx3 = -3.0f,
                    dy3 = -19.0f,
                )
                // l 4.559 1.823z
                lineToRelative(dx = 4.559f, dy = 1.823f)
                close()
            }
            // M6 17 c-0.293 0 -0.584 -0.128 -0.781 -0.375 l-4 -5 c-0.345 -0.431 -0.275 -1.061 0.156 -1.405 0.43 -0.345 1.061 -0.275 1.405 0.156 l4 5 c0.345 0.431 0.275 1.061 -0.156 1.405 C6.44 16.928 6.22 17 6 17z M29.999 17 c-0.219 0 -0.439 -0.072 -0.624 -0.219 -0.431 -0.345 -0.501 -0.974 -0.156 -1.405 l4 -5 c0.347 -0.431 0.974 -0.501 1.406 -0.156 0.431 0.345 0.501 0.974 0.156 1.405 l-4 5 c-0.198 0.247 -0.488 0.375 -0.782 0.375z M24 3 s-3 3 -6 3 -6 -3 -6 -3 l2 7 3 -2.25 L17 34 c0 0.553 0.448 1 1 1 s1 -0.447 1 -1 L19 7.75 L22 10 l2 -7z
            path(
                fill = SolidColor(Color(0xFF9266CC)),
            ) {
                // M 6 17
                moveTo(x = 6.0f, y = 17.0f)
                // c -0.293 0 -0.584 -0.128 -0.781 -0.375
                curveToRelative(
                    dx1 = -0.293f,
                    dy1 = 0.0f,
                    dx2 = -0.584f,
                    dy2 = -0.128f,
                    dx3 = -0.781f,
                    dy3 = -0.375f,
                )
                // l -4 -5
                lineToRelative(dx = -4.0f, dy = -5.0f)
                // c -0.345 -0.431 -0.275 -1.061 0.156 -1.405
                curveToRelative(
                    dx1 = -0.345f,
                    dy1 = -0.431f,
                    dx2 = -0.275f,
                    dy2 = -1.061f,
                    dx3 = 0.156f,
                    dy3 = -1.405f,
                )
                // c 0.43 -0.345 1.061 -0.275 1.405 0.156
                curveToRelative(
                    dx1 = 0.43f,
                    dy1 = -0.345f,
                    dx2 = 1.061f,
                    dy2 = -0.275f,
                    dx3 = 1.405f,
                    dy3 = 0.156f,
                )
                // l 4 5
                lineToRelative(dx = 4.0f, dy = 5.0f)
                // c 0.345 0.431 0.275 1.061 -0.156 1.405
                curveToRelative(
                    dx1 = 0.345f,
                    dy1 = 0.431f,
                    dx2 = 0.275f,
                    dy2 = 1.061f,
                    dx3 = -0.156f,
                    dy3 = 1.405f,
                )
                // C 6.44 16.928 6.22 17 6 17z
                curveTo(
                    x1 = 6.44f,
                    y1 = 16.928f,
                    x2 = 6.22f,
                    y2 = 17.0f,
                    x3 = 6.0f,
                    y3 = 17.0f,
                )
                close()
                // M 29.999 17
                moveTo(x = 29.999f, y = 17.0f)
                // c -0.219 0 -0.439 -0.072 -0.624 -0.219
                curveToRelative(
                    dx1 = -0.219f,
                    dy1 = 0.0f,
                    dx2 = -0.439f,
                    dy2 = -0.072f,
                    dx3 = -0.624f,
                    dy3 = -0.219f,
                )
                // c -0.431 -0.345 -0.501 -0.974 -0.156 -1.405
                curveToRelative(
                    dx1 = -0.431f,
                    dy1 = -0.345f,
                    dx2 = -0.501f,
                    dy2 = -0.974f,
                    dx3 = -0.156f,
                    dy3 = -1.405f,
                )
                // l 4 -5
                lineToRelative(dx = 4.0f, dy = -5.0f)
                // c 0.347 -0.431 0.974 -0.501 1.406 -0.156
                curveToRelative(
                    dx1 = 0.347f,
                    dy1 = -0.431f,
                    dx2 = 0.974f,
                    dy2 = -0.501f,
                    dx3 = 1.406f,
                    dy3 = -0.156f,
                )
                // c 0.431 0.345 0.501 0.974 0.156 1.405
                curveToRelative(
                    dx1 = 0.431f,
                    dy1 = 0.345f,
                    dx2 = 0.501f,
                    dy2 = 0.974f,
                    dx3 = 0.156f,
                    dy3 = 1.405f,
                )
                // l -4 5
                lineToRelative(dx = -4.0f, dy = 5.0f)
                // c -0.198 0.247 -0.488 0.375 -0.782 0.375z
                curveToRelative(
                    dx1 = -0.198f,
                    dy1 = 0.247f,
                    dx2 = -0.488f,
                    dy2 = 0.375f,
                    dx3 = -0.782f,
                    dy3 = 0.375f,
                )
                close()
                // M 24 3
                moveTo(x = 24.0f, y = 3.0f)
                // s -3 3 -6 3
                reflectiveCurveToRelative(
                    dx1 = -3.0f,
                    dy1 = 3.0f,
                    dx2 = -6.0f,
                    dy2 = 3.0f,
                )
                // s -6 -3 -6 -3
                reflectiveCurveToRelative(
                    dx1 = -6.0f,
                    dy1 = -3.0f,
                    dx2 = -6.0f,
                    dy2 = -3.0f,
                )
                // l 2 7
                lineToRelative(dx = 2.0f, dy = 7.0f)
                // l 3 -2.25
                lineToRelative(dx = 3.0f, dy = -2.25f)
                // L 17 34
                lineTo(x = 17.0f, y = 34.0f)
                // c 0 0.553 0.448 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = 0.448f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // s 1 -0.447 1 -1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = -0.447f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // L 19 7.75
                lineTo(x = 19.0f, y = 7.75f)
                // L 22 10
                lineTo(x = 22.0f, y = 10.0f)
                // l 2 -7z
                lineToRelative(dx = 2.0f, dy = -7.0f)
                close()
            }
        }.build().also { _emoji1f45a = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f45a: ImageVector? = null
