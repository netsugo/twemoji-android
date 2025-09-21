package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f3d6: ImageVector
    get() {
        val current = _emoji1f3d6
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f3d6",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M0 30.54 a18 5.36 0 1 0 36 0 a18 5.36 0 1 0 -36 0z
            path(
                fill = SolidColor(Color(0xFF3B88C3)),
            ) {
                // M 0 30.54
                moveTo(x = 0.0f, y = 30.54f)
                // a 18 5.36 0 1 0 36 0
                arcToRelative(
                    a = 18.0f,
                    b = 5.36f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 36.0f,
                    dy1 = 0.0f,
                )
                // a 18 5.36 0 1 0 -36 0z
                arcToRelative(
                    a = 18.0f,
                    b = 5.36f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -36.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M33.813 28.538 c0 1.616 -2.5 2.587 -14.482 2.587 -10.925 0 -13.612 -0.971 -13.612 -2.587 s5.683 -2.926 13.612 -2.926 14.482 1.31 14.482 2.926z
            path(
                fill = SolidColor(Color(0xFF88C9F9)),
            ) {
                // M 33.813 28.538
                moveTo(x = 33.813f, y = 28.538f)
                // c 0 1.616 -2.5 2.587 -14.482 2.587
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.616f,
                    dx2 = -2.5f,
                    dy2 = 2.587f,
                    dx3 = -14.482f,
                    dy3 = 2.587f,
                )
                // c -10.925 0 -13.612 -0.971 -13.612 -2.587
                curveToRelative(
                    dx1 = -10.925f,
                    dy1 = 0.0f,
                    dx2 = -13.612f,
                    dy2 = -0.971f,
                    dx3 = -13.612f,
                    dy3 = -2.587f,
                )
                // s 5.683 -2.926 13.612 -2.926
                reflectiveCurveToRelative(
                    dx1 = 5.683f,
                    dy1 = -2.926f,
                    dx2 = 13.612f,
                    dy2 = -2.926f,
                )
                // s 14.482 1.31 14.482 2.926z
                reflectiveCurveToRelative(
                    dx1 = 14.482f,
                    dy1 = 1.31f,
                    dx2 = 14.482f,
                    dy2 = 2.926f,
                )
                close()
            }
            // M7 28.25 c0 -1 1 -5 11 -5 12 0 15 4 15 5 s0 2 -14 2 c-12 0 -12 -1 -12 -2z
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 7 28.25
                moveTo(x = 7.0f, y = 28.25f)
                // c 0 -1 1 -5 11 -5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -5.0f,
                    dx3 = 11.0f,
                    dy3 = -5.0f,
                )
                // c 12 0 15 4 15 5
                curveToRelative(
                    dx1 = 12.0f,
                    dy1 = 0.0f,
                    dx2 = 15.0f,
                    dy2 = 4.0f,
                    dx3 = 15.0f,
                    dy3 = 5.0f,
                )
                // s 0 2 -14 2
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                    dx2 = -14.0f,
                    dy2 = 2.0f,
                )
                // c -12 0 -12 -1 -12 -2z
                curveToRelative(
                    dx1 = -12.0f,
                    dy1 = 0.0f,
                    dx2 = -12.0f,
                    dy2 = -1.0f,
                    dx3 = -12.0f,
                    dy3 = -2.0f,
                )
                close()
            }
            // M20.62 27.667 c-0.15 0.692 -0.835 1.133 -1.527 0.982 -0.693 -0.15 -1.133 -0.834 -0.983 -1.527 l5.083 -25.985 c0.15 -0.693 0.834 -1.132 1.527 -0.982 0.691 0.15 1.133 0.834 0.981 1.527 L20.62 27.667z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 20.62 27.667
                moveTo(x = 20.62f, y = 27.667f)
                // c -0.15 0.692 -0.835 1.133 -1.527 0.982
                curveToRelative(
                    dx1 = -0.15f,
                    dy1 = 0.692f,
                    dx2 = -0.835f,
                    dy2 = 1.133f,
                    dx3 = -1.527f,
                    dy3 = 0.982f,
                )
                // c -0.693 -0.15 -1.133 -0.834 -0.983 -1.527
                curveToRelative(
                    dx1 = -0.693f,
                    dy1 = -0.15f,
                    dx2 = -1.133f,
                    dy2 = -0.834f,
                    dx3 = -0.983f,
                    dy3 = -1.527f,
                )
                // l 5.083 -25.985
                lineToRelative(dx = 5.083f, dy = -25.985f)
                // c 0.15 -0.693 0.834 -1.132 1.527 -0.982
                curveToRelative(
                    dx1 = 0.15f,
                    dy1 = -0.693f,
                    dx2 = 0.834f,
                    dy2 = -1.132f,
                    dx3 = 1.527f,
                    dy3 = -0.982f,
                )
                // c 0.691 0.15 1.133 0.834 0.981 1.527
                curveToRelative(
                    dx1 = 0.691f,
                    dy1 = 0.15f,
                    dx2 = 1.133f,
                    dy2 = 0.834f,
                    dx3 = 0.981f,
                    dy3 = 1.527f,
                )
                // L 20.62 27.667z
                lineTo(x = 20.62f, y = 27.667f)
                close()
            }
            // M24.358 1.827 C16.736 0.173 9.501 3.7 8.198 9.705 c0 0 -0.363 1.672 0.474 1.854 0.836 0.182 2.872 -1.128 2.872 -1.128 l20.908 4.538 s1.309 2.036 2.146 2.218 c0.837 0.182 1.199 -1.491 1.199 -1.491 C37.101 9.69 31.979 3.481 24.358 1.827z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 24.358 1.827
                moveTo(x = 24.358f, y = 1.827f)
                // C 16.736 0.173 9.501 3.7 8.198 9.705
                curveTo(
                    x1 = 16.736f,
                    y1 = 0.173f,
                    x2 = 9.501f,
                    y2 = 3.7f,
                    x3 = 8.198f,
                    y3 = 9.705f,
                )
                // c 0 0 -0.363 1.672 0.474 1.854
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -0.363f,
                    dy2 = 1.672f,
                    dx3 = 0.474f,
                    dy3 = 1.854f,
                )
                // c 0.836 0.182 2.872 -1.128 2.872 -1.128
                curveToRelative(
                    dx1 = 0.836f,
                    dy1 = 0.182f,
                    dx2 = 2.872f,
                    dy2 = -1.128f,
                    dx3 = 2.872f,
                    dy3 = -1.128f,
                )
                // l 20.908 4.538
                lineToRelative(dx = 20.908f, dy = 4.538f)
                // s 1.309 2.036 2.146 2.218
                reflectiveCurveToRelative(
                    dx1 = 1.309f,
                    dy1 = 2.036f,
                    dx2 = 2.146f,
                    dy2 = 2.218f,
                )
                // c 0.837 0.182 1.199 -1.491 1.199 -1.491
                curveToRelative(
                    dx1 = 0.837f,
                    dy1 = 0.182f,
                    dx2 = 1.199f,
                    dy2 = -1.491f,
                    dx3 = 1.199f,
                    dy3 = -1.491f,
                )
                // C 37.101 9.69 31.979 3.481 24.358 1.827z
                curveTo(
                    x1 = 37.101f,
                    y1 = 9.69f,
                    x2 = 31.979f,
                    y2 = 3.481f,
                    x3 = 24.358f,
                    y3 = 1.827f,
                )
                close()
            }
            // M24.358 1.827 C18.584 0.574 12.847 4.426 11.544 10.43 c0 0 -0.363 1.673 1.31 2.036 1.673 0.364 4.545 -0.765 4.545 -0.765 l9.199 1.997 s2.146 2.217 3.819 2.581 c1.673 0.362 2.035 -1.311 2.035 -1.311 1.303 -6.004 -2.321 -11.888 -8.094 -13.141z
            path(
                fill = SolidColor(Color(0xFFFFE8B6)),
            ) {
                // M 24.358 1.827
                moveTo(x = 24.358f, y = 1.827f)
                // C 18.584 0.574 12.847 4.426 11.544 10.43
                curveTo(
                    x1 = 18.584f,
                    y1 = 0.574f,
                    x2 = 12.847f,
                    y2 = 4.426f,
                    x3 = 11.544f,
                    y3 = 10.43f,
                )
                // c 0 0 -0.363 1.673 1.31 2.036
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -0.363f,
                    dy2 = 1.673f,
                    dx3 = 1.31f,
                    dy3 = 2.036f,
                )
                // c 1.673 0.364 4.545 -0.765 4.545 -0.765
                curveToRelative(
                    dx1 = 1.673f,
                    dy1 = 0.364f,
                    dx2 = 4.545f,
                    dy2 = -0.765f,
                    dx3 = 4.545f,
                    dy3 = -0.765f,
                )
                // l 9.199 1.997
                lineToRelative(dx = 9.199f, dy = 1.997f)
                // s 2.146 2.217 3.819 2.581
                reflectiveCurveToRelative(
                    dx1 = 2.146f,
                    dy1 = 2.217f,
                    dx2 = 3.819f,
                    dy2 = 2.581f,
                )
                // c 1.673 0.362 2.035 -1.311 2.035 -1.311
                curveToRelative(
                    dx1 = 1.673f,
                    dy1 = 0.362f,
                    dx2 = 2.035f,
                    dy2 = -1.311f,
                    dx3 = 2.035f,
                    dy3 = -1.311f,
                )
                // c 1.303 -6.004 -2.321 -11.888 -8.094 -13.141z
                curveToRelative(
                    dx1 = 1.303f,
                    dy1 = -6.004f,
                    dx2 = -2.321f,
                    dy2 = -11.888f,
                    dx3 = -8.094f,
                    dy3 = -13.141f,
                )
                close()
            }
            // M24.358 1.827 c-3.003 -0.651 -5.657 3.87 -6.96 9.874 0 0 2.146 2.218 3.818 2.58 l0.837 0.183 c1.673 0.362 4.544 -0.766 4.544 -0.766 1.304 -6.004 0.764 -11.219 -2.239 -11.871z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 24.358 1.827
                moveTo(x = 24.358f, y = 1.827f)
                // c -3.003 -0.651 -5.657 3.87 -6.96 9.874
                curveToRelative(
                    dx1 = -3.003f,
                    dy1 = -0.651f,
                    dx2 = -5.657f,
                    dy2 = 3.87f,
                    dx3 = -6.96f,
                    dy3 = 9.874f,
                )
                // c 0 0 2.146 2.218 3.818 2.58
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 2.146f,
                    dy2 = 2.218f,
                    dx3 = 3.818f,
                    dy3 = 2.58f,
                )
                // l 0.837 0.183
                lineToRelative(dx = 0.837f, dy = 0.183f)
                // c 1.673 0.362 4.544 -0.766 4.544 -0.766
                curveToRelative(
                    dx1 = 1.673f,
                    dy1 = 0.362f,
                    dx2 = 4.544f,
                    dy2 = -0.766f,
                    dx3 = 4.544f,
                    dy3 = -0.766f,
                )
                // c 1.304 -6.004 0.764 -11.219 -2.239 -11.871z
                curveToRelative(
                    dx1 = 1.304f,
                    dy1 = -6.004f,
                    dx2 = 0.764f,
                    dy2 = -11.219f,
                    dx3 = -2.239f,
                    dy3 = -11.871f,
                )
                close()
            }
            // M15.844 27.948 c0.469 -0.427 1.75 -0.326 2.5 -0.602 s1.219 -0.627 1.844 -0.376 0.812 0.627 1.406 0.678 1.031 0.402 0.781 0.678 -2.219 0.376 -3.531 0.376 -3.579 -0.226 -3 -0.754z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 15.844 27.948
                moveTo(x = 15.844f, y = 27.948f)
                // c 0.469 -0.427 1.75 -0.326 2.5 -0.602
                curveToRelative(
                    dx1 = 0.469f,
                    dy1 = -0.427f,
                    dx2 = 1.75f,
                    dy2 = -0.326f,
                    dx3 = 2.5f,
                    dy3 = -0.602f,
                )
                // s 1.219 -0.627 1.844 -0.376
                reflectiveCurveToRelative(
                    dx1 = 1.219f,
                    dy1 = -0.627f,
                    dx2 = 1.844f,
                    dy2 = -0.376f,
                )
                // s 0.812 0.627 1.406 0.678
                reflectiveCurveToRelative(
                    dx1 = 0.812f,
                    dy1 = 0.627f,
                    dx2 = 1.406f,
                    dy2 = 0.678f,
                )
                // s 1.031 0.402 0.781 0.678
                reflectiveCurveToRelative(
                    dx1 = 1.031f,
                    dy1 = 0.402f,
                    dx2 = 0.781f,
                    dy2 = 0.678f,
                )
                // s -2.219 0.376 -3.531 0.376
                reflectiveCurveToRelative(
                    dx1 = -2.219f,
                    dy1 = 0.376f,
                    dx2 = -3.531f,
                    dy2 = 0.376f,
                )
                // s -3.579 -0.226 -3 -0.754z
                reflectiveCurveToRelative(
                    dx1 = -3.579f,
                    dy1 = -0.226f,
                    dx2 = -3.0f,
                    dy2 = -0.754f,
                )
                close()
            }
        }.build().also { _emoji1f3d6 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f3d6: ImageVector? = null
