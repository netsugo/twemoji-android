package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1faad: ImageVector
    get() {
        val current = _emoji1faad
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1faad",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // m18 28  l17.08 -10.2 c0.42 -0.25 0.52 -0.84 0.19 -1.2 C30.98 11.94 24.84 9.01 18 9.01 S5.02 11.93 0.73 16.59 c-0.33 0.36 -0.24 0.95 0.19 1.2 L18 27.99Z
            path(
                fill = SolidColor(Color(0xFFE80040)),
            ) {
                // M 18 28
                moveTo(x = 18.0f, y = 28.0f)
                // l 17.08 -10.2
                lineToRelative(dx = 17.08f, dy = -10.2f)
                // c 0.42 -0.25 0.52 -0.84 0.19 -1.2
                curveToRelative(
                    dx1 = 0.42f,
                    dy1 = -0.25f,
                    dx2 = 0.52f,
                    dy2 = -0.84f,
                    dx3 = 0.19f,
                    dy3 = -1.2f,
                )
                // C 30.98 11.94 24.84 9.01 18 9.01
                curveTo(
                    x1 = 30.98f,
                    y1 = 11.94f,
                    x2 = 24.84f,
                    y2 = 9.01f,
                    x3 = 18.0f,
                    y3 = 9.01f,
                )
                // S 5.02 11.93 0.73 16.59
                reflectiveCurveTo(
                    x1 = 5.02f,
                    y1 = 11.93f,
                    x2 = 0.73f,
                    y2 = 16.59f,
                )
                // c -0.33 0.36 -0.24 0.95 0.19 1.2
                curveToRelative(
                    dx1 = -0.33f,
                    dy1 = 0.36f,
                    dx2 = -0.24f,
                    dy2 = 0.95f,
                    dx3 = 0.19f,
                    dy3 = 1.2f,
                )
                // L 18 27.99z
                lineTo(x = 18.0f, y = 27.99f)
                close()
            }
            // m18 25.79  l0.03 -0.05 0.47 -1.71 L18.5 9.01 c-0.17 0 -0.33 -0.01 -0.5 -0.01 s-0.33 0 -0.5 0.01 v15.02 l0.47 1.71z M17.19 27.05  L17.13 27.15 17.36 27.3 17.33 27.2z M20.18 24.26  L28.43 11.45 c-0.3 -0.15 -0.6 -0.3 -0.91 -0.43 l-7.68 11.93 -0.58 2.12 0.92 -0.81Z
            path(
                fill = SolidColor(Color(0xFFA80018)),
            ) {
                // M 18 25.79
                moveTo(x = 18.0f, y = 25.79f)
                // l 0.03 -0.05
                lineToRelative(dx = 0.03f, dy = -0.05f)
                // l 0.47 -1.71
                lineToRelative(dx = 0.47f, dy = -1.71f)
                // L 18.5 9.01
                lineTo(x = 18.5f, y = 9.01f)
                // c -0.17 0 -0.33 -0.01 -0.5 -0.01
                curveToRelative(
                    dx1 = -0.17f,
                    dy1 = 0.0f,
                    dx2 = -0.33f,
                    dy2 = -0.01f,
                    dx3 = -0.5f,
                    dy3 = -0.01f,
                )
                // s -0.33 0 -0.5 0.01
                reflectiveCurveToRelative(
                    dx1 = -0.33f,
                    dy1 = 0.0f,
                    dx2 = -0.5f,
                    dy2 = 0.01f,
                )
                // v 15.02
                verticalLineToRelative(dy = 15.02f)
                // l 0.47 1.71z
                lineToRelative(dx = 0.47f, dy = 1.71f)
                close()
                // M 17.19 27.05
                moveTo(x = 17.19f, y = 27.05f)
                // L 17.13 27.15
                lineTo(x = 17.13f, y = 27.15f)
                // L 17.36 27.3
                lineTo(x = 17.36f, y = 27.3f)
                // L 17.33 27.2z
                lineTo(x = 17.33f, y = 27.2f)
                close()
                // M 20.18 24.26
                moveTo(x = 20.18f, y = 24.26f)
                // L 28.43 11.45
                lineTo(x = 28.43f, y = 11.45f)
                // c -0.3 -0.15 -0.6 -0.3 -0.91 -0.43
                curveToRelative(
                    dx1 = -0.3f,
                    dy1 = -0.15f,
                    dx2 = -0.6f,
                    dy2 = -0.3f,
                    dx3 = -0.91f,
                    dy3 = -0.43f,
                )
                // l -7.68 11.93
                lineToRelative(dx = -7.68f, dy = 11.93f)
                // l -0.58 2.12
                lineToRelative(dx = -0.58f, dy = 2.12f)
                // l 0.92 -0.81z
                lineToRelative(dx = 0.92f, dy = -0.81f)
                close()
            }
            // m18.01 25.81  l0.02 -0.07 -0.03 0.05z M18.77 26.82  L32.92 14.37 c-0.26 -0.22 -0.53 -0.43 -0.8 -0.63 L20.17 24.25 l-0.92 0.81 -0.48 1.75Z M17.23 26.85  L17.11 26.96 17.19 27.05 17.33 27.2z M18.44 27.47  L18.5 27.7 18.54 27.68 18.64 27.3 18.51 27.38z
            path(
                fill = SolidColor(Color(0xFFA80018)),
            ) {
                // M 18.01 25.81
                moveTo(x = 18.01f, y = 25.81f)
                // l 0.02 -0.07
                lineToRelative(dx = 0.02f, dy = -0.07f)
                // l -0.03 0.05z
                lineToRelative(dx = -0.03f, dy = 0.05f)
                close()
                // M 18.77 26.82
                moveTo(x = 18.77f, y = 26.82f)
                // L 32.92 14.37
                lineTo(x = 32.92f, y = 14.37f)
                // c -0.26 -0.22 -0.53 -0.43 -0.8 -0.63
                curveToRelative(
                    dx1 = -0.26f,
                    dy1 = -0.22f,
                    dx2 = -0.53f,
                    dy2 = -0.43f,
                    dx3 = -0.8f,
                    dy3 = -0.63f,
                )
                // L 20.17 24.25
                lineTo(x = 20.17f, y = 24.25f)
                // l -0.92 0.81
                lineToRelative(dx = -0.92f, dy = 0.81f)
                // l -0.48 1.75z
                lineToRelative(dx = -0.48f, dy = 1.75f)
                close()
                // M 17.23 26.85
                moveTo(x = 17.23f, y = 26.85f)
                // L 17.11 26.96
                lineTo(x = 17.11f, y = 26.96f)
                // L 17.19 27.05
                lineTo(x = 17.19f, y = 27.05f)
                // L 17.33 27.2z
                lineTo(x = 17.33f, y = 27.2f)
                close()
                // M 18.44 27.47
                moveTo(x = 18.44f, y = 27.47f)
                // L 18.5 27.7
                lineTo(x = 18.5f, y = 27.7f)
                // L 18.54 27.68
                lineTo(x = 18.54f, y = 27.68f)
                // L 18.64 27.3
                lineTo(x = 18.64f, y = 27.3f)
                // L 18.51 27.38z
                lineTo(x = 18.51f, y = 27.38f)
                close()
            }
            // m19.25 25.07  l0.58 -2.12 3.63 -13.3 c-0.32 -0.08 -0.65 -0.15 -0.98 -0.21 L18.5 24.03 l-0.47 1.71 -0.02 0.07 0.55 0.86 0.2 0.18 v-0.03z M16.17 22.95 L8.49 11.02 c-0.31 0.14 -0.61 0.28 -0.91 0.43 l8.25 12.81 0.92 0.81 -0.58 -2.12Z
            path(
                fill = SolidColor(Color(0xFFA80018)),
            ) {
                // M 19.25 25.07
                moveTo(x = 19.25f, y = 25.07f)
                // l 0.58 -2.12
                lineToRelative(dx = 0.58f, dy = -2.12f)
                // l 3.63 -13.3
                lineToRelative(dx = 3.63f, dy = -13.3f)
                // c -0.32 -0.08 -0.65 -0.15 -0.98 -0.21
                curveToRelative(
                    dx1 = -0.32f,
                    dy1 = -0.08f,
                    dx2 = -0.65f,
                    dy2 = -0.15f,
                    dx3 = -0.98f,
                    dy3 = -0.21f,
                )
                // L 18.5 24.03
                lineTo(x = 18.5f, y = 24.03f)
                // l -0.47 1.71
                lineToRelative(dx = -0.47f, dy = 1.71f)
                // l -0.02 0.07
                lineToRelative(dx = -0.02f, dy = 0.07f)
                // l 0.55 0.86
                lineToRelative(dx = 0.55f, dy = 0.86f)
                // l 0.2 0.18
                lineToRelative(dx = 0.2f, dy = 0.18f)
                // v -0.03z
                verticalLineToRelative(dy = -0.03f)
                close()
                // M 16.17 22.95
                moveTo(x = 16.17f, y = 22.95f)
                // L 8.49 11.02
                lineTo(x = 8.49f, y = 11.02f)
                // c -0.31 0.14 -0.61 0.28 -0.91 0.43
                curveToRelative(
                    dx1 = -0.31f,
                    dy1 = 0.14f,
                    dx2 = -0.61f,
                    dy2 = 0.28f,
                    dx3 = -0.91f,
                    dy3 = 0.43f,
                )
                // l 8.25 12.81
                lineToRelative(dx = 8.25f, dy = 12.81f)
                // l 0.92 0.81
                lineToRelative(dx = 0.92f, dy = 0.81f)
                // l -0.58 -2.12z
                lineToRelative(dx = -0.58f, dy = -2.12f)
                close()
            }
            // m17.97 25.74  l0.14 0.53 0.46 0.4 -0.56 -0.86 -0.01 -0.02z M18.51 27.38  L18.64 27.3 18.87 27.15 18.81 27.05z
            path(
                fill = SolidColor(Color(0xFFA80018)),
            ) {
                // M 17.97 25.74
                moveTo(x = 17.97f, y = 25.74f)
                // l 0.14 0.53
                lineToRelative(dx = 0.14f, dy = 0.53f)
                // l 0.46 0.4
                lineToRelative(dx = 0.46f, dy = 0.4f)
                // l -0.56 -0.86
                lineToRelative(dx = -0.56f, dy = -0.86f)
                // l -0.01 -0.02z
                lineToRelative(dx = -0.01f, dy = -0.02f)
                close()
                // M 18.51 27.38
                moveTo(x = 18.51f, y = 27.38f)
                // L 18.64 27.3
                lineTo(x = 18.64f, y = 27.3f)
                // L 18.87 27.15
                lineTo(x = 18.87f, y = 27.15f)
                // L 18.81 27.05z
                lineTo(x = 18.81f, y = 27.05f)
                close()
            }
            // m18.57 26.67  l-0.46 -0.4 0.33 1.2 0.07 -0.09 0.3 -0.33 0.08 -0.09 -0.12 -0.11z M16.75 25.07  L15.83 24.26 L3.87 13.75 c-0.27 0.2 -0.54 0.41 -0.8 0.63 l14.15 12.45 -0.48 -1.75Z
            path(
                fill = SolidColor(Color(0xFFA80018)),
            ) {
                // M 18.57 26.67
                moveTo(x = 18.57f, y = 26.67f)
                // l -0.46 -0.4
                lineToRelative(dx = -0.46f, dy = -0.4f)
                // l 0.33 1.2
                lineToRelative(dx = 0.33f, dy = 1.2f)
                // l 0.07 -0.09
                lineToRelative(dx = 0.07f, dy = -0.09f)
                // l 0.3 -0.33
                lineToRelative(dx = 0.3f, dy = -0.33f)
                // l 0.08 -0.09
                lineToRelative(dx = 0.08f, dy = -0.09f)
                // l -0.12 -0.11z
                lineToRelative(dx = -0.12f, dy = -0.11f)
                close()
                // M 16.75 25.07
                moveTo(x = 16.75f, y = 25.07f)
                // L 15.83 24.26
                lineTo(x = 15.83f, y = 24.26f)
                // L 3.87 13.75
                lineTo(x = 3.87f, y = 13.75f)
                // c -0.27 0.2 -0.54 0.41 -0.8 0.63
                curveToRelative(
                    dx1 = -0.27f,
                    dy1 = 0.2f,
                    dx2 = -0.54f,
                    dy2 = 0.41f,
                    dx3 = -0.8f,
                    dy3 = 0.63f,
                )
                // l 14.15 12.45
                lineToRelative(dx = 14.15f, dy = 12.45f)
                // l -0.48 -1.75z
                lineToRelative(dx = -0.48f, dy = -1.75f)
                close()
            }
            // m18.44 27.47  l-0.33 -1.19 -0.14 -0.53 -0.47 -1.71 -3.98 -14.59 c-0.33 0.06 -0.66 0.13 -0.98 0.21 l3.63 13.3 0.58 2.12 0.48 1.75 v0.03 l0.1 0.35 0.03 0.09 0.1 0.38 0.54 0.32 0.5 -0.3 -0.06 -0.23Z
            path(
                fill = SolidColor(Color(0xFFA80018)),
            ) {
                // M 18.44 27.47
                moveTo(x = 18.44f, y = 27.47f)
                // l -0.33 -1.19
                lineToRelative(dx = -0.33f, dy = -1.19f)
                // l -0.14 -0.53
                lineToRelative(dx = -0.14f, dy = -0.53f)
                // l -0.47 -1.71
                lineToRelative(dx = -0.47f, dy = -1.71f)
                // l -3.98 -14.59
                lineToRelative(dx = -3.98f, dy = -14.59f)
                // c -0.33 0.06 -0.66 0.13 -0.98 0.21
                curveToRelative(
                    dx1 = -0.33f,
                    dy1 = 0.06f,
                    dx2 = -0.66f,
                    dy2 = 0.13f,
                    dx3 = -0.98f,
                    dy3 = 0.21f,
                )
                // l 3.63 13.3
                lineToRelative(dx = 3.63f, dy = 13.3f)
                // l 0.58 2.12
                lineToRelative(dx = 0.58f, dy = 2.12f)
                // l 0.48 1.75
                lineToRelative(dx = 0.48f, dy = 1.75f)
                // v 0.03
                verticalLineToRelative(dy = 0.03f)
                // l 0.1 0.35
                lineToRelative(dx = 0.1f, dy = 0.35f)
                // l 0.03 0.09
                lineToRelative(dx = 0.03f, dy = 0.09f)
                // l 0.1 0.38
                lineToRelative(dx = 0.1f, dy = 0.38f)
                // l 0.54 0.32
                lineToRelative(dx = 0.54f, dy = 0.32f)
                // l 0.5 -0.3
                lineToRelative(dx = 0.5f, dy = -0.3f)
                // l -0.06 -0.23z
                lineToRelative(dx = -0.06f, dy = -0.23f)
                close()
            }
            // m18 28  l6.59 -3.94 a8.628 8.628 0 0 0 -13.18 0z
            path(
                fill = SolidColor(Color(0xFFDE9A7E)),
            ) {
                // M 18 28
                moveTo(x = 18.0f, y = 28.0f)
                // l 6.59 -3.94
                lineToRelative(dx = 6.59f, dy = -3.94f)
                // a 8.628 8.628 0 0 0 -13.18 0z
                arcToRelative(
                    a = 8.628f,
                    b = 8.628f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -13.18f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M12.19 23.95 c1.53 -1.56 3.62 -2.45 5.81 -2.45 s4.28 0.88 5.81 2.45 L18 27.42 l-5.81 -3.47Z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 12.19 23.95
                moveTo(x = 12.19f, y = 23.95f)
                // c 1.53 -1.56 3.62 -2.45 5.81 -2.45
                curveToRelative(
                    dx1 = 1.53f,
                    dy1 = -1.56f,
                    dx2 = 3.62f,
                    dy2 = -2.45f,
                    dx3 = 5.81f,
                    dy3 = -2.45f,
                )
                // s 4.28 0.88 5.81 2.45
                reflectiveCurveToRelative(
                    dx1 = 4.28f,
                    dy1 = 0.88f,
                    dx2 = 5.81f,
                    dy2 = 2.45f,
                )
                // L 18 27.42
                lineTo(x = 18.0f, y = 27.42f)
                // l -5.81 -3.47z
                lineToRelative(dx = -5.81f, dy = -3.47f)
                close()
            }
            // m19.52 27.09  l5.07 -3.03 a8.628 8.628 0 0 0 -13.18 0 l5.07 3.03 -2.08 1.49 a0.38 0.38 0 0 0 -0.08 0.55 c0.93 1.15 2.24 1.87 3.69 1.87 s2.75 -0.72 3.69 -1.87 c0.14 -0.17 0.09 -0.42 -0.08 -0.55 l-2.08 -1.49Z M22.99 23.86  L19.59 25.89 c-0.1 -0.15 -0.22 -0.28 -0.35 -0.4 l1.83 -2.84 c0.69 0.3 1.34 0.71 1.92 1.21Z M18.38 22.02 c0.68 0.03 1.34 0.16 1.97 0.36 l-1.76 2.73 c-0.07 -0.02 -0.14 -0.04 -0.22 -0.06 v-3.03Z M17.63 22.02 v3.03 c-0.07 0.02 -0.15 0.03 -0.22 0.06 l-1.76 -2.73 c0.63 -0.21 1.3 -0.33 1.97 -0.36Z M13.02 23.86 c0.58 -0.5 1.23 -0.9 1.92 -1.21 l1.83 2.84 c-0.13 0.12 -0.25 0.25 -0.35 0.4 l-3.4 -2.03Z
            path(
                fill = SolidColor(Color(0xFFDE9A7E)),
            ) {
                // M 19.52 27.09
                moveTo(x = 19.52f, y = 27.09f)
                // l 5.07 -3.03
                lineToRelative(dx = 5.07f, dy = -3.03f)
                // a 8.628 8.628 0 0 0 -13.18 0
                arcToRelative(
                    a = 8.628f,
                    b = 8.628f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -13.18f,
                    dy1 = 0.0f,
                )
                // l 5.07 3.03
                lineToRelative(dx = 5.07f, dy = 3.03f)
                // l -2.08 1.49
                lineToRelative(dx = -2.08f, dy = 1.49f)
                // a 0.38 0.38 0 0 0 -0.08 0.55
                arcToRelative(
                    a = 0.38f,
                    b = 0.38f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.08f,
                    dy1 = 0.55f,
                )
                // c 0.93 1.15 2.24 1.87 3.69 1.87
                curveToRelative(
                    dx1 = 0.93f,
                    dy1 = 1.15f,
                    dx2 = 2.24f,
                    dy2 = 1.87f,
                    dx3 = 3.69f,
                    dy3 = 1.87f,
                )
                // s 2.75 -0.72 3.69 -1.87
                reflectiveCurveToRelative(
                    dx1 = 2.75f,
                    dy1 = -0.72f,
                    dx2 = 3.69f,
                    dy2 = -1.87f,
                )
                // c 0.14 -0.17 0.09 -0.42 -0.08 -0.55
                curveToRelative(
                    dx1 = 0.14f,
                    dy1 = -0.17f,
                    dx2 = 0.09f,
                    dy2 = -0.42f,
                    dx3 = -0.08f,
                    dy3 = -0.55f,
                )
                // l -2.08 -1.49z
                lineToRelative(dx = -2.08f, dy = -1.49f)
                close()
                // M 22.99 23.86
                moveTo(x = 22.99f, y = 23.86f)
                // L 19.59 25.89
                lineTo(x = 19.59f, y = 25.89f)
                // c -0.1 -0.15 -0.22 -0.28 -0.35 -0.4
                curveToRelative(
                    dx1 = -0.1f,
                    dy1 = -0.15f,
                    dx2 = -0.22f,
                    dy2 = -0.28f,
                    dx3 = -0.35f,
                    dy3 = -0.4f,
                )
                // l 1.83 -2.84
                lineToRelative(dx = 1.83f, dy = -2.84f)
                // c 0.69 0.3 1.34 0.71 1.92 1.21z
                curveToRelative(
                    dx1 = 0.69f,
                    dy1 = 0.3f,
                    dx2 = 1.34f,
                    dy2 = 0.71f,
                    dx3 = 1.92f,
                    dy3 = 1.21f,
                )
                close()
                // M 18.38 22.02
                moveTo(x = 18.38f, y = 22.02f)
                // c 0.68 0.03 1.34 0.16 1.97 0.36
                curveToRelative(
                    dx1 = 0.68f,
                    dy1 = 0.03f,
                    dx2 = 1.34f,
                    dy2 = 0.16f,
                    dx3 = 1.97f,
                    dy3 = 0.36f,
                )
                // l -1.76 2.73
                lineToRelative(dx = -1.76f, dy = 2.73f)
                // c -0.07 -0.02 -0.14 -0.04 -0.22 -0.06
                curveToRelative(
                    dx1 = -0.07f,
                    dy1 = -0.02f,
                    dx2 = -0.14f,
                    dy2 = -0.04f,
                    dx3 = -0.22f,
                    dy3 = -0.06f,
                )
                // v -3.03z
                verticalLineToRelative(dy = -3.03f)
                close()
                // M 17.63 22.02
                moveTo(x = 17.63f, y = 22.02f)
                // v 3.03
                verticalLineToRelative(dy = 3.03f)
                // c -0.07 0.02 -0.15 0.03 -0.22 0.06
                curveToRelative(
                    dx1 = -0.07f,
                    dy1 = 0.02f,
                    dx2 = -0.15f,
                    dy2 = 0.03f,
                    dx3 = -0.22f,
                    dy3 = 0.06f,
                )
                // l -1.76 -2.73
                lineToRelative(dx = -1.76f, dy = -2.73f)
                // c 0.63 -0.21 1.3 -0.33 1.97 -0.36z
                curveToRelative(
                    dx1 = 0.63f,
                    dy1 = -0.21f,
                    dx2 = 1.3f,
                    dy2 = -0.33f,
                    dx3 = 1.97f,
                    dy3 = -0.36f,
                )
                close()
                // M 13.02 23.86
                moveTo(x = 13.02f, y = 23.86f)
                // c 0.58 -0.5 1.23 -0.9 1.92 -1.21
                curveToRelative(
                    dx1 = 0.58f,
                    dy1 = -0.5f,
                    dx2 = 1.23f,
                    dy2 = -0.9f,
                    dx3 = 1.92f,
                    dy3 = -1.21f,
                )
                // l 1.83 2.84
                lineToRelative(dx = 1.83f, dy = 2.84f)
                // c -0.13 0.12 -0.25 0.25 -0.35 0.4
                curveToRelative(
                    dx1 = -0.13f,
                    dy1 = 0.12f,
                    dx2 = -0.25f,
                    dy2 = 0.25f,
                    dx3 = -0.35f,
                    dy3 = 0.4f,
                )
                // l -3.4 -2.03z
                lineToRelative(dx = -3.4f, dy = -2.03f)
                close()
            }
            // M18 27 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFA80018)),
            ) {
                // M 18 27
                moveTo(x = 18.0f, y = 27.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // a 1 1 0 1 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 1 1 -2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
            }
        }.build().also { _emoji1faad = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1faad: ImageVector? = null
