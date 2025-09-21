package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1faaf: ImageVector
    get() {
        val current = _emoji1faaf
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1faaf",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 32 c0 2.2 -1.8 4 -4 4 H4 c-2.2 0 -4 -1.8 -4 -4 V4 c0 -2.2 1.8 -4 4 -4 h28 c2.2 0 4 1.8 4 4z
            path(
                fill = SolidColor(Color(0xFF9266CC)),
            ) {
                // M 36 32
                moveTo(x = 36.0f, y = 32.0f)
                // c 0 2.2 -1.8 4 -4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.2f,
                    dx2 = -1.8f,
                    dy2 = 4.0f,
                    dx3 = -4.0f,
                    dy3 = 4.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // c -2.2 0 -4 -1.8 -4 -4
                curveToRelative(
                    dx1 = -2.2f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = -1.8f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
                // c 0 -2.2 1.8 -4 4 -4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.2f,
                    dx2 = 1.8f,
                    dy2 = -4.0f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // c 2.2 0 4 1.8 4 4z
                curveToRelative(
                    dx1 = 2.2f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = 1.8f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                close()
            }
            // M23.5 6.9 s4 2.3 3.6 7.5 c-0.4 5.1 -8.3 10.1 -8.3 10.1 v-1.6 l2.1 -1.5 c-0.1 -0.5 -0.2 -0.9 -0.3 -1.4 2.8 -1.1 4.9 -3.8 4.9 -7 s-2 -5.9 -4.8 -7 c0.1 -0.7 0.2 -1 0.2 -1 L18 2 l-2.9 3 s0.1 0.3 0.2 0.9 c-2.8 1.1 -4.8 3.8 -4.8 7 s2 5.9 4.8 7 c-0.1 0.5 -0.2 0.9 -0.3 1.4 l2.1 1.5 v1.6 s-7.9 -4.9 -8.3 -10.1 c-0.4 -5.1 3.6 -7.5 3.6 -7.5 s-6.1 1 -6.5 7.5 c-0.4 6.3 5.8 11 5.8 11 s1.1 0.9 1.2 1.9 l2.7 -2 1 0.7 -3.4 2.6 c-0.3 0.2 -0.5 0.6 -0.5 1 0 0.8 0.6 1.4 1.4 1.4 s1.4 -0.6 1.4 -1.4 c0 -0.3 -0.1 -0.6 -0.3 -0.8 l1.9 -1.3 v3 c-0.6 0.3 -1 0.9 -1 1.6 0 1 0.8 1.9 1.9 1.9 s1.9 -0.8 1.9 -1.9 c0 -0.7 -0.4 -1.3 -1 -1.6 v-3 l1.9 1.3 c-0.2 0.2 -0.3 0.5 -0.3 0.8 0 0.8 0.6 1.4 1.4 1.4 s1.4 -0.6 1.4 -1.4 c0 -0.4 -0.2 -0.8 -0.5 -1 l-3.4 -2.6 1 -0.7 2.7 2 c0.1 -1 1.2 -1.9 1.2 -1.9 s6.2 -4.7 5.8 -11 c-0.5 -6.4 -6.6 -7.4 -6.6 -7.4 m0.5 6 c0 2.5 -1.5 4.6 -3.6 5.5 -0.7 -4.6 -0.3 -8.6 0.1 -11 2 1 3.5 3.1 3.5 5.5 m-12 0 c0 -2.4 1.5 -4.5 3.6 -5.5 0.4 2.4 0.7 6.4 0.1 11 -2.2 -0.9 -3.7 -3 -3.7 -5.5
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 23.5 6.9
                moveTo(x = 23.5f, y = 6.9f)
                // s 4 2.3 3.6 7.5
                reflectiveCurveToRelative(
                    dx1 = 4.0f,
                    dy1 = 2.3f,
                    dx2 = 3.6f,
                    dy2 = 7.5f,
                )
                // c -0.4 5.1 -8.3 10.1 -8.3 10.1
                curveToRelative(
                    dx1 = -0.4f,
                    dy1 = 5.1f,
                    dx2 = -8.3f,
                    dy2 = 10.1f,
                    dx3 = -8.3f,
                    dy3 = 10.1f,
                )
                // v -1.6
                verticalLineToRelative(dy = -1.6f)
                // l 2.1 -1.5
                lineToRelative(dx = 2.1f, dy = -1.5f)
                // c -0.1 -0.5 -0.2 -0.9 -0.3 -1.4
                curveToRelative(
                    dx1 = -0.1f,
                    dy1 = -0.5f,
                    dx2 = -0.2f,
                    dy2 = -0.9f,
                    dx3 = -0.3f,
                    dy3 = -1.4f,
                )
                // c 2.8 -1.1 4.9 -3.8 4.9 -7
                curveToRelative(
                    dx1 = 2.8f,
                    dy1 = -1.1f,
                    dx2 = 4.9f,
                    dy2 = -3.8f,
                    dx3 = 4.9f,
                    dy3 = -7.0f,
                )
                // s -2 -5.9 -4.8 -7
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = -5.9f,
                    dx2 = -4.8f,
                    dy2 = -7.0f,
                )
                // c 0.1 -0.7 0.2 -1 0.2 -1
                curveToRelative(
                    dx1 = 0.1f,
                    dy1 = -0.7f,
                    dx2 = 0.2f,
                    dy2 = -1.0f,
                    dx3 = 0.2f,
                    dy3 = -1.0f,
                )
                // L 18 2
                lineTo(x = 18.0f, y = 2.0f)
                // l -2.9 3
                lineToRelative(dx = -2.9f, dy = 3.0f)
                // s 0.1 0.3 0.2 0.9
                reflectiveCurveToRelative(
                    dx1 = 0.1f,
                    dy1 = 0.3f,
                    dx2 = 0.2f,
                    dy2 = 0.9f,
                )
                // c -2.8 1.1 -4.8 3.8 -4.8 7
                curveToRelative(
                    dx1 = -2.8f,
                    dy1 = 1.1f,
                    dx2 = -4.8f,
                    dy2 = 3.8f,
                    dx3 = -4.8f,
                    dy3 = 7.0f,
                )
                // s 2 5.9 4.8 7
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 5.9f,
                    dx2 = 4.8f,
                    dy2 = 7.0f,
                )
                // c -0.1 0.5 -0.2 0.9 -0.3 1.4
                curveToRelative(
                    dx1 = -0.1f,
                    dy1 = 0.5f,
                    dx2 = -0.2f,
                    dy2 = 0.9f,
                    dx3 = -0.3f,
                    dy3 = 1.4f,
                )
                // l 2.1 1.5
                lineToRelative(dx = 2.1f, dy = 1.5f)
                // v 1.6
                verticalLineToRelative(dy = 1.6f)
                // s -7.9 -4.9 -8.3 -10.1
                reflectiveCurveToRelative(
                    dx1 = -7.9f,
                    dy1 = -4.9f,
                    dx2 = -8.3f,
                    dy2 = -10.1f,
                )
                // c -0.4 -5.1 3.6 -7.5 3.6 -7.5
                curveToRelative(
                    dx1 = -0.4f,
                    dy1 = -5.1f,
                    dx2 = 3.6f,
                    dy2 = -7.5f,
                    dx3 = 3.6f,
                    dy3 = -7.5f,
                )
                // s -6.1 1 -6.5 7.5
                reflectiveCurveToRelative(
                    dx1 = -6.1f,
                    dy1 = 1.0f,
                    dx2 = -6.5f,
                    dy2 = 7.5f,
                )
                // c -0.4 6.3 5.8 11 5.8 11
                curveToRelative(
                    dx1 = -0.4f,
                    dy1 = 6.3f,
                    dx2 = 5.8f,
                    dy2 = 11.0f,
                    dx3 = 5.8f,
                    dy3 = 11.0f,
                )
                // s 1.1 0.9 1.2 1.9
                reflectiveCurveToRelative(
                    dx1 = 1.1f,
                    dy1 = 0.9f,
                    dx2 = 1.2f,
                    dy2 = 1.9f,
                )
                // l 2.7 -2
                lineToRelative(dx = 2.7f, dy = -2.0f)
                // l 1 0.7
                lineToRelative(dx = 1.0f, dy = 0.7f)
                // l -3.4 2.6
                lineToRelative(dx = -3.4f, dy = 2.6f)
                // c -0.3 0.2 -0.5 0.6 -0.5 1
                curveToRelative(
                    dx1 = -0.3f,
                    dy1 = 0.2f,
                    dx2 = -0.5f,
                    dy2 = 0.6f,
                    dx3 = -0.5f,
                    dy3 = 1.0f,
                )
                // c 0 0.8 0.6 1.4 1.4 1.4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.8f,
                    dx2 = 0.6f,
                    dy2 = 1.4f,
                    dx3 = 1.4f,
                    dy3 = 1.4f,
                )
                // s 1.4 -0.6 1.4 -1.4
                reflectiveCurveToRelative(
                    dx1 = 1.4f,
                    dy1 = -0.6f,
                    dx2 = 1.4f,
                    dy2 = -1.4f,
                )
                // c 0 -0.3 -0.1 -0.6 -0.3 -0.8
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.3f,
                    dx2 = -0.1f,
                    dy2 = -0.6f,
                    dx3 = -0.3f,
                    dy3 = -0.8f,
                )
                // l 1.9 -1.3
                lineToRelative(dx = 1.9f, dy = -1.3f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // c -0.6 0.3 -1 0.9 -1 1.6
                curveToRelative(
                    dx1 = -0.6f,
                    dy1 = 0.3f,
                    dx2 = -1.0f,
                    dy2 = 0.9f,
                    dx3 = -1.0f,
                    dy3 = 1.6f,
                )
                // c 0 1 0.8 1.9 1.9 1.9
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.0f,
                    dx2 = 0.8f,
                    dy2 = 1.9f,
                    dx3 = 1.9f,
                    dy3 = 1.9f,
                )
                // s 1.9 -0.8 1.9 -1.9
                reflectiveCurveToRelative(
                    dx1 = 1.9f,
                    dy1 = -0.8f,
                    dx2 = 1.9f,
                    dy2 = -1.9f,
                )
                // c 0 -0.7 -0.4 -1.3 -1 -1.6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.7f,
                    dx2 = -0.4f,
                    dy2 = -1.3f,
                    dx3 = -1.0f,
                    dy3 = -1.6f,
                )
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // l 1.9 1.3
                lineToRelative(dx = 1.9f, dy = 1.3f)
                // c -0.2 0.2 -0.3 0.5 -0.3 0.8
                curveToRelative(
                    dx1 = -0.2f,
                    dy1 = 0.2f,
                    dx2 = -0.3f,
                    dy2 = 0.5f,
                    dx3 = -0.3f,
                    dy3 = 0.8f,
                )
                // c 0 0.8 0.6 1.4 1.4 1.4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.8f,
                    dx2 = 0.6f,
                    dy2 = 1.4f,
                    dx3 = 1.4f,
                    dy3 = 1.4f,
                )
                // s 1.4 -0.6 1.4 -1.4
                reflectiveCurveToRelative(
                    dx1 = 1.4f,
                    dy1 = -0.6f,
                    dx2 = 1.4f,
                    dy2 = -1.4f,
                )
                // c 0 -0.4 -0.2 -0.8 -0.5 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.4f,
                    dx2 = -0.2f,
                    dy2 = -0.8f,
                    dx3 = -0.5f,
                    dy3 = -1.0f,
                )
                // l -3.4 -2.6
                lineToRelative(dx = -3.4f, dy = -2.6f)
                // l 1 -0.7
                lineToRelative(dx = 1.0f, dy = -0.7f)
                // l 2.7 2
                lineToRelative(dx = 2.7f, dy = 2.0f)
                // c 0.1 -1 1.2 -1.9 1.2 -1.9
                curveToRelative(
                    dx1 = 0.1f,
                    dy1 = -1.0f,
                    dx2 = 1.2f,
                    dy2 = -1.9f,
                    dx3 = 1.2f,
                    dy3 = -1.9f,
                )
                // s 6.2 -4.7 5.8 -11
                reflectiveCurveToRelative(
                    dx1 = 6.2f,
                    dy1 = -4.7f,
                    dx2 = 5.8f,
                    dy2 = -11.0f,
                )
                // c -0.5 -6.4 -6.6 -7.4 -6.6 -7.4
                curveToRelative(
                    dx1 = -0.5f,
                    dy1 = -6.4f,
                    dx2 = -6.6f,
                    dy2 = -7.4f,
                    dx3 = -6.6f,
                    dy3 = -7.4f,
                )
                // m 0.5 6
                moveToRelative(dx = 0.5f, dy = 6.0f)
                // c 0 2.5 -1.5 4.6 -3.6 5.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.5f,
                    dx2 = -1.5f,
                    dy2 = 4.6f,
                    dx3 = -3.6f,
                    dy3 = 5.5f,
                )
                // c -0.7 -4.6 -0.3 -8.6 0.1 -11
                curveToRelative(
                    dx1 = -0.7f,
                    dy1 = -4.6f,
                    dx2 = -0.3f,
                    dy2 = -8.6f,
                    dx3 = 0.1f,
                    dy3 = -11.0f,
                )
                // c 2 1 3.5 3.1 3.5 5.5
                curveToRelative(
                    dx1 = 2.0f,
                    dy1 = 1.0f,
                    dx2 = 3.5f,
                    dy2 = 3.1f,
                    dx3 = 3.5f,
                    dy3 = 5.5f,
                )
                // m -12 0
                moveToRelative(dx = -12.0f, dy = 0.0f)
                // c 0 -2.4 1.5 -4.5 3.6 -5.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.4f,
                    dx2 = 1.5f,
                    dy2 = -4.5f,
                    dx3 = 3.6f,
                    dy3 = -5.5f,
                )
                // c 0.4 2.4 0.7 6.4 0.1 11
                curveToRelative(
                    dx1 = 0.4f,
                    dy1 = 2.4f,
                    dx2 = 0.7f,
                    dy2 = 6.4f,
                    dx3 = 0.1f,
                    dy3 = 11.0f,
                )
                // c -2.2 -0.9 -3.7 -3 -3.7 -5.5
                curveToRelative(
                    dx1 = -2.2f,
                    dy1 = -0.9f,
                    dx2 = -3.7f,
                    dy2 = -3.0f,
                    dx3 = -3.7f,
                    dy3 = -5.5f,
                )
            }
        }.build().also { _emoji1faaf = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1faaf: ImageVector? = null
