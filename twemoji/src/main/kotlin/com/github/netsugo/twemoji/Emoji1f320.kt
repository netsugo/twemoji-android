package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f320: ImageVector
    get() {
        val current = _emoji1f320
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f320",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 32 c0 2.209 -1.791 4 -4 4 H4 c-2.209 0 -4 -1.791 -4 -4 V4 c0 -2.209 1.791 -4 4 -4 h28 c2.209 0 4 1.791 4 4 v28z
            path(
                fill = SolidColor(Color(0xFF226699)),
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
            // M11 9 s7.29 -4.557 21 -4.969 c0.652 -0.02 2 -0.031 2 0.969 -6 9 -9 23 -9 23 L11 9z
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 11 9
                moveTo(x = 11.0f, y = 9.0f)
                // s 7.29 -4.557 21 -4.969
                reflectiveCurveToRelative(
                    dx1 = 7.29f,
                    dy1 = -4.557f,
                    dx2 = 21.0f,
                    dy2 = -4.969f,
                )
                // c 0.652 -0.02 2 -0.031 2 0.969
                curveToRelative(
                    dx1 = 0.652f,
                    dy1 = -0.02f,
                    dx2 = 2.0f,
                    dy2 = -0.031f,
                    dx3 = 2.0f,
                    dy3 = 0.969f,
                )
                // c -6 9 -9 23 -9 23
                curveToRelative(
                    dx1 = -6.0f,
                    dy1 = 9.0f,
                    dx2 = -9.0f,
                    dy2 = 23.0f,
                    dx3 = -9.0f,
                    dy3 = 23.0f,
                )
                // L 11 9z
                lineTo(x = 11.0f, y = 9.0f)
                close()
            }
            // M12 16 S24 5 32 4.031 C32.647 3.952 34 4 34 5 c-7 4 -12 19 -12 19 l-10 -8z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 12 16
                moveTo(x = 12.0f, y = 16.0f)
                // S 24 5 32 4.031
                reflectiveCurveTo(
                    x1 = 24.0f,
                    y1 = 5.0f,
                    x2 = 32.0f,
                    y2 = 4.031f,
                )
                // C 32.647 3.952 34 4 34 5
                curveTo(
                    x1 = 32.647f,
                    y1 = 3.952f,
                    x2 = 34.0f,
                    y2 = 4.0f,
                    x3 = 34.0f,
                    y3 = 5.0f,
                )
                // c -7 4 -12 19 -12 19
                curveToRelative(
                    dx1 = -7.0f,
                    dy1 = 4.0f,
                    dx2 = -12.0f,
                    dy2 = 19.0f,
                    dx3 = -12.0f,
                    dy3 = 19.0f,
                )
                // l -10 -8z
                lineToRelative(dx = -10.0f, dy = -8.0f)
                close()
            }
            // M15.156 12.438 c0.826 0.727 2.388 1.164 3.471 0.972 l4.892 -0.866 c1.084 -0.192 1.613 0.478 1.178 1.488 l-1.968 4.563 c-0.436 1.01 -0.369 2.63 0.148 3.602 l2.335 4.384 c0.518 0.972 0.044 1.682 -1.051 1.58 l-4.947 -0.463 c-1.095 -0.102 -2.616 0.462 -3.379 1.254 l-3.45 3.577 c-0.763 0.792 -1.585 0.562 -1.827 -0.512 L9.469 27.17 c-0.241 -1.073 -1.248 -2.345 -2.237 -2.827 l-4.467 -2.175 c-0.989 -0.481 -1.024 -1.335 -0.078 -1.896 l4.274 -2.534 c0.946 -0.561 1.845 -1.911 1.997 -3.001 l0.689 -4.92 c0.152 -1.09 0.953 -1.387 1.779 -0.66 l3.73 3.281z
            path(
                fill = SolidColor(Color(0xFFFFD983)),
            ) {
                // M 15.156 12.438
                moveTo(x = 15.156f, y = 12.438f)
                // c 0.826 0.727 2.388 1.164 3.471 0.972
                curveToRelative(
                    dx1 = 0.826f,
                    dy1 = 0.727f,
                    dx2 = 2.388f,
                    dy2 = 1.164f,
                    dx3 = 3.471f,
                    dy3 = 0.972f,
                )
                // l 4.892 -0.866
                lineToRelative(dx = 4.892f, dy = -0.866f)
                // c 1.084 -0.192 1.613 0.478 1.178 1.488
                curveToRelative(
                    dx1 = 1.084f,
                    dy1 = -0.192f,
                    dx2 = 1.613f,
                    dy2 = 0.478f,
                    dx3 = 1.178f,
                    dy3 = 1.488f,
                )
                // l -1.968 4.563
                lineToRelative(dx = -1.968f, dy = 4.563f)
                // c -0.436 1.01 -0.369 2.63 0.148 3.602
                curveToRelative(
                    dx1 = -0.436f,
                    dy1 = 1.01f,
                    dx2 = -0.369f,
                    dy2 = 2.63f,
                    dx3 = 0.148f,
                    dy3 = 3.602f,
                )
                // l 2.335 4.384
                lineToRelative(dx = 2.335f, dy = 4.384f)
                // c 0.518 0.972 0.044 1.682 -1.051 1.58
                curveToRelative(
                    dx1 = 0.518f,
                    dy1 = 0.972f,
                    dx2 = 0.044f,
                    dy2 = 1.682f,
                    dx3 = -1.051f,
                    dy3 = 1.58f,
                )
                // l -4.947 -0.463
                lineToRelative(dx = -4.947f, dy = -0.463f)
                // c -1.095 -0.102 -2.616 0.462 -3.379 1.254
                curveToRelative(
                    dx1 = -1.095f,
                    dy1 = -0.102f,
                    dx2 = -2.616f,
                    dy2 = 0.462f,
                    dx3 = -3.379f,
                    dy3 = 1.254f,
                )
                // l -3.45 3.577
                lineToRelative(dx = -3.45f, dy = 3.577f)
                // c -0.763 0.792 -1.585 0.562 -1.827 -0.512
                curveToRelative(
                    dx1 = -0.763f,
                    dy1 = 0.792f,
                    dx2 = -1.585f,
                    dy2 = 0.562f,
                    dx3 = -1.827f,
                    dy3 = -0.512f,
                )
                // L 9.469 27.17
                lineTo(x = 9.469f, y = 27.17f)
                // c -0.241 -1.073 -1.248 -2.345 -2.237 -2.827
                curveToRelative(
                    dx1 = -0.241f,
                    dy1 = -1.073f,
                    dx2 = -1.248f,
                    dy2 = -2.345f,
                    dx3 = -2.237f,
                    dy3 = -2.827f,
                )
                // l -4.467 -2.175
                lineToRelative(dx = -4.467f, dy = -2.175f)
                // c -0.989 -0.481 -1.024 -1.335 -0.078 -1.896
                curveToRelative(
                    dx1 = -0.989f,
                    dy1 = -0.481f,
                    dx2 = -1.024f,
                    dy2 = -1.335f,
                    dx3 = -0.078f,
                    dy3 = -1.896f,
                )
                // l 4.274 -2.534
                lineToRelative(dx = 4.274f, dy = -2.534f)
                // c 0.946 -0.561 1.845 -1.911 1.997 -3.001
                curveToRelative(
                    dx1 = 0.946f,
                    dy1 = -0.561f,
                    dx2 = 1.845f,
                    dy2 = -1.911f,
                    dx3 = 1.997f,
                    dy3 = -3.001f,
                )
                // l 0.689 -4.92
                lineToRelative(dx = 0.689f, dy = -4.92f)
                // c 0.152 -1.09 0.953 -1.387 1.779 -0.66
                curveToRelative(
                    dx1 = 0.152f,
                    dy1 = -1.09f,
                    dx2 = 0.953f,
                    dy2 = -1.387f,
                    dx3 = 1.779f,
                    dy3 = -0.66f,
                )
                // l 3.73 3.281z
                lineToRelative(dx = 3.73f, dy = 3.281f)
                close()
            }
        }.build().also { _emoji1f320 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f320: ImageVector? = null
