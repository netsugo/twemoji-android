package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1e7: ImageVector
    get() {
        val current = _emoji1f1e7
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1e7",
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
            // M10.498 9.249 c0 -1.488 1.023 -2.325 2.449 -2.325 L18.9 6.924 c3.224 0 5.83 2.17 5.83 5.457 0 2.17 -0.9 3.628 -2.885 4.558 v0.062 c2.637 0.372 4.713 2.573 4.713 5.271 0 4.372 -2.914 6.729 -7.193 6.729 h-6.386 c-1.427 0 -2.481 -0.899 -2.481 -2.356 L10.498 9.249z M15.149 15.667 h2.419 c1.519 0 2.511 -0.899 2.511 -2.45 0 -1.457 -1.147 -2.201 -2.511 -2.201 h-2.419 v4.651z M15.149 24.907 h3.659 c1.674 0 2.915 -0.961 2.915 -2.697 0 -1.458 -1.117 -2.45 -3.287 -2.45 h-3.287 v5.147z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 10.498 9.249
                moveTo(x = 10.498f, y = 9.249f)
                // c 0 -1.488 1.023 -2.325 2.449 -2.325
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.488f,
                    dx2 = 1.023f,
                    dy2 = -2.325f,
                    dx3 = 2.449f,
                    dy3 = -2.325f,
                )
                // L 18.9 6.924
                lineTo(x = 18.9f, y = 6.924f)
                // c 3.224 0 5.83 2.17 5.83 5.457
                curveToRelative(
                    dx1 = 3.224f,
                    dy1 = 0.0f,
                    dx2 = 5.83f,
                    dy2 = 2.17f,
                    dx3 = 5.83f,
                    dy3 = 5.457f,
                )
                // c 0 2.17 -0.9 3.628 -2.885 4.558
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.17f,
                    dx2 = -0.9f,
                    dy2 = 3.628f,
                    dx3 = -2.885f,
                    dy3 = 4.558f,
                )
                // v 0.062
                verticalLineToRelative(dy = 0.062f)
                // c 2.637 0.372 4.713 2.573 4.713 5.271
                curveToRelative(
                    dx1 = 2.637f,
                    dy1 = 0.372f,
                    dx2 = 4.713f,
                    dy2 = 2.573f,
                    dx3 = 4.713f,
                    dy3 = 5.271f,
                )
                // c 0 4.372 -2.914 6.729 -7.193 6.729
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.372f,
                    dx2 = -2.914f,
                    dy2 = 6.729f,
                    dx3 = -7.193f,
                    dy3 = 6.729f,
                )
                // h -6.386
                horizontalLineToRelative(dx = -6.386f)
                // c -1.427 0 -2.481 -0.899 -2.481 -2.356
                curveToRelative(
                    dx1 = -1.427f,
                    dy1 = 0.0f,
                    dx2 = -2.481f,
                    dy2 = -0.899f,
                    dx3 = -2.481f,
                    dy3 = -2.356f,
                )
                // L 10.498 9.249z
                lineTo(x = 10.498f, y = 9.249f)
                close()
                // M 15.149 15.667
                moveTo(x = 15.149f, y = 15.667f)
                // h 2.419
                horizontalLineToRelative(dx = 2.419f)
                // c 1.519 0 2.511 -0.899 2.511 -2.45
                curveToRelative(
                    dx1 = 1.519f,
                    dy1 = 0.0f,
                    dx2 = 2.511f,
                    dy2 = -0.899f,
                    dx3 = 2.511f,
                    dy3 = -2.45f,
                )
                // c 0 -1.457 -1.147 -2.201 -2.511 -2.201
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.457f,
                    dx2 = -1.147f,
                    dy2 = -2.201f,
                    dx3 = -2.511f,
                    dy3 = -2.201f,
                )
                // h -2.419
                horizontalLineToRelative(dx = -2.419f)
                // v 4.651z
                verticalLineToRelative(dy = 4.651f)
                close()
                // M 15.149 24.907
                moveTo(x = 15.149f, y = 24.907f)
                // h 3.659
                horizontalLineToRelative(dx = 3.659f)
                // c 1.674 0 2.915 -0.961 2.915 -2.697
                curveToRelative(
                    dx1 = 1.674f,
                    dy1 = 0.0f,
                    dx2 = 2.915f,
                    dy2 = -0.961f,
                    dx3 = 2.915f,
                    dy3 = -2.697f,
                )
                // c 0 -1.458 -1.117 -2.45 -3.287 -2.45
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.458f,
                    dx2 = -1.117f,
                    dy2 = -2.45f,
                    dx3 = -3.287f,
                    dy3 = -2.45f,
                )
                // h -3.287
                horizontalLineToRelative(dx = -3.287f)
                // v 5.147z
                verticalLineToRelative(dy = 5.147f)
                close()
            }
        }.build().also { _emoji1f1e7 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1e7: ImageVector? = null
