package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1f81f1f2: ImageVector
    get() {
        val current = _emoji1f1f81f1f2
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1f81f1f2",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M0 18 v9 c0 2.209 1.791 4 4 4 h28 c2.209 0 4 -1.791 4 -4 v-9 H0z
            path(
                fill = SolidColor(Color(0xFF5EB6E4)),
            ) {
                // M 0 18
                moveTo(x = 0.0f, y = 18.0f)
                // v 9
                verticalLineToRelative(dy = 9.0f)
                // c 0 2.209 1.791 4 4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = 1.791f,
                    dy2 = 4.0f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // c 2.209 0 4 -1.791 4 -4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = -1.791f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // v -9
                verticalLineToRelative(dy = -9.0f)
                // H 0z
                horizontalLineTo(x = 0.0f)
                close()
            }
            // M32 5.041 H4 c-2.209 0 -4 1.791 -4 4 V18 h36 V9.041 c0 -2.209 -1.791 -4 -4 -4z
            path(
                fill = SolidColor(Color(0xFFEEEEEE)),
            ) {
                // M 32 5.041
                moveTo(x = 32.0f, y = 5.041f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // c -2.209 0 -4 1.791 -4 4
                curveToRelative(
                    dx1 = -2.209f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = 1.791f,
                    dx3 = -4.0f,
                    dy3 = 4.0f,
                )
                // V 18
                verticalLineTo(y = 18.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // V 9.041
                verticalLineTo(y = 9.041f)
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
            // M18 14.26 c-2.433 0 -2.656 -0.984 0 -0.984 2.656 -0.001 2.433 0.984 0 0.984z
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 18 14.26
                moveTo(x = 18.0f, y = 14.26f)
                // c -2.433 0 -2.656 -0.984 0 -0.984
                curveToRelative(
                    dx1 = -2.433f,
                    dy1 = 0.0f,
                    dx2 = -2.656f,
                    dy2 = -0.984f,
                    dx3 = 0.0f,
                    dy3 = -0.984f,
                )
                // c 2.656 -0.001 2.433 0.984 0 0.984z
                curveToRelative(
                    dx1 = 2.656f,
                    dy1 = -0.001f,
                    dx2 = 2.433f,
                    dy2 = 0.984f,
                    dx3 = 0.0f,
                    dy3 = 0.984f,
                )
                close()
            }
            // M19.875 13.979 c-0.609 0 -1.094 0.375 -1.531 0.609 -0.125 -0.156 -0.344 -0.141 -0.344 -0.141 s-0.219 -0.016 -0.344 0.141 c-0.438 -0.234 -0.922 -0.609 -1.531 -0.609 s-2.047 0.594 -2.047 3.609 c0 3.969 3.922 5.234 3.922 5.234 s3.922 -1.266 3.922 -5.234 c0 -3.016 -1.438 -3.609 -2.047 -3.609z M15.188 12.65 c0.391 0.078 0.904 0.797 0.904 1.117 0.361 -0.398 1.908 -0.43 1.908 -0.43 s1.547 0.031 1.908 0.43 c0 -0.32 0.514 -1.039 0.904 -1.117 -0.078 -0.156 -0.297 -0.109 -0.297 -0.109 s0.484 -0.828 0.297 -1.219 c-0.188 -0.391 -0.922 -0.375 -1.516 -0.438 -0.594 -0.062 -0.703 -0.328 -0.703 -0.328 l0.156 -0.188 s-0.297 -0.062 -0.234 -0.266 c0.062 -0.203 -0.188 -0.188 -0.188 -0.188 s0.188 -0.188 0.109 -0.359 c-0.078 -0.172 -0.25 -0.219 -0.25 -0.219 s-0.109 -0.25 0 -0.328 c0.109 -0.078 0.359 0.219 0.359 -0.078 s-0.281 -0.047 -0.359 -0.156 c-0.077 -0.108 0.142 -0.389 -0.186 -0.389 s-0.109 0.281 -0.188 0.391 c-0.078 0.109 -0.359 -0.141 -0.359 0.156 s0.25 0 0.359 0.078 c0.109 0.078 0 0.328 0 0.328 s-0.172 0.047 -0.25 0.219 c-0.078 0.172 0.109 0.359 0.109 0.359 s-0.25 -0.016 -0.188 0.188 c0.062 0.203 -0.234 0.266 -0.234 0.266 l0.156 0.188 s-0.109 0.266 -0.703 0.328 -1.328 0.047 -1.516 0.438 c-0.188 0.391 0.297 1.219 0.297 1.219 s-0.217 -0.049 -0.295 0.107z M19.312 11.229 c0.531 0.094 1.391 0.281 0.375 0.953 0.016 -0.234 -0.109 -0.422 -0.109 -0.422 s-0.25 0.031 -0.453 0.219 c-0.087 -0.31 -0.234 -0.406 -0.234 -0.406 s-0.297 0.093 -0.391 0.327 c-0.037 -0.101 -0.088 -0.186 -0.144 -0.257 0.088 -0.153 0.144 -0.361 0.144 -0.591 0 -0.049 -0.012 -0.092 -0.017 -0.139 0.258 0.158 0.572 0.27 0.829 0.316z M16.688 11.229 c0.255 -0.045 0.567 -0.156 0.823 -0.312 -0.005 0.046 -0.016 0.087 -0.016 0.135 0 0.232 0.056 0.442 0.146 0.596 -0.054 0.07 -0.104 0.154 -0.14 0.253 -0.094 -0.234 -0.391 -0.328 -0.391 -0.328 s-0.148 0.097 -0.234 0.406 c-0.203 -0.188 -0.453 -0.219 -0.453 -0.219 s-0.125 0.188 -0.109 0.422 c-1.017 -0.672 -0.158 -0.86 0.374 -0.953z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 19.875 13.979
                moveTo(x = 19.875f, y = 13.979f)
                // c -0.609 0 -1.094 0.375 -1.531 0.609
                curveToRelative(
                    dx1 = -0.609f,
                    dy1 = 0.0f,
                    dx2 = -1.094f,
                    dy2 = 0.375f,
                    dx3 = -1.531f,
                    dy3 = 0.609f,
                )
                // c -0.125 -0.156 -0.344 -0.141 -0.344 -0.141
                curveToRelative(
                    dx1 = -0.125f,
                    dy1 = -0.156f,
                    dx2 = -0.344f,
                    dy2 = -0.141f,
                    dx3 = -0.344f,
                    dy3 = -0.141f,
                )
                // s -0.219 -0.016 -0.344 0.141
                reflectiveCurveToRelative(
                    dx1 = -0.219f,
                    dy1 = -0.016f,
                    dx2 = -0.344f,
                    dy2 = 0.141f,
                )
                // c -0.438 -0.234 -0.922 -0.609 -1.531 -0.609
                curveToRelative(
                    dx1 = -0.438f,
                    dy1 = -0.234f,
                    dx2 = -0.922f,
                    dy2 = -0.609f,
                    dx3 = -1.531f,
                    dy3 = -0.609f,
                )
                // s -2.047 0.594 -2.047 3.609
                reflectiveCurveToRelative(
                    dx1 = -2.047f,
                    dy1 = 0.594f,
                    dx2 = -2.047f,
                    dy2 = 3.609f,
                )
                // c 0 3.969 3.922 5.234 3.922 5.234
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.969f,
                    dx2 = 3.922f,
                    dy2 = 5.234f,
                    dx3 = 3.922f,
                    dy3 = 5.234f,
                )
                // s 3.922 -1.266 3.922 -5.234
                reflectiveCurveToRelative(
                    dx1 = 3.922f,
                    dy1 = -1.266f,
                    dx2 = 3.922f,
                    dy2 = -5.234f,
                )
                // c 0 -3.016 -1.438 -3.609 -2.047 -3.609z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.016f,
                    dx2 = -1.438f,
                    dy2 = -3.609f,
                    dx3 = -2.047f,
                    dy3 = -3.609f,
                )
                close()
                // M 15.188 12.65
                moveTo(x = 15.188f, y = 12.65f)
                // c 0.391 0.078 0.904 0.797 0.904 1.117
                curveToRelative(
                    dx1 = 0.391f,
                    dy1 = 0.078f,
                    dx2 = 0.904f,
                    dy2 = 0.797f,
                    dx3 = 0.904f,
                    dy3 = 1.117f,
                )
                // c 0.361 -0.398 1.908 -0.43 1.908 -0.43
                curveToRelative(
                    dx1 = 0.361f,
                    dy1 = -0.398f,
                    dx2 = 1.908f,
                    dy2 = -0.43f,
                    dx3 = 1.908f,
                    dy3 = -0.43f,
                )
                // s 1.547 0.031 1.908 0.43
                reflectiveCurveToRelative(
                    dx1 = 1.547f,
                    dy1 = 0.031f,
                    dx2 = 1.908f,
                    dy2 = 0.43f,
                )
                // c 0 -0.32 0.514 -1.039 0.904 -1.117
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.32f,
                    dx2 = 0.514f,
                    dy2 = -1.039f,
                    dx3 = 0.904f,
                    dy3 = -1.117f,
                )
                // c -0.078 -0.156 -0.297 -0.109 -0.297 -0.109
                curveToRelative(
                    dx1 = -0.078f,
                    dy1 = -0.156f,
                    dx2 = -0.297f,
                    dy2 = -0.109f,
                    dx3 = -0.297f,
                    dy3 = -0.109f,
                )
                // s 0.484 -0.828 0.297 -1.219
                reflectiveCurveToRelative(
                    dx1 = 0.484f,
                    dy1 = -0.828f,
                    dx2 = 0.297f,
                    dy2 = -1.219f,
                )
                // c -0.188 -0.391 -0.922 -0.375 -1.516 -0.438
                curveToRelative(
                    dx1 = -0.188f,
                    dy1 = -0.391f,
                    dx2 = -0.922f,
                    dy2 = -0.375f,
                    dx3 = -1.516f,
                    dy3 = -0.438f,
                )
                // c -0.594 -0.062 -0.703 -0.328 -0.703 -0.328
                curveToRelative(
                    dx1 = -0.594f,
                    dy1 = -0.062f,
                    dx2 = -0.703f,
                    dy2 = -0.328f,
                    dx3 = -0.703f,
                    dy3 = -0.328f,
                )
                // l 0.156 -0.188
                lineToRelative(dx = 0.156f, dy = -0.188f)
                // s -0.297 -0.062 -0.234 -0.266
                reflectiveCurveToRelative(
                    dx1 = -0.297f,
                    dy1 = -0.062f,
                    dx2 = -0.234f,
                    dy2 = -0.266f,
                )
                // c 0.062 -0.203 -0.188 -0.188 -0.188 -0.188
                curveToRelative(
                    dx1 = 0.062f,
                    dy1 = -0.203f,
                    dx2 = -0.188f,
                    dy2 = -0.188f,
                    dx3 = -0.188f,
                    dy3 = -0.188f,
                )
                // s 0.188 -0.188 0.109 -0.359
                reflectiveCurveToRelative(
                    dx1 = 0.188f,
                    dy1 = -0.188f,
                    dx2 = 0.109f,
                    dy2 = -0.359f,
                )
                // c -0.078 -0.172 -0.25 -0.219 -0.25 -0.219
                curveToRelative(
                    dx1 = -0.078f,
                    dy1 = -0.172f,
                    dx2 = -0.25f,
                    dy2 = -0.219f,
                    dx3 = -0.25f,
                    dy3 = -0.219f,
                )
                // s -0.109 -0.25 0 -0.328
                reflectiveCurveToRelative(
                    dx1 = -0.109f,
                    dy1 = -0.25f,
                    dx2 = 0.0f,
                    dy2 = -0.328f,
                )
                // c 0.109 -0.078 0.359 0.219 0.359 -0.078
                curveToRelative(
                    dx1 = 0.109f,
                    dy1 = -0.078f,
                    dx2 = 0.359f,
                    dy2 = 0.219f,
                    dx3 = 0.359f,
                    dy3 = -0.078f,
                )
                // s -0.281 -0.047 -0.359 -0.156
                reflectiveCurveToRelative(
                    dx1 = -0.281f,
                    dy1 = -0.047f,
                    dx2 = -0.359f,
                    dy2 = -0.156f,
                )
                // c -0.077 -0.108 0.142 -0.389 -0.186 -0.389
                curveToRelative(
                    dx1 = -0.077f,
                    dy1 = -0.108f,
                    dx2 = 0.142f,
                    dy2 = -0.389f,
                    dx3 = -0.186f,
                    dy3 = -0.389f,
                )
                // s -0.109 0.281 -0.188 0.391
                reflectiveCurveToRelative(
                    dx1 = -0.109f,
                    dy1 = 0.281f,
                    dx2 = -0.188f,
                    dy2 = 0.391f,
                )
                // c -0.078 0.109 -0.359 -0.141 -0.359 0.156
                curveToRelative(
                    dx1 = -0.078f,
                    dy1 = 0.109f,
                    dx2 = -0.359f,
                    dy2 = -0.141f,
                    dx3 = -0.359f,
                    dy3 = 0.156f,
                )
                // s 0.25 0 0.359 0.078
                reflectiveCurveToRelative(
                    dx1 = 0.25f,
                    dy1 = 0.0f,
                    dx2 = 0.359f,
                    dy2 = 0.078f,
                )
                // c 0.109 0.078 0 0.328 0 0.328
                curveToRelative(
                    dx1 = 0.109f,
                    dy1 = 0.078f,
                    dx2 = 0.0f,
                    dy2 = 0.328f,
                    dx3 = 0.0f,
                    dy3 = 0.328f,
                )
                // s -0.172 0.047 -0.25 0.219
                reflectiveCurveToRelative(
                    dx1 = -0.172f,
                    dy1 = 0.047f,
                    dx2 = -0.25f,
                    dy2 = 0.219f,
                )
                // c -0.078 0.172 0.109 0.359 0.109 0.359
                curveToRelative(
                    dx1 = -0.078f,
                    dy1 = 0.172f,
                    dx2 = 0.109f,
                    dy2 = 0.359f,
                    dx3 = 0.109f,
                    dy3 = 0.359f,
                )
                // s -0.25 -0.016 -0.188 0.188
                reflectiveCurveToRelative(
                    dx1 = -0.25f,
                    dy1 = -0.016f,
                    dx2 = -0.188f,
                    dy2 = 0.188f,
                )
                // c 0.062 0.203 -0.234 0.266 -0.234 0.266
                curveToRelative(
                    dx1 = 0.062f,
                    dy1 = 0.203f,
                    dx2 = -0.234f,
                    dy2 = 0.266f,
                    dx3 = -0.234f,
                    dy3 = 0.266f,
                )
                // l 0.156 0.188
                lineToRelative(dx = 0.156f, dy = 0.188f)
                // s -0.109 0.266 -0.703 0.328
                reflectiveCurveToRelative(
                    dx1 = -0.109f,
                    dy1 = 0.266f,
                    dx2 = -0.703f,
                    dy2 = 0.328f,
                )
                // s -1.328 0.047 -1.516 0.438
                reflectiveCurveToRelative(
                    dx1 = -1.328f,
                    dy1 = 0.047f,
                    dx2 = -1.516f,
                    dy2 = 0.438f,
                )
                // c -0.188 0.391 0.297 1.219 0.297 1.219
                curveToRelative(
                    dx1 = -0.188f,
                    dy1 = 0.391f,
                    dx2 = 0.297f,
                    dy2 = 1.219f,
                    dx3 = 0.297f,
                    dy3 = 1.219f,
                )
                // s -0.217 -0.049 -0.295 0.107z
                reflectiveCurveToRelative(
                    dx1 = -0.217f,
                    dy1 = -0.049f,
                    dx2 = -0.295f,
                    dy2 = 0.107f,
                )
                close()
                // M 19.312 11.229
                moveTo(x = 19.312f, y = 11.229f)
                // c 0.531 0.094 1.391 0.281 0.375 0.953
                curveToRelative(
                    dx1 = 0.531f,
                    dy1 = 0.094f,
                    dx2 = 1.391f,
                    dy2 = 0.281f,
                    dx3 = 0.375f,
                    dy3 = 0.953f,
                )
                // c 0.016 -0.234 -0.109 -0.422 -0.109 -0.422
                curveToRelative(
                    dx1 = 0.016f,
                    dy1 = -0.234f,
                    dx2 = -0.109f,
                    dy2 = -0.422f,
                    dx3 = -0.109f,
                    dy3 = -0.422f,
                )
                // s -0.25 0.031 -0.453 0.219
                reflectiveCurveToRelative(
                    dx1 = -0.25f,
                    dy1 = 0.031f,
                    dx2 = -0.453f,
                    dy2 = 0.219f,
                )
                // c -0.087 -0.31 -0.234 -0.406 -0.234 -0.406
                curveToRelative(
                    dx1 = -0.087f,
                    dy1 = -0.31f,
                    dx2 = -0.234f,
                    dy2 = -0.406f,
                    dx3 = -0.234f,
                    dy3 = -0.406f,
                )
                // s -0.297 0.093 -0.391 0.327
                reflectiveCurveToRelative(
                    dx1 = -0.297f,
                    dy1 = 0.093f,
                    dx2 = -0.391f,
                    dy2 = 0.327f,
                )
                // c -0.037 -0.101 -0.088 -0.186 -0.144 -0.257
                curveToRelative(
                    dx1 = -0.037f,
                    dy1 = -0.101f,
                    dx2 = -0.088f,
                    dy2 = -0.186f,
                    dx3 = -0.144f,
                    dy3 = -0.257f,
                )
                // c 0.088 -0.153 0.144 -0.361 0.144 -0.591
                curveToRelative(
                    dx1 = 0.088f,
                    dy1 = -0.153f,
                    dx2 = 0.144f,
                    dy2 = -0.361f,
                    dx3 = 0.144f,
                    dy3 = -0.591f,
                )
                // c 0 -0.049 -0.012 -0.092 -0.017 -0.139
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.049f,
                    dx2 = -0.012f,
                    dy2 = -0.092f,
                    dx3 = -0.017f,
                    dy3 = -0.139f,
                )
                // c 0.258 0.158 0.572 0.27 0.829 0.316z
                curveToRelative(
                    dx1 = 0.258f,
                    dy1 = 0.158f,
                    dx2 = 0.572f,
                    dy2 = 0.27f,
                    dx3 = 0.829f,
                    dy3 = 0.316f,
                )
                close()
                // M 16.688 11.229
                moveTo(x = 16.688f, y = 11.229f)
                // c 0.255 -0.045 0.567 -0.156 0.823 -0.312
                curveToRelative(
                    dx1 = 0.255f,
                    dy1 = -0.045f,
                    dx2 = 0.567f,
                    dy2 = -0.156f,
                    dx3 = 0.823f,
                    dy3 = -0.312f,
                )
                // c -0.005 0.046 -0.016 0.087 -0.016 0.135
                curveToRelative(
                    dx1 = -0.005f,
                    dy1 = 0.046f,
                    dx2 = -0.016f,
                    dy2 = 0.087f,
                    dx3 = -0.016f,
                    dy3 = 0.135f,
                )
                // c 0 0.232 0.056 0.442 0.146 0.596
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.232f,
                    dx2 = 0.056f,
                    dy2 = 0.442f,
                    dx3 = 0.146f,
                    dy3 = 0.596f,
                )
                // c -0.054 0.07 -0.104 0.154 -0.14 0.253
                curveToRelative(
                    dx1 = -0.054f,
                    dy1 = 0.07f,
                    dx2 = -0.104f,
                    dy2 = 0.154f,
                    dx3 = -0.14f,
                    dy3 = 0.253f,
                )
                // c -0.094 -0.234 -0.391 -0.328 -0.391 -0.328
                curveToRelative(
                    dx1 = -0.094f,
                    dy1 = -0.234f,
                    dx2 = -0.391f,
                    dy2 = -0.328f,
                    dx3 = -0.391f,
                    dy3 = -0.328f,
                )
                // s -0.148 0.097 -0.234 0.406
                reflectiveCurveToRelative(
                    dx1 = -0.148f,
                    dy1 = 0.097f,
                    dx2 = -0.234f,
                    dy2 = 0.406f,
                )
                // c -0.203 -0.188 -0.453 -0.219 -0.453 -0.219
                curveToRelative(
                    dx1 = -0.203f,
                    dy1 = -0.188f,
                    dx2 = -0.453f,
                    dy2 = -0.219f,
                    dx3 = -0.453f,
                    dy3 = -0.219f,
                )
                // s -0.125 0.188 -0.109 0.422
                reflectiveCurveToRelative(
                    dx1 = -0.125f,
                    dy1 = 0.188f,
                    dx2 = -0.109f,
                    dy2 = 0.422f,
                )
                // c -1.017 -0.672 -0.158 -0.86 0.374 -0.953z
                curveToRelative(
                    dx1 = -1.017f,
                    dy1 = -0.672f,
                    dx2 = -0.158f,
                    dy2 = -0.86f,
                    dx3 = 0.374f,
                    dy3 = -0.953f,
                )
                close()
            }
            // M20.887 17.979 c0 -2.328 -0.672 -2.594 -0.672 -2.594 s-0.324 0.391 -0.787 0.234 c-0.463 -0.156 -1.119 -0.672 -1.119 -0.672 s-0.115 0.146 -0.326 0.154 c-0.211 -0.007 -0.327 -0.154 -0.327 -0.154 s-0.656 0.516 -1.118 0.672 c-0.462 0.156 -0.788 -0.234 -0.788 -0.234 s-0.672 0.266 -0.672 2.594 c0 2.202 2.608 4.276 2.891 4.494 v0.021 l0.014 -0.011 0.014 0.011 v-0.021 c0.282 -0.218 2.89 -2.292 2.89 -4.494z
            path(
                fill = SolidColor(Color(0xFFA0CFEB)),
            ) {
                // M 20.887 17.979
                moveTo(x = 20.887f, y = 17.979f)
                // c 0 -2.328 -0.672 -2.594 -0.672 -2.594
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.328f,
                    dx2 = -0.672f,
                    dy2 = -2.594f,
                    dx3 = -0.672f,
                    dy3 = -2.594f,
                )
                // s -0.324 0.391 -0.787 0.234
                reflectiveCurveToRelative(
                    dx1 = -0.324f,
                    dy1 = 0.391f,
                    dx2 = -0.787f,
                    dy2 = 0.234f,
                )
                // c -0.463 -0.156 -1.119 -0.672 -1.119 -0.672
                curveToRelative(
                    dx1 = -0.463f,
                    dy1 = -0.156f,
                    dx2 = -1.119f,
                    dy2 = -0.672f,
                    dx3 = -1.119f,
                    dy3 = -0.672f,
                )
                // s -0.115 0.146 -0.326 0.154
                reflectiveCurveToRelative(
                    dx1 = -0.115f,
                    dy1 = 0.146f,
                    dx2 = -0.326f,
                    dy2 = 0.154f,
                )
                // c -0.211 -0.007 -0.327 -0.154 -0.327 -0.154
                curveToRelative(
                    dx1 = -0.211f,
                    dy1 = -0.007f,
                    dx2 = -0.327f,
                    dy2 = -0.154f,
                    dx3 = -0.327f,
                    dy3 = -0.154f,
                )
                // s -0.656 0.516 -1.118 0.672
                reflectiveCurveToRelative(
                    dx1 = -0.656f,
                    dy1 = 0.516f,
                    dx2 = -1.118f,
                    dy2 = 0.672f,
                )
                // c -0.462 0.156 -0.788 -0.234 -0.788 -0.234
                curveToRelative(
                    dx1 = -0.462f,
                    dy1 = 0.156f,
                    dx2 = -0.788f,
                    dy2 = -0.234f,
                    dx3 = -0.788f,
                    dy3 = -0.234f,
                )
                // s -0.672 0.266 -0.672 2.594
                reflectiveCurveToRelative(
                    dx1 = -0.672f,
                    dy1 = 0.266f,
                    dx2 = -0.672f,
                    dy2 = 2.594f,
                )
                // c 0 2.202 2.608 4.276 2.891 4.494
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.202f,
                    dx2 = 2.608f,
                    dy2 = 4.276f,
                    dx3 = 2.891f,
                    dy3 = 4.494f,
                )
                // v 0.021
                verticalLineToRelative(dy = 0.021f)
                // l 0.014 -0.011
                lineToRelative(dx = 0.014f, dy = -0.011f)
                // l 0.014 0.011
                lineToRelative(dx = 0.014f, dy = 0.011f)
                // v -0.021
                verticalLineToRelative(dy = -0.021f)
                // c 0.282 -0.218 2.89 -2.292 2.89 -4.494z
                curveToRelative(
                    dx1 = 0.282f,
                    dy1 = -0.218f,
                    dx2 = 2.89f,
                    dy2 = -2.292f,
                    dx3 = 2.89f,
                    dy3 = -4.494f,
                )
                close()
            }
            // M17.312 20.197 c0.156 -0.453 0.25 -0.75 0.25 -1.016 L17.562 18.04 s-0.25 -0.125 -0.25 -0.266 v-0.422 l0.25 -0.094 v0.281 l0.25 -0.094 v-0.25 L18 17.195 v0.266 l0.219 0.047 v-0.234 l0.281 0.078 v0.391 s-0.219 0.234 -0.219 0.297 v1.141 c0 0.109 0.328 1.016 0.328 1.016 h-1.297z M17.961 16.979 s-0.07 -0.297 -0.242 -0.547 c-0.172 -0.25 -0.115 -0.718 0.264 -0.719 0.705 -0.001 0.236 0.633 0.236 0.633 s-0.156 -0.32 -0.219 -0.227 c-0.062 0.094 0.164 0.453 0.062 0.656 s-0.101 0.204 -0.101 0.204z M16.383 17.26 s-0.07 -0.297 -0.242 -0.547 c-0.172 -0.25 -0.115 -0.718 0.264 -0.719 0.705 -0.001 0.236 0.633 0.236 0.633 s-0.156 -0.32 -0.219 -0.226 c-0.062 0.094 0.164 0.453 0.062 0.656 l-0.101 0.203z M19.514 17.26 s-0.07 -0.297 -0.242 -0.547 -0.115 -0.718 0.264 -0.719 c0.705 -0.001 0.236 0.633 0.236 0.633 s-0.156 -0.32 -0.219 -0.226 c-0.062 0.094 0.164 0.453 0.062 0.656 l-0.101 0.203z M15.852 20.125 c0.084 -0.268 0.132 -0.473 0.132 -0.662 v-1.141 s-0.25 -0.125 -0.25 -0.266 v-0.422 l0.25 -0.094 v0.281 l0.25 -0.094 v-0.25 h0.188 v0.266 l0.219 0.047 v-0.234 l0.281 0.078 v0.391 s-0.219 0.234 -0.219 0.297 v1.141 c0 0.11 0.328 1.016 0.328 1.016 s-1.213 -0.247 -1.179 -0.354z M18.865 20.479 c0.156 -0.453 0.25 -0.75 0.25 -1.016 v-1.141 s-0.25 -0.125 -0.25 -0.266 v-0.422 l0.25 -0.094 v0.281 l0.25 -0.094 v-0.25 h0.188 v0.266 l0.219 0.047 v-0.234 l0.281 0.078 v0.391 s-0.219 0.234 -0.219 0.297 v1.141 c0 0.068 0.131 0.457 0.228 0.733 0.055 0.16 -1.197 0.283 -1.197 0.283z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 17.312 20.197
                moveTo(x = 17.312f, y = 20.197f)
                // c 0.156 -0.453 0.25 -0.75 0.25 -1.016
                curveToRelative(
                    dx1 = 0.156f,
                    dy1 = -0.453f,
                    dx2 = 0.25f,
                    dy2 = -0.75f,
                    dx3 = 0.25f,
                    dy3 = -1.016f,
                )
                // L 17.562 18.04
                lineTo(x = 17.562f, y = 18.04f)
                // s -0.25 -0.125 -0.25 -0.266
                reflectiveCurveToRelative(
                    dx1 = -0.25f,
                    dy1 = -0.125f,
                    dx2 = -0.25f,
                    dy2 = -0.266f,
                )
                // v -0.422
                verticalLineToRelative(dy = -0.422f)
                // l 0.25 -0.094
                lineToRelative(dx = 0.25f, dy = -0.094f)
                // v 0.281
                verticalLineToRelative(dy = 0.281f)
                // l 0.25 -0.094
                lineToRelative(dx = 0.25f, dy = -0.094f)
                // v -0.25
                verticalLineToRelative(dy = -0.25f)
                // L 18 17.195
                lineTo(x = 18.0f, y = 17.195f)
                // v 0.266
                verticalLineToRelative(dy = 0.266f)
                // l 0.219 0.047
                lineToRelative(dx = 0.219f, dy = 0.047f)
                // v -0.234
                verticalLineToRelative(dy = -0.234f)
                // l 0.281 0.078
                lineToRelative(dx = 0.281f, dy = 0.078f)
                // v 0.391
                verticalLineToRelative(dy = 0.391f)
                // s -0.219 0.234 -0.219 0.297
                reflectiveCurveToRelative(
                    dx1 = -0.219f,
                    dy1 = 0.234f,
                    dx2 = -0.219f,
                    dy2 = 0.297f,
                )
                // v 1.141
                verticalLineToRelative(dy = 1.141f)
                // c 0 0.109 0.328 1.016 0.328 1.016
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.109f,
                    dx2 = 0.328f,
                    dy2 = 1.016f,
                    dx3 = 0.328f,
                    dy3 = 1.016f,
                )
                // h -1.297z
                horizontalLineToRelative(dx = -1.297f)
                close()
                // M 17.961 16.979
                moveTo(x = 17.961f, y = 16.979f)
                // s -0.07 -0.297 -0.242 -0.547
                reflectiveCurveToRelative(
                    dx1 = -0.07f,
                    dy1 = -0.297f,
                    dx2 = -0.242f,
                    dy2 = -0.547f,
                )
                // c -0.172 -0.25 -0.115 -0.718 0.264 -0.719
                curveToRelative(
                    dx1 = -0.172f,
                    dy1 = -0.25f,
                    dx2 = -0.115f,
                    dy2 = -0.718f,
                    dx3 = 0.264f,
                    dy3 = -0.719f,
                )
                // c 0.705 -0.001 0.236 0.633 0.236 0.633
                curveToRelative(
                    dx1 = 0.705f,
                    dy1 = -0.001f,
                    dx2 = 0.236f,
                    dy2 = 0.633f,
                    dx3 = 0.236f,
                    dy3 = 0.633f,
                )
                // s -0.156 -0.32 -0.219 -0.227
                reflectiveCurveToRelative(
                    dx1 = -0.156f,
                    dy1 = -0.32f,
                    dx2 = -0.219f,
                    dy2 = -0.227f,
                )
                // c -0.062 0.094 0.164 0.453 0.062 0.656
                curveToRelative(
                    dx1 = -0.062f,
                    dy1 = 0.094f,
                    dx2 = 0.164f,
                    dy2 = 0.453f,
                    dx3 = 0.062f,
                    dy3 = 0.656f,
                )
                // s -0.101 0.204 -0.101 0.204z
                reflectiveCurveToRelative(
                    dx1 = -0.101f,
                    dy1 = 0.204f,
                    dx2 = -0.101f,
                    dy2 = 0.204f,
                )
                close()
                // M 16.383 17.26
                moveTo(x = 16.383f, y = 17.26f)
                // s -0.07 -0.297 -0.242 -0.547
                reflectiveCurveToRelative(
                    dx1 = -0.07f,
                    dy1 = -0.297f,
                    dx2 = -0.242f,
                    dy2 = -0.547f,
                )
                // c -0.172 -0.25 -0.115 -0.718 0.264 -0.719
                curveToRelative(
                    dx1 = -0.172f,
                    dy1 = -0.25f,
                    dx2 = -0.115f,
                    dy2 = -0.718f,
                    dx3 = 0.264f,
                    dy3 = -0.719f,
                )
                // c 0.705 -0.001 0.236 0.633 0.236 0.633
                curveToRelative(
                    dx1 = 0.705f,
                    dy1 = -0.001f,
                    dx2 = 0.236f,
                    dy2 = 0.633f,
                    dx3 = 0.236f,
                    dy3 = 0.633f,
                )
                // s -0.156 -0.32 -0.219 -0.226
                reflectiveCurveToRelative(
                    dx1 = -0.156f,
                    dy1 = -0.32f,
                    dx2 = -0.219f,
                    dy2 = -0.226f,
                )
                // c -0.062 0.094 0.164 0.453 0.062 0.656
                curveToRelative(
                    dx1 = -0.062f,
                    dy1 = 0.094f,
                    dx2 = 0.164f,
                    dy2 = 0.453f,
                    dx3 = 0.062f,
                    dy3 = 0.656f,
                )
                // l -0.101 0.203z
                lineToRelative(dx = -0.101f, dy = 0.203f)
                close()
                // M 19.514 17.26
                moveTo(x = 19.514f, y = 17.26f)
                // s -0.07 -0.297 -0.242 -0.547
                reflectiveCurveToRelative(
                    dx1 = -0.07f,
                    dy1 = -0.297f,
                    dx2 = -0.242f,
                    dy2 = -0.547f,
                )
                // s -0.115 -0.718 0.264 -0.719
                reflectiveCurveToRelative(
                    dx1 = -0.115f,
                    dy1 = -0.718f,
                    dx2 = 0.264f,
                    dy2 = -0.719f,
                )
                // c 0.705 -0.001 0.236 0.633 0.236 0.633
                curveToRelative(
                    dx1 = 0.705f,
                    dy1 = -0.001f,
                    dx2 = 0.236f,
                    dy2 = 0.633f,
                    dx3 = 0.236f,
                    dy3 = 0.633f,
                )
                // s -0.156 -0.32 -0.219 -0.226
                reflectiveCurveToRelative(
                    dx1 = -0.156f,
                    dy1 = -0.32f,
                    dx2 = -0.219f,
                    dy2 = -0.226f,
                )
                // c -0.062 0.094 0.164 0.453 0.062 0.656
                curveToRelative(
                    dx1 = -0.062f,
                    dy1 = 0.094f,
                    dx2 = 0.164f,
                    dy2 = 0.453f,
                    dx3 = 0.062f,
                    dy3 = 0.656f,
                )
                // l -0.101 0.203z
                lineToRelative(dx = -0.101f, dy = 0.203f)
                close()
                // M 15.852 20.125
                moveTo(x = 15.852f, y = 20.125f)
                // c 0.084 -0.268 0.132 -0.473 0.132 -0.662
                curveToRelative(
                    dx1 = 0.084f,
                    dy1 = -0.268f,
                    dx2 = 0.132f,
                    dy2 = -0.473f,
                    dx3 = 0.132f,
                    dy3 = -0.662f,
                )
                // v -1.141
                verticalLineToRelative(dy = -1.141f)
                // s -0.25 -0.125 -0.25 -0.266
                reflectiveCurveToRelative(
                    dx1 = -0.25f,
                    dy1 = -0.125f,
                    dx2 = -0.25f,
                    dy2 = -0.266f,
                )
                // v -0.422
                verticalLineToRelative(dy = -0.422f)
                // l 0.25 -0.094
                lineToRelative(dx = 0.25f, dy = -0.094f)
                // v 0.281
                verticalLineToRelative(dy = 0.281f)
                // l 0.25 -0.094
                lineToRelative(dx = 0.25f, dy = -0.094f)
                // v -0.25
                verticalLineToRelative(dy = -0.25f)
                // h 0.188
                horizontalLineToRelative(dx = 0.188f)
                // v 0.266
                verticalLineToRelative(dy = 0.266f)
                // l 0.219 0.047
                lineToRelative(dx = 0.219f, dy = 0.047f)
                // v -0.234
                verticalLineToRelative(dy = -0.234f)
                // l 0.281 0.078
                lineToRelative(dx = 0.281f, dy = 0.078f)
                // v 0.391
                verticalLineToRelative(dy = 0.391f)
                // s -0.219 0.234 -0.219 0.297
                reflectiveCurveToRelative(
                    dx1 = -0.219f,
                    dy1 = 0.234f,
                    dx2 = -0.219f,
                    dy2 = 0.297f,
                )
                // v 1.141
                verticalLineToRelative(dy = 1.141f)
                // c 0 0.11 0.328 1.016 0.328 1.016
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.11f,
                    dx2 = 0.328f,
                    dy2 = 1.016f,
                    dx3 = 0.328f,
                    dy3 = 1.016f,
                )
                // s -1.213 -0.247 -1.179 -0.354z
                reflectiveCurveToRelative(
                    dx1 = -1.213f,
                    dy1 = -0.247f,
                    dx2 = -1.179f,
                    dy2 = -0.354f,
                )
                close()
                // M 18.865 20.479
                moveTo(x = 18.865f, y = 20.479f)
                // c 0.156 -0.453 0.25 -0.75 0.25 -1.016
                curveToRelative(
                    dx1 = 0.156f,
                    dy1 = -0.453f,
                    dx2 = 0.25f,
                    dy2 = -0.75f,
                    dx3 = 0.25f,
                    dy3 = -1.016f,
                )
                // v -1.141
                verticalLineToRelative(dy = -1.141f)
                // s -0.25 -0.125 -0.25 -0.266
                reflectiveCurveToRelative(
                    dx1 = -0.25f,
                    dy1 = -0.125f,
                    dx2 = -0.25f,
                    dy2 = -0.266f,
                )
                // v -0.422
                verticalLineToRelative(dy = -0.422f)
                // l 0.25 -0.094
                lineToRelative(dx = 0.25f, dy = -0.094f)
                // v 0.281
                verticalLineToRelative(dy = 0.281f)
                // l 0.25 -0.094
                lineToRelative(dx = 0.25f, dy = -0.094f)
                // v -0.25
                verticalLineToRelative(dy = -0.25f)
                // h 0.188
                horizontalLineToRelative(dx = 0.188f)
                // v 0.266
                verticalLineToRelative(dy = 0.266f)
                // l 0.219 0.047
                lineToRelative(dx = 0.219f, dy = 0.047f)
                // v -0.234
                verticalLineToRelative(dy = -0.234f)
                // l 0.281 0.078
                lineToRelative(dx = 0.281f, dy = 0.078f)
                // v 0.391
                verticalLineToRelative(dy = 0.391f)
                // s -0.219 0.234 -0.219 0.297
                reflectiveCurveToRelative(
                    dx1 = -0.219f,
                    dy1 = 0.234f,
                    dx2 = -0.219f,
                    dy2 = 0.297f,
                )
                // v 1.141
                verticalLineToRelative(dy = 1.141f)
                // c 0 0.068 0.131 0.457 0.228 0.733
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.068f,
                    dx2 = 0.131f,
                    dy2 = 0.457f,
                    dx3 = 0.228f,
                    dy3 = 0.733f,
                )
                // c 0.055 0.16 -1.197 0.283 -1.197 0.283z
                curveToRelative(
                    dx1 = 0.055f,
                    dy1 = 0.16f,
                    dx2 = -1.197f,
                    dy2 = 0.283f,
                    dx3 = -1.197f,
                    dy3 = 0.283f,
                )
                close()
            }
            // M16.383 17.479 h-0.148 v0.25 l-0.25 0.094 v-0.281 l-0.25 0.094 v0.422 c0 0.141 0.25 0.266 0.25 0.266 v1.141 c0 0.189 -0.048 0.395 -0.132 0.662 -0.016 0.051 0.248 0.133 0.531 0.205 v-2.853z M17.951 17.197 h-0.149 v0.25 l-0.25 0.094 v-0.281 l-0.25 0.094 v0.422 c0 0.141 0.25 0.266 0.25 0.266 v1.141 c0 0.189 -0.048 0.395 -0.132 0.662 -0.016 0.051 0.249 0.133 0.531 0.205 v-2.853z M19.552 17.525 l-0.196 -0.047 v0.25 l-0.25 0.094 v-0.281 l-0.25 0.094 v0.422 c0 0.141 0.25 0.266 0.25 0.266 v1.141 c0 0.189 -0.049 0.395 -0.133 0.662 -0.016 0.051 0.248 0.133 0.579 0.252 v-2.853z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 16.383 17.479
                moveTo(x = 16.383f, y = 17.479f)
                // h -0.148
                horizontalLineToRelative(dx = -0.148f)
                // v 0.25
                verticalLineToRelative(dy = 0.25f)
                // l -0.25 0.094
                lineToRelative(dx = -0.25f, dy = 0.094f)
                // v -0.281
                verticalLineToRelative(dy = -0.281f)
                // l -0.25 0.094
                lineToRelative(dx = -0.25f, dy = 0.094f)
                // v 0.422
                verticalLineToRelative(dy = 0.422f)
                // c 0 0.141 0.25 0.266 0.25 0.266
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.141f,
                    dx2 = 0.25f,
                    dy2 = 0.266f,
                    dx3 = 0.25f,
                    dy3 = 0.266f,
                )
                // v 1.141
                verticalLineToRelative(dy = 1.141f)
                // c 0 0.189 -0.048 0.395 -0.132 0.662
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.189f,
                    dx2 = -0.048f,
                    dy2 = 0.395f,
                    dx3 = -0.132f,
                    dy3 = 0.662f,
                )
                // c -0.016 0.051 0.248 0.133 0.531 0.205
                curveToRelative(
                    dx1 = -0.016f,
                    dy1 = 0.051f,
                    dx2 = 0.248f,
                    dy2 = 0.133f,
                    dx3 = 0.531f,
                    dy3 = 0.205f,
                )
                // v -2.853z
                verticalLineToRelative(dy = -2.853f)
                close()
                // M 17.951 17.197
                moveTo(x = 17.951f, y = 17.197f)
                // h -0.149
                horizontalLineToRelative(dx = -0.149f)
                // v 0.25
                verticalLineToRelative(dy = 0.25f)
                // l -0.25 0.094
                lineToRelative(dx = -0.25f, dy = 0.094f)
                // v -0.281
                verticalLineToRelative(dy = -0.281f)
                // l -0.25 0.094
                lineToRelative(dx = -0.25f, dy = 0.094f)
                // v 0.422
                verticalLineToRelative(dy = 0.422f)
                // c 0 0.141 0.25 0.266 0.25 0.266
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.141f,
                    dx2 = 0.25f,
                    dy2 = 0.266f,
                    dx3 = 0.25f,
                    dy3 = 0.266f,
                )
                // v 1.141
                verticalLineToRelative(dy = 1.141f)
                // c 0 0.189 -0.048 0.395 -0.132 0.662
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.189f,
                    dx2 = -0.048f,
                    dy2 = 0.395f,
                    dx3 = -0.132f,
                    dy3 = 0.662f,
                )
                // c -0.016 0.051 0.249 0.133 0.531 0.205
                curveToRelative(
                    dx1 = -0.016f,
                    dy1 = 0.051f,
                    dx2 = 0.249f,
                    dy2 = 0.133f,
                    dx3 = 0.531f,
                    dy3 = 0.205f,
                )
                // v -2.853z
                verticalLineToRelative(dy = -2.853f)
                close()
                // M 19.552 17.525
                moveTo(x = 19.552f, y = 17.525f)
                // l -0.196 -0.047
                lineToRelative(dx = -0.196f, dy = -0.047f)
                // v 0.25
                verticalLineToRelative(dy = 0.25f)
                // l -0.25 0.094
                lineToRelative(dx = -0.25f, dy = 0.094f)
                // v -0.281
                verticalLineToRelative(dy = -0.281f)
                // l -0.25 0.094
                lineToRelative(dx = -0.25f, dy = 0.094f)
                // v 0.422
                verticalLineToRelative(dy = 0.422f)
                // c 0 0.141 0.25 0.266 0.25 0.266
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.141f,
                    dx2 = 0.25f,
                    dy2 = 0.266f,
                    dx3 = 0.25f,
                    dy3 = 0.266f,
                )
                // v 1.141
                verticalLineToRelative(dy = 1.141f)
                // c 0 0.189 -0.049 0.395 -0.133 0.662
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.189f,
                    dx2 = -0.049f,
                    dy2 = 0.395f,
                    dx3 = -0.133f,
                    dy3 = 0.662f,
                )
                // c -0.016 0.051 0.248 0.133 0.579 0.252
                curveToRelative(
                    dx1 = -0.016f,
                    dy1 = 0.051f,
                    dx2 = 0.248f,
                    dy2 = 0.133f,
                    dx3 = 0.579f,
                    dy3 = 0.252f,
                )
                // v -2.853z
                verticalLineToRelative(dy = -2.853f)
                close()
            }
            // M18.984 20.033 s-0.328 -0.422 -0.984 -0.422 c-0.656 0 -0.938 0.438 -0.938 0.438 s-0.579 -0.228 -1.251 0.093 c0.794 1.249 1.973 2.189 2.157 2.331 v0.021 l0.014 -0.011 0.014 0.011 v-0.021 c0.185 -0.142 1.371 -1.09 2.165 -2.345 -0.716 -0.304 -1.177 -0.095 -1.177 -0.095z
            path(
                fill = SolidColor(Color(0xFF8BB273)),
            ) {
                // M 18.984 20.033
                moveTo(x = 18.984f, y = 20.033f)
                // s -0.328 -0.422 -0.984 -0.422
                reflectiveCurveToRelative(
                    dx1 = -0.328f,
                    dy1 = -0.422f,
                    dx2 = -0.984f,
                    dy2 = -0.422f,
                )
                // c -0.656 0 -0.938 0.438 -0.938 0.438
                curveToRelative(
                    dx1 = -0.656f,
                    dy1 = 0.0f,
                    dx2 = -0.938f,
                    dy2 = 0.438f,
                    dx3 = -0.938f,
                    dy3 = 0.438f,
                )
                // s -0.579 -0.228 -1.251 0.093
                reflectiveCurveToRelative(
                    dx1 = -0.579f,
                    dy1 = -0.228f,
                    dx2 = -1.251f,
                    dy2 = 0.093f,
                )
                // c 0.794 1.249 1.973 2.189 2.157 2.331
                curveToRelative(
                    dx1 = 0.794f,
                    dy1 = 1.249f,
                    dx2 = 1.973f,
                    dy2 = 2.189f,
                    dx3 = 2.157f,
                    dy3 = 2.331f,
                )
                // v 0.021
                verticalLineToRelative(dy = 0.021f)
                // l 0.014 -0.011
                lineToRelative(dx = 0.014f, dy = -0.011f)
                // l 0.014 0.011
                lineToRelative(dx = 0.014f, dy = 0.011f)
                // v -0.021
                verticalLineToRelative(dy = -0.021f)
                // c 0.185 -0.142 1.371 -1.09 2.165 -2.345
                curveToRelative(
                    dx1 = 0.185f,
                    dy1 = -0.142f,
                    dx2 = 1.371f,
                    dy2 = -1.09f,
                    dx3 = 2.165f,
                    dy3 = -2.345f,
                )
                // c -0.716 -0.304 -1.177 -0.095 -1.177 -0.095z
                curveToRelative(
                    dx1 = -0.716f,
                    dy1 = -0.304f,
                    dx2 = -1.177f,
                    dy2 = -0.095f,
                    dx3 = -1.177f,
                    dy3 = -0.095f,
                )
                close()
            }
            // M18.855 24.541 c-0.442 -0.723 -0.839 -1.547 -1.917 -2.047 s-1.25 -0.641 -1.562 -1.156 -0.922 -0.859 -0.922 -0.859 0.016 -0.484 -0.188 -0.797 c-0.203 -0.312 -0.188 -0.703 -0.188 -0.703 s-0.25 0.133 -0.188 -0.355 -0.25 -0.816 -0.25 -0.816 0.391 -0.516 0.062 -1.18 c0.375 -0.648 0.203 -1.383 0.203 -1.383 s0.328 -0.609 0 -1.266 c-1.047 0.438 -1.109 1.828 -1.109 1.828 l-0.594 -0.859 s-0.5 0.328 -0.375 0.938 c0.125 0.609 0.094 0.742 0.094 0.742 l-0.562 -0.476 s-0.406 0.672 0.156 1.203 0.656 0.688 0.656 0.688 -0.281 -0.156 -0.281 0.094 0.062 0.359 0.062 0.359 l-0.736 -0.609 s-0.217 0.828 0.298 1.297 c0.516 0.469 0.828 0.641 0.828 0.641 s-0.984 -0.281 -0.969 -0.211 c0.016 0.07 0.203 0.586 0.703 0.867 0.5 0.281 0.875 0.391 0.875 0.391 l-1.016 0.184 s0.25 0.723 0.844 0.723 1.156 -0.188 1.156 -0.188 -0.422 0.344 -0.547 0.609 c-0.125 0.266 -0.484 0.297 -0.484 0.297 s0.328 0.344 0.938 0.234 c0.609 -0.109 0.688 -0.938 1.438 -0.672 0.75 0.266 2.094 0.75 2.531 1.422 s0.594 0.828 0.688 1.062 c0.095 0.232 0.485 0.209 0.356 -0.002z
            path(
                fill = SolidColor(Color(0xFF658D5C)),
            ) {
                // M 18.855 24.541
                moveTo(x = 18.855f, y = 24.541f)
                // c -0.442 -0.723 -0.839 -1.547 -1.917 -2.047
                curveToRelative(
                    dx1 = -0.442f,
                    dy1 = -0.723f,
                    dx2 = -0.839f,
                    dy2 = -1.547f,
                    dx3 = -1.917f,
                    dy3 = -2.047f,
                )
                // s -1.25 -0.641 -1.562 -1.156
                reflectiveCurveToRelative(
                    dx1 = -1.25f,
                    dy1 = -0.641f,
                    dx2 = -1.562f,
                    dy2 = -1.156f,
                )
                // s -0.922 -0.859 -0.922 -0.859
                reflectiveCurveToRelative(
                    dx1 = -0.922f,
                    dy1 = -0.859f,
                    dx2 = -0.922f,
                    dy2 = -0.859f,
                )
                // s 0.016 -0.484 -0.188 -0.797
                reflectiveCurveToRelative(
                    dx1 = 0.016f,
                    dy1 = -0.484f,
                    dx2 = -0.188f,
                    dy2 = -0.797f,
                )
                // c -0.203 -0.312 -0.188 -0.703 -0.188 -0.703
                curveToRelative(
                    dx1 = -0.203f,
                    dy1 = -0.312f,
                    dx2 = -0.188f,
                    dy2 = -0.703f,
                    dx3 = -0.188f,
                    dy3 = -0.703f,
                )
                // s -0.25 0.133 -0.188 -0.355
                reflectiveCurveToRelative(
                    dx1 = -0.25f,
                    dy1 = 0.133f,
                    dx2 = -0.188f,
                    dy2 = -0.355f,
                )
                // s -0.25 -0.816 -0.25 -0.816
                reflectiveCurveToRelative(
                    dx1 = -0.25f,
                    dy1 = -0.816f,
                    dx2 = -0.25f,
                    dy2 = -0.816f,
                )
                // s 0.391 -0.516 0.062 -1.18
                reflectiveCurveToRelative(
                    dx1 = 0.391f,
                    dy1 = -0.516f,
                    dx2 = 0.062f,
                    dy2 = -1.18f,
                )
                // c 0.375 -0.648 0.203 -1.383 0.203 -1.383
                curveToRelative(
                    dx1 = 0.375f,
                    dy1 = -0.648f,
                    dx2 = 0.203f,
                    dy2 = -1.383f,
                    dx3 = 0.203f,
                    dy3 = -1.383f,
                )
                // s 0.328 -0.609 0 -1.266
                reflectiveCurveToRelative(
                    dx1 = 0.328f,
                    dy1 = -0.609f,
                    dx2 = 0.0f,
                    dy2 = -1.266f,
                )
                // c -1.047 0.438 -1.109 1.828 -1.109 1.828
                curveToRelative(
                    dx1 = -1.047f,
                    dy1 = 0.438f,
                    dx2 = -1.109f,
                    dy2 = 1.828f,
                    dx3 = -1.109f,
                    dy3 = 1.828f,
                )
                // l -0.594 -0.859
                lineToRelative(dx = -0.594f, dy = -0.859f)
                // s -0.5 0.328 -0.375 0.938
                reflectiveCurveToRelative(
                    dx1 = -0.5f,
                    dy1 = 0.328f,
                    dx2 = -0.375f,
                    dy2 = 0.938f,
                )
                // c 0.125 0.609 0.094 0.742 0.094 0.742
                curveToRelative(
                    dx1 = 0.125f,
                    dy1 = 0.609f,
                    dx2 = 0.094f,
                    dy2 = 0.742f,
                    dx3 = 0.094f,
                    dy3 = 0.742f,
                )
                // l -0.562 -0.476
                lineToRelative(dx = -0.562f, dy = -0.476f)
                // s -0.406 0.672 0.156 1.203
                reflectiveCurveToRelative(
                    dx1 = -0.406f,
                    dy1 = 0.672f,
                    dx2 = 0.156f,
                    dy2 = 1.203f,
                )
                // s 0.656 0.688 0.656 0.688
                reflectiveCurveToRelative(
                    dx1 = 0.656f,
                    dy1 = 0.688f,
                    dx2 = 0.656f,
                    dy2 = 0.688f,
                )
                // s -0.281 -0.156 -0.281 0.094
                reflectiveCurveToRelative(
                    dx1 = -0.281f,
                    dy1 = -0.156f,
                    dx2 = -0.281f,
                    dy2 = 0.094f,
                )
                // s 0.062 0.359 0.062 0.359
                reflectiveCurveToRelative(
                    dx1 = 0.062f,
                    dy1 = 0.359f,
                    dx2 = 0.062f,
                    dy2 = 0.359f,
                )
                // l -0.736 -0.609
                lineToRelative(dx = -0.736f, dy = -0.609f)
                // s -0.217 0.828 0.298 1.297
                reflectiveCurveToRelative(
                    dx1 = -0.217f,
                    dy1 = 0.828f,
                    dx2 = 0.298f,
                    dy2 = 1.297f,
                )
                // c 0.516 0.469 0.828 0.641 0.828 0.641
                curveToRelative(
                    dx1 = 0.516f,
                    dy1 = 0.469f,
                    dx2 = 0.828f,
                    dy2 = 0.641f,
                    dx3 = 0.828f,
                    dy3 = 0.641f,
                )
                // s -0.984 -0.281 -0.969 -0.211
                reflectiveCurveToRelative(
                    dx1 = -0.984f,
                    dy1 = -0.281f,
                    dx2 = -0.969f,
                    dy2 = -0.211f,
                )
                // c 0.016 0.07 0.203 0.586 0.703 0.867
                curveToRelative(
                    dx1 = 0.016f,
                    dy1 = 0.07f,
                    dx2 = 0.203f,
                    dy2 = 0.586f,
                    dx3 = 0.703f,
                    dy3 = 0.867f,
                )
                // c 0.5 0.281 0.875 0.391 0.875 0.391
                curveToRelative(
                    dx1 = 0.5f,
                    dy1 = 0.281f,
                    dx2 = 0.875f,
                    dy2 = 0.391f,
                    dx3 = 0.875f,
                    dy3 = 0.391f,
                )
                // l -1.016 0.184
                lineToRelative(dx = -1.016f, dy = 0.184f)
                // s 0.25 0.723 0.844 0.723
                reflectiveCurveToRelative(
                    dx1 = 0.25f,
                    dy1 = 0.723f,
                    dx2 = 0.844f,
                    dy2 = 0.723f,
                )
                // s 1.156 -0.188 1.156 -0.188
                reflectiveCurveToRelative(
                    dx1 = 1.156f,
                    dy1 = -0.188f,
                    dx2 = 1.156f,
                    dy2 = -0.188f,
                )
                // s -0.422 0.344 -0.547 0.609
                reflectiveCurveToRelative(
                    dx1 = -0.422f,
                    dy1 = 0.344f,
                    dx2 = -0.547f,
                    dy2 = 0.609f,
                )
                // c -0.125 0.266 -0.484 0.297 -0.484 0.297
                curveToRelative(
                    dx1 = -0.125f,
                    dy1 = 0.266f,
                    dx2 = -0.484f,
                    dy2 = 0.297f,
                    dx3 = -0.484f,
                    dy3 = 0.297f,
                )
                // s 0.328 0.344 0.938 0.234
                reflectiveCurveToRelative(
                    dx1 = 0.328f,
                    dy1 = 0.344f,
                    dx2 = 0.938f,
                    dy2 = 0.234f,
                )
                // c 0.609 -0.109 0.688 -0.938 1.438 -0.672
                curveToRelative(
                    dx1 = 0.609f,
                    dy1 = -0.109f,
                    dx2 = 0.688f,
                    dy2 = -0.938f,
                    dx3 = 1.438f,
                    dy3 = -0.672f,
                )
                // c 0.75 0.266 2.094 0.75 2.531 1.422
                curveToRelative(
                    dx1 = 0.75f,
                    dy1 = 0.266f,
                    dx2 = 2.094f,
                    dy2 = 0.75f,
                    dx3 = 2.531f,
                    dy3 = 1.422f,
                )
                // s 0.594 0.828 0.688 1.062
                reflectiveCurveToRelative(
                    dx1 = 0.594f,
                    dy1 = 0.828f,
                    dx2 = 0.688f,
                    dy2 = 1.062f,
                )
                // c 0.095 0.232 0.485 0.209 0.356 -0.002z
                curveToRelative(
                    dx1 = 0.095f,
                    dy1 = 0.232f,
                    dx2 = 0.485f,
                    dy2 = 0.209f,
                    dx3 = 0.356f,
                    dy3 = -0.002f,
                )
                close()
            }
            // M17.027 24.541 c0.441 -0.723 0.839 -1.547 1.917 -2.047 1.078 -0.5 1.25 -0.641 1.562 -1.156 s0.922 -0.859 0.922 -0.859 -0.016 -0.484 0.188 -0.797 0.188 -0.703 0.188 -0.703 0.25 0.133 0.188 -0.355 0.25 -0.816 0.25 -0.816 -0.391 -0.516 -0.062 -1.18 c-0.375 -0.648 -0.203 -1.383 -0.203 -1.383 s-0.328 -0.609 0 -1.266 c1.047 0.438 1.109 1.828 1.109 1.828 l0.594 -0.859 s0.5 0.328 0.375 0.938 c-0.125 0.609 -0.094 0.742 -0.094 0.742 l0.562 -0.476 s0.406 0.672 -0.156 1.203 -0.656 0.688 -0.656 0.688 0.281 -0.156 0.281 0.094 -0.062 0.359 -0.062 0.359 l0.735 -0.609 s0.218 0.828 -0.298 1.297 -0.828 0.641 -0.828 0.641 0.984 -0.281 0.969 -0.211 c-0.016 0.07 -0.203 0.586 -0.703 0.867 -0.5 0.281 -0.875 0.391 -0.875 0.391 l1.016 0.184 s-0.25 0.723 -0.844 0.723 -1.156 -0.188 -1.156 -0.188 0.422 0.344 0.547 0.609 c0.125 0.266 0.484 0.297 0.484 0.297 s-0.328 0.344 -0.938 0.234 -0.688 -0.938 -1.438 -0.672 c-0.75 0.266 -2.094 0.75 -2.531 1.422 s-0.594 0.828 -0.688 1.062 c-0.094 0.232 -0.484 0.209 -0.355 -0.002z
            path(
                fill = SolidColor(Color(0xFF658D5C)),
            ) {
                // M 17.027 24.541
                moveTo(x = 17.027f, y = 24.541f)
                // c 0.441 -0.723 0.839 -1.547 1.917 -2.047
                curveToRelative(
                    dx1 = 0.441f,
                    dy1 = -0.723f,
                    dx2 = 0.839f,
                    dy2 = -1.547f,
                    dx3 = 1.917f,
                    dy3 = -2.047f,
                )
                // c 1.078 -0.5 1.25 -0.641 1.562 -1.156
                curveToRelative(
                    dx1 = 1.078f,
                    dy1 = -0.5f,
                    dx2 = 1.25f,
                    dy2 = -0.641f,
                    dx3 = 1.562f,
                    dy3 = -1.156f,
                )
                // s 0.922 -0.859 0.922 -0.859
                reflectiveCurveToRelative(
                    dx1 = 0.922f,
                    dy1 = -0.859f,
                    dx2 = 0.922f,
                    dy2 = -0.859f,
                )
                // s -0.016 -0.484 0.188 -0.797
                reflectiveCurveToRelative(
                    dx1 = -0.016f,
                    dy1 = -0.484f,
                    dx2 = 0.188f,
                    dy2 = -0.797f,
                )
                // s 0.188 -0.703 0.188 -0.703
                reflectiveCurveToRelative(
                    dx1 = 0.188f,
                    dy1 = -0.703f,
                    dx2 = 0.188f,
                    dy2 = -0.703f,
                )
                // s 0.25 0.133 0.188 -0.355
                reflectiveCurveToRelative(
                    dx1 = 0.25f,
                    dy1 = 0.133f,
                    dx2 = 0.188f,
                    dy2 = -0.355f,
                )
                // s 0.25 -0.816 0.25 -0.816
                reflectiveCurveToRelative(
                    dx1 = 0.25f,
                    dy1 = -0.816f,
                    dx2 = 0.25f,
                    dy2 = -0.816f,
                )
                // s -0.391 -0.516 -0.062 -1.18
                reflectiveCurveToRelative(
                    dx1 = -0.391f,
                    dy1 = -0.516f,
                    dx2 = -0.062f,
                    dy2 = -1.18f,
                )
                // c -0.375 -0.648 -0.203 -1.383 -0.203 -1.383
                curveToRelative(
                    dx1 = -0.375f,
                    dy1 = -0.648f,
                    dx2 = -0.203f,
                    dy2 = -1.383f,
                    dx3 = -0.203f,
                    dy3 = -1.383f,
                )
                // s -0.328 -0.609 0 -1.266
                reflectiveCurveToRelative(
                    dx1 = -0.328f,
                    dy1 = -0.609f,
                    dx2 = 0.0f,
                    dy2 = -1.266f,
                )
                // c 1.047 0.438 1.109 1.828 1.109 1.828
                curveToRelative(
                    dx1 = 1.047f,
                    dy1 = 0.438f,
                    dx2 = 1.109f,
                    dy2 = 1.828f,
                    dx3 = 1.109f,
                    dy3 = 1.828f,
                )
                // l 0.594 -0.859
                lineToRelative(dx = 0.594f, dy = -0.859f)
                // s 0.5 0.328 0.375 0.938
                reflectiveCurveToRelative(
                    dx1 = 0.5f,
                    dy1 = 0.328f,
                    dx2 = 0.375f,
                    dy2 = 0.938f,
                )
                // c -0.125 0.609 -0.094 0.742 -0.094 0.742
                curveToRelative(
                    dx1 = -0.125f,
                    dy1 = 0.609f,
                    dx2 = -0.094f,
                    dy2 = 0.742f,
                    dx3 = -0.094f,
                    dy3 = 0.742f,
                )
                // l 0.562 -0.476
                lineToRelative(dx = 0.562f, dy = -0.476f)
                // s 0.406 0.672 -0.156 1.203
                reflectiveCurveToRelative(
                    dx1 = 0.406f,
                    dy1 = 0.672f,
                    dx2 = -0.156f,
                    dy2 = 1.203f,
                )
                // s -0.656 0.688 -0.656 0.688
                reflectiveCurveToRelative(
                    dx1 = -0.656f,
                    dy1 = 0.688f,
                    dx2 = -0.656f,
                    dy2 = 0.688f,
                )
                // s 0.281 -0.156 0.281 0.094
                reflectiveCurveToRelative(
                    dx1 = 0.281f,
                    dy1 = -0.156f,
                    dx2 = 0.281f,
                    dy2 = 0.094f,
                )
                // s -0.062 0.359 -0.062 0.359
                reflectiveCurveToRelative(
                    dx1 = -0.062f,
                    dy1 = 0.359f,
                    dx2 = -0.062f,
                    dy2 = 0.359f,
                )
                // l 0.735 -0.609
                lineToRelative(dx = 0.735f, dy = -0.609f)
                // s 0.218 0.828 -0.298 1.297
                reflectiveCurveToRelative(
                    dx1 = 0.218f,
                    dy1 = 0.828f,
                    dx2 = -0.298f,
                    dy2 = 1.297f,
                )
                // s -0.828 0.641 -0.828 0.641
                reflectiveCurveToRelative(
                    dx1 = -0.828f,
                    dy1 = 0.641f,
                    dx2 = -0.828f,
                    dy2 = 0.641f,
                )
                // s 0.984 -0.281 0.969 -0.211
                reflectiveCurveToRelative(
                    dx1 = 0.984f,
                    dy1 = -0.281f,
                    dx2 = 0.969f,
                    dy2 = -0.211f,
                )
                // c -0.016 0.07 -0.203 0.586 -0.703 0.867
                curveToRelative(
                    dx1 = -0.016f,
                    dy1 = 0.07f,
                    dx2 = -0.203f,
                    dy2 = 0.586f,
                    dx3 = -0.703f,
                    dy3 = 0.867f,
                )
                // c -0.5 0.281 -0.875 0.391 -0.875 0.391
                curveToRelative(
                    dx1 = -0.5f,
                    dy1 = 0.281f,
                    dx2 = -0.875f,
                    dy2 = 0.391f,
                    dx3 = -0.875f,
                    dy3 = 0.391f,
                )
                // l 1.016 0.184
                lineToRelative(dx = 1.016f, dy = 0.184f)
                // s -0.25 0.723 -0.844 0.723
                reflectiveCurveToRelative(
                    dx1 = -0.25f,
                    dy1 = 0.723f,
                    dx2 = -0.844f,
                    dy2 = 0.723f,
                )
                // s -1.156 -0.188 -1.156 -0.188
                reflectiveCurveToRelative(
                    dx1 = -1.156f,
                    dy1 = -0.188f,
                    dx2 = -1.156f,
                    dy2 = -0.188f,
                )
                // s 0.422 0.344 0.547 0.609
                reflectiveCurveToRelative(
                    dx1 = 0.422f,
                    dy1 = 0.344f,
                    dx2 = 0.547f,
                    dy2 = 0.609f,
                )
                // c 0.125 0.266 0.484 0.297 0.484 0.297
                curveToRelative(
                    dx1 = 0.125f,
                    dy1 = 0.266f,
                    dx2 = 0.484f,
                    dy2 = 0.297f,
                    dx3 = 0.484f,
                    dy3 = 0.297f,
                )
                // s -0.328 0.344 -0.938 0.234
                reflectiveCurveToRelative(
                    dx1 = -0.328f,
                    dy1 = 0.344f,
                    dx2 = -0.938f,
                    dy2 = 0.234f,
                )
                // s -0.688 -0.938 -1.438 -0.672
                reflectiveCurveToRelative(
                    dx1 = -0.688f,
                    dy1 = -0.938f,
                    dx2 = -1.438f,
                    dy2 = -0.672f,
                )
                // c -0.75 0.266 -2.094 0.75 -2.531 1.422
                curveToRelative(
                    dx1 = -0.75f,
                    dy1 = 0.266f,
                    dx2 = -2.094f,
                    dy2 = 0.75f,
                    dx3 = -2.531f,
                    dy3 = 1.422f,
                )
                // s -0.594 0.828 -0.688 1.062
                reflectiveCurveToRelative(
                    dx1 = -0.594f,
                    dy1 = 0.828f,
                    dx2 = -0.688f,
                    dy2 = 1.062f,
                )
                // c -0.094 0.232 -0.484 0.209 -0.355 -0.002z
                curveToRelative(
                    dx1 = -0.094f,
                    dy1 = 0.232f,
                    dx2 = -0.484f,
                    dy2 = 0.209f,
                    dx3 = -0.355f,
                    dy3 = -0.002f,
                )
                close()
            }
            // M15.625 23.144 c-0.734 0.085 -0.922 0.569 -1.953 0.116 -0.047 0.234 0.328 0.594 0.328 0.594 s-0.562 0.016 -0.828 -0.078 c0.141 0.578 0.797 0.797 1.344 0.75 0.547 -0.047 0.891 -0.453 1.524 -0.312 0.633 0.141 1.088 0.335 0.962 -0.797 -0.424 -0.454 -1.377 -0.273 -1.377 -0.273z M20.375 23.144 c0.734 0.085 0.922 0.569 1.953 0.116 0.047 0.234 -0.328 0.594 -0.328 0.594 s0.562 0.016 0.828 -0.078 c-0.141 0.578 -0.797 0.797 -1.344 0.75 s-0.891 -0.453 -1.524 -0.312 c-0.633 0.141 -1.088 0.335 -0.962 -0.797 0.424 -0.454 1.377 -0.273 1.377 -0.273z
            path(
                fill = SolidColor(Color(0xFFE1E8ED)),
            ) {
                // M 15.625 23.144
                moveTo(x = 15.625f, y = 23.144f)
                // c -0.734 0.085 -0.922 0.569 -1.953 0.116
                curveToRelative(
                    dx1 = -0.734f,
                    dy1 = 0.085f,
                    dx2 = -0.922f,
                    dy2 = 0.569f,
                    dx3 = -1.953f,
                    dy3 = 0.116f,
                )
                // c -0.047 0.234 0.328 0.594 0.328 0.594
                curveToRelative(
                    dx1 = -0.047f,
                    dy1 = 0.234f,
                    dx2 = 0.328f,
                    dy2 = 0.594f,
                    dx3 = 0.328f,
                    dy3 = 0.594f,
                )
                // s -0.562 0.016 -0.828 -0.078
                reflectiveCurveToRelative(
                    dx1 = -0.562f,
                    dy1 = 0.016f,
                    dx2 = -0.828f,
                    dy2 = -0.078f,
                )
                // c 0.141 0.578 0.797 0.797 1.344 0.75
                curveToRelative(
                    dx1 = 0.141f,
                    dy1 = 0.578f,
                    dx2 = 0.797f,
                    dy2 = 0.797f,
                    dx3 = 1.344f,
                    dy3 = 0.75f,
                )
                // c 0.547 -0.047 0.891 -0.453 1.524 -0.312
                curveToRelative(
                    dx1 = 0.547f,
                    dy1 = -0.047f,
                    dx2 = 0.891f,
                    dy2 = -0.453f,
                    dx3 = 1.524f,
                    dy3 = -0.312f,
                )
                // c 0.633 0.141 1.088 0.335 0.962 -0.797
                curveToRelative(
                    dx1 = 0.633f,
                    dy1 = 0.141f,
                    dx2 = 1.088f,
                    dy2 = 0.335f,
                    dx3 = 0.962f,
                    dy3 = -0.797f,
                )
                // c -0.424 -0.454 -1.377 -0.273 -1.377 -0.273z
                curveToRelative(
                    dx1 = -0.424f,
                    dy1 = -0.454f,
                    dx2 = -1.377f,
                    dy2 = -0.273f,
                    dx3 = -1.377f,
                    dy3 = -0.273f,
                )
                close()
                // M 20.375 23.144
                moveTo(x = 20.375f, y = 23.144f)
                // c 0.734 0.085 0.922 0.569 1.953 0.116
                curveToRelative(
                    dx1 = 0.734f,
                    dy1 = 0.085f,
                    dx2 = 0.922f,
                    dy2 = 0.569f,
                    dx3 = 1.953f,
                    dy3 = 0.116f,
                )
                // c 0.047 0.234 -0.328 0.594 -0.328 0.594
                curveToRelative(
                    dx1 = 0.047f,
                    dy1 = 0.234f,
                    dx2 = -0.328f,
                    dy2 = 0.594f,
                    dx3 = -0.328f,
                    dy3 = 0.594f,
                )
                // s 0.562 0.016 0.828 -0.078
                reflectiveCurveToRelative(
                    dx1 = 0.562f,
                    dy1 = 0.016f,
                    dx2 = 0.828f,
                    dy2 = -0.078f,
                )
                // c -0.141 0.578 -0.797 0.797 -1.344 0.75
                curveToRelative(
                    dx1 = -0.141f,
                    dy1 = 0.578f,
                    dx2 = -0.797f,
                    dy2 = 0.797f,
                    dx3 = -1.344f,
                    dy3 = 0.75f,
                )
                // s -0.891 -0.453 -1.524 -0.312
                reflectiveCurveToRelative(
                    dx1 = -0.891f,
                    dy1 = -0.453f,
                    dx2 = -1.524f,
                    dy2 = -0.312f,
                )
                // c -0.633 0.141 -1.088 0.335 -0.962 -0.797
                curveToRelative(
                    dx1 = -0.633f,
                    dy1 = 0.141f,
                    dx2 = -1.088f,
                    dy2 = 0.335f,
                    dx3 = -0.962f,
                    dy3 = -0.797f,
                )
                // c 0.424 -0.454 1.377 -0.273 1.377 -0.273z
                curveToRelative(
                    dx1 = 0.424f,
                    dy1 = -0.454f,
                    dx2 = 1.377f,
                    dy2 = -0.273f,
                    dx3 = 1.377f,
                    dy3 = -0.273f,
                )
                close()
            }
            // M20.422 22.416 c-0.422 -0.187 -1.344 0.281 -2.422 0.281 s-2 -0.469 -2.422 -0.281 c-0.422 0.188 -0.344 0.25 -0.312 0.406 0.031 0.156 0.078 0.578 0.109 0.812 0.031 0.234 0.281 0.391 0.578 0.188 0.297 -0.203 0.672 -0.297 1.188 -0.141 0.516 0.156 0.834 0.146 0.834 0.146 s0.369 0.01 0.885 -0.146 0.891 -0.062 1.188 0.141 c0.297 0.203 0.547 0.047 0.578 -0.188 0.031 -0.234 0.078 -0.656 0.109 -0.812 0.031 -0.156 0.109 -0.218 -0.313 -0.406z
            path(
                fill = SolidColor(Color(0xFFF5F8FA)),
            ) {
                // M 20.422 22.416
                moveTo(x = 20.422f, y = 22.416f)
                // c -0.422 -0.187 -1.344 0.281 -2.422 0.281
                curveToRelative(
                    dx1 = -0.422f,
                    dy1 = -0.187f,
                    dx2 = -1.344f,
                    dy2 = 0.281f,
                    dx3 = -2.422f,
                    dy3 = 0.281f,
                )
                // s -2 -0.469 -2.422 -0.281
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = -0.469f,
                    dx2 = -2.422f,
                    dy2 = -0.281f,
                )
                // c -0.422 0.188 -0.344 0.25 -0.312 0.406
                curveToRelative(
                    dx1 = -0.422f,
                    dy1 = 0.188f,
                    dx2 = -0.344f,
                    dy2 = 0.25f,
                    dx3 = -0.312f,
                    dy3 = 0.406f,
                )
                // c 0.031 0.156 0.078 0.578 0.109 0.812
                curveToRelative(
                    dx1 = 0.031f,
                    dy1 = 0.156f,
                    dx2 = 0.078f,
                    dy2 = 0.578f,
                    dx3 = 0.109f,
                    dy3 = 0.812f,
                )
                // c 0.031 0.234 0.281 0.391 0.578 0.188
                curveToRelative(
                    dx1 = 0.031f,
                    dy1 = 0.234f,
                    dx2 = 0.281f,
                    dy2 = 0.391f,
                    dx3 = 0.578f,
                    dy3 = 0.188f,
                )
                // c 0.297 -0.203 0.672 -0.297 1.188 -0.141
                curveToRelative(
                    dx1 = 0.297f,
                    dy1 = -0.203f,
                    dx2 = 0.672f,
                    dy2 = -0.297f,
                    dx3 = 1.188f,
                    dy3 = -0.141f,
                )
                // c 0.516 0.156 0.834 0.146 0.834 0.146
                curveToRelative(
                    dx1 = 0.516f,
                    dy1 = 0.156f,
                    dx2 = 0.834f,
                    dy2 = 0.146f,
                    dx3 = 0.834f,
                    dy3 = 0.146f,
                )
                // s 0.369 0.01 0.885 -0.146
                reflectiveCurveToRelative(
                    dx1 = 0.369f,
                    dy1 = 0.01f,
                    dx2 = 0.885f,
                    dy2 = -0.146f,
                )
                // s 0.891 -0.062 1.188 0.141
                reflectiveCurveToRelative(
                    dx1 = 0.891f,
                    dy1 = -0.062f,
                    dx2 = 1.188f,
                    dy2 = 0.141f,
                )
                // c 0.297 0.203 0.547 0.047 0.578 -0.188
                curveToRelative(
                    dx1 = 0.297f,
                    dy1 = 0.203f,
                    dx2 = 0.547f,
                    dy2 = 0.047f,
                    dx3 = 0.578f,
                    dy3 = -0.188f,
                )
                // c 0.031 -0.234 0.078 -0.656 0.109 -0.812
                curveToRelative(
                    dx1 = 0.031f,
                    dy1 = -0.234f,
                    dx2 = 0.078f,
                    dy2 = -0.656f,
                    dx3 = 0.109f,
                    dy3 = -0.812f,
                )
                // c 0.031 -0.156 0.109 -0.218 -0.313 -0.406z
                curveToRelative(
                    dx1 = 0.031f,
                    dy1 = -0.156f,
                    dx2 = 0.109f,
                    dy2 = -0.218f,
                    dx3 = -0.313f,
                    dy3 = -0.406f,
                )
                close()
            }
            // M19.838 22.822 c0 0.096 -0.191 0.48 -1.952 0.48 s-1.892 -0.385 -1.892 -0.48 c0 -0.096 0.288 0.212 2.048 0.212 s1.796 -0.307 1.796 -0.212z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 19.838 22.822
                moveTo(x = 19.838f, y = 22.822f)
                // c 0 0.096 -0.191 0.48 -1.952 0.48
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.096f,
                    dx2 = -0.191f,
                    dy2 = 0.48f,
                    dx3 = -1.952f,
                    dy3 = 0.48f,
                )
                // s -1.892 -0.385 -1.892 -0.48
                reflectiveCurveToRelative(
                    dx1 = -1.892f,
                    dy1 = -0.385f,
                    dx2 = -1.892f,
                    dy2 = -0.48f,
                )
                // c 0 -0.096 0.288 0.212 2.048 0.212
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.096f,
                    dx2 = 0.288f,
                    dy2 = 0.212f,
                    dx3 = 2.048f,
                    dy3 = 0.212f,
                )
                // s 1.796 -0.307 1.796 -0.212z
                reflectiveCurveToRelative(
                    dx1 = 1.796f,
                    dy1 = -0.307f,
                    dx2 = 1.796f,
                    dy2 = -0.212f,
                )
                close()
            }
        }.build().also { _emoji1f1f81f1f2 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1f81f1f2: ImageVector? = null
