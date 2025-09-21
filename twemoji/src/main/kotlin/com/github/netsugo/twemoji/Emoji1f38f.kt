package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f38f: ImageVector
    get() {
        val current = _emoji1f38f
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f38f",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M3 3 h2 v33 H3z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 3 3
                moveTo(x = 3.0f, y = 3.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 33
                verticalLineToRelative(dy = 33.0f)
                // H 3z
                horizontalLineTo(x = 3.0f)
                close()
            }
            // M4 3 m-3 0 a3 3 0 1 1 6 0 a3 3 0 1 1 -6 0
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 4 3
                moveTo(x = 4.0f, y = 3.0f)
                // m -3 0
                moveToRelative(dx = -3.0f, dy = 0.0f)
                // a 3 3 0 1 1 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // a 3 3 0 1 1 -6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
            }
            // M9 28 H4 c-0.552 0 -1 -0.447 -1 -1 s0.448 -1 1 -1 h5 c0.552 0 1 0.447 1 1 s-0.448 1 -1 1z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 9 28
                moveTo(x = 9.0f, y = 28.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
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
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // c 0.552 0 1 0.447 1 1
                curveToRelative(
                    dx1 = 0.552f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.447f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // s -0.448 1 -1 1z
                reflectiveCurveToRelative(
                    dx1 = -0.448f,
                    dy1 = 1.0f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                close()
            }
            // M31 27 c0 -2.209 6.209 -6 4 -6 h-8.447 c-1.203 -1.464 -4.595 -3 -7.053 -3 -2.459 0 -3.23 1.536 -3.435 3 H10 c-2.209 0 -3 1.791 -3 4 v4 c0 2.209 0.791 4 3 4 h25 c2.209 0 -4 -3.791 -4 -6z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 31 27
                moveTo(x = 31.0f, y = 27.0f)
                // c 0 -2.209 6.209 -6 4 -6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.209f,
                    dx2 = 6.209f,
                    dy2 = -6.0f,
                    dx3 = 4.0f,
                    dy3 = -6.0f,
                )
                // h -8.447
                horizontalLineToRelative(dx = -8.447f)
                // c -1.203 -1.464 -4.595 -3 -7.053 -3
                curveToRelative(
                    dx1 = -1.203f,
                    dy1 = -1.464f,
                    dx2 = -4.595f,
                    dy2 = -3.0f,
                    dx3 = -7.053f,
                    dy3 = -3.0f,
                )
                // c -2.459 0 -3.23 1.536 -3.435 3
                curveToRelative(
                    dx1 = -2.459f,
                    dy1 = 0.0f,
                    dx2 = -3.23f,
                    dy2 = 1.536f,
                    dx3 = -3.435f,
                    dy3 = 3.0f,
                )
                // H 10
                horizontalLineTo(x = 10.0f)
                // c -2.209 0 -3 1.791 -3 4
                curveToRelative(
                    dx1 = -2.209f,
                    dy1 = 0.0f,
                    dx2 = -3.0f,
                    dy2 = 1.791f,
                    dx3 = -3.0f,
                    dy3 = 4.0f,
                )
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // c 0 2.209 0.791 4 3 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = 0.791f,
                    dy2 = 4.0f,
                    dx3 = 3.0f,
                    dy3 = 4.0f,
                )
                // h 25
                horizontalLineToRelative(dx = 25.0f)
                // c 2.209 0 -4 -3.791 -4 -6z
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = -3.791f,
                    dx3 = -4.0f,
                    dy3 = -6.0f,
                )
                close()
            }
            // M12 25 m-3 0 a3 3 0 1 1 6 0 a3 3 0 1 1 -6 0
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 12 25
                moveTo(x = 12.0f, y = 25.0f)
                // m -3 0
                moveToRelative(dx = -3.0f, dy = 0.0f)
                // a 3 3 0 1 1 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // a 3 3 0 1 1 -6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
            }
            // M11.5 24.5 m-1.5 0 a1.5 1.5 0 1 1 3 0 a1.5 1.5 0 1 1 -3 0
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 11.5 24.5
                moveTo(x = 11.5f, y = 24.5f)
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
            // M35 21 H15.962 c2.068 2.286 4.742 6.465 -0.037 12 H35 c2.209 0 -4 -3.791 -4 -6 s6.209 -6 4 -6z
            path(
                fill = SolidColor(Color(0xFFF4ABBA)),
            ) {
                // M 35 21
                moveTo(x = 35.0f, y = 21.0f)
                // H 15.962
                horizontalLineTo(x = 15.962f)
                // c 2.068 2.286 4.742 6.465 -0.037 12
                curveToRelative(
                    dx1 = 2.068f,
                    dy1 = 2.286f,
                    dx2 = 4.742f,
                    dy2 = 6.465f,
                    dx3 = -0.037f,
                    dy3 = 12.0f,
                )
                // H 35
                horizontalLineTo(x = 35.0f)
                // c 2.209 0 -4 -3.791 -4 -6
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = -3.791f,
                    dx3 = -4.0f,
                    dy3 = -6.0f,
                )
                // s 6.209 -6 4 -6z
                reflectiveCurveToRelative(
                    dx1 = 6.209f,
                    dy1 = -6.0f,
                    dx2 = 4.0f,
                    dy2 = -6.0f,
                )
                close()
            }
            // M9 12 H4 c-0.552 0 -1 -0.448 -1 -1 s0.448 -1 1 -1 h5 c0.552 0 1 0.448 1 1 s-0.448 1 -1 1z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 9 12
                moveTo(x = 9.0f, y = 12.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
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
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // c 0.552 0 1 0.448 1 1
                curveToRelative(
                    dx1 = 0.552f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.448f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // s -0.448 1 -1 1z
                reflectiveCurveToRelative(
                    dx1 = -0.448f,
                    dy1 = 1.0f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                close()
            }
            // M31 11 c0 -2.209 6.209 -6 4 -6 h-8.446 c-1.203 -1.464 -4.595 -3 -7.054 -3 -2.459 0 -3.23 1.536 -3.435 3 H10 C7.791 5 7 6.791 7 9 v4 c0 2.209 0.791 4 3 4 h25 c2.209 0 -4 -3.791 -4 -6z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 31 11
                moveTo(x = 31.0f, y = 11.0f)
                // c 0 -2.209 6.209 -6 4 -6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.209f,
                    dx2 = 6.209f,
                    dy2 = -6.0f,
                    dx3 = 4.0f,
                    dy3 = -6.0f,
                )
                // h -8.446
                horizontalLineToRelative(dx = -8.446f)
                // c -1.203 -1.464 -4.595 -3 -7.054 -3
                curveToRelative(
                    dx1 = -1.203f,
                    dy1 = -1.464f,
                    dx2 = -4.595f,
                    dy2 = -3.0f,
                    dx3 = -7.054f,
                    dy3 = -3.0f,
                )
                // c -2.459 0 -3.23 1.536 -3.435 3
                curveToRelative(
                    dx1 = -2.459f,
                    dy1 = 0.0f,
                    dx2 = -3.23f,
                    dy2 = 1.536f,
                    dx3 = -3.435f,
                    dy3 = 3.0f,
                )
                // H 10
                horizontalLineTo(x = 10.0f)
                // C 7.791 5 7 6.791 7 9
                curveTo(
                    x1 = 7.791f,
                    y1 = 5.0f,
                    x2 = 7.0f,
                    y2 = 6.791f,
                    x3 = 7.0f,
                    y3 = 9.0f,
                )
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // c 0 2.209 0.791 4 3 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = 0.791f,
                    dy2 = 4.0f,
                    dx3 = 3.0f,
                    dy3 = 4.0f,
                )
                // h 25
                horizontalLineToRelative(dx = 25.0f)
                // c 2.209 0 -4 -3.791 -4 -6z
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = -3.791f,
                    dx3 = -4.0f,
                    dy3 = -6.0f,
                )
                close()
            }
            // M12 9 m-3 0 a3 3 0 1 1 6 0 a3 3 0 1 1 -6 0
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 12 9
                moveTo(x = 12.0f, y = 9.0f)
                // m -3 0
                moveToRelative(dx = -3.0f, dy = 0.0f)
                // a 3 3 0 1 1 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // a 3 3 0 1 1 -6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
            }
            // M11.5 8.5 m-1.5 0 a1.5 1.5 0 1 1 3 0 a1.5 1.5 0 1 1 -3 0
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 11.5 8.5
                moveTo(x = 11.5f, y = 8.5f)
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
            // M35 5 H15.962 c2.068 2.286 4.742 6.465 -0.037 12 H35 c2.209 0 -4 -3.791 -4 -6 s6.209 -6 4 -6z
            path(
                fill = SolidColor(Color(0xFFBBDDF5)),
            ) {
                // M 35 5
                moveTo(x = 35.0f, y = 5.0f)
                // H 15.962
                horizontalLineTo(x = 15.962f)
                // c 2.068 2.286 4.742 6.465 -0.037 12
                curveToRelative(
                    dx1 = 2.068f,
                    dy1 = 2.286f,
                    dx2 = 4.742f,
                    dy2 = 6.465f,
                    dx3 = -0.037f,
                    dy3 = 12.0f,
                )
                // H 35
                horizontalLineTo(x = 35.0f)
                // c 2.209 0 -4 -3.791 -4 -6
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = -3.791f,
                    dx3 = -4.0f,
                    dy3 = -6.0f,
                )
                // s 6.209 -6 4 -6z
                reflectiveCurveToRelative(
                    dx1 = 6.209f,
                    dy1 = -6.0f,
                    dx2 = 4.0f,
                    dy2 = -6.0f,
                )
                close()
            }
        }.build().also { _emoji1f38f = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f38f: ImageVector? = null
