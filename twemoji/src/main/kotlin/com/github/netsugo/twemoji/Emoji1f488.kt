package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f488: ImageVector
    get() {
        val current = _emoji1f488
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f488",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M18 6 m-6 0 a6 6 0 1 1 12 0 a6 6 0 1 1 -12 0
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 18 6
                moveTo(x = 18.0f, y = 6.0f)
                // m -6 0
                moveToRelative(dx = -6.0f, dy = 0.0f)
                // a 6 6 0 1 1 12 0
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 12.0f,
                    dy1 = 0.0f,
                )
                // a 6 6 0 1 1 -12 0
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -12.0f,
                    dy1 = 0.0f,
                )
            }
            // M11 12 h14 v21 H11z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 11 12
                moveTo(x = 11.0f, y = 12.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // v 21
                verticalLineToRelative(dy = 21.0f)
                // H 11z
                horizontalLineTo(x = 11.0f)
                close()
            }
            // M11 28.487 L20.251 33 H25 v-2.134 l-14 -6.83z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 11 28.487
                moveTo(x = 11.0f, y = 28.487f)
                // L 20.251 33
                lineTo(x = 20.251f, y = 33.0f)
                // H 25
                horizontalLineTo(x = 25.0f)
                // v -2.134
                verticalLineToRelative(dy = -2.134f)
                // l -14 -6.83z
                lineToRelative(dx = -14.0f, dy = -6.83f)
                close()
            }
            // M11 19.585 l14 6.83 v-4.45 l-14 -6.831z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 11 19.585
                moveTo(x = 11.0f, y = 19.585f)
                // l 14 6.83
                lineToRelative(dx = 14.0f, dy = 6.83f)
                // v -4.45
                verticalLineToRelative(dy = -4.45f)
                // l -14 -6.831z
                lineToRelative(dx = -14.0f, dy = -6.831f)
                close()
            }
            // M13.697 12 L25 17.514 V12z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 13.697 12
                moveTo(x = 13.697f, y = 12.0f)
                // L 25 17.514
                lineTo(x = 25.0f, y = 17.514f)
                // V 12z
                verticalLineTo(y = 12.0f)
                close()
            }
            // M27 11 c0 1.104 -0.896 2 -2 2 L11 13 c-1.104 0 -2 -0.896 -2 -2 s0.896 -2 2 -2 h14 c1.104 0 2 0.896 2 2z M27 34 c0 1.104 -0.896 2 -2 2 L11 36 c-1.104 0 -2 -0.896 -2 -2 s0.896 -2 2 -2 h14 c1.104 0 2 0.896 2 2z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 27 11
                moveTo(x = 27.0f, y = 11.0f)
                // c 0 1.104 -0.896 2 -2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = -0.896f,
                    dy2 = 2.0f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // L 11 13
                lineTo(x = 11.0f, y = 13.0f)
                // c -1.104 0 -2 -0.896 -2 -2
                curveToRelative(
                    dx1 = -1.104f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -0.896f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // s 0.896 -2 2 -2
                reflectiveCurveToRelative(
                    dx1 = 0.896f,
                    dy1 = -2.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // c 1.104 0 2 0.896 2 2z
                curveToRelative(
                    dx1 = 1.104f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 0.896f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                close()
                // M 27 34
                moveTo(x = 27.0f, y = 34.0f)
                // c 0 1.104 -0.896 2 -2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = -0.896f,
                    dy2 = 2.0f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // L 11 36
                lineTo(x = 11.0f, y = 36.0f)
                // c -1.104 0 -2 -0.896 -2 -2
                curveToRelative(
                    dx1 = -1.104f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -0.896f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // s 0.896 -2 2 -2
                reflectiveCurveToRelative(
                    dx1 = 0.896f,
                    dy1 = -2.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // c 1.104 0 2 0.896 2 2z
                curveToRelative(
                    dx1 = 1.104f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 0.896f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                close()
            }
        }.build().also { _emoji1f488 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f488: ImageVector? = null
