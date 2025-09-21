package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji2665: ImageVector
    get() {
        val current = _emoji2665
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji2665",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M2.067 11.319 C2.067 2.521 14.251 -0.74 18 9.445 21.749 -0.741 33.933 2.52 33.933 11.319 33.933 20.879 18 33 18 33 S2.067 20.879 2.067 11.319z
            path(
                fill = SolidColor(Color(0xFFBE1931)),
            ) {
                // M 2.067 11.319
                moveTo(x = 2.067f, y = 11.319f)
                // C 2.067 2.521 14.251 -0.74 18 9.445
                curveTo(
                    x1 = 2.067f,
                    y1 = 2.521f,
                    x2 = 14.251f,
                    y2 = -0.74f,
                    x3 = 18.0f,
                    y3 = 9.445f,
                )
                // C 21.749 -0.741 33.933 2.52 33.933 11.319
                curveTo(
                    x1 = 21.749f,
                    y1 = -0.741f,
                    x2 = 33.933f,
                    y2 = 2.52f,
                    x3 = 33.933f,
                    y3 = 11.319f,
                )
                // C 33.933 20.879 18 33 18 33
                curveTo(
                    x1 = 33.933f,
                    y1 = 20.879f,
                    x2 = 18.0f,
                    y2 = 33.0f,
                    x3 = 18.0f,
                    y3 = 33.0f,
                )
                // S 2.067 20.879 2.067 11.319z
                reflectiveCurveTo(
                    x1 = 2.067f,
                    y1 = 20.879f,
                    x2 = 2.067f,
                    y2 = 11.319f,
                )
                close()
            }
        }.build().also { _emoji2665 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji2665: ImageVector? = null
