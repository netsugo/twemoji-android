package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1f6: ImageVector
    get() {
        val current = _emoji1f1f6
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1f6",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 32 c0 2.209 -1.791 4 -4 4 H4 c-2.209 0 -4 -1.791 -4 -4 V4 c0 -2.209 1.791 -4 4 -4 h28 c2.209 0 4 1.791 4 4 v28z
            path(
                fill = SolidColor(Color(0xFF3B88C3)),
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
            // M23.459 28.008 c-1.519 0.868 -3.348 1.364 -5.457 1.364 -6.294 0 -10.666 -4.992 -10.666 -11.41 0 -6.449 4.341 -11.41 10.666 -11.41 6.232 0 10.666 5.116 10.666 11.41 0 2.728 -0.713 5.209 -2.078 7.162 l1.768 1.52 c0.59 0.527 1.086 1.023 1.086 1.892 0 1.085 -1.086 1.953 -2.139 1.953 -0.684 0 -1.24 -0.279 -2.078 -0.992 l-1.768 -1.489z M23.088 21.931 c0.526 -1.179 0.744 -2.542 0.744 -3.969 0 -3.689 -1.954 -7.131 -5.83 -7.131 -3.876 0 -5.829 3.379 -5.829 7.131 0 3.782 1.891 7.132 5.829 7.132 0.713 0 1.365 -0.094 1.984 -0.218 l-1.116 -1.085 c-0.341 -0.311 -0.589 -0.807 -0.589 -1.24 0 -1.209 0.838 -2.232 2.108 -2.232 0.435 0 0.806 0.155 1.179 0.403 l1.52 1.209z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 23.459 28.008
                moveTo(x = 23.459f, y = 28.008f)
                // c -1.519 0.868 -3.348 1.364 -5.457 1.364
                curveToRelative(
                    dx1 = -1.519f,
                    dy1 = 0.868f,
                    dx2 = -3.348f,
                    dy2 = 1.364f,
                    dx3 = -5.457f,
                    dy3 = 1.364f,
                )
                // c -6.294 0 -10.666 -4.992 -10.666 -11.41
                curveToRelative(
                    dx1 = -6.294f,
                    dy1 = 0.0f,
                    dx2 = -10.666f,
                    dy2 = -4.992f,
                    dx3 = -10.666f,
                    dy3 = -11.41f,
                )
                // c 0 -6.449 4.341 -11.41 10.666 -11.41
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -6.449f,
                    dx2 = 4.341f,
                    dy2 = -11.41f,
                    dx3 = 10.666f,
                    dy3 = -11.41f,
                )
                // c 6.232 0 10.666 5.116 10.666 11.41
                curveToRelative(
                    dx1 = 6.232f,
                    dy1 = 0.0f,
                    dx2 = 10.666f,
                    dy2 = 5.116f,
                    dx3 = 10.666f,
                    dy3 = 11.41f,
                )
                // c 0 2.728 -0.713 5.209 -2.078 7.162
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.728f,
                    dx2 = -0.713f,
                    dy2 = 5.209f,
                    dx3 = -2.078f,
                    dy3 = 7.162f,
                )
                // l 1.768 1.52
                lineToRelative(dx = 1.768f, dy = 1.52f)
                // c 0.59 0.527 1.086 1.023 1.086 1.892
                curveToRelative(
                    dx1 = 0.59f,
                    dy1 = 0.527f,
                    dx2 = 1.086f,
                    dy2 = 1.023f,
                    dx3 = 1.086f,
                    dy3 = 1.892f,
                )
                // c 0 1.085 -1.086 1.953 -2.139 1.953
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.085f,
                    dx2 = -1.086f,
                    dy2 = 1.953f,
                    dx3 = -2.139f,
                    dy3 = 1.953f,
                )
                // c -0.684 0 -1.24 -0.279 -2.078 -0.992
                curveToRelative(
                    dx1 = -0.684f,
                    dy1 = 0.0f,
                    dx2 = -1.24f,
                    dy2 = -0.279f,
                    dx3 = -2.078f,
                    dy3 = -0.992f,
                )
                // l -1.768 -1.489z
                lineToRelative(dx = -1.768f, dy = -1.489f)
                close()
                // M 23.088 21.931
                moveTo(x = 23.088f, y = 21.931f)
                // c 0.526 -1.179 0.744 -2.542 0.744 -3.969
                curveToRelative(
                    dx1 = 0.526f,
                    dy1 = -1.179f,
                    dx2 = 0.744f,
                    dy2 = -2.542f,
                    dx3 = 0.744f,
                    dy3 = -3.969f,
                )
                // c 0 -3.689 -1.954 -7.131 -5.83 -7.131
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.689f,
                    dx2 = -1.954f,
                    dy2 = -7.131f,
                    dx3 = -5.83f,
                    dy3 = -7.131f,
                )
                // c -3.876 0 -5.829 3.379 -5.829 7.131
                curveToRelative(
                    dx1 = -3.876f,
                    dy1 = 0.0f,
                    dx2 = -5.829f,
                    dy2 = 3.379f,
                    dx3 = -5.829f,
                    dy3 = 7.131f,
                )
                // c 0 3.782 1.891 7.132 5.829 7.132
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.782f,
                    dx2 = 1.891f,
                    dy2 = 7.132f,
                    dx3 = 5.829f,
                    dy3 = 7.132f,
                )
                // c 0.713 0 1.365 -0.094 1.984 -0.218
                curveToRelative(
                    dx1 = 0.713f,
                    dy1 = 0.0f,
                    dx2 = 1.365f,
                    dy2 = -0.094f,
                    dx3 = 1.984f,
                    dy3 = -0.218f,
                )
                // l -1.116 -1.085
                lineToRelative(dx = -1.116f, dy = -1.085f)
                // c -0.341 -0.311 -0.589 -0.807 -0.589 -1.24
                curveToRelative(
                    dx1 = -0.341f,
                    dy1 = -0.311f,
                    dx2 = -0.589f,
                    dy2 = -0.807f,
                    dx3 = -0.589f,
                    dy3 = -1.24f,
                )
                // c 0 -1.209 0.838 -2.232 2.108 -2.232
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.209f,
                    dx2 = 0.838f,
                    dy2 = -2.232f,
                    dx3 = 2.108f,
                    dy3 = -2.232f,
                )
                // c 0.435 0 0.806 0.155 1.179 0.403
                curveToRelative(
                    dx1 = 0.435f,
                    dy1 = 0.0f,
                    dx2 = 0.806f,
                    dy2 = 0.155f,
                    dx3 = 1.179f,
                    dy3 = 0.403f,
                )
                // l 1.52 1.209z
                lineToRelative(dx = 1.52f, dy = 1.209f)
                close()
            }
        }.build().also { _emoji1f1f6 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1f6: ImageVector? = null
