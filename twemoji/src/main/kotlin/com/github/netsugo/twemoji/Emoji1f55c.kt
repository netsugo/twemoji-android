package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f55c: ImageVector
    get() {
        val current = _emoji1f55c
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f55c",
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
            // M18 31 c-0.552 0 -1 -0.447 -1 -1 V18 c0 -0.552 0.448 -1 1 -1 0.553 0 1 0.448 1 1 v12 c0 0.553 -0.447 1 -1 1z
            path(
                fill = SolidColor(Color(0xFF67757F)),
            ) {
                // M 18 31
                moveTo(x = 18.0f, y = 31.0f)
                // c -0.552 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // V 18
                verticalLineTo(y = 18.0f)
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
            // M17.999 19 c-0.15 0 -0.303 -0.034 -0.446 -0.105 -0.494 -0.247 -0.694 -0.848 -0.447 -1.342 l4 -8 c0.247 -0.494 0.848 -0.693 1.342 -0.447 0.494 0.247 0.694 0.848 0.447 1.342 l-4 8 c-0.176 0.35 -0.529 0.552 -0.896 0.552z
            path(
                fill = SolidColor(Color(0xFF67757F)),
            ) {
                // M 17.999 19
                moveTo(x = 17.999f, y = 19.0f)
                // c -0.15 0 -0.303 -0.034 -0.446 -0.105
                curveToRelative(
                    dx1 = -0.15f,
                    dy1 = 0.0f,
                    dx2 = -0.303f,
                    dy2 = -0.034f,
                    dx3 = -0.446f,
                    dy3 = -0.105f,
                )
                // c -0.494 -0.247 -0.694 -0.848 -0.447 -1.342
                curveToRelative(
                    dx1 = -0.494f,
                    dy1 = -0.247f,
                    dx2 = -0.694f,
                    dy2 = -0.848f,
                    dx3 = -0.447f,
                    dy3 = -1.342f,
                )
                // l 4 -8
                lineToRelative(dx = 4.0f, dy = -8.0f)
                // c 0.247 -0.494 0.848 -0.693 1.342 -0.447
                curveToRelative(
                    dx1 = 0.247f,
                    dy1 = -0.494f,
                    dx2 = 0.848f,
                    dy2 = -0.693f,
                    dx3 = 1.342f,
                    dy3 = -0.447f,
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
                // l -4 8
                lineToRelative(dx = -4.0f, dy = 8.0f)
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
        }.build().also { _emoji1f55c = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f55c: ImageVector? = null
