package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f4a3: ImageVector
    get() {
        val current = _emoji1f4a3
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f4a3",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M24.187 9.657 l5.658 -5.654 L32 6.16 l-5.658 5.655z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 24.187 9.657
                moveTo(x = 24.187f, y = 9.657f)
                // l 5.658 -5.654
                lineToRelative(dx = 5.658f, dy = -5.654f)
                // L 32 6.16
                lineTo(x = 32.0f, y = 6.16f)
                // l -5.658 5.655z
                lineToRelative(dx = -5.658f, dy = 5.655f)
                close()
            }
            // M14 22 m-14 0 a14 14 0 1 1 28 0 a14 14 0 1 1 -28 0
            path(
                fill = SolidColor(Color(0xFF31373D)),
            ) {
                // M 14 22
                moveTo(x = 14.0f, y = 22.0f)
                // m -14 0
                moveToRelative(dx = -14.0f, dy = 0.0f)
                // a 14 14 0 1 1 28 0
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 28.0f,
                    dy1 = 0.0f,
                )
                // a 14 14 0 1 1 -28 0
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -28.0f,
                    dy1 = 0.0f,
                )
            }
            // M19 11.342 l5.658 -5.657 5.657 5.658 L24.657 17z
            path(
                fill = SolidColor(Color(0xFF31373D)),
            ) {
                // M 19 11.342
                moveTo(x = 19.0f, y = 11.342f)
                // l 5.658 -5.657
                lineToRelative(dx = 5.658f, dy = -5.657f)
                // l 5.657 5.658
                lineToRelative(dx = 5.657f, dy = 5.658f)
                // L 24.657 17z
                lineTo(x = 24.657f, y = 17.0f)
                close()
            }
            // M32 4 m-4 0 a4 4 0 1 1 8 0 a4 4 0 1 1 -8 0
            path(
                fill = SolidColor(Color(0xFFF18F26)),
            ) {
                // M 32 4
                moveTo(x = 32.0f, y = 4.0f)
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
            // M32 4 m-2 0 a2 2 0 1 1 4 0 a2 2 0 1 1 -4 0
            path(
                fill = SolidColor(Color(0xFFFDCB58)),
            ) {
                // M 32 4
                moveTo(x = 32.0f, y = 4.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
            }
        }.build().also { _emoji1f4a3 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f4a3: ImageVector? = null
