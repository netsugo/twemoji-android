package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f972: ImageVector
    get() {
        val current = _emoji1f972
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f972",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M18 18 m-18 0 a18 18 0 1 1 36 0 a18 18 0 1 1 -36 0
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 18 18
                moveTo(x = 18.0f, y = 18.0f)
                // m -18 0
                moveToRelative(dx = -18.0f, dy = 0.0f)
                // a 18 18 0 1 1 36 0
                arcToRelative(
                    a = 18.0f,
                    b = 18.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 36.0f,
                    dy1 = 0.0f,
                )
                // a 18 18 0 1 1 -36 0
                arcToRelative(
                    a = 18.0f,
                    b = 18.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -36.0f,
                    dy1 = 0.0f,
                )
            }
            // M9.5 13.5 a2.5 3.5 0 1 0 5 0 a2.5 3.5 0 1 0 -5 0z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 9.5 13.5
                moveTo(x = 9.5f, y = 13.5f)
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
            // M21.5 13.5 a2.5 3.5 0 1 0 5 0 a2.5 3.5 0 1 0 -5 0z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 21.5 13.5
                moveTo(x = 21.5f, y = 13.5f)
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
            // M27.335 22.629 c-0.178 -0.161 -0.444 -0.171 -0.635 -0.029 -0.039 0.029 -3.922 2.9 -8.7 2.9 -4.766 0 -8.662 -2.871 -8.7 -2.9 -0.191 -0.142 -0.457 -0.13 -0.635 0.029 -0.177 0.16 -0.217 0.424 -0.094 0.628 C8.7 23.472 11.788 28.5 18 28.5 s9.301 -5.028 9.429 -5.243 c0.123 -0.205 0.084 -0.468 -0.094 -0.628z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 27.335 22.629
                moveTo(x = 27.335f, y = 22.629f)
                // c -0.178 -0.161 -0.444 -0.171 -0.635 -0.029
                curveToRelative(
                    dx1 = -0.178f,
                    dy1 = -0.161f,
                    dx2 = -0.444f,
                    dy2 = -0.171f,
                    dx3 = -0.635f,
                    dy3 = -0.029f,
                )
                // c -0.039 0.029 -3.922 2.9 -8.7 2.9
                curveToRelative(
                    dx1 = -0.039f,
                    dy1 = 0.029f,
                    dx2 = -3.922f,
                    dy2 = 2.9f,
                    dx3 = -8.7f,
                    dy3 = 2.9f,
                )
                // c -4.766 0 -8.662 -2.871 -8.7 -2.9
                curveToRelative(
                    dx1 = -4.766f,
                    dy1 = 0.0f,
                    dx2 = -8.662f,
                    dy2 = -2.871f,
                    dx3 = -8.7f,
                    dy3 = -2.9f,
                )
                // c -0.191 -0.142 -0.457 -0.13 -0.635 0.029
                curveToRelative(
                    dx1 = -0.191f,
                    dy1 = -0.142f,
                    dx2 = -0.457f,
                    dy2 = -0.13f,
                    dx3 = -0.635f,
                    dy3 = 0.029f,
                )
                // c -0.177 0.16 -0.217 0.424 -0.094 0.628
                curveToRelative(
                    dx1 = -0.177f,
                    dy1 = 0.16f,
                    dx2 = -0.217f,
                    dy2 = 0.424f,
                    dx3 = -0.094f,
                    dy3 = 0.628f,
                )
                // C 8.7 23.472 11.788 28.5 18 28.5
                curveTo(
                    x1 = 8.7f,
                    y1 = 23.472f,
                    x2 = 11.788f,
                    y2 = 28.5f,
                    x3 = 18.0f,
                    y3 = 28.5f,
                )
                // s 9.301 -5.028 9.429 -5.243
                reflectiveCurveToRelative(
                    dx1 = 9.301f,
                    dy1 = -5.028f,
                    dx2 = 9.429f,
                    dy2 = -5.243f,
                )
                // c 0.123 -0.205 0.084 -0.468 -0.094 -0.628z
                curveToRelative(
                    dx1 = 0.123f,
                    dy1 = -0.205f,
                    dx2 = 0.084f,
                    dy2 = -0.468f,
                    dx3 = -0.094f,
                    dy3 = -0.628f,
                )
                close()
            }
            // M29.5 27.5 c0 2.762 -2.238 5 -5 5 s-5 -2.238 -5 -5 4 -10 5 -10 5 7.238 5 10z
            path(
                fill = SolidColor(Color(0xFF5DADEC)),
            ) {
                // M 29.5 27.5
                moveTo(x = 29.5f, y = 27.5f)
                // c 0 2.762 -2.238 5 -5 5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.762f,
                    dx2 = -2.238f,
                    dy2 = 5.0f,
                    dx3 = -5.0f,
                    dy3 = 5.0f,
                )
                // s -5 -2.238 -5 -5
                reflectiveCurveToRelative(
                    dx1 = -5.0f,
                    dy1 = -2.238f,
                    dx2 = -5.0f,
                    dy2 = -5.0f,
                )
                // s 4 -10 5 -10
                reflectiveCurveToRelative(
                    dx1 = 4.0f,
                    dy1 = -10.0f,
                    dx2 = 5.0f,
                    dy2 = -10.0f,
                )
                // s 5 7.238 5 10z
                reflectiveCurveToRelative(
                    dx1 = 5.0f,
                    dy1 = 7.238f,
                    dx2 = 5.0f,
                    dy2 = 10.0f,
                )
                close()
            }
        }.build().also { _emoji1f972 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f972: ImageVector? = null
