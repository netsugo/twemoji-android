package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f4fb: ImageVector
    get() {
        val current = _emoji1f4fb
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f4fb",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M2.697 12.389 c-0.391 0.391 -0.391 1.023 0 1.414 s1.023 0.391 1.414 0 l9.192 -9.192 c0.391 -0.391 0.391 -1.023 0 -1.414 s-1.023 -0.391 -1.414 0 l-9.192 9.192z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 2.697 12.389
                moveTo(x = 2.697f, y = 12.389f)
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
            // M36 32 c0 4 -4 4 -4 4 H4 s-4 0 -4 -4 V14 s0 -4 4 -4 h28 c4 0 4 4 4 4 v18z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 36 32
                moveTo(x = 36.0f, y = 32.0f)
                // c 0 4 -4 4 -4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.0f,
                    dx2 = -4.0f,
                    dy2 = 4.0f,
                    dx3 = -4.0f,
                    dy3 = 4.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // s -4 0 -4 -4
                reflectiveCurveToRelative(
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = -4.0f,
                )
                // V 14
                verticalLineTo(y = 14.0f)
                // s 0 -4 4 -4
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.0f,
                    dx2 = 4.0f,
                    dy2 = -4.0f,
                )
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // c 4 0 4 4 4 4
                curveToRelative(
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = 4.0f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // v 18z
                verticalLineToRelative(dy = 18.0f)
                close()
            }
            // M15.561 3.061 c-0.391 0.391 -1.023 0.391 -1.414 0 l-0.707 -0.707 c-0.391 -0.391 -0.391 -1.023 0 -1.414 s1.023 -0.391 1.414 0 l0.707 0.707 c0.39 0.39 0.39 1.023 0 1.414z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 15.561 3.061
                moveTo(x = 15.561f, y = 3.061f)
                // c -0.391 0.391 -1.023 0.391 -1.414 0
                curveToRelative(
                    dx1 = -0.391f,
                    dy1 = 0.391f,
                    dx2 = -1.023f,
                    dy2 = 0.391f,
                    dx3 = -1.414f,
                    dy3 = 0.0f,
                )
                // l -0.707 -0.707
                lineToRelative(dx = -0.707f, dy = -0.707f)
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
                // l 0.707 0.707
                lineToRelative(dx = 0.707f, dy = 0.707f)
                // c 0.39 0.39 0.39 1.023 0 1.414z
                curveToRelative(
                    dx1 = 0.39f,
                    dy1 = 0.39f,
                    dx2 = 0.39f,
                    dy2 = 1.023f,
                    dx3 = 0.0f,
                    dy3 = 1.414f,
                )
                close()
            }
            // M27.5 18.5 m-5.5 0 a5.5 5.5 0 1 1 11 0 a5.5 5.5 0 1 1 -11 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 27.5 18.5
                moveTo(x = 27.5f, y = 18.5f)
                // m -5.5 0
                moveToRelative(dx = -5.5f, dy = 0.0f)
                // a 5.5 5.5 0 1 1 11 0
                arcToRelative(
                    a = 5.5f,
                    b = 5.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 11.0f,
                    dy1 = 0.0f,
                )
                // a 5.5 5.5 0 1 1 -11 0
                arcToRelative(
                    a = 5.5f,
                    b = 5.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -11.0f,
                    dy1 = 0.0f,
                )
            }
            // M27.5 29.5 m-3.5 0 a3.5 3.5 0 1 1 7 0 a3.5 3.5 0 1 1 -7 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 27.5 29.5
                moveTo(x = 27.5f, y = 29.5f)
                // m -3.5 0
                moveToRelative(dx = -3.5f, dy = 0.0f)
                // a 3.5 3.5 0 1 1 7 0
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 7.0f,
                    dy1 = 0.0f,
                )
                // a 3.5 3.5 0 1 1 -7 0
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -7.0f,
                    dy1 = 0.0f,
                )
            }
            // M27.5 18.5 m-3.5 0 a3.5 3.5 0 1 1 7 0 a3.5 3.5 0 1 1 -7 0
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 27.5 18.5
                moveTo(x = 27.5f, y = 18.5f)
                // m -3.5 0
                moveToRelative(dx = -3.5f, dy = 0.0f)
                // a 3.5 3.5 0 1 1 7 0
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 7.0f,
                    dy1 = 0.0f,
                )
                // a 3.5 3.5 0 1 1 -7 0
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -7.0f,
                    dy1 = 0.0f,
                )
            }
            // M27.5 29.5 m-1.5 0 a1.5 1.5 0 1 1 3 0 a1.5 1.5 0 1 1 -3 0
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 27.5 29.5
                moveTo(x = 27.5f, y = 29.5f)
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
            // M10.5 25.5 m-1.5 0 a1.5 1.5 0 1 1 3 0 a1.5 1.5 0 1 1 -3 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 10.5 25.5
                moveTo(x = 10.5f, y = 25.5f)
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
            // M5.5 25.5 m-1.5 0 a1.5 1.5 0 1 1 3 0 a1.5 1.5 0 1 1 -3 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 5.5 25.5
                moveTo(x = 5.5f, y = 25.5f)
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
            // M10.5 20.5 m-1.5 0 a1.5 1.5 0 1 1 3 0 a1.5 1.5 0 1 1 -3 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 10.5 20.5
                moveTo(x = 10.5f, y = 20.5f)
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
            // M15.5 20.5 m-1.5 0 a1.5 1.5 0 1 1 3 0 a1.5 1.5 0 1 1 -3 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 15.5 20.5
                moveTo(x = 15.5f, y = 20.5f)
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
            // M15.5 25.5 m-1.5 0 a1.5 1.5 0 1 1 3 0 a1.5 1.5 0 1 1 -3 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 15.5 25.5
                moveTo(x = 15.5f, y = 25.5f)
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
            // M15.5 30.5 m-1.5 0 a1.5 1.5 0 1 1 3 0 a1.5 1.5 0 1 1 -3 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 15.5 30.5
                moveTo(x = 15.5f, y = 30.5f)
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
            // M5.5 30.5 m-1.5 0 a1.5 1.5 0 1 1 3 0 a1.5 1.5 0 1 1 -3 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 5.5 30.5
                moveTo(x = 5.5f, y = 30.5f)
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
            // M5.5 20.5 m-1.5 0 a1.5 1.5 0 1 1 3 0 a1.5 1.5 0 1 1 -3 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 5.5 20.5
                moveTo(x = 5.5f, y = 20.5f)
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
            // M10.5 15.5 m-1.5 0 a1.5 1.5 0 1 1 3 0 a1.5 1.5 0 1 1 -3 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 10.5 15.5
                moveTo(x = 10.5f, y = 15.5f)
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
            // M15.5 15.5 m-1.5 0 a1.5 1.5 0 1 1 3 0 a1.5 1.5 0 1 1 -3 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 15.5 15.5
                moveTo(x = 15.5f, y = 15.5f)
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
            // M5.5 15.5 m-1.5 0 a1.5 1.5 0 1 1 3 0 a1.5 1.5 0 1 1 -3 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 5.5 15.5
                moveTo(x = 5.5f, y = 15.5f)
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
            // M10.5 30.5 m-1.5 0 a1.5 1.5 0 1 1 3 0 a1.5 1.5 0 1 1 -3 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 10.5 30.5
                moveTo(x = 10.5f, y = 30.5f)
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
        }.build().also { _emoji1f4fb = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f4fb: ImageVector? = null
