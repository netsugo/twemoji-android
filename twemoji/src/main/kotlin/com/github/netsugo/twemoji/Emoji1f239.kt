package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f239: ImageVector
    get() {
        val current = _emoji1f239
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f239",
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
            // M8.523 17.084 c-0.416 0 -0.65 -0.364 -0.65 -0.78 0 -0.416 0.234 -0.78 0.65 -0.78 h4.394 L12.917 13.73 L9.433 13.73 c-0.468 0 -0.65 -0.338 -0.65 -0.78 0 -0.416 0.234 -0.754 0.65 -0.754 h3.484 v-1.222 c0 -0.468 0.338 -0.702 0.858 -0.702 0.546 0 0.858 0.234 0.858 0.702 v1.222 h3.588 c0.416 0 0.65 0.338 0.65 0.754 0 0.442 -0.182 0.78 -0.65 0.78 h-3.588 v1.794 h4.265 c0.39 0 0.649 0.364 0.649 0.78 0 0.416 -0.26 0.78 -0.649 0.78 h-4.265 v1.846 h5.616 c0.39 0 0.624 0.339 0.624 0.807 0 0.416 -0.234 0.78 -0.624 0.78 L6.937 20.517 c-0.416 0 -0.624 -0.364 -0.624 -0.78 0 -0.468 0.208 -0.807 0.624 -0.807 h5.98 v-1.846 L8.523 17.084z M18.923 8.167 c1.378 0 2.028 0.572 2.028 1.976 v1.69 c0 0.572 -0.363 0.78 -0.91 0.78 -0.546 0 -0.884 -0.234 -0.884 -0.702 v-1.456 c0 -0.52 -0.26 -0.65 -0.728 -0.65 L9.121 9.805 c-0.494 0 -0.729 0.13 -0.729 0.65 v1.742 c0 0.468 -0.416 0.727 -0.936 0.727 -0.521 0 -0.91 -0.234 -0.91 -0.806 v-1.976 c0 -1.404 0.65 -1.976 2.028 -1.976 h4.238 L12.812 6.762 c0 -0.468 0.39 -0.728 0.988 -0.728 0.624 0 1.014 0.26 1.014 0.728 v1.404 h4.109z M17.285 22.182 c1.456 0 2.08 0.546 2.08 1.976 v3.433 c0 1.43 -0.624 1.976 -2.08 1.976 h-7.202 c-1.456 0 -2.106 -0.546 -2.106 -1.976 v-3.433 c0 -1.43 0.65 -1.976 2.106 -1.976 h7.202z M16.687 27.954 c0.494 0 0.728 -0.131 0.728 -0.625 v-2.912 c0 -0.52 -0.234 -0.649 -0.728 -0.649 h-6.032 c-0.494 0 -0.728 0.13 -0.728 0.649 v2.912 c0 0.494 0.234 0.625 0.728 0.625 h6.032z M24.357 23.352 c0 0.494 -0.416 0.727 -0.988 0.727 -0.546 0 -0.988 -0.26 -0.988 -0.727 L22.381 8.4 c0 -0.494 0.442 -0.728 0.988 -0.728 0.572 0 0.988 0.26 0.988 0.728 v14.952z M29.246 27.382 c0 1.69 -0.858 2.47 -2.887 2.47 -0.832 0 -2.002 -0.078 -2.73 -0.233 -0.363 -0.078 -0.623 -0.416 -0.623 -0.858 0 -0.104 0 -0.183 0.025 -0.286 0.104 -0.52 0.416 -0.78 0.807 -0.78 0.052 0 0.129 0 0.182 0.026 0.598 0.13 1.508 0.234 2.08 0.234 0.988 0 1.17 -0.183 1.17 -1.041 L27.27 7.1 c0 -0.494 0.39 -0.78 0.988 -0.78 s0.988 0.286 0.988 0.78 v20.282z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 8.523 17.084
                moveTo(x = 8.523f, y = 17.084f)
                // c -0.416 0 -0.65 -0.364 -0.65 -0.78
                curveToRelative(
                    dx1 = -0.416f,
                    dy1 = 0.0f,
                    dx2 = -0.65f,
                    dy2 = -0.364f,
                    dx3 = -0.65f,
                    dy3 = -0.78f,
                )
                // c 0 -0.416 0.234 -0.78 0.65 -0.78
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.416f,
                    dx2 = 0.234f,
                    dy2 = -0.78f,
                    dx3 = 0.65f,
                    dy3 = -0.78f,
                )
                // h 4.394
                horizontalLineToRelative(dx = 4.394f)
                // L 12.917 13.73
                lineTo(x = 12.917f, y = 13.73f)
                // L 9.433 13.73
                lineTo(x = 9.433f, y = 13.73f)
                // c -0.468 0 -0.65 -0.338 -0.65 -0.78
                curveToRelative(
                    dx1 = -0.468f,
                    dy1 = 0.0f,
                    dx2 = -0.65f,
                    dy2 = -0.338f,
                    dx3 = -0.65f,
                    dy3 = -0.78f,
                )
                // c 0 -0.416 0.234 -0.754 0.65 -0.754
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.416f,
                    dx2 = 0.234f,
                    dy2 = -0.754f,
                    dx3 = 0.65f,
                    dy3 = -0.754f,
                )
                // h 3.484
                horizontalLineToRelative(dx = 3.484f)
                // v -1.222
                verticalLineToRelative(dy = -1.222f)
                // c 0 -0.468 0.338 -0.702 0.858 -0.702
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.468f,
                    dx2 = 0.338f,
                    dy2 = -0.702f,
                    dx3 = 0.858f,
                    dy3 = -0.702f,
                )
                // c 0.546 0 0.858 0.234 0.858 0.702
                curveToRelative(
                    dx1 = 0.546f,
                    dy1 = 0.0f,
                    dx2 = 0.858f,
                    dy2 = 0.234f,
                    dx3 = 0.858f,
                    dy3 = 0.702f,
                )
                // v 1.222
                verticalLineToRelative(dy = 1.222f)
                // h 3.588
                horizontalLineToRelative(dx = 3.588f)
                // c 0.416 0 0.65 0.338 0.65 0.754
                curveToRelative(
                    dx1 = 0.416f,
                    dy1 = 0.0f,
                    dx2 = 0.65f,
                    dy2 = 0.338f,
                    dx3 = 0.65f,
                    dy3 = 0.754f,
                )
                // c 0 0.442 -0.182 0.78 -0.65 0.78
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.442f,
                    dx2 = -0.182f,
                    dy2 = 0.78f,
                    dx3 = -0.65f,
                    dy3 = 0.78f,
                )
                // h -3.588
                horizontalLineToRelative(dx = -3.588f)
                // v 1.794
                verticalLineToRelative(dy = 1.794f)
                // h 4.265
                horizontalLineToRelative(dx = 4.265f)
                // c 0.39 0 0.649 0.364 0.649 0.78
                curveToRelative(
                    dx1 = 0.39f,
                    dy1 = 0.0f,
                    dx2 = 0.649f,
                    dy2 = 0.364f,
                    dx3 = 0.649f,
                    dy3 = 0.78f,
                )
                // c 0 0.416 -0.26 0.78 -0.649 0.78
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.416f,
                    dx2 = -0.26f,
                    dy2 = 0.78f,
                    dx3 = -0.649f,
                    dy3 = 0.78f,
                )
                // h -4.265
                horizontalLineToRelative(dx = -4.265f)
                // v 1.846
                verticalLineToRelative(dy = 1.846f)
                // h 5.616
                horizontalLineToRelative(dx = 5.616f)
                // c 0.39 0 0.624 0.339 0.624 0.807
                curveToRelative(
                    dx1 = 0.39f,
                    dy1 = 0.0f,
                    dx2 = 0.624f,
                    dy2 = 0.339f,
                    dx3 = 0.624f,
                    dy3 = 0.807f,
                )
                // c 0 0.416 -0.234 0.78 -0.624 0.78
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.416f,
                    dx2 = -0.234f,
                    dy2 = 0.78f,
                    dx3 = -0.624f,
                    dy3 = 0.78f,
                )
                // L 6.937 20.517
                lineTo(x = 6.937f, y = 20.517f)
                // c -0.416 0 -0.624 -0.364 -0.624 -0.78
                curveToRelative(
                    dx1 = -0.416f,
                    dy1 = 0.0f,
                    dx2 = -0.624f,
                    dy2 = -0.364f,
                    dx3 = -0.624f,
                    dy3 = -0.78f,
                )
                // c 0 -0.468 0.208 -0.807 0.624 -0.807
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.468f,
                    dx2 = 0.208f,
                    dy2 = -0.807f,
                    dx3 = 0.624f,
                    dy3 = -0.807f,
                )
                // h 5.98
                horizontalLineToRelative(dx = 5.98f)
                // v -1.846
                verticalLineToRelative(dy = -1.846f)
                // L 8.523 17.084z
                lineTo(x = 8.523f, y = 17.084f)
                close()
                // M 18.923 8.167
                moveTo(x = 18.923f, y = 8.167f)
                // c 1.378 0 2.028 0.572 2.028 1.976
                curveToRelative(
                    dx1 = 1.378f,
                    dy1 = 0.0f,
                    dx2 = 2.028f,
                    dy2 = 0.572f,
                    dx3 = 2.028f,
                    dy3 = 1.976f,
                )
                // v 1.69
                verticalLineToRelative(dy = 1.69f)
                // c 0 0.572 -0.363 0.78 -0.91 0.78
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.572f,
                    dx2 = -0.363f,
                    dy2 = 0.78f,
                    dx3 = -0.91f,
                    dy3 = 0.78f,
                )
                // c -0.546 0 -0.884 -0.234 -0.884 -0.702
                curveToRelative(
                    dx1 = -0.546f,
                    dy1 = 0.0f,
                    dx2 = -0.884f,
                    dy2 = -0.234f,
                    dx3 = -0.884f,
                    dy3 = -0.702f,
                )
                // v -1.456
                verticalLineToRelative(dy = -1.456f)
                // c 0 -0.52 -0.26 -0.65 -0.728 -0.65
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.52f,
                    dx2 = -0.26f,
                    dy2 = -0.65f,
                    dx3 = -0.728f,
                    dy3 = -0.65f,
                )
                // L 9.121 9.805
                lineTo(x = 9.121f, y = 9.805f)
                // c -0.494 0 -0.729 0.13 -0.729 0.65
                curveToRelative(
                    dx1 = -0.494f,
                    dy1 = 0.0f,
                    dx2 = -0.729f,
                    dy2 = 0.13f,
                    dx3 = -0.729f,
                    dy3 = 0.65f,
                )
                // v 1.742
                verticalLineToRelative(dy = 1.742f)
                // c 0 0.468 -0.416 0.727 -0.936 0.727
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.468f,
                    dx2 = -0.416f,
                    dy2 = 0.727f,
                    dx3 = -0.936f,
                    dy3 = 0.727f,
                )
                // c -0.521 0 -0.91 -0.234 -0.91 -0.806
                curveToRelative(
                    dx1 = -0.521f,
                    dy1 = 0.0f,
                    dx2 = -0.91f,
                    dy2 = -0.234f,
                    dx3 = -0.91f,
                    dy3 = -0.806f,
                )
                // v -1.976
                verticalLineToRelative(dy = -1.976f)
                // c 0 -1.404 0.65 -1.976 2.028 -1.976
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.404f,
                    dx2 = 0.65f,
                    dy2 = -1.976f,
                    dx3 = 2.028f,
                    dy3 = -1.976f,
                )
                // h 4.238
                horizontalLineToRelative(dx = 4.238f)
                // L 12.812 6.762
                lineTo(x = 12.812f, y = 6.762f)
                // c 0 -0.468 0.39 -0.728 0.988 -0.728
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.468f,
                    dx2 = 0.39f,
                    dy2 = -0.728f,
                    dx3 = 0.988f,
                    dy3 = -0.728f,
                )
                // c 0.624 0 1.014 0.26 1.014 0.728
                curveToRelative(
                    dx1 = 0.624f,
                    dy1 = 0.0f,
                    dx2 = 1.014f,
                    dy2 = 0.26f,
                    dx3 = 1.014f,
                    dy3 = 0.728f,
                )
                // v 1.404
                verticalLineToRelative(dy = 1.404f)
                // h 4.109z
                horizontalLineToRelative(dx = 4.109f)
                close()
                // M 17.285 22.182
                moveTo(x = 17.285f, y = 22.182f)
                // c 1.456 0 2.08 0.546 2.08 1.976
                curveToRelative(
                    dx1 = 1.456f,
                    dy1 = 0.0f,
                    dx2 = 2.08f,
                    dy2 = 0.546f,
                    dx3 = 2.08f,
                    dy3 = 1.976f,
                )
                // v 3.433
                verticalLineToRelative(dy = 3.433f)
                // c 0 1.43 -0.624 1.976 -2.08 1.976
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.43f,
                    dx2 = -0.624f,
                    dy2 = 1.976f,
                    dx3 = -2.08f,
                    dy3 = 1.976f,
                )
                // h -7.202
                horizontalLineToRelative(dx = -7.202f)
                // c -1.456 0 -2.106 -0.546 -2.106 -1.976
                curveToRelative(
                    dx1 = -1.456f,
                    dy1 = 0.0f,
                    dx2 = -2.106f,
                    dy2 = -0.546f,
                    dx3 = -2.106f,
                    dy3 = -1.976f,
                )
                // v -3.433
                verticalLineToRelative(dy = -3.433f)
                // c 0 -1.43 0.65 -1.976 2.106 -1.976
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.43f,
                    dx2 = 0.65f,
                    dy2 = -1.976f,
                    dx3 = 2.106f,
                    dy3 = -1.976f,
                )
                // h 7.202z
                horizontalLineToRelative(dx = 7.202f)
                close()
                // M 16.687 27.954
                moveTo(x = 16.687f, y = 27.954f)
                // c 0.494 0 0.728 -0.131 0.728 -0.625
                curveToRelative(
                    dx1 = 0.494f,
                    dy1 = 0.0f,
                    dx2 = 0.728f,
                    dy2 = -0.131f,
                    dx3 = 0.728f,
                    dy3 = -0.625f,
                )
                // v -2.912
                verticalLineToRelative(dy = -2.912f)
                // c 0 -0.52 -0.234 -0.649 -0.728 -0.649
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.52f,
                    dx2 = -0.234f,
                    dy2 = -0.649f,
                    dx3 = -0.728f,
                    dy3 = -0.649f,
                )
                // h -6.032
                horizontalLineToRelative(dx = -6.032f)
                // c -0.494 0 -0.728 0.13 -0.728 0.649
                curveToRelative(
                    dx1 = -0.494f,
                    dy1 = 0.0f,
                    dx2 = -0.728f,
                    dy2 = 0.13f,
                    dx3 = -0.728f,
                    dy3 = 0.649f,
                )
                // v 2.912
                verticalLineToRelative(dy = 2.912f)
                // c 0 0.494 0.234 0.625 0.728 0.625
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.494f,
                    dx2 = 0.234f,
                    dy2 = 0.625f,
                    dx3 = 0.728f,
                    dy3 = 0.625f,
                )
                // h 6.032z
                horizontalLineToRelative(dx = 6.032f)
                close()
                // M 24.357 23.352
                moveTo(x = 24.357f, y = 23.352f)
                // c 0 0.494 -0.416 0.727 -0.988 0.727
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.494f,
                    dx2 = -0.416f,
                    dy2 = 0.727f,
                    dx3 = -0.988f,
                    dy3 = 0.727f,
                )
                // c -0.546 0 -0.988 -0.26 -0.988 -0.727
                curveToRelative(
                    dx1 = -0.546f,
                    dy1 = 0.0f,
                    dx2 = -0.988f,
                    dy2 = -0.26f,
                    dx3 = -0.988f,
                    dy3 = -0.727f,
                )
                // L 22.381 8.4
                lineTo(x = 22.381f, y = 8.4f)
                // c 0 -0.494 0.442 -0.728 0.988 -0.728
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.494f,
                    dx2 = 0.442f,
                    dy2 = -0.728f,
                    dx3 = 0.988f,
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
                // v 14.952z
                verticalLineToRelative(dy = 14.952f)
                close()
                // M 29.246 27.382
                moveTo(x = 29.246f, y = 27.382f)
                // c 0 1.69 -0.858 2.47 -2.887 2.47
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.69f,
                    dx2 = -0.858f,
                    dy2 = 2.47f,
                    dx3 = -2.887f,
                    dy3 = 2.47f,
                )
                // c -0.832 0 -2.002 -0.078 -2.73 -0.233
                curveToRelative(
                    dx1 = -0.832f,
                    dy1 = 0.0f,
                    dx2 = -2.002f,
                    dy2 = -0.078f,
                    dx3 = -2.73f,
                    dy3 = -0.233f,
                )
                // c -0.363 -0.078 -0.623 -0.416 -0.623 -0.858
                curveToRelative(
                    dx1 = -0.363f,
                    dy1 = -0.078f,
                    dx2 = -0.623f,
                    dy2 = -0.416f,
                    dx3 = -0.623f,
                    dy3 = -0.858f,
                )
                // c 0 -0.104 0 -0.183 0.025 -0.286
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.104f,
                    dx2 = 0.0f,
                    dy2 = -0.183f,
                    dx3 = 0.025f,
                    dy3 = -0.286f,
                )
                // c 0.104 -0.52 0.416 -0.78 0.807 -0.78
                curveToRelative(
                    dx1 = 0.104f,
                    dy1 = -0.52f,
                    dx2 = 0.416f,
                    dy2 = -0.78f,
                    dx3 = 0.807f,
                    dy3 = -0.78f,
                )
                // c 0.052 0 0.129 0 0.182 0.026
                curveToRelative(
                    dx1 = 0.052f,
                    dy1 = 0.0f,
                    dx2 = 0.129f,
                    dy2 = 0.0f,
                    dx3 = 0.182f,
                    dy3 = 0.026f,
                )
                // c 0.598 0.13 1.508 0.234 2.08 0.234
                curveToRelative(
                    dx1 = 0.598f,
                    dy1 = 0.13f,
                    dx2 = 1.508f,
                    dy2 = 0.234f,
                    dx3 = 2.08f,
                    dy3 = 0.234f,
                )
                // c 0.988 0 1.17 -0.183 1.17 -1.041
                curveToRelative(
                    dx1 = 0.988f,
                    dy1 = 0.0f,
                    dx2 = 1.17f,
                    dy2 = -0.183f,
                    dx3 = 1.17f,
                    dy3 = -1.041f,
                )
                // L 27.27 7.1
                lineTo(x = 27.27f, y = 7.1f)
                // c 0 -0.494 0.39 -0.78 0.988 -0.78
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.494f,
                    dx2 = 0.39f,
                    dy2 = -0.78f,
                    dx3 = 0.988f,
                    dy3 = -0.78f,
                )
                // s 0.988 0.286 0.988 0.78
                reflectiveCurveToRelative(
                    dx1 = 0.988f,
                    dy1 = 0.286f,
                    dx2 = 0.988f,
                    dy2 = 0.78f,
                )
                // v 20.282z
                verticalLineToRelative(dy = 20.282f)
                close()
            }
        }.build().also { _emoji1f239 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f239: ImageVector? = null
