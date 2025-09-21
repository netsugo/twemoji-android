package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji263a: ImageVector
    get() {
        val current = _emoji263a
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji263a",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 18 c0 9.941 -8.059 18 -18 18 -9.94 0 -18 -8.059 -18 -18 C0 8.06 8.06 0 18 0 c9.941 0 18 8.06 18 18
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 36 18
                moveTo(x = 36.0f, y = 18.0f)
                // c 0 9.941 -8.059 18 -18 18
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 9.941f,
                    dx2 = -8.059f,
                    dy2 = 18.0f,
                    dx3 = -18.0f,
                    dy3 = 18.0f,
                )
                // c -9.94 0 -18 -8.059 -18 -18
                curveToRelative(
                    dx1 = -9.94f,
                    dy1 = 0.0f,
                    dx2 = -18.0f,
                    dy2 = -8.059f,
                    dx3 = -18.0f,
                    dy3 = -18.0f,
                )
                // C 0 8.06 8.06 0 18 0
                curveTo(
                    x1 = 0.0f,
                    y1 = 8.06f,
                    x2 = 8.06f,
                    y2 = 0.0f,
                    x3 = 18.0f,
                    y3 = 0.0f,
                )
                // c 9.941 0 18 8.06 18 18
                curveToRelative(
                    dx1 = 9.941f,
                    dy1 = 0.0f,
                    dx2 = 18.0f,
                    dy2 = 8.06f,
                    dx3 = 18.0f,
                    dy3 = 18.0f,
                )
            }
            // M29 22 m-5 0 a5 5 0 1 1 10 0 a5 5 0 1 1 -10 0
            path(
                fill = SolidColor(Color(0xFFFF7892)),
            ) {
                // M 29 22
                moveTo(x = 29.0f, y = 22.0f)
                // m -5 0
                moveToRelative(dx = -5.0f, dy = 0.0f)
                // a 5 5 0 1 1 10 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 10.0f,
                    dy1 = 0.0f,
                )
                // a 5 5 0 1 1 -10 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -10.0f,
                    dy1 = 0.0f,
                )
            }
            // M7 22 m-5 0 a5 5 0 1 1 10 0 a5 5 0 1 1 -10 0
            path(
                fill = SolidColor(Color(0xFFFF7892)),
            ) {
                // M 7 22
                moveTo(x = 7.0f, y = 22.0f)
                // m -5 0
                moveToRelative(dx = -5.0f, dy = 0.0f)
                // a 5 5 0 1 1 10 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 10.0f,
                    dy1 = 0.0f,
                )
                // a 5 5 0 1 1 -10 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -10.0f,
                    dy1 = 0.0f,
                )
            }
            // M29 14 c-0.256 0 -0.512 -0.098 -0.707 -0.293 -2.577 -2.575 -7.055 -1.736 -7.099 -1.726 -0.548 0.109 -1.067 -0.247 -1.174 -0.787 -0.107 -0.541 0.242 -1.066 0.783 -1.174 0.227 -0.046 5.563 -1.065 8.903 2.273 0.391 0.391 0.391 1.023 0 1.414 -0.194 0.195 -0.45 0.293 -0.706 0.293z M7 14 c-0.256 0 -0.512 -0.098 -0.707 -0.293 -0.391 -0.391 -0.391 -1.023 0 -1.414 3.34 -3.341 8.678 -2.318 8.903 -2.273 0.542 0.108 0.893 0.635 0.784 1.177 -0.108 0.54 -0.633 0.892 -1.175 0.785 -0.069 -0.015 -4.529 -0.843 -7.098 1.726 -0.195 0.194 -0.451 0.292 -0.707 0.292z M26 19 c-0.256 0 -0.512 -0.098 -0.707 -0.293 -1.304 -1.305 -4.09 -0.974 -5.052 -0.736 -0.54 0.132 -1.077 -0.195 -1.211 -0.73 -0.133 -0.536 0.192 -1.077 0.728 -1.211 0.186 -0.046 4.575 -1.111 6.949 1.263 0.391 0.391 0.391 1.023 0 1.414 -0.195 0.195 -0.451 0.293 -0.707 0.293z M10 19 c-0.256 0 -0.512 -0.098 -0.707 -0.293 -0.391 -0.391 -0.391 -1.023 0 -1.414 2.373 -2.373 6.764 -1.309 6.95 -1.263 0.535 0.134 0.86 0.675 0.727 1.211 -0.132 0.536 -0.673 0.863 -1.21 0.73 -0.964 -0.237 -3.749 -0.567 -5.052 0.736 -0.196 0.195 -0.452 0.293 -0.708 0.293z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 29 14
                moveTo(x = 29.0f, y = 14.0f)
                // c -0.256 0 -0.512 -0.098 -0.707 -0.293
                curveToRelative(
                    dx1 = -0.256f,
                    dy1 = 0.0f,
                    dx2 = -0.512f,
                    dy2 = -0.098f,
                    dx3 = -0.707f,
                    dy3 = -0.293f,
                )
                // c -2.577 -2.575 -7.055 -1.736 -7.099 -1.726
                curveToRelative(
                    dx1 = -2.577f,
                    dy1 = -2.575f,
                    dx2 = -7.055f,
                    dy2 = -1.736f,
                    dx3 = -7.099f,
                    dy3 = -1.726f,
                )
                // c -0.548 0.109 -1.067 -0.247 -1.174 -0.787
                curveToRelative(
                    dx1 = -0.548f,
                    dy1 = 0.109f,
                    dx2 = -1.067f,
                    dy2 = -0.247f,
                    dx3 = -1.174f,
                    dy3 = -0.787f,
                )
                // c -0.107 -0.541 0.242 -1.066 0.783 -1.174
                curveToRelative(
                    dx1 = -0.107f,
                    dy1 = -0.541f,
                    dx2 = 0.242f,
                    dy2 = -1.066f,
                    dx3 = 0.783f,
                    dy3 = -1.174f,
                )
                // c 0.227 -0.046 5.563 -1.065 8.903 2.273
                curveToRelative(
                    dx1 = 0.227f,
                    dy1 = -0.046f,
                    dx2 = 5.563f,
                    dy2 = -1.065f,
                    dx3 = 8.903f,
                    dy3 = 2.273f,
                )
                // c 0.391 0.391 0.391 1.023 0 1.414
                curveToRelative(
                    dx1 = 0.391f,
                    dy1 = 0.391f,
                    dx2 = 0.391f,
                    dy2 = 1.023f,
                    dx3 = 0.0f,
                    dy3 = 1.414f,
                )
                // c -0.194 0.195 -0.45 0.293 -0.706 0.293z
                curveToRelative(
                    dx1 = -0.194f,
                    dy1 = 0.195f,
                    dx2 = -0.45f,
                    dy2 = 0.293f,
                    dx3 = -0.706f,
                    dy3 = 0.293f,
                )
                close()
                // M 7 14
                moveTo(x = 7.0f, y = 14.0f)
                // c -0.256 0 -0.512 -0.098 -0.707 -0.293
                curveToRelative(
                    dx1 = -0.256f,
                    dy1 = 0.0f,
                    dx2 = -0.512f,
                    dy2 = -0.098f,
                    dx3 = -0.707f,
                    dy3 = -0.293f,
                )
                // c -0.391 -0.391 -0.391 -1.023 0 -1.414
                curveToRelative(
                    dx1 = -0.391f,
                    dy1 = -0.391f,
                    dx2 = -0.391f,
                    dy2 = -1.023f,
                    dx3 = 0.0f,
                    dy3 = -1.414f,
                )
                // c 3.34 -3.341 8.678 -2.318 8.903 -2.273
                curveToRelative(
                    dx1 = 3.34f,
                    dy1 = -3.341f,
                    dx2 = 8.678f,
                    dy2 = -2.318f,
                    dx3 = 8.903f,
                    dy3 = -2.273f,
                )
                // c 0.542 0.108 0.893 0.635 0.784 1.177
                curveToRelative(
                    dx1 = 0.542f,
                    dy1 = 0.108f,
                    dx2 = 0.893f,
                    dy2 = 0.635f,
                    dx3 = 0.784f,
                    dy3 = 1.177f,
                )
                // c -0.108 0.54 -0.633 0.892 -1.175 0.785
                curveToRelative(
                    dx1 = -0.108f,
                    dy1 = 0.54f,
                    dx2 = -0.633f,
                    dy2 = 0.892f,
                    dx3 = -1.175f,
                    dy3 = 0.785f,
                )
                // c -0.069 -0.015 -4.529 -0.843 -7.098 1.726
                curveToRelative(
                    dx1 = -0.069f,
                    dy1 = -0.015f,
                    dx2 = -4.529f,
                    dy2 = -0.843f,
                    dx3 = -7.098f,
                    dy3 = 1.726f,
                )
                // c -0.195 0.194 -0.451 0.292 -0.707 0.292z
                curveToRelative(
                    dx1 = -0.195f,
                    dy1 = 0.194f,
                    dx2 = -0.451f,
                    dy2 = 0.292f,
                    dx3 = -0.707f,
                    dy3 = 0.292f,
                )
                close()
                // M 26 19
                moveTo(x = 26.0f, y = 19.0f)
                // c -0.256 0 -0.512 -0.098 -0.707 -0.293
                curveToRelative(
                    dx1 = -0.256f,
                    dy1 = 0.0f,
                    dx2 = -0.512f,
                    dy2 = -0.098f,
                    dx3 = -0.707f,
                    dy3 = -0.293f,
                )
                // c -1.304 -1.305 -4.09 -0.974 -5.052 -0.736
                curveToRelative(
                    dx1 = -1.304f,
                    dy1 = -1.305f,
                    dx2 = -4.09f,
                    dy2 = -0.974f,
                    dx3 = -5.052f,
                    dy3 = -0.736f,
                )
                // c -0.54 0.132 -1.077 -0.195 -1.211 -0.73
                curveToRelative(
                    dx1 = -0.54f,
                    dy1 = 0.132f,
                    dx2 = -1.077f,
                    dy2 = -0.195f,
                    dx3 = -1.211f,
                    dy3 = -0.73f,
                )
                // c -0.133 -0.536 0.192 -1.077 0.728 -1.211
                curveToRelative(
                    dx1 = -0.133f,
                    dy1 = -0.536f,
                    dx2 = 0.192f,
                    dy2 = -1.077f,
                    dx3 = 0.728f,
                    dy3 = -1.211f,
                )
                // c 0.186 -0.046 4.575 -1.111 6.949 1.263
                curveToRelative(
                    dx1 = 0.186f,
                    dy1 = -0.046f,
                    dx2 = 4.575f,
                    dy2 = -1.111f,
                    dx3 = 6.949f,
                    dy3 = 1.263f,
                )
                // c 0.391 0.391 0.391 1.023 0 1.414
                curveToRelative(
                    dx1 = 0.391f,
                    dy1 = 0.391f,
                    dx2 = 0.391f,
                    dy2 = 1.023f,
                    dx3 = 0.0f,
                    dy3 = 1.414f,
                )
                // c -0.195 0.195 -0.451 0.293 -0.707 0.293z
                curveToRelative(
                    dx1 = -0.195f,
                    dy1 = 0.195f,
                    dx2 = -0.451f,
                    dy2 = 0.293f,
                    dx3 = -0.707f,
                    dy3 = 0.293f,
                )
                close()
                // M 10 19
                moveTo(x = 10.0f, y = 19.0f)
                // c -0.256 0 -0.512 -0.098 -0.707 -0.293
                curveToRelative(
                    dx1 = -0.256f,
                    dy1 = 0.0f,
                    dx2 = -0.512f,
                    dy2 = -0.098f,
                    dx3 = -0.707f,
                    dy3 = -0.293f,
                )
                // c -0.391 -0.391 -0.391 -1.023 0 -1.414
                curveToRelative(
                    dx1 = -0.391f,
                    dy1 = -0.391f,
                    dx2 = -0.391f,
                    dy2 = -1.023f,
                    dx3 = 0.0f,
                    dy3 = -1.414f,
                )
                // c 2.373 -2.373 6.764 -1.309 6.95 -1.263
                curveToRelative(
                    dx1 = 2.373f,
                    dy1 = -2.373f,
                    dx2 = 6.764f,
                    dy2 = -1.309f,
                    dx3 = 6.95f,
                    dy3 = -1.263f,
                )
                // c 0.535 0.134 0.86 0.675 0.727 1.211
                curveToRelative(
                    dx1 = 0.535f,
                    dy1 = 0.134f,
                    dx2 = 0.86f,
                    dy2 = 0.675f,
                    dx3 = 0.727f,
                    dy3 = 1.211f,
                )
                // c -0.132 0.536 -0.673 0.863 -1.21 0.73
                curveToRelative(
                    dx1 = -0.132f,
                    dy1 = 0.536f,
                    dx2 = -0.673f,
                    dy2 = 0.863f,
                    dx3 = -1.21f,
                    dy3 = 0.73f,
                )
                // c -0.964 -0.237 -3.749 -0.567 -5.052 0.736
                curveToRelative(
                    dx1 = -0.964f,
                    dy1 = -0.237f,
                    dx2 = -3.749f,
                    dy2 = -0.567f,
                    dx3 = -5.052f,
                    dy3 = 0.736f,
                )
                // c -0.196 0.195 -0.452 0.293 -0.708 0.293z
                curveToRelative(
                    dx1 = -0.196f,
                    dy1 = 0.195f,
                    dx2 = -0.452f,
                    dy2 = 0.293f,
                    dx3 = -0.708f,
                    dy3 = 0.293f,
                )
                close()
            }
            // M13 25 s1 4 5 4 5 -4 5 -4 -1 1 -5 1 -5 -1 -5 -1z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 13 25
                moveTo(x = 13.0f, y = 25.0f)
                // s 1 4 5 4
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = 4.0f,
                    dx2 = 5.0f,
                    dy2 = 4.0f,
                )
                // s 5 -4 5 -4
                reflectiveCurveToRelative(
                    dx1 = 5.0f,
                    dy1 = -4.0f,
                    dx2 = 5.0f,
                    dy2 = -4.0f,
                )
                // s -1 1 -5 1
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                    dx2 = -5.0f,
                    dy2 = 1.0f,
                )
                // s -5 -1 -5 -1z
                reflectiveCurveToRelative(
                    dx1 = -5.0f,
                    dy1 = -1.0f,
                    dx2 = -5.0f,
                    dy2 = -1.0f,
                )
                close()
            }
            // M18 29.5 c-4.34 0 -5.474 -4.335 -5.485 -4.379 -0.055 -0.218 0.043 -0.445 0.238 -0.557 0.191 -0.106 0.43 -0.079 0.591 0.072 0.039 0.034 1.066 0.864 4.656 0.864 3.644 0 4.647 -0.855 4.657 -0.863 0.165 -0.146 0.409 -0.171 0.597 -0.06 0.188 0.113 0.284 0.331 0.231 0.544 -0.011 0.044 -1.145 4.379 -5.485 4.379z M13.949 26.008 C14.526 27.072 15.724 28.5 18 28.5 s3.475 -1.428 4.051 -2.492 c-0.82 0.258 -2.101 0.492 -4.051 0.492 s-3.231 -0.234 -4.051 -0.492z M13 25 h0.01 L13 25z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 18 29.5
                moveTo(x = 18.0f, y = 29.5f)
                // c -4.34 0 -5.474 -4.335 -5.485 -4.379
                curveToRelative(
                    dx1 = -4.34f,
                    dy1 = 0.0f,
                    dx2 = -5.474f,
                    dy2 = -4.335f,
                    dx3 = -5.485f,
                    dy3 = -4.379f,
                )
                // c -0.055 -0.218 0.043 -0.445 0.238 -0.557
                curveToRelative(
                    dx1 = -0.055f,
                    dy1 = -0.218f,
                    dx2 = 0.043f,
                    dy2 = -0.445f,
                    dx3 = 0.238f,
                    dy3 = -0.557f,
                )
                // c 0.191 -0.106 0.43 -0.079 0.591 0.072
                curveToRelative(
                    dx1 = 0.191f,
                    dy1 = -0.106f,
                    dx2 = 0.43f,
                    dy2 = -0.079f,
                    dx3 = 0.591f,
                    dy3 = 0.072f,
                )
                // c 0.039 0.034 1.066 0.864 4.656 0.864
                curveToRelative(
                    dx1 = 0.039f,
                    dy1 = 0.034f,
                    dx2 = 1.066f,
                    dy2 = 0.864f,
                    dx3 = 4.656f,
                    dy3 = 0.864f,
                )
                // c 3.644 0 4.647 -0.855 4.657 -0.863
                curveToRelative(
                    dx1 = 3.644f,
                    dy1 = 0.0f,
                    dx2 = 4.647f,
                    dy2 = -0.855f,
                    dx3 = 4.657f,
                    dy3 = -0.863f,
                )
                // c 0.165 -0.146 0.409 -0.171 0.597 -0.06
                curveToRelative(
                    dx1 = 0.165f,
                    dy1 = -0.146f,
                    dx2 = 0.409f,
                    dy2 = -0.171f,
                    dx3 = 0.597f,
                    dy3 = -0.06f,
                )
                // c 0.188 0.113 0.284 0.331 0.231 0.544
                curveToRelative(
                    dx1 = 0.188f,
                    dy1 = 0.113f,
                    dx2 = 0.284f,
                    dy2 = 0.331f,
                    dx3 = 0.231f,
                    dy3 = 0.544f,
                )
                // c -0.011 0.044 -1.145 4.379 -5.485 4.379z
                curveToRelative(
                    dx1 = -0.011f,
                    dy1 = 0.044f,
                    dx2 = -1.145f,
                    dy2 = 4.379f,
                    dx3 = -5.485f,
                    dy3 = 4.379f,
                )
                close()
                // M 13.949 26.008
                moveTo(x = 13.949f, y = 26.008f)
                // C 14.526 27.072 15.724 28.5 18 28.5
                curveTo(
                    x1 = 14.526f,
                    y1 = 27.072f,
                    x2 = 15.724f,
                    y2 = 28.5f,
                    x3 = 18.0f,
                    y3 = 28.5f,
                )
                // s 3.475 -1.428 4.051 -2.492
                reflectiveCurveToRelative(
                    dx1 = 3.475f,
                    dy1 = -1.428f,
                    dx2 = 4.051f,
                    dy2 = -2.492f,
                )
                // c -0.82 0.258 -2.101 0.492 -4.051 0.492
                curveToRelative(
                    dx1 = -0.82f,
                    dy1 = 0.258f,
                    dx2 = -2.101f,
                    dy2 = 0.492f,
                    dx3 = -4.051f,
                    dy3 = 0.492f,
                )
                // s -3.231 -0.234 -4.051 -0.492z
                reflectiveCurveToRelative(
                    dx1 = -3.231f,
                    dy1 = -0.234f,
                    dx2 = -4.051f,
                    dy2 = -0.492f,
                )
                close()
                // M 13 25
                moveTo(x = 13.0f, y = 25.0f)
                // h 0.01
                horizontalLineToRelative(dx = 0.01f)
                // L 13 25z
                lineTo(x = 13.0f, y = 25.0f)
                close()
            }
        }.build().also { _emoji263a = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji263a: ImageVector? = null
