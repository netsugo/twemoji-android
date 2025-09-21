package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f4ed: ImageVector
    get() {
        val current = _emoji1f4ed
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f4ed",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M22 33 c0 2.209 -8 2.209 -8 0 V23 c0 -2.209 1.791 -4 4 -4 s4 1.791 4 4 v10z
            path(
                fill = SolidColor(Color(0xFFC1694F)),
            ) {
                // M 22 33
                moveTo(x = 22.0f, y = 33.0f)
                // c 0 2.209 -8 2.209 -8 0
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = -8.0f,
                    dy2 = 2.209f,
                    dx3 = -8.0f,
                    dy3 = 0.0f,
                )
                // V 23
                verticalLineTo(y = 23.0f)
                // c 0 -2.209 1.791 -4 4 -4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.209f,
                    dx2 = 1.791f,
                    dy2 = -4.0f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // s 4 1.791 4 4
                reflectiveCurveToRelative(
                    dx1 = 4.0f,
                    dy1 = 1.791f,
                    dx2 = 4.0f,
                    dy2 = 4.0f,
                )
                // v 10z
                verticalLineToRelative(dy = 10.0f)
                close()
            }
            // M26 3 H10 v20 h24 V11 c0 -4.418 -3.582 -8 -8 -8z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 26 3
                moveTo(x = 26.0f, y = 3.0f)
                // H 10
                horizontalLineTo(x = 10.0f)
                // v 20
                verticalLineToRelative(dy = 20.0f)
                // h 24
                horizontalLineToRelative(dx = 24.0f)
                // V 11
                verticalLineTo(y = 11.0f)
                // c 0 -4.418 -3.582 -8 -8 -8z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.418f,
                    dx2 = -3.582f,
                    dy2 = -8.0f,
                    dx3 = -8.0f,
                    dy3 = -8.0f,
                )
                close()
            }
            // M10 3 c-4.418 0 -8 3.582 -8 8 v12 h16 V11 c0 -4.418 -3.582 -8 -8 -8z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 10 3
                moveTo(x = 10.0f, y = 3.0f)
                // c -4.418 0 -8 3.582 -8 8
                curveToRelative(
                    dx1 = -4.418f,
                    dy1 = 0.0f,
                    dx2 = -8.0f,
                    dy2 = 3.582f,
                    dx3 = -8.0f,
                    dy3 = 8.0f,
                )
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // V 11
                verticalLineTo(y = 11.0f)
                // c 0 -4.418 -3.582 -8 -8 -8z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.418f,
                    dx2 = -3.582f,
                    dy2 = -8.0f,
                    dx3 = -8.0f,
                    dy3 = -8.0f,
                )
                close()
            }
            // M34 13 H22 c-1.104 0 -2 0.896 -2 2 s0.896 2 2 2 h8 v2 c0 1.104 0.896 2 2 2 h2 c1.104 0 2 -0.896 2 -2 v-4 c0 -1.104 -0.896 -2 -2 -2z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 34 13
                moveTo(x = 34.0f, y = 13.0f)
                // H 22
                horizontalLineTo(x = 22.0f)
                // c -1.104 0 -2 0.896 -2 2
                curveToRelative(
                    dx1 = -1.104f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = 0.896f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // s 0.896 2 2 2
                reflectiveCurveToRelative(
                    dx1 = 0.896f,
                    dy1 = 2.0f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                )
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // c 0 1.104 0.896 2 2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = 0.896f,
                    dy2 = 2.0f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // c 1.104 0 2 -0.896 2 -2
                curveToRelative(
                    dx1 = 1.104f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = -0.896f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // c 0 -1.104 -0.896 -2 -2 -2z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.104f,
                    dx2 = -0.896f,
                    dy2 = -2.0f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                close()
            }
        }.build().also { _emoji1f4ed = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f4ed: ImageVector? = null
