package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f9f4: ImageVector
    get() {
        val current = _emoji1f9f4
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f9f4",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M17 3 h2 v5 h-2z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 17 3
                moveTo(x = 17.0f, y = 3.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // M12 12 V9 c0 -1.1 0.9 -2 2 -2 h8 c1.1 0 2 0.9 2 2 v3 H12z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 12 12
                moveTo(x = 12.0f, y = 12.0f)
                // V 9
                verticalLineTo(y = 9.0f)
                // c 0 -1.1 0.9 -2 2 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.1f,
                    dx2 = 0.9f,
                    dy2 = -2.0f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // c 1.1 0 2 0.9 2 2
                curveToRelative(
                    dx1 = 1.1f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 0.9f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // H 12z
                horizontalLineTo(x = 12.0f)
                close()
            }
            // M24 11 H12 c-5 0 -6 21 -6 21 0 2.2 1.8 4 4 4 h16 c2.2 0 4 -1.8 4 -4 0 0 -1 -21 -6 -21z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 24 11
                moveTo(x = 24.0f, y = 11.0f)
                // H 12
                horizontalLineTo(x = 12.0f)
                // c -5 0 -6 21 -6 21
                curveToRelative(
                    dx1 = -5.0f,
                    dy1 = 0.0f,
                    dx2 = -6.0f,
                    dy2 = 21.0f,
                    dx3 = -6.0f,
                    dy3 = 21.0f,
                )
                // c 0 2.2 1.8 4 4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.2f,
                    dx2 = 1.8f,
                    dy2 = 4.0f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // c 2.2 0 4 -1.8 4 -4
                curveToRelative(
                    dx1 = 2.2f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = -1.8f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // c 0 0 -1 -21 -6 -21z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -21.0f,
                    dx3 = -6.0f,
                    dy3 = -21.0f,
                )
                close()
            }
            // M8 4 s2 -4 7 -4 h6 c2 0 2 4 0 4 h-6 c-5 0 -6 1 -6 1 L8 4z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 8 4
                moveTo(x = 8.0f, y = 4.0f)
                // s 2 -4 7 -4
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = -4.0f,
                    dx2 = 7.0f,
                    dy2 = -4.0f,
                )
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // c 2 0 2 4 0 4
                curveToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 4.0f,
                    dx3 = 0.0f,
                    dy3 = 4.0f,
                )
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // c -5 0 -6 1 -6 1
                curveToRelative(
                    dx1 = -5.0f,
                    dy1 = 0.0f,
                    dx2 = -6.0f,
                    dy2 = 1.0f,
                    dx3 = -6.0f,
                    dy3 = 1.0f,
                )
                // L 8 4z
                lineTo(x = 8.0f, y = 4.0f)
                close()
            }
            // M8.464 4.464 L9 5 s1 -1 6 -1 h6 c0.975 0 1.472 -0.949 1.496 -1.922 C21 2.078 19.524 2 15 2 c-3.859 0 -5.519 1.377 -6.536 2.464z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 8.464 4.464
                moveTo(x = 8.464f, y = 4.464f)
                // L 9 5
                lineTo(x = 9.0f, y = 5.0f)
                // s 1 -1 6 -1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                    dx2 = 6.0f,
                    dy2 = -1.0f,
                )
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // c 0.975 0 1.472 -0.949 1.496 -1.922
                curveToRelative(
                    dx1 = 0.975f,
                    dy1 = 0.0f,
                    dx2 = 1.472f,
                    dy2 = -0.949f,
                    dx3 = 1.496f,
                    dy3 = -1.922f,
                )
                // C 21 2.078 19.524 2 15 2
                curveTo(
                    x1 = 21.0f,
                    y1 = 2.078f,
                    x2 = 19.524f,
                    y2 = 2.0f,
                    x3 = 15.0f,
                    y3 = 2.0f,
                )
                // c -3.859 0 -5.519 1.377 -6.536 2.464z
                curveToRelative(
                    dx1 = -3.859f,
                    dy1 = 0.0f,
                    dx2 = -5.519f,
                    dy2 = 1.377f,
                    dx3 = -6.536f,
                    dy3 = 2.464f,
                )
                close()
            }
            // M23.5 13 h-11 c-0.275 0 -0.5 -0.225 -0.5 -0.5 s0.225 -0.5 0.5 -0.5 h11 c0.275 0 0.5 0.225 0.5 0.5 s-0.225 0.5 -0.5 0.5z
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 23.5 13
                moveTo(x = 23.5f, y = 13.0f)
                // h -11
                horizontalLineToRelative(dx = -11.0f)
                // c -0.275 0 -0.5 -0.225 -0.5 -0.5
                curveToRelative(
                    dx1 = -0.275f,
                    dy1 = 0.0f,
                    dx2 = -0.5f,
                    dy2 = -0.225f,
                    dx3 = -0.5f,
                    dy3 = -0.5f,
                )
                // s 0.225 -0.5 0.5 -0.5
                reflectiveCurveToRelative(
                    dx1 = 0.225f,
                    dy1 = -0.5f,
                    dx2 = 0.5f,
                    dy2 = -0.5f,
                )
                // h 11
                horizontalLineToRelative(dx = 11.0f)
                // c 0.275 0 0.5 0.225 0.5 0.5
                curveToRelative(
                    dx1 = 0.275f,
                    dy1 = 0.0f,
                    dx2 = 0.5f,
                    dy2 = 0.225f,
                    dx3 = 0.5f,
                    dy3 = 0.5f,
                )
                // s -0.225 0.5 -0.5 0.5z
                reflectiveCurveToRelative(
                    dx1 = -0.225f,
                    dy1 = 0.5f,
                    dx2 = -0.5f,
                    dy2 = 0.5f,
                )
                close()
            }
            // M18 18 s-4 4.791 -4 7 c0 2.209 1.791 4 4 4 s4 -1.791 4 -4 -4 -7 -4 -7z
            path(
                fill = SolidColor(Color(0xFFFFE8B6)),
            ) {
                // M 18 18
                moveTo(x = 18.0f, y = 18.0f)
                // s -4 4.791 -4 7
                reflectiveCurveToRelative(
                    dx1 = -4.0f,
                    dy1 = 4.791f,
                    dx2 = -4.0f,
                    dy2 = 7.0f,
                )
                // c 0 2.209 1.791 4 4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = 1.791f,
                    dy2 = 4.0f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // s 4 -1.791 4 -4
                reflectiveCurveToRelative(
                    dx1 = 4.0f,
                    dy1 = -1.791f,
                    dx2 = 4.0f,
                    dy2 = -4.0f,
                )
                // s -4 -7 -4 -7z
                reflectiveCurveToRelative(
                    dx1 = -4.0f,
                    dy1 = -7.0f,
                    dx2 = -4.0f,
                    dy2 = -7.0f,
                )
                close()
            }
        }.build().also { _emoji1f9f4 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f9f4: ImageVector? = null
