package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f6ae: ImageVector
    get() {
        val current = _emoji1f6ae
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f6ae",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M0 4 c0 -4 4 -4 4 -4 h28 s4 0 4 4 v28 s0 4 -4 4 H4 s-4 0 -4 -4 V4z
            path(
                fill = SolidColor(Color(0xFF3B88C3)),
            ) {
                // M 0 4
                moveTo(x = 0.0f, y = 4.0f)
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
                // v 28
                verticalLineToRelative(dy = 28.0f)
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
                // V 4z
                verticalLineTo(y = 4.0f)
                close()
            }
            // M20 7.5 a3 3.5 0 1 0 6 0 a3 3.5 0 1 0 -6 0z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 20 7.5
                moveTo(x = 20.0f, y = 7.5f)
                // a 3 3.5 0 1 0 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // a 3 3.5 0 1 0 -6 0z
                arcToRelative(
                    a = 3.0f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M29 13 s0 -2 -2 -2 h-7 c-1 0 -2 1 -2 1 l-2 2 h-4 s-1 0 -1 1 1 1 1 1 h5 l2 -2 v17 s0 1 1 1 h1 s1 0 1 -1 v-8 s0 -1 1 -1 1 1 1 1 v8 s0 1 1 1 h1 s1 0 1 -1 v-9 s2 0 2 -2 v-7z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 29 13
                moveTo(x = 29.0f, y = 13.0f)
                // s 0 -2 -2 -2
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                    dx2 = -2.0f,
                    dy2 = -2.0f,
                )
                // h -7
                horizontalLineToRelative(dx = -7.0f)
                // c -1 0 -2 1 -2 1
                curveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = 1.0f,
                    dx3 = -2.0f,
                    dy3 = 1.0f,
                )
                // l -2 2
                lineToRelative(dx = -2.0f, dy = 2.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // s -1 0 -1 1
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                // s 1 1 1 1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                    dx2 = 1.0f,
                    dy2 = 1.0f,
                )
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // l 2 -2
                lineToRelative(dx = 2.0f, dy = -2.0f)
                // v 17
                verticalLineToRelative(dy = 17.0f)
                // s 0 1 1 1
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.0f,
                    dx2 = 1.0f,
                    dy2 = 1.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // s 1 0 1 -1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // s 0 -1 1 -1
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // s 1 1 1 1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                    dx2 = 1.0f,
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
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // s 1 0 1 -1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // v -9
                verticalLineToRelative(dy = -9.0f)
                // s 2 0 2 -2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // v -7z
                verticalLineToRelative(dy = -7.0f)
                close()
            }
            // M6 22 s-1 0 -1 -1 1 -1 1 -1 2 0 2 2 v8 h6 v-8 c0 -2 2 -2 2 -2 s1 0 1 1 -1 1 -1 1 v8 s0 2 -2 2 H8 s-2 0 -2 -2 v-8z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 6 22
                moveTo(x = 6.0f, y = 22.0f)
                // s -1 0 -1 -1
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                )
                // s 1 -1 1 -1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // s 2 0 2 2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                )
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // c 0 -2 2 -2 2 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // s 1 0 1 1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 1.0f,
                )
                // s -1 1 -1 1
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // s 0 2 -2 2
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                    dx2 = -2.0f,
                    dy2 = 2.0f,
                )
                // H 8
                horizontalLineTo(x = 8.0f)
                // s -2 0 -2 -2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -2.0f,
                )
                // v -8z
                verticalLineToRelative(dy = -8.0f)
                close()
            }
            // M11 20 m-2 0 a2 2 0 1 1 4 0 a2 2 0 1 1 -4 0
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 11 20
                moveTo(x = 11.0f, y = 20.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
            }
        }.build().also { _emoji1f6ae = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f6ae: ImageVector? = null
