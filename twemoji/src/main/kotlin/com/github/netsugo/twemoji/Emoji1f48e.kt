package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f48e: ImageVector
    get() {
        val current = _emoji1f48e
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f48e",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M13 3 H7 l-7 9 h10z
            path(
                fill = SolidColor(Color(0xFFBDDDF4)),
            ) {
                // M 13 3
                moveTo(x = 13.0f, y = 3.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
                // l -7 9
                lineToRelative(dx = -7.0f, dy = 9.0f)
                // h 10z
                horizontalLineToRelative(dx = 10.0f)
                close()
            }
            // M36 12 l-7 -9 h-6 l3 9z
            path(
                fill = SolidColor(Color(0xFF5DADEC)),
            ) {
                // M 36 12
                moveTo(x = 36.0f, y = 12.0f)
                // l -7 -9
                lineToRelative(dx = -7.0f, dy = -9.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // l 3 9z
                lineToRelative(dx = 3.0f, dy = 9.0f)
                close()
            }
            // M26 12 h10 L18 33z
            path(
                fill = SolidColor(Color(0xFF4289C1)),
            ) {
                // M 26 12
                moveTo(x = 26.0f, y = 12.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // L 18 33z
                lineTo(x = 18.0f, y = 33.0f)
                close()
            }
            // M10 12 L0 12 l18 21z M13 3 l-3 9 h16 l-3 -9z
            path(
                fill = SolidColor(Color(0xFF8CCAF7)),
            ) {
                // M 10 12
                moveTo(x = 10.0f, y = 12.0f)
                // L 0 12
                lineTo(x = 0.0f, y = 12.0f)
                // l 18 21z
                lineToRelative(dx = 18.0f, dy = 21.0f)
                close()
                // M 13 3
                moveTo(x = 13.0f, y = 3.0f)
                // l -3 9
                lineToRelative(dx = -3.0f, dy = 9.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // l -3 -9z
                lineToRelative(dx = -3.0f, dy = -9.0f)
                close()
            }
            // M18 33 l-8 -21 h16z
            path(
                fill = SolidColor(Color(0xFF5DADEC)),
            ) {
                // M 18 33
                moveTo(x = 18.0f, y = 33.0f)
                // l -8 -21
                lineToRelative(dx = -8.0f, dy = -21.0f)
                // h 16z
                horizontalLineToRelative(dx = 16.0f)
                close()
            }
        }.build().also { _emoji1f48e = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f48e: ImageVector? = null
