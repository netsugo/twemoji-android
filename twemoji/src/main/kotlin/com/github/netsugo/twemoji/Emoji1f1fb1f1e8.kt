package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1fb1f1e8: ImageVector
    get() {
        val current = _emoji1f1fb1f1e8
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1fb1f1e8",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M32 5 h-5 v26 h5 c2.209 0 4 -1.791 4 -4 V9 c0 -2.209 -1.791 -4 -4 -4z
            path(
                fill = SolidColor(Color(0xFF009E60)),
            ) {
                // M 32 5
                moveTo(x = 32.0f, y = 5.0f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // v 26
                verticalLineToRelative(dy = 26.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // c 2.209 0 4 -1.791 4 -4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = -1.791f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // V 9
                verticalLineTo(y = 9.0f)
                // c 0 -2.209 -1.791 -4 -4 -4z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.209f,
                    dx2 = -1.791f,
                    dy2 = -4.0f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                close()
            }
            // M4 5 C1.791 5 0 6.791 0 9 v18 c0 2.209 1.791 4 4 4 h5 V5 H4z
            path(
                fill = SolidColor(Color(0xFF0072C6)),
            ) {
                // M 4 5
                moveTo(x = 4.0f, y = 5.0f)
                // C 1.791 5 0 6.791 0 9
                curveTo(
                    x1 = 1.791f,
                    y1 = 5.0f,
                    x2 = 0.0f,
                    y2 = 6.791f,
                    x3 = 0.0f,
                    y3 = 9.0f,
                )
                // v 18
                verticalLineToRelative(dy = 18.0f)
                // c 0 2.209 1.791 4 4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = 1.791f,
                    dy2 = 4.0f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // V 5
                verticalLineTo(y = 5.0f)
                // H 4z
                horizontalLineTo(x = 4.0f)
                close()
            }
            // M9 5 h18 v26 H9z
            path(
                fill = SolidColor(Color(0xFFFCD116)),
            ) {
                // M 9 5
                moveTo(x = 9.0f, y = 5.0f)
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // v 26
                verticalLineToRelative(dy = 26.0f)
                // H 9z
                horizontalLineTo(x = 9.0f)
                close()
            }
            // M15.833 23.526 L18 27.859 l2.167 -4.333 L18 19.193 l-2.167 4.333z M13.125 18.109 l2.167 4.333 2.167 -4.333 -2.167 -4.333 -2.167 4.333z M18.542 18.109 l2.167 4.333 2.167 -4.333 -2.167 -4.333 -2.167 4.333z
            path(
                fill = SolidColor(Color(0xFF009E60)),
            ) {
                // M 15.833 23.526
                moveTo(x = 15.833f, y = 23.526f)
                // L 18 27.859
                lineTo(x = 18.0f, y = 27.859f)
                // l 2.167 -4.333
                lineToRelative(dx = 2.167f, dy = -4.333f)
                // L 18 19.193
                lineTo(x = 18.0f, y = 19.193f)
                // l -2.167 4.333z
                lineToRelative(dx = -2.167f, dy = 4.333f)
                close()
                // M 13.125 18.109
                moveTo(x = 13.125f, y = 18.109f)
                // l 2.167 4.333
                lineToRelative(dx = 2.167f, dy = 4.333f)
                // l 2.167 -4.333
                lineToRelative(dx = 2.167f, dy = -4.333f)
                // l -2.167 -4.333
                lineToRelative(dx = -2.167f, dy = -4.333f)
                // l -2.167 4.333z
                lineToRelative(dx = -2.167f, dy = 4.333f)
                close()
                // M 18.542 18.109
                moveTo(x = 18.542f, y = 18.109f)
                // l 2.167 4.333
                lineToRelative(dx = 2.167f, dy = 4.333f)
                // l 2.167 -4.333
                lineToRelative(dx = 2.167f, dy = -4.333f)
                // l -2.167 -4.333
                lineToRelative(dx = -2.167f, dy = -4.333f)
                // l -2.167 4.333z
                lineToRelative(dx = -2.167f, dy = 4.333f)
                close()
            }
        }.build().also { _emoji1f1fb1f1e8 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1fb1f1e8: ImageVector? = null
