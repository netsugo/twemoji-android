package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji2695: ImageVector
    get() {
        val current = _emoji2695
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji2695",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 32 c0 2.209 -1.791 4 -4 4 H4 c-2.209 0 -4 -1.791 -4 -4 V4 c0 -2.209 1.791 -4 4 -4 h28 c2.209 0 4 1.791 4 4 v28z
            path(
                fill = SolidColor(Color(0xFF9266CC)),
            ) {
                // M 36 32
                moveTo(x = 36.0f, y = 32.0f)
                // c 0 2.209 -1.791 4 -4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = -1.791f,
                    dy2 = 4.0f,
                    dx3 = -4.0f,
                    dy3 = 4.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // c -2.209 0 -4 -1.791 -4 -4
                curveToRelative(
                    dx1 = -2.209f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = -1.791f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
                // c 0 -2.209 1.791 -4 4 -4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.209f,
                    dx2 = 1.791f,
                    dy2 = -4.0f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // c 2.209 0 4 1.791 4 4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = 1.791f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // v 28z
                verticalLineToRelative(dy = 28.0f)
                close()
            }
            // M18 4.5 m-2.5 0 a2.5 2.5 0 1 1 5 0 a2.5 2.5 0 1 1 -5 0
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 18 4.5
                moveTo(x = 18.0f, y = 4.5f)
                // m -2.5 0
                moveToRelative(dx = -2.5f, dy = 0.0f)
                // a 2.5 2.5 0 1 1 5 0
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // a 2.5 2.5 0 1 1 -5 0
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -5.0f,
                    dy1 = 0.0f,
                )
            }
            // M17.472 18.27 c3.113 -0.217 9.593 -0.668 9.593 -3.598 0 -2.993 -6.341 -3.215 -9.049 -3.31 l-0.305 -0.011 c-10.314 -0.435 -8.543 -2.903 -7.569 -2.903 0.274 0.246 1.189 0.95 2.71 0.95 0.522 0 1.067 -0.084 1.62 -0.251 0.097 -0.029 0.165 -0.111 0.169 -0.205 0.004 -0.094 -0.055 -0.181 -0.149 -0.219 l-1.461 -0.577 2.272 -0.449 c0.08 -0.016 0.146 -0.067 0.176 -0.137 0.03 -0.071 0.02 -0.151 -0.025 -0.212 -0.052 -0.068 -1.269 -1.803 -3.355 -1.803 -2.849 0 -5.141 1.483 -5.141 4.039 0 3.09 7.322 3.957 10.597 3.957 6.272 0 6.59 0.839 6.59 1.007 0 0.885 -2.227 1.418 -6.62 1.585 -4.692 0.178 -7.724 1.501 -7.724 3.371 0 1.762 2.272 2.811 7.598 3.508 2.424 0.317 5.314 0.85 5.314 1.587 -0.001 0.009 -0.255 0.983 -5.231 1.605 -4.649 0.583 -5.246 1.677 -5.246 2.564 0 1.201 1.697 2.022 5.341 2.582 2.779 0.427 3.558 1.417 3.932 1.893 0.158 0.2 0.283 0.359 0.499 0.359 0.02 0 0.07 -0.006 0.089 -0.01 0.207 -0.048 0.321 -0.268 0.306 -0.59 -0.01 -0.239 -0.229 -2.357 -4.521 -3.005 -2.677 -0.404 -2.884 -1.048 -2.884 -1.236 0 -0.094 0.12 -0.58 2.455 -0.907 0.324 -0.024 7.96 -0.626 7.96 -3.32 0 -2.216 -4.462 -3.023 -8.398 -3.733 -1.984 -0.359 -4.453 -0.805 -4.453 -1.273 0.001 -0.418 0.852 -0.976 4.91 -1.258z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 17.472 18.27
                moveTo(x = 17.472f, y = 18.27f)
                // c 3.113 -0.217 9.593 -0.668 9.593 -3.598
                curveToRelative(
                    dx1 = 3.113f,
                    dy1 = -0.217f,
                    dx2 = 9.593f,
                    dy2 = -0.668f,
                    dx3 = 9.593f,
                    dy3 = -3.598f,
                )
                // c 0 -2.993 -6.341 -3.215 -9.049 -3.31
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.993f,
                    dx2 = -6.341f,
                    dy2 = -3.215f,
                    dx3 = -9.049f,
                    dy3 = -3.31f,
                )
                // l -0.305 -0.011
                lineToRelative(dx = -0.305f, dy = -0.011f)
                // c -10.314 -0.435 -8.543 -2.903 -7.569 -2.903
                curveToRelative(
                    dx1 = -10.314f,
                    dy1 = -0.435f,
                    dx2 = -8.543f,
                    dy2 = -2.903f,
                    dx3 = -7.569f,
                    dy3 = -2.903f,
                )
                // c 0.274 0.246 1.189 0.95 2.71 0.95
                curveToRelative(
                    dx1 = 0.274f,
                    dy1 = 0.246f,
                    dx2 = 1.189f,
                    dy2 = 0.95f,
                    dx3 = 2.71f,
                    dy3 = 0.95f,
                )
                // c 0.522 0 1.067 -0.084 1.62 -0.251
                curveToRelative(
                    dx1 = 0.522f,
                    dy1 = 0.0f,
                    dx2 = 1.067f,
                    dy2 = -0.084f,
                    dx3 = 1.62f,
                    dy3 = -0.251f,
                )
                // c 0.097 -0.029 0.165 -0.111 0.169 -0.205
                curveToRelative(
                    dx1 = 0.097f,
                    dy1 = -0.029f,
                    dx2 = 0.165f,
                    dy2 = -0.111f,
                    dx3 = 0.169f,
                    dy3 = -0.205f,
                )
                // c 0.004 -0.094 -0.055 -0.181 -0.149 -0.219
                curveToRelative(
                    dx1 = 0.004f,
                    dy1 = -0.094f,
                    dx2 = -0.055f,
                    dy2 = -0.181f,
                    dx3 = -0.149f,
                    dy3 = -0.219f,
                )
                // l -1.461 -0.577
                lineToRelative(dx = -1.461f, dy = -0.577f)
                // l 2.272 -0.449
                lineToRelative(dx = 2.272f, dy = -0.449f)
                // c 0.08 -0.016 0.146 -0.067 0.176 -0.137
                curveToRelative(
                    dx1 = 0.08f,
                    dy1 = -0.016f,
                    dx2 = 0.146f,
                    dy2 = -0.067f,
                    dx3 = 0.176f,
                    dy3 = -0.137f,
                )
                // c 0.03 -0.071 0.02 -0.151 -0.025 -0.212
                curveToRelative(
                    dx1 = 0.03f,
                    dy1 = -0.071f,
                    dx2 = 0.02f,
                    dy2 = -0.151f,
                    dx3 = -0.025f,
                    dy3 = -0.212f,
                )
                // c -0.052 -0.068 -1.269 -1.803 -3.355 -1.803
                curveToRelative(
                    dx1 = -0.052f,
                    dy1 = -0.068f,
                    dx2 = -1.269f,
                    dy2 = -1.803f,
                    dx3 = -3.355f,
                    dy3 = -1.803f,
                )
                // c -2.849 0 -5.141 1.483 -5.141 4.039
                curveToRelative(
                    dx1 = -2.849f,
                    dy1 = 0.0f,
                    dx2 = -5.141f,
                    dy2 = 1.483f,
                    dx3 = -5.141f,
                    dy3 = 4.039f,
                )
                // c 0 3.09 7.322 3.957 10.597 3.957
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.09f,
                    dx2 = 7.322f,
                    dy2 = 3.957f,
                    dx3 = 10.597f,
                    dy3 = 3.957f,
                )
                // c 6.272 0 6.59 0.839 6.59 1.007
                curveToRelative(
                    dx1 = 6.272f,
                    dy1 = 0.0f,
                    dx2 = 6.59f,
                    dy2 = 0.839f,
                    dx3 = 6.59f,
                    dy3 = 1.007f,
                )
                // c 0 0.885 -2.227 1.418 -6.62 1.585
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.885f,
                    dx2 = -2.227f,
                    dy2 = 1.418f,
                    dx3 = -6.62f,
                    dy3 = 1.585f,
                )
                // c -4.692 0.178 -7.724 1.501 -7.724 3.371
                curveToRelative(
                    dx1 = -4.692f,
                    dy1 = 0.178f,
                    dx2 = -7.724f,
                    dy2 = 1.501f,
                    dx3 = -7.724f,
                    dy3 = 3.371f,
                )
                // c 0 1.762 2.272 2.811 7.598 3.508
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.762f,
                    dx2 = 2.272f,
                    dy2 = 2.811f,
                    dx3 = 7.598f,
                    dy3 = 3.508f,
                )
                // c 2.424 0.317 5.314 0.85 5.314 1.587
                curveToRelative(
                    dx1 = 2.424f,
                    dy1 = 0.317f,
                    dx2 = 5.314f,
                    dy2 = 0.85f,
                    dx3 = 5.314f,
                    dy3 = 1.587f,
                )
                // c -0.001 0.009 -0.255 0.983 -5.231 1.605
                curveToRelative(
                    dx1 = -0.001f,
                    dy1 = 0.009f,
                    dx2 = -0.255f,
                    dy2 = 0.983f,
                    dx3 = -5.231f,
                    dy3 = 1.605f,
                )
                // c -4.649 0.583 -5.246 1.677 -5.246 2.564
                curveToRelative(
                    dx1 = -4.649f,
                    dy1 = 0.583f,
                    dx2 = -5.246f,
                    dy2 = 1.677f,
                    dx3 = -5.246f,
                    dy3 = 2.564f,
                )
                // c 0 1.201 1.697 2.022 5.341 2.582
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.201f,
                    dx2 = 1.697f,
                    dy2 = 2.022f,
                    dx3 = 5.341f,
                    dy3 = 2.582f,
                )
                // c 2.779 0.427 3.558 1.417 3.932 1.893
                curveToRelative(
                    dx1 = 2.779f,
                    dy1 = 0.427f,
                    dx2 = 3.558f,
                    dy2 = 1.417f,
                    dx3 = 3.932f,
                    dy3 = 1.893f,
                )
                // c 0.158 0.2 0.283 0.359 0.499 0.359
                curveToRelative(
                    dx1 = 0.158f,
                    dy1 = 0.2f,
                    dx2 = 0.283f,
                    dy2 = 0.359f,
                    dx3 = 0.499f,
                    dy3 = 0.359f,
                )
                // c 0.02 0 0.07 -0.006 0.089 -0.01
                curveToRelative(
                    dx1 = 0.02f,
                    dy1 = 0.0f,
                    dx2 = 0.07f,
                    dy2 = -0.006f,
                    dx3 = 0.089f,
                    dy3 = -0.01f,
                )
                // c 0.207 -0.048 0.321 -0.268 0.306 -0.59
                curveToRelative(
                    dx1 = 0.207f,
                    dy1 = -0.048f,
                    dx2 = 0.321f,
                    dy2 = -0.268f,
                    dx3 = 0.306f,
                    dy3 = -0.59f,
                )
                // c -0.01 -0.239 -0.229 -2.357 -4.521 -3.005
                curveToRelative(
                    dx1 = -0.01f,
                    dy1 = -0.239f,
                    dx2 = -0.229f,
                    dy2 = -2.357f,
                    dx3 = -4.521f,
                    dy3 = -3.005f,
                )
                // c -2.677 -0.404 -2.884 -1.048 -2.884 -1.236
                curveToRelative(
                    dx1 = -2.677f,
                    dy1 = -0.404f,
                    dx2 = -2.884f,
                    dy2 = -1.048f,
                    dx3 = -2.884f,
                    dy3 = -1.236f,
                )
                // c 0 -0.094 0.12 -0.58 2.455 -0.907
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.094f,
                    dx2 = 0.12f,
                    dy2 = -0.58f,
                    dx3 = 2.455f,
                    dy3 = -0.907f,
                )
                // c 0.324 -0.024 7.96 -0.626 7.96 -3.32
                curveToRelative(
                    dx1 = 0.324f,
                    dy1 = -0.024f,
                    dx2 = 7.96f,
                    dy2 = -0.626f,
                    dx3 = 7.96f,
                    dy3 = -3.32f,
                )
                // c 0 -2.216 -4.462 -3.023 -8.398 -3.733
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.216f,
                    dx2 = -4.462f,
                    dy2 = -3.023f,
                    dx3 = -8.398f,
                    dy3 = -3.733f,
                )
                // c -1.984 -0.359 -4.453 -0.805 -4.453 -1.273
                curveToRelative(
                    dx1 = -1.984f,
                    dy1 = -0.359f,
                    dx2 = -4.453f,
                    dy2 = -0.805f,
                    dx3 = -4.453f,
                    dy3 = -1.273f,
                )
                // c 0.001 -0.418 0.852 -0.976 4.91 -1.258z
                curveToRelative(
                    dx1 = 0.001f,
                    dy1 = -0.418f,
                    dx2 = 0.852f,
                    dy2 = -0.976f,
                    dx3 = 4.91f,
                    dy3 = -1.258f,
                )
                close()
            }
            // M11.547 6.9 a0.76 0.442 0 1 0 1.52 0 a0.76 0.442 0 1 0 -1.52 0z
            path(
                fill = SolidColor(Color(0xFF9266CC)),
            ) {
                // M 11.547 6.9
                moveTo(x = 11.547f, y = 6.9f)
                // a 0.76 0.442 0 1 0 1.52 0
                arcToRelative(
                    a = 0.76f,
                    b = 0.442f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 1.52f,
                    dy1 = 0.0f,
                )
                // a 0.76 0.442 0 1 0 -1.52 0z
                arcToRelative(
                    a = 0.76f,
                    b = 0.442f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -1.52f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M16 24.606 h1 v3.872 h-1z M19 24.606 h1 v3.872 h-1z M16 15.075 h1 v3.872 h-1z M19 15.075 h1 v3.872 h-1z
            path(
                fill = SolidColor(Color(0xFF9266CC)),
            ) {
                // M 16 24.606
                moveTo(x = 16.0f, y = 24.606f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // v 3.872
                verticalLineToRelative(dy = 3.872f)
                // h -1z
                horizontalLineToRelative(dx = -1.0f)
                close()
                // M 19 24.606
                moveTo(x = 19.0f, y = 24.606f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // v 3.872
                verticalLineToRelative(dy = 3.872f)
                // h -1z
                horizontalLineToRelative(dx = -1.0f)
                close()
                // M 16 15.075
                moveTo(x = 16.0f, y = 15.075f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // v 3.872
                verticalLineToRelative(dy = 3.872f)
                // h -1z
                horizontalLineToRelative(dx = -1.0f)
                close()
                // M 19 15.075
                moveTo(x = 19.0f, y = 15.075f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // v 3.872
                verticalLineToRelative(dy = 3.872f)
                // h -1z
                horizontalLineToRelative(dx = -1.0f)
                close()
            }
            // M17 19.81 l2 0.379 v-8.541 l-2 -0.084 v8.246z M19 21.789 l-2 -0.369 v7.457 c0.538 0.065 1.438 0.277 2 0.418 v-7.506z M17 30.335 L17 33 c0 0.553 0.447 1 1 1 s1 -0.447 1 -1 v-2.257 c-0.868 -0.199 -1.422 -0.278 -2 -0.408z M19 10.438 L19 5.33 c0 -0.553 -0.447 -1 -1 -1 s-1 0.447 -1 1 v5.016 l2 0.092z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 17 19.81
                moveTo(x = 17.0f, y = 19.81f)
                // l 2 0.379
                lineToRelative(dx = 2.0f, dy = 0.379f)
                // v -8.541
                verticalLineToRelative(dy = -8.541f)
                // l -2 -0.084
                lineToRelative(dx = -2.0f, dy = -0.084f)
                // v 8.246z
                verticalLineToRelative(dy = 8.246f)
                close()
                // M 19 21.789
                moveTo(x = 19.0f, y = 21.789f)
                // l -2 -0.369
                lineToRelative(dx = -2.0f, dy = -0.369f)
                // v 7.457
                verticalLineToRelative(dy = 7.457f)
                // c 0.538 0.065 1.438 0.277 2 0.418
                curveToRelative(
                    dx1 = 0.538f,
                    dy1 = 0.065f,
                    dx2 = 1.438f,
                    dy2 = 0.277f,
                    dx3 = 2.0f,
                    dy3 = 0.418f,
                )
                // v -7.506z
                verticalLineToRelative(dy = -7.506f)
                close()
                // M 17 30.335
                moveTo(x = 17.0f, y = 30.335f)
                // L 17 33
                lineTo(x = 17.0f, y = 33.0f)
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
                // v -2.257
                verticalLineToRelative(dy = -2.257f)
                // c -0.868 -0.199 -1.422 -0.278 -2 -0.408z
                curveToRelative(
                    dx1 = -0.868f,
                    dy1 = -0.199f,
                    dx2 = -1.422f,
                    dy2 = -0.278f,
                    dx3 = -2.0f,
                    dy3 = -0.408f,
                )
                close()
                // M 19 10.438
                moveTo(x = 19.0f, y = 10.438f)
                // L 19 5.33
                lineTo(x = 19.0f, y = 5.33f)
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
                // v 5.016
                verticalLineToRelative(dy = 5.016f)
                // l 2 0.092z
                lineToRelative(dx = 2.0f, dy = 0.092f)
                close()
            }
        }.build().also { _emoji2695 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji2695: ImageVector? = null
