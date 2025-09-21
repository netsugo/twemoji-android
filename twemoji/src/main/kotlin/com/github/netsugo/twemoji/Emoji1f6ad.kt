package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f6ad: ImageVector
    get() {
        val current = _emoji1f6ad
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f6ad",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M18 18 m-17 0 a17 17 0 1 1 34 0 a17 17 0 1 1 -34 0
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 18 18
                moveTo(x = 18.0f, y = 18.0f)
                // m -17 0
                moveToRelative(dx = -17.0f, dy = 0.0f)
                // a 17 17 0 1 1 34 0
                arcToRelative(
                    a = 17.0f,
                    b = 17.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 34.0f,
                    dy1 = 0.0f,
                )
                // a 17 17 0 1 1 -34 0
                arcToRelative(
                    a = 17.0f,
                    b = 17.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -34.0f,
                    dy1 = 0.0f,
                )
            }
            // M23.703 17 h-0.017 c-0.407 0 -0.733 -0.261 -0.733 -0.668 0 -0.219 0.082 -2.149 2.929 -4.047 1.475 -0.983 1.784 -2.609 1.447 -3.721 -0.315 -1.042 -1.164 -1.63 -2.328 -1.63 -1.771 0 -2.26 0.957 -2.394 1.524 -0.169 0.713 0.046 1.179 0.268 1.369 0.325 0.279 0.8 0.218 1.075 0.049 0.196 -0.122 0.301 -0.331 0.301 -0.606 0 -0.414 0.336 -0.75 0.75 -0.75 s0.75 0.336 0.75 0.75 c0 0.799 -0.369 1.485 -1.013 1.883 -0.721 0.446 -1.832 0.4 -2.557 -0.004 -0.886 -0.494 -1.337 -1.743 -1.034 -3.031 0.396 -1.674 1.836 -2.674 3.854 -2.674 1.844 0 3.251 1.011 3.764 2.704 0.602 1.986 -0.242 4.215 -2.051 5.421 -2.173 1.449 -2.259 2.723 -2.261 2.779 -0.018 0.402 -0.349 0.652 -0.75 0.652z M22 19 L6 19 s-2 0 -2 2 v1 c0 2 2 2 2 2 h16 v-5z M27 19 h-3 v5 h3 s2 0 2 -2 v-1 c0 -2 -2 -2 -2 -2z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 23.703 17
                moveTo(x = 23.703f, y = 17.0f)
                // h -0.017
                horizontalLineToRelative(dx = -0.017f)
                // c -0.407 0 -0.733 -0.261 -0.733 -0.668
                curveToRelative(
                    dx1 = -0.407f,
                    dy1 = 0.0f,
                    dx2 = -0.733f,
                    dy2 = -0.261f,
                    dx3 = -0.733f,
                    dy3 = -0.668f,
                )
                // c 0 -0.219 0.082 -2.149 2.929 -4.047
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.219f,
                    dx2 = 0.082f,
                    dy2 = -2.149f,
                    dx3 = 2.929f,
                    dy3 = -4.047f,
                )
                // c 1.475 -0.983 1.784 -2.609 1.447 -3.721
                curveToRelative(
                    dx1 = 1.475f,
                    dy1 = -0.983f,
                    dx2 = 1.784f,
                    dy2 = -2.609f,
                    dx3 = 1.447f,
                    dy3 = -3.721f,
                )
                // c -0.315 -1.042 -1.164 -1.63 -2.328 -1.63
                curveToRelative(
                    dx1 = -0.315f,
                    dy1 = -1.042f,
                    dx2 = -1.164f,
                    dy2 = -1.63f,
                    dx3 = -2.328f,
                    dy3 = -1.63f,
                )
                // c -1.771 0 -2.26 0.957 -2.394 1.524
                curveToRelative(
                    dx1 = -1.771f,
                    dy1 = 0.0f,
                    dx2 = -2.26f,
                    dy2 = 0.957f,
                    dx3 = -2.394f,
                    dy3 = 1.524f,
                )
                // c -0.169 0.713 0.046 1.179 0.268 1.369
                curveToRelative(
                    dx1 = -0.169f,
                    dy1 = 0.713f,
                    dx2 = 0.046f,
                    dy2 = 1.179f,
                    dx3 = 0.268f,
                    dy3 = 1.369f,
                )
                // c 0.325 0.279 0.8 0.218 1.075 0.049
                curveToRelative(
                    dx1 = 0.325f,
                    dy1 = 0.279f,
                    dx2 = 0.8f,
                    dy2 = 0.218f,
                    dx3 = 1.075f,
                    dy3 = 0.049f,
                )
                // c 0.196 -0.122 0.301 -0.331 0.301 -0.606
                curveToRelative(
                    dx1 = 0.196f,
                    dy1 = -0.122f,
                    dx2 = 0.301f,
                    dy2 = -0.331f,
                    dx3 = 0.301f,
                    dy3 = -0.606f,
                )
                // c 0 -0.414 0.336 -0.75 0.75 -0.75
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.414f,
                    dx2 = 0.336f,
                    dy2 = -0.75f,
                    dx3 = 0.75f,
                    dy3 = -0.75f,
                )
                // s 0.75 0.336 0.75 0.75
                reflectiveCurveToRelative(
                    dx1 = 0.75f,
                    dy1 = 0.336f,
                    dx2 = 0.75f,
                    dy2 = 0.75f,
                )
                // c 0 0.799 -0.369 1.485 -1.013 1.883
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.799f,
                    dx2 = -0.369f,
                    dy2 = 1.485f,
                    dx3 = -1.013f,
                    dy3 = 1.883f,
                )
                // c -0.721 0.446 -1.832 0.4 -2.557 -0.004
                curveToRelative(
                    dx1 = -0.721f,
                    dy1 = 0.446f,
                    dx2 = -1.832f,
                    dy2 = 0.4f,
                    dx3 = -2.557f,
                    dy3 = -0.004f,
                )
                // c -0.886 -0.494 -1.337 -1.743 -1.034 -3.031
                curveToRelative(
                    dx1 = -0.886f,
                    dy1 = -0.494f,
                    dx2 = -1.337f,
                    dy2 = -1.743f,
                    dx3 = -1.034f,
                    dy3 = -3.031f,
                )
                // c 0.396 -1.674 1.836 -2.674 3.854 -2.674
                curveToRelative(
                    dx1 = 0.396f,
                    dy1 = -1.674f,
                    dx2 = 1.836f,
                    dy2 = -2.674f,
                    dx3 = 3.854f,
                    dy3 = -2.674f,
                )
                // c 1.844 0 3.251 1.011 3.764 2.704
                curveToRelative(
                    dx1 = 1.844f,
                    dy1 = 0.0f,
                    dx2 = 3.251f,
                    dy2 = 1.011f,
                    dx3 = 3.764f,
                    dy3 = 2.704f,
                )
                // c 0.602 1.986 -0.242 4.215 -2.051 5.421
                curveToRelative(
                    dx1 = 0.602f,
                    dy1 = 1.986f,
                    dx2 = -0.242f,
                    dy2 = 4.215f,
                    dx3 = -2.051f,
                    dy3 = 5.421f,
                )
                // c -2.173 1.449 -2.259 2.723 -2.261 2.779
                curveToRelative(
                    dx1 = -2.173f,
                    dy1 = 1.449f,
                    dx2 = -2.259f,
                    dy2 = 2.723f,
                    dx3 = -2.261f,
                    dy3 = 2.779f,
                )
                // c -0.018 0.402 -0.349 0.652 -0.75 0.652z
                curveToRelative(
                    dx1 = -0.018f,
                    dy1 = 0.402f,
                    dx2 = -0.349f,
                    dy2 = 0.652f,
                    dx3 = -0.75f,
                    dy3 = 0.652f,
                )
                close()
                // M 22 19
                moveTo(x = 22.0f, y = 19.0f)
                // L 6 19
                lineTo(x = 6.0f, y = 19.0f)
                // s -2 0 -2 2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = 2.0f,
                )
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // c 0 2 2 2 2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // v -5z
                verticalLineToRelative(dy = -5.0f)
                close()
                // M 27 19
                moveTo(x = 27.0f, y = 19.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // s 2 0 2 -2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // c 0 -2 -2 -2 -2 -2z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                    dx2 = -2.0f,
                    dy2 = -2.0f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                close()
            }
            // M18 0 C8.059 0 0 8.06 0 18 c0 9.941 8.059 18 18 18 s18 -8.059 18 -18 c0 -9.94 -8.059 -18 -18 -18z M34 18 c0 3.969 -1.453 7.592 -3.845 10.389 L7.612 5.845 C10.409 3.453 14.032 2 18 2 c8.837 0 16 7.164 16 16z M2 18 c0 -3.968 1.453 -7.591 3.844 -10.387 l22.543 22.543 C25.591 32.548 21.968 34 18 34 9.164 34 2 26.837 2 18z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 18 0
                moveTo(x = 18.0f, y = 0.0f)
                // C 8.059 0 0 8.06 0 18
                curveTo(
                    x1 = 8.059f,
                    y1 = 0.0f,
                    x2 = 0.0f,
                    y2 = 8.06f,
                    x3 = 0.0f,
                    y3 = 18.0f,
                )
                // c 0 9.941 8.059 18 18 18
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 9.941f,
                    dx2 = 8.059f,
                    dy2 = 18.0f,
                    dx3 = 18.0f,
                    dy3 = 18.0f,
                )
                // s 18 -8.059 18 -18
                reflectiveCurveToRelative(
                    dx1 = 18.0f,
                    dy1 = -8.059f,
                    dx2 = 18.0f,
                    dy2 = -18.0f,
                )
                // c 0 -9.94 -8.059 -18 -18 -18z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -9.94f,
                    dx2 = -8.059f,
                    dy2 = -18.0f,
                    dx3 = -18.0f,
                    dy3 = -18.0f,
                )
                close()
                // M 34 18
                moveTo(x = 34.0f, y = 18.0f)
                // c 0 3.969 -1.453 7.592 -3.845 10.389
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.969f,
                    dx2 = -1.453f,
                    dy2 = 7.592f,
                    dx3 = -3.845f,
                    dy3 = 10.389f,
                )
                // L 7.612 5.845
                lineTo(x = 7.612f, y = 5.845f)
                // C 10.409 3.453 14.032 2 18 2
                curveTo(
                    x1 = 10.409f,
                    y1 = 3.453f,
                    x2 = 14.032f,
                    y2 = 2.0f,
                    x3 = 18.0f,
                    y3 = 2.0f,
                )
                // c 8.837 0 16 7.164 16 16z
                curveToRelative(
                    dx1 = 8.837f,
                    dy1 = 0.0f,
                    dx2 = 16.0f,
                    dy2 = 7.164f,
                    dx3 = 16.0f,
                    dy3 = 16.0f,
                )
                close()
                // M 2 18
                moveTo(x = 2.0f, y = 18.0f)
                // c 0 -3.968 1.453 -7.591 3.844 -10.387
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.968f,
                    dx2 = 1.453f,
                    dy2 = -7.591f,
                    dx3 = 3.844f,
                    dy3 = -10.387f,
                )
                // l 22.543 22.543
                lineToRelative(dx = 22.543f, dy = 22.543f)
                // C 25.591 32.548 21.968 34 18 34
                curveTo(
                    x1 = 25.591f,
                    y1 = 32.548f,
                    x2 = 21.968f,
                    y2 = 34.0f,
                    x3 = 18.0f,
                    y3 = 34.0f,
                )
                // C 9.164 34 2 26.837 2 18z
                curveTo(
                    x1 = 9.164f,
                    y1 = 34.0f,
                    x2 = 2.0f,
                    y2 = 26.837f,
                    x3 = 2.0f,
                    y3 = 18.0f,
                )
                close()
            }
        }.build().also { _emoji1f6ad = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f6ad: ImageVector? = null
