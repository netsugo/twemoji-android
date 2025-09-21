package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji2651: ImageVector
    get() {
        val current = _emoji2651
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji2651",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 32 c0 2.209 -1.791 4 -4 4 H4 c-2.209 0 -4 -1.791 -4 -4 V4 c0 -2.209 1.791 -4 4 -4 h28 c2.209 0 4 1.791 4 4 v28z
            path(
                fill = SolidColor(Color(0xFF9266CC)),
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
            // M26 19.531 c-1.616 0 -3.027 0.477 -4.117 1.316 -0.447 -2.177 -1.12 -5.416 -1.916 -9.131 -1.078 -5.031 -3.708 -6.096 -5.179 -6.282 -1.724 -0.221 -3.451 0.536 -4.787 1.982 C8.963 5.671 7.431 5.531 7 5.531 c-0.829 0 -1.5 0.671 -1.5 1.5 s0.671 1.5 1.5 1.5 c0.155 0 1 0.646 1 3.5 v11 c0 0.828 0.671 1.5 1.5 1.5 s1.5 -0.672 1.5 -1.5 L11 12.203 c0 -1.328 0.546 -3.792 2.952 -3.792 1.469 0 2.585 1.616 3.082 3.935 1.448 6.755 2.487 11.928 2.496 11.979 0.658 3.643 -2.108 4.237 -3.529 4.206 -0.828 -0.018 -1.5 0.672 -1.5 1.5 s0.671 1.5 1.5 1.5 c2.573 0 5.171 -1.198 6.122 -3.511 1.252 0.735 2.759 0.998 4.141 0.859 3.083 -0.306 5.237 -2.299 5.237 -4.849 -0.001 -2.606 -2.314 -4.499 -5.501 -4.499z M25.967 25.895 c-1.153 0.117 -2.562 -0.202 -3.208 -1.361 0.487 -1.263 1.639 -2.002 3.241 -2.002 1.005 0 2.5 0.399 2.5 1.5 0 1.058 -1.274 1.738 -2.533 1.863z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 26 19.531
                moveTo(x = 26.0f, y = 19.531f)
                // c -1.616 0 -3.027 0.477 -4.117 1.316
                curveToRelative(
                    dx1 = -1.616f,
                    dy1 = 0.0f,
                    dx2 = -3.027f,
                    dy2 = 0.477f,
                    dx3 = -4.117f,
                    dy3 = 1.316f,
                )
                // c -0.447 -2.177 -1.12 -5.416 -1.916 -9.131
                curveToRelative(
                    dx1 = -0.447f,
                    dy1 = -2.177f,
                    dx2 = -1.12f,
                    dy2 = -5.416f,
                    dx3 = -1.916f,
                    dy3 = -9.131f,
                )
                // c -1.078 -5.031 -3.708 -6.096 -5.179 -6.282
                curveToRelative(
                    dx1 = -1.078f,
                    dy1 = -5.031f,
                    dx2 = -3.708f,
                    dy2 = -6.096f,
                    dx3 = -5.179f,
                    dy3 = -6.282f,
                )
                // c -1.724 -0.221 -3.451 0.536 -4.787 1.982
                curveToRelative(
                    dx1 = -1.724f,
                    dy1 = -0.221f,
                    dx2 = -3.451f,
                    dy2 = 0.536f,
                    dx3 = -4.787f,
                    dy3 = 1.982f,
                )
                // C 8.963 5.671 7.431 5.531 7 5.531
                curveTo(
                    x1 = 8.963f,
                    y1 = 5.671f,
                    x2 = 7.431f,
                    y2 = 5.531f,
                    x3 = 7.0f,
                    y3 = 5.531f,
                )
                // c -0.829 0 -1.5 0.671 -1.5 1.5
                curveToRelative(
                    dx1 = -0.829f,
                    dy1 = 0.0f,
                    dx2 = -1.5f,
                    dy2 = 0.671f,
                    dx3 = -1.5f,
                    dy3 = 1.5f,
                )
                // s 0.671 1.5 1.5 1.5
                reflectiveCurveToRelative(
                    dx1 = 0.671f,
                    dy1 = 1.5f,
                    dx2 = 1.5f,
                    dy2 = 1.5f,
                )
                // c 0.155 0 1 0.646 1 3.5
                curveToRelative(
                    dx1 = 0.155f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.646f,
                    dx3 = 1.0f,
                    dy3 = 3.5f,
                )
                // v 11
                verticalLineToRelative(dy = 11.0f)
                // c 0 0.828 0.671 1.5 1.5 1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.828f,
                    dx2 = 0.671f,
                    dy2 = 1.5f,
                    dx3 = 1.5f,
                    dy3 = 1.5f,
                )
                // s 1.5 -0.672 1.5 -1.5
                reflectiveCurveToRelative(
                    dx1 = 1.5f,
                    dy1 = -0.672f,
                    dx2 = 1.5f,
                    dy2 = -1.5f,
                )
                // L 11 12.203
                lineTo(x = 11.0f, y = 12.203f)
                // c 0 -1.328 0.546 -3.792 2.952 -3.792
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.328f,
                    dx2 = 0.546f,
                    dy2 = -3.792f,
                    dx3 = 2.952f,
                    dy3 = -3.792f,
                )
                // c 1.469 0 2.585 1.616 3.082 3.935
                curveToRelative(
                    dx1 = 1.469f,
                    dy1 = 0.0f,
                    dx2 = 2.585f,
                    dy2 = 1.616f,
                    dx3 = 3.082f,
                    dy3 = 3.935f,
                )
                // c 1.448 6.755 2.487 11.928 2.496 11.979
                curveToRelative(
                    dx1 = 1.448f,
                    dy1 = 6.755f,
                    dx2 = 2.487f,
                    dy2 = 11.928f,
                    dx3 = 2.496f,
                    dy3 = 11.979f,
                )
                // c 0.658 3.643 -2.108 4.237 -3.529 4.206
                curveToRelative(
                    dx1 = 0.658f,
                    dy1 = 3.643f,
                    dx2 = -2.108f,
                    dy2 = 4.237f,
                    dx3 = -3.529f,
                    dy3 = 4.206f,
                )
                // c -0.828 -0.018 -1.5 0.672 -1.5 1.5
                curveToRelative(
                    dx1 = -0.828f,
                    dy1 = -0.018f,
                    dx2 = -1.5f,
                    dy2 = 0.672f,
                    dx3 = -1.5f,
                    dy3 = 1.5f,
                )
                // s 0.671 1.5 1.5 1.5
                reflectiveCurveToRelative(
                    dx1 = 0.671f,
                    dy1 = 1.5f,
                    dx2 = 1.5f,
                    dy2 = 1.5f,
                )
                // c 2.573 0 5.171 -1.198 6.122 -3.511
                curveToRelative(
                    dx1 = 2.573f,
                    dy1 = 0.0f,
                    dx2 = 5.171f,
                    dy2 = -1.198f,
                    dx3 = 6.122f,
                    dy3 = -3.511f,
                )
                // c 1.252 0.735 2.759 0.998 4.141 0.859
                curveToRelative(
                    dx1 = 1.252f,
                    dy1 = 0.735f,
                    dx2 = 2.759f,
                    dy2 = 0.998f,
                    dx3 = 4.141f,
                    dy3 = 0.859f,
                )
                // c 3.083 -0.306 5.237 -2.299 5.237 -4.849
                curveToRelative(
                    dx1 = 3.083f,
                    dy1 = -0.306f,
                    dx2 = 5.237f,
                    dy2 = -2.299f,
                    dx3 = 5.237f,
                    dy3 = -4.849f,
                )
                // c -0.001 -2.606 -2.314 -4.499 -5.501 -4.499z
                curveToRelative(
                    dx1 = -0.001f,
                    dy1 = -2.606f,
                    dx2 = -2.314f,
                    dy2 = -4.499f,
                    dx3 = -5.501f,
                    dy3 = -4.499f,
                )
                close()
                // M 25.967 25.895
                moveTo(x = 25.967f, y = 25.895f)
                // c -1.153 0.117 -2.562 -0.202 -3.208 -1.361
                curveToRelative(
                    dx1 = -1.153f,
                    dy1 = 0.117f,
                    dx2 = -2.562f,
                    dy2 = -0.202f,
                    dx3 = -3.208f,
                    dy3 = -1.361f,
                )
                // c 0.487 -1.263 1.639 -2.002 3.241 -2.002
                curveToRelative(
                    dx1 = 0.487f,
                    dy1 = -1.263f,
                    dx2 = 1.639f,
                    dy2 = -2.002f,
                    dx3 = 3.241f,
                    dy3 = -2.002f,
                )
                // c 1.005 0 2.5 0.399 2.5 1.5
                curveToRelative(
                    dx1 = 1.005f,
                    dy1 = 0.0f,
                    dx2 = 2.5f,
                    dy2 = 0.399f,
                    dx3 = 2.5f,
                    dy3 = 1.5f,
                )
                // c 0 1.058 -1.274 1.738 -2.533 1.863z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.058f,
                    dx2 = -1.274f,
                    dy2 = 1.738f,
                    dx3 = -2.533f,
                    dy3 = 1.863f,
                )
                close()
            }
        }.build().also { _emoji2651 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji2651: ImageVector? = null
