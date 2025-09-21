package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji26f3: ImageVector
    get() {
        val current = _emoji26f3
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji26f3",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M4 36 h28 c2 0 3.731 -2 3.731 -4 0 -4.355 -4.634 -11 -17.731 -11 C4.508 21 0.193 27.459 0.193 32 0.193 34 2 36 4 36z
            path(
                fill = SolidColor(Color(0xFF77B255)),
            ) {
                // M 4 36
                moveTo(x = 4.0f, y = 36.0f)
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // c 2 0 3.731 -2 3.731 -4
                curveToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                    dx2 = 3.731f,
                    dy2 = -2.0f,
                    dx3 = 3.731f,
                    dy3 = -4.0f,
                )
                // c 0 -4.355 -4.634 -11 -17.731 -11
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.355f,
                    dx2 = -4.634f,
                    dy2 = -11.0f,
                    dx3 = -17.731f,
                    dy3 = -11.0f,
                )
                // C 4.508 21 0.193 27.459 0.193 32
                curveTo(
                    x1 = 4.508f,
                    y1 = 21.0f,
                    x2 = 0.193f,
                    y2 = 27.459f,
                    x3 = 0.193f,
                    y3 = 32.0f,
                )
                // C 0.193 34 2 36 4 36z
                curveTo(
                    x1 = 0.193f,
                    y1 = 34.0f,
                    x2 = 2.0f,
                    y2 = 36.0f,
                    x3 = 4.0f,
                    y3 = 36.0f,
                )
                close()
            }
            // M11.292 29.5 s0.958 0.667 1.958 0.667 c2.208 -4.875 13 -7.5 14 -7.5 0.15 0 0.33 -0.018 0.512 -0.047 -0.716 -0.28 -1.502 -0.521 -2.33 -0.737 -4.626 0.063 -13.031 3.917 -14.14 7.617z
            path(
                fill = SolidColor(Color(0xFF5C913B)),
            ) {
                // M 11.292 29.5
                moveTo(x = 11.292f, y = 29.5f)
                // s 0.958 0.667 1.958 0.667
                reflectiveCurveToRelative(
                    dx1 = 0.958f,
                    dy1 = 0.667f,
                    dx2 = 1.958f,
                    dy2 = 0.667f,
                )
                // c 2.208 -4.875 13 -7.5 14 -7.5
                curveToRelative(
                    dx1 = 2.208f,
                    dy1 = -4.875f,
                    dx2 = 13.0f,
                    dy2 = -7.5f,
                    dx3 = 14.0f,
                    dy3 = -7.5f,
                )
                // c 0.15 0 0.33 -0.018 0.512 -0.047
                curveToRelative(
                    dx1 = 0.15f,
                    dy1 = 0.0f,
                    dx2 = 0.33f,
                    dy2 = -0.018f,
                    dx3 = 0.512f,
                    dy3 = -0.047f,
                )
                // c -0.716 -0.28 -1.502 -0.521 -2.33 -0.737
                curveToRelative(
                    dx1 = -0.716f,
                    dy1 = -0.28f,
                    dx2 = -1.502f,
                    dy2 = -0.521f,
                    dx3 = -2.33f,
                    dy3 = -0.737f,
                )
                // c -4.626 0.063 -13.031 3.917 -14.14 7.617z
                curveToRelative(
                    dx1 = -4.626f,
                    dy1 = 0.063f,
                    dx2 = -13.031f,
                    dy2 = 3.917f,
                    dx3 = -14.14f,
                    dy3 = 7.617f,
                )
                close()
            }
            // M6 30.5 a6.5 2.5 0 1 0 13 0 a6.5 2.5 0 1 0 -13 0z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 6 30.5
                moveTo(x = 6.0f, y = 30.5f)
                // a 6.5 2.5 0 1 0 13 0
                arcToRelative(
                    a = 6.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 13.0f,
                    dy1 = 0.0f,
                )
                // a 6.5 2.5 0 1 0 -13 0z
                arcToRelative(
                    a = 6.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -13.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M10 4 v26 c0 0.553 0.448 0.844 1 0.844 s1 -0.291 1 -0.844 V4 h-2z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 10 4
                moveTo(x = 10.0f, y = 4.0f)
                // v 26
                verticalLineToRelative(dy = 26.0f)
                // c 0 0.553 0.448 0.844 1 0.844
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = 0.448f,
                    dy2 = 0.844f,
                    dx3 = 1.0f,
                    dy3 = 0.844f,
                )
                // s 1 -0.291 1 -0.844
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = -0.291f,
                    dx2 = 1.0f,
                    dy2 = -0.844f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // M10 3 C10 0.8 11.695 -0.395 13.767 0.345 l9.466 3.381 c2.071 0.74 2.071 1.951 0 2.69 l-9.466 3.381 C11.695 10.538 10 9.343 10 7.143 V3z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 10 3
                moveTo(x = 10.0f, y = 3.0f)
                // C 10 0.8 11.695 -0.395 13.767 0.345
                curveTo(
                    x1 = 10.0f,
                    y1 = 0.8f,
                    x2 = 11.695f,
                    y2 = -0.395f,
                    x3 = 13.767f,
                    y3 = 0.345f,
                )
                // l 9.466 3.381
                lineToRelative(dx = 9.466f, dy = 3.381f)
                // c 2.071 0.74 2.071 1.951 0 2.69
                curveToRelative(
                    dx1 = 2.071f,
                    dy1 = 0.74f,
                    dx2 = 2.071f,
                    dy2 = 1.951f,
                    dx3 = 0.0f,
                    dy3 = 2.69f,
                )
                // l -9.466 3.381
                lineToRelative(dx = -9.466f, dy = 3.381f)
                // C 11.695 10.538 10 9.343 10 7.143
                curveTo(
                    x1 = 11.695f,
                    y1 = 10.538f,
                    x2 = 10.0f,
                    y2 = 9.343f,
                    x3 = 10.0f,
                    y3 = 7.143f,
                )
                // V 3z
                verticalLineTo(y = 3.0f)
                close()
            }
        }.build().also { _emoji26f3 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji26f3: ImageVector? = null
