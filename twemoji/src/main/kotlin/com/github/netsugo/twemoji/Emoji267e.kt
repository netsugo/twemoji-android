package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji267e: ImageVector
    get() {
        val current = _emoji267e
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji267e",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M18 18 m-18 0 a18 18 0 1 1 36 0 a18 18 0 1 1 -36 0
            path(
                fill = SolidColor(Color(0xFF3B94D9)),
            ) {
                // M 18 18
                moveTo(x = 18.0f, y = 18.0f)
                // m -18 0
                moveToRelative(dx = -18.0f, dy = 0.0f)
                // a 18 18 0 1 1 36 0
                arcToRelative(
                    a = 18.0f,
                    b = 18.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 36.0f,
                    dy1 = 0.0f,
                )
                // a 18 18 0 1 1 -36 0
                arcToRelative(
                    a = 18.0f,
                    b = 18.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -36.0f,
                    dy1 = 0.0f,
                )
            }
            // M25.565 11.295 c-2.116 0 -4.195 1.322 -5.799 2.712 0.609 0.669 1.021 1.198 1.147 1.364 0.172 0.227 0.423 0.534 0.733 0.882 1.236 -1.084 2.689 -2.044 3.919 -2.044 2.09 0 3.79 1.7 3.79 3.79 s-1.7 3.79 -3.79 3.79 c-2.337 0 -5.484 -3.456 -6.402 -4.668 -0.45 -0.596 -4.521 -5.826 -8.729 -5.826 -3.697 0 -6.705 3.008 -6.705 6.705 s3.008 6.704 6.705 6.704 c2.055 0 4.073 -1.248 5.657 -2.594 -0.67 -0.726 -1.122 -1.307 -1.255 -1.483 -0.151 -0.199 -0.366 -0.462 -0.624 -0.757 -1.204 1.032 -2.594 1.919 -3.778 1.919 -2.09 0 -3.79 -1.7 -3.79 -3.79 s1.7 -3.79 3.79 -3.79 c2.338 0 5.484 3.456 6.402 4.668 0.45 0.596 4.521 5.826 8.729 5.826 3.697 0 6.704 -3.007 6.704 -6.704 0.001 -3.696 -3.006 -6.704 -6.704 -6.704z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 25.565 11.295
                moveTo(x = 25.565f, y = 11.295f)
                // c -2.116 0 -4.195 1.322 -5.799 2.712
                curveToRelative(
                    dx1 = -2.116f,
                    dy1 = 0.0f,
                    dx2 = -4.195f,
                    dy2 = 1.322f,
                    dx3 = -5.799f,
                    dy3 = 2.712f,
                )
                // c 0.609 0.669 1.021 1.198 1.147 1.364
                curveToRelative(
                    dx1 = 0.609f,
                    dy1 = 0.669f,
                    dx2 = 1.021f,
                    dy2 = 1.198f,
                    dx3 = 1.147f,
                    dy3 = 1.364f,
                )
                // c 0.172 0.227 0.423 0.534 0.733 0.882
                curveToRelative(
                    dx1 = 0.172f,
                    dy1 = 0.227f,
                    dx2 = 0.423f,
                    dy2 = 0.534f,
                    dx3 = 0.733f,
                    dy3 = 0.882f,
                )
                // c 1.236 -1.084 2.689 -2.044 3.919 -2.044
                curveToRelative(
                    dx1 = 1.236f,
                    dy1 = -1.084f,
                    dx2 = 2.689f,
                    dy2 = -2.044f,
                    dx3 = 3.919f,
                    dy3 = -2.044f,
                )
                // c 2.09 0 3.79 1.7 3.79 3.79
                curveToRelative(
                    dx1 = 2.09f,
                    dy1 = 0.0f,
                    dx2 = 3.79f,
                    dy2 = 1.7f,
                    dx3 = 3.79f,
                    dy3 = 3.79f,
                )
                // s -1.7 3.79 -3.79 3.79
                reflectiveCurveToRelative(
                    dx1 = -1.7f,
                    dy1 = 3.79f,
                    dx2 = -3.79f,
                    dy2 = 3.79f,
                )
                // c -2.337 0 -5.484 -3.456 -6.402 -4.668
                curveToRelative(
                    dx1 = -2.337f,
                    dy1 = 0.0f,
                    dx2 = -5.484f,
                    dy2 = -3.456f,
                    dx3 = -6.402f,
                    dy3 = -4.668f,
                )
                // c -0.45 -0.596 -4.521 -5.826 -8.729 -5.826
                curveToRelative(
                    dx1 = -0.45f,
                    dy1 = -0.596f,
                    dx2 = -4.521f,
                    dy2 = -5.826f,
                    dx3 = -8.729f,
                    dy3 = -5.826f,
                )
                // c -3.697 0 -6.705 3.008 -6.705 6.705
                curveToRelative(
                    dx1 = -3.697f,
                    dy1 = 0.0f,
                    dx2 = -6.705f,
                    dy2 = 3.008f,
                    dx3 = -6.705f,
                    dy3 = 6.705f,
                )
                // s 3.008 6.704 6.705 6.704
                reflectiveCurveToRelative(
                    dx1 = 3.008f,
                    dy1 = 6.704f,
                    dx2 = 6.705f,
                    dy2 = 6.704f,
                )
                // c 2.055 0 4.073 -1.248 5.657 -2.594
                curveToRelative(
                    dx1 = 2.055f,
                    dy1 = 0.0f,
                    dx2 = 4.073f,
                    dy2 = -1.248f,
                    dx3 = 5.657f,
                    dy3 = -2.594f,
                )
                // c -0.67 -0.726 -1.122 -1.307 -1.255 -1.483
                curveToRelative(
                    dx1 = -0.67f,
                    dy1 = -0.726f,
                    dx2 = -1.122f,
                    dy2 = -1.307f,
                    dx3 = -1.255f,
                    dy3 = -1.483f,
                )
                // c -0.151 -0.199 -0.366 -0.462 -0.624 -0.757
                curveToRelative(
                    dx1 = -0.151f,
                    dy1 = -0.199f,
                    dx2 = -0.366f,
                    dy2 = -0.462f,
                    dx3 = -0.624f,
                    dy3 = -0.757f,
                )
                // c -1.204 1.032 -2.594 1.919 -3.778 1.919
                curveToRelative(
                    dx1 = -1.204f,
                    dy1 = 1.032f,
                    dx2 = -2.594f,
                    dy2 = 1.919f,
                    dx3 = -3.778f,
                    dy3 = 1.919f,
                )
                // c -2.09 0 -3.79 -1.7 -3.79 -3.79
                curveToRelative(
                    dx1 = -2.09f,
                    dy1 = 0.0f,
                    dx2 = -3.79f,
                    dy2 = -1.7f,
                    dx3 = -3.79f,
                    dy3 = -3.79f,
                )
                // s 1.7 -3.79 3.79 -3.79
                reflectiveCurveToRelative(
                    dx1 = 1.7f,
                    dy1 = -3.79f,
                    dx2 = 3.79f,
                    dy2 = -3.79f,
                )
                // c 2.338 0 5.484 3.456 6.402 4.668
                curveToRelative(
                    dx1 = 2.338f,
                    dy1 = 0.0f,
                    dx2 = 5.484f,
                    dy2 = 3.456f,
                    dx3 = 6.402f,
                    dy3 = 4.668f,
                )
                // c 0.45 0.596 4.521 5.826 8.729 5.826
                curveToRelative(
                    dx1 = 0.45f,
                    dy1 = 0.596f,
                    dx2 = 4.521f,
                    dy2 = 5.826f,
                    dx3 = 8.729f,
                    dy3 = 5.826f,
                )
                // c 3.697 0 6.704 -3.007 6.704 -6.704
                curveToRelative(
                    dx1 = 3.697f,
                    dy1 = 0.0f,
                    dx2 = 6.704f,
                    dy2 = -3.007f,
                    dx3 = 6.704f,
                    dy3 = -6.704f,
                )
                // c 0.001 -3.696 -3.006 -6.704 -6.704 -6.704z
                curveToRelative(
                    dx1 = 0.001f,
                    dy1 = -3.696f,
                    dx2 = -3.006f,
                    dy2 = -6.704f,
                    dx3 = -6.704f,
                    dy3 = -6.704f,
                )
                close()
            }
        }.build().also { _emoji267e = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji267e: ImageVector? = null
