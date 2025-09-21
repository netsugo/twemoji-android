package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f47f: ImageVector
    get() {
        val current = _emoji1f47f
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f47f",
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
            // M15.894 14.211 l-6 -3 c-0.988 -0.494 -2.189 -0.093 -2.684 0.895 -0.494 0.988 -0.093 2.189 0.895 2.684 l4.212 2.106 c-0.306 0.533 -0.317 1.105 -0.317 1.105 v2 s0 2 2 2 2 -2 2 -2 v-2 s-0.003 -0.109 -0.025 -0.263 c0.338 -0.189 0.628 -0.471 0.814 -0.843 0.494 -0.988 0.093 -2.189 -0.895 -2.684z M28.789 12.106 c-0.493 -0.986 -1.694 -1.391 -2.684 -0.895 l-6 3 c-0.988 0.494 -1.389 1.695 -0.895 2.684 0.186 0.372 0.476 0.654 0.814 0.843 -0.021 0.154 -0.024 0.263 -0.024 0.263 v2 s0 2 2 2 2 -2 2 -2 v-2 s-0.011 -0.572 -0.318 -1.105 l4.212 -2.106 c0.989 -0.495 1.389 -1.696 0.895 -2.684z M24.282 29.595 c-0.039 -0.165 -0.985 -3.848 -6.282 -3.848 -5.291 0 -6.245 3.69 -6.282 3.848 -0.063 0.26 0.047 0.525 0.274 0.661 0.227 0.135 0.515 0.098 0.703 -0.092 0.015 -0.016 1.583 -1.522 5.306 -1.522 s5.291 1.507 5.305 1.521 c0.108 0.112 0.259 0.176 0.412 0.176 0.1 0 0.199 -0.026 0.289 -0.079 0.224 -0.134 0.338 -0.407 0.275 -0.665z
            path(
                fill = SolidColor(Color(0xFF553986)),
            ) {
                // M 15.894 14.211
                moveTo(x = 15.894f, y = 14.211f)
                // l -6 -3
                lineToRelative(dx = -6.0f, dy = -3.0f)
                // c -0.988 -0.494 -2.189 -0.093 -2.684 0.895
                curveToRelative(
                    dx1 = -0.988f,
                    dy1 = -0.494f,
                    dx2 = -2.189f,
                    dy2 = -0.093f,
                    dx3 = -2.684f,
                    dy3 = 0.895f,
                )
                // c -0.494 0.988 -0.093 2.189 0.895 2.684
                curveToRelative(
                    dx1 = -0.494f,
                    dy1 = 0.988f,
                    dx2 = -0.093f,
                    dy2 = 2.189f,
                    dx3 = 0.895f,
                    dy3 = 2.684f,
                )
                // l 4.212 2.106
                lineToRelative(dx = 4.212f, dy = 2.106f)
                // c -0.306 0.533 -0.317 1.105 -0.317 1.105
                curveToRelative(
                    dx1 = -0.306f,
                    dy1 = 0.533f,
                    dx2 = -0.317f,
                    dy2 = 1.105f,
                    dx3 = -0.317f,
                    dy3 = 1.105f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // s 0 2 2 2
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                )
                // s 2 -2 2 -2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // s -0.003 -0.109 -0.025 -0.263
                reflectiveCurveToRelative(
                    dx1 = -0.003f,
                    dy1 = -0.109f,
                    dx2 = -0.025f,
                    dy2 = -0.263f,
                )
                // c 0.338 -0.189 0.628 -0.471 0.814 -0.843
                curveToRelative(
                    dx1 = 0.338f,
                    dy1 = -0.189f,
                    dx2 = 0.628f,
                    dy2 = -0.471f,
                    dx3 = 0.814f,
                    dy3 = -0.843f,
                )
                // c 0.494 -0.988 0.093 -2.189 -0.895 -2.684z
                curveToRelative(
                    dx1 = 0.494f,
                    dy1 = -0.988f,
                    dx2 = 0.093f,
                    dy2 = -2.189f,
                    dx3 = -0.895f,
                    dy3 = -2.684f,
                )
                close()
                // M 28.789 12.106
                moveTo(x = 28.789f, y = 12.106f)
                // c -0.493 -0.986 -1.694 -1.391 -2.684 -0.895
                curveToRelative(
                    dx1 = -0.493f,
                    dy1 = -0.986f,
                    dx2 = -1.694f,
                    dy2 = -1.391f,
                    dx3 = -2.684f,
                    dy3 = -0.895f,
                )
                // l -6 3
                lineToRelative(dx = -6.0f, dy = 3.0f)
                // c -0.988 0.494 -1.389 1.695 -0.895 2.684
                curveToRelative(
                    dx1 = -0.988f,
                    dy1 = 0.494f,
                    dx2 = -1.389f,
                    dy2 = 1.695f,
                    dx3 = -0.895f,
                    dy3 = 2.684f,
                )
                // c 0.186 0.372 0.476 0.654 0.814 0.843
                curveToRelative(
                    dx1 = 0.186f,
                    dy1 = 0.372f,
                    dx2 = 0.476f,
                    dy2 = 0.654f,
                    dx3 = 0.814f,
                    dy3 = 0.843f,
                )
                // c -0.021 0.154 -0.024 0.263 -0.024 0.263
                curveToRelative(
                    dx1 = -0.021f,
                    dy1 = 0.154f,
                    dx2 = -0.024f,
                    dy2 = 0.263f,
                    dx3 = -0.024f,
                    dy3 = 0.263f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // s 0 2 2 2
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                )
                // s 2 -2 2 -2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // s -0.011 -0.572 -0.318 -1.105
                reflectiveCurveToRelative(
                    dx1 = -0.011f,
                    dy1 = -0.572f,
                    dx2 = -0.318f,
                    dy2 = -1.105f,
                )
                // l 4.212 -2.106
                lineToRelative(dx = 4.212f, dy = -2.106f)
                // c 0.989 -0.495 1.389 -1.696 0.895 -2.684z
                curveToRelative(
                    dx1 = 0.989f,
                    dy1 = -0.495f,
                    dx2 = 1.389f,
                    dy2 = -1.696f,
                    dx3 = 0.895f,
                    dy3 = -2.684f,
                )
                close()
                // M 24.282 29.595
                moveTo(x = 24.282f, y = 29.595f)
                // c -0.039 -0.165 -0.985 -3.848 -6.282 -3.848
                curveToRelative(
                    dx1 = -0.039f,
                    dy1 = -0.165f,
                    dx2 = -0.985f,
                    dy2 = -3.848f,
                    dx3 = -6.282f,
                    dy3 = -3.848f,
                )
                // c -5.291 0 -6.245 3.69 -6.282 3.848
                curveToRelative(
                    dx1 = -5.291f,
                    dy1 = 0.0f,
                    dx2 = -6.245f,
                    dy2 = 3.69f,
                    dx3 = -6.282f,
                    dy3 = 3.848f,
                )
                // c -0.063 0.26 0.047 0.525 0.274 0.661
                curveToRelative(
                    dx1 = -0.063f,
                    dy1 = 0.26f,
                    dx2 = 0.047f,
                    dy2 = 0.525f,
                    dx3 = 0.274f,
                    dy3 = 0.661f,
                )
                // c 0.227 0.135 0.515 0.098 0.703 -0.092
                curveToRelative(
                    dx1 = 0.227f,
                    dy1 = 0.135f,
                    dx2 = 0.515f,
                    dy2 = 0.098f,
                    dx3 = 0.703f,
                    dy3 = -0.092f,
                )
                // c 0.015 -0.016 1.583 -1.522 5.306 -1.522
                curveToRelative(
                    dx1 = 0.015f,
                    dy1 = -0.016f,
                    dx2 = 1.583f,
                    dy2 = -1.522f,
                    dx3 = 5.306f,
                    dy3 = -1.522f,
                )
                // s 5.291 1.507 5.305 1.521
                reflectiveCurveToRelative(
                    dx1 = 5.291f,
                    dy1 = 1.507f,
                    dx2 = 5.305f,
                    dy2 = 1.521f,
                )
                // c 0.108 0.112 0.259 0.176 0.412 0.176
                curveToRelative(
                    dx1 = 0.108f,
                    dy1 = 0.112f,
                    dx2 = 0.259f,
                    dy2 = 0.176f,
                    dx3 = 0.412f,
                    dy3 = 0.176f,
                )
                // c 0.1 0 0.199 -0.026 0.289 -0.079
                curveToRelative(
                    dx1 = 0.1f,
                    dy1 = 0.0f,
                    dx2 = 0.199f,
                    dy2 = -0.026f,
                    dx3 = 0.289f,
                    dy3 = -0.079f,
                )
                // c 0.224 -0.134 0.338 -0.407 0.275 -0.665z
                curveToRelative(
                    dx1 = 0.224f,
                    dy1 = -0.134f,
                    dx2 = 0.338f,
                    dy2 = -0.407f,
                    dx3 = 0.275f,
                    dy3 = -0.665f,
                )
                close()
            }
        }.build().also { _emoji1f47f = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f47f: ImageVector? = null
