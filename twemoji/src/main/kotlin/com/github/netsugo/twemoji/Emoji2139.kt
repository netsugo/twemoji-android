package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji2139: ImageVector
    get() {
        val current = _emoji2139
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji2139",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M0 4 c0 -2.209 1.791 -4 4 -4 h28 c2.209 0 4 1.791 4 4 v28 c0 2.209 -1.791 4 -4 4 H4 c-2.209 0 -4 -1.791 -4 -4 V4z
            path(
                fill = SolidColor(Color(0xFF3B88C3)),
            ) {
                // M 0 4
                moveTo(x = 0.0f, y = 4.0f)
                // c 0 -2.209 1.791 -4 4 -4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.209f,
                    dx2 = 1.791f,
                    dy2 = -4.0f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // c 2.209 0 4 1.791 4 4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = 1.791f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // v 28
                verticalLineToRelative(dy = 28.0f)
                // c 0 2.209 -1.791 4 -4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = -1.791f,
                    dy2 = 4.0f,
                    dx3 = -4.0f,
                    dy3 = 4.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // c -2.209 0 -4 -1.791 -4 -4
                curveToRelative(
                    dx1 = -2.209f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = -1.791f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                // V 4z
                verticalLineTo(y = 4.0f)
                close()
            }
            // M20.512 8.071 c0 1.395 -1.115 2.573 -2.511 2.573 -1.333 0 -2.511 -1.209 -2.511 -2.573 0 -1.271 1.178 -2.45 2.511 -2.45 1.333 0.001 2.511 1.148 2.511 2.45z M15.768 14.799 c0 -1.488 0.931 -2.481 2.232 -2.481 1.302 0 2.232 0.992 2.232 2.481 v11.906 c0 1.488 -0.93 2.48 -2.232 2.48 s-2.232 -0.992 -2.232 -2.48 L15.768 14.799z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 20.512 8.071
                moveTo(x = 20.512f, y = 8.071f)
                // c 0 1.395 -1.115 2.573 -2.511 2.573
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.395f,
                    dx2 = -1.115f,
                    dy2 = 2.573f,
                    dx3 = -2.511f,
                    dy3 = 2.573f,
                )
                // c -1.333 0 -2.511 -1.209 -2.511 -2.573
                curveToRelative(
                    dx1 = -1.333f,
                    dy1 = 0.0f,
                    dx2 = -2.511f,
                    dy2 = -1.209f,
                    dx3 = -2.511f,
                    dy3 = -2.573f,
                )
                // c 0 -1.271 1.178 -2.45 2.511 -2.45
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.271f,
                    dx2 = 1.178f,
                    dy2 = -2.45f,
                    dx3 = 2.511f,
                    dy3 = -2.45f,
                )
                // c 1.333 0.001 2.511 1.148 2.511 2.45z
                curveToRelative(
                    dx1 = 1.333f,
                    dy1 = 0.001f,
                    dx2 = 2.511f,
                    dy2 = 1.148f,
                    dx3 = 2.511f,
                    dy3 = 2.45f,
                )
                close()
                // M 15.768 14.799
                moveTo(x = 15.768f, y = 14.799f)
                // c 0 -1.488 0.931 -2.481 2.232 -2.481
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.488f,
                    dx2 = 0.931f,
                    dy2 = -2.481f,
                    dx3 = 2.232f,
                    dy3 = -2.481f,
                )
                // c 1.302 0 2.232 0.992 2.232 2.481
                curveToRelative(
                    dx1 = 1.302f,
                    dy1 = 0.0f,
                    dx2 = 2.232f,
                    dy2 = 0.992f,
                    dx3 = 2.232f,
                    dy3 = 2.481f,
                )
                // v 11.906
                verticalLineToRelative(dy = 11.906f)
                // c 0 1.488 -0.93 2.48 -2.232 2.48
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.488f,
                    dx2 = -0.93f,
                    dy2 = 2.48f,
                    dx3 = -2.232f,
                    dy3 = 2.48f,
                )
                // s -2.232 -0.992 -2.232 -2.48
                reflectiveCurveToRelative(
                    dx1 = -2.232f,
                    dy1 = -0.992f,
                    dx2 = -2.232f,
                    dy2 = -2.48f,
                )
                // L 15.768 14.799z
                lineTo(x = 15.768f, y = 14.799f)
                close()
            }
        }.build().also { _emoji2139 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji2139: ImageVector? = null
