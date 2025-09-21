package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f974: ImageVector
    get() {
        val current = _emoji1f974
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f974",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M18 18 m-18 0 a18 18 0 1 1 36 0 a18 18 0 1 1 -36 0
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
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
            // M6.001 11 c-0.552 0 -1 -0.448 -1 -1 0 -0.551 0.445 -0.998 0.996 -1 0.156 -0.002 3.569 -0.086 6.205 -3.6 0.331 -0.44 0.957 -0.532 1.4 -0.2 0.442 0.331 0.531 0.958 0.2 1.4 -3.263 4.35 -7.617 4.4 -7.801 4.4z M30.987 13.393 c0.128 0.537 -0.204 1.077 -0.741 1.205 -0.536 0.128 -1.074 -0.202 -1.204 -0.737 -0.038 -0.151 -0.911 -3.452 -4.941 -5.201 -0.505 -0.22 -0.739 -0.808 -0.519 -1.315 0.22 -0.507 0.809 -0.739 1.315 -0.519 4.989 2.165 6.047 6.388 6.09 6.567z
            path(
                fill = SolidColor(Color(0xFF65471B)),
            ) {
                // M 6.001 11
                moveTo(x = 6.001f, y = 11.0f)
                // c -0.552 0 -1 -0.448 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.448f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // c 0 -0.551 0.445 -0.998 0.996 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.551f,
                    dx2 = 0.445f,
                    dy2 = -0.998f,
                    dx3 = 0.996f,
                    dy3 = -1.0f,
                )
                // c 0.156 -0.002 3.569 -0.086 6.205 -3.6
                curveToRelative(
                    dx1 = 0.156f,
                    dy1 = -0.002f,
                    dx2 = 3.569f,
                    dy2 = -0.086f,
                    dx3 = 6.205f,
                    dy3 = -3.6f,
                )
                // c 0.331 -0.44 0.957 -0.532 1.4 -0.2
                curveToRelative(
                    dx1 = 0.331f,
                    dy1 = -0.44f,
                    dx2 = 0.957f,
                    dy2 = -0.532f,
                    dx3 = 1.4f,
                    dy3 = -0.2f,
                )
                // c 0.442 0.331 0.531 0.958 0.2 1.4
                curveToRelative(
                    dx1 = 0.442f,
                    dy1 = 0.331f,
                    dx2 = 0.531f,
                    dy2 = 0.958f,
                    dx3 = 0.2f,
                    dy3 = 1.4f,
                )
                // c -3.263 4.35 -7.617 4.4 -7.801 4.4z
                curveToRelative(
                    dx1 = -3.263f,
                    dy1 = 4.35f,
                    dx2 = -7.617f,
                    dy2 = 4.4f,
                    dx3 = -7.801f,
                    dy3 = 4.4f,
                )
                close()
                // M 30.987 13.393
                moveTo(x = 30.987f, y = 13.393f)
                // c 0.128 0.537 -0.204 1.077 -0.741 1.205
                curveToRelative(
                    dx1 = 0.128f,
                    dy1 = 0.537f,
                    dx2 = -0.204f,
                    dy2 = 1.077f,
                    dx3 = -0.741f,
                    dy3 = 1.205f,
                )
                // c -0.536 0.128 -1.074 -0.202 -1.204 -0.737
                curveToRelative(
                    dx1 = -0.536f,
                    dy1 = 0.128f,
                    dx2 = -1.074f,
                    dy2 = -0.202f,
                    dx3 = -1.204f,
                    dy3 = -0.737f,
                )
                // c -0.038 -0.151 -0.911 -3.452 -4.941 -5.201
                curveToRelative(
                    dx1 = -0.038f,
                    dy1 = -0.151f,
                    dx2 = -0.911f,
                    dy2 = -3.452f,
                    dx3 = -4.941f,
                    dy3 = -5.201f,
                )
                // c -0.505 -0.22 -0.739 -0.808 -0.519 -1.315
                curveToRelative(
                    dx1 = -0.505f,
                    dy1 = -0.22f,
                    dx2 = -0.739f,
                    dy2 = -0.808f,
                    dx3 = -0.519f,
                    dy3 = -1.315f,
                )
                // c 0.22 -0.507 0.809 -0.739 1.315 -0.519
                curveToRelative(
                    dx1 = 0.22f,
                    dy1 = -0.507f,
                    dx2 = 0.809f,
                    dy2 = -0.739f,
                    dx3 = 1.315f,
                    dy3 = -0.519f,
                )
                // c 4.989 2.165 6.047 6.388 6.09 6.567z
                curveToRelative(
                    dx1 = 4.989f,
                    dy1 = 2.165f,
                    dx2 = 6.047f,
                    dy2 = 6.388f,
                    dx3 = 6.09f,
                    dy3 = 6.567f,
                )
                close()
            }
            // M23.186 29.526 c-0.993 0 -1.952 -0.455 -2.788 -1.339 -2.816 -2.985 -3.569 -2.333 -4.817 -1.251 -0.781 0.679 -1.754 1.523 -3.205 1.523 -2.351 0 -3.969 -2.302 -4.036 -2.4 -0.314 -0.454 -0.2 -1.077 0.254 -1.391 0.451 -0.312 1.074 -0.2 1.39 0.251 0.301 0.429 1.317 1.54 2.393 1.54 0.704 0 1.256 -0.479 1.895 -1.033 1.816 -1.578 3.764 -2.655 7.583 1.388 0.823 0.873 1.452 0.774 1.908 0.592 1.659 -0.665 3.205 -3.698 3.197 -5.15 -0.003 -0.552 0.442 -1.002 0.994 -1.005 h0.006 c0.55 0 0.997 0.444 1 0.995 0.012 2.103 -1.854 5.976 -4.454 7.017 -0.443 0.175 -0.885 0.262 -1.32 0.263z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 23.186 29.526
                moveTo(x = 23.186f, y = 29.526f)
                // c -0.993 0 -1.952 -0.455 -2.788 -1.339
                curveToRelative(
                    dx1 = -0.993f,
                    dy1 = 0.0f,
                    dx2 = -1.952f,
                    dy2 = -0.455f,
                    dx3 = -2.788f,
                    dy3 = -1.339f,
                )
                // c -2.816 -2.985 -3.569 -2.333 -4.817 -1.251
                curveToRelative(
                    dx1 = -2.816f,
                    dy1 = -2.985f,
                    dx2 = -3.569f,
                    dy2 = -2.333f,
                    dx3 = -4.817f,
                    dy3 = -1.251f,
                )
                // c -0.781 0.679 -1.754 1.523 -3.205 1.523
                curveToRelative(
                    dx1 = -0.781f,
                    dy1 = 0.679f,
                    dx2 = -1.754f,
                    dy2 = 1.523f,
                    dx3 = -3.205f,
                    dy3 = 1.523f,
                )
                // c -2.351 0 -3.969 -2.302 -4.036 -2.4
                curveToRelative(
                    dx1 = -2.351f,
                    dy1 = 0.0f,
                    dx2 = -3.969f,
                    dy2 = -2.302f,
                    dx3 = -4.036f,
                    dy3 = -2.4f,
                )
                // c -0.314 -0.454 -0.2 -1.077 0.254 -1.391
                curveToRelative(
                    dx1 = -0.314f,
                    dy1 = -0.454f,
                    dx2 = -0.2f,
                    dy2 = -1.077f,
                    dx3 = 0.254f,
                    dy3 = -1.391f,
                )
                // c 0.451 -0.312 1.074 -0.2 1.39 0.251
                curveToRelative(
                    dx1 = 0.451f,
                    dy1 = -0.312f,
                    dx2 = 1.074f,
                    dy2 = -0.2f,
                    dx3 = 1.39f,
                    dy3 = 0.251f,
                )
                // c 0.301 0.429 1.317 1.54 2.393 1.54
                curveToRelative(
                    dx1 = 0.301f,
                    dy1 = 0.429f,
                    dx2 = 1.317f,
                    dy2 = 1.54f,
                    dx3 = 2.393f,
                    dy3 = 1.54f,
                )
                // c 0.704 0 1.256 -0.479 1.895 -1.033
                curveToRelative(
                    dx1 = 0.704f,
                    dy1 = 0.0f,
                    dx2 = 1.256f,
                    dy2 = -0.479f,
                    dx3 = 1.895f,
                    dy3 = -1.033f,
                )
                // c 1.816 -1.578 3.764 -2.655 7.583 1.388
                curveToRelative(
                    dx1 = 1.816f,
                    dy1 = -1.578f,
                    dx2 = 3.764f,
                    dy2 = -2.655f,
                    dx3 = 7.583f,
                    dy3 = 1.388f,
                )
                // c 0.823 0.873 1.452 0.774 1.908 0.592
                curveToRelative(
                    dx1 = 0.823f,
                    dy1 = 0.873f,
                    dx2 = 1.452f,
                    dy2 = 0.774f,
                    dx3 = 1.908f,
                    dy3 = 0.592f,
                )
                // c 1.659 -0.665 3.205 -3.698 3.197 -5.15
                curveToRelative(
                    dx1 = 1.659f,
                    dy1 = -0.665f,
                    dx2 = 3.205f,
                    dy2 = -3.698f,
                    dx3 = 3.197f,
                    dy3 = -5.15f,
                )
                // c -0.003 -0.552 0.442 -1.002 0.994 -1.005
                curveToRelative(
                    dx1 = -0.003f,
                    dy1 = -0.552f,
                    dx2 = 0.442f,
                    dy2 = -1.002f,
                    dx3 = 0.994f,
                    dy3 = -1.005f,
                )
                // h 0.006
                horizontalLineToRelative(dx = 0.006f)
                // c 0.55 0 0.997 0.444 1 0.995
                curveToRelative(
                    dx1 = 0.55f,
                    dy1 = 0.0f,
                    dx2 = 0.997f,
                    dy2 = 0.444f,
                    dx3 = 1.0f,
                    dy3 = 0.995f,
                )
                // c 0.012 2.103 -1.854 5.976 -4.454 7.017
                curveToRelative(
                    dx1 = 0.012f,
                    dy1 = 2.103f,
                    dx2 = -1.854f,
                    dy2 = 5.976f,
                    dx3 = -4.454f,
                    dy3 = 7.017f,
                )
                // c -0.443 0.175 -0.885 0.262 -1.32 0.263z
                curveToRelative(
                    dx1 = -0.443f,
                    dy1 = 0.175f,
                    dx2 = -0.885f,
                    dy2 = 0.262f,
                    dx3 = -1.32f,
                    dy3 = 0.263f,
                )
                close()
            }
            // M14.815 15.375 c-0.584 2.114 -1.642 3.083 -3.152 2.666 -1.509 -0.417 -2.343 -1.909 -1.76 -4.023 0.583 -2.112 2.175 -3.363 3.684 -2.946 1.511 0.417 1.812 2.19 1.228 4.303z M26.231 14.62 c0.473 2.141 -0.675 4.838 -2.204 5.176 s-3.28 -1.719 -3.753 -3.86 c-0.473 -2.14 0.419 -3.971 1.948 -4.309 s3.536 0.853 4.009 2.993z
            path(
                fill = SolidColor(Color(0xFF65471B)),
            ) {
                // M 14.815 15.375
                moveTo(x = 14.815f, y = 15.375f)
                // c -0.584 2.114 -1.642 3.083 -3.152 2.666
                curveToRelative(
                    dx1 = -0.584f,
                    dy1 = 2.114f,
                    dx2 = -1.642f,
                    dy2 = 3.083f,
                    dx3 = -3.152f,
                    dy3 = 2.666f,
                )
                // c -1.509 -0.417 -2.343 -1.909 -1.76 -4.023
                curveToRelative(
                    dx1 = -1.509f,
                    dy1 = -0.417f,
                    dx2 = -2.343f,
                    dy2 = -1.909f,
                    dx3 = -1.76f,
                    dy3 = -4.023f,
                )
                // c 0.583 -2.112 2.175 -3.363 3.684 -2.946
                curveToRelative(
                    dx1 = 0.583f,
                    dy1 = -2.112f,
                    dx2 = 2.175f,
                    dy2 = -3.363f,
                    dx3 = 3.684f,
                    dy3 = -2.946f,
                )
                // c 1.511 0.417 1.812 2.19 1.228 4.303z
                curveToRelative(
                    dx1 = 1.511f,
                    dy1 = 0.417f,
                    dx2 = 1.812f,
                    dy2 = 2.19f,
                    dx3 = 1.228f,
                    dy3 = 4.303f,
                )
                close()
                // M 26.231 14.62
                moveTo(x = 26.231f, y = 14.62f)
                // c 0.473 2.141 -0.675 4.838 -2.204 5.176
                curveToRelative(
                    dx1 = 0.473f,
                    dy1 = 2.141f,
                    dx2 = -0.675f,
                    dy2 = 4.838f,
                    dx3 = -2.204f,
                    dy3 = 5.176f,
                )
                // s -3.28 -1.719 -3.753 -3.86
                reflectiveCurveToRelative(
                    dx1 = -3.28f,
                    dy1 = -1.719f,
                    dx2 = -3.753f,
                    dy2 = -3.86f,
                )
                // c -0.473 -2.14 0.419 -3.971 1.948 -4.309
                curveToRelative(
                    dx1 = -0.473f,
                    dy1 = -2.14f,
                    dx2 = 0.419f,
                    dy2 = -3.971f,
                    dx3 = 1.948f,
                    dy3 = -4.309f,
                )
                // s 3.536 0.853 4.009 2.993z
                reflectiveCurveToRelative(
                    dx1 = 3.536f,
                    dy1 = 0.853f,
                    dx2 = 4.009f,
                    dy2 = 2.993f,
                )
                close()
            }
        }.build().also { _emoji1f974 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f974: ImageVector? = null
