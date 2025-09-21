package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f975: ImageVector
    get() {
        val current = _emoji1f975
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f975",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M18 18 m-18 0 a18 18 0 1 1 36 0 a18 18 0 1 1 -36 0
            path(
                fill = SolidColor(Color(0xFFEA596E)),
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
            // M26.125 29.261 c-0.028 0 -0.057 -0.003 -0.084 -0.01 -8.424 -1.942 -15.996 -0.022 -16.072 -0.002 -0.111 0.028 -0.231 0.005 -0.324 -0.066 -0.091 -0.072 -0.145 -0.181 -0.145 -0.297 0 -3.178 3.713 -6.872 8.5 -6.872 s8.5 3.694 8.5 6.872 c0 0.114 -0.052 0.223 -0.142 0.294 -0.067 0.052 -0.149 0.081 -0.233 0.081z M29 12 c-5.554 0 -7.802 -4.367 -7.895 -4.553 -0.247 -0.494 -0.047 -1.095 0.447 -1.342 0.493 -0.247 1.092 -0.048 1.34 0.443 C22.967 6.694 24.713 10 29 10 c0.553 0 1 0.448 1 1 s-0.447 1 -1 1z M7 12 c-0.552 0 -1 -0.448 -1 -1 s0.448 -1 1 -1 c5.083 0 5.996 -3.12 6.033 -3.253 0.145 -0.528 0.692 -0.848 1.219 -0.709 0.53 0.139 0.851 0.673 0.718 1.205 C14.921 7.437 13.704 12 7 12z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 26.125 29.261
                moveTo(x = 26.125f, y = 29.261f)
                // c -0.028 0 -0.057 -0.003 -0.084 -0.01
                curveToRelative(
                    dx1 = -0.028f,
                    dy1 = 0.0f,
                    dx2 = -0.057f,
                    dy2 = -0.003f,
                    dx3 = -0.084f,
                    dy3 = -0.01f,
                )
                // c -8.424 -1.942 -15.996 -0.022 -16.072 -0.002
                curveToRelative(
                    dx1 = -8.424f,
                    dy1 = -1.942f,
                    dx2 = -15.996f,
                    dy2 = -0.022f,
                    dx3 = -16.072f,
                    dy3 = -0.002f,
                )
                // c -0.111 0.028 -0.231 0.005 -0.324 -0.066
                curveToRelative(
                    dx1 = -0.111f,
                    dy1 = 0.028f,
                    dx2 = -0.231f,
                    dy2 = 0.005f,
                    dx3 = -0.324f,
                    dy3 = -0.066f,
                )
                // c -0.091 -0.072 -0.145 -0.181 -0.145 -0.297
                curveToRelative(
                    dx1 = -0.091f,
                    dy1 = -0.072f,
                    dx2 = -0.145f,
                    dy2 = -0.181f,
                    dx3 = -0.145f,
                    dy3 = -0.297f,
                )
                // c 0 -3.178 3.713 -6.872 8.5 -6.872
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.178f,
                    dx2 = 3.713f,
                    dy2 = -6.872f,
                    dx3 = 8.5f,
                    dy3 = -6.872f,
                )
                // s 8.5 3.694 8.5 6.872
                reflectiveCurveToRelative(
                    dx1 = 8.5f,
                    dy1 = 3.694f,
                    dx2 = 8.5f,
                    dy2 = 6.872f,
                )
                // c 0 0.114 -0.052 0.223 -0.142 0.294
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.114f,
                    dx2 = -0.052f,
                    dy2 = 0.223f,
                    dx3 = -0.142f,
                    dy3 = 0.294f,
                )
                // c -0.067 0.052 -0.149 0.081 -0.233 0.081z
                curveToRelative(
                    dx1 = -0.067f,
                    dy1 = 0.052f,
                    dx2 = -0.149f,
                    dy2 = 0.081f,
                    dx3 = -0.233f,
                    dy3 = 0.081f,
                )
                close()
                // M 29 12
                moveTo(x = 29.0f, y = 12.0f)
                // c -5.554 0 -7.802 -4.367 -7.895 -4.553
                curveToRelative(
                    dx1 = -5.554f,
                    dy1 = 0.0f,
                    dx2 = -7.802f,
                    dy2 = -4.367f,
                    dx3 = -7.895f,
                    dy3 = -4.553f,
                )
                // c -0.247 -0.494 -0.047 -1.095 0.447 -1.342
                curveToRelative(
                    dx1 = -0.247f,
                    dy1 = -0.494f,
                    dx2 = -0.047f,
                    dy2 = -1.095f,
                    dx3 = 0.447f,
                    dy3 = -1.342f,
                )
                // c 0.493 -0.247 1.092 -0.048 1.34 0.443
                curveToRelative(
                    dx1 = 0.493f,
                    dy1 = -0.247f,
                    dx2 = 1.092f,
                    dy2 = -0.048f,
                    dx3 = 1.34f,
                    dy3 = 0.443f,
                )
                // C 22.967 6.694 24.713 10 29 10
                curveTo(
                    x1 = 22.967f,
                    y1 = 6.694f,
                    x2 = 24.713f,
                    y2 = 10.0f,
                    x3 = 29.0f,
                    y3 = 10.0f,
                )
                // c 0.553 0 1 0.448 1 1
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.448f,
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
                // M 7 12
                moveTo(x = 7.0f, y = 12.0f)
                // c -0.552 0 -1 -0.448 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.448f,
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
                // c 5.083 0 5.996 -3.12 6.033 -3.253
                curveToRelative(
                    dx1 = 5.083f,
                    dy1 = 0.0f,
                    dx2 = 5.996f,
                    dy2 = -3.12f,
                    dx3 = 6.033f,
                    dy3 = -3.253f,
                )
                // c 0.145 -0.528 0.692 -0.848 1.219 -0.709
                curveToRelative(
                    dx1 = 0.145f,
                    dy1 = -0.528f,
                    dx2 = 0.692f,
                    dy2 = -0.848f,
                    dx3 = 1.219f,
                    dy3 = -0.709f,
                )
                // c 0.53 0.139 0.851 0.673 0.718 1.205
                curveToRelative(
                    dx1 = 0.53f,
                    dy1 = 0.139f,
                    dx2 = 0.851f,
                    dy2 = 0.673f,
                    dx3 = 0.718f,
                    dy3 = 1.205f,
                )
                // C 14.921 7.437 13.704 12 7 12z
                curveTo(
                    x1 = 14.921f,
                    y1 = 7.437f,
                    x2 = 13.704f,
                    y2 = 12.0f,
                    x3 = 7.0f,
                    y3 = 12.0f,
                )
                close()
            }
            // M9.5 16.5 a2.5 3.5 0 1 0 5 0 a2.5 3.5 0 1 0 -5 0z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 9.5 16.5
                moveTo(x = 9.5f, y = 16.5f)
                // a 2.5 3.5 0 1 0 5 0
                arcToRelative(
                    a = 2.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // a 2.5 3.5 0 1 0 -5 0z
                arcToRelative(
                    a = 2.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -5.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M21.5 16.5 a2.5 3.5 0 1 0 5 0 a2.5 3.5 0 1 0 -5 0z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 21.5 16.5
                moveTo(x = 21.5f, y = 16.5f)
                // a 2.5 3.5 0 1 0 5 0
                arcToRelative(
                    a = 2.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // a 2.5 3.5 0 1 0 -5 0z
                arcToRelative(
                    a = 2.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -5.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M18.629 23.079 v0.827 l-1.091 0.001 v-0.837 c-2.277 0.127 -4.191 1.162 -5.455 2.516 l0.008 0.461 c0.086 2.932 2.08 5.802 5.992 5.802 3.899 0 5.892 -2.851 5.991 -5.773 l0.009 -0.284 c-1.229 -1.415 -3.145 -2.537 -5.454 -2.713z
            path(
                fill = SolidColor(Color(0xFFF4ABBA)),
            ) {
                // M 18.629 23.079
                moveTo(x = 18.629f, y = 23.079f)
                // v 0.827
                verticalLineToRelative(dy = 0.827f)
                // l -1.091 0.001
                lineToRelative(dx = -1.091f, dy = 0.001f)
                // v -0.837
                verticalLineToRelative(dy = -0.837f)
                // c -2.277 0.127 -4.191 1.162 -5.455 2.516
                curveToRelative(
                    dx1 = -2.277f,
                    dy1 = 0.127f,
                    dx2 = -4.191f,
                    dy2 = 1.162f,
                    dx3 = -5.455f,
                    dy3 = 2.516f,
                )
                // l 0.008 0.461
                lineToRelative(dx = 0.008f, dy = 0.461f)
                // c 0.086 2.932 2.08 5.802 5.992 5.802
                curveToRelative(
                    dx1 = 0.086f,
                    dy1 = 2.932f,
                    dx2 = 2.08f,
                    dy2 = 5.802f,
                    dx3 = 5.992f,
                    dy3 = 5.802f,
                )
                // c 3.899 0 5.892 -2.851 5.991 -5.773
                curveToRelative(
                    dx1 = 3.899f,
                    dy1 = 0.0f,
                    dx2 = 5.892f,
                    dy2 = -2.851f,
                    dx3 = 5.991f,
                    dy3 = -5.773f,
                )
                // l 0.009 -0.284
                lineToRelative(dx = 0.009f, dy = -0.284f)
                // c -1.229 -1.415 -3.145 -2.537 -5.454 -2.713z
                curveToRelative(
                    dx1 = -1.229f,
                    dy1 = -1.415f,
                    dx2 = -3.145f,
                    dy2 = -2.537f,
                    dx3 = -5.454f,
                    dy3 = -2.713f,
                )
                close()
            }
            // M18 23.049 c-0.157 0 -0.308 0.014 -0.462 0.022 v4.447 c0 0.301 0.244 0.545 0.545 0.545 s0.545 -0.244 0.545 -0.545 V23.08 c-0.207 -0.017 -0.414 -0.031 -0.628 -0.031z
            path(
                fill = SolidColor(Color(0xFFEA596E)),
            ) {
                // M 18 23.049
                moveTo(x = 18.0f, y = 23.049f)
                // c -0.157 0 -0.308 0.014 -0.462 0.022
                curveToRelative(
                    dx1 = -0.157f,
                    dy1 = 0.0f,
                    dx2 = -0.308f,
                    dy2 = 0.014f,
                    dx3 = -0.462f,
                    dy3 = 0.022f,
                )
                // v 4.447
                verticalLineToRelative(dy = 4.447f)
                // c 0 0.301 0.244 0.545 0.545 0.545
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.301f,
                    dx2 = 0.244f,
                    dy2 = 0.545f,
                    dx3 = 0.545f,
                    dy3 = 0.545f,
                )
                // s 0.545 -0.244 0.545 -0.545
                reflectiveCurveToRelative(
                    dx1 = 0.545f,
                    dy1 = -0.244f,
                    dx2 = 0.545f,
                    dy2 = -0.545f,
                )
                // V 23.08
                verticalLineTo(y = 23.08f)
                // c -0.207 -0.017 -0.414 -0.031 -0.628 -0.031z
                curveToRelative(
                    dx1 = -0.207f,
                    dy1 = -0.017f,
                    dx2 = -0.414f,
                    dy2 = -0.031f,
                    dx3 = -0.628f,
                    dy3 = -0.031f,
                )
                close()
            }
            // M35.906 12.062 c0 2.814 -2.28 5.094 -5.094 5.094 -2.814 0 -5.094 -2.28 -5.094 -5.094 s4.075 -10.188 5.094 -10.188 5.094 7.375 5.094 10.188z M8.573 8.438 c0 2.313 -1.875 4.188 -4.188 4.188 -2.313 0 -4.188 -1.875 -4.188 -4.188 S3.547 0.063 4.385 0.063 s4.188 6.062 4.188 8.375z
            path(
                fill = SolidColor(Color(0xFF5DADEC)),
            ) {
                // M 35.906 12.062
                moveTo(x = 35.906f, y = 12.062f)
                // c 0 2.814 -2.28 5.094 -5.094 5.094
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.814f,
                    dx2 = -2.28f,
                    dy2 = 5.094f,
                    dx3 = -5.094f,
                    dy3 = 5.094f,
                )
                // c -2.814 0 -5.094 -2.28 -5.094 -5.094
                curveToRelative(
                    dx1 = -2.814f,
                    dy1 = 0.0f,
                    dx2 = -5.094f,
                    dy2 = -2.28f,
                    dx3 = -5.094f,
                    dy3 = -5.094f,
                )
                // s 4.075 -10.188 5.094 -10.188
                reflectiveCurveToRelative(
                    dx1 = 4.075f,
                    dy1 = -10.188f,
                    dx2 = 5.094f,
                    dy2 = -10.188f,
                )
                // s 5.094 7.375 5.094 10.188z
                reflectiveCurveToRelative(
                    dx1 = 5.094f,
                    dy1 = 7.375f,
                    dx2 = 5.094f,
                    dy2 = 10.188f,
                )
                close()
                // M 8.573 8.438
                moveTo(x = 8.573f, y = 8.438f)
                // c 0 2.313 -1.875 4.188 -4.188 4.188
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.313f,
                    dx2 = -1.875f,
                    dy2 = 4.188f,
                    dx3 = -4.188f,
                    dy3 = 4.188f,
                )
                // c -2.313 0 -4.188 -1.875 -4.188 -4.188
                curveToRelative(
                    dx1 = -2.313f,
                    dy1 = 0.0f,
                    dx2 = -4.188f,
                    dy2 = -1.875f,
                    dx3 = -4.188f,
                    dy3 = -4.188f,
                )
                // S 3.547 0.063 4.385 0.063
                reflectiveCurveTo(
                    x1 = 3.547f,
                    y1 = 0.063f,
                    x2 = 4.385f,
                    y2 = 0.063f,
                )
                // s 4.188 6.062 4.188 8.375z
                reflectiveCurveToRelative(
                    dx1 = 4.188f,
                    dy1 = 6.062f,
                    dx2 = 4.188f,
                    dy2 = 8.375f,
                )
                close()
            }
        }.build().also { _emoji1f975 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f975: ImageVector? = null
