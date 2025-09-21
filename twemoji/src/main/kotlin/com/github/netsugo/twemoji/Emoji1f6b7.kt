package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f6b7: ImageVector
    get() {
        val current = _emoji1f6b7
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f6b7",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M34.999 17.999 c0 9.389 -7.611 17 -17 17 S1 27.388 1 17.999 8.611 1 17.999 1 c9.388 -0.001 17 7.61 17 16.999z
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
                // S 8.611 1 17.999 1
                reflectiveCurveTo(
                    x1 = 8.611f,
                    y1 = 1.0f,
                    x2 = 17.999f,
                    y2 = 1.0f,
                )
                // c 9.388 -0.001 17 7.61 17 16.999z
                curveToRelative(
                    dx1 = 9.388f,
                    dy1 = -0.001f,
                    dx2 = 17.0f,
                    dy2 = 7.61f,
                    dx3 = 17.0f,
                    dy3 = 16.999f,
                )
                close()
            }
            // M20 8.5 c0 1.38 -0.896 2.5 -2 2.5 -1.105 0 -2 -1.12 -2 -2.5 S16.895 6 18 6 c1.104 0 2 1.119 2 2.5z M25.918 28.24 L21 19.869 v-5.371 c0.371 0.326 0.755 0.678 1.127 1.043 l0.925 2.774 c0.139 0.42 0.529 0.685 0.948 0.685 0.104 0 0.211 -0.017 0.316 -0.052 0.523 -0.175 0.807 -0.741 0.632 -1.265 l-1 -3 c-0.049 -0.147 -0.132 -0.281 -0.241 -0.39 C22.205 12.79 20.169 11 19 11 h-2 c-1.21 0 -2.643 1.702 -3.682 3.223 l-3.765 1.882 c-0.494 0.247 -0.694 0.848 -0.447 1.342 0.247 0.494 0.846 0.695 1.342 0.447 l4 -2 c0.155 -0.078 0.288 -0.195 0.385 -0.339 0.202 -0.303 0.421 -0.605 0.643 -0.893 l1.101 3.853 -3.819 2.183 c-0.469 0.267 -0.758 0.764 -0.758 1.302 v7 c0 0.828 0.671 1.5 1.5 1.5 S15 29.828 15 29 v-6.13 l3.207 -1.833 5.125 8.723 c0.279 0.476 0.78 0.74 1.294 0.74 0.259 0 0.521 -0.066 0.759 -0.207 0.714 -0.419 0.953 -1.339 0.533 -2.053z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 20 8.5
                moveTo(x = 20.0f, y = 8.5f)
                // c 0 1.38 -0.896 2.5 -2 2.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.38f,
                    dx2 = -0.896f,
                    dy2 = 2.5f,
                    dx3 = -2.0f,
                    dy3 = 2.5f,
                )
                // c -1.105 0 -2 -1.12 -2 -2.5
                curveToRelative(
                    dx1 = -1.105f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -1.12f,
                    dx3 = -2.0f,
                    dy3 = -2.5f,
                )
                // S 16.895 6 18 6
                reflectiveCurveTo(
                    x1 = 16.895f,
                    y1 = 6.0f,
                    x2 = 18.0f,
                    y2 = 6.0f,
                )
                // c 1.104 0 2 1.119 2 2.5z
                curveToRelative(
                    dx1 = 1.104f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 1.119f,
                    dx3 = 2.0f,
                    dy3 = 2.5f,
                )
                close()
                // M 25.918 28.24
                moveTo(x = 25.918f, y = 28.24f)
                // L 21 19.869
                lineTo(x = 21.0f, y = 19.869f)
                // v -5.371
                verticalLineToRelative(dy = -5.371f)
                // c 0.371 0.326 0.755 0.678 1.127 1.043
                curveToRelative(
                    dx1 = 0.371f,
                    dy1 = 0.326f,
                    dx2 = 0.755f,
                    dy2 = 0.678f,
                    dx3 = 1.127f,
                    dy3 = 1.043f,
                )
                // l 0.925 2.774
                lineToRelative(dx = 0.925f, dy = 2.774f)
                // c 0.139 0.42 0.529 0.685 0.948 0.685
                curveToRelative(
                    dx1 = 0.139f,
                    dy1 = 0.42f,
                    dx2 = 0.529f,
                    dy2 = 0.685f,
                    dx3 = 0.948f,
                    dy3 = 0.685f,
                )
                // c 0.104 0 0.211 -0.017 0.316 -0.052
                curveToRelative(
                    dx1 = 0.104f,
                    dy1 = 0.0f,
                    dx2 = 0.211f,
                    dy2 = -0.017f,
                    dx3 = 0.316f,
                    dy3 = -0.052f,
                )
                // c 0.523 -0.175 0.807 -0.741 0.632 -1.265
                curveToRelative(
                    dx1 = 0.523f,
                    dy1 = -0.175f,
                    dx2 = 0.807f,
                    dy2 = -0.741f,
                    dx3 = 0.632f,
                    dy3 = -1.265f,
                )
                // l -1 -3
                lineToRelative(dx = -1.0f, dy = -3.0f)
                // c -0.049 -0.147 -0.132 -0.281 -0.241 -0.39
                curveToRelative(
                    dx1 = -0.049f,
                    dy1 = -0.147f,
                    dx2 = -0.132f,
                    dy2 = -0.281f,
                    dx3 = -0.241f,
                    dy3 = -0.39f,
                )
                // C 22.205 12.79 20.169 11 19 11
                curveTo(
                    x1 = 22.205f,
                    y1 = 12.79f,
                    x2 = 20.169f,
                    y2 = 11.0f,
                    x3 = 19.0f,
                    y3 = 11.0f,
                )
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // c -1.21 0 -2.643 1.702 -3.682 3.223
                curveToRelative(
                    dx1 = -1.21f,
                    dy1 = 0.0f,
                    dx2 = -2.643f,
                    dy2 = 1.702f,
                    dx3 = -3.682f,
                    dy3 = 3.223f,
                )
                // l -3.765 1.882
                lineToRelative(dx = -3.765f, dy = 1.882f)
                // c -0.494 0.247 -0.694 0.848 -0.447 1.342
                curveToRelative(
                    dx1 = -0.494f,
                    dy1 = 0.247f,
                    dx2 = -0.694f,
                    dy2 = 0.848f,
                    dx3 = -0.447f,
                    dy3 = 1.342f,
                )
                // c 0.247 0.494 0.846 0.695 1.342 0.447
                curveToRelative(
                    dx1 = 0.247f,
                    dy1 = 0.494f,
                    dx2 = 0.846f,
                    dy2 = 0.695f,
                    dx3 = 1.342f,
                    dy3 = 0.447f,
                )
                // l 4 -2
                lineToRelative(dx = 4.0f, dy = -2.0f)
                // c 0.155 -0.078 0.288 -0.195 0.385 -0.339
                curveToRelative(
                    dx1 = 0.155f,
                    dy1 = -0.078f,
                    dx2 = 0.288f,
                    dy2 = -0.195f,
                    dx3 = 0.385f,
                    dy3 = -0.339f,
                )
                // c 0.202 -0.303 0.421 -0.605 0.643 -0.893
                curveToRelative(
                    dx1 = 0.202f,
                    dy1 = -0.303f,
                    dx2 = 0.421f,
                    dy2 = -0.605f,
                    dx3 = 0.643f,
                    dy3 = -0.893f,
                )
                // l 1.101 3.853
                lineToRelative(dx = 1.101f, dy = 3.853f)
                // l -3.819 2.183
                lineToRelative(dx = -3.819f, dy = 2.183f)
                // c -0.469 0.267 -0.758 0.764 -0.758 1.302
                curveToRelative(
                    dx1 = -0.469f,
                    dy1 = 0.267f,
                    dx2 = -0.758f,
                    dy2 = 0.764f,
                    dx3 = -0.758f,
                    dy3 = 1.302f,
                )
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // c 0 0.828 0.671 1.5 1.5 1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.828f,
                    dx2 = 0.671f,
                    dy2 = 1.5f,
                    dx3 = 1.5f,
                    dy3 = 1.5f,
                )
                // S 15 29.828 15 29
                reflectiveCurveTo(
                    x1 = 15.0f,
                    y1 = 29.828f,
                    x2 = 15.0f,
                    y2 = 29.0f,
                )
                // v -6.13
                verticalLineToRelative(dy = -6.13f)
                // l 3.207 -1.833
                lineToRelative(dx = 3.207f, dy = -1.833f)
                // l 5.125 8.723
                lineToRelative(dx = 5.125f, dy = 8.723f)
                // c 0.279 0.476 0.78 0.74 1.294 0.74
                curveToRelative(
                    dx1 = 0.279f,
                    dy1 = 0.476f,
                    dx2 = 0.78f,
                    dy2 = 0.74f,
                    dx3 = 1.294f,
                    dy3 = 0.74f,
                )
                // c 0.259 0 0.521 -0.066 0.759 -0.207
                curveToRelative(
                    dx1 = 0.259f,
                    dy1 = 0.0f,
                    dx2 = 0.521f,
                    dy2 = -0.066f,
                    dx3 = 0.759f,
                    dy3 = -0.207f,
                )
                // c 0.714 -0.419 0.953 -1.339 0.533 -2.053z
                curveToRelative(
                    dx1 = 0.714f,
                    dy1 = -0.419f,
                    dx2 = 0.953f,
                    dy2 = -1.339f,
                    dx3 = 0.533f,
                    dy3 = -2.053f,
                )
                close()
            }
            // M18 0 C8.059 0 0 8.059 0 18 s8.059 18 18 18 18 -8.059 18 -18 S27.941 0 18 0z M34 18 c0 3.968 -1.453 7.591 -3.845 10.388 L7.612 5.845 C10.409 3.453 14.032 2 18 2 c8.837 0 16 7.164 16 16z M2 18 c0 -3.968 1.453 -7.592 3.845 -10.388 l22.543 22.544 C25.592 32.548 21.968 34 18 34 9.164 34 2 26.837 2 18z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 18 0
                moveTo(x = 18.0f, y = 0.0f)
                // C 8.059 0 0 8.059 0 18
                curveTo(
                    x1 = 8.059f,
                    y1 = 0.0f,
                    x2 = 0.0f,
                    y2 = 8.059f,
                    x3 = 0.0f,
                    y3 = 18.0f,
                )
                // s 8.059 18 18 18
                reflectiveCurveToRelative(
                    dx1 = 8.059f,
                    dy1 = 18.0f,
                    dx2 = 18.0f,
                    dy2 = 18.0f,
                )
                // s 18 -8.059 18 -18
                reflectiveCurveToRelative(
                    dx1 = 18.0f,
                    dy1 = -8.059f,
                    dx2 = 18.0f,
                    dy2 = -18.0f,
                )
                // S 27.941 0 18 0z
                reflectiveCurveTo(
                    x1 = 27.941f,
                    y1 = 0.0f,
                    x2 = 18.0f,
                    y2 = 0.0f,
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
        }.build().also { _emoji1f6b7 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f6b7: ImageVector? = null
