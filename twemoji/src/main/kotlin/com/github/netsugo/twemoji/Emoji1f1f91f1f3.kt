package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1f91f1f3: ImageVector
    get() {
        val current = _emoji1f1f91f1f3
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1f91f1f3",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M32 5 H4 C1.791 5 0 6.791 0 9 v18 c0 2.209 1.791 4 4 4 h28 c2.209 0 4 -1.791 4 -4 V9 c0 -2.209 -1.791 -4 -4 -4z
            path(
                fill = SolidColor(Color(0xFFE70013)),
            ) {
                // M 32 5
                moveTo(x = 32.0f, y = 5.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // C 1.791 5 0 6.791 0 9
                curveTo(
                    x1 = 1.791f,
                    y1 = 5.0f,
                    x2 = 0.0f,
                    y2 = 6.791f,
                    x3 = 0.0f,
                    y3 = 9.0f,
                )
                // v 18
                verticalLineToRelative(dy = 18.0f)
                // c 0 2.209 1.791 4 4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = 1.791f,
                    dy2 = 4.0f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
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
                // V 9
                verticalLineTo(y = 9.0f)
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
            // M18 18 m-6.5 0 a6.5 6.5 0 1 1 13 0 a6.5 6.5 0 1 1 -13 0
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 18 18
                moveTo(x = 18.0f, y = 18.0f)
                // m -6.5 0
                moveToRelative(dx = -6.5f, dy = 0.0f)
                // a 6.5 6.5 0 1 1 13 0
                arcToRelative(
                    a = 6.5f,
                    b = 6.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 13.0f,
                    dy1 = 0.0f,
                )
                // a 6.5 6.5 0 1 1 -13 0
                arcToRelative(
                    a = 6.5f,
                    b = 6.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -13.0f,
                    dy1 = 0.0f,
                )
            }
            // M15.4 18 c0 -2.154 1.746 -3.9 3.9 -3.9 1.019 0 1.946 0.391 2.641 1.031 -0.887 -1.216 -2.321 -2.006 -3.941 -2.006 -2.692 0 -4.875 2.183 -4.875 4.875 s2.183 4.875 4.875 4.875 c1.62 0 3.055 -0.79 3.941 -2.006 -0.695 0.64 -1.622 1.031 -2.641 1.031 -2.154 0 -3.9 -1.746 -3.9 -3.9z
            path(
                fill = SolidColor(Color(0xFFE70013)),
            ) {
                // M 15.4 18
                moveTo(x = 15.4f, y = 18.0f)
                // c 0 -2.154 1.746 -3.9 3.9 -3.9
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.154f,
                    dx2 = 1.746f,
                    dy2 = -3.9f,
                    dx3 = 3.9f,
                    dy3 = -3.9f,
                )
                // c 1.019 0 1.946 0.391 2.641 1.031
                curveToRelative(
                    dx1 = 1.019f,
                    dy1 = 0.0f,
                    dx2 = 1.946f,
                    dy2 = 0.391f,
                    dx3 = 2.641f,
                    dy3 = 1.031f,
                )
                // c -0.887 -1.216 -2.321 -2.006 -3.941 -2.006
                curveToRelative(
                    dx1 = -0.887f,
                    dy1 = -1.216f,
                    dx2 = -2.321f,
                    dy2 = -2.006f,
                    dx3 = -3.941f,
                    dy3 = -2.006f,
                )
                // c -2.692 0 -4.875 2.183 -4.875 4.875
                curveToRelative(
                    dx1 = -2.692f,
                    dy1 = 0.0f,
                    dx2 = -4.875f,
                    dy2 = 2.183f,
                    dx3 = -4.875f,
                    dy3 = 4.875f,
                )
                // s 2.183 4.875 4.875 4.875
                reflectiveCurveToRelative(
                    dx1 = 2.183f,
                    dy1 = 4.875f,
                    dx2 = 4.875f,
                    dy2 = 4.875f,
                )
                // c 1.62 0 3.055 -0.79 3.941 -2.006
                curveToRelative(
                    dx1 = 1.62f,
                    dy1 = 0.0f,
                    dx2 = 3.055f,
                    dy2 = -0.79f,
                    dx3 = 3.941f,
                    dy3 = -2.006f,
                )
                // c -0.695 0.64 -1.622 1.031 -2.641 1.031
                curveToRelative(
                    dx1 = -0.695f,
                    dy1 = 0.64f,
                    dx2 = -1.622f,
                    dy2 = 1.031f,
                    dx3 = -2.641f,
                    dy3 = 1.031f,
                )
                // c -2.154 0 -3.9 -1.746 -3.9 -3.9z
                curveToRelative(
                    dx1 = -2.154f,
                    dy1 = 0.0f,
                    dx2 = -3.9f,
                    dy2 = -1.746f,
                    dx3 = -3.9f,
                    dy3 = -3.9f,
                )
                close()
            }
            // M19.645 16.937 l-1.249 -1.719 v2.125 L16.375 18 l2.021 0.657 v2.125 l1.249 -1.719 2.021 0.656 L20.417 18 l1.249 -1.719z
            path(
                fill = SolidColor(Color(0xFFE70013)),
            ) {
                // M 19.645 16.937
                moveTo(x = 19.645f, y = 16.937f)
                // l -1.249 -1.719
                lineToRelative(dx = -1.249f, dy = -1.719f)
                // v 2.125
                verticalLineToRelative(dy = 2.125f)
                // L 16.375 18
                lineTo(x = 16.375f, y = 18.0f)
                // l 2.021 0.657
                lineToRelative(dx = 2.021f, dy = 0.657f)
                // v 2.125
                verticalLineToRelative(dy = 2.125f)
                // l 1.249 -1.719
                lineToRelative(dx = 1.249f, dy = -1.719f)
                // l 2.021 0.656
                lineToRelative(dx = 2.021f, dy = 0.656f)
                // L 20.417 18
                lineTo(x = 20.417f, y = 18.0f)
                // l 1.249 -1.719z
                lineToRelative(dx = 1.249f, dy = -1.719f)
                close()
            }
        }.build().also { _emoji1f1f91f1f3 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1f91f1f3: ImageVector? = null
