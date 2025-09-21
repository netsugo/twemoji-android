package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1e71f1ef: ImageVector
    get() {
        val current = _emoji1f1e71f1ef
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1e71f1ef",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M32 5 H14 v13 h22 V9 c0 -2.209 -1.791 -4 -4 -4z
            path(
                fill = SolidColor(Color(0xFFFCD116)),
            ) {
                // M 32 5
                moveTo(x = 32.0f, y = 5.0f)
                // H 14
                horizontalLineTo(x = 14.0f)
                // v 13
                verticalLineToRelative(dy = 13.0f)
                // h 22
                horizontalLineToRelative(dx = 22.0f)
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
            // M14 31 h18 c2.209 0 4 -1.791 4 -4 v-9 H14 v13z
            path(
                fill = SolidColor(Color(0xFFE8112D)),
            ) {
                // M 14 31
                moveTo(x = 14.0f, y = 31.0f)
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // c 2.209 0 4 -1.791 4 -4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = -1.791f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // v -9
                verticalLineToRelative(dy = -9.0f)
                // H 14
                horizontalLineTo(x = 14.0f)
                // v 13z
                verticalLineToRelative(dy = 13.0f)
                close()
            }
            // M14 5 H4 C1.791 5 0 6.791 0 9 v18 c0 2.209 1.791 4 4 4 h10 V5z
            path(
                fill = SolidColor(Color(0xFF008751)),
            ) {
                // M 14 5
                moveTo(x = 14.0f, y = 5.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
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
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // V 5z
                verticalLineTo(y = 5.0f)
                close()
            }
        }.build().also { _emoji1f1e71f1ef = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1e71f1ef: ImageVector? = null
