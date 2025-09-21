package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f399: ImageVector
    get() {
        val current = _emoji1f399
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f399",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M6 15 h24 v2 L6 17z M21 30 c0 2.208 -0.792 4 -3 4 -2.209 0 -3 -1.792 -3 -4 s0.791 -2 3 -2 c2.208 0 3 -0.208 3 2z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 6 15
                moveTo(x = 6.0f, y = 15.0f)
                // h 24
                horizontalLineToRelative(dx = 24.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // L 6 17z
                lineTo(x = 6.0f, y = 17.0f)
                close()
                // M 21 30
                moveTo(x = 21.0f, y = 30.0f)
                // c 0 2.208 -0.792 4 -3 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.208f,
                    dx2 = -0.792f,
                    dy2 = 4.0f,
                    dx3 = -3.0f,
                    dy3 = 4.0f,
                )
                // c -2.209 0 -3 -1.792 -3 -4
                curveToRelative(
                    dx1 = -2.209f,
                    dy1 = 0.0f,
                    dx2 = -3.0f,
                    dy2 = -1.792f,
                    dx3 = -3.0f,
                    dy3 = -4.0f,
                )
                // s 0.791 -2 3 -2
                reflectiveCurveToRelative(
                    dx1 = 0.791f,
                    dy1 = -2.0f,
                    dx2 = 3.0f,
                    dy2 = -2.0f,
                )
                // c 2.208 0 3 -0.208 3 2z
                curveToRelative(
                    dx1 = 2.208f,
                    dy1 = 0.0f,
                    dx2 = 3.0f,
                    dy2 = -0.208f,
                    dx3 = 3.0f,
                    dy3 = 2.0f,
                )
                close()
            }
            // M18 31 c-6.627 0 -10 1.343 -10 3 v2 h20 v-2 c0 -1.657 -3.373 -3 -10 -3z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 18 31
                moveTo(x = 18.0f, y = 31.0f)
                // c -6.627 0 -10 1.343 -10 3
                curveToRelative(
                    dx1 = -6.627f,
                    dy1 = 0.0f,
                    dx2 = -10.0f,
                    dy2 = 1.343f,
                    dx3 = -10.0f,
                    dy3 = 3.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // c 0 -1.657 -3.373 -3 -10 -3z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.657f,
                    dx2 = -3.373f,
                    dy2 = -3.0f,
                    dx3 = -10.0f,
                    dy3 = -3.0f,
                )
                close()
            }
            // M18 0 c-4.971 0 -9 4.029 -9 9 v7 h18 V9 c0 -4.971 -4.029 -9 -9 -9z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 18 0
                moveTo(x = 18.0f, y = 0.0f)
                // c -4.971 0 -9 4.029 -9 9
                curveToRelative(
                    dx1 = -4.971f,
                    dy1 = 0.0f,
                    dx2 = -9.0f,
                    dy2 = 4.029f,
                    dx3 = -9.0f,
                    dy3 = 9.0f,
                )
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // V 9
                verticalLineTo(y = 9.0f)
                // c 0 -4.971 -4.029 -9 -9 -9z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.971f,
                    dx2 = -4.029f,
                    dy2 = -9.0f,
                    dx3 = -9.0f,
                    dy3 = -9.0f,
                )
                close()
            }
            // M15.5 2.5 m-1.5 0 a1.5 1.5 0 1 1 3 0 a1.5 1.5 0 1 1 -3 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 15.5 2.5
                moveTo(x = 15.5f, y = 2.5f)
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
            // M20.5 2.5 m-1.5 0 a1.5 1.5 0 1 1 3 0 a1.5 1.5 0 1 1 -3 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 20.5 2.5
                moveTo(x = 20.5f, y = 2.5f)
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
            // M17.5 6.5 m-1.5 0 a1.5 1.5 0 1 1 3 0 a1.5 1.5 0 1 1 -3 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 17.5 6.5
                moveTo(x = 17.5f, y = 6.5f)
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
            // M22.5 6.5 m-1.5 0 a1.5 1.5 0 1 1 3 0 a1.5 1.5 0 1 1 -3 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 22.5 6.5
                moveTo(x = 22.5f, y = 6.5f)
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
            // M12.5 6.5 m-1.5 0 a1.5 1.5 0 1 1 3 0 a1.5 1.5 0 1 1 -3 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 12.5 6.5
                moveTo(x = 12.5f, y = 6.5f)
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
            // M15.5 10.5 m-1.5 0 a1.5 1.5 0 1 1 3 0 a1.5 1.5 0 1 1 -3 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 15.5 10.5
                moveTo(x = 15.5f, y = 10.5f)
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
            // M10.5 10.5 m-1.5 0 a1.5 1.5 0 1 1 3 0 a1.5 1.5 0 1 1 -3 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 10.5 10.5
                moveTo(x = 10.5f, y = 10.5f)
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
            // M20.5 10.5 m-1.5 0 a1.5 1.5 0 1 1 3 0 a1.5 1.5 0 1 1 -3 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 20.5 10.5
                moveTo(x = 20.5f, y = 10.5f)
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
            // M25.5 10.5 m-1.5 0 a1.5 1.5 0 1 1 3 0 a1.5 1.5 0 1 1 -3 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 25.5 10.5
                moveTo(x = 25.5f, y = 10.5f)
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
            // M17.5 14.5 m-1.5 0 a1.5 1.5 0 1 1 3 0 a1.5 1.5 0 1 1 -3 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 17.5 14.5
                moveTo(x = 17.5f, y = 14.5f)
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
            // M22.5 14.5 m-1.5 0 a1.5 1.5 0 1 1 3 0 a1.5 1.5 0 1 1 -3 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 22.5 14.5
                moveTo(x = 22.5f, y = 14.5f)
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
            // M12.5 14.5 m-1.5 0 a1.5 1.5 0 1 1 3 0 a1.5 1.5 0 1 1 -3 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 12.5 14.5
                moveTo(x = 12.5f, y = 14.5f)
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
            // M9 15.062 V17 c0 4.971 4.029 9 9 9 s9 -4.029 9 -9 v-1.938 H9z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 9 15.062
                moveTo(x = 9.0f, y = 15.062f)
                // V 17
                verticalLineTo(y = 17.0f)
                // c 0 4.971 4.029 9 9 9
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.971f,
                    dx2 = 4.029f,
                    dy2 = 9.0f,
                    dx3 = 9.0f,
                    dy3 = 9.0f,
                )
                // s 9 -4.029 9 -9
                reflectiveCurveToRelative(
                    dx1 = 9.0f,
                    dy1 = -4.029f,
                    dx2 = 9.0f,
                    dy2 = -9.0f,
                )
                // v -1.938
                verticalLineToRelative(dy = -1.938f)
                // H 9z
                horizontalLineTo(x = 9.0f)
                close()
            }
            // M30 14 c-0.553 0 -1 0.448 -1 1 v2 c0 6.074 -4.925 11 -11 11 S7 23.074 7 17 v-2 c0 -0.552 -0.448 -1 -1 -1 s-1 0.448 -1 1 v2 c0 7.18 5.82 13 13 13 s13 -5.82 13 -13 v-2 c0 -0.552 -0.447 -1 -1 -1z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 30 14
                moveTo(x = 30.0f, y = 14.0f)
                // c -0.553 0 -1 0.448 -1 1
                curveToRelative(
                    dx1 = -0.553f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = 0.448f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // c 0 6.074 -4.925 11 -11 11
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 6.074f,
                    dx2 = -4.925f,
                    dy2 = 11.0f,
                    dx3 = -11.0f,
                    dy3 = 11.0f,
                )
                // S 7 23.074 7 17
                reflectiveCurveTo(
                    x1 = 7.0f,
                    y1 = 23.074f,
                    x2 = 7.0f,
                    y2 = 17.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
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
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // c 0 7.18 5.82 13 13 13
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 7.18f,
                    dx2 = 5.82f,
                    dy2 = 13.0f,
                    dx3 = 13.0f,
                    dy3 = 13.0f,
                )
                // s 13 -5.82 13 -13
                reflectiveCurveToRelative(
                    dx1 = 13.0f,
                    dy1 = -5.82f,
                    dx2 = 13.0f,
                    dy2 = -13.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // c 0 -0.552 -0.447 -1 -1 -1z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = -0.447f,
                    dy2 = -1.0f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                close()
            }
        }.build().also { _emoji1f399 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f399: ImageVector? = null
