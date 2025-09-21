package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji2650: ImageVector
    get() {
        val current = _emoji2650
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji2650",
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
            // M28.5 6 H17 c-0.829 0 -1.5 0.671 -1.5 1.5 S16.171 9 17 9 h7.879 L13 20.879 9.061 16.94 c-0.586 -0.586 -1.535 -0.586 -2.121 0 -0.586 0.585 -0.586 1.536 0 2.121 L10.879 23 5.94 27.94 c-0.586 0.586 -0.586 1.535 0 2.121 0.292 0.293 0.676 0.439 1.06 0.439 s0.768 -0.146 1.061 -0.44 L13 25.121 l3.94 3.939 c0.293 0.293 0.677 0.44 1.06 0.44 s0.768 -0.146 1.06 -0.44 c0.586 -0.586 0.586 -1.535 0 -2.121 L15.121 23 27 11.121 V19 c0 0.828 0.672 1.5 1.5 1.5 S30 19.828 30 19 V7.5 c0 -0.829 -0.672 -1.5 -1.5 -1.5z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 28.5 6
                moveTo(x = 28.5f, y = 6.0f)
                // H 17
                horizontalLineTo(x = 17.0f)
                // c -0.829 0 -1.5 0.671 -1.5 1.5
                curveToRelative(
                    dx1 = -0.829f,
                    dy1 = 0.0f,
                    dx2 = -1.5f,
                    dy2 = 0.671f,
                    dx3 = -1.5f,
                    dy3 = 1.5f,
                )
                // S 16.171 9 17 9
                reflectiveCurveTo(
                    x1 = 16.171f,
                    y1 = 9.0f,
                    x2 = 17.0f,
                    y2 = 9.0f,
                )
                // h 7.879
                horizontalLineToRelative(dx = 7.879f)
                // L 13 20.879
                lineTo(x = 13.0f, y = 20.879f)
                // L 9.061 16.94
                lineTo(x = 9.061f, y = 16.94f)
                // c -0.586 -0.586 -1.535 -0.586 -2.121 0
                curveToRelative(
                    dx1 = -0.586f,
                    dy1 = -0.586f,
                    dx2 = -1.535f,
                    dy2 = -0.586f,
                    dx3 = -2.121f,
                    dy3 = 0.0f,
                )
                // c -0.586 0.585 -0.586 1.536 0 2.121
                curveToRelative(
                    dx1 = -0.586f,
                    dy1 = 0.585f,
                    dx2 = -0.586f,
                    dy2 = 1.536f,
                    dx3 = 0.0f,
                    dy3 = 2.121f,
                )
                // L 10.879 23
                lineTo(x = 10.879f, y = 23.0f)
                // L 5.94 27.94
                lineTo(x = 5.94f, y = 27.94f)
                // c -0.586 0.586 -0.586 1.535 0 2.121
                curveToRelative(
                    dx1 = -0.586f,
                    dy1 = 0.586f,
                    dx2 = -0.586f,
                    dy2 = 1.535f,
                    dx3 = 0.0f,
                    dy3 = 2.121f,
                )
                // c 0.292 0.293 0.676 0.439 1.06 0.439
                curveToRelative(
                    dx1 = 0.292f,
                    dy1 = 0.293f,
                    dx2 = 0.676f,
                    dy2 = 0.439f,
                    dx3 = 1.06f,
                    dy3 = 0.439f,
                )
                // s 0.768 -0.146 1.061 -0.44
                reflectiveCurveToRelative(
                    dx1 = 0.768f,
                    dy1 = -0.146f,
                    dx2 = 1.061f,
                    dy2 = -0.44f,
                )
                // L 13 25.121
                lineTo(x = 13.0f, y = 25.121f)
                // l 3.94 3.939
                lineToRelative(dx = 3.94f, dy = 3.939f)
                // c 0.293 0.293 0.677 0.44 1.06 0.44
                curveToRelative(
                    dx1 = 0.293f,
                    dy1 = 0.293f,
                    dx2 = 0.677f,
                    dy2 = 0.44f,
                    dx3 = 1.06f,
                    dy3 = 0.44f,
                )
                // s 0.768 -0.146 1.06 -0.44
                reflectiveCurveToRelative(
                    dx1 = 0.768f,
                    dy1 = -0.146f,
                    dx2 = 1.06f,
                    dy2 = -0.44f,
                )
                // c 0.586 -0.586 0.586 -1.535 0 -2.121
                curveToRelative(
                    dx1 = 0.586f,
                    dy1 = -0.586f,
                    dx2 = 0.586f,
                    dy2 = -1.535f,
                    dx3 = 0.0f,
                    dy3 = -2.121f,
                )
                // L 15.121 23
                lineTo(x = 15.121f, y = 23.0f)
                // L 27 11.121
                lineTo(x = 27.0f, y = 11.121f)
                // V 19
                verticalLineTo(y = 19.0f)
                // c 0 0.828 0.672 1.5 1.5 1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.828f,
                    dx2 = 0.672f,
                    dy2 = 1.5f,
                    dx3 = 1.5f,
                    dy3 = 1.5f,
                )
                // S 30 19.828 30 19
                reflectiveCurveTo(
                    x1 = 30.0f,
                    y1 = 19.828f,
                    x2 = 30.0f,
                    y2 = 19.0f,
                )
                // V 7.5
                verticalLineTo(y = 7.5f)
                // c 0 -0.829 -0.672 -1.5 -1.5 -1.5z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.829f,
                    dx2 = -0.672f,
                    dy2 = -1.5f,
                    dx3 = -1.5f,
                    dy3 = -1.5f,
                )
                close()
            }
        }.build().also { _emoji2650 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji2650: ImageVector? = null
