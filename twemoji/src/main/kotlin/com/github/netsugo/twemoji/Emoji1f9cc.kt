package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f9cc: ImageVector
    get() {
        val current = _emoji1f9cc
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f9cc",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M6 23 c-4 0 -4.5 2.5 -4.5 2.5 L0 25 v11 h36 V25 l-1 1 s-1 -3 -4 -3 H6z
            path(
                fill = SolidColor(Color(0xFF898379)),
            ) {
                // M 6 23
                moveTo(x = 6.0f, y = 23.0f)
                // c -4 0 -4.5 2.5 -4.5 2.5
                curveToRelative(
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                    dx2 = -4.5f,
                    dy2 = 2.5f,
                    dx3 = -4.5f,
                    dy3 = 2.5f,
                )
                // L 0 25
                lineTo(x = 0.0f, y = 25.0f)
                // v 11
                verticalLineToRelative(dy = 11.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // V 25
                verticalLineTo(y = 25.0f)
                // l -1 1
                lineToRelative(dx = -1.0f, dy = 1.0f)
                // s -1 -3 -4 -3
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = -3.0f,
                    dx2 = -4.0f,
                    dy2 = -3.0f,
                )
                // H 6z
                horizontalLineTo(x = 6.0f)
                close()
            }
            // M34.712 11.129 C32.343 4.839 25.009 3.077 18 3.077 c-0.15 0 -0.285 0.006 -0.432 0.007 -0.77 -0.018 -5.121 -0.148 -7.939 -0.897 A0.498 0.498 0 0 0 9 2.67 V4 s-4.126 -0.688 -6.676 -1.493 a0.501 0.501 0 0 0 -0.579 0.734 l2.14 3.567 C0.736 10.28 3 15.31 3 18 c0 8 3 8 3 8 h23 c3.497 0 4 -4.503 4 -8 0 -1.451 0.599 -2.767 0.137 -5.338 a0.93 0.93 0 0 1 1.15 -1.063 0.358 0.358 0 0 0 0.425 -0.47z
            path(
                fill = SolidColor(Color(0xFF4A4153)),
            ) {
                // M 34.712 11.129
                moveTo(x = 34.712f, y = 11.129f)
                // C 32.343 4.839 25.009 3.077 18 3.077
                curveTo(
                    x1 = 32.343f,
                    y1 = 4.839f,
                    x2 = 25.009f,
                    y2 = 3.077f,
                    x3 = 18.0f,
                    y3 = 3.077f,
                )
                // c -0.15 0 -0.285 0.006 -0.432 0.007
                curveToRelative(
                    dx1 = -0.15f,
                    dy1 = 0.0f,
                    dx2 = -0.285f,
                    dy2 = 0.006f,
                    dx3 = -0.432f,
                    dy3 = 0.007f,
                )
                // c -0.77 -0.018 -5.121 -0.148 -7.939 -0.897
                curveToRelative(
                    dx1 = -0.77f,
                    dy1 = -0.018f,
                    dx2 = -5.121f,
                    dy2 = -0.148f,
                    dx3 = -7.939f,
                    dy3 = -0.897f,
                )
                // A 0.498 0.498 0 0 0 9 2.67
                arcTo(
                    horizontalEllipseRadius = 0.498f,
                    verticalEllipseRadius = 0.498f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 9.0f,
                    y1 = 2.67f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
                // s -4.126 -0.688 -6.676 -1.493
                reflectiveCurveToRelative(
                    dx1 = -4.126f,
                    dy1 = -0.688f,
                    dx2 = -6.676f,
                    dy2 = -1.493f,
                )
                // a 0.501 0.501 0 0 0 -0.579 0.734
                arcToRelative(
                    a = 0.501f,
                    b = 0.501f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.579f,
                    dy1 = 0.734f,
                )
                // l 2.14 3.567
                lineToRelative(dx = 2.14f, dy = 3.567f)
                // C 0.736 10.28 3 15.31 3 18
                curveTo(
                    x1 = 0.736f,
                    y1 = 10.28f,
                    x2 = 3.0f,
                    y2 = 15.31f,
                    x3 = 3.0f,
                    y3 = 18.0f,
                )
                // c 0 8 3 8 3 8
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 8.0f,
                    dx2 = 3.0f,
                    dy2 = 8.0f,
                    dx3 = 3.0f,
                    dy3 = 8.0f,
                )
                // h 23
                horizontalLineToRelative(dx = 23.0f)
                // c 3.497 0 4 -4.503 4 -8
                curveToRelative(
                    dx1 = 3.497f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = -4.503f,
                    dx3 = 4.0f,
                    dy3 = -8.0f,
                )
                // c 0 -1.451 0.599 -2.767 0.137 -5.338
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.451f,
                    dx2 = 0.599f,
                    dy2 = -2.767f,
                    dx3 = 0.137f,
                    dy3 = -5.338f,
                )
                // a 0.93 0.93 0 0 1 1.15 -1.063
                arcToRelative(
                    a = 0.93f,
                    b = 0.93f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.15f,
                    dy1 = -1.063f,
                )
                // a 0.358 0.358 0 0 0 0.425 -0.47z
                arcToRelative(
                    a = 0.358f,
                    b = 0.358f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.425f,
                    dy1 = -0.47f,
                )
                close()
            }
            // M9 29 c-0.155 0 -0.309 0.036 -0.447 0.105 C5.602 30.581 5.038 35.898 5 36 h26 c-0.038 -0.102 -0.602 -5.419 -3.553 -6.895 A1.002 1.002 0 0 0 27 29 H9z
            path(
                fill = SolidColor(Color(0xFF69615D)),
            ) {
                // M 9 29
                moveTo(x = 9.0f, y = 29.0f)
                // c -0.155 0 -0.309 0.036 -0.447 0.105
                curveToRelative(
                    dx1 = -0.155f,
                    dy1 = 0.0f,
                    dx2 = -0.309f,
                    dy2 = 0.036f,
                    dx3 = -0.447f,
                    dy3 = 0.105f,
                )
                // C 5.602 30.581 5.038 35.898 5 36
                curveTo(
                    x1 = 5.602f,
                    y1 = 30.581f,
                    x2 = 5.038f,
                    y2 = 35.898f,
                    x3 = 5.0f,
                    y3 = 36.0f,
                )
                // h 26
                horizontalLineToRelative(dx = 26.0f)
                // c -0.038 -0.102 -0.602 -5.419 -3.553 -6.895
                curveToRelative(
                    dx1 = -0.038f,
                    dy1 = -0.102f,
                    dx2 = -0.602f,
                    dy2 = -5.419f,
                    dx3 = -3.553f,
                    dy3 = -6.895f,
                )
                // A 1.002 1.002 0 0 0 27 29
                arcTo(
                    horizontalEllipseRadius = 1.002f,
                    verticalEllipseRadius = 1.002f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 27.0f,
                    y1 = 29.0f,
                )
                // H 9z
                horizontalLineTo(x = 9.0f)
                close()
            }
            // M9 30 c-1.148 0.574 -1.307 1.806 -1.235 2.752 a5.396 5.396 0 0 1 -0.551 2.821 L7 36 h22 l-0.214 -0.427 a5.396 5.396 0 0 1 -0.551 -2.821 c0.072 -0.946 -0.087 -2.178 -1.235 -2.752 H9z
            path(
                fill = SolidColor(Color(0xFFA6D388)),
            ) {
                // M 9 30
                moveTo(x = 9.0f, y = 30.0f)
                // c -1.148 0.574 -1.307 1.806 -1.235 2.752
                curveToRelative(
                    dx1 = -1.148f,
                    dy1 = 0.574f,
                    dx2 = -1.307f,
                    dy2 = 1.806f,
                    dx3 = -1.235f,
                    dy3 = 2.752f,
                )
                // a 5.396 5.396 0 0 1 -0.551 2.821
                arcToRelative(
                    a = 5.396f,
                    b = 5.396f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.551f,
                    dy1 = 2.821f,
                )
                // L 7 36
                lineTo(x = 7.0f, y = 36.0f)
                // h 22
                horizontalLineToRelative(dx = 22.0f)
                // l -0.214 -0.427
                lineToRelative(dx = -0.214f, dy = -0.427f)
                // a 5.396 5.396 0 0 1 -0.551 -2.821
                arcToRelative(
                    a = 5.396f,
                    b = 5.396f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.551f,
                    dy1 = -2.821f,
                )
                // c 0.072 -0.946 -0.087 -2.178 -1.235 -2.752
                curveToRelative(
                    dx1 = 0.072f,
                    dy1 = -0.946f,
                    dx2 = -0.087f,
                    dy2 = -2.178f,
                    dx3 = -1.235f,
                    dy3 = -2.752f,
                )
                // H 9z
                horizontalLineTo(x = 9.0f)
                close()
            }
            // M17.946 33.923 c4.734 0 8.014 -0.675 10.285 -1.886 -0.062 -0.783 -0.357 -1.6 -1.231 -2.037 H9 c-0.86 0.43 -1.16 1.229 -1.228 2.001 2.365 1.304 5.675 1.922 10.174 1.922z
            path(
                fill = SolidColor(Color(0xFF77B255)),
            ) {
                // M 17.946 33.923
                moveTo(x = 17.946f, y = 33.923f)
                // c 4.734 0 8.014 -0.675 10.285 -1.886
                curveToRelative(
                    dx1 = 4.734f,
                    dy1 = 0.0f,
                    dx2 = 8.014f,
                    dy2 = -0.675f,
                    dx3 = 10.285f,
                    dy3 = -1.886f,
                )
                // c -0.062 -0.783 -0.357 -1.6 -1.231 -2.037
                curveToRelative(
                    dx1 = -0.062f,
                    dy1 = -0.783f,
                    dx2 = -0.357f,
                    dy2 = -1.6f,
                    dx3 = -1.231f,
                    dy3 = -2.037f,
                )
                // H 9
                horizontalLineTo(x = 9.0f)
                // c -0.86 0.43 -1.16 1.229 -1.228 2.001
                curveToRelative(
                    dx1 = -0.86f,
                    dy1 = 0.43f,
                    dx2 = -1.16f,
                    dy2 = 1.229f,
                    dx3 = -1.228f,
                    dy3 = 2.001f,
                )
                // c 2.365 1.304 5.675 1.922 10.174 1.922z
                curveToRelative(
                    dx1 = 2.365f,
                    dy1 = 1.304f,
                    dx2 = 5.675f,
                    dy2 = 1.922f,
                    dx3 = 10.174f,
                    dy3 = 1.922f,
                )
                close()
            }
            // M24.354 14.222 c1.045 0.385 2.045 1.714 2.175 2.448 0.13 0.735 0.261 1.329 -0.565 0.594 -3.312 -2.942 -6.919 -1.783 -10.495 -3.581 -2.497 -1.255 -3.257 -2.644 -3.257 -2.644 s-0.305 1.853 -4.091 3.741 c-1.46 0.729 -3.122 0.443 -3.122 3.22 0 7.483 -1.258 13.923 12.947 13.923 11.26 0 12.87 -3.814 13.054 -9.121 0.003 -3.604 -0.463 -5.009 -1.598 -6.272 -0.992 -1.105 -2.263 -1.993 -5.048 -2.308z
            path(
                fill = SolidColor(Color(0xFFA6D388)),
            ) {
                // M 24.354 14.222
                moveTo(x = 24.354f, y = 14.222f)
                // c 1.045 0.385 2.045 1.714 2.175 2.448
                curveToRelative(
                    dx1 = 1.045f,
                    dy1 = 0.385f,
                    dx2 = 2.045f,
                    dy2 = 1.714f,
                    dx3 = 2.175f,
                    dy3 = 2.448f,
                )
                // c 0.13 0.735 0.261 1.329 -0.565 0.594
                curveToRelative(
                    dx1 = 0.13f,
                    dy1 = 0.735f,
                    dx2 = 0.261f,
                    dy2 = 1.329f,
                    dx3 = -0.565f,
                    dy3 = 0.594f,
                )
                // c -3.312 -2.942 -6.919 -1.783 -10.495 -3.581
                curveToRelative(
                    dx1 = -3.312f,
                    dy1 = -2.942f,
                    dx2 = -6.919f,
                    dy2 = -1.783f,
                    dx3 = -10.495f,
                    dy3 = -3.581f,
                )
                // c -2.497 -1.255 -3.257 -2.644 -3.257 -2.644
                curveToRelative(
                    dx1 = -2.497f,
                    dy1 = -1.255f,
                    dx2 = -3.257f,
                    dy2 = -2.644f,
                    dx3 = -3.257f,
                    dy3 = -2.644f,
                )
                // s -0.305 1.853 -4.091 3.741
                reflectiveCurveToRelative(
                    dx1 = -0.305f,
                    dy1 = 1.853f,
                    dx2 = -4.091f,
                    dy2 = 3.741f,
                )
                // c -1.46 0.729 -3.122 0.443 -3.122 3.22
                curveToRelative(
                    dx1 = -1.46f,
                    dy1 = 0.729f,
                    dx2 = -3.122f,
                    dy2 = 0.443f,
                    dx3 = -3.122f,
                    dy3 = 3.22f,
                )
                // c 0 7.483 -1.258 13.923 12.947 13.923
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 7.483f,
                    dx2 = -1.258f,
                    dy2 = 13.923f,
                    dx3 = 12.947f,
                    dy3 = 13.923f,
                )
                // c 11.26 0 12.87 -3.814 13.054 -9.121
                curveToRelative(
                    dx1 = 11.26f,
                    dy1 = 0.0f,
                    dx2 = 12.87f,
                    dy2 = -3.814f,
                    dx3 = 13.054f,
                    dy3 = -9.121f,
                )
                // c 0.003 -3.604 -0.463 -5.009 -1.598 -6.272
                curveToRelative(
                    dx1 = 0.003f,
                    dy1 = -3.604f,
                    dx2 = -0.463f,
                    dy2 = -5.009f,
                    dx3 = -1.598f,
                    dy3 = -6.272f,
                )
                // c -0.992 -1.105 -2.263 -1.993 -5.048 -2.308z
                curveToRelative(
                    dx1 = -0.992f,
                    dy1 = -1.105f,
                    dx2 = -2.263f,
                    dy2 = -1.993f,
                    dx3 = -5.048f,
                    dy3 = -2.308f,
                )
                close()
            }
            // M20 24 h-4 a1 1 0 0 1 0 -2 h4 a1 1 0 0 1 0 2z
            path(
                fill = SolidColor(Color(0xFF77B255)),
            ) {
                // M 20 24
                moveTo(x = 20.0f, y = 24.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // a 1 1 0 0 1 0 -2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // a 1 1 0 0 1 0 2z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                )
                close()
            }
            // M23 28 H13 a1 1 0 0 1 0 -2 h10 a1 1 0 0 1 0 2z
            path(
                fill = SolidColor(Color(0xFF744629)),
            ) {
                // M 23 28
                moveTo(x = 23.0f, y = 28.0f)
                // H 13
                horizontalLineTo(x = 13.0f)
                // a 1 1 0 0 1 0 -2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                )
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // a 1 1 0 0 1 0 2z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                )
                close()
            }
            // M15 16 h-4 a1 1 0 0 0 0 2 h1 v2 a1 1 0 1 0 2 0 v-2 h1 a1 1 0 0 0 0 -2z M25 16 h-4 a1 1 0 0 0 0 2 h1 v2 a1 1 0 1 0 2 0 v-2 h1 a1 1 0 0 0 0 -2z
            path(
                fill = SolidColor(Color(0xFF3E721D)),
            ) {
                // M 15 16
                moveTo(x = 15.0f, y = 16.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // a 1 1 0 0 0 0 2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // a 1 1 0 1 0 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // a 1 1 0 0 0 0 -2z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                )
                close()
                // M 25 16
                moveTo(x = 25.0f, y = 16.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // a 1 1 0 0 0 0 2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // a 1 1 0 1 0 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // a 1 1 0 0 0 0 -2z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                )
                close()
            }
            // M31 13 c2 2 2 5 2 5 l3 -5 s-2 -2 -5 0z M5 13 c-2 2 -2 5 -2 5 l-3 -5 s2 -2 5 0z
            path(
                fill = SolidColor(Color(0xFFA6D388)),
            ) {
                // M 31 13
                moveTo(x = 31.0f, y = 13.0f)
                // c 2 2 2 5 2 5
                curveToRelative(
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                    dx2 = 2.0f,
                    dy2 = 5.0f,
                    dx3 = 2.0f,
                    dy3 = 5.0f,
                )
                // l 3 -5
                lineToRelative(dx = 3.0f, dy = -5.0f)
                // s -2 -2 -5 0z
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                    dx2 = -5.0f,
                    dy2 = 0.0f,
                )
                close()
                // M 5 13
                moveTo(x = 5.0f, y = 13.0f)
                // c -2 2 -2 5 -2 5
                curveToRelative(
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                    dx2 = -2.0f,
                    dy2 = 5.0f,
                    dx3 = -2.0f,
                    dy3 = 5.0f,
                )
                // l -3 -5
                lineToRelative(dx = -3.0f, dy = -5.0f)
                // s 2 -2 5 0z
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                    dx2 = 5.0f,
                    dy2 = 0.0f,
                )
                close()
            }
            // M0.983 30.656 a0.1 0.1 0 0 1 -0.116 0.028 0.1 0.1 0 0 1 -0.06 -0.104 c0.095 -0.792 0.452 -2.923 1.623 -4.209 a0.1 0.1 0 0 1 0.174 0.061 c0.129 1.932 -1.116 3.623 -1.621 4.224z M0.95 33.678 c-0.01 0.038 0.004 0.079 0.035 0.104 s0.074 0.028 0.109 0.009 c0.462 -0.248 0.983 -0.784 1.221 -1.485 0.289 -0.853 0.269 -1.434 0.226 -1.723 a0.102 0.102 0 0 0 -0.073 -0.082 0.1 0.1 0 0 0 -0.104 0.034 6.14 6.14 0 0 0 -0.794 1.279 c-0.299 0.655 -0.521 1.485 -0.62 1.864z M4.544 26.213 a0.1 0.1 0 0 0 -0.07 -0.085 0.097 0.097 0 0 0 -0.105 0.031 c-0.758 0.89 -0.897 2.264 -0.922 2.817 a0.1 0.1 0 0 0 0.173 0.074 3.532 3.532 0 0 0 0.924 -2.837z M5.713 29.237 a0.1 0.1 0 0 0 -0.06 -0.108 0.1 0.1 0 0 0 -0.119 0.033 c-0.951 1.296 -2.363 4.513 -2.831 5.606 a0.1 0.1 0 0 0 0.033 0.12 0.1 0.1 0 0 0 0.124 -0.004 c0.515 -0.44 1.532 -1.404 2.012 -2.528 0.483 -1.135 0.739 -2.485 0.841 -3.119z M30.161 29.66 a0.101 0.101 0 0 0 -0.114 -0.005 0.1 0.1 0 0 0 -0.044 0.105 c0.23 1.084 0.886 2.467 1.942 3.3 a0.1 0.1 0 0 0 0.114 0.007 0.1 0.1 0 0 0 0.046 -0.105 c-0.121 -0.615 -0.559 -2.244 -1.944 -3.302z M34.89 33.94 a0.1 0.1 0 0 0 0.145 -0.119 c-0.235 -0.677 -1.032 -2.6 -2.692 -3.283 a0.097 0.097 0 0 0 -0.104 0.018 0.1 0.1 0 0 0 -0.03 0.102 c0.525 1.879 2.097 2.943 2.681 3.282z M34.195 30.447 a0.1 0.1 0 0 0 0.128 -0.127 c-0.374 -1.05 -1.476 -2.639 -2.95 -3.014 a0.1 0.1 0 0 0 -0.12 0.126 c0.629 2.025 2.365 2.806 2.942 3.015z M34.958 28.656 a0.1 0.1 0 0 0 0.16 -0.102 c-0.263 -1.09 -1.298 -2.795 -2.646 -3.282 a0.1 0.1 0 0 0 -0.105 0.024 0.102 0.102 0 0 0 -0.023 0.105 c0.552 1.499 2.058 2.809 2.614 3.255z
            path(
                fill = SolidColor(Color(0xFF69615D)),
            ) {
                // M 0.983 30.656
                moveTo(x = 0.983f, y = 30.656f)
                // a 0.1 0.1 0 0 1 -0.116 0.028
                arcToRelative(
                    a = 0.1f,
                    b = 0.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.116f,
                    dy1 = 0.028f,
                )
                // a 0.1 0.1 0 0 1 -0.06 -0.104
                arcToRelative(
                    a = 0.1f,
                    b = 0.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.06f,
                    dy1 = -0.104f,
                )
                // c 0.095 -0.792 0.452 -2.923 1.623 -4.209
                curveToRelative(
                    dx1 = 0.095f,
                    dy1 = -0.792f,
                    dx2 = 0.452f,
                    dy2 = -2.923f,
                    dx3 = 1.623f,
                    dy3 = -4.209f,
                )
                // a 0.1 0.1 0 0 1 0.174 0.061
                arcToRelative(
                    a = 0.1f,
                    b = 0.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.174f,
                    dy1 = 0.061f,
                )
                // c 0.129 1.932 -1.116 3.623 -1.621 4.224z
                curveToRelative(
                    dx1 = 0.129f,
                    dy1 = 1.932f,
                    dx2 = -1.116f,
                    dy2 = 3.623f,
                    dx3 = -1.621f,
                    dy3 = 4.224f,
                )
                close()
                // M 0.95 33.678
                moveTo(x = 0.95f, y = 33.678f)
                // c -0.01 0.038 0.004 0.079 0.035 0.104
                curveToRelative(
                    dx1 = -0.01f,
                    dy1 = 0.038f,
                    dx2 = 0.004f,
                    dy2 = 0.079f,
                    dx3 = 0.035f,
                    dy3 = 0.104f,
                )
                // s 0.074 0.028 0.109 0.009
                reflectiveCurveToRelative(
                    dx1 = 0.074f,
                    dy1 = 0.028f,
                    dx2 = 0.109f,
                    dy2 = 0.009f,
                )
                // c 0.462 -0.248 0.983 -0.784 1.221 -1.485
                curveToRelative(
                    dx1 = 0.462f,
                    dy1 = -0.248f,
                    dx2 = 0.983f,
                    dy2 = -0.784f,
                    dx3 = 1.221f,
                    dy3 = -1.485f,
                )
                // c 0.289 -0.853 0.269 -1.434 0.226 -1.723
                curveToRelative(
                    dx1 = 0.289f,
                    dy1 = -0.853f,
                    dx2 = 0.269f,
                    dy2 = -1.434f,
                    dx3 = 0.226f,
                    dy3 = -1.723f,
                )
                // a 0.102 0.102 0 0 0 -0.073 -0.082
                arcToRelative(
                    a = 0.102f,
                    b = 0.102f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.073f,
                    dy1 = -0.082f,
                )
                // a 0.1 0.1 0 0 0 -0.104 0.034
                arcToRelative(
                    a = 0.1f,
                    b = 0.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.104f,
                    dy1 = 0.034f,
                )
                // a 6.14 6.14 0 0 0 -0.794 1.279
                arcToRelative(
                    a = 6.14f,
                    b = 6.14f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.794f,
                    dy1 = 1.279f,
                )
                // c -0.299 0.655 -0.521 1.485 -0.62 1.864z
                curveToRelative(
                    dx1 = -0.299f,
                    dy1 = 0.655f,
                    dx2 = -0.521f,
                    dy2 = 1.485f,
                    dx3 = -0.62f,
                    dy3 = 1.864f,
                )
                close()
                // M 4.544 26.213
                moveTo(x = 4.544f, y = 26.213f)
                // a 0.1 0.1 0 0 0 -0.07 -0.085
                arcToRelative(
                    a = 0.1f,
                    b = 0.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.07f,
                    dy1 = -0.085f,
                )
                // a 0.097 0.097 0 0 0 -0.105 0.031
                arcToRelative(
                    a = 0.097f,
                    b = 0.097f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.105f,
                    dy1 = 0.031f,
                )
                // c -0.758 0.89 -0.897 2.264 -0.922 2.817
                curveToRelative(
                    dx1 = -0.758f,
                    dy1 = 0.89f,
                    dx2 = -0.897f,
                    dy2 = 2.264f,
                    dx3 = -0.922f,
                    dy3 = 2.817f,
                )
                // a 0.1 0.1 0 0 0 0.173 0.074
                arcToRelative(
                    a = 0.1f,
                    b = 0.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.173f,
                    dy1 = 0.074f,
                )
                // a 3.532 3.532 0 0 0 0.924 -2.837z
                arcToRelative(
                    a = 3.532f,
                    b = 3.532f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.924f,
                    dy1 = -2.837f,
                )
                close()
                // M 5.713 29.237
                moveTo(x = 5.713f, y = 29.237f)
                // a 0.1 0.1 0 0 0 -0.06 -0.108
                arcToRelative(
                    a = 0.1f,
                    b = 0.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.06f,
                    dy1 = -0.108f,
                )
                // a 0.1 0.1 0 0 0 -0.119 0.033
                arcToRelative(
                    a = 0.1f,
                    b = 0.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.119f,
                    dy1 = 0.033f,
                )
                // c -0.951 1.296 -2.363 4.513 -2.831 5.606
                curveToRelative(
                    dx1 = -0.951f,
                    dy1 = 1.296f,
                    dx2 = -2.363f,
                    dy2 = 4.513f,
                    dx3 = -2.831f,
                    dy3 = 5.606f,
                )
                // a 0.1 0.1 0 0 0 0.033 0.12
                arcToRelative(
                    a = 0.1f,
                    b = 0.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.033f,
                    dy1 = 0.12f,
                )
                // a 0.1 0.1 0 0 0 0.124 -0.004
                arcToRelative(
                    a = 0.1f,
                    b = 0.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.124f,
                    dy1 = -0.004f,
                )
                // c 0.515 -0.44 1.532 -1.404 2.012 -2.528
                curveToRelative(
                    dx1 = 0.515f,
                    dy1 = -0.44f,
                    dx2 = 1.532f,
                    dy2 = -1.404f,
                    dx3 = 2.012f,
                    dy3 = -2.528f,
                )
                // c 0.483 -1.135 0.739 -2.485 0.841 -3.119z
                curveToRelative(
                    dx1 = 0.483f,
                    dy1 = -1.135f,
                    dx2 = 0.739f,
                    dy2 = -2.485f,
                    dx3 = 0.841f,
                    dy3 = -3.119f,
                )
                close()
                // M 30.161 29.66
                moveTo(x = 30.161f, y = 29.66f)
                // a 0.101 0.101 0 0 0 -0.114 -0.005
                arcToRelative(
                    a = 0.101f,
                    b = 0.101f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.114f,
                    dy1 = -0.005f,
                )
                // a 0.1 0.1 0 0 0 -0.044 0.105
                arcToRelative(
                    a = 0.1f,
                    b = 0.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.044f,
                    dy1 = 0.105f,
                )
                // c 0.23 1.084 0.886 2.467 1.942 3.3
                curveToRelative(
                    dx1 = 0.23f,
                    dy1 = 1.084f,
                    dx2 = 0.886f,
                    dy2 = 2.467f,
                    dx3 = 1.942f,
                    dy3 = 3.3f,
                )
                // a 0.1 0.1 0 0 0 0.114 0.007
                arcToRelative(
                    a = 0.1f,
                    b = 0.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.114f,
                    dy1 = 0.007f,
                )
                // a 0.1 0.1 0 0 0 0.046 -0.105
                arcToRelative(
                    a = 0.1f,
                    b = 0.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.046f,
                    dy1 = -0.105f,
                )
                // c -0.121 -0.615 -0.559 -2.244 -1.944 -3.302z
                curveToRelative(
                    dx1 = -0.121f,
                    dy1 = -0.615f,
                    dx2 = -0.559f,
                    dy2 = -2.244f,
                    dx3 = -1.944f,
                    dy3 = -3.302f,
                )
                close()
                // M 34.89 33.94
                moveTo(x = 34.89f, y = 33.94f)
                // a 0.1 0.1 0 0 0 0.145 -0.119
                arcToRelative(
                    a = 0.1f,
                    b = 0.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.145f,
                    dy1 = -0.119f,
                )
                // c -0.235 -0.677 -1.032 -2.6 -2.692 -3.283
                curveToRelative(
                    dx1 = -0.235f,
                    dy1 = -0.677f,
                    dx2 = -1.032f,
                    dy2 = -2.6f,
                    dx3 = -2.692f,
                    dy3 = -3.283f,
                )
                // a 0.097 0.097 0 0 0 -0.104 0.018
                arcToRelative(
                    a = 0.097f,
                    b = 0.097f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.104f,
                    dy1 = 0.018f,
                )
                // a 0.1 0.1 0 0 0 -0.03 0.102
                arcToRelative(
                    a = 0.1f,
                    b = 0.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.03f,
                    dy1 = 0.102f,
                )
                // c 0.525 1.879 2.097 2.943 2.681 3.282z
                curveToRelative(
                    dx1 = 0.525f,
                    dy1 = 1.879f,
                    dx2 = 2.097f,
                    dy2 = 2.943f,
                    dx3 = 2.681f,
                    dy3 = 3.282f,
                )
                close()
                // M 34.195 30.447
                moveTo(x = 34.195f, y = 30.447f)
                // a 0.1 0.1 0 0 0 0.128 -0.127
                arcToRelative(
                    a = 0.1f,
                    b = 0.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.128f,
                    dy1 = -0.127f,
                )
                // c -0.374 -1.05 -1.476 -2.639 -2.95 -3.014
                curveToRelative(
                    dx1 = -0.374f,
                    dy1 = -1.05f,
                    dx2 = -1.476f,
                    dy2 = -2.639f,
                    dx3 = -2.95f,
                    dy3 = -3.014f,
                )
                // a 0.1 0.1 0 0 0 -0.12 0.126
                arcToRelative(
                    a = 0.1f,
                    b = 0.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.12f,
                    dy1 = 0.126f,
                )
                // c 0.629 2.025 2.365 2.806 2.942 3.015z
                curveToRelative(
                    dx1 = 0.629f,
                    dy1 = 2.025f,
                    dx2 = 2.365f,
                    dy2 = 2.806f,
                    dx3 = 2.942f,
                    dy3 = 3.015f,
                )
                close()
                // M 34.958 28.656
                moveTo(x = 34.958f, y = 28.656f)
                // a 0.1 0.1 0 0 0 0.16 -0.102
                arcToRelative(
                    a = 0.1f,
                    b = 0.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.16f,
                    dy1 = -0.102f,
                )
                // c -0.263 -1.09 -1.298 -2.795 -2.646 -3.282
                curveToRelative(
                    dx1 = -0.263f,
                    dy1 = -1.09f,
                    dx2 = -1.298f,
                    dy2 = -2.795f,
                    dx3 = -2.646f,
                    dy3 = -3.282f,
                )
                // a 0.1 0.1 0 0 0 -0.105 0.024
                arcToRelative(
                    a = 0.1f,
                    b = 0.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.105f,
                    dy1 = 0.024f,
                )
                // a 0.102 0.102 0 0 0 -0.023 0.105
                arcToRelative(
                    a = 0.102f,
                    b = 0.102f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.023f,
                    dy1 = 0.105f,
                )
                // c 0.552 1.499 2.058 2.809 2.614 3.255z
                curveToRelative(
                    dx1 = 0.552f,
                    dy1 = 1.499f,
                    dx2 = 2.058f,
                    dy2 = 2.809f,
                    dx3 = 2.614f,
                    dy3 = 3.255f,
                )
                close()
            }
            // M31.505 13.587 c0.638 -0.509 1.681 -0.932 3.117 -0.571 a0.5 0.5 0 1 1 -0.244 0.97 c-1.224 -0.309 -1.959 0.114 -2.327 0.447 a6.29 6.29 0 0 0 -0.546 -0.846z M4.495 13.586 c-0.637 -0.509 -1.68 -0.932 -3.117 -0.571 a0.5 0.5 0 1 0 0.244 0.97 c1.225 -0.308 1.959 0.115 2.327 0.446 a6.41 6.41 0 0 1 0.546 -0.845z
            path(
                fill = SolidColor(Color(0xFF77B255)),
            ) {
                // M 31.505 13.587
                moveTo(x = 31.505f, y = 13.587f)
                // c 0.638 -0.509 1.681 -0.932 3.117 -0.571
                curveToRelative(
                    dx1 = 0.638f,
                    dy1 = -0.509f,
                    dx2 = 1.681f,
                    dy2 = -0.932f,
                    dx3 = 3.117f,
                    dy3 = -0.571f,
                )
                // a 0.5 0.5 0 1 1 -0.244 0.97
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -0.244f,
                    dy1 = 0.97f,
                )
                // c -1.224 -0.309 -1.959 0.114 -2.327 0.447
                curveToRelative(
                    dx1 = -1.224f,
                    dy1 = -0.309f,
                    dx2 = -1.959f,
                    dy2 = 0.114f,
                    dx3 = -2.327f,
                    dy3 = 0.447f,
                )
                // a 6.29 6.29 0 0 0 -0.546 -0.846z
                arcToRelative(
                    a = 6.29f,
                    b = 6.29f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.546f,
                    dy1 = -0.846f,
                )
                close()
                // M 4.495 13.586
                moveTo(x = 4.495f, y = 13.586f)
                // c -0.637 -0.509 -1.68 -0.932 -3.117 -0.571
                curveToRelative(
                    dx1 = -0.637f,
                    dy1 = -0.509f,
                    dx2 = -1.68f,
                    dy2 = -0.932f,
                    dx3 = -3.117f,
                    dy3 = -0.571f,
                )
                // a 0.5 0.5 0 1 0 0.244 0.97
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 0.244f,
                    dy1 = 0.97f,
                )
                // c 1.225 -0.308 1.959 0.115 2.327 0.446
                curveToRelative(
                    dx1 = 1.225f,
                    dy1 = -0.308f,
                    dx2 = 1.959f,
                    dy2 = 0.115f,
                    dx3 = 2.327f,
                    dy3 = 0.446f,
                )
                // a 6.41 6.41 0 0 1 0.546 -0.845z
                arcToRelative(
                    a = 6.41f,
                    b = 6.41f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.546f,
                    dy1 = -0.845f,
                )
                close()
            }
            // M13 27 v-2 s2 0.667 2 2 h-2z M23 27 v-2 s-2 0.667 -2 2 h2z
            path(
                fill = SolidColor(Color(0xFFFFEBA5)),
            ) {
                // M 13 27
                moveTo(x = 13.0f, y = 27.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // s 2 0.667 2 2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.667f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                )
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
                // M 23 27
                moveTo(x = 23.0f, y = 27.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // s -2 0.667 -2 2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 0.667f,
                    dx2 = -2.0f,
                    dy2 = 2.0f,
                )
                // h 2z
                horizontalLineToRelative(dx = 2.0f)
                close()
            }
        }.build().also { _emoji1f9cc = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f9cc: ImageVector? = null
