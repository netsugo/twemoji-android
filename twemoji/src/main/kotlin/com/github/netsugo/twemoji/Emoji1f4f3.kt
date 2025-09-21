package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f4f3: ImageVector
    get() {
        val current = _emoji1f4f3
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f4f3",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 32 c0 4 -4 4 -4 4 H4 c-4 0 -4 -4 -4 -4 V4 c0 -4 4 -4 4 -4 h28 s4 0 4 4 v28z
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 36 32
                moveTo(x = 36.0f, y = 32.0f)
                // c 0 4 -4 4 -4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.0f,
                    dx2 = -4.0f,
                    dy2 = 4.0f,
                    dx3 = -4.0f,
                    dy3 = 4.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // c -4 0 -4 -4 -4 -4
                curveToRelative(
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = -4.0f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
                // c 0 -4 4 -4 4 -4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.0f,
                    dx2 = 4.0f,
                    dy2 = -4.0f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // s 4 0 4 4
                reflectiveCurveToRelative(
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = 4.0f,
                )
                // v 28z
                verticalLineToRelative(dy = 28.0f)
                close()
            }
            // M24 3 L12 3 C9 3 9 6 9 6 v24 c0 3 3 3 3 3 h12 c3 0 3 -3 3 -3 L27 6 c0 -3 -3 -3 -3 -3z M25 28 L11 28 L11 8 h14 v20z M2 15 v5 l5 -2 v-1z M3 13 l4 2 v-2 l-4 -3z M3 22 l4 -2 v2 l-4 3z M34 15 v5 l-5 -2 v-1z M33 13 l-4 2 v-2 l4 -3z M33 22 l-4 -2 v2 l4 3z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 24 3
                moveTo(x = 24.0f, y = 3.0f)
                // L 12 3
                lineTo(x = 12.0f, y = 3.0f)
                // C 9 3 9 6 9 6
                curveTo(
                    x1 = 9.0f,
                    y1 = 3.0f,
                    x2 = 9.0f,
                    y2 = 6.0f,
                    x3 = 9.0f,
                    y3 = 6.0f,
                )
                // v 24
                verticalLineToRelative(dy = 24.0f)
                // c 0 3 3 3 3 3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.0f,
                    dx2 = 3.0f,
                    dy2 = 3.0f,
                    dx3 = 3.0f,
                    dy3 = 3.0f,
                )
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // c 3 0 3 -3 3 -3
                curveToRelative(
                    dx1 = 3.0f,
                    dy1 = 0.0f,
                    dx2 = 3.0f,
                    dy2 = -3.0f,
                    dx3 = 3.0f,
                    dy3 = -3.0f,
                )
                // L 27 6
                lineTo(x = 27.0f, y = 6.0f)
                // c 0 -3 -3 -3 -3 -3z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.0f,
                    dx2 = -3.0f,
                    dy2 = -3.0f,
                    dx3 = -3.0f,
                    dy3 = -3.0f,
                )
                close()
                // M 25 28
                moveTo(x = 25.0f, y = 28.0f)
                // L 11 28
                lineTo(x = 11.0f, y = 28.0f)
                // L 11 8
                lineTo(x = 11.0f, y = 8.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // v 20z
                verticalLineToRelative(dy = 20.0f)
                close()
                // M 2 15
                moveTo(x = 2.0f, y = 15.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // l 5 -2
                lineToRelative(dx = 5.0f, dy = -2.0f)
                // v -1z
                verticalLineToRelative(dy = -1.0f)
                close()
                // M 3 13
                moveTo(x = 3.0f, y = 13.0f)
                // l 4 2
                lineToRelative(dx = 4.0f, dy = 2.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // l -4 -3z
                lineToRelative(dx = -4.0f, dy = -3.0f)
                close()
                // M 3 22
                moveTo(x = 3.0f, y = 22.0f)
                // l 4 -2
                lineToRelative(dx = 4.0f, dy = -2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // l -4 3z
                lineToRelative(dx = -4.0f, dy = 3.0f)
                close()
                // M 34 15
                moveTo(x = 34.0f, y = 15.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // l -5 -2
                lineToRelative(dx = -5.0f, dy = -2.0f)
                // v -1z
                verticalLineToRelative(dy = -1.0f)
                close()
                // M 33 13
                moveTo(x = 33.0f, y = 13.0f)
                // l -4 2
                lineToRelative(dx = -4.0f, dy = 2.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // l 4 -3z
                lineToRelative(dx = 4.0f, dy = -3.0f)
                close()
                // M 33 22
                moveTo(x = 33.0f, y = 22.0f)
                // l -4 -2
                lineToRelative(dx = -4.0f, dy = -2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // l 4 3z
                lineToRelative(dx = 4.0f, dy = 3.0f)
                close()
            }
        }.build().also { _emoji1f4f3 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f4f3: ImageVector? = null
