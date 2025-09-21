package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1f11f1e6: ImageVector
    get() {
        val current = _emoji1f1f11f1e6
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1f11f1e6",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M0 27 c0 2.209 1.791 4 4 4 h28 c2.209 0 4 -1.791 4 -4 v-3 H0 v3z M32 5 H4 C1.791 5 0 6.791 0 9 v3 h36 V9 c0 -2.209 -1.791 -4 -4 -4z
            path(
                fill = SolidColor(Color(0xFFCE1126)),
            ) {
                // M 0 27
                moveTo(x = 0.0f, y = 27.0f)
                // c 0 2.209 1.791 4 4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = 1.791f,
                    dy2 = 4.0f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // c 2.209 0 4 -1.791 4 -4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = -1.791f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // H 0
                horizontalLineTo(x = 0.0f)
                // v 3z
                verticalLineToRelative(dy = 3.0f)
                close()
                // M 32 5
                moveTo(x = 32.0f, y = 5.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // C 1.791 5 0 6.791 0 9
                curveTo(
                    x1 = 1.791f,
                    y1 = 5.0f,
                    x2 = 0.0f,
                    y2 = 6.791f,
                    x3 = 0.0f,
                    y3 = 9.0f,
                )
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // V 9
                verticalLineTo(y = 9.0f)
                // c 0 -2.209 -1.791 -4 -4 -4z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.209f,
                    dx2 = -1.791f,
                    dy2 = -4.0f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                close()
            }
            // M0 24 h36 L36 12 L0 12 v12z M18 13 c2.761 0 5 2.239 5 5 s-2.239 5 -5 5 -5 -2.239 -5 -5 2.239 -5 5 -5z
            path(
                fill = SolidColor(Color(0xFF002868)),
            ) {
                // M 0 24
                moveTo(x = 0.0f, y = 24.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // L 36 12
                lineTo(x = 36.0f, y = 12.0f)
                // L 0 12
                lineTo(x = 0.0f, y = 12.0f)
                // v 12z
                verticalLineToRelative(dy = 12.0f)
                close()
                // M 18 13
                moveTo(x = 18.0f, y = 13.0f)
                // c 2.761 0 5 2.239 5 5
                curveToRelative(
                    dx1 = 2.761f,
                    dy1 = 0.0f,
                    dx2 = 5.0f,
                    dy2 = 2.239f,
                    dx3 = 5.0f,
                    dy3 = 5.0f,
                )
                // s -2.239 5 -5 5
                reflectiveCurveToRelative(
                    dx1 = -2.239f,
                    dy1 = 5.0f,
                    dx2 = -5.0f,
                    dy2 = 5.0f,
                )
                // s -5 -2.239 -5 -5
                reflectiveCurveToRelative(
                    dx1 = -5.0f,
                    dy1 = -2.239f,
                    dx2 = -5.0f,
                    dy2 = -5.0f,
                )
                // s 2.239 -5 5 -5z
                reflectiveCurveToRelative(
                    dx1 = 2.239f,
                    dy1 = -5.0f,
                    dx2 = 5.0f,
                    dy2 = -5.0f,
                )
                close()
            }
            // M18 18 m-5 0 a5 5 0 1 1 10 0 a5 5 0 1 1 -10 0
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 18 18
                moveTo(x = 18.0f, y = 18.0f)
                // m -5 0
                moveToRelative(dx = -5.0f, dy = 0.0f)
                // a 5 5 0 1 1 10 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 10.0f,
                    dy1 = 0.0f,
                )
                // a 5 5 0 1 1 -10 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -10.0f,
                    dy1 = 0.0f,
                )
            }
        }.build().also { _emoji1f1f11f1e6 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1f11f1e6: ImageVector? = null
