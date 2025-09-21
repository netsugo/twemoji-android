package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f563: ImageVector
    get() {
        val current = _emoji1f563
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f563",
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
            // M17 29 c0 0.553 0.447 1 1 1 0.553 0 1 -0.447 1 -1 V18 c0 -0.552 -0.447 -1 -1 -1 -0.553 0 -1 0.448 -1 1 v11z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 17 29
                moveTo(x = 17.0f, y = 29.0f)
                // c 0 0.553 0.447 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = 0.447f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // c 0.553 0 1 -0.447 1 -1
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -0.447f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // V 18
                verticalLineTo(y = 18.0f)
                // c 0 -0.552 -0.447 -1 -1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = -0.447f,
                    dy2 = -1.0f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // c -0.553 0 -1 0.448 -1 1
                curveToRelative(
                    dx1 = -0.553f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = 0.448f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // v 11z
                verticalLineToRelative(dy = 11.0f)
                close()
            }
            // M9.34 23 c0.275 0.479 0.887 0.643 1.365 0.367 l7.795 -4.5 c0.479 -0.276 0.642 -0.889 0.365 -1.367 -0.275 -0.478 -0.887 -0.642 -1.365 -0.365 l-7.795 4.5 c-0.478 0.276 -0.642 0.887 -0.365 1.365z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 9.34 23
                moveTo(x = 9.34f, y = 23.0f)
                // c 0.275 0.479 0.887 0.643 1.365 0.367
                curveToRelative(
                    dx1 = 0.275f,
                    dy1 = 0.479f,
                    dx2 = 0.887f,
                    dy2 = 0.643f,
                    dx3 = 1.365f,
                    dy3 = 0.367f,
                )
                // l 7.795 -4.5
                lineToRelative(dx = 7.795f, dy = -4.5f)
                // c 0.479 -0.276 0.642 -0.889 0.365 -1.367
                curveToRelative(
                    dx1 = 0.479f,
                    dy1 = -0.276f,
                    dx2 = 0.642f,
                    dy2 = -0.889f,
                    dx3 = 0.365f,
                    dy3 = -1.367f,
                )
                // c -0.275 -0.478 -0.887 -0.642 -1.365 -0.365
                curveToRelative(
                    dx1 = -0.275f,
                    dy1 = -0.478f,
                    dx2 = -0.887f,
                    dy2 = -0.642f,
                    dx3 = -1.365f,
                    dy3 = -0.365f,
                )
                // l -7.795 4.5
                lineToRelative(dx = -7.795f, dy = 4.5f)
                // c -0.478 0.276 -0.642 0.887 -0.365 1.365z
                curveToRelative(
                    dx1 = -0.478f,
                    dy1 = 0.276f,
                    dx2 = -0.642f,
                    dy2 = 0.887f,
                    dx3 = -0.365f,
                    dy3 = 1.365f,
                )
                close()
            }
        }.build().also { _emoji1f563 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f563: ImageVector? = null
