package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f69b: ImageVector
    get() {
        val current = _emoji1f69b
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f69b",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M31 25 H11 v-1 c0 -2.209 -1.791 -4 -4 -4 H4 c-2.209 0 -4 1.791 -4 4 v3 c0 2.209 1.791 4 4 4 h28 c2.209 0 4 -1.791 4 -4 v-2 h-5z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 31 25
                moveTo(x = 31.0f, y = 25.0f)
                // H 11
                horizontalLineTo(x = 11.0f)
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // c 0 -2.209 -1.791 -4 -4 -4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.209f,
                    dx2 = -1.791f,
                    dy2 = -4.0f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // c -2.209 0 -4 1.791 -4 4
                curveToRelative(
                    dx1 = -2.209f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = 1.791f,
                    dx3 = -4.0f,
                    dy3 = 4.0f,
                )
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // c 0 2.209 1.791 4 4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = 1.791f,
                    dy2 = 4.0f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // c 2.209 0 4 -1.791 4 -4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = -1.791f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -5z
                horizontalLineToRelative(dx = -5.0f)
                close()
            }
            // M10 12 H7.146 C4 12 3 14 3 14 l-3 5.959 V25 h13 V15 c0 -1.657 -1.343 -3 -3 -3z
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 10 12
                moveTo(x = 10.0f, y = 12.0f)
                // H 7.146
                horizontalLineTo(x = 7.146f)
                // C 4 12 3 14 3 14
                curveTo(
                    x1 = 4.0f,
                    y1 = 12.0f,
                    x2 = 3.0f,
                    y2 = 14.0f,
                    x3 = 3.0f,
                    y3 = 14.0f,
                )
                // l -3 5.959
                lineToRelative(dx = -3.0f, dy = 5.959f)
                // V 25
                verticalLineTo(y = 25.0f)
                // h 13
                horizontalLineToRelative(dx = 13.0f)
                // V 15
                verticalLineTo(y = 15.0f)
                // c 0 -1.657 -1.343 -3 -3 -3z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.657f,
                    dx2 = -1.343f,
                    dy2 = -3.0f,
                    dx3 = -3.0f,
                    dy3 = -3.0f,
                )
                close()
            }
            // M9 20 H2 l2 -4 s1 -2 3 -2 h2 v6z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 9 20
                moveTo(x = 9.0f, y = 20.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // l 2 -4
                lineToRelative(dx = 2.0f, dy = -4.0f)
                // s 1 -2 3 -2
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = -2.0f,
                    dx2 = 3.0f,
                    dy2 = -2.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 6z
                verticalLineToRelative(dy = 6.0f)
                close()
            }
            // M6 31 m-4 0 a4 4 0 1 1 8 0 a4 4 0 1 1 -8 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 6 31
                moveTo(x = 6.0f, y = 31.0f)
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
            // M6 31 m-2 0 a2 2 0 1 1 4 0 a2 2 0 1 1 -4 0
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 6 31
                moveTo(x = 6.0f, y = 31.0f)
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
            // M30 31 m-4 0 a4 4 0 1 1 8 0 a4 4 0 1 1 -8 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 30 31
                moveTo(x = 30.0f, y = 31.0f)
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
            // M30 31 m-2 0 a2 2 0 1 1 4 0 a2 2 0 1 1 -4 0
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 30 31
                moveTo(x = 30.0f, y = 31.0f)
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
            // M20 31 m-4 0 a4 4 0 1 1 8 0 a4 4 0 1 1 -8 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 20 31
                moveTo(x = 20.0f, y = 31.0f)
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
            // M20 31 m-2 0 a2 2 0 1 1 4 0 a2 2 0 1 1 -4 0
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 20 31
                moveTo(x = 20.0f, y = 31.0f)
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
            // M32 8 H19 c-2.209 0 -4 1.791 -4 4 v13 h21 V12 c0 -2.209 -1.791 -4 -4 -4z
            path(
                fill = SolidColor(Color(0xFF77B255)),
            ) {
                // M 32 8
                moveTo(x = 32.0f, y = 8.0f)
                // H 19
                horizontalLineTo(x = 19.0f)
                // c -2.209 0 -4 1.791 -4 4
                curveToRelative(
                    dx1 = -2.209f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = 1.791f,
                    dx3 = -4.0f,
                    dy3 = 4.0f,
                )
                // v 13
                verticalLineToRelative(dy = 13.0f)
                // h 21
                horizontalLineToRelative(dx = 21.0f)
                // V 12
                verticalLineTo(y = 12.0f)
                // c 0 -2.209 -1.791 -4 -4 -4z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.209f,
                    dx2 = -1.791f,
                    dy2 = -4.0f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                close()
            }
        }.build().also { _emoji1f69b = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f69b: ImageVector? = null
