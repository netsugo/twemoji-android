package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f3b4: ImageVector
    get() {
        val current = _emoji1f3b4
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f3b4",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M32 28 H4 V4 c0 -2.209 1.791 -4 4 -4 h20 c2.209 0 4 1.791 4 4 v24z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 32 28
                moveTo(x = 32.0f, y = 28.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // c 0 -2.209 1.791 -4 4 -4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.209f,
                    dx2 = 1.791f,
                    dy2 = -4.0f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // c 2.209 0 4 1.791 4 4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = 1.791f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // v 24z
                verticalLineToRelative(dy = 24.0f)
                close()
            }
            // M8 36 h20 c2.209 0 4 -1.791 4 -4 v-4 c-4.117 -2.744 -21.139 -8.233 -28 0 v4 c0 2.209 1.791 4 4 4z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 8 36
                moveTo(x = 8.0f, y = 36.0f)
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // c 2.209 0 4 -1.791 4 -4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = -1.791f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // c -4.117 -2.744 -21.139 -8.233 -28 0
                curveToRelative(
                    dx1 = -4.117f,
                    dy1 = -2.744f,
                    dx2 = -21.139f,
                    dy2 = -8.233f,
                    dx3 = -28.0f,
                    dy3 = 0.0f,
                )
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // c 0 2.209 1.791 4 4 4z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = 1.791f,
                    dy2 = 4.0f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                close()
            }
            // M15.276 12.495 m-7.578 0 a7.578 7.578 0 1 1 15.156 0 a7.578 7.578 0 1 1 -15.156 0
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 15.276 12.495
                moveTo(x = 15.276f, y = 12.495f)
                // m -7.578 0
                moveToRelative(dx = -7.578f, dy = 0.0f)
                // a 7.578 7.578 0 1 1 15.156 0
                arcToRelative(
                    a = 7.578f,
                    b = 7.578f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 15.156f,
                    dy1 = 0.0f,
                )
                // a 7.578 7.578 0 1 1 -15.156 0
                arcToRelative(
                    a = 7.578f,
                    b = 7.578f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -15.156f,
                    dy1 = 0.0f,
                )
            }
        }.build().also { _emoji1f3b4 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f3b4: ImageVector? = null
