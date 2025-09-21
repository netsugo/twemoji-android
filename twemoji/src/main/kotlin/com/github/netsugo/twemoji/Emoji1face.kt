package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1face: ImageVector
    get() {
        val current = _emoji1face
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1face",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M0.75 8.93 s0.24 -3.25 3.01 -5.01 c0.67 -0.43 1.46 0.33 1.08 1.03 -0.82 1.47 -1.64 3.51 -1.12 5.2 0.1 0.32 0.54 0.34 0.65 0.03 0.25 -0.73 0.67 -1.83 1.28 -2.75 0.37 -0.56 1.26 -0.23 1.18 0.44 -0.12 0.96 -0.21 2.12 -0.11 2.99 0.07 0.64 0.84 0.93 1.31 0.49 0.3 -0.28 0.62 -0.66 0.83 -1.13 0.23 -0.5 0.96 -0.44 1.13 0.08 0.12 0.37 0.19 0.84 0.15 1.41 -0.05 0.85 0.36 1.66 1.08 2.1 l2.05 1.26 -1.15 0.94 -1.92 -1.28 c-0.63 -0.42 -1.42 -0.52 -2.12 -0.23 -2.31 0.93 -7.59 2.22 -7.31 -5.56Z M35.25 8.93 s-0.24 -3.25 -3.01 -5.01 c-0.67 -0.43 -1.46 0.33 -1.08 1.03 0.82 1.47 1.64 3.51 1.12 5.2 -0.1 0.32 -0.54 0.34 -0.65 0.03 -0.25 -0.73 -0.67 -1.83 -1.28 -2.75 -0.37 -0.56 -1.26 -0.23 -1.18 0.44 0.12 0.96 0.21 2.12 0.11 2.99 -0.07 0.64 -0.84 0.93 -1.31 0.49 -0.3 -0.28 -0.62 -0.66 -0.83 -1.13 -0.23 -0.5 -0.96 -0.44 -1.13 0.08 -0.12 0.37 -0.19 0.84 -0.15 1.41 0.05 0.85 -0.36 1.66 -1.08 2.1 l-2.05 1.26 1.15 0.94 1.92 -1.28 c0.63 -0.42 1.42 -0.52 2.12 -0.23 2.31 0.93 7.59 2.22 7.31 -5.56Z M19.52 9.46  L18.82 10.09 18.33 9.22 c-0.16 -0.29 -0.49 -0.29 -0.65 0 l-0.49 0.87 -0.7 -0.63 c-0.22 -0.2 -0.52 -0.07 -0.61 0.27 L15.01 13 h6 l-0.87 -3.27 c-0.09 -0.34 -0.39 -0.47 -0.61 -0.27Z
            path(
                fill = SolidColor(Color(0xFF6C1A0D)),
            ) {
                // M 0.75 8.93
                moveTo(x = 0.75f, y = 8.93f)
                // s 0.24 -3.25 3.01 -5.01
                reflectiveCurveToRelative(
                    dx1 = 0.24f,
                    dy1 = -3.25f,
                    dx2 = 3.01f,
                    dy2 = -5.01f,
                )
                // c 0.67 -0.43 1.46 0.33 1.08 1.03
                curveToRelative(
                    dx1 = 0.67f,
                    dy1 = -0.43f,
                    dx2 = 1.46f,
                    dy2 = 0.33f,
                    dx3 = 1.08f,
                    dy3 = 1.03f,
                )
                // c -0.82 1.47 -1.64 3.51 -1.12 5.2
                curveToRelative(
                    dx1 = -0.82f,
                    dy1 = 1.47f,
                    dx2 = -1.64f,
                    dy2 = 3.51f,
                    dx3 = -1.12f,
                    dy3 = 5.2f,
                )
                // c 0.1 0.32 0.54 0.34 0.65 0.03
                curveToRelative(
                    dx1 = 0.1f,
                    dy1 = 0.32f,
                    dx2 = 0.54f,
                    dy2 = 0.34f,
                    dx3 = 0.65f,
                    dy3 = 0.03f,
                )
                // c 0.25 -0.73 0.67 -1.83 1.28 -2.75
                curveToRelative(
                    dx1 = 0.25f,
                    dy1 = -0.73f,
                    dx2 = 0.67f,
                    dy2 = -1.83f,
                    dx3 = 1.28f,
                    dy3 = -2.75f,
                )
                // c 0.37 -0.56 1.26 -0.23 1.18 0.44
                curveToRelative(
                    dx1 = 0.37f,
                    dy1 = -0.56f,
                    dx2 = 1.26f,
                    dy2 = -0.23f,
                    dx3 = 1.18f,
                    dy3 = 0.44f,
                )
                // c -0.12 0.96 -0.21 2.12 -0.11 2.99
                curveToRelative(
                    dx1 = -0.12f,
                    dy1 = 0.96f,
                    dx2 = -0.21f,
                    dy2 = 2.12f,
                    dx3 = -0.11f,
                    dy3 = 2.99f,
                )
                // c 0.07 0.64 0.84 0.93 1.31 0.49
                curveToRelative(
                    dx1 = 0.07f,
                    dy1 = 0.64f,
                    dx2 = 0.84f,
                    dy2 = 0.93f,
                    dx3 = 1.31f,
                    dy3 = 0.49f,
                )
                // c 0.3 -0.28 0.62 -0.66 0.83 -1.13
                curveToRelative(
                    dx1 = 0.3f,
                    dy1 = -0.28f,
                    dx2 = 0.62f,
                    dy2 = -0.66f,
                    dx3 = 0.83f,
                    dy3 = -1.13f,
                )
                // c 0.23 -0.5 0.96 -0.44 1.13 0.08
                curveToRelative(
                    dx1 = 0.23f,
                    dy1 = -0.5f,
                    dx2 = 0.96f,
                    dy2 = -0.44f,
                    dx3 = 1.13f,
                    dy3 = 0.08f,
                )
                // c 0.12 0.37 0.19 0.84 0.15 1.41
                curveToRelative(
                    dx1 = 0.12f,
                    dy1 = 0.37f,
                    dx2 = 0.19f,
                    dy2 = 0.84f,
                    dx3 = 0.15f,
                    dy3 = 1.41f,
                )
                // c -0.05 0.85 0.36 1.66 1.08 2.1
                curveToRelative(
                    dx1 = -0.05f,
                    dy1 = 0.85f,
                    dx2 = 0.36f,
                    dy2 = 1.66f,
                    dx3 = 1.08f,
                    dy3 = 2.1f,
                )
                // l 2.05 1.26
                lineToRelative(dx = 2.05f, dy = 1.26f)
                // l -1.15 0.94
                lineToRelative(dx = -1.15f, dy = 0.94f)
                // l -1.92 -1.28
                lineToRelative(dx = -1.92f, dy = -1.28f)
                // c -0.63 -0.42 -1.42 -0.52 -2.12 -0.23
                curveToRelative(
                    dx1 = -0.63f,
                    dy1 = -0.42f,
                    dx2 = -1.42f,
                    dy2 = -0.52f,
                    dx3 = -2.12f,
                    dy3 = -0.23f,
                )
                // c -2.31 0.93 -7.59 2.22 -7.31 -5.56z
                curveToRelative(
                    dx1 = -2.31f,
                    dy1 = 0.93f,
                    dx2 = -7.59f,
                    dy2 = 2.22f,
                    dx3 = -7.31f,
                    dy3 = -5.56f,
                )
                close()
                // M 35.25 8.93
                moveTo(x = 35.25f, y = 8.93f)
                // s -0.24 -3.25 -3.01 -5.01
                reflectiveCurveToRelative(
                    dx1 = -0.24f,
                    dy1 = -3.25f,
                    dx2 = -3.01f,
                    dy2 = -5.01f,
                )
                // c -0.67 -0.43 -1.46 0.33 -1.08 1.03
                curveToRelative(
                    dx1 = -0.67f,
                    dy1 = -0.43f,
                    dx2 = -1.46f,
                    dy2 = 0.33f,
                    dx3 = -1.08f,
                    dy3 = 1.03f,
                )
                // c 0.82 1.47 1.64 3.51 1.12 5.2
                curveToRelative(
                    dx1 = 0.82f,
                    dy1 = 1.47f,
                    dx2 = 1.64f,
                    dy2 = 3.51f,
                    dx3 = 1.12f,
                    dy3 = 5.2f,
                )
                // c -0.1 0.32 -0.54 0.34 -0.65 0.03
                curveToRelative(
                    dx1 = -0.1f,
                    dy1 = 0.32f,
                    dx2 = -0.54f,
                    dy2 = 0.34f,
                    dx3 = -0.65f,
                    dy3 = 0.03f,
                )
                // c -0.25 -0.73 -0.67 -1.83 -1.28 -2.75
                curveToRelative(
                    dx1 = -0.25f,
                    dy1 = -0.73f,
                    dx2 = -0.67f,
                    dy2 = -1.83f,
                    dx3 = -1.28f,
                    dy3 = -2.75f,
                )
                // c -0.37 -0.56 -1.26 -0.23 -1.18 0.44
                curveToRelative(
                    dx1 = -0.37f,
                    dy1 = -0.56f,
                    dx2 = -1.26f,
                    dy2 = -0.23f,
                    dx3 = -1.18f,
                    dy3 = 0.44f,
                )
                // c 0.12 0.96 0.21 2.12 0.11 2.99
                curveToRelative(
                    dx1 = 0.12f,
                    dy1 = 0.96f,
                    dx2 = 0.21f,
                    dy2 = 2.12f,
                    dx3 = 0.11f,
                    dy3 = 2.99f,
                )
                // c -0.07 0.64 -0.84 0.93 -1.31 0.49
                curveToRelative(
                    dx1 = -0.07f,
                    dy1 = 0.64f,
                    dx2 = -0.84f,
                    dy2 = 0.93f,
                    dx3 = -1.31f,
                    dy3 = 0.49f,
                )
                // c -0.3 -0.28 -0.62 -0.66 -0.83 -1.13
                curveToRelative(
                    dx1 = -0.3f,
                    dy1 = -0.28f,
                    dx2 = -0.62f,
                    dy2 = -0.66f,
                    dx3 = -0.83f,
                    dy3 = -1.13f,
                )
                // c -0.23 -0.5 -0.96 -0.44 -1.13 0.08
                curveToRelative(
                    dx1 = -0.23f,
                    dy1 = -0.5f,
                    dx2 = -0.96f,
                    dy2 = -0.44f,
                    dx3 = -1.13f,
                    dy3 = 0.08f,
                )
                // c -0.12 0.37 -0.19 0.84 -0.15 1.41
                curveToRelative(
                    dx1 = -0.12f,
                    dy1 = 0.37f,
                    dx2 = -0.19f,
                    dy2 = 0.84f,
                    dx3 = -0.15f,
                    dy3 = 1.41f,
                )
                // c 0.05 0.85 -0.36 1.66 -1.08 2.1
                curveToRelative(
                    dx1 = 0.05f,
                    dy1 = 0.85f,
                    dx2 = -0.36f,
                    dy2 = 1.66f,
                    dx3 = -1.08f,
                    dy3 = 2.1f,
                )
                // l -2.05 1.26
                lineToRelative(dx = -2.05f, dy = 1.26f)
                // l 1.15 0.94
                lineToRelative(dx = 1.15f, dy = 0.94f)
                // l 1.92 -1.28
                lineToRelative(dx = 1.92f, dy = -1.28f)
                // c 0.63 -0.42 1.42 -0.52 2.12 -0.23
                curveToRelative(
                    dx1 = 0.63f,
                    dy1 = -0.42f,
                    dx2 = 1.42f,
                    dy2 = -0.52f,
                    dx3 = 2.12f,
                    dy3 = -0.23f,
                )
                // c 2.31 0.93 7.59 2.22 7.31 -5.56z
                curveToRelative(
                    dx1 = 2.31f,
                    dy1 = 0.93f,
                    dx2 = 7.59f,
                    dy2 = 2.22f,
                    dx3 = 7.31f,
                    dy3 = -5.56f,
                )
                close()
                // M 19.52 9.46
                moveTo(x = 19.52f, y = 9.46f)
                // L 18.82 10.09
                lineTo(x = 18.82f, y = 10.09f)
                // L 18.33 9.22
                lineTo(x = 18.33f, y = 9.22f)
                // c -0.16 -0.29 -0.49 -0.29 -0.65 0
                curveToRelative(
                    dx1 = -0.16f,
                    dy1 = -0.29f,
                    dx2 = -0.49f,
                    dy2 = -0.29f,
                    dx3 = -0.65f,
                    dy3 = 0.0f,
                )
                // l -0.49 0.87
                lineToRelative(dx = -0.49f, dy = 0.87f)
                // l -0.7 -0.63
                lineToRelative(dx = -0.7f, dy = -0.63f)
                // c -0.22 -0.2 -0.52 -0.07 -0.61 0.27
                curveToRelative(
                    dx1 = -0.22f,
                    dy1 = -0.2f,
                    dx2 = -0.52f,
                    dy2 = -0.07f,
                    dx3 = -0.61f,
                    dy3 = 0.27f,
                )
                // L 15.01 13
                lineTo(x = 15.01f, y = 13.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // l -0.87 -3.27
                lineToRelative(dx = -0.87f, dy = -3.27f)
                // c -0.09 -0.34 -0.39 -0.47 -0.61 -0.27z
                curveToRelative(
                    dx1 = -0.09f,
                    dy1 = -0.34f,
                    dx2 = -0.39f,
                    dy2 = -0.47f,
                    dx3 = -0.61f,
                    dy3 = -0.27f,
                )
                close()
            }
            // M13.15 15.06 s-2.37 -3.81 -0.72 -4.76 3.73 3.06 3.73 3.06z
            path(
                fill = SolidColor(Color(0xFF282F33)),
            ) {
                // M 13.15 15.06
                moveTo(x = 13.15f, y = 15.06f)
                // s -2.37 -3.81 -0.72 -4.76
                reflectiveCurveToRelative(
                    dx1 = -2.37f,
                    dy1 = -3.81f,
                    dx2 = -0.72f,
                    dy2 = -4.76f,
                )
                // s 3.73 3.06 3.73 3.06z
                reflectiveCurveToRelative(
                    dx1 = 3.73f,
                    dy1 = 3.06f,
                    dx2 = 3.73f,
                    dy2 = 3.06f,
                )
                close()
            }
            // m12.97 15.73  l-0.25 -0.41 c-0.18 -0.28 -1.71 -2.82 -1.31 -4.42 0.11 -0.46 0.38 -0.81 0.76 -1.04 0.39 -0.22 0.83 -0.27 1.27 -0.14 1.58 0.46 3 3.1 3.15 3.4 l0.22 0.43 -3.85 2.18Z M12.96 10.65 c-0.1 0 -0.2 0.03 -0.29 0.08 -0.15 0.09 -0.25 0.22 -0.3 0.42 -0.21 0.84 0.49 2.38 0.95 3.23 l2.15 -1.21 c-0.58 -0.98 -1.54 -2.26 -2.31 -2.48 a0.761 0.761 0 0 0 -0.21 -0.03Z
            path(
                fill = SolidColor(Color(0xFFC86349)),
            ) {
                // M 12.97 15.73
                moveTo(x = 12.97f, y = 15.73f)
                // l -0.25 -0.41
                lineToRelative(dx = -0.25f, dy = -0.41f)
                // c -0.18 -0.28 -1.71 -2.82 -1.31 -4.42
                curveToRelative(
                    dx1 = -0.18f,
                    dy1 = -0.28f,
                    dx2 = -1.71f,
                    dy2 = -2.82f,
                    dx3 = -1.31f,
                    dy3 = -4.42f,
                )
                // c 0.11 -0.46 0.38 -0.81 0.76 -1.04
                curveToRelative(
                    dx1 = 0.11f,
                    dy1 = -0.46f,
                    dx2 = 0.38f,
                    dy2 = -0.81f,
                    dx3 = 0.76f,
                    dy3 = -1.04f,
                )
                // c 0.39 -0.22 0.83 -0.27 1.27 -0.14
                curveToRelative(
                    dx1 = 0.39f,
                    dy1 = -0.22f,
                    dx2 = 0.83f,
                    dy2 = -0.27f,
                    dx3 = 1.27f,
                    dy3 = -0.14f,
                )
                // c 1.58 0.46 3 3.1 3.15 3.4
                curveToRelative(
                    dx1 = 1.58f,
                    dy1 = 0.46f,
                    dx2 = 3.0f,
                    dy2 = 3.1f,
                    dx3 = 3.15f,
                    dy3 = 3.4f,
                )
                // l 0.22 0.43
                lineToRelative(dx = 0.22f, dy = 0.43f)
                // l -3.85 2.18z
                lineToRelative(dx = -3.85f, dy = 2.18f)
                close()
                // M 12.96 10.65
                moveTo(x = 12.96f, y = 10.65f)
                // c -0.1 0 -0.2 0.03 -0.29 0.08
                curveToRelative(
                    dx1 = -0.1f,
                    dy1 = 0.0f,
                    dx2 = -0.2f,
                    dy2 = 0.03f,
                    dx3 = -0.29f,
                    dy3 = 0.08f,
                )
                // c -0.15 0.09 -0.25 0.22 -0.3 0.42
                curveToRelative(
                    dx1 = -0.15f,
                    dy1 = 0.09f,
                    dx2 = -0.25f,
                    dy2 = 0.22f,
                    dx3 = -0.3f,
                    dy3 = 0.42f,
                )
                // c -0.21 0.84 0.49 2.38 0.95 3.23
                curveToRelative(
                    dx1 = -0.21f,
                    dy1 = 0.84f,
                    dx2 = 0.49f,
                    dy2 = 2.38f,
                    dx3 = 0.95f,
                    dy3 = 3.23f,
                )
                // l 2.15 -1.21
                lineToRelative(dx = 2.15f, dy = -1.21f)
                // c -0.58 -0.98 -1.54 -2.26 -2.31 -2.48
                curveToRelative(
                    dx1 = -0.58f,
                    dy1 = -0.98f,
                    dx2 = -1.54f,
                    dy2 = -2.26f,
                    dx3 = -2.31f,
                    dy3 = -2.48f,
                )
                // a 0.761 0.761 0 0 0 -0.21 -0.03z
                arcToRelative(
                    a = 0.761f,
                    b = 0.761f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.21f,
                    dy1 = -0.03f,
                )
                close()
            }
            // M22.85 15.06 s2.37 -3.81 0.72 -4.76 -3.73 3.06 -3.73 3.06z
            path(
                fill = SolidColor(Color(0xFF282F33)),
            ) {
                // M 22.85 15.06
                moveTo(x = 22.85f, y = 15.06f)
                // s 2.37 -3.81 0.72 -4.76
                reflectiveCurveToRelative(
                    dx1 = 2.37f,
                    dy1 = -3.81f,
                    dx2 = 0.72f,
                    dy2 = -4.76f,
                )
                // s -3.73 3.06 -3.73 3.06z
                reflectiveCurveToRelative(
                    dx1 = -3.73f,
                    dy1 = 3.06f,
                    dx2 = -3.73f,
                    dy2 = 3.06f,
                )
                close()
            }
            // m23.03 15.73  l-3.85 -2.18 0.22 -0.43 c0.16 -0.3 1.57 -2.94 3.15 -3.4 0.45 -0.13 0.89 -0.08 1.28 0.14 s0.65 0.58 0.76 1.04 c0.4 1.6 -1.14 4.14 -1.31 4.42 l-0.25 0.41Z M20.53 13.17  L22.68 14.38 c0.47 -0.86 1.16 -2.39 0.95 -3.23 -0.05 -0.19 -0.14 -0.33 -0.29 -0.41 -0.15 -0.09 -0.31 -0.1 -0.5 -0.05 -0.83 0.24 -1.81 1.64 -2.31 2.48Z
            path(
                fill = SolidColor(Color(0xFFC86349)),
            ) {
                // M 23.03 15.73
                moveTo(x = 23.03f, y = 15.73f)
                // l -3.85 -2.18
                lineToRelative(dx = -3.85f, dy = -2.18f)
                // l 0.22 -0.43
                lineToRelative(dx = 0.22f, dy = -0.43f)
                // c 0.16 -0.3 1.57 -2.94 3.15 -3.4
                curveToRelative(
                    dx1 = 0.16f,
                    dy1 = -0.3f,
                    dx2 = 1.57f,
                    dy2 = -2.94f,
                    dx3 = 3.15f,
                    dy3 = -3.4f,
                )
                // c 0.45 -0.13 0.89 -0.08 1.28 0.14
                curveToRelative(
                    dx1 = 0.45f,
                    dy1 = -0.13f,
                    dx2 = 0.89f,
                    dy2 = -0.08f,
                    dx3 = 1.28f,
                    dy3 = 0.14f,
                )
                // s 0.65 0.58 0.76 1.04
                reflectiveCurveToRelative(
                    dx1 = 0.65f,
                    dy1 = 0.58f,
                    dx2 = 0.76f,
                    dy2 = 1.04f,
                )
                // c 0.4 1.6 -1.14 4.14 -1.31 4.42
                curveToRelative(
                    dx1 = 0.4f,
                    dy1 = 1.6f,
                    dx2 = -1.14f,
                    dy2 = 4.14f,
                    dx3 = -1.31f,
                    dy3 = 4.42f,
                )
                // l -0.25 0.41z
                lineToRelative(dx = -0.25f, dy = 0.41f)
                close()
                // M 20.53 13.17
                moveTo(x = 20.53f, y = 13.17f)
                // L 22.68 14.38
                lineTo(x = 22.68f, y = 14.38f)
                // c 0.47 -0.86 1.16 -2.39 0.95 -3.23
                curveToRelative(
                    dx1 = 0.47f,
                    dy1 = -0.86f,
                    dx2 = 1.16f,
                    dy2 = -2.39f,
                    dx3 = 0.95f,
                    dy3 = -3.23f,
                )
                // c -0.05 -0.19 -0.14 -0.33 -0.29 -0.41
                curveToRelative(
                    dx1 = -0.05f,
                    dy1 = -0.19f,
                    dx2 = -0.14f,
                    dy2 = -0.33f,
                    dx3 = -0.29f,
                    dy3 = -0.41f,
                )
                // c -0.15 -0.09 -0.31 -0.1 -0.5 -0.05
                curveToRelative(
                    dx1 = -0.15f,
                    dy1 = -0.09f,
                    dx2 = -0.31f,
                    dy2 = -0.1f,
                    dx3 = -0.5f,
                    dy3 = -0.05f,
                )
                // c -0.83 0.24 -1.81 1.64 -2.31 2.48z
                curveToRelative(
                    dx1 = -0.83f,
                    dy1 = 0.24f,
                    dx2 = -1.81f,
                    dy2 = 1.64f,
                    dx3 = -2.31f,
                    dy3 = 2.48f,
                )
                close()
            }
            // M18 30 m-2.5 0 a2.5 2.5 0 1 1 5 0 a2.5 2.5 0 1 1 -5 0
            path(
                fill = SolidColor(Color(0xFF282F33)),
            ) {
                // M 18 30
                moveTo(x = 18.0f, y = 30.0f)
                // m -2.5 0
                moveToRelative(dx = -2.5f, dy = 0.0f)
                // a 2.5 2.5 0 1 1 5 0
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // a 2.5 2.5 0 1 1 -5 0
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -5.0f,
                    dy1 = 0.0f,
                )
            }
            // M18 33 c-1.65 0 -3 -1.35 -3 -3 s1.35 -3 3 -3 3 1.35 3 3 -1.35 3 -3 3 m0 -5 c-1.1 0 -2 0.9 -2 2 s0.9 2 2 2 2 -0.9 2 -2 -0.9 -2 -2 -2
            path(
                fill = SolidColor(Color(0xFFC86349)),
            ) {
                // M 18 33
                moveTo(x = 18.0f, y = 33.0f)
                // c -1.65 0 -3 -1.35 -3 -3
                curveToRelative(
                    dx1 = -1.65f,
                    dy1 = 0.0f,
                    dx2 = -3.0f,
                    dy2 = -1.35f,
                    dx3 = -3.0f,
                    dy3 = -3.0f,
                )
                // s 1.35 -3 3 -3
                reflectiveCurveToRelative(
                    dx1 = 1.35f,
                    dy1 = -3.0f,
                    dx2 = 3.0f,
                    dy2 = -3.0f,
                )
                // s 3 1.35 3 3
                reflectiveCurveToRelative(
                    dx1 = 3.0f,
                    dy1 = 1.35f,
                    dx2 = 3.0f,
                    dy2 = 3.0f,
                )
                // s -1.35 3 -3 3
                reflectiveCurveToRelative(
                    dx1 = -1.35f,
                    dy1 = 3.0f,
                    dx2 = -3.0f,
                    dy2 = 3.0f,
                )
                // m 0 -5
                moveToRelative(dx = 0.0f, dy = -5.0f)
                // c -1.1 0 -2 0.9 -2 2
                curveToRelative(
                    dx1 = -1.1f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = 0.9f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // s 0.9 2 2 2
                reflectiveCurveToRelative(
                    dx1 = 0.9f,
                    dy1 = 2.0f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                )
                // s 2 -0.9 2 -2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = -0.9f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // s -0.9 -2 -2 -2
                reflectiveCurveToRelative(
                    dx1 = -0.9f,
                    dy1 = -2.0f,
                    dx2 = -2.0f,
                    dy2 = -2.0f,
                )
            }
            // M25 17.5 c0 -3.31 -3.13 -6 -7 -6 s-7 2.69 -7 6 c0 1.2 0.41 2.32 1.13 3.26 0.78 1.02 1 2.37 0.76 3.64 -0.25 1.33 -0.39 2.46 -0.39 3.11 0 2.76 2.46 3 5.5 3 s5.5 -0.24 5.5 -3 c0 -0.65 -0.14 -1.77 -0.39 -3.11 -0.24 -1.26 -0.02 -2.61 0.76 -3.64 0.71 -0.94 1.13 -2.05 1.13 -3.26
            path(
                fill = SolidColor(Color(0xFFC86349)),
            ) {
                // M 25 17.5
                moveTo(x = 25.0f, y = 17.5f)
                // c 0 -3.31 -3.13 -6 -7 -6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.31f,
                    dx2 = -3.13f,
                    dy2 = -6.0f,
                    dx3 = -7.0f,
                    dy3 = -6.0f,
                )
                // s -7 2.69 -7 6
                reflectiveCurveToRelative(
                    dx1 = -7.0f,
                    dy1 = 2.69f,
                    dx2 = -7.0f,
                    dy2 = 6.0f,
                )
                // c 0 1.2 0.41 2.32 1.13 3.26
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.2f,
                    dx2 = 0.41f,
                    dy2 = 2.32f,
                    dx3 = 1.13f,
                    dy3 = 3.26f,
                )
                // c 0.78 1.02 1 2.37 0.76 3.64
                curveToRelative(
                    dx1 = 0.78f,
                    dy1 = 1.02f,
                    dx2 = 1.0f,
                    dy2 = 2.37f,
                    dx3 = 0.76f,
                    dy3 = 3.64f,
                )
                // c -0.25 1.33 -0.39 2.46 -0.39 3.11
                curveToRelative(
                    dx1 = -0.25f,
                    dy1 = 1.33f,
                    dx2 = -0.39f,
                    dy2 = 2.46f,
                    dx3 = -0.39f,
                    dy3 = 3.11f,
                )
                // c 0 2.76 2.46 3 5.5 3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.76f,
                    dx2 = 2.46f,
                    dy2 = 3.0f,
                    dx3 = 5.5f,
                    dy3 = 3.0f,
                )
                // s 5.5 -0.24 5.5 -3
                reflectiveCurveToRelative(
                    dx1 = 5.5f,
                    dy1 = -0.24f,
                    dx2 = 5.5f,
                    dy2 = -3.0f,
                )
                // c 0 -0.65 -0.14 -1.77 -0.39 -3.11
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.65f,
                    dx2 = -0.14f,
                    dy2 = -1.77f,
                    dx3 = -0.39f,
                    dy3 = -3.11f,
                )
                // c -0.24 -1.26 -0.02 -2.61 0.76 -3.64
                curveToRelative(
                    dx1 = -0.24f,
                    dy1 = -1.26f,
                    dx2 = -0.02f,
                    dy2 = -2.61f,
                    dx3 = 0.76f,
                    dy3 = -3.64f,
                )
                // c 0.71 -0.94 1.13 -2.05 1.13 -3.26
                curveToRelative(
                    dx1 = 0.71f,
                    dy1 = -0.94f,
                    dx2 = 1.13f,
                    dy2 = -2.05f,
                    dx3 = 1.13f,
                    dy3 = -3.26f,
                )
            }
            // M14.4 20.01 s0 -1.03 1.03 -1.03 1.03 1.03 1.03 1.03 v1.03 s0 1.03 -1.03 1.03 -1.03 -1.03 -1.03 -1.03 v-1.03Z M19.55 20.01 s0 -1.03 1.03 -1.03 1.03 1.03 1.03 1.03 v1.03 s0 1.03 -1.03 1.03 -1.03 -1.03 -1.03 -1.03z
            path(
                fill = SolidColor(Color(0xFF262B2B)),
            ) {
                // M 14.4 20.01
                moveTo(x = 14.4f, y = 20.01f)
                // s 0 -1.03 1.03 -1.03
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.03f,
                    dx2 = 1.03f,
                    dy2 = -1.03f,
                )
                // s 1.03 1.03 1.03 1.03
                reflectiveCurveToRelative(
                    dx1 = 1.03f,
                    dy1 = 1.03f,
                    dx2 = 1.03f,
                    dy2 = 1.03f,
                )
                // v 1.03
                verticalLineToRelative(dy = 1.03f)
                // s 0 1.03 -1.03 1.03
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.03f,
                    dx2 = -1.03f,
                    dy2 = 1.03f,
                )
                // s -1.03 -1.03 -1.03 -1.03
                reflectiveCurveToRelative(
                    dx1 = -1.03f,
                    dy1 = -1.03f,
                    dx2 = -1.03f,
                    dy2 = -1.03f,
                )
                // v -1.03z
                verticalLineToRelative(dy = -1.03f)
                close()
                // M 19.55 20.01
                moveTo(x = 19.55f, y = 20.01f)
                // s 0 -1.03 1.03 -1.03
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.03f,
                    dx2 = 1.03f,
                    dy2 = -1.03f,
                )
                // s 1.03 1.03 1.03 1.03
                reflectiveCurveToRelative(
                    dx1 = 1.03f,
                    dy1 = 1.03f,
                    dx2 = 1.03f,
                    dy2 = 1.03f,
                )
                // v 1.03
                verticalLineToRelative(dy = 1.03f)
                // s 0 1.03 -1.03 1.03
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.03f,
                    dx2 = -1.03f,
                    dy2 = 1.03f,
                )
                // s -1.03 -1.03 -1.03 -1.03z
                reflectiveCurveToRelative(
                    dx1 = -1.03f,
                    dy1 = -1.03f,
                    dx2 = -1.03f,
                    dy2 = -1.03f,
                )
                close()
            }
            // M16.06 28.03 c0.36 -0.09 0.51 -0.76 0.33 -1.49 s-0.63 -1.25 -1 -1.15 -0.51 0.76 -0.33 1.49 0.63 1.25 1 1.15Z M20.92 26.87 c0.19 -0.73 0.04 -1.4 -0.33 -1.49 s-0.81 0.42 -1 1.15 -0.04 1.4 0.33 1.49 0.81 -0.42 1 -1.15
            path(
                fill = SolidColor(Color(0xFF6C1A0D)),
            ) {
                // M 16.06 28.03
                moveTo(x = 16.06f, y = 28.03f)
                // c 0.36 -0.09 0.51 -0.76 0.33 -1.49
                curveToRelative(
                    dx1 = 0.36f,
                    dy1 = -0.09f,
                    dx2 = 0.51f,
                    dy2 = -0.76f,
                    dx3 = 0.33f,
                    dy3 = -1.49f,
                )
                // s -0.63 -1.25 -1 -1.15
                reflectiveCurveToRelative(
                    dx1 = -0.63f,
                    dy1 = -1.25f,
                    dx2 = -1.0f,
                    dy2 = -1.15f,
                )
                // s -0.51 0.76 -0.33 1.49
                reflectiveCurveToRelative(
                    dx1 = -0.51f,
                    dy1 = 0.76f,
                    dx2 = -0.33f,
                    dy2 = 1.49f,
                )
                // s 0.63 1.25 1 1.15z
                reflectiveCurveToRelative(
                    dx1 = 0.63f,
                    dy1 = 1.25f,
                    dx2 = 1.0f,
                    dy2 = 1.15f,
                )
                close()
                // M 20.92 26.87
                moveTo(x = 20.92f, y = 26.87f)
                // c 0.19 -0.73 0.04 -1.4 -0.33 -1.49
                curveToRelative(
                    dx1 = 0.19f,
                    dy1 = -0.73f,
                    dx2 = 0.04f,
                    dy2 = -1.4f,
                    dx3 = -0.33f,
                    dy3 = -1.49f,
                )
                // s -0.81 0.42 -1 1.15
                reflectiveCurveToRelative(
                    dx1 = -0.81f,
                    dy1 = 0.42f,
                    dx2 = -1.0f,
                    dy2 = 1.15f,
                )
                // s -0.04 1.4 0.33 1.49
                reflectiveCurveToRelative(
                    dx1 = -0.04f,
                    dy1 = 1.4f,
                    dx2 = 0.33f,
                    dy2 = 1.49f,
                )
                // s 0.81 -0.42 1 -1.15
                reflectiveCurveToRelative(
                    dx1 = 0.81f,
                    dy1 = -0.42f,
                    dx2 = 1.0f,
                    dy2 = -1.15f,
                )
            }
        }.build().also { _emoji1face = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1face: ImageVector? = null
