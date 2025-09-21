package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f3a3: ImageVector
    get() {
        val current = _emoji1f3a3
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f3a3",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M8 16 c-0.552 0 -1 -0.448 -1 -1 V4 c0 -0.552 0.448 -1 1 -1 s1 0.448 1 1 v11 c0 0.552 -0.448 1 -1 1z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 8 16
                moveTo(x = 8.0f, y = 16.0f)
                // c -0.552 0 -1 -0.448 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.448f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
                // c 0 -0.552 0.448 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = 0.448f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // s 1 0.448 1 1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.448f,
                    dx2 = 1.0f,
                    dy2 = 1.0f,
                )
                // v 11
                verticalLineToRelative(dy = 11.0f)
                // c 0 0.552 -0.448 1 -1 1z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = -0.448f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                close()
            }
            // M2 33 c0 -2.236 4 -6 7 -6 v5 c-1 0 -4 1 -5 2 s-2 0 -2 -1z M16 33 c0 -2.236 -4 -6 -7 -6 v5 c1 0 4 1 5 2 s2 0 2 -1z
            path(
                fill = SolidColor(Color(0xFF3B88C3)),
            ) {
                // M 2 33
                moveTo(x = 2.0f, y = 33.0f)
                // c 0 -2.236 4 -6 7 -6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.236f,
                    dx2 = 4.0f,
                    dy2 = -6.0f,
                    dx3 = 7.0f,
                    dy3 = -6.0f,
                )
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // c -1 0 -4 1 -5 2
                curveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = 1.0f,
                    dx3 = -5.0f,
                    dy3 = 2.0f,
                )
                // s -2 0 -2 -1z
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -1.0f,
                )
                close()
                // M 16 33
                moveTo(x = 16.0f, y = 33.0f)
                // c 0 -2.236 -4 -6 -7 -6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.236f,
                    dx2 = -4.0f,
                    dy2 = -6.0f,
                    dx3 = -7.0f,
                    dy3 = -6.0f,
                )
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // c 1 0 4 1 5 2
                curveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = 1.0f,
                    dx3 = 5.0f,
                    dy3 = 2.0f,
                )
                // s 2 0 2 -1z
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = -1.0f,
                )
                close()
            }
            // M15 14 c2 0 4 1 4 2 0 3 -3.167 11.542 -8.167 12.542 S15 14 15 14z M3 20 c-1 1 -2 3 -2 5 s2.75 -2.042 4 -1 c1.718 1.432 -2 -4 -2 -4z
            path(
                fill = SolidColor(Color(0xFF3B88C3)),
            ) {
                // M 15 14
                moveTo(x = 15.0f, y = 14.0f)
                // c 2 0 4 1 4 2
                curveToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = 1.0f,
                    dx3 = 4.0f,
                    dy3 = 2.0f,
                )
                // c 0 3 -3.167 11.542 -8.167 12.542
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.0f,
                    dx2 = -3.167f,
                    dy2 = 11.542f,
                    dx3 = -8.167f,
                    dy3 = 12.542f,
                )
                // S 15 14 15 14z
                reflectiveCurveTo(
                    x1 = 15.0f,
                    y1 = 14.0f,
                    x2 = 15.0f,
                    y2 = 14.0f,
                )
                close()
                // M 3 20
                moveTo(x = 3.0f, y = 20.0f)
                // c -1 1 -2 3 -2 5
                curveToRelative(
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                    dx2 = -2.0f,
                    dy2 = 3.0f,
                    dx3 = -2.0f,
                    dy3 = 5.0f,
                )
                // s 2.75 -2.042 4 -1
                reflectiveCurveToRelative(
                    dx1 = 2.75f,
                    dy1 = -2.042f,
                    dx2 = 4.0f,
                    dy2 = -1.0f,
                )
                // c 1.718 1.432 -2 -4 -2 -4z
                curveToRelative(
                    dx1 = 1.718f,
                    dy1 = 1.432f,
                    dx2 = -2.0f,
                    dy2 = -4.0f,
                    dx3 = -2.0f,
                    dy3 = -4.0f,
                )
                close()
            }
            // M5.583 12.25 c1.5 0.5 2.583 0.125 3.667 -0.75 s1.25 2.542 -0.25 3.667 -4.125 3.75 -4.083 1.417 c0.041 -2.334 0.666 -4.334 0.666 -4.334z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 5.583 12.25
                moveTo(x = 5.583f, y = 12.25f)
                // c 1.5 0.5 2.583 0.125 3.667 -0.75
                curveToRelative(
                    dx1 = 1.5f,
                    dy1 = 0.5f,
                    dx2 = 2.583f,
                    dy2 = 0.125f,
                    dx3 = 3.667f,
                    dy3 = -0.75f,
                )
                // s 1.25 2.542 -0.25 3.667
                reflectiveCurveToRelative(
                    dx1 = 1.25f,
                    dy1 = 2.542f,
                    dx2 = -0.25f,
                    dy2 = 3.667f,
                )
                // s -4.125 3.75 -4.083 1.417
                reflectiveCurveToRelative(
                    dx1 = -4.125f,
                    dy1 = 3.75f,
                    dx2 = -4.083f,
                    dy2 = 1.417f,
                )
                // c 0.041 -2.334 0.666 -4.334 0.666 -4.334z
                curveToRelative(
                    dx1 = 0.041f,
                    dy1 = -2.334f,
                    dx2 = 0.666f,
                    dy2 = -4.334f,
                    dx3 = 0.666f,
                    dy3 = -4.334f,
                )
                close()
            }
            // M9.023 11.001 c-0.574 0.63 -1.856 2.332 -2.481 4.415 -0.875 0.5 -0.833 -1.208 -0.708 -1.75 0.225 -0.975 0.506 -0.977 0.346 -1.521 -0.21 -0.551 -0.789 -0.364 -1.119 -0.159 C3.348 12.97 2 14.8 2 18 c0 5.522 5 13 7 13 s7 -7.478 7 -13 c0 -5.509 -3.979 -6.992 -6.977 -6.999z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 9.023 11.001
                moveTo(x = 9.023f, y = 11.001f)
                // c -0.574 0.63 -1.856 2.332 -2.481 4.415
                curveToRelative(
                    dx1 = -0.574f,
                    dy1 = 0.63f,
                    dx2 = -1.856f,
                    dy2 = 2.332f,
                    dx3 = -2.481f,
                    dy3 = 4.415f,
                )
                // c -0.875 0.5 -0.833 -1.208 -0.708 -1.75
                curveToRelative(
                    dx1 = -0.875f,
                    dy1 = 0.5f,
                    dx2 = -0.833f,
                    dy2 = -1.208f,
                    dx3 = -0.708f,
                    dy3 = -1.75f,
                )
                // c 0.225 -0.975 0.506 -0.977 0.346 -1.521
                curveToRelative(
                    dx1 = 0.225f,
                    dy1 = -0.975f,
                    dx2 = 0.506f,
                    dy2 = -0.977f,
                    dx3 = 0.346f,
                    dy3 = -1.521f,
                )
                // c -0.21 -0.551 -0.789 -0.364 -1.119 -0.159
                curveToRelative(
                    dx1 = -0.21f,
                    dy1 = -0.551f,
                    dx2 = -0.789f,
                    dy2 = -0.364f,
                    dx3 = -1.119f,
                    dy3 = -0.159f,
                )
                // C 3.348 12.97 2 14.8 2 18
                curveTo(
                    x1 = 3.348f,
                    y1 = 12.97f,
                    x2 = 2.0f,
                    y2 = 14.8f,
                    x3 = 2.0f,
                    y3 = 18.0f,
                )
                // c 0 5.522 5 13 7 13
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 5.522f,
                    dx2 = 5.0f,
                    dy2 = 13.0f,
                    dx3 = 7.0f,
                    dy3 = 13.0f,
                )
                // s 7 -7.478 7 -13
                reflectiveCurveToRelative(
                    dx1 = 7.0f,
                    dy1 = -7.478f,
                    dx2 = 7.0f,
                    dy2 = -13.0f,
                )
                // c 0 -5.509 -3.979 -6.992 -6.977 -6.999z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -5.509f,
                    dx2 = -3.979f,
                    dy2 = -6.992f,
                    dx3 = -6.977f,
                    dy3 = -6.999f,
                )
                close()
            }
            // M11.5 15.5 m-1.5 0 a1.5 1.5 0 1 1 3 0 a1.5 1.5 0 1 1 -3 0
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 11.5 15.5
                moveTo(x = 11.5f, y = 15.5f)
                // m -1.5 0
                moveToRelative(dx = -1.5f, dy = 0.0f)
                // a 1.5 1.5 0 1 1 3 0
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = 0.0f,
                )
                // a 1.5 1.5 0 1 1 -3 0
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = 0.0f,
                )
            }
            // M8.954 22.827 c-1.504 0 -2.829 -0.538 -4 -1.149 -0.49 -0.256 -0.679 -0.86 -0.423 -1.35 0.255 -0.488 0.859 -0.68 1.349 -0.424 1.891 0.988 3.59 1.385 5.735 0.11 0.475 -0.281 1.088 -0.124 1.37 0.35 0.282 0.476 0.125 1.089 -0.35 1.371 -1.334 0.792 -2.558 1.092 -3.681 1.092z
            path(
                fill = SolidColor(Color(0xFF226699)),
            ) {
                // M 8.954 22.827
                moveTo(x = 8.954f, y = 22.827f)
                // c -1.504 0 -2.829 -0.538 -4 -1.149
                curveToRelative(
                    dx1 = -1.504f,
                    dy1 = 0.0f,
                    dx2 = -2.829f,
                    dy2 = -0.538f,
                    dx3 = -4.0f,
                    dy3 = -1.149f,
                )
                // c -0.49 -0.256 -0.679 -0.86 -0.423 -1.35
                curveToRelative(
                    dx1 = -0.49f,
                    dy1 = -0.256f,
                    dx2 = -0.679f,
                    dy2 = -0.86f,
                    dx3 = -0.423f,
                    dy3 = -1.35f,
                )
                // c 0.255 -0.488 0.859 -0.68 1.349 -0.424
                curveToRelative(
                    dx1 = 0.255f,
                    dy1 = -0.488f,
                    dx2 = 0.859f,
                    dy2 = -0.68f,
                    dx3 = 1.349f,
                    dy3 = -0.424f,
                )
                // c 1.891 0.988 3.59 1.385 5.735 0.11
                curveToRelative(
                    dx1 = 1.891f,
                    dy1 = 0.988f,
                    dx2 = 3.59f,
                    dy2 = 1.385f,
                    dx3 = 5.735f,
                    dy3 = 0.11f,
                )
                // c 0.475 -0.281 1.088 -0.124 1.37 0.35
                curveToRelative(
                    dx1 = 0.475f,
                    dy1 = -0.281f,
                    dx2 = 1.088f,
                    dy2 = -0.124f,
                    dx3 = 1.37f,
                    dy3 = 0.35f,
                )
                // c 0.282 0.476 0.125 1.089 -0.35 1.371
                curveToRelative(
                    dx1 = 0.282f,
                    dy1 = 0.476f,
                    dx2 = 0.125f,
                    dy2 = 1.089f,
                    dx3 = -0.35f,
                    dy3 = 1.371f,
                )
                // c -1.334 0.792 -2.558 1.092 -3.681 1.092z
                curveToRelative(
                    dx1 = -1.334f,
                    dy1 = 0.792f,
                    dx2 = -2.558f,
                    dy2 = 1.092f,
                    dx3 = -3.681f,
                    dy3 = 1.092f,
                )
                close()
            }
            // M29.834 35.25 c-0.494 -0.247 -1.042 -0.958 -0.729 -1.697 1.334 -3.146 4.278 -16.9 1.604 -24.761 -0.501 -1.472 -2.118 -3.659 -4.08 -4.863 C20.292 0.042 10.823 2.171 9.5 2.833 c-0.495 0.248 -2.044 0.744 -2.292 0.25 -0.247 -0.494 0.589 -1.003 1.083 -1.25 1.756 -0.877 11.264 -3.878 19.667 0.791 1.5 0.833 3.59 2.376 4.703 5.303 3.257 8.567 1.047 23.416 -0.787 26.822 -0.582 1.084 -1.896 0.572 -2.04 0.501z
            path(
                fill = SolidColor(Color(0xFF662113)),
            ) {
                // M 29.834 35.25
                moveTo(x = 29.834f, y = 35.25f)
                // c -0.494 -0.247 -1.042 -0.958 -0.729 -1.697
                curveToRelative(
                    dx1 = -0.494f,
                    dy1 = -0.247f,
                    dx2 = -1.042f,
                    dy2 = -0.958f,
                    dx3 = -0.729f,
                    dy3 = -1.697f,
                )
                // c 1.334 -3.146 4.278 -16.9 1.604 -24.761
                curveToRelative(
                    dx1 = 1.334f,
                    dy1 = -3.146f,
                    dx2 = 4.278f,
                    dy2 = -16.9f,
                    dx3 = 1.604f,
                    dy3 = -24.761f,
                )
                // c -0.501 -1.472 -2.118 -3.659 -4.08 -4.863
                curveToRelative(
                    dx1 = -0.501f,
                    dy1 = -1.472f,
                    dx2 = -2.118f,
                    dy2 = -3.659f,
                    dx3 = -4.08f,
                    dy3 = -4.863f,
                )
                // C 20.292 0.042 10.823 2.171 9.5 2.833
                curveTo(
                    x1 = 20.292f,
                    y1 = 0.042f,
                    x2 = 10.823f,
                    y2 = 2.171f,
                    x3 = 9.5f,
                    y3 = 2.833f,
                )
                // c -0.495 0.248 -2.044 0.744 -2.292 0.25
                curveToRelative(
                    dx1 = -0.495f,
                    dy1 = 0.248f,
                    dx2 = -2.044f,
                    dy2 = 0.744f,
                    dx3 = -2.292f,
                    dy3 = 0.25f,
                )
                // c -0.247 -0.494 0.589 -1.003 1.083 -1.25
                curveToRelative(
                    dx1 = -0.247f,
                    dy1 = -0.494f,
                    dx2 = 0.589f,
                    dy2 = -1.003f,
                    dx3 = 1.083f,
                    dy3 = -1.25f,
                )
                // c 1.756 -0.877 11.264 -3.878 19.667 0.791
                curveToRelative(
                    dx1 = 1.756f,
                    dy1 = -0.877f,
                    dx2 = 11.264f,
                    dy2 = -3.878f,
                    dx3 = 19.667f,
                    dy3 = 0.791f,
                )
                // c 1.5 0.833 3.59 2.376 4.703 5.303
                curveToRelative(
                    dx1 = 1.5f,
                    dy1 = 0.833f,
                    dx2 = 3.59f,
                    dy2 = 2.376f,
                    dx3 = 4.703f,
                    dy3 = 5.303f,
                )
                // c 3.257 8.567 1.047 23.416 -0.787 26.822
                curveToRelative(
                    dx1 = 3.257f,
                    dy1 = 8.567f,
                    dx2 = 1.047f,
                    dy2 = 23.416f,
                    dx3 = -0.787f,
                    dy3 = 26.822f,
                )
                // c -0.582 1.084 -1.896 0.572 -2.04 0.501z
                curveToRelative(
                    dx1 = -0.582f,
                    dy1 = 1.084f,
                    dx2 = -1.896f,
                    dy2 = 0.572f,
                    dx3 = -2.04f,
                    dy3 = 0.501f,
                )
                close()
            }
            // M28 25 m-4 0 a4 4 0 1 1 8 0 a4 4 0 1 1 -8 0
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 28 25
                moveTo(x = 28.0f, y = 25.0f)
                // m -4 0
                moveToRelative(dx = -4.0f, dy = 0.0f)
                // a 4 4 0 1 1 8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 8.0f,
                    dy1 = 0.0f,
                )
                // a 4 4 0 1 1 -8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -8.0f,
                    dy1 = 0.0f,
                )
            }
            // M28 25 m-2 0 a2 2 0 1 1 4 0 a2 2 0 1 1 -4 0
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 28 25
                moveTo(x = 28.0f, y = 25.0f)
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
        }.build().also { _emoji1f3a3 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f3a3: ImageVector? = null
