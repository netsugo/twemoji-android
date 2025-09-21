package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f310: ImageVector
    get() {
        val current = _emoji1f310
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f310",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M18 0 C8.059 0 0 8.059 0 18 s8.059 18 18 18 18 -8.059 18 -18 S27.941 0 18 0z M2.05 19 h3.983 c0.092 2.506 0.522 4.871 1.229 7 L4.158 26 c-1.207 -2.083 -1.95 -4.459 -2.108 -7z M19 8 L19 2.081 c2.747 0.436 5.162 2.655 6.799 5.919 L19 8z M26.651 10 c0.754 2.083 1.219 4.46 1.317 7 L19 17 v-7 h7.651z M17 2.081 L17 8 h-6.799 C11.837 4.736 14.253 2.517 17 2.081z M17 10 v7 L8.032 17 c0.098 -2.54 0.563 -4.917 1.317 -7 L17 10z M6.034 17 L2.05 17 c0.158 -2.54 0.901 -4.917 2.107 -7 h3.104 c-0.705 2.129 -1.135 4.495 -1.227 7z M8.032 19 L17 19 v7 L9.349 26 c-0.754 -2.083 -1.219 -4.459 -1.317 -7z M17 28 v5.919 c-2.747 -0.437 -5.163 -2.655 -6.799 -5.919 L17 28z M19 33.919 L19 28 h6.8 c-1.637 3.264 -4.053 5.482 -6.8 5.919z M19 26 v-7 h8.969 c-0.099 2.541 -0.563 4.917 -1.317 7 L19 26z M29.967 19 h3.982 c-0.157 2.541 -0.9 4.917 -2.107 7 h-3.104 c0.706 -2.129 1.136 -4.494 1.229 -7z M29.967 17 c-0.093 -2.505 -0.523 -4.871 -1.229 -7 h3.104 c1.207 2.083 1.95 4.46 2.107 7 h-3.982z M30.479 8 h-2.503 c-0.717 -1.604 -1.606 -3.015 -2.619 -4.199 C27.346 4.833 29.089 6.267 30.479 8z M10.643 3.801 C9.629 4.985 8.74 6.396 8.023 8 L5.521 8 c1.39 -1.733 3.133 -3.166 5.122 -4.199z M5.521 28 h2.503 c0.716 1.604 1.605 3.015 2.619 4.198 C8.654 31.166 6.911 29.733 5.521 28z M25.357 32.198 c1.014 -1.184 1.902 -2.594 2.619 -4.198 h2.503 c-1.39 1.733 -3.133 3.166 -5.122 4.198z
            path(
                fill = SolidColor(Color(0xFF3B88C3)),
            ) {
                // M 18 0
                moveTo(x = 18.0f, y = 0.0f)
                // C 8.059 0 0 8.059 0 18
                curveTo(
                    x1 = 8.059f,
                    y1 = 0.0f,
                    x2 = 0.0f,
                    y2 = 8.059f,
                    x3 = 0.0f,
                    y3 = 18.0f,
                )
                // s 8.059 18 18 18
                reflectiveCurveToRelative(
                    dx1 = 8.059f,
                    dy1 = 18.0f,
                    dx2 = 18.0f,
                    dy2 = 18.0f,
                )
                // s 18 -8.059 18 -18
                reflectiveCurveToRelative(
                    dx1 = 18.0f,
                    dy1 = -8.059f,
                    dx2 = 18.0f,
                    dy2 = -18.0f,
                )
                // S 27.941 0 18 0z
                reflectiveCurveTo(
                    x1 = 27.941f,
                    y1 = 0.0f,
                    x2 = 18.0f,
                    y2 = 0.0f,
                )
                close()
                // M 2.05 19
                moveTo(x = 2.05f, y = 19.0f)
                // h 3.983
                horizontalLineToRelative(dx = 3.983f)
                // c 0.092 2.506 0.522 4.871 1.229 7
                curveToRelative(
                    dx1 = 0.092f,
                    dy1 = 2.506f,
                    dx2 = 0.522f,
                    dy2 = 4.871f,
                    dx3 = 1.229f,
                    dy3 = 7.0f,
                )
                // L 4.158 26
                lineTo(x = 4.158f, y = 26.0f)
                // c -1.207 -2.083 -1.95 -4.459 -2.108 -7z
                curveToRelative(
                    dx1 = -1.207f,
                    dy1 = -2.083f,
                    dx2 = -1.95f,
                    dy2 = -4.459f,
                    dx3 = -2.108f,
                    dy3 = -7.0f,
                )
                close()
                // M 19 8
                moveTo(x = 19.0f, y = 8.0f)
                // L 19 2.081
                lineTo(x = 19.0f, y = 2.081f)
                // c 2.747 0.436 5.162 2.655 6.799 5.919
                curveToRelative(
                    dx1 = 2.747f,
                    dy1 = 0.436f,
                    dx2 = 5.162f,
                    dy2 = 2.655f,
                    dx3 = 6.799f,
                    dy3 = 5.919f,
                )
                // L 19 8z
                lineTo(x = 19.0f, y = 8.0f)
                close()
                // M 26.651 10
                moveTo(x = 26.651f, y = 10.0f)
                // c 0.754 2.083 1.219 4.46 1.317 7
                curveToRelative(
                    dx1 = 0.754f,
                    dy1 = 2.083f,
                    dx2 = 1.219f,
                    dy2 = 4.46f,
                    dx3 = 1.317f,
                    dy3 = 7.0f,
                )
                // L 19 17
                lineTo(x = 19.0f, y = 17.0f)
                // v -7
                verticalLineToRelative(dy = -7.0f)
                // h 7.651z
                horizontalLineToRelative(dx = 7.651f)
                close()
                // M 17 2.081
                moveTo(x = 17.0f, y = 2.081f)
                // L 17 8
                lineTo(x = 17.0f, y = 8.0f)
                // h -6.799
                horizontalLineToRelative(dx = -6.799f)
                // C 11.837 4.736 14.253 2.517 17 2.081z
                curveTo(
                    x1 = 11.837f,
                    y1 = 4.736f,
                    x2 = 14.253f,
                    y2 = 2.517f,
                    x3 = 17.0f,
                    y3 = 2.081f,
                )
                close()
                // M 17 10
                moveTo(x = 17.0f, y = 10.0f)
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // L 8.032 17
                lineTo(x = 8.032f, y = 17.0f)
                // c 0.098 -2.54 0.563 -4.917 1.317 -7
                curveToRelative(
                    dx1 = 0.098f,
                    dy1 = -2.54f,
                    dx2 = 0.563f,
                    dy2 = -4.917f,
                    dx3 = 1.317f,
                    dy3 = -7.0f,
                )
                // L 17 10z
                lineTo(x = 17.0f, y = 10.0f)
                close()
                // M 6.034 17
                moveTo(x = 6.034f, y = 17.0f)
                // L 2.05 17
                lineTo(x = 2.05f, y = 17.0f)
                // c 0.158 -2.54 0.901 -4.917 2.107 -7
                curveToRelative(
                    dx1 = 0.158f,
                    dy1 = -2.54f,
                    dx2 = 0.901f,
                    dy2 = -4.917f,
                    dx3 = 2.107f,
                    dy3 = -7.0f,
                )
                // h 3.104
                horizontalLineToRelative(dx = 3.104f)
                // c -0.705 2.129 -1.135 4.495 -1.227 7z
                curveToRelative(
                    dx1 = -0.705f,
                    dy1 = 2.129f,
                    dx2 = -1.135f,
                    dy2 = 4.495f,
                    dx3 = -1.227f,
                    dy3 = 7.0f,
                )
                close()
                // M 8.032 19
                moveTo(x = 8.032f, y = 19.0f)
                // L 17 19
                lineTo(x = 17.0f, y = 19.0f)
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // L 9.349 26
                lineTo(x = 9.349f, y = 26.0f)
                // c -0.754 -2.083 -1.219 -4.459 -1.317 -7z
                curveToRelative(
                    dx1 = -0.754f,
                    dy1 = -2.083f,
                    dx2 = -1.219f,
                    dy2 = -4.459f,
                    dx3 = -1.317f,
                    dy3 = -7.0f,
                )
                close()
                // M 17 28
                moveTo(x = 17.0f, y = 28.0f)
                // v 5.919
                verticalLineToRelative(dy = 5.919f)
                // c -2.747 -0.437 -5.163 -2.655 -6.799 -5.919
                curveToRelative(
                    dx1 = -2.747f,
                    dy1 = -0.437f,
                    dx2 = -5.163f,
                    dy2 = -2.655f,
                    dx3 = -6.799f,
                    dy3 = -5.919f,
                )
                // L 17 28z
                lineTo(x = 17.0f, y = 28.0f)
                close()
                // M 19 33.919
                moveTo(x = 19.0f, y = 33.919f)
                // L 19 28
                lineTo(x = 19.0f, y = 28.0f)
                // h 6.8
                horizontalLineToRelative(dx = 6.8f)
                // c -1.637 3.264 -4.053 5.482 -6.8 5.919z
                curveToRelative(
                    dx1 = -1.637f,
                    dy1 = 3.264f,
                    dx2 = -4.053f,
                    dy2 = 5.482f,
                    dx3 = -6.8f,
                    dy3 = 5.919f,
                )
                close()
                // M 19 26
                moveTo(x = 19.0f, y = 26.0f)
                // v -7
                verticalLineToRelative(dy = -7.0f)
                // h 8.969
                horizontalLineToRelative(dx = 8.969f)
                // c -0.099 2.541 -0.563 4.917 -1.317 7
                curveToRelative(
                    dx1 = -0.099f,
                    dy1 = 2.541f,
                    dx2 = -0.563f,
                    dy2 = 4.917f,
                    dx3 = -1.317f,
                    dy3 = 7.0f,
                )
                // L 19 26z
                lineTo(x = 19.0f, y = 26.0f)
                close()
                // M 29.967 19
                moveTo(x = 29.967f, y = 19.0f)
                // h 3.982
                horizontalLineToRelative(dx = 3.982f)
                // c -0.157 2.541 -0.9 4.917 -2.107 7
                curveToRelative(
                    dx1 = -0.157f,
                    dy1 = 2.541f,
                    dx2 = -0.9f,
                    dy2 = 4.917f,
                    dx3 = -2.107f,
                    dy3 = 7.0f,
                )
                // h -3.104
                horizontalLineToRelative(dx = -3.104f)
                // c 0.706 -2.129 1.136 -4.494 1.229 -7z
                curveToRelative(
                    dx1 = 0.706f,
                    dy1 = -2.129f,
                    dx2 = 1.136f,
                    dy2 = -4.494f,
                    dx3 = 1.229f,
                    dy3 = -7.0f,
                )
                close()
                // M 29.967 17
                moveTo(x = 29.967f, y = 17.0f)
                // c -0.093 -2.505 -0.523 -4.871 -1.229 -7
                curveToRelative(
                    dx1 = -0.093f,
                    dy1 = -2.505f,
                    dx2 = -0.523f,
                    dy2 = -4.871f,
                    dx3 = -1.229f,
                    dy3 = -7.0f,
                )
                // h 3.104
                horizontalLineToRelative(dx = 3.104f)
                // c 1.207 2.083 1.95 4.46 2.107 7
                curveToRelative(
                    dx1 = 1.207f,
                    dy1 = 2.083f,
                    dx2 = 1.95f,
                    dy2 = 4.46f,
                    dx3 = 2.107f,
                    dy3 = 7.0f,
                )
                // h -3.982z
                horizontalLineToRelative(dx = -3.982f)
                close()
                // M 30.479 8
                moveTo(x = 30.479f, y = 8.0f)
                // h -2.503
                horizontalLineToRelative(dx = -2.503f)
                // c -0.717 -1.604 -1.606 -3.015 -2.619 -4.199
                curveToRelative(
                    dx1 = -0.717f,
                    dy1 = -1.604f,
                    dx2 = -1.606f,
                    dy2 = -3.015f,
                    dx3 = -2.619f,
                    dy3 = -4.199f,
                )
                // C 27.346 4.833 29.089 6.267 30.479 8z
                curveTo(
                    x1 = 27.346f,
                    y1 = 4.833f,
                    x2 = 29.089f,
                    y2 = 6.267f,
                    x3 = 30.479f,
                    y3 = 8.0f,
                )
                close()
                // M 10.643 3.801
                moveTo(x = 10.643f, y = 3.801f)
                // C 9.629 4.985 8.74 6.396 8.023 8
                curveTo(
                    x1 = 9.629f,
                    y1 = 4.985f,
                    x2 = 8.74f,
                    y2 = 6.396f,
                    x3 = 8.023f,
                    y3 = 8.0f,
                )
                // L 5.521 8
                lineTo(x = 5.521f, y = 8.0f)
                // c 1.39 -1.733 3.133 -3.166 5.122 -4.199z
                curveToRelative(
                    dx1 = 1.39f,
                    dy1 = -1.733f,
                    dx2 = 3.133f,
                    dy2 = -3.166f,
                    dx3 = 5.122f,
                    dy3 = -4.199f,
                )
                close()
                // M 5.521 28
                moveTo(x = 5.521f, y = 28.0f)
                // h 2.503
                horizontalLineToRelative(dx = 2.503f)
                // c 0.716 1.604 1.605 3.015 2.619 4.198
                curveToRelative(
                    dx1 = 0.716f,
                    dy1 = 1.604f,
                    dx2 = 1.605f,
                    dy2 = 3.015f,
                    dx3 = 2.619f,
                    dy3 = 4.198f,
                )
                // C 8.654 31.166 6.911 29.733 5.521 28z
                curveTo(
                    x1 = 8.654f,
                    y1 = 31.166f,
                    x2 = 6.911f,
                    y2 = 29.733f,
                    x3 = 5.521f,
                    y3 = 28.0f,
                )
                close()
                // M 25.357 32.198
                moveTo(x = 25.357f, y = 32.198f)
                // c 1.014 -1.184 1.902 -2.594 2.619 -4.198
                curveToRelative(
                    dx1 = 1.014f,
                    dy1 = -1.184f,
                    dx2 = 1.902f,
                    dy2 = -2.594f,
                    dx3 = 2.619f,
                    dy3 = -4.198f,
                )
                // h 2.503
                horizontalLineToRelative(dx = 2.503f)
                // c -1.39 1.733 -3.133 3.166 -5.122 4.198z
                curveToRelative(
                    dx1 = -1.39f,
                    dy1 = 1.733f,
                    dx2 = -3.133f,
                    dy2 = 3.166f,
                    dx3 = -5.122f,
                    dy3 = 4.198f,
                )
                close()
            }
        }.build().also { _emoji1f310 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f310: ImageVector? = null
