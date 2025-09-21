package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f512: ImageVector
    get() {
        val current = _emoji1f512
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f512",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M18 0 C12.477 0 8 4.477 8 10 v10 h4 V10 a6 6 0 0 1 12 0 v10 h4 V10 c0 -5.523 -4.477 -10 -10 -10Z
            path(
                fill = SolidColor(Color(0xFFAAB8C2)),
            ) {
                // M 18 0
                moveTo(x = 18.0f, y = 0.0f)
                // C 12.477 0 8 4.477 8 10
                curveTo(
                    x1 = 12.477f,
                    y1 = 0.0f,
                    x2 = 8.0f,
                    y2 = 4.477f,
                    x3 = 8.0f,
                    y3 = 10.0f,
                )
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // V 10
                verticalLineTo(y = 10.0f)
                // a 6 6 0 0 1 12 0
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 12.0f,
                    dy1 = 0.0f,
                )
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // V 10
                verticalLineTo(y = 10.0f)
                // c 0 -5.523 -4.477 -10 -10 -10z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -5.523f,
                    dx2 = -4.477f,
                    dy2 = -10.0f,
                    dx3 = -10.0f,
                    dy3 = -10.0f,
                )
                close()
            }
            // M32 32 a4 4 0 0 1 -4 4 H8 a4 4 0 0 1 -4 -4 V18 a4 4 0 0 1 4 -4 h20 a4 4 0 0 1 4 4 v14Z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 32 32
                moveTo(x = 32.0f, y = 32.0f)
                // a 4 4 0 0 1 -4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 4.0f,
                )
                // H 8
                horizontalLineTo(x = 8.0f)
                // a 4 4 0 0 1 -4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = -4.0f,
                )
                // V 18
                verticalLineTo(y = 18.0f)
                // a 4 4 0 0 1 4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = -4.0f,
                )
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // a 4 4 0 0 1 4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 4.0f,
                )
                // v 14z
                verticalLineToRelative(dy = 14.0f)
                close()
            }
        }.build().also { _emoji1f512 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f512: ImageVector? = null
