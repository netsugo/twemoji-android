package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f501: ImageVector
    get() {
        val current = _emoji1f501
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f501",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 32 c0 2.209 -1.791 4 -4 4 H4 c-2.209 0 -4 -1.791 -4 -4 V4 c0 -2.209 1.791 -4 4 -4 h28 c2.209 0 4 1.791 4 4 v28z
            path(
                fill = SolidColor(Color(0xFF3B88C3)),
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
            // M30.2 10 L23 4 v4 h-8 C9.477 8 5 12.477 5 18 c0 1.414 0.297 2.758 0.827 3.978 l3.3 -2.75 C9.044 18.831 9 18.421 9 18 c0 -3.314 2.686 -6 6 -6 h8 v4 l7.2 -6z M30.174 14.023 l-3.301 2.75 c0.083 0.396 0.127 0.806 0.127 1.227 0 3.313 -2.687 6 -6 6 h-8 v-4 l-7.2 6 7.2 6 v-4 h8 c5.522 0 10 -4.478 10 -10 0 -1.414 -0.297 -2.758 -0.826 -3.977z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 30.2 10
                moveTo(x = 30.2f, y = 10.0f)
                // L 23 4
                lineTo(x = 23.0f, y = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // C 9.477 8 5 12.477 5 18
                curveTo(
                    x1 = 9.477f,
                    y1 = 8.0f,
                    x2 = 5.0f,
                    y2 = 12.477f,
                    x3 = 5.0f,
                    y3 = 18.0f,
                )
                // c 0 1.414 0.297 2.758 0.827 3.978
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.414f,
                    dx2 = 0.297f,
                    dy2 = 2.758f,
                    dx3 = 0.827f,
                    dy3 = 3.978f,
                )
                // l 3.3 -2.75
                lineToRelative(dx = 3.3f, dy = -2.75f)
                // C 9.044 18.831 9 18.421 9 18
                curveTo(
                    x1 = 9.044f,
                    y1 = 18.831f,
                    x2 = 9.0f,
                    y2 = 18.421f,
                    x3 = 9.0f,
                    y3 = 18.0f,
                )
                // c 0 -3.314 2.686 -6 6 -6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.314f,
                    dx2 = 2.686f,
                    dy2 = -6.0f,
                    dx3 = 6.0f,
                    dy3 = -6.0f,
                )
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // l 7.2 -6z
                lineToRelative(dx = 7.2f, dy = -6.0f)
                close()
                // M 30.174 14.023
                moveTo(x = 30.174f, y = 14.023f)
                // l -3.301 2.75
                lineToRelative(dx = -3.301f, dy = 2.75f)
                // c 0.083 0.396 0.127 0.806 0.127 1.227
                curveToRelative(
                    dx1 = 0.083f,
                    dy1 = 0.396f,
                    dx2 = 0.127f,
                    dy2 = 0.806f,
                    dx3 = 0.127f,
                    dy3 = 1.227f,
                )
                // c 0 3.313 -2.687 6 -6 6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.313f,
                    dx2 = -2.687f,
                    dy2 = 6.0f,
                    dx3 = -6.0f,
                    dy3 = 6.0f,
                )
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // l -7.2 6
                lineToRelative(dx = -7.2f, dy = 6.0f)
                // l 7.2 6
                lineToRelative(dx = 7.2f, dy = 6.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // c 5.522 0 10 -4.478 10 -10
                curveToRelative(
                    dx1 = 5.522f,
                    dy1 = 0.0f,
                    dx2 = 10.0f,
                    dy2 = -4.478f,
                    dx3 = 10.0f,
                    dy3 = -10.0f,
                )
                // c 0 -1.414 -0.297 -2.758 -0.826 -3.977z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.414f,
                    dx2 = -0.297f,
                    dy2 = -2.758f,
                    dx3 = -0.826f,
                    dy3 = -3.977f,
                )
                close()
            }
        }.build().also { _emoji1f501 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f501: ImageVector? = null
