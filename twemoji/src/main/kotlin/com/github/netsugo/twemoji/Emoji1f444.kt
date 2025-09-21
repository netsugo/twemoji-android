package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f444: ImageVector
    get() {
        val current = _emoji1f444
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f444",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M29 12 c-4.688 -3.515 -6 -6 -8 -6 s-2 1 -3 1 -1 -1 -3 -1 -3.313 2.485 -8 6 c-4 3 -7 3 -7 5 s5 6 8 9 c2 2 5 4 10 4 s8 -2 10 -4 c3 -3 8 -7 8 -9 s-3 -2 -7 -5z
            path(
                fill = SolidColor(Color(0xFFE75A70)),
            ) {
                // M 29 12
                moveTo(x = 29.0f, y = 12.0f)
                // c -4.688 -3.515 -6 -6 -8 -6
                curveToRelative(
                    dx1 = -4.688f,
                    dy1 = -3.515f,
                    dx2 = -6.0f,
                    dy2 = -6.0f,
                    dx3 = -8.0f,
                    dy3 = -6.0f,
                )
                // s -2 1 -3 1
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 1.0f,
                    dx2 = -3.0f,
                    dy2 = 1.0f,
                )
                // s -1 -1 -3 -1
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                    dx2 = -3.0f,
                    dy2 = -1.0f,
                )
                // s -3.313 2.485 -8 6
                reflectiveCurveToRelative(
                    dx1 = -3.313f,
                    dy1 = 2.485f,
                    dx2 = -8.0f,
                    dy2 = 6.0f,
                )
                // c -4 3 -7 3 -7 5
                curveToRelative(
                    dx1 = -4.0f,
                    dy1 = 3.0f,
                    dx2 = -7.0f,
                    dy2 = 3.0f,
                    dx3 = -7.0f,
                    dy3 = 5.0f,
                )
                // s 5 6 8 9
                reflectiveCurveToRelative(
                    dx1 = 5.0f,
                    dy1 = 6.0f,
                    dx2 = 8.0f,
                    dy2 = 9.0f,
                )
                // c 2 2 5 4 10 4
                curveToRelative(
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                    dx2 = 5.0f,
                    dy2 = 4.0f,
                    dx3 = 10.0f,
                    dy3 = 4.0f,
                )
                // s 8 -2 10 -4
                reflectiveCurveToRelative(
                    dx1 = 8.0f,
                    dy1 = -2.0f,
                    dx2 = 10.0f,
                    dy2 = -4.0f,
                )
                // c 3 -3 8 -7 8 -9
                curveToRelative(
                    dx1 = 3.0f,
                    dy1 = -3.0f,
                    dx2 = 8.0f,
                    dy2 = -7.0f,
                    dx3 = 8.0f,
                    dy3 = -9.0f,
                )
                // s -3 -2 -7 -5z
                reflectiveCurveToRelative(
                    dx1 = -3.0f,
                    dy1 = -2.0f,
                    dx2 = -7.0f,
                    dy2 = -5.0f,
                )
                close()
            }
            // M28.389 15.5 C23.963 14.035 21 13.417 18 13.417 s-5.962 0.618 -10.389 2.083 C3.833 16.75 1 16.167 1 17 c0 0.834 9 5 17 5 s17 -4.166 17 -5 c0 -0.833 -2.834 -0.25 -6.611 -1.5z
            path(
                fill = SolidColor(Color(0xFF662113)),
            ) {
                // M 28.389 15.5
                moveTo(x = 28.389f, y = 15.5f)
                // C 23.963 14.035 21 13.417 18 13.417
                curveTo(
                    x1 = 23.963f,
                    y1 = 14.035f,
                    x2 = 21.0f,
                    y2 = 13.417f,
                    x3 = 18.0f,
                    y3 = 13.417f,
                )
                // s -5.962 0.618 -10.389 2.083
                reflectiveCurveToRelative(
                    dx1 = -5.962f,
                    dy1 = 0.618f,
                    dx2 = -10.389f,
                    dy2 = 2.083f,
                )
                // C 3.833 16.75 1 16.167 1 17
                curveTo(
                    x1 = 3.833f,
                    y1 = 16.75f,
                    x2 = 1.0f,
                    y2 = 16.167f,
                    x3 = 1.0f,
                    y3 = 17.0f,
                )
                // c 0 0.834 9 5 17 5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.834f,
                    dx2 = 9.0f,
                    dy2 = 5.0f,
                    dx3 = 17.0f,
                    dy3 = 5.0f,
                )
                // s 17 -4.166 17 -5
                reflectiveCurveToRelative(
                    dx1 = 17.0f,
                    dy1 = -4.166f,
                    dx2 = 17.0f,
                    dy2 = -5.0f,
                )
                // c 0 -0.833 -2.834 -0.25 -6.611 -1.5z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.833f,
                    dx2 = -2.834f,
                    dy2 = -0.25f,
                    dx3 = -6.611f,
                    dy3 = -1.5f,
                )
                close()
            }
            // M28.389 15.5 C23.963 14.035 21 13.417 18 13.417 s-5.962 0.618 -10.389 2.083 c-3.624 1.199 -6.371 0.715 -6.59 1.408 2.454 0.385 9.119 -0.644 16.979 -0.644 s14.524 1.029 16.979 0.644 c-0.219 -0.693 -2.967 -0.209 -6.59 -1.408z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 28.389 15.5
                moveTo(x = 28.389f, y = 15.5f)
                // C 23.963 14.035 21 13.417 18 13.417
                curveTo(
                    x1 = 23.963f,
                    y1 = 14.035f,
                    x2 = 21.0f,
                    y2 = 13.417f,
                    x3 = 18.0f,
                    y3 = 13.417f,
                )
                // s -5.962 0.618 -10.389 2.083
                reflectiveCurveToRelative(
                    dx1 = -5.962f,
                    dy1 = 0.618f,
                    dx2 = -10.389f,
                    dy2 = 2.083f,
                )
                // c -3.624 1.199 -6.371 0.715 -6.59 1.408
                curveToRelative(
                    dx1 = -3.624f,
                    dy1 = 1.199f,
                    dx2 = -6.371f,
                    dy2 = 0.715f,
                    dx3 = -6.59f,
                    dy3 = 1.408f,
                )
                // c 2.454 0.385 9.119 -0.644 16.979 -0.644
                curveToRelative(
                    dx1 = 2.454f,
                    dy1 = 0.385f,
                    dx2 = 9.119f,
                    dy2 = -0.644f,
                    dx3 = 16.979f,
                    dy3 = -0.644f,
                )
                // s 14.524 1.029 16.979 0.644
                reflectiveCurveToRelative(
                    dx1 = 14.524f,
                    dy1 = 1.029f,
                    dx2 = 16.979f,
                    dy2 = 0.644f,
                )
                // c -0.219 -0.693 -2.967 -0.209 -6.59 -1.408z
                curveToRelative(
                    dx1 = -0.219f,
                    dy1 = -0.693f,
                    dx2 = -2.967f,
                    dy2 = -0.209f,
                    dx3 = -6.59f,
                    dy3 = -1.408f,
                )
                close()
            }
        }.build().also { _emoji1f444 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f444: ImageVector? = null
