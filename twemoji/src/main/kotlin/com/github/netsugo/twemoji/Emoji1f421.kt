package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f421: ImageVector
    get() {
        val current = _emoji1f421
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f421",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M33 17 c0.461 0.184 0.902 3 -1 3 -6 0 -11 11 -20 11 S1 18.5 1 16 5.82 6 13 6 s15 9 20 11z
            path(
                fill = SolidColor(Color(0xFFD99E82)),
            ) {
                // M 33 17
                moveTo(x = 33.0f, y = 17.0f)
                // c 0.461 0.184 0.902 3 -1 3
                curveToRelative(
                    dx1 = 0.461f,
                    dy1 = 0.184f,
                    dx2 = 0.902f,
                    dy2 = 3.0f,
                    dx3 = -1.0f,
                    dy3 = 3.0f,
                )
                // c -6 0 -11 11 -20 11
                curveToRelative(
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                    dx2 = -11.0f,
                    dy2 = 11.0f,
                    dx3 = -20.0f,
                    dy3 = 11.0f,
                )
                // S 1 18.5 1 16
                reflectiveCurveTo(
                    x1 = 1.0f,
                    y1 = 18.5f,
                    x2 = 1.0f,
                    y2 = 16.0f,
                )
                // S 5.82 6 13 6
                reflectiveCurveTo(
                    x1 = 5.82f,
                    y1 = 6.0f,
                    x2 = 13.0f,
                    y2 = 6.0f,
                )
                // s 15 9 20 11z
                reflectiveCurveToRelative(
                    dx1 = 15.0f,
                    dy1 = 9.0f,
                    dx2 = 20.0f,
                    dy2 = 11.0f,
                )
                close()
            }
            // M3 19 c0 0.553 -0.671 1 -1.5 1 S0 19.553 0 19 s0 -2 1.5 -1 c0.689 0.46 1.5 0.447 1.5 1z
            path(
                fill = SolidColor(Color(0xFFD99E82)),
            ) {
                // M 3 19
                moveTo(x = 3.0f, y = 19.0f)
                // c 0 0.553 -0.671 1 -1.5 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.671f,
                    dy2 = 1.0f,
                    dx3 = -1.5f,
                    dy3 = 1.0f,
                )
                // S 0 19.553 0 19
                reflectiveCurveTo(
                    x1 = 0.0f,
                    y1 = 19.553f,
                    x2 = 0.0f,
                    y2 = 19.0f,
                )
                // s 0 -2 1.5 -1
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                    dx2 = 1.5f,
                    dy2 = -1.0f,
                )
                // c 0.689 0.46 1.5 0.447 1.5 1z
                curveToRelative(
                    dx1 = 0.689f,
                    dy1 = 0.46f,
                    dx2 = 1.5f,
                    dy2 = 0.447f,
                    dx3 = 1.5f,
                    dy3 = 1.0f,
                )
                close()
            }
            // M33 17 c0.461 0.184 0.876 0.688 -1 1 -6 1 -10.045 -0.896 -19 0 -10 1 -12 1 -12 -2 C1 13.5 5.82 6 13 6 s15 9 20 11z
            path(
                fill = SolidColor(Color(0xFFC1694F)),
            ) {
                // M 33 17
                moveTo(x = 33.0f, y = 17.0f)
                // c 0.461 0.184 0.876 0.688 -1 1
                curveToRelative(
                    dx1 = 0.461f,
                    dy1 = 0.184f,
                    dx2 = 0.876f,
                    dy2 = 0.688f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // c -6 1 -10.045 -0.896 -19 0
                curveToRelative(
                    dx1 = -6.0f,
                    dy1 = 1.0f,
                    dx2 = -10.045f,
                    dy2 = -0.896f,
                    dx3 = -19.0f,
                    dy3 = 0.0f,
                )
                // c -10 1 -12 1 -12 -2
                curveToRelative(
                    dx1 = -10.0f,
                    dy1 = 1.0f,
                    dx2 = -12.0f,
                    dy2 = 1.0f,
                    dx3 = -12.0f,
                    dy3 = -2.0f,
                )
                // C 1 13.5 5.82 6 13 6
                curveTo(
                    x1 = 1.0f,
                    y1 = 13.5f,
                    x2 = 5.82f,
                    y2 = 6.0f,
                    x3 = 13.0f,
                    y3 = 6.0f,
                )
                // s 15 9 20 11z
                reflectiveCurveToRelative(
                    dx1 = 15.0f,
                    dy1 = 9.0f,
                    dx2 = 20.0f,
                    dy2 = 11.0f,
                )
                close()
            }
            // M30 17.5 c0 2.485 3.343 4.5 5 4.5 s0 -2.015 0 -4.5 1.657 -4.5 0 -4.5 -5 2.015 -5 4.5z
            path(
                fill = SolidColor(Color(0xFFD99E82)),
            ) {
                // M 30 17.5
                moveTo(x = 30.0f, y = 17.5f)
                // c 0 2.485 3.343 4.5 5 4.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.485f,
                    dx2 = 3.343f,
                    dy2 = 4.5f,
                    dx3 = 5.0f,
                    dy3 = 4.5f,
                )
                // s 0 -2.015 0 -4.5
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.015f,
                    dx2 = 0.0f,
                    dy2 = -4.5f,
                )
                // s 1.657 -4.5 0 -4.5
                reflectiveCurveToRelative(
                    dx1 = 1.657f,
                    dy1 = -4.5f,
                    dx2 = 0.0f,
                    dy2 = -4.5f,
                )
                // s -5 2.015 -5 4.5z
                reflectiveCurveToRelative(
                    dx1 = -5.0f,
                    dy1 = 2.015f,
                    dx2 = -5.0f,
                    dy2 = 4.5f,
                )
                close()
            }
            // M7 13 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 7 13
                moveTo(x = 7.0f, y = 13.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // a 1 1 0 1 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 1 1 -2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
            }
            // M19.16 25 S22 29 24 29 s0 -5 0 -5 h-2.84 c-3 0 -2 1 -2 1z
            path(
                fill = SolidColor(Color(0xFFD99E82)),
            ) {
                // M 19.16 25
                moveTo(x = 19.16f, y = 25.0f)
                // S 22 29 24 29
                reflectiveCurveTo(
                    x1 = 22.0f,
                    y1 = 29.0f,
                    x2 = 24.0f,
                    y2 = 29.0f,
                )
                // s 0 -5 0 -5
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -5.0f,
                    dx2 = 0.0f,
                    dy2 = -5.0f,
                )
                // h -2.84
                horizontalLineToRelative(dx = -2.84f)
                // c -3 0 -2 1 -2 1z
                curveToRelative(
                    dx1 = -3.0f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = 1.0f,
                    dx3 = -2.0f,
                    dy3 = 1.0f,
                )
                close()
            }
            // M21.351 8.923 S24.211 6.106 26 7 c4.074 2.036 -2 4 -2 4 l-1.593 -0.106 c-2.993 -0.201 -1.056 -1.971 -1.056 -1.971z
            path(
                fill = SolidColor(Color(0xFFC1694F)),
            ) {
                // M 21.351 8.923
                moveTo(x = 21.351f, y = 8.923f)
                // S 24.211 6.106 26 7
                reflectiveCurveTo(
                    x1 = 24.211f,
                    y1 = 6.106f,
                    x2 = 26.0f,
                    y2 = 7.0f,
                )
                // c 4.074 2.036 -2 4 -2 4
                curveToRelative(
                    dx1 = 4.074f,
                    dy1 = 2.036f,
                    dx2 = -2.0f,
                    dy2 = 4.0f,
                    dx3 = -2.0f,
                    dy3 = 4.0f,
                )
                // l -1.593 -0.106
                lineToRelative(dx = -1.593f, dy = -0.106f)
                // c -2.993 -0.201 -1.056 -1.971 -1.056 -1.971z
                curveToRelative(
                    dx1 = -2.993f,
                    dy1 = -0.201f,
                    dx2 = -1.056f,
                    dy2 = -1.971f,
                    dx3 = -1.056f,
                    dy3 = -1.971f,
                )
                close()
            }
            // M16 25 m-2 0 a2 2 0 1 1 4 0 a2 2 0 1 1 -4 0
            path(
                fill = SolidColor(Color(0xFFC1694F)),
            ) {
                // M 16 25
                moveTo(x = 16.0f, y = 25.0f)
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
            // M20 21 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFC1694F)),
            ) {
                // M 20 21
                moveTo(x = 20.0f, y = 21.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // a 1 1 0 1 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 1 1 -2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
            }
            // M24.5 20.5 m-1.5 0 a1.5 1.5 0 1 1 3 0 a1.5 1.5 0 1 1 -3 0
            path(
                fill = SolidColor(Color(0xFFC1694F)),
            ) {
                // M 24.5 20.5
                moveTo(x = 24.5f, y = 20.5f)
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
            // M16.5 14.5 m-1.5 0 a1.5 1.5 0 1 1 3 0 a1.5 1.5 0 1 1 -3 0
            path(
                fill = SolidColor(Color(0xFF662113)),
            ) {
                // M 16.5 14.5
                moveTo(x = 16.5f, y = 14.5f)
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
            // M23.5 15.5 m-1.5 0 a1.5 1.5 0 1 1 3 0 a1.5 1.5 0 1 1 -3 0
            path(
                fill = SolidColor(Color(0xFF662113)),
            ) {
                // M 23.5 15.5
                moveTo(x = 23.5f, y = 15.5f)
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
            // M20 11 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFF662113)),
            ) {
                // M 20 11
                moveTo(x = 20.0f, y = 11.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // a 1 1 0 1 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 1 1 -2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
            }
            // M3 17 c0 0.552 1 2 -1.5 1 -0.77 -0.308 -1.5 -0.448 -1.5 -1 s0.671 -1 1.5 -1 1.5 0.448 1.5 1z
            path(
                fill = SolidColor(Color(0xFFC1694F)),
            ) {
                // M 3 17
                moveTo(x = 3.0f, y = 17.0f)
                // c 0 0.552 1 2 -1.5 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = 1.0f,
                    dy2 = 2.0f,
                    dx3 = -1.5f,
                    dy3 = 1.0f,
                )
                // c -0.77 -0.308 -1.5 -0.448 -1.5 -1
                curveToRelative(
                    dx1 = -0.77f,
                    dy1 = -0.308f,
                    dx2 = -1.5f,
                    dy2 = -0.448f,
                    dx3 = -1.5f,
                    dy3 = -1.0f,
                )
                // s 0.671 -1 1.5 -1
                reflectiveCurveToRelative(
                    dx1 = 0.671f,
                    dy1 = -1.0f,
                    dx2 = 1.5f,
                    dy2 = -1.0f,
                )
                // s 1.5 0.448 1.5 1z
                reflectiveCurveToRelative(
                    dx1 = 1.5f,
                    dy1 = 0.448f,
                    dx2 = 1.5f,
                    dy2 = 1.0f,
                )
                close()
            }
        }.build().also { _emoji1f421 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f421: ImageVector? = null
