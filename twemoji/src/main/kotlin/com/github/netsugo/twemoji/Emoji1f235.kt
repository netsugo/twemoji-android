package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f235: ImageVector
    get() {
        val current = _emoji1f235
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f235",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 32 c0 2.209 -1.791 4 -4 4 H4 c-2.209 0 -4 -1.791 -4 -4 V4 c0 -2.209 1.791 -4 4 -4 h28 c2.209 0 4 1.791 4 4 v28z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
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
            // M10.921 15.583 c0.208 0.182 0.338 0.468 0.338 0.754 0 0.208 -0.078 0.416 -0.234 0.624 -0.208 0.26 -0.52 0.39 -0.806 0.39 -0.26 0 -0.494 -0.078 -0.676 -0.26 -1.014 -0.936 -2.34 -1.924 -3.458 -2.6 -0.234 -0.13 -0.364 -0.39 -0.364 -0.702 0 -0.208 0.078 -0.416 0.208 -0.624 0.208 -0.26 0.494 -0.39 0.806 -0.39 0.182 0 0.364 0.052 0.52 0.13 1.248 0.702 2.549 1.716 3.666 2.678z M11.311 21.719 c0 0.131 -0.026 0.234 -0.052 0.364 -0.754 2.288 -1.898 4.94 -3.225 7.099 -0.208 0.338 -0.52 0.494 -0.884 0.494 -0.182 0 -0.39 -0.052 -0.598 -0.156 -0.312 -0.182 -0.52 -0.494 -0.52 -0.832 0 -0.182 0.052 -0.39 0.182 -0.572 1.222 -1.976 2.418 -4.42 3.12 -6.708 0.13 -0.442 0.468 -0.649 0.884 -0.649 0.104 0 0.234 0.025 0.338 0.052 0.496 0.154 0.755 0.518 0.755 0.908z M11.987 9.889 c0 0.234 -0.078 0.468 -0.234 0.65 -0.208 0.234 -0.494 0.338 -0.754 0.338 -0.286 0 -0.572 -0.104 -0.78 -0.312 -0.884 -0.858 -1.924 -1.716 -3.016 -2.444 -0.234 -0.156 -0.364 -0.442 -0.364 -0.728 0 -0.208 0.078 -0.442 0.234 -0.624 0.208 -0.26 0.494 -0.416 0.806 -0.416 0.182 0 0.39 0.052 0.572 0.182 1.066 0.676 2.21 1.586 3.198 2.548 0.235 0.234 0.338 0.52 0.338 0.806z M12.56 14.829 c-0.468 0 -0.728 -0.312 -0.728 -0.858 0 -0.52 0.26 -0.858 0.728 -0.858 h3.796 v-2.835 h-2.964 c-0.468 0 -0.728 -0.338 -0.728 -0.884 0 -0.52 0.26 -0.832 0.728 -0.832 h2.964 L16.356 6.665 c0 -0.442 0.338 -0.702 0.884 -0.702 0.572 0 0.936 0.26 0.936 0.702 v1.898 h5.097 L23.273 6.665 c0 -0.442 0.363 -0.676 0.91 -0.676 0.571 0 0.909 0.234 0.909 0.676 v1.898 h3.458 c0.469 0 0.728 0.312 0.728 0.832 0 0.546 -0.26 0.884 -0.728 0.884 h-3.458 v2.835 h4.316 c0.468 0 0.728 0.311 0.728 0.858 0 0.52 -0.26 0.858 -0.728 0.858 h-7.852 v2.21 h5.226 c1.534 0 2.21 0.676 2.21 2.055 v8.294 c0 1.716 -0.78 2.392 -2.652 2.392 -0.78 0 -1.586 -0.052 -2.313 -0.182 -0.391 -0.078 -0.702 -0.416 -0.702 -0.884 0 -0.078 0 -0.156 0.026 -0.234 0.104 -0.52 0.467 -0.754 0.806 -0.754 0.052 0 0.104 0 0.155 0.026 0.65 0.155 1.301 0.208 1.795 0.208 0.858 0 1.066 -0.208 1.066 -0.962 v-7.644 c0 -0.521 -0.26 -0.65 -0.806 -0.65 h-4.81 v6.37 h1.248 c0.469 0 0.676 -0.155 0.676 -0.649 v-3.562 c0 -0.441 0.364 -0.702 0.858 -0.702 0.442 0 0.91 0.261 0.91 0.702 v3.979 c0 1.352 -0.572 1.872 -1.897 1.872 h-5.279 c-1.326 0 -1.898 -0.521 -1.898 -1.872 v-3.979 c0 -0.441 0.442 -0.702 0.884 -0.702 0.494 0 0.884 0.261 0.884 0.702 v3.562 c0 0.494 0.208 0.649 0.676 0.649 h1.118 v-6.37 L15.29 18.705 c-0.52 0 -0.78 0.13 -0.78 0.65 v10.01 c0 0.547 -0.39 0.807 -0.988 0.807 -0.546 0 -0.936 -0.26 -0.936 -0.807 v-10.27 c0 -1.378 0.676 -2.055 2.211 -2.055 h4.939 v-2.21 L12.56 14.83z M23.272 10.279 h-5.097 v2.835 h5.097 v-2.835z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 10.921 15.583
                moveTo(x = 10.921f, y = 15.583f)
                // c 0.208 0.182 0.338 0.468 0.338 0.754
                curveToRelative(
                    dx1 = 0.208f,
                    dy1 = 0.182f,
                    dx2 = 0.338f,
                    dy2 = 0.468f,
                    dx3 = 0.338f,
                    dy3 = 0.754f,
                )
                // c 0 0.208 -0.078 0.416 -0.234 0.624
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.208f,
                    dx2 = -0.078f,
                    dy2 = 0.416f,
                    dx3 = -0.234f,
                    dy3 = 0.624f,
                )
                // c -0.208 0.26 -0.52 0.39 -0.806 0.39
                curveToRelative(
                    dx1 = -0.208f,
                    dy1 = 0.26f,
                    dx2 = -0.52f,
                    dy2 = 0.39f,
                    dx3 = -0.806f,
                    dy3 = 0.39f,
                )
                // c -0.26 0 -0.494 -0.078 -0.676 -0.26
                curveToRelative(
                    dx1 = -0.26f,
                    dy1 = 0.0f,
                    dx2 = -0.494f,
                    dy2 = -0.078f,
                    dx3 = -0.676f,
                    dy3 = -0.26f,
                )
                // c -1.014 -0.936 -2.34 -1.924 -3.458 -2.6
                curveToRelative(
                    dx1 = -1.014f,
                    dy1 = -0.936f,
                    dx2 = -2.34f,
                    dy2 = -1.924f,
                    dx3 = -3.458f,
                    dy3 = -2.6f,
                )
                // c -0.234 -0.13 -0.364 -0.39 -0.364 -0.702
                curveToRelative(
                    dx1 = -0.234f,
                    dy1 = -0.13f,
                    dx2 = -0.364f,
                    dy2 = -0.39f,
                    dx3 = -0.364f,
                    dy3 = -0.702f,
                )
                // c 0 -0.208 0.078 -0.416 0.208 -0.624
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.208f,
                    dx2 = 0.078f,
                    dy2 = -0.416f,
                    dx3 = 0.208f,
                    dy3 = -0.624f,
                )
                // c 0.208 -0.26 0.494 -0.39 0.806 -0.39
                curveToRelative(
                    dx1 = 0.208f,
                    dy1 = -0.26f,
                    dx2 = 0.494f,
                    dy2 = -0.39f,
                    dx3 = 0.806f,
                    dy3 = -0.39f,
                )
                // c 0.182 0 0.364 0.052 0.52 0.13
                curveToRelative(
                    dx1 = 0.182f,
                    dy1 = 0.0f,
                    dx2 = 0.364f,
                    dy2 = 0.052f,
                    dx3 = 0.52f,
                    dy3 = 0.13f,
                )
                // c 1.248 0.702 2.549 1.716 3.666 2.678z
                curveToRelative(
                    dx1 = 1.248f,
                    dy1 = 0.702f,
                    dx2 = 2.549f,
                    dy2 = 1.716f,
                    dx3 = 3.666f,
                    dy3 = 2.678f,
                )
                close()
                // M 11.311 21.719
                moveTo(x = 11.311f, y = 21.719f)
                // c 0 0.131 -0.026 0.234 -0.052 0.364
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.131f,
                    dx2 = -0.026f,
                    dy2 = 0.234f,
                    dx3 = -0.052f,
                    dy3 = 0.364f,
                )
                // c -0.754 2.288 -1.898 4.94 -3.225 7.099
                curveToRelative(
                    dx1 = -0.754f,
                    dy1 = 2.288f,
                    dx2 = -1.898f,
                    dy2 = 4.94f,
                    dx3 = -3.225f,
                    dy3 = 7.099f,
                )
                // c -0.208 0.338 -0.52 0.494 -0.884 0.494
                curveToRelative(
                    dx1 = -0.208f,
                    dy1 = 0.338f,
                    dx2 = -0.52f,
                    dy2 = 0.494f,
                    dx3 = -0.884f,
                    dy3 = 0.494f,
                )
                // c -0.182 0 -0.39 -0.052 -0.598 -0.156
                curveToRelative(
                    dx1 = -0.182f,
                    dy1 = 0.0f,
                    dx2 = -0.39f,
                    dy2 = -0.052f,
                    dx3 = -0.598f,
                    dy3 = -0.156f,
                )
                // c -0.312 -0.182 -0.52 -0.494 -0.52 -0.832
                curveToRelative(
                    dx1 = -0.312f,
                    dy1 = -0.182f,
                    dx2 = -0.52f,
                    dy2 = -0.494f,
                    dx3 = -0.52f,
                    dy3 = -0.832f,
                )
                // c 0 -0.182 0.052 -0.39 0.182 -0.572
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.182f,
                    dx2 = 0.052f,
                    dy2 = -0.39f,
                    dx3 = 0.182f,
                    dy3 = -0.572f,
                )
                // c 1.222 -1.976 2.418 -4.42 3.12 -6.708
                curveToRelative(
                    dx1 = 1.222f,
                    dy1 = -1.976f,
                    dx2 = 2.418f,
                    dy2 = -4.42f,
                    dx3 = 3.12f,
                    dy3 = -6.708f,
                )
                // c 0.13 -0.442 0.468 -0.649 0.884 -0.649
                curveToRelative(
                    dx1 = 0.13f,
                    dy1 = -0.442f,
                    dx2 = 0.468f,
                    dy2 = -0.649f,
                    dx3 = 0.884f,
                    dy3 = -0.649f,
                )
                // c 0.104 0 0.234 0.025 0.338 0.052
                curveToRelative(
                    dx1 = 0.104f,
                    dy1 = 0.0f,
                    dx2 = 0.234f,
                    dy2 = 0.025f,
                    dx3 = 0.338f,
                    dy3 = 0.052f,
                )
                // c 0.496 0.154 0.755 0.518 0.755 0.908z
                curveToRelative(
                    dx1 = 0.496f,
                    dy1 = 0.154f,
                    dx2 = 0.755f,
                    dy2 = 0.518f,
                    dx3 = 0.755f,
                    dy3 = 0.908f,
                )
                close()
                // M 11.987 9.889
                moveTo(x = 11.987f, y = 9.889f)
                // c 0 0.234 -0.078 0.468 -0.234 0.65
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.234f,
                    dx2 = -0.078f,
                    dy2 = 0.468f,
                    dx3 = -0.234f,
                    dy3 = 0.65f,
                )
                // c -0.208 0.234 -0.494 0.338 -0.754 0.338
                curveToRelative(
                    dx1 = -0.208f,
                    dy1 = 0.234f,
                    dx2 = -0.494f,
                    dy2 = 0.338f,
                    dx3 = -0.754f,
                    dy3 = 0.338f,
                )
                // c -0.286 0 -0.572 -0.104 -0.78 -0.312
                curveToRelative(
                    dx1 = -0.286f,
                    dy1 = 0.0f,
                    dx2 = -0.572f,
                    dy2 = -0.104f,
                    dx3 = -0.78f,
                    dy3 = -0.312f,
                )
                // c -0.884 -0.858 -1.924 -1.716 -3.016 -2.444
                curveToRelative(
                    dx1 = -0.884f,
                    dy1 = -0.858f,
                    dx2 = -1.924f,
                    dy2 = -1.716f,
                    dx3 = -3.016f,
                    dy3 = -2.444f,
                )
                // c -0.234 -0.156 -0.364 -0.442 -0.364 -0.728
                curveToRelative(
                    dx1 = -0.234f,
                    dy1 = -0.156f,
                    dx2 = -0.364f,
                    dy2 = -0.442f,
                    dx3 = -0.364f,
                    dy3 = -0.728f,
                )
                // c 0 -0.208 0.078 -0.442 0.234 -0.624
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.208f,
                    dx2 = 0.078f,
                    dy2 = -0.442f,
                    dx3 = 0.234f,
                    dy3 = -0.624f,
                )
                // c 0.208 -0.26 0.494 -0.416 0.806 -0.416
                curveToRelative(
                    dx1 = 0.208f,
                    dy1 = -0.26f,
                    dx2 = 0.494f,
                    dy2 = -0.416f,
                    dx3 = 0.806f,
                    dy3 = -0.416f,
                )
                // c 0.182 0 0.39 0.052 0.572 0.182
                curveToRelative(
                    dx1 = 0.182f,
                    dy1 = 0.0f,
                    dx2 = 0.39f,
                    dy2 = 0.052f,
                    dx3 = 0.572f,
                    dy3 = 0.182f,
                )
                // c 1.066 0.676 2.21 1.586 3.198 2.548
                curveToRelative(
                    dx1 = 1.066f,
                    dy1 = 0.676f,
                    dx2 = 2.21f,
                    dy2 = 1.586f,
                    dx3 = 3.198f,
                    dy3 = 2.548f,
                )
                // c 0.235 0.234 0.338 0.52 0.338 0.806z
                curveToRelative(
                    dx1 = 0.235f,
                    dy1 = 0.234f,
                    dx2 = 0.338f,
                    dy2 = 0.52f,
                    dx3 = 0.338f,
                    dy3 = 0.806f,
                )
                close()
                // M 12.56 14.829
                moveTo(x = 12.56f, y = 14.829f)
                // c -0.468 0 -0.728 -0.312 -0.728 -0.858
                curveToRelative(
                    dx1 = -0.468f,
                    dy1 = 0.0f,
                    dx2 = -0.728f,
                    dy2 = -0.312f,
                    dx3 = -0.728f,
                    dy3 = -0.858f,
                )
                // c 0 -0.52 0.26 -0.858 0.728 -0.858
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.52f,
                    dx2 = 0.26f,
                    dy2 = -0.858f,
                    dx3 = 0.728f,
                    dy3 = -0.858f,
                )
                // h 3.796
                horizontalLineToRelative(dx = 3.796f)
                // v -2.835
                verticalLineToRelative(dy = -2.835f)
                // h -2.964
                horizontalLineToRelative(dx = -2.964f)
                // c -0.468 0 -0.728 -0.338 -0.728 -0.884
                curveToRelative(
                    dx1 = -0.468f,
                    dy1 = 0.0f,
                    dx2 = -0.728f,
                    dy2 = -0.338f,
                    dx3 = -0.728f,
                    dy3 = -0.884f,
                )
                // c 0 -0.52 0.26 -0.832 0.728 -0.832
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.52f,
                    dx2 = 0.26f,
                    dy2 = -0.832f,
                    dx3 = 0.728f,
                    dy3 = -0.832f,
                )
                // h 2.964
                horizontalLineToRelative(dx = 2.964f)
                // L 16.356 6.665
                lineTo(x = 16.356f, y = 6.665f)
                // c 0 -0.442 0.338 -0.702 0.884 -0.702
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.442f,
                    dx2 = 0.338f,
                    dy2 = -0.702f,
                    dx3 = 0.884f,
                    dy3 = -0.702f,
                )
                // c 0.572 0 0.936 0.26 0.936 0.702
                curveToRelative(
                    dx1 = 0.572f,
                    dy1 = 0.0f,
                    dx2 = 0.936f,
                    dy2 = 0.26f,
                    dx3 = 0.936f,
                    dy3 = 0.702f,
                )
                // v 1.898
                verticalLineToRelative(dy = 1.898f)
                // h 5.097
                horizontalLineToRelative(dx = 5.097f)
                // L 23.273 6.665
                lineTo(x = 23.273f, y = 6.665f)
                // c 0 -0.442 0.363 -0.676 0.91 -0.676
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.442f,
                    dx2 = 0.363f,
                    dy2 = -0.676f,
                    dx3 = 0.91f,
                    dy3 = -0.676f,
                )
                // c 0.571 0 0.909 0.234 0.909 0.676
                curveToRelative(
                    dx1 = 0.571f,
                    dy1 = 0.0f,
                    dx2 = 0.909f,
                    dy2 = 0.234f,
                    dx3 = 0.909f,
                    dy3 = 0.676f,
                )
                // v 1.898
                verticalLineToRelative(dy = 1.898f)
                // h 3.458
                horizontalLineToRelative(dx = 3.458f)
                // c 0.469 0 0.728 0.312 0.728 0.832
                curveToRelative(
                    dx1 = 0.469f,
                    dy1 = 0.0f,
                    dx2 = 0.728f,
                    dy2 = 0.312f,
                    dx3 = 0.728f,
                    dy3 = 0.832f,
                )
                // c 0 0.546 -0.26 0.884 -0.728 0.884
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.546f,
                    dx2 = -0.26f,
                    dy2 = 0.884f,
                    dx3 = -0.728f,
                    dy3 = 0.884f,
                )
                // h -3.458
                horizontalLineToRelative(dx = -3.458f)
                // v 2.835
                verticalLineToRelative(dy = 2.835f)
                // h 4.316
                horizontalLineToRelative(dx = 4.316f)
                // c 0.468 0 0.728 0.311 0.728 0.858
                curveToRelative(
                    dx1 = 0.468f,
                    dy1 = 0.0f,
                    dx2 = 0.728f,
                    dy2 = 0.311f,
                    dx3 = 0.728f,
                    dy3 = 0.858f,
                )
                // c 0 0.52 -0.26 0.858 -0.728 0.858
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.52f,
                    dx2 = -0.26f,
                    dy2 = 0.858f,
                    dx3 = -0.728f,
                    dy3 = 0.858f,
                )
                // h -7.852
                horizontalLineToRelative(dx = -7.852f)
                // v 2.21
                verticalLineToRelative(dy = 2.21f)
                // h 5.226
                horizontalLineToRelative(dx = 5.226f)
                // c 1.534 0 2.21 0.676 2.21 2.055
                curveToRelative(
                    dx1 = 1.534f,
                    dy1 = 0.0f,
                    dx2 = 2.21f,
                    dy2 = 0.676f,
                    dx3 = 2.21f,
                    dy3 = 2.055f,
                )
                // v 8.294
                verticalLineToRelative(dy = 8.294f)
                // c 0 1.716 -0.78 2.392 -2.652 2.392
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.716f,
                    dx2 = -0.78f,
                    dy2 = 2.392f,
                    dx3 = -2.652f,
                    dy3 = 2.392f,
                )
                // c -0.78 0 -1.586 -0.052 -2.313 -0.182
                curveToRelative(
                    dx1 = -0.78f,
                    dy1 = 0.0f,
                    dx2 = -1.586f,
                    dy2 = -0.052f,
                    dx3 = -2.313f,
                    dy3 = -0.182f,
                )
                // c -0.391 -0.078 -0.702 -0.416 -0.702 -0.884
                curveToRelative(
                    dx1 = -0.391f,
                    dy1 = -0.078f,
                    dx2 = -0.702f,
                    dy2 = -0.416f,
                    dx3 = -0.702f,
                    dy3 = -0.884f,
                )
                // c 0 -0.078 0 -0.156 0.026 -0.234
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.078f,
                    dx2 = 0.0f,
                    dy2 = -0.156f,
                    dx3 = 0.026f,
                    dy3 = -0.234f,
                )
                // c 0.104 -0.52 0.467 -0.754 0.806 -0.754
                curveToRelative(
                    dx1 = 0.104f,
                    dy1 = -0.52f,
                    dx2 = 0.467f,
                    dy2 = -0.754f,
                    dx3 = 0.806f,
                    dy3 = -0.754f,
                )
                // c 0.052 0 0.104 0 0.155 0.026
                curveToRelative(
                    dx1 = 0.052f,
                    dy1 = 0.0f,
                    dx2 = 0.104f,
                    dy2 = 0.0f,
                    dx3 = 0.155f,
                    dy3 = 0.026f,
                )
                // c 0.65 0.155 1.301 0.208 1.795 0.208
                curveToRelative(
                    dx1 = 0.65f,
                    dy1 = 0.155f,
                    dx2 = 1.301f,
                    dy2 = 0.208f,
                    dx3 = 1.795f,
                    dy3 = 0.208f,
                )
                // c 0.858 0 1.066 -0.208 1.066 -0.962
                curveToRelative(
                    dx1 = 0.858f,
                    dy1 = 0.0f,
                    dx2 = 1.066f,
                    dy2 = -0.208f,
                    dx3 = 1.066f,
                    dy3 = -0.962f,
                )
                // v -7.644
                verticalLineToRelative(dy = -7.644f)
                // c 0 -0.521 -0.26 -0.65 -0.806 -0.65
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.521f,
                    dx2 = -0.26f,
                    dy2 = -0.65f,
                    dx3 = -0.806f,
                    dy3 = -0.65f,
                )
                // h -4.81
                horizontalLineToRelative(dx = -4.81f)
                // v 6.37
                verticalLineToRelative(dy = 6.37f)
                // h 1.248
                horizontalLineToRelative(dx = 1.248f)
                // c 0.469 0 0.676 -0.155 0.676 -0.649
                curveToRelative(
                    dx1 = 0.469f,
                    dy1 = 0.0f,
                    dx2 = 0.676f,
                    dy2 = -0.155f,
                    dx3 = 0.676f,
                    dy3 = -0.649f,
                )
                // v -3.562
                verticalLineToRelative(dy = -3.562f)
                // c 0 -0.441 0.364 -0.702 0.858 -0.702
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.441f,
                    dx2 = 0.364f,
                    dy2 = -0.702f,
                    dx3 = 0.858f,
                    dy3 = -0.702f,
                )
                // c 0.442 0 0.91 0.261 0.91 0.702
                curveToRelative(
                    dx1 = 0.442f,
                    dy1 = 0.0f,
                    dx2 = 0.91f,
                    dy2 = 0.261f,
                    dx3 = 0.91f,
                    dy3 = 0.702f,
                )
                // v 3.979
                verticalLineToRelative(dy = 3.979f)
                // c 0 1.352 -0.572 1.872 -1.897 1.872
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.352f,
                    dx2 = -0.572f,
                    dy2 = 1.872f,
                    dx3 = -1.897f,
                    dy3 = 1.872f,
                )
                // h -5.279
                horizontalLineToRelative(dx = -5.279f)
                // c -1.326 0 -1.898 -0.521 -1.898 -1.872
                curveToRelative(
                    dx1 = -1.326f,
                    dy1 = 0.0f,
                    dx2 = -1.898f,
                    dy2 = -0.521f,
                    dx3 = -1.898f,
                    dy3 = -1.872f,
                )
                // v -3.979
                verticalLineToRelative(dy = -3.979f)
                // c 0 -0.441 0.442 -0.702 0.884 -0.702
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.441f,
                    dx2 = 0.442f,
                    dy2 = -0.702f,
                    dx3 = 0.884f,
                    dy3 = -0.702f,
                )
                // c 0.494 0 0.884 0.261 0.884 0.702
                curveToRelative(
                    dx1 = 0.494f,
                    dy1 = 0.0f,
                    dx2 = 0.884f,
                    dy2 = 0.261f,
                    dx3 = 0.884f,
                    dy3 = 0.702f,
                )
                // v 3.562
                verticalLineToRelative(dy = 3.562f)
                // c 0 0.494 0.208 0.649 0.676 0.649
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.494f,
                    dx2 = 0.208f,
                    dy2 = 0.649f,
                    dx3 = 0.676f,
                    dy3 = 0.649f,
                )
                // h 1.118
                horizontalLineToRelative(dx = 1.118f)
                // v -6.37
                verticalLineToRelative(dy = -6.37f)
                // L 15.29 18.705
                lineTo(x = 15.29f, y = 18.705f)
                // c -0.52 0 -0.78 0.13 -0.78 0.65
                curveToRelative(
                    dx1 = -0.52f,
                    dy1 = 0.0f,
                    dx2 = -0.78f,
                    dy2 = 0.13f,
                    dx3 = -0.78f,
                    dy3 = 0.65f,
                )
                // v 10.01
                verticalLineToRelative(dy = 10.01f)
                // c 0 0.547 -0.39 0.807 -0.988 0.807
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.547f,
                    dx2 = -0.39f,
                    dy2 = 0.807f,
                    dx3 = -0.988f,
                    dy3 = 0.807f,
                )
                // c -0.546 0 -0.936 -0.26 -0.936 -0.807
                curveToRelative(
                    dx1 = -0.546f,
                    dy1 = 0.0f,
                    dx2 = -0.936f,
                    dy2 = -0.26f,
                    dx3 = -0.936f,
                    dy3 = -0.807f,
                )
                // v -10.27
                verticalLineToRelative(dy = -10.27f)
                // c 0 -1.378 0.676 -2.055 2.211 -2.055
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.378f,
                    dx2 = 0.676f,
                    dy2 = -2.055f,
                    dx3 = 2.211f,
                    dy3 = -2.055f,
                )
                // h 4.939
                horizontalLineToRelative(dx = 4.939f)
                // v -2.21
                verticalLineToRelative(dy = -2.21f)
                // L 12.56 14.83z
                lineTo(x = 12.56f, y = 14.83f)
                close()
                // M 23.272 10.279
                moveTo(x = 23.272f, y = 10.279f)
                // h -5.097
                horizontalLineToRelative(dx = -5.097f)
                // v 2.835
                verticalLineToRelative(dy = 2.835f)
                // h 5.097
                horizontalLineToRelative(dx = 5.097f)
                // v -2.835z
                verticalLineToRelative(dy = -2.835f)
                close()
            }
        }.build().also { _emoji1f235 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f235: ImageVector? = null
