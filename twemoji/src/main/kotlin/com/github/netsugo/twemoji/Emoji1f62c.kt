package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f62c: ImageVector
    get() {
        val current = _emoji1f62c
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f62c",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 18 c0 9.941 -8.059 18 -18 18 -9.94 0 -18 -8.059 -18 -18 C0 8.06 8.06 0 18 0 c9.941 0 18 8.06 18 18
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
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
                // c -9.94 0 -18 -8.059 -18 -18
                curveToRelative(
                    dx1 = -9.94f,
                    dy1 = 0.0f,
                    dx2 = -18.0f,
                    dy2 = -8.059f,
                    dx3 = -18.0f,
                    dy3 = -18.0f,
                )
                // C 0 8.06 8.06 0 18 0
                curveTo(
                    x1 = 0.0f,
                    y1 = 8.06f,
                    x2 = 8.06f,
                    y2 = 0.0f,
                    x3 = 18.0f,
                    y3 = 0.0f,
                )
                // c 9.941 0 18 8.06 18 18
                curveToRelative(
                    dx1 = 9.941f,
                    dy1 = 0.0f,
                    dx2 = 18.0f,
                    dy2 = 8.06f,
                    dx3 = 18.0f,
                    dy3 = 18.0f,
                )
            }
            // M9.5 13.5 a2.5 3.5 0 1 0 5 0 a2.5 3.5 0 1 0 -5 0z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 9.5 13.5
                moveTo(x = 9.5f, y = 13.5f)
                // a 2.5 3.5 0 1 0 5 0
                arcToRelative(
                    a = 2.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // a 2.5 3.5 0 1 0 -5 0z
                arcToRelative(
                    a = 2.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -5.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M21.5 13.5 a2.5 3.5 0 1 0 5 0 a2.5 3.5 0 1 0 -5 0z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 21.5 13.5
                moveTo(x = 21.5f, y = 13.5f)
                // a 2.5 3.5 0 1 0 5 0
                arcToRelative(
                    a = 2.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // a 2.5 3.5 0 1 0 -5 0z
                arcToRelative(
                    a = 2.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -5.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M25 21 c2.209 0 4 1.791 4 4 s-1.791 4 -4 4 H11 c-2.209 0 -4 -1.791 -4 -4 s1.791 -4 4 -4 h14z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 25 21
                moveTo(x = 25.0f, y = 21.0f)
                // c 2.209 0 4 1.791 4 4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = 1.791f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // s -1.791 4 -4 4
                reflectiveCurveToRelative(
                    dx1 = -1.791f,
                    dy1 = 4.0f,
                    dx2 = -4.0f,
                    dy2 = 4.0f,
                )
                // H 11
                horizontalLineTo(x = 11.0f)
                // c -2.209 0 -4 -1.791 -4 -4
                curveToRelative(
                    dx1 = -2.209f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = -1.791f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                // s 1.791 -4 4 -4
                reflectiveCurveToRelative(
                    dx1 = 1.791f,
                    dy1 = -4.0f,
                    dx2 = 4.0f,
                    dy2 = -4.0f,
                )
                // h 14z
                horizontalLineToRelative(dx = 14.0f)
                close()
            }
            // M25 20 L11 20 c-2.757 0 -5 2.243 -5 5 s2.243 5 5 5 h14 c2.757 0 5 -2.243 5 -5 s-2.243 -5 -5 -5z M25 22 c1.483 0 2.71 1.084 2.949 2.5 L24.5 24.5 L24.5 22 h0.5z M23.5 22 v2.5 h-3 L20.5 22 h3z M19.5 22 v2.5 h-3 L16.5 22 h3z M15.5 22 v2.5 h-3 L12.5 22 h3z M11 22 h0.5 v2.5 L8.051 24.5 C8.29 23.084 9.517 22 11 22z M11 28 c-1.483 0 -2.71 -1.084 -2.949 -2.5 L11.5 25.5 L11.5 28 L11 28z M12.5 28 v-2.5 h3 L15.5 28 h-3z M16.5 28 v-2.5 h3 L19.5 28 h-3z M20.5 28 v-2.5 h3 L23.5 28 h-3z M25 28 h-0.5 v-2.5 h3.449 C27.71 26.916 26.483 28 25 28z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 25 20
                moveTo(x = 25.0f, y = 20.0f)
                // L 11 20
                lineTo(x = 11.0f, y = 20.0f)
                // c -2.757 0 -5 2.243 -5 5
                curveToRelative(
                    dx1 = -2.757f,
                    dy1 = 0.0f,
                    dx2 = -5.0f,
                    dy2 = 2.243f,
                    dx3 = -5.0f,
                    dy3 = 5.0f,
                )
                // s 2.243 5 5 5
                reflectiveCurveToRelative(
                    dx1 = 2.243f,
                    dy1 = 5.0f,
                    dx2 = 5.0f,
                    dy2 = 5.0f,
                )
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // c 2.757 0 5 -2.243 5 -5
                curveToRelative(
                    dx1 = 2.757f,
                    dy1 = 0.0f,
                    dx2 = 5.0f,
                    dy2 = -2.243f,
                    dx3 = 5.0f,
                    dy3 = -5.0f,
                )
                // s -2.243 -5 -5 -5z
                reflectiveCurveToRelative(
                    dx1 = -2.243f,
                    dy1 = -5.0f,
                    dx2 = -5.0f,
                    dy2 = -5.0f,
                )
                close()
                // M 25 22
                moveTo(x = 25.0f, y = 22.0f)
                // c 1.483 0 2.71 1.084 2.949 2.5
                curveToRelative(
                    dx1 = 1.483f,
                    dy1 = 0.0f,
                    dx2 = 2.71f,
                    dy2 = 1.084f,
                    dx3 = 2.949f,
                    dy3 = 2.5f,
                )
                // L 24.5 24.5
                lineTo(x = 24.5f, y = 24.5f)
                // L 24.5 22
                lineTo(x = 24.5f, y = 22.0f)
                // h 0.5z
                horizontalLineToRelative(dx = 0.5f)
                close()
                // M 23.5 22
                moveTo(x = 23.5f, y = 22.0f)
                // v 2.5
                verticalLineToRelative(dy = 2.5f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // L 20.5 22
                lineTo(x = 20.5f, y = 22.0f)
                // h 3z
                horizontalLineToRelative(dx = 3.0f)
                close()
                // M 19.5 22
                moveTo(x = 19.5f, y = 22.0f)
                // v 2.5
                verticalLineToRelative(dy = 2.5f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // L 16.5 22
                lineTo(x = 16.5f, y = 22.0f)
                // h 3z
                horizontalLineToRelative(dx = 3.0f)
                close()
                // M 15.5 22
                moveTo(x = 15.5f, y = 22.0f)
                // v 2.5
                verticalLineToRelative(dy = 2.5f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // L 12.5 22
                lineTo(x = 12.5f, y = 22.0f)
                // h 3z
                horizontalLineToRelative(dx = 3.0f)
                close()
                // M 11 22
                moveTo(x = 11.0f, y = 22.0f)
                // h 0.5
                horizontalLineToRelative(dx = 0.5f)
                // v 2.5
                verticalLineToRelative(dy = 2.5f)
                // L 8.051 24.5
                lineTo(x = 8.051f, y = 24.5f)
                // C 8.29 23.084 9.517 22 11 22z
                curveTo(
                    x1 = 8.29f,
                    y1 = 23.084f,
                    x2 = 9.517f,
                    y2 = 22.0f,
                    x3 = 11.0f,
                    y3 = 22.0f,
                )
                close()
                // M 11 28
                moveTo(x = 11.0f, y = 28.0f)
                // c -1.483 0 -2.71 -1.084 -2.949 -2.5
                curveToRelative(
                    dx1 = -1.483f,
                    dy1 = 0.0f,
                    dx2 = -2.71f,
                    dy2 = -1.084f,
                    dx3 = -2.949f,
                    dy3 = -2.5f,
                )
                // L 11.5 25.5
                lineTo(x = 11.5f, y = 25.5f)
                // L 11.5 28
                lineTo(x = 11.5f, y = 28.0f)
                // L 11 28z
                lineTo(x = 11.0f, y = 28.0f)
                close()
                // M 12.5 28
                moveTo(x = 12.5f, y = 28.0f)
                // v -2.5
                verticalLineToRelative(dy = -2.5f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // L 15.5 28
                lineTo(x = 15.5f, y = 28.0f)
                // h -3z
                horizontalLineToRelative(dx = -3.0f)
                close()
                // M 16.5 28
                moveTo(x = 16.5f, y = 28.0f)
                // v -2.5
                verticalLineToRelative(dy = -2.5f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // L 19.5 28
                lineTo(x = 19.5f, y = 28.0f)
                // h -3z
                horizontalLineToRelative(dx = -3.0f)
                close()
                // M 20.5 28
                moveTo(x = 20.5f, y = 28.0f)
                // v -2.5
                verticalLineToRelative(dy = -2.5f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // L 23.5 28
                lineTo(x = 23.5f, y = 28.0f)
                // h -3z
                horizontalLineToRelative(dx = -3.0f)
                close()
                // M 25 28
                moveTo(x = 25.0f, y = 28.0f)
                // h -0.5
                horizontalLineToRelative(dx = -0.5f)
                // v -2.5
                verticalLineToRelative(dy = -2.5f)
                // h 3.449
                horizontalLineToRelative(dx = 3.449f)
                // C 27.71 26.916 26.483 28 25 28z
                curveTo(
                    x1 = 27.71f,
                    y1 = 26.916f,
                    x2 = 26.483f,
                    y2 = 28.0f,
                    x3 = 25.0f,
                    y3 = 28.0f,
                )
                close()
            }
        }.build().also { _emoji1f62c = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f62c: ImageVector? = null
