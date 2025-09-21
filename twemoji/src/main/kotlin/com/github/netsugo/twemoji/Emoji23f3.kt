package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji23f3: ImageVector
    get() {
        val current = _emoji23f3
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji23f3",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M21 18 c0 -2.001 3.246 -3.369 5 -6 2 -3 2 -10 2 -10 H8 s0 7 2 10 c1.754 2.631 5 3.999 5 6 s-3.246 3.369 -5 6 c-2 3 -2 10 -2 10 h20 s0 -7 -2 -10 c-1.754 -2.631 -5 -3.999 -5 -6z
            path(
                fill = SolidColor(Color(0xFFFFE8B6)),
            ) {
                // M 21 18
                moveTo(x = 21.0f, y = 18.0f)
                // c 0 -2.001 3.246 -3.369 5 -6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.001f,
                    dx2 = 3.246f,
                    dy2 = -3.369f,
                    dx3 = 5.0f,
                    dy3 = -6.0f,
                )
                // c 2 -3 2 -10 2 -10
                curveToRelative(
                    dx1 = 2.0f,
                    dy1 = -3.0f,
                    dx2 = 2.0f,
                    dy2 = -10.0f,
                    dx3 = 2.0f,
                    dy3 = -10.0f,
                )
                // H 8
                horizontalLineTo(x = 8.0f)
                // s 0 7 2 10
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 7.0f,
                    dx2 = 2.0f,
                    dy2 = 10.0f,
                )
                // c 1.754 2.631 5 3.999 5 6
                curveToRelative(
                    dx1 = 1.754f,
                    dy1 = 2.631f,
                    dx2 = 5.0f,
                    dy2 = 3.999f,
                    dx3 = 5.0f,
                    dy3 = 6.0f,
                )
                // s -3.246 3.369 -5 6
                reflectiveCurveToRelative(
                    dx1 = -3.246f,
                    dy1 = 3.369f,
                    dx2 = -5.0f,
                    dy2 = 6.0f,
                )
                // c -2 3 -2 10 -2 10
                curveToRelative(
                    dx1 = -2.0f,
                    dy1 = 3.0f,
                    dx2 = -2.0f,
                    dy2 = 10.0f,
                    dx3 = -2.0f,
                    dy3 = 10.0f,
                )
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // s 0 -7 -2 -10
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -7.0f,
                    dx2 = -2.0f,
                    dy2 = -10.0f,
                )
                // c -1.754 -2.631 -5 -3.999 -5 -6z
                curveToRelative(
                    dx1 = -1.754f,
                    dy1 = -2.631f,
                    dx2 = -5.0f,
                    dy2 = -3.999f,
                    dx3 = -5.0f,
                    dy3 = -6.0f,
                )
                close()
            }
            // M18 2 h-8 s0 4 1 7 c1.304 3.912 6 4.999 6 9 s0 13 1 13 1 -9 1 -13 4.697 -5.088 6 -9 c1 -3 1 -7 1 -7 h-8z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 18 2
                moveTo(x = 18.0f, y = 2.0f)
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // s 0 4 1 7
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.0f,
                    dx2 = 1.0f,
                    dy2 = 7.0f,
                )
                // c 1.304 3.912 6 4.999 6 9
                curveToRelative(
                    dx1 = 1.304f,
                    dy1 = 3.912f,
                    dx2 = 6.0f,
                    dy2 = 4.999f,
                    dx3 = 6.0f,
                    dy3 = 9.0f,
                )
                // s 0 13 1 13
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 13.0f,
                    dx2 = 1.0f,
                    dy2 = 13.0f,
                )
                // s 1 -9 1 -13
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = -9.0f,
                    dx2 = 1.0f,
                    dy2 = -13.0f,
                )
                // s 4.697 -5.088 6 -9
                reflectiveCurveToRelative(
                    dx1 = 4.697f,
                    dy1 = -5.088f,
                    dx2 = 6.0f,
                    dy2 = -9.0f,
                )
                // c 1 -3 1 -7 1 -7
                curveToRelative(
                    dx1 = 1.0f,
                    dy1 = -3.0f,
                    dx2 = 1.0f,
                    dy2 = -7.0f,
                    dx3 = 1.0f,
                    dy3 = -7.0f,
                )
                // h -8z
                horizontalLineToRelative(dx = -8.0f)
                close()
            }
            // M30 34 c0 1.104 -0.896 2 -2 2 L8 36 c-1.104 0 -2 -0.896 -2 -2 s0.896 -2 2 -2 h20 c1.104 0 2 0.896 2 2z M30 2 c0 1.104 -0.896 2 -2 2 L8 4 c-1.104 0 -2 -0.896 -2 -2 s0.896 -2 2 -2 h20 c1.104 0 2 0.896 2 2z
            path(
                fill = SolidColor(Color(0xFF3B88C3)),
            ) {
                // M 30 34
                moveTo(x = 30.0f, y = 34.0f)
                // c 0 1.104 -0.896 2 -2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = -0.896f,
                    dy2 = 2.0f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // L 8 36
                lineTo(x = 8.0f, y = 36.0f)
                // c -1.104 0 -2 -0.896 -2 -2
                curveToRelative(
                    dx1 = -1.104f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -0.896f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // s 0.896 -2 2 -2
                reflectiveCurveToRelative(
                    dx1 = 0.896f,
                    dy1 = -2.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // c 1.104 0 2 0.896 2 2z
                curveToRelative(
                    dx1 = 1.104f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 0.896f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                close()
                // M 30 2
                moveTo(x = 30.0f, y = 2.0f)
                // c 0 1.104 -0.896 2 -2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = -0.896f,
                    dy2 = 2.0f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // L 8 4
                lineTo(x = 8.0f, y = 4.0f)
                // c -1.104 0 -2 -0.896 -2 -2
                curveToRelative(
                    dx1 = -1.104f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -0.896f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // s 0.896 -2 2 -2
                reflectiveCurveToRelative(
                    dx1 = 0.896f,
                    dy1 = -2.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // c 1.104 0 2 0.896 2 2z
                curveToRelative(
                    dx1 = 1.104f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 0.896f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                close()
            }
        }.build().also { _emoji23f3 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji23f3: ImageVector? = null
