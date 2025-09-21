package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji2639: ImageVector
    get() {
        val current = _emoji2639
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji2639",
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
            // M9 14.5 a2.5 3.5 0 1 0 5 0 a2.5 3.5 0 1 0 -5 0z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 9 14.5
                moveTo(x = 9.0f, y = 14.5f)
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
            // M22 14.5 a2.5 3.5 0 1 0 5 0 a2.5 3.5 0 1 0 -5 0z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 22 14.5
                moveTo(x = 22.0f, y = 14.5f)
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
            // M8.665 27.871 c0.178 0.161 0.444 0.171 0.635 0.029 0.039 -0.029 3.922 -2.9 8.7 -2.9 4.766 0 8.662 2.871 8.7 2.9 0.191 0.142 0.457 0.13 0.635 -0.029 0.177 -0.16 0.217 -0.424 0.094 -0.628 C27.3 27.029 24.212 22 18 22 s-9.301 5.028 -9.429 5.243 c-0.123 0.205 -0.084 0.468 0.094 0.628z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 8.665 27.871
                moveTo(x = 8.665f, y = 27.871f)
                // c 0.178 0.161 0.444 0.171 0.635 0.029
                curveToRelative(
                    dx1 = 0.178f,
                    dy1 = 0.161f,
                    dx2 = 0.444f,
                    dy2 = 0.171f,
                    dx3 = 0.635f,
                    dy3 = 0.029f,
                )
                // c 0.039 -0.029 3.922 -2.9 8.7 -2.9
                curveToRelative(
                    dx1 = 0.039f,
                    dy1 = -0.029f,
                    dx2 = 3.922f,
                    dy2 = -2.9f,
                    dx3 = 8.7f,
                    dy3 = -2.9f,
                )
                // c 4.766 0 8.662 2.871 8.7 2.9
                curveToRelative(
                    dx1 = 4.766f,
                    dy1 = 0.0f,
                    dx2 = 8.662f,
                    dy2 = 2.871f,
                    dx3 = 8.7f,
                    dy3 = 2.9f,
                )
                // c 0.191 0.142 0.457 0.13 0.635 -0.029
                curveToRelative(
                    dx1 = 0.191f,
                    dy1 = 0.142f,
                    dx2 = 0.457f,
                    dy2 = 0.13f,
                    dx3 = 0.635f,
                    dy3 = -0.029f,
                )
                // c 0.177 -0.16 0.217 -0.424 0.094 -0.628
                curveToRelative(
                    dx1 = 0.177f,
                    dy1 = -0.16f,
                    dx2 = 0.217f,
                    dy2 = -0.424f,
                    dx3 = 0.094f,
                    dy3 = -0.628f,
                )
                // C 27.3 27.029 24.212 22 18 22
                curveTo(
                    x1 = 27.3f,
                    y1 = 27.029f,
                    x2 = 24.212f,
                    y2 = 22.0f,
                    x3 = 18.0f,
                    y3 = 22.0f,
                )
                // s -9.301 5.028 -9.429 5.243
                reflectiveCurveToRelative(
                    dx1 = -9.301f,
                    dy1 = 5.028f,
                    dx2 = -9.429f,
                    dy2 = 5.243f,
                )
                // c -0.123 0.205 -0.084 0.468 0.094 0.628z
                curveToRelative(
                    dx1 = -0.123f,
                    dy1 = 0.205f,
                    dx2 = -0.084f,
                    dy2 = 0.468f,
                    dx3 = 0.094f,
                    dy3 = 0.628f,
                )
                close()
            }
        }.build().also { _emoji2639 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji2639: ImageVector? = null
