package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f420: ImageVector
    get() {
        val current = _emoji1f420
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f420",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M8.231 10 c6 -8 14 -10 18 -10 1 0 1 1 0 1 s-6 2 -7 9 -11 0 -11 0z M7.231 28 c4 3 13 8 18 8 3 0 2 -1 1 -1 s-9 -3 -10 -7 -9 0 -9 0z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 8.231 10
                moveTo(x = 8.231f, y = 10.0f)
                // c 6 -8 14 -10 18 -10
                curveToRelative(
                    dx1 = 6.0f,
                    dy1 = -8.0f,
                    dx2 = 14.0f,
                    dy2 = -10.0f,
                    dx3 = 18.0f,
                    dy3 = -10.0f,
                )
                // c 1 0 1 1 0 1
                curveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 1.0f,
                    dx3 = 0.0f,
                    dy3 = 1.0f,
                )
                // s -6 2 -7 9
                reflectiveCurveToRelative(
                    dx1 = -6.0f,
                    dy1 = 2.0f,
                    dx2 = -7.0f,
                    dy2 = 9.0f,
                )
                // s -11 0 -11 0z
                reflectiveCurveToRelative(
                    dx1 = -11.0f,
                    dy1 = 0.0f,
                    dx2 = -11.0f,
                    dy2 = 0.0f,
                )
                close()
                // M 7.231 28
                moveTo(x = 7.231f, y = 28.0f)
                // c 4 3 13 8 18 8
                curveToRelative(
                    dx1 = 4.0f,
                    dy1 = 3.0f,
                    dx2 = 13.0f,
                    dy2 = 8.0f,
                    dx3 = 18.0f,
                    dy3 = 8.0f,
                )
                // c 3 0 2 -1 1 -1
                curveToRelative(
                    dx1 = 3.0f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // s -9 -3 -10 -7
                reflectiveCurveToRelative(
                    dx1 = -9.0f,
                    dy1 = -3.0f,
                    dx2 = -10.0f,
                    dy2 = -7.0f,
                )
                // s -9 0 -9 0z
                reflectiveCurveToRelative(
                    dx1 = -9.0f,
                    dy1 = 0.0f,
                    dx2 = -9.0f,
                    dy2 = 0.0f,
                )
                close()
            }
            // M35 9 c-1.611 0 -4.059 2.972 -5.268 6.294 -1.475 -5.62 -6.166 -10.739 -12.945 -10.739 -8.273 0 -12.061 10.216 -14.524 14.479 -0.629 1.091 -4.091 1.034 -0.989 3.103 -3.103 2.068 0.449 2.243 1.222 3.103 2.625 2.92 8.997 6.205 14.291 6.205 5.655 0 11.12 -3.786 12.863 -8.958 C30.828 25.896 33.353 29 35 29 c2.209 0 -2 -5.582 -2 -10 s4.209 -10 2 -10z
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 35 9
                moveTo(x = 35.0f, y = 9.0f)
                // c -1.611 0 -4.059 2.972 -5.268 6.294
                curveToRelative(
                    dx1 = -1.611f,
                    dy1 = 0.0f,
                    dx2 = -4.059f,
                    dy2 = 2.972f,
                    dx3 = -5.268f,
                    dy3 = 6.294f,
                )
                // c -1.475 -5.62 -6.166 -10.739 -12.945 -10.739
                curveToRelative(
                    dx1 = -1.475f,
                    dy1 = -5.62f,
                    dx2 = -6.166f,
                    dy2 = -10.739f,
                    dx3 = -12.945f,
                    dy3 = -10.739f,
                )
                // c -8.273 0 -12.061 10.216 -14.524 14.479
                curveToRelative(
                    dx1 = -8.273f,
                    dy1 = 0.0f,
                    dx2 = -12.061f,
                    dy2 = 10.216f,
                    dx3 = -14.524f,
                    dy3 = 14.479f,
                )
                // c -0.629 1.091 -4.091 1.034 -0.989 3.103
                curveToRelative(
                    dx1 = -0.629f,
                    dy1 = 1.091f,
                    dx2 = -4.091f,
                    dy2 = 1.034f,
                    dx3 = -0.989f,
                    dy3 = 3.103f,
                )
                // c -3.103 2.068 0.449 2.243 1.222 3.103
                curveToRelative(
                    dx1 = -3.103f,
                    dy1 = 2.068f,
                    dx2 = 0.449f,
                    dy2 = 2.243f,
                    dx3 = 1.222f,
                    dy3 = 3.103f,
                )
                // c 2.625 2.92 8.997 6.205 14.291 6.205
                curveToRelative(
                    dx1 = 2.625f,
                    dy1 = 2.92f,
                    dx2 = 8.997f,
                    dy2 = 6.205f,
                    dx3 = 14.291f,
                    dy3 = 6.205f,
                )
                // c 5.655 0 11.12 -3.786 12.863 -8.958
                curveToRelative(
                    dx1 = 5.655f,
                    dy1 = 0.0f,
                    dx2 = 11.12f,
                    dy2 = -3.786f,
                    dx3 = 12.863f,
                    dy3 = -8.958f,
                )
                // C 30.828 25.896 33.353 29 35 29
                curveTo(
                    x1 = 30.828f,
                    y1 = 25.896f,
                    x2 = 33.353f,
                    y2 = 29.0f,
                    x3 = 35.0f,
                    y3 = 29.0f,
                )
                // c 2.209 0 -2 -5.582 -2 -10
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -5.582f,
                    dx3 = -2.0f,
                    dy3 = -10.0f,
                )
                // s 4.209 -10 2 -10z
                reflectiveCurveToRelative(
                    dx1 = 4.209f,
                    dy1 = -10.0f,
                    dx2 = 2.0f,
                    dy2 = -10.0f,
                )
                close()
            }
            // M18.001 17.967 c-0.019 0.552 0.414 1.015 0.966 1.032 l0.034 0.001 c0.536 0 0.98 -0.426 0.998 -0.967 0.201 -6.065 5.758 -8.816 6.35 -9.092 -0.466 -0.525 -0.968 -1.018 -1.51 -1.467 -1.885 1.057 -6.634 4.323 -6.838 10.493z M23.019 15.804 c-0.108 0.542 0.243 1.068 0.784 1.177 0.067 0.013 0.132 0.019 0.198 0.019 0.467 0 0.885 -0.329 0.98 -0.804 0.516 -2.581 2.296 -3.574 3.592 -3.956 -0.305 -0.609 -0.645 -1.202 -1.028 -1.768 -1.877 0.691 -3.908 2.246 -4.526 5.332z
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 18.001 17.967
                moveTo(x = 18.001f, y = 17.967f)
                // c -0.019 0.552 0.414 1.015 0.966 1.032
                curveToRelative(
                    dx1 = -0.019f,
                    dy1 = 0.552f,
                    dx2 = 0.414f,
                    dy2 = 1.015f,
                    dx3 = 0.966f,
                    dy3 = 1.032f,
                )
                // l 0.034 0.001
                lineToRelative(dx = 0.034f, dy = 0.001f)
                // c 0.536 0 0.98 -0.426 0.998 -0.967
                curveToRelative(
                    dx1 = 0.536f,
                    dy1 = 0.0f,
                    dx2 = 0.98f,
                    dy2 = -0.426f,
                    dx3 = 0.998f,
                    dy3 = -0.967f,
                )
                // c 0.201 -6.065 5.758 -8.816 6.35 -9.092
                curveToRelative(
                    dx1 = 0.201f,
                    dy1 = -6.065f,
                    dx2 = 5.758f,
                    dy2 = -8.816f,
                    dx3 = 6.35f,
                    dy3 = -9.092f,
                )
                // c -0.466 -0.525 -0.968 -1.018 -1.51 -1.467
                curveToRelative(
                    dx1 = -0.466f,
                    dy1 = -0.525f,
                    dx2 = -0.968f,
                    dy2 = -1.018f,
                    dx3 = -1.51f,
                    dy3 = -1.467f,
                )
                // c -1.885 1.057 -6.634 4.323 -6.838 10.493z
                curveToRelative(
                    dx1 = -1.885f,
                    dy1 = 1.057f,
                    dx2 = -6.634f,
                    dy2 = 4.323f,
                    dx3 = -6.838f,
                    dy3 = 10.493f,
                )
                close()
                // M 23.019 15.804
                moveTo(x = 23.019f, y = 15.804f)
                // c -0.108 0.542 0.243 1.068 0.784 1.177
                curveToRelative(
                    dx1 = -0.108f,
                    dy1 = 0.542f,
                    dx2 = 0.243f,
                    dy2 = 1.068f,
                    dx3 = 0.784f,
                    dy3 = 1.177f,
                )
                // c 0.067 0.013 0.132 0.019 0.198 0.019
                curveToRelative(
                    dx1 = 0.067f,
                    dy1 = 0.013f,
                    dx2 = 0.132f,
                    dy2 = 0.019f,
                    dx3 = 0.198f,
                    dy3 = 0.019f,
                )
                // c 0.467 0 0.885 -0.329 0.98 -0.804
                curveToRelative(
                    dx1 = 0.467f,
                    dy1 = 0.0f,
                    dx2 = 0.885f,
                    dy2 = -0.329f,
                    dx3 = 0.98f,
                    dy3 = -0.804f,
                )
                // c 0.516 -2.581 2.296 -3.574 3.592 -3.956
                curveToRelative(
                    dx1 = 0.516f,
                    dy1 = -2.581f,
                    dx2 = 2.296f,
                    dy2 = -3.574f,
                    dx3 = 3.592f,
                    dy3 = -3.956f,
                )
                // c -0.305 -0.609 -0.645 -1.202 -1.028 -1.768
                curveToRelative(
                    dx1 = -0.305f,
                    dy1 = -0.609f,
                    dx2 = -0.645f,
                    dy2 = -1.202f,
                    dx3 = -1.028f,
                    dy3 = -1.768f,
                )
                // c -1.877 0.691 -3.908 2.246 -4.526 5.332z
                curveToRelative(
                    dx1 = -1.877f,
                    dy1 = 0.691f,
                    dx2 = -3.908f,
                    dy2 = 2.246f,
                    dx3 = -4.526f,
                    dy3 = 5.332f,
                )
                close()
            }
            // M13 20 c0 0.553 0.448 1 1 1 s1 -0.447 1 -1 c0 -8.97 5.841 -12.544 8.266 -13.641 -0.693 -0.419 -1.424 -0.785 -2.205 -1.067 C17.888 7.169 13 11.446 13 20z
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 13 20
                moveTo(x = 13.0f, y = 20.0f)
                // c 0 0.553 0.448 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = 0.448f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // s 1 -0.447 1 -1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = -0.447f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // c 0 -8.97 5.841 -12.544 8.266 -13.641
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -8.97f,
                    dx2 = 5.841f,
                    dy2 = -12.544f,
                    dx3 = 8.266f,
                    dy3 = -13.641f,
                )
                // c -0.693 -0.419 -1.424 -0.785 -2.205 -1.067
                curveToRelative(
                    dx1 = -0.693f,
                    dy1 = -0.419f,
                    dx2 = -1.424f,
                    dy2 = -0.785f,
                    dx3 = -2.205f,
                    dy3 = -1.067f,
                )
                // C 17.888 7.169 13 11.446 13 20z
                curveTo(
                    x1 = 17.888f,
                    y1 = 7.169f,
                    x2 = 13.0f,
                    y2 = 11.446f,
                    x3 = 13.0f,
                    y3 = 20.0f,
                )
                close()
            }
            // M9.5 15.5 m-1.5 0 a1.5 1.5 0 1 1 3 0 a1.5 1.5 0 1 1 -3 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 9.5 15.5
                moveTo(x = 9.5f, y = 15.5f)
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
        }.build().also { _emoji1f420 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f420: ImageVector? = null
