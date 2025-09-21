package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f435: ImageVector
    get() {
        val current = _emoji1f435
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f435",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M1.3618 18.4431 a5.455 3.818 75.001 1 0 7.3758 -1.9762 a5.455 3.818 75.001 1 0 -7.3758 1.9762z
            path(
                fill = SolidColor(Color(0xFFD79E84)),
            ) {
                // M 1.3618 18.4431
                moveTo(x = 1.3618f, y = 18.4431f)
                // a 5.455 3.818 75.001 1 0 7.3758 -1.9762
                arcToRelative(
                    a = 5.455f,
                    b = 3.818f,
                    theta = 75.001f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 7.3758f,
                    dy1 = -1.9762f,
                )
                // a 5.455 3.818 75.001 1 0 -7.3758 1.9762z
                arcToRelative(
                    a = 5.455f,
                    b = 3.818f,
                    theta = 75.001f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -7.3758f,
                    dy1 = 1.9762f,
                )
                close()
            }
            // M29.6382 22.7241 a5.455 3.818 104.999 1 0 2.8235 -10.5383 a5.455 3.818 104.999 1 0 -2.8235 10.5383z
            path(
                fill = SolidColor(Color(0xFFD79E84)),
            ) {
                // M 29.6382 22.7241
                moveTo(x = 29.6382f, y = 22.7241f)
                // a 5.455 3.818 104.999 1 0 2.8235 -10.5383
                arcToRelative(
                    a = 5.455f,
                    b = 3.818f,
                    theta = 104.999f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 2.8235f,
                    dy1 = -10.5383f,
                )
                // a 5.455 3.818 104.999 1 0 -2.8235 10.5383z
                arcToRelative(
                    a = 5.455f,
                    b = 3.818f,
                    theta = 104.999f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -2.8235f,
                    dy1 = 10.5383f,
                )
                close()
            }
            // M19.018 36 h-2.036 C10.264 36 3.75 30.848 3.75 23.636 c0 -4.121 1.527 -6.182 1.527 -6.182 s-0.509 -2.061 -0.509 -4.121 C4.768 7.152 11.282 2 18 2 c6.718 0 13.232 6.182 13.232 11.333 0 2.061 -0.509 4.121 -0.509 4.121 s1.527 2.061 1.527 6.182 C32.25 30.848 25.736 36 19.018 36z
            path(
                fill = SolidColor(Color(0xFFBF6952)),
            ) {
                // M 19.018 36
                moveTo(x = 19.018f, y = 36.0f)
                // h -2.036
                horizontalLineToRelative(dx = -2.036f)
                // C 10.264 36 3.75 30.848 3.75 23.636
                curveTo(
                    x1 = 10.264f,
                    y1 = 36.0f,
                    x2 = 3.75f,
                    y2 = 30.848f,
                    x3 = 3.75f,
                    y3 = 23.636f,
                )
                // c 0 -4.121 1.527 -6.182 1.527 -6.182
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.121f,
                    dx2 = 1.527f,
                    dy2 = -6.182f,
                    dx3 = 1.527f,
                    dy3 = -6.182f,
                )
                // s -0.509 -2.061 -0.509 -4.121
                reflectiveCurveToRelative(
                    dx1 = -0.509f,
                    dy1 = -2.061f,
                    dx2 = -0.509f,
                    dy2 = -4.121f,
                )
                // C 4.768 7.152 11.282 2 18 2
                curveTo(
                    x1 = 4.768f,
                    y1 = 7.152f,
                    x2 = 11.282f,
                    y2 = 2.0f,
                    x3 = 18.0f,
                    y3 = 2.0f,
                )
                // c 6.718 0 13.232 6.182 13.232 11.333
                curveToRelative(
                    dx1 = 6.718f,
                    dy1 = 0.0f,
                    dx2 = 13.232f,
                    dy2 = 6.182f,
                    dx3 = 13.232f,
                    dy3 = 11.333f,
                )
                // c 0 2.061 -0.509 4.121 -0.509 4.121
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.061f,
                    dx2 = -0.509f,
                    dy2 = 4.121f,
                    dx3 = -0.509f,
                    dy3 = 4.121f,
                )
                // s 1.527 2.061 1.527 6.182
                reflectiveCurveToRelative(
                    dx1 = 1.527f,
                    dy1 = 2.061f,
                    dx2 = 1.527f,
                    dy2 = 6.182f,
                )
                // C 32.25 30.848 25.736 36 19.018 36z
                curveTo(
                    x1 = 32.25f,
                    y1 = 30.848f,
                    x2 = 25.736f,
                    y2 = 36.0f,
                    x3 = 19.018f,
                    y3 = 36.0f,
                )
                close()
            }
            // M30 16.042 C30 12.153 26.825 9 22.909 9 c-1.907 0 -3.635 0.752 -4.909 1.968 C16.726 9.752 14.998 9 13.091 9 9.175 9 6 12.153 6 16.042 c0 2.359 1.172 4.441 2.965 5.719 -0.503 1.238 -0.783 2.6 -0.783 4.031 C8.182 31.476 12.578 35 18 35 s9.818 -3.524 9.818 -9.208 c0 -1.431 -0.28 -2.793 -0.783 -4.031 C28.828 20.483 30 18.4 30 16.042z
            path(
                fill = SolidColor(Color(0xFFD79E84)),
            ) {
                // M 30 16.042
                moveTo(x = 30.0f, y = 16.042f)
                // C 30 12.153 26.825 9 22.909 9
                curveTo(
                    x1 = 30.0f,
                    y1 = 12.153f,
                    x2 = 26.825f,
                    y2 = 9.0f,
                    x3 = 22.909f,
                    y3 = 9.0f,
                )
                // c -1.907 0 -3.635 0.752 -4.909 1.968
                curveToRelative(
                    dx1 = -1.907f,
                    dy1 = 0.0f,
                    dx2 = -3.635f,
                    dy2 = 0.752f,
                    dx3 = -4.909f,
                    dy3 = 1.968f,
                )
                // C 16.726 9.752 14.998 9 13.091 9
                curveTo(
                    x1 = 16.726f,
                    y1 = 9.752f,
                    x2 = 14.998f,
                    y2 = 9.0f,
                    x3 = 13.091f,
                    y3 = 9.0f,
                )
                // C 9.175 9 6 12.153 6 16.042
                curveTo(
                    x1 = 9.175f,
                    y1 = 9.0f,
                    x2 = 6.0f,
                    y2 = 12.153f,
                    x3 = 6.0f,
                    y3 = 16.042f,
                )
                // c 0 2.359 1.172 4.441 2.965 5.719
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.359f,
                    dx2 = 1.172f,
                    dy2 = 4.441f,
                    dx3 = 2.965f,
                    dy3 = 5.719f,
                )
                // c -0.503 1.238 -0.783 2.6 -0.783 4.031
                curveToRelative(
                    dx1 = -0.503f,
                    dy1 = 1.238f,
                    dx2 = -0.783f,
                    dy2 = 2.6f,
                    dx3 = -0.783f,
                    dy3 = 4.031f,
                )
                // C 8.182 31.476 12.578 35 18 35
                curveTo(
                    x1 = 8.182f,
                    y1 = 31.476f,
                    x2 = 12.578f,
                    y2 = 35.0f,
                    x3 = 18.0f,
                    y3 = 35.0f,
                )
                // s 9.818 -3.524 9.818 -9.208
                reflectiveCurveToRelative(
                    dx1 = 9.818f,
                    dy1 = -3.524f,
                    dx2 = 9.818f,
                    dy2 = -9.208f,
                )
                // c 0 -1.431 -0.28 -2.793 -0.783 -4.031
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.431f,
                    dx2 = -0.28f,
                    dy2 = -2.793f,
                    dx3 = -0.783f,
                    dy3 = -4.031f,
                )
                // C 28.828 20.483 30 18.4 30 16.042z
                curveTo(
                    x1 = 28.828f,
                    y1 = 20.483f,
                    x2 = 30.0f,
                    y2 = 18.4f,
                    x3 = 30.0f,
                    y3 = 16.042f,
                )
                close()
            }
            // M10.75 17 a2.25 3.25 0 1 0 4.5 0 a2.25 3.25 0 1 0 -4.5 0z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 10.75 17
                moveTo(x = 10.75f, y = 17.0f)
                // a 2.25 3.25 0 1 0 4.5 0
                arcToRelative(
                    a = 2.25f,
                    b = 3.25f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 4.5f,
                    dy1 = 0.0f,
                )
                // a 2.25 3.25 0 1 0 -4.5 0z
                arcToRelative(
                    a = 2.25f,
                    b = 3.25f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -4.5f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M20.75 17 a2.25 3.25 0 1 0 4.5 0 a2.25 3.25 0 1 0 -4.5 0z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 20.75 17
                moveTo(x = 20.75f, y = 17.0f)
                // a 2.25 3.25 0 1 0 4.5 0
                arcToRelative(
                    a = 2.25f,
                    b = 3.25f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 4.5f,
                    dy1 = 0.0f,
                )
                // a 2.25 3.25 0 1 0 -4.5 0z
                arcToRelative(
                    a = 2.25f,
                    b = 3.25f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -4.5f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M18 32.727 c2.838 0 5.254 -1.505 6.162 -3.61 0.375 -0.871 -0.262 -1.844 -1.21 -1.844 h-9.904 c-0.948 0 -1.585 0.974 -1.21 1.844 0.908 2.105 3.324 3.61 6.162 3.61z
            path(
                fill = SolidColor(Color(0xFF642116)),
            ) {
                // M 18 32.727
                moveTo(x = 18.0f, y = 32.727f)
                // c 2.838 0 5.254 -1.505 6.162 -3.61
                curveToRelative(
                    dx1 = 2.838f,
                    dy1 = 0.0f,
                    dx2 = 5.254f,
                    dy2 = -1.505f,
                    dx3 = 6.162f,
                    dy3 = -3.61f,
                )
                // c 0.375 -0.871 -0.262 -1.844 -1.21 -1.844
                curveToRelative(
                    dx1 = 0.375f,
                    dy1 = -0.871f,
                    dx2 = -0.262f,
                    dy2 = -1.844f,
                    dx3 = -1.21f,
                    dy3 = -1.844f,
                )
                // h -9.904
                horizontalLineToRelative(dx = -9.904f)
                // c -0.948 0 -1.585 0.974 -1.21 1.844
                curveToRelative(
                    dx1 = -0.948f,
                    dy1 = 0.0f,
                    dx2 = -1.585f,
                    dy2 = 0.974f,
                    dx3 = -1.21f,
                    dy3 = 1.844f,
                )
                // c 0.908 2.105 3.324 3.61 6.162 3.61z
                curveToRelative(
                    dx1 = 0.908f,
                    dy1 = 2.105f,
                    dx2 = 3.324f,
                    dy2 = 3.61f,
                    dx3 = 6.162f,
                    dy3 = 3.61f,
                )
                close()
            }
            // M16.25 23 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFF642116)),
            ) {
                // M 16.25 23
                moveTo(x = 16.25f, y = 23.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // a 1 1 0 1 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 1 1 -2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
            }
            // M19.75 23 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFF642116)),
            ) {
                // M 19.75 23
                moveTo(x = 19.75f, y = 23.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // a 1 1 0 1 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 1 1 -2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
            }
            // M22.66 0.175 s-5.455 -1.091 -7.636 2.182 4.364 1.091 4.364 1.091 S20.478 0.175 22.66 0.175z
            path(
                fill = SolidColor(Color(0xFFBF6952)),
            ) {
                // M 22.66 0.175
                moveTo(x = 22.66f, y = 0.175f)
                // s -5.455 -1.091 -7.636 2.182
                reflectiveCurveToRelative(
                    dx1 = -5.455f,
                    dy1 = -1.091f,
                    dx2 = -7.636f,
                    dy2 = 2.182f,
                )
                // s 4.364 1.091 4.364 1.091
                reflectiveCurveToRelative(
                    dx1 = 4.364f,
                    dy1 = 1.091f,
                    dx2 = 4.364f,
                    dy2 = 1.091f,
                )
                // S 20.478 0.175 22.66 0.175z
                reflectiveCurveTo(
                    x1 = 20.478f,
                    y1 = 0.175f,
                    x2 = 22.66f,
                    y2 = 0.175f,
                )
                close()
            }
        }.build().also { _emoji1f435 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f435: ImageVector? = null
