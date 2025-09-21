package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f309: ImageVector
    get() {
        val current = _emoji1f309
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f309",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 32 c0 2.209 -1.791 4 -4 4 H4 c-2.209 0 -4 -1.791 -4 -4 V4 c0 -2.209 1.791 -4 4 -4 h28 c2.209 0 4 1.791 4 4 v28z
            path(
                fill = SolidColor(Color(0xFF004A77)),
            ) {
                // M 36 32
                moveTo(x = 36.0f, y = 32.0f)
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
                // V 4
                verticalLineTo(y = 4.0f)
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
                // v 28z
                verticalLineToRelative(dy = 28.0f)
                close()
            }
            // M32 23.958 c1.575 0.963 2.957 1.676 4 2.171 v-2.07 C32.465 22.229 25.013 17.594 20 9 c0 0 0 -2 -2 -2 s-2 2 -2 2 C10.987 17.594 3.535 22.229 0 24.059 v2.07 c1.043 -0.495 2.425 -1.208 4 -2.171 L4 27 L0 27 v4 h16 v5 h4 v-5 h16 v-4 h-4 v-3.042z M30 27 h-4 v-7.435 c1.362 1.186 2.716 2.214 4 3.095 L30 27z M6 22.659 c1.284 -0.88 2.637 -1.908 4 -3.094 L10 27 L6 27 v-4.341z M12 27 v-9.292 c1.384 -1.375 2.74 -2.923 4 -4.655 L16 27 h-4z M20 13.054 c1.26 1.731 2.616 3.28 4 4.655 L24 27 h-4 L20 13.054z
            path(
                fill = SolidColor(Color(0xFFFE5011)),
            ) {
                // M 32 23.958
                moveTo(x = 32.0f, y = 23.958f)
                // c 1.575 0.963 2.957 1.676 4 2.171
                curveToRelative(
                    dx1 = 1.575f,
                    dy1 = 0.963f,
                    dx2 = 2.957f,
                    dy2 = 1.676f,
                    dx3 = 4.0f,
                    dy3 = 2.171f,
                )
                // v -2.07
                verticalLineToRelative(dy = -2.07f)
                // C 32.465 22.229 25.013 17.594 20 9
                curveTo(
                    x1 = 32.465f,
                    y1 = 22.229f,
                    x2 = 25.013f,
                    y2 = 17.594f,
                    x3 = 20.0f,
                    y3 = 9.0f,
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
                // s -2 2 -2 2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                    dx2 = -2.0f,
                    dy2 = 2.0f,
                )
                // C 10.987 17.594 3.535 22.229 0 24.059
                curveTo(
                    x1 = 10.987f,
                    y1 = 17.594f,
                    x2 = 3.535f,
                    y2 = 22.229f,
                    x3 = 0.0f,
                    y3 = 24.059f,
                )
                // v 2.07
                verticalLineToRelative(dy = 2.07f)
                // c 1.043 -0.495 2.425 -1.208 4 -2.171
                curveToRelative(
                    dx1 = 1.043f,
                    dy1 = -0.495f,
                    dx2 = 2.425f,
                    dy2 = -1.208f,
                    dx3 = 4.0f,
                    dy3 = -2.171f,
                )
                // L 4 27
                lineTo(x = 4.0f, y = 27.0f)
                // L 0 27
                lineTo(x = 0.0f, y = 27.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v -3.042z
                verticalLineToRelative(dy = -3.042f)
                close()
                // M 30 27
                moveTo(x = 30.0f, y = 27.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v -7.435
                verticalLineToRelative(dy = -7.435f)
                // c 1.362 1.186 2.716 2.214 4 3.095
                curveToRelative(
                    dx1 = 1.362f,
                    dy1 = 1.186f,
                    dx2 = 2.716f,
                    dy2 = 2.214f,
                    dx3 = 4.0f,
                    dy3 = 3.095f,
                )
                // L 30 27z
                lineTo(x = 30.0f, y = 27.0f)
                close()
                // M 6 22.659
                moveTo(x = 6.0f, y = 22.659f)
                // c 1.284 -0.88 2.637 -1.908 4 -3.094
                curveToRelative(
                    dx1 = 1.284f,
                    dy1 = -0.88f,
                    dx2 = 2.637f,
                    dy2 = -1.908f,
                    dx3 = 4.0f,
                    dy3 = -3.094f,
                )
                // L 10 27
                lineTo(x = 10.0f, y = 27.0f)
                // L 6 27
                lineTo(x = 6.0f, y = 27.0f)
                // v -4.341z
                verticalLineToRelative(dy = -4.341f)
                close()
                // M 12 27
                moveTo(x = 12.0f, y = 27.0f)
                // v -9.292
                verticalLineToRelative(dy = -9.292f)
                // c 1.384 -1.375 2.74 -2.923 4 -4.655
                curveToRelative(
                    dx1 = 1.384f,
                    dy1 = -1.375f,
                    dx2 = 2.74f,
                    dy2 = -2.923f,
                    dx3 = 4.0f,
                    dy3 = -4.655f,
                )
                // L 16 27
                lineTo(x = 16.0f, y = 27.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
                // M 20 13.054
                moveTo(x = 20.0f, y = 13.054f)
                // c 1.26 1.731 2.616 3.28 4 4.655
                curveToRelative(
                    dx1 = 1.26f,
                    dy1 = 1.731f,
                    dx2 = 2.616f,
                    dy2 = 3.28f,
                    dx3 = 4.0f,
                    dy3 = 4.655f,
                )
                // L 24 27
                lineTo(x = 24.0f, y = 27.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // L 20 13.054z
                lineTo(x = 20.0f, y = 13.054f)
                close()
            }
            // M6.5 7 C5.119 7 4 5.881 4 4.5 c0 -1.13 0.755 -2.074 1.784 -2.383 C5.533 2.048 5.273 2 5 2 3.343 2 2 3.343 2 5 s1.343 3 3 3 c0.959 0 1.803 -0.458 2.353 -1.159 C7.085 6.938 6.801 7 6.5 7z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 6.5 7
                moveTo(x = 6.5f, y = 7.0f)
                // C 5.119 7 4 5.881 4 4.5
                curveTo(
                    x1 = 5.119f,
                    y1 = 7.0f,
                    x2 = 4.0f,
                    y2 = 5.881f,
                    x3 = 4.0f,
                    y3 = 4.5f,
                )
                // c 0 -1.13 0.755 -2.074 1.784 -2.383
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.13f,
                    dx2 = 0.755f,
                    dy2 = -2.074f,
                    dx3 = 1.784f,
                    dy3 = -2.383f,
                )
                // C 5.533 2.048 5.273 2 5 2
                curveTo(
                    x1 = 5.533f,
                    y1 = 2.048f,
                    x2 = 5.273f,
                    y2 = 2.0f,
                    x3 = 5.0f,
                    y3 = 2.0f,
                )
                // C 3.343 2 2 3.343 2 5
                curveTo(
                    x1 = 3.343f,
                    y1 = 2.0f,
                    x2 = 2.0f,
                    y2 = 3.343f,
                    x3 = 2.0f,
                    y3 = 5.0f,
                )
                // s 1.343 3 3 3
                reflectiveCurveToRelative(
                    dx1 = 1.343f,
                    dy1 = 3.0f,
                    dx2 = 3.0f,
                    dy2 = 3.0f,
                )
                // c 0.959 0 1.803 -0.458 2.353 -1.159
                curveToRelative(
                    dx1 = 0.959f,
                    dy1 = 0.0f,
                    dx2 = 1.803f,
                    dy2 = -0.458f,
                    dx3 = 2.353f,
                    dy3 = -1.159f,
                )
                // C 7.085 6.938 6.801 7 6.5 7z
                curveTo(
                    x1 = 7.085f,
                    y1 = 6.938f,
                    x2 = 6.801f,
                    y2 = 7.0f,
                    x3 = 6.5f,
                    y3 = 7.0f,
                )
                close()
            }
            // M10.5 2.5 m-0.5 0 a0.5 0.5 0 1 1 1 0 a0.5 0.5 0 1 1 -1 0
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 10.5 2.5
                moveTo(x = 10.5f, y = 2.5f)
                // m -0.5 0
                moveToRelative(dx = -0.5f, dy = 0.0f)
                // a 0.5 0.5 0 1 1 1 0
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                )
                // a 0.5 0.5 0 1 1 -1 0
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                )
            }
            // M26.5 11.5 m-0.5 0 a0.5 0.5 0 1 1 1 0 a0.5 0.5 0 1 1 -1 0
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 26.5 11.5
                moveTo(x = 26.5f, y = 11.5f)
                // m -0.5 0
                moveToRelative(dx = -0.5f, dy = 0.0f)
                // a 0.5 0.5 0 1 1 1 0
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                )
                // a 0.5 0.5 0 1 1 -1 0
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                )
            }
            // M7.5 11.5 m-0.5 0 a0.5 0.5 0 1 1 1 0 a0.5 0.5 0 1 1 -1 0
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 7.5 11.5
                moveTo(x = 7.5f, y = 11.5f)
                // m -0.5 0
                moveToRelative(dx = -0.5f, dy = 0.0f)
                // a 0.5 0.5 0 1 1 1 0
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                )
                // a 0.5 0.5 0 1 1 -1 0
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                )
            }
            // M22 5 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 22 5
                moveTo(x = 22.0f, y = 5.0f)
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
            // M4 17 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 4 17
                moveTo(x = 4.0f, y = 17.0f)
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
            // M12 7 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 12 7
                moveTo(x = 12.0f, y = 7.0f)
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
            // M32 17 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 32 17
                moveTo(x = 32.0f, y = 17.0f)
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
            // M26.5 5.5 m-0.5 0 a0.5 0.5 0 1 1 1 0 a0.5 0.5 0 1 1 -1 0
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 26.5 5.5
                moveTo(x = 26.5f, y = 5.5f)
                // m -0.5 0
                moveToRelative(dx = -0.5f, dy = 0.0f)
                // a 0.5 0.5 0 1 1 1 0
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                )
                // a 0.5 0.5 0 1 1 -1 0
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                )
            }
            // M31 3 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 31 3
                moveTo(x = 31.0f, y = 3.0f)
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
            // M31.5 7.5 m-0.5 0 a0.5 0.5 0 1 1 1 0 a0.5 0.5 0 1 1 -1 0
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 31.5 7.5
                moveTo(x = 31.5f, y = 7.5f)
                // m -0.5 0
                moveToRelative(dx = -0.5f, dy = 0.0f)
                // a 0.5 0.5 0 1 1 1 0
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                )
                // a 0.5 0.5 0 1 1 -1 0
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                )
            }
        }.build().also { _emoji1f309 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f309: ImageVector? = null
