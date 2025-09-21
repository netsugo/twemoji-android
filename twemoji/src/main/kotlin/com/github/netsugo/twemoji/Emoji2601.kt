package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji2601: ImageVector
    get() {
        val current = _emoji2601
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji2601",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M27 8 c-0.701 0 -1.377 0.106 -2.015 0.298 0.005 -0.1 0.015 -0.197 0.015 -0.298 0 -3.313 -2.687 -6 -6 -6 -2.769 0 -5.093 1.878 -5.785 4.427 C12.529 6.154 11.783 6 11 6 c-3.314 0 -6 2.686 -6 6 0 3.312 2.686 6 6 6 2.769 0 5.093 -1.878 5.785 -4.428 0.686 0.273 1.432 0.428 2.215 0.428 0.375 0 0.74 -0.039 1.096 -0.104 -0.058 0.36 -0.096 0.727 -0.096 1.104 0 3.865 3.135 7 7 7 s7 -3.135 7 -7 c0 -3.866 -3.135 -7 -7 -7z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 27 8
                moveTo(x = 27.0f, y = 8.0f)
                // c -0.701 0 -1.377 0.106 -2.015 0.298
                curveToRelative(
                    dx1 = -0.701f,
                    dy1 = 0.0f,
                    dx2 = -1.377f,
                    dy2 = 0.106f,
                    dx3 = -2.015f,
                    dy3 = 0.298f,
                )
                // c 0.005 -0.1 0.015 -0.197 0.015 -0.298
                curveToRelative(
                    dx1 = 0.005f,
                    dy1 = -0.1f,
                    dx2 = 0.015f,
                    dy2 = -0.197f,
                    dx3 = 0.015f,
                    dy3 = -0.298f,
                )
                // c 0 -3.313 -2.687 -6 -6 -6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.313f,
                    dx2 = -2.687f,
                    dy2 = -6.0f,
                    dx3 = -6.0f,
                    dy3 = -6.0f,
                )
                // c -2.769 0 -5.093 1.878 -5.785 4.427
                curveToRelative(
                    dx1 = -2.769f,
                    dy1 = 0.0f,
                    dx2 = -5.093f,
                    dy2 = 1.878f,
                    dx3 = -5.785f,
                    dy3 = 4.427f,
                )
                // C 12.529 6.154 11.783 6 11 6
                curveTo(
                    x1 = 12.529f,
                    y1 = 6.154f,
                    x2 = 11.783f,
                    y2 = 6.0f,
                    x3 = 11.0f,
                    y3 = 6.0f,
                )
                // c -3.314 0 -6 2.686 -6 6
                curveToRelative(
                    dx1 = -3.314f,
                    dy1 = 0.0f,
                    dx2 = -6.0f,
                    dy2 = 2.686f,
                    dx3 = -6.0f,
                    dy3 = 6.0f,
                )
                // c 0 3.312 2.686 6 6 6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.312f,
                    dx2 = 2.686f,
                    dy2 = 6.0f,
                    dx3 = 6.0f,
                    dy3 = 6.0f,
                )
                // c 2.769 0 5.093 -1.878 5.785 -4.428
                curveToRelative(
                    dx1 = 2.769f,
                    dy1 = 0.0f,
                    dx2 = 5.093f,
                    dy2 = -1.878f,
                    dx3 = 5.785f,
                    dy3 = -4.428f,
                )
                // c 0.686 0.273 1.432 0.428 2.215 0.428
                curveToRelative(
                    dx1 = 0.686f,
                    dy1 = 0.273f,
                    dx2 = 1.432f,
                    dy2 = 0.428f,
                    dx3 = 2.215f,
                    dy3 = 0.428f,
                )
                // c 0.375 0 0.74 -0.039 1.096 -0.104
                curveToRelative(
                    dx1 = 0.375f,
                    dy1 = 0.0f,
                    dx2 = 0.74f,
                    dy2 = -0.039f,
                    dx3 = 1.096f,
                    dy3 = -0.104f,
                )
                // c -0.058 0.36 -0.096 0.727 -0.096 1.104
                curveToRelative(
                    dx1 = -0.058f,
                    dy1 = 0.36f,
                    dx2 = -0.096f,
                    dy2 = 0.727f,
                    dx3 = -0.096f,
                    dy3 = 1.104f,
                )
                // c 0 3.865 3.135 7 7 7
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.865f,
                    dx2 = 3.135f,
                    dy2 = 7.0f,
                    dx3 = 7.0f,
                    dy3 = 7.0f,
                )
                // s 7 -3.135 7 -7
                reflectiveCurveToRelative(
                    dx1 = 7.0f,
                    dy1 = -3.135f,
                    dx2 = 7.0f,
                    dy2 = -7.0f,
                )
                // c 0 -3.866 -3.135 -7 -7 -7z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.866f,
                    dx2 = -3.135f,
                    dy2 = -7.0f,
                    dx3 = -7.0f,
                    dy3 = -7.0f,
                )
                close()
            }
            // M31 22 c-0.467 0 -0.91 0.085 -1.339 0.204 0.216 -0.526 0.339 -1.1 0.339 -1.704 0 -2.485 -2.015 -4.5 -4.5 -4.5 -1.019 0 -1.947 0.351 -2.701 0.921 C22.093 14.096 19.544 12 16.5 12 c-2.838 0 -5.245 1.822 -6.131 4.357 C9.621 16.125 8.825 16 8 16 c-4.418 0 -8 3.582 -8 8 0 4.419 3.582 8 8 8 h23 c2.762 0 5 -2.238 5 -5 s-2.238 -5 -5 -5z
            path(
                fill = SolidColor(Color(0xFFE1E8ED)),
            ) {
                // M 31 22
                moveTo(x = 31.0f, y = 22.0f)
                // c -0.467 0 -0.91 0.085 -1.339 0.204
                curveToRelative(
                    dx1 = -0.467f,
                    dy1 = 0.0f,
                    dx2 = -0.91f,
                    dy2 = 0.085f,
                    dx3 = -1.339f,
                    dy3 = 0.204f,
                )
                // c 0.216 -0.526 0.339 -1.1 0.339 -1.704
                curveToRelative(
                    dx1 = 0.216f,
                    dy1 = -0.526f,
                    dx2 = 0.339f,
                    dy2 = -1.1f,
                    dx3 = 0.339f,
                    dy3 = -1.704f,
                )
                // c 0 -2.485 -2.015 -4.5 -4.5 -4.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.485f,
                    dx2 = -2.015f,
                    dy2 = -4.5f,
                    dx3 = -4.5f,
                    dy3 = -4.5f,
                )
                // c -1.019 0 -1.947 0.351 -2.701 0.921
                curveToRelative(
                    dx1 = -1.019f,
                    dy1 = 0.0f,
                    dx2 = -1.947f,
                    dy2 = 0.351f,
                    dx3 = -2.701f,
                    dy3 = 0.921f,
                )
                // C 22.093 14.096 19.544 12 16.5 12
                curveTo(
                    x1 = 22.093f,
                    y1 = 14.096f,
                    x2 = 19.544f,
                    y2 = 12.0f,
                    x3 = 16.5f,
                    y3 = 12.0f,
                )
                // c -2.838 0 -5.245 1.822 -6.131 4.357
                curveToRelative(
                    dx1 = -2.838f,
                    dy1 = 0.0f,
                    dx2 = -5.245f,
                    dy2 = 1.822f,
                    dx3 = -6.131f,
                    dy3 = 4.357f,
                )
                // C 9.621 16.125 8.825 16 8 16
                curveTo(
                    x1 = 9.621f,
                    y1 = 16.125f,
                    x2 = 8.825f,
                    y2 = 16.0f,
                    x3 = 8.0f,
                    y3 = 16.0f,
                )
                // c -4.418 0 -8 3.582 -8 8
                curveToRelative(
                    dx1 = -4.418f,
                    dy1 = 0.0f,
                    dx2 = -8.0f,
                    dy2 = 3.582f,
                    dx3 = -8.0f,
                    dy3 = 8.0f,
                )
                // c 0 4.419 3.582 8 8 8
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.419f,
                    dx2 = 3.582f,
                    dy2 = 8.0f,
                    dx3 = 8.0f,
                    dy3 = 8.0f,
                )
                // h 23
                horizontalLineToRelative(dx = 23.0f)
                // c 2.762 0 5 -2.238 5 -5
                curveToRelative(
                    dx1 = 2.762f,
                    dy1 = 0.0f,
                    dx2 = 5.0f,
                    dy2 = -2.238f,
                    dx3 = 5.0f,
                    dy3 = -5.0f,
                )
                // s -2.238 -5 -5 -5z
                reflectiveCurveToRelative(
                    dx1 = -2.238f,
                    dy1 = -5.0f,
                    dx2 = -5.0f,
                    dy2 = -5.0f,
                )
                close()
            }
        }.build().also { _emoji2601 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji2601: ImageVector? = null
