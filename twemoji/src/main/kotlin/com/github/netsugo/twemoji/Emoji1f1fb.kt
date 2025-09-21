package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1fb: ImageVector
    get() {
        val current = _emoji1f1fb
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1fb",
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
            // M8.917 10.117 C8.762 9.714 8.7 9.404 8.7 8.97 c0 -1.302 1.147 -2.232 2.387 -2.232 1.055 0 1.706 0.682 2.108 1.519 l4.806 12.898 4.807 -12.898 c0.402 -0.837 1.053 -1.519 2.107 -1.519 1.24 0 2.387 0.93 2.387 2.232 0 0.434 -0.06 0.744 -0.217 1.147 l-6.789 17.271 c-0.404 0.992 -0.931 1.798 -2.295 1.798 -1.364 0 -1.891 -0.806 -2.295 -1.798 L8.917 10.117z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 8.917 10.117
                moveTo(x = 8.917f, y = 10.117f)
                // C 8.762 9.714 8.7 9.404 8.7 8.97
                curveTo(
                    x1 = 8.762f,
                    y1 = 9.714f,
                    x2 = 8.7f,
                    y2 = 9.404f,
                    x3 = 8.7f,
                    y3 = 8.97f,
                )
                // c 0 -1.302 1.147 -2.232 2.387 -2.232
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.302f,
                    dx2 = 1.147f,
                    dy2 = -2.232f,
                    dx3 = 2.387f,
                    dy3 = -2.232f,
                )
                // c 1.055 0 1.706 0.682 2.108 1.519
                curveToRelative(
                    dx1 = 1.055f,
                    dy1 = 0.0f,
                    dx2 = 1.706f,
                    dy2 = 0.682f,
                    dx3 = 2.108f,
                    dy3 = 1.519f,
                )
                // l 4.806 12.898
                lineToRelative(dx = 4.806f, dy = 12.898f)
                // l 4.807 -12.898
                lineToRelative(dx = 4.807f, dy = -12.898f)
                // c 0.402 -0.837 1.053 -1.519 2.107 -1.519
                curveToRelative(
                    dx1 = 0.402f,
                    dy1 = -0.837f,
                    dx2 = 1.053f,
                    dy2 = -1.519f,
                    dx3 = 2.107f,
                    dy3 = -1.519f,
                )
                // c 1.24 0 2.387 0.93 2.387 2.232
                curveToRelative(
                    dx1 = 1.24f,
                    dy1 = 0.0f,
                    dx2 = 2.387f,
                    dy2 = 0.93f,
                    dx3 = 2.387f,
                    dy3 = 2.232f,
                )
                // c 0 0.434 -0.06 0.744 -0.217 1.147
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.434f,
                    dx2 = -0.06f,
                    dy2 = 0.744f,
                    dx3 = -0.217f,
                    dy3 = 1.147f,
                )
                // l -6.789 17.271
                lineToRelative(dx = -6.789f, dy = 17.271f)
                // c -0.404 0.992 -0.931 1.798 -2.295 1.798
                curveToRelative(
                    dx1 = -0.404f,
                    dy1 = 0.992f,
                    dx2 = -0.931f,
                    dy2 = 1.798f,
                    dx3 = -2.295f,
                    dy3 = 1.798f,
                )
                // c -1.364 0 -1.891 -0.806 -2.295 -1.798
                curveToRelative(
                    dx1 = -1.364f,
                    dy1 = 0.0f,
                    dx2 = -1.891f,
                    dy2 = -0.806f,
                    dx3 = -2.295f,
                    dy3 = -1.798f,
                )
                // L 8.917 10.117z
                lineTo(x = 8.917f, y = 10.117f)
                close()
            }
        }.build().also { _emoji1f1fb = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1fb: ImageVector? = null
