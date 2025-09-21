package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f192: ImageVector
    get() {
        val current = _emoji1f192
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f192",
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
            // M5.97 12.858 c1.022 0 3.012 0.336 3.012 1.569 0 0.504 -0.35 0.939 -0.869 0.939 -0.574 0 -0.966 -0.49 -2.143 -0.49 -1.737 0 -2.633 1.471 -2.633 3.18 0 1.667 0.911 3.096 2.633 3.096 1.177 0 1.653 -0.589 2.227 -0.589 0.63 0 0.925 0.631 0.925 0.953 0 1.345 -2.115 1.652 -3.152 1.652 -2.843 0 -4.818 -2.255 -4.818 -5.154 -0.001 -2.914 1.96 -5.156 4.818 -5.156z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 5.97 12.858
                moveTo(x = 5.97f, y = 12.858f)
                // c 1.022 0 3.012 0.336 3.012 1.569
                curveToRelative(
                    dx1 = 1.022f,
                    dy1 = 0.0f,
                    dx2 = 3.012f,
                    dy2 = 0.336f,
                    dx3 = 3.012f,
                    dy3 = 1.569f,
                )
                // c 0 0.504 -0.35 0.939 -0.869 0.939
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.504f,
                    dx2 = -0.35f,
                    dy2 = 0.939f,
                    dx3 = -0.869f,
                    dy3 = 0.939f,
                )
                // c -0.574 0 -0.966 -0.49 -2.143 -0.49
                curveToRelative(
                    dx1 = -0.574f,
                    dy1 = 0.0f,
                    dx2 = -0.966f,
                    dy2 = -0.49f,
                    dx3 = -2.143f,
                    dy3 = -0.49f,
                )
                // c -1.737 0 -2.633 1.471 -2.633 3.18
                curveToRelative(
                    dx1 = -1.737f,
                    dy1 = 0.0f,
                    dx2 = -2.633f,
                    dy2 = 1.471f,
                    dx3 = -2.633f,
                    dy3 = 3.18f,
                )
                // c 0 1.667 0.911 3.096 2.633 3.096
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.667f,
                    dx2 = 0.911f,
                    dy2 = 3.096f,
                    dx3 = 2.633f,
                    dy3 = 3.096f,
                )
                // c 1.177 0 1.653 -0.589 2.227 -0.589
                curveToRelative(
                    dx1 = 1.177f,
                    dy1 = 0.0f,
                    dx2 = 1.653f,
                    dy2 = -0.589f,
                    dx3 = 2.227f,
                    dy3 = -0.589f,
                )
                // c 0.63 0 0.925 0.631 0.925 0.953
                curveToRelative(
                    dx1 = 0.63f,
                    dy1 = 0.0f,
                    dx2 = 0.925f,
                    dy2 = 0.631f,
                    dx3 = 0.925f,
                    dy3 = 0.953f,
                )
                // c 0 1.345 -2.115 1.652 -3.152 1.652
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.345f,
                    dx2 = -2.115f,
                    dy2 = 1.652f,
                    dx3 = -3.152f,
                    dy3 = 1.652f,
                )
                // c -2.843 0 -4.818 -2.255 -4.818 -5.154
                curveToRelative(
                    dx1 = -2.843f,
                    dy1 = 0.0f,
                    dx2 = -4.818f,
                    dy2 = -2.255f,
                    dx3 = -4.818f,
                    dy3 = -5.154f,
                )
                // c -0.001 -2.914 1.96 -5.156 4.818 -5.156z
                curveToRelative(
                    dx1 = -0.001f,
                    dy1 = -2.914f,
                    dx2 = 1.96f,
                    dy2 = -5.156f,
                    dx3 = 4.818f,
                    dy3 = -5.156f,
                )
                close()
            }
            // M8.865 18.014 c0 -2.914 1.961 -5.155 4.818 -5.155 2.815 0 4.819 2.311 4.819 5.155 0 2.899 -1.947 5.154 -4.819 5.154 -2.843 0 -4.818 -2.255 -4.818 -5.154z M16.317 18.014 c0 -1.695 -0.882 -3.222 -2.633 -3.222 s-2.633 1.526 -2.633 3.222 c0 1.709 0.855 3.222 2.633 3.222 s2.633 -1.513 2.633 -3.222z M18.973 18.014 c0 -2.914 1.96 -5.155 4.818 -5.155 2.816 0 4.818 2.311 4.818 5.155 0 2.899 -1.945 5.154 -4.818 5.154 -2.843 0 -4.818 -2.255 -4.818 -5.154z M26.426 18.014 c0 -1.695 -0.883 -3.222 -2.635 -3.222 -1.75 0 -2.633 1.526 -2.633 3.222 0 1.709 0.854 3.222 2.633 3.222 1.779 -0.001 2.635 -1.513 2.635 -3.222z M29.193 14.035 c0 -0.7 0.447 -1.093 1.051 -1.093 0.602 0 1.051 0.393 1.051 1.093 v7.032 h2.492 c0.715 0 1.023 0.532 1.01 1.008 -0.029 0.463 -0.393 0.925 -1.01 0.925 h-3.502 c-0.686 0 -1.092 -0.448 -1.092 -1.148 v-7.817z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 8.865 18.014
                moveTo(x = 8.865f, y = 18.014f)
                // c 0 -2.914 1.961 -5.155 4.818 -5.155
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.914f,
                    dx2 = 1.961f,
                    dy2 = -5.155f,
                    dx3 = 4.818f,
                    dy3 = -5.155f,
                )
                // c 2.815 0 4.819 2.311 4.819 5.155
                curveToRelative(
                    dx1 = 2.815f,
                    dy1 = 0.0f,
                    dx2 = 4.819f,
                    dy2 = 2.311f,
                    dx3 = 4.819f,
                    dy3 = 5.155f,
                )
                // c 0 2.899 -1.947 5.154 -4.819 5.154
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.899f,
                    dx2 = -1.947f,
                    dy2 = 5.154f,
                    dx3 = -4.819f,
                    dy3 = 5.154f,
                )
                // c -2.843 0 -4.818 -2.255 -4.818 -5.154z
                curveToRelative(
                    dx1 = -2.843f,
                    dy1 = 0.0f,
                    dx2 = -4.818f,
                    dy2 = -2.255f,
                    dx3 = -4.818f,
                    dy3 = -5.154f,
                )
                close()
                // M 16.317 18.014
                moveTo(x = 16.317f, y = 18.014f)
                // c 0 -1.695 -0.882 -3.222 -2.633 -3.222
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.695f,
                    dx2 = -0.882f,
                    dy2 = -3.222f,
                    dx3 = -2.633f,
                    dy3 = -3.222f,
                )
                // s -2.633 1.526 -2.633 3.222
                reflectiveCurveToRelative(
                    dx1 = -2.633f,
                    dy1 = 1.526f,
                    dx2 = -2.633f,
                    dy2 = 3.222f,
                )
                // c 0 1.709 0.855 3.222 2.633 3.222
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.709f,
                    dx2 = 0.855f,
                    dy2 = 3.222f,
                    dx3 = 2.633f,
                    dy3 = 3.222f,
                )
                // s 2.633 -1.513 2.633 -3.222z
                reflectiveCurveToRelative(
                    dx1 = 2.633f,
                    dy1 = -1.513f,
                    dx2 = 2.633f,
                    dy2 = -3.222f,
                )
                close()
                // M 18.973 18.014
                moveTo(x = 18.973f, y = 18.014f)
                // c 0 -2.914 1.96 -5.155 4.818 -5.155
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.914f,
                    dx2 = 1.96f,
                    dy2 = -5.155f,
                    dx3 = 4.818f,
                    dy3 = -5.155f,
                )
                // c 2.816 0 4.818 2.311 4.818 5.155
                curveToRelative(
                    dx1 = 2.816f,
                    dy1 = 0.0f,
                    dx2 = 4.818f,
                    dy2 = 2.311f,
                    dx3 = 4.818f,
                    dy3 = 5.155f,
                )
                // c 0 2.899 -1.945 5.154 -4.818 5.154
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.899f,
                    dx2 = -1.945f,
                    dy2 = 5.154f,
                    dx3 = -4.818f,
                    dy3 = 5.154f,
                )
                // c -2.843 0 -4.818 -2.255 -4.818 -5.154z
                curveToRelative(
                    dx1 = -2.843f,
                    dy1 = 0.0f,
                    dx2 = -4.818f,
                    dy2 = -2.255f,
                    dx3 = -4.818f,
                    dy3 = -5.154f,
                )
                close()
                // M 26.426 18.014
                moveTo(x = 26.426f, y = 18.014f)
                // c 0 -1.695 -0.883 -3.222 -2.635 -3.222
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.695f,
                    dx2 = -0.883f,
                    dy2 = -3.222f,
                    dx3 = -2.635f,
                    dy3 = -3.222f,
                )
                // c -1.75 0 -2.633 1.526 -2.633 3.222
                curveToRelative(
                    dx1 = -1.75f,
                    dy1 = 0.0f,
                    dx2 = -2.633f,
                    dy2 = 1.526f,
                    dx3 = -2.633f,
                    dy3 = 3.222f,
                )
                // c 0 1.709 0.854 3.222 2.633 3.222
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.709f,
                    dx2 = 0.854f,
                    dy2 = 3.222f,
                    dx3 = 2.633f,
                    dy3 = 3.222f,
                )
                // c 1.779 -0.001 2.635 -1.513 2.635 -3.222z
                curveToRelative(
                    dx1 = 1.779f,
                    dy1 = -0.001f,
                    dx2 = 2.635f,
                    dy2 = -1.513f,
                    dx3 = 2.635f,
                    dy3 = -3.222f,
                )
                close()
                // M 29.193 14.035
                moveTo(x = 29.193f, y = 14.035f)
                // c 0 -0.7 0.447 -1.093 1.051 -1.093
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.7f,
                    dx2 = 0.447f,
                    dy2 = -1.093f,
                    dx3 = 1.051f,
                    dy3 = -1.093f,
                )
                // c 0.602 0 1.051 0.393 1.051 1.093
                curveToRelative(
                    dx1 = 0.602f,
                    dy1 = 0.0f,
                    dx2 = 1.051f,
                    dy2 = 0.393f,
                    dx3 = 1.051f,
                    dy3 = 1.093f,
                )
                // v 7.032
                verticalLineToRelative(dy = 7.032f)
                // h 2.492
                horizontalLineToRelative(dx = 2.492f)
                // c 0.715 0 1.023 0.532 1.01 1.008
                curveToRelative(
                    dx1 = 0.715f,
                    dy1 = 0.0f,
                    dx2 = 1.023f,
                    dy2 = 0.532f,
                    dx3 = 1.01f,
                    dy3 = 1.008f,
                )
                // c -0.029 0.463 -0.393 0.925 -1.01 0.925
                curveToRelative(
                    dx1 = -0.029f,
                    dy1 = 0.463f,
                    dx2 = -0.393f,
                    dy2 = 0.925f,
                    dx3 = -1.01f,
                    dy3 = 0.925f,
                )
                // h -3.502
                horizontalLineToRelative(dx = -3.502f)
                // c -0.686 0 -1.092 -0.448 -1.092 -1.148
                curveToRelative(
                    dx1 = -0.686f,
                    dy1 = 0.0f,
                    dx2 = -1.092f,
                    dy2 = -0.448f,
                    dx3 = -1.092f,
                    dy3 = -1.148f,
                )
                // v -7.817z
                verticalLineToRelative(dy = -7.817f)
                close()
            }
        }.build().also { _emoji1f192 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f192: ImageVector? = null
