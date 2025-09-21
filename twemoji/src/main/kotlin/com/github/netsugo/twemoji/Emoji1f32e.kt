package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f32e: ImageVector
    get() {
        val current = _emoji1f32e
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f32e",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M12 7 C5.374 7 0 14.164 0 23 h6 v6 h17.119 c0.564 -1.854 0.881 -3.877 0.881 -6 0 -8.836 -5.373 -16 -12 -16z
            path(
                fill = SolidColor(Color(0xFFFFE8B6)),
            ) {
                // M 12 7
                moveTo(x = 12.0f, y = 7.0f)
                // C 5.374 7 0 14.164 0 23
                curveTo(
                    x1 = 5.374f,
                    y1 = 7.0f,
                    x2 = 0.0f,
                    y2 = 14.164f,
                    x3 = 0.0f,
                    y3 = 23.0f,
                )
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h 17.119
                horizontalLineToRelative(dx = 17.119f)
                // c 0.564 -1.854 0.881 -3.877 0.881 -6
                curveToRelative(
                    dx1 = 0.564f,
                    dy1 = -1.854f,
                    dx2 = 0.881f,
                    dy2 = -3.877f,
                    dx3 = 0.881f,
                    dy3 = -6.0f,
                )
                // c 0 -8.836 -5.373 -16 -12 -16z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -8.836f,
                    dx2 = -5.373f,
                    dy2 = -16.0f,
                    dx3 = -12.0f,
                    dy3 = -16.0f,
                )
                close()
            }
            // M29 21 h4.896 C33.156 13.11 28.118 7 22 7 c-6.627 0 -12 7.164 -12 16 0 2.123 0.317 4.146 0.88 6 H29 v-8z
            path(
                fill = SolidColor(Color(0xFFFFE8B6)),
            ) {
                // M 29 21
                moveTo(x = 29.0f, y = 21.0f)
                // h 4.896
                horizontalLineToRelative(dx = 4.896f)
                // C 33.156 13.11 28.118 7 22 7
                curveTo(
                    x1 = 33.156f,
                    y1 = 13.11f,
                    x2 = 28.118f,
                    y2 = 7.0f,
                    x3 = 22.0f,
                    y3 = 7.0f,
                )
                // c -6.627 0 -12 7.164 -12 16
                curveToRelative(
                    dx1 = -6.627f,
                    dy1 = 0.0f,
                    dx2 = -12.0f,
                    dy2 = 7.164f,
                    dx3 = -12.0f,
                    dy3 = 16.0f,
                )
                // c 0 2.123 0.317 4.146 0.88 6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.123f,
                    dx2 = 0.317f,
                    dy2 = 4.146f,
                    dx3 = 0.88f,
                    dy3 = 6.0f,
                )
                // H 29
                horizontalLineTo(x = 29.0f)
                // v -8z
                verticalLineToRelative(dy = -8.0f)
                close()
            }
            // M36 23 c0 -8.836 -5.373 -16 -12 -16 -6.626 0 -12 7.164 -12 16 0 2.123 0.317 4.146 0.88 6 H30 c3.314 0 6 -2.685 6 -6z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 36 23
                moveTo(x = 36.0f, y = 23.0f)
                // c 0 -8.836 -5.373 -16 -12 -16
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -8.836f,
                    dx2 = -5.373f,
                    dy2 = -16.0f,
                    dx3 = -12.0f,
                    dy3 = -16.0f,
                )
                // c -6.626 0 -12 7.164 -12 16
                curveToRelative(
                    dx1 = -6.626f,
                    dy1 = 0.0f,
                    dx2 = -12.0f,
                    dy2 = 7.164f,
                    dx3 = -12.0f,
                    dy3 = 16.0f,
                )
                // c 0 2.123 0.317 4.146 0.88 6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.123f,
                    dx2 = 0.317f,
                    dy2 = 4.146f,
                    dx3 = 0.88f,
                    dy3 = 6.0f,
                )
                // H 30
                horizontalLineTo(x = 30.0f)
                // c 3.314 0 6 -2.685 6 -6z
                curveToRelative(
                    dx1 = 3.314f,
                    dy1 = 0.0f,
                    dx2 = 6.0f,
                    dy2 = -2.685f,
                    dx3 = 6.0f,
                    dy3 = -6.0f,
                )
                close()
            }
            // M6 23 h10 v6 H6z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 6 23
                moveTo(x = 6.0f, y = 23.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // H 6z
                horizontalLineTo(x = 6.0f)
                close()
            }
            // M0 23 c0 -3.312 2.687 -6 6 -6 s6 2.687 6 6 c0 3.315 -2.687 6 -6 6 s-6 -2.685 -6 -6z
            path(
                fill = SolidColor(Color(0xFFFFE8B6)),
            ) {
                // M 0 23
                moveTo(x = 0.0f, y = 23.0f)
                // c 0 -3.312 2.687 -6 6 -6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.312f,
                    dx2 = 2.687f,
                    dy2 = -6.0f,
                    dx3 = 6.0f,
                    dy3 = -6.0f,
                )
                // s 6 2.687 6 6
                reflectiveCurveToRelative(
                    dx1 = 6.0f,
                    dy1 = 2.687f,
                    dx2 = 6.0f,
                    dy2 = 6.0f,
                )
                // c 0 3.315 -2.687 6 -6 6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.315f,
                    dx2 = -2.687f,
                    dy2 = 6.0f,
                    dx3 = -6.0f,
                    dy3 = 6.0f,
                )
                // s -6 -2.685 -6 -6z
                reflectiveCurveToRelative(
                    dx1 = -6.0f,
                    dy1 = -2.685f,
                    dx2 = -6.0f,
                    dy2 = -6.0f,
                )
                close()
            }
            // M14 7 C7.374 7 2 14.164 2 23 c0 2.21 1.791 4 4 4 s4 -1.79 4 -4 c0 -6.963 3.342 -12.871 8 -15.069 C16.747 7.339 15.405 7 14 7z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 14 7
                moveTo(x = 14.0f, y = 7.0f)
                // C 7.374 7 2 14.164 2 23
                curveTo(
                    x1 = 7.374f,
                    y1 = 7.0f,
                    x2 = 2.0f,
                    y2 = 14.164f,
                    x3 = 2.0f,
                    y3 = 23.0f,
                )
                // c 0 2.21 1.791 4 4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.21f,
                    dx2 = 1.791f,
                    dy2 = 4.0f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // s 4 -1.79 4 -4
                reflectiveCurveToRelative(
                    dx1 = 4.0f,
                    dy1 = -1.79f,
                    dx2 = 4.0f,
                    dy2 = -4.0f,
                )
                // c 0 -6.963 3.342 -12.871 8 -15.069
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -6.963f,
                    dx2 = 3.342f,
                    dy2 = -12.871f,
                    dx3 = 8.0f,
                    dy3 = -15.069f,
                )
                // C 16.747 7.339 15.405 7 14 7z
                curveTo(
                    x1 = 16.747f,
                    y1 = 7.339f,
                    x2 = 15.405f,
                    y2 = 7.0f,
                    x3 = 14.0f,
                    y3 = 7.0f,
                )
                close()
            }
            // M4 23 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFD99E82)),
            ) {
                // M 4 23
                moveTo(x = 4.0f, y = 23.0f)
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
            // M9.975 23.25 C9.855 22.541 9.243 22 8.5 22 c-0.18 0 -0.35 0.037 -0.51 0.095 0.002 -0.033 0.01 -0.063 0.01 -0.095 0 -1.104 -0.896 -2 -2 -2 s-2 0.896 -2 2 c0 0.525 0.207 1 0.539 1.357 -0.327 0.276 -0.539 0.682 -0.539 1.143 0 0.678 0.453 1.244 1.07 1.43 0.167 0.557 0.651 0.962 1.241 1.039 1.978 -0.156 3.54 -1.733 3.664 -3.719z
            path(
                fill = SolidColor(Color(0xFFC1694F)),
            ) {
                // M 9.975 23.25
                moveTo(x = 9.975f, y = 23.25f)
                // C 9.855 22.541 9.243 22 8.5 22
                curveTo(
                    x1 = 9.855f,
                    y1 = 22.541f,
                    x2 = 9.243f,
                    y2 = 22.0f,
                    x3 = 8.5f,
                    y3 = 22.0f,
                )
                // c -0.18 0 -0.35 0.037 -0.51 0.095
                curveToRelative(
                    dx1 = -0.18f,
                    dy1 = 0.0f,
                    dx2 = -0.35f,
                    dy2 = 0.037f,
                    dx3 = -0.51f,
                    dy3 = 0.095f,
                )
                // c 0.002 -0.033 0.01 -0.063 0.01 -0.095
                curveToRelative(
                    dx1 = 0.002f,
                    dy1 = -0.033f,
                    dx2 = 0.01f,
                    dy2 = -0.063f,
                    dx3 = 0.01f,
                    dy3 = -0.095f,
                )
                // c 0 -1.104 -0.896 -2 -2 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.104f,
                    dx2 = -0.896f,
                    dy2 = -2.0f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // s -2 0.896 -2 2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 0.896f,
                    dx2 = -2.0f,
                    dy2 = 2.0f,
                )
                // c 0 0.525 0.207 1 0.539 1.357
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.525f,
                    dx2 = 0.207f,
                    dy2 = 1.0f,
                    dx3 = 0.539f,
                    dy3 = 1.357f,
                )
                // c -0.327 0.276 -0.539 0.682 -0.539 1.143
                curveToRelative(
                    dx1 = -0.327f,
                    dy1 = 0.276f,
                    dx2 = -0.539f,
                    dy2 = 0.682f,
                    dx3 = -0.539f,
                    dy3 = 1.143f,
                )
                // c 0 0.678 0.453 1.244 1.07 1.43
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.678f,
                    dx2 = 0.453f,
                    dy2 = 1.244f,
                    dx3 = 1.07f,
                    dy3 = 1.43f,
                )
                // c 0.167 0.557 0.651 0.962 1.241 1.039
                curveToRelative(
                    dx1 = 0.167f,
                    dy1 = 0.557f,
                    dx2 = 0.651f,
                    dy2 = 0.962f,
                    dx3 = 1.241f,
                    dy3 = 1.039f,
                )
                // c 1.978 -0.156 3.54 -1.733 3.664 -3.719z
                curveToRelative(
                    dx1 = 1.978f,
                    dy1 = -0.156f,
                    dx2 = 3.54f,
                    dy2 = -1.733f,
                    dx3 = 3.664f,
                    dy3 = -3.719f,
                )
                close()
            }
            // M9.5 21 c-0.828 0 -1.5 0.672 -1.5 1.5 S8.672 24 9.5 24 c0.13 0 0.254 -0.021 0.375 -0.053 0.075 -0.305 0.125 -0.619 0.125 -0.947 0 -0.637 0.037 -1.261 0.091 -1.878 C9.91 21.044 9.711 21 9.5 21z
            path(
                fill = SolidColor(Color(0xFFD99E82)),
            ) {
                // M 9.5 21
                moveTo(x = 9.5f, y = 21.0f)
                // c -0.828 0 -1.5 0.672 -1.5 1.5
                curveToRelative(
                    dx1 = -0.828f,
                    dy1 = 0.0f,
                    dx2 = -1.5f,
                    dy2 = 0.672f,
                    dx3 = -1.5f,
                    dy3 = 1.5f,
                )
                // S 8.672 24 9.5 24
                reflectiveCurveTo(
                    x1 = 8.672f,
                    y1 = 24.0f,
                    x2 = 9.5f,
                    y2 = 24.0f,
                )
                // c 0.13 0 0.254 -0.021 0.375 -0.053
                curveToRelative(
                    dx1 = 0.13f,
                    dy1 = 0.0f,
                    dx2 = 0.254f,
                    dy2 = -0.021f,
                    dx3 = 0.375f,
                    dy3 = -0.053f,
                )
                // c 0.075 -0.305 0.125 -0.619 0.125 -0.947
                curveToRelative(
                    dx1 = 0.075f,
                    dy1 = -0.305f,
                    dx2 = 0.125f,
                    dy2 = -0.619f,
                    dx3 = 0.125f,
                    dy3 = -0.947f,
                )
                // c 0 -0.637 0.037 -1.261 0.091 -1.878
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.637f,
                    dx2 = 0.037f,
                    dy2 = -1.261f,
                    dx3 = 0.091f,
                    dy3 = -1.878f,
                )
                // C 9.91 21.044 9.711 21 9.5 21z
                curveTo(
                    x1 = 9.91f,
                    y1 = 21.044f,
                    x2 = 9.711f,
                    y2 = 21.0f,
                    x3 = 9.5f,
                    y3 = 21.0f,
                )
                close()
            }
            // M5 20 a1.5 1 0 1 0 3 0 a1.5 1 0 1 0 -3 0z
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 5 20
                moveTo(x = 5.0f, y = 20.0f)
                // a 1.5 1 0 1 0 3 0
                arcToRelative(
                    a = 1.5f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 3.0f,
                    dy1 = 0.0f,
                )
                // a 1.5 1 0 1 0 -3 0z
                arcToRelative(
                    a = 1.5f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M7 21 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 7 21
                moveTo(x = 7.0f, y = 21.0f)
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
            // M9 21 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFC1694F)),
            ) {
                // M 9 21
                moveTo(x = 9.0f, y = 21.0f)
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
            // M5 22 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFD99E82)),
            ) {
                // M 5 22
                moveTo(x = 5.0f, y = 22.0f)
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
            // M7 22 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFD99E82)),
            ) {
                // M 7 22
                moveTo(x = 7.0f, y = 22.0f)
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
            // M8 20 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFFFD983)),
            ) {
                // M 8 20
                moveTo(x = 8.0f, y = 20.0f)
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
            // M7 18 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFFFE8B6)),
            ) {
                // M 7 18
                moveTo(x = 7.0f, y = 18.0f)
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
            // M6 20 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFFFE8B6)),
            ) {
                // M 6 20
                moveTo(x = 6.0f, y = 20.0f)
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
            // M9 18 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFFFD983)),
            ) {
                // M 9 18
                moveTo(x = 9.0f, y = 18.0f)
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
            // M9 20 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFFFD983)),
            ) {
                // M 9 20
                moveTo(x = 9.0f, y = 20.0f)
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
            // M9 19 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFFFD983)),
            ) {
                // M 9 19
                moveTo(x = 9.0f, y = 19.0f)
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
            // M9 19 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFFFE8B6)),
            ) {
                // M 9 19
                moveTo(x = 9.0f, y = 19.0f)
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
            // M10.572 12.453 C10.3 12.174 9.921 12 9.5 12 c-0.738 0 -1.348 0.533 -1.473 1.235 -0.215 -0.139 -0.478 -0.235 -0.777 -0.235 -0.69 0 -1.25 0.448 -1.25 1 0 0.19 0.084 0.358 0.2 0.51 -0.123 0.146 -0.2 0.311 -0.2 0.49 -0.552 0 -1 0.448 -1 1 0 0.202 0.075 0.379 0.178 0.537 -0.11 0.139 -0.178 0.295 -0.178 0.463 0 0.552 0.671 1 1.5 1 0.43 0 0.815 -0.122 1.089 -0.316 0.254 0.195 0.567 0.316 0.911 0.316 0.198 0 0.385 -0.041 0.558 -0.11 0.163 0.602 0.69 1.042 1.331 1.091 0.495 -2.544 1.45 -4.835 2.738 -6.72 C12.806 12.097 12.419 12 12 12 c-0.56 0 -1.065 0.174 -1.428 0.453z
            path(
                fill = SolidColor(Color(0xFF77B255)),
            ) {
                // M 10.572 12.453
                moveTo(x = 10.572f, y = 12.453f)
                // C 10.3 12.174 9.921 12 9.5 12
                curveTo(
                    x1 = 10.3f,
                    y1 = 12.174f,
                    x2 = 9.921f,
                    y2 = 12.0f,
                    x3 = 9.5f,
                    y3 = 12.0f,
                )
                // c -0.738 0 -1.348 0.533 -1.473 1.235
                curveToRelative(
                    dx1 = -0.738f,
                    dy1 = 0.0f,
                    dx2 = -1.348f,
                    dy2 = 0.533f,
                    dx3 = -1.473f,
                    dy3 = 1.235f,
                )
                // c -0.215 -0.139 -0.478 -0.235 -0.777 -0.235
                curveToRelative(
                    dx1 = -0.215f,
                    dy1 = -0.139f,
                    dx2 = -0.478f,
                    dy2 = -0.235f,
                    dx3 = -0.777f,
                    dy3 = -0.235f,
                )
                // c -0.69 0 -1.25 0.448 -1.25 1
                curveToRelative(
                    dx1 = -0.69f,
                    dy1 = 0.0f,
                    dx2 = -1.25f,
                    dy2 = 0.448f,
                    dx3 = -1.25f,
                    dy3 = 1.0f,
                )
                // c 0 0.19 0.084 0.358 0.2 0.51
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.19f,
                    dx2 = 0.084f,
                    dy2 = 0.358f,
                    dx3 = 0.2f,
                    dy3 = 0.51f,
                )
                // c -0.123 0.146 -0.2 0.311 -0.2 0.49
                curveToRelative(
                    dx1 = -0.123f,
                    dy1 = 0.146f,
                    dx2 = -0.2f,
                    dy2 = 0.311f,
                    dx3 = -0.2f,
                    dy3 = 0.49f,
                )
                // c -0.552 0 -1 0.448 -1 1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = 0.448f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // c 0 0.202 0.075 0.379 0.178 0.537
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.202f,
                    dx2 = 0.075f,
                    dy2 = 0.379f,
                    dx3 = 0.178f,
                    dy3 = 0.537f,
                )
                // c -0.11 0.139 -0.178 0.295 -0.178 0.463
                curveToRelative(
                    dx1 = -0.11f,
                    dy1 = 0.139f,
                    dx2 = -0.178f,
                    dy2 = 0.295f,
                    dx3 = -0.178f,
                    dy3 = 0.463f,
                )
                // c 0 0.552 0.671 1 1.5 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = 0.671f,
                    dy2 = 1.0f,
                    dx3 = 1.5f,
                    dy3 = 1.0f,
                )
                // c 0.43 0 0.815 -0.122 1.089 -0.316
                curveToRelative(
                    dx1 = 0.43f,
                    dy1 = 0.0f,
                    dx2 = 0.815f,
                    dy2 = -0.122f,
                    dx3 = 1.089f,
                    dy3 = -0.316f,
                )
                // c 0.254 0.195 0.567 0.316 0.911 0.316
                curveToRelative(
                    dx1 = 0.254f,
                    dy1 = 0.195f,
                    dx2 = 0.567f,
                    dy2 = 0.316f,
                    dx3 = 0.911f,
                    dy3 = 0.316f,
                )
                // c 0.198 0 0.385 -0.041 0.558 -0.11
                curveToRelative(
                    dx1 = 0.198f,
                    dy1 = 0.0f,
                    dx2 = 0.385f,
                    dy2 = -0.041f,
                    dx3 = 0.558f,
                    dy3 = -0.11f,
                )
                // c 0.163 0.602 0.69 1.042 1.331 1.091
                curveToRelative(
                    dx1 = 0.163f,
                    dy1 = 0.602f,
                    dx2 = 0.69f,
                    dy2 = 1.042f,
                    dx3 = 1.331f,
                    dy3 = 1.091f,
                )
                // c 0.495 -2.544 1.45 -4.835 2.738 -6.72
                curveToRelative(
                    dx1 = 0.495f,
                    dy1 = -2.544f,
                    dx2 = 1.45f,
                    dy2 = -4.835f,
                    dx3 = 2.738f,
                    dy3 = -6.72f,
                )
                // C 12.806 12.097 12.419 12 12 12
                curveTo(
                    x1 = 12.806f,
                    y1 = 12.097f,
                    x2 = 12.419f,
                    y2 = 12.0f,
                    x3 = 12.0f,
                    y3 = 12.0f,
                )
                // c -0.56 0 -1.065 0.174 -1.428 0.453z
                curveToRelative(
                    dx1 = -0.56f,
                    dy1 = 0.0f,
                    dx2 = -1.065f,
                    dy2 = 0.174f,
                    dx3 = -1.428f,
                    dy3 = 0.453f,
                )
                close()
            }
            // M8 15 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFA6D388)),
            ) {
                // M 8 15
                moveTo(x = 8.0f, y = 15.0f)
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
            // M10 13.5 c0 0.276 -0.224 0.5 -0.5 0.5 s-0.5 -0.223 -0.5 -0.5 c0 -0.276 0.224 -0.5 0.5 -0.5 s0.5 0.224 0.5 0.5z
            path(
                fill = SolidColor(Color(0xFFA6D388)),
            ) {
                // M 10 13.5
                moveTo(x = 10.0f, y = 13.5f)
                // c 0 0.276 -0.224 0.5 -0.5 0.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.276f,
                    dx2 = -0.224f,
                    dy2 = 0.5f,
                    dx3 = -0.5f,
                    dy3 = 0.5f,
                )
                // s -0.5 -0.223 -0.5 -0.5
                reflectiveCurveToRelative(
                    dx1 = -0.5f,
                    dy1 = -0.223f,
                    dx2 = -0.5f,
                    dy2 = -0.5f,
                )
                // c 0 -0.276 0.224 -0.5 0.5 -0.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.276f,
                    dx2 = 0.224f,
                    dy2 = -0.5f,
                    dx3 = 0.5f,
                    dy3 = -0.5f,
                )
                // s 0.5 0.224 0.5 0.5z
                reflectiveCurveToRelative(
                    dx1 = 0.5f,
                    dy1 = 0.224f,
                    dx2 = 0.5f,
                    dy2 = 0.5f,
                )
                close()
            }
            // M6.5 16.5 m-0.5 0 a0.5 0.5 0 1 1 1 0 a0.5 0.5 0 1 1 -1 0
            path(
                fill = SolidColor(Color(0xFFA6D388)),
            ) {
                // M 6.5 16.5
                moveTo(x = 6.5f, y = 16.5f)
                // m -0.5 0
                moveToRelative(dx = -0.5f, dy = 0.0f)
                // a 0.5 0.5 0 1 1 1 0
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                )
                // a 0.5 0.5 0 1 1 -1 0
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                )
            }
            // M10 16.5 c0 0.276 -0.224 0.5 -0.5 0.5 s-0.5 -0.223 -0.5 -0.5 0.224 -0.5 0.5 -0.5 0.5 0.224 0.5 0.5z
            path(
                fill = SolidColor(Color(0xFFA6D388)),
            ) {
                // M 10 16.5
                moveTo(x = 10.0f, y = 16.5f)
                // c 0 0.276 -0.224 0.5 -0.5 0.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.276f,
                    dx2 = -0.224f,
                    dy2 = 0.5f,
                    dx3 = -0.5f,
                    dy3 = 0.5f,
                )
                // s -0.5 -0.223 -0.5 -0.5
                reflectiveCurveToRelative(
                    dx1 = -0.5f,
                    dy1 = -0.223f,
                    dx2 = -0.5f,
                    dy2 = -0.5f,
                )
                // s 0.224 -0.5 0.5 -0.5
                reflectiveCurveToRelative(
                    dx1 = 0.224f,
                    dy1 = -0.5f,
                    dx2 = 0.5f,
                    dy2 = -0.5f,
                )
                // s 0.5 0.224 0.5 0.5z
                reflectiveCurveToRelative(
                    dx1 = 0.5f,
                    dy1 = 0.224f,
                    dx2 = 0.5f,
                    dy2 = 0.5f,
                )
                close()
            }
            // M10 15 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFA6D388)),
            ) {
                // M 10 15
                moveTo(x = 10.0f, y = 15.0f)
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
            // M9 12 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 9 12
                moveTo(x = 9.0f, y = 12.0f)
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
            // M11 12 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFFFD983)),
            ) {
                // M 11 12
                moveTo(x = 11.0f, y = 12.0f)
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
            // M12 10 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFFFD983)),
            ) {
                // M 12 10
                moveTo(x = 12.0f, y = 10.0f)
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
            // M9 14 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFFFD983)),
            ) {
                // M 9 14
                moveTo(x = 9.0f, y = 14.0f)
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
            // M15 9 c-0.552 0 -1 0.448 -1 1 0 0.035 0.016 0.064 0.02 0.098 -0.162 -0.06 -0.336 -0.098 -0.52 -0.098 -0.829 0 -1.5 0.671 -1.5 1.5 0 0.561 0.311 1.043 0.767 1.301 0.845 -1.354 1.856 -2.513 2.989 -3.436 C15.573 9.147 15.308 9 15 9z
            path(
                fill = SolidColor(Color(0xFFA6D388)),
            ) {
                // M 15 9
                moveTo(x = 15.0f, y = 9.0f)
                // c -0.552 0 -1 0.448 -1 1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = 0.448f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // c 0 0.035 0.016 0.064 0.02 0.098
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.035f,
                    dx2 = 0.016f,
                    dy2 = 0.064f,
                    dx3 = 0.02f,
                    dy3 = 0.098f,
                )
                // c -0.162 -0.06 -0.336 -0.098 -0.52 -0.098
                curveToRelative(
                    dx1 = -0.162f,
                    dy1 = -0.06f,
                    dx2 = -0.336f,
                    dy2 = -0.098f,
                    dx3 = -0.52f,
                    dy3 = -0.098f,
                )
                // c -0.829 0 -1.5 0.671 -1.5 1.5
                curveToRelative(
                    dx1 = -0.829f,
                    dy1 = 0.0f,
                    dx2 = -1.5f,
                    dy2 = 0.671f,
                    dx3 = -1.5f,
                    dy3 = 1.5f,
                )
                // c 0 0.561 0.311 1.043 0.767 1.301
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.561f,
                    dx2 = 0.311f,
                    dy2 = 1.043f,
                    dx3 = 0.767f,
                    dy3 = 1.301f,
                )
                // c 0.845 -1.354 1.856 -2.513 2.989 -3.436
                curveToRelative(
                    dx1 = 0.845f,
                    dy1 = -1.354f,
                    dx2 = 1.856f,
                    dy2 = -2.513f,
                    dx3 = 2.989f,
                    dy3 = -3.436f,
                )
                // C 15.573 9.147 15.308 9 15 9z
                curveTo(
                    x1 = 15.573f,
                    y1 = 9.147f,
                    x2 = 15.308f,
                    y2 = 9.0f,
                    x3 = 15.0f,
                    y3 = 9.0f,
                )
                close()
            }
            // M12 11 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 12 11
                moveTo(x = 12.0f, y = 11.0f)
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
            // M13.8398 9.9871 a1 1 84.3666 1 0 0.3204 -1.9742 a1 1 84.3666 1 0 -0.3204 1.9742z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 13.8398 9.9871
                moveTo(x = 13.8398f, y = 9.9871f)
                // a 1 1 84.3666 1 0 0.3204 -1.9742
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 84.3666f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 0.3204f,
                    dy1 = -1.9742f,
                )
                // a 1 1 84.3666 1 0 -0.3204 1.9742z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 84.3666f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -0.3204f,
                    dy1 = 1.9742f,
                )
                close()
            }
            // M17 25 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 17 25
                moveTo(x = 17.0f, y = 25.0f)
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
            // M13 28 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 13 28
                moveTo(x = 13.0f, y = 28.0f)
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
            // M19 28 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 19 28
                moveTo(x = 19.0f, y = 28.0f)
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
            // M22 27 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 22 27
                moveTo(x = 22.0f, y = 27.0f)
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
            // M26 27 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 26 27
                moveTo(x = 26.0f, y = 27.0f)
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
            // M29 28 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 29 28
                moveTo(x = 29.0f, y = 28.0f)
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
            // M31 26 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 31 26
                moveTo(x = 31.0f, y = 26.0f)
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
            // M21 22 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 21 22
                moveTo(x = 21.0f, y = 22.0f)
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
            // M15 22 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 15 22
                moveTo(x = 15.0f, y = 22.0f)
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
            // M34 24 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 34 24
                moveTo(x = 34.0f, y = 24.0f)
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
            // M17 18 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 17 18
                moveTo(x = 17.0f, y = 18.0f)
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
            // M22 16 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 22 16
                moveTo(x = 22.0f, y = 16.0f)
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
            // M20 12 c0 0.552 -0.447 1 -1 1 -0.552 0 -1 -0.448 -1 -1 s0.448 -1 1 -1 c0.553 0 1 0.448 1 1z
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 20 12
                moveTo(x = 20.0f, y = 12.0f)
                // c 0 0.552 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // c -0.552 0 -1 -0.448 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.448f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // s 0.448 -1 1 -1
                reflectiveCurveToRelative(
                    dx1 = 0.448f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // c 0.553 0 1 0.448 1 1z
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.448f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                close()
            }
            // M27 13 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 27 13
                moveTo(x = 27.0f, y = 13.0f)
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
            // M24 10 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 24 10
                moveTo(x = 24.0f, y = 10.0f)
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
            // M31 19 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 31 19
                moveTo(x = 31.0f, y = 19.0f)
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
            // M26 19 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 26 19
                moveTo(x = 26.0f, y = 19.0f)
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
            // M24 23 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 24 23
                moveTo(x = 24.0f, y = 23.0f)
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
            // M29 22 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 29 22
                moveTo(x = 29.0f, y = 22.0f)
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
        }.build().also { _emoji1f32e = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f32e: ImageVector? = null
