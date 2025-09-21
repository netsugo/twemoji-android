package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji2626: ImageVector
    get() {
        val current = _emoji2626
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji2626",
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
            // M23 6 h-3 V4 c0 -0.552 -0.447 -1 -1 -1 h-2 c-0.552 0 -1 0.448 -1 1 v2 h-3 c-0.552 0 -1 0.448 -1 1 v2 c0 0.552 0.448 1 1 1 h3 v22 c0 0.553 0.448 1 1 1 h2 c0.553 0 1 -0.447 1 -1 V10 h3 c0.553 0 1 -0.448 1 -1 V7 c0 -0.552 -0.447 -1 -1 -1z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 23 6
                moveTo(x = 23.0f, y = 6.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
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
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
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
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 22
                verticalLineToRelative(dy = 22.0f)
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
                // V 10
                verticalLineTo(y = 10.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // c 0.553 0 1 -0.448 1 -1
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -0.448f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // V 7
                verticalLineTo(y = 7.0f)
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
            // M29 13 L7 13 c-0.552 0 -1 0.448 -1 1 v2 c0 0.553 0.448 1 1 1 h22 c0.553 0 1 -0.447 1 -1 v-2 c0 -0.552 -0.447 -1 -1 -1z M24.324 24.924 l-11.429 -3.657 c-0.526 -0.168 -1.089 0.122 -1.257 0.648 l-0.61 1.905 c-0.168 0.526 0.122 1.089 0.648 1.257 l11.429 3.657 c0.526 0.168 1.089 -0.121 1.257 -0.648 l0.61 -1.905 c0.168 -0.526 -0.121 -1.089 -0.648 -1.257z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 29 13
                moveTo(x = 29.0f, y = 13.0f)
                // L 7 13
                lineTo(x = 7.0f, y = 13.0f)
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
                // c 0 0.553 0.448 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = 0.448f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // h 22
                horizontalLineToRelative(dx = 22.0f)
                // c 0.553 0 1 -0.447 1 -1
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -0.447f,
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
                // M 24.324 24.924
                moveTo(x = 24.324f, y = 24.924f)
                // l -11.429 -3.657
                lineToRelative(dx = -11.429f, dy = -3.657f)
                // c -0.526 -0.168 -1.089 0.122 -1.257 0.648
                curveToRelative(
                    dx1 = -0.526f,
                    dy1 = -0.168f,
                    dx2 = -1.089f,
                    dy2 = 0.122f,
                    dx3 = -1.257f,
                    dy3 = 0.648f,
                )
                // l -0.61 1.905
                lineToRelative(dx = -0.61f, dy = 1.905f)
                // c -0.168 0.526 0.122 1.089 0.648 1.257
                curveToRelative(
                    dx1 = -0.168f,
                    dy1 = 0.526f,
                    dx2 = 0.122f,
                    dy2 = 1.089f,
                    dx3 = 0.648f,
                    dy3 = 1.257f,
                )
                // l 11.429 3.657
                lineToRelative(dx = 11.429f, dy = 3.657f)
                // c 0.526 0.168 1.089 -0.121 1.257 -0.648
                curveToRelative(
                    dx1 = 0.526f,
                    dy1 = 0.168f,
                    dx2 = 1.089f,
                    dy2 = -0.121f,
                    dx3 = 1.257f,
                    dy3 = -0.648f,
                )
                // l 0.61 -1.905
                lineToRelative(dx = 0.61f, dy = -1.905f)
                // c 0.168 -0.526 -0.121 -1.089 -0.648 -1.257z
                curveToRelative(
                    dx1 = 0.168f,
                    dy1 = -0.526f,
                    dx2 = -0.121f,
                    dy2 = -1.089f,
                    dx3 = -0.648f,
                    dy3 = -1.257f,
                )
                close()
            }
        }.build().also { _emoji2626 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji2626: ImageVector? = null
