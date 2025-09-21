package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f4fa: ImageVector
    get() {
        val current = _emoji1f4fa
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f4fa",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M35 31 s0 4 -4 4 H5 c-4 0 -4 -4 -4 -4 V12 c0 -4 4 -4 4 -4 h26 s4 0 4 4 v19z
            path(
                fill = SolidColor(Color(0xFF31373D)),
            ) {
                // M 35 31
                moveTo(x = 35.0f, y = 31.0f)
                // s 0 4 -4 4
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.0f,
                    dx2 = -4.0f,
                    dy2 = 4.0f,
                )
                // H 5
                horizontalLineTo(x = 5.0f)
                // c -4 0 -4 -4 -4 -4
                curveToRelative(
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = -4.0f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                // V 12
                verticalLineTo(y = 12.0f)
                // c 0 -4 4 -4 4 -4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.0f,
                    dx2 = 4.0f,
                    dy2 = -4.0f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // h 26
                horizontalLineToRelative(dx = 26.0f)
                // s 4 0 4 4
                reflectiveCurveToRelative(
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = 4.0f,
                )
                // v 19z
                verticalLineToRelative(dy = 19.0f)
                close()
            }
            // M21.303 10.389 c0.391 0.391 0.391 1.023 0 1.414 s-1.023 0.391 -1.414 0 l-9.192 -9.192 c-0.391 -0.391 -0.391 -1.023 0 -1.414 s1.023 -0.391 1.414 0 l9.192 9.192z
            path(
                fill = SolidColor(Color(0xFF31373D)),
            ) {
                // M 21.303 10.389
                moveTo(x = 21.303f, y = 10.389f)
                // c 0.391 0.391 0.391 1.023 0 1.414
                curveToRelative(
                    dx1 = 0.391f,
                    dy1 = 0.391f,
                    dx2 = 0.391f,
                    dy2 = 1.023f,
                    dx3 = 0.0f,
                    dy3 = 1.414f,
                )
                // s -1.023 0.391 -1.414 0
                reflectiveCurveToRelative(
                    dx1 = -1.023f,
                    dy1 = 0.391f,
                    dx2 = -1.414f,
                    dy2 = 0.0f,
                )
                // l -9.192 -9.192
                lineToRelative(dx = -9.192f, dy = -9.192f)
                // c -0.391 -0.391 -0.391 -1.023 0 -1.414
                curveToRelative(
                    dx1 = -0.391f,
                    dy1 = -0.391f,
                    dx2 = -0.391f,
                    dy2 = -1.023f,
                    dx3 = 0.0f,
                    dy3 = -1.414f,
                )
                // s 1.023 -0.391 1.414 0
                reflectiveCurveToRelative(
                    dx1 = 1.023f,
                    dy1 = -0.391f,
                    dx2 = 1.414f,
                    dy2 = 0.0f,
                )
                // l 9.192 9.192z
                lineToRelative(dx = 9.192f, dy = 9.192f)
                close()
            }
            // M14.697 10.389 c-0.391 0.391 -0.391 1.023 0 1.414 s1.023 0.391 1.414 0 l9.192 -9.192 c0.391 -0.391 0.391 -1.023 0 -1.414 s-1.023 -0.391 -1.414 0 l-9.192 9.192z
            path(
                fill = SolidColor(Color(0xFF31373D)),
            ) {
                // M 14.697 10.389
                moveTo(x = 14.697f, y = 10.389f)
                // c -0.391 0.391 -0.391 1.023 0 1.414
                curveToRelative(
                    dx1 = -0.391f,
                    dy1 = 0.391f,
                    dx2 = -0.391f,
                    dy2 = 1.023f,
                    dx3 = 0.0f,
                    dy3 = 1.414f,
                )
                // s 1.023 0.391 1.414 0
                reflectiveCurveToRelative(
                    dx1 = 1.023f,
                    dy1 = 0.391f,
                    dx2 = 1.414f,
                    dy2 = 0.0f,
                )
                // l 9.192 -9.192
                lineToRelative(dx = 9.192f, dy = -9.192f)
                // c 0.391 -0.391 0.391 -1.023 0 -1.414
                curveToRelative(
                    dx1 = 0.391f,
                    dy1 = -0.391f,
                    dx2 = 0.391f,
                    dy2 = -1.023f,
                    dx3 = 0.0f,
                    dy3 = -1.414f,
                )
                // s -1.023 -0.391 -1.414 0
                reflectiveCurveToRelative(
                    dx1 = -1.023f,
                    dy1 = -0.391f,
                    dx2 = -1.414f,
                    dy2 = 0.0f,
                )
                // l -9.192 9.192z
                lineToRelative(dx = -9.192f, dy = 9.192f)
                close()
            }
            // M18 11 c8 0 10 1 11 2 s2 3 2 8 -1 7 -2 8 -3 2 -11 2 -10 -1 -11 -2 -2 -3 -2 -8 1 -7 2 -8 3 -2 11 -2z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 18 11
                moveTo(x = 18.0f, y = 11.0f)
                // c 8 0 10 1 11 2
                curveToRelative(
                    dx1 = 8.0f,
                    dy1 = 0.0f,
                    dx2 = 10.0f,
                    dy2 = 1.0f,
                    dx3 = 11.0f,
                    dy3 = 2.0f,
                )
                // s 2 3 2 8
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 3.0f,
                    dx2 = 2.0f,
                    dy2 = 8.0f,
                )
                // s -1 7 -2 8
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 7.0f,
                    dx2 = -2.0f,
                    dy2 = 8.0f,
                )
                // s -3 2 -11 2
                reflectiveCurveToRelative(
                    dx1 = -3.0f,
                    dy1 = 2.0f,
                    dx2 = -11.0f,
                    dy2 = 2.0f,
                )
                // s -10 -1 -11 -2
                reflectiveCurveToRelative(
                    dx1 = -10.0f,
                    dy1 = -1.0f,
                    dx2 = -11.0f,
                    dy2 = -2.0f,
                )
                // s -2 -3 -2 -8
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = -3.0f,
                    dx2 = -2.0f,
                    dy2 = -8.0f,
                )
                // s 1 -7 2 -8
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = -7.0f,
                    dx2 = 2.0f,
                    dy2 = -8.0f,
                )
                // s 3 -2 11 -2z
                reflectiveCurveToRelative(
                    dx1 = 3.0f,
                    dy1 = -2.0f,
                    dx2 = 11.0f,
                    dy2 = -2.0f,
                )
                close()
            }
            // M31.5 31.5 m-1.5 0 a1.5 1.5 0 1 1 3 0 a1.5 1.5 0 1 1 -3 0
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 31.5 31.5
                moveTo(x = 31.5f, y = 31.5f)
                // m -1.5 0
                moveToRelative(dx = -1.5f, dy = 0.0f)
                // a 1.5 1.5 0 1 1 3 0
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = 0.0f,
                )
                // a 1.5 1.5 0 1 1 -3 0
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = 0.0f,
                )
            }
            // M4.5 31.5 m-1.5 0 a1.5 1.5 0 1 1 3 0 a1.5 1.5 0 1 1 -3 0
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 4.5 31.5
                moveTo(x = 4.5f, y = 31.5f)
                // m -1.5 0
                moveToRelative(dx = -1.5f, dy = 0.0f)
                // a 1.5 1.5 0 1 1 3 0
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = 0.0f,
                )
                // a 1.5 1.5 0 1 1 -3 0
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = 0.0f,
                )
            }
        }.build().also { _emoji1f4fa = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f4fa: ImageVector? = null
