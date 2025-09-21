package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f55f: ImageVector
    get() {
        val current = _emoji1f55f
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f55f",
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
            // M24.999 24 c-0.201 0 -0.404 -0.06 -0.58 -0.187 l-7 -5 c-0.45 -0.321 -0.554 -0.945 -0.233 -1.395 0.321 -0.45 0.946 -0.554 1.395 -0.233 l7 5 c0.449 0.32 0.554 0.945 0.232 1.395 -0.195 0.274 -0.501 0.42 -0.814 0.42z
            path(
                fill = SolidColor(Color(0xFF67757F)),
            ) {
                // M 24.999 24
                moveTo(x = 24.999f, y = 24.0f)
                // c -0.201 0 -0.404 -0.06 -0.58 -0.187
                curveToRelative(
                    dx1 = -0.201f,
                    dy1 = 0.0f,
                    dx2 = -0.404f,
                    dy2 = -0.06f,
                    dx3 = -0.58f,
                    dy3 = -0.187f,
                )
                // l -7 -5
                lineToRelative(dx = -7.0f, dy = -5.0f)
                // c -0.45 -0.321 -0.554 -0.945 -0.233 -1.395
                curveToRelative(
                    dx1 = -0.45f,
                    dy1 = -0.321f,
                    dx2 = -0.554f,
                    dy2 = -0.945f,
                    dx3 = -0.233f,
                    dy3 = -1.395f,
                )
                // c 0.321 -0.45 0.946 -0.554 1.395 -0.233
                curveToRelative(
                    dx1 = 0.321f,
                    dy1 = -0.45f,
                    dx2 = 0.946f,
                    dy2 = -0.554f,
                    dx3 = 1.395f,
                    dy3 = -0.233f,
                )
                // l 7 5
                lineToRelative(dx = 7.0f, dy = 5.0f)
                // c 0.449 0.32 0.554 0.945 0.232 1.395
                curveToRelative(
                    dx1 = 0.449f,
                    dy1 = 0.32f,
                    dx2 = 0.554f,
                    dy2 = 0.945f,
                    dx3 = 0.232f,
                    dy3 = 1.395f,
                )
                // c -0.195 0.274 -0.501 0.42 -0.814 0.42z
                curveToRelative(
                    dx1 = -0.195f,
                    dy1 = 0.274f,
                    dx2 = -0.501f,
                    dy2 = 0.42f,
                    dx3 = -0.814f,
                    dy3 = 0.42f,
                )
                close()
            }
        }.build().also { _emoji1f55f = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f55f: ImageVector? = null
