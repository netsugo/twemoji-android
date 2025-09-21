package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f5ff: ImageVector
    get() {
        val current = _emoji1f5ff
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f5ff",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M8 27 s-2 4 -2 6 4 3 12 3 12 -1 12 -3 -2 -6 -2 -6 L8 27z M9 6 C6 6 6 7 5 16 c-0.994 8.945 0 10 4 10 2 0 2 -20 0 -20z M27 6 c3 0 3 1 4 10 0.994 8.945 0 10 -4 10 -2 0 -2 -20 0 -20z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 8 27
                moveTo(x = 8.0f, y = 27.0f)
                // s -2 4 -2 6
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 4.0f,
                    dx2 = -2.0f,
                    dy2 = 6.0f,
                )
                // s 4 3 12 3
                reflectiveCurveToRelative(
                    dx1 = 4.0f,
                    dy1 = 3.0f,
                    dx2 = 12.0f,
                    dy2 = 3.0f,
                )
                // s 12 -1 12 -3
                reflectiveCurveToRelative(
                    dx1 = 12.0f,
                    dy1 = -1.0f,
                    dx2 = 12.0f,
                    dy2 = -3.0f,
                )
                // s -2 -6 -2 -6
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = -6.0f,
                    dx2 = -2.0f,
                    dy2 = -6.0f,
                )
                // L 8 27z
                lineTo(x = 8.0f, y = 27.0f)
                close()
                // M 9 6
                moveTo(x = 9.0f, y = 6.0f)
                // C 6 6 6 7 5 16
                curveTo(
                    x1 = 6.0f,
                    y1 = 6.0f,
                    x2 = 6.0f,
                    y2 = 7.0f,
                    x3 = 5.0f,
                    y3 = 16.0f,
                )
                // c -0.994 8.945 0 10 4 10
                curveToRelative(
                    dx1 = -0.994f,
                    dy1 = 8.945f,
                    dx2 = 0.0f,
                    dy2 = 10.0f,
                    dx3 = 4.0f,
                    dy3 = 10.0f,
                )
                // c 2 0 2 -20 0 -20z
                curveToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = -20.0f,
                    dx3 = 0.0f,
                    dy3 = -20.0f,
                )
                close()
                // M 27 6
                moveTo(x = 27.0f, y = 6.0f)
                // c 3 0 3 1 4 10
                curveToRelative(
                    dx1 = 3.0f,
                    dy1 = 0.0f,
                    dx2 = 3.0f,
                    dy2 = 1.0f,
                    dx3 = 4.0f,
                    dy3 = 10.0f,
                )
                // c 0.994 8.945 0 10 -4 10
                curveToRelative(
                    dx1 = 0.994f,
                    dy1 = 8.945f,
                    dx2 = 0.0f,
                    dy2 = 10.0f,
                    dx3 = -4.0f,
                    dy3 = 10.0f,
                )
                // c -2 0 -2 -20 0 -20z
                curveToRelative(
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -20.0f,
                    dx3 = 0.0f,
                    dy3 = -20.0f,
                )
                close()
            }
            // M8 3 s1 -3 10 -3 10 3 10 3 1 6 1 14 -1 14 -1 14 -1 2 -10 2 -10 -2 -10 -2 -1 -3 -1 -14 S8 3 8 3z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 8 3
                moveTo(x = 8.0f, y = 3.0f)
                // s 1 -3 10 -3
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = -3.0f,
                    dx2 = 10.0f,
                    dy2 = -3.0f,
                )
                // s 10 3 10 3
                reflectiveCurveToRelative(
                    dx1 = 10.0f,
                    dy1 = 3.0f,
                    dx2 = 10.0f,
                    dy2 = 3.0f,
                )
                // s 1 6 1 14
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = 6.0f,
                    dx2 = 1.0f,
                    dy2 = 14.0f,
                )
                // s -1 14 -1 14
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 14.0f,
                    dx2 = -1.0f,
                    dy2 = 14.0f,
                )
                // s -1 2 -10 2
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 2.0f,
                    dx2 = -10.0f,
                    dy2 = 2.0f,
                )
                // s -10 -2 -10 -2
                reflectiveCurveToRelative(
                    dx1 = -10.0f,
                    dy1 = -2.0f,
                    dx2 = -10.0f,
                    dy2 = -2.0f,
                )
                // s -1 -3 -1 -14
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = -3.0f,
                    dx2 = -1.0f,
                    dy2 = -14.0f,
                )
                // S 8 3 8 3z
                reflectiveCurveTo(
                    x1 = 8.0f,
                    y1 = 3.0f,
                    x2 = 8.0f,
                    y2 = 3.0f,
                )
                close()
            }
            // M28 8 c0 -1 -3 -4 -10 -4 S8 7 8 8 c0 0.807 4.548 1.612 6.311 1.894 C14.999 12.548 15 18 15 18 c0.805 -3.218 0.315 -7.079 0.093 -8.467 C15.295 8.942 15.941 8 18 8 c3 0 3 2 3 2 h0.002 c-0.234 1.657 -0.566 5.089 0.162 8 0 0 0.002 -5.491 0.697 -8.134 C23.727 9.562 28 8.782 28 8z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 28 8
                moveTo(x = 28.0f, y = 8.0f)
                // c 0 -1 -3 -4 -10 -4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.0f,
                    dx2 = -3.0f,
                    dy2 = -4.0f,
                    dx3 = -10.0f,
                    dy3 = -4.0f,
                )
                // S 8 7 8 8
                reflectiveCurveTo(
                    x1 = 8.0f,
                    y1 = 7.0f,
                    x2 = 8.0f,
                    y2 = 8.0f,
                )
                // c 0 0.807 4.548 1.612 6.311 1.894
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.807f,
                    dx2 = 4.548f,
                    dy2 = 1.612f,
                    dx3 = 6.311f,
                    dy3 = 1.894f,
                )
                // C 14.999 12.548 15 18 15 18
                curveTo(
                    x1 = 14.999f,
                    y1 = 12.548f,
                    x2 = 15.0f,
                    y2 = 18.0f,
                    x3 = 15.0f,
                    y3 = 18.0f,
                )
                // c 0.805 -3.218 0.315 -7.079 0.093 -8.467
                curveToRelative(
                    dx1 = 0.805f,
                    dy1 = -3.218f,
                    dx2 = 0.315f,
                    dy2 = -7.079f,
                    dx3 = 0.093f,
                    dy3 = -8.467f,
                )
                // C 15.295 8.942 15.941 8 18 8
                curveTo(
                    x1 = 15.295f,
                    y1 = 8.942f,
                    x2 = 15.941f,
                    y2 = 8.0f,
                    x3 = 18.0f,
                    y3 = 8.0f,
                )
                // c 3 0 3 2 3 2
                curveToRelative(
                    dx1 = 3.0f,
                    dy1 = 0.0f,
                    dx2 = 3.0f,
                    dy2 = 2.0f,
                    dx3 = 3.0f,
                    dy3 = 2.0f,
                )
                // h 0.002
                horizontalLineToRelative(dx = 0.002f)
                // c -0.234 1.657 -0.566 5.089 0.162 8
                curveToRelative(
                    dx1 = -0.234f,
                    dy1 = 1.657f,
                    dx2 = -0.566f,
                    dy2 = 5.089f,
                    dx3 = 0.162f,
                    dy3 = 8.0f,
                )
                // c 0 0 0.002 -5.491 0.697 -8.134
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 0.002f,
                    dy2 = -5.491f,
                    dx3 = 0.697f,
                    dy3 = -8.134f,
                )
                // C 23.727 9.562 28 8.782 28 8z
                curveTo(
                    x1 = 23.727f,
                    y1 = 9.562f,
                    x2 = 28.0f,
                    y2 = 8.782f,
                    x3 = 28.0f,
                    y3 = 8.0f,
                )
                close()
            }
            // M14 20 c0 -1 2 -3 4 -3 s4 2 4 3 -1 1 -4 1 -4 0 -4 -1z M12 24 s2 -2 6 -2 6 2 6 2 -2 -1 -6 -1 -6 1 -6 1z M12 26 c0 -1 2 -2 6 -2 s6 1 6 2 -1 1 -6 1 -6 0 -6 -1z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 14 20
                moveTo(x = 14.0f, y = 20.0f)
                // c 0 -1 2 -3 4 -3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.0f,
                    dx2 = 2.0f,
                    dy2 = -3.0f,
                    dx3 = 4.0f,
                    dy3 = -3.0f,
                )
                // s 4 2 4 3
                reflectiveCurveToRelative(
                    dx1 = 4.0f,
                    dy1 = 2.0f,
                    dx2 = 4.0f,
                    dy2 = 3.0f,
                )
                // s -1 1 -4 1
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                    dx2 = -4.0f,
                    dy2 = 1.0f,
                )
                // s -4 0 -4 -1z
                reflectiveCurveToRelative(
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = -1.0f,
                )
                close()
                // M 12 24
                moveTo(x = 12.0f, y = 24.0f)
                // s 2 -2 6 -2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                    dx2 = 6.0f,
                    dy2 = -2.0f,
                )
                // s 6 2 6 2
                reflectiveCurveToRelative(
                    dx1 = 6.0f,
                    dy1 = 2.0f,
                    dx2 = 6.0f,
                    dy2 = 2.0f,
                )
                // s -2 -1 -6 -1
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = -1.0f,
                    dx2 = -6.0f,
                    dy2 = -1.0f,
                )
                // s -6 1 -6 1z
                reflectiveCurveToRelative(
                    dx1 = -6.0f,
                    dy1 = 1.0f,
                    dx2 = -6.0f,
                    dy2 = 1.0f,
                )
                close()
                // M 12 26
                moveTo(x = 12.0f, y = 26.0f)
                // c 0 -1 2 -2 6 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                    dx3 = 6.0f,
                    dy3 = -2.0f,
                )
                // s 6 1 6 2
                reflectiveCurveToRelative(
                    dx1 = 6.0f,
                    dy1 = 1.0f,
                    dx2 = 6.0f,
                    dy2 = 2.0f,
                )
                // s -1 1 -6 1
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                    dx2 = -6.0f,
                    dy2 = 1.0f,
                )
                // s -6 0 -6 -1z
                reflectiveCurveToRelative(
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                    dx2 = -6.0f,
                    dy2 = -1.0f,
                )
                close()
            }
        }.build().also { _emoji1f5ff = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f5ff: ImageVector? = null
