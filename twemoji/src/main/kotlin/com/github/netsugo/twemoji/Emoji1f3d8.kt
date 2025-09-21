package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f3d8: ImageVector
    get() {
        val current = _emoji1f3d8
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f3d8",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M1.537 24.962 c-0.414 0 -0.75 0.336 -0.75 0.75 0 0.415 0.336 0.75 0.75 0.75 h18 v-1.5 h-18z M35.208 17.007 h-12.5 v1.5 h12.5 c0.414 0 0.75 -0.336 0.75 -0.75 0 -0.415 -0.335 -0.75 -0.75 -0.75z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 1.537 24.962
                moveTo(x = 1.537f, y = 24.962f)
                // c -0.414 0 -0.75 0.336 -0.75 0.75
                curveToRelative(
                    dx1 = -0.414f,
                    dy1 = 0.0f,
                    dx2 = -0.75f,
                    dy2 = 0.336f,
                    dx3 = -0.75f,
                    dy3 = 0.75f,
                )
                // c 0 0.415 0.336 0.75 0.75 0.75
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.415f,
                    dx2 = 0.336f,
                    dy2 = 0.75f,
                    dx3 = 0.75f,
                    dy3 = 0.75f,
                )
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // v -1.5
                verticalLineToRelative(dy = -1.5f)
                // h -18z
                horizontalLineToRelative(dx = -18.0f)
                close()
                // M 35.208 17.007
                moveTo(x = 35.208f, y = 17.007f)
                // h -12.5
                horizontalLineToRelative(dx = -12.5f)
                // v 1.5
                verticalLineToRelative(dy = 1.5f)
                // h 12.5
                horizontalLineToRelative(dx = 12.5f)
                // c 0.414 0 0.75 -0.336 0.75 -0.75
                curveToRelative(
                    dx1 = 0.414f,
                    dy1 = 0.0f,
                    dx2 = 0.75f,
                    dy2 = -0.336f,
                    dx3 = 0.75f,
                    dy3 = -0.75f,
                )
                // c 0 -0.415 -0.335 -0.75 -0.75 -0.75z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.415f,
                    dx2 = -0.335f,
                    dy2 = -0.75f,
                    dx3 = -0.75f,
                    dy3 = -0.75f,
                )
                close()
            }
            // M23.216 9.624 l5.742 -5.742 5.743 5.742 v7.383 H23.216z
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 23.216 9.624
                moveTo(x = 23.216f, y = 9.624f)
                // l 5.742 -5.742
                lineToRelative(dx = 5.742f, dy = -5.742f)
                // l 5.743 5.742
                lineToRelative(dx = 5.743f, dy = 5.742f)
                // v 7.383
                verticalLineToRelative(dy = 7.383f)
                // H 23.216z
                horizontalLineTo(x = 23.216f)
                close()
            }
            // M34.701 10.445 c-0.21 0 -0.42 -0.08 -0.58 -0.24 l-5.162 -5.162 -5.162 5.162 c-0.32 0.32 -0.84 0.32 -1.16 0 -0.32 -0.32 -0.32 -0.84 0 -1.16 l5.742 -5.742 c0.32 -0.32 0.84 -0.32 1.16 0 l5.742 5.742 c0.32 0.32 0.32 0.84 0 1.16 -0.161 0.159 -0.371 0.24 -0.58 0.24z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 34.701 10.445
                moveTo(x = 34.701f, y = 10.445f)
                // c -0.21 0 -0.42 -0.08 -0.58 -0.24
                curveToRelative(
                    dx1 = -0.21f,
                    dy1 = 0.0f,
                    dx2 = -0.42f,
                    dy2 = -0.08f,
                    dx3 = -0.58f,
                    dy3 = -0.24f,
                )
                // l -5.162 -5.162
                lineToRelative(dx = -5.162f, dy = -5.162f)
                // l -5.162 5.162
                lineToRelative(dx = -5.162f, dy = 5.162f)
                // c -0.32 0.32 -0.84 0.32 -1.16 0
                curveToRelative(
                    dx1 = -0.32f,
                    dy1 = 0.32f,
                    dx2 = -0.84f,
                    dy2 = 0.32f,
                    dx3 = -1.16f,
                    dy3 = 0.0f,
                )
                // c -0.32 -0.32 -0.32 -0.84 0 -1.16
                curveToRelative(
                    dx1 = -0.32f,
                    dy1 = -0.32f,
                    dx2 = -0.32f,
                    dy2 = -0.84f,
                    dx3 = 0.0f,
                    dy3 = -1.16f,
                )
                // l 5.742 -5.742
                lineToRelative(dx = 5.742f, dy = -5.742f)
                // c 0.32 -0.32 0.84 -0.32 1.16 0
                curveToRelative(
                    dx1 = 0.32f,
                    dy1 = -0.32f,
                    dx2 = 0.84f,
                    dy2 = -0.32f,
                    dx3 = 1.16f,
                    dy3 = 0.0f,
                )
                // l 5.742 5.742
                lineToRelative(dx = 5.742f, dy = 5.742f)
                // c 0.32 0.32 0.32 0.84 0 1.16
                curveToRelative(
                    dx1 = 0.32f,
                    dy1 = 0.32f,
                    dx2 = 0.32f,
                    dy2 = 0.84f,
                    dx3 = 0.0f,
                    dy3 = 1.16f,
                )
                // c -0.161 0.159 -0.371 0.24 -0.58 0.24z
                curveToRelative(
                    dx1 = -0.161f,
                    dy1 = 0.159f,
                    dx2 = -0.371f,
                    dy2 = 0.24f,
                    dx3 = -0.58f,
                    dy3 = 0.24f,
                )
                close()
            }
            // M27.318 11.265 h3.281 v5.742 h-3.281z
            path(
                fill = SolidColor(Color(0xFF662113)),
            ) {
                // M 27.318 11.265
                moveTo(x = 27.318f, y = 11.265f)
                // h 3.281
                horizontalLineToRelative(dx = 3.281f)
                // v 5.742
                verticalLineToRelative(dy = 5.742f)
                // h -3.281z
                horizontalLineToRelative(dx = -3.281f)
                close()
            }
            // M24.857 11.265 h1.641 v1.641 h-1.641z M31.419 11.265 h1.641 v1.641 h-1.641z M31.419 13.726 h1.641 v1.641 h-1.641z
            path(
                fill = SolidColor(Color(0xFF3B88C3)),
            ) {
                // M 24.857 11.265
                moveTo(x = 24.857f, y = 11.265f)
                // h 1.641
                horizontalLineToRelative(dx = 1.641f)
                // v 1.641
                verticalLineToRelative(dy = 1.641f)
                // h -1.641z
                horizontalLineToRelative(dx = -1.641f)
                close()
                // M 31.419 11.265
                moveTo(x = 31.419f, y = 11.265f)
                // h 1.641
                horizontalLineToRelative(dx = 1.641f)
                // v 1.641
                verticalLineToRelative(dy = 1.641f)
                // h -1.641z
                horizontalLineToRelative(dx = -1.641f)
                close()
                // M 31.419 13.726
                moveTo(x = 31.419f, y = 13.726f)
                // h 1.641
                horizontalLineToRelative(dx = 1.641f)
                // v 1.641
                verticalLineToRelative(dy = 1.641f)
                // h -1.641z
                horizontalLineToRelative(dx = -1.641f)
                close()
            }
            // M10.537 5.259 l-8.296 8.296 v11.407 h16.592 V13.555z
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 10.537 5.259
                moveTo(x = 10.537f, y = 5.259f)
                // l -8.296 8.296
                lineToRelative(dx = -8.296f, dy = 8.296f)
                // v 11.407
                verticalLineToRelative(dy = 11.407f)
                // h 16.592
                horizontalLineToRelative(dx = 16.592f)
                // V 13.555z
                verticalLineTo(y = 13.555f)
                close()
            }
            // M19.87 15.629 c-0.265 0 -0.531 -0.101 -0.733 -0.304 l-8.6 -8.6 -8.6 8.6 c-0.405 0.405 -1.061 0.405 -1.466 0 s-0.405 -1.061 0 -1.466 l9.333 -9.333 c0.405 -0.405 1.061 -0.405 1.466 0 l9.333 9.333 c0.405 0.405 0.405 1.061 0 1.466 -0.202 0.202 -0.467 0.304 -0.733 0.304z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 19.87 15.629
                moveTo(x = 19.87f, y = 15.629f)
                // c -0.265 0 -0.531 -0.101 -0.733 -0.304
                curveToRelative(
                    dx1 = -0.265f,
                    dy1 = 0.0f,
                    dx2 = -0.531f,
                    dy2 = -0.101f,
                    dx3 = -0.733f,
                    dy3 = -0.304f,
                )
                // l -8.6 -8.6
                lineToRelative(dx = -8.6f, dy = -8.6f)
                // l -8.6 8.6
                lineToRelative(dx = -8.6f, dy = 8.6f)
                // c -0.405 0.405 -1.061 0.405 -1.466 0
                curveToRelative(
                    dx1 = -0.405f,
                    dy1 = 0.405f,
                    dx2 = -1.061f,
                    dy2 = 0.405f,
                    dx3 = -1.466f,
                    dy3 = 0.0f,
                )
                // s -0.405 -1.061 0 -1.466
                reflectiveCurveToRelative(
                    dx1 = -0.405f,
                    dy1 = -1.061f,
                    dx2 = 0.0f,
                    dy2 = -1.466f,
                )
                // l 9.333 -9.333
                lineToRelative(dx = 9.333f, dy = -9.333f)
                // c 0.405 -0.405 1.061 -0.405 1.466 0
                curveToRelative(
                    dx1 = 0.405f,
                    dy1 = -0.405f,
                    dx2 = 1.061f,
                    dy2 = -0.405f,
                    dx3 = 1.466f,
                    dy3 = 0.0f,
                )
                // l 9.333 9.333
                lineToRelative(dx = 9.333f, dy = 9.333f)
                // c 0.405 0.405 0.405 1.061 0 1.466
                curveToRelative(
                    dx1 = 0.405f,
                    dy1 = 0.405f,
                    dx2 = 0.405f,
                    dy2 = 1.061f,
                    dx3 = 0.0f,
                    dy3 = 1.466f,
                )
                // c -0.202 0.202 -0.467 0.304 -0.733 0.304z
                curveToRelative(
                    dx1 = -0.202f,
                    dy1 = 0.202f,
                    dx2 = -0.467f,
                    dy2 = 0.304f,
                    dx3 = -0.733f,
                    dy3 = 0.304f,
                )
                close()
            }
            // M8.463 15.629 h4.148 v9.333 H8.463z
            path(
                fill = SolidColor(Color(0xFF662113)),
            ) {
                // M 8.463 15.629
                moveTo(x = 8.463f, y = 15.629f)
                // h 4.148
                horizontalLineToRelative(dx = 4.148f)
                // v 9.333
                verticalLineToRelative(dy = 9.333f)
                // H 8.463z
                horizontalLineTo(x = 8.463f)
                close()
            }
            // M4.315 15.629 h3.111 v3.111 L4.315 18.74z M4.315 19.777 h3.111 v3.111 L4.315 22.888z
            path(
                fill = SolidColor(Color(0xFF3B88C3)),
            ) {
                // M 4.315 15.629
                moveTo(x = 4.315f, y = 15.629f)
                // h 3.111
                horizontalLineToRelative(dx = 3.111f)
                // v 3.111
                verticalLineToRelative(dy = 3.111f)
                // L 4.315 18.74z
                lineTo(x = 4.315f, y = 18.74f)
                close()
                // M 4.315 19.777
                moveTo(x = 4.315f, y = 19.777f)
                // h 3.111
                horizontalLineToRelative(dx = 3.111f)
                // v 3.111
                verticalLineToRelative(dy = 3.111f)
                // L 4.315 22.888z
                lineTo(x = 4.315f, y = 22.888f)
                close()
            }
            // M21.477 8.438 L10.954 18.995 v14.519 H32 V18.995z
            path(
                fill = SolidColor(Color(0xFFFFE8B6)),
            ) {
                // M 21.477 8.438
                moveTo(x = 21.477f, y = 8.438f)
                // L 10.954 18.995
                lineTo(x = 10.954f, y = 18.995f)
                // v 14.519
                verticalLineToRelative(dy = 14.519f)
                // H 32
                horizontalLineTo(x = 32.0f)
                // V 18.995z
                verticalLineTo(y = 18.995f)
                close()
            }
            // M33 33.008 H10 c-0.552 0 -1 0.449 -1 1.003 0 0.554 0.448 1.003 1 1.003 h23 c0.552 0 1 -0.449 1 -1.003 0 -0.554 -0.448 -1.003 -1 -1.003z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 33 33.008
                moveTo(x = 33.0f, y = 33.008f)
                // H 10
                horizontalLineTo(x = 10.0f)
                // c -0.552 0 -1 0.449 -1 1.003
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = 0.449f,
                    dx3 = -1.0f,
                    dy3 = 1.003f,
                )
                // c 0 0.554 0.448 1.003 1 1.003
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.554f,
                    dx2 = 0.448f,
                    dy2 = 1.003f,
                    dx3 = 1.0f,
                    dy3 = 1.003f,
                )
                // h 23
                horizontalLineToRelative(dx = 23.0f)
                // c 0.552 0 1 -0.449 1 -1.003
                curveToRelative(
                    dx1 = 0.552f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -0.449f,
                    dx3 = 1.0f,
                    dy3 = -1.003f,
                )
                // c 0 -0.554 -0.448 -1.003 -1 -1.003z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.554f,
                    dx2 = -0.448f,
                    dy2 = -1.003f,
                    dx3 = -1.0f,
                    dy3 = -1.003f,
                )
                close()
            }
            // M21 19 h1 v14 h-1z
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 21 19
                moveTo(x = 21.0f, y = 19.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // h -1z
                horizontalLineToRelative(dx = -1.0f)
                close()
            }
            // M14 27 h4 v6 h-4z
            path(
                fill = SolidColor(Color(0xFFC1694F)),
            ) {
                // M 14 27
                moveTo(x = 14.0f, y = 27.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // M14 20 h4 v4 h-4z M25 20 h4 v4 h-4z M25 27 h4 v4 h-4z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 14 20
                moveTo(x = 14.0f, y = 20.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
                // M 25 20
                moveTo(x = 25.0f, y = 20.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
                // M 25 27
                moveTo(x = 25.0f, y = 27.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // M21 19.603 c-0.256 0 -0.512 -0.098 -0.707 -0.293 -0.391 -0.391 -0.391 -1.023 0 -1.414 l6.5 -6.5 1.414 1.414 -6.5 6.5 c-0.195 0.196 -0.451 0.293 -0.707 0.293z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 21 19.603
                moveTo(x = 21.0f, y = 19.603f)
                // c -0.256 0 -0.512 -0.098 -0.707 -0.293
                curveToRelative(
                    dx1 = -0.256f,
                    dy1 = 0.0f,
                    dx2 = -0.512f,
                    dy2 = -0.098f,
                    dx3 = -0.707f,
                    dy3 = -0.293f,
                )
                // c -0.391 -0.391 -0.391 -1.023 0 -1.414
                curveToRelative(
                    dx1 = -0.391f,
                    dy1 = -0.391f,
                    dx2 = -0.391f,
                    dy2 = -1.023f,
                    dx3 = 0.0f,
                    dy3 = -1.414f,
                )
                // l 6.5 -6.5
                lineToRelative(dx = 6.5f, dy = -6.5f)
                // l 1.414 1.414
                lineToRelative(dx = 1.414f, dy = 1.414f)
                // l -6.5 6.5
                lineToRelative(dx = -6.5f, dy = 6.5f)
                // c -0.195 0.196 -0.451 0.293 -0.707 0.293z
                curveToRelative(
                    dx1 = -0.195f,
                    dy1 = 0.196f,
                    dx2 = -0.451f,
                    dy2 = 0.293f,
                    dx3 = -0.707f,
                    dy3 = 0.293f,
                )
                close()
            }
            // M32.884 19.603 c-0.265 0 -0.531 -0.101 -0.733 -0.304 L21.477 8.625 10.803 19.299 c-0.405 0.405 -1.061 0.405 -1.466 0 s-0.405 -1.061 0 -1.466 L20.744 6.426 c0.405 -0.405 1.061 -0.405 1.466 0 l11.407 11.407 c0.405 0.405 0.405 1.061 0 1.466 -0.202 0.203 -0.467 0.304 -0.733 0.304z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 32.884 19.603
                moveTo(x = 32.884f, y = 19.603f)
                // c -0.265 0 -0.531 -0.101 -0.733 -0.304
                curveToRelative(
                    dx1 = -0.265f,
                    dy1 = 0.0f,
                    dx2 = -0.531f,
                    dy2 = -0.101f,
                    dx3 = -0.733f,
                    dy3 = -0.304f,
                )
                // L 21.477 8.625
                lineTo(x = 21.477f, y = 8.625f)
                // L 10.803 19.299
                lineTo(x = 10.803f, y = 19.299f)
                // c -0.405 0.405 -1.061 0.405 -1.466 0
                curveToRelative(
                    dx1 = -0.405f,
                    dy1 = 0.405f,
                    dx2 = -1.061f,
                    dy2 = 0.405f,
                    dx3 = -1.466f,
                    dy3 = 0.0f,
                )
                // s -0.405 -1.061 0 -1.466
                reflectiveCurveToRelative(
                    dx1 = -0.405f,
                    dy1 = -1.061f,
                    dx2 = 0.0f,
                    dy2 = -1.466f,
                )
                // L 20.744 6.426
                lineTo(x = 20.744f, y = 6.426f)
                // c 0.405 -0.405 1.061 -0.405 1.466 0
                curveToRelative(
                    dx1 = 0.405f,
                    dy1 = -0.405f,
                    dx2 = 1.061f,
                    dy2 = -0.405f,
                    dx3 = 1.466f,
                    dy3 = 0.0f,
                )
                // l 11.407 11.407
                lineToRelative(dx = 11.407f, dy = 11.407f)
                // c 0.405 0.405 0.405 1.061 0 1.466
                curveToRelative(
                    dx1 = 0.405f,
                    dy1 = 0.405f,
                    dx2 = 0.405f,
                    dy2 = 1.061f,
                    dx3 = 0.0f,
                    dy3 = 1.466f,
                )
                // c -0.202 0.203 -0.467 0.304 -0.733 0.304z
                curveToRelative(
                    dx1 = -0.202f,
                    dy1 = 0.203f,
                    dx2 = -0.467f,
                    dy2 = 0.304f,
                    dx3 = -0.733f,
                    dy3 = 0.304f,
                )
                close()
            }
        }.build().also { _emoji1f3d8 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f3d8: ImageVector? = null
