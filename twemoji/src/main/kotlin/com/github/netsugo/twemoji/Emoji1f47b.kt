package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f47b: ImageVector
    get() {
        val current = _emoji1f47b
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f47b",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 11 c0 -1.104 -0.896 -2 -2 -2 s-2 0.896 -2 2 c0 0 -0.011 3.285 -3 3.894 V12 c0 -6.075 -4.925 -11 -11 -11 S7 5.925 7 12 v3.237 C1.778 16.806 0 23.231 0 27 c0 1.104 0.896 2 2 2 s2 -0.896 2 -2 c0 0 0.002 -3.54 3.336 -3.958 C7.838 27.883 8.954 33 11 33 h1 c4 0 3 2 7 2 s3 -2 6 -2 2.395 2 6 2 c1.657 0 3 -1.343 3 -3 0 -0.675 -2.274 -4.994 -3.755 -9.268 C35.981 21.348 36 14.58 36 11z
            path(
                fill = SolidColor(Color(0xFFE1E8ED)),
            ) {
                // M 36 11
                moveTo(x = 36.0f, y = 11.0f)
                // c 0 -1.104 -0.896 -2 -2 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.104f,
                    dx2 = -0.896f,
                    dy2 = -2.0f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // s -2 0.896 -2 2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 0.896f,
                    dx2 = -2.0f,
                    dy2 = 2.0f,
                )
                // c 0 0 -0.011 3.285 -3 3.894
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -0.011f,
                    dy2 = 3.285f,
                    dx3 = -3.0f,
                    dy3 = 3.894f,
                )
                // V 12
                verticalLineTo(y = 12.0f)
                // c 0 -6.075 -4.925 -11 -11 -11
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -6.075f,
                    dx2 = -4.925f,
                    dy2 = -11.0f,
                    dx3 = -11.0f,
                    dy3 = -11.0f,
                )
                // S 7 5.925 7 12
                reflectiveCurveTo(
                    x1 = 7.0f,
                    y1 = 5.925f,
                    x2 = 7.0f,
                    y2 = 12.0f,
                )
                // v 3.237
                verticalLineToRelative(dy = 3.237f)
                // C 1.778 16.806 0 23.231 0 27
                curveTo(
                    x1 = 1.778f,
                    y1 = 16.806f,
                    x2 = 0.0f,
                    y2 = 23.231f,
                    x3 = 0.0f,
                    y3 = 27.0f,
                )
                // c 0 1.104 0.896 2 2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = 0.896f,
                    dy2 = 2.0f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                // s 2 -0.896 2 -2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = -0.896f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // c 0 0 0.002 -3.54 3.336 -3.958
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 0.002f,
                    dy2 = -3.54f,
                    dx3 = 3.336f,
                    dy3 = -3.958f,
                )
                // C 7.838 27.883 8.954 33 11 33
                curveTo(
                    x1 = 7.838f,
                    y1 = 27.883f,
                    x2 = 8.954f,
                    y2 = 33.0f,
                    x3 = 11.0f,
                    y3 = 33.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // c 4 0 3 2 7 2
                curveToRelative(
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                    dx2 = 3.0f,
                    dy2 = 2.0f,
                    dx3 = 7.0f,
                    dy3 = 2.0f,
                )
                // s 3 -2 6 -2
                reflectiveCurveToRelative(
                    dx1 = 3.0f,
                    dy1 = -2.0f,
                    dx2 = 6.0f,
                    dy2 = -2.0f,
                )
                // s 2.395 2 6 2
                reflectiveCurveToRelative(
                    dx1 = 2.395f,
                    dy1 = 2.0f,
                    dx2 = 6.0f,
                    dy2 = 2.0f,
                )
                // c 1.657 0 3 -1.343 3 -3
                curveToRelative(
                    dx1 = 1.657f,
                    dy1 = 0.0f,
                    dx2 = 3.0f,
                    dy2 = -1.343f,
                    dx3 = 3.0f,
                    dy3 = -3.0f,
                )
                // c 0 -0.675 -2.274 -4.994 -3.755 -9.268
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.675f,
                    dx2 = -2.274f,
                    dy2 = -4.994f,
                    dx3 = -3.755f,
                    dy3 = -9.268f,
                )
                // C 35.981 21.348 36 14.58 36 11z
                curveTo(
                    x1 = 35.981f,
                    y1 = 21.348f,
                    x2 = 36.0f,
                    y2 = 14.58f,
                    x3 = 36.0f,
                    y3 = 11.0f,
                )
                close()
            }
            // M13 12 m-2 0 a2 2 0 1 1 4 0 a2 2 0 1 1 -4 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 13 12
                moveTo(x = 13.0f, y = 12.0f)
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
            // M23 12 m-4 0 a4 4 0 1 1 8 0 a4 4 0 1 1 -8 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 23 12
                moveTo(x = 23.0f, y = 12.0f)
                // m -4 0
                moveToRelative(dx = -4.0f, dy = 0.0f)
                // a 4 4 0 1 1 8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 8.0f,
                    dy1 = 0.0f,
                )
                // a 4 4 0 1 1 -8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -8.0f,
                    dy1 = 0.0f,
                )
            }
            // M23 13 m-2 0 a2 2 0 1 1 4 0 a2 2 0 1 1 -4 0
            path(
                fill = SolidColor(Color(0xFF9AAAB4)),
            ) {
                // M 23 13
                moveTo(x = 23.0f, y = 13.0f)
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
            // M22.192 19.491 c2.65 1.987 3.591 5.211 2.1 7.199 -1.491 1.988 -4.849 1.988 -7.5 0 -2.65 -1.987 -3.591 -5.211 -2.1 -7.199 1.492 -1.989 4.849 -1.988 7.5 0z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 22.192 19.491
                moveTo(x = 22.192f, y = 19.491f)
                // c 2.65 1.987 3.591 5.211 2.1 7.199
                curveToRelative(
                    dx1 = 2.65f,
                    dy1 = 1.987f,
                    dx2 = 3.591f,
                    dy2 = 5.211f,
                    dx3 = 2.1f,
                    dy3 = 7.199f,
                )
                // c -1.491 1.988 -4.849 1.988 -7.5 0
                curveToRelative(
                    dx1 = -1.491f,
                    dy1 = 1.988f,
                    dx2 = -4.849f,
                    dy2 = 1.988f,
                    dx3 = -7.5f,
                    dy3 = 0.0f,
                )
                // c -2.65 -1.987 -3.591 -5.211 -2.1 -7.199
                curveToRelative(
                    dx1 = -2.65f,
                    dy1 = -1.987f,
                    dx2 = -3.591f,
                    dy2 = -5.211f,
                    dx3 = -2.1f,
                    dy3 = -7.199f,
                )
                // c 1.492 -1.989 4.849 -1.988 7.5 0z
                curveToRelative(
                    dx1 = 1.492f,
                    dy1 = -1.989f,
                    dx2 = 4.849f,
                    dy2 = -1.988f,
                    dx3 = 7.5f,
                    dy3 = 0.0f,
                )
                close()
            }
        }.build().also { _emoji1f47b = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f47b: ImageVector? = null
