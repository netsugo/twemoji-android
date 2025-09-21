package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji21a9: ImageVector
    get() {
        val current = _emoji21a9
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji21a9",
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
            // M18 5 h-8 v4 h8.01 c3.86 0.005 6.99 3.137 6.99 7 0 3.865 -3.135 7 -7 7 h-4 v-4 l-7.2 6 7.2 6 v-4 h4 c6.074 0 11 -4.926 11 -11 0 -6.075 -4.926 -11 -11 -11z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 18 5
                moveTo(x = 18.0f, y = 5.0f)
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h 8.01
                horizontalLineToRelative(dx = 8.01f)
                // c 3.86 0.005 6.99 3.137 6.99 7
                curveToRelative(
                    dx1 = 3.86f,
                    dy1 = 0.005f,
                    dx2 = 6.99f,
                    dy2 = 3.137f,
                    dx3 = 6.99f,
                    dy3 = 7.0f,
                )
                // c 0 3.865 -3.135 7 -7 7
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.865f,
                    dx2 = -3.135f,
                    dy2 = 7.0f,
                    dx3 = -7.0f,
                    dy3 = 7.0f,
                )
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // l -7.2 6
                lineToRelative(dx = -7.2f, dy = 6.0f)
                // l 7.2 6
                lineToRelative(dx = 7.2f, dy = 6.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // c 6.074 0 11 -4.926 11 -11
                curveToRelative(
                    dx1 = 6.074f,
                    dy1 = 0.0f,
                    dx2 = 11.0f,
                    dy2 = -4.926f,
                    dx3 = 11.0f,
                    dy3 = -11.0f,
                )
                // c 0 -6.075 -4.926 -11 -11 -11z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -6.075f,
                    dx2 = -4.926f,
                    dy2 = -11.0f,
                    dx3 = -11.0f,
                    dy3 = -11.0f,
                )
                close()
            }
        }.build().also { _emoji21a9 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji21a9: ImageVector? = null
