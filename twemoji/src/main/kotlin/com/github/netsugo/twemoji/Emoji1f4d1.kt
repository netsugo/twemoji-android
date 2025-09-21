package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f4d1: ImageVector
    get() {
        val current = _emoji1f4d1
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f4d1",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M30.415 9.586 l-9 -9 C21.054 0.225 20.553 0 20 0 c-1.104 0 -1.999 0.896 -2 2 0 0.552 0.224 1.053 0.586 1.415 l-3.859 3.859 9 9 3.859 -3.859 c0.362 0.361 0.862 0.585 1.414 0.585 1.104 0 2.001 -0.896 2 -2 0 -0.552 -0.224 -1.052 -0.585 -1.414z
            path(
                fill = SolidColor(Color(0xFFE1E8ED)),
            ) {
                // M 30.415 9.586
                moveTo(x = 30.415f, y = 9.586f)
                // l -9 -9
                lineToRelative(dx = -9.0f, dy = -9.0f)
                // C 21.054 0.225 20.553 0 20 0
                curveTo(
                    x1 = 21.054f,
                    y1 = 0.225f,
                    x2 = 20.553f,
                    y2 = 0.0f,
                    x3 = 20.0f,
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
            // M20 0 H5 C2.791 0 1 1.791 1 4 v28 c0 2.209 1.791 4 4 4 h22 c2.209 0 4 -1.791 4 -4 V11 h-9 c-1 0 -2 -1 -2 -2 V0z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 20 0
                moveTo(x = 20.0f, y = 0.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
                // C 2.791 0 1 1.791 1 4
                curveTo(
                    x1 = 2.791f,
                    y1 = 0.0f,
                    x2 = 1.0f,
                    y2 = 1.791f,
                    x3 = 1.0f,
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
            // M20 0 h-2 v9 c0 2.209 1.791 4 4 4 h9 v-2 h-9 c-1 0 -2 -1 -2 -2 L20 0z M15 8 c0 0.552 -0.448 1 -1 1 L6 9 c-0.552 0 -1 -0.448 -1 -1 s0.448 -1 1 -1 h8 c0.552 0 1 0.448 1 1z M15 12 c0 0.552 -0.448 1 -1 1 L6 13 c-0.552 0 -1 -0.448 -1 -1 s0.448 -1 1 -1 h8 c0.552 0 1 0.448 1 1z M27 16 c0 0.552 -0.447 1 -1 1 L6 17 c-0.552 0 -1 -0.448 -1 -1 s0.448 -1 1 -1 h20 c0.553 0 1 0.448 1 1z M27 20 c0 0.553 -0.447 1 -1 1 L6 21 c-0.552 0 -1 -0.447 -1 -1 0 -0.553 0.448 -1 1 -1 h20 c0.553 0 1 0.447 1 1z M27 24 c0 0.553 -0.447 1 -1 1 L6 25 c-0.552 0 -1 -0.447 -1 -1 0 -0.553 0.448 -1 1 -1 h20 c0.553 0 1 0.447 1 1z M27 28 c0 0.553 -0.447 1 -1 1 L6 29 c-0.552 0 -1 -0.447 -1 -1 0 -0.553 0.448 -1 1 -1 h20 c0.553 0 1 0.447 1 1z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 20 0
                moveTo(x = 20.0f, y = 0.0f)
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
                // L 20 0z
                lineTo(x = 20.0f, y = 0.0f)
                close()
                // M 15 8
                moveTo(x = 15.0f, y = 8.0f)
                // c 0 0.552 -0.448 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = -0.448f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // L 6 9
                lineTo(x = 6.0f, y = 9.0f)
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
                // M 15 12
                moveTo(x = 15.0f, y = 12.0f)
                // c 0 0.552 -0.448 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = -0.448f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // L 6 13
                lineTo(x = 6.0f, y = 13.0f)
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
                // M 27 16
                moveTo(x = 27.0f, y = 16.0f)
                // c 0 0.552 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // L 6 17
                lineTo(x = 6.0f, y = 17.0f)
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
                // M 27 20
                moveTo(x = 27.0f, y = 20.0f)
                // c 0 0.553 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // L 6 21
                lineTo(x = 6.0f, y = 21.0f)
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
                // M 27 24
                moveTo(x = 27.0f, y = 24.0f)
                // c 0 0.553 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // L 6 25
                lineTo(x = 6.0f, y = 25.0f)
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
                // M 27 28
                moveTo(x = 27.0f, y = 28.0f)
                // c 0 0.553 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // L 6 29
                lineTo(x = 6.0f, y = 29.0f)
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
            // M31 19 s-5.906 -0.002 -5.935 0 c-0.291 0 -0.91 0.174 -1.255 0.606 l-2.328 2.929 c-0.644 0.809 -0.644 2.119 0 2.93 l2.328 2.929 c0.345 0.432 0.964 0.606 1.255 0.606 0.019 0.002 3.547 0 5.935 0 V19z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 31 19
                moveTo(x = 31.0f, y = 19.0f)
                // s -5.906 -0.002 -5.935 0
                reflectiveCurveToRelative(
                    dx1 = -5.906f,
                    dy1 = -0.002f,
                    dx2 = -5.935f,
                    dy2 = 0.0f,
                )
                // c -0.291 0 -0.91 0.174 -1.255 0.606
                curveToRelative(
                    dx1 = -0.291f,
                    dy1 = 0.0f,
                    dx2 = -0.91f,
                    dy2 = 0.174f,
                    dx3 = -1.255f,
                    dy3 = 0.606f,
                )
                // l -2.328 2.929
                lineToRelative(dx = -2.328f, dy = 2.929f)
                // c -0.644 0.809 -0.644 2.119 0 2.93
                curveToRelative(
                    dx1 = -0.644f,
                    dy1 = 0.809f,
                    dx2 = -0.644f,
                    dy2 = 2.119f,
                    dx3 = 0.0f,
                    dy3 = 2.93f,
                )
                // l 2.328 2.929
                lineToRelative(dx = 2.328f, dy = 2.929f)
                // c 0.345 0.432 0.964 0.606 1.255 0.606
                curveToRelative(
                    dx1 = 0.345f,
                    dy1 = 0.432f,
                    dx2 = 0.964f,
                    dy2 = 0.606f,
                    dx3 = 1.255f,
                    dy3 = 0.606f,
                )
                // c 0.019 0.002 3.547 0 5.935 0
                curveToRelative(
                    dx1 = 0.019f,
                    dy1 = 0.002f,
                    dx2 = 3.547f,
                    dy2 = 0.0f,
                    dx3 = 5.935f,
                    dy3 = 0.0f,
                )
                // V 19z
                verticalLineTo(y = 19.0f)
                close()
            }
            // M33 19 s-8.056 -0.002 -8.084 0 c-0.291 0 -0.91 0.139 -1.255 0.485 l-2.328 2.342 c-0.643 0.647 -0.643 1.695 0 2.344 l2.328 2.342 c0.345 0.346 0.964 0.487 1.255 0.487 0.028 0.002 8.084 0 8.084 0 1.104 0 2 -0.897 2 -2.001 V21 c0 -1.104 -0.896 -2 -2 -2z
            path(
                fill = SolidColor(Color(0xFF744EAA)),
            ) {
                // M 33 19
                moveTo(x = 33.0f, y = 19.0f)
                // s -8.056 -0.002 -8.084 0
                reflectiveCurveToRelative(
                    dx1 = -8.056f,
                    dy1 = -0.002f,
                    dx2 = -8.084f,
                    dy2 = 0.0f,
                )
                // c -0.291 0 -0.91 0.139 -1.255 0.485
                curveToRelative(
                    dx1 = -0.291f,
                    dy1 = 0.0f,
                    dx2 = -0.91f,
                    dy2 = 0.139f,
                    dx3 = -1.255f,
                    dy3 = 0.485f,
                )
                // l -2.328 2.342
                lineToRelative(dx = -2.328f, dy = 2.342f)
                // c -0.643 0.647 -0.643 1.695 0 2.344
                curveToRelative(
                    dx1 = -0.643f,
                    dy1 = 0.647f,
                    dx2 = -0.643f,
                    dy2 = 1.695f,
                    dx3 = 0.0f,
                    dy3 = 2.344f,
                )
                // l 2.328 2.342
                lineToRelative(dx = 2.328f, dy = 2.342f)
                // c 0.345 0.346 0.964 0.487 1.255 0.487
                curveToRelative(
                    dx1 = 0.345f,
                    dy1 = 0.346f,
                    dx2 = 0.964f,
                    dy2 = 0.487f,
                    dx3 = 1.255f,
                    dy3 = 0.487f,
                )
                // c 0.028 0.002 8.084 0 8.084 0
                curveToRelative(
                    dx1 = 0.028f,
                    dy1 = 0.002f,
                    dx2 = 8.084f,
                    dy2 = 0.0f,
                    dx3 = 8.084f,
                    dy3 = 0.0f,
                )
                // c 1.104 0 2 -0.897 2 -2.001
                curveToRelative(
                    dx1 = 1.104f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = -0.897f,
                    dx3 = 2.0f,
                    dy3 = -2.001f,
                )
                // V 21
                verticalLineTo(y = 21.0f)
                // c 0 -1.104 -0.896 -2 -2 -2z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.104f,
                    dx2 = -0.896f,
                    dy2 = -2.0f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                close()
            }
        }.build().also { _emoji1f4d1 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f4d1: ImageVector? = null
