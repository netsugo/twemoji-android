package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f7f0: ImageVector
    get() {
        val current = _emoji1f7f0
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f7f0",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M34 12 a3 3 0 0 1 -3 3 L5 15 a3 3 0 1 1 0 -6 h26 a3 3 0 0 1 3 3z M34 24 a3 3 0 0 1 -3 3 L5 27 a3 3 0 1 1 0 -6 h26 a3 3 0 0 1 3 3z
            path(
                fill = SolidColor(Color(0xFF31373D)),
            ) {
                // M 34 12
                moveTo(x = 34.0f, y = 12.0f)
                // a 3 3 0 0 1 -3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = 3.0f,
                )
                // L 5 15
                lineTo(x = 5.0f, y = 15.0f)
                // a 3 3 0 1 1 0 -6
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -6.0f,
                )
                // h 26
                horizontalLineToRelative(dx = 26.0f)
                // a 3 3 0 0 1 3 3z
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = 3.0f,
                )
                close()
                // M 34 24
                moveTo(x = 34.0f, y = 24.0f)
                // a 3 3 0 0 1 -3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = 3.0f,
                )
                // L 5 27
                lineTo(x = 5.0f, y = 27.0f)
                // a 3 3 0 1 1 0 -6
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -6.0f,
                )
                // h 26
                horizontalLineToRelative(dx = 26.0f)
                // a 3 3 0 0 1 3 3z
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = 3.0f,
                )
                close()
            }
        }.build().also { _emoji1f7f0 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f7f0: ImageVector? = null
