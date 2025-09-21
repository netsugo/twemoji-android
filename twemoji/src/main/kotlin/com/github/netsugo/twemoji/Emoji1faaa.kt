package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1faaa: ImageVector
    get() {
        val current = _emoji1faaa
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1faaa",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M35 26.5 a1.5 1.5 0 0 1 -1.5 1.5 h-31 A1.5 1.5 0 0 1 1 26.5 v-19 A1.5 1.5 0 0 1 2.5 6 h31 A1.5 1.5 0 0 1 35 7.5 v19z
            path(
                fill = SolidColor(Color(0xFFDFCEBF)),
            ) {
                // M 35 26.5
                moveTo(x = 35.0f, y = 26.5f)
                // a 1.5 1.5 0 0 1 -1.5 1.5
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.5f,
                    dy1 = 1.5f,
                )
                // h -31
                horizontalLineToRelative(dx = -31.0f)
                // A 1.5 1.5 0 0 1 1 26.5
                arcTo(
                    horizontalEllipseRadius = 1.5f,
                    verticalEllipseRadius = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 1.0f,
                    y1 = 26.5f,
                )
                // v -19
                verticalLineToRelative(dy = -19.0f)
                // A 1.5 1.5 0 0 1 2.5 6
                arcTo(
                    horizontalEllipseRadius = 1.5f,
                    verticalEllipseRadius = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 2.5f,
                    y1 = 6.0f,
                )
                // h 31
                horizontalLineToRelative(dx = 31.0f)
                // A 1.5 1.5 0 0 1 35 7.5
                arcTo(
                    horizontalEllipseRadius = 1.5f,
                    verticalEllipseRadius = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 35.0f,
                    y1 = 7.5f,
                )
                // v 19z
                verticalLineToRelative(dy = 19.0f)
                close()
            }
            // M14 23 a1 1 0 0 1 -1 1 H5 a1 1 0 0 1 -1 -1 V13 a1 1 0 0 1 1 -1 h8 a1 1 0 0 1 1 1 v10z
            path(
                fill = SolidColor(Color(0xFFFFFFF5)),
            ) {
                // M 14 23
                moveTo(x = 14.0f, y = 23.0f)
                // a 1 1 0 0 1 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // H 5
                horizontalLineTo(x = 5.0f)
                // a 1 1 0 0 1 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // V 13
                verticalLineTo(y = 13.0f)
                // a 1 1 0 0 1 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // a 1 1 0 0 1 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // v 10z
                verticalLineToRelative(dy = 10.0f)
                close()
            }
            // M30 15 L18 15 a1 1 0 0 1 0 -2 h12 a1 1 0 0 1 0 2z M26 18 a1 1 0 0 0 -1 -1 h-7 a1 1 0 0 0 0 2 h7 a1 1 0 0 0 1 -1z M29 22 a1 1 0 0 0 -1 -1 L18 21 a1 1 0 0 0 0 2 h10 a1 1 0 0 0 1 -1z M13 24 a1 1 0 0 0 1 -1 v-0.003 a0.74 0.74 0 0 0 -0.34 -0.623 c-0.702 -0.453 -1.778 -0.825 -2.746 -0.991 v-0.819 c0.638 -0.43 1.302 -1.206 1.501 -2.2 0.059 0.033 0.066 0.054 0.132 0.054 0.316 0 0.545 -0.411 0.545 -0.917 0 -0.498 -0.263 -0.902 -0.572 -0.914 0.06 -0.215 0.094 -0.503 0.094 -0.873 0 -1.234 -1.061 -2.714 -3.441 -2.714 -2.115 0 -3.439 1.481 -3.439 2.714 0 0.358 0.022 0.652 0.06 0.879 -0.291 0.044 -0.52 0.431 -0.52 0.908 0 0.506 0.257 0.917 0.573 0.917 0.066 0 0.008 -0.021 0.067 -0.054 0.199 0.994 0.853 1.77 1.491 2.2 v0.77 c-1.021 0.132 -2.298 0.545 -3.088 1.058 a0.7 0.7 0 0 0 -0.317 0.584 L4 23 a1 1 0 0 0 1 1 h8z M19 9 a1 1 0 0 0 -1 -1 L5 8 a1 1 0 0 0 0 2 h13 a1 1 0 0 0 1 -1z
            path(
                fill = SolidColor(Color(0xFF7D7585)),
            ) {
                // M 30 15
                moveTo(x = 30.0f, y = 15.0f)
                // L 18 15
                lineTo(x = 18.0f, y = 15.0f)
                // a 1 1 0 0 1 0 -2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                )
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // a 1 1 0 0 1 0 2z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                )
                close()
                // M 26 18
                moveTo(x = 26.0f, y = 18.0f)
                // a 1 1 0 0 0 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // h -7
                horizontalLineToRelative(dx = -7.0f)
                // a 1 1 0 0 0 0 2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                )
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // a 1 1 0 0 0 1 -1z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                close()
                // M 29 22
                moveTo(x = 29.0f, y = 22.0f)
                // a 1 1 0 0 0 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // L 18 21
                lineTo(x = 18.0f, y = 21.0f)
                // a 1 1 0 0 0 0 2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                )
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // a 1 1 0 0 0 1 -1z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                close()
                // M 13 24
                moveTo(x = 13.0f, y = 24.0f)
                // a 1 1 0 0 0 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // v -0.003
                verticalLineToRelative(dy = -0.003f)
                // a 0.74 0.74 0 0 0 -0.34 -0.623
                arcToRelative(
                    a = 0.74f,
                    b = 0.74f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.34f,
                    dy1 = -0.623f,
                )
                // c -0.702 -0.453 -1.778 -0.825 -2.746 -0.991
                curveToRelative(
                    dx1 = -0.702f,
                    dy1 = -0.453f,
                    dx2 = -1.778f,
                    dy2 = -0.825f,
                    dx3 = -2.746f,
                    dy3 = -0.991f,
                )
                // v -0.819
                verticalLineToRelative(dy = -0.819f)
                // c 0.638 -0.43 1.302 -1.206 1.501 -2.2
                curveToRelative(
                    dx1 = 0.638f,
                    dy1 = -0.43f,
                    dx2 = 1.302f,
                    dy2 = -1.206f,
                    dx3 = 1.501f,
                    dy3 = -2.2f,
                )
                // c 0.059 0.033 0.066 0.054 0.132 0.054
                curveToRelative(
                    dx1 = 0.059f,
                    dy1 = 0.033f,
                    dx2 = 0.066f,
                    dy2 = 0.054f,
                    dx3 = 0.132f,
                    dy3 = 0.054f,
                )
                // c 0.316 0 0.545 -0.411 0.545 -0.917
                curveToRelative(
                    dx1 = 0.316f,
                    dy1 = 0.0f,
                    dx2 = 0.545f,
                    dy2 = -0.411f,
                    dx3 = 0.545f,
                    dy3 = -0.917f,
                )
                // c 0 -0.498 -0.263 -0.902 -0.572 -0.914
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.498f,
                    dx2 = -0.263f,
                    dy2 = -0.902f,
                    dx3 = -0.572f,
                    dy3 = -0.914f,
                )
                // c 0.06 -0.215 0.094 -0.503 0.094 -0.873
                curveToRelative(
                    dx1 = 0.06f,
                    dy1 = -0.215f,
                    dx2 = 0.094f,
                    dy2 = -0.503f,
                    dx3 = 0.094f,
                    dy3 = -0.873f,
                )
                // c 0 -1.234 -1.061 -2.714 -3.441 -2.714
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.234f,
                    dx2 = -1.061f,
                    dy2 = -2.714f,
                    dx3 = -3.441f,
                    dy3 = -2.714f,
                )
                // c -2.115 0 -3.439 1.481 -3.439 2.714
                curveToRelative(
                    dx1 = -2.115f,
                    dy1 = 0.0f,
                    dx2 = -3.439f,
                    dy2 = 1.481f,
                    dx3 = -3.439f,
                    dy3 = 2.714f,
                )
                // c 0 0.358 0.022 0.652 0.06 0.879
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.358f,
                    dx2 = 0.022f,
                    dy2 = 0.652f,
                    dx3 = 0.06f,
                    dy3 = 0.879f,
                )
                // c -0.291 0.044 -0.52 0.431 -0.52 0.908
                curveToRelative(
                    dx1 = -0.291f,
                    dy1 = 0.044f,
                    dx2 = -0.52f,
                    dy2 = 0.431f,
                    dx3 = -0.52f,
                    dy3 = 0.908f,
                )
                // c 0 0.506 0.257 0.917 0.573 0.917
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.506f,
                    dx2 = 0.257f,
                    dy2 = 0.917f,
                    dx3 = 0.573f,
                    dy3 = 0.917f,
                )
                // c 0.066 0 0.008 -0.021 0.067 -0.054
                curveToRelative(
                    dx1 = 0.066f,
                    dy1 = 0.0f,
                    dx2 = 0.008f,
                    dy2 = -0.021f,
                    dx3 = 0.067f,
                    dy3 = -0.054f,
                )
                // c 0.199 0.994 0.853 1.77 1.491 2.2
                curveToRelative(
                    dx1 = 0.199f,
                    dy1 = 0.994f,
                    dx2 = 0.853f,
                    dy2 = 1.77f,
                    dx3 = 1.491f,
                    dy3 = 2.2f,
                )
                // v 0.77
                verticalLineToRelative(dy = 0.77f)
                // c -1.021 0.132 -2.298 0.545 -3.088 1.058
                curveToRelative(
                    dx1 = -1.021f,
                    dy1 = 0.132f,
                    dx2 = -2.298f,
                    dy2 = 0.545f,
                    dx3 = -3.088f,
                    dy3 = 1.058f,
                )
                // a 0.7 0.7 0 0 0 -0.317 0.584
                arcToRelative(
                    a = 0.7f,
                    b = 0.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.317f,
                    dy1 = 0.584f,
                )
                // L 4 23
                lineTo(x = 4.0f, y = 23.0f)
                // a 1 1 0 0 0 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // h 8z
                horizontalLineToRelative(dx = 8.0f)
                close()
                // M 19 9
                moveTo(x = 19.0f, y = 9.0f)
                // a 1 1 0 0 0 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // L 5 8
                lineTo(x = 5.0f, y = 8.0f)
                // a 1 1 0 0 0 0 2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                )
                // h 13
                horizontalLineToRelative(dx = 13.0f)
                // a 1 1 0 0 0 1 -1z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                close()
            }
        }.build().also { _emoji1faaa = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1faaa: ImageVector? = null
