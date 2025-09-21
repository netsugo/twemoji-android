package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f3b1: ImageVector
    get() {
        val current = _emoji1f3b1
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f3b1",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M18 18 m-18 0 a18 18 0 1 1 36 0 a18 18 0 1 1 -36 0
            path(
                fill = SolidColor(Color(0xFF31373D)),
            ) {
                // M 18 18
                moveTo(x = 18.0f, y = 18.0f)
                // m -18 0
                moveToRelative(dx = -18.0f, dy = 0.0f)
                // a 18 18 0 1 1 36 0
                arcToRelative(
                    a = 18.0f,
                    b = 18.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 36.0f,
                    dy1 = 0.0f,
                )
                // a 18 18 0 1 1 -36 0
                arcToRelative(
                    a = 18.0f,
                    b = 18.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -36.0f,
                    dy1 = 0.0f,
                )
            }
            // M18 18 m-9 0 a9 9 0 1 1 18 0 a9 9 0 1 1 -18 0
            path(
                fill = SolidColor(Color(0xFFE1E8ED)),
            ) {
                // M 18 18
                moveTo(x = 18.0f, y = 18.0f)
                // m -9 0
                moveToRelative(dx = -9.0f, dy = 0.0f)
                // a 9 9 0 1 1 18 0
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 18.0f,
                    dy1 = 0.0f,
                )
                // a 9 9 0 1 1 -18 0
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -18.0f,
                    dy1 = 0.0f,
                )
            }
            // M13.703 20.203 c0 -1.406 0.773 -2.443 1.881 -3.041 -0.826 -0.598 -1.336 -1.406 -1.336 -2.514 0 -2.057 1.705 -3.375 3.797 -3.375 2.039 0 3.814 1.301 3.814 3.375 0 0.984 -0.492 1.969 -1.354 2.514 1.195 0.598 1.881 1.688 1.881 3.041 0 2.443 -1.986 4.008 -4.342 4.008 -2.425 0 -4.341 -1.652 -4.341 -4.008z M16.445 20.027 c0 0.896 0.527 1.758 1.6 1.758 1.002 0 1.6 -0.861 1.6 -1.758 0 -1.107 -0.633 -1.758 -1.6 -1.758 -1.02 0.001 -1.6 0.774 -1.6 1.758z M16.779 14.93 c0 0.791 0.457 1.336 1.266 1.336 0.809 0 1.283 -0.545 1.283 -1.336 0 -0.756 -0.457 -1.336 -1.283 -1.336 -0.826 0 -1.266 0.58 -1.266 1.336z
            path(
                fill = SolidColor(Color(0xFF31373D)),
            ) {
                // M 13.703 20.203
                moveTo(x = 13.703f, y = 20.203f)
                // c 0 -1.406 0.773 -2.443 1.881 -3.041
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.406f,
                    dx2 = 0.773f,
                    dy2 = -2.443f,
                    dx3 = 1.881f,
                    dy3 = -3.041f,
                )
                // c -0.826 -0.598 -1.336 -1.406 -1.336 -2.514
                curveToRelative(
                    dx1 = -0.826f,
                    dy1 = -0.598f,
                    dx2 = -1.336f,
                    dy2 = -1.406f,
                    dx3 = -1.336f,
                    dy3 = -2.514f,
                )
                // c 0 -2.057 1.705 -3.375 3.797 -3.375
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.057f,
                    dx2 = 1.705f,
                    dy2 = -3.375f,
                    dx3 = 3.797f,
                    dy3 = -3.375f,
                )
                // c 2.039 0 3.814 1.301 3.814 3.375
                curveToRelative(
                    dx1 = 2.039f,
                    dy1 = 0.0f,
                    dx2 = 3.814f,
                    dy2 = 1.301f,
                    dx3 = 3.814f,
                    dy3 = 3.375f,
                )
                // c 0 0.984 -0.492 1.969 -1.354 2.514
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.984f,
                    dx2 = -0.492f,
                    dy2 = 1.969f,
                    dx3 = -1.354f,
                    dy3 = 2.514f,
                )
                // c 1.195 0.598 1.881 1.688 1.881 3.041
                curveToRelative(
                    dx1 = 1.195f,
                    dy1 = 0.598f,
                    dx2 = 1.881f,
                    dy2 = 1.688f,
                    dx3 = 1.881f,
                    dy3 = 3.041f,
                )
                // c 0 2.443 -1.986 4.008 -4.342 4.008
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.443f,
                    dx2 = -1.986f,
                    dy2 = 4.008f,
                    dx3 = -4.342f,
                    dy3 = 4.008f,
                )
                // c -2.425 0 -4.341 -1.652 -4.341 -4.008z
                curveToRelative(
                    dx1 = -2.425f,
                    dy1 = 0.0f,
                    dx2 = -4.341f,
                    dy2 = -1.652f,
                    dx3 = -4.341f,
                    dy3 = -4.008f,
                )
                close()
                // M 16.445 20.027
                moveTo(x = 16.445f, y = 20.027f)
                // c 0 0.896 0.527 1.758 1.6 1.758
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.896f,
                    dx2 = 0.527f,
                    dy2 = 1.758f,
                    dx3 = 1.6f,
                    dy3 = 1.758f,
                )
                // c 1.002 0 1.6 -0.861 1.6 -1.758
                curveToRelative(
                    dx1 = 1.002f,
                    dy1 = 0.0f,
                    dx2 = 1.6f,
                    dy2 = -0.861f,
                    dx3 = 1.6f,
                    dy3 = -1.758f,
                )
                // c 0 -1.107 -0.633 -1.758 -1.6 -1.758
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.107f,
                    dx2 = -0.633f,
                    dy2 = -1.758f,
                    dx3 = -1.6f,
                    dy3 = -1.758f,
                )
                // c -1.02 0.001 -1.6 0.774 -1.6 1.758z
                curveToRelative(
                    dx1 = -1.02f,
                    dy1 = 0.001f,
                    dx2 = -1.6f,
                    dy2 = 0.774f,
                    dx3 = -1.6f,
                    dy3 = 1.758f,
                )
                close()
                // M 16.779 14.93
                moveTo(x = 16.779f, y = 14.93f)
                // c 0 0.791 0.457 1.336 1.266 1.336
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.791f,
                    dx2 = 0.457f,
                    dy2 = 1.336f,
                    dx3 = 1.266f,
                    dy3 = 1.336f,
                )
                // c 0.809 0 1.283 -0.545 1.283 -1.336
                curveToRelative(
                    dx1 = 0.809f,
                    dy1 = 0.0f,
                    dx2 = 1.283f,
                    dy2 = -0.545f,
                    dx3 = 1.283f,
                    dy3 = -1.336f,
                )
                // c 0 -0.756 -0.457 -1.336 -1.283 -1.336
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.756f,
                    dx2 = -0.457f,
                    dy2 = -1.336f,
                    dx3 = -1.283f,
                    dy3 = -1.336f,
                )
                // c -0.826 0 -1.266 0.58 -1.266 1.336z
                curveToRelative(
                    dx1 = -0.826f,
                    dy1 = 0.0f,
                    dx2 = -1.266f,
                    dy2 = 0.58f,
                    dx3 = -1.266f,
                    dy3 = 1.336f,
                )
                close()
            }
        }.build().also { _emoji1f3b1 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f3b1: ImageVector? = null
