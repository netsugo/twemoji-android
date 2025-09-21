package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f9a7: ImageVector
    get() {
        val current = _emoji1f9a7
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f9a7",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 32 c0 -12 -2 -28 -18 -28 S0 20 0 32 h8 v-5 c0 -1 1 -1 1 0 0 7 4 6 4 6 l2 2 1 -1 c0 -0.552 1.448 -1 2 -1 s2 0.448 2 1 l1 1 2 -2 s4 1 4 -6 c0 -1 1 -1 1 0 v5 h8z
            path(
                fill = SolidColor(Color(0xFFE26000)),
            ) {
                // M 36 32
                moveTo(x = 36.0f, y = 32.0f)
                // c 0 -12 -2 -28 -18 -28
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -12.0f,
                    dx2 = -2.0f,
                    dy2 = -28.0f,
                    dx3 = -18.0f,
                    dy3 = -28.0f,
                )
                // S 0 20 0 32
                reflectiveCurveTo(
                    x1 = 0.0f,
                    y1 = 20.0f,
                    x2 = 0.0f,
                    y2 = 32.0f,
                )
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // c 0 -1 1 -1 1 0
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = 0.0f,
                )
                // c 0 7 4 6 4 6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 7.0f,
                    dx2 = 4.0f,
                    dy2 = 6.0f,
                    dx3 = 4.0f,
                    dy3 = 6.0f,
                )
                // l 2 2
                lineToRelative(dx = 2.0f, dy = 2.0f)
                // l 1 -1
                lineToRelative(dx = 1.0f, dy = -1.0f)
                // c 0 -0.552 1.448 -1 2 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = 1.448f,
                    dy2 = -1.0f,
                    dx3 = 2.0f,
                    dy3 = -1.0f,
                )
                // s 2 0.448 2 1
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.448f,
                    dx2 = 2.0f,
                    dy2 = 1.0f,
                )
                // l 1 1
                lineToRelative(dx = 1.0f, dy = 1.0f)
                // l 2 -2
                lineToRelative(dx = 2.0f, dy = -2.0f)
                // s 4 1 4 -6
                reflectiveCurveToRelative(
                    dx1 = 4.0f,
                    dy1 = 1.0f,
                    dx2 = 4.0f,
                    dy2 = -6.0f,
                )
                // c 0 -1 1 -1 1 0
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = 0.0f,
                )
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h 8z
                horizontalLineToRelative(dx = 8.0f)
                close()
            }
            // M18 13.5 m-11.5 0 a11.5 11.5 0 1 1 23 0 a11.5 11.5 0 1 1 -23 0
            path(
                fill = SolidColor(Color(0xFFE26000)),
            ) {
                // M 18 13.5
                moveTo(x = 18.0f, y = 13.5f)
                // m -11.5 0
                moveToRelative(dx = -11.5f, dy = 0.0f)
                // a 11.5 11.5 0 1 1 23 0
                arcToRelative(
                    a = 11.5f,
                    b = 11.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 23.0f,
                    dy1 = 0.0f,
                )
                // a 11.5 11.5 0 1 1 -23 0
                arcToRelative(
                    a = 11.5f,
                    b = 11.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -23.0f,
                    dy1 = 0.0f,
                )
            }
            // M32 31 c-3 0 -4 1 -4 1 v1 c0 0.552 0.448 1 1 1 s1 -0.448 1 -1 c0 0.552 0.448 1 1 1 s1 -0.448 1 -1 c0 0.552 0.448 1 1 1 s1 -0.448 1 -1 c0 0.552 0.448 1 1 1 s1 -0.448 1 -1 v-1 s-1 -1 -4 -1z M4 31 c-3 0 -4 1 -4 1 v1 c0 0.552 0.448 1 1 1 s1 -0.448 1 -1 c0 0.552 0.448 1 1 1 s1 -0.448 1 -1 c0 0.552 0.448 1 1 1 s1 -0.448 1 -1 c0 0.552 0.448 1 1 1 s1 -0.448 1 -1 v-1 s-1 -1 -4 -1z
            path(
                fill = SolidColor(Color(0xFFD9B981)),
            ) {
                // M 32 31
                moveTo(x = 32.0f, y = 31.0f)
                // c -3 0 -4 1 -4 1
                curveToRelative(
                    dx1 = -3.0f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = 1.0f,
                    dx3 = -4.0f,
                    dy3 = 1.0f,
                )
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // c 0 0.552 0.448 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = 0.448f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // s 1 -0.448 1 -1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = -0.448f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // c 0 0.552 0.448 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = 0.448f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // s 1 -0.448 1 -1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = -0.448f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // c 0 0.552 0.448 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = 0.448f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // s 1 -0.448 1 -1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = -0.448f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // c 0 0.552 0.448 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = 0.448f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // s 1 -0.448 1 -1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = -0.448f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // s -1 -1 -4 -1z
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                    dx2 = -4.0f,
                    dy2 = -1.0f,
                )
                close()
                // M 4 31
                moveTo(x = 4.0f, y = 31.0f)
                // c -3 0 -4 1 -4 1
                curveToRelative(
                    dx1 = -3.0f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = 1.0f,
                    dx3 = -4.0f,
                    dy3 = 1.0f,
                )
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // c 0 0.552 0.448 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = 0.448f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // s 1 -0.448 1 -1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = -0.448f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // c 0 0.552 0.448 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = 0.448f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // s 1 -0.448 1 -1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = -0.448f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // c 0 0.552 0.448 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = 0.448f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // s 1 -0.448 1 -1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = -0.448f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // c 0 0.552 0.448 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = 0.448f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // s 1 -0.448 1 -1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = -0.448f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // s -1 -1 -4 -1z
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                    dx2 = -4.0f,
                    dy2 = -1.0f,
                )
                close()
            }
            // M6.5 19.607 C6.5 25.051 14.167 27 18 27 s11.5 -1.949 11.5 -7.393 c0 -2.366 -0.974 -4.536 -2.595 -6.235 0.023 -0.244 0.04 -0.491 0.04 -0.747 C26.944 7.862 24.9 4 18 4 s-8.944 3.862 -8.944 8.625 c0 0.256 0.017 0.503 0.04 0.747 C7.474 15.071 6.5 17.241 6.5 19.607z
            path(
                fill = SolidColor(Color(0xFFC45400)),
            ) {
                // M 6.5 19.607
                moveTo(x = 6.5f, y = 19.607f)
                // C 6.5 25.051 14.167 27 18 27
                curveTo(
                    x1 = 6.5f,
                    y1 = 25.051f,
                    x2 = 14.167f,
                    y2 = 27.0f,
                    x3 = 18.0f,
                    y3 = 27.0f,
                )
                // s 11.5 -1.949 11.5 -7.393
                reflectiveCurveToRelative(
                    dx1 = 11.5f,
                    dy1 = -1.949f,
                    dx2 = 11.5f,
                    dy2 = -7.393f,
                )
                // c 0 -2.366 -0.974 -4.536 -2.595 -6.235
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.366f,
                    dx2 = -0.974f,
                    dy2 = -4.536f,
                    dx3 = -2.595f,
                    dy3 = -6.235f,
                )
                // c 0.023 -0.244 0.04 -0.491 0.04 -0.747
                curveToRelative(
                    dx1 = 0.023f,
                    dy1 = -0.244f,
                    dx2 = 0.04f,
                    dy2 = -0.491f,
                    dx3 = 0.04f,
                    dy3 = -0.747f,
                )
                // C 26.944 7.862 24.9 4 18 4
                curveTo(
                    x1 = 26.944f,
                    y1 = 7.862f,
                    x2 = 24.9f,
                    y2 = 4.0f,
                    x3 = 18.0f,
                    y3 = 4.0f,
                )
                // s -8.944 3.862 -8.944 8.625
                reflectiveCurveToRelative(
                    dx1 = -8.944f,
                    dy1 = 3.862f,
                    dx2 = -8.944f,
                    dy2 = 8.625f,
                )
                // c 0 0.256 0.017 0.503 0.04 0.747
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.256f,
                    dx2 = 0.017f,
                    dy2 = 0.503f,
                    dx3 = 0.04f,
                    dy3 = 0.747f,
                )
                // C 7.474 15.071 6.5 17.241 6.5 19.607z
                curveTo(
                    x1 = 7.474f,
                    y1 = 15.071f,
                    x2 = 6.5f,
                    y2 = 17.241f,
                    x3 = 6.5f,
                    y3 = 19.607f,
                )
                close()
            }
            // M8 17.571 C8 22.305 14.667 24 18 24 s10 -1.695 10 -6.429 c0 -2.057 -0.847 -3.944 -2.257 -5.422 0.02 -0.212 0.035 -0.427 0.035 -0.65 C25.778 7.358 24 4 18 4 s-7.778 3.358 -7.778 7.5 c0 0.223 0.015 0.438 0.035 0.65 C8.847 13.627 8 15.514 8 17.571z
            path(
                fill = SolidColor(Color(0xFFD9B981)),
            ) {
                // M 8 17.571
                moveTo(x = 8.0f, y = 17.571f)
                // C 8 22.305 14.667 24 18 24
                curveTo(
                    x1 = 8.0f,
                    y1 = 22.305f,
                    x2 = 14.667f,
                    y2 = 24.0f,
                    x3 = 18.0f,
                    y3 = 24.0f,
                )
                // s 10 -1.695 10 -6.429
                reflectiveCurveToRelative(
                    dx1 = 10.0f,
                    dy1 = -1.695f,
                    dx2 = 10.0f,
                    dy2 = -6.429f,
                )
                // c 0 -2.057 -0.847 -3.944 -2.257 -5.422
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.057f,
                    dx2 = -0.847f,
                    dy2 = -3.944f,
                    dx3 = -2.257f,
                    dy3 = -5.422f,
                )
                // c 0.02 -0.212 0.035 -0.427 0.035 -0.65
                curveToRelative(
                    dx1 = 0.02f,
                    dy1 = -0.212f,
                    dx2 = 0.035f,
                    dy2 = -0.427f,
                    dx3 = 0.035f,
                    dy3 = -0.65f,
                )
                // C 25.778 7.358 24 4 18 4
                curveTo(
                    x1 = 25.778f,
                    y1 = 7.358f,
                    x2 = 24.0f,
                    y2 = 4.0f,
                    x3 = 18.0f,
                    y3 = 4.0f,
                )
                // s -7.778 3.358 -7.778 7.5
                reflectiveCurveToRelative(
                    dx1 = -7.778f,
                    dy1 = 3.358f,
                    dx2 = -7.778f,
                    dy2 = 7.5f,
                )
                // c 0 0.223 0.015 0.438 0.035 0.65
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.223f,
                    dx2 = 0.015f,
                    dy2 = 0.438f,
                    dx3 = 0.035f,
                    dy3 = 0.65f,
                )
                // C 8.847 13.627 8 15.514 8 17.571z
                curveTo(
                    x1 = 8.847f,
                    y1 = 13.627f,
                    x2 = 8.0f,
                    y2 = 15.514f,
                    x3 = 8.0f,
                    y3 = 17.571f,
                )
                close()
            }
            // M16 11 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 16 11
                moveTo(x = 16.0f, y = 11.0f)
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
            // M20 11 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 20 11
                moveTo(x = 20.0f, y = 11.0f)
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
            // M12.67 11.073 c-0.042 0 -0.084 -0.005 -0.127 -0.016 -0.267 -0.07 -0.427 -0.343 -0.357 -0.61 0.488 -1.867 2.405 -2.988 4.271 -2.503 0.267 0.07 0.427 0.343 0.357 0.61 -0.07 0.267 -0.343 0.424 -0.61 0.357 -1.332 -0.347 -2.702 0.455 -3.05 1.788 -0.059 0.225 -0.262 0.374 -0.484 0.374z M23.33 11.073 c-0.223 0 -0.425 -0.149 -0.483 -0.374 -0.169 -0.646 -0.579 -1.188 -1.155 -1.525 -0.576 -0.339 -1.249 -0.432 -1.896 -0.262 -0.269 0.069 -0.54 -0.091 -0.609 -0.357 -0.07 -0.268 0.09 -0.541 0.357 -0.61 0.901 -0.236 1.846 -0.106 2.653 0.367 0.807 0.473 1.381 1.231 1.616 2.136 0.07 0.267 -0.09 0.54 -0.357 0.61 -0.042 0.009 -0.085 0.015 -0.126 0.015z
            path(
                fill = SolidColor(Color(0xFFFFE8B6)),
            ) {
                // M 12.67 11.073
                moveTo(x = 12.67f, y = 11.073f)
                // c -0.042 0 -0.084 -0.005 -0.127 -0.016
                curveToRelative(
                    dx1 = -0.042f,
                    dy1 = 0.0f,
                    dx2 = -0.084f,
                    dy2 = -0.005f,
                    dx3 = -0.127f,
                    dy3 = -0.016f,
                )
                // c -0.267 -0.07 -0.427 -0.343 -0.357 -0.61
                curveToRelative(
                    dx1 = -0.267f,
                    dy1 = -0.07f,
                    dx2 = -0.427f,
                    dy2 = -0.343f,
                    dx3 = -0.357f,
                    dy3 = -0.61f,
                )
                // c 0.488 -1.867 2.405 -2.988 4.271 -2.503
                curveToRelative(
                    dx1 = 0.488f,
                    dy1 = -1.867f,
                    dx2 = 2.405f,
                    dy2 = -2.988f,
                    dx3 = 4.271f,
                    dy3 = -2.503f,
                )
                // c 0.267 0.07 0.427 0.343 0.357 0.61
                curveToRelative(
                    dx1 = 0.267f,
                    dy1 = 0.07f,
                    dx2 = 0.427f,
                    dy2 = 0.343f,
                    dx3 = 0.357f,
                    dy3 = 0.61f,
                )
                // c -0.07 0.267 -0.343 0.424 -0.61 0.357
                curveToRelative(
                    dx1 = -0.07f,
                    dy1 = 0.267f,
                    dx2 = -0.343f,
                    dy2 = 0.424f,
                    dx3 = -0.61f,
                    dy3 = 0.357f,
                )
                // c -1.332 -0.347 -2.702 0.455 -3.05 1.788
                curveToRelative(
                    dx1 = -1.332f,
                    dy1 = -0.347f,
                    dx2 = -2.702f,
                    dy2 = 0.455f,
                    dx3 = -3.05f,
                    dy3 = 1.788f,
                )
                // c -0.059 0.225 -0.262 0.374 -0.484 0.374z
                curveToRelative(
                    dx1 = -0.059f,
                    dy1 = 0.225f,
                    dx2 = -0.262f,
                    dy2 = 0.374f,
                    dx3 = -0.484f,
                    dy3 = 0.374f,
                )
                close()
                // M 23.33 11.073
                moveTo(x = 23.33f, y = 11.073f)
                // c -0.223 0 -0.425 -0.149 -0.483 -0.374
                curveToRelative(
                    dx1 = -0.223f,
                    dy1 = 0.0f,
                    dx2 = -0.425f,
                    dy2 = -0.149f,
                    dx3 = -0.483f,
                    dy3 = -0.374f,
                )
                // c -0.169 -0.646 -0.579 -1.188 -1.155 -1.525
                curveToRelative(
                    dx1 = -0.169f,
                    dy1 = -0.646f,
                    dx2 = -0.579f,
                    dy2 = -1.188f,
                    dx3 = -1.155f,
                    dy3 = -1.525f,
                )
                // c -0.576 -0.339 -1.249 -0.432 -1.896 -0.262
                curveToRelative(
                    dx1 = -0.576f,
                    dy1 = -0.339f,
                    dx2 = -1.249f,
                    dy2 = -0.432f,
                    dx3 = -1.896f,
                    dy3 = -0.262f,
                )
                // c -0.269 0.069 -0.54 -0.091 -0.609 -0.357
                curveToRelative(
                    dx1 = -0.269f,
                    dy1 = 0.069f,
                    dx2 = -0.54f,
                    dy2 = -0.091f,
                    dx3 = -0.609f,
                    dy3 = -0.357f,
                )
                // c -0.07 -0.268 0.09 -0.541 0.357 -0.61
                curveToRelative(
                    dx1 = -0.07f,
                    dy1 = -0.268f,
                    dx2 = 0.09f,
                    dy2 = -0.541f,
                    dx3 = 0.357f,
                    dy3 = -0.61f,
                )
                // c 0.901 -0.236 1.846 -0.106 2.653 0.367
                curveToRelative(
                    dx1 = 0.901f,
                    dy1 = -0.236f,
                    dx2 = 1.846f,
                    dy2 = -0.106f,
                    dx3 = 2.653f,
                    dy3 = 0.367f,
                )
                // c 0.807 0.473 1.381 1.231 1.616 2.136
                curveToRelative(
                    dx1 = 0.807f,
                    dy1 = 0.473f,
                    dx2 = 1.381f,
                    dy2 = 1.231f,
                    dx3 = 1.616f,
                    dy3 = 2.136f,
                )
                // c 0.07 0.267 -0.09 0.54 -0.357 0.61
                curveToRelative(
                    dx1 = 0.07f,
                    dy1 = 0.267f,
                    dx2 = -0.09f,
                    dy2 = 0.54f,
                    dx3 = -0.357f,
                    dy3 = 0.61f,
                )
                // c -0.042 0.009 -0.085 0.015 -0.126 0.015z
                curveToRelative(
                    dx1 = -0.042f,
                    dy1 = 0.009f,
                    dx2 = -0.085f,
                    dy2 = 0.015f,
                    dx3 = -0.126f,
                    dy3 = 0.015f,
                )
                close()
            }
            // M13 5 l2 3 1 -1 2 3 2 -3 1 1 2 -3 s-2 -1 -5 -1 -5 1 -5 1z
            path(
                fill = SolidColor(Color(0xFFC09154)),
            ) {
                // M 13 5
                moveTo(x = 13.0f, y = 5.0f)
                // l 2 3
                lineToRelative(dx = 2.0f, dy = 3.0f)
                // l 1 -1
                lineToRelative(dx = 1.0f, dy = -1.0f)
                // l 2 3
                lineToRelative(dx = 2.0f, dy = 3.0f)
                // l 2 -3
                lineToRelative(dx = 2.0f, dy = -3.0f)
                // l 1 1
                lineToRelative(dx = 1.0f, dy = 1.0f)
                // l 2 -3
                lineToRelative(dx = 2.0f, dy = -3.0f)
                // s -2 -1 -5 -1
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = -1.0f,
                    dx2 = -5.0f,
                    dy2 = -1.0f,
                )
                // s -5 1 -5 1z
                reflectiveCurveToRelative(
                    dx1 = -5.0f,
                    dy1 = 1.0f,
                    dx2 = -5.0f,
                    dy2 = 1.0f,
                )
                close()
            }
            // M13 5 l2 2 1 -2 2 3 2 -3 1 2 2 -2 s-2 -2 -5 -2 -5 2 -5 2z
            path(
                fill = SolidColor(Color(0xFFE26000)),
            ) {
                // M 13 5
                moveTo(x = 13.0f, y = 5.0f)
                // l 2 2
                lineToRelative(dx = 2.0f, dy = 2.0f)
                // l 1 -2
                lineToRelative(dx = 1.0f, dy = -2.0f)
                // l 2 3
                lineToRelative(dx = 2.0f, dy = 3.0f)
                // l 2 -3
                lineToRelative(dx = 2.0f, dy = -3.0f)
                // l 1 2
                lineToRelative(dx = 1.0f, dy = 2.0f)
                // l 2 -2
                lineToRelative(dx = 2.0f, dy = -2.0f)
                // s -2 -2 -5 -2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                    dx2 = -5.0f,
                    dy2 = -2.0f,
                )
                // s -5 2 -5 2z
                reflectiveCurveToRelative(
                    dx1 = -5.0f,
                    dy1 = 2.0f,
                    dx2 = -5.0f,
                    dy2 = 2.0f,
                )
                close()
            }
            // M17.5 13.5 m-0.5 0 a0.5 0.5 0 1 1 1 0 a0.5 0.5 0 1 1 -1 0
            path(
                fill = SolidColor(Color(0xFFC09154)),
            ) {
                // M 17.5 13.5
                moveTo(x = 17.5f, y = 13.5f)
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
            // M18.5 13.5 m-0.5 0 a0.5 0.5 0 1 1 1 0 a0.5 0.5 0 1 1 -1 0
            path(
                fill = SolidColor(Color(0xFFC09154)),
            ) {
                // M 18.5 13.5
                moveTo(x = 18.5f, y = 13.5f)
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
            // M18 21 c-3.665 0 -5.286 -1.579 -5.354 -1.646 -0.195 -0.195 -0.195 -0.512 0 -0.707 0.195 -0.194 0.51 -0.195 0.705 -0.002 C13.365 18.658 14.783 20 18 20 c3.218 0 4.635 -1.342 4.648 -1.356 0.197 -0.191 0.514 -0.189 0.706 0.006 0.193 0.195 0.193 0.509 -0.001 0.703 C23.286 19.421 21.665 21 18 21z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 18 21
                moveTo(x = 18.0f, y = 21.0f)
                // c -3.665 0 -5.286 -1.579 -5.354 -1.646
                curveToRelative(
                    dx1 = -3.665f,
                    dy1 = 0.0f,
                    dx2 = -5.286f,
                    dy2 = -1.579f,
                    dx3 = -5.354f,
                    dy3 = -1.646f,
                )
                // c -0.195 -0.195 -0.195 -0.512 0 -0.707
                curveToRelative(
                    dx1 = -0.195f,
                    dy1 = -0.195f,
                    dx2 = -0.195f,
                    dy2 = -0.512f,
                    dx3 = 0.0f,
                    dy3 = -0.707f,
                )
                // c 0.195 -0.194 0.51 -0.195 0.705 -0.002
                curveToRelative(
                    dx1 = 0.195f,
                    dy1 = -0.194f,
                    dx2 = 0.51f,
                    dy2 = -0.195f,
                    dx3 = 0.705f,
                    dy3 = -0.002f,
                )
                // C 13.365 18.658 14.783 20 18 20
                curveTo(
                    x1 = 13.365f,
                    y1 = 18.658f,
                    x2 = 14.783f,
                    y2 = 20.0f,
                    x3 = 18.0f,
                    y3 = 20.0f,
                )
                // c 3.218 0 4.635 -1.342 4.648 -1.356
                curveToRelative(
                    dx1 = 3.218f,
                    dy1 = 0.0f,
                    dx2 = 4.635f,
                    dy2 = -1.342f,
                    dx3 = 4.648f,
                    dy3 = -1.356f,
                )
                // c 0.197 -0.191 0.514 -0.189 0.706 0.006
                curveToRelative(
                    dx1 = 0.197f,
                    dy1 = -0.191f,
                    dx2 = 0.514f,
                    dy2 = -0.189f,
                    dx3 = 0.706f,
                    dy3 = 0.006f,
                )
                // c 0.193 0.195 0.193 0.509 -0.001 0.703
                curveToRelative(
                    dx1 = 0.193f,
                    dy1 = 0.195f,
                    dx2 = 0.193f,
                    dy2 = 0.509f,
                    dx3 = -0.001f,
                    dy3 = 0.703f,
                )
                // C 23.286 19.421 21.665 21 18 21z
                curveTo(
                    x1 = 23.286f,
                    y1 = 19.421f,
                    x2 = 21.665f,
                    y2 = 21.0f,
                    x3 = 18.0f,
                    y3 = 21.0f,
                )
                close()
            }
            // M17.295 33 c-0.235 2.224 -5 4 -6 2 -0.247 -0.494 -2.341 -4.936 -2.535 -5.453 -0.194 -0.517 0.068 -1.094 0.586 -1.287 s1.094 0.068 1.287 0.586 c-0.194 -0.517 0.068 -1.094 0.586 -1.287 0.517 -0.194 1.094 0.068 1.287 0.586 -0.194 -0.517 0.068 -1.094 0.586 -1.287 0.517 -0.194 1.094 0.068 1.287 0.586 -0.194 -0.517 0.068 -1.094 0.586 -1.287 s1.094 0.068 1.287 0.586 c0.193 0.514 1.148 5.263 1.043 6.257z M18.705 33 c0.235 2.224 5 4 6 2 0.247 -0.494 2.341 -4.936 2.535 -5.453 0.194 -0.517 -0.068 -1.094 -0.586 -1.287 s-1.094 0.068 -1.287 0.586 c0.194 -0.517 -0.068 -1.094 -0.586 -1.287 -0.517 -0.194 -1.094 0.068 -1.287 0.586 0.194 -0.517 -0.068 -1.094 -0.586 -1.287 -0.517 -0.194 -1.094 0.068 -1.287 0.586 0.194 -0.517 -0.068 -1.094 -0.586 -1.287 s-1.094 0.068 -1.287 0.586 c-0.193 0.514 -1.148 5.263 -1.043 6.257z
            path(
                fill = SolidColor(Color(0xFFD9B981)),
            ) {
                // M 17.295 33
                moveTo(x = 17.295f, y = 33.0f)
                // c -0.235 2.224 -5 4 -6 2
                curveToRelative(
                    dx1 = -0.235f,
                    dy1 = 2.224f,
                    dx2 = -5.0f,
                    dy2 = 4.0f,
                    dx3 = -6.0f,
                    dy3 = 2.0f,
                )
                // c -0.247 -0.494 -2.341 -4.936 -2.535 -5.453
                curveToRelative(
                    dx1 = -0.247f,
                    dy1 = -0.494f,
                    dx2 = -2.341f,
                    dy2 = -4.936f,
                    dx3 = -2.535f,
                    dy3 = -5.453f,
                )
                // c -0.194 -0.517 0.068 -1.094 0.586 -1.287
                curveToRelative(
                    dx1 = -0.194f,
                    dy1 = -0.517f,
                    dx2 = 0.068f,
                    dy2 = -1.094f,
                    dx3 = 0.586f,
                    dy3 = -1.287f,
                )
                // s 1.094 0.068 1.287 0.586
                reflectiveCurveToRelative(
                    dx1 = 1.094f,
                    dy1 = 0.068f,
                    dx2 = 1.287f,
                    dy2 = 0.586f,
                )
                // c -0.194 -0.517 0.068 -1.094 0.586 -1.287
                curveToRelative(
                    dx1 = -0.194f,
                    dy1 = -0.517f,
                    dx2 = 0.068f,
                    dy2 = -1.094f,
                    dx3 = 0.586f,
                    dy3 = -1.287f,
                )
                // c 0.517 -0.194 1.094 0.068 1.287 0.586
                curveToRelative(
                    dx1 = 0.517f,
                    dy1 = -0.194f,
                    dx2 = 1.094f,
                    dy2 = 0.068f,
                    dx3 = 1.287f,
                    dy3 = 0.586f,
                )
                // c -0.194 -0.517 0.068 -1.094 0.586 -1.287
                curveToRelative(
                    dx1 = -0.194f,
                    dy1 = -0.517f,
                    dx2 = 0.068f,
                    dy2 = -1.094f,
                    dx3 = 0.586f,
                    dy3 = -1.287f,
                )
                // c 0.517 -0.194 1.094 0.068 1.287 0.586
                curveToRelative(
                    dx1 = 0.517f,
                    dy1 = -0.194f,
                    dx2 = 1.094f,
                    dy2 = 0.068f,
                    dx3 = 1.287f,
                    dy3 = 0.586f,
                )
                // c -0.194 -0.517 0.068 -1.094 0.586 -1.287
                curveToRelative(
                    dx1 = -0.194f,
                    dy1 = -0.517f,
                    dx2 = 0.068f,
                    dy2 = -1.094f,
                    dx3 = 0.586f,
                    dy3 = -1.287f,
                )
                // s 1.094 0.068 1.287 0.586
                reflectiveCurveToRelative(
                    dx1 = 1.094f,
                    dy1 = 0.068f,
                    dx2 = 1.287f,
                    dy2 = 0.586f,
                )
                // c 0.193 0.514 1.148 5.263 1.043 6.257z
                curveToRelative(
                    dx1 = 0.193f,
                    dy1 = 0.514f,
                    dx2 = 1.148f,
                    dy2 = 5.263f,
                    dx3 = 1.043f,
                    dy3 = 6.257f,
                )
                close()
                // M 18.705 33
                moveTo(x = 18.705f, y = 33.0f)
                // c 0.235 2.224 5 4 6 2
                curveToRelative(
                    dx1 = 0.235f,
                    dy1 = 2.224f,
                    dx2 = 5.0f,
                    dy2 = 4.0f,
                    dx3 = 6.0f,
                    dy3 = 2.0f,
                )
                // c 0.247 -0.494 2.341 -4.936 2.535 -5.453
                curveToRelative(
                    dx1 = 0.247f,
                    dy1 = -0.494f,
                    dx2 = 2.341f,
                    dy2 = -4.936f,
                    dx3 = 2.535f,
                    dy3 = -5.453f,
                )
                // c 0.194 -0.517 -0.068 -1.094 -0.586 -1.287
                curveToRelative(
                    dx1 = 0.194f,
                    dy1 = -0.517f,
                    dx2 = -0.068f,
                    dy2 = -1.094f,
                    dx3 = -0.586f,
                    dy3 = -1.287f,
                )
                // s -1.094 0.068 -1.287 0.586
                reflectiveCurveToRelative(
                    dx1 = -1.094f,
                    dy1 = 0.068f,
                    dx2 = -1.287f,
                    dy2 = 0.586f,
                )
                // c 0.194 -0.517 -0.068 -1.094 -0.586 -1.287
                curveToRelative(
                    dx1 = 0.194f,
                    dy1 = -0.517f,
                    dx2 = -0.068f,
                    dy2 = -1.094f,
                    dx3 = -0.586f,
                    dy3 = -1.287f,
                )
                // c -0.517 -0.194 -1.094 0.068 -1.287 0.586
                curveToRelative(
                    dx1 = -0.517f,
                    dy1 = -0.194f,
                    dx2 = -1.094f,
                    dy2 = 0.068f,
                    dx3 = -1.287f,
                    dy3 = 0.586f,
                )
                // c 0.194 -0.517 -0.068 -1.094 -0.586 -1.287
                curveToRelative(
                    dx1 = 0.194f,
                    dy1 = -0.517f,
                    dx2 = -0.068f,
                    dy2 = -1.094f,
                    dx3 = -0.586f,
                    dy3 = -1.287f,
                )
                // c -0.517 -0.194 -1.094 0.068 -1.287 0.586
                curveToRelative(
                    dx1 = -0.517f,
                    dy1 = -0.194f,
                    dx2 = -1.094f,
                    dy2 = 0.068f,
                    dx3 = -1.287f,
                    dy3 = 0.586f,
                )
                // c 0.194 -0.517 -0.068 -1.094 -0.586 -1.287
                curveToRelative(
                    dx1 = 0.194f,
                    dy1 = -0.517f,
                    dx2 = -0.068f,
                    dy2 = -1.094f,
                    dx3 = -0.586f,
                    dy3 = -1.287f,
                )
                // s -1.094 0.068 -1.287 0.586
                reflectiveCurveToRelative(
                    dx1 = -1.094f,
                    dy1 = 0.068f,
                    dx2 = -1.287f,
                    dy2 = 0.586f,
                )
                // c -0.193 0.514 -1.148 5.263 -1.043 6.257z
                curveToRelative(
                    dx1 = -0.193f,
                    dy1 = 0.514f,
                    dx2 = -1.148f,
                    dy2 = 5.263f,
                    dx3 = -1.043f,
                    dy3 = 6.257f,
                )
                close()
            }
        }.build().also { _emoji1f9a7 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f9a7: ImageVector? = null
