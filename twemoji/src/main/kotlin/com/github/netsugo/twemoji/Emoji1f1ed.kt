package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1ed: ImageVector
    get() {
        val current = _emoji1f1ed
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1ed",
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
            // M25.5 7 C24.119 7 23 8.119 23 9.5 V15 H13 V9.5 C13 8.119 11.881 7 10.5 7 S8 8.119 8 9.5 v17 c0 1.381 1.119 2.5 2.5 2.5 s2.5 -1.119 2.5 -2.5 V20 h10 v6.5 c0 1.381 1.119 2.5 2.5 2.5 s2.5 -1.119 2.5 -2.5 v-17 C28 8.119 26.881 7 25.5 7z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 25.5 7
                moveTo(x = 25.5f, y = 7.0f)
                // C 24.119 7 23 8.119 23 9.5
                curveTo(
                    x1 = 24.119f,
                    y1 = 7.0f,
                    x2 = 23.0f,
                    y2 = 8.119f,
                    x3 = 23.0f,
                    y3 = 9.5f,
                )
                // V 15
                verticalLineTo(y = 15.0f)
                // H 13
                horizontalLineTo(x = 13.0f)
                // V 9.5
                verticalLineTo(y = 9.5f)
                // C 13 8.119 11.881 7 10.5 7
                curveTo(
                    x1 = 13.0f,
                    y1 = 8.119f,
                    x2 = 11.881f,
                    y2 = 7.0f,
                    x3 = 10.5f,
                    y3 = 7.0f,
                )
                // S 8 8.119 8 9.5
                reflectiveCurveTo(
                    x1 = 8.0f,
                    y1 = 8.119f,
                    x2 = 8.0f,
                    y2 = 9.5f,
                )
                // v 17
                verticalLineToRelative(dy = 17.0f)
                // c 0 1.381 1.119 2.5 2.5 2.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.381f,
                    dx2 = 1.119f,
                    dy2 = 2.5f,
                    dx3 = 2.5f,
                    dy3 = 2.5f,
                )
                // s 2.5 -1.119 2.5 -2.5
                reflectiveCurveToRelative(
                    dx1 = 2.5f,
                    dy1 = -1.119f,
                    dx2 = 2.5f,
                    dy2 = -2.5f,
                )
                // V 20
                verticalLineTo(y = 20.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // v 6.5
                verticalLineToRelative(dy = 6.5f)
                // c 0 1.381 1.119 2.5 2.5 2.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.381f,
                    dx2 = 1.119f,
                    dy2 = 2.5f,
                    dx3 = 2.5f,
                    dy3 = 2.5f,
                )
                // s 2.5 -1.119 2.5 -2.5
                reflectiveCurveToRelative(
                    dx1 = 2.5f,
                    dy1 = -1.119f,
                    dx2 = 2.5f,
                    dy2 = -2.5f,
                )
                // v -17
                verticalLineToRelative(dy = -17.0f)
                // C 28 8.119 26.881 7 25.5 7z
                curveTo(
                    x1 = 28.0f,
                    y1 = 8.119f,
                    x2 = 26.881f,
                    y2 = 7.0f,
                    x3 = 25.5f,
                    y3 = 7.0f,
                )
                close()
            }
        }.build().also { _emoji1f1ed = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1ed: ImageVector? = null
