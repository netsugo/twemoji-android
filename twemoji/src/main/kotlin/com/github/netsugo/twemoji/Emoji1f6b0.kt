package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f6b0: ImageVector
    get() {
        val current = _emoji1f6b0
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f6b0",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M0 4 c0 -4 4 -4 4 -4 h28 s4 0 4 4 v28 s0 4 -4 4 H4 s-4 0 -4 -4 V4z
            path(
                fill = SolidColor(Color(0xFF226699)),
            ) {
                // M 0 4
                moveTo(x = 0.0f, y = 4.0f)
                // c 0 -4 4 -4 4 -4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.0f,
                    dx2 = 4.0f,
                    dy2 = -4.0f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // h 28
                horizontalLineToRelative(dx = 28.0f)
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
                // H 4
                horizontalLineTo(x = 4.0f)
                // s -4 0 -4 -4
                reflectiveCurveToRelative(
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = -4.0f,
                )
                // V 4z
                verticalLineTo(y = 4.0f)
                close()
            }
            // M33 9 H22 V3 s0 -1 -1 -1 -1 1 -1 1 v6 c-8 0 -8 7 -8 7 v2 c0 1 1 1 1 1 h3 s1 0 1 -1 v-2 c0 -2 2 -2 2 -2 h14 c1 0 1 -1 1 -1 v-3 s0 -1 -1 -1z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 33 9
                moveTo(x = 33.0f, y = 9.0f)
                // H 22
                horizontalLineTo(x = 22.0f)
                // V 3
                verticalLineTo(y = 3.0f)
                // s 0 -1 -1 -1
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.0f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                )
                // s -1 1 -1 1
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // c -8 0 -8 7 -8 7
                curveToRelative(
                    dx1 = -8.0f,
                    dy1 = 0.0f,
                    dx2 = -8.0f,
                    dy2 = 7.0f,
                    dx3 = -8.0f,
                    dy3 = 7.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // c 0 1 1 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.0f,
                    dx2 = 1.0f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // s 1 0 1 -1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
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
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // c 1 0 1 -1 1 -1
                curveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // s 0 -1 -1 -1z
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.0f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                )
                close()
            }
            // M18.5 3 h-3 c-0.829 0 -1.5 0.671 -1.5 1.5 S14.671 6 15.5 6 h3 c0.828 0 1.5 -0.671 1.5 -1.5 S19.328 3 18.5 3z M23.5 6 h3 c0.828 0 1.5 -0.671 1.5 -1.5 S27.328 3 26.5 3 h-3 c-0.828 0 -1.5 0.671 -1.5 1.5 S22.672 6 23.5 6z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 18.5 3
                moveTo(x = 18.5f, y = 3.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // c -0.829 0 -1.5 0.671 -1.5 1.5
                curveToRelative(
                    dx1 = -0.829f,
                    dy1 = 0.0f,
                    dx2 = -1.5f,
                    dy2 = 0.671f,
                    dx3 = -1.5f,
                    dy3 = 1.5f,
                )
                // S 14.671 6 15.5 6
                reflectiveCurveTo(
                    x1 = 14.671f,
                    y1 = 6.0f,
                    x2 = 15.5f,
                    y2 = 6.0f,
                )
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // c 0.828 0 1.5 -0.671 1.5 -1.5
                curveToRelative(
                    dx1 = 0.828f,
                    dy1 = 0.0f,
                    dx2 = 1.5f,
                    dy2 = -0.671f,
                    dx3 = 1.5f,
                    dy3 = -1.5f,
                )
                // S 19.328 3 18.5 3z
                reflectiveCurveTo(
                    x1 = 19.328f,
                    y1 = 3.0f,
                    x2 = 18.5f,
                    y2 = 3.0f,
                )
                close()
                // M 23.5 6
                moveTo(x = 23.5f, y = 6.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // c 0.828 0 1.5 -0.671 1.5 -1.5
                curveToRelative(
                    dx1 = 0.828f,
                    dy1 = 0.0f,
                    dx2 = 1.5f,
                    dy2 = -0.671f,
                    dx3 = 1.5f,
                    dy3 = -1.5f,
                )
                // S 27.328 3 26.5 3
                reflectiveCurveTo(
                    x1 = 27.328f,
                    y1 = 3.0f,
                    x2 = 26.5f,
                    y2 = 3.0f,
                )
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // c -0.828 0 -1.5 0.671 -1.5 1.5
                curveToRelative(
                    dx1 = -0.828f,
                    dy1 = 0.0f,
                    dx2 = -1.5f,
                    dy2 = 0.671f,
                    dx3 = -1.5f,
                    dy3 = 1.5f,
                )
                // S 22.672 6 23.5 6z
                reflectiveCurveTo(
                    x1 = 22.672f,
                    y1 = 6.0f,
                    x2 = 23.5f,
                    y2 = 6.0f,
                )
                close()
            }
            // M20 20 c-1 0 -1 1 -1 1 v5 h-9 v-5 s0 -1 -1 -1 -1 1 -1 1 v11 s0 2 2 2 h9 c2 0 2 -2 2 -2 V21 s0 -1 -1 -1z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 20 20
                moveTo(x = 20.0f, y = 20.0f)
                // c -1 0 -1 1 -1 1
                curveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h -9
                horizontalLineToRelative(dx = -9.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // s 0 -1 -1 -1
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.0f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                )
                // s -1 1 -1 1
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                // v 11
                verticalLineToRelative(dy = 11.0f)
                // s 0 2 2 2
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                )
                // h 9
                horizontalLineToRelative(dx = 9.0f)
                // c 2 0 2 -2 2 -2
                curveToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // V 21
                verticalLineTo(y = 21.0f)
                // s 0 -1 -1 -1z
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.0f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                )
                close()
            }
        }.build().also { _emoji1f6b0 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f6b0: ImageVector? = null
