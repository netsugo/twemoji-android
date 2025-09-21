package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f3cd: ImageVector
    get() {
        val current = _emoji1f3cd
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f3cd",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M6.5 24 C3.462 24 1 26.463 1 29.5 S3.462 35 6.5 35 s5.5 -2.463 5.5 -5.5 S9.538 24 6.5 24z M6.5 33 C4.567 33 3 31.433 3 29.5 S4.567 26 6.5 26 s3.5 1.567 3.5 3.5 S8.433 33 6.5 33z M29.5 24 c-3.037 0 -5.5 2.463 -5.5 5.5 s2.463 5.5 5.5 5.5 5.5 -2.463 5.5 -5.5 -2.463 -5.5 -5.5 -5.5z M29.5 33 c-1.934 0 -3.5 -1.567 -3.5 -3.5 s1.566 -3.5 3.5 -3.5 3.5 1.567 3.5 3.5 -1.566 3.5 -3.5 3.5z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 6.5 24
                moveTo(x = 6.5f, y = 24.0f)
                // C 3.462 24 1 26.463 1 29.5
                curveTo(
                    x1 = 3.462f,
                    y1 = 24.0f,
                    x2 = 1.0f,
                    y2 = 26.463f,
                    x3 = 1.0f,
                    y3 = 29.5f,
                )
                // S 3.462 35 6.5 35
                reflectiveCurveTo(
                    x1 = 3.462f,
                    y1 = 35.0f,
                    x2 = 6.5f,
                    y2 = 35.0f,
                )
                // s 5.5 -2.463 5.5 -5.5
                reflectiveCurveToRelative(
                    dx1 = 5.5f,
                    dy1 = -2.463f,
                    dx2 = 5.5f,
                    dy2 = -5.5f,
                )
                // S 9.538 24 6.5 24z
                reflectiveCurveTo(
                    x1 = 9.538f,
                    y1 = 24.0f,
                    x2 = 6.5f,
                    y2 = 24.0f,
                )
                close()
                // M 6.5 33
                moveTo(x = 6.5f, y = 33.0f)
                // C 4.567 33 3 31.433 3 29.5
                curveTo(
                    x1 = 4.567f,
                    y1 = 33.0f,
                    x2 = 3.0f,
                    y2 = 31.433f,
                    x3 = 3.0f,
                    y3 = 29.5f,
                )
                // S 4.567 26 6.5 26
                reflectiveCurveTo(
                    x1 = 4.567f,
                    y1 = 26.0f,
                    x2 = 6.5f,
                    y2 = 26.0f,
                )
                // s 3.5 1.567 3.5 3.5
                reflectiveCurveToRelative(
                    dx1 = 3.5f,
                    dy1 = 1.567f,
                    dx2 = 3.5f,
                    dy2 = 3.5f,
                )
                // S 8.433 33 6.5 33z
                reflectiveCurveTo(
                    x1 = 8.433f,
                    y1 = 33.0f,
                    x2 = 6.5f,
                    y2 = 33.0f,
                )
                close()
                // M 29.5 24
                moveTo(x = 29.5f, y = 24.0f)
                // c -3.037 0 -5.5 2.463 -5.5 5.5
                curveToRelative(
                    dx1 = -3.037f,
                    dy1 = 0.0f,
                    dx2 = -5.5f,
                    dy2 = 2.463f,
                    dx3 = -5.5f,
                    dy3 = 5.5f,
                )
                // s 2.463 5.5 5.5 5.5
                reflectiveCurveToRelative(
                    dx1 = 2.463f,
                    dy1 = 5.5f,
                    dx2 = 5.5f,
                    dy2 = 5.5f,
                )
                // s 5.5 -2.463 5.5 -5.5
                reflectiveCurveToRelative(
                    dx1 = 5.5f,
                    dy1 = -2.463f,
                    dx2 = 5.5f,
                    dy2 = -5.5f,
                )
                // s -2.463 -5.5 -5.5 -5.5z
                reflectiveCurveToRelative(
                    dx1 = -2.463f,
                    dy1 = -5.5f,
                    dx2 = -5.5f,
                    dy2 = -5.5f,
                )
                close()
                // M 29.5 33
                moveTo(x = 29.5f, y = 33.0f)
                // c -1.934 0 -3.5 -1.567 -3.5 -3.5
                curveToRelative(
                    dx1 = -1.934f,
                    dy1 = 0.0f,
                    dx2 = -3.5f,
                    dy2 = -1.567f,
                    dx3 = -3.5f,
                    dy3 = -3.5f,
                )
                // s 1.566 -3.5 3.5 -3.5
                reflectiveCurveToRelative(
                    dx1 = 1.566f,
                    dy1 = -3.5f,
                    dx2 = 3.5f,
                    dy2 = -3.5f,
                )
                // s 3.5 1.567 3.5 3.5
                reflectiveCurveToRelative(
                    dx1 = 3.5f,
                    dy1 = 1.567f,
                    dx2 = 3.5f,
                    dy2 = 3.5f,
                )
                // s -1.566 3.5 -3.5 3.5z
                reflectiveCurveToRelative(
                    dx1 = -1.566f,
                    dy1 = 3.5f,
                    dx2 = -3.5f,
                    dy2 = 3.5f,
                )
                close()
            }
            // M6.5 22.914 c-3.59 0 -6.5 2.91 -6.5 6.5 s2.91 6.5 6.5 6.5 6.5 -2.91 6.5 -6.5 -2.91 -6.5 -6.5 -6.5z M6.5 33.914 c-2.485 0 -4.5 -2.015 -4.5 -4.5 s2.015 -4.5 4.5 -4.5 4.5 2.015 4.5 4.5 -2.015 4.5 -4.5 4.5z M29.5 22.914 c-3.59 0 -6.5 2.91 -6.5 6.5 s2.91 6.5 6.5 6.5 6.5 -2.91 6.5 -6.5 -2.91 -6.5 -6.5 -6.5z M29.5 33.914 c-2.485 0 -4.5 -2.015 -4.5 -4.5 s2.015 -4.5 4.5 -4.5 4.5 2.015 4.5 4.5 -2.015 4.5 -4.5 4.5z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 6.5 22.914
                moveTo(x = 6.5f, y = 22.914f)
                // c -3.59 0 -6.5 2.91 -6.5 6.5
                curveToRelative(
                    dx1 = -3.59f,
                    dy1 = 0.0f,
                    dx2 = -6.5f,
                    dy2 = 2.91f,
                    dx3 = -6.5f,
                    dy3 = 6.5f,
                )
                // s 2.91 6.5 6.5 6.5
                reflectiveCurveToRelative(
                    dx1 = 2.91f,
                    dy1 = 6.5f,
                    dx2 = 6.5f,
                    dy2 = 6.5f,
                )
                // s 6.5 -2.91 6.5 -6.5
                reflectiveCurveToRelative(
                    dx1 = 6.5f,
                    dy1 = -2.91f,
                    dx2 = 6.5f,
                    dy2 = -6.5f,
                )
                // s -2.91 -6.5 -6.5 -6.5z
                reflectiveCurveToRelative(
                    dx1 = -2.91f,
                    dy1 = -6.5f,
                    dx2 = -6.5f,
                    dy2 = -6.5f,
                )
                close()
                // M 6.5 33.914
                moveTo(x = 6.5f, y = 33.914f)
                // c -2.485 0 -4.5 -2.015 -4.5 -4.5
                curveToRelative(
                    dx1 = -2.485f,
                    dy1 = 0.0f,
                    dx2 = -4.5f,
                    dy2 = -2.015f,
                    dx3 = -4.5f,
                    dy3 = -4.5f,
                )
                // s 2.015 -4.5 4.5 -4.5
                reflectiveCurveToRelative(
                    dx1 = 2.015f,
                    dy1 = -4.5f,
                    dx2 = 4.5f,
                    dy2 = -4.5f,
                )
                // s 4.5 2.015 4.5 4.5
                reflectiveCurveToRelative(
                    dx1 = 4.5f,
                    dy1 = 2.015f,
                    dx2 = 4.5f,
                    dy2 = 4.5f,
                )
                // s -2.015 4.5 -4.5 4.5z
                reflectiveCurveToRelative(
                    dx1 = -2.015f,
                    dy1 = 4.5f,
                    dx2 = -4.5f,
                    dy2 = 4.5f,
                )
                close()
                // M 29.5 22.914
                moveTo(x = 29.5f, y = 22.914f)
                // c -3.59 0 -6.5 2.91 -6.5 6.5
                curveToRelative(
                    dx1 = -3.59f,
                    dy1 = 0.0f,
                    dx2 = -6.5f,
                    dy2 = 2.91f,
                    dx3 = -6.5f,
                    dy3 = 6.5f,
                )
                // s 2.91 6.5 6.5 6.5
                reflectiveCurveToRelative(
                    dx1 = 2.91f,
                    dy1 = 6.5f,
                    dx2 = 6.5f,
                    dy2 = 6.5f,
                )
                // s 6.5 -2.91 6.5 -6.5
                reflectiveCurveToRelative(
                    dx1 = 6.5f,
                    dy1 = -2.91f,
                    dx2 = 6.5f,
                    dy2 = -6.5f,
                )
                // s -2.91 -6.5 -6.5 -6.5z
                reflectiveCurveToRelative(
                    dx1 = -2.91f,
                    dy1 = -6.5f,
                    dx2 = -6.5f,
                    dy2 = -6.5f,
                )
                close()
                // M 29.5 33.914
                moveTo(x = 29.5f, y = 33.914f)
                // c -2.485 0 -4.5 -2.015 -4.5 -4.5
                curveToRelative(
                    dx1 = -2.485f,
                    dy1 = 0.0f,
                    dx2 = -4.5f,
                    dy2 = -2.015f,
                    dx3 = -4.5f,
                    dy3 = -4.5f,
                )
                // s 2.015 -4.5 4.5 -4.5
                reflectiveCurveToRelative(
                    dx1 = 2.015f,
                    dy1 = -4.5f,
                    dx2 = 4.5f,
                    dy2 = -4.5f,
                )
                // s 4.5 2.015 4.5 4.5
                reflectiveCurveToRelative(
                    dx1 = 4.5f,
                    dy1 = 2.015f,
                    dx2 = 4.5f,
                    dy2 = 4.5f,
                )
                // s -2.015 4.5 -4.5 4.5z
                reflectiveCurveToRelative(
                    dx1 = -2.015f,
                    dy1 = 4.5f,
                    dx2 = -4.5f,
                    dy2 = 4.5f,
                )
                close()
            }
            // M7.001 27.051 c-2 4 0.999 2.587 1.999 0.587 0.905 -1.811 3.444 -2.429 4.66 -0.375 C12.708 24.213 9.863 22 6.5 22 c-1.374 0 -2.657 0.375 -3.764 1.02 2.833 0.165 5.366 1.831 4.265 4.031z
            path(
                fill = SolidColor(Color(0xFF77B255)),
            ) {
                // M 7.001 27.051
                moveTo(x = 7.001f, y = 27.051f)
                // c -2 4 0.999 2.587 1.999 0.587
                curveToRelative(
                    dx1 = -2.0f,
                    dy1 = 4.0f,
                    dx2 = 0.999f,
                    dy2 = 2.587f,
                    dx3 = 1.999f,
                    dy3 = 0.587f,
                )
                // c 0.905 -1.811 3.444 -2.429 4.66 -0.375
                curveToRelative(
                    dx1 = 0.905f,
                    dy1 = -1.811f,
                    dx2 = 3.444f,
                    dy2 = -2.429f,
                    dx3 = 4.66f,
                    dy3 = -0.375f,
                )
                // C 12.708 24.213 9.863 22 6.5 22
                curveTo(
                    x1 = 12.708f,
                    y1 = 24.213f,
                    x2 = 9.863f,
                    y2 = 22.0f,
                    x3 = 6.5f,
                    y3 = 22.0f,
                )
                // c -1.374 0 -2.657 0.375 -3.764 1.02
                curveToRelative(
                    dx1 = -1.374f,
                    dy1 = 0.0f,
                    dx2 = -2.657f,
                    dy2 = 0.375f,
                    dx3 = -3.764f,
                    dy3 = 1.02f,
                )
                // c 2.833 0.165 5.366 1.831 4.265 4.031z
                curveToRelative(
                    dx1 = 2.833f,
                    dy1 = 0.165f,
                    dx2 = 5.366f,
                    dy2 = 1.831f,
                    dx3 = 4.265f,
                    dy3 = 4.031f,
                )
                close()
            }
            // M30 29 c0 0.553 -0.447 1 -1 1 h-9 c-0.553 0 -1 -0.447 -1 -1 0 -0.553 0.447 -1 1 -1 h9 c0.553 0 1 0.447 1 1z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 30 29
                moveTo(x = 30.0f, y = 29.0f)
                // c 0 0.553 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // h -9
                horizontalLineToRelative(dx = -9.0f)
                // c -0.553 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.553f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // c 0 -0.553 0.447 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.553f,
                    dx2 = 0.447f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 9
                horizontalLineToRelative(dx = 9.0f)
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
            // M29.923 30.306 c-0.433 0.344 -1.062 0.272 -1.405 -0.161 L22.917 23.1 c-0.344 -0.433 -0.271 -1.062 0.16 -1.405 0.433 -0.344 1.062 -0.272 1.405 0.161 l5.601 7.045 c0.344 0.432 0.271 1.061 -0.16 1.405z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 29.923 30.306
                moveTo(x = 29.923f, y = 30.306f)
                // c -0.433 0.344 -1.062 0.272 -1.405 -0.161
                curveToRelative(
                    dx1 = -0.433f,
                    dy1 = 0.344f,
                    dx2 = -1.062f,
                    dy2 = 0.272f,
                    dx3 = -1.405f,
                    dy3 = -0.161f,
                )
                // L 22.917 23.1
                lineTo(x = 22.917f, y = 23.1f)
                // c -0.344 -0.433 -0.271 -1.062 0.16 -1.405
                curveToRelative(
                    dx1 = -0.344f,
                    dy1 = -0.433f,
                    dx2 = -0.271f,
                    dy2 = -1.062f,
                    dx3 = 0.16f,
                    dy3 = -1.405f,
                )
                // c 0.433 -0.344 1.062 -0.272 1.405 0.161
                curveToRelative(
                    dx1 = 0.433f,
                    dy1 = -0.344f,
                    dx2 = 1.062f,
                    dy2 = -0.272f,
                    dx3 = 1.405f,
                    dy3 = 0.161f,
                )
                // l 5.601 7.045
                lineToRelative(dx = 5.601f, dy = 7.045f)
                // c 0.344 0.432 0.271 1.061 -0.16 1.405z
                curveToRelative(
                    dx1 = 0.344f,
                    dy1 = 0.432f,
                    dx2 = 0.271f,
                    dy2 = 1.061f,
                    dx3 = -0.16f,
                    dy3 = 1.405f,
                )
                close()
            }
            // M12.463 20.367 c0.466 0.297 0.602 0.915 0.304 1.381 L7.918 29.33 c-0.298 0.465 -0.916 0.602 -1.381 0.303 -0.466 -0.297 -0.602 -0.915 -0.304 -1.381 l4.849 -7.582 c0.298 -0.465 0.916 -0.602 1.381 -0.303z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 12.463 20.367
                moveTo(x = 12.463f, y = 20.367f)
                // c 0.466 0.297 0.602 0.915 0.304 1.381
                curveToRelative(
                    dx1 = 0.466f,
                    dy1 = 0.297f,
                    dx2 = 0.602f,
                    dy2 = 0.915f,
                    dx3 = 0.304f,
                    dy3 = 1.381f,
                )
                // L 7.918 29.33
                lineTo(x = 7.918f, y = 29.33f)
                // c -0.298 0.465 -0.916 0.602 -1.381 0.303
                curveToRelative(
                    dx1 = -0.298f,
                    dy1 = 0.465f,
                    dx2 = -0.916f,
                    dy2 = 0.602f,
                    dx3 = -1.381f,
                    dy3 = 0.303f,
                )
                // c -0.466 -0.297 -0.602 -0.915 -0.304 -1.381
                curveToRelative(
                    dx1 = -0.466f,
                    dy1 = -0.297f,
                    dx2 = -0.602f,
                    dy2 = -0.915f,
                    dx3 = -0.304f,
                    dy3 = -1.381f,
                )
                // l 4.849 -7.582
                lineToRelative(dx = 4.849f, dy = -7.582f)
                // c 0.298 -0.465 0.916 -0.602 1.381 -0.303z
                curveToRelative(
                    dx1 = 0.298f,
                    dy1 = -0.465f,
                    dx2 = 0.916f,
                    dy2 = -0.602f,
                    dx3 = 1.381f,
                    dy3 = -0.303f,
                )
                close()
            }
            // M10.529 17.368 C9.718 17.953 6 19 9 21 s5.094 4.125 5.094 6 c0 2.665 -0.656 4 0.906 4 h7 s-1 -4 2 -7 5 -2 8 -3 c1.897 -0.633 4 -2 4 -3 s0 -2 -2 -1 -1 1.551 -3 0.551 -3.16 0.449 -4.16 0.449 -7.614 1.68 -8.62 -0.049 C17.667 17 16.434 16 14.616 16 c-1.318 0 -3.116 0.667 -4.087 1.368z
            path(
                fill = SolidColor(Color(0xFF77B255)),
            ) {
                // M 10.529 17.368
                moveTo(x = 10.529f, y = 17.368f)
                // C 9.718 17.953 6 19 9 21
                curveTo(
                    x1 = 9.718f,
                    y1 = 17.953f,
                    x2 = 6.0f,
                    y2 = 19.0f,
                    x3 = 9.0f,
                    y3 = 21.0f,
                )
                // s 5.094 4.125 5.094 6
                reflectiveCurveToRelative(
                    dx1 = 5.094f,
                    dy1 = 4.125f,
                    dx2 = 5.094f,
                    dy2 = 6.0f,
                )
                // c 0 2.665 -0.656 4 0.906 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.665f,
                    dx2 = -0.656f,
                    dy2 = 4.0f,
                    dx3 = 0.906f,
                    dy3 = 4.0f,
                )
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // s -1 -4 2 -7
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = -4.0f,
                    dx2 = 2.0f,
                    dy2 = -7.0f,
                )
                // s 5 -2 8 -3
                reflectiveCurveToRelative(
                    dx1 = 5.0f,
                    dy1 = -2.0f,
                    dx2 = 8.0f,
                    dy2 = -3.0f,
                )
                // c 1.897 -0.633 4 -2 4 -3
                curveToRelative(
                    dx1 = 1.897f,
                    dy1 = -0.633f,
                    dx2 = 4.0f,
                    dy2 = -2.0f,
                    dx3 = 4.0f,
                    dy3 = -3.0f,
                )
                // s 0 -2 -2 -1
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                    dx2 = -2.0f,
                    dy2 = -1.0f,
                )
                // s -1 1.551 -3 0.551
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 1.551f,
                    dx2 = -3.0f,
                    dy2 = 0.551f,
                )
                // s -3.16 0.449 -4.16 0.449
                reflectiveCurveToRelative(
                    dx1 = -3.16f,
                    dy1 = 0.449f,
                    dx2 = -4.16f,
                    dy2 = 0.449f,
                )
                // s -7.614 1.68 -8.62 -0.049
                reflectiveCurveToRelative(
                    dx1 = -7.614f,
                    dy1 = 1.68f,
                    dx2 = -8.62f,
                    dy2 = -0.049f,
                )
                // C 17.667 17 16.434 16 14.616 16
                curveTo(
                    x1 = 17.667f,
                    y1 = 17.0f,
                    x2 = 16.434f,
                    y2 = 16.0f,
                    x3 = 14.616f,
                    y3 = 16.0f,
                )
                // c -1.318 0 -3.116 0.667 -4.087 1.368z
                curveToRelative(
                    dx1 = -1.318f,
                    dy1 = 0.0f,
                    dx2 = -3.116f,
                    dy2 = 0.667f,
                    dx3 = -4.087f,
                    dy3 = 1.368f,
                )
                close()
            }
            // M21 29 c0 1.104 -0.895 2 -2 2 -1.104 0 -2 -0.896 -2 -2 s0.896 -2 2 -2 c1.105 0 2 0.896 2 2z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 21 29
                moveTo(x = 21.0f, y = 29.0f)
                // c 0 1.104 -0.895 2 -2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = -0.895f,
                    dy2 = 2.0f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
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
                // c 1.105 0 2 0.896 2 2z
                curveToRelative(
                    dx1 = 1.105f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 0.896f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                close()
            }
            // M25.8 27.975 l9.277 -3.732 1.12 2.783 -9.278 3.732z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 25.8 27.975
                moveTo(x = 25.8f, y = 27.975f)
                // l 9.277 -3.732
                lineToRelative(dx = 9.277f, dy = -3.732f)
                // l 1.12 2.783
                lineToRelative(dx = 1.12f, dy = 2.783f)
                // l -9.278 3.732z
                lineToRelative(dx = -9.278f, dy = 3.732f)
                close()
            }
            // M26.173 28.902 l9.277 -3.732 0.373 0.928 -9.277 3.732z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 26.173 28.902
                moveTo(x = 26.173f, y = 28.902f)
                // l 9.277 -3.732
                lineToRelative(dx = 9.277f, dy = -3.732f)
                // l 0.373 0.928
                lineToRelative(dx = 0.373f, dy = 0.928f)
                // l -9.277 3.732z
                lineToRelative(dx = -9.277f, dy = 3.732f)
                close()
            }
            // M26.546 29.83 l9.277 -3.731 0.373 0.927 -9.277 3.732z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 26.546 29.83
                moveTo(x = 26.546f, y = 29.83f)
                // l 9.277 -3.731
                lineToRelative(dx = 9.277f, dy = -3.731f)
                // l 0.373 0.927
                lineToRelative(dx = 0.373f, dy = 0.927f)
                // l -9.277 3.732z
                lineToRelative(dx = -9.277f, dy = 3.732f)
                close()
            }
            // M19 18.137 c1.366 0.385 5.645 -0.007 6.802 -0.098 1.157 -0.09 1.594 0.451 0 1.25 C24 20.19 20.188 22.45 19 22.914 c-0.998 0.391 -4.5 -1.211 -4.917 -1.696 -0.416 -0.486 3.745 -3.411 4.917 -3.081z M34 17 c-1.549 0.04 -3 0 -4 0 s-1.158 1.102 1.549 1.102 S34 17 34 17z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 19 18.137
                moveTo(x = 19.0f, y = 18.137f)
                // c 1.366 0.385 5.645 -0.007 6.802 -0.098
                curveToRelative(
                    dx1 = 1.366f,
                    dy1 = 0.385f,
                    dx2 = 5.645f,
                    dy2 = -0.007f,
                    dx3 = 6.802f,
                    dy3 = -0.098f,
                )
                // c 1.157 -0.09 1.594 0.451 0 1.25
                curveToRelative(
                    dx1 = 1.157f,
                    dy1 = -0.09f,
                    dx2 = 1.594f,
                    dy2 = 0.451f,
                    dx3 = 0.0f,
                    dy3 = 1.25f,
                )
                // C 24 20.19 20.188 22.45 19 22.914
                curveTo(
                    x1 = 24.0f,
                    y1 = 20.19f,
                    x2 = 20.188f,
                    y2 = 22.45f,
                    x3 = 19.0f,
                    y3 = 22.914f,
                )
                // c -0.998 0.391 -4.5 -1.211 -4.917 -1.696
                curveToRelative(
                    dx1 = -0.998f,
                    dy1 = 0.391f,
                    dx2 = -4.5f,
                    dy2 = -1.211f,
                    dx3 = -4.917f,
                    dy3 = -1.696f,
                )
                // c -0.416 -0.486 3.745 -3.411 4.917 -3.081z
                curveToRelative(
                    dx1 = -0.416f,
                    dy1 = -0.486f,
                    dx2 = 3.745f,
                    dy2 = -3.411f,
                    dx3 = 4.917f,
                    dy3 = -3.081f,
                )
                close()
                // M 34 17
                moveTo(x = 34.0f, y = 17.0f)
                // c -1.549 0.04 -3 0 -4 0
                curveToRelative(
                    dx1 = -1.549f,
                    dy1 = 0.04f,
                    dx2 = -3.0f,
                    dy2 = 0.0f,
                    dx3 = -4.0f,
                    dy3 = 0.0f,
                )
                // s -1.158 1.102 1.549 1.102
                reflectiveCurveToRelative(
                    dx1 = -1.158f,
                    dy1 = 1.102f,
                    dx2 = 1.549f,
                    dy2 = 1.102f,
                )
                // S 34 17 34 17z
                reflectiveCurveTo(
                    x1 = 34.0f,
                    y1 = 17.0f,
                    x2 = 34.0f,
                    y2 = 17.0f,
                )
                close()
            }
            // M3.736 16.958 c0 -1.465 4.456 -5.134 3.975 -4.476 -1.15 1.573 -0.489 3.476 1.487 3.476 S11.907 22.477 9 21 c-2.907 -1.477 -5.264 -3.323 -5.264 -4.042z
            path(
                fill = SolidColor(Color(0xFF77B255)),
            ) {
                // M 3.736 16.958
                moveTo(x = 3.736f, y = 16.958f)
                // c 0 -1.465 4.456 -5.134 3.975 -4.476
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.465f,
                    dx2 = 4.456f,
                    dy2 = -5.134f,
                    dx3 = 3.975f,
                    dy3 = -4.476f,
                )
                // c -1.15 1.573 -0.489 3.476 1.487 3.476
                curveToRelative(
                    dx1 = -1.15f,
                    dy1 = 1.573f,
                    dx2 = -0.489f,
                    dy2 = 3.476f,
                    dx3 = 1.487f,
                    dy3 = 3.476f,
                )
                // S 11.907 22.477 9 21
                reflectiveCurveTo(
                    x1 = 11.907f,
                    y1 = 22.477f,
                    x2 = 9.0f,
                    y2 = 21.0f,
                )
                // c -2.907 -1.477 -5.264 -3.323 -5.264 -4.042z
                curveToRelative(
                    dx1 = -2.907f,
                    dy1 = -1.477f,
                    dx2 = -5.264f,
                    dy2 = -3.323f,
                    dx3 = -5.264f,
                    dy3 = -4.042f,
                )
                close()
            }
            // M8.606 10.569 c0.704 0.61 0.345 1.692 -1.045 3.485 -1.391 1.793 -3.583 2.521 -2.359 0.542 s3.404 -4.027 3.404 -4.027z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 8.606 10.569
                moveTo(x = 8.606f, y = 10.569f)
                // c 0.704 0.61 0.345 1.692 -1.045 3.485
                curveToRelative(
                    dx1 = 0.704f,
                    dy1 = 0.61f,
                    dx2 = 0.345f,
                    dy2 = 1.692f,
                    dx3 = -1.045f,
                    dy3 = 3.485f,
                )
                // c -1.391 1.793 -3.583 2.521 -2.359 0.542
                curveToRelative(
                    dx1 = -1.391f,
                    dy1 = 1.793f,
                    dx2 = -3.583f,
                    dy2 = 2.521f,
                    dx3 = -2.359f,
                    dy3 = 0.542f,
                )
                // s 3.404 -4.027 3.404 -4.027z
                reflectiveCurveToRelative(
                    dx1 = 3.404f,
                    dy1 = -4.027f,
                    dx2 = 3.404f,
                    dy2 = -4.027f,
                )
                close()
            }
            // M10.529 17.368 c-0.19 0.476 -0.73 0.706 -1.206 0.516 l-0.134 -0.054 c-0.476 -0.19 -0.707 -0.73 -0.516 -1.206 l0.798 -1.992 c0.19 -0.476 0.73 -0.707 1.206 -0.516 l0.135 0.054 c0.476 0.19 0.707 0.73 0.516 1.206 l-0.799 1.992z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 10.529 17.368
                moveTo(x = 10.529f, y = 17.368f)
                // c -0.19 0.476 -0.73 0.706 -1.206 0.516
                curveToRelative(
                    dx1 = -0.19f,
                    dy1 = 0.476f,
                    dx2 = -0.73f,
                    dy2 = 0.706f,
                    dx3 = -1.206f,
                    dy3 = 0.516f,
                )
                // l -0.134 -0.054
                lineToRelative(dx = -0.134f, dy = -0.054f)
                // c -0.476 -0.19 -0.707 -0.73 -0.516 -1.206
                curveToRelative(
                    dx1 = -0.476f,
                    dy1 = -0.19f,
                    dx2 = -0.707f,
                    dy2 = -0.73f,
                    dx3 = -0.516f,
                    dy3 = -1.206f,
                )
                // l 0.798 -1.992
                lineToRelative(dx = 0.798f, dy = -1.992f)
                // c 0.19 -0.476 0.73 -0.707 1.206 -0.516
                curveToRelative(
                    dx1 = 0.19f,
                    dy1 = -0.476f,
                    dx2 = 0.73f,
                    dy2 = -0.707f,
                    dx3 = 1.206f,
                    dy3 = -0.516f,
                )
                // l 0.135 0.054
                lineToRelative(dx = 0.135f, dy = 0.054f)
                // c 0.476 0.19 0.707 0.73 0.516 1.206
                curveToRelative(
                    dx1 = 0.476f,
                    dy1 = 0.19f,
                    dx2 = 0.707f,
                    dy2 = 0.73f,
                    dx3 = 0.516f,
                    dy3 = 1.206f,
                )
                // l -0.799 1.992z
                lineToRelative(dx = -0.799f, dy = 1.992f)
                close()
            }
            // M12.911 13.991 c0.094 0.26 -0.04 0.546 -0.3 0.64 l-1.881 0.679 c-0.26 0.094 -0.546 -0.041 -0.64 -0.301 -0.094 -0.26 0.04 -0.546 0.3 -0.64 l1.881 -0.679 c0.26 -0.094 0.546 0.041 0.64 0.301z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 12.911 13.991
                moveTo(x = 12.911f, y = 13.991f)
                // c 0.094 0.26 -0.04 0.546 -0.3 0.64
                curveToRelative(
                    dx1 = 0.094f,
                    dy1 = 0.26f,
                    dx2 = -0.04f,
                    dy2 = 0.546f,
                    dx3 = -0.3f,
                    dy3 = 0.64f,
                )
                // l -1.881 0.679
                lineToRelative(dx = -1.881f, dy = 0.679f)
                // c -0.26 0.094 -0.546 -0.041 -0.64 -0.301
                curveToRelative(
                    dx1 = -0.26f,
                    dy1 = 0.094f,
                    dx2 = -0.546f,
                    dy2 = -0.041f,
                    dx3 = -0.64f,
                    dy3 = -0.301f,
                )
                // c -0.094 -0.26 0.04 -0.546 0.3 -0.64
                curveToRelative(
                    dx1 = -0.094f,
                    dy1 = -0.26f,
                    dx2 = 0.04f,
                    dy2 = -0.546f,
                    dx3 = 0.3f,
                    dy3 = -0.64f,
                )
                // l 1.881 -0.679
                lineToRelative(dx = 1.881f, dy = -0.679f)
                // c 0.26 -0.094 0.546 0.041 0.64 0.301z
                curveToRelative(
                    dx1 = 0.26f,
                    dy1 = -0.094f,
                    dx2 = 0.546f,
                    dy2 = 0.041f,
                    dx3 = 0.64f,
                    dy3 = 0.301f,
                )
                close()
            }
        }.build().also { _emoji1f3cd = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f3cd: ImageVector? = null
