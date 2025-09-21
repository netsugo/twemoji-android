package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f6e4: ImageVector
    get() {
        val current = _emoji1f6e4
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f6e4",
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
            // M29.313 4.678 c-0.274 0 -0.539 0.042 -0.787 0.119 -0.296 -0.843 -1.096 -1.449 -2.04 -1.449 -1.013 0 -1.86 0.697 -2.096 1.637 -0.25 -0.189 -0.559 -0.306 -0.898 -0.306 -0.827 0 -1.497 0.67 -1.497 1.497 0 0.201 0.041 0.392 0.114 0.567 -0.144 -0.04 -0.292 -0.068 -0.446 -0.068 C20.744 6.674 20 7.418 20 8.337 c0 0.919 0.744 1.663 1.663 1.663 h7.65 c1.469 0 2.661 -1.191 2.661 -2.661 0.001 -1.469 -1.192 -2.661 -2.661 -2.661z
            path(
                fill = SolidColor(Color(0xFFF5F8FA)),
            ) {
                // M 29.313 4.678
                moveTo(x = 29.313f, y = 4.678f)
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
                // C 20.744 6.674 20 7.418 20 8.337
                curveTo(
                    x1 = 20.744f,
                    y1 = 6.674f,
                    x2 = 20.0f,
                    y2 = 7.418f,
                    x3 = 20.0f,
                    y3 = 8.337f,
                )
                // c 0 0.919 0.744 1.663 1.663 1.663
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.919f,
                    dx2 = 0.744f,
                    dy2 = 1.663f,
                    dx3 = 1.663f,
                    dy3 = 1.663f,
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
                fill = SolidColor(Color(0xFFC1694F)),
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
                fill = SolidColor(Color(0xFFCCD6DD)),
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
                fill = SolidColor(Color(0xFF58595B)),
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
            // M9.25 36 h17.5 l-6.875 -17 h-3.75z
            path(
                fill = SolidColor(Color(0xFF808285)),
            ) {
                // M 9.25 36
                moveTo(x = 9.25f, y = 36.0f)
                // h 17.5
                horizontalLineToRelative(dx = 17.5f)
                // l -6.875 -17
                lineToRelative(dx = -6.875f, dy = -17.0f)
                // h -3.75z
                horizontalLineToRelative(dx = -3.75f)
                close()
            }
            // M28 35 c0 0.553 -0.447 1 -1 1 L9 36 c-0.552 0 -1 -0.447 -1 -1 0 -0.553 0.448 -1 1 -1 h18 c0.553 0 1 0.447 1 1z M26 31 c0 0.553 -0.447 1 -1 1 L11 32 c-0.552 0 -1 -0.447 -1 -1 0 -0.553 0.448 -1 1 -1 h14 c0.553 0 1 0.447 1 1z M24 27 c0 0.553 -0.447 1 -1 1 L13 28 c-0.552 0 -1 -0.447 -1 -1 0 -0.553 0.448 -1 1 -1 h10 c0.553 0 1 0.447 1 1z M22 23.7 c0 0.387 -0.224 0.7 -0.5 0.7 h-7 c-0.276 0 -0.5 -0.313 -0.5 -0.7 0 -0.387 0.224 -0.7 0.5 -0.7 h7 c0.276 0 0.5 0.313 0.5 0.7z M21 21.334 c0 0.221 -0.18 0.399 -0.4 0.399 h-5.2 c-0.221 0 -0.4 -0.179 -0.4 -0.399 v-0.201 c0 -0.221 0.179 -0.399 0.4 -0.399 h5.2 c0.221 0 0.4 0.179 0.4 0.399 v0.201z M20 19.232 c0 0.085 -0.18 0.412 -0.4 0.412 h-3.2 c-0.221 0 -0.4 -0.327 -0.4 -0.412 v-0.078 c0 -0.085 0.179 -0.154 0.4 -0.154 h3.2 c0.221 0 0.4 0.069 0.4 0.154 v0.078z
            path(
                fill = SolidColor(Color(0xFFA7A9AC)),
            ) {
                // M 28 35
                moveTo(x = 28.0f, y = 35.0f)
                // c 0 0.553 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // L 9 36
                lineTo(x = 9.0f, y = 36.0f)
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
                // h 18
                horizontalLineToRelative(dx = 18.0f)
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
                // M 26 31
                moveTo(x = 26.0f, y = 31.0f)
                // c 0 0.553 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // L 11 32
                lineTo(x = 11.0f, y = 32.0f)
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
                // h 14
                horizontalLineToRelative(dx = 14.0f)
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
                // M 24 27
                moveTo(x = 24.0f, y = 27.0f)
                // c 0 0.553 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // L 13 28
                lineTo(x = 13.0f, y = 28.0f)
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
                // h 10
                horizontalLineToRelative(dx = 10.0f)
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
                // M 22 23.7
                moveTo(x = 22.0f, y = 23.7f)
                // c 0 0.387 -0.224 0.7 -0.5 0.7
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.387f,
                    dx2 = -0.224f,
                    dy2 = 0.7f,
                    dx3 = -0.5f,
                    dy3 = 0.7f,
                )
                // h -7
                horizontalLineToRelative(dx = -7.0f)
                // c -0.276 0 -0.5 -0.313 -0.5 -0.7
                curveToRelative(
                    dx1 = -0.276f,
                    dy1 = 0.0f,
                    dx2 = -0.5f,
                    dy2 = -0.313f,
                    dx3 = -0.5f,
                    dy3 = -0.7f,
                )
                // c 0 -0.387 0.224 -0.7 0.5 -0.7
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.387f,
                    dx2 = 0.224f,
                    dy2 = -0.7f,
                    dx3 = 0.5f,
                    dy3 = -0.7f,
                )
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // c 0.276 0 0.5 0.313 0.5 0.7z
                curveToRelative(
                    dx1 = 0.276f,
                    dy1 = 0.0f,
                    dx2 = 0.5f,
                    dy2 = 0.313f,
                    dx3 = 0.5f,
                    dy3 = 0.7f,
                )
                close()
                // M 21 21.334
                moveTo(x = 21.0f, y = 21.334f)
                // c 0 0.221 -0.18 0.399 -0.4 0.399
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.221f,
                    dx2 = -0.18f,
                    dy2 = 0.399f,
                    dx3 = -0.4f,
                    dy3 = 0.399f,
                )
                // h -5.2
                horizontalLineToRelative(dx = -5.2f)
                // c -0.221 0 -0.4 -0.179 -0.4 -0.399
                curveToRelative(
                    dx1 = -0.221f,
                    dy1 = 0.0f,
                    dx2 = -0.4f,
                    dy2 = -0.179f,
                    dx3 = -0.4f,
                    dy3 = -0.399f,
                )
                // v -0.201
                verticalLineToRelative(dy = -0.201f)
                // c 0 -0.221 0.179 -0.399 0.4 -0.399
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.221f,
                    dx2 = 0.179f,
                    dy2 = -0.399f,
                    dx3 = 0.4f,
                    dy3 = -0.399f,
                )
                // h 5.2
                horizontalLineToRelative(dx = 5.2f)
                // c 0.221 0 0.4 0.179 0.4 0.399
                curveToRelative(
                    dx1 = 0.221f,
                    dy1 = 0.0f,
                    dx2 = 0.4f,
                    dy2 = 0.179f,
                    dx3 = 0.4f,
                    dy3 = 0.399f,
                )
                // v 0.201z
                verticalLineToRelative(dy = 0.201f)
                close()
                // M 20 19.232
                moveTo(x = 20.0f, y = 19.232f)
                // c 0 0.085 -0.18 0.412 -0.4 0.412
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.085f,
                    dx2 = -0.18f,
                    dy2 = 0.412f,
                    dx3 = -0.4f,
                    dy3 = 0.412f,
                )
                // h -3.2
                horizontalLineToRelative(dx = -3.2f)
                // c -0.221 0 -0.4 -0.327 -0.4 -0.412
                curveToRelative(
                    dx1 = -0.221f,
                    dy1 = 0.0f,
                    dx2 = -0.4f,
                    dy2 = -0.327f,
                    dx3 = -0.4f,
                    dy3 = -0.412f,
                )
                // v -0.078
                verticalLineToRelative(dy = -0.078f)
                // c 0 -0.085 0.179 -0.154 0.4 -0.154
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.085f,
                    dx2 = 0.179f,
                    dy2 = -0.154f,
                    dx3 = 0.4f,
                    dy3 = -0.154f,
                )
                // h 3.2
                horizontalLineToRelative(dx = 3.2f)
                // c 0.221 0 0.4 0.069 0.4 0.154
                curveToRelative(
                    dx1 = 0.221f,
                    dy1 = 0.0f,
                    dx2 = 0.4f,
                    dy2 = 0.069f,
                    dx3 = 0.4f,
                    dy3 = 0.154f,
                )
                // v 0.078z
                verticalLineToRelative(dy = 0.078f)
                close()
            }
            // M3.562 15.125 c2.133 0 3.554 2.252 4.621 2.252 1.067 0 1.207 -0.502 2.629 -0.502 S12.671 19 14.227 19 L0 19 l0.005 -2.001 s1.335 -1.874 3.557 -1.874z M32.438 16.312 c-2.133 0 -3.554 1.065 -4.621 1.065 -1.066 0 -1.269 -0.127 -2.691 -0.127 S23.329 19 21.773 19 L36 19 l-0.006 -2.001 s-1.334 -0.687 -3.556 -0.687z
            path(
                fill = SolidColor(Color(0xFF5C913B)),
            ) {
                // M 3.562 15.125
                moveTo(x = 3.562f, y = 15.125f)
                // c 2.133 0 3.554 2.252 4.621 2.252
                curveToRelative(
                    dx1 = 2.133f,
                    dy1 = 0.0f,
                    dx2 = 3.554f,
                    dy2 = 2.252f,
                    dx3 = 4.621f,
                    dy3 = 2.252f,
                )
                // c 1.067 0 1.207 -0.502 2.629 -0.502
                curveToRelative(
                    dx1 = 1.067f,
                    dy1 = 0.0f,
                    dx2 = 1.207f,
                    dy2 = -0.502f,
                    dx3 = 2.629f,
                    dy3 = -0.502f,
                )
                // S 12.671 19 14.227 19
                reflectiveCurveTo(
                    x1 = 12.671f,
                    y1 = 19.0f,
                    x2 = 14.227f,
                    y2 = 19.0f,
                )
                // L 0 19
                lineTo(x = 0.0f, y = 19.0f)
                // l 0.005 -2.001
                lineToRelative(dx = 0.005f, dy = -2.001f)
                // s 1.335 -1.874 3.557 -1.874z
                reflectiveCurveToRelative(
                    dx1 = 1.335f,
                    dy1 = -1.874f,
                    dx2 = 3.557f,
                    dy2 = -1.874f,
                )
                close()
                // M 32.438 16.312
                moveTo(x = 32.438f, y = 16.312f)
                // c -2.133 0 -3.554 1.065 -4.621 1.065
                curveToRelative(
                    dx1 = -2.133f,
                    dy1 = 0.0f,
                    dx2 = -3.554f,
                    dy2 = 1.065f,
                    dx3 = -4.621f,
                    dy3 = 1.065f,
                )
                // c -1.066 0 -1.269 -0.127 -2.691 -0.127
                curveToRelative(
                    dx1 = -1.066f,
                    dy1 = 0.0f,
                    dx2 = -1.269f,
                    dy2 = -0.127f,
                    dx3 = -2.691f,
                    dy3 = -0.127f,
                )
                // S 23.329 19 21.773 19
                reflectiveCurveTo(
                    x1 = 23.329f,
                    y1 = 19.0f,
                    x2 = 21.773f,
                    y2 = 19.0f,
                )
                // L 36 19
                lineTo(x = 36.0f, y = 19.0f)
                // l -0.006 -2.001
                lineToRelative(dx = -0.006f, dy = -2.001f)
                // s -1.334 -0.687 -3.556 -0.687z
                reflectiveCurveToRelative(
                    dx1 = -1.334f,
                    dy1 = -0.687f,
                    dx2 = -3.556f,
                    dy2 = -0.687f,
                )
                close()
            }
        }.build().also { _emoji1f6e4 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f6e4: ImageVector? = null
