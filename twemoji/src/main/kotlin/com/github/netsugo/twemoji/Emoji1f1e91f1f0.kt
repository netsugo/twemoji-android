package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1e91f1f0: ImageVector
    get() {
        val current = _emoji1f1e91f1f0
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1e91f1f0",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M32 5 H15 v11 h21 V9 c0 -2.209 -1.791 -4 -4 -4z M15 31 h17 c2.209 0 4 -1.791 4 -4.5 V20 H15 v11z M0 20 v6.5 C0 29.209 1.791 31 4 31 h7 V20 H0z M11 5 H4 C1.791 5 0 6.791 0 9 v7 h11 V5z
            path(
                fill = SolidColor(Color(0xFFC60C30)),
            ) {
                // M 32 5
                moveTo(x = 32.0f, y = 5.0f)
                // H 15
                horizontalLineTo(x = 15.0f)
                // v 11
                verticalLineToRelative(dy = 11.0f)
                // h 21
                horizontalLineToRelative(dx = 21.0f)
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
                // M 15 31
                moveTo(x = 15.0f, y = 31.0f)
                // h 17
                horizontalLineToRelative(dx = 17.0f)
                // c 2.209 0 4 -1.791 4 -4.5
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = -1.791f,
                    dx3 = 4.0f,
                    dy3 = -4.5f,
                )
                // V 20
                verticalLineTo(y = 20.0f)
                // H 15
                horizontalLineTo(x = 15.0f)
                // v 11z
                verticalLineToRelative(dy = 11.0f)
                close()
                // M 0 20
                moveTo(x = 0.0f, y = 20.0f)
                // v 6.5
                verticalLineToRelative(dy = 6.5f)
                // C 0 29.209 1.791 31 4 31
                curveTo(
                    x1 = 0.0f,
                    y1 = 29.209f,
                    x2 = 1.791f,
                    y2 = 31.0f,
                    x3 = 4.0f,
                    y3 = 31.0f,
                )
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // V 20
                verticalLineTo(y = 20.0f)
                // H 0z
                horizontalLineTo(x = 0.0f)
                close()
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
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // h 11
                horizontalLineToRelative(dx = 11.0f)
                // V 5z
                verticalLineTo(y = 5.0f)
                close()
            }
            // M15 5 h-4 v11 H0 v4 h11 v11 h4 V20 h21 v-4 H15z
            path(
                fill = SolidColor(Color(0xFFEEEEEE)),
            ) {
                // M 15 5
                moveTo(x = 15.0f, y = 5.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v 11
                verticalLineToRelative(dy = 11.0f)
                // H 0
                horizontalLineTo(x = 0.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h 11
                horizontalLineToRelative(dx = 11.0f)
                // v 11
                verticalLineToRelative(dy = 11.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // V 20
                verticalLineTo(y = 20.0f)
                // h 21
                horizontalLineToRelative(dx = 21.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // H 15z
                horizontalLineTo(x = 15.0f)
                close()
            }
        }.build().also { _emoji1f1e91f1f0 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1e91f1f0: ImageVector? = null
