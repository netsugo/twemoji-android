package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f94f: ImageVector
    get() {
        val current = _emoji1f94f
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f94f",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M35 21.526 C35 26.758 27.389 31 18 31 S1 26.758 1 21.526 7.625 11 18 11 s17 5.294 17 10.526z
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 35 21.526
                moveTo(x = 35.0f, y = 21.526f)
                // C 35 26.758 27.389 31 18 31
                curveTo(
                    x1 = 35.0f,
                    y1 = 26.758f,
                    x2 = 27.389f,
                    y2 = 31.0f,
                    x3 = 18.0f,
                    y3 = 31.0f,
                )
                // S 1 26.758 1 21.526
                reflectiveCurveTo(
                    x1 = 1.0f,
                    y1 = 26.758f,
                    x2 = 1.0f,
                    y2 = 21.526f,
                )
                // S 7.625 11 18 11
                reflectiveCurveTo(
                    x1 = 7.625f,
                    y1 = 11.0f,
                    x2 = 18.0f,
                    y2 = 11.0f,
                )
                // s 17 5.294 17 10.526z
                reflectiveCurveToRelative(
                    dx1 = 17.0f,
                    dy1 = 5.294f,
                    dx2 = 17.0f,
                    dy2 = 10.526f,
                )
                close()
            }
            // M2 19.502 a16 8.5 0 1 0 32 0 a16 8.5 0 1 0 -32 0z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 2 19.502
                moveTo(x = 2.0f, y = 19.502f)
                // a 16 8.5 0 1 0 32 0
                arcToRelative(
                    a = 16.0f,
                    b = 8.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 32.0f,
                    dy1 = 0.0f,
                )
                // a 16 8.5 0 1 0 -32 0z
                arcToRelative(
                    a = 16.0f,
                    b = 8.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -32.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M18 11.331 c-6.449 0 -11.5 2.491 -11.5 5.672 0 3.18 5.051 5.671 11.5 5.671 6.448 0 11.5 -2.491 11.5 -5.671 0 -3.181 -5.052 -5.672 -11.5 -5.672z
            path(
                fill = SolidColor(Color(0xFFFFD983)),
            ) {
                // M 18 11.331
                moveTo(x = 18.0f, y = 11.331f)
                // c -6.449 0 -11.5 2.491 -11.5 5.672
                curveToRelative(
                    dx1 = -6.449f,
                    dy1 = 0.0f,
                    dx2 = -11.5f,
                    dy2 = 2.491f,
                    dx3 = -11.5f,
                    dy3 = 5.672f,
                )
                // c 0 3.18 5.051 5.671 11.5 5.671
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.18f,
                    dx2 = 5.051f,
                    dy2 = 5.671f,
                    dx3 = 11.5f,
                    dy3 = 5.671f,
                )
                // c 6.448 0 11.5 -2.491 11.5 -5.671
                curveToRelative(
                    dx1 = 6.448f,
                    dy1 = 0.0f,
                    dx2 = 11.5f,
                    dy2 = -2.491f,
                    dx3 = 11.5f,
                    dy3 = -5.671f,
                )
                // c 0 -3.181 -5.052 -5.672 -11.5 -5.672z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.181f,
                    dx2 = -5.052f,
                    dy2 = -5.672f,
                    dx3 = -11.5f,
                    dy3 = -5.672f,
                )
                close()
            }
            // M6 18.002 a12 6 0 1 0 24 0 a12 6 0 1 0 -24 0z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 6 18.002
                moveTo(x = 6.0f, y = 18.002f)
                // a 12 6 0 1 0 24 0
                arcToRelative(
                    a = 12.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 24.0f,
                    dy1 = 0.0f,
                )
                // a 12 6 0 1 0 -24 0z
                arcToRelative(
                    a = 12.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -24.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M29 18.002 c-1.81 3.118 -7 4 -11 4 s-9.19 -0.882 -11 -4 c-0.75 -1.292 -1.5 1.083 0.5 3.083 S14 24.402 18 24.402 s8.5 -1.317 10.5 -3.317 1.25 -4.374 0.5 -3.083z
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 29 18.002
                moveTo(x = 29.0f, y = 18.002f)
                // c -1.81 3.118 -7 4 -11 4
                curveToRelative(
                    dx1 = -1.81f,
                    dy1 = 3.118f,
                    dx2 = -7.0f,
                    dy2 = 4.0f,
                    dx3 = -11.0f,
                    dy3 = 4.0f,
                )
                // s -9.19 -0.882 -11 -4
                reflectiveCurveToRelative(
                    dx1 = -9.19f,
                    dy1 = -0.882f,
                    dx2 = -11.0f,
                    dy2 = -4.0f,
                )
                // c -0.75 -1.292 -1.5 1.083 0.5 3.083
                curveToRelative(
                    dx1 = -0.75f,
                    dy1 = -1.292f,
                    dx2 = -1.5f,
                    dy2 = 1.083f,
                    dx3 = 0.5f,
                    dy3 = 3.083f,
                )
                // S 14 24.402 18 24.402
                reflectiveCurveTo(
                    x1 = 14.0f,
                    y1 = 24.402f,
                    x2 = 18.0f,
                    y2 = 24.402f,
                )
                // s 8.5 -1.317 10.5 -3.317
                reflectiveCurveToRelative(
                    dx1 = 8.5f,
                    dy1 = -1.317f,
                    dx2 = 10.5f,
                    dy2 = -3.317f,
                )
                // s 1.25 -4.374 0.5 -3.083z
                reflectiveCurveToRelative(
                    dx1 = 1.25f,
                    dy1 = -4.374f,
                    dx2 = 0.5f,
                    dy2 = -3.083f,
                )
                close()
            }
            // M35 1 S24.497 -0.538 15.958 3 C6.77 6.807 4 13 4 13 c1.541 -1.541 5.463 -3.079 10.383 -3.705 1.777 -3.182 6.97 -7.391 12.271 -7.351 0 0 -7.222 1.493 -9.759 7.121 C17.586 9.026 18.286 9 19 9 c1.319 0 2.551 0.118 3.702 0.303 0.68 -2.914 3.791 -6.264 7.226 -6.829 0 0 -3.562 1.707 -4.845 7.338 C29.418 10.981 32 13 32 13 c-4 -8 3 -12 3 -12z
            path(
                fill = SolidColor(Color(0xFFE1E8ED)),
            ) {
                // M 35 1
                moveTo(x = 35.0f, y = 1.0f)
                // S 24.497 -0.538 15.958 3
                reflectiveCurveTo(
                    x1 = 24.497f,
                    y1 = -0.538f,
                    x2 = 15.958f,
                    y2 = 3.0f,
                )
                // C 6.77 6.807 4 13 4 13
                curveTo(
                    x1 = 6.77f,
                    y1 = 6.807f,
                    x2 = 4.0f,
                    y2 = 13.0f,
                    x3 = 4.0f,
                    y3 = 13.0f,
                )
                // c 1.541 -1.541 5.463 -3.079 10.383 -3.705
                curveToRelative(
                    dx1 = 1.541f,
                    dy1 = -1.541f,
                    dx2 = 5.463f,
                    dy2 = -3.079f,
                    dx3 = 10.383f,
                    dy3 = -3.705f,
                )
                // c 1.777 -3.182 6.97 -7.391 12.271 -7.351
                curveToRelative(
                    dx1 = 1.777f,
                    dy1 = -3.182f,
                    dx2 = 6.97f,
                    dy2 = -7.391f,
                    dx3 = 12.271f,
                    dy3 = -7.351f,
                )
                // c 0 0 -7.222 1.493 -9.759 7.121
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -7.222f,
                    dy2 = 1.493f,
                    dx3 = -9.759f,
                    dy3 = 7.121f,
                )
                // C 17.586 9.026 18.286 9 19 9
                curveTo(
                    x1 = 17.586f,
                    y1 = 9.026f,
                    x2 = 18.286f,
                    y2 = 9.0f,
                    x3 = 19.0f,
                    y3 = 9.0f,
                )
                // c 1.319 0 2.551 0.118 3.702 0.303
                curveToRelative(
                    dx1 = 1.319f,
                    dy1 = 0.0f,
                    dx2 = 2.551f,
                    dy2 = 0.118f,
                    dx3 = 3.702f,
                    dy3 = 0.303f,
                )
                // c 0.68 -2.914 3.791 -6.264 7.226 -6.829
                curveToRelative(
                    dx1 = 0.68f,
                    dy1 = -2.914f,
                    dx2 = 3.791f,
                    dy2 = -6.264f,
                    dx3 = 7.226f,
                    dy3 = -6.829f,
                )
                // c 0 0 -3.562 1.707 -4.845 7.338
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -3.562f,
                    dy2 = 1.707f,
                    dx3 = -4.845f,
                    dy3 = 7.338f,
                )
                // C 29.418 10.981 32 13 32 13
                curveTo(
                    x1 = 29.418f,
                    y1 = 10.981f,
                    x2 = 32.0f,
                    y2 = 13.0f,
                    x3 = 32.0f,
                    y3 = 13.0f,
                )
                // c -4 -8 3 -12 3 -12z
                curveToRelative(
                    dx1 = -4.0f,
                    dy1 = -8.0f,
                    dx2 = 3.0f,
                    dy2 = -12.0f,
                    dx3 = 3.0f,
                    dy3 = -12.0f,
                )
                close()
            }
        }.build().also { _emoji1f94f = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f94f: ImageVector? = null
