package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f4ca: ImageVector
    get() {
        val current = _emoji1f4ca
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f4ca",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M31 2 H5 C3.343 2 2 3.343 2 5 v26 c0 1.657 1.343 3 3 3 h26 c1.657 0 3 -1.343 3 -3 V5 c0 -1.657 -1.343 -3 -3 -3z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 31 2
                moveTo(x = 31.0f, y = 2.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
                // C 3.343 2 2 3.343 2 5
                curveTo(
                    x1 = 3.343f,
                    y1 = 2.0f,
                    x2 = 2.0f,
                    y2 = 3.343f,
                    x3 = 2.0f,
                    y3 = 5.0f,
                )
                // v 26
                verticalLineToRelative(dy = 26.0f)
                // c 0 1.657 1.343 3 3 3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.657f,
                    dx2 = 1.343f,
                    dy2 = 3.0f,
                    dx3 = 3.0f,
                    dy3 = 3.0f,
                )
                // h 26
                horizontalLineToRelative(dx = 26.0f)
                // c 1.657 0 3 -1.343 3 -3
                curveToRelative(
                    dx1 = 1.657f,
                    dy1 = 0.0f,
                    dx2 = 3.0f,
                    dy2 = -1.343f,
                    dx3 = 3.0f,
                    dy3 = -3.0f,
                )
                // V 5
                verticalLineTo(y = 5.0f)
                // c 0 -1.657 -1.343 -3 -3 -3z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.657f,
                    dx2 = -1.343f,
                    dy2 = -3.0f,
                    dx3 = -3.0f,
                    dy3 = -3.0f,
                )
                close()
            }
            // M31 1 L5 1 C2.791 1 1 2.791 1 5 v26 c0 2.209 1.791 4 4 4 h26 c2.209 0 4 -1.791 4 -4 L35 5 c0 -2.209 -1.791 -4 -4 -4z M31 3 c1.103 0 2 0.897 2 2 v4 h-6 L27 3 h4z M27 19 h6 v6 h-6 v-6z M27 17 v-6 h6 v6 h-6z M25 3 v6 h-6 L19 3 h6z M19 11 h6 v6 h-6 v-6z M19 19 h6 v6 h-6 v-6z M17 3 v6 h-6 L11 3 h6z M11 11 h6 v6 h-6 v-6z M11 19 h6 v6 h-6 v-6z M3 5 c0 -1.103 0.897 -2 2 -2 h4 v6 L3 9 L3 5z M3 11 h6 v6 L3 17 v-6z M3 19 h6 v6 L3 25 v-6z M5 33 c-1.103 0 -2 -0.897 -2 -2 v-4 h6 v6 L5 33z M11 33 v-6 h6 v6 h-6z M19 33 v-6 h6 v6 h-6z M31 33 h-4 v-6 h6 v4 c0 1.103 -0.897 2 -2 2z
            path(
                fill = SolidColor(Color(0xFFE1E8ED)),
            ) {
                // M 31 1
                moveTo(x = 31.0f, y = 1.0f)
                // L 5 1
                lineTo(x = 5.0f, y = 1.0f)
                // C 2.791 1 1 2.791 1 5
                curveTo(
                    x1 = 2.791f,
                    y1 = 1.0f,
                    x2 = 1.0f,
                    y2 = 2.791f,
                    x3 = 1.0f,
                    y3 = 5.0f,
                )
                // v 26
                verticalLineToRelative(dy = 26.0f)
                // c 0 2.209 1.791 4 4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = 1.791f,
                    dy2 = 4.0f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // h 26
                horizontalLineToRelative(dx = 26.0f)
                // c 2.209 0 4 -1.791 4 -4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = -1.791f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // L 35 5
                lineTo(x = 35.0f, y = 5.0f)
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
                // M 31 3
                moveTo(x = 31.0f, y = 3.0f)
                // c 1.103 0 2 0.897 2 2
                curveToRelative(
                    dx1 = 1.103f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 0.897f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // L 27 3
                lineTo(x = 27.0f, y = 3.0f)
                // h 4z
                horizontalLineToRelative(dx = 4.0f)
                close()
                // M 27 19
                moveTo(x = 27.0f, y = 19.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // v -6z
                verticalLineToRelative(dy = -6.0f)
                close()
                // M 27 17
                moveTo(x = 27.0f, y = 17.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h -6z
                horizontalLineToRelative(dx = -6.0f)
                close()
                // M 25 3
                moveTo(x = 25.0f, y = 3.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // L 19 3
                lineTo(x = 19.0f, y = 3.0f)
                // h 6z
                horizontalLineToRelative(dx = 6.0f)
                close()
                // M 19 11
                moveTo(x = 19.0f, y = 11.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // v -6z
                verticalLineToRelative(dy = -6.0f)
                close()
                // M 19 19
                moveTo(x = 19.0f, y = 19.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // v -6z
                verticalLineToRelative(dy = -6.0f)
                close()
                // M 17 3
                moveTo(x = 17.0f, y = 3.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // L 11 3
                lineTo(x = 11.0f, y = 3.0f)
                // h 6z
                horizontalLineToRelative(dx = 6.0f)
                close()
                // M 11 11
                moveTo(x = 11.0f, y = 11.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // v -6z
                verticalLineToRelative(dy = -6.0f)
                close()
                // M 11 19
                moveTo(x = 11.0f, y = 19.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // v -6z
                verticalLineToRelative(dy = -6.0f)
                close()
                // M 3 5
                moveTo(x = 3.0f, y = 5.0f)
                // c 0 -1.103 0.897 -2 2 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.103f,
                    dx2 = 0.897f,
                    dy2 = -2.0f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // L 3 9
                lineTo(x = 3.0f, y = 9.0f)
                // L 3 5z
                lineTo(x = 3.0f, y = 5.0f)
                close()
                // M 3 11
                moveTo(x = 3.0f, y = 11.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // L 3 17
                lineTo(x = 3.0f, y = 17.0f)
                // v -6z
                verticalLineToRelative(dy = -6.0f)
                close()
                // M 3 19
                moveTo(x = 3.0f, y = 19.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // L 3 25
                lineTo(x = 3.0f, y = 25.0f)
                // v -6z
                verticalLineToRelative(dy = -6.0f)
                close()
                // M 5 33
                moveTo(x = 5.0f, y = 33.0f)
                // c -1.103 0 -2 -0.897 -2 -2
                curveToRelative(
                    dx1 = -1.103f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -0.897f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // L 5 33z
                lineTo(x = 5.0f, y = 33.0f)
                close()
                // M 11 33
                moveTo(x = 11.0f, y = 33.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h -6z
                horizontalLineToRelative(dx = -6.0f)
                close()
                // M 19 33
                moveTo(x = 19.0f, y = 33.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h -6z
                horizontalLineToRelative(dx = -6.0f)
                close()
                // M 31 33
                moveTo(x = 31.0f, y = 33.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // c 0 1.103 -0.897 2 -2 2z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.103f,
                    dx2 = -0.897f,
                    dy2 = 2.0f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                close()
            }
            // M13 33 H7 V16 c0 -1.104 0.896 -2 2 -2 h2 c1.104 0 2 0.896 2 2 v17z
            path(
                fill = SolidColor(Color(0xFF5C913B)),
            ) {
                // M 13 33
                moveTo(x = 13.0f, y = 33.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
                // V 16
                verticalLineTo(y = 16.0f)
                // c 0 -1.104 0.896 -2 2 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.104f,
                    dx2 = 0.896f,
                    dy2 = -2.0f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // c 1.104 0 2 0.896 2 2
                curveToRelative(
                    dx1 = 1.104f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 0.896f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                // v 17z
                verticalLineToRelative(dy = 17.0f)
                close()
            }
            // M29 33 h-6 V9 c0 -1.104 0.896 -2 2 -2 h2 c1.104 0 2 0.896 2 2 v24z
            path(
                fill = SolidColor(Color(0xFF3B94D9)),
            ) {
                // M 29 33
                moveTo(x = 29.0f, y = 33.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // V 9
                verticalLineTo(y = 9.0f)
                // c 0 -1.104 0.896 -2 2 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.104f,
                    dx2 = 0.896f,
                    dy2 = -2.0f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // c 1.104 0 2 0.896 2 2
                curveToRelative(
                    dx1 = 1.104f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 0.896f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                // v 24z
                verticalLineToRelative(dy = 24.0f)
                close()
            }
            // M21 33 h-6 V23 c0 -1.104 0.896 -2 2 -2 h2 c1.104 0 2 0.896 2 2 v10z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 21 33
                moveTo(x = 21.0f, y = 33.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // V 23
                verticalLineTo(y = 23.0f)
                // c 0 -1.104 0.896 -2 2 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.104f,
                    dx2 = 0.896f,
                    dy2 = -2.0f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // c 1.104 0 2 0.896 2 2
                curveToRelative(
                    dx1 = 1.104f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 0.896f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                // v 10z
                verticalLineToRelative(dy = 10.0f)
                close()
            }
        }.build().also { _emoji1f4ca = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f4ca: ImageVector? = null
