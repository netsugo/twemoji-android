package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f979: ImageVector
    get() {
        val current = _emoji1f979
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f979",
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
            // M22.657 25.637 a0.513 0.513 0 0 1 0.597 -0.06 0.497 0.497 0 0 1 0.231 0.544 C23.474 26.165 22.34 30.5 18 30.5 s-5.474 -4.335 -5.484 -4.38 a0.5 0.5 0 0 1 0.838 -0.474 s1.005 0.854 4.646 0.854 c3.644 0 4.647 -0.855 4.657 -0.863Z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 22.657 25.637
                moveTo(x = 22.657f, y = 25.637f)
                // a 0.513 0.513 0 0 1 0.597 -0.06
                arcToRelative(
                    a = 0.513f,
                    b = 0.513f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.597f,
                    dy1 = -0.06f,
                )
                // a 0.497 0.497 0 0 1 0.231 0.544
                arcToRelative(
                    a = 0.497f,
                    b = 0.497f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.231f,
                    dy1 = 0.544f,
                )
                // C 23.474 26.165 22.34 30.5 18 30.5
                curveTo(
                    x1 = 23.474f,
                    y1 = 26.165f,
                    x2 = 22.34f,
                    y2 = 30.5f,
                    x3 = 18.0f,
                    y3 = 30.5f,
                )
                // s -5.474 -4.335 -5.484 -4.38
                reflectiveCurveToRelative(
                    dx1 = -5.474f,
                    dy1 = -4.335f,
                    dx2 = -5.484f,
                    dy2 = -4.38f,
                )
                // a 0.5 0.5 0 0 1 0.838 -0.474
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.838f,
                    dy1 = -0.474f,
                )
                // s 1.005 0.854 4.646 0.854
                reflectiveCurveToRelative(
                    dx1 = 1.005f,
                    dy1 = 0.854f,
                    dx2 = 4.646f,
                    dy2 = 0.854f,
                )
                // c 3.644 0 4.647 -0.855 4.657 -0.863z
                curveToRelative(
                    dx1 = 3.644f,
                    dy1 = 0.0f,
                    dx2 = 4.647f,
                    dy2 = -0.855f,
                    dx3 = 4.657f,
                    dy3 = -0.863f,
                )
                close()
            }
            // M28.994 10.011 A1.005 1.005 0 0 0 28.011 9 c-0.067 -0.001 -1.653 -0.056 -3.304 -1.707 a1 1 0 1 0 -1.414 1.414 C25.56 10.974 27.901 11 28 11 a0.995 0.995 0 0 0 0.994 -0.989Z M12.707 8.707 a0.998 0.998 0 0 0 -0.324 -1.63 1 1 0 0 0 -1.09 0.216 C9.652 8.934 8.075 8.998 7.99 9 A1 1 0 0 0 8 11 c0.099 0 2.44 -0.026 4.707 -2.293Z
            path(
                fill = SolidColor(Color(0xFF65471B)),
            ) {
                // M 28.994 10.011
                moveTo(x = 28.994f, y = 10.011f)
                // A 1.005 1.005 0 0 0 28.011 9
                arcTo(
                    horizontalEllipseRadius = 1.005f,
                    verticalEllipseRadius = 1.005f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 28.011f,
                    y1 = 9.0f,
                )
                // c -0.067 -0.001 -1.653 -0.056 -3.304 -1.707
                curveToRelative(
                    dx1 = -0.067f,
                    dy1 = -0.001f,
                    dx2 = -1.653f,
                    dy2 = -0.056f,
                    dx3 = -3.304f,
                    dy3 = -1.707f,
                )
                // a 1 1 0 1 0 -1.414 1.414
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -1.414f,
                    dy1 = 1.414f,
                )
                // C 25.56 10.974 27.901 11 28 11
                curveTo(
                    x1 = 25.56f,
                    y1 = 10.974f,
                    x2 = 27.901f,
                    y2 = 11.0f,
                    x3 = 28.0f,
                    y3 = 11.0f,
                )
                // a 0.995 0.995 0 0 0 0.994 -0.989z
                arcToRelative(
                    a = 0.995f,
                    b = 0.995f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.994f,
                    dy1 = -0.989f,
                )
                close()
                // M 12.707 8.707
                moveTo(x = 12.707f, y = 8.707f)
                // a 0.998 0.998 0 0 0 -0.324 -1.63
                arcToRelative(
                    a = 0.998f,
                    b = 0.998f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.324f,
                    dy1 = -1.63f,
                )
                // a 1 1 0 0 0 -1.09 0.216
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.09f,
                    dy1 = 0.216f,
                )
                // C 9.652 8.934 8.075 8.998 7.99 9
                curveTo(
                    x1 = 9.652f,
                    y1 = 8.934f,
                    x2 = 8.075f,
                    y2 = 8.998f,
                    x3 = 7.99f,
                    y3 = 9.0f,
                )
                // A 1 1 0 0 0 8 11
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 8.0f,
                    y1 = 11.0f,
                )
                // c 0.099 0 2.44 -0.026 4.707 -2.293z
                curveToRelative(
                    dx1 = 0.099f,
                    dy1 = 0.0f,
                    dx2 = 2.44f,
                    dy2 = -0.026f,
                    dx3 = 4.707f,
                    dy3 = -2.293f,
                )
                close()
            }
            // M24.5 23 a5.5 5.5 0 1 0 0 -11 5.5 5.5 0 0 0 0 11Z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 24.5 23
                moveTo(x = 24.5f, y = 23.0f)
                // a 5.5 5.5 0 1 0 0 -11
                arcToRelative(
                    a = 5.5f,
                    b = 5.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -11.0f,
                )
                // a 5.5 5.5 0 0 0 0 11z
                arcToRelative(
                    a = 5.5f,
                    b = 5.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 11.0f,
                )
                close()
            }
            // M24.5 22 a5 5 0 1 0 0 -10 5 5 0 0 0 0 10Z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 24.5 22
                moveTo(x = 24.5f, y = 22.0f)
                // a 5 5 0 1 0 0 -10
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -10.0f,
                )
                // a 5 5 0 0 0 0 10z
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 10.0f,
                )
                close()
            }
            // M24.337 16.836 c1.044 -1.046 1.23 -2.552 0.417 -3.364 -0.813 -0.813 -2.32 -0.625 -3.363 0.42 -1.045 1.046 -1.231 2.552 -0.418 3.364 0.814 0.813 2.32 0.625 3.364 -0.42Z M27.625 19.681 c0.458 -0.459 0.54 -1.12 0.183 -1.477 -0.357 -0.357 -1.019 -0.274 -1.478 0.185 -0.458 0.459 -0.54 1.12 -0.183 1.477 0.357 0.357 1.019 0.275 1.478 -0.184Z M11.5 23 a5.5 5.5 0 1 0 0 -11 5.5 5.5 0 0 0 0 11Z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 24.337 16.836
                moveTo(x = 24.337f, y = 16.836f)
                // c 1.044 -1.046 1.23 -2.552 0.417 -3.364
                curveToRelative(
                    dx1 = 1.044f,
                    dy1 = -1.046f,
                    dx2 = 1.23f,
                    dy2 = -2.552f,
                    dx3 = 0.417f,
                    dy3 = -3.364f,
                )
                // c -0.813 -0.813 -2.32 -0.625 -3.363 0.42
                curveToRelative(
                    dx1 = -0.813f,
                    dy1 = -0.813f,
                    dx2 = -2.32f,
                    dy2 = -0.625f,
                    dx3 = -3.363f,
                    dy3 = 0.42f,
                )
                // c -1.045 1.046 -1.231 2.552 -0.418 3.364
                curveToRelative(
                    dx1 = -1.045f,
                    dy1 = 1.046f,
                    dx2 = -1.231f,
                    dy2 = 2.552f,
                    dx3 = -0.418f,
                    dy3 = 3.364f,
                )
                // c 0.814 0.813 2.32 0.625 3.364 -0.42z
                curveToRelative(
                    dx1 = 0.814f,
                    dy1 = 0.813f,
                    dx2 = 2.32f,
                    dy2 = 0.625f,
                    dx3 = 3.364f,
                    dy3 = -0.42f,
                )
                close()
                // M 27.625 19.681
                moveTo(x = 27.625f, y = 19.681f)
                // c 0.458 -0.459 0.54 -1.12 0.183 -1.477
                curveToRelative(
                    dx1 = 0.458f,
                    dy1 = -0.459f,
                    dx2 = 0.54f,
                    dy2 = -1.12f,
                    dx3 = 0.183f,
                    dy3 = -1.477f,
                )
                // c -0.357 -0.357 -1.019 -0.274 -1.478 0.185
                curveToRelative(
                    dx1 = -0.357f,
                    dy1 = -0.357f,
                    dx2 = -1.019f,
                    dy2 = -0.274f,
                    dx3 = -1.478f,
                    dy3 = 0.185f,
                )
                // c -0.458 0.459 -0.54 1.12 -0.183 1.477
                curveToRelative(
                    dx1 = -0.458f,
                    dy1 = 0.459f,
                    dx2 = -0.54f,
                    dy2 = 1.12f,
                    dx3 = -0.183f,
                    dy3 = 1.477f,
                )
                // c 0.357 0.357 1.019 0.275 1.478 -0.184z
                curveToRelative(
                    dx1 = 0.357f,
                    dy1 = 0.357f,
                    dx2 = 1.019f,
                    dy2 = 0.275f,
                    dx3 = 1.478f,
                    dy3 = -0.184f,
                )
                close()
                // M 11.5 23
                moveTo(x = 11.5f, y = 23.0f)
                // a 5.5 5.5 0 1 0 0 -11
                arcToRelative(
                    a = 5.5f,
                    b = 5.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -11.0f,
                )
                // a 5.5 5.5 0 0 0 0 11z
                arcToRelative(
                    a = 5.5f,
                    b = 5.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 11.0f,
                )
                close()
            }
            // M11.5 22 a5 5 0 1 0 0 -10 5 5 0 0 0 0 10Z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 11.5 22
                moveTo(x = 11.5f, y = 22.0f)
                // a 5 5 0 1 0 0 -10
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -10.0f,
                )
                // a 5 5 0 0 0 0 10z
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 10.0f,
                )
                close()
            }
            // M11.337 16.836 c1.044 -1.046 1.23 -2.552 0.417 -3.364 -0.813 -0.813 -2.32 -0.625 -3.363 0.42 -1.045 1.046 -1.231 2.552 -0.418 3.364 0.814 0.813 2.32 0.625 3.364 -0.42Z M14.624 19.681 c0.46 -0.459 0.541 -1.12 0.184 -1.477 -0.357 -0.357 -1.019 -0.274 -1.478 0.185 -0.458 0.459 -0.54 1.12 -0.183 1.477 0.357 0.357 1.019 0.275 1.477 -0.184Z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 11.337 16.836
                moveTo(x = 11.337f, y = 16.836f)
                // c 1.044 -1.046 1.23 -2.552 0.417 -3.364
                curveToRelative(
                    dx1 = 1.044f,
                    dy1 = -1.046f,
                    dx2 = 1.23f,
                    dy2 = -2.552f,
                    dx3 = 0.417f,
                    dy3 = -3.364f,
                )
                // c -0.813 -0.813 -2.32 -0.625 -3.363 0.42
                curveToRelative(
                    dx1 = -0.813f,
                    dy1 = -0.813f,
                    dx2 = -2.32f,
                    dy2 = -0.625f,
                    dx3 = -3.363f,
                    dy3 = 0.42f,
                )
                // c -1.045 1.046 -1.231 2.552 -0.418 3.364
                curveToRelative(
                    dx1 = -1.045f,
                    dy1 = 1.046f,
                    dx2 = -1.231f,
                    dy2 = 2.552f,
                    dx3 = -0.418f,
                    dy3 = 3.364f,
                )
                // c 0.814 0.813 2.32 0.625 3.364 -0.42z
                curveToRelative(
                    dx1 = 0.814f,
                    dy1 = 0.813f,
                    dx2 = 2.32f,
                    dy2 = 0.625f,
                    dx3 = 3.364f,
                    dy3 = -0.42f,
                )
                close()
                // M 14.624 19.681
                moveTo(x = 14.624f, y = 19.681f)
                // c 0.46 -0.459 0.541 -1.12 0.184 -1.477
                curveToRelative(
                    dx1 = 0.46f,
                    dy1 = -0.459f,
                    dx2 = 0.541f,
                    dy2 = -1.12f,
                    dx3 = 0.184f,
                    dy3 = -1.477f,
                )
                // c -0.357 -0.357 -1.019 -0.274 -1.478 0.185
                curveToRelative(
                    dx1 = -0.357f,
                    dy1 = -0.357f,
                    dx2 = -1.019f,
                    dy2 = -0.274f,
                    dx3 = -1.478f,
                    dy3 = 0.185f,
                )
                // c -0.458 0.459 -0.54 1.12 -0.183 1.477
                curveToRelative(
                    dx1 = -0.458f,
                    dy1 = 0.459f,
                    dx2 = -0.54f,
                    dy2 = 1.12f,
                    dx3 = -0.183f,
                    dy3 = 1.477f,
                )
                // c 0.357 0.357 1.019 0.275 1.477 -0.184z
                curveToRelative(
                    dx1 = 0.357f,
                    dy1 = 0.357f,
                    dx2 = 1.019f,
                    dy2 = 0.275f,
                    dx3 = 1.477f,
                    dy3 = -0.184f,
                )
                close()
            }
            // M29 21 c0 0.105 -1.015 2 -4.5 2 -3.485 0 -4.5 -1.895 -4.5 -2 -2 -3.105 2.015 0 4.5 0 s6.5 -3.105 4.5 0Z M16 21 c0 0.105 -1.015 2 -4.5 2 C8.015 23 7 21.105 7 21 c-2 -3.105 2.015 0 4.5 0 s6.5 -3.105 4.5 0Z
            path(
                fill = SolidColor(Color(0xFF5DADEC)),
            ) {
                // M 29 21
                moveTo(x = 29.0f, y = 21.0f)
                // c 0 0.105 -1.015 2 -4.5 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.105f,
                    dx2 = -1.015f,
                    dy2 = 2.0f,
                    dx3 = -4.5f,
                    dy3 = 2.0f,
                )
                // c -3.485 0 -4.5 -1.895 -4.5 -2
                curveToRelative(
                    dx1 = -3.485f,
                    dy1 = 0.0f,
                    dx2 = -4.5f,
                    dy2 = -1.895f,
                    dx3 = -4.5f,
                    dy3 = -2.0f,
                )
                // c -2 -3.105 2.015 0 4.5 0
                curveToRelative(
                    dx1 = -2.0f,
                    dy1 = -3.105f,
                    dx2 = 2.015f,
                    dy2 = 0.0f,
                    dx3 = 4.5f,
                    dy3 = 0.0f,
                )
                // s 6.5 -3.105 4.5 0z
                reflectiveCurveToRelative(
                    dx1 = 6.5f,
                    dy1 = -3.105f,
                    dx2 = 4.5f,
                    dy2 = 0.0f,
                )
                close()
                // M 16 21
                moveTo(x = 16.0f, y = 21.0f)
                // c 0 0.105 -1.015 2 -4.5 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.105f,
                    dx2 = -1.015f,
                    dy2 = 2.0f,
                    dx3 = -4.5f,
                    dy3 = 2.0f,
                )
                // C 8.015 23 7 21.105 7 21
                curveTo(
                    x1 = 8.015f,
                    y1 = 23.0f,
                    x2 = 7.0f,
                    y2 = 21.105f,
                    x3 = 7.0f,
                    y3 = 21.0f,
                )
                // c -2 -3.105 2.015 0 4.5 0
                curveToRelative(
                    dx1 = -2.0f,
                    dy1 = -3.105f,
                    dx2 = 2.015f,
                    dy2 = 0.0f,
                    dx3 = 4.5f,
                    dy3 = 0.0f,
                )
                // s 6.5 -3.105 4.5 0z
                reflectiveCurveToRelative(
                    dx1 = 6.5f,
                    dy1 = -3.105f,
                    dx2 = 4.5f,
                    dy2 = 0.0f,
                )
                close()
            }
        }.build().also { _emoji1f979 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f979: ImageVector? = null
