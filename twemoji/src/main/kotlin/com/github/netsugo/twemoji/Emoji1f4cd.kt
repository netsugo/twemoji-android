package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f4cd: ImageVector
    get() {
        val current = _emoji1f4cd
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f4cd",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M14 34.5 a4 1.5 0 1 0 8 0 a4 1.5 0 1 0 -8 0z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 14 34.5
                moveTo(x = 14.0f, y = 34.5f)
                // a 4 1.5 0 1 0 8 0
                arcToRelative(
                    a = 4.0f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 8.0f,
                    dy1 = 0.0f,
                )
                // a 4 1.5 0 1 0 -8 0z
                arcToRelative(
                    a = 4.0f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -8.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M14.339 10.725 S16.894 34.998 18.001 35 c1.106 0.001 3.66 -24.275 3.66 -24.275 h-7.322z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 14.339 10.725
                moveTo(x = 14.339f, y = 10.725f)
                // S 16.894 34.998 18.001 35
                reflectiveCurveTo(
                    x1 = 16.894f,
                    y1 = 34.998f,
                    x2 = 18.001f,
                    y2 = 35.0f,
                )
                // c 1.106 0.001 3.66 -24.275 3.66 -24.275
                curveToRelative(
                    dx1 = 1.106f,
                    dy1 = 0.001f,
                    dx2 = 3.66f,
                    dy2 = -24.275f,
                    dx3 = 3.66f,
                    dy3 = -24.275f,
                )
                // h -7.322z
                horizontalLineToRelative(dx = -7.322f)
                close()
            }
            // M18 8 m-8 0 a8 8 0 1 1 16 0 a8 8 0 1 1 -16 0
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 18 8
                moveTo(x = 18.0f, y = 8.0f)
                // m -8 0
                moveToRelative(dx = -8.0f, dy = 0.0f)
                // a 8 8 0 1 1 16 0
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 16.0f,
                    dy1 = 0.0f,
                )
                // a 8 8 0 1 1 -16 0
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -16.0f,
                    dy1 = 0.0f,
                )
            }
        }.build().also { _emoji1f4cd = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f4cd: ImageVector? = null
