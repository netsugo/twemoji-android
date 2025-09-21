package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f52f: ImageVector
    get() {
        val current = _emoji1f52f
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f52f",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 32 c0 2.209 -1.791 4 -4 4 H4 c-2.209 0 -4 -1.791 -4 -4 V4 c0 -2.209 1.791 -4 4 -4 h28 c2.209 0 4 1.791 4 4 v28z
            path(
                fill = SolidColor(Color(0xFF9266CC)),
            ) {
                // M 36 32
                moveTo(x = 36.0f, y = 32.0f)
                // c 0 2.209 -1.791 4 -4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = -1.791f,
                    dy2 = 4.0f,
                    dx3 = -4.0f,
                    dy3 = 4.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // c -2.209 0 -4 -1.791 -4 -4
                curveToRelative(
                    dx1 = -2.209f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = -1.791f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
                // c 0 -2.209 1.791 -4 4 -4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.209f,
                    dx2 = 1.791f,
                    dy2 = -4.0f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // c 2.209 0 4 1.791 4 4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = 1.791f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // v 28z
                verticalLineToRelative(dy = 28.0f)
                close()
            }
            // M18 34.156 c-1.011 0 -1.928 -0.588 -2.516 -1.614 L3.811 12.168 c-0.602 -1.05 -0.66 -2.149 -0.159 -3.014 0.473 -0.816 1.363 -1.284 2.441 -1.284 h24.816 c1.09 0 1.978 0.473 2.438 1.296 0.485 0.869 0.396 1.961 -0.242 2.997 l-12.63 20.468 c-0.597 0.969 -1.499 1.525 -2.475 1.525z M6.524 10.87 l11.485 20.044 12.365 -20.038 -23.85 -0.006z
            path(
                fill = SolidColor(Color(0xFFF5F8FA)),
            ) {
                // M 18 34.156
                moveTo(x = 18.0f, y = 34.156f)
                // c -1.011 0 -1.928 -0.588 -2.516 -1.614
                curveToRelative(
                    dx1 = -1.011f,
                    dy1 = 0.0f,
                    dx2 = -1.928f,
                    dy2 = -0.588f,
                    dx3 = -2.516f,
                    dy3 = -1.614f,
                )
                // L 3.811 12.168
                lineTo(x = 3.811f, y = 12.168f)
                // c -0.602 -1.05 -0.66 -2.149 -0.159 -3.014
                curveToRelative(
                    dx1 = -0.602f,
                    dy1 = -1.05f,
                    dx2 = -0.66f,
                    dy2 = -2.149f,
                    dx3 = -0.159f,
                    dy3 = -3.014f,
                )
                // c 0.473 -0.816 1.363 -1.284 2.441 -1.284
                curveToRelative(
                    dx1 = 0.473f,
                    dy1 = -0.816f,
                    dx2 = 1.363f,
                    dy2 = -1.284f,
                    dx3 = 2.441f,
                    dy3 = -1.284f,
                )
                // h 24.816
                horizontalLineToRelative(dx = 24.816f)
                // c 1.09 0 1.978 0.473 2.438 1.296
                curveToRelative(
                    dx1 = 1.09f,
                    dy1 = 0.0f,
                    dx2 = 1.978f,
                    dy2 = 0.473f,
                    dx3 = 2.438f,
                    dy3 = 1.296f,
                )
                // c 0.485 0.869 0.396 1.961 -0.242 2.997
                curveToRelative(
                    dx1 = 0.485f,
                    dy1 = 0.869f,
                    dx2 = 0.396f,
                    dy2 = 1.961f,
                    dx3 = -0.242f,
                    dy3 = 2.997f,
                )
                // l -12.63 20.468
                lineToRelative(dx = -12.63f, dy = 20.468f)
                // c -0.597 0.969 -1.499 1.525 -2.475 1.525z
                curveToRelative(
                    dx1 = -0.597f,
                    dy1 = 0.969f,
                    dx2 = -1.499f,
                    dy2 = 1.525f,
                    dx3 = -2.475f,
                    dy3 = 1.525f,
                )
                close()
                // M 6.524 10.87
                moveTo(x = 6.524f, y = 10.87f)
                // l 11.485 20.044
                lineToRelative(dx = 11.485f, dy = 20.044f)
                // l 12.365 -20.038
                lineToRelative(dx = 12.365f, dy = -20.038f)
                // l -23.85 -0.006z
                lineToRelative(dx = -23.85f, dy = -0.006f)
                close()
            }
            // M30.909 27.5 H6.093 c-1.079 0 -1.968 -0.469 -2.441 -1.285 -0.501 -0.865 -0.443 -1.963 0.159 -3.013 L15.484 2.829 c0.589 -1.027 1.505 -1.615 2.516 -1.615 0.976 0 1.878 0.557 2.476 1.527 l12.63 20.466 c0.639 1.035 0.728 2.127 0.242 2.996 -0.46 0.824 -1.349 1.297 -2.439 1.297z M6.528 24.493 l23.85 0.007 L18.009 4.457 6.528 24.493z
            path(
                fill = SolidColor(Color(0xFFF5F8FA)),
            ) {
                // M 30.909 27.5
                moveTo(x = 30.909f, y = 27.5f)
                // H 6.093
                horizontalLineTo(x = 6.093f)
                // c -1.079 0 -1.968 -0.469 -2.441 -1.285
                curveToRelative(
                    dx1 = -1.079f,
                    dy1 = 0.0f,
                    dx2 = -1.968f,
                    dy2 = -0.469f,
                    dx3 = -2.441f,
                    dy3 = -1.285f,
                )
                // c -0.501 -0.865 -0.443 -1.963 0.159 -3.013
                curveToRelative(
                    dx1 = -0.501f,
                    dy1 = -0.865f,
                    dx2 = -0.443f,
                    dy2 = -1.963f,
                    dx3 = 0.159f,
                    dy3 = -3.013f,
                )
                // L 15.484 2.829
                lineTo(x = 15.484f, y = 2.829f)
                // c 0.589 -1.027 1.505 -1.615 2.516 -1.615
                curveToRelative(
                    dx1 = 0.589f,
                    dy1 = -1.027f,
                    dx2 = 1.505f,
                    dy2 = -1.615f,
                    dx3 = 2.516f,
                    dy3 = -1.615f,
                )
                // c 0.976 0 1.878 0.557 2.476 1.527
                curveToRelative(
                    dx1 = 0.976f,
                    dy1 = 0.0f,
                    dx2 = 1.878f,
                    dy2 = 0.557f,
                    dx3 = 2.476f,
                    dy3 = 1.527f,
                )
                // l 12.63 20.466
                lineToRelative(dx = 12.63f, dy = 20.466f)
                // c 0.639 1.035 0.728 2.127 0.242 2.996
                curveToRelative(
                    dx1 = 0.639f,
                    dy1 = 1.035f,
                    dx2 = 0.728f,
                    dy2 = 2.127f,
                    dx3 = 0.242f,
                    dy3 = 2.996f,
                )
                // c -0.46 0.824 -1.349 1.297 -2.439 1.297z
                curveToRelative(
                    dx1 = -0.46f,
                    dy1 = 0.824f,
                    dx2 = -1.349f,
                    dy2 = 1.297f,
                    dx3 = -2.439f,
                    dy3 = 1.297f,
                )
                close()
                // M 6.528 24.493
                moveTo(x = 6.528f, y = 24.493f)
                // l 23.85 0.007
                lineToRelative(dx = 23.85f, dy = 0.007f)
                // L 18.009 4.457
                lineTo(x = 18.009f, y = 4.457f)
                // L 6.528 24.493z
                lineTo(x = 6.528f, y = 24.493f)
                close()
            }
            // M18 18 m-4 0 a4 4 0 1 1 8 0 a4 4 0 1 1 -8 0
            path(
                fill = SolidColor(Color(0xFFF5F8FA)),
            ) {
                // M 18 18
                moveTo(x = 18.0f, y = 18.0f)
                // m -4 0
                moveToRelative(dx = -4.0f, dy = 0.0f)
                // a 4 4 0 1 1 8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 8.0f,
                    dy1 = 0.0f,
                )
                // a 4 4 0 1 1 -8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -8.0f,
                    dy1 = 0.0f,
                )
            }
        }.build().also { _emoji1f52f = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f52f: ImageVector? = null
