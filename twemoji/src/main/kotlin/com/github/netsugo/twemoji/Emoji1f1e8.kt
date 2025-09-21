package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1e8: ImageVector
    get() {
        val current = _emoji1f1e8
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1e8",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 32 c0 2.209 -1.791 4 -4 4 H4 c-2.209 0 -4 -1.791 -4 -4 V4 c0 -2.209 1.791 -4 4 -4 h28 c2.209 0 4 1.791 4 4 v28z
            path(
                fill = SolidColor(Color(0xFF3B88C3)),
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
            // M19.723 6.552 c2.264 0 6.666 0.744 6.666 3.473 0 1.116 -0.775 2.077 -1.922 2.077 -1.272 0 -2.139 -1.085 -4.744 -1.085 -3.844 0 -5.829 3.256 -5.829 7.038 0 3.689 2.015 6.852 5.829 6.852 2.605 0 3.658 -1.302 4.93 -1.302 1.396 0 2.047 1.395 2.047 2.107 0 2.977 -4.682 3.659 -6.976 3.659 -6.294 0 -10.666 -4.992 -10.666 -11.41 -0.001 -6.448 4.34 -11.409 10.665 -11.409z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 19.723 6.552
                moveTo(x = 19.723f, y = 6.552f)
                // c 2.264 0 6.666 0.744 6.666 3.473
                curveToRelative(
                    dx1 = 2.264f,
                    dy1 = 0.0f,
                    dx2 = 6.666f,
                    dy2 = 0.744f,
                    dx3 = 6.666f,
                    dy3 = 3.473f,
                )
                // c 0 1.116 -0.775 2.077 -1.922 2.077
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.116f,
                    dx2 = -0.775f,
                    dy2 = 2.077f,
                    dx3 = -1.922f,
                    dy3 = 2.077f,
                )
                // c -1.272 0 -2.139 -1.085 -4.744 -1.085
                curveToRelative(
                    dx1 = -1.272f,
                    dy1 = 0.0f,
                    dx2 = -2.139f,
                    dy2 = -1.085f,
                    dx3 = -4.744f,
                    dy3 = -1.085f,
                )
                // c -3.844 0 -5.829 3.256 -5.829 7.038
                curveToRelative(
                    dx1 = -3.844f,
                    dy1 = 0.0f,
                    dx2 = -5.829f,
                    dy2 = 3.256f,
                    dx3 = -5.829f,
                    dy3 = 7.038f,
                )
                // c 0 3.689 2.015 6.852 5.829 6.852
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.689f,
                    dx2 = 2.015f,
                    dy2 = 6.852f,
                    dx3 = 5.829f,
                    dy3 = 6.852f,
                )
                // c 2.605 0 3.658 -1.302 4.93 -1.302
                curveToRelative(
                    dx1 = 2.605f,
                    dy1 = 0.0f,
                    dx2 = 3.658f,
                    dy2 = -1.302f,
                    dx3 = 4.93f,
                    dy3 = -1.302f,
                )
                // c 1.396 0 2.047 1.395 2.047 2.107
                curveToRelative(
                    dx1 = 1.396f,
                    dy1 = 0.0f,
                    dx2 = 2.047f,
                    dy2 = 1.395f,
                    dx3 = 2.047f,
                    dy3 = 2.107f,
                )
                // c 0 2.977 -4.682 3.659 -6.976 3.659
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.977f,
                    dx2 = -4.682f,
                    dy2 = 3.659f,
                    dx3 = -6.976f,
                    dy3 = 3.659f,
                )
                // c -6.294 0 -10.666 -4.992 -10.666 -11.41
                curveToRelative(
                    dx1 = -6.294f,
                    dy1 = 0.0f,
                    dx2 = -10.666f,
                    dy2 = -4.992f,
                    dx3 = -10.666f,
                    dy3 = -11.41f,
                )
                // c -0.001 -6.448 4.34 -11.409 10.665 -11.409z
                curveToRelative(
                    dx1 = -0.001f,
                    dy1 = -6.448f,
                    dx2 = 4.34f,
                    dy2 = -11.409f,
                    dx3 = 10.665f,
                    dy3 = -11.409f,
                )
                close()
            }
        }.build().also { _emoji1f1e8 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1e8: ImageVector? = null
