package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f30d: ImageVector
    get() {
        val current = _emoji1f30d
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f30d",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M18 18 m-18 0 a18 18 0 1 1 36 0 a18 18 0 1 1 -36 0
            path(
                fill = SolidColor(Color(0xFF88C9F9)),
            ) {
                // M 18 18
                moveTo(x = 18.0f, y = 18.0f)
                // m -18 0
                moveToRelative(dx = -18.0f, dy = 0.0f)
                // a 18 18 0 1 1 36 0
                arcToRelative(
                    a = 18.0f,
                    b = 18.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 36.0f,
                    dy1 = 0.0f,
                )
                // a 18 18 0 1 1 -36 0
                arcToRelative(
                    a = 18.0f,
                    b = 18.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -36.0f,
                    dy1 = 0.0f,
                )
            }
            // M25.716 1.756 c-1.022 0.568 -1.872 1.528 -3.028 1.181 -1.875 -0.562 -4.375 -1.812 -6 -0.25 s-2 3 0 2.938 3.375 -2.438 4.375 -1.438 0.749 1.813 -1.625 2.125 S14.5 7 13.125 7 s-1.688 0.812 -0.75 1.688 -0.563 0.937 -2.125 1.812 0.375 1.25 1.688 2 2.312 -0.188 2.875 -1.438 2.981 -2.75 3.99 -2.562 c1.01 0.188 1.01 0.688 0.822 1.562 s0.75 0.625 0.812 -0.375 1.188 -1.75 2.062 -1.812 1.625 1.188 0.625 1.812 -2 1.125 -0.75 1.438 2.125 1.938 0.688 2.625 -3.937 1.125 -5.062 0.562 -3.688 -1.375 -4.375 -0.938 -1.062 0.89 -1.875 1.195 c-0.812 0.305 -4.125 1.805 -4.188 3.743 S7.438 22.438 8.75 22.5 s4.5 -0.812 5.5 -1.625 2.375 -0.625 2.812 0.312 0.125 1.5 -0.312 3 0.286 2.25 0.987 3.562 c0.701 1.312 1.263 2.062 1.263 3 s1 1.875 2.5 0.312 2.875 -4.625 3.5 -5.75 1.125 -3.625 1.875 -4.125 1.938 -1.688 1.062 -1.5 -2.625 -0.062 -3.062 -1.312 -2.312 -3.625 -1.438 -3.875 1.875 1.39 2.25 2.164 c0.375 0.774 0.875 1.711 1.625 1.961 s2.375 -1.673 2.875 -1.961 c0.5 -0.289 0.125 -1.476 -0.875 -1.351 s-2.312 0 -2.312 -0.624 1.25 -1.438 2.25 -1.25 1.75 0.5 2.375 1.25 1.875 2.125 2.375 3 0.875 1 1.125 -0.562 c0.166 -1.038 0.387 -1.609 0.59 -2.222 -1.013 -5.829 -4.82 -10.683 -9.999 -13.148z
            path(
                fill = SolidColor(Color(0xFF5C913B)),
            ) {
                // M 25.716 1.756
                moveTo(x = 25.716f, y = 1.756f)
                // c -1.022 0.568 -1.872 1.528 -3.028 1.181
                curveToRelative(
                    dx1 = -1.022f,
                    dy1 = 0.568f,
                    dx2 = -1.872f,
                    dy2 = 1.528f,
                    dx3 = -3.028f,
                    dy3 = 1.181f,
                )
                // c -1.875 -0.562 -4.375 -1.812 -6 -0.25
                curveToRelative(
                    dx1 = -1.875f,
                    dy1 = -0.562f,
                    dx2 = -4.375f,
                    dy2 = -1.812f,
                    dx3 = -6.0f,
                    dy3 = -0.25f,
                )
                // s -2 3 0 2.938
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 3.0f,
                    dx2 = 0.0f,
                    dy2 = 2.938f,
                )
                // s 3.375 -2.438 4.375 -1.438
                reflectiveCurveToRelative(
                    dx1 = 3.375f,
                    dy1 = -2.438f,
                    dx2 = 4.375f,
                    dy2 = -1.438f,
                )
                // s 0.749 1.813 -1.625 2.125
                reflectiveCurveToRelative(
                    dx1 = 0.749f,
                    dy1 = 1.813f,
                    dx2 = -1.625f,
                    dy2 = 2.125f,
                )
                // S 14.5 7 13.125 7
                reflectiveCurveTo(
                    x1 = 14.5f,
                    y1 = 7.0f,
                    x2 = 13.125f,
                    y2 = 7.0f,
                )
                // s -1.688 0.812 -0.75 1.688
                reflectiveCurveToRelative(
                    dx1 = -1.688f,
                    dy1 = 0.812f,
                    dx2 = -0.75f,
                    dy2 = 1.688f,
                )
                // s -0.563 0.937 -2.125 1.812
                reflectiveCurveToRelative(
                    dx1 = -0.563f,
                    dy1 = 0.937f,
                    dx2 = -2.125f,
                    dy2 = 1.812f,
                )
                // s 0.375 1.25 1.688 2
                reflectiveCurveToRelative(
                    dx1 = 0.375f,
                    dy1 = 1.25f,
                    dx2 = 1.688f,
                    dy2 = 2.0f,
                )
                // s 2.312 -0.188 2.875 -1.438
                reflectiveCurveToRelative(
                    dx1 = 2.312f,
                    dy1 = -0.188f,
                    dx2 = 2.875f,
                    dy2 = -1.438f,
                )
                // s 2.981 -2.75 3.99 -2.562
                reflectiveCurveToRelative(
                    dx1 = 2.981f,
                    dy1 = -2.75f,
                    dx2 = 3.99f,
                    dy2 = -2.562f,
                )
                // c 1.01 0.188 1.01 0.688 0.822 1.562
                curveToRelative(
                    dx1 = 1.01f,
                    dy1 = 0.188f,
                    dx2 = 1.01f,
                    dy2 = 0.688f,
                    dx3 = 0.822f,
                    dy3 = 1.562f,
                )
                // s 0.75 0.625 0.812 -0.375
                reflectiveCurveToRelative(
                    dx1 = 0.75f,
                    dy1 = 0.625f,
                    dx2 = 0.812f,
                    dy2 = -0.375f,
                )
                // s 1.188 -1.75 2.062 -1.812
                reflectiveCurveToRelative(
                    dx1 = 1.188f,
                    dy1 = -1.75f,
                    dx2 = 2.062f,
                    dy2 = -1.812f,
                )
                // s 1.625 1.188 0.625 1.812
                reflectiveCurveToRelative(
                    dx1 = 1.625f,
                    dy1 = 1.188f,
                    dx2 = 0.625f,
                    dy2 = 1.812f,
                )
                // s -2 1.125 -0.75 1.438
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 1.125f,
                    dx2 = -0.75f,
                    dy2 = 1.438f,
                )
                // s 2.125 1.938 0.688 2.625
                reflectiveCurveToRelative(
                    dx1 = 2.125f,
                    dy1 = 1.938f,
                    dx2 = 0.688f,
                    dy2 = 2.625f,
                )
                // s -3.937 1.125 -5.062 0.562
                reflectiveCurveToRelative(
                    dx1 = -3.937f,
                    dy1 = 1.125f,
                    dx2 = -5.062f,
                    dy2 = 0.562f,
                )
                // s -3.688 -1.375 -4.375 -0.938
                reflectiveCurveToRelative(
                    dx1 = -3.688f,
                    dy1 = -1.375f,
                    dx2 = -4.375f,
                    dy2 = -0.938f,
                )
                // s -1.062 0.89 -1.875 1.195
                reflectiveCurveToRelative(
                    dx1 = -1.062f,
                    dy1 = 0.89f,
                    dx2 = -1.875f,
                    dy2 = 1.195f,
                )
                // c -0.812 0.305 -4.125 1.805 -4.188 3.743
                curveToRelative(
                    dx1 = -0.812f,
                    dy1 = 0.305f,
                    dx2 = -4.125f,
                    dy2 = 1.805f,
                    dx3 = -4.188f,
                    dy3 = 3.743f,
                )
                // S 7.438 22.438 8.75 22.5
                reflectiveCurveTo(
                    x1 = 7.438f,
                    y1 = 22.438f,
                    x2 = 8.75f,
                    y2 = 22.5f,
                )
                // s 4.5 -0.812 5.5 -1.625
                reflectiveCurveToRelative(
                    dx1 = 4.5f,
                    dy1 = -0.812f,
                    dx2 = 5.5f,
                    dy2 = -1.625f,
                )
                // s 2.375 -0.625 2.812 0.312
                reflectiveCurveToRelative(
                    dx1 = 2.375f,
                    dy1 = -0.625f,
                    dx2 = 2.812f,
                    dy2 = 0.312f,
                )
                // s 0.125 1.5 -0.312 3
                reflectiveCurveToRelative(
                    dx1 = 0.125f,
                    dy1 = 1.5f,
                    dx2 = -0.312f,
                    dy2 = 3.0f,
                )
                // s 0.286 2.25 0.987 3.562
                reflectiveCurveToRelative(
                    dx1 = 0.286f,
                    dy1 = 2.25f,
                    dx2 = 0.987f,
                    dy2 = 3.562f,
                )
                // c 0.701 1.312 1.263 2.062 1.263 3
                curveToRelative(
                    dx1 = 0.701f,
                    dy1 = 1.312f,
                    dx2 = 1.263f,
                    dy2 = 2.062f,
                    dx3 = 1.263f,
                    dy3 = 3.0f,
                )
                // s 1 1.875 2.5 0.312
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = 1.875f,
                    dx2 = 2.5f,
                    dy2 = 0.312f,
                )
                // s 2.875 -4.625 3.5 -5.75
                reflectiveCurveToRelative(
                    dx1 = 2.875f,
                    dy1 = -4.625f,
                    dx2 = 3.5f,
                    dy2 = -5.75f,
                )
                // s 1.125 -3.625 1.875 -4.125
                reflectiveCurveToRelative(
                    dx1 = 1.125f,
                    dy1 = -3.625f,
                    dx2 = 1.875f,
                    dy2 = -4.125f,
                )
                // s 1.938 -1.688 1.062 -1.5
                reflectiveCurveToRelative(
                    dx1 = 1.938f,
                    dy1 = -1.688f,
                    dx2 = 1.062f,
                    dy2 = -1.5f,
                )
                // s -2.625 -0.062 -3.062 -1.312
                reflectiveCurveToRelative(
                    dx1 = -2.625f,
                    dy1 = -0.062f,
                    dx2 = -3.062f,
                    dy2 = -1.312f,
                )
                // s -2.312 -3.625 -1.438 -3.875
                reflectiveCurveToRelative(
                    dx1 = -2.312f,
                    dy1 = -3.625f,
                    dx2 = -1.438f,
                    dy2 = -3.875f,
                )
                // s 1.875 1.39 2.25 2.164
                reflectiveCurveToRelative(
                    dx1 = 1.875f,
                    dy1 = 1.39f,
                    dx2 = 2.25f,
                    dy2 = 2.164f,
                )
                // c 0.375 0.774 0.875 1.711 1.625 1.961
                curveToRelative(
                    dx1 = 0.375f,
                    dy1 = 0.774f,
                    dx2 = 0.875f,
                    dy2 = 1.711f,
                    dx3 = 1.625f,
                    dy3 = 1.961f,
                )
                // s 2.375 -1.673 2.875 -1.961
                reflectiveCurveToRelative(
                    dx1 = 2.375f,
                    dy1 = -1.673f,
                    dx2 = 2.875f,
                    dy2 = -1.961f,
                )
                // c 0.5 -0.289 0.125 -1.476 -0.875 -1.351
                curveToRelative(
                    dx1 = 0.5f,
                    dy1 = -0.289f,
                    dx2 = 0.125f,
                    dy2 = -1.476f,
                    dx3 = -0.875f,
                    dy3 = -1.351f,
                )
                // s -2.312 0 -2.312 -0.624
                reflectiveCurveToRelative(
                    dx1 = -2.312f,
                    dy1 = 0.0f,
                    dx2 = -2.312f,
                    dy2 = -0.624f,
                )
                // s 1.25 -1.438 2.25 -1.25
                reflectiveCurveToRelative(
                    dx1 = 1.25f,
                    dy1 = -1.438f,
                    dx2 = 2.25f,
                    dy2 = -1.25f,
                )
                // s 1.75 0.5 2.375 1.25
                reflectiveCurveToRelative(
                    dx1 = 1.75f,
                    dy1 = 0.5f,
                    dx2 = 2.375f,
                    dy2 = 1.25f,
                )
                // s 1.875 2.125 2.375 3
                reflectiveCurveToRelative(
                    dx1 = 1.875f,
                    dy1 = 2.125f,
                    dx2 = 2.375f,
                    dy2 = 3.0f,
                )
                // s 0.875 1 1.125 -0.562
                reflectiveCurveToRelative(
                    dx1 = 0.875f,
                    dy1 = 1.0f,
                    dx2 = 1.125f,
                    dy2 = -0.562f,
                )
                // c 0.166 -1.038 0.387 -1.609 0.59 -2.222
                curveToRelative(
                    dx1 = 0.166f,
                    dy1 = -1.038f,
                    dx2 = 0.387f,
                    dy2 = -1.609f,
                    dx3 = 0.59f,
                    dy3 = -2.222f,
                )
                // c -1.013 -5.829 -4.82 -10.683 -9.999 -13.148z
                curveToRelative(
                    dx1 = -1.013f,
                    dy1 = -5.829f,
                    dx2 = -4.82f,
                    dy2 = -10.683f,
                    dx3 = -9.999f,
                    dy3 = -13.148f,
                )
                close()
            }
        }.build().also { _emoji1f30d = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f30d: ImageVector? = null
