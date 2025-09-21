package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji2198: ImageVector
    get() {
        val current = _emoji2198
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji2198",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M0 4 c0 -2.209 1.791 -4 4 -4 h28 c2.209 0 4 1.791 4 4 v28 c0 2.209 -1.791 4 -4 4 H4 c-2.209 0 -4 -1.791 -4 -4 V4z
            path(
                fill = SolidColor(Color(0xFF3B88C3)),
            ) {
                // M 0 4
                moveTo(x = 0.0f, y = 4.0f)
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
                // v 28
                verticalLineToRelative(dy = 28.0f)
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
                // V 4z
                verticalLineTo(y = 4.0f)
                close()
            }
            // M27 11 v16 H11z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 27 11
                moveTo(x = 27.0f, y = 11.0f)
                // v 16
                verticalLineToRelative(dy = 16.0f)
                // H 11z
                horizontalLineTo(x = 11.0f)
                close()
            }
            // M7 12.657 L12.658 7 l13.814 13.814 -5.656 5.657z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 7 12.657
                moveTo(x = 7.0f, y = 12.657f)
                // L 12.658 7
                lineTo(x = 12.658f, y = 7.0f)
                // l 13.814 13.814
                lineToRelative(dx = 13.814f, dy = 13.814f)
                // l -5.656 5.657z
                lineToRelative(dx = -5.656f, dy = 5.657f)
                close()
            }
        }.build().also { _emoji2198 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji2198: ImageVector? = null
