package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f3c0: ImageVector
    get() {
        val current = _emoji1f3c0
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f3c0",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M18 18 m-18 0 a18 18 0 1 1 36 0 a18 18 0 1 1 -36 0
            path(
                fill = SolidColor(Color(0xFFF4900C)),
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
            // M36 17 h-8.981 c0.188 -5.506 1.943 -9.295 4.784 -10.546 -0.445 -0.531 -0.926 -1.027 -1.428 -1.504 -2.83 1.578 -5.145 5.273 -5.354 12.049 H19 V0 h-2 v17 h-6.021 c-0.208 -6.776 -2.523 -10.471 -5.353 -12.049 -0.502 0.476 -0.984 0.972 -1.428 1.503 C7.039 7.705 8.793 11.494 8.981 17 H0 v2 h8.981 c-0.188 5.506 -1.942 9.295 -4.783 10.546 0.445 0.531 0.926 1.027 1.428 1.504 2.831 -1.578 5.145 -5.273 5.353 -12.05 H17 v17 h2 V19 h6.021 c0.209 6.776 2.523 10.471 5.354 12.05 0.502 -0.476 0.984 -0.973 1.428 -1.504 -2.841 -1.251 -4.595 -5.04 -4.784 -10.546 H36 v-2z
            path(
                fill = SolidColor(Color(0xFF231F20)),
            ) {
                // M 36 17
                moveTo(x = 36.0f, y = 17.0f)
                // h -8.981
                horizontalLineToRelative(dx = -8.981f)
                // c 0.188 -5.506 1.943 -9.295 4.784 -10.546
                curveToRelative(
                    dx1 = 0.188f,
                    dy1 = -5.506f,
                    dx2 = 1.943f,
                    dy2 = -9.295f,
                    dx3 = 4.784f,
                    dy3 = -10.546f,
                )
                // c -0.445 -0.531 -0.926 -1.027 -1.428 -1.504
                curveToRelative(
                    dx1 = -0.445f,
                    dy1 = -0.531f,
                    dx2 = -0.926f,
                    dy2 = -1.027f,
                    dx3 = -1.428f,
                    dy3 = -1.504f,
                )
                // c -2.83 1.578 -5.145 5.273 -5.354 12.049
                curveToRelative(
                    dx1 = -2.83f,
                    dy1 = 1.578f,
                    dx2 = -5.145f,
                    dy2 = 5.273f,
                    dx3 = -5.354f,
                    dy3 = 12.049f,
                )
                // H 19
                horizontalLineTo(x = 19.0f)
                // V 0
                verticalLineTo(y = 0.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 17
                verticalLineToRelative(dy = 17.0f)
                // h -6.021
                horizontalLineToRelative(dx = -6.021f)
                // c -0.208 -6.776 -2.523 -10.471 -5.353 -12.049
                curveToRelative(
                    dx1 = -0.208f,
                    dy1 = -6.776f,
                    dx2 = -2.523f,
                    dy2 = -10.471f,
                    dx3 = -5.353f,
                    dy3 = -12.049f,
                )
                // c -0.502 0.476 -0.984 0.972 -1.428 1.503
                curveToRelative(
                    dx1 = -0.502f,
                    dy1 = 0.476f,
                    dx2 = -0.984f,
                    dy2 = 0.972f,
                    dx3 = -1.428f,
                    dy3 = 1.503f,
                )
                // C 7.039 7.705 8.793 11.494 8.981 17
                curveTo(
                    x1 = 7.039f,
                    y1 = 7.705f,
                    x2 = 8.793f,
                    y2 = 11.494f,
                    x3 = 8.981f,
                    y3 = 17.0f,
                )
                // H 0
                horizontalLineTo(x = 0.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 8.981
                horizontalLineToRelative(dx = 8.981f)
                // c -0.188 5.506 -1.942 9.295 -4.783 10.546
                curveToRelative(
                    dx1 = -0.188f,
                    dy1 = 5.506f,
                    dx2 = -1.942f,
                    dy2 = 9.295f,
                    dx3 = -4.783f,
                    dy3 = 10.546f,
                )
                // c 0.445 0.531 0.926 1.027 1.428 1.504
                curveToRelative(
                    dx1 = 0.445f,
                    dy1 = 0.531f,
                    dx2 = 0.926f,
                    dy2 = 1.027f,
                    dx3 = 1.428f,
                    dy3 = 1.504f,
                )
                // c 2.831 -1.578 5.145 -5.273 5.353 -12.05
                curveToRelative(
                    dx1 = 2.831f,
                    dy1 = -1.578f,
                    dx2 = 5.145f,
                    dy2 = -5.273f,
                    dx3 = 5.353f,
                    dy3 = -12.05f,
                )
                // H 17
                horizontalLineTo(x = 17.0f)
                // v 17
                verticalLineToRelative(dy = 17.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 19
                verticalLineTo(y = 19.0f)
                // h 6.021
                horizontalLineToRelative(dx = 6.021f)
                // c 0.209 6.776 2.523 10.471 5.354 12.05
                curveToRelative(
                    dx1 = 0.209f,
                    dy1 = 6.776f,
                    dx2 = 2.523f,
                    dy2 = 10.471f,
                    dx3 = 5.354f,
                    dy3 = 12.05f,
                )
                // c 0.502 -0.476 0.984 -0.973 1.428 -1.504
                curveToRelative(
                    dx1 = 0.502f,
                    dy1 = -0.476f,
                    dx2 = 0.984f,
                    dy2 = -0.973f,
                    dx3 = 1.428f,
                    dy3 = -1.504f,
                )
                // c -2.841 -1.251 -4.595 -5.04 -4.784 -10.546
                curveToRelative(
                    dx1 = -2.841f,
                    dy1 = -1.251f,
                    dx2 = -4.595f,
                    dy2 = -5.04f,
                    dx3 = -4.784f,
                    dy3 = -10.546f,
                )
                // H 36
                horizontalLineTo(x = 36.0f)
                // v -2z
                verticalLineToRelative(dy = -2.0f)
                close()
            }
        }.build().also { _emoji1f3c0 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f3c0: ImageVector? = null
