package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f531: ImageVector
    get() {
        val current = _emoji1f531
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f531",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M7 22.266 l-0.01 0.001 0.01 0.003z M29.062 22.27 l0.01 -0.003 -0.01 -0.001z
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 7 22.266
                moveTo(x = 7.0f, y = 22.266f)
                // l -0.01 0.001
                lineToRelative(dx = -0.01f, dy = 0.001f)
                // l 0.01 0.003z
                lineToRelative(dx = 0.01f, dy = 0.003f)
                close()
                // M 29.062 22.27
                moveTo(x = 29.062f, y = 22.27f)
                // l 0.01 -0.003
                lineToRelative(dx = 0.01f, dy = -0.003f)
                // l -0.01 -0.001z
                lineToRelative(dx = -0.01f, dy = -0.001f)
                close()
            }
            // M35.905 19.613 c-1.774 1.072 -3.839 1.977 -6.833 2.653 0.017 0.002 0.082 0.009 0.046 0.02 -0.268 0.068 -0.411 0.135 -0.687 0.197 -1.046 0.204 -2.587 0.296 -2.08 -1.095 l2.131 -2.906 L29 19 l4.5 -4.5 L29 10 l-4.5 4.5 2.551 2.551 -2.221 3.029 -0.002 -0.002 c-1.672 2 -4.781 1.328 -4.781 -1.078 H20 v-6 l5.5 -5.5 L18 0 l-7.5 7.5 L16 13 v6.19 c-0.164 2.246 -3.14 2.832 -4.766 0.888 l-0.002 0.002 -2.248 -3.065 L11.5 14.5 7 10 l-4.5 4.5 L7 19 l0.554 -0.554 2.157 2.942 c0.507 1.391 -1.034 1.299 -2.081 1.095 -0.274 -0.062 -0.418 -0.129 -0.686 -0.197 -0.036 -0.011 0.028 -0.017 0.045 -0.02 -2.994 -0.676 -5.058 -1.581 -6.833 -2.653 -0.008 0.151 -0.095 0.301 -0.095 0.455 0 3.481 6.245 10.923 14.623 12.586 L18 35.984 l3.346 -3.33 C29.725 30.991 36 23.55 36 20.068 c0 -0.154 -0.087 -0.303 -0.095 -0.455z
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 35.905 19.613
                moveTo(x = 35.905f, y = 19.613f)
                // c -1.774 1.072 -3.839 1.977 -6.833 2.653
                curveToRelative(
                    dx1 = -1.774f,
                    dy1 = 1.072f,
                    dx2 = -3.839f,
                    dy2 = 1.977f,
                    dx3 = -6.833f,
                    dy3 = 2.653f,
                )
                // c 0.017 0.002 0.082 0.009 0.046 0.02
                curveToRelative(
                    dx1 = 0.017f,
                    dy1 = 0.002f,
                    dx2 = 0.082f,
                    dy2 = 0.009f,
                    dx3 = 0.046f,
                    dy3 = 0.02f,
                )
                // c -0.268 0.068 -0.411 0.135 -0.687 0.197
                curveToRelative(
                    dx1 = -0.268f,
                    dy1 = 0.068f,
                    dx2 = -0.411f,
                    dy2 = 0.135f,
                    dx3 = -0.687f,
                    dy3 = 0.197f,
                )
                // c -1.046 0.204 -2.587 0.296 -2.08 -1.095
                curveToRelative(
                    dx1 = -1.046f,
                    dy1 = 0.204f,
                    dx2 = -2.587f,
                    dy2 = 0.296f,
                    dx3 = -2.08f,
                    dy3 = -1.095f,
                )
                // l 2.131 -2.906
                lineToRelative(dx = 2.131f, dy = -2.906f)
                // L 29 19
                lineTo(x = 29.0f, y = 19.0f)
                // l 4.5 -4.5
                lineToRelative(dx = 4.5f, dy = -4.5f)
                // L 29 10
                lineTo(x = 29.0f, y = 10.0f)
                // l -4.5 4.5
                lineToRelative(dx = -4.5f, dy = 4.5f)
                // l 2.551 2.551
                lineToRelative(dx = 2.551f, dy = 2.551f)
                // l -2.221 3.029
                lineToRelative(dx = -2.221f, dy = 3.029f)
                // l -0.002 -0.002
                lineToRelative(dx = -0.002f, dy = -0.002f)
                // c -1.672 2 -4.781 1.328 -4.781 -1.078
                curveToRelative(
                    dx1 = -1.672f,
                    dy1 = 2.0f,
                    dx2 = -4.781f,
                    dy2 = 1.328f,
                    dx3 = -4.781f,
                    dy3 = -1.078f,
                )
                // H 20
                horizontalLineTo(x = 20.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // l 5.5 -5.5
                lineToRelative(dx = 5.5f, dy = -5.5f)
                // L 18 0
                lineTo(x = 18.0f, y = 0.0f)
                // l -7.5 7.5
                lineToRelative(dx = -7.5f, dy = 7.5f)
                // L 16 13
                lineTo(x = 16.0f, y = 13.0f)
                // v 6.19
                verticalLineToRelative(dy = 6.19f)
                // c -0.164 2.246 -3.14 2.832 -4.766 0.888
                curveToRelative(
                    dx1 = -0.164f,
                    dy1 = 2.246f,
                    dx2 = -3.14f,
                    dy2 = 2.832f,
                    dx3 = -4.766f,
                    dy3 = 0.888f,
                )
                // l -0.002 0.002
                lineToRelative(dx = -0.002f, dy = 0.002f)
                // l -2.248 -3.065
                lineToRelative(dx = -2.248f, dy = -3.065f)
                // L 11.5 14.5
                lineTo(x = 11.5f, y = 14.5f)
                // L 7 10
                lineTo(x = 7.0f, y = 10.0f)
                // l -4.5 4.5
                lineToRelative(dx = -4.5f, dy = 4.5f)
                // L 7 19
                lineTo(x = 7.0f, y = 19.0f)
                // l 0.554 -0.554
                lineToRelative(dx = 0.554f, dy = -0.554f)
                // l 2.157 2.942
                lineToRelative(dx = 2.157f, dy = 2.942f)
                // c 0.507 1.391 -1.034 1.299 -2.081 1.095
                curveToRelative(
                    dx1 = 0.507f,
                    dy1 = 1.391f,
                    dx2 = -1.034f,
                    dy2 = 1.299f,
                    dx3 = -2.081f,
                    dy3 = 1.095f,
                )
                // c -0.274 -0.062 -0.418 -0.129 -0.686 -0.197
                curveToRelative(
                    dx1 = -0.274f,
                    dy1 = -0.062f,
                    dx2 = -0.418f,
                    dy2 = -0.129f,
                    dx3 = -0.686f,
                    dy3 = -0.197f,
                )
                // c -0.036 -0.011 0.028 -0.017 0.045 -0.02
                curveToRelative(
                    dx1 = -0.036f,
                    dy1 = -0.011f,
                    dx2 = 0.028f,
                    dy2 = -0.017f,
                    dx3 = 0.045f,
                    dy3 = -0.02f,
                )
                // c -2.994 -0.676 -5.058 -1.581 -6.833 -2.653
                curveToRelative(
                    dx1 = -2.994f,
                    dy1 = -0.676f,
                    dx2 = -5.058f,
                    dy2 = -1.581f,
                    dx3 = -6.833f,
                    dy3 = -2.653f,
                )
                // c -0.008 0.151 -0.095 0.301 -0.095 0.455
                curveToRelative(
                    dx1 = -0.008f,
                    dy1 = 0.151f,
                    dx2 = -0.095f,
                    dy2 = 0.301f,
                    dx3 = -0.095f,
                    dy3 = 0.455f,
                )
                // c 0 3.481 6.245 10.923 14.623 12.586
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.481f,
                    dx2 = 6.245f,
                    dy2 = 10.923f,
                    dx3 = 14.623f,
                    dy3 = 12.586f,
                )
                // L 18 35.984
                lineTo(x = 18.0f, y = 35.984f)
                // l 3.346 -3.33
                lineToRelative(dx = 3.346f, dy = -3.33f)
                // C 29.725 30.991 36 23.55 36 20.068
                curveTo(
                    x1 = 29.725f,
                    y1 = 30.991f,
                    x2 = 36.0f,
                    y2 = 23.55f,
                    x3 = 36.0f,
                    y3 = 20.068f,
                )
                // c 0 -0.154 -0.087 -0.303 -0.095 -0.455z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.154f,
                    dx2 = -0.087f,
                    dy2 = -0.303f,
                    dx3 = -0.095f,
                    dy3 = -0.455f,
                )
                close()
            }
        }.build().also { _emoji1f531 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f531: ImageVector? = null
