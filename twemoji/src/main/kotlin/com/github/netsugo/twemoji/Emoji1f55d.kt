package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f55d: ImageVector
    get() {
        val current = _emoji1f55d
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f55d",
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
            // M18.001 19 c-0.312 0 -0.62 -0.146 -0.815 -0.419 -0.321 -0.449 -0.217 -1.074 0.233 -1.395 l7 -5 c0.448 -0.32 1.073 -0.217 1.395 0.233 0.321 0.449 0.217 1.074 -0.232 1.395 l-7 4.999 c-0.177 0.127 -0.38 0.187 -0.581 0.187z
            path(
                fill = SolidColor(Color(0xFF67757F)),
            ) {
                // M 18.001 19
                moveTo(x = 18.001f, y = 19.0f)
                // c -0.312 0 -0.62 -0.146 -0.815 -0.419
                curveToRelative(
                    dx1 = -0.312f,
                    dy1 = 0.0f,
                    dx2 = -0.62f,
                    dy2 = -0.146f,
                    dx3 = -0.815f,
                    dy3 = -0.419f,
                )
                // c -0.321 -0.449 -0.217 -1.074 0.233 -1.395
                curveToRelative(
                    dx1 = -0.321f,
                    dy1 = -0.449f,
                    dx2 = -0.217f,
                    dy2 = -1.074f,
                    dx3 = 0.233f,
                    dy3 = -1.395f,
                )
                // l 7 -5
                lineToRelative(dx = 7.0f, dy = -5.0f)
                // c 0.448 -0.32 1.073 -0.217 1.395 0.233
                curveToRelative(
                    dx1 = 0.448f,
                    dy1 = -0.32f,
                    dx2 = 1.073f,
                    dy2 = -0.217f,
                    dx3 = 1.395f,
                    dy3 = 0.233f,
                )
                // c 0.321 0.449 0.217 1.074 -0.232 1.395
                curveToRelative(
                    dx1 = 0.321f,
                    dy1 = 0.449f,
                    dx2 = 0.217f,
                    dy2 = 1.074f,
                    dx3 = -0.232f,
                    dy3 = 1.395f,
                )
                // l -7 4.999
                lineToRelative(dx = -7.0f, dy = 4.999f)
                // c -0.177 0.127 -0.38 0.187 -0.581 0.187z
                curveToRelative(
                    dx1 = -0.177f,
                    dy1 = 0.127f,
                    dx2 = -0.38f,
                    dy2 = 0.187f,
                    dx3 = -0.581f,
                    dy3 = 0.187f,
                )
                close()
            }
        }.build().also { _emoji1f55d = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f55d: ImageVector? = null
