package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1fad9: ImageVector
    get() {
        val current = _emoji1fad9
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1fad9",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M8 8 c0 0.64 0.254 1.254 0.707 1.707 a0.256 0.256 0 0 1 -0.1 0.424 l-0.556 0.185 A3 3 0 0 0 6 13.162 v18.451 c0 0.002 0.002 0.004 0.004 0.004 0 0.007 -0.004 0.014 -0.004 0.021 0 1.796 5.373 3.252 12 3.252 s12 -1.456 12 -3.252 c0 -0.007 -0.004 -0.014 -0.004 -0.021 a0.004 0.004 0 0 0 0.004 -0.004 V13.162 a3 3 0 0 0 -2.051 -2.846 l-0.795 -0.265 a0.1 0.1 0 0 1 -0.04 -0.165 l0.178 -0.178 A2.415 2.415 0 0 0 28 8 H8z
            path(
                fill = SolidColor(Color(0xFFC4C9C8)),
            ) {
                // M 8 8
                moveTo(x = 8.0f, y = 8.0f)
                // c 0 0.64 0.254 1.254 0.707 1.707
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.64f,
                    dx2 = 0.254f,
                    dy2 = 1.254f,
                    dx3 = 0.707f,
                    dy3 = 1.707f,
                )
                // a 0.256 0.256 0 0 1 -0.1 0.424
                arcToRelative(
                    a = 0.256f,
                    b = 0.256f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.1f,
                    dy1 = 0.424f,
                )
                // l -0.556 0.185
                lineToRelative(dx = -0.556f, dy = 0.185f)
                // A 3 3 0 0 0 6 13.162
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 6.0f,
                    y1 = 13.162f,
                )
                // v 18.451
                verticalLineToRelative(dy = 18.451f)
                // c 0 0.002 0.002 0.004 0.004 0.004
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.002f,
                    dx2 = 0.002f,
                    dy2 = 0.004f,
                    dx3 = 0.004f,
                    dy3 = 0.004f,
                )
                // c 0 0.007 -0.004 0.014 -0.004 0.021
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.007f,
                    dx2 = -0.004f,
                    dy2 = 0.014f,
                    dx3 = -0.004f,
                    dy3 = 0.021f,
                )
                // c 0 1.796 5.373 3.252 12 3.252
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.796f,
                    dx2 = 5.373f,
                    dy2 = 3.252f,
                    dx3 = 12.0f,
                    dy3 = 3.252f,
                )
                // s 12 -1.456 12 -3.252
                reflectiveCurveToRelative(
                    dx1 = 12.0f,
                    dy1 = -1.456f,
                    dx2 = 12.0f,
                    dy2 = -3.252f,
                )
                // c 0 -0.007 -0.004 -0.014 -0.004 -0.021
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.007f,
                    dx2 = -0.004f,
                    dy2 = -0.014f,
                    dx3 = -0.004f,
                    dy3 = -0.021f,
                )
                // a 0.004 0.004 0 0 0 0.004 -0.004
                arcToRelative(
                    a = 0.004f,
                    b = 0.004f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.004f,
                    dy1 = -0.004f,
                )
                // V 13.162
                verticalLineTo(y = 13.162f)
                // a 3 3 0 0 0 -2.051 -2.846
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.051f,
                    dy1 = -2.846f,
                )
                // l -0.795 -0.265
                lineToRelative(dx = -0.795f, dy = -0.265f)
                // a 0.1 0.1 0 0 1 -0.04 -0.165
                arcToRelative(
                    a = 0.1f,
                    b = 0.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.04f,
                    dy1 = -0.165f,
                )
                // l 0.178 -0.178
                lineToRelative(dx = 0.178f, dy = -0.178f)
                // A 2.415 2.415 0 0 0 28 8
                arcTo(
                    horizontalEllipseRadius = 2.415f,
                    verticalEllipseRadius = 2.415f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 28.0f,
                    y1 = 8.0f,
                )
                // H 8z
                horizontalLineTo(x = 8.0f)
                close()
            }
            // M29 6.8 c0 1.657 -4.925 3.2 -11 3.2 S7 8.457 7 6.8 11.925 4 18 4 s11 1.143 11 2.8z
            path(
                fill = SolidColor(Color(0xFFF19020)),
            ) {
                // M 29 6.8
                moveTo(x = 29.0f, y = 6.8f)
                // c 0 1.657 -4.925 3.2 -11 3.2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.657f,
                    dx2 = -4.925f,
                    dy2 = 3.2f,
                    dx3 = -11.0f,
                    dy3 = 3.2f,
                )
                // S 7 8.457 7 6.8
                reflectiveCurveTo(
                    x1 = 7.0f,
                    y1 = 8.457f,
                    x2 = 7.0f,
                    y2 = 6.8f,
                )
                // S 11.925 4 18 4
                reflectiveCurveTo(
                    x1 = 11.925f,
                    y1 = 4.0f,
                    x2 = 18.0f,
                    y2 = 4.0f,
                )
                // s 11 1.143 11 2.8z
                reflectiveCurveToRelative(
                    dx1 = 11.0f,
                    dy1 = 1.143f,
                    dx2 = 11.0f,
                    dy2 = 2.8f,
                )
                close()
            }
            // M7 4 h22 v2.8 H7z
            path(
                fill = SolidColor(Color(0xFFF19020)),
            ) {
                // M 7 4
                moveTo(x = 7.0f, y = 4.0f)
                // h 22
                horizontalLineToRelative(dx = 22.0f)
                // v 2.8
                verticalLineToRelative(dy = 2.8f)
                // H 7z
                horizontalLineTo(x = 7.0f)
                close()
            }
            // M7 4 a11 3 0 1 0 22 0 a11 3 0 1 0 -22 0z
            path(
                fill = SolidColor(Color(0xFFF9CA55)),
            ) {
                // M 7 4
                moveTo(x = 7.0f, y = 4.0f)
                // a 11 3 0 1 0 22 0
                arcToRelative(
                    a = 11.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 22.0f,
                    dy1 = 0.0f,
                )
                // a 11 3 0 1 0 -22 0z
                arcToRelative(
                    a = 11.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -22.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M7 30.5 a11 3 0 1 0 22 0 a11 3 0 1 0 -22 0z
            path(
                fill = SolidColor(Color(0xFFAEB3B2)),
            ) {
                // M 7 30.5
                moveTo(x = 7.0f, y = 30.5f)
                // a 11 3 0 1 0 22 0
                arcToRelative(
                    a = 11.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 22.0f,
                    dy1 = 0.0f,
                )
                // a 11 3 0 1 0 -22 0z
                arcToRelative(
                    a = 11.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -22.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M10.465 4 c1.099 -0.582 4.053 -1 7.535 -1 s6.436 0.418 7.535 1 c0.296 -0.157 0.465 -0.324 0.465 -0.5 0 -0.828 -3.582 -1.5 -8 -1.5 s-8 0.672 -8 1.5 c0 0.176 0.169 0.343 0.465 0.5z
            path(
                fill = SolidColor(Color(0xFFF19020)),
            ) {
                // M 10.465 4
                moveTo(x = 10.465f, y = 4.0f)
                // c 1.099 -0.582 4.053 -1 7.535 -1
                curveToRelative(
                    dx1 = 1.099f,
                    dy1 = -0.582f,
                    dx2 = 4.053f,
                    dy2 = -1.0f,
                    dx3 = 7.535f,
                    dy3 = -1.0f,
                )
                // s 6.436 0.418 7.535 1
                reflectiveCurveToRelative(
                    dx1 = 6.436f,
                    dy1 = 0.418f,
                    dx2 = 7.535f,
                    dy2 = 1.0f,
                )
                // c 0.296 -0.157 0.465 -0.324 0.465 -0.5
                curveToRelative(
                    dx1 = 0.296f,
                    dy1 = -0.157f,
                    dx2 = 0.465f,
                    dy2 = -0.324f,
                    dx3 = 0.465f,
                    dy3 = -0.5f,
                )
                // c 0 -0.828 -3.582 -1.5 -8 -1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.828f,
                    dx2 = -3.582f,
                    dy2 = -1.5f,
                    dx3 = -8.0f,
                    dy3 = -1.5f,
                )
                // s -8 0.672 -8 1.5
                reflectiveCurveToRelative(
                    dx1 = -8.0f,
                    dy1 = 0.672f,
                    dx2 = -8.0f,
                    dy2 = 1.5f,
                )
                // c 0 0.176 0.169 0.343 0.465 0.5z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.176f,
                    dx2 = 0.169f,
                    dy2 = 0.343f,
                    dx3 = 0.465f,
                    dy3 = 0.5f,
                )
                close()
            }
            // M18 12 c-1.145 0 -5.129 -0.07 -8.335 -0.974 a0.5 0.5 0 1 1 0.271 -0.963 c3.083 0.87 6.952 0.937 8.064 0.937 s4.981 -0.067 8.063 -0.937 a0.501 0.501 0 0 1 0.271 0.963 C23.129 11.93 19.145 12 18 12z
            path(
                fill = SolidColor(Color(0xFFAEB3B2)),
            ) {
                // M 18 12
                moveTo(x = 18.0f, y = 12.0f)
                // c -1.145 0 -5.129 -0.07 -8.335 -0.974
                curveToRelative(
                    dx1 = -1.145f,
                    dy1 = 0.0f,
                    dx2 = -5.129f,
                    dy2 = -0.07f,
                    dx3 = -8.335f,
                    dy3 = -0.974f,
                )
                // a 0.5 0.5 0 1 1 0.271 -0.963
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.271f,
                    dy1 = -0.963f,
                )
                // c 3.083 0.87 6.952 0.937 8.064 0.937
                curveToRelative(
                    dx1 = 3.083f,
                    dy1 = 0.87f,
                    dx2 = 6.952f,
                    dy2 = 0.937f,
                    dx3 = 8.064f,
                    dy3 = 0.937f,
                )
                // s 4.981 -0.067 8.063 -0.937
                reflectiveCurveToRelative(
                    dx1 = 4.981f,
                    dy1 = -0.067f,
                    dx2 = 8.063f,
                    dy2 = -0.937f,
                )
                // a 0.501 0.501 0 0 1 0.271 0.963
                arcToRelative(
                    a = 0.501f,
                    b = 0.501f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.271f,
                    dy1 = 0.963f,
                )
                // C 23.129 11.93 19.145 12 18 12z
                curveTo(
                    x1 = 23.129f,
                    y1 = 11.93f,
                    x2 = 19.145f,
                    y2 = 12.0f,
                    x3 = 18.0f,
                    y3 = 12.0f,
                )
                close()
            }
            // M10 31 a1 1 0 0 1 -1 -1 V14 a1 1 0 1 1 2 0 v16 a1 1 0 0 1 -1 1z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 10 31
                moveTo(x = 10.0f, y = 31.0f)
                // a 1 1 0 0 1 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // V 14
                verticalLineTo(y = 14.0f)
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
                // v 16
                verticalLineToRelative(dy = 16.0f)
                // a 1 1 0 0 1 -1 1z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                close()
            }
        }.build().also { _emoji1fad9 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1fad9: ImageVector? = null
