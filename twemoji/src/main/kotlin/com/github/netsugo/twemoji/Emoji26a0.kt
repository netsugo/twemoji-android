package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji26a0: ImageVector
    get() {
        val current = _emoji26a0
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji26a0",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M2.653 35 C0.811 35 -0.001 33.662 0.847 32.027 L16.456 1.972 c0.849 -1.635 2.238 -1.635 3.087 0 l15.609 30.056 c0.85 1.634 0.037 2.972 -1.805 2.972 H2.653z
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 2.653 35
                moveTo(x = 2.653f, y = 35.0f)
                // C 0.811 35 -0.001 33.662 0.847 32.027
                curveTo(
                    x1 = 0.811f,
                    y1 = 35.0f,
                    x2 = -0.001f,
                    y2 = 33.662f,
                    x3 = 0.847f,
                    y3 = 32.027f,
                )
                // L 16.456 1.972
                lineTo(x = 16.456f, y = 1.972f)
                // c 0.849 -1.635 2.238 -1.635 3.087 0
                curveToRelative(
                    dx1 = 0.849f,
                    dy1 = -1.635f,
                    dx2 = 2.238f,
                    dy2 = -1.635f,
                    dx3 = 3.087f,
                    dy3 = 0.0f,
                )
                // l 15.609 30.056
                lineToRelative(dx = 15.609f, dy = 30.056f)
                // c 0.85 1.634 0.037 2.972 -1.805 2.972
                curveToRelative(
                    dx1 = 0.85f,
                    dy1 = 1.634f,
                    dx2 = 0.037f,
                    dy2 = 2.972f,
                    dx3 = -1.805f,
                    dy3 = 2.972f,
                )
                // H 2.653z
                horizontalLineTo(x = 2.653f)
                close()
            }
            // M15.583 28.953 c0 -1.333 1.085 -2.418 2.419 -2.418 1.333 0 2.418 1.085 2.418 2.418 0 1.334 -1.086 2.419 -2.418 2.419 -1.334 0 -2.419 -1.085 -2.419 -2.419z M15.769 10.66 c0 -1.302 0.961 -2.108 2.232 -2.108 1.241 0 2.233 0.837 2.233 2.108 v11.938 c0 1.271 -0.992 2.108 -2.233 2.108 -1.271 0 -2.232 -0.807 -2.232 -2.108 L15.769 10.66z
            path(
                fill = SolidColor(Color(0xFF231F20)),
            ) {
                // M 15.583 28.953
                moveTo(x = 15.583f, y = 28.953f)
                // c 0 -1.333 1.085 -2.418 2.419 -2.418
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.333f,
                    dx2 = 1.085f,
                    dy2 = -2.418f,
                    dx3 = 2.419f,
                    dy3 = -2.418f,
                )
                // c 1.333 0 2.418 1.085 2.418 2.418
                curveToRelative(
                    dx1 = 1.333f,
                    dy1 = 0.0f,
                    dx2 = 2.418f,
                    dy2 = 1.085f,
                    dx3 = 2.418f,
                    dy3 = 2.418f,
                )
                // c 0 1.334 -1.086 2.419 -2.418 2.419
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.334f,
                    dx2 = -1.086f,
                    dy2 = 2.419f,
                    dx3 = -2.418f,
                    dy3 = 2.419f,
                )
                // c -1.334 0 -2.419 -1.085 -2.419 -2.419z
                curveToRelative(
                    dx1 = -1.334f,
                    dy1 = 0.0f,
                    dx2 = -2.419f,
                    dy2 = -1.085f,
                    dx3 = -2.419f,
                    dy3 = -2.419f,
                )
                close()
                // M 15.769 10.66
                moveTo(x = 15.769f, y = 10.66f)
                // c 0 -1.302 0.961 -2.108 2.232 -2.108
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.302f,
                    dx2 = 0.961f,
                    dy2 = -2.108f,
                    dx3 = 2.232f,
                    dy3 = -2.108f,
                )
                // c 1.241 0 2.233 0.837 2.233 2.108
                curveToRelative(
                    dx1 = 1.241f,
                    dy1 = 0.0f,
                    dx2 = 2.233f,
                    dy2 = 0.837f,
                    dx3 = 2.233f,
                    dy3 = 2.108f,
                )
                // v 11.938
                verticalLineToRelative(dy = 11.938f)
                // c 0 1.271 -0.992 2.108 -2.233 2.108
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.271f,
                    dx2 = -0.992f,
                    dy2 = 2.108f,
                    dx3 = -2.233f,
                    dy3 = 2.108f,
                )
                // c -1.271 0 -2.232 -0.807 -2.232 -2.108
                curveToRelative(
                    dx1 = -1.271f,
                    dy1 = 0.0f,
                    dx2 = -2.232f,
                    dy2 = -0.807f,
                    dx3 = -2.232f,
                    dy3 = -2.108f,
                )
                // L 15.769 10.66z
                lineTo(x = 15.769f, y = 10.66f)
                close()
            }
        }.build().also { _emoji26a0 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji26a0: ImageVector? = null
