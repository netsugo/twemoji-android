package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f97a: ImageVector
    get() {
        val current = _emoji1f97a
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f97a",
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
            // M20.996 28.477 a0.978 0.978 0 0 1 -0.309 -0.049 8.647 8.647 0 0 0 -5.375 0 1 1 0 1 1 -0.617 -1.902 10.633 10.633 0 0 1 6.609 0 c0.525 0.172 0.813 0.736 0.643 1.26 a1.002 1.002 0 0 1 -0.951 0.691Z M28.994 10.011 A1.005 1.005 0 0 0 28.011 9 c-0.067 -0.001 -1.653 -0.056 -3.304 -1.707 a1 1 0 1 0 -1.414 1.414 C25.56 10.974 27.901 11 28 11 a0.995 0.995 0 0 0 0.994 -0.989Z M12.707 8.707 a0.998 0.998 0 0 0 -0.324 -1.63 1 1 0 0 0 -1.09 0.216 C9.652 8.934 8.075 8.998 7.99 9 A1 1 0 0 0 8 11 c0.099 0 2.44 -0.026 4.707 -2.293Z
            path(
                fill = SolidColor(Color(0xFF65471B)),
            ) {
                // M 20.996 28.477
                moveTo(x = 20.996f, y = 28.477f)
                // a 0.978 0.978 0 0 1 -0.309 -0.049
                arcToRelative(
                    a = 0.978f,
                    b = 0.978f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.309f,
                    dy1 = -0.049f,
                )
                // a 8.647 8.647 0 0 0 -5.375 0
                arcToRelative(
                    a = 8.647f,
                    b = 8.647f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -5.375f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 1 1 -0.617 -1.902
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -0.617f,
                    dy1 = -1.902f,
                )
                // a 10.633 10.633 0 0 1 6.609 0
                arcToRelative(
                    a = 10.633f,
                    b = 10.633f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 6.609f,
                    dy1 = 0.0f,
                )
                // c 0.525 0.172 0.813 0.736 0.643 1.26
                curveToRelative(
                    dx1 = 0.525f,
                    dy1 = 0.172f,
                    dx2 = 0.813f,
                    dy2 = 0.736f,
                    dx3 = 0.643f,
                    dy3 = 1.26f,
                )
                // a 1.002 1.002 0 0 1 -0.951 0.691z
                arcToRelative(
                    a = 1.002f,
                    b = 1.002f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.951f,
                    dy1 = 0.691f,
                )
                close()
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
        }.build().also { _emoji1f97a = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f97a: ImageVector? = null
