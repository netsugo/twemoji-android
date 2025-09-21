package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f6f5: ImageVector
    get() {
        val current = _emoji1f6f5
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f6f5",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M32 24 h-1 c-0.55 0 -1 -0.45 -1 -1 s0.45 -1 1 -1 h1 c0.55 0 1 0.45 1 1 s-0.45 1 -1 1
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 32 24
                moveTo(x = 32.0f, y = 24.0f)
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // c -0.55 0 -1 -0.45 -1 -1
                curveToRelative(
                    dx1 = -0.55f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.45f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // s 0.45 -1 1 -1
                reflectiveCurveToRelative(
                    dx1 = 0.45f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // c 0.55 0 1 0.45 1 1
                curveToRelative(
                    dx1 = 0.55f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.45f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // s -0.45 1 -1 1
                reflectiveCurveToRelative(
                    dx1 = -0.45f,
                    dy1 = 1.0f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
            }
            // M10 31.5 c0 2.485 -2.015 4.5 -4.5 4.5 S1 33.985 1 31.5 3.015 27 5.5 27 s4.5 2.015 4.5 4.5 m24 0 c0 2.485 -2.015 4.5 -4.5 4.5 S25 33.985 25 31.5 s2.015 -4.5 4.5 -4.5 4.5 2.015 4.5 4.5
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 10 31.5
                moveTo(x = 10.0f, y = 31.5f)
                // c 0 2.485 -2.015 4.5 -4.5 4.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.485f,
                    dx2 = -2.015f,
                    dy2 = 4.5f,
                    dx3 = -4.5f,
                    dy3 = 4.5f,
                )
                // S 1 33.985 1 31.5
                reflectiveCurveTo(
                    x1 = 1.0f,
                    y1 = 33.985f,
                    x2 = 1.0f,
                    y2 = 31.5f,
                )
                // S 3.015 27 5.5 27
                reflectiveCurveTo(
                    x1 = 3.015f,
                    y1 = 27.0f,
                    x2 = 5.5f,
                    y2 = 27.0f,
                )
                // s 4.5 2.015 4.5 4.5
                reflectiveCurveToRelative(
                    dx1 = 4.5f,
                    dy1 = 2.015f,
                    dx2 = 4.5f,
                    dy2 = 4.5f,
                )
                // m 24 0
                moveToRelative(dx = 24.0f, dy = 0.0f)
                // c 0 2.485 -2.015 4.5 -4.5 4.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.485f,
                    dx2 = -2.015f,
                    dy2 = 4.5f,
                    dx3 = -4.5f,
                    dy3 = 4.5f,
                )
                // S 25 33.985 25 31.5
                reflectiveCurveTo(
                    x1 = 25.0f,
                    y1 = 33.985f,
                    x2 = 25.0f,
                    y2 = 31.5f,
                )
                // s 2.015 -4.5 4.5 -4.5
                reflectiveCurveToRelative(
                    dx1 = 2.015f,
                    dy1 = -4.5f,
                    dx2 = 4.5f,
                    dy2 = -4.5f,
                )
                // s 4.5 2.015 4.5 4.5
                reflectiveCurveToRelative(
                    dx1 = 4.5f,
                    dy1 = 2.015f,
                    dx2 = 4.5f,
                    dy2 = 4.5f,
                )
            }
            // M8 31.5 C8 32.881 6.881 34 5.5 34 S3 32.881 3 31.5 4.119 29 5.5 29 8 30.119 8 31.5 m24 0 c0 1.381 -1.119 2.5 -2.5 2.5 S27 32.881 27 31.5 s1.119 -2.5 2.5 -2.5 2.5 1.119 2.5 2.5
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 8 31.5
                moveTo(x = 8.0f, y = 31.5f)
                // C 8 32.881 6.881 34 5.5 34
                curveTo(
                    x1 = 8.0f,
                    y1 = 32.881f,
                    x2 = 6.881f,
                    y2 = 34.0f,
                    x3 = 5.5f,
                    y3 = 34.0f,
                )
                // S 3 32.881 3 31.5
                reflectiveCurveTo(
                    x1 = 3.0f,
                    y1 = 32.881f,
                    x2 = 3.0f,
                    y2 = 31.5f,
                )
                // S 4.119 29 5.5 29
                reflectiveCurveTo(
                    x1 = 4.119f,
                    y1 = 29.0f,
                    x2 = 5.5f,
                    y2 = 29.0f,
                )
                // S 8 30.119 8 31.5
                reflectiveCurveTo(
                    x1 = 8.0f,
                    y1 = 30.119f,
                    x2 = 8.0f,
                    y2 = 31.5f,
                )
                // m 24 0
                moveToRelative(dx = 24.0f, dy = 0.0f)
                // c 0 1.381 -1.119 2.5 -2.5 2.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.381f,
                    dx2 = -1.119f,
                    dy2 = 2.5f,
                    dx3 = -2.5f,
                    dy3 = 2.5f,
                )
                // S 27 32.881 27 31.5
                reflectiveCurveTo(
                    x1 = 27.0f,
                    y1 = 32.881f,
                    x2 = 27.0f,
                    y2 = 31.5f,
                )
                // s 1.119 -2.5 2.5 -2.5
                reflectiveCurveToRelative(
                    dx1 = 1.119f,
                    dy1 = -2.5f,
                    dx2 = 2.5f,
                    dy2 = -2.5f,
                )
                // s 2.5 1.119 2.5 2.5
                reflectiveCurveToRelative(
                    dx1 = 2.5f,
                    dy1 = 1.119f,
                    dx2 = 2.5f,
                    dy2 = 2.5f,
                )
            }
            // M5.854 24.082 l2.615 -6.989 L8 16 s-0.916 0.008 -1 -1 c-0.083 -1.007 2.408 -3.079 3 -3 0.593 0.08 0 2 0 2 s2.32 0.557 2 2 c-0.319 1.444 -2.375 8.688 -2.375 8.688 S11.375 25.563 12 27 c0.449 1.032 1.681 1.018 3 1 1.319 -0.016 4.393 -0.007 5 -2 0.606 -1.991 1 -3 1 -3 l-1 -1 10 -2 s-0.891 1.982 1 3 c2.168 1.169 2.86 2.669 4 5 0.749 1.534 0.448 1.897 -1 2 -1.941 0.14 -4.44 0.386 -5.79 0.535 -1.197 0.134 -2.284 1.65 -4.164 1.65 s-10.052 0.049 -12.046 -0.186 c-3.496 -0.409 -4.758 -3 -10 -3 -2.072 0 -1.06 -1.563 0.028 -2.665 1.209 -1.226 3.801 -2.4 3.826 -2.252
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 5.854 24.082
                moveTo(x = 5.854f, y = 24.082f)
                // l 2.615 -6.989
                lineToRelative(dx = 2.615f, dy = -6.989f)
                // L 8 16
                lineTo(x = 8.0f, y = 16.0f)
                // s -0.916 0.008 -1 -1
                reflectiveCurveToRelative(
                    dx1 = -0.916f,
                    dy1 = 0.008f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                )
                // c -0.083 -1.007 2.408 -3.079 3 -3
                curveToRelative(
                    dx1 = -0.083f,
                    dy1 = -1.007f,
                    dx2 = 2.408f,
                    dy2 = -3.079f,
                    dx3 = 3.0f,
                    dy3 = -3.0f,
                )
                // c 0.593 0.08 0 2 0 2
                curveToRelative(
                    dx1 = 0.593f,
                    dy1 = 0.08f,
                    dx2 = 0.0f,
                    dy2 = 2.0f,
                    dx3 = 0.0f,
                    dy3 = 2.0f,
                )
                // s 2.32 0.557 2 2
                reflectiveCurveToRelative(
                    dx1 = 2.32f,
                    dy1 = 0.557f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                )
                // c -0.319 1.444 -2.375 8.688 -2.375 8.688
                curveToRelative(
                    dx1 = -0.319f,
                    dy1 = 1.444f,
                    dx2 = -2.375f,
                    dy2 = 8.688f,
                    dx3 = -2.375f,
                    dy3 = 8.688f,
                )
                // S 11.375 25.563 12 27
                reflectiveCurveTo(
                    x1 = 11.375f,
                    y1 = 25.563f,
                    x2 = 12.0f,
                    y2 = 27.0f,
                )
                // c 0.449 1.032 1.681 1.018 3 1
                curveToRelative(
                    dx1 = 0.449f,
                    dy1 = 1.032f,
                    dx2 = 1.681f,
                    dy2 = 1.018f,
                    dx3 = 3.0f,
                    dy3 = 1.0f,
                )
                // c 1.319 -0.016 4.393 -0.007 5 -2
                curveToRelative(
                    dx1 = 1.319f,
                    dy1 = -0.016f,
                    dx2 = 4.393f,
                    dy2 = -0.007f,
                    dx3 = 5.0f,
                    dy3 = -2.0f,
                )
                // c 0.606 -1.991 1 -3 1 -3
                curveToRelative(
                    dx1 = 0.606f,
                    dy1 = -1.991f,
                    dx2 = 1.0f,
                    dy2 = -3.0f,
                    dx3 = 1.0f,
                    dy3 = -3.0f,
                )
                // l -1 -1
                lineToRelative(dx = -1.0f, dy = -1.0f)
                // l 10 -2
                lineToRelative(dx = 10.0f, dy = -2.0f)
                // s -0.891 1.982 1 3
                reflectiveCurveToRelative(
                    dx1 = -0.891f,
                    dy1 = 1.982f,
                    dx2 = 1.0f,
                    dy2 = 3.0f,
                )
                // c 2.168 1.169 2.86 2.669 4 5
                curveToRelative(
                    dx1 = 2.168f,
                    dy1 = 1.169f,
                    dx2 = 2.86f,
                    dy2 = 2.669f,
                    dx3 = 4.0f,
                    dy3 = 5.0f,
                )
                // c 0.749 1.534 0.448 1.897 -1 2
                curveToRelative(
                    dx1 = 0.749f,
                    dy1 = 1.534f,
                    dx2 = 0.448f,
                    dy2 = 1.897f,
                    dx3 = -1.0f,
                    dy3 = 2.0f,
                )
                // c -1.941 0.14 -4.44 0.386 -5.79 0.535
                curveToRelative(
                    dx1 = -1.941f,
                    dy1 = 0.14f,
                    dx2 = -4.44f,
                    dy2 = 0.386f,
                    dx3 = -5.79f,
                    dy3 = 0.535f,
                )
                // c -1.197 0.134 -2.284 1.65 -4.164 1.65
                curveToRelative(
                    dx1 = -1.197f,
                    dy1 = 0.134f,
                    dx2 = -2.284f,
                    dy2 = 1.65f,
                    dx3 = -4.164f,
                    dy3 = 1.65f,
                )
                // s -10.052 0.049 -12.046 -0.186
                reflectiveCurveToRelative(
                    dx1 = -10.052f,
                    dy1 = 0.049f,
                    dx2 = -12.046f,
                    dy2 = -0.186f,
                )
                // c -3.496 -0.409 -4.758 -3 -10 -3
                curveToRelative(
                    dx1 = -3.496f,
                    dy1 = -0.409f,
                    dx2 = -4.758f,
                    dy2 = -3.0f,
                    dx3 = -10.0f,
                    dy3 = -3.0f,
                )
                // c -2.072 0 -1.06 -1.563 0.028 -2.665
                curveToRelative(
                    dx1 = -2.072f,
                    dy1 = 0.0f,
                    dx2 = -1.06f,
                    dy2 = -1.563f,
                    dx3 = 0.028f,
                    dy3 = -2.665f,
                )
                // c 1.209 -1.226 3.801 -2.4 3.826 -2.252
                curveToRelative(
                    dx1 = 1.209f,
                    dy1 = -1.226f,
                    dx2 = 3.801f,
                    dy2 = -2.4f,
                    dx3 = 3.826f,
                    dy3 = -2.252f,
                )
            }
            // M22 33 h-3 c-1.1 0 -2 -0.9 -2 -2 s0.9 -2 2 -2 h3 c1.1 0 2 0.9 2 2 s-0.9 2 -2 2
            path(
                fill = SolidColor(Color(0xFFBE1931)),
            ) {
                // M 22 33
                moveTo(x = 22.0f, y = 33.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // c -1.1 0 -2 -0.9 -2 -2
                curveToRelative(
                    dx1 = -1.1f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -0.9f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // s 0.9 -2 2 -2
                reflectiveCurveToRelative(
                    dx1 = 0.9f,
                    dy1 = -2.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // c 1.1 0 2 0.9 2 2
                curveToRelative(
                    dx1 = 1.1f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 0.9f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                // s -0.9 2 -2 2
                reflectiveCurveToRelative(
                    dx1 = -0.9f,
                    dy1 = 2.0f,
                    dx2 = -2.0f,
                    dy2 = 2.0f,
                )
            }
            // M19 33 h-5 c-0.55 0 -1 -0.45 -1 -1 s0.45 -1 1 -1 h5 c0.55 0 1 0.45 1 1 s-0.45 1 -1 1
            path(
                fill = SolidColor(Color(0xFFBE1931)),
            ) {
                // M 19 33
                moveTo(x = 19.0f, y = 33.0f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // c -0.55 0 -1 -0.45 -1 -1
                curveToRelative(
                    dx1 = -0.55f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.45f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // s 0.45 -1 1 -1
                reflectiveCurveToRelative(
                    dx1 = 0.45f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // c 0.55 0 1 0.45 1 1
                curveToRelative(
                    dx1 = 0.55f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.45f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // s -0.45 1 -1 1
                reflectiveCurveToRelative(
                    dx1 = -0.45f,
                    dy1 = 1.0f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
            }
            // M22 22 c-1.618 0 -2.431 0.306 -3 -1 s-0.02 -2 1 -2 5.728 -0.181 8 -1 c2.272 -0.819 3.053 -0.831 3 0 s-1 2 -1 2 -1.254 2 -8 2 m-8 -6 h-3.251 c-0.55 0 -1 -0.45 -1 -1 s0.45 -1 1 -1 H14 c0.55 0 1 0.45 1 1 s-0.45 1 -1 1
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 22 22
                moveTo(x = 22.0f, y = 22.0f)
                // c -1.618 0 -2.431 0.306 -3 -1
                curveToRelative(
                    dx1 = -1.618f,
                    dy1 = 0.0f,
                    dx2 = -2.431f,
                    dy2 = 0.306f,
                    dx3 = -3.0f,
                    dy3 = -1.0f,
                )
                // s -0.02 -2 1 -2
                reflectiveCurveToRelative(
                    dx1 = -0.02f,
                    dy1 = -2.0f,
                    dx2 = 1.0f,
                    dy2 = -2.0f,
                )
                // s 5.728 -0.181 8 -1
                reflectiveCurveToRelative(
                    dx1 = 5.728f,
                    dy1 = -0.181f,
                    dx2 = 8.0f,
                    dy2 = -1.0f,
                )
                // c 2.272 -0.819 3.053 -0.831 3 0
                curveToRelative(
                    dx1 = 2.272f,
                    dy1 = -0.819f,
                    dx2 = 3.053f,
                    dy2 = -0.831f,
                    dx3 = 3.0f,
                    dy3 = 0.0f,
                )
                // s -1 2 -1 2
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 2.0f,
                    dx2 = -1.0f,
                    dy2 = 2.0f,
                )
                // s -1.254 2 -8 2
                reflectiveCurveToRelative(
                    dx1 = -1.254f,
                    dy1 = 2.0f,
                    dx2 = -8.0f,
                    dy2 = 2.0f,
                )
                // m -8 -6
                moveToRelative(dx = -8.0f, dy = -6.0f)
                // h -3.251
                horizontalLineToRelative(dx = -3.251f)
                // c -0.55 0 -1 -0.45 -1 -1
                curveToRelative(
                    dx1 = -0.55f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.45f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // s 0.45 -1 1 -1
                reflectiveCurveToRelative(
                    dx1 = 0.45f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // H 14
                horizontalLineTo(x = 14.0f)
                // c 0.55 0 1 0.45 1 1
                curveToRelative(
                    dx1 = 0.55f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.45f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // s -0.45 1 -1 1
                reflectiveCurveToRelative(
                    dx1 = -0.45f,
                    dy1 = 1.0f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
            }
            // M7.5 16 c-0.275 0 -0.5 -0.225 -0.5 -0.5 v-1 c0 -0.275 0.225 -0.5 0.5 -0.5 s0.5 0.225 0.5 0.5 v1 c0 0.275 -0.225 0.5 -0.5 0.5
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 7.5 16
                moveTo(x = 7.5f, y = 16.0f)
                // c -0.275 0 -0.5 -0.225 -0.5 -0.5
                curveToRelative(
                    dx1 = -0.275f,
                    dy1 = 0.0f,
                    dx2 = -0.5f,
                    dy2 = -0.225f,
                    dx3 = -0.5f,
                    dy3 = -0.5f,
                )
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // c 0 -0.275 0.225 -0.5 0.5 -0.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.275f,
                    dx2 = 0.225f,
                    dy2 = -0.5f,
                    dx3 = 0.5f,
                    dy3 = -0.5f,
                )
                // s 0.5 0.225 0.5 0.5
                reflectiveCurveToRelative(
                    dx1 = 0.5f,
                    dy1 = 0.225f,
                    dx2 = 0.5f,
                    dy2 = 0.5f,
                )
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // c 0 0.275 -0.225 0.5 -0.5 0.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.275f,
                    dx2 = -0.225f,
                    dy2 = 0.5f,
                    dx3 = -0.5f,
                    dy3 = 0.5f,
                )
            }
            // M13.062 13 h-0.125 c-0.516 0 -0.937 -0.422 -0.937 -0.937 V9.937 c0 -0.515 0.421 -0.937 0.938 -0.937 h0.125 c0.516 0 0.937 0.422 0.937 0.937 v2.126 c0 0.515 -0.421 0.937 -0.938 0.937
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 13.062 13
                moveTo(x = 13.062f, y = 13.0f)
                // h -0.125
                horizontalLineToRelative(dx = -0.125f)
                // c -0.516 0 -0.937 -0.422 -0.937 -0.937
                curveToRelative(
                    dx1 = -0.516f,
                    dy1 = 0.0f,
                    dx2 = -0.937f,
                    dy2 = -0.422f,
                    dx3 = -0.937f,
                    dy3 = -0.937f,
                )
                // V 9.937
                verticalLineTo(y = 9.937f)
                // c 0 -0.515 0.421 -0.937 0.938 -0.937
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.515f,
                    dx2 = 0.421f,
                    dy2 = -0.937f,
                    dx3 = 0.938f,
                    dy3 = -0.937f,
                )
                // h 0.125
                horizontalLineToRelative(dx = 0.125f)
                // c 0.516 0 0.937 0.422 0.937 0.937
                curveToRelative(
                    dx1 = 0.516f,
                    dy1 = 0.0f,
                    dx2 = 0.937f,
                    dy2 = 0.422f,
                    dx3 = 0.937f,
                    dy3 = 0.937f,
                )
                // v 2.126
                verticalLineToRelative(dy = 2.126f)
                // c 0 0.515 -0.421 0.937 -0.938 0.937
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.515f,
                    dx2 = -0.421f,
                    dy2 = 0.937f,
                    dx3 = -0.938f,
                    dy3 = 0.937f,
                )
            }
            // M9.982 15.066 l-0.022 -0.022 c-0.188 -0.188 -0.188 -0.497 0 -0.685 l2.85 -2.851 c0.189 -0.188 0.497 -0.188 0.685 0 l0.023 0.022 c0.188 0.189 0.188 0.497 0 0.685 l-2.851 2.851 c-0.188 0.188 -0.497 0.188 -0.685 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 9.982 15.066
                moveTo(x = 9.982f, y = 15.066f)
                // l -0.022 -0.022
                lineToRelative(dx = -0.022f, dy = -0.022f)
                // c -0.188 -0.188 -0.188 -0.497 0 -0.685
                curveToRelative(
                    dx1 = -0.188f,
                    dy1 = -0.188f,
                    dx2 = -0.188f,
                    dy2 = -0.497f,
                    dx3 = 0.0f,
                    dy3 = -0.685f,
                )
                // l 2.85 -2.851
                lineToRelative(dx = 2.85f, dy = -2.851f)
                // c 0.189 -0.188 0.497 -0.188 0.685 0
                curveToRelative(
                    dx1 = 0.189f,
                    dy1 = -0.188f,
                    dx2 = 0.497f,
                    dy2 = -0.188f,
                    dx3 = 0.685f,
                    dy3 = 0.0f,
                )
                // l 0.023 0.022
                lineToRelative(dx = 0.023f, dy = 0.022f)
                // c 0.188 0.189 0.188 0.497 0 0.685
                curveToRelative(
                    dx1 = 0.188f,
                    dy1 = 0.189f,
                    dx2 = 0.188f,
                    dy2 = 0.497f,
                    dx3 = 0.0f,
                    dy3 = 0.685f,
                )
                // l -2.851 2.851
                lineToRelative(dx = -2.851f, dy = 2.851f)
                // c -0.188 0.188 -0.497 0.188 -0.685 0
                curveToRelative(
                    dx1 = -0.188f,
                    dy1 = 0.188f,
                    dx2 = -0.497f,
                    dy2 = 0.188f,
                    dx3 = -0.685f,
                    dy3 = 0.0f,
                )
            }
        }.build().also { _emoji1f6f5 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f6f5: ImageVector? = null
