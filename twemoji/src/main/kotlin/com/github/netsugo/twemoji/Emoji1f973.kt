package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f973: ImageVector
    get() {
        val current = _emoji1f973
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f973",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M17 19 m-17 0 a17 17 0 1 1 34 0 a17 17 0 1 1 -34 0
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 17 19
                moveTo(x = 17.0f, y = 19.0f)
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
            // M15.999 26 a2 2.5 0 1 0 4 0 a2 2.5 0 1 0 -4 0z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 15.999 26
                moveTo(x = 15.999f, y = 26.0f)
                // a 2 2.5 0 1 0 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2.5 0 1 0 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M8.111 21.383 c-0.182 0 -0.367 -0.05 -0.532 -0.154 -0.467 -0.294 -0.607 -0.911 -0.313 -1.379 0.916 -1.453 3.701 -3.938 7.69 -2.962 0.536 0.131 0.864 0.673 0.733 1.209 -0.132 0.536 -0.676 0.862 -1.209 0.733 -3.604 -0.882 -5.502 2.056 -5.521 2.086 -0.191 0.302 -0.516 0.467 -0.848 0.467z M20.084 17.641 c-0.29 0 -0.576 -0.125 -0.774 -0.366 -0.35 -0.427 -0.288 -1.058 0.14 -1.408 3.176 -2.604 6.762 -1.562 8.215 -0.646 0.467 0.294 0.607 0.912 0.312 1.379 -0.293 0.465 -0.908 0.607 -1.376 0.315 -0.138 -0.084 -3.052 -1.823 -5.884 0.499 -0.186 0.153 -0.41 0.227 -0.633 0.227z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 8.111 21.383
                moveTo(x = 8.111f, y = 21.383f)
                // c -0.182 0 -0.367 -0.05 -0.532 -0.154
                curveToRelative(
                    dx1 = -0.182f,
                    dy1 = 0.0f,
                    dx2 = -0.367f,
                    dy2 = -0.05f,
                    dx3 = -0.532f,
                    dy3 = -0.154f,
                )
                // c -0.467 -0.294 -0.607 -0.911 -0.313 -1.379
                curveToRelative(
                    dx1 = -0.467f,
                    dy1 = -0.294f,
                    dx2 = -0.607f,
                    dy2 = -0.911f,
                    dx3 = -0.313f,
                    dy3 = -1.379f,
                )
                // c 0.916 -1.453 3.701 -3.938 7.69 -2.962
                curveToRelative(
                    dx1 = 0.916f,
                    dy1 = -1.453f,
                    dx2 = 3.701f,
                    dy2 = -3.938f,
                    dx3 = 7.69f,
                    dy3 = -2.962f,
                )
                // c 0.536 0.131 0.864 0.673 0.733 1.209
                curveToRelative(
                    dx1 = 0.536f,
                    dy1 = 0.131f,
                    dx2 = 0.864f,
                    dy2 = 0.673f,
                    dx3 = 0.733f,
                    dy3 = 1.209f,
                )
                // c -0.132 0.536 -0.676 0.862 -1.209 0.733
                curveToRelative(
                    dx1 = -0.132f,
                    dy1 = 0.536f,
                    dx2 = -0.676f,
                    dy2 = 0.862f,
                    dx3 = -1.209f,
                    dy3 = 0.733f,
                )
                // c -3.604 -0.882 -5.502 2.056 -5.521 2.086
                curveToRelative(
                    dx1 = -3.604f,
                    dy1 = -0.882f,
                    dx2 = -5.502f,
                    dy2 = 2.056f,
                    dx3 = -5.521f,
                    dy3 = 2.086f,
                )
                // c -0.191 0.302 -0.516 0.467 -0.848 0.467z
                curveToRelative(
                    dx1 = -0.191f,
                    dy1 = 0.302f,
                    dx2 = -0.516f,
                    dy2 = 0.467f,
                    dx3 = -0.848f,
                    dy3 = 0.467f,
                )
                close()
                // M 20.084 17.641
                moveTo(x = 20.084f, y = 17.641f)
                // c -0.29 0 -0.576 -0.125 -0.774 -0.366
                curveToRelative(
                    dx1 = -0.29f,
                    dy1 = 0.0f,
                    dx2 = -0.576f,
                    dy2 = -0.125f,
                    dx3 = -0.774f,
                    dy3 = -0.366f,
                )
                // c -0.35 -0.427 -0.288 -1.058 0.14 -1.408
                curveToRelative(
                    dx1 = -0.35f,
                    dy1 = -0.427f,
                    dx2 = -0.288f,
                    dy2 = -1.058f,
                    dx3 = 0.14f,
                    dy3 = -1.408f,
                )
                // c 3.176 -2.604 6.762 -1.562 8.215 -0.646
                curveToRelative(
                    dx1 = 3.176f,
                    dy1 = -2.604f,
                    dx2 = 6.762f,
                    dy2 = -1.562f,
                    dx3 = 8.215f,
                    dy3 = -0.646f,
                )
                // c 0.467 0.294 0.607 0.912 0.312 1.379
                curveToRelative(
                    dx1 = 0.467f,
                    dy1 = 0.294f,
                    dx2 = 0.607f,
                    dy2 = 0.912f,
                    dx3 = 0.312f,
                    dy3 = 1.379f,
                )
                // c -0.293 0.465 -0.908 0.607 -1.376 0.315
                curveToRelative(
                    dx1 = -0.293f,
                    dy1 = 0.465f,
                    dx2 = -0.908f,
                    dy2 = 0.607f,
                    dx3 = -1.376f,
                    dy3 = 0.315f,
                )
                // c -0.138 -0.084 -3.052 -1.823 -5.884 0.499
                curveToRelative(
                    dx1 = -0.138f,
                    dy1 = -0.084f,
                    dx2 = -3.052f,
                    dy2 = -1.823f,
                    dx3 = -5.884f,
                    dy3 = 0.499f,
                )
                // c -0.186 0.153 -0.41 0.227 -0.633 0.227z
                curveToRelative(
                    dx1 = -0.186f,
                    dy1 = 0.153f,
                    dx2 = -0.41f,
                    dy2 = 0.227f,
                    dx3 = -0.633f,
                    dy3 = 0.227f,
                )
                close()
            }
            // M13.346 31.273 c-0.068 0 -0.137 -0.009 -0.205 -0.028 -0.398 -0.113 -0.63 -0.527 -0.517 -0.926 0.437 -1.54 0.258 -3.029 -0.49 -4.086 -0.497 -0.702 -1.205 -1.131 -1.943 -1.178 -0.414 -0.025 -0.728 -0.382 -0.702 -0.795 s0.381 -0.751 0.795 -0.701 c1.193 0.074 2.313 0.733 3.073 1.807 1.011 1.429 1.27 3.383 0.709 5.361 -0.093 0.331 -0.394 0.546 -0.72 0.546z M24.383 28.212 c-0.142 0 -0.285 -0.04 -0.412 -0.124 -1.167 -0.77 -1.82 -2.117 -1.792 -3.695 0.029 -1.635 0.809 -3.153 1.984 -3.869 0.353 -0.216 0.814 -0.104 1.03 0.251 0.216 0.354 0.104 0.814 -0.251 1.03 -0.735 0.448 -1.244 1.499 -1.264 2.614 -0.02 1.055 0.389 1.936 1.118 2.417 0.346 0.228 0.441 0.693 0.213 1.039 -0.144 0.219 -0.382 0.337 -0.626 0.337z
            path(
                fill = SolidColor(Color(0xFFE2A62D)),
            ) {
                // M 13.346 31.273
                moveTo(x = 13.346f, y = 31.273f)
                // c -0.068 0 -0.137 -0.009 -0.205 -0.028
                curveToRelative(
                    dx1 = -0.068f,
                    dy1 = 0.0f,
                    dx2 = -0.137f,
                    dy2 = -0.009f,
                    dx3 = -0.205f,
                    dy3 = -0.028f,
                )
                // c -0.398 -0.113 -0.63 -0.527 -0.517 -0.926
                curveToRelative(
                    dx1 = -0.398f,
                    dy1 = -0.113f,
                    dx2 = -0.63f,
                    dy2 = -0.527f,
                    dx3 = -0.517f,
                    dy3 = -0.926f,
                )
                // c 0.437 -1.54 0.258 -3.029 -0.49 -4.086
                curveToRelative(
                    dx1 = 0.437f,
                    dy1 = -1.54f,
                    dx2 = 0.258f,
                    dy2 = -3.029f,
                    dx3 = -0.49f,
                    dy3 = -4.086f,
                )
                // c -0.497 -0.702 -1.205 -1.131 -1.943 -1.178
                curveToRelative(
                    dx1 = -0.497f,
                    dy1 = -0.702f,
                    dx2 = -1.205f,
                    dy2 = -1.131f,
                    dx3 = -1.943f,
                    dy3 = -1.178f,
                )
                // c -0.414 -0.025 -0.728 -0.382 -0.702 -0.795
                curveToRelative(
                    dx1 = -0.414f,
                    dy1 = -0.025f,
                    dx2 = -0.728f,
                    dy2 = -0.382f,
                    dx3 = -0.702f,
                    dy3 = -0.795f,
                )
                // s 0.381 -0.751 0.795 -0.701
                reflectiveCurveToRelative(
                    dx1 = 0.381f,
                    dy1 = -0.751f,
                    dx2 = 0.795f,
                    dy2 = -0.701f,
                )
                // c 1.193 0.074 2.313 0.733 3.073 1.807
                curveToRelative(
                    dx1 = 1.193f,
                    dy1 = 0.074f,
                    dx2 = 2.313f,
                    dy2 = 0.733f,
                    dx3 = 3.073f,
                    dy3 = 1.807f,
                )
                // c 1.011 1.429 1.27 3.383 0.709 5.361
                curveToRelative(
                    dx1 = 1.011f,
                    dy1 = 1.429f,
                    dx2 = 1.27f,
                    dy2 = 3.383f,
                    dx3 = 0.709f,
                    dy3 = 5.361f,
                )
                // c -0.093 0.331 -0.394 0.546 -0.72 0.546z
                curveToRelative(
                    dx1 = -0.093f,
                    dy1 = 0.331f,
                    dx2 = -0.394f,
                    dy2 = 0.546f,
                    dx3 = -0.72f,
                    dy3 = 0.546f,
                )
                close()
                // M 24.383 28.212
                moveTo(x = 24.383f, y = 28.212f)
                // c -0.142 0 -0.285 -0.04 -0.412 -0.124
                curveToRelative(
                    dx1 = -0.142f,
                    dy1 = 0.0f,
                    dx2 = -0.285f,
                    dy2 = -0.04f,
                    dx3 = -0.412f,
                    dy3 = -0.124f,
                )
                // c -1.167 -0.77 -1.82 -2.117 -1.792 -3.695
                curveToRelative(
                    dx1 = -1.167f,
                    dy1 = -0.77f,
                    dx2 = -1.82f,
                    dy2 = -2.117f,
                    dx3 = -1.792f,
                    dy3 = -3.695f,
                )
                // c 0.029 -1.635 0.809 -3.153 1.984 -3.869
                curveToRelative(
                    dx1 = 0.029f,
                    dy1 = -1.635f,
                    dx2 = 0.809f,
                    dy2 = -3.153f,
                    dx3 = 1.984f,
                    dy3 = -3.869f,
                )
                // c 0.353 -0.216 0.814 -0.104 1.03 0.251
                curveToRelative(
                    dx1 = 0.353f,
                    dy1 = -0.216f,
                    dx2 = 0.814f,
                    dy2 = -0.104f,
                    dx3 = 1.03f,
                    dy3 = 0.251f,
                )
                // c 0.216 0.354 0.104 0.814 -0.251 1.03
                curveToRelative(
                    dx1 = 0.216f,
                    dy1 = 0.354f,
                    dx2 = 0.104f,
                    dy2 = 0.814f,
                    dx3 = -0.251f,
                    dy3 = 1.03f,
                )
                // c -0.735 0.448 -1.244 1.499 -1.264 2.614
                curveToRelative(
                    dx1 = -0.735f,
                    dy1 = 0.448f,
                    dx2 = -1.244f,
                    dy2 = 1.499f,
                    dx3 = -1.264f,
                    dy3 = 2.614f,
                )
                // c -0.02 1.055 0.389 1.936 1.118 2.417
                curveToRelative(
                    dx1 = -0.02f,
                    dy1 = 1.055f,
                    dx2 = 0.389f,
                    dy2 = 1.936f,
                    dx3 = 1.118f,
                    dy3 = 2.417f,
                )
                // c 0.346 0.228 0.441 0.693 0.213 1.039
                curveToRelative(
                    dx1 = 0.346f,
                    dy1 = 0.228f,
                    dx2 = 0.441f,
                    dy2 = 0.693f,
                    dx3 = 0.213f,
                    dy3 = 1.039f,
                )
                // c -0.144 0.219 -0.382 0.337 -0.626 0.337z
                curveToRelative(
                    dx1 = -0.144f,
                    dy1 = 0.219f,
                    dx2 = -0.382f,
                    dy2 = 0.337f,
                    dx3 = -0.626f,
                    dy3 = 0.337f,
                )
                close()
            }
            // M17.179 2.72 c-0.043 -0.049 -0.11 -0.076 -0.189 -0.091 0 0 -15.924 -3.023 -16.613 -2.415 C-0.311 0.823 0.74 16.998 0.74 16.998 c0.005 0.081 0.023 0.15 0.067 0.199 0.604 0.684 4.758 -2.004 9.279 -6.001 4.522 -3.998 7.697 -7.792 7.093 -8.476z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 17.179 2.72
                moveTo(x = 17.179f, y = 2.72f)
                // c -0.043 -0.049 -0.11 -0.076 -0.189 -0.091
                curveToRelative(
                    dx1 = -0.043f,
                    dy1 = -0.049f,
                    dx2 = -0.11f,
                    dy2 = -0.076f,
                    dx3 = -0.189f,
                    dy3 = -0.091f,
                )
                // c 0 0 -15.924 -3.023 -16.613 -2.415
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -15.924f,
                    dy2 = -3.023f,
                    dx3 = -16.613f,
                    dy3 = -2.415f,
                )
                // C -0.311 0.823 0.74 16.998 0.74 16.998
                curveTo(
                    x1 = -0.311f,
                    y1 = 0.823f,
                    x2 = 0.74f,
                    y2 = 16.998f,
                    x3 = 0.74f,
                    y3 = 16.998f,
                )
                // c 0.005 0.081 0.023 0.15 0.067 0.199
                curveToRelative(
                    dx1 = 0.005f,
                    dy1 = 0.081f,
                    dx2 = 0.023f,
                    dy2 = 0.15f,
                    dx3 = 0.067f,
                    dy3 = 0.199f,
                )
                // c 0.604 0.684 4.758 -2.004 9.279 -6.001
                curveToRelative(
                    dx1 = 0.604f,
                    dy1 = 0.684f,
                    dx2 = 4.758f,
                    dy2 = -2.004f,
                    dx3 = 9.279f,
                    dy3 = -6.001f,
                )
                // c 4.522 -3.998 7.697 -7.792 7.093 -8.476z
                curveToRelative(
                    dx1 = 4.522f,
                    dy1 = -3.998f,
                    dx2 = 7.697f,
                    dy2 = -7.792f,
                    dx3 = 7.093f,
                    dy3 = -8.476f,
                )
                close()
            }
            // M0.349 0.271 C0.334 0.301 0.321 0.342 0.311 0.394 0.47 1.765 2.006 13.046 2.963 16.572 c1.436 -0.803 2.895 -1.894 4.609 -3.253 C6.116 10.654 1.158 0.146 0.349 0.271z
            path(
                fill = SolidColor(Color(0xFFEA596E)),
            ) {
                // M 0.349 0.271
                moveTo(x = 0.349f, y = 0.271f)
                // C 0.334 0.301 0.321 0.342 0.311 0.394
                curveTo(
                    x1 = 0.334f,
                    y1 = 0.301f,
                    x2 = 0.321f,
                    y2 = 0.342f,
                    x3 = 0.311f,
                    y3 = 0.394f,
                )
                // C 0.47 1.765 2.006 13.046 2.963 16.572
                curveTo(
                    x1 = 0.47f,
                    y1 = 1.765f,
                    x2 = 2.006f,
                    y2 = 13.046f,
                    x3 = 2.963f,
                    y3 = 16.572f,
                )
                // c 1.436 -0.803 2.895 -1.894 4.609 -3.253
                curveToRelative(
                    dx1 = 1.436f,
                    dy1 = -0.803f,
                    dx2 = 2.895f,
                    dy2 = -1.894f,
                    dx3 = 4.609f,
                    dy3 = -3.253f,
                )
                // C 6.116 10.654 1.158 0.146 0.349 0.271z
                curveTo(
                    x1 = 6.116f,
                    y1 = 10.654f,
                    x2 = 1.158f,
                    y2 = 0.146f,
                    x3 = 0.349f,
                    y3 = 0.271f,
                )
                close()
            }
            // M29.902 29.229 l-10.573 -1.303 c-1.13 -0.102 -3.117 -0.112 -3.015 -1.902 0.093 -1.623 2.04 -1.373 3.479 -1.16 l10.638 1.774 -0.529 2.591z
            path(
                fill = SolidColor(Color(0xFF3B88C3)),
            ) {
                // M 29.902 29.229
                moveTo(x = 29.902f, y = 29.229f)
                // l -10.573 -1.303
                lineToRelative(dx = -10.573f, dy = -1.303f)
                // c -1.13 -0.102 -3.117 -0.112 -3.015 -1.902
                curveToRelative(
                    dx1 = -1.13f,
                    dy1 = -0.102f,
                    dx2 = -3.117f,
                    dy2 = -0.112f,
                    dx3 = -3.015f,
                    dy3 = -1.902f,
                )
                // c 0.093 -1.623 2.04 -1.373 3.479 -1.16
                curveToRelative(
                    dx1 = 0.093f,
                    dy1 = -1.623f,
                    dx2 = 2.04f,
                    dy2 = -1.373f,
                    dx3 = 3.479f,
                    dy3 = -1.16f,
                )
                // l 10.638 1.774
                lineToRelative(dx = 10.638f, dy = 1.774f)
                // l -0.529 2.591z
                lineToRelative(dx = -0.529f, dy = 2.591f)
                close()
            }
            // M30.43 26.639 l-4.222 -0.724 c-0.494 -0.089 -0.934 0.647 -0.956 1.426 -0.025 0.866 0.227 1.304 0.726 1.406 l4.144 0.512 0.308 -2.62z
            path(
                fill = SolidColor(Color(0xFF88C9F9)),
            ) {
                // M 30.43 26.639
                moveTo(x = 30.43f, y = 26.639f)
                // l -4.222 -0.724
                lineToRelative(dx = -4.222f, dy = -0.724f)
                // c -0.494 -0.089 -0.934 0.647 -0.956 1.426
                curveToRelative(
                    dx1 = -0.494f,
                    dy1 = -0.089f,
                    dx2 = -0.934f,
                    dy2 = 0.647f,
                    dx3 = -0.956f,
                    dy3 = 1.426f,
                )
                // c -0.025 0.866 0.227 1.304 0.726 1.406
                curveToRelative(
                    dx1 = -0.025f,
                    dy1 = 0.866f,
                    dx2 = 0.227f,
                    dy2 = 1.304f,
                    dx3 = 0.726f,
                    dy3 = 1.406f,
                )
                // l 4.144 0.512
                lineToRelative(dx = 4.144f, dy = 0.512f)
                // l 0.308 -2.62z
                lineToRelative(dx = 0.308f, dy = -2.62f)
                close()
            }
            // M34.918 26.341 l-2.622 2.411 -4.687 -5.097 2.622 -2.411 c1.361 -1.252 3.499 -1.162 4.751 0.199 l0.135 0.147 c1.251 1.362 1.162 3.499 -0.199 4.751z
            path(
                fill = SolidColor(Color(0xFF3B88C3)),
            ) {
                // M 34.918 26.341
                moveTo(x = 34.918f, y = 26.341f)
                // l -2.622 2.411
                lineToRelative(dx = -2.622f, dy = 2.411f)
                // l -4.687 -5.097
                lineToRelative(dx = -4.687f, dy = -5.097f)
                // l 2.622 -2.411
                lineToRelative(dx = 2.622f, dy = -2.411f)
                // c 1.361 -1.252 3.499 -1.162 4.751 0.199
                curveToRelative(
                    dx1 = 1.361f,
                    dy1 = -1.252f,
                    dx2 = 3.499f,
                    dy2 = -1.162f,
                    dx3 = 4.751f,
                    dy3 = 0.199f,
                )
                // l 0.135 0.147
                lineToRelative(dx = 0.135f, dy = 0.147f)
                // c 1.251 1.362 1.162 3.499 -0.199 4.751z
                curveToRelative(
                    dx1 = 1.251f,
                    dy1 = 1.362f,
                    dx2 = 1.162f,
                    dy2 = 3.499f,
                    dx3 = -0.199f,
                    dy3 = 4.751f,
                )
                close()
            }
            // M27.9121 28.0797 a3.462 2.77 47.403 1 0 4.0782 -3.7497 a3.462 2.77 47.403 1 0 -4.0782 3.7497z
            path(
                fill = SolidColor(Color(0xFF88C9F9)),
            ) {
                // M 27.9121 28.0797
                moveTo(x = 27.9121f, y = 28.0797f)
                // a 3.462 2.77 47.403 1 0 4.0782 -3.7497
                arcToRelative(
                    a = 3.462f,
                    b = 2.77f,
                    theta = 47.403f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 4.0782f,
                    dy1 = -3.7497f,
                )
                // a 3.462 2.77 47.403 1 0 -4.0782 3.7497z
                arcToRelative(
                    a = 3.462f,
                    b = 2.77f,
                    theta = 47.403f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -4.0782f,
                    dy1 = 3.7497f,
                )
                close()
            }
            // M28.9316 27.1423 a2.077 1.385 47.403 1 0 2.0391 -1.8748 a2.077 1.385 47.403 1 0 -2.0391 1.8748z
            path(
                fill = SolidColor(Color(0xFF226699)),
            ) {
                // M 28.9316 27.1423
                moveTo(x = 28.9316f, y = 27.1423f)
                // a 2.077 1.385 47.403 1 0 2.0391 -1.8748
                arcToRelative(
                    a = 2.077f,
                    b = 1.385f,
                    theta = 47.403f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 2.0391f,
                    dy1 = -1.8748f,
                )
                // a 2.077 1.385 47.403 1 0 -2.0391 1.8748z
                arcToRelative(
                    a = 2.077f,
                    b = 1.385f,
                    theta = 47.403f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -2.0391f,
                    dy1 = 1.8748f,
                )
                close()
            }
            // M2.5 33.5 m-1.5 0 a1.5 1.5 0 1 1 3 0 a1.5 1.5 0 1 1 -3 0
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 2.5 33.5
                moveTo(x = 2.5f, y = 33.5f)
                // m -1.5 0
                moveToRelative(dx = -1.5f, dy = 0.0f)
                // a 1.5 1.5 0 1 1 3 0
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = 0.0f,
                )
                // a 1.5 1.5 0 1 1 -3 0
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = 0.0f,
                )
            }
            // M29 2 m-2 0 a2 2 0 1 1 4 0 a2 2 0 1 1 -4 0
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 29 2
                moveTo(x = 29.0f, y = 2.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
            }
            // M4.864 29.246 L2.526 23.63 0.412 29.675z M26 5 l-4 1 1 -4z
            path(
                fill = SolidColor(Color(0xFFEA596E)),
            ) {
                // M 4.864 29.246
                moveTo(x = 4.864f, y = 29.246f)
                // L 2.526 23.63
                lineTo(x = 2.526f, y = 23.63f)
                // L 0.412 29.675z
                lineTo(x = 0.412f, y = 29.675f)
                close()
                // M 26 5
                moveTo(x = 26.0f, y = 5.0f)
                // l -4 1
                lineToRelative(dx = -4.0f, dy = 1.0f)
                // l 1 -4z
                lineToRelative(dx = 1.0f, dy = -4.0f)
                close()
            }
            // M31.999 13 L36 7.999 33 6z
            path(
                fill = SolidColor(Color(0xFF77B255)),
            ) {
                // M 31.999 13
                moveTo(x = 31.999f, y = 13.0f)
                // L 36 7.999
                lineTo(x = 36.0f, y = 7.999f)
                // L 33 6z
                lineTo(x = 33.0f, y = 6.0f)
                close()
            }
        }.build().also { _emoji1f973 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f973: ImageVector? = null
