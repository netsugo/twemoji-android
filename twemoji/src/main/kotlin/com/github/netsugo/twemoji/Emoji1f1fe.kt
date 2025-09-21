package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1fe: ImageVector
    get() {
        val current = _emoji1f1fe
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1fe",
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
            // M26.621 9.001 c0 -1.24 -0.93 -2.263 -2.232 -2.263 -0.807 0 -1.52 0.341 -1.922 0.93 l-4.465 6.48 -4.465 -6.48 c-0.403 -0.589 -1.116 -0.93 -1.922 -0.93 -1.302 0 -2.232 1.023 -2.232 2.263 0 0.496 0.155 0.992 0.434 1.396 L15 17.692 v8.417 C15 27.706 16.294 29 17.891 29 h0.219 c1.596 0 2.89 -1.294 2.89 -2.891 v-8.414 l5.188 -7.299 c0.279 -0.403 0.433 -0.899 0.433 -1.395z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 26.621 9.001
                moveTo(x = 26.621f, y = 9.001f)
                // c 0 -1.24 -0.93 -2.263 -2.232 -2.263
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.24f,
                    dx2 = -0.93f,
                    dy2 = -2.263f,
                    dx3 = -2.232f,
                    dy3 = -2.263f,
                )
                // c -0.807 0 -1.52 0.341 -1.922 0.93
                curveToRelative(
                    dx1 = -0.807f,
                    dy1 = 0.0f,
                    dx2 = -1.52f,
                    dy2 = 0.341f,
                    dx3 = -1.922f,
                    dy3 = 0.93f,
                )
                // l -4.465 6.48
                lineToRelative(dx = -4.465f, dy = 6.48f)
                // l -4.465 -6.48
                lineToRelative(dx = -4.465f, dy = -6.48f)
                // c -0.403 -0.589 -1.116 -0.93 -1.922 -0.93
                curveToRelative(
                    dx1 = -0.403f,
                    dy1 = -0.589f,
                    dx2 = -1.116f,
                    dy2 = -0.93f,
                    dx3 = -1.922f,
                    dy3 = -0.93f,
                )
                // c -1.302 0 -2.232 1.023 -2.232 2.263
                curveToRelative(
                    dx1 = -1.302f,
                    dy1 = 0.0f,
                    dx2 = -2.232f,
                    dy2 = 1.023f,
                    dx3 = -2.232f,
                    dy3 = 2.263f,
                )
                // c 0 0.496 0.155 0.992 0.434 1.396
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.496f,
                    dx2 = 0.155f,
                    dy2 = 0.992f,
                    dx3 = 0.434f,
                    dy3 = 1.396f,
                )
                // L 15 17.692
                lineTo(x = 15.0f, y = 17.692f)
                // v 8.417
                verticalLineToRelative(dy = 8.417f)
                // C 15 27.706 16.294 29 17.891 29
                curveTo(
                    x1 = 15.0f,
                    y1 = 27.706f,
                    x2 = 16.294f,
                    y2 = 29.0f,
                    x3 = 17.891f,
                    y3 = 29.0f,
                )
                // h 0.219
                horizontalLineToRelative(dx = 0.219f)
                // c 1.596 0 2.89 -1.294 2.89 -2.891
                curveToRelative(
                    dx1 = 1.596f,
                    dy1 = 0.0f,
                    dx2 = 2.89f,
                    dy2 = -1.294f,
                    dx3 = 2.89f,
                    dy3 = -2.891f,
                )
                // v -8.414
                verticalLineToRelative(dy = -8.414f)
                // l 5.188 -7.299
                lineToRelative(dx = 5.188f, dy = -7.299f)
                // c 0.279 -0.403 0.433 -0.899 0.433 -1.395z
                curveToRelative(
                    dx1 = 0.279f,
                    dy1 = -0.403f,
                    dx2 = 0.433f,
                    dy2 = -0.899f,
                    dx3 = 0.433f,
                    dy3 = -1.395f,
                )
                close()
            }
        }.build().also { _emoji1f1fe = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1fe: ImageVector? = null
