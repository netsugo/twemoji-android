package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f6be: ImageVector
    get() {
        val current = _emoji1f6be
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f6be",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 32 c0 2.209 -1.791 4 -4 4 H4 c-2.209 0 -4 -1.791 -4 -4 V4 c0 -2.209 1.791 -4 4 -4 h28 c2.209 0 4 1.791 4 4 v28z
            path(
                fill = SolidColor(Color(0xFF226699)),
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
            // M1.695 13.402 c-0.066 -0.286 -0.088 -0.44 -0.088 -0.748 0 -0.704 0.594 -1.452 1.562 -1.452 1.057 0 1.562 0.616 1.761 1.584 l1.87 9.352 h0.044 l2.86 -9.638 c0.242 -0.792 0.902 -1.298 1.716 -1.298 s1.475 0.506 1.717 1.298 l2.86 9.638 h0.044 l1.87 -9.352 c0.198 -0.968 0.704 -1.584 1.76 -1.584 0.969 0 1.562 0.748 1.562 1.452 0 0.308 -0.021 0.462 -0.088 0.748 l-2.794 12.014 c-0.221 0.924 -0.946 1.716 -2.179 1.716 -1.078 0 -1.914 -0.704 -2.178 -1.606 l-2.553 -8.493 h-0.044 l-2.553 8.493 c-0.264 0.902 -1.1 1.606 -2.178 1.606 -1.232 0 -1.959 -0.792 -2.179 -1.716 L1.695 13.402z M29.349 11.07 c1.608 0 4.731 0.528 4.731 2.464 0 0.792 -0.549 1.474 -1.363 1.474 -0.902 0 -1.518 -0.77 -3.367 -0.77 -2.729 0 -4.136 2.31 -4.136 4.994 0 2.619 1.431 4.863 4.136 4.863 1.85 0 2.598 -0.924 3.5 -0.924 0.99 0 1.451 0.989 1.451 1.496 0 2.112 -3.322 2.596 -4.951 2.596 -4.466 0 -7.568 -3.542 -7.568 -8.097 -0.002 -4.576 3.078 -8.096 7.567 -8.096z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 1.695 13.402
                moveTo(x = 1.695f, y = 13.402f)
                // c -0.066 -0.286 -0.088 -0.44 -0.088 -0.748
                curveToRelative(
                    dx1 = -0.066f,
                    dy1 = -0.286f,
                    dx2 = -0.088f,
                    dy2 = -0.44f,
                    dx3 = -0.088f,
                    dy3 = -0.748f,
                )
                // c 0 -0.704 0.594 -1.452 1.562 -1.452
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.704f,
                    dx2 = 0.594f,
                    dy2 = -1.452f,
                    dx3 = 1.562f,
                    dy3 = -1.452f,
                )
                // c 1.057 0 1.562 0.616 1.761 1.584
                curveToRelative(
                    dx1 = 1.057f,
                    dy1 = 0.0f,
                    dx2 = 1.562f,
                    dy2 = 0.616f,
                    dx3 = 1.761f,
                    dy3 = 1.584f,
                )
                // l 1.87 9.352
                lineToRelative(dx = 1.87f, dy = 9.352f)
                // h 0.044
                horizontalLineToRelative(dx = 0.044f)
                // l 2.86 -9.638
                lineToRelative(dx = 2.86f, dy = -9.638f)
                // c 0.242 -0.792 0.902 -1.298 1.716 -1.298
                curveToRelative(
                    dx1 = 0.242f,
                    dy1 = -0.792f,
                    dx2 = 0.902f,
                    dy2 = -1.298f,
                    dx3 = 1.716f,
                    dy3 = -1.298f,
                )
                // s 1.475 0.506 1.717 1.298
                reflectiveCurveToRelative(
                    dx1 = 1.475f,
                    dy1 = 0.506f,
                    dx2 = 1.717f,
                    dy2 = 1.298f,
                )
                // l 2.86 9.638
                lineToRelative(dx = 2.86f, dy = 9.638f)
                // h 0.044
                horizontalLineToRelative(dx = 0.044f)
                // l 1.87 -9.352
                lineToRelative(dx = 1.87f, dy = -9.352f)
                // c 0.198 -0.968 0.704 -1.584 1.76 -1.584
                curveToRelative(
                    dx1 = 0.198f,
                    dy1 = -0.968f,
                    dx2 = 0.704f,
                    dy2 = -1.584f,
                    dx3 = 1.76f,
                    dy3 = -1.584f,
                )
                // c 0.969 0 1.562 0.748 1.562 1.452
                curveToRelative(
                    dx1 = 0.969f,
                    dy1 = 0.0f,
                    dx2 = 1.562f,
                    dy2 = 0.748f,
                    dx3 = 1.562f,
                    dy3 = 1.452f,
                )
                // c 0 0.308 -0.021 0.462 -0.088 0.748
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.308f,
                    dx2 = -0.021f,
                    dy2 = 0.462f,
                    dx3 = -0.088f,
                    dy3 = 0.748f,
                )
                // l -2.794 12.014
                lineToRelative(dx = -2.794f, dy = 12.014f)
                // c -0.221 0.924 -0.946 1.716 -2.179 1.716
                curveToRelative(
                    dx1 = -0.221f,
                    dy1 = 0.924f,
                    dx2 = -0.946f,
                    dy2 = 1.716f,
                    dx3 = -2.179f,
                    dy3 = 1.716f,
                )
                // c -1.078 0 -1.914 -0.704 -2.178 -1.606
                curveToRelative(
                    dx1 = -1.078f,
                    dy1 = 0.0f,
                    dx2 = -1.914f,
                    dy2 = -0.704f,
                    dx3 = -2.178f,
                    dy3 = -1.606f,
                )
                // l -2.553 -8.493
                lineToRelative(dx = -2.553f, dy = -8.493f)
                // h -0.044
                horizontalLineToRelative(dx = -0.044f)
                // l -2.553 8.493
                lineToRelative(dx = -2.553f, dy = 8.493f)
                // c -0.264 0.902 -1.1 1.606 -2.178 1.606
                curveToRelative(
                    dx1 = -0.264f,
                    dy1 = 0.902f,
                    dx2 = -1.1f,
                    dy2 = 1.606f,
                    dx3 = -2.178f,
                    dy3 = 1.606f,
                )
                // c -1.232 0 -1.959 -0.792 -2.179 -1.716
                curveToRelative(
                    dx1 = -1.232f,
                    dy1 = 0.0f,
                    dx2 = -1.959f,
                    dy2 = -0.792f,
                    dx3 = -2.179f,
                    dy3 = -1.716f,
                )
                // L 1.695 13.402z
                lineTo(x = 1.695f, y = 13.402f)
                close()
                // M 29.349 11.07
                moveTo(x = 29.349f, y = 11.07f)
                // c 1.608 0 4.731 0.528 4.731 2.464
                curveToRelative(
                    dx1 = 1.608f,
                    dy1 = 0.0f,
                    dx2 = 4.731f,
                    dy2 = 0.528f,
                    dx3 = 4.731f,
                    dy3 = 2.464f,
                )
                // c 0 0.792 -0.549 1.474 -1.363 1.474
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.792f,
                    dx2 = -0.549f,
                    dy2 = 1.474f,
                    dx3 = -1.363f,
                    dy3 = 1.474f,
                )
                // c -0.902 0 -1.518 -0.77 -3.367 -0.77
                curveToRelative(
                    dx1 = -0.902f,
                    dy1 = 0.0f,
                    dx2 = -1.518f,
                    dy2 = -0.77f,
                    dx3 = -3.367f,
                    dy3 = -0.77f,
                )
                // c -2.729 0 -4.136 2.31 -4.136 4.994
                curveToRelative(
                    dx1 = -2.729f,
                    dy1 = 0.0f,
                    dx2 = -4.136f,
                    dy2 = 2.31f,
                    dx3 = -4.136f,
                    dy3 = 4.994f,
                )
                // c 0 2.619 1.431 4.863 4.136 4.863
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.619f,
                    dx2 = 1.431f,
                    dy2 = 4.863f,
                    dx3 = 4.136f,
                    dy3 = 4.863f,
                )
                // c 1.85 0 2.598 -0.924 3.5 -0.924
                curveToRelative(
                    dx1 = 1.85f,
                    dy1 = 0.0f,
                    dx2 = 2.598f,
                    dy2 = -0.924f,
                    dx3 = 3.5f,
                    dy3 = -0.924f,
                )
                // c 0.99 0 1.451 0.989 1.451 1.496
                curveToRelative(
                    dx1 = 0.99f,
                    dy1 = 0.0f,
                    dx2 = 1.451f,
                    dy2 = 0.989f,
                    dx3 = 1.451f,
                    dy3 = 1.496f,
                )
                // c 0 2.112 -3.322 2.596 -4.951 2.596
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.112f,
                    dx2 = -3.322f,
                    dy2 = 2.596f,
                    dx3 = -4.951f,
                    dy3 = 2.596f,
                )
                // c -4.466 0 -7.568 -3.542 -7.568 -8.097
                curveToRelative(
                    dx1 = -4.466f,
                    dy1 = 0.0f,
                    dx2 = -7.568f,
                    dy2 = -3.542f,
                    dx3 = -7.568f,
                    dy3 = -8.097f,
                )
                // c -0.002 -4.576 3.078 -8.096 7.567 -8.096z
                curveToRelative(
                    dx1 = -0.002f,
                    dy1 = -4.576f,
                    dx2 = 3.078f,
                    dy2 = -8.096f,
                    dx3 = 7.567f,
                    dy3 = -8.096f,
                )
                close()
            }
        }.build().also { _emoji1f6be = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f6be: ImageVector? = null
