package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f37e: ImageVector
    get() {
        val current = _emoji1f37e
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f37e",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M7.189 27.5 m-1.5 0 a1.5 1.5 0 1 1 3 0 a1.5 1.5 0 1 1 -3 0
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 7.189 27.5
                moveTo(x = 7.189f, y = 27.5f)
                // m -1.5 0
                moveToRelative(dx = -1.5f, dy = 0.0f)
                // a 1.5 1.5 0 1 1 3 0
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = 0.0f,
                )
                // a 1.5 1.5 0 1 1 -3 0
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = 0.0f,
                )
            }
            // M9.609 13.234 c0.051 -0.237 0.08 -0.482 0.08 -0.734 0 -1.933 -1.567 -3.5 -3.5 -3.5 -1.764 0 -3.208 1.308 -3.45 3.005 -0.017 0 -0.033 -0.005 -0.05 -0.005 -1.104 0 -2 0.896 -2 2 s0.896 2 2 2 c0.033 0 0.063 -0.008 0.095 -0.01 -0.058 0.16 -0.095 0.33 -0.095 0.51 0 0.46 0.212 0.867 0.539 1.143 -0.332 0.357 -0.539 0.831 -0.539 1.357 0 1.104 0.896 2 2 2 0 0.375 0.11 0.721 0.289 1.021 -0.727 0.103 -1.289 0.723 -1.289 1.479 0 0.828 0.672 1.5 1.5 1.5 s1.5 -0.672 1.5 -1.5 c0 -0.18 -0.037 -0.35 -0.095 -0.51 0.032 0.002 0.062 0.01 0.095 0.01 1.104 0 2 -0.896 2 -2 0 -0.601 -0.27 -1.133 -0.69 -1.5 0.419 -0.367 0.69 -0.899 0.69 -1.5 0 -0.378 -0.111 -0.728 -0.294 -1.03 0.097 0.015 0.193 0.03 0.294 0.03 1.104 0 2 -0.896 2 -2 0 -0.771 -0.441 -1.432 -1.08 -1.766z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 9.609 13.234
                moveTo(x = 9.609f, y = 13.234f)
                // c 0.051 -0.237 0.08 -0.482 0.08 -0.734
                curveToRelative(
                    dx1 = 0.051f,
                    dy1 = -0.237f,
                    dx2 = 0.08f,
                    dy2 = -0.482f,
                    dx3 = 0.08f,
                    dy3 = -0.734f,
                )
                // c 0 -1.933 -1.567 -3.5 -3.5 -3.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.933f,
                    dx2 = -1.567f,
                    dy2 = -3.5f,
                    dx3 = -3.5f,
                    dy3 = -3.5f,
                )
                // c -1.764 0 -3.208 1.308 -3.45 3.005
                curveToRelative(
                    dx1 = -1.764f,
                    dy1 = 0.0f,
                    dx2 = -3.208f,
                    dy2 = 1.308f,
                    dx3 = -3.45f,
                    dy3 = 3.005f,
                )
                // c -0.017 0 -0.033 -0.005 -0.05 -0.005
                curveToRelative(
                    dx1 = -0.017f,
                    dy1 = 0.0f,
                    dx2 = -0.033f,
                    dy2 = -0.005f,
                    dx3 = -0.05f,
                    dy3 = -0.005f,
                )
                // c -1.104 0 -2 0.896 -2 2
                curveToRelative(
                    dx1 = -1.104f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = 0.896f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // s 0.896 2 2 2
                reflectiveCurveToRelative(
                    dx1 = 0.896f,
                    dy1 = 2.0f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                )
                // c 0.033 0 0.063 -0.008 0.095 -0.01
                curveToRelative(
                    dx1 = 0.033f,
                    dy1 = 0.0f,
                    dx2 = 0.063f,
                    dy2 = -0.008f,
                    dx3 = 0.095f,
                    dy3 = -0.01f,
                )
                // c -0.058 0.16 -0.095 0.33 -0.095 0.51
                curveToRelative(
                    dx1 = -0.058f,
                    dy1 = 0.16f,
                    dx2 = -0.095f,
                    dy2 = 0.33f,
                    dx3 = -0.095f,
                    dy3 = 0.51f,
                )
                // c 0 0.46 0.212 0.867 0.539 1.143
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.46f,
                    dx2 = 0.212f,
                    dy2 = 0.867f,
                    dx3 = 0.539f,
                    dy3 = 1.143f,
                )
                // c -0.332 0.357 -0.539 0.831 -0.539 1.357
                curveToRelative(
                    dx1 = -0.332f,
                    dy1 = 0.357f,
                    dx2 = -0.539f,
                    dy2 = 0.831f,
                    dx3 = -0.539f,
                    dy3 = 1.357f,
                )
                // c 0 1.104 0.896 2 2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = 0.896f,
                    dy2 = 2.0f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                // c 0 0.375 0.11 0.721 0.289 1.021
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.375f,
                    dx2 = 0.11f,
                    dy2 = 0.721f,
                    dx3 = 0.289f,
                    dy3 = 1.021f,
                )
                // c -0.727 0.103 -1.289 0.723 -1.289 1.479
                curveToRelative(
                    dx1 = -0.727f,
                    dy1 = 0.103f,
                    dx2 = -1.289f,
                    dy2 = 0.723f,
                    dx3 = -1.289f,
                    dy3 = 1.479f,
                )
                // c 0 0.828 0.672 1.5 1.5 1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.828f,
                    dx2 = 0.672f,
                    dy2 = 1.5f,
                    dx3 = 1.5f,
                    dy3 = 1.5f,
                )
                // s 1.5 -0.672 1.5 -1.5
                reflectiveCurveToRelative(
                    dx1 = 1.5f,
                    dy1 = -0.672f,
                    dx2 = 1.5f,
                    dy2 = -1.5f,
                )
                // c 0 -0.18 -0.037 -0.35 -0.095 -0.51
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.18f,
                    dx2 = -0.037f,
                    dy2 = -0.35f,
                    dx3 = -0.095f,
                    dy3 = -0.51f,
                )
                // c 0.032 0.002 0.062 0.01 0.095 0.01
                curveToRelative(
                    dx1 = 0.032f,
                    dy1 = 0.002f,
                    dx2 = 0.062f,
                    dy2 = 0.01f,
                    dx3 = 0.095f,
                    dy3 = 0.01f,
                )
                // c 1.104 0 2 -0.896 2 -2
                curveToRelative(
                    dx1 = 1.104f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = -0.896f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // c 0 -0.601 -0.27 -1.133 -0.69 -1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.601f,
                    dx2 = -0.27f,
                    dy2 = -1.133f,
                    dx3 = -0.69f,
                    dy3 = -1.5f,
                )
                // c 0.419 -0.367 0.69 -0.899 0.69 -1.5
                curveToRelative(
                    dx1 = 0.419f,
                    dy1 = -0.367f,
                    dx2 = 0.69f,
                    dy2 = -0.899f,
                    dx3 = 0.69f,
                    dy3 = -1.5f,
                )
                // c 0 -0.378 -0.111 -0.728 -0.294 -1.03
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.378f,
                    dx2 = -0.111f,
                    dy2 = -0.728f,
                    dx3 = -0.294f,
                    dy3 = -1.03f,
                )
                // c 0.097 0.015 0.193 0.03 0.294 0.03
                curveToRelative(
                    dx1 = 0.097f,
                    dy1 = 0.015f,
                    dx2 = 0.193f,
                    dy2 = 0.03f,
                    dx3 = 0.294f,
                    dy3 = 0.03f,
                )
                // c 1.104 0 2 -0.896 2 -2
                curveToRelative(
                    dx1 = 1.104f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = -0.896f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // c 0 -0.771 -0.441 -1.432 -1.08 -1.766z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.771f,
                    dx2 = -0.441f,
                    dy2 = -1.432f,
                    dx3 = -1.08f,
                    dy3 = -1.766f,
                )
                close()
            }
            // M5.689 19 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFE4EBEF)),
            ) {
                // M 5.689 19
                moveTo(x = 5.689f, y = 19.0f)
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
            // M8.689 13 c0 -1.105 -0.895 -2 -2 -2 s-2 0.895 -2 2 c0 0.032 0.008 0.063 0.01 0.095 -0.16 -0.058 -0.33 -0.095 -0.51 -0.095 -0.829 0 -1.5 0.671 -1.5 1.5 s0.671 1.5 1.5 1.5 c0.198 0 0.385 -0.04 0.558 -0.11 0.172 0.638 0.749 1.11 1.442 1.11 0.829 0 1.5 -0.671 1.5 -1.5 0 -0.248 -0.066 -0.478 -0.172 -0.684 0.69 -0.315 1.172 -1.007 1.172 -1.816z
            path(
                fill = SolidColor(Color(0xFFE4EBEF)),
            ) {
                // M 8.689 13
                moveTo(x = 8.689f, y = 13.0f)
                // c 0 -1.105 -0.895 -2 -2 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.105f,
                    dx2 = -0.895f,
                    dy2 = -2.0f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // s -2 0.895 -2 2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 0.895f,
                    dx2 = -2.0f,
                    dy2 = 2.0f,
                )
                // c 0 0.032 0.008 0.063 0.01 0.095
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.032f,
                    dx2 = 0.008f,
                    dy2 = 0.063f,
                    dx3 = 0.01f,
                    dy3 = 0.095f,
                )
                // c -0.16 -0.058 -0.33 -0.095 -0.51 -0.095
                curveToRelative(
                    dx1 = -0.16f,
                    dy1 = -0.058f,
                    dx2 = -0.33f,
                    dy2 = -0.095f,
                    dx3 = -0.51f,
                    dy3 = -0.095f,
                )
                // c -0.829 0 -1.5 0.671 -1.5 1.5
                curveToRelative(
                    dx1 = -0.829f,
                    dy1 = 0.0f,
                    dx2 = -1.5f,
                    dy2 = 0.671f,
                    dx3 = -1.5f,
                    dy3 = 1.5f,
                )
                // s 0.671 1.5 1.5 1.5
                reflectiveCurveToRelative(
                    dx1 = 0.671f,
                    dy1 = 1.5f,
                    dx2 = 1.5f,
                    dy2 = 1.5f,
                )
                // c 0.198 0 0.385 -0.04 0.558 -0.11
                curveToRelative(
                    dx1 = 0.198f,
                    dy1 = 0.0f,
                    dx2 = 0.385f,
                    dy2 = -0.04f,
                    dx3 = 0.558f,
                    dy3 = -0.11f,
                )
                // c 0.172 0.638 0.749 1.11 1.442 1.11
                curveToRelative(
                    dx1 = 0.172f,
                    dy1 = 0.638f,
                    dx2 = 0.749f,
                    dy2 = 1.11f,
                    dx3 = 1.442f,
                    dy3 = 1.11f,
                )
                // c 0.829 0 1.5 -0.671 1.5 -1.5
                curveToRelative(
                    dx1 = 0.829f,
                    dy1 = 0.0f,
                    dx2 = 1.5f,
                    dy2 = -0.671f,
                    dx3 = 1.5f,
                    dy3 = -1.5f,
                )
                // c 0 -0.248 -0.066 -0.478 -0.172 -0.684
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.248f,
                    dx2 = -0.066f,
                    dy2 = -0.478f,
                    dx3 = -0.172f,
                    dy3 = -0.684f,
                )
                // c 0.69 -0.315 1.172 -1.007 1.172 -1.816z
                curveToRelative(
                    dx1 = 0.69f,
                    dy1 = -0.315f,
                    dx2 = 1.172f,
                    dy2 = -1.007f,
                    dx3 = 1.172f,
                    dy3 = -1.816f,
                )
                close()
            }
            // M7.301 3.076 s-0.817 -0.798 -0.873 -0.842 c0.233 -0.618 0.164 -1.269 -0.25 -1.692 -0.627 -0.616 -1.758 -0.488 -2.536 0.29 L1.521 2.953 c-0.777 0.777 -0.906 1.909 -0.29 2.536 0.423 0.413 1.073 0.483 1.692 0.25 0.045 0.055 0.842 0.873 0.842 0.873 0.781 0.78 2.047 0.78 2.828 0 l0.707 -0.708 c0.781 -0.781 0.781 -2.047 0.001 -2.828z
            path(
                fill = SolidColor(Color(0xFFC1694F)),
            ) {
                // M 7.301 3.076
                moveTo(x = 7.301f, y = 3.076f)
                // s -0.817 -0.798 -0.873 -0.842
                reflectiveCurveToRelative(
                    dx1 = -0.817f,
                    dy1 = -0.798f,
                    dx2 = -0.873f,
                    dy2 = -0.842f,
                )
                // c 0.233 -0.618 0.164 -1.269 -0.25 -1.692
                curveToRelative(
                    dx1 = 0.233f,
                    dy1 = -0.618f,
                    dx2 = 0.164f,
                    dy2 = -1.269f,
                    dx3 = -0.25f,
                    dy3 = -1.692f,
                )
                // c -0.627 -0.616 -1.758 -0.488 -2.536 0.29
                curveToRelative(
                    dx1 = -0.627f,
                    dy1 = -0.616f,
                    dx2 = -1.758f,
                    dy2 = -0.488f,
                    dx3 = -2.536f,
                    dy3 = 0.29f,
                )
                // L 1.521 2.953
                lineTo(x = 1.521f, y = 2.953f)
                // c -0.777 0.777 -0.906 1.909 -0.29 2.536
                curveToRelative(
                    dx1 = -0.777f,
                    dy1 = 0.777f,
                    dx2 = -0.906f,
                    dy2 = 1.909f,
                    dx3 = -0.29f,
                    dy3 = 2.536f,
                )
                // c 0.423 0.413 1.073 0.483 1.692 0.25
                curveToRelative(
                    dx1 = 0.423f,
                    dy1 = 0.413f,
                    dx2 = 1.073f,
                    dy2 = 0.483f,
                    dx3 = 1.692f,
                    dy3 = 0.25f,
                )
                // c 0.045 0.055 0.842 0.873 0.842 0.873
                curveToRelative(
                    dx1 = 0.045f,
                    dy1 = 0.055f,
                    dx2 = 0.842f,
                    dy2 = 0.873f,
                    dx3 = 0.842f,
                    dy3 = 0.873f,
                )
                // c 0.781 0.78 2.047 0.78 2.828 0
                curveToRelative(
                    dx1 = 0.781f,
                    dy1 = 0.78f,
                    dx2 = 2.047f,
                    dy2 = 0.78f,
                    dx3 = 2.828f,
                    dy3 = 0.0f,
                )
                // l 0.707 -0.708
                lineToRelative(dx = 0.707f, dy = -0.708f)
                // c 0.781 -0.781 0.781 -2.047 0.001 -2.828z
                curveToRelative(
                    dx1 = 0.781f,
                    dy1 = -0.781f,
                    dx2 = 0.781f,
                    dy2 = -2.047f,
                    dx3 = 0.001f,
                    dy3 = -2.828f,
                )
                close()
            }
            // M6.727 3.985 c0.096 -0.096 0.395 -0.412 0.703 -0.75 -0.043 -0.053 -0.08 -0.109 -0.13 -0.159 0 0 -0.817 -0.798 -0.873 -0.842 -0.112 0.298 -0.289 0.59 -0.542 0.842 L3.766 5.197 c-0.253 0.253 -0.545 0.43 -0.843 0.542 0.045 0.055 0.842 0.873 0.842 0.873 0.049 0.049 0.106 0.086 0.159 0.13 0.291 -0.261 0.584 -0.537 0.682 -0.634 l2.121 -2.123z
            path(
                fill = SolidColor(Color(0xFFA95233)),
            ) {
                // M 6.727 3.985
                moveTo(x = 6.727f, y = 3.985f)
                // c 0.096 -0.096 0.395 -0.412 0.703 -0.75
                curveToRelative(
                    dx1 = 0.096f,
                    dy1 = -0.096f,
                    dx2 = 0.395f,
                    dy2 = -0.412f,
                    dx3 = 0.703f,
                    dy3 = -0.75f,
                )
                // c -0.043 -0.053 -0.08 -0.109 -0.13 -0.159
                curveToRelative(
                    dx1 = -0.043f,
                    dy1 = -0.053f,
                    dx2 = -0.08f,
                    dy2 = -0.109f,
                    dx3 = -0.13f,
                    dy3 = -0.159f,
                )
                // c 0 0 -0.817 -0.798 -0.873 -0.842
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -0.817f,
                    dy2 = -0.798f,
                    dx3 = -0.873f,
                    dy3 = -0.842f,
                )
                // c -0.112 0.298 -0.289 0.59 -0.542 0.842
                curveToRelative(
                    dx1 = -0.112f,
                    dy1 = 0.298f,
                    dx2 = -0.289f,
                    dy2 = 0.59f,
                    dx3 = -0.542f,
                    dy3 = 0.842f,
                )
                // L 3.766 5.197
                lineTo(x = 3.766f, y = 5.197f)
                // c -0.253 0.253 -0.545 0.43 -0.843 0.542
                curveToRelative(
                    dx1 = -0.253f,
                    dy1 = 0.253f,
                    dx2 = -0.545f,
                    dy2 = 0.43f,
                    dx3 = -0.843f,
                    dy3 = 0.542f,
                )
                // c 0.045 0.055 0.842 0.873 0.842 0.873
                curveToRelative(
                    dx1 = 0.045f,
                    dy1 = 0.055f,
                    dx2 = 0.842f,
                    dy2 = 0.873f,
                    dx3 = 0.842f,
                    dy3 = 0.873f,
                )
                // c 0.049 0.049 0.106 0.086 0.159 0.13
                curveToRelative(
                    dx1 = 0.049f,
                    dy1 = 0.049f,
                    dx2 = 0.106f,
                    dy2 = 0.086f,
                    dx3 = 0.159f,
                    dy3 = 0.13f,
                )
                // c 0.291 -0.261 0.584 -0.537 0.682 -0.634
                curveToRelative(
                    dx1 = 0.291f,
                    dy1 = -0.261f,
                    dx2 = 0.584f,
                    dy2 = -0.537f,
                    dx3 = 0.682f,
                    dy3 = -0.634f,
                )
                // l 2.121 -2.123z
                lineToRelative(dx = 2.121f, dy = -2.123f)
                close()
            }
            // M34.9 23.787 l-5.067 -5.067 c-3.664 -3.664 -7.322 -4.14 -14.358 -6.945 l-3.149 3.149 c3.231 6.61 3.236 10.739 6.9 14.403 l5.068 5.068 c0.993 0.993 1.787 1.81 2.782 0.816 l8.409 -8.412 c0.996 -0.996 0.408 -2.019 -0.585 -3.012z
            path(
                fill = SolidColor(Color(0xFF264612)),
            ) {
                // M 34.9 23.787
                moveTo(x = 34.9f, y = 23.787f)
                // l -5.067 -5.067
                lineToRelative(dx = -5.067f, dy = -5.067f)
                // c -3.664 -3.664 -7.322 -4.14 -14.358 -6.945
                curveToRelative(
                    dx1 = -3.664f,
                    dy1 = -3.664f,
                    dx2 = -7.322f,
                    dy2 = -4.14f,
                    dx3 = -14.358f,
                    dy3 = -6.945f,
                )
                // l -3.149 3.149
                lineToRelative(dx = -3.149f, dy = 3.149f)
                // c 3.231 6.61 3.236 10.739 6.9 14.403
                curveToRelative(
                    dx1 = 3.231f,
                    dy1 = 6.61f,
                    dx2 = 3.236f,
                    dy2 = 10.739f,
                    dx3 = 6.9f,
                    dy3 = 14.403f,
                )
                // l 5.068 5.068
                lineToRelative(dx = 5.068f, dy = 5.068f)
                // c 0.993 0.993 1.787 1.81 2.782 0.816
                curveToRelative(
                    dx1 = 0.993f,
                    dy1 = 0.993f,
                    dx2 = 1.787f,
                    dy2 = 1.81f,
                    dx3 = 2.782f,
                    dy3 = 0.816f,
                )
                // l 8.409 -8.412
                lineToRelative(dx = 8.409f, dy = -8.412f)
                // c 0.996 -0.996 0.408 -2.019 -0.585 -3.012z
                curveToRelative(
                    dx1 = 0.996f,
                    dy1 = -0.996f,
                    dx2 = 0.408f,
                    dy2 = -2.019f,
                    dx3 = -0.585f,
                    dy3 = -3.012f,
                )
                close()
            }
            // M16.205 12.164 s1.739 0.644 -0.56 2.943 c-2.122 2.122 -2.917 0.651 -2.917 0.651 l-3.447 -3.447 3.536 -3.536 3.388 3.389z
            path(
                fill = SolidColor(Color(0xFFFFE8B6)),
            ) {
                // M 16.205 12.164
                moveTo(x = 16.205f, y = 12.164f)
                // s 1.739 0.644 -0.56 2.943
                reflectiveCurveToRelative(
                    dx1 = 1.739f,
                    dy1 = 0.644f,
                    dx2 = -0.56f,
                    dy2 = 2.943f,
                )
                // c -2.122 2.122 -2.917 0.651 -2.917 0.651
                curveToRelative(
                    dx1 = -2.122f,
                    dy1 = 2.122f,
                    dx2 = -2.917f,
                    dy2 = 0.651f,
                    dx3 = -2.917f,
                    dy3 = 0.651f,
                )
                // l -3.447 -3.447
                lineToRelative(dx = -3.447f, dy = -3.447f)
                // l 3.536 -3.536
                lineToRelative(dx = 3.536f, dy = -3.536f)
                // l 3.388 3.389z
                lineToRelative(dx = 3.388f, dy = 3.389f)
                close()
            }
            // M13.124 9.083 L12.11 8.068 l-3.536 3.535 1.014 1.015 c0.994 0.993 0.819 1.055 2.644 -0.77 l0.592 -0.593 c1.442 -1.443 1.293 -1.179 0.3 -2.172z
            path(
                fill = SolidColor(Color(0xFFFFD983)),
            ) {
                // M 13.124 9.083
                moveTo(x = 13.124f, y = 9.083f)
                // L 12.11 8.068
                lineTo(x = 12.11f, y = 8.068f)
                // l -3.536 3.535
                lineToRelative(dx = -3.536f, dy = 3.535f)
                // l 1.014 1.015
                lineToRelative(dx = 1.014f, dy = 1.015f)
                // c 0.994 0.993 0.819 1.055 2.644 -0.77
                curveToRelative(
                    dx1 = 0.994f,
                    dy1 = 0.993f,
                    dx2 = 0.819f,
                    dy2 = 1.055f,
                    dx3 = 2.644f,
                    dy3 = -0.77f,
                )
                // l 0.592 -0.593
                lineToRelative(dx = 0.592f, dy = -0.593f)
                // c 1.442 -1.443 1.293 -1.179 0.3 -2.172z
                curveToRelative(
                    dx1 = 1.442f,
                    dy1 = -1.443f,
                    dx2 = 1.293f,
                    dy2 = -1.179f,
                    dx3 = 0.3f,
                    dy3 = -2.172f,
                )
                close()
            }
            // M12.463 7.007 c0.586 0.586 0.586 1.536 -0.001 2.122 l-2.827 2.827 c-0.586 0.587 -1.536 0.587 -2.122 0 -0.586 -0.585 -0.586 -1.536 0 -2.122 l2.827 -2.827 c0.587 -0.585 1.537 -0.586 2.123 0z
            path(
                fill = SolidColor(Color(0xFF264612)),
            ) {
                // M 12.463 7.007
                moveTo(x = 12.463f, y = 7.007f)
                // c 0.586 0.586 0.586 1.536 -0.001 2.122
                curveToRelative(
                    dx1 = 0.586f,
                    dy1 = 0.586f,
                    dx2 = 0.586f,
                    dy2 = 1.536f,
                    dx3 = -0.001f,
                    dy3 = 2.122f,
                )
                // l -2.827 2.827
                lineToRelative(dx = -2.827f, dy = 2.827f)
                // c -0.586 0.587 -1.536 0.587 -2.122 0
                curveToRelative(
                    dx1 = -0.586f,
                    dy1 = 0.587f,
                    dx2 = -1.536f,
                    dy2 = 0.587f,
                    dx3 = -2.122f,
                    dy3 = 0.0f,
                )
                // c -0.586 -0.585 -0.586 -1.536 0 -2.122
                curveToRelative(
                    dx1 = -0.586f,
                    dy1 = -0.585f,
                    dx2 = -0.586f,
                    dy2 = -1.536f,
                    dx3 = 0.0f,
                    dy3 = -2.122f,
                )
                // l 2.827 -2.827
                lineToRelative(dx = 2.827f, dy = -2.827f)
                // c 0.587 -0.585 1.537 -0.586 2.123 0z
                curveToRelative(
                    dx1 = 0.587f,
                    dy1 = -0.585f,
                    dx2 = 1.537f,
                    dy2 = -0.586f,
                    dx3 = 2.123f,
                    dy3 = 0.0f,
                )
                close()
            }
            // M28.373 20.089 c-0.781 -0.78 -2.048 -0.78 -2.829 0 l-4.949 4.95 c-0.781 0.78 -0.781 2.047 0 2.828 l4.242 4.242 c0.781 0.781 2.048 0.781 2.829 0 l4.949 -4.949 c0.781 -0.781 0.781 -2.048 0 -2.828 l-4.242 -4.243z
            path(
                fill = SolidColor(Color(0xFFFFE8B6)),
            ) {
                // M 28.373 20.089
                moveTo(x = 28.373f, y = 20.089f)
                // c -0.781 -0.78 -2.048 -0.78 -2.829 0
                curveToRelative(
                    dx1 = -0.781f,
                    dy1 = -0.78f,
                    dx2 = -2.048f,
                    dy2 = -0.78f,
                    dx3 = -2.829f,
                    dy3 = 0.0f,
                )
                // l -4.949 4.95
                lineToRelative(dx = -4.949f, dy = 4.95f)
                // c -0.781 0.78 -0.781 2.047 0 2.828
                curveToRelative(
                    dx1 = -0.781f,
                    dy1 = 0.78f,
                    dx2 = -0.781f,
                    dy2 = 2.047f,
                    dx3 = 0.0f,
                    dy3 = 2.828f,
                )
                // l 4.242 4.242
                lineToRelative(dx = 4.242f, dy = 4.242f)
                // c 0.781 0.781 2.048 0.781 2.829 0
                curveToRelative(
                    dx1 = 0.781f,
                    dy1 = 0.781f,
                    dx2 = 2.048f,
                    dy2 = 0.781f,
                    dx3 = 2.829f,
                    dy3 = 0.0f,
                )
                // l 4.949 -4.949
                lineToRelative(dx = 4.949f, dy = -4.949f)
                // c 0.781 -0.781 0.781 -2.048 0 -2.828
                curveToRelative(
                    dx1 = 0.781f,
                    dy1 = -0.781f,
                    dx2 = 0.781f,
                    dy2 = -2.048f,
                    dx3 = 0.0f,
                    dy3 = -2.828f,
                )
                // l -4.242 -4.243z
                lineToRelative(dx = -4.242f, dy = -4.243f)
                close()
            }
        }.build().also { _emoji1f37e = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f37e: ImageVector? = null
