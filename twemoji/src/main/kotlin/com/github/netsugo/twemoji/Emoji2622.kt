package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji2622: ImageVector
    get() {
        val current = _emoji2622
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji2622",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M18 18 m-17 0 a17 17 0 1 1 34 0 a17 17 0 1 1 -34 0
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 18 18
                moveTo(x = 18.0f, y = 18.0f)
                // m -17 0
                moveToRelative(dx = -17.0f, dy = 0.0f)
                // a 17 17 0 1 1 34 0
                arcToRelative(
                    a = 17.0f,
                    b = 17.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 34.0f,
                    dy1 = 0.0f,
                )
                // a 17 17 0 1 1 -34 0
                arcToRelative(
                    a = 17.0f,
                    b = 17.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -34.0f,
                    dy1 = 0.0f,
                )
            }
            // M15.272 21.598 l-3.85 6.427 c0.278 0.183 0.561 0.36 0.854 0.519 C13.978 29.472 15.929 30 18 30 c2.078 0 4.033 -0.532 5.739 -1.464 0.293 -0.16 0.576 -0.336 0.854 -0.519 l-3.855 -6.427 c-0.763 0.583 -1.704 0.942 -2.738 0.942 -1.029 0 -1.967 -0.356 -2.728 -0.934z M16.119 13.888 l-3.854 -6.425 c-0.293 0.16 -0.577 0.336 -0.854 0.52 -3.124 2.062 -5.22 5.543 -5.385 9.518 -0.008 0.166 -0.026 0.33 -0.026 0.499 s0.018 0.333 0.025 0.5 h7.493 c-0.018 -0.166 -0.05 -0.329 -0.05 -0.5 0 -1.829 1.09 -3.396 2.651 -4.112z M22.532 18 c0 0.171 -0.032 0.334 -0.05 0.5 h7.493 c0.007 -0.167 0.025 -0.331 0.025 -0.5 s-0.018 -0.333 -0.025 -0.5 c-0.165 -3.974 -2.26 -7.454 -5.382 -9.516 -0.278 -0.183 -0.561 -0.359 -0.854 -0.52 l-3.85 6.427 c1.556 0.718 2.643 2.282 2.643 4.109z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 15.272 21.598
                moveTo(x = 15.272f, y = 21.598f)
                // l -3.85 6.427
                lineToRelative(dx = -3.85f, dy = 6.427f)
                // c 0.278 0.183 0.561 0.36 0.854 0.519
                curveToRelative(
                    dx1 = 0.278f,
                    dy1 = 0.183f,
                    dx2 = 0.561f,
                    dy2 = 0.36f,
                    dx3 = 0.854f,
                    dy3 = 0.519f,
                )
                // C 13.978 29.472 15.929 30 18 30
                curveTo(
                    x1 = 13.978f,
                    y1 = 29.472f,
                    x2 = 15.929f,
                    y2 = 30.0f,
                    x3 = 18.0f,
                    y3 = 30.0f,
                )
                // c 2.078 0 4.033 -0.532 5.739 -1.464
                curveToRelative(
                    dx1 = 2.078f,
                    dy1 = 0.0f,
                    dx2 = 4.033f,
                    dy2 = -0.532f,
                    dx3 = 5.739f,
                    dy3 = -1.464f,
                )
                // c 0.293 -0.16 0.576 -0.336 0.854 -0.519
                curveToRelative(
                    dx1 = 0.293f,
                    dy1 = -0.16f,
                    dx2 = 0.576f,
                    dy2 = -0.336f,
                    dx3 = 0.854f,
                    dy3 = -0.519f,
                )
                // l -3.855 -6.427
                lineToRelative(dx = -3.855f, dy = -6.427f)
                // c -0.763 0.583 -1.704 0.942 -2.738 0.942
                curveToRelative(
                    dx1 = -0.763f,
                    dy1 = 0.583f,
                    dx2 = -1.704f,
                    dy2 = 0.942f,
                    dx3 = -2.738f,
                    dy3 = 0.942f,
                )
                // c -1.029 0 -1.967 -0.356 -2.728 -0.934z
                curveToRelative(
                    dx1 = -1.029f,
                    dy1 = 0.0f,
                    dx2 = -1.967f,
                    dy2 = -0.356f,
                    dx3 = -2.728f,
                    dy3 = -0.934f,
                )
                close()
                // M 16.119 13.888
                moveTo(x = 16.119f, y = 13.888f)
                // l -3.854 -6.425
                lineToRelative(dx = -3.854f, dy = -6.425f)
                // c -0.293 0.16 -0.577 0.336 -0.854 0.52
                curveToRelative(
                    dx1 = -0.293f,
                    dy1 = 0.16f,
                    dx2 = -0.577f,
                    dy2 = 0.336f,
                    dx3 = -0.854f,
                    dy3 = 0.52f,
                )
                // c -3.124 2.062 -5.22 5.543 -5.385 9.518
                curveToRelative(
                    dx1 = -3.124f,
                    dy1 = 2.062f,
                    dx2 = -5.22f,
                    dy2 = 5.543f,
                    dx3 = -5.385f,
                    dy3 = 9.518f,
                )
                // c -0.008 0.166 -0.026 0.33 -0.026 0.499
                curveToRelative(
                    dx1 = -0.008f,
                    dy1 = 0.166f,
                    dx2 = -0.026f,
                    dy2 = 0.33f,
                    dx3 = -0.026f,
                    dy3 = 0.499f,
                )
                // s 0.018 0.333 0.025 0.5
                reflectiveCurveToRelative(
                    dx1 = 0.018f,
                    dy1 = 0.333f,
                    dx2 = 0.025f,
                    dy2 = 0.5f,
                )
                // h 7.493
                horizontalLineToRelative(dx = 7.493f)
                // c -0.018 -0.166 -0.05 -0.329 -0.05 -0.5
                curveToRelative(
                    dx1 = -0.018f,
                    dy1 = -0.166f,
                    dx2 = -0.05f,
                    dy2 = -0.329f,
                    dx3 = -0.05f,
                    dy3 = -0.5f,
                )
                // c 0 -1.829 1.09 -3.396 2.651 -4.112z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.829f,
                    dx2 = 1.09f,
                    dy2 = -3.396f,
                    dx3 = 2.651f,
                    dy3 = -4.112f,
                )
                close()
                // M 22.532 18
                moveTo(x = 22.532f, y = 18.0f)
                // c 0 0.171 -0.032 0.334 -0.05 0.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.171f,
                    dx2 = -0.032f,
                    dy2 = 0.334f,
                    dx3 = -0.05f,
                    dy3 = 0.5f,
                )
                // h 7.493
                horizontalLineToRelative(dx = 7.493f)
                // c 0.007 -0.167 0.025 -0.331 0.025 -0.5
                curveToRelative(
                    dx1 = 0.007f,
                    dy1 = -0.167f,
                    dx2 = 0.025f,
                    dy2 = -0.331f,
                    dx3 = 0.025f,
                    dy3 = -0.5f,
                )
                // s -0.018 -0.333 -0.025 -0.5
                reflectiveCurveToRelative(
                    dx1 = -0.018f,
                    dy1 = -0.333f,
                    dx2 = -0.025f,
                    dy2 = -0.5f,
                )
                // c -0.165 -3.974 -2.26 -7.454 -5.382 -9.516
                curveToRelative(
                    dx1 = -0.165f,
                    dy1 = -3.974f,
                    dx2 = -2.26f,
                    dy2 = -7.454f,
                    dx3 = -5.382f,
                    dy3 = -9.516f,
                )
                // c -0.278 -0.183 -0.561 -0.359 -0.854 -0.52
                curveToRelative(
                    dx1 = -0.278f,
                    dy1 = -0.183f,
                    dx2 = -0.561f,
                    dy2 = -0.359f,
                    dx3 = -0.854f,
                    dy3 = -0.52f,
                )
                // l -3.85 6.427
                lineToRelative(dx = -3.85f, dy = 6.427f)
                // c 1.556 0.718 2.643 2.282 2.643 4.109z
                curveToRelative(
                    dx1 = 1.556f,
                    dy1 = 0.718f,
                    dx2 = 2.643f,
                    dy2 = 2.282f,
                    dx3 = 2.643f,
                    dy3 = 4.109f,
                )
                close()
            }
            // M18 18 m-2 0 a2 2 0 1 1 4 0 a2 2 0 1 1 -4 0
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 18 18
                moveTo(x = 18.0f, y = 18.0f)
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
        }.build().also { _emoji2622 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji2622: ImageVector? = null
