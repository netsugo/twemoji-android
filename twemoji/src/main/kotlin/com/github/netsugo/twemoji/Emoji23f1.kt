package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji23f1: ImageVector
    get() {
        val current = _emoji23f1
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji23f1",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M16 5 h4 v3 h-4z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 16 5
                moveTo(x = 16.0f, y = 5.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // M22 1 h-8 c-1.1 0 -2 0.9 -2 2 s0.9 2 2 2 h8 c1.1 0 2 -0.9 2 -2 s-0.9 -2 -2 -2z M28.184 11.507 l-1.504 -1.318 c-0.827 -0.725 -0.911 -1.995 -0.186 -2.822 0.725 -0.827 1.995 -0.911 2.822 -0.186 l1.504 1.318 c0.827 0.725 0.911 1.995 0.186 2.822 -0.725 0.827 -1.995 0.911 -2.822 0.186z
            path(
                fill = SolidColor(Color(0xFF8899A6)),
            ) {
                // M 22 1
                moveTo(x = 22.0f, y = 1.0f)
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // c -1.1 0 -2 0.9 -2 2
                curveToRelative(
                    dx1 = -1.1f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = 0.9f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // s 0.9 2 2 2
                reflectiveCurveToRelative(
                    dx1 = 0.9f,
                    dy1 = 2.0f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                )
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // c 1.1 0 2 -0.9 2 -2
                curveToRelative(
                    dx1 = 1.1f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = -0.9f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // s -0.9 -2 -2 -2z
                reflectiveCurveToRelative(
                    dx1 = -0.9f,
                    dy1 = -2.0f,
                    dx2 = -2.0f,
                    dy2 = -2.0f,
                )
                close()
                // M 28.184 11.507
                moveTo(x = 28.184f, y = 11.507f)
                // l -1.504 -1.318
                lineToRelative(dx = -1.504f, dy = -1.318f)
                // c -0.827 -0.725 -0.911 -1.995 -0.186 -2.822
                curveToRelative(
                    dx1 = -0.827f,
                    dy1 = -0.725f,
                    dx2 = -0.911f,
                    dy2 = -1.995f,
                    dx3 = -0.186f,
                    dy3 = -2.822f,
                )
                // c 0.725 -0.827 1.995 -0.911 2.822 -0.186
                curveToRelative(
                    dx1 = 0.725f,
                    dy1 = -0.827f,
                    dx2 = 1.995f,
                    dy2 = -0.911f,
                    dx3 = 2.822f,
                    dy3 = -0.186f,
                )
                // l 1.504 1.318
                lineToRelative(dx = 1.504f, dy = 1.318f)
                // c 0.827 0.725 0.911 1.995 0.186 2.822
                curveToRelative(
                    dx1 = 0.827f,
                    dy1 = 0.725f,
                    dx2 = 0.911f,
                    dy2 = 1.995f,
                    dx3 = 0.186f,
                    dy3 = 2.822f,
                )
                // c -0.725 0.827 -1.995 0.911 -2.822 0.186z
                curveToRelative(
                    dx1 = -0.725f,
                    dy1 = 0.827f,
                    dx2 = -1.995f,
                    dy2 = 0.911f,
                    dx3 = -2.822f,
                    dy3 = 0.186f,
                )
                close()
            }
            // M18 21 m-11 0 a11 11 0 1 1 22 0 a11 11 0 1 1 -22 0
            path(
                fill = SolidColor(Color(0xFFF5F8FA)),
            ) {
                // M 18 21
                moveTo(x = 18.0f, y = 21.0f)
                // m -11 0
                moveToRelative(dx = -11.0f, dy = 0.0f)
                // a 11 11 0 1 1 22 0
                arcToRelative(
                    a = 11.0f,
                    b = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 22.0f,
                    dy1 = 0.0f,
                )
                // a 11 11 0 1 1 -22 0
                arcToRelative(
                    a = 11.0f,
                    b = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -22.0f,
                    dy1 = 0.0f,
                )
            }
            // M18 7 C10.268 7 4 13.268 4 21 s6.268 14 14 14 14 -6.268 14 -14 S25.732 7 18 7z M18 32 c-6.065 0 -11 -4.935 -11 -11 s4.935 -11 11 -11 11 4.935 11 11 -4.935 11 -11 11z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 18 7
                moveTo(x = 18.0f, y = 7.0f)
                // C 10.268 7 4 13.268 4 21
                curveTo(
                    x1 = 10.268f,
                    y1 = 7.0f,
                    x2 = 4.0f,
                    y2 = 13.268f,
                    x3 = 4.0f,
                    y3 = 21.0f,
                )
                // s 6.268 14 14 14
                reflectiveCurveToRelative(
                    dx1 = 6.268f,
                    dy1 = 14.0f,
                    dx2 = 14.0f,
                    dy2 = 14.0f,
                )
                // s 14 -6.268 14 -14
                reflectiveCurveToRelative(
                    dx1 = 14.0f,
                    dy1 = -6.268f,
                    dx2 = 14.0f,
                    dy2 = -14.0f,
                )
                // S 25.732 7 18 7z
                reflectiveCurveTo(
                    x1 = 25.732f,
                    y1 = 7.0f,
                    x2 = 18.0f,
                    y2 = 7.0f,
                )
                close()
                // M 18 32
                moveTo(x = 18.0f, y = 32.0f)
                // c -6.065 0 -11 -4.935 -11 -11
                curveToRelative(
                    dx1 = -6.065f,
                    dy1 = 0.0f,
                    dx2 = -11.0f,
                    dy2 = -4.935f,
                    dx3 = -11.0f,
                    dy3 = -11.0f,
                )
                // s 4.935 -11 11 -11
                reflectiveCurveToRelative(
                    dx1 = 4.935f,
                    dy1 = -11.0f,
                    dx2 = 11.0f,
                    dy2 = -11.0f,
                )
                // s 11 4.935 11 11
                reflectiveCurveToRelative(
                    dx1 = 11.0f,
                    dy1 = 4.935f,
                    dx2 = 11.0f,
                    dy2 = 11.0f,
                )
                // s -4.935 11 -11 11z
                reflectiveCurveToRelative(
                    dx1 = -4.935f,
                    dy1 = 11.0f,
                    dx2 = -11.0f,
                    dy2 = 11.0f,
                )
                close()
            }
            // M27 22 H17 c-0.552 0 -1 -0.447 -1 -1 s0.448 -1 1 -1 h10 c0.553 0 1 0.447 1 1 s-0.447 1 -1 1z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 27 22
                moveTo(x = 27.0f, y = 22.0f)
                // H 17
                horizontalLineTo(x = 17.0f)
                // c -0.552 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // s 0.448 -1 1 -1
                reflectiveCurveToRelative(
                    dx1 = 0.448f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // c 0.553 0 1 0.447 1 1
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.447f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // s -0.447 1 -1 1z
                reflectiveCurveToRelative(
                    dx1 = -0.447f,
                    dy1 = 1.0f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                close()
            }
            // M18 12 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 18 12
                moveTo(x = 18.0f, y = 12.0f)
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
            // M18 30 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 18 30
                moveTo(x = 18.0f, y = 30.0f)
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
            // M12 15 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 12 15
                moveTo(x = 12.0f, y = 15.0f)
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
            // M24 27 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 24 27
                moveTo(x = 24.0f, y = 27.0f)
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
            // M9 21 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 9 21
                moveTo(x = 9.0f, y = 21.0f)
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
            // M24 15 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 24 15
                moveTo(x = 24.0f, y = 15.0f)
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
            // M12 28 c-0.256 0 -0.512 -0.098 -0.707 -0.293 -0.391 -0.391 -0.391 -1.023 0 -1.414 l7 -7 c0.391 -0.391 1.023 -0.391 1.414 0 s0.391 1.023 0 1.414 l-7 7 c-0.195 0.195 -0.451 0.293 -0.707 0.293z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 12 28
                moveTo(x = 12.0f, y = 28.0f)
                // c -0.256 0 -0.512 -0.098 -0.707 -0.293
                curveToRelative(
                    dx1 = -0.256f,
                    dy1 = 0.0f,
                    dx2 = -0.512f,
                    dy2 = -0.098f,
                    dx3 = -0.707f,
                    dy3 = -0.293f,
                )
                // c -0.391 -0.391 -0.391 -1.023 0 -1.414
                curveToRelative(
                    dx1 = -0.391f,
                    dy1 = -0.391f,
                    dx2 = -0.391f,
                    dy2 = -1.023f,
                    dx3 = 0.0f,
                    dy3 = -1.414f,
                )
                // l 7 -7
                lineToRelative(dx = 7.0f, dy = -7.0f)
                // c 0.391 -0.391 1.023 -0.391 1.414 0
                curveToRelative(
                    dx1 = 0.391f,
                    dy1 = -0.391f,
                    dx2 = 1.023f,
                    dy2 = -0.391f,
                    dx3 = 1.414f,
                    dy3 = 0.0f,
                )
                // s 0.391 1.023 0 1.414
                reflectiveCurveToRelative(
                    dx1 = 0.391f,
                    dy1 = 1.023f,
                    dx2 = 0.0f,
                    dy2 = 1.414f,
                )
                // l -7 7
                lineToRelative(dx = -7.0f, dy = 7.0f)
                // c -0.195 0.195 -0.451 0.293 -0.707 0.293z
                curveToRelative(
                    dx1 = -0.195f,
                    dy1 = 0.195f,
                    dx2 = -0.451f,
                    dy2 = 0.293f,
                    dx3 = -0.707f,
                    dy3 = 0.293f,
                )
                close()
            }
        }.build().also { _emoji23f1 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji23f1: ImageVector? = null
