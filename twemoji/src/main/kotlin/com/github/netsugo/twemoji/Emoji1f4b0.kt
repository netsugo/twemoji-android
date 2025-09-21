package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f4b0: ImageVector
    get() {
        val current = _emoji1f4b0
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f4b0",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M31.898 23.938 C31.3 17.32 28 14 28 14 l-6 -8 h-8 l-6 8 s-1.419 1.433 -2.567 4.275 C3.444 18.935 2 20.789 2 23 c0 1.448 0.625 2.742 1.609 3.655 C3.233 27.357 3 28.147 3 29 c0 1.958 1.136 3.636 2.775 4.456 C7.058 35.378 8.772 36 10 36 h16 c1.379 0 3.373 -0.779 4.678 -3.31 C32.609 31.999 34 30.17 34 28 c0 -1.678 -0.834 -3.154 -2.102 -4.062z M18 6 c0.55 0 1.058 -0.158 1.5 -0.416 0.443 0.258 0.951 0.416 1.5 0.416 1.657 0 4 -2.344 4 -4 0 0 0 -2 -2 -2 -0.788 0 -1 1 -2 1 s-1 -1 -3 -1 -2 1 -3 1 -1.211 -1 -2 -1 c-2 0 -2 2 -2 2 0 1.656 2.344 4 4 4 0.549 0 1.057 -0.158 1.5 -0.416 0.443 0.258 0.951 0.416 1.5 0.416z
            path(
                fill = SolidColor(Color(0xFFFDD888)),
            ) {
                // M 31.898 23.938
                moveTo(x = 31.898f, y = 23.938f)
                // C 31.3 17.32 28 14 28 14
                curveTo(
                    x1 = 31.3f,
                    y1 = 17.32f,
                    x2 = 28.0f,
                    y2 = 14.0f,
                    x3 = 28.0f,
                    y3 = 14.0f,
                )
                // l -6 -8
                lineToRelative(dx = -6.0f, dy = -8.0f)
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // l -6 8
                lineToRelative(dx = -6.0f, dy = 8.0f)
                // s -1.419 1.433 -2.567 4.275
                reflectiveCurveToRelative(
                    dx1 = -1.419f,
                    dy1 = 1.433f,
                    dx2 = -2.567f,
                    dy2 = 4.275f,
                )
                // C 3.444 18.935 2 20.789 2 23
                curveTo(
                    x1 = 3.444f,
                    y1 = 18.935f,
                    x2 = 2.0f,
                    y2 = 20.789f,
                    x3 = 2.0f,
                    y3 = 23.0f,
                )
                // c 0 1.448 0.625 2.742 1.609 3.655
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.448f,
                    dx2 = 0.625f,
                    dy2 = 2.742f,
                    dx3 = 1.609f,
                    dy3 = 3.655f,
                )
                // C 3.233 27.357 3 28.147 3 29
                curveTo(
                    x1 = 3.233f,
                    y1 = 27.357f,
                    x2 = 3.0f,
                    y2 = 28.147f,
                    x3 = 3.0f,
                    y3 = 29.0f,
                )
                // c 0 1.958 1.136 3.636 2.775 4.456
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.958f,
                    dx2 = 1.136f,
                    dy2 = 3.636f,
                    dx3 = 2.775f,
                    dy3 = 4.456f,
                )
                // C 7.058 35.378 8.772 36 10 36
                curveTo(
                    x1 = 7.058f,
                    y1 = 35.378f,
                    x2 = 8.772f,
                    y2 = 36.0f,
                    x3 = 10.0f,
                    y3 = 36.0f,
                )
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // c 1.379 0 3.373 -0.779 4.678 -3.31
                curveToRelative(
                    dx1 = 1.379f,
                    dy1 = 0.0f,
                    dx2 = 3.373f,
                    dy2 = -0.779f,
                    dx3 = 4.678f,
                    dy3 = -3.31f,
                )
                // C 32.609 31.999 34 30.17 34 28
                curveTo(
                    x1 = 32.609f,
                    y1 = 31.999f,
                    x2 = 34.0f,
                    y2 = 30.17f,
                    x3 = 34.0f,
                    y3 = 28.0f,
                )
                // c 0 -1.678 -0.834 -3.154 -2.102 -4.062z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.678f,
                    dx2 = -0.834f,
                    dy2 = -3.154f,
                    dx3 = -2.102f,
                    dy3 = -4.062f,
                )
                close()
                // M 18 6
                moveTo(x = 18.0f, y = 6.0f)
                // c 0.55 0 1.058 -0.158 1.5 -0.416
                curveToRelative(
                    dx1 = 0.55f,
                    dy1 = 0.0f,
                    dx2 = 1.058f,
                    dy2 = -0.158f,
                    dx3 = 1.5f,
                    dy3 = -0.416f,
                )
                // c 0.443 0.258 0.951 0.416 1.5 0.416
                curveToRelative(
                    dx1 = 0.443f,
                    dy1 = 0.258f,
                    dx2 = 0.951f,
                    dy2 = 0.416f,
                    dx3 = 1.5f,
                    dy3 = 0.416f,
                )
                // c 1.657 0 4 -2.344 4 -4
                curveToRelative(
                    dx1 = 1.657f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = -2.344f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // c 0 0 0 -2 -2 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 0.0f,
                    dy2 = -2.0f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // c -0.788 0 -1 1 -2 1
                curveToRelative(
                    dx1 = -0.788f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                    dx3 = -2.0f,
                    dy3 = 1.0f,
                )
                // s -1 -1 -3 -1
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                    dx2 = -3.0f,
                    dy2 = -1.0f,
                )
                // s -2 1 -3 1
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 1.0f,
                    dx2 = -3.0f,
                    dy2 = 1.0f,
                )
                // s -1.211 -1 -2 -1
                reflectiveCurveToRelative(
                    dx1 = -1.211f,
                    dy1 = -1.0f,
                    dx2 = -2.0f,
                    dy2 = -1.0f,
                )
                // c -2 0 -2 2 -2 2
                curveToRelative(
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = 2.0f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // c 0 1.656 2.344 4 4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.656f,
                    dx2 = 2.344f,
                    dy2 = 4.0f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // c 0.549 0 1.057 -0.158 1.5 -0.416
                curveToRelative(
                    dx1 = 0.549f,
                    dy1 = 0.0f,
                    dx2 = 1.057f,
                    dy2 = -0.158f,
                    dx3 = 1.5f,
                    dy3 = -0.416f,
                )
                // c 0.443 0.258 0.951 0.416 1.5 0.416z
                curveToRelative(
                    dx1 = 0.443f,
                    dy1 = 0.258f,
                    dx2 = 0.951f,
                    dy2 = 0.416f,
                    dx3 = 1.5f,
                    dy3 = 0.416f,
                )
                close()
            }
            // M24 6 c0 0.552 -0.447 1 -1 1 H13 c-0.552 0 -1 -0.448 -1 -1 s0.448 -1 1 -1 h10 c0.553 0 1 0.448 1 1z
            path(
                fill = SolidColor(Color(0xFFBF6952)),
            ) {
                // M 24 6
                moveTo(x = 24.0f, y = 6.0f)
                // c 0 0.552 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // H 13
                horizontalLineTo(x = 13.0f)
                // c -0.552 0 -1 -0.448 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.448f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // s 0.448 -1 1 -1
                reflectiveCurveToRelative(
                    dx1 = 0.448f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // c 0.553 0 1 0.448 1 1z
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.448f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                close()
            }
            // M23.901 24.542 c0 -4.477 -8.581 -4.185 -8.581 -6.886 0 -1.308 1.301 -1.947 2.811 -1.947 2.538 0 2.99 1.569 4.139 1.569 0.813 0 1.205 -0.493 1.205 -1.046 0 -1.284 -2.024 -2.256 -3.965 -2.592 V12.4 c0 -0.773 -0.65 -1.4 -1.454 -1.4 -0.805 0 -1.456 0.627 -1.456 1.4 v1.283 c-2.116 0.463 -3.937 1.875 -3.937 4.176 0 4.299 8.579 4.125 8.579 7.145 0 1.047 -1.178 2.093 -3.111 2.093 -2.901 0 -3.867 -1.889 -5.045 -1.889 -0.574 0 -1.087 0.464 -1.087 1.164 0 1.113 1.938 2.451 4.603 2.824 l-0.001 0.01 v1.398 c0 0.772 0.652 1.4 1.456 1.4 0.804 0 1.455 -0.628 1.455 -1.4 v-1.398 c0 -0.017 -0.008 -0.03 -0.009 -0.045 2.398 -0.43 4.398 -1.932 4.398 -4.619z
            path(
                fill = SolidColor(Color(0xFF67757F)),
            ) {
                // M 23.901 24.542
                moveTo(x = 23.901f, y = 24.542f)
                // c 0 -4.477 -8.581 -4.185 -8.581 -6.886
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.477f,
                    dx2 = -8.581f,
                    dy2 = -4.185f,
                    dx3 = -8.581f,
                    dy3 = -6.886f,
                )
                // c 0 -1.308 1.301 -1.947 2.811 -1.947
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.308f,
                    dx2 = 1.301f,
                    dy2 = -1.947f,
                    dx3 = 2.811f,
                    dy3 = -1.947f,
                )
                // c 2.538 0 2.99 1.569 4.139 1.569
                curveToRelative(
                    dx1 = 2.538f,
                    dy1 = 0.0f,
                    dx2 = 2.99f,
                    dy2 = 1.569f,
                    dx3 = 4.139f,
                    dy3 = 1.569f,
                )
                // c 0.813 0 1.205 -0.493 1.205 -1.046
                curveToRelative(
                    dx1 = 0.813f,
                    dy1 = 0.0f,
                    dx2 = 1.205f,
                    dy2 = -0.493f,
                    dx3 = 1.205f,
                    dy3 = -1.046f,
                )
                // c 0 -1.284 -2.024 -2.256 -3.965 -2.592
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.284f,
                    dx2 = -2.024f,
                    dy2 = -2.256f,
                    dx3 = -3.965f,
                    dy3 = -2.592f,
                )
                // V 12.4
                verticalLineTo(y = 12.4f)
                // c 0 -0.773 -0.65 -1.4 -1.454 -1.4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.773f,
                    dx2 = -0.65f,
                    dy2 = -1.4f,
                    dx3 = -1.454f,
                    dy3 = -1.4f,
                )
                // c -0.805 0 -1.456 0.627 -1.456 1.4
                curveToRelative(
                    dx1 = -0.805f,
                    dy1 = 0.0f,
                    dx2 = -1.456f,
                    dy2 = 0.627f,
                    dx3 = -1.456f,
                    dy3 = 1.4f,
                )
                // v 1.283
                verticalLineToRelative(dy = 1.283f)
                // c -2.116 0.463 -3.937 1.875 -3.937 4.176
                curveToRelative(
                    dx1 = -2.116f,
                    dy1 = 0.463f,
                    dx2 = -3.937f,
                    dy2 = 1.875f,
                    dx3 = -3.937f,
                    dy3 = 4.176f,
                )
                // c 0 4.299 8.579 4.125 8.579 7.145
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.299f,
                    dx2 = 8.579f,
                    dy2 = 4.125f,
                    dx3 = 8.579f,
                    dy3 = 7.145f,
                )
                // c 0 1.047 -1.178 2.093 -3.111 2.093
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.047f,
                    dx2 = -1.178f,
                    dy2 = 2.093f,
                    dx3 = -3.111f,
                    dy3 = 2.093f,
                )
                // c -2.901 0 -3.867 -1.889 -5.045 -1.889
                curveToRelative(
                    dx1 = -2.901f,
                    dy1 = 0.0f,
                    dx2 = -3.867f,
                    dy2 = -1.889f,
                    dx3 = -5.045f,
                    dy3 = -1.889f,
                )
                // c -0.574 0 -1.087 0.464 -1.087 1.164
                curveToRelative(
                    dx1 = -0.574f,
                    dy1 = 0.0f,
                    dx2 = -1.087f,
                    dy2 = 0.464f,
                    dx3 = -1.087f,
                    dy3 = 1.164f,
                )
                // c 0 1.113 1.938 2.451 4.603 2.824
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.113f,
                    dx2 = 1.938f,
                    dy2 = 2.451f,
                    dx3 = 4.603f,
                    dy3 = 2.824f,
                )
                // l -0.001 0.01
                lineToRelative(dx = -0.001f, dy = 0.01f)
                // v 1.398
                verticalLineToRelative(dy = 1.398f)
                // c 0 0.772 0.652 1.4 1.456 1.4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.772f,
                    dx2 = 0.652f,
                    dy2 = 1.4f,
                    dx3 = 1.456f,
                    dy3 = 1.4f,
                )
                // c 0.804 0 1.455 -0.628 1.455 -1.4
                curveToRelative(
                    dx1 = 0.804f,
                    dy1 = 0.0f,
                    dx2 = 1.455f,
                    dy2 = -0.628f,
                    dx3 = 1.455f,
                    dy3 = -1.4f,
                )
                // v -1.398
                verticalLineToRelative(dy = -1.398f)
                // c 0 -0.017 -0.008 -0.03 -0.009 -0.045
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.017f,
                    dx2 = -0.008f,
                    dy2 = -0.03f,
                    dx3 = -0.009f,
                    dy3 = -0.045f,
                )
                // c 2.398 -0.43 4.398 -1.932 4.398 -4.619z
                curveToRelative(
                    dx1 = 2.398f,
                    dy1 = -0.43f,
                    dx2 = 4.398f,
                    dy2 = -1.932f,
                    dx3 = 4.398f,
                    dy3 = -4.619f,
                )
                close()
            }
        }.build().also { _emoji1f4b0 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f4b0: ImageVector? = null
