package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f3b7: ImageVector
    get() {
        val current = _emoji1f3b7
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f3b7",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M14 16 L9 26 s-1 2 1 2 c1 0 2 -2 2 -2 L26 7 s2 -4 8 -1 v2 c-3 -1 -4 1 -4 1 L15 33 s-2 3 -7 3 c-6 0 -7 -5 -7 -8 0 -2 1 -4 2 -6 s-2 -6 -2 -6 h13z
            path(
                fill = SolidColor(Color(0xFFFCAB40)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                // M 14 16
                moveTo(x = 14.0f, y = 16.0f)
                // L 9 26
                lineTo(x = 9.0f, y = 26.0f)
                // s -1 2 1 2
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 2.0f,
                    dx2 = 1.0f,
                    dy2 = 2.0f,
                )
                // c 1 0 2 -2 2 -2
                curveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // L 26 7
                lineTo(x = 26.0f, y = 7.0f)
                // s 2 -4 8 -1
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = -4.0f,
                    dx2 = 8.0f,
                    dy2 = -1.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // c -3 -1 -4 1 -4 1
                curveToRelative(
                    dx1 = -3.0f,
                    dy1 = -1.0f,
                    dx2 = -4.0f,
                    dy2 = 1.0f,
                    dx3 = -4.0f,
                    dy3 = 1.0f,
                )
                // L 15 33
                lineTo(x = 15.0f, y = 33.0f)
                // s -2 3 -7 3
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 3.0f,
                    dx2 = -7.0f,
                    dy2 = 3.0f,
                )
                // c -6 0 -7 -5 -7 -8
                curveToRelative(
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                    dx2 = -7.0f,
                    dy2 = -5.0f,
                    dx3 = -7.0f,
                    dy3 = -8.0f,
                )
                // c 0 -2 1 -4 2 -6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                    dx2 = 1.0f,
                    dy2 = -4.0f,
                    dx3 = 2.0f,
                    dy3 = -6.0f,
                )
                // s -2 -6 -2 -6
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = -6.0f,
                    dx2 = -2.0f,
                    dy2 = -6.0f,
                )
                // h 13z
                horizontalLineToRelative(dx = 13.0f)
                close()
            }
            // M7.5 20 C4.04 20 0 18.952 0 16 c0 -2.953 4.04 -4 7.5 -4 s7.5 1.047 7.5 4 c0 2.952 -4.04 4 -7.5 4z
            path(
                fill = SolidColor(Color(0xFFFDCB58)),
            ) {
                // M 7.5 20
                moveTo(x = 7.5f, y = 20.0f)
                // C 4.04 20 0 18.952 0 16
                curveTo(
                    x1 = 4.04f,
                    y1 = 20.0f,
                    x2 = 0.0f,
                    y2 = 18.952f,
                    x3 = 0.0f,
                    y3 = 16.0f,
                )
                // c 0 -2.953 4.04 -4 7.5 -4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.953f,
                    dx2 = 4.04f,
                    dy2 = -4.0f,
                    dx3 = 7.5f,
                    dy3 = -4.0f,
                )
                // s 7.5 1.047 7.5 4
                reflectiveCurveToRelative(
                    dx1 = 7.5f,
                    dy1 = 1.047f,
                    dx2 = 7.5f,
                    dy2 = 4.0f,
                )
                // c 0 2.952 -4.04 4 -7.5 4z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.952f,
                    dx2 = -4.04f,
                    dy2 = 4.0f,
                    dx3 = -7.5f,
                    dy3 = 4.0f,
                )
                close()
            }
            // M19 17 m-2 0 a2 2 0 1 1 4 0 a2 2 0 1 1 -4 0
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 19 17
                moveTo(x = 19.0f, y = 17.0f)
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
            // M22 13 m-2 0 a2 2 0 1 1 4 0 a2 2 0 1 1 -4 0
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 22 13
                moveTo(x = 22.0f, y = 13.0f)
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
            // M25 9 m-2 0 a2 2 0 1 1 4 0 a2 2 0 1 1 -4 0
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 25 9
                moveTo(x = 25.0f, y = 9.0f)
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
            // M33.998 10 c-0.3 0 -0.605 -0.068 -0.893 -0.211 l-2 -1 c-0.988 -0.494 -1.389 -1.695 -0.895 -2.684 0.493 -0.986 1.693 -1.39 2.684 -0.895 l2 1 c0.988 0.494 1.389 1.695 0.895 2.684 -0.351 0.701 -1.057 1.106 -1.791 1.106z
            path(
                fill = SolidColor(Color(0xFF9AAAB4)),
            ) {
                // M 33.998 10
                moveTo(x = 33.998f, y = 10.0f)
                // c -0.3 0 -0.605 -0.068 -0.893 -0.211
                curveToRelative(
                    dx1 = -0.3f,
                    dy1 = 0.0f,
                    dx2 = -0.605f,
                    dy2 = -0.068f,
                    dx3 = -0.893f,
                    dy3 = -0.211f,
                )
                // l -2 -1
                lineToRelative(dx = -2.0f, dy = -1.0f)
                // c -0.988 -0.494 -1.389 -1.695 -0.895 -2.684
                curveToRelative(
                    dx1 = -0.988f,
                    dy1 = -0.494f,
                    dx2 = -1.389f,
                    dy2 = -1.695f,
                    dx3 = -0.895f,
                    dy3 = -2.684f,
                )
                // c 0.493 -0.986 1.693 -1.39 2.684 -0.895
                curveToRelative(
                    dx1 = 0.493f,
                    dy1 = -0.986f,
                    dx2 = 1.693f,
                    dy2 = -1.39f,
                    dx3 = 2.684f,
                    dy3 = -0.895f,
                )
                // l 2 1
                lineToRelative(dx = 2.0f, dy = 1.0f)
                // c 0.988 0.494 1.389 1.695 0.895 2.684
                curveToRelative(
                    dx1 = 0.988f,
                    dy1 = 0.494f,
                    dx2 = 1.389f,
                    dy2 = 1.695f,
                    dx3 = 0.895f,
                    dy3 = 2.684f,
                )
                // c -0.351 0.701 -1.057 1.106 -1.791 1.106z
                curveToRelative(
                    dx1 = -0.351f,
                    dy1 = 0.701f,
                    dx2 = -1.057f,
                    dy2 = 1.106f,
                    dx3 = -1.791f,
                    dy3 = 1.106f,
                )
                close()
            }
            // M8.806 21.703 l1.267 -1.547 6.19 5.069 -1.267 1.547z
            path(
                fill = SolidColor(Color(0xFFFCAB40)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                // M 8.806 21.703
                moveTo(x = 8.806f, y = 21.703f)
                // l 1.267 -1.547
                lineToRelative(dx = 1.267f, dy = -1.547f)
                // l 6.19 5.069
                lineToRelative(dx = 6.19f, dy = 5.069f)
                // l -1.267 1.547z
                lineToRelative(dx = -1.267f, dy = 1.547f)
                close()
            }
        }.build().also { _emoji1f3b7 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f3b7: ImageVector? = null
