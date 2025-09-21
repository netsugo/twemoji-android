package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1f01f1f5: ImageVector
    get() {
        val current = _emoji1f1f01f1f5
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1f01f1f5",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M32 5 H4 C1.791 5 0 6.791 0 9 v18 c0 2.209 1.791 4 4 4 h28 c2.209 0 4 -1.791 4 -4 V9 c0 -2.209 -1.791 -4 -4 -4z
            path(
                fill = SolidColor(Color(0xFF024FA2)),
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
            // M0 9 h36 v1 L0 10z M0 26 h36 v1 L0 27z
            path(
                fill = SolidColor(Color(0xFFEEEEEE)),
            ) {
                // M 0 9
                moveTo(x = 0.0f, y = 9.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // L 0 10z
                lineTo(x = 0.0f, y = 10.0f)
                close()
                // M 0 26
                moveTo(x = 0.0f, y = 26.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // L 0 27z
                lineTo(x = 0.0f, y = 27.0f)
                close()
            }
            // M0 10 h36 v16 H0z
            path(
                fill = SolidColor(Color(0xFFED1C27)),
            ) {
                // M 0 10
                moveTo(x = 0.0f, y = 10.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // v 16
                verticalLineToRelative(dy = 16.0f)
                // H 0z
                horizontalLineTo(x = 0.0f)
                close()
            }
            // M13.278 23.778 c3.191 0 5.778 -2.587 5.778 -5.778 s-2.587 -5.778 -5.778 -5.778 S7.5 14.809 7.5 18 s2.587 5.778 5.778 5.778z M12.021 16.27 l1.257 -3.868 1.257 3.868 h4.067 l-3.29 2.39 1.257 3.868 -3.29 -2.39 -3.29 2.39 1.257 -3.868 -3.29 -2.39 h4.065z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 13.278 23.778
                moveTo(x = 13.278f, y = 23.778f)
                // c 3.191 0 5.778 -2.587 5.778 -5.778
                curveToRelative(
                    dx1 = 3.191f,
                    dy1 = 0.0f,
                    dx2 = 5.778f,
                    dy2 = -2.587f,
                    dx3 = 5.778f,
                    dy3 = -5.778f,
                )
                // s -2.587 -5.778 -5.778 -5.778
                reflectiveCurveToRelative(
                    dx1 = -2.587f,
                    dy1 = -5.778f,
                    dx2 = -5.778f,
                    dy2 = -5.778f,
                )
                // S 7.5 14.809 7.5 18
                reflectiveCurveTo(
                    x1 = 7.5f,
                    y1 = 14.809f,
                    x2 = 7.5f,
                    y2 = 18.0f,
                )
                // s 2.587 5.778 5.778 5.778z
                reflectiveCurveToRelative(
                    dx1 = 2.587f,
                    dy1 = 5.778f,
                    dx2 = 5.778f,
                    dy2 = 5.778f,
                )
                close()
                // M 12.021 16.27
                moveTo(x = 12.021f, y = 16.27f)
                // l 1.257 -3.868
                lineToRelative(dx = 1.257f, dy = -3.868f)
                // l 1.257 3.868
                lineToRelative(dx = 1.257f, dy = 3.868f)
                // h 4.067
                horizontalLineToRelative(dx = 4.067f)
                // l -3.29 2.39
                lineToRelative(dx = -3.29f, dy = 2.39f)
                // l 1.257 3.868
                lineToRelative(dx = 1.257f, dy = 3.868f)
                // l -3.29 -2.39
                lineToRelative(dx = -3.29f, dy = -2.39f)
                // l -3.29 2.39
                lineToRelative(dx = -3.29f, dy = 2.39f)
                // l 1.257 -3.868
                lineToRelative(dx = 1.257f, dy = -3.868f)
                // l -3.29 -2.39
                lineToRelative(dx = -3.29f, dy = -2.39f)
                // h 4.065z
                horizontalLineToRelative(dx = 4.065f)
                close()
            }
        }.build().also { _emoji1f1f01f1f5 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1f01f1f5: ImageVector? = null
