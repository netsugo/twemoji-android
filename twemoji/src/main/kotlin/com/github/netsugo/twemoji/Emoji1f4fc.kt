package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f4fc: ImageVector
    get() {
        val current = _emoji1f4fc
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f4fc",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 25 s0 4 -4 4 H4 s-4 0 -4 -4 V10 c0 -4 4 -4 4 -4 h28 s4 0 4 4 v15z
            path(
                fill = SolidColor(Color(0xFF31373D)),
            ) {
                // M 36 25
                moveTo(x = 36.0f, y = 25.0f)
                // s 0 4 -4 4
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.0f,
                    dx2 = -4.0f,
                    dy2 = 4.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // s -4 0 -4 -4
                reflectiveCurveToRelative(
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = -4.0f,
                )
                // V 10
                verticalLineTo(y = 10.0f)
                // c 0 -4 4 -4 4 -4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.0f,
                    dx2 = 4.0f,
                    dy2 = -4.0f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // s 4 0 4 4
                reflectiveCurveToRelative(
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = 4.0f,
                )
                // v 15z
                verticalLineToRelative(dy = 15.0f)
                close()
            }
            // M32 12 h-6 s-1 0 -1 1 v8 s0 1 1 1 h6 c1 0 2 -2 2 -5 s-1 -5 -2 -5z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 32 12
                moveTo(x = 32.0f, y = 12.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // s -1 0 -1 1
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // s 0 1 1 1
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.0f,
                    dx2 = 1.0f,
                    dy2 = 1.0f,
                )
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // c 1 0 2 -2 2 -5
                curveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                    dx3 = 2.0f,
                    dy3 = -5.0f,
                )
                // s -1 -5 -2 -5z
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = -5.0f,
                    dx2 = -2.0f,
                    dy2 = -5.0f,
                )
                close()
            }
            // M29.894 12 H26 s-1 0 -1 1 v1 c1.656 0 3 1.343 3 3 s-1.344 3 -3 3 v1 s0 1 1 1 h3.895 C31.193 20.73 32 18.96 32 17 c0 -1.959 -0.808 -3.729 -2.106 -5z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 29.894 12
                moveTo(x = 29.894f, y = 12.0f)
                // H 26
                horizontalLineTo(x = 26.0f)
                // s -1 0 -1 1
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // c 1.656 0 3 1.343 3 3
                curveToRelative(
                    dx1 = 1.656f,
                    dy1 = 0.0f,
                    dx2 = 3.0f,
                    dy2 = 1.343f,
                    dx3 = 3.0f,
                    dy3 = 3.0f,
                )
                // s -1.344 3 -3 3
                reflectiveCurveToRelative(
                    dx1 = -1.344f,
                    dy1 = 3.0f,
                    dx2 = -3.0f,
                    dy2 = 3.0f,
                )
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // s 0 1 1 1
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.0f,
                    dx2 = 1.0f,
                    dy2 = 1.0f,
                )
                // h 3.895
                horizontalLineToRelative(dx = 3.895f)
                // C 31.193 20.73 32 18.96 32 17
                curveTo(
                    x1 = 31.193f,
                    y1 = 20.73f,
                    x2 = 32.0f,
                    y2 = 18.96f,
                    x3 = 32.0f,
                    y3 = 17.0f,
                )
                // c 0 -1.959 -0.808 -3.729 -2.106 -5z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.959f,
                    dx2 = -0.808f,
                    dy2 = -3.729f,
                    dx3 = -2.106f,
                    dy3 = -5.0f,
                )
                close()
            }
            // M28 17 c0 -1.657 -1.344 -3 -3 -3 v6 c1.656 0 3 -1.343 3 -3z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 28 17
                moveTo(x = 28.0f, y = 17.0f)
                // c 0 -1.657 -1.344 -3 -3 -3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.657f,
                    dx2 = -1.344f,
                    dy2 = -3.0f,
                    dx3 = -3.0f,
                    dy3 = -3.0f,
                )
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // c 1.656 0 3 -1.343 3 -3z
                curveToRelative(
                    dx1 = 1.656f,
                    dy1 = 0.0f,
                    dx2 = 3.0f,
                    dy2 = -1.343f,
                    dx3 = 3.0f,
                    dy3 = -3.0f,
                )
                close()
            }
            // M4 12 h6 s1 0 1 1 v8 s0 1 -1 1 H4 c-1 0 -2 -2 -2 -5 s1 -5 2 -5z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 4 12
                moveTo(x = 4.0f, y = 12.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // s 1 0 1 1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 1.0f,
                )
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // s 0 1 -1 1
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.0f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // c -1 0 -2 -2 -2 -5
                curveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -2.0f,
                    dx3 = -2.0f,
                    dy3 = -5.0f,
                )
                // s 1 -5 2 -5z
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = -5.0f,
                    dx2 = 2.0f,
                    dy2 = -5.0f,
                )
                close()
            }
            // M11 20 c-1.657 0 -3 -1.343 -3 -3 s1.343 -3 3 -3 v-1 c0 -1 -1 -1 -1 -1 H6.106 C4.808 13.271 4 15.04 4 17 s0.808 3.729 2.106 5 H10 c1 0 1 -1 1 -1 v-1z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 11 20
                moveTo(x = 11.0f, y = 20.0f)
                // c -1.657 0 -3 -1.343 -3 -3
                curveToRelative(
                    dx1 = -1.657f,
                    dy1 = 0.0f,
                    dx2 = -3.0f,
                    dy2 = -1.343f,
                    dx3 = -3.0f,
                    dy3 = -3.0f,
                )
                // s 1.343 -3 3 -3
                reflectiveCurveToRelative(
                    dx1 = 1.343f,
                    dy1 = -3.0f,
                    dx2 = 3.0f,
                    dy2 = -3.0f,
                )
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // c 0 -1 -1 -1 -1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.0f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // H 6.106
                horizontalLineTo(x = 6.106f)
                // C 4.808 13.271 4 15.04 4 17
                curveTo(
                    x1 = 4.808f,
                    y1 = 13.271f,
                    x2 = 4.0f,
                    y2 = 15.04f,
                    x3 = 4.0f,
                    y3 = 17.0f,
                )
                // s 0.808 3.729 2.106 5
                reflectiveCurveToRelative(
                    dx1 = 0.808f,
                    dy1 = 3.729f,
                    dx2 = 2.106f,
                    dy2 = 5.0f,
                )
                // H 10
                horizontalLineTo(x = 10.0f)
                // c 1 0 1 -1 1 -1
                curveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // v -1z
                verticalLineToRelative(dy = -1.0f)
                close()
            }
            // M8 17 c0 1.657 1.343 3 3 3 v-6 c-1.657 0 -3 1.343 -3 3z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 8 17
                moveTo(x = 8.0f, y = 17.0f)
                // c 0 1.657 1.343 3 3 3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.657f,
                    dx2 = 1.343f,
                    dy2 = 3.0f,
                    dx3 = 3.0f,
                    dy3 = 3.0f,
                )
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // c -1.657 0 -3 1.343 -3 3z
                curveToRelative(
                    dx1 = -1.657f,
                    dy1 = 0.0f,
                    dx2 = -3.0f,
                    dy2 = 1.343f,
                    dx3 = -3.0f,
                    dy3 = 3.0f,
                )
                close()
            }
            // M13 14 s0 -1 1 -1 h8 s1 0 1 1 v6 s0 1 -1 1 h-8 s-1 0 -1 -1 v-6z
            path(
                fill = SolidColor(Color(0xFF88C9F9)),
            ) {
                // M 13 14
                moveTo(x = 13.0f, y = 14.0f)
                // s 0 -1 1 -1
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // s 1 0 1 1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 1.0f,
                )
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // s 0 1 -1 1
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.0f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // s -1 0 -1 -1
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                )
                // v -6z
                verticalLineToRelative(dy = -6.0f)
                close()
            }
            // M34 26 c0 0.553 -0.447 1 -1 1 H3 c-0.552 0 -1 -0.447 -1 -1 0 -0.553 0.448 -1 1 -1 h30 c0.553 0 1 0.447 1 1z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 34 26
                moveTo(x = 34.0f, y = 26.0f)
                // c 0 0.553 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // H 3
                horizontalLineTo(x = 3.0f)
                // c -0.552 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // c 0 -0.553 0.448 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.553f,
                    dx2 = 0.448f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 30
                horizontalLineToRelative(dx = 30.0f)
                // c 0.553 0 1 0.447 1 1z
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.447f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                close()
            }
        }.build().also { _emoji1f4fc = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f4fc: ImageVector? = null
