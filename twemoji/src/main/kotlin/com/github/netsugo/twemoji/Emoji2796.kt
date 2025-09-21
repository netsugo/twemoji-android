package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji2796: ImageVector
    get() {
        val current = _emoji2796
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji2796",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M34 18 c0 1.657 -1.343 3 -3 3 H5 c-1.657 0 -3 -1.343 -3 -3 s1.343 -3 3 -3 h26 c1.657 0 3 1.343 3 3z
            path(
                fill = SolidColor(Color(0xFF31373D)),
            ) {
                // M 34 18
                moveTo(x = 34.0f, y = 18.0f)
                // c 0 1.657 -1.343 3 -3 3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.657f,
                    dx2 = -1.343f,
                    dy2 = 3.0f,
                    dx3 = -3.0f,
                    dy3 = 3.0f,
                )
                // H 5
                horizontalLineTo(x = 5.0f)
                // c -1.657 0 -3 -1.343 -3 -3
                curveToRelative(
                    dx1 = -1.657f,
                    dy1 = 0.0f,
                    dx2 = -3.0f,
                    dy2 = -1.343f,
                    dx3 = -3.0f,
                    dy3 = -3.0f,
                )
                // s 1.343 -3 3 -3
                reflectiveCurveToRelative(
                    dx1 = 1.343f,
                    dy1 = -3.0f,
                    dx2 = 3.0f,
                    dy2 = -3.0f,
                )
                // h 26
                horizontalLineToRelative(dx = 26.0f)
                // c 1.657 0 3 1.343 3 3z
                curveToRelative(
                    dx1 = 1.657f,
                    dy1 = 0.0f,
                    dx2 = 3.0f,
                    dy2 = 1.343f,
                    dx3 = 3.0f,
                    dy3 = 3.0f,
                )
                close()
            }
        }.build().also { _emoji2796 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji2796: ImageVector? = null
