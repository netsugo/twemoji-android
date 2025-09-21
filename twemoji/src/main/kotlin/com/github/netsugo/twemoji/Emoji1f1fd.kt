package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1fd: ImageVector
    get() {
        val current = _emoji1f1fd
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1fd",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 32 c0 2.209 -1.791 4 -4 4 H4 c-2.209 0 -4 -1.791 -4 -4 V4 c0 -2.209 1.791 -4 4 -4 h28 c2.209 0 4 1.791 4 4 v28z
            path(
                fill = SolidColor(Color(0xFF3B88C3)),
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
            // M15.304 17.187 l-5.023 -6.821 c-0.31 -0.404 -0.495 -0.869 -0.495 -1.365 0 -1.364 1.023 -2.263 2.356 -2.263 0.775 0 1.581 0.527 2.015 1.147 l3.845 5.457 3.845 -5.457 c0.435 -0.62 1.24 -1.147 2.015 -1.147 1.334 0 2.358 0.899 2.358 2.263 0 0.496 -0.186 0.961 -0.496 1.364 L20.7 17.186 l6.139 8.248 c0.248 0.341 0.527 0.93 0.527 1.581 0 1.303 -0.992 2.17 -2.355 2.17 -0.838 0 -1.457 -0.371 -1.923 -1.022 l-5.085 -7.069 -5.085 7.069 c-0.465 0.651 -1.085 1.022 -1.922 1.022 -1.364 0 -2.356 -0.867 -2.356 -2.17 0 -0.651 0.279 -1.24 0.527 -1.581 l6.137 -8.247z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 15.304 17.187
                moveTo(x = 15.304f, y = 17.187f)
                // l -5.023 -6.821
                lineToRelative(dx = -5.023f, dy = -6.821f)
                // c -0.31 -0.404 -0.495 -0.869 -0.495 -1.365
                curveToRelative(
                    dx1 = -0.31f,
                    dy1 = -0.404f,
                    dx2 = -0.495f,
                    dy2 = -0.869f,
                    dx3 = -0.495f,
                    dy3 = -1.365f,
                )
                // c 0 -1.364 1.023 -2.263 2.356 -2.263
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.364f,
                    dx2 = 1.023f,
                    dy2 = -2.263f,
                    dx3 = 2.356f,
                    dy3 = -2.263f,
                )
                // c 0.775 0 1.581 0.527 2.015 1.147
                curveToRelative(
                    dx1 = 0.775f,
                    dy1 = 0.0f,
                    dx2 = 1.581f,
                    dy2 = 0.527f,
                    dx3 = 2.015f,
                    dy3 = 1.147f,
                )
                // l 3.845 5.457
                lineToRelative(dx = 3.845f, dy = 5.457f)
                // l 3.845 -5.457
                lineToRelative(dx = 3.845f, dy = -5.457f)
                // c 0.435 -0.62 1.24 -1.147 2.015 -1.147
                curveToRelative(
                    dx1 = 0.435f,
                    dy1 = -0.62f,
                    dx2 = 1.24f,
                    dy2 = -1.147f,
                    dx3 = 2.015f,
                    dy3 = -1.147f,
                )
                // c 1.334 0 2.358 0.899 2.358 2.263
                curveToRelative(
                    dx1 = 1.334f,
                    dy1 = 0.0f,
                    dx2 = 2.358f,
                    dy2 = 0.899f,
                    dx3 = 2.358f,
                    dy3 = 2.263f,
                )
                // c 0 0.496 -0.186 0.961 -0.496 1.364
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.496f,
                    dx2 = -0.186f,
                    dy2 = 0.961f,
                    dx3 = -0.496f,
                    dy3 = 1.364f,
                )
                // L 20.7 17.186
                lineTo(x = 20.7f, y = 17.186f)
                // l 6.139 8.248
                lineToRelative(dx = 6.139f, dy = 8.248f)
                // c 0.248 0.341 0.527 0.93 0.527 1.581
                curveToRelative(
                    dx1 = 0.248f,
                    dy1 = 0.341f,
                    dx2 = 0.527f,
                    dy2 = 0.93f,
                    dx3 = 0.527f,
                    dy3 = 1.581f,
                )
                // c 0 1.303 -0.992 2.17 -2.355 2.17
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.303f,
                    dx2 = -0.992f,
                    dy2 = 2.17f,
                    dx3 = -2.355f,
                    dy3 = 2.17f,
                )
                // c -0.838 0 -1.457 -0.371 -1.923 -1.022
                curveToRelative(
                    dx1 = -0.838f,
                    dy1 = 0.0f,
                    dx2 = -1.457f,
                    dy2 = -0.371f,
                    dx3 = -1.923f,
                    dy3 = -1.022f,
                )
                // l -5.085 -7.069
                lineToRelative(dx = -5.085f, dy = -7.069f)
                // l -5.085 7.069
                lineToRelative(dx = -5.085f, dy = 7.069f)
                // c -0.465 0.651 -1.085 1.022 -1.922 1.022
                curveToRelative(
                    dx1 = -0.465f,
                    dy1 = 0.651f,
                    dx2 = -1.085f,
                    dy2 = 1.022f,
                    dx3 = -1.922f,
                    dy3 = 1.022f,
                )
                // c -1.364 0 -2.356 -0.867 -2.356 -2.17
                curveToRelative(
                    dx1 = -1.364f,
                    dy1 = 0.0f,
                    dx2 = -2.356f,
                    dy2 = -0.867f,
                    dx3 = -2.356f,
                    dy3 = -2.17f,
                )
                // c 0 -0.651 0.279 -1.24 0.527 -1.581
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.651f,
                    dx2 = 0.279f,
                    dy2 = -1.24f,
                    dx3 = 0.527f,
                    dy3 = -1.581f,
                )
                // l 6.137 -8.247z
                lineToRelative(dx = 6.137f, dy = -8.247f)
                close()
            }
        }.build().also { _emoji1f1fd = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1fd: ImageVector? = null
