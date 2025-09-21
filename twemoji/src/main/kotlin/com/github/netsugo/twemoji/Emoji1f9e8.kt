package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f9e8: ImageVector
    get() {
        val current = _emoji1f9e8
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f9e8",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M29 4 m-4 0 a4 4 0 1 1 8 0 a4 4 0 1 1 -8 0
            path(
                fill = SolidColor(Color(0xFFFFE8B6)),
            ) {
                // M 29 4
                moveTo(x = 29.0f, y = 4.0f)
                // m -4 0
                moveToRelative(dx = -4.0f, dy = 0.0f)
                // a 4 4 0 1 1 8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 8.0f,
                    dy1 = 0.0f,
                )
                // a 4 4 0 1 1 -8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -8.0f,
                    dy1 = 0.0f,
                )
            }
            // M29 4 m-3 0 a3 3 0 1 1 6 0 a3 3 0 1 1 -6 0
            path(
                fill = SolidColor(Color(0xFFFFD983)),
            ) {
                // M 29 4
                moveTo(x = 29.0f, y = 4.0f)
                // m -3 0
                moveToRelative(dx = -3.0f, dy = 0.0f)
                // a 3 3 0 1 1 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // a 3 3 0 1 1 -6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
            }
            // M32.5 0.5 l-4.207 2.793 1.414 1.414z M25.5 7.5 l2.793 -4.207 1.414 1.414z
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 32.5 0.5
                moveTo(x = 32.5f, y = 0.5f)
                // l -4.207 2.793
                lineToRelative(dx = -4.207f, dy = 2.793f)
                // l 1.414 1.414z
                lineToRelative(dx = 1.414f, dy = 1.414f)
                close()
                // M 25.5 7.5
                moveTo(x = 25.5f, y = 7.5f)
                // l 2.793 -4.207
                lineToRelative(dx = 2.793f, dy = -4.207f)
                // l 1.414 1.414z
                lineToRelative(dx = 1.414f, dy = 1.414f)
                close()
            }
            // M32.5 7.5 l-2.793 -4.207 -1.414 1.414z
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 32.5 7.5
                moveTo(x = 32.5f, y = 7.5f)
                // l -2.793 -4.207
                lineToRelative(dx = -2.793f, dy = -4.207f)
                // l -1.414 1.414z
                lineToRelative(dx = -1.414f, dy = 1.414f)
                close()
            }
            // M25.5 0.5 l4.207 2.793 -1.414 1.414z
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 25.5 0.5
                moveTo(x = 25.5f, y = 0.5f)
                // l 4.207 2.793
                lineToRelative(dx = 4.207f, dy = 2.793f)
                // l -1.414 1.414z
                lineToRelative(dx = -1.414f, dy = 1.414f)
                close()
            }
            // M23 13.5 c-0.143 0 -0.285 -0.061 -0.384 -0.18 -0.177 -0.212 -0.148 -0.528 0.063 -0.705 5.709 -4.757 5.82 -8.581 5.82 -8.619 0.003 -0.275 0.209 -0.534 0.503 -0.496 0.276 0.003 0.498 0.225 0.498 0.5 0 0.173 -0.07 4.293 -6.18 9.384 -0.093 0.078 -0.207 0.116 -0.32 0.116z
            path(
                fill = SolidColor(Color(0xFFC1694F)),
            ) {
                // M 23 13.5
                moveTo(x = 23.0f, y = 13.5f)
                // c -0.143 0 -0.285 -0.061 -0.384 -0.18
                curveToRelative(
                    dx1 = -0.143f,
                    dy1 = 0.0f,
                    dx2 = -0.285f,
                    dy2 = -0.061f,
                    dx3 = -0.384f,
                    dy3 = -0.18f,
                )
                // c -0.177 -0.212 -0.148 -0.528 0.063 -0.705
                curveToRelative(
                    dx1 = -0.177f,
                    dy1 = -0.212f,
                    dx2 = -0.148f,
                    dy2 = -0.528f,
                    dx3 = 0.063f,
                    dy3 = -0.705f,
                )
                // c 5.709 -4.757 5.82 -8.581 5.82 -8.619
                curveToRelative(
                    dx1 = 5.709f,
                    dy1 = -4.757f,
                    dx2 = 5.82f,
                    dy2 = -8.581f,
                    dx3 = 5.82f,
                    dy3 = -8.619f,
                )
                // c 0.003 -0.275 0.209 -0.534 0.503 -0.496
                curveToRelative(
                    dx1 = 0.003f,
                    dy1 = -0.275f,
                    dx2 = 0.209f,
                    dy2 = -0.534f,
                    dx3 = 0.503f,
                    dy3 = -0.496f,
                )
                // c 0.276 0.003 0.498 0.225 0.498 0.5
                curveToRelative(
                    dx1 = 0.276f,
                    dy1 = 0.003f,
                    dx2 = 0.498f,
                    dy2 = 0.225f,
                    dx3 = 0.498f,
                    dy3 = 0.5f,
                )
                // c 0 0.173 -0.07 4.293 -6.18 9.384
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.173f,
                    dx2 = -0.07f,
                    dy2 = 4.293f,
                    dx3 = -6.18f,
                    dy3 = 9.384f,
                )
                // c -0.093 0.078 -0.207 0.116 -0.32 0.116z
                curveToRelative(
                    dx1 = -0.093f,
                    dy1 = 0.078f,
                    dx2 = -0.207f,
                    dy2 = 0.116f,
                    dx3 = -0.32f,
                    dy3 = 0.116f,
                )
                close()
            }
            // M4.826 35.417 L0.583 31.174 c-0.778 -0.778 -0.778 -2.051 0 -2.828 L19.675 9.254 c0.778 -0.778 2.051 -0.778 2.828 0 l4.243 4.243 c0.778 0.778 0.778 2.051 0 2.828 L7.654 35.417 c-0.777 0.777 -2.05 0.777 -2.828 0z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 4.826 35.417
                moveTo(x = 4.826f, y = 35.417f)
                // L 0.583 31.174
                lineTo(x = 0.583f, y = 31.174f)
                // c -0.778 -0.778 -0.778 -2.051 0 -2.828
                curveToRelative(
                    dx1 = -0.778f,
                    dy1 = -0.778f,
                    dx2 = -0.778f,
                    dy2 = -2.051f,
                    dx3 = 0.0f,
                    dy3 = -2.828f,
                )
                // L 19.675 9.254
                lineTo(x = 19.675f, y = 9.254f)
                // c 0.778 -0.778 2.051 -0.778 2.828 0
                curveToRelative(
                    dx1 = 0.778f,
                    dy1 = -0.778f,
                    dx2 = 2.051f,
                    dy2 = -0.778f,
                    dx3 = 2.828f,
                    dy3 = 0.0f,
                )
                // l 4.243 4.243
                lineToRelative(dx = 4.243f, dy = 4.243f)
                // c 0.778 0.778 0.778 2.051 0 2.828
                curveToRelative(
                    dx1 = 0.778f,
                    dy1 = 0.778f,
                    dx2 = 0.778f,
                    dy2 = 2.051f,
                    dx3 = 0.0f,
                    dy3 = 2.828f,
                )
                // L 7.654 35.417
                lineTo(x = 7.654f, y = 35.417f)
                // c -0.777 0.777 -2.05 0.777 -2.828 0z
                curveToRelative(
                    dx1 = -0.777f,
                    dy1 = 0.777f,
                    dx2 = -2.05f,
                    dy2 = 0.777f,
                    dx3 = -2.828f,
                    dy3 = 0.0f,
                )
                close()
            }
            // M18.261 10.668 l7.071 7.07 -2.121 2.122 -7.071 -7.071z M4.12 24.81 l7.07 7.07 -2.12 2.122 -7.072 -7.07z
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 18.261 10.668
                moveTo(x = 18.261f, y = 10.668f)
                // l 7.071 7.07
                lineToRelative(dx = 7.071f, dy = 7.07f)
                // l -2.121 2.122
                lineToRelative(dx = -2.121f, dy = 2.122f)
                // l -7.071 -7.071z
                lineToRelative(dx = -7.071f, dy = -7.071f)
                close()
                // M 4.12 24.81
                moveTo(x = 4.12f, y = 24.81f)
                // l 7.07 7.07
                lineToRelative(dx = 7.07f, dy = 7.07f)
                // l -2.12 2.122
                lineToRelative(dx = -2.12f, dy = 2.122f)
                // l -7.072 -7.07z
                lineToRelative(dx = -7.072f, dy = -7.07f)
                close()
            }
            // M22.504 9.254 l1.414 1.414 -2.828 2.828 -1.415 -1.414z M3.412 28.346 l1.414 1.414 -2.828 2.828 -1.414 -1.414z M17.554 14.204 l1.414 1.414 -12.02 12.02 -1.415 -1.414z
            path(
                fill = SolidColor(Color(0xFFEA596E)),
            ) {
                // M 22.504 9.254
                moveTo(x = 22.504f, y = 9.254f)
                // l 1.414 1.414
                lineToRelative(dx = 1.414f, dy = 1.414f)
                // l -2.828 2.828
                lineToRelative(dx = -2.828f, dy = 2.828f)
                // l -1.415 -1.414z
                lineToRelative(dx = -1.415f, dy = -1.414f)
                close()
                // M 3.412 28.346
                moveTo(x = 3.412f, y = 28.346f)
                // l 1.414 1.414
                lineToRelative(dx = 1.414f, dy = 1.414f)
                // l -2.828 2.828
                lineToRelative(dx = -2.828f, dy = 2.828f)
                // l -1.414 -1.414z
                lineToRelative(dx = -1.414f, dy = -1.414f)
                close()
                // M 17.554 14.204
                moveTo(x = 17.554f, y = 14.204f)
                // l 1.414 1.414
                lineToRelative(dx = 1.414f, dy = 1.414f)
                // l -12.02 12.02
                lineToRelative(dx = -12.02f, dy = 12.02f)
                // l -1.415 -1.414z
                lineToRelative(dx = -1.415f, dy = -1.414f)
                close()
            }
            // M19.675 12.082 l1.415 1.414 -2.122 2.122 -1.414 -1.415z M5.534 26.224 l1.414 1.415 -2.122 2.12 -1.414 -1.413z
            path(
                fill = SolidColor(Color(0xFFFFD983)),
            ) {
                // M 19.675 12.082
                moveTo(x = 19.675f, y = 12.082f)
                // l 1.415 1.414
                lineToRelative(dx = 1.415f, dy = 1.414f)
                // l -2.122 2.122
                lineToRelative(dx = -2.122f, dy = 2.122f)
                // l -1.414 -1.415z
                lineToRelative(dx = -1.414f, dy = -1.415f)
                close()
                // M 5.534 26.224
                moveTo(x = 5.534f, y = 26.224f)
                // l 1.414 1.415
                lineToRelative(dx = 1.414f, dy = 1.415f)
                // l -2.122 2.12
                lineToRelative(dx = -2.122f, dy = 2.12f)
                // l -1.414 -1.413z
                lineToRelative(dx = -1.414f, dy = -1.413f)
                close()
            }
        }.build().also { _emoji1f9e8 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f9e8: ImageVector? = null
