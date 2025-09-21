package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f920: ImageVector
    get() {
        val current = _emoji1f920
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f920",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M33 21 c0 8.284 -6.716 15 -15 15 S3 29.284 3 21 C3 12.716 9.716 6 18 6 s15 6.716 15 15
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 33 21
                moveTo(x = 33.0f, y = 21.0f)
                // c 0 8.284 -6.716 15 -15 15
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 8.284f,
                    dx2 = -6.716f,
                    dy2 = 15.0f,
                    dx3 = -15.0f,
                    dy3 = 15.0f,
                )
                // S 3 29.284 3 21
                reflectiveCurveTo(
                    x1 = 3.0f,
                    y1 = 29.284f,
                    x2 = 3.0f,
                    y2 = 21.0f,
                )
                // C 3 12.716 9.716 6 18 6
                curveTo(
                    x1 = 3.0f,
                    y1 = 12.716f,
                    x2 = 9.716f,
                    y2 = 6.0f,
                    x3 = 18.0f,
                    y3 = 6.0f,
                )
                // s 15 6.716 15 15
                reflectiveCurveToRelative(
                    dx1 = 15.0f,
                    dy1 = 6.716f,
                    dx2 = 15.0f,
                    dy2 = 15.0f,
                )
            }
            // M25.688 25.605 c-0.146 -0.133 -0.366 -0.141 -0.522 -0.023 -0.032 0.023 -3.23 2.389 -7.165 2.389 -3.925 0 -7.133 -2.365 -7.165 -2.389 -0.157 -0.117 -0.376 -0.107 -0.523 0.023 -0.146 0.132 -0.179 0.35 -0.077 0.517 0.105 0.178 2.648 4.318 7.764 4.318 5.115 0 7.659 -4.141 7.765 -4.317 0.101 -0.169 0.069 -0.386 -0.077 -0.518z M14.706 19.765 c0 1.593 -0.922 2.883 -2.059 2.883 s-2.059 -1.29 -2.059 -2.883 c0 -1.591 0.921 -2.882 2.059 -2.882 s2.059 1.29 2.059 2.882z M25.412 19.765 c0 1.593 -0.922 2.883 -2.06 2.883 -1.137 0 -2.059 -1.29 -2.059 -2.883 0 -1.591 0.922 -2.882 2.059 -2.882 1.138 -0.001 2.06 1.29 2.06 2.882z M32 6.13 c-1.19 1.441 -3.182 1.951 -5.076 2.121 C26.606 6.713 25.241 1 22.5 1 c-2.403 0 -3.269 1.091 -4.5 1.091 C16.769 2.091 15.903 1 13.5 1 c-2.741 0 -4.106 5.713 -4.424 7.251 C7.182 8.081 5.19 7.57 4 6.13 1.847 3.524 -1 5.444 0.442 8.304 2.72 12.821 8.23 16 18 16 c9.769 0 15.279 -3.179 17.558 -7.696 C37 5.444 34.153 3.524 32 6.13z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 25.688 25.605
                moveTo(x = 25.688f, y = 25.605f)
                // c -0.146 -0.133 -0.366 -0.141 -0.522 -0.023
                curveToRelative(
                    dx1 = -0.146f,
                    dy1 = -0.133f,
                    dx2 = -0.366f,
                    dy2 = -0.141f,
                    dx3 = -0.522f,
                    dy3 = -0.023f,
                )
                // c -0.032 0.023 -3.23 2.389 -7.165 2.389
                curveToRelative(
                    dx1 = -0.032f,
                    dy1 = 0.023f,
                    dx2 = -3.23f,
                    dy2 = 2.389f,
                    dx3 = -7.165f,
                    dy3 = 2.389f,
                )
                // c -3.925 0 -7.133 -2.365 -7.165 -2.389
                curveToRelative(
                    dx1 = -3.925f,
                    dy1 = 0.0f,
                    dx2 = -7.133f,
                    dy2 = -2.365f,
                    dx3 = -7.165f,
                    dy3 = -2.389f,
                )
                // c -0.157 -0.117 -0.376 -0.107 -0.523 0.023
                curveToRelative(
                    dx1 = -0.157f,
                    dy1 = -0.117f,
                    dx2 = -0.376f,
                    dy2 = -0.107f,
                    dx3 = -0.523f,
                    dy3 = 0.023f,
                )
                // c -0.146 0.132 -0.179 0.35 -0.077 0.517
                curveToRelative(
                    dx1 = -0.146f,
                    dy1 = 0.132f,
                    dx2 = -0.179f,
                    dy2 = 0.35f,
                    dx3 = -0.077f,
                    dy3 = 0.517f,
                )
                // c 0.105 0.178 2.648 4.318 7.764 4.318
                curveToRelative(
                    dx1 = 0.105f,
                    dy1 = 0.178f,
                    dx2 = 2.648f,
                    dy2 = 4.318f,
                    dx3 = 7.764f,
                    dy3 = 4.318f,
                )
                // c 5.115 0 7.659 -4.141 7.765 -4.317
                curveToRelative(
                    dx1 = 5.115f,
                    dy1 = 0.0f,
                    dx2 = 7.659f,
                    dy2 = -4.141f,
                    dx3 = 7.765f,
                    dy3 = -4.317f,
                )
                // c 0.101 -0.169 0.069 -0.386 -0.077 -0.518z
                curveToRelative(
                    dx1 = 0.101f,
                    dy1 = -0.169f,
                    dx2 = 0.069f,
                    dy2 = -0.386f,
                    dx3 = -0.077f,
                    dy3 = -0.518f,
                )
                close()
                // M 14.706 19.765
                moveTo(x = 14.706f, y = 19.765f)
                // c 0 1.593 -0.922 2.883 -2.059 2.883
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.593f,
                    dx2 = -0.922f,
                    dy2 = 2.883f,
                    dx3 = -2.059f,
                    dy3 = 2.883f,
                )
                // s -2.059 -1.29 -2.059 -2.883
                reflectiveCurveToRelative(
                    dx1 = -2.059f,
                    dy1 = -1.29f,
                    dx2 = -2.059f,
                    dy2 = -2.883f,
                )
                // c 0 -1.591 0.921 -2.882 2.059 -2.882
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.591f,
                    dx2 = 0.921f,
                    dy2 = -2.882f,
                    dx3 = 2.059f,
                    dy3 = -2.882f,
                )
                // s 2.059 1.29 2.059 2.882z
                reflectiveCurveToRelative(
                    dx1 = 2.059f,
                    dy1 = 1.29f,
                    dx2 = 2.059f,
                    dy2 = 2.882f,
                )
                close()
                // M 25.412 19.765
                moveTo(x = 25.412f, y = 19.765f)
                // c 0 1.593 -0.922 2.883 -2.06 2.883
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.593f,
                    dx2 = -0.922f,
                    dy2 = 2.883f,
                    dx3 = -2.06f,
                    dy3 = 2.883f,
                )
                // c -1.137 0 -2.059 -1.29 -2.059 -2.883
                curveToRelative(
                    dx1 = -1.137f,
                    dy1 = 0.0f,
                    dx2 = -2.059f,
                    dy2 = -1.29f,
                    dx3 = -2.059f,
                    dy3 = -2.883f,
                )
                // c 0 -1.591 0.922 -2.882 2.059 -2.882
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.591f,
                    dx2 = 0.922f,
                    dy2 = -2.882f,
                    dx3 = 2.059f,
                    dy3 = -2.882f,
                )
                // c 1.138 -0.001 2.06 1.29 2.06 2.882z
                curveToRelative(
                    dx1 = 1.138f,
                    dy1 = -0.001f,
                    dx2 = 2.06f,
                    dy2 = 1.29f,
                    dx3 = 2.06f,
                    dy3 = 2.882f,
                )
                close()
                // M 32 6.13
                moveTo(x = 32.0f, y = 6.13f)
                // c -1.19 1.441 -3.182 1.951 -5.076 2.121
                curveToRelative(
                    dx1 = -1.19f,
                    dy1 = 1.441f,
                    dx2 = -3.182f,
                    dy2 = 1.951f,
                    dx3 = -5.076f,
                    dy3 = 2.121f,
                )
                // C 26.606 6.713 25.241 1 22.5 1
                curveTo(
                    x1 = 26.606f,
                    y1 = 6.713f,
                    x2 = 25.241f,
                    y2 = 1.0f,
                    x3 = 22.5f,
                    y3 = 1.0f,
                )
                // c -2.403 0 -3.269 1.091 -4.5 1.091
                curveToRelative(
                    dx1 = -2.403f,
                    dy1 = 0.0f,
                    dx2 = -3.269f,
                    dy2 = 1.091f,
                    dx3 = -4.5f,
                    dy3 = 1.091f,
                )
                // C 16.769 2.091 15.903 1 13.5 1
                curveTo(
                    x1 = 16.769f,
                    y1 = 2.091f,
                    x2 = 15.903f,
                    y2 = 1.0f,
                    x3 = 13.5f,
                    y3 = 1.0f,
                )
                // c -2.741 0 -4.106 5.713 -4.424 7.251
                curveToRelative(
                    dx1 = -2.741f,
                    dy1 = 0.0f,
                    dx2 = -4.106f,
                    dy2 = 5.713f,
                    dx3 = -4.424f,
                    dy3 = 7.251f,
                )
                // C 7.182 8.081 5.19 7.57 4 6.13
                curveTo(
                    x1 = 7.182f,
                    y1 = 8.081f,
                    x2 = 5.19f,
                    y2 = 7.57f,
                    x3 = 4.0f,
                    y3 = 6.13f,
                )
                // C 1.847 3.524 -1 5.444 0.442 8.304
                curveTo(
                    x1 = 1.847f,
                    y1 = 3.524f,
                    x2 = -1.0f,
                    y2 = 5.444f,
                    x3 = 0.442f,
                    y3 = 8.304f,
                )
                // C 2.72 12.821 8.23 16 18 16
                curveTo(
                    x1 = 2.72f,
                    y1 = 12.821f,
                    x2 = 8.23f,
                    y2 = 16.0f,
                    x3 = 18.0f,
                    y3 = 16.0f,
                )
                // c 9.769 0 15.279 -3.179 17.558 -7.696
                curveToRelative(
                    dx1 = 9.769f,
                    dy1 = 0.0f,
                    dx2 = 15.279f,
                    dy2 = -3.179f,
                    dx3 = 17.558f,
                    dy3 = -7.696f,
                )
                // C 37 5.444 34.153 3.524 32 6.13z
                curveTo(
                    x1 = 37.0f,
                    y1 = 5.444f,
                    x2 = 34.153f,
                    y2 = 3.524f,
                    x3 = 32.0f,
                    y3 = 6.13f,
                )
                close()
            }
            // M21.5 3 c-1.869 0 -2.543 0.964 -3.5 0.964 -0.957 0 -1.631 -0.964 -3.5 -0.964 C12.037 3 11 9.75 11 9.75 S12.282 12 18 12 c5.719 0 7 -2.25 7 -2.25 S23.963 3 21.5 3z
            path(
                fill = SolidColor(Color(0xFF825D0E)),
            ) {
                // M 21.5 3
                moveTo(x = 21.5f, y = 3.0f)
                // c -1.869 0 -2.543 0.964 -3.5 0.964
                curveToRelative(
                    dx1 = -1.869f,
                    dy1 = 0.0f,
                    dx2 = -2.543f,
                    dy2 = 0.964f,
                    dx3 = -3.5f,
                    dy3 = 0.964f,
                )
                // c -0.957 0 -1.631 -0.964 -3.5 -0.964
                curveToRelative(
                    dx1 = -0.957f,
                    dy1 = 0.0f,
                    dx2 = -1.631f,
                    dy2 = -0.964f,
                    dx3 = -3.5f,
                    dy3 = -0.964f,
                )
                // C 12.037 3 11 9.75 11 9.75
                curveTo(
                    x1 = 12.037f,
                    y1 = 3.0f,
                    x2 = 11.0f,
                    y2 = 9.75f,
                    x3 = 11.0f,
                    y3 = 9.75f,
                )
                // S 12.282 12 18 12
                reflectiveCurveTo(
                    x1 = 12.282f,
                    y1 = 12.0f,
                    x2 = 18.0f,
                    y2 = 12.0f,
                )
                // c 5.719 0 7 -2.25 7 -2.25
                curveToRelative(
                    dx1 = 5.719f,
                    dy1 = 0.0f,
                    dx2 = 7.0f,
                    dy2 = -2.25f,
                    dx3 = 7.0f,
                    dy3 = -2.25f,
                )
                // S 23.963 3 21.5 3z
                reflectiveCurveTo(
                    x1 = 23.963f,
                    y1 = 3.0f,
                    x2 = 21.5f,
                    y2 = 3.0f,
                )
                close()
            }
            // M11 6 s2.074 2 7 2 c4.927 0 7 -2 7 -2 v2 s-2.222 2 -7 2 c-4.778 0 -7 -2 -7 -2 V6z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 11 6
                moveTo(x = 11.0f, y = 6.0f)
                // s 2.074 2 7 2
                reflectiveCurveToRelative(
                    dx1 = 2.074f,
                    dy1 = 2.0f,
                    dx2 = 7.0f,
                    dy2 = 2.0f,
                )
                // c 4.927 0 7 -2 7 -2
                curveToRelative(
                    dx1 = 4.927f,
                    dy1 = 0.0f,
                    dx2 = 7.0f,
                    dy2 = -2.0f,
                    dx3 = 7.0f,
                    dy3 = -2.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // s -2.222 2 -7 2
                reflectiveCurveToRelative(
                    dx1 = -2.222f,
                    dy1 = 2.0f,
                    dx2 = -7.0f,
                    dy2 = 2.0f,
                )
                // c -4.778 0 -7 -2 -7 -2
                curveToRelative(
                    dx1 = -4.778f,
                    dy1 = 0.0f,
                    dx2 = -7.0f,
                    dy2 = -2.0f,
                    dx3 = -7.0f,
                    dy3 = -2.0f,
                )
                // V 6z
                verticalLineTo(y = 6.0f)
                close()
            }
        }.build().also { _emoji1f920 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f920: ImageVector? = null
