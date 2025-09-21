package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f6aa: ImageVector
    get() {
        val current = _emoji1f6aa
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f6aa",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M29 34 c0 1.105 -0.895 2 -2 2 H9 c-1.105 0 -2 -0.895 -2 -2 V2 c0 -1.105 0.895 -2 2 -2 h18 c1.105 0 2 0.895 2 2 v32z
            path(
                fill = SolidColor(Color(0xFFBF6952)),
            ) {
                // M 29 34
                moveTo(x = 29.0f, y = 34.0f)
                // c 0 1.105 -0.895 2 -2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.105f,
                    dx2 = -0.895f,
                    dy2 = 2.0f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // H 9
                horizontalLineTo(x = 9.0f)
                // c -1.105 0 -2 -0.895 -2 -2
                curveToRelative(
                    dx1 = -1.105f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -0.895f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // V 2
                verticalLineTo(y = 2.0f)
                // c 0 -1.105 0.895 -2 2 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.105f,
                    dx2 = 0.895f,
                    dy2 = -2.0f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // c 1.105 0 2 0.895 2 2
                curveToRelative(
                    dx1 = 1.105f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 0.895f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                // v 32z
                verticalLineToRelative(dy = 32.0f)
                close()
            }
            // M11 18 m-1.5 0 a1.5 1.5 0 1 1 3 0 a1.5 1.5 0 1 1 -3 0
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 11 18
                moveTo(x = 11.0f, y = 18.0f)
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
            // M25 3 c-0.552 0 -1 0.448 -1 1 v9 L11 13 c-0.552 0 -1 0.448 -1 1 s0.448 1 1 1 h14 c0.552 0 1 -0.448 1 -1 L26 4 c0 -0.552 -0.448 -1 -1 -1z M25 28 c0.552 0 1 0.448 1 1 v3 c0 0.552 -0.448 1 -1 1 L11 33 c-0.552 0 -1 -0.448 -1 -1 s0.448 -1 1 -1 h13 v-2 c0 -0.552 0.448 -1 1 -1z
            path(
                fill = SolidColor(Color(0xFFAC5640)),
            ) {
                // M 25 3
                moveTo(x = 25.0f, y = 3.0f)
                // c -0.552 0 -1 0.448 -1 1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = 0.448f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // v 9
                verticalLineToRelative(dy = 9.0f)
                // L 11 13
                lineTo(x = 11.0f, y = 13.0f)
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
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // c 0.552 0 1 -0.448 1 -1
                curveToRelative(
                    dx1 = 0.552f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -0.448f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // L 26 4
                lineTo(x = 26.0f, y = 4.0f)
                // c 0 -0.552 -0.448 -1 -1 -1z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = -0.448f,
                    dy2 = -1.0f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                close()
                // M 25 28
                moveTo(x = 25.0f, y = 28.0f)
                // c 0.552 0 1 0.448 1 1
                curveToRelative(
                    dx1 = 0.552f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.448f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // c 0 0.552 -0.448 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = -0.448f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // L 11 33
                lineTo(x = 11.0f, y = 33.0f)
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
                // h 13
                horizontalLineToRelative(dx = 13.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // c 0 -0.552 0.448 -1 1 -1z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = 0.448f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                close()
            }
            // M11 33 c-0.552 0 -1 -0.448 -1 -1 v-3 c0 -0.552 0.448 -1 1 -1 h14 c0.552 0 1 0.448 1 1 s-0.448 1 -1 1 H12 v2 c0 0.552 -0.448 1 -1 1z
            path(
                fill = SolidColor(Color(0xFF854836)),
            ) {
                // M 11 33
                moveTo(x = 11.0f, y = 33.0f)
                // c -0.552 0 -1 -0.448 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.448f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // c 0 -0.552 0.448 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = 0.448f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // c 0.552 0 1 0.448 1 1
                curveToRelative(
                    dx1 = 0.552f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.448f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // s -0.448 1 -1 1
                reflectiveCurveToRelative(
                    dx1 = -0.448f,
                    dy1 = 1.0f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                // H 12
                horizontalLineTo(x = 12.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // c 0 0.552 -0.448 1 -1 1z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = -0.448f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                close()
            }
            // M25 21 c0.552 0 1 0.448 1 1 v3 c0 0.552 -0.448 1 -1 1 H11 c-0.552 0 -1 -0.448 -1 -1 s0.448 -1 1 -1 h13 v-2 c0 -0.552 0.448 -1 1 -1z
            path(
                fill = SolidColor(Color(0xFFAC5640)),
            ) {
                // M 25 21
                moveTo(x = 25.0f, y = 21.0f)
                // c 0.552 0 1 0.448 1 1
                curveToRelative(
                    dx1 = 0.552f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.448f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // c 0 0.552 -0.448 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = -0.448f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // H 11
                horizontalLineTo(x = 11.0f)
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
                // h 13
                horizontalLineToRelative(dx = 13.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // c 0 -0.552 0.448 -1 1 -1z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = 0.448f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                close()
            }
            // M11 26 c-0.552 0 -1 -0.448 -1 -1 v-3 c0 -0.552 0.448 -1 1 -1 h14 c0.552 0 1 0.448 1 1 s-0.448 1 -1 1 L12 23 v2 c0 0.552 -0.448 1 -1 1z M11 15 c-0.552 0 -1 -0.448 -1 -1 L10 4 c0 -0.552 0.448 -1 1 -1 h14 c0.552 0 1 0.448 1 1 s-0.448 1 -1 1 L12 5 v9 c0 0.552 -0.448 1 -1 1z
            path(
                fill = SolidColor(Color(0xFF854836)),
            ) {
                // M 11 26
                moveTo(x = 11.0f, y = 26.0f)
                // c -0.552 0 -1 -0.448 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.448f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // c 0 -0.552 0.448 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = 0.448f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // c 0.552 0 1 0.448 1 1
                curveToRelative(
                    dx1 = 0.552f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.448f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // s -0.448 1 -1 1
                reflectiveCurveToRelative(
                    dx1 = -0.448f,
                    dy1 = 1.0f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                // L 12 23
                lineTo(x = 12.0f, y = 23.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // c 0 0.552 -0.448 1 -1 1z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = -0.448f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                close()
                // M 11 15
                moveTo(x = 11.0f, y = 15.0f)
                // c -0.552 0 -1 -0.448 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.448f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // L 10 4
                lineTo(x = 10.0f, y = 4.0f)
                // c 0 -0.552 0.448 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = 0.448f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // c 0.552 0 1 0.448 1 1
                curveToRelative(
                    dx1 = 0.552f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.448f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // s -0.448 1 -1 1
                reflectiveCurveToRelative(
                    dx1 = -0.448f,
                    dy1 = 1.0f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                // L 12 5
                lineTo(x = 12.0f, y = 5.0f)
                // v 9
                verticalLineToRelative(dy = 9.0f)
                // c 0 0.552 -0.448 1 -1 1z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = -0.448f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                close()
            }
        }.build().also { _emoji1f6aa = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f6aa: ImageVector? = null
