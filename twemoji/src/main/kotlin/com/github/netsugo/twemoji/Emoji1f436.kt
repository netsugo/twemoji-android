package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f436: ImageVector
    get() {
        val current = _emoji1f436
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f436",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M15 27 v6 s0 3 3 3 3 -3 3 -3 v-6 h-6z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 15 27
                moveTo(x = 15.0f, y = 27.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // s 0 3 3 3
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.0f,
                    dx2 = 3.0f,
                    dy2 = 3.0f,
                )
                // s 3 -3 3 -3
                reflectiveCurveToRelative(
                    dx1 = 3.0f,
                    dy1 = -3.0f,
                    dx2 = 3.0f,
                    dy2 = -3.0f,
                )
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // h -6z
                horizontalLineToRelative(dx = -6.0f)
                close()
            }
            // M15 33 l0.001 0.037 c1.041 -0.035 2.016 -0.274 2.632 -1.286 0.171 -0.281 0.563 -0.281 0.735 0 0.616 1.011 1.591 1.251 2.632 1.286 V27 h-6 v6z
            path(
                fill = SolidColor(Color(0xFFBE1931)),
            ) {
                // M 15 33
                moveTo(x = 15.0f, y = 33.0f)
                // l 0.001 0.037
                lineToRelative(dx = 0.001f, dy = 0.037f)
                // c 1.041 -0.035 2.016 -0.274 2.632 -1.286
                curveToRelative(
                    dx1 = 1.041f,
                    dy1 = -0.035f,
                    dx2 = 2.016f,
                    dy2 = -0.274f,
                    dx3 = 2.632f,
                    dy3 = -1.286f,
                )
                // c 0.171 -0.281 0.563 -0.281 0.735 0
                curveToRelative(
                    dx1 = 0.171f,
                    dy1 = -0.281f,
                    dx2 = 0.563f,
                    dy2 = -0.281f,
                    dx3 = 0.735f,
                    dy3 = 0.0f,
                )
                // c 0.616 1.011 1.591 1.251 2.632 1.286
                curveToRelative(
                    dx1 = 0.616f,
                    dy1 = 1.011f,
                    dx2 = 1.591f,
                    dy2 = 1.251f,
                    dx3 = 2.632f,
                    dy3 = 1.286f,
                )
                // V 27
                verticalLineTo(y = 27.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // v 6z
                verticalLineToRelative(dy = 6.0f)
                close()
            }
            // M31.954 21.619 c0 6.276 -5 6.276 -5 6.276 h-18 s-5 0 -5 -6.276 c0 -6.724 5 -18.619 14 -18.619 s14 12.895 14 18.619z
            path(
                fill = SolidColor(Color(0xFFD99E82)),
            ) {
                // M 31.954 21.619
                moveTo(x = 31.954f, y = 21.619f)
                // c 0 6.276 -5 6.276 -5 6.276
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 6.276f,
                    dx2 = -5.0f,
                    dy2 = 6.276f,
                    dx3 = -5.0f,
                    dy3 = 6.276f,
                )
                // h -18
                horizontalLineToRelative(dx = -18.0f)
                // s -5 0 -5 -6.276
                reflectiveCurveToRelative(
                    dx1 = -5.0f,
                    dy1 = 0.0f,
                    dx2 = -5.0f,
                    dy2 = -6.276f,
                )
                // c 0 -6.724 5 -18.619 14 -18.619
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -6.724f,
                    dx2 = 5.0f,
                    dy2 = -18.619f,
                    dx3 = 14.0f,
                    dy3 = -18.619f,
                )
                // s 14 12.895 14 18.619z
                reflectiveCurveToRelative(
                    dx1 = 14.0f,
                    dy1 = 12.895f,
                    dx2 = 14.0f,
                    dy2 = 18.619f,
                )
                close()
            }
            // M18 20 c-7 0 -10 3.527 -10 6.395 0 3.037 2.462 5.5 5.5 5.5 1.605 0 3.042 -0.664 4.049 -2.767 0.185 -0.386 0.716 -0.386 0.901 0 1.007 2.103 2.445 2.767 4.049 2.767 3.038 0 5.5 -2.463 5.5 -5.5 C28 23.527 25 20 18 20z
            path(
                fill = SolidColor(Color(0xFFF4C7B5)),
            ) {
                // M 18 20
                moveTo(x = 18.0f, y = 20.0f)
                // c -7 0 -10 3.527 -10 6.395
                curveToRelative(
                    dx1 = -7.0f,
                    dy1 = 0.0f,
                    dx2 = -10.0f,
                    dy2 = 3.527f,
                    dx3 = -10.0f,
                    dy3 = 6.395f,
                )
                // c 0 3.037 2.462 5.5 5.5 5.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.037f,
                    dx2 = 2.462f,
                    dy2 = 5.5f,
                    dx3 = 5.5f,
                    dy3 = 5.5f,
                )
                // c 1.605 0 3.042 -0.664 4.049 -2.767
                curveToRelative(
                    dx1 = 1.605f,
                    dy1 = 0.0f,
                    dx2 = 3.042f,
                    dy2 = -0.664f,
                    dx3 = 4.049f,
                    dy3 = -2.767f,
                )
                // c 0.185 -0.386 0.716 -0.386 0.901 0
                curveToRelative(
                    dx1 = 0.185f,
                    dy1 = -0.386f,
                    dx2 = 0.716f,
                    dy2 = -0.386f,
                    dx3 = 0.901f,
                    dy3 = 0.0f,
                )
                // c 1.007 2.103 2.445 2.767 4.049 2.767
                curveToRelative(
                    dx1 = 1.007f,
                    dy1 = 2.103f,
                    dx2 = 2.445f,
                    dy2 = 2.767f,
                    dx3 = 4.049f,
                    dy3 = 2.767f,
                )
                // c 3.038 0 5.5 -2.463 5.5 -5.5
                curveToRelative(
                    dx1 = 3.038f,
                    dy1 = 0.0f,
                    dx2 = 5.5f,
                    dy2 = -2.463f,
                    dx3 = 5.5f,
                    dy3 = -5.5f,
                )
                // C 28 23.527 25 20 18 20z
                curveTo(
                    x1 = 28.0f,
                    y1 = 23.527f,
                    x2 = 25.0f,
                    y2 = 20.0f,
                    x3 = 18.0f,
                    y3 = 20.0f,
                )
                close()
            }
            // M15 22.895 c-1 1 2 4 3 4 s4 -3 3 -4 -5 -1 -6 0z M13 19 c-1.1 0 -2 -0.9 -2 -2 v-2 c0 -1.1 0.9 -2 2 -2 s2 0.9 2 2 v2 c0 1.1 -0.9 2 -2 2z M23 19 c-1.1 0 -2 -0.9 -2 -2 v-2 c0 -1.1 0.9 -2 2 -2 s2 0.9 2 2 v2 c0 1.1 -0.9 2 -2 2z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 15 22.895
                moveTo(x = 15.0f, y = 22.895f)
                // c -1 1 2 4 3 4
                curveToRelative(
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                    dx2 = 2.0f,
                    dy2 = 4.0f,
                    dx3 = 3.0f,
                    dy3 = 4.0f,
                )
                // s 4 -3 3 -4
                reflectiveCurveToRelative(
                    dx1 = 4.0f,
                    dy1 = -3.0f,
                    dx2 = 3.0f,
                    dy2 = -4.0f,
                )
                // s -5 -1 -6 0z
                reflectiveCurveToRelative(
                    dx1 = -5.0f,
                    dy1 = -1.0f,
                    dx2 = -6.0f,
                    dy2 = 0.0f,
                )
                close()
                // M 13 19
                moveTo(x = 13.0f, y = 19.0f)
                // c -1.1 0 -2 -0.9 -2 -2
                curveToRelative(
                    dx1 = -1.1f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -0.9f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // c 0 -1.1 0.9 -2 2 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.1f,
                    dx2 = 0.9f,
                    dy2 = -2.0f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // s 2 0.9 2 2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.9f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // c 0 1.1 -0.9 2 -2 2z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.1f,
                    dx2 = -0.9f,
                    dy2 = 2.0f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                close()
                // M 23 19
                moveTo(x = 23.0f, y = 19.0f)
                // c -1.1 0 -2 -0.9 -2 -2
                curveToRelative(
                    dx1 = -1.1f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -0.9f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // c 0 -1.1 0.9 -2 2 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.1f,
                    dx2 = 0.9f,
                    dy2 = -2.0f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // s 2 0.9 2 2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.9f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // c 0 1.1 -0.9 2 -2 2z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.1f,
                    dx2 = -0.9f,
                    dy2 = 2.0f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                close()
            }
            // M15 3.608 C13.941 2.199 11.681 0.881 2.828 4.2 -1.316 5.754 0.708 17.804 3.935 18.585 c1.106 0 4.426 0 4.426 -8.852 0 -0.22 -0.002 -0.423 -0.005 -0.625 C10.35 6.298 12.5 4.857 15 3.608z M33.172 4.2 C24.319 0.881 22.059 2.199 21 3.608 c2.5 1.25 4.65 2.691 6.644 5.501 -0.003 0.201 -0.005 0.404 -0.005 0.625 0 8.852 3.319 8.852 4.426 8.852 3.227 -0.782 5.251 -12.832 1.107 -14.386z
            path(
                fill = SolidColor(Color(0xFF662113)),
            ) {
                // M 15 3.608
                moveTo(x = 15.0f, y = 3.608f)
                // C 13.941 2.199 11.681 0.881 2.828 4.2
                curveTo(
                    x1 = 13.941f,
                    y1 = 2.199f,
                    x2 = 11.681f,
                    y2 = 0.881f,
                    x3 = 2.828f,
                    y3 = 4.2f,
                )
                // C -1.316 5.754 0.708 17.804 3.935 18.585
                curveTo(
                    x1 = -1.316f,
                    y1 = 5.754f,
                    x2 = 0.708f,
                    y2 = 17.804f,
                    x3 = 3.935f,
                    y3 = 18.585f,
                )
                // c 1.106 0 4.426 0 4.426 -8.852
                curveToRelative(
                    dx1 = 1.106f,
                    dy1 = 0.0f,
                    dx2 = 4.426f,
                    dy2 = 0.0f,
                    dx3 = 4.426f,
                    dy3 = -8.852f,
                )
                // c 0 -0.22 -0.002 -0.423 -0.005 -0.625
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.22f,
                    dx2 = -0.002f,
                    dy2 = -0.423f,
                    dx3 = -0.005f,
                    dy3 = -0.625f,
                )
                // C 10.35 6.298 12.5 4.857 15 3.608z
                curveTo(
                    x1 = 10.35f,
                    y1 = 6.298f,
                    x2 = 12.5f,
                    y2 = 4.857f,
                    x3 = 15.0f,
                    y3 = 3.608f,
                )
                close()
                // M 33.172 4.2
                moveTo(x = 33.172f, y = 4.2f)
                // C 24.319 0.881 22.059 2.199 21 3.608
                curveTo(
                    x1 = 24.319f,
                    y1 = 0.881f,
                    x2 = 22.059f,
                    y2 = 2.199f,
                    x3 = 21.0f,
                    y3 = 3.608f,
                )
                // c 2.5 1.25 4.65 2.691 6.644 5.501
                curveToRelative(
                    dx1 = 2.5f,
                    dy1 = 1.25f,
                    dx2 = 4.65f,
                    dy2 = 2.691f,
                    dx3 = 6.644f,
                    dy3 = 5.501f,
                )
                // c -0.003 0.201 -0.005 0.404 -0.005 0.625
                curveToRelative(
                    dx1 = -0.003f,
                    dy1 = 0.201f,
                    dx2 = -0.005f,
                    dy2 = 0.404f,
                    dx3 = -0.005f,
                    dy3 = 0.625f,
                )
                // c 0 8.852 3.319 8.852 4.426 8.852
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 8.852f,
                    dx2 = 3.319f,
                    dy2 = 8.852f,
                    dx3 = 4.426f,
                    dy3 = 8.852f,
                )
                // c 3.227 -0.782 5.251 -12.832 1.107 -14.386z
                curveToRelative(
                    dx1 = 3.227f,
                    dy1 = -0.782f,
                    dx2 = 5.251f,
                    dy2 = -12.832f,
                    dx3 = 1.107f,
                    dy3 = -14.386f,
                )
                close()
            }
            // M23.5 25.5 m-0.5 0 a0.5 0.5 0 1 1 1 0 a0.5 0.5 0 1 1 -1 0
            path(
                fill = SolidColor(Color(0xFFD99E82)),
            ) {
                // M 23.5 25.5
                moveTo(x = 23.5f, y = 25.5f)
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
            // M11.5 25.5 m-0.5 0 a0.5 0.5 0 1 1 1 0 a0.5 0.5 0 1 1 -1 0
            path(
                fill = SolidColor(Color(0xFFD99E82)),
            ) {
                // M 11.5 25.5
                moveTo(x = 11.5f, y = 25.5f)
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
            // M25.5 27.5 m-0.5 0 a0.5 0.5 0 1 1 1 0 a0.5 0.5 0 1 1 -1 0
            path(
                fill = SolidColor(Color(0xFFD99E82)),
            ) {
                // M 25.5 27.5
                moveTo(x = 25.5f, y = 27.5f)
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
            // M10.5 27.5 m-0.5 0 a0.5 0.5 0 1 1 1 0 a0.5 0.5 0 1 1 -1 0
            path(
                fill = SolidColor(Color(0xFFD99E82)),
            ) {
                // M 10.5 27.5
                moveTo(x = 10.5f, y = 27.5f)
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
            // M23 28 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFD99E82)),
            ) {
                // M 23 28
                moveTo(x = 23.0f, y = 28.0f)
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
                fill = SolidColor(Color(0xFFD99E82)),
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
            // M9.883 7.232 c-0.259 -0.673 -0.634 -1.397 -1.176 -1.939 -0.391 -0.391 -1.023 -0.391 -1.414 0 s-0.391 1.023 0 1.414 c0.57 0.57 1.066 1.934 1.068 2.346 0.145 -0.404 0.839 -1.15 1.522 -1.821z M26.1 7.232 c0.259 -0.672 0.634 -1.397 1.176 -1.939 0.391 -0.391 1.023 -0.391 1.414 0 s0.391 1.023 0 1.414 c-0.57 0.57 -1.066 1.934 -1.068 2.346 -0.145 -0.404 -0.839 -1.15 -1.522 -1.821z
            path(
                fill = SolidColor(Color(0xFF380F09)),
            ) {
                // M 9.883 7.232
                moveTo(x = 9.883f, y = 7.232f)
                // c -0.259 -0.673 -0.634 -1.397 -1.176 -1.939
                curveToRelative(
                    dx1 = -0.259f,
                    dy1 = -0.673f,
                    dx2 = -0.634f,
                    dy2 = -1.397f,
                    dx3 = -1.176f,
                    dy3 = -1.939f,
                )
                // c -0.391 -0.391 -1.023 -0.391 -1.414 0
                curveToRelative(
                    dx1 = -0.391f,
                    dy1 = -0.391f,
                    dx2 = -1.023f,
                    dy2 = -0.391f,
                    dx3 = -1.414f,
                    dy3 = 0.0f,
                )
                // s -0.391 1.023 0 1.414
                reflectiveCurveToRelative(
                    dx1 = -0.391f,
                    dy1 = 1.023f,
                    dx2 = 0.0f,
                    dy2 = 1.414f,
                )
                // c 0.57 0.57 1.066 1.934 1.068 2.346
                curveToRelative(
                    dx1 = 0.57f,
                    dy1 = 0.57f,
                    dx2 = 1.066f,
                    dy2 = 1.934f,
                    dx3 = 1.068f,
                    dy3 = 2.346f,
                )
                // c 0.145 -0.404 0.839 -1.15 1.522 -1.821z
                curveToRelative(
                    dx1 = 0.145f,
                    dy1 = -0.404f,
                    dx2 = 0.839f,
                    dy2 = -1.15f,
                    dx3 = 1.522f,
                    dy3 = -1.821f,
                )
                close()
                // M 26.1 7.232
                moveTo(x = 26.1f, y = 7.232f)
                // c 0.259 -0.672 0.634 -1.397 1.176 -1.939
                curveToRelative(
                    dx1 = 0.259f,
                    dy1 = -0.672f,
                    dx2 = 0.634f,
                    dy2 = -1.397f,
                    dx3 = 1.176f,
                    dy3 = -1.939f,
                )
                // c 0.391 -0.391 1.023 -0.391 1.414 0
                curveToRelative(
                    dx1 = 0.391f,
                    dy1 = -0.391f,
                    dx2 = 1.023f,
                    dy2 = -0.391f,
                    dx3 = 1.414f,
                    dy3 = 0.0f,
                )
                // s 0.391 1.023 0 1.414
                reflectiveCurveToRelative(
                    dx1 = 0.391f,
                    dy1 = 1.023f,
                    dx2 = 0.0f,
                    dy2 = 1.414f,
                )
                // c -0.57 0.57 -1.066 1.934 -1.068 2.346
                curveToRelative(
                    dx1 = -0.57f,
                    dy1 = 0.57f,
                    dx2 = -1.066f,
                    dy2 = 1.934f,
                    dx3 = -1.068f,
                    dy3 = 2.346f,
                )
                // c -0.145 -0.404 -0.839 -1.15 -1.522 -1.821z
                curveToRelative(
                    dx1 = -0.145f,
                    dy1 = -0.404f,
                    dx2 = -0.839f,
                    dy2 = -1.15f,
                    dx3 = -1.522f,
                    dy3 = -1.821f,
                )
                close()
            }
        }.build().also { _emoji1f436 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f436: ImageVector? = null
