package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f43d: ImageVector
    get() {
        val current = _emoji1f43d
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f43d",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M35 18 c0 6.075 -4.925 11 -11 11 H12 C5.925 29 1 24.075 1 18 S5.925 7 12 7 h12 c6.075 0 11 4.925 11 11z
            path(
                fill = SolidColor(Color(0xFFE6AAAA)),
            ) {
                // M 35 18
                moveTo(x = 35.0f, y = 18.0f)
                // c 0 6.075 -4.925 11 -11 11
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 6.075f,
                    dx2 = -4.925f,
                    dy2 = 11.0f,
                    dx3 = -11.0f,
                    dy3 = 11.0f,
                )
                // H 12
                horizontalLineTo(x = 12.0f)
                // C 5.925 29 1 24.075 1 18
                curveTo(
                    x1 = 5.925f,
                    y1 = 29.0f,
                    x2 = 1.0f,
                    y2 = 24.075f,
                    x3 = 1.0f,
                    y3 = 18.0f,
                )
                // S 5.925 7 12 7
                reflectiveCurveTo(
                    x1 = 5.925f,
                    y1 = 7.0f,
                    x2 = 12.0f,
                    y2 = 7.0f,
                )
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // c 6.075 0 11 4.925 11 11z
                curveToRelative(
                    dx1 = 6.075f,
                    dy1 = 0.0f,
                    dx2 = 11.0f,
                    dy2 = 4.925f,
                    dx3 = 11.0f,
                    dy3 = 11.0f,
                )
                close()
            }
            // M6 18 a4 6 0 1 0 8 0 a4 6 0 1 0 -8 0z
            path(
                fill = SolidColor(Color(0xFF662113)),
            ) {
                // M 6 18
                moveTo(x = 6.0f, y = 18.0f)
                // a 4 6 0 1 0 8 0
                arcToRelative(
                    a = 4.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 8.0f,
                    dy1 = 0.0f,
                )
                // a 4 6 0 1 0 -8 0z
                arcToRelative(
                    a = 4.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -8.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M22 18 a4 6 0 1 0 8 0 a4 6 0 1 0 -8 0z
            path(
                fill = SolidColor(Color(0xFF662113)),
            ) {
                // M 22 18
                moveTo(x = 22.0f, y = 18.0f)
                // a 4 6 0 1 0 8 0
                arcToRelative(
                    a = 4.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 8.0f,
                    dy1 = 0.0f,
                )
                // a 4 6 0 1 0 -8 0z
                arcToRelative(
                    a = 4.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -8.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _emoji1f43d = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f43d: ImageVector? = null
