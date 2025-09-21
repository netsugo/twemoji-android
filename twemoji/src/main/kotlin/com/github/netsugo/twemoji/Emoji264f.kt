package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji264f: ImageVector
    get() {
        val current = _emoji264f
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji264f",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 32 c0 2.209 -1.791 4 -4 4 H4 c-2.209 0 -4 -1.791 -4 -4 V4 c0 -2.209 1.791 -4 4 -4 h28 c2.209 0 4 1.791 4 4 v28z
            path(
                fill = SolidColor(Color(0xFF9266CC)),
            ) {
                // M 36 32
                moveTo(x = 36.0f, y = 32.0f)
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
                // v 28z
                verticalLineToRelative(dy = 28.0f)
                close()
            }
            // M31.5 28 L26 24 v8z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 31.5 28
                moveTo(x = 31.5f, y = 28.0f)
                // L 26 24
                lineTo(x = 26.0f, y = 24.0f)
                // v 8z
                verticalLineToRelative(dy = 8.0f)
                close()
            }
            // M27 26.5 c-3.842 0 -4 -0.933 -4 -4.5 V11 c0 -3.979 -1.776 -4.939 -3.268 -5.291 -1.465 -0.345 -2.971 0.291 -4.024 1.269 -0.595 -0.751 -1.313 -1.113 -1.976 -1.269 -1.46 -0.345 -2.959 0.286 -4.012 1.257 C8.705 5.619 7.393 5.5 7 5.5 c-0.829 0 -1.5 0.671 -1.5 1.5 S6.171 8.5 7 8.5 c0.155 0 1 0.646 1 3.5 v11 c0 0.828 0.671 1.5 1.5 1.5 S11 23.828 11 23 l0.006 -13.086 c0 -0.83 0.673 -1.502 1.502 -1.502 0.83 0 1.502 0.673 1.502 1.502 L14 23 c0 0.828 0.671 1.5 1.5 1.5 S17 23.828 17 23 l0.006 -13.086 c0 -0.83 0.673 -1.502 1.502 -1.502 0.83 0 1.502 0.673 1.502 1.502 L20 22 c0 3.952 0.535 7.5 7 7.5 0.828 0 1.5 -0.672 1.5 -1.5 s-0.672 -1.5 -1.5 -1.5z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 27 26.5
                moveTo(x = 27.0f, y = 26.5f)
                // c -3.842 0 -4 -0.933 -4 -4.5
                curveToRelative(
                    dx1 = -3.842f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = -0.933f,
                    dx3 = -4.0f,
                    dy3 = -4.5f,
                )
                // V 11
                verticalLineTo(y = 11.0f)
                // c 0 -3.979 -1.776 -4.939 -3.268 -5.291
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.979f,
                    dx2 = -1.776f,
                    dy2 = -4.939f,
                    dx3 = -3.268f,
                    dy3 = -5.291f,
                )
                // c -1.465 -0.345 -2.971 0.291 -4.024 1.269
                curveToRelative(
                    dx1 = -1.465f,
                    dy1 = -0.345f,
                    dx2 = -2.971f,
                    dy2 = 0.291f,
                    dx3 = -4.024f,
                    dy3 = 1.269f,
                )
                // c -0.595 -0.751 -1.313 -1.113 -1.976 -1.269
                curveToRelative(
                    dx1 = -0.595f,
                    dy1 = -0.751f,
                    dx2 = -1.313f,
                    dy2 = -1.113f,
                    dx3 = -1.976f,
                    dy3 = -1.269f,
                )
                // c -1.46 -0.345 -2.959 0.286 -4.012 1.257
                curveToRelative(
                    dx1 = -1.46f,
                    dy1 = -0.345f,
                    dx2 = -2.959f,
                    dy2 = 0.286f,
                    dx3 = -4.012f,
                    dy3 = 1.257f,
                )
                // C 8.705 5.619 7.393 5.5 7 5.5
                curveTo(
                    x1 = 8.705f,
                    y1 = 5.619f,
                    x2 = 7.393f,
                    y2 = 5.5f,
                    x3 = 7.0f,
                    y3 = 5.5f,
                )
                // c -0.829 0 -1.5 0.671 -1.5 1.5
                curveToRelative(
                    dx1 = -0.829f,
                    dy1 = 0.0f,
                    dx2 = -1.5f,
                    dy2 = 0.671f,
                    dx3 = -1.5f,
                    dy3 = 1.5f,
                )
                // S 6.171 8.5 7 8.5
                reflectiveCurveTo(
                    x1 = 6.171f,
                    y1 = 8.5f,
                    x2 = 7.0f,
                    y2 = 8.5f,
                )
                // c 0.155 0 1 0.646 1 3.5
                curveToRelative(
                    dx1 = 0.155f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.646f,
                    dx3 = 1.0f,
                    dy3 = 3.5f,
                )
                // v 11
                verticalLineToRelative(dy = 11.0f)
                // c 0 0.828 0.671 1.5 1.5 1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.828f,
                    dx2 = 0.671f,
                    dy2 = 1.5f,
                    dx3 = 1.5f,
                    dy3 = 1.5f,
                )
                // S 11 23.828 11 23
                reflectiveCurveTo(
                    x1 = 11.0f,
                    y1 = 23.828f,
                    x2 = 11.0f,
                    y2 = 23.0f,
                )
                // l 0.006 -13.086
                lineToRelative(dx = 0.006f, dy = -13.086f)
                // c 0 -0.83 0.673 -1.502 1.502 -1.502
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.83f,
                    dx2 = 0.673f,
                    dy2 = -1.502f,
                    dx3 = 1.502f,
                    dy3 = -1.502f,
                )
                // c 0.83 0 1.502 0.673 1.502 1.502
                curveToRelative(
                    dx1 = 0.83f,
                    dy1 = 0.0f,
                    dx2 = 1.502f,
                    dy2 = 0.673f,
                    dx3 = 1.502f,
                    dy3 = 1.502f,
                )
                // L 14 23
                lineTo(x = 14.0f, y = 23.0f)
                // c 0 0.828 0.671 1.5 1.5 1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.828f,
                    dx2 = 0.671f,
                    dy2 = 1.5f,
                    dx3 = 1.5f,
                    dy3 = 1.5f,
                )
                // S 17 23.828 17 23
                reflectiveCurveTo(
                    x1 = 17.0f,
                    y1 = 23.828f,
                    x2 = 17.0f,
                    y2 = 23.0f,
                )
                // l 0.006 -13.086
                lineToRelative(dx = 0.006f, dy = -13.086f)
                // c 0 -0.83 0.673 -1.502 1.502 -1.502
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.83f,
                    dx2 = 0.673f,
                    dy2 = -1.502f,
                    dx3 = 1.502f,
                    dy3 = -1.502f,
                )
                // c 0.83 0 1.502 0.673 1.502 1.502
                curveToRelative(
                    dx1 = 0.83f,
                    dy1 = 0.0f,
                    dx2 = 1.502f,
                    dy2 = 0.673f,
                    dx3 = 1.502f,
                    dy3 = 1.502f,
                )
                // L 20 22
                lineTo(x = 20.0f, y = 22.0f)
                // c 0 3.952 0.535 7.5 7 7.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.952f,
                    dx2 = 0.535f,
                    dy2 = 7.5f,
                    dx3 = 7.0f,
                    dy3 = 7.5f,
                )
                // c 0.828 0 1.5 -0.672 1.5 -1.5
                curveToRelative(
                    dx1 = 0.828f,
                    dy1 = 0.0f,
                    dx2 = 1.5f,
                    dy2 = -0.672f,
                    dx3 = 1.5f,
                    dy3 = -1.5f,
                )
                // s -0.672 -1.5 -1.5 -1.5z
                reflectiveCurveToRelative(
                    dx1 = -0.672f,
                    dy1 = -1.5f,
                    dx2 = -1.5f,
                    dy2 = -1.5f,
                )
                close()
            }
        }.build().also { _emoji264f = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji264f: ImageVector? = null
