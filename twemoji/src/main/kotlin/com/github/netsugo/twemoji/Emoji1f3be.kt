package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f3be: ImageVector
    get() {
        val current = _emoji1f3be
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f3be",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M18 18 m-18 0 a18 18 0 1 1 36 0 a18 18 0 1 1 -36 0
            path(
                fill = SolidColor(Color(0xFF77B255)),
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
            // M26 18 c0 6.048 2.792 10.221 5.802 11.546 C34.42 26.42 36 22.396 36 18 c0 -4.396 -1.58 -8.42 -4.198 -11.546 C28.792 7.779 26 11.952 26 18z
            path(
                fill = SolidColor(Color(0xFFA6D388)),
            ) {
                // M 26 18
                moveTo(x = 26.0f, y = 18.0f)
                // c 0 6.048 2.792 10.221 5.802 11.546
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 6.048f,
                    dx2 = 2.792f,
                    dy2 = 10.221f,
                    dx3 = 5.802f,
                    dy3 = 11.546f,
                )
                // C 34.42 26.42 36 22.396 36 18
                curveTo(
                    x1 = 34.42f,
                    y1 = 26.42f,
                    x2 = 36.0f,
                    y2 = 22.396f,
                    x3 = 36.0f,
                    y3 = 18.0f,
                )
                // c 0 -4.396 -1.58 -8.42 -4.198 -11.546
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.396f,
                    dx2 = -1.58f,
                    dy2 = -8.42f,
                    dx3 = -4.198f,
                    dy3 = -11.546f,
                )
                // C 28.792 7.779 26 11.952 26 18z
                curveTo(
                    x1 = 28.792f,
                    y1 = 7.779f,
                    x2 = 26.0f,
                    y2 = 11.952f,
                    x3 = 26.0f,
                    y3 = 18.0f,
                )
                close()
            }
            // M27 18 c0 -6.048 1.792 -10.221 4.802 -11.546 -0.445 -0.531 -0.926 -1.028 -1.428 -1.504 C27.406 6.605 25 10.578 25 18 c0 7.421 2.406 11.395 5.374 13.05 0.502 -0.476 0.984 -0.973 1.428 -1.504 C28.792 28.221 27 24.048 27 18z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 27 18
                moveTo(x = 27.0f, y = 18.0f)
                // c 0 -6.048 1.792 -10.221 4.802 -11.546
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -6.048f,
                    dx2 = 1.792f,
                    dy2 = -10.221f,
                    dx3 = 4.802f,
                    dy3 = -11.546f,
                )
                // c -0.445 -0.531 -0.926 -1.028 -1.428 -1.504
                curveToRelative(
                    dx1 = -0.445f,
                    dy1 = -0.531f,
                    dx2 = -0.926f,
                    dy2 = -1.028f,
                    dx3 = -1.428f,
                    dy3 = -1.504f,
                )
                // C 27.406 6.605 25 10.578 25 18
                curveTo(
                    x1 = 27.406f,
                    y1 = 6.605f,
                    x2 = 25.0f,
                    y2 = 10.578f,
                    x3 = 25.0f,
                    y3 = 18.0f,
                )
                // c 0 7.421 2.406 11.395 5.374 13.05
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 7.421f,
                    dx2 = 2.406f,
                    dy2 = 11.395f,
                    dx3 = 5.374f,
                    dy3 = 13.05f,
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
                // C 28.792 28.221 27 24.048 27 18z
                curveTo(
                    x1 = 28.792f,
                    y1 = 28.221f,
                    x2 = 27.0f,
                    y2 = 24.048f,
                    x3 = 27.0f,
                    y3 = 18.0f,
                )
                close()
            }
            // M10 18 c0 -6.048 -2.792 -10.22 -5.802 -11.546 C1.58 9.58 0 13.604 0 18 c0 4.396 1.58 8.42 4.198 11.546 C7.208 28.22 10 24.048 10 18z
            path(
                fill = SolidColor(Color(0xFFA6D388)),
            ) {
                // M 10 18
                moveTo(x = 10.0f, y = 18.0f)
                // c 0 -6.048 -2.792 -10.22 -5.802 -11.546
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -6.048f,
                    dx2 = -2.792f,
                    dy2 = -10.22f,
                    dx3 = -5.802f,
                    dy3 = -11.546f,
                )
                // C 1.58 9.58 0 13.604 0 18
                curveTo(
                    x1 = 1.58f,
                    y1 = 9.58f,
                    x2 = 0.0f,
                    y2 = 13.604f,
                    x3 = 0.0f,
                    y3 = 18.0f,
                )
                // c 0 4.396 1.58 8.42 4.198 11.546
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.396f,
                    dx2 = 1.58f,
                    dy2 = 8.42f,
                    dx3 = 4.198f,
                    dy3 = 11.546f,
                )
                // C 7.208 28.22 10 24.048 10 18z
                curveTo(
                    x1 = 7.208f,
                    y1 = 28.22f,
                    x2 = 10.0f,
                    y2 = 24.048f,
                    x3 = 10.0f,
                    y3 = 18.0f,
                )
                close()
            }
            // M4.198 6.454 C7.208 7.78 9 11.952 9 18 c0 6.048 -1.792 10.22 -4.802 11.546 0.445 0.531 0.926 1.027 1.428 1.504 C8.593 29.395 11 25.421 11 18 c0 -7.421 -2.406 -11.395 -5.374 -13.049 -0.502 0.476 -0.984 0.972 -1.428 1.503z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 4.198 6.454
                moveTo(x = 4.198f, y = 6.454f)
                // C 7.208 7.78 9 11.952 9 18
                curveTo(
                    x1 = 7.208f,
                    y1 = 7.78f,
                    x2 = 9.0f,
                    y2 = 11.952f,
                    x3 = 9.0f,
                    y3 = 18.0f,
                )
                // c 0 6.048 -1.792 10.22 -4.802 11.546
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 6.048f,
                    dx2 = -1.792f,
                    dy2 = 10.22f,
                    dx3 = -4.802f,
                    dy3 = 11.546f,
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
                // C 8.593 29.395 11 25.421 11 18
                curveTo(
                    x1 = 8.593f,
                    y1 = 29.395f,
                    x2 = 11.0f,
                    y2 = 25.421f,
                    x3 = 11.0f,
                    y3 = 18.0f,
                )
                // c 0 -7.421 -2.406 -11.395 -5.374 -13.049
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -7.421f,
                    dx2 = -2.406f,
                    dy2 = -11.395f,
                    dx3 = -5.374f,
                    dy3 = -13.049f,
                )
                // c -0.502 0.476 -0.984 0.972 -1.428 1.503z
                curveToRelative(
                    dx1 = -0.502f,
                    dy1 = 0.476f,
                    dx2 = -0.984f,
                    dy2 = 0.972f,
                    dx3 = -1.428f,
                    dy3 = 1.503f,
                )
                close()
            }
        }.build().also { _emoji1f3be = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f3be: ImageVector? = null
