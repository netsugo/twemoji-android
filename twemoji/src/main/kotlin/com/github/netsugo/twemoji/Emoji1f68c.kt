package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f68c: ImageVector
    get() {
        val current = _emoji1f68c
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f68c",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M0 21 v7 c0 1.657 1.343 3 3 3 h30 c1.657 0 3 -1.343 3 -3 v-7 H0z
            path(
                fill = SolidColor(Color(0xFF808285)),
            ) {
                // M 0 21
                moveTo(x = 0.0f, y = 21.0f)
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // c 0 1.657 1.343 3 3 3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.657f,
                    dx2 = 1.343f,
                    dy2 = 3.0f,
                    dx3 = 3.0f,
                    dy3 = 3.0f,
                )
                // h 30
                horizontalLineToRelative(dx = 30.0f)
                // c 1.657 0 3 -1.343 3 -3
                curveToRelative(
                    dx1 = 1.657f,
                    dy1 = 0.0f,
                    dx2 = 3.0f,
                    dy2 = -1.343f,
                    dx3 = 3.0f,
                    dy3 = -3.0f,
                )
                // v -7
                verticalLineToRelative(dy = -7.0f)
                // H 0z
                horizontalLineTo(x = 0.0f)
                close()
            }
            // M36 22 v-9 c0 -1.657 -3.343 -3 -5 -3 H11 c-8 0 -11 2.343 -11 4 v8 h36z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 36 22
                moveTo(x = 36.0f, y = 22.0f)
                // v -9
                verticalLineToRelative(dy = -9.0f)
                // c 0 -1.657 -3.343 -3 -5 -3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.657f,
                    dx2 = -3.343f,
                    dy2 = -3.0f,
                    dx3 = -5.0f,
                    dy3 = -3.0f,
                )
                // H 11
                horizontalLineTo(x = 11.0f)
                // c -8 0 -11 2.343 -11 4
                curveToRelative(
                    dx1 = -8.0f,
                    dy1 = 0.0f,
                    dx2 = -11.0f,
                    dy2 = 2.343f,
                    dx3 = -11.0f,
                    dy3 = 4.0f,
                )
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // h 36z
                horizontalLineToRelative(dx = 36.0f)
                close()
            }
            // M0 22 h36 v3 H0z
            path(
                fill = SolidColor(Color(0xFF939598)),
            ) {
                // M 0 22
                moveTo(x = 0.0f, y = 22.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // H 0z
                horizontalLineTo(x = 0.0f)
                close()
            }
            // M7 25 c-3.063 0 -5.586 2.298 -5.95 5.263 0.526 0.453 1.202 0.737 1.95 0.737 h10 c0 -3.313 -2.686 -6 -6 -6z M34.95 30.263 C34.586 27.298 32.063 25 29 25 c-3.313 0 -6 2.687 -6 6 h10 c0.749 0 1.425 -0.284 1.95 -0.737z
            path(
                fill = SolidColor(Color(0xFFBCBEC0)),
            ) {
                // M 7 25
                moveTo(x = 7.0f, y = 25.0f)
                // c -3.063 0 -5.586 2.298 -5.95 5.263
                curveToRelative(
                    dx1 = -3.063f,
                    dy1 = 0.0f,
                    dx2 = -5.586f,
                    dy2 = 2.298f,
                    dx3 = -5.95f,
                    dy3 = 5.263f,
                )
                // c 0.526 0.453 1.202 0.737 1.95 0.737
                curveToRelative(
                    dx1 = 0.526f,
                    dy1 = 0.453f,
                    dx2 = 1.202f,
                    dy2 = 0.737f,
                    dx3 = 1.95f,
                    dy3 = 0.737f,
                )
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // c 0 -3.313 -2.686 -6 -6 -6z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.313f,
                    dx2 = -2.686f,
                    dy2 = -6.0f,
                    dx3 = -6.0f,
                    dy3 = -6.0f,
                )
                close()
                // M 34.95 30.263
                moveTo(x = 34.95f, y = 30.263f)
                // C 34.586 27.298 32.063 25 29 25
                curveTo(
                    x1 = 34.586f,
                    y1 = 27.298f,
                    x2 = 32.063f,
                    y2 = 25.0f,
                    x3 = 29.0f,
                    y3 = 25.0f,
                )
                // c -3.313 0 -6 2.687 -6 6
                curveToRelative(
                    dx1 = -3.313f,
                    dy1 = 0.0f,
                    dx2 = -6.0f,
                    dy2 = 2.687f,
                    dx3 = -6.0f,
                    dy3 = 6.0f,
                )
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // c 0.749 0 1.425 -0.284 1.95 -0.737z
                curveToRelative(
                    dx1 = 0.749f,
                    dy1 = 0.0f,
                    dx2 = 1.425f,
                    dy2 = -0.284f,
                    dx3 = 1.95f,
                    dy3 = -0.737f,
                )
                close()
            }
            // M7 31 m-4 0 a4 4 0 1 1 8 0 a4 4 0 1 1 -8 0
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 7 31
                moveTo(x = 7.0f, y = 31.0f)
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
            // M7 31 m-2 0 a2 2 0 1 1 4 0 a2 2 0 1 1 -4 0
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 7 31
                moveTo(x = 7.0f, y = 31.0f)
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
                fill = SolidColor(Color(0xFF000000)),
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
                fill = SolidColor(Color(0xFF99AAB5)),
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
            // M0 25 h1 v2 L0 27z M35 23 h1 v2 h-1z
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 0 25
                moveTo(x = 0.0f, y = 25.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // L 0 27z
                lineTo(x = 0.0f, y = 27.0f)
                close()
                // M 35 23
                moveTo(x = 35.0f, y = 23.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -1z
                horizontalLineToRelative(dx = -1.0f)
                close()
            }
            // M1 13 h35 v10 H1z
            path(
                fill = SolidColor(Color(0xFF58595B)),
            ) {
                // M 1 13
                moveTo(x = 1.0f, y = 13.0f)
                // h 35
                horizontalLineToRelative(dx = 35.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // H 1z
                horizontalLineTo(x = 1.0f)
                close()
            }
            // M2 13 H0.342 C0.11 13.344 0 13.685 0 14 v11 h2 c1.104 0 2 -0.896 2 -2 v-8 c0 -1.104 -0.896 -2 -2 -2z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 2 13
                moveTo(x = 2.0f, y = 13.0f)
                // H 0.342
                horizontalLineTo(x = 0.342f)
                // C 0.11 13.344 0 13.685 0 14
                curveTo(
                    x1 = 0.11f,
                    y1 = 13.344f,
                    x2 = 0.0f,
                    y2 = 13.685f,
                    x3 = 0.0f,
                    y3 = 14.0f,
                )
                // v 11
                verticalLineToRelative(dy = 11.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // c 1.104 0 2 -0.896 2 -2
                curveToRelative(
                    dx1 = 1.104f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = -0.896f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // c 0 -1.104 -0.896 -2 -2 -2z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.104f,
                    dx2 = -0.896f,
                    dy2 = -2.0f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                close()
            }
            // M31 20 c0 0.553 -0.447 1 -1 1 H7 c-0.552 0 -1 -0.447 -1 -1 v-4 c0 -0.552 0.448 -1 1 -1 h23 c0.553 0 1 0.448 1 1 v4z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 31 20
                moveTo(x = 31.0f, y = 20.0f)
                // c 0 0.553 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // H 7
                horizontalLineTo(x = 7.0f)
                // c -0.552 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // c 0 -0.552 0.448 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = 0.448f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 23
                horizontalLineToRelative(dx = 23.0f)
                // c 0.553 0 1 0.448 1 1
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.448f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // v 4z
                verticalLineToRelative(dy = 4.0f)
                close()
            }
            // M35 19 h1 v2 h-1z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 35 19
                moveTo(x = 35.0f, y = 19.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -1z
                horizontalLineToRelative(dx = -1.0f)
                close()
            }
            // M1 15 H0 v8 h1 c0.552 0 1 -0.447 1 -1 v-6 c0 -0.552 -0.448 -1 -1 -1z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 1 15
                moveTo(x = 1.0f, y = 15.0f)
                // H 0
                horizontalLineTo(x = 0.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // c 0.552 0 1 -0.447 1 -1
                curveToRelative(
                    dx1 = 0.552f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -0.447f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // c 0 -0.552 -0.448 -1 -1 -1z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = -0.448f,
                    dy2 = -1.0f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                close()
            }
        }.build().also { _emoji1f68c = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f68c: ImageVector? = null
