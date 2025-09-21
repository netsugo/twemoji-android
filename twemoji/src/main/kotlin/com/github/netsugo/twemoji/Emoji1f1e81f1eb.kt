package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1e81f1eb: ImageVector
    get() {
        val current = _emoji1f1e81f1eb
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1e81f1eb",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M32 5 H4 C1.791 5 0 6.791 0 9 v2.5 h36 V9 c0 -2.209 -1.791 -4 -4 -4z
            path(
                fill = SolidColor(Color(0xFF003082)),
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
                // v 2.5
                verticalLineToRelative(dy = 2.5f)
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
            // M0 11.5 h36 V18 H0z
            path(
                fill = SolidColor(Color(0xFFEEEEEE)),
            ) {
                // M 0 11.5
                moveTo(x = 0.0f, y = 11.5f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // V 18
                verticalLineTo(y = 18.0f)
                // H 0z
                horizontalLineTo(x = 0.0f)
                close()
            }
            // M0 18 h36 v6.5 H0z
            path(
                fill = SolidColor(Color(0xFF289728)),
            ) {
                // M 0 18
                moveTo(x = 0.0f, y = 18.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // v 6.5
                verticalLineToRelative(dy = 6.5f)
                // H 0z
                horizontalLineTo(x = 0.0f)
                close()
            }
            // M0 24.5 V27 c0 2.209 1.791 4 4 4 h28 c2.209 0 4 -1.791 4 -4 v-2.5 H0z
            path(
                fill = SolidColor(Color(0xFFFFCE00)),
            ) {
                // M 0 24.5
                moveTo(x = 0.0f, y = 24.5f)
                // V 27
                verticalLineTo(y = 27.0f)
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
                // v -2.5
                verticalLineToRelative(dy = -2.5f)
                // H 0z
                horizontalLineTo(x = 0.0f)
                close()
            }
            // M15 5 h6 v26 h-6z
            path(
                fill = SolidColor(Color(0xFFD21034)),
            ) {
                // M 15 5
                moveTo(x = 15.0f, y = 5.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 26
                verticalLineToRelative(dy = 26.0f)
                // h -6z
                horizontalLineToRelative(dx = -6.0f)
                close()
            }
            // M6.878 7.612 l-0.68 -2.094 -0.681 2.094 H3.316 l1.781 1.294 L4.417 11 l1.781 -1.294 L7.979 11 l-0.681 -2.094 L9.08 7.612z
            path(
                fill = SolidColor(Color(0xFFFFCE00)),
            ) {
                // M 6.878 7.612
                moveTo(x = 6.878f, y = 7.612f)
                // l -0.68 -2.094
                lineToRelative(dx = -0.68f, dy = -2.094f)
                // l -0.681 2.094
                lineToRelative(dx = -0.681f, dy = 2.094f)
                // H 3.316
                horizontalLineTo(x = 3.316f)
                // l 1.781 1.294
                lineToRelative(dx = 1.781f, dy = 1.294f)
                // L 4.417 11
                lineTo(x = 4.417f, y = 11.0f)
                // l 1.781 -1.294
                lineToRelative(dx = 1.781f, dy = -1.294f)
                // L 7.979 11
                lineTo(x = 7.979f, y = 11.0f)
                // l -0.681 -2.094
                lineToRelative(dx = -0.681f, dy = -2.094f)
                // L 9.08 7.612z
                lineTo(x = 9.08f, y = 7.612f)
                close()
            }
        }.build().also { _emoji1f1e81f1eb = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1e81f1eb: ImageVector? = null
