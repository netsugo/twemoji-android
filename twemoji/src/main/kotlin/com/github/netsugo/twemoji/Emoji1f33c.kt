package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f33c: ImageVector
    get() {
        val current = _emoji1f33c
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f33c",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M28.938 27.441 c-2.554 -0.89 -8.111 -0.429 -9.938 1.331 V17 c0 -0.553 -0.447 -1 -1 -1 s-1 0.447 -1 1 v11.772 c-1.827 -1.76 -7.384 -2.221 -9.938 -1.331 -0.741 0.259 5.264 8.749 9.507 4.507 0.168 -0.168 0.306 -0.33 0.431 -0.49 V35 c0 0.553 0.447 1 1 1 s1 -0.447 1 -1 v-3.542 c0.125 0.16 0.263 0.322 0.431 0.49 4.243 4.242 10.248 -4.248 9.507 -4.507z
            path(
                fill = SolidColor(Color(0xFF77B255)),
            ) {
                // M 28.938 27.441
                moveTo(x = 28.938f, y = 27.441f)
                // c -2.554 -0.89 -8.111 -0.429 -9.938 1.331
                curveToRelative(
                    dx1 = -2.554f,
                    dy1 = -0.89f,
                    dx2 = -8.111f,
                    dy2 = -0.429f,
                    dx3 = -9.938f,
                    dy3 = 1.331f,
                )
                // V 17
                verticalLineTo(y = 17.0f)
                // c 0 -0.553 -0.447 -1 -1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.553f,
                    dx2 = -0.447f,
                    dy2 = -1.0f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // s -1 0.447 -1 1
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.447f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                // v 11.772
                verticalLineToRelative(dy = 11.772f)
                // c -1.827 -1.76 -7.384 -2.221 -9.938 -1.331
                curveToRelative(
                    dx1 = -1.827f,
                    dy1 = -1.76f,
                    dx2 = -7.384f,
                    dy2 = -2.221f,
                    dx3 = -9.938f,
                    dy3 = -1.331f,
                )
                // c -0.741 0.259 5.264 8.749 9.507 4.507
                curveToRelative(
                    dx1 = -0.741f,
                    dy1 = 0.259f,
                    dx2 = 5.264f,
                    dy2 = 8.749f,
                    dx3 = 9.507f,
                    dy3 = 4.507f,
                )
                // c 0.168 -0.168 0.306 -0.33 0.431 -0.49
                curveToRelative(
                    dx1 = 0.168f,
                    dy1 = -0.168f,
                    dx2 = 0.306f,
                    dy2 = -0.33f,
                    dx3 = 0.431f,
                    dy3 = -0.49f,
                )
                // V 35
                verticalLineTo(y = 35.0f)
                // c 0 0.553 0.447 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = 0.447f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // s 1 -0.447 1 -1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = -0.447f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // v -3.542
                verticalLineToRelative(dy = -3.542f)
                // c 0.125 0.16 0.263 0.322 0.431 0.49
                curveToRelative(
                    dx1 = 0.125f,
                    dy1 = 0.16f,
                    dx2 = 0.263f,
                    dy2 = 0.322f,
                    dx3 = 0.431f,
                    dy3 = 0.49f,
                )
                // c 4.243 4.242 10.248 -4.248 9.507 -4.507z
                curveToRelative(
                    dx1 = 4.243f,
                    dy1 = 4.242f,
                    dx2 = 10.248f,
                    dy2 = -4.248f,
                    dx3 = 9.507f,
                    dy3 = -4.507f,
                )
                close()
            }
            // M12.562 25.65 c-0.619 -0.266 -1.107 -0.837 -1.378 -1.513 l-1.266 -3.306 -3.258 -1.393 c-1.336 -0.574 -1.876 -1.922 -1.304 -3.259 l1.362 -3.181 -1.364 -3.269 c-0.541 -1.35 0.15 -2.868 1.5 -3.408 l3.272 -1.281 1.449 -3.384 C12.148 0.32 13.496 -0.22 14.833 0.352 l3.258 1.396 L21.358 0.382 c0.675 -0.271 1.411 -0.276 2.03 -0.011 0.619 0.265 1.114 0.819 1.385 1.494 l1.274 3.29 3.309 1.417 c1.336 0.572 1.875 1.921 1.305 3.258 l-1.451 3.384 1.365 3.267 c0.541 1.35 -0.15 2.866 -1.5 3.407 l-3.271 1.281 -1.363 3.183 c-0.572 1.336 -1.922 1.877 -3.258 1.305 l-3.308 -1.417 -3.267 1.364 c-0.676 0.271 -1.427 0.311 -2.046 0.046z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 12.562 25.65
                moveTo(x = 12.562f, y = 25.65f)
                // c -0.619 -0.266 -1.107 -0.837 -1.378 -1.513
                curveToRelative(
                    dx1 = -0.619f,
                    dy1 = -0.266f,
                    dx2 = -1.107f,
                    dy2 = -0.837f,
                    dx3 = -1.378f,
                    dy3 = -1.513f,
                )
                // l -1.266 -3.306
                lineToRelative(dx = -1.266f, dy = -3.306f)
                // l -3.258 -1.393
                lineToRelative(dx = -3.258f, dy = -1.393f)
                // c -1.336 -0.574 -1.876 -1.922 -1.304 -3.259
                curveToRelative(
                    dx1 = -1.336f,
                    dy1 = -0.574f,
                    dx2 = -1.876f,
                    dy2 = -1.922f,
                    dx3 = -1.304f,
                    dy3 = -3.259f,
                )
                // l 1.362 -3.181
                lineToRelative(dx = 1.362f, dy = -3.181f)
                // l -1.364 -3.269
                lineToRelative(dx = -1.364f, dy = -3.269f)
                // c -0.541 -1.35 0.15 -2.868 1.5 -3.408
                curveToRelative(
                    dx1 = -0.541f,
                    dy1 = -1.35f,
                    dx2 = 0.15f,
                    dy2 = -2.868f,
                    dx3 = 1.5f,
                    dy3 = -3.408f,
                )
                // l 3.272 -1.281
                lineToRelative(dx = 3.272f, dy = -1.281f)
                // l 1.449 -3.384
                lineToRelative(dx = 1.449f, dy = -3.384f)
                // C 12.148 0.32 13.496 -0.22 14.833 0.352
                curveTo(
                    x1 = 12.148f,
                    y1 = 0.32f,
                    x2 = 13.496f,
                    y2 = -0.22f,
                    x3 = 14.833f,
                    y3 = 0.352f,
                )
                // l 3.258 1.396
                lineToRelative(dx = 3.258f, dy = 1.396f)
                // L 21.358 0.382
                lineTo(x = 21.358f, y = 0.382f)
                // c 0.675 -0.271 1.411 -0.276 2.03 -0.011
                curveToRelative(
                    dx1 = 0.675f,
                    dy1 = -0.271f,
                    dx2 = 1.411f,
                    dy2 = -0.276f,
                    dx3 = 2.03f,
                    dy3 = -0.011f,
                )
                // c 0.619 0.265 1.114 0.819 1.385 1.494
                curveToRelative(
                    dx1 = 0.619f,
                    dy1 = 0.265f,
                    dx2 = 1.114f,
                    dy2 = 0.819f,
                    dx3 = 1.385f,
                    dy3 = 1.494f,
                )
                // l 1.274 3.29
                lineToRelative(dx = 1.274f, dy = 3.29f)
                // l 3.309 1.417
                lineToRelative(dx = 3.309f, dy = 1.417f)
                // c 1.336 0.572 1.875 1.921 1.305 3.258
                curveToRelative(
                    dx1 = 1.336f,
                    dy1 = 0.572f,
                    dx2 = 1.875f,
                    dy2 = 1.921f,
                    dx3 = 1.305f,
                    dy3 = 3.258f,
                )
                // l -1.451 3.384
                lineToRelative(dx = -1.451f, dy = 3.384f)
                // l 1.365 3.267
                lineToRelative(dx = 1.365f, dy = 3.267f)
                // c 0.541 1.35 -0.15 2.866 -1.5 3.407
                curveToRelative(
                    dx1 = 0.541f,
                    dy1 = 1.35f,
                    dx2 = -0.15f,
                    dy2 = 2.866f,
                    dx3 = -1.5f,
                    dy3 = 3.407f,
                )
                // l -3.271 1.281
                lineToRelative(dx = -3.271f, dy = 1.281f)
                // l -1.363 3.183
                lineToRelative(dx = -1.363f, dy = 3.183f)
                // c -0.572 1.336 -1.922 1.877 -3.258 1.305
                curveToRelative(
                    dx1 = -0.572f,
                    dy1 = 1.336f,
                    dx2 = -1.922f,
                    dy2 = 1.877f,
                    dx3 = -3.258f,
                    dy3 = 1.305f,
                )
                // l -3.308 -1.417
                lineToRelative(dx = -3.308f, dy = -1.417f)
                // l -3.267 1.364
                lineToRelative(dx = -3.267f, dy = 1.364f)
                // c -0.676 0.271 -1.427 0.311 -2.046 0.046z
                curveToRelative(
                    dx1 = -0.676f,
                    dy1 = 0.271f,
                    dx2 = -1.427f,
                    dy2 = 0.311f,
                    dx3 = -2.046f,
                    dy3 = 0.046f,
                )
                close()
            }
            // M29.356 6.572 l-3.309 -1.417 -0.055 -0.143 c-1.565 1.337 -5.215 4.354 -5.215 4.354 l0.007 0.123 C20.015 8.879 19.057 8.5 18 8.5 V1.709 L14.833 0.353 c-1.337 -0.572 -2.685 -0.032 -3.258 1.304 l-1.449 3.384 -0.061 0.024 4.753 4.754 c-0.814 0.813 -1.318 1.938 -1.318 3.181 H6.717 l-1.361 3.178 c-0.572 1.337 -0.032 2.686 1.304 3.259 l3.258 1.394 0.002 0.006 4.496 -5.142 c0.822 1.09 2.115 1.805 3.584 1.805 h0.005 c0.006 1.979 0.015 5.273 0.012 6.801 l3.164 1.356 c1.336 0.572 2.686 0.031 3.258 -1.305 l1.362 -3.18 -5.192 -4.517 c1.14 -0.816 1.89 -2.145 1.89 -3.654 0 -0.071 -0.018 -0.137 -0.021 -0.208 1.802 0.182 4.951 0.472 6.822 0.642 l-0.092 -0.22 L30.66 9.83 c0.571 -1.337 0.031 -2.686 -1.304 -3.258z
            path(
                fill = SolidColor(Color(0xFFE1E8ED)),
            ) {
                // M 29.356 6.572
                moveTo(x = 29.356f, y = 6.572f)
                // l -3.309 -1.417
                lineToRelative(dx = -3.309f, dy = -1.417f)
                // l -0.055 -0.143
                lineToRelative(dx = -0.055f, dy = -0.143f)
                // c -1.565 1.337 -5.215 4.354 -5.215 4.354
                curveToRelative(
                    dx1 = -1.565f,
                    dy1 = 1.337f,
                    dx2 = -5.215f,
                    dy2 = 4.354f,
                    dx3 = -5.215f,
                    dy3 = 4.354f,
                )
                // l 0.007 0.123
                lineToRelative(dx = 0.007f, dy = 0.123f)
                // C 20.015 8.879 19.057 8.5 18 8.5
                curveTo(
                    x1 = 20.015f,
                    y1 = 8.879f,
                    x2 = 19.057f,
                    y2 = 8.5f,
                    x3 = 18.0f,
                    y3 = 8.5f,
                )
                // V 1.709
                verticalLineTo(y = 1.709f)
                // L 14.833 0.353
                lineTo(x = 14.833f, y = 0.353f)
                // c -1.337 -0.572 -2.685 -0.032 -3.258 1.304
                curveToRelative(
                    dx1 = -1.337f,
                    dy1 = -0.572f,
                    dx2 = -2.685f,
                    dy2 = -0.032f,
                    dx3 = -3.258f,
                    dy3 = 1.304f,
                )
                // l -1.449 3.384
                lineToRelative(dx = -1.449f, dy = 3.384f)
                // l -0.061 0.024
                lineToRelative(dx = -0.061f, dy = 0.024f)
                // l 4.753 4.754
                lineToRelative(dx = 4.753f, dy = 4.754f)
                // c -0.814 0.813 -1.318 1.938 -1.318 3.181
                curveToRelative(
                    dx1 = -0.814f,
                    dy1 = 0.813f,
                    dx2 = -1.318f,
                    dy2 = 1.938f,
                    dx3 = -1.318f,
                    dy3 = 3.181f,
                )
                // H 6.717
                horizontalLineTo(x = 6.717f)
                // l -1.361 3.178
                lineToRelative(dx = -1.361f, dy = 3.178f)
                // c -0.572 1.337 -0.032 2.686 1.304 3.259
                curveToRelative(
                    dx1 = -0.572f,
                    dy1 = 1.337f,
                    dx2 = -0.032f,
                    dy2 = 2.686f,
                    dx3 = 1.304f,
                    dy3 = 3.259f,
                )
                // l 3.258 1.394
                lineToRelative(dx = 3.258f, dy = 1.394f)
                // l 0.002 0.006
                lineToRelative(dx = 0.002f, dy = 0.006f)
                // l 4.496 -5.142
                lineToRelative(dx = 4.496f, dy = -5.142f)
                // c 0.822 1.09 2.115 1.805 3.584 1.805
                curveToRelative(
                    dx1 = 0.822f,
                    dy1 = 1.09f,
                    dx2 = 2.115f,
                    dy2 = 1.805f,
                    dx3 = 3.584f,
                    dy3 = 1.805f,
                )
                // h 0.005
                horizontalLineToRelative(dx = 0.005f)
                // c 0.006 1.979 0.015 5.273 0.012 6.801
                curveToRelative(
                    dx1 = 0.006f,
                    dy1 = 1.979f,
                    dx2 = 0.015f,
                    dy2 = 5.273f,
                    dx3 = 0.012f,
                    dy3 = 6.801f,
                )
                // l 3.164 1.356
                lineToRelative(dx = 3.164f, dy = 1.356f)
                // c 1.336 0.572 2.686 0.031 3.258 -1.305
                curveToRelative(
                    dx1 = 1.336f,
                    dy1 = 0.572f,
                    dx2 = 2.686f,
                    dy2 = 0.031f,
                    dx3 = 3.258f,
                    dy3 = -1.305f,
                )
                // l 1.362 -3.18
                lineToRelative(dx = 1.362f, dy = -3.18f)
                // l -5.192 -4.517
                lineToRelative(dx = -5.192f, dy = -4.517f)
                // c 1.14 -0.816 1.89 -2.145 1.89 -3.654
                curveToRelative(
                    dx1 = 1.14f,
                    dy1 = -0.816f,
                    dx2 = 1.89f,
                    dy2 = -2.145f,
                    dx3 = 1.89f,
                    dy3 = -3.654f,
                )
                // c 0 -0.071 -0.018 -0.137 -0.021 -0.208
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.071f,
                    dx2 = -0.018f,
                    dy2 = -0.137f,
                    dx3 = -0.021f,
                    dy3 = -0.208f,
                )
                // c 1.802 0.182 4.951 0.472 6.822 0.642
                curveToRelative(
                    dx1 = 1.802f,
                    dy1 = 0.182f,
                    dx2 = 4.951f,
                    dy2 = 0.472f,
                    dx3 = 6.822f,
                    dy3 = 0.642f,
                )
                // l -0.092 -0.22
                lineToRelative(dx = -0.092f, dy = -0.22f)
                // L 30.66 9.83
                lineTo(x = 30.66f, y = 9.83f)
                // c 0.571 -1.337 0.031 -2.686 -1.304 -3.258z
                curveToRelative(
                    dx1 = 0.571f,
                    dy1 = -1.337f,
                    dx2 = 0.031f,
                    dy2 = -2.686f,
                    dx3 = -1.304f,
                    dy3 = -3.258f,
                )
                close()
            }
            // M18 13 m-5 0 a5 5 0 1 1 10 0 a5 5 0 1 1 -10 0
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 18 13
                moveTo(x = 18.0f, y = 13.0f)
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
        }.build().also { _emoji1f33c = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f33c: ImageVector? = null
