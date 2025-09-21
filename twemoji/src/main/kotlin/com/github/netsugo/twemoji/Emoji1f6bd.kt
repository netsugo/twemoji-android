package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f6bd: ImageVector
    get() {
        val current = _emoji1f6bd
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f6bd",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M26 18 v2 H13.293 c-0.867 0 -1.835 0.896 -2.161 2 L7.59 34 c-0.326 1.104 0.306 2 1.41 2 h18 c1.104 0 2 -0.896 2 -2 V24 c0 -1.861 1.278 -3.412 3 -3.858 V18 h-6z
            path(
                fill = SolidColor(Color(0xFFAAB8C2)),
            ) {
                // M 26 18
                moveTo(x = 26.0f, y = 18.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 13.293
                horizontalLineTo(x = 13.293f)
                // c -0.867 0 -1.835 0.896 -2.161 2
                curveToRelative(
                    dx1 = -0.867f,
                    dy1 = 0.0f,
                    dx2 = -1.835f,
                    dy2 = 0.896f,
                    dx3 = -2.161f,
                    dy3 = 2.0f,
                )
                // L 7.59 34
                lineTo(x = 7.59f, y = 34.0f)
                // c -0.326 1.104 0.306 2 1.41 2
                curveToRelative(
                    dx1 = -0.326f,
                    dy1 = 1.104f,
                    dx2 = 0.306f,
                    dy2 = 2.0f,
                    dx3 = 1.41f,
                    dy3 = 2.0f,
                )
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // c 1.104 0 2 -0.896 2 -2
                curveToRelative(
                    dx1 = 1.104f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = -0.896f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // V 24
                verticalLineTo(y = 24.0f)
                // c 0 -1.861 1.278 -3.412 3 -3.858
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.861f,
                    dx2 = 1.278f,
                    dy2 = -3.412f,
                    dx3 = 3.0f,
                    dy3 = -3.858f,
                )
                // V 18
                verticalLineTo(y = 18.0f)
                // h -6z
                horizontalLineToRelative(dx = -6.0f)
                close()
            }
            // M22 21.875 C22 25.396 17.522 29 12 29 c-5.523 0 -10 -3.604 -10 -7.125 C2 20 2.833 20 12 20 c9.166 0 10 0 10 1.875z M25 19 c0 0.553 -0.514 1 -1.15 1 H3.15 C2.515 20 2 19.553 2 19 c0 -0.553 0.515 -1 1.15 -1 h20.7 c0.636 0 1.15 0.447 1.15 1z
            path(
                fill = SolidColor(Color(0xFFE1E8ED)),
            ) {
                // M 22 21.875
                moveTo(x = 22.0f, y = 21.875f)
                // C 22 25.396 17.522 29 12 29
                curveTo(
                    x1 = 22.0f,
                    y1 = 25.396f,
                    x2 = 17.522f,
                    y2 = 29.0f,
                    x3 = 12.0f,
                    y3 = 29.0f,
                )
                // c -5.523 0 -10 -3.604 -10 -7.125
                curveToRelative(
                    dx1 = -5.523f,
                    dy1 = 0.0f,
                    dx2 = -10.0f,
                    dy2 = -3.604f,
                    dx3 = -10.0f,
                    dy3 = -7.125f,
                )
                // C 2 20 2.833 20 12 20
                curveTo(
                    x1 = 2.0f,
                    y1 = 20.0f,
                    x2 = 2.833f,
                    y2 = 20.0f,
                    x3 = 12.0f,
                    y3 = 20.0f,
                )
                // c 9.166 0 10 0 10 1.875z
                curveToRelative(
                    dx1 = 9.166f,
                    dy1 = 0.0f,
                    dx2 = 10.0f,
                    dy2 = 0.0f,
                    dx3 = 10.0f,
                    dy3 = 1.875f,
                )
                close()
                // M 25 19
                moveTo(x = 25.0f, y = 19.0f)
                // c 0 0.553 -0.514 1 -1.15 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.514f,
                    dy2 = 1.0f,
                    dx3 = -1.15f,
                    dy3 = 1.0f,
                )
                // H 3.15
                horizontalLineTo(x = 3.15f)
                // C 2.515 20 2 19.553 2 19
                curveTo(
                    x1 = 2.515f,
                    y1 = 20.0f,
                    x2 = 2.0f,
                    y2 = 19.553f,
                    x3 = 2.0f,
                    y3 = 19.0f,
                )
                // c 0 -0.553 0.515 -1 1.15 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.553f,
                    dx2 = 0.515f,
                    dy2 = -1.0f,
                    dx3 = 1.15f,
                    dy3 = -1.0f,
                )
                // h 20.7
                horizontalLineToRelative(dx = 20.7f)
                // c 0.636 0 1.15 0.447 1.15 1z
                curveToRelative(
                    dx1 = 0.636f,
                    dy1 = 0.0f,
                    dx2 = 1.15f,
                    dy2 = 0.447f,
                    dx3 = 1.15f,
                    dy3 = 1.0f,
                )
                close()
            }
            // M18 16 L6 16 c-1.104 0 -2 0.896 -2 2 h16 c0 -1.104 -0.896 -2 -2 -2z M20 0 v18 c1.104 0 2 -1.007 2 -2.25 L22 2.25 C22 1.007 21.104 0 20 0z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 18 16
                moveTo(x = 18.0f, y = 16.0f)
                // L 6 16
                lineTo(x = 6.0f, y = 16.0f)
                // c -1.104 0 -2 0.896 -2 2
                curveToRelative(
                    dx1 = -1.104f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = 0.896f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // h 16
                horizontalLineToRelative(dx = 16.0f)
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
                // M 20 0
                moveTo(x = 20.0f, y = 0.0f)
                // v 18
                verticalLineToRelative(dy = 18.0f)
                // c 1.104 0 2 -1.007 2 -2.25
                curveToRelative(
                    dx1 = 1.104f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = -1.007f,
                    dx3 = 2.0f,
                    dy3 = -2.25f,
                )
                // L 22 2.25
                lineTo(x = 22.0f, y = 2.25f)
                // C 22 1.007 21.104 0 20 0z
                curveTo(
                    x1 = 22.0f,
                    y1 = 1.007f,
                    x2 = 21.104f,
                    y2 = 0.0f,
                    x3 = 20.0f,
                    y3 = 0.0f,
                )
                close()
            }
            // M34 4 c0 -1.104 -0.896 -2 -2 -2 h-8 c-1.104 0 -2 0.896 -2 2 v14 c0 1.104 0.896 2 2 2 h8 c1.104 0 2 -0.896 2 -2 V4z
            path(
                fill = SolidColor(Color(0xFFE1E8ED)),
            ) {
                // M 34 4
                moveTo(x = 34.0f, y = 4.0f)
                // c 0 -1.104 -0.896 -2 -2 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.104f,
                    dx2 = -0.896f,
                    dy2 = -2.0f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // c -1.104 0 -2 0.896 -2 2
                curveToRelative(
                    dx1 = -1.104f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = 0.896f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // c 0 1.104 0.896 2 2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = 0.896f,
                    dy2 = 2.0f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // c 1.104 0 2 -0.896 2 -2
                curveToRelative(
                    dx1 = 1.104f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = -0.896f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // V 4z
                verticalLineTo(y = 4.0f)
                close()
            }
            // M20 16 m-2 0 a2 2 0 1 1 4 0 a2 2 0 1 1 -4 0
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 20 16
                moveTo(x = 20.0f, y = 16.0f)
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
            // M22 4 h12 v2 H22z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 22 4
                moveTo(x = 22.0f, y = 4.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 22z
                horizontalLineTo(x = 22.0f)
                close()
            }
            // M25 21 c0 0.553 -0.447 1 -1 1 H3 c-0.552 0 -1 -0.447 -1 -1 0 -0.553 0.448 -1 1 -1 h21 c0.553 0 1 0.447 1 1z
            path(
                fill = SolidColor(Color(0xFFAAB8C2)),
            ) {
                // M 25 21
                moveTo(x = 25.0f, y = 21.0f)
                // c 0 0.553 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.447f,
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
                // h 21
                horizontalLineToRelative(dx = 21.0f)
                // c 0.553 0 1 0.447 1 1z
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.447f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                close()
            }
        }.build().also { _emoji1f6bd = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f6bd: ImageVector? = null
