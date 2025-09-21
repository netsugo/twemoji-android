package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f6d2: ImageVector
    get() {
        val current = _emoji1f6d2
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f6d2",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M31 22 H11 L9 10 h24z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 31 22
                moveTo(x = 31.0f, y = 22.0f)
                // H 11
                horizontalLineTo(x = 11.0f)
                // L 9 10
                lineTo(x = 9.0f, y = 10.0f)
                // h 24z
                horizontalLineToRelative(dx = 24.0f)
                close()
            }
            // M32.984 27 h-22 C9.89 27 9 26.109 9 25.016 S9.906 23 11 23 l0.007 -0.001 0.008 0.001 L31 23 c0.489 0 0.906 -0.354 0.986 -0.836 l2 -12 c0.049 -0.29 -0.033 -0.586 -0.224 -0.811 C33.573 9.129 33.294 9 33 9 L9.817 9 l-1.04 -6.166 c-0.079 -0.473 -0.484 -0.792 -0.942 -0.814 -0.016 -0.003 -0.027 -0.02 -0.043 -0.02 L3 2 c-0.552 0 -1 0.448 -1 1 s0.448 1 1 1 h3.946 l2.903 17.216 c-1.642 0.493 -2.849 2 -2.849 3.8 C7 27.213 8.788 29 10.984 29 h22 c0.553 0 1 -0.447 1 -1 s-0.447 -1 -1 -1z M30.82 17 h-3.307 l0.273 -2 h3.366 l-0.332 2z M25.494 17 L22 17 v-2 h3.767 l-0.273 2z M20 17 h-3.494 l-0.273 -2 L20 15 v2z M14.488 17 h-3.307 l-0.333 -2 h3.367 l0.273 2z M11.847 21 l-0.333 -2 h3.247 l0.273 2 h-3.187z M17.053 21 l-0.273 -2 L20 19 v2 h-2.947z M22 21 v-2 h3.22 l-0.273 2 L22 21z M26.967 21 l0.273 -2 h3.247 l-0.333 2 h-3.187z M31.819 11 l-0.333 2 L28.06 13 l0.273 -2 h3.486z M26.314 11 l-0.273 2 L22 13 v-2 h4.314z M20 11 v2 h-4.041 l-0.273 -2 L20 11z M13.667 11 l0.273 2 h-3.427 l-0.333 -2 h3.487z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 32.984 27
                moveTo(x = 32.984f, y = 27.0f)
                // h -22
                horizontalLineToRelative(dx = -22.0f)
                // C 9.89 27 9 26.109 9 25.016
                curveTo(
                    x1 = 9.89f,
                    y1 = 27.0f,
                    x2 = 9.0f,
                    y2 = 26.109f,
                    x3 = 9.0f,
                    y3 = 25.016f,
                )
                // S 9.906 23 11 23
                reflectiveCurveTo(
                    x1 = 9.906f,
                    y1 = 23.0f,
                    x2 = 11.0f,
                    y2 = 23.0f,
                )
                // l 0.007 -0.001
                lineToRelative(dx = 0.007f, dy = -0.001f)
                // l 0.008 0.001
                lineToRelative(dx = 0.008f, dy = 0.001f)
                // L 31 23
                lineTo(x = 31.0f, y = 23.0f)
                // c 0.489 0 0.906 -0.354 0.986 -0.836
                curveToRelative(
                    dx1 = 0.489f,
                    dy1 = 0.0f,
                    dx2 = 0.906f,
                    dy2 = -0.354f,
                    dx3 = 0.986f,
                    dy3 = -0.836f,
                )
                // l 2 -12
                lineToRelative(dx = 2.0f, dy = -12.0f)
                // c 0.049 -0.29 -0.033 -0.586 -0.224 -0.811
                curveToRelative(
                    dx1 = 0.049f,
                    dy1 = -0.29f,
                    dx2 = -0.033f,
                    dy2 = -0.586f,
                    dx3 = -0.224f,
                    dy3 = -0.811f,
                )
                // C 33.573 9.129 33.294 9 33 9
                curveTo(
                    x1 = 33.573f,
                    y1 = 9.129f,
                    x2 = 33.294f,
                    y2 = 9.0f,
                    x3 = 33.0f,
                    y3 = 9.0f,
                )
                // L 9.817 9
                lineTo(x = 9.817f, y = 9.0f)
                // l -1.04 -6.166
                lineToRelative(dx = -1.04f, dy = -6.166f)
                // c -0.079 -0.473 -0.484 -0.792 -0.942 -0.814
                curveToRelative(
                    dx1 = -0.079f,
                    dy1 = -0.473f,
                    dx2 = -0.484f,
                    dy2 = -0.792f,
                    dx3 = -0.942f,
                    dy3 = -0.814f,
                )
                // c -0.016 -0.003 -0.027 -0.02 -0.043 -0.02
                curveToRelative(
                    dx1 = -0.016f,
                    dy1 = -0.003f,
                    dx2 = -0.027f,
                    dy2 = -0.02f,
                    dx3 = -0.043f,
                    dy3 = -0.02f,
                )
                // L 3 2
                lineTo(x = 3.0f, y = 2.0f)
                // c -0.552 0 -1 0.448 -1 1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = 0.448f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // s 0.448 1 1 1
                reflectiveCurveToRelative(
                    dx1 = 0.448f,
                    dy1 = 1.0f,
                    dx2 = 1.0f,
                    dy2 = 1.0f,
                )
                // h 3.946
                horizontalLineToRelative(dx = 3.946f)
                // l 2.903 17.216
                lineToRelative(dx = 2.903f, dy = 17.216f)
                // c -1.642 0.493 -2.849 2 -2.849 3.8
                curveToRelative(
                    dx1 = -1.642f,
                    dy1 = 0.493f,
                    dx2 = -2.849f,
                    dy2 = 2.0f,
                    dx3 = -2.849f,
                    dy3 = 3.8f,
                )
                // C 7 27.213 8.788 29 10.984 29
                curveTo(
                    x1 = 7.0f,
                    y1 = 27.213f,
                    x2 = 8.788f,
                    y2 = 29.0f,
                    x3 = 10.984f,
                    y3 = 29.0f,
                )
                // h 22
                horizontalLineToRelative(dx = 22.0f)
                // c 0.553 0 1 -0.447 1 -1
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -0.447f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // s -0.447 -1 -1 -1z
                reflectiveCurveToRelative(
                    dx1 = -0.447f,
                    dy1 = -1.0f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                )
                close()
                // M 30.82 17
                moveTo(x = 30.82f, y = 17.0f)
                // h -3.307
                horizontalLineToRelative(dx = -3.307f)
                // l 0.273 -2
                lineToRelative(dx = 0.273f, dy = -2.0f)
                // h 3.366
                horizontalLineToRelative(dx = 3.366f)
                // l -0.332 2z
                lineToRelative(dx = -0.332f, dy = 2.0f)
                close()
                // M 25.494 17
                moveTo(x = 25.494f, y = 17.0f)
                // L 22 17
                lineTo(x = 22.0f, y = 17.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 3.767
                horizontalLineToRelative(dx = 3.767f)
                // l -0.273 2z
                lineToRelative(dx = -0.273f, dy = 2.0f)
                close()
                // M 20 17
                moveTo(x = 20.0f, y = 17.0f)
                // h -3.494
                horizontalLineToRelative(dx = -3.494f)
                // l -0.273 -2
                lineToRelative(dx = -0.273f, dy = -2.0f)
                // L 20 15
                lineTo(x = 20.0f, y = 15.0f)
                // v 2z
                verticalLineToRelative(dy = 2.0f)
                close()
                // M 14.488 17
                moveTo(x = 14.488f, y = 17.0f)
                // h -3.307
                horizontalLineToRelative(dx = -3.307f)
                // l -0.333 -2
                lineToRelative(dx = -0.333f, dy = -2.0f)
                // h 3.367
                horizontalLineToRelative(dx = 3.367f)
                // l 0.273 2z
                lineToRelative(dx = 0.273f, dy = 2.0f)
                close()
                // M 11.847 21
                moveTo(x = 11.847f, y = 21.0f)
                // l -0.333 -2
                lineToRelative(dx = -0.333f, dy = -2.0f)
                // h 3.247
                horizontalLineToRelative(dx = 3.247f)
                // l 0.273 2
                lineToRelative(dx = 0.273f, dy = 2.0f)
                // h -3.187z
                horizontalLineToRelative(dx = -3.187f)
                close()
                // M 17.053 21
                moveTo(x = 17.053f, y = 21.0f)
                // l -0.273 -2
                lineToRelative(dx = -0.273f, dy = -2.0f)
                // L 20 19
                lineTo(x = 20.0f, y = 19.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2.947z
                horizontalLineToRelative(dx = -2.947f)
                close()
                // M 22 21
                moveTo(x = 22.0f, y = 21.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 3.22
                horizontalLineToRelative(dx = 3.22f)
                // l -0.273 2
                lineToRelative(dx = -0.273f, dy = 2.0f)
                // L 22 21z
                lineTo(x = 22.0f, y = 21.0f)
                close()
                // M 26.967 21
                moveTo(x = 26.967f, y = 21.0f)
                // l 0.273 -2
                lineToRelative(dx = 0.273f, dy = -2.0f)
                // h 3.247
                horizontalLineToRelative(dx = 3.247f)
                // l -0.333 2
                lineToRelative(dx = -0.333f, dy = 2.0f)
                // h -3.187z
                horizontalLineToRelative(dx = -3.187f)
                close()
                // M 31.819 11
                moveTo(x = 31.819f, y = 11.0f)
                // l -0.333 2
                lineToRelative(dx = -0.333f, dy = 2.0f)
                // L 28.06 13
                lineTo(x = 28.06f, y = 13.0f)
                // l 0.273 -2
                lineToRelative(dx = 0.273f, dy = -2.0f)
                // h 3.486z
                horizontalLineToRelative(dx = 3.486f)
                close()
                // M 26.314 11
                moveTo(x = 26.314f, y = 11.0f)
                // l -0.273 2
                lineToRelative(dx = -0.273f, dy = 2.0f)
                // L 22 13
                lineTo(x = 22.0f, y = 13.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 4.314z
                horizontalLineToRelative(dx = 4.314f)
                close()
                // M 20 11
                moveTo(x = 20.0f, y = 11.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -4.041
                horizontalLineToRelative(dx = -4.041f)
                // l -0.273 -2
                lineToRelative(dx = -0.273f, dy = -2.0f)
                // L 20 11z
                lineTo(x = 20.0f, y = 11.0f)
                close()
                // M 13.667 11
                moveTo(x = 13.667f, y = 11.0f)
                // l 0.273 2
                lineToRelative(dx = 0.273f, dy = 2.0f)
                // h -3.427
                horizontalLineToRelative(dx = -3.427f)
                // l -0.333 -2
                lineToRelative(dx = -0.333f, dy = -2.0f)
                // h 3.487z
                horizontalLineToRelative(dx = 3.487f)
                close()
            }
            // M14 31 m-3 0 a3 3 0 1 1 6 0 a3 3 0 1 1 -6 0
            path(
                fill = SolidColor(Color(0xFFE1E8ED)),
            ) {
                // M 14 31
                moveTo(x = 14.0f, y = 31.0f)
                // m -3 0
                moveToRelative(dx = -3.0f, dy = 0.0f)
                // a 3 3 0 1 1 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // a 3 3 0 1 1 -6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
            }
            // M14 35 c-2.206 0 -4 -1.794 -4 -4 s1.794 -4 4 -4 4 1.794 4 4 -1.794 4 -4 4z M14 29 c-1.103 0 -2 0.897 -2 2 s0.897 2 2 2 2 -0.897 2 -2 -0.897 -2 -2 -2z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 14 35
                moveTo(x = 14.0f, y = 35.0f)
                // c -2.206 0 -4 -1.794 -4 -4
                curveToRelative(
                    dx1 = -2.206f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = -1.794f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                // s 1.794 -4 4 -4
                reflectiveCurveToRelative(
                    dx1 = 1.794f,
                    dy1 = -4.0f,
                    dx2 = 4.0f,
                    dy2 = -4.0f,
                )
                // s 4 1.794 4 4
                reflectiveCurveToRelative(
                    dx1 = 4.0f,
                    dy1 = 1.794f,
                    dx2 = 4.0f,
                    dy2 = 4.0f,
                )
                // s -1.794 4 -4 4z
                reflectiveCurveToRelative(
                    dx1 = -1.794f,
                    dy1 = 4.0f,
                    dx2 = -4.0f,
                    dy2 = 4.0f,
                )
                close()
                // M 14 29
                moveTo(x = 14.0f, y = 29.0f)
                // c -1.103 0 -2 0.897 -2 2
                curveToRelative(
                    dx1 = -1.103f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = 0.897f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // s 0.897 2 2 2
                reflectiveCurveToRelative(
                    dx1 = 0.897f,
                    dy1 = 2.0f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                )
                // s 2 -0.897 2 -2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = -0.897f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // s -0.897 -2 -2 -2z
                reflectiveCurveToRelative(
                    dx1 = -0.897f,
                    dy1 = -2.0f,
                    dx2 = -2.0f,
                    dy2 = -2.0f,
                )
                close()
            }
            // M28 31 m-3 0 a3 3 0 1 1 6 0 a3 3 0 1 1 -6 0
            path(
                fill = SolidColor(Color(0xFFE1E8ED)),
            ) {
                // M 28 31
                moveTo(x = 28.0f, y = 31.0f)
                // m -3 0
                moveToRelative(dx = -3.0f, dy = 0.0f)
                // a 3 3 0 1 1 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // a 3 3 0 1 1 -6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
            }
            // M28 35 c-2.206 0 -4 -1.794 -4 -4 s1.794 -4 4 -4 4 1.794 4 4 -1.794 4 -4 4z M28 29 c-1.103 0 -2 0.897 -2 2 s0.897 2 2 2 2 -0.897 2 -2 -0.897 -2 -2 -2z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 28 35
                moveTo(x = 28.0f, y = 35.0f)
                // c -2.206 0 -4 -1.794 -4 -4
                curveToRelative(
                    dx1 = -2.206f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = -1.794f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                // s 1.794 -4 4 -4
                reflectiveCurveToRelative(
                    dx1 = 1.794f,
                    dy1 = -4.0f,
                    dx2 = 4.0f,
                    dy2 = -4.0f,
                )
                // s 4 1.794 4 4
                reflectiveCurveToRelative(
                    dx1 = 4.0f,
                    dy1 = 1.794f,
                    dx2 = 4.0f,
                    dy2 = 4.0f,
                )
                // s -1.794 4 -4 4z
                reflectiveCurveToRelative(
                    dx1 = -1.794f,
                    dy1 = 4.0f,
                    dx2 = -4.0f,
                    dy2 = 4.0f,
                )
                close()
                // M 28 29
                moveTo(x = 28.0f, y = 29.0f)
                // c -1.103 0 -2 0.897 -2 2
                curveToRelative(
                    dx1 = -1.103f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = 0.897f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // s 0.897 2 2 2
                reflectiveCurveToRelative(
                    dx1 = 0.897f,
                    dy1 = 2.0f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                )
                // s 2 -0.897 2 -2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = -0.897f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // s -0.897 -2 -2 -2z
                reflectiveCurveToRelative(
                    dx1 = -0.897f,
                    dy1 = -2.0f,
                    dx2 = -2.0f,
                    dy2 = -2.0f,
                )
                close()
            }
        }.build().also { _emoji1f6d2 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f6d2: ImageVector? = null
