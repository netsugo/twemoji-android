package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f3a6: ImageVector
    get() {
        val current = _emoji1f3a6
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f3a6",
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
            // M21 11 c0 3.314 -2.687 6 -6 6 -3.314 0 -6 -2.686 -6 -6 s2.686 -6 6 -6 c3.313 0 6 2.686 6 6z M31.999 13 c0 2.761 -2.239 5 -5 5 s-5 -2.239 -5 -5 2.239 -5 5 -5 5 2.238 5 5z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 21 11
                moveTo(x = 21.0f, y = 11.0f)
                // c 0 3.314 -2.687 6 -6 6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.314f,
                    dx2 = -2.687f,
                    dy2 = 6.0f,
                    dx3 = -6.0f,
                    dy3 = 6.0f,
                )
                // c -3.314 0 -6 -2.686 -6 -6
                curveToRelative(
                    dx1 = -3.314f,
                    dy1 = 0.0f,
                    dx2 = -6.0f,
                    dy2 = -2.686f,
                    dx3 = -6.0f,
                    dy3 = -6.0f,
                )
                // s 2.686 -6 6 -6
                reflectiveCurveToRelative(
                    dx1 = 2.686f,
                    dy1 = -6.0f,
                    dx2 = 6.0f,
                    dy2 = -6.0f,
                )
                // c 3.313 0 6 2.686 6 6z
                curveToRelative(
                    dx1 = 3.313f,
                    dy1 = 0.0f,
                    dx2 = 6.0f,
                    dy2 = 2.686f,
                    dx3 = 6.0f,
                    dy3 = 6.0f,
                )
                close()
                // M 31.999 13
                moveTo(x = 31.999f, y = 13.0f)
                // c 0 2.761 -2.239 5 -5 5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.761f,
                    dx2 = -2.239f,
                    dy2 = 5.0f,
                    dx3 = -5.0f,
                    dy3 = 5.0f,
                )
                // s -5 -2.239 -5 -5
                reflectiveCurveToRelative(
                    dx1 = -5.0f,
                    dy1 = -2.239f,
                    dx2 = -5.0f,
                    dy2 = -5.0f,
                )
                // s 2.239 -5 5 -5
                reflectiveCurveToRelative(
                    dx1 = 2.239f,
                    dy1 = -5.0f,
                    dx2 = 5.0f,
                    dy2 = -5.0f,
                )
                // s 5 2.238 5 5z
                reflectiveCurveToRelative(
                    dx1 = 5.0f,
                    dy1 = 2.238f,
                    dx2 = 5.0f,
                    dy2 = 5.0f,
                )
                close()
            }
            // M30 20 c0 -2.209 -1.791 -4 -4 -4 H15 c-2.209 0 -4 1.791 -4 4 l-6 -4 H4 v13 h1 l6 -4 v2 c0 2.209 1.791 4 4 4 h11 c2.209 0 4 -1.791 4 -4 v-7z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 30 20
                moveTo(x = 30.0f, y = 20.0f)
                // c 0 -2.209 -1.791 -4 -4 -4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.209f,
                    dx2 = -1.791f,
                    dy2 = -4.0f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                // H 15
                horizontalLineTo(x = 15.0f)
                // c -2.209 0 -4 1.791 -4 4
                curveToRelative(
                    dx1 = -2.209f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = 1.791f,
                    dx3 = -4.0f,
                    dy3 = 4.0f,
                )
                // l -6 -4
                lineToRelative(dx = -6.0f, dy = -4.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // v 13
                verticalLineToRelative(dy = 13.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // l 6 -4
                lineToRelative(dx = 6.0f, dy = -4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // c 0 2.209 1.791 4 4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = 1.791f,
                    dy2 = 4.0f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // h 11
                horizontalLineToRelative(dx = 11.0f)
                // c 2.209 0 4 -1.791 4 -4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = -1.791f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // v -7z
                verticalLineToRelative(dy = -7.0f)
                close()
            }
        }.build().also { _emoji1f3a6 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f3a6: ImageVector? = null
