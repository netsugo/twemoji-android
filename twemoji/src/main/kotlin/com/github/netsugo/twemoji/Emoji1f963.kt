package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f963: ImageVector
    get() {
        val current = _emoji1f963
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f963",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M16 31 c8.837 0 16 -7.163 16 -16 H0 c0 8.837 7.164 16 16 16z
            path(
                fill = SolidColor(Color(0xFFA0041E)),
            ) {
                // M 16 31
                moveTo(x = 16.0f, y = 31.0f)
                // c 8.837 0 16 -7.163 16 -16
                curveToRelative(
                    dx1 = 8.837f,
                    dy1 = 0.0f,
                    dx2 = 16.0f,
                    dy2 = -7.163f,
                    dx3 = 16.0f,
                    dy3 = -16.0f,
                )
                // H 0
                horizontalLineTo(x = 0.0f)
                // c 0 8.837 7.164 16 16 16z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 8.837f,
                    dx2 = 7.164f,
                    dy2 = 16.0f,
                    dx3 = 16.0f,
                    dy3 = 16.0f,
                )
                close()
            }
            // M-0.051 15 a16.051 8.917 0 1 0 32.102 0 a16.051 8.917 0 1 0 -32.102 0z
            path(
                fill = SolidColor(Color(0xFFEA596E)),
            ) {
                // M -0.051 15
                moveTo(x = -0.051f, y = 15.0f)
                // a 16.051 8.917 0 1 0 32.102 0
                arcToRelative(
                    a = 16.051f,
                    b = 8.917f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 32.102f,
                    dy1 = 0.0f,
                )
                // a 16.051 8.917 0 1 0 -32.102 0z
                arcToRelative(
                    a = 16.051f,
                    b = 8.917f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -32.102f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M1.359 15 a14.641 7.719 0 1 0 29.282 0 a14.641 7.719 0 1 0 -29.282 0z
            path(
                fill = SolidColor(Color(0xFF662113)),
            ) {
                // M 1.359 15
                moveTo(x = 1.359f, y = 15.0f)
                // a 14.641 7.719 0 1 0 29.282 0
                arcToRelative(
                    a = 14.641f,
                    b = 7.719f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 29.282f,
                    dy1 = 0.0f,
                )
                // a 14.641 7.719 0 1 0 -29.282 0z
                arcToRelative(
                    a = 14.641f,
                    b = 7.719f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -29.282f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M34 8 c-1 0 -4 1 -8 4 -4.525 3.394 -7.596 2.187 -7.596 2.187 l0.001 0.003 C16.981 13.453 15.087 13 13 13 c-4.418 0 -8 2.015 -8 4.5 S8.582 22 13 22 c2.773 0 5.216 -0.794 6.651 -2 0 0 4.995 -4.431 7.349 -6 3 -2 5 -3 7 -3 s2 -3 0 -3z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 34 8
                moveTo(x = 34.0f, y = 8.0f)
                // c -1 0 -4 1 -8 4
                curveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = 1.0f,
                    dx3 = -8.0f,
                    dy3 = 4.0f,
                )
                // c -4.525 3.394 -7.596 2.187 -7.596 2.187
                curveToRelative(
                    dx1 = -4.525f,
                    dy1 = 3.394f,
                    dx2 = -7.596f,
                    dy2 = 2.187f,
                    dx3 = -7.596f,
                    dy3 = 2.187f,
                )
                // l 0.001 0.003
                lineToRelative(dx = 0.001f, dy = 0.003f)
                // C 16.981 13.453 15.087 13 13 13
                curveTo(
                    x1 = 16.981f,
                    y1 = 13.453f,
                    x2 = 15.087f,
                    y2 = 13.0f,
                    x3 = 13.0f,
                    y3 = 13.0f,
                )
                // c -4.418 0 -8 2.015 -8 4.5
                curveToRelative(
                    dx1 = -4.418f,
                    dy1 = 0.0f,
                    dx2 = -8.0f,
                    dy2 = 2.015f,
                    dx3 = -8.0f,
                    dy3 = 4.5f,
                )
                // S 8.582 22 13 22
                reflectiveCurveTo(
                    x1 = 8.582f,
                    y1 = 22.0f,
                    x2 = 13.0f,
                    y2 = 22.0f,
                )
                // c 2.773 0 5.216 -0.794 6.651 -2
                curveToRelative(
                    dx1 = 2.773f,
                    dy1 = 0.0f,
                    dx2 = 5.216f,
                    dy2 = -0.794f,
                    dx3 = 6.651f,
                    dy3 = -2.0f,
                )
                // c 0 0 4.995 -4.431 7.349 -6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 4.995f,
                    dy2 = -4.431f,
                    dx3 = 7.349f,
                    dy3 = -6.0f,
                )
                // c 3 -2 5 -3 7 -3
                curveToRelative(
                    dx1 = 3.0f,
                    dy1 = -2.0f,
                    dx2 = 5.0f,
                    dy2 = -3.0f,
                    dx3 = 7.0f,
                    dy3 = -3.0f,
                )
                // s 2 -3 0 -3z
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = -3.0f,
                    dx2 = 0.0f,
                    dy2 = -3.0f,
                )
                close()
            }
            // M8 19 a5 2.5 0 1 0 10 0 a5 2.5 0 1 0 -10 0z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 8 19
                moveTo(x = 8.0f, y = 19.0f)
                // a 5 2.5 0 1 0 10 0
                arcToRelative(
                    a = 5.0f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 10.0f,
                    dy1 = 0.0f,
                )
                // a 5 2.5 0 1 0 -10 0z
                arcToRelative(
                    a = 5.0f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -10.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _emoji1f963 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f963: ImageVector? = null
