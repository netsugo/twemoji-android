package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f36f: ImageVector
    get() {
        val current = _emoji1f36f
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f36f",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M31 22 c-3 11 -5.019 14 -13 14 -8 0 -10 -3 -13 -14 C2.965 14.54 7 8 18 8 s15.034 6.54 13 14z
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 31 22
                moveTo(x = 31.0f, y = 22.0f)
                // c -3 11 -5.019 14 -13 14
                curveToRelative(
                    dx1 = -3.0f,
                    dy1 = 11.0f,
                    dx2 = -5.019f,
                    dy2 = 14.0f,
                    dx3 = -13.0f,
                    dy3 = 14.0f,
                )
                // c -8 0 -10 -3 -13 -14
                curveToRelative(
                    dx1 = -8.0f,
                    dy1 = 0.0f,
                    dx2 = -10.0f,
                    dy2 = -3.0f,
                    dx3 = -13.0f,
                    dy3 = -14.0f,
                )
                // C 2.965 14.54 7 8 18 8
                curveTo(
                    x1 = 2.965f,
                    y1 = 14.54f,
                    x2 = 7.0f,
                    y2 = 8.0f,
                    x3 = 18.0f,
                    y3 = 8.0f,
                )
                // s 15.034 6.54 13 14z
                reflectiveCurveToRelative(
                    dx1 = 15.034f,
                    dy1 = 6.54f,
                    dx2 = 13.0f,
                    dy2 = 14.0f,
                )
                close()
            }
            // M29 11 c2 4 -3 8 -11 8 S5 15 7 11 c1.482 -2.964 4.373 -6 11 -6 s9.519 3.036 11 6z
            path(
                fill = SolidColor(Color(0xFFBE1931)),
            ) {
                // M 29 11
                moveTo(x = 29.0f, y = 11.0f)
                // c 2 4 -3 8 -11 8
                curveToRelative(
                    dx1 = 2.0f,
                    dy1 = 4.0f,
                    dx2 = -3.0f,
                    dy2 = 8.0f,
                    dx3 = -11.0f,
                    dy3 = 8.0f,
                )
                // S 5 15 7 11
                reflectiveCurveTo(
                    x1 = 5.0f,
                    y1 = 15.0f,
                    x2 = 7.0f,
                    y2 = 11.0f,
                )
                // c 1.482 -2.964 4.373 -6 11 -6
                curveToRelative(
                    dx1 = 1.482f,
                    dy1 = -2.964f,
                    dx2 = 4.373f,
                    dy2 = -6.0f,
                    dx3 = 11.0f,
                    dy3 = -6.0f,
                )
                // s 9.519 3.036 11 6z
                reflectiveCurveToRelative(
                    dx1 = 9.519f,
                    dy1 = 3.036f,
                    dx2 = 11.0f,
                    dy2 = 6.0f,
                )
                close()
            }
            // M6 11 a12 6 0 1 0 24 0 a12 6 0 1 0 -24 0z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 6 11
                moveTo(x = 6.0f, y = 11.0f)
                // a 12 6 0 1 0 24 0
                arcToRelative(
                    a = 12.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 24.0f,
                    dy1 = 0.0f,
                )
                // a 12 6 0 1 0 -24 0z
                arcToRelative(
                    a = 12.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -24.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M27 10 c1 1 2 2 2 3 s-1 3 -2 2 c0 0 2.948 1.154 2 4 -1 3 -4 2 -4 0 s-1.553 -3.342 -2 -2 c-1 3 -3 3 -4 2 s-1 -2 -1 -2 -3 0 -2 -2 0 -2 0 -2 0 -1 1 -1 7 -1 8 -2 2 0 2 0z
            path(
                fill = SolidColor(Color(0xFFFFE8B6)),
            ) {
                // M 27 10
                moveTo(x = 27.0f, y = 10.0f)
                // c 1 1 2 2 2 3
                curveToRelative(
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                    dx3 = 2.0f,
                    dy3 = 3.0f,
                )
                // s -1 3 -2 2
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 3.0f,
                    dx2 = -2.0f,
                    dy2 = 2.0f,
                )
                // c 0 0 2.948 1.154 2 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 2.948f,
                    dy2 = 1.154f,
                    dx3 = 2.0f,
                    dy3 = 4.0f,
                )
                // c -1 3 -4 2 -4 0
                curveToRelative(
                    dx1 = -1.0f,
                    dy1 = 3.0f,
                    dx2 = -4.0f,
                    dy2 = 2.0f,
                    dx3 = -4.0f,
                    dy3 = 0.0f,
                )
                // s -1.553 -3.342 -2 -2
                reflectiveCurveToRelative(
                    dx1 = -1.553f,
                    dy1 = -3.342f,
                    dx2 = -2.0f,
                    dy2 = -2.0f,
                )
                // c -1 3 -3 3 -4 2
                curveToRelative(
                    dx1 = -1.0f,
                    dy1 = 3.0f,
                    dx2 = -3.0f,
                    dy2 = 3.0f,
                    dx3 = -4.0f,
                    dy3 = 2.0f,
                )
                // s -1 -2 -1 -2
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = -2.0f,
                    dx2 = -1.0f,
                    dy2 = -2.0f,
                )
                // s -3 0 -2 -2
                reflectiveCurveToRelative(
                    dx1 = -3.0f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -2.0f,
                )
                // s 0 -2 0 -2
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                    dx2 = 0.0f,
                    dy2 = -2.0f,
                )
                // s 0 -1 1 -1
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // s 7 -1 8 -2
                reflectiveCurveToRelative(
                    dx1 = 7.0f,
                    dy1 = -1.0f,
                    dx2 = 8.0f,
                    dy2 = -2.0f,
                )
                // s 2 0 2 0z
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 0.0f,
                )
                close()
            }
            // M28 9.278 C28 11.886 23.523 14 18 14 S8 11.886 8 9.278 C8 6.67 12.477 5 18 5 s10 1.67 10 4.278z
            path(
                fill = SolidColor(Color(0xFF662113)),
            ) {
                // M 28 9.278
                moveTo(x = 28.0f, y = 9.278f)
                // C 28 11.886 23.523 14 18 14
                curveTo(
                    x1 = 28.0f,
                    y1 = 11.886f,
                    x2 = 23.523f,
                    y2 = 14.0f,
                    x3 = 18.0f,
                    y3 = 14.0f,
                )
                // S 8 11.886 8 9.278
                reflectiveCurveTo(
                    x1 = 8.0f,
                    y1 = 11.886f,
                    x2 = 8.0f,
                    y2 = 9.278f,
                )
                // C 8 6.67 12.477 5 18 5
                curveTo(
                    x1 = 8.0f,
                    y1 = 6.67f,
                    x2 = 12.477f,
                    y2 = 5.0f,
                    x3 = 18.0f,
                    y3 = 5.0f,
                )
                // s 10 1.67 10 4.278z
                reflectiveCurveToRelative(
                    dx1 = 10.0f,
                    dy1 = 1.67f,
                    dx2 = 10.0f,
                    dy2 = 4.278f,
                )
                close()
            }
            // M18 14 c4.548 0 8.379 -1.435 9.593 -3.396 -0.193 -0.202 -0.392 -0.403 -0.593 -0.604 0 0 -2 -2 -3 -1 s-6 1 -7 1 -2 1 -2 1 1.587 2.011 1.397 2.934 c0.523 0.04 1.056 0.066 1.603 0.066z
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 18 14
                moveTo(x = 18.0f, y = 14.0f)
                // c 4.548 0 8.379 -1.435 9.593 -3.396
                curveToRelative(
                    dx1 = 4.548f,
                    dy1 = 0.0f,
                    dx2 = 8.379f,
                    dy2 = -1.435f,
                    dx3 = 9.593f,
                    dy3 = -3.396f,
                )
                // c -0.193 -0.202 -0.392 -0.403 -0.593 -0.604
                curveToRelative(
                    dx1 = -0.193f,
                    dy1 = -0.202f,
                    dx2 = -0.392f,
                    dy2 = -0.403f,
                    dx3 = -0.593f,
                    dy3 = -0.604f,
                )
                // c 0 0 -2 -2 -3 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -2.0f,
                    dx3 = -3.0f,
                    dy3 = -1.0f,
                )
                // s -6 1 -7 1
                reflectiveCurveToRelative(
                    dx1 = -6.0f,
                    dy1 = 1.0f,
                    dx2 = -7.0f,
                    dy2 = 1.0f,
                )
                // s -2 1 -2 1
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 1.0f,
                    dx2 = -2.0f,
                    dy2 = 1.0f,
                )
                // s 1.587 2.011 1.397 2.934
                reflectiveCurveToRelative(
                    dx1 = 1.587f,
                    dy1 = 2.011f,
                    dx2 = 1.397f,
                    dy2 = 2.934f,
                )
                // c 0.523 0.04 1.056 0.066 1.603 0.066z
                curveToRelative(
                    dx1 = 0.523f,
                    dy1 = 0.04f,
                    dx2 = 1.056f,
                    dy2 = 0.066f,
                    dx3 = 1.603f,
                    dy3 = 0.066f,
                )
                close()
            }
            // M26 8.5 c0 1.933 -3.582 3.5 -8 3.5 s-8 -1.567 -8 -3.5 S13.582 3 18 3 s8 3.567 8 5.5z
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 26 8.5
                moveTo(x = 26.0f, y = 8.5f)
                // c 0 1.933 -3.582 3.5 -8 3.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.933f,
                    dx2 = -3.582f,
                    dy2 = 3.5f,
                    dx3 = -8.0f,
                    dy3 = 3.5f,
                )
                // s -8 -1.567 -8 -3.5
                reflectiveCurveToRelative(
                    dx1 = -8.0f,
                    dy1 = -1.567f,
                    dx2 = -8.0f,
                    dy2 = -3.5f,
                )
                // S 13.582 3 18 3
                reflectiveCurveTo(
                    x1 = 13.582f,
                    y1 = 3.0f,
                    x2 = 18.0f,
                    y2 = 3.0f,
                )
                // s 8 3.567 8 5.5z
                reflectiveCurveToRelative(
                    dx1 = 8.0f,
                    dy1 = 3.567f,
                    dx2 = 8.0f,
                    dy2 = 5.5f,
                )
                close()
            }
            // M16 2.5 a2 1.5 0 1 0 4 0 a2 1.5 0 1 0 -4 0z
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 16 2.5
                moveTo(x = 16.0f, y = 2.5f)
                // a 2 1.5 0 1 0 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 1.5 0 1 0 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M5.685 24.41 c0.725 2.457 1.425 4.435 2.204 6.013 C11 33 16 33 18 33 s7 0 10.106 -2.576 c0.78 -1.576 1.483 -3.556 2.208 -6.014 C27.609 25.973 23.112 27 18 27 s-9.61 -1.027 -12.315 -2.59z
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 5.685 24.41
                moveTo(x = 5.685f, y = 24.41f)
                // c 0.725 2.457 1.425 4.435 2.204 6.013
                curveToRelative(
                    dx1 = 0.725f,
                    dy1 = 2.457f,
                    dx2 = 1.425f,
                    dy2 = 4.435f,
                    dx3 = 2.204f,
                    dy3 = 6.013f,
                )
                // C 11 33 16 33 18 33
                curveTo(
                    x1 = 11.0f,
                    y1 = 33.0f,
                    x2 = 16.0f,
                    y2 = 33.0f,
                    x3 = 18.0f,
                    y3 = 33.0f,
                )
                // s 7 0 10.106 -2.576
                reflectiveCurveToRelative(
                    dx1 = 7.0f,
                    dy1 = 0.0f,
                    dx2 = 10.106f,
                    dy2 = -2.576f,
                )
                // c 0.78 -1.576 1.483 -3.556 2.208 -6.014
                curveToRelative(
                    dx1 = 0.78f,
                    dy1 = -1.576f,
                    dx2 = 1.483f,
                    dy2 = -3.556f,
                    dx3 = 2.208f,
                    dy3 = -6.014f,
                )
                // C 27.609 25.973 23.112 27 18 27
                curveTo(
                    x1 = 27.609f,
                    y1 = 25.973f,
                    x2 = 23.112f,
                    y2 = 27.0f,
                    x3 = 18.0f,
                    y3 = 27.0f,
                )
                // s -9.61 -1.027 -12.315 -2.59z
                reflectiveCurveToRelative(
                    dx1 = -9.61f,
                    dy1 = -1.027f,
                    dx2 = -12.315f,
                    dy2 = -2.59f,
                )
                close()
            }
        }.build().also { _emoji1f36f = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f36f: ImageVector? = null
