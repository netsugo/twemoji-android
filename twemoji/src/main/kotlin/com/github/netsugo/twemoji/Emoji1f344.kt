package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f344: ImageVector
    get() {
        val current = _emoji1f344
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f344",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M27 33 c0 2.209 -1.791 3 -4 3 H13 c-2.209 0 -4 -0.791 -4 -3 s3 -7 3 -13 12 -6 12 0 3 10.791 3 13z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 27 33
                moveTo(x = 27.0f, y = 33.0f)
                // c 0 2.209 -1.791 3 -4 3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = -1.791f,
                    dy2 = 3.0f,
                    dx3 = -4.0f,
                    dy3 = 3.0f,
                )
                // H 13
                horizontalLineTo(x = 13.0f)
                // c -2.209 0 -4 -0.791 -4 -3
                curveToRelative(
                    dx1 = -2.209f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = -0.791f,
                    dx3 = -4.0f,
                    dy3 = -3.0f,
                )
                // s 3 -7 3 -13
                reflectiveCurveToRelative(
                    dx1 = 3.0f,
                    dy1 = -7.0f,
                    dx2 = 3.0f,
                    dy2 = -13.0f,
                )
                // s 12 -6 12 0
                reflectiveCurveToRelative(
                    dx1 = 12.0f,
                    dy1 = -6.0f,
                    dx2 = 12.0f,
                    dy2 = 0.0f,
                )
                // s 3 10.791 3 13z
                reflectiveCurveToRelative(
                    dx1 = 3.0f,
                    dy1 = 10.791f,
                    dx2 = 3.0f,
                    dy2 = 13.0f,
                )
                close()
            }
            // M34.666 11.189 l-0.001 -0.002 c-0.96 -2.357 -2.404 -4.453 -4.208 -6.182 h-0.003 C27.222 1.904 22.839 0 18 0 13.638 0 9.639 1.541 6.524 4.115 c-2.19 1.809 -3.941 4.13 -5.076 6.785 C0.518 13.075 0 15.473 0 18 c0 2.209 1.791 4 4 4 h28 c2.209 0 4 -1.791 4 -4 0 -2.417 -0.48 -4.713 -1.334 -6.811z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 34.666 11.189
                moveTo(x = 34.666f, y = 11.189f)
                // l -0.001 -0.002
                lineToRelative(dx = -0.001f, dy = -0.002f)
                // c -0.96 -2.357 -2.404 -4.453 -4.208 -6.182
                curveToRelative(
                    dx1 = -0.96f,
                    dy1 = -2.357f,
                    dx2 = -2.404f,
                    dy2 = -4.453f,
                    dx3 = -4.208f,
                    dy3 = -6.182f,
                )
                // h -0.003
                horizontalLineToRelative(dx = -0.003f)
                // C 27.222 1.904 22.839 0 18 0
                curveTo(
                    x1 = 27.222f,
                    y1 = 1.904f,
                    x2 = 22.839f,
                    y2 = 0.0f,
                    x3 = 18.0f,
                    y3 = 0.0f,
                )
                // C 13.638 0 9.639 1.541 6.524 4.115
                curveTo(
                    x1 = 13.638f,
                    y1 = 0.0f,
                    x2 = 9.639f,
                    y2 = 1.541f,
                    x3 = 6.524f,
                    y3 = 4.115f,
                )
                // c -2.19 1.809 -3.941 4.13 -5.076 6.785
                curveToRelative(
                    dx1 = -2.19f,
                    dy1 = 1.809f,
                    dx2 = -3.941f,
                    dy2 = 4.13f,
                    dx3 = -5.076f,
                    dy3 = 6.785f,
                )
                // C 0.518 13.075 0 15.473 0 18
                curveTo(
                    x1 = 0.518f,
                    y1 = 13.075f,
                    x2 = 0.0f,
                    y2 = 15.473f,
                    x3 = 0.0f,
                    y3 = 18.0f,
                )
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
                // c 0 -2.417 -0.48 -4.713 -1.334 -6.811z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.417f,
                    dx2 = -0.48f,
                    dy2 = -4.713f,
                    dx3 = -1.334f,
                    dy3 = -6.811f,
                )
                close()
            }
            // M7.708 16.583 c3.475 0 6.292 -2.817 6.292 -6.292 S11.184 4 7.708 4 c-0.405 0 -0.8 0.042 -1.184 0.115 -2.19 1.809 -3.941 4.13 -5.076 6.785 0.306 3.189 2.991 5.683 6.26 5.683z
            path(
                fill = SolidColor(Color(0xFFF4ABBA)),
            ) {
                // M 7.708 16.583
                moveTo(x = 7.708f, y = 16.583f)
                // c 3.475 0 6.292 -2.817 6.292 -6.292
                curveToRelative(
                    dx1 = 3.475f,
                    dy1 = 0.0f,
                    dx2 = 6.292f,
                    dy2 = -2.817f,
                    dx3 = 6.292f,
                    dy3 = -6.292f,
                )
                // S 11.184 4 7.708 4
                reflectiveCurveTo(
                    x1 = 11.184f,
                    y1 = 4.0f,
                    x2 = 7.708f,
                    y2 = 4.0f,
                )
                // c -0.405 0 -0.8 0.042 -1.184 0.115
                curveToRelative(
                    dx1 = -0.405f,
                    dy1 = 0.0f,
                    dx2 = -0.8f,
                    dy2 = 0.042f,
                    dx3 = -1.184f,
                    dy3 = 0.115f,
                )
                // c -2.19 1.809 -3.941 4.13 -5.076 6.785
                curveToRelative(
                    dx1 = -2.19f,
                    dy1 = 1.809f,
                    dx2 = -3.941f,
                    dy2 = 4.13f,
                    dx3 = -5.076f,
                    dy3 = 6.785f,
                )
                // c 0.306 3.189 2.991 5.683 6.26 5.683z
                curveToRelative(
                    dx1 = 0.306f,
                    dy1 = 3.189f,
                    dx2 = 2.991f,
                    dy2 = 5.683f,
                    dx3 = 6.26f,
                    dy3 = 5.683f,
                )
                close()
            }
            // M7.708 4.25 c3.331 0 6.041 2.71 6.041 6.042 s-2.71 6.042 -6.041 6.042 c-3.107 0 -5.678 -2.314 -6.006 -5.394 1.097 -2.541 2.8 -4.817 4.931 -6.59 0.364 -0.067 0.726 -0.1 1.075 -0.1 m0 -0.25 c-0.405 0 -0.8 0.042 -1.184 0.115 -2.19 1.809 -3.941 4.13 -5.076 6.785 0.306 3.189 2.992 5.683 6.261 5.683 3.475 0 6.291 -2.817 6.291 -6.292 S11.184 4 7.708 4z M26 9.5 c0 2.485 2.015 4.5 4.5 4.5 1.887 0 3.497 -1.164 4.166 -2.811 l-0.001 -0.002 c-0.96 -2.357 -2.404 -4.453 -4.208 -6.182 C27.992 5.028 26 7.029 26 9.5z
            path(
                fill = SolidColor(Color(0xFFF4ABBA)),
            ) {
                // M 7.708 4.25
                moveTo(x = 7.708f, y = 4.25f)
                // c 3.331 0 6.041 2.71 6.041 6.042
                curveToRelative(
                    dx1 = 3.331f,
                    dy1 = 0.0f,
                    dx2 = 6.041f,
                    dy2 = 2.71f,
                    dx3 = 6.041f,
                    dy3 = 6.042f,
                )
                // s -2.71 6.042 -6.041 6.042
                reflectiveCurveToRelative(
                    dx1 = -2.71f,
                    dy1 = 6.042f,
                    dx2 = -6.041f,
                    dy2 = 6.042f,
                )
                // c -3.107 0 -5.678 -2.314 -6.006 -5.394
                curveToRelative(
                    dx1 = -3.107f,
                    dy1 = 0.0f,
                    dx2 = -5.678f,
                    dy2 = -2.314f,
                    dx3 = -6.006f,
                    dy3 = -5.394f,
                )
                // c 1.097 -2.541 2.8 -4.817 4.931 -6.59
                curveToRelative(
                    dx1 = 1.097f,
                    dy1 = -2.541f,
                    dx2 = 2.8f,
                    dy2 = -4.817f,
                    dx3 = 4.931f,
                    dy3 = -6.59f,
                )
                // c 0.364 -0.067 0.726 -0.1 1.075 -0.1
                curveToRelative(
                    dx1 = 0.364f,
                    dy1 = -0.067f,
                    dx2 = 0.726f,
                    dy2 = -0.1f,
                    dx3 = 1.075f,
                    dy3 = -0.1f,
                )
                // m 0 -0.25
                moveToRelative(dx = 0.0f, dy = -0.25f)
                // c -0.405 0 -0.8 0.042 -1.184 0.115
                curveToRelative(
                    dx1 = -0.405f,
                    dy1 = 0.0f,
                    dx2 = -0.8f,
                    dy2 = 0.042f,
                    dx3 = -1.184f,
                    dy3 = 0.115f,
                )
                // c -2.19 1.809 -3.941 4.13 -5.076 6.785
                curveToRelative(
                    dx1 = -2.19f,
                    dy1 = 1.809f,
                    dx2 = -3.941f,
                    dy2 = 4.13f,
                    dx3 = -5.076f,
                    dy3 = 6.785f,
                )
                // c 0.306 3.189 2.992 5.683 6.261 5.683
                curveToRelative(
                    dx1 = 0.306f,
                    dy1 = 3.189f,
                    dx2 = 2.992f,
                    dy2 = 5.683f,
                    dx3 = 6.261f,
                    dy3 = 5.683f,
                )
                // c 3.475 0 6.291 -2.817 6.291 -6.292
                curveToRelative(
                    dx1 = 3.475f,
                    dy1 = 0.0f,
                    dx2 = 6.291f,
                    dy2 = -2.817f,
                    dx3 = 6.291f,
                    dy3 = -6.292f,
                )
                // S 11.184 4 7.708 4z
                reflectiveCurveTo(
                    x1 = 11.184f,
                    y1 = 4.0f,
                    x2 = 7.708f,
                    y2 = 4.0f,
                )
                close()
                // M 26 9.5
                moveTo(x = 26.0f, y = 9.5f)
                // c 0 2.485 2.015 4.5 4.5 4.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.485f,
                    dx2 = 2.015f,
                    dy2 = 4.5f,
                    dx3 = 4.5f,
                    dy3 = 4.5f,
                )
                // c 1.887 0 3.497 -1.164 4.166 -2.811
                curveToRelative(
                    dx1 = 1.887f,
                    dy1 = 0.0f,
                    dx2 = 3.497f,
                    dy2 = -1.164f,
                    dx3 = 4.166f,
                    dy3 = -2.811f,
                )
                // l -0.001 -0.002
                lineToRelative(dx = -0.001f, dy = -0.002f)
                // c -0.96 -2.357 -2.404 -4.453 -4.208 -6.182
                curveToRelative(
                    dx1 = -0.96f,
                    dy1 = -2.357f,
                    dx2 = -2.404f,
                    dy2 = -4.453f,
                    dx3 = -4.208f,
                    dy3 = -6.182f,
                )
                // C 27.992 5.028 26 7.029 26 9.5z
                curveTo(
                    x1 = 27.992f,
                    y1 = 5.028f,
                    x2 = 26.0f,
                    y2 = 7.029f,
                    x3 = 26.0f,
                    y3 = 9.5f,
                )
                close()
            }
            // M21.5 16 m-4.5 0 a4.5 4.5 0 1 1 9 0 a4.5 4.5 0 1 1 -9 0
            path(
                fill = SolidColor(Color(0xFFF4ABBA)),
            ) {
                // M 21.5 16
                moveTo(x = 21.5f, y = 16.0f)
                // m -4.5 0
                moveToRelative(dx = -4.5f, dy = 0.0f)
                // a 4.5 4.5 0 1 1 9 0
                arcToRelative(
                    a = 4.5f,
                    b = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 9.0f,
                    dy1 = 0.0f,
                )
                // a 4.5 4.5 0 1 1 -9 0
                arcToRelative(
                    a = 4.5f,
                    b = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -9.0f,
                    dy1 = 0.0f,
                )
            }
            // M20 5 m-3 0 a3 3 0 1 1 6 0 a3 3 0 1 1 -6 0
            path(
                fill = SolidColor(Color(0xFFF4ABBA)),
            ) {
                // M 20 5
                moveTo(x = 20.0f, y = 5.0f)
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
        }.build().also { _emoji1f344 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f344: ImageVector? = null
