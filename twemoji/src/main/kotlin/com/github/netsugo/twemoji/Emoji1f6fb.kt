package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f6fb: ImageVector
    get() {
        val current = _emoji1f6fb
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f6fb",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M33 31 c1 0 1 -1 1 -4 0 -0.692 0 -3.862 -0.041 -5.138 C33.939 21.258 33.149 20 32 20 H20 v-6 c0 -1.058 -0.235 -2 -2 -2 h-5 c-3 0 -6 8 -6 8 s-6 0 -6 3 v4 s-1 0.338 -1 1.957 S1 31 2 31 h31z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 33 31
                moveTo(x = 33.0f, y = 31.0f)
                // c 1 0 1 -1 1 -4
                curveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -4.0f,
                )
                // c 0 -0.692 0 -3.862 -0.041 -5.138
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.692f,
                    dx2 = 0.0f,
                    dy2 = -3.862f,
                    dx3 = -0.041f,
                    dy3 = -5.138f,
                )
                // C 33.939 21.258 33.149 20 32 20
                curveTo(
                    x1 = 33.939f,
                    y1 = 21.258f,
                    x2 = 33.149f,
                    y2 = 20.0f,
                    x3 = 32.0f,
                    y3 = 20.0f,
                )
                // H 20
                horizontalLineTo(x = 20.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // c 0 -1.058 -0.235 -2 -2 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.058f,
                    dx2 = -0.235f,
                    dy2 = -2.0f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // c -3 0 -6 8 -6 8
                curveToRelative(
                    dx1 = -3.0f,
                    dy1 = 0.0f,
                    dx2 = -6.0f,
                    dy2 = 8.0f,
                    dx3 = -6.0f,
                    dy3 = 8.0f,
                )
                // s -6 0 -6 3
                reflectiveCurveToRelative(
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                    dx2 = -6.0f,
                    dy2 = 3.0f,
                )
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // s -1 0.338 -1 1.957
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.338f,
                    dx2 = -1.0f,
                    dy2 = 1.957f,
                )
                // S 1 31 2 31
                reflectiveCurveTo(
                    x1 = 1.0f,
                    y1 = 31.0f,
                    x2 = 2.0f,
                    y2 = 31.0f,
                )
                // h 31z
                horizontalLineToRelative(dx = 31.0f)
                close()
            }
            // M9 31 m-4 0 a4 4 0 1 1 8 0 a4 4 0 1 1 -8 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 9 31
                moveTo(x = 9.0f, y = 31.0f)
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
            // M9 31 m-2 0 a2 2 0 1 1 4 0 a2 2 0 1 1 -4 0
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 9 31
                moveTo(x = 9.0f, y = 31.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
            }
            // M27 31 m-4 0 a4 4 0 1 1 8 0 a4 4 0 1 1 -8 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 27 31
                moveTo(x = 27.0f, y = 31.0f)
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
            // M27 31 m-2 0 a2 2 0 1 1 4 0 a2 2 0 1 1 -4 0
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 27 31
                moveTo(x = 27.0f, y = 31.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
            }
            // M10 19 c0 1 0.448 1 1 1 h5 c0.553 0 1 -0.448 1 -1 v-4 c0 -0.552 -0.447 -1 -1 -1 h-3 c-1 0 -3 4 -3 5z
            path(
                fill = SolidColor(Color(0xFFBBDDF5)),
            ) {
                // M 10 19
                moveTo(x = 10.0f, y = 19.0f)
                // c 0 1 0.448 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.0f,
                    dx2 = 0.448f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // c 0.553 0 1 -0.448 1 -1
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -0.448f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // c 0 -0.552 -0.447 -1 -1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = -0.447f,
                    dy2 = -1.0f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // c -1 0 -3 4 -3 5z
                curveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                    dx2 = -3.0f,
                    dy2 = 4.0f,
                    dx3 = -3.0f,
                    dy3 = 5.0f,
                )
                close()
            }
            // M36 21.5 c0 0.828 -0.672 1.5 -1.5 1.5 H20 v-3 h14.5 c0.828 0 1.5 0.671 1.5 1.5z
            path(
                fill = SolidColor(Color(0xFFF492A9)),
            ) {
                // M 36 21.5
                moveTo(x = 36.0f, y = 21.5f)
                // c 0 0.828 -0.672 1.5 -1.5 1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.828f,
                    dx2 = -0.672f,
                    dy2 = 1.5f,
                    dx3 = -1.5f,
                    dy3 = 1.5f,
                )
                // H 20
                horizontalLineTo(x = 20.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // h 14.5
                horizontalLineToRelative(dx = 14.5f)
                // c 0.828 0 1.5 0.671 1.5 1.5z
                curveToRelative(
                    dx1 = 0.828f,
                    dy1 = 0.0f,
                    dx2 = 1.5f,
                    dy2 = 0.671f,
                    dx3 = 1.5f,
                    dy3 = 1.5f,
                )
                close()
            }
            // M1 23 h1 v5 H1z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 1 23
                moveTo(x = 1.0f, y = 23.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // H 1z
                horizontalLineTo(x = 1.0f)
                close()
            }
            // M2 31 L1 31 c-0.55 0 -1 -0.45 -1 -1 v-2 c0 -0.55 0.45 -1 1 -1 h1 c0.55 0 1 0.45 1 1 v2 c0 0.55 -0.45 1 -1 1z M34 31 h-1 c-0.55 0 -1 -0.45 -1 -1 v-2 c0 -0.55 0.45 -1 1 -1 h1 c0.55 0 1 0.45 1 1 v2 c0 0.55 -0.45 1 -1 1z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 2 31
                moveTo(x = 2.0f, y = 31.0f)
                // L 1 31
                lineTo(x = 1.0f, y = 31.0f)
                // c -0.55 0 -1 -0.45 -1 -1
                curveToRelative(
                    dx1 = -0.55f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.45f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // c 0 -0.55 0.45 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.55f,
                    dx2 = 0.45f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // c 0.55 0 1 0.45 1 1
                curveToRelative(
                    dx1 = 0.55f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.45f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // c 0 0.55 -0.45 1 -1 1z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.55f,
                    dx2 = -0.45f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                close()
                // M 34 31
                moveTo(x = 34.0f, y = 31.0f)
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // c -0.55 0 -1 -0.45 -1 -1
                curveToRelative(
                    dx1 = -0.55f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.45f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // c 0 -0.55 0.45 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.55f,
                    dx2 = 0.45f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // c 0.55 0 1 0.45 1 1
                curveToRelative(
                    dx1 = 0.55f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.45f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // c 0 0.55 -0.45 1 -1 1z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.55f,
                    dx2 = -0.45f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                close()
            }
        }.build().also { _emoji1f6fb = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f6fb: ImageVector? = null
