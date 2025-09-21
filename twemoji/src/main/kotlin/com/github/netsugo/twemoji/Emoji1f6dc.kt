package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f6dc: ImageVector
    get() {
        val current = _emoji1f6dc
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f6dc",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            group(
                // M0 0 h36 v36 H0z
                clipPathData = PathData {
                    // M 0 0
                    moveTo(x = 0.0f, y = 0.0f)
                    // h 36
                    horizontalLineToRelative(dx = 36.0f)
                    // v 36
                    verticalLineToRelative(dy = 36.0f)
                    // H 0z
                    horizontalLineTo(x = 0.0f)
                    close()
                },
            ) {
                // M36 32 c0 4 -4 4 -4 4 H4 c-4 0 -4 -4 -4 -4 V4 c0 -4 4 -4 4 -4 h28 s4 0 4 4z
                path(
                    fill = SolidColor(Color(0xFF2B87C7)),
                ) {
                    // M 36 32
                    moveTo(x = 36.0f, y = 32.0f)
                    // c 0 4 -4 4 -4 4
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 4.0f,
                        dx2 = -4.0f,
                        dy2 = 4.0f,
                        dx3 = -4.0f,
                        dy3 = 4.0f,
                    )
                    // H 4
                    horizontalLineTo(x = 4.0f)
                    // c -4 0 -4 -4 -4 -4
                    curveToRelative(
                        dx1 = -4.0f,
                        dy1 = 0.0f,
                        dx2 = -4.0f,
                        dy2 = -4.0f,
                        dx3 = -4.0f,
                        dy3 = -4.0f,
                    )
                    // V 4
                    verticalLineTo(y = 4.0f)
                    // c 0 -4 4 -4 4 -4
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = -4.0f,
                        dx2 = 4.0f,
                        dy2 = -4.0f,
                        dx3 = 4.0f,
                        dy3 = -4.0f,
                    )
                    // h 28
                    horizontalLineToRelative(dx = 28.0f)
                    // s 4 0 4 4z
                    reflectiveCurveToRelative(
                        dx1 = 4.0f,
                        dy1 = 0.0f,
                        dx2 = 4.0f,
                        dy2 = 4.0f,
                    )
                    close()
                }
            }
            // m5.1 13.01  l1.46 1.65 c0.15 0.16 0.39 0.19 0.57 0.07 3.01 -1.98 6.77 -3.17 10.83 -3.17 s7.88 1.2 10.9 3.21 c0.18 0.12 0.42 0.09 0.57 -0.07 l1.47 -1.64 c0.17 -0.2 0.14 -0.5 -0.07 -0.65 -3.56 -2.45 -8.02 -3.91 -12.87 -3.91 S8.72 9.94 5.17 12.36 c-0.22 0.15 -0.25 0.45 -0.08 0.65Z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 5.1 13.01
                moveTo(x = 5.1f, y = 13.01f)
                // l 1.46 1.65
                lineToRelative(dx = 1.46f, dy = 1.65f)
                // c 0.15 0.16 0.39 0.19 0.57 0.07
                curveToRelative(
                    dx1 = 0.15f,
                    dy1 = 0.16f,
                    dx2 = 0.39f,
                    dy2 = 0.19f,
                    dx3 = 0.57f,
                    dy3 = 0.07f,
                )
                // c 3.01 -1.98 6.77 -3.17 10.83 -3.17
                curveToRelative(
                    dx1 = 3.01f,
                    dy1 = -1.98f,
                    dx2 = 6.77f,
                    dy2 = -3.17f,
                    dx3 = 10.83f,
                    dy3 = -3.17f,
                )
                // s 7.88 1.2 10.9 3.21
                reflectiveCurveToRelative(
                    dx1 = 7.88f,
                    dy1 = 1.2f,
                    dx2 = 10.9f,
                    dy2 = 3.21f,
                )
                // c 0.18 0.12 0.42 0.09 0.57 -0.07
                curveToRelative(
                    dx1 = 0.18f,
                    dy1 = 0.12f,
                    dx2 = 0.42f,
                    dy2 = 0.09f,
                    dx3 = 0.57f,
                    dy3 = -0.07f,
                )
                // l 1.47 -1.64
                lineToRelative(dx = 1.47f, dy = -1.64f)
                // c 0.17 -0.2 0.14 -0.5 -0.07 -0.65
                curveToRelative(
                    dx1 = 0.17f,
                    dy1 = -0.2f,
                    dx2 = 0.14f,
                    dy2 = -0.5f,
                    dx3 = -0.07f,
                    dy3 = -0.65f,
                )
                // c -3.56 -2.45 -8.02 -3.91 -12.87 -3.91
                curveToRelative(
                    dx1 = -3.56f,
                    dy1 = -2.45f,
                    dx2 = -8.02f,
                    dy2 = -3.91f,
                    dx3 = -12.87f,
                    dy3 = -3.91f,
                )
                // S 8.72 9.94 5.17 12.36
                reflectiveCurveTo(
                    x1 = 8.72f,
                    y1 = 9.94f,
                    x2 = 5.17f,
                    y2 = 12.36f,
                )
                // c -0.22 0.15 -0.25 0.45 -0.08 0.65z
                curveToRelative(
                    dx1 = -0.22f,
                    dy1 = 0.15f,
                    dx2 = -0.25f,
                    dy2 = 0.45f,
                    dx3 = -0.08f,
                    dy3 = 0.65f,
                )
                close()
            }
            // m9.43 17.9  l1.45 1.64 c0.15 0.16 0.39 0.2 0.58 0.08 1.8 -1.2 4.06 -1.92 6.51 -1.92 s4.74 0.73 6.54 1.95 c0.18 0.12 0.42 0.1 0.57 -0.07 l1.47 -1.64 c0.18 -0.2 0.14 -0.5 -0.08 -0.65 -2.34 -1.66 -5.29 -2.65 -8.5 -2.65 s-6.12 0.98 -8.45 2.61 a0.43 0.43 0 0 0 -0.08 0.65Z M13.65 22.67  L15.11 24.31 c0.14 0.16 0.39 0.19 0.57 0.07 0.63 -0.41 1.42 -0.65 2.28 -0.65 s1.67 0.25 2.3 0.66 c0.18 0.12 0.42 0.09 0.57 -0.07 l1.46 -1.64 a0.44 0.44 0 0 0 -0.06 -0.64 c-1.17 -0.86 -2.65 -1.37 -4.27 -1.37 s-3.08 0.51 -4.24 1.35 c-0.21 0.15 -0.24 0.45 -0.07 0.64Z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 9.43 17.9
                moveTo(x = 9.43f, y = 17.9f)
                // l 1.45 1.64
                lineToRelative(dx = 1.45f, dy = 1.64f)
                // c 0.15 0.16 0.39 0.2 0.58 0.08
                curveToRelative(
                    dx1 = 0.15f,
                    dy1 = 0.16f,
                    dx2 = 0.39f,
                    dy2 = 0.2f,
                    dx3 = 0.58f,
                    dy3 = 0.08f,
                )
                // c 1.8 -1.2 4.06 -1.92 6.51 -1.92
                curveToRelative(
                    dx1 = 1.8f,
                    dy1 = -1.2f,
                    dx2 = 4.06f,
                    dy2 = -1.92f,
                    dx3 = 6.51f,
                    dy3 = -1.92f,
                )
                // s 4.74 0.73 6.54 1.95
                reflectiveCurveToRelative(
                    dx1 = 4.74f,
                    dy1 = 0.73f,
                    dx2 = 6.54f,
                    dy2 = 1.95f,
                )
                // c 0.18 0.12 0.42 0.1 0.57 -0.07
                curveToRelative(
                    dx1 = 0.18f,
                    dy1 = 0.12f,
                    dx2 = 0.42f,
                    dy2 = 0.1f,
                    dx3 = 0.57f,
                    dy3 = -0.07f,
                )
                // l 1.47 -1.64
                lineToRelative(dx = 1.47f, dy = -1.64f)
                // c 0.18 -0.2 0.14 -0.5 -0.08 -0.65
                curveToRelative(
                    dx1 = 0.18f,
                    dy1 = -0.2f,
                    dx2 = 0.14f,
                    dy2 = -0.5f,
                    dx3 = -0.08f,
                    dy3 = -0.65f,
                )
                // c -2.34 -1.66 -5.29 -2.65 -8.5 -2.65
                curveToRelative(
                    dx1 = -2.34f,
                    dy1 = -1.66f,
                    dx2 = -5.29f,
                    dy2 = -2.65f,
                    dx3 = -8.5f,
                    dy3 = -2.65f,
                )
                // s -6.12 0.98 -8.45 2.61
                reflectiveCurveToRelative(
                    dx1 = -6.12f,
                    dy1 = 0.98f,
                    dx2 = -8.45f,
                    dy2 = 2.61f,
                )
                // a 0.43 0.43 0 0 0 -0.08 0.65z
                arcToRelative(
                    a = 0.43f,
                    b = 0.43f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.08f,
                    dy1 = 0.65f,
                )
                close()
                // M 13.65 22.67
                moveTo(x = 13.65f, y = 22.67f)
                // L 15.11 24.31
                lineTo(x = 15.11f, y = 24.31f)
                // c 0.14 0.16 0.39 0.19 0.57 0.07
                curveToRelative(
                    dx1 = 0.14f,
                    dy1 = 0.16f,
                    dx2 = 0.39f,
                    dy2 = 0.19f,
                    dx3 = 0.57f,
                    dy3 = 0.07f,
                )
                // c 0.63 -0.41 1.42 -0.65 2.28 -0.65
                curveToRelative(
                    dx1 = 0.63f,
                    dy1 = -0.41f,
                    dx2 = 1.42f,
                    dy2 = -0.65f,
                    dx3 = 2.28f,
                    dy3 = -0.65f,
                )
                // s 1.67 0.25 2.3 0.66
                reflectiveCurveToRelative(
                    dx1 = 1.67f,
                    dy1 = 0.25f,
                    dx2 = 2.3f,
                    dy2 = 0.66f,
                )
                // c 0.18 0.12 0.42 0.09 0.57 -0.07
                curveToRelative(
                    dx1 = 0.18f,
                    dy1 = 0.12f,
                    dx2 = 0.42f,
                    dy2 = 0.09f,
                    dx3 = 0.57f,
                    dy3 = -0.07f,
                )
                // l 1.46 -1.64
                lineToRelative(dx = 1.46f, dy = -1.64f)
                // a 0.44 0.44 0 0 0 -0.06 -0.64
                arcToRelative(
                    a = 0.44f,
                    b = 0.44f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.06f,
                    dy1 = -0.64f,
                )
                // c -1.17 -0.86 -2.65 -1.37 -4.27 -1.37
                curveToRelative(
                    dx1 = -1.17f,
                    dy1 = -0.86f,
                    dx2 = -2.65f,
                    dy2 = -1.37f,
                    dx3 = -4.27f,
                    dy3 = -1.37f,
                )
                // s -3.08 0.51 -4.24 1.35
                reflectiveCurveToRelative(
                    dx1 = -3.08f,
                    dy1 = 0.51f,
                    dx2 = -4.24f,
                    dy2 = 1.35f,
                )
                // c -0.21 0.15 -0.24 0.45 -0.07 0.64z
                curveToRelative(
                    dx1 = -0.21f,
                    dy1 = 0.15f,
                    dx2 = -0.24f,
                    dy2 = 0.45f,
                    dx3 = -0.07f,
                    dy3 = 0.64f,
                )
                close()
            }
            // M17.91 27.64 m-1.86 0 a1.86 1.86 0 1 1 3.72 0 a1.86 1.86 0 1 1 -3.72 0
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 17.91 27.64
                moveTo(x = 17.91f, y = 27.64f)
                // m -1.86 0
                moveToRelative(dx = -1.86f, dy = 0.0f)
                // a 1.86 1.86 0 1 1 3.72 0
                arcToRelative(
                    a = 1.86f,
                    b = 1.86f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 3.72f,
                    dy1 = 0.0f,
                )
                // a 1.86 1.86 0 1 1 -3.72 0
                arcToRelative(
                    a = 1.86f,
                    b = 1.86f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -3.72f,
                    dy1 = 0.0f,
                )
            }
        }.build().also { _emoji1f6dc = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f6dc: ImageVector? = null
