package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f3de: ImageVector
    get() {
        val current = _emoji1f3de
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f3de",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 25 V4 s0 -4 -4 -4 H4 S0 0 0 4 v20.922 L36 25z
            path(
                fill = SolidColor(Color(0xFF88C9F9)),
            ) {
                // M 36 25
                moveTo(x = 36.0f, y = 25.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // s 0 -4 -4 -4
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.0f,
                    dx2 = -4.0f,
                    dy2 = -4.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // S 0 0 0 4
                reflectiveCurveTo(
                    x1 = 0.0f,
                    y1 = 0.0f,
                    x2 = 0.0f,
                    y2 = 4.0f,
                )
                // v 20.922
                verticalLineToRelative(dy = 20.922f)
                // L 36 25z
                lineTo(x = 36.0f, y = 25.0f)
                close()
            }
            // M27 10 h-5 l-5 14 h19 V5 c-1 0 -5.419 0.419 -7 2 -1 1 -1 2 -2 3z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 27 10
                moveTo(x = 27.0f, y = 10.0f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // l -5 14
                lineToRelative(dx = -5.0f, dy = 14.0f)
                // h 19
                horizontalLineToRelative(dx = 19.0f)
                // V 5
                verticalLineTo(y = 5.0f)
                // c -1 0 -5.419 0.419 -7 2
                curveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                    dx2 = -5.419f,
                    dy2 = 0.419f,
                    dx3 = -7.0f,
                    dy3 = 2.0f,
                )
                // c -1 1 -1 2 -2 3z
                curveToRelative(
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                    dx2 = -1.0f,
                    dy2 = 2.0f,
                    dx3 = -2.0f,
                    dy3 = 3.0f,
                )
                close()
            }
            // M24 11 c1 -1 2.497 -0.498 3 -1 0.51 -0.51 0.76 -1.019 1.015 -1.529 -3.737 -0.121 -6.83 0.055 -8.015 0.529 -5 2 -4 11 -11 16 0 0 5 1.999 9 -2 2.621 -2.622 3.21 -9.21 6 -12z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 24 11
                moveTo(x = 24.0f, y = 11.0f)
                // c 1 -1 2.497 -0.498 3 -1
                curveToRelative(
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                    dx2 = 2.497f,
                    dy2 = -0.498f,
                    dx3 = 3.0f,
                    dy3 = -1.0f,
                )
                // c 0.51 -0.51 0.76 -1.019 1.015 -1.529
                curveToRelative(
                    dx1 = 0.51f,
                    dy1 = -0.51f,
                    dx2 = 0.76f,
                    dy2 = -1.019f,
                    dx3 = 1.015f,
                    dy3 = -1.529f,
                )
                // c -3.737 -0.121 -6.83 0.055 -8.015 0.529
                curveToRelative(
                    dx1 = -3.737f,
                    dy1 = -0.121f,
                    dx2 = -6.83f,
                    dy2 = 0.055f,
                    dx3 = -8.015f,
                    dy3 = 0.529f,
                )
                // c -5 2 -4 11 -11 16
                curveToRelative(
                    dx1 = -5.0f,
                    dy1 = 2.0f,
                    dx2 = -4.0f,
                    dy2 = 11.0f,
                    dx3 = -11.0f,
                    dy3 = 16.0f,
                )
                // c 0 0 5 1.999 9 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 5.0f,
                    dy2 = 1.999f,
                    dx3 = 9.0f,
                    dy3 = -2.0f,
                )
                // c 2.621 -2.622 3.21 -9.21 6 -12z
                curveToRelative(
                    dx1 = 2.621f,
                    dy1 = -2.622f,
                    dx2 = 3.21f,
                    dy2 = -9.21f,
                    dx3 = 6.0f,
                    dy3 = -12.0f,
                )
                close()
            }
            // M4 36 h28 c4 0 4 -4 4 -4 v-9 H0 v9 c0 4 4 4 4 4z
            path(
                fill = SolidColor(Color(0xFF5C913B)),
            ) {
                // M 4 36
                moveTo(x = 4.0f, y = 36.0f)
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
                // v -9
                verticalLineToRelative(dy = -9.0f)
                // H 0
                horizontalLineTo(x = 0.0f)
                // v 9
                verticalLineToRelative(dy = 9.0f)
                // c 0 4 4 4 4 4z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.0f,
                    dx2 = 4.0f,
                    dy2 = 4.0f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                close()
            }
            // M28 23 c0 1 -10 1 -10 3 s4 2 4 3 -13.917 3 -14 7 h17 c0 -2 5 -3 5 -6 s-7 -3 -7 -4 7 -2 7 -3 h-2z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 28 23
                moveTo(x = 28.0f, y = 23.0f)
                // c 0 1 -10 1 -10 3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.0f,
                    dx2 = -10.0f,
                    dy2 = 1.0f,
                    dx3 = -10.0f,
                    dy3 = 3.0f,
                )
                // s 4 2 4 3
                reflectiveCurveToRelative(
                    dx1 = 4.0f,
                    dy1 = 2.0f,
                    dx2 = 4.0f,
                    dy2 = 3.0f,
                )
                // s -13.917 3 -14 7
                reflectiveCurveToRelative(
                    dx1 = -13.917f,
                    dy1 = 3.0f,
                    dx2 = -14.0f,
                    dy2 = 7.0f,
                )
                // h 17
                horizontalLineToRelative(dx = 17.0f)
                // c 0 -2 5 -3 5 -6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                    dx2 = 5.0f,
                    dy2 = -3.0f,
                    dx3 = 5.0f,
                    dy3 = -6.0f,
                )
                // s -7 -3 -7 -4
                reflectiveCurveToRelative(
                    dx1 = -7.0f,
                    dy1 = -3.0f,
                    dx2 = -7.0f,
                    dy2 = -4.0f,
                )
                // s 7 -2 7 -3
                reflectiveCurveToRelative(
                    dx1 = 7.0f,
                    dy1 = -2.0f,
                    dx2 = 7.0f,
                    dy2 = -3.0f,
                )
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // M28 23 v-5 c0 -7 2 -8 2 -8 h1 s-1 1 -1 7 v6 h-2z
            path(
                fill = SolidColor(Color(0xFF226699)),
            ) {
                // M 28 23
                moveTo(x = 28.0f, y = 23.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // c 0 -7 2 -8 2 -8
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -7.0f,
                    dx2 = 2.0f,
                    dy2 = -8.0f,
                    dx3 = 2.0f,
                    dy3 = -8.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // s -1 1 -1 7
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                    dx2 = -1.0f,
                    dy2 = 7.0f,
                )
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // M11.53 28.503 c0 1.103 -0.893 1.497 -1.996 1.497 -1.102 0 -1.996 -0.395 -1.996 -1.497 l0.499 -4.489 c0 -1.102 0.395 -0.997 1.497 -0.997 1.103 0 1.497 -0.104 1.497 0.997 l0.499 4.489z
            path(
                fill = SolidColor(Color(0xFF662113)),
            ) {
                // M 11.53 28.503
                moveTo(x = 11.53f, y = 28.503f)
                // c 0 1.103 -0.893 1.497 -1.996 1.497
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.103f,
                    dx2 = -0.893f,
                    dy2 = 1.497f,
                    dx3 = -1.996f,
                    dy3 = 1.497f,
                )
                // c -1.102 0 -1.996 -0.395 -1.996 -1.497
                curveToRelative(
                    dx1 = -1.102f,
                    dy1 = 0.0f,
                    dx2 = -1.996f,
                    dy2 = -0.395f,
                    dx3 = -1.996f,
                    dy3 = -1.497f,
                )
                // l 0.499 -4.489
                lineToRelative(dx = 0.499f, dy = -4.489f)
                // c 0 -1.102 0.395 -0.997 1.497 -0.997
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.102f,
                    dx2 = 0.395f,
                    dy2 = -0.997f,
                    dx3 = 1.497f,
                    dy3 = -0.997f,
                )
                // c 1.103 0 1.497 -0.104 1.497 0.997
                curveToRelative(
                    dx1 = 1.103f,
                    dy1 = 0.0f,
                    dx2 = 1.497f,
                    dy2 = -0.104f,
                    dx3 = 1.497f,
                    dy3 = 0.997f,
                )
                // l 0.499 4.489z
                lineToRelative(dx = 0.499f, dy = 4.489f)
                close()
            }
            // M16.222 25.658 c-0.252 -0.216 -0.49 -0.44 -0.721 -0.667 -0.082 -0.158 -0.203 -0.325 -0.406 -0.512 -0.179 -0.164 -0.352 -0.334 -0.521 -0.506 1.02 -0.146 1.46 -0.672 0.521 -1.476 -0.307 -0.263 -0.597 -0.54 -0.875 -0.823 0.122 -0.199 0.044 -0.468 -0.344 -0.801 -0.128 -0.109 -0.252 -0.222 -0.373 -0.336 0.773 -0.12 1.096 -0.53 0.373 -1.149 -0.221 -0.19 -0.43 -0.389 -0.632 -0.592 0.187 -0.164 0.165 -0.411 -0.206 -0.728 -0.078 -0.067 -0.146 -0.14 -0.221 -0.209 0.562 -0.113 0.777 -0.433 0.221 -0.91 -0.352 -0.302 -0.666 -0.632 -0.96 -0.964 0.379 -0.091 0.515 -0.318 0.156 -0.648 0.263 -0.117 0.314 -0.333 -0.033 -0.63 -1.28 -1.096 -1.999 -2.666 -2.666 -2.666 s-1.386 1.57 -2.665 2.666 c-0.347 0.298 -0.296 0.514 -0.033 0.63 -0.359 0.33 -0.223 0.557 0.156 0.648 -0.294 0.332 -0.608 0.662 -0.96 0.964 -0.556 0.477 -0.341 0.796 0.221 0.91 -0.075 0.069 -0.143 0.142 -0.221 0.209 -0.371 0.318 -0.393 0.564 -0.206 0.728 -0.202 0.203 -0.41 0.402 -0.632 0.592 -0.723 0.619 -0.4 1.029 0.373 1.149 -0.121 0.115 -0.245 0.227 -0.373 0.336 -0.388 0.333 -0.467 0.602 -0.344 0.801 -0.278 0.283 -0.568 0.56 -0.875 0.823 -0.939 0.804 -0.499 1.331 0.521 1.476 -0.169 0.172 -0.342 0.342 -0.521 0.506 -0.203 0.186 -0.324 0.354 -0.406 0.511 -0.231 0.228 -0.47 0.452 -0.722 0.668 -1.459 1.251 -0.765 1.975 1.236 1.83 1.784 -0.129 3.452 -0.534 5.451 -0.534 s3.667 0.405 5.451 0.534 c2 0.145 2.696 -0.579 1.236 -1.83z
            path(
                fill = SolidColor(Color(0xFF3E721D)),
            ) {
                // M 16.222 25.658
                moveTo(x = 16.222f, y = 25.658f)
                // c -0.252 -0.216 -0.49 -0.44 -0.721 -0.667
                curveToRelative(
                    dx1 = -0.252f,
                    dy1 = -0.216f,
                    dx2 = -0.49f,
                    dy2 = -0.44f,
                    dx3 = -0.721f,
                    dy3 = -0.667f,
                )
                // c -0.082 -0.158 -0.203 -0.325 -0.406 -0.512
                curveToRelative(
                    dx1 = -0.082f,
                    dy1 = -0.158f,
                    dx2 = -0.203f,
                    dy2 = -0.325f,
                    dx3 = -0.406f,
                    dy3 = -0.512f,
                )
                // c -0.179 -0.164 -0.352 -0.334 -0.521 -0.506
                curveToRelative(
                    dx1 = -0.179f,
                    dy1 = -0.164f,
                    dx2 = -0.352f,
                    dy2 = -0.334f,
                    dx3 = -0.521f,
                    dy3 = -0.506f,
                )
                // c 1.02 -0.146 1.46 -0.672 0.521 -1.476
                curveToRelative(
                    dx1 = 1.02f,
                    dy1 = -0.146f,
                    dx2 = 1.46f,
                    dy2 = -0.672f,
                    dx3 = 0.521f,
                    dy3 = -1.476f,
                )
                // c -0.307 -0.263 -0.597 -0.54 -0.875 -0.823
                curveToRelative(
                    dx1 = -0.307f,
                    dy1 = -0.263f,
                    dx2 = -0.597f,
                    dy2 = -0.54f,
                    dx3 = -0.875f,
                    dy3 = -0.823f,
                )
                // c 0.122 -0.199 0.044 -0.468 -0.344 -0.801
                curveToRelative(
                    dx1 = 0.122f,
                    dy1 = -0.199f,
                    dx2 = 0.044f,
                    dy2 = -0.468f,
                    dx3 = -0.344f,
                    dy3 = -0.801f,
                )
                // c -0.128 -0.109 -0.252 -0.222 -0.373 -0.336
                curveToRelative(
                    dx1 = -0.128f,
                    dy1 = -0.109f,
                    dx2 = -0.252f,
                    dy2 = -0.222f,
                    dx3 = -0.373f,
                    dy3 = -0.336f,
                )
                // c 0.773 -0.12 1.096 -0.53 0.373 -1.149
                curveToRelative(
                    dx1 = 0.773f,
                    dy1 = -0.12f,
                    dx2 = 1.096f,
                    dy2 = -0.53f,
                    dx3 = 0.373f,
                    dy3 = -1.149f,
                )
                // c -0.221 -0.19 -0.43 -0.389 -0.632 -0.592
                curveToRelative(
                    dx1 = -0.221f,
                    dy1 = -0.19f,
                    dx2 = -0.43f,
                    dy2 = -0.389f,
                    dx3 = -0.632f,
                    dy3 = -0.592f,
                )
                // c 0.187 -0.164 0.165 -0.411 -0.206 -0.728
                curveToRelative(
                    dx1 = 0.187f,
                    dy1 = -0.164f,
                    dx2 = 0.165f,
                    dy2 = -0.411f,
                    dx3 = -0.206f,
                    dy3 = -0.728f,
                )
                // c -0.078 -0.067 -0.146 -0.14 -0.221 -0.209
                curveToRelative(
                    dx1 = -0.078f,
                    dy1 = -0.067f,
                    dx2 = -0.146f,
                    dy2 = -0.14f,
                    dx3 = -0.221f,
                    dy3 = -0.209f,
                )
                // c 0.562 -0.113 0.777 -0.433 0.221 -0.91
                curveToRelative(
                    dx1 = 0.562f,
                    dy1 = -0.113f,
                    dx2 = 0.777f,
                    dy2 = -0.433f,
                    dx3 = 0.221f,
                    dy3 = -0.91f,
                )
                // c -0.352 -0.302 -0.666 -0.632 -0.96 -0.964
                curveToRelative(
                    dx1 = -0.352f,
                    dy1 = -0.302f,
                    dx2 = -0.666f,
                    dy2 = -0.632f,
                    dx3 = -0.96f,
                    dy3 = -0.964f,
                )
                // c 0.379 -0.091 0.515 -0.318 0.156 -0.648
                curveToRelative(
                    dx1 = 0.379f,
                    dy1 = -0.091f,
                    dx2 = 0.515f,
                    dy2 = -0.318f,
                    dx3 = 0.156f,
                    dy3 = -0.648f,
                )
                // c 0.263 -0.117 0.314 -0.333 -0.033 -0.63
                curveToRelative(
                    dx1 = 0.263f,
                    dy1 = -0.117f,
                    dx2 = 0.314f,
                    dy2 = -0.333f,
                    dx3 = -0.033f,
                    dy3 = -0.63f,
                )
                // c -1.28 -1.096 -1.999 -2.666 -2.666 -2.666
                curveToRelative(
                    dx1 = -1.28f,
                    dy1 = -1.096f,
                    dx2 = -1.999f,
                    dy2 = -2.666f,
                    dx3 = -2.666f,
                    dy3 = -2.666f,
                )
                // s -1.386 1.57 -2.665 2.666
                reflectiveCurveToRelative(
                    dx1 = -1.386f,
                    dy1 = 1.57f,
                    dx2 = -2.665f,
                    dy2 = 2.666f,
                )
                // c -0.347 0.298 -0.296 0.514 -0.033 0.63
                curveToRelative(
                    dx1 = -0.347f,
                    dy1 = 0.298f,
                    dx2 = -0.296f,
                    dy2 = 0.514f,
                    dx3 = -0.033f,
                    dy3 = 0.63f,
                )
                // c -0.359 0.33 -0.223 0.557 0.156 0.648
                curveToRelative(
                    dx1 = -0.359f,
                    dy1 = 0.33f,
                    dx2 = -0.223f,
                    dy2 = 0.557f,
                    dx3 = 0.156f,
                    dy3 = 0.648f,
                )
                // c -0.294 0.332 -0.608 0.662 -0.96 0.964
                curveToRelative(
                    dx1 = -0.294f,
                    dy1 = 0.332f,
                    dx2 = -0.608f,
                    dy2 = 0.662f,
                    dx3 = -0.96f,
                    dy3 = 0.964f,
                )
                // c -0.556 0.477 -0.341 0.796 0.221 0.91
                curveToRelative(
                    dx1 = -0.556f,
                    dy1 = 0.477f,
                    dx2 = -0.341f,
                    dy2 = 0.796f,
                    dx3 = 0.221f,
                    dy3 = 0.91f,
                )
                // c -0.075 0.069 -0.143 0.142 -0.221 0.209
                curveToRelative(
                    dx1 = -0.075f,
                    dy1 = 0.069f,
                    dx2 = -0.143f,
                    dy2 = 0.142f,
                    dx3 = -0.221f,
                    dy3 = 0.209f,
                )
                // c -0.371 0.318 -0.393 0.564 -0.206 0.728
                curveToRelative(
                    dx1 = -0.371f,
                    dy1 = 0.318f,
                    dx2 = -0.393f,
                    dy2 = 0.564f,
                    dx3 = -0.206f,
                    dy3 = 0.728f,
                )
                // c -0.202 0.203 -0.41 0.402 -0.632 0.592
                curveToRelative(
                    dx1 = -0.202f,
                    dy1 = 0.203f,
                    dx2 = -0.41f,
                    dy2 = 0.402f,
                    dx3 = -0.632f,
                    dy3 = 0.592f,
                )
                // c -0.723 0.619 -0.4 1.029 0.373 1.149
                curveToRelative(
                    dx1 = -0.723f,
                    dy1 = 0.619f,
                    dx2 = -0.4f,
                    dy2 = 1.029f,
                    dx3 = 0.373f,
                    dy3 = 1.149f,
                )
                // c -0.121 0.115 -0.245 0.227 -0.373 0.336
                curveToRelative(
                    dx1 = -0.121f,
                    dy1 = 0.115f,
                    dx2 = -0.245f,
                    dy2 = 0.227f,
                    dx3 = -0.373f,
                    dy3 = 0.336f,
                )
                // c -0.388 0.333 -0.467 0.602 -0.344 0.801
                curveToRelative(
                    dx1 = -0.388f,
                    dy1 = 0.333f,
                    dx2 = -0.467f,
                    dy2 = 0.602f,
                    dx3 = -0.344f,
                    dy3 = 0.801f,
                )
                // c -0.278 0.283 -0.568 0.56 -0.875 0.823
                curveToRelative(
                    dx1 = -0.278f,
                    dy1 = 0.283f,
                    dx2 = -0.568f,
                    dy2 = 0.56f,
                    dx3 = -0.875f,
                    dy3 = 0.823f,
                )
                // c -0.939 0.804 -0.499 1.331 0.521 1.476
                curveToRelative(
                    dx1 = -0.939f,
                    dy1 = 0.804f,
                    dx2 = -0.499f,
                    dy2 = 1.331f,
                    dx3 = 0.521f,
                    dy3 = 1.476f,
                )
                // c -0.169 0.172 -0.342 0.342 -0.521 0.506
                curveToRelative(
                    dx1 = -0.169f,
                    dy1 = 0.172f,
                    dx2 = -0.342f,
                    dy2 = 0.342f,
                    dx3 = -0.521f,
                    dy3 = 0.506f,
                )
                // c -0.203 0.186 -0.324 0.354 -0.406 0.511
                curveToRelative(
                    dx1 = -0.203f,
                    dy1 = 0.186f,
                    dx2 = -0.324f,
                    dy2 = 0.354f,
                    dx3 = -0.406f,
                    dy3 = 0.511f,
                )
                // c -0.231 0.228 -0.47 0.452 -0.722 0.668
                curveToRelative(
                    dx1 = -0.231f,
                    dy1 = 0.228f,
                    dx2 = -0.47f,
                    dy2 = 0.452f,
                    dx3 = -0.722f,
                    dy3 = 0.668f,
                )
                // c -1.459 1.251 -0.765 1.975 1.236 1.83
                curveToRelative(
                    dx1 = -1.459f,
                    dy1 = 1.251f,
                    dx2 = -0.765f,
                    dy2 = 1.975f,
                    dx3 = 1.236f,
                    dy3 = 1.83f,
                )
                // c 1.784 -0.129 3.452 -0.534 5.451 -0.534
                curveToRelative(
                    dx1 = 1.784f,
                    dy1 = -0.129f,
                    dx2 = 3.452f,
                    dy2 = -0.534f,
                    dx3 = 5.451f,
                    dy3 = -0.534f,
                )
                // s 3.667 0.405 5.451 0.534
                reflectiveCurveToRelative(
                    dx1 = 3.667f,
                    dy1 = 0.405f,
                    dx2 = 5.451f,
                    dy2 = 0.534f,
                )
                // c 2 0.145 2.696 -0.579 1.236 -1.83z
                curveToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.145f,
                    dx2 = 2.696f,
                    dy2 = -0.579f,
                    dx3 = 1.236f,
                    dy3 = -1.83f,
                )
                close()
            }
            // M11.314 3.678 c-0.274 0 -0.539 0.042 -0.787 0.119 -0.296 -0.843 -1.096 -1.449 -2.04 -1.449 -1.013 0 -1.86 0.697 -2.096 1.637 -0.25 -0.189 -0.559 -0.306 -0.898 -0.306 -0.827 0 -1.497 0.67 -1.497 1.497 0 0.201 0.041 0.392 0.114 0.567 -0.144 -0.04 -0.292 -0.068 -0.446 -0.068 C2.744 5.674 2 6.418 2 7.337 2 8.256 2.744 9 3.663 9 h7.65 c1.469 0 2.661 -1.191 2.661 -2.661 0.001 -1.469 -1.192 -2.661 -2.66 -2.661z
            path(
                fill = SolidColor(Color(0xFFF5F8FA)),
            ) {
                // M 11.314 3.678
                moveTo(x = 11.314f, y = 3.678f)
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
                // C 2.744 5.674 2 6.418 2 7.337
                curveTo(
                    x1 = 2.744f,
                    y1 = 5.674f,
                    x2 = 2.0f,
                    y2 = 6.418f,
                    x3 = 2.0f,
                    y3 = 7.337f,
                )
                // C 2 8.256 2.744 9 3.663 9
                curveTo(
                    x1 = 2.0f,
                    y1 = 8.256f,
                    x2 = 2.744f,
                    y2 = 9.0f,
                    x3 = 3.663f,
                    y3 = 9.0f,
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
                // c 0.001 -1.469 -1.192 -2.661 -2.66 -2.661z
                curveToRelative(
                    dx1 = 0.001f,
                    dy1 = -1.469f,
                    dx2 = -1.192f,
                    dy2 = -2.661f,
                    dx3 = -2.66f,
                    dy3 = -2.661f,
                )
                close()
            }
        }.build().also { _emoji1f3de = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f3de: ImageVector? = null
