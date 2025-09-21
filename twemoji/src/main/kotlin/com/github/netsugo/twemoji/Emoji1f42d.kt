package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f42d: ImageVector
    get() {
        val current = _emoji1f42d
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f42d",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M8.5 9.5 m-8.5 0 a8.5 8.5 0 1 1 17 0 a8.5 8.5 0 1 1 -17 0
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 8.5 9.5
                moveTo(x = 8.5f, y = 9.5f)
                // m -8.5 0
                moveToRelative(dx = -8.5f, dy = 0.0f)
                // a 8.5 8.5 0 1 1 17 0
                arcToRelative(
                    a = 8.5f,
                    b = 8.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 17.0f,
                    dy1 = 0.0f,
                )
                // a 8.5 8.5 0 1 1 -17 0
                arcToRelative(
                    a = 8.5f,
                    b = 8.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -17.0f,
                    dy1 = 0.0f,
                )
            }
            // M27.5 9.5 m-8.5 0 a8.5 8.5 0 1 1 17 0 a8.5 8.5 0 1 1 -17 0
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 27.5 9.5
                moveTo(x = 27.5f, y = 9.5f)
                // m -8.5 0
                moveToRelative(dx = -8.5f, dy = 0.0f)
                // a 8.5 8.5 0 1 1 17 0
                arcToRelative(
                    a = 8.5f,
                    b = 8.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 17.0f,
                    dy1 = 0.0f,
                )
                // a 8.5 8.5 0 1 1 -17 0
                arcToRelative(
                    a = 8.5f,
                    b = 8.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -17.0f,
                    dy1 = 0.0f,
                )
            }
            // M13.812 10.031 c0 3.228 -2.617 5.844 -5.844 5.844 s-5.844 -2.616 -5.844 -5.844 c0 -3.227 2.617 -5.844 5.844 -5.844 s5.844 2.617 5.844 5.844z M33.875 10.031 c0 3.228 -2.617 5.844 -5.844 5.844 -3.227 0 -5.844 -2.616 -5.844 -5.844 0 -3.227 2.617 -5.844 5.844 -5.844 3.227 0.001 5.844 2.617 5.844 5.844z
            path(
                fill = SolidColor(Color(0xFFF4ABBA)),
            ) {
                // M 13.812 10.031
                moveTo(x = 13.812f, y = 10.031f)
                // c 0 3.228 -2.617 5.844 -5.844 5.844
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.228f,
                    dx2 = -2.617f,
                    dy2 = 5.844f,
                    dx3 = -5.844f,
                    dy3 = 5.844f,
                )
                // s -5.844 -2.616 -5.844 -5.844
                reflectiveCurveToRelative(
                    dx1 = -5.844f,
                    dy1 = -2.616f,
                    dx2 = -5.844f,
                    dy2 = -5.844f,
                )
                // c 0 -3.227 2.617 -5.844 5.844 -5.844
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.227f,
                    dx2 = 2.617f,
                    dy2 = -5.844f,
                    dx3 = 5.844f,
                    dy3 = -5.844f,
                )
                // s 5.844 2.617 5.844 5.844z
                reflectiveCurveToRelative(
                    dx1 = 5.844f,
                    dy1 = 2.617f,
                    dx2 = 5.844f,
                    dy2 = 5.844f,
                )
                close()
                // M 33.875 10.031
                moveTo(x = 33.875f, y = 10.031f)
                // c 0 3.228 -2.617 5.844 -5.844 5.844
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.228f,
                    dx2 = -2.617f,
                    dy2 = 5.844f,
                    dx3 = -5.844f,
                    dy3 = 5.844f,
                )
                // c -3.227 0 -5.844 -2.616 -5.844 -5.844
                curveToRelative(
                    dx1 = -3.227f,
                    dy1 = 0.0f,
                    dx2 = -5.844f,
                    dy2 = -2.616f,
                    dx3 = -5.844f,
                    dy3 = -5.844f,
                )
                // c 0 -3.227 2.617 -5.844 5.844 -5.844
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.227f,
                    dx2 = 2.617f,
                    dy2 = -5.844f,
                    dx3 = 5.844f,
                    dy3 = -5.844f,
                )
                // c 3.227 0.001 5.844 2.617 5.844 5.844z
                curveToRelative(
                    dx1 = 3.227f,
                    dy1 = 0.001f,
                    dx2 = 5.844f,
                    dy2 = 2.617f,
                    dx3 = 5.844f,
                    dy3 = 5.844f,
                )
                close()
            }
            // M30 18 c0 7.18 -8 15 -12 15 S6 25.18 6 18 s7 -9 12 -9 12 1.82 12 9z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 30 18
                moveTo(x = 30.0f, y = 18.0f)
                // c 0 7.18 -8 15 -12 15
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 7.18f,
                    dx2 = -8.0f,
                    dy2 = 15.0f,
                    dx3 = -12.0f,
                    dy3 = 15.0f,
                )
                // S 6 25.18 6 18
                reflectiveCurveTo(
                    x1 = 6.0f,
                    y1 = 25.18f,
                    x2 = 6.0f,
                    y2 = 18.0f,
                )
                // s 7 -9 12 -9
                reflectiveCurveToRelative(
                    dx1 = 7.0f,
                    dy1 = -9.0f,
                    dx2 = 12.0f,
                    dy2 = -9.0f,
                )
                // s 12 1.82 12 9z
                reflectiveCurveToRelative(
                    dx1 = 12.0f,
                    dy1 = 1.82f,
                    dx2 = 12.0f,
                    dy2 = 9.0f,
                )
                close()
            }
            // M20.905 29.648 C20.905 31.252 18.894 33 18 33 c-0.894 0 -2.905 -1.748 -2.905 -3.352 0 -1.605 1.788 -1.956 2.905 -1.956 1.117 0 2.905 0.351 2.905 1.956z
            path(
                fill = SolidColor(Color(0xFFF4ABBA)),
            ) {
                // M 20.905 29.648
                moveTo(x = 20.905f, y = 29.648f)
                // C 20.905 31.252 18.894 33 18 33
                curveTo(
                    x1 = 20.905f,
                    y1 = 31.252f,
                    x2 = 18.894f,
                    y2 = 33.0f,
                    x3 = 18.0f,
                    y3 = 33.0f,
                )
                // c -0.894 0 -2.905 -1.748 -2.905 -3.352
                curveToRelative(
                    dx1 = -0.894f,
                    dy1 = 0.0f,
                    dx2 = -2.905f,
                    dy2 = -1.748f,
                    dx3 = -2.905f,
                    dy3 = -3.352f,
                )
                // c 0 -1.605 1.788 -1.956 2.905 -1.956
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.605f,
                    dx2 = 1.788f,
                    dy2 = -1.956f,
                    dx3 = 2.905f,
                    dy3 = -1.956f,
                )
                // c 1.117 0 2.905 0.351 2.905 1.956z
                curveToRelative(
                    dx1 = 1.117f,
                    dy1 = 0.0f,
                    dx2 = 2.905f,
                    dy2 = 0.351f,
                    dx3 = 2.905f,
                    dy3 = 1.956f,
                )
                close()
            }
            // M34.999 32.16 c-0.175 0 -0.353 -0.046 -0.514 -0.143 -4.628 -2.777 -11.278 -1.877 -11.345 -1.867 -0.559 0.079 -1.053 -0.304 -1.13 -0.85 -0.078 -0.547 0.302 -1.053 0.848 -1.131 0.301 -0.042 7.411 -1.014 12.656 2.133 0.474 0.284 0.627 0.898 0.343 1.372 -0.187 0.313 -0.518 0.486 -0.858 0.486z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 34.999 32.16
                moveTo(x = 34.999f, y = 32.16f)
                // c -0.175 0 -0.353 -0.046 -0.514 -0.143
                curveToRelative(
                    dx1 = -0.175f,
                    dy1 = 0.0f,
                    dx2 = -0.353f,
                    dy2 = -0.046f,
                    dx3 = -0.514f,
                    dy3 = -0.143f,
                )
                // c -4.628 -2.777 -11.278 -1.877 -11.345 -1.867
                curveToRelative(
                    dx1 = -4.628f,
                    dy1 = -2.777f,
                    dx2 = -11.278f,
                    dy2 = -1.877f,
                    dx3 = -11.345f,
                    dy3 = -1.867f,
                )
                // c -0.559 0.079 -1.053 -0.304 -1.13 -0.85
                curveToRelative(
                    dx1 = -0.559f,
                    dy1 = 0.079f,
                    dx2 = -1.053f,
                    dy2 = -0.304f,
                    dx3 = -1.13f,
                    dy3 = -0.85f,
                )
                // c -0.078 -0.547 0.302 -1.053 0.848 -1.131
                curveToRelative(
                    dx1 = -0.078f,
                    dy1 = -0.547f,
                    dx2 = 0.302f,
                    dy2 = -1.053f,
                    dx3 = 0.848f,
                    dy3 = -1.131f,
                )
                // c 0.301 -0.042 7.411 -1.014 12.656 2.133
                curveToRelative(
                    dx1 = 0.301f,
                    dy1 = -0.042f,
                    dx2 = 7.411f,
                    dy2 = -1.014f,
                    dx3 = 12.656f,
                    dy3 = 2.133f,
                )
                // c 0.474 0.284 0.627 0.898 0.343 1.372
                curveToRelative(
                    dx1 = 0.474f,
                    dy1 = 0.284f,
                    dx2 = 0.627f,
                    dy2 = 0.898f,
                    dx3 = 0.343f,
                    dy3 = 1.372f,
                )
                // c -0.187 0.313 -0.518 0.486 -0.858 0.486z
                curveToRelative(
                    dx1 = -0.187f,
                    dy1 = 0.313f,
                    dx2 = -0.518f,
                    dy2 = 0.486f,
                    dx3 = -0.858f,
                    dy3 = 0.486f,
                )
                close()
            }
            // M32.001 35.16 c-0.305 0 -0.604 -0.138 -0.801 -0.4 -2.728 -3.637 -8.309 -4.604 -8.364 -4.613 -0.545 -0.091 -0.913 -0.606 -0.822 -1.15 0.09 -0.545 0.606 -0.92 1.15 -0.822 0.262 0.044 6.433 1.115 9.636 5.387 0.332 0.441 0.242 1.068 -0.2 1.399 -0.18 0.134 -0.39 0.199 -0.599 0.199z M1.001 32.16 c-0.34 0 -0.671 -0.173 -0.858 -0.485 -0.284 -0.474 -0.131 -1.088 0.343 -1.372 5.244 -3.146 12.355 -2.175 12.656 -2.133 0.546 0.078 0.926 0.584 0.848 1.131 -0.078 0.547 -0.582 0.93 -1.13 0.85 -0.066 -0.009 -6.717 -0.909 -11.345 1.867 -0.161 0.096 -0.339 0.142 -0.514 0.142z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 32.001 35.16
                moveTo(x = 32.001f, y = 35.16f)
                // c -0.305 0 -0.604 -0.138 -0.801 -0.4
                curveToRelative(
                    dx1 = -0.305f,
                    dy1 = 0.0f,
                    dx2 = -0.604f,
                    dy2 = -0.138f,
                    dx3 = -0.801f,
                    dy3 = -0.4f,
                )
                // c -2.728 -3.637 -8.309 -4.604 -8.364 -4.613
                curveToRelative(
                    dx1 = -2.728f,
                    dy1 = -3.637f,
                    dx2 = -8.309f,
                    dy2 = -4.604f,
                    dx3 = -8.364f,
                    dy3 = -4.613f,
                )
                // c -0.545 -0.091 -0.913 -0.606 -0.822 -1.15
                curveToRelative(
                    dx1 = -0.545f,
                    dy1 = -0.091f,
                    dx2 = -0.913f,
                    dy2 = -0.606f,
                    dx3 = -0.822f,
                    dy3 = -1.15f,
                )
                // c 0.09 -0.545 0.606 -0.92 1.15 -0.822
                curveToRelative(
                    dx1 = 0.09f,
                    dy1 = -0.545f,
                    dx2 = 0.606f,
                    dy2 = -0.92f,
                    dx3 = 1.15f,
                    dy3 = -0.822f,
                )
                // c 0.262 0.044 6.433 1.115 9.636 5.387
                curveToRelative(
                    dx1 = 0.262f,
                    dy1 = 0.044f,
                    dx2 = 6.433f,
                    dy2 = 1.115f,
                    dx3 = 9.636f,
                    dy3 = 5.387f,
                )
                // c 0.332 0.441 0.242 1.068 -0.2 1.399
                curveToRelative(
                    dx1 = 0.332f,
                    dy1 = 0.441f,
                    dx2 = 0.242f,
                    dy2 = 1.068f,
                    dx3 = -0.2f,
                    dy3 = 1.399f,
                )
                // c -0.18 0.134 -0.39 0.199 -0.599 0.199z
                curveToRelative(
                    dx1 = -0.18f,
                    dy1 = 0.134f,
                    dx2 = -0.39f,
                    dy2 = 0.199f,
                    dx3 = -0.599f,
                    dy3 = 0.199f,
                )
                close()
                // M 1.001 32.16
                moveTo(x = 1.001f, y = 32.16f)
                // c -0.34 0 -0.671 -0.173 -0.858 -0.485
                curveToRelative(
                    dx1 = -0.34f,
                    dy1 = 0.0f,
                    dx2 = -0.671f,
                    dy2 = -0.173f,
                    dx3 = -0.858f,
                    dy3 = -0.485f,
                )
                // c -0.284 -0.474 -0.131 -1.088 0.343 -1.372
                curveToRelative(
                    dx1 = -0.284f,
                    dy1 = -0.474f,
                    dx2 = -0.131f,
                    dy2 = -1.088f,
                    dx3 = 0.343f,
                    dy3 = -1.372f,
                )
                // c 5.244 -3.146 12.355 -2.175 12.656 -2.133
                curveToRelative(
                    dx1 = 5.244f,
                    dy1 = -3.146f,
                    dx2 = 12.355f,
                    dy2 = -2.175f,
                    dx3 = 12.656f,
                    dy3 = -2.133f,
                )
                // c 0.546 0.078 0.926 0.584 0.848 1.131
                curveToRelative(
                    dx1 = 0.546f,
                    dy1 = 0.078f,
                    dx2 = 0.926f,
                    dy2 = 0.584f,
                    dx3 = 0.848f,
                    dy3 = 1.131f,
                )
                // c -0.078 0.547 -0.582 0.93 -1.13 0.85
                curveToRelative(
                    dx1 = -0.078f,
                    dy1 = 0.547f,
                    dx2 = -0.582f,
                    dy2 = 0.93f,
                    dx3 = -1.13f,
                    dy3 = 0.85f,
                )
                // c -0.066 -0.009 -6.717 -0.909 -11.345 1.867
                curveToRelative(
                    dx1 = -0.066f,
                    dy1 = -0.009f,
                    dx2 = -6.717f,
                    dy2 = -0.909f,
                    dx3 = -11.345f,
                    dy3 = 1.867f,
                )
                // c -0.161 0.096 -0.339 0.142 -0.514 0.142z
                curveToRelative(
                    dx1 = -0.161f,
                    dy1 = 0.096f,
                    dx2 = -0.339f,
                    dy2 = 0.142f,
                    dx3 = -0.514f,
                    dy3 = 0.142f,
                )
                close()
            }
            // M3.999 35.16 c-0.208 0 -0.419 -0.065 -0.599 -0.2 -0.442 -0.331 -0.531 -0.958 -0.2 -1.399 3.203 -4.271 9.375 -5.343 9.635 -5.387 0.548 -0.097 1.059 0.276 1.15 0.821 0.091 0.544 -0.276 1.06 -0.82 1.151 -0.056 0.01 -5.648 0.991 -8.366 4.613 -0.195 0.263 -0.496 0.401 -0.8 0.401z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 3.999 35.16
                moveTo(x = 3.999f, y = 35.16f)
                // c -0.208 0 -0.419 -0.065 -0.599 -0.2
                curveToRelative(
                    dx1 = -0.208f,
                    dy1 = 0.0f,
                    dx2 = -0.419f,
                    dy2 = -0.065f,
                    dx3 = -0.599f,
                    dy3 = -0.2f,
                )
                // c -0.442 -0.331 -0.531 -0.958 -0.2 -1.399
                curveToRelative(
                    dx1 = -0.442f,
                    dy1 = -0.331f,
                    dx2 = -0.531f,
                    dy2 = -0.958f,
                    dx3 = -0.2f,
                    dy3 = -1.399f,
                )
                // c 3.203 -4.271 9.375 -5.343 9.635 -5.387
                curveToRelative(
                    dx1 = 3.203f,
                    dy1 = -4.271f,
                    dx2 = 9.375f,
                    dy2 = -5.343f,
                    dx3 = 9.635f,
                    dy3 = -5.387f,
                )
                // c 0.548 -0.097 1.059 0.276 1.15 0.821
                curveToRelative(
                    dx1 = 0.548f,
                    dy1 = -0.097f,
                    dx2 = 1.059f,
                    dy2 = 0.276f,
                    dx3 = 1.15f,
                    dy3 = 0.821f,
                )
                // c 0.091 0.544 -0.276 1.06 -0.82 1.151
                curveToRelative(
                    dx1 = 0.091f,
                    dy1 = 0.544f,
                    dx2 = -0.276f,
                    dy2 = 1.06f,
                    dx3 = -0.82f,
                    dy3 = 1.151f,
                )
                // c -0.056 0.01 -5.648 0.991 -8.366 4.613
                curveToRelative(
                    dx1 = -0.056f,
                    dy1 = 0.01f,
                    dx2 = -5.648f,
                    dy2 = 0.991f,
                    dx3 = -8.366f,
                    dy3 = 4.613f,
                )
                // c -0.195 0.263 -0.496 0.401 -0.8 0.401z
                curveToRelative(
                    dx1 = -0.195f,
                    dy1 = 0.263f,
                    dx2 = -0.496f,
                    dy2 = 0.401f,
                    dx3 = -0.8f,
                    dy3 = 0.401f,
                )
                close()
            }
            // M12 21 s0 -2 2 -2 2 2 2 2 v2 s0 2 -2 2 -2 -2 -2 -2 v-2z M20 21 s0 -2 2 -2 2 2 2 2 v2 s0 2 -2 2 -2 -2 -2 -2 v-2z
            path(
                fill = SolidColor(Color(0xFF272B2B)),
            ) {
                // M 12 21
                moveTo(x = 12.0f, y = 21.0f)
                // s 0 -2 2 -2
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // s 2 2 2 2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // s 0 2 -2 2
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                    dx2 = -2.0f,
                    dy2 = 2.0f,
                )
                // s -2 -2 -2 -2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                    dx2 = -2.0f,
                    dy2 = -2.0f,
                )
                // v -2z
                verticalLineToRelative(dy = -2.0f)
                close()
                // M 20 21
                moveTo(x = 20.0f, y = 21.0f)
                // s 0 -2 2 -2
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // s 2 2 2 2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // s 0 2 -2 2
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                    dx2 = -2.0f,
                    dy2 = 2.0f,
                )
                // s -2 -2 -2 -2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                    dx2 = -2.0f,
                    dy2 = -2.0f,
                )
                // v -2z
                verticalLineToRelative(dy = -2.0f)
                close()
            }
        }.build().also { _emoji1f42d = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f42d: ImageVector? = null
