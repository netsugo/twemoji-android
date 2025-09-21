package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f4d0: ImageVector
    get() {
        val current = _emoji1f4d0
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f4d0",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M35.106 33.172 L2.828 0.894 C1.273 -0.662 0 -0.135 0 2.065 V32 c0 2.2 1.8 4 4 4 h29.935 c2.2 0 2.727 -1.272 1.171 -2.828z M16.967 28 H10 c-1.1 0 -2 -0.9 -2 -2 v-6.968 c0 -1.1 0.637 -1.363 1.414 -0.586 l8.139 8.14 c0.777 0.777 0.513 1.414 -0.586 1.414z
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 35.106 33.172
                moveTo(x = 35.106f, y = 33.172f)
                // L 2.828 0.894
                lineTo(x = 2.828f, y = 0.894f)
                // C 1.273 -0.662 0 -0.135 0 2.065
                curveTo(
                    x1 = 1.273f,
                    y1 = -0.662f,
                    x2 = 0.0f,
                    y2 = -0.135f,
                    x3 = 0.0f,
                    y3 = 2.065f,
                )
                // V 32
                verticalLineTo(y = 32.0f)
                // c 0 2.2 1.8 4 4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.2f,
                    dx2 = 1.8f,
                    dy2 = 4.0f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // h 29.935
                horizontalLineToRelative(dx = 29.935f)
                // c 2.2 0 2.727 -1.272 1.171 -2.828z
                curveToRelative(
                    dx1 = 2.2f,
                    dy1 = 0.0f,
                    dx2 = 2.727f,
                    dy2 = -1.272f,
                    dx3 = 1.171f,
                    dy3 = -2.828f,
                )
                close()
                // M 16.967 28
                moveTo(x = 16.967f, y = 28.0f)
                // H 10
                horizontalLineTo(x = 10.0f)
                // c -1.1 0 -2 -0.9 -2 -2
                curveToRelative(
                    dx1 = -1.1f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -0.9f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // v -6.968
                verticalLineToRelative(dy = -6.968f)
                // c 0 -1.1 0.637 -1.363 1.414 -0.586
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.1f,
                    dx2 = 0.637f,
                    dy2 = -1.363f,
                    dx3 = 1.414f,
                    dy3 = -0.586f,
                )
                // l 8.139 8.14
                lineToRelative(dx = 8.139f, dy = 8.14f)
                // c 0.777 0.777 0.513 1.414 -0.586 1.414z
                curveToRelative(
                    dx1 = 0.777f,
                    dy1 = 0.777f,
                    dx2 = 0.513f,
                    dy2 = 1.414f,
                    dx3 = -0.586f,
                    dy3 = 1.414f,
                )
                close()
            }
        }.build().also { _emoji1f4d0 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f4d0: ImageVector? = null
