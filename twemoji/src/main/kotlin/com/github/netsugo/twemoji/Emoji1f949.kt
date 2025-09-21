package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f949: ImageVector
    get() {
        val current = _emoji1f949
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f949",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M18 8 l-7 -8 H0 l14 17 11.521 -4.75z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 18 8
                moveTo(x = 18.0f, y = 8.0f)
                // l -7 -8
                lineToRelative(dx = -7.0f, dy = -8.0f)
                // H 0
                horizontalLineTo(x = 0.0f)
                // l 14 17
                lineToRelative(dx = 14.0f, dy = 17.0f)
                // l 11.521 -4.75z
                lineToRelative(dx = 11.521f, dy = -4.75f)
                close()
            }
            // M25 0 l-7 8 5.39 7.312 1.227 -1.489 L36 0z
            path(
                fill = SolidColor(Color(0xFF3B88C3)),
            ) {
                // M 25 0
                moveTo(x = 25.0f, y = 0.0f)
                // l -7 8
                lineToRelative(dx = -7.0f, dy = 8.0f)
                // l 5.39 7.312
                lineToRelative(dx = 5.39f, dy = 7.312f)
                // l 1.227 -1.489
                lineToRelative(dx = 1.227f, dy = -1.489f)
                // L 36 0z
                lineTo(x = 36.0f, y = 0.0f)
                close()
            }
            // M23.205 16.026 c0.08 -0.217 0.131 -0.448 0.131 -0.693 0 -1.104 -0.896 -2 -2 -2 h-6.667 c-1.105 0 -2 0.896 -2 2 0 0.245 0.05 0.476 0.131 0.693 -3.258 1.826 -5.464 5.307 -5.464 9.307 C7.335 31.224 12.111 36 18.002 36 s10.667 -4.776 10.667 -10.667 c0 -4 -2.206 -7.481 -5.464 -9.307z
            path(
                fill = SolidColor(Color(0xFFFF8A3B)),
            ) {
                // M 23.205 16.026
                moveTo(x = 23.205f, y = 16.026f)
                // c 0.08 -0.217 0.131 -0.448 0.131 -0.693
                curveToRelative(
                    dx1 = 0.08f,
                    dy1 = -0.217f,
                    dx2 = 0.131f,
                    dy2 = -0.448f,
                    dx3 = 0.131f,
                    dy3 = -0.693f,
                )
                // c 0 -1.104 -0.896 -2 -2 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.104f,
                    dx2 = -0.896f,
                    dy2 = -2.0f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // h -6.667
                horizontalLineToRelative(dx = -6.667f)
                // c -1.105 0 -2 0.896 -2 2
                curveToRelative(
                    dx1 = -1.105f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = 0.896f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // c 0 0.245 0.05 0.476 0.131 0.693
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.245f,
                    dx2 = 0.05f,
                    dy2 = 0.476f,
                    dx3 = 0.131f,
                    dy3 = 0.693f,
                )
                // c -3.258 1.826 -5.464 5.307 -5.464 9.307
                curveToRelative(
                    dx1 = -3.258f,
                    dy1 = 1.826f,
                    dx2 = -5.464f,
                    dy2 = 5.307f,
                    dx3 = -5.464f,
                    dy3 = 9.307f,
                )
                // C 7.335 31.224 12.111 36 18.002 36
                curveTo(
                    x1 = 7.335f,
                    y1 = 31.224f,
                    x2 = 12.111f,
                    y2 = 36.0f,
                    x3 = 18.002f,
                    y3 = 36.0f,
                )
                // s 10.667 -4.776 10.667 -10.667
                reflectiveCurveToRelative(
                    dx1 = 10.667f,
                    dy1 = -4.776f,
                    dx2 = 10.667f,
                    dy2 = -10.667f,
                )
                // c 0 -4 -2.206 -7.481 -5.464 -9.307z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.0f,
                    dx2 = -2.206f,
                    dy2 = -7.481f,
                    dx3 = -5.464f,
                    dy3 = -9.307f,
                )
                close()
            }
            // M14.121 29.35 l1.178 -1.178 c0.13 -0.132 0.318 -0.15 0.467 -0.038 0 0 1.159 0.861 2.056 0.861 0.805 0 1.628 -0.673 1.628 -1.496 s-0.842 -1.514 -2.225 -1.514 h-0.639 c-0.186 0 -0.354 -0.168 -0.354 -0.355 v-1.552 c0 -0.206 0.168 -0.355 0.354 -0.355 h0.639 c1.309 0 2 -0.635 2 -1.439 0 -0.805 -0.691 -1.402 -1.496 -1.402 -0.823 0 -1.346 0.43 -1.626 0.747 -0.132 0.15 -0.355 0.15 -0.504 0.02 l-1.141 -1.122 c-0.151 -0.132 -0.132 -0.355 0 -0.486 0 0 1.533 -1.646 3.57 -1.646 2.169 0 4.039 1.328 4.039 3.422 0 1.439 -1.085 2.505 -1.926 2.897 v0.057 c0.879 0.374 2.262 1.533 2.262 3.141 0 2.038 -1.776 3.572 -4.357 3.572 -2.354 0 -3.552 -1.16 -3.944 -1.664 -0.113 -0.134 -0.093 -0.34 0.019 -0.47z
            path(
                fill = SolidColor(Color(0xFF7C4119)),
            ) {
                // M 14.121 29.35
                moveTo(x = 14.121f, y = 29.35f)
                // l 1.178 -1.178
                lineToRelative(dx = 1.178f, dy = -1.178f)
                // c 0.13 -0.132 0.318 -0.15 0.467 -0.038
                curveToRelative(
                    dx1 = 0.13f,
                    dy1 = -0.132f,
                    dx2 = 0.318f,
                    dy2 = -0.15f,
                    dx3 = 0.467f,
                    dy3 = -0.038f,
                )
                // c 0 0 1.159 0.861 2.056 0.861
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 1.159f,
                    dy2 = 0.861f,
                    dx3 = 2.056f,
                    dy3 = 0.861f,
                )
                // c 0.805 0 1.628 -0.673 1.628 -1.496
                curveToRelative(
                    dx1 = 0.805f,
                    dy1 = 0.0f,
                    dx2 = 1.628f,
                    dy2 = -0.673f,
                    dx3 = 1.628f,
                    dy3 = -1.496f,
                )
                // s -0.842 -1.514 -2.225 -1.514
                reflectiveCurveToRelative(
                    dx1 = -0.842f,
                    dy1 = -1.514f,
                    dx2 = -2.225f,
                    dy2 = -1.514f,
                )
                // h -0.639
                horizontalLineToRelative(dx = -0.639f)
                // c -0.186 0 -0.354 -0.168 -0.354 -0.355
                curveToRelative(
                    dx1 = -0.186f,
                    dy1 = 0.0f,
                    dx2 = -0.354f,
                    dy2 = -0.168f,
                    dx3 = -0.354f,
                    dy3 = -0.355f,
                )
                // v -1.552
                verticalLineToRelative(dy = -1.552f)
                // c 0 -0.206 0.168 -0.355 0.354 -0.355
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.206f,
                    dx2 = 0.168f,
                    dy2 = -0.355f,
                    dx3 = 0.354f,
                    dy3 = -0.355f,
                )
                // h 0.639
                horizontalLineToRelative(dx = 0.639f)
                // c 1.309 0 2 -0.635 2 -1.439
                curveToRelative(
                    dx1 = 1.309f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = -0.635f,
                    dx3 = 2.0f,
                    dy3 = -1.439f,
                )
                // c 0 -0.805 -0.691 -1.402 -1.496 -1.402
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.805f,
                    dx2 = -0.691f,
                    dy2 = -1.402f,
                    dx3 = -1.496f,
                    dy3 = -1.402f,
                )
                // c -0.823 0 -1.346 0.43 -1.626 0.747
                curveToRelative(
                    dx1 = -0.823f,
                    dy1 = 0.0f,
                    dx2 = -1.346f,
                    dy2 = 0.43f,
                    dx3 = -1.626f,
                    dy3 = 0.747f,
                )
                // c -0.132 0.15 -0.355 0.15 -0.504 0.02
                curveToRelative(
                    dx1 = -0.132f,
                    dy1 = 0.15f,
                    dx2 = -0.355f,
                    dy2 = 0.15f,
                    dx3 = -0.504f,
                    dy3 = 0.02f,
                )
                // l -1.141 -1.122
                lineToRelative(dx = -1.141f, dy = -1.122f)
                // c -0.151 -0.132 -0.132 -0.355 0 -0.486
                curveToRelative(
                    dx1 = -0.151f,
                    dy1 = -0.132f,
                    dx2 = -0.132f,
                    dy2 = -0.355f,
                    dx3 = 0.0f,
                    dy3 = -0.486f,
                )
                // c 0 0 1.533 -1.646 3.57 -1.646
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 1.533f,
                    dy2 = -1.646f,
                    dx3 = 3.57f,
                    dy3 = -1.646f,
                )
                // c 2.169 0 4.039 1.328 4.039 3.422
                curveToRelative(
                    dx1 = 2.169f,
                    dy1 = 0.0f,
                    dx2 = 4.039f,
                    dy2 = 1.328f,
                    dx3 = 4.039f,
                    dy3 = 3.422f,
                )
                // c 0 1.439 -1.085 2.505 -1.926 2.897
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.439f,
                    dx2 = -1.085f,
                    dy2 = 2.505f,
                    dx3 = -1.926f,
                    dy3 = 2.897f,
                )
                // v 0.057
                verticalLineToRelative(dy = 0.057f)
                // c 0.879 0.374 2.262 1.533 2.262 3.141
                curveToRelative(
                    dx1 = 0.879f,
                    dy1 = 0.374f,
                    dx2 = 2.262f,
                    dy2 = 1.533f,
                    dx3 = 2.262f,
                    dy3 = 3.141f,
                )
                // c 0 2.038 -1.776 3.572 -4.357 3.572
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.038f,
                    dx2 = -1.776f,
                    dy2 = 3.572f,
                    dx3 = -4.357f,
                    dy3 = 3.572f,
                )
                // c -2.354 0 -3.552 -1.16 -3.944 -1.664
                curveToRelative(
                    dx1 = -2.354f,
                    dy1 = 0.0f,
                    dx2 = -3.552f,
                    dy2 = -1.16f,
                    dx3 = -3.944f,
                    dy3 = -1.664f,
                )
                // c -0.113 -0.134 -0.093 -0.34 0.019 -0.47z
                curveToRelative(
                    dx1 = -0.113f,
                    dy1 = -0.134f,
                    dx2 = -0.093f,
                    dy2 = -0.34f,
                    dx3 = 0.019f,
                    dy3 = -0.47f,
                )
                close()
            }
        }.build().also { _emoji1f949 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f949: ImageVector? = null
