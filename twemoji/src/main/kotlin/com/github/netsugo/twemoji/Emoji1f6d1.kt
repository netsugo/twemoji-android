package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f6d1: ImageVector
    get() {
        val current = _emoji1f6d1
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f6d1",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M12 3 l-9 8.985 V24 l9 9 h12 l9 -9 V11.985 L24 3z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 12 3
                moveTo(x = 12.0f, y = 3.0f)
                // l -9 8.985
                lineToRelative(dx = -9.0f, dy = 8.985f)
                // V 24
                verticalLineTo(y = 24.0f)
                // l 9 9
                lineToRelative(dx = 9.0f, dy = 9.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // l 9 -9
                lineToRelative(dx = 9.0f, dy = -9.0f)
                // V 11.985
                verticalLineTo(y = 11.985f)
                // L 24 3z
                lineTo(x = 24.0f, y = 3.0f)
                close()
            }
            // M24.827 1 H11.173 L1 11.156 v13.672 L11.172 35 h13.657 L35 24.828 V11.156 L24.827 1z M33 24 l-9 9 H12 l-9 -9 V11.985 L12 3 h12 l9 8.985 V24z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 24.827 1
                moveTo(x = 24.827f, y = 1.0f)
                // H 11.173
                horizontalLineTo(x = 11.173f)
                // L 1 11.156
                lineTo(x = 1.0f, y = 11.156f)
                // v 13.672
                verticalLineToRelative(dy = 13.672f)
                // L 11.172 35
                lineTo(x = 11.172f, y = 35.0f)
                // h 13.657
                horizontalLineToRelative(dx = 13.657f)
                // L 35 24.828
                lineTo(x = 35.0f, y = 24.828f)
                // V 11.156
                verticalLineTo(y = 11.156f)
                // L 24.827 1z
                lineTo(x = 24.827f, y = 1.0f)
                close()
                // M 33 24
                moveTo(x = 33.0f, y = 24.0f)
                // l -9 9
                lineToRelative(dx = -9.0f, dy = 9.0f)
                // H 12
                horizontalLineTo(x = 12.0f)
                // l -9 -9
                lineToRelative(dx = -9.0f, dy = -9.0f)
                // V 11.985
                verticalLineTo(y = 11.985f)
                // L 12 3
                lineTo(x = 12.0f, y = 3.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // l 9 8.985
                lineToRelative(dx = 9.0f, dy = 8.985f)
                // V 24z
                verticalLineTo(y = 24.0f)
                close()
            }
        }.build().also { _emoji1f6d1 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f6d1: ImageVector? = null
