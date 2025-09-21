package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f687: ImageVector
    get() {
        val current = _emoji1f687
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f687",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 18 c0 9.941 -8.059 18 -18 18 S0 27.941 0 18 8.059 0 18 0 s18 8.059 18 18z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 36 18
                moveTo(x = 36.0f, y = 18.0f)
                // c 0 9.941 -8.059 18 -18 18
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 9.941f,
                    dx2 = -8.059f,
                    dy2 = 18.0f,
                    dx3 = -18.0f,
                    dy3 = 18.0f,
                )
                // S 0 27.941 0 18
                reflectiveCurveTo(
                    x1 = 0.0f,
                    y1 = 27.941f,
                    x2 = 0.0f,
                    y2 = 18.0f,
                )
                // S 8.059 0 18 0
                reflectiveCurveTo(
                    x1 = 8.059f,
                    y1 = 0.0f,
                    x2 = 18.0f,
                    y2 = 0.0f,
                )
                // s 18 8.059 18 18z
                reflectiveCurveToRelative(
                    dx1 = 18.0f,
                    dy1 = 8.059f,
                    dx2 = 18.0f,
                    dy2 = 18.0f,
                )
                close()
            }
            // M8.896 33.509 c0.7 0.412 1.421 0.79 2.178 1.106 L17.65 20 h-1.419 L8.896 33.509z M19.77 20 h-1.42 l6.577 14.615 c0.756 -0.316 1.478 -0.694 2.178 -1.106 L19.77 20z
            path(
                fill = SolidColor(Color(0xFF808285)),
            ) {
                // M 8.896 33.509
                moveTo(x = 8.896f, y = 33.509f)
                // c 0.7 0.412 1.421 0.79 2.178 1.106
                curveToRelative(
                    dx1 = 0.7f,
                    dy1 = 0.412f,
                    dx2 = 1.421f,
                    dy2 = 0.79f,
                    dx3 = 2.178f,
                    dy3 = 1.106f,
                )
                // L 17.65 20
                lineTo(x = 17.65f, y = 20.0f)
                // h -1.419
                horizontalLineToRelative(dx = -1.419f)
                // L 8.896 33.509z
                lineTo(x = 8.896f, y = 33.509f)
                close()
                // M 19.77 20
                moveTo(x = 19.77f, y = 20.0f)
                // h -1.42
                horizontalLineToRelative(dx = -1.42f)
                // l 6.577 14.615
                lineToRelative(dx = 6.577f, dy = 14.615f)
                // c 0.756 -0.316 1.478 -0.694 2.178 -1.106
                curveToRelative(
                    dx1 = 0.756f,
                    dy1 = -0.316f,
                    dx2 = 1.478f,
                    dy2 = -0.694f,
                    dx3 = 2.178f,
                    dy3 = -1.106f,
                )
                // L 19.77 20z
                lineTo(x = 19.77f, y = 20.0f)
                close()
            }
            // M12 26 h2 v2 h-2z M22 26 h2 v2 h-2z
            path(
                fill = SolidColor(Color(0xFF58595B)),
            ) {
                // M 12 26
                moveTo(x = 12.0f, y = 26.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
                // M 22 26
                moveTo(x = 22.0f, y = 26.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // M26 25 c0 1.104 -0.896 2 -2 2 H12 c-1.104 0 -2 -0.896 -2 -2 v-2 c0 -1.104 0.896 -2 2 -2 h12 c1.104 0 2 0.896 2 2 v2z
            path(
                fill = SolidColor(Color(0xFFA7A9AC)),
            ) {
                // M 26 25
                moveTo(x = 26.0f, y = 25.0f)
                // c 0 1.104 -0.896 2 -2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = -0.896f,
                    dy2 = 2.0f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // H 12
                horizontalLineTo(x = 12.0f)
                // c -1.104 0 -2 -0.896 -2 -2
                curveToRelative(
                    dx1 = -1.104f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -0.896f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // c 0 -1.104 0.896 -2 2 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.104f,
                    dx2 = 0.896f,
                    dy2 = -2.0f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // c 1.104 0 2 0.896 2 2
                curveToRelative(
                    dx1 = 1.104f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 0.896f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                // v 2z
                verticalLineToRelative(dy = 2.0f)
                close()
            }
            // M24.363 6 H11.636 C9.628 6 8 7.628 8 9.636 V23 c0 1.104 0.896 2 2 2 h16 c1.104 0 2 -0.896 2 -2 V9.636 C28 7.628 26.372 6 24.363 6z
            path(
                fill = SolidColor(Color(0xFFD1D3D4)),
            ) {
                // M 24.363 6
                moveTo(x = 24.363f, y = 6.0f)
                // H 11.636
                horizontalLineTo(x = 11.636f)
                // C 9.628 6 8 7.628 8 9.636
                curveTo(
                    x1 = 9.628f,
                    y1 = 6.0f,
                    x2 = 8.0f,
                    y2 = 7.628f,
                    x3 = 8.0f,
                    y3 = 9.636f,
                )
                // V 23
                verticalLineTo(y = 23.0f)
                // c 0 1.104 0.896 2 2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = 0.896f,
                    dy2 = 2.0f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // c 1.104 0 2 -0.896 2 -2
                curveToRelative(
                    dx1 = 1.104f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = -0.896f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // V 9.636
                verticalLineTo(y = 9.636f)
                // C 28 7.628 26.372 6 24.363 6z
                curveTo(
                    x1 = 28.0f,
                    y1 = 7.628f,
                    x2 = 26.372f,
                    y2 = 6.0f,
                    x3 = 24.363f,
                    y3 = 6.0f,
                )
                close()
            }
            // M8 19 v4 c0 1.104 0.896 2 2 2 h16 c1.104 0 2 -0.896 2 -2 v-8 H8 v4z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 8 19
                moveTo(x = 8.0f, y = 19.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // c 0 1.104 0.896 2 2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = 0.896f,
                    dy2 = 2.0f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                // h 16
                horizontalLineToRelative(dx = 16.0f)
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
                // H 8
                horizontalLineTo(x = 8.0f)
                // v 4z
                verticalLineToRelative(dy = 4.0f)
                close()
            }
            // M26 17 c0 1.104 -0.896 2 -2 2 H12 c-1.104 0 -2 -0.896 -2 -2 v-7 c0 -1.104 0.896 -2 2 -2 h12 c1.104 0 2 0.896 2 2 v7z
            path(
                fill = SolidColor(Color(0xFF58595B)),
            ) {
                // M 26 17
                moveTo(x = 26.0f, y = 17.0f)
                // c 0 1.104 -0.896 2 -2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = -0.896f,
                    dy2 = 2.0f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // H 12
                horizontalLineTo(x = 12.0f)
                // c -1.104 0 -2 -0.896 -2 -2
                curveToRelative(
                    dx1 = -1.104f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -0.896f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // v -7
                verticalLineToRelative(dy = -7.0f)
                // c 0 -1.104 0.896 -2 2 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.104f,
                    dx2 = 0.896f,
                    dy2 = -2.0f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // c 1.104 0 2 0.896 2 2
                curveToRelative(
                    dx1 = 1.104f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 0.896f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                // v 7z
                verticalLineToRelative(dy = 7.0f)
                close()
            }
            // M24 16 c0 0.552 -0.447 1 -1 1 H13 c-0.552 0 -1 -0.448 -1 -1 v-5 c0 -0.552 0.448 -1 1 -1 h10 c0.553 0 1 0.448 1 1 v5z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 24 16
                moveTo(x = 24.0f, y = 16.0f)
                // c 0 0.552 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // H 13
                horizontalLineTo(x = 13.0f)
                // c -0.552 0 -1 -0.448 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.448f,
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
                // h 10
                horizontalLineToRelative(dx = 10.0f)
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
            // M10 21 h4 v2 h-4z M22 21 h4 v2 h-4z
            path(
                fill = SolidColor(Color(0xFFFFD983)),
            ) {
                // M 10 21
                moveTo(x = 10.0f, y = 21.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
                // M 22 21
                moveTo(x = 22.0f, y = 21.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // M20 9 c0 0.552 -0.447 1 -1 1 h-2 c-0.552 0 -1 -0.448 -1 -1 s0.448 -1 1 -1 h2 c0.553 0 1 0.448 1 1z
            path(
                fill = SolidColor(Color(0xFF808285)),
            ) {
                // M 20 9
                moveTo(x = 20.0f, y = 9.0f)
                // c 0 0.552 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // h -2
                horizontalLineToRelative(dx = -2.0f)
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
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // c 0.553 0 1 0.448 1 1z
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.448f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                close()
            }
        }.build().also { _emoji1f687 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f687: ImageVector? = null
