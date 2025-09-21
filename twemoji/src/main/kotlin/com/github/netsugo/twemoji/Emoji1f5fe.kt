package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f5fe: ImageVector
    get() {
        val current = _emoji1f5fe
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f5fe",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 32 s0 4 -4 4 H4 s-4 0 -4 -4 V4 c0 -4 4 -4 4 -4 h28 c4 0 4 4 4 4 v28z
            path(
                fill = SolidColor(Color(0xFF88C9F9)),
            ) {
                // M 36 32
                moveTo(x = 36.0f, y = 32.0f)
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
                // V 4
                verticalLineTo(y = 4.0f)
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
                // c 4 0 4 4 4 4
                curveToRelative(
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = 4.0f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // v 28z
                verticalLineToRelative(dy = 28.0f)
                close()
            }
            // M24 2 c1 0 2 3 3 3 s3 0 3 1 -3 1 -3 2 -1 1 -2 1 -3 0 -3 -1 2 0 2 -1 -1 -5 0 -5z M21 10 c0 -1 2 -1 2 -1 s1 2 0 2 -2 -1 -2 -1z M23 12 c-1 0 -1 2 -1 3 s0 3 -1 3 -2 1 -2 2 -1 2 -2 2 -2 2 -2 2 -4 1 -5 1 -3 0 -3 1 -3 2 -1 2 2 -1 3 -1 h2 s3 -1 3 0 0 2 1 2 2 -1 2 -2 1 -1 2 -1 2 0 2 -1 1 -2 2 -2 1 -2 1 -3 0 -3 1 -3 2 -3 1 -3 -2 0 -2 -1 -1 -1 -1 -1z
            path(
                fill = SolidColor(Color(0xFF3E721D)),
            ) {
                // M 24 2
                moveTo(x = 24.0f, y = 2.0f)
                // c 1 0 2 3 3 3
                curveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 3.0f,
                    dx3 = 3.0f,
                    dy3 = 3.0f,
                )
                // s 3 0 3 1
                reflectiveCurveToRelative(
                    dx1 = 3.0f,
                    dy1 = 0.0f,
                    dx2 = 3.0f,
                    dy2 = 1.0f,
                )
                // s -3 1 -3 2
                reflectiveCurveToRelative(
                    dx1 = -3.0f,
                    dy1 = 1.0f,
                    dx2 = -3.0f,
                    dy2 = 2.0f,
                )
                // s -1 1 -2 1
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                    dx2 = -2.0f,
                    dy2 = 1.0f,
                )
                // s -3 0 -3 -1
                reflectiveCurveToRelative(
                    dx1 = -3.0f,
                    dy1 = 0.0f,
                    dx2 = -3.0f,
                    dy2 = -1.0f,
                )
                // s 2 0 2 -1
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = -1.0f,
                )
                // s -1 -5 0 -5z
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = -5.0f,
                    dx2 = 0.0f,
                    dy2 = -5.0f,
                )
                close()
                // M 21 10
                moveTo(x = 21.0f, y = 10.0f)
                // c 0 -1 2 -1 2 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.0f,
                    dx2 = 2.0f,
                    dy2 = -1.0f,
                    dx3 = 2.0f,
                    dy3 = -1.0f,
                )
                // s 1 2 0 2
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = 2.0f,
                    dx2 = 0.0f,
                    dy2 = 2.0f,
                )
                // s -2 -1 -2 -1z
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = -1.0f,
                    dx2 = -2.0f,
                    dy2 = -1.0f,
                )
                close()
                // M 23 12
                moveTo(x = 23.0f, y = 12.0f)
                // c -1 0 -1 2 -1 3
                curveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = 2.0f,
                    dx3 = -1.0f,
                    dy3 = 3.0f,
                )
                // s 0 3 -1 3
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.0f,
                    dx2 = -1.0f,
                    dy2 = 3.0f,
                )
                // s -2 1 -2 2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 1.0f,
                    dx2 = -2.0f,
                    dy2 = 2.0f,
                )
                // s -1 2 -2 2
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 2.0f,
                    dx2 = -2.0f,
                    dy2 = 2.0f,
                )
                // s -2 2 -2 2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                    dx2 = -2.0f,
                    dy2 = 2.0f,
                )
                // s -4 1 -5 1
                reflectiveCurveToRelative(
                    dx1 = -4.0f,
                    dy1 = 1.0f,
                    dx2 = -5.0f,
                    dy2 = 1.0f,
                )
                // s -3 0 -3 1
                reflectiveCurveToRelative(
                    dx1 = -3.0f,
                    dy1 = 0.0f,
                    dx2 = -3.0f,
                    dy2 = 1.0f,
                )
                // s -3 2 -1 2
                reflectiveCurveToRelative(
                    dx1 = -3.0f,
                    dy1 = 2.0f,
                    dx2 = -1.0f,
                    dy2 = 2.0f,
                )
                // s 2 -1 3 -1
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = -1.0f,
                    dx2 = 3.0f,
                    dy2 = -1.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // s 3 -1 3 0
                reflectiveCurveToRelative(
                    dx1 = 3.0f,
                    dy1 = -1.0f,
                    dx2 = 3.0f,
                    dy2 = 0.0f,
                )
                // s 0 2 1 2
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                    dx2 = 1.0f,
                    dy2 = 2.0f,
                )
                // s 2 -1 2 -2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = -1.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // s 1 -1 2 -1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                    dx2 = 2.0f,
                    dy2 = -1.0f,
                )
                // s 2 0 2 -1
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = -1.0f,
                )
                // s 1 -2 2 -2
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = -2.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // s 1 -2 1 -3
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = -2.0f,
                    dx2 = 1.0f,
                    dy2 = -3.0f,
                )
                // s 0 -3 1 -3
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.0f,
                    dx2 = 1.0f,
                    dy2 = -3.0f,
                )
                // s 2 -3 1 -3
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = -3.0f,
                    dx2 = 1.0f,
                    dy2 = -3.0f,
                )
                // s -2 0 -2 -1
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -1.0f,
                )
                // s -1 -1 -1 -1z
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                )
                close()
            }
            // M8 30 c0 -1 0 -2 1 -2 h3 c1 0 1 0 0 1 s-1 0 -2 0 0 2 -1 2 -1 -1 -1 -1z M4 33 c0 -1 1 -1 1 -2 s-1 0 -1 -1 1 -1 2 -1 1 1 1 2 -1 1 -1 2 -1 1 -1 1 -1 0 -1 -1z
            path(
                fill = SolidColor(Color(0xFF3E721D)),
            ) {
                // M 8 30
                moveTo(x = 8.0f, y = 30.0f)
                // c 0 -1 0 -2 1 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.0f,
                    dx2 = 0.0f,
                    dy2 = -2.0f,
                    dx3 = 1.0f,
                    dy3 = -2.0f,
                )
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // c 1 0 1 0 0 1
                curveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.0f,
                    dx3 = 0.0f,
                    dy3 = 1.0f,
                )
                // s -1 0 -2 0
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = 0.0f,
                )
                // s 0 2 -1 2
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                    dx2 = -1.0f,
                    dy2 = 2.0f,
                )
                // s -1 -1 -1 -1z
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                )
                close()
                // M 4 33
                moveTo(x = 4.0f, y = 33.0f)
                // c 0 -1 1 -1 1 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -2.0f,
                )
                // s -1 0 -1 -1
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                )
                // s 1 -1 2 -1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                    dx2 = 2.0f,
                    dy2 = -1.0f,
                )
                // s 1 1 1 2
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                    dx2 = 1.0f,
                    dy2 = 2.0f,
                )
                // s -1 1 -1 2
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                    dx2 = -1.0f,
                    dy2 = 2.0f,
                )
                // s -1 1 -1 1
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                // s -1 0 -1 -1z
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                )
                close()
            }
        }.build().also { _emoji1f5fe = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f5fe: ImageVector? = null
