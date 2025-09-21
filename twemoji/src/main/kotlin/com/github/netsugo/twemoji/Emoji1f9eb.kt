package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f9eb: ImageVector
    get() {
        val current = _emoji1f9eb
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f9eb",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M1 15 h34 v6 H1z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 1 15
                moveTo(x = 1.0f, y = 15.0f)
                // h 34
                horizontalLineToRelative(dx = 34.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // H 1z
                horizontalLineTo(x = 1.0f)
                close()
            }
            // M18 12 c-9.389 0 -17 4.029 -17 9 0 1.06 0.364 2.073 1 3.017 0.858 1.275 2.226 2.421 4 3.357 C9.075 28.996 13.316 30 18 30 c5.81 0 10.934 -1.545 14 -3.9 0.832 -0.639 1.499 -1.34 2 -2.083 0.636 -0.945 1 -1.957 1 -3.017 0 -4.971 -7.611 -9 -17 -9z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 18 12
                moveTo(x = 18.0f, y = 12.0f)
                // c -9.389 0 -17 4.029 -17 9
                curveToRelative(
                    dx1 = -9.389f,
                    dy1 = 0.0f,
                    dx2 = -17.0f,
                    dy2 = 4.029f,
                    dx3 = -17.0f,
                    dy3 = 9.0f,
                )
                // c 0 1.06 0.364 2.073 1 3.017
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.06f,
                    dx2 = 0.364f,
                    dy2 = 2.073f,
                    dx3 = 1.0f,
                    dy3 = 3.017f,
                )
                // c 0.858 1.275 2.226 2.421 4 3.357
                curveToRelative(
                    dx1 = 0.858f,
                    dy1 = 1.275f,
                    dx2 = 2.226f,
                    dy2 = 2.421f,
                    dx3 = 4.0f,
                    dy3 = 3.357f,
                )
                // C 9.075 28.996 13.316 30 18 30
                curveTo(
                    x1 = 9.075f,
                    y1 = 28.996f,
                    x2 = 13.316f,
                    y2 = 30.0f,
                    x3 = 18.0f,
                    y3 = 30.0f,
                )
                // c 5.81 0 10.934 -1.545 14 -3.9
                curveToRelative(
                    dx1 = 5.81f,
                    dy1 = 0.0f,
                    dx2 = 10.934f,
                    dy2 = -1.545f,
                    dx3 = 14.0f,
                    dy3 = -3.9f,
                )
                // c 0.832 -0.639 1.499 -1.34 2 -2.083
                curveToRelative(
                    dx1 = 0.832f,
                    dy1 = -0.639f,
                    dx2 = 1.499f,
                    dy2 = -1.34f,
                    dx3 = 2.0f,
                    dy3 = -2.083f,
                )
                // c 0.636 -0.945 1 -1.957 1 -3.017
                curveToRelative(
                    dx1 = 0.636f,
                    dy1 = -0.945f,
                    dx2 = 1.0f,
                    dy2 = -1.957f,
                    dx3 = 1.0f,
                    dy3 = -3.017f,
                )
                // c 0 -4.971 -7.611 -9 -17 -9z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.971f,
                    dx2 = -7.611f,
                    dy2 = -9.0f,
                    dx3 = -17.0f,
                    dy3 = -9.0f,
                )
                close()
            }
            // M2 18.017 v6 c0.858 1.275 2.226 2.421 4 3.357 v-6 c-1.774 -0.936 -3.142 -2.082 -4 -3.357z M34 24.017 v-6 c-0.501 0.744 -1.168 1.444 -2 2.083 v6 c0.832 -0.638 1.499 -1.339 2 -2.083z
            path(
                fill = SolidColor(Color(0xFFE1E8ED)),
            ) {
                // M 2 18.017
                moveTo(x = 2.0f, y = 18.017f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // c 0.858 1.275 2.226 2.421 4 3.357
                curveToRelative(
                    dx1 = 0.858f,
                    dy1 = 1.275f,
                    dx2 = 2.226f,
                    dy2 = 2.421f,
                    dx3 = 4.0f,
                    dy3 = 3.357f,
                )
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // c -1.774 -0.936 -3.142 -2.082 -4 -3.357z
                curveToRelative(
                    dx1 = -1.774f,
                    dy1 = -0.936f,
                    dx2 = -3.142f,
                    dy2 = -2.082f,
                    dx3 = -4.0f,
                    dy3 = -3.357f,
                )
                close()
                // M 34 24.017
                moveTo(x = 34.0f, y = 24.017f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // c -0.501 0.744 -1.168 1.444 -2 2.083
                curveToRelative(
                    dx1 = -0.501f,
                    dy1 = 0.744f,
                    dx2 = -1.168f,
                    dy2 = 1.444f,
                    dx3 = -2.0f,
                    dy3 = 2.083f,
                )
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // c 0.832 -0.638 1.499 -1.339 2 -2.083z
                curveToRelative(
                    dx1 = 0.832f,
                    dy1 = -0.638f,
                    dx2 = 1.499f,
                    dy2 = -1.339f,
                    dx3 = 2.0f,
                    dy3 = -2.083f,
                )
                close()
            }
            // M1 15 a17 9 0 1 0 34 0 a17 9 0 1 0 -34 0z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 1 15
                moveTo(x = 1.0f, y = 15.0f)
                // a 17 9 0 1 0 34 0
                arcToRelative(
                    a = 17.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 34.0f,
                    dy1 = 0.0f,
                )
                // a 17 9 0 1 0 -34 0z
                arcToRelative(
                    a = 17.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -34.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M2.889 14.5 a15.111 7.5 0 1 0 30.222 0 a15.111 7.5 0 1 0 -30.222 0z
            path(
                fill = SolidColor(Color(0xFFEA596E)),
            ) {
                // M 2.889 14.5
                moveTo(x = 2.889f, y = 14.5f)
                // a 15.111 7.5 0 1 0 30.222 0
                arcToRelative(
                    a = 15.111f,
                    b = 7.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 30.222f,
                    dy1 = 0.0f,
                )
                // a 15.111 7.5 0 1 0 -30.222 0z
                arcToRelative(
                    a = 15.111f,
                    b = 7.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -30.222f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M18 9 c7.661 0 13.974 2.832 14.961 6.5 0.088 -0.328 0.15 -0.66 0.15 -1 C33.111 10.358 26.346 7 18 7 S2.889 10.358 2.889 14.5 c0 0.34 0.061 0.672 0.15 1 C4.026 11.832 10.339 9 18 9z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 18 9
                moveTo(x = 18.0f, y = 9.0f)
                // c 7.661 0 13.974 2.832 14.961 6.5
                curveToRelative(
                    dx1 = 7.661f,
                    dy1 = 0.0f,
                    dx2 = 13.974f,
                    dy2 = 2.832f,
                    dx3 = 14.961f,
                    dy3 = 6.5f,
                )
                // c 0.088 -0.328 0.15 -0.66 0.15 -1
                curveToRelative(
                    dx1 = 0.088f,
                    dy1 = -0.328f,
                    dx2 = 0.15f,
                    dy2 = -0.66f,
                    dx3 = 0.15f,
                    dy3 = -1.0f,
                )
                // C 33.111 10.358 26.346 7 18 7
                curveTo(
                    x1 = 33.111f,
                    y1 = 10.358f,
                    x2 = 26.346f,
                    y2 = 7.0f,
                    x3 = 18.0f,
                    y3 = 7.0f,
                )
                // S 2.889 10.358 2.889 14.5
                reflectiveCurveTo(
                    x1 = 2.889f,
                    y1 = 10.358f,
                    x2 = 2.889f,
                    y2 = 14.5f,
                )
                // c 0 0.34 0.061 0.672 0.15 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.34f,
                    dx2 = 0.061f,
                    dy2 = 0.672f,
                    dx3 = 0.15f,
                    dy3 = 1.0f,
                )
                // C 4.026 11.832 10.339 9 18 9z
                curveTo(
                    x1 = 4.026f,
                    y1 = 11.832f,
                    x2 = 10.339f,
                    y2 = 9.0f,
                    x3 = 18.0f,
                    y3 = 9.0f,
                )
                close()
            }
            // M10 13 a1.5 1 0 1 0 3 0 a1.5 1 0 1 0 -3 0z
            path(
                fill = SolidColor(Color(0xFFF5F8FA)),
            ) {
                // M 10 13
                moveTo(x = 10.0f, y = 13.0f)
                // a 1.5 1 0 1 0 3 0
                arcToRelative(
                    a = 1.5f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 3.0f,
                    dy1 = 0.0f,
                )
                // a 1.5 1 0 1 0 -3 0z
                arcToRelative(
                    a = 1.5f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M7 15 a1.5 1 0 1 0 3 0 a1.5 1 0 1 0 -3 0z
            path(
                fill = SolidColor(Color(0xFFF5F8FA)),
            ) {
                // M 7 15
                moveTo(x = 7.0f, y = 15.0f)
                // a 1.5 1 0 1 0 3 0
                arcToRelative(
                    a = 1.5f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 3.0f,
                    dy1 = 0.0f,
                )
                // a 1.5 1 0 1 0 -3 0z
                arcToRelative(
                    a = 1.5f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M14 14 a1.5 1 0 1 0 3 0 a1.5 1 0 1 0 -3 0z
            path(
                fill = SolidColor(Color(0xFFF5F8FA)),
            ) {
                // M 14 14
                moveTo(x = 14.0f, y = 14.0f)
                // a 1.5 1 0 1 0 3 0
                arcToRelative(
                    a = 1.5f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 3.0f,
                    dy1 = 0.0f,
                )
                // a 1.5 1 0 1 0 -3 0z
                arcToRelative(
                    a = 1.5f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M10 17 a1.5 1 0 1 0 3 0 a1.5 1 0 1 0 -3 0z
            path(
                fill = SolidColor(Color(0xFFF5F8FA)),
            ) {
                // M 10 17
                moveTo(x = 10.0f, y = 17.0f)
                // a 1.5 1 0 1 0 3 0
                arcToRelative(
                    a = 1.5f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 3.0f,
                    dy1 = 0.0f,
                )
                // a 1.5 1 0 1 0 -3 0z
                arcToRelative(
                    a = 1.5f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M20 18 a1.5 1 0 1 0 3 0 a1.5 1 0 1 0 -3 0z
            path(
                fill = SolidColor(Color(0xFFF5F8FA)),
            ) {
                // M 20 18
                moveTo(x = 20.0f, y = 18.0f)
                // a 1.5 1 0 1 0 3 0
                arcToRelative(
                    a = 1.5f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 3.0f,
                    dy1 = 0.0f,
                )
                // a 1.5 1 0 1 0 -3 0z
                arcToRelative(
                    a = 1.5f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _emoji1f9eb = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f9eb: ImageVector? = null
