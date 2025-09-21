package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f42e: ImageVector
    get() {
        val current = _emoji1f42e
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f42e",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M4 8 s-4 2 -4 11 c0 0 6 -1 7 -3 0 0 2 -12.25 -3 -8z M31.995 8.043 s4 2 4 11 c0 0 -6 -0.999 -7 -2.999 0 0 -2 -12.251 3 -8.001z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 4 8
                moveTo(x = 4.0f, y = 8.0f)
                // s -4 2 -4 11
                reflectiveCurveToRelative(
                    dx1 = -4.0f,
                    dy1 = 2.0f,
                    dx2 = -4.0f,
                    dy2 = 11.0f,
                )
                // c 0 0 6 -1 7 -3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 6.0f,
                    dy2 = -1.0f,
                    dx3 = 7.0f,
                    dy3 = -3.0f,
                )
                // c 0 0 2 -12.25 -3 -8z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = -12.25f,
                    dx3 = -3.0f,
                    dy3 = -8.0f,
                )
                close()
                // M 31.995 8.043
                moveTo(x = 31.995f, y = 8.043f)
                // s 4 2 4 11
                reflectiveCurveToRelative(
                    dx1 = 4.0f,
                    dy1 = 2.0f,
                    dx2 = 4.0f,
                    dy2 = 11.0f,
                )
                // c 0 0 -6 -0.999 -7 -2.999
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -6.0f,
                    dy2 = -0.999f,
                    dx3 = -7.0f,
                    dy3 = -2.999f,
                )
                // c 0 0 -2 -12.251 3 -8.001z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -12.251f,
                    dx3 = 3.0f,
                    dy3 = -8.001f,
                )
                close()
            }
            // M1 1 c-1.01 0.99 1 8 5 9 s4 -5 3 -5 C5 5 3.042 -1 1 1z M35.297 1 c1.011 0.99 -1 8 -5 9 s-4 -5 -3 -5 c4 0 5.959 -6 8 -4z
            path(
                fill = SolidColor(Color(0xFFFFE8B6)),
            ) {
                // M 1 1
                moveTo(x = 1.0f, y = 1.0f)
                // c -1.01 0.99 1 8 5 9
                curveToRelative(
                    dx1 = -1.01f,
                    dy1 = 0.99f,
                    dx2 = 1.0f,
                    dy2 = 8.0f,
                    dx3 = 5.0f,
                    dy3 = 9.0f,
                )
                // s 4 -5 3 -5
                reflectiveCurveToRelative(
                    dx1 = 4.0f,
                    dy1 = -5.0f,
                    dx2 = 3.0f,
                    dy2 = -5.0f,
                )
                // C 5 5 3.042 -1 1 1z
                curveTo(
                    x1 = 5.0f,
                    y1 = 5.0f,
                    x2 = 3.042f,
                    y2 = -1.0f,
                    x3 = 1.0f,
                    y3 = 1.0f,
                )
                close()
                // M 35.297 1
                moveTo(x = 35.297f, y = 1.0f)
                // c 1.011 0.99 -1 8 -5 9
                curveToRelative(
                    dx1 = 1.011f,
                    dy1 = 0.99f,
                    dx2 = -1.0f,
                    dy2 = 8.0f,
                    dx3 = -5.0f,
                    dy3 = 9.0f,
                )
                // s -4 -5 -3 -5
                reflectiveCurveToRelative(
                    dx1 = -4.0f,
                    dy1 = -5.0f,
                    dx2 = -3.0f,
                    dy2 = -5.0f,
                )
                // c 4 0 5.959 -6 8 -4z
                curveToRelative(
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                    dx2 = 5.959f,
                    dy2 = -6.0f,
                    dx3 = 8.0f,
                    dy3 = -4.0f,
                )
                close()
            }
            // M21.976 31 h-7.951 C8.488 31 4 26.512 4 20.976 v-8.951 C4 6.488 8.488 2 14.025 2 h7.951 C27.512 2 32 6.488 32 12.025 v8.951 C32 26.512 27.512 31 21.976 31z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 21.976 31
                moveTo(x = 21.976f, y = 31.0f)
                // h -7.951
                horizontalLineToRelative(dx = -7.951f)
                // C 8.488 31 4 26.512 4 20.976
                curveTo(
                    x1 = 8.488f,
                    y1 = 31.0f,
                    x2 = 4.0f,
                    y2 = 26.512f,
                    x3 = 4.0f,
                    y3 = 20.976f,
                )
                // v -8.951
                verticalLineToRelative(dy = -8.951f)
                // C 4 6.488 8.488 2 14.025 2
                curveTo(
                    x1 = 4.0f,
                    y1 = 6.488f,
                    x2 = 8.488f,
                    y2 = 2.0f,
                    x3 = 14.025f,
                    y3 = 2.0f,
                )
                // h 7.951
                horizontalLineToRelative(dx = 7.951f)
                // C 27.512 2 32 6.488 32 12.025
                curveTo(
                    x1 = 27.512f,
                    y1 = 2.0f,
                    x2 = 32.0f,
                    y2 = 6.488f,
                    x3 = 32.0f,
                    y3 = 12.025f,
                )
                // v 8.951
                verticalLineToRelative(dy = 8.951f)
                // C 32 26.512 27.512 31 21.976 31z
                curveTo(
                    x1 = 32.0f,
                    y1 = 26.512f,
                    x2 = 27.512f,
                    y2 = 31.0f,
                    x3 = 21.976f,
                    y3 = 31.0f,
                )
                close()
            }
            // M35 28 c0 5.522 -4.478 8 -10 8 H11 c-5.523 0 -10 -2.478 -10 -8 s4.477 -10 10 -10 h14 c5.522 0 10 4.478 10 10z
            path(
                fill = SolidColor(Color(0xFFE6AAAA)),
            ) {
                // M 35 28
                moveTo(x = 35.0f, y = 28.0f)
                // c 0 5.522 -4.478 8 -10 8
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 5.522f,
                    dx2 = -4.478f,
                    dy2 = 8.0f,
                    dx3 = -10.0f,
                    dy3 = 8.0f,
                )
                // H 11
                horizontalLineTo(x = 11.0f)
                // c -5.523 0 -10 -2.478 -10 -8
                curveToRelative(
                    dx1 = -5.523f,
                    dy1 = 0.0f,
                    dx2 = -10.0f,
                    dy2 = -2.478f,
                    dx3 = -10.0f,
                    dy3 = -8.0f,
                )
                // s 4.477 -10 10 -10
                reflectiveCurveToRelative(
                    dx1 = 4.477f,
                    dy1 = -10.0f,
                    dx2 = 10.0f,
                    dy2 = -10.0f,
                )
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // c 5.522 0 10 4.478 10 10z
                curveToRelative(
                    dx1 = 5.522f,
                    dy1 = 0.0f,
                    dx2 = 10.0f,
                    dy2 = 4.478f,
                    dx3 = 10.0f,
                    dy3 = 10.0f,
                )
                close()
            }
            // M8 26 a1.5 3 0 1 0 3 0 a1.5 3 0 1 0 -3 0z
            path(
                fill = SolidColor(Color(0xFFC1694F)),
            ) {
                // M 8 26
                moveTo(x = 8.0f, y = 26.0f)
                // a 1.5 3 0 1 0 3 0
                arcToRelative(
                    a = 1.5f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 3.0f,
                    dy1 = 0.0f,
                )
                // a 1.5 3 0 1 0 -3 0z
                arcToRelative(
                    a = 1.5f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M25 26 a1.5 3 0 1 0 3 0 a1.5 3 0 1 0 -3 0z
            path(
                fill = SolidColor(Color(0xFFC1694F)),
            ) {
                // M 25 26
                moveTo(x = 25.0f, y = 26.0f)
                // a 1.5 3 0 1 0 3 0
                arcToRelative(
                    a = 1.5f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 3.0f,
                    dy1 = 0.0f,
                )
                // a 1.5 3 0 1 0 -3 0z
                arcToRelative(
                    a = 1.5f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M11 12 s0 -2 2 -2 2 2 2 2 v2 s0 2 -2 2 -2 -2 -2 -2 v-2z M21 12 s0 -2 2 -2 2 2 2 2 v2 s0 2 -2 2 -2 -2 -2 -2 v-2z
            path(
                fill = SolidColor(Color(0xFF272B2B)),
            ) {
                // M 11 12
                moveTo(x = 11.0f, y = 12.0f)
                // s 0 -2 2 -2
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // s 2 2 2 2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // s 0 2 -2 2
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                    dx2 = -2.0f,
                    dy2 = 2.0f,
                )
                // s -2 -2 -2 -2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                    dx2 = -2.0f,
                    dy2 = -2.0f,
                )
                // v -2z
                verticalLineToRelative(dy = -2.0f)
                close()
                // M 21 12
                moveTo(x = 21.0f, y = 12.0f)
                // s 0 -2 2 -2
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // s 2 2 2 2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // s 0 2 -2 2
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                    dx2 = -2.0f,
                    dy2 = 2.0f,
                )
                // s -2 -2 -2 -2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                    dx2 = -2.0f,
                    dy2 = -2.0f,
                )
                // v -2z
                verticalLineToRelative(dy = -2.0f)
                close()
            }
        }.build().also { _emoji1f42e = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f42e: ImageVector? = null
