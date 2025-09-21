package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1f51f1f8: ImageVector
    get() {
        val current = _emoji1f1f51f1f8
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1f51f1f8",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M32 5 H4 C1.791 5 0 6.791 0 9 v4.5 h36 V9 c0 -2.209 -1.791 -4 -4 -4z
            path(
                fill = SolidColor(Color(0xFF141414)),
            ) {
                // M 32 5
                moveTo(x = 32.0f, y = 5.0f)
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
                // v 4.5
                verticalLineToRelative(dy = 4.5f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
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
            // M0 27 c0 2.209 1.791 4 4 4 h28 c2.209 0 4 -1.791 4 -4 v-4.5 H0 V27z
            path(
                fill = SolidColor(Color(0xFF007229)),
            ) {
                // M 0 27
                moveTo(x = 0.0f, y = 27.0f)
                // c 0 2.209 1.791 4 4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = 1.791f,
                    dy2 = 4.0f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
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
                // H 0
                horizontalLineTo(x = 0.0f)
                // V 27z
                verticalLineTo(y = 27.0f)
                close()
            }
            // M0 13.5 h36 v9 H0z
            path(
                fill = SolidColor(Color(0xFFEEEEEE)),
            ) {
                // M 0 13.5
                moveTo(x = 0.0f, y = 13.5f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // v 9
                verticalLineToRelative(dy = 9.0f)
                // H 0z
                horizontalLineTo(x = 0.0f)
                close()
            }
            // M1.351 6.004 H1.35 C0.522 6.737 0 7.808 0 9 v18 c0 1.193 0.522 2.264 1.351 2.997 L17.5 18 1.351 6.004z
            path(
                fill = SolidColor(Color(0xFFD21034)),
            ) {
                // M 1.351 6.004
                moveTo(x = 1.351f, y = 6.004f)
                // H 1.35
                horizontalLineTo(x = 1.35f)
                // C 0.522 6.737 0 7.808 0 9
                curveTo(
                    x1 = 0.522f,
                    y1 = 6.737f,
                    x2 = 0.0f,
                    y2 = 7.808f,
                    x3 = 0.0f,
                    y3 = 9.0f,
                )
                // v 18
                verticalLineToRelative(dy = 18.0f)
                // c 0 1.193 0.522 2.264 1.351 2.997
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.193f,
                    dx2 = 0.522f,
                    dy2 = 2.264f,
                    dx3 = 1.351f,
                    dy3 = 2.997f,
                )
                // L 17.5 18
                lineTo(x = 17.5f, y = 18.0f)
                // L 1.351 6.004z
                lineTo(x = 1.351f, y = 6.004f)
                close()
            }
        }.build().also { _emoji1f1f51f1f8 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1f51f1f8: ImageVector? = null
