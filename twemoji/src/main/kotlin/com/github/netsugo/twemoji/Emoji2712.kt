package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji2712: ImageVector
    get() {
        val current = _emoji2712
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji2712",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M31.986 32.729 c-0.292 0.167 -0.626 0.271 -0.987 0.271 -1.104 0 -2 -0.896 -2 -2 s0.896 -2 2 -2 2 0.896 2 2 c0 0.361 -0.104 0.695 -0.271 0.987 l3.146 3.146 L34.999 28 l-9 -7 -5 5 7 9 7.134 0.876 -3.147 -3.147z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 31.986 32.729
                moveTo(x = 31.986f, y = 32.729f)
                // c -0.292 0.167 -0.626 0.271 -0.987 0.271
                curveToRelative(
                    dx1 = -0.292f,
                    dy1 = 0.167f,
                    dx2 = -0.626f,
                    dy2 = 0.271f,
                    dx3 = -0.987f,
                    dy3 = 0.271f,
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
                // s 2 0.896 2 2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.896f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                )
                // c 0 0.361 -0.104 0.695 -0.271 0.987
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.361f,
                    dx2 = -0.104f,
                    dy2 = 0.695f,
                    dx3 = -0.271f,
                    dy3 = 0.987f,
                )
                // l 3.146 3.146
                lineToRelative(dx = 3.146f, dy = 3.146f)
                // L 34.999 28
                lineTo(x = 34.999f, y = 28.0f)
                // l -9 -7
                lineToRelative(dx = -9.0f, dy = -7.0f)
                // l -5 5
                lineToRelative(dx = -5.0f, dy = 5.0f)
                // l 7 9
                lineToRelative(dx = 7.0f, dy = 9.0f)
                // l 7.134 0.876
                lineToRelative(dx = 7.134f, dy = 0.876f)
                // l -3.147 -3.147z
                lineToRelative(dx = -3.147f, dy = -3.147f)
                close()
            }
            // M13.643 5.308 c1.151 1.151 1.151 3.016 0 4.167 l-4.167 4.168 c-1.151 1.15 -3.018 1.15 -4.167 0 L1.141 9.475 c-1.15 -1.151 -1.15 -3.016 0 -4.167 l4.167 -4.167 c1.15 -1.151 3.016 -1.151 4.167 0 l4.168 4.167z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 13.643 5.308
                moveTo(x = 13.643f, y = 5.308f)
                // c 1.151 1.151 1.151 3.016 0 4.167
                curveToRelative(
                    dx1 = 1.151f,
                    dy1 = 1.151f,
                    dx2 = 1.151f,
                    dy2 = 3.016f,
                    dx3 = 0.0f,
                    dy3 = 4.167f,
                )
                // l -4.167 4.168
                lineToRelative(dx = -4.167f, dy = 4.168f)
                // c -1.151 1.15 -3.018 1.15 -4.167 0
                curveToRelative(
                    dx1 = -1.151f,
                    dy1 = 1.15f,
                    dx2 = -3.018f,
                    dy2 = 1.15f,
                    dx3 = -4.167f,
                    dy3 = 0.0f,
                )
                // L 1.141 9.475
                lineTo(x = 1.141f, y = 9.475f)
                // c -1.15 -1.151 -1.15 -3.016 0 -4.167
                curveToRelative(
                    dx1 = -1.15f,
                    dy1 = -1.151f,
                    dx2 = -1.15f,
                    dy2 = -3.016f,
                    dx3 = 0.0f,
                    dy3 = -4.167f,
                )
                // l 4.167 -4.167
                lineToRelative(dx = 4.167f, dy = -4.167f)
                // c 1.15 -1.151 3.016 -1.151 4.167 0
                curveToRelative(
                    dx1 = 1.15f,
                    dy1 = -1.151f,
                    dx2 = 3.016f,
                    dy2 = -1.151f,
                    dx3 = 4.167f,
                    dy3 = 0.0f,
                )
                // l 4.168 4.167z
                lineToRelative(dx = 4.168f, dy = 4.167f)
                close()
            }
            // M26.643 18.309 L9.44 1.105 1.107 9.44 l17.202 17.202 c1.15 1.15 3.016 1.15 4.168 0 l4.166 -4.168 c1.15 -1.15 1.15 -3.015 0 -4.165z
            path(
                fill = SolidColor(Color(0xFF31373D)),
            ) {
                // M 26.643 18.309
                moveTo(x = 26.643f, y = 18.309f)
                // L 9.44 1.105
                lineTo(x = 9.44f, y = 1.105f)
                // L 1.107 9.44
                lineTo(x = 1.107f, y = 9.44f)
                // l 17.202 17.202
                lineToRelative(dx = 17.202f, dy = 17.202f)
                // c 1.15 1.15 3.016 1.15 4.168 0
                curveToRelative(
                    dx1 = 1.15f,
                    dy1 = 1.15f,
                    dx2 = 3.016f,
                    dy2 = 1.15f,
                    dx3 = 4.168f,
                    dy3 = 0.0f,
                )
                // l 4.166 -4.168
                lineToRelative(dx = 4.166f, dy = -4.168f)
                // c 1.15 -1.15 1.15 -3.015 0 -4.165z
                curveToRelative(
                    dx1 = 1.15f,
                    dy1 = -1.15f,
                    dx2 = 1.15f,
                    dy2 = -3.015f,
                    dx3 = 0.0f,
                    dy3 = -4.165f,
                )
                close()
            }
            // M8.225 16.56 l8.334 -8.335 2.124 2.125 -8.333 8.334z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 8.225 16.56
                moveTo(x = 8.225f, y = 16.56f)
                // l 8.334 -8.335
                lineToRelative(dx = 8.334f, dy = -8.335f)
                // l 2.124 2.125
                lineToRelative(dx = 2.124f, dy = 2.125f)
                // l -8.333 8.334z
                lineToRelative(dx = -8.333f, dy = 8.334f)
                close()
            }
        }.build().also { _emoji2712 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji2712: ImageVector? = null
