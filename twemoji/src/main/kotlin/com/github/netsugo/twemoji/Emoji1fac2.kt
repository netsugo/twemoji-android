package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1fac2: ImageVector
    get() {
        val current = _emoji1fac2
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1fac2",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M21.3375 15.8262 a8 6.75 102 1 0 3.3266 -15.6504 a8 6.75 102 1 0 -3.3266 15.6504z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 21.3375 15.8262
                moveTo(x = 21.3375f, y = 15.8262f)
                // a 8 6.75 102 1 0 3.3266 -15.6504
                arcToRelative(
                    a = 8.0f,
                    b = 6.75f,
                    theta = 102.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 3.3266f,
                    dy1 = -15.6504f,
                )
                // a 8 6.75 102 1 0 -3.3266 15.6504z
                arcToRelative(
                    a = 8.0f,
                    b = 6.75f,
                    theta = 102.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -3.3266f,
                    dy1 = 15.6504f,
                )
                close()
            }
            // M9.724 14.687 v1.579 c-2.414 0.525 -5.381 1.851 -5.829 3.741 C2.493 25.919 2.87 35.081 2.87 35.212 v0.134 c0 0.654 0.663 0.654 1.316 0.654 h16.097 c0.653 0 1.315 0 1.315 -0.654 V20.007 c0 -1.719 -1.413 -3.438 -4.632 -3.834 v-1.486 H9.724z
            path(
                fill = SolidColor(Color(0xFF226699)),
            ) {
                // M 9.724 14.687
                moveTo(x = 9.724f, y = 14.687f)
                // v 1.579
                verticalLineToRelative(dy = 1.579f)
                // c -2.414 0.525 -5.381 1.851 -5.829 3.741
                curveToRelative(
                    dx1 = -2.414f,
                    dy1 = 0.525f,
                    dx2 = -5.381f,
                    dy2 = 1.851f,
                    dx3 = -5.829f,
                    dy3 = 3.741f,
                )
                // C 2.493 25.919 2.87 35.081 2.87 35.212
                curveTo(
                    x1 = 2.493f,
                    y1 = 25.919f,
                    x2 = 2.87f,
                    y2 = 35.081f,
                    x3 = 2.87f,
                    y3 = 35.212f,
                )
                // v 0.134
                verticalLineToRelative(dy = 0.134f)
                // c 0 0.654 0.663 0.654 1.316 0.654
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.654f,
                    dx2 = 0.663f,
                    dy2 = 0.654f,
                    dx3 = 1.316f,
                    dy3 = 0.654f,
                )
                // h 16.097
                horizontalLineToRelative(dx = 16.097f)
                // c 0.653 0 1.315 0 1.315 -0.654
                curveToRelative(
                    dx1 = 0.653f,
                    dy1 = 0.0f,
                    dx2 = 1.315f,
                    dy2 = 0.0f,
                    dx3 = 1.315f,
                    dy3 = -0.654f,
                )
                // V 20.007
                verticalLineTo(y = 20.007f)
                // c 0 -1.719 -1.413 -3.438 -4.632 -3.834
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.719f,
                    dx2 = -1.413f,
                    dy2 = -3.438f,
                    dx3 = -4.632f,
                    dy3 = -3.834f,
                )
                // v -1.486
                verticalLineToRelative(dy = -1.486f)
                // H 9.724z
                horizontalLineTo(x = 9.724f)
                close()
            }
            // M26.276 13.303 v2.963 c2.414 0.525 5.381 1.851 5.829 3.741 1.401 5.913 1.025 15.075 1.025 15.205 v0.134 c0 0.654 -0.663 0.654 -1.316 0.654 H15.717 c-0.653 0 -1.315 0 -1.315 -0.654 V20.007 c0 -1.719 1.413 -3.438 4.632 -3.834 v-1.486 l7.242 -1.384z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 26.276 13.303
                moveTo(x = 26.276f, y = 13.303f)
                // v 2.963
                verticalLineToRelative(dy = 2.963f)
                // c 2.414 0.525 5.381 1.851 5.829 3.741
                curveToRelative(
                    dx1 = 2.414f,
                    dy1 = 0.525f,
                    dx2 = 5.381f,
                    dy2 = 1.851f,
                    dx3 = 5.829f,
                    dy3 = 3.741f,
                )
                // c 1.401 5.913 1.025 15.075 1.025 15.205
                curveToRelative(
                    dx1 = 1.401f,
                    dy1 = 5.913f,
                    dx2 = 1.025f,
                    dy2 = 15.075f,
                    dx3 = 1.025f,
                    dy3 = 15.205f,
                )
                // v 0.134
                verticalLineToRelative(dy = 0.134f)
                // c 0 0.654 -0.663 0.654 -1.316 0.654
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.654f,
                    dx2 = -0.663f,
                    dy2 = 0.654f,
                    dx3 = -1.316f,
                    dy3 = 0.654f,
                )
                // H 15.717
                horizontalLineTo(x = 15.717f)
                // c -0.653 0 -1.315 0 -1.315 -0.654
                curveToRelative(
                    dx1 = -0.653f,
                    dy1 = 0.0f,
                    dx2 = -1.315f,
                    dy2 = 0.0f,
                    dx3 = -1.315f,
                    dy3 = -0.654f,
                )
                // V 20.007
                verticalLineTo(y = 20.007f)
                // c 0 -1.719 1.413 -3.438 4.632 -3.834
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.719f,
                    dx2 = 1.413f,
                    dy2 = -3.438f,
                    dx3 = 4.632f,
                    dy3 = -3.834f,
                )
                // v -1.486
                verticalLineToRelative(dy = -1.486f)
                // l 7.242 -1.384z
                lineToRelative(dx = 7.242f, dy = -1.384f)
                close()
            }
            // M6.3895 9.4034 a8 6.75 78 1 0 13.205 -2.8068 a8 6.75 78 1 0 -13.205 2.8068z
            path(
                fill = SolidColor(Color(0xFF226699)),
            ) {
                // M 6.3895 9.4034
                moveTo(x = 6.3895f, y = 9.4034f)
                // a 8 6.75 78 1 0 13.205 -2.8068
                arcToRelative(
                    a = 8.0f,
                    b = 6.75f,
                    theta = 78.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 13.205f,
                    dy1 = -2.8068f,
                )
                // a 8 6.75 78 1 0 -13.205 2.8068z
                arcToRelative(
                    a = 8.0f,
                    b = 6.75f,
                    theta = 78.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -13.205f,
                    dy1 = 2.8068f,
                )
                close()
            }
            // M19.092 16.088 c-1.31 0.381 -3.441 0.546 -5.898 -0.382 -2.593 -0.98 -4.978 -1.944 -5.908 -2.268 -0.846 -0.295 -3.005 -0.033 -3.486 0.848 -0.481 0.881 -0.753 2.485 0.437 3.659 s7.458 3.491 9.23 4.533 c0.928 0.546 0.874 3.823 0.928 6.499 0.083 4.043 7.383 -13.67 4.697 -12.889z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 19.092 16.088
                moveTo(x = 19.092f, y = 16.088f)
                // c -1.31 0.381 -3.441 0.546 -5.898 -0.382
                curveToRelative(
                    dx1 = -1.31f,
                    dy1 = 0.381f,
                    dx2 = -3.441f,
                    dy2 = 0.546f,
                    dx3 = -5.898f,
                    dy3 = -0.382f,
                )
                // c -2.593 -0.98 -4.978 -1.944 -5.908 -2.268
                curveToRelative(
                    dx1 = -2.593f,
                    dy1 = -0.98f,
                    dx2 = -4.978f,
                    dy2 = -1.944f,
                    dx3 = -5.908f,
                    dy3 = -2.268f,
                )
                // c -0.846 -0.295 -3.005 -0.033 -3.486 0.848
                curveToRelative(
                    dx1 = -0.846f,
                    dy1 = -0.295f,
                    dx2 = -3.005f,
                    dy2 = -0.033f,
                    dx3 = -3.486f,
                    dy3 = 0.848f,
                )
                // c -0.481 0.881 -0.753 2.485 0.437 3.659
                curveToRelative(
                    dx1 = -0.481f,
                    dy1 = 0.881f,
                    dx2 = -0.753f,
                    dy2 = 2.485f,
                    dx3 = 0.437f,
                    dy3 = 3.659f,
                )
                // s 7.458 3.491 9.23 4.533
                reflectiveCurveToRelative(
                    dx1 = 7.458f,
                    dy1 = 3.491f,
                    dx2 = 9.23f,
                    dy2 = 4.533f,
                )
                // c 0.928 0.546 0.874 3.823 0.928 6.499
                curveToRelative(
                    dx1 = 0.928f,
                    dy1 = 0.546f,
                    dx2 = 0.874f,
                    dy2 = 3.823f,
                    dx3 = 0.928f,
                    dy3 = 6.499f,
                )
                // c 0.083 4.043 7.383 -13.67 4.697 -12.889z
                curveToRelative(
                    dx1 = 0.083f,
                    dy1 = 4.043f,
                    dx2 = 7.383f,
                    dy2 = -13.67f,
                    dx3 = 4.697f,
                    dy3 = -12.889f,
                )
                close()
            }
            // M12.233 25.283 c1.331 0.298 3.604 0.811 5.999 -0.269 2.527 -1.14 4.712 -2.732 5.619 -3.113 0.826 -0.347 2.571 -0.683 3.532 0.629 0.594 0.81 0.907 2.434 -0.207 3.679 -1.115 1.246 -5.497 3.919 -8.739 4.702 -2.749 0.664 -6.967 0.6 -8.313 -0.793 -2.101 -2.175 0.281 -5.245 2.109 -4.835z M24.991 17.235 c0 -1.952 1.724 -3.016 3.739 -3.797 0.835 -0.324 3.005 -0.033 3.486 0.848 0.481 0.881 0.753 2.485 -0.437 3.659 s-6.788 2.294 -6.788 -0.71z
            path(
                fill = SolidColor(Color(0xFF226699)),
            ) {
                // M 12.233 25.283
                moveTo(x = 12.233f, y = 25.283f)
                // c 1.331 0.298 3.604 0.811 5.999 -0.269
                curveToRelative(
                    dx1 = 1.331f,
                    dy1 = 0.298f,
                    dx2 = 3.604f,
                    dy2 = 0.811f,
                    dx3 = 5.999f,
                    dy3 = -0.269f,
                )
                // c 2.527 -1.14 4.712 -2.732 5.619 -3.113
                curveToRelative(
                    dx1 = 2.527f,
                    dy1 = -1.14f,
                    dx2 = 4.712f,
                    dy2 = -2.732f,
                    dx3 = 5.619f,
                    dy3 = -3.113f,
                )
                // c 0.826 -0.347 2.571 -0.683 3.532 0.629
                curveToRelative(
                    dx1 = 0.826f,
                    dy1 = -0.347f,
                    dx2 = 2.571f,
                    dy2 = -0.683f,
                    dx3 = 3.532f,
                    dy3 = 0.629f,
                )
                // c 0.594 0.81 0.907 2.434 -0.207 3.679
                curveToRelative(
                    dx1 = 0.594f,
                    dy1 = 0.81f,
                    dx2 = 0.907f,
                    dy2 = 2.434f,
                    dx3 = -0.207f,
                    dy3 = 3.679f,
                )
                // c -1.115 1.246 -5.497 3.919 -8.739 4.702
                curveToRelative(
                    dx1 = -1.115f,
                    dy1 = 1.246f,
                    dx2 = -5.497f,
                    dy2 = 3.919f,
                    dx3 = -8.739f,
                    dy3 = 4.702f,
                )
                // c -2.749 0.664 -6.967 0.6 -8.313 -0.793
                curveToRelative(
                    dx1 = -2.749f,
                    dy1 = 0.664f,
                    dx2 = -6.967f,
                    dy2 = 0.6f,
                    dx3 = -8.313f,
                    dy3 = -0.793f,
                )
                // c -2.101 -2.175 0.281 -5.245 2.109 -4.835z
                curveToRelative(
                    dx1 = -2.101f,
                    dy1 = -2.175f,
                    dx2 = 0.281f,
                    dy2 = -5.245f,
                    dx3 = 2.109f,
                    dy3 = -4.835f,
                )
                close()
                // M 24.991 17.235
                moveTo(x = 24.991f, y = 17.235f)
                // c 0 -1.952 1.724 -3.016 3.739 -3.797
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.952f,
                    dx2 = 1.724f,
                    dy2 = -3.016f,
                    dx3 = 3.739f,
                    dy3 = -3.797f,
                )
                // c 0.835 -0.324 3.005 -0.033 3.486 0.848
                curveToRelative(
                    dx1 = 0.835f,
                    dy1 = -0.324f,
                    dx2 = 3.005f,
                    dy2 = -0.033f,
                    dx3 = 3.486f,
                    dy3 = 0.848f,
                )
                // c 0.481 0.881 0.753 2.485 -0.437 3.659
                curveToRelative(
                    dx1 = 0.481f,
                    dy1 = 0.881f,
                    dx2 = 0.753f,
                    dy2 = 2.485f,
                    dx3 = -0.437f,
                    dy3 = 3.659f,
                )
                // s -6.788 2.294 -6.788 -0.71z
                reflectiveCurveToRelative(
                    dx1 = -6.788f,
                    dy1 = 2.294f,
                    dx2 = -6.788f,
                    dy2 = -0.71f,
                )
                close()
            }
        }.build().also { _emoji1fac2 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1fac2: ImageVector? = null
