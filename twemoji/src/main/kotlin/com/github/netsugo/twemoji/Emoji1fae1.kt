package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1fae1: ImageVector
    get() {
        val current = _emoji1fae1
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1fae1",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 21 c0 8.282 -6.718 15 -15 15 -8.284 0 -15 -6.718 -15 -15 0 -8.284 6.716 -15 15 -15 8.282 0 15 6.716 15 15
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 36 21
                moveTo(x = 36.0f, y = 21.0f)
                // c 0 8.282 -6.718 15 -15 15
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 8.282f,
                    dx2 = -6.718f,
                    dy2 = 15.0f,
                    dx3 = -15.0f,
                    dy3 = 15.0f,
                )
                // c -8.284 0 -15 -6.718 -15 -15
                curveToRelative(
                    dx1 = -8.284f,
                    dy1 = 0.0f,
                    dx2 = -15.0f,
                    dy2 = -6.718f,
                    dx3 = -15.0f,
                    dy3 = -15.0f,
                )
                // c 0 -8.284 6.716 -15 15 -15
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -8.284f,
                    dx2 = 6.716f,
                    dy2 = -15.0f,
                    dx3 = 15.0f,
                    dy3 = -15.0f,
                )
                // c 8.282 0 15 6.716 15 15
                curveToRelative(
                    dx1 = 8.282f,
                    dy1 = 0.0f,
                    dx2 = 15.0f,
                    dy2 = 6.716f,
                    dx3 = 15.0f,
                    dy3 = 15.0f,
                )
            }
            // M22.864 1.134 A1.51 1.51 0 0 0 21.55 0.004 a1.608 1.608 0 0 0 -0.799 0.119 l-5.775 2.446 c-3.314 1.074 -3.116 0.975 -3.626 1.281 -0.915 0.547 -2.007 1.513 -3.961 3.377 C5.728 8.811 0.059 9.794 0.041 15.297 0.034 17.438 1.698 19.192 4 19.185 c2.423 -0.008 3.816 -1.29 4.482 -2.159 a4.161 4.161 0 0 1 1.52 -1.228 c3.93 -1.875 2.256 -3.522 5.185 -7.281 a0.712 0.712 0 0 0 -0.226 -1.071 l6.858 -4.024 c0.608 -0.357 0.878 -1.004 0.698 -1.674 l0.095 -0.051 a0.505 0.505 0 0 0 0.252 -0.563z
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 22.864 1.134
                moveTo(x = 22.864f, y = 1.134f)
                // A 1.51 1.51 0 0 0 21.55 0.004
                arcTo(
                    horizontalEllipseRadius = 1.51f,
                    verticalEllipseRadius = 1.51f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 21.55f,
                    y1 = 0.004f,
                )
                // a 1.608 1.608 0 0 0 -0.799 0.119
                arcToRelative(
                    a = 1.608f,
                    b = 1.608f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.799f,
                    dy1 = 0.119f,
                )
                // l -5.775 2.446
                lineToRelative(dx = -5.775f, dy = 2.446f)
                // c -3.314 1.074 -3.116 0.975 -3.626 1.281
                curveToRelative(
                    dx1 = -3.314f,
                    dy1 = 1.074f,
                    dx2 = -3.116f,
                    dy2 = 0.975f,
                    dx3 = -3.626f,
                    dy3 = 1.281f,
                )
                // c -0.915 0.547 -2.007 1.513 -3.961 3.377
                curveToRelative(
                    dx1 = -0.915f,
                    dy1 = 0.547f,
                    dx2 = -2.007f,
                    dy2 = 1.513f,
                    dx3 = -3.961f,
                    dy3 = 3.377f,
                )
                // C 5.728 8.811 0.059 9.794 0.041 15.297
                curveTo(
                    x1 = 5.728f,
                    y1 = 8.811f,
                    x2 = 0.059f,
                    y2 = 9.794f,
                    x3 = 0.041f,
                    y3 = 15.297f,
                )
                // C 0.034 17.438 1.698 19.192 4 19.185
                curveTo(
                    x1 = 0.034f,
                    y1 = 17.438f,
                    x2 = 1.698f,
                    y2 = 19.192f,
                    x3 = 4.0f,
                    y3 = 19.185f,
                )
                // c 2.423 -0.008 3.816 -1.29 4.482 -2.159
                curveToRelative(
                    dx1 = 2.423f,
                    dy1 = -0.008f,
                    dx2 = 3.816f,
                    dy2 = -1.29f,
                    dx3 = 4.482f,
                    dy3 = -2.159f,
                )
                // a 4.161 4.161 0 0 1 1.52 -1.228
                arcToRelative(
                    a = 4.161f,
                    b = 4.161f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.52f,
                    dy1 = -1.228f,
                )
                // c 3.93 -1.875 2.256 -3.522 5.185 -7.281
                curveToRelative(
                    dx1 = 3.93f,
                    dy1 = -1.875f,
                    dx2 = 2.256f,
                    dy2 = -3.522f,
                    dx3 = 5.185f,
                    dy3 = -7.281f,
                )
                // a 0.712 0.712 0 0 0 -0.226 -1.071
                arcToRelative(
                    a = 0.712f,
                    b = 0.712f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.226f,
                    dy1 = -1.071f,
                )
                // l 6.858 -4.024
                lineToRelative(dx = 6.858f, dy = -4.024f)
                // c 0.608 -0.357 0.878 -1.004 0.698 -1.674
                curveToRelative(
                    dx1 = 0.608f,
                    dy1 = -0.357f,
                    dx2 = 0.878f,
                    dy2 = -1.004f,
                    dx3 = 0.698f,
                    dy3 = -1.674f,
                )
                // l 0.095 -0.051
                lineToRelative(dx = 0.095f, dy = -0.051f)
                // a 0.505 0.505 0 0 0 0.252 -0.563z
                arcToRelative(
                    a = 0.505f,
                    b = 0.505f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.252f,
                    dy1 = -0.563f,
                )
                close()
            }
            // M22.823 1.239 a0.348 0.348 0 0 0 -0.467 -0.164 l-2.698 1.294 a1.741 1.741 0 0 0 -0.088 -1.165 1.524 1.524 0 0 0 -0.316 -0.447 l-0.764 0.323 a0.825 0.825 0 0 1 0.444 0.417 c0.209 0.454 0.062 1.12 -0.623 1.518 l-2.585 1.24 c0.269 -0.54 0.338 -1.093 0.21 -1.542 a1.476 1.476 0 0 0 -0.224 -0.456 l-0.691 0.293 a0.714 0.714 0 0 1 0.242 0.354 c0.196 0.689 -0.333 1.747 -1.56 2.323 -1.171 0.55 -1.534 1.431 -1.955 2.452 -0.193 0.467 -0.411 0.996 -0.734 1.553 -0.859 1.48 -2.983 3.885 -3.93 4.816 a0.35 0.35 0 1 0 0.491 0.499 c0.915 -0.898 3.111 -3.354 4.045 -4.963 l0.004 -0.007 0.001 -0.001 c0.903 -1.66 1.893 -2.288 2.478 -2.17 0.419 0.084 0.529 0.545 0.557 0.813 a0.35 0.35 0 0 0 0.696 -0.072 c-0.08 -0.77 -0.497 -1.303 -1.116 -1.427 -0.401 -0.082 -0.919 0.021 -1.478 0.403 0.274 -0.542 0.606 -0.963 1.24 -1.26 0.05 -0.023 0.09 -0.053 0.137 -0.077 0.01 -0.004 0.021 -0.002 0.032 -0.007 l8.348 -4.004 c-0.002 -0.009 0 -0.017 -0.003 -0.026 l0.094 -0.051 a0.5 0.5 0 0 0 0.246 -0.325 0.335 0.335 0 0 0 -0.033 -0.134z
            path(
                fill = SolidColor(Color(0xFFB55005)),
            ) {
                // M 22.823 1.239
                moveTo(x = 22.823f, y = 1.239f)
                // a 0.348 0.348 0 0 0 -0.467 -0.164
                arcToRelative(
                    a = 0.348f,
                    b = 0.348f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.467f,
                    dy1 = -0.164f,
                )
                // l -2.698 1.294
                lineToRelative(dx = -2.698f, dy = 1.294f)
                // a 1.741 1.741 0 0 0 -0.088 -1.165
                arcToRelative(
                    a = 1.741f,
                    b = 1.741f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.088f,
                    dy1 = -1.165f,
                )
                // a 1.524 1.524 0 0 0 -0.316 -0.447
                arcToRelative(
                    a = 1.524f,
                    b = 1.524f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.316f,
                    dy1 = -0.447f,
                )
                // l -0.764 0.323
                lineToRelative(dx = -0.764f, dy = 0.323f)
                // a 0.825 0.825 0 0 1 0.444 0.417
                arcToRelative(
                    a = 0.825f,
                    b = 0.825f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.444f,
                    dy1 = 0.417f,
                )
                // c 0.209 0.454 0.062 1.12 -0.623 1.518
                curveToRelative(
                    dx1 = 0.209f,
                    dy1 = 0.454f,
                    dx2 = 0.062f,
                    dy2 = 1.12f,
                    dx3 = -0.623f,
                    dy3 = 1.518f,
                )
                // l -2.585 1.24
                lineToRelative(dx = -2.585f, dy = 1.24f)
                // c 0.269 -0.54 0.338 -1.093 0.21 -1.542
                curveToRelative(
                    dx1 = 0.269f,
                    dy1 = -0.54f,
                    dx2 = 0.338f,
                    dy2 = -1.093f,
                    dx3 = 0.21f,
                    dy3 = -1.542f,
                )
                // a 1.476 1.476 0 0 0 -0.224 -0.456
                arcToRelative(
                    a = 1.476f,
                    b = 1.476f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.224f,
                    dy1 = -0.456f,
                )
                // l -0.691 0.293
                lineToRelative(dx = -0.691f, dy = 0.293f)
                // a 0.714 0.714 0 0 1 0.242 0.354
                arcToRelative(
                    a = 0.714f,
                    b = 0.714f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.242f,
                    dy1 = 0.354f,
                )
                // c 0.196 0.689 -0.333 1.747 -1.56 2.323
                curveToRelative(
                    dx1 = 0.196f,
                    dy1 = 0.689f,
                    dx2 = -0.333f,
                    dy2 = 1.747f,
                    dx3 = -1.56f,
                    dy3 = 2.323f,
                )
                // c -1.171 0.55 -1.534 1.431 -1.955 2.452
                curveToRelative(
                    dx1 = -1.171f,
                    dy1 = 0.55f,
                    dx2 = -1.534f,
                    dy2 = 1.431f,
                    dx3 = -1.955f,
                    dy3 = 2.452f,
                )
                // c -0.193 0.467 -0.411 0.996 -0.734 1.553
                curveToRelative(
                    dx1 = -0.193f,
                    dy1 = 0.467f,
                    dx2 = -0.411f,
                    dy2 = 0.996f,
                    dx3 = -0.734f,
                    dy3 = 1.553f,
                )
                // c -0.859 1.48 -2.983 3.885 -3.93 4.816
                curveToRelative(
                    dx1 = -0.859f,
                    dy1 = 1.48f,
                    dx2 = -2.983f,
                    dy2 = 3.885f,
                    dx3 = -3.93f,
                    dy3 = 4.816f,
                )
                // a 0.35 0.35 0 1 0 0.491 0.499
                arcToRelative(
                    a = 0.35f,
                    b = 0.35f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 0.491f,
                    dy1 = 0.499f,
                )
                // c 0.915 -0.898 3.111 -3.354 4.045 -4.963
                curveToRelative(
                    dx1 = 0.915f,
                    dy1 = -0.898f,
                    dx2 = 3.111f,
                    dy2 = -3.354f,
                    dx3 = 4.045f,
                    dy3 = -4.963f,
                )
                // l 0.004 -0.007
                lineToRelative(dx = 0.004f, dy = -0.007f)
                // l 0.001 -0.001
                lineToRelative(dx = 0.001f, dy = -0.001f)
                // c 0.903 -1.66 1.893 -2.288 2.478 -2.17
                curveToRelative(
                    dx1 = 0.903f,
                    dy1 = -1.66f,
                    dx2 = 1.893f,
                    dy2 = -2.288f,
                    dx3 = 2.478f,
                    dy3 = -2.17f,
                )
                // c 0.419 0.084 0.529 0.545 0.557 0.813
                curveToRelative(
                    dx1 = 0.419f,
                    dy1 = 0.084f,
                    dx2 = 0.529f,
                    dy2 = 0.545f,
                    dx3 = 0.557f,
                    dy3 = 0.813f,
                )
                // a 0.35 0.35 0 0 0 0.696 -0.072
                arcToRelative(
                    a = 0.35f,
                    b = 0.35f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.696f,
                    dy1 = -0.072f,
                )
                // c -0.08 -0.77 -0.497 -1.303 -1.116 -1.427
                curveToRelative(
                    dx1 = -0.08f,
                    dy1 = -0.77f,
                    dx2 = -0.497f,
                    dy2 = -1.303f,
                    dx3 = -1.116f,
                    dy3 = -1.427f,
                )
                // c -0.401 -0.082 -0.919 0.021 -1.478 0.403
                curveToRelative(
                    dx1 = -0.401f,
                    dy1 = -0.082f,
                    dx2 = -0.919f,
                    dy2 = 0.021f,
                    dx3 = -1.478f,
                    dy3 = 0.403f,
                )
                // c 0.274 -0.542 0.606 -0.963 1.24 -1.26
                curveToRelative(
                    dx1 = 0.274f,
                    dy1 = -0.542f,
                    dx2 = 0.606f,
                    dy2 = -0.963f,
                    dx3 = 1.24f,
                    dy3 = -1.26f,
                )
                // c 0.05 -0.023 0.09 -0.053 0.137 -0.077
                curveToRelative(
                    dx1 = 0.05f,
                    dy1 = -0.023f,
                    dx2 = 0.09f,
                    dy2 = -0.053f,
                    dx3 = 0.137f,
                    dy3 = -0.077f,
                )
                // c 0.01 -0.004 0.021 -0.002 0.032 -0.007
                curveToRelative(
                    dx1 = 0.01f,
                    dy1 = -0.004f,
                    dx2 = 0.021f,
                    dy2 = -0.002f,
                    dx3 = 0.032f,
                    dy3 = -0.007f,
                )
                // l 8.348 -4.004
                lineToRelative(dx = 8.348f, dy = -4.004f)
                // c -0.002 -0.009 0 -0.017 -0.003 -0.026
                curveToRelative(
                    dx1 = -0.002f,
                    dy1 = -0.009f,
                    dx2 = 0.0f,
                    dy2 = -0.017f,
                    dx3 = -0.003f,
                    dy3 = -0.026f,
                )
                // l 0.094 -0.051
                lineToRelative(dx = 0.094f, dy = -0.051f)
                // a 0.5 0.5 0 0 0 0.246 -0.325
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.246f,
                    dy1 = -0.325f,
                )
                // a 0.335 0.335 0 0 0 -0.033 -0.134z
                arcToRelative(
                    a = 0.335f,
                    b = 0.335f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.033f,
                    dy1 = -0.134f,
                )
                close()
            }
            // M21 29.25 c-4.076 0 -6.156 -0.508 -6.243 -0.53 a1.001 1.001 0 0 1 -0.728 -1.213 1.005 1.005 0 0 1 1.211 -0.728 c0.039 0.01 1.982 0.471 5.759 0.471 3.796 0 5.74 -0.466 5.76 -0.471 a0.999 0.999 0 0 1 0.483 1.94 c-0.086 0.023 -2.166 0.531 -6.242 0.531z M18 14 h-4 a1 1 0 0 0 0 2 h0.519 c-0.319 0.532 -0.519 1.228 -0.519 2 0 1.658 0.896 3 2 3 s2 -1.343 2 -3 c0 -0.772 -0.2 -1.468 -0.519 -2 L18 16 a1 1 0 0 0 0 -2z M28 14 h-4 a1 1 0 0 0 0 2 h0.519 c-0.319 0.532 -0.519 1.228 -0.519 2 0 1.657 0.896 3 2 3 s2 -1.342 2 -3 c0 -0.772 -0.2 -1.468 -0.519 -2 L28 16 a1 1 0 0 0 0 -2z
            path(
                fill = SolidColor(Color(0xFF65471B)),
            ) {
                // M 21 29.25
                moveTo(x = 21.0f, y = 29.25f)
                // c -4.076 0 -6.156 -0.508 -6.243 -0.53
                curveToRelative(
                    dx1 = -4.076f,
                    dy1 = 0.0f,
                    dx2 = -6.156f,
                    dy2 = -0.508f,
                    dx3 = -6.243f,
                    dy3 = -0.53f,
                )
                // a 1.001 1.001 0 0 1 -0.728 -1.213
                arcToRelative(
                    a = 1.001f,
                    b = 1.001f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.728f,
                    dy1 = -1.213f,
                )
                // a 1.005 1.005 0 0 1 1.211 -0.728
                arcToRelative(
                    a = 1.005f,
                    b = 1.005f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.211f,
                    dy1 = -0.728f,
                )
                // c 0.039 0.01 1.982 0.471 5.759 0.471
                curveToRelative(
                    dx1 = 0.039f,
                    dy1 = 0.01f,
                    dx2 = 1.982f,
                    dy2 = 0.471f,
                    dx3 = 5.759f,
                    dy3 = 0.471f,
                )
                // c 3.796 0 5.74 -0.466 5.76 -0.471
                curveToRelative(
                    dx1 = 3.796f,
                    dy1 = 0.0f,
                    dx2 = 5.74f,
                    dy2 = -0.466f,
                    dx3 = 5.76f,
                    dy3 = -0.471f,
                )
                // a 0.999 0.999 0 0 1 0.483 1.94
                arcToRelative(
                    a = 0.999f,
                    b = 0.999f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.483f,
                    dy1 = 1.94f,
                )
                // c -0.086 0.023 -2.166 0.531 -6.242 0.531z
                curveToRelative(
                    dx1 = -0.086f,
                    dy1 = 0.023f,
                    dx2 = -2.166f,
                    dy2 = 0.531f,
                    dx3 = -6.242f,
                    dy3 = 0.531f,
                )
                close()
                // M 18 14
                moveTo(x = 18.0f, y = 14.0f)
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
                // h 0.519
                horizontalLineToRelative(dx = 0.519f)
                // c -0.319 0.532 -0.519 1.228 -0.519 2
                curveToRelative(
                    dx1 = -0.319f,
                    dy1 = 0.532f,
                    dx2 = -0.519f,
                    dy2 = 1.228f,
                    dx3 = -0.519f,
                    dy3 = 2.0f,
                )
                // c 0 1.658 0.896 3 2 3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.658f,
                    dx2 = 0.896f,
                    dy2 = 3.0f,
                    dx3 = 2.0f,
                    dy3 = 3.0f,
                )
                // s 2 -1.343 2 -3
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = -1.343f,
                    dx2 = 2.0f,
                    dy2 = -3.0f,
                )
                // c 0 -0.772 -0.2 -1.468 -0.519 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.772f,
                    dx2 = -0.2f,
                    dy2 = -1.468f,
                    dx3 = -0.519f,
                    dy3 = -2.0f,
                )
                // L 18 16
                lineTo(x = 18.0f, y = 16.0f)
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
                // M 28 14
                moveTo(x = 28.0f, y = 14.0f)
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
                // h 0.519
                horizontalLineToRelative(dx = 0.519f)
                // c -0.319 0.532 -0.519 1.228 -0.519 2
                curveToRelative(
                    dx1 = -0.319f,
                    dy1 = 0.532f,
                    dx2 = -0.519f,
                    dy2 = 1.228f,
                    dx3 = -0.519f,
                    dy3 = 2.0f,
                )
                // c 0 1.657 0.896 3 2 3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.657f,
                    dx2 = 0.896f,
                    dy2 = 3.0f,
                    dx3 = 2.0f,
                    dy3 = 3.0f,
                )
                // s 2 -1.342 2 -3
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = -1.342f,
                    dx2 = 2.0f,
                    dy2 = -3.0f,
                )
                // c 0 -0.772 -0.2 -1.468 -0.519 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.772f,
                    dx2 = -0.2f,
                    dy2 = -1.468f,
                    dx3 = -0.519f,
                    dy3 = -2.0f,
                )
                // L 28 16
                lineTo(x = 28.0f, y = 16.0f)
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
        }.build().also { _emoji1fae1 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1fae1: ImageVector? = null
