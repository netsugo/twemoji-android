package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f194: ImageVector
    get() {
        val current = _emoji1f194
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f194",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 32 c0 2.209 -1.791 4 -4 4 H4 c-2.209 0 -4 -1.791 -4 -4 V4 c0 -2.209 1.791 -4 4 -4 h28 c2.209 0 4 1.791 4 4 v28z
            path(
                fill = SolidColor(Color(0xFF9266CC)),
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
            // M5.717 9.156 c0 -1.55 0.992 -2.418 2.325 -2.418 s2.325 0.868 2.325 2.418 v17.611 c0 1.551 -0.992 2.418 -2.325 2.418 s-2.325 -0.867 -2.325 -2.418 L5.717 9.156z M13.157 9.312 c0 -1.427 0.992 -2.388 2.387 -2.388 h5.148 c6.945 0 10.914 4.465 10.914 11.348 C31.605 24.783 27.389 29 21.001 29 h-5.395 c-1.023 0 -2.449 -0.559 -2.449 -2.325 L13.157 9.312z M17.807 24.721 h3.132 c4 0 5.828 -2.945 5.828 -6.666 0 -3.969 -1.859 -6.852 -6.139 -6.852 h-2.822 v13.518z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 5.717 9.156
                moveTo(x = 5.717f, y = 9.156f)
                // c 0 -1.55 0.992 -2.418 2.325 -2.418
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.55f,
                    dx2 = 0.992f,
                    dy2 = -2.418f,
                    dx3 = 2.325f,
                    dy3 = -2.418f,
                )
                // s 2.325 0.868 2.325 2.418
                reflectiveCurveToRelative(
                    dx1 = 2.325f,
                    dy1 = 0.868f,
                    dx2 = 2.325f,
                    dy2 = 2.418f,
                )
                // v 17.611
                verticalLineToRelative(dy = 17.611f)
                // c 0 1.551 -0.992 2.418 -2.325 2.418
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.551f,
                    dx2 = -0.992f,
                    dy2 = 2.418f,
                    dx3 = -2.325f,
                    dy3 = 2.418f,
                )
                // s -2.325 -0.867 -2.325 -2.418
                reflectiveCurveToRelative(
                    dx1 = -2.325f,
                    dy1 = -0.867f,
                    dx2 = -2.325f,
                    dy2 = -2.418f,
                )
                // L 5.717 9.156z
                lineTo(x = 5.717f, y = 9.156f)
                close()
                // M 13.157 9.312
                moveTo(x = 13.157f, y = 9.312f)
                // c 0 -1.427 0.992 -2.388 2.387 -2.388
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.427f,
                    dx2 = 0.992f,
                    dy2 = -2.388f,
                    dx3 = 2.387f,
                    dy3 = -2.388f,
                )
                // h 5.148
                horizontalLineToRelative(dx = 5.148f)
                // c 6.945 0 10.914 4.465 10.914 11.348
                curveToRelative(
                    dx1 = 6.945f,
                    dy1 = 0.0f,
                    dx2 = 10.914f,
                    dy2 = 4.465f,
                    dx3 = 10.914f,
                    dy3 = 11.348f,
                )
                // C 31.605 24.783 27.389 29 21.001 29
                curveTo(
                    x1 = 31.605f,
                    y1 = 24.783f,
                    x2 = 27.389f,
                    y2 = 29.0f,
                    x3 = 21.001f,
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
                // L 13.157 9.312z
                lineTo(x = 13.157f, y = 9.312f)
                close()
                // M 17.807 24.721
                moveTo(x = 17.807f, y = 24.721f)
                // h 3.132
                horizontalLineToRelative(dx = 3.132f)
                // c 4 0 5.828 -2.945 5.828 -6.666
                curveToRelative(
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                    dx2 = 5.828f,
                    dy2 = -2.945f,
                    dx3 = 5.828f,
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
        }.build().also { _emoji1f194 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f194: ImageVector? = null
