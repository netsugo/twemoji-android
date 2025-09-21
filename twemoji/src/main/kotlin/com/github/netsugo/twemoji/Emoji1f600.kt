package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f600: ImageVector
    get() {
        val current = _emoji1f600
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f600",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M18 18 m-18 0 a18 18 0 1 1 36 0 a18 18 0 1 1 -36 0
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 18 18
                moveTo(x = 18.0f, y = 18.0f)
                // m -18 0
                moveToRelative(dx = -18.0f, dy = 0.0f)
                // a 18 18 0 1 1 36 0
                arcToRelative(
                    a = 18.0f,
                    b = 18.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 36.0f,
                    dy1 = 0.0f,
                )
                // a 18 18 0 1 1 -36 0
                arcToRelative(
                    a = 18.0f,
                    b = 18.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -36.0f,
                    dy1 = 0.0f,
                )
            }
            // M18 21 c-3.623 0 -6.027 -0.422 -9 -1 -0.679 -0.131 -2 0 -2 2 0 4 4.595 9 11 9 6.404 0 11 -5 11 -9 0 -2 -1.321 -2.132 -2 -2 -2.973 0.578 -5.377 1 -9 1z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 18 21
                moveTo(x = 18.0f, y = 21.0f)
                // c -3.623 0 -6.027 -0.422 -9 -1
                curveToRelative(
                    dx1 = -3.623f,
                    dy1 = 0.0f,
                    dx2 = -6.027f,
                    dy2 = -0.422f,
                    dx3 = -9.0f,
                    dy3 = -1.0f,
                )
                // c -0.679 -0.131 -2 0 -2 2
                curveToRelative(
                    dx1 = -0.679f,
                    dy1 = -0.131f,
                    dx2 = -2.0f,
                    dy2 = 0.0f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // c 0 4 4.595 9 11 9
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.0f,
                    dx2 = 4.595f,
                    dy2 = 9.0f,
                    dx3 = 11.0f,
                    dy3 = 9.0f,
                )
                // c 6.404 0 11 -5 11 -9
                curveToRelative(
                    dx1 = 6.404f,
                    dy1 = 0.0f,
                    dx2 = 11.0f,
                    dy2 = -5.0f,
                    dx3 = 11.0f,
                    dy3 = -9.0f,
                )
                // c 0 -2 -1.321 -2.132 -2 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                    dx2 = -1.321f,
                    dy2 = -2.132f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // c -2.973 0.578 -5.377 1 -9 1z
                curveToRelative(
                    dx1 = -2.973f,
                    dy1 = 0.578f,
                    dx2 = -5.377f,
                    dy2 = 1.0f,
                    dx3 = -9.0f,
                    dy3 = 1.0f,
                )
                close()
            }
            // M9 22 s3 1 9 1 9 -1 9 -1 -2 4 -9 4 -9 -4 -9 -4z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 9 22
                moveTo(x = 9.0f, y = 22.0f)
                // s 3 1 9 1
                reflectiveCurveToRelative(
                    dx1 = 3.0f,
                    dy1 = 1.0f,
                    dx2 = 9.0f,
                    dy2 = 1.0f,
                )
                // s 9 -1 9 -1
                reflectiveCurveToRelative(
                    dx1 = 9.0f,
                    dy1 = -1.0f,
                    dx2 = 9.0f,
                    dy2 = -1.0f,
                )
                // s -2 4 -9 4
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 4.0f,
                    dx2 = -9.0f,
                    dy2 = 4.0f,
                )
                // s -9 -4 -9 -4z
                reflectiveCurveToRelative(
                    dx1 = -9.0f,
                    dy1 = -4.0f,
                    dx2 = -9.0f,
                    dy2 = -4.0f,
                )
                close()
            }
            // M9.5 13.5 a2.5 3.5 0 1 0 5 0 a2.5 3.5 0 1 0 -5 0z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 9.5 13.5
                moveTo(x = 9.5f, y = 13.5f)
                // a 2.5 3.5 0 1 0 5 0
                arcToRelative(
                    a = 2.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // a 2.5 3.5 0 1 0 -5 0z
                arcToRelative(
                    a = 2.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -5.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M21.5 13.5 a2.5 3.5 0 1 0 5 0 a2.5 3.5 0 1 0 -5 0z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 21.5 13.5
                moveTo(x = 21.5f, y = 13.5f)
                // a 2.5 3.5 0 1 0 5 0
                arcToRelative(
                    a = 2.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // a 2.5 3.5 0 1 0 -5 0z
                arcToRelative(
                    a = 2.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -5.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _emoji1f600 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f600: ImageVector? = null
