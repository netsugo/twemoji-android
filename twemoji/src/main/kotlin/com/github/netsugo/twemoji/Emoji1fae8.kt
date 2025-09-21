package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1fae8: ImageVector
    get() {
        val current = _emoji1fae8
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1fae8",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            group(
                // M0.997 18  L17.996 1.001 l16.999 17 -17 16.998z
                clipPathData = PathData {
                    // M 0.997 18
                    moveTo(x = 0.997f, y = 18.0f)
                    // L 17.996 1.001
                    lineTo(x = 17.996f, y = 1.001f)
                    // l 16.999 17
                    lineToRelative(dx = 16.999f, dy = 17.0f)
                    // l -17 16.998z
                    lineToRelative(dx = -17.0f, dy = 16.998f)
                    close()
                },
            ) {
                // M26.5 26.5 c-4.69 4.69 -12.31 4.69 -17 0 -4.69 -4.69 -4.69 -12.31 0 -17 s12.31 -4.69 17 0 c4.69 4.69 4.69 12.31 0 17
                path(
                    fill = SolidColor(Color(0xFFFFCB26)),
                ) {
                    // M 26.5 26.5
                    moveTo(x = 26.5f, y = 26.5f)
                    // c -4.69 4.69 -12.31 4.69 -17 0
                    curveToRelative(
                        dx1 = -4.69f,
                        dy1 = 4.69f,
                        dx2 = -12.31f,
                        dy2 = 4.69f,
                        dx3 = -17.0f,
                        dy3 = 0.0f,
                    )
                    // c -4.69 -4.69 -4.69 -12.31 0 -17
                    curveToRelative(
                        dx1 = -4.69f,
                        dy1 = -4.69f,
                        dx2 = -4.69f,
                        dy2 = -12.31f,
                        dx3 = 0.0f,
                        dy3 = -17.0f,
                    )
                    // s 12.31 -4.69 17 0
                    reflectiveCurveToRelative(
                        dx1 = 12.31f,
                        dy1 = -4.69f,
                        dx2 = 17.0f,
                        dy2 = 0.0f,
                    )
                    // c 4.69 4.69 4.69 12.31 0 17
                    curveToRelative(
                        dx1 = 4.69f,
                        dy1 = 4.69f,
                        dx2 = 4.69f,
                        dy2 = 12.31f,
                        dx3 = 0.0f,
                        dy3 = 17.0f,
                    )
                }
                // M14.93 13.99 c0.65 0.65 1.92 0.44 2.83 -0.47 0.91 -0.91 1.12 -2.18 0.47 -2.83 s-1.92 -0.44 -2.83 0.47 -1.12 2.18 -0.47 2.83Z
                path(
                    fill = SolidColor(Color(0xFFB68600)),
                ) {
                    // M 14.93 13.99
                    moveTo(x = 14.93f, y = 13.99f)
                    // c 0.65 0.65 1.92 0.44 2.83 -0.47
                    curveToRelative(
                        dx1 = 0.65f,
                        dy1 = 0.65f,
                        dx2 = 1.92f,
                        dy2 = 0.44f,
                        dx3 = 2.83f,
                        dy3 = -0.47f,
                    )
                    // c 0.91 -0.91 1.12 -2.18 0.47 -2.83
                    curveToRelative(
                        dx1 = 0.91f,
                        dy1 = -0.91f,
                        dx2 = 1.12f,
                        dy2 = -2.18f,
                        dx3 = 0.47f,
                        dy3 = -2.83f,
                    )
                    // s -1.92 -0.44 -2.83 0.47
                    reflectiveCurveToRelative(
                        dx1 = -1.92f,
                        dy1 = -0.44f,
                        dx2 = -2.83f,
                        dy2 = 0.47f,
                    )
                    // s -1.12 2.18 -0.47 2.83z
                    reflectiveCurveToRelative(
                        dx1 = -1.12f,
                        dy1 = 2.18f,
                        dx2 = -0.47f,
                        dy2 = 2.83f,
                    )
                    close()
                }
                // M16.35 15.4 c0.65 0.65 1.92 0.44 2.83 -0.47 0.91 -0.91 1.12 -2.18 0.47 -2.83 s-1.92 -0.44 -2.83 0.47 -1.12 2.18 -0.47 2.83 m5.66 5.67 c0.65 0.65 1.92 0.44 2.83 -0.47 s1.12 -2.18 0.47 -2.83 -1.92 -0.44 -2.83 0.47 -1.12 2.18 -0.47 2.83Z
                path(
                    fill = SolidColor(Color(0xFFB68600)),
                ) {
                    // M 16.35 15.4
                    moveTo(x = 16.35f, y = 15.4f)
                    // c 0.65 0.65 1.92 0.44 2.83 -0.47
                    curveToRelative(
                        dx1 = 0.65f,
                        dy1 = 0.65f,
                        dx2 = 1.92f,
                        dy2 = 0.44f,
                        dx3 = 2.83f,
                        dy3 = -0.47f,
                    )
                    // c 0.91 -0.91 1.12 -2.18 0.47 -2.83
                    curveToRelative(
                        dx1 = 0.91f,
                        dy1 = -0.91f,
                        dx2 = 1.12f,
                        dy2 = -2.18f,
                        dx3 = 0.47f,
                        dy3 = -2.83f,
                    )
                    // s -1.92 -0.44 -2.83 0.47
                    reflectiveCurveToRelative(
                        dx1 = -1.92f,
                        dy1 = -0.44f,
                        dx2 = -2.83f,
                        dy2 = 0.47f,
                    )
                    // s -1.12 2.18 -0.47 2.83
                    reflectiveCurveToRelative(
                        dx1 = -1.12f,
                        dy1 = 2.18f,
                        dx2 = -0.47f,
                        dy2 = 2.83f,
                    )
                    // m 5.66 5.67
                    moveToRelative(dx = 5.66f, dy = 5.67f)
                    // c 0.65 0.65 1.92 0.44 2.83 -0.47
                    curveToRelative(
                        dx1 = 0.65f,
                        dy1 = 0.65f,
                        dx2 = 1.92f,
                        dy2 = 0.44f,
                        dx3 = 2.83f,
                        dy3 = -0.47f,
                    )
                    // s 1.12 -2.18 0.47 -2.83
                    reflectiveCurveToRelative(
                        dx1 = 1.12f,
                        dy1 = -2.18f,
                        dx2 = 0.47f,
                        dy2 = -2.83f,
                    )
                    // s -1.92 -0.44 -2.83 0.47
                    reflectiveCurveToRelative(
                        dx1 = -1.92f,
                        dy1 = -0.44f,
                        dx2 = -2.83f,
                        dy2 = 0.47f,
                    )
                    // s -1.12 2.18 -0.47 2.83z
                    reflectiveCurveToRelative(
                        dx1 = -1.12f,
                        dy1 = 2.18f,
                        dx2 = -0.47f,
                        dy2 = 2.83f,
                    )
                    close()
                }
                // M20.6 19.65 c0.65 0.65 1.92 0.44 2.83 -0.47 s1.12 -2.18 0.47 -2.83 -1.92 -0.44 -2.83 0.47 -1.12 2.18 -0.47 2.83
                path(
                    fill = SolidColor(Color(0xFFB68600)),
                ) {
                    // M 20.6 19.65
                    moveTo(x = 20.6f, y = 19.65f)
                    // c 0.65 0.65 1.92 0.44 2.83 -0.47
                    curveToRelative(
                        dx1 = 0.65f,
                        dy1 = 0.65f,
                        dx2 = 1.92f,
                        dy2 = 0.44f,
                        dx3 = 2.83f,
                        dy3 = -0.47f,
                    )
                    // s 1.12 -2.18 0.47 -2.83
                    reflectiveCurveToRelative(
                        dx1 = 1.12f,
                        dy1 = -2.18f,
                        dx2 = 0.47f,
                        dy2 = -2.83f,
                    )
                    // s -1.92 -0.44 -2.83 0.47
                    reflectiveCurveToRelative(
                        dx1 = -1.92f,
                        dy1 = -0.44f,
                        dx2 = -2.83f,
                        dy2 = 0.47f,
                    )
                    // s -1.12 2.18 -0.47 2.83
                    reflectiveCurveToRelative(
                        dx1 = -1.12f,
                        dy1 = 2.18f,
                        dx2 = -0.47f,
                        dy2 = 2.83f,
                    )
                }
                // M12.33 23.67 c1.04 1.04 2.95 0.83 4.25 -0.47 s1.52 -3.21 0.47 -4.25 -2.95 -0.83 -4.25 0.47 -1.52 3.21 -0.47 4.25Z
                path(
                    fill = SolidColor(Color(0xFF694400)),
                ) {
                    // M 12.33 23.67
                    moveTo(x = 12.33f, y = 23.67f)
                    // c 1.04 1.04 2.95 0.83 4.25 -0.47
                    curveToRelative(
                        dx1 = 1.04f,
                        dy1 = 1.04f,
                        dx2 = 2.95f,
                        dy2 = 0.83f,
                        dx3 = 4.25f,
                        dy3 = -0.47f,
                    )
                    // s 1.52 -3.21 0.47 -4.25
                    reflectiveCurveToRelative(
                        dx1 = 1.52f,
                        dy1 = -3.21f,
                        dx2 = 0.47f,
                        dy2 = -4.25f,
                    )
                    // s -2.95 -0.83 -4.25 0.47
                    reflectiveCurveToRelative(
                        dx1 = -2.95f,
                        dy1 = -0.83f,
                        dx2 = -4.25f,
                        dy2 = 0.47f,
                    )
                    // s -1.52 3.21 -0.47 4.25z
                    reflectiveCurveToRelative(
                        dx1 = -1.52f,
                        dy1 = 3.21f,
                        dx2 = -0.47f,
                        dy2 = 4.25f,
                    )
                    close()
                }
            }
            // M21.89 33.66 c-0.46 0 -0.88 -0.32 -0.98 -0.79 -0.11 -0.54 0.23 -1.07 0.77 -1.19 8.4 -1.78 9.92 -9.63 9.99 -9.96 0.1 -0.54 0.62 -0.9 1.16 -0.81 s0.9 0.62 0.81 1.16 c-0.02 0.09 -1.79 9.5 -11.54 11.57 -0.07 0.01 -0.14 0.02 -0.21 0.02Z M27.2 35.99 c-0.46 0 -0.88 -0.32 -0.98 -0.79 -0.11 -0.54 0.23 -1.07 0.77 -1.19 5.89 -1.25 6.97 -6.75 7.01 -6.99 0.1 -0.54 0.62 -0.9 1.16 -0.8 0.54 0.1 0.9 0.61 0.81 1.16 -0.05 0.29 -1.33 7.06 -8.57 8.59 -0.07 0.01 -0.14 0.02 -0.21 0.02Z M3.34 15.1 c-0.07 0 -0.14 0 -0.21 -0.02 a0.998 0.998 0 0 1 -0.77 -1.19 C4.43 4.15 13.83 2.37 13.93 2.36 a1 1 0 1 1 0.35 1.97 c-0.35 0.06 -8.18 1.6 -9.96 9.99 -0.1 0.47 -0.52 0.79 -0.98 0.79Z M1.01 9.8 c-0.07 0 -0.14 0 -0.21 -0.02 a0.998 0.998 0 0 1 -0.77 -1.19 C1.56 1.36 8.34 0.08 8.62 0.03 A1 1 0 1 1 8.97 2 c-0.26 0.05 -5.74 1.14 -6.99 7.01 -0.1 0.47 -0.51 0.79 -0.98 0.79Z
            path(
                fill = SolidColor(Color(0xFF4FACF0)),
            ) {
                // M 21.89 33.66
                moveTo(x = 21.89f, y = 33.66f)
                // c -0.46 0 -0.88 -0.32 -0.98 -0.79
                curveToRelative(
                    dx1 = -0.46f,
                    dy1 = 0.0f,
                    dx2 = -0.88f,
                    dy2 = -0.32f,
                    dx3 = -0.98f,
                    dy3 = -0.79f,
                )
                // c -0.11 -0.54 0.23 -1.07 0.77 -1.19
                curveToRelative(
                    dx1 = -0.11f,
                    dy1 = -0.54f,
                    dx2 = 0.23f,
                    dy2 = -1.07f,
                    dx3 = 0.77f,
                    dy3 = -1.19f,
                )
                // c 8.4 -1.78 9.92 -9.63 9.99 -9.96
                curveToRelative(
                    dx1 = 8.4f,
                    dy1 = -1.78f,
                    dx2 = 9.92f,
                    dy2 = -9.63f,
                    dx3 = 9.99f,
                    dy3 = -9.96f,
                )
                // c 0.1 -0.54 0.62 -0.9 1.16 -0.81
                curveToRelative(
                    dx1 = 0.1f,
                    dy1 = -0.54f,
                    dx2 = 0.62f,
                    dy2 = -0.9f,
                    dx3 = 1.16f,
                    dy3 = -0.81f,
                )
                // s 0.9 0.62 0.81 1.16
                reflectiveCurveToRelative(
                    dx1 = 0.9f,
                    dy1 = 0.62f,
                    dx2 = 0.81f,
                    dy2 = 1.16f,
                )
                // c -0.02 0.09 -1.79 9.5 -11.54 11.57
                curveToRelative(
                    dx1 = -0.02f,
                    dy1 = 0.09f,
                    dx2 = -1.79f,
                    dy2 = 9.5f,
                    dx3 = -11.54f,
                    dy3 = 11.57f,
                )
                // c -0.07 0.01 -0.14 0.02 -0.21 0.02z
                curveToRelative(
                    dx1 = -0.07f,
                    dy1 = 0.01f,
                    dx2 = -0.14f,
                    dy2 = 0.02f,
                    dx3 = -0.21f,
                    dy3 = 0.02f,
                )
                close()
                // M 27.2 35.99
                moveTo(x = 27.2f, y = 35.99f)
                // c -0.46 0 -0.88 -0.32 -0.98 -0.79
                curveToRelative(
                    dx1 = -0.46f,
                    dy1 = 0.0f,
                    dx2 = -0.88f,
                    dy2 = -0.32f,
                    dx3 = -0.98f,
                    dy3 = -0.79f,
                )
                // c -0.11 -0.54 0.23 -1.07 0.77 -1.19
                curveToRelative(
                    dx1 = -0.11f,
                    dy1 = -0.54f,
                    dx2 = 0.23f,
                    dy2 = -1.07f,
                    dx3 = 0.77f,
                    dy3 = -1.19f,
                )
                // c 5.89 -1.25 6.97 -6.75 7.01 -6.99
                curveToRelative(
                    dx1 = 5.89f,
                    dy1 = -1.25f,
                    dx2 = 6.97f,
                    dy2 = -6.75f,
                    dx3 = 7.01f,
                    dy3 = -6.99f,
                )
                // c 0.1 -0.54 0.62 -0.9 1.16 -0.8
                curveToRelative(
                    dx1 = 0.1f,
                    dy1 = -0.54f,
                    dx2 = 0.62f,
                    dy2 = -0.9f,
                    dx3 = 1.16f,
                    dy3 = -0.8f,
                )
                // c 0.54 0.1 0.9 0.61 0.81 1.16
                curveToRelative(
                    dx1 = 0.54f,
                    dy1 = 0.1f,
                    dx2 = 0.9f,
                    dy2 = 0.61f,
                    dx3 = 0.81f,
                    dy3 = 1.16f,
                )
                // c -0.05 0.29 -1.33 7.06 -8.57 8.59
                curveToRelative(
                    dx1 = -0.05f,
                    dy1 = 0.29f,
                    dx2 = -1.33f,
                    dy2 = 7.06f,
                    dx3 = -8.57f,
                    dy3 = 8.59f,
                )
                // c -0.07 0.01 -0.14 0.02 -0.21 0.02z
                curveToRelative(
                    dx1 = -0.07f,
                    dy1 = 0.01f,
                    dx2 = -0.14f,
                    dy2 = 0.02f,
                    dx3 = -0.21f,
                    dy3 = 0.02f,
                )
                close()
                // M 3.34 15.1
                moveTo(x = 3.34f, y = 15.1f)
                // c -0.07 0 -0.14 0 -0.21 -0.02
                curveToRelative(
                    dx1 = -0.07f,
                    dy1 = 0.0f,
                    dx2 = -0.14f,
                    dy2 = 0.0f,
                    dx3 = -0.21f,
                    dy3 = -0.02f,
                )
                // a 0.998 0.998 0 0 1 -0.77 -1.19
                arcToRelative(
                    a = 0.998f,
                    b = 0.998f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.77f,
                    dy1 = -1.19f,
                )
                // C 4.43 4.15 13.83 2.37 13.93 2.36
                curveTo(
                    x1 = 4.43f,
                    y1 = 4.15f,
                    x2 = 13.83f,
                    y2 = 2.37f,
                    x3 = 13.93f,
                    y3 = 2.36f,
                )
                // a 1 1 0 1 1 0.35 1.97
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.35f,
                    dy1 = 1.97f,
                )
                // c -0.35 0.06 -8.18 1.6 -9.96 9.99
                curveToRelative(
                    dx1 = -0.35f,
                    dy1 = 0.06f,
                    dx2 = -8.18f,
                    dy2 = 1.6f,
                    dx3 = -9.96f,
                    dy3 = 9.99f,
                )
                // c -0.1 0.47 -0.52 0.79 -0.98 0.79z
                curveToRelative(
                    dx1 = -0.1f,
                    dy1 = 0.47f,
                    dx2 = -0.52f,
                    dy2 = 0.79f,
                    dx3 = -0.98f,
                    dy3 = 0.79f,
                )
                close()
                // M 1.01 9.8
                moveTo(x = 1.01f, y = 9.8f)
                // c -0.07 0 -0.14 0 -0.21 -0.02
                curveToRelative(
                    dx1 = -0.07f,
                    dy1 = 0.0f,
                    dx2 = -0.14f,
                    dy2 = 0.0f,
                    dx3 = -0.21f,
                    dy3 = -0.02f,
                )
                // a 0.998 0.998 0 0 1 -0.77 -1.19
                arcToRelative(
                    a = 0.998f,
                    b = 0.998f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.77f,
                    dy1 = -1.19f,
                )
                // C 1.56 1.36 8.34 0.08 8.62 0.03
                curveTo(
                    x1 = 1.56f,
                    y1 = 1.36f,
                    x2 = 8.34f,
                    y2 = 0.08f,
                    x3 = 8.62f,
                    y3 = 0.03f,
                )
                // A 1 1 0 1 1 8.97 2
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 8.97f,
                    y1 = 2.0f,
                )
                // c -0.26 0.05 -5.74 1.14 -6.99 7.01
                curveToRelative(
                    dx1 = -0.26f,
                    dy1 = 0.05f,
                    dx2 = -5.74f,
                    dy2 = 1.14f,
                    dx3 = -6.99f,
                    dy3 = 7.01f,
                )
                // c -0.1 0.47 -0.51 0.79 -0.98 0.79z
                curveToRelative(
                    dx1 = -0.1f,
                    dy1 = 0.47f,
                    dx2 = -0.51f,
                    dy2 = 0.79f,
                    dx3 = -0.98f,
                    dy3 = 0.79f,
                )
                close()
            }
            // M15.64 14.69 c0.65 0.65 1.92 0.44 2.83 -0.47 0.91 -0.91 1.12 -2.18 0.47 -2.83 s-1.92 -0.44 -2.83 0.47 -1.12 2.18 -0.47 2.83Z M21.31 20.36 c0.65 0.65 1.92 0.44 2.83 -0.47 s1.12 -2.18 0.47 -2.83 -1.92 -0.44 -2.83 0.47 -1.12 2.18 -0.47 2.83
            path(
                fill = SolidColor(Color(0xFF694400)),
            ) {
                // M 15.64 14.69
                moveTo(x = 15.64f, y = 14.69f)
                // c 0.65 0.65 1.92 0.44 2.83 -0.47
                curveToRelative(
                    dx1 = 0.65f,
                    dy1 = 0.65f,
                    dx2 = 1.92f,
                    dy2 = 0.44f,
                    dx3 = 2.83f,
                    dy3 = -0.47f,
                )
                // c 0.91 -0.91 1.12 -2.18 0.47 -2.83
                curveToRelative(
                    dx1 = 0.91f,
                    dy1 = -0.91f,
                    dx2 = 1.12f,
                    dy2 = -2.18f,
                    dx3 = 0.47f,
                    dy3 = -2.83f,
                )
                // s -1.92 -0.44 -2.83 0.47
                reflectiveCurveToRelative(
                    dx1 = -1.92f,
                    dy1 = -0.44f,
                    dx2 = -2.83f,
                    dy2 = 0.47f,
                )
                // s -1.12 2.18 -0.47 2.83z
                reflectiveCurveToRelative(
                    dx1 = -1.12f,
                    dy1 = 2.18f,
                    dx2 = -0.47f,
                    dy2 = 2.83f,
                )
                close()
                // M 21.31 20.36
                moveTo(x = 21.31f, y = 20.36f)
                // c 0.65 0.65 1.92 0.44 2.83 -0.47
                curveToRelative(
                    dx1 = 0.65f,
                    dy1 = 0.65f,
                    dx2 = 1.92f,
                    dy2 = 0.44f,
                    dx3 = 2.83f,
                    dy3 = -0.47f,
                )
                // s 1.12 -2.18 0.47 -2.83
                reflectiveCurveToRelative(
                    dx1 = 1.12f,
                    dy1 = -2.18f,
                    dx2 = 0.47f,
                    dy2 = -2.83f,
                )
                // s -1.92 -0.44 -2.83 0.47
                reflectiveCurveToRelative(
                    dx1 = -1.92f,
                    dy1 = -0.44f,
                    dx2 = -2.83f,
                    dy2 = 0.47f,
                )
                // s -1.12 2.18 -0.47 2.83
                reflectiveCurveToRelative(
                    dx1 = -1.12f,
                    dy1 = 2.18f,
                    dx2 = -0.47f,
                    dy2 = 2.83f,
                )
            }
        }.build().also { _emoji1fae8 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1fae8: ImageVector? = null
