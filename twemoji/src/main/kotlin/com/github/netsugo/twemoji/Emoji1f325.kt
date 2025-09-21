package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f325: ImageVector
    get() {
        val current = _emoji1f325
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f325",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M13 6 s0 -2 2 -2 2 2 2 2 v2 s0 2 -2 2 -2 -2 -2 -2 L13 6z M4 17 s2 0 2 2 -2 2 -2 2 L2 21 s-2 0 -2 -2 2 -2 2 -2 h2z M7.872 10.043 s1.414 1.414 0 2.828 -2.828 0 -2.828 0 l-1.415 -1.414 s-1.414 -1.414 0 -2.829 c1.415 -1.414 2.829 0 2.829 0 l1.414 1.415z M24.957 12.871 s-1.414 1.414 -2.828 0 0 -2.828 0 -2.828 l1.414 -1.414 s1.414 -1.414 2.828 0 0 2.828 0 2.828 l-1.414 1.414z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 13 6
                moveTo(x = 13.0f, y = 6.0f)
                // s 0 -2 2 -2
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // s 2 2 2 2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // s 0 2 -2 2
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                    dx2 = -2.0f,
                    dy2 = 2.0f,
                )
                // s -2 -2 -2 -2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                    dx2 = -2.0f,
                    dy2 = -2.0f,
                )
                // L 13 6z
                lineTo(x = 13.0f, y = 6.0f)
                close()
                // M 4 17
                moveTo(x = 4.0f, y = 17.0f)
                // s 2 0 2 2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                )
                // s -2 2 -2 2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                    dx2 = -2.0f,
                    dy2 = 2.0f,
                )
                // L 2 21
                lineTo(x = 2.0f, y = 21.0f)
                // s -2 0 -2 -2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -2.0f,
                )
                // s 2 -2 2 -2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // h 2z
                horizontalLineToRelative(dx = 2.0f)
                close()
                // M 7.872 10.043
                moveTo(x = 7.872f, y = 10.043f)
                // s 1.414 1.414 0 2.828
                reflectiveCurveToRelative(
                    dx1 = 1.414f,
                    dy1 = 1.414f,
                    dx2 = 0.0f,
                    dy2 = 2.828f,
                )
                // s -2.828 0 -2.828 0
                reflectiveCurveToRelative(
                    dx1 = -2.828f,
                    dy1 = 0.0f,
                    dx2 = -2.828f,
                    dy2 = 0.0f,
                )
                // l -1.415 -1.414
                lineToRelative(dx = -1.415f, dy = -1.414f)
                // s -1.414 -1.414 0 -2.829
                reflectiveCurveToRelative(
                    dx1 = -1.414f,
                    dy1 = -1.414f,
                    dx2 = 0.0f,
                    dy2 = -2.829f,
                )
                // c 1.415 -1.414 2.829 0 2.829 0
                curveToRelative(
                    dx1 = 1.415f,
                    dy1 = -1.414f,
                    dx2 = 2.829f,
                    dy2 = 0.0f,
                    dx3 = 2.829f,
                    dy3 = 0.0f,
                )
                // l 1.414 1.415z
                lineToRelative(dx = 1.414f, dy = 1.415f)
                close()
                // M 24.957 12.871
                moveTo(x = 24.957f, y = 12.871f)
                // s -1.414 1.414 -2.828 0
                reflectiveCurveToRelative(
                    dx1 = -1.414f,
                    dy1 = 1.414f,
                    dx2 = -2.828f,
                    dy2 = 0.0f,
                )
                // s 0 -2.828 0 -2.828
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.828f,
                    dx2 = 0.0f,
                    dy2 = -2.828f,
                )
                // l 1.414 -1.414
                lineToRelative(dx = 1.414f, dy = -1.414f)
                // s 1.414 -1.414 2.828 0
                reflectiveCurveToRelative(
                    dx1 = 1.414f,
                    dy1 = -1.414f,
                    dx2 = 2.828f,
                    dy2 = 0.0f,
                )
                // s 0 2.828 0 2.828
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.828f,
                    dx2 = 0.0f,
                    dy2 = 2.828f,
                )
                // l -1.414 1.414z
                lineToRelative(dx = -1.414f, dy = 1.414f)
                close()
            }
            // M15 19 m-8 0 a8 8 0 1 1 16 0 a8 8 0 1 1 -16 0
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 15 19
                moveTo(x = 15.0f, y = 19.0f)
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
            // M28.223 16.8 c-0.803 0 -1.575 0.119 -2.304 0.34 -0.862 -2.409 -3.201 -4.14 -5.961 -4.14 -2.959 0 -5.437 1.991 -6.123 4.675 -0.733 -0.542 -1.636 -0.875 -2.626 -0.875 -2.417 0 -4.375 1.914 -4.375 4.275 0 0.573 0.12 1.118 0.329 1.618 -0.417 -0.113 -0.848 -0.193 -1.302 -0.193 C3.176 22.5 1 24.626 1 27.25 S3.176 32 5.861 32 h22.361 C32.518 32 36 28.598 36 24.4 s-3.482 -7.6 -7.777 -7.6z
            path(
                fill = SolidColor(Color(0xFFE1E8ED)),
            ) {
                // M 28.223 16.8
                moveTo(x = 28.223f, y = 16.8f)
                // c -0.803 0 -1.575 0.119 -2.304 0.34
                curveToRelative(
                    dx1 = -0.803f,
                    dy1 = 0.0f,
                    dx2 = -1.575f,
                    dy2 = 0.119f,
                    dx3 = -2.304f,
                    dy3 = 0.34f,
                )
                // c -0.862 -2.409 -3.201 -4.14 -5.961 -4.14
                curveToRelative(
                    dx1 = -0.862f,
                    dy1 = -2.409f,
                    dx2 = -3.201f,
                    dy2 = -4.14f,
                    dx3 = -5.961f,
                    dy3 = -4.14f,
                )
                // c -2.959 0 -5.437 1.991 -6.123 4.675
                curveToRelative(
                    dx1 = -2.959f,
                    dy1 = 0.0f,
                    dx2 = -5.437f,
                    dy2 = 1.991f,
                    dx3 = -6.123f,
                    dy3 = 4.675f,
                )
                // c -0.733 -0.542 -1.636 -0.875 -2.626 -0.875
                curveToRelative(
                    dx1 = -0.733f,
                    dy1 = -0.542f,
                    dx2 = -1.636f,
                    dy2 = -0.875f,
                    dx3 = -2.626f,
                    dy3 = -0.875f,
                )
                // c -2.417 0 -4.375 1.914 -4.375 4.275
                curveToRelative(
                    dx1 = -2.417f,
                    dy1 = 0.0f,
                    dx2 = -4.375f,
                    dy2 = 1.914f,
                    dx3 = -4.375f,
                    dy3 = 4.275f,
                )
                // c 0 0.573 0.12 1.118 0.329 1.618
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.573f,
                    dx2 = 0.12f,
                    dy2 = 1.118f,
                    dx3 = 0.329f,
                    dy3 = 1.618f,
                )
                // c -0.417 -0.113 -0.848 -0.193 -1.302 -0.193
                curveToRelative(
                    dx1 = -0.417f,
                    dy1 = -0.113f,
                    dx2 = -0.848f,
                    dy2 = -0.193f,
                    dx3 = -1.302f,
                    dy3 = -0.193f,
                )
                // C 3.176 22.5 1 24.626 1 27.25
                curveTo(
                    x1 = 3.176f,
                    y1 = 22.5f,
                    x2 = 1.0f,
                    y2 = 24.626f,
                    x3 = 1.0f,
                    y3 = 27.25f,
                )
                // S 3.176 32 5.861 32
                reflectiveCurveTo(
                    x1 = 3.176f,
                    y1 = 32.0f,
                    x2 = 5.861f,
                    y2 = 32.0f,
                )
                // h 22.361
                horizontalLineToRelative(dx = 22.361f)
                // C 32.518 32 36 28.598 36 24.4
                curveTo(
                    x1 = 32.518f,
                    y1 = 32.0f,
                    x2 = 36.0f,
                    y2 = 28.598f,
                    x3 = 36.0f,
                    y3 = 24.4f,
                )
                // s -3.482 -7.6 -7.777 -7.6z
                reflectiveCurveToRelative(
                    dx1 = -3.482f,
                    dy1 = -7.6f,
                    dx2 = -7.777f,
                    dy2 = -7.6f,
                )
                close()
            }
        }.build().also { _emoji1f325 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f325: ImageVector? = null
