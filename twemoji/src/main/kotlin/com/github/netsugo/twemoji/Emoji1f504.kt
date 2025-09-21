package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f504: ImageVector
    get() {
        val current = _emoji1f504
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f504",
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
            // M22.242 22.242 l2.829 2.829 c-3.905 3.905 -10.237 3.904 -14.143 -0.001 -2.247 -2.246 -3.194 -5.296 -2.854 -8.225 l-4.037 0.367 c-0.215 3.84 1.128 7.752 4.062 10.687 5.467 5.467 14.333 5.468 19.799 0 l2.828 2.828 0.849 -9.334 -9.333 0.849z M27.899 8.1 C22.431 2.633 13.568 2.633 8.1 8.1 L5.272 5.272 l-0.849 9.334 9.334 -0.849 -2.829 -2.829 c3.906 -3.905 10.236 -3.905 14.142 0 2.248 2.247 3.194 5.297 2.856 8.226 l4.036 -0.366 c0.216 -3.841 -1.128 -7.753 -4.063 -10.688z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 22.242 22.242
                moveTo(x = 22.242f, y = 22.242f)
                // l 2.829 2.829
                lineToRelative(dx = 2.829f, dy = 2.829f)
                // c -3.905 3.905 -10.237 3.904 -14.143 -0.001
                curveToRelative(
                    dx1 = -3.905f,
                    dy1 = 3.905f,
                    dx2 = -10.237f,
                    dy2 = 3.904f,
                    dx3 = -14.143f,
                    dy3 = -0.001f,
                )
                // c -2.247 -2.246 -3.194 -5.296 -2.854 -8.225
                curveToRelative(
                    dx1 = -2.247f,
                    dy1 = -2.246f,
                    dx2 = -3.194f,
                    dy2 = -5.296f,
                    dx3 = -2.854f,
                    dy3 = -8.225f,
                )
                // l -4.037 0.367
                lineToRelative(dx = -4.037f, dy = 0.367f)
                // c -0.215 3.84 1.128 7.752 4.062 10.687
                curveToRelative(
                    dx1 = -0.215f,
                    dy1 = 3.84f,
                    dx2 = 1.128f,
                    dy2 = 7.752f,
                    dx3 = 4.062f,
                    dy3 = 10.687f,
                )
                // c 5.467 5.467 14.333 5.468 19.799 0
                curveToRelative(
                    dx1 = 5.467f,
                    dy1 = 5.467f,
                    dx2 = 14.333f,
                    dy2 = 5.468f,
                    dx3 = 19.799f,
                    dy3 = 0.0f,
                )
                // l 2.828 2.828
                lineToRelative(dx = 2.828f, dy = 2.828f)
                // l 0.849 -9.334
                lineToRelative(dx = 0.849f, dy = -9.334f)
                // l -9.333 0.849z
                lineToRelative(dx = -9.333f, dy = 0.849f)
                close()
                // M 27.899 8.1
                moveTo(x = 27.899f, y = 8.1f)
                // C 22.431 2.633 13.568 2.633 8.1 8.1
                curveTo(
                    x1 = 22.431f,
                    y1 = 2.633f,
                    x2 = 13.568f,
                    y2 = 2.633f,
                    x3 = 8.1f,
                    y3 = 8.1f,
                )
                // L 5.272 5.272
                lineTo(x = 5.272f, y = 5.272f)
                // l -0.849 9.334
                lineToRelative(dx = -0.849f, dy = 9.334f)
                // l 9.334 -0.849
                lineToRelative(dx = 9.334f, dy = -0.849f)
                // l -2.829 -2.829
                lineToRelative(dx = -2.829f, dy = -2.829f)
                // c 3.906 -3.905 10.236 -3.905 14.142 0
                curveToRelative(
                    dx1 = 3.906f,
                    dy1 = -3.905f,
                    dx2 = 10.236f,
                    dy2 = -3.905f,
                    dx3 = 14.142f,
                    dy3 = 0.0f,
                )
                // c 2.248 2.247 3.194 5.297 2.856 8.226
                curveToRelative(
                    dx1 = 2.248f,
                    dy1 = 2.247f,
                    dx2 = 3.194f,
                    dy2 = 5.297f,
                    dx3 = 2.856f,
                    dy3 = 8.226f,
                )
                // l 4.036 -0.366
                lineToRelative(dx = 4.036f, dy = -0.366f)
                // c 0.216 -3.841 -1.128 -7.753 -4.063 -10.688z
                curveToRelative(
                    dx1 = 0.216f,
                    dy1 = -3.841f,
                    dx2 = -1.128f,
                    dy2 = -7.753f,
                    dx3 = -4.063f,
                    dy3 = -10.688f,
                )
                close()
            }
        }.build().also { _emoji1f504 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f504: ImageVector? = null
