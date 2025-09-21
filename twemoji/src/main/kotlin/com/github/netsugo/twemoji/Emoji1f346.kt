package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f346: ImageVector
    get() {
        val current = _emoji1f346
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f346",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M6 4 c3 0 5 2 8 6 s7.957 7.191 12 8 c5 1 9 5 9 11 0 4.897 -3.846 7 -9 7 -5 0 -9 -3 -14 -8 S2 14 2 10 s1 -6 4 -6z
            path(
                fill = SolidColor(Color(0xFF744EAA)),
            ) {
                // M 6 4
                moveTo(x = 6.0f, y = 4.0f)
                // c 3 0 5 2 8 6
                curveToRelative(
                    dx1 = 3.0f,
                    dy1 = 0.0f,
                    dx2 = 5.0f,
                    dy2 = 2.0f,
                    dx3 = 8.0f,
                    dy3 = 6.0f,
                )
                // s 7.957 7.191 12 8
                reflectiveCurveToRelative(
                    dx1 = 7.957f,
                    dy1 = 7.191f,
                    dx2 = 12.0f,
                    dy2 = 8.0f,
                )
                // c 5 1 9 5 9 11
                curveToRelative(
                    dx1 = 5.0f,
                    dy1 = 1.0f,
                    dx2 = 9.0f,
                    dy2 = 5.0f,
                    dx3 = 9.0f,
                    dy3 = 11.0f,
                )
                // c 0 4.897 -3.846 7 -9 7
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.897f,
                    dx2 = -3.846f,
                    dy2 = 7.0f,
                    dx3 = -9.0f,
                    dy3 = 7.0f,
                )
                // c -5 0 -9 -3 -14 -8
                curveToRelative(
                    dx1 = -5.0f,
                    dy1 = 0.0f,
                    dx2 = -9.0f,
                    dy2 = -3.0f,
                    dx3 = -14.0f,
                    dy3 = -8.0f,
                )
                // S 2 14 2 10
                reflectiveCurveTo(
                    x1 = 2.0f,
                    y1 = 14.0f,
                    x2 = 2.0f,
                    y2 = 10.0f,
                )
                // s 1 -6 4 -6z
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = -6.0f,
                    dx2 = 4.0f,
                    dy2 = -6.0f,
                )
                close()
            }
            // M3.515 0 c1.248 0 1.248 1.248 1.248 2.495 0 1.764 1.248 1.129 2.496 1.129 C8.505 3.624 11 6 11 6 H7.258 c-1.248 0 0 2.614 -1.248 2.614 S4.762 7.426 3.515 7.426 2 11 2 11 s-1.604 -4.153 0.267 -6.024 C3.515 3.728 1.02 0 3.515 0z
            path(
                fill = SolidColor(Color(0xFF77B255)),
            ) {
                // M 3.515 0
                moveTo(x = 3.515f, y = 0.0f)
                // c 1.248 0 1.248 1.248 1.248 2.495
                curveToRelative(
                    dx1 = 1.248f,
                    dy1 = 0.0f,
                    dx2 = 1.248f,
                    dy2 = 1.248f,
                    dx3 = 1.248f,
                    dy3 = 2.495f,
                )
                // c 0 1.764 1.248 1.129 2.496 1.129
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.764f,
                    dx2 = 1.248f,
                    dy2 = 1.129f,
                    dx3 = 2.496f,
                    dy3 = 1.129f,
                )
                // C 8.505 3.624 11 6 11 6
                curveTo(
                    x1 = 8.505f,
                    y1 = 3.624f,
                    x2 = 11.0f,
                    y2 = 6.0f,
                    x3 = 11.0f,
                    y3 = 6.0f,
                )
                // H 7.258
                horizontalLineTo(x = 7.258f)
                // c -1.248 0 0 2.614 -1.248 2.614
                curveToRelative(
                    dx1 = -1.248f,
                    dy1 = 0.0f,
                    dx2 = 0.0f,
                    dy2 = 2.614f,
                    dx3 = -1.248f,
                    dy3 = 2.614f,
                )
                // S 4.762 7.426 3.515 7.426
                reflectiveCurveTo(
                    x1 = 4.762f,
                    y1 = 7.426f,
                    x2 = 3.515f,
                    y2 = 7.426f,
                )
                // S 2 11 2 11
                reflectiveCurveTo(
                    x1 = 2.0f,
                    y1 = 11.0f,
                    x2 = 2.0f,
                    y2 = 11.0f,
                )
                // s -1.604 -4.153 0.267 -6.024
                reflectiveCurveToRelative(
                    dx1 = -1.604f,
                    dy1 = -4.153f,
                    dx2 = 0.267f,
                    dy2 = -6.024f,
                )
                // C 3.515 3.728 1.02 0 3.515 0z
                curveTo(
                    x1 = 3.515f,
                    y1 = 3.728f,
                    x2 = 1.02f,
                    y2 = 0.0f,
                    x3 = 3.515f,
                    y3 = 0.0f,
                )
                close()
            }
        }.build().also { _emoji1f346 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f346: ImageVector? = null
