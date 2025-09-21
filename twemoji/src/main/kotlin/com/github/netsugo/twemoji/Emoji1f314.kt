package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f314: ImageVector
    get() {
        val current = _emoji1f314
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f314",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 18 c0 9.941 -8.059 18 -18 18 -0.294 0 -0.58 -0.029 -0.87 -0.043 C11.239 33.393 7 26.332 7 18 7 9.669 11.239 2.607 17.13 0.044 17.42 0.03 17.706 0 18 0 c9.941 0 18 8.059 18 18z
            path(
                fill = SolidColor(Color(0xFFFFD983)),
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
                // c -0.294 0 -0.58 -0.029 -0.87 -0.043
                curveToRelative(
                    dx1 = -0.294f,
                    dy1 = 0.0f,
                    dx2 = -0.58f,
                    dy2 = -0.029f,
                    dx3 = -0.87f,
                    dy3 = -0.043f,
                )
                // C 11.239 33.393 7 26.332 7 18
                curveTo(
                    x1 = 11.239f,
                    y1 = 33.393f,
                    x2 = 7.0f,
                    y2 = 26.332f,
                    x3 = 7.0f,
                    y3 = 18.0f,
                )
                // C 7 9.669 11.239 2.607 17.13 0.044
                curveTo(
                    x1 = 7.0f,
                    y1 = 9.669f,
                    x2 = 11.239f,
                    y2 = 2.607f,
                    x3 = 17.13f,
                    y3 = 0.044f,
                )
                // C 17.42 0.03 17.706 0 18 0
                curveTo(
                    x1 = 17.42f,
                    y1 = 0.03f,
                    x2 = 17.706f,
                    y2 = 0.0f,
                    x3 = 18.0f,
                    y3 = 0.0f,
                )
                // c 9.941 0 18 8.059 18 18z
                curveToRelative(
                    dx1 = 9.941f,
                    dy1 = 0.0f,
                    dx2 = 18.0f,
                    dy2 = 8.059f,
                    dx3 = 18.0f,
                    dy3 = 18.0f,
                )
                close()
            }
            // M7 18 C7 9.669 11.239 2.607 17.13 0.044 7.596 0.501 0 8.353 0 18 c0 9.646 7.594 17.498 17.128 17.956 C11.238 33.391 7 26.331 7 18z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 7 18
                moveTo(x = 7.0f, y = 18.0f)
                // C 7 9.669 11.239 2.607 17.13 0.044
                curveTo(
                    x1 = 7.0f,
                    y1 = 9.669f,
                    x2 = 11.239f,
                    y2 = 2.607f,
                    x3 = 17.13f,
                    y3 = 0.044f,
                )
                // C 7.596 0.501 0 8.353 0 18
                curveTo(
                    x1 = 7.596f,
                    y1 = 0.501f,
                    x2 = 0.0f,
                    y2 = 8.353f,
                    x3 = 0.0f,
                    y3 = 18.0f,
                )
                // c 0 9.646 7.594 17.498 17.128 17.956
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 9.646f,
                    dx2 = 7.594f,
                    dy2 = 17.498f,
                    dx3 = 17.128f,
                    dy3 = 17.956f,
                )
                // C 11.238 33.391 7 26.331 7 18z
                curveTo(
                    x1 = 11.238f,
                    y1 = 33.391f,
                    x2 = 7.0f,
                    y2 = 26.331f,
                    x3 = 7.0f,
                    y3 = 18.0f,
                )
                close()
            }
            // M25.5 8.5 m-3.5 0 a3.5 3.5 0 1 1 7 0 a3.5 3.5 0 1 1 -7 0
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 25.5 8.5
                moveTo(x = 25.5f, y = 8.5f)
                // m -3.5 0
                moveToRelative(dx = -3.5f, dy = 0.0f)
                // a 3.5 3.5 0 1 1 7 0
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 7.0f,
                    dy1 = 0.0f,
                )
                // a 3.5 3.5 0 1 1 -7 0
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -7.0f,
                    dy1 = 0.0f,
                )
            }
            // M16 16 m-3 0 a3 3 0 1 1 6 0 a3 3 0 1 1 -6 0
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 16 16
                moveTo(x = 16.0f, y = 16.0f)
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
            // M14.5 27.5 m-3.5 0 a3.5 3.5 0 1 1 7 0 a3.5 3.5 0 1 1 -7 0
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 14.5 27.5
                moveTo(x = 14.5f, y = 27.5f)
                // m -3.5 0
                moveToRelative(dx = -3.5f, dy = 0.0f)
                // a 3.5 3.5 0 1 1 7 0
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 7.0f,
                    dy1 = 0.0f,
                )
                // a 3.5 3.5 0 1 1 -7 0
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -7.0f,
                    dy1 = 0.0f,
                )
            }
            // M15 6 m-2 0 a2 2 0 1 1 4 0 a2 2 0 1 1 -4 0
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 15 6
                moveTo(x = 15.0f, y = 6.0f)
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
            // M33 18 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 33 18
                moveTo(x = 33.0f, y = 18.0f)
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
            // M6 9 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFF5B6876)),
            ) {
                // M 6 9
                moveTo(x = 6.0f, y = 9.0f)
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
            // M21 31 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 21 31
                moveTo(x = 21.0f, y = 31.0f)
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
            // M4 19 m-2 0 a2 2 0 1 1 4 0 a2 2 0 1 1 -4 0
            path(
                fill = SolidColor(Color(0xFF5B6876)),
            ) {
                // M 4 19
                moveTo(x = 4.0f, y = 19.0f)
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
            // M26 23 m-2 0 a2 2 0 1 1 4 0 a2 2 0 1 1 -4 0
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 26 23
                moveTo(x = 26.0f, y = 23.0f)
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
        }.build().also { _emoji1f314 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f314: ImageVector? = null
