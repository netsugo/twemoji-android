package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f9be: ImageVector
    get() {
        val current = _emoji1f9be
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f9be",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M8.553 29.973 m-4.478 0 a4.478 4.478 0 1 1 8.956 0 a4.478 4.478 0 1 1 -8.956 0
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 8.553 29.973
                moveTo(x = 8.553f, y = 29.973f)
                // m -4.478 0
                moveToRelative(dx = -4.478f, dy = 0.0f)
                // a 4.478 4.478 0 1 1 8.956 0
                arcToRelative(
                    a = 4.478f,
                    b = 4.478f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 8.956f,
                    dy1 = 0.0f,
                )
                // a 4.478 4.478 0 1 1 -8.956 0
                arcToRelative(
                    a = 4.478f,
                    b = 4.478f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -8.956f,
                    dy1 = 0.0f,
                )
            }
            // M10.482 34.451 c5.29 2 17 1 20 -1 s5.658 -4.054 5 -8 c-1 -6 -9 -7 -14 -6 -4.903 0.981 -9 4 -10 6 -0.632 1.265 0 3 0 5 0 3 -1.936 3.646 -1 4z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 10.482 34.451
                moveTo(x = 10.482f, y = 34.451f)
                // c 5.29 2 17 1 20 -1
                curveToRelative(
                    dx1 = 5.29f,
                    dy1 = 2.0f,
                    dx2 = 17.0f,
                    dy2 = 1.0f,
                    dx3 = 20.0f,
                    dy3 = -1.0f,
                )
                // s 5.658 -4.054 5 -8
                reflectiveCurveToRelative(
                    dx1 = 5.658f,
                    dy1 = -4.054f,
                    dx2 = 5.0f,
                    dy2 = -8.0f,
                )
                // c -1 -6 -9 -7 -14 -6
                curveToRelative(
                    dx1 = -1.0f,
                    dy1 = -6.0f,
                    dx2 = -9.0f,
                    dy2 = -7.0f,
                    dx3 = -14.0f,
                    dy3 = -6.0f,
                )
                // c -4.903 0.981 -9 4 -10 6
                curveToRelative(
                    dx1 = -4.903f,
                    dy1 = 0.981f,
                    dx2 = -9.0f,
                    dy2 = 4.0f,
                    dx3 = -10.0f,
                    dy3 = 6.0f,
                )
                // c -0.632 1.265 0 3 0 5
                curveToRelative(
                    dx1 = -0.632f,
                    dy1 = 1.265f,
                    dx2 = 0.0f,
                    dy2 = 3.0f,
                    dx3 = 0.0f,
                    dy3 = 5.0f,
                )
                // c 0 3 -1.936 3.646 -1 4z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.0f,
                    dx2 = -1.936f,
                    dy2 = 3.646f,
                    dx3 = -1.0f,
                    dy3 = 4.0f,
                )
                close()
            }
            // M30.482 33.451 c3 -2 5.658 -4.054 5 -8 l-0.005 -0.02 c-2.609 1.493 -6.824 3.435 -12.309 4.37 -4.599 0.784 -8.938 0.861 -11.692 0.798 -0.064 2.869 -1.913 3.505 -0.994 3.852 5.29 2 17 1 20 -1z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 30.482 33.451
                moveTo(x = 30.482f, y = 33.451f)
                // c 3 -2 5.658 -4.054 5 -8
                curveToRelative(
                    dx1 = 3.0f,
                    dy1 = -2.0f,
                    dx2 = 5.658f,
                    dy2 = -4.054f,
                    dx3 = 5.0f,
                    dy3 = -8.0f,
                )
                // l -0.005 -0.02
                lineToRelative(dx = -0.005f, dy = -0.02f)
                // c -2.609 1.493 -6.824 3.435 -12.309 4.37
                curveToRelative(
                    dx1 = -2.609f,
                    dy1 = 1.493f,
                    dx2 = -6.824f,
                    dy2 = 3.435f,
                    dx3 = -12.309f,
                    dy3 = 4.37f,
                )
                // c -4.599 0.784 -8.938 0.861 -11.692 0.798
                curveToRelative(
                    dx1 = -4.599f,
                    dy1 = 0.784f,
                    dx2 = -8.938f,
                    dy2 = 0.861f,
                    dx3 = -11.692f,
                    dy3 = 0.798f,
                )
                // c -0.064 2.869 -1.913 3.505 -0.994 3.852
                curveToRelative(
                    dx1 = -0.064f,
                    dy1 = 2.869f,
                    dx2 = -1.913f,
                    dy2 = 3.505f,
                    dx3 = -0.994f,
                    dy3 = 3.852f,
                )
                // c 5.29 2 17 1 20 -1z
                curveToRelative(
                    dx1 = 5.29f,
                    dy1 = 2.0f,
                    dx2 = 17.0f,
                    dy2 = 1.0f,
                    dx3 = 20.0f,
                    dy3 = -1.0f,
                )
                close()
            }
            // M8.489 9.789 m-2.42 0 a2.42 2.42 0 1 1 4.84 0 a2.42 2.42 0 1 1 -4.84 0
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 8.489 9.789
                moveTo(x = 8.489f, y = 9.789f)
                // m -2.42 0
                moveToRelative(dx = -2.42f, dy = 0.0f)
                // a 2.42 2.42 0 1 1 4.84 0
                arcToRelative(
                    a = 2.42f,
                    b = 2.42f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.84f,
                    dy1 = 0.0f,
                )
                // a 2.42 2.42 0 1 1 -4.84 0
                arcToRelative(
                    a = 2.42f,
                    b = 2.42f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.84f,
                    dy1 = 0.0f,
                )
            }
            // M2.495 31.311 c-3.926 -5.609 -1.447 -12.69 0.586 -17.247 1.559 -3.495 3.025 -4.696 3.025 -4.696 l4.557 2.033 s-1.724 4.645 -1.192 8.237 c0.561 3.786 1.227 6.976 -0.596 10.341 s-5.399 2.734 -6.38 1.332z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 2.495 31.311
                moveTo(x = 2.495f, y = 31.311f)
                // c -3.926 -5.609 -1.447 -12.69 0.586 -17.247
                curveToRelative(
                    dx1 = -3.926f,
                    dy1 = -5.609f,
                    dx2 = -1.447f,
                    dy2 = -12.69f,
                    dx3 = 0.586f,
                    dy3 = -17.247f,
                )
                // c 1.559 -3.495 3.025 -4.696 3.025 -4.696
                curveToRelative(
                    dx1 = 1.559f,
                    dy1 = -3.495f,
                    dx2 = 3.025f,
                    dy2 = -4.696f,
                    dx3 = 3.025f,
                    dy3 = -4.696f,
                )
                // l 4.557 2.033
                lineToRelative(dx = 4.557f, dy = 2.033f)
                // s -1.724 4.645 -1.192 8.237
                reflectiveCurveToRelative(
                    dx1 = -1.724f,
                    dy1 = 4.645f,
                    dx2 = -1.192f,
                    dy2 = 8.237f,
                )
                // c 0.561 3.786 1.227 6.976 -0.596 10.341
                curveToRelative(
                    dx1 = 0.561f,
                    dy1 = 3.786f,
                    dx2 = 1.227f,
                    dy2 = 6.976f,
                    dx3 = -0.596f,
                    dy3 = 10.341f,
                )
                // s -5.399 2.734 -6.38 1.332z
                reflectiveCurveToRelative(
                    dx1 = -5.399f,
                    dy1 = 2.734f,
                    dx2 = -6.38f,
                    dy2 = 1.332f,
                )
                close()
            }
            // M7.952 10.192 l2.711 1.21 s-1.724 4.645 -1.192 8.237 c0.561 3.786 1.227 6.976 -0.596 10.341 -0.754 1.392 -1.808 2.1 -2.855 2.353 -4.436 -9.786 1.932 -22.141 1.932 -22.141z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 7.952 10.192
                moveTo(x = 7.952f, y = 10.192f)
                // l 2.711 1.21
                lineToRelative(dx = 2.711f, dy = 1.21f)
                // s -1.724 4.645 -1.192 8.237
                reflectiveCurveToRelative(
                    dx1 = -1.724f,
                    dy1 = 4.645f,
                    dx2 = -1.192f,
                    dy2 = 8.237f,
                )
                // c 0.561 3.786 1.227 6.976 -0.596 10.341
                curveToRelative(
                    dx1 = 0.561f,
                    dy1 = 3.786f,
                    dx2 = 1.227f,
                    dy2 = 6.976f,
                    dx3 = -0.596f,
                    dy3 = 10.341f,
                )
                // c -0.754 1.392 -1.808 2.1 -2.855 2.353
                curveToRelative(
                    dx1 = -0.754f,
                    dy1 = 1.392f,
                    dx2 = -1.808f,
                    dy2 = 2.1f,
                    dx3 = -2.855f,
                    dy3 = 2.353f,
                )
                // c -4.436 -9.786 1.932 -22.141 1.932 -22.141z
                curveToRelative(
                    dx1 = -4.436f,
                    dy1 = -9.786f,
                    dx2 = 1.932f,
                    dy2 = -22.141f,
                    dx3 = 1.932f,
                    dy3 = -22.141f,
                )
                close()
            }
            // M6.316 8.176 C6.737 5.792 10.172 0.254 11.364 0.464 s6.94 2.454 7.922 3.856 -1.052 5.959 -2.244 5.749 c-1.192 -0.21 -0.771 -2.594 -0.771 -2.594 s0.21 -1.192 -1.192 -0.21 l-2.804 1.963 c-1.402 0.982 -5.959 -1.052 -5.959 -1.052z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 6.316 8.176
                moveTo(x = 6.316f, y = 8.176f)
                // C 6.737 5.792 10.172 0.254 11.364 0.464
                curveTo(
                    x1 = 6.737f,
                    y1 = 5.792f,
                    x2 = 10.172f,
                    y2 = 0.254f,
                    x3 = 11.364f,
                    y3 = 0.464f,
                )
                // s 6.94 2.454 7.922 3.856
                reflectiveCurveToRelative(
                    dx1 = 6.94f,
                    dy1 = 2.454f,
                    dx2 = 7.922f,
                    dy2 = 3.856f,
                )
                // s -1.052 5.959 -2.244 5.749
                reflectiveCurveToRelative(
                    dx1 = -1.052f,
                    dy1 = 5.959f,
                    dx2 = -2.244f,
                    dy2 = 5.749f,
                )
                // c -1.192 -0.21 -0.771 -2.594 -0.771 -2.594
                curveToRelative(
                    dx1 = -1.192f,
                    dy1 = -0.21f,
                    dx2 = -0.771f,
                    dy2 = -2.594f,
                    dx3 = -0.771f,
                    dy3 = -2.594f,
                )
                // s 0.21 -1.192 -1.192 -0.21
                reflectiveCurveToRelative(
                    dx1 = 0.21f,
                    dy1 = -1.192f,
                    dx2 = -1.192f,
                    dy2 = -0.21f,
                )
                // l -2.804 1.963
                lineToRelative(dx = -2.804f, dy = 1.963f)
                // c -1.402 0.982 -5.959 -1.052 -5.959 -1.052z
                curveToRelative(
                    dx1 = -1.402f,
                    dy1 = 0.982f,
                    dx2 = -5.959f,
                    dy2 = -1.052f,
                    dx3 = -5.959f,
                    dy3 = -1.052f,
                )
                close()
            }
            // M6.316 8.176 c-0.981 -1.402 -0.35 -4.978 -0.14 -6.169 0.21 -1.192 2.594 -0.771 2.173 1.613 -0.42 2.383 0.771 2.594 0.771 2.594 L6.316 8.176z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 6.316 8.176
                moveTo(x = 6.316f, y = 8.176f)
                // c -0.981 -1.402 -0.35 -4.978 -0.14 -6.169
                curveToRelative(
                    dx1 = -0.981f,
                    dy1 = -1.402f,
                    dx2 = -0.35f,
                    dy2 = -4.978f,
                    dx3 = -0.14f,
                    dy3 = -6.169f,
                )
                // c 0.21 -1.192 2.594 -0.771 2.173 1.613
                curveToRelative(
                    dx1 = 0.21f,
                    dy1 = -1.192f,
                    dx2 = 2.594f,
                    dy2 = -0.771f,
                    dx3 = 2.173f,
                    dy3 = 1.613f,
                )
                // c -0.42 2.383 0.771 2.594 0.771 2.594
                curveToRelative(
                    dx1 = -0.42f,
                    dy1 = 2.383f,
                    dx2 = 0.771f,
                    dy2 = 2.594f,
                    dx3 = 0.771f,
                    dy3 = 2.594f,
                )
                // L 6.316 8.176z
                lineTo(x = 6.316f, y = 8.176f)
                close()
            }
            // M6.316 8.176 C6.737 5.792 10.172 0.254 11.364 0.464 s6.94 2.454 7.922 3.856 c-5.749 -2.244 -7.782 2.313 -8.192 5.174 -1.886 -0.027 -4.778 -1.318 -4.778 -1.318z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 6.316 8.176
                moveTo(x = 6.316f, y = 8.176f)
                // C 6.737 5.792 10.172 0.254 11.364 0.464
                curveTo(
                    x1 = 6.737f,
                    y1 = 5.792f,
                    x2 = 10.172f,
                    y2 = 0.254f,
                    x3 = 11.364f,
                    y3 = 0.464f,
                )
                // s 6.94 2.454 7.922 3.856
                reflectiveCurveToRelative(
                    dx1 = 6.94f,
                    dy1 = 2.454f,
                    dx2 = 7.922f,
                    dy2 = 3.856f,
                )
                // c -5.749 -2.244 -7.782 2.313 -8.192 5.174
                curveToRelative(
                    dx1 = -5.749f,
                    dy1 = -2.244f,
                    dx2 = -7.782f,
                    dy2 = 2.313f,
                    dx3 = -8.192f,
                    dy3 = 5.174f,
                )
                // c -1.886 -0.027 -4.778 -1.318 -4.778 -1.318z
                curveToRelative(
                    dx1 = -1.886f,
                    dy1 = -0.027f,
                    dx2 = -4.778f,
                    dy2 = -1.318f,
                    dx3 = -4.778f,
                    dy3 = -1.318f,
                )
                close()
            }
        }.build().also { _emoji1f9be = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f9be: ImageVector? = null
