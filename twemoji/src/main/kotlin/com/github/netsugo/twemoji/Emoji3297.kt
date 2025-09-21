package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji3297: ImageVector
    get() {
        val current = _emoji3297
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji3297",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 18 c0 9.94 -8.059 18 -18 18 S0 27.94 0 18 C0 8.059 8.059 0 18 0 s18 8.059 18 18z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 36 18
                moveTo(x = 36.0f, y = 18.0f)
                // c 0 9.94 -8.059 18 -18 18
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 9.94f,
                    dx2 = -8.059f,
                    dy2 = 18.0f,
                    dx3 = -18.0f,
                    dy3 = 18.0f,
                )
                // S 0 27.94 0 18
                reflectiveCurveTo(
                    x1 = 0.0f,
                    y1 = 27.94f,
                    x2 = 0.0f,
                    y2 = 18.0f,
                )
                // C 0 8.059 8.059 0 18 0
                curveTo(
                    x1 = 0.0f,
                    y1 = 8.059f,
                    x2 = 8.059f,
                    y2 = 0.0f,
                    x3 = 18.0f,
                    y3 = 0.0f,
                )
                // s 18 8.059 18 18z
                reflectiveCurveToRelative(
                    dx1 = 18.0f,
                    dy1 = 8.059f,
                    dx2 = 18.0f,
                    dy2 = 18.0f,
                )
                close()
            }
            // M9.628 22.736 c0 -1.242 0.054 -2.43 0.162 -3.59 -0.945 0.972 -1.97 1.943 -3.077 2.807 -0.189 0.136 -0.405 0.217 -0.621 0.217 -0.324 0 -0.648 -0.162 -0.864 -0.486 -0.134 -0.19 -0.188 -0.405 -0.188 -0.594 0 -0.324 0.162 -0.648 0.432 -0.837 2.699 -1.862 5.965 -5.317 7.261 -7.909 0.081 -0.135 0.108 -0.243 0.108 -0.351 0 -0.189 -0.162 -0.297 -0.486 -0.297 L6.498 11.696 c-0.486 0 -0.756 -0.378 -0.756 -0.917 0 -0.54 0.27 -0.945 0.756 -0.945 h3.104 L9.602 6.001 c0 -0.486 0.432 -0.756 1.026 -0.756 0.621 0 1.053 0.27 1.053 0.756 v3.833 h1.754 c1.053 0 1.727 0.594 1.727 1.511 0 0.351 -0.108 0.756 -0.297 1.188 -0.675 1.323 -1.727 2.861 -2.807 4.184 1.295 1.323 2.483 2.241 3.428 2.861 0.351 0.216 0.513 0.486 0.513 0.811 0 0.215 -0.081 0.404 -0.216 0.62 -0.189 0.297 -0.486 0.433 -0.756 0.433 -0.189 0 -0.405 -0.055 -0.567 -0.189 -0.972 -0.729 -1.943 -1.674 -2.969 -2.78 0.108 1.35 0.162 2.429 0.162 3.725 v7.396 c0 0.485 -0.405 0.756 -1.026 0.756 -0.594 0 -0.999 -0.297 -0.999 -0.756 v-6.858z M21.154 17.365 c-0.107 6.29 -1.971 10.176 -6.316 12.606 -0.216 0.135 -0.432 0.216 -0.621 0.216 -0.324 0 -0.648 -0.162 -0.864 -0.513 -0.135 -0.189 -0.189 -0.405 -0.189 -0.621 0 -0.324 0.162 -0.594 0.486 -0.809 3.86 -2.159 5.426 -5.129 5.533 -10.878 h-0.809 c-1.62 0 -2.322 -0.621 -2.322 -2.132 L16.052 8.808 c0 -1.539 0.702 -2.187 2.322 -2.187 h8.53 c1.593 0 2.321 0.648 2.321 2.187 v6.424 c0 1.512 -0.728 2.132 -2.321 2.132 L25.42 17.364 v9.798 c0 0.621 0.215 0.729 1.512 0.729 1.133 0 1.511 -0.188 1.7 -0.782 0.162 -0.649 0.27 -1.917 0.297 -2.996 0 -0.486 0.351 -0.783 0.863 -0.783 h0.081 c0.594 0.027 0.918 0.297 0.918 0.81 v0.055 c-0.027 1.646 -0.216 3.212 -0.647 4.211 -0.162 0.378 -0.433 0.675 -0.783 0.891 -0.513 0.297 -1.377 0.485 -2.537 0.485 h-0.459 c-2.456 -0.026 -2.942 -0.594 -2.942 -1.97 L23.423 17.365 h-2.269z M26.391 15.502 c0.514 0 0.811 -0.189 0.811 -0.783 L27.202 9.321 c0 -0.621 -0.297 -0.755 -0.811 -0.755 h-7.503 c-0.54 0 -0.81 0.135 -0.81 0.755 v5.399 c0 0.594 0.27 0.783 0.81 0.783 h7.503z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 9.628 22.736
                moveTo(x = 9.628f, y = 22.736f)
                // c 0 -1.242 0.054 -2.43 0.162 -3.59
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.242f,
                    dx2 = 0.054f,
                    dy2 = -2.43f,
                    dx3 = 0.162f,
                    dy3 = -3.59f,
                )
                // c -0.945 0.972 -1.97 1.943 -3.077 2.807
                curveToRelative(
                    dx1 = -0.945f,
                    dy1 = 0.972f,
                    dx2 = -1.97f,
                    dy2 = 1.943f,
                    dx3 = -3.077f,
                    dy3 = 2.807f,
                )
                // c -0.189 0.136 -0.405 0.217 -0.621 0.217
                curveToRelative(
                    dx1 = -0.189f,
                    dy1 = 0.136f,
                    dx2 = -0.405f,
                    dy2 = 0.217f,
                    dx3 = -0.621f,
                    dy3 = 0.217f,
                )
                // c -0.324 0 -0.648 -0.162 -0.864 -0.486
                curveToRelative(
                    dx1 = -0.324f,
                    dy1 = 0.0f,
                    dx2 = -0.648f,
                    dy2 = -0.162f,
                    dx3 = -0.864f,
                    dy3 = -0.486f,
                )
                // c -0.134 -0.19 -0.188 -0.405 -0.188 -0.594
                curveToRelative(
                    dx1 = -0.134f,
                    dy1 = -0.19f,
                    dx2 = -0.188f,
                    dy2 = -0.405f,
                    dx3 = -0.188f,
                    dy3 = -0.594f,
                )
                // c 0 -0.324 0.162 -0.648 0.432 -0.837
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.324f,
                    dx2 = 0.162f,
                    dy2 = -0.648f,
                    dx3 = 0.432f,
                    dy3 = -0.837f,
                )
                // c 2.699 -1.862 5.965 -5.317 7.261 -7.909
                curveToRelative(
                    dx1 = 2.699f,
                    dy1 = -1.862f,
                    dx2 = 5.965f,
                    dy2 = -5.317f,
                    dx3 = 7.261f,
                    dy3 = -7.909f,
                )
                // c 0.081 -0.135 0.108 -0.243 0.108 -0.351
                curveToRelative(
                    dx1 = 0.081f,
                    dy1 = -0.135f,
                    dx2 = 0.108f,
                    dy2 = -0.243f,
                    dx3 = 0.108f,
                    dy3 = -0.351f,
                )
                // c 0 -0.189 -0.162 -0.297 -0.486 -0.297
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.189f,
                    dx2 = -0.162f,
                    dy2 = -0.297f,
                    dx3 = -0.486f,
                    dy3 = -0.297f,
                )
                // L 6.498 11.696
                lineTo(x = 6.498f, y = 11.696f)
                // c -0.486 0 -0.756 -0.378 -0.756 -0.917
                curveToRelative(
                    dx1 = -0.486f,
                    dy1 = 0.0f,
                    dx2 = -0.756f,
                    dy2 = -0.378f,
                    dx3 = -0.756f,
                    dy3 = -0.917f,
                )
                // c 0 -0.54 0.27 -0.945 0.756 -0.945
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.54f,
                    dx2 = 0.27f,
                    dy2 = -0.945f,
                    dx3 = 0.756f,
                    dy3 = -0.945f,
                )
                // h 3.104
                horizontalLineToRelative(dx = 3.104f)
                // L 9.602 6.001
                lineTo(x = 9.602f, y = 6.001f)
                // c 0 -0.486 0.432 -0.756 1.026 -0.756
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.486f,
                    dx2 = 0.432f,
                    dy2 = -0.756f,
                    dx3 = 1.026f,
                    dy3 = -0.756f,
                )
                // c 0.621 0 1.053 0.27 1.053 0.756
                curveToRelative(
                    dx1 = 0.621f,
                    dy1 = 0.0f,
                    dx2 = 1.053f,
                    dy2 = 0.27f,
                    dx3 = 1.053f,
                    dy3 = 0.756f,
                )
                // v 3.833
                verticalLineToRelative(dy = 3.833f)
                // h 1.754
                horizontalLineToRelative(dx = 1.754f)
                // c 1.053 0 1.727 0.594 1.727 1.511
                curveToRelative(
                    dx1 = 1.053f,
                    dy1 = 0.0f,
                    dx2 = 1.727f,
                    dy2 = 0.594f,
                    dx3 = 1.727f,
                    dy3 = 1.511f,
                )
                // c 0 0.351 -0.108 0.756 -0.297 1.188
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.351f,
                    dx2 = -0.108f,
                    dy2 = 0.756f,
                    dx3 = -0.297f,
                    dy3 = 1.188f,
                )
                // c -0.675 1.323 -1.727 2.861 -2.807 4.184
                curveToRelative(
                    dx1 = -0.675f,
                    dy1 = 1.323f,
                    dx2 = -1.727f,
                    dy2 = 2.861f,
                    dx3 = -2.807f,
                    dy3 = 4.184f,
                )
                // c 1.295 1.323 2.483 2.241 3.428 2.861
                curveToRelative(
                    dx1 = 1.295f,
                    dy1 = 1.323f,
                    dx2 = 2.483f,
                    dy2 = 2.241f,
                    dx3 = 3.428f,
                    dy3 = 2.861f,
                )
                // c 0.351 0.216 0.513 0.486 0.513 0.811
                curveToRelative(
                    dx1 = 0.351f,
                    dy1 = 0.216f,
                    dx2 = 0.513f,
                    dy2 = 0.486f,
                    dx3 = 0.513f,
                    dy3 = 0.811f,
                )
                // c 0 0.215 -0.081 0.404 -0.216 0.62
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.215f,
                    dx2 = -0.081f,
                    dy2 = 0.404f,
                    dx3 = -0.216f,
                    dy3 = 0.62f,
                )
                // c -0.189 0.297 -0.486 0.433 -0.756 0.433
                curveToRelative(
                    dx1 = -0.189f,
                    dy1 = 0.297f,
                    dx2 = -0.486f,
                    dy2 = 0.433f,
                    dx3 = -0.756f,
                    dy3 = 0.433f,
                )
                // c -0.189 0 -0.405 -0.055 -0.567 -0.189
                curveToRelative(
                    dx1 = -0.189f,
                    dy1 = 0.0f,
                    dx2 = -0.405f,
                    dy2 = -0.055f,
                    dx3 = -0.567f,
                    dy3 = -0.189f,
                )
                // c -0.972 -0.729 -1.943 -1.674 -2.969 -2.78
                curveToRelative(
                    dx1 = -0.972f,
                    dy1 = -0.729f,
                    dx2 = -1.943f,
                    dy2 = -1.674f,
                    dx3 = -2.969f,
                    dy3 = -2.78f,
                )
                // c 0.108 1.35 0.162 2.429 0.162 3.725
                curveToRelative(
                    dx1 = 0.108f,
                    dy1 = 1.35f,
                    dx2 = 0.162f,
                    dy2 = 2.429f,
                    dx3 = 0.162f,
                    dy3 = 3.725f,
                )
                // v 7.396
                verticalLineToRelative(dy = 7.396f)
                // c 0 0.485 -0.405 0.756 -1.026 0.756
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.485f,
                    dx2 = -0.405f,
                    dy2 = 0.756f,
                    dx3 = -1.026f,
                    dy3 = 0.756f,
                )
                // c -0.594 0 -0.999 -0.297 -0.999 -0.756
                curveToRelative(
                    dx1 = -0.594f,
                    dy1 = 0.0f,
                    dx2 = -0.999f,
                    dy2 = -0.297f,
                    dx3 = -0.999f,
                    dy3 = -0.756f,
                )
                // v -6.858z
                verticalLineToRelative(dy = -6.858f)
                close()
                // M 21.154 17.365
                moveTo(x = 21.154f, y = 17.365f)
                // c -0.107 6.29 -1.971 10.176 -6.316 12.606
                curveToRelative(
                    dx1 = -0.107f,
                    dy1 = 6.29f,
                    dx2 = -1.971f,
                    dy2 = 10.176f,
                    dx3 = -6.316f,
                    dy3 = 12.606f,
                )
                // c -0.216 0.135 -0.432 0.216 -0.621 0.216
                curveToRelative(
                    dx1 = -0.216f,
                    dy1 = 0.135f,
                    dx2 = -0.432f,
                    dy2 = 0.216f,
                    dx3 = -0.621f,
                    dy3 = 0.216f,
                )
                // c -0.324 0 -0.648 -0.162 -0.864 -0.513
                curveToRelative(
                    dx1 = -0.324f,
                    dy1 = 0.0f,
                    dx2 = -0.648f,
                    dy2 = -0.162f,
                    dx3 = -0.864f,
                    dy3 = -0.513f,
                )
                // c -0.135 -0.189 -0.189 -0.405 -0.189 -0.621
                curveToRelative(
                    dx1 = -0.135f,
                    dy1 = -0.189f,
                    dx2 = -0.189f,
                    dy2 = -0.405f,
                    dx3 = -0.189f,
                    dy3 = -0.621f,
                )
                // c 0 -0.324 0.162 -0.594 0.486 -0.809
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.324f,
                    dx2 = 0.162f,
                    dy2 = -0.594f,
                    dx3 = 0.486f,
                    dy3 = -0.809f,
                )
                // c 3.86 -2.159 5.426 -5.129 5.533 -10.878
                curveToRelative(
                    dx1 = 3.86f,
                    dy1 = -2.159f,
                    dx2 = 5.426f,
                    dy2 = -5.129f,
                    dx3 = 5.533f,
                    dy3 = -10.878f,
                )
                // h -0.809
                horizontalLineToRelative(dx = -0.809f)
                // c -1.62 0 -2.322 -0.621 -2.322 -2.132
                curveToRelative(
                    dx1 = -1.62f,
                    dy1 = 0.0f,
                    dx2 = -2.322f,
                    dy2 = -0.621f,
                    dx3 = -2.322f,
                    dy3 = -2.132f,
                )
                // L 16.052 8.808
                lineTo(x = 16.052f, y = 8.808f)
                // c 0 -1.539 0.702 -2.187 2.322 -2.187
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.539f,
                    dx2 = 0.702f,
                    dy2 = -2.187f,
                    dx3 = 2.322f,
                    dy3 = -2.187f,
                )
                // h 8.53
                horizontalLineToRelative(dx = 8.53f)
                // c 1.593 0 2.321 0.648 2.321 2.187
                curveToRelative(
                    dx1 = 1.593f,
                    dy1 = 0.0f,
                    dx2 = 2.321f,
                    dy2 = 0.648f,
                    dx3 = 2.321f,
                    dy3 = 2.187f,
                )
                // v 6.424
                verticalLineToRelative(dy = 6.424f)
                // c 0 1.512 -0.728 2.132 -2.321 2.132
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.512f,
                    dx2 = -0.728f,
                    dy2 = 2.132f,
                    dx3 = -2.321f,
                    dy3 = 2.132f,
                )
                // L 25.42 17.364
                lineTo(x = 25.42f, y = 17.364f)
                // v 9.798
                verticalLineToRelative(dy = 9.798f)
                // c 0 0.621 0.215 0.729 1.512 0.729
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.621f,
                    dx2 = 0.215f,
                    dy2 = 0.729f,
                    dx3 = 1.512f,
                    dy3 = 0.729f,
                )
                // c 1.133 0 1.511 -0.188 1.7 -0.782
                curveToRelative(
                    dx1 = 1.133f,
                    dy1 = 0.0f,
                    dx2 = 1.511f,
                    dy2 = -0.188f,
                    dx3 = 1.7f,
                    dy3 = -0.782f,
                )
                // c 0.162 -0.649 0.27 -1.917 0.297 -2.996
                curveToRelative(
                    dx1 = 0.162f,
                    dy1 = -0.649f,
                    dx2 = 0.27f,
                    dy2 = -1.917f,
                    dx3 = 0.297f,
                    dy3 = -2.996f,
                )
                // c 0 -0.486 0.351 -0.783 0.863 -0.783
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.486f,
                    dx2 = 0.351f,
                    dy2 = -0.783f,
                    dx3 = 0.863f,
                    dy3 = -0.783f,
                )
                // h 0.081
                horizontalLineToRelative(dx = 0.081f)
                // c 0.594 0.027 0.918 0.297 0.918 0.81
                curveToRelative(
                    dx1 = 0.594f,
                    dy1 = 0.027f,
                    dx2 = 0.918f,
                    dy2 = 0.297f,
                    dx3 = 0.918f,
                    dy3 = 0.81f,
                )
                // v 0.055
                verticalLineToRelative(dy = 0.055f)
                // c -0.027 1.646 -0.216 3.212 -0.647 4.211
                curveToRelative(
                    dx1 = -0.027f,
                    dy1 = 1.646f,
                    dx2 = -0.216f,
                    dy2 = 3.212f,
                    dx3 = -0.647f,
                    dy3 = 4.211f,
                )
                // c -0.162 0.378 -0.433 0.675 -0.783 0.891
                curveToRelative(
                    dx1 = -0.162f,
                    dy1 = 0.378f,
                    dx2 = -0.433f,
                    dy2 = 0.675f,
                    dx3 = -0.783f,
                    dy3 = 0.891f,
                )
                // c -0.513 0.297 -1.377 0.485 -2.537 0.485
                curveToRelative(
                    dx1 = -0.513f,
                    dy1 = 0.297f,
                    dx2 = -1.377f,
                    dy2 = 0.485f,
                    dx3 = -2.537f,
                    dy3 = 0.485f,
                )
                // h -0.459
                horizontalLineToRelative(dx = -0.459f)
                // c -2.456 -0.026 -2.942 -0.594 -2.942 -1.97
                curveToRelative(
                    dx1 = -2.456f,
                    dy1 = -0.026f,
                    dx2 = -2.942f,
                    dy2 = -0.594f,
                    dx3 = -2.942f,
                    dy3 = -1.97f,
                )
                // L 23.423 17.365
                lineTo(x = 23.423f, y = 17.365f)
                // h -2.269z
                horizontalLineToRelative(dx = -2.269f)
                close()
                // M 26.391 15.502
                moveTo(x = 26.391f, y = 15.502f)
                // c 0.514 0 0.811 -0.189 0.811 -0.783
                curveToRelative(
                    dx1 = 0.514f,
                    dy1 = 0.0f,
                    dx2 = 0.811f,
                    dy2 = -0.189f,
                    dx3 = 0.811f,
                    dy3 = -0.783f,
                )
                // L 27.202 9.321
                lineTo(x = 27.202f, y = 9.321f)
                // c 0 -0.621 -0.297 -0.755 -0.811 -0.755
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.621f,
                    dx2 = -0.297f,
                    dy2 = -0.755f,
                    dx3 = -0.811f,
                    dy3 = -0.755f,
                )
                // h -7.503
                horizontalLineToRelative(dx = -7.503f)
                // c -0.54 0 -0.81 0.135 -0.81 0.755
                curveToRelative(
                    dx1 = -0.54f,
                    dy1 = 0.0f,
                    dx2 = -0.81f,
                    dy2 = 0.135f,
                    dx3 = -0.81f,
                    dy3 = 0.755f,
                )
                // v 5.399
                verticalLineToRelative(dy = 5.399f)
                // c 0 0.594 0.27 0.783 0.81 0.783
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.594f,
                    dx2 = 0.27f,
                    dy2 = 0.783f,
                    dx3 = 0.81f,
                    dy3 = 0.783f,
                )
                // h 7.503z
                horizontalLineToRelative(dx = 7.503f)
                close()
            }
        }.build().also { _emoji3297 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji3297: ImageVector? = null
