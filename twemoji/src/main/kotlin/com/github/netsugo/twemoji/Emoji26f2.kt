package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji26f2: ImageVector
    get() {
        val current = _emoji26f2
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji26f2",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M1 22.923 v6.538 C1 33.073 8.611 36 18 36 s17 -2.927 17 -6.538 v-6.538 H1z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 1 22.923
                moveTo(x = 1.0f, y = 22.923f)
                // v 6.538
                verticalLineToRelative(dy = 6.538f)
                // C 1 33.073 8.611 36 18 36
                curveTo(
                    x1 = 1.0f,
                    y1 = 33.073f,
                    x2 = 8.611f,
                    y2 = 36.0f,
                    x3 = 18.0f,
                    y3 = 36.0f,
                )
                // s 17 -2.927 17 -6.538
                reflectiveCurveToRelative(
                    dx1 = 17.0f,
                    dy1 = -2.927f,
                    dx2 = 17.0f,
                    dy2 = -6.538f,
                )
                // v -6.538
                verticalLineToRelative(dy = -6.538f)
                // H 1z
                horizontalLineTo(x = 1.0f)
                close()
            }
            // M1 22.923 a17 6.538 0 1 0 34 0 a17 6.538 0 1 0 -34 0z
            path(
                fill = SolidColor(Color(0xFFE1E8ED)),
            ) {
                // M 1 22.923
                moveTo(x = 1.0f, y = 22.923f)
                // a 17 6.538 0 1 0 34 0
                arcToRelative(
                    a = 17.0f,
                    b = 6.538f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 34.0f,
                    dy1 = 0.0f,
                )
                // a 17 6.538 0 1 0 -34 0z
                arcToRelative(
                    a = 17.0f,
                    b = 6.538f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -34.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M18 20.308 c6.7 0 12.314 1.668 13.913 3.923 0.297 -0.419 0.472 -0.855 0.472 -1.308 0 -2.889 -6.44 -5.231 -14.385 -5.231 S3.615 20.034 3.615 22.923 c0 0.452 0.175 0.889 0.472 1.308 C5.686 21.976 11.3 20.308 18 20.308z
            path(
                fill = SolidColor(Color(0xFFAAB8C2)),
            ) {
                // M 18 20.308
                moveTo(x = 18.0f, y = 20.308f)
                // c 6.7 0 12.314 1.668 13.913 3.923
                curveToRelative(
                    dx1 = 6.7f,
                    dy1 = 0.0f,
                    dx2 = 12.314f,
                    dy2 = 1.668f,
                    dx3 = 13.913f,
                    dy3 = 3.923f,
                )
                // c 0.297 -0.419 0.472 -0.855 0.472 -1.308
                curveToRelative(
                    dx1 = 0.297f,
                    dy1 = -0.419f,
                    dx2 = 0.472f,
                    dy2 = -0.855f,
                    dx3 = 0.472f,
                    dy3 = -1.308f,
                )
                // c 0 -2.889 -6.44 -5.231 -14.385 -5.231
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.889f,
                    dx2 = -6.44f,
                    dy2 = -5.231f,
                    dx3 = -14.385f,
                    dy3 = -5.231f,
                )
                // S 3.615 20.034 3.615 22.923
                reflectiveCurveTo(
                    x1 = 3.615f,
                    y1 = 20.034f,
                    x2 = 3.615f,
                    y2 = 22.923f,
                )
                // c 0 0.452 0.175 0.889 0.472 1.308
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.452f,
                    dx2 = 0.175f,
                    dy2 = 0.889f,
                    dx3 = 0.472f,
                    dy3 = 1.308f,
                )
                // C 5.686 21.976 11.3 20.308 18 20.308z
                curveTo(
                    x1 = 5.686f,
                    y1 = 21.976f,
                    x2 = 11.3f,
                    y2 = 20.308f,
                    x3 = 18.0f,
                    y3 = 20.308f,
                )
                close()
            }
            // M4.087 24.231 a13.913 3.923 0 1 0 27.826 0 a13.913 3.923 0 1 0 -27.826 0z
            path(
                fill = SolidColor(Color(0xFF3B88C3)),
            ) {
                // M 4.087 24.231
                moveTo(x = 4.087f, y = 24.231f)
                // a 13.913 3.923 0 1 0 27.826 0
                arcToRelative(
                    a = 13.913f,
                    b = 3.923f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 27.826f,
                    dy1 = 0.0f,
                )
                // a 13.913 3.923 0 1 0 -27.826 0z
                arcToRelative(
                    a = 13.913f,
                    b = 3.923f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -27.826f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M18 22.128 c-4.497 0 -9.625 1.285 -9.625 2.103 0 0.818 5.129 2.102 9.625 2.102 s9.625 -1.284 9.625 -2.102 c0 -0.818 -5.128 -2.103 -9.625 -2.103z
            path(
                fill = SolidColor(Color(0xFF50A5E6)),
            ) {
                // M 18 22.128
                moveTo(x = 18.0f, y = 22.128f)
                // c -4.497 0 -9.625 1.285 -9.625 2.103
                curveToRelative(
                    dx1 = -4.497f,
                    dy1 = 0.0f,
                    dx2 = -9.625f,
                    dy2 = 1.285f,
                    dx3 = -9.625f,
                    dy3 = 2.103f,
                )
                // c 0 0.818 5.129 2.102 9.625 2.102
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.818f,
                    dx2 = 5.129f,
                    dy2 = 2.102f,
                    dx3 = 9.625f,
                    dy3 = 2.102f,
                )
                // s 9.625 -1.284 9.625 -2.102
                reflectiveCurveToRelative(
                    dx1 = 9.625f,
                    dy1 = -1.284f,
                    dx2 = 9.625f,
                    dy2 = -2.102f,
                )
                // c 0 -0.818 -5.128 -2.103 -9.625 -2.103z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.818f,
                    dx2 = -5.128f,
                    dy2 = -2.103f,
                    dx3 = -9.625f,
                    dy3 = -2.103f,
                )
                close()
            }
            // M15 22.615 V24 c0 0.553 1.343 1 3 1 s3 -0.447 3 -1 v-1.385 h-6z
            path(
                fill = SolidColor(Color(0xFFE1E8ED)),
            ) {
                // M 15 22.615
                moveTo(x = 15.0f, y = 22.615f)
                // V 24
                verticalLineTo(y = 24.0f)
                // c 0 0.553 1.343 1 3 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = 1.343f,
                    dy2 = 1.0f,
                    dx3 = 3.0f,
                    dy3 = 1.0f,
                )
                // s 3 -0.447 3 -1
                reflectiveCurveToRelative(
                    dx1 = 3.0f,
                    dy1 = -0.447f,
                    dx2 = 3.0f,
                    dy2 = -1.0f,
                )
                // v -1.385
                verticalLineToRelative(dy = -1.385f)
                // h -6z
                horizontalLineToRelative(dx = -6.0f)
                close()
            }
            // M15 22.615 a3 1 0 1 0 6 0 a3 1 0 1 0 -6 0z
            path(
                fill = SolidColor(Color(0xFFAAB8C2)),
            ) {
                // M 15 22.615
                moveTo(x = 15.0f, y = 22.615f)
                // a 3 1 0 1 0 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // a 3 1 0 1 0 -6 0z
                arcToRelative(
                    a = 3.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M9 15.786 c-0.552 0 -1 -0.448 -1 -1 V13.5 C8 10.467 10.467 8 13.5 8 s5.5 2.467 5.5 5.5 c0 0.552 -0.447 1 -1 1 -0.552 0 -1 -0.448 -1 -1 0 -1.93 -1.57 -3.5 -3.5 -3.5 S10 11.57 10 13.5 v1.286 c0 0.552 -0.448 1 -1 1z
            path(
                fill = SolidColor(Color(0xFF1C6399)),
            ) {
                // M 9 15.786
                moveTo(x = 9.0f, y = 15.786f)
                // c -0.552 0 -1 -0.448 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.448f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // V 13.5
                verticalLineTo(y = 13.5f)
                // C 8 10.467 10.467 8 13.5 8
                curveTo(
                    x1 = 8.0f,
                    y1 = 10.467f,
                    x2 = 10.467f,
                    y2 = 8.0f,
                    x3 = 13.5f,
                    y3 = 8.0f,
                )
                // s 5.5 2.467 5.5 5.5
                reflectiveCurveToRelative(
                    dx1 = 5.5f,
                    dy1 = 2.467f,
                    dx2 = 5.5f,
                    dy2 = 5.5f,
                )
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
                // c 0 -1.93 -1.57 -3.5 -3.5 -3.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.93f,
                    dx2 = -1.57f,
                    dy2 = -3.5f,
                    dx3 = -3.5f,
                    dy3 = -3.5f,
                )
                // S 10 11.57 10 13.5
                reflectiveCurveTo(
                    x1 = 10.0f,
                    y1 = 11.57f,
                    x2 = 10.0f,
                    y2 = 13.5f,
                )
                // v 1.286
                verticalLineToRelative(dy = 1.286f)
                // c 0 0.552 -0.448 1 -1 1z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = -0.448f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                close()
            }
            // M26 18 c-0.553 0 -1 -0.448 -1 -1 v-1.143 c0 -1.654 -1.346 -3 -3 -3 s-3 1.346 -3 3 c0 0.552 -0.447 1 -1 1 -0.552 0 -1 -0.448 -1 -1 0 -2.757 2.243 -5 5 -5 s5 2.243 5 5 V17 c0 0.552 -0.447 1 -1 1z
            path(
                fill = SolidColor(Color(0xFF88C9F9)),
            ) {
                // M 26 18
                moveTo(x = 26.0f, y = 18.0f)
                // c -0.553 0 -1 -0.448 -1 -1
                curveToRelative(
                    dx1 = -0.553f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.448f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // v -1.143
                verticalLineToRelative(dy = -1.143f)
                // c 0 -1.654 -1.346 -3 -3 -3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.654f,
                    dx2 = -1.346f,
                    dy2 = -3.0f,
                    dx3 = -3.0f,
                    dy3 = -3.0f,
                )
                // s -3 1.346 -3 3
                reflectiveCurveToRelative(
                    dx1 = -3.0f,
                    dy1 = 1.346f,
                    dx2 = -3.0f,
                    dy2 = 3.0f,
                )
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
                // c 0 -2.757 2.243 -5 5 -5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.757f,
                    dx2 = 2.243f,
                    dy2 = -5.0f,
                    dx3 = 5.0f,
                    dy3 = -5.0f,
                )
                // s 5 2.243 5 5
                reflectiveCurveToRelative(
                    dx1 = 5.0f,
                    dy1 = 2.243f,
                    dx2 = 5.0f,
                    dy2 = 5.0f,
                )
                // V 17
                verticalLineTo(y = 17.0f)
                // c 0 0.552 -0.447 1 -1 1z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                close()
            }
            // M32 11.125 c-0.553 0 -1 -0.448 -1 -1 0 -3.309 -2.691 -6 -6 -6 s-6 2.691 -6 6 c0 0.552 -0.447 1 -1 1 -0.552 0 -1 -0.448 -1 -1 0 -4.411 3.589 -8 8 -8 s8 3.589 8 8 c0 0.552 -0.447 1 -1 1z
            path(
                fill = SolidColor(Color(0xFF1C6399)),
            ) {
                // M 32 11.125
                moveTo(x = 32.0f, y = 11.125f)
                // c -0.553 0 -1 -0.448 -1 -1
                curveToRelative(
                    dx1 = -0.553f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.448f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // c 0 -3.309 -2.691 -6 -6 -6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.309f,
                    dx2 = -2.691f,
                    dy2 = -6.0f,
                    dx3 = -6.0f,
                    dy3 = -6.0f,
                )
                // s -6 2.691 -6 6
                reflectiveCurveToRelative(
                    dx1 = -6.0f,
                    dy1 = 2.691f,
                    dx2 = -6.0f,
                    dy2 = 6.0f,
                )
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
                // c 0 -4.411 3.589 -8 8 -8
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.411f,
                    dx2 = 3.589f,
                    dy2 = -8.0f,
                    dx3 = 8.0f,
                    dy3 = -8.0f,
                )
                // s 8 3.589 8 8
                reflectiveCurveToRelative(
                    dx1 = 8.0f,
                    dy1 = 3.589f,
                    dx2 = 8.0f,
                    dy2 = 8.0f,
                )
                // c 0 0.552 -0.447 1 -1 1z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                close()
            }
            // M17 22.659 h2 V8 c0 -4.411 -3.589 -8 -8 -8 S3 3.589 3 8 c0 0.552 0.448 1 1 1 s1 -0.448 1 -1 c0 -3.309 2.691 -6 6 -6 s6 2.691 6 6 v14.659z
            path(
                fill = SolidColor(Color(0xFF3B94D9)),
            ) {
                // M 17 22.659
                moveTo(x = 17.0f, y = 22.659f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // c 0 -4.411 -3.589 -8 -8 -8
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.411f,
                    dx2 = -3.589f,
                    dy2 = -8.0f,
                    dx3 = -8.0f,
                    dy3 = -8.0f,
                )
                // S 3 3.589 3 8
                reflectiveCurveTo(
                    x1 = 3.0f,
                    y1 = 3.589f,
                    x2 = 3.0f,
                    y2 = 8.0f,
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
                // c 0 -3.309 2.691 -6 6 -6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.309f,
                    dx2 = 2.691f,
                    dy2 = -6.0f,
                    dx3 = 6.0f,
                    dy3 = -6.0f,
                )
                // s 6 2.691 6 6
                reflectiveCurveToRelative(
                    dx1 = 6.0f,
                    dy1 = 2.691f,
                    dx2 = 6.0f,
                    dy2 = 6.0f,
                )
                // v 14.659z
                verticalLineToRelative(dy = 14.659f)
                close()
            }
            // M32 14 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFF1C6399)),
            ) {
                // M 32 14
                moveTo(x = 32.0f, y = 14.0f)
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
            // M26 21 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFBBDDF5)),
            ) {
                // M 26 21
                moveTo(x = 26.0f, y = 21.0f)
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
            // M33 2 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFBBDDF5)),
            ) {
                // M 33 2
                moveTo(x = 33.0f, y = 2.0f)
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
            // M14 20 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFF2F9FF)),
            ) {
                // M 14 20
                moveTo(x = 14.0f, y = 20.0f)
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
            // M26 9 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFF50A5E6)),
            ) {
                // M 26 9
                moveTo(x = 26.0f, y = 9.0f)
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
            // M20 1 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFF1C6399)),
            ) {
                // M 20 1
                moveTo(x = 20.0f, y = 1.0f)
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
                fill = SolidColor(Color(0xFF1C6399)),
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
            // M4 13 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFF3B94D9)),
            ) {
                // M 4 13
                moveTo(x = 4.0f, y = 13.0f)
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
            // M11 5 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFF88C9F9)),
            ) {
                // M 11 5
                moveTo(x = 11.0f, y = 5.0f)
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
        }.build().also { _emoji26f2 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji26f2: ImageVector? = null
