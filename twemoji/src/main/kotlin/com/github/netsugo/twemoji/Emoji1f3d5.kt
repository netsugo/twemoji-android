package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f3d5: ImageVector
    get() {
        val current = _emoji1f3d5
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f3d5",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M18 25.18 C3.438 25.18 0 29.844 0 32 s1.791 4 4 4 h28 c2.209 0 4 -1.851 4 -4 s-3.438 -6.82 -18 -6.82z
            path(
                fill = SolidColor(Color(0xFF78B159)),
            ) {
                // M 18 25.18
                moveTo(x = 18.0f, y = 25.18f)
                // C 3.438 25.18 0 29.844 0 32
                curveTo(
                    x1 = 3.438f,
                    y1 = 25.18f,
                    x2 = 0.0f,
                    y2 = 29.844f,
                    x3 = 0.0f,
                    y3 = 32.0f,
                )
                // s 1.791 4 4 4
                reflectiveCurveToRelative(
                    dx1 = 1.791f,
                    dy1 = 4.0f,
                    dx2 = 4.0f,
                    dy2 = 4.0f,
                )
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // c 2.209 0 4 -1.851 4 -4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = -1.851f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // s -3.438 -6.82 -18 -6.82z
                reflectiveCurveToRelative(
                    dx1 = -3.438f,
                    dy1 = -6.82f,
                    dx2 = -18.0f,
                    dy2 = -6.82f,
                )
                close()
            }
            // M28.804 28.15 c0 1.531 -1.242 2.08 -2.773 2.08 -1.531 0 -2.773 -0.548 -2.773 -2.08 l0.693 -6.239 c0 -1.531 0.548 -1.387 2.08 -1.387 1.531 0 2.08 -0.145 2.08 1.387 l0.693 6.239z
            path(
                fill = SolidColor(Color(0xFF662113)),
            ) {
                // M 28.804 28.15
                moveTo(x = 28.804f, y = 28.15f)
                // c 0 1.531 -1.242 2.08 -2.773 2.08
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.531f,
                    dx2 = -1.242f,
                    dy2 = 2.08f,
                    dx3 = -2.773f,
                    dy3 = 2.08f,
                )
                // c -1.531 0 -2.773 -0.548 -2.773 -2.08
                curveToRelative(
                    dx1 = -1.531f,
                    dy1 = 0.0f,
                    dx2 = -2.773f,
                    dy2 = -0.548f,
                    dx3 = -2.773f,
                    dy3 = -2.08f,
                )
                // l 0.693 -6.239
                lineToRelative(dx = 0.693f, dy = -6.239f)
                // c 0 -1.531 0.548 -1.387 2.08 -1.387
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.531f,
                    dx2 = 0.548f,
                    dy2 = -1.387f,
                    dx3 = 2.08f,
                    dy3 = -1.387f,
                )
                // c 1.531 0 2.08 -0.145 2.08 1.387
                curveToRelative(
                    dx1 = 1.531f,
                    dy1 = 0.0f,
                    dx2 = 2.08f,
                    dy2 = -0.145f,
                    dx3 = 2.08f,
                    dy3 = 1.387f,
                )
                // l 0.693 6.239z
                lineToRelative(dx = 0.693f, dy = 6.239f)
                close()
            }
            // M34.868 19.717 c-4.59 -4.135 -6.449 -10.056 -8.837 -10.056 s-4.247 5.921 -8.836 10.056 c-1.929 1.738 -1.01 2.743 1.634 2.542 2.357 -0.179 4.561 -0.741 7.202 -0.741 s4.846 0.563 7.202 0.741 c2.644 0.201 3.563 -0.805 1.635 -2.542z
            path(
                fill = SolidColor(Color(0xFF5C913B)),
            ) {
                // M 34.868 19.717
                moveTo(x = 34.868f, y = 19.717f)
                // c -4.59 -4.135 -6.449 -10.056 -8.837 -10.056
                curveToRelative(
                    dx1 = -4.59f,
                    dy1 = -4.135f,
                    dx2 = -6.449f,
                    dy2 = -10.056f,
                    dx3 = -8.837f,
                    dy3 = -10.056f,
                )
                // s -4.247 5.921 -8.836 10.056
                reflectiveCurveToRelative(
                    dx1 = -4.247f,
                    dy1 = 5.921f,
                    dx2 = -8.836f,
                    dy2 = 10.056f,
                )
                // c -1.929 1.738 -1.01 2.743 1.634 2.542
                curveToRelative(
                    dx1 = -1.929f,
                    dy1 = 1.738f,
                    dx2 = -1.01f,
                    dy2 = 2.743f,
                    dx3 = 1.634f,
                    dy3 = 2.542f,
                )
                // c 2.357 -0.179 4.561 -0.741 7.202 -0.741
                curveToRelative(
                    dx1 = 2.357f,
                    dy1 = -0.179f,
                    dx2 = 4.561f,
                    dy2 = -0.741f,
                    dx3 = 7.202f,
                    dy3 = -0.741f,
                )
                // s 4.846 0.563 7.202 0.741
                reflectiveCurveToRelative(
                    dx1 = 4.846f,
                    dy1 = 0.563f,
                    dx2 = 7.202f,
                    dy2 = 0.741f,
                )
                // c 2.644 0.201 3.563 -0.805 1.635 -2.542z
                curveToRelative(
                    dx1 = 2.644f,
                    dy1 = 0.201f,
                    dx2 = 3.563f,
                    dy2 = -0.805f,
                    dx3 = 1.635f,
                    dy3 = -2.542f,
                )
                close()
            }
            // M33.377 18.078 c-3.527 -3.401 -5.509 -8.273 -7.346 -8.273 -1.836 0 -3.818 4.872 -7.345 8.273 -2.803 2.703 3.673 3.309 7.345 0 3.671 3.309 10.148 2.703 7.346 0z
            path(
                fill = SolidColor(Color(0xFF3E721D)),
            ) {
                // M 33.377 18.078
                moveTo(x = 33.377f, y = 18.078f)
                // c -3.527 -3.401 -5.509 -8.273 -7.346 -8.273
                curveToRelative(
                    dx1 = -3.527f,
                    dy1 = -3.401f,
                    dx2 = -5.509f,
                    dy2 = -8.273f,
                    dx3 = -7.346f,
                    dy3 = -8.273f,
                )
                // c -1.836 0 -3.818 4.872 -7.345 8.273
                curveToRelative(
                    dx1 = -1.836f,
                    dy1 = 0.0f,
                    dx2 = -3.818f,
                    dy2 = 4.872f,
                    dx3 = -7.345f,
                    dy3 = 8.273f,
                )
                // c -2.803 2.703 3.673 3.309 7.345 0
                curveToRelative(
                    dx1 = -2.803f,
                    dy1 = 2.703f,
                    dx2 = 3.673f,
                    dy2 = 3.309f,
                    dx3 = 7.345f,
                    dy3 = 0.0f,
                )
                // c 3.671 3.309 10.148 2.703 7.346 0z
                curveToRelative(
                    dx1 = 3.671f,
                    dy1 = 3.309f,
                    dx2 = 10.148f,
                    dy2 = 2.703f,
                    dx3 = 7.346f,
                    dy3 = 0.0f,
                )
                close()
            }
            // M33.377 15.323 c-3.527 -3.178 -5.509 -7.729 -7.346 -7.729 -1.836 0 -3.818 4.551 -7.345 7.729 -2.803 2.525 3.673 3.091 7.345 0 3.671 3.091 10.148 2.524 7.346 0z
            path(
                fill = SolidColor(Color(0xFF5C913B)),
            ) {
                // M 33.377 15.323
                moveTo(x = 33.377f, y = 15.323f)
                // c -3.527 -3.178 -5.509 -7.729 -7.346 -7.729
                curveToRelative(
                    dx1 = -3.527f,
                    dy1 = -3.178f,
                    dx2 = -5.509f,
                    dy2 = -7.729f,
                    dx3 = -7.346f,
                    dy3 = -7.729f,
                )
                // c -1.836 0 -3.818 4.551 -7.345 7.729
                curveToRelative(
                    dx1 = -1.836f,
                    dy1 = 0.0f,
                    dx2 = -3.818f,
                    dy2 = 4.551f,
                    dx3 = -7.345f,
                    dy3 = 7.729f,
                )
                // c -2.803 2.525 3.673 3.091 7.345 0
                curveToRelative(
                    dx1 = -2.803f,
                    dy1 = 2.525f,
                    dx2 = 3.673f,
                    dy2 = 3.091f,
                    dx3 = 7.345f,
                    dy3 = 0.0f,
                )
                // c 3.671 3.091 10.148 2.524 7.346 0z
                curveToRelative(
                    dx1 = 3.671f,
                    dy1 = 3.091f,
                    dx2 = 10.148f,
                    dy2 = 2.524f,
                    dx3 = 7.346f,
                    dy3 = 0.0f,
                )
                close()
            }
            // M31.766 13.066 c-2.753 -2.481 -4.301 -6.034 -5.735 -6.034 -1.433 0 -2.981 3.553 -5.735 6.034 -2.188 1.971 2.867 2.414 5.735 0 2.867 2.413 7.923 1.971 5.735 0z
            path(
                fill = SolidColor(Color(0xFF3E721D)),
            ) {
                // M 31.766 13.066
                moveTo(x = 31.766f, y = 13.066f)
                // c -2.753 -2.481 -4.301 -6.034 -5.735 -6.034
                curveToRelative(
                    dx1 = -2.753f,
                    dy1 = -2.481f,
                    dx2 = -4.301f,
                    dy2 = -6.034f,
                    dx3 = -5.735f,
                    dy3 = -6.034f,
                )
                // c -1.433 0 -2.981 3.553 -5.735 6.034
                curveToRelative(
                    dx1 = -1.433f,
                    dy1 = 0.0f,
                    dx2 = -2.981f,
                    dy2 = 3.553f,
                    dx3 = -5.735f,
                    dy3 = 6.034f,
                )
                // c -2.188 1.971 2.867 2.414 5.735 0
                curveToRelative(
                    dx1 = -2.188f,
                    dy1 = 1.971f,
                    dx2 = 2.867f,
                    dy2 = 2.414f,
                    dx3 = 5.735f,
                    dy3 = 0.0f,
                )
                // c 2.867 2.413 7.923 1.971 5.735 0z
                curveToRelative(
                    dx1 = 2.867f,
                    dy1 = 2.413f,
                    dx2 = 7.923f,
                    dy2 = 1.971f,
                    dx3 = 5.735f,
                    dy3 = 0.0f,
                )
                close()
            }
            // M31.766 11.001 c-2.753 -2.481 -4.301 -6.034 -5.735 -6.034 -1.433 0 -2.981 3.553 -5.735 6.034 -2.188 1.971 2.867 2.414 5.735 0 2.867 2.414 7.923 1.972 5.735 0z
            path(
                fill = SolidColor(Color(0xFF5C913B)),
            ) {
                // M 31.766 11.001
                moveTo(x = 31.766f, y = 11.001f)
                // c -2.753 -2.481 -4.301 -6.034 -5.735 -6.034
                curveToRelative(
                    dx1 = -2.753f,
                    dy1 = -2.481f,
                    dx2 = -4.301f,
                    dy2 = -6.034f,
                    dx3 = -5.735f,
                    dy3 = -6.034f,
                )
                // c -1.433 0 -2.981 3.553 -5.735 6.034
                curveToRelative(
                    dx1 = -1.433f,
                    dy1 = 0.0f,
                    dx2 = -2.981f,
                    dy2 = 3.553f,
                    dx3 = -5.735f,
                    dy3 = 6.034f,
                )
                // c -2.188 1.971 2.867 2.414 5.735 0
                curveToRelative(
                    dx1 = -2.188f,
                    dy1 = 1.971f,
                    dx2 = 2.867f,
                    dy2 = 2.414f,
                    dx3 = 5.735f,
                    dy3 = 0.0f,
                )
                // c 2.867 2.414 7.923 1.972 5.735 0z
                curveToRelative(
                    dx1 = 2.867f,
                    dy1 = 2.414f,
                    dx2 = 7.923f,
                    dy2 = 1.972f,
                    dx3 = 5.735f,
                    dy3 = 0.0f,
                )
                close()
            }
            // M30.659 9.168 c-2.222 -2.002 -3.471 -4.869 -4.628 -4.869 s-2.406 2.867 -4.628 4.869 c-1.766 1.591 2.314 1.948 4.628 0 2.314 1.948 6.395 1.591 4.628 0z
            path(
                fill = SolidColor(Color(0xFF3E721D)),
            ) {
                // M 30.659 9.168
                moveTo(x = 30.659f, y = 9.168f)
                // c -2.222 -2.002 -3.471 -4.869 -4.628 -4.869
                curveToRelative(
                    dx1 = -2.222f,
                    dy1 = -2.002f,
                    dx2 = -3.471f,
                    dy2 = -4.869f,
                    dx3 = -4.628f,
                    dy3 = -4.869f,
                )
                // s -2.406 2.867 -4.628 4.869
                reflectiveCurveToRelative(
                    dx1 = -2.406f,
                    dy1 = 2.867f,
                    dx2 = -4.628f,
                    dy2 = 4.869f,
                )
                // c -1.766 1.591 2.314 1.948 4.628 0
                curveToRelative(
                    dx1 = -1.766f,
                    dy1 = 1.591f,
                    dx2 = 2.314f,
                    dy2 = 1.948f,
                    dx3 = 4.628f,
                    dy3 = 0.0f,
                )
                // c 2.314 1.948 6.395 1.591 4.628 0z
                curveToRelative(
                    dx1 = 2.314f,
                    dy1 = 1.948f,
                    dx2 = 6.395f,
                    dy2 = 1.591f,
                    dx3 = 4.628f,
                    dy3 = 0.0f,
                )
                close()
            }
            // M30.659 7.614 c-2.222 -2.002 -3.471 -4.869 -4.628 -4.869 s-2.406 2.867 -4.628 4.869 c-1.766 1.591 2.314 1.948 4.628 0 2.314 1.948 6.395 1.591 4.628 0z
            path(
                fill = SolidColor(Color(0xFF5C913B)),
            ) {
                // M 30.659 7.614
                moveTo(x = 30.659f, y = 7.614f)
                // c -2.222 -2.002 -3.471 -4.869 -4.628 -4.869
                curveToRelative(
                    dx1 = -2.222f,
                    dy1 = -2.002f,
                    dx2 = -3.471f,
                    dy2 = -4.869f,
                    dx3 = -4.628f,
                    dy3 = -4.869f,
                )
                // s -2.406 2.867 -4.628 4.869
                reflectiveCurveToRelative(
                    dx1 = -2.406f,
                    dy1 = 2.867f,
                    dx2 = -4.628f,
                    dy2 = 4.869f,
                )
                // c -1.766 1.591 2.314 1.948 4.628 0
                curveToRelative(
                    dx1 = -1.766f,
                    dy1 = 1.591f,
                    dx2 = 2.314f,
                    dy2 = 1.948f,
                    dx3 = 4.628f,
                    dy3 = 0.0f,
                )
                // c 2.314 1.948 6.395 1.591 4.628 0z
                curveToRelative(
                    dx1 = 2.314f,
                    dy1 = 1.948f,
                    dx2 = 6.395f,
                    dy2 = 1.591f,
                    dx3 = 4.628f,
                    dy3 = 0.0f,
                )
                close()
            }
            // M29.553 5.326 c-1.69 -1.523 -2.641 -3.705 -3.522 -3.705 -0.88 0 -1.831 2.182 -3.522 3.705 -1.344 1.211 1.761 1.482 3.522 0 1.761 1.483 4.866 1.211 3.522 0z
            path(
                fill = SolidColor(Color(0xFF3E721D)),
            ) {
                // M 29.553 5.326
                moveTo(x = 29.553f, y = 5.326f)
                // c -1.69 -1.523 -2.641 -3.705 -3.522 -3.705
                curveToRelative(
                    dx1 = -1.69f,
                    dy1 = -1.523f,
                    dx2 = -2.641f,
                    dy2 = -3.705f,
                    dx3 = -3.522f,
                    dy3 = -3.705f,
                )
                // c -0.88 0 -1.831 2.182 -3.522 3.705
                curveToRelative(
                    dx1 = -0.88f,
                    dy1 = 0.0f,
                    dx2 = -1.831f,
                    dy2 = 2.182f,
                    dx3 = -3.522f,
                    dy3 = 3.705f,
                )
                // c -1.344 1.211 1.761 1.482 3.522 0
                curveToRelative(
                    dx1 = -1.344f,
                    dy1 = 1.211f,
                    dx2 = 1.761f,
                    dy2 = 1.482f,
                    dx3 = 3.522f,
                    dy3 = 0.0f,
                )
                // c 1.761 1.483 4.866 1.211 3.522 0z
                curveToRelative(
                    dx1 = 1.761f,
                    dy1 = 1.483f,
                    dx2 = 4.866f,
                    dy2 = 1.211f,
                    dx3 = 3.522f,
                    dy3 = 0.0f,
                )
                close()
            }
            // M29.553 4.29 C27.863 2.767 26.912 0.585 26.031 0.585 c-0.88 0 -1.831 2.182 -3.522 3.705 -1.344 1.211 1.761 1.482 3.522 0 1.761 1.482 4.866 1.211 3.522 0z
            path(
                fill = SolidColor(Color(0xFF5C913B)),
            ) {
                // M 29.553 4.29
                moveTo(x = 29.553f, y = 4.29f)
                // C 27.863 2.767 26.912 0.585 26.031 0.585
                curveTo(
                    x1 = 27.863f,
                    y1 = 2.767f,
                    x2 = 26.912f,
                    y2 = 0.585f,
                    x3 = 26.031f,
                    y3 = 0.585f,
                )
                // c -0.88 0 -1.831 2.182 -3.522 3.705
                curveToRelative(
                    dx1 = -0.88f,
                    dy1 = 0.0f,
                    dx2 = -1.831f,
                    dy2 = 2.182f,
                    dx3 = -3.522f,
                    dy3 = 3.705f,
                )
                // c -1.344 1.211 1.761 1.482 3.522 0
                curveToRelative(
                    dx1 = -1.344f,
                    dy1 = 1.211f,
                    dx2 = 1.761f,
                    dy2 = 1.482f,
                    dx3 = 3.522f,
                    dy3 = 0.0f,
                )
                // c 1.761 1.482 4.866 1.211 3.522 0z
                curveToRelative(
                    dx1 = 1.761f,
                    dy1 = 1.482f,
                    dx2 = 4.866f,
                    dy2 = 1.211f,
                    dx3 = 3.522f,
                    dy3 = 0.0f,
                )
                close()
            }
            // M15.101 33 c-0.424 0 -0.802 -0.267 -0.944 -0.666 L9.145 18.301 c-0.11 -0.307 -0.063 -0.628 0.125 -0.896 0.188 -0.265 0.494 -0.405 0.82 -0.405 h11.759 c0.401 0 0.764 0.22 0.922 0.589 l6.014 14.023 c0.133 0.31 0.101 0.661 -0.084 0.942 -0.188 0.282 -0.502 0.446 -0.839 0.446 H15.101z
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 15.101 33
                moveTo(x = 15.101f, y = 33.0f)
                // c -0.424 0 -0.802 -0.267 -0.944 -0.666
                curveToRelative(
                    dx1 = -0.424f,
                    dy1 = 0.0f,
                    dx2 = -0.802f,
                    dy2 = -0.267f,
                    dx3 = -0.944f,
                    dy3 = -0.666f,
                )
                // L 9.145 18.301
                lineTo(x = 9.145f, y = 18.301f)
                // c -0.11 -0.307 -0.063 -0.628 0.125 -0.896
                curveToRelative(
                    dx1 = -0.11f,
                    dy1 = -0.307f,
                    dx2 = -0.063f,
                    dy2 = -0.628f,
                    dx3 = 0.125f,
                    dy3 = -0.896f,
                )
                // c 0.188 -0.265 0.494 -0.405 0.82 -0.405
                curveToRelative(
                    dx1 = 0.188f,
                    dy1 = -0.265f,
                    dx2 = 0.494f,
                    dy2 = -0.405f,
                    dx3 = 0.82f,
                    dy3 = -0.405f,
                )
                // h 11.759
                horizontalLineToRelative(dx = 11.759f)
                // c 0.401 0 0.764 0.22 0.922 0.589
                curveToRelative(
                    dx1 = 0.401f,
                    dy1 = 0.0f,
                    dx2 = 0.764f,
                    dy2 = 0.22f,
                    dx3 = 0.922f,
                    dy3 = 0.589f,
                )
                // l 6.014 14.023
                lineToRelative(dx = 6.014f, dy = 14.023f)
                // c 0.133 0.31 0.101 0.661 -0.084 0.942
                curveToRelative(
                    dx1 = 0.133f,
                    dy1 = 0.31f,
                    dx2 = 0.101f,
                    dy2 = 0.661f,
                    dx3 = -0.084f,
                    dy3 = 0.942f,
                )
                // c -0.188 0.282 -0.502 0.446 -0.839 0.446
                curveToRelative(
                    dx1 = -0.188f,
                    dy1 = 0.282f,
                    dx2 = -0.502f,
                    dy2 = 0.446f,
                    dx3 = -0.839f,
                    dy3 = 0.446f,
                )
                // H 15.101z
                horizontalLineTo(x = 15.101f)
                close()
            }
            // M4.075 33 c-0.337 0 -0.652 -0.17 -0.837 -0.45 -0.185 -0.282 -0.216 -0.638 -0.084 -0.948 L9.172 17.56 c0.157 -0.368 0.521 -0.607 0.921 -0.607 0.401 0 0.765 0.24 0.922 0.607 l6.018 14.041 c0.133 0.311 0.1 0.666 -0.085 0.948 -0.185 0.281 -0.5 0.451 -0.837 0.451 H4.075z
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 4.075 33
                moveTo(x = 4.075f, y = 33.0f)
                // c -0.337 0 -0.652 -0.17 -0.837 -0.45
                curveToRelative(
                    dx1 = -0.337f,
                    dy1 = 0.0f,
                    dx2 = -0.652f,
                    dy2 = -0.17f,
                    dx3 = -0.837f,
                    dy3 = -0.45f,
                )
                // c -0.185 -0.282 -0.216 -0.638 -0.084 -0.948
                curveToRelative(
                    dx1 = -0.185f,
                    dy1 = -0.282f,
                    dx2 = -0.216f,
                    dy2 = -0.638f,
                    dx3 = -0.084f,
                    dy3 = -0.948f,
                )
                // L 9.172 17.56
                lineTo(x = 9.172f, y = 17.56f)
                // c 0.157 -0.368 0.521 -0.607 0.921 -0.607
                curveToRelative(
                    dx1 = 0.157f,
                    dy1 = -0.368f,
                    dx2 = 0.521f,
                    dy2 = -0.607f,
                    dx3 = 0.921f,
                    dy3 = -0.607f,
                )
                // c 0.401 0 0.765 0.24 0.922 0.607
                curveToRelative(
                    dx1 = 0.401f,
                    dy1 = 0.0f,
                    dx2 = 0.765f,
                    dy2 = 0.24f,
                    dx3 = 0.922f,
                    dy3 = 0.607f,
                )
                // l 6.018 14.041
                lineToRelative(dx = 6.018f, dy = 14.041f)
                // c 0.133 0.311 0.1 0.666 -0.085 0.948
                curveToRelative(
                    dx1 = 0.133f,
                    dy1 = 0.311f,
                    dx2 = 0.1f,
                    dy2 = 0.666f,
                    dx3 = -0.085f,
                    dy3 = 0.948f,
                )
                // c -0.185 0.281 -0.5 0.451 -0.837 0.451
                curveToRelative(
                    dx1 = -0.185f,
                    dy1 = 0.281f,
                    dx2 = -0.5f,
                    dy2 = 0.451f,
                    dx3 = -0.837f,
                    dy3 = 0.451f,
                )
                // H 4.075z
                horizontalLineTo(x = 4.075f)
                close()
            }
            // M10.09 19.436 L8.084 33 h4.01z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 10.09 19.436
                moveTo(x = 10.09f, y = 19.436f)
                // L 8.084 33
                lineTo(x = 8.084f, y = 33.0f)
                // h 4.01z
                horizontalLineToRelative(dx = 4.01f)
                close()
            }
            // M14.127 31.887 L14.575 33 h-2.481z M6.052 31.887 L5.604 33 h2.48z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 14.127 31.887
                moveTo(x = 14.127f, y = 31.887f)
                // L 14.575 33
                lineTo(x = 14.575f, y = 33.0f)
                // h -2.481z
                horizontalLineToRelative(dx = -2.481f)
                close()
                // M 6.052 31.887
                moveTo(x = 6.052f, y = 31.887f)
                // L 5.604 33
                lineTo(x = 5.604f, y = 33.0f)
                // h 2.48z
                horizontalLineToRelative(dx = 2.48f)
                close()
            }
            // M12.094 33 s1.823 -0.465 2.714 -1.288 L10.09 19.436 12.094 33z M8.084 33 s-1.823 -0.465 -2.714 -1.288 l4.719 -12.277 L8.084 33z
            path(
                fill = SolidColor(Color(0xFFFFE8B6)),
            ) {
                // M 12.094 33
                moveTo(x = 12.094f, y = 33.0f)
                // s 1.823 -0.465 2.714 -1.288
                reflectiveCurveToRelative(
                    dx1 = 1.823f,
                    dy1 = -0.465f,
                    dx2 = 2.714f,
                    dy2 = -1.288f,
                )
                // L 10.09 19.436
                lineTo(x = 10.09f, y = 19.436f)
                // L 12.094 33z
                lineTo(x = 12.094f, y = 33.0f)
                close()
                // M 8.084 33
                moveTo(x = 8.084f, y = 33.0f)
                // s -1.823 -0.465 -2.714 -1.288
                reflectiveCurveToRelative(
                    dx1 = -1.823f,
                    dy1 = -0.465f,
                    dx2 = -2.714f,
                    dy2 = -1.288f,
                )
                // l 4.719 -12.277
                lineToRelative(dx = 4.719f, dy = -12.277f)
                // L 8.084 33z
                lineTo(x = 8.084f, y = 33.0f)
                close()
            }
            // M13.625 5.625 c-0.018 0 -0.034 0.006 -0.052 0.006 0.034 -0.164 0.052 -0.333 0.052 -0.507 0 -1.381 -1.119 -2.5 -2.5 -2.5 -0.891 0 -1.667 0.469 -2.11 1.171 -0.277 -0.106 -0.575 -0.17 -0.89 -0.17 -1.275 0 -2.315 0.957 -2.469 2.19 -0.282 -0.113 -0.583 -0.19 -0.906 -0.19 -1.381 0 -2.5 1.119 -2.5 2.5 s1.119 2.5 2.5 2.5 h8.875 c1.381 0 2.5 -1.119 2.5 -2.5 s-1.119 -2.5 -2.5 -2.5z
            path(
                fill = SolidColor(Color(0xFFE1E8ED)),
            ) {
                // M 13.625 5.625
                moveTo(x = 13.625f, y = 5.625f)
                // c -0.018 0 -0.034 0.006 -0.052 0.006
                curveToRelative(
                    dx1 = -0.018f,
                    dy1 = 0.0f,
                    dx2 = -0.034f,
                    dy2 = 0.006f,
                    dx3 = -0.052f,
                    dy3 = 0.006f,
                )
                // c 0.034 -0.164 0.052 -0.333 0.052 -0.507
                curveToRelative(
                    dx1 = 0.034f,
                    dy1 = -0.164f,
                    dx2 = 0.052f,
                    dy2 = -0.333f,
                    dx3 = 0.052f,
                    dy3 = -0.507f,
                )
                // c 0 -1.381 -1.119 -2.5 -2.5 -2.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.381f,
                    dx2 = -1.119f,
                    dy2 = -2.5f,
                    dx3 = -2.5f,
                    dy3 = -2.5f,
                )
                // c -0.891 0 -1.667 0.469 -2.11 1.171
                curveToRelative(
                    dx1 = -0.891f,
                    dy1 = 0.0f,
                    dx2 = -1.667f,
                    dy2 = 0.469f,
                    dx3 = -2.11f,
                    dy3 = 1.171f,
                )
                // c -0.277 -0.106 -0.575 -0.17 -0.89 -0.17
                curveToRelative(
                    dx1 = -0.277f,
                    dy1 = -0.106f,
                    dx2 = -0.575f,
                    dy2 = -0.17f,
                    dx3 = -0.89f,
                    dy3 = -0.17f,
                )
                // c -1.275 0 -2.315 0.957 -2.469 2.19
                curveToRelative(
                    dx1 = -1.275f,
                    dy1 = 0.0f,
                    dx2 = -2.315f,
                    dy2 = 0.957f,
                    dx3 = -2.469f,
                    dy3 = 2.19f,
                )
                // c -0.282 -0.113 -0.583 -0.19 -0.906 -0.19
                curveToRelative(
                    dx1 = -0.282f,
                    dy1 = -0.113f,
                    dx2 = -0.583f,
                    dy2 = -0.19f,
                    dx3 = -0.906f,
                    dy3 = -0.19f,
                )
                // c -1.381 0 -2.5 1.119 -2.5 2.5
                curveToRelative(
                    dx1 = -1.381f,
                    dy1 = 0.0f,
                    dx2 = -2.5f,
                    dy2 = 1.119f,
                    dx3 = -2.5f,
                    dy3 = 2.5f,
                )
                // s 1.119 2.5 2.5 2.5
                reflectiveCurveToRelative(
                    dx1 = 1.119f,
                    dy1 = 2.5f,
                    dx2 = 2.5f,
                    dy2 = 2.5f,
                )
                // h 8.875
                horizontalLineToRelative(dx = 8.875f)
                // c 1.381 0 2.5 -1.119 2.5 -2.5
                curveToRelative(
                    dx1 = 1.381f,
                    dy1 = 0.0f,
                    dx2 = 2.5f,
                    dy2 = -1.119f,
                    dx3 = 2.5f,
                    dy3 = -2.5f,
                )
                // s -1.119 -2.5 -2.5 -2.5z
                reflectiveCurveToRelative(
                    dx1 = -1.119f,
                    dy1 = -2.5f,
                    dx2 = -2.5f,
                    dy2 = -2.5f,
                )
                close()
            }
        }.build().also { _emoji1f3d5 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f3d5: ImageVector? = null
