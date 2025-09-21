package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f17f: ImageVector
    get() {
        val current = _emoji1f17f
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f17f",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 32 c0 2.209 -1.791 4 -4 4 H4 c-2.209 0 -4 -1.791 -4 -4 V4 c0 -2.209 1.791 -4 4 -4 h28 c2.209 0 4 1.791 4 4 v28z
            path(
                fill = SolidColor(Color(0xFF226699)),
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
            // M11 9.496 C11 7.992 11.896 7 13.496 7 h5.665 c4.703 0 8.191 2.944 8.191 7.52 0 4.67 -3.617 7.48 -8 7.48 H16 v5.479 c0 1.6 -1.024 2.496 -2.4 2.496 s-2.6 -0.897 -2.6 -2.496 V9.496z M16 18 h3.062 c2.018 0 3.297 -1.465 3.297 -3.385 0 -1.92 -1.279 -3.392 -3.297 -3.392 H16 V18z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 11 9.496
                moveTo(x = 11.0f, y = 9.496f)
                // C 11 7.992 11.896 7 13.496 7
                curveTo(
                    x1 = 11.0f,
                    y1 = 7.992f,
                    x2 = 11.896f,
                    y2 = 7.0f,
                    x3 = 13.496f,
                    y3 = 7.0f,
                )
                // h 5.665
                horizontalLineToRelative(dx = 5.665f)
                // c 4.703 0 8.191 2.944 8.191 7.52
                curveToRelative(
                    dx1 = 4.703f,
                    dy1 = 0.0f,
                    dx2 = 8.191f,
                    dy2 = 2.944f,
                    dx3 = 8.191f,
                    dy3 = 7.52f,
                )
                // c 0 4.67 -3.617 7.48 -8 7.48
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.67f,
                    dx2 = -3.617f,
                    dy2 = 7.48f,
                    dx3 = -8.0f,
                    dy3 = 7.48f,
                )
                // H 16
                horizontalLineTo(x = 16.0f)
                // v 5.479
                verticalLineToRelative(dy = 5.479f)
                // c 0 1.6 -1.024 2.496 -2.4 2.496
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.6f,
                    dx2 = -1.024f,
                    dy2 = 2.496f,
                    dx3 = -2.4f,
                    dy3 = 2.496f,
                )
                // s -2.6 -0.897 -2.6 -2.496
                reflectiveCurveToRelative(
                    dx1 = -2.6f,
                    dy1 = -0.897f,
                    dx2 = -2.6f,
                    dy2 = -2.496f,
                )
                // V 9.496z
                verticalLineTo(y = 9.496f)
                close()
                // M 16 18
                moveTo(x = 16.0f, y = 18.0f)
                // h 3.062
                horizontalLineToRelative(dx = 3.062f)
                // c 2.018 0 3.297 -1.465 3.297 -3.385
                curveToRelative(
                    dx1 = 2.018f,
                    dy1 = 0.0f,
                    dx2 = 3.297f,
                    dy2 = -1.465f,
                    dx3 = 3.297f,
                    dy3 = -3.385f,
                )
                // c 0 -1.92 -1.279 -3.392 -3.297 -3.392
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.92f,
                    dx2 = -1.279f,
                    dy2 = -3.392f,
                    dx3 = -3.297f,
                    dy3 = -3.392f,
                )
                // H 16
                horizontalLineTo(x = 16.0f)
                // V 18z
                verticalLineTo(y = 18.0f)
                close()
            }
        }.build().also { _emoji1f17f = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f17f: ImageVector? = null
