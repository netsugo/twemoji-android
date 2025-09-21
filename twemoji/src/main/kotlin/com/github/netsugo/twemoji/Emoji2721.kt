package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji2721: ImageVector
    get() {
        val current = _emoji2721
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji2721",
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
            // M27.152 18 l3.716 -6.504 c0.177 -0.31 0.176 -0.69 -0.003 -0.998 C30.686 10.19 30.356 10 30 10 h-7.42 l-3.712 -6.496 c-0.355 -0.623 -1.381 -0.623 -1.736 0 L13.42 10 L6 10 c-0.356 0 -0.686 0.19 -0.865 0.498 -0.179 0.308 -0.18 0.688 -0.003 0.998 L8.848 18 l-3.716 6.504 c-0.177 0.31 -0.176 0.689 0.003 0.998 0.179 0.309 0.509 0.498 0.865 0.498 h7.42 l3.712 6.496 c0.178 0.312 0.509 0.504 0.868 0.504 s0.69 -0.192 0.868 -0.504 L22.58 26 L30 26 c0.356 0 0.686 -0.189 0.865 -0.498 0.179 -0.309 0.18 -0.688 0.003 -0.998 L27.152 18z M28.276 12 L26 15.984 23.723 12 h4.553z M24.848 18 l-3.428 6 h-6.84 l-3.429 -6 3.429 -6 h6.839 l3.429 6z M18 6.016 L20.277 10 h-4.553 L18 6.016z M7.723 12 h4.554 L10 15.985 7.723 12z M7.723 24 L10 20.015 12.277 24 L7.723 24z M18 29.984 L15.723 26 h4.553 L18 29.984z M23.723 24 L26 20.016 28.276 24 h-4.553z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 27.152 18
                moveTo(x = 27.152f, y = 18.0f)
                // l 3.716 -6.504
                lineToRelative(dx = 3.716f, dy = -6.504f)
                // c 0.177 -0.31 0.176 -0.69 -0.003 -0.998
                curveToRelative(
                    dx1 = 0.177f,
                    dy1 = -0.31f,
                    dx2 = 0.176f,
                    dy2 = -0.69f,
                    dx3 = -0.003f,
                    dy3 = -0.998f,
                )
                // C 30.686 10.19 30.356 10 30 10
                curveTo(
                    x1 = 30.686f,
                    y1 = 10.19f,
                    x2 = 30.356f,
                    y2 = 10.0f,
                    x3 = 30.0f,
                    y3 = 10.0f,
                )
                // h -7.42
                horizontalLineToRelative(dx = -7.42f)
                // l -3.712 -6.496
                lineToRelative(dx = -3.712f, dy = -6.496f)
                // c -0.355 -0.623 -1.381 -0.623 -1.736 0
                curveToRelative(
                    dx1 = -0.355f,
                    dy1 = -0.623f,
                    dx2 = -1.381f,
                    dy2 = -0.623f,
                    dx3 = -1.736f,
                    dy3 = 0.0f,
                )
                // L 13.42 10
                lineTo(x = 13.42f, y = 10.0f)
                // L 6 10
                lineTo(x = 6.0f, y = 10.0f)
                // c -0.356 0 -0.686 0.19 -0.865 0.498
                curveToRelative(
                    dx1 = -0.356f,
                    dy1 = 0.0f,
                    dx2 = -0.686f,
                    dy2 = 0.19f,
                    dx3 = -0.865f,
                    dy3 = 0.498f,
                )
                // c -0.179 0.308 -0.18 0.688 -0.003 0.998
                curveToRelative(
                    dx1 = -0.179f,
                    dy1 = 0.308f,
                    dx2 = -0.18f,
                    dy2 = 0.688f,
                    dx3 = -0.003f,
                    dy3 = 0.998f,
                )
                // L 8.848 18
                lineTo(x = 8.848f, y = 18.0f)
                // l -3.716 6.504
                lineToRelative(dx = -3.716f, dy = 6.504f)
                // c -0.177 0.31 -0.176 0.689 0.003 0.998
                curveToRelative(
                    dx1 = -0.177f,
                    dy1 = 0.31f,
                    dx2 = -0.176f,
                    dy2 = 0.689f,
                    dx3 = 0.003f,
                    dy3 = 0.998f,
                )
                // c 0.179 0.309 0.509 0.498 0.865 0.498
                curveToRelative(
                    dx1 = 0.179f,
                    dy1 = 0.309f,
                    dx2 = 0.509f,
                    dy2 = 0.498f,
                    dx3 = 0.865f,
                    dy3 = 0.498f,
                )
                // h 7.42
                horizontalLineToRelative(dx = 7.42f)
                // l 3.712 6.496
                lineToRelative(dx = 3.712f, dy = 6.496f)
                // c 0.178 0.312 0.509 0.504 0.868 0.504
                curveToRelative(
                    dx1 = 0.178f,
                    dy1 = 0.312f,
                    dx2 = 0.509f,
                    dy2 = 0.504f,
                    dx3 = 0.868f,
                    dy3 = 0.504f,
                )
                // s 0.69 -0.192 0.868 -0.504
                reflectiveCurveToRelative(
                    dx1 = 0.69f,
                    dy1 = -0.192f,
                    dx2 = 0.868f,
                    dy2 = -0.504f,
                )
                // L 22.58 26
                lineTo(x = 22.58f, y = 26.0f)
                // L 30 26
                lineTo(x = 30.0f, y = 26.0f)
                // c 0.356 0 0.686 -0.189 0.865 -0.498
                curveToRelative(
                    dx1 = 0.356f,
                    dy1 = 0.0f,
                    dx2 = 0.686f,
                    dy2 = -0.189f,
                    dx3 = 0.865f,
                    dy3 = -0.498f,
                )
                // c 0.179 -0.309 0.18 -0.688 0.003 -0.998
                curveToRelative(
                    dx1 = 0.179f,
                    dy1 = -0.309f,
                    dx2 = 0.18f,
                    dy2 = -0.688f,
                    dx3 = 0.003f,
                    dy3 = -0.998f,
                )
                // L 27.152 18z
                lineTo(x = 27.152f, y = 18.0f)
                close()
                // M 28.276 12
                moveTo(x = 28.276f, y = 12.0f)
                // L 26 15.984
                lineTo(x = 26.0f, y = 15.984f)
                // L 23.723 12
                lineTo(x = 23.723f, y = 12.0f)
                // h 4.553z
                horizontalLineToRelative(dx = 4.553f)
                close()
                // M 24.848 18
                moveTo(x = 24.848f, y = 18.0f)
                // l -3.428 6
                lineToRelative(dx = -3.428f, dy = 6.0f)
                // h -6.84
                horizontalLineToRelative(dx = -6.84f)
                // l -3.429 -6
                lineToRelative(dx = -3.429f, dy = -6.0f)
                // l 3.429 -6
                lineToRelative(dx = 3.429f, dy = -6.0f)
                // h 6.839
                horizontalLineToRelative(dx = 6.839f)
                // l 3.429 6z
                lineToRelative(dx = 3.429f, dy = 6.0f)
                close()
                // M 18 6.016
                moveTo(x = 18.0f, y = 6.016f)
                // L 20.277 10
                lineTo(x = 20.277f, y = 10.0f)
                // h -4.553
                horizontalLineToRelative(dx = -4.553f)
                // L 18 6.016z
                lineTo(x = 18.0f, y = 6.016f)
                close()
                // M 7.723 12
                moveTo(x = 7.723f, y = 12.0f)
                // h 4.554
                horizontalLineToRelative(dx = 4.554f)
                // L 10 15.985
                lineTo(x = 10.0f, y = 15.985f)
                // L 7.723 12z
                lineTo(x = 7.723f, y = 12.0f)
                close()
                // M 7.723 24
                moveTo(x = 7.723f, y = 24.0f)
                // L 10 20.015
                lineTo(x = 10.0f, y = 20.015f)
                // L 12.277 24
                lineTo(x = 12.277f, y = 24.0f)
                // L 7.723 24z
                lineTo(x = 7.723f, y = 24.0f)
                close()
                // M 18 29.984
                moveTo(x = 18.0f, y = 29.984f)
                // L 15.723 26
                lineTo(x = 15.723f, y = 26.0f)
                // h 4.553
                horizontalLineToRelative(dx = 4.553f)
                // L 18 29.984z
                lineTo(x = 18.0f, y = 29.984f)
                close()
                // M 23.723 24
                moveTo(x = 23.723f, y = 24.0f)
                // L 26 20.016
                lineTo(x = 26.0f, y = 20.016f)
                // L 28.276 24
                lineTo(x = 28.276f, y = 24.0f)
                // h -4.553z
                horizontalLineToRelative(dx = -4.553f)
                close()
            }
        }.build().also { _emoji2721 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji2721: ImageVector? = null
