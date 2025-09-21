package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f6c2: ImageVector
    get() {
        val current = _emoji1f6c2
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f6c2",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 32 c0 2.209 -1.791 4 -4 4 H4 c-2.209 0 -4 -1.791 -4 -4 V4 c0 -2.209 1.791 -4 4 -4 h28 c2.209 0 4 1.791 4 4 v28z
            path(
                fill = SolidColor(Color(0xFF226699)),
            ) {
                // M 36 32
                moveTo(x = 36.0f, y = 32.0f)
                // c 0 2.209 -1.791 4 -4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = -1.791f,
                    dy2 = 4.0f,
                    dx3 = -4.0f,
                    dy3 = 4.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // c -2.209 0 -4 -1.791 -4 -4
                curveToRelative(
                    dx1 = -2.209f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = -1.791f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
                // c 0 -2.209 1.791 -4 4 -4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.209f,
                    dx2 = 1.791f,
                    dy2 = -4.0f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // c 2.209 0 4 1.791 4 4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = 1.791f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // v 28z
                verticalLineToRelative(dy = 28.0f)
                close()
            }
            // M31 11 c0 3.314 -2.687 6 -6 6 s-6 -2.686 -6 -6 h12z M31 5 L19 5 c-0.553 0 -1 0.448 -1 1 0 0.182 0.049 0.569 0.134 1.007 C18.089 7.005 18.046 7 18 7 c-1.104 0 -2 0.448 -2 1 s0.896 1 2 1 c0.37 0 0.684 -0.003 0.971 -0.008 0.009 0.002 0.019 0.008 0.029 0.008 h12 c0.553 0 1 -2.448 1 -3 s-0.447 -1 -1 -1z M15 26 c-5.013 0 -7.558 -3.731 -7.664 -3.891 -0.613 -0.919 -0.364 -2.161 0.555 -2.774 0.919 -0.615 2.161 -0.364 2.773 0.555 0.049 0.07 1.509 2.11 4.336 2.11 2.85 0 4.322 -2.088 4.336 -2.109 0.612 -0.919 1.854 -1.17 2.774 -0.555 0.919 0.612 1.167 1.854 0.555 2.774 C22.559 22.269 20.013 26 15 26z
            path(
                fill = SolidColor(Color(0xFFF5F8FA)),
            ) {
                // M 31 11
                moveTo(x = 31.0f, y = 11.0f)
                // c 0 3.314 -2.687 6 -6 6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.314f,
                    dx2 = -2.687f,
                    dy2 = 6.0f,
                    dx3 = -6.0f,
                    dy3 = 6.0f,
                )
                // s -6 -2.686 -6 -6
                reflectiveCurveToRelative(
                    dx1 = -6.0f,
                    dy1 = -2.686f,
                    dx2 = -6.0f,
                    dy2 = -6.0f,
                )
                // h 12z
                horizontalLineToRelative(dx = 12.0f)
                close()
                // M 31 5
                moveTo(x = 31.0f, y = 5.0f)
                // L 19 5
                lineTo(x = 19.0f, y = 5.0f)
                // c -0.553 0 -1 0.448 -1 1
                curveToRelative(
                    dx1 = -0.553f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = 0.448f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // c 0 0.182 0.049 0.569 0.134 1.007
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.182f,
                    dx2 = 0.049f,
                    dy2 = 0.569f,
                    dx3 = 0.134f,
                    dy3 = 1.007f,
                )
                // C 18.089 7.005 18.046 7 18 7
                curveTo(
                    x1 = 18.089f,
                    y1 = 7.005f,
                    x2 = 18.046f,
                    y2 = 7.0f,
                    x3 = 18.0f,
                    y3 = 7.0f,
                )
                // c -1.104 0 -2 0.448 -2 1
                curveToRelative(
                    dx1 = -1.104f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = 0.448f,
                    dx3 = -2.0f,
                    dy3 = 1.0f,
                )
                // s 0.896 1 2 1
                reflectiveCurveToRelative(
                    dx1 = 0.896f,
                    dy1 = 1.0f,
                    dx2 = 2.0f,
                    dy2 = 1.0f,
                )
                // c 0.37 0 0.684 -0.003 0.971 -0.008
                curveToRelative(
                    dx1 = 0.37f,
                    dy1 = 0.0f,
                    dx2 = 0.684f,
                    dy2 = -0.003f,
                    dx3 = 0.971f,
                    dy3 = -0.008f,
                )
                // c 0.009 0.002 0.019 0.008 0.029 0.008
                curveToRelative(
                    dx1 = 0.009f,
                    dy1 = 0.002f,
                    dx2 = 0.019f,
                    dy2 = 0.008f,
                    dx3 = 0.029f,
                    dy3 = 0.008f,
                )
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // c 0.553 0 1 -2.448 1 -3
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -2.448f,
                    dx3 = 1.0f,
                    dy3 = -3.0f,
                )
                // s -0.447 -1 -1 -1z
                reflectiveCurveToRelative(
                    dx1 = -0.447f,
                    dy1 = -1.0f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                )
                close()
                // M 15 26
                moveTo(x = 15.0f, y = 26.0f)
                // c -5.013 0 -7.558 -3.731 -7.664 -3.891
                curveToRelative(
                    dx1 = -5.013f,
                    dy1 = 0.0f,
                    dx2 = -7.558f,
                    dy2 = -3.731f,
                    dx3 = -7.664f,
                    dy3 = -3.891f,
                )
                // c -0.613 -0.919 -0.364 -2.161 0.555 -2.774
                curveToRelative(
                    dx1 = -0.613f,
                    dy1 = -0.919f,
                    dx2 = -0.364f,
                    dy2 = -2.161f,
                    dx3 = 0.555f,
                    dy3 = -2.774f,
                )
                // c 0.919 -0.615 2.161 -0.364 2.773 0.555
                curveToRelative(
                    dx1 = 0.919f,
                    dy1 = -0.615f,
                    dx2 = 2.161f,
                    dy2 = -0.364f,
                    dx3 = 2.773f,
                    dy3 = 0.555f,
                )
                // c 0.049 0.07 1.509 2.11 4.336 2.11
                curveToRelative(
                    dx1 = 0.049f,
                    dy1 = 0.07f,
                    dx2 = 1.509f,
                    dy2 = 2.11f,
                    dx3 = 4.336f,
                    dy3 = 2.11f,
                )
                // c 2.85 0 4.322 -2.088 4.336 -2.109
                curveToRelative(
                    dx1 = 2.85f,
                    dy1 = 0.0f,
                    dx2 = 4.322f,
                    dy2 = -2.088f,
                    dx3 = 4.336f,
                    dy3 = -2.109f,
                )
                // c 0.612 -0.919 1.854 -1.17 2.774 -0.555
                curveToRelative(
                    dx1 = 0.612f,
                    dy1 = -0.919f,
                    dx2 = 1.854f,
                    dy2 = -1.17f,
                    dx3 = 2.774f,
                    dy3 = -0.555f,
                )
                // c 0.919 0.612 1.167 1.854 0.555 2.774
                curveToRelative(
                    dx1 = 0.919f,
                    dy1 = 0.612f,
                    dx2 = 1.167f,
                    dy2 = 1.854f,
                    dx3 = 0.555f,
                    dy3 = 2.774f,
                )
                // C 22.559 22.269 20.013 26 15 26z
                curveTo(
                    x1 = 22.559f,
                    y1 = 22.269f,
                    x2 = 20.013f,
                    y2 = 26.0f,
                    x3 = 15.0f,
                    y3 = 26.0f,
                )
                close()
            }
            // M28 19 h-7 c-1.104 0 -2 0.896 -2 2 v7 l9 -9z M30.82 20.18 L19 32 c0 1.104 0.896 2 2 2 h8 c1.104 0 2 -0.896 2 -2 L31 21 c0 -0.293 -0.066 -0.569 -0.18 -0.82z M12 3.04 L6 4.47 c-0.154 0.044 -0.295 0.125 -0.426 0.224 L11 5.96 c0.552 0.157 1 0.733 1 1.285 v5.795 c0.552 -0.157 1 -0.732 1 -1.285 v-8 c0 -0.553 -0.448 -0.872 -1 -0.715z
            path(
                fill = SolidColor(Color(0xFFF5F8FA)),
            ) {
                // M 28 19
                moveTo(x = 28.0f, y = 19.0f)
                // h -7
                horizontalLineToRelative(dx = -7.0f)
                // c -1.104 0 -2 0.896 -2 2
                curveToRelative(
                    dx1 = -1.104f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = 0.896f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // l 9 -9z
                lineToRelative(dx = 9.0f, dy = -9.0f)
                close()
                // M 30.82 20.18
                moveTo(x = 30.82f, y = 20.18f)
                // L 19 32
                lineTo(x = 19.0f, y = 32.0f)
                // c 0 1.104 0.896 2 2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = 0.896f,
                    dy2 = 2.0f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // c 1.104 0 2 -0.896 2 -2
                curveToRelative(
                    dx1 = 1.104f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = -0.896f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // L 31 21
                lineTo(x = 31.0f, y = 21.0f)
                // c 0 -0.293 -0.066 -0.569 -0.18 -0.82z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.293f,
                    dx2 = -0.066f,
                    dy2 = -0.569f,
                    dx3 = -0.18f,
                    dy3 = -0.82f,
                )
                close()
                // M 12 3.04
                moveTo(x = 12.0f, y = 3.04f)
                // L 6 4.47
                lineTo(x = 6.0f, y = 4.47f)
                // c -0.154 0.044 -0.295 0.125 -0.426 0.224
                curveToRelative(
                    dx1 = -0.154f,
                    dy1 = 0.044f,
                    dx2 = -0.295f,
                    dy2 = 0.125f,
                    dx3 = -0.426f,
                    dy3 = 0.224f,
                )
                // L 11 5.96
                lineTo(x = 11.0f, y = 5.96f)
                // c 0.552 0.157 1 0.733 1 1.285
                curveToRelative(
                    dx1 = 0.552f,
                    dy1 = 0.157f,
                    dx2 = 1.0f,
                    dy2 = 0.733f,
                    dx3 = 1.0f,
                    dy3 = 1.285f,
                )
                // v 5.795
                verticalLineToRelative(dy = 5.795f)
                // c 0.552 -0.157 1 -0.732 1 -1.285
                curveToRelative(
                    dx1 = 0.552f,
                    dy1 = -0.157f,
                    dx2 = 1.0f,
                    dy2 = -0.732f,
                    dx3 = 1.0f,
                    dy3 = -1.285f,
                )
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // c 0 -0.553 -0.448 -0.872 -1 -0.715z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.553f,
                    dx2 = -0.448f,
                    dy2 = -0.872f,
                    dx3 = -1.0f,
                    dy3 = -0.715f,
                )
                close()
            }
            // M10 16.755 c0 0.553 -0.448 0.872 -1 0.715 l-5 -1.43 c-0.552 -0.157 -1 -0.732 -1 -1.285 v-8 c0 -0.553 0.448 -0.872 1 -0.715 l5 1.43 c0.552 0.157 1 0.733 1 1.285 v8z
            path(
                fill = SolidColor(Color(0xFFF5F8FA)),
            ) {
                // M 10 16.755
                moveTo(x = 10.0f, y = 16.755f)
                // c 0 0.553 -0.448 0.872 -1 0.715
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.448f,
                    dy2 = 0.872f,
                    dx3 = -1.0f,
                    dy3 = 0.715f,
                )
                // l -5 -1.43
                lineToRelative(dx = -5.0f, dy = -1.43f)
                // c -0.552 -0.157 -1 -0.732 -1 -1.285
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = -0.157f,
                    dx2 = -1.0f,
                    dy2 = -0.732f,
                    dx3 = -1.0f,
                    dy3 = -1.285f,
                )
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // c 0 -0.553 0.448 -0.872 1 -0.715
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.553f,
                    dx2 = 0.448f,
                    dy2 = -0.872f,
                    dx3 = 1.0f,
                    dy3 = -0.715f,
                )
                // l 5 1.43
                lineToRelative(dx = 5.0f, dy = 1.43f)
                // c 0.552 0.157 1 0.733 1 1.285
                curveToRelative(
                    dx1 = 0.552f,
                    dy1 = 0.157f,
                    dx2 = 1.0f,
                    dy2 = 0.733f,
                    dx3 = 1.0f,
                    dy3 = 1.285f,
                )
                // v 8z
                verticalLineToRelative(dy = 8.0f)
                close()
            }
        }.build().also { _emoji1f6c2 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f6c2: ImageVector? = null
