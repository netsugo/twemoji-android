package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f910: ImageVector
    get() {
        val current = _emoji1f910
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f910",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M18 18 m-18 0 a18 18 0 1 1 36 0 a18 18 0 1 1 -36 0
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
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
            // M14.034 14.499 c0 1.934 -1.119 3.5 -2.5 3.5 s-2.5 -1.566 -2.5 -3.5 c0 -1.933 1.119 -3.5 2.5 -3.5 s2.5 1.567 2.5 3.5 m13 0 c0 1.934 -1.119 3.5 -2.5 3.5 s-2.5 -1.566 -2.5 -3.5 c0 -1.933 1.119 -3.5 2.5 -3.5 s2.5 1.567 2.5 3.5 m-2.033 12.505 H10 c-1 0 -1 -1 -1 -1 v-1 s0 -1.003 1 -1.003 l15.001 0.003 v3z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 14.034 14.499
                moveTo(x = 14.034f, y = 14.499f)
                // c 0 1.934 -1.119 3.5 -2.5 3.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.934f,
                    dx2 = -1.119f,
                    dy2 = 3.5f,
                    dx3 = -2.5f,
                    dy3 = 3.5f,
                )
                // s -2.5 -1.566 -2.5 -3.5
                reflectiveCurveToRelative(
                    dx1 = -2.5f,
                    dy1 = -1.566f,
                    dx2 = -2.5f,
                    dy2 = -3.5f,
                )
                // c 0 -1.933 1.119 -3.5 2.5 -3.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.933f,
                    dx2 = 1.119f,
                    dy2 = -3.5f,
                    dx3 = 2.5f,
                    dy3 = -3.5f,
                )
                // s 2.5 1.567 2.5 3.5
                reflectiveCurveToRelative(
                    dx1 = 2.5f,
                    dy1 = 1.567f,
                    dx2 = 2.5f,
                    dy2 = 3.5f,
                )
                // m 13 0
                moveToRelative(dx = 13.0f, dy = 0.0f)
                // c 0 1.934 -1.119 3.5 -2.5 3.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.934f,
                    dx2 = -1.119f,
                    dy2 = 3.5f,
                    dx3 = -2.5f,
                    dy3 = 3.5f,
                )
                // s -2.5 -1.566 -2.5 -3.5
                reflectiveCurveToRelative(
                    dx1 = -2.5f,
                    dy1 = -1.566f,
                    dx2 = -2.5f,
                    dy2 = -3.5f,
                )
                // c 0 -1.933 1.119 -3.5 2.5 -3.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.933f,
                    dx2 = 1.119f,
                    dy2 = -3.5f,
                    dx3 = 2.5f,
                    dy3 = -3.5f,
                )
                // s 2.5 1.567 2.5 3.5
                reflectiveCurveToRelative(
                    dx1 = 2.5f,
                    dy1 = 1.567f,
                    dx2 = 2.5f,
                    dy2 = 3.5f,
                )
                // m -2.033 12.505
                moveToRelative(dx = -2.033f, dy = 12.505f)
                // H 10
                horizontalLineTo(x = 10.0f)
                // c -1 0 -1 -1 -1 -1
                curveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // s 0 -1.003 1 -1.003
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.003f,
                    dx2 = 1.0f,
                    dy2 = -1.003f,
                )
                // l 15.001 0.003
                lineToRelative(dx = 15.001f, dy = 0.003f)
                // v 3z
                verticalLineToRelative(dy = 3.0f)
                close()
            }
            // M35.255 26.084 l-7.713 -2.121 c-0.72 -0.197 -1.049 0.287 -1.171 0.547 l-1.64 -0.784 L24 25.255 v-2.254 h-2 v2 h-2 v-2 h-2.001 v2 L16 25.001 v-2 h-2 v2 h-2 v-2 h-2 v3 h2 v2 h2 v-2 h1.999 v2 h2 v-2 L20 26.001 v2 h2 v-2 h1.643 l-0.58 1.212 1.648 0.788 -0.099 0.207 s-0.248 0.737 0.373 1.275 c0.621 0.537 5.285 4.735 5.285 4.735 s0.899 0.866 1.769 0.079 c0.738 -0.67 3.649 -6.02 3.914 -6.983 0.266 -0.964 -0.698 -1.23 -0.698 -1.23z M31.483 32.155 l-2.644 -2.248 1.614 -3.069 3.338 1.132 -2.308 4.185z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 35.255 26.084
                moveTo(x = 35.255f, y = 26.084f)
                // l -7.713 -2.121
                lineToRelative(dx = -7.713f, dy = -2.121f)
                // c -0.72 -0.197 -1.049 0.287 -1.171 0.547
                curveToRelative(
                    dx1 = -0.72f,
                    dy1 = -0.197f,
                    dx2 = -1.049f,
                    dy2 = 0.287f,
                    dx3 = -1.171f,
                    dy3 = 0.547f,
                )
                // l -1.64 -0.784
                lineToRelative(dx = -1.64f, dy = -0.784f)
                // L 24 25.255
                lineTo(x = 24.0f, y = 25.255f)
                // v -2.254
                verticalLineToRelative(dy = -2.254f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -2.001
                horizontalLineToRelative(dx = -2.001f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // L 16 25.001
                lineTo(x = 16.0f, y = 25.001f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 1.999
                horizontalLineToRelative(dx = 1.999f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // L 20 26.001
                lineTo(x = 20.0f, y = 26.001f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 1.643
                horizontalLineToRelative(dx = 1.643f)
                // l -0.58 1.212
                lineToRelative(dx = -0.58f, dy = 1.212f)
                // l 1.648 0.788
                lineToRelative(dx = 1.648f, dy = 0.788f)
                // l -0.099 0.207
                lineToRelative(dx = -0.099f, dy = 0.207f)
                // s -0.248 0.737 0.373 1.275
                reflectiveCurveToRelative(
                    dx1 = -0.248f,
                    dy1 = 0.737f,
                    dx2 = 0.373f,
                    dy2 = 1.275f,
                )
                // c 0.621 0.537 5.285 4.735 5.285 4.735
                curveToRelative(
                    dx1 = 0.621f,
                    dy1 = 0.537f,
                    dx2 = 5.285f,
                    dy2 = 4.735f,
                    dx3 = 5.285f,
                    dy3 = 4.735f,
                )
                // s 0.899 0.866 1.769 0.079
                reflectiveCurveToRelative(
                    dx1 = 0.899f,
                    dy1 = 0.866f,
                    dx2 = 1.769f,
                    dy2 = 0.079f,
                )
                // c 0.738 -0.67 3.649 -6.02 3.914 -6.983
                curveToRelative(
                    dx1 = 0.738f,
                    dy1 = -0.67f,
                    dx2 = 3.649f,
                    dy2 = -6.02f,
                    dx3 = 3.914f,
                    dy3 = -6.983f,
                )
                // c 0.266 -0.964 -0.698 -1.23 -0.698 -1.23z
                curveToRelative(
                    dx1 = 0.266f,
                    dy1 = -0.964f,
                    dx2 = -0.698f,
                    dy2 = -1.23f,
                    dx3 = -0.698f,
                    dy3 = -1.23f,
                )
                close()
                // M 31.483 32.155
                moveTo(x = 31.483f, y = 32.155f)
                // l -2.644 -2.248
                lineToRelative(dx = -2.644f, dy = -2.248f)
                // l 1.614 -3.069
                lineToRelative(dx = 1.614f, dy = -3.069f)
                // l 3.338 1.132
                lineToRelative(dx = 3.338f, dy = 1.132f)
                // l -2.308 4.185z
                lineToRelative(dx = -2.308f, dy = 4.185f)
                close()
            }
        }.build().also { _emoji1f910 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f910: ImageVector? = null
