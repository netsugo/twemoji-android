package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f3d9: ImageVector
    get() {
        val current = _emoji1f3d9
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f3d9",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M32 0 H4 C1.791 0 0 1.791 0 4 v22 h36 V4 c0 -2.209 -1.791 -4 -4 -4z
            path(
                fill = SolidColor(Color(0xFF88C9F9)),
            ) {
                // M 32 0
                moveTo(x = 32.0f, y = 0.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // C 1.791 0 0 1.791 0 4
                curveTo(
                    x1 = 1.791f,
                    y1 = 0.0f,
                    x2 = 0.0f,
                    y2 = 1.791f,
                    x3 = 0.0f,
                    y3 = 4.0f,
                )
                // v 22
                verticalLineToRelative(dy = 22.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // V 4
                verticalLineTo(y = 4.0f)
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
            // M10 36 L10 7 l4 -4 h2 l4 4 v29z M33 11 c0 -1 -1 -1 -1 -1 h-7 s-1 0 -1 1 v25 h9 L33 11z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 10 36
                moveTo(x = 10.0f, y = 36.0f)
                // L 10 7
                lineTo(x = 10.0f, y = 7.0f)
                // l 4 -4
                lineToRelative(dx = 4.0f, dy = -4.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // l 4 4
                lineToRelative(dx = 4.0f, dy = 4.0f)
                // v 29z
                verticalLineToRelative(dy = 29.0f)
                close()
                // M 33 11
                moveTo(x = 33.0f, y = 11.0f)
                // c 0 -1 -1 -1 -1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.0f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // h -7
                horizontalLineToRelative(dx = -7.0f)
                // s -1 0 -1 1
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                // v 25
                verticalLineToRelative(dy = 25.0f)
                // h 9
                horizontalLineToRelative(dx = 9.0f)
                // L 33 11z
                lineTo(x = 33.0f, y = 11.0f)
                close()
            }
            // M28 17 c0 -1 -1 -1 -1 -1 h-8 c-1 0 -1 1 -1 1 v19 h10 L28 17z M11 19 L6 19 v-5 s0 -1 -1 -1 L0 13 v19 c0 2.209 1.791 4 4 4 h8 L12 20 s0 -1 -1 -1z M32 25 c-1 0 -1 1 -1 1 v10 h1 c2.209 0 4 -1.791 4 -4 v-7 h-4z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 28 17
                moveTo(x = 28.0f, y = 17.0f)
                // c 0 -1 -1 -1 -1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.0f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // c -1 0 -1 1 -1 1
                curveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // v 19
                verticalLineToRelative(dy = 19.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // L 28 17z
                lineTo(x = 28.0f, y = 17.0f)
                close()
                // M 11 19
                moveTo(x = 11.0f, y = 19.0f)
                // L 6 19
                lineTo(x = 6.0f, y = 19.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // s 0 -1 -1 -1
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.0f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                )
                // L 0 13
                lineTo(x = 0.0f, y = 13.0f)
                // v 19
                verticalLineToRelative(dy = 19.0f)
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
                // L 12 20
                lineTo(x = 12.0f, y = 20.0f)
                // s 0 -1 -1 -1z
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.0f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                )
                close()
                // M 32 25
                moveTo(x = 32.0f, y = 25.0f)
                // c -1 0 -1 1 -1 1
                curveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // c 2.209 0 4 -1.791 4 -4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = -1.791f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // v -7
                verticalLineToRelative(dy = -7.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // M8 29 h2 v2 L8 31z M8 21 h2 v2 L8 23z M6 25 h2 v2 L6 27z M16 9 h2 v2 h-2z M16 13 h2 v2 h-2z M14 17 h2 v2 h-2z M24 18 h2 v2 h-2z M22 22 h2 v2 h-2z M20 28 h2 v2 h-2z M29 12 h2 v2 h-2z M29 16 h2 v2 h-2z
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 8 29
                moveTo(x = 8.0f, y = 29.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // L 8 31z
                lineTo(x = 8.0f, y = 31.0f)
                close()
                // M 8 21
                moveTo(x = 8.0f, y = 21.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // L 8 23z
                lineTo(x = 8.0f, y = 23.0f)
                close()
                // M 6 25
                moveTo(x = 6.0f, y = 25.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // L 6 27z
                lineTo(x = 6.0f, y = 27.0f)
                close()
                // M 16 9
                moveTo(x = 16.0f, y = 9.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
                // M 16 13
                moveTo(x = 16.0f, y = 13.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
                // M 14 17
                moveTo(x = 14.0f, y = 17.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
                // M 24 18
                moveTo(x = 24.0f, y = 18.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
                // M 22 22
                moveTo(x = 22.0f, y = 22.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
                // M 20 28
                moveTo(x = 20.0f, y = 28.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
                // M 29 12
                moveTo(x = 29.0f, y = 12.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
                // M 29 16
                moveTo(x = 29.0f, y = 16.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
        }.build().also { _emoji1f3d9 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f3d9: ImageVector? = null
