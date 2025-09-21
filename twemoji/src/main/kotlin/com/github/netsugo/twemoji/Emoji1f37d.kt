package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f37d: ImageVector
    get() {
        val current = _emoji1f37d
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f37d",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 18 c0 9.941 -8.059 18 -18 18 S0 27.941 0 18 8.059 0 18 0 s18 8.059 18 18z
            path(
                fill = SolidColor(Color(0xFFE1E8ED)),
            ) {
                // M 36 18
                moveTo(x = 36.0f, y = 18.0f)
                // c 0 9.941 -8.059 18 -18 18
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 9.941f,
                    dx2 = -8.059f,
                    dy2 = 18.0f,
                    dx3 = -18.0f,
                    dy3 = 18.0f,
                )
                // S 0 27.941 0 18
                reflectiveCurveTo(
                    x1 = 0.0f,
                    y1 = 27.941f,
                    x2 = 0.0f,
                    y2 = 18.0f,
                )
                // S 8.059 0 18 0
                reflectiveCurveTo(
                    x1 = 8.059f,
                    y1 = 0.0f,
                    x2 = 18.0f,
                    y2 = 0.0f,
                )
                // s 18 8.059 18 18z
                reflectiveCurveToRelative(
                    dx1 = 18.0f,
                    dy1 = 8.059f,
                    dx2 = 18.0f,
                    dy2 = 18.0f,
                )
                close()
            }
            // M30 18 c0 6.628 -5.372 12 -12 12 S6 24.628 6 18 11.372 6 18 6 s12 5.372 12 12z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 30 18
                moveTo(x = 30.0f, y = 18.0f)
                // c 0 6.628 -5.372 12 -12 12
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 6.628f,
                    dx2 = -5.372f,
                    dy2 = 12.0f,
                    dx3 = -12.0f,
                    dy3 = 12.0f,
                )
                // S 6 24.628 6 18
                reflectiveCurveTo(
                    x1 = 6.0f,
                    y1 = 24.628f,
                    x2 = 6.0f,
                    y2 = 18.0f,
                )
                // S 11.372 6 18 6
                reflectiveCurveTo(
                    x1 = 11.372f,
                    y1 = 6.0f,
                    x2 = 18.0f,
                    y2 = 6.0f,
                )
                // s 12 5.372 12 12z
                reflectiveCurveToRelative(
                    dx1 = 12.0f,
                    dy1 = 5.372f,
                    dx2 = 12.0f,
                    dy2 = 12.0f,
                )
                close()
            }
            // M29 18 c0 6.075 -4.925 11 -11 11 -6.076 0 -11 -4.925 -11 -11 0 -6.076 4.925 -11 11 -11 s11 4.924 11 11z
            path(
                fill = SolidColor(Color(0xFFE1E8ED)),
            ) {
                // M 29 18
                moveTo(x = 29.0f, y = 18.0f)
                // c 0 6.075 -4.925 11 -11 11
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 6.075f,
                    dx2 = -4.925f,
                    dy2 = 11.0f,
                    dx3 = -11.0f,
                    dy3 = 11.0f,
                )
                // c -6.076 0 -11 -4.925 -11 -11
                curveToRelative(
                    dx1 = -6.076f,
                    dy1 = 0.0f,
                    dx2 = -11.0f,
                    dy2 = -4.925f,
                    dx3 = -11.0f,
                    dy3 = -11.0f,
                )
                // c 0 -6.076 4.925 -11 11 -11
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -6.076f,
                    dx2 = 4.925f,
                    dy2 = -11.0f,
                    dx3 = 11.0f,
                    dy3 = -11.0f,
                )
                // s 11 4.924 11 11z
                reflectiveCurveToRelative(
                    dx1 = 11.0f,
                    dy1 = 4.924f,
                    dx2 = 11.0f,
                    dy2 = 11.0f,
                )
                close()
            }
            // M1 1 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 1 1
                moveTo(x = 1.0f, y = 1.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // a 1 1 0 1 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 1 1 -2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
            }
            // M0 1 h2 v7 H0z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 0 1
                moveTo(x = 0.0f, y = 1.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // H 0z
                horizontalLineTo(x = 0.0f)
                close()
            }
            // M5 1 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 5 1
                moveTo(x = 5.0f, y = 1.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // a 1 1 0 1 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 1 1 -2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
            }
            // M4 1 h2 v7 H4z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 4 1
                moveTo(x = 4.0f, y = 1.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // H 4z
                horizontalLineTo(x = 4.0f)
                close()
            }
            // M9 1 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 9 1
                moveTo(x = 9.0f, y = 1.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // a 1 1 0 1 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 1 1 -2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
            }
            // M8 1 h2 v7 H8z M3 14 h4 v20 H3z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 8 1
                moveTo(x = 8.0f, y = 1.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // H 8z
                horizontalLineTo(x = 8.0f)
                close()
                // M 3 14
                moveTo(x = 3.0f, y = 14.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 20
                verticalLineToRelative(dy = 20.0f)
                // H 3z
                horizontalLineTo(x = 3.0f)
                close()
            }
            // M5 34 m-2 0 a2 2 0 1 1 4 0 a2 2 0 1 1 -4 0
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 5 34
                moveTo(x = 5.0f, y = 34.0f)
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
            // M8 8 c0 0.552 -0.448 1 -1 1 s-1 -0.448 -1 -1 H4 c0 0.552 -0.448 1 -1 1 s-1 -0.448 -1 -1 H0 c0 3.866 1 7 5 7 s5 -3.134 5 -7 H8z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 8 8
                moveTo(x = 8.0f, y = 8.0f)
                // c 0 0.552 -0.448 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = -0.448f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // s -1 -0.448 -1 -1
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = -0.448f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // c 0 0.552 -0.448 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = -0.448f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // s -1 -0.448 -1 -1
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = -0.448f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                )
                // H 0
                horizontalLineTo(x = 0.0f)
                // c 0 3.866 1 7 5 7
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.866f,
                    dx2 = 1.0f,
                    dy2 = 7.0f,
                    dx3 = 5.0f,
                    dy3 = 7.0f,
                )
                // s 5 -3.134 5 -7
                reflectiveCurveToRelative(
                    dx1 = 5.0f,
                    dy1 = -3.134f,
                    dx2 = 5.0f,
                    dy2 = -7.0f,
                )
                // H 8z
                horizontalLineTo(x = 8.0f)
                close()
            }
            // M1 8 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 1 8
                moveTo(x = 1.0f, y = 8.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // a 1 1 0 1 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 1 1 -2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
            }
            // M5 8 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 5 8
                moveTo(x = 5.0f, y = 8.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // a 1 1 0 1 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 1 1 -2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
            }
            // M9 8 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 9 8
                moveTo(x = 9.0f, y = 8.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // a 1 1 0 1 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 1 1 -2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
            }
            // M30 14 h4 v20 h-4z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 30 14
                moveTo(x = 30.0f, y = 14.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 20
                verticalLineToRelative(dy = 20.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // M32 34 m-2 0 a2 2 0 1 1 4 0 a2 2 0 1 1 -4 0
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 32 34
                moveTo(x = 32.0f, y = 34.0f)
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
            // M32 0 c1 0 2 1 2 3 v16 s-7 2 -7 -8 c0 -6 3 -11 5 -11z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 32 0
                moveTo(x = 32.0f, y = 0.0f)
                // c 1 0 2 1 2 3
                curveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 1.0f,
                    dx3 = 2.0f,
                    dy3 = 3.0f,
                )
                // v 16
                verticalLineToRelative(dy = 16.0f)
                // s -7 2 -7 -8
                reflectiveCurveToRelative(
                    dx1 = -7.0f,
                    dy1 = 2.0f,
                    dx2 = -7.0f,
                    dy2 = -8.0f,
                )
                // c 0 -6 3 -11 5 -11z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -6.0f,
                    dx2 = 3.0f,
                    dy2 = -11.0f,
                    dx3 = 5.0f,
                    dy3 = -11.0f,
                )
                close()
            }
        }.build().also { _emoji1f37d = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f37d: ImageVector? = null
