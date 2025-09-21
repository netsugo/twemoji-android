package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f643: ImageVector
    get() {
        val current = _emoji1f643
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f643",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M0 18 C0 8.059 8.059 0 18 0 s18 8.059 18 18 -8.059 18 -18 18 S0 27.941 0 18
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 0 18
                moveTo(x = 0.0f, y = 18.0f)
                // C 0 8.059 8.059 0 18 0
                curveTo(
                    x1 = 0.0f,
                    y1 = 8.059f,
                    x2 = 8.059f,
                    y2 = 0.0f,
                    x3 = 18.0f,
                    y3 = 0.0f,
                )
                // s 18 8.059 18 18
                reflectiveCurveToRelative(
                    dx1 = 18.0f,
                    dy1 = 8.059f,
                    dx2 = 18.0f,
                    dy2 = 18.0f,
                )
                // s -8.059 18 -18 18
                reflectiveCurveToRelative(
                    dx1 = -8.059f,
                    dy1 = 18.0f,
                    dx2 = -18.0f,
                    dy2 = 18.0f,
                )
                // S 0 27.941 0 18
                reflectiveCurveTo(
                    x1 = 0.0f,
                    y1 = 27.941f,
                    x2 = 0.0f,
                    y2 = 18.0f,
                )
            }
            // M8.665 12.871 c0.178 0.161 0.444 0.171 0.635 0.029 0.039 -0.029 3.922 -2.9 8.7 -2.9 4.766 0 8.662 2.871 8.7 2.9 0.191 0.142 0.457 0.13 0.635 -0.029 0.177 -0.16 0.217 -0.424 0.094 -0.628 C27.3 12.029 24.212 7 18 7 s-9.301 5.028 -9.429 5.243 c-0.123 0.205 -0.084 0.468 0.094 0.628z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 8.665 12.871
                moveTo(x = 8.665f, y = 12.871f)
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
                // C 27.3 12.029 24.212 7 18 7
                curveTo(
                    x1 = 27.3f,
                    y1 = 12.029f,
                    x2 = 24.212f,
                    y2 = 7.0f,
                    x3 = 18.0f,
                    y3 = 7.0f,
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
            // M9 21.5 a2.5 3.5 0 1 0 5 0 a2.5 3.5 0 1 0 -5 0z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 9 21.5
                moveTo(x = 9.0f, y = 21.5f)
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
            // M22 21.5 a2.5 3.5 0 1 0 5 0 a2.5 3.5 0 1 0 -5 0z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 22 21.5
                moveTo(x = 22.0f, y = 21.5f)
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
        }.build().also { _emoji1f643 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f643: ImageVector? = null
