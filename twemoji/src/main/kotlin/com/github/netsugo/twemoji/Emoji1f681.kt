package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f681: ImageVector
    get() {
        val current = _emoji1f681
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f681",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M16.26 26 h2 v5 h-2z M8.26 26 h2 v5 h-2z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 16.26 26
                moveTo(x = 16.26f, y = 26.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
                // M 8.26 26
                moveTo(x = 8.26f, y = 26.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // M0.259 3 a6 1 0 1 0 12 0 a6 1 0 1 0 -12 0z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 0.259 3
                moveTo(x = 0.259f, y = 3.0f)
                // a 6 1 0 1 0 12 0
                arcToRelative(
                    a = 6.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 12.0f,
                    dy1 = 0.0f,
                )
                // a 6 1 0 1 0 -12 0z
                arcToRelative(
                    a = 6.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -12.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M14.259 3 a6 1 0 1 0 12 0 a6 1 0 1 0 -12 0z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 14.259 3
                moveTo(x = 14.259f, y = 3.0f)
                // a 6 1 0 1 0 12 0
                arcToRelative(
                    a = 6.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 12.0f,
                    dy1 = 0.0f,
                )
                // a 6 1 0 1 0 -12 0z
                arcToRelative(
                    a = 6.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -12.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M12.26 3 h2 v6 h-2z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 12.26 3
                moveTo(x = 12.26f, y = 3.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // M11.259 3 a2 1 0 1 0 4 0 a2 1 0 1 0 -4 0z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 11.259 3
                moveTo(x = 11.259f, y = 3.0f)
                // a 2 1 0 1 0 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 1 0 1 0 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M34.259 10 c0 -3 0 -7 -1 -7 s-3 4 -4 6 5 1 5 1z
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 34.259 10
                moveTo(x = 34.259f, y = 10.0f)
                // c 0 -3 0 -7 -1 -7
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.0f,
                    dx2 = 0.0f,
                    dy2 = -7.0f,
                    dx3 = -1.0f,
                    dy3 = -7.0f,
                )
                // s -3 4 -4 6
                reflectiveCurveToRelative(
                    dx1 = -3.0f,
                    dy1 = 4.0f,
                    dx2 = -4.0f,
                    dy2 = 6.0f,
                )
                // s 5 1 5 1z
                reflectiveCurveToRelative(
                    dx1 = 5.0f,
                    dy1 = 1.0f,
                    dx2 = 5.0f,
                    dy2 = 1.0f,
                )
                close()
            }
            // M34.259 10 c0 -2.209 -8 -3 -19 -3 h-2 C6.632 7 0.509 12.451 0.509 18.25 S4.259 28 13.259 28 s12 -4.701 12 -10.5 c0 -0.881 -0.138 -1.731 -0.371 -2.549 C29.259 14 34.259 12.006 34.259 10z
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 34.259 10
                moveTo(x = 34.259f, y = 10.0f)
                // c 0 -2.209 -8 -3 -19 -3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.209f,
                    dx2 = -8.0f,
                    dy2 = -3.0f,
                    dx3 = -19.0f,
                    dy3 = -3.0f,
                )
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // C 6.632 7 0.509 12.451 0.509 18.25
                curveTo(
                    x1 = 6.632f,
                    y1 = 7.0f,
                    x2 = 0.509f,
                    y2 = 12.451f,
                    x3 = 0.509f,
                    y3 = 18.25f,
                )
                // S 4.259 28 13.259 28
                reflectiveCurveTo(
                    x1 = 4.259f,
                    y1 = 28.0f,
                    x2 = 13.259f,
                    y2 = 28.0f,
                )
                // s 12 -4.701 12 -10.5
                reflectiveCurveToRelative(
                    dx1 = 12.0f,
                    dy1 = -4.701f,
                    dx2 = 12.0f,
                    dy2 = -10.5f,
                )
                // c 0 -0.881 -0.138 -1.731 -0.371 -2.549
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.881f,
                    dx2 = -0.138f,
                    dy2 = -1.731f,
                    dx3 = -0.371f,
                    dy3 = -2.549f,
                )
                // C 29.259 14 34.259 12.006 34.259 10z
                curveTo(
                    x1 = 29.259f,
                    y1 = 14.0f,
                    x2 = 34.259f,
                    y2 = 12.006f,
                    x3 = 34.259f,
                    y3 = 10.0f,
                )
                close()
            }
            // M4.259 13 c-2.091 2.918 -3.068 7.589 1.213 7.784 4.787 0.216 6.787 0.216 7.85 -2.372 1.364 -3.32 0.937 -7.413 -0.276 -8.195 -2.32 -1.497 -6.695 -0.135 -8.787 2.783z M21.1 12.535 C23.259 16 23.17 18.696 19.259 20 c-3 1 -4 -2 -3.841 -5.535 0.112 -2.483 0.206 -4.195 1.841 -4.465 1.447 -0.24 2.526 0.426 3.841 2.535z
            path(
                fill = SolidColor(Color(0xFF3B88C3)),
            ) {
                // M 4.259 13
                moveTo(x = 4.259f, y = 13.0f)
                // c -2.091 2.918 -3.068 7.589 1.213 7.784
                curveToRelative(
                    dx1 = -2.091f,
                    dy1 = 2.918f,
                    dx2 = -3.068f,
                    dy2 = 7.589f,
                    dx3 = 1.213f,
                    dy3 = 7.784f,
                )
                // c 4.787 0.216 6.787 0.216 7.85 -2.372
                curveToRelative(
                    dx1 = 4.787f,
                    dy1 = 0.216f,
                    dx2 = 6.787f,
                    dy2 = 0.216f,
                    dx3 = 7.85f,
                    dy3 = -2.372f,
                )
                // c 1.364 -3.32 0.937 -7.413 -0.276 -8.195
                curveToRelative(
                    dx1 = 1.364f,
                    dy1 = -3.32f,
                    dx2 = 0.937f,
                    dy2 = -7.413f,
                    dx3 = -0.276f,
                    dy3 = -8.195f,
                )
                // c -2.32 -1.497 -6.695 -0.135 -8.787 2.783z
                curveToRelative(
                    dx1 = -2.32f,
                    dy1 = -1.497f,
                    dx2 = -6.695f,
                    dy2 = -0.135f,
                    dx3 = -8.787f,
                    dy3 = 2.783f,
                )
                close()
                // M 21.1 12.535
                moveTo(x = 21.1f, y = 12.535f)
                // C 23.259 16 23.17 18.696 19.259 20
                curveTo(
                    x1 = 23.259f,
                    y1 = 16.0f,
                    x2 = 23.17f,
                    y2 = 18.696f,
                    x3 = 19.259f,
                    y3 = 20.0f,
                )
                // c -3 1 -4 -2 -3.841 -5.535
                curveToRelative(
                    dx1 = -3.0f,
                    dy1 = 1.0f,
                    dx2 = -4.0f,
                    dy2 = -2.0f,
                    dx3 = -3.841f,
                    dy3 = -5.535f,
                )
                // c 0.112 -2.483 0.206 -4.195 1.841 -4.465
                curveToRelative(
                    dx1 = 0.112f,
                    dy1 = -2.483f,
                    dx2 = 0.206f,
                    dy2 = -4.195f,
                    dx3 = 1.841f,
                    dy3 = -4.465f,
                )
                // c 1.447 -0.24 2.526 0.426 3.841 2.535z
                curveToRelative(
                    dx1 = 1.447f,
                    dy1 = -0.24f,
                    dx2 = 2.526f,
                    dy2 = 0.426f,
                    dx3 = 3.841f,
                    dy3 = 2.535f,
                )
                close()
            }
            // M31.441 7.114 c0.903 1.273 1.271 2.564 0.82 2.884 -0.45 0.32 -1.548 -0.454 -2.451 -1.726 -0.903 -1.273 -1.271 -2.564 -0.82 -2.884 0.45 -0.321 1.547 0.453 2.451 1.726z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 31.441 7.114
                moveTo(x = 31.441f, y = 7.114f)
                // c 0.903 1.273 1.271 2.564 0.82 2.884
                curveToRelative(
                    dx1 = 0.903f,
                    dy1 = 1.273f,
                    dx2 = 1.271f,
                    dy2 = 2.564f,
                    dx3 = 0.82f,
                    dy3 = 2.884f,
                )
                // c -0.45 0.32 -1.548 -0.454 -2.451 -1.726
                curveToRelative(
                    dx1 = -0.45f,
                    dy1 = 0.32f,
                    dx2 = -1.548f,
                    dy2 = -0.454f,
                    dx3 = -2.451f,
                    dy3 = -1.726f,
                )
                // c -0.903 -1.273 -1.271 -2.564 -0.82 -2.884
                curveToRelative(
                    dx1 = -0.903f,
                    dy1 = -1.273f,
                    dx2 = -1.271f,
                    dy2 = -2.564f,
                    dx3 = -0.82f,
                    dy3 = -2.884f,
                )
                // c 0.45 -0.321 1.547 0.453 2.451 1.726z
                curveToRelative(
                    dx1 = 0.45f,
                    dy1 = -0.321f,
                    dx2 = 1.547f,
                    dy2 = 0.453f,
                    dx3 = 2.451f,
                    dy3 = 1.726f,
                )
                close()
            }
            // M34.72 11.735 c0.909 1.279 1.28 2.575 0.83 2.894 -0.45 0.32 -1.553 -0.458 -2.46 -1.737 -0.909 -1.279 -1.279 -2.576 -0.829 -2.896 0.45 -0.318 1.551 0.46 2.459 1.739z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 34.72 11.735
                moveTo(x = 34.72f, y = 11.735f)
                // c 0.909 1.279 1.28 2.575 0.83 2.894
                curveToRelative(
                    dx1 = 0.909f,
                    dy1 = 1.279f,
                    dx2 = 1.28f,
                    dy2 = 2.575f,
                    dx3 = 0.83f,
                    dy3 = 2.894f,
                )
                // c -0.45 0.32 -1.553 -0.458 -2.46 -1.737
                curveToRelative(
                    dx1 = -0.45f,
                    dy1 = 0.32f,
                    dx2 = -1.553f,
                    dy2 = -0.458f,
                    dx3 = -2.46f,
                    dy3 = -1.737f,
                )
                // c -0.909 -1.279 -1.279 -2.576 -0.829 -2.896
                curveToRelative(
                    dx1 = -0.909f,
                    dy1 = -1.279f,
                    dx2 = -1.279f,
                    dy2 = -2.576f,
                    dx3 = -0.829f,
                    dy3 = -2.896f,
                )
                // c 0.45 -0.318 1.551 0.46 2.459 1.739z
                curveToRelative(
                    dx1 = 0.45f,
                    dy1 = -0.318f,
                    dx2 = 1.551f,
                    dy2 = 0.46f,
                    dx3 = 2.459f,
                    dy3 = 1.739f,
                )
                close()
            }
            // M33.076 9.419 c0.319 0.45 0.214 1.074 -0.236 1.394 -0.45 0.32 -1.074 0.214 -1.395 -0.236 -0.319 -0.45 -0.214 -1.074 0.237 -1.394 0.451 -0.321 1.075 -0.214 1.394 0.236z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 33.076 9.419
                moveTo(x = 33.076f, y = 9.419f)
                // c 0.319 0.45 0.214 1.074 -0.236 1.394
                curveToRelative(
                    dx1 = 0.319f,
                    dy1 = 0.45f,
                    dx2 = 0.214f,
                    dy2 = 1.074f,
                    dx3 = -0.236f,
                    dy3 = 1.394f,
                )
                // c -0.45 0.32 -1.074 0.214 -1.395 -0.236
                curveToRelative(
                    dx1 = -0.45f,
                    dy1 = 0.32f,
                    dx2 = -1.074f,
                    dy2 = 0.214f,
                    dx3 = -1.395f,
                    dy3 = -0.236f,
                )
                // c -0.319 -0.45 -0.214 -1.074 0.237 -1.394
                curveToRelative(
                    dx1 = -0.319f,
                    dy1 = -0.45f,
                    dx2 = -0.214f,
                    dy2 = -1.074f,
                    dx3 = 0.237f,
                    dy3 = -1.394f,
                )
                // c 0.451 -0.321 1.075 -0.214 1.394 0.236z
                curveToRelative(
                    dx1 = 0.451f,
                    dy1 = -0.321f,
                    dx2 = 1.075f,
                    dy2 = -0.214f,
                    dx3 = 1.394f,
                    dy3 = 0.236f,
                )
                close()
            }
            // M25.26 32 c0 1.104 -0.896 2 -2 2 h-20 c-1.104 0 -2 -0.896 -2 -2 s0.896 -2 2 -2 h20 c1.104 0 2 0.896 2 2z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 25.26 32
                moveTo(x = 25.26f, y = 32.0f)
                // c 0 1.104 -0.896 2 -2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = -0.896f,
                    dy2 = 2.0f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // h -20
                horizontalLineToRelative(dx = -20.0f)
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
        }.build().also { _emoji1f681 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f681: ImageVector? = null
