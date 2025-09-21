package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f4c4: ImageVector
    get() {
        val current = _emoji1f4c4
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f4c4",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M32.415 9.586 l-9 -9 C23.054 0.225 22.553 0 22 0 c-1.104 0 -1.999 0.896 -2 2 0 0.552 0.224 1.053 0.586 1.415 l-3.859 3.859 9 9 3.859 -3.859 c0.362 0.361 0.862 0.585 1.414 0.585 1.104 0 2.001 -0.896 2 -2 0 -0.552 -0.224 -1.052 -0.585 -1.414z
            path(
                fill = SolidColor(Color(0xFFE1E8ED)),
            ) {
                // M 32.415 9.586
                moveTo(x = 32.415f, y = 9.586f)
                // l -9 -9
                lineToRelative(dx = -9.0f, dy = -9.0f)
                // C 23.054 0.225 22.553 0 22 0
                curveTo(
                    x1 = 23.054f,
                    y1 = 0.225f,
                    x2 = 22.553f,
                    y2 = 0.0f,
                    x3 = 22.0f,
                    y3 = 0.0f,
                )
                // c -1.104 0 -1.999 0.896 -2 2
                curveToRelative(
                    dx1 = -1.104f,
                    dy1 = 0.0f,
                    dx2 = -1.999f,
                    dy2 = 0.896f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // c 0 0.552 0.224 1.053 0.586 1.415
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = 0.224f,
                    dy2 = 1.053f,
                    dx3 = 0.586f,
                    dy3 = 1.415f,
                )
                // l -3.859 3.859
                lineToRelative(dx = -3.859f, dy = 3.859f)
                // l 9 9
                lineToRelative(dx = 9.0f, dy = 9.0f)
                // l 3.859 -3.859
                lineToRelative(dx = 3.859f, dy = -3.859f)
                // c 0.362 0.361 0.862 0.585 1.414 0.585
                curveToRelative(
                    dx1 = 0.362f,
                    dy1 = 0.361f,
                    dx2 = 0.862f,
                    dy2 = 0.585f,
                    dx3 = 1.414f,
                    dy3 = 0.585f,
                )
                // c 1.104 0 2.001 -0.896 2 -2
                curveToRelative(
                    dx1 = 1.104f,
                    dy1 = 0.0f,
                    dx2 = 2.001f,
                    dy2 = -0.896f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // c 0 -0.552 -0.224 -1.052 -0.585 -1.414z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = -0.224f,
                    dy2 = -1.052f,
                    dx3 = -0.585f,
                    dy3 = -1.414f,
                )
                close()
            }
            // M22 0 H7 C4.791 0 3 1.791 3 4 v28 c0 2.209 1.791 4 4 4 h22 c2.209 0 4 -1.791 4 -4 V11 h-9 c-1 0 -2 -1 -2 -2 V0z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 22 0
                moveTo(x = 22.0f, y = 0.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
                // C 4.791 0 3 1.791 3 4
                curveTo(
                    x1 = 4.791f,
                    y1 = 0.0f,
                    x2 = 3.0f,
                    y2 = 1.791f,
                    x3 = 3.0f,
                    y3 = 4.0f,
                )
                // v 28
                verticalLineToRelative(dy = 28.0f)
                // c 0 2.209 1.791 4 4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = 1.791f,
                    dy2 = 4.0f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // h 22
                horizontalLineToRelative(dx = 22.0f)
                // c 2.209 0 4 -1.791 4 -4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = -1.791f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // V 11
                verticalLineTo(y = 11.0f)
                // h -9
                horizontalLineToRelative(dx = -9.0f)
                // c -1 0 -2 -1 -2 -2
                curveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -1.0f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // V 0z
                verticalLineTo(y = 0.0f)
                close()
            }
            // M22 0 h-2 v9 c0 2.209 1.791 4 4 4 h9 v-2 h-9 c-1 0 -2 -1 -2 -2 L22 0z M17 8 c0 0.552 -0.448 1 -1 1 L8 9 c-0.552 0 -1 -0.448 -1 -1 s0.448 -1 1 -1 h8 c0.552 0 1 0.448 1 1z M17 12 c0 0.552 -0.448 1 -1 1 L8 13 c-0.552 0 -1 -0.448 -1 -1 s0.448 -1 1 -1 h8 c0.552 0 1 0.448 1 1z M29 16 c0 0.552 -0.447 1 -1 1 L8 17 c-0.552 0 -1 -0.448 -1 -1 s0.448 -1 1 -1 h20 c0.553 0 1 0.448 1 1z M29 20 c0 0.553 -0.447 1 -1 1 L8 21 c-0.552 0 -1 -0.447 -1 -1 0 -0.553 0.448 -1 1 -1 h20 c0.553 0 1 0.447 1 1z M29 24 c0 0.553 -0.447 1 -1 1 L8 25 c-0.552 0 -1 -0.447 -1 -1 0 -0.553 0.448 -1 1 -1 h20 c0.553 0 1 0.447 1 1z M29 28 c0 0.553 -0.447 1 -1 1 L8 29 c-0.552 0 -1 -0.447 -1 -1 0 -0.553 0.448 -1 1 -1 h20 c0.553 0 1 0.447 1 1z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 22 0
                moveTo(x = 22.0f, y = 0.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 9
                verticalLineToRelative(dy = 9.0f)
                // c 0 2.209 1.791 4 4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = 1.791f,
                    dy2 = 4.0f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // h 9
                horizontalLineToRelative(dx = 9.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -9
                horizontalLineToRelative(dx = -9.0f)
                // c -1 0 -2 -1 -2 -2
                curveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -1.0f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // L 22 0z
                lineTo(x = 22.0f, y = 0.0f)
                close()
                // M 17 8
                moveTo(x = 17.0f, y = 8.0f)
                // c 0 0.552 -0.448 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = -0.448f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // L 8 9
                lineTo(x = 8.0f, y = 9.0f)
                // c -0.552 0 -1 -0.448 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.448f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // s 0.448 -1 1 -1
                reflectiveCurveToRelative(
                    dx1 = 0.448f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // c 0.552 0 1 0.448 1 1z
                curveToRelative(
                    dx1 = 0.552f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.448f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                close()
                // M 17 12
                moveTo(x = 17.0f, y = 12.0f)
                // c 0 0.552 -0.448 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = -0.448f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // L 8 13
                lineTo(x = 8.0f, y = 13.0f)
                // c -0.552 0 -1 -0.448 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.448f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // s 0.448 -1 1 -1
                reflectiveCurveToRelative(
                    dx1 = 0.448f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // c 0.552 0 1 0.448 1 1z
                curveToRelative(
                    dx1 = 0.552f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.448f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                close()
                // M 29 16
                moveTo(x = 29.0f, y = 16.0f)
                // c 0 0.552 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // L 8 17
                lineTo(x = 8.0f, y = 17.0f)
                // c -0.552 0 -1 -0.448 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.448f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // s 0.448 -1 1 -1
                reflectiveCurveToRelative(
                    dx1 = 0.448f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // c 0.553 0 1 0.448 1 1z
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.448f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                close()
                // M 29 20
                moveTo(x = 29.0f, y = 20.0f)
                // c 0 0.553 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // L 8 21
                lineTo(x = 8.0f, y = 21.0f)
                // c -0.552 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // c 0 -0.553 0.448 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.553f,
                    dx2 = 0.448f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // c 0.553 0 1 0.447 1 1z
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.447f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                close()
                // M 29 24
                moveTo(x = 29.0f, y = 24.0f)
                // c 0 0.553 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // L 8 25
                lineTo(x = 8.0f, y = 25.0f)
                // c -0.552 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // c 0 -0.553 0.448 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.553f,
                    dx2 = 0.448f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // c 0.553 0 1 0.447 1 1z
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.447f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                close()
                // M 29 28
                moveTo(x = 29.0f, y = 28.0f)
                // c 0 0.553 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // L 8 29
                lineTo(x = 8.0f, y = 29.0f)
                // c -0.552 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // c 0 -0.553 0.448 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.553f,
                    dx2 = 0.448f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // c 0.553 0 1 0.447 1 1z
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.447f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                close()
            }
        }.build().also { _emoji1f4c4 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f4c4: ImageVector? = null
