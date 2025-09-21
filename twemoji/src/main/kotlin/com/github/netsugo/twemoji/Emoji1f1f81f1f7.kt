package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1f81f1f7: ImageVector
    get() {
        val current = _emoji1f1f81f1f7
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1f81f1f7",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M0 27 c0 2.209 1.791 4 4 4 h28 c2.209 0 4 -1.791 4 -4 v-1 H0 v1z
            path(
                fill = SolidColor(Color(0xFF377E3F)),
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
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // H 0
                horizontalLineTo(x = 0.0f)
                // v 1z
                verticalLineToRelative(dy = 1.0f)
                close()
            }
            // M0 23 h36 v3 H0z
            path(
                fill = SolidColor(Color(0xFFEEEEEE)),
            ) {
                // M 0 23
                moveTo(x = 0.0f, y = 23.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // H 0z
                horizontalLineTo(x = 0.0f)
                close()
            }
            // M32 5 H4 C1.791 5 0 6.791 0 9 v1 h36 V9 c0 -2.209 -1.791 -4 -4 -4z
            path(
                fill = SolidColor(Color(0xFF377E3F)),
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
                // v 1
                verticalLineToRelative(dy = 1.0f)
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
            // M0 10 h36 v3 H0z
            path(
                fill = SolidColor(Color(0xFFEEEEEE)),
            ) {
                // M 0 10
                moveTo(x = 0.0f, y = 10.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // H 0z
                horizontalLineTo(x = 0.0f)
                close()
            }
            // M0 23 h36 L36 13 L0 13 v10z M16.833 16.89 L18 13.297 l1.167 3.593 h3.778 l-3.057 2.221 1.167 3.593 L18 20.483 l-3.056 2.221 1.167 -3.593 -3.057 -2.221 h3.779z
            path(
                fill = SolidColor(Color(0xFFB40A2D)),
            ) {
                // M 0 23
                moveTo(x = 0.0f, y = 23.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // L 36 13
                lineTo(x = 36.0f, y = 13.0f)
                // L 0 13
                lineTo(x = 0.0f, y = 13.0f)
                // v 10z
                verticalLineToRelative(dy = 10.0f)
                close()
                // M 16.833 16.89
                moveTo(x = 16.833f, y = 16.89f)
                // L 18 13.297
                lineTo(x = 18.0f, y = 13.297f)
                // l 1.167 3.593
                lineToRelative(dx = 1.167f, dy = 3.593f)
                // h 3.778
                horizontalLineToRelative(dx = 3.778f)
                // l -3.057 2.221
                lineToRelative(dx = -3.057f, dy = 2.221f)
                // l 1.167 3.593
                lineToRelative(dx = 1.167f, dy = 3.593f)
                // L 18 20.483
                lineTo(x = 18.0f, y = 20.483f)
                // l -3.056 2.221
                lineToRelative(dx = -3.056f, dy = 2.221f)
                // l 1.167 -3.593
                lineToRelative(dx = 1.167f, dy = -3.593f)
                // l -3.057 -2.221
                lineToRelative(dx = -3.057f, dy = -2.221f)
                // h 3.779z
                horizontalLineToRelative(dx = 3.779f)
                close()
            }
            // M14.944 22.703 L18 20.483 l3.056 2.22 -1.167 -3.593 3.056 -2.22 h-3.778 L18 13.297 l-1.167 3.593 h-3.778 l3.056 2.22z
            path(
                fill = SolidColor(Color(0xFFECC81D)),
            ) {
                // M 14.944 22.703
                moveTo(x = 14.944f, y = 22.703f)
                // L 18 20.483
                lineTo(x = 18.0f, y = 20.483f)
                // l 3.056 2.22
                lineToRelative(dx = 3.056f, dy = 2.22f)
                // l -1.167 -3.593
                lineToRelative(dx = -1.167f, dy = -3.593f)
                // l 3.056 -2.22
                lineToRelative(dx = 3.056f, dy = -2.22f)
                // h -3.778
                horizontalLineToRelative(dx = -3.778f)
                // L 18 13.297
                lineTo(x = 18.0f, y = 13.297f)
                // l -1.167 3.593
                lineToRelative(dx = -1.167f, dy = 3.593f)
                // h -3.778
                horizontalLineToRelative(dx = -3.778f)
                // l 3.056 2.22z
                lineToRelative(dx = 3.056f, dy = 2.22f)
                close()
            }
        }.build().also { _emoji1f1f81f1f7 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1f81f1f7: ImageVector? = null
