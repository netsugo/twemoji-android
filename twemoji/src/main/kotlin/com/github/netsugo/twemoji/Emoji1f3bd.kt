package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f3bd: ImageVector
    get() {
        val current = _emoji1f3bd
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f3bd",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M6.318 1.031 c1.499 1.499 13.184 8.685 23.386 0 V12 H6.318 V1.031z
            path(
                fill = SolidColor(Color(0xFF226699)),
            ) {
                // M 6.318 1.031
                moveTo(x = 6.318f, y = 1.031f)
                // c 1.499 1.499 13.184 8.685 23.386 0
                curveToRelative(
                    dx1 = 1.499f,
                    dy1 = 1.499f,
                    dx2 = 13.184f,
                    dy2 = 8.685f,
                    dx3 = 23.386f,
                    dy3 = 0.0f,
                )
                // V 12
                verticalLineTo(y = 12.0f)
                // H 6.318
                horizontalLineTo(x = 6.318f)
                // V 1.031z
                verticalLineTo(y = 1.031f)
                close()
            }
            // M34.918 5.946 c0 -2.537 -2.429 -4.475 -4.27 -5.391 -0.761 -0.378 -1.812 0.393 -1.896 0.873 -0.943 5.39 -6.867 10.08 -10.753 10.08 -3.833 0 -9.636 -4.563 -10.696 -9.861 C7.193 1.096 6.12 0.18 5.356 0.562 c-1.838 0.917 -4.251 2.853 -4.251 5.384 3.122 4.607 3.827 6.381 3.827 11.159 0 4.777 -1.366 14.117 -2.56 16.507 C3.566 34.807 10.594 36 18 36 c7.405 0 14.448 -1.193 15.642 -2.389 -1.194 -2.39 -2.546 -11.73 -2.546 -16.507 0 -4.777 0.701 -6.551 3.822 -11.158z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 34.918 5.946
                moveTo(x = 34.918f, y = 5.946f)
                // c 0 -2.537 -2.429 -4.475 -4.27 -5.391
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.537f,
                    dx2 = -2.429f,
                    dy2 = -4.475f,
                    dx3 = -4.27f,
                    dy3 = -5.391f,
                )
                // c -0.761 -0.378 -1.812 0.393 -1.896 0.873
                curveToRelative(
                    dx1 = -0.761f,
                    dy1 = -0.378f,
                    dx2 = -1.812f,
                    dy2 = 0.393f,
                    dx3 = -1.896f,
                    dy3 = 0.873f,
                )
                // c -0.943 5.39 -6.867 10.08 -10.753 10.08
                curveToRelative(
                    dx1 = -0.943f,
                    dy1 = 5.39f,
                    dx2 = -6.867f,
                    dy2 = 10.08f,
                    dx3 = -10.753f,
                    dy3 = 10.08f,
                )
                // c -3.833 0 -9.636 -4.563 -10.696 -9.861
                curveToRelative(
                    dx1 = -3.833f,
                    dy1 = 0.0f,
                    dx2 = -9.636f,
                    dy2 = -4.563f,
                    dx3 = -10.696f,
                    dy3 = -9.861f,
                )
                // C 7.193 1.096 6.12 0.18 5.356 0.562
                curveTo(
                    x1 = 7.193f,
                    y1 = 1.096f,
                    x2 = 6.12f,
                    y2 = 0.18f,
                    x3 = 5.356f,
                    y3 = 0.562f,
                )
                // c -1.838 0.917 -4.251 2.853 -4.251 5.384
                curveToRelative(
                    dx1 = -1.838f,
                    dy1 = 0.917f,
                    dx2 = -4.251f,
                    dy2 = 2.853f,
                    dx3 = -4.251f,
                    dy3 = 5.384f,
                )
                // c 3.122 4.607 3.827 6.381 3.827 11.159
                curveToRelative(
                    dx1 = 3.122f,
                    dy1 = 4.607f,
                    dx2 = 3.827f,
                    dy2 = 6.381f,
                    dx3 = 3.827f,
                    dy3 = 11.159f,
                )
                // c 0 4.777 -1.366 14.117 -2.56 16.507
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.777f,
                    dx2 = -1.366f,
                    dy2 = 14.117f,
                    dx3 = -2.56f,
                    dy3 = 16.507f,
                )
                // C 3.566 34.807 10.594 36 18 36
                curveTo(
                    x1 = 3.566f,
                    y1 = 34.807f,
                    x2 = 10.594f,
                    y2 = 36.0f,
                    x3 = 18.0f,
                    y3 = 36.0f,
                )
                // c 7.405 0 14.448 -1.193 15.642 -2.389
                curveToRelative(
                    dx1 = 7.405f,
                    dy1 = 0.0f,
                    dx2 = 14.448f,
                    dy2 = -1.193f,
                    dx3 = 15.642f,
                    dy3 = -2.389f,
                )
                // c -1.194 -2.39 -2.546 -11.73 -2.546 -16.507
                curveToRelative(
                    dx1 = -1.194f,
                    dy1 = -2.39f,
                    dx2 = -2.546f,
                    dy2 = -11.73f,
                    dx3 = -2.546f,
                    dy3 = -16.507f,
                )
                // c 0 -4.777 0.701 -6.551 3.822 -11.158z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.777f,
                    dx2 = 0.701f,
                    dy2 = -6.551f,
                    dx3 = 3.822f,
                    dy3 = -11.158f,
                )
                close()
            }
            // M4.192 25.616 c-0.433 3.006 -1.002 5.832 -1.56 7.366 l28.506 -17.637 c0.177 -3.329 0.976 -5.184 3.323 -8.717 L4.192 25.616z
            path(
                fill = SolidColor(Color(0xFFFFD983)),
            ) {
                // M 4.192 25.616
                moveTo(x = 4.192f, y = 25.616f)
                // c -0.433 3.006 -1.002 5.832 -1.56 7.366
                curveToRelative(
                    dx1 = -0.433f,
                    dy1 = 3.006f,
                    dx2 = -1.002f,
                    dy2 = 5.832f,
                    dx3 = -1.56f,
                    dy3 = 7.366f,
                )
                // l 28.506 -17.637
                lineToRelative(dx = 28.506f, dy = -17.637f)
                // c 0.177 -3.329 0.976 -5.184 3.323 -8.717
                curveToRelative(
                    dx1 = 0.177f,
                    dy1 = -3.329f,
                    dx2 = 0.976f,
                    dy2 = -5.184f,
                    dx3 = 3.323f,
                    dy3 = -8.717f,
                )
                // L 4.192 25.616z
                lineTo(x = 4.192f, y = 25.616f)
                close()
            }
        }.build().also { _emoji1f3bd = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f3bd: ImageVector? = null
