package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji3020e3: ImageVector
    get() {
        val current = _emoji3020e3
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji3020e3",
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
            // M9.785 17.962 c0 -5.054 1.954 -11.41 8.216 -11.41 6.264 0 8.217 6.356 8.217 11.41 s-1.953 11.41 -8.217 11.41 c-6.262 0 -8.216 -6.356 -8.216 -11.41z M21.381 17.962 c0 -2.356 -0.217 -7.193 -3.379 -7.193 s-3.379 4.837 -3.379 7.193 c0 2.201 0.217 7.193 3.379 7.193 s3.379 -4.992 3.379 -7.193z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 9.785 17.962
                moveTo(x = 9.785f, y = 17.962f)
                // c 0 -5.054 1.954 -11.41 8.216 -11.41
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -5.054f,
                    dx2 = 1.954f,
                    dy2 = -11.41f,
                    dx3 = 8.216f,
                    dy3 = -11.41f,
                )
                // c 6.264 0 8.217 6.356 8.217 11.41
                curveToRelative(
                    dx1 = 6.264f,
                    dy1 = 0.0f,
                    dx2 = 8.217f,
                    dy2 = 6.356f,
                    dx3 = 8.217f,
                    dy3 = 11.41f,
                )
                // s -1.953 11.41 -8.217 11.41
                reflectiveCurveToRelative(
                    dx1 = -1.953f,
                    dy1 = 11.41f,
                    dx2 = -8.217f,
                    dy2 = 11.41f,
                )
                // c -6.262 0 -8.216 -6.356 -8.216 -11.41z
                curveToRelative(
                    dx1 = -6.262f,
                    dy1 = 0.0f,
                    dx2 = -8.216f,
                    dy2 = -6.356f,
                    dx3 = -8.216f,
                    dy3 = -11.41f,
                )
                close()
                // M 21.381 17.962
                moveTo(x = 21.381f, y = 17.962f)
                // c 0 -2.356 -0.217 -7.193 -3.379 -7.193
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.356f,
                    dx2 = -0.217f,
                    dy2 = -7.193f,
                    dx3 = -3.379f,
                    dy3 = -7.193f,
                )
                // s -3.379 4.837 -3.379 7.193
                reflectiveCurveToRelative(
                    dx1 = -3.379f,
                    dy1 = 4.837f,
                    dx2 = -3.379f,
                    dy2 = 7.193f,
                )
                // c 0 2.201 0.217 7.193 3.379 7.193
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.201f,
                    dx2 = 0.217f,
                    dy2 = 7.193f,
                    dx3 = 3.379f,
                    dy3 = 7.193f,
                )
                // s 3.379 -4.992 3.379 -7.193z
                reflectiveCurveToRelative(
                    dx1 = 3.379f,
                    dy1 = -4.992f,
                    dx2 = 3.379f,
                    dy2 = -7.193f,
                )
                close()
            }
        }.build().also { _emoji3020e3 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji3020e3: ImageVector? = null
