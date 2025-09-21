package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f23a: ImageVector
    get() {
        val current = _emoji1f23a
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f23a",
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
            // M26.893 9.669 c1.534 0 2.236 0.598 2.236 2.002 v3.562 c0 0.494 -0.364 0.78 -0.988 0.78 -0.572 0 -0.988 -0.286 -0.988 -0.78 v-3.146 c0 -0.572 -0.26 -0.702 -0.832 -0.702 L9.576 11.385 c-0.52 0 -0.78 0.13 -0.78 0.702 v3.146 c0 0.494 -0.39 0.78 -0.988 0.78 s-0.988 -0.286 -0.988 -0.78 v-3.562 c0 -1.404 0.676 -2.002 2.236 -2.002 h2.626 c-0.442 -0.754 -1.04 -1.638 -1.404 -2.132 -0.104 -0.156 -0.156 -0.286 -0.156 -0.416 0 -0.286 0.234 -0.572 0.572 -0.702 0.182 -0.078 0.364 -0.13 0.52 -0.13 0.312 0 0.572 0.13 0.78 0.416 0.546 0.78 1.275 1.976 1.768 2.964 h3.64 c-0.338 -0.78 -0.832 -1.742 -1.274 -2.47 -0.078 -0.13 -0.104 -0.26 -0.104 -0.364 0 -0.312 0.208 -0.598 0.598 -0.702 0.156 -0.052 0.312 -0.078 0.442 -0.078 0.338 0 0.598 0.13 0.806 0.468 0.494 0.78 1.066 2.028 1.534 3.146 h2.834 c0.702 -1.014 1.326 -2.054 1.717 -2.912 0.207 -0.416 0.494 -0.572 0.857 -0.572 0.156 0 0.312 0.026 0.469 0.078 0.441 0.13 0.649 0.39 0.649 0.702 0 0.156 -0.052 0.312 -0.13 0.468 -0.338 0.676 -0.832 1.456 -1.378 2.236 h2.471z M25.385 22.176 c1.456 0 2.184 0.598 2.184 2.028 v3.354 c0 1.431 -0.728 2.028 -2.184 2.028 h-14.82 c-1.456 0 -2.185 -0.598 -2.185 -2.028 v-3.354 c0 -1.431 0.729 -2.028 2.185 -2.028 h4.654 c0.416 -0.729 0.78 -1.534 1.118 -2.315 h-3.614 c-1.612 0 -2.236 -0.519 -2.236 -1.924 v-2.652 c0 -1.43 0.624 -1.924 2.236 -1.924 h10.479 c1.611 0 2.235 0.494 2.235 1.924 v2.652 c0 1.404 -0.624 1.924 -2.235 1.924 h-4.811 c-0.312 0.807 -0.676 1.586 -1.144 2.315 h8.138z M24.787 27.818 c0.572 0 0.806 -0.131 0.806 -0.65 v-2.626 c0 -0.521 -0.233 -0.65 -0.806 -0.65 L11.162 23.892 c-0.572 0 -0.806 0.13 -0.806 0.65 v2.626 c0 0.52 0.234 0.65 0.806 0.65 h13.625z M22.759 18.25 c0.521 0 0.754 -0.13 0.754 -0.65 v-1.95 c0 -0.494 -0.233 -0.624 -0.754 -0.624 h-9.595 c-0.546 0 -0.754 0.13 -0.754 0.624 v1.95 c0 0.52 0.208 0.65 0.754 0.65 h9.595z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 26.893 9.669
                moveTo(x = 26.893f, y = 9.669f)
                // c 1.534 0 2.236 0.598 2.236 2.002
                curveToRelative(
                    dx1 = 1.534f,
                    dy1 = 0.0f,
                    dx2 = 2.236f,
                    dy2 = 0.598f,
                    dx3 = 2.236f,
                    dy3 = 2.002f,
                )
                // v 3.562
                verticalLineToRelative(dy = 3.562f)
                // c 0 0.494 -0.364 0.78 -0.988 0.78
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.494f,
                    dx2 = -0.364f,
                    dy2 = 0.78f,
                    dx3 = -0.988f,
                    dy3 = 0.78f,
                )
                // c -0.572 0 -0.988 -0.286 -0.988 -0.78
                curveToRelative(
                    dx1 = -0.572f,
                    dy1 = 0.0f,
                    dx2 = -0.988f,
                    dy2 = -0.286f,
                    dx3 = -0.988f,
                    dy3 = -0.78f,
                )
                // v -3.146
                verticalLineToRelative(dy = -3.146f)
                // c 0 -0.572 -0.26 -0.702 -0.832 -0.702
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.572f,
                    dx2 = -0.26f,
                    dy2 = -0.702f,
                    dx3 = -0.832f,
                    dy3 = -0.702f,
                )
                // L 9.576 11.385
                lineTo(x = 9.576f, y = 11.385f)
                // c -0.52 0 -0.78 0.13 -0.78 0.702
                curveToRelative(
                    dx1 = -0.52f,
                    dy1 = 0.0f,
                    dx2 = -0.78f,
                    dy2 = 0.13f,
                    dx3 = -0.78f,
                    dy3 = 0.702f,
                )
                // v 3.146
                verticalLineToRelative(dy = 3.146f)
                // c 0 0.494 -0.39 0.78 -0.988 0.78
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.494f,
                    dx2 = -0.39f,
                    dy2 = 0.78f,
                    dx3 = -0.988f,
                    dy3 = 0.78f,
                )
                // s -0.988 -0.286 -0.988 -0.78
                reflectiveCurveToRelative(
                    dx1 = -0.988f,
                    dy1 = -0.286f,
                    dx2 = -0.988f,
                    dy2 = -0.78f,
                )
                // v -3.562
                verticalLineToRelative(dy = -3.562f)
                // c 0 -1.404 0.676 -2.002 2.236 -2.002
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.404f,
                    dx2 = 0.676f,
                    dy2 = -2.002f,
                    dx3 = 2.236f,
                    dy3 = -2.002f,
                )
                // h 2.626
                horizontalLineToRelative(dx = 2.626f)
                // c -0.442 -0.754 -1.04 -1.638 -1.404 -2.132
                curveToRelative(
                    dx1 = -0.442f,
                    dy1 = -0.754f,
                    dx2 = -1.04f,
                    dy2 = -1.638f,
                    dx3 = -1.404f,
                    dy3 = -2.132f,
                )
                // c -0.104 -0.156 -0.156 -0.286 -0.156 -0.416
                curveToRelative(
                    dx1 = -0.104f,
                    dy1 = -0.156f,
                    dx2 = -0.156f,
                    dy2 = -0.286f,
                    dx3 = -0.156f,
                    dy3 = -0.416f,
                )
                // c 0 -0.286 0.234 -0.572 0.572 -0.702
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.286f,
                    dx2 = 0.234f,
                    dy2 = -0.572f,
                    dx3 = 0.572f,
                    dy3 = -0.702f,
                )
                // c 0.182 -0.078 0.364 -0.13 0.52 -0.13
                curveToRelative(
                    dx1 = 0.182f,
                    dy1 = -0.078f,
                    dx2 = 0.364f,
                    dy2 = -0.13f,
                    dx3 = 0.52f,
                    dy3 = -0.13f,
                )
                // c 0.312 0 0.572 0.13 0.78 0.416
                curveToRelative(
                    dx1 = 0.312f,
                    dy1 = 0.0f,
                    dx2 = 0.572f,
                    dy2 = 0.13f,
                    dx3 = 0.78f,
                    dy3 = 0.416f,
                )
                // c 0.546 0.78 1.275 1.976 1.768 2.964
                curveToRelative(
                    dx1 = 0.546f,
                    dy1 = 0.78f,
                    dx2 = 1.275f,
                    dy2 = 1.976f,
                    dx3 = 1.768f,
                    dy3 = 2.964f,
                )
                // h 3.64
                horizontalLineToRelative(dx = 3.64f)
                // c -0.338 -0.78 -0.832 -1.742 -1.274 -2.47
                curveToRelative(
                    dx1 = -0.338f,
                    dy1 = -0.78f,
                    dx2 = -0.832f,
                    dy2 = -1.742f,
                    dx3 = -1.274f,
                    dy3 = -2.47f,
                )
                // c -0.078 -0.13 -0.104 -0.26 -0.104 -0.364
                curveToRelative(
                    dx1 = -0.078f,
                    dy1 = -0.13f,
                    dx2 = -0.104f,
                    dy2 = -0.26f,
                    dx3 = -0.104f,
                    dy3 = -0.364f,
                )
                // c 0 -0.312 0.208 -0.598 0.598 -0.702
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.312f,
                    dx2 = 0.208f,
                    dy2 = -0.598f,
                    dx3 = 0.598f,
                    dy3 = -0.702f,
                )
                // c 0.156 -0.052 0.312 -0.078 0.442 -0.078
                curveToRelative(
                    dx1 = 0.156f,
                    dy1 = -0.052f,
                    dx2 = 0.312f,
                    dy2 = -0.078f,
                    dx3 = 0.442f,
                    dy3 = -0.078f,
                )
                // c 0.338 0 0.598 0.13 0.806 0.468
                curveToRelative(
                    dx1 = 0.338f,
                    dy1 = 0.0f,
                    dx2 = 0.598f,
                    dy2 = 0.13f,
                    dx3 = 0.806f,
                    dy3 = 0.468f,
                )
                // c 0.494 0.78 1.066 2.028 1.534 3.146
                curveToRelative(
                    dx1 = 0.494f,
                    dy1 = 0.78f,
                    dx2 = 1.066f,
                    dy2 = 2.028f,
                    dx3 = 1.534f,
                    dy3 = 3.146f,
                )
                // h 2.834
                horizontalLineToRelative(dx = 2.834f)
                // c 0.702 -1.014 1.326 -2.054 1.717 -2.912
                curveToRelative(
                    dx1 = 0.702f,
                    dy1 = -1.014f,
                    dx2 = 1.326f,
                    dy2 = -2.054f,
                    dx3 = 1.717f,
                    dy3 = -2.912f,
                )
                // c 0.207 -0.416 0.494 -0.572 0.857 -0.572
                curveToRelative(
                    dx1 = 0.207f,
                    dy1 = -0.416f,
                    dx2 = 0.494f,
                    dy2 = -0.572f,
                    dx3 = 0.857f,
                    dy3 = -0.572f,
                )
                // c 0.156 0 0.312 0.026 0.469 0.078
                curveToRelative(
                    dx1 = 0.156f,
                    dy1 = 0.0f,
                    dx2 = 0.312f,
                    dy2 = 0.026f,
                    dx3 = 0.469f,
                    dy3 = 0.078f,
                )
                // c 0.441 0.13 0.649 0.39 0.649 0.702
                curveToRelative(
                    dx1 = 0.441f,
                    dy1 = 0.13f,
                    dx2 = 0.649f,
                    dy2 = 0.39f,
                    dx3 = 0.649f,
                    dy3 = 0.702f,
                )
                // c 0 0.156 -0.052 0.312 -0.13 0.468
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.156f,
                    dx2 = -0.052f,
                    dy2 = 0.312f,
                    dx3 = -0.13f,
                    dy3 = 0.468f,
                )
                // c -0.338 0.676 -0.832 1.456 -1.378 2.236
                curveToRelative(
                    dx1 = -0.338f,
                    dy1 = 0.676f,
                    dx2 = -0.832f,
                    dy2 = 1.456f,
                    dx3 = -1.378f,
                    dy3 = 2.236f,
                )
                // h 2.471z
                horizontalLineToRelative(dx = 2.471f)
                close()
                // M 25.385 22.176
                moveTo(x = 25.385f, y = 22.176f)
                // c 1.456 0 2.184 0.598 2.184 2.028
                curveToRelative(
                    dx1 = 1.456f,
                    dy1 = 0.0f,
                    dx2 = 2.184f,
                    dy2 = 0.598f,
                    dx3 = 2.184f,
                    dy3 = 2.028f,
                )
                // v 3.354
                verticalLineToRelative(dy = 3.354f)
                // c 0 1.431 -0.728 2.028 -2.184 2.028
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.431f,
                    dx2 = -0.728f,
                    dy2 = 2.028f,
                    dx3 = -2.184f,
                    dy3 = 2.028f,
                )
                // h -14.82
                horizontalLineToRelative(dx = -14.82f)
                // c -1.456 0 -2.185 -0.598 -2.185 -2.028
                curveToRelative(
                    dx1 = -1.456f,
                    dy1 = 0.0f,
                    dx2 = -2.185f,
                    dy2 = -0.598f,
                    dx3 = -2.185f,
                    dy3 = -2.028f,
                )
                // v -3.354
                verticalLineToRelative(dy = -3.354f)
                // c 0 -1.431 0.729 -2.028 2.185 -2.028
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.431f,
                    dx2 = 0.729f,
                    dy2 = -2.028f,
                    dx3 = 2.185f,
                    dy3 = -2.028f,
                )
                // h 4.654
                horizontalLineToRelative(dx = 4.654f)
                // c 0.416 -0.729 0.78 -1.534 1.118 -2.315
                curveToRelative(
                    dx1 = 0.416f,
                    dy1 = -0.729f,
                    dx2 = 0.78f,
                    dy2 = -1.534f,
                    dx3 = 1.118f,
                    dy3 = -2.315f,
                )
                // h -3.614
                horizontalLineToRelative(dx = -3.614f)
                // c -1.612 0 -2.236 -0.519 -2.236 -1.924
                curveToRelative(
                    dx1 = -1.612f,
                    dy1 = 0.0f,
                    dx2 = -2.236f,
                    dy2 = -0.519f,
                    dx3 = -2.236f,
                    dy3 = -1.924f,
                )
                // v -2.652
                verticalLineToRelative(dy = -2.652f)
                // c 0 -1.43 0.624 -1.924 2.236 -1.924
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.43f,
                    dx2 = 0.624f,
                    dy2 = -1.924f,
                    dx3 = 2.236f,
                    dy3 = -1.924f,
                )
                // h 10.479
                horizontalLineToRelative(dx = 10.479f)
                // c 1.611 0 2.235 0.494 2.235 1.924
                curveToRelative(
                    dx1 = 1.611f,
                    dy1 = 0.0f,
                    dx2 = 2.235f,
                    dy2 = 0.494f,
                    dx3 = 2.235f,
                    dy3 = 1.924f,
                )
                // v 2.652
                verticalLineToRelative(dy = 2.652f)
                // c 0 1.404 -0.624 1.924 -2.235 1.924
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.404f,
                    dx2 = -0.624f,
                    dy2 = 1.924f,
                    dx3 = -2.235f,
                    dy3 = 1.924f,
                )
                // h -4.811
                horizontalLineToRelative(dx = -4.811f)
                // c -0.312 0.807 -0.676 1.586 -1.144 2.315
                curveToRelative(
                    dx1 = -0.312f,
                    dy1 = 0.807f,
                    dx2 = -0.676f,
                    dy2 = 1.586f,
                    dx3 = -1.144f,
                    dy3 = 2.315f,
                )
                // h 8.138z
                horizontalLineToRelative(dx = 8.138f)
                close()
                // M 24.787 27.818
                moveTo(x = 24.787f, y = 27.818f)
                // c 0.572 0 0.806 -0.131 0.806 -0.65
                curveToRelative(
                    dx1 = 0.572f,
                    dy1 = 0.0f,
                    dx2 = 0.806f,
                    dy2 = -0.131f,
                    dx3 = 0.806f,
                    dy3 = -0.65f,
                )
                // v -2.626
                verticalLineToRelative(dy = -2.626f)
                // c 0 -0.521 -0.233 -0.65 -0.806 -0.65
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.521f,
                    dx2 = -0.233f,
                    dy2 = -0.65f,
                    dx3 = -0.806f,
                    dy3 = -0.65f,
                )
                // L 11.162 23.892
                lineTo(x = 11.162f, y = 23.892f)
                // c -0.572 0 -0.806 0.13 -0.806 0.65
                curveToRelative(
                    dx1 = -0.572f,
                    dy1 = 0.0f,
                    dx2 = -0.806f,
                    dy2 = 0.13f,
                    dx3 = -0.806f,
                    dy3 = 0.65f,
                )
                // v 2.626
                verticalLineToRelative(dy = 2.626f)
                // c 0 0.52 0.234 0.65 0.806 0.65
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.52f,
                    dx2 = 0.234f,
                    dy2 = 0.65f,
                    dx3 = 0.806f,
                    dy3 = 0.65f,
                )
                // h 13.625z
                horizontalLineToRelative(dx = 13.625f)
                close()
                // M 22.759 18.25
                moveTo(x = 22.759f, y = 18.25f)
                // c 0.521 0 0.754 -0.13 0.754 -0.65
                curveToRelative(
                    dx1 = 0.521f,
                    dy1 = 0.0f,
                    dx2 = 0.754f,
                    dy2 = -0.13f,
                    dx3 = 0.754f,
                    dy3 = -0.65f,
                )
                // v -1.95
                verticalLineToRelative(dy = -1.95f)
                // c 0 -0.494 -0.233 -0.624 -0.754 -0.624
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.494f,
                    dx2 = -0.233f,
                    dy2 = -0.624f,
                    dx3 = -0.754f,
                    dy3 = -0.624f,
                )
                // h -9.595
                horizontalLineToRelative(dx = -9.595f)
                // c -0.546 0 -0.754 0.13 -0.754 0.624
                curveToRelative(
                    dx1 = -0.546f,
                    dy1 = 0.0f,
                    dx2 = -0.754f,
                    dy2 = 0.13f,
                    dx3 = -0.754f,
                    dy3 = 0.624f,
                )
                // v 1.95
                verticalLineToRelative(dy = 1.95f)
                // c 0 0.52 0.208 0.65 0.754 0.65
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.52f,
                    dx2 = 0.208f,
                    dy2 = 0.65f,
                    dx3 = 0.754f,
                    dy3 = 0.65f,
                )
                // h 9.595z
                horizontalLineToRelative(dx = 9.595f)
                close()
            }
        }.build().also { _emoji1f23a = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f23a: ImageVector? = null
