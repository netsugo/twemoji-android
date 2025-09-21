package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji23f2: ImageVector
    get() {
        val current = _emoji23f2
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji23f2",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M18 0 C8.611 0 1 7.611 1 17 h0.029 v17 c0 1.1 0.9 2 2 2 H33 c1.1 0 2 -0.9 2 -2 V17 c0 -9.389 -7.611 -17 -17 -17z
            path(
                fill = SolidColor(Color(0xFFAAB8C2)),
            ) {
                // M 18 0
                moveTo(x = 18.0f, y = 0.0f)
                // C 8.611 0 1 7.611 1 17
                curveTo(
                    x1 = 8.611f,
                    y1 = 0.0f,
                    x2 = 1.0f,
                    y2 = 7.611f,
                    x3 = 1.0f,
                    y3 = 17.0f,
                )
                // h 0.029
                horizontalLineToRelative(dx = 0.029f)
                // v 17
                verticalLineToRelative(dy = 17.0f)
                // c 0 1.1 0.9 2 2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.1f,
                    dx2 = 0.9f,
                    dy2 = 2.0f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                // H 33
                horizontalLineTo(x = 33.0f)
                // c 1.1 0 2 -0.9 2 -2
                curveToRelative(
                    dx1 = 1.1f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = -0.9f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // V 17
                verticalLineTo(y = 17.0f)
                // c 0 -9.389 -7.611 -17 -17 -17z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -9.389f,
                    dx2 = -7.611f,
                    dy2 = -17.0f,
                    dx3 = -17.0f,
                    dy3 = -17.0f,
                )
                close()
            }
            // M18 17 m-14 0 a14 14 0 1 1 28 0 a14 14 0 1 1 -28 0
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 18 17
                moveTo(x = 18.0f, y = 17.0f)
                // m -14 0
                moveToRelative(dx = -14.0f, dy = 0.0f)
                // a 14 14 0 1 1 28 0
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 28.0f,
                    dy1 = 0.0f,
                )
                // a 14 14 0 1 1 -28 0
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -28.0f,
                    dy1 = 0.0f,
                )
            }
            // M18 4 c7.18 0 13 5.82 13 13 s-5.82 13 -13 13 S5 24.18 5 17 10.82 4 18 4 m0 -2 C9.729 2 3 8.729 3 17 s6.729 15 15 15 15 -6.729 15 -15 S26.271 2 18 2z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 18 4
                moveTo(x = 18.0f, y = 4.0f)
                // c 7.18 0 13 5.82 13 13
                curveToRelative(
                    dx1 = 7.18f,
                    dy1 = 0.0f,
                    dx2 = 13.0f,
                    dy2 = 5.82f,
                    dx3 = 13.0f,
                    dy3 = 13.0f,
                )
                // s -5.82 13 -13 13
                reflectiveCurveToRelative(
                    dx1 = -5.82f,
                    dy1 = 13.0f,
                    dx2 = -13.0f,
                    dy2 = 13.0f,
                )
                // S 5 24.18 5 17
                reflectiveCurveTo(
                    x1 = 5.0f,
                    y1 = 24.18f,
                    x2 = 5.0f,
                    y2 = 17.0f,
                )
                // S 10.82 4 18 4
                reflectiveCurveTo(
                    x1 = 10.82f,
                    y1 = 4.0f,
                    x2 = 18.0f,
                    y2 = 4.0f,
                )
                // m 0 -2
                moveToRelative(dx = 0.0f, dy = -2.0f)
                // C 9.729 2 3 8.729 3 17
                curveTo(
                    x1 = 9.729f,
                    y1 = 2.0f,
                    x2 = 3.0f,
                    y2 = 8.729f,
                    x3 = 3.0f,
                    y3 = 17.0f,
                )
                // s 6.729 15 15 15
                reflectiveCurveToRelative(
                    dx1 = 6.729f,
                    dy1 = 15.0f,
                    dx2 = 15.0f,
                    dy2 = 15.0f,
                )
                // s 15 -6.729 15 -15
                reflectiveCurveToRelative(
                    dx1 = 15.0f,
                    dy1 = -6.729f,
                    dx2 = 15.0f,
                    dy2 = -15.0f,
                )
                // S 26.271 2 18 2z
                reflectiveCurveTo(
                    x1 = 26.271f,
                    y1 = 2.0f,
                    x2 = 18.0f,
                    y2 = 2.0f,
                )
                close()
            }
            // M19 6 c0 -0.552 -0.448 -1 -1 -1 s-1 0.448 -1 1 v1 c0 0.552 0.448 1 1 1 s1 -0.448 1 -1 L19 6z M19 27 c0 -0.552 -0.448 -1 -1 -1 s-1 0.448 -1 1 v1 c0 0.552 0.448 1 1 1 s1 -0.448 1 -1 v-1z M8 16 L7 16 c-0.552 0 -1 0.448 -1 1 s0.448 1 1 1 h1 c0.552 0 1 -0.448 1 -1 s-0.448 -1 -1 -1z M29 16 h-1 c-0.552 0 -1 0.448 -1 1 s0.448 1 1 1 h1 c0.552 0 1 -0.448 1 -1 s-0.448 -1 -1 -1z M26.707 24.293 L26 23.586 c-0.391 -0.391 -1.024 -0.391 -1.414 0 -0.391 0.391 -0.391 1.024 0 1.414 l0.707 0.707 c0.391 0.391 1.024 0.391 1.414 0 0.391 -0.39 0.391 -1.024 0 -1.414z M10 23.586 l-0.707 0.707 c-0.391 0.391 -0.391 1.024 0 1.414 0.391 0.391 1.024 0.391 1.414 0 l0.707 -0.707 c0.391 -0.391 0.391 -1.024 0 -1.414 -0.39 -0.391 -1.023 -0.391 -1.414 0z M9.293 9.707 l0.707 0.707 c0.391 0.391 1.024 0.391 1.414 0 s0.391 -1.024 0 -1.414 l-0.707 -0.707 c-0.391 -0.391 -1.024 -0.391 -1.414 0 s-0.391 1.024 0 1.414z M26 10.414 l0.707 -0.707 c0.391 -0.391 0.391 -1.024 0 -1.414 -0.391 -0.391 -1.024 -0.391 -1.414 0 L24.586 9 c-0.391 0.391 -0.391 1.024 0 1.414 0.39 0.391 1.023 0.391 1.414 0z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 19 6
                moveTo(x = 19.0f, y = 6.0f)
                // c 0 -0.552 -0.448 -1 -1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = -0.448f,
                    dy2 = -1.0f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // s -1 0.448 -1 1
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.448f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // c 0 0.552 0.448 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = 0.448f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // s 1 -0.448 1 -1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = -0.448f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // L 19 6z
                lineTo(x = 19.0f, y = 6.0f)
                close()
                // M 19 27
                moveTo(x = 19.0f, y = 27.0f)
                // c 0 -0.552 -0.448 -1 -1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = -0.448f,
                    dy2 = -1.0f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // s -1 0.448 -1 1
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.448f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // c 0 0.552 0.448 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = 0.448f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // s 1 -0.448 1 -1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = -0.448f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // v -1z
                verticalLineToRelative(dy = -1.0f)
                close()
                // M 8 16
                moveTo(x = 8.0f, y = 16.0f)
                // L 7 16
                lineTo(x = 7.0f, y = 16.0f)
                // c -0.552 0 -1 0.448 -1 1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = 0.448f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // s 0.448 1 1 1
                reflectiveCurveToRelative(
                    dx1 = 0.448f,
                    dy1 = 1.0f,
                    dx2 = 1.0f,
                    dy2 = 1.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // c 0.552 0 1 -0.448 1 -1
                curveToRelative(
                    dx1 = 0.552f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -0.448f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // s -0.448 -1 -1 -1z
                reflectiveCurveToRelative(
                    dx1 = -0.448f,
                    dy1 = -1.0f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                )
                close()
                // M 29 16
                moveTo(x = 29.0f, y = 16.0f)
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // c -0.552 0 -1 0.448 -1 1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = 0.448f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // s 0.448 1 1 1
                reflectiveCurveToRelative(
                    dx1 = 0.448f,
                    dy1 = 1.0f,
                    dx2 = 1.0f,
                    dy2 = 1.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // c 0.552 0 1 -0.448 1 -1
                curveToRelative(
                    dx1 = 0.552f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -0.448f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // s -0.448 -1 -1 -1z
                reflectiveCurveToRelative(
                    dx1 = -0.448f,
                    dy1 = -1.0f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                )
                close()
                // M 26.707 24.293
                moveTo(x = 26.707f, y = 24.293f)
                // L 26 23.586
                lineTo(x = 26.0f, y = 23.586f)
                // c -0.391 -0.391 -1.024 -0.391 -1.414 0
                curveToRelative(
                    dx1 = -0.391f,
                    dy1 = -0.391f,
                    dx2 = -1.024f,
                    dy2 = -0.391f,
                    dx3 = -1.414f,
                    dy3 = 0.0f,
                )
                // c -0.391 0.391 -0.391 1.024 0 1.414
                curveToRelative(
                    dx1 = -0.391f,
                    dy1 = 0.391f,
                    dx2 = -0.391f,
                    dy2 = 1.024f,
                    dx3 = 0.0f,
                    dy3 = 1.414f,
                )
                // l 0.707 0.707
                lineToRelative(dx = 0.707f, dy = 0.707f)
                // c 0.391 0.391 1.024 0.391 1.414 0
                curveToRelative(
                    dx1 = 0.391f,
                    dy1 = 0.391f,
                    dx2 = 1.024f,
                    dy2 = 0.391f,
                    dx3 = 1.414f,
                    dy3 = 0.0f,
                )
                // c 0.391 -0.39 0.391 -1.024 0 -1.414z
                curveToRelative(
                    dx1 = 0.391f,
                    dy1 = -0.39f,
                    dx2 = 0.391f,
                    dy2 = -1.024f,
                    dx3 = 0.0f,
                    dy3 = -1.414f,
                )
                close()
                // M 10 23.586
                moveTo(x = 10.0f, y = 23.586f)
                // l -0.707 0.707
                lineToRelative(dx = -0.707f, dy = 0.707f)
                // c -0.391 0.391 -0.391 1.024 0 1.414
                curveToRelative(
                    dx1 = -0.391f,
                    dy1 = 0.391f,
                    dx2 = -0.391f,
                    dy2 = 1.024f,
                    dx3 = 0.0f,
                    dy3 = 1.414f,
                )
                // c 0.391 0.391 1.024 0.391 1.414 0
                curveToRelative(
                    dx1 = 0.391f,
                    dy1 = 0.391f,
                    dx2 = 1.024f,
                    dy2 = 0.391f,
                    dx3 = 1.414f,
                    dy3 = 0.0f,
                )
                // l 0.707 -0.707
                lineToRelative(dx = 0.707f, dy = -0.707f)
                // c 0.391 -0.391 0.391 -1.024 0 -1.414
                curveToRelative(
                    dx1 = 0.391f,
                    dy1 = -0.391f,
                    dx2 = 0.391f,
                    dy2 = -1.024f,
                    dx3 = 0.0f,
                    dy3 = -1.414f,
                )
                // c -0.39 -0.391 -1.023 -0.391 -1.414 0z
                curveToRelative(
                    dx1 = -0.39f,
                    dy1 = -0.391f,
                    dx2 = -1.023f,
                    dy2 = -0.391f,
                    dx3 = -1.414f,
                    dy3 = 0.0f,
                )
                close()
                // M 9.293 9.707
                moveTo(x = 9.293f, y = 9.707f)
                // l 0.707 0.707
                lineToRelative(dx = 0.707f, dy = 0.707f)
                // c 0.391 0.391 1.024 0.391 1.414 0
                curveToRelative(
                    dx1 = 0.391f,
                    dy1 = 0.391f,
                    dx2 = 1.024f,
                    dy2 = 0.391f,
                    dx3 = 1.414f,
                    dy3 = 0.0f,
                )
                // s 0.391 -1.024 0 -1.414
                reflectiveCurveToRelative(
                    dx1 = 0.391f,
                    dy1 = -1.024f,
                    dx2 = 0.0f,
                    dy2 = -1.414f,
                )
                // l -0.707 -0.707
                lineToRelative(dx = -0.707f, dy = -0.707f)
                // c -0.391 -0.391 -1.024 -0.391 -1.414 0
                curveToRelative(
                    dx1 = -0.391f,
                    dy1 = -0.391f,
                    dx2 = -1.024f,
                    dy2 = -0.391f,
                    dx3 = -1.414f,
                    dy3 = 0.0f,
                )
                // s -0.391 1.024 0 1.414z
                reflectiveCurveToRelative(
                    dx1 = -0.391f,
                    dy1 = 1.024f,
                    dx2 = 0.0f,
                    dy2 = 1.414f,
                )
                close()
                // M 26 10.414
                moveTo(x = 26.0f, y = 10.414f)
                // l 0.707 -0.707
                lineToRelative(dx = 0.707f, dy = -0.707f)
                // c 0.391 -0.391 0.391 -1.024 0 -1.414
                curveToRelative(
                    dx1 = 0.391f,
                    dy1 = -0.391f,
                    dx2 = 0.391f,
                    dy2 = -1.024f,
                    dx3 = 0.0f,
                    dy3 = -1.414f,
                )
                // c -0.391 -0.391 -1.024 -0.391 -1.414 0
                curveToRelative(
                    dx1 = -0.391f,
                    dy1 = -0.391f,
                    dx2 = -1.024f,
                    dy2 = -0.391f,
                    dx3 = -1.414f,
                    dy3 = 0.0f,
                )
                // L 24.586 9
                lineTo(x = 24.586f, y = 9.0f)
                // c -0.391 0.391 -0.391 1.024 0 1.414
                curveToRelative(
                    dx1 = -0.391f,
                    dy1 = 0.391f,
                    dx2 = -0.391f,
                    dy2 = 1.024f,
                    dx3 = 0.0f,
                    dy3 = 1.414f,
                )
                // c 0.39 0.391 1.023 0.391 1.414 0z
                curveToRelative(
                    dx1 = 0.39f,
                    dy1 = 0.391f,
                    dx2 = 1.023f,
                    dy2 = 0.391f,
                    dx3 = 1.414f,
                    dy3 = 0.0f,
                )
                close()
            }
            // M8.915 13.839 c-0.095 -0.238 -0.099 -0.512 0.011 -0.765 0.218 -0.507 0.806 -0.741 1.314 -0.523 l8.154 3.51 c0.507 0.218 0.741 0.806 0.523 1.314 -0.218 0.507 -0.806 0.741 -1.314 0.523 l-8.154 -3.51 c-0.254 -0.11 -0.439 -0.311 -0.534 -0.549z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 8.915 13.839
                moveTo(x = 8.915f, y = 13.839f)
                // c -0.095 -0.238 -0.099 -0.512 0.011 -0.765
                curveToRelative(
                    dx1 = -0.095f,
                    dy1 = -0.238f,
                    dx2 = -0.099f,
                    dy2 = -0.512f,
                    dx3 = 0.011f,
                    dy3 = -0.765f,
                )
                // c 0.218 -0.507 0.806 -0.741 1.314 -0.523
                curveToRelative(
                    dx1 = 0.218f,
                    dy1 = -0.507f,
                    dx2 = 0.806f,
                    dy2 = -0.741f,
                    dx3 = 1.314f,
                    dy3 = -0.523f,
                )
                // l 8.154 3.51
                lineToRelative(dx = 8.154f, dy = 3.51f)
                // c 0.507 0.218 0.741 0.806 0.523 1.314
                curveToRelative(
                    dx1 = 0.507f,
                    dy1 = 0.218f,
                    dx2 = 0.741f,
                    dy2 = 0.806f,
                    dx3 = 0.523f,
                    dy3 = 1.314f,
                )
                // c -0.218 0.507 -0.806 0.741 -1.314 0.523
                curveToRelative(
                    dx1 = -0.218f,
                    dy1 = 0.507f,
                    dx2 = -0.806f,
                    dy2 = 0.741f,
                    dx3 = -1.314f,
                    dy3 = 0.523f,
                )
                // l -8.154 -3.51
                lineToRelative(dx = -8.154f, dy = -3.51f)
                // c -0.254 -0.11 -0.439 -0.311 -0.534 -0.549z
                curveToRelative(
                    dx1 = -0.254f,
                    dy1 = -0.11f,
                    dx2 = -0.439f,
                    dy2 = -0.311f,
                    dx3 = -0.534f,
                    dy3 = -0.549f,
                )
                close()
            }
        }.build().also { _emoji23f2 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji23f2: ImageVector? = null
