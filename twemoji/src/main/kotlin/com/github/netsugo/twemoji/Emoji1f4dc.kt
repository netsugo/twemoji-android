package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f4dc: ImageVector
    get() {
        val current = _emoji1f4dc
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f4dc",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M32 0 H10 C7.791 0 6 1.791 6 4 v24 H4 c-2.209 0 -4 1.791 -4 4 s1.791 4 4 4 h24 c2.209 0 4 -1.791 4 -4 V8 c2.209 0 4 -1.791 4 -4 s-1.791 -4 -4 -4z
            path(
                fill = SolidColor(Color(0xFFFFD983)),
            ) {
                // M 32 0
                moveTo(x = 32.0f, y = 0.0f)
                // H 10
                horizontalLineTo(x = 10.0f)
                // C 7.791 0 6 1.791 6 4
                curveTo(
                    x1 = 7.791f,
                    y1 = 0.0f,
                    x2 = 6.0f,
                    y2 = 1.791f,
                    x3 = 6.0f,
                    y3 = 4.0f,
                )
                // v 24
                verticalLineToRelative(dy = 24.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // c -2.209 0 -4 1.791 -4 4
                curveToRelative(
                    dx1 = -2.209f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = 1.791f,
                    dx3 = -4.0f,
                    dy3 = 4.0f,
                )
                // s 1.791 4 4 4
                reflectiveCurveToRelative(
                    dx1 = 1.791f,
                    dy1 = 4.0f,
                    dx2 = 4.0f,
                    dy2 = 4.0f,
                )
                // h 24
                horizontalLineToRelative(dx = 24.0f)
                // c 2.209 0 4 -1.791 4 -4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = -1.791f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // V 8
                verticalLineTo(y = 8.0f)
                // c 2.209 0 4 -1.791 4 -4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = -1.791f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // s -1.791 -4 -4 -4z
                reflectiveCurveToRelative(
                    dx1 = -1.791f,
                    dy1 = -4.0f,
                    dx2 = -4.0f,
                    dy2 = -4.0f,
                )
                close()
            }
            // M8 10 h24 V8 H10 L8 7z
            path(
                fill = SolidColor(Color(0xFFE39F3D)),
            ) {
                // M 8 10
                moveTo(x = 8.0f, y = 10.0f)
                // h 24
                horizontalLineToRelative(dx = 24.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // H 10
                horizontalLineTo(x = 10.0f)
                // L 8 7z
                lineTo(x = 8.0f, y = 7.0f)
                close()
            }
            // M10 0 C7.791 0 6 1.791 6 4 v24.555 C5.41 28.211 4.732 28 4 28 c-2.209 0 -4 1.791 -4 4 s1.791 4 4 4 4 -1.791 4 -4 V7.445 C8.59 7.789 9.268 8 10 8 c2.209 0 4 -1.791 4 -4 s-1.791 -4 -4 -4z
            path(
                fill = SolidColor(Color(0xFFFFE8B6)),
            ) {
                // M 10 0
                moveTo(x = 10.0f, y = 0.0f)
                // C 7.791 0 6 1.791 6 4
                curveTo(
                    x1 = 7.791f,
                    y1 = 0.0f,
                    x2 = 6.0f,
                    y2 = 1.791f,
                    x3 = 6.0f,
                    y3 = 4.0f,
                )
                // v 24.555
                verticalLineToRelative(dy = 24.555f)
                // C 5.41 28.211 4.732 28 4 28
                curveTo(
                    x1 = 5.41f,
                    y1 = 28.211f,
                    x2 = 4.732f,
                    y2 = 28.0f,
                    x3 = 4.0f,
                    y3 = 28.0f,
                )
                // c -2.209 0 -4 1.791 -4 4
                curveToRelative(
                    dx1 = -2.209f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = 1.791f,
                    dx3 = -4.0f,
                    dy3 = 4.0f,
                )
                // s 1.791 4 4 4
                reflectiveCurveToRelative(
                    dx1 = 1.791f,
                    dy1 = 4.0f,
                    dx2 = 4.0f,
                    dy2 = 4.0f,
                )
                // s 4 -1.791 4 -4
                reflectiveCurveToRelative(
                    dx1 = 4.0f,
                    dy1 = -1.791f,
                    dx2 = 4.0f,
                    dy2 = -4.0f,
                )
                // V 7.445
                verticalLineTo(y = 7.445f)
                // C 8.59 7.789 9.268 8 10 8
                curveTo(
                    x1 = 8.59f,
                    y1 = 7.789f,
                    x2 = 9.268f,
                    y2 = 8.0f,
                    x3 = 10.0f,
                    y3 = 8.0f,
                )
                // c 2.209 0 4 -1.791 4 -4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = -1.791f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // s -1.791 -4 -4 -4z
                reflectiveCurveToRelative(
                    dx1 = -1.791f,
                    dy1 = -4.0f,
                    dx2 = -4.0f,
                    dy2 = -4.0f,
                )
                close()
            }
            // M12 4 c0 1.104 -0.896 2 -2 2 s-2 -0.896 -2 -2 0.896 -2 2 -2 2 0.896 2 2 M6 32 c0 1.104 -0.896 2 -2 2 s-2 -0.896 -2 -2 0.896 -2 2 -2 2 0.896 2 2 m24 -17 c0 0.552 -0.447 1 -1 1 H11 c-0.552 0 -1 -0.448 -1 -1 s0.448 -1 1 -1 h18 c0.553 0 1 0.448 1 1 m0 4 c0 0.553 -0.447 1 -1 1 H11 c-0.552 0 -1 -0.447 -1 -1 s0.448 -1 1 -1 h18 c0.553 0 1 0.447 1 1 m0 4 c0 0.553 -0.447 1 -1 1 H11 c-0.552 0 -1 -0.447 -1 -1 s0.448 -1 1 -1 h18 c0.553 0 1 0.447 1 1 m0 4 c0 0.553 -0.447 1 -1 1 H11 c-0.552 0 -1 -0.447 -1 -1 0 -0.553 0.448 -1 1 -1 h18 c0.553 0 1 0.447 1 1
            path(
                fill = SolidColor(Color(0xFFC1694F)),
            ) {
                // M 12 4
                moveTo(x = 12.0f, y = 4.0f)
                // c 0 1.104 -0.896 2 -2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = -0.896f,
                    dy2 = 2.0f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // s -2 -0.896 -2 -2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = -0.896f,
                    dx2 = -2.0f,
                    dy2 = -2.0f,
                )
                // s 0.896 -2 2 -2
                reflectiveCurveToRelative(
                    dx1 = 0.896f,
                    dy1 = -2.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // s 2 0.896 2 2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.896f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                )
                // M 6 32
                moveTo(x = 6.0f, y = 32.0f)
                // c 0 1.104 -0.896 2 -2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = -0.896f,
                    dy2 = 2.0f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // s -2 -0.896 -2 -2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = -0.896f,
                    dx2 = -2.0f,
                    dy2 = -2.0f,
                )
                // s 0.896 -2 2 -2
                reflectiveCurveToRelative(
                    dx1 = 0.896f,
                    dy1 = -2.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // s 2 0.896 2 2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.896f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                )
                // m 24 -17
                moveToRelative(dx = 24.0f, dy = -17.0f)
                // c 0 0.552 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // H 11
                horizontalLineTo(x = 11.0f)
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
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // c 0.553 0 1 0.448 1 1
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.448f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // m 0 4
                moveToRelative(dx = 0.0f, dy = 4.0f)
                // c 0 0.553 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // H 11
                horizontalLineTo(x = 11.0f)
                // c -0.552 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
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
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // c 0.553 0 1 0.447 1 1
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.447f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // m 0 4
                moveToRelative(dx = 0.0f, dy = 4.0f)
                // c 0 0.553 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // H 11
                horizontalLineTo(x = 11.0f)
                // c -0.552 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
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
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // c 0.553 0 1 0.447 1 1
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.447f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // m 0 4
                moveToRelative(dx = 0.0f, dy = 4.0f)
                // c 0 0.553 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // H 11
                horizontalLineTo(x = 11.0f)
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
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // c 0.553 0 1 0.447 1 1
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.447f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
            }
        }.build().also { _emoji1f4dc = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f4dc: ImageVector? = null
