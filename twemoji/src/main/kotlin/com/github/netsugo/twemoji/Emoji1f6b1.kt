package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f6b1: ImageVector
    get() {
        val current = _emoji1f6b1
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f6b1",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M34.999 17.999 c0 9.389 -7.611 17 -17 17 S1 27.388 1 17.999 8.61 1 17.999 1 s17 7.61 17 16.999z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 34.999 17.999
                moveTo(x = 34.999f, y = 17.999f)
                // c 0 9.389 -7.611 17 -17 17
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 9.389f,
                    dx2 = -7.611f,
                    dy2 = 17.0f,
                    dx3 = -17.0f,
                    dy3 = 17.0f,
                )
                // S 1 27.388 1 17.999
                reflectiveCurveTo(
                    x1 = 1.0f,
                    y1 = 27.388f,
                    x2 = 1.0f,
                    y2 = 17.999f,
                )
                // S 8.61 1 17.999 1
                reflectiveCurveTo(
                    x1 = 8.61f,
                    y1 = 1.0f,
                    x2 = 17.999f,
                    y2 = 1.0f,
                )
                // s 17 7.61 17 16.999z
                reflectiveCurveToRelative(
                    dx1 = 17.0f,
                    dy1 = 7.61f,
                    dx2 = 17.0f,
                    dy2 = 16.999f,
                )
                close()
            }
            // M17 19 c-1 0 -1 1 -1 1 v4 h-6 v-4 s-0.021 -1 -1.021 -1 S8 20 8 20 v8 s0 2 2 2 h6 c2 0 2 -2 2 -2 v-8 s0 -1 -1 -1z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 17 19
                moveTo(x = 17.0f, y = 19.0f)
                // c -1 0 -1 1 -1 1
                curveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // s -0.021 -1 -1.021 -1
                reflectiveCurveToRelative(
                    dx1 = -0.021f,
                    dy1 = -1.0f,
                    dx2 = -1.021f,
                    dy2 = -1.0f,
                )
                // S 8 20 8 20
                reflectiveCurveTo(
                    x1 = 8.0f,
                    y1 = 20.0f,
                    x2 = 8.0f,
                    y2 = 20.0f,
                )
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // s 0 2 2 2
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                )
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // c 2 0 2 -2 2 -2
                curveToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // s 0 -1 -1 -1z
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.0f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                )
                close()
            }
            // M28 10 h-9 V5 s0 -1 -1 -1 -1 1 -1 1 v5 c-6 0 -6 6 -6 6 v1 c0 1 1 1 1 1 h2 s1 0 1 -1 v-1 c0 -2 2 -2 2 -2 h11 c1 0 1 -1 1 -1 v-2 s0 -1 -1 -1z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 28 10
                moveTo(x = 28.0f, y = 10.0f)
                // h -9
                horizontalLineToRelative(dx = -9.0f)
                // V 5
                verticalLineTo(y = 5.0f)
                // s 0 -1 -1 -1
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.0f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                )
                // s -1 1 -1 1
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // c -6 0 -6 6 -6 6
                curveToRelative(
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                    dx2 = -6.0f,
                    dy2 = 6.0f,
                    dx3 = -6.0f,
                    dy3 = 6.0f,
                )
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // c 0 1 1 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.0f,
                    dx2 = 1.0f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // s 1 0 1 -1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // c 0 -2 2 -2 2 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // h 11
                horizontalLineToRelative(dx = 11.0f)
                // c 1 0 1 -1 1 -1
                curveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // s 0 -1 -1 -1z
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.0f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                )
                close()
            }
            // M16 5 h-2 c-0.552 0 -1 0.448 -1 1 s0.448 1 1 1 h2 c0.552 0 1 -0.448 1 -1 s-0.448 -1 -1 -1z M20 7 h2 c0.553 0 1 -0.448 1 -1 s-0.447 -1 -1 -1 h-2 c-0.553 0 -1 0.448 -1 1 s0.447 1 1 1z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 16 5
                moveTo(x = 16.0f, y = 5.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // c -0.552 0 -1 0.448 -1 1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = 0.448f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // s 0.448 1 1 1
                reflectiveCurveToRelative(
                    dx1 = 0.448f,
                    dy1 = 1.0f,
                    dx2 = 1.0f,
                    dy2 = 1.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // c 0.552 0 1 -0.448 1 -1
                curveToRelative(
                    dx1 = 0.552f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -0.448f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // s -0.448 -1 -1 -1z
                reflectiveCurveToRelative(
                    dx1 = -0.448f,
                    dy1 = -1.0f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                )
                close()
                // M 20 7
                moveTo(x = 20.0f, y = 7.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // c 0.553 0 1 -0.448 1 -1
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -0.448f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // s -0.447 -1 -1 -1
                reflectiveCurveToRelative(
                    dx1 = -0.447f,
                    dy1 = -1.0f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                )
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // c -0.553 0 -1 0.448 -1 1
                curveToRelative(
                    dx1 = -0.553f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = 0.448f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // s 0.447 1 1 1z
                reflectiveCurveToRelative(
                    dx1 = 0.447f,
                    dy1 = 1.0f,
                    dx2 = 1.0f,
                    dy2 = 1.0f,
                )
                close()
            }
            // M18 0 C8.059 0 0 8.06 0 18 c0 9.941 8.059 18 18 18 s18 -8.059 18 -18 c0 -9.94 -8.059 -18 -18 -18z M34 18 c0 3.968 -1.453 7.591 -3.845 10.388 L7.612 5.845 C10.409 3.453 14.032 2 18 2 c8.837 0 16 7.164 16 16z M2 18 c0 -3.968 1.453 -7.592 3.845 -10.388 l22.543 22.544 C25.592 32.548 21.968 34 18 34 9.164 34 2 26.837 2 18z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 18 0
                moveTo(x = 18.0f, y = 0.0f)
                // C 8.059 0 0 8.06 0 18
                curveTo(
                    x1 = 8.059f,
                    y1 = 0.0f,
                    x2 = 0.0f,
                    y2 = 8.06f,
                    x3 = 0.0f,
                    y3 = 18.0f,
                )
                // c 0 9.941 8.059 18 18 18
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 9.941f,
                    dx2 = 8.059f,
                    dy2 = 18.0f,
                    dx3 = 18.0f,
                    dy3 = 18.0f,
                )
                // s 18 -8.059 18 -18
                reflectiveCurveToRelative(
                    dx1 = 18.0f,
                    dy1 = -8.059f,
                    dx2 = 18.0f,
                    dy2 = -18.0f,
                )
                // c 0 -9.94 -8.059 -18 -18 -18z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -9.94f,
                    dx2 = -8.059f,
                    dy2 = -18.0f,
                    dx3 = -18.0f,
                    dy3 = -18.0f,
                )
                close()
                // M 34 18
                moveTo(x = 34.0f, y = 18.0f)
                // c 0 3.968 -1.453 7.591 -3.845 10.388
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.968f,
                    dx2 = -1.453f,
                    dy2 = 7.591f,
                    dx3 = -3.845f,
                    dy3 = 10.388f,
                )
                // L 7.612 5.845
                lineTo(x = 7.612f, y = 5.845f)
                // C 10.409 3.453 14.032 2 18 2
                curveTo(
                    x1 = 10.409f,
                    y1 = 3.453f,
                    x2 = 14.032f,
                    y2 = 2.0f,
                    x3 = 18.0f,
                    y3 = 2.0f,
                )
                // c 8.837 0 16 7.164 16 16z
                curveToRelative(
                    dx1 = 8.837f,
                    dy1 = 0.0f,
                    dx2 = 16.0f,
                    dy2 = 7.164f,
                    dx3 = 16.0f,
                    dy3 = 16.0f,
                )
                close()
                // M 2 18
                moveTo(x = 2.0f, y = 18.0f)
                // c 0 -3.968 1.453 -7.592 3.845 -10.388
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.968f,
                    dx2 = 1.453f,
                    dy2 = -7.592f,
                    dx3 = 3.845f,
                    dy3 = -10.388f,
                )
                // l 22.543 22.544
                lineToRelative(dx = 22.543f, dy = 22.544f)
                // C 25.592 32.548 21.968 34 18 34
                curveTo(
                    x1 = 25.592f,
                    y1 = 32.548f,
                    x2 = 21.968f,
                    y2 = 34.0f,
                    x3 = 18.0f,
                    y3 = 34.0f,
                )
                // C 9.164 34 2 26.837 2 18z
                curveTo(
                    x1 = 9.164f,
                    y1 = 34.0f,
                    x2 = 2.0f,
                    y2 = 26.837f,
                    x3 = 2.0f,
                    y3 = 18.0f,
                )
                close()
            }
        }.build().also { _emoji1f6b1 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f6b1: ImageVector? = null
