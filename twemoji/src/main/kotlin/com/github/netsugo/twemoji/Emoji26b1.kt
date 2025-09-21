package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji26b1: ImageVector
    get() {
        val current = _emoji26b1
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji26b1",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M23 34 c0 0.553 -2.687 1.466 -6 1.466 s-6 -0.913 -6 -1.466 2.686 -1 6 -1 6 0.447 6 1z
            path(
                fill = SolidColor(Color(0xFFD99E82)),
            ) {
                // M 23 34
                moveTo(x = 23.0f, y = 34.0f)
                // c 0 0.553 -2.687 1.466 -6 1.466
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -2.687f,
                    dy2 = 1.466f,
                    dx3 = -6.0f,
                    dy3 = 1.466f,
                )
                // s -6 -0.913 -6 -1.466
                reflectiveCurveToRelative(
                    dx1 = -6.0f,
                    dy1 = -0.913f,
                    dx2 = -6.0f,
                    dy2 = -1.466f,
                )
                // s 2.686 -1 6 -1
                reflectiveCurveToRelative(
                    dx1 = 2.686f,
                    dy1 = -1.0f,
                    dx2 = 6.0f,
                    dy2 = -1.0f,
                )
                // s 6 0.447 6 1z
                reflectiveCurveToRelative(
                    dx1 = 6.0f,
                    dy1 = 0.447f,
                    dx2 = 6.0f,
                    dy2 = 1.0f,
                )
                close()
            }
            // M24 7.078 s-1 -1.039 0 -2.039 S25 2 25 2 H9.031 s0 2.039 1 3.039 0 2.02 0 2.02 -5 1.971 -5 9.971 c0 8.001 5.977 16.995 5.977 16.995 L17 34 h6 s6 -8.961 6 -16.961 c0 -8 -5 -9.961 -5 -9.961z
            path(
                fill = SolidColor(Color(0xFFC1694F)),
            ) {
                // M 24 7.078
                moveTo(x = 24.0f, y = 7.078f)
                // s -1 -1.039 0 -2.039
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = -1.039f,
                    dx2 = 0.0f,
                    dy2 = -2.039f,
                )
                // S 25 2 25 2
                reflectiveCurveTo(
                    x1 = 25.0f,
                    y1 = 2.0f,
                    x2 = 25.0f,
                    y2 = 2.0f,
                )
                // H 9.031
                horizontalLineTo(x = 9.031f)
                // s 0 2.039 1 3.039
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.039f,
                    dx2 = 1.0f,
                    dy2 = 3.039f,
                )
                // s 0 2.02 0 2.02
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.02f,
                    dx2 = 0.0f,
                    dy2 = 2.02f,
                )
                // s -5 1.971 -5 9.971
                reflectiveCurveToRelative(
                    dx1 = -5.0f,
                    dy1 = 1.971f,
                    dx2 = -5.0f,
                    dy2 = 9.971f,
                )
                // c 0 8.001 5.977 16.995 5.977 16.995
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 8.001f,
                    dx2 = 5.977f,
                    dy2 = 16.995f,
                    dx3 = 5.977f,
                    dy3 = 16.995f,
                )
                // L 17 34
                lineTo(x = 17.0f, y = 34.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // s 6 -8.961 6 -16.961
                reflectiveCurveToRelative(
                    dx1 = 6.0f,
                    dy1 = -8.961f,
                    dx2 = 6.0f,
                    dy2 = -16.961f,
                )
                // c 0 -8 -5 -9.961 -5 -9.961z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -8.0f,
                    dx2 = -5.0f,
                    dy2 = -9.961f,
                    dx3 = -5.0f,
                    dy3 = -9.961f,
                )
                close()
            }
            // M25 2 c0 0.552 -3.582 1 -8 1 s-8 -0.448 -8 -1 S12.582 0.25 17 0.25 25 1.448 25 2z M17 33.225 c-3.331 0 -6.143 -0.565 -7.25 -1.304 0.725 1.294 1.246 2.084 1.256 2.1 0.063 0.555 2.72 1.445 5.994 1.445 3.313 0 6 -0.913 6 -1.466 0 0 0.52 -0.781 1.244 -2.065 -1.12 0.732 -3.934 1.29 -7.244 1.29z
            path(
                fill = SolidColor(Color(0xFFD99E82)),
            ) {
                // M 25 2
                moveTo(x = 25.0f, y = 2.0f)
                // c 0 0.552 -3.582 1 -8 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = -3.582f,
                    dy2 = 1.0f,
                    dx3 = -8.0f,
                    dy3 = 1.0f,
                )
                // s -8 -0.448 -8 -1
                reflectiveCurveToRelative(
                    dx1 = -8.0f,
                    dy1 = -0.448f,
                    dx2 = -8.0f,
                    dy2 = -1.0f,
                )
                // S 12.582 0.25 17 0.25
                reflectiveCurveTo(
                    x1 = 12.582f,
                    y1 = 0.25f,
                    x2 = 17.0f,
                    y2 = 0.25f,
                )
                // S 25 1.448 25 2z
                reflectiveCurveTo(
                    x1 = 25.0f,
                    y1 = 1.448f,
                    x2 = 25.0f,
                    y2 = 2.0f,
                )
                close()
                // M 17 33.225
                moveTo(x = 17.0f, y = 33.225f)
                // c -3.331 0 -6.143 -0.565 -7.25 -1.304
                curveToRelative(
                    dx1 = -3.331f,
                    dy1 = 0.0f,
                    dx2 = -6.143f,
                    dy2 = -0.565f,
                    dx3 = -7.25f,
                    dy3 = -1.304f,
                )
                // c 0.725 1.294 1.246 2.084 1.256 2.1
                curveToRelative(
                    dx1 = 0.725f,
                    dy1 = 1.294f,
                    dx2 = 1.246f,
                    dy2 = 2.084f,
                    dx3 = 1.256f,
                    dy3 = 2.1f,
                )
                // c 0.063 0.555 2.72 1.445 5.994 1.445
                curveToRelative(
                    dx1 = 0.063f,
                    dy1 = 0.555f,
                    dx2 = 2.72f,
                    dy2 = 1.445f,
                    dx3 = 5.994f,
                    dy3 = 1.445f,
                )
                // c 3.313 0 6 -0.913 6 -1.466
                curveToRelative(
                    dx1 = 3.313f,
                    dy1 = 0.0f,
                    dx2 = 6.0f,
                    dy2 = -0.913f,
                    dx3 = 6.0f,
                    dy3 = -1.466f,
                )
                // c 0 0 0.52 -0.781 1.244 -2.065
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 0.52f,
                    dy2 = -0.781f,
                    dx3 = 1.244f,
                    dy3 = -2.065f,
                )
                // c -1.12 0.732 -3.934 1.29 -7.244 1.29z
                curveToRelative(
                    dx1 = -1.12f,
                    dy1 = 0.732f,
                    dx2 = -3.934f,
                    dy2 = 1.29f,
                    dx3 = -7.244f,
                    dy3 = 1.29f,
                )
                close()
            }
            // M24.163 4.724 c-0.799 0.46 -3.698 1.008 -7.163 1.008 s-6.365 -0.548 -7.163 -1.008 c-0.142 0.082 -0.226 0.167 -0.226 0.255 0 0.583 3.308 1.262 7.389 1.262 4.08 0 7.389 -0.679 7.389 -1.262 0 -0.088 -0.083 -0.173 -0.226 -0.255z
            path(
                fill = SolidColor(Color(0xFF662113)),
            ) {
                // M 24.163 4.724
                moveTo(x = 24.163f, y = 4.724f)
                // c -0.799 0.46 -3.698 1.008 -7.163 1.008
                curveToRelative(
                    dx1 = -0.799f,
                    dy1 = 0.46f,
                    dx2 = -3.698f,
                    dy2 = 1.008f,
                    dx3 = -7.163f,
                    dy3 = 1.008f,
                )
                // s -6.365 -0.548 -7.163 -1.008
                reflectiveCurveToRelative(
                    dx1 = -6.365f,
                    dy1 = -0.548f,
                    dx2 = -7.163f,
                    dy2 = -1.008f,
                )
                // c -0.142 0.082 -0.226 0.167 -0.226 0.255
                curveToRelative(
                    dx1 = -0.142f,
                    dy1 = 0.082f,
                    dx2 = -0.226f,
                    dy2 = 0.167f,
                    dx3 = -0.226f,
                    dy3 = 0.255f,
                )
                // c 0 0.583 3.308 1.262 7.389 1.262
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.583f,
                    dx2 = 3.308f,
                    dy2 = 1.262f,
                    dx3 = 7.389f,
                    dy3 = 1.262f,
                )
                // c 4.08 0 7.389 -0.679 7.389 -1.262
                curveToRelative(
                    dx1 = 4.08f,
                    dy1 = 0.0f,
                    dx2 = 7.389f,
                    dy2 = -0.679f,
                    dx3 = 7.389f,
                    dy3 = -1.262f,
                )
                // c 0 -0.088 -0.083 -0.173 -0.226 -0.255z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.088f,
                    dx2 = -0.083f,
                    dy2 = -0.173f,
                    dx3 = -0.226f,
                    dy3 = -0.255f,
                )
                close()
            }
            // M10.387 6.467 c2.594 0.71 5.403 0.814 6.613 0.814 1.215 0 4.037 -0.097 6.639 -0.815 -0.137 -0.388 -0.155 -0.912 0.361 -1.427 l0.008 -0.01 -0.117 0.034 c-2.479 0.682 -7.009 0.969 -7.009 0.969 s-4.353 -0.287 -6.832 -0.969 h-0.001 c0.497 0.513 0.476 1.025 0.338 1.404z
            path(
                fill = SolidColor(Color(0xFF662113)),
            ) {
                // M 10.387 6.467
                moveTo(x = 10.387f, y = 6.467f)
                // c 2.594 0.71 5.403 0.814 6.613 0.814
                curveToRelative(
                    dx1 = 2.594f,
                    dy1 = 0.71f,
                    dx2 = 5.403f,
                    dy2 = 0.814f,
                    dx3 = 6.613f,
                    dy3 = 0.814f,
                )
                // c 1.215 0 4.037 -0.097 6.639 -0.815
                curveToRelative(
                    dx1 = 1.215f,
                    dy1 = 0.0f,
                    dx2 = 4.037f,
                    dy2 = -0.097f,
                    dx3 = 6.639f,
                    dy3 = -0.815f,
                )
                // c -0.137 -0.388 -0.155 -0.912 0.361 -1.427
                curveToRelative(
                    dx1 = -0.137f,
                    dy1 = -0.388f,
                    dx2 = -0.155f,
                    dy2 = -0.912f,
                    dx3 = 0.361f,
                    dy3 = -1.427f,
                )
                // l 0.008 -0.01
                lineToRelative(dx = 0.008f, dy = -0.01f)
                // l -0.117 0.034
                lineToRelative(dx = -0.117f, dy = 0.034f)
                // c -2.479 0.682 -7.009 0.969 -7.009 0.969
                curveToRelative(
                    dx1 = -2.479f,
                    dy1 = 0.682f,
                    dx2 = -7.009f,
                    dy2 = 0.969f,
                    dx3 = -7.009f,
                    dy3 = 0.969f,
                )
                // s -4.353 -0.287 -6.832 -0.969
                reflectiveCurveToRelative(
                    dx1 = -4.353f,
                    dy1 = -0.287f,
                    dx2 = -6.832f,
                    dy2 = -0.969f,
                )
                // h -0.001
                horizontalLineToRelative(dx = -0.001f)
                // c 0.497 0.513 0.476 1.025 0.338 1.404z
                curveToRelative(
                    dx1 = 0.497f,
                    dy1 = 0.513f,
                    dx2 = 0.476f,
                    dy2 = 1.025f,
                    dx3 = 0.338f,
                    dy3 = 1.404f,
                )
                close()
            }
            // M17 18.612 c4.808 0 9.216 -0.776 11.962 -2.55 -0.072 -1.319 -0.282 -2.456 -0.583 -3.434 -0.438 0.091 -0.862 0.348 -1.345 0.509 -3 1 -8.034 1.25 -10.034 1.25 s-7.052 -0.293 -10.052 -1.293 c-0.48 -0.16 -0.843 -0.373 -1.3 -0.464 -0.323 1.054 -0.539 2.295 -0.592 3.747 2.798 1.632 7.533 2.235 11.944 2.235z
            path(
                fill = SolidColor(Color(0xFFD99E82)),
            ) {
                // M 17 18.612
                moveTo(x = 17.0f, y = 18.612f)
                // c 4.808 0 9.216 -0.776 11.962 -2.55
                curveToRelative(
                    dx1 = 4.808f,
                    dy1 = 0.0f,
                    dx2 = 9.216f,
                    dy2 = -0.776f,
                    dx3 = 11.962f,
                    dy3 = -2.55f,
                )
                // c -0.072 -1.319 -0.282 -2.456 -0.583 -3.434
                curveToRelative(
                    dx1 = -0.072f,
                    dy1 = -1.319f,
                    dx2 = -0.282f,
                    dy2 = -2.456f,
                    dx3 = -0.583f,
                    dy3 = -3.434f,
                )
                // c -0.438 0.091 -0.862 0.348 -1.345 0.509
                curveToRelative(
                    dx1 = -0.438f,
                    dy1 = 0.091f,
                    dx2 = -0.862f,
                    dy2 = 0.348f,
                    dx3 = -1.345f,
                    dy3 = 0.509f,
                )
                // c -3 1 -8.034 1.25 -10.034 1.25
                curveToRelative(
                    dx1 = -3.0f,
                    dy1 = 1.0f,
                    dx2 = -8.034f,
                    dy2 = 1.25f,
                    dx3 = -10.034f,
                    dy3 = 1.25f,
                )
                // s -7.052 -0.293 -10.052 -1.293
                reflectiveCurveToRelative(
                    dx1 = -7.052f,
                    dy1 = -0.293f,
                    dx2 = -10.052f,
                    dy2 = -1.293f,
                )
                // c -0.48 -0.16 -0.843 -0.373 -1.3 -0.464
                curveToRelative(
                    dx1 = -0.48f,
                    dy1 = -0.16f,
                    dx2 = -0.843f,
                    dy2 = -0.373f,
                    dx3 = -1.3f,
                    dy3 = -0.464f,
                )
                // c -0.323 1.054 -0.539 2.295 -0.592 3.747
                curveToRelative(
                    dx1 = -0.323f,
                    dy1 = 1.054f,
                    dx2 = -0.539f,
                    dy2 = 2.295f,
                    dx3 = -0.592f,
                    dy3 = 3.747f,
                )
                // c 2.798 1.632 7.533 2.235 11.944 2.235z
                curveToRelative(
                    dx1 = 2.798f,
                    dy1 = 1.632f,
                    dx2 = 7.533f,
                    dy2 = 2.235f,
                    dx3 = 11.944f,
                    dy3 = 2.235f,
                )
                close()
            }
        }.build().also { _emoji26b1 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji26b1: ImageVector? = null
