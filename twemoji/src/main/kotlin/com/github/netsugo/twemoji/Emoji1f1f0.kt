package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1f0: ImageVector
    get() {
        val current = _emoji1f1f0
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1f0",
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
            // M9.925 9.032 c0 -1.271 0.93 -2.294 2.325 -2.294 1.333 0 2.325 0.868 2.325 2.294 v6.697 l7.627 -8.124 c0.342 -0.372 0.93 -0.868 1.799 -0.868 1.178 0 2.295 0.899 2.295 2.232 0 0.806 -0.496 1.457 -1.52 2.48 l-5.861 5.767 7.162 7.473 c0.744 0.744 1.303 1.426 1.303 2.357 0 1.457 -1.146 2.139 -2.418 2.139 -0.898 0 -1.488 -0.526 -2.357 -1.457 l-8.031 -8.682 v7.906 c0 1.21 -0.93 2.232 -2.325 2.232 -1.333 0 -2.325 -0.867 -2.325 -2.232 V9.032z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 9.925 9.032
                moveTo(x = 9.925f, y = 9.032f)
                // c 0 -1.271 0.93 -2.294 2.325 -2.294
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.271f,
                    dx2 = 0.93f,
                    dy2 = -2.294f,
                    dx3 = 2.325f,
                    dy3 = -2.294f,
                )
                // c 1.333 0 2.325 0.868 2.325 2.294
                curveToRelative(
                    dx1 = 1.333f,
                    dy1 = 0.0f,
                    dx2 = 2.325f,
                    dy2 = 0.868f,
                    dx3 = 2.325f,
                    dy3 = 2.294f,
                )
                // v 6.697
                verticalLineToRelative(dy = 6.697f)
                // l 7.627 -8.124
                lineToRelative(dx = 7.627f, dy = -8.124f)
                // c 0.342 -0.372 0.93 -0.868 1.799 -0.868
                curveToRelative(
                    dx1 = 0.342f,
                    dy1 = -0.372f,
                    dx2 = 0.93f,
                    dy2 = -0.868f,
                    dx3 = 1.799f,
                    dy3 = -0.868f,
                )
                // c 1.178 0 2.295 0.899 2.295 2.232
                curveToRelative(
                    dx1 = 1.178f,
                    dy1 = 0.0f,
                    dx2 = 2.295f,
                    dy2 = 0.899f,
                    dx3 = 2.295f,
                    dy3 = 2.232f,
                )
                // c 0 0.806 -0.496 1.457 -1.52 2.48
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.806f,
                    dx2 = -0.496f,
                    dy2 = 1.457f,
                    dx3 = -1.52f,
                    dy3 = 2.48f,
                )
                // l -5.861 5.767
                lineToRelative(dx = -5.861f, dy = 5.767f)
                // l 7.162 7.473
                lineToRelative(dx = 7.162f, dy = 7.473f)
                // c 0.744 0.744 1.303 1.426 1.303 2.357
                curveToRelative(
                    dx1 = 0.744f,
                    dy1 = 0.744f,
                    dx2 = 1.303f,
                    dy2 = 1.426f,
                    dx3 = 1.303f,
                    dy3 = 2.357f,
                )
                // c 0 1.457 -1.146 2.139 -2.418 2.139
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.457f,
                    dx2 = -1.146f,
                    dy2 = 2.139f,
                    dx3 = -2.418f,
                    dy3 = 2.139f,
                )
                // c -0.898 0 -1.488 -0.526 -2.357 -1.457
                curveToRelative(
                    dx1 = -0.898f,
                    dy1 = 0.0f,
                    dx2 = -1.488f,
                    dy2 = -0.526f,
                    dx3 = -2.357f,
                    dy3 = -1.457f,
                )
                // l -8.031 -8.682
                lineToRelative(dx = -8.031f, dy = -8.682f)
                // v 7.906
                verticalLineToRelative(dy = 7.906f)
                // c 0 1.21 -0.93 2.232 -2.325 2.232
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.21f,
                    dx2 = -0.93f,
                    dy2 = 2.232f,
                    dx3 = -2.325f,
                    dy3 = 2.232f,
                )
                // c -1.333 0 -2.325 -0.867 -2.325 -2.232
                curveToRelative(
                    dx1 = -1.333f,
                    dy1 = 0.0f,
                    dx2 = -2.325f,
                    dy2 = -0.867f,
                    dx3 = -2.325f,
                    dy3 = -2.232f,
                )
                // V 9.032z
                verticalLineTo(y = 9.032f)
                close()
            }
        }.build().also { _emoji1f1f0 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1f0: ImageVector? = null
