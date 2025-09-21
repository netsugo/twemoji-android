package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f21a: ImageVector
    get() {
        val current = _emoji1f21a
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f21a",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 32 c0 2.209 -1.791 4 -4 4 H4 c-2.209 0 -4 -1.791 -4 -4 V4 c0 -2.209 1.791 -4 4 -4 h28 c2.209 0 4 1.791 4 4 v28z
            path(
                fill = SolidColor(Color(0xFFF4900C)),
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
            // M9.914 13.543 c0 -0.702 0.078 -1.456 0.208 -2.184 -0.676 0.78 -1.404 1.482 -2.158 2.158 -0.234 0.156 -0.468 0.26 -0.702 0.26 -0.26 0 -0.52 -0.13 -0.728 -0.364 -0.13 -0.182 -0.208 -0.39 -0.208 -0.572 0 -0.312 0.156 -0.624 0.494 -0.832 1.872 -1.43 3.432 -3.432 4.55 -5.694 0.182 -0.286 0.442 -0.416 0.78 -0.416 0.156 0 0.338 0.026 0.52 0.104 0.364 0.13 0.572 0.416 0.572 0.729 0 0.156 -0.052 0.338 -0.156 0.494 -0.364 0.598 -0.78 1.196 -1.248 1.768 0.962 -0.052 1.872 -0.078 2.808 -0.078 h13.572 c0.468 0 0.702 0.364 0.702 0.91 0 0.494 -0.234 0.858 -0.702 0.858 L26.06 10.684 v4.42 h3.095 c0.468 0 0.727 0.364 0.727 0.91 0 0.52 -0.26 0.91 -0.727 0.91 L26.06 16.924 v4.524 h2.444 c0.468 0 0.702 0.364 0.702 0.885 0 0.494 -0.234 0.91 -0.702 0.91 L7.392 23.243 c-0.468 0 -0.702 -0.391 -0.702 -0.91 0 -0.494 0.234 -0.885 0.702 -0.885 h2.522 v-4.524 h-3.12 c-0.442 0 -0.702 -0.39 -0.702 -0.91 s0.26 -0.91 0.702 -0.91 h3.12 v-1.561z M11.136 25.166 c0 0.104 -0.026 0.208 -0.078 0.338 -0.598 1.482 -1.508 2.99 -2.522 4.134 -0.26 0.261 -0.546 0.391 -0.858 0.391 -0.26 0 -0.494 -0.078 -0.728 -0.261 -0.234 -0.182 -0.364 -0.416 -0.364 -0.701 0 -0.208 0.078 -0.442 0.286 -0.65 0.91 -0.91 1.716 -2.158 2.314 -3.614 0.13 -0.338 0.416 -0.52 0.78 -0.52 0.13 0 0.286 0.025 0.442 0.077 0.468 0.13 0.728 0.442 0.728 0.806z M14.698 15.104 v-4.42 h-2.964 v4.42 h2.964z M14.698 21.447 v-4.524 h-2.964 v4.524 h2.964z M14.698 24.386 c0.416 0 0.728 0.234 0.806 0.599 0.312 1.3 0.494 2.808 0.598 4.134 v0.078 c0 0.468 -0.39 0.78 -0.936 0.832 h-0.13 c-0.494 0 -0.884 -0.286 -0.91 -0.728 -0.052 -1.222 -0.208 -2.704 -0.468 -4.03 v-0.13 c0 -0.364 0.312 -0.649 0.78 -0.728 0.079 -0.027 0.182 -0.027 0.26 -0.027z M19.457 15.104 v-4.42 h-2.991 v4.42 h2.991z M19.457 21.447 v-4.524 h-2.991 v4.524 h2.991z M20.08 24.334 c0.416 0 0.703 0.182 0.832 0.546 0.494 1.3 0.91 2.678 1.17 3.926 0.026 0.078 0.026 0.183 0.026 0.261 0 0.416 -0.312 0.727 -0.806 0.832 -0.13 0.025 -0.234 0.052 -0.364 0.052 -0.416 0 -0.754 -0.234 -0.806 -0.65 -0.182 -1.222 -0.598 -2.678 -1.014 -3.926 -0.026 -0.078 -0.053 -0.183 -0.053 -0.26 0 -0.364 0.26 -0.65 0.676 -0.729 0.132 -0.027 0.236 -0.052 0.339 -0.052z M24.267 15.104 v-4.42 L21.2 10.684 v4.42 h3.067z M24.267 21.447 v-4.524 L21.2 16.923 v4.524 h3.067z M25.775 24.256 c0.312 0 0.571 0.13 0.754 0.312 1.065 1.325 1.897 2.573 2.573 3.899 0.078 0.156 0.104 0.312 0.104 0.442 0 0.364 -0.208 0.676 -0.572 0.857 -0.156 0.078 -0.338 0.131 -0.494 0.131 -0.338 0 -0.649 -0.156 -0.832 -0.442 -0.65 -1.326 -1.404 -2.626 -2.392 -3.874 -0.078 -0.13 -0.13 -0.286 -0.13 -0.442 0 -0.26 0.13 -0.52 0.441 -0.728 0.183 -0.103 0.366 -0.155 0.548 -0.155z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 9.914 13.543
                moveTo(x = 9.914f, y = 13.543f)
                // c 0 -0.702 0.078 -1.456 0.208 -2.184
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.702f,
                    dx2 = 0.078f,
                    dy2 = -1.456f,
                    dx3 = 0.208f,
                    dy3 = -2.184f,
                )
                // c -0.676 0.78 -1.404 1.482 -2.158 2.158
                curveToRelative(
                    dx1 = -0.676f,
                    dy1 = 0.78f,
                    dx2 = -1.404f,
                    dy2 = 1.482f,
                    dx3 = -2.158f,
                    dy3 = 2.158f,
                )
                // c -0.234 0.156 -0.468 0.26 -0.702 0.26
                curveToRelative(
                    dx1 = -0.234f,
                    dy1 = 0.156f,
                    dx2 = -0.468f,
                    dy2 = 0.26f,
                    dx3 = -0.702f,
                    dy3 = 0.26f,
                )
                // c -0.26 0 -0.52 -0.13 -0.728 -0.364
                curveToRelative(
                    dx1 = -0.26f,
                    dy1 = 0.0f,
                    dx2 = -0.52f,
                    dy2 = -0.13f,
                    dx3 = -0.728f,
                    dy3 = -0.364f,
                )
                // c -0.13 -0.182 -0.208 -0.39 -0.208 -0.572
                curveToRelative(
                    dx1 = -0.13f,
                    dy1 = -0.182f,
                    dx2 = -0.208f,
                    dy2 = -0.39f,
                    dx3 = -0.208f,
                    dy3 = -0.572f,
                )
                // c 0 -0.312 0.156 -0.624 0.494 -0.832
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.312f,
                    dx2 = 0.156f,
                    dy2 = -0.624f,
                    dx3 = 0.494f,
                    dy3 = -0.832f,
                )
                // c 1.872 -1.43 3.432 -3.432 4.55 -5.694
                curveToRelative(
                    dx1 = 1.872f,
                    dy1 = -1.43f,
                    dx2 = 3.432f,
                    dy2 = -3.432f,
                    dx3 = 4.55f,
                    dy3 = -5.694f,
                )
                // c 0.182 -0.286 0.442 -0.416 0.78 -0.416
                curveToRelative(
                    dx1 = 0.182f,
                    dy1 = -0.286f,
                    dx2 = 0.442f,
                    dy2 = -0.416f,
                    dx3 = 0.78f,
                    dy3 = -0.416f,
                )
                // c 0.156 0 0.338 0.026 0.52 0.104
                curveToRelative(
                    dx1 = 0.156f,
                    dy1 = 0.0f,
                    dx2 = 0.338f,
                    dy2 = 0.026f,
                    dx3 = 0.52f,
                    dy3 = 0.104f,
                )
                // c 0.364 0.13 0.572 0.416 0.572 0.729
                curveToRelative(
                    dx1 = 0.364f,
                    dy1 = 0.13f,
                    dx2 = 0.572f,
                    dy2 = 0.416f,
                    dx3 = 0.572f,
                    dy3 = 0.729f,
                )
                // c 0 0.156 -0.052 0.338 -0.156 0.494
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.156f,
                    dx2 = -0.052f,
                    dy2 = 0.338f,
                    dx3 = -0.156f,
                    dy3 = 0.494f,
                )
                // c -0.364 0.598 -0.78 1.196 -1.248 1.768
                curveToRelative(
                    dx1 = -0.364f,
                    dy1 = 0.598f,
                    dx2 = -0.78f,
                    dy2 = 1.196f,
                    dx3 = -1.248f,
                    dy3 = 1.768f,
                )
                // c 0.962 -0.052 1.872 -0.078 2.808 -0.078
                curveToRelative(
                    dx1 = 0.962f,
                    dy1 = -0.052f,
                    dx2 = 1.872f,
                    dy2 = -0.078f,
                    dx3 = 2.808f,
                    dy3 = -0.078f,
                )
                // h 13.572
                horizontalLineToRelative(dx = 13.572f)
                // c 0.468 0 0.702 0.364 0.702 0.91
                curveToRelative(
                    dx1 = 0.468f,
                    dy1 = 0.0f,
                    dx2 = 0.702f,
                    dy2 = 0.364f,
                    dx3 = 0.702f,
                    dy3 = 0.91f,
                )
                // c 0 0.494 -0.234 0.858 -0.702 0.858
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.494f,
                    dx2 = -0.234f,
                    dy2 = 0.858f,
                    dx3 = -0.702f,
                    dy3 = 0.858f,
                )
                // L 26.06 10.684
                lineTo(x = 26.06f, y = 10.684f)
                // v 4.42
                verticalLineToRelative(dy = 4.42f)
                // h 3.095
                horizontalLineToRelative(dx = 3.095f)
                // c 0.468 0 0.727 0.364 0.727 0.91
                curveToRelative(
                    dx1 = 0.468f,
                    dy1 = 0.0f,
                    dx2 = 0.727f,
                    dy2 = 0.364f,
                    dx3 = 0.727f,
                    dy3 = 0.91f,
                )
                // c 0 0.52 -0.26 0.91 -0.727 0.91
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.52f,
                    dx2 = -0.26f,
                    dy2 = 0.91f,
                    dx3 = -0.727f,
                    dy3 = 0.91f,
                )
                // L 26.06 16.924
                lineTo(x = 26.06f, y = 16.924f)
                // v 4.524
                verticalLineToRelative(dy = 4.524f)
                // h 2.444
                horizontalLineToRelative(dx = 2.444f)
                // c 0.468 0 0.702 0.364 0.702 0.885
                curveToRelative(
                    dx1 = 0.468f,
                    dy1 = 0.0f,
                    dx2 = 0.702f,
                    dy2 = 0.364f,
                    dx3 = 0.702f,
                    dy3 = 0.885f,
                )
                // c 0 0.494 -0.234 0.91 -0.702 0.91
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.494f,
                    dx2 = -0.234f,
                    dy2 = 0.91f,
                    dx3 = -0.702f,
                    dy3 = 0.91f,
                )
                // L 7.392 23.243
                lineTo(x = 7.392f, y = 23.243f)
                // c -0.468 0 -0.702 -0.391 -0.702 -0.91
                curveToRelative(
                    dx1 = -0.468f,
                    dy1 = 0.0f,
                    dx2 = -0.702f,
                    dy2 = -0.391f,
                    dx3 = -0.702f,
                    dy3 = -0.91f,
                )
                // c 0 -0.494 0.234 -0.885 0.702 -0.885
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.494f,
                    dx2 = 0.234f,
                    dy2 = -0.885f,
                    dx3 = 0.702f,
                    dy3 = -0.885f,
                )
                // h 2.522
                horizontalLineToRelative(dx = 2.522f)
                // v -4.524
                verticalLineToRelative(dy = -4.524f)
                // h -3.12
                horizontalLineToRelative(dx = -3.12f)
                // c -0.442 0 -0.702 -0.39 -0.702 -0.91
                curveToRelative(
                    dx1 = -0.442f,
                    dy1 = 0.0f,
                    dx2 = -0.702f,
                    dy2 = -0.39f,
                    dx3 = -0.702f,
                    dy3 = -0.91f,
                )
                // s 0.26 -0.91 0.702 -0.91
                reflectiveCurveToRelative(
                    dx1 = 0.26f,
                    dy1 = -0.91f,
                    dx2 = 0.702f,
                    dy2 = -0.91f,
                )
                // h 3.12
                horizontalLineToRelative(dx = 3.12f)
                // v -1.561z
                verticalLineToRelative(dy = -1.561f)
                close()
                // M 11.136 25.166
                moveTo(x = 11.136f, y = 25.166f)
                // c 0 0.104 -0.026 0.208 -0.078 0.338
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.104f,
                    dx2 = -0.026f,
                    dy2 = 0.208f,
                    dx3 = -0.078f,
                    dy3 = 0.338f,
                )
                // c -0.598 1.482 -1.508 2.99 -2.522 4.134
                curveToRelative(
                    dx1 = -0.598f,
                    dy1 = 1.482f,
                    dx2 = -1.508f,
                    dy2 = 2.99f,
                    dx3 = -2.522f,
                    dy3 = 4.134f,
                )
                // c -0.26 0.261 -0.546 0.391 -0.858 0.391
                curveToRelative(
                    dx1 = -0.26f,
                    dy1 = 0.261f,
                    dx2 = -0.546f,
                    dy2 = 0.391f,
                    dx3 = -0.858f,
                    dy3 = 0.391f,
                )
                // c -0.26 0 -0.494 -0.078 -0.728 -0.261
                curveToRelative(
                    dx1 = -0.26f,
                    dy1 = 0.0f,
                    dx2 = -0.494f,
                    dy2 = -0.078f,
                    dx3 = -0.728f,
                    dy3 = -0.261f,
                )
                // c -0.234 -0.182 -0.364 -0.416 -0.364 -0.701
                curveToRelative(
                    dx1 = -0.234f,
                    dy1 = -0.182f,
                    dx2 = -0.364f,
                    dy2 = -0.416f,
                    dx3 = -0.364f,
                    dy3 = -0.701f,
                )
                // c 0 -0.208 0.078 -0.442 0.286 -0.65
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.208f,
                    dx2 = 0.078f,
                    dy2 = -0.442f,
                    dx3 = 0.286f,
                    dy3 = -0.65f,
                )
                // c 0.91 -0.91 1.716 -2.158 2.314 -3.614
                curveToRelative(
                    dx1 = 0.91f,
                    dy1 = -0.91f,
                    dx2 = 1.716f,
                    dy2 = -2.158f,
                    dx3 = 2.314f,
                    dy3 = -3.614f,
                )
                // c 0.13 -0.338 0.416 -0.52 0.78 -0.52
                curveToRelative(
                    dx1 = 0.13f,
                    dy1 = -0.338f,
                    dx2 = 0.416f,
                    dy2 = -0.52f,
                    dx3 = 0.78f,
                    dy3 = -0.52f,
                )
                // c 0.13 0 0.286 0.025 0.442 0.077
                curveToRelative(
                    dx1 = 0.13f,
                    dy1 = 0.0f,
                    dx2 = 0.286f,
                    dy2 = 0.025f,
                    dx3 = 0.442f,
                    dy3 = 0.077f,
                )
                // c 0.468 0.13 0.728 0.442 0.728 0.806z
                curveToRelative(
                    dx1 = 0.468f,
                    dy1 = 0.13f,
                    dx2 = 0.728f,
                    dy2 = 0.442f,
                    dx3 = 0.728f,
                    dy3 = 0.806f,
                )
                close()
                // M 14.698 15.104
                moveTo(x = 14.698f, y = 15.104f)
                // v -4.42
                verticalLineToRelative(dy = -4.42f)
                // h -2.964
                horizontalLineToRelative(dx = -2.964f)
                // v 4.42
                verticalLineToRelative(dy = 4.42f)
                // h 2.964z
                horizontalLineToRelative(dx = 2.964f)
                close()
                // M 14.698 21.447
                moveTo(x = 14.698f, y = 21.447f)
                // v -4.524
                verticalLineToRelative(dy = -4.524f)
                // h -2.964
                horizontalLineToRelative(dx = -2.964f)
                // v 4.524
                verticalLineToRelative(dy = 4.524f)
                // h 2.964z
                horizontalLineToRelative(dx = 2.964f)
                close()
                // M 14.698 24.386
                moveTo(x = 14.698f, y = 24.386f)
                // c 0.416 0 0.728 0.234 0.806 0.599
                curveToRelative(
                    dx1 = 0.416f,
                    dy1 = 0.0f,
                    dx2 = 0.728f,
                    dy2 = 0.234f,
                    dx3 = 0.806f,
                    dy3 = 0.599f,
                )
                // c 0.312 1.3 0.494 2.808 0.598 4.134
                curveToRelative(
                    dx1 = 0.312f,
                    dy1 = 1.3f,
                    dx2 = 0.494f,
                    dy2 = 2.808f,
                    dx3 = 0.598f,
                    dy3 = 4.134f,
                )
                // v 0.078
                verticalLineToRelative(dy = 0.078f)
                // c 0 0.468 -0.39 0.78 -0.936 0.832
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.468f,
                    dx2 = -0.39f,
                    dy2 = 0.78f,
                    dx3 = -0.936f,
                    dy3 = 0.832f,
                )
                // h -0.13
                horizontalLineToRelative(dx = -0.13f)
                // c -0.494 0 -0.884 -0.286 -0.91 -0.728
                curveToRelative(
                    dx1 = -0.494f,
                    dy1 = 0.0f,
                    dx2 = -0.884f,
                    dy2 = -0.286f,
                    dx3 = -0.91f,
                    dy3 = -0.728f,
                )
                // c -0.052 -1.222 -0.208 -2.704 -0.468 -4.03
                curveToRelative(
                    dx1 = -0.052f,
                    dy1 = -1.222f,
                    dx2 = -0.208f,
                    dy2 = -2.704f,
                    dx3 = -0.468f,
                    dy3 = -4.03f,
                )
                // v -0.13
                verticalLineToRelative(dy = -0.13f)
                // c 0 -0.364 0.312 -0.649 0.78 -0.728
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.364f,
                    dx2 = 0.312f,
                    dy2 = -0.649f,
                    dx3 = 0.78f,
                    dy3 = -0.728f,
                )
                // c 0.079 -0.027 0.182 -0.027 0.26 -0.027z
                curveToRelative(
                    dx1 = 0.079f,
                    dy1 = -0.027f,
                    dx2 = 0.182f,
                    dy2 = -0.027f,
                    dx3 = 0.26f,
                    dy3 = -0.027f,
                )
                close()
                // M 19.457 15.104
                moveTo(x = 19.457f, y = 15.104f)
                // v -4.42
                verticalLineToRelative(dy = -4.42f)
                // h -2.991
                horizontalLineToRelative(dx = -2.991f)
                // v 4.42
                verticalLineToRelative(dy = 4.42f)
                // h 2.991z
                horizontalLineToRelative(dx = 2.991f)
                close()
                // M 19.457 21.447
                moveTo(x = 19.457f, y = 21.447f)
                // v -4.524
                verticalLineToRelative(dy = -4.524f)
                // h -2.991
                horizontalLineToRelative(dx = -2.991f)
                // v 4.524
                verticalLineToRelative(dy = 4.524f)
                // h 2.991z
                horizontalLineToRelative(dx = 2.991f)
                close()
                // M 20.08 24.334
                moveTo(x = 20.08f, y = 24.334f)
                // c 0.416 0 0.703 0.182 0.832 0.546
                curveToRelative(
                    dx1 = 0.416f,
                    dy1 = 0.0f,
                    dx2 = 0.703f,
                    dy2 = 0.182f,
                    dx3 = 0.832f,
                    dy3 = 0.546f,
                )
                // c 0.494 1.3 0.91 2.678 1.17 3.926
                curveToRelative(
                    dx1 = 0.494f,
                    dy1 = 1.3f,
                    dx2 = 0.91f,
                    dy2 = 2.678f,
                    dx3 = 1.17f,
                    dy3 = 3.926f,
                )
                // c 0.026 0.078 0.026 0.183 0.026 0.261
                curveToRelative(
                    dx1 = 0.026f,
                    dy1 = 0.078f,
                    dx2 = 0.026f,
                    dy2 = 0.183f,
                    dx3 = 0.026f,
                    dy3 = 0.261f,
                )
                // c 0 0.416 -0.312 0.727 -0.806 0.832
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.416f,
                    dx2 = -0.312f,
                    dy2 = 0.727f,
                    dx3 = -0.806f,
                    dy3 = 0.832f,
                )
                // c -0.13 0.025 -0.234 0.052 -0.364 0.052
                curveToRelative(
                    dx1 = -0.13f,
                    dy1 = 0.025f,
                    dx2 = -0.234f,
                    dy2 = 0.052f,
                    dx3 = -0.364f,
                    dy3 = 0.052f,
                )
                // c -0.416 0 -0.754 -0.234 -0.806 -0.65
                curveToRelative(
                    dx1 = -0.416f,
                    dy1 = 0.0f,
                    dx2 = -0.754f,
                    dy2 = -0.234f,
                    dx3 = -0.806f,
                    dy3 = -0.65f,
                )
                // c -0.182 -1.222 -0.598 -2.678 -1.014 -3.926
                curveToRelative(
                    dx1 = -0.182f,
                    dy1 = -1.222f,
                    dx2 = -0.598f,
                    dy2 = -2.678f,
                    dx3 = -1.014f,
                    dy3 = -3.926f,
                )
                // c -0.026 -0.078 -0.053 -0.183 -0.053 -0.26
                curveToRelative(
                    dx1 = -0.026f,
                    dy1 = -0.078f,
                    dx2 = -0.053f,
                    dy2 = -0.183f,
                    dx3 = -0.053f,
                    dy3 = -0.26f,
                )
                // c 0 -0.364 0.26 -0.65 0.676 -0.729
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.364f,
                    dx2 = 0.26f,
                    dy2 = -0.65f,
                    dx3 = 0.676f,
                    dy3 = -0.729f,
                )
                // c 0.132 -0.027 0.236 -0.052 0.339 -0.052z
                curveToRelative(
                    dx1 = 0.132f,
                    dy1 = -0.027f,
                    dx2 = 0.236f,
                    dy2 = -0.052f,
                    dx3 = 0.339f,
                    dy3 = -0.052f,
                )
                close()
                // M 24.267 15.104
                moveTo(x = 24.267f, y = 15.104f)
                // v -4.42
                verticalLineToRelative(dy = -4.42f)
                // L 21.2 10.684
                lineTo(x = 21.2f, y = 10.684f)
                // v 4.42
                verticalLineToRelative(dy = 4.42f)
                // h 3.067z
                horizontalLineToRelative(dx = 3.067f)
                close()
                // M 24.267 21.447
                moveTo(x = 24.267f, y = 21.447f)
                // v -4.524
                verticalLineToRelative(dy = -4.524f)
                // L 21.2 16.923
                lineTo(x = 21.2f, y = 16.923f)
                // v 4.524
                verticalLineToRelative(dy = 4.524f)
                // h 3.067z
                horizontalLineToRelative(dx = 3.067f)
                close()
                // M 25.775 24.256
                moveTo(x = 25.775f, y = 24.256f)
                // c 0.312 0 0.571 0.13 0.754 0.312
                curveToRelative(
                    dx1 = 0.312f,
                    dy1 = 0.0f,
                    dx2 = 0.571f,
                    dy2 = 0.13f,
                    dx3 = 0.754f,
                    dy3 = 0.312f,
                )
                // c 1.065 1.325 1.897 2.573 2.573 3.899
                curveToRelative(
                    dx1 = 1.065f,
                    dy1 = 1.325f,
                    dx2 = 1.897f,
                    dy2 = 2.573f,
                    dx3 = 2.573f,
                    dy3 = 3.899f,
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
                // c 0 0.364 -0.208 0.676 -0.572 0.857
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.364f,
                    dx2 = -0.208f,
                    dy2 = 0.676f,
                    dx3 = -0.572f,
                    dy3 = 0.857f,
                )
                // c -0.156 0.078 -0.338 0.131 -0.494 0.131
                curveToRelative(
                    dx1 = -0.156f,
                    dy1 = 0.078f,
                    dx2 = -0.338f,
                    dy2 = 0.131f,
                    dx3 = -0.494f,
                    dy3 = 0.131f,
                )
                // c -0.338 0 -0.649 -0.156 -0.832 -0.442
                curveToRelative(
                    dx1 = -0.338f,
                    dy1 = 0.0f,
                    dx2 = -0.649f,
                    dy2 = -0.156f,
                    dx3 = -0.832f,
                    dy3 = -0.442f,
                )
                // c -0.65 -1.326 -1.404 -2.626 -2.392 -3.874
                curveToRelative(
                    dx1 = -0.65f,
                    dy1 = -1.326f,
                    dx2 = -1.404f,
                    dy2 = -2.626f,
                    dx3 = -2.392f,
                    dy3 = -3.874f,
                )
                // c -0.078 -0.13 -0.13 -0.286 -0.13 -0.442
                curveToRelative(
                    dx1 = -0.078f,
                    dy1 = -0.13f,
                    dx2 = -0.13f,
                    dy2 = -0.286f,
                    dx3 = -0.13f,
                    dy3 = -0.442f,
                )
                // c 0 -0.26 0.13 -0.52 0.441 -0.728
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.26f,
                    dx2 = 0.13f,
                    dy2 = -0.52f,
                    dx3 = 0.441f,
                    dy3 = -0.728f,
                )
                // c 0.183 -0.103 0.366 -0.155 0.548 -0.155z
                curveToRelative(
                    dx1 = 0.183f,
                    dy1 = -0.103f,
                    dx2 = 0.366f,
                    dy2 = -0.155f,
                    dx3 = 0.548f,
                    dy3 = -0.155f,
                )
                close()
            }
        }.build().also { _emoji1f21a = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f21a: ImageVector? = null
