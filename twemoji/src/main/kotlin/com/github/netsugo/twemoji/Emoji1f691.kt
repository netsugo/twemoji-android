package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f691: ImageVector
    get() {
        val current = _emoji1f691
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f691",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M35 12 c0 -1 -1 -4 -4 -4 H9.401 c-1.377 0 -3.29 1.791 -4.302 4 L2 17 c-1.453 0.599 -2 2.331 -2 4 v6 a4 4 0 0 0 4 4 h28 a4 4 0 0 0 4 -4 v-8 c0 -1.027 -1 -7 -1 -7z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 35 12
                moveTo(x = 35.0f, y = 12.0f)
                // c 0 -1 -1 -4 -4 -4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.0f,
                    dx2 = -1.0f,
                    dy2 = -4.0f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                // H 9.401
                horizontalLineTo(x = 9.401f)
                // c -1.377 0 -3.29 1.791 -4.302 4
                curveToRelative(
                    dx1 = -1.377f,
                    dy1 = 0.0f,
                    dx2 = -3.29f,
                    dy2 = 1.791f,
                    dx3 = -4.302f,
                    dy3 = 4.0f,
                )
                // L 2 17
                lineTo(x = 2.0f, y = 17.0f)
                // c -1.453 0.599 -2 2.331 -2 4
                curveToRelative(
                    dx1 = -1.453f,
                    dy1 = 0.599f,
                    dx2 = -2.0f,
                    dy2 = 2.331f,
                    dx3 = -2.0f,
                    dy3 = 4.0f,
                )
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // a 4 4 0 0 0 4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = 4.0f,
                )
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // a 4 4 0 0 0 4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = -4.0f,
                )
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // c 0 -1.027 -1 -7 -1 -7z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.027f,
                    dx2 = -1.0f,
                    dy2 = -7.0f,
                    dx3 = -1.0f,
                    dy3 = -7.0f,
                )
                close()
            }
            // M9 25 a5.997 5.997 0 0 0 -5.993 5.861 c0.32 0.081 0.648 0.139 0.993 0.139 h11 a6 6 0 0 0 -6 -6z M32.993 30.86 A5.996 5.996 0 0 0 27 25 c-3.312 0 -6 2.687 -6 6 h11 c0.345 0 0.674 -0.058 0.993 -0.14z
            path(
                fill = SolidColor(Color(0xFFE1E8ED)),
            ) {
                // M 9 25
                moveTo(x = 9.0f, y = 25.0f)
                // a 5.997 5.997 0 0 0 -5.993 5.861
                arcToRelative(
                    a = 5.997f,
                    b = 5.997f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -5.993f,
                    dy1 = 5.861f,
                )
                // c 0.32 0.081 0.648 0.139 0.993 0.139
                curveToRelative(
                    dx1 = 0.32f,
                    dy1 = 0.081f,
                    dx2 = 0.648f,
                    dy2 = 0.139f,
                    dx3 = 0.993f,
                    dy3 = 0.139f,
                )
                // h 11
                horizontalLineToRelative(dx = 11.0f)
                // a 6 6 0 0 0 -6 -6z
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -6.0f,
                    dy1 = -6.0f,
                )
                close()
                // M 32.993 30.86
                moveTo(x = 32.993f, y = 30.86f)
                // A 5.996 5.996 0 0 0 27 25
                arcTo(
                    horizontalEllipseRadius = 5.996f,
                    verticalEllipseRadius = 5.996f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 27.0f,
                    y1 = 25.0f,
                )
                // c -3.312 0 -6 2.687 -6 6
                curveToRelative(
                    dx1 = -3.312f,
                    dy1 = 0.0f,
                    dx2 = -6.0f,
                    dy2 = 2.687f,
                    dx3 = -6.0f,
                    dy3 = 6.0f,
                )
                // h 11
                horizontalLineToRelative(dx = 11.0f)
                // c 0.345 0 0.674 -0.058 0.993 -0.14z
                curveToRelative(
                    dx1 = 0.345f,
                    dy1 = 0.0f,
                    dx2 = 0.674f,
                    dy2 = -0.058f,
                    dx3 = 0.993f,
                    dy3 = -0.14f,
                )
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
                fill = SolidColor(Color(0xFF99AAB5)),
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
                fill = SolidColor(Color(0xFF99AAB5)),
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
            // M0 21 h36 v3 H0 v-3Z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 0 21
                moveTo(x = 0.0f, y = 21.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // H 0
                horizontalLineTo(x = 0.0f)
                // v -3z
                verticalLineToRelative(dy = -3.0f)
                close()
            }
            // M8 10 h5 v7 H4z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 8 10
                moveTo(x = 8.0f, y = 10.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // H 4z
                horizontalLineTo(x = 4.0f)
                close()
            }
            // M17 6.5 A1.5 1.5 0 0 1 15.5 8 h-4 a1.5 1.5 0 1 1 0 -3 h4 A1.5 1.5 0 0 1 17 6.5Z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 17 6.5
                moveTo(x = 17.0f, y = 6.5f)
                // A 1.5 1.5 0 0 1 15.5 8
                arcTo(
                    horizontalEllipseRadius = 1.5f,
                    verticalEllipseRadius = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 15.5f,
                    y1 = 8.0f,
                )
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // a 1.5 1.5 0 1 1 0 -3
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -3.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // A 1.5 1.5 0 0 1 17 6.5z
                arcTo(
                    horizontalEllipseRadius = 1.5f,
                    verticalEllipseRadius = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 17.0f,
                    y1 = 6.5f,
                )
                close()
            }
            // M18 6.5 A1.5 1.5 0 0 1 16.5 8 h-1 a1.5 1.5 0 1 1 0 -3 h1 A1.5 1.5 0 0 1 18 6.5Z
            path(
                fill = SolidColor(Color(0xFFBE1931)),
            ) {
                // M 18 6.5
                moveTo(x = 18.0f, y = 6.5f)
                // A 1.5 1.5 0 0 1 16.5 8
                arcTo(
                    horizontalEllipseRadius = 1.5f,
                    verticalEllipseRadius = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 16.5f,
                    y1 = 8.0f,
                )
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // a 1.5 1.5 0 1 1 0 -3
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -3.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // A 1.5 1.5 0 0 1 18 6.5z
                arcTo(
                    horizontalEllipseRadius = 1.5f,
                    verticalEllipseRadius = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 18.0f,
                    y1 = 6.5f,
                )
                close()
            }
            // M26 10 v2.27 l-1.965 -1.135 -1 1.73 L25.002 14 l-1.967 1.135 1 1.73 L26 15.731 V18 h2 v-2.27 l1.965 1.135 1 -1.73 L28.998 14 l1.967 -1.135 -1 -1.73 L28 12.27 V10 h-2Z
            path(
                fill = SolidColor(Color(0xFF3B88C3)),
            ) {
                // M 26 10
                moveTo(x = 26.0f, y = 10.0f)
                // v 2.27
                verticalLineToRelative(dy = 2.27f)
                // l -1.965 -1.135
                lineToRelative(dx = -1.965f, dy = -1.135f)
                // l -1 1.73
                lineToRelative(dx = -1.0f, dy = 1.73f)
                // L 25.002 14
                lineTo(x = 25.002f, y = 14.0f)
                // l -1.967 1.135
                lineToRelative(dx = -1.967f, dy = 1.135f)
                // l 1 1.73
                lineToRelative(dx = 1.0f, dy = 1.73f)
                // L 26 15.731
                lineTo(x = 26.0f, y = 15.731f)
                // V 18
                verticalLineTo(y = 18.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -2.27
                verticalLineToRelative(dy = -2.27f)
                // l 1.965 1.135
                lineToRelative(dx = 1.965f, dy = 1.135f)
                // l 1 -1.73
                lineToRelative(dx = 1.0f, dy = -1.73f)
                // L 28.998 14
                lineTo(x = 28.998f, y = 14.0f)
                // l 1.967 -1.135
                lineToRelative(dx = 1.967f, dy = -1.135f)
                // l -1 -1.73
                lineToRelative(dx = -1.0f, dy = -1.73f)
                // L 28 12.27
                lineTo(x = 28.0f, y = 12.27f)
                // V 10
                verticalLineTo(y = 10.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
        }.build().also { _emoji1f691 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f691: ImageVector? = null
