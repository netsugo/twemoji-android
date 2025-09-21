package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f9b2: ImageVector
    get() {
        val current = _emoji1f9b2
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f9b2",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M34.896 36 C30.618 13.677 16.169 2.725 0 1.195 V36 h34.896z
            path(
                fill = SolidColor(Color(0xFFFFDC5D)),
            ) {
                // M 34.896 36
                moveTo(x = 34.896f, y = 36.0f)
                // C 30.618 13.677 16.169 2.725 0 1.195
                curveTo(
                    x1 = 30.618f,
                    y1 = 13.677f,
                    x2 = 16.169f,
                    y2 = 2.725f,
                    x3 = 0.0f,
                    y3 = 1.195f,
                )
                // V 36
                verticalLineTo(y = 36.0f)
                // h 34.896z
                horizontalLineToRelative(dx = 34.896f)
                close()
            }
        }.build().also { _emoji1f9b2 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f9b2: ImageVector? = null
