package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f62d: ImageVector
    get() {
        val current = _emoji1f62d
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f62d",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 18 c0 9.941 -8.059 18 -18 18 S0 27.941 0 18 8.059 0 18 0 s18 8.059 18 18
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 36 18
                moveTo(x = 36.0f, y = 18.0f)
                // c 0 9.941 -8.059 18 -18 18
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 9.941f,
                    dx2 = -8.059f,
                    dy2 = 18.0f,
                    dx3 = -18.0f,
                    dy3 = 18.0f,
                )
                // S 0 27.941 0 18
                reflectiveCurveTo(
                    x1 = 0.0f,
                    y1 = 27.941f,
                    x2 = 0.0f,
                    y2 = 18.0f,
                )
                // S 8.059 0 18 0
                reflectiveCurveTo(
                    x1 = 8.059f,
                    y1 = 0.0f,
                    x2 = 18.0f,
                    y2 = 0.0f,
                )
                // s 18 8.059 18 18
                reflectiveCurveToRelative(
                    dx1 = 18.0f,
                    dy1 = 8.059f,
                    dx2 = 18.0f,
                    dy2 = 18.0f,
                )
            }
            // M22 27 c0 2.763 -1.791 3 -4 3 -2.21 0 -4 -0.237 -4 -3 0 -2.761 1.79 -6 4 -6 2.209 0 4 3.239 4 6z M30 15 c-0.124 0 -0.25 -0.023 -0.371 -0.072 -5.229 -2.091 -7.372 -5.241 -7.461 -5.374 -0.307 -0.46 -0.183 -1.081 0.277 -1.387 0.459 -0.306 1.077 -0.184 1.385 0.274 0.019 0.027 1.93 2.785 6.541 4.629 0.513 0.206 0.763 0.787 0.558 1.3 -0.157 0.392 -0.533 0.63 -0.929 0.63z M6 15 c-0.397 0 -0.772 -0.238 -0.929 -0.629 -0.205 -0.513 0.044 -1.095 0.557 -1.3 4.612 -1.844 6.523 -4.602 6.542 -4.629 0.308 -0.456 0.929 -0.577 1.387 -0.27 0.457 0.308 0.581 0.925 0.275 1.383 -0.089 0.133 -2.232 3.283 -7.46 5.374 C6.25 14.977 6.124 15 6 15z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 22 27
                moveTo(x = 22.0f, y = 27.0f)
                // c 0 2.763 -1.791 3 -4 3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.763f,
                    dx2 = -1.791f,
                    dy2 = 3.0f,
                    dx3 = -4.0f,
                    dy3 = 3.0f,
                )
                // c -2.21 0 -4 -0.237 -4 -3
                curveToRelative(
                    dx1 = -2.21f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = -0.237f,
                    dx3 = -4.0f,
                    dy3 = -3.0f,
                )
                // c 0 -2.761 1.79 -6 4 -6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.761f,
                    dx2 = 1.79f,
                    dy2 = -6.0f,
                    dx3 = 4.0f,
                    dy3 = -6.0f,
                )
                // c 2.209 0 4 3.239 4 6z
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = 3.239f,
                    dx3 = 4.0f,
                    dy3 = 6.0f,
                )
                close()
                // M 30 15
                moveTo(x = 30.0f, y = 15.0f)
                // c -0.124 0 -0.25 -0.023 -0.371 -0.072
                curveToRelative(
                    dx1 = -0.124f,
                    dy1 = 0.0f,
                    dx2 = -0.25f,
                    dy2 = -0.023f,
                    dx3 = -0.371f,
                    dy3 = -0.072f,
                )
                // c -5.229 -2.091 -7.372 -5.241 -7.461 -5.374
                curveToRelative(
                    dx1 = -5.229f,
                    dy1 = -2.091f,
                    dx2 = -7.372f,
                    dy2 = -5.241f,
                    dx3 = -7.461f,
                    dy3 = -5.374f,
                )
                // c -0.307 -0.46 -0.183 -1.081 0.277 -1.387
                curveToRelative(
                    dx1 = -0.307f,
                    dy1 = -0.46f,
                    dx2 = -0.183f,
                    dy2 = -1.081f,
                    dx3 = 0.277f,
                    dy3 = -1.387f,
                )
                // c 0.459 -0.306 1.077 -0.184 1.385 0.274
                curveToRelative(
                    dx1 = 0.459f,
                    dy1 = -0.306f,
                    dx2 = 1.077f,
                    dy2 = -0.184f,
                    dx3 = 1.385f,
                    dy3 = 0.274f,
                )
                // c 0.019 0.027 1.93 2.785 6.541 4.629
                curveToRelative(
                    dx1 = 0.019f,
                    dy1 = 0.027f,
                    dx2 = 1.93f,
                    dy2 = 2.785f,
                    dx3 = 6.541f,
                    dy3 = 4.629f,
                )
                // c 0.513 0.206 0.763 0.787 0.558 1.3
                curveToRelative(
                    dx1 = 0.513f,
                    dy1 = 0.206f,
                    dx2 = 0.763f,
                    dy2 = 0.787f,
                    dx3 = 0.558f,
                    dy3 = 1.3f,
                )
                // c -0.157 0.392 -0.533 0.63 -0.929 0.63z
                curveToRelative(
                    dx1 = -0.157f,
                    dy1 = 0.392f,
                    dx2 = -0.533f,
                    dy2 = 0.63f,
                    dx3 = -0.929f,
                    dy3 = 0.63f,
                )
                close()
                // M 6 15
                moveTo(x = 6.0f, y = 15.0f)
                // c -0.397 0 -0.772 -0.238 -0.929 -0.629
                curveToRelative(
                    dx1 = -0.397f,
                    dy1 = 0.0f,
                    dx2 = -0.772f,
                    dy2 = -0.238f,
                    dx3 = -0.929f,
                    dy3 = -0.629f,
                )
                // c -0.205 -0.513 0.044 -1.095 0.557 -1.3
                curveToRelative(
                    dx1 = -0.205f,
                    dy1 = -0.513f,
                    dx2 = 0.044f,
                    dy2 = -1.095f,
                    dx3 = 0.557f,
                    dy3 = -1.3f,
                )
                // c 4.612 -1.844 6.523 -4.602 6.542 -4.629
                curveToRelative(
                    dx1 = 4.612f,
                    dy1 = -1.844f,
                    dx2 = 6.523f,
                    dy2 = -4.602f,
                    dx3 = 6.542f,
                    dy3 = -4.629f,
                )
                // c 0.308 -0.456 0.929 -0.577 1.387 -0.27
                curveToRelative(
                    dx1 = 0.308f,
                    dy1 = -0.456f,
                    dx2 = 0.929f,
                    dy2 = -0.577f,
                    dx3 = 1.387f,
                    dy3 = -0.27f,
                )
                // c 0.457 0.308 0.581 0.925 0.275 1.383
                curveToRelative(
                    dx1 = 0.457f,
                    dy1 = 0.308f,
                    dx2 = 0.581f,
                    dy2 = 0.925f,
                    dx3 = 0.275f,
                    dy3 = 1.383f,
                )
                // c -0.089 0.133 -2.232 3.283 -7.46 5.374
                curveToRelative(
                    dx1 = -0.089f,
                    dy1 = 0.133f,
                    dx2 = -2.232f,
                    dy2 = 3.283f,
                    dx3 = -7.46f,
                    dy3 = 5.374f,
                )
                // C 6.25 14.977 6.124 15 6 15z
                curveTo(
                    x1 = 6.25f,
                    y1 = 14.977f,
                    x2 = 6.124f,
                    y2 = 15.0f,
                    x3 = 6.0f,
                    y3 = 15.0f,
                )
                close()
            }
            // M24 16 h4 v19 l-4 -0.046 V16z M8 35 l4 -0.046 V16 H8 v19z
            path(
                fill = SolidColor(Color(0xFF5DADEC)),
            ) {
                // M 24 16
                moveTo(x = 24.0f, y = 16.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 19
                verticalLineToRelative(dy = 19.0f)
                // l -4 -0.046
                lineToRelative(dx = -4.0f, dy = -0.046f)
                // V 16z
                verticalLineTo(y = 16.0f)
                close()
                // M 8 35
                moveTo(x = 8.0f, y = 35.0f)
                // l 4 -0.046
                lineToRelative(dx = 4.0f, dy = -0.046f)
                // V 16
                verticalLineTo(y = 16.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // v 19z
                verticalLineToRelative(dy = 19.0f)
                close()
            }
            // M14.999 18 c-0.15 0 -0.303 -0.034 -0.446 -0.105 -3.512 -1.756 -7.07 -0.018 -7.105 0 -0.495 0.249 -1.095 0.046 -1.342 -0.447 -0.247 -0.494 -0.047 -1.095 0.447 -1.342 0.182 -0.09 4.498 -2.197 8.895 0 0.494 0.247 0.694 0.848 0.447 1.342 -0.176 0.35 -0.529 0.552 -0.896 0.552z M28.999 18 c-0.15 0 -0.303 -0.034 -0.446 -0.105 -3.513 -1.756 -7.07 -0.018 -7.105 0 -0.494 0.248 -1.094 0.047 -1.342 -0.447 -0.247 -0.494 -0.047 -1.095 0.447 -1.342 0.182 -0.09 4.501 -2.196 8.895 0 0.494 0.247 0.694 0.848 0.447 1.342 -0.176 0.35 -0.529 0.552 -0.896 0.552z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 14.999 18
                moveTo(x = 14.999f, y = 18.0f)
                // c -0.15 0 -0.303 -0.034 -0.446 -0.105
                curveToRelative(
                    dx1 = -0.15f,
                    dy1 = 0.0f,
                    dx2 = -0.303f,
                    dy2 = -0.034f,
                    dx3 = -0.446f,
                    dy3 = -0.105f,
                )
                // c -3.512 -1.756 -7.07 -0.018 -7.105 0
                curveToRelative(
                    dx1 = -3.512f,
                    dy1 = -1.756f,
                    dx2 = -7.07f,
                    dy2 = -0.018f,
                    dx3 = -7.105f,
                    dy3 = 0.0f,
                )
                // c -0.495 0.249 -1.095 0.046 -1.342 -0.447
                curveToRelative(
                    dx1 = -0.495f,
                    dy1 = 0.249f,
                    dx2 = -1.095f,
                    dy2 = 0.046f,
                    dx3 = -1.342f,
                    dy3 = -0.447f,
                )
                // c -0.247 -0.494 -0.047 -1.095 0.447 -1.342
                curveToRelative(
                    dx1 = -0.247f,
                    dy1 = -0.494f,
                    dx2 = -0.047f,
                    dy2 = -1.095f,
                    dx3 = 0.447f,
                    dy3 = -1.342f,
                )
                // c 0.182 -0.09 4.498 -2.197 8.895 0
                curveToRelative(
                    dx1 = 0.182f,
                    dy1 = -0.09f,
                    dx2 = 4.498f,
                    dy2 = -2.197f,
                    dx3 = 8.895f,
                    dy3 = 0.0f,
                )
                // c 0.494 0.247 0.694 0.848 0.447 1.342
                curveToRelative(
                    dx1 = 0.494f,
                    dy1 = 0.247f,
                    dx2 = 0.694f,
                    dy2 = 0.848f,
                    dx3 = 0.447f,
                    dy3 = 1.342f,
                )
                // c -0.176 0.35 -0.529 0.552 -0.896 0.552z
                curveToRelative(
                    dx1 = -0.176f,
                    dy1 = 0.35f,
                    dx2 = -0.529f,
                    dy2 = 0.552f,
                    dx3 = -0.896f,
                    dy3 = 0.552f,
                )
                close()
                // M 28.999 18
                moveTo(x = 28.999f, y = 18.0f)
                // c -0.15 0 -0.303 -0.034 -0.446 -0.105
                curveToRelative(
                    dx1 = -0.15f,
                    dy1 = 0.0f,
                    dx2 = -0.303f,
                    dy2 = -0.034f,
                    dx3 = -0.446f,
                    dy3 = -0.105f,
                )
                // c -3.513 -1.756 -7.07 -0.018 -7.105 0
                curveToRelative(
                    dx1 = -3.513f,
                    dy1 = -1.756f,
                    dx2 = -7.07f,
                    dy2 = -0.018f,
                    dx3 = -7.105f,
                    dy3 = 0.0f,
                )
                // c -0.494 0.248 -1.094 0.047 -1.342 -0.447
                curveToRelative(
                    dx1 = -0.494f,
                    dy1 = 0.248f,
                    dx2 = -1.094f,
                    dy2 = 0.047f,
                    dx3 = -1.342f,
                    dy3 = -0.447f,
                )
                // c -0.247 -0.494 -0.047 -1.095 0.447 -1.342
                curveToRelative(
                    dx1 = -0.247f,
                    dy1 = -0.494f,
                    dx2 = -0.047f,
                    dy2 = -1.095f,
                    dx3 = 0.447f,
                    dy3 = -1.342f,
                )
                // c 0.182 -0.09 4.501 -2.196 8.895 0
                curveToRelative(
                    dx1 = 0.182f,
                    dy1 = -0.09f,
                    dx2 = 4.501f,
                    dy2 = -2.196f,
                    dx3 = 8.895f,
                    dy3 = 0.0f,
                )
                // c 0.494 0.247 0.694 0.848 0.447 1.342
                curveToRelative(
                    dx1 = 0.494f,
                    dy1 = 0.247f,
                    dx2 = 0.694f,
                    dy2 = 0.848f,
                    dx3 = 0.447f,
                    dy3 = 1.342f,
                )
                // c -0.176 0.35 -0.529 0.552 -0.896 0.552z
                curveToRelative(
                    dx1 = -0.176f,
                    dy1 = 0.35f,
                    dx2 = -0.529f,
                    dy2 = 0.552f,
                    dx3 = -0.896f,
                    dy3 = 0.552f,
                )
                close()
            }
            // M0 34 a18 2 0 1 0 36 0 a18 2 0 1 0 -36 0z
            path(
                fill = SolidColor(Color(0xFF5DADEC)),
            ) {
                // M 0 34
                moveTo(x = 0.0f, y = 34.0f)
                // a 18 2 0 1 0 36 0
                arcToRelative(
                    a = 18.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 36.0f,
                    dy1 = 0.0f,
                )
                // a 18 2 0 1 0 -36 0z
                arcToRelative(
                    a = 18.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -36.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M15 27 a3 2 0 1 0 6 0 a3 2 0 1 0 -6 0z
            path(
                fill = SolidColor(Color(0xFFE75A70)),
            ) {
                // M 15 27
                moveTo(x = 15.0f, y = 27.0f)
                // a 3 2 0 1 0 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // a 3 2 0 1 0 -6 0z
                arcToRelative(
                    a = 3.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _emoji1f62d = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f62d: ImageVector? = null
