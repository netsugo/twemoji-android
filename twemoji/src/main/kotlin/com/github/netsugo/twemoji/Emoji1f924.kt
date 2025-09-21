package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f924: ImageVector
    get() {
        val current = _emoji1f924
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f924",
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
            // M22.5 25 L18 25 c-5.6 0 -7 -1 -7 -1 s1.267 3.594 6.179 3.963 c0.104 0.023 0.211 0.037 0.321 0.037 L22 28 c0.825 0 2 -1.175 2 -2 s-0.675 -1 -1.5 -1z M15.813 17.888 c-0.176 0.143 -0.427 0.147 -0.61 0.014 -0.013 -0.01 -1.261 -0.902 -3.703 -0.902 -2.441 0 -3.69 0.893 -3.7 0.9 -0.183 0.137 -0.435 0.133 -0.611 -0.009 -0.178 -0.142 -0.238 -0.386 -0.146 -0.594 0.06 -0.135 1.5 -3.297 4.457 -3.297 2.958 0 4.397 3.162 4.457 3.297 0.092 0.207 0.032 0.449 -0.144 0.591z M28.812 17.888 c-0.176 0.143 -0.426 0.148 -0.61 0.014 -0.012 -0.01 -1.261 -0.902 -3.702 -0.902 -2.44 0 -3.69 0.893 -3.7 0.9 -0.183 0.137 -0.434 0.133 -0.611 -0.009 -0.178 -0.142 -0.238 -0.386 -0.146 -0.594 0.059 -0.135 1.5 -3.297 4.457 -3.297 2.958 0 4.398 3.162 4.457 3.297 0.092 0.207 0.032 0.449 -0.145 0.591z M13.114 6.002 c0.552 0.021 0.982 0.486 0.961 1.038 -0.022 0.55 -0.484 0.979 -1.034 0.96 -0.156 -0.004 -3.57 -0.052 -6.339 3.357 -0.348 0.427 -0.977 0.494 -1.407 0.145 -0.429 -0.348 -0.494 -0.978 -0.145 -1.407 3.428 -4.219 7.78 -4.1 7.964 -4.093z M22.517 7.674 c0.181 -0.033 4.473 -0.763 8.461 2.933 0.406 0.375 0.43 1.008 0.053 1.413 -0.375 0.407 -1.007 0.429 -1.413 0.054 -3.228 -2.992 -6.608 -2.456 -6.75 -2.432 -0.542 0.093 -1.06 -0.27 -1.155 -0.812 -0.095 -0.541 0.263 -1.057 0.804 -1.156z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 22.5 25
                moveTo(x = 22.5f, y = 25.0f)
                // L 18 25
                lineTo(x = 18.0f, y = 25.0f)
                // c -5.6 0 -7 -1 -7 -1
                curveToRelative(
                    dx1 = -5.6f,
                    dy1 = 0.0f,
                    dx2 = -7.0f,
                    dy2 = -1.0f,
                    dx3 = -7.0f,
                    dy3 = -1.0f,
                )
                // s 1.267 3.594 6.179 3.963
                reflectiveCurveToRelative(
                    dx1 = 1.267f,
                    dy1 = 3.594f,
                    dx2 = 6.179f,
                    dy2 = 3.963f,
                )
                // c 0.104 0.023 0.211 0.037 0.321 0.037
                curveToRelative(
                    dx1 = 0.104f,
                    dy1 = 0.023f,
                    dx2 = 0.211f,
                    dy2 = 0.037f,
                    dx3 = 0.321f,
                    dy3 = 0.037f,
                )
                // L 22 28
                lineTo(x = 22.0f, y = 28.0f)
                // c 0.825 0 2 -1.175 2 -2
                curveToRelative(
                    dx1 = 0.825f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = -1.175f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // s -0.675 -1 -1.5 -1z
                reflectiveCurveToRelative(
                    dx1 = -0.675f,
                    dy1 = -1.0f,
                    dx2 = -1.5f,
                    dy2 = -1.0f,
                )
                close()
                // M 15.813 17.888
                moveTo(x = 15.813f, y = 17.888f)
                // c -0.176 0.143 -0.427 0.147 -0.61 0.014
                curveToRelative(
                    dx1 = -0.176f,
                    dy1 = 0.143f,
                    dx2 = -0.427f,
                    dy2 = 0.147f,
                    dx3 = -0.61f,
                    dy3 = 0.014f,
                )
                // c -0.013 -0.01 -1.261 -0.902 -3.703 -0.902
                curveToRelative(
                    dx1 = -0.013f,
                    dy1 = -0.01f,
                    dx2 = -1.261f,
                    dy2 = -0.902f,
                    dx3 = -3.703f,
                    dy3 = -0.902f,
                )
                // c -2.441 0 -3.69 0.893 -3.7 0.9
                curveToRelative(
                    dx1 = -2.441f,
                    dy1 = 0.0f,
                    dx2 = -3.69f,
                    dy2 = 0.893f,
                    dx3 = -3.7f,
                    dy3 = 0.9f,
                )
                // c -0.183 0.137 -0.435 0.133 -0.611 -0.009
                curveToRelative(
                    dx1 = -0.183f,
                    dy1 = 0.137f,
                    dx2 = -0.435f,
                    dy2 = 0.133f,
                    dx3 = -0.611f,
                    dy3 = -0.009f,
                )
                // c -0.178 -0.142 -0.238 -0.386 -0.146 -0.594
                curveToRelative(
                    dx1 = -0.178f,
                    dy1 = -0.142f,
                    dx2 = -0.238f,
                    dy2 = -0.386f,
                    dx3 = -0.146f,
                    dy3 = -0.594f,
                )
                // c 0.06 -0.135 1.5 -3.297 4.457 -3.297
                curveToRelative(
                    dx1 = 0.06f,
                    dy1 = -0.135f,
                    dx2 = 1.5f,
                    dy2 = -3.297f,
                    dx3 = 4.457f,
                    dy3 = -3.297f,
                )
                // c 2.958 0 4.397 3.162 4.457 3.297
                curveToRelative(
                    dx1 = 2.958f,
                    dy1 = 0.0f,
                    dx2 = 4.397f,
                    dy2 = 3.162f,
                    dx3 = 4.457f,
                    dy3 = 3.297f,
                )
                // c 0.092 0.207 0.032 0.449 -0.144 0.591z
                curveToRelative(
                    dx1 = 0.092f,
                    dy1 = 0.207f,
                    dx2 = 0.032f,
                    dy2 = 0.449f,
                    dx3 = -0.144f,
                    dy3 = 0.591f,
                )
                close()
                // M 28.812 17.888
                moveTo(x = 28.812f, y = 17.888f)
                // c -0.176 0.143 -0.426 0.148 -0.61 0.014
                curveToRelative(
                    dx1 = -0.176f,
                    dy1 = 0.143f,
                    dx2 = -0.426f,
                    dy2 = 0.148f,
                    dx3 = -0.61f,
                    dy3 = 0.014f,
                )
                // c -0.012 -0.01 -1.261 -0.902 -3.702 -0.902
                curveToRelative(
                    dx1 = -0.012f,
                    dy1 = -0.01f,
                    dx2 = -1.261f,
                    dy2 = -0.902f,
                    dx3 = -3.702f,
                    dy3 = -0.902f,
                )
                // c -2.44 0 -3.69 0.893 -3.7 0.9
                curveToRelative(
                    dx1 = -2.44f,
                    dy1 = 0.0f,
                    dx2 = -3.69f,
                    dy2 = 0.893f,
                    dx3 = -3.7f,
                    dy3 = 0.9f,
                )
                // c -0.183 0.137 -0.434 0.133 -0.611 -0.009
                curveToRelative(
                    dx1 = -0.183f,
                    dy1 = 0.137f,
                    dx2 = -0.434f,
                    dy2 = 0.133f,
                    dx3 = -0.611f,
                    dy3 = -0.009f,
                )
                // c -0.178 -0.142 -0.238 -0.386 -0.146 -0.594
                curveToRelative(
                    dx1 = -0.178f,
                    dy1 = -0.142f,
                    dx2 = -0.238f,
                    dy2 = -0.386f,
                    dx3 = -0.146f,
                    dy3 = -0.594f,
                )
                // c 0.059 -0.135 1.5 -3.297 4.457 -3.297
                curveToRelative(
                    dx1 = 0.059f,
                    dy1 = -0.135f,
                    dx2 = 1.5f,
                    dy2 = -3.297f,
                    dx3 = 4.457f,
                    dy3 = -3.297f,
                )
                // c 2.958 0 4.398 3.162 4.457 3.297
                curveToRelative(
                    dx1 = 2.958f,
                    dy1 = 0.0f,
                    dx2 = 4.398f,
                    dy2 = 3.162f,
                    dx3 = 4.457f,
                    dy3 = 3.297f,
                )
                // c 0.092 0.207 0.032 0.449 -0.145 0.591z
                curveToRelative(
                    dx1 = 0.092f,
                    dy1 = 0.207f,
                    dx2 = 0.032f,
                    dy2 = 0.449f,
                    dx3 = -0.145f,
                    dy3 = 0.591f,
                )
                close()
                // M 13.114 6.002
                moveTo(x = 13.114f, y = 6.002f)
                // c 0.552 0.021 0.982 0.486 0.961 1.038
                curveToRelative(
                    dx1 = 0.552f,
                    dy1 = 0.021f,
                    dx2 = 0.982f,
                    dy2 = 0.486f,
                    dx3 = 0.961f,
                    dy3 = 1.038f,
                )
                // c -0.022 0.55 -0.484 0.979 -1.034 0.96
                curveToRelative(
                    dx1 = -0.022f,
                    dy1 = 0.55f,
                    dx2 = -0.484f,
                    dy2 = 0.979f,
                    dx3 = -1.034f,
                    dy3 = 0.96f,
                )
                // c -0.156 -0.004 -3.57 -0.052 -6.339 3.357
                curveToRelative(
                    dx1 = -0.156f,
                    dy1 = -0.004f,
                    dx2 = -3.57f,
                    dy2 = -0.052f,
                    dx3 = -6.339f,
                    dy3 = 3.357f,
                )
                // c -0.348 0.427 -0.977 0.494 -1.407 0.145
                curveToRelative(
                    dx1 = -0.348f,
                    dy1 = 0.427f,
                    dx2 = -0.977f,
                    dy2 = 0.494f,
                    dx3 = -1.407f,
                    dy3 = 0.145f,
                )
                // c -0.429 -0.348 -0.494 -0.978 -0.145 -1.407
                curveToRelative(
                    dx1 = -0.429f,
                    dy1 = -0.348f,
                    dx2 = -0.494f,
                    dy2 = -0.978f,
                    dx3 = -0.145f,
                    dy3 = -1.407f,
                )
                // c 3.428 -4.219 7.78 -4.1 7.964 -4.093z
                curveToRelative(
                    dx1 = 3.428f,
                    dy1 = -4.219f,
                    dx2 = 7.78f,
                    dy2 = -4.1f,
                    dx3 = 7.964f,
                    dy3 = -4.093f,
                )
                close()
                // M 22.517 7.674
                moveTo(x = 22.517f, y = 7.674f)
                // c 0.181 -0.033 4.473 -0.763 8.461 2.933
                curveToRelative(
                    dx1 = 0.181f,
                    dy1 = -0.033f,
                    dx2 = 4.473f,
                    dy2 = -0.763f,
                    dx3 = 8.461f,
                    dy3 = 2.933f,
                )
                // c 0.406 0.375 0.43 1.008 0.053 1.413
                curveToRelative(
                    dx1 = 0.406f,
                    dy1 = 0.375f,
                    dx2 = 0.43f,
                    dy2 = 1.008f,
                    dx3 = 0.053f,
                    dy3 = 1.413f,
                )
                // c -0.375 0.407 -1.007 0.429 -1.413 0.054
                curveToRelative(
                    dx1 = -0.375f,
                    dy1 = 0.407f,
                    dx2 = -1.007f,
                    dy2 = 0.429f,
                    dx3 = -1.413f,
                    dy3 = 0.054f,
                )
                // c -3.228 -2.992 -6.608 -2.456 -6.75 -2.432
                curveToRelative(
                    dx1 = -3.228f,
                    dy1 = -2.992f,
                    dx2 = -6.608f,
                    dy2 = -2.456f,
                    dx3 = -6.75f,
                    dy3 = -2.432f,
                )
                // c -0.542 0.093 -1.06 -0.27 -1.155 -0.812
                curveToRelative(
                    dx1 = -0.542f,
                    dy1 = 0.093f,
                    dx2 = -1.06f,
                    dy2 = -0.27f,
                    dx3 = -1.155f,
                    dy3 = -0.812f,
                )
                // c -0.095 -0.541 0.263 -1.057 0.804 -1.156z
                curveToRelative(
                    dx1 = -0.095f,
                    dy1 = -0.541f,
                    dx2 = 0.263f,
                    dy2 = -1.057f,
                    dx3 = 0.804f,
                    dy3 = -1.156f,
                )
                close()
            }
            // M23 26 h-3 c-0.55 0 -1 0.45 -1 1 v4 c0 0.55 0.45 1 1 1 s1 -0.45 1 -1 v3.5 c0 0.825 0.675 1.5 1.5 1.5 s1.5 -0.675 1.5 -1.5 V27 c0 -0.55 -0.45 -1 -1 -1z
            path(
                fill = SolidColor(Color(0xFF88C9F9)),
            ) {
                // M 23 26
                moveTo(x = 23.0f, y = 26.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // c -0.55 0 -1 0.45 -1 1
                curveToRelative(
                    dx1 = -0.55f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = 0.45f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // c 0 0.55 0.45 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.55f,
                    dx2 = 0.45f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // s 1 -0.45 1 -1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = -0.45f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // v 3.5
                verticalLineToRelative(dy = 3.5f)
                // c 0 0.825 0.675 1.5 1.5 1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.825f,
                    dx2 = 0.675f,
                    dy2 = 1.5f,
                    dx3 = 1.5f,
                    dy3 = 1.5f,
                )
                // s 1.5 -0.675 1.5 -1.5
                reflectiveCurveToRelative(
                    dx1 = 1.5f,
                    dy1 = -0.675f,
                    dx2 = 1.5f,
                    dy2 = -1.5f,
                )
                // V 27
                verticalLineTo(y = 27.0f)
                // c 0 -0.55 -0.45 -1 -1 -1z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.55f,
                    dx2 = -0.45f,
                    dy2 = -1.0f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                close()
            }
        }.build().also { _emoji1f924 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f924: ImageVector? = null
