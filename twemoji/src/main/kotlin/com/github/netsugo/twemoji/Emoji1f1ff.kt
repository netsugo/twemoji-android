package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1ff: ImageVector
    get() {
        val current = _emoji1f1ff
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1ff",
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
            // M24.281 24.907 c1.301 0 2.232 0.713 2.232 2.046 0 1.179 -1.117 2.047 -2.232 2.047 H12.095 c-1.643 0 -2.604 -0.93 -2.604 -2.232 0 -0.62 0.217 -1.24 0.62 -1.799 l9.984 -13.952 H11.94 c-1.24 0 -2.17 -0.713 -2.17 -1.984 0 -1.178 0.992 -2.108 2.17 -2.108 h11.349 c1.797 0 2.603 1.147 2.603 2.232 0 0.682 -0.279 1.457 -0.682 1.984 l-9.922 13.767 h8.993z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 24.281 24.907
                moveTo(x = 24.281f, y = 24.907f)
                // c 1.301 0 2.232 0.713 2.232 2.046
                curveToRelative(
                    dx1 = 1.301f,
                    dy1 = 0.0f,
                    dx2 = 2.232f,
                    dy2 = 0.713f,
                    dx3 = 2.232f,
                    dy3 = 2.046f,
                )
                // c 0 1.179 -1.117 2.047 -2.232 2.047
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.179f,
                    dx2 = -1.117f,
                    dy2 = 2.047f,
                    dx3 = -2.232f,
                    dy3 = 2.047f,
                )
                // H 12.095
                horizontalLineTo(x = 12.095f)
                // c -1.643 0 -2.604 -0.93 -2.604 -2.232
                curveToRelative(
                    dx1 = -1.643f,
                    dy1 = 0.0f,
                    dx2 = -2.604f,
                    dy2 = -0.93f,
                    dx3 = -2.604f,
                    dy3 = -2.232f,
                )
                // c 0 -0.62 0.217 -1.24 0.62 -1.799
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.62f,
                    dx2 = 0.217f,
                    dy2 = -1.24f,
                    dx3 = 0.62f,
                    dy3 = -1.799f,
                )
                // l 9.984 -13.952
                lineToRelative(dx = 9.984f, dy = -13.952f)
                // H 11.94
                horizontalLineTo(x = 11.94f)
                // c -1.24 0 -2.17 -0.713 -2.17 -1.984
                curveToRelative(
                    dx1 = -1.24f,
                    dy1 = 0.0f,
                    dx2 = -2.17f,
                    dy2 = -0.713f,
                    dx3 = -2.17f,
                    dy3 = -1.984f,
                )
                // c 0 -1.178 0.992 -2.108 2.17 -2.108
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.178f,
                    dx2 = 0.992f,
                    dy2 = -2.108f,
                    dx3 = 2.17f,
                    dy3 = -2.108f,
                )
                // h 11.349
                horizontalLineToRelative(dx = 11.349f)
                // c 1.797 0 2.603 1.147 2.603 2.232
                curveToRelative(
                    dx1 = 1.797f,
                    dy1 = 0.0f,
                    dx2 = 2.603f,
                    dy2 = 1.147f,
                    dx3 = 2.603f,
                    dy3 = 2.232f,
                )
                // c 0 0.682 -0.279 1.457 -0.682 1.984
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.682f,
                    dx2 = -0.279f,
                    dy2 = 1.457f,
                    dx3 = -0.682f,
                    dy3 = 1.984f,
                )
                // l -9.922 13.767
                lineToRelative(dx = -9.922f, dy = 13.767f)
                // h 8.993z
                horizontalLineToRelative(dx = 8.993f)
                close()
            }
        }.build().also { _emoji1f1ff = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1ff: ImageVector? = null
