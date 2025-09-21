package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f94c: ImageVector
    get() {
        val current = _emoji1f94c
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f94c",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M28 12 H13 V8 c0 -0.552 0.448 -1 1 -1 h11 c1.104 0 2 -0.896 2 -2 s-0.896 -2 -2 -2 H14 c-2.761 0 -5 2.239 -5 5 v4 H8 c-1.104 0 -2 0.896 -2 2 s0.896 2 2 2 h20 c1.104 0 2 -0.896 2 -2 s-0.896 -2 -2 -2z
            path(
                fill = SolidColor(Color(0xFFBE1931)),
            ) {
                // M 28 12
                moveTo(x = 28.0f, y = 12.0f)
                // H 13
                horizontalLineTo(x = 13.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // c 0 -0.552 0.448 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = 0.448f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 11
                horizontalLineToRelative(dx = 11.0f)
                // c 1.104 0 2 -0.896 2 -2
                curveToRelative(
                    dx1 = 1.104f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = -0.896f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // s -0.896 -2 -2 -2
                reflectiveCurveToRelative(
                    dx1 = -0.896f,
                    dy1 = -2.0f,
                    dx2 = -2.0f,
                    dy2 = -2.0f,
                )
                // H 14
                horizontalLineTo(x = 14.0f)
                // c -2.761 0 -5 2.239 -5 5
                curveToRelative(
                    dx1 = -2.761f,
                    dy1 = 0.0f,
                    dx2 = -5.0f,
                    dy2 = 2.239f,
                    dx3 = -5.0f,
                    dy3 = 5.0f,
                )
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // c -1.104 0 -2 0.896 -2 2
                curveToRelative(
                    dx1 = -1.104f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = 0.896f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // s 0.896 2 2 2
                reflectiveCurveToRelative(
                    dx1 = 0.896f,
                    dy1 = 2.0f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                )
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // c 1.104 0 2 -0.896 2 -2
                curveToRelative(
                    dx1 = 1.104f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = -0.896f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // s -0.896 -2 -2 -2z
                reflectiveCurveToRelative(
                    dx1 = -0.896f,
                    dy1 = -2.0f,
                    dx2 = -2.0f,
                    dy2 = -2.0f,
                )
                close()
            }
            // M36 25 c0 3.313 -2.687 6 -6 6 H6 c-3.313 0 -6 -2.687 -6 -6 v-5 c0 -3.313 2.687 -6 6 -6 h24 c3.313 0 6 2.687 6 6 v5z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 36 25
                moveTo(x = 36.0f, y = 25.0f)
                // c 0 3.313 -2.687 6 -6 6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.313f,
                    dx2 = -2.687f,
                    dy2 = 6.0f,
                    dx3 = -6.0f,
                    dy3 = 6.0f,
                )
                // H 6
                horizontalLineTo(x = 6.0f)
                // c -3.313 0 -6 -2.687 -6 -6
                curveToRelative(
                    dx1 = -3.313f,
                    dy1 = 0.0f,
                    dx2 = -6.0f,
                    dy2 = -2.687f,
                    dx3 = -6.0f,
                    dy3 = -6.0f,
                )
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // c 0 -3.313 2.687 -6 6 -6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.313f,
                    dx2 = 2.687f,
                    dy2 = -6.0f,
                    dx3 = 6.0f,
                    dy3 = -6.0f,
                )
                // h 24
                horizontalLineToRelative(dx = 24.0f)
                // c 3.313 0 6 2.687 6 6
                curveToRelative(
                    dx1 = 3.313f,
                    dy1 = 0.0f,
                    dx2 = 6.0f,
                    dy2 = 2.687f,
                    dx3 = 6.0f,
                    dy3 = 6.0f,
                )
                // v 5z
                verticalLineToRelative(dy = 5.0f)
                close()
            }
            // M0 20 h36 v5 H0z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 0 20
                moveTo(x = 0.0f, y = 20.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // H 0z
                horizontalLineTo(x = 0.0f)
                close()
            }
        }.build().also { _emoji1f94c = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f94c: ImageVector? = null
