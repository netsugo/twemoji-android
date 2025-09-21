package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f4c1: ImageVector
    get() {
        val current = _emoji1f4c1
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f4c1",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M0 29 c0 2.209 1.791 4 4 4 h24 c2.209 0 4 -1.791 4 -4 V12 c0 -2.209 -1.791 -4 -4 -4 h-9 c-3.562 0 -3 -5 -8.438 -5 H4 C1.791 3 0 4.791 0 7 v22z
            path(
                fill = SolidColor(Color(0xFF226699)),
            ) {
                // M 0 29
                moveTo(x = 0.0f, y = 29.0f)
                // c 0 2.209 1.791 4 4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = 1.791f,
                    dy2 = 4.0f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // h 24
                horizontalLineToRelative(dx = 24.0f)
                // c 2.209 0 4 -1.791 4 -4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = -1.791f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // V 12
                verticalLineTo(y = 12.0f)
                // c 0 -2.209 -1.791 -4 -4 -4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.209f,
                    dx2 = -1.791f,
                    dy2 = -4.0f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                // h -9
                horizontalLineToRelative(dx = -9.0f)
                // c -3.562 0 -3 -5 -8.438 -5
                curveToRelative(
                    dx1 = -3.562f,
                    dy1 = 0.0f,
                    dx2 = -3.0f,
                    dy2 = -5.0f,
                    dx3 = -8.438f,
                    dy3 = -5.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // C 1.791 3 0 4.791 0 7
                curveTo(
                    x1 = 1.791f,
                    y1 = 3.0f,
                    x2 = 0.0f,
                    y2 = 4.791f,
                    x3 = 0.0f,
                    y3 = 7.0f,
                )
                // v 22z
                verticalLineToRelative(dy = 22.0f)
                close()
            }
            // M30 10 h-6.562 C18 10 18.562 15 15 15 H6 c-2.209 0 -4 1.791 -4 4 v10 c0 0.553 -0.448 1 -1 1 s-1 -0.447 -1 -1 c0 2.209 1.791 4 4 4 h26 c2.209 0 4 -1.791 4 -4 V14 c0 -2.209 -1.791 -4 -4 -4z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 30 10
                moveTo(x = 30.0f, y = 10.0f)
                // h -6.562
                horizontalLineToRelative(dx = -6.562f)
                // C 18 10 18.562 15 15 15
                curveTo(
                    x1 = 18.0f,
                    y1 = 10.0f,
                    x2 = 18.562f,
                    y2 = 15.0f,
                    x3 = 15.0f,
                    y3 = 15.0f,
                )
                // H 6
                horizontalLineTo(x = 6.0f)
                // c -2.209 0 -4 1.791 -4 4
                curveToRelative(
                    dx1 = -2.209f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = 1.791f,
                    dx3 = -4.0f,
                    dy3 = 4.0f,
                )
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // c 0 0.553 -0.448 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.448f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // s -1 -0.447 -1 -1
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = -0.447f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                )
                // c 0 2.209 1.791 4 4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = 1.791f,
                    dy2 = 4.0f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // h 26
                horizontalLineToRelative(dx = 26.0f)
                // c 2.209 0 4 -1.791 4 -4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = -1.791f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // V 14
                verticalLineTo(y = 14.0f)
                // c 0 -2.209 -1.791 -4 -4 -4z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.209f,
                    dx2 = -1.791f,
                    dy2 = -4.0f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                close()
            }
        }.build().also { _emoji1f4c1 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f4c1: ImageVector? = null
