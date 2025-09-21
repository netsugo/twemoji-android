package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f5a5: ImageVector
    get() {
        val current = _emoji1f5a5
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f5a5",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 22 c0 2.209 -1.791 4 -4 4 H4 c-2.209 0 -4 -1.791 -4 -4 V4 c0 -2.209 1.791 -4 4 -4 h28 c2.209 0 4 1.791 4 4 v18z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 36 22
                moveTo(x = 36.0f, y = 22.0f)
                // c 0 2.209 -1.791 4 -4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = -1.791f,
                    dy2 = 4.0f,
                    dx3 = -4.0f,
                    dy3 = 4.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // c -2.209 0 -4 -1.791 -4 -4
                curveToRelative(
                    dx1 = -2.209f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = -1.791f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
                // c 0 -2.209 1.791 -4 4 -4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.209f,
                    dx2 = 1.791f,
                    dy2 = -4.0f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // c 2.209 0 4 1.791 4 4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = 1.791f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // v 18z
                verticalLineToRelative(dy = 18.0f)
                close()
            }
            // M4 4 h28 v18 H4z
            path(
                fill = SolidColor(Color(0xFF5DADEC)),
            ) {
                // M 4 4
                moveTo(x = 4.0f, y = 4.0f)
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // v 18
                verticalLineToRelative(dy = 18.0f)
                // H 4z
                horizontalLineTo(x = 4.0f)
                close()
            }
            // M13 26 h10 v6 H13z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 13 26
                moveTo(x = 13.0f, y = 26.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // H 13z
                horizontalLineTo(x = 13.0f)
                close()
            }
            // M13 26 h10 v2 H13z
            path(
                fill = SolidColor(Color(0xFF9AAAB4)),
            ) {
                // M 13 26
                moveTo(x = 13.0f, y = 26.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 13z
                horizontalLineTo(x = 13.0f)
                close()
            }
            // M36 33 c0 -1.657 -1.343 -3 -3 -3 H3 c-1.657 0 -3 1.343 -3 3 s1.343 3 3 3 h30 c1.657 0 3 -1.343 3 -3z
            path(
                fill = SolidColor(Color(0xFFE1E8ED)),
            ) {
                // M 36 33
                moveTo(x = 36.0f, y = 33.0f)
                // c 0 -1.657 -1.343 -3 -3 -3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.657f,
                    dx2 = -1.343f,
                    dy2 = -3.0f,
                    dx3 = -3.0f,
                    dy3 = -3.0f,
                )
                // H 3
                horizontalLineTo(x = 3.0f)
                // c -1.657 0 -3 1.343 -3 3
                curveToRelative(
                    dx1 = -1.657f,
                    dy1 = 0.0f,
                    dx2 = -3.0f,
                    dy2 = 1.343f,
                    dx3 = -3.0f,
                    dy3 = 3.0f,
                )
                // s 1.343 3 3 3
                reflectiveCurveToRelative(
                    dx1 = 1.343f,
                    dy1 = 3.0f,
                    dx2 = 3.0f,
                    dy2 = 3.0f,
                )
                // h 30
                horizontalLineToRelative(dx = 30.0f)
                // c 1.657 0 3 -1.343 3 -3z
                curveToRelative(
                    dx1 = 1.657f,
                    dy1 = 0.0f,
                    dx2 = 3.0f,
                    dy2 = -1.343f,
                    dx3 = 3.0f,
                    dy3 = -3.0f,
                )
                close()
            }
            // M3 32 h2 v2 L3 34z M7 32 h2 v2 L7 34z M11 32 h2 v2 h-2z M15 32 h2 v2 h-2z M19 32 h2 v2 h-2z M23 32 h2 v2 h-2z M27 32 h2 v2 h-2z M31 32 h2 v2 h-2z
            path(
                fill = SolidColor(Color(0xFFF5F8FA)),
            ) {
                // M 3 32
                moveTo(x = 3.0f, y = 32.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // L 3 34z
                lineTo(x = 3.0f, y = 34.0f)
                close()
                // M 7 32
                moveTo(x = 7.0f, y = 32.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // L 7 34z
                lineTo(x = 7.0f, y = 34.0f)
                close()
                // M 11 32
                moveTo(x = 11.0f, y = 32.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
                // M 15 32
                moveTo(x = 15.0f, y = 32.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
                // M 19 32
                moveTo(x = 19.0f, y = 32.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
                // M 23 32
                moveTo(x = 23.0f, y = 32.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
                // M 27 32
                moveTo(x = 27.0f, y = 32.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
                // M 31 32
                moveTo(x = 31.0f, y = 32.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
        }.build().also { _emoji1f5a5 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f5a5: ImageVector? = null
