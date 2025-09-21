package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f37c: ImageVector
    get() {
        val current = _emoji1f37c
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f37c",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M33 7.222 c0 -1.414 0.717 -0.707 1.424 -1.414 1.416 -1.414 2.128 -3.536 0.714 -4.95 -1.415 -1.414 -3.534 -0.697 -4.948 0.717 -0.708 0.707 0.002 1.425 -1.412 1.425 h-5.657 l0.707 0.697 s3.536 4.944 4.243 4.237 c-0.707 0.708 4.231 4.24 4.231 4.24 l0.698 0.705 V7.222z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 33 7.222
                moveTo(x = 33.0f, y = 7.222f)
                // c 0 -1.414 0.717 -0.707 1.424 -1.414
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.414f,
                    dx2 = 0.717f,
                    dy2 = -0.707f,
                    dx3 = 1.424f,
                    dy3 = -1.414f,
                )
                // c 1.416 -1.414 2.128 -3.536 0.714 -4.95
                curveToRelative(
                    dx1 = 1.416f,
                    dy1 = -1.414f,
                    dx2 = 2.128f,
                    dy2 = -3.536f,
                    dx3 = 0.714f,
                    dy3 = -4.95f,
                )
                // c -1.415 -1.414 -3.534 -0.697 -4.948 0.717
                curveToRelative(
                    dx1 = -1.415f,
                    dy1 = -1.414f,
                    dx2 = -3.534f,
                    dy2 = -0.697f,
                    dx3 = -4.948f,
                    dy3 = 0.717f,
                )
                // c -0.708 0.707 0.002 1.425 -1.412 1.425
                curveToRelative(
                    dx1 = -0.708f,
                    dy1 = 0.707f,
                    dx2 = 0.002f,
                    dy2 = 1.425f,
                    dx3 = -1.412f,
                    dy3 = 1.425f,
                )
                // h -5.657
                horizontalLineToRelative(dx = -5.657f)
                // l 0.707 0.697
                lineToRelative(dx = 0.707f, dy = 0.697f)
                // s 3.536 4.944 4.243 4.237
                reflectiveCurveToRelative(
                    dx1 = 3.536f,
                    dy1 = 4.944f,
                    dx2 = 4.243f,
                    dy2 = 4.237f,
                )
                // c -0.707 0.708 4.231 4.24 4.231 4.24
                curveToRelative(
                    dx1 = -0.707f,
                    dy1 = 0.708f,
                    dx2 = 4.231f,
                    dy2 = 4.24f,
                    dx3 = 4.231f,
                    dy3 = 4.24f,
                )
                // l 0.698 0.705
                lineToRelative(dx = 0.698f, dy = 0.705f)
                // V 7.222z
                verticalLineTo(y = 7.222f)
                close()
            }
            // M30.899 15 l-4.949 -4.95 L21 5.101 c-0.707 0.707 -4.243 0 -5.657 1.414 l-0.707 0.707 -2.122 2.122 L1.615 20.242 c-1.562 1.562 -1.562 4.096 0 5.657 l8.485 8.485 c1.562 1.562 4.095 1.562 5.657 0 l9.9 -9.899 3.121 -3.121 0.707 -0.707 c1.414 -1.415 0.707 -4.95 1.414 -5.657z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 30.899 15
                moveTo(x = 30.899f, y = 15.0f)
                // l -4.949 -4.95
                lineToRelative(dx = -4.949f, dy = -4.95f)
                // L 21 5.101
                lineTo(x = 21.0f, y = 5.101f)
                // c -0.707 0.707 -4.243 0 -5.657 1.414
                curveToRelative(
                    dx1 = -0.707f,
                    dy1 = 0.707f,
                    dx2 = -4.243f,
                    dy2 = 0.0f,
                    dx3 = -5.657f,
                    dy3 = 1.414f,
                )
                // l -0.707 0.707
                lineToRelative(dx = -0.707f, dy = 0.707f)
                // l -2.122 2.122
                lineToRelative(dx = -2.122f, dy = 2.122f)
                // L 1.615 20.242
                lineTo(x = 1.615f, y = 20.242f)
                // c -1.562 1.562 -1.562 4.096 0 5.657
                curveToRelative(
                    dx1 = -1.562f,
                    dy1 = 1.562f,
                    dx2 = -1.562f,
                    dy2 = 4.096f,
                    dx3 = 0.0f,
                    dy3 = 5.657f,
                )
                // l 8.485 8.485
                lineToRelative(dx = 8.485f, dy = 8.485f)
                // c 1.562 1.562 4.095 1.562 5.657 0
                curveToRelative(
                    dx1 = 1.562f,
                    dy1 = 1.562f,
                    dx2 = 4.095f,
                    dy2 = 1.562f,
                    dx3 = 5.657f,
                    dy3 = 0.0f,
                )
                // l 9.9 -9.899
                lineToRelative(dx = 9.9f, dy = -9.899f)
                // l 3.121 -3.121
                lineToRelative(dx = 3.121f, dy = -3.121f)
                // l 0.707 -0.707
                lineToRelative(dx = 0.707f, dy = -0.707f)
                // c 1.414 -1.415 0.707 -4.95 1.414 -5.657z
                curveToRelative(
                    dx1 = 1.414f,
                    dy1 = -1.415f,
                    dx2 = 0.707f,
                    dy2 = -4.95f,
                    dx3 = 1.414f,
                    dy3 = -5.657f,
                )
                close()
            }
            // M32.667 14.646 c-0.977 0.977 -1.852 1.684 -2.828 0.707 l-9.192 -9.192 c-0.977 -0.977 -0.269 -1.852 0.707 -2.829 0.977 -0.976 2.559 -0.976 3.535 0 l7.778 7.778 c0.977 0.977 0.977 2.56 0 3.536z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 32.667 14.646
                moveTo(x = 32.667f, y = 14.646f)
                // c -0.977 0.977 -1.852 1.684 -2.828 0.707
                curveToRelative(
                    dx1 = -0.977f,
                    dy1 = 0.977f,
                    dx2 = -1.852f,
                    dy2 = 1.684f,
                    dx3 = -2.828f,
                    dy3 = 0.707f,
                )
                // l -9.192 -9.192
                lineToRelative(dx = -9.192f, dy = -9.192f)
                // c -0.977 -0.977 -0.269 -1.852 0.707 -2.829
                curveToRelative(
                    dx1 = -0.977f,
                    dy1 = -0.977f,
                    dx2 = -0.269f,
                    dy2 = -1.852f,
                    dx3 = 0.707f,
                    dy3 = -2.829f,
                )
                // c 0.977 -0.976 2.559 -0.976 3.535 0
                curveToRelative(
                    dx1 = 0.977f,
                    dy1 = -0.976f,
                    dx2 = 2.559f,
                    dy2 = -0.976f,
                    dx3 = 3.535f,
                    dy3 = 0.0f,
                )
                // l 7.778 7.778
                lineToRelative(dx = 7.778f, dy = 7.778f)
                // c 0.977 0.977 0.977 2.56 0 3.536z
                curveToRelative(
                    dx1 = 0.977f,
                    dy1 = 0.977f,
                    dx2 = 0.977f,
                    dy2 = 2.56f,
                    dx3 = 0.0f,
                    dy3 = 3.536f,
                )
                close()
            }
            // M13 32 c-0.256 0 -0.512 -0.098 -0.707 -0.293 -0.391 -0.391 -0.391 -1.023 0 -1.414 l12 -12 c0.391 -0.391 1.023 -0.391 1.414 0 s0.391 1.024 0 1.415 l-12 12 c-0.195 0.194 -0.451 0.292 -0.707 0.292z M9 28 c-0.256 0 -0.512 -0.098 -0.707 -0.293 -0.391 -0.391 -0.391 -1.023 0 -1.414 l12 -12 c0.391 -0.391 1.023 -0.391 1.414 0 s0.391 1.023 0 1.414 l-12 12.001 C9.512 27.902 9.256 28 9 28z M5 24 c-0.256 0 -0.512 -0.098 -0.707 -0.293 -0.391 -0.391 -0.391 -1.023 0 -1.414 l12 -12 c0.391 -0.391 1.023 -0.391 1.414 0 s0.391 1.023 0 1.414 l-12 12.001 C5.512 23.902 5.256 24 5 24z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 13 32
                moveTo(x = 13.0f, y = 32.0f)
                // c -0.256 0 -0.512 -0.098 -0.707 -0.293
                curveToRelative(
                    dx1 = -0.256f,
                    dy1 = 0.0f,
                    dx2 = -0.512f,
                    dy2 = -0.098f,
                    dx3 = -0.707f,
                    dy3 = -0.293f,
                )
                // c -0.391 -0.391 -0.391 -1.023 0 -1.414
                curveToRelative(
                    dx1 = -0.391f,
                    dy1 = -0.391f,
                    dx2 = -0.391f,
                    dy2 = -1.023f,
                    dx3 = 0.0f,
                    dy3 = -1.414f,
                )
                // l 12 -12
                lineToRelative(dx = 12.0f, dy = -12.0f)
                // c 0.391 -0.391 1.023 -0.391 1.414 0
                curveToRelative(
                    dx1 = 0.391f,
                    dy1 = -0.391f,
                    dx2 = 1.023f,
                    dy2 = -0.391f,
                    dx3 = 1.414f,
                    dy3 = 0.0f,
                )
                // s 0.391 1.024 0 1.415
                reflectiveCurveToRelative(
                    dx1 = 0.391f,
                    dy1 = 1.024f,
                    dx2 = 0.0f,
                    dy2 = 1.415f,
                )
                // l -12 12
                lineToRelative(dx = -12.0f, dy = 12.0f)
                // c -0.195 0.194 -0.451 0.292 -0.707 0.292z
                curveToRelative(
                    dx1 = -0.195f,
                    dy1 = 0.194f,
                    dx2 = -0.451f,
                    dy2 = 0.292f,
                    dx3 = -0.707f,
                    dy3 = 0.292f,
                )
                close()
                // M 9 28
                moveTo(x = 9.0f, y = 28.0f)
                // c -0.256 0 -0.512 -0.098 -0.707 -0.293
                curveToRelative(
                    dx1 = -0.256f,
                    dy1 = 0.0f,
                    dx2 = -0.512f,
                    dy2 = -0.098f,
                    dx3 = -0.707f,
                    dy3 = -0.293f,
                )
                // c -0.391 -0.391 -0.391 -1.023 0 -1.414
                curveToRelative(
                    dx1 = -0.391f,
                    dy1 = -0.391f,
                    dx2 = -0.391f,
                    dy2 = -1.023f,
                    dx3 = 0.0f,
                    dy3 = -1.414f,
                )
                // l 12 -12
                lineToRelative(dx = 12.0f, dy = -12.0f)
                // c 0.391 -0.391 1.023 -0.391 1.414 0
                curveToRelative(
                    dx1 = 0.391f,
                    dy1 = -0.391f,
                    dx2 = 1.023f,
                    dy2 = -0.391f,
                    dx3 = 1.414f,
                    dy3 = 0.0f,
                )
                // s 0.391 1.023 0 1.414
                reflectiveCurveToRelative(
                    dx1 = 0.391f,
                    dy1 = 1.023f,
                    dx2 = 0.0f,
                    dy2 = 1.414f,
                )
                // l -12 12.001
                lineToRelative(dx = -12.0f, dy = 12.001f)
                // C 9.512 27.902 9.256 28 9 28z
                curveTo(
                    x1 = 9.512f,
                    y1 = 27.902f,
                    x2 = 9.256f,
                    y2 = 28.0f,
                    x3 = 9.0f,
                    y3 = 28.0f,
                )
                close()
                // M 5 24
                moveTo(x = 5.0f, y = 24.0f)
                // c -0.256 0 -0.512 -0.098 -0.707 -0.293
                curveToRelative(
                    dx1 = -0.256f,
                    dy1 = 0.0f,
                    dx2 = -0.512f,
                    dy2 = -0.098f,
                    dx3 = -0.707f,
                    dy3 = -0.293f,
                )
                // c -0.391 -0.391 -0.391 -1.023 0 -1.414
                curveToRelative(
                    dx1 = -0.391f,
                    dy1 = -0.391f,
                    dx2 = -0.391f,
                    dy2 = -1.023f,
                    dx3 = 0.0f,
                    dy3 = -1.414f,
                )
                // l 12 -12
                lineToRelative(dx = 12.0f, dy = -12.0f)
                // c 0.391 -0.391 1.023 -0.391 1.414 0
                curveToRelative(
                    dx1 = 0.391f,
                    dy1 = -0.391f,
                    dx2 = 1.023f,
                    dy2 = -0.391f,
                    dx3 = 1.414f,
                    dy3 = 0.0f,
                )
                // s 0.391 1.023 0 1.414
                reflectiveCurveToRelative(
                    dx1 = 0.391f,
                    dy1 = 1.023f,
                    dx2 = 0.0f,
                    dy2 = 1.414f,
                )
                // l -12 12.001
                lineToRelative(dx = -12.0f, dy = 12.001f)
                // C 5.512 23.902 5.256 24 5 24z
                curveTo(
                    x1 = 5.512f,
                    y1 = 23.902f,
                    x2 = 5.256f,
                    y2 = 24.0f,
                    x3 = 5.0f,
                    y3 = 24.0f,
                )
                close()
            }
        }.build().also { _emoji1f37c = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f37c: ImageVector? = null
