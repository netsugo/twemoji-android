package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1f21f1fe: ImageVector
    get() {
        val current = _emoji1f1f21f1fe
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1f21f1fe",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 27 a4 4 0 0 1 -4 4 H4 a4 4 0 0 1 -4 -4 V9 a4 4 0 0 1 4 -4 h28 a4 4 0 0 1 4 4 v18z
            path(
                fill = SolidColor(Color(0xFFEEEEEE)),
            ) {
                // M 36 27
                moveTo(x = 36.0f, y = 27.0f)
                // a 4 4 0 0 1 -4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 4.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // a 4 4 0 0 1 -4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = -4.0f,
                )
                // V 9
                verticalLineTo(y = 9.0f)
                // a 4 4 0 0 1 4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = -4.0f,
                )
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // a 4 4 0 0 1 4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 4.0f,
                )
                // v 18z
                verticalLineToRelative(dy = 18.0f)
                close()
            }
            // M0.646 29.18 h34.708 c0.354 -0.544 0.58 -1.18 0.634 -1.863 L0.012 27.317 c0.054 0.684 0.28 1.32 0.634 1.863Z M36 23.597 v1.863 L0 25.46 v-1.863 h36Z M36 21.74 v-1.863 L0 19.877 v1.863 h36Z M0 16.157 v1.863 h36 v-1.863 L0 16.157Z M36 14.3 v-1.863 L0 12.437 L0 14.3 h36Z M0 9 v1.58 h36 L36 9 c0 -0.095 -0.003 -0.19 -0.01 -0.283 L0.01 8.717 C0.003 8.811 0 8.905 0 9Z M4 5 C2.578 5 1.33 5.742 0.62 6.86 h34.76 A3.997 3.997 0 0 0 32 5 L4 5Z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 0.646 29.18
                moveTo(x = 0.646f, y = 29.18f)
                // h 34.708
                horizontalLineToRelative(dx = 34.708f)
                // c 0.354 -0.544 0.58 -1.18 0.634 -1.863
                curveToRelative(
                    dx1 = 0.354f,
                    dy1 = -0.544f,
                    dx2 = 0.58f,
                    dy2 = -1.18f,
                    dx3 = 0.634f,
                    dy3 = -1.863f,
                )
                // L 0.012 27.317
                lineTo(x = 0.012f, y = 27.317f)
                // c 0.054 0.684 0.28 1.32 0.634 1.863z
                curveToRelative(
                    dx1 = 0.054f,
                    dy1 = 0.684f,
                    dx2 = 0.28f,
                    dy2 = 1.32f,
                    dx3 = 0.634f,
                    dy3 = 1.863f,
                )
                close()
                // M 36 23.597
                moveTo(x = 36.0f, y = 23.597f)
                // v 1.863
                verticalLineToRelative(dy = 1.863f)
                // L 0 25.46
                lineTo(x = 0.0f, y = 25.46f)
                // v -1.863
                verticalLineToRelative(dy = -1.863f)
                // h 36z
                horizontalLineToRelative(dx = 36.0f)
                close()
                // M 36 21.74
                moveTo(x = 36.0f, y = 21.74f)
                // v -1.863
                verticalLineToRelative(dy = -1.863f)
                // L 0 19.877
                lineTo(x = 0.0f, y = 19.877f)
                // v 1.863
                verticalLineToRelative(dy = 1.863f)
                // h 36z
                horizontalLineToRelative(dx = 36.0f)
                close()
                // M 0 16.157
                moveTo(x = 0.0f, y = 16.157f)
                // v 1.863
                verticalLineToRelative(dy = 1.863f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // v -1.863
                verticalLineToRelative(dy = -1.863f)
                // L 0 16.157z
                lineTo(x = 0.0f, y = 16.157f)
                close()
                // M 36 14.3
                moveTo(x = 36.0f, y = 14.3f)
                // v -1.863
                verticalLineToRelative(dy = -1.863f)
                // L 0 12.437
                lineTo(x = 0.0f, y = 12.437f)
                // L 0 14.3
                lineTo(x = 0.0f, y = 14.3f)
                // h 36z
                horizontalLineToRelative(dx = 36.0f)
                close()
                // M 0 9
                moveTo(x = 0.0f, y = 9.0f)
                // v 1.58
                verticalLineToRelative(dy = 1.58f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // L 36 9
                lineTo(x = 36.0f, y = 9.0f)
                // c 0 -0.095 -0.003 -0.19 -0.01 -0.283
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.095f,
                    dx2 = -0.003f,
                    dy2 = -0.19f,
                    dx3 = -0.01f,
                    dy3 = -0.283f,
                )
                // L 0.01 8.717
                lineTo(x = 0.01f, y = 8.717f)
                // C 0.003 8.811 0 8.905 0 9z
                curveTo(
                    x1 = 0.003f,
                    y1 = 8.811f,
                    x2 = 0.0f,
                    y2 = 8.905f,
                    x3 = 0.0f,
                    y3 = 9.0f,
                )
                close()
                // M 4 5
                moveTo(x = 4.0f, y = 5.0f)
                // C 2.578 5 1.33 5.742 0.62 6.86
                curveTo(
                    x1 = 2.578f,
                    y1 = 5.0f,
                    x2 = 1.33f,
                    y2 = 5.742f,
                    x3 = 0.62f,
                    y3 = 6.86f,
                )
                // h 34.76
                horizontalLineToRelative(dx = 34.76f)
                // A 3.997 3.997 0 0 0 32 5
                arcTo(
                    horizontalEllipseRadius = 3.997f,
                    verticalEllipseRadius = 3.997f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 32.0f,
                    y1 = 5.0f,
                )
                // L 4 5z
                lineTo(x = 4.0f, y = 5.0f)
                close()
            }
            // M18 5 H4 a4 4 0 0 0 -4 4 v10.88 h18 V5z
            path(
                fill = SolidColor(Color(0xFF010066)),
            ) {
                // M 18 5
                moveTo(x = 18.0f, y = 5.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // a 4 4 0 0 0 -4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = 4.0f,
                )
                // v 10.88
                verticalLineToRelative(dy = 10.88f)
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // V 5z
                verticalLineTo(y = 5.0f)
                close()
            }
            // M9.534 17.673 a5.234 5.234 0 0 1 -0.001 -10.466 c0.715 0 1.397 0.146 2.018 0.405 A5.958 5.958 0 0 0 8 6.44 a6 6 0 0 0 0 12 5.958 5.958 0 0 0 3.551 -1.172 5.21 5.21 0 0 1 -2.017 0.405z
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 9.534 17.673
                moveTo(x = 9.534f, y = 17.673f)
                // a 5.234 5.234 0 0 1 -0.001 -10.466
                arcToRelative(
                    a = 5.234f,
                    b = 5.234f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.001f,
                    dy1 = -10.466f,
                )
                // c 0.715 0 1.397 0.146 2.018 0.405
                curveToRelative(
                    dx1 = 0.715f,
                    dy1 = 0.0f,
                    dx2 = 1.397f,
                    dy2 = 0.146f,
                    dx3 = 2.018f,
                    dy3 = 0.405f,
                )
                // A 5.958 5.958 0 0 0 8 6.44
                arcTo(
                    horizontalEllipseRadius = 5.958f,
                    verticalEllipseRadius = 5.958f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 8.0f,
                    y1 = 6.44f,
                )
                // a 6 6 0 0 0 0 12
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 12.0f,
                )
                // a 5.958 5.958 0 0 0 3.551 -1.172
                arcToRelative(
                    a = 5.958f,
                    b = 5.958f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.551f,
                    dy1 = -1.172f,
                )
                // a 5.21 5.21 0 0 1 -2.017 0.405z
                arcToRelative(
                    a = 5.21f,
                    b = 5.21f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.017f,
                    dy1 = 0.405f,
                )
                close()
            }
            // m12.922 9.269  l0.334 1.62 1.003 -1.315 -0.402 1.604 1.475 -0.749 -1.059 1.271 1.654 -0.035 -1.505 0.686 1.505 0.686 -1.654 -0.035 1.059 1.271 -1.475 -0.749 0.402 1.605 -1.003 -1.316 -0.334 1.621 -0.334 -1.621 -1.003 1.316 0.402 -1.605 -1.475 0.749 1.058 -1.271 -1.653 0.035 1.505 -0.686 -1.505 -0.686 1.653 0.035 -1.058 -1.271 1.475 0.749 -0.402 -1.604 1.003 1.315z
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 12.922 9.269
                moveTo(x = 12.922f, y = 9.269f)
                // l 0.334 1.62
                lineToRelative(dx = 0.334f, dy = 1.62f)
                // l 1.003 -1.315
                lineToRelative(dx = 1.003f, dy = -1.315f)
                // l -0.402 1.604
                lineToRelative(dx = -0.402f, dy = 1.604f)
                // l 1.475 -0.749
                lineToRelative(dx = 1.475f, dy = -0.749f)
                // l -1.059 1.271
                lineToRelative(dx = -1.059f, dy = 1.271f)
                // l 1.654 -0.035
                lineToRelative(dx = 1.654f, dy = -0.035f)
                // l -1.505 0.686
                lineToRelative(dx = -1.505f, dy = 0.686f)
                // l 1.505 0.686
                lineToRelative(dx = 1.505f, dy = 0.686f)
                // l -1.654 -0.035
                lineToRelative(dx = -1.654f, dy = -0.035f)
                // l 1.059 1.271
                lineToRelative(dx = 1.059f, dy = 1.271f)
                // l -1.475 -0.749
                lineToRelative(dx = -1.475f, dy = -0.749f)
                // l 0.402 1.605
                lineToRelative(dx = 0.402f, dy = 1.605f)
                // l -1.003 -1.316
                lineToRelative(dx = -1.003f, dy = -1.316f)
                // l -0.334 1.621
                lineToRelative(dx = -0.334f, dy = 1.621f)
                // l -0.334 -1.621
                lineToRelative(dx = -0.334f, dy = -1.621f)
                // l -1.003 1.316
                lineToRelative(dx = -1.003f, dy = 1.316f)
                // l 0.402 -1.605
                lineToRelative(dx = 0.402f, dy = -1.605f)
                // l -1.475 0.749
                lineToRelative(dx = -1.475f, dy = 0.749f)
                // l 1.058 -1.271
                lineToRelative(dx = 1.058f, dy = -1.271f)
                // l -1.653 0.035
                lineToRelative(dx = -1.653f, dy = 0.035f)
                // l 1.505 -0.686
                lineToRelative(dx = 1.505f, dy = -0.686f)
                // l -1.505 -0.686
                lineToRelative(dx = -1.505f, dy = -0.686f)
                // l 1.653 0.035
                lineToRelative(dx = 1.653f, dy = 0.035f)
                // l -1.058 -1.271
                lineToRelative(dx = -1.058f, dy = -1.271f)
                // l 1.475 0.749
                lineToRelative(dx = 1.475f, dy = 0.749f)
                // l -0.402 -1.604
                lineToRelative(dx = -0.402f, dy = -1.604f)
                // l 1.003 1.315z
                lineToRelative(dx = 1.003f, dy = 1.315f)
                close()
            }
        }.build().also { _emoji1f1f21f1fe = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1f21f1fe: ImageVector? = null
