package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji25fb: ImageVector
    get() {
        val current = _emoji25fb
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji25fb",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M33 30 c0 1.657 -1.343 3 -3 3 H6 c-1.657 0 -3 -1.343 -3 -3 V6 c0 -1.657 1.343 -3 3 -3 h24 c1.657 0 3 1.343 3 3 v24z
            path(
                fill = SolidColor(Color(0xFFE6E7E8)),
            ) {
                // M 33 30
                moveTo(x = 33.0f, y = 30.0f)
                // c 0 1.657 -1.343 3 -3 3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.657f,
                    dx2 = -1.343f,
                    dy2 = 3.0f,
                    dx3 = -3.0f,
                    dy3 = 3.0f,
                )
                // H 6
                horizontalLineTo(x = 6.0f)
                // c -1.657 0 -3 -1.343 -3 -3
                curveToRelative(
                    dx1 = -1.657f,
                    dy1 = 0.0f,
                    dx2 = -3.0f,
                    dy2 = -1.343f,
                    dx3 = -3.0f,
                    dy3 = -3.0f,
                )
                // V 6
                verticalLineTo(y = 6.0f)
                // c 0 -1.657 1.343 -3 3 -3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.657f,
                    dx2 = 1.343f,
                    dy2 = -3.0f,
                    dx3 = 3.0f,
                    dy3 = -3.0f,
                )
                // h 24
                horizontalLineToRelative(dx = 24.0f)
                // c 1.657 0 3 1.343 3 3
                curveToRelative(
                    dx1 = 1.657f,
                    dy1 = 0.0f,
                    dx2 = 3.0f,
                    dy2 = 1.343f,
                    dx3 = 3.0f,
                    dy3 = 3.0f,
                )
                // v 24z
                verticalLineToRelative(dy = 24.0f)
                close()
            }
        }.build().also { _emoji25fb = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji25fb: ImageVector? = null
