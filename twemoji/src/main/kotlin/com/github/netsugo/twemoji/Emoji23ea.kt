package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji23ea: ImageVector
    get() {
        val current = _emoji23ea
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji23ea",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M0 32 c0 2.209 1.791 4 4 4 h28 c2.209 0 4 -1.791 4 -4 V4 c0 -2.209 -1.791 -4 -4 -4 H4 C1.791 0 0 1.791 0 4 v28z
            path(
                fill = SolidColor(Color(0xFF3B88C3)),
            ) {
                // M 0 32
                moveTo(x = 0.0f, y = 32.0f)
                // c 0 2.209 1.791 4 4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = 1.791f,
                    dy2 = 4.0f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // c 2.209 0 4 -1.791 4 -4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = -1.791f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
                // c 0 -2.209 -1.791 -4 -4 -4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.209f,
                    dx2 = -1.791f,
                    dy2 = -4.0f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // C 1.791 0 0 1.791 0 4
                curveTo(
                    x1 = 1.791f,
                    y1 = 0.0f,
                    x2 = 0.0f,
                    y2 = 1.791f,
                    x3 = 0.0f,
                    y3 = 4.0f,
                )
                // v 28z
                verticalLineToRelative(dy = 28.0f)
                close()
            }
            // M6 18 L18 7 v9.166 L28 7 v22 l-10 -9.167 V29z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 6 18
                moveTo(x = 6.0f, y = 18.0f)
                // L 18 7
                lineTo(x = 18.0f, y = 7.0f)
                // v 9.166
                verticalLineToRelative(dy = 9.166f)
                // L 28 7
                lineTo(x = 28.0f, y = 7.0f)
                // v 22
                verticalLineToRelative(dy = 22.0f)
                // l -10 -9.167
                lineToRelative(dx = -10.0f, dy = -9.167f)
                // V 29z
                verticalLineTo(y = 29.0f)
                close()
            }
        }.build().also { _emoji23ea = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji23ea: ImageVector? = null
