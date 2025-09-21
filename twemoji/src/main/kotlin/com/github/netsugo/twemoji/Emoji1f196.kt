package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f196: ImageVector
    get() {
        val current = _emoji1f196
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f196",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 32 c0 2.209 -1.791 4 -4 4 H4 c-2.209 0 -4 -1.791 -4 -4 V4 c0 -2.209 1.791 -4 4 -4 h28 c2.209 0 4 1.791 4 4 v28z
            path(
                fill = SolidColor(Color(0xFF3B88C3)),
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
            // M2.508 10.639 c0 -1.2 0.768 -1.872 1.8 -1.872 0.456 0 1.2 0.36 1.512 0.792 l7.608 10.153 h0.048 v-9.073 c0 -1.2 0.768 -1.872 1.8 -1.872 s1.8 0.672 1.8 1.872 v13.633 c0 1.2 -0.768 1.872 -1.8 1.872 -0.456 0 -1.176 -0.359 -1.512 -0.792 L6.157 15.319 h-0.048 v8.953 c0 1.2 -0.768 1.872 -1.8 1.872 s-1.8 -0.672 -1.8 -1.872 L2.509 10.639z M31.91 15.871 c1.512 0 2.111 0.768 2.111 2.305 0 4.632 -3.024 8.112 -7.824 8.112 -4.873 0 -8.257 -3.864 -8.257 -8.833 0 -4.992 3.36 -8.833 8.257 -8.833 3.623 0 6.6 1.704 6.6 3.384 0 1.032 -0.647 1.68 -1.488 1.68 -1.631 0 -1.967 -1.752 -5.111 -1.752 -3 0 -4.513 2.616 -4.513 5.52 0 2.929 1.464 5.521 4.513 5.521 1.896 0 4.08 -1.056 4.08 -3.792 L27.83 19.183 c-0.984 0 -1.682 -0.696 -1.682 -1.681 0 -1.008 0.77 -1.632 1.682 -1.632 h4.08z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 2.508 10.639
                moveTo(x = 2.508f, y = 10.639f)
                // c 0 -1.2 0.768 -1.872 1.8 -1.872
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.2f,
                    dx2 = 0.768f,
                    dy2 = -1.872f,
                    dx3 = 1.8f,
                    dy3 = -1.872f,
                )
                // c 0.456 0 1.2 0.36 1.512 0.792
                curveToRelative(
                    dx1 = 0.456f,
                    dy1 = 0.0f,
                    dx2 = 1.2f,
                    dy2 = 0.36f,
                    dx3 = 1.512f,
                    dy3 = 0.792f,
                )
                // l 7.608 10.153
                lineToRelative(dx = 7.608f, dy = 10.153f)
                // h 0.048
                horizontalLineToRelative(dx = 0.048f)
                // v -9.073
                verticalLineToRelative(dy = -9.073f)
                // c 0 -1.2 0.768 -1.872 1.8 -1.872
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.2f,
                    dx2 = 0.768f,
                    dy2 = -1.872f,
                    dx3 = 1.8f,
                    dy3 = -1.872f,
                )
                // s 1.8 0.672 1.8 1.872
                reflectiveCurveToRelative(
                    dx1 = 1.8f,
                    dy1 = 0.672f,
                    dx2 = 1.8f,
                    dy2 = 1.872f,
                )
                // v 13.633
                verticalLineToRelative(dy = 13.633f)
                // c 0 1.2 -0.768 1.872 -1.8 1.872
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.2f,
                    dx2 = -0.768f,
                    dy2 = 1.872f,
                    dx3 = -1.8f,
                    dy3 = 1.872f,
                )
                // c -0.456 0 -1.176 -0.359 -1.512 -0.792
                curveToRelative(
                    dx1 = -0.456f,
                    dy1 = 0.0f,
                    dx2 = -1.176f,
                    dy2 = -0.359f,
                    dx3 = -1.512f,
                    dy3 = -0.792f,
                )
                // L 6.157 15.319
                lineTo(x = 6.157f, y = 15.319f)
                // h -0.048
                horizontalLineToRelative(dx = -0.048f)
                // v 8.953
                verticalLineToRelative(dy = 8.953f)
                // c 0 1.2 -0.768 1.872 -1.8 1.872
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.2f,
                    dx2 = -0.768f,
                    dy2 = 1.872f,
                    dx3 = -1.8f,
                    dy3 = 1.872f,
                )
                // s -1.8 -0.672 -1.8 -1.872
                reflectiveCurveToRelative(
                    dx1 = -1.8f,
                    dy1 = -0.672f,
                    dx2 = -1.8f,
                    dy2 = -1.872f,
                )
                // L 2.509 10.639z
                lineTo(x = 2.509f, y = 10.639f)
                close()
                // M 31.91 15.871
                moveTo(x = 31.91f, y = 15.871f)
                // c 1.512 0 2.111 0.768 2.111 2.305
                curveToRelative(
                    dx1 = 1.512f,
                    dy1 = 0.0f,
                    dx2 = 2.111f,
                    dy2 = 0.768f,
                    dx3 = 2.111f,
                    dy3 = 2.305f,
                )
                // c 0 4.632 -3.024 8.112 -7.824 8.112
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.632f,
                    dx2 = -3.024f,
                    dy2 = 8.112f,
                    dx3 = -7.824f,
                    dy3 = 8.112f,
                )
                // c -4.873 0 -8.257 -3.864 -8.257 -8.833
                curveToRelative(
                    dx1 = -4.873f,
                    dy1 = 0.0f,
                    dx2 = -8.257f,
                    dy2 = -3.864f,
                    dx3 = -8.257f,
                    dy3 = -8.833f,
                )
                // c 0 -4.992 3.36 -8.833 8.257 -8.833
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.992f,
                    dx2 = 3.36f,
                    dy2 = -8.833f,
                    dx3 = 8.257f,
                    dy3 = -8.833f,
                )
                // c 3.623 0 6.6 1.704 6.6 3.384
                curveToRelative(
                    dx1 = 3.623f,
                    dy1 = 0.0f,
                    dx2 = 6.6f,
                    dy2 = 1.704f,
                    dx3 = 6.6f,
                    dy3 = 3.384f,
                )
                // c 0 1.032 -0.647 1.68 -1.488 1.68
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.032f,
                    dx2 = -0.647f,
                    dy2 = 1.68f,
                    dx3 = -1.488f,
                    dy3 = 1.68f,
                )
                // c -1.631 0 -1.967 -1.752 -5.111 -1.752
                curveToRelative(
                    dx1 = -1.631f,
                    dy1 = 0.0f,
                    dx2 = -1.967f,
                    dy2 = -1.752f,
                    dx3 = -5.111f,
                    dy3 = -1.752f,
                )
                // c -3 0 -4.513 2.616 -4.513 5.52
                curveToRelative(
                    dx1 = -3.0f,
                    dy1 = 0.0f,
                    dx2 = -4.513f,
                    dy2 = 2.616f,
                    dx3 = -4.513f,
                    dy3 = 5.52f,
                )
                // c 0 2.929 1.464 5.521 4.513 5.521
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.929f,
                    dx2 = 1.464f,
                    dy2 = 5.521f,
                    dx3 = 4.513f,
                    dy3 = 5.521f,
                )
                // c 1.896 0 4.08 -1.056 4.08 -3.792
                curveToRelative(
                    dx1 = 1.896f,
                    dy1 = 0.0f,
                    dx2 = 4.08f,
                    dy2 = -1.056f,
                    dx3 = 4.08f,
                    dy3 = -3.792f,
                )
                // L 27.83 19.183
                lineTo(x = 27.83f, y = 19.183f)
                // c -0.984 0 -1.682 -0.696 -1.682 -1.681
                curveToRelative(
                    dx1 = -0.984f,
                    dy1 = 0.0f,
                    dx2 = -1.682f,
                    dy2 = -0.696f,
                    dx3 = -1.682f,
                    dy3 = -1.681f,
                )
                // c 0 -1.008 0.77 -1.632 1.682 -1.632
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.008f,
                    dx2 = 0.77f,
                    dy2 = -1.632f,
                    dx3 = 1.682f,
                    dy3 = -1.632f,
                )
                // h 4.08z
                horizontalLineToRelative(dx = 4.08f)
                close()
            }
        }.build().also { _emoji1f196 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f196: ImageVector? = null
