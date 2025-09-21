package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f987: ImageVector
    get() {
        val current = _emoji1f987
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f987",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M23 21 c0 6.352 -3 10 -5 10 s-5 -3.648 -5 -10 2.239 -7 5 -7 c2.762 0 5 0.648 5 7z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 23 21
                moveTo(x = 23.0f, y = 21.0f)
                // c 0 6.352 -3 10 -5 10
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 6.352f,
                    dx2 = -3.0f,
                    dy2 = 10.0f,
                    dx3 = -5.0f,
                    dy3 = 10.0f,
                )
                // s -5 -3.648 -5 -10
                reflectiveCurveToRelative(
                    dx1 = -5.0f,
                    dy1 = -3.648f,
                    dx2 = -5.0f,
                    dy2 = -10.0f,
                )
                // s 2.239 -7 5 -7
                reflectiveCurveToRelative(
                    dx1 = 2.239f,
                    dy1 = -7.0f,
                    dx2 = 5.0f,
                    dy2 = -7.0f,
                )
                // c 2.762 0 5 0.648 5 7z
                curveToRelative(
                    dx1 = 2.762f,
                    dy1 = 0.0f,
                    dx2 = 5.0f,
                    dy2 = 0.648f,
                    dx3 = 5.0f,
                    dy3 = 7.0f,
                )
                close()
            }
            // M18 11 m-4 0 a4 4 0 1 1 8 0 a4 4 0 1 1 -8 0
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 18 11
                moveTo(x = 18.0f, y = 11.0f)
                // m -4 0
                moveToRelative(dx = -4.0f, dy = 0.0f)
                // a 4 4 0 1 1 8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 8.0f,
                    dy1 = 0.0f,
                )
                // a 4 4 0 1 1 -8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -8.0f,
                    dy1 = 0.0f,
                )
            }
            // M14 11 c-2 -5 1 -7 1 -7 s2 1 2 4 -3 3 -3 3z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 14 11
                moveTo(x = 14.0f, y = 11.0f)
                // c -2 -5 1 -7 1 -7
                curveToRelative(
                    dx1 = -2.0f,
                    dy1 = -5.0f,
                    dx2 = 1.0f,
                    dy2 = -7.0f,
                    dx3 = 1.0f,
                    dy3 = -7.0f,
                )
                // s 2 1 2 4
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 1.0f,
                    dx2 = 2.0f,
                    dy2 = 4.0f,
                )
                // s -3 3 -3 3z
                reflectiveCurveToRelative(
                    dx1 = -3.0f,
                    dy1 = 3.0f,
                    dx2 = -3.0f,
                    dy2 = 3.0f,
                )
                close()
            }
            // M14.668 9.904 c-0.776 -2.457 -0.119 -3.896 0.403 -4.58 C15.486 5.773 16 6.608 16 8 c0 1.268 -0.739 1.734 -1.332 1.904z
            path(
                fill = SolidColor(Color(0xFF546066)),
            ) {
                // M 14.668 9.904
                moveTo(x = 14.668f, y = 9.904f)
                // c -0.776 -2.457 -0.119 -3.896 0.403 -4.58
                curveToRelative(
                    dx1 = -0.776f,
                    dy1 = -2.457f,
                    dx2 = -0.119f,
                    dy2 = -3.896f,
                    dx3 = 0.403f,
                    dy3 = -4.58f,
                )
                // C 15.486 5.773 16 6.608 16 8
                curveTo(
                    x1 = 15.486f,
                    y1 = 5.773f,
                    x2 = 16.0f,
                    y2 = 6.608f,
                    x3 = 16.0f,
                    y3 = 8.0f,
                )
                // c 0 1.268 -0.739 1.734 -1.332 1.904z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.268f,
                    dx2 = -0.739f,
                    dy2 = 1.734f,
                    dx3 = -1.332f,
                    dy3 = 1.904f,
                )
                close()
            }
            // M22 11 c2 -5 -1 -7 -1 -7 s-2 1 -2 4 3 3 3 3z M16.016 14 c-1.62 1.157 -10 2 -9 -5 0.142 -0.99 -1 -1 -2 0 -3 3 -6 7.834 -4 20 3 -5 6 -4 7 1 3 -4 6 -2 8 0 3 -3 0 -16 0 -16z M19.953 14 c1.62 1.157 10 2 9 -5 -0.142 -0.99 1 -1 2 0 3 3 6 7.834 4 20 -3 -5 -6 -4 -7 1 -3 -4 -6 -2 -8 0 -3 -3 0 -16 0 -16z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 22 11
                moveTo(x = 22.0f, y = 11.0f)
                // c 2 -5 -1 -7 -1 -7
                curveToRelative(
                    dx1 = 2.0f,
                    dy1 = -5.0f,
                    dx2 = -1.0f,
                    dy2 = -7.0f,
                    dx3 = -1.0f,
                    dy3 = -7.0f,
                )
                // s -2 1 -2 4
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 1.0f,
                    dx2 = -2.0f,
                    dy2 = 4.0f,
                )
                // s 3 3 3 3z
                reflectiveCurveToRelative(
                    dx1 = 3.0f,
                    dy1 = 3.0f,
                    dx2 = 3.0f,
                    dy2 = 3.0f,
                )
                close()
                // M 16.016 14
                moveTo(x = 16.016f, y = 14.0f)
                // c -1.62 1.157 -10 2 -9 -5
                curveToRelative(
                    dx1 = -1.62f,
                    dy1 = 1.157f,
                    dx2 = -10.0f,
                    dy2 = 2.0f,
                    dx3 = -9.0f,
                    dy3 = -5.0f,
                )
                // c 0.142 -0.99 -1 -1 -2 0
                curveToRelative(
                    dx1 = 0.142f,
                    dy1 = -0.99f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                    dx3 = -2.0f,
                    dy3 = 0.0f,
                )
                // c -3 3 -6 7.834 -4 20
                curveToRelative(
                    dx1 = -3.0f,
                    dy1 = 3.0f,
                    dx2 = -6.0f,
                    dy2 = 7.834f,
                    dx3 = -4.0f,
                    dy3 = 20.0f,
                )
                // c 3 -5 6 -4 7 1
                curveToRelative(
                    dx1 = 3.0f,
                    dy1 = -5.0f,
                    dx2 = 6.0f,
                    dy2 = -4.0f,
                    dx3 = 7.0f,
                    dy3 = 1.0f,
                )
                // c 3 -4 6 -2 8 0
                curveToRelative(
                    dx1 = 3.0f,
                    dy1 = -4.0f,
                    dx2 = 6.0f,
                    dy2 = -2.0f,
                    dx3 = 8.0f,
                    dy3 = 0.0f,
                )
                // c 3 -3 0 -16 0 -16z
                curveToRelative(
                    dx1 = 3.0f,
                    dy1 = -3.0f,
                    dx2 = 0.0f,
                    dy2 = -16.0f,
                    dx3 = 0.0f,
                    dy3 = -16.0f,
                )
                close()
                // M 19.953 14
                moveTo(x = 19.953f, y = 14.0f)
                // c 1.62 1.157 10 2 9 -5
                curveToRelative(
                    dx1 = 1.62f,
                    dy1 = 1.157f,
                    dx2 = 10.0f,
                    dy2 = 2.0f,
                    dx3 = 9.0f,
                    dy3 = -5.0f,
                )
                // c -0.142 -0.99 1 -1 2 0
                curveToRelative(
                    dx1 = -0.142f,
                    dy1 = -0.99f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                    dx3 = 2.0f,
                    dy3 = 0.0f,
                )
                // c 3 3 6 7.834 4 20
                curveToRelative(
                    dx1 = 3.0f,
                    dy1 = 3.0f,
                    dx2 = 6.0f,
                    dy2 = 7.834f,
                    dx3 = 4.0f,
                    dy3 = 20.0f,
                )
                // c -3 -5 -6 -4 -7 1
                curveToRelative(
                    dx1 = -3.0f,
                    dy1 = -5.0f,
                    dx2 = -6.0f,
                    dy2 = -4.0f,
                    dx3 = -7.0f,
                    dy3 = 1.0f,
                )
                // c -3 -4 -6 -2 -8 0
                curveToRelative(
                    dx1 = -3.0f,
                    dy1 = -4.0f,
                    dx2 = -6.0f,
                    dy2 = -2.0f,
                    dx3 = -8.0f,
                    dy3 = 0.0f,
                )
                // c -3 -3 0 -16 0 -16z
                curveToRelative(
                    dx1 = -3.0f,
                    dy1 = -3.0f,
                    dx2 = 0.0f,
                    dy2 = -16.0f,
                    dx3 = 0.0f,
                    dy3 = -16.0f,
                )
                close()
            }
            // M16 11 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 16 11
                moveTo(x = 16.0f, y = 11.0f)
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
            // M20 11 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 20 11
                moveTo(x = 20.0f, y = 11.0f)
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
            // M21.332 9.904 c0.775 -2.457 0.118 -3.896 -0.403 -4.58 C20.514 5.773 20 6.608 20 8 c0 1.268 0.739 1.734 1.332 1.904z
            path(
                fill = SolidColor(Color(0xFF546066)),
            ) {
                // M 21.332 9.904
                moveTo(x = 21.332f, y = 9.904f)
                // c 0.775 -2.457 0.118 -3.896 -0.403 -4.58
                curveToRelative(
                    dx1 = 0.775f,
                    dy1 = -2.457f,
                    dx2 = 0.118f,
                    dy2 = -3.896f,
                    dx3 = -0.403f,
                    dy3 = -4.58f,
                )
                // C 20.514 5.773 20 6.608 20 8
                curveTo(
                    x1 = 20.514f,
                    y1 = 5.773f,
                    x2 = 20.0f,
                    y2 = 6.608f,
                    x3 = 20.0f,
                    y3 = 8.0f,
                )
                // c 0 1.268 0.739 1.734 1.332 1.904z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.268f,
                    dx2 = 0.739f,
                    dy2 = 1.734f,
                    dx3 = 1.332f,
                    dy3 = 1.904f,
                )
                close()
            }
            // M7.996 26.91 c0.892 -2.691 0.573 -5.988 -0.996 -9.91 -1.487 -3.719 -1.315 -6.329 -1.129 -7.423 -0.049 0.041 -0.096 0.078 -0.148 0.13 C3.017 12.414 0.477 16.531 1.66 26.436 c1.276 -1.379 2.412 -1.723 3.228 -1.723 1.265 0 2.333 0.783 3.108 2.197z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 7.996 26.91
                moveTo(x = 7.996f, y = 26.91f)
                // c 0.892 -2.691 0.573 -5.988 -0.996 -9.91
                curveToRelative(
                    dx1 = 0.892f,
                    dy1 = -2.691f,
                    dx2 = 0.573f,
                    dy2 = -5.988f,
                    dx3 = -0.996f,
                    dy3 = -9.91f,
                )
                // c -1.487 -3.719 -1.315 -6.329 -1.129 -7.423
                curveToRelative(
                    dx1 = -1.487f,
                    dy1 = -3.719f,
                    dx2 = -1.315f,
                    dy2 = -6.329f,
                    dx3 = -1.129f,
                    dy3 = -7.423f,
                )
                // c -0.049 0.041 -0.096 0.078 -0.148 0.13
                curveToRelative(
                    dx1 = -0.049f,
                    dy1 = 0.041f,
                    dx2 = -0.096f,
                    dy2 = 0.078f,
                    dx3 = -0.148f,
                    dy3 = 0.13f,
                )
                // C 3.017 12.414 0.477 16.531 1.66 26.436
                curveTo(
                    x1 = 3.017f,
                    y1 = 12.414f,
                    x2 = 0.477f,
                    y2 = 16.531f,
                    x3 = 1.66f,
                    y3 = 26.436f,
                )
                // c 1.276 -1.379 2.412 -1.723 3.228 -1.723
                curveToRelative(
                    dx1 = 1.276f,
                    dy1 = -1.379f,
                    dx2 = 2.412f,
                    dy2 = -1.723f,
                    dx3 = 3.228f,
                    dy3 = -1.723f,
                )
                // c 1.265 0 2.333 0.783 3.108 2.197z
                curveToRelative(
                    dx1 = 1.265f,
                    dy1 = 0.0f,
                    dx2 = 2.333f,
                    dy2 = 0.783f,
                    dx3 = 3.108f,
                    dy3 = 2.197f,
                )
                close()
            }
            // M6.832 13.25 c-0.019 -0.03 -0.041 -0.058 -0.06 -0.087 C7 16 8.4 17.001 9 20 c0.588 2.94 0.476 5.519 0.088 7.564 0.839 -0.571 1.726 -0.874 2.656 -0.874 1.264 0 2.548 0.538 3.895 1.627 C14 19 9 17 6.832 13.25z M28.004 26.91 c-0.893 -2.691 -0.572 -5.988 0.996 -9.91 1.487 -3.719 1.315 -6.329 1.129 -7.423 0.049 0.041 0.097 0.078 0.148 0.13 2.706 2.707 5.246 6.824 4.063 16.729 -1.275 -1.379 -2.412 -1.723 -3.227 -1.723 -1.266 0 -2.334 0.783 -3.109 2.197z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 6.832 13.25
                moveTo(x = 6.832f, y = 13.25f)
                // c -0.019 -0.03 -0.041 -0.058 -0.06 -0.087
                curveToRelative(
                    dx1 = -0.019f,
                    dy1 = -0.03f,
                    dx2 = -0.041f,
                    dy2 = -0.058f,
                    dx3 = -0.06f,
                    dy3 = -0.087f,
                )
                // C 7 16 8.4 17.001 9 20
                curveTo(
                    x1 = 7.0f,
                    y1 = 16.0f,
                    x2 = 8.4f,
                    y2 = 17.001f,
                    x3 = 9.0f,
                    y3 = 20.0f,
                )
                // c 0.588 2.94 0.476 5.519 0.088 7.564
                curveToRelative(
                    dx1 = 0.588f,
                    dy1 = 2.94f,
                    dx2 = 0.476f,
                    dy2 = 5.519f,
                    dx3 = 0.088f,
                    dy3 = 7.564f,
                )
                // c 0.839 -0.571 1.726 -0.874 2.656 -0.874
                curveToRelative(
                    dx1 = 0.839f,
                    dy1 = -0.571f,
                    dx2 = 1.726f,
                    dy2 = -0.874f,
                    dx3 = 2.656f,
                    dy3 = -0.874f,
                )
                // c 1.264 0 2.548 0.538 3.895 1.627
                curveToRelative(
                    dx1 = 1.264f,
                    dy1 = 0.0f,
                    dx2 = 2.548f,
                    dy2 = 0.538f,
                    dx3 = 3.895f,
                    dy3 = 1.627f,
                )
                // C 14 19 9 17 6.832 13.25z
                curveTo(
                    x1 = 14.0f,
                    y1 = 19.0f,
                    x2 = 9.0f,
                    y2 = 17.0f,
                    x3 = 6.832f,
                    y3 = 13.25f,
                )
                close()
                // M 28.004 26.91
                moveTo(x = 28.004f, y = 26.91f)
                // c -0.893 -2.691 -0.572 -5.988 0.996 -9.91
                curveToRelative(
                    dx1 = -0.893f,
                    dy1 = -2.691f,
                    dx2 = -0.572f,
                    dy2 = -5.988f,
                    dx3 = 0.996f,
                    dy3 = -9.91f,
                )
                // c 1.487 -3.719 1.315 -6.329 1.129 -7.423
                curveToRelative(
                    dx1 = 1.487f,
                    dy1 = -3.719f,
                    dx2 = 1.315f,
                    dy2 = -6.329f,
                    dx3 = 1.129f,
                    dy3 = -7.423f,
                )
                // c 0.049 0.041 0.097 0.078 0.148 0.13
                curveToRelative(
                    dx1 = 0.049f,
                    dy1 = 0.041f,
                    dx2 = 0.097f,
                    dy2 = 0.078f,
                    dx3 = 0.148f,
                    dy3 = 0.13f,
                )
                // c 2.706 2.707 5.246 6.824 4.063 16.729
                curveToRelative(
                    dx1 = 2.706f,
                    dy1 = 2.707f,
                    dx2 = 5.246f,
                    dy2 = 6.824f,
                    dx3 = 4.063f,
                    dy3 = 16.729f,
                )
                // c -1.275 -1.379 -2.412 -1.723 -3.227 -1.723
                curveToRelative(
                    dx1 = -1.275f,
                    dy1 = -1.379f,
                    dx2 = -2.412f,
                    dy2 = -1.723f,
                    dx3 = -3.227f,
                    dy3 = -1.723f,
                )
                // c -1.266 0 -2.334 0.783 -3.109 2.197z
                curveToRelative(
                    dx1 = -1.266f,
                    dy1 = 0.0f,
                    dx2 = -2.334f,
                    dy2 = 0.783f,
                    dx3 = -3.109f,
                    dy3 = 2.197f,
                )
                close()
            }
            // M29.168 13.25 l0.061 -0.087 C29 16 27.6 17.001 27 20 c-0.588 2.94 -0.477 5.519 -0.088 7.564 -0.84 -0.571 -1.726 -0.874 -2.656 -0.874 -1.264 0 -2.548 0.538 -3.895 1.627 C22 19 27 17 29.168 13.25z M18.688 13.106 c-0.378 0.378 -0.998 0.378 -1.375 0 l-0.57 -0.571 c-0.378 -0.378 -0.25 -0.688 0.285 -0.688 h1.945 c0.535 0 0.664 0.309 0.285 0.688 l-0.57 0.571z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 29.168 13.25
                moveTo(x = 29.168f, y = 13.25f)
                // l 0.061 -0.087
                lineToRelative(dx = 0.061f, dy = -0.087f)
                // C 29 16 27.6 17.001 27 20
                curveTo(
                    x1 = 29.0f,
                    y1 = 16.0f,
                    x2 = 27.6f,
                    y2 = 17.001f,
                    x3 = 27.0f,
                    y3 = 20.0f,
                )
                // c -0.588 2.94 -0.477 5.519 -0.088 7.564
                curveToRelative(
                    dx1 = -0.588f,
                    dy1 = 2.94f,
                    dx2 = -0.477f,
                    dy2 = 5.519f,
                    dx3 = -0.088f,
                    dy3 = 7.564f,
                )
                // c -0.84 -0.571 -1.726 -0.874 -2.656 -0.874
                curveToRelative(
                    dx1 = -0.84f,
                    dy1 = -0.571f,
                    dx2 = -1.726f,
                    dy2 = -0.874f,
                    dx3 = -2.656f,
                    dy3 = -0.874f,
                )
                // c -1.264 0 -2.548 0.538 -3.895 1.627
                curveToRelative(
                    dx1 = -1.264f,
                    dy1 = 0.0f,
                    dx2 = -2.548f,
                    dy2 = 0.538f,
                    dx3 = -3.895f,
                    dy3 = 1.627f,
                )
                // C 22 19 27 17 29.168 13.25z
                curveTo(
                    x1 = 22.0f,
                    y1 = 19.0f,
                    x2 = 27.0f,
                    y2 = 17.0f,
                    x3 = 29.168f,
                    y3 = 13.25f,
                )
                close()
                // M 18.688 13.106
                moveTo(x = 18.688f, y = 13.106f)
                // c -0.378 0.378 -0.998 0.378 -1.375 0
                curveToRelative(
                    dx1 = -0.378f,
                    dy1 = 0.378f,
                    dx2 = -0.998f,
                    dy2 = 0.378f,
                    dx3 = -1.375f,
                    dy3 = 0.0f,
                )
                // l -0.57 -0.571
                lineToRelative(dx = -0.57f, dy = -0.571f)
                // c -0.378 -0.378 -0.25 -0.688 0.285 -0.688
                curveToRelative(
                    dx1 = -0.378f,
                    dy1 = -0.378f,
                    dx2 = -0.25f,
                    dy2 = -0.688f,
                    dx3 = 0.285f,
                    dy3 = -0.688f,
                )
                // h 1.945
                horizontalLineToRelative(dx = 1.945f)
                // c 0.535 0 0.664 0.309 0.285 0.688
                curveToRelative(
                    dx1 = 0.535f,
                    dy1 = 0.0f,
                    dx2 = 0.664f,
                    dy2 = 0.309f,
                    dx3 = 0.285f,
                    dy3 = 0.688f,
                )
                // l -0.57 0.571z
                lineToRelative(dx = -0.57f, dy = 0.571f)
                close()
            }
        }.build().also { _emoji1f987 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f987: ImageVector? = null
