package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1facf: ImageVector
    get() {
        val current = _emoji1facf
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1facf",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // m16.07 26.09  l3.23 6.04 c0.1 0.18 0.35 0.22 0.49 0.07 l1.49 -1.49 c0.12 -0.12 0.12 -0.31 0 -0.43 l-2.24 -2.43 a1.03 1.03 0 0 1 -0.27 -0.69 v-3.72 l-3.28 -1.94 -1 3 1.57 1.59Z M21.77 23.21 S23 26 25 27 l-1.33 4.07 c-0.08 0.2 0.07 0.43 0.29 0.43 h1.52 c0.14 0 0.26 -0.09 0.3 -0.22 l1.72 -5.78 -3 -5.38 -3 2z
            path(
                fill = SolidColor(Color(0xFF738695)),
            ) {
                // M 16.07 26.09
                moveTo(x = 16.07f, y = 26.09f)
                // l 3.23 6.04
                lineToRelative(dx = 3.23f, dy = 6.04f)
                // c 0.1 0.18 0.35 0.22 0.49 0.07
                curveToRelative(
                    dx1 = 0.1f,
                    dy1 = 0.18f,
                    dx2 = 0.35f,
                    dy2 = 0.22f,
                    dx3 = 0.49f,
                    dy3 = 0.07f,
                )
                // l 1.49 -1.49
                lineToRelative(dx = 1.49f, dy = -1.49f)
                // c 0.12 -0.12 0.12 -0.31 0 -0.43
                curveToRelative(
                    dx1 = 0.12f,
                    dy1 = -0.12f,
                    dx2 = 0.12f,
                    dy2 = -0.31f,
                    dx3 = 0.0f,
                    dy3 = -0.43f,
                )
                // l -2.24 -2.43
                lineToRelative(dx = -2.24f, dy = -2.43f)
                // a 1.03 1.03 0 0 1 -0.27 -0.69
                arcToRelative(
                    a = 1.03f,
                    b = 1.03f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.27f,
                    dy1 = -0.69f,
                )
                // v -3.72
                verticalLineToRelative(dy = -3.72f)
                // l -3.28 -1.94
                lineToRelative(dx = -3.28f, dy = -1.94f)
                // l -1 3
                lineToRelative(dx = -1.0f, dy = 3.0f)
                // l 1.57 1.59z
                lineToRelative(dx = 1.57f, dy = 1.59f)
                close()
                // M 21.77 23.21
                moveTo(x = 21.77f, y = 23.21f)
                // S 23 26 25 27
                reflectiveCurveTo(
                    x1 = 23.0f,
                    y1 = 26.0f,
                    x2 = 25.0f,
                    y2 = 27.0f,
                )
                // l -1.33 4.07
                lineToRelative(dx = -1.33f, dy = 4.07f)
                // c -0.08 0.2 0.07 0.43 0.29 0.43
                curveToRelative(
                    dx1 = -0.08f,
                    dy1 = 0.2f,
                    dx2 = 0.07f,
                    dy2 = 0.43f,
                    dx3 = 0.29f,
                    dy3 = 0.43f,
                )
                // h 1.52
                horizontalLineToRelative(dx = 1.52f)
                // c 0.14 0 0.26 -0.09 0.3 -0.22
                curveToRelative(
                    dx1 = 0.14f,
                    dy1 = 0.0f,
                    dx2 = 0.26f,
                    dy2 = -0.09f,
                    dx3 = 0.3f,
                    dy3 = -0.22f,
                )
                // l 1.72 -5.78
                lineToRelative(dx = 1.72f, dy = -5.78f)
                // l -3 -5.38
                lineToRelative(dx = -3.0f, dy = -5.38f)
                // l -3 2z
                lineToRelative(dx = -3.0f, dy = 2.0f)
                close()
            }
            // M6.97 5 s-1.86 3.92 -0.18 5.5 h1.14 S9.02 8.48 6.97 5
            path(
                fill = SolidColor(Color(0xFFBFCCD5)),
            ) {
                // M 6.97 5
                moveTo(x = 6.97f, y = 5.0f)
                // s -1.86 3.92 -0.18 5.5
                reflectiveCurveToRelative(
                    dx1 = -1.86f,
                    dy1 = 3.92f,
                    dx2 = -0.18f,
                    dy2 = 5.5f,
                )
                // h 1.14
                horizontalLineToRelative(dx = 1.14f)
                // S 9.02 8.48 6.97 5
                reflectiveCurveTo(
                    x1 = 9.02f,
                    y1 = 8.48f,
                    x2 = 6.97f,
                    y2 = 5.0f,
                )
            }
            // M7.02 8.82 s0.38 -1.7 3.48 -2.32 c1.36 -0.27 2.42 0.05 3.11 0.39 0.48 0.24 0.57 0.89 0.16 1.25 l-0.76 0.67 s1.72 -0.24 1.99 0.18 c0.22 0.33 -0.5 1.5 -0.5 1.5 s1.08 0.02 1.5 0.5 c0.11 0.13 0.52 0.54 0.94 0.96 0.69 0.68 1.54 1.16 2.48 1.4 l2.57 0.64 -6.5 -0.5 -4.04 -2.91 -4.44 -1.77Z
            path(
                fill = SolidColor(Color(0xFF738695)),
            ) {
                // M 7.02 8.82
                moveTo(x = 7.02f, y = 8.82f)
                // s 0.38 -1.7 3.48 -2.32
                reflectiveCurveToRelative(
                    dx1 = 0.38f,
                    dy1 = -1.7f,
                    dx2 = 3.48f,
                    dy2 = -2.32f,
                )
                // c 1.36 -0.27 2.42 0.05 3.11 0.39
                curveToRelative(
                    dx1 = 1.36f,
                    dy1 = -0.27f,
                    dx2 = 2.42f,
                    dy2 = 0.05f,
                    dx3 = 3.11f,
                    dy3 = 0.39f,
                )
                // c 0.48 0.24 0.57 0.89 0.16 1.25
                curveToRelative(
                    dx1 = 0.48f,
                    dy1 = 0.24f,
                    dx2 = 0.57f,
                    dy2 = 0.89f,
                    dx3 = 0.16f,
                    dy3 = 1.25f,
                )
                // l -0.76 0.67
                lineToRelative(dx = -0.76f, dy = 0.67f)
                // s 1.72 -0.24 1.99 0.18
                reflectiveCurveToRelative(
                    dx1 = 1.72f,
                    dy1 = -0.24f,
                    dx2 = 1.99f,
                    dy2 = 0.18f,
                )
                // c 0.22 0.33 -0.5 1.5 -0.5 1.5
                curveToRelative(
                    dx1 = 0.22f,
                    dy1 = 0.33f,
                    dx2 = -0.5f,
                    dy2 = 1.5f,
                    dx3 = -0.5f,
                    dy3 = 1.5f,
                )
                // s 1.08 0.02 1.5 0.5
                reflectiveCurveToRelative(
                    dx1 = 1.08f,
                    dy1 = 0.02f,
                    dx2 = 1.5f,
                    dy2 = 0.5f,
                )
                // c 0.11 0.13 0.52 0.54 0.94 0.96
                curveToRelative(
                    dx1 = 0.11f,
                    dy1 = 0.13f,
                    dx2 = 0.52f,
                    dy2 = 0.54f,
                    dx3 = 0.94f,
                    dy3 = 0.96f,
                )
                // c 0.69 0.68 1.54 1.16 2.48 1.4
                curveToRelative(
                    dx1 = 0.69f,
                    dy1 = 0.68f,
                    dx2 = 1.54f,
                    dy2 = 1.16f,
                    dx3 = 2.48f,
                    dy3 = 1.4f,
                )
                // l 2.57 0.64
                lineToRelative(dx = 2.57f, dy = 0.64f)
                // l -6.5 -0.5
                lineToRelative(dx = -6.5f, dy = -0.5f)
                // l -4.04 -2.91
                lineToRelative(dx = -4.04f, dy = -2.91f)
                // l -4.44 -1.77z
                lineToRelative(dx = -4.44f, dy = -1.77f)
                close()
            }
            // M31.4 12.92 c-1.91 -2.01 -5.4 -2.75 -8.9 -0.42 -4.85 3.23 -10 -2 -10 -2 -3.36 -2.69 -5.37 -2.21 -6.32 -1.61 -0.38 0.24 -0.67 0.59 -0.87 0.99 l-2.2 4.36 c-0.84 1.66 0.82 3.47 2.55 2.79 L9.01 16 c0.71 2.83 2.17 4.41 2.96 5.09 0.35 0.3 0.58 0.72 0.64 1.18 l0.9 7.23 -0.75 4.05 c-0.05 0.27 0.15 0.51 0.42 0.51 h1.89 c0.24 0 0.43 -0.19 0.43 -0.43 V29.5 s0.63 -3.81 0.89 -5.36 c0.06 -0.34 0.4 -0.53 0.72 -0.42 3.39 1.12 5.78 -0.06 6.81 -0.77 0.28 -0.19 0.67 -0.08 0.78 0.25 1.15 3.42 3.79 4.3 3.79 4.3 l-1.34 6.04 c-0.06 0.27 0.15 0.53 0.42 0.53 h1.58 c0.2 0 0.37 -0.13 0.42 -0.32 l1.81 -6.86 c0.06 -0.24 0.03 -0.51 -0.1 -0.73 l-0.78 -1.36 a0.788 0.788 0 0 1 -0.06 -0.67 l2.03 -5.63 c0.06 -0.16 0.1 -0.32 0.15 -0.48 0.22 1.19 0.35 2.66 0.35 4.48 0 0.28 0.22 0.5 0.5 0.5 s0.5 -0.22 0.5 -0.5 c0 -5.84 -1.37 -8.43 -2.6 -9.58Z
            path(
                fill = SolidColor(Color(0xFFBFCCD5)),
            ) {
                // M 31.4 12.92
                moveTo(x = 31.4f, y = 12.92f)
                // c -1.91 -2.01 -5.4 -2.75 -8.9 -0.42
                curveToRelative(
                    dx1 = -1.91f,
                    dy1 = -2.01f,
                    dx2 = -5.4f,
                    dy2 = -2.75f,
                    dx3 = -8.9f,
                    dy3 = -0.42f,
                )
                // c -4.85 3.23 -10 -2 -10 -2
                curveToRelative(
                    dx1 = -4.85f,
                    dy1 = 3.23f,
                    dx2 = -10.0f,
                    dy2 = -2.0f,
                    dx3 = -10.0f,
                    dy3 = -2.0f,
                )
                // c -3.36 -2.69 -5.37 -2.21 -6.32 -1.61
                curveToRelative(
                    dx1 = -3.36f,
                    dy1 = -2.69f,
                    dx2 = -5.37f,
                    dy2 = -2.21f,
                    dx3 = -6.32f,
                    dy3 = -1.61f,
                )
                // c -0.38 0.24 -0.67 0.59 -0.87 0.99
                curveToRelative(
                    dx1 = -0.38f,
                    dy1 = 0.24f,
                    dx2 = -0.67f,
                    dy2 = 0.59f,
                    dx3 = -0.87f,
                    dy3 = 0.99f,
                )
                // l -2.2 4.36
                lineToRelative(dx = -2.2f, dy = 4.36f)
                // c -0.84 1.66 0.82 3.47 2.55 2.79
                curveToRelative(
                    dx1 = -0.84f,
                    dy1 = 1.66f,
                    dx2 = 0.82f,
                    dy2 = 3.47f,
                    dx3 = 2.55f,
                    dy3 = 2.79f,
                )
                // L 9.01 16
                lineTo(x = 9.01f, y = 16.0f)
                // c 0.71 2.83 2.17 4.41 2.96 5.09
                curveToRelative(
                    dx1 = 0.71f,
                    dy1 = 2.83f,
                    dx2 = 2.17f,
                    dy2 = 4.41f,
                    dx3 = 2.96f,
                    dy3 = 5.09f,
                )
                // c 0.35 0.3 0.58 0.72 0.64 1.18
                curveToRelative(
                    dx1 = 0.35f,
                    dy1 = 0.3f,
                    dx2 = 0.58f,
                    dy2 = 0.72f,
                    dx3 = 0.64f,
                    dy3 = 1.18f,
                )
                // l 0.9 7.23
                lineToRelative(dx = 0.9f, dy = 7.23f)
                // l -0.75 4.05
                lineToRelative(dx = -0.75f, dy = 4.05f)
                // c -0.05 0.27 0.15 0.51 0.42 0.51
                curveToRelative(
                    dx1 = -0.05f,
                    dy1 = 0.27f,
                    dx2 = 0.15f,
                    dy2 = 0.51f,
                    dx3 = 0.42f,
                    dy3 = 0.51f,
                )
                // h 1.89
                horizontalLineToRelative(dx = 1.89f)
                // c 0.24 0 0.43 -0.19 0.43 -0.43
                curveToRelative(
                    dx1 = 0.24f,
                    dy1 = 0.0f,
                    dx2 = 0.43f,
                    dy2 = -0.19f,
                    dx3 = 0.43f,
                    dy3 = -0.43f,
                )
                // V 29.5
                verticalLineTo(y = 29.5f)
                // s 0.63 -3.81 0.89 -5.36
                reflectiveCurveToRelative(
                    dx1 = 0.63f,
                    dy1 = -3.81f,
                    dx2 = 0.89f,
                    dy2 = -5.36f,
                )
                // c 0.06 -0.34 0.4 -0.53 0.72 -0.42
                curveToRelative(
                    dx1 = 0.06f,
                    dy1 = -0.34f,
                    dx2 = 0.4f,
                    dy2 = -0.53f,
                    dx3 = 0.72f,
                    dy3 = -0.42f,
                )
                // c 3.39 1.12 5.78 -0.06 6.81 -0.77
                curveToRelative(
                    dx1 = 3.39f,
                    dy1 = 1.12f,
                    dx2 = 5.78f,
                    dy2 = -0.06f,
                    dx3 = 6.81f,
                    dy3 = -0.77f,
                )
                // c 0.28 -0.19 0.67 -0.08 0.78 0.25
                curveToRelative(
                    dx1 = 0.28f,
                    dy1 = -0.19f,
                    dx2 = 0.67f,
                    dy2 = -0.08f,
                    dx3 = 0.78f,
                    dy3 = 0.25f,
                )
                // c 1.15 3.42 3.79 4.3 3.79 4.3
                curveToRelative(
                    dx1 = 1.15f,
                    dy1 = 3.42f,
                    dx2 = 3.79f,
                    dy2 = 4.3f,
                    dx3 = 3.79f,
                    dy3 = 4.3f,
                )
                // l -1.34 6.04
                lineToRelative(dx = -1.34f, dy = 6.04f)
                // c -0.06 0.27 0.15 0.53 0.42 0.53
                curveToRelative(
                    dx1 = -0.06f,
                    dy1 = 0.27f,
                    dx2 = 0.15f,
                    dy2 = 0.53f,
                    dx3 = 0.42f,
                    dy3 = 0.53f,
                )
                // h 1.58
                horizontalLineToRelative(dx = 1.58f)
                // c 0.2 0 0.37 -0.13 0.42 -0.32
                curveToRelative(
                    dx1 = 0.2f,
                    dy1 = 0.0f,
                    dx2 = 0.37f,
                    dy2 = -0.13f,
                    dx3 = 0.42f,
                    dy3 = -0.32f,
                )
                // l 1.81 -6.86
                lineToRelative(dx = 1.81f, dy = -6.86f)
                // c 0.06 -0.24 0.03 -0.51 -0.1 -0.73
                curveToRelative(
                    dx1 = 0.06f,
                    dy1 = -0.24f,
                    dx2 = 0.03f,
                    dy2 = -0.51f,
                    dx3 = -0.1f,
                    dy3 = -0.73f,
                )
                // l -0.78 -1.36
                lineToRelative(dx = -0.78f, dy = -1.36f)
                // a 0.788 0.788 0 0 1 -0.06 -0.67
                arcToRelative(
                    a = 0.788f,
                    b = 0.788f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.06f,
                    dy1 = -0.67f,
                )
                // l 2.03 -5.63
                lineToRelative(dx = 2.03f, dy = -5.63f)
                // c 0.06 -0.16 0.1 -0.32 0.15 -0.48
                curveToRelative(
                    dx1 = 0.06f,
                    dy1 = -0.16f,
                    dx2 = 0.1f,
                    dy2 = -0.32f,
                    dx3 = 0.15f,
                    dy3 = -0.48f,
                )
                // c 0.22 1.19 0.35 2.66 0.35 4.48
                curveToRelative(
                    dx1 = 0.22f,
                    dy1 = 1.19f,
                    dx2 = 0.35f,
                    dy2 = 2.66f,
                    dx3 = 0.35f,
                    dy3 = 4.48f,
                )
                // c 0 0.28 0.22 0.5 0.5 0.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.28f,
                    dx2 = 0.22f,
                    dy2 = 0.5f,
                    dx3 = 0.5f,
                    dy3 = 0.5f,
                )
                // s 0.5 -0.22 0.5 -0.5
                reflectiveCurveToRelative(
                    dx1 = 0.5f,
                    dy1 = -0.22f,
                    dx2 = 0.5f,
                    dy2 = -0.5f,
                )
                // c 0 -5.84 -1.37 -8.43 -2.6 -9.58z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -5.84f,
                    dx2 = -1.37f,
                    dy2 = -8.43f,
                    dx3 = -2.6f,
                    dy3 = -9.58f,
                )
                close()
            }
            // M5.82 15.37 S6.5 11.5 2.5 13.5 c-2 1 -1.06 2.92 0.36 3.98 1.04 0.77 2.53 0.6 3.33 -0.41 0.5 -0.63 0.67 -1.31 -0.38 -1.7Z
            path(
                fill = SolidColor(Color(0xFFDFE7ED)),
            ) {
                // M 5.82 15.37
                moveTo(x = 5.82f, y = 15.37f)
                // S 6.5 11.5 2.5 13.5
                reflectiveCurveTo(
                    x1 = 6.5f,
                    y1 = 11.5f,
                    x2 = 2.5f,
                    y2 = 13.5f,
                )
                // c -2 1 -1.06 2.92 0.36 3.98
                curveToRelative(
                    dx1 = -2.0f,
                    dy1 = 1.0f,
                    dx2 = -1.06f,
                    dy2 = 2.92f,
                    dx3 = 0.36f,
                    dy3 = 3.98f,
                )
                // c 1.04 0.77 2.53 0.6 3.33 -0.41
                curveToRelative(
                    dx1 = 1.04f,
                    dy1 = 0.77f,
                    dx2 = 2.53f,
                    dy2 = 0.6f,
                    dx3 = 3.33f,
                    dy3 = -0.41f,
                )
                // c 0.5 -0.63 0.67 -1.31 -0.38 -1.7z
                curveToRelative(
                    dx1 = 0.5f,
                    dy1 = -0.63f,
                    dx2 = 0.67f,
                    dy2 = -1.31f,
                    dx3 = -0.38f,
                    dy3 = -1.7f,
                )
                close()
            }
            // M10.38 4.3 s-2.86 3.97 -1.32 6.06 l1.26 0.23 s1.62 -2.02 0.06 -6.3Z
            path(
                fill = SolidColor(Color(0xFFBFCCD5)),
            ) {
                // M 10.38 4.3
                moveTo(x = 10.38f, y = 4.3f)
                // s -2.86 3.97 -1.32 6.06
                reflectiveCurveToRelative(
                    dx1 = -2.86f,
                    dy1 = 3.97f,
                    dx2 = -1.32f,
                    dy2 = 6.06f,
                )
                // l 1.26 0.23
                lineToRelative(dx = 1.26f, dy = 0.23f)
                // s 1.62 -2.02 0.06 -6.3z
                reflectiveCurveToRelative(
                    dx1 = 1.62f,
                    dy1 = -2.02f,
                    dx2 = 0.06f,
                    dy2 = -6.3f,
                )
                close()
            }
            // M9.76 8.82 c0.25 0.1 0.52 0.23 0.79 0.38 0.11 -0.74 0.08 -1.78 -0.43 -3.18 0 0 -0.88 1.26 -1.08 2.59 0.24 0.04 0.48 0.11 0.71 0.2Z M3.76 14.94 c0.13 -0.52 0.06 -0.98 -0.15 -1.04 s-0.5 0.32 -0.63 0.84 -0.06 0.98 0.15 1.04 0.5 -0.32 0.63 -0.84
            path(
                fill = SolidColor(Color(0xFF738695)),
            ) {
                // M 9.76 8.82
                moveTo(x = 9.76f, y = 8.82f)
                // c 0.25 0.1 0.52 0.23 0.79 0.38
                curveToRelative(
                    dx1 = 0.25f,
                    dy1 = 0.1f,
                    dx2 = 0.52f,
                    dy2 = 0.23f,
                    dx3 = 0.79f,
                    dy3 = 0.38f,
                )
                // c 0.11 -0.74 0.08 -1.78 -0.43 -3.18
                curveToRelative(
                    dx1 = 0.11f,
                    dy1 = -0.74f,
                    dx2 = 0.08f,
                    dy2 = -1.78f,
                    dx3 = -0.43f,
                    dy3 = -3.18f,
                )
                // c 0 0 -0.88 1.26 -1.08 2.59
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -0.88f,
                    dy2 = 1.26f,
                    dx3 = -1.08f,
                    dy3 = 2.59f,
                )
                // c 0.24 0.04 0.48 0.11 0.71 0.2z
                curveToRelative(
                    dx1 = 0.24f,
                    dy1 = 0.04f,
                    dx2 = 0.48f,
                    dy2 = 0.11f,
                    dx3 = 0.71f,
                    dy3 = 0.2f,
                )
                close()
                // M 3.76 14.94
                moveTo(x = 3.76f, y = 14.94f)
                // c 0.13 -0.52 0.06 -0.98 -0.15 -1.04
                curveToRelative(
                    dx1 = 0.13f,
                    dy1 = -0.52f,
                    dx2 = 0.06f,
                    dy2 = -0.98f,
                    dx3 = -0.15f,
                    dy3 = -1.04f,
                )
                // s -0.5 0.32 -0.63 0.84
                reflectiveCurveToRelative(
                    dx1 = -0.5f,
                    dy1 = 0.32f,
                    dx2 = -0.63f,
                    dy2 = 0.84f,
                )
                // s -0.06 0.98 0.15 1.04
                reflectiveCurveToRelative(
                    dx1 = -0.06f,
                    dy1 = 0.98f,
                    dx2 = 0.15f,
                    dy2 = 1.04f,
                )
                // s 0.5 -0.32 0.63 -0.84
                reflectiveCurveToRelative(
                    dx1 = 0.5f,
                    dy1 = -0.32f,
                    dx2 = 0.63f,
                    dy2 = -0.84f,
                )
            }
            // M7.2 12.82 c0.44 0 0.8 -0.36 0.8 -0.8 s-0.36 -0.8 -0.8 -0.8 -0.8 0.36 -0.8 0.8 0.36 0.8 0.8 0.8
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 7.2 12.82
                moveTo(x = 7.2f, y = 12.82f)
                // c 0.44 0 0.8 -0.36 0.8 -0.8
                curveToRelative(
                    dx1 = 0.44f,
                    dy1 = 0.0f,
                    dx2 = 0.8f,
                    dy2 = -0.36f,
                    dx3 = 0.8f,
                    dy3 = -0.8f,
                )
                // s -0.36 -0.8 -0.8 -0.8
                reflectiveCurveToRelative(
                    dx1 = -0.36f,
                    dy1 = -0.8f,
                    dx2 = -0.8f,
                    dy2 = -0.8f,
                )
                // s -0.8 0.36 -0.8 0.8
                reflectiveCurveToRelative(
                    dx1 = -0.8f,
                    dy1 = 0.36f,
                    dx2 = -0.8f,
                    dy2 = 0.8f,
                )
                // s 0.36 0.8 0.8 0.8
                reflectiveCurveToRelative(
                    dx1 = 0.36f,
                    dy1 = 0.8f,
                    dx2 = 0.8f,
                    dy2 = 0.8f,
                )
            }
            // M13.18 34.06 h1.89 c0.24 0 0.43 -0.19 0.43 -0.43 L15.5 33 h-2.65 l-0.1 0.55 c-0.05 0.27 0.15 0.51 0.42 0.51Z M27.28 33 l-0.12 0.54 c-0.06 0.27 0.15 0.53 0.42 0.53 h1.58 c0.2 0 0.37 -0.13 0.42 -0.32 l0.2 -0.74 h-2.5Z M33.49 21.82 c-0.98 0 -1.93 1.45 0 3.91 0 0 2.44 -3.92 0 -3.91
            path(
                fill = SolidColor(Color(0xFF738695)),
            ) {
                // M 13.18 34.06
                moveTo(x = 13.18f, y = 34.06f)
                // h 1.89
                horizontalLineToRelative(dx = 1.89f)
                // c 0.24 0 0.43 -0.19 0.43 -0.43
                curveToRelative(
                    dx1 = 0.24f,
                    dy1 = 0.0f,
                    dx2 = 0.43f,
                    dy2 = -0.19f,
                    dx3 = 0.43f,
                    dy3 = -0.43f,
                )
                // L 15.5 33
                lineTo(x = 15.5f, y = 33.0f)
                // h -2.65
                horizontalLineToRelative(dx = -2.65f)
                // l -0.1 0.55
                lineToRelative(dx = -0.1f, dy = 0.55f)
                // c -0.05 0.27 0.15 0.51 0.42 0.51z
                curveToRelative(
                    dx1 = -0.05f,
                    dy1 = 0.27f,
                    dx2 = 0.15f,
                    dy2 = 0.51f,
                    dx3 = 0.42f,
                    dy3 = 0.51f,
                )
                close()
                // M 27.28 33
                moveTo(x = 27.28f, y = 33.0f)
                // l -0.12 0.54
                lineToRelative(dx = -0.12f, dy = 0.54f)
                // c -0.06 0.27 0.15 0.53 0.42 0.53
                curveToRelative(
                    dx1 = -0.06f,
                    dy1 = 0.27f,
                    dx2 = 0.15f,
                    dy2 = 0.53f,
                    dx3 = 0.42f,
                    dy3 = 0.53f,
                )
                // h 1.58
                horizontalLineToRelative(dx = 1.58f)
                // c 0.2 0 0.37 -0.13 0.42 -0.32
                curveToRelative(
                    dx1 = 0.2f,
                    dy1 = 0.0f,
                    dx2 = 0.37f,
                    dy2 = -0.13f,
                    dx3 = 0.42f,
                    dy3 = -0.32f,
                )
                // l 0.2 -0.74
                lineToRelative(dx = 0.2f, dy = -0.74f)
                // h -2.5z
                horizontalLineToRelative(dx = -2.5f)
                close()
                // M 33.49 21.82
                moveTo(x = 33.49f, y = 21.82f)
                // c -0.98 0 -1.93 1.45 0 3.91
                curveToRelative(
                    dx1 = -0.98f,
                    dy1 = 0.0f,
                    dx2 = -1.93f,
                    dy2 = 1.45f,
                    dx3 = 0.0f,
                    dy3 = 3.91f,
                )
                // c 0 0 2.44 -3.92 0 -3.91
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 2.44f,
                    dy2 = -3.92f,
                    dx3 = 0.0f,
                    dy3 = -3.91f,
                )
            }
        }.build().also { _emoji1facf = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1facf: ImageVector? = null
