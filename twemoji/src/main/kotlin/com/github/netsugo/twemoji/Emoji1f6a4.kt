package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f6a4: ImageVector
    get() {
        val current = _emoji1f6a4
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f6a4",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M33 27 h-2 l1 -8 h2z
            path(
                fill = SolidColor(Color(0xFF5C913B)),
            ) {
                // M 33 27
                moveTo(x = 33.0f, y = 27.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // l 1 -8
                lineToRelative(dx = 1.0f, dy = -8.0f)
                // h 2z
                horizontalLineToRelative(dx = 2.0f)
                close()
            }
            // M1 14 c9.055 0.053 11 1 17 2 2.959 0.493 7 1 11 1 2 0 4 1 4 4 0 2 0.534 3.187 -5.433 3.815 C23.59 25.233 13 23 9 21 c-6 -3 -9 -7.005 -8 -7z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 1 14
                moveTo(x = 1.0f, y = 14.0f)
                // c 9.055 0.053 11 1 17 2
                curveToRelative(
                    dx1 = 9.055f,
                    dy1 = 0.053f,
                    dx2 = 11.0f,
                    dy2 = 1.0f,
                    dx3 = 17.0f,
                    dy3 = 2.0f,
                )
                // c 2.959 0.493 7 1 11 1
                curveToRelative(
                    dx1 = 2.959f,
                    dy1 = 0.493f,
                    dx2 = 7.0f,
                    dy2 = 1.0f,
                    dx3 = 11.0f,
                    dy3 = 1.0f,
                )
                // c 2 0 4 1 4 4
                curveToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = 1.0f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // c 0 2 0.534 3.187 -5.433 3.815
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                    dx2 = 0.534f,
                    dy2 = 3.187f,
                    dx3 = -5.433f,
                    dy3 = 3.815f,
                )
                // C 23.59 25.233 13 23 9 21
                curveTo(
                    x1 = 23.59f,
                    y1 = 25.233f,
                    x2 = 13.0f,
                    y2 = 23.0f,
                    x3 = 9.0f,
                    y3 = 21.0f,
                )
                // c -6 -3 -9 -7.005 -8 -7z
                curveToRelative(
                    dx1 = -6.0f,
                    dy1 = -3.0f,
                    dx2 = -9.0f,
                    dy2 = -7.005f,
                    dx3 = -8.0f,
                    dy3 = -7.0f,
                )
                close()
            }
            // M0 24 h36 v12 H0z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 0 24
                moveTo(x = 0.0f, y = 24.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // H 0z
                horizontalLineTo(x = 0.0f)
                close()
            }
            // M5 13 c4 0 11 0 18 1 s10 1 10 3 v3 c0 1.414 -6.869 0.447 -10 0 -7 -1 -14 -3 -18 -4 -4.047 -1.011 -7 -3 0 -3z
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 5 13
                moveTo(x = 5.0f, y = 13.0f)
                // c 4 0 11 0 18 1
                curveToRelative(
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                    dx2 = 11.0f,
                    dy2 = 0.0f,
                    dx3 = 18.0f,
                    dy3 = 1.0f,
                )
                // s 10 1 10 3
                reflectiveCurveToRelative(
                    dx1 = 10.0f,
                    dy1 = 1.0f,
                    dx2 = 10.0f,
                    dy2 = 3.0f,
                )
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // c 0 1.414 -6.869 0.447 -10 0
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.414f,
                    dx2 = -6.869f,
                    dy2 = 0.447f,
                    dx3 = -10.0f,
                    dy3 = 0.0f,
                )
                // c -7 -1 -14 -3 -18 -4
                curveToRelative(
                    dx1 = -7.0f,
                    dy1 = -1.0f,
                    dx2 = -14.0f,
                    dy2 = -3.0f,
                    dx3 = -18.0f,
                    dy3 = -4.0f,
                )
                // c -4.047 -1.011 -7 -3 0 -3z
                curveToRelative(
                    dx1 = -4.047f,
                    dy1 = -1.011f,
                    dx2 = -7.0f,
                    dy2 = -3.0f,
                    dx3 = 0.0f,
                    dy3 = -3.0f,
                )
                close()
            }
            // M30.592 24.322 c2.122 -0.539 2.403 -1.307 2.418 -2.361 -1.263 0.619 -3.699 0.32 -5.886 0.047 -7.96 -0.995 -16.481 -2.935 -24.722 -5.608 1.043 1.04 2.584 2.29 4.568 3.483 6.706 1.901 13.484 3.307 19.905 4.109 1.259 0.157 2.53 0.312 3.717 0.33z
            path(
                fill = SolidColor(Color(0xFFA0041E)),
            ) {
                // M 30.592 24.322
                moveTo(x = 30.592f, y = 24.322f)
                // c 2.122 -0.539 2.403 -1.307 2.418 -2.361
                curveToRelative(
                    dx1 = 2.122f,
                    dy1 = -0.539f,
                    dx2 = 2.403f,
                    dy2 = -1.307f,
                    dx3 = 2.418f,
                    dy3 = -2.361f,
                )
                // c -1.263 0.619 -3.699 0.32 -5.886 0.047
                curveToRelative(
                    dx1 = -1.263f,
                    dy1 = 0.619f,
                    dx2 = -3.699f,
                    dy2 = 0.32f,
                    dx3 = -5.886f,
                    dy3 = 0.047f,
                )
                // c -7.96 -0.995 -16.481 -2.935 -24.722 -5.608
                curveToRelative(
                    dx1 = -7.96f,
                    dy1 = -0.995f,
                    dx2 = -16.481f,
                    dy2 = -2.935f,
                    dx3 = -24.722f,
                    dy3 = -5.608f,
                )
                // c 1.043 1.04 2.584 2.29 4.568 3.483
                curveToRelative(
                    dx1 = 1.043f,
                    dy1 = 1.04f,
                    dx2 = 2.584f,
                    dy2 = 2.29f,
                    dx3 = 4.568f,
                    dy3 = 3.483f,
                )
                // c 6.706 1.901 13.484 3.307 19.905 4.109
                curveToRelative(
                    dx1 = 6.706f,
                    dy1 = 1.901f,
                    dx2 = 13.484f,
                    dy2 = 3.307f,
                    dx3 = 19.905f,
                    dy3 = 4.109f,
                )
                // c 1.259 0.157 2.53 0.312 3.717 0.33z
                curveToRelative(
                    dx1 = 1.259f,
                    dy1 = 0.157f,
                    dx2 = 2.53f,
                    dy2 = 0.312f,
                    dx3 = 3.717f,
                    dy3 = 0.33f,
                )
                close()
            }
            // M12 24 c3 -2 7 -5 6 -3 s-1.001 3 1 2 c2 -1 5 -2 4 0 s2 1 3 0 4 0 3 1 -9 2 -12 2 -5 -2 -5 -2z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 12 24
                moveTo(x = 12.0f, y = 24.0f)
                // c 3 -2 7 -5 6 -3
                curveToRelative(
                    dx1 = 3.0f,
                    dy1 = -2.0f,
                    dx2 = 7.0f,
                    dy2 = -5.0f,
                    dx3 = 6.0f,
                    dy3 = -3.0f,
                )
                // s -1.001 3 1 2
                reflectiveCurveToRelative(
                    dx1 = -1.001f,
                    dy1 = 3.0f,
                    dx2 = 1.0f,
                    dy2 = 2.0f,
                )
                // c 2 -1 5 -2 4 0
                curveToRelative(
                    dx1 = 2.0f,
                    dy1 = -1.0f,
                    dx2 = 5.0f,
                    dy2 = -2.0f,
                    dx3 = 4.0f,
                    dy3 = 0.0f,
                )
                // s 2 1 3 0
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 1.0f,
                    dx2 = 3.0f,
                    dy2 = 0.0f,
                )
                // s 4 0 3 1
                reflectiveCurveToRelative(
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                    dx2 = 3.0f,
                    dy2 = 1.0f,
                )
                // s -9 2 -12 2
                reflectiveCurveToRelative(
                    dx1 = -9.0f,
                    dy1 = 2.0f,
                    dx2 = -12.0f,
                    dy2 = 2.0f,
                )
                // s -5 -2 -5 -2z
                reflectiveCurveToRelative(
                    dx1 = -5.0f,
                    dy1 = -2.0f,
                    dx2 = -5.0f,
                    dy2 = -2.0f,
                )
                close()
            }
            // M34 16 h-1 c-1.104 0 -2 0.896 -2 2 h1 c0.553 0 1 0.447 1 1 v1 h1 c1.104 0 2 0.104 2 -1 s-0.896 -3 -2 -3z
            path(
                fill = SolidColor(Color(0xFF5C913B)),
            ) {
                // M 34 16
                moveTo(x = 34.0f, y = 16.0f)
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // c -1.104 0 -2 0.896 -2 2
                curveToRelative(
                    dx1 = -1.104f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = 0.896f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // c 0.553 0 1 0.447 1 1
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.447f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // c 1.104 0 2 0.104 2 -1
                curveToRelative(
                    dx1 = 1.104f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 0.104f,
                    dx3 = 2.0f,
                    dy3 = -1.0f,
                )
                // s -0.896 -3 -2 -3z
                reflectiveCurveToRelative(
                    dx1 = -0.896f,
                    dy1 = -3.0f,
                    dx2 = -2.0f,
                    dy2 = -3.0f,
                )
                close()
            }
            // M30 16 c0.97 0.243 0 2 -1 3 s-10 -1 -10 -1 l2 -3 s5 0 9 1z
            path(
                fill = SolidColor(Color(0xFFC1694F)),
            ) {
                // M 30 16
                moveTo(x = 30.0f, y = 16.0f)
                // c 0.97 0.243 0 2 -1 3
                curveToRelative(
                    dx1 = 0.97f,
                    dy1 = 0.243f,
                    dx2 = 0.0f,
                    dy2 = 2.0f,
                    dx3 = -1.0f,
                    dy3 = 3.0f,
                )
                // s -10 -1 -10 -1
                reflectiveCurveToRelative(
                    dx1 = -10.0f,
                    dy1 = -1.0f,
                    dx2 = -10.0f,
                    dy2 = -1.0f,
                )
                // l 2 -3
                lineToRelative(dx = 2.0f, dy = -3.0f)
                // s 5 0 9 1z
                reflectiveCurveToRelative(
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                    dx2 = 9.0f,
                    dy2 = 1.0f,
                )
                close()
            }
            // M29 19 c0.328 -0.328 0.645 -0.737 0.899 -1.147 -1.475 -0.764 -3.63 -1.385 -6.079 -1.664 -1.249 -0.142 -2.441 -0.178 -3.527 -0.128 L19 18 s9 2 10 1z
            path(
                fill = SolidColor(Color(0xFFA0041E)),
            ) {
                // M 29 19
                moveTo(x = 29.0f, y = 19.0f)
                // c 0.328 -0.328 0.645 -0.737 0.899 -1.147
                curveToRelative(
                    dx1 = 0.328f,
                    dy1 = -0.328f,
                    dx2 = 0.645f,
                    dy2 = -0.737f,
                    dx3 = 0.899f,
                    dy3 = -1.147f,
                )
                // c -1.475 -0.764 -3.63 -1.385 -6.079 -1.664
                curveToRelative(
                    dx1 = -1.475f,
                    dy1 = -0.764f,
                    dx2 = -3.63f,
                    dy2 = -1.385f,
                    dx3 = -6.079f,
                    dy3 = -1.664f,
                )
                // c -1.249 -0.142 -2.441 -0.178 -3.527 -0.128
                curveToRelative(
                    dx1 = -1.249f,
                    dy1 = -0.142f,
                    dx2 = -2.441f,
                    dy2 = -0.178f,
                    dx3 = -3.527f,
                    dy3 = -0.128f,
                )
                // L 19 18
                lineTo(x = 19.0f, y = 18.0f)
                // s 9 2 10 1z
                reflectiveCurveToRelative(
                    dx1 = 9.0f,
                    dy1 = 2.0f,
                    dx2 = 10.0f,
                    dy2 = 1.0f,
                )
                close()
            }
            // M21 15 v-1 l-4 1 -2 2 4 1z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 21 15
                moveTo(x = 21.0f, y = 15.0f)
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // l -4 1
                lineToRelative(dx = -4.0f, dy = 1.0f)
                // l -2 2
                lineToRelative(dx = -2.0f, dy = 2.0f)
                // l 4 1z
                lineToRelative(dx = 4.0f, dy = 1.0f)
                close()
            }
            // M23 14 c-0.553 0 -1 1.343 -1 3 0 0.612 0.062 1.181 0.167 1.656 0.502 0.127 1.035 0.221 1.592 0.278 0.148 -0.524 0.241 -1.193 0.241 -1.934 0 -1.656 -0.447 -3 -1 -3z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 23 14
                moveTo(x = 23.0f, y = 14.0f)
                // c -0.553 0 -1 1.343 -1 3
                curveToRelative(
                    dx1 = -0.553f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = 1.343f,
                    dx3 = -1.0f,
                    dy3 = 3.0f,
                )
                // c 0 0.612 0.062 1.181 0.167 1.656
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.612f,
                    dx2 = 0.062f,
                    dy2 = 1.181f,
                    dx3 = 0.167f,
                    dy3 = 1.656f,
                )
                // c 0.502 0.127 1.035 0.221 1.592 0.278
                curveToRelative(
                    dx1 = 0.502f,
                    dy1 = 0.127f,
                    dx2 = 1.035f,
                    dy2 = 0.221f,
                    dx3 = 1.592f,
                    dy3 = 0.278f,
                )
                // c 0.148 -0.524 0.241 -1.193 0.241 -1.934
                curveToRelative(
                    dx1 = 0.148f,
                    dy1 = -0.524f,
                    dx2 = 0.241f,
                    dy2 = -1.193f,
                    dx3 = 0.241f,
                    dy3 = -1.934f,
                )
                // c 0 -1.656 -0.447 -3 -1 -3z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.656f,
                    dx2 = -0.447f,
                    dy2 = -3.0f,
                    dx3 = -1.0f,
                    dy3 = -3.0f,
                )
                close()
            }
        }.build().also { _emoji1f6a4 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f6a4: ImageVector? = null
