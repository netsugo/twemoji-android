package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1e81f1ed: ImageVector
    get() {
        val current = _emoji1f1e81f1ed
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1e81f1ed",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M31 27 c0 2.209 -1.791 4 -4 4 H9 c-2.209 0 -4 -1.791 -4 -4 V9 c0 -2.209 1.791 -4 4 -4 h18 c2.209 0 4 1.791 4 4 v18z
            path(
                fill = SolidColor(Color(0xFFD32D27)),
            ) {
                // M 31 27
                moveTo(x = 31.0f, y = 27.0f)
                // c 0 2.209 -1.791 4 -4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = -1.791f,
                    dy2 = 4.0f,
                    dx3 = -4.0f,
                    dy3 = 4.0f,
                )
                // H 9
                horizontalLineTo(x = 9.0f)
                // c -2.209 0 -4 -1.791 -4 -4
                curveToRelative(
                    dx1 = -2.209f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = -1.791f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                // V 9
                verticalLineTo(y = 9.0f)
                // c 0 -2.209 1.791 -4 4 -4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.209f,
                    dx2 = 1.791f,
                    dy2 = -4.0f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // c 2.209 0 4 1.791 4 4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = 1.791f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // v 18z
                verticalLineToRelative(dy = 18.0f)
                close()
            }
            // M25 16.063 h-5 v-5 h-4 v5 h-5 V20 h5 v5.063 h4 V20 h5z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 25 16.063
                moveTo(x = 25.0f, y = 16.063f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // V 20
                verticalLineTo(y = 20.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // v 5.063
                verticalLineToRelative(dy = 5.063f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // V 20
                verticalLineTo(y = 20.0f)
                // h 5z
                horizontalLineToRelative(dx = 5.0f)
                close()
            }
        }.build().also { _emoji1f1e81f1ed = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1e81f1ed: ImageVector? = null
