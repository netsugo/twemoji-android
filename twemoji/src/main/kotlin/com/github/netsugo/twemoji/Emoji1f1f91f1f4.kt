package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1f91f1f4: ImageVector
    get() {
        val current = _emoji1f1f91f1f4
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1f91f1f4",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M32 5 H15 v13 H0 v9 c0 2.209 1.791 4 4 4 h28 c2.209 0 4 -1.791 4 -4 V9 c0 -2.209 -1.791 -4 -4 -4z
            path(
                fill = SolidColor(Color(0xFFC10000)),
            ) {
                // M 32 5
                moveTo(x = 32.0f, y = 5.0f)
                // H 15
                horizontalLineTo(x = 15.0f)
                // v 13
                verticalLineToRelative(dy = 13.0f)
                // H 0
                horizontalLineTo(x = 0.0f)
                // v 9
                verticalLineToRelative(dy = 9.0f)
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
            // M15 5 L4 5 C1.791 5 0 6.791 0 9 v9 h15 L15 5z M12 13 L9 13 v3 L6 16 v-3 L3 13 v-3 h3 L6 7 h3 v3 h3 v3z
            path(
                fill = SolidColor(Color(0xFFEEEDED)),
            ) {
                // M 15 5
                moveTo(x = 15.0f, y = 5.0f)
                // L 4 5
                lineTo(x = 4.0f, y = 5.0f)
                // C 1.791 5 0 6.791 0 9
                curveTo(
                    x1 = 1.791f,
                    y1 = 5.0f,
                    x2 = 0.0f,
                    y2 = 6.791f,
                    x3 = 0.0f,
                    y3 = 9.0f,
                )
                // v 9
                verticalLineToRelative(dy = 9.0f)
                // h 15
                horizontalLineToRelative(dx = 15.0f)
                // L 15 5z
                lineTo(x = 15.0f, y = 5.0f)
                close()
                // M 12 13
                moveTo(x = 12.0f, y = 13.0f)
                // L 9 13
                lineTo(x = 9.0f, y = 13.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // L 6 16
                lineTo(x = 6.0f, y = 16.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // L 3 13
                lineTo(x = 3.0f, y = 13.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // L 6 7
                lineTo(x = 6.0f, y = 7.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 3z
                verticalLineToRelative(dy = 3.0f)
                close()
            }
            // M9 7 H6 v3 H3 v3 h3 v3 h3 v-3 h3 v-3 H9z
            path(
                fill = SolidColor(Color(0xFFC10000)),
            ) {
                // M 9 7
                moveTo(x = 9.0f, y = 7.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // H 9z
                horizontalLineTo(x = 9.0f)
                close()
            }
        }.build().also { _emoji1f1f91f1f4 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1f91f1f4: ImageVector? = null
