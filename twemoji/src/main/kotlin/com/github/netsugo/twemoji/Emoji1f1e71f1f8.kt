package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1e71f1f8: ImageVector
    get() {
        val current = _emoji1f1e71f1f8
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1e71f1f8",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M1.364 29.987 C2.069 30.61 2.985 31 4 31 h28 c2.209 0 4 -1.791 4 -4 v-4.5 H11.442 L1.364 29.987z
            path(
                fill = SolidColor(Color(0xFF00ABC9)),
            ) {
                // M 1.364 29.987
                moveTo(x = 1.364f, y = 29.987f)
                // C 2.069 30.61 2.985 31 4 31
                curveTo(
                    x1 = 2.069f,
                    y1 = 30.61f,
                    x2 = 2.985f,
                    y2 = 31.0f,
                    x3 = 4.0f,
                    y3 = 31.0f,
                )
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // c 2.209 0 4 -1.791 4 -4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = -1.791f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // v -4.5
                verticalLineToRelative(dy = -4.5f)
                // H 11.442
                horizontalLineTo(x = 11.442f)
                // L 1.364 29.987z
                lineTo(x = 1.364f, y = 29.987f)
                close()
            }
            // M17.5 18 l-6.058 4.5 H36 v-9 H11.442z
            path(
                fill = SolidColor(Color(0xFFFAE042)),
            ) {
                // M 17.5 18
                moveTo(x = 17.5f, y = 18.0f)
                // l -6.058 4.5
                lineToRelative(dx = -6.058f, dy = 4.5f)
                // H 36
                horizontalLineTo(x = 36.0f)
                // v -9
                verticalLineToRelative(dy = -9.0f)
                // H 11.442z
                horizontalLineTo(x = 11.442f)
                close()
            }
            // M32 5 H4 c-1.015 0 -1.931 0.39 -2.636 1.013 L11.442 13.5 H36 V9 c0 -2.209 -1.791 -4 -4 -4z
            path(
                fill = SolidColor(Color(0xFF00ABC9)),
            ) {
                // M 32 5
                moveTo(x = 32.0f, y = 5.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // c -1.015 0 -1.931 0.39 -2.636 1.013
                curveToRelative(
                    dx1 = -1.015f,
                    dy1 = 0.0f,
                    dx2 = -1.931f,
                    dy2 = 0.39f,
                    dx3 = -2.636f,
                    dy3 = 1.013f,
                )
                // L 11.442 13.5
                lineTo(x = 11.442f, y = 13.5f)
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
            // M17.5 18 l-6.058 -4.5 L1.364 6.013 C0.534 6.746 0 7.806 0 9 v18 c0 1.194 0.534 2.254 1.364 2.987 L11.442 22.5 17.5 18z
            path(
                fill = SolidColor(Color(0xFF141414)),
            ) {
                // M 17.5 18
                moveTo(x = 17.5f, y = 18.0f)
                // l -6.058 -4.5
                lineToRelative(dx = -6.058f, dy = -4.5f)
                // L 1.364 6.013
                lineTo(x = 1.364f, y = 6.013f)
                // C 0.534 6.746 0 7.806 0 9
                curveTo(
                    x1 = 0.534f,
                    y1 = 6.746f,
                    x2 = 0.0f,
                    y2 = 7.806f,
                    x3 = 0.0f,
                    y3 = 9.0f,
                )
                // v 18
                verticalLineToRelative(dy = 18.0f)
                // c 0 1.194 0.534 2.254 1.364 2.987
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.194f,
                    dx2 = 0.534f,
                    dy2 = 2.254f,
                    dx3 = 1.364f,
                    dy3 = 2.987f,
                )
                // L 11.442 22.5
                lineTo(x = 11.442f, y = 22.5f)
                // L 17.5 18z
                lineTo(x = 17.5f, y = 18.0f)
                close()
            }
        }.build().also { _emoji1f1e71f1f8 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1e71f1f8: ImageVector? = null
