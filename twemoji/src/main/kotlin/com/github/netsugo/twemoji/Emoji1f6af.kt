package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f6af: ImageVector
    get() {
        val current = _emoji1f6af
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f6af",
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
            // M17 7.5 a3 3.5 0 1 0 6 0 a3 3.5 0 1 0 -6 0z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 17 7.5
                moveTo(x = 17.0f, y = 7.5f)
                // a 3 3.5 0 1 0 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // a 3 3.5 0 1 0 -6 0z
                arcToRelative(
                    a = 3.0f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M26 13 s0 -2 -2 -2 h-7 c-1 0 -2 1 -2 1 l-2 2 H9 s-1 0 -1 1 1 1 1 1 h5 l2 -1.171 V31 s0 1 1 1 h1 s1 0 1 -1 v-8 s0 -1 1 -1 1 1 1 1 v8 s0 1 1 1 h1 s1 0 1 -1 v-9 s2 0 2 -2 v-7z M9.242 19.467 c0 0.846 -0.726 1.533 -1.621 1.533 S6 20.313 6 19.467 c0 -0.847 0.726 -1.533 1.621 -1.533 s1.621 0.686 1.621 1.533z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 26 13
                moveTo(x = 26.0f, y = 13.0f)
                // s 0 -2 -2 -2
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                    dx2 = -2.0f,
                    dy2 = -2.0f,
                )
                // h -7
                horizontalLineToRelative(dx = -7.0f)
                // c -1 0 -2 1 -2 1
                curveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = 1.0f,
                    dx3 = -2.0f,
                    dy3 = 1.0f,
                )
                // l -2 2
                lineToRelative(dx = -2.0f, dy = 2.0f)
                // H 9
                horizontalLineTo(x = 9.0f)
                // s -1 0 -1 1
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                // s 1 1 1 1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                    dx2 = 1.0f,
                    dy2 = 1.0f,
                )
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // l 2 -1.171
                lineToRelative(dx = 2.0f, dy = -1.171f)
                // V 31
                verticalLineTo(y = 31.0f)
                // s 0 1 1 1
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.0f,
                    dx2 = 1.0f,
                    dy2 = 1.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // s 1 0 1 -1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // s 0 -1 1 -1
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // s 1 1 1 1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                    dx2 = 1.0f,
                    dy2 = 1.0f,
                )
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // s 0 1 1 1
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.0f,
                    dx2 = 1.0f,
                    dy2 = 1.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // s 1 0 1 -1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // v -9
                verticalLineToRelative(dy = -9.0f)
                // s 2 0 2 -2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // v -7z
                verticalLineToRelative(dy = -7.0f)
                close()
                // M 9.242 19.467
                moveTo(x = 9.242f, y = 19.467f)
                // c 0 0.846 -0.726 1.533 -1.621 1.533
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.846f,
                    dx2 = -0.726f,
                    dy2 = 1.533f,
                    dx3 = -1.621f,
                    dy3 = 1.533f,
                )
                // S 6 20.313 6 19.467
                reflectiveCurveTo(
                    x1 = 6.0f,
                    y1 = 20.313f,
                    x2 = 6.0f,
                    y2 = 19.467f,
                )
                // c 0 -0.847 0.726 -1.533 1.621 -1.533
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.847f,
                    dx2 = 0.726f,
                    dy2 = -1.533f,
                    dx3 = 1.621f,
                    dy3 = -1.533f,
                )
                // s 1.621 0.686 1.621 1.533z
                reflectiveCurveToRelative(
                    dx1 = 1.621f,
                    dy1 = 0.686f,
                    dx2 = 1.621f,
                    dy2 = 1.533f,
                )
                close()
            }
            // M13.242 22.467 c0 0.847 -0.726 1.533 -1.621 1.533 S10 23.313 10 22.467 c0 -0.847 0.726 -1.533 1.621 -1.533 s1.621 0.686 1.621 1.533z M11.242 26.467 c0 0.847 -0.726 1.533 -1.621 1.533 S8 27.313 8 26.467 c0 -0.847 0.726 -1.533 1.621 -1.533 s1.621 0.686 1.621 1.533z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 13.242 22.467
                moveTo(x = 13.242f, y = 22.467f)
                // c 0 0.847 -0.726 1.533 -1.621 1.533
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.847f,
                    dx2 = -0.726f,
                    dy2 = 1.533f,
                    dx3 = -1.621f,
                    dy3 = 1.533f,
                )
                // S 10 23.313 10 22.467
                reflectiveCurveTo(
                    x1 = 10.0f,
                    y1 = 23.313f,
                    x2 = 10.0f,
                    y2 = 22.467f,
                )
                // c 0 -0.847 0.726 -1.533 1.621 -1.533
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.847f,
                    dx2 = 0.726f,
                    dy2 = -1.533f,
                    dx3 = 1.621f,
                    dy3 = -1.533f,
                )
                // s 1.621 0.686 1.621 1.533z
                reflectiveCurveToRelative(
                    dx1 = 1.621f,
                    dy1 = 0.686f,
                    dx2 = 1.621f,
                    dy2 = 1.533f,
                )
                close()
                // M 11.242 26.467
                moveTo(x = 11.242f, y = 26.467f)
                // c 0 0.847 -0.726 1.533 -1.621 1.533
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.847f,
                    dx2 = -0.726f,
                    dy2 = 1.533f,
                    dx3 = -1.621f,
                    dy3 = 1.533f,
                )
                // S 8 27.313 8 26.467
                reflectiveCurveTo(
                    x1 = 8.0f,
                    y1 = 27.313f,
                    x2 = 8.0f,
                    y2 = 26.467f,
                )
                // c 0 -0.847 0.726 -1.533 1.621 -1.533
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.847f,
                    dx2 = 0.726f,
                    dy2 = -1.533f,
                    dx3 = 1.621f,
                    dy3 = -1.533f,
                )
                // s 1.621 0.686 1.621 1.533z
                reflectiveCurveToRelative(
                    dx1 = 1.621f,
                    dy1 = 0.686f,
                    dx2 = 1.621f,
                    dy2 = 1.533f,
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
        }.build().also { _emoji1f6af = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f6af: ImageVector? = null
