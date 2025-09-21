package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f301: ImageVector
    get() {
        val current = _emoji1f301
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f301",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M32 0 H4 a4 4 0 0 0 -4 4 v7 h36 V4 a4 4 0 0 0 -4 -4z
            path(
                fill = SolidColor(Color(0xFF88C9F9)),
            ) {
                // M 32 0
                moveTo(x = 32.0f, y = 0.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // a 4 4 0 0 0 -4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = 4.0f,
                )
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // a 4 4 0 0 0 -4 -4z
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = -4.0f,
                )
                close()
            }
            // M36 16.368 V9.257 a4.148 4.148 0 0 0 -2.188 -0.632 c-1.325 0 -2.491 0.627 -3.259 1.588 A4.466 4.466 0 0 0 27.5 9 c-0.721 0 -1.392 0.185 -1.996 0.486 C24.763 8.018 23.257 7 21.5 7 c-0.607 0 -1.184 0.124 -1.712 0.342 a3.49 3.49 0 0 0 -6.189 -0.8 A4.443 4.443 0 0 0 11.5 6 c-1.641 0 -3.062 0.887 -3.848 2.198 A4.99 4.99 0 0 0 3 5 a4.955 4.955 0 0 0 -3 1.022 v7.955 C0.838 14.611 24.5 18 24.5 18 s10.862 -1.238 11.5 -1.632z
            path(
                fill = SolidColor(Color(0xFFE1E8ED)),
            ) {
                // M 36 16.368
                moveTo(x = 36.0f, y = 16.368f)
                // V 9.257
                verticalLineTo(y = 9.257f)
                // a 4.148 4.148 0 0 0 -2.188 -0.632
                arcToRelative(
                    a = 4.148f,
                    b = 4.148f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.188f,
                    dy1 = -0.632f,
                )
                // c -1.325 0 -2.491 0.627 -3.259 1.588
                curveToRelative(
                    dx1 = -1.325f,
                    dy1 = 0.0f,
                    dx2 = -2.491f,
                    dy2 = 0.627f,
                    dx3 = -3.259f,
                    dy3 = 1.588f,
                )
                // A 4.466 4.466 0 0 0 27.5 9
                arcTo(
                    horizontalEllipseRadius = 4.466f,
                    verticalEllipseRadius = 4.466f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 27.5f,
                    y1 = 9.0f,
                )
                // c -0.721 0 -1.392 0.185 -1.996 0.486
                curveToRelative(
                    dx1 = -0.721f,
                    dy1 = 0.0f,
                    dx2 = -1.392f,
                    dy2 = 0.185f,
                    dx3 = -1.996f,
                    dy3 = 0.486f,
                )
                // C 24.763 8.018 23.257 7 21.5 7
                curveTo(
                    x1 = 24.763f,
                    y1 = 8.018f,
                    x2 = 23.257f,
                    y2 = 7.0f,
                    x3 = 21.5f,
                    y3 = 7.0f,
                )
                // c -0.607 0 -1.184 0.124 -1.712 0.342
                curveToRelative(
                    dx1 = -0.607f,
                    dy1 = 0.0f,
                    dx2 = -1.184f,
                    dy2 = 0.124f,
                    dx3 = -1.712f,
                    dy3 = 0.342f,
                )
                // a 3.49 3.49 0 0 0 -6.189 -0.8
                arcToRelative(
                    a = 3.49f,
                    b = 3.49f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -6.189f,
                    dy1 = -0.8f,
                )
                // A 4.443 4.443 0 0 0 11.5 6
                arcTo(
                    horizontalEllipseRadius = 4.443f,
                    verticalEllipseRadius = 4.443f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 11.5f,
                    y1 = 6.0f,
                )
                // c -1.641 0 -3.062 0.887 -3.848 2.198
                curveToRelative(
                    dx1 = -1.641f,
                    dy1 = 0.0f,
                    dx2 = -3.062f,
                    dy2 = 0.887f,
                    dx3 = -3.848f,
                    dy3 = 2.198f,
                )
                // A 4.99 4.99 0 0 0 3 5
                arcTo(
                    horizontalEllipseRadius = 4.99f,
                    verticalEllipseRadius = 4.99f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 3.0f,
                    y1 = 5.0f,
                )
                // a 4.955 4.955 0 0 0 -3 1.022
                arcToRelative(
                    a = 4.955f,
                    b = 4.955f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = 1.022f,
                )
                // v 7.955
                verticalLineToRelative(dy = 7.955f)
                // C 0.838 14.611 24.5 18 24.5 18
                curveTo(
                    x1 = 0.838f,
                    y1 = 14.611f,
                    x2 = 24.5f,
                    y2 = 18.0f,
                    x3 = 24.5f,
                    y3 = 18.0f,
                )
                // s 10.862 -1.238 11.5 -1.632z
                reflectiveCurveToRelative(
                    dx1 = 10.862f,
                    dy1 = -1.238f,
                    dx2 = 11.5f,
                    dy2 = -1.632f,
                )
                close()
            }
            // M36 14.771 C35.157 13.7 33.864 13 32.396 13 c-1.997 0 -3.681 1.279 -4.318 3.059 A3.35 3.35 0 0 0 27.5 16 c-0.82 0 -1.565 0.294 -2.162 0.767 C22.146 14.452 22.265 12 18 12 a3.974 3.974 0 0 0 -3.024 1.409 A4.989 4.989 0 0 0 13 13 c-0.18 0 -0.35 0.034 -0.525 0.053 A6.998 6.998 0 0 0 6 8.709 a6.989 6.989 0 0 0 -6 3.408 v13.544 l32.396 -1.452 s2.761 -1.343 3.604 -2.966 v-6.472z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 36 14.771
                moveTo(x = 36.0f, y = 14.771f)
                // C 35.157 13.7 33.864 13 32.396 13
                curveTo(
                    x1 = 35.157f,
                    y1 = 13.7f,
                    x2 = 33.864f,
                    y2 = 13.0f,
                    x3 = 32.396f,
                    y3 = 13.0f,
                )
                // c -1.997 0 -3.681 1.279 -4.318 3.059
                curveToRelative(
                    dx1 = -1.997f,
                    dy1 = 0.0f,
                    dx2 = -3.681f,
                    dy2 = 1.279f,
                    dx3 = -4.318f,
                    dy3 = 3.059f,
                )
                // A 3.35 3.35 0 0 0 27.5 16
                arcTo(
                    horizontalEllipseRadius = 3.35f,
                    verticalEllipseRadius = 3.35f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 27.5f,
                    y1 = 16.0f,
                )
                // c -0.82 0 -1.565 0.294 -2.162 0.767
                curveToRelative(
                    dx1 = -0.82f,
                    dy1 = 0.0f,
                    dx2 = -1.565f,
                    dy2 = 0.294f,
                    dx3 = -2.162f,
                    dy3 = 0.767f,
                )
                // C 22.146 14.452 22.265 12 18 12
                curveTo(
                    x1 = 22.146f,
                    y1 = 14.452f,
                    x2 = 22.265f,
                    y2 = 12.0f,
                    x3 = 18.0f,
                    y3 = 12.0f,
                )
                // a 3.974 3.974 0 0 0 -3.024 1.409
                arcToRelative(
                    a = 3.974f,
                    b = 3.974f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.024f,
                    dy1 = 1.409f,
                )
                // A 4.989 4.989 0 0 0 13 13
                arcTo(
                    horizontalEllipseRadius = 4.989f,
                    verticalEllipseRadius = 4.989f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 13.0f,
                    y1 = 13.0f,
                )
                // c -0.18 0 -0.35 0.034 -0.525 0.053
                curveToRelative(
                    dx1 = -0.18f,
                    dy1 = 0.0f,
                    dx2 = -0.35f,
                    dy2 = 0.034f,
                    dx3 = -0.525f,
                    dy3 = 0.053f,
                )
                // A 6.998 6.998 0 0 0 6 8.709
                arcTo(
                    horizontalEllipseRadius = 6.998f,
                    verticalEllipseRadius = 6.998f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 6.0f,
                    y1 = 8.709f,
                )
                // a 6.989 6.989 0 0 0 -6 3.408
                arcToRelative(
                    a = 6.989f,
                    b = 6.989f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -6.0f,
                    dy1 = 3.408f,
                )
                // v 13.544
                verticalLineToRelative(dy = 13.544f)
                // l 32.396 -1.452
                lineToRelative(dx = 32.396f, dy = -1.452f)
                // s 2.761 -1.343 3.604 -2.966
                reflectiveCurveToRelative(
                    dx1 = 2.761f,
                    dy1 = -1.343f,
                    dx2 = 3.604f,
                    dy2 = -2.966f,
                )
                // v -6.472z
                verticalLineToRelative(dy = -6.472f)
                close()
            }
            // M36 30.499 V20.422 A4.979 4.979 0 0 0 34 20 a4.99 4.99 0 0 0 -4.652 3.198 C28.562 21.887 27.141 21 25.5 21 c-0.763 0 -1.47 0.207 -2.099 0.542 a3.49 3.49 0 0 0 -6.189 0.8 A4.474 4.474 0 0 0 15.5 22 c-1.757 0 -3.263 1.018 -4.004 2.486 A4.453 4.453 0 0 0 9.5 24 a4.47 4.47 0 0 0 -3.054 1.213 c-0.768 -0.961 -1.934 -1.588 -3.259 -1.588 -1.284 0 -2.419 0.591 -3.188 1.501 v5.373 H36z
            path(
                fill = SolidColor(Color(0xFFE1E8ED)),
            ) {
                // M 36 30.499
                moveTo(x = 36.0f, y = 30.499f)
                // V 20.422
                verticalLineTo(y = 20.422f)
                // A 4.979 4.979 0 0 0 34 20
                arcTo(
                    horizontalEllipseRadius = 4.979f,
                    verticalEllipseRadius = 4.979f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 34.0f,
                    y1 = 20.0f,
                )
                // a 4.99 4.99 0 0 0 -4.652 3.198
                arcToRelative(
                    a = 4.99f,
                    b = 4.99f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.652f,
                    dy1 = 3.198f,
                )
                // C 28.562 21.887 27.141 21 25.5 21
                curveTo(
                    x1 = 28.562f,
                    y1 = 21.887f,
                    x2 = 27.141f,
                    y2 = 21.0f,
                    x3 = 25.5f,
                    y3 = 21.0f,
                )
                // c -0.763 0 -1.47 0.207 -2.099 0.542
                curveToRelative(
                    dx1 = -0.763f,
                    dy1 = 0.0f,
                    dx2 = -1.47f,
                    dy2 = 0.207f,
                    dx3 = -2.099f,
                    dy3 = 0.542f,
                )
                // a 3.49 3.49 0 0 0 -6.189 0.8
                arcToRelative(
                    a = 3.49f,
                    b = 3.49f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -6.189f,
                    dy1 = 0.8f,
                )
                // A 4.474 4.474 0 0 0 15.5 22
                arcTo(
                    horizontalEllipseRadius = 4.474f,
                    verticalEllipseRadius = 4.474f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 15.5f,
                    y1 = 22.0f,
                )
                // c -1.757 0 -3.263 1.018 -4.004 2.486
                curveToRelative(
                    dx1 = -1.757f,
                    dy1 = 0.0f,
                    dx2 = -3.263f,
                    dy2 = 1.018f,
                    dx3 = -4.004f,
                    dy3 = 2.486f,
                )
                // A 4.453 4.453 0 0 0 9.5 24
                arcTo(
                    horizontalEllipseRadius = 4.453f,
                    verticalEllipseRadius = 4.453f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 9.5f,
                    y1 = 24.0f,
                )
                // a 4.47 4.47 0 0 0 -3.054 1.213
                arcToRelative(
                    a = 4.47f,
                    b = 4.47f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.054f,
                    dy1 = 1.213f,
                )
                // c -0.768 -0.961 -1.934 -1.588 -3.259 -1.588
                curveToRelative(
                    dx1 = -0.768f,
                    dy1 = -0.961f,
                    dx2 = -1.934f,
                    dy2 = -1.588f,
                    dx3 = -3.259f,
                    dy3 = -1.588f,
                )
                // c -1.284 0 -2.419 0.591 -3.188 1.501
                curveToRelative(
                    dx1 = -1.284f,
                    dy1 = 0.0f,
                    dx2 = -2.419f,
                    dy2 = 0.591f,
                    dx3 = -3.188f,
                    dy3 = 1.501f,
                )
                // v 5.373
                verticalLineToRelative(dy = 5.373f)
                // H 36z
                horizontalLineTo(x = 36.0f)
                close()
            }
            // M36 24.059 C32.465 22.229 25.013 17.594 20 9 c0 0 0 -2 -2 -2 s-2 2 -2 2 C10.987 17.594 3.535 22.229 0 24.059 v2.068 a42.972 42.972 0 0 0 4 -2.169 V24 h2 v-1.341 a43.982 43.982 0 0 0 4 -3.094 V27 h2 v-9.292 a38.473 38.473 0 0 0 4 -4.655 V24 h4 V13.054 a38.55 38.55 0 0 0 4 4.655 V26 h2 v-6.435 a44.043 44.043 0 0 0 4 3.095 V25 h2 v-1.042 a42.972 42.972 0 0 0 4 2.169 v-2.068z
            path(
                fill = SolidColor(Color(0xFFFE5011)),
            ) {
                // M 36 24.059
                moveTo(x = 36.0f, y = 24.059f)
                // C 32.465 22.229 25.013 17.594 20 9
                curveTo(
                    x1 = 32.465f,
                    y1 = 22.229f,
                    x2 = 25.013f,
                    y2 = 17.594f,
                    x3 = 20.0f,
                    y3 = 9.0f,
                )
                // c 0 0 0 -2 -2 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 0.0f,
                    dy2 = -2.0f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // s -2 2 -2 2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                    dx2 = -2.0f,
                    dy2 = 2.0f,
                )
                // C 10.987 17.594 3.535 22.229 0 24.059
                curveTo(
                    x1 = 10.987f,
                    y1 = 17.594f,
                    x2 = 3.535f,
                    y2 = 22.229f,
                    x3 = 0.0f,
                    y3 = 24.059f,
                )
                // v 2.068
                verticalLineToRelative(dy = 2.068f)
                // a 42.972 42.972 0 0 0 4 -2.169
                arcToRelative(
                    a = 42.972f,
                    b = 42.972f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = -2.169f,
                )
                // V 24
                verticalLineTo(y = 24.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -1.341
                verticalLineToRelative(dy = -1.341f)
                // a 43.982 43.982 0 0 0 4 -3.094
                arcToRelative(
                    a = 43.982f,
                    b = 43.982f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = -3.094f,
                )
                // V 27
                verticalLineTo(y = 27.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -9.292
                verticalLineToRelative(dy = -9.292f)
                // a 38.473 38.473 0 0 0 4 -4.655
                arcToRelative(
                    a = 38.473f,
                    b = 38.473f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = -4.655f,
                )
                // V 24
                verticalLineTo(y = 24.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // V 13.054
                verticalLineTo(y = 13.054f)
                // a 38.55 38.55 0 0 0 4 4.655
                arcToRelative(
                    a = 38.55f,
                    b = 38.55f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = 4.655f,
                )
                // V 26
                verticalLineTo(y = 26.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -6.435
                verticalLineToRelative(dy = -6.435f)
                // a 44.043 44.043 0 0 0 4 3.095
                arcToRelative(
                    a = 44.043f,
                    b = 44.043f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = 3.095f,
                )
                // V 25
                verticalLineTo(y = 25.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -1.042
                verticalLineToRelative(dy = -1.042f)
                // a 42.972 42.972 0 0 0 4 2.169
                arcToRelative(
                    a = 42.972f,
                    b = 42.972f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = 2.169f,
                )
                // v -2.068z
                verticalLineToRelative(dy = -2.068f)
                close()
            }
            // M25 25 c-0.821 0 -1.582 0.249 -2.217 0.673 a4.355 4.355 0 0 0 -4.534 -2.863 4.349 4.349 0 0 0 -3.777 3.298 3.258 3.258 0 0 0 -0.55 0 3.289 3.289 0 0 0 -1.965 0.93 3.76 3.76 0 0 0 -2.278 -0.498 3.708 3.708 0 0 0 -0.942 0.236 c-0.003 -0.047 0.004 -0.093 0 -0.139 a3.79 3.79 0 0 0 -4.155 -3.387 3.767 3.767 0 0 0 -2.716 1.619 A4.699 4.699 0 0 0 0 24.672 V32 c0 0.773 0.23 1.489 0.61 2.101 C0.715 34.098 29 31.209 29 29 s-1.791 -4 -4 -4z
            path(
                fill = SolidColor(Color(0xFFF5F8FA)),
            ) {
                // M 25 25
                moveTo(x = 25.0f, y = 25.0f)
                // c -0.821 0 -1.582 0.249 -2.217 0.673
                curveToRelative(
                    dx1 = -0.821f,
                    dy1 = 0.0f,
                    dx2 = -1.582f,
                    dy2 = 0.249f,
                    dx3 = -2.217f,
                    dy3 = 0.673f,
                )
                // a 4.355 4.355 0 0 0 -4.534 -2.863
                arcToRelative(
                    a = 4.355f,
                    b = 4.355f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.534f,
                    dy1 = -2.863f,
                )
                // a 4.349 4.349 0 0 0 -3.777 3.298
                arcToRelative(
                    a = 4.349f,
                    b = 4.349f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.777f,
                    dy1 = 3.298f,
                )
                // a 3.258 3.258 0 0 0 -0.55 0
                arcToRelative(
                    a = 3.258f,
                    b = 3.258f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.55f,
                    dy1 = 0.0f,
                )
                // a 3.289 3.289 0 0 0 -1.965 0.93
                arcToRelative(
                    a = 3.289f,
                    b = 3.289f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.965f,
                    dy1 = 0.93f,
                )
                // a 3.76 3.76 0 0 0 -2.278 -0.498
                arcToRelative(
                    a = 3.76f,
                    b = 3.76f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.278f,
                    dy1 = -0.498f,
                )
                // a 3.708 3.708 0 0 0 -0.942 0.236
                arcToRelative(
                    a = 3.708f,
                    b = 3.708f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.942f,
                    dy1 = 0.236f,
                )
                // c -0.003 -0.047 0.004 -0.093 0 -0.139
                curveToRelative(
                    dx1 = -0.003f,
                    dy1 = -0.047f,
                    dx2 = 0.004f,
                    dy2 = -0.093f,
                    dx3 = 0.0f,
                    dy3 = -0.139f,
                )
                // a 3.79 3.79 0 0 0 -4.155 -3.387
                arcToRelative(
                    a = 3.79f,
                    b = 3.79f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.155f,
                    dy1 = -3.387f,
                )
                // a 3.767 3.767 0 0 0 -2.716 1.619
                arcToRelative(
                    a = 3.767f,
                    b = 3.767f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.716f,
                    dy1 = 1.619f,
                )
                // A 4.699 4.699 0 0 0 0 24.672
                arcTo(
                    horizontalEllipseRadius = 4.699f,
                    verticalEllipseRadius = 4.699f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 0.0f,
                    y1 = 24.672f,
                )
                // V 32
                verticalLineTo(y = 32.0f)
                // c 0 0.773 0.23 1.489 0.61 2.101
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.773f,
                    dx2 = 0.23f,
                    dy2 = 1.489f,
                    dx3 = 0.61f,
                    dy3 = 2.101f,
                )
                // C 0.715 34.098 29 31.209 29 29
                curveTo(
                    x1 = 0.715f,
                    y1 = 34.098f,
                    x2 = 29.0f,
                    y2 = 31.209f,
                    x3 = 29.0f,
                    y3 = 29.0f,
                )
                // s -1.791 -4 -4 -4z
                reflectiveCurveToRelative(
                    dx1 = -1.791f,
                    dy1 = -4.0f,
                    dx2 = -4.0f,
                    dy2 = -4.0f,
                )
                close()
            }
            // M32 36 a4 4 0 0 0 4 -4 v-7.608 a6.962 6.962 0 0 0 -3 -0.683 6.998 6.998 0 0 0 -6.475 4.344 C26.35 28.034 26.18 28 26 28 c-0.702 0 -1.369 0.147 -1.976 0.409 A3.974 3.974 0 0 0 21 27 a4 4 0 0 0 -4 4 c0 0.05 0.013 0.097 0.015 0.146 A3.956 3.956 0 0 0 16 31 c-0.876 0 -1.679 0.289 -2.338 0.767 A3.468 3.468 0 0 0 11.5 31 a3.33 3.33 0 0 0 -0.577 0.059 C10.286 29.279 8.602 28 6.604 28 c-1.987 0 -3.665 1.266 -4.31 3.03 C2.195 31.022 2.101 31 2 31 c-0.732 0 -1.41 0.211 -2 0.555 V32 a4 4 0 0 0 4 4 h28z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 32 36
                moveTo(x = 32.0f, y = 36.0f)
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
                // v -7.608
                verticalLineToRelative(dy = -7.608f)
                // a 6.962 6.962 0 0 0 -3 -0.683
                arcToRelative(
                    a = 6.962f,
                    b = 6.962f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = -0.683f,
                )
                // a 6.998 6.998 0 0 0 -6.475 4.344
                arcToRelative(
                    a = 6.998f,
                    b = 6.998f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -6.475f,
                    dy1 = 4.344f,
                )
                // C 26.35 28.034 26.18 28 26 28
                curveTo(
                    x1 = 26.35f,
                    y1 = 28.034f,
                    x2 = 26.18f,
                    y2 = 28.0f,
                    x3 = 26.0f,
                    y3 = 28.0f,
                )
                // c -0.702 0 -1.369 0.147 -1.976 0.409
                curveToRelative(
                    dx1 = -0.702f,
                    dy1 = 0.0f,
                    dx2 = -1.369f,
                    dy2 = 0.147f,
                    dx3 = -1.976f,
                    dy3 = 0.409f,
                )
                // A 3.974 3.974 0 0 0 21 27
                arcTo(
                    horizontalEllipseRadius = 3.974f,
                    verticalEllipseRadius = 3.974f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 21.0f,
                    y1 = 27.0f,
                )
                // a 4 4 0 0 0 -4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = 4.0f,
                )
                // c 0 0.05 0.013 0.097 0.015 0.146
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.05f,
                    dx2 = 0.013f,
                    dy2 = 0.097f,
                    dx3 = 0.015f,
                    dy3 = 0.146f,
                )
                // A 3.956 3.956 0 0 0 16 31
                arcTo(
                    horizontalEllipseRadius = 3.956f,
                    verticalEllipseRadius = 3.956f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 31.0f,
                )
                // c -0.876 0 -1.679 0.289 -2.338 0.767
                curveToRelative(
                    dx1 = -0.876f,
                    dy1 = 0.0f,
                    dx2 = -1.679f,
                    dy2 = 0.289f,
                    dx3 = -2.338f,
                    dy3 = 0.767f,
                )
                // A 3.468 3.468 0 0 0 11.5 31
                arcTo(
                    horizontalEllipseRadius = 3.468f,
                    verticalEllipseRadius = 3.468f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 11.5f,
                    y1 = 31.0f,
                )
                // a 3.33 3.33 0 0 0 -0.577 0.059
                arcToRelative(
                    a = 3.33f,
                    b = 3.33f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.577f,
                    dy1 = 0.059f,
                )
                // C 10.286 29.279 8.602 28 6.604 28
                curveTo(
                    x1 = 10.286f,
                    y1 = 29.279f,
                    x2 = 8.602f,
                    y2 = 28.0f,
                    x3 = 6.604f,
                    y3 = 28.0f,
                )
                // c -1.987 0 -3.665 1.266 -4.31 3.03
                curveToRelative(
                    dx1 = -1.987f,
                    dy1 = 0.0f,
                    dx2 = -3.665f,
                    dy2 = 1.266f,
                    dx3 = -4.31f,
                    dy3 = 3.03f,
                )
                // C 2.195 31.022 2.101 31 2 31
                curveTo(
                    x1 = 2.195f,
                    y1 = 31.022f,
                    x2 = 2.101f,
                    y2 = 31.0f,
                    x3 = 2.0f,
                    y3 = 31.0f,
                )
                // c -0.732 0 -1.41 0.211 -2 0.555
                curveToRelative(
                    dx1 = -0.732f,
                    dy1 = 0.0f,
                    dx2 = -1.41f,
                    dy2 = 0.211f,
                    dx3 = -2.0f,
                    dy3 = 0.555f,
                )
                // V 32
                verticalLineTo(y = 32.0f)
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
                // h 28z
                horizontalLineToRelative(dx = 28.0f)
                close()
            }
        }.build().also { _emoji1f301 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f301: ImageVector? = null
