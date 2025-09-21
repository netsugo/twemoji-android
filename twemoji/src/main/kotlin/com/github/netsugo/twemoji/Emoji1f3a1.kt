package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f3a1: ImageVector
    get() {
        val current = _emoji1f3a1
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f3a1",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M30.806 15.347 H19.201 l8.205 -8.205 -0.707 -0.707 -8.205 8.205 V3.036 h-1 V14.64 L9.288 6.435 l-0.707 0.707 8.206 8.205 H5.182 v1 h11.605 l-8.206 8.206 0.707 0.707 8.206 -8.206 v11.605 h1 V17.055 l8.205 8.205 0.707 -0.707 -8.205 -8.206 h11.605z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 30.806 15.347
                moveTo(x = 30.806f, y = 15.347f)
                // H 19.201
                horizontalLineTo(x = 19.201f)
                // l 8.205 -8.205
                lineToRelative(dx = 8.205f, dy = -8.205f)
                // l -0.707 -0.707
                lineToRelative(dx = -0.707f, dy = -0.707f)
                // l -8.205 8.205
                lineToRelative(dx = -8.205f, dy = 8.205f)
                // V 3.036
                verticalLineTo(y = 3.036f)
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // V 14.64
                verticalLineTo(y = 14.64f)
                // L 9.288 6.435
                lineTo(x = 9.288f, y = 6.435f)
                // l -0.707 0.707
                lineToRelative(dx = -0.707f, dy = 0.707f)
                // l 8.206 8.205
                lineToRelative(dx = 8.206f, dy = 8.205f)
                // H 5.182
                horizontalLineTo(x = 5.182f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // h 11.605
                horizontalLineToRelative(dx = 11.605f)
                // l -8.206 8.206
                lineToRelative(dx = -8.206f, dy = 8.206f)
                // l 0.707 0.707
                lineToRelative(dx = 0.707f, dy = 0.707f)
                // l 8.206 -8.206
                lineToRelative(dx = 8.206f, dy = -8.206f)
                // v 11.605
                verticalLineToRelative(dy = 11.605f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // V 17.055
                verticalLineTo(y = 17.055f)
                // l 8.205 8.205
                lineToRelative(dx = 8.205f, dy = 8.205f)
                // l 0.707 -0.707
                lineToRelative(dx = 0.707f, dy = -0.707f)
                // l -8.205 -8.206
                lineToRelative(dx = -8.205f, dy = -8.206f)
                // h 11.605z
                horizontalLineToRelative(dx = 11.605f)
                close()
            }
            // M17.994 1.394 c-7.982 0 -14.453 6.471 -14.453 14.453 0 7.982 6.471 14.453 14.453 14.453 7.983 0 14.454 -6.471 14.454 -14.453 -0.001 -7.982 -6.472 -14.453 -14.454 -14.453z M17.994 28.077 c-6.755 0 -12.23 -5.475 -12.23 -12.23 s5.475 -12.23 12.23 -12.23 c6.754 0 12.23 5.475 12.23 12.23 s-5.475 12.23 -12.23 12.23z
            path(
                fill = SolidColor(Color(0xFFAAB8C2)),
            ) {
                // M 17.994 1.394
                moveTo(x = 17.994f, y = 1.394f)
                // c -7.982 0 -14.453 6.471 -14.453 14.453
                curveToRelative(
                    dx1 = -7.982f,
                    dy1 = 0.0f,
                    dx2 = -14.453f,
                    dy2 = 6.471f,
                    dx3 = -14.453f,
                    dy3 = 14.453f,
                )
                // c 0 7.982 6.471 14.453 14.453 14.453
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 7.982f,
                    dx2 = 6.471f,
                    dy2 = 14.453f,
                    dx3 = 14.453f,
                    dy3 = 14.453f,
                )
                // c 7.983 0 14.454 -6.471 14.454 -14.453
                curveToRelative(
                    dx1 = 7.983f,
                    dy1 = 0.0f,
                    dx2 = 14.454f,
                    dy2 = -6.471f,
                    dx3 = 14.454f,
                    dy3 = -14.453f,
                )
                // c -0.001 -7.982 -6.472 -14.453 -14.454 -14.453z
                curveToRelative(
                    dx1 = -0.001f,
                    dy1 = -7.982f,
                    dx2 = -6.472f,
                    dy2 = -14.453f,
                    dx3 = -14.454f,
                    dy3 = -14.453f,
                )
                close()
                // M 17.994 28.077
                moveTo(x = 17.994f, y = 28.077f)
                // c -6.755 0 -12.23 -5.475 -12.23 -12.23
                curveToRelative(
                    dx1 = -6.755f,
                    dy1 = 0.0f,
                    dx2 = -12.23f,
                    dy2 = -5.475f,
                    dx3 = -12.23f,
                    dy3 = -12.23f,
                )
                // s 5.475 -12.23 12.23 -12.23
                reflectiveCurveToRelative(
                    dx1 = 5.475f,
                    dy1 = -12.23f,
                    dx2 = 12.23f,
                    dy2 = -12.23f,
                )
                // c 6.754 0 12.23 5.475 12.23 12.23
                curveToRelative(
                    dx1 = 6.754f,
                    dy1 = 0.0f,
                    dx2 = 12.23f,
                    dy2 = 5.475f,
                    dx3 = 12.23f,
                    dy3 = 12.23f,
                )
                // s -5.475 12.23 -12.23 12.23z
                reflectiveCurveToRelative(
                    dx1 = -5.475f,
                    dy1 = 12.23f,
                    dx2 = -12.23f,
                    dy2 = 12.23f,
                )
                close()
            }
            // M17.993 23.374 c-4.15 0 -7.526 -3.377 -7.526 -7.527 s3.376 -7.526 7.526 -7.526 c4.151 0 7.528 3.376 7.528 7.526 s-3.376 7.527 -7.528 7.527z M17.993 9.821 c-3.323 0 -6.026 2.704 -6.026 6.026 s2.704 6.027 6.026 6.027 c3.324 0 6.028 -2.704 6.028 -6.027 s-2.704 -6.026 -6.028 -6.026z
            path(
                fill = SolidColor(Color(0xFFAAB8C2)),
            ) {
                // M 17.993 23.374
                moveTo(x = 17.993f, y = 23.374f)
                // c -4.15 0 -7.526 -3.377 -7.526 -7.527
                curveToRelative(
                    dx1 = -4.15f,
                    dy1 = 0.0f,
                    dx2 = -7.526f,
                    dy2 = -3.377f,
                    dx3 = -7.526f,
                    dy3 = -7.527f,
                )
                // s 3.376 -7.526 7.526 -7.526
                reflectiveCurveToRelative(
                    dx1 = 3.376f,
                    dy1 = -7.526f,
                    dx2 = 7.526f,
                    dy2 = -7.526f,
                )
                // c 4.151 0 7.528 3.376 7.528 7.526
                curveToRelative(
                    dx1 = 4.151f,
                    dy1 = 0.0f,
                    dx2 = 7.528f,
                    dy2 = 3.376f,
                    dx3 = 7.528f,
                    dy3 = 7.526f,
                )
                // s -3.376 7.527 -7.528 7.527z
                reflectiveCurveToRelative(
                    dx1 = -3.376f,
                    dy1 = 7.527f,
                    dx2 = -7.528f,
                    dy2 = 7.527f,
                )
                close()
                // M 17.993 9.821
                moveTo(x = 17.993f, y = 9.821f)
                // c -3.323 0 -6.026 2.704 -6.026 6.026
                curveToRelative(
                    dx1 = -3.323f,
                    dy1 = 0.0f,
                    dx2 = -6.026f,
                    dy2 = 2.704f,
                    dx3 = -6.026f,
                    dy3 = 6.026f,
                )
                // s 2.704 6.027 6.026 6.027
                reflectiveCurveToRelative(
                    dx1 = 2.704f,
                    dy1 = 6.027f,
                    dx2 = 6.026f,
                    dy2 = 6.027f,
                )
                // c 3.324 0 6.028 -2.704 6.028 -6.027
                curveToRelative(
                    dx1 = 3.324f,
                    dy1 = 0.0f,
                    dx2 = 6.028f,
                    dy2 = -2.704f,
                    dx3 = 6.028f,
                    dy3 = -6.027f,
                )
                // s -2.704 -6.026 -6.028 -6.026z
                reflectiveCurveToRelative(
                    dx1 = -2.704f,
                    dy1 = -6.026f,
                    dx2 = -6.028f,
                    dy2 = -6.026f,
                )
                close()
            }
            // M27.279 34.429 l-8.376 -18.344 c-0.021 -0.046 -0.058 -0.076 -0.085 -0.117 -0.038 -0.059 -0.072 -0.118 -0.123 -0.169 -0.051 -0.051 -0.11 -0.085 -0.17 -0.123 -0.041 -0.027 -0.071 -0.064 -0.117 -0.085 -0.012 -0.005 -0.024 -0.003 -0.035 -0.008 -0.064 -0.027 -0.132 -0.034 -0.201 -0.047 -0.061 -0.011 -0.121 -0.03 -0.182 -0.03 -0.054 0 -0.106 0.018 -0.161 0.027 -0.075 0.013 -0.149 0.022 -0.219 0.051 -0.011 0.005 -0.023 0.003 -0.034 0.008 -0.044 0.02 -0.074 0.057 -0.114 0.082 -0.061 0.039 -0.121 0.074 -0.173 0.125 -0.051 0.051 -0.086 0.111 -0.124 0.171 -0.026 0.04 -0.063 0.07 -0.083 0.115 L8.709 34.429 c-0.229 0.502 -0.008 1.096 0.494 1.325 0.135 0.061 0.276 0.09 0.415 0.09 0.379 0 0.742 -0.217 0.91 -0.585 l7.465 -16.351 7.465 16.351 c0.168 0.368 0.531 0.585 0.911 0.585 0.139 0 0.279 -0.029 0.414 -0.091 0.504 -0.229 0.725 -0.822 0.496 -1.324z
            path(
                fill = SolidColor(Color(0xFF8899A6)),
            ) {
                // M 27.279 34.429
                moveTo(x = 27.279f, y = 34.429f)
                // l -8.376 -18.344
                lineToRelative(dx = -8.376f, dy = -18.344f)
                // c -0.021 -0.046 -0.058 -0.076 -0.085 -0.117
                curveToRelative(
                    dx1 = -0.021f,
                    dy1 = -0.046f,
                    dx2 = -0.058f,
                    dy2 = -0.076f,
                    dx3 = -0.085f,
                    dy3 = -0.117f,
                )
                // c -0.038 -0.059 -0.072 -0.118 -0.123 -0.169
                curveToRelative(
                    dx1 = -0.038f,
                    dy1 = -0.059f,
                    dx2 = -0.072f,
                    dy2 = -0.118f,
                    dx3 = -0.123f,
                    dy3 = -0.169f,
                )
                // c -0.051 -0.051 -0.11 -0.085 -0.17 -0.123
                curveToRelative(
                    dx1 = -0.051f,
                    dy1 = -0.051f,
                    dx2 = -0.11f,
                    dy2 = -0.085f,
                    dx3 = -0.17f,
                    dy3 = -0.123f,
                )
                // c -0.041 -0.027 -0.071 -0.064 -0.117 -0.085
                curveToRelative(
                    dx1 = -0.041f,
                    dy1 = -0.027f,
                    dx2 = -0.071f,
                    dy2 = -0.064f,
                    dx3 = -0.117f,
                    dy3 = -0.085f,
                )
                // c -0.012 -0.005 -0.024 -0.003 -0.035 -0.008
                curveToRelative(
                    dx1 = -0.012f,
                    dy1 = -0.005f,
                    dx2 = -0.024f,
                    dy2 = -0.003f,
                    dx3 = -0.035f,
                    dy3 = -0.008f,
                )
                // c -0.064 -0.027 -0.132 -0.034 -0.201 -0.047
                curveToRelative(
                    dx1 = -0.064f,
                    dy1 = -0.027f,
                    dx2 = -0.132f,
                    dy2 = -0.034f,
                    dx3 = -0.201f,
                    dy3 = -0.047f,
                )
                // c -0.061 -0.011 -0.121 -0.03 -0.182 -0.03
                curveToRelative(
                    dx1 = -0.061f,
                    dy1 = -0.011f,
                    dx2 = -0.121f,
                    dy2 = -0.03f,
                    dx3 = -0.182f,
                    dy3 = -0.03f,
                )
                // c -0.054 0 -0.106 0.018 -0.161 0.027
                curveToRelative(
                    dx1 = -0.054f,
                    dy1 = 0.0f,
                    dx2 = -0.106f,
                    dy2 = 0.018f,
                    dx3 = -0.161f,
                    dy3 = 0.027f,
                )
                // c -0.075 0.013 -0.149 0.022 -0.219 0.051
                curveToRelative(
                    dx1 = -0.075f,
                    dy1 = 0.013f,
                    dx2 = -0.149f,
                    dy2 = 0.022f,
                    dx3 = -0.219f,
                    dy3 = 0.051f,
                )
                // c -0.011 0.005 -0.023 0.003 -0.034 0.008
                curveToRelative(
                    dx1 = -0.011f,
                    dy1 = 0.005f,
                    dx2 = -0.023f,
                    dy2 = 0.003f,
                    dx3 = -0.034f,
                    dy3 = 0.008f,
                )
                // c -0.044 0.02 -0.074 0.057 -0.114 0.082
                curveToRelative(
                    dx1 = -0.044f,
                    dy1 = 0.02f,
                    dx2 = -0.074f,
                    dy2 = 0.057f,
                    dx3 = -0.114f,
                    dy3 = 0.082f,
                )
                // c -0.061 0.039 -0.121 0.074 -0.173 0.125
                curveToRelative(
                    dx1 = -0.061f,
                    dy1 = 0.039f,
                    dx2 = -0.121f,
                    dy2 = 0.074f,
                    dx3 = -0.173f,
                    dy3 = 0.125f,
                )
                // c -0.051 0.051 -0.086 0.111 -0.124 0.171
                curveToRelative(
                    dx1 = -0.051f,
                    dy1 = 0.051f,
                    dx2 = -0.086f,
                    dy2 = 0.111f,
                    dx3 = -0.124f,
                    dy3 = 0.171f,
                )
                // c -0.026 0.04 -0.063 0.07 -0.083 0.115
                curveToRelative(
                    dx1 = -0.026f,
                    dy1 = 0.04f,
                    dx2 = -0.063f,
                    dy2 = 0.07f,
                    dx3 = -0.083f,
                    dy3 = 0.115f,
                )
                // L 8.709 34.429
                lineTo(x = 8.709f, y = 34.429f)
                // c -0.229 0.502 -0.008 1.096 0.494 1.325
                curveToRelative(
                    dx1 = -0.229f,
                    dy1 = 0.502f,
                    dx2 = -0.008f,
                    dy2 = 1.096f,
                    dx3 = 0.494f,
                    dy3 = 1.325f,
                )
                // c 0.135 0.061 0.276 0.09 0.415 0.09
                curveToRelative(
                    dx1 = 0.135f,
                    dy1 = 0.061f,
                    dx2 = 0.276f,
                    dy2 = 0.09f,
                    dx3 = 0.415f,
                    dy3 = 0.09f,
                )
                // c 0.379 0 0.742 -0.217 0.91 -0.585
                curveToRelative(
                    dx1 = 0.379f,
                    dy1 = 0.0f,
                    dx2 = 0.742f,
                    dy2 = -0.217f,
                    dx3 = 0.91f,
                    dy3 = -0.585f,
                )
                // l 7.465 -16.351
                lineToRelative(dx = 7.465f, dy = -16.351f)
                // l 7.465 16.351
                lineToRelative(dx = 7.465f, dy = 16.351f)
                // c 0.168 0.368 0.531 0.585 0.911 0.585
                curveToRelative(
                    dx1 = 0.168f,
                    dy1 = 0.368f,
                    dx2 = 0.531f,
                    dy2 = 0.585f,
                    dx3 = 0.911f,
                    dy3 = 0.585f,
                )
                // c 0.139 0 0.279 -0.029 0.414 -0.091
                curveToRelative(
                    dx1 = 0.139f,
                    dy1 = 0.0f,
                    dx2 = 0.279f,
                    dy2 = -0.029f,
                    dx3 = 0.414f,
                    dy3 = -0.091f,
                )
                // c 0.504 -0.229 0.725 -0.822 0.496 -1.324z
                curveToRelative(
                    dx1 = 0.504f,
                    dy1 = -0.229f,
                    dx2 = 0.725f,
                    dy2 = -0.822f,
                    dx3 = 0.496f,
                    dy3 = -1.324f,
                )
                close()
            }
            // M12.9 36 L7.079 36 c-0.552 0 -1 -0.447 -1 -1 s0.448 -1 1 -1 L12.9 34 c0.552 0 1 0.447 1 1 s-0.448 1 -1 1z M28.899 36 h-5.82 c-0.553 0 -1 -0.447 -1 -1 s0.447 -1 1 -1 h5.82 c0.553 0 1 0.447 1 1 s-0.447 1 -1 1z
            path(
                fill = SolidColor(Color(0xFF553788)),
            ) {
                // M 12.9 36
                moveTo(x = 12.9f, y = 36.0f)
                // L 7.079 36
                lineTo(x = 7.079f, y = 36.0f)
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
                // L 12.9 34
                lineTo(x = 12.9f, y = 34.0f)
                // c 0.552 0 1 0.447 1 1
                curveToRelative(
                    dx1 = 0.552f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.447f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // s -0.448 1 -1 1z
                reflectiveCurveToRelative(
                    dx1 = -0.448f,
                    dy1 = 1.0f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                close()
                // M 28.899 36
                moveTo(x = 28.899f, y = 36.0f)
                // h -5.82
                horizontalLineToRelative(dx = -5.82f)
                // c -0.553 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.553f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // s 0.447 -1 1 -1
                reflectiveCurveToRelative(
                    dx1 = 0.447f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // h 5.82
                horizontalLineToRelative(dx = 5.82f)
                // c 0.553 0 1 0.447 1 1
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.447f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // s -0.447 1 -1 1z
                reflectiveCurveToRelative(
                    dx1 = -0.447f,
                    dy1 = 1.0f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                close()
            }
            // M21.284 29.819 c0 1.535 -1.244 2.779 -2.779 2.779 h-1.112 c-1.535 0 -2.779 -1.244 -2.779 -2.779 s1.244 -2.779 2.779 -2.779 h1.112 c1.534 0 2.779 1.244 2.779 2.779z
            path(
                fill = SolidColor(Color(0xFF744EAA)),
            ) {
                // M 21.284 29.819
                moveTo(x = 21.284f, y = 29.819f)
                // c 0 1.535 -1.244 2.779 -2.779 2.779
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.535f,
                    dx2 = -1.244f,
                    dy2 = 2.779f,
                    dx3 = -2.779f,
                    dy3 = 2.779f,
                )
                // h -1.112
                horizontalLineToRelative(dx = -1.112f)
                // c -1.535 0 -2.779 -1.244 -2.779 -2.779
                curveToRelative(
                    dx1 = -1.535f,
                    dy1 = 0.0f,
                    dx2 = -2.779f,
                    dy2 = -1.244f,
                    dx3 = -2.779f,
                    dy3 = -2.779f,
                )
                // s 1.244 -2.779 2.779 -2.779
                reflectiveCurveToRelative(
                    dx1 = 1.244f,
                    dy1 = -2.779f,
                    dx2 = 2.779f,
                    dy2 = -2.779f,
                )
                // h 1.112
                horizontalLineToRelative(dx = 1.112f)
                // c 1.534 0 2.779 1.244 2.779 2.779z
                curveToRelative(
                    dx1 = 1.534f,
                    dy1 = 0.0f,
                    dx2 = 2.779f,
                    dy2 = 1.244f,
                    dx3 = 2.779f,
                    dy3 = 2.779f,
                )
                close()
            }
            // M21.227 29.263 c-0.257 -1.269 -1.378 -2.224 -2.723 -2.224 h-1.112 c-1.345 0 -2.466 0.954 -2.724 2.224 h6.559z
            path(
                fill = SolidColor(Color(0xFFCBB7EA)),
            ) {
                // M 21.227 29.263
                moveTo(x = 21.227f, y = 29.263f)
                // c -0.257 -1.269 -1.378 -2.224 -2.723 -2.224
                curveToRelative(
                    dx1 = -0.257f,
                    dy1 = -1.269f,
                    dx2 = -1.378f,
                    dy2 = -2.224f,
                    dx3 = -2.723f,
                    dy3 = -2.224f,
                )
                // h -1.112
                horizontalLineToRelative(dx = -1.112f)
                // c -1.345 0 -2.466 0.954 -2.724 2.224
                curveToRelative(
                    dx1 = -1.345f,
                    dy1 = 0.0f,
                    dx2 = -2.466f,
                    dy2 = 0.954f,
                    dx3 = -2.724f,
                    dy3 = 2.224f,
                )
                // h 6.559z
                horizontalLineToRelative(dx = 6.559f)
                close()
            }
            // M11.017 26.527 c0 1.535 -1.244 2.779 -2.779 2.779 H7.126 c-1.535 0 -2.779 -1.244 -2.779 -2.779 s1.244 -2.779 2.779 -2.779 h1.112 c1.535 0 2.779 1.244 2.779 2.779z
            path(
                fill = SolidColor(Color(0xFF5C913B)),
            ) {
                // M 11.017 26.527
                moveTo(x = 11.017f, y = 26.527f)
                // c 0 1.535 -1.244 2.779 -2.779 2.779
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.535f,
                    dx2 = -1.244f,
                    dy2 = 2.779f,
                    dx3 = -2.779f,
                    dy3 = 2.779f,
                )
                // H 7.126
                horizontalLineTo(x = 7.126f)
                // c -1.535 0 -2.779 -1.244 -2.779 -2.779
                curveToRelative(
                    dx1 = -1.535f,
                    dy1 = 0.0f,
                    dx2 = -2.779f,
                    dy2 = -1.244f,
                    dx3 = -2.779f,
                    dy3 = -2.779f,
                )
                // s 1.244 -2.779 2.779 -2.779
                reflectiveCurveToRelative(
                    dx1 = 1.244f,
                    dy1 = -2.779f,
                    dx2 = 2.779f,
                    dy2 = -2.779f,
                )
                // h 1.112
                horizontalLineToRelative(dx = 1.112f)
                // c 1.535 0 2.779 1.244 2.779 2.779z
                curveToRelative(
                    dx1 = 1.535f,
                    dy1 = 0.0f,
                    dx2 = 2.779f,
                    dy2 = 1.244f,
                    dx3 = 2.779f,
                    dy3 = 2.779f,
                )
                close()
            }
            // M10.96 25.971 c-0.257 -1.269 -1.378 -2.224 -2.723 -2.224 H7.126 c-1.345 0 -2.466 0.954 -2.724 2.224 h6.558z
            path(
                fill = SolidColor(Color(0xFFC6E5B3)),
            ) {
                // M 10.96 25.971
                moveTo(x = 10.96f, y = 25.971f)
                // c -0.257 -1.269 -1.378 -2.224 -2.723 -2.224
                curveToRelative(
                    dx1 = -0.257f,
                    dy1 = -1.269f,
                    dx2 = -1.378f,
                    dy2 = -2.224f,
                    dx3 = -2.723f,
                    dy3 = -2.224f,
                )
                // H 7.126
                horizontalLineTo(x = 7.126f)
                // c -1.345 0 -2.466 0.954 -2.724 2.224
                curveToRelative(
                    dx1 = -1.345f,
                    dy1 = 0.0f,
                    dx2 = -2.466f,
                    dy2 = 0.954f,
                    dx3 = -2.724f,
                    dy3 = 2.224f,
                )
                // h 6.558z
                horizontalLineToRelative(dx = 6.558f)
                close()
            }
            // M34.977 17.633 c0 1.535 -1.244 2.779 -2.779 2.779 h-1.112 c-1.535 0 -2.779 -1.244 -2.779 -2.779 s1.244 -2.779 2.779 -2.779 h1.112 c1.535 -0.001 2.779 1.243 2.779 2.779z
            path(
                fill = SolidColor(Color(0xFF3B94D9)),
            ) {
                // M 34.977 17.633
                moveTo(x = 34.977f, y = 17.633f)
                // c 0 1.535 -1.244 2.779 -2.779 2.779
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.535f,
                    dx2 = -1.244f,
                    dy2 = 2.779f,
                    dx3 = -2.779f,
                    dy3 = 2.779f,
                )
                // h -1.112
                horizontalLineToRelative(dx = -1.112f)
                // c -1.535 0 -2.779 -1.244 -2.779 -2.779
                curveToRelative(
                    dx1 = -1.535f,
                    dy1 = 0.0f,
                    dx2 = -2.779f,
                    dy2 = -1.244f,
                    dx3 = -2.779f,
                    dy3 = -2.779f,
                )
                // s 1.244 -2.779 2.779 -2.779
                reflectiveCurveToRelative(
                    dx1 = 1.244f,
                    dy1 = -2.779f,
                    dx2 = 2.779f,
                    dy2 = -2.779f,
                )
                // h 1.112
                horizontalLineToRelative(dx = 1.112f)
                // c 1.535 -0.001 2.779 1.243 2.779 2.779z
                curveToRelative(
                    dx1 = 1.535f,
                    dy1 = -0.001f,
                    dx2 = 2.779f,
                    dy2 = 1.243f,
                    dx3 = 2.779f,
                    dy3 = 2.779f,
                )
                close()
            }
            // M34.921 17.077 c-0.257 -1.269 -1.378 -2.224 -2.723 -2.224 h-1.112 c-1.344 0 -2.466 0.954 -2.723 2.224 h6.558z
            path(
                fill = SolidColor(Color(0xFFBBDDF5)),
            ) {
                // M 34.921 17.077
                moveTo(x = 34.921f, y = 17.077f)
                // c -0.257 -1.269 -1.378 -2.224 -2.723 -2.224
                curveToRelative(
                    dx1 = -0.257f,
                    dy1 = -1.269f,
                    dx2 = -1.378f,
                    dy2 = -2.224f,
                    dx3 = -2.723f,
                    dy3 = -2.224f,
                )
                // h -1.112
                horizontalLineToRelative(dx = -1.112f)
                // c -1.344 0 -2.466 0.954 -2.723 2.224
                curveToRelative(
                    dx1 = -1.344f,
                    dy1 = 0.0f,
                    dx2 = -2.466f,
                    dy2 = 0.954f,
                    dx3 = -2.723f,
                    dy3 = 2.224f,
                )
                // h 6.558z
                horizontalLineToRelative(dx = 6.558f)
                close()
            }
            // M31.644 7.887 c0 1.535 -1.244 2.779 -2.779 2.779 h-1.112 c-1.535 0 -2.779 -1.244 -2.779 -2.779 s1.244 -2.779 2.779 -2.779 h1.112 c1.535 0 2.779 1.244 2.779 2.779z
            path(
                fill = SolidColor(Color(0xFF5C913B)),
            ) {
                // M 31.644 7.887
                moveTo(x = 31.644f, y = 7.887f)
                // c 0 1.535 -1.244 2.779 -2.779 2.779
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.535f,
                    dx2 = -1.244f,
                    dy2 = 2.779f,
                    dx3 = -2.779f,
                    dy3 = 2.779f,
                )
                // h -1.112
                horizontalLineToRelative(dx = -1.112f)
                // c -1.535 0 -2.779 -1.244 -2.779 -2.779
                curveToRelative(
                    dx1 = -1.535f,
                    dy1 = 0.0f,
                    dx2 = -2.779f,
                    dy2 = -1.244f,
                    dx3 = -2.779f,
                    dy3 = -2.779f,
                )
                // s 1.244 -2.779 2.779 -2.779
                reflectiveCurveToRelative(
                    dx1 = 1.244f,
                    dy1 = -2.779f,
                    dx2 = 2.779f,
                    dy2 = -2.779f,
                )
                // h 1.112
                horizontalLineToRelative(dx = 1.112f)
                // c 1.535 0 2.779 1.244 2.779 2.779z
                curveToRelative(
                    dx1 = 1.535f,
                    dy1 = 0.0f,
                    dx2 = 2.779f,
                    dy2 = 1.244f,
                    dx3 = 2.779f,
                    dy3 = 2.779f,
                )
                close()
            }
            // M31.588 7.331 c-0.257 -1.269 -1.378 -2.224 -2.723 -2.224 h-1.112 c-1.344 0 -2.466 0.954 -2.723 2.224 h6.558z
            path(
                fill = SolidColor(Color(0xFFC6E5B3)),
            ) {
                // M 31.588 7.331
                moveTo(x = 31.588f, y = 7.331f)
                // c -0.257 -1.269 -1.378 -2.224 -2.723 -2.224
                curveToRelative(
                    dx1 = -0.257f,
                    dy1 = -1.269f,
                    dx2 = -1.378f,
                    dy2 = -2.224f,
                    dx3 = -2.723f,
                    dy3 = -2.224f,
                )
                // h -1.112
                horizontalLineToRelative(dx = -1.112f)
                // c -1.344 0 -2.466 0.954 -2.723 2.224
                curveToRelative(
                    dx1 = -1.344f,
                    dy1 = 0.0f,
                    dx2 = -2.466f,
                    dy2 = 0.954f,
                    dx3 = -2.723f,
                    dy3 = 2.224f,
                )
                // h 6.558z
                horizontalLineToRelative(dx = 6.558f)
                close()
            }
            // M31.644 26.527 c0 1.535 -1.244 2.779 -2.779 2.779 h-1.112 c-1.535 0 -2.779 -1.244 -2.779 -2.779 s1.244 -2.779 2.779 -2.779 h1.112 c1.535 0 2.779 1.244 2.779 2.779z
            path(
                fill = SolidColor(Color(0xFFBE1931)),
            ) {
                // M 31.644 26.527
                moveTo(x = 31.644f, y = 26.527f)
                // c 0 1.535 -1.244 2.779 -2.779 2.779
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.535f,
                    dx2 = -1.244f,
                    dy2 = 2.779f,
                    dx3 = -2.779f,
                    dy3 = 2.779f,
                )
                // h -1.112
                horizontalLineToRelative(dx = -1.112f)
                // c -1.535 0 -2.779 -1.244 -2.779 -2.779
                curveToRelative(
                    dx1 = -1.535f,
                    dy1 = 0.0f,
                    dx2 = -2.779f,
                    dy2 = -1.244f,
                    dx3 = -2.779f,
                    dy3 = -2.779f,
                )
                // s 1.244 -2.779 2.779 -2.779
                reflectiveCurveToRelative(
                    dx1 = 1.244f,
                    dy1 = -2.779f,
                    dx2 = 2.779f,
                    dy2 = -2.779f,
                )
                // h 1.112
                horizontalLineToRelative(dx = 1.112f)
                // c 1.535 0 2.779 1.244 2.779 2.779z
                curveToRelative(
                    dx1 = 1.535f,
                    dy1 = 0.0f,
                    dx2 = 2.779f,
                    dy2 = 1.244f,
                    dx3 = 2.779f,
                    dy3 = 2.779f,
                )
                close()
            }
            // M31.588 25.971 c-0.257 -1.269 -1.378 -2.224 -2.723 -2.224 h-1.112 c-1.344 0 -2.466 0.954 -2.723 2.224 h6.558z
            path(
                fill = SolidColor(Color(0xFFF4ABBA)),
            ) {
                // M 31.588 25.971
                moveTo(x = 31.588f, y = 25.971f)
                // c -0.257 -1.269 -1.378 -2.224 -2.723 -2.224
                curveToRelative(
                    dx1 = -0.257f,
                    dy1 = -1.269f,
                    dx2 = -1.378f,
                    dy2 = -2.224f,
                    dx3 = -2.723f,
                    dy3 = -2.224f,
                )
                // h -1.112
                horizontalLineToRelative(dx = -1.112f)
                // c -1.344 0 -2.466 0.954 -2.723 2.224
                curveToRelative(
                    dx1 = -1.344f,
                    dy1 = 0.0f,
                    dx2 = -2.466f,
                    dy2 = 0.954f,
                    dx3 = -2.723f,
                    dy3 = 2.224f,
                )
                // h 6.558z
                horizontalLineToRelative(dx = 6.558f)
                close()
            }
            // M11.017 7.887 c0 1.535 -1.244 2.779 -2.779 2.779 H7.126 c-1.535 0 -2.779 -1.244 -2.779 -2.779 s1.244 -2.779 2.779 -2.779 h1.112 c1.535 0 2.779 1.244 2.779 2.779z
            path(
                fill = SolidColor(Color(0xFFBE1931)),
            ) {
                // M 11.017 7.887
                moveTo(x = 11.017f, y = 7.887f)
                // c 0 1.535 -1.244 2.779 -2.779 2.779
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.535f,
                    dx2 = -1.244f,
                    dy2 = 2.779f,
                    dx3 = -2.779f,
                    dy3 = 2.779f,
                )
                // H 7.126
                horizontalLineTo(x = 7.126f)
                // c -1.535 0 -2.779 -1.244 -2.779 -2.779
                curveToRelative(
                    dx1 = -1.535f,
                    dy1 = 0.0f,
                    dx2 = -2.779f,
                    dy2 = -1.244f,
                    dx3 = -2.779f,
                    dy3 = -2.779f,
                )
                // s 1.244 -2.779 2.779 -2.779
                reflectiveCurveToRelative(
                    dx1 = 1.244f,
                    dy1 = -2.779f,
                    dx2 = 2.779f,
                    dy2 = -2.779f,
                )
                // h 1.112
                horizontalLineToRelative(dx = 1.112f)
                // c 1.535 0 2.779 1.244 2.779 2.779z
                curveToRelative(
                    dx1 = 1.535f,
                    dy1 = 0.0f,
                    dx2 = 2.779f,
                    dy2 = 1.244f,
                    dx3 = 2.779f,
                    dy3 = 2.779f,
                )
                close()
            }
            // M10.96 7.331 c-0.257 -1.269 -1.378 -2.224 -2.723 -2.224 H7.126 c-1.345 0 -2.466 0.954 -2.724 2.224 h6.558z
            path(
                fill = SolidColor(Color(0xFFF4ABBA)),
            ) {
                // M 10.96 7.331
                moveTo(x = 10.96f, y = 7.331f)
                // c -0.257 -1.269 -1.378 -2.224 -2.723 -2.224
                curveToRelative(
                    dx1 = -0.257f,
                    dy1 = -1.269f,
                    dx2 = -1.378f,
                    dy2 = -2.224f,
                    dx3 = -2.723f,
                    dy3 = -2.224f,
                )
                // H 7.126
                horizontalLineTo(x = 7.126f)
                // c -1.345 0 -2.466 0.954 -2.724 2.224
                curveToRelative(
                    dx1 = -1.345f,
                    dy1 = 0.0f,
                    dx2 = -2.466f,
                    dy2 = 0.954f,
                    dx3 = -2.724f,
                    dy3 = 2.224f,
                )
                // h 6.558z
                horizontalLineToRelative(dx = 6.558f)
                close()
            }
            // M21.284 2.876 c0 1.535 -1.244 2.779 -2.779 2.779 h-1.112 c-1.535 0 -2.779 -1.244 -2.779 -2.779 S15.858 0.097 17.393 0.097 h1.112 c1.534 -0.001 2.779 1.243 2.779 2.779z
            path(
                fill = SolidColor(Color(0xFF744EAA)),
            ) {
                // M 21.284 2.876
                moveTo(x = 21.284f, y = 2.876f)
                // c 0 1.535 -1.244 2.779 -2.779 2.779
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.535f,
                    dx2 = -1.244f,
                    dy2 = 2.779f,
                    dx3 = -2.779f,
                    dy3 = 2.779f,
                )
                // h -1.112
                horizontalLineToRelative(dx = -1.112f)
                // c -1.535 0 -2.779 -1.244 -2.779 -2.779
                curveToRelative(
                    dx1 = -1.535f,
                    dy1 = 0.0f,
                    dx2 = -2.779f,
                    dy2 = -1.244f,
                    dx3 = -2.779f,
                    dy3 = -2.779f,
                )
                // S 15.858 0.097 17.393 0.097
                reflectiveCurveTo(
                    x1 = 15.858f,
                    y1 = 0.097f,
                    x2 = 17.393f,
                    y2 = 0.097f,
                )
                // h 1.112
                horizontalLineToRelative(dx = 1.112f)
                // c 1.534 -0.001 2.779 1.243 2.779 2.779z
                curveToRelative(
                    dx1 = 1.534f,
                    dy1 = -0.001f,
                    dx2 = 2.779f,
                    dy2 = 1.243f,
                    dx3 = 2.779f,
                    dy3 = 2.779f,
                )
                close()
            }
            // M21.227 2.32 C20.97 1.051 19.849 0.096 18.504 0.096 h-1.112 c-1.345 0 -2.466 0.954 -2.724 2.224 h6.559z
            path(
                fill = SolidColor(Color(0xFFCBB7EA)),
            ) {
                // M 21.227 2.32
                moveTo(x = 21.227f, y = 2.32f)
                // C 20.97 1.051 19.849 0.096 18.504 0.096
                curveTo(
                    x1 = 20.97f,
                    y1 = 1.051f,
                    x2 = 19.849f,
                    y2 = 0.096f,
                    x3 = 18.504f,
                    y3 = 0.096f,
                )
                // h -1.112
                horizontalLineToRelative(dx = -1.112f)
                // c -1.345 0 -2.466 0.954 -2.724 2.224
                curveToRelative(
                    dx1 = -1.345f,
                    dy1 = 0.0f,
                    dx2 = -2.466f,
                    dy2 = 0.954f,
                    dx3 = -2.724f,
                    dy3 = 2.224f,
                )
                // h 6.559z
                horizontalLineToRelative(dx = 6.559f)
                close()
            }
            // M7.682 17.633 c0 1.535 -1.244 2.779 -2.779 2.779 H3.79 c-1.535 0 -2.779 -1.244 -2.779 -2.779 s1.244 -2.779 2.779 -2.779 h1.112 c1.535 -0.001 2.78 1.243 2.78 2.779z
            path(
                fill = SolidColor(Color(0xFF3B94D9)),
            ) {
                // M 7.682 17.633
                moveTo(x = 7.682f, y = 17.633f)
                // c 0 1.535 -1.244 2.779 -2.779 2.779
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.535f,
                    dx2 = -1.244f,
                    dy2 = 2.779f,
                    dx3 = -2.779f,
                    dy3 = 2.779f,
                )
                // H 3.79
                horizontalLineTo(x = 3.79f)
                // c -1.535 0 -2.779 -1.244 -2.779 -2.779
                curveToRelative(
                    dx1 = -1.535f,
                    dy1 = 0.0f,
                    dx2 = -2.779f,
                    dy2 = -1.244f,
                    dx3 = -2.779f,
                    dy3 = -2.779f,
                )
                // s 1.244 -2.779 2.779 -2.779
                reflectiveCurveToRelative(
                    dx1 = 1.244f,
                    dy1 = -2.779f,
                    dx2 = 2.779f,
                    dy2 = -2.779f,
                )
                // h 1.112
                horizontalLineToRelative(dx = 1.112f)
                // c 1.535 -0.001 2.78 1.243 2.78 2.779z
                curveToRelative(
                    dx1 = 1.535f,
                    dy1 = -0.001f,
                    dx2 = 2.78f,
                    dy2 = 1.243f,
                    dx3 = 2.78f,
                    dy3 = 2.779f,
                )
                close()
            }
            // M7.625 17.077 c-0.257 -1.269 -1.378 -2.224 -2.723 -2.224 H3.79 c-1.345 0 -2.466 0.954 -2.724 2.224 h6.559z
            path(
                fill = SolidColor(Color(0xFFBBDDF5)),
            ) {
                // M 7.625 17.077
                moveTo(x = 7.625f, y = 17.077f)
                // c -0.257 -1.269 -1.378 -2.224 -2.723 -2.224
                curveToRelative(
                    dx1 = -0.257f,
                    dy1 = -1.269f,
                    dx2 = -1.378f,
                    dy2 = -2.224f,
                    dx3 = -2.723f,
                    dy3 = -2.224f,
                )
                // H 3.79
                horizontalLineTo(x = 3.79f)
                // c -1.345 0 -2.466 0.954 -2.724 2.224
                curveToRelative(
                    dx1 = -1.345f,
                    dy1 = 0.0f,
                    dx2 = -2.466f,
                    dy2 = 0.954f,
                    dx3 = -2.724f,
                    dy3 = 2.224f,
                )
                // h 6.559z
                horizontalLineToRelative(dx = 6.559f)
                close()
            }
            // M14.952 15.847 c0 -1.68 1.362 -3.041 3.041 -3.041 1.68 0 3.042 1.362 3.042 3.041 s-1.362 3.041 -3.042 3.041 c-1.679 0.001 -3.041 -1.361 -3.041 -3.041z
            path(
                fill = SolidColor(Color(0xFF553788)),
            ) {
                // M 14.952 15.847
                moveTo(x = 14.952f, y = 15.847f)
                // c 0 -1.68 1.362 -3.041 3.041 -3.041
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.68f,
                    dx2 = 1.362f,
                    dy2 = -3.041f,
                    dx3 = 3.041f,
                    dy3 = -3.041f,
                )
                // c 1.68 0 3.042 1.362 3.042 3.041
                curveToRelative(
                    dx1 = 1.68f,
                    dy1 = 0.0f,
                    dx2 = 3.042f,
                    dy2 = 1.362f,
                    dx3 = 3.042f,
                    dy3 = 3.041f,
                )
                // s -1.362 3.041 -3.042 3.041
                reflectiveCurveToRelative(
                    dx1 = -1.362f,
                    dy1 = 3.041f,
                    dx2 = -3.042f,
                    dy2 = 3.041f,
                )
                // c -1.679 0.001 -3.041 -1.361 -3.041 -3.041z
                curveToRelative(
                    dx1 = -1.679f,
                    dy1 = 0.001f,
                    dx2 = -3.041f,
                    dy2 = -1.361f,
                    dx3 = -3.041f,
                    dy3 = -3.041f,
                )
                close()
            }
        }.build().also { _emoji1f3a1 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f3a1: ImageVector? = null
