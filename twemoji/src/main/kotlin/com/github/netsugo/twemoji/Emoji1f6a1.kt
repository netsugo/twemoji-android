package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f6a1: ImageVector
    get() {
        val current = _emoji1f6a1
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f6a1",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M19 12 V5 h-2 v7 h-3 v3 h8 v-3z
            path(
                fill = SolidColor(Color(0xFF58595B)),
            ) {
                // M 19 12
                moveTo(x = 19.0f, y = 12.0f)
                // V 5
                verticalLineTo(y = 5.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v -3z
                verticalLineToRelative(dy = -3.0f)
                close()
            }
            // M33.213 10.977 L3.27 2.954 c-0.533 -0.144 -0.85 -0.691 -0.707 -1.226 0.143 -0.533 0.691 -0.85 1.225 -0.707 L33.73 9.045 c0.534 0.144 0.851 0.691 0.707 1.225 -0.142 0.534 -0.69 0.851 -1.224 0.707z
            path(
                fill = SolidColor(Color(0xFF6D6E71)),
            ) {
                // M 33.213 10.977
                moveTo(x = 33.213f, y = 10.977f)
                // L 3.27 2.954
                lineTo(x = 3.27f, y = 2.954f)
                // c -0.533 -0.144 -0.85 -0.691 -0.707 -1.226
                curveToRelative(
                    dx1 = -0.533f,
                    dy1 = -0.144f,
                    dx2 = -0.85f,
                    dy2 = -0.691f,
                    dx3 = -0.707f,
                    dy3 = -1.226f,
                )
                // c 0.143 -0.533 0.691 -0.85 1.225 -0.707
                curveToRelative(
                    dx1 = 0.143f,
                    dy1 = -0.533f,
                    dx2 = 0.691f,
                    dy2 = -0.85f,
                    dx3 = 1.225f,
                    dy3 = -0.707f,
                )
                // L 33.73 9.045
                lineTo(x = 33.73f, y = 9.045f)
                // c 0.534 0.144 0.851 0.691 0.707 1.225
                curveToRelative(
                    dx1 = 0.534f,
                    dy1 = 0.144f,
                    dx2 = 0.851f,
                    dy2 = 0.691f,
                    dx3 = 0.707f,
                    dy3 = 1.225f,
                )
                // c -0.142 0.534 -0.69 0.851 -1.224 0.707z
                curveToRelative(
                    dx1 = -0.142f,
                    dy1 = 0.534f,
                    dx2 = -0.69f,
                    dy2 = 0.851f,
                    dx3 = -1.224f,
                    dy3 = 0.707f,
                )
                close()
            }
            // M23.348 4.361 l-1.933 -0.518 0.259 -0.965 -5.795 -1.553 -0.259 0.966 -1.932 -0.518 c-1.067 -0.285 -2.164 0.348 -2.45 1.415 -0.286 1.066 0.348 2.163 1.414 2.449 l9.66 2.588 c1.066 0.286 2.163 -0.348 2.449 -1.414 0.286 -1.066 -0.347 -2.164 -1.413 -2.45z
            path(
                fill = SolidColor(Color(0xFFA7A9AC)),
            ) {
                // M 23.348 4.361
                moveTo(x = 23.348f, y = 4.361f)
                // l -1.933 -0.518
                lineToRelative(dx = -1.933f, dy = -0.518f)
                // l 0.259 -0.965
                lineToRelative(dx = 0.259f, dy = -0.965f)
                // l -5.795 -1.553
                lineToRelative(dx = -5.795f, dy = -1.553f)
                // l -0.259 0.966
                lineToRelative(dx = -0.259f, dy = 0.966f)
                // l -1.932 -0.518
                lineToRelative(dx = -1.932f, dy = -0.518f)
                // c -1.067 -0.285 -2.164 0.348 -2.45 1.415
                curveToRelative(
                    dx1 = -1.067f,
                    dy1 = -0.285f,
                    dx2 = -2.164f,
                    dy2 = 0.348f,
                    dx3 = -2.45f,
                    dy3 = 1.415f,
                )
                // c -0.286 1.066 0.348 2.163 1.414 2.449
                curveToRelative(
                    dx1 = -0.286f,
                    dy1 = 1.066f,
                    dx2 = 0.348f,
                    dy2 = 2.163f,
                    dx3 = 1.414f,
                    dy3 = 2.449f,
                )
                // l 9.66 2.588
                lineToRelative(dx = 9.66f, dy = 2.588f)
                // c 1.066 0.286 2.163 -0.348 2.449 -1.414
                curveToRelative(
                    dx1 = 1.066f,
                    dy1 = 0.286f,
                    dx2 = 2.163f,
                    dy2 = -0.348f,
                    dx3 = 2.449f,
                    dy3 = -1.414f,
                )
                // c 0.286 -1.066 -0.347 -2.164 -1.413 -2.45z
                curveToRelative(
                    dx1 = 0.286f,
                    dy1 = -1.066f,
                    dx2 = -0.347f,
                    dy2 = -2.164f,
                    dx3 = -1.413f,
                    dy3 = -2.45f,
                )
                close()
            }
            // M13.877 4.931 c-0.286 1.066 -1.383 1.7 -2.45 1.414 -1.066 -0.286 -1.7 -1.383 -1.414 -2.449 0.286 -1.067 1.383 -1.7 2.449 -1.415 1.068 0.286 1.701 1.382 1.415 2.45z M25.469 8.036 c-0.286 1.067 -1.383 1.7 -2.449 1.414 -1.067 -0.286 -1.7 -1.382 -1.414 -2.449 0.285 -1.067 1.382 -1.7 2.449 -1.414 1.066 0.286 1.7 1.383 1.414 2.449z
            path(
                fill = SolidColor(Color(0xFF808285)),
            ) {
                // M 13.877 4.931
                moveTo(x = 13.877f, y = 4.931f)
                // c -0.286 1.066 -1.383 1.7 -2.45 1.414
                curveToRelative(
                    dx1 = -0.286f,
                    dy1 = 1.066f,
                    dx2 = -1.383f,
                    dy2 = 1.7f,
                    dx3 = -2.45f,
                    dy3 = 1.414f,
                )
                // c -1.066 -0.286 -1.7 -1.383 -1.414 -2.449
                curveToRelative(
                    dx1 = -1.066f,
                    dy1 = -0.286f,
                    dx2 = -1.7f,
                    dy2 = -1.383f,
                    dx3 = -1.414f,
                    dy3 = -2.449f,
                )
                // c 0.286 -1.067 1.383 -1.7 2.449 -1.415
                curveToRelative(
                    dx1 = 0.286f,
                    dy1 = -1.067f,
                    dx2 = 1.383f,
                    dy2 = -1.7f,
                    dx3 = 2.449f,
                    dy3 = -1.415f,
                )
                // c 1.068 0.286 1.701 1.382 1.415 2.45z
                curveToRelative(
                    dx1 = 1.068f,
                    dy1 = 0.286f,
                    dx2 = 1.701f,
                    dy2 = 1.382f,
                    dx3 = 1.415f,
                    dy3 = 2.45f,
                )
                close()
                // M 25.469 8.036
                moveTo(x = 25.469f, y = 8.036f)
                // c -0.286 1.067 -1.383 1.7 -2.449 1.414
                curveToRelative(
                    dx1 = -0.286f,
                    dy1 = 1.067f,
                    dx2 = -1.383f,
                    dy2 = 1.7f,
                    dx3 = -2.449f,
                    dy3 = 1.414f,
                )
                // c -1.067 -0.286 -1.7 -1.382 -1.414 -2.449
                curveToRelative(
                    dx1 = -1.067f,
                    dy1 = -0.286f,
                    dx2 = -1.7f,
                    dy2 = -1.382f,
                    dx3 = -1.414f,
                    dy3 = -2.449f,
                )
                // c 0.285 -1.067 1.382 -1.7 2.449 -1.414
                curveToRelative(
                    dx1 = 0.285f,
                    dy1 = -1.067f,
                    dx2 = 1.382f,
                    dy2 = -1.7f,
                    dx3 = 2.449f,
                    dy3 = -1.414f,
                )
                // c 1.066 0.286 1.7 1.383 1.414 2.449z
                curveToRelative(
                    dx1 = 1.066f,
                    dy1 = 0.286f,
                    dx2 = 1.7f,
                    dy2 = 1.383f,
                    dx3 = 1.414f,
                    dy3 = 2.449f,
                )
                close()
            }
            // M6 32 c0 2.209 1.791 4 4 4 h16 c2.209 0 4 -1.791 4 -4 v-5 L6 27 v5z M26 14 L10 14 c-1.477 0 -2.752 0.809 -3.445 2 h22.89 c-0.693 -1.191 -1.968 -2 -3.445 -2z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 6 32
                moveTo(x = 6.0f, y = 32.0f)
                // c 0 2.209 1.791 4 4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = 1.791f,
                    dy2 = 4.0f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // c 2.209 0 4 -1.791 4 -4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = -1.791f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // L 6 27
                lineTo(x = 6.0f, y = 27.0f)
                // v 5z
                verticalLineToRelative(dy = 5.0f)
                close()
                // M 26 14
                moveTo(x = 26.0f, y = 14.0f)
                // L 10 14
                lineTo(x = 10.0f, y = 14.0f)
                // c -1.477 0 -2.752 0.809 -3.445 2
                curveToRelative(
                    dx1 = -1.477f,
                    dy1 = 0.0f,
                    dx2 = -2.752f,
                    dy2 = 0.809f,
                    dx3 = -3.445f,
                    dy3 = 2.0f,
                )
                // h 22.89
                horizontalLineToRelative(dx = 22.89f)
                // c -0.693 -1.191 -1.968 -2 -3.445 -2z
                curveToRelative(
                    dx1 = -0.693f,
                    dy1 = -1.191f,
                    dx2 = -1.968f,
                    dy2 = -2.0f,
                    dx3 = -3.445f,
                    dy3 = -2.0f,
                )
                close()
            }
            // M6 18 h24 v9 H6z
            path(
                fill = SolidColor(Color(0xFF88C9F9)),
            ) {
                // M 6 18
                moveTo(x = 6.0f, y = 18.0f)
                // h 24
                horizontalLineToRelative(dx = 24.0f)
                // v 9
                verticalLineToRelative(dy = 9.0f)
                // H 6z
                horizontalLineTo(x = 6.0f)
                close()
            }
            // M6.555 16 C6.211 16.59 6 17.268 6 18 h24 c0 -0.732 -0.211 -1.41 -0.555 -2 H6.555z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 6.555 16
                moveTo(x = 6.555f, y = 16.0f)
                // C 6.211 16.59 6 17.268 6 18
                curveTo(
                    x1 = 6.211f,
                    y1 = 16.59f,
                    x2 = 6.0f,
                    y2 = 17.268f,
                    x3 = 6.0f,
                    y3 = 18.0f,
                )
                // h 24
                horizontalLineToRelative(dx = 24.0f)
                // c 0 -0.732 -0.211 -1.41 -0.555 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.732f,
                    dx2 = -0.211f,
                    dy2 = -1.41f,
                    dx3 = -0.555f,
                    dy3 = -2.0f,
                )
                // H 6.555z
                horizontalLineTo(x = 6.555f)
                close()
            }
            // M12 16 h2 v11 h-2z M21 16 h2 v11 h-2z
            path(
                fill = SolidColor(Color(0xFF231F20)),
            ) {
                // M 12 16
                moveTo(x = 12.0f, y = 16.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 11
                verticalLineToRelative(dy = 11.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
                // M 21 16
                moveTo(x = 21.0f, y = 16.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 11
                verticalLineToRelative(dy = 11.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
        }.build().also { _emoji1f6a1 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f6a1: ImageVector? = null
