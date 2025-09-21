package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f3cf: ImageVector
    get() {
        val current = _emoji1f3cf
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f3cf",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M35.538 26.679 s1.328 2.214 -2.658 6.201 c-3.987 3.986 -6.201 2.658 -6.201 2.658 L7.185 16.046 s0.977 -2.748 3.544 -5.316 c2.568 -2.567 5.316 -3.544 5.316 -3.544 l19.493 19.493z
            path(
                fill = SolidColor(Color(0xFFD99E82)),
            ) {
                // M 35.538 26.679
                moveTo(x = 35.538f, y = 26.679f)
                // s 1.328 2.214 -2.658 6.201
                reflectiveCurveToRelative(
                    dx1 = 1.328f,
                    dy1 = 2.214f,
                    dx2 = -2.658f,
                    dy2 = 6.201f,
                )
                // c -3.987 3.986 -6.201 2.658 -6.201 2.658
                curveToRelative(
                    dx1 = -3.987f,
                    dy1 = 3.986f,
                    dx2 = -6.201f,
                    dy2 = 2.658f,
                    dx3 = -6.201f,
                    dy3 = 2.658f,
                )
                // L 7.185 16.046
                lineTo(x = 7.185f, y = 16.046f)
                // s 0.977 -2.748 3.544 -5.316
                reflectiveCurveToRelative(
                    dx1 = 0.977f,
                    dy1 = -2.748f,
                    dx2 = 3.544f,
                    dy2 = -5.316f,
                )
                // c 2.568 -2.567 5.316 -3.544 5.316 -3.544
                curveToRelative(
                    dx1 = 2.568f,
                    dy1 = -2.567f,
                    dx2 = 5.316f,
                    dy2 = -3.544f,
                    dx3 = 5.316f,
                    dy3 = -3.544f,
                )
                // l 19.493 19.493z
                lineToRelative(dx = 19.493f, dy = 19.493f)
                close()
            }
            // M13.388 9.844 c0.979 0.979 4.522 6.109 3.544 7.088 -0.979 0.978 -6.109 -2.565 -7.088 -3.544 l-8.86 -8.86 C0.006 3.549 0.006 1.963 0.984 0.984 c0.979 -0.978 2.565 -0.978 3.544 0 l8.86 8.86z
            path(
                fill = SolidColor(Color(0xFFC1694F)),
            ) {
                // M 13.388 9.844
                moveTo(x = 13.388f, y = 9.844f)
                // c 0.979 0.979 4.522 6.109 3.544 7.088
                curveToRelative(
                    dx1 = 0.979f,
                    dy1 = 0.979f,
                    dx2 = 4.522f,
                    dy2 = 6.109f,
                    dx3 = 3.544f,
                    dy3 = 7.088f,
                )
                // c -0.979 0.978 -6.109 -2.565 -7.088 -3.544
                curveToRelative(
                    dx1 = -0.979f,
                    dy1 = 0.978f,
                    dx2 = -6.109f,
                    dy2 = -2.565f,
                    dx3 = -7.088f,
                    dy3 = -3.544f,
                )
                // l -8.86 -8.86
                lineToRelative(dx = -8.86f, dy = -8.86f)
                // C 0.006 3.549 0.006 1.963 0.984 0.984
                curveTo(
                    x1 = 0.006f,
                    y1 = 3.549f,
                    x2 = 0.006f,
                    y2 = 1.963f,
                    x3 = 0.984f,
                    y3 = 0.984f,
                )
                // c 0.979 -0.978 2.565 -0.978 3.544 0
                curveToRelative(
                    dx1 = 0.979f,
                    dy1 = -0.978f,
                    dx2 = 2.565f,
                    dy2 = -0.978f,
                    dx3 = 3.544f,
                    dy3 = 0.0f,
                )
                // l 8.86 8.86z
                lineToRelative(dx = 8.86f, dy = 8.86f)
                close()
            }
            // M0.983 4.528 L4.528 0.984 9.844 6.3 6.3 9.844z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 0.983 4.528
                moveTo(x = 0.983f, y = 4.528f)
                // L 4.528 0.984
                lineTo(x = 4.528f, y = 0.984f)
                // L 9.844 6.3
                lineTo(x = 9.844f, y = 6.3f)
                // L 6.3 9.844z
                lineTo(x = 6.3f, y = 9.844f)
                close()
            }
            // M19 31 m-5 0 a5 5 0 1 1 10 0 a5 5 0 1 1 -10 0
            path(
                fill = SolidColor(Color(0xFFBE1931)),
            ) {
                // M 19 31
                moveTo(x = 19.0f, y = 31.0f)
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
            // M19 36 c-0.552 0 -1 -0.447 -1 -1 v-8 c0 -0.553 0.448 -1 1 -1 0.553 0 1 0.447 1 1 v8 c0 0.553 -0.447 1 -1 1z
            path(
                fill = SolidColor(Color(0xFF662113)),
            ) {
                // M 19 36
                moveTo(x = 19.0f, y = 36.0f)
                // c -0.552 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // c 0 -0.553 0.448 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.553f,
                    dx2 = 0.448f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // c 0.553 0 1 0.447 1 1
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.447f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // c 0 0.553 -0.447 1 -1 1z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                close()
            }
        }.build().also { _emoji1f3cf = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f3cf: ImageVector? = null
