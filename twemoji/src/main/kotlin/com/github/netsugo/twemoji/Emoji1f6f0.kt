package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f6f0: ImageVector
    get() {
        val current = _emoji1f6f0
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f6f0",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M8.514 19.828 L19.122 9.223 l2.121 2.121 L10.635 21.95z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 8.514 19.828
                moveTo(x = 8.514f, y = 19.828f)
                // L 19.122 9.223
                lineTo(x = 19.122f, y = 9.223f)
                // l 2.121 2.121
                lineToRelative(dx = 2.121f, dy = 2.121f)
                // L 10.635 21.95z
                lineTo(x = 10.635f, y = 21.95f)
                close()
            }
            // M8.515 29.728 c-0.781 0.781 -2.047 0.781 -2.828 0 l-4.95 -4.949 c-0.781 -0.781 -0.781 -2.048 0 -2.828 L5.687 17 c0.781 -0.781 2.047 -0.781 2.828 0 l4.95 4.95 c0.781 0.78 0.781 2.047 0 2.828 l-4.95 4.95z M24.777 13.465 c-0.78 0.781 -2.047 0.781 -2.827 0 L17 8.515 c-0.781 -0.781 -0.781 -2.047 0 -2.828 l4.951 -4.95 c0.781 -0.781 2.047 -0.781 2.828 0 l4.949 4.95 c0.781 0.781 0.781 2.047 0.001 2.828 l-4.952 4.95z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 8.515 29.728
                moveTo(x = 8.515f, y = 29.728f)
                // c -0.781 0.781 -2.047 0.781 -2.828 0
                curveToRelative(
                    dx1 = -0.781f,
                    dy1 = 0.781f,
                    dx2 = -2.047f,
                    dy2 = 0.781f,
                    dx3 = -2.828f,
                    dy3 = 0.0f,
                )
                // l -4.95 -4.949
                lineToRelative(dx = -4.95f, dy = -4.949f)
                // c -0.781 -0.781 -0.781 -2.048 0 -2.828
                curveToRelative(
                    dx1 = -0.781f,
                    dy1 = -0.781f,
                    dx2 = -0.781f,
                    dy2 = -2.048f,
                    dx3 = 0.0f,
                    dy3 = -2.828f,
                )
                // L 5.687 17
                lineTo(x = 5.687f, y = 17.0f)
                // c 0.781 -0.781 2.047 -0.781 2.828 0
                curveToRelative(
                    dx1 = 0.781f,
                    dy1 = -0.781f,
                    dx2 = 2.047f,
                    dy2 = -0.781f,
                    dx3 = 2.828f,
                    dy3 = 0.0f,
                )
                // l 4.95 4.95
                lineToRelative(dx = 4.95f, dy = 4.95f)
                // c 0.781 0.78 0.781 2.047 0 2.828
                curveToRelative(
                    dx1 = 0.781f,
                    dy1 = 0.78f,
                    dx2 = 0.781f,
                    dy2 = 2.047f,
                    dx3 = 0.0f,
                    dy3 = 2.828f,
                )
                // l -4.95 4.95z
                lineToRelative(dx = -4.95f, dy = 4.95f)
                close()
                // M 24.777 13.465
                moveTo(x = 24.777f, y = 13.465f)
                // c -0.78 0.781 -2.047 0.781 -2.827 0
                curveToRelative(
                    dx1 = -0.78f,
                    dy1 = 0.781f,
                    dx2 = -2.047f,
                    dy2 = 0.781f,
                    dx3 = -2.827f,
                    dy3 = 0.0f,
                )
                // L 17 8.515
                lineTo(x = 17.0f, y = 8.515f)
                // c -0.781 -0.781 -0.781 -2.047 0 -2.828
                curveToRelative(
                    dx1 = -0.781f,
                    dy1 = -0.781f,
                    dx2 = -0.781f,
                    dy2 = -2.047f,
                    dx3 = 0.0f,
                    dy3 = -2.828f,
                )
                // l 4.951 -4.95
                lineToRelative(dx = 4.951f, dy = -4.95f)
                // c 0.781 -0.781 2.047 -0.781 2.828 0
                curveToRelative(
                    dx1 = 0.781f,
                    dy1 = -0.781f,
                    dx2 = 2.047f,
                    dy2 = -0.781f,
                    dx3 = 2.828f,
                    dy3 = 0.0f,
                )
                // l 4.949 4.95
                lineToRelative(dx = 4.949f, dy = 4.95f)
                // c 0.781 0.781 0.781 2.047 0.001 2.828
                curveToRelative(
                    dx1 = 0.781f,
                    dy1 = 0.781f,
                    dx2 = 0.781f,
                    dy2 = 2.047f,
                    dx3 = 0.001f,
                    dy3 = 2.828f,
                )
                // l -4.952 4.95z
                lineToRelative(dx = -4.952f, dy = 4.95f)
                close()
            }
            // M12.404 10.283 L10.99 6.04 c-0.448 -1.342 -1.415 -1.415 -2.122 -0.708 L6.04 8.161 c-0.708 0.707 -0.635 1.674 0.707 2.122 l4.243 1.414 1.414 -1.414z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 12.404 10.283
                moveTo(x = 12.404f, y = 10.283f)
                // L 10.99 6.04
                lineTo(x = 10.99f, y = 6.04f)
                // c -0.448 -1.342 -1.415 -1.415 -2.122 -0.708
                curveToRelative(
                    dx1 = -0.448f,
                    dy1 = -1.342f,
                    dx2 = -1.415f,
                    dy2 = -1.415f,
                    dx3 = -2.122f,
                    dy3 = -0.708f,
                )
                // L 6.04 8.161
                lineTo(x = 6.04f, y = 8.161f)
                // c -0.708 0.707 -0.635 1.674 0.707 2.122
                curveToRelative(
                    dx1 = -0.708f,
                    dy1 = 0.707f,
                    dx2 = -0.635f,
                    dy2 = 1.674f,
                    dx3 = 0.707f,
                    dy3 = 2.122f,
                )
                // l 4.243 1.414
                lineToRelative(dx = 4.243f, dy = 1.414f)
                // l 1.414 -1.414z
                lineToRelative(dx = 1.414f, dy = -1.414f)
                close()
            }
            // M17.708 21.949 c-0.782 0.781 -2.048 0.781 -2.829 0.001 l-7.071 -7.071 c-0.781 -0.781 -0.781 -2.048 0 -2.829 l4.242 -4.242 c0.781 -0.781 2.048 -0.781 2.829 0 l7.071 7.071 c0.78 0.781 0.78 2.047 -0.001 2.829 l-4.241 4.241z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 17.708 21.949
                moveTo(x = 17.708f, y = 21.949f)
                // c -0.782 0.781 -2.048 0.781 -2.829 0.001
                curveToRelative(
                    dx1 = -0.782f,
                    dy1 = 0.781f,
                    dx2 = -2.048f,
                    dy2 = 0.781f,
                    dx3 = -2.829f,
                    dy3 = 0.001f,
                )
                // l -7.071 -7.071
                lineToRelative(dx = -7.071f, dy = -7.071f)
                // c -0.781 -0.781 -0.781 -2.048 0 -2.829
                curveToRelative(
                    dx1 = -0.781f,
                    dy1 = -0.781f,
                    dx2 = -0.781f,
                    dy2 = -2.048f,
                    dx3 = 0.0f,
                    dy3 = -2.829f,
                )
                // l 4.242 -4.242
                lineToRelative(dx = 4.242f, dy = -4.242f)
                // c 0.781 -0.781 2.048 -0.781 2.829 0
                curveToRelative(
                    dx1 = 0.781f,
                    dy1 = -0.781f,
                    dx2 = 2.048f,
                    dy2 = -0.781f,
                    dx3 = 2.829f,
                    dy3 = 0.0f,
                )
                // l 7.071 7.071
                lineToRelative(dx = 7.071f, dy = 7.071f)
                // c 0.78 0.781 0.78 2.047 -0.001 2.829
                curveToRelative(
                    dx1 = 0.78f,
                    dy1 = 0.781f,
                    dx2 = 0.78f,
                    dy2 = 2.047f,
                    dx3 = -0.001f,
                    dy3 = 2.829f,
                )
                // l -4.241 4.241z
                lineToRelative(dx = -4.241f, dy = 4.241f)
                close()
            }
            // M21.016 21.055 c-1.952 1.953 -4.802 2.269 -6.364 0.708 -1.562 -1.562 0.876 -2.29 2.829 -4.243 1.953 -1.953 2.681 -4.39 4.243 -2.829 1.561 1.562 1.245 4.411 -0.708 6.364z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 21.016 21.055
                moveTo(x = 21.016f, y = 21.055f)
                // c -1.952 1.953 -4.802 2.269 -6.364 0.708
                curveToRelative(
                    dx1 = -1.952f,
                    dy1 = 1.953f,
                    dx2 = -4.802f,
                    dy2 = 2.269f,
                    dx3 = -6.364f,
                    dy3 = 0.708f,
                )
                // c -1.562 -1.562 0.876 -2.29 2.829 -4.243
                curveToRelative(
                    dx1 = -1.562f,
                    dy1 = -1.562f,
                    dx2 = 0.876f,
                    dy2 = -2.29f,
                    dx3 = 2.829f,
                    dy3 = -4.243f,
                )
                // c 1.953 -1.953 2.681 -4.39 4.243 -2.829
                curveToRelative(
                    dx1 = 1.953f,
                    dy1 = -1.953f,
                    dx2 = 2.681f,
                    dy2 = -4.39f,
                    dx3 = 4.243f,
                    dy3 = -2.829f,
                )
                // c 1.561 1.562 1.245 4.411 -0.708 6.364z
                curveToRelative(
                    dx1 = 1.561f,
                    dy1 = 1.562f,
                    dx2 = 1.245f,
                    dy2 = 4.411f,
                    dx3 = -0.708f,
                    dy3 = 6.364f,
                )
                close()
            }
            // M27.96 20.182 c-2.12 -2.122 -5.118 -1.951 -7.071 0 -1.952 1.954 -2.121 4.95 0 7.071 l7.071 -7.071z M25.132 23.011 l2.121 3.535 -3.535 -2.121z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 27.96 20.182
                moveTo(x = 27.96f, y = 20.182f)
                // c -2.12 -2.122 -5.118 -1.951 -7.071 0
                curveToRelative(
                    dx1 = -2.12f,
                    dy1 = -2.122f,
                    dx2 = -5.118f,
                    dy2 = -1.951f,
                    dx3 = -7.071f,
                    dy3 = 0.0f,
                )
                // c -1.952 1.954 -2.121 4.95 0 7.071
                curveToRelative(
                    dx1 = -1.952f,
                    dy1 = 1.954f,
                    dx2 = -2.121f,
                    dy2 = 4.95f,
                    dx3 = 0.0f,
                    dy3 = 7.071f,
                )
                // l 7.071 -7.071z
                lineToRelative(dx = 7.071f, dy = -7.071f)
                close()
                // M 25.132 23.011
                moveTo(x = 25.132f, y = 23.011f)
                // l 2.121 3.535
                lineToRelative(dx = 2.121f, dy = 3.535f)
                // l -3.535 -2.121z
                lineToRelative(dx = -3.535f, dy = -2.121f)
                close()
            }
            // M27.813 27.106 c-0.391 0.391 -1.023 0.391 -1.414 0 s-0.391 -1.023 0 -1.414 1.023 -0.391 1.414 0 0.391 1.024 0 1.414z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 27.813 27.106
                moveTo(x = 27.813f, y = 27.106f)
                // c -0.391 0.391 -1.023 0.391 -1.414 0
                curveToRelative(
                    dx1 = -0.391f,
                    dy1 = 0.391f,
                    dx2 = -1.023f,
                    dy2 = 0.391f,
                    dx3 = -1.414f,
                    dy3 = 0.0f,
                )
                // s -0.391 -1.023 0 -1.414
                reflectiveCurveToRelative(
                    dx1 = -0.391f,
                    dy1 = -1.023f,
                    dx2 = 0.0f,
                    dy2 = -1.414f,
                )
                // s 1.023 -0.391 1.414 0
                reflectiveCurveToRelative(
                    dx1 = 1.023f,
                    dy1 = -0.391f,
                    dx2 = 1.414f,
                    dy2 = 0.0f,
                )
                // s 0.391 1.024 0 1.414z
                reflectiveCurveToRelative(
                    dx1 = 0.391f,
                    dy1 = 1.024f,
                    dx2 = 0.0f,
                    dy2 = 1.414f,
                )
                close()
            }
            // M4.27 18.416 L5.686 17 l7.779 7.777 -1.414 1.415z M17 5.686 l1.414 -1.414 7.778 7.778 -1.414 1.414z M0.735 21.952 l1.414 -1.415 7.78 7.776 -1.414 1.414z M20.533 2.152 L21.946 0.737 l7.781 7.775 -1.413 1.414z
            path(
                fill = SolidColor(Color(0xFF88C9F9)),
            ) {
                // M 4.27 18.416
                moveTo(x = 4.27f, y = 18.416f)
                // L 5.686 17
                lineTo(x = 5.686f, y = 17.0f)
                // l 7.779 7.777
                lineToRelative(dx = 7.779f, dy = 7.777f)
                // l -1.414 1.415z
                lineToRelative(dx = -1.414f, dy = 1.415f)
                close()
                // M 17 5.686
                moveTo(x = 17.0f, y = 5.686f)
                // l 1.414 -1.414
                lineToRelative(dx = 1.414f, dy = -1.414f)
                // l 7.778 7.778
                lineToRelative(dx = 7.778f, dy = 7.778f)
                // l -1.414 1.414z
                lineToRelative(dx = -1.414f, dy = 1.414f)
                close()
                // M 0.735 21.952
                moveTo(x = 0.735f, y = 21.952f)
                // l 1.414 -1.415
                lineToRelative(dx = 1.414f, dy = -1.415f)
                // l 7.78 7.776
                lineToRelative(dx = 7.78f, dy = 7.776f)
                // l -1.414 1.414z
                lineToRelative(dx = -1.414f, dy = 1.414f)
                close()
                // M 20.533 2.152
                moveTo(x = 20.533f, y = 2.152f)
                // L 21.946 0.737
                lineTo(x = 21.946f, y = 0.737f)
                // l 7.781 7.775
                lineToRelative(dx = 7.781f, dy = 7.775f)
                // l -1.413 1.414z
                lineToRelative(dx = -1.413f, dy = 1.414f)
                close()
            }
            // M8.307 7.601 c-0.39 0.39 -1.023 0.39 -1.414 0 -0.391 -0.391 -0.39 -1.024 0 -1.415 0.391 -0.39 1.023 -0.39 1.414 0 0.391 0.391 0.391 1.024 0 1.415z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 8.307 7.601
                moveTo(x = 8.307f, y = 7.601f)
                // c -0.39 0.39 -1.023 0.39 -1.414 0
                curveToRelative(
                    dx1 = -0.39f,
                    dy1 = 0.39f,
                    dx2 = -1.023f,
                    dy2 = 0.39f,
                    dx3 = -1.414f,
                    dy3 = 0.0f,
                )
                // c -0.391 -0.391 -0.39 -1.024 0 -1.415
                curveToRelative(
                    dx1 = -0.391f,
                    dy1 = -0.391f,
                    dx2 = -0.39f,
                    dy2 = -1.024f,
                    dx3 = 0.0f,
                    dy3 = -1.415f,
                )
                // c 0.391 -0.39 1.023 -0.39 1.414 0
                curveToRelative(
                    dx1 = 0.391f,
                    dy1 = -0.39f,
                    dx2 = 1.023f,
                    dy2 = -0.39f,
                    dx3 = 1.414f,
                    dy3 = 0.0f,
                )
                // c 0.391 0.391 0.391 1.024 0 1.415z
                curveToRelative(
                    dx1 = 0.391f,
                    dy1 = 0.391f,
                    dx2 = 0.391f,
                    dy2 = 1.024f,
                    dx3 = 0.0f,
                    dy3 = 1.415f,
                )
                close()
            }
            // M23.682 30.431 l0.002 -0.051 c0.027 -0.552 0.497 -0.977 1.049 -0.949 0.016 0.001 2.156 0.063 3.8 -1.58 1.637 -1.638 1.578 -3.772 1.58 -3.801 -0.033 -0.55 0.397 -1.021 0.948 -1.049 0.552 -0.027 1.022 0.397 1.049 0.949 0.012 0.122 0.123 3.028 -2.163 5.314 -2.288 2.287 -5.191 2.17 -5.314 2.164 -0.535 -0.027 -0.951 -0.468 -0.951 -0.997z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 23.682 30.431
                moveTo(x = 23.682f, y = 30.431f)
                // l 0.002 -0.051
                lineToRelative(dx = 0.002f, dy = -0.051f)
                // c 0.027 -0.552 0.497 -0.977 1.049 -0.949
                curveToRelative(
                    dx1 = 0.027f,
                    dy1 = -0.552f,
                    dx2 = 0.497f,
                    dy2 = -0.977f,
                    dx3 = 1.049f,
                    dy3 = -0.949f,
                )
                // c 0.016 0.001 2.156 0.063 3.8 -1.58
                curveToRelative(
                    dx1 = 0.016f,
                    dy1 = 0.001f,
                    dx2 = 2.156f,
                    dy2 = 0.063f,
                    dx3 = 3.8f,
                    dy3 = -1.58f,
                )
                // c 1.637 -1.638 1.578 -3.772 1.58 -3.801
                curveToRelative(
                    dx1 = 1.637f,
                    dy1 = -1.638f,
                    dx2 = 1.578f,
                    dy2 = -3.772f,
                    dx3 = 1.58f,
                    dy3 = -3.801f,
                )
                // c -0.033 -0.55 0.397 -1.021 0.948 -1.049
                curveToRelative(
                    dx1 = -0.033f,
                    dy1 = -0.55f,
                    dx2 = 0.397f,
                    dy2 = -1.021f,
                    dx3 = 0.948f,
                    dy3 = -1.049f,
                )
                // c 0.552 -0.027 1.022 0.397 1.049 0.949
                curveToRelative(
                    dx1 = 0.552f,
                    dy1 = -0.027f,
                    dx2 = 1.022f,
                    dy2 = 0.397f,
                    dx3 = 1.049f,
                    dy3 = 0.949f,
                )
                // c 0.012 0.122 0.123 3.028 -2.163 5.314
                curveToRelative(
                    dx1 = 0.012f,
                    dy1 = 0.122f,
                    dx2 = 0.123f,
                    dy2 = 3.028f,
                    dx3 = -2.163f,
                    dy3 = 5.314f,
                )
                // c -2.288 2.287 -5.191 2.17 -5.314 2.164
                curveToRelative(
                    dx1 = -2.288f,
                    dy1 = 2.287f,
                    dx2 = -5.191f,
                    dy2 = 2.17f,
                    dx3 = -5.314f,
                    dy3 = 2.164f,
                )
                // c -0.535 -0.027 -0.951 -0.468 -0.951 -0.997z
                curveToRelative(
                    dx1 = -0.535f,
                    dy1 = -0.027f,
                    dx2 = -0.951f,
                    dy2 = -0.468f,
                    dx3 = -0.951f,
                    dy3 = -0.997f,
                )
                close()
            }
            // M24.238 33.989 c0 -0.109 0.018 -0.221 0.057 -0.33 0.182 -0.521 0.752 -0.796 1.273 -0.613 0.107 0.034 2.877 0.893 5.964 -2.195 3.127 -3.126 2.414 -6.126 2.382 -6.252 -0.137 -0.529 0.184 -1.077 0.716 -1.216 0.53 -0.14 1.073 0.172 1.217 0.701 0.046 0.17 1.077 4.205 -2.9 8.181 -4.014 4.016 -7.876 2.726 -8.038 2.668 -0.413 -0.144 -0.671 -0.531 -0.671 -0.944z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 24.238 33.989
                moveTo(x = 24.238f, y = 33.989f)
                // c 0 -0.109 0.018 -0.221 0.057 -0.33
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.109f,
                    dx2 = 0.018f,
                    dy2 = -0.221f,
                    dx3 = 0.057f,
                    dy3 = -0.33f,
                )
                // c 0.182 -0.521 0.752 -0.796 1.273 -0.613
                curveToRelative(
                    dx1 = 0.182f,
                    dy1 = -0.521f,
                    dx2 = 0.752f,
                    dy2 = -0.796f,
                    dx3 = 1.273f,
                    dy3 = -0.613f,
                )
                // c 0.107 0.034 2.877 0.893 5.964 -2.195
                curveToRelative(
                    dx1 = 0.107f,
                    dy1 = 0.034f,
                    dx2 = 2.877f,
                    dy2 = 0.893f,
                    dx3 = 5.964f,
                    dy3 = -2.195f,
                )
                // c 3.127 -3.126 2.414 -6.126 2.382 -6.252
                curveToRelative(
                    dx1 = 3.127f,
                    dy1 = -3.126f,
                    dx2 = 2.414f,
                    dy2 = -6.126f,
                    dx3 = 2.382f,
                    dy3 = -6.252f,
                )
                // c -0.137 -0.529 0.184 -1.077 0.716 -1.216
                curveToRelative(
                    dx1 = -0.137f,
                    dy1 = -0.529f,
                    dx2 = 0.184f,
                    dy2 = -1.077f,
                    dx3 = 0.716f,
                    dy3 = -1.216f,
                )
                // c 0.53 -0.14 1.073 0.172 1.217 0.701
                curveToRelative(
                    dx1 = 0.53f,
                    dy1 = -0.14f,
                    dx2 = 1.073f,
                    dy2 = 0.172f,
                    dx3 = 1.217f,
                    dy3 = 0.701f,
                )
                // c 0.046 0.17 1.077 4.205 -2.9 8.181
                curveToRelative(
                    dx1 = 0.046f,
                    dy1 = 0.17f,
                    dx2 = 1.077f,
                    dy2 = 4.205f,
                    dx3 = -2.9f,
                    dy3 = 8.181f,
                )
                // c -4.014 4.016 -7.876 2.726 -8.038 2.668
                curveToRelative(
                    dx1 = -4.014f,
                    dy1 = 4.016f,
                    dx2 = -7.876f,
                    dy2 = 2.726f,
                    dx3 = -8.038f,
                    dy3 = 2.668f,
                )
                // c -0.413 -0.144 -0.671 -0.531 -0.671 -0.944z
                curveToRelative(
                    dx1 = -0.413f,
                    dy1 = -0.144f,
                    dx2 = -0.671f,
                    dy2 = -0.531f,
                    dx3 = -0.671f,
                    dy3 = -0.944f,
                )
                close()
            }
        }.build().also { _emoji1f6f0 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f6f0: ImageVector? = null
