package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1e9: ImageVector
    get() {
        val current = _emoji1f1e9
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1e9",
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
            // M9.057 9.312 c0 -1.427 0.992 -2.388 2.387 -2.388 h5.147 c6.946 0 10.915 4.465 10.915 11.348 C27.506 24.783 23.289 29 16.901 29 h-5.395 c-1.023 0 -2.449 -0.559 -2.449 -2.325 L9.057 9.312z M13.708 24.721 h3.132 c4 0 5.829 -2.945 5.829 -6.666 0 -3.969 -1.859 -6.852 -6.139 -6.852 h-2.822 v13.518z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 9.057 9.312
                moveTo(x = 9.057f, y = 9.312f)
                // c 0 -1.427 0.992 -2.388 2.387 -2.388
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.427f,
                    dx2 = 0.992f,
                    dy2 = -2.388f,
                    dx3 = 2.387f,
                    dy3 = -2.388f,
                )
                // h 5.147
                horizontalLineToRelative(dx = 5.147f)
                // c 6.946 0 10.915 4.465 10.915 11.348
                curveToRelative(
                    dx1 = 6.946f,
                    dy1 = 0.0f,
                    dx2 = 10.915f,
                    dy2 = 4.465f,
                    dx3 = 10.915f,
                    dy3 = 11.348f,
                )
                // C 27.506 24.783 23.289 29 16.901 29
                curveTo(
                    x1 = 27.506f,
                    y1 = 24.783f,
                    x2 = 23.289f,
                    y2 = 29.0f,
                    x3 = 16.901f,
                    y3 = 29.0f,
                )
                // h -5.395
                horizontalLineToRelative(dx = -5.395f)
                // c -1.023 0 -2.449 -0.559 -2.449 -2.325
                curveToRelative(
                    dx1 = -1.023f,
                    dy1 = 0.0f,
                    dx2 = -2.449f,
                    dy2 = -0.559f,
                    dx3 = -2.449f,
                    dy3 = -2.325f,
                )
                // L 9.057 9.312z
                lineTo(x = 9.057f, y = 9.312f)
                close()
                // M 13.708 24.721
                moveTo(x = 13.708f, y = 24.721f)
                // h 3.132
                horizontalLineToRelative(dx = 3.132f)
                // c 4 0 5.829 -2.945 5.829 -6.666
                curveToRelative(
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                    dx2 = 5.829f,
                    dy2 = -2.945f,
                    dx3 = 5.829f,
                    dy3 = -6.666f,
                )
                // c 0 -3.969 -1.859 -6.852 -6.139 -6.852
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.969f,
                    dx2 = -1.859f,
                    dy2 = -6.852f,
                    dx3 = -6.139f,
                    dy3 = -6.852f,
                )
                // h -2.822
                horizontalLineToRelative(dx = -2.822f)
                // v 13.518z
                verticalLineToRelative(dy = 13.518f)
                close()
            }
        }.build().also { _emoji1f1e9 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1e9: ImageVector? = null
