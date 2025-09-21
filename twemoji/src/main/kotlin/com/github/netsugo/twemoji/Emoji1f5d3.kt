package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f5d3: ImageVector
    get() {
        val current = _emoji1f5d3
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f5d3",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M28.815 4 h1.996 v1 h-1.996z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 28.815 4
                moveTo(x = 28.815f, y = 4.0f)
                // h 1.996
                horizontalLineToRelative(dx = 1.996f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // h -1.996z
                horizontalLineToRelative(dx = -1.996f)
                close()
            }
            // M2 12 v20 c0 2.209 1.791 4 4 4 h24 c2.209 0 4 -1.791 4 -4 V12 H2z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 2 12
                moveTo(x = 2.0f, y = 12.0f)
                // v 20
                verticalLineToRelative(dy = 20.0f)
                // c 0 2.209 1.791 4 4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = 1.791f,
                    dy2 = 4.0f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // h 24
                horizontalLineToRelative(dx = 24.0f)
                // c 2.209 0 4 -1.791 4 -4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = -1.791f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // V 12
                verticalLineTo(y = 12.0f)
                // H 2z
                horizontalLineTo(x = 2.0f)
                close()
            }
            // M30 4 H6 C3.791 4 2 5.791 2 8 v5 h32 V8 c0 -2.209 -1.791 -4 -4 -4z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 30 4
                moveTo(x = 30.0f, y = 4.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // C 3.791 4 2 5.791 2 8
                curveTo(
                    x1 = 3.791f,
                    y1 = 4.0f,
                    x2 = 2.0f,
                    y2 = 5.791f,
                    x3 = 2.0f,
                    y3 = 8.0f,
                )
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h 32
                horizontalLineToRelative(dx = 32.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // c 0 -2.209 -1.791 -4 -4 -4z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.209f,
                    dx2 = -1.791f,
                    dy2 = -4.0f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                close()
            }
            // M8.836 8.731 c-0.702 0 -1.271 -0.666 -1.271 -1.489 0 -0.822 0.569 -1.489 1.271 -1.489 0.701 0 1.27 0.667 1.27 1.489 0 0.822 -0.569 1.489 -1.27 1.489z M14.836 8.731 c-0.702 0 -1.271 -0.666 -1.271 -1.489 0 -0.822 0.569 -1.489 1.271 -1.489 0.701 0 1.27 0.667 1.27 1.489 0 0.822 -0.569 1.489 -1.27 1.489z M20.836 8.731 c-0.702 0 -1.271 -0.666 -1.271 -1.489 0 -0.822 0.569 -1.489 1.271 -1.489 0.701 0 1.271 0.667 1.271 1.489 -0.001 0.822 -0.57 1.489 -1.271 1.489z M26.836 8.731 c-0.702 0 -1.271 -0.666 -1.271 -1.489 0 -0.822 0.569 -1.489 1.271 -1.489 0.701 0 1.271 0.667 1.271 1.489 -0.001 0.822 -0.57 1.489 -1.271 1.489z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 8.836 8.731
                moveTo(x = 8.836f, y = 8.731f)
                // c -0.702 0 -1.271 -0.666 -1.271 -1.489
                curveToRelative(
                    dx1 = -0.702f,
                    dy1 = 0.0f,
                    dx2 = -1.271f,
                    dy2 = -0.666f,
                    dx3 = -1.271f,
                    dy3 = -1.489f,
                )
                // c 0 -0.822 0.569 -1.489 1.271 -1.489
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.822f,
                    dx2 = 0.569f,
                    dy2 = -1.489f,
                    dx3 = 1.271f,
                    dy3 = -1.489f,
                )
                // c 0.701 0 1.27 0.667 1.27 1.489
                curveToRelative(
                    dx1 = 0.701f,
                    dy1 = 0.0f,
                    dx2 = 1.27f,
                    dy2 = 0.667f,
                    dx3 = 1.27f,
                    dy3 = 1.489f,
                )
                // c 0 0.822 -0.569 1.489 -1.27 1.489z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.822f,
                    dx2 = -0.569f,
                    dy2 = 1.489f,
                    dx3 = -1.27f,
                    dy3 = 1.489f,
                )
                close()
                // M 14.836 8.731
                moveTo(x = 14.836f, y = 8.731f)
                // c -0.702 0 -1.271 -0.666 -1.271 -1.489
                curveToRelative(
                    dx1 = -0.702f,
                    dy1 = 0.0f,
                    dx2 = -1.271f,
                    dy2 = -0.666f,
                    dx3 = -1.271f,
                    dy3 = -1.489f,
                )
                // c 0 -0.822 0.569 -1.489 1.271 -1.489
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.822f,
                    dx2 = 0.569f,
                    dy2 = -1.489f,
                    dx3 = 1.271f,
                    dy3 = -1.489f,
                )
                // c 0.701 0 1.27 0.667 1.27 1.489
                curveToRelative(
                    dx1 = 0.701f,
                    dy1 = 0.0f,
                    dx2 = 1.27f,
                    dy2 = 0.667f,
                    dx3 = 1.27f,
                    dy3 = 1.489f,
                )
                // c 0 0.822 -0.569 1.489 -1.27 1.489z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.822f,
                    dx2 = -0.569f,
                    dy2 = 1.489f,
                    dx3 = -1.27f,
                    dy3 = 1.489f,
                )
                close()
                // M 20.836 8.731
                moveTo(x = 20.836f, y = 8.731f)
                // c -0.702 0 -1.271 -0.666 -1.271 -1.489
                curveToRelative(
                    dx1 = -0.702f,
                    dy1 = 0.0f,
                    dx2 = -1.271f,
                    dy2 = -0.666f,
                    dx3 = -1.271f,
                    dy3 = -1.489f,
                )
                // c 0 -0.822 0.569 -1.489 1.271 -1.489
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.822f,
                    dx2 = 0.569f,
                    dy2 = -1.489f,
                    dx3 = 1.271f,
                    dy3 = -1.489f,
                )
                // c 0.701 0 1.271 0.667 1.271 1.489
                curveToRelative(
                    dx1 = 0.701f,
                    dy1 = 0.0f,
                    dx2 = 1.271f,
                    dy2 = 0.667f,
                    dx3 = 1.271f,
                    dy3 = 1.489f,
                )
                // c -0.001 0.822 -0.57 1.489 -1.271 1.489z
                curveToRelative(
                    dx1 = -0.001f,
                    dy1 = 0.822f,
                    dx2 = -0.57f,
                    dy2 = 1.489f,
                    dx3 = -1.271f,
                    dy3 = 1.489f,
                )
                close()
                // M 26.836 8.731
                moveTo(x = 26.836f, y = 8.731f)
                // c -0.702 0 -1.271 -0.666 -1.271 -1.489
                curveToRelative(
                    dx1 = -0.702f,
                    dy1 = 0.0f,
                    dx2 = -1.271f,
                    dy2 = -0.666f,
                    dx3 = -1.271f,
                    dy3 = -1.489f,
                )
                // c 0 -0.822 0.569 -1.489 1.271 -1.489
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.822f,
                    dx2 = 0.569f,
                    dy2 = -1.489f,
                    dx3 = 1.271f,
                    dy3 = -1.489f,
                )
                // c 0.701 0 1.271 0.667 1.271 1.489
                curveToRelative(
                    dx1 = 0.701f,
                    dy1 = 0.0f,
                    dx2 = 1.271f,
                    dy2 = 0.667f,
                    dx3 = 1.271f,
                    dy3 = 1.489f,
                )
                // c -0.001 0.822 -0.57 1.489 -1.271 1.489z
                curveToRelative(
                    dx1 = -0.001f,
                    dy1 = 0.822f,
                    dx2 = -0.57f,
                    dy2 = 1.489f,
                    dx3 = -1.271f,
                    dy3 = 1.489f,
                )
                close()
            }
            // M27.315 0.179 c-1.277 0 -2.383 0.802 -2.994 1.97 -0.606 -1.143 -1.717 -1.97 -3.006 -1.97 -1.277 0 -2.383 0.802 -2.994 1.97 -0.606 -1.143 -1.717 -1.97 -3.006 -1.97 -1.277 0 -2.383 0.802 -2.994 1.97 -0.606 -1.143 -1.717 -1.97 -3.006 -1.97 -1.934 0 -3.5 1.819 -3.5 4.005 0 1.854 1.045 3.371 2.569 3.926 0.759 0.275 1.224 -0.447 1.159 -1.026 -0.055 -0.48 -0.374 -0.793 -0.729 -1.018 -0.485 -0.307 -1 -1.008 -1 -1.877 0 -1.104 0.671 -2.095 1.5 -2.095 s1.5 0.905 1.5 1.905 h1.016 c-0.003 0.062 -0.016 0.121 -0.016 0.184 0 1.854 1.045 3.371 2.569 3.926 0.759 0.275 1.224 -0.447 1.159 -1.026 -0.055 -0.479 -0.374 -0.792 -0.729 -1.017 -0.485 -0.307 -1 -1.008 -1 -1.877 0 -1.104 0.671 -2.095 1.5 -2.095 S16.815 3 16.815 4 h1.016 c-0.003 0.062 -0.016 0.121 -0.016 0.184 0 1.854 1.045 3.371 2.569 3.926 0.759 0.275 1.224 -0.447 1.159 -1.026 -0.055 -0.479 -0.374 -0.792 -0.729 -1.017 -0.485 -0.307 -1 -1.008 -1 -1.877 0 -1.104 0.671 -2.095 1.5 -2.095 S22.815 3 22.815 4 h1.016 c-0.003 0.062 -0.016 0.121 -0.016 0.184 0 1.854 1.045 3.371 2.569 3.926 0.759 0.275 1.224 -0.447 1.159 -1.026 -0.055 -0.479 -0.374 -0.792 -0.729 -1.017 -0.485 -0.307 -1 -1.008 -1 -1.877 0 -1.104 0.671 -2.095 1.5 -2.095 S28.815 3 28.815 4 h1.996 C30.79 2 29.235 0.179 27.315 0.179z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 27.315 0.179
                moveTo(x = 27.315f, y = 0.179f)
                // c -1.277 0 -2.383 0.802 -2.994 1.97
                curveToRelative(
                    dx1 = -1.277f,
                    dy1 = 0.0f,
                    dx2 = -2.383f,
                    dy2 = 0.802f,
                    dx3 = -2.994f,
                    dy3 = 1.97f,
                )
                // c -0.606 -1.143 -1.717 -1.97 -3.006 -1.97
                curveToRelative(
                    dx1 = -0.606f,
                    dy1 = -1.143f,
                    dx2 = -1.717f,
                    dy2 = -1.97f,
                    dx3 = -3.006f,
                    dy3 = -1.97f,
                )
                // c -1.277 0 -2.383 0.802 -2.994 1.97
                curveToRelative(
                    dx1 = -1.277f,
                    dy1 = 0.0f,
                    dx2 = -2.383f,
                    dy2 = 0.802f,
                    dx3 = -2.994f,
                    dy3 = 1.97f,
                )
                // c -0.606 -1.143 -1.717 -1.97 -3.006 -1.97
                curveToRelative(
                    dx1 = -0.606f,
                    dy1 = -1.143f,
                    dx2 = -1.717f,
                    dy2 = -1.97f,
                    dx3 = -3.006f,
                    dy3 = -1.97f,
                )
                // c -1.277 0 -2.383 0.802 -2.994 1.97
                curveToRelative(
                    dx1 = -1.277f,
                    dy1 = 0.0f,
                    dx2 = -2.383f,
                    dy2 = 0.802f,
                    dx3 = -2.994f,
                    dy3 = 1.97f,
                )
                // c -0.606 -1.143 -1.717 -1.97 -3.006 -1.97
                curveToRelative(
                    dx1 = -0.606f,
                    dy1 = -1.143f,
                    dx2 = -1.717f,
                    dy2 = -1.97f,
                    dx3 = -3.006f,
                    dy3 = -1.97f,
                )
                // c -1.934 0 -3.5 1.819 -3.5 4.005
                curveToRelative(
                    dx1 = -1.934f,
                    dy1 = 0.0f,
                    dx2 = -3.5f,
                    dy2 = 1.819f,
                    dx3 = -3.5f,
                    dy3 = 4.005f,
                )
                // c 0 1.854 1.045 3.371 2.569 3.926
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.854f,
                    dx2 = 1.045f,
                    dy2 = 3.371f,
                    dx3 = 2.569f,
                    dy3 = 3.926f,
                )
                // c 0.759 0.275 1.224 -0.447 1.159 -1.026
                curveToRelative(
                    dx1 = 0.759f,
                    dy1 = 0.275f,
                    dx2 = 1.224f,
                    dy2 = -0.447f,
                    dx3 = 1.159f,
                    dy3 = -1.026f,
                )
                // c -0.055 -0.48 -0.374 -0.793 -0.729 -1.018
                curveToRelative(
                    dx1 = -0.055f,
                    dy1 = -0.48f,
                    dx2 = -0.374f,
                    dy2 = -0.793f,
                    dx3 = -0.729f,
                    dy3 = -1.018f,
                )
                // c -0.485 -0.307 -1 -1.008 -1 -1.877
                curveToRelative(
                    dx1 = -0.485f,
                    dy1 = -0.307f,
                    dx2 = -1.0f,
                    dy2 = -1.008f,
                    dx3 = -1.0f,
                    dy3 = -1.877f,
                )
                // c 0 -1.104 0.671 -2.095 1.5 -2.095
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.104f,
                    dx2 = 0.671f,
                    dy2 = -2.095f,
                    dx3 = 1.5f,
                    dy3 = -2.095f,
                )
                // s 1.5 0.905 1.5 1.905
                reflectiveCurveToRelative(
                    dx1 = 1.5f,
                    dy1 = 0.905f,
                    dx2 = 1.5f,
                    dy2 = 1.905f,
                )
                // h 1.016
                horizontalLineToRelative(dx = 1.016f)
                // c -0.003 0.062 -0.016 0.121 -0.016 0.184
                curveToRelative(
                    dx1 = -0.003f,
                    dy1 = 0.062f,
                    dx2 = -0.016f,
                    dy2 = 0.121f,
                    dx3 = -0.016f,
                    dy3 = 0.184f,
                )
                // c 0 1.854 1.045 3.371 2.569 3.926
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.854f,
                    dx2 = 1.045f,
                    dy2 = 3.371f,
                    dx3 = 2.569f,
                    dy3 = 3.926f,
                )
                // c 0.759 0.275 1.224 -0.447 1.159 -1.026
                curveToRelative(
                    dx1 = 0.759f,
                    dy1 = 0.275f,
                    dx2 = 1.224f,
                    dy2 = -0.447f,
                    dx3 = 1.159f,
                    dy3 = -1.026f,
                )
                // c -0.055 -0.479 -0.374 -0.792 -0.729 -1.017
                curveToRelative(
                    dx1 = -0.055f,
                    dy1 = -0.479f,
                    dx2 = -0.374f,
                    dy2 = -0.792f,
                    dx3 = -0.729f,
                    dy3 = -1.017f,
                )
                // c -0.485 -0.307 -1 -1.008 -1 -1.877
                curveToRelative(
                    dx1 = -0.485f,
                    dy1 = -0.307f,
                    dx2 = -1.0f,
                    dy2 = -1.008f,
                    dx3 = -1.0f,
                    dy3 = -1.877f,
                )
                // c 0 -1.104 0.671 -2.095 1.5 -2.095
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.104f,
                    dx2 = 0.671f,
                    dy2 = -2.095f,
                    dx3 = 1.5f,
                    dy3 = -2.095f,
                )
                // S 16.815 3 16.815 4
                reflectiveCurveTo(
                    x1 = 16.815f,
                    y1 = 3.0f,
                    x2 = 16.815f,
                    y2 = 4.0f,
                )
                // h 1.016
                horizontalLineToRelative(dx = 1.016f)
                // c -0.003 0.062 -0.016 0.121 -0.016 0.184
                curveToRelative(
                    dx1 = -0.003f,
                    dy1 = 0.062f,
                    dx2 = -0.016f,
                    dy2 = 0.121f,
                    dx3 = -0.016f,
                    dy3 = 0.184f,
                )
                // c 0 1.854 1.045 3.371 2.569 3.926
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.854f,
                    dx2 = 1.045f,
                    dy2 = 3.371f,
                    dx3 = 2.569f,
                    dy3 = 3.926f,
                )
                // c 0.759 0.275 1.224 -0.447 1.159 -1.026
                curveToRelative(
                    dx1 = 0.759f,
                    dy1 = 0.275f,
                    dx2 = 1.224f,
                    dy2 = -0.447f,
                    dx3 = 1.159f,
                    dy3 = -1.026f,
                )
                // c -0.055 -0.479 -0.374 -0.792 -0.729 -1.017
                curveToRelative(
                    dx1 = -0.055f,
                    dy1 = -0.479f,
                    dx2 = -0.374f,
                    dy2 = -0.792f,
                    dx3 = -0.729f,
                    dy3 = -1.017f,
                )
                // c -0.485 -0.307 -1 -1.008 -1 -1.877
                curveToRelative(
                    dx1 = -0.485f,
                    dy1 = -0.307f,
                    dx2 = -1.0f,
                    dy2 = -1.008f,
                    dx3 = -1.0f,
                    dy3 = -1.877f,
                )
                // c 0 -1.104 0.671 -2.095 1.5 -2.095
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.104f,
                    dx2 = 0.671f,
                    dy2 = -2.095f,
                    dx3 = 1.5f,
                    dy3 = -2.095f,
                )
                // S 22.815 3 22.815 4
                reflectiveCurveTo(
                    x1 = 22.815f,
                    y1 = 3.0f,
                    x2 = 22.815f,
                    y2 = 4.0f,
                )
                // h 1.016
                horizontalLineToRelative(dx = 1.016f)
                // c -0.003 0.062 -0.016 0.121 -0.016 0.184
                curveToRelative(
                    dx1 = -0.003f,
                    dy1 = 0.062f,
                    dx2 = -0.016f,
                    dy2 = 0.121f,
                    dx3 = -0.016f,
                    dy3 = 0.184f,
                )
                // c 0 1.854 1.045 3.371 2.569 3.926
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.854f,
                    dx2 = 1.045f,
                    dy2 = 3.371f,
                    dx3 = 2.569f,
                    dy3 = 3.926f,
                )
                // c 0.759 0.275 1.224 -0.447 1.159 -1.026
                curveToRelative(
                    dx1 = 0.759f,
                    dy1 = 0.275f,
                    dx2 = 1.224f,
                    dy2 = -0.447f,
                    dx3 = 1.159f,
                    dy3 = -1.026f,
                )
                // c -0.055 -0.479 -0.374 -0.792 -0.729 -1.017
                curveToRelative(
                    dx1 = -0.055f,
                    dy1 = -0.479f,
                    dx2 = -0.374f,
                    dy2 = -0.792f,
                    dx3 = -0.729f,
                    dy3 = -1.017f,
                )
                // c -0.485 -0.307 -1 -1.008 -1 -1.877
                curveToRelative(
                    dx1 = -0.485f,
                    dy1 = -0.307f,
                    dx2 = -1.0f,
                    dy2 = -1.008f,
                    dx3 = -1.0f,
                    dy3 = -1.877f,
                )
                // c 0 -1.104 0.671 -2.095 1.5 -2.095
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.104f,
                    dx2 = 0.671f,
                    dy2 = -2.095f,
                    dx3 = 1.5f,
                    dy3 = -2.095f,
                )
                // S 28.815 3 28.815 4
                reflectiveCurveTo(
                    x1 = 28.815f,
                    y1 = 3.0f,
                    x2 = 28.815f,
                    y2 = 4.0f,
                )
                // h 1.996
                horizontalLineToRelative(dx = 1.996f)
                // C 30.79 2 29.235 0.179 27.315 0.179z
                curveTo(
                    x1 = 30.79f,
                    y1 = 2.0f,
                    x2 = 29.235f,
                    y2 = 0.179f,
                    x3 = 27.315f,
                    y3 = 0.179f,
                )
                close()
            }
            // M11 15 h4 v4 h-4z M16 15 h4 v4 h-4z M21 15 h4 v4 h-4z M26 15 h4 v4 h-4z M6 20 h4 v4 L6 24z M11 20 h4 v4 h-4z M16 20 h4 v4 h-4z M21 20 h4 v4 h-4z M26 20 h4 v4 h-4z M6 25 h4 v4 L6 29z M11 25 h4 v4 h-4z M16 25 h4 v4 h-4z M21 25 h4 v4 h-4z M26 25 h4 v4 h-4z M6 30 h4 v4 L6 34z M11 30 h4 v4 h-4z M16 30 h4 v4 h-4z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 11 15
                moveTo(x = 11.0f, y = 15.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
                // M 16 15
                moveTo(x = 16.0f, y = 15.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
                // M 21 15
                moveTo(x = 21.0f, y = 15.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
                // M 26 15
                moveTo(x = 26.0f, y = 15.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
                // M 6 20
                moveTo(x = 6.0f, y = 20.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // L 6 24z
                lineTo(x = 6.0f, y = 24.0f)
                close()
                // M 11 20
                moveTo(x = 11.0f, y = 20.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
                // M 16 20
                moveTo(x = 16.0f, y = 20.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
                // M 21 20
                moveTo(x = 21.0f, y = 20.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
                // M 26 20
                moveTo(x = 26.0f, y = 20.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
                // M 6 25
                moveTo(x = 6.0f, y = 25.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // L 6 29z
                lineTo(x = 6.0f, y = 29.0f)
                close()
                // M 11 25
                moveTo(x = 11.0f, y = 25.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
                // M 16 25
                moveTo(x = 16.0f, y = 25.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
                // M 21 25
                moveTo(x = 21.0f, y = 25.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
                // M 26 25
                moveTo(x = 26.0f, y = 25.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
                // M 6 30
                moveTo(x = 6.0f, y = 30.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // L 6 34z
                lineTo(x = 6.0f, y = 34.0f)
                close()
                // M 11 30
                moveTo(x = 11.0f, y = 30.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
                // M 16 30
                moveTo(x = 16.0f, y = 30.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
        }.build().also { _emoji1f5d3 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f5d3: ImageVector? = null
