package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f4be: ImageVector
    get() {
        val current = _emoji1f4be
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f4be",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M4 36 s-4 0 -4 -4 V4 s0 -4 4 -4 h26 c1 0 2 1 2 1 l3 3 s1 1 1 2 v26 s0 4 -4 4 H4z
            path(
                fill = SolidColor(Color(0xFF31373D)),
            ) {
                // M 4 36
                moveTo(x = 4.0f, y = 36.0f)
                // s -4 0 -4 -4
                reflectiveCurveToRelative(
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = -4.0f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
                // s 0 -4 4 -4
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.0f,
                    dx2 = 4.0f,
                    dy2 = -4.0f,
                )
                // h 26
                horizontalLineToRelative(dx = 26.0f)
                // c 1 0 2 1 2 1
                curveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 1.0f,
                    dx3 = 2.0f,
                    dy3 = 1.0f,
                )
                // l 3 3
                lineToRelative(dx = 3.0f, dy = 3.0f)
                // s 1 1 1 2
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                    dx2 = 1.0f,
                    dy2 = 2.0f,
                )
                // v 26
                verticalLineToRelative(dy = 26.0f)
                // s 0 4 -4 4
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.0f,
                    dx2 = -4.0f,
                    dy2 = 4.0f,
                )
                // H 4z
                horizontalLineTo(x = 4.0f)
                close()
            }
            // M5 19 v-1 s0 -2 2 -2 h21 c2 0 2 2 2 2 v1 H5z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 5 19
                moveTo(x = 5.0f, y = 19.0f)
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // s 0 -2 2 -2
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // h 21
                horizontalLineToRelative(dx = 21.0f)
                // c 2 0 2 2 2 2
                curveToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // H 5z
                horizontalLineTo(x = 5.0f)
                close()
            }
            // M5 32.021 L5 19 h25 v13 s0 2 -2 2 L7 34 c-2 0 -2 -1.979 -2 -1.979z M10 3 s0 -1 1 -1 h18 c1.048 0 1 1 1 1 v10 s0 1 -1 1 L11 14 s-1 0 -1 -1 L10 3z M22 13 h5 L27 3 h-5 v10z
            path(
                fill = SolidColor(Color(0xFFE1E8ED)),
            ) {
                // M 5 32.021
                moveTo(x = 5.0f, y = 32.021f)
                // L 5 19
                lineTo(x = 5.0f, y = 19.0f)
                // h 25
                horizontalLineToRelative(dx = 25.0f)
                // v 13
                verticalLineToRelative(dy = 13.0f)
                // s 0 2 -2 2
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                    dx2 = -2.0f,
                    dy2 = 2.0f,
                )
                // L 7 34
                lineTo(x = 7.0f, y = 34.0f)
                // c -2 0 -2 -1.979 -2 -1.979z
                curveToRelative(
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -1.979f,
                    dx3 = -2.0f,
                    dy3 = -1.979f,
                )
                close()
                // M 10 3
                moveTo(x = 10.0f, y = 3.0f)
                // s 0 -1 1 -1
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // c 1.048 0 1 1 1 1
                curveToRelative(
                    dx1 = 1.048f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // s 0 1 -1 1
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.0f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                // L 11 14
                lineTo(x = 11.0f, y = 14.0f)
                // s -1 0 -1 -1
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                )
                // L 10 3z
                lineTo(x = 10.0f, y = 3.0f)
                close()
                // M 22 13
                moveTo(x = 22.0f, y = 13.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // L 27 3
                lineTo(x = 27.0f, y = 3.0f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // v 10z
                verticalLineToRelative(dy = 10.0f)
                close()
            }
        }.build().also { _emoji1f4be = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f4be: ImageVector? = null
