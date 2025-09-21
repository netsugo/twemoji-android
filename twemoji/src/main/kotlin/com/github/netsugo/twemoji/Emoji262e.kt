package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji262e: ImageVector
    get() {
        val current = _emoji262e
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji262e",
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
            // M18 4 C10.281 4 4 10.281 4 18 s6.281 14 14 14 14 -6.281 14 -14 S25.719 4 18 4z M29.103 18 c0 2.246 -0.675 4.335 -1.827 6.085 l-7.823 -7.178 L19.453 7.003 c5.437 0.716 9.65 5.368 9.65 10.997z M16.453 28.983 c-2.209 -0.31 -4.207 -1.268 -5.802 -2.682 l5.802 -5.323 v8.005z M19.453 20.978 l5.848 5.366 c-1.609 1.41 -3.624 2.36 -5.848 2.653 v-8.019z M16.453 7.017 v9.889 L8.69 24.03 C7.56 22.291 6.897 20.223 6.897 18 c0 -5.596 4.165 -10.226 9.556 -10.983z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 18 4
                moveTo(x = 18.0f, y = 4.0f)
                // C 10.281 4 4 10.281 4 18
                curveTo(
                    x1 = 10.281f,
                    y1 = 4.0f,
                    x2 = 4.0f,
                    y2 = 10.281f,
                    x3 = 4.0f,
                    y3 = 18.0f,
                )
                // s 6.281 14 14 14
                reflectiveCurveToRelative(
                    dx1 = 6.281f,
                    dy1 = 14.0f,
                    dx2 = 14.0f,
                    dy2 = 14.0f,
                )
                // s 14 -6.281 14 -14
                reflectiveCurveToRelative(
                    dx1 = 14.0f,
                    dy1 = -6.281f,
                    dx2 = 14.0f,
                    dy2 = -14.0f,
                )
                // S 25.719 4 18 4z
                reflectiveCurveTo(
                    x1 = 25.719f,
                    y1 = 4.0f,
                    x2 = 18.0f,
                    y2 = 4.0f,
                )
                close()
                // M 29.103 18
                moveTo(x = 29.103f, y = 18.0f)
                // c 0 2.246 -0.675 4.335 -1.827 6.085
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.246f,
                    dx2 = -0.675f,
                    dy2 = 4.335f,
                    dx3 = -1.827f,
                    dy3 = 6.085f,
                )
                // l -7.823 -7.178
                lineToRelative(dx = -7.823f, dy = -7.178f)
                // L 19.453 7.003
                lineTo(x = 19.453f, y = 7.003f)
                // c 5.437 0.716 9.65 5.368 9.65 10.997z
                curveToRelative(
                    dx1 = 5.437f,
                    dy1 = 0.716f,
                    dx2 = 9.65f,
                    dy2 = 5.368f,
                    dx3 = 9.65f,
                    dy3 = 10.997f,
                )
                close()
                // M 16.453 28.983
                moveTo(x = 16.453f, y = 28.983f)
                // c -2.209 -0.31 -4.207 -1.268 -5.802 -2.682
                curveToRelative(
                    dx1 = -2.209f,
                    dy1 = -0.31f,
                    dx2 = -4.207f,
                    dy2 = -1.268f,
                    dx3 = -5.802f,
                    dy3 = -2.682f,
                )
                // l 5.802 -5.323
                lineToRelative(dx = 5.802f, dy = -5.323f)
                // v 8.005z
                verticalLineToRelative(dy = 8.005f)
                close()
                // M 19.453 20.978
                moveTo(x = 19.453f, y = 20.978f)
                // l 5.848 5.366
                lineToRelative(dx = 5.848f, dy = 5.366f)
                // c -1.609 1.41 -3.624 2.36 -5.848 2.653
                curveToRelative(
                    dx1 = -1.609f,
                    dy1 = 1.41f,
                    dx2 = -3.624f,
                    dy2 = 2.36f,
                    dx3 = -5.848f,
                    dy3 = 2.653f,
                )
                // v -8.019z
                verticalLineToRelative(dy = -8.019f)
                close()
                // M 16.453 7.017
                moveTo(x = 16.453f, y = 7.017f)
                // v 9.889
                verticalLineToRelative(dy = 9.889f)
                // L 8.69 24.03
                lineTo(x = 8.69f, y = 24.03f)
                // C 7.56 22.291 6.897 20.223 6.897 18
                curveTo(
                    x1 = 7.56f,
                    y1 = 22.291f,
                    x2 = 6.897f,
                    y2 = 20.223f,
                    x3 = 6.897f,
                    y3 = 18.0f,
                )
                // c 0 -5.596 4.165 -10.226 9.556 -10.983z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -5.596f,
                    dx2 = 4.165f,
                    dy2 = -10.226f,
                    dx3 = 9.556f,
                    dy3 = -10.983f,
                )
                close()
            }
        }.build().also { _emoji262e = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji262e: ImageVector? = null
