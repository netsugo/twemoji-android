package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1eb1f1ee: ImageVector
    get() {
        val current = _emoji1f1eb1f1ee
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1eb1f1ee",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M32 5 H18 v10 h18 V9 c0 -2.209 -1.791 -4 -4 -4z
            path(
                fill = SolidColor(Color(0xFFEDECEC)),
            ) {
                // M 32 5
                moveTo(x = 32.0f, y = 5.0f)
                // H 18
                horizontalLineTo(x = 18.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // h 18
                horizontalLineToRelative(dx = 18.0f)
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
            // M11 5 H4 C1.791 5 0 6.791 0 9 v6 h11 V5z
            path(
                fill = SolidColor(Color(0xFFEEEEEE)),
            ) {
                // M 11 5
                moveTo(x = 11.0f, y = 5.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // C 1.791 5 0 6.791 0 9
                curveTo(
                    x1 = 1.791f,
                    y1 = 5.0f,
                    x2 = 0.0f,
                    y2 = 6.791f,
                    x3 = 0.0f,
                    y3 = 9.0f,
                )
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h 11
                horizontalLineToRelative(dx = 11.0f)
                // V 5z
                verticalLineTo(y = 5.0f)
                close()
            }
            // M32 31 L18 31 L18 21 h18 v6 c0 2.209 -1.791 4 -4 4z M11 31 L4 31 c-2.209 0 -4 -1.791 -4 -4 v-6 h11 v10z
            path(
                fill = SolidColor(Color(0xFFEDECEC)),
            ) {
                // M 32 31
                moveTo(x = 32.0f, y = 31.0f)
                // L 18 31
                lineTo(x = 18.0f, y = 31.0f)
                // L 18 21
                lineTo(x = 18.0f, y = 21.0f)
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // c 0 2.209 -1.791 4 -4 4z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = -1.791f,
                    dy2 = 4.0f,
                    dx3 = -4.0f,
                    dy3 = 4.0f,
                )
                close()
                // M 11 31
                moveTo(x = 11.0f, y = 31.0f)
                // L 4 31
                lineTo(x = 4.0f, y = 31.0f)
                // c -2.209 0 -4 -1.791 -4 -4
                curveToRelative(
                    dx1 = -2.209f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = -1.791f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // h 11
                horizontalLineToRelative(dx = 11.0f)
                // v 10z
                verticalLineToRelative(dy = 10.0f)
                close()
            }
            // M18 5 h-7 v10 H0 v6 h11 v10 h7 V21 h18 v-6 H18z
            path(
                fill = SolidColor(Color(0xFF003580)),
            ) {
                // M 18 5
                moveTo(x = 18.0f, y = 5.0f)
                // h -7
                horizontalLineToRelative(dx = -7.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // H 0
                horizontalLineTo(x = 0.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h 11
                horizontalLineToRelative(dx = 11.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // V 21
                verticalLineTo(y = 21.0f)
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // H 18z
                horizontalLineTo(x = 18.0f)
                close()
            }
        }.build().also { _emoji1f1eb1f1ee = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1eb1f1ee: ImageVector? = null
