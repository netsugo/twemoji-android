package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f3d1: ImageVector
    get() {
        val current = _emoji1f3d1
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f3d1",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M4 21 c2.409 0 2 2 2 3 s0 3 2 3 3.464 -2.465 7 -6 L36 0 v7 S22.5 21.5 18 26 s-7 7 -10 7 c-3.513 0 -7 -2.605 -7 -7 0 -4 2 -5 3 -5z
            path(
                fill = SolidColor(Color(0xFFC1694F)),
            ) {
                // M 4 21
                moveTo(x = 4.0f, y = 21.0f)
                // c 2.409 0 2 2 2 3
                curveToRelative(
                    dx1 = 2.409f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                    dx3 = 2.0f,
                    dy3 = 3.0f,
                )
                // s 0 3 2 3
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.0f,
                    dx2 = 2.0f,
                    dy2 = 3.0f,
                )
                // s 3.464 -2.465 7 -6
                reflectiveCurveToRelative(
                    dx1 = 3.464f,
                    dy1 = -2.465f,
                    dx2 = 7.0f,
                    dy2 = -6.0f,
                )
                // L 36 0
                lineTo(x = 36.0f, y = 0.0f)
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // S 22.5 21.5 18 26
                reflectiveCurveTo(
                    x1 = 22.5f,
                    y1 = 21.5f,
                    x2 = 18.0f,
                    y2 = 26.0f,
                )
                // s -7 7 -10 7
                reflectiveCurveToRelative(
                    dx1 = -7.0f,
                    dy1 = 7.0f,
                    dx2 = -10.0f,
                    dy2 = 7.0f,
                )
                // c -3.513 0 -7 -2.605 -7 -7
                curveToRelative(
                    dx1 = -3.513f,
                    dy1 = 0.0f,
                    dx2 = -7.0f,
                    dy2 = -2.605f,
                    dx3 = -7.0f,
                    dy3 = -7.0f,
                )
                // c 0 -4 2 -5 3 -5z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.0f,
                    dx2 = 2.0f,
                    dy2 = -5.0f,
                    dx3 = 3.0f,
                    dy3 = -5.0f,
                )
                close()
            }
            // M26.5 29.5 m-6.5 0 a6.5 6.5 0 1 1 13 0 a6.5 6.5 0 1 1 -13 0
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 26.5 29.5
                moveTo(x = 26.5f, y = 29.5f)
                // m -6.5 0
                moveToRelative(dx = -6.5f, dy = 0.0f)
                // a 6.5 6.5 0 1 1 13 0
                arcToRelative(
                    a = 6.5f,
                    b = 6.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 13.0f,
                    dy1 = 0.0f,
                )
                // a 6.5 6.5 0 1 1 -13 0
                arcToRelative(
                    a = 6.5f,
                    b = 6.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -13.0f,
                    dy1 = 0.0f,
                )
            }
            // M25.01 18.712 C30.254 13.171 36 7 36 7 V0 L25.01 10.99 v7.722z M22 21.878 l1 -1.049 V13 l-1 1 v7.878z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 25.01 18.712
                moveTo(x = 25.01f, y = 18.712f)
                // C 30.254 13.171 36 7 36 7
                curveTo(
                    x1 = 30.254f,
                    y1 = 13.171f,
                    x2 = 36.0f,
                    y2 = 7.0f,
                    x3 = 36.0f,
                    y3 = 7.0f,
                )
                // V 0
                verticalLineTo(y = 0.0f)
                // L 25.01 10.99
                lineTo(x = 25.01f, y = 10.99f)
                // v 7.722z
                verticalLineToRelative(dy = 7.722f)
                close()
                // M 22 21.878
                moveTo(x = 22.0f, y = 21.878f)
                // l 1 -1.049
                lineToRelative(dx = 1.0f, dy = -1.049f)
                // V 13
                verticalLineTo(y = 13.0f)
                // l -1 1
                lineToRelative(dx = -1.0f, dy = 1.0f)
                // v 7.878z
                verticalLineToRelative(dy = 7.878f)
                close()
            }
        }.build().also { _emoji1f3d1 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f3d1: ImageVector? = null
