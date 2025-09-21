package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f18e: ImageVector
    get() {
        val current = _emoji1f18e
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f18e",
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
            // M7.15 10.072 c0.476 -1.288 1.567 -2.324 2.996 -2.324 1.483 0 2.52 0.979 2.996 2.324 l5.488 15.231 c0.168 0.448 0.224 0.84 0.224 1.036 0 1.092 -0.896 1.848 -1.932 1.848 -1.177 0 -1.765 -0.616 -2.044 -1.456 L14 24 L6.28 24 l-0.866 2.703 c-0.28 0.868 -0.868 1.484 -2.016 1.484 -1.12 0 -2.072 -0.84 -2.072 -1.96 0 -0.448 0.14 -0.784 0.196 -0.924 L7.15 10.072z M7.458 20.235 h5.32 l-2.604 -8.119 h-0.056 l-2.66 8.119z M20 10.1 c0 -1.344 0.924 -2.1 2.212 -2.1 h5.376 c2.912 0 5.265 1.96 5.265 4.928 0 1.96 -0.812 3.276 -2.605 4.116 v0.056 c2.38 0.336 4.256 2.424 4.256 4.859 0 3.948 -2.632 6.041 -6.496 6.041 L22.24 28 c-1.288 0 -2.24 -0.876 -2.24 -2.192 L20 10.1z M24.2 16 h2.184 c1.372 0 2.268 -0.815 2.268 -2.216 0 -1.315 -1.036 -2.088 -2.268 -2.088 L24.2 11.696 L24.2 16z M24.2 24 h3.304 c1.513 0 2.632 -0.729 2.632 -2.296 0 -1.315 -1.008 -2.112 -2.968 -2.112 L24.2 19.592 L24.2 24z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 7.15 10.072
                moveTo(x = 7.15f, y = 10.072f)
                // c 0.476 -1.288 1.567 -2.324 2.996 -2.324
                curveToRelative(
                    dx1 = 0.476f,
                    dy1 = -1.288f,
                    dx2 = 1.567f,
                    dy2 = -2.324f,
                    dx3 = 2.996f,
                    dy3 = -2.324f,
                )
                // c 1.483 0 2.52 0.979 2.996 2.324
                curveToRelative(
                    dx1 = 1.483f,
                    dy1 = 0.0f,
                    dx2 = 2.52f,
                    dy2 = 0.979f,
                    dx3 = 2.996f,
                    dy3 = 2.324f,
                )
                // l 5.488 15.231
                lineToRelative(dx = 5.488f, dy = 15.231f)
                // c 0.168 0.448 0.224 0.84 0.224 1.036
                curveToRelative(
                    dx1 = 0.168f,
                    dy1 = 0.448f,
                    dx2 = 0.224f,
                    dy2 = 0.84f,
                    dx3 = 0.224f,
                    dy3 = 1.036f,
                )
                // c 0 1.092 -0.896 1.848 -1.932 1.848
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.092f,
                    dx2 = -0.896f,
                    dy2 = 1.848f,
                    dx3 = -1.932f,
                    dy3 = 1.848f,
                )
                // c -1.177 0 -1.765 -0.616 -2.044 -1.456
                curveToRelative(
                    dx1 = -1.177f,
                    dy1 = 0.0f,
                    dx2 = -1.765f,
                    dy2 = -0.616f,
                    dx3 = -2.044f,
                    dy3 = -1.456f,
                )
                // L 14 24
                lineTo(x = 14.0f, y = 24.0f)
                // L 6.28 24
                lineTo(x = 6.28f, y = 24.0f)
                // l -0.866 2.703
                lineToRelative(dx = -0.866f, dy = 2.703f)
                // c -0.28 0.868 -0.868 1.484 -2.016 1.484
                curveToRelative(
                    dx1 = -0.28f,
                    dy1 = 0.868f,
                    dx2 = -0.868f,
                    dy2 = 1.484f,
                    dx3 = -2.016f,
                    dy3 = 1.484f,
                )
                // c -1.12 0 -2.072 -0.84 -2.072 -1.96
                curveToRelative(
                    dx1 = -1.12f,
                    dy1 = 0.0f,
                    dx2 = -2.072f,
                    dy2 = -0.84f,
                    dx3 = -2.072f,
                    dy3 = -1.96f,
                )
                // c 0 -0.448 0.14 -0.784 0.196 -0.924
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.448f,
                    dx2 = 0.14f,
                    dy2 = -0.784f,
                    dx3 = 0.196f,
                    dy3 = -0.924f,
                )
                // L 7.15 10.072z
                lineTo(x = 7.15f, y = 10.072f)
                close()
                // M 7.458 20.235
                moveTo(x = 7.458f, y = 20.235f)
                // h 5.32
                horizontalLineToRelative(dx = 5.32f)
                // l -2.604 -8.119
                lineToRelative(dx = -2.604f, dy = -8.119f)
                // h -0.056
                horizontalLineToRelative(dx = -0.056f)
                // l -2.66 8.119z
                lineToRelative(dx = -2.66f, dy = 8.119f)
                close()
                // M 20 10.1
                moveTo(x = 20.0f, y = 10.1f)
                // c 0 -1.344 0.924 -2.1 2.212 -2.1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.344f,
                    dx2 = 0.924f,
                    dy2 = -2.1f,
                    dx3 = 2.212f,
                    dy3 = -2.1f,
                )
                // h 5.376
                horizontalLineToRelative(dx = 5.376f)
                // c 2.912 0 5.265 1.96 5.265 4.928
                curveToRelative(
                    dx1 = 2.912f,
                    dy1 = 0.0f,
                    dx2 = 5.265f,
                    dy2 = 1.96f,
                    dx3 = 5.265f,
                    dy3 = 4.928f,
                )
                // c 0 1.96 -0.812 3.276 -2.605 4.116
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.96f,
                    dx2 = -0.812f,
                    dy2 = 3.276f,
                    dx3 = -2.605f,
                    dy3 = 4.116f,
                )
                // v 0.056
                verticalLineToRelative(dy = 0.056f)
                // c 2.38 0.336 4.256 2.424 4.256 4.859
                curveToRelative(
                    dx1 = 2.38f,
                    dy1 = 0.336f,
                    dx2 = 4.256f,
                    dy2 = 2.424f,
                    dx3 = 4.256f,
                    dy3 = 4.859f,
                )
                // c 0 3.948 -2.632 6.041 -6.496 6.041
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.948f,
                    dx2 = -2.632f,
                    dy2 = 6.041f,
                    dx3 = -6.496f,
                    dy3 = 6.041f,
                )
                // L 22.24 28
                lineTo(x = 22.24f, y = 28.0f)
                // c -1.288 0 -2.24 -0.876 -2.24 -2.192
                curveToRelative(
                    dx1 = -1.288f,
                    dy1 = 0.0f,
                    dx2 = -2.24f,
                    dy2 = -0.876f,
                    dx3 = -2.24f,
                    dy3 = -2.192f,
                )
                // L 20 10.1z
                lineTo(x = 20.0f, y = 10.1f)
                close()
                // M 24.2 16
                moveTo(x = 24.2f, y = 16.0f)
                // h 2.184
                horizontalLineToRelative(dx = 2.184f)
                // c 1.372 0 2.268 -0.815 2.268 -2.216
                curveToRelative(
                    dx1 = 1.372f,
                    dy1 = 0.0f,
                    dx2 = 2.268f,
                    dy2 = -0.815f,
                    dx3 = 2.268f,
                    dy3 = -2.216f,
                )
                // c 0 -1.315 -1.036 -2.088 -2.268 -2.088
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.315f,
                    dx2 = -1.036f,
                    dy2 = -2.088f,
                    dx3 = -2.268f,
                    dy3 = -2.088f,
                )
                // L 24.2 11.696
                lineTo(x = 24.2f, y = 11.696f)
                // L 24.2 16z
                lineTo(x = 24.2f, y = 16.0f)
                close()
                // M 24.2 24
                moveTo(x = 24.2f, y = 24.0f)
                // h 3.304
                horizontalLineToRelative(dx = 3.304f)
                // c 1.513 0 2.632 -0.729 2.632 -2.296
                curveToRelative(
                    dx1 = 1.513f,
                    dy1 = 0.0f,
                    dx2 = 2.632f,
                    dy2 = -0.729f,
                    dx3 = 2.632f,
                    dy3 = -2.296f,
                )
                // c 0 -1.315 -1.008 -2.112 -2.968 -2.112
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.315f,
                    dx2 = -1.008f,
                    dy2 = -2.112f,
                    dx3 = -2.968f,
                    dy3 = -2.112f,
                )
                // L 24.2 19.592
                lineTo(x = 24.2f, y = 19.592f)
                // L 24.2 24z
                lineTo(x = 24.2f, y = 24.0f)
                close()
            }
        }.build().also { _emoji1f18e = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f18e: ImageVector? = null
