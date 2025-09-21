package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f4f7: ImageVector
    get() {
        val current = _emoji1f4f7
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f4f7",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M4 5 s0 -1 1 -1 h6 s1 0 1 1 v2 H4 V5z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 4 5
                moveTo(x = 4.0f, y = 5.0f)
                // s 0 -1 1 -1
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // s 1 0 1 1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 1.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // V 5z
                verticalLineTo(y = 5.0f)
                close()
            }
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
            // M12 9.5 c0 0.829 -0.671 1.5 -1.5 1.5 h-5 C4.671 11 4 10.329 4 9.5 S4.671 8 5.5 8 h5 c0.829 0 1.5 0.671 1.5 1.5z
            path(
                fill = SolidColor(Color(0xFFF5F8FA)),
            ) {
                // M 12 9.5
                moveTo(x = 12.0f, y = 9.5f)
                // c 0 0.829 -0.671 1.5 -1.5 1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.829f,
                    dx2 = -0.671f,
                    dy2 = 1.5f,
                    dx3 = -1.5f,
                    dy3 = 1.5f,
                )
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // C 4.671 11 4 10.329 4 9.5
                curveTo(
                    x1 = 4.671f,
                    y1 = 11.0f,
                    x2 = 4.0f,
                    y2 = 10.329f,
                    x3 = 4.0f,
                    y3 = 9.5f,
                )
                // S 4.671 8 5.5 8
                reflectiveCurveTo(
                    x1 = 4.671f,
                    y1 = 8.0f,
                    x2 = 5.5f,
                    y2 = 8.0f,
                )
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // c 0.829 0 1.5 0.671 1.5 1.5z
                curveToRelative(
                    dx1 = 0.829f,
                    dy1 = 0.0f,
                    dx2 = 1.5f,
                    dy2 = 0.671f,
                    dx3 = 1.5f,
                    dy3 = 1.5f,
                )
                close()
            }
        }.build().also { _emoji1f4f7 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f4f7: ImageVector? = null
