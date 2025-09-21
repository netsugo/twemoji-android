package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f61a: ImageVector
    get() {
        val current = _emoji1f61a
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f61a",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 18 c0 9.941 -8.059 18 -18 18 S0 27.941 0 18 8.059 0 18 0 s18 8.059 18 18
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
                // S 0 27.941 0 18
                reflectiveCurveTo(
                    x1 = 0.0f,
                    y1 = 27.941f,
                    x2 = 0.0f,
                    y2 = 18.0f,
                )
                // S 8.059 0 18 0
                reflectiveCurveTo(
                    x1 = 8.059f,
                    y1 = 0.0f,
                    x2 = 18.0f,
                    y2 = 0.0f,
                )
                // s 18 8.059 18 18
                reflectiveCurveToRelative(
                    dx1 = 18.0f,
                    dy1 = 8.059f,
                    dx2 = 18.0f,
                    dy2 = 18.0f,
                )
            }
            // M7 21 m-5 0 a5 5 0 1 1 10 0 a5 5 0 1 1 -10 0
            path(
                fill = SolidColor(Color(0xFFFF7892)),
            ) {
                // M 7 21
                moveTo(x = 7.0f, y = 21.0f)
                // m -5 0
                moveToRelative(dx = -5.0f, dy = 0.0f)
                // a 5 5 0 1 1 10 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 10.0f,
                    dy1 = 0.0f,
                )
                // a 5 5 0 1 1 -10 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -10.0f,
                    dy1 = 0.0f,
                )
            }
            // M29 21 m-5 0 a5 5 0 1 1 10 0 a5 5 0 1 1 -10 0
            path(
                fill = SolidColor(Color(0xFFFF7892)),
            ) {
                // M 29 21
                moveTo(x = 29.0f, y = 21.0f)
                // m -5 0
                moveToRelative(dx = -5.0f, dy = 0.0f)
                // a 5 5 0 1 1 10 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 10.0f,
                    dy1 = 0.0f,
                )
                // a 5 5 0 1 1 -10 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -10.0f,
                    dy1 = 0.0f,
                )
            }
            // M28.416 17.723 C28.355 17.632 26.901 15.5 24 15.5 c-2.9 0 -4.355 2.132 -4.416 2.223 -0.135 0.202 -0.104 0.47 0.071 0.638 0.174 0.167 0.446 0.185 0.643 0.042 0.012 -0.01 1.262 -0.903 3.702 -0.903 2.426 0 3.674 0.881 3.702 0.901 0.089 0.066 0.194 0.099 0.298 0.099 0.124 0 0.248 -0.046 0.344 -0.137 0.177 -0.167 0.207 -0.438 0.072 -0.64z M12 15.5 c-2.9 0 -4.355 2.132 -4.416 2.223 -0.134 0.202 -0.104 0.47 0.071 0.638 0.175 0.167 0.447 0.185 0.642 0.042 0.013 -0.01 1.262 -0.903 3.703 -0.903 2.426 0 3.674 0.881 3.702 0.901 0.089 0.066 0.194 0.099 0.298 0.099 0.124 0 0.248 -0.046 0.344 -0.137 0.177 -0.167 0.208 -0.438 0.072 -0.641 -0.061 -0.09 -1.515 -2.222 -4.416 -2.222z M21.871 27 c1.335 -0.412 2.629 -1.156 2.629 -2.5 0 -2.619 -4.912 -2.968 -5.473 -2.999 -0.277 -0.036 -0.51 0.194 -0.526 0.468 -0.017 0.274 0.19 0.511 0.464 0.53 0.035 0.002 3.535 0.299 3.535 2.001 s-3.5 1.999 -3.535 2.001 c-0.01 0.001 -0.017 0.006 -0.026 0.007 -0.124 0.008 -0.23 0.065 -0.31 0.159 l-0.015 0.021 c-0.029 0.039 -0.055 0.078 -0.073 0.125 -0.011 0.027 -0.016 0.057 -0.021 0.086 -0.005 0.024 -0.017 0.046 -0.019 0.07 -0.001 0.01 0.004 0.02 0.004 0.031 s-0.005 0.021 -0.004 0.031 c0.002 0.025 0.013 0.046 0.019 0.07 0.006 0.029 0.011 0.059 0.022 0.087 0.013 0.032 0.032 0.06 0.051 0.088 0.017 0.023 0.03 0.047 0.05 0.067 0.023 0.024 0.052 0.043 0.081 0.062 0.024 0.017 0.045 0.033 0.071 0.046 0.031 0.015 0.065 0.021 0.101 0.027 0.023 0.006 0.044 0.018 0.069 0.02 0.035 0.003 3.535 0.3 3.535 2.002 s-3.5 1.999 -3.535 2.001 c-0.273 0.02 -0.481 0.257 -0.464 0.53 0.017 0.265 0.236 0.469 0.499 0.469 l0.027 -0.001 c0.561 -0.031 5.473 -0.38 5.473 -2.999 0 -1.344 -1.294 -2.088 -2.629 -2.5z M31.001 16 c-0.305 0 -0.604 -0.138 -0.801 -0.4 -2.641 -3.521 -6.061 -3.599 -6.206 -3.6 -0.55 -0.006 -0.994 -0.456 -0.991 -1.005 0.003 -0.551 0.447 -0.995 0.997 -0.995 0.184 0 4.537 0.05 7.8 4.4 0.332 0.442 0.242 1.069 -0.2 1.4 -0.18 0.135 -0.39 0.2 -0.599 0.2z M4.999 16 c-0.208 0 -0.419 -0.065 -0.599 -0.2 -0.442 -0.331 -0.531 -0.958 -0.2 -1.4 C7.462 10.05 11.816 10 12 10 c0.552 0 1 0.448 1 1 0 0.551 -0.445 0.998 -0.996 1 -0.156 0.002 -3.569 0.086 -6.205 3.6 -0.195 0.262 -0.496 0.4 -0.8 0.4z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 28.416 17.723
                moveTo(x = 28.416f, y = 17.723f)
                // C 28.355 17.632 26.901 15.5 24 15.5
                curveTo(
                    x1 = 28.355f,
                    y1 = 17.632f,
                    x2 = 26.901f,
                    y2 = 15.5f,
                    x3 = 24.0f,
                    y3 = 15.5f,
                )
                // c -2.9 0 -4.355 2.132 -4.416 2.223
                curveToRelative(
                    dx1 = -2.9f,
                    dy1 = 0.0f,
                    dx2 = -4.355f,
                    dy2 = 2.132f,
                    dx3 = -4.416f,
                    dy3 = 2.223f,
                )
                // c -0.135 0.202 -0.104 0.47 0.071 0.638
                curveToRelative(
                    dx1 = -0.135f,
                    dy1 = 0.202f,
                    dx2 = -0.104f,
                    dy2 = 0.47f,
                    dx3 = 0.071f,
                    dy3 = 0.638f,
                )
                // c 0.174 0.167 0.446 0.185 0.643 0.042
                curveToRelative(
                    dx1 = 0.174f,
                    dy1 = 0.167f,
                    dx2 = 0.446f,
                    dy2 = 0.185f,
                    dx3 = 0.643f,
                    dy3 = 0.042f,
                )
                // c 0.012 -0.01 1.262 -0.903 3.702 -0.903
                curveToRelative(
                    dx1 = 0.012f,
                    dy1 = -0.01f,
                    dx2 = 1.262f,
                    dy2 = -0.903f,
                    dx3 = 3.702f,
                    dy3 = -0.903f,
                )
                // c 2.426 0 3.674 0.881 3.702 0.901
                curveToRelative(
                    dx1 = 2.426f,
                    dy1 = 0.0f,
                    dx2 = 3.674f,
                    dy2 = 0.881f,
                    dx3 = 3.702f,
                    dy3 = 0.901f,
                )
                // c 0.089 0.066 0.194 0.099 0.298 0.099
                curveToRelative(
                    dx1 = 0.089f,
                    dy1 = 0.066f,
                    dx2 = 0.194f,
                    dy2 = 0.099f,
                    dx3 = 0.298f,
                    dy3 = 0.099f,
                )
                // c 0.124 0 0.248 -0.046 0.344 -0.137
                curveToRelative(
                    dx1 = 0.124f,
                    dy1 = 0.0f,
                    dx2 = 0.248f,
                    dy2 = -0.046f,
                    dx3 = 0.344f,
                    dy3 = -0.137f,
                )
                // c 0.177 -0.167 0.207 -0.438 0.072 -0.64z
                curveToRelative(
                    dx1 = 0.177f,
                    dy1 = -0.167f,
                    dx2 = 0.207f,
                    dy2 = -0.438f,
                    dx3 = 0.072f,
                    dy3 = -0.64f,
                )
                close()
                // M 12 15.5
                moveTo(x = 12.0f, y = 15.5f)
                // c -2.9 0 -4.355 2.132 -4.416 2.223
                curveToRelative(
                    dx1 = -2.9f,
                    dy1 = 0.0f,
                    dx2 = -4.355f,
                    dy2 = 2.132f,
                    dx3 = -4.416f,
                    dy3 = 2.223f,
                )
                // c -0.134 0.202 -0.104 0.47 0.071 0.638
                curveToRelative(
                    dx1 = -0.134f,
                    dy1 = 0.202f,
                    dx2 = -0.104f,
                    dy2 = 0.47f,
                    dx3 = 0.071f,
                    dy3 = 0.638f,
                )
                // c 0.175 0.167 0.447 0.185 0.642 0.042
                curveToRelative(
                    dx1 = 0.175f,
                    dy1 = 0.167f,
                    dx2 = 0.447f,
                    dy2 = 0.185f,
                    dx3 = 0.642f,
                    dy3 = 0.042f,
                )
                // c 0.013 -0.01 1.262 -0.903 3.703 -0.903
                curveToRelative(
                    dx1 = 0.013f,
                    dy1 = -0.01f,
                    dx2 = 1.262f,
                    dy2 = -0.903f,
                    dx3 = 3.703f,
                    dy3 = -0.903f,
                )
                // c 2.426 0 3.674 0.881 3.702 0.901
                curveToRelative(
                    dx1 = 2.426f,
                    dy1 = 0.0f,
                    dx2 = 3.674f,
                    dy2 = 0.881f,
                    dx3 = 3.702f,
                    dy3 = 0.901f,
                )
                // c 0.089 0.066 0.194 0.099 0.298 0.099
                curveToRelative(
                    dx1 = 0.089f,
                    dy1 = 0.066f,
                    dx2 = 0.194f,
                    dy2 = 0.099f,
                    dx3 = 0.298f,
                    dy3 = 0.099f,
                )
                // c 0.124 0 0.248 -0.046 0.344 -0.137
                curveToRelative(
                    dx1 = 0.124f,
                    dy1 = 0.0f,
                    dx2 = 0.248f,
                    dy2 = -0.046f,
                    dx3 = 0.344f,
                    dy3 = -0.137f,
                )
                // c 0.177 -0.167 0.208 -0.438 0.072 -0.641
                curveToRelative(
                    dx1 = 0.177f,
                    dy1 = -0.167f,
                    dx2 = 0.208f,
                    dy2 = -0.438f,
                    dx3 = 0.072f,
                    dy3 = -0.641f,
                )
                // c -0.061 -0.09 -1.515 -2.222 -4.416 -2.222z
                curveToRelative(
                    dx1 = -0.061f,
                    dy1 = -0.09f,
                    dx2 = -1.515f,
                    dy2 = -2.222f,
                    dx3 = -4.416f,
                    dy3 = -2.222f,
                )
                close()
                // M 21.871 27
                moveTo(x = 21.871f, y = 27.0f)
                // c 1.335 -0.412 2.629 -1.156 2.629 -2.5
                curveToRelative(
                    dx1 = 1.335f,
                    dy1 = -0.412f,
                    dx2 = 2.629f,
                    dy2 = -1.156f,
                    dx3 = 2.629f,
                    dy3 = -2.5f,
                )
                // c 0 -2.619 -4.912 -2.968 -5.473 -2.999
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.619f,
                    dx2 = -4.912f,
                    dy2 = -2.968f,
                    dx3 = -5.473f,
                    dy3 = -2.999f,
                )
                // c -0.277 -0.036 -0.51 0.194 -0.526 0.468
                curveToRelative(
                    dx1 = -0.277f,
                    dy1 = -0.036f,
                    dx2 = -0.51f,
                    dy2 = 0.194f,
                    dx3 = -0.526f,
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
                // c -0.01 0.001 -0.017 0.006 -0.026 0.007
                curveToRelative(
                    dx1 = -0.01f,
                    dy1 = 0.001f,
                    dx2 = -0.017f,
                    dy2 = 0.006f,
                    dx3 = -0.026f,
                    dy3 = 0.007f,
                )
                // c -0.124 0.008 -0.23 0.065 -0.31 0.159
                curveToRelative(
                    dx1 = -0.124f,
                    dy1 = 0.008f,
                    dx2 = -0.23f,
                    dy2 = 0.065f,
                    dx3 = -0.31f,
                    dy3 = 0.159f,
                )
                // l -0.015 0.021
                lineToRelative(dx = -0.015f, dy = 0.021f)
                // c -0.029 0.039 -0.055 0.078 -0.073 0.125
                curveToRelative(
                    dx1 = -0.029f,
                    dy1 = 0.039f,
                    dx2 = -0.055f,
                    dy2 = 0.078f,
                    dx3 = -0.073f,
                    dy3 = 0.125f,
                )
                // c -0.011 0.027 -0.016 0.057 -0.021 0.086
                curveToRelative(
                    dx1 = -0.011f,
                    dy1 = 0.027f,
                    dx2 = -0.016f,
                    dy2 = 0.057f,
                    dx3 = -0.021f,
                    dy3 = 0.086f,
                )
                // c -0.005 0.024 -0.017 0.046 -0.019 0.07
                curveToRelative(
                    dx1 = -0.005f,
                    dy1 = 0.024f,
                    dx2 = -0.017f,
                    dy2 = 0.046f,
                    dx3 = -0.019f,
                    dy3 = 0.07f,
                )
                // c -0.001 0.01 0.004 0.02 0.004 0.031
                curveToRelative(
                    dx1 = -0.001f,
                    dy1 = 0.01f,
                    dx2 = 0.004f,
                    dy2 = 0.02f,
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
                // c 0.002 0.025 0.013 0.046 0.019 0.07
                curveToRelative(
                    dx1 = 0.002f,
                    dy1 = 0.025f,
                    dx2 = 0.013f,
                    dy2 = 0.046f,
                    dx3 = 0.019f,
                    dy3 = 0.07f,
                )
                // c 0.006 0.029 0.011 0.059 0.022 0.087
                curveToRelative(
                    dx1 = 0.006f,
                    dy1 = 0.029f,
                    dx2 = 0.011f,
                    dy2 = 0.059f,
                    dx3 = 0.022f,
                    dy3 = 0.087f,
                )
                // c 0.013 0.032 0.032 0.06 0.051 0.088
                curveToRelative(
                    dx1 = 0.013f,
                    dy1 = 0.032f,
                    dx2 = 0.032f,
                    dy2 = 0.06f,
                    dx3 = 0.051f,
                    dy3 = 0.088f,
                )
                // c 0.017 0.023 0.03 0.047 0.05 0.067
                curveToRelative(
                    dx1 = 0.017f,
                    dy1 = 0.023f,
                    dx2 = 0.03f,
                    dy2 = 0.047f,
                    dx3 = 0.05f,
                    dy3 = 0.067f,
                )
                // c 0.023 0.024 0.052 0.043 0.081 0.062
                curveToRelative(
                    dx1 = 0.023f,
                    dy1 = 0.024f,
                    dx2 = 0.052f,
                    dy2 = 0.043f,
                    dx3 = 0.081f,
                    dy3 = 0.062f,
                )
                // c 0.024 0.017 0.045 0.033 0.071 0.046
                curveToRelative(
                    dx1 = 0.024f,
                    dy1 = 0.017f,
                    dx2 = 0.045f,
                    dy2 = 0.033f,
                    dx3 = 0.071f,
                    dy3 = 0.046f,
                )
                // c 0.031 0.015 0.065 0.021 0.101 0.027
                curveToRelative(
                    dx1 = 0.031f,
                    dy1 = 0.015f,
                    dx2 = 0.065f,
                    dy2 = 0.021f,
                    dx3 = 0.101f,
                    dy3 = 0.027f,
                )
                // c 0.023 0.006 0.044 0.018 0.069 0.02
                curveToRelative(
                    dx1 = 0.023f,
                    dy1 = 0.006f,
                    dx2 = 0.044f,
                    dy2 = 0.018f,
                    dx3 = 0.069f,
                    dy3 = 0.02f,
                )
                // c 0.035 0.003 3.535 0.3 3.535 2.002
                curveToRelative(
                    dx1 = 0.035f,
                    dy1 = 0.003f,
                    dx2 = 3.535f,
                    dy2 = 0.3f,
                    dx3 = 3.535f,
                    dy3 = 2.002f,
                )
                // s -3.5 1.999 -3.535 2.001
                reflectiveCurveToRelative(
                    dx1 = -3.5f,
                    dy1 = 1.999f,
                    dx2 = -3.535f,
                    dy2 = 2.001f,
                )
                // c -0.273 0.02 -0.481 0.257 -0.464 0.53
                curveToRelative(
                    dx1 = -0.273f,
                    dy1 = 0.02f,
                    dx2 = -0.481f,
                    dy2 = 0.257f,
                    dx3 = -0.464f,
                    dy3 = 0.53f,
                )
                // c 0.017 0.265 0.236 0.469 0.499 0.469
                curveToRelative(
                    dx1 = 0.017f,
                    dy1 = 0.265f,
                    dx2 = 0.236f,
                    dy2 = 0.469f,
                    dx3 = 0.499f,
                    dy3 = 0.469f,
                )
                // l 0.027 -0.001
                lineToRelative(dx = 0.027f, dy = -0.001f)
                // c 0.561 -0.031 5.473 -0.38 5.473 -2.999
                curveToRelative(
                    dx1 = 0.561f,
                    dy1 = -0.031f,
                    dx2 = 5.473f,
                    dy2 = -0.38f,
                    dx3 = 5.473f,
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
                // M 31.001 16
                moveTo(x = 31.001f, y = 16.0f)
                // c -0.305 0 -0.604 -0.138 -0.801 -0.4
                curveToRelative(
                    dx1 = -0.305f,
                    dy1 = 0.0f,
                    dx2 = -0.604f,
                    dy2 = -0.138f,
                    dx3 = -0.801f,
                    dy3 = -0.4f,
                )
                // c -2.641 -3.521 -6.061 -3.599 -6.206 -3.6
                curveToRelative(
                    dx1 = -2.641f,
                    dy1 = -3.521f,
                    dx2 = -6.061f,
                    dy2 = -3.599f,
                    dx3 = -6.206f,
                    dy3 = -3.6f,
                )
                // c -0.55 -0.006 -0.994 -0.456 -0.991 -1.005
                curveToRelative(
                    dx1 = -0.55f,
                    dy1 = -0.006f,
                    dx2 = -0.994f,
                    dy2 = -0.456f,
                    dx3 = -0.991f,
                    dy3 = -1.005f,
                )
                // c 0.003 -0.551 0.447 -0.995 0.997 -0.995
                curveToRelative(
                    dx1 = 0.003f,
                    dy1 = -0.551f,
                    dx2 = 0.447f,
                    dy2 = -0.995f,
                    dx3 = 0.997f,
                    dy3 = -0.995f,
                )
                // c 0.184 0 4.537 0.05 7.8 4.4
                curveToRelative(
                    dx1 = 0.184f,
                    dy1 = 0.0f,
                    dx2 = 4.537f,
                    dy2 = 0.05f,
                    dx3 = 7.8f,
                    dy3 = 4.4f,
                )
                // c 0.332 0.442 0.242 1.069 -0.2 1.4
                curveToRelative(
                    dx1 = 0.332f,
                    dy1 = 0.442f,
                    dx2 = 0.242f,
                    dy2 = 1.069f,
                    dx3 = -0.2f,
                    dy3 = 1.4f,
                )
                // c -0.18 0.135 -0.39 0.2 -0.599 0.2z
                curveToRelative(
                    dx1 = -0.18f,
                    dy1 = 0.135f,
                    dx2 = -0.39f,
                    dy2 = 0.2f,
                    dx3 = -0.599f,
                    dy3 = 0.2f,
                )
                close()
                // M 4.999 16
                moveTo(x = 4.999f, y = 16.0f)
                // c -0.208 0 -0.419 -0.065 -0.599 -0.2
                curveToRelative(
                    dx1 = -0.208f,
                    dy1 = 0.0f,
                    dx2 = -0.419f,
                    dy2 = -0.065f,
                    dx3 = -0.599f,
                    dy3 = -0.2f,
                )
                // c -0.442 -0.331 -0.531 -0.958 -0.2 -1.4
                curveToRelative(
                    dx1 = -0.442f,
                    dy1 = -0.331f,
                    dx2 = -0.531f,
                    dy2 = -0.958f,
                    dx3 = -0.2f,
                    dy3 = -1.4f,
                )
                // C 7.462 10.05 11.816 10 12 10
                curveTo(
                    x1 = 7.462f,
                    y1 = 10.05f,
                    x2 = 11.816f,
                    y2 = 10.0f,
                    x3 = 12.0f,
                    y3 = 10.0f,
                )
                // c 0.552 0 1 0.448 1 1
                curveToRelative(
                    dx1 = 0.552f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.448f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // c 0 0.551 -0.445 0.998 -0.996 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.551f,
                    dx2 = -0.445f,
                    dy2 = 0.998f,
                    dx3 = -0.996f,
                    dy3 = 1.0f,
                )
                // c -0.156 0.002 -3.569 0.086 -6.205 3.6
                curveToRelative(
                    dx1 = -0.156f,
                    dy1 = 0.002f,
                    dx2 = -3.569f,
                    dy2 = 0.086f,
                    dx3 = -6.205f,
                    dy3 = 3.6f,
                )
                // c -0.195 0.262 -0.496 0.4 -0.8 0.4z
                curveToRelative(
                    dx1 = -0.195f,
                    dy1 = 0.262f,
                    dx2 = -0.496f,
                    dy2 = 0.4f,
                    dx3 = -0.8f,
                    dy3 = 0.4f,
                )
                close()
            }
        }.build().also { _emoji1f61a = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f61a: ImageVector? = null
