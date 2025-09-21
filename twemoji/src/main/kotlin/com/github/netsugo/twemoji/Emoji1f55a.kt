package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f55a: ImageVector
    get() {
        val current = _emoji1f55a
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f55a",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M18 18 m-18 0 a18 18 0 1 1 36 0 a18 18 0 1 1 -36 0
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
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
            // M18 18 m-14 0 a14 14 0 1 1 28 0 a14 14 0 1 1 -28 0
            path(
                fill = SolidColor(Color(0xFFE1E8ED)),
            ) {
                // M 18 18
                moveTo(x = 18.0f, y = 18.0f)
                // m -14 0
                moveToRelative(dx = -14.0f, dy = 0.0f)
                // a 14 14 0 1 1 28 0
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 28.0f,
                    dy1 = 0.0f,
                )
                // a 14 14 0 1 1 -28 0
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -28.0f,
                    dy1 = 0.0f,
                )
            }
            // M18 19 c-0.552 0 -1 -0.447 -1 -1 V6 c0 -0.552 0.448 -1 1 -1 0.553 0 1 0.448 1 1 v12 c0 0.553 -0.447 1 -1 1z
            path(
                fill = SolidColor(Color(0xFF67757F)),
            ) {
                // M 18 19
                moveTo(x = 18.0f, y = 19.0f)
                // c -0.552 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // V 6
                verticalLineTo(y = 6.0f)
                // c 0 -0.552 0.448 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = 0.448f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // c 0.553 0 1 0.448 1 1
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.448f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // v 12
                verticalLineToRelative(dy = 12.0f)
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
            // M18.001 19 c-0.367 0 -0.72 -0.202 -0.896 -0.553 l-4 -8 c-0.247 -0.494 -0.047 -1.095 0.447 -1.342 0.496 -0.248 1.095 -0.046 1.342 0.447 l4 8 c0.247 0.494 0.047 1.095 -0.447 1.342 -0.143 0.072 -0.296 0.106 -0.446 0.106z
            path(
                fill = SolidColor(Color(0xFF67757F)),
            ) {
                // M 18.001 19
                moveTo(x = 18.001f, y = 19.0f)
                // c -0.367 0 -0.72 -0.202 -0.896 -0.553
                curveToRelative(
                    dx1 = -0.367f,
                    dy1 = 0.0f,
                    dx2 = -0.72f,
                    dy2 = -0.202f,
                    dx3 = -0.896f,
                    dy3 = -0.553f,
                )
                // l -4 -8
                lineToRelative(dx = -4.0f, dy = -8.0f)
                // c -0.247 -0.494 -0.047 -1.095 0.447 -1.342
                curveToRelative(
                    dx1 = -0.247f,
                    dy1 = -0.494f,
                    dx2 = -0.047f,
                    dy2 = -1.095f,
                    dx3 = 0.447f,
                    dy3 = -1.342f,
                )
                // c 0.496 -0.248 1.095 -0.046 1.342 0.447
                curveToRelative(
                    dx1 = 0.496f,
                    dy1 = -0.248f,
                    dx2 = 1.095f,
                    dy2 = -0.046f,
                    dx3 = 1.342f,
                    dy3 = 0.447f,
                )
                // l 4 8
                lineToRelative(dx = 4.0f, dy = 8.0f)
                // c 0.247 0.494 0.047 1.095 -0.447 1.342
                curveToRelative(
                    dx1 = 0.247f,
                    dy1 = 0.494f,
                    dx2 = 0.047f,
                    dy2 = 1.095f,
                    dx3 = -0.447f,
                    dy3 = 1.342f,
                )
                // c -0.143 0.072 -0.296 0.106 -0.446 0.106z
                curveToRelative(
                    dx1 = -0.143f,
                    dy1 = 0.072f,
                    dx2 = -0.296f,
                    dy2 = 0.106f,
                    dx3 = -0.446f,
                    dy3 = 0.106f,
                )
                close()
            }
        }.build().also { _emoji1f55a = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f55a: ImageVector? = null
