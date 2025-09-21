package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f4e8: ImageVector
    get() {
        val current = _emoji1f4e8
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f4e8",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M7 12 c0 0.552 -0.448 1 -1 1 H1 c-0.552 0 -1 -0.448 -1 -1 s0.448 -1 1 -1 h5 c0.552 0 1 0.448 1 1 m-2 5 c0 0.552 -0.448 1 -1 1 H1 c-0.552 0 -1 -0.448 -1 -1 s0.448 -1 1 -1 h3 c0.552 0 1 0.448 1 1 m-2 5 c0 0.553 -0.448 1 -1 1 H1 c-0.552 0 -1 -0.447 -1 -1 s0.448 -1 1 -1 h1 c0.552 0 1 0.447 1 1
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 7 12
                moveTo(x = 7.0f, y = 12.0f)
                // c 0 0.552 -0.448 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = -0.448f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // H 1
                horizontalLineTo(x = 1.0f)
                // c -0.552 0 -1 -0.448 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.448f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // s 0.448 -1 1 -1
                reflectiveCurveToRelative(
                    dx1 = 0.448f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // c 0.552 0 1 0.448 1 1
                curveToRelative(
                    dx1 = 0.552f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.448f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // m -2 5
                moveToRelative(dx = -2.0f, dy = 5.0f)
                // c 0 0.552 -0.448 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = -0.448f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // H 1
                horizontalLineTo(x = 1.0f)
                // c -0.552 0 -1 -0.448 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.448f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // s 0.448 -1 1 -1
                reflectiveCurveToRelative(
                    dx1 = 0.448f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // c 0.552 0 1 0.448 1 1
                curveToRelative(
                    dx1 = 0.552f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.448f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // m -2 5
                moveToRelative(dx = -2.0f, dy = 5.0f)
                // c 0 0.553 -0.448 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.448f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // H 1
                horizontalLineTo(x = 1.0f)
                // c -0.552 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // s 0.448 -1 1 -1
                reflectiveCurveToRelative(
                    dx1 = 0.448f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // c 0.552 0 1 0.447 1 1
                curveToRelative(
                    dx1 = 0.552f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.447f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
            }
            // M32.301 25 c-0.626 2.209 -2.925 4 -5.134 4 h-20 c-2.209 0 -3.492 -1.791 -2.866 -4 l3.398 -12 c0.626 -2.209 2.924 -4 5.133 -4 h20 c2.209 0 3.493 1.791 2.867 4 l-3.398 12z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 32.301 25
                moveTo(x = 32.301f, y = 25.0f)
                // c -0.626 2.209 -2.925 4 -5.134 4
                curveToRelative(
                    dx1 = -0.626f,
                    dy1 = 2.209f,
                    dx2 = -2.925f,
                    dy2 = 4.0f,
                    dx3 = -5.134f,
                    dy3 = 4.0f,
                )
                // h -20
                horizontalLineToRelative(dx = -20.0f)
                // c -2.209 0 -3.492 -1.791 -2.866 -4
                curveToRelative(
                    dx1 = -2.209f,
                    dy1 = 0.0f,
                    dx2 = -3.492f,
                    dy2 = -1.791f,
                    dx3 = -2.866f,
                    dy3 = -4.0f,
                )
                // l 3.398 -12
                lineToRelative(dx = 3.398f, dy = -12.0f)
                // c 0.626 -2.209 2.924 -4 5.133 -4
                curveToRelative(
                    dx1 = 0.626f,
                    dy1 = -2.209f,
                    dx2 = 2.924f,
                    dy2 = -4.0f,
                    dx3 = 5.133f,
                    dy3 = -4.0f,
                )
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // c 2.209 0 3.493 1.791 2.867 4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 3.493f,
                    dy2 = 1.791f,
                    dx3 = 2.867f,
                    dy3 = 4.0f,
                )
                // l -3.398 12z
                lineToRelative(dx = -3.398f, dy = 12.0f)
                close()
            }
            // M17.336 17.636 L4.384 26.949 c-0.034 0.028 -0.054 0.063 -0.085 0.091 0.179 0.57 0.518 1.043 0.992 1.384 0.035 -0.023 0.073 -0.033 0.107 -0.06 L18.35 19.05 c0.501 -0.391 0.681 -1.023 0.401 -1.414 -0.281 -0.391 -0.913 -0.391 -1.415 0 m13.81 9.404 c-0.015 -0.028 -0.016 -0.063 -0.034 -0.09 l-7.674 -9.314 c-0.281 -0.391 -0.913 -0.391 -1.416 0 -0.501 0.391 -0.68 1.023 -0.4 1.414 l7.676 9.314 c0.018 0.026 0.051 0.037 0.072 0.06 0.666 -0.34 1.274 -0.814 1.776 -1.384
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 17.336 17.636
                moveTo(x = 17.336f, y = 17.636f)
                // L 4.384 26.949
                lineTo(x = 4.384f, y = 26.949f)
                // c -0.034 0.028 -0.054 0.063 -0.085 0.091
                curveToRelative(
                    dx1 = -0.034f,
                    dy1 = 0.028f,
                    dx2 = -0.054f,
                    dy2 = 0.063f,
                    dx3 = -0.085f,
                    dy3 = 0.091f,
                )
                // c 0.179 0.57 0.518 1.043 0.992 1.384
                curveToRelative(
                    dx1 = 0.179f,
                    dy1 = 0.57f,
                    dx2 = 0.518f,
                    dy2 = 1.043f,
                    dx3 = 0.992f,
                    dy3 = 1.384f,
                )
                // c 0.035 -0.023 0.073 -0.033 0.107 -0.06
                curveToRelative(
                    dx1 = 0.035f,
                    dy1 = -0.023f,
                    dx2 = 0.073f,
                    dy2 = -0.033f,
                    dx3 = 0.107f,
                    dy3 = -0.06f,
                )
                // L 18.35 19.05
                lineTo(x = 18.35f, y = 19.05f)
                // c 0.501 -0.391 0.681 -1.023 0.401 -1.414
                curveToRelative(
                    dx1 = 0.501f,
                    dy1 = -0.391f,
                    dx2 = 0.681f,
                    dy2 = -1.023f,
                    dx3 = 0.401f,
                    dy3 = -1.414f,
                )
                // c -0.281 -0.391 -0.913 -0.391 -1.415 0
                curveToRelative(
                    dx1 = -0.281f,
                    dy1 = -0.391f,
                    dx2 = -0.913f,
                    dy2 = -0.391f,
                    dx3 = -1.415f,
                    dy3 = 0.0f,
                )
                // m 13.81 9.404
                moveToRelative(dx = 13.81f, dy = 9.404f)
                // c -0.015 -0.028 -0.016 -0.063 -0.034 -0.09
                curveToRelative(
                    dx1 = -0.015f,
                    dy1 = -0.028f,
                    dx2 = -0.016f,
                    dy2 = -0.063f,
                    dx3 = -0.034f,
                    dy3 = -0.09f,
                )
                // l -7.674 -9.314
                lineToRelative(dx = -7.674f, dy = -9.314f)
                // c -0.281 -0.391 -0.913 -0.391 -1.416 0
                curveToRelative(
                    dx1 = -0.281f,
                    dy1 = -0.391f,
                    dx2 = -0.913f,
                    dy2 = -0.391f,
                    dx3 = -1.416f,
                    dy3 = 0.0f,
                )
                // c -0.501 0.391 -0.68 1.023 -0.4 1.414
                curveToRelative(
                    dx1 = -0.501f,
                    dy1 = 0.391f,
                    dx2 = -0.68f,
                    dy2 = 1.023f,
                    dx3 = -0.4f,
                    dy3 = 1.414f,
                )
                // l 7.676 9.314
                lineToRelative(dx = 7.676f, dy = 9.314f)
                // c 0.018 0.026 0.051 0.037 0.072 0.06
                curveToRelative(
                    dx1 = 0.018f,
                    dy1 = 0.026f,
                    dx2 = 0.051f,
                    dy2 = 0.037f,
                    dx3 = 0.072f,
                    dy3 = 0.06f,
                )
                // c 0.666 -0.34 1.274 -0.814 1.776 -1.384
                curveToRelative(
                    dx1 = 0.666f,
                    dy1 = -0.34f,
                    dx2 = 1.274f,
                    dy2 = -0.814f,
                    dx3 = 1.776f,
                    dy3 = -1.384f,
                )
            }
            // M35.699 13 c0.626 -2.209 -0.658 -4 -2.867 -4 h-20 c-2.209 0 -4.507 1.791 -5.133 4 l-0.021 0.074 8.806 8.452 c1.631 1.584 3.788 1.475 5.725 0.371 l13.227 -7.964 0.263 -0.933z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 35.699 13
                moveTo(x = 35.699f, y = 13.0f)
                // c 0.626 -2.209 -0.658 -4 -2.867 -4
                curveToRelative(
                    dx1 = 0.626f,
                    dy1 = -2.209f,
                    dx2 = -0.658f,
                    dy2 = -4.0f,
                    dx3 = -2.867f,
                    dy3 = -4.0f,
                )
                // h -20
                horizontalLineToRelative(dx = -20.0f)
                // c -2.209 0 -4.507 1.791 -5.133 4
                curveToRelative(
                    dx1 = -2.209f,
                    dy1 = 0.0f,
                    dx2 = -4.507f,
                    dy2 = 1.791f,
                    dx3 = -5.133f,
                    dy3 = 4.0f,
                )
                // l -0.021 0.074
                lineToRelative(dx = -0.021f, dy = 0.074f)
                // l 8.806 8.452
                lineToRelative(dx = 8.806f, dy = 8.452f)
                // c 1.631 1.584 3.788 1.475 5.725 0.371
                curveToRelative(
                    dx1 = 1.631f,
                    dy1 = 1.584f,
                    dx2 = 3.788f,
                    dy2 = 1.475f,
                    dx3 = 5.725f,
                    dy3 = 0.371f,
                )
                // l 13.227 -7.964
                lineToRelative(dx = 13.227f, dy = -7.964f)
                // l 0.263 -0.933z
                lineToRelative(dx = 0.263f, dy = -0.933f)
                close()
            }
            // M32.832 9 h-20 c-1.578 0 -3.189 0.921 -4.217 2.248 l9.217 8.794 c0.749 0.719 2.434 0.729 3.656 0 l14.294 -8.768 C35.516 9.933 34.42 9 32.832 9z
            path(
                fill = SolidColor(Color(0xFFE1E8ED)),
            ) {
                // M 32.832 9
                moveTo(x = 32.832f, y = 9.0f)
                // h -20
                horizontalLineToRelative(dx = -20.0f)
                // c -1.578 0 -3.189 0.921 -4.217 2.248
                curveToRelative(
                    dx1 = -1.578f,
                    dy1 = 0.0f,
                    dx2 = -3.189f,
                    dy2 = 0.921f,
                    dx3 = -4.217f,
                    dy3 = 2.248f,
                )
                // l 9.217 8.794
                lineToRelative(dx = 9.217f, dy = 8.794f)
                // c 0.749 0.719 2.434 0.729 3.656 0
                curveToRelative(
                    dx1 = 0.749f,
                    dy1 = 0.719f,
                    dx2 = 2.434f,
                    dy2 = 0.729f,
                    dx3 = 3.656f,
                    dy3 = 0.0f,
                )
                // l 14.294 -8.768
                lineToRelative(dx = 14.294f, dy = -8.768f)
                // C 35.516 9.933 34.42 9 32.832 9z
                curveTo(
                    x1 = 35.516f,
                    y1 = 9.933f,
                    x2 = 34.42f,
                    y2 = 9.0f,
                    x3 = 32.832f,
                    y3 = 9.0f,
                )
                close()
            }
        }.build().also { _emoji1f4e8 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f4e8: ImageVector? = null
