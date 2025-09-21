package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji2653: ImageVector
    get() {
        val current = _emoji2653
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji2653",
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
            // M30.5 18.5 c0 -0.829 -0.672 -1.5 -1.5 -1.5 h-3.472 c0.291 -6.296 3.25 -8.705 3.371 -8.8 0.662 -0.497 0.797 -1.438 0.3 -2.1 -0.497 -0.663 -1.437 -0.796 -2.101 -0.3 -0.18 0.135 -4.242 3.296 -4.567 11.2 h-9.064 C13.141 9.096 9.079 5.935 8.898 5.8 c-0.657 -0.494 -1.583 -0.362 -2.083 0.292 -0.5 0.652 -0.376 1.59 0.271 2.098 0.132 0.104 3.093 2.514 3.384 8.81 H7 c-0.829 0 -1.5 0.671 -1.5 1.5 0 0.828 0.671 1.5 1.5 1.5 h3.398 c-0.535 5.524 -3.161 7.691 -3.31 7.809 -0.653 0.499 -0.784 1.433 -0.29 2.092 0.295 0.392 0.745 0.599 1.202 0.599 0.313 0 0.629 -0.098 0.899 -0.3 0.173 -0.129 3.9 -3.028 4.508 -10.2 h9.185 c0.607 7.172 4.335 10.071 4.507 10.2 0.269 0.201 0.582 0.298 0.892 0.298 0.451 0 0.896 -0.204 1.192 -0.59 0.5 -0.652 0.376 -1.591 -0.271 -2.099 -0.125 -0.099 -2.773 -2.26 -3.312 -7.81 H29 c0.828 0.001 1.5 -0.671 1.5 -1.499z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 30.5 18.5
                moveTo(x = 30.5f, y = 18.5f)
                // c 0 -0.829 -0.672 -1.5 -1.5 -1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.829f,
                    dx2 = -0.672f,
                    dy2 = -1.5f,
                    dx3 = -1.5f,
                    dy3 = -1.5f,
                )
                // h -3.472
                horizontalLineToRelative(dx = -3.472f)
                // c 0.291 -6.296 3.25 -8.705 3.371 -8.8
                curveToRelative(
                    dx1 = 0.291f,
                    dy1 = -6.296f,
                    dx2 = 3.25f,
                    dy2 = -8.705f,
                    dx3 = 3.371f,
                    dy3 = -8.8f,
                )
                // c 0.662 -0.497 0.797 -1.438 0.3 -2.1
                curveToRelative(
                    dx1 = 0.662f,
                    dy1 = -0.497f,
                    dx2 = 0.797f,
                    dy2 = -1.438f,
                    dx3 = 0.3f,
                    dy3 = -2.1f,
                )
                // c -0.497 -0.663 -1.437 -0.796 -2.101 -0.3
                curveToRelative(
                    dx1 = -0.497f,
                    dy1 = -0.663f,
                    dx2 = -1.437f,
                    dy2 = -0.796f,
                    dx3 = -2.101f,
                    dy3 = -0.3f,
                )
                // c -0.18 0.135 -4.242 3.296 -4.567 11.2
                curveToRelative(
                    dx1 = -0.18f,
                    dy1 = 0.135f,
                    dx2 = -4.242f,
                    dy2 = 3.296f,
                    dx3 = -4.567f,
                    dy3 = 11.2f,
                )
                // h -9.064
                horizontalLineToRelative(dx = -9.064f)
                // C 13.141 9.096 9.079 5.935 8.898 5.8
                curveTo(
                    x1 = 13.141f,
                    y1 = 9.096f,
                    x2 = 9.079f,
                    y2 = 5.935f,
                    x3 = 8.898f,
                    y3 = 5.8f,
                )
                // c -0.657 -0.494 -1.583 -0.362 -2.083 0.292
                curveToRelative(
                    dx1 = -0.657f,
                    dy1 = -0.494f,
                    dx2 = -1.583f,
                    dy2 = -0.362f,
                    dx3 = -2.083f,
                    dy3 = 0.292f,
                )
                // c -0.5 0.652 -0.376 1.59 0.271 2.098
                curveToRelative(
                    dx1 = -0.5f,
                    dy1 = 0.652f,
                    dx2 = -0.376f,
                    dy2 = 1.59f,
                    dx3 = 0.271f,
                    dy3 = 2.098f,
                )
                // c 0.132 0.104 3.093 2.514 3.384 8.81
                curveToRelative(
                    dx1 = 0.132f,
                    dy1 = 0.104f,
                    dx2 = 3.093f,
                    dy2 = 2.514f,
                    dx3 = 3.384f,
                    dy3 = 8.81f,
                )
                // H 7
                horizontalLineTo(x = 7.0f)
                // c -0.829 0 -1.5 0.671 -1.5 1.5
                curveToRelative(
                    dx1 = -0.829f,
                    dy1 = 0.0f,
                    dx2 = -1.5f,
                    dy2 = 0.671f,
                    dx3 = -1.5f,
                    dy3 = 1.5f,
                )
                // c 0 0.828 0.671 1.5 1.5 1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.828f,
                    dx2 = 0.671f,
                    dy2 = 1.5f,
                    dx3 = 1.5f,
                    dy3 = 1.5f,
                )
                // h 3.398
                horizontalLineToRelative(dx = 3.398f)
                // c -0.535 5.524 -3.161 7.691 -3.31 7.809
                curveToRelative(
                    dx1 = -0.535f,
                    dy1 = 5.524f,
                    dx2 = -3.161f,
                    dy2 = 7.691f,
                    dx3 = -3.31f,
                    dy3 = 7.809f,
                )
                // c -0.653 0.499 -0.784 1.433 -0.29 2.092
                curveToRelative(
                    dx1 = -0.653f,
                    dy1 = 0.499f,
                    dx2 = -0.784f,
                    dy2 = 1.433f,
                    dx3 = -0.29f,
                    dy3 = 2.092f,
                )
                // c 0.295 0.392 0.745 0.599 1.202 0.599
                curveToRelative(
                    dx1 = 0.295f,
                    dy1 = 0.392f,
                    dx2 = 0.745f,
                    dy2 = 0.599f,
                    dx3 = 1.202f,
                    dy3 = 0.599f,
                )
                // c 0.313 0 0.629 -0.098 0.899 -0.3
                curveToRelative(
                    dx1 = 0.313f,
                    dy1 = 0.0f,
                    dx2 = 0.629f,
                    dy2 = -0.098f,
                    dx3 = 0.899f,
                    dy3 = -0.3f,
                )
                // c 0.173 -0.129 3.9 -3.028 4.508 -10.2
                curveToRelative(
                    dx1 = 0.173f,
                    dy1 = -0.129f,
                    dx2 = 3.9f,
                    dy2 = -3.028f,
                    dx3 = 4.508f,
                    dy3 = -10.2f,
                )
                // h 9.185
                horizontalLineToRelative(dx = 9.185f)
                // c 0.607 7.172 4.335 10.071 4.507 10.2
                curveToRelative(
                    dx1 = 0.607f,
                    dy1 = 7.172f,
                    dx2 = 4.335f,
                    dy2 = 10.071f,
                    dx3 = 4.507f,
                    dy3 = 10.2f,
                )
                // c 0.269 0.201 0.582 0.298 0.892 0.298
                curveToRelative(
                    dx1 = 0.269f,
                    dy1 = 0.201f,
                    dx2 = 0.582f,
                    dy2 = 0.298f,
                    dx3 = 0.892f,
                    dy3 = 0.298f,
                )
                // c 0.451 0 0.896 -0.204 1.192 -0.59
                curveToRelative(
                    dx1 = 0.451f,
                    dy1 = 0.0f,
                    dx2 = 0.896f,
                    dy2 = -0.204f,
                    dx3 = 1.192f,
                    dy3 = -0.59f,
                )
                // c 0.5 -0.652 0.376 -1.591 -0.271 -2.099
                curveToRelative(
                    dx1 = 0.5f,
                    dy1 = -0.652f,
                    dx2 = 0.376f,
                    dy2 = -1.591f,
                    dx3 = -0.271f,
                    dy3 = -2.099f,
                )
                // c -0.125 -0.099 -2.773 -2.26 -3.312 -7.81
                curveToRelative(
                    dx1 = -0.125f,
                    dy1 = -0.099f,
                    dx2 = -2.773f,
                    dy2 = -2.26f,
                    dx3 = -3.312f,
                    dy3 = -7.81f,
                )
                // H 29
                horizontalLineTo(x = 29.0f)
                // c 0.828 0.001 1.5 -0.671 1.5 -1.499z
                curveToRelative(
                    dx1 = 0.828f,
                    dy1 = 0.001f,
                    dx2 = 1.5f,
                    dy2 = -0.671f,
                    dx3 = 1.5f,
                    dy3 = -1.499f,
                )
                close()
            }
        }.build().also { _emoji2653 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji2653: ImageVector? = null
