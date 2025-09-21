package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f608: ImageVector
    get() {
        val current = _emoji1f608
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f608",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M18 18 m-18 0 a18 18 0 1 1 36 0 a18 18 0 1 1 -36 0
            path(
                fill = SolidColor(Color(0xFFAA8DD8)),
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
            // M10 4 C7.42 4 4.369 1.534 3.414 0.586 2.843 0.014 1.981 -0.157 1.235 0.153 0.487 0.462 0 1.191 0 2 c0 3.459 1.672 10 8 10 0.757 0 1.45 -0.428 1.789 -1.106 l2 -4 c0.31 -0.62 0.277 -1.356 -0.088 -1.946 C11.337 4.359 10.693 4 10 4z M34.766 0.153 c-0.75 -0.311 -1.607 -0.139 -2.18 0.434 C31.7 1.472 28.589 4 26 4 c-0.693 0 -1.337 0.359 -1.701 0.949 -0.364 0.589 -0.397 1.326 -0.088 1.946 l2 4 C26.55 11.572 27.242 12 28 12 c6.328 0 8 -6.541 8 -10 0 -0.809 -0.487 -1.538 -1.234 -1.847z
            path(
                fill = SolidColor(Color(0xFFAA8DD8)),
            ) {
                // M 10 4
                moveTo(x = 10.0f, y = 4.0f)
                // C 7.42 4 4.369 1.534 3.414 0.586
                curveTo(
                    x1 = 7.42f,
                    y1 = 4.0f,
                    x2 = 4.369f,
                    y2 = 1.534f,
                    x3 = 3.414f,
                    y3 = 0.586f,
                )
                // C 2.843 0.014 1.981 -0.157 1.235 0.153
                curveTo(
                    x1 = 2.843f,
                    y1 = 0.014f,
                    x2 = 1.981f,
                    y2 = -0.157f,
                    x3 = 1.235f,
                    y3 = 0.153f,
                )
                // C 0.487 0.462 0 1.191 0 2
                curveTo(
                    x1 = 0.487f,
                    y1 = 0.462f,
                    x2 = 0.0f,
                    y2 = 1.191f,
                    x3 = 0.0f,
                    y3 = 2.0f,
                )
                // c 0 3.459 1.672 10 8 10
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.459f,
                    dx2 = 1.672f,
                    dy2 = 10.0f,
                    dx3 = 8.0f,
                    dy3 = 10.0f,
                )
                // c 0.757 0 1.45 -0.428 1.789 -1.106
                curveToRelative(
                    dx1 = 0.757f,
                    dy1 = 0.0f,
                    dx2 = 1.45f,
                    dy2 = -0.428f,
                    dx3 = 1.789f,
                    dy3 = -1.106f,
                )
                // l 2 -4
                lineToRelative(dx = 2.0f, dy = -4.0f)
                // c 0.31 -0.62 0.277 -1.356 -0.088 -1.946
                curveToRelative(
                    dx1 = 0.31f,
                    dy1 = -0.62f,
                    dx2 = 0.277f,
                    dy2 = -1.356f,
                    dx3 = -0.088f,
                    dy3 = -1.946f,
                )
                // C 11.337 4.359 10.693 4 10 4z
                curveTo(
                    x1 = 11.337f,
                    y1 = 4.359f,
                    x2 = 10.693f,
                    y2 = 4.0f,
                    x3 = 10.0f,
                    y3 = 4.0f,
                )
                close()
                // M 34.766 0.153
                moveTo(x = 34.766f, y = 0.153f)
                // c -0.75 -0.311 -1.607 -0.139 -2.18 0.434
                curveToRelative(
                    dx1 = -0.75f,
                    dy1 = -0.311f,
                    dx2 = -1.607f,
                    dy2 = -0.139f,
                    dx3 = -2.18f,
                    dy3 = 0.434f,
                )
                // C 31.7 1.472 28.589 4 26 4
                curveTo(
                    x1 = 31.7f,
                    y1 = 1.472f,
                    x2 = 28.589f,
                    y2 = 4.0f,
                    x3 = 26.0f,
                    y3 = 4.0f,
                )
                // c -0.693 0 -1.337 0.359 -1.701 0.949
                curveToRelative(
                    dx1 = -0.693f,
                    dy1 = 0.0f,
                    dx2 = -1.337f,
                    dy2 = 0.359f,
                    dx3 = -1.701f,
                    dy3 = 0.949f,
                )
                // c -0.364 0.589 -0.397 1.326 -0.088 1.946
                curveToRelative(
                    dx1 = -0.364f,
                    dy1 = 0.589f,
                    dx2 = -0.397f,
                    dy2 = 1.326f,
                    dx3 = -0.088f,
                    dy3 = 1.946f,
                )
                // l 2 4
                lineToRelative(dx = 2.0f, dy = 4.0f)
                // C 26.55 11.572 27.242 12 28 12
                curveTo(
                    x1 = 26.55f,
                    y1 = 11.572f,
                    x2 = 27.242f,
                    y2 = 12.0f,
                    x3 = 28.0f,
                    y3 = 12.0f,
                )
                // c 6.328 0 8 -6.541 8 -10
                curveToRelative(
                    dx1 = 6.328f,
                    dy1 = 0.0f,
                    dx2 = 8.0f,
                    dy2 = -6.541f,
                    dx3 = 8.0f,
                    dy3 = -10.0f,
                )
                // c 0 -0.809 -0.487 -1.538 -1.234 -1.847z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.809f,
                    dx2 = -0.487f,
                    dy2 = -1.538f,
                    dx3 = -1.234f,
                    dy3 = -1.847f,
                )
                close()
            }
            // M27.335 25.629 c-0.178 -0.161 -0.444 -0.171 -0.635 -0.029 -0.039 0.029 -3.922 2.9 -8.7 2.9 -4.766 0 -8.662 -2.871 -8.7 -2.9 -0.191 -0.142 -0.457 -0.13 -0.635 0.029 -0.177 0.16 -0.217 0.424 -0.094 0.628 C8.7 26.472 11.788 31.5 18 31.5 s9.301 -5.028 9.429 -5.243 c0.123 -0.205 0.084 -0.468 -0.094 -0.628z M15.707 18.293 C12.452 15.038 7.221 15 7 15 c-0.552 0 -0.999 0.447 -0.999 0.998 -0.001 0.552 0.446 1.001 0.998 1.002 0.029 0 1.925 0.022 3.983 0.737 -0.593 0.64 -0.982 1.634 -0.982 2.763 0 1.934 1.119 3.5 2.5 3.5 s2.5 -1.566 2.5 -3.5 c0 -0.174 -0.019 -0.34 -0.037 -0.507 0.013 0 0.025 0.007 0.037 0.007 0.256 0 0.512 -0.098 0.707 -0.293 0.391 -0.391 0.391 -1.023 0 -1.414z M29 15 c-0.221 0 -5.451 0.038 -8.707 3.293 -0.391 0.391 -0.391 1.023 0 1.414 0.195 0.195 0.451 0.293 0.707 0.293 0.013 0 0.024 -0.007 0.036 -0.007 -0.016 0.167 -0.036 0.333 -0.036 0.507 0 1.934 1.119 3.5 2.5 3.5 s2.5 -1.566 2.5 -3.5 c0 -1.129 -0.389 -2.123 -0.982 -2.763 2.058 -0.715 3.954 -0.737 3.984 -0.737 0.551 -0.001 0.998 -0.45 0.997 -1.002 -0.001 -0.551 -0.447 -0.998 -0.999 -0.998z
            path(
                fill = SolidColor(Color(0xFF553986)),
            ) {
                // M 27.335 25.629
                moveTo(x = 27.335f, y = 25.629f)
                // c -0.178 -0.161 -0.444 -0.171 -0.635 -0.029
                curveToRelative(
                    dx1 = -0.178f,
                    dy1 = -0.161f,
                    dx2 = -0.444f,
                    dy2 = -0.171f,
                    dx3 = -0.635f,
                    dy3 = -0.029f,
                )
                // c -0.039 0.029 -3.922 2.9 -8.7 2.9
                curveToRelative(
                    dx1 = -0.039f,
                    dy1 = 0.029f,
                    dx2 = -3.922f,
                    dy2 = 2.9f,
                    dx3 = -8.7f,
                    dy3 = 2.9f,
                )
                // c -4.766 0 -8.662 -2.871 -8.7 -2.9
                curveToRelative(
                    dx1 = -4.766f,
                    dy1 = 0.0f,
                    dx2 = -8.662f,
                    dy2 = -2.871f,
                    dx3 = -8.7f,
                    dy3 = -2.9f,
                )
                // c -0.191 -0.142 -0.457 -0.13 -0.635 0.029
                curveToRelative(
                    dx1 = -0.191f,
                    dy1 = -0.142f,
                    dx2 = -0.457f,
                    dy2 = -0.13f,
                    dx3 = -0.635f,
                    dy3 = 0.029f,
                )
                // c -0.177 0.16 -0.217 0.424 -0.094 0.628
                curveToRelative(
                    dx1 = -0.177f,
                    dy1 = 0.16f,
                    dx2 = -0.217f,
                    dy2 = 0.424f,
                    dx3 = -0.094f,
                    dy3 = 0.628f,
                )
                // C 8.7 26.472 11.788 31.5 18 31.5
                curveTo(
                    x1 = 8.7f,
                    y1 = 26.472f,
                    x2 = 11.788f,
                    y2 = 31.5f,
                    x3 = 18.0f,
                    y3 = 31.5f,
                )
                // s 9.301 -5.028 9.429 -5.243
                reflectiveCurveToRelative(
                    dx1 = 9.301f,
                    dy1 = -5.028f,
                    dx2 = 9.429f,
                    dy2 = -5.243f,
                )
                // c 0.123 -0.205 0.084 -0.468 -0.094 -0.628z
                curveToRelative(
                    dx1 = 0.123f,
                    dy1 = -0.205f,
                    dx2 = 0.084f,
                    dy2 = -0.468f,
                    dx3 = -0.094f,
                    dy3 = -0.628f,
                )
                close()
                // M 15.707 18.293
                moveTo(x = 15.707f, y = 18.293f)
                // C 12.452 15.038 7.221 15 7 15
                curveTo(
                    x1 = 12.452f,
                    y1 = 15.038f,
                    x2 = 7.221f,
                    y2 = 15.0f,
                    x3 = 7.0f,
                    y3 = 15.0f,
                )
                // c -0.552 0 -0.999 0.447 -0.999 0.998
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -0.999f,
                    dy2 = 0.447f,
                    dx3 = -0.999f,
                    dy3 = 0.998f,
                )
                // c -0.001 0.552 0.446 1.001 0.998 1.002
                curveToRelative(
                    dx1 = -0.001f,
                    dy1 = 0.552f,
                    dx2 = 0.446f,
                    dy2 = 1.001f,
                    dx3 = 0.998f,
                    dy3 = 1.002f,
                )
                // c 0.029 0 1.925 0.022 3.983 0.737
                curveToRelative(
                    dx1 = 0.029f,
                    dy1 = 0.0f,
                    dx2 = 1.925f,
                    dy2 = 0.022f,
                    dx3 = 3.983f,
                    dy3 = 0.737f,
                )
                // c -0.593 0.64 -0.982 1.634 -0.982 2.763
                curveToRelative(
                    dx1 = -0.593f,
                    dy1 = 0.64f,
                    dx2 = -0.982f,
                    dy2 = 1.634f,
                    dx3 = -0.982f,
                    dy3 = 2.763f,
                )
                // c 0 1.934 1.119 3.5 2.5 3.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.934f,
                    dx2 = 1.119f,
                    dy2 = 3.5f,
                    dx3 = 2.5f,
                    dy3 = 3.5f,
                )
                // s 2.5 -1.566 2.5 -3.5
                reflectiveCurveToRelative(
                    dx1 = 2.5f,
                    dy1 = -1.566f,
                    dx2 = 2.5f,
                    dy2 = -3.5f,
                )
                // c 0 -0.174 -0.019 -0.34 -0.037 -0.507
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.174f,
                    dx2 = -0.019f,
                    dy2 = -0.34f,
                    dx3 = -0.037f,
                    dy3 = -0.507f,
                )
                // c 0.013 0 0.025 0.007 0.037 0.007
                curveToRelative(
                    dx1 = 0.013f,
                    dy1 = 0.0f,
                    dx2 = 0.025f,
                    dy2 = 0.007f,
                    dx3 = 0.037f,
                    dy3 = 0.007f,
                )
                // c 0.256 0 0.512 -0.098 0.707 -0.293
                curveToRelative(
                    dx1 = 0.256f,
                    dy1 = 0.0f,
                    dx2 = 0.512f,
                    dy2 = -0.098f,
                    dx3 = 0.707f,
                    dy3 = -0.293f,
                )
                // c 0.391 -0.391 0.391 -1.023 0 -1.414z
                curveToRelative(
                    dx1 = 0.391f,
                    dy1 = -0.391f,
                    dx2 = 0.391f,
                    dy2 = -1.023f,
                    dx3 = 0.0f,
                    dy3 = -1.414f,
                )
                close()
                // M 29 15
                moveTo(x = 29.0f, y = 15.0f)
                // c -0.221 0 -5.451 0.038 -8.707 3.293
                curveToRelative(
                    dx1 = -0.221f,
                    dy1 = 0.0f,
                    dx2 = -5.451f,
                    dy2 = 0.038f,
                    dx3 = -8.707f,
                    dy3 = 3.293f,
                )
                // c -0.391 0.391 -0.391 1.023 0 1.414
                curveToRelative(
                    dx1 = -0.391f,
                    dy1 = 0.391f,
                    dx2 = -0.391f,
                    dy2 = 1.023f,
                    dx3 = 0.0f,
                    dy3 = 1.414f,
                )
                // c 0.195 0.195 0.451 0.293 0.707 0.293
                curveToRelative(
                    dx1 = 0.195f,
                    dy1 = 0.195f,
                    dx2 = 0.451f,
                    dy2 = 0.293f,
                    dx3 = 0.707f,
                    dy3 = 0.293f,
                )
                // c 0.013 0 0.024 -0.007 0.036 -0.007
                curveToRelative(
                    dx1 = 0.013f,
                    dy1 = 0.0f,
                    dx2 = 0.024f,
                    dy2 = -0.007f,
                    dx3 = 0.036f,
                    dy3 = -0.007f,
                )
                // c -0.016 0.167 -0.036 0.333 -0.036 0.507
                curveToRelative(
                    dx1 = -0.016f,
                    dy1 = 0.167f,
                    dx2 = -0.036f,
                    dy2 = 0.333f,
                    dx3 = -0.036f,
                    dy3 = 0.507f,
                )
                // c 0 1.934 1.119 3.5 2.5 3.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.934f,
                    dx2 = 1.119f,
                    dy2 = 3.5f,
                    dx3 = 2.5f,
                    dy3 = 3.5f,
                )
                // s 2.5 -1.566 2.5 -3.5
                reflectiveCurveToRelative(
                    dx1 = 2.5f,
                    dy1 = -1.566f,
                    dx2 = 2.5f,
                    dy2 = -3.5f,
                )
                // c 0 -1.129 -0.389 -2.123 -0.982 -2.763
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.129f,
                    dx2 = -0.389f,
                    dy2 = -2.123f,
                    dx3 = -0.982f,
                    dy3 = -2.763f,
                )
                // c 2.058 -0.715 3.954 -0.737 3.984 -0.737
                curveToRelative(
                    dx1 = 2.058f,
                    dy1 = -0.715f,
                    dx2 = 3.954f,
                    dy2 = -0.737f,
                    dx3 = 3.984f,
                    dy3 = -0.737f,
                )
                // c 0.551 -0.001 0.998 -0.45 0.997 -1.002
                curveToRelative(
                    dx1 = 0.551f,
                    dy1 = -0.001f,
                    dx2 = 0.998f,
                    dy2 = -0.45f,
                    dx3 = 0.997f,
                    dy3 = -1.002f,
                )
                // c -0.001 -0.551 -0.447 -0.998 -0.999 -0.998z
                curveToRelative(
                    dx1 = -0.001f,
                    dy1 = -0.551f,
                    dx2 = -0.447f,
                    dy2 = -0.998f,
                    dx3 = -0.999f,
                    dy3 = -0.998f,
                )
                close()
            }
        }.build().also { _emoji1f608 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f608: ImageVector? = null
