package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji2666: ImageVector
    get() {
        val current = _emoji2666
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji2666",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M18.437 35.747 c-0.242 0.337 -0.632 0.337 -0.874 0 L5.314 18.612 c-0.242 -0.338 -0.242 -0.886 0 -1.224 L17.563 0.253 c0.242 -0.338 0.632 -0.338 0.874 0 l12.25 17.135 c0.241 0.338 0.241 0.886 0 1.224 l-12.25 17.135z
            path(
                fill = SolidColor(Color(0xFFBE1931)),
            ) {
                // M 18.437 35.747
                moveTo(x = 18.437f, y = 35.747f)
                // c -0.242 0.337 -0.632 0.337 -0.874 0
                curveToRelative(
                    dx1 = -0.242f,
                    dy1 = 0.337f,
                    dx2 = -0.632f,
                    dy2 = 0.337f,
                    dx3 = -0.874f,
                    dy3 = 0.0f,
                )
                // L 5.314 18.612
                lineTo(x = 5.314f, y = 18.612f)
                // c -0.242 -0.338 -0.242 -0.886 0 -1.224
                curveToRelative(
                    dx1 = -0.242f,
                    dy1 = -0.338f,
                    dx2 = -0.242f,
                    dy2 = -0.886f,
                    dx3 = 0.0f,
                    dy3 = -1.224f,
                )
                // L 17.563 0.253
                lineTo(x = 17.563f, y = 0.253f)
                // c 0.242 -0.338 0.632 -0.338 0.874 0
                curveToRelative(
                    dx1 = 0.242f,
                    dy1 = -0.338f,
                    dx2 = 0.632f,
                    dy2 = -0.338f,
                    dx3 = 0.874f,
                    dy3 = 0.0f,
                )
                // l 12.25 17.135
                lineToRelative(dx = 12.25f, dy = 17.135f)
                // c 0.241 0.338 0.241 0.886 0 1.224
                curveToRelative(
                    dx1 = 0.241f,
                    dy1 = 0.338f,
                    dx2 = 0.241f,
                    dy2 = 0.886f,
                    dx3 = 0.0f,
                    dy3 = 1.224f,
                )
                // l -12.25 17.135z
                lineToRelative(dx = -12.25f, dy = 17.135f)
                close()
            }
        }.build().also { _emoji2666 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji2666: ImageVector? = null
