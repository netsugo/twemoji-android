package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1fac4: ImageVector
    get() {
        val current = _emoji1fac4
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1fac4",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // m29.902 20.444  l-5.185 -5.403 a3.312 3.312 0 0 0 -2.593 -1.263 L17.27 13.778 a3.333 3.333 0 0 0 -3.305 2.898 L13 24 l0.015 0.13 A7.4 7.4 0 0 0 13.263 36 L25 36 v-8.639 c2.017 -1.395 4.299 -3.011 4.902 -3.584 1.897 -1.805 0 -3.333 0 -3.333z M25.457 21.556 v-0.002 0.002z
            path(
                fill = SolidColor(Color(0xFFFA743E)),
            ) {
                // M 29.902 20.444
                moveTo(x = 29.902f, y = 20.444f)
                // l -5.185 -5.403
                lineToRelative(dx = -5.185f, dy = -5.403f)
                // a 3.312 3.312 0 0 0 -2.593 -1.263
                arcToRelative(
                    a = 3.312f,
                    b = 3.312f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.593f,
                    dy1 = -1.263f,
                )
                // L 17.27 13.778
                lineTo(x = 17.27f, y = 13.778f)
                // a 3.333 3.333 0 0 0 -3.305 2.898
                arcToRelative(
                    a = 3.333f,
                    b = 3.333f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.305f,
                    dy1 = 2.898f,
                )
                // L 13 24
                lineTo(x = 13.0f, y = 24.0f)
                // l 0.015 0.13
                lineToRelative(dx = 0.015f, dy = 0.13f)
                // A 7.4 7.4 0 0 0 13.263 36
                arcTo(
                    horizontalEllipseRadius = 7.4f,
                    verticalEllipseRadius = 7.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 13.263f,
                    y1 = 36.0f,
                )
                // L 25 36
                lineTo(x = 25.0f, y = 36.0f)
                // v -8.639
                verticalLineToRelative(dy = -8.639f)
                // c 2.017 -1.395 4.299 -3.011 4.902 -3.584
                curveToRelative(
                    dx1 = 2.017f,
                    dy1 = -1.395f,
                    dx2 = 4.299f,
                    dy2 = -3.011f,
                    dx3 = 4.902f,
                    dy3 = -3.584f,
                )
                // c 1.897 -1.805 0 -3.333 0 -3.333z
                curveToRelative(
                    dx1 = 1.897f,
                    dy1 = -1.805f,
                    dx2 = 0.0f,
                    dy2 = -3.333f,
                    dx3 = 0.0f,
                    dy3 = -3.333f,
                )
                close()
                // M 25.457 21.556
                moveTo(x = 25.457f, y = 21.556f)
                // v -0.002
                verticalLineToRelative(dy = -0.002f)
                // v 0.002z
                verticalLineToRelative(dy = 0.002f)
                close()
            }
            // m24.999 27.362  l-0.001 1.309 -3.94 2.674 -2.641 -4.139 5.645 -5.81 -1.939 -1.923 0.501 -0.751 2.834 2.833 -6.054 5.89 2.222 2.222 s1.582 -1.066 3.373 -2.305z M17.577 21.625 c-0.782 0 -1.536 0.115 -2.254 0.317 a6.312 6.312 0 0 1 -0.078 -0.942 c0 -1.932 0.834 -3.311 1.607 -3.48 l-0.214 -0.977 c-1.387 0.304 -2.393 2.179 -2.393 4.457 0 0.435 0.049 0.856 0.122 1.267 a8.348 8.348 0 0 0 -5.137 7.705 c0 2.372 0.994 4.508 2.584 6.028 h1.449 a7.405 7.405 0 0 1 -3.105 -6.028 7.418 7.418 0 0 1 7.419 -7.419 c0.414 0 0.817 0.043 1.213 0.109 v-0.936 a8.225 8.225 0 0 0 -1.213 -0.101z
            path(
                fill = SolidColor(Color(0xFFDD551F)),
            ) {
                // M 24.999 27.362
                moveTo(x = 24.999f, y = 27.362f)
                // l -0.001 1.309
                lineToRelative(dx = -0.001f, dy = 1.309f)
                // l -3.94 2.674
                lineToRelative(dx = -3.94f, dy = 2.674f)
                // l -2.641 -4.139
                lineToRelative(dx = -2.641f, dy = -4.139f)
                // l 5.645 -5.81
                lineToRelative(dx = 5.645f, dy = -5.81f)
                // l -1.939 -1.923
                lineToRelative(dx = -1.939f, dy = -1.923f)
                // l 0.501 -0.751
                lineToRelative(dx = 0.501f, dy = -0.751f)
                // l 2.834 2.833
                lineToRelative(dx = 2.834f, dy = 2.833f)
                // l -6.054 5.89
                lineToRelative(dx = -6.054f, dy = 5.89f)
                // l 2.222 2.222
                lineToRelative(dx = 2.222f, dy = 2.222f)
                // s 1.582 -1.066 3.373 -2.305z
                reflectiveCurveToRelative(
                    dx1 = 1.582f,
                    dy1 = -1.066f,
                    dx2 = 3.373f,
                    dy2 = -2.305f,
                )
                close()
                // M 17.577 21.625
                moveTo(x = 17.577f, y = 21.625f)
                // c -0.782 0 -1.536 0.115 -2.254 0.317
                curveToRelative(
                    dx1 = -0.782f,
                    dy1 = 0.0f,
                    dx2 = -1.536f,
                    dy2 = 0.115f,
                    dx3 = -2.254f,
                    dy3 = 0.317f,
                )
                // a 6.312 6.312 0 0 1 -0.078 -0.942
                arcToRelative(
                    a = 6.312f,
                    b = 6.312f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.078f,
                    dy1 = -0.942f,
                )
                // c 0 -1.932 0.834 -3.311 1.607 -3.48
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.932f,
                    dx2 = 0.834f,
                    dy2 = -3.311f,
                    dx3 = 1.607f,
                    dy3 = -3.48f,
                )
                // l -0.214 -0.977
                lineToRelative(dx = -0.214f, dy = -0.977f)
                // c -1.387 0.304 -2.393 2.179 -2.393 4.457
                curveToRelative(
                    dx1 = -1.387f,
                    dy1 = 0.304f,
                    dx2 = -2.393f,
                    dy2 = 2.179f,
                    dx3 = -2.393f,
                    dy3 = 4.457f,
                )
                // c 0 0.435 0.049 0.856 0.122 1.267
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.435f,
                    dx2 = 0.049f,
                    dy2 = 0.856f,
                    dx3 = 0.122f,
                    dy3 = 1.267f,
                )
                // a 8.348 8.348 0 0 0 -5.137 7.705
                arcToRelative(
                    a = 8.348f,
                    b = 8.348f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -5.137f,
                    dy1 = 7.705f,
                )
                // c 0 2.372 0.994 4.508 2.584 6.028
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.372f,
                    dx2 = 0.994f,
                    dy2 = 4.508f,
                    dx3 = 2.584f,
                    dy3 = 6.028f,
                )
                // h 1.449
                horizontalLineToRelative(dx = 1.449f)
                // a 7.405 7.405 0 0 1 -3.105 -6.028
                arcToRelative(
                    a = 7.405f,
                    b = 7.405f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.105f,
                    dy1 = -6.028f,
                )
                // a 7.418 7.418 0 0 1 7.419 -7.419
                arcToRelative(
                    a = 7.418f,
                    b = 7.418f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 7.419f,
                    dy1 = -7.419f,
                )
                // c 0.414 0 0.817 0.043 1.213 0.109
                curveToRelative(
                    dx1 = 0.414f,
                    dy1 = 0.0f,
                    dx2 = 0.817f,
                    dy2 = 0.043f,
                    dx3 = 1.213f,
                    dy3 = 0.109f,
                )
                // v -0.936
                verticalLineToRelative(dy = -0.936f)
                // a 8.225 8.225 0 0 0 -1.213 -0.101z
                arcToRelative(
                    a = 8.225f,
                    b = 8.225f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.213f,
                    dy1 = -0.101f,
                )
                close()
            }
            // M20.331 27.532 c-1.124 -0.535 -2.19 -0.461 -3.221 0.142 -0.493 0.289 -0.694 0.829 0.061 1.008 0.758 0.177 3.16 -1.15 3.16 -1.15z
            path(
                fill = SolidColor(Color(0xFFF9CA55)),
            ) {
                // M 20.331 27.532
                moveTo(x = 20.331f, y = 27.532f)
                // c -1.124 -0.535 -2.19 -0.461 -3.221 0.142
                curveToRelative(
                    dx1 = -1.124f,
                    dy1 = -0.535f,
                    dx2 = -2.19f,
                    dy2 = -0.461f,
                    dx3 = -3.221f,
                    dy3 = 0.142f,
                )
                // c -0.493 0.289 -0.694 0.829 0.061 1.008
                curveToRelative(
                    dx1 = -0.493f,
                    dy1 = 0.289f,
                    dx2 = -0.694f,
                    dy2 = 0.829f,
                    dx3 = 0.061f,
                    dy3 = 1.008f,
                )
                // c 0.758 0.177 3.16 -1.15 3.16 -1.15z
                curveToRelative(
                    dx1 = 0.758f,
                    dy1 = 0.177f,
                    dx2 = 3.16f,
                    dy2 = -1.15f,
                    dx3 = 3.16f,
                    dy3 = -1.15f,
                )
                close()
            }
            // M21.845 29.449 c0.139 1.765 -2.226 3.414 -4.02 3.199 -1.282 -0.154 -2.398 -3.608 -0.877 -4.053 1.356 -0.396 1.731 -1.628 3.34 -1.168 1.278 0.366 1.506 1.344 1.557 2.022z
            path(
                fill = SolidColor(Color(0xFFFFDC5D)),
            ) {
                // M 21.845 29.449
                moveTo(x = 21.845f, y = 29.449f)
                // c 0.139 1.765 -2.226 3.414 -4.02 3.199
                curveToRelative(
                    dx1 = 0.139f,
                    dy1 = 1.765f,
                    dx2 = -2.226f,
                    dy2 = 3.414f,
                    dx3 = -4.02f,
                    dy3 = 3.199f,
                )
                // c -1.282 -0.154 -2.398 -3.608 -0.877 -4.053
                curveToRelative(
                    dx1 = -1.282f,
                    dy1 = -0.154f,
                    dx2 = -2.398f,
                    dy2 = -3.608f,
                    dx3 = -0.877f,
                    dy3 = -4.053f,
                )
                // c 1.356 -0.396 1.731 -1.628 3.34 -1.168
                curveToRelative(
                    dx1 = 1.356f,
                    dy1 = -0.396f,
                    dx2 = 1.731f,
                    dy2 = -1.628f,
                    dx3 = 3.34f,
                    dy3 = -1.168f,
                )
                // c 1.278 0.366 1.506 1.344 1.557 2.022z
                curveToRelative(
                    dx1 = 1.278f,
                    dy1 = 0.366f,
                    dx2 = 1.506f,
                    dy2 = 1.344f,
                    dx3 = 1.557f,
                    dy3 = 2.022f,
                )
                close()
            }
            // m20.659 30.132  l-0.212 -0.441 s-0.771 1.147 -1.843 1.59 c-0.813 0.332 -1.498 0.365 -1.857 0.306 0.154 0.293 0.157 0.343 0.359 0.53 1.117 0.039 2.902 -0.56 3.553 -1.985z M18.442 30.093 c0.99 -0.678 1.279 -1.326 1.279 -1.326 l-0.323 -0.409 s-1.145 1.776 -3.177 1.685 c0.015 0.248 -0.005 0.296 0.068 0.55 0.273 0.009 1.349 0.05 2.153 -0.5z
            path(
                fill = SolidColor(Color(0xFFEF9645)),
            ) {
                // M 20.659 30.132
                moveTo(x = 20.659f, y = 30.132f)
                // l -0.212 -0.441
                lineToRelative(dx = -0.212f, dy = -0.441f)
                // s -0.771 1.147 -1.843 1.59
                reflectiveCurveToRelative(
                    dx1 = -0.771f,
                    dy1 = 1.147f,
                    dx2 = -1.843f,
                    dy2 = 1.59f,
                )
                // c -0.813 0.332 -1.498 0.365 -1.857 0.306
                curveToRelative(
                    dx1 = -0.813f,
                    dy1 = 0.332f,
                    dx2 = -1.498f,
                    dy2 = 0.365f,
                    dx3 = -1.857f,
                    dy3 = 0.306f,
                )
                // c 0.154 0.293 0.157 0.343 0.359 0.53
                curveToRelative(
                    dx1 = 0.154f,
                    dy1 = 0.293f,
                    dx2 = 0.157f,
                    dy2 = 0.343f,
                    dx3 = 0.359f,
                    dy3 = 0.53f,
                )
                // c 1.117 0.039 2.902 -0.56 3.553 -1.985z
                curveToRelative(
                    dx1 = 1.117f,
                    dy1 = 0.039f,
                    dx2 = 2.902f,
                    dy2 = -0.56f,
                    dx3 = 3.553f,
                    dy3 = -1.985f,
                )
                close()
                // M 18.442 30.093
                moveTo(x = 18.442f, y = 30.093f)
                // c 0.99 -0.678 1.279 -1.326 1.279 -1.326
                curveToRelative(
                    dx1 = 0.99f,
                    dy1 = -0.678f,
                    dx2 = 1.279f,
                    dy2 = -1.326f,
                    dx3 = 1.279f,
                    dy3 = -1.326f,
                )
                // l -0.323 -0.409
                lineToRelative(dx = -0.323f, dy = -0.409f)
                // s -1.145 1.776 -3.177 1.685
                reflectiveCurveToRelative(
                    dx1 = -1.145f,
                    dy1 = 1.776f,
                    dx2 = -3.177f,
                    dy2 = 1.685f,
                )
                // c 0.015 0.248 -0.005 0.296 0.068 0.55
                curveToRelative(
                    dx1 = 0.015f,
                    dy1 = 0.248f,
                    dx2 = -0.005f,
                    dy2 = 0.296f,
                    dx3 = 0.068f,
                    dy3 = 0.55f,
                )
                // c 0.273 0.009 1.349 0.05 2.153 -0.5z
                curveToRelative(
                    dx1 = 0.273f,
                    dy1 = 0.009f,
                    dx2 = 1.349f,
                    dy2 = 0.05f,
                    dx3 = 2.153f,
                    dy3 = -0.5f,
                )
                close()
            }
            // m11.647 6.297  l1.832 4.41 c1.008 2.424 2.382 4.16 4.803 3.165 l0.082 0.326 c0.206 0.817 0.055 1.478 1.258 1.524 0.841 0.032 1.977 -1.47 1.771 -2.287 l-0.41 -1.636 c1.203 -1.435 1.921 -3.269 1.304 -4.751 l-1.02 -2.457 c-5.514 2.076 -7.783 -0.773 -7.783 -0.773 l-1.837 2.479z
            path(
                fill = SolidColor(Color(0xFFFFDC5D)),
            ) {
                // M 11.647 6.297
                moveTo(x = 11.647f, y = 6.297f)
                // l 1.832 4.41
                lineToRelative(dx = 1.832f, dy = 4.41f)
                // c 1.008 2.424 2.382 4.16 4.803 3.165
                curveToRelative(
                    dx1 = 1.008f,
                    dy1 = 2.424f,
                    dx2 = 2.382f,
                    dy2 = 4.16f,
                    dx3 = 4.803f,
                    dy3 = 3.165f,
                )
                // l 0.082 0.326
                lineToRelative(dx = 0.082f, dy = 0.326f)
                // c 0.206 0.817 0.055 1.478 1.258 1.524
                curveToRelative(
                    dx1 = 0.206f,
                    dy1 = 0.817f,
                    dx2 = 0.055f,
                    dy2 = 1.478f,
                    dx3 = 1.258f,
                    dy3 = 1.524f,
                )
                // c 0.841 0.032 1.977 -1.47 1.771 -2.287
                curveToRelative(
                    dx1 = 0.841f,
                    dy1 = 0.032f,
                    dx2 = 1.977f,
                    dy2 = -1.47f,
                    dx3 = 1.771f,
                    dy3 = -2.287f,
                )
                // l -0.41 -1.636
                lineToRelative(dx = -0.41f, dy = -1.636f)
                // c 1.203 -1.435 1.921 -3.269 1.304 -4.751
                curveToRelative(
                    dx1 = 1.203f,
                    dy1 = -1.435f,
                    dx2 = 1.921f,
                    dy2 = -3.269f,
                    dx3 = 1.304f,
                    dy3 = -4.751f,
                )
                // l -1.02 -2.457
                lineToRelative(dx = -1.02f, dy = -2.457f)
                // c -5.514 2.076 -7.783 -0.773 -7.783 -0.773
                curveToRelative(
                    dx1 = -5.514f,
                    dy1 = 2.076f,
                    dx2 = -7.783f,
                    dy2 = -0.773f,
                    dx3 = -7.783f,
                    dy3 = -0.773f,
                )
                // l -1.837 2.479z
                lineToRelative(dx = -1.837f, dy = 2.479f)
                close()
            }
            // M17.568 0.414 c-1.943 0 -3.934 1.111 -4.968 2.511 -2.24 0.001 -2.461 2.004 -2.237 2.758 0.665 2.24 4.064 0.359 6.514 3.15 0 0 -0.337 -1.073 0.163 -2.138 0.861 2.538 2.743 1.061 4.002 4.63 C24.444 10 25.919 0.414 17.568 0.414z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 17.568 0.414
                moveTo(x = 17.568f, y = 0.414f)
                // c -1.943 0 -3.934 1.111 -4.968 2.511
                curveToRelative(
                    dx1 = -1.943f,
                    dy1 = 0.0f,
                    dx2 = -3.934f,
                    dy2 = 1.111f,
                    dx3 = -4.968f,
                    dy3 = 2.511f,
                )
                // c -2.24 0.001 -2.461 2.004 -2.237 2.758
                curveToRelative(
                    dx1 = -2.24f,
                    dy1 = 0.001f,
                    dx2 = -2.461f,
                    dy2 = 2.004f,
                    dx3 = -2.237f,
                    dy3 = 2.758f,
                )
                // c 0.665 2.24 4.064 0.359 6.514 3.15
                curveToRelative(
                    dx1 = 0.665f,
                    dy1 = 2.24f,
                    dx2 = 4.064f,
                    dy2 = 0.359f,
                    dx3 = 6.514f,
                    dy3 = 3.15f,
                )
                // c 0 0 -0.337 -1.073 0.163 -2.138
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -0.337f,
                    dy2 = -1.073f,
                    dx3 = 0.163f,
                    dy3 = -2.138f,
                )
                // c 0.861 2.538 2.743 1.061 4.002 4.63
                curveToRelative(
                    dx1 = 0.861f,
                    dy1 = 2.538f,
                    dx2 = 2.743f,
                    dy2 = 1.061f,
                    dx3 = 4.002f,
                    dy3 = 4.63f,
                )
                // C 24.444 10 25.919 0.414 17.568 0.414z
                curveTo(
                    x1 = 24.444f,
                    y1 = 10.0f,
                    x2 = 25.919f,
                    y2 = 0.414f,
                    x3 = 17.568f,
                    y3 = 0.414f,
                )
                close()
            }
            // m14.342 11.782  l-0.308 0.128 a0.265 0.265 0 1 1 -0.204 -0.489 l0.309 -0.128 a0.265 0.265 0 1 1 0.203 0.489z
            path(
                fill = SolidColor(Color(0xFFC1694F)),
            ) {
                // M 14.342 11.782
                moveTo(x = 14.342f, y = 11.782f)
                // l -0.308 0.128
                lineToRelative(dx = -0.308f, dy = 0.128f)
                // a 0.265 0.265 0 1 1 -0.204 -0.489
                arcToRelative(
                    a = 0.265f,
                    b = 0.265f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -0.204f,
                    dy1 = -0.489f,
                )
                // l 0.309 -0.128
                lineToRelative(dx = 0.309f, dy = -0.128f)
                // a 0.265 0.265 0 1 1 0.203 0.489z
                arcToRelative(
                    a = 0.265f,
                    b = 0.265f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.203f,
                    dy1 = 0.489f,
                )
                close()
            }
            // M14.493 9.711 a0.53 0.53 0 0 1 -0.692 -0.286 l-0.205 -0.491 a0.53 0.53 0 0 1 0.98 -0.407 l0.204 0.49 a0.53 0.53 0 0 1 -0.287 0.694z
            path(
                fill = SolidColor(Color(0xFF662113)),
            ) {
                // M 14.493 9.711
                moveTo(x = 14.493f, y = 9.711f)
                // a 0.53 0.53 0 0 1 -0.692 -0.286
                arcToRelative(
                    a = 0.53f,
                    b = 0.53f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.692f,
                    dy1 = -0.286f,
                )
                // l -0.205 -0.491
                lineToRelative(dx = -0.205f, dy = -0.491f)
                // a 0.53 0.53 0 0 1 0.98 -0.407
                arcToRelative(
                    a = 0.53f,
                    b = 0.53f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.98f,
                    dy1 = -0.407f,
                )
                // l 0.204 0.49
                lineToRelative(dx = 0.204f, dy = 0.49f)
                // a 0.53 0.53 0 0 1 -0.287 0.694z
                arcToRelative(
                    a = 0.53f,
                    b = 0.53f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.287f,
                    dy1 = 0.694f,
                )
                close()
            }
            // M16.116 12.096 c-0.284 0.258 -0.724 0.622 -1.266 0.989 0.189 0.216 0.39 0.402 0.604 0.558 0.511 -0.357 0.923 -0.704 1.2 -0.956 a0.4 0.4 0 1 0 -0.538 -0.591z
            path(
                fill = SolidColor(Color(0xFFC1694F)),
            ) {
                // M 16.116 12.096
                moveTo(x = 16.116f, y = 12.096f)
                // c -0.284 0.258 -0.724 0.622 -1.266 0.989
                curveToRelative(
                    dx1 = -0.284f,
                    dy1 = 0.258f,
                    dx2 = -0.724f,
                    dy2 = 0.622f,
                    dx3 = -1.266f,
                    dy3 = 0.989f,
                )
                // c 0.189 0.216 0.39 0.402 0.604 0.558
                curveToRelative(
                    dx1 = 0.189f,
                    dy1 = 0.216f,
                    dx2 = 0.39f,
                    dy2 = 0.402f,
                    dx3 = 0.604f,
                    dy3 = 0.558f,
                )
                // c 0.511 -0.357 0.923 -0.704 1.2 -0.956
                curveToRelative(
                    dx1 = 0.511f,
                    dy1 = -0.357f,
                    dx2 = 0.923f,
                    dy2 = -0.704f,
                    dx3 = 1.2f,
                    dy3 = -0.956f,
                )
                // a 0.4 0.4 0 1 0 -0.538 -0.591z
                arcToRelative(
                    a = 0.4f,
                    b = 0.4f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -0.538f,
                    dy1 = -0.591f,
                )
                close()
            }
        }.build().also { _emoji1fac4 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1fac4: ImageVector? = null
