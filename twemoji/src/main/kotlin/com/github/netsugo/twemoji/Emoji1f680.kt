package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f680: ImageVector
    get() {
        val current = _emoji1f680
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f680",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M1 17 l8 -7 16 1 1 16 -7 8 s0.001 -5.999 -6 -12 -12 -6 -12 -6z
            path(
                fill = SolidColor(Color(0xFFA0041E)),
            ) {
                // M 1 17
                moveTo(x = 1.0f, y = 17.0f)
                // l 8 -7
                lineToRelative(dx = 8.0f, dy = -7.0f)
                // l 16 1
                lineToRelative(dx = 16.0f, dy = 1.0f)
                // l 1 16
                lineToRelative(dx = 1.0f, dy = 16.0f)
                // l -7 8
                lineToRelative(dx = -7.0f, dy = 8.0f)
                // s 0.001 -5.999 -6 -12
                reflectiveCurveToRelative(
                    dx1 = 0.001f,
                    dy1 = -5.999f,
                    dx2 = -6.0f,
                    dy2 = -12.0f,
                )
                // s -12 -6 -12 -6z
                reflectiveCurveToRelative(
                    dx1 = -12.0f,
                    dy1 = -6.0f,
                    dx2 = -12.0f,
                    dy2 = -6.0f,
                )
                close()
            }
            // M0.973 35 s-0.036 -7.979 2.985 -11 S15 21.187 15 21.187 14.999 29 11.999 32 c-3 3 -11.026 3 -11.026 3z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 0.973 35
                moveTo(x = 0.973f, y = 35.0f)
                // s -0.036 -7.979 2.985 -11
                reflectiveCurveToRelative(
                    dx1 = -0.036f,
                    dy1 = -7.979f,
                    dx2 = 2.985f,
                    dy2 = -11.0f,
                )
                // S 15 21.187 15 21.187
                reflectiveCurveTo(
                    x1 = 15.0f,
                    y1 = 21.187f,
                    x2 = 15.0f,
                    y2 = 21.187f,
                )
                // S 14.999 29 11.999 32
                reflectiveCurveTo(
                    x1 = 14.999f,
                    y1 = 29.0f,
                    x2 = 11.999f,
                    y2 = 32.0f,
                )
                // c -3 3 -11.026 3 -11.026 3z
                curveToRelative(
                    dx1 = -3.0f,
                    dy1 = 3.0f,
                    dx2 = -11.026f,
                    dy2 = 3.0f,
                    dx3 = -11.026f,
                    dy3 = 3.0f,
                )
                close()
            }
            // M8.999 27 m-4 0 a4 4 0 1 1 8 0 a4 4 0 1 1 -8 0
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 8.999 27
                moveTo(x = 8.999f, y = 27.0f)
                // m -4 0
                moveToRelative(dx = -4.0f, dy = 0.0f)
                // a 4 4 0 1 1 8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 8.0f,
                    dy1 = 0.0f,
                )
                // a 4 4 0 1 1 -8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -8.0f,
                    dy1 = 0.0f,
                )
            }
            // M35.999 0 s-10 0 -22 10 c-6 5 -6 14 -4 16 s11 2 16 -4 c10 -12 10 -22 10 -22z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 35.999 0
                moveTo(x = 35.999f, y = 0.0f)
                // s -10 0 -22 10
                reflectiveCurveToRelative(
                    dx1 = -10.0f,
                    dy1 = 0.0f,
                    dx2 = -22.0f,
                    dy2 = 10.0f,
                )
                // c -6 5 -6 14 -4 16
                curveToRelative(
                    dx1 = -6.0f,
                    dy1 = 5.0f,
                    dx2 = -6.0f,
                    dy2 = 14.0f,
                    dx3 = -4.0f,
                    dy3 = 16.0f,
                )
                // s 11 2 16 -4
                reflectiveCurveToRelative(
                    dx1 = 11.0f,
                    dy1 = 2.0f,
                    dx2 = 16.0f,
                    dy2 = -4.0f,
                )
                // c 10 -12 10 -22 10 -22z
                curveToRelative(
                    dx1 = 10.0f,
                    dy1 = -12.0f,
                    dx2 = 10.0f,
                    dy2 = -22.0f,
                    dx3 = 10.0f,
                    dy3 = -22.0f,
                )
                close()
            }
            // M26.999 5 c-1.623 0 -3.013 0.971 -3.641 2.36 0.502 -0.227 1.055 -0.36 1.641 -0.36 2.209 0 4 1.791 4 4 0 0.586 -0.133 1.139 -0.359 1.64 1.389 -0.627 2.359 -2.017 2.359 -3.64 0 -2.209 -1.791 -4 -4 -4z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26.999 5
                moveTo(x = 26.999f, y = 5.0f)
                // c -1.623 0 -3.013 0.971 -3.641 2.36
                curveToRelative(
                    dx1 = -1.623f,
                    dy1 = 0.0f,
                    dx2 = -3.013f,
                    dy2 = 0.971f,
                    dx3 = -3.641f,
                    dy3 = 2.36f,
                )
                // c 0.502 -0.227 1.055 -0.36 1.641 -0.36
                curveToRelative(
                    dx1 = 0.502f,
                    dy1 = -0.227f,
                    dx2 = 1.055f,
                    dy2 = -0.36f,
                    dx3 = 1.641f,
                    dy3 = -0.36f,
                )
                // c 2.209 0 4 1.791 4 4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = 1.791f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // c 0 0.586 -0.133 1.139 -0.359 1.64
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.586f,
                    dx2 = -0.133f,
                    dy2 = 1.139f,
                    dx3 = -0.359f,
                    dy3 = 1.64f,
                )
                // c 1.389 -0.627 2.359 -2.017 2.359 -3.64
                curveToRelative(
                    dx1 = 1.389f,
                    dy1 = -0.627f,
                    dx2 = 2.359f,
                    dy2 = -2.017f,
                    dx3 = 2.359f,
                    dy3 = -3.64f,
                )
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
            // M8 28 s0 -4 1 -5 13.001 -10.999 14 -10 -9.001 13 -10.001 14 S8 28 8 28z
            path(
                fill = SolidColor(Color(0xFFA0041E)),
            ) {
                // M 8 28
                moveTo(x = 8.0f, y = 28.0f)
                // s 0 -4 1 -5
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.0f,
                    dx2 = 1.0f,
                    dy2 = -5.0f,
                )
                // s 13.001 -10.999 14 -10
                reflectiveCurveToRelative(
                    dx1 = 13.001f,
                    dy1 = -10.999f,
                    dx2 = 14.0f,
                    dy2 = -10.0f,
                )
                // s -9.001 13 -10.001 14
                reflectiveCurveToRelative(
                    dx1 = -9.001f,
                    dy1 = 13.0f,
                    dx2 = -10.001f,
                    dy2 = 14.0f,
                )
                // S 8 28 8 28z
                reflectiveCurveTo(
                    x1 = 8.0f,
                    y1 = 28.0f,
                    x2 = 8.0f,
                    y2 = 28.0f,
                )
                close()
            }
        }.build().also { _emoji1f680 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f680: ImageVector? = null
