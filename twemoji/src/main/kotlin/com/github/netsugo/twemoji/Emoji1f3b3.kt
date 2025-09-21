package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f3b3: ImageVector
    get() {
        val current = _emoji1f3b3
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f3b3",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M22 10 c0 -1 1 -3 1 -5 s0 -3 -1 -4 -2 -1 -2 -1 -1 0 -2 1 -1 2 -1 4 1 4 1 5 c0 3 -4 5 -4 9.084 C14 22.417 16 29 17 31 h6 c1 -2 3 -8.583 3 -11.916 C26 15 22 13 22 10z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 22 10
                moveTo(x = 22.0f, y = 10.0f)
                // c 0 -1 1 -3 1 -5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -3.0f,
                    dx3 = 1.0f,
                    dy3 = -5.0f,
                )
                // s 0 -3 -1 -4
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.0f,
                    dx2 = -1.0f,
                    dy2 = -4.0f,
                )
                // s -2 -1 -2 -1
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = -1.0f,
                    dx2 = -2.0f,
                    dy2 = -1.0f,
                )
                // s -1 0 -2 1
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = 1.0f,
                )
                // s -1 2 -1 4
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 2.0f,
                    dx2 = -1.0f,
                    dy2 = 4.0f,
                )
                // s 1 4 1 5
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = 4.0f,
                    dx2 = 1.0f,
                    dy2 = 5.0f,
                )
                // c 0 3 -4 5 -4 9.084
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.0f,
                    dx2 = -4.0f,
                    dy2 = 5.0f,
                    dx3 = -4.0f,
                    dy3 = 9.084f,
                )
                // C 14 22.417 16 29 17 31
                curveTo(
                    x1 = 14.0f,
                    y1 = 22.417f,
                    x2 = 16.0f,
                    y2 = 29.0f,
                    x3 = 17.0f,
                    y3 = 31.0f,
                )
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // c 1 -2 3 -8.583 3 -11.916
                curveToRelative(
                    dx1 = 1.0f,
                    dy1 = -2.0f,
                    dx2 = 3.0f,
                    dy2 = -8.583f,
                    dx3 = 3.0f,
                    dy3 = -11.916f,
                )
                // C 26 15 22 13 22 10z
                curveTo(
                    x1 = 26.0f,
                    y1 = 15.0f,
                    x2 = 22.0f,
                    y2 = 13.0f,
                    x3 = 22.0f,
                    y3 = 10.0f,
                )
                close()
            }
            // M18 10 h4 c0 -0.475 0.227 -1.18 0.464 -2 h-4.927 c0.236 0.82 0.463 1.525 0.463 2z M23.902 14 c-0.494 -0.681 -0.976 -1.333 -1.332 -2 h-5.139 c-0.357 0.667 -0.839 1.319 -1.332 2 h7.803z
            path(
                fill = SolidColor(Color(0xFFBE1931)),
            ) {
                // M 18 10
                moveTo(x = 18.0f, y = 10.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // c 0 -0.475 0.227 -1.18 0.464 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.475f,
                    dx2 = 0.227f,
                    dy2 = -1.18f,
                    dx3 = 0.464f,
                    dy3 = -2.0f,
                )
                // h -4.927
                horizontalLineToRelative(dx = -4.927f)
                // c 0.236 0.82 0.463 1.525 0.463 2z
                curveToRelative(
                    dx1 = 0.236f,
                    dy1 = 0.82f,
                    dx2 = 0.463f,
                    dy2 = 1.525f,
                    dx3 = 0.463f,
                    dy3 = 2.0f,
                )
                close()
                // M 23.902 14
                moveTo(x = 23.902f, y = 14.0f)
                // c -0.494 -0.681 -0.976 -1.333 -1.332 -2
                curveToRelative(
                    dx1 = -0.494f,
                    dy1 = -0.681f,
                    dx2 = -0.976f,
                    dy2 = -1.333f,
                    dx3 = -1.332f,
                    dy3 = -2.0f,
                )
                // h -5.139
                horizontalLineToRelative(dx = -5.139f)
                // c -0.357 0.667 -0.839 1.319 -1.332 2
                curveToRelative(
                    dx1 = -0.357f,
                    dy1 = 0.667f,
                    dx2 = -0.839f,
                    dy2 = 1.319f,
                    dx3 = -1.332f,
                    dy3 = 2.0f,
                )
                // h 7.803z
                horizontalLineToRelative(dx = 7.803f)
                close()
            }
            // M32 13 c0 -1 1 -3 1 -5 s0 -3 -1 -4 -2 -1 -2 -1 -1 0 -2 1 -1 2 -1 4 1 4 1 5 c0 3 -4 5 -4 9.084 C24 25.417 26 32 27 34 h6 c1 -2 3 -8.583 3 -11.916 C36 18 32 16 32 13z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 32 13
                moveTo(x = 32.0f, y = 13.0f)
                // c 0 -1 1 -3 1 -5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -3.0f,
                    dx3 = 1.0f,
                    dy3 = -5.0f,
                )
                // s 0 -3 -1 -4
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.0f,
                    dx2 = -1.0f,
                    dy2 = -4.0f,
                )
                // s -2 -1 -2 -1
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = -1.0f,
                    dx2 = -2.0f,
                    dy2 = -1.0f,
                )
                // s -1 0 -2 1
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = 1.0f,
                )
                // s -1 2 -1 4
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 2.0f,
                    dx2 = -1.0f,
                    dy2 = 4.0f,
                )
                // s 1 4 1 5
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = 4.0f,
                    dx2 = 1.0f,
                    dy2 = 5.0f,
                )
                // c 0 3 -4 5 -4 9.084
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.0f,
                    dx2 = -4.0f,
                    dy2 = 5.0f,
                    dx3 = -4.0f,
                    dy3 = 9.084f,
                )
                // C 24 25.417 26 32 27 34
                curveTo(
                    x1 = 24.0f,
                    y1 = 25.417f,
                    x2 = 26.0f,
                    y2 = 32.0f,
                    x3 = 27.0f,
                    y3 = 34.0f,
                )
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // c 1 -2 3 -8.583 3 -11.916
                curveToRelative(
                    dx1 = 1.0f,
                    dy1 = -2.0f,
                    dx2 = 3.0f,
                    dy2 = -8.583f,
                    dx3 = 3.0f,
                    dy3 = -11.916f,
                )
                // C 36 18 32 16 32 13z
                curveTo(
                    x1 = 36.0f,
                    y1 = 18.0f,
                    x2 = 32.0f,
                    y2 = 16.0f,
                    x3 = 32.0f,
                    y3 = 13.0f,
                )
                close()
            }
            // M28 13 h4 c0 -0.475 0.227 -1.18 0.464 -2 h-4.927 c0.236 0.82 0.463 1.525 0.463 2z M33.902 17 c-0.494 -0.681 -0.976 -1.333 -1.332 -2 h-5.139 c-0.357 0.667 -0.839 1.319 -1.332 2 h7.803z
            path(
                fill = SolidColor(Color(0xFFBE1931)),
            ) {
                // M 28 13
                moveTo(x = 28.0f, y = 13.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // c 0 -0.475 0.227 -1.18 0.464 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.475f,
                    dx2 = 0.227f,
                    dy2 = -1.18f,
                    dx3 = 0.464f,
                    dy3 = -2.0f,
                )
                // h -4.927
                horizontalLineToRelative(dx = -4.927f)
                // c 0.236 0.82 0.463 1.525 0.463 2z
                curveToRelative(
                    dx1 = 0.236f,
                    dy1 = 0.82f,
                    dx2 = 0.463f,
                    dy2 = 1.525f,
                    dx3 = 0.463f,
                    dy3 = 2.0f,
                )
                close()
                // M 33.902 17
                moveTo(x = 33.902f, y = 17.0f)
                // c -0.494 -0.681 -0.976 -1.333 -1.332 -2
                curveToRelative(
                    dx1 = -0.494f,
                    dy1 = -0.681f,
                    dx2 = -0.976f,
                    dy2 = -1.333f,
                    dx3 = -1.332f,
                    dy3 = -2.0f,
                )
                // h -5.139
                horizontalLineToRelative(dx = -5.139f)
                // c -0.357 0.667 -0.839 1.319 -1.332 2
                curveToRelative(
                    dx1 = -0.357f,
                    dy1 = 0.667f,
                    dx2 = -0.839f,
                    dy2 = 1.319f,
                    dx3 = -1.332f,
                    dy3 = 2.0f,
                )
                // h 7.803z
                horizontalLineToRelative(dx = 7.803f)
                close()
            }
            // M12.562 23.438 m-12.562 0 a12.562 12.562 0 1 1 25.124 0 a12.562 12.562 0 1 1 -25.124 0
            path(
                fill = SolidColor(Color(0xFF31373D)),
            ) {
                // M 12.562 23.438
                moveTo(x = 12.562f, y = 23.438f)
                // m -12.562 0
                moveToRelative(dx = -12.562f, dy = 0.0f)
                // a 12.562 12.562 0 1 1 25.124 0
                arcToRelative(
                    a = 12.562f,
                    b = 12.562f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 25.124f,
                    dy1 = 0.0f,
                )
                // a 12.562 12.562 0 1 1 -25.124 0
                arcToRelative(
                    a = 12.562f,
                    b = 12.562f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -25.124f,
                    dy1 = 0.0f,
                )
            }
            // M12.915 18.79 m-2.316 0 a2.316 2.316 0 1 1 4.632 0 a2.316 2.316 0 1 1 -4.632 0
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 12.915 18.79
                moveTo(x = 12.915f, y = 18.79f)
                // m -2.316 0
                moveToRelative(dx = -2.316f, dy = 0.0f)
                // a 2.316 2.316 0 1 1 4.632 0
                arcToRelative(
                    a = 2.316f,
                    b = 2.316f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.632f,
                    dy1 = 0.0f,
                )
                // a 2.316 2.316 0 1 1 -4.632 0
                arcToRelative(
                    a = 2.316f,
                    b = 2.316f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.632f,
                    dy1 = 0.0f,
                )
            }
            // M6.505 20.938 m-2.316 0 a2.316 2.316 0 1 1 4.632 0 a2.316 2.316 0 1 1 -4.632 0
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 6.505 20.938
                moveTo(x = 6.505f, y = 20.938f)
                // m -2.316 0
                moveToRelative(dx = -2.316f, dy = 0.0f)
                // a 2.316 2.316 0 1 1 4.632 0
                arcToRelative(
                    a = 2.316f,
                    b = 2.316f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.632f,
                    dy1 = 0.0f,
                )
                // a 2.316 2.316 0 1 1 -4.632 0
                arcToRelative(
                    a = 2.316f,
                    b = 2.316f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.632f,
                    dy1 = 0.0f,
                )
            }
            // M11.431 28.053 m-2.316 0 a2.316 2.316 0 1 1 4.632 0 a2.316 2.316 0 1 1 -4.632 0
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 11.431 28.053
                moveTo(x = 11.431f, y = 28.053f)
                // m -2.316 0
                moveToRelative(dx = -2.316f, dy = 0.0f)
                // a 2.316 2.316 0 1 1 4.632 0
                arcToRelative(
                    a = 2.316f,
                    b = 2.316f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.632f,
                    dy1 = 0.0f,
                )
                // a 2.316 2.316 0 1 1 -4.632 0
                arcToRelative(
                    a = 2.316f,
                    b = 2.316f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.632f,
                    dy1 = 0.0f,
                )
            }
        }.build().also { _emoji1f3b3 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f3b3: ImageVector? = null
