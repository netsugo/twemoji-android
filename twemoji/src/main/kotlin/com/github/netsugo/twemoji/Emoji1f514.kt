package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f514: ImageVector
    get() {
        val current = _emoji1f514
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f514",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M28 13 c0 11 5 10 5 15 0 0 0 2 -2 2 H5 c-2 0 -2 -2 -2 -2 0 -5 5 -4 5 -15 C8 7.478 12.477 3 18 3 s10 4.478 10 10z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 28 13
                moveTo(x = 28.0f, y = 13.0f)
                // c 0 11 5 10 5 15
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 11.0f,
                    dx2 = 5.0f,
                    dy2 = 10.0f,
                    dx3 = 5.0f,
                    dy3 = 15.0f,
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
                // c 0 -5 5 -4 5 -15
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -5.0f,
                    dx2 = 5.0f,
                    dy2 = -4.0f,
                    dx3 = 5.0f,
                    dy3 = -15.0f,
                )
                // C 8 7.478 12.477 3 18 3
                curveTo(
                    x1 = 8.0f,
                    y1 = 7.478f,
                    x2 = 12.477f,
                    y2 = 3.0f,
                    x3 = 18.0f,
                    y3 = 3.0f,
                )
                // s 10 4.478 10 10z
                reflectiveCurveToRelative(
                    dx1 = 10.0f,
                    dy1 = 4.478f,
                    dx2 = 10.0f,
                    dy2 = 10.0f,
                )
                close()
            }
            // M18 3 m-3 0 a3 3 0 1 1 6 0 a3 3 0 1 1 -6 0
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 18 3
                moveTo(x = 18.0f, y = 3.0f)
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
            // M18 36 c2.209 0 4 -1.791 4 -4 h-8 c0 2.209 1.791 4 4 4z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 18 36
                moveTo(x = 18.0f, y = 36.0f)
                // c 2.209 0 4 -1.791 4 -4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = -1.791f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // c 0 2.209 1.791 4 4 4z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = 1.791f,
                    dy2 = 4.0f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                close()
            }
        }.build().also { _emoji1f514 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f514: ImageVector? = null
