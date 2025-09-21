package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f3ce: ImageVector
    get() {
        val current = _emoji1f3ce
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f3ce",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M30 23 h3 l2 -6 h-3z
            path(
                fill = SolidColor(Color(0xFF414042)),
            ) {
                // M 30 23
                moveTo(x = 30.0f, y = 23.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // l 2 -6
                lineToRelative(dx = 2.0f, dy = -6.0f)
                // h -3z
                horizontalLineToRelative(dx = -3.0f)
                close()
            }
            // M29 19 s-3 -4 -4 -4 h-9 l-6 5 -6.081 1.77 c-0.62 0.217 -1.45 0.636 -1.56 1.23 L0 33 c-0.125 0.646 0.448 1 1 1 h34 c0.553 0 1 -0.447 1 -1 V21 c0 -2 -7 -2 -7 -2z
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 29 19
                moveTo(x = 29.0f, y = 19.0f)
                // s -3 -4 -4 -4
                reflectiveCurveToRelative(
                    dx1 = -3.0f,
                    dy1 = -4.0f,
                    dx2 = -4.0f,
                    dy2 = -4.0f,
                )
                // h -9
                horizontalLineToRelative(dx = -9.0f)
                // l -6 5
                lineToRelative(dx = -6.0f, dy = 5.0f)
                // l -6.081 1.77
                lineToRelative(dx = -6.081f, dy = 1.77f)
                // c -0.62 0.217 -1.45 0.636 -1.56 1.23
                curveToRelative(
                    dx1 = -0.62f,
                    dy1 = 0.217f,
                    dx2 = -1.45f,
                    dy2 = 0.636f,
                    dx3 = -1.56f,
                    dy3 = 1.23f,
                )
                // L 0 33
                lineTo(x = 0.0f, y = 33.0f)
                // c -0.125 0.646 0.448 1 1 1
                curveToRelative(
                    dx1 = -0.125f,
                    dy1 = 0.646f,
                    dx2 = 0.448f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // h 34
                horizontalLineToRelative(dx = 34.0f)
                // c 0.553 0 1 -0.447 1 -1
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -0.447f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // V 21
                verticalLineTo(y = 21.0f)
                // c 0 -2 -7 -2 -7 -2z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                    dx2 = -7.0f,
                    dy2 = -2.0f,
                    dx3 = -7.0f,
                    dy3 = -2.0f,
                )
                close()
            }
            // M16.094 20 L11 34 h12 l5 -14z
            path(
                fill = SolidColor(Color(0xFF3B88C3)),
            ) {
                // M 16.094 20
                moveTo(x = 16.094f, y = 20.0f)
                // L 11 34
                lineTo(x = 11.0f, y = 34.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // l 5 -14z
                lineToRelative(dx = 5.0f, dy = -14.0f)
                close()
            }
            // M8 31 m-4 0 a4 4 0 1 1 8 0 a4 4 0 1 1 -8 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 8 31
                moveTo(x = 8.0f, y = 31.0f)
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
            // M8 31 m-2 0 a2 2 0 1 1 4 0 a2 2 0 1 1 -4 0
            path(
                fill = SolidColor(Color(0xFF58595B)),
            ) {
                // M 8 31
                moveTo(x = 8.0f, y = 31.0f)
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
            // M29 31 m-4 0 a4 4 0 1 1 8 0 a4 4 0 1 1 -8 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 29 31
                moveTo(x = 29.0f, y = 31.0f)
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
            // M29 31 m-2 0 a2 2 0 1 1 4 0 a2 2 0 1 1 -4 0
            path(
                fill = SolidColor(Color(0xFF58595B)),
            ) {
                // M 29 31
                moveTo(x = 29.0f, y = 31.0f)
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
            // M19.5 26.5 m-3.5 0 a3.5 3.5 0 1 1 7 0 a3.5 3.5 0 1 1 -7 0
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 19.5 26.5
                moveTo(x = 19.5f, y = 26.5f)
                // m -3.5 0
                moveToRelative(dx = -3.5f, dy = 0.0f)
                // a 3.5 3.5 0 1 1 7 0
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 7.0f,
                    dy1 = 0.0f,
                )
                // a 3.5 3.5 0 1 1 -7 0
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -7.0f,
                    dy1 = 0.0f,
                )
            }
            // M21.055 25.242 c0 0.441 -0.19 0.826 -0.574 1.072 0.504 0.23 0.854 0.699 0.854 1.254 0 0.84 -0.769 1.547 -1.764 1.547 -1.037 0 -1.682 -0.764 -1.682 -1.316 0 -0.273 0.287 -0.469 0.539 -0.469 0.477 0 0.364 0.818 1.156 0.818 0.363 0 0.658 -0.279 0.658 -0.65 0 -0.98 -1.191 -0.26 -1.191 -1.086 0 -0.734 0.995 -0.238 0.995 -1.016 0 -0.266 -0.188 -0.469 -0.505 -0.469 -0.665 0 -0.574 0.686 -1.05 0.686 -0.288 0 -0.456 -0.258 -0.456 -0.518 0 -0.547 0.75 -1.135 1.527 -1.135 1.009 0.001 1.493 0.737 1.493 1.282z
            path(
                fill = SolidColor(Color(0xFF231F20)),
            ) {
                // M 21.055 25.242
                moveTo(x = 21.055f, y = 25.242f)
                // c 0 0.441 -0.19 0.826 -0.574 1.072
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.441f,
                    dx2 = -0.19f,
                    dy2 = 0.826f,
                    dx3 = -0.574f,
                    dy3 = 1.072f,
                )
                // c 0.504 0.23 0.854 0.699 0.854 1.254
                curveToRelative(
                    dx1 = 0.504f,
                    dy1 = 0.23f,
                    dx2 = 0.854f,
                    dy2 = 0.699f,
                    dx3 = 0.854f,
                    dy3 = 1.254f,
                )
                // c 0 0.84 -0.769 1.547 -1.764 1.547
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.84f,
                    dx2 = -0.769f,
                    dy2 = 1.547f,
                    dx3 = -1.764f,
                    dy3 = 1.547f,
                )
                // c -1.037 0 -1.682 -0.764 -1.682 -1.316
                curveToRelative(
                    dx1 = -1.037f,
                    dy1 = 0.0f,
                    dx2 = -1.682f,
                    dy2 = -0.764f,
                    dx3 = -1.682f,
                    dy3 = -1.316f,
                )
                // c 0 -0.273 0.287 -0.469 0.539 -0.469
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.273f,
                    dx2 = 0.287f,
                    dy2 = -0.469f,
                    dx3 = 0.539f,
                    dy3 = -0.469f,
                )
                // c 0.477 0 0.364 0.818 1.156 0.818
                curveToRelative(
                    dx1 = 0.477f,
                    dy1 = 0.0f,
                    dx2 = 0.364f,
                    dy2 = 0.818f,
                    dx3 = 1.156f,
                    dy3 = 0.818f,
                )
                // c 0.363 0 0.658 -0.279 0.658 -0.65
                curveToRelative(
                    dx1 = 0.363f,
                    dy1 = 0.0f,
                    dx2 = 0.658f,
                    dy2 = -0.279f,
                    dx3 = 0.658f,
                    dy3 = -0.65f,
                )
                // c 0 -0.98 -1.191 -0.26 -1.191 -1.086
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.98f,
                    dx2 = -1.191f,
                    dy2 = -0.26f,
                    dx3 = -1.191f,
                    dy3 = -1.086f,
                )
                // c 0 -0.734 0.995 -0.238 0.995 -1.016
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.734f,
                    dx2 = 0.995f,
                    dy2 = -0.238f,
                    dx3 = 0.995f,
                    dy3 = -1.016f,
                )
                // c 0 -0.266 -0.188 -0.469 -0.505 -0.469
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.266f,
                    dx2 = -0.188f,
                    dy2 = -0.469f,
                    dx3 = -0.505f,
                    dy3 = -0.469f,
                )
                // c -0.665 0 -0.574 0.686 -1.05 0.686
                curveToRelative(
                    dx1 = -0.665f,
                    dy1 = 0.0f,
                    dx2 = -0.574f,
                    dy2 = 0.686f,
                    dx3 = -1.05f,
                    dy3 = 0.686f,
                )
                // c -0.288 0 -0.456 -0.258 -0.456 -0.518
                curveToRelative(
                    dx1 = -0.288f,
                    dy1 = 0.0f,
                    dx2 = -0.456f,
                    dy2 = -0.258f,
                    dx3 = -0.456f,
                    dy3 = -0.518f,
                )
                // c 0 -0.547 0.75 -1.135 1.527 -1.135
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.547f,
                    dx2 = 0.75f,
                    dy2 = -1.135f,
                    dx3 = 1.527f,
                    dy3 = -1.135f,
                )
                // c 1.009 0.001 1.493 0.737 1.493 1.282z
                curveToRelative(
                    dx1 = 1.009f,
                    dy1 = 0.001f,
                    dx2 = 1.493f,
                    dy2 = 0.737f,
                    dx3 = 1.493f,
                    dy3 = 1.282f,
                )
                close()
            }
            // M30 18 l1 -1 5 -1 v2z
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 30 18
                moveTo(x = 30.0f, y = 18.0f)
                // l 1 -1
                lineToRelative(dx = 1.0f, dy = -1.0f)
                // l 5 -1
                lineToRelative(dx = 5.0f, dy = -1.0f)
                // v 2z
                verticalLineToRelative(dy = 2.0f)
                close()
            }
            // M17 16 h8 v4 H12z
            path(
                fill = SolidColor(Color(0xFF88C9F9)),
            ) {
                // M 17 16
                moveTo(x = 17.0f, y = 16.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // H 12z
                horizontalLineTo(x = 12.0f)
                close()
            }
            // M6 24 c0 0.553 -0.448 1 -1 1 H3 c-0.552 0 -1 -0.447 -1 -1 0 -0.553 0.448 -1 1 -1 h2 c0.552 0 1 0.447 1 1z
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 6 24
                moveTo(x = 6.0f, y = 24.0f)
                // c 0 0.553 -0.448 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.448f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // H 3
                horizontalLineTo(x = 3.0f)
                // c -0.552 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // c 0 -0.553 0.448 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.553f,
                    dx2 = 0.448f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // c 0.552 0 1 0.447 1 1z
                curveToRelative(
                    dx1 = 0.552f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.447f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                close()
            }
            // M36 22 h-1 c-0.553 0 -1 0.447 -1 1 v1 c0 0.553 0.447 1 1 1 h1 v-3z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 36 22
                moveTo(x = 36.0f, y = 22.0f)
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // c -0.553 0 -1 0.447 -1 1
                curveToRelative(
                    dx1 = -0.553f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = 0.447f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // c 0 0.553 0.447 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = 0.447f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // v -3z
                verticalLineToRelative(dy = -3.0f)
                close()
            }
        }.build().also { _emoji1f3ce = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f3ce: ImageVector? = null
