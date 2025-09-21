package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f539: ImageVector
    get() {
        val current = _emoji1f539
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f539",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M7.707 18.708 c-0.389 -0.389 -0.389 -1.025 0 -1.414 l9.585 -9.586 c0.389 -0.389 1.025 -0.389 1.414 0 l9.587 9.587 c0.389 0.389 0.389 1.025 0 1.414 l-9.587 9.585 c-0.389 0.389 -1.025 0.389 -1.414 0 l-9.585 -9.586z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 7.707 18.708
                moveTo(x = 7.707f, y = 18.708f)
                // c -0.389 -0.389 -0.389 -1.025 0 -1.414
                curveToRelative(
                    dx1 = -0.389f,
                    dy1 = -0.389f,
                    dx2 = -0.389f,
                    dy2 = -1.025f,
                    dx3 = 0.0f,
                    dy3 = -1.414f,
                )
                // l 9.585 -9.586
                lineToRelative(dx = 9.585f, dy = -9.586f)
                // c 0.389 -0.389 1.025 -0.389 1.414 0
                curveToRelative(
                    dx1 = 0.389f,
                    dy1 = -0.389f,
                    dx2 = 1.025f,
                    dy2 = -0.389f,
                    dx3 = 1.414f,
                    dy3 = 0.0f,
                )
                // l 9.587 9.587
                lineToRelative(dx = 9.587f, dy = 9.587f)
                // c 0.389 0.389 0.389 1.025 0 1.414
                curveToRelative(
                    dx1 = 0.389f,
                    dy1 = 0.389f,
                    dx2 = 0.389f,
                    dy2 = 1.025f,
                    dx3 = 0.0f,
                    dy3 = 1.414f,
                )
                // l -9.587 9.585
                lineToRelative(dx = -9.587f, dy = 9.585f)
                // c -0.389 0.389 -1.025 0.389 -1.414 0
                curveToRelative(
                    dx1 = -0.389f,
                    dy1 = 0.389f,
                    dx2 = -1.025f,
                    dy2 = 0.389f,
                    dx3 = -1.414f,
                    dy3 = 0.0f,
                )
                // l -9.585 -9.586z
                lineToRelative(dx = -9.585f, dy = -9.586f)
                close()
            }
        }.build().also { _emoji1f539 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f539: ImageVector? = null
