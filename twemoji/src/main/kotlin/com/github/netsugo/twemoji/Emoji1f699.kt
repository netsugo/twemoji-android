package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f699: ImageVector
    get() {
        val current = _emoji1f699
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f699",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 24 c0 0.553 -0.447 1 -1 1 h-1 c-0.553 0 -1 -0.447 -1 -1 v-6 c0 -0.553 0.447 -1 1 -1 h1 c0.553 0 1 0.447 1 1 v6z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 36 24
                moveTo(x = 36.0f, y = 24.0f)
                // c 0 0.553 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // c -0.553 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.553f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // c 0 -0.553 0.447 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.553f,
                    dx2 = 0.447f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // c 0.553 0 1 0.447 1 1
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.447f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // v 6z
                verticalLineToRelative(dy = 6.0f)
                close()
            }
            // M5 31 h26 c1 0 3 -1 3 -4 0 -2 0 -8 -1 -9 s0 -7 -4 -7 H15 c-3 0 -6 7 -6 7 l-4 1 s-4 1 -4 4 v3 s-1 0.338 -1 1.957 S1 30 1 30 l4 1z
            path(
                fill = SolidColor(Color(0xFF3B88C3)),
            ) {
                // M 5 31
                moveTo(x = 5.0f, y = 31.0f)
                // h 26
                horizontalLineToRelative(dx = 26.0f)
                // c 1 0 3 -1 3 -4
                curveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                    dx2 = 3.0f,
                    dy2 = -1.0f,
                    dx3 = 3.0f,
                    dy3 = -4.0f,
                )
                // c 0 -2 0 -8 -1 -9
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                    dx2 = 0.0f,
                    dy2 = -8.0f,
                    dx3 = -1.0f,
                    dy3 = -9.0f,
                )
                // s 0 -7 -4 -7
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -7.0f,
                    dx2 = -4.0f,
                    dy2 = -7.0f,
                )
                // H 15
                horizontalLineTo(x = 15.0f)
                // c -3 0 -6 7 -6 7
                curveToRelative(
                    dx1 = -3.0f,
                    dy1 = 0.0f,
                    dx2 = -6.0f,
                    dy2 = 7.0f,
                    dx3 = -6.0f,
                    dy3 = 7.0f,
                )
                // l -4 1
                lineToRelative(dx = -4.0f, dy = 1.0f)
                // s -4 1 -4 4
                reflectiveCurveToRelative(
                    dx1 = -4.0f,
                    dy1 = 1.0f,
                    dx2 = -4.0f,
                    dy2 = 4.0f,
                )
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // s -1 0.338 -1 1.957
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.338f,
                    dx2 = -1.0f,
                    dy2 = 1.957f,
                )
                // S 1 30 1 30
                reflectiveCurveTo(
                    x1 = 1.0f,
                    y1 = 30.0f,
                    x2 = 1.0f,
                    y2 = 30.0f,
                )
                // l 4 1z
                lineToRelative(dx = 4.0f, dy = 1.0f)
                close()
            }
            // M9 31 m-4 0 a4 4 0 1 1 8 0 a4 4 0 1 1 -8 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 9 31
                moveTo(x = 9.0f, y = 31.0f)
                // m -4 0
                moveToRelative(dx = -4.0f, dy = 0.0f)
                // a 4 4 0 1 1 8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 8.0f,
                    dy1 = 0.0f,
                )
                // a 4 4 0 1 1 -8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -8.0f,
                    dy1 = 0.0f,
                )
            }
            // M9 31 m-2 0 a2 2 0 1 1 4 0 a2 2 0 1 1 -4 0
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 9 31
                moveTo(x = 9.0f, y = 31.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
            }
            // M27 31 m-4 0 a4 4 0 1 1 8 0 a4 4 0 1 1 -8 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 27 31
                moveTo(x = 27.0f, y = 31.0f)
                // m -4 0
                moveToRelative(dx = -4.0f, dy = 0.0f)
                // a 4 4 0 1 1 8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 8.0f,
                    dy1 = 0.0f,
                )
                // a 4 4 0 1 1 -8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -8.0f,
                    dy1 = 0.0f,
                )
            }
            // M27 31 m-2 0 a2 2 0 1 1 4 0 a2 2 0 1 1 -4 0
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 27 31
                moveTo(x = 27.0f, y = 31.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
            }
            // M24 17 c0 0.552 0.447 1 1 1 h4 c0.553 0 1 -0.448 1 -1 v-3 c0 -0.552 -0.447 -1 -1 -1 h-4 c-0.553 0 -1 0.448 -1 1 v3z M13 17 c0 1 0.448 1 1 1 h7 c0.553 0 1 -0.448 1 -1 v-3 c0 -0.552 -0.447 -1 -1 -1 h-5 c-1 0 -3 3 -3 4z
            path(
                fill = SolidColor(Color(0xFFBBDDF5)),
            ) {
                // M 24 17
                moveTo(x = 24.0f, y = 17.0f)
                // c 0 0.552 0.447 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = 0.447f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // c 0.553 0 1 -0.448 1 -1
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -0.448f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // c 0 -0.552 -0.447 -1 -1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = -0.447f,
                    dy2 = -1.0f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // c -0.553 0 -1 0.448 -1 1
                curveToRelative(
                    dx1 = -0.553f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = 0.448f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // v 3z
                verticalLineToRelative(dy = 3.0f)
                close()
                // M 13 17
                moveTo(x = 13.0f, y = 17.0f)
                // c 0 1 0.448 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.0f,
                    dx2 = 0.448f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // c 0.553 0 1 -0.448 1 -1
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -0.448f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // c 0 -0.552 -0.447 -1 -1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = -0.447f,
                    dy2 = -1.0f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // c -1 0 -3 3 -3 4z
                curveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                    dx2 = -3.0f,
                    dy2 = 3.0f,
                    dx3 = -3.0f,
                    dy3 = 4.0f,
                )
                close()
            }
            // M32 23.5 c0 0.828 -0.672 1.5 -1.5 1.5 h-22 c-0.829 0 -1.5 -0.672 -1.5 -1.5 0 -0.829 0.671 -1.5 1.5 -1.5 h22 c0.828 0 1.5 0.671 1.5 1.5z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 32 23.5
                moveTo(x = 32.0f, y = 23.5f)
                // c 0 0.828 -0.672 1.5 -1.5 1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.828f,
                    dx2 = -0.672f,
                    dy2 = 1.5f,
                    dx3 = -1.5f,
                    dy3 = 1.5f,
                )
                // h -22
                horizontalLineToRelative(dx = -22.0f)
                // c -0.829 0 -1.5 -0.672 -1.5 -1.5
                curveToRelative(
                    dx1 = -0.829f,
                    dy1 = 0.0f,
                    dx2 = -1.5f,
                    dy2 = -0.672f,
                    dx3 = -1.5f,
                    dy3 = -1.5f,
                )
                // c 0 -0.829 0.671 -1.5 1.5 -1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.829f,
                    dx2 = 0.671f,
                    dy2 = -1.5f,
                    dx3 = 1.5f,
                    dy3 = -1.5f,
                )
                // h 22
                horizontalLineToRelative(dx = 22.0f)
                // c 0.828 0 1.5 0.671 1.5 1.5z
                curveToRelative(
                    dx1 = 0.828f,
                    dy1 = 0.0f,
                    dx2 = 1.5f,
                    dy2 = 0.671f,
                    dx3 = 1.5f,
                    dy3 = 1.5f,
                )
                close()
            }
        }.build().also { _emoji1f699 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f699: ImageVector? = null
