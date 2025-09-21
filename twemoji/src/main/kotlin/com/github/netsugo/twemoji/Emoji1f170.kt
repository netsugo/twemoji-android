package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f170: ImageVector
    get() {
        val current = _emoji1f170
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f170",
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
            // M14.747 9.125 c0.527 -1.426 1.736 -2.573 3.317 -2.573 1.643 0 2.792 1.085 3.318 2.573 l6.077 16.867 c0.186 0.496 0.248 0.931 0.248 1.147 0 1.209 -0.992 2.046 -2.139 2.046 -1.303 0 -1.954 -0.682 -2.264 -1.611 l-0.931 -2.915 h-8.62 l-0.93 2.884 c-0.31 0.961 -0.961 1.642 -2.232 1.642 -1.24 0 -2.294 -0.93 -2.294 -2.17 0 -0.496 0.155 -0.868 0.217 -1.023 l6.233 -16.867z M15.087 20.381 h5.891 l-2.883 -8.992 h-0.062 l-2.946 8.992z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 14.747 9.125
                moveTo(x = 14.747f, y = 9.125f)
                // c 0.527 -1.426 1.736 -2.573 3.317 -2.573
                curveToRelative(
                    dx1 = 0.527f,
                    dy1 = -1.426f,
                    dx2 = 1.736f,
                    dy2 = -2.573f,
                    dx3 = 3.317f,
                    dy3 = -2.573f,
                )
                // c 1.643 0 2.792 1.085 3.318 2.573
                curveToRelative(
                    dx1 = 1.643f,
                    dy1 = 0.0f,
                    dx2 = 2.792f,
                    dy2 = 1.085f,
                    dx3 = 3.318f,
                    dy3 = 2.573f,
                )
                // l 6.077 16.867
                lineToRelative(dx = 6.077f, dy = 16.867f)
                // c 0.186 0.496 0.248 0.931 0.248 1.147
                curveToRelative(
                    dx1 = 0.186f,
                    dy1 = 0.496f,
                    dx2 = 0.248f,
                    dy2 = 0.931f,
                    dx3 = 0.248f,
                    dy3 = 1.147f,
                )
                // c 0 1.209 -0.992 2.046 -2.139 2.046
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.209f,
                    dx2 = -0.992f,
                    dy2 = 2.046f,
                    dx3 = -2.139f,
                    dy3 = 2.046f,
                )
                // c -1.303 0 -1.954 -0.682 -2.264 -1.611
                curveToRelative(
                    dx1 = -1.303f,
                    dy1 = 0.0f,
                    dx2 = -1.954f,
                    dy2 = -0.682f,
                    dx3 = -2.264f,
                    dy3 = -1.611f,
                )
                // l -0.931 -2.915
                lineToRelative(dx = -0.931f, dy = -2.915f)
                // h -8.62
                horizontalLineToRelative(dx = -8.62f)
                // l -0.93 2.884
                lineToRelative(dx = -0.93f, dy = 2.884f)
                // c -0.31 0.961 -0.961 1.642 -2.232 1.642
                curveToRelative(
                    dx1 = -0.31f,
                    dy1 = 0.961f,
                    dx2 = -0.961f,
                    dy2 = 1.642f,
                    dx3 = -2.232f,
                    dy3 = 1.642f,
                )
                // c -1.24 0 -2.294 -0.93 -2.294 -2.17
                curveToRelative(
                    dx1 = -1.24f,
                    dy1 = 0.0f,
                    dx2 = -2.294f,
                    dy2 = -0.93f,
                    dx3 = -2.294f,
                    dy3 = -2.17f,
                )
                // c 0 -0.496 0.155 -0.868 0.217 -1.023
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.496f,
                    dx2 = 0.155f,
                    dy2 = -0.868f,
                    dx3 = 0.217f,
                    dy3 = -1.023f,
                )
                // l 6.233 -16.867z
                lineToRelative(dx = 6.233f, dy = -16.867f)
                close()
                // M 15.087 20.381
                moveTo(x = 15.087f, y = 20.381f)
                // h 5.891
                horizontalLineToRelative(dx = 5.891f)
                // l -2.883 -8.992
                lineToRelative(dx = -2.883f, dy = -8.992f)
                // h -0.062
                horizontalLineToRelative(dx = -0.062f)
                // l -2.946 8.992z
                lineToRelative(dx = -2.946f, dy = 8.992f)
                close()
            }
        }.build().also { _emoji1f170 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f170: ImageVector? = null
