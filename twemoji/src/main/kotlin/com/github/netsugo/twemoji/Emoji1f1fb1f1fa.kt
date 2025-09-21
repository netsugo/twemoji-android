package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1fb1f1fa: ImageVector
    get() {
        val current = _emoji1f1fb1f1fa
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1fb1f1fa",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M32 5 H4 C1.791 5 0 6.791 0 9 v9 h36 V9 c0 -2.209 -1.791 -4 -4 -4z
            path(
                fill = SolidColor(Color(0xFFD21034)),
            ) {
                // M 32 5
                moveTo(x = 32.0f, y = 5.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // C 1.791 5 0 6.791 0 9
                curveTo(
                    x1 = 1.791f,
                    y1 = 5.0f,
                    x2 = 0.0f,
                    y2 = 6.791f,
                    x3 = 0.0f,
                    y3 = 9.0f,
                )
                // v 9
                verticalLineToRelative(dy = 9.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // V 9
                verticalLineTo(y = 9.0f)
                // c 0 -2.209 -1.791 -4 -4 -4z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.209f,
                    dx2 = -1.791f,
                    dy2 = -4.0f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                close()
            }
            // M4 31 h28 c2.209 0 4 -1.791 4 -4 v-9 H0 v9 c0 2.209 1.791 4 4 4z
            path(
                fill = SolidColor(Color(0xFF009543)),
            ) {
                // M 4 31
                moveTo(x = 4.0f, y = 31.0f)
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // c 2.209 0 4 -1.791 4 -4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = -1.791f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // v -9
                verticalLineToRelative(dy = -9.0f)
                // H 0
                horizontalLineTo(x = 0.0f)
                // v 9
                verticalLineToRelative(dy = 9.0f)
                // c 0 2.209 1.791 4 4 4z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = 1.791f,
                    dy2 = 4.0f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                close()
            }
            // M17 15 L1.732 5.705 c-0.474 0.327 -0.874 0.754 -1.17 1.25 l-0.002 0.002 C0.205 7.555 0 8.254 0 9 v18 c0 0.747 0.205 1.447 0.562 2.045 l0.001 0.003 c0.301 0.504 0.71 0.937 1.195 1.265 h0.001 L17 21 h19 v-6 H17z
            path(
                fill = SolidColor(Color(0xFF141414)),
            ) {
                // M 17 15
                moveTo(x = 17.0f, y = 15.0f)
                // L 1.732 5.705
                lineTo(x = 1.732f, y = 5.705f)
                // c -0.474 0.327 -0.874 0.754 -1.17 1.25
                curveToRelative(
                    dx1 = -0.474f,
                    dy1 = 0.327f,
                    dx2 = -0.874f,
                    dy2 = 0.754f,
                    dx3 = -1.17f,
                    dy3 = 1.25f,
                )
                // l -0.002 0.002
                lineToRelative(dx = -0.002f, dy = 0.002f)
                // C 0.205 7.555 0 8.254 0 9
                curveTo(
                    x1 = 0.205f,
                    y1 = 7.555f,
                    x2 = 0.0f,
                    y2 = 8.254f,
                    x3 = 0.0f,
                    y3 = 9.0f,
                )
                // v 18
                verticalLineToRelative(dy = 18.0f)
                // c 0 0.747 0.205 1.447 0.562 2.045
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.747f,
                    dx2 = 0.205f,
                    dy2 = 1.447f,
                    dx3 = 0.562f,
                    dy3 = 2.045f,
                )
                // l 0.001 0.003
                lineToRelative(dx = 0.001f, dy = 0.003f)
                // c 0.301 0.504 0.71 0.937 1.195 1.265
                curveToRelative(
                    dx1 = 0.301f,
                    dy1 = 0.504f,
                    dx2 = 0.71f,
                    dy2 = 0.937f,
                    dx3 = 1.195f,
                    dy3 = 1.265f,
                )
                // h 0.001
                horizontalLineToRelative(dx = 0.001f)
                // L 17 21
                lineTo(x = 17.0f, y = 21.0f)
                // h 19
                horizontalLineToRelative(dx = 19.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // H 17z
                horizontalLineTo(x = 17.0f)
                close()
            }
            // M0.562 6.955 l-0.002 0.002 C0.205 7.555 0 8.254 0 9 l15 9 -15 9 c0 0.747 0.205 1.447 0.562 2.045 L17 19 h19 v-2 H17 L0.562 6.955z
            path(
                fill = SolidColor(Color(0xFFFDCE12)),
            ) {
                // M 0.562 6.955
                moveTo(x = 0.562f, y = 6.955f)
                // l -0.002 0.002
                lineToRelative(dx = -0.002f, dy = 0.002f)
                // C 0.205 7.555 0 8.254 0 9
                curveTo(
                    x1 = 0.205f,
                    y1 = 7.555f,
                    x2 = 0.0f,
                    y2 = 8.254f,
                    x3 = 0.0f,
                    y3 = 9.0f,
                )
                // l 15 9
                lineToRelative(dx = 15.0f, dy = 9.0f)
                // l -15 9
                lineToRelative(dx = -15.0f, dy = 9.0f)
                // c 0 0.747 0.205 1.447 0.562 2.045
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.747f,
                    dx2 = 0.205f,
                    dy2 = 1.447f,
                    dx3 = 0.562f,
                    dy3 = 2.045f,
                )
                // L 17 19
                lineTo(x = 17.0f, y = 19.0f)
                // h 19
                horizontalLineToRelative(dx = 19.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 17
                horizontalLineTo(x = 17.0f)
                // L 0.562 6.955z
                lineTo(x = 0.562f, y = 6.955f)
                close()
            }
            // M4.375 21.606 s3.25 -0.5 3.25 -3.71 c0 -1.974 -1.708 -3.062 -3.042 -3.062 -1.333 0 -2.75 1 -2.75 2.75 s1.625 2.292 2.417 2.292 2 -0.625 1.833 -2 c-0.464 1.913 -2.413 1.858 -3.167 0.708 -0.833 -1.271 0.459 -3.084 2.126 -2.584 1.579 0.474 1.661 2.081 1.125 3.084 -0.667 1.25 -1.771 1.188 -1.771 1.188 l-0.021 1.334z
            path(
                fill = SolidColor(Color(0xFFFDCE12)),
            ) {
                // M 4.375 21.606
                moveTo(x = 4.375f, y = 21.606f)
                // s 3.25 -0.5 3.25 -3.71
                reflectiveCurveToRelative(
                    dx1 = 3.25f,
                    dy1 = -0.5f,
                    dx2 = 3.25f,
                    dy2 = -3.71f,
                )
                // c 0 -1.974 -1.708 -3.062 -3.042 -3.062
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.974f,
                    dx2 = -1.708f,
                    dy2 = -3.062f,
                    dx3 = -3.042f,
                    dy3 = -3.062f,
                )
                // c -1.333 0 -2.75 1 -2.75 2.75
                curveToRelative(
                    dx1 = -1.333f,
                    dy1 = 0.0f,
                    dx2 = -2.75f,
                    dy2 = 1.0f,
                    dx3 = -2.75f,
                    dy3 = 2.75f,
                )
                // s 1.625 2.292 2.417 2.292
                reflectiveCurveToRelative(
                    dx1 = 1.625f,
                    dy1 = 2.292f,
                    dx2 = 2.417f,
                    dy2 = 2.292f,
                )
                // s 2 -0.625 1.833 -2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = -0.625f,
                    dx2 = 1.833f,
                    dy2 = -2.0f,
                )
                // c -0.464 1.913 -2.413 1.858 -3.167 0.708
                curveToRelative(
                    dx1 = -0.464f,
                    dy1 = 1.913f,
                    dx2 = -2.413f,
                    dy2 = 1.858f,
                    dx3 = -3.167f,
                    dy3 = 0.708f,
                )
                // c -0.833 -1.271 0.459 -3.084 2.126 -2.584
                curveToRelative(
                    dx1 = -0.833f,
                    dy1 = -1.271f,
                    dx2 = 0.459f,
                    dy2 = -3.084f,
                    dx3 = 2.126f,
                    dy3 = -2.584f,
                )
                // c 1.579 0.474 1.661 2.081 1.125 3.084
                curveToRelative(
                    dx1 = 1.579f,
                    dy1 = 0.474f,
                    dx2 = 1.661f,
                    dy2 = 2.081f,
                    dx3 = 1.125f,
                    dy3 = 3.084f,
                )
                // c -0.667 1.25 -1.771 1.188 -1.771 1.188
                curveToRelative(
                    dx1 = -0.667f,
                    dy1 = 1.25f,
                    dx2 = -1.771f,
                    dy2 = 1.188f,
                    dx3 = -1.771f,
                    dy3 = 1.188f,
                )
                // l -0.021 1.334z
                lineToRelative(dx = -0.021f, dy = 1.334f)
                close()
            }
            // M5.376 18.021 c-0.183 -0.242 -0.407 -0.461 -0.636 -0.653 0.492 -0.505 0.911 -0.648 0.781 -0.722 -0.089 -0.051 -0.549 0.156 -1.041 0.516 -0.492 -0.36 -0.952 -0.567 -1.041 -0.516 -0.13 0.075 0.289 0.218 0.781 0.722 -0.229 0.192 -0.453 0.41 -0.636 0.653 -0.199 0.263 -0.167 0.708 -0.167 0.708 s0.269 -0.108 0.5 -0.333 c0.187 -0.181 0.347 -0.446 0.563 -0.723 0.216 0.277 0.376 0.542 0.563 0.723 0.231 0.225 0.5 0.333 0.5 0.333 s0.032 -0.445 -0.167 -0.708z
            path(
                fill = SolidColor(Color(0xFFFDCE12)),
            ) {
                // M 5.376 18.021
                moveTo(x = 5.376f, y = 18.021f)
                // c -0.183 -0.242 -0.407 -0.461 -0.636 -0.653
                curveToRelative(
                    dx1 = -0.183f,
                    dy1 = -0.242f,
                    dx2 = -0.407f,
                    dy2 = -0.461f,
                    dx3 = -0.636f,
                    dy3 = -0.653f,
                )
                // c 0.492 -0.505 0.911 -0.648 0.781 -0.722
                curveToRelative(
                    dx1 = 0.492f,
                    dy1 = -0.505f,
                    dx2 = 0.911f,
                    dy2 = -0.648f,
                    dx3 = 0.781f,
                    dy3 = -0.722f,
                )
                // c -0.089 -0.051 -0.549 0.156 -1.041 0.516
                curveToRelative(
                    dx1 = -0.089f,
                    dy1 = -0.051f,
                    dx2 = -0.549f,
                    dy2 = 0.156f,
                    dx3 = -1.041f,
                    dy3 = 0.516f,
                )
                // c -0.492 -0.36 -0.952 -0.567 -1.041 -0.516
                curveToRelative(
                    dx1 = -0.492f,
                    dy1 = -0.36f,
                    dx2 = -0.952f,
                    dy2 = -0.567f,
                    dx3 = -1.041f,
                    dy3 = -0.516f,
                )
                // c -0.13 0.075 0.289 0.218 0.781 0.722
                curveToRelative(
                    dx1 = -0.13f,
                    dy1 = 0.075f,
                    dx2 = 0.289f,
                    dy2 = 0.218f,
                    dx3 = 0.781f,
                    dy3 = 0.722f,
                )
                // c -0.229 0.192 -0.453 0.41 -0.636 0.653
                curveToRelative(
                    dx1 = -0.229f,
                    dy1 = 0.192f,
                    dx2 = -0.453f,
                    dy2 = 0.41f,
                    dx3 = -0.636f,
                    dy3 = 0.653f,
                )
                // c -0.199 0.263 -0.167 0.708 -0.167 0.708
                curveToRelative(
                    dx1 = -0.199f,
                    dy1 = 0.263f,
                    dx2 = -0.167f,
                    dy2 = 0.708f,
                    dx3 = -0.167f,
                    dy3 = 0.708f,
                )
                // s 0.269 -0.108 0.5 -0.333
                reflectiveCurveToRelative(
                    dx1 = 0.269f,
                    dy1 = -0.108f,
                    dx2 = 0.5f,
                    dy2 = -0.333f,
                )
                // c 0.187 -0.181 0.347 -0.446 0.563 -0.723
                curveToRelative(
                    dx1 = 0.187f,
                    dy1 = -0.181f,
                    dx2 = 0.347f,
                    dy2 = -0.446f,
                    dx3 = 0.563f,
                    dy3 = -0.723f,
                )
                // c 0.216 0.277 0.376 0.542 0.563 0.723
                curveToRelative(
                    dx1 = 0.216f,
                    dy1 = 0.277f,
                    dx2 = 0.376f,
                    dy2 = 0.542f,
                    dx3 = 0.563f,
                    dy3 = 0.723f,
                )
                // c 0.231 0.225 0.5 0.333 0.5 0.333
                curveToRelative(
                    dx1 = 0.231f,
                    dy1 = 0.225f,
                    dx2 = 0.5f,
                    dy2 = 0.333f,
                    dx3 = 0.5f,
                    dy3 = 0.333f,
                )
                // s 0.032 -0.445 -0.167 -0.708z
                reflectiveCurveToRelative(
                    dx1 = 0.032f,
                    dy1 = -0.445f,
                    dx2 = -0.167f,
                    dy2 = -0.708f,
                )
                close()
            }
        }.build().also { _emoji1f1fb1f1fa = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1fb1f1fa: ImageVector? = null
