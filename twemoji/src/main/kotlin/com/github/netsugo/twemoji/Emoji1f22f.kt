package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f22f: ImageVector
    get() {
        val current = _emoji1f22f
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f22f",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 32 c0 2.209 -1.791 4 -4 4 H4 c-2.209 0 -4 -1.791 -4 -4 V4 c0 -2.209 1.791 -4 4 -4 h28 c2.209 0 4 1.791 4 4 v28z
            path(
                fill = SolidColor(Color(0xFF77B255)),
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
            // M14.101 11.125 c0.494 0 0.754 0.364 0.754 0.884 0 0.546 -0.26 0.936 -0.754 0.936 h-2.314 v5.148 c0.754 -0.26 1.483 -0.52 2.08 -0.78 0.156 -0.052 0.26 -0.078 0.39 -0.078 0.312 0 0.52 0.182 0.65 0.572 0.078 0.156 0.104 0.312 0.104 0.442 0 0.286 -0.156 0.52 -0.52 0.676 -0.78 0.363 -1.716 0.754 -2.704 1.092 v7.488 c0 1.872 -0.728 2.444 -2.6 2.444 -0.91 0 -1.534 -0.052 -2.106 -0.208 -0.442 -0.105 -0.676 -0.442 -0.676 -0.91 0 -0.078 0 -0.156 0.026 -0.26 0.078 -0.442 0.364 -0.729 0.78 -0.729 0.078 0 0.182 0 0.26 0.026 0.416 0.104 1.014 0.182 1.378 0.182 0.832 0 1.014 -0.155 1.014 -0.91 v-6.474 c-0.963 0.287 -1.873 0.548 -2.679 0.756 -0.104 0.025 -0.182 0.025 -0.26 0.025 -0.442 0 -0.754 -0.26 -0.858 -0.779 -0.026 -0.131 -0.052 -0.234 -0.052 -0.364 0 -0.416 0.234 -0.676 0.65 -0.727 0.962 -0.234 2.08 -0.521 3.198 -0.858 v-5.773 h-2.99 c-0.468 0 -0.728 -0.39 -0.728 -0.91 0 -0.546 0.26 -0.91 0.728 -0.91 h2.99 L9.862 6.731 c0 -0.521 0.338 -0.78 0.936 -0.78 0.624 0 0.988 0.26 0.988 0.78 v4.394 h2.315z M26.269 17.833 c1.404 0 2.106 0.598 2.106 2.054 v7.67 c0 1.431 -0.702 2.055 -2.106 2.055 h-8.294 c-1.378 0 -2.106 -0.624 -2.106 -2.055 v-7.67 c0 -1.456 0.729 -2.054 2.106 -2.054 h8.294z M17.871 12.815 c0 0.962 0.416 1.118 4.784 1.118 3.692 0 4.291 -0.234 4.629 -0.78 0.182 -0.286 0.338 -0.858 0.416 -1.586 0.052 -0.468 0.338 -0.702 0.832 -0.702 h0.155 c0.546 0.052 0.885 0.364 0.885 0.806 v0.104 c-0.104 1.17 -0.339 2.132 -0.885 2.808 -0.649 0.832 -1.534 1.17 -6.058 1.17 -5.798 0 -6.709 -0.286 -6.709 -2.47 L15.92 6.861 c0 -0.468 0.364 -0.728 0.962 -0.728 0.572 0 0.988 0.26 0.988 0.728 v2.574 c3.172 -0.416 6.838 -1.353 9.205 -2.366 0.182 -0.078 0.338 -0.104 0.493 -0.104 0.364 0 0.65 0.234 0.807 0.624 0.078 0.182 0.104 0.338 0.104 0.468 0 0.364 -0.208 0.624 -0.598 0.78 -2.86 1.118 -6.553 1.95 -10.01 2.314 v1.664z M26.451 20.199 c0 -0.519 -0.26 -0.649 -0.754 -0.649 L18.52 19.55 c-0.494 0 -0.728 0.13 -0.728 0.649 v2.549 h8.659 v-2.549z M17.792 24.412 v2.782 c0 0.52 0.234 0.649 0.728 0.649 h7.177 c0.494 0 0.754 -0.13 0.754 -0.649 v-2.782 h-8.659z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 14.101 11.125
                moveTo(x = 14.101f, y = 11.125f)
                // c 0.494 0 0.754 0.364 0.754 0.884
                curveToRelative(
                    dx1 = 0.494f,
                    dy1 = 0.0f,
                    dx2 = 0.754f,
                    dy2 = 0.364f,
                    dx3 = 0.754f,
                    dy3 = 0.884f,
                )
                // c 0 0.546 -0.26 0.936 -0.754 0.936
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.546f,
                    dx2 = -0.26f,
                    dy2 = 0.936f,
                    dx3 = -0.754f,
                    dy3 = 0.936f,
                )
                // h -2.314
                horizontalLineToRelative(dx = -2.314f)
                // v 5.148
                verticalLineToRelative(dy = 5.148f)
                // c 0.754 -0.26 1.483 -0.52 2.08 -0.78
                curveToRelative(
                    dx1 = 0.754f,
                    dy1 = -0.26f,
                    dx2 = 1.483f,
                    dy2 = -0.52f,
                    dx3 = 2.08f,
                    dy3 = -0.78f,
                )
                // c 0.156 -0.052 0.26 -0.078 0.39 -0.078
                curveToRelative(
                    dx1 = 0.156f,
                    dy1 = -0.052f,
                    dx2 = 0.26f,
                    dy2 = -0.078f,
                    dx3 = 0.39f,
                    dy3 = -0.078f,
                )
                // c 0.312 0 0.52 0.182 0.65 0.572
                curveToRelative(
                    dx1 = 0.312f,
                    dy1 = 0.0f,
                    dx2 = 0.52f,
                    dy2 = 0.182f,
                    dx3 = 0.65f,
                    dy3 = 0.572f,
                )
                // c 0.078 0.156 0.104 0.312 0.104 0.442
                curveToRelative(
                    dx1 = 0.078f,
                    dy1 = 0.156f,
                    dx2 = 0.104f,
                    dy2 = 0.312f,
                    dx3 = 0.104f,
                    dy3 = 0.442f,
                )
                // c 0 0.286 -0.156 0.52 -0.52 0.676
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.286f,
                    dx2 = -0.156f,
                    dy2 = 0.52f,
                    dx3 = -0.52f,
                    dy3 = 0.676f,
                )
                // c -0.78 0.363 -1.716 0.754 -2.704 1.092
                curveToRelative(
                    dx1 = -0.78f,
                    dy1 = 0.363f,
                    dx2 = -1.716f,
                    dy2 = 0.754f,
                    dx3 = -2.704f,
                    dy3 = 1.092f,
                )
                // v 7.488
                verticalLineToRelative(dy = 7.488f)
                // c 0 1.872 -0.728 2.444 -2.6 2.444
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.872f,
                    dx2 = -0.728f,
                    dy2 = 2.444f,
                    dx3 = -2.6f,
                    dy3 = 2.444f,
                )
                // c -0.91 0 -1.534 -0.052 -2.106 -0.208
                curveToRelative(
                    dx1 = -0.91f,
                    dy1 = 0.0f,
                    dx2 = -1.534f,
                    dy2 = -0.052f,
                    dx3 = -2.106f,
                    dy3 = -0.208f,
                )
                // c -0.442 -0.105 -0.676 -0.442 -0.676 -0.91
                curveToRelative(
                    dx1 = -0.442f,
                    dy1 = -0.105f,
                    dx2 = -0.676f,
                    dy2 = -0.442f,
                    dx3 = -0.676f,
                    dy3 = -0.91f,
                )
                // c 0 -0.078 0 -0.156 0.026 -0.26
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.078f,
                    dx2 = 0.0f,
                    dy2 = -0.156f,
                    dx3 = 0.026f,
                    dy3 = -0.26f,
                )
                // c 0.078 -0.442 0.364 -0.729 0.78 -0.729
                curveToRelative(
                    dx1 = 0.078f,
                    dy1 = -0.442f,
                    dx2 = 0.364f,
                    dy2 = -0.729f,
                    dx3 = 0.78f,
                    dy3 = -0.729f,
                )
                // c 0.078 0 0.182 0 0.26 0.026
                curveToRelative(
                    dx1 = 0.078f,
                    dy1 = 0.0f,
                    dx2 = 0.182f,
                    dy2 = 0.0f,
                    dx3 = 0.26f,
                    dy3 = 0.026f,
                )
                // c 0.416 0.104 1.014 0.182 1.378 0.182
                curveToRelative(
                    dx1 = 0.416f,
                    dy1 = 0.104f,
                    dx2 = 1.014f,
                    dy2 = 0.182f,
                    dx3 = 1.378f,
                    dy3 = 0.182f,
                )
                // c 0.832 0 1.014 -0.155 1.014 -0.91
                curveToRelative(
                    dx1 = 0.832f,
                    dy1 = 0.0f,
                    dx2 = 1.014f,
                    dy2 = -0.155f,
                    dx3 = 1.014f,
                    dy3 = -0.91f,
                )
                // v -6.474
                verticalLineToRelative(dy = -6.474f)
                // c -0.963 0.287 -1.873 0.548 -2.679 0.756
                curveToRelative(
                    dx1 = -0.963f,
                    dy1 = 0.287f,
                    dx2 = -1.873f,
                    dy2 = 0.548f,
                    dx3 = -2.679f,
                    dy3 = 0.756f,
                )
                // c -0.104 0.025 -0.182 0.025 -0.26 0.025
                curveToRelative(
                    dx1 = -0.104f,
                    dy1 = 0.025f,
                    dx2 = -0.182f,
                    dy2 = 0.025f,
                    dx3 = -0.26f,
                    dy3 = 0.025f,
                )
                // c -0.442 0 -0.754 -0.26 -0.858 -0.779
                curveToRelative(
                    dx1 = -0.442f,
                    dy1 = 0.0f,
                    dx2 = -0.754f,
                    dy2 = -0.26f,
                    dx3 = -0.858f,
                    dy3 = -0.779f,
                )
                // c -0.026 -0.131 -0.052 -0.234 -0.052 -0.364
                curveToRelative(
                    dx1 = -0.026f,
                    dy1 = -0.131f,
                    dx2 = -0.052f,
                    dy2 = -0.234f,
                    dx3 = -0.052f,
                    dy3 = -0.364f,
                )
                // c 0 -0.416 0.234 -0.676 0.65 -0.727
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.416f,
                    dx2 = 0.234f,
                    dy2 = -0.676f,
                    dx3 = 0.65f,
                    dy3 = -0.727f,
                )
                // c 0.962 -0.234 2.08 -0.521 3.198 -0.858
                curveToRelative(
                    dx1 = 0.962f,
                    dy1 = -0.234f,
                    dx2 = 2.08f,
                    dy2 = -0.521f,
                    dx3 = 3.198f,
                    dy3 = -0.858f,
                )
                // v -5.773
                verticalLineToRelative(dy = -5.773f)
                // h -2.99
                horizontalLineToRelative(dx = -2.99f)
                // c -0.468 0 -0.728 -0.39 -0.728 -0.91
                curveToRelative(
                    dx1 = -0.468f,
                    dy1 = 0.0f,
                    dx2 = -0.728f,
                    dy2 = -0.39f,
                    dx3 = -0.728f,
                    dy3 = -0.91f,
                )
                // c 0 -0.546 0.26 -0.91 0.728 -0.91
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.546f,
                    dx2 = 0.26f,
                    dy2 = -0.91f,
                    dx3 = 0.728f,
                    dy3 = -0.91f,
                )
                // h 2.99
                horizontalLineToRelative(dx = 2.99f)
                // L 9.862 6.731
                lineTo(x = 9.862f, y = 6.731f)
                // c 0 -0.521 0.338 -0.78 0.936 -0.78
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.521f,
                    dx2 = 0.338f,
                    dy2 = -0.78f,
                    dx3 = 0.936f,
                    dy3 = -0.78f,
                )
                // c 0.624 0 0.988 0.26 0.988 0.78
                curveToRelative(
                    dx1 = 0.624f,
                    dy1 = 0.0f,
                    dx2 = 0.988f,
                    dy2 = 0.26f,
                    dx3 = 0.988f,
                    dy3 = 0.78f,
                )
                // v 4.394
                verticalLineToRelative(dy = 4.394f)
                // h 2.315z
                horizontalLineToRelative(dx = 2.315f)
                close()
                // M 26.269 17.833
                moveTo(x = 26.269f, y = 17.833f)
                // c 1.404 0 2.106 0.598 2.106 2.054
                curveToRelative(
                    dx1 = 1.404f,
                    dy1 = 0.0f,
                    dx2 = 2.106f,
                    dy2 = 0.598f,
                    dx3 = 2.106f,
                    dy3 = 2.054f,
                )
                // v 7.67
                verticalLineToRelative(dy = 7.67f)
                // c 0 1.431 -0.702 2.055 -2.106 2.055
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.431f,
                    dx2 = -0.702f,
                    dy2 = 2.055f,
                    dx3 = -2.106f,
                    dy3 = 2.055f,
                )
                // h -8.294
                horizontalLineToRelative(dx = -8.294f)
                // c -1.378 0 -2.106 -0.624 -2.106 -2.055
                curveToRelative(
                    dx1 = -1.378f,
                    dy1 = 0.0f,
                    dx2 = -2.106f,
                    dy2 = -0.624f,
                    dx3 = -2.106f,
                    dy3 = -2.055f,
                )
                // v -7.67
                verticalLineToRelative(dy = -7.67f)
                // c 0 -1.456 0.729 -2.054 2.106 -2.054
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.456f,
                    dx2 = 0.729f,
                    dy2 = -2.054f,
                    dx3 = 2.106f,
                    dy3 = -2.054f,
                )
                // h 8.294z
                horizontalLineToRelative(dx = 8.294f)
                close()
                // M 17.871 12.815
                moveTo(x = 17.871f, y = 12.815f)
                // c 0 0.962 0.416 1.118 4.784 1.118
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.962f,
                    dx2 = 0.416f,
                    dy2 = 1.118f,
                    dx3 = 4.784f,
                    dy3 = 1.118f,
                )
                // c 3.692 0 4.291 -0.234 4.629 -0.78
                curveToRelative(
                    dx1 = 3.692f,
                    dy1 = 0.0f,
                    dx2 = 4.291f,
                    dy2 = -0.234f,
                    dx3 = 4.629f,
                    dy3 = -0.78f,
                )
                // c 0.182 -0.286 0.338 -0.858 0.416 -1.586
                curveToRelative(
                    dx1 = 0.182f,
                    dy1 = -0.286f,
                    dx2 = 0.338f,
                    dy2 = -0.858f,
                    dx3 = 0.416f,
                    dy3 = -1.586f,
                )
                // c 0.052 -0.468 0.338 -0.702 0.832 -0.702
                curveToRelative(
                    dx1 = 0.052f,
                    dy1 = -0.468f,
                    dx2 = 0.338f,
                    dy2 = -0.702f,
                    dx3 = 0.832f,
                    dy3 = -0.702f,
                )
                // h 0.155
                horizontalLineToRelative(dx = 0.155f)
                // c 0.546 0.052 0.885 0.364 0.885 0.806
                curveToRelative(
                    dx1 = 0.546f,
                    dy1 = 0.052f,
                    dx2 = 0.885f,
                    dy2 = 0.364f,
                    dx3 = 0.885f,
                    dy3 = 0.806f,
                )
                // v 0.104
                verticalLineToRelative(dy = 0.104f)
                // c -0.104 1.17 -0.339 2.132 -0.885 2.808
                curveToRelative(
                    dx1 = -0.104f,
                    dy1 = 1.17f,
                    dx2 = -0.339f,
                    dy2 = 2.132f,
                    dx3 = -0.885f,
                    dy3 = 2.808f,
                )
                // c -0.649 0.832 -1.534 1.17 -6.058 1.17
                curveToRelative(
                    dx1 = -0.649f,
                    dy1 = 0.832f,
                    dx2 = -1.534f,
                    dy2 = 1.17f,
                    dx3 = -6.058f,
                    dy3 = 1.17f,
                )
                // c -5.798 0 -6.709 -0.286 -6.709 -2.47
                curveToRelative(
                    dx1 = -5.798f,
                    dy1 = 0.0f,
                    dx2 = -6.709f,
                    dy2 = -0.286f,
                    dx3 = -6.709f,
                    dy3 = -2.47f,
                )
                // L 15.92 6.861
                lineTo(x = 15.92f, y = 6.861f)
                // c 0 -0.468 0.364 -0.728 0.962 -0.728
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.468f,
                    dx2 = 0.364f,
                    dy2 = -0.728f,
                    dx3 = 0.962f,
                    dy3 = -0.728f,
                )
                // c 0.572 0 0.988 0.26 0.988 0.728
                curveToRelative(
                    dx1 = 0.572f,
                    dy1 = 0.0f,
                    dx2 = 0.988f,
                    dy2 = 0.26f,
                    dx3 = 0.988f,
                    dy3 = 0.728f,
                )
                // v 2.574
                verticalLineToRelative(dy = 2.574f)
                // c 3.172 -0.416 6.838 -1.353 9.205 -2.366
                curveToRelative(
                    dx1 = 3.172f,
                    dy1 = -0.416f,
                    dx2 = 6.838f,
                    dy2 = -1.353f,
                    dx3 = 9.205f,
                    dy3 = -2.366f,
                )
                // c 0.182 -0.078 0.338 -0.104 0.493 -0.104
                curveToRelative(
                    dx1 = 0.182f,
                    dy1 = -0.078f,
                    dx2 = 0.338f,
                    dy2 = -0.104f,
                    dx3 = 0.493f,
                    dy3 = -0.104f,
                )
                // c 0.364 0 0.65 0.234 0.807 0.624
                curveToRelative(
                    dx1 = 0.364f,
                    dy1 = 0.0f,
                    dx2 = 0.65f,
                    dy2 = 0.234f,
                    dx3 = 0.807f,
                    dy3 = 0.624f,
                )
                // c 0.078 0.182 0.104 0.338 0.104 0.468
                curveToRelative(
                    dx1 = 0.078f,
                    dy1 = 0.182f,
                    dx2 = 0.104f,
                    dy2 = 0.338f,
                    dx3 = 0.104f,
                    dy3 = 0.468f,
                )
                // c 0 0.364 -0.208 0.624 -0.598 0.78
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.364f,
                    dx2 = -0.208f,
                    dy2 = 0.624f,
                    dx3 = -0.598f,
                    dy3 = 0.78f,
                )
                // c -2.86 1.118 -6.553 1.95 -10.01 2.314
                curveToRelative(
                    dx1 = -2.86f,
                    dy1 = 1.118f,
                    dx2 = -6.553f,
                    dy2 = 1.95f,
                    dx3 = -10.01f,
                    dy3 = 2.314f,
                )
                // v 1.664z
                verticalLineToRelative(dy = 1.664f)
                close()
                // M 26.451 20.199
                moveTo(x = 26.451f, y = 20.199f)
                // c 0 -0.519 -0.26 -0.649 -0.754 -0.649
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.519f,
                    dx2 = -0.26f,
                    dy2 = -0.649f,
                    dx3 = -0.754f,
                    dy3 = -0.649f,
                )
                // L 18.52 19.55
                lineTo(x = 18.52f, y = 19.55f)
                // c -0.494 0 -0.728 0.13 -0.728 0.649
                curveToRelative(
                    dx1 = -0.494f,
                    dy1 = 0.0f,
                    dx2 = -0.728f,
                    dy2 = 0.13f,
                    dx3 = -0.728f,
                    dy3 = 0.649f,
                )
                // v 2.549
                verticalLineToRelative(dy = 2.549f)
                // h 8.659
                horizontalLineToRelative(dx = 8.659f)
                // v -2.549z
                verticalLineToRelative(dy = -2.549f)
                close()
                // M 17.792 24.412
                moveTo(x = 17.792f, y = 24.412f)
                // v 2.782
                verticalLineToRelative(dy = 2.782f)
                // c 0 0.52 0.234 0.649 0.728 0.649
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.52f,
                    dx2 = 0.234f,
                    dy2 = 0.649f,
                    dx3 = 0.728f,
                    dy3 = 0.649f,
                )
                // h 7.177
                horizontalLineToRelative(dx = 7.177f)
                // c 0.494 0 0.754 -0.13 0.754 -0.649
                curveToRelative(
                    dx1 = 0.494f,
                    dy1 = 0.0f,
                    dx2 = 0.754f,
                    dy2 = -0.13f,
                    dx3 = 0.754f,
                    dy3 = -0.649f,
                )
                // v -2.782
                verticalLineToRelative(dy = -2.782f)
                // h -8.659z
                horizontalLineToRelative(dx = -8.659f)
                close()
            }
        }.build().also { _emoji1f22f = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f22f: ImageVector? = null
