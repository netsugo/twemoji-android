package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f944: ImageVector
    get() {
        val current = _emoji1f944
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f944",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M24 10 c0 -4.971 -2.91 -10 -6.5 -10 S11 5.029 11 10 c0 3.744 1.651 6.385 4 7.461 V33.5 c0 1.381 1.119 2.5 2.5 2.5 s2.5 -1.119 2.5 -2.5 V17.461 c2.349 -1.076 4 -3.717 4 -7.461z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 24 10
                moveTo(x = 24.0f, y = 10.0f)
                // c 0 -4.971 -2.91 -10 -6.5 -10
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.971f,
                    dx2 = -2.91f,
                    dy2 = -10.0f,
                    dx3 = -6.5f,
                    dy3 = -10.0f,
                )
                // S 11 5.029 11 10
                reflectiveCurveTo(
                    x1 = 11.0f,
                    y1 = 5.029f,
                    x2 = 11.0f,
                    y2 = 10.0f,
                )
                // c 0 3.744 1.651 6.385 4 7.461
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.744f,
                    dx2 = 1.651f,
                    dy2 = 6.385f,
                    dx3 = 4.0f,
                    dy3 = 7.461f,
                )
                // V 33.5
                verticalLineTo(y = 33.5f)
                // c 0 1.381 1.119 2.5 2.5 2.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.381f,
                    dx2 = 1.119f,
                    dy2 = 2.5f,
                    dx3 = 2.5f,
                    dy3 = 2.5f,
                )
                // s 2.5 -1.119 2.5 -2.5
                reflectiveCurveToRelative(
                    dx1 = 2.5f,
                    dy1 = -1.119f,
                    dx2 = 2.5f,
                    dy2 = -2.5f,
                )
                // V 17.461
                verticalLineTo(y = 17.461f)
                // c 2.349 -1.076 4 -3.717 4 -7.461z
                curveToRelative(
                    dx1 = 2.349f,
                    dy1 = -1.076f,
                    dx2 = 4.0f,
                    dy2 = -3.717f,
                    dx3 = 4.0f,
                    dy3 = -7.461f,
                )
                close()
            }
        }.build().also { _emoji1f944 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f944: ImageVector? = null
