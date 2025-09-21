package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f3f0: ImageVector
    get() {
        val current = _emoji1f3f0
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f3f0",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M4 17 h28 v19 H4z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 4 17
                moveTo(x = 4.0f, y = 17.0f)
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // v 19
                verticalLineToRelative(dy = 19.0f)
                // H 4z
                horizontalLineTo(x = 4.0f)
                close()
            }
            // M6 13 h23 v5 H6z
            path(
                fill = SolidColor(Color(0xFF226699)),
            ) {
                // M 6 13
                moveTo(x = 6.0f, y = 13.0f)
                // h 23
                horizontalLineToRelative(dx = 23.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // H 6z
                horizontalLineTo(x = 6.0f)
                close()
            }
            // M1 12 v22 c0 1.104 0.896 2 2 2 h4 L7 12 L1 12z M29 12 v24 h4 c1.104 0 2 -0.896 2 -2 L35 12 h-6z
            path(
                fill = SolidColor(Color(0xFFAAB8C2)),
            ) {
                // M 1 12
                moveTo(x = 1.0f, y = 12.0f)
                // v 22
                verticalLineToRelative(dy = 22.0f)
                // c 0 1.104 0.896 2 2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = 0.896f,
                    dy2 = 2.0f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // L 7 12
                lineTo(x = 7.0f, y = 12.0f)
                // L 1 12z
                lineTo(x = 1.0f, y = 12.0f)
                close()
                // M 29 12
                moveTo(x = 29.0f, y = 12.0f)
                // v 24
                verticalLineToRelative(dy = 24.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // c 1.104 0 2 -0.896 2 -2
                curveToRelative(
                    dx1 = 1.104f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = -0.896f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // L 35 12
                lineTo(x = 35.0f, y = 12.0f)
                // h -6z
                horizontalLineToRelative(dx = -6.0f)
                close()
            }
            // M14 22 h8 v11 h-8z
            path(
                fill = SolidColor(Color(0xFFF2F9FF)),
            ) {
                // M 14 22
                moveTo(x = 14.0f, y = 22.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v 11
                verticalLineToRelative(dy = 11.0f)
                // h -8z
                horizontalLineToRelative(dx = -8.0f)
                close()
            }
            // M22 19 c-0.295 0 -0.558 0.391 -0.74 1 h-6.52 c-0.183 -0.609 -0.445 -1 -0.74 -1 -0.552 0 -1 1.344 -1 3 0 1.657 0.448 3 1 3 s1 -1.343 1 -3 h6 c0 1.657 0.447 3 1 3 s1 -1.343 1 -3 c0 -1.656 -0.447 -3 -1 -3z
            path(
                fill = SolidColor(Color(0xFF226699)),
            ) {
                // M 22 19
                moveTo(x = 22.0f, y = 19.0f)
                // c -0.295 0 -0.558 0.391 -0.74 1
                curveToRelative(
                    dx1 = -0.295f,
                    dy1 = 0.0f,
                    dx2 = -0.558f,
                    dy2 = 0.391f,
                    dx3 = -0.74f,
                    dy3 = 1.0f,
                )
                // h -6.52
                horizontalLineToRelative(dx = -6.52f)
                // c -0.183 -0.609 -0.445 -1 -0.74 -1
                curveToRelative(
                    dx1 = -0.183f,
                    dy1 = -0.609f,
                    dx2 = -0.445f,
                    dy2 = -1.0f,
                    dx3 = -0.74f,
                    dy3 = -1.0f,
                )
                // c -0.552 0 -1 1.344 -1 3
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = 1.344f,
                    dx3 = -1.0f,
                    dy3 = 3.0f,
                )
                // c 0 1.657 0.448 3 1 3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.657f,
                    dx2 = 0.448f,
                    dy2 = 3.0f,
                    dx3 = 1.0f,
                    dy3 = 3.0f,
                )
                // s 1 -1.343 1 -3
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = -1.343f,
                    dx2 = 1.0f,
                    dy2 = -3.0f,
                )
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // c 0 1.657 0.447 3 1 3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.657f,
                    dx2 = 0.447f,
                    dy2 = 3.0f,
                    dx3 = 1.0f,
                    dy3 = 3.0f,
                )
                // s 1 -1.343 1 -3
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = -1.343f,
                    dx2 = 1.0f,
                    dy2 = -3.0f,
                )
                // c 0 -1.656 -0.447 -3 -1 -3z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.656f,
                    dx2 = -0.447f,
                    dy2 = -3.0f,
                    dx3 = -1.0f,
                    dy3 = -3.0f,
                )
                close()
            }
            // M3 17 h2 v2 L3 19z M9 20 h2 v2 L9 22z M25 20 h2 v2 h-2z M9 24 h2 v2 L9 26z M25 24 h2 v2 h-2z M3 21 h2 v2 L3 23z M31 17 h2 v2 h-2z M31 21 h2 v2 h-2z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 3 17
                moveTo(x = 3.0f, y = 17.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // L 3 19z
                lineTo(x = 3.0f, y = 19.0f)
                close()
                // M 9 20
                moveTo(x = 9.0f, y = 20.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // L 9 22z
                lineTo(x = 9.0f, y = 22.0f)
                close()
                // M 25 20
                moveTo(x = 25.0f, y = 20.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
                // M 9 24
                moveTo(x = 9.0f, y = 24.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // L 9 26z
                lineTo(x = 9.0f, y = 26.0f)
                close()
                // M 25 24
                moveTo(x = 25.0f, y = 24.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
                // M 3 21
                moveTo(x = 3.0f, y = 21.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // L 3 23z
                lineTo(x = 3.0f, y = 23.0f)
                close()
                // M 31 17
                moveTo(x = 31.0f, y = 17.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
                // M 31 21
                moveTo(x = 31.0f, y = 21.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // M13 22 h10 v4 H13z
            path(
                fill = SolidColor(Color(0xFFF2F9FF)),
            ) {
                // M 13 22
                moveTo(x = 13.0f, y = 22.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // H 13z
                horizontalLineTo(x = 13.0f)
                close()
            }
            // M18 26 c-1.104 0 -2 0.896 -2 2 v5 h4 v-5 c0 -1.104 -0.896 -2 -2 -2z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 18 26
                moveTo(x = 18.0f, y = 26.0f)
                // c -1.104 0 -2 0.896 -2 2
                curveToRelative(
                    dx1 = -1.104f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = 0.896f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
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
            // M12 33 h12 v3 H12z
            path(
                fill = SolidColor(Color(0xFF8899A6)),
            ) {
                // M 12 33
                moveTo(x = 12.0f, y = 33.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // H 12z
                horizontalLineTo(x = 12.0f)
                close()
            }
            // M1 12 h6 S5 4 4 4 s-3 8 -3 8z M29 12 h6 s-2 -8 -3 -8 -3 8 -3 8z
            path(
                fill = SolidColor(Color(0xFF226699)),
            ) {
                // M 1 12
                moveTo(x = 1.0f, y = 12.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // S 5 4 4 4
                reflectiveCurveTo(
                    x1 = 5.0f,
                    y1 = 4.0f,
                    x2 = 4.0f,
                    y2 = 4.0f,
                )
                // s -3 8 -3 8z
                reflectiveCurveToRelative(
                    dx1 = -3.0f,
                    dy1 = 8.0f,
                    dx2 = -3.0f,
                    dy2 = 8.0f,
                )
                close()
                // M 29 12
                moveTo(x = 29.0f, y = 12.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // s -2 -8 -3 -8
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = -8.0f,
                    dx2 = -3.0f,
                    dy2 = -8.0f,
                )
                // s -3 8 -3 8z
                reflectiveCurveToRelative(
                    dx1 = -3.0f,
                    dy1 = 8.0f,
                    dx2 = -3.0f,
                    dy2 = 8.0f,
                )
                close()
            }
            // M8 14 c0 0.552 -0.448 1 -1 1 L1 15 c-0.552 0 -1 -0.448 -1 -1 s0.448 -1 1 -1 h6 c0.552 0 1 0.448 1 1z M36 14 c0 0.552 -0.447 1 -1 1 h-6 c-0.553 0 -1 -0.448 -1 -1 s0.447 -1 1 -1 h6 c0.553 0 1 0.448 1 1z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 8 14
                moveTo(x = 8.0f, y = 14.0f)
                // c 0 0.552 -0.448 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = -0.448f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // L 1 15
                lineTo(x = 1.0f, y = 15.0f)
                // c -0.552 0 -1 -0.448 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.448f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // s 0.448 -1 1 -1
                reflectiveCurveToRelative(
                    dx1 = 0.448f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // c 0.552 0 1 0.448 1 1z
                curveToRelative(
                    dx1 = 0.552f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.448f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                close()
                // M 36 14
                moveTo(x = 36.0f, y = 14.0f)
                // c 0 0.552 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // c -0.553 0 -1 -0.448 -1 -1
                curveToRelative(
                    dx1 = -0.553f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.448f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // s 0.447 -1 1 -1
                reflectiveCurveToRelative(
                    dx1 = 0.447f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // c 0.553 0 1 0.448 1 1z
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.448f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                close()
            }
        }.build().also { _emoji1f3f0 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f3f0: ImageVector? = null
