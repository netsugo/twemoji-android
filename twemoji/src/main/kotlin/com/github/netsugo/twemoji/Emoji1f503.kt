package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f503: ImageVector
    get() {
        val current = _emoji1f503
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f503",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M4 36 c-2.209 0 -4 -1.791 -4 -4 V4 c0 -2.209 1.791 -4 4 -4 h28 c2.209 0 4 1.791 4 4 v28 c0 2.209 -1.791 4 -4 4 H4z
            path(
                fill = SolidColor(Color(0xFF3B88C3)),
            ) {
                // M 4 36
                moveTo(x = 4.0f, y = 36.0f)
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
                // v 28
                verticalLineToRelative(dy = 28.0f)
                // c 0 2.209 -1.791 4 -4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = -1.791f,
                    dy2 = 4.0f,
                    dx3 = -4.0f,
                    dy3 = 4.0f,
                )
                // H 4z
                horizontalLineTo(x = 4.0f)
                close()
            }
            // M26 30.2 l6 -7.2 h-4 v-8 c0 -5.523 -4.477 -10 -10 -10 -1.414 0 -2.758 0.297 -3.977 0.827 l2.75 3.3 C17.169 9.044 17.579 9 18 9 c3.315 0 6 2.686 6 6 v8 h-4 l6 7.2z M21.977 30.174 l-2.749 -3.301 c-0.397 0.083 -0.807 0.127 -1.228 0.127 -3.314 0 -6 -2.687 -6 -6 v-8 h4 l-6 -7.2 L4 13 h4 v8 c0 5.522 4.477 10 10 10 1.414 0 2.758 -0.297 3.977 -0.826z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 26 30.2
                moveTo(x = 26.0f, y = 30.2f)
                // l 6 -7.2
                lineToRelative(dx = 6.0f, dy = -7.2f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // c 0 -5.523 -4.477 -10 -10 -10
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -5.523f,
                    dx2 = -4.477f,
                    dy2 = -10.0f,
                    dx3 = -10.0f,
                    dy3 = -10.0f,
                )
                // c -1.414 0 -2.758 0.297 -3.977 0.827
                curveToRelative(
                    dx1 = -1.414f,
                    dy1 = 0.0f,
                    dx2 = -2.758f,
                    dy2 = 0.297f,
                    dx3 = -3.977f,
                    dy3 = 0.827f,
                )
                // l 2.75 3.3
                lineToRelative(dx = 2.75f, dy = 3.3f)
                // C 17.169 9.044 17.579 9 18 9
                curveTo(
                    x1 = 17.169f,
                    y1 = 9.044f,
                    x2 = 17.579f,
                    y2 = 9.0f,
                    x3 = 18.0f,
                    y3 = 9.0f,
                )
                // c 3.315 0 6 2.686 6 6
                curveToRelative(
                    dx1 = 3.315f,
                    dy1 = 0.0f,
                    dx2 = 6.0f,
                    dy2 = 2.686f,
                    dx3 = 6.0f,
                    dy3 = 6.0f,
                )
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // l 6 7.2z
                lineToRelative(dx = 6.0f, dy = 7.2f)
                close()
                // M 21.977 30.174
                moveTo(x = 21.977f, y = 30.174f)
                // l -2.749 -3.301
                lineToRelative(dx = -2.749f, dy = -3.301f)
                // c -0.397 0.083 -0.807 0.127 -1.228 0.127
                curveToRelative(
                    dx1 = -0.397f,
                    dy1 = 0.083f,
                    dx2 = -0.807f,
                    dy2 = 0.127f,
                    dx3 = -1.228f,
                    dy3 = 0.127f,
                )
                // c -3.314 0 -6 -2.687 -6 -6
                curveToRelative(
                    dx1 = -3.314f,
                    dy1 = 0.0f,
                    dx2 = -6.0f,
                    dy2 = -2.687f,
                    dx3 = -6.0f,
                    dy3 = -6.0f,
                )
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // l -6 -7.2
                lineToRelative(dx = -6.0f, dy = -7.2f)
                // L 4 13
                lineTo(x = 4.0f, y = 13.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // c 0 5.522 4.477 10 10 10
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 5.522f,
                    dx2 = 4.477f,
                    dy2 = 10.0f,
                    dx3 = 10.0f,
                    dy3 = 10.0f,
                )
                // c 1.414 0 2.758 -0.297 3.977 -0.826z
                curveToRelative(
                    dx1 = 1.414f,
                    dy1 = 0.0f,
                    dx2 = 2.758f,
                    dy2 = -0.297f,
                    dx3 = 3.977f,
                    dy3 = -0.826f,
                )
                close()
            }
        }.build().also { _emoji1f503 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f503: ImageVector? = null
