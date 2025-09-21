package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji2614: ImageVector
    get() {
        val current = _emoji2614
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji2614",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M9 28.5 c0 -0.828 0.672 -1.5 1.5 -1.5 s1.5 0.672 1.5 1.5 v0.5 s0 3 3 3 3 -3 3 -3 V3.5 c0 -0.829 0.671 -1.5 1.5 -1.5 s1.5 0.671 1.5 1.5 V29 s0 6 -6 6 -6 -6 -6 -6 v-0.5z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 9 28.5
                moveTo(x = 9.0f, y = 28.5f)
                // c 0 -0.828 0.672 -1.5 1.5 -1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.828f,
                    dx2 = 0.672f,
                    dy2 = -1.5f,
                    dx3 = 1.5f,
                    dy3 = -1.5f,
                )
                // s 1.5 0.672 1.5 1.5
                reflectiveCurveToRelative(
                    dx1 = 1.5f,
                    dy1 = 0.672f,
                    dx2 = 1.5f,
                    dy2 = 1.5f,
                )
                // v 0.5
                verticalLineToRelative(dy = 0.5f)
                // s 0 3 3 3
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.0f,
                    dx2 = 3.0f,
                    dy2 = 3.0f,
                )
                // s 3 -3 3 -3
                reflectiveCurveToRelative(
                    dx1 = 3.0f,
                    dy1 = -3.0f,
                    dx2 = 3.0f,
                    dy2 = -3.0f,
                )
                // V 3.5
                verticalLineTo(y = 3.5f)
                // c 0 -0.829 0.671 -1.5 1.5 -1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.829f,
                    dx2 = 0.671f,
                    dy2 = -1.5f,
                    dx3 = 1.5f,
                    dy3 = -1.5f,
                )
                // s 1.5 0.671 1.5 1.5
                reflectiveCurveToRelative(
                    dx1 = 1.5f,
                    dy1 = 0.671f,
                    dx2 = 1.5f,
                    dy2 = 1.5f,
                )
                // V 29
                verticalLineTo(y = 29.0f)
                // s 0 6 -6 6
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 6.0f,
                    dx2 = -6.0f,
                    dy2 = 6.0f,
                )
                // s -6 -6 -6 -6
                reflectiveCurveToRelative(
                    dx1 = -6.0f,
                    dy1 = -6.0f,
                    dx2 = -6.0f,
                    dy2 = -6.0f,
                )
                // v -0.5z
                verticalLineToRelative(dy = -0.5f)
                close()
            }
            // M19.5 4 C28.612 4 36 9.82 36 17 c0 0 0 2 -1 2 s-3 -2 -3 -2 H7 s-2 2 -3 2 -1 -2 -1 -2 C3 9.82 10.387 4 19.5 4z
            path(
                fill = SolidColor(Color(0xFF744EAA)),
            ) {
                // M 19.5 4
                moveTo(x = 19.5f, y = 4.0f)
                // C 28.612 4 36 9.82 36 17
                curveTo(
                    x1 = 28.612f,
                    y1 = 4.0f,
                    x2 = 36.0f,
                    y2 = 9.82f,
                    x3 = 36.0f,
                    y3 = 17.0f,
                )
                // c 0 0 0 2 -1 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 0.0f,
                    dy2 = 2.0f,
                    dx3 = -1.0f,
                    dy3 = 2.0f,
                )
                // s -3 -2 -3 -2
                reflectiveCurveToRelative(
                    dx1 = -3.0f,
                    dy1 = -2.0f,
                    dx2 = -3.0f,
                    dy2 = -2.0f,
                )
                // H 7
                horizontalLineTo(x = 7.0f)
                // s -2 2 -3 2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                    dx2 = -3.0f,
                    dy2 = 2.0f,
                )
                // s -1 -2 -1 -2
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = -2.0f,
                    dx2 = -1.0f,
                    dy2 = -2.0f,
                )
                // C 3 9.82 10.387 4 19.5 4z
                curveTo(
                    x1 = 3.0f,
                    y1 = 9.82f,
                    x2 = 10.387f,
                    y2 = 4.0f,
                    x3 = 19.5f,
                    y3 = 4.0f,
                )
                close()
            }
            // M19.5 4 C26.403 4 32 9.82 32 17 c0 0 0 2 -2 2 s-5 -2 -5 -2 H14 s-3 2 -5 2 -2 -2 -2 -2 C7 9.82 12.596 4 19.5 4z
            path(
                fill = SolidColor(Color(0xFF9266CC)),
            ) {
                // M 19.5 4
                moveTo(x = 19.5f, y = 4.0f)
                // C 26.403 4 32 9.82 32 17
                curveTo(
                    x1 = 26.403f,
                    y1 = 4.0f,
                    x2 = 32.0f,
                    y2 = 9.82f,
                    x3 = 32.0f,
                    y3 = 17.0f,
                )
                // c 0 0 0 2 -2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 0.0f,
                    dy2 = 2.0f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // s -5 -2 -5 -2
                reflectiveCurveToRelative(
                    dx1 = -5.0f,
                    dy1 = -2.0f,
                    dx2 = -5.0f,
                    dy2 = -2.0f,
                )
                // H 14
                horizontalLineTo(x = 14.0f)
                // s -3 2 -5 2
                reflectiveCurveToRelative(
                    dx1 = -3.0f,
                    dy1 = 2.0f,
                    dx2 = -5.0f,
                    dy2 = 2.0f,
                )
                // s -2 -2 -2 -2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                    dx2 = -2.0f,
                    dy2 = -2.0f,
                )
                // C 7 9.82 12.596 4 19.5 4z
                curveTo(
                    x1 = 7.0f,
                    y1 = 9.82f,
                    x2 = 12.596f,
                    y2 = 4.0f,
                    x3 = 19.5f,
                    y3 = 4.0f,
                )
                close()
            }
            // M19.5 4 C23.09 4 25 9.82 25 17 c0 0 -3 2 -5 2 h-1 c-2 0 -5 -2 -5 -2 0 -7.18 1.91 -13 5.5 -13z
            path(
                fill = SolidColor(Color(0xFF744EAA)),
            ) {
                // M 19.5 4
                moveTo(x = 19.5f, y = 4.0f)
                // C 23.09 4 25 9.82 25 17
                curveTo(
                    x1 = 23.09f,
                    y1 = 4.0f,
                    x2 = 25.0f,
                    y2 = 9.82f,
                    x3 = 25.0f,
                    y3 = 17.0f,
                )
                // c 0 0 -3 2 -5 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -3.0f,
                    dy2 = 2.0f,
                    dx3 = -5.0f,
                    dy3 = 2.0f,
                )
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // c -2 0 -5 -2 -5 -2
                curveToRelative(
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                    dx2 = -5.0f,
                    dy2 = -2.0f,
                    dx3 = -5.0f,
                    dy3 = -2.0f,
                )
                // c 0 -7.18 1.91 -13 5.5 -13z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -7.18f,
                    dx2 = 1.91f,
                    dy2 = -13.0f,
                    dx3 = 5.5f,
                    dy3 = -13.0f,
                )
                close()
            }
            // M30.383 4.472 c-0.863 1.413 -0.403 3.247 1.028 4.099 1.431 0.852 3.291 0.398 4.154 -1.014 0.607 -0.992 0.557 -2.192 -0.021 -3.114 L33.061 0.09 l-2.678 4.382z M22.382 7.472 c-0.863 1.413 -0.403 3.247 1.028 4.099 1.431 0.852 3.291 0.398 4.154 -1.014 0.607 -0.992 0.557 -2.192 -0.021 -3.114 L25.061 3.09 l-2.679 4.382z M10.435 4.472 c-0.863 1.413 -0.402 3.247 1.028 4.099 1.431 0.852 3.291 0.398 4.154 -1.014 0.607 -0.992 0.558 -2.192 -0.022 -3.114 L13.114 0.09 l-2.679 4.382z M0.435 10.382 c-0.863 1.413 -0.402 3.247 1.028 4.099 1.431 0.851 3.291 0.398 4.154 -1.014 0.607 -0.992 0.558 -2.192 -0.022 -3.114 L3.114 6 0.435 10.382z
            path(
                fill = SolidColor(Color(0xFF5DADEC)),
            ) {
                // M 30.383 4.472
                moveTo(x = 30.383f, y = 4.472f)
                // c -0.863 1.413 -0.403 3.247 1.028 4.099
                curveToRelative(
                    dx1 = -0.863f,
                    dy1 = 1.413f,
                    dx2 = -0.403f,
                    dy2 = 3.247f,
                    dx3 = 1.028f,
                    dy3 = 4.099f,
                )
                // c 1.431 0.852 3.291 0.398 4.154 -1.014
                curveToRelative(
                    dx1 = 1.431f,
                    dy1 = 0.852f,
                    dx2 = 3.291f,
                    dy2 = 0.398f,
                    dx3 = 4.154f,
                    dy3 = -1.014f,
                )
                // c 0.607 -0.992 0.557 -2.192 -0.021 -3.114
                curveToRelative(
                    dx1 = 0.607f,
                    dy1 = -0.992f,
                    dx2 = 0.557f,
                    dy2 = -2.192f,
                    dx3 = -0.021f,
                    dy3 = -3.114f,
                )
                // L 33.061 0.09
                lineTo(x = 33.061f, y = 0.09f)
                // l -2.678 4.382z
                lineToRelative(dx = -2.678f, dy = 4.382f)
                close()
                // M 22.382 7.472
                moveTo(x = 22.382f, y = 7.472f)
                // c -0.863 1.413 -0.403 3.247 1.028 4.099
                curveToRelative(
                    dx1 = -0.863f,
                    dy1 = 1.413f,
                    dx2 = -0.403f,
                    dy2 = 3.247f,
                    dx3 = 1.028f,
                    dy3 = 4.099f,
                )
                // c 1.431 0.852 3.291 0.398 4.154 -1.014
                curveToRelative(
                    dx1 = 1.431f,
                    dy1 = 0.852f,
                    dx2 = 3.291f,
                    dy2 = 0.398f,
                    dx3 = 4.154f,
                    dy3 = -1.014f,
                )
                // c 0.607 -0.992 0.557 -2.192 -0.021 -3.114
                curveToRelative(
                    dx1 = 0.607f,
                    dy1 = -0.992f,
                    dx2 = 0.557f,
                    dy2 = -2.192f,
                    dx3 = -0.021f,
                    dy3 = -3.114f,
                )
                // L 25.061 3.09
                lineTo(x = 25.061f, y = 3.09f)
                // l -2.679 4.382z
                lineToRelative(dx = -2.679f, dy = 4.382f)
                close()
                // M 10.435 4.472
                moveTo(x = 10.435f, y = 4.472f)
                // c -0.863 1.413 -0.402 3.247 1.028 4.099
                curveToRelative(
                    dx1 = -0.863f,
                    dy1 = 1.413f,
                    dx2 = -0.402f,
                    dy2 = 3.247f,
                    dx3 = 1.028f,
                    dy3 = 4.099f,
                )
                // c 1.431 0.852 3.291 0.398 4.154 -1.014
                curveToRelative(
                    dx1 = 1.431f,
                    dy1 = 0.852f,
                    dx2 = 3.291f,
                    dy2 = 0.398f,
                    dx3 = 4.154f,
                    dy3 = -1.014f,
                )
                // c 0.607 -0.992 0.558 -2.192 -0.022 -3.114
                curveToRelative(
                    dx1 = 0.607f,
                    dy1 = -0.992f,
                    dx2 = 0.558f,
                    dy2 = -2.192f,
                    dx3 = -0.022f,
                    dy3 = -3.114f,
                )
                // L 13.114 0.09
                lineTo(x = 13.114f, y = 0.09f)
                // l -2.679 4.382z
                lineToRelative(dx = -2.679f, dy = 4.382f)
                close()
                // M 0.435 10.382
                moveTo(x = 0.435f, y = 10.382f)
                // c -0.863 1.413 -0.402 3.247 1.028 4.099
                curveToRelative(
                    dx1 = -0.863f,
                    dy1 = 1.413f,
                    dx2 = -0.402f,
                    dy2 = 3.247f,
                    dx3 = 1.028f,
                    dy3 = 4.099f,
                )
                // c 1.431 0.851 3.291 0.398 4.154 -1.014
                curveToRelative(
                    dx1 = 1.431f,
                    dy1 = 0.851f,
                    dx2 = 3.291f,
                    dy2 = 0.398f,
                    dx3 = 4.154f,
                    dy3 = -1.014f,
                )
                // c 0.607 -0.992 0.558 -2.192 -0.022 -3.114
                curveToRelative(
                    dx1 = 0.607f,
                    dy1 = -0.992f,
                    dx2 = 0.558f,
                    dy2 = -2.192f,
                    dx3 = -0.022f,
                    dy3 = -3.114f,
                )
                // L 3.114 6
                lineTo(x = 3.114f, y = 6.0f)
                // L 0.435 10.382z
                lineTo(x = 0.435f, y = 10.382f)
                close()
            }
        }.build().also { _emoji2614 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji2614: ImageVector? = null
