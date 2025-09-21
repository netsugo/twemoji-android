package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f617: ImageVector
    get() {
        val current = _emoji1f617
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f617",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 18 c0 9.941 -8.059 18 -18 18 -9.94 0 -18 -8.059 -18 -18 C0 8.06 8.06 0 18 0 c9.941 0 18 8.06 18 18
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 36 18
                moveTo(x = 36.0f, y = 18.0f)
                // c 0 9.941 -8.059 18 -18 18
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 9.941f,
                    dx2 = -8.059f,
                    dy2 = 18.0f,
                    dx3 = -18.0f,
                    dy3 = 18.0f,
                )
                // c -9.94 0 -18 -8.059 -18 -18
                curveToRelative(
                    dx1 = -9.94f,
                    dy1 = 0.0f,
                    dx2 = -18.0f,
                    dy2 = -8.059f,
                    dx3 = -18.0f,
                    dy3 = -18.0f,
                )
                // C 0 8.06 8.06 0 18 0
                curveTo(
                    x1 = 0.0f,
                    y1 = 8.06f,
                    x2 = 8.06f,
                    y2 = 0.0f,
                    x3 = 18.0f,
                    y3 = 0.0f,
                )
                // c 9.941 0 18 8.06 18 18
                curveToRelative(
                    dx1 = 9.941f,
                    dy1 = 0.0f,
                    dx2 = 18.0f,
                    dy2 = 8.06f,
                    dx3 = 18.0f,
                    dy3 = 18.0f,
                )
            }
            // M10 15.5 a2.5 3.5 0 1 0 5 0 a2.5 3.5 0 1 0 -5 0z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 10 15.5
                moveTo(x = 10.0f, y = 15.5f)
                // a 2.5 3.5 0 1 0 5 0
                arcToRelative(
                    a = 2.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // a 2.5 3.5 0 1 0 -5 0z
                arcToRelative(
                    a = 2.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -5.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M21 15.5 a2.5 3.5 0 1 0 5 0 a2.5 3.5 0 1 0 -5 0z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 21 15.5
                moveTo(x = 21.0f, y = 15.5f)
                // a 2.5 3.5 0 1 0 5 0
                arcToRelative(
                    a = 2.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // a 2.5 3.5 0 1 0 -5 0z
                arcToRelative(
                    a = 2.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -5.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M20.871 28 c1.335 -0.412 2.629 -1.156 2.629 -2.5 0 -2.619 -4.912 -2.968 -5.472 -2.999 -0.274 -0.027 -0.509 0.193 -0.527 0.468 -0.017 0.274 0.19 0.511 0.464 0.53 0.035 0.002 3.535 0.299 3.535 2.001 s-3.5 1.999 -3.535 2.001 c-0.013 0.001 -0.023 0.008 -0.036 0.01 -0.053 0.006 -0.102 0.018 -0.149 0.041 l-0.015 0.009 c-0.048 0.027 -0.091 0.059 -0.127 0.1 -0.014 0.015 -0.023 0.031 -0.035 0.047 -0.023 0.032 -0.044 0.064 -0.06 0.103 -0.012 0.029 -0.018 0.061 -0.024 0.092 -0.004 0.023 -0.016 0.044 -0.018 0.067 0 0.011 0.004 0.021 0.004 0.031 s-0.005 0.021 -0.004 0.031 c0.001 0.024 0.013 0.045 0.018 0.068 0.006 0.031 0.011 0.061 0.023 0.09 0.013 0.03 0.031 0.057 0.049 0.084 0.017 0.024 0.032 0.05 0.052 0.071 0.023 0.023 0.05 0.041 0.078 0.061 0.024 0.017 0.046 0.034 0.074 0.047 0.032 0.015 0.066 0.021 0.101 0.027 0.024 0.006 0.044 0.018 0.069 0.02 0.035 0.001 3.535 0.298 3.535 2 s-3.5 1.999 -3.535 2.001 c-0.274 0.02 -0.481 0.257 -0.464 0.53 0.017 0.265 0.237 0.469 0.499 0.469 l0.028 -0.001 c0.56 -0.031 5.472 -0.38 5.472 -2.999 0 -1.344 -1.294 -2.088 -2.629 -2.5z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 20.871 28
                moveTo(x = 20.871f, y = 28.0f)
                // c 1.335 -0.412 2.629 -1.156 2.629 -2.5
                curveToRelative(
                    dx1 = 1.335f,
                    dy1 = -0.412f,
                    dx2 = 2.629f,
                    dy2 = -1.156f,
                    dx3 = 2.629f,
                    dy3 = -2.5f,
                )
                // c 0 -2.619 -4.912 -2.968 -5.472 -2.999
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.619f,
                    dx2 = -4.912f,
                    dy2 = -2.968f,
                    dx3 = -5.472f,
                    dy3 = -2.999f,
                )
                // c -0.274 -0.027 -0.509 0.193 -0.527 0.468
                curveToRelative(
                    dx1 = -0.274f,
                    dy1 = -0.027f,
                    dx2 = -0.509f,
                    dy2 = 0.193f,
                    dx3 = -0.527f,
                    dy3 = 0.468f,
                )
                // c -0.017 0.274 0.19 0.511 0.464 0.53
                curveToRelative(
                    dx1 = -0.017f,
                    dy1 = 0.274f,
                    dx2 = 0.19f,
                    dy2 = 0.511f,
                    dx3 = 0.464f,
                    dy3 = 0.53f,
                )
                // c 0.035 0.002 3.535 0.299 3.535 2.001
                curveToRelative(
                    dx1 = 0.035f,
                    dy1 = 0.002f,
                    dx2 = 3.535f,
                    dy2 = 0.299f,
                    dx3 = 3.535f,
                    dy3 = 2.001f,
                )
                // s -3.5 1.999 -3.535 2.001
                reflectiveCurveToRelative(
                    dx1 = -3.5f,
                    dy1 = 1.999f,
                    dx2 = -3.535f,
                    dy2 = 2.001f,
                )
                // c -0.013 0.001 -0.023 0.008 -0.036 0.01
                curveToRelative(
                    dx1 = -0.013f,
                    dy1 = 0.001f,
                    dx2 = -0.023f,
                    dy2 = 0.008f,
                    dx3 = -0.036f,
                    dy3 = 0.01f,
                )
                // c -0.053 0.006 -0.102 0.018 -0.149 0.041
                curveToRelative(
                    dx1 = -0.053f,
                    dy1 = 0.006f,
                    dx2 = -0.102f,
                    dy2 = 0.018f,
                    dx3 = -0.149f,
                    dy3 = 0.041f,
                )
                // l -0.015 0.009
                lineToRelative(dx = -0.015f, dy = 0.009f)
                // c -0.048 0.027 -0.091 0.059 -0.127 0.1
                curveToRelative(
                    dx1 = -0.048f,
                    dy1 = 0.027f,
                    dx2 = -0.091f,
                    dy2 = 0.059f,
                    dx3 = -0.127f,
                    dy3 = 0.1f,
                )
                // c -0.014 0.015 -0.023 0.031 -0.035 0.047
                curveToRelative(
                    dx1 = -0.014f,
                    dy1 = 0.015f,
                    dx2 = -0.023f,
                    dy2 = 0.031f,
                    dx3 = -0.035f,
                    dy3 = 0.047f,
                )
                // c -0.023 0.032 -0.044 0.064 -0.06 0.103
                curveToRelative(
                    dx1 = -0.023f,
                    dy1 = 0.032f,
                    dx2 = -0.044f,
                    dy2 = 0.064f,
                    dx3 = -0.06f,
                    dy3 = 0.103f,
                )
                // c -0.012 0.029 -0.018 0.061 -0.024 0.092
                curveToRelative(
                    dx1 = -0.012f,
                    dy1 = 0.029f,
                    dx2 = -0.018f,
                    dy2 = 0.061f,
                    dx3 = -0.024f,
                    dy3 = 0.092f,
                )
                // c -0.004 0.023 -0.016 0.044 -0.018 0.067
                curveToRelative(
                    dx1 = -0.004f,
                    dy1 = 0.023f,
                    dx2 = -0.016f,
                    dy2 = 0.044f,
                    dx3 = -0.018f,
                    dy3 = 0.067f,
                )
                // c 0 0.011 0.004 0.021 0.004 0.031
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.011f,
                    dx2 = 0.004f,
                    dy2 = 0.021f,
                    dx3 = 0.004f,
                    dy3 = 0.031f,
                )
                // s -0.005 0.021 -0.004 0.031
                reflectiveCurveToRelative(
                    dx1 = -0.005f,
                    dy1 = 0.021f,
                    dx2 = -0.004f,
                    dy2 = 0.031f,
                )
                // c 0.001 0.024 0.013 0.045 0.018 0.068
                curveToRelative(
                    dx1 = 0.001f,
                    dy1 = 0.024f,
                    dx2 = 0.013f,
                    dy2 = 0.045f,
                    dx3 = 0.018f,
                    dy3 = 0.068f,
                )
                // c 0.006 0.031 0.011 0.061 0.023 0.09
                curveToRelative(
                    dx1 = 0.006f,
                    dy1 = 0.031f,
                    dx2 = 0.011f,
                    dy2 = 0.061f,
                    dx3 = 0.023f,
                    dy3 = 0.09f,
                )
                // c 0.013 0.03 0.031 0.057 0.049 0.084
                curveToRelative(
                    dx1 = 0.013f,
                    dy1 = 0.03f,
                    dx2 = 0.031f,
                    dy2 = 0.057f,
                    dx3 = 0.049f,
                    dy3 = 0.084f,
                )
                // c 0.017 0.024 0.032 0.05 0.052 0.071
                curveToRelative(
                    dx1 = 0.017f,
                    dy1 = 0.024f,
                    dx2 = 0.032f,
                    dy2 = 0.05f,
                    dx3 = 0.052f,
                    dy3 = 0.071f,
                )
                // c 0.023 0.023 0.05 0.041 0.078 0.061
                curveToRelative(
                    dx1 = 0.023f,
                    dy1 = 0.023f,
                    dx2 = 0.05f,
                    dy2 = 0.041f,
                    dx3 = 0.078f,
                    dy3 = 0.061f,
                )
                // c 0.024 0.017 0.046 0.034 0.074 0.047
                curveToRelative(
                    dx1 = 0.024f,
                    dy1 = 0.017f,
                    dx2 = 0.046f,
                    dy2 = 0.034f,
                    dx3 = 0.074f,
                    dy3 = 0.047f,
                )
                // c 0.032 0.015 0.066 0.021 0.101 0.027
                curveToRelative(
                    dx1 = 0.032f,
                    dy1 = 0.015f,
                    dx2 = 0.066f,
                    dy2 = 0.021f,
                    dx3 = 0.101f,
                    dy3 = 0.027f,
                )
                // c 0.024 0.006 0.044 0.018 0.069 0.02
                curveToRelative(
                    dx1 = 0.024f,
                    dy1 = 0.006f,
                    dx2 = 0.044f,
                    dy2 = 0.018f,
                    dx3 = 0.069f,
                    dy3 = 0.02f,
                )
                // c 0.035 0.001 3.535 0.298 3.535 2
                curveToRelative(
                    dx1 = 0.035f,
                    dy1 = 0.001f,
                    dx2 = 3.535f,
                    dy2 = 0.298f,
                    dx3 = 3.535f,
                    dy3 = 2.0f,
                )
                // s -3.5 1.999 -3.535 2.001
                reflectiveCurveToRelative(
                    dx1 = -3.5f,
                    dy1 = 1.999f,
                    dx2 = -3.535f,
                    dy2 = 2.001f,
                )
                // c -0.274 0.02 -0.481 0.257 -0.464 0.53
                curveToRelative(
                    dx1 = -0.274f,
                    dy1 = 0.02f,
                    dx2 = -0.481f,
                    dy2 = 0.257f,
                    dx3 = -0.464f,
                    dy3 = 0.53f,
                )
                // c 0.017 0.265 0.237 0.469 0.499 0.469
                curveToRelative(
                    dx1 = 0.017f,
                    dy1 = 0.265f,
                    dx2 = 0.237f,
                    dy2 = 0.469f,
                    dx3 = 0.499f,
                    dy3 = 0.469f,
                )
                // l 0.028 -0.001
                lineToRelative(dx = 0.028f, dy = -0.001f)
                // c 0.56 -0.031 5.472 -0.38 5.472 -2.999
                curveToRelative(
                    dx1 = 0.56f,
                    dy1 = -0.031f,
                    dx2 = 5.472f,
                    dy2 = -0.38f,
                    dx3 = 5.472f,
                    dy3 = -2.999f,
                )
                // c 0 -1.344 -1.294 -2.088 -2.629 -2.5z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.344f,
                    dx2 = -1.294f,
                    dy2 = -2.088f,
                    dx3 = -2.629f,
                    dy3 = -2.5f,
                )
                close()
            }
        }.build().also { _emoji1f617 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f617: ImageVector? = null
