package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val EmojiA9: ImageVector
    get() {
        val current = _emojiA9
        if (current != null) return current

        return ImageVector.Builder(
            name = ".EmojiA9",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M18 0 C8.059 0 0 8.06 0 18 c0 9.941 8.059 18 18 18 s18 -8.059 18 -18 c0 -9.94 -8.059 -18 -18 -18 m0 34 C9.164 34 2 26.837 2 18 S9.164 2 18 2 s16 7.164 16 16 -7.163 16 -16 16
            path(
                fill = SolidColor(Color(0xFF31373D)),
            ) {
                // M 18 0
                moveTo(x = 18.0f, y = 0.0f)
                // C 8.059 0 0 8.06 0 18
                curveTo(
                    x1 = 8.059f,
                    y1 = 0.0f,
                    x2 = 0.0f,
                    y2 = 8.06f,
                    x3 = 0.0f,
                    y3 = 18.0f,
                )
                // c 0 9.941 8.059 18 18 18
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 9.941f,
                    dx2 = 8.059f,
                    dy2 = 18.0f,
                    dx3 = 18.0f,
                    dy3 = 18.0f,
                )
                // s 18 -8.059 18 -18
                reflectiveCurveToRelative(
                    dx1 = 18.0f,
                    dy1 = -8.059f,
                    dx2 = 18.0f,
                    dy2 = -18.0f,
                )
                // c 0 -9.94 -8.059 -18 -18 -18
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -9.94f,
                    dx2 = -8.059f,
                    dy2 = -18.0f,
                    dx3 = -18.0f,
                    dy3 = -18.0f,
                )
                // m 0 34
                moveToRelative(dx = 0.0f, dy = 34.0f)
                // C 9.164 34 2 26.837 2 18
                curveTo(
                    x1 = 9.164f,
                    y1 = 34.0f,
                    x2 = 2.0f,
                    y2 = 26.837f,
                    x3 = 2.0f,
                    y3 = 18.0f,
                )
                // S 9.164 2 18 2
                reflectiveCurveTo(
                    x1 = 9.164f,
                    y1 = 2.0f,
                    x2 = 18.0f,
                    y2 = 2.0f,
                )
                // s 16 7.164 16 16
                reflectiveCurveToRelative(
                    dx1 = 16.0f,
                    dy1 = 7.164f,
                    dx2 = 16.0f,
                    dy2 = 16.0f,
                )
                // s -7.163 16 -16 16
                reflectiveCurveToRelative(
                    dx1 = -7.163f,
                    dy1 = 16.0f,
                    dx2 = -16.0f,
                    dy2 = 16.0f,
                )
            }
            // M18.723 6.552 c2.263 0 6.666 0.744 6.666 3.473 0 1.116 -0.775 2.077 -1.922 2.077 -1.272 0 -2.139 -1.085 -4.744 -1.085 -3.845 0 -5.829 3.256 -5.829 7.038 0 3.689 2.015 6.852 5.829 6.852 2.605 0 3.658 -1.302 4.929 -1.302 1.396 0 2.047 1.395 2.047 2.107 0 2.977 -4.682 3.659 -6.976 3.659 -6.294 0 -10.666 -4.992 -10.666 -11.41 0 -6.448 4.341 -11.409 10.666 -11.409
            path(
                fill = SolidColor(Color(0xFF31373D)),
            ) {
                // M 18.723 6.552
                moveTo(x = 18.723f, y = 6.552f)
                // c 2.263 0 6.666 0.744 6.666 3.473
                curveToRelative(
                    dx1 = 2.263f,
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
                // c -3.845 0 -5.829 3.256 -5.829 7.038
                curveToRelative(
                    dx1 = -3.845f,
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
                // c 2.605 0 3.658 -1.302 4.929 -1.302
                curveToRelative(
                    dx1 = 2.605f,
                    dy1 = 0.0f,
                    dx2 = 3.658f,
                    dy2 = -1.302f,
                    dx3 = 4.929f,
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
                // c 0 -6.448 4.341 -11.409 10.666 -11.409
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -6.448f,
                    dx2 = 4.341f,
                    dy2 = -11.409f,
                    dx3 = 10.666f,
                    dy3 = -11.409f,
                )
            }
        }.build().also { _emojiA9 = it }
    }

@Suppress("ObjectPropertyName")
private var _emojiA9: ImageVector? = null
