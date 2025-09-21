package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f4f2: ImageVector
    get() {
        val current = _emoji1f4f2
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f4f2",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M18 36 s-4 0 -4 -4 V4 s0 -4 4 -4 h14 s4 0 4 4 v28 s0 4 -4 4 H18z
            path(
                fill = SolidColor(Color(0xFF31373D)),
            ) {
                // M 18 36
                moveTo(x = 18.0f, y = 36.0f)
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
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // s 4 0 4 4
                reflectiveCurveToRelative(
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = 4.0f,
                )
                // v 28
                verticalLineToRelative(dy = 28.0f)
                // s 0 4 -4 4
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.0f,
                    dx2 = -4.0f,
                    dy2 = 4.0f,
                )
                // H 18z
                horizontalLineTo(x = 18.0f)
                close()
            }
            // M16 5 h18 v26 L16 31z M13 16 s1 1 1 2 -1 2 -1 2 l-5 5 c-1 1 -3 1 -3 -1 v-3 L2 21 s-2 0 -2 -2 v-2 c0 -2 2 -2 2 -2 h3 v-3 c0 -2 2 -2 3 -1 l5 5z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 16 5
                moveTo(x = 16.0f, y = 5.0f)
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // v 26
                verticalLineToRelative(dy = 26.0f)
                // L 16 31z
                lineTo(x = 16.0f, y = 31.0f)
                close()
                // M 13 16
                moveTo(x = 13.0f, y = 16.0f)
                // s 1 1 1 2
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                    dx2 = 1.0f,
                    dy2 = 2.0f,
                )
                // s -1 2 -1 2
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 2.0f,
                    dx2 = -1.0f,
                    dy2 = 2.0f,
                )
                // l -5 5
                lineToRelative(dx = -5.0f, dy = 5.0f)
                // c -1 1 -3 1 -3 -1
                curveToRelative(
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                    dx2 = -3.0f,
                    dy2 = 1.0f,
                    dx3 = -3.0f,
                    dy3 = -1.0f,
                )
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // L 2 21
                lineTo(x = 2.0f, y = 21.0f)
                // s -2 0 -2 -2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -2.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // c 0 -2 2 -2 2 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // c 0 -2 2 -2 3 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                    dx3 = 3.0f,
                    dy3 = -1.0f,
                )
                // l 5 5z
                lineToRelative(dx = 5.0f, dy = 5.0f)
                close()
            }
        }.build().also { _emoji1f4f2 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f4f2: ImageVector? = null
