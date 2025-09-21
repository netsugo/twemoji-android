package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1ec1f1f2: ImageVector
    get() {
        val current = _emoji1f1ec1f1f2
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1ec1f1f2",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M32 5 H4 C1.791 5 0 6.791 0 9 v4 h36 V9 c0 -2.209 -1.791 -4 -4 -4z
            path(
                fill = SolidColor(Color(0xFFCC162B)),
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
                // v 4
                verticalLineToRelative(dy = 4.0f)
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
            // M0 27 c0 2.209 1.791 4 4 4 h28 c2.209 0 4 -1.791 4 -4 v-4 H0 v4z
            path(
                fill = SolidColor(Color(0xFF3C762C)),
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
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // H 0
                horizontalLineTo(x = 0.0f)
                // v 4z
                verticalLineToRelative(dy = 4.0f)
                close()
            }
            // M0 21 h36 v2 L0 23z M0 13 h36 v2 L0 15z
            path(
                fill = SolidColor(Color(0xFFEEEEEE)),
            ) {
                // M 0 21
                moveTo(x = 0.0f, y = 21.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // L 0 23z
                lineTo(x = 0.0f, y = 23.0f)
                close()
                // M 0 13
                moveTo(x = 0.0f, y = 13.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // L 0 15z
                lineTo(x = 0.0f, y = 15.0f)
                close()
            }
            // M0 15 h36 v6 H0z
            path(
                fill = SolidColor(Color(0xFF0D218A)),
            ) {
                // M 0 15
                moveTo(x = 0.0f, y = 15.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // H 0z
                horizontalLineTo(x = 0.0f)
                close()
            }
        }.build().also { _emoji1f1ec1f1f2 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1ec1f1f2: ImageVector? = null
