package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f250: ImageVector
    get() {
        val current = _emoji1f250
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f250",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M18 0 C8.059 0 0 8.06 0 18 c0 9.941 8.059 18 18 18 s18 -8.059 18 -18 c0 -9.94 -8.059 -18 -18 -18z M18 34 C9.164 34 2 26.837 2 18 2 9.164 9.164 2 18 2 c8.837 0 16 7.164 16 16 0 8.837 -7.163 16 -16 16z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 18 0
                moveTo(x = 18.0f, y = 0.0f)
                // C 8.059 0 0 8.06 0 18
                curveTo(
                    x1 = 8.059f,
                    y1 = 0.0f,
                    x2 = 0.0f,
                    y2 = 8.06f,
                    x3 = 0.0f,
                    y3 = 18.0f,
                )
                // c 0 9.941 8.059 18 18 18
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 9.941f,
                    dx2 = 8.059f,
                    dy2 = 18.0f,
                    dx3 = 18.0f,
                    dy3 = 18.0f,
                )
                // s 18 -8.059 18 -18
                reflectiveCurveToRelative(
                    dx1 = 18.0f,
                    dy1 = -8.059f,
                    dx2 = 18.0f,
                    dy2 = -18.0f,
                )
                // c 0 -9.94 -8.059 -18 -18 -18z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -9.94f,
                    dx2 = -8.059f,
                    dy2 = -18.0f,
                    dx3 = -18.0f,
                    dy3 = -18.0f,
                )
                close()
                // M 18 34
                moveTo(x = 18.0f, y = 34.0f)
                // C 9.164 34 2 26.837 2 18
                curveTo(
                    x1 = 9.164f,
                    y1 = 34.0f,
                    x2 = 2.0f,
                    y2 = 26.837f,
                    x3 = 2.0f,
                    y3 = 18.0f,
                )
                // C 2 9.164 9.164 2 18 2
                curveTo(
                    x1 = 2.0f,
                    y1 = 9.164f,
                    x2 = 9.164f,
                    y2 = 2.0f,
                    x3 = 18.0f,
                    y3 = 2.0f,
                )
                // c 8.837 0 16 7.164 16 16
                curveToRelative(
                    dx1 = 8.837f,
                    dy1 = 0.0f,
                    dx2 = 16.0f,
                    dy2 = 7.164f,
                    dx3 = 16.0f,
                    dy3 = 16.0f,
                )
                // c 0 8.837 -7.163 16 -16 16z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 8.837f,
                    dx2 = -7.163f,
                    dy2 = 16.0f,
                    dx3 = -16.0f,
                    dy3 = 16.0f,
                )
                close()
            }
            // M9.706 21.539 c0 -1.066 0.078 -2.185 0.286 -3.407 -0.65 0.806 -1.352 1.509 -2.08 2.055 -0.156 0.13 -0.312 0.183 -0.52 0.183 -0.26 0 -0.546 -0.131 -0.78 -0.391 -0.13 -0.208 -0.182 -0.416 -0.182 -0.624 0 -0.286 0.104 -0.546 0.338 -0.729 2.236 -1.742 3.926 -3.9 5.2 -6.214 0.182 -0.312 0.442 -0.468 0.728 -0.468 0.182 0 0.364 0.052 0.52 0.156 0.364 0.182 0.52 0.442 0.52 0.754 0 0.156 -0.052 0.311 -0.13 0.468 -0.494 0.884 -1.196 1.95 -1.924 2.886 v13.209 c0 0.494 -0.39 0.754 -0.988 0.754 -0.572 0 -0.988 -0.26 -0.988 -0.754 v-7.878z M13.71 6.925 c0 0.156 -0.052 0.338 -0.156 0.494 -1.222 1.976 -3.146 4.004 -5.096 5.46 -0.208 0.182 -0.442 0.26 -0.65 0.26 -0.26 0 -0.494 -0.13 -0.728 -0.416 -0.156 -0.182 -0.234 -0.39 -0.234 -0.598 0 -0.286 0.156 -0.546 0.416 -0.754 1.846 -1.274 3.51 -3.094 4.602 -4.94 0.208 -0.26 0.494 -0.39 0.78 -0.39 0.208 0 0.39 0.052 0.572 0.156 0.311 0.182 0.494 0.443 0.494 0.728z M26.84 20.785 h2.834 c0.469 0 0.703 0.312 0.703 0.832 0 0.493 -0.234 0.831 -0.703 0.831 L26.84 22.448 v4.967 c0 1.794 -0.935 2.392 -2.887 2.392 -0.936 0 -1.818 -0.052 -2.496 -0.208 -0.363 -0.078 -0.676 -0.416 -0.676 -0.884 0 -0.078 0 -0.156 0.027 -0.234 0.104 -0.52 0.467 -0.779 0.805 -0.779 0.053 0 0.078 0 0.131 0.025 0.676 0.183 1.483 0.234 1.977 0.234 0.988 0 1.221 -0.182 1.221 -1.014 v-4.499 L13.71 22.448 c-0.468 0 -0.702 -0.312 -0.702 -0.806 0 -0.546 0.234 -0.857 0.702 -0.857 h11.232 v-2.003 L14.074 18.782 c-0.468 0 -0.702 -0.364 -0.702 -0.832 0 -0.494 0.234 -0.832 0.702 -0.832 h15.419 c0.441 0 0.676 0.338 0.676 0.832 0 0.468 -0.234 0.832 -0.676 0.832 L26.84 18.782 v2.003z M26.449 6.795 c1.482 0 2.133 0.572 2.133 1.95 v4.784 c0 1.378 -0.65 1.95 -2.133 1.95 h-8.736 c-1.508 0 -2.158 -0.572 -2.158 -1.95 L15.555 8.746 c0 -1.378 0.65 -1.95 2.158 -1.95 h8.736z M17.532 23.047 c0.26 0 0.52 0.104 0.676 0.26 0.91 0.884 1.795 1.872 2.445 2.756 0.104 0.156 0.156 0.338 0.156 0.521 0 0.286 -0.131 0.571 -0.416 0.806 -0.234 0.208 -0.494 0.286 -0.728 0.286 -0.26 0 -0.52 -0.105 -0.65 -0.312 -0.65 -0.937 -1.56 -2.055 -2.314 -2.835 -0.156 -0.155 -0.234 -0.363 -0.234 -0.546 0 -0.26 0.13 -0.494 0.364 -0.702 0.207 -0.156 0.466 -0.234 0.701 -0.234z M26.762 10.332 L26.762 8.954 c0 -0.468 -0.234 -0.598 -0.701 -0.598 h-7.983 c-0.468 0 -0.702 0.13 -0.702 0.598 v1.378 h9.386z M17.375 13.296 c0 0.494 0.234 0.624 0.702 0.624 h7.983 c0.467 0 0.701 -0.13 0.701 -0.624 v-1.43 h-9.386 v1.43z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 9.706 21.539
                moveTo(x = 9.706f, y = 21.539f)
                // c 0 -1.066 0.078 -2.185 0.286 -3.407
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.066f,
                    dx2 = 0.078f,
                    dy2 = -2.185f,
                    dx3 = 0.286f,
                    dy3 = -3.407f,
                )
                // c -0.65 0.806 -1.352 1.509 -2.08 2.055
                curveToRelative(
                    dx1 = -0.65f,
                    dy1 = 0.806f,
                    dx2 = -1.352f,
                    dy2 = 1.509f,
                    dx3 = -2.08f,
                    dy3 = 2.055f,
                )
                // c -0.156 0.13 -0.312 0.183 -0.52 0.183
                curveToRelative(
                    dx1 = -0.156f,
                    dy1 = 0.13f,
                    dx2 = -0.312f,
                    dy2 = 0.183f,
                    dx3 = -0.52f,
                    dy3 = 0.183f,
                )
                // c -0.26 0 -0.546 -0.131 -0.78 -0.391
                curveToRelative(
                    dx1 = -0.26f,
                    dy1 = 0.0f,
                    dx2 = -0.546f,
                    dy2 = -0.131f,
                    dx3 = -0.78f,
                    dy3 = -0.391f,
                )
                // c -0.13 -0.208 -0.182 -0.416 -0.182 -0.624
                curveToRelative(
                    dx1 = -0.13f,
                    dy1 = -0.208f,
                    dx2 = -0.182f,
                    dy2 = -0.416f,
                    dx3 = -0.182f,
                    dy3 = -0.624f,
                )
                // c 0 -0.286 0.104 -0.546 0.338 -0.729
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.286f,
                    dx2 = 0.104f,
                    dy2 = -0.546f,
                    dx3 = 0.338f,
                    dy3 = -0.729f,
                )
                // c 2.236 -1.742 3.926 -3.9 5.2 -6.214
                curveToRelative(
                    dx1 = 2.236f,
                    dy1 = -1.742f,
                    dx2 = 3.926f,
                    dy2 = -3.9f,
                    dx3 = 5.2f,
                    dy3 = -6.214f,
                )
                // c 0.182 -0.312 0.442 -0.468 0.728 -0.468
                curveToRelative(
                    dx1 = 0.182f,
                    dy1 = -0.312f,
                    dx2 = 0.442f,
                    dy2 = -0.468f,
                    dx3 = 0.728f,
                    dy3 = -0.468f,
                )
                // c 0.182 0 0.364 0.052 0.52 0.156
                curveToRelative(
                    dx1 = 0.182f,
                    dy1 = 0.0f,
                    dx2 = 0.364f,
                    dy2 = 0.052f,
                    dx3 = 0.52f,
                    dy3 = 0.156f,
                )
                // c 0.364 0.182 0.52 0.442 0.52 0.754
                curveToRelative(
                    dx1 = 0.364f,
                    dy1 = 0.182f,
                    dx2 = 0.52f,
                    dy2 = 0.442f,
                    dx3 = 0.52f,
                    dy3 = 0.754f,
                )
                // c 0 0.156 -0.052 0.311 -0.13 0.468
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.156f,
                    dx2 = -0.052f,
                    dy2 = 0.311f,
                    dx3 = -0.13f,
                    dy3 = 0.468f,
                )
                // c -0.494 0.884 -1.196 1.95 -1.924 2.886
                curveToRelative(
                    dx1 = -0.494f,
                    dy1 = 0.884f,
                    dx2 = -1.196f,
                    dy2 = 1.95f,
                    dx3 = -1.924f,
                    dy3 = 2.886f,
                )
                // v 13.209
                verticalLineToRelative(dy = 13.209f)
                // c 0 0.494 -0.39 0.754 -0.988 0.754
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.494f,
                    dx2 = -0.39f,
                    dy2 = 0.754f,
                    dx3 = -0.988f,
                    dy3 = 0.754f,
                )
                // c -0.572 0 -0.988 -0.26 -0.988 -0.754
                curveToRelative(
                    dx1 = -0.572f,
                    dy1 = 0.0f,
                    dx2 = -0.988f,
                    dy2 = -0.26f,
                    dx3 = -0.988f,
                    dy3 = -0.754f,
                )
                // v -7.878z
                verticalLineToRelative(dy = -7.878f)
                close()
                // M 13.71 6.925
                moveTo(x = 13.71f, y = 6.925f)
                // c 0 0.156 -0.052 0.338 -0.156 0.494
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.156f,
                    dx2 = -0.052f,
                    dy2 = 0.338f,
                    dx3 = -0.156f,
                    dy3 = 0.494f,
                )
                // c -1.222 1.976 -3.146 4.004 -5.096 5.46
                curveToRelative(
                    dx1 = -1.222f,
                    dy1 = 1.976f,
                    dx2 = -3.146f,
                    dy2 = 4.004f,
                    dx3 = -5.096f,
                    dy3 = 5.46f,
                )
                // c -0.208 0.182 -0.442 0.26 -0.65 0.26
                curveToRelative(
                    dx1 = -0.208f,
                    dy1 = 0.182f,
                    dx2 = -0.442f,
                    dy2 = 0.26f,
                    dx3 = -0.65f,
                    dy3 = 0.26f,
                )
                // c -0.26 0 -0.494 -0.13 -0.728 -0.416
                curveToRelative(
                    dx1 = -0.26f,
                    dy1 = 0.0f,
                    dx2 = -0.494f,
                    dy2 = -0.13f,
                    dx3 = -0.728f,
                    dy3 = -0.416f,
                )
                // c -0.156 -0.182 -0.234 -0.39 -0.234 -0.598
                curveToRelative(
                    dx1 = -0.156f,
                    dy1 = -0.182f,
                    dx2 = -0.234f,
                    dy2 = -0.39f,
                    dx3 = -0.234f,
                    dy3 = -0.598f,
                )
                // c 0 -0.286 0.156 -0.546 0.416 -0.754
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.286f,
                    dx2 = 0.156f,
                    dy2 = -0.546f,
                    dx3 = 0.416f,
                    dy3 = -0.754f,
                )
                // c 1.846 -1.274 3.51 -3.094 4.602 -4.94
                curveToRelative(
                    dx1 = 1.846f,
                    dy1 = -1.274f,
                    dx2 = 3.51f,
                    dy2 = -3.094f,
                    dx3 = 4.602f,
                    dy3 = -4.94f,
                )
                // c 0.208 -0.26 0.494 -0.39 0.78 -0.39
                curveToRelative(
                    dx1 = 0.208f,
                    dy1 = -0.26f,
                    dx2 = 0.494f,
                    dy2 = -0.39f,
                    dx3 = 0.78f,
                    dy3 = -0.39f,
                )
                // c 0.208 0 0.39 0.052 0.572 0.156
                curveToRelative(
                    dx1 = 0.208f,
                    dy1 = 0.0f,
                    dx2 = 0.39f,
                    dy2 = 0.052f,
                    dx3 = 0.572f,
                    dy3 = 0.156f,
                )
                // c 0.311 0.182 0.494 0.443 0.494 0.728z
                curveToRelative(
                    dx1 = 0.311f,
                    dy1 = 0.182f,
                    dx2 = 0.494f,
                    dy2 = 0.443f,
                    dx3 = 0.494f,
                    dy3 = 0.728f,
                )
                close()
                // M 26.84 20.785
                moveTo(x = 26.84f, y = 20.785f)
                // h 2.834
                horizontalLineToRelative(dx = 2.834f)
                // c 0.469 0 0.703 0.312 0.703 0.832
                curveToRelative(
                    dx1 = 0.469f,
                    dy1 = 0.0f,
                    dx2 = 0.703f,
                    dy2 = 0.312f,
                    dx3 = 0.703f,
                    dy3 = 0.832f,
                )
                // c 0 0.493 -0.234 0.831 -0.703 0.831
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.493f,
                    dx2 = -0.234f,
                    dy2 = 0.831f,
                    dx3 = -0.703f,
                    dy3 = 0.831f,
                )
                // L 26.84 22.448
                lineTo(x = 26.84f, y = 22.448f)
                // v 4.967
                verticalLineToRelative(dy = 4.967f)
                // c 0 1.794 -0.935 2.392 -2.887 2.392
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.794f,
                    dx2 = -0.935f,
                    dy2 = 2.392f,
                    dx3 = -2.887f,
                    dy3 = 2.392f,
                )
                // c -0.936 0 -1.818 -0.052 -2.496 -0.208
                curveToRelative(
                    dx1 = -0.936f,
                    dy1 = 0.0f,
                    dx2 = -1.818f,
                    dy2 = -0.052f,
                    dx3 = -2.496f,
                    dy3 = -0.208f,
                )
                // c -0.363 -0.078 -0.676 -0.416 -0.676 -0.884
                curveToRelative(
                    dx1 = -0.363f,
                    dy1 = -0.078f,
                    dx2 = -0.676f,
                    dy2 = -0.416f,
                    dx3 = -0.676f,
                    dy3 = -0.884f,
                )
                // c 0 -0.078 0 -0.156 0.027 -0.234
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.078f,
                    dx2 = 0.0f,
                    dy2 = -0.156f,
                    dx3 = 0.027f,
                    dy3 = -0.234f,
                )
                // c 0.104 -0.52 0.467 -0.779 0.805 -0.779
                curveToRelative(
                    dx1 = 0.104f,
                    dy1 = -0.52f,
                    dx2 = 0.467f,
                    dy2 = -0.779f,
                    dx3 = 0.805f,
                    dy3 = -0.779f,
                )
                // c 0.053 0 0.078 0 0.131 0.025
                curveToRelative(
                    dx1 = 0.053f,
                    dy1 = 0.0f,
                    dx2 = 0.078f,
                    dy2 = 0.0f,
                    dx3 = 0.131f,
                    dy3 = 0.025f,
                )
                // c 0.676 0.183 1.483 0.234 1.977 0.234
                curveToRelative(
                    dx1 = 0.676f,
                    dy1 = 0.183f,
                    dx2 = 1.483f,
                    dy2 = 0.234f,
                    dx3 = 1.977f,
                    dy3 = 0.234f,
                )
                // c 0.988 0 1.221 -0.182 1.221 -1.014
                curveToRelative(
                    dx1 = 0.988f,
                    dy1 = 0.0f,
                    dx2 = 1.221f,
                    dy2 = -0.182f,
                    dx3 = 1.221f,
                    dy3 = -1.014f,
                )
                // v -4.499
                verticalLineToRelative(dy = -4.499f)
                // L 13.71 22.448
                lineTo(x = 13.71f, y = 22.448f)
                // c -0.468 0 -0.702 -0.312 -0.702 -0.806
                curveToRelative(
                    dx1 = -0.468f,
                    dy1 = 0.0f,
                    dx2 = -0.702f,
                    dy2 = -0.312f,
                    dx3 = -0.702f,
                    dy3 = -0.806f,
                )
                // c 0 -0.546 0.234 -0.857 0.702 -0.857
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.546f,
                    dx2 = 0.234f,
                    dy2 = -0.857f,
                    dx3 = 0.702f,
                    dy3 = -0.857f,
                )
                // h 11.232
                horizontalLineToRelative(dx = 11.232f)
                // v -2.003
                verticalLineToRelative(dy = -2.003f)
                // L 14.074 18.782
                lineTo(x = 14.074f, y = 18.782f)
                // c -0.468 0 -0.702 -0.364 -0.702 -0.832
                curveToRelative(
                    dx1 = -0.468f,
                    dy1 = 0.0f,
                    dx2 = -0.702f,
                    dy2 = -0.364f,
                    dx3 = -0.702f,
                    dy3 = -0.832f,
                )
                // c 0 -0.494 0.234 -0.832 0.702 -0.832
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.494f,
                    dx2 = 0.234f,
                    dy2 = -0.832f,
                    dx3 = 0.702f,
                    dy3 = -0.832f,
                )
                // h 15.419
                horizontalLineToRelative(dx = 15.419f)
                // c 0.441 0 0.676 0.338 0.676 0.832
                curveToRelative(
                    dx1 = 0.441f,
                    dy1 = 0.0f,
                    dx2 = 0.676f,
                    dy2 = 0.338f,
                    dx3 = 0.676f,
                    dy3 = 0.832f,
                )
                // c 0 0.468 -0.234 0.832 -0.676 0.832
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.468f,
                    dx2 = -0.234f,
                    dy2 = 0.832f,
                    dx3 = -0.676f,
                    dy3 = 0.832f,
                )
                // L 26.84 18.782
                lineTo(x = 26.84f, y = 18.782f)
                // v 2.003z
                verticalLineToRelative(dy = 2.003f)
                close()
                // M 26.449 6.795
                moveTo(x = 26.449f, y = 6.795f)
                // c 1.482 0 2.133 0.572 2.133 1.95
                curveToRelative(
                    dx1 = 1.482f,
                    dy1 = 0.0f,
                    dx2 = 2.133f,
                    dy2 = 0.572f,
                    dx3 = 2.133f,
                    dy3 = 1.95f,
                )
                // v 4.784
                verticalLineToRelative(dy = 4.784f)
                // c 0 1.378 -0.65 1.95 -2.133 1.95
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.378f,
                    dx2 = -0.65f,
                    dy2 = 1.95f,
                    dx3 = -2.133f,
                    dy3 = 1.95f,
                )
                // h -8.736
                horizontalLineToRelative(dx = -8.736f)
                // c -1.508 0 -2.158 -0.572 -2.158 -1.95
                curveToRelative(
                    dx1 = -1.508f,
                    dy1 = 0.0f,
                    dx2 = -2.158f,
                    dy2 = -0.572f,
                    dx3 = -2.158f,
                    dy3 = -1.95f,
                )
                // L 15.555 8.746
                lineTo(x = 15.555f, y = 8.746f)
                // c 0 -1.378 0.65 -1.95 2.158 -1.95
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.378f,
                    dx2 = 0.65f,
                    dy2 = -1.95f,
                    dx3 = 2.158f,
                    dy3 = -1.95f,
                )
                // h 8.736z
                horizontalLineToRelative(dx = 8.736f)
                close()
                // M 17.532 23.047
                moveTo(x = 17.532f, y = 23.047f)
                // c 0.26 0 0.52 0.104 0.676 0.26
                curveToRelative(
                    dx1 = 0.26f,
                    dy1 = 0.0f,
                    dx2 = 0.52f,
                    dy2 = 0.104f,
                    dx3 = 0.676f,
                    dy3 = 0.26f,
                )
                // c 0.91 0.884 1.795 1.872 2.445 2.756
                curveToRelative(
                    dx1 = 0.91f,
                    dy1 = 0.884f,
                    dx2 = 1.795f,
                    dy2 = 1.872f,
                    dx3 = 2.445f,
                    dy3 = 2.756f,
                )
                // c 0.104 0.156 0.156 0.338 0.156 0.521
                curveToRelative(
                    dx1 = 0.104f,
                    dy1 = 0.156f,
                    dx2 = 0.156f,
                    dy2 = 0.338f,
                    dx3 = 0.156f,
                    dy3 = 0.521f,
                )
                // c 0 0.286 -0.131 0.571 -0.416 0.806
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.286f,
                    dx2 = -0.131f,
                    dy2 = 0.571f,
                    dx3 = -0.416f,
                    dy3 = 0.806f,
                )
                // c -0.234 0.208 -0.494 0.286 -0.728 0.286
                curveToRelative(
                    dx1 = -0.234f,
                    dy1 = 0.208f,
                    dx2 = -0.494f,
                    dy2 = 0.286f,
                    dx3 = -0.728f,
                    dy3 = 0.286f,
                )
                // c -0.26 0 -0.52 -0.105 -0.65 -0.312
                curveToRelative(
                    dx1 = -0.26f,
                    dy1 = 0.0f,
                    dx2 = -0.52f,
                    dy2 = -0.105f,
                    dx3 = -0.65f,
                    dy3 = -0.312f,
                )
                // c -0.65 -0.937 -1.56 -2.055 -2.314 -2.835
                curveToRelative(
                    dx1 = -0.65f,
                    dy1 = -0.937f,
                    dx2 = -1.56f,
                    dy2 = -2.055f,
                    dx3 = -2.314f,
                    dy3 = -2.835f,
                )
                // c -0.156 -0.155 -0.234 -0.363 -0.234 -0.546
                curveToRelative(
                    dx1 = -0.156f,
                    dy1 = -0.155f,
                    dx2 = -0.234f,
                    dy2 = -0.363f,
                    dx3 = -0.234f,
                    dy3 = -0.546f,
                )
                // c 0 -0.26 0.13 -0.494 0.364 -0.702
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.26f,
                    dx2 = 0.13f,
                    dy2 = -0.494f,
                    dx3 = 0.364f,
                    dy3 = -0.702f,
                )
                // c 0.207 -0.156 0.466 -0.234 0.701 -0.234z
                curveToRelative(
                    dx1 = 0.207f,
                    dy1 = -0.156f,
                    dx2 = 0.466f,
                    dy2 = -0.234f,
                    dx3 = 0.701f,
                    dy3 = -0.234f,
                )
                close()
                // M 26.762 10.332
                moveTo(x = 26.762f, y = 10.332f)
                // L 26.762 8.954
                lineTo(x = 26.762f, y = 8.954f)
                // c 0 -0.468 -0.234 -0.598 -0.701 -0.598
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.468f,
                    dx2 = -0.234f,
                    dy2 = -0.598f,
                    dx3 = -0.701f,
                    dy3 = -0.598f,
                )
                // h -7.983
                horizontalLineToRelative(dx = -7.983f)
                // c -0.468 0 -0.702 0.13 -0.702 0.598
                curveToRelative(
                    dx1 = -0.468f,
                    dy1 = 0.0f,
                    dx2 = -0.702f,
                    dy2 = 0.13f,
                    dx3 = -0.702f,
                    dy3 = 0.598f,
                )
                // v 1.378
                verticalLineToRelative(dy = 1.378f)
                // h 9.386z
                horizontalLineToRelative(dx = 9.386f)
                close()
                // M 17.375 13.296
                moveTo(x = 17.375f, y = 13.296f)
                // c 0 0.494 0.234 0.624 0.702 0.624
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.494f,
                    dx2 = 0.234f,
                    dy2 = 0.624f,
                    dx3 = 0.702f,
                    dy3 = 0.624f,
                )
                // h 7.983
                horizontalLineToRelative(dx = 7.983f)
                // c 0.467 0 0.701 -0.13 0.701 -0.624
                curveToRelative(
                    dx1 = 0.467f,
                    dy1 = 0.0f,
                    dx2 = 0.701f,
                    dy2 = -0.13f,
                    dx3 = 0.701f,
                    dy3 = -0.624f,
                )
                // v -1.43
                verticalLineToRelative(dy = -1.43f)
                // h -9.386
                horizontalLineToRelative(dx = -9.386f)
                // v 1.43z
                verticalLineToRelative(dy = 1.43f)
                close()
            }
        }.build().also { _emoji1f250 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f250: ImageVector? = null
