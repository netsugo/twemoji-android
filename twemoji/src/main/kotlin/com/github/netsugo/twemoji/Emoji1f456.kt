package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f456: ImageVector
    get() {
        val current = _emoji1f456
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f456",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M20.182 0 H10 v4.568 L3.818 33.682 11.545 36 l6.41 -23.182z
            path(
                fill = SolidColor(Color(0xFF3B88C3)),
            ) {
                // M 20.182 0
                moveTo(x = 20.182f, y = 0.0f)
                // H 10
                horizontalLineTo(x = 10.0f)
                // v 4.568
                verticalLineToRelative(dy = 4.568f)
                // L 3.818 33.682
                lineTo(x = 3.818f, y = 33.682f)
                // L 11.545 36
                lineTo(x = 11.545f, y = 36.0f)
                // l 6.41 -23.182z
                lineToRelative(dx = 6.41f, dy = -23.182f)
                close()
            }
            // M15.818 0 H26 v4.568 l6.182 29.114 L24.454 36 l-6.409 -23.182z
            path(
                fill = SolidColor(Color(0xFF3B88C3)),
            ) {
                // M 15.818 0
                moveTo(x = 15.818f, y = 0.0f)
                // H 26
                horizontalLineTo(x = 26.0f)
                // v 4.568
                verticalLineToRelative(dy = 4.568f)
                // l 6.182 29.114
                lineToRelative(dx = 6.182f, dy = 29.114f)
                // L 24.454 36
                lineTo(x = 24.454f, y = 36.0f)
                // l -6.409 -23.182z
                lineToRelative(dx = -6.409f, dy = -23.182f)
                close()
            }
            // M10 2 h16 v2 L10 4z M19 12 h-2 l-4 -2 h10z
            path(
                fill = SolidColor(Color(0xFF226699)),
            ) {
                // M 10 2
                moveTo(x = 10.0f, y = 2.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // L 10 4z
                lineTo(x = 10.0f, y = 4.0f)
                close()
                // M 19 12
                moveTo(x = 19.0f, y = 12.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // l -4 -2
                lineToRelative(dx = -4.0f, dy = -2.0f)
                // h 10z
                horizontalLineToRelative(dx = 10.0f)
                close()
            }
            // M12 0 h2 v3 h-2z M22 0 h2 v3 h-2z M16 4 h2 v7 h-2z
            path(
                fill = SolidColor(Color(0xFF226699)),
            ) {
                // M 12 0
                moveTo(x = 12.0f, y = 0.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
                // M 22 0
                moveTo(x = 22.0f, y = 0.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
                // M 16 4
                moveTo(x = 16.0f, y = 4.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
        }.build().also { _emoji1f456 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f456: ImageVector? = null
