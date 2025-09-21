package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f615: ImageVector
    get() {
        val current = _emoji1f615
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f615",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 18 c0 9.941 -8.059 18 -18 18 -9.94 0 -18 -8.059 -18 -18 C0 8.06 8.06 0 18 0 c9.941 0 18 8.06 18 18
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 36 18
                moveTo(x = 36.0f, y = 18.0f)
                // c 0 9.941 -8.059 18 -18 18
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 9.941f,
                    dx2 = -8.059f,
                    dy2 = 18.0f,
                    dx3 = -18.0f,
                    dy3 = 18.0f,
                )
                // c -9.94 0 -18 -8.059 -18 -18
                curveToRelative(
                    dx1 = -9.94f,
                    dy1 = 0.0f,
                    dx2 = -18.0f,
                    dy2 = -8.059f,
                    dx3 = -18.0f,
                    dy3 = -18.0f,
                )
                // C 0 8.06 8.06 0 18 0
                curveTo(
                    x1 = 0.0f,
                    y1 = 8.06f,
                    x2 = 8.06f,
                    y2 = 0.0f,
                    x3 = 18.0f,
                    y3 = 0.0f,
                )
                // c 9.941 0 18 8.06 18 18
                curveToRelative(
                    dx1 = 9.941f,
                    dy1 = 0.0f,
                    dx2 = 18.0f,
                    dy2 = 8.06f,
                    dx3 = 18.0f,
                    dy3 = 18.0f,
                )
            }
            // M9 16.5 a2.5 3.5 0 1 0 5 0 a2.5 3.5 0 1 0 -5 0z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 9 16.5
                moveTo(x = 9.0f, y = 16.5f)
                // a 2.5 3.5 0 1 0 5 0
                arcToRelative(
                    a = 2.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // a 2.5 3.5 0 1 0 -5 0z
                arcToRelative(
                    a = 2.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -5.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M22 16.5 a2.5 3.5 0 1 0 5 0 a2.5 3.5 0 1 0 -5 0z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 22 16.5
                moveTo(x = 22.0f, y = 16.5f)
                // a 2.5 3.5 0 1 0 5 0
                arcToRelative(
                    a = 2.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // a 2.5 3.5 0 1 0 -5 0z
                arcToRelative(
                    a = 2.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -5.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M12 28 c2 -5 13 -5 13 -3 0 1 -8 -1 -13 3z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 12 28
                moveTo(x = 12.0f, y = 28.0f)
                // c 2 -5 13 -5 13 -3
                curveToRelative(
                    dx1 = 2.0f,
                    dy1 = -5.0f,
                    dx2 = 13.0f,
                    dy2 = -5.0f,
                    dx3 = 13.0f,
                    dy3 = -3.0f,
                )
                // c 0 1 -8 -1 -13 3z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.0f,
                    dx2 = -8.0f,
                    dy2 = -1.0f,
                    dx3 = -13.0f,
                    dy3 = 3.0f,
                )
                close()
            }
        }.build().also { _emoji1f615 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f615: ImageVector? = null
