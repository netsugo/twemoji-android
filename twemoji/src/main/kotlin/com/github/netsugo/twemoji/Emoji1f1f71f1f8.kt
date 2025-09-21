package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1f71f1f8: ImageVector
    get() {
        val current = _emoji1f1f71f1f8
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1f71f1f8",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M0 13 h36 v10 H0z
            path(
                fill = SolidColor(Color(0xFF0C4076)),
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
            // M0 27 c0 2.209 1.791 4 4 4 h28 c2.209 0 4 -1.791 4 -4 v-4 H0 v4z
            path(
                fill = SolidColor(Color(0xFFEEEEEE)),
            ) {
                // M 0 27
                moveTo(x = 0.0f, y = 27.0f)
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
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // H 0
                horizontalLineTo(x = 0.0f)
                // v 4z
                verticalLineToRelative(dy = 4.0f)
                close()
            }
            // M36 9 c0 -2.209 -1.791 -4 -4 -4 H4 C1.791 5 0 6.791 0 9 v4 h36 V9z M7 13 v9.5 c0 3.037 2.462 5.5 5.5 5.5 s5.5 -2.463 5.5 -5.5 V13 H7z
            path(
                fill = SolidColor(Color(0xFFC6363C)),
            ) {
                // M 36 9
                moveTo(x = 36.0f, y = 9.0f)
                // c 0 -2.209 -1.791 -4 -4 -4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.209f,
                    dx2 = -1.791f,
                    dy2 = -4.0f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
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
                // V 9z
                verticalLineTo(y = 9.0f)
                close()
                // M 7 13
                moveTo(x = 7.0f, y = 13.0f)
                // v 9.5
                verticalLineToRelative(dy = 9.5f)
                // c 0 3.037 2.462 5.5 5.5 5.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.037f,
                    dx2 = 2.462f,
                    dy2 = 5.5f,
                    dx3 = 5.5f,
                    dy3 = 5.5f,
                )
                // s 5.5 -2.463 5.5 -5.5
                reflectiveCurveToRelative(
                    dx1 = 5.5f,
                    dy1 = -2.463f,
                    dx2 = 5.5f,
                    dy2 = -5.5f,
                )
                // V 13
                verticalLineTo(y = 13.0f)
                // H 7z
                horizontalLineTo(x = 7.0f)
                close()
            }
            // M12.5 7.062 c-3.938 0 -5.172 1.672 -4.844 2.297 0.328 0.625 1.312 2.234 1.312 2.234 s-0.312 0.125 0 0.75 1.531 0.203 3.531 0.203 3.219 0.422 3.531 -0.203 0 -0.75 0 -0.75 0.984 -1.609 1.313 -2.234 c0.329 -0.625 -0.905 -2.297 -4.843 -2.297z M9.062 10.031 c-0.283 0.088 0 0.953 -0.1 0.579 -0.082 -0.309 -0.4 -0.438 -0.4 -0.266 s-0.125 0 -0.094 -0.312 c0.031 -0.313 -0.062 -0.5 -0.25 -0.766 -0.187 -0.266 -0.187 -0.5 0.048 -0.657 0.234 -0.156 0.75 -0.281 0.75 -0.281 s0.203 0.891 0.312 1.094 c0.109 0.203 0.312 0.336 0.312 0.336 s-0.094 0.148 0 0.226 c0.094 0.078 0.203 0.266 0.203 0.266 s-0.343 -0.281 -0.405 -0.219 c-0.062 0.062 0.078 0.141 0.062 0.25 -0.016 0.11 -0.188 -0.328 -0.438 -0.25z M12.25 10.047 c-0.078 0.078 -0.141 -0.063 -0.297 -0.172 -0.156 -0.109 -0.25 -0.046 -0.219 0.079 s-0.188 0.109 -0.188 0.297 -0.203 0.109 -0.203 0.109 0.25 -0.656 -0.172 -0.641 c-0.239 0.009 -0.156 0.5 0 0.672 -0.069 -0.105 -0.266 -0.109 -0.43 -0.234 s0.023 -0.329 -0.102 -0.282 c-0.125 0.047 -0.203 0.25 -0.328 0.297 s-0.062 -0.142 0 -0.297 c0.062 -0.156 -0.072 -0.234 -0.072 -0.234 s0.01 -0.109 0.104 -0.172 c0.094 -0.062 0.125 -0.172 0 -0.297 s-0.577 -0.828 -0.437 -1.063 c0.141 -0.234 0.609 -0.5 1.922 -0.469 0.234 1.078 -0.125 1.609 -0.125 1.609 s0.266 0.172 0.344 0.266 c-0.188 0.079 -0.047 0.157 0.078 0.266 0.125 0.11 0.203 0.188 0.125 0.266z M14.688 9.875 c0.062 0.156 0.125 0.344 0 0.297 s-0.203 -0.25 -0.328 -0.297 c-0.125 -0.047 0.062 0.157 -0.102 0.282 -0.164 0.125 -0.36 0.129 -0.43 0.234 0.156 -0.172 0.239 -0.663 0 -0.672 -0.422 -0.016 -0.172 0.641 -0.172 0.641 s-0.203 0.078 -0.203 -0.109 -0.219 -0.172 -0.188 -0.297 -0.062 -0.188 -0.219 -0.079 c-0.156 0.109 -0.219 0.25 -0.297 0.172 -0.078 -0.078 0 -0.156 0.125 -0.266 0.126 -0.109 0.267 -0.187 0.079 -0.265 0.078 -0.094 0.344 -0.266 0.344 -0.266 s-0.359 -0.531 -0.125 -1.609 c1.312 -0.031 1.781 0.234 1.922 0.469 0.141 0.234 -0.312 0.938 -0.438 1.062 s-0.094 0.234 0 0.297 c0.094 0.062 0.104 0.172 0.104 0.172 s-0.135 0.078 -0.072 0.234z M16.781 9.266 c-0.188 0.266 -0.281 0.453 -0.25 0.766 0.031 0.312 -0.094 0.484 -0.094 0.312 s-0.318 -0.042 -0.4 0.266 c-0.1 0.374 0.183 -0.49 -0.1 -0.579 -0.25 -0.078 -0.578 0.672 -0.5 0.594 s0.188 -0.531 0.125 -0.594 c-0.062 -0.063 -0.406 0.219 -0.406 0.219 s0.109 -0.188 0.203 -0.266 c0.094 -0.078 0 -0.226 0 -0.226 s0.203 -0.133 0.312 -0.336 c0.109 -0.203 0.312 -1.094 0.312 -1.094 s0.516 0.125 0.75 0.281 0.236 0.391 0.048 0.657z
            path(
                fill = SolidColor(Color(0xFFEDB92E)),
            ) {
                // M 12.5 7.062
                moveTo(x = 12.5f, y = 7.062f)
                // c -3.938 0 -5.172 1.672 -4.844 2.297
                curveToRelative(
                    dx1 = -3.938f,
                    dy1 = 0.0f,
                    dx2 = -5.172f,
                    dy2 = 1.672f,
                    dx3 = -4.844f,
                    dy3 = 2.297f,
                )
                // c 0.328 0.625 1.312 2.234 1.312 2.234
                curveToRelative(
                    dx1 = 0.328f,
                    dy1 = 0.625f,
                    dx2 = 1.312f,
                    dy2 = 2.234f,
                    dx3 = 1.312f,
                    dy3 = 2.234f,
                )
                // s -0.312 0.125 0 0.75
                reflectiveCurveToRelative(
                    dx1 = -0.312f,
                    dy1 = 0.125f,
                    dx2 = 0.0f,
                    dy2 = 0.75f,
                )
                // s 1.531 0.203 3.531 0.203
                reflectiveCurveToRelative(
                    dx1 = 1.531f,
                    dy1 = 0.203f,
                    dx2 = 3.531f,
                    dy2 = 0.203f,
                )
                // s 3.219 0.422 3.531 -0.203
                reflectiveCurveToRelative(
                    dx1 = 3.219f,
                    dy1 = 0.422f,
                    dx2 = 3.531f,
                    dy2 = -0.203f,
                )
                // s 0 -0.75 0 -0.75
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.75f,
                    dx2 = 0.0f,
                    dy2 = -0.75f,
                )
                // s 0.984 -1.609 1.313 -2.234
                reflectiveCurveToRelative(
                    dx1 = 0.984f,
                    dy1 = -1.609f,
                    dx2 = 1.313f,
                    dy2 = -2.234f,
                )
                // c 0.329 -0.625 -0.905 -2.297 -4.843 -2.297z
                curveToRelative(
                    dx1 = 0.329f,
                    dy1 = -0.625f,
                    dx2 = -0.905f,
                    dy2 = -2.297f,
                    dx3 = -4.843f,
                    dy3 = -2.297f,
                )
                close()
                // M 9.062 10.031
                moveTo(x = 9.062f, y = 10.031f)
                // c -0.283 0.088 0 0.953 -0.1 0.579
                curveToRelative(
                    dx1 = -0.283f,
                    dy1 = 0.088f,
                    dx2 = 0.0f,
                    dy2 = 0.953f,
                    dx3 = -0.1f,
                    dy3 = 0.579f,
                )
                // c -0.082 -0.309 -0.4 -0.438 -0.4 -0.266
                curveToRelative(
                    dx1 = -0.082f,
                    dy1 = -0.309f,
                    dx2 = -0.4f,
                    dy2 = -0.438f,
                    dx3 = -0.4f,
                    dy3 = -0.266f,
                )
                // s -0.125 0 -0.094 -0.312
                reflectiveCurveToRelative(
                    dx1 = -0.125f,
                    dy1 = 0.0f,
                    dx2 = -0.094f,
                    dy2 = -0.312f,
                )
                // c 0.031 -0.313 -0.062 -0.5 -0.25 -0.766
                curveToRelative(
                    dx1 = 0.031f,
                    dy1 = -0.313f,
                    dx2 = -0.062f,
                    dy2 = -0.5f,
                    dx3 = -0.25f,
                    dy3 = -0.766f,
                )
                // c -0.187 -0.266 -0.187 -0.5 0.048 -0.657
                curveToRelative(
                    dx1 = -0.187f,
                    dy1 = -0.266f,
                    dx2 = -0.187f,
                    dy2 = -0.5f,
                    dx3 = 0.048f,
                    dy3 = -0.657f,
                )
                // c 0.234 -0.156 0.75 -0.281 0.75 -0.281
                curveToRelative(
                    dx1 = 0.234f,
                    dy1 = -0.156f,
                    dx2 = 0.75f,
                    dy2 = -0.281f,
                    dx3 = 0.75f,
                    dy3 = -0.281f,
                )
                // s 0.203 0.891 0.312 1.094
                reflectiveCurveToRelative(
                    dx1 = 0.203f,
                    dy1 = 0.891f,
                    dx2 = 0.312f,
                    dy2 = 1.094f,
                )
                // c 0.109 0.203 0.312 0.336 0.312 0.336
                curveToRelative(
                    dx1 = 0.109f,
                    dy1 = 0.203f,
                    dx2 = 0.312f,
                    dy2 = 0.336f,
                    dx3 = 0.312f,
                    dy3 = 0.336f,
                )
                // s -0.094 0.148 0 0.226
                reflectiveCurveToRelative(
                    dx1 = -0.094f,
                    dy1 = 0.148f,
                    dx2 = 0.0f,
                    dy2 = 0.226f,
                )
                // c 0.094 0.078 0.203 0.266 0.203 0.266
                curveToRelative(
                    dx1 = 0.094f,
                    dy1 = 0.078f,
                    dx2 = 0.203f,
                    dy2 = 0.266f,
                    dx3 = 0.203f,
                    dy3 = 0.266f,
                )
                // s -0.343 -0.281 -0.405 -0.219
                reflectiveCurveToRelative(
                    dx1 = -0.343f,
                    dy1 = -0.281f,
                    dx2 = -0.405f,
                    dy2 = -0.219f,
                )
                // c -0.062 0.062 0.078 0.141 0.062 0.25
                curveToRelative(
                    dx1 = -0.062f,
                    dy1 = 0.062f,
                    dx2 = 0.078f,
                    dy2 = 0.141f,
                    dx3 = 0.062f,
                    dy3 = 0.25f,
                )
                // c -0.016 0.11 -0.188 -0.328 -0.438 -0.25z
                curveToRelative(
                    dx1 = -0.016f,
                    dy1 = 0.11f,
                    dx2 = -0.188f,
                    dy2 = -0.328f,
                    dx3 = -0.438f,
                    dy3 = -0.25f,
                )
                close()
                // M 12.25 10.047
                moveTo(x = 12.25f, y = 10.047f)
                // c -0.078 0.078 -0.141 -0.063 -0.297 -0.172
                curveToRelative(
                    dx1 = -0.078f,
                    dy1 = 0.078f,
                    dx2 = -0.141f,
                    dy2 = -0.063f,
                    dx3 = -0.297f,
                    dy3 = -0.172f,
                )
                // c -0.156 -0.109 -0.25 -0.046 -0.219 0.079
                curveToRelative(
                    dx1 = -0.156f,
                    dy1 = -0.109f,
                    dx2 = -0.25f,
                    dy2 = -0.046f,
                    dx3 = -0.219f,
                    dy3 = 0.079f,
                )
                // s -0.188 0.109 -0.188 0.297
                reflectiveCurveToRelative(
                    dx1 = -0.188f,
                    dy1 = 0.109f,
                    dx2 = -0.188f,
                    dy2 = 0.297f,
                )
                // s -0.203 0.109 -0.203 0.109
                reflectiveCurveToRelative(
                    dx1 = -0.203f,
                    dy1 = 0.109f,
                    dx2 = -0.203f,
                    dy2 = 0.109f,
                )
                // s 0.25 -0.656 -0.172 -0.641
                reflectiveCurveToRelative(
                    dx1 = 0.25f,
                    dy1 = -0.656f,
                    dx2 = -0.172f,
                    dy2 = -0.641f,
                )
                // c -0.239 0.009 -0.156 0.5 0 0.672
                curveToRelative(
                    dx1 = -0.239f,
                    dy1 = 0.009f,
                    dx2 = -0.156f,
                    dy2 = 0.5f,
                    dx3 = 0.0f,
                    dy3 = 0.672f,
                )
                // c -0.069 -0.105 -0.266 -0.109 -0.43 -0.234
                curveToRelative(
                    dx1 = -0.069f,
                    dy1 = -0.105f,
                    dx2 = -0.266f,
                    dy2 = -0.109f,
                    dx3 = -0.43f,
                    dy3 = -0.234f,
                )
                // s 0.023 -0.329 -0.102 -0.282
                reflectiveCurveToRelative(
                    dx1 = 0.023f,
                    dy1 = -0.329f,
                    dx2 = -0.102f,
                    dy2 = -0.282f,
                )
                // c -0.125 0.047 -0.203 0.25 -0.328 0.297
                curveToRelative(
                    dx1 = -0.125f,
                    dy1 = 0.047f,
                    dx2 = -0.203f,
                    dy2 = 0.25f,
                    dx3 = -0.328f,
                    dy3 = 0.297f,
                )
                // s -0.062 -0.142 0 -0.297
                reflectiveCurveToRelative(
                    dx1 = -0.062f,
                    dy1 = -0.142f,
                    dx2 = 0.0f,
                    dy2 = -0.297f,
                )
                // c 0.062 -0.156 -0.072 -0.234 -0.072 -0.234
                curveToRelative(
                    dx1 = 0.062f,
                    dy1 = -0.156f,
                    dx2 = -0.072f,
                    dy2 = -0.234f,
                    dx3 = -0.072f,
                    dy3 = -0.234f,
                )
                // s 0.01 -0.109 0.104 -0.172
                reflectiveCurveToRelative(
                    dx1 = 0.01f,
                    dy1 = -0.109f,
                    dx2 = 0.104f,
                    dy2 = -0.172f,
                )
                // c 0.094 -0.062 0.125 -0.172 0 -0.297
                curveToRelative(
                    dx1 = 0.094f,
                    dy1 = -0.062f,
                    dx2 = 0.125f,
                    dy2 = -0.172f,
                    dx3 = 0.0f,
                    dy3 = -0.297f,
                )
                // s -0.577 -0.828 -0.437 -1.063
                reflectiveCurveToRelative(
                    dx1 = -0.577f,
                    dy1 = -0.828f,
                    dx2 = -0.437f,
                    dy2 = -1.063f,
                )
                // c 0.141 -0.234 0.609 -0.5 1.922 -0.469
                curveToRelative(
                    dx1 = 0.141f,
                    dy1 = -0.234f,
                    dx2 = 0.609f,
                    dy2 = -0.5f,
                    dx3 = 1.922f,
                    dy3 = -0.469f,
                )
                // c 0.234 1.078 -0.125 1.609 -0.125 1.609
                curveToRelative(
                    dx1 = 0.234f,
                    dy1 = 1.078f,
                    dx2 = -0.125f,
                    dy2 = 1.609f,
                    dx3 = -0.125f,
                    dy3 = 1.609f,
                )
                // s 0.266 0.172 0.344 0.266
                reflectiveCurveToRelative(
                    dx1 = 0.266f,
                    dy1 = 0.172f,
                    dx2 = 0.344f,
                    dy2 = 0.266f,
                )
                // c -0.188 0.079 -0.047 0.157 0.078 0.266
                curveToRelative(
                    dx1 = -0.188f,
                    dy1 = 0.079f,
                    dx2 = -0.047f,
                    dy2 = 0.157f,
                    dx3 = 0.078f,
                    dy3 = 0.266f,
                )
                // c 0.125 0.11 0.203 0.188 0.125 0.266z
                curveToRelative(
                    dx1 = 0.125f,
                    dy1 = 0.11f,
                    dx2 = 0.203f,
                    dy2 = 0.188f,
                    dx3 = 0.125f,
                    dy3 = 0.266f,
                )
                close()
                // M 14.688 9.875
                moveTo(x = 14.688f, y = 9.875f)
                // c 0.062 0.156 0.125 0.344 0 0.297
                curveToRelative(
                    dx1 = 0.062f,
                    dy1 = 0.156f,
                    dx2 = 0.125f,
                    dy2 = 0.344f,
                    dx3 = 0.0f,
                    dy3 = 0.297f,
                )
                // s -0.203 -0.25 -0.328 -0.297
                reflectiveCurveToRelative(
                    dx1 = -0.203f,
                    dy1 = -0.25f,
                    dx2 = -0.328f,
                    dy2 = -0.297f,
                )
                // c -0.125 -0.047 0.062 0.157 -0.102 0.282
                curveToRelative(
                    dx1 = -0.125f,
                    dy1 = -0.047f,
                    dx2 = 0.062f,
                    dy2 = 0.157f,
                    dx3 = -0.102f,
                    dy3 = 0.282f,
                )
                // c -0.164 0.125 -0.36 0.129 -0.43 0.234
                curveToRelative(
                    dx1 = -0.164f,
                    dy1 = 0.125f,
                    dx2 = -0.36f,
                    dy2 = 0.129f,
                    dx3 = -0.43f,
                    dy3 = 0.234f,
                )
                // c 0.156 -0.172 0.239 -0.663 0 -0.672
                curveToRelative(
                    dx1 = 0.156f,
                    dy1 = -0.172f,
                    dx2 = 0.239f,
                    dy2 = -0.663f,
                    dx3 = 0.0f,
                    dy3 = -0.672f,
                )
                // c -0.422 -0.016 -0.172 0.641 -0.172 0.641
                curveToRelative(
                    dx1 = -0.422f,
                    dy1 = -0.016f,
                    dx2 = -0.172f,
                    dy2 = 0.641f,
                    dx3 = -0.172f,
                    dy3 = 0.641f,
                )
                // s -0.203 0.078 -0.203 -0.109
                reflectiveCurveToRelative(
                    dx1 = -0.203f,
                    dy1 = 0.078f,
                    dx2 = -0.203f,
                    dy2 = -0.109f,
                )
                // s -0.219 -0.172 -0.188 -0.297
                reflectiveCurveToRelative(
                    dx1 = -0.219f,
                    dy1 = -0.172f,
                    dx2 = -0.188f,
                    dy2 = -0.297f,
                )
                // s -0.062 -0.188 -0.219 -0.079
                reflectiveCurveToRelative(
                    dx1 = -0.062f,
                    dy1 = -0.188f,
                    dx2 = -0.219f,
                    dy2 = -0.079f,
                )
                // c -0.156 0.109 -0.219 0.25 -0.297 0.172
                curveToRelative(
                    dx1 = -0.156f,
                    dy1 = 0.109f,
                    dx2 = -0.219f,
                    dy2 = 0.25f,
                    dx3 = -0.297f,
                    dy3 = 0.172f,
                )
                // c -0.078 -0.078 0 -0.156 0.125 -0.266
                curveToRelative(
                    dx1 = -0.078f,
                    dy1 = -0.078f,
                    dx2 = 0.0f,
                    dy2 = -0.156f,
                    dx3 = 0.125f,
                    dy3 = -0.266f,
                )
                // c 0.126 -0.109 0.267 -0.187 0.079 -0.265
                curveToRelative(
                    dx1 = 0.126f,
                    dy1 = -0.109f,
                    dx2 = 0.267f,
                    dy2 = -0.187f,
                    dx3 = 0.079f,
                    dy3 = -0.265f,
                )
                // c 0.078 -0.094 0.344 -0.266 0.344 -0.266
                curveToRelative(
                    dx1 = 0.078f,
                    dy1 = -0.094f,
                    dx2 = 0.344f,
                    dy2 = -0.266f,
                    dx3 = 0.344f,
                    dy3 = -0.266f,
                )
                // s -0.359 -0.531 -0.125 -1.609
                reflectiveCurveToRelative(
                    dx1 = -0.359f,
                    dy1 = -0.531f,
                    dx2 = -0.125f,
                    dy2 = -1.609f,
                )
                // c 1.312 -0.031 1.781 0.234 1.922 0.469
                curveToRelative(
                    dx1 = 1.312f,
                    dy1 = -0.031f,
                    dx2 = 1.781f,
                    dy2 = 0.234f,
                    dx3 = 1.922f,
                    dy3 = 0.469f,
                )
                // c 0.141 0.234 -0.312 0.938 -0.438 1.062
                curveToRelative(
                    dx1 = 0.141f,
                    dy1 = 0.234f,
                    dx2 = -0.312f,
                    dy2 = 0.938f,
                    dx3 = -0.438f,
                    dy3 = 1.062f,
                )
                // s -0.094 0.234 0 0.297
                reflectiveCurveToRelative(
                    dx1 = -0.094f,
                    dy1 = 0.234f,
                    dx2 = 0.0f,
                    dy2 = 0.297f,
                )
                // c 0.094 0.062 0.104 0.172 0.104 0.172
                curveToRelative(
                    dx1 = 0.094f,
                    dy1 = 0.062f,
                    dx2 = 0.104f,
                    dy2 = 0.172f,
                    dx3 = 0.104f,
                    dy3 = 0.172f,
                )
                // s -0.135 0.078 -0.072 0.234z
                reflectiveCurveToRelative(
                    dx1 = -0.135f,
                    dy1 = 0.078f,
                    dx2 = -0.072f,
                    dy2 = 0.234f,
                )
                close()
                // M 16.781 9.266
                moveTo(x = 16.781f, y = 9.266f)
                // c -0.188 0.266 -0.281 0.453 -0.25 0.766
                curveToRelative(
                    dx1 = -0.188f,
                    dy1 = 0.266f,
                    dx2 = -0.281f,
                    dy2 = 0.453f,
                    dx3 = -0.25f,
                    dy3 = 0.766f,
                )
                // c 0.031 0.312 -0.094 0.484 -0.094 0.312
                curveToRelative(
                    dx1 = 0.031f,
                    dy1 = 0.312f,
                    dx2 = -0.094f,
                    dy2 = 0.484f,
                    dx3 = -0.094f,
                    dy3 = 0.312f,
                )
                // s -0.318 -0.042 -0.4 0.266
                reflectiveCurveToRelative(
                    dx1 = -0.318f,
                    dy1 = -0.042f,
                    dx2 = -0.4f,
                    dy2 = 0.266f,
                )
                // c -0.1 0.374 0.183 -0.49 -0.1 -0.579
                curveToRelative(
                    dx1 = -0.1f,
                    dy1 = 0.374f,
                    dx2 = 0.183f,
                    dy2 = -0.49f,
                    dx3 = -0.1f,
                    dy3 = -0.579f,
                )
                // c -0.25 -0.078 -0.578 0.672 -0.5 0.594
                curveToRelative(
                    dx1 = -0.25f,
                    dy1 = -0.078f,
                    dx2 = -0.578f,
                    dy2 = 0.672f,
                    dx3 = -0.5f,
                    dy3 = 0.594f,
                )
                // s 0.188 -0.531 0.125 -0.594
                reflectiveCurveToRelative(
                    dx1 = 0.188f,
                    dy1 = -0.531f,
                    dx2 = 0.125f,
                    dy2 = -0.594f,
                )
                // c -0.062 -0.063 -0.406 0.219 -0.406 0.219
                curveToRelative(
                    dx1 = -0.062f,
                    dy1 = -0.063f,
                    dx2 = -0.406f,
                    dy2 = 0.219f,
                    dx3 = -0.406f,
                    dy3 = 0.219f,
                )
                // s 0.109 -0.188 0.203 -0.266
                reflectiveCurveToRelative(
                    dx1 = 0.109f,
                    dy1 = -0.188f,
                    dx2 = 0.203f,
                    dy2 = -0.266f,
                )
                // c 0.094 -0.078 0 -0.226 0 -0.226
                curveToRelative(
                    dx1 = 0.094f,
                    dy1 = -0.078f,
                    dx2 = 0.0f,
                    dy2 = -0.226f,
                    dx3 = 0.0f,
                    dy3 = -0.226f,
                )
                // s 0.203 -0.133 0.312 -0.336
                reflectiveCurveToRelative(
                    dx1 = 0.203f,
                    dy1 = -0.133f,
                    dx2 = 0.312f,
                    dy2 = -0.336f,
                )
                // c 0.109 -0.203 0.312 -1.094 0.312 -1.094
                curveToRelative(
                    dx1 = 0.109f,
                    dy1 = -0.203f,
                    dx2 = 0.312f,
                    dy2 = -1.094f,
                    dx3 = 0.312f,
                    dy3 = -1.094f,
                )
                // s 0.516 0.125 0.75 0.281
                reflectiveCurveToRelative(
                    dx1 = 0.516f,
                    dy1 = 0.125f,
                    dx2 = 0.75f,
                    dy2 = 0.281f,
                )
                // s 0.236 0.391 0.048 0.657z
                reflectiveCurveToRelative(
                    dx1 = 0.236f,
                    dy1 = 0.391f,
                    dx2 = 0.048f,
                    dy2 = 0.657f,
                )
                close()
            }
            // M12.609 7.242 c0 0.099 -0.081 0.18 -0.18 0.18 -0.099 0 -0.18 -0.081 -0.18 -0.18 V5.664 c0 -0.099 0.081 -0.18 0.18 -0.18 0.099 0 0.18 0.081 0.18 0.18 v1.578z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 12.609 7.242
                moveTo(x = 12.609f, y = 7.242f)
                // c 0 0.099 -0.081 0.18 -0.18 0.18
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.099f,
                    dx2 = -0.081f,
                    dy2 = 0.18f,
                    dx3 = -0.18f,
                    dy3 = 0.18f,
                )
                // c -0.099 0 -0.18 -0.081 -0.18 -0.18
                curveToRelative(
                    dx1 = -0.099f,
                    dy1 = 0.0f,
                    dx2 = -0.18f,
                    dy2 = -0.081f,
                    dx3 = -0.18f,
                    dy3 = -0.18f,
                )
                // V 5.664
                verticalLineTo(y = 5.664f)
                // c 0 -0.099 0.081 -0.18 0.18 -0.18
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.099f,
                    dx2 = 0.081f,
                    dy2 = -0.18f,
                    dx3 = 0.18f,
                    dy3 = -0.18f,
                )
                // c 0.099 0 0.18 0.081 0.18 0.18
                curveToRelative(
                    dx1 = 0.099f,
                    dy1 = 0.0f,
                    dx2 = 0.18f,
                    dy2 = 0.081f,
                    dx3 = 0.18f,
                    dy3 = 0.18f,
                )
                // v 1.578z
                verticalLineToRelative(dy = 1.578f)
                close()
            }
            // M12.969 6.086 c0 0.091 -0.073 0.164 -0.164 0.164 h-0.781 c-0.091 0 -0.164 -0.073 -0.164 -0.164 0 -0.091 0.073 -0.164 0.164 -0.164 h0.781 c0.091 0 0.164 0.073 0.164 0.164z
            path(
                fill = SolidColor(Color(0xFFEDB92E)),
            ) {
                // M 12.969 6.086
                moveTo(x = 12.969f, y = 6.086f)
                // c 0 0.091 -0.073 0.164 -0.164 0.164
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.091f,
                    dx2 = -0.073f,
                    dy2 = 0.164f,
                    dx3 = -0.164f,
                    dy3 = 0.164f,
                )
                // h -0.781
                horizontalLineToRelative(dx = -0.781f)
                // c -0.091 0 -0.164 -0.073 -0.164 -0.164
                curveToRelative(
                    dx1 = -0.091f,
                    dy1 = 0.0f,
                    dx2 = -0.164f,
                    dy2 = -0.073f,
                    dx3 = -0.164f,
                    dy3 = -0.164f,
                )
                // c 0 -0.091 0.073 -0.164 0.164 -0.164
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.091f,
                    dx2 = 0.073f,
                    dy2 = -0.164f,
                    dx3 = 0.164f,
                    dy3 = -0.164f,
                )
                // h 0.781
                horizontalLineToRelative(dx = 0.781f)
                // c 0.091 0 0.164 0.073 0.164 0.164z
                curveToRelative(
                    dx1 = 0.091f,
                    dy1 = 0.0f,
                    dx2 = 0.164f,
                    dy2 = 0.073f,
                    dx3 = 0.164f,
                    dy3 = 0.164f,
                )
                close()
            }
            // M13.016 7.062 c0 0.332 -0.269 0.602 -0.602 0.602 -0.332 0 -0.602 -0.27 -0.602 -0.602 s0.269 -0.602 0.602 -0.602 c0.332 0.001 0.602 0.27 0.602 0.602z M9.604 12.276 c0 0.147 -0.169 0.266 -0.378 0.266 s-0.378 -0.119 -0.378 -0.266 c0 -0.146 0.169 -0.265 0.378 -0.265 s0.378 0.118 0.378 0.265z
            path(
                fill = SolidColor(Color(0xFF0C4076)),
            ) {
                // M 13.016 7.062
                moveTo(x = 13.016f, y = 7.062f)
                // c 0 0.332 -0.269 0.602 -0.602 0.602
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.332f,
                    dx2 = -0.269f,
                    dy2 = 0.602f,
                    dx3 = -0.602f,
                    dy3 = 0.602f,
                )
                // c -0.332 0 -0.602 -0.27 -0.602 -0.602
                curveToRelative(
                    dx1 = -0.332f,
                    dy1 = 0.0f,
                    dx2 = -0.602f,
                    dy2 = -0.27f,
                    dx3 = -0.602f,
                    dy3 = -0.602f,
                )
                // s 0.269 -0.602 0.602 -0.602
                reflectiveCurveToRelative(
                    dx1 = 0.269f,
                    dy1 = -0.602f,
                    dx2 = 0.602f,
                    dy2 = -0.602f,
                )
                // c 0.332 0.001 0.602 0.27 0.602 0.602z
                curveToRelative(
                    dx1 = 0.332f,
                    dy1 = 0.001f,
                    dx2 = 0.602f,
                    dy2 = 0.27f,
                    dx3 = 0.602f,
                    dy3 = 0.602f,
                )
                close()
                // M 9.604 12.276
                moveTo(x = 9.604f, y = 12.276f)
                // c 0 0.147 -0.169 0.266 -0.378 0.266
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.147f,
                    dx2 = -0.169f,
                    dy2 = 0.266f,
                    dx3 = -0.378f,
                    dy3 = 0.266f,
                )
                // s -0.378 -0.119 -0.378 -0.266
                reflectiveCurveToRelative(
                    dx1 = -0.378f,
                    dy1 = -0.119f,
                    dx2 = -0.378f,
                    dy2 = -0.266f,
                )
                // c 0 -0.146 0.169 -0.265 0.378 -0.265
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.146f,
                    dx2 = 0.169f,
                    dy2 = -0.265f,
                    dx3 = 0.378f,
                    dy3 = -0.265f,
                )
                // s 0.378 0.118 0.378 0.265z
                reflectiveCurveToRelative(
                    dx1 = 0.378f,
                    dy1 = 0.118f,
                    dx2 = 0.378f,
                    dy2 = 0.265f,
                )
                close()
            }
            // M11.125 12.185 c0 0.147 -0.169 0.266 -0.378 0.266 s-0.378 -0.119 -0.378 -0.266 c0 -0.146 0.169 -0.265 0.378 -0.265 0.208 0 0.378 0.119 0.378 0.265z M14.5 12.185 c0 0.147 -0.169 0.266 -0.378 0.266 s-0.378 -0.119 -0.378 -0.266 c0 -0.146 0.169 -0.265 0.378 -0.265 0.208 0 0.378 0.119 0.378 0.265z
            path(
                fill = SolidColor(Color(0xFFC6363C)),
            ) {
                // M 11.125 12.185
                moveTo(x = 11.125f, y = 12.185f)
                // c 0 0.147 -0.169 0.266 -0.378 0.266
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.147f,
                    dx2 = -0.169f,
                    dy2 = 0.266f,
                    dx3 = -0.378f,
                    dy3 = 0.266f,
                )
                // s -0.378 -0.119 -0.378 -0.266
                reflectiveCurveToRelative(
                    dx1 = -0.378f,
                    dy1 = -0.119f,
                    dx2 = -0.378f,
                    dy2 = -0.266f,
                )
                // c 0 -0.146 0.169 -0.265 0.378 -0.265
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.146f,
                    dx2 = 0.169f,
                    dy2 = -0.265f,
                    dx3 = 0.378f,
                    dy3 = -0.265f,
                )
                // c 0.208 0 0.378 0.119 0.378 0.265z
                curveToRelative(
                    dx1 = 0.208f,
                    dy1 = 0.0f,
                    dx2 = 0.378f,
                    dy2 = 0.119f,
                    dx3 = 0.378f,
                    dy3 = 0.265f,
                )
                close()
                // M 14.5 12.185
                moveTo(x = 14.5f, y = 12.185f)
                // c 0 0.147 -0.169 0.266 -0.378 0.266
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.147f,
                    dx2 = -0.169f,
                    dy2 = 0.266f,
                    dx3 = -0.378f,
                    dy3 = 0.266f,
                )
                // s -0.378 -0.119 -0.378 -0.266
                reflectiveCurveToRelative(
                    dx1 = -0.378f,
                    dy1 = -0.119f,
                    dx2 = -0.378f,
                    dy2 = -0.266f,
                )
                // c 0 -0.146 0.169 -0.265 0.378 -0.265
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.146f,
                    dx2 = 0.169f,
                    dy2 = -0.265f,
                    dx3 = 0.378f,
                    dy3 = -0.265f,
                )
                // c 0.208 0 0.378 0.119 0.378 0.265z
                curveToRelative(
                    dx1 = 0.208f,
                    dy1 = 0.0f,
                    dx2 = 0.378f,
                    dy2 = 0.119f,
                    dx3 = 0.378f,
                    dy3 = 0.265f,
                )
                close()
            }
            // M16.062 12.276 c0 0.147 -0.169 0.266 -0.378 0.266 s-0.378 -0.119 -0.378 -0.266 c0 -0.146 0.169 -0.265 0.378 -0.265 s0.378 0.118 0.378 0.265z M12.808 12.166 c0 0.147 -0.169 0.266 -0.378 0.266 s-0.378 -0.119 -0.378 -0.266 c0 -0.147 0.169 -0.265 0.378 -0.265 s0.378 0.118 0.378 0.265z
            path(
                fill = SolidColor(Color(0xFF0C4076)),
            ) {
                // M 16.062 12.276
                moveTo(x = 16.062f, y = 12.276f)
                // c 0 0.147 -0.169 0.266 -0.378 0.266
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.147f,
                    dx2 = -0.169f,
                    dy2 = 0.266f,
                    dx3 = -0.378f,
                    dy3 = 0.266f,
                )
                // s -0.378 -0.119 -0.378 -0.266
                reflectiveCurveToRelative(
                    dx1 = -0.378f,
                    dy1 = -0.119f,
                    dx2 = -0.378f,
                    dy2 = -0.266f,
                )
                // c 0 -0.146 0.169 -0.265 0.378 -0.265
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.146f,
                    dx2 = 0.169f,
                    dy2 = -0.265f,
                    dx3 = 0.378f,
                    dy3 = -0.265f,
                )
                // s 0.378 0.118 0.378 0.265z
                reflectiveCurveToRelative(
                    dx1 = 0.378f,
                    dy1 = 0.118f,
                    dx2 = 0.378f,
                    dy2 = 0.265f,
                )
                close()
                // M 12.808 12.166
                moveTo(x = 12.808f, y = 12.166f)
                // c 0 0.147 -0.169 0.266 -0.378 0.266
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.147f,
                    dx2 = -0.169f,
                    dy2 = 0.266f,
                    dx3 = -0.378f,
                    dy3 = 0.266f,
                )
                // s -0.378 -0.119 -0.378 -0.266
                reflectiveCurveToRelative(
                    dx1 = -0.378f,
                    dy1 = -0.119f,
                    dx2 = -0.378f,
                    dy2 = -0.266f,
                )
                // c 0 -0.147 0.169 -0.265 0.378 -0.265
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.147f,
                    dx2 = 0.169f,
                    dy2 = -0.265f,
                    dx3 = 0.378f,
                    dy3 = -0.265f,
                )
                // s 0.378 0.118 0.378 0.265z
                reflectiveCurveToRelative(
                    dx1 = 0.378f,
                    dy1 = 0.118f,
                    dx2 = 0.378f,
                    dy2 = 0.265f,
                )
                close()
            }
            // M10.286 22.562 c-0.342 0.776 -0.378 1.158 -0.783 1.131 -0.406 -0.027 -0.692 -0.096 -0.692 0.068 0 0.163 0.645 0.095 0.645 0.095 s-0.609 0.26 -0.489 0.559 c0.119 0.3 0.645 -0.381 0.645 -0.381 s0.107 0.027 0.31 -0.137 c0.203 -0.163 0.74 -0.953 0.74 -0.953 l-0.376 -0.382z M14.698 22.562 c0.342 0.776 0.378 1.158 0.783 1.131 0.406 -0.027 0.692 -0.096 0.692 0.068 0 0.163 -0.644 0.095 -0.644 0.095 s0.609 0.26 0.489 0.559 c-0.119 0.3 -0.645 -0.381 -0.645 -0.381 s-0.107 0.027 -0.31 -0.137 c-0.203 -0.163 -0.74 -0.953 -0.74 -0.953 l0.375 -0.382z
            path(
                fill = SolidColor(Color(0xFFEDB92E)),
            ) {
                // M 10.286 22.562
                moveTo(x = 10.286f, y = 22.562f)
                // c -0.342 0.776 -0.378 1.158 -0.783 1.131
                curveToRelative(
                    dx1 = -0.342f,
                    dy1 = 0.776f,
                    dx2 = -0.378f,
                    dy2 = 1.158f,
                    dx3 = -0.783f,
                    dy3 = 1.131f,
                )
                // c -0.406 -0.027 -0.692 -0.096 -0.692 0.068
                curveToRelative(
                    dx1 = -0.406f,
                    dy1 = -0.027f,
                    dx2 = -0.692f,
                    dy2 = -0.096f,
                    dx3 = -0.692f,
                    dy3 = 0.068f,
                )
                // c 0 0.163 0.645 0.095 0.645 0.095
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.163f,
                    dx2 = 0.645f,
                    dy2 = 0.095f,
                    dx3 = 0.645f,
                    dy3 = 0.095f,
                )
                // s -0.609 0.26 -0.489 0.559
                reflectiveCurveToRelative(
                    dx1 = -0.609f,
                    dy1 = 0.26f,
                    dx2 = -0.489f,
                    dy2 = 0.559f,
                )
                // c 0.119 0.3 0.645 -0.381 0.645 -0.381
                curveToRelative(
                    dx1 = 0.119f,
                    dy1 = 0.3f,
                    dx2 = 0.645f,
                    dy2 = -0.381f,
                    dx3 = 0.645f,
                    dy3 = -0.381f,
                )
                // s 0.107 0.027 0.31 -0.137
                reflectiveCurveToRelative(
                    dx1 = 0.107f,
                    dy1 = 0.027f,
                    dx2 = 0.31f,
                    dy2 = -0.137f,
                )
                // c 0.203 -0.163 0.74 -0.953 0.74 -0.953
                curveToRelative(
                    dx1 = 0.203f,
                    dy1 = -0.163f,
                    dx2 = 0.74f,
                    dy2 = -0.953f,
                    dx3 = 0.74f,
                    dy3 = -0.953f,
                )
                // l -0.376 -0.382z
                lineToRelative(dx = -0.376f, dy = -0.382f)
                close()
                // M 14.698 22.562
                moveTo(x = 14.698f, y = 22.562f)
                // c 0.342 0.776 0.378 1.158 0.783 1.131
                curveToRelative(
                    dx1 = 0.342f,
                    dy1 = 0.776f,
                    dx2 = 0.378f,
                    dy2 = 1.158f,
                    dx3 = 0.783f,
                    dy3 = 1.131f,
                )
                // c 0.406 -0.027 0.692 -0.096 0.692 0.068
                curveToRelative(
                    dx1 = 0.406f,
                    dy1 = -0.027f,
                    dx2 = 0.692f,
                    dy2 = -0.096f,
                    dx3 = 0.692f,
                    dy3 = 0.068f,
                )
                // c 0 0.163 -0.644 0.095 -0.644 0.095
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.163f,
                    dx2 = -0.644f,
                    dy2 = 0.095f,
                    dx3 = -0.644f,
                    dy3 = 0.095f,
                )
                // s 0.609 0.26 0.489 0.559
                reflectiveCurveToRelative(
                    dx1 = 0.609f,
                    dy1 = 0.26f,
                    dx2 = 0.489f,
                    dy2 = 0.559f,
                )
                // c -0.119 0.3 -0.645 -0.381 -0.645 -0.381
                curveToRelative(
                    dx1 = -0.119f,
                    dy1 = 0.3f,
                    dx2 = -0.645f,
                    dy2 = -0.381f,
                    dx3 = -0.645f,
                    dy3 = -0.381f,
                )
                // s -0.107 0.027 -0.31 -0.137
                reflectiveCurveToRelative(
                    dx1 = -0.107f,
                    dy1 = 0.027f,
                    dx2 = -0.31f,
                    dy2 = -0.137f,
                )
                // c -0.203 -0.163 -0.74 -0.953 -0.74 -0.953
                curveToRelative(
                    dx1 = -0.203f,
                    dy1 = -0.163f,
                    dx2 = -0.74f,
                    dy2 = -0.953f,
                    dx3 = -0.74f,
                    dy3 = -0.953f,
                )
                // l 0.375 -0.382z
                lineToRelative(dx = 0.375f, dy = -0.382f)
                close()
            }
            // M17.114 15.688 c-0.176 -1.208 -1.313 -0.833 -1.796 0 -0.483 0.833 -0.9 1.333 -1.347 0.75 -0.447 -0.583 -0.742 -1.208 -0.096 -2 l0.646 -0.792 c-0.092 -0.479 -0.479 -0.375 -1.033 -0.146 -0.554 0.229 -0.904 0.125 -0.849 0.375 0.056 0.25 0.258 0.271 0.258 0.271 s-0.349 0.34 -0.441 1.513 c-0.092 -1.173 -0.441 -1.513 -0.441 -1.513 s0.203 -0.021 0.258 -0.271 c0.055 -0.25 -0.295 -0.146 -0.849 -0.375 s-0.941 -0.333 -1.033 0.146 l0.646 0.792 c0.646 0.792 0.351 1.417 -0.096 2 -0.446 0.583 -0.864 0.146 -1.347 -0.688 -0.483 -0.833 -1.621 -1.208 -1.796 0 -0.176 1.208 0.028 3.312 0.028 3.312 s-0.111 1.146 0.111 2.125 c0.221 0.979 0.351 1.854 0 2.604 0.387 -0.104 0.627 -0.604 0.627 -0.604 s-0.129 0.604 0.111 0.542 c0.24 -0.062 0.295 -0.521 0.479 -0.688 0.185 -0.166 0.333 -0.541 0.333 -0.541 s0.388 -0.146 0 0.5 c0.314 0.021 0.517 -0.188 0.517 -0.188 l0.11 0.584 0.185 -0.312 0.092 0.562 0.332 -0.542 0.218 0.25 s0.041 -1.062 0.336 -0.854 c0.295 0.208 0.313 0.896 0.111 1.312 -0.203 0.416 0 0.584 0 0.584 s-0.295 0.438 -0.446 0.688 c-0.151 0.25 0.078 0.541 0.078 0.541 s-0.572 0.854 -0.413 1.188 c0.154 0.32 1.107 0.524 1.804 0.539 l0.006 0.003 0.039 -0.001 0.039 0.001 0.006 -0.003 c0.697 -0.015 1.65 -0.219 1.804 -0.539 0.16 -0.333 -0.413 -1.188 -0.413 -1.188 s0.228 -0.291 0.078 -0.541 c-0.151 -0.25 -0.447 -0.688 -0.447 -0.688 s0.203 -0.168 0 -0.584 c-0.202 -0.416 -0.184 -1.104 0.111 -1.312 0.295 -0.208 0.335 0.854 0.335 0.854 l0.218 -0.25 0.332 0.542 0.092 -0.562 0.185 0.312 0.11 -0.584 s0.203 0.208 0.517 0.188 c-0.388 -0.646 0 -0.5 0 -0.5 s0.148 0.375 0.332 0.542 0.24 0.625 0.48 0.688 c0.24 0.062 0.111 -0.542 0.111 -0.542 s0.24 0.5 0.627 0.604 c-0.35 -0.75 -0.221 -1.626 0 -2.604 0.222 -0.979 0.111 -2.125 0.111 -2.125 s0.206 -2.167 0.03 -3.375z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 17.114 15.688
                moveTo(x = 17.114f, y = 15.688f)
                // c -0.176 -1.208 -1.313 -0.833 -1.796 0
                curveToRelative(
                    dx1 = -0.176f,
                    dy1 = -1.208f,
                    dx2 = -1.313f,
                    dy2 = -0.833f,
                    dx3 = -1.796f,
                    dy3 = 0.0f,
                )
                // c -0.483 0.833 -0.9 1.333 -1.347 0.75
                curveToRelative(
                    dx1 = -0.483f,
                    dy1 = 0.833f,
                    dx2 = -0.9f,
                    dy2 = 1.333f,
                    dx3 = -1.347f,
                    dy3 = 0.75f,
                )
                // c -0.447 -0.583 -0.742 -1.208 -0.096 -2
                curveToRelative(
                    dx1 = -0.447f,
                    dy1 = -0.583f,
                    dx2 = -0.742f,
                    dy2 = -1.208f,
                    dx3 = -0.096f,
                    dy3 = -2.0f,
                )
                // l 0.646 -0.792
                lineToRelative(dx = 0.646f, dy = -0.792f)
                // c -0.092 -0.479 -0.479 -0.375 -1.033 -0.146
                curveToRelative(
                    dx1 = -0.092f,
                    dy1 = -0.479f,
                    dx2 = -0.479f,
                    dy2 = -0.375f,
                    dx3 = -1.033f,
                    dy3 = -0.146f,
                )
                // c -0.554 0.229 -0.904 0.125 -0.849 0.375
                curveToRelative(
                    dx1 = -0.554f,
                    dy1 = 0.229f,
                    dx2 = -0.904f,
                    dy2 = 0.125f,
                    dx3 = -0.849f,
                    dy3 = 0.375f,
                )
                // c 0.056 0.25 0.258 0.271 0.258 0.271
                curveToRelative(
                    dx1 = 0.056f,
                    dy1 = 0.25f,
                    dx2 = 0.258f,
                    dy2 = 0.271f,
                    dx3 = 0.258f,
                    dy3 = 0.271f,
                )
                // s -0.349 0.34 -0.441 1.513
                reflectiveCurveToRelative(
                    dx1 = -0.349f,
                    dy1 = 0.34f,
                    dx2 = -0.441f,
                    dy2 = 1.513f,
                )
                // c -0.092 -1.173 -0.441 -1.513 -0.441 -1.513
                curveToRelative(
                    dx1 = -0.092f,
                    dy1 = -1.173f,
                    dx2 = -0.441f,
                    dy2 = -1.513f,
                    dx3 = -0.441f,
                    dy3 = -1.513f,
                )
                // s 0.203 -0.021 0.258 -0.271
                reflectiveCurveToRelative(
                    dx1 = 0.203f,
                    dy1 = -0.021f,
                    dx2 = 0.258f,
                    dy2 = -0.271f,
                )
                // c 0.055 -0.25 -0.295 -0.146 -0.849 -0.375
                curveToRelative(
                    dx1 = 0.055f,
                    dy1 = -0.25f,
                    dx2 = -0.295f,
                    dy2 = -0.146f,
                    dx3 = -0.849f,
                    dy3 = -0.375f,
                )
                // s -0.941 -0.333 -1.033 0.146
                reflectiveCurveToRelative(
                    dx1 = -0.941f,
                    dy1 = -0.333f,
                    dx2 = -1.033f,
                    dy2 = 0.146f,
                )
                // l 0.646 0.792
                lineToRelative(dx = 0.646f, dy = 0.792f)
                // c 0.646 0.792 0.351 1.417 -0.096 2
                curveToRelative(
                    dx1 = 0.646f,
                    dy1 = 0.792f,
                    dx2 = 0.351f,
                    dy2 = 1.417f,
                    dx3 = -0.096f,
                    dy3 = 2.0f,
                )
                // c -0.446 0.583 -0.864 0.146 -1.347 -0.688
                curveToRelative(
                    dx1 = -0.446f,
                    dy1 = 0.583f,
                    dx2 = -0.864f,
                    dy2 = 0.146f,
                    dx3 = -1.347f,
                    dy3 = -0.688f,
                )
                // c -0.483 -0.833 -1.621 -1.208 -1.796 0
                curveToRelative(
                    dx1 = -0.483f,
                    dy1 = -0.833f,
                    dx2 = -1.621f,
                    dy2 = -1.208f,
                    dx3 = -1.796f,
                    dy3 = 0.0f,
                )
                // c -0.176 1.208 0.028 3.312 0.028 3.312
                curveToRelative(
                    dx1 = -0.176f,
                    dy1 = 1.208f,
                    dx2 = 0.028f,
                    dy2 = 3.312f,
                    dx3 = 0.028f,
                    dy3 = 3.312f,
                )
                // s -0.111 1.146 0.111 2.125
                reflectiveCurveToRelative(
                    dx1 = -0.111f,
                    dy1 = 1.146f,
                    dx2 = 0.111f,
                    dy2 = 2.125f,
                )
                // c 0.221 0.979 0.351 1.854 0 2.604
                curveToRelative(
                    dx1 = 0.221f,
                    dy1 = 0.979f,
                    dx2 = 0.351f,
                    dy2 = 1.854f,
                    dx3 = 0.0f,
                    dy3 = 2.604f,
                )
                // c 0.387 -0.104 0.627 -0.604 0.627 -0.604
                curveToRelative(
                    dx1 = 0.387f,
                    dy1 = -0.104f,
                    dx2 = 0.627f,
                    dy2 = -0.604f,
                    dx3 = 0.627f,
                    dy3 = -0.604f,
                )
                // s -0.129 0.604 0.111 0.542
                reflectiveCurveToRelative(
                    dx1 = -0.129f,
                    dy1 = 0.604f,
                    dx2 = 0.111f,
                    dy2 = 0.542f,
                )
                // c 0.24 -0.062 0.295 -0.521 0.479 -0.688
                curveToRelative(
                    dx1 = 0.24f,
                    dy1 = -0.062f,
                    dx2 = 0.295f,
                    dy2 = -0.521f,
                    dx3 = 0.479f,
                    dy3 = -0.688f,
                )
                // c 0.185 -0.166 0.333 -0.541 0.333 -0.541
                curveToRelative(
                    dx1 = 0.185f,
                    dy1 = -0.166f,
                    dx2 = 0.333f,
                    dy2 = -0.541f,
                    dx3 = 0.333f,
                    dy3 = -0.541f,
                )
                // s 0.388 -0.146 0 0.5
                reflectiveCurveToRelative(
                    dx1 = 0.388f,
                    dy1 = -0.146f,
                    dx2 = 0.0f,
                    dy2 = 0.5f,
                )
                // c 0.314 0.021 0.517 -0.188 0.517 -0.188
                curveToRelative(
                    dx1 = 0.314f,
                    dy1 = 0.021f,
                    dx2 = 0.517f,
                    dy2 = -0.188f,
                    dx3 = 0.517f,
                    dy3 = -0.188f,
                )
                // l 0.11 0.584
                lineToRelative(dx = 0.11f, dy = 0.584f)
                // l 0.185 -0.312
                lineToRelative(dx = 0.185f, dy = -0.312f)
                // l 0.092 0.562
                lineToRelative(dx = 0.092f, dy = 0.562f)
                // l 0.332 -0.542
                lineToRelative(dx = 0.332f, dy = -0.542f)
                // l 0.218 0.25
                lineToRelative(dx = 0.218f, dy = 0.25f)
                // s 0.041 -1.062 0.336 -0.854
                reflectiveCurveToRelative(
                    dx1 = 0.041f,
                    dy1 = -1.062f,
                    dx2 = 0.336f,
                    dy2 = -0.854f,
                )
                // c 0.295 0.208 0.313 0.896 0.111 1.312
                curveToRelative(
                    dx1 = 0.295f,
                    dy1 = 0.208f,
                    dx2 = 0.313f,
                    dy2 = 0.896f,
                    dx3 = 0.111f,
                    dy3 = 1.312f,
                )
                // c -0.203 0.416 0 0.584 0 0.584
                curveToRelative(
                    dx1 = -0.203f,
                    dy1 = 0.416f,
                    dx2 = 0.0f,
                    dy2 = 0.584f,
                    dx3 = 0.0f,
                    dy3 = 0.584f,
                )
                // s -0.295 0.438 -0.446 0.688
                reflectiveCurveToRelative(
                    dx1 = -0.295f,
                    dy1 = 0.438f,
                    dx2 = -0.446f,
                    dy2 = 0.688f,
                )
                // c -0.151 0.25 0.078 0.541 0.078 0.541
                curveToRelative(
                    dx1 = -0.151f,
                    dy1 = 0.25f,
                    dx2 = 0.078f,
                    dy2 = 0.541f,
                    dx3 = 0.078f,
                    dy3 = 0.541f,
                )
                // s -0.572 0.854 -0.413 1.188
                reflectiveCurveToRelative(
                    dx1 = -0.572f,
                    dy1 = 0.854f,
                    dx2 = -0.413f,
                    dy2 = 1.188f,
                )
                // c 0.154 0.32 1.107 0.524 1.804 0.539
                curveToRelative(
                    dx1 = 0.154f,
                    dy1 = 0.32f,
                    dx2 = 1.107f,
                    dy2 = 0.524f,
                    dx3 = 1.804f,
                    dy3 = 0.539f,
                )
                // l 0.006 0.003
                lineToRelative(dx = 0.006f, dy = 0.003f)
                // l 0.039 -0.001
                lineToRelative(dx = 0.039f, dy = -0.001f)
                // l 0.039 0.001
                lineToRelative(dx = 0.039f, dy = 0.001f)
                // l 0.006 -0.003
                lineToRelative(dx = 0.006f, dy = -0.003f)
                // c 0.697 -0.015 1.65 -0.219 1.804 -0.539
                curveToRelative(
                    dx1 = 0.697f,
                    dy1 = -0.015f,
                    dx2 = 1.65f,
                    dy2 = -0.219f,
                    dx3 = 1.804f,
                    dy3 = -0.539f,
                )
                // c 0.16 -0.333 -0.413 -1.188 -0.413 -1.188
                curveToRelative(
                    dx1 = 0.16f,
                    dy1 = -0.333f,
                    dx2 = -0.413f,
                    dy2 = -1.188f,
                    dx3 = -0.413f,
                    dy3 = -1.188f,
                )
                // s 0.228 -0.291 0.078 -0.541
                reflectiveCurveToRelative(
                    dx1 = 0.228f,
                    dy1 = -0.291f,
                    dx2 = 0.078f,
                    dy2 = -0.541f,
                )
                // c -0.151 -0.25 -0.447 -0.688 -0.447 -0.688
                curveToRelative(
                    dx1 = -0.151f,
                    dy1 = -0.25f,
                    dx2 = -0.447f,
                    dy2 = -0.688f,
                    dx3 = -0.447f,
                    dy3 = -0.688f,
                )
                // s 0.203 -0.168 0 -0.584
                reflectiveCurveToRelative(
                    dx1 = 0.203f,
                    dy1 = -0.168f,
                    dx2 = 0.0f,
                    dy2 = -0.584f,
                )
                // c -0.202 -0.416 -0.184 -1.104 0.111 -1.312
                curveToRelative(
                    dx1 = -0.202f,
                    dy1 = -0.416f,
                    dx2 = -0.184f,
                    dy2 = -1.104f,
                    dx3 = 0.111f,
                    dy3 = -1.312f,
                )
                // c 0.295 -0.208 0.335 0.854 0.335 0.854
                curveToRelative(
                    dx1 = 0.295f,
                    dy1 = -0.208f,
                    dx2 = 0.335f,
                    dy2 = 0.854f,
                    dx3 = 0.335f,
                    dy3 = 0.854f,
                )
                // l 0.218 -0.25
                lineToRelative(dx = 0.218f, dy = -0.25f)
                // l 0.332 0.542
                lineToRelative(dx = 0.332f, dy = 0.542f)
                // l 0.092 -0.562
                lineToRelative(dx = 0.092f, dy = -0.562f)
                // l 0.185 0.312
                lineToRelative(dx = 0.185f, dy = 0.312f)
                // l 0.11 -0.584
                lineToRelative(dx = 0.11f, dy = -0.584f)
                // s 0.203 0.208 0.517 0.188
                reflectiveCurveToRelative(
                    dx1 = 0.203f,
                    dy1 = 0.208f,
                    dx2 = 0.517f,
                    dy2 = 0.188f,
                )
                // c -0.388 -0.646 0 -0.5 0 -0.5
                curveToRelative(
                    dx1 = -0.388f,
                    dy1 = -0.646f,
                    dx2 = 0.0f,
                    dy2 = -0.5f,
                    dx3 = 0.0f,
                    dy3 = -0.5f,
                )
                // s 0.148 0.375 0.332 0.542
                reflectiveCurveToRelative(
                    dx1 = 0.148f,
                    dy1 = 0.375f,
                    dx2 = 0.332f,
                    dy2 = 0.542f,
                )
                // s 0.24 0.625 0.48 0.688
                reflectiveCurveToRelative(
                    dx1 = 0.24f,
                    dy1 = 0.625f,
                    dx2 = 0.48f,
                    dy2 = 0.688f,
                )
                // c 0.24 0.062 0.111 -0.542 0.111 -0.542
                curveToRelative(
                    dx1 = 0.24f,
                    dy1 = 0.062f,
                    dx2 = 0.111f,
                    dy2 = -0.542f,
                    dx3 = 0.111f,
                    dy3 = -0.542f,
                )
                // s 0.24 0.5 0.627 0.604
                reflectiveCurveToRelative(
                    dx1 = 0.24f,
                    dy1 = 0.5f,
                    dx2 = 0.627f,
                    dy2 = 0.604f,
                )
                // c -0.35 -0.75 -0.221 -1.626 0 -2.604
                curveToRelative(
                    dx1 = -0.35f,
                    dy1 = -0.75f,
                    dx2 = -0.221f,
                    dy2 = -1.626f,
                    dx3 = 0.0f,
                    dy3 = -2.604f,
                )
                // c 0.222 -0.979 0.111 -2.125 0.111 -2.125
                curveToRelative(
                    dx1 = 0.222f,
                    dy1 = -0.979f,
                    dx2 = 0.111f,
                    dy2 = -2.125f,
                    dx3 = 0.111f,
                    dy3 = -2.125f,
                )
                // s 0.206 -2.167 0.03 -3.375z
                reflectiveCurveToRelative(
                    dx1 = 0.206f,
                    dy1 = -2.167f,
                    dx2 = 0.03f,
                    dy2 = -3.375f,
                )
                close()
            }
            // M11.891 14.312 c-0.44 -0.422 -1.538 -0.969 -1.902 -0.891 -0.364 0.079 -0.656 0.329 -0.385 0.72 0.271 0.391 0.385 0.375 0.385 0.375 s0.433 -0.391 0.621 -0.172 c0.188 0.219 0.031 0.297 -0.312 0.328 -0.344 0.031 -0.693 -0.203 -0.693 -0.203 s0.113 0.406 0.59 0.453 c0.321 0.312 0.726 0.078 0.93 0.078 s1.156 -0.312 0.766 -0.688z M13.022 14.312 c0.44 -0.422 1.538 -0.969 1.902 -0.891 0.364 0.078 0.656 0.328 0.385 0.719 -0.271 0.391 -0.385 0.375 -0.385 0.375 s-0.433 -0.391 -0.621 -0.172 c-0.188 0.219 -0.031 0.297 0.312 0.328 0.344 0.031 0.693 -0.203 0.693 -0.203 s-0.113 0.406 -0.59 0.453 c-0.321 0.313 -0.726 0.079 -0.93 0.079 s-1.157 -0.312 -0.766 -0.688z M9.969 25.199 c0.137 -0.316 0.041 -0.361 -0.069 -0.471 -0.111 -0.109 -0.166 -0.262 -0.166 -0.262 s-0.055 0.152 -0.166 0.262 c-0.111 0.109 -0.207 0.154 -0.07 0.471 -0.333 -0.197 -0.388 0.164 -0.235 0.383 0.043 -0.197 0.305 -0.152 0.305 0.088 s-0.217 0.131 -0.191 0.229 c0.027 0.099 0.225 0.306 0.356 0.306 0.131 0 0.33 -0.207 0.356 -0.306 0.027 -0.099 -0.19 0.011 -0.19 -0.229 0 -0.24 0.261 -0.285 0.305 -0.088 0.154 -0.219 0.099 -0.58 -0.235 -0.383z M15.407 25.199 c0.137 -0.316 0.041 -0.361 -0.07 -0.471 -0.111 -0.109 -0.166 -0.262 -0.166 -0.262 s-0.055 0.152 -0.166 0.262 c-0.111 0.109 -0.207 0.154 -0.07 0.471 -0.333 -0.197 -0.388 0.164 -0.235 0.383 0.043 -0.197 0.305 -0.152 0.305 0.088 s-0.217 0.131 -0.19 0.229 c0.026 0.099 0.225 0.306 0.356 0.306 0.131 0 0.33 -0.207 0.356 -0.306 0.027 -0.099 -0.19 0.011 -0.19 -0.229 0 -0.24 0.261 -0.285 0.305 -0.088 0.153 -0.219 0.099 -0.58 -0.235 -0.383z
            path(
                fill = SolidColor(Color(0xFFEDB92E)),
            ) {
                // M 11.891 14.312
                moveTo(x = 11.891f, y = 14.312f)
                // c -0.44 -0.422 -1.538 -0.969 -1.902 -0.891
                curveToRelative(
                    dx1 = -0.44f,
                    dy1 = -0.422f,
                    dx2 = -1.538f,
                    dy2 = -0.969f,
                    dx3 = -1.902f,
                    dy3 = -0.891f,
                )
                // c -0.364 0.079 -0.656 0.329 -0.385 0.72
                curveToRelative(
                    dx1 = -0.364f,
                    dy1 = 0.079f,
                    dx2 = -0.656f,
                    dy2 = 0.329f,
                    dx3 = -0.385f,
                    dy3 = 0.72f,
                )
                // c 0.271 0.391 0.385 0.375 0.385 0.375
                curveToRelative(
                    dx1 = 0.271f,
                    dy1 = 0.391f,
                    dx2 = 0.385f,
                    dy2 = 0.375f,
                    dx3 = 0.385f,
                    dy3 = 0.375f,
                )
                // s 0.433 -0.391 0.621 -0.172
                reflectiveCurveToRelative(
                    dx1 = 0.433f,
                    dy1 = -0.391f,
                    dx2 = 0.621f,
                    dy2 = -0.172f,
                )
                // c 0.188 0.219 0.031 0.297 -0.312 0.328
                curveToRelative(
                    dx1 = 0.188f,
                    dy1 = 0.219f,
                    dx2 = 0.031f,
                    dy2 = 0.297f,
                    dx3 = -0.312f,
                    dy3 = 0.328f,
                )
                // c -0.344 0.031 -0.693 -0.203 -0.693 -0.203
                curveToRelative(
                    dx1 = -0.344f,
                    dy1 = 0.031f,
                    dx2 = -0.693f,
                    dy2 = -0.203f,
                    dx3 = -0.693f,
                    dy3 = -0.203f,
                )
                // s 0.113 0.406 0.59 0.453
                reflectiveCurveToRelative(
                    dx1 = 0.113f,
                    dy1 = 0.406f,
                    dx2 = 0.59f,
                    dy2 = 0.453f,
                )
                // c 0.321 0.312 0.726 0.078 0.93 0.078
                curveToRelative(
                    dx1 = 0.321f,
                    dy1 = 0.312f,
                    dx2 = 0.726f,
                    dy2 = 0.078f,
                    dx3 = 0.93f,
                    dy3 = 0.078f,
                )
                // s 1.156 -0.312 0.766 -0.688z
                reflectiveCurveToRelative(
                    dx1 = 1.156f,
                    dy1 = -0.312f,
                    dx2 = 0.766f,
                    dy2 = -0.688f,
                )
                close()
                // M 13.022 14.312
                moveTo(x = 13.022f, y = 14.312f)
                // c 0.44 -0.422 1.538 -0.969 1.902 -0.891
                curveToRelative(
                    dx1 = 0.44f,
                    dy1 = -0.422f,
                    dx2 = 1.538f,
                    dy2 = -0.969f,
                    dx3 = 1.902f,
                    dy3 = -0.891f,
                )
                // c 0.364 0.078 0.656 0.328 0.385 0.719
                curveToRelative(
                    dx1 = 0.364f,
                    dy1 = 0.078f,
                    dx2 = 0.656f,
                    dy2 = 0.328f,
                    dx3 = 0.385f,
                    dy3 = 0.719f,
                )
                // c -0.271 0.391 -0.385 0.375 -0.385 0.375
                curveToRelative(
                    dx1 = -0.271f,
                    dy1 = 0.391f,
                    dx2 = -0.385f,
                    dy2 = 0.375f,
                    dx3 = -0.385f,
                    dy3 = 0.375f,
                )
                // s -0.433 -0.391 -0.621 -0.172
                reflectiveCurveToRelative(
                    dx1 = -0.433f,
                    dy1 = -0.391f,
                    dx2 = -0.621f,
                    dy2 = -0.172f,
                )
                // c -0.188 0.219 -0.031 0.297 0.312 0.328
                curveToRelative(
                    dx1 = -0.188f,
                    dy1 = 0.219f,
                    dx2 = -0.031f,
                    dy2 = 0.297f,
                    dx3 = 0.312f,
                    dy3 = 0.328f,
                )
                // c 0.344 0.031 0.693 -0.203 0.693 -0.203
                curveToRelative(
                    dx1 = 0.344f,
                    dy1 = 0.031f,
                    dx2 = 0.693f,
                    dy2 = -0.203f,
                    dx3 = 0.693f,
                    dy3 = -0.203f,
                )
                // s -0.113 0.406 -0.59 0.453
                reflectiveCurveToRelative(
                    dx1 = -0.113f,
                    dy1 = 0.406f,
                    dx2 = -0.59f,
                    dy2 = 0.453f,
                )
                // c -0.321 0.313 -0.726 0.079 -0.93 0.079
                curveToRelative(
                    dx1 = -0.321f,
                    dy1 = 0.313f,
                    dx2 = -0.726f,
                    dy2 = 0.079f,
                    dx3 = -0.93f,
                    dy3 = 0.079f,
                )
                // s -1.157 -0.312 -0.766 -0.688z
                reflectiveCurveToRelative(
                    dx1 = -1.157f,
                    dy1 = -0.312f,
                    dx2 = -0.766f,
                    dy2 = -0.688f,
                )
                close()
                // M 9.969 25.199
                moveTo(x = 9.969f, y = 25.199f)
                // c 0.137 -0.316 0.041 -0.361 -0.069 -0.471
                curveToRelative(
                    dx1 = 0.137f,
                    dy1 = -0.316f,
                    dx2 = 0.041f,
                    dy2 = -0.361f,
                    dx3 = -0.069f,
                    dy3 = -0.471f,
                )
                // c -0.111 -0.109 -0.166 -0.262 -0.166 -0.262
                curveToRelative(
                    dx1 = -0.111f,
                    dy1 = -0.109f,
                    dx2 = -0.166f,
                    dy2 = -0.262f,
                    dx3 = -0.166f,
                    dy3 = -0.262f,
                )
                // s -0.055 0.152 -0.166 0.262
                reflectiveCurveToRelative(
                    dx1 = -0.055f,
                    dy1 = 0.152f,
                    dx2 = -0.166f,
                    dy2 = 0.262f,
                )
                // c -0.111 0.109 -0.207 0.154 -0.07 0.471
                curveToRelative(
                    dx1 = -0.111f,
                    dy1 = 0.109f,
                    dx2 = -0.207f,
                    dy2 = 0.154f,
                    dx3 = -0.07f,
                    dy3 = 0.471f,
                )
                // c -0.333 -0.197 -0.388 0.164 -0.235 0.383
                curveToRelative(
                    dx1 = -0.333f,
                    dy1 = -0.197f,
                    dx2 = -0.388f,
                    dy2 = 0.164f,
                    dx3 = -0.235f,
                    dy3 = 0.383f,
                )
                // c 0.043 -0.197 0.305 -0.152 0.305 0.088
                curveToRelative(
                    dx1 = 0.043f,
                    dy1 = -0.197f,
                    dx2 = 0.305f,
                    dy2 = -0.152f,
                    dx3 = 0.305f,
                    dy3 = 0.088f,
                )
                // s -0.217 0.131 -0.191 0.229
                reflectiveCurveToRelative(
                    dx1 = -0.217f,
                    dy1 = 0.131f,
                    dx2 = -0.191f,
                    dy2 = 0.229f,
                )
                // c 0.027 0.099 0.225 0.306 0.356 0.306
                curveToRelative(
                    dx1 = 0.027f,
                    dy1 = 0.099f,
                    dx2 = 0.225f,
                    dy2 = 0.306f,
                    dx3 = 0.356f,
                    dy3 = 0.306f,
                )
                // c 0.131 0 0.33 -0.207 0.356 -0.306
                curveToRelative(
                    dx1 = 0.131f,
                    dy1 = 0.0f,
                    dx2 = 0.33f,
                    dy2 = -0.207f,
                    dx3 = 0.356f,
                    dy3 = -0.306f,
                )
                // c 0.027 -0.099 -0.19 0.011 -0.19 -0.229
                curveToRelative(
                    dx1 = 0.027f,
                    dy1 = -0.099f,
                    dx2 = -0.19f,
                    dy2 = 0.011f,
                    dx3 = -0.19f,
                    dy3 = -0.229f,
                )
                // c 0 -0.24 0.261 -0.285 0.305 -0.088
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.24f,
                    dx2 = 0.261f,
                    dy2 = -0.285f,
                    dx3 = 0.305f,
                    dy3 = -0.088f,
                )
                // c 0.154 -0.219 0.099 -0.58 -0.235 -0.383z
                curveToRelative(
                    dx1 = 0.154f,
                    dy1 = -0.219f,
                    dx2 = 0.099f,
                    dy2 = -0.58f,
                    dx3 = -0.235f,
                    dy3 = -0.383f,
                )
                close()
                // M 15.407 25.199
                moveTo(x = 15.407f, y = 25.199f)
                // c 0.137 -0.316 0.041 -0.361 -0.07 -0.471
                curveToRelative(
                    dx1 = 0.137f,
                    dy1 = -0.316f,
                    dx2 = 0.041f,
                    dy2 = -0.361f,
                    dx3 = -0.07f,
                    dy3 = -0.471f,
                )
                // c -0.111 -0.109 -0.166 -0.262 -0.166 -0.262
                curveToRelative(
                    dx1 = -0.111f,
                    dy1 = -0.109f,
                    dx2 = -0.166f,
                    dy2 = -0.262f,
                    dx3 = -0.166f,
                    dy3 = -0.262f,
                )
                // s -0.055 0.152 -0.166 0.262
                reflectiveCurveToRelative(
                    dx1 = -0.055f,
                    dy1 = 0.152f,
                    dx2 = -0.166f,
                    dy2 = 0.262f,
                )
                // c -0.111 0.109 -0.207 0.154 -0.07 0.471
                curveToRelative(
                    dx1 = -0.111f,
                    dy1 = 0.109f,
                    dx2 = -0.207f,
                    dy2 = 0.154f,
                    dx3 = -0.07f,
                    dy3 = 0.471f,
                )
                // c -0.333 -0.197 -0.388 0.164 -0.235 0.383
                curveToRelative(
                    dx1 = -0.333f,
                    dy1 = -0.197f,
                    dx2 = -0.388f,
                    dy2 = 0.164f,
                    dx3 = -0.235f,
                    dy3 = 0.383f,
                )
                // c 0.043 -0.197 0.305 -0.152 0.305 0.088
                curveToRelative(
                    dx1 = 0.043f,
                    dy1 = -0.197f,
                    dx2 = 0.305f,
                    dy2 = -0.152f,
                    dx3 = 0.305f,
                    dy3 = 0.088f,
                )
                // s -0.217 0.131 -0.19 0.229
                reflectiveCurveToRelative(
                    dx1 = -0.217f,
                    dy1 = 0.131f,
                    dx2 = -0.19f,
                    dy2 = 0.229f,
                )
                // c 0.026 0.099 0.225 0.306 0.356 0.306
                curveToRelative(
                    dx1 = 0.026f,
                    dy1 = 0.099f,
                    dx2 = 0.225f,
                    dy2 = 0.306f,
                    dx3 = 0.356f,
                    dy3 = 0.306f,
                )
                // c 0.131 0 0.33 -0.207 0.356 -0.306
                curveToRelative(
                    dx1 = 0.131f,
                    dy1 = 0.0f,
                    dx2 = 0.33f,
                    dy2 = -0.207f,
                    dx3 = 0.356f,
                    dy3 = -0.306f,
                )
                // c 0.027 -0.099 -0.19 0.011 -0.19 -0.229
                curveToRelative(
                    dx1 = 0.027f,
                    dy1 = -0.099f,
                    dx2 = -0.19f,
                    dy2 = 0.011f,
                    dx3 = -0.19f,
                    dy3 = -0.229f,
                )
                // c 0 -0.24 0.261 -0.285 0.305 -0.088
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.24f,
                    dx2 = 0.261f,
                    dy2 = -0.285f,
                    dx3 = 0.305f,
                    dy3 = -0.088f,
                )
                // c 0.153 -0.219 0.099 -0.58 -0.235 -0.383z
                curveToRelative(
                    dx1 = 0.153f,
                    dy1 = -0.219f,
                    dx2 = 0.099f,
                    dy2 = -0.58f,
                    dx3 = -0.235f,
                    dy3 = -0.383f,
                )
                close()
            }
            // M10.244 16.875 v3.859 c0 1.233 1 2.234 2.234 2.234 s2.234 -1.001 2.234 -2.234 v-3.859 h-4.468z
            path(
                fill = SolidColor(Color(0xFFC6363C)),
            ) {
                // M 10.244 16.875
                moveTo(x = 10.244f, y = 16.875f)
                // v 3.859
                verticalLineToRelative(dy = 3.859f)
                // c 0 1.233 1 2.234 2.234 2.234
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.233f,
                    dx2 = 1.0f,
                    dy2 = 2.234f,
                    dx3 = 2.234f,
                    dy3 = 2.234f,
                )
                // s 2.234 -1.001 2.234 -2.234
                reflectiveCurveToRelative(
                    dx1 = 2.234f,
                    dy1 = -1.001f,
                    dx2 = 2.234f,
                    dy2 = -2.234f,
                )
                // v -3.859
                verticalLineToRelative(dy = -3.859f)
                // h -4.468z
                horizontalLineToRelative(dx = -4.468f)
                close()
            }
            // M14.712 19.172 H12.96 v-2.297 h-0.962 v2.297 h-1.753 v0.963 h1.753 v2.779 c0.155 0.034 0.315 0.055 0.481 0.055 0.166 0 0.326 -0.021 0.482 -0.055 v-2.779 h1.753 v-0.963z
            path(
                fill = SolidColor(Color(0xFFEEEEEE)),
            ) {
                // M 14.712 19.172
                moveTo(x = 14.712f, y = 19.172f)
                // H 12.96
                horizontalLineTo(x = 12.96f)
                // v -2.297
                verticalLineToRelative(dy = -2.297f)
                // h -0.962
                horizontalLineToRelative(dx = -0.962f)
                // v 2.297
                verticalLineToRelative(dy = 2.297f)
                // h -1.753
                horizontalLineToRelative(dx = -1.753f)
                // v 0.963
                verticalLineToRelative(dy = 0.963f)
                // h 1.753
                horizontalLineToRelative(dx = 1.753f)
                // v 2.779
                verticalLineToRelative(dy = 2.779f)
                // c 0.155 0.034 0.315 0.055 0.481 0.055
                curveToRelative(
                    dx1 = 0.155f,
                    dy1 = 0.034f,
                    dx2 = 0.315f,
                    dy2 = 0.055f,
                    dx3 = 0.481f,
                    dy3 = 0.055f,
                )
                // c 0.166 0 0.326 -0.021 0.482 -0.055
                curveToRelative(
                    dx1 = 0.166f,
                    dy1 = 0.0f,
                    dx2 = 0.326f,
                    dy2 = -0.021f,
                    dx3 = 0.482f,
                    dy3 = -0.055f,
                )
                // v -2.779
                verticalLineToRelative(dy = -2.779f)
                // h 1.753
                horizontalLineToRelative(dx = 1.753f)
                // v -0.963z
                verticalLineToRelative(dy = -0.963f)
                close()
            }
        }.build().also { _emoji1f1f71f1f8 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1f71f1f8: ImageVector? = null
