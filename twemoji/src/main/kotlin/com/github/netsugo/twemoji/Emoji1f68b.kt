package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f68b: ImageVector
    get() {
        val current = _emoji1f68b
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f68b",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M0 34 h36 v2 H0z
            path(
                fill = SolidColor(Color(0xFF939598)),
            ) {
                // M 0 34
                moveTo(x = 0.0f, y = 34.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 0z
                horizontalLineTo(x = 0.0f)
                close()
            }
            // M10 32 c0 -1.657 -1.344 -3 -3 -3 s-3 1.343 -3 3 1.343 3 3 3 3 -1.343 3 -3z
            path(
                fill = SolidColor(Color(0xFF58595B)),
            ) {
                // M 10 32
                moveTo(x = 10.0f, y = 32.0f)
                // c 0 -1.657 -1.344 -3 -3 -3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.657f,
                    dx2 = -1.344f,
                    dy2 = -3.0f,
                    dx3 = -3.0f,
                    dy3 = -3.0f,
                )
                // s -3 1.343 -3 3
                reflectiveCurveToRelative(
                    dx1 = -3.0f,
                    dy1 = 1.343f,
                    dx2 = -3.0f,
                    dy2 = 3.0f,
                )
                // s 1.343 3 3 3
                reflectiveCurveToRelative(
                    dx1 = 1.343f,
                    dy1 = 3.0f,
                    dx2 = 3.0f,
                    dy2 = 3.0f,
                )
                // s 3 -1.343 3 -3z
                reflectiveCurveToRelative(
                    dx1 = 3.0f,
                    dy1 = -1.343f,
                    dx2 = 3.0f,
                    dy2 = -3.0f,
                )
                close()
            }
            // M9 32 c0 -1.105 -0.896 -2 -2 -2 s-2 0.895 -2 2 0.896 2 2 2 2 -0.895 2 -2z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 9 32
                moveTo(x = 9.0f, y = 32.0f)
                // c 0 -1.105 -0.896 -2 -2 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.105f,
                    dx2 = -0.896f,
                    dy2 = -2.0f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // s -2 0.895 -2 2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 0.895f,
                    dx2 = -2.0f,
                    dy2 = 2.0f,
                )
                // s 0.896 2 2 2
                reflectiveCurveToRelative(
                    dx1 = 0.896f,
                    dy1 = 2.0f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                )
                // s 2 -0.895 2 -2z
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = -0.895f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                close()
            }
            // M29 32 m-3 0 a3 3 0 1 1 6 0 a3 3 0 1 1 -6 0
            path(
                fill = SolidColor(Color(0xFF58595B)),
            ) {
                // M 29 32
                moveTo(x = 29.0f, y = 32.0f)
                // m -3 0
                moveToRelative(dx = -3.0f, dy = 0.0f)
                // a 3 3 0 1 1 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // a 3 3 0 1 1 -6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
            }
            // M29 32 m-2 0 a2 2 0 1 1 4 0 a2 2 0 1 1 -4 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 29 32
                moveTo(x = 29.0f, y = 32.0f)
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
            // M34 2 H2 c-0.552 0 -1 -0.448 -1 -1 s0.448 -1 1 -1 h32 c0.553 0 1 0.448 1 1 s-0.447 1 -1 1z
            path(
                fill = SolidColor(Color(0xFFE6E7E8)),
            ) {
                // M 34 2
                moveTo(x = 34.0f, y = 2.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // c -0.552 0 -1 -0.448 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.448f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // s 0.448 -1 1 -1
                reflectiveCurveToRelative(
                    dx1 = 0.448f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // h 32
                horizontalLineToRelative(dx = 32.0f)
                // c 0.553 0 1 0.448 1 1
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.448f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // s -0.447 1 -1 1z
                reflectiveCurveToRelative(
                    dx1 = -0.447f,
                    dy1 = 1.0f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                close()
            }
            // M22.998 4.944 c-0.016 -0.284 -0.151 -0.548 -0.373 -0.726 l-3.683 -2.945 c0.087 -0.302 0.049 -0.635 -0.162 -0.898 -0.314 -0.394 -0.859 -0.468 -1.281 -0.221 -0.42 -0.248 -0.966 -0.174 -1.281 0.221 -0.211 0.264 -0.25 0.597 -0.162 0.898 l-3.682 2.945 c-0.222 0.178 -0.358 0.441 -0.374 0.726 -0.016 0.284 0.09 0.561 0.291 0.762 l3.835 3.834 c-0.198 0.377 -0.152 0.848 0.165 1.165 0.197 0.197 0.453 0.295 0.709 0.295 0.176 0 0.344 -0.063 0.5 -0.155 0.156 0.091 0.324 0.155 0.5 0.155 0.256 0 0.512 -0.098 0.707 -0.293 0.317 -0.317 0.363 -0.788 0.165 -1.165 l3.835 -3.835 c0.201 -0.202 0.308 -0.479 0.291 -0.763z M17.5 8.085 l-3.003 -3.003 L17.5 2.68 l3.003 2.403 L17.5 8.085z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 22.998 4.944
                moveTo(x = 22.998f, y = 4.944f)
                // c -0.016 -0.284 -0.151 -0.548 -0.373 -0.726
                curveToRelative(
                    dx1 = -0.016f,
                    dy1 = -0.284f,
                    dx2 = -0.151f,
                    dy2 = -0.548f,
                    dx3 = -0.373f,
                    dy3 = -0.726f,
                )
                // l -3.683 -2.945
                lineToRelative(dx = -3.683f, dy = -2.945f)
                // c 0.087 -0.302 0.049 -0.635 -0.162 -0.898
                curveToRelative(
                    dx1 = 0.087f,
                    dy1 = -0.302f,
                    dx2 = 0.049f,
                    dy2 = -0.635f,
                    dx3 = -0.162f,
                    dy3 = -0.898f,
                )
                // c -0.314 -0.394 -0.859 -0.468 -1.281 -0.221
                curveToRelative(
                    dx1 = -0.314f,
                    dy1 = -0.394f,
                    dx2 = -0.859f,
                    dy2 = -0.468f,
                    dx3 = -1.281f,
                    dy3 = -0.221f,
                )
                // c -0.42 -0.248 -0.966 -0.174 -1.281 0.221
                curveToRelative(
                    dx1 = -0.42f,
                    dy1 = -0.248f,
                    dx2 = -0.966f,
                    dy2 = -0.174f,
                    dx3 = -1.281f,
                    dy3 = 0.221f,
                )
                // c -0.211 0.264 -0.25 0.597 -0.162 0.898
                curveToRelative(
                    dx1 = -0.211f,
                    dy1 = 0.264f,
                    dx2 = -0.25f,
                    dy2 = 0.597f,
                    dx3 = -0.162f,
                    dy3 = 0.898f,
                )
                // l -3.682 2.945
                lineToRelative(dx = -3.682f, dy = 2.945f)
                // c -0.222 0.178 -0.358 0.441 -0.374 0.726
                curveToRelative(
                    dx1 = -0.222f,
                    dy1 = 0.178f,
                    dx2 = -0.358f,
                    dy2 = 0.441f,
                    dx3 = -0.374f,
                    dy3 = 0.726f,
                )
                // c -0.016 0.284 0.09 0.561 0.291 0.762
                curveToRelative(
                    dx1 = -0.016f,
                    dy1 = 0.284f,
                    dx2 = 0.09f,
                    dy2 = 0.561f,
                    dx3 = 0.291f,
                    dy3 = 0.762f,
                )
                // l 3.835 3.834
                lineToRelative(dx = 3.835f, dy = 3.834f)
                // c -0.198 0.377 -0.152 0.848 0.165 1.165
                curveToRelative(
                    dx1 = -0.198f,
                    dy1 = 0.377f,
                    dx2 = -0.152f,
                    dy2 = 0.848f,
                    dx3 = 0.165f,
                    dy3 = 1.165f,
                )
                // c 0.197 0.197 0.453 0.295 0.709 0.295
                curveToRelative(
                    dx1 = 0.197f,
                    dy1 = 0.197f,
                    dx2 = 0.453f,
                    dy2 = 0.295f,
                    dx3 = 0.709f,
                    dy3 = 0.295f,
                )
                // c 0.176 0 0.344 -0.063 0.5 -0.155
                curveToRelative(
                    dx1 = 0.176f,
                    dy1 = 0.0f,
                    dx2 = 0.344f,
                    dy2 = -0.063f,
                    dx3 = 0.5f,
                    dy3 = -0.155f,
                )
                // c 0.156 0.091 0.324 0.155 0.5 0.155
                curveToRelative(
                    dx1 = 0.156f,
                    dy1 = 0.091f,
                    dx2 = 0.324f,
                    dy2 = 0.155f,
                    dx3 = 0.5f,
                    dy3 = 0.155f,
                )
                // c 0.256 0 0.512 -0.098 0.707 -0.293
                curveToRelative(
                    dx1 = 0.256f,
                    dy1 = 0.0f,
                    dx2 = 0.512f,
                    dy2 = -0.098f,
                    dx3 = 0.707f,
                    dy3 = -0.293f,
                )
                // c 0.317 -0.317 0.363 -0.788 0.165 -1.165
                curveToRelative(
                    dx1 = 0.317f,
                    dy1 = -0.317f,
                    dx2 = 0.363f,
                    dy2 = -0.788f,
                    dx3 = 0.165f,
                    dy3 = -1.165f,
                )
                // l 3.835 -3.835
                lineToRelative(dx = 3.835f, dy = -3.835f)
                // c 0.201 -0.202 0.308 -0.479 0.291 -0.763z
                curveToRelative(
                    dx1 = 0.201f,
                    dy1 = -0.202f,
                    dx2 = 0.308f,
                    dy2 = -0.479f,
                    dx3 = 0.291f,
                    dy3 = -0.763f,
                )
                close()
                // M 17.5 8.085
                moveTo(x = 17.5f, y = 8.085f)
                // l -3.003 -3.003
                lineToRelative(dx = -3.003f, dy = -3.003f)
                // L 17.5 2.68
                lineTo(x = 17.5f, y = 2.68f)
                // l 3.003 2.403
                lineToRelative(dx = 3.003f, dy = 2.403f)
                // L 17.5 8.085z
                lineTo(x = 17.5f, y = 8.085f)
                close()
            }
            // M30 10 c0 1.104 -0.896 2 -2 2 H8 c-1.104 0 -2 -0.896 -2 -2 s0.896 -2 2 -2 h20 c1.104 0 2 0.896 2 2z
            path(
                fill = SolidColor(Color(0xFFBCBEC0)),
            ) {
                // M 30 10
                moveTo(x = 30.0f, y = 10.0f)
                // c 0 1.104 -0.896 2 -2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = -0.896f,
                    dy2 = 2.0f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // H 8
                horizontalLineTo(x = 8.0f)
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
                // h 20
                horizontalLineToRelative(dx = 20.0f)
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
            // M36 22 c0 2.209 -1.791 4 -4 4 H4 c-2.209 0 -4 -1.791 -4 -4 v-8 c0 -2.209 1.791 -4 4 -4 h28 c2.209 0 4 1.791 4 4 v8z M0 28 h36 v4 H0z
            path(
                fill = SolidColor(Color(0xFFE6E7E8)),
            ) {
                // M 36 22
                moveTo(x = 36.0f, y = 22.0f)
                // c 0 2.209 -1.791 4 -4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = -1.791f,
                    dy2 = 4.0f,
                    dx3 = -4.0f,
                    dy3 = 4.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // c -2.209 0 -4 -1.791 -4 -4
                curveToRelative(
                    dx1 = -2.209f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = -1.791f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // c 0 -2.209 1.791 -4 4 -4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.209f,
                    dx2 = 1.791f,
                    dy2 = -4.0f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // c 2.209 0 4 1.791 4 4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = 1.791f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // v 8z
                verticalLineToRelative(dy = 8.0f)
                close()
                // M 0 28
                moveTo(x = 0.0f, y = 28.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // H 0z
                horizontalLineTo(x = 0.0f)
                close()
            }
            // M0 14 h36 v14 H0z
            path(
                fill = SolidColor(Color(0xFFBE1931)),
            ) {
                // M 0 14
                moveTo(x = 0.0f, y = 14.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // H 0z
                horizontalLineTo(x = 0.0f)
                close()
            }
            // M36 14 H0 v10 h6 v6 h7 v-6 h10 v6 h7 v-6 h6z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 36 14
                moveTo(x = 36.0f, y = 14.0f)
                // H 0
                horizontalLineTo(x = 0.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // h 6z
                horizontalLineToRelative(dx = 6.0f)
                close()
            }
            // M2 16 L0 16 v10 h2 c1.104 0 2 -0.896 2 -2 v-6 c0 -1.104 -0.896 -2 -2 -2z M36 16 h-2 c-1.104 0 -2 0.896 -2 2 v6 c0 1.104 0.896 2 2 2 h2 L36 16z M21 22 c0 0.553 -0.448 1 -1 1 h-4 c-0.553 0 -1 -0.447 -1 -1 v-4 c0 -0.553 0.448 -1 1 -1 h4 c0.552 0 1 0.447 1 1 v4z M12 23 c0 0.553 -0.448 1 -1 1 L8 24 c-0.552 0 -1 -0.447 -1 -1 v-5 c0 -0.552 0.448 -1 1 -1 h3 c0.552 0 1 0.448 1 1 v5z M29 23 c0 0.553 -0.447 1 -1 1 h-3 c-0.553 0 -1 -0.447 -1 -1 v-5 c0 -0.552 0.447 -1 1 -1 h3 c0.553 0 1 0.448 1 1 v5z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 2 16
                moveTo(x = 2.0f, y = 16.0f)
                // L 0 16
                lineTo(x = 0.0f, y = 16.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
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
                // v -6
                verticalLineToRelative(dy = -6.0f)
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
                // M 36 16
                moveTo(x = 36.0f, y = 16.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // c -1.104 0 -2 0.896 -2 2
                curveToRelative(
                    dx1 = -1.104f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = 0.896f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // c 0 1.104 0.896 2 2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = 0.896f,
                    dy2 = 2.0f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // L 36 16z
                lineTo(x = 36.0f, y = 16.0f)
                close()
                // M 21 22
                moveTo(x = 21.0f, y = 22.0f)
                // c 0 0.553 -0.448 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.448f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // c -0.553 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.553f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // c 0 -0.553 0.448 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.553f,
                    dx2 = 0.448f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // c 0.552 0 1 0.447 1 1
                curveToRelative(
                    dx1 = 0.552f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.447f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // v 4z
                verticalLineToRelative(dy = 4.0f)
                close()
                // M 12 23
                moveTo(x = 12.0f, y = 23.0f)
                // c 0 0.553 -0.448 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.448f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // L 8 24
                lineTo(x = 8.0f, y = 24.0f)
                // c -0.552 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // c 0 -0.552 0.448 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = 0.448f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // c 0.552 0 1 0.448 1 1
                curveToRelative(
                    dx1 = 0.552f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.448f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // v 5z
                verticalLineToRelative(dy = 5.0f)
                close()
                // M 29 23
                moveTo(x = 29.0f, y = 23.0f)
                // c 0 0.553 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // c -0.553 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.553f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // c 0 -0.552 0.447 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = 0.447f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // c 0.553 0 1 0.448 1 1
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.448f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // v 5z
                verticalLineToRelative(dy = 5.0f)
                close()
            }
            // M0 28 h36 v2 H0z
            path(
                fill = SolidColor(Color(0xFFA0041E)),
            ) {
                // M 0 28
                moveTo(x = 0.0f, y = 28.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 0z
                horizontalLineTo(x = 0.0f)
                close()
            }
        }.build().also { _emoji1f68b = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f68b: ImageVector? = null
