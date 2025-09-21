package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1f31f1e8: ImageVector
    get() {
        val current = _emoji1f1f31f1e8
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1f31f1e8",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 27 c0 2.209 -1.791 4 -4 4 H4 c-2.209 0 -4 -1.791 -4 -4 V9 c0 -2.209 1.791 -4 4 -4 h28 c2.209 0 4 1.791 4 4 v18z
            path(
                fill = SolidColor(Color(0xFF009543)),
            ) {
                // M 36 27
                moveTo(x = 36.0f, y = 27.0f)
                // c 0 2.209 -1.791 4 -4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = -1.791f,
                    dy2 = 4.0f,
                    dx3 = -4.0f,
                    dy3 = 4.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // c -2.209 0 -4 -1.791 -4 -4
                curveToRelative(
                    dx1 = -2.209f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = -1.791f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                // V 9
                verticalLineTo(y = 9.0f)
                // c 0 -2.209 1.791 -4 4 -4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.209f,
                    dx2 = 1.791f,
                    dy2 = -4.0f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // c 2.209 0 4 1.791 4 4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = 1.791f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // v 18z
                verticalLineToRelative(dy = 18.0f)
                close()
            }
            // M0 13 h36 v10 H0z
            path(
                fill = SolidColor(Color(0xFFED4135)),
            ) {
                // M 0 13
                moveTo(x = 0.0f, y = 13.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // H 0z
                horizontalLineTo(x = 0.0f)
                close()
            }
            // M32 5 H4 C1.791 5 0 6.791 0 9 v4 h36 V9 c0 -2.209 -1.791 -4 -4 -4z
            path(
                fill = SolidColor(Color(0xFF0035AD)),
            ) {
                // M 32 5
                moveTo(x = 32.0f, y = 5.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // C 1.791 5 0 6.791 0 9
                curveTo(
                    x1 = 1.791f,
                    y1 = 5.0f,
                    x2 = 0.0f,
                    y2 = 6.791f,
                    x3 = 0.0f,
                    y3 = 9.0f,
                )
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // V 9
                verticalLineTo(y = 9.0f)
                // c 0 -2.209 -1.791 -4 -4 -4z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.209f,
                    dx2 = -1.791f,
                    dy2 = -4.0f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                close()
            }
            // M10.8391 27.1521 a9.402 9.402 58.286 1 0 4.3214 -18.3007 a9.402 9.402 58.286 1 0 -4.3214 18.3007z
            path(
                fill = SolidColor(Color(0xFF141414)),
            ) {
                // M 10.8391 27.1521
                moveTo(x = 10.8391f, y = 27.1521f)
                // a 9.402 9.402 58.286 1 0 4.3214 -18.3007
                arcToRelative(
                    a = 9.402f,
                    b = 9.402f,
                    theta = 58.286f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 4.3214f,
                    dy1 = -18.3007f,
                )
                // a 9.402 9.402 58.286 1 0 -4.3214 18.3007z
                arcToRelative(
                    a = 9.402f,
                    b = 9.402f,
                    theta = 58.286f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -4.3214f,
                    dy1 = 18.3007f,
                )
                close()
            }
            // M13 18 m-9 0 a9 9 0 1 1 18 0 a9 9 0 1 1 -18 0
            path(
                fill = SolidColor(Color(0xFFFAE600)),
            ) {
                // M 13 18
                moveTo(x = 13.0f, y = 18.0f)
                // m -9 0
                moveToRelative(dx = -9.0f, dy = 0.0f)
                // a 9 9 0 1 1 18 0
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 18.0f,
                    dy1 = 0.0f,
                )
                // a 9 9 0 1 1 -18 0
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -18.0f,
                    dy1 = 0.0f,
                )
            }
            // M12.87 9.008 h0.322 v17.984 h-0.322z
            path(
                fill = SolidColor(Color(0xFF141414)),
            ) {
                // M 12.87 9.008
                moveTo(x = 12.87f, y = 9.008f)
                // h 0.322
                horizontalLineToRelative(dx = 0.322f)
                // v 17.984
                verticalLineToRelative(dy = 17.984f)
                // h -0.322z
                horizontalLineToRelative(dx = -0.322f)
                close()
            }
            // M14.25 14.719 c0 0.673 -0.546 1.219 -1.219 1.219 s-1.219 -0.545 -1.219 -1.219 c0 -0.673 0.546 -1.219 1.219 -1.219 s1.219 0.545 1.219 1.219z M14.031 22.266 c0 0.786 -0.448 1.422 -1 1.422 s-1 -0.636 -1 -1.422 c0 -0.786 0.448 -1.422 1 -1.422 s1 0.635 1 1.422z M14.25 18.281 c0 0.406 -0.546 0.734 -1.219 0.734 s-1.219 -0.328 -1.219 -0.734 c0 -0.406 0.546 -0.734 1.219 -0.734 s1.219 0.328 1.219 0.734z M11.688 13 s-0.125 -0.875 0.125 -1.25 0.906 -0.719 1.438 -0.844 C13.781 10.781 14.5 10 14.5 10 s-0.094 1.156 -0.969 1.875 c-0.875 0.719 -1.843 1.125 -1.843 1.125z M10.922 14.776 s0.484 0.312 0.609 0.781 c0.125 0.469 0.469 0.969 1.469 0.969 v0.562 s-0.844 0.062 -1.312 -0.125 c-0.469 -0.188 -0.594 -1.062 -0.594 -1.375 s-0.172 -0.812 -0.172 -0.812z M15.109 14.776 s-0.484 0.312 -0.609 0.781 c-0.125 0.469 -0.469 0.969 -1.469 0.969 v0.562 s0.844 0.062 1.312 -0.125 c0.469 -0.188 0.594 -1.062 0.594 -1.375 s0.172 -0.812 0.172 -0.812z
            path(
                fill = SolidColor(Color(0xFF141414)),
            ) {
                // M 14.25 14.719
                moveTo(x = 14.25f, y = 14.719f)
                // c 0 0.673 -0.546 1.219 -1.219 1.219
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.673f,
                    dx2 = -0.546f,
                    dy2 = 1.219f,
                    dx3 = -1.219f,
                    dy3 = 1.219f,
                )
                // s -1.219 -0.545 -1.219 -1.219
                reflectiveCurveToRelative(
                    dx1 = -1.219f,
                    dy1 = -0.545f,
                    dx2 = -1.219f,
                    dy2 = -1.219f,
                )
                // c 0 -0.673 0.546 -1.219 1.219 -1.219
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.673f,
                    dx2 = 0.546f,
                    dy2 = -1.219f,
                    dx3 = 1.219f,
                    dy3 = -1.219f,
                )
                // s 1.219 0.545 1.219 1.219z
                reflectiveCurveToRelative(
                    dx1 = 1.219f,
                    dy1 = 0.545f,
                    dx2 = 1.219f,
                    dy2 = 1.219f,
                )
                close()
                // M 14.031 22.266
                moveTo(x = 14.031f, y = 22.266f)
                // c 0 0.786 -0.448 1.422 -1 1.422
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.786f,
                    dx2 = -0.448f,
                    dy2 = 1.422f,
                    dx3 = -1.0f,
                    dy3 = 1.422f,
                )
                // s -1 -0.636 -1 -1.422
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = -0.636f,
                    dx2 = -1.0f,
                    dy2 = -1.422f,
                )
                // c 0 -0.786 0.448 -1.422 1 -1.422
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.786f,
                    dx2 = 0.448f,
                    dy2 = -1.422f,
                    dx3 = 1.0f,
                    dy3 = -1.422f,
                )
                // s 1 0.635 1 1.422z
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.635f,
                    dx2 = 1.0f,
                    dy2 = 1.422f,
                )
                close()
                // M 14.25 18.281
                moveTo(x = 14.25f, y = 18.281f)
                // c 0 0.406 -0.546 0.734 -1.219 0.734
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.406f,
                    dx2 = -0.546f,
                    dy2 = 0.734f,
                    dx3 = -1.219f,
                    dy3 = 0.734f,
                )
                // s -1.219 -0.328 -1.219 -0.734
                reflectiveCurveToRelative(
                    dx1 = -1.219f,
                    dy1 = -0.328f,
                    dx2 = -1.219f,
                    dy2 = -0.734f,
                )
                // c 0 -0.406 0.546 -0.734 1.219 -0.734
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.406f,
                    dx2 = 0.546f,
                    dy2 = -0.734f,
                    dx3 = 1.219f,
                    dy3 = -0.734f,
                )
                // s 1.219 0.328 1.219 0.734z
                reflectiveCurveToRelative(
                    dx1 = 1.219f,
                    dy1 = 0.328f,
                    dx2 = 1.219f,
                    dy2 = 0.734f,
                )
                close()
                // M 11.688 13
                moveTo(x = 11.688f, y = 13.0f)
                // s -0.125 -0.875 0.125 -1.25
                reflectiveCurveToRelative(
                    dx1 = -0.125f,
                    dy1 = -0.875f,
                    dx2 = 0.125f,
                    dy2 = -1.25f,
                )
                // s 0.906 -0.719 1.438 -0.844
                reflectiveCurveToRelative(
                    dx1 = 0.906f,
                    dy1 = -0.719f,
                    dx2 = 1.438f,
                    dy2 = -0.844f,
                )
                // C 13.781 10.781 14.5 10 14.5 10
                curveTo(
                    x1 = 13.781f,
                    y1 = 10.781f,
                    x2 = 14.5f,
                    y2 = 10.0f,
                    x3 = 14.5f,
                    y3 = 10.0f,
                )
                // s -0.094 1.156 -0.969 1.875
                reflectiveCurveToRelative(
                    dx1 = -0.094f,
                    dy1 = 1.156f,
                    dx2 = -0.969f,
                    dy2 = 1.875f,
                )
                // c -0.875 0.719 -1.843 1.125 -1.843 1.125z
                curveToRelative(
                    dx1 = -0.875f,
                    dy1 = 0.719f,
                    dx2 = -1.843f,
                    dy2 = 1.125f,
                    dx3 = -1.843f,
                    dy3 = 1.125f,
                )
                close()
                // M 10.922 14.776
                moveTo(x = 10.922f, y = 14.776f)
                // s 0.484 0.312 0.609 0.781
                reflectiveCurveToRelative(
                    dx1 = 0.484f,
                    dy1 = 0.312f,
                    dx2 = 0.609f,
                    dy2 = 0.781f,
                )
                // c 0.125 0.469 0.469 0.969 1.469 0.969
                curveToRelative(
                    dx1 = 0.125f,
                    dy1 = 0.469f,
                    dx2 = 0.469f,
                    dy2 = 0.969f,
                    dx3 = 1.469f,
                    dy3 = 0.969f,
                )
                // v 0.562
                verticalLineToRelative(dy = 0.562f)
                // s -0.844 0.062 -1.312 -0.125
                reflectiveCurveToRelative(
                    dx1 = -0.844f,
                    dy1 = 0.062f,
                    dx2 = -1.312f,
                    dy2 = -0.125f,
                )
                // c -0.469 -0.188 -0.594 -1.062 -0.594 -1.375
                curveToRelative(
                    dx1 = -0.469f,
                    dy1 = -0.188f,
                    dx2 = -0.594f,
                    dy2 = -1.062f,
                    dx3 = -0.594f,
                    dy3 = -1.375f,
                )
                // s -0.172 -0.812 -0.172 -0.812z
                reflectiveCurveToRelative(
                    dx1 = -0.172f,
                    dy1 = -0.812f,
                    dx2 = -0.172f,
                    dy2 = -0.812f,
                )
                close()
                // M 15.109 14.776
                moveTo(x = 15.109f, y = 14.776f)
                // s -0.484 0.312 -0.609 0.781
                reflectiveCurveToRelative(
                    dx1 = -0.484f,
                    dy1 = 0.312f,
                    dx2 = -0.609f,
                    dy2 = 0.781f,
                )
                // c -0.125 0.469 -0.469 0.969 -1.469 0.969
                curveToRelative(
                    dx1 = -0.125f,
                    dy1 = 0.469f,
                    dx2 = -0.469f,
                    dy2 = 0.969f,
                    dx3 = -1.469f,
                    dy3 = 0.969f,
                )
                // v 0.562
                verticalLineToRelative(dy = 0.562f)
                // s 0.844 0.062 1.312 -0.125
                reflectiveCurveToRelative(
                    dx1 = 0.844f,
                    dy1 = 0.062f,
                    dx2 = 1.312f,
                    dy2 = -0.125f,
                )
                // c 0.469 -0.188 0.594 -1.062 0.594 -1.375
                curveToRelative(
                    dx1 = 0.469f,
                    dy1 = -0.188f,
                    dx2 = 0.594f,
                    dy2 = -1.062f,
                    dx3 = 0.594f,
                    dy3 = -1.375f,
                )
                // s 0.172 -0.812 0.172 -0.812z
                reflectiveCurveToRelative(
                    dx1 = 0.172f,
                    dy1 = -0.812f,
                    dx2 = 0.172f,
                    dy2 = -0.812f,
                )
                close()
            }
            // M14.938 21.188 c0 -0.312 -0.141 -1.188 -0.609 -1.375 -0.47 -0.188 -1.329 -0.26 -1.329 -0.26 s-0.844 0.072 -1.312 0.26 c-0.469 0.188 -0.594 1.062 -0.594 1.375 S10.922 23 10.922 23 s0.656 -1.098 0.781 -1.566 c0.125 -0.469 0.641 -1.053 1.297 -1.053 0.672 0 1.203 0.562 1.328 1.031 0.125 0.469 0.774 1.588 0.774 1.588 s-0.164 -1.5 -0.164 -1.812z M13 24 v3 s-0.875 0.094 -2.125 -0.234 -1.484 -0.453 -1.484 -0.453 1.272 -1.273 1.828 -1.75 C11.875 24 13 24 13 24z M13 24 v3 s0.875 0.094 2.125 -0.234 1.484 -0.453 1.484 -0.453 -1.273 -1.273 -1.828 -1.75 C14.125 24 13 24 13 24z
            path(
                fill = SolidColor(Color(0xFF141414)),
            ) {
                // M 14.938 21.188
                moveTo(x = 14.938f, y = 21.188f)
                // c 0 -0.312 -0.141 -1.188 -0.609 -1.375
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.312f,
                    dx2 = -0.141f,
                    dy2 = -1.188f,
                    dx3 = -0.609f,
                    dy3 = -1.375f,
                )
                // c -0.47 -0.188 -1.329 -0.26 -1.329 -0.26
                curveToRelative(
                    dx1 = -0.47f,
                    dy1 = -0.188f,
                    dx2 = -1.329f,
                    dy2 = -0.26f,
                    dx3 = -1.329f,
                    dy3 = -0.26f,
                )
                // s -0.844 0.072 -1.312 0.26
                reflectiveCurveToRelative(
                    dx1 = -0.844f,
                    dy1 = 0.072f,
                    dx2 = -1.312f,
                    dy2 = 0.26f,
                )
                // c -0.469 0.188 -0.594 1.062 -0.594 1.375
                curveToRelative(
                    dx1 = -0.469f,
                    dy1 = 0.188f,
                    dx2 = -0.594f,
                    dy2 = 1.062f,
                    dx3 = -0.594f,
                    dy3 = 1.375f,
                )
                // S 10.922 23 10.922 23
                reflectiveCurveTo(
                    x1 = 10.922f,
                    y1 = 23.0f,
                    x2 = 10.922f,
                    y2 = 23.0f,
                )
                // s 0.656 -1.098 0.781 -1.566
                reflectiveCurveToRelative(
                    dx1 = 0.656f,
                    dy1 = -1.098f,
                    dx2 = 0.781f,
                    dy2 = -1.566f,
                )
                // c 0.125 -0.469 0.641 -1.053 1.297 -1.053
                curveToRelative(
                    dx1 = 0.125f,
                    dy1 = -0.469f,
                    dx2 = 0.641f,
                    dy2 = -1.053f,
                    dx3 = 1.297f,
                    dy3 = -1.053f,
                )
                // c 0.672 0 1.203 0.562 1.328 1.031
                curveToRelative(
                    dx1 = 0.672f,
                    dy1 = 0.0f,
                    dx2 = 1.203f,
                    dy2 = 0.562f,
                    dx3 = 1.328f,
                    dy3 = 1.031f,
                )
                // c 0.125 0.469 0.774 1.588 0.774 1.588
                curveToRelative(
                    dx1 = 0.125f,
                    dy1 = 0.469f,
                    dx2 = 0.774f,
                    dy2 = 1.588f,
                    dx3 = 0.774f,
                    dy3 = 1.588f,
                )
                // s -0.164 -1.5 -0.164 -1.812z
                reflectiveCurveToRelative(
                    dx1 = -0.164f,
                    dy1 = -1.5f,
                    dx2 = -0.164f,
                    dy2 = -1.812f,
                )
                close()
                // M 13 24
                moveTo(x = 13.0f, y = 24.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // s -0.875 0.094 -2.125 -0.234
                reflectiveCurveToRelative(
                    dx1 = -0.875f,
                    dy1 = 0.094f,
                    dx2 = -2.125f,
                    dy2 = -0.234f,
                )
                // s -1.484 -0.453 -1.484 -0.453
                reflectiveCurveToRelative(
                    dx1 = -1.484f,
                    dy1 = -0.453f,
                    dx2 = -1.484f,
                    dy2 = -0.453f,
                )
                // s 1.272 -1.273 1.828 -1.75
                reflectiveCurveToRelative(
                    dx1 = 1.272f,
                    dy1 = -1.273f,
                    dx2 = 1.828f,
                    dy2 = -1.75f,
                )
                // C 11.875 24 13 24 13 24z
                curveTo(
                    x1 = 11.875f,
                    y1 = 24.0f,
                    x2 = 13.0f,
                    y2 = 24.0f,
                    x3 = 13.0f,
                    y3 = 24.0f,
                )
                close()
                // M 13 24
                moveTo(x = 13.0f, y = 24.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // s 0.875 0.094 2.125 -0.234
                reflectiveCurveToRelative(
                    dx1 = 0.875f,
                    dy1 = 0.094f,
                    dx2 = 2.125f,
                    dy2 = -0.234f,
                )
                // s 1.484 -0.453 1.484 -0.453
                reflectiveCurveToRelative(
                    dx1 = 1.484f,
                    dy1 = -0.453f,
                    dx2 = 1.484f,
                    dy2 = -0.453f,
                )
                // s -1.273 -1.273 -1.828 -1.75
                reflectiveCurveToRelative(
                    dx1 = -1.273f,
                    dy1 = -1.273f,
                    dx2 = -1.828f,
                    dy2 = -1.75f,
                )
                // C 14.125 24 13 24 13 24z
                curveTo(
                    x1 = 14.125f,
                    y1 = 24.0f,
                    x2 = 13.0f,
                    y2 = 24.0f,
                    x3 = 13.0f,
                    y3 = 24.0f,
                )
                close()
            }
        }.build().also { _emoji1f1f31f1e8 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1f31f1e8: ImageVector? = null
