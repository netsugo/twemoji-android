package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f3f4E0067E0062E0065E006eE0067E007f: ImageVector
    get() {
        val current = _emoji1f3f4E0067E0062E0065E006eE0067E007f
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f3f4E0067E0062E0065E006eE0067E007f",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M32 5 H4 C1.791 5 0 6.791 0 9 v18 c0 2.209 1.791 4 4 4 h28 c2.209 0 4 -1.791 4 -4 V9 c0 -2.209 -1.791 -4 -4 -4z
            path(
                fill = SolidColor(Color(0xFFEEEEEE)),
            ) {
                // M 32 5
                moveTo(x = 32.0f, y = 5.0f)
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
            // M21 5 h-6 v10 H0 v6 h15 v10 h6 V21 h15 v-6 H21z
            path(
                fill = SolidColor(Color(0xFFCE1124)),
            ) {
                // M 21 5
                moveTo(x = 21.0f, y = 5.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // H 0
                horizontalLineTo(x = 0.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h 15
                horizontalLineToRelative(dx = 15.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // V 21
                verticalLineTo(y = 21.0f)
                // h 15
                horizontalLineToRelative(dx = 15.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // H 21z
                horizontalLineTo(x = 21.0f)
                close()
            }
        }.build().also { _emoji1f3f4E0067E0062E0065E006eE0067E007f = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f3f4E0067E0062E0065E006eE0067E007f: ImageVector? = null
