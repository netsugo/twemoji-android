package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f4f6: ImageVector
    get() {
        val current = _emoji1f4f6
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f4f6",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M0 4 c0 -4 4 -4 4 -4 h28 s4 0 4 4 v28 s0 4 -4 4 H4 s-4 0 -4 -4 V4z
            path(
                fill = SolidColor(Color(0xFF3B88C3)),
            ) {
                // M 0 4
                moveTo(x = 0.0f, y = 4.0f)
                // c 0 -4 4 -4 4 -4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.0f,
                    dx2 = 4.0f,
                    dy2 = -4.0f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // s 4 0 4 4
                reflectiveCurveToRelative(
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = 4.0f,
                )
                // v 28
                verticalLineToRelative(dy = 28.0f)
                // s 0 4 -4 4
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.0f,
                    dx2 = -4.0f,
                    dy2 = 4.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // s -4 0 -4 -4
                reflectiveCurveToRelative(
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = -4.0f,
                )
                // V 4z
                verticalLineTo(y = 4.0f)
                close()
            }
            // M28 8 h4 v20 h-4z M22 12 h4 v16 h-4z M16 16 h4 v12 h-4z M10 20 h4 v8 h-4z M4 24 h4 v4 L4 28z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 28 8
                moveTo(x = 28.0f, y = 8.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 20
                verticalLineToRelative(dy = 20.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
                // M 22 12
                moveTo(x = 22.0f, y = 12.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 16
                verticalLineToRelative(dy = 16.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
                // M 16 16
                moveTo(x = 16.0f, y = 16.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
                // M 10 20
                moveTo(x = 10.0f, y = 20.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
                // M 4 24
                moveTo(x = 4.0f, y = 24.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // L 4 28z
                lineTo(x = 4.0f, y = 28.0f)
                close()
            }
        }.build().also { _emoji1f4f6 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f4f6: ImageVector? = null
