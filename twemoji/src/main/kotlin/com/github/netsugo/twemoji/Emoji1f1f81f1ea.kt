package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1f81f1ea: ImageVector
    get() {
        val current = _emoji1f1f81f1ea
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1f81f1ea",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M15.5 31 H32 c2.209 0 4 -1.791 4 -4.5 v-6 H15.5 V31z M32 5 H15.5 v10.5 H36 V9 c0 -2.209 -1.791 -4 -4 -4z M10.5 5 H4 C1.792 5 0.002 6.789 0 8.997 V15.5 h10.5 V5z M0 20.5 v6.004 C0.002 29.211 1.792 31 4 31 h6.5 V20.5 H0z
            path(
                fill = SolidColor(Color(0xFF006AA7)),
            ) {
                // M 15.5 31
                moveTo(x = 15.5f, y = 31.0f)
                // H 32
                horizontalLineTo(x = 32.0f)
                // c 2.209 0 4 -1.791 4 -4.5
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = -1.791f,
                    dx3 = 4.0f,
                    dy3 = -4.5f,
                )
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // H 15.5
                horizontalLineTo(x = 15.5f)
                // V 31z
                verticalLineTo(y = 31.0f)
                close()
                // M 32 5
                moveTo(x = 32.0f, y = 5.0f)
                // H 15.5
                horizontalLineTo(x = 15.5f)
                // v 10.5
                verticalLineToRelative(dy = 10.5f)
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
                // M 10.5 5
                moveTo(x = 10.5f, y = 5.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // C 1.792 5 0.002 6.789 0 8.997
                curveTo(
                    x1 = 1.792f,
                    y1 = 5.0f,
                    x2 = 0.002f,
                    y2 = 6.789f,
                    x3 = 0.0f,
                    y3 = 8.997f,
                )
                // V 15.5
                verticalLineTo(y = 15.5f)
                // h 10.5
                horizontalLineToRelative(dx = 10.5f)
                // V 5z
                verticalLineTo(y = 5.0f)
                close()
                // M 0 20.5
                moveTo(x = 0.0f, y = 20.5f)
                // v 6.004
                verticalLineToRelative(dy = 6.004f)
                // C 0.002 29.211 1.792 31 4 31
                curveTo(
                    x1 = 0.002f,
                    y1 = 29.211f,
                    x2 = 1.792f,
                    y2 = 31.0f,
                    x3 = 4.0f,
                    y3 = 31.0f,
                )
                // h 6.5
                horizontalLineToRelative(dx = 6.5f)
                // V 20.5
                verticalLineTo(y = 20.5f)
                // H 0z
                horizontalLineTo(x = 0.0f)
                close()
            }
            // M15.5 5 h-5 v10.5 H0 v5 h10.5 V31 h5 V20.5 H36 v-5 H15.5z
            path(
                fill = SolidColor(Color(0xFFFECC00)),
            ) {
                // M 15.5 5
                moveTo(x = 15.5f, y = 5.0f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // v 10.5
                verticalLineToRelative(dy = 10.5f)
                // H 0
                horizontalLineTo(x = 0.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h 10.5
                horizontalLineToRelative(dx = 10.5f)
                // V 31
                verticalLineTo(y = 31.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // V 20.5
                verticalLineTo(y = 20.5f)
                // H 36
                horizontalLineTo(x = 36.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // H 15.5z
                horizontalLineTo(x = 15.5f)
                close()
            }
        }.build().also { _emoji1f1f81f1ea = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1f81f1ea: ImageVector? = null
