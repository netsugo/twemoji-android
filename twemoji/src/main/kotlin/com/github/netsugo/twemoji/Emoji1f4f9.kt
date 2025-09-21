package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f4f9: ImageVector
    get() {
        val current = _emoji1f4f9
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f4f9",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M29 18 H16 c-3.668 0 -5 -2.99 -5 -5 v-2 H7 c-3 0 -3 3 -3 3 s-2 -1 -3 -1 -1 1 -1 1 v10 s0 1 1 1 3 -1 3 -1 v7 c0 4 4 4 4 4 h18 c4 0 4 -4 4 -4 V17.894 c-0.347 0.069 -0.685 0.106 -1 0.106z
            path(
                fill = SolidColor(Color(0xFF31373D)),
            ) {
                // M 29 18
                moveTo(x = 29.0f, y = 18.0f)
                // H 16
                horizontalLineTo(x = 16.0f)
                // c -3.668 0 -5 -2.99 -5 -5
                curveToRelative(
                    dx1 = -3.668f,
                    dy1 = 0.0f,
                    dx2 = -5.0f,
                    dy2 = -2.99f,
                    dx3 = -5.0f,
                    dy3 = -5.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
                // c -3 0 -3 3 -3 3
                curveToRelative(
                    dx1 = -3.0f,
                    dy1 = 0.0f,
                    dx2 = -3.0f,
                    dy2 = 3.0f,
                    dx3 = -3.0f,
                    dy3 = 3.0f,
                )
                // s -2 -1 -3 -1
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = -1.0f,
                    dx2 = -3.0f,
                    dy2 = -1.0f,
                )
                // s -1 1 -1 1
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // s 0 1 1 1
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.0f,
                    dx2 = 1.0f,
                    dy2 = 1.0f,
                )
                // s 3 -1 3 -1
                reflectiveCurveToRelative(
                    dx1 = 3.0f,
                    dy1 = -1.0f,
                    dx2 = 3.0f,
                    dy2 = -1.0f,
                )
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // c 0 4 4 4 4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.0f,
                    dx2 = 4.0f,
                    dy2 = 4.0f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // c 4 0 4 -4 4 -4
                curveToRelative(
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = -4.0f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // V 17.894
                verticalLineTo(y = 17.894f)
                // c -0.347 0.069 -0.685 0.106 -1 0.106z
                curveToRelative(
                    dx1 = -0.347f,
                    dy1 = 0.069f,
                    dx2 = -0.685f,
                    dy2 = 0.106f,
                    dx3 = -1.0f,
                    dy3 = 0.106f,
                )
                close()
            }
            // M35 6 c-0.559 0 -2.05 0.934 -3.26 1.76 C31.413 6.934 30.674 6 29 6 H18 s-5 0 -5 5 v2 s0 3 3 3 h13 s2.075 -0.006 2.771 -1.739 C32.976 15.082 34.446 16 35 16 c1 0 1 -1 1 -1 V7 s0 -1 -1 -1z M9 35 v-9 s0 -3 2.75 -3 H22 s3 0 3 3 v9 h-2 v-9 s0 -1 -1 -1 H12 s-1 0 -1 1 v9 H9z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 35 6
                moveTo(x = 35.0f, y = 6.0f)
                // c -0.559 0 -2.05 0.934 -3.26 1.76
                curveToRelative(
                    dx1 = -0.559f,
                    dy1 = 0.0f,
                    dx2 = -2.05f,
                    dy2 = 0.934f,
                    dx3 = -3.26f,
                    dy3 = 1.76f,
                )
                // C 31.413 6.934 30.674 6 29 6
                curveTo(
                    x1 = 31.413f,
                    y1 = 6.934f,
                    x2 = 30.674f,
                    y2 = 6.0f,
                    x3 = 29.0f,
                    y3 = 6.0f,
                )
                // H 18
                horizontalLineTo(x = 18.0f)
                // s -5 0 -5 5
                reflectiveCurveToRelative(
                    dx1 = -5.0f,
                    dy1 = 0.0f,
                    dx2 = -5.0f,
                    dy2 = 5.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // s 0 3 3 3
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.0f,
                    dx2 = 3.0f,
                    dy2 = 3.0f,
                )
                // h 13
                horizontalLineToRelative(dx = 13.0f)
                // s 2.075 -0.006 2.771 -1.739
                reflectiveCurveToRelative(
                    dx1 = 2.075f,
                    dy1 = -0.006f,
                    dx2 = 2.771f,
                    dy2 = -1.739f,
                )
                // C 32.976 15.082 34.446 16 35 16
                curveTo(
                    x1 = 32.976f,
                    y1 = 15.082f,
                    x2 = 34.446f,
                    y2 = 16.0f,
                    x3 = 35.0f,
                    y3 = 16.0f,
                )
                // c 1 0 1 -1 1 -1
                curveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // V 7
                verticalLineTo(y = 7.0f)
                // s 0 -1 -1 -1z
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.0f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                )
                close()
                // M 9 35
                moveTo(x = 9.0f, y = 35.0f)
                // v -9
                verticalLineToRelative(dy = -9.0f)
                // s 0 -3 2.75 -3
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.0f,
                    dx2 = 2.75f,
                    dy2 = -3.0f,
                )
                // H 22
                horizontalLineTo(x = 22.0f)
                // s 3 0 3 3
                reflectiveCurveToRelative(
                    dx1 = 3.0f,
                    dy1 = 0.0f,
                    dx2 = 3.0f,
                    dy2 = 3.0f,
                )
                // v 9
                verticalLineToRelative(dy = 9.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v -9
                verticalLineToRelative(dy = -9.0f)
                // s 0 -1 -1 -1
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.0f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                )
                // H 12
                horizontalLineTo(x = 12.0f)
                // s -1 0 -1 1
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                // v 9
                verticalLineToRelative(dy = 9.0f)
                // H 9z
                horizontalLineTo(x = 9.0f)
                close()
            }
        }.build().also { _emoji1f4f9 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f4f9: ImageVector? = null
