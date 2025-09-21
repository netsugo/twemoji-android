package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f4de: ImageVector
    get() {
        val current = _emoji1f4de
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f4de",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M34.06 26.407 l-3.496 -3.496 c-1.93 -1.93 -5.06 -1.93 -6.989 0 -0.719 0.718 -1.167 1.603 -1.351 2.528 -5.765 -1.078 -11.372 -6.662 -11.721 -11.653 0.947 -0.176 1.854 -0.627 2.586 -1.36 1.93 -1.93 1.93 -5.06 0 -6.99 L9.594 1.94 c-1.93 -1.93 -5.06 -1.93 -6.99 0 -10.486 10.486 20.97 41.942 31.456 31.456 1.929 -1.929 1.929 -5.059 0 -6.989z
            path(
                fill = SolidColor(Color(0xFF31373D)),
            ) {
                // M 34.06 26.407
                moveTo(x = 34.06f, y = 26.407f)
                // l -3.496 -3.496
                lineToRelative(dx = -3.496f, dy = -3.496f)
                // c -1.93 -1.93 -5.06 -1.93 -6.989 0
                curveToRelative(
                    dx1 = -1.93f,
                    dy1 = -1.93f,
                    dx2 = -5.06f,
                    dy2 = -1.93f,
                    dx3 = -6.989f,
                    dy3 = 0.0f,
                )
                // c -0.719 0.718 -1.167 1.603 -1.351 2.528
                curveToRelative(
                    dx1 = -0.719f,
                    dy1 = 0.718f,
                    dx2 = -1.167f,
                    dy2 = 1.603f,
                    dx3 = -1.351f,
                    dy3 = 2.528f,
                )
                // c -5.765 -1.078 -11.372 -6.662 -11.721 -11.653
                curveToRelative(
                    dx1 = -5.765f,
                    dy1 = -1.078f,
                    dx2 = -11.372f,
                    dy2 = -6.662f,
                    dx3 = -11.721f,
                    dy3 = -11.653f,
                )
                // c 0.947 -0.176 1.854 -0.627 2.586 -1.36
                curveToRelative(
                    dx1 = 0.947f,
                    dy1 = -0.176f,
                    dx2 = 1.854f,
                    dy2 = -0.627f,
                    dx3 = 2.586f,
                    dy3 = -1.36f,
                )
                // c 1.93 -1.93 1.93 -5.06 0 -6.99
                curveToRelative(
                    dx1 = 1.93f,
                    dy1 = -1.93f,
                    dx2 = 1.93f,
                    dy2 = -5.06f,
                    dx3 = 0.0f,
                    dy3 = -6.99f,
                )
                // L 9.594 1.94
                lineTo(x = 9.594f, y = 1.94f)
                // c -1.93 -1.93 -5.06 -1.93 -6.99 0
                curveToRelative(
                    dx1 = -1.93f,
                    dy1 = -1.93f,
                    dx2 = -5.06f,
                    dy2 = -1.93f,
                    dx3 = -6.99f,
                    dy3 = 0.0f,
                )
                // c -10.486 10.486 20.97 41.942 31.456 31.456
                curveToRelative(
                    dx1 = -10.486f,
                    dy1 = 10.486f,
                    dx2 = 20.97f,
                    dy2 = 41.942f,
                    dx3 = 31.456f,
                    dy3 = 31.456f,
                )
                // c 1.929 -1.929 1.929 -5.059 0 -6.989z
                curveToRelative(
                    dx1 = 1.929f,
                    dy1 = -1.929f,
                    dx2 = 1.929f,
                    dy2 = -5.059f,
                    dx3 = 0.0f,
                    dy3 = -6.989f,
                )
                close()
            }
        }.build().also { _emoji1f4de = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f4de: ImageVector? = null
