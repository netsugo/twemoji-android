package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f4f8: ImageVector
    get() {
        val current = _emoji1f4f8
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f4f8",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M0 10 s0 -4 4 -4 h28 s4 0 4 4 v18 s0 4 -4 4 H4 s-4 0 -4 -4 V10z
            path(
                fill = SolidColor(Color(0xFF31373D)),
            ) {
                // M 0 10
                moveTo(x = 0.0f, y = 10.0f)
                // s 0 -4 4 -4
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.0f,
                    dx2 = 4.0f,
                    dy2 = -4.0f,
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
                // v 18
                verticalLineToRelative(dy = 18.0f)
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
                // V 10z
                verticalLineTo(y = 10.0f)
                close()
            }
            // M21 19 m-10 0 a10 10 0 1 1 20 0 a10 10 0 1 1 -20 0
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 21 19
                moveTo(x = 21.0f, y = 19.0f)
                // m -10 0
                moveToRelative(dx = -10.0f, dy = 0.0f)
                // a 10 10 0 1 1 20 0
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 20.0f,
                    dy1 = 0.0f,
                )
                // a 10 10 0 1 1 -20 0
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -20.0f,
                    dy1 = 0.0f,
                )
            }
            // M21 19 m-8 0 a8 8 0 1 1 16 0 a8 8 0 1 1 -16 0
            path(
                fill = SolidColor(Color(0xFF31373D)),
            ) {
                // M 21 19
                moveTo(x = 21.0f, y = 19.0f)
                // m -8 0
                moveToRelative(dx = -8.0f, dy = 0.0f)
                // a 8 8 0 1 1 16 0
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 16.0f,
                    dy1 = 0.0f,
                )
                // a 8 8 0 1 1 -16 0
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -16.0f,
                    dy1 = 0.0f,
                )
            }
            // M21 19 m-5 0 a5 5 0 1 1 10 0 a5 5 0 1 1 -10 0
            path(
                fill = SolidColor(Color(0xFF3B88C3)),
            ) {
                // M 21 19
                moveTo(x = 21.0f, y = 19.0f)
                // m -5 0
                moveToRelative(dx = -5.0f, dy = 0.0f)
                // a 5 5 0 1 1 10 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 10.0f,
                    dy1 = 0.0f,
                )
                // a 5 5 0 1 1 -10 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -10.0f,
                    dy1 = 0.0f,
                )
            }
            // M32.5 9.5 m-1.5 0 a1.5 1.5 0 1 1 3 0 a1.5 1.5 0 1 1 -3 0
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 32.5 9.5
                moveTo(x = 32.5f, y = 9.5f)
                // m -1.5 0
                moveToRelative(dx = -1.5f, dy = 0.0f)
                // a 1.5 1.5 0 1 1 3 0
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = 0.0f,
                )
                // a 1.5 1.5 0 1 1 -3 0
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = 0.0f,
                )
            }
            // M16 9 l3 -6 -6 2 -4 -5 -2 5 -6 -1 4 6 -5 4 h6 l-2 6 6 -3 6 5 -1 -8 6 -1z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 16 9
                moveTo(x = 16.0f, y = 9.0f)
                // l 3 -6
                lineToRelative(dx = 3.0f, dy = -6.0f)
                // l -6 2
                lineToRelative(dx = -6.0f, dy = 2.0f)
                // l -4 -5
                lineToRelative(dx = -4.0f, dy = -5.0f)
                // l -2 5
                lineToRelative(dx = -2.0f, dy = 5.0f)
                // l -6 -1
                lineToRelative(dx = -6.0f, dy = -1.0f)
                // l 4 6
                lineToRelative(dx = 4.0f, dy = 6.0f)
                // l -5 4
                lineToRelative(dx = -5.0f, dy = 4.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // l -2 6
                lineToRelative(dx = -2.0f, dy = 6.0f)
                // l 6 -3
                lineToRelative(dx = 6.0f, dy = -3.0f)
                // l 6 5
                lineToRelative(dx = 6.0f, dy = 5.0f)
                // l -1 -8
                lineToRelative(dx = -1.0f, dy = -8.0f)
                // l 6 -1z
                lineToRelative(dx = 6.0f, dy = -1.0f)
                close()
            }
            // M10 14 l-3 2 1 -3 -3 -1 3 -2 -3 -3 h4 l1 -3 2 3 3 -1 -2 3 3 3 -3 1 1 4z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 10 14
                moveTo(x = 10.0f, y = 14.0f)
                // l -3 2
                lineToRelative(dx = -3.0f, dy = 2.0f)
                // l 1 -3
                lineToRelative(dx = 1.0f, dy = -3.0f)
                // l -3 -1
                lineToRelative(dx = -3.0f, dy = -1.0f)
                // l 3 -2
                lineToRelative(dx = 3.0f, dy = -2.0f)
                // l -3 -3
                lineToRelative(dx = -3.0f, dy = -3.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // l 1 -3
                lineToRelative(dx = 1.0f, dy = -3.0f)
                // l 2 3
                lineToRelative(dx = 2.0f, dy = 3.0f)
                // l 3 -1
                lineToRelative(dx = 3.0f, dy = -1.0f)
                // l -2 3
                lineToRelative(dx = -2.0f, dy = 3.0f)
                // l 3 3
                lineToRelative(dx = 3.0f, dy = 3.0f)
                // l -3 1
                lineToRelative(dx = -3.0f, dy = 1.0f)
                // l 1 4z
                lineToRelative(dx = 1.0f, dy = 4.0f)
                close()
            }
        }.build().also { _emoji1f4f8 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f4f8: ImageVector? = null
