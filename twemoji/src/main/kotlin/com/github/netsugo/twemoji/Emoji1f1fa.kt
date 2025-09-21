package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1fa: ImageVector
    get() {
        val current = _emoji1f1fa
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1fa",
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
            // M8 9.156 c0 -1.55 1.167 -2.418 2.5 -2.418 s2.5 0.868 2.5 2.418 v10.821 c0 2.853 2.055 4.923 5 4.923 2.822 0 5 -2.194 5 -4.923 V9.156 c0 -1.55 1.168 -2.418 2.5 -2.418 1.334 0 2.467 0.868 2.467 2.418 v11.069 c0 5.209 -4.852 9.147 -9.967 9.147 -5.178 0 -10 -3.876 -10 -9.147 V9.156z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 8 9.156
                moveTo(x = 8.0f, y = 9.156f)
                // c 0 -1.55 1.167 -2.418 2.5 -2.418
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.55f,
                    dx2 = 1.167f,
                    dy2 = -2.418f,
                    dx3 = 2.5f,
                    dy3 = -2.418f,
                )
                // s 2.5 0.868 2.5 2.418
                reflectiveCurveToRelative(
                    dx1 = 2.5f,
                    dy1 = 0.868f,
                    dx2 = 2.5f,
                    dy2 = 2.418f,
                )
                // v 10.821
                verticalLineToRelative(dy = 10.821f)
                // c 0 2.853 2.055 4.923 5 4.923
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.853f,
                    dx2 = 2.055f,
                    dy2 = 4.923f,
                    dx3 = 5.0f,
                    dy3 = 4.923f,
                )
                // c 2.822 0 5 -2.194 5 -4.923
                curveToRelative(
                    dx1 = 2.822f,
                    dy1 = 0.0f,
                    dx2 = 5.0f,
                    dy2 = -2.194f,
                    dx3 = 5.0f,
                    dy3 = -4.923f,
                )
                // V 9.156
                verticalLineTo(y = 9.156f)
                // c 0 -1.55 1.168 -2.418 2.5 -2.418
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.55f,
                    dx2 = 1.168f,
                    dy2 = -2.418f,
                    dx3 = 2.5f,
                    dy3 = -2.418f,
                )
                // c 1.334 0 2.467 0.868 2.467 2.418
                curveToRelative(
                    dx1 = 1.334f,
                    dy1 = 0.0f,
                    dx2 = 2.467f,
                    dy2 = 0.868f,
                    dx3 = 2.467f,
                    dy3 = 2.418f,
                )
                // v 11.069
                verticalLineToRelative(dy = 11.069f)
                // c 0 5.209 -4.852 9.147 -9.967 9.147
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 5.209f,
                    dx2 = -4.852f,
                    dy2 = 9.147f,
                    dx3 = -9.967f,
                    dy3 = 9.147f,
                )
                // c -5.178 0 -10 -3.876 -10 -9.147
                curveToRelative(
                    dx1 = -5.178f,
                    dy1 = 0.0f,
                    dx2 = -10.0f,
                    dy2 = -3.876f,
                    dx3 = -10.0f,
                    dy3 = -9.147f,
                )
                // V 9.156z
                verticalLineTo(y = 9.156f)
                close()
            }
        }.build().also { _emoji1f1fa = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1fa: ImageVector? = null
