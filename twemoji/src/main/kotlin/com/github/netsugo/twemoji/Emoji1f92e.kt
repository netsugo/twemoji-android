package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f92e: ImageVector
    get() {
        val current = _emoji1f92e
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f92e",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M35 17 c0 9.389 -7.611 17 -17 17 -9.388 0 -17 -7.611 -17 -17 C1 7.612 8.612 0 18 0 c9.389 0 17 7.612 17 17
            path(
                fill = SolidColor(Color(0xFFFFCB4C)),
            ) {
                // M 35 17
                moveTo(x = 35.0f, y = 17.0f)
                // c 0 9.389 -7.611 17 -17 17
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 9.389f,
                    dx2 = -7.611f,
                    dy2 = 17.0f,
                    dx3 = -17.0f,
                    dy3 = 17.0f,
                )
                // c -9.388 0 -17 -7.611 -17 -17
                curveToRelative(
                    dx1 = -9.388f,
                    dy1 = 0.0f,
                    dx2 = -17.0f,
                    dy2 = -7.611f,
                    dx3 = -17.0f,
                    dy3 = -17.0f,
                )
                // C 1 7.612 8.612 0 18 0
                curveTo(
                    x1 = 1.0f,
                    y1 = 7.612f,
                    x2 = 8.612f,
                    y2 = 0.0f,
                    x3 = 18.0f,
                    y3 = 0.0f,
                )
                // c 9.389 0 17 7.612 17 17
                curveToRelative(
                    dx1 = 9.389f,
                    dy1 = 0.0f,
                    dx2 = 17.0f,
                    dy2 = 7.612f,
                    dx3 = 17.0f,
                    dy3 = 17.0f,
                )
            }
            // M18 27.136 c3.335 0 5.547 0.388 8.284 0.92 0.625 0.12 1.841 0 1.841 -1.841 0 -3.682 -4.23 -8.284 -10.125 -8.284 S7.875 22.533 7.875 26.215 c0 1.841 1.216 1.962 1.841 1.841 2.736 -0.532 4.949 -0.92 8.284 -0.92z M6.668 18.888 c-0.287 0 -0.571 -0.13 -0.756 -0.378 -0.313 -0.417 -0.229 -1.009 0.189 -1.322 0.135 -0.101 2.787 -2.061 6.475 -2.77 -2.338 -1.172 -4.932 -1.197 -4.965 -1.197 -0.521 -0.001 -0.943 -0.425 -0.942 -0.946 0 -0.521 0.422 -0.943 0.944 -0.943 0.209 0 5.149 0.036 8.223 3.11 0.27 0.27 0.351 0.676 0.205 1.029 -0.146 0.353 -0.491 0.583 -0.872 0.583 -4.357 0 -7.898 2.618 -7.933 2.644 -0.173 0.129 -0.371 0.19 -0.568 0.19z M29.332 18.888 c-0.196 0 -0.395 -0.061 -0.564 -0.187 -0.036 -0.027 -3.6 -2.645 -7.935 -2.645 -0.382 0 -0.727 -0.23 -0.872 -0.583 -0.147 -0.353 -0.066 -0.759 0.205 -1.029 3.075 -3.075 8.015 -3.11 8.223 -3.11 0.521 0 0.943 0.422 0.944 0.943 0.001 0.521 -0.422 0.944 -0.942 0.946 -0.034 0 -2.629 0.025 -4.966 1.197 3.688 0.708 6.34 2.668 6.475 2.77 0.417 0.313 0.502 0.903 0.19 1.321 -0.186 0.247 -0.47 0.377 -0.758 0.377z
            path(
                fill = SolidColor(Color(0xFF65471B)),
            ) {
                // M 18 27.136
                moveTo(x = 18.0f, y = 27.136f)
                // c 3.335 0 5.547 0.388 8.284 0.92
                curveToRelative(
                    dx1 = 3.335f,
                    dy1 = 0.0f,
                    dx2 = 5.547f,
                    dy2 = 0.388f,
                    dx3 = 8.284f,
                    dy3 = 0.92f,
                )
                // c 0.625 0.12 1.841 0 1.841 -1.841
                curveToRelative(
                    dx1 = 0.625f,
                    dy1 = 0.12f,
                    dx2 = 1.841f,
                    dy2 = 0.0f,
                    dx3 = 1.841f,
                    dy3 = -1.841f,
                )
                // c 0 -3.682 -4.23 -8.284 -10.125 -8.284
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.682f,
                    dx2 = -4.23f,
                    dy2 = -8.284f,
                    dx3 = -10.125f,
                    dy3 = -8.284f,
                )
                // S 7.875 22.533 7.875 26.215
                reflectiveCurveTo(
                    x1 = 7.875f,
                    y1 = 22.533f,
                    x2 = 7.875f,
                    y2 = 26.215f,
                )
                // c 0 1.841 1.216 1.962 1.841 1.841
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.841f,
                    dx2 = 1.216f,
                    dy2 = 1.962f,
                    dx3 = 1.841f,
                    dy3 = 1.841f,
                )
                // c 2.736 -0.532 4.949 -0.92 8.284 -0.92z
                curveToRelative(
                    dx1 = 2.736f,
                    dy1 = -0.532f,
                    dx2 = 4.949f,
                    dy2 = -0.92f,
                    dx3 = 8.284f,
                    dy3 = -0.92f,
                )
                close()
                // M 6.668 18.888
                moveTo(x = 6.668f, y = 18.888f)
                // c -0.287 0 -0.571 -0.13 -0.756 -0.378
                curveToRelative(
                    dx1 = -0.287f,
                    dy1 = 0.0f,
                    dx2 = -0.571f,
                    dy2 = -0.13f,
                    dx3 = -0.756f,
                    dy3 = -0.378f,
                )
                // c -0.313 -0.417 -0.229 -1.009 0.189 -1.322
                curveToRelative(
                    dx1 = -0.313f,
                    dy1 = -0.417f,
                    dx2 = -0.229f,
                    dy2 = -1.009f,
                    dx3 = 0.189f,
                    dy3 = -1.322f,
                )
                // c 0.135 -0.101 2.787 -2.061 6.475 -2.77
                curveToRelative(
                    dx1 = 0.135f,
                    dy1 = -0.101f,
                    dx2 = 2.787f,
                    dy2 = -2.061f,
                    dx3 = 6.475f,
                    dy3 = -2.77f,
                )
                // c -2.338 -1.172 -4.932 -1.197 -4.965 -1.197
                curveToRelative(
                    dx1 = -2.338f,
                    dy1 = -1.172f,
                    dx2 = -4.932f,
                    dy2 = -1.197f,
                    dx3 = -4.965f,
                    dy3 = -1.197f,
                )
                // c -0.521 -0.001 -0.943 -0.425 -0.942 -0.946
                curveToRelative(
                    dx1 = -0.521f,
                    dy1 = -0.001f,
                    dx2 = -0.943f,
                    dy2 = -0.425f,
                    dx3 = -0.942f,
                    dy3 = -0.946f,
                )
                // c 0 -0.521 0.422 -0.943 0.944 -0.943
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.521f,
                    dx2 = 0.422f,
                    dy2 = -0.943f,
                    dx3 = 0.944f,
                    dy3 = -0.943f,
                )
                // c 0.209 0 5.149 0.036 8.223 3.11
                curveToRelative(
                    dx1 = 0.209f,
                    dy1 = 0.0f,
                    dx2 = 5.149f,
                    dy2 = 0.036f,
                    dx3 = 8.223f,
                    dy3 = 3.11f,
                )
                // c 0.27 0.27 0.351 0.676 0.205 1.029
                curveToRelative(
                    dx1 = 0.27f,
                    dy1 = 0.27f,
                    dx2 = 0.351f,
                    dy2 = 0.676f,
                    dx3 = 0.205f,
                    dy3 = 1.029f,
                )
                // c -0.146 0.353 -0.491 0.583 -0.872 0.583
                curveToRelative(
                    dx1 = -0.146f,
                    dy1 = 0.353f,
                    dx2 = -0.491f,
                    dy2 = 0.583f,
                    dx3 = -0.872f,
                    dy3 = 0.583f,
                )
                // c -4.357 0 -7.898 2.618 -7.933 2.644
                curveToRelative(
                    dx1 = -4.357f,
                    dy1 = 0.0f,
                    dx2 = -7.898f,
                    dy2 = 2.618f,
                    dx3 = -7.933f,
                    dy3 = 2.644f,
                )
                // c -0.173 0.129 -0.371 0.19 -0.568 0.19z
                curveToRelative(
                    dx1 = -0.173f,
                    dy1 = 0.129f,
                    dx2 = -0.371f,
                    dy2 = 0.19f,
                    dx3 = -0.568f,
                    dy3 = 0.19f,
                )
                close()
                // M 29.332 18.888
                moveTo(x = 29.332f, y = 18.888f)
                // c -0.196 0 -0.395 -0.061 -0.564 -0.187
                curveToRelative(
                    dx1 = -0.196f,
                    dy1 = 0.0f,
                    dx2 = -0.395f,
                    dy2 = -0.061f,
                    dx3 = -0.564f,
                    dy3 = -0.187f,
                )
                // c -0.036 -0.027 -3.6 -2.645 -7.935 -2.645
                curveToRelative(
                    dx1 = -0.036f,
                    dy1 = -0.027f,
                    dx2 = -3.6f,
                    dy2 = -2.645f,
                    dx3 = -7.935f,
                    dy3 = -2.645f,
                )
                // c -0.382 0 -0.727 -0.23 -0.872 -0.583
                curveToRelative(
                    dx1 = -0.382f,
                    dy1 = 0.0f,
                    dx2 = -0.727f,
                    dy2 = -0.23f,
                    dx3 = -0.872f,
                    dy3 = -0.583f,
                )
                // c -0.147 -0.353 -0.066 -0.759 0.205 -1.029
                curveToRelative(
                    dx1 = -0.147f,
                    dy1 = -0.353f,
                    dx2 = -0.066f,
                    dy2 = -0.759f,
                    dx3 = 0.205f,
                    dy3 = -1.029f,
                )
                // c 3.075 -3.075 8.015 -3.11 8.223 -3.11
                curveToRelative(
                    dx1 = 3.075f,
                    dy1 = -3.075f,
                    dx2 = 8.015f,
                    dy2 = -3.11f,
                    dx3 = 8.223f,
                    dy3 = -3.11f,
                )
                // c 0.521 0 0.943 0.422 0.944 0.943
                curveToRelative(
                    dx1 = 0.521f,
                    dy1 = 0.0f,
                    dx2 = 0.943f,
                    dy2 = 0.422f,
                    dx3 = 0.944f,
                    dy3 = 0.943f,
                )
                // c 0.001 0.521 -0.422 0.944 -0.942 0.946
                curveToRelative(
                    dx1 = 0.001f,
                    dy1 = 0.521f,
                    dx2 = -0.422f,
                    dy2 = 0.944f,
                    dx3 = -0.942f,
                    dy3 = 0.946f,
                )
                // c -0.034 0 -2.629 0.025 -4.966 1.197
                curveToRelative(
                    dx1 = -0.034f,
                    dy1 = 0.0f,
                    dx2 = -2.629f,
                    dy2 = 0.025f,
                    dx3 = -4.966f,
                    dy3 = 1.197f,
                )
                // c 3.688 0.708 6.34 2.668 6.475 2.77
                curveToRelative(
                    dx1 = 3.688f,
                    dy1 = 0.708f,
                    dx2 = 6.34f,
                    dy2 = 2.668f,
                    dx3 = 6.475f,
                    dy3 = 2.77f,
                )
                // c 0.417 0.313 0.502 0.903 0.19 1.321
                curveToRelative(
                    dx1 = 0.417f,
                    dy1 = 0.313f,
                    dx2 = 0.502f,
                    dy2 = 0.903f,
                    dx3 = 0.19f,
                    dy3 = 1.321f,
                )
                // c -0.186 0.247 -0.47 0.377 -0.758 0.377z
                curveToRelative(
                    dx1 = -0.186f,
                    dy1 = 0.247f,
                    dx2 = -0.47f,
                    dy2 = 0.377f,
                    dx3 = -0.758f,
                    dy3 = 0.377f,
                )
                close()
            }
            // M25.712 32.287 v-7.101 c0 -2.593 -3.889 -5.185 -7.778 -5.185 s-7.778 2.593 -7.778 5.185 v7.101 c-4.403 0.349 -7.359 0.985 -7.359 1.713 0 1.105 6.777 2 15.137 2 s15.137 -0.895 15.137 -2 c0 -0.728 -2.956 -1.364 -7.359 -1.713z
            path(
                fill = SolidColor(Color(0xFF77AF57)),
            ) {
                // M 25.712 32.287
                moveTo(x = 25.712f, y = 32.287f)
                // v -7.101
                verticalLineToRelative(dy = -7.101f)
                // c 0 -2.593 -3.889 -5.185 -7.778 -5.185
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.593f,
                    dx2 = -3.889f,
                    dy2 = -5.185f,
                    dx3 = -7.778f,
                    dy3 = -5.185f,
                )
                // s -7.778 2.593 -7.778 5.185
                reflectiveCurveToRelative(
                    dx1 = -7.778f,
                    dy1 = 2.593f,
                    dx2 = -7.778f,
                    dy2 = 5.185f,
                )
                // v 7.101
                verticalLineToRelative(dy = 7.101f)
                // c -4.403 0.349 -7.359 0.985 -7.359 1.713
                curveToRelative(
                    dx1 = -4.403f,
                    dy1 = 0.349f,
                    dx2 = -7.359f,
                    dy2 = 0.985f,
                    dx3 = -7.359f,
                    dy3 = 1.713f,
                )
                // c 0 1.105 6.777 2 15.137 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.105f,
                    dx2 = 6.777f,
                    dy2 = 2.0f,
                    dx3 = 15.137f,
                    dy3 = 2.0f,
                )
                // s 15.137 -0.895 15.137 -2
                reflectiveCurveToRelative(
                    dx1 = 15.137f,
                    dy1 = -0.895f,
                    dx2 = 15.137f,
                    dy2 = -2.0f,
                )
                // c 0 -0.728 -2.956 -1.364 -7.359 -1.713z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.728f,
                    dx2 = -2.956f,
                    dy2 = -1.364f,
                    dx3 = -7.359f,
                    dy3 = -1.713f,
                )
                close()
            }
            // M15.875 23.228 m-1.235 0 a1.235 1.235 0 1 1 2.47 0 a1.235 1.235 0 1 1 -2.47 0
            path(
                fill = SolidColor(Color(0xFF5D8F3F)),
            ) {
                // M 15.875 23.228
                moveTo(x = 15.875f, y = 23.228f)
                // m -1.235 0
                moveToRelative(dx = -1.235f, dy = 0.0f)
                // a 1.235 1.235 0 1 1 2.47 0
                arcToRelative(
                    a = 1.235f,
                    b = 1.235f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.47f,
                    dy1 = 0.0f,
                )
                // a 1.235 1.235 0 1 1 -2.47 0
                arcToRelative(
                    a = 1.235f,
                    b = 1.235f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.47f,
                    dy1 = 0.0f,
                )
            }
            // M20.698 25.64 m-1.235 0 a1.235 1.235 0 1 1 2.47 0 a1.235 1.235 0 1 1 -2.47 0
            path(
                fill = SolidColor(Color(0xFF5D8F3F)),
            ) {
                // M 20.698 25.64
                moveTo(x = 20.698f, y = 25.64f)
                // m -1.235 0
                moveToRelative(dx = -1.235f, dy = 0.0f)
                // a 1.235 1.235 0 1 1 2.47 0
                arcToRelative(
                    a = 1.235f,
                    b = 1.235f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.47f,
                    dy1 = 0.0f,
                )
                // a 1.235 1.235 0 1 1 -2.47 0
                arcToRelative(
                    a = 1.235f,
                    b = 1.235f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.47f,
                    dy1 = 0.0f,
                )
            }
            // M21.233 30.5142 m-0.1979 1.219 a1.235 1.235 54.219 1 1 0.3957 -2.4381 a1.235 1.235 54.219 1 1 -0.3957 2.4381
            path(
                fill = SolidColor(Color(0xFF5D8F3F)),
            ) {
                // M 21.233 30.5142
                moveTo(x = 21.233f, y = 30.5142f)
                // m -0.1979 1.219
                moveToRelative(dx = -0.1979f, dy = 1.219f)
                // a 1.235 1.235 54.219 1 1 0.3957 -2.4381
                arcToRelative(
                    a = 1.235f,
                    b = 1.235f,
                    theta = 54.219f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.3957f,
                    dy1 = -2.4381f,
                )
                // a 1.235 1.235 54.219 1 1 -0.3957 2.4381
                arcToRelative(
                    a = 1.235f,
                    b = 1.235f,
                    theta = 54.219f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -0.3957f,
                    dy1 = 2.4381f,
                )
            }
            // M15.107 32.548 m-0.2828 1.7422 a1.765 1.765 54.219 1 1 0.5655 -3.4844 a1.765 1.765 54.219 1 1 -0.5655 3.4844
            path(
                fill = SolidColor(Color(0xFF5D8F3F)),
            ) {
                // M 15.107 32.548
                moveTo(x = 15.107f, y = 32.548f)
                // m -0.2828 1.7422
                moveToRelative(dx = -0.2828f, dy = 1.7422f)
                // a 1.765 1.765 54.219 1 1 0.5655 -3.4844
                arcToRelative(
                    a = 1.765f,
                    b = 1.765f,
                    theta = 54.219f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.5655f,
                    dy1 = -3.4844f,
                )
                // a 1.765 1.765 54.219 1 1 -0.5655 3.4844
                arcToRelative(
                    a = 1.765f,
                    b = 1.765f,
                    theta = 54.219f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -0.5655f,
                    dy1 = 3.4844f,
                )
            }
        }.build().also { _emoji1f92e = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f92e: ImageVector? = null
