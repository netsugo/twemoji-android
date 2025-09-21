package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji25fd: ImageVector
    get() {
        val current = _emoji25fd
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji25fd",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M29 27 c0 1.104 -0.896 2 -2 2 H9 c-1.104 0 -2 -0.896 -2 -2 V9 c0 -1.104 0.896 -2 2 -2 h18 c1.104 0 2 0.896 2 2 v18z
            path(
                fill = SolidColor(Color(0xFFE6E7E8)),
            ) {
                // M 29 27
                moveTo(x = 29.0f, y = 27.0f)
                // c 0 1.104 -0.896 2 -2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = -0.896f,
                    dy2 = 2.0f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // H 9
                horizontalLineTo(x = 9.0f)
                // c -1.104 0 -2 -0.896 -2 -2
                curveToRelative(
                    dx1 = -1.104f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -0.896f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // V 9
                verticalLineTo(y = 9.0f)
                // c 0 -1.104 0.896 -2 2 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.104f,
                    dx2 = 0.896f,
                    dy2 = -2.0f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // c 1.104 0 2 0.896 2 2
                curveToRelative(
                    dx1 = 1.104f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 0.896f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                // v 18z
                verticalLineToRelative(dy = 18.0f)
                close()
            }
        }.build().also { _emoji25fd = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji25fd: ImageVector? = null
