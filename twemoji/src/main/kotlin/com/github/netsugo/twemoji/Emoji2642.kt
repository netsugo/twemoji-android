package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji2642: ImageVector
    get() {
        val current = _emoji2642
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji2642",
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
            // M15 30.5 c-4.687 0 -8.5 -3.813 -8.5 -8.5 s3.813 -8.5 8.5 -8.5 8.5 3.813 8.5 8.5 -3.813 8.5 -8.5 8.5z M15 16.5 c-3.032 0 -5.5 2.468 -5.5 5.5 s2.468 5.5 5.5 5.5 5.5 -2.468 5.5 -5.5 -2.468 -5.5 -5.5 -5.5z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 15 30.5
                moveTo(x = 15.0f, y = 30.5f)
                // c -4.687 0 -8.5 -3.813 -8.5 -8.5
                curveToRelative(
                    dx1 = -4.687f,
                    dy1 = 0.0f,
                    dx2 = -8.5f,
                    dy2 = -3.813f,
                    dx3 = -8.5f,
                    dy3 = -8.5f,
                )
                // s 3.813 -8.5 8.5 -8.5
                reflectiveCurveToRelative(
                    dx1 = 3.813f,
                    dy1 = -8.5f,
                    dx2 = 8.5f,
                    dy2 = -8.5f,
                )
                // s 8.5 3.813 8.5 8.5
                reflectiveCurveToRelative(
                    dx1 = 8.5f,
                    dy1 = 3.813f,
                    dx2 = 8.5f,
                    dy2 = 8.5f,
                )
                // s -3.813 8.5 -8.5 8.5z
                reflectiveCurveToRelative(
                    dx1 = -3.813f,
                    dy1 = 8.5f,
                    dx2 = -8.5f,
                    dy2 = 8.5f,
                )
                close()
                // M 15 16.5
                moveTo(x = 15.0f, y = 16.5f)
                // c -3.032 0 -5.5 2.468 -5.5 5.5
                curveToRelative(
                    dx1 = -3.032f,
                    dy1 = 0.0f,
                    dx2 = -5.5f,
                    dy2 = 2.468f,
                    dx3 = -5.5f,
                    dy3 = 5.5f,
                )
                // s 2.468 5.5 5.5 5.5
                reflectiveCurveToRelative(
                    dx1 = 2.468f,
                    dy1 = 5.5f,
                    dx2 = 5.5f,
                    dy2 = 5.5f,
                )
                // s 5.5 -2.468 5.5 -5.5
                reflectiveCurveToRelative(
                    dx1 = 5.5f,
                    dy1 = -2.468f,
                    dx2 = 5.5f,
                    dy2 = -5.5f,
                )
                // s -2.468 -5.5 -5.5 -5.5z
                reflectiveCurveToRelative(
                    dx1 = -2.468f,
                    dy1 = -5.5f,
                    dx2 = -5.5f,
                    dy2 = -5.5f,
                )
                close()
            }
            // M28.5 7 h-8.969 c-0.829 0 -1.5 0.671 -1.5 1.5 s0.671 1.5 1.5 1.5 h5.348 l-7 6.879 L20 19 l7 -6.879 V17.5 c0 0.828 0.672 1.5 1.5 1.5 s1.5 -0.672 1.5 -1.5 v-9 c0 -0.829 -0.672 -1.5 -1.5 -1.5z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 28.5 7
                moveTo(x = 28.5f, y = 7.0f)
                // h -8.969
                horizontalLineToRelative(dx = -8.969f)
                // c -0.829 0 -1.5 0.671 -1.5 1.5
                curveToRelative(
                    dx1 = -0.829f,
                    dy1 = 0.0f,
                    dx2 = -1.5f,
                    dy2 = 0.671f,
                    dx3 = -1.5f,
                    dy3 = 1.5f,
                )
                // s 0.671 1.5 1.5 1.5
                reflectiveCurveToRelative(
                    dx1 = 0.671f,
                    dy1 = 1.5f,
                    dx2 = 1.5f,
                    dy2 = 1.5f,
                )
                // h 5.348
                horizontalLineToRelative(dx = 5.348f)
                // l -7 6.879
                lineToRelative(dx = -7.0f, dy = 6.879f)
                // L 20 19
                lineTo(x = 20.0f, y = 19.0f)
                // l 7 -6.879
                lineToRelative(dx = 7.0f, dy = -6.879f)
                // V 17.5
                verticalLineTo(y = 17.5f)
                // c 0 0.828 0.672 1.5 1.5 1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.828f,
                    dx2 = 0.672f,
                    dy2 = 1.5f,
                    dx3 = 1.5f,
                    dy3 = 1.5f,
                )
                // s 1.5 -0.672 1.5 -1.5
                reflectiveCurveToRelative(
                    dx1 = 1.5f,
                    dy1 = -0.672f,
                    dx2 = 1.5f,
                    dy2 = -1.5f,
                )
                // v -9
                verticalLineToRelative(dy = -9.0f)
                // c 0 -0.829 -0.672 -1.5 -1.5 -1.5z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.829f,
                    dx2 = -0.672f,
                    dy2 = -1.5f,
                    dx3 = -1.5f,
                    dy3 = -1.5f,
                )
                close()
            }
        }.build().also { _emoji2642 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji2642: ImageVector? = null
