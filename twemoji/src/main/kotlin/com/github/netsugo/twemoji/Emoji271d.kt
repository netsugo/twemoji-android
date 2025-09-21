package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji271d: ImageVector
    get() {
        val current = _emoji271d
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji271d",
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
            // M26 10 h-6 V4 c0 -0.552 -0.447 -1 -1 -1 h-2 c-0.552 0 -1 0.448 -1 1 v6 h-6 c-0.552 0 -1 0.448 -1 1 v2 c0 0.552 0.448 1 1 1 h6 v18 c0 0.553 0.448 1 1 1 h2 c0.553 0 1 -0.447 1 -1 V14 h6 c0.553 0 1 -0.448 1 -1 v-2 c0 -0.552 -0.447 -1 -1 -1z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 26 10
                moveTo(x = 26.0f, y = 10.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // c 0 -0.552 -0.447 -1 -1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = -0.447f,
                    dy2 = -1.0f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // c -0.552 0 -1 0.448 -1 1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = 0.448f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // c -0.552 0 -1 0.448 -1 1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = 0.448f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // c 0 0.552 0.448 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = 0.448f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 18
                verticalLineToRelative(dy = 18.0f)
                // c 0 0.553 0.448 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = 0.448f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // c 0.553 0 1 -0.447 1 -1
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -0.447f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // V 14
                verticalLineTo(y = 14.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // c 0.553 0 1 -0.448 1 -1
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -0.448f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // c 0 -0.552 -0.447 -1 -1 -1z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = -0.447f,
                    dy2 = -1.0f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                close()
            }
        }.build().also { _emoji271d = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji271d: ImageVector? = null
