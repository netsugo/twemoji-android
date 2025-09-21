package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji2648: ImageVector
    get() {
        val current = _emoji2648
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji2648",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 32 c0 2.209 -1.791 4 -4 4 H4 c-2.209 0 -4 -1.791 -4 -4 V4 c0 -2.209 1.791 -4 4 -4 h28 c2.209 0 4 1.791 4 4 v28z
            path(
                fill = SolidColor(Color(0xFF9266CC)),
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
            // M30.069 7.711 c-0.863 -1.397 -2.322 -2.188 -4.033 -2.188 -3.595 0 -5.682 3.404 -6.456 10.358 C19.438 17.166 18.542 24.447 18 28 c0 0 -1.596 -10.834 -1.739 -12.119 -0.773 -6.954 -2.86 -10.358 -6.455 -10.358 -1.711 0 -3.17 0.79 -4.033 2.188 -0.918 1.485 -1.026 3.478 -0.282 4.966 0.37 0.741 1.274 1.038 2.017 0.668 0.741 -0.371 1.043 -1.273 0.673 -2.014 -0.24 -0.481 -0.527 -2.956 1.66 -2.956 2.196 0 3.197 5.019 3.688 7.791 C14.021 18.938 15.999 29.994 16 30 c0.229 0.938 0.857 2 2 2 s1.833 -1.021 1.984 -2 c0.006 -0.041 1.652 -10.023 2.328 -13.834 0.492 -2.772 1.492 -7.791 3.688 -7.791 2.187 0 1.9 2.475 1.66 2.956 -0.37 0.741 -0.068 1.644 0.673 2.014 0.743 0.371 1.647 0.073 2.017 -0.668 0.745 -1.488 0.637 -3.481 -0.281 -4.966z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 30.069 7.711
                moveTo(x = 30.069f, y = 7.711f)
                // c -0.863 -1.397 -2.322 -2.188 -4.033 -2.188
                curveToRelative(
                    dx1 = -0.863f,
                    dy1 = -1.397f,
                    dx2 = -2.322f,
                    dy2 = -2.188f,
                    dx3 = -4.033f,
                    dy3 = -2.188f,
                )
                // c -3.595 0 -5.682 3.404 -6.456 10.358
                curveToRelative(
                    dx1 = -3.595f,
                    dy1 = 0.0f,
                    dx2 = -5.682f,
                    dy2 = 3.404f,
                    dx3 = -6.456f,
                    dy3 = 10.358f,
                )
                // C 19.438 17.166 18.542 24.447 18 28
                curveTo(
                    x1 = 19.438f,
                    y1 = 17.166f,
                    x2 = 18.542f,
                    y2 = 24.447f,
                    x3 = 18.0f,
                    y3 = 28.0f,
                )
                // c 0 0 -1.596 -10.834 -1.739 -12.119
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -1.596f,
                    dy2 = -10.834f,
                    dx3 = -1.739f,
                    dy3 = -12.119f,
                )
                // c -0.773 -6.954 -2.86 -10.358 -6.455 -10.358
                curveToRelative(
                    dx1 = -0.773f,
                    dy1 = -6.954f,
                    dx2 = -2.86f,
                    dy2 = -10.358f,
                    dx3 = -6.455f,
                    dy3 = -10.358f,
                )
                // c -1.711 0 -3.17 0.79 -4.033 2.188
                curveToRelative(
                    dx1 = -1.711f,
                    dy1 = 0.0f,
                    dx2 = -3.17f,
                    dy2 = 0.79f,
                    dx3 = -4.033f,
                    dy3 = 2.188f,
                )
                // c -0.918 1.485 -1.026 3.478 -0.282 4.966
                curveToRelative(
                    dx1 = -0.918f,
                    dy1 = 1.485f,
                    dx2 = -1.026f,
                    dy2 = 3.478f,
                    dx3 = -0.282f,
                    dy3 = 4.966f,
                )
                // c 0.37 0.741 1.274 1.038 2.017 0.668
                curveToRelative(
                    dx1 = 0.37f,
                    dy1 = 0.741f,
                    dx2 = 1.274f,
                    dy2 = 1.038f,
                    dx3 = 2.017f,
                    dy3 = 0.668f,
                )
                // c 0.741 -0.371 1.043 -1.273 0.673 -2.014
                curveToRelative(
                    dx1 = 0.741f,
                    dy1 = -0.371f,
                    dx2 = 1.043f,
                    dy2 = -1.273f,
                    dx3 = 0.673f,
                    dy3 = -2.014f,
                )
                // c -0.24 -0.481 -0.527 -2.956 1.66 -2.956
                curveToRelative(
                    dx1 = -0.24f,
                    dy1 = -0.481f,
                    dx2 = -0.527f,
                    dy2 = -2.956f,
                    dx3 = 1.66f,
                    dy3 = -2.956f,
                )
                // c 2.196 0 3.197 5.019 3.688 7.791
                curveToRelative(
                    dx1 = 2.196f,
                    dy1 = 0.0f,
                    dx2 = 3.197f,
                    dy2 = 5.019f,
                    dx3 = 3.688f,
                    dy3 = 7.791f,
                )
                // C 14.021 18.938 15.999 29.994 16 30
                curveTo(
                    x1 = 14.021f,
                    y1 = 18.938f,
                    x2 = 15.999f,
                    y2 = 29.994f,
                    x3 = 16.0f,
                    y3 = 30.0f,
                )
                // c 0.229 0.938 0.857 2 2 2
                curveToRelative(
                    dx1 = 0.229f,
                    dy1 = 0.938f,
                    dx2 = 0.857f,
                    dy2 = 2.0f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                // s 1.833 -1.021 1.984 -2
                reflectiveCurveToRelative(
                    dx1 = 1.833f,
                    dy1 = -1.021f,
                    dx2 = 1.984f,
                    dy2 = -2.0f,
                )
                // c 0.006 -0.041 1.652 -10.023 2.328 -13.834
                curveToRelative(
                    dx1 = 0.006f,
                    dy1 = -0.041f,
                    dx2 = 1.652f,
                    dy2 = -10.023f,
                    dx3 = 2.328f,
                    dy3 = -13.834f,
                )
                // c 0.492 -2.772 1.492 -7.791 3.688 -7.791
                curveToRelative(
                    dx1 = 0.492f,
                    dy1 = -2.772f,
                    dx2 = 1.492f,
                    dy2 = -7.791f,
                    dx3 = 3.688f,
                    dy3 = -7.791f,
                )
                // c 2.187 0 1.9 2.475 1.66 2.956
                curveToRelative(
                    dx1 = 2.187f,
                    dy1 = 0.0f,
                    dx2 = 1.9f,
                    dy2 = 2.475f,
                    dx3 = 1.66f,
                    dy3 = 2.956f,
                )
                // c -0.37 0.741 -0.068 1.644 0.673 2.014
                curveToRelative(
                    dx1 = -0.37f,
                    dy1 = 0.741f,
                    dx2 = -0.068f,
                    dy2 = 1.644f,
                    dx3 = 0.673f,
                    dy3 = 2.014f,
                )
                // c 0.743 0.371 1.647 0.073 2.017 -0.668
                curveToRelative(
                    dx1 = 0.743f,
                    dy1 = 0.371f,
                    dx2 = 1.647f,
                    dy2 = 0.073f,
                    dx3 = 2.017f,
                    dy3 = -0.668f,
                )
                // c 0.745 -1.488 0.637 -3.481 -0.281 -4.966z
                curveToRelative(
                    dx1 = 0.745f,
                    dy1 = -1.488f,
                    dx2 = 0.637f,
                    dy2 = -3.481f,
                    dx3 = -0.281f,
                    dy3 = -4.966f,
                )
                close()
            }
        }.build().also { _emoji2648 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji2648: ImageVector? = null
