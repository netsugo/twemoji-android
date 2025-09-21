package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f6ce: ImageVector
    get() {
        val current = _emoji1f6ce
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f6ce",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M15 26 h6 v4 h-6z
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 15 26
                moveTo(x = 15.0f, y = 26.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -6z
                horizontalLineToRelative(dx = -6.0f)
                close()
            }
            // M30 18 c0 7 3 4 3 7 0 0 0 2 -2 2 H5 c-2 0 -2 -2 -2 -2 0 -3 3 0 3 -7 0 -5.523 6.477 -8 12 -8 s12 2.477 12 8z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 30 18
                moveTo(x = 30.0f, y = 18.0f)
                // c 0 7 3 4 3 7
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 7.0f,
                    dx2 = 3.0f,
                    dy2 = 4.0f,
                    dx3 = 3.0f,
                    dy3 = 7.0f,
                )
                // c 0 0 0 2 -2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 0.0f,
                    dy2 = 2.0f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // H 5
                horizontalLineTo(x = 5.0f)
                // c -2 0 -2 -2 -2 -2
                curveToRelative(
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -2.0f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // c 0 -3 3 0 3 -7
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.0f,
                    dx2 = 3.0f,
                    dy2 = 0.0f,
                    dx3 = 3.0f,
                    dy3 = -7.0f,
                )
                // c 0 -5.523 6.477 -8 12 -8
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -5.523f,
                    dx2 = 6.477f,
                    dy2 = -8.0f,
                    dx3 = 12.0f,
                    dy3 = -8.0f,
                )
                // s 12 2.477 12 8z
                reflectiveCurveToRelative(
                    dx1 = 12.0f,
                    dy1 = 2.477f,
                    dx2 = 12.0f,
                    dy2 = 8.0f,
                )
                close()
            }
            // M18 10 m-3 0 a3 3 0 1 1 6 0 a3 3 0 1 1 -6 0
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 18 10
                moveTo(x = 18.0f, y = 10.0f)
                // m -3 0
                moveToRelative(dx = -3.0f, dy = 0.0f)
                // a 3 3 0 1 1 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // a 3 3 0 1 1 -6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
            }
            // M35 33 c0 1.104 -0.896 2 -2 2 H3 c-1.104 0 -2 -0.896 -2 -2 s0.896 -2 2 -2 h30 c1.104 0 2 0.896 2 2z
            path(
                fill = SolidColor(Color(0xFFC1694F)),
            ) {
                // M 35 33
                moveTo(x = 35.0f, y = 33.0f)
                // c 0 1.104 -0.896 2 -2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = -0.896f,
                    dy2 = 2.0f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // H 3
                horizontalLineTo(x = 3.0f)
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
                // h 30
                horizontalLineToRelative(dx = 30.0f)
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
            // M33 31 c0 1.104 -0.896 2 -2 2 H5 c-1.104 0 -2 -0.896 -2 -2 s0.896 -2 2 -2 h26 c1.104 0 2 0.896 2 2z
            path(
                fill = SolidColor(Color(0xFFC1694F)),
            ) {
                // M 33 31
                moveTo(x = 33.0f, y = 31.0f)
                // c 0 1.104 -0.896 2 -2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = -0.896f,
                    dy2 = 2.0f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // H 5
                horizontalLineTo(x = 5.0f)
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
                // h 26
                horizontalLineToRelative(dx = 26.0f)
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
        }.build().also { _emoji1f6ce = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f6ce: ImageVector? = null
