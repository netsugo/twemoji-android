package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji25ab: ImageVector
    get() {
        val current = _emoji25ab
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji25ab",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M25 24 c0 0.553 -0.447 1 -1 1 H12 c-0.552 0 -1 -0.447 -1 -1 V12 c0 -0.552 0.448 -1 1 -1 h12 c0.553 0 1 0.448 1 1 v12z
            path(
                fill = SolidColor(Color(0xFFE6E7E8)),
            ) {
                // M 25 24
                moveTo(x = 25.0f, y = 24.0f)
                // c 0 0.553 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // H 12
                horizontalLineTo(x = 12.0f)
                // c -0.552 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // V 12
                verticalLineTo(y = 12.0f)
                // c 0 -0.552 0.448 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = 0.448f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // c 0.553 0 1 0.448 1 1
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.448f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // v 12z
                verticalLineToRelative(dy = 12.0f)
                close()
            }
        }.build().also { _emoji25ab = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji25ab: ImageVector? = null
