package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f6e3: ImageVector
    get() {
        val current = _emoji1f6e3
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f6e3",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 32 s0 4 -4 4 H4 s-4 0 -4 -4 V4 c0 -4 4 -4 4 -4 h28 c4 0 4 4 4 4 v28z
            path(
                fill = SolidColor(Color(0xFF88C9F9)),
            ) {
                // M 36 32
                moveTo(x = 36.0f, y = 32.0f)
                // s 0 4 -4 4
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.0f,
                    dx2 = -4.0f,
                    dy2 = 4.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // s -4 0 -4 -4
                reflectiveCurveToRelative(
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = -4.0f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
                // c 0 -4 4 -4 4 -4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.0f,
                    dx2 = 4.0f,
                    dy2 = -4.0f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // c 4 0 4 4 4 4
                curveToRelative(
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = 4.0f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // v 28z
                verticalLineToRelative(dy = 28.0f)
                close()
            }
            // M0 32 c0 4 4 4 4 4 h28 c4 0 4 -4 4 -4 V19 H0 v13z
            path(
                fill = SolidColor(Color(0xFF77B255)),
            ) {
                // M 0 32
                moveTo(x = 0.0f, y = 32.0f)
                // c 0 4 4 4 4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.0f,
                    dx2 = 4.0f,
                    dy2 = 4.0f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // c 4 0 4 -4 4 -4
                curveToRelative(
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = -4.0f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // V 19
                verticalLineTo(y = 19.0f)
                // H 0
                horizontalLineTo(x = 0.0f)
                // v 13z
                verticalLineToRelative(dy = 13.0f)
                close()
            }
            // M31.313 2.678 c-0.274 0 -0.539 0.042 -0.787 0.119 -0.296 -0.843 -1.096 -1.449 -2.04 -1.449 -1.013 0 -1.86 0.697 -2.096 1.637 -0.25 -0.189 -0.559 -0.306 -0.898 -0.306 -0.827 0 -1.497 0.67 -1.497 1.497 0 0.201 0.041 0.392 0.114 0.567 -0.144 -0.04 -0.292 -0.068 -0.446 -0.068 C22.744 4.674 22 5.418 22 6.337 22 7.256 22.744 8 23.663 8 h7.65 c1.469 0 2.661 -1.191 2.661 -2.661 0.001 -1.469 -1.192 -2.661 -2.661 -2.661z
            path(
                fill = SolidColor(Color(0xFFF5F8FA)),
            ) {
                // M 31.313 2.678
                moveTo(x = 31.313f, y = 2.678f)
                // c -0.274 0 -0.539 0.042 -0.787 0.119
                curveToRelative(
                    dx1 = -0.274f,
                    dy1 = 0.0f,
                    dx2 = -0.539f,
                    dy2 = 0.042f,
                    dx3 = -0.787f,
                    dy3 = 0.119f,
                )
                // c -0.296 -0.843 -1.096 -1.449 -2.04 -1.449
                curveToRelative(
                    dx1 = -0.296f,
                    dy1 = -0.843f,
                    dx2 = -1.096f,
                    dy2 = -1.449f,
                    dx3 = -2.04f,
                    dy3 = -1.449f,
                )
                // c -1.013 0 -1.86 0.697 -2.096 1.637
                curveToRelative(
                    dx1 = -1.013f,
                    dy1 = 0.0f,
                    dx2 = -1.86f,
                    dy2 = 0.697f,
                    dx3 = -2.096f,
                    dy3 = 1.637f,
                )
                // c -0.25 -0.189 -0.559 -0.306 -0.898 -0.306
                curveToRelative(
                    dx1 = -0.25f,
                    dy1 = -0.189f,
                    dx2 = -0.559f,
                    dy2 = -0.306f,
                    dx3 = -0.898f,
                    dy3 = -0.306f,
                )
                // c -0.827 0 -1.497 0.67 -1.497 1.497
                curveToRelative(
                    dx1 = -0.827f,
                    dy1 = 0.0f,
                    dx2 = -1.497f,
                    dy2 = 0.67f,
                    dx3 = -1.497f,
                    dy3 = 1.497f,
                )
                // c 0 0.201 0.041 0.392 0.114 0.567
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.201f,
                    dx2 = 0.041f,
                    dy2 = 0.392f,
                    dx3 = 0.114f,
                    dy3 = 0.567f,
                )
                // c -0.144 -0.04 -0.292 -0.068 -0.446 -0.068
                curveToRelative(
                    dx1 = -0.144f,
                    dy1 = -0.04f,
                    dx2 = -0.292f,
                    dy2 = -0.068f,
                    dx3 = -0.446f,
                    dy3 = -0.068f,
                )
                // C 22.744 4.674 22 5.418 22 6.337
                curveTo(
                    x1 = 22.744f,
                    y1 = 4.674f,
                    x2 = 22.0f,
                    y2 = 5.418f,
                    x3 = 22.0f,
                    y3 = 6.337f,
                )
                // C 22 7.256 22.744 8 23.663 8
                curveTo(
                    x1 = 22.0f,
                    y1 = 7.256f,
                    x2 = 22.744f,
                    y2 = 8.0f,
                    x3 = 23.663f,
                    y3 = 8.0f,
                )
                // h 7.65
                horizontalLineToRelative(dx = 7.65f)
                // c 1.469 0 2.661 -1.191 2.661 -2.661
                curveToRelative(
                    dx1 = 1.469f,
                    dy1 = 0.0f,
                    dx2 = 2.661f,
                    dy2 = -1.191f,
                    dx3 = 2.661f,
                    dy3 = -2.661f,
                )
                // c 0.001 -1.469 -1.192 -2.661 -2.661 -2.661z
                curveToRelative(
                    dx1 = 0.001f,
                    dy1 = -1.469f,
                    dx2 = -1.192f,
                    dy2 = -2.661f,
                    dx3 = -2.661f,
                    dy3 = -2.661f,
                )
                close()
            }
            // M22.375 19 h-8.75 L2.263 35.616 C3.167 35.995 4 36 4 36 h28 c0.71 0 1.289 -0.13 1.77 -0.338 L22.375 19z
            path(
                fill = SolidColor(Color(0xFFD99E82)),
            ) {
                // M 22.375 19
                moveTo(x = 22.375f, y = 19.0f)
                // h -8.75
                horizontalLineToRelative(dx = -8.75f)
                // L 2.263 35.616
                lineTo(x = 2.263f, y = 35.616f)
                // C 3.167 35.995 4 36 4 36
                curveTo(
                    x1 = 3.167f,
                    y1 = 35.995f,
                    x2 = 4.0f,
                    y2 = 36.0f,
                    x3 = 4.0f,
                    y3 = 36.0f,
                )
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // c 0.71 0 1.289 -0.13 1.77 -0.338
                curveToRelative(
                    dx1 = 0.71f,
                    dy1 = 0.0f,
                    dx2 = 1.289f,
                    dy2 = -0.13f,
                    dx3 = 1.77f,
                    dy3 = -0.338f,
                )
                // L 22.375 19z
                lineTo(x = 22.375f, y = 19.0f)
                close()
            }
            // M4 36 h28 L21.375 19 h-6.75z
            path(
                fill = SolidColor(Color(0xFF58595B)),
            ) {
                // M 4 36
                moveTo(x = 4.0f, y = 36.0f)
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // L 21.375 19
                lineTo(x = 21.375f, y = 19.0f)
                // h -6.75z
                horizontalLineToRelative(dx = -6.75f)
                close()
            }
            // M6.625 36 h22.75 l-8.75 -17 h-5.25z
            path(
                fill = SolidColor(Color(0xFF808285)),
            ) {
                // M 6.625 36
                moveTo(x = 6.625f, y = 36.0f)
                // h 22.75
                horizontalLineToRelative(dx = 22.75f)
                // l -8.75 -17
                lineToRelative(dx = -8.75f, dy = -17.0f)
                // h -5.25z
                horizontalLineToRelative(dx = -5.25f)
                close()
            }
            // M24 36 h-1 l-4 -17 h0.469z M17 19 l-4 17 h-1 l4.484 -17z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 24 36
                moveTo(x = 24.0f, y = 36.0f)
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // l -4 -17
                lineToRelative(dx = -4.0f, dy = -17.0f)
                // h 0.469z
                horizontalLineToRelative(dx = 0.469f)
                close()
                // M 17 19
                moveTo(x = 17.0f, y = 19.0f)
                // l -4 17
                lineToRelative(dx = -4.0f, dy = 17.0f)
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // l 4.484 -17z
                lineToRelative(dx = 4.484f, dy = -17.0f)
                close()
            }
            // M12 33 h12 v1 L12 34z M12 30 h12 v1 L12 31z M11.938 27.312 h12 v1 h-12z M13 25 h10 v1 L13 26z M15 23 h6 v1 h-6z M15 21.312 h6 L21 22 h-6z M15 19.875 h6 v0.688 h-6z
            path(
                fill = SolidColor(Color(0xFF808285)),
            ) {
                // M 12 33
                moveTo(x = 12.0f, y = 33.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // L 12 34z
                lineTo(x = 12.0f, y = 34.0f)
                close()
                // M 12 30
                moveTo(x = 12.0f, y = 30.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // L 12 31z
                lineTo(x = 12.0f, y = 31.0f)
                close()
                // M 11.938 27.312
                moveTo(x = 11.938f, y = 27.312f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // h -12z
                horizontalLineToRelative(dx = -12.0f)
                close()
                // M 13 25
                moveTo(x = 13.0f, y = 25.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // L 13 26z
                lineTo(x = 13.0f, y = 26.0f)
                close()
                // M 15 23
                moveTo(x = 15.0f, y = 23.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // h -6z
                horizontalLineToRelative(dx = -6.0f)
                close()
                // M 15 21.312
                moveTo(x = 15.0f, y = 21.312f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // L 21 22
                lineTo(x = 21.0f, y = 22.0f)
                // h -6z
                horizontalLineToRelative(dx = -6.0f)
                close()
                // M 15 19.875
                moveTo(x = 15.0f, y = 19.875f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 0.688
                verticalLineToRelative(dy = 0.688f)
                // h -6z
                horizontalLineToRelative(dx = -6.0f)
                close()
            }
            // M8 21.5 c0 0.276 -0.224 0.5 -0.5 0.5 s-0.5 -0.224 -0.5 -0.5 v-11 c0 -0.276 0.224 -0.5 0.5 -0.5 s0.5 0.224 0.5 0.5 v11z M29 21.596 c0 0.223 -0.181 0.404 -0.404 0.404 h-0.191 c-0.224 0 -0.405 -0.181 -0.405 -0.404 L28 10.404 c0 -0.223 0.181 -0.404 0.404 -0.404 h0.191 c0.224 0 0.405 0.181 0.405 0.404 v11.192z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 8 21.5
                moveTo(x = 8.0f, y = 21.5f)
                // c 0 0.276 -0.224 0.5 -0.5 0.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.276f,
                    dx2 = -0.224f,
                    dy2 = 0.5f,
                    dx3 = -0.5f,
                    dy3 = 0.5f,
                )
                // s -0.5 -0.224 -0.5 -0.5
                reflectiveCurveToRelative(
                    dx1 = -0.5f,
                    dy1 = -0.224f,
                    dx2 = -0.5f,
                    dy2 = -0.5f,
                )
                // v -11
                verticalLineToRelative(dy = -11.0f)
                // c 0 -0.276 0.224 -0.5 0.5 -0.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.276f,
                    dx2 = 0.224f,
                    dy2 = -0.5f,
                    dx3 = 0.5f,
                    dy3 = -0.5f,
                )
                // s 0.5 0.224 0.5 0.5
                reflectiveCurveToRelative(
                    dx1 = 0.5f,
                    dy1 = 0.224f,
                    dx2 = 0.5f,
                    dy2 = 0.5f,
                )
                // v 11z
                verticalLineToRelative(dy = 11.0f)
                close()
                // M 29 21.596
                moveTo(x = 29.0f, y = 21.596f)
                // c 0 0.223 -0.181 0.404 -0.404 0.404
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.223f,
                    dx2 = -0.181f,
                    dy2 = 0.404f,
                    dx3 = -0.404f,
                    dy3 = 0.404f,
                )
                // h -0.191
                horizontalLineToRelative(dx = -0.191f)
                // c -0.224 0 -0.405 -0.181 -0.405 -0.404
                curveToRelative(
                    dx1 = -0.224f,
                    dy1 = 0.0f,
                    dx2 = -0.405f,
                    dy2 = -0.181f,
                    dx3 = -0.405f,
                    dy3 = -0.404f,
                )
                // L 28 10.404
                lineTo(x = 28.0f, y = 10.404f)
                // c 0 -0.223 0.181 -0.404 0.404 -0.404
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.223f,
                    dx2 = 0.181f,
                    dy2 = -0.404f,
                    dx3 = 0.404f,
                    dy3 = -0.404f,
                )
                // h 0.191
                horizontalLineToRelative(dx = 0.191f)
                // c 0.224 0 0.405 0.181 0.405 0.404
                curveToRelative(
                    dx1 = 0.224f,
                    dy1 = 0.0f,
                    dx2 = 0.405f,
                    dy2 = 0.181f,
                    dx3 = 0.405f,
                    dy3 = 0.404f,
                )
                // v 11.192z
                verticalLineToRelative(dy = 11.192f)
                close()
            }
            // M29 10.5 c0 0.276 -0.224 0.5 -0.5 0.5 h-21 c-0.276 0 -0.5 -0.224 -0.5 -0.5 s0.224 -0.5 0.5 -0.5 h21 c0.276 0 0.5 0.224 0.5 0.5z M29 15.616 c0 0.212 -0.172 0.384 -0.384 0.384 L7.384 16 C7.172 16 7 15.828 7 15.616 v-0.232 c0 -0.212 0.172 -0.384 0.384 -0.384 h21.232 c0.212 0 0.384 0.172 0.384 0.384 v0.232z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 29 10.5
                moveTo(x = 29.0f, y = 10.5f)
                // c 0 0.276 -0.224 0.5 -0.5 0.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.276f,
                    dx2 = -0.224f,
                    dy2 = 0.5f,
                    dx3 = -0.5f,
                    dy3 = 0.5f,
                )
                // h -21
                horizontalLineToRelative(dx = -21.0f)
                // c -0.276 0 -0.5 -0.224 -0.5 -0.5
                curveToRelative(
                    dx1 = -0.276f,
                    dy1 = 0.0f,
                    dx2 = -0.5f,
                    dy2 = -0.224f,
                    dx3 = -0.5f,
                    dy3 = -0.5f,
                )
                // s 0.224 -0.5 0.5 -0.5
                reflectiveCurveToRelative(
                    dx1 = 0.224f,
                    dy1 = -0.5f,
                    dx2 = 0.5f,
                    dy2 = -0.5f,
                )
                // h 21
                horizontalLineToRelative(dx = 21.0f)
                // c 0.276 0 0.5 0.224 0.5 0.5z
                curveToRelative(
                    dx1 = 0.276f,
                    dy1 = 0.0f,
                    dx2 = 0.5f,
                    dy2 = 0.224f,
                    dx3 = 0.5f,
                    dy3 = 0.5f,
                )
                close()
                // M 29 15.616
                moveTo(x = 29.0f, y = 15.616f)
                // c 0 0.212 -0.172 0.384 -0.384 0.384
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.212f,
                    dx2 = -0.172f,
                    dy2 = 0.384f,
                    dx3 = -0.384f,
                    dy3 = 0.384f,
                )
                // L 7.384 16
                lineTo(x = 7.384f, y = 16.0f)
                // C 7.172 16 7 15.828 7 15.616
                curveTo(
                    x1 = 7.172f,
                    y1 = 16.0f,
                    x2 = 7.0f,
                    y2 = 15.828f,
                    x3 = 7.0f,
                    y3 = 15.616f,
                )
                // v -0.232
                verticalLineToRelative(dy = -0.232f)
                // c 0 -0.212 0.172 -0.384 0.384 -0.384
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.212f,
                    dx2 = 0.172f,
                    dy2 = -0.384f,
                    dx3 = 0.384f,
                    dy3 = -0.384f,
                )
                // h 21.232
                horizontalLineToRelative(dx = 21.232f)
                // c 0.212 0 0.384 0.172 0.384 0.384
                curveToRelative(
                    dx1 = 0.212f,
                    dy1 = 0.0f,
                    dx2 = 0.384f,
                    dy2 = 0.172f,
                    dx3 = 0.384f,
                    dy3 = 0.384f,
                )
                // v 0.232z
                verticalLineToRelative(dy = 0.232f)
                close()
            }
            // M27 15 c0 0.552 -0.447 1 -1 1 H10 c-0.552 0 -1 -0.448 -1 -1 v-4 c0 -0.552 0.448 -1 1 -1 h16 c0.553 0 1 0.448 1 1 v4z
            path(
                fill = SolidColor(Color(0xFF5C913B)),
            ) {
                // M 27 15
                moveTo(x = 27.0f, y = 15.0f)
                // c 0 0.552 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // H 10
                horizontalLineTo(x = 10.0f)
                // c -0.552 0 -1 -0.448 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.448f,
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
                // h 16
                horizontalLineToRelative(dx = 16.0f)
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
            // M13 11 h2 v2 h-2z
            path(
                fill = SolidColor(Color(0xFFA6D488)),
            ) {
                // M 13 11
                moveTo(x = 13.0f, y = 11.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // M12 14 h4 v1 h-4z
            path(
                fill = SolidColor(Color(0xFF77B255)),
            ) {
                // M 12 14
                moveTo(x = 12.0f, y = 14.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // M21 11 h2 v2 h-2z
            path(
                fill = SolidColor(Color(0xFFA6D488)),
            ) {
                // M 21 11
                moveTo(x = 21.0f, y = 11.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // M20 14 h4 v1 h-4z
            path(
                fill = SolidColor(Color(0xFF77B255)),
            ) {
                // M 20 14
                moveTo(x = 20.0f, y = 14.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
        }.build().also { _emoji1f6e3 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f6e3: ImageVector? = null
