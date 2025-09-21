package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1ec1f1f1: ImageVector
    get() {
        val current = _emoji1f1ec1f1f1
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1ec1f1f1",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M0 27 c0 2.209 1.791 4 4 4 h28 c2.209 0 4 -1.791 4 -4 v-9 H0 v9z
            path(
                fill = SolidColor(Color(0xFFD00C33)),
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
                // v -9
                verticalLineToRelative(dy = -9.0f)
                // H 0
                horizontalLineTo(x = 0.0f)
                // v 9z
                verticalLineToRelative(dy = 9.0f)
                close()
            }
            // M32 5 H4 C1.791 5 0 6.791 0 9 v9 h36 V9 c0 -2.209 -1.791 -4 -4 -4z
            path(
                fill = SolidColor(Color(0xFFEEEEEE)),
            ) {
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
                // v 9
                verticalLineToRelative(dy = 9.0f)
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
            // M13.5 18 m-8 0 a8 8 0 1 1 16 0 a8 8 0 1 1 -16 0
            path(
                fill = SolidColor(Color(0xFFEEEEEE)),
            ) {
                // M 13.5 18
                moveTo(x = 13.5f, y = 18.0f)
                // m -8 0
                moveToRelative(dx = -8.0f, dy = 0.0f)
                // a 8 8 0 1 1 16 0
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 16.0f,
                    dy1 = 0.0f,
                )
                // a 8 8 0 1 1 -16 0
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -16.0f,
                    dy1 = 0.0f,
                )
            }
            // M13.5 10 c-4.418 0 -8 3.582 -8 8 h16 c0 -4.418 -3.582 -8 -8 -8z
            path(
                fill = SolidColor(Color(0xFFD00C33)),
            ) {
                // M 13.5 10
                moveTo(x = 13.5f, y = 10.0f)
                // c -4.418 0 -8 3.582 -8 8
                curveToRelative(
                    dx1 = -4.418f,
                    dy1 = 0.0f,
                    dx2 = -8.0f,
                    dy2 = 3.582f,
                    dx3 = -8.0f,
                    dy3 = 8.0f,
                )
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // c 0 -4.418 -3.582 -8 -8 -8z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.418f,
                    dx2 = -3.582f,
                    dy2 = -8.0f,
                    dx3 = -8.0f,
                    dy3 = -8.0f,
                )
                close()
            }
        }.build().also { _emoji1f1ec1f1f1 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1ec1f1f1: ImageVector? = null
