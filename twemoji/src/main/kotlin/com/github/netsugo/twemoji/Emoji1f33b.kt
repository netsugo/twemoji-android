package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f33b: ImageVector
    get() {
        val current = _emoji1f33b
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f33b",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M28 27 c-8 0 -8 6 -8 6 V22 h-4 v11 s0 -6 -8 -6 c-4 0 -7 -2 -7 -2 s0 9 9 9 h6 s0 2 2 2 2 -2 2 -2 h6 c9 0 9 -9 9 -9 s-3 2 -7 2z
            path(
                fill = SolidColor(Color(0xFF3E721D)),
            ) {
                // M 28 27
                moveTo(x = 28.0f, y = 27.0f)
                // c -8 0 -8 6 -8 6
                curveToRelative(
                    dx1 = -8.0f,
                    dy1 = 0.0f,
                    dx2 = -8.0f,
                    dy2 = 6.0f,
                    dx3 = -8.0f,
                    dy3 = 6.0f,
                )
                // V 22
                verticalLineTo(y = 22.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v 11
                verticalLineToRelative(dy = 11.0f)
                // s 0 -6 -8 -6
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -6.0f,
                    dx2 = -8.0f,
                    dy2 = -6.0f,
                )
                // c -4 0 -7 -2 -7 -2
                curveToRelative(
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                    dx2 = -7.0f,
                    dy2 = -2.0f,
                    dx3 = -7.0f,
                    dy3 = -2.0f,
                )
                // s 0 9 9 9
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 9.0f,
                    dx2 = 9.0f,
                    dy2 = 9.0f,
                )
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // s 0 2 2 2
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                )
                // s 2 -2 2 -2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // c 9 0 9 -9 9 -9
                curveToRelative(
                    dx1 = 9.0f,
                    dy1 = 0.0f,
                    dx2 = 9.0f,
                    dy2 = -9.0f,
                    dx3 = 9.0f,
                    dy3 = -9.0f,
                )
                // s -3 2 -7 2z
                reflectiveCurveToRelative(
                    dx1 = -3.0f,
                    dy1 = 2.0f,
                    dx2 = -7.0f,
                    dy2 = 2.0f,
                )
                close()
            }
            // M21.125 27.662 c-0.328 0 -0.651 -0.097 -0.927 -0.283 l-2.323 -1.575 -2.322 1.575 c-0.277 0.186 -0.601 0.283 -0.929 0.283 -0.143 0 -0.287 -0.018 -0.429 -0.057 -0.462 -0.123 -0.851 -0.441 -1.06 -0.874 l-1.225 -2.527 -2.797 0.204 c-0.04 0.002 -0.079 0.004 -0.119 0.004 -0.438 0 -0.86 -0.174 -1.17 -0.484 -0.34 -0.342 -0.516 -0.81 -0.481 -1.288 l0.201 -2.8 -2.523 -1.225 c-0.432 -0.209 -0.751 -0.598 -0.876 -1.062 -0.125 -0.464 -0.042 -0.958 0.228 -1.356 l1.573 -2.323 -1.573 -2.322 c-0.27 -0.398 -0.353 -0.892 -0.228 -1.357 0.125 -0.462 0.444 -0.851 0.876 -1.06 L7.544 7.91 l-0.201 -2.797 c-0.034 -0.48 0.142 -0.951 0.481 -1.289 0.31 -0.312 0.732 -0.485 1.17 -0.485 0.04 0 0.079 0 0.119 0.003 l2.797 0.201 1.225 -2.523 c0.209 -0.432 0.598 -0.751 1.06 -0.876 0.142 -0.038 0.285 -0.057 0.429 -0.057 0.328 0 0.651 0.098 0.929 0.285 l2.322 1.573 L20.198 0.372 c0.275 -0.188 0.599 -0.285 0.927 -0.285 0.144 0 0.29 0.02 0.428 0.057 0.465 0.125 0.854 0.444 1.062 0.876 l1.225 2.523 2.8 -0.201 c0.037 -0.003 0.078 -0.003 0.116 -0.003 0.438 0 0.858 0.173 1.172 0.485 0.338 0.338 0.515 0.809 0.48 1.289 l-0.204 2.797 2.527 1.225 c0.433 0.209 0.751 0.598 0.874 1.06 0.124 0.465 0.043 0.96 -0.227 1.357 l-1.575 2.322 1.575 2.323 c0.269 0.398 0.351 0.892 0.227 1.356 -0.123 0.464 -0.441 0.852 -0.874 1.062 l-2.527 1.225 0.204 2.8 c0.034 0.478 -0.143 0.946 -0.48 1.288 -0.313 0.311 -0.734 0.484 -1.172 0.484 -0.038 0 -0.079 -0.002 -0.116 -0.004 l-2.8 -0.204 -1.225 2.527 c-0.209 0.433 -0.598 0.751 -1.062 0.874 -0.139 0.04 -0.284 0.057 -0.428 0.057z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 21.125 27.662
                moveTo(x = 21.125f, y = 27.662f)
                // c -0.328 0 -0.651 -0.097 -0.927 -0.283
                curveToRelative(
                    dx1 = -0.328f,
                    dy1 = 0.0f,
                    dx2 = -0.651f,
                    dy2 = -0.097f,
                    dx3 = -0.927f,
                    dy3 = -0.283f,
                )
                // l -2.323 -1.575
                lineToRelative(dx = -2.323f, dy = -1.575f)
                // l -2.322 1.575
                lineToRelative(dx = -2.322f, dy = 1.575f)
                // c -0.277 0.186 -0.601 0.283 -0.929 0.283
                curveToRelative(
                    dx1 = -0.277f,
                    dy1 = 0.186f,
                    dx2 = -0.601f,
                    dy2 = 0.283f,
                    dx3 = -0.929f,
                    dy3 = 0.283f,
                )
                // c -0.143 0 -0.287 -0.018 -0.429 -0.057
                curveToRelative(
                    dx1 = -0.143f,
                    dy1 = 0.0f,
                    dx2 = -0.287f,
                    dy2 = -0.018f,
                    dx3 = -0.429f,
                    dy3 = -0.057f,
                )
                // c -0.462 -0.123 -0.851 -0.441 -1.06 -0.874
                curveToRelative(
                    dx1 = -0.462f,
                    dy1 = -0.123f,
                    dx2 = -0.851f,
                    dy2 = -0.441f,
                    dx3 = -1.06f,
                    dy3 = -0.874f,
                )
                // l -1.225 -2.527
                lineToRelative(dx = -1.225f, dy = -2.527f)
                // l -2.797 0.204
                lineToRelative(dx = -2.797f, dy = 0.204f)
                // c -0.04 0.002 -0.079 0.004 -0.119 0.004
                curveToRelative(
                    dx1 = -0.04f,
                    dy1 = 0.002f,
                    dx2 = -0.079f,
                    dy2 = 0.004f,
                    dx3 = -0.119f,
                    dy3 = 0.004f,
                )
                // c -0.438 0 -0.86 -0.174 -1.17 -0.484
                curveToRelative(
                    dx1 = -0.438f,
                    dy1 = 0.0f,
                    dx2 = -0.86f,
                    dy2 = -0.174f,
                    dx3 = -1.17f,
                    dy3 = -0.484f,
                )
                // c -0.34 -0.342 -0.516 -0.81 -0.481 -1.288
                curveToRelative(
                    dx1 = -0.34f,
                    dy1 = -0.342f,
                    dx2 = -0.516f,
                    dy2 = -0.81f,
                    dx3 = -0.481f,
                    dy3 = -1.288f,
                )
                // l 0.201 -2.8
                lineToRelative(dx = 0.201f, dy = -2.8f)
                // l -2.523 -1.225
                lineToRelative(dx = -2.523f, dy = -1.225f)
                // c -0.432 -0.209 -0.751 -0.598 -0.876 -1.062
                curveToRelative(
                    dx1 = -0.432f,
                    dy1 = -0.209f,
                    dx2 = -0.751f,
                    dy2 = -0.598f,
                    dx3 = -0.876f,
                    dy3 = -1.062f,
                )
                // c -0.125 -0.464 -0.042 -0.958 0.228 -1.356
                curveToRelative(
                    dx1 = -0.125f,
                    dy1 = -0.464f,
                    dx2 = -0.042f,
                    dy2 = -0.958f,
                    dx3 = 0.228f,
                    dy3 = -1.356f,
                )
                // l 1.573 -2.323
                lineToRelative(dx = 1.573f, dy = -2.323f)
                // l -1.573 -2.322
                lineToRelative(dx = -1.573f, dy = -2.322f)
                // c -0.27 -0.398 -0.353 -0.892 -0.228 -1.357
                curveToRelative(
                    dx1 = -0.27f,
                    dy1 = -0.398f,
                    dx2 = -0.353f,
                    dy2 = -0.892f,
                    dx3 = -0.228f,
                    dy3 = -1.357f,
                )
                // c 0.125 -0.462 0.444 -0.851 0.876 -1.06
                curveToRelative(
                    dx1 = 0.125f,
                    dy1 = -0.462f,
                    dx2 = 0.444f,
                    dy2 = -0.851f,
                    dx3 = 0.876f,
                    dy3 = -1.06f,
                )
                // L 7.544 7.91
                lineTo(x = 7.544f, y = 7.91f)
                // l -0.201 -2.797
                lineToRelative(dx = -0.201f, dy = -2.797f)
                // c -0.034 -0.48 0.142 -0.951 0.481 -1.289
                curveToRelative(
                    dx1 = -0.034f,
                    dy1 = -0.48f,
                    dx2 = 0.142f,
                    dy2 = -0.951f,
                    dx3 = 0.481f,
                    dy3 = -1.289f,
                )
                // c 0.31 -0.312 0.732 -0.485 1.17 -0.485
                curveToRelative(
                    dx1 = 0.31f,
                    dy1 = -0.312f,
                    dx2 = 0.732f,
                    dy2 = -0.485f,
                    dx3 = 1.17f,
                    dy3 = -0.485f,
                )
                // c 0.04 0 0.079 0 0.119 0.003
                curveToRelative(
                    dx1 = 0.04f,
                    dy1 = 0.0f,
                    dx2 = 0.079f,
                    dy2 = 0.0f,
                    dx3 = 0.119f,
                    dy3 = 0.003f,
                )
                // l 2.797 0.201
                lineToRelative(dx = 2.797f, dy = 0.201f)
                // l 1.225 -2.523
                lineToRelative(dx = 1.225f, dy = -2.523f)
                // c 0.209 -0.432 0.598 -0.751 1.06 -0.876
                curveToRelative(
                    dx1 = 0.209f,
                    dy1 = -0.432f,
                    dx2 = 0.598f,
                    dy2 = -0.751f,
                    dx3 = 1.06f,
                    dy3 = -0.876f,
                )
                // c 0.142 -0.038 0.285 -0.057 0.429 -0.057
                curveToRelative(
                    dx1 = 0.142f,
                    dy1 = -0.038f,
                    dx2 = 0.285f,
                    dy2 = -0.057f,
                    dx3 = 0.429f,
                    dy3 = -0.057f,
                )
                // c 0.328 0 0.651 0.098 0.929 0.285
                curveToRelative(
                    dx1 = 0.328f,
                    dy1 = 0.0f,
                    dx2 = 0.651f,
                    dy2 = 0.098f,
                    dx3 = 0.929f,
                    dy3 = 0.285f,
                )
                // l 2.322 1.573
                lineToRelative(dx = 2.322f, dy = 1.573f)
                // L 20.198 0.372
                lineTo(x = 20.198f, y = 0.372f)
                // c 0.275 -0.188 0.599 -0.285 0.927 -0.285
                curveToRelative(
                    dx1 = 0.275f,
                    dy1 = -0.188f,
                    dx2 = 0.599f,
                    dy2 = -0.285f,
                    dx3 = 0.927f,
                    dy3 = -0.285f,
                )
                // c 0.144 0 0.29 0.02 0.428 0.057
                curveToRelative(
                    dx1 = 0.144f,
                    dy1 = 0.0f,
                    dx2 = 0.29f,
                    dy2 = 0.02f,
                    dx3 = 0.428f,
                    dy3 = 0.057f,
                )
                // c 0.465 0.125 0.854 0.444 1.062 0.876
                curveToRelative(
                    dx1 = 0.465f,
                    dy1 = 0.125f,
                    dx2 = 0.854f,
                    dy2 = 0.444f,
                    dx3 = 1.062f,
                    dy3 = 0.876f,
                )
                // l 1.225 2.523
                lineToRelative(dx = 1.225f, dy = 2.523f)
                // l 2.8 -0.201
                lineToRelative(dx = 2.8f, dy = -0.201f)
                // c 0.037 -0.003 0.078 -0.003 0.116 -0.003
                curveToRelative(
                    dx1 = 0.037f,
                    dy1 = -0.003f,
                    dx2 = 0.078f,
                    dy2 = -0.003f,
                    dx3 = 0.116f,
                    dy3 = -0.003f,
                )
                // c 0.438 0 0.858 0.173 1.172 0.485
                curveToRelative(
                    dx1 = 0.438f,
                    dy1 = 0.0f,
                    dx2 = 0.858f,
                    dy2 = 0.173f,
                    dx3 = 1.172f,
                    dy3 = 0.485f,
                )
                // c 0.338 0.338 0.515 0.809 0.48 1.289
                curveToRelative(
                    dx1 = 0.338f,
                    dy1 = 0.338f,
                    dx2 = 0.515f,
                    dy2 = 0.809f,
                    dx3 = 0.48f,
                    dy3 = 1.289f,
                )
                // l -0.204 2.797
                lineToRelative(dx = -0.204f, dy = 2.797f)
                // l 2.527 1.225
                lineToRelative(dx = 2.527f, dy = 1.225f)
                // c 0.433 0.209 0.751 0.598 0.874 1.06
                curveToRelative(
                    dx1 = 0.433f,
                    dy1 = 0.209f,
                    dx2 = 0.751f,
                    dy2 = 0.598f,
                    dx3 = 0.874f,
                    dy3 = 1.06f,
                )
                // c 0.124 0.465 0.043 0.96 -0.227 1.357
                curveToRelative(
                    dx1 = 0.124f,
                    dy1 = 0.465f,
                    dx2 = 0.043f,
                    dy2 = 0.96f,
                    dx3 = -0.227f,
                    dy3 = 1.357f,
                )
                // l -1.575 2.322
                lineToRelative(dx = -1.575f, dy = 2.322f)
                // l 1.575 2.323
                lineToRelative(dx = 1.575f, dy = 2.323f)
                // c 0.269 0.398 0.351 0.892 0.227 1.356
                curveToRelative(
                    dx1 = 0.269f,
                    dy1 = 0.398f,
                    dx2 = 0.351f,
                    dy2 = 0.892f,
                    dx3 = 0.227f,
                    dy3 = 1.356f,
                )
                // c -0.123 0.464 -0.441 0.852 -0.874 1.062
                curveToRelative(
                    dx1 = -0.123f,
                    dy1 = 0.464f,
                    dx2 = -0.441f,
                    dy2 = 0.852f,
                    dx3 = -0.874f,
                    dy3 = 1.062f,
                )
                // l -2.527 1.225
                lineToRelative(dx = -2.527f, dy = 1.225f)
                // l 0.204 2.8
                lineToRelative(dx = 0.204f, dy = 2.8f)
                // c 0.034 0.478 -0.143 0.946 -0.48 1.288
                curveToRelative(
                    dx1 = 0.034f,
                    dy1 = 0.478f,
                    dx2 = -0.143f,
                    dy2 = 0.946f,
                    dx3 = -0.48f,
                    dy3 = 1.288f,
                )
                // c -0.313 0.311 -0.734 0.484 -1.172 0.484
                curveToRelative(
                    dx1 = -0.313f,
                    dy1 = 0.311f,
                    dx2 = -0.734f,
                    dy2 = 0.484f,
                    dx3 = -1.172f,
                    dy3 = 0.484f,
                )
                // c -0.038 0 -0.079 -0.002 -0.116 -0.004
                curveToRelative(
                    dx1 = -0.038f,
                    dy1 = 0.0f,
                    dx2 = -0.079f,
                    dy2 = -0.002f,
                    dx3 = -0.116f,
                    dy3 = -0.004f,
                )
                // l -2.8 -0.204
                lineToRelative(dx = -2.8f, dy = -0.204f)
                // l -1.225 2.527
                lineToRelative(dx = -1.225f, dy = 2.527f)
                // c -0.209 0.433 -0.598 0.751 -1.062 0.874
                curveToRelative(
                    dx1 = -0.209f,
                    dy1 = 0.433f,
                    dx2 = -0.598f,
                    dy2 = 0.751f,
                    dx3 = -1.062f,
                    dy3 = 0.874f,
                )
                // c -0.139 0.04 -0.284 0.057 -0.428 0.057z
                curveToRelative(
                    dx1 = -0.139f,
                    dy1 = 0.04f,
                    dx2 = -0.284f,
                    dy2 = 0.057f,
                    dx3 = -0.428f,
                    dy3 = 0.057f,
                )
                close()
            }
            // M18 14 m-7 0 a7 7 0 1 1 14 0 a7 7 0 1 1 -14 0
            path(
                fill = SolidColor(Color(0xFF732700)),
            ) {
                // M 18 14
                moveTo(x = 18.0f, y = 14.0f)
                // m -7 0
                moveToRelative(dx = -7.0f, dy = 0.0f)
                // a 7 7 0 1 1 14 0
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 14.0f,
                    dy1 = 0.0f,
                )
                // a 7 7 0 1 1 -14 0
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -14.0f,
                    dy1 = 0.0f,
                )
            }
        }.build().also { _emoji1f33b = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f33b: ImageVector? = null
