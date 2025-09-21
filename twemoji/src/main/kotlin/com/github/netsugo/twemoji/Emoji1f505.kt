package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f505: ImageVector
    get() {
        val current = _emoji1f505
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f505",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M18 8 C12.477 8 8 12.477 8 18 s4.477 10 10 10 10 -4.477 10 -10 S23.523 8 18 8z M18 24 c-3.314 0 -6 -2.685 -6 -6 0 -3.313 2.686 -6 6 -6 s6 2.687 6 6 c0 3.315 -2.687 6 -6 6z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 18 8
                moveTo(x = 18.0f, y = 8.0f)
                // C 12.477 8 8 12.477 8 18
                curveTo(
                    x1 = 12.477f,
                    y1 = 8.0f,
                    x2 = 8.0f,
                    y2 = 12.477f,
                    x3 = 8.0f,
                    y3 = 18.0f,
                )
                // s 4.477 10 10 10
                reflectiveCurveToRelative(
                    dx1 = 4.477f,
                    dy1 = 10.0f,
                    dx2 = 10.0f,
                    dy2 = 10.0f,
                )
                // s 10 -4.477 10 -10
                reflectiveCurveToRelative(
                    dx1 = 10.0f,
                    dy1 = -4.477f,
                    dx2 = 10.0f,
                    dy2 = -10.0f,
                )
                // S 23.523 8 18 8z
                reflectiveCurveTo(
                    x1 = 23.523f,
                    y1 = 8.0f,
                    x2 = 18.0f,
                    y2 = 8.0f,
                )
                close()
                // M 18 24
                moveTo(x = 18.0f, y = 24.0f)
                // c -3.314 0 -6 -2.685 -6 -6
                curveToRelative(
                    dx1 = -3.314f,
                    dy1 = 0.0f,
                    dx2 = -6.0f,
                    dy2 = -2.685f,
                    dx3 = -6.0f,
                    dy3 = -6.0f,
                )
                // c 0 -3.313 2.686 -6 6 -6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.313f,
                    dx2 = 2.686f,
                    dy2 = -6.0f,
                    dx3 = 6.0f,
                    dy3 = -6.0f,
                )
                // s 6 2.687 6 6
                reflectiveCurveToRelative(
                    dx1 = 6.0f,
                    dy1 = 2.687f,
                    dx2 = 6.0f,
                    dy2 = 6.0f,
                )
                // c 0 3.315 -2.687 6 -6 6z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.315f,
                    dx2 = -2.687f,
                    dy2 = 6.0f,
                    dx3 = -6.0f,
                    dy3 = 6.0f,
                )
                close()
            }
            // M18 5 m-2 0 a2 2 0 1 1 4 0 a2 2 0 1 1 -4 0
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 18 5
                moveTo(x = 18.0f, y = 5.0f)
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
            // M18 31 m-2 0 a2 2 0 1 1 4 0 a2 2 0 1 1 -4 0
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 18 31
                moveTo(x = 18.0f, y = 31.0f)
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
            // M10.222 7.394 c-0.781 -0.781 -2.047 -0.781 -2.828 0 -0.781 0.781 -0.781 2.047 0 2.829 0.781 0.781 2.047 0.781 2.828 0 0.781 -0.782 0.781 -2.048 0 -2.829z M28.606 25.778 c0.781 0.78 0.781 2.048 0 2.828 -0.781 0.781 -2.047 0.78 -2.828 0 -0.781 -0.781 -0.781 -2.047 0 -2.828 0.782 -0.78 2.047 -0.781 2.828 0z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 10.222 7.394
                moveTo(x = 10.222f, y = 7.394f)
                // c -0.781 -0.781 -2.047 -0.781 -2.828 0
                curveToRelative(
                    dx1 = -0.781f,
                    dy1 = -0.781f,
                    dx2 = -2.047f,
                    dy2 = -0.781f,
                    dx3 = -2.828f,
                    dy3 = 0.0f,
                )
                // c -0.781 0.781 -0.781 2.047 0 2.829
                curveToRelative(
                    dx1 = -0.781f,
                    dy1 = 0.781f,
                    dx2 = -0.781f,
                    dy2 = 2.047f,
                    dx3 = 0.0f,
                    dy3 = 2.829f,
                )
                // c 0.781 0.781 2.047 0.781 2.828 0
                curveToRelative(
                    dx1 = 0.781f,
                    dy1 = 0.781f,
                    dx2 = 2.047f,
                    dy2 = 0.781f,
                    dx3 = 2.828f,
                    dy3 = 0.0f,
                )
                // c 0.781 -0.782 0.781 -2.048 0 -2.829z
                curveToRelative(
                    dx1 = 0.781f,
                    dy1 = -0.782f,
                    dx2 = 0.781f,
                    dy2 = -2.048f,
                    dx3 = 0.0f,
                    dy3 = -2.829f,
                )
                close()
                // M 28.606 25.778
                moveTo(x = 28.606f, y = 25.778f)
                // c 0.781 0.78 0.781 2.048 0 2.828
                curveToRelative(
                    dx1 = 0.781f,
                    dy1 = 0.78f,
                    dx2 = 0.781f,
                    dy2 = 2.048f,
                    dx3 = 0.0f,
                    dy3 = 2.828f,
                )
                // c -0.781 0.781 -2.047 0.78 -2.828 0
                curveToRelative(
                    dx1 = -0.781f,
                    dy1 = 0.781f,
                    dx2 = -2.047f,
                    dy2 = 0.78f,
                    dx3 = -2.828f,
                    dy3 = 0.0f,
                )
                // c -0.781 -0.781 -0.781 -2.047 0 -2.828
                curveToRelative(
                    dx1 = -0.781f,
                    dy1 = -0.781f,
                    dx2 = -0.781f,
                    dy2 = -2.047f,
                    dx3 = 0.0f,
                    dy3 = -2.828f,
                )
                // c 0.782 -0.78 2.047 -0.781 2.828 0z
                curveToRelative(
                    dx1 = 0.782f,
                    dy1 = -0.78f,
                    dx2 = 2.047f,
                    dy2 = -0.781f,
                    dx3 = 2.828f,
                    dy3 = 0.0f,
                )
                close()
            }
            // M5 18 m-2 0 a2 2 0 1 1 4 0 a2 2 0 1 1 -4 0
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 5 18
                moveTo(x = 5.0f, y = 18.0f)
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
            // M31 18 m-2 0 a2 2 0 1 1 4 0 a2 2 0 1 1 -4 0
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 31 18
                moveTo(x = 31.0f, y = 18.0f)
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
            // M28.605 10.222 c0.781 -0.781 0.781 -2.047 0.001 -2.828 -0.781 -0.781 -2.048 -0.781 -2.829 0 -0.78 0.781 -0.781 2.047 0 2.828 0.782 0.781 2.048 0.781 2.828 0z M10.222 28.606 c-0.781 0.781 -2.047 0.781 -2.828 0 -0.781 -0.781 -0.781 -2.047 0 -2.828 0.781 -0.781 2.047 -0.781 2.828 0 0.78 0.782 0.781 2.047 0 2.828z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 28.605 10.222
                moveTo(x = 28.605f, y = 10.222f)
                // c 0.781 -0.781 0.781 -2.047 0.001 -2.828
                curveToRelative(
                    dx1 = 0.781f,
                    dy1 = -0.781f,
                    dx2 = 0.781f,
                    dy2 = -2.047f,
                    dx3 = 0.001f,
                    dy3 = -2.828f,
                )
                // c -0.781 -0.781 -2.048 -0.781 -2.829 0
                curveToRelative(
                    dx1 = -0.781f,
                    dy1 = -0.781f,
                    dx2 = -2.048f,
                    dy2 = -0.781f,
                    dx3 = -2.829f,
                    dy3 = 0.0f,
                )
                // c -0.78 0.781 -0.781 2.047 0 2.828
                curveToRelative(
                    dx1 = -0.78f,
                    dy1 = 0.781f,
                    dx2 = -0.781f,
                    dy2 = 2.047f,
                    dx3 = 0.0f,
                    dy3 = 2.828f,
                )
                // c 0.782 0.781 2.048 0.781 2.828 0z
                curveToRelative(
                    dx1 = 0.782f,
                    dy1 = 0.781f,
                    dx2 = 2.048f,
                    dy2 = 0.781f,
                    dx3 = 2.828f,
                    dy3 = 0.0f,
                )
                close()
                // M 10.222 28.606
                moveTo(x = 10.222f, y = 28.606f)
                // c -0.781 0.781 -2.047 0.781 -2.828 0
                curveToRelative(
                    dx1 = -0.781f,
                    dy1 = 0.781f,
                    dx2 = -2.047f,
                    dy2 = 0.781f,
                    dx3 = -2.828f,
                    dy3 = 0.0f,
                )
                // c -0.781 -0.781 -0.781 -2.047 0 -2.828
                curveToRelative(
                    dx1 = -0.781f,
                    dy1 = -0.781f,
                    dx2 = -0.781f,
                    dy2 = -2.047f,
                    dx3 = 0.0f,
                    dy3 = -2.828f,
                )
                // c 0.781 -0.781 2.047 -0.781 2.828 0
                curveToRelative(
                    dx1 = 0.781f,
                    dy1 = -0.781f,
                    dx2 = 2.047f,
                    dy2 = -0.781f,
                    dx3 = 2.828f,
                    dy3 = 0.0f,
                )
                // c 0.78 0.782 0.781 2.047 0 2.828z
                curveToRelative(
                    dx1 = 0.78f,
                    dy1 = 0.782f,
                    dx2 = 0.781f,
                    dy2 = 2.047f,
                    dx3 = 0.0f,
                    dy3 = 2.828f,
                )
                close()
            }
        }.build().also { _emoji1f505 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f505: ImageVector? = null
