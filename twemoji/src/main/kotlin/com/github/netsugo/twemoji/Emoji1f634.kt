package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f634: ImageVector
    get() {
        val current = _emoji1f634
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f634",
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
            // M18 26 m-3 0 a3 3 0 1 1 6 0 a3 3 0 1 1 -6 0
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 18 26
                moveTo(x = 18.0f, y = 26.0f)
                // m -3 0
                moveToRelative(dx = -3.0f, dy = 0.0f)
                // a 3 3 0 1 1 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // a 3 3 0 1 1 -6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
            }
            // M17.312 16.612 c-0.176 -0.143 -0.427 -0.147 -0.61 -0.014 -0.012 0.009 -1.26 0.902 -3.702 0.902 -2.441 0 -3.69 -0.893 -3.7 -0.9 -0.183 -0.137 -0.435 -0.133 -0.611 0.009 -0.178 0.142 -0.238 0.386 -0.146 0.594 0.06 0.135 1.5 3.297 4.457 3.297 2.958 0 4.397 -3.162 4.457 -3.297 0.092 -0.207 0.032 -0.449 -0.145 -0.591z M27.312 16.612 c-0.176 -0.143 -0.426 -0.148 -0.61 -0.014 -0.012 0.009 -1.261 0.902 -3.702 0.902 -2.44 0 -3.69 -0.893 -3.7 -0.9 -0.183 -0.137 -0.434 -0.133 -0.611 0.009 -0.178 0.142 -0.238 0.386 -0.146 0.594 0.06 0.135 1.5 3.297 4.457 3.297 2.958 0 4.397 -3.162 4.457 -3.297 0.092 -0.207 0.032 -0.449 -0.145 -0.591z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 17.312 16.612
                moveTo(x = 17.312f, y = 16.612f)
                // c -0.176 -0.143 -0.427 -0.147 -0.61 -0.014
                curveToRelative(
                    dx1 = -0.176f,
                    dy1 = -0.143f,
                    dx2 = -0.427f,
                    dy2 = -0.147f,
                    dx3 = -0.61f,
                    dy3 = -0.014f,
                )
                // c -0.012 0.009 -1.26 0.902 -3.702 0.902
                curveToRelative(
                    dx1 = -0.012f,
                    dy1 = 0.009f,
                    dx2 = -1.26f,
                    dy2 = 0.902f,
                    dx3 = -3.702f,
                    dy3 = 0.902f,
                )
                // c -2.441 0 -3.69 -0.893 -3.7 -0.9
                curveToRelative(
                    dx1 = -2.441f,
                    dy1 = 0.0f,
                    dx2 = -3.69f,
                    dy2 = -0.893f,
                    dx3 = -3.7f,
                    dy3 = -0.9f,
                )
                // c -0.183 -0.137 -0.435 -0.133 -0.611 0.009
                curveToRelative(
                    dx1 = -0.183f,
                    dy1 = -0.137f,
                    dx2 = -0.435f,
                    dy2 = -0.133f,
                    dx3 = -0.611f,
                    dy3 = 0.009f,
                )
                // c -0.178 0.142 -0.238 0.386 -0.146 0.594
                curveToRelative(
                    dx1 = -0.178f,
                    dy1 = 0.142f,
                    dx2 = -0.238f,
                    dy2 = 0.386f,
                    dx3 = -0.146f,
                    dy3 = 0.594f,
                )
                // c 0.06 0.135 1.5 3.297 4.457 3.297
                curveToRelative(
                    dx1 = 0.06f,
                    dy1 = 0.135f,
                    dx2 = 1.5f,
                    dy2 = 3.297f,
                    dx3 = 4.457f,
                    dy3 = 3.297f,
                )
                // c 2.958 0 4.397 -3.162 4.457 -3.297
                curveToRelative(
                    dx1 = 2.958f,
                    dy1 = 0.0f,
                    dx2 = 4.397f,
                    dy2 = -3.162f,
                    dx3 = 4.457f,
                    dy3 = -3.297f,
                )
                // c 0.092 -0.207 0.032 -0.449 -0.145 -0.591z
                curveToRelative(
                    dx1 = 0.092f,
                    dy1 = -0.207f,
                    dx2 = 0.032f,
                    dy2 = -0.449f,
                    dx3 = -0.145f,
                    dy3 = -0.591f,
                )
                close()
                // M 27.312 16.612
                moveTo(x = 27.312f, y = 16.612f)
                // c -0.176 -0.143 -0.426 -0.148 -0.61 -0.014
                curveToRelative(
                    dx1 = -0.176f,
                    dy1 = -0.143f,
                    dx2 = -0.426f,
                    dy2 = -0.148f,
                    dx3 = -0.61f,
                    dy3 = -0.014f,
                )
                // c -0.012 0.009 -1.261 0.902 -3.702 0.902
                curveToRelative(
                    dx1 = -0.012f,
                    dy1 = 0.009f,
                    dx2 = -1.261f,
                    dy2 = 0.902f,
                    dx3 = -3.702f,
                    dy3 = 0.902f,
                )
                // c -2.44 0 -3.69 -0.893 -3.7 -0.9
                curveToRelative(
                    dx1 = -2.44f,
                    dy1 = 0.0f,
                    dx2 = -3.69f,
                    dy2 = -0.893f,
                    dx3 = -3.7f,
                    dy3 = -0.9f,
                )
                // c -0.183 -0.137 -0.434 -0.133 -0.611 0.009
                curveToRelative(
                    dx1 = -0.183f,
                    dy1 = -0.137f,
                    dx2 = -0.434f,
                    dy2 = -0.133f,
                    dx3 = -0.611f,
                    dy3 = 0.009f,
                )
                // c -0.178 0.142 -0.238 0.386 -0.146 0.594
                curveToRelative(
                    dx1 = -0.178f,
                    dy1 = 0.142f,
                    dx2 = -0.238f,
                    dy2 = 0.386f,
                    dx3 = -0.146f,
                    dy3 = 0.594f,
                )
                // c 0.06 0.135 1.5 3.297 4.457 3.297
                curveToRelative(
                    dx1 = 0.06f,
                    dy1 = 0.135f,
                    dx2 = 1.5f,
                    dy2 = 3.297f,
                    dx3 = 4.457f,
                    dy3 = 3.297f,
                )
                // c 2.958 0 4.397 -3.162 4.457 -3.297
                curveToRelative(
                    dx1 = 2.958f,
                    dy1 = 0.0f,
                    dx2 = 4.397f,
                    dy2 = -3.162f,
                    dx3 = 4.457f,
                    dy3 = -3.297f,
                )
                // c 0.092 -0.207 0.032 -0.449 -0.145 -0.591z
                curveToRelative(
                    dx1 = 0.092f,
                    dy1 = -0.207f,
                    dx2 = 0.032f,
                    dy2 = -0.449f,
                    dx3 = -0.145f,
                    dy3 = -0.591f,
                )
                close()
            }
            // M34.43 12.534 c0.004 -0.044 0.023 -0.077 0.023 -0.123 0 -0.754 -0.548 -1.188 -1.225 -1.188 h-3.582 l4.279 -5.993 c0.206 -0.283 0.282 -0.453 0.282 -0.811 0 -0.735 -0.64 -0.849 -0.885 -0.849 h-5.349 l-0.032 -0.688 s-1.409 0.831 -1.503 0.888 -0.505 0.372 -0.505 0.987 c0 0.754 0.546 1.187 1.225 1.187 h3.149 l-4.261 5.993 c-0.094 0.151 -0.244 0.433 -0.244 0.735 0 0.622 0.508 0.924 1.111 0.924 h6.315 c0.258 0 0.515 -0.076 0.681 -0.176 l1.503 -0.888 h-0.982z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 34.43 12.534
                moveTo(x = 34.43f, y = 12.534f)
                // c 0.004 -0.044 0.023 -0.077 0.023 -0.123
                curveToRelative(
                    dx1 = 0.004f,
                    dy1 = -0.044f,
                    dx2 = 0.023f,
                    dy2 = -0.077f,
                    dx3 = 0.023f,
                    dy3 = -0.123f,
                )
                // c 0 -0.754 -0.548 -1.188 -1.225 -1.188
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.754f,
                    dx2 = -0.548f,
                    dy2 = -1.188f,
                    dx3 = -1.225f,
                    dy3 = -1.188f,
                )
                // h -3.582
                horizontalLineToRelative(dx = -3.582f)
                // l 4.279 -5.993
                lineToRelative(dx = 4.279f, dy = -5.993f)
                // c 0.206 -0.283 0.282 -0.453 0.282 -0.811
                curveToRelative(
                    dx1 = 0.206f,
                    dy1 = -0.283f,
                    dx2 = 0.282f,
                    dy2 = -0.453f,
                    dx3 = 0.282f,
                    dy3 = -0.811f,
                )
                // c 0 -0.735 -0.64 -0.849 -0.885 -0.849
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.735f,
                    dx2 = -0.64f,
                    dy2 = -0.849f,
                    dx3 = -0.885f,
                    dy3 = -0.849f,
                )
                // h -5.349
                horizontalLineToRelative(dx = -5.349f)
                // l -0.032 -0.688
                lineToRelative(dx = -0.032f, dy = -0.688f)
                // s -1.409 0.831 -1.503 0.888
                reflectiveCurveToRelative(
                    dx1 = -1.409f,
                    dy1 = 0.831f,
                    dx2 = -1.503f,
                    dy2 = 0.888f,
                )
                // s -0.505 0.372 -0.505 0.987
                reflectiveCurveToRelative(
                    dx1 = -0.505f,
                    dy1 = 0.372f,
                    dx2 = -0.505f,
                    dy2 = 0.987f,
                )
                // c 0 0.754 0.546 1.187 1.225 1.187
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.754f,
                    dx2 = 0.546f,
                    dy2 = 1.187f,
                    dx3 = 1.225f,
                    dy3 = 1.187f,
                )
                // h 3.149
                horizontalLineToRelative(dx = 3.149f)
                // l -4.261 5.993
                lineToRelative(dx = -4.261f, dy = 5.993f)
                // c -0.094 0.151 -0.244 0.433 -0.244 0.735
                curveToRelative(
                    dx1 = -0.094f,
                    dy1 = 0.151f,
                    dx2 = -0.244f,
                    dy2 = 0.433f,
                    dx3 = -0.244f,
                    dy3 = 0.735f,
                )
                // c 0 0.622 0.508 0.924 1.111 0.924
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.622f,
                    dx2 = 0.508f,
                    dy2 = 0.924f,
                    dx3 = 1.111f,
                    dy3 = 0.924f,
                )
                // h 6.315
                horizontalLineToRelative(dx = 6.315f)
                // c 0.258 0 0.515 -0.076 0.681 -0.176
                curveToRelative(
                    dx1 = 0.258f,
                    dy1 = 0.0f,
                    dx2 = 0.515f,
                    dy2 = -0.076f,
                    dx3 = 0.681f,
                    dy3 = -0.176f,
                )
                // l 1.503 -0.888
                lineToRelative(dx = 1.503f, dy = -0.888f)
                // h -0.982z
                horizontalLineToRelative(dx = -0.982f)
                close()
            }
            // M31.771 5.084 h-3.149 c-0.679 0 -1.225 -0.433 -1.225 -1.187 s0.546 -1.188 1.225 -1.188 h6.164 c0.245 0 0.885 0.113 0.885 0.848 0 0.358 -0.076 0.528 -0.282 0.811 l-4.279 5.993 h3.582 c0.677 0 1.225 0.433 1.225 1.187 s-0.548 1.187 -1.225 1.187 h-6.315 c-0.603 0 -1.111 -0.302 -1.111 -0.924 0 -0.302 0.15 -0.584 0.244 -0.735 l4.261 -5.992z
            path(
                fill = SolidColor(Color(0xFF2A6797)),
            ) {
                // M 31.771 5.084
                moveTo(x = 31.771f, y = 5.084f)
                // h -3.149
                horizontalLineToRelative(dx = -3.149f)
                // c -0.679 0 -1.225 -0.433 -1.225 -1.187
                curveToRelative(
                    dx1 = -0.679f,
                    dy1 = 0.0f,
                    dx2 = -1.225f,
                    dy2 = -0.433f,
                    dx3 = -1.225f,
                    dy3 = -1.187f,
                )
                // s 0.546 -1.188 1.225 -1.188
                reflectiveCurveToRelative(
                    dx1 = 0.546f,
                    dy1 = -1.188f,
                    dx2 = 1.225f,
                    dy2 = -1.188f,
                )
                // h 6.164
                horizontalLineToRelative(dx = 6.164f)
                // c 0.245 0 0.885 0.113 0.885 0.848
                curveToRelative(
                    dx1 = 0.245f,
                    dy1 = 0.0f,
                    dx2 = 0.885f,
                    dy2 = 0.113f,
                    dx3 = 0.885f,
                    dy3 = 0.848f,
                )
                // c 0 0.358 -0.076 0.528 -0.282 0.811
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.358f,
                    dx2 = -0.076f,
                    dy2 = 0.528f,
                    dx3 = -0.282f,
                    dy3 = 0.811f,
                )
                // l -4.279 5.993
                lineToRelative(dx = -4.279f, dy = 5.993f)
                // h 3.582
                horizontalLineToRelative(dx = 3.582f)
                // c 0.677 0 1.225 0.433 1.225 1.187
                curveToRelative(
                    dx1 = 0.677f,
                    dy1 = 0.0f,
                    dx2 = 1.225f,
                    dy2 = 0.433f,
                    dx3 = 1.225f,
                    dy3 = 1.187f,
                )
                // s -0.548 1.187 -1.225 1.187
                reflectiveCurveToRelative(
                    dx1 = -0.548f,
                    dy1 = 1.187f,
                    dx2 = -1.225f,
                    dy2 = 1.187f,
                )
                // h -6.315
                horizontalLineToRelative(dx = -6.315f)
                // c -0.603 0 -1.111 -0.302 -1.111 -0.924
                curveToRelative(
                    dx1 = -0.603f,
                    dy1 = 0.0f,
                    dx2 = -1.111f,
                    dy2 = -0.302f,
                    dx3 = -1.111f,
                    dy3 = -0.924f,
                )
                // c 0 -0.302 0.15 -0.584 0.244 -0.735
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.302f,
                    dx2 = 0.15f,
                    dy2 = -0.584f,
                    dx3 = 0.244f,
                    dy3 = -0.735f,
                )
                // l 4.261 -5.992z
                lineToRelative(dx = 4.261f, dy = -5.992f)
                close()
            }
            // M24.886 7.48 c0.003 -0.033 0.018 -0.058 0.018 -0.092 0 -0.564 -0.41 -0.889 -0.917 -0.889 h-2.682 l3.203 -4.487 c0.156 -0.212 0.212 -0.339 0.212 -0.606 0 -0.55 -0.479 -0.635 -0.663 -0.635 h-4.004 l-0.024 -0.515 s-1.055 0.622 -1.125 0.665 c-0.07 0.043 -0.378 0.279 -0.378 0.739 0 0.564 0.409 0.889 0.917 0.889 H21.8 l-3.19 4.487 c-0.07 0.113 -0.183 0.324 -0.183 0.55 0 0.466 0.38 0.691 0.832 0.691 h4.728 c0.193 0 0.385 -0.057 0.51 -0.132 l1.125 -0.665 h-0.736z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 24.886 7.48
                moveTo(x = 24.886f, y = 7.48f)
                // c 0.003 -0.033 0.018 -0.058 0.018 -0.092
                curveToRelative(
                    dx1 = 0.003f,
                    dy1 = -0.033f,
                    dx2 = 0.018f,
                    dy2 = -0.058f,
                    dx3 = 0.018f,
                    dy3 = -0.092f,
                )
                // c 0 -0.564 -0.41 -0.889 -0.917 -0.889
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.564f,
                    dx2 = -0.41f,
                    dy2 = -0.889f,
                    dx3 = -0.917f,
                    dy3 = -0.889f,
                )
                // h -2.682
                horizontalLineToRelative(dx = -2.682f)
                // l 3.203 -4.487
                lineToRelative(dx = 3.203f, dy = -4.487f)
                // c 0.156 -0.212 0.212 -0.339 0.212 -0.606
                curveToRelative(
                    dx1 = 0.156f,
                    dy1 = -0.212f,
                    dx2 = 0.212f,
                    dy2 = -0.339f,
                    dx3 = 0.212f,
                    dy3 = -0.606f,
                )
                // c 0 -0.55 -0.479 -0.635 -0.663 -0.635
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.55f,
                    dx2 = -0.479f,
                    dy2 = -0.635f,
                    dx3 = -0.663f,
                    dy3 = -0.635f,
                )
                // h -4.004
                horizontalLineToRelative(dx = -4.004f)
                // l -0.024 -0.515
                lineToRelative(dx = -0.024f, dy = -0.515f)
                // s -1.055 0.622 -1.125 0.665
                reflectiveCurveToRelative(
                    dx1 = -1.055f,
                    dy1 = 0.622f,
                    dx2 = -1.125f,
                    dy2 = 0.665f,
                )
                // c -0.07 0.043 -0.378 0.279 -0.378 0.739
                curveToRelative(
                    dx1 = -0.07f,
                    dy1 = 0.043f,
                    dx2 = -0.378f,
                    dy2 = 0.279f,
                    dx3 = -0.378f,
                    dy3 = 0.739f,
                )
                // c 0 0.564 0.409 0.889 0.917 0.889
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.564f,
                    dx2 = 0.409f,
                    dy2 = 0.889f,
                    dx3 = 0.917f,
                    dy3 = 0.889f,
                )
                // H 21.8
                horizontalLineTo(x = 21.8f)
                // l -3.19 4.487
                lineToRelative(dx = -3.19f, dy = 4.487f)
                // c -0.07 0.113 -0.183 0.324 -0.183 0.55
                curveToRelative(
                    dx1 = -0.07f,
                    dy1 = 0.113f,
                    dx2 = -0.183f,
                    dy2 = 0.324f,
                    dx3 = -0.183f,
                    dy3 = 0.55f,
                )
                // c 0 0.466 0.38 0.691 0.832 0.691
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.466f,
                    dx2 = 0.38f,
                    dy2 = 0.691f,
                    dx3 = 0.832f,
                    dy3 = 0.691f,
                )
                // h 4.728
                horizontalLineToRelative(dx = 4.728f)
                // c 0.193 0 0.385 -0.057 0.51 -0.132
                curveToRelative(
                    dx1 = 0.193f,
                    dy1 = 0.0f,
                    dx2 = 0.385f,
                    dy2 = -0.057f,
                    dx3 = 0.51f,
                    dy3 = -0.132f,
                )
                // l 1.125 -0.665
                lineToRelative(dx = 1.125f, dy = -0.665f)
                // h -0.736z
                horizontalLineToRelative(dx = -0.736f)
                close()
            }
            // M22.896 1.903 h-2.357 c-0.508 0 -0.917 -0.324 -0.917 -0.889 0 -0.564 0.409 -0.889 0.917 -0.889 h4.615 c0.184 0 0.663 0.085 0.663 0.635 0 0.268 -0.057 0.395 -0.211 0.607 l-3.203 4.487 h2.682 c0.505 0 0.915 0.324 0.915 0.889 s-0.41 0.889 -0.917 0.889 h-4.728 c-0.452 0 -0.832 -0.226 -0.832 -0.691 0 -0.226 0.113 -0.437 0.183 -0.55 l3.19 -4.488z
            path(
                fill = SolidColor(Color(0xFF2A6797)),
            ) {
                // M 22.896 1.903
                moveTo(x = 22.896f, y = 1.903f)
                // h -2.357
                horizontalLineToRelative(dx = -2.357f)
                // c -0.508 0 -0.917 -0.324 -0.917 -0.889
                curveToRelative(
                    dx1 = -0.508f,
                    dy1 = 0.0f,
                    dx2 = -0.917f,
                    dy2 = -0.324f,
                    dx3 = -0.917f,
                    dy3 = -0.889f,
                )
                // c 0 -0.564 0.409 -0.889 0.917 -0.889
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.564f,
                    dx2 = 0.409f,
                    dy2 = -0.889f,
                    dx3 = 0.917f,
                    dy3 = -0.889f,
                )
                // h 4.615
                horizontalLineToRelative(dx = 4.615f)
                // c 0.184 0 0.663 0.085 0.663 0.635
                curveToRelative(
                    dx1 = 0.184f,
                    dy1 = 0.0f,
                    dx2 = 0.663f,
                    dy2 = 0.085f,
                    dx3 = 0.663f,
                    dy3 = 0.635f,
                )
                // c 0 0.268 -0.057 0.395 -0.211 0.607
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.268f,
                    dx2 = -0.057f,
                    dy2 = 0.395f,
                    dx3 = -0.211f,
                    dy3 = 0.607f,
                )
                // l -3.203 4.487
                lineToRelative(dx = -3.203f, dy = 4.487f)
                // h 2.682
                horizontalLineToRelative(dx = 2.682f)
                // c 0.505 0 0.915 0.324 0.915 0.889
                curveToRelative(
                    dx1 = 0.505f,
                    dy1 = 0.0f,
                    dx2 = 0.915f,
                    dy2 = 0.324f,
                    dx3 = 0.915f,
                    dy3 = 0.889f,
                )
                // s -0.41 0.889 -0.917 0.889
                reflectiveCurveToRelative(
                    dx1 = -0.41f,
                    dy1 = 0.889f,
                    dx2 = -0.917f,
                    dy2 = 0.889f,
                )
                // h -4.728
                horizontalLineToRelative(dx = -4.728f)
                // c -0.452 0 -0.832 -0.226 -0.832 -0.691
                curveToRelative(
                    dx1 = -0.452f,
                    dy1 = 0.0f,
                    dx2 = -0.832f,
                    dy2 = -0.226f,
                    dx3 = -0.832f,
                    dy3 = -0.691f,
                )
                // c 0 -0.226 0.113 -0.437 0.183 -0.55
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.226f,
                    dx2 = 0.113f,
                    dy2 = -0.437f,
                    dx3 = 0.183f,
                    dy3 = -0.55f,
                )
                // l 3.19 -4.488z
                lineToRelative(dx = 3.19f, dy = -4.488f)
                close()
            }
            // M17.741 10.425 c0.003 -0.028 0.015 -0.049 0.015 -0.079 0 -0.483 -0.351 -0.761 -0.785 -0.761 h-2.295 l2.742 -3.84 c0.132 -0.181 0.181 -0.29 0.181 -0.519 0 -0.471 -0.41 -0.544 -0.567 -0.544 h-3.427 l-0.021 -0.441 -0.963 0.569 c-0.06 0.037 -0.324 0.238 -0.324 0.633 0 0.483 0.35 0.761 0.785 0.761 h2.017 l-2.73 3.84 c-0.06 0.097 -0.157 0.278 -0.157 0.471 0 0.399 0.326 0.592 0.712 0.592 h4.047 c0.165 0 0.33 -0.049 0.436 -0.113 l0.963 -0.569 h-0.629z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 17.741 10.425
                moveTo(x = 17.741f, y = 10.425f)
                // c 0.003 -0.028 0.015 -0.049 0.015 -0.079
                curveToRelative(
                    dx1 = 0.003f,
                    dy1 = -0.028f,
                    dx2 = 0.015f,
                    dy2 = -0.049f,
                    dx3 = 0.015f,
                    dy3 = -0.079f,
                )
                // c 0 -0.483 -0.351 -0.761 -0.785 -0.761
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.483f,
                    dx2 = -0.351f,
                    dy2 = -0.761f,
                    dx3 = -0.785f,
                    dy3 = -0.761f,
                )
                // h -2.295
                horizontalLineToRelative(dx = -2.295f)
                // l 2.742 -3.84
                lineToRelative(dx = 2.742f, dy = -3.84f)
                // c 0.132 -0.181 0.181 -0.29 0.181 -0.519
                curveToRelative(
                    dx1 = 0.132f,
                    dy1 = -0.181f,
                    dx2 = 0.181f,
                    dy2 = -0.29f,
                    dx3 = 0.181f,
                    dy3 = -0.519f,
                )
                // c 0 -0.471 -0.41 -0.544 -0.567 -0.544
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.471f,
                    dx2 = -0.41f,
                    dy2 = -0.544f,
                    dx3 = -0.567f,
                    dy3 = -0.544f,
                )
                // h -3.427
                horizontalLineToRelative(dx = -3.427f)
                // l -0.021 -0.441
                lineToRelative(dx = -0.021f, dy = -0.441f)
                // l -0.963 0.569
                lineToRelative(dx = -0.963f, dy = 0.569f)
                // c -0.06 0.037 -0.324 0.238 -0.324 0.633
                curveToRelative(
                    dx1 = -0.06f,
                    dy1 = 0.037f,
                    dx2 = -0.324f,
                    dy2 = 0.238f,
                    dx3 = -0.324f,
                    dy3 = 0.633f,
                )
                // c 0 0.483 0.35 0.761 0.785 0.761
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.483f,
                    dx2 = 0.35f,
                    dy2 = 0.761f,
                    dx3 = 0.785f,
                    dy3 = 0.761f,
                )
                // h 2.017
                horizontalLineToRelative(dx = 2.017f)
                // l -2.73 3.84
                lineToRelative(dx = -2.73f, dy = 3.84f)
                // c -0.06 0.097 -0.157 0.278 -0.157 0.471
                curveToRelative(
                    dx1 = -0.06f,
                    dy1 = 0.097f,
                    dx2 = -0.157f,
                    dy2 = 0.278f,
                    dx3 = -0.157f,
                    dy3 = 0.471f,
                )
                // c 0 0.399 0.326 0.592 0.712 0.592
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.399f,
                    dx2 = 0.326f,
                    dy2 = 0.592f,
                    dx3 = 0.712f,
                    dy3 = 0.592f,
                )
                // h 4.047
                horizontalLineToRelative(dx = 4.047f)
                // c 0.165 0 0.33 -0.049 0.436 -0.113
                curveToRelative(
                    dx1 = 0.165f,
                    dy1 = 0.0f,
                    dx2 = 0.33f,
                    dy2 = -0.049f,
                    dx3 = 0.436f,
                    dy3 = -0.113f,
                )
                // l 0.963 -0.569
                lineToRelative(dx = 0.963f, dy = -0.569f)
                // h -0.629z
                horizontalLineToRelative(dx = -0.629f)
                close()
            }
            // M16.037 5.652 H14.02 c-0.435 0 -0.785 -0.278 -0.785 -0.761 s0.35 -0.761 0.785 -0.761 h3.95 c0.157 0 0.567 0.073 0.567 0.544 0 0.229 -0.048 0.338 -0.181 0.519 l-2.742 3.84 h2.295 c0.434 0 0.785 0.278 0.785 0.761 s-0.351 0.761 -0.785 0.761 h-4.047 c-0.386 0 -0.712 -0.193 -0.712 -0.592 0 -0.193 0.096 -0.374 0.157 -0.471 l2.73 -3.84z
            path(
                fill = SolidColor(Color(0xFF2A6797)),
            ) {
                // M 16.037 5.652
                moveTo(x = 16.037f, y = 5.652f)
                // H 14.02
                horizontalLineTo(x = 14.02f)
                // c -0.435 0 -0.785 -0.278 -0.785 -0.761
                curveToRelative(
                    dx1 = -0.435f,
                    dy1 = 0.0f,
                    dx2 = -0.785f,
                    dy2 = -0.278f,
                    dx3 = -0.785f,
                    dy3 = -0.761f,
                )
                // s 0.35 -0.761 0.785 -0.761
                reflectiveCurveToRelative(
                    dx1 = 0.35f,
                    dy1 = -0.761f,
                    dx2 = 0.785f,
                    dy2 = -0.761f,
                )
                // h 3.95
                horizontalLineToRelative(dx = 3.95f)
                // c 0.157 0 0.567 0.073 0.567 0.544
                curveToRelative(
                    dx1 = 0.157f,
                    dy1 = 0.0f,
                    dx2 = 0.567f,
                    dy2 = 0.073f,
                    dx3 = 0.567f,
                    dy3 = 0.544f,
                )
                // c 0 0.229 -0.048 0.338 -0.181 0.519
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.229f,
                    dx2 = -0.048f,
                    dy2 = 0.338f,
                    dx3 = -0.181f,
                    dy3 = 0.519f,
                )
                // l -2.742 3.84
                lineToRelative(dx = -2.742f, dy = 3.84f)
                // h 2.295
                horizontalLineToRelative(dx = 2.295f)
                // c 0.434 0 0.785 0.278 0.785 0.761
                curveToRelative(
                    dx1 = 0.434f,
                    dy1 = 0.0f,
                    dx2 = 0.785f,
                    dy2 = 0.278f,
                    dx3 = 0.785f,
                    dy3 = 0.761f,
                )
                // s -0.351 0.761 -0.785 0.761
                reflectiveCurveToRelative(
                    dx1 = -0.351f,
                    dy1 = 0.761f,
                    dx2 = -0.785f,
                    dy2 = 0.761f,
                )
                // h -4.047
                horizontalLineToRelative(dx = -4.047f)
                // c -0.386 0 -0.712 -0.193 -0.712 -0.592
                curveToRelative(
                    dx1 = -0.386f,
                    dy1 = 0.0f,
                    dx2 = -0.712f,
                    dy2 = -0.193f,
                    dx3 = -0.712f,
                    dy3 = -0.592f,
                )
                // c 0 -0.193 0.096 -0.374 0.157 -0.471
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.193f,
                    dx2 = 0.096f,
                    dy2 = -0.374f,
                    dx3 = 0.157f,
                    dy3 = -0.471f,
                )
                // l 2.73 -3.84z
                lineToRelative(dx = 2.73f, dy = -3.84f)
                close()
            }
        }.build().also { _emoji1f634 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f634: ImageVector? = null
