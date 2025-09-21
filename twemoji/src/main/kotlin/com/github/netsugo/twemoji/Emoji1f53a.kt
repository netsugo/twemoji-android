package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f53a: ImageVector
    get() {
        val current = _emoji1f53a
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f53a",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M19.146 7.639 c-0.63 -0.901 -1.637 -0.884 -2.236 0.038 L6.09 24.323 C5.491 25.245 5.9 26 7 26 h23 c1.1 0 1.483 -0.737 0.854 -1.639 L19.146 7.639z
            path(
                fill = SolidColor(Color(0xFFE75A70)),
            ) {
                // M 19.146 7.639
                moveTo(x = 19.146f, y = 7.639f)
                // c -0.63 -0.901 -1.637 -0.884 -2.236 0.038
                curveToRelative(
                    dx1 = -0.63f,
                    dy1 = -0.901f,
                    dx2 = -1.637f,
                    dy2 = -0.884f,
                    dx3 = -2.236f,
                    dy3 = 0.038f,
                )
                // L 6.09 24.323
                lineTo(x = 6.09f, y = 24.323f)
                // C 5.491 25.245 5.9 26 7 26
                curveTo(
                    x1 = 5.491f,
                    y1 = 25.245f,
                    x2 = 5.9f,
                    y2 = 26.0f,
                    x3 = 7.0f,
                    y3 = 26.0f,
                )
                // h 23
                horizontalLineToRelative(dx = 23.0f)
                // c 1.1 0 1.483 -0.737 0.854 -1.639
                curveToRelative(
                    dx1 = 1.1f,
                    dy1 = 0.0f,
                    dx2 = 1.483f,
                    dy2 = -0.737f,
                    dx3 = 0.854f,
                    dy3 = -1.639f,
                )
                // L 19.146 7.639z
                lineTo(x = 19.146f, y = 7.639f)
                close()
            }
        }.build().also { _emoji1f53a = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f53a: ImageVector? = null
