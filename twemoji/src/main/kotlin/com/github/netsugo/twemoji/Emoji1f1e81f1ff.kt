package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1e81f1ff: ImageVector
    get() {
        val current = _emoji1f1e81f1ff
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1e81f1ff",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M1.383 29.973 C2.084 30.628 2.998 31 4 31 h28 c2.209 0 4 -1.791 4 -4.5 V18 H17.5 L1.383 29.973z
            path(
                fill = SolidColor(Color(0xFFD7141A)),
            ) {
                // M 1.383 29.973
                moveTo(x = 1.383f, y = 29.973f)
                // C 2.084 30.628 2.998 31 4 31
                curveTo(
                    x1 = 2.084f,
                    y1 = 30.628f,
                    x2 = 2.998f,
                    y2 = 31.0f,
                    x3 = 4.0f,
                    y3 = 31.0f,
                )
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // c 2.209 0 4 -1.791 4 -4.5
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = -1.791f,
                    dx3 = 4.0f,
                    dy3 = -4.5f,
                )
                // V 18
                verticalLineTo(y = 18.0f)
                // H 17.5
                horizontalLineTo(x = 17.5f)
                // L 1.383 29.973z
                lineTo(x = 1.383f, y = 29.973f)
                close()
            }
            // M32 5 H4 c-1.016 0 -1.94 0.382 -2.646 1.006 L17.5 18 H36 V9 c0 -2.209 -1.791 -4 -4 -4z
            path(
                fill = SolidColor(Color(0xFFEEEEEE)),
            ) {
                // M 32 5
                moveTo(x = 32.0f, y = 5.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // c -1.016 0 -1.94 0.382 -2.646 1.006
                curveToRelative(
                    dx1 = -1.016f,
                    dy1 = 0.0f,
                    dx2 = -1.94f,
                    dy2 = 0.382f,
                    dx3 = -2.646f,
                    dy3 = 1.006f,
                )
                // L 17.5 18
                lineTo(x = 17.5f, y = 18.0f)
                // H 36
                horizontalLineTo(x = 36.0f)
                // V 9
                verticalLineTo(y = 9.0f)
                // c 0 -2.209 -1.791 -4 -4 -4z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.209f,
                    dx2 = -1.791f,
                    dy2 = -4.0f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                close()
            }
            // M1.383 29.973 L17.5 18 1.354 6.006 C0.525 6.739 0 7.807 0 9 v17.5 c0 1.48 0.537 2.683 1.383 3.473z
            path(
                fill = SolidColor(Color(0xFF11457E)),
            ) {
                // M 1.383 29.973
                moveTo(x = 1.383f, y = 29.973f)
                // L 17.5 18
                lineTo(x = 17.5f, y = 18.0f)
                // L 1.354 6.006
                lineTo(x = 1.354f, y = 6.006f)
                // C 0.525 6.739 0 7.807 0 9
                curveTo(
                    x1 = 0.525f,
                    y1 = 6.739f,
                    x2 = 0.0f,
                    y2 = 7.807f,
                    x3 = 0.0f,
                    y3 = 9.0f,
                )
                // v 17.5
                verticalLineToRelative(dy = 17.5f)
                // c 0 1.48 0.537 2.683 1.383 3.473z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.48f,
                    dx2 = 0.537f,
                    dy2 = 2.683f,
                    dx3 = 1.383f,
                    dy3 = 3.473f,
                )
                close()
            }
        }.build().also { _emoji1f1e81f1ff = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1e81f1ff: ImageVector? = null
