package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f326: ImageVector
    get() {
        val current = _emoji1f326
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f326",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M13 2 s0 -2 2 -2 2 2 2 2 v2 s0 2 -2 2 -2 -2 -2 -2 L13 2z M4 13 s2 0 2 2 -2 2 -2 2 L2 17 s-2 0 -2 -2 2 -2 2 -2 h2z M7.872 6.043 s1.414 1.414 0 2.828 -2.828 0 -2.828 0 L3.629 7.458 s-1.414 -1.414 0 -2.829 c1.415 -1.414 2.829 0 2.829 0 l1.414 1.414z M24.957 8.871 s-1.414 1.414 -2.828 0 0 -2.828 0 -2.828 l1.414 -1.414 s1.414 -1.414 2.828 0 0 2.828 0 2.828 l-1.414 1.414z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 13 2
                moveTo(x = 13.0f, y = 2.0f)
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
                // L 13 2z
                lineTo(x = 13.0f, y = 2.0f)
                close()
                // M 4 13
                moveTo(x = 4.0f, y = 13.0f)
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
                // L 2 17
                lineTo(x = 2.0f, y = 17.0f)
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
                // M 7.872 6.043
                moveTo(x = 7.872f, y = 6.043f)
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
                // L 3.629 7.458
                lineTo(x = 3.629f, y = 7.458f)
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
                // l 1.414 1.414z
                lineToRelative(dx = 1.414f, dy = 1.414f)
                close()
                // M 24.957 8.871
                moveTo(x = 24.957f, y = 8.871f)
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
            // M15 15 m-8 0 a8 8 0 1 1 16 0 a8 8 0 1 1 -16 0
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 15 15
                moveTo(x = 15.0f, y = 15.0f)
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
            // M28.223 12.8 c-0.803 0 -1.575 0.119 -2.304 0.34 C25.057 10.731 22.718 9 19.958 9 c-2.959 0 -5.437 1.991 -6.123 4.675 -0.733 -0.542 -1.636 -0.875 -2.626 -0.875 -2.417 0 -4.375 1.914 -4.375 4.275 0 0.573 0.12 1.119 0.329 1.619 -0.417 -0.113 -0.848 -0.194 -1.302 -0.194 C3.176 18.5 1 20.626 1 23.25 S3.176 28 5.861 28 h22.361 C32.518 28 36 24.598 36 20.4 s-3.482 -7.6 -7.777 -7.6z
            path(
                fill = SolidColor(Color(0xFFE1E8ED)),
            ) {
                // M 28.223 12.8
                moveTo(x = 28.223f, y = 12.8f)
                // c -0.803 0 -1.575 0.119 -2.304 0.34
                curveToRelative(
                    dx1 = -0.803f,
                    dy1 = 0.0f,
                    dx2 = -1.575f,
                    dy2 = 0.119f,
                    dx3 = -2.304f,
                    dy3 = 0.34f,
                )
                // C 25.057 10.731 22.718 9 19.958 9
                curveTo(
                    x1 = 25.057f,
                    y1 = 10.731f,
                    x2 = 22.718f,
                    y2 = 9.0f,
                    x3 = 19.958f,
                    y3 = 9.0f,
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
                // c 0 0.573 0.12 1.119 0.329 1.619
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.573f,
                    dx2 = 0.12f,
                    dy2 = 1.119f,
                    dx3 = 0.329f,
                    dy3 = 1.619f,
                )
                // c -0.417 -0.113 -0.848 -0.194 -1.302 -0.194
                curveToRelative(
                    dx1 = -0.417f,
                    dy1 = -0.113f,
                    dx2 = -0.848f,
                    dy2 = -0.194f,
                    dx3 = -1.302f,
                    dy3 = -0.194f,
                )
                // C 3.176 18.5 1 20.626 1 23.25
                curveTo(
                    x1 = 3.176f,
                    y1 = 18.5f,
                    x2 = 1.0f,
                    y2 = 20.626f,
                    x3 = 1.0f,
                    y3 = 23.25f,
                )
                // S 3.176 28 5.861 28
                reflectiveCurveTo(
                    x1 = 3.176f,
                    y1 = 28.0f,
                    x2 = 5.861f,
                    y2 = 28.0f,
                )
                // h 22.361
                horizontalLineToRelative(dx = 22.361f)
                // C 32.518 28 36 24.598 36 20.4
                curveTo(
                    x1 = 32.518f,
                    y1 = 28.0f,
                    x2 = 36.0f,
                    y2 = 24.598f,
                    x3 = 36.0f,
                    y3 = 20.4f,
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
            // M11.999 33.961 l-0.113 -3.421 -2.869 1.708 c-0.639 0.345 -1.062 1.024 -1.036 1.799 0.037 1.102 0.966 1.976 2.076 1.953 1.109 -0.023 1.979 -0.937 1.942 -2.039z M5.02 32.421 L4.906 29 l-2.869 1.708 c-0.639 0.345 -1.063 1.024 -1.036 1.799 0.037 1.103 0.966 1.976 2.076 1.953 1.11 -0.023 1.98 -0.937 1.943 -2.039z M19.02 32.961 l-0.113 -3.421 -2.869 1.708 c-0.639 0.345 -1.062 1.024 -1.036 1.799 0.037 1.102 0.966 1.976 2.076 1.953 1.109 -0.023 1.979 -0.937 1.942 -2.039z M24.998 33.961 l-0.113 -3.421 -2.869 1.708 c-0.639 0.345 -1.062 1.024 -1.035 1.799 0.037 1.102 0.965 1.976 2.076 1.953 1.109 -0.023 1.978 -0.937 1.941 -2.039z M31.019 32.421 L30.905 29 l-2.869 1.708 c-0.639 0.345 -1.062 1.024 -1.035 1.799 0.037 1.103 0.965 1.976 2.076 1.953 1.11 -0.023 1.979 -0.937 1.942 -2.039z
            path(
                fill = SolidColor(Color(0xFF5DADEC)),
            ) {
                // M 11.999 33.961
                moveTo(x = 11.999f, y = 33.961f)
                // l -0.113 -3.421
                lineToRelative(dx = -0.113f, dy = -3.421f)
                // l -2.869 1.708
                lineToRelative(dx = -2.869f, dy = 1.708f)
                // c -0.639 0.345 -1.062 1.024 -1.036 1.799
                curveToRelative(
                    dx1 = -0.639f,
                    dy1 = 0.345f,
                    dx2 = -1.062f,
                    dy2 = 1.024f,
                    dx3 = -1.036f,
                    dy3 = 1.799f,
                )
                // c 0.037 1.102 0.966 1.976 2.076 1.953
                curveToRelative(
                    dx1 = 0.037f,
                    dy1 = 1.102f,
                    dx2 = 0.966f,
                    dy2 = 1.976f,
                    dx3 = 2.076f,
                    dy3 = 1.953f,
                )
                // c 1.109 -0.023 1.979 -0.937 1.942 -2.039z
                curveToRelative(
                    dx1 = 1.109f,
                    dy1 = -0.023f,
                    dx2 = 1.979f,
                    dy2 = -0.937f,
                    dx3 = 1.942f,
                    dy3 = -2.039f,
                )
                close()
                // M 5.02 32.421
                moveTo(x = 5.02f, y = 32.421f)
                // L 4.906 29
                lineTo(x = 4.906f, y = 29.0f)
                // l -2.869 1.708
                lineToRelative(dx = -2.869f, dy = 1.708f)
                // c -0.639 0.345 -1.063 1.024 -1.036 1.799
                curveToRelative(
                    dx1 = -0.639f,
                    dy1 = 0.345f,
                    dx2 = -1.063f,
                    dy2 = 1.024f,
                    dx3 = -1.036f,
                    dy3 = 1.799f,
                )
                // c 0.037 1.103 0.966 1.976 2.076 1.953
                curveToRelative(
                    dx1 = 0.037f,
                    dy1 = 1.103f,
                    dx2 = 0.966f,
                    dy2 = 1.976f,
                    dx3 = 2.076f,
                    dy3 = 1.953f,
                )
                // c 1.11 -0.023 1.98 -0.937 1.943 -2.039z
                curveToRelative(
                    dx1 = 1.11f,
                    dy1 = -0.023f,
                    dx2 = 1.98f,
                    dy2 = -0.937f,
                    dx3 = 1.943f,
                    dy3 = -2.039f,
                )
                close()
                // M 19.02 32.961
                moveTo(x = 19.02f, y = 32.961f)
                // l -0.113 -3.421
                lineToRelative(dx = -0.113f, dy = -3.421f)
                // l -2.869 1.708
                lineToRelative(dx = -2.869f, dy = 1.708f)
                // c -0.639 0.345 -1.062 1.024 -1.036 1.799
                curveToRelative(
                    dx1 = -0.639f,
                    dy1 = 0.345f,
                    dx2 = -1.062f,
                    dy2 = 1.024f,
                    dx3 = -1.036f,
                    dy3 = 1.799f,
                )
                // c 0.037 1.102 0.966 1.976 2.076 1.953
                curveToRelative(
                    dx1 = 0.037f,
                    dy1 = 1.102f,
                    dx2 = 0.966f,
                    dy2 = 1.976f,
                    dx3 = 2.076f,
                    dy3 = 1.953f,
                )
                // c 1.109 -0.023 1.979 -0.937 1.942 -2.039z
                curveToRelative(
                    dx1 = 1.109f,
                    dy1 = -0.023f,
                    dx2 = 1.979f,
                    dy2 = -0.937f,
                    dx3 = 1.942f,
                    dy3 = -2.039f,
                )
                close()
                // M 24.998 33.961
                moveTo(x = 24.998f, y = 33.961f)
                // l -0.113 -3.421
                lineToRelative(dx = -0.113f, dy = -3.421f)
                // l -2.869 1.708
                lineToRelative(dx = -2.869f, dy = 1.708f)
                // c -0.639 0.345 -1.062 1.024 -1.035 1.799
                curveToRelative(
                    dx1 = -0.639f,
                    dy1 = 0.345f,
                    dx2 = -1.062f,
                    dy2 = 1.024f,
                    dx3 = -1.035f,
                    dy3 = 1.799f,
                )
                // c 0.037 1.102 0.965 1.976 2.076 1.953
                curveToRelative(
                    dx1 = 0.037f,
                    dy1 = 1.102f,
                    dx2 = 0.965f,
                    dy2 = 1.976f,
                    dx3 = 2.076f,
                    dy3 = 1.953f,
                )
                // c 1.109 -0.023 1.978 -0.937 1.941 -2.039z
                curveToRelative(
                    dx1 = 1.109f,
                    dy1 = -0.023f,
                    dx2 = 1.978f,
                    dy2 = -0.937f,
                    dx3 = 1.941f,
                    dy3 = -2.039f,
                )
                close()
                // M 31.019 32.421
                moveTo(x = 31.019f, y = 32.421f)
                // L 30.905 29
                lineTo(x = 30.905f, y = 29.0f)
                // l -2.869 1.708
                lineToRelative(dx = -2.869f, dy = 1.708f)
                // c -0.639 0.345 -1.062 1.024 -1.035 1.799
                curveToRelative(
                    dx1 = -0.639f,
                    dy1 = 0.345f,
                    dx2 = -1.062f,
                    dy2 = 1.024f,
                    dx3 = -1.035f,
                    dy3 = 1.799f,
                )
                // c 0.037 1.103 0.965 1.976 2.076 1.953
                curveToRelative(
                    dx1 = 0.037f,
                    dy1 = 1.103f,
                    dx2 = 0.965f,
                    dy2 = 1.976f,
                    dx3 = 2.076f,
                    dy3 = 1.953f,
                )
                // c 1.11 -0.023 1.979 -0.937 1.942 -2.039z
                curveToRelative(
                    dx1 = 1.11f,
                    dy1 = -0.023f,
                    dx2 = 1.979f,
                    dy2 = -0.937f,
                    dx3 = 1.942f,
                    dy3 = -2.039f,
                )
                close()
            }
        }.build().also { _emoji1f326 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f326: ImageVector? = null
