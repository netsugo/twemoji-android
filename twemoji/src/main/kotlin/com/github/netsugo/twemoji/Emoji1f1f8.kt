package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1f8: ImageVector
    get() {
        val current = _emoji1f1f8
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1f8",
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
            // M24.125 9.652 c0 1.209 -0.806 2.294 -2.076 2.294 -1.271 0 -2.264 -0.93 -4.125 -0.93 -1.333 0 -2.542 0.713 -2.542 2.016 0 3.193 10.357 1.147 10.357 9.146 0 4.434 -3.659 7.193 -7.938 7.193 -2.388 0 -7.534 -0.558 -7.534 -3.473 0 -1.209 0.806 -2.201 2.077 -2.201 1.457 0 3.193 1.209 5.209 1.209 2.046 0 3.163 -1.147 3.163 -2.667 0 -3.658 -10.356 -1.457 -10.356 -8.65 0 -4.341 3.565 -7.038 7.689 -7.038 1.736 0.001 6.076 0.652 6.076 3.101z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 24.125 9.652
                moveTo(x = 24.125f, y = 9.652f)
                // c 0 1.209 -0.806 2.294 -2.076 2.294
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.209f,
                    dx2 = -0.806f,
                    dy2 = 2.294f,
                    dx3 = -2.076f,
                    dy3 = 2.294f,
                )
                // c -1.271 0 -2.264 -0.93 -4.125 -0.93
                curveToRelative(
                    dx1 = -1.271f,
                    dy1 = 0.0f,
                    dx2 = -2.264f,
                    dy2 = -0.93f,
                    dx3 = -4.125f,
                    dy3 = -0.93f,
                )
                // c -1.333 0 -2.542 0.713 -2.542 2.016
                curveToRelative(
                    dx1 = -1.333f,
                    dy1 = 0.0f,
                    dx2 = -2.542f,
                    dy2 = 0.713f,
                    dx3 = -2.542f,
                    dy3 = 2.016f,
                )
                // c 0 3.193 10.357 1.147 10.357 9.146
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.193f,
                    dx2 = 10.357f,
                    dy2 = 1.147f,
                    dx3 = 10.357f,
                    dy3 = 9.146f,
                )
                // c 0 4.434 -3.659 7.193 -7.938 7.193
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.434f,
                    dx2 = -3.659f,
                    dy2 = 7.193f,
                    dx3 = -7.938f,
                    dy3 = 7.193f,
                )
                // c -2.388 0 -7.534 -0.558 -7.534 -3.473
                curveToRelative(
                    dx1 = -2.388f,
                    dy1 = 0.0f,
                    dx2 = -7.534f,
                    dy2 = -0.558f,
                    dx3 = -7.534f,
                    dy3 = -3.473f,
                )
                // c 0 -1.209 0.806 -2.201 2.077 -2.201
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.209f,
                    dx2 = 0.806f,
                    dy2 = -2.201f,
                    dx3 = 2.077f,
                    dy3 = -2.201f,
                )
                // c 1.457 0 3.193 1.209 5.209 1.209
                curveToRelative(
                    dx1 = 1.457f,
                    dy1 = 0.0f,
                    dx2 = 3.193f,
                    dy2 = 1.209f,
                    dx3 = 5.209f,
                    dy3 = 1.209f,
                )
                // c 2.046 0 3.163 -1.147 3.163 -2.667
                curveToRelative(
                    dx1 = 2.046f,
                    dy1 = 0.0f,
                    dx2 = 3.163f,
                    dy2 = -1.147f,
                    dx3 = 3.163f,
                    dy3 = -2.667f,
                )
                // c 0 -3.658 -10.356 -1.457 -10.356 -8.65
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.658f,
                    dx2 = -10.356f,
                    dy2 = -1.457f,
                    dx3 = -10.356f,
                    dy3 = -8.65f,
                )
                // c 0 -4.341 3.565 -7.038 7.689 -7.038
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.341f,
                    dx2 = 3.565f,
                    dy2 = -7.038f,
                    dx3 = 7.689f,
                    dy3 = -7.038f,
                )
                // c 1.736 0.001 6.076 0.652 6.076 3.101z
                curveToRelative(
                    dx1 = 1.736f,
                    dy1 = 0.001f,
                    dx2 = 6.076f,
                    dy2 = 0.652f,
                    dx3 = 6.076f,
                    dy3 = 3.101f,
                )
                close()
            }
        }.build().also { _emoji1f1f8 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1f8: ImageVector? = null
