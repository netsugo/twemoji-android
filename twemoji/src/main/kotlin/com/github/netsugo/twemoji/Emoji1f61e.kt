package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f61e: ImageVector
    get() {
        val current = _emoji1f61e
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f61e",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M18 18 m-18 0 a18 18 0 1 1 36 0 a18 18 0 1 1 -36 0
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 18 18
                moveTo(x = 18.0f, y = 18.0f)
                // m -18 0
                moveToRelative(dx = -18.0f, dy = 0.0f)
                // a 18 18 0 1 1 36 0
                arcToRelative(
                    a = 18.0f,
                    b = 18.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 36.0f,
                    dy1 = 0.0f,
                )
                // a 18 18 0 1 1 -36 0
                arcToRelative(
                    a = 18.0f,
                    b = 18.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -36.0f,
                    dy1 = 0.0f,
                )
            }
            // M23.485 28.879 C23.474 28.835 22.34 24.5 18 24.5 s-5.474 4.335 -5.485 4.379 c-0.053 0.213 0.044 0.431 0.232 0.544 0.188 0.112 0.433 0.086 0.596 -0.06 0.009 -0.008 1.013 -0.863 4.657 -0.863 3.59 0 4.617 0.83 4.656 0.863 0.095 0.09 0.219 0.137 0.344 0.137 0.084 0 0.169 -0.021 0.246 -0.064 0.196 -0.112 0.294 -0.339 0.239 -0.557z M11.226 15.512 c-0.317 0 -0.636 0.039 -0.947 0.116 -2.87 0.707 -3.513 4.121 -3.539 4.267 -0.04 0.223 0.076 0.443 0.281 0.54 0.067 0.031 0.14 0.047 0.211 0.047 0.145 0 0.287 -0.063 0.385 -0.18 0.01 -0.012 1.01 -1.178 3.379 -1.761 0.714 -0.176 1.412 -0.265 2.073 -0.265 1.104 0 1.732 0.253 1.735 0.254 0.067 0.028 0.131 0.04 0.207 0.04 0.272 0.012 0.509 -0.221 0.509 -0.5 0 -0.165 -0.08 -0.311 -0.203 -0.402 -0.367 -0.435 -1.953 -2.156 -4.091 -2.156z M24.774 15.512 c0.317 0 0.636 0.039 0.947 0.116 2.87 0.707 3.513 4.121 3.539 4.267 0.04 0.223 -0.076 0.443 -0.281 0.54 -0.067 0.031 -0.14 0.047 -0.211 0.047 -0.145 0 -0.287 -0.063 -0.385 -0.18 -0.01 -0.012 -1.01 -1.178 -3.379 -1.761 -0.714 -0.176 -1.412 -0.265 -2.073 -0.265 -1.104 0 -1.731 0.253 -1.735 0.254 -0.067 0.028 -0.131 0.04 -0.206 0.04 -0.272 0.012 -0.509 -0.221 -0.509 -0.5 0 -0.165 0.08 -0.311 0.203 -0.402 0.366 -0.435 1.952 -2.156 4.09 -2.156z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 23.485 28.879
                moveTo(x = 23.485f, y = 28.879f)
                // C 23.474 28.835 22.34 24.5 18 24.5
                curveTo(
                    x1 = 23.474f,
                    y1 = 28.835f,
                    x2 = 22.34f,
                    y2 = 24.5f,
                    x3 = 18.0f,
                    y3 = 24.5f,
                )
                // s -5.474 4.335 -5.485 4.379
                reflectiveCurveToRelative(
                    dx1 = -5.474f,
                    dy1 = 4.335f,
                    dx2 = -5.485f,
                    dy2 = 4.379f,
                )
                // c -0.053 0.213 0.044 0.431 0.232 0.544
                curveToRelative(
                    dx1 = -0.053f,
                    dy1 = 0.213f,
                    dx2 = 0.044f,
                    dy2 = 0.431f,
                    dx3 = 0.232f,
                    dy3 = 0.544f,
                )
                // c 0.188 0.112 0.433 0.086 0.596 -0.06
                curveToRelative(
                    dx1 = 0.188f,
                    dy1 = 0.112f,
                    dx2 = 0.433f,
                    dy2 = 0.086f,
                    dx3 = 0.596f,
                    dy3 = -0.06f,
                )
                // c 0.009 -0.008 1.013 -0.863 4.657 -0.863
                curveToRelative(
                    dx1 = 0.009f,
                    dy1 = -0.008f,
                    dx2 = 1.013f,
                    dy2 = -0.863f,
                    dx3 = 4.657f,
                    dy3 = -0.863f,
                )
                // c 3.59 0 4.617 0.83 4.656 0.863
                curveToRelative(
                    dx1 = 3.59f,
                    dy1 = 0.0f,
                    dx2 = 4.617f,
                    dy2 = 0.83f,
                    dx3 = 4.656f,
                    dy3 = 0.863f,
                )
                // c 0.095 0.09 0.219 0.137 0.344 0.137
                curveToRelative(
                    dx1 = 0.095f,
                    dy1 = 0.09f,
                    dx2 = 0.219f,
                    dy2 = 0.137f,
                    dx3 = 0.344f,
                    dy3 = 0.137f,
                )
                // c 0.084 0 0.169 -0.021 0.246 -0.064
                curveToRelative(
                    dx1 = 0.084f,
                    dy1 = 0.0f,
                    dx2 = 0.169f,
                    dy2 = -0.021f,
                    dx3 = 0.246f,
                    dy3 = -0.064f,
                )
                // c 0.196 -0.112 0.294 -0.339 0.239 -0.557z
                curveToRelative(
                    dx1 = 0.196f,
                    dy1 = -0.112f,
                    dx2 = 0.294f,
                    dy2 = -0.339f,
                    dx3 = 0.239f,
                    dy3 = -0.557f,
                )
                close()
                // M 11.226 15.512
                moveTo(x = 11.226f, y = 15.512f)
                // c -0.317 0 -0.636 0.039 -0.947 0.116
                curveToRelative(
                    dx1 = -0.317f,
                    dy1 = 0.0f,
                    dx2 = -0.636f,
                    dy2 = 0.039f,
                    dx3 = -0.947f,
                    dy3 = 0.116f,
                )
                // c -2.87 0.707 -3.513 4.121 -3.539 4.267
                curveToRelative(
                    dx1 = -2.87f,
                    dy1 = 0.707f,
                    dx2 = -3.513f,
                    dy2 = 4.121f,
                    dx3 = -3.539f,
                    dy3 = 4.267f,
                )
                // c -0.04 0.223 0.076 0.443 0.281 0.54
                curveToRelative(
                    dx1 = -0.04f,
                    dy1 = 0.223f,
                    dx2 = 0.076f,
                    dy2 = 0.443f,
                    dx3 = 0.281f,
                    dy3 = 0.54f,
                )
                // c 0.067 0.031 0.14 0.047 0.211 0.047
                curveToRelative(
                    dx1 = 0.067f,
                    dy1 = 0.031f,
                    dx2 = 0.14f,
                    dy2 = 0.047f,
                    dx3 = 0.211f,
                    dy3 = 0.047f,
                )
                // c 0.145 0 0.287 -0.063 0.385 -0.18
                curveToRelative(
                    dx1 = 0.145f,
                    dy1 = 0.0f,
                    dx2 = 0.287f,
                    dy2 = -0.063f,
                    dx3 = 0.385f,
                    dy3 = -0.18f,
                )
                // c 0.01 -0.012 1.01 -1.178 3.379 -1.761
                curveToRelative(
                    dx1 = 0.01f,
                    dy1 = -0.012f,
                    dx2 = 1.01f,
                    dy2 = -1.178f,
                    dx3 = 3.379f,
                    dy3 = -1.761f,
                )
                // c 0.714 -0.176 1.412 -0.265 2.073 -0.265
                curveToRelative(
                    dx1 = 0.714f,
                    dy1 = -0.176f,
                    dx2 = 1.412f,
                    dy2 = -0.265f,
                    dx3 = 2.073f,
                    dy3 = -0.265f,
                )
                // c 1.104 0 1.732 0.253 1.735 0.254
                curveToRelative(
                    dx1 = 1.104f,
                    dy1 = 0.0f,
                    dx2 = 1.732f,
                    dy2 = 0.253f,
                    dx3 = 1.735f,
                    dy3 = 0.254f,
                )
                // c 0.067 0.028 0.131 0.04 0.207 0.04
                curveToRelative(
                    dx1 = 0.067f,
                    dy1 = 0.028f,
                    dx2 = 0.131f,
                    dy2 = 0.04f,
                    dx3 = 0.207f,
                    dy3 = 0.04f,
                )
                // c 0.272 0.012 0.509 -0.221 0.509 -0.5
                curveToRelative(
                    dx1 = 0.272f,
                    dy1 = 0.012f,
                    dx2 = 0.509f,
                    dy2 = -0.221f,
                    dx3 = 0.509f,
                    dy3 = -0.5f,
                )
                // c 0 -0.165 -0.08 -0.311 -0.203 -0.402
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.165f,
                    dx2 = -0.08f,
                    dy2 = -0.311f,
                    dx3 = -0.203f,
                    dy3 = -0.402f,
                )
                // c -0.367 -0.435 -1.953 -2.156 -4.091 -2.156z
                curveToRelative(
                    dx1 = -0.367f,
                    dy1 = -0.435f,
                    dx2 = -1.953f,
                    dy2 = -2.156f,
                    dx3 = -4.091f,
                    dy3 = -2.156f,
                )
                close()
                // M 24.774 15.512
                moveTo(x = 24.774f, y = 15.512f)
                // c 0.317 0 0.636 0.039 0.947 0.116
                curveToRelative(
                    dx1 = 0.317f,
                    dy1 = 0.0f,
                    dx2 = 0.636f,
                    dy2 = 0.039f,
                    dx3 = 0.947f,
                    dy3 = 0.116f,
                )
                // c 2.87 0.707 3.513 4.121 3.539 4.267
                curveToRelative(
                    dx1 = 2.87f,
                    dy1 = 0.707f,
                    dx2 = 3.513f,
                    dy2 = 4.121f,
                    dx3 = 3.539f,
                    dy3 = 4.267f,
                )
                // c 0.04 0.223 -0.076 0.443 -0.281 0.54
                curveToRelative(
                    dx1 = 0.04f,
                    dy1 = 0.223f,
                    dx2 = -0.076f,
                    dy2 = 0.443f,
                    dx3 = -0.281f,
                    dy3 = 0.54f,
                )
                // c -0.067 0.031 -0.14 0.047 -0.211 0.047
                curveToRelative(
                    dx1 = -0.067f,
                    dy1 = 0.031f,
                    dx2 = -0.14f,
                    dy2 = 0.047f,
                    dx3 = -0.211f,
                    dy3 = 0.047f,
                )
                // c -0.145 0 -0.287 -0.063 -0.385 -0.18
                curveToRelative(
                    dx1 = -0.145f,
                    dy1 = 0.0f,
                    dx2 = -0.287f,
                    dy2 = -0.063f,
                    dx3 = -0.385f,
                    dy3 = -0.18f,
                )
                // c -0.01 -0.012 -1.01 -1.178 -3.379 -1.761
                curveToRelative(
                    dx1 = -0.01f,
                    dy1 = -0.012f,
                    dx2 = -1.01f,
                    dy2 = -1.178f,
                    dx3 = -3.379f,
                    dy3 = -1.761f,
                )
                // c -0.714 -0.176 -1.412 -0.265 -2.073 -0.265
                curveToRelative(
                    dx1 = -0.714f,
                    dy1 = -0.176f,
                    dx2 = -1.412f,
                    dy2 = -0.265f,
                    dx3 = -2.073f,
                    dy3 = -0.265f,
                )
                // c -1.104 0 -1.731 0.253 -1.735 0.254
                curveToRelative(
                    dx1 = -1.104f,
                    dy1 = 0.0f,
                    dx2 = -1.731f,
                    dy2 = 0.253f,
                    dx3 = -1.735f,
                    dy3 = 0.254f,
                )
                // c -0.067 0.028 -0.131 0.04 -0.206 0.04
                curveToRelative(
                    dx1 = -0.067f,
                    dy1 = 0.028f,
                    dx2 = -0.131f,
                    dy2 = 0.04f,
                    dx3 = -0.206f,
                    dy3 = 0.04f,
                )
                // c -0.272 0.012 -0.509 -0.221 -0.509 -0.5
                curveToRelative(
                    dx1 = -0.272f,
                    dy1 = 0.012f,
                    dx2 = -0.509f,
                    dy2 = -0.221f,
                    dx3 = -0.509f,
                    dy3 = -0.5f,
                )
                // c 0 -0.165 0.08 -0.311 0.203 -0.402
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.165f,
                    dx2 = 0.08f,
                    dy2 = -0.311f,
                    dx3 = 0.203f,
                    dy3 = -0.402f,
                )
                // c 0.366 -0.435 1.952 -2.156 4.09 -2.156z
                curveToRelative(
                    dx1 = 0.366f,
                    dy1 = -0.435f,
                    dx2 = 1.952f,
                    dy2 = -2.156f,
                    dx3 = 4.09f,
                    dy3 = -2.156f,
                )
                close()
            }
        }.build().also { _emoji1f61e = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f61e: ImageVector? = null
