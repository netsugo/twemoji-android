package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f4e4: ImageVector
    get() {
        val current = _emoji1f4e4
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f4e4",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 32 c0 2.209 -1.791 4 -4 4 H4 c-2.209 0 -4 -1.791 -4 -4 v-9 c0 -2.209 0.791 -3 3 -3 h30 c2.209 0 3 0.791 3 3 v9z
            path(
                fill = SolidColor(Color(0xFFD99E82)),
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
                // v -9
                verticalLineToRelative(dy = -9.0f)
                // c 0 -2.209 0.791 -3 3 -3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.209f,
                    dx2 = 0.791f,
                    dy2 = -3.0f,
                    dx3 = 3.0f,
                    dy3 = -3.0f,
                )
                // h 30
                horizontalLineToRelative(dx = 30.0f)
                // c 2.209 0 3 0.791 3 3
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 3.0f,
                    dy2 = 0.791f,
                    dx3 = 3.0f,
                    dy3 = 3.0f,
                )
                // v 9z
                verticalLineToRelative(dy = 9.0f)
                close()
            }
            // M25 20 c0 3.866 -3.134 7 -7 7 s-7 -3.134 -7 -7 h14z
            path(
                fill = SolidColor(Color(0xFF662113)),
            ) {
                // M 25 20
                moveTo(x = 25.0f, y = 20.0f)
                // c 0 3.866 -3.134 7 -7 7
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.866f,
                    dx2 = -3.134f,
                    dy2 = 7.0f,
                    dx3 = -7.0f,
                    dy3 = 7.0f,
                )
                // s -7 -3.134 -7 -7
                reflectiveCurveToRelative(
                    dx1 = -7.0f,
                    dy1 = -3.134f,
                    dx2 = -7.0f,
                    dy2 = -7.0f,
                )
                // h 14z
                horizontalLineToRelative(dx = 14.0f)
                close()
            }
            // M4 36 h28 c2.209 0 4 -1.791 4 -4 H0 c0 2.209 1.791 4 4 4z
            path(
                fill = SolidColor(Color(0xFFC1694F)),
            ) {
                // M 4 36
                moveTo(x = 4.0f, y = 36.0f)
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // c 2.209 0 4 -1.791 4 -4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = -1.791f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // H 0
                horizontalLineTo(x = 0.0f)
                // c 0 2.209 1.791 4 4 4z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = 1.791f,
                    dy2 = 4.0f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                close()
            }
            // M27.435 8.511 L19.572 0.648 c-0.864 -0.865 -2.28 -0.865 -3.145 0 L8.564 8.511 C7.7 9.377 7.993 10 9.216 10 H14 v6 c0 1.104 0.896 2 2 2 h4 c1.104 0 2 -0.896 2 -2 v-6 h4.784 c1.223 0 1.516 -0.623 0.651 -1.489z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 27.435 8.511
                moveTo(x = 27.435f, y = 8.511f)
                // L 19.572 0.648
                lineTo(x = 19.572f, y = 0.648f)
                // c -0.864 -0.865 -2.28 -0.865 -3.145 0
                curveToRelative(
                    dx1 = -0.864f,
                    dy1 = -0.865f,
                    dx2 = -2.28f,
                    dy2 = -0.865f,
                    dx3 = -3.145f,
                    dy3 = 0.0f,
                )
                // L 8.564 8.511
                lineTo(x = 8.564f, y = 8.511f)
                // C 7.7 9.377 7.993 10 9.216 10
                curveTo(
                    x1 = 7.7f,
                    y1 = 9.377f,
                    x2 = 7.993f,
                    y2 = 10.0f,
                    x3 = 9.216f,
                    y3 = 10.0f,
                )
                // H 14
                horizontalLineTo(x = 14.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // c 0 1.104 0.896 2 2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = 0.896f,
                    dy2 = 2.0f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // c 1.104 0 2 -0.896 2 -2
                curveToRelative(
                    dx1 = 1.104f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = -0.896f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // h 4.784
                horizontalLineToRelative(dx = 4.784f)
                // c 1.223 0 1.516 -0.623 0.651 -1.489z
                curveToRelative(
                    dx1 = 1.223f,
                    dy1 = 0.0f,
                    dx2 = 1.516f,
                    dy2 = -0.623f,
                    dx3 = 0.651f,
                    dy3 = -1.489f,
                )
                close()
            }
        }.build().also { _emoji1f4e4 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f4e4: ImageVector? = null
