package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f3b9: ImageVector
    get() {
        val current = _emoji1f3b9
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f3b9",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M2 36 s-2 0 -2 -2 V2 s0 -2 2 -2 h32.031 C36 0 36 2 36 2 v32 s0 2 -2 2 H2z
            path(
                fill = SolidColor(Color(0xFF31373D)),
            ) {
                // M 2 36
                moveTo(x = 2.0f, y = 36.0f)
                // s -2 0 -2 -2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -2.0f,
                )
                // V 2
                verticalLineTo(y = 2.0f)
                // s 0 -2 2 -2
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // h 32.031
                horizontalLineToRelative(dx = 32.031f)
                // C 36 0 36 2 36 2
                curveTo(
                    x1 = 36.0f,
                    y1 = 0.0f,
                    x2 = 36.0f,
                    y2 = 2.0f,
                    x3 = 36.0f,
                    y3 = 2.0f,
                )
                // v 32
                verticalLineToRelative(dy = 32.0f)
                // s 0 2 -2 2
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                    dx2 = -2.0f,
                    dy2 = 2.0f,
                )
                // H 2z
                horizontalLineTo(x = 2.0f)
                close()
            }
            // M19 33 s0 1 1 1 h5 c1 0 1 -1 1 -1 L26 5 h-7 v28z M28 5 v28 s0 1 1 1 h4 c1 0 1 -1 1 -1 L34 5 h-6z M10 33 s0 1 1 1 h5 c1 0 1 -1 1 -1 L17 5 h-7 v28z M2 33 s0 1 1 1 h4 c1 0 1 -1 1 -1 L8 5 L2 5 v28z
            path(
                fill = SolidColor(Color(0xFFE1E8ED)),
            ) {
                // M 19 33
                moveTo(x = 19.0f, y = 33.0f)
                // s 0 1 1 1
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.0f,
                    dx2 = 1.0f,
                    dy2 = 1.0f,
                )
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // c 1 0 1 -1 1 -1
                curveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // L 26 5
                lineTo(x = 26.0f, y = 5.0f)
                // h -7
                horizontalLineToRelative(dx = -7.0f)
                // v 28z
                verticalLineToRelative(dy = 28.0f)
                close()
                // M 28 5
                moveTo(x = 28.0f, y = 5.0f)
                // v 28
                verticalLineToRelative(dy = 28.0f)
                // s 0 1 1 1
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.0f,
                    dx2 = 1.0f,
                    dy2 = 1.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // c 1 0 1 -1 1 -1
                curveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // L 34 5
                lineTo(x = 34.0f, y = 5.0f)
                // h -6z
                horizontalLineToRelative(dx = -6.0f)
                close()
                // M 10 33
                moveTo(x = 10.0f, y = 33.0f)
                // s 0 1 1 1
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.0f,
                    dx2 = 1.0f,
                    dy2 = 1.0f,
                )
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // c 1 0 1 -1 1 -1
                curveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // L 17 5
                lineTo(x = 17.0f, y = 5.0f)
                // h -7
                horizontalLineToRelative(dx = -7.0f)
                // v 28z
                verticalLineToRelative(dy = 28.0f)
                close()
                // M 2 33
                moveTo(x = 2.0f, y = 33.0f)
                // s 0 1 1 1
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.0f,
                    dx2 = 1.0f,
                    dy2 = 1.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // c 1 0 1 -1 1 -1
                curveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // L 8 5
                lineTo(x = 8.0f, y = 5.0f)
                // L 2 5
                lineTo(x = 2.0f, y = 5.0f)
                // v 28z
                verticalLineToRelative(dy = 28.0f)
                close()
            }
            // M30 23 s0 1 -1 1 h-4 c-1 0 -1 -1 -1 -1 L24 3 h6 v20z M21 23 s0 1 -1 1 h-4 c-1 0 -1 -1 -1 -1 L15 3 h6 v20z M12 23 s0 1 -1 1 L7 24 c-1 0 -1 -1 -1 -1 L6 3 h6 v20z
            path(
                fill = SolidColor(Color(0xFF31373D)),
            ) {
                // M 30 23
                moveTo(x = 30.0f, y = 23.0f)
                // s 0 1 -1 1
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.0f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // c -1 0 -1 -1 -1 -1
                curveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // L 24 3
                lineTo(x = 24.0f, y = 3.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 20z
                verticalLineToRelative(dy = 20.0f)
                close()
                // M 21 23
                moveTo(x = 21.0f, y = 23.0f)
                // s 0 1 -1 1
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.0f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // c -1 0 -1 -1 -1 -1
                curveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // L 15 3
                lineTo(x = 15.0f, y = 3.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 20z
                verticalLineToRelative(dy = 20.0f)
                close()
                // M 12 23
                moveTo(x = 12.0f, y = 23.0f)
                // s 0 1 -1 1
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.0f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                // L 7 24
                lineTo(x = 7.0f, y = 24.0f)
                // c -1 0 -1 -1 -1 -1
                curveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // L 6 3
                lineTo(x = 6.0f, y = 3.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 20z
                verticalLineToRelative(dy = 20.0f)
                close()
            }
        }.build().also { _emoji1f3b9 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f3b9: ImageVector? = null
