package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1f81f1f3: ImageVector
    get() {
        val current = _emoji1f1f81f1f3
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1f81f1f3",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M4 5 C1.791 5 0 6.791 0 9 v18 c0 2.209 1.791 4 4 4 h8 V5 H4z
            path(
                fill = SolidColor(Color(0xFF00853F)),
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
                // c 0 2.209 1.791 4 4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = 1.791f,
                    dy2 = 4.0f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // V 5
                verticalLineTo(y = 5.0f)
                // H 4z
                horizontalLineTo(x = 4.0f)
                close()
            }
            // M12 5 h12 v26 H12z
            path(
                fill = SolidColor(Color(0xFFFDEF42)),
            ) {
                // M 12 5
                moveTo(x = 12.0f, y = 5.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // v 26
                verticalLineToRelative(dy = 26.0f)
                // H 12z
                horizontalLineTo(x = 12.0f)
                close()
            }
            // M32 5 h-8 v26 h8 c2.209 0 4 -1.791 4 -4 V9 c0 -2.209 -1.791 -4 -4 -4z
            path(
                fill = SolidColor(Color(0xFFE31B23)),
            ) {
                // M 32 5
                moveTo(x = 32.0f, y = 5.0f)
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // v 26
                verticalLineToRelative(dy = 26.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
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
            // M18.869 16.674 L18 14 l-0.869 2.674 H14.32 l2.274 1.652 L15.726 21 18 19.348 20.274 21 l-0.868 -2.674 2.274 -1.652z
            path(
                fill = SolidColor(Color(0xFF00853F)),
            ) {
                // M 18.869 16.674
                moveTo(x = 18.869f, y = 16.674f)
                // L 18 14
                lineTo(x = 18.0f, y = 14.0f)
                // l -0.869 2.674
                lineToRelative(dx = -0.869f, dy = 2.674f)
                // H 14.32
                horizontalLineTo(x = 14.32f)
                // l 2.274 1.652
                lineToRelative(dx = 2.274f, dy = 1.652f)
                // L 15.726 21
                lineTo(x = 15.726f, y = 21.0f)
                // L 18 19.348
                lineTo(x = 18.0f, y = 19.348f)
                // L 20.274 21
                lineTo(x = 20.274f, y = 21.0f)
                // l -0.868 -2.674
                lineToRelative(dx = -0.868f, dy = -2.674f)
                // l 2.274 -1.652z
                lineToRelative(dx = 2.274f, dy = -1.652f)
                close()
            }
        }.build().also { _emoji1f1f81f1f3 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1f81f1f3: ImageVector? = null
