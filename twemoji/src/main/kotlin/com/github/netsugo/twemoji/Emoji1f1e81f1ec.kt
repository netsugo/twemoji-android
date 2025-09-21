package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1e81f1ec: ImageVector
    get() {
        val current = _emoji1f1e81f1ec
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1e81f1ec",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M4 5 C1.791 5 0 6.791 0 9 v18 c0 1.104 0.448 2.104 1.172 2.828 L26 5 H4z
            path(
                fill = SolidColor(Color(0xFF009543)),
            ) {
                // M 4 5
                moveTo(x = 4.0f, y = 5.0f)
                // C 1.791 5 0 6.791 0 9
                curveTo(
                    x1 = 1.791f,
                    y1 = 5.0f,
                    x2 = 0.0f,
                    y2 = 6.791f,
                    x3 = 0.0f,
                    y3 = 9.0f,
                )
                // v 18
                verticalLineToRelative(dy = 18.0f)
                // c 0 1.104 0.448 2.104 1.172 2.828
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = 0.448f,
                    dy2 = 2.104f,
                    dx3 = 1.172f,
                    dy3 = 2.828f,
                )
                // L 26 5
                lineTo(x = 26.0f, y = 5.0f)
                // H 4z
                horizontalLineTo(x = 4.0f)
                close()
            }
            // M32 5 h-6 L1.172 29.828 C1.896 30.552 2.896 31 4 31 h6 L34.828 6.172 C34.104 5.448 33.104 5 32 5z
            path(
                fill = SolidColor(Color(0xFFFBDE4A)),
            ) {
                // M 32 5
                moveTo(x = 32.0f, y = 5.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // L 1.172 29.828
                lineTo(x = 1.172f, y = 29.828f)
                // C 1.896 30.552 2.896 31 4 31
                curveTo(
                    x1 = 1.896f,
                    y1 = 30.552f,
                    x2 = 2.896f,
                    y2 = 31.0f,
                    x3 = 4.0f,
                    y3 = 31.0f,
                )
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // L 34.828 6.172
                lineTo(x = 34.828f, y = 6.172f)
                // C 34.104 5.448 33.104 5 32 5z
                curveTo(
                    x1 = 34.104f,
                    y1 = 5.448f,
                    x2 = 33.104f,
                    y2 = 5.0f,
                    x3 = 32.0f,
                    y3 = 5.0f,
                )
                close()
            }
            // M10 31 h22 c2.209 0 4 -1.791 4 -4 V9 c0 -1.104 -0.448 -2.104 -1.172 -2.828 L10 31z
            path(
                fill = SolidColor(Color(0xFFDC241F)),
            ) {
                // M 10 31
                moveTo(x = 10.0f, y = 31.0f)
                // h 22
                horizontalLineToRelative(dx = 22.0f)
                // c 2.209 0 4 -1.791 4 -4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = -1.791f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // V 9
                verticalLineTo(y = 9.0f)
                // c 0 -1.104 -0.448 -2.104 -1.172 -2.828
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.104f,
                    dx2 = -0.448f,
                    dy2 = -2.104f,
                    dx3 = -1.172f,
                    dy3 = -2.828f,
                )
                // L 10 31z
                lineTo(x = 10.0f, y = 31.0f)
                close()
            }
        }.build().also { _emoji1f1e81f1ec = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1e81f1ec: ImageVector? = null
