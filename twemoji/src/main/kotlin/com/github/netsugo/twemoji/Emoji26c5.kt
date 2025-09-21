package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji26c5: ImageVector
    get() {
        val current = _emoji26c5
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji26c5",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M14 2 s0 -2 2 -2 2 2 2 2 v2 s0 2 -2 2 -2 -2 -2 -2 L14 2z M30 14 s2 0 2 2 -2 2 -2 2 h-2 s-2 0 -2 -2 2 -2 2 -2 h2z M4 14 s2 0 2 2 -2 2 -2 2 L2 18 s-2 0 -2 -2 2 -2 2 -2 h2z M7.872 6.043 s1.414 1.414 0 2.828 -2.828 0 -2.828 0 L3.629 7.458 s-1.414 -1.414 0 -2.829 c1.415 -1.414 2.829 0 2.829 0 l1.414 1.414z M26.957 8.871 s-1.414 1.414 -2.828 0 0 -2.828 0 -2.828 l1.414 -1.414 s1.414 -1.414 2.828 0 0 2.828 0 2.828 l-1.414 1.414z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 14 2
                moveTo(x = 14.0f, y = 2.0f)
                // s 0 -2 2 -2
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // s 2 2 2 2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // s 0 2 -2 2
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                    dx2 = -2.0f,
                    dy2 = 2.0f,
                )
                // s -2 -2 -2 -2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                    dx2 = -2.0f,
                    dy2 = -2.0f,
                )
                // L 14 2z
                lineTo(x = 14.0f, y = 2.0f)
                close()
                // M 30 14
                moveTo(x = 30.0f, y = 14.0f)
                // s 2 0 2 2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                )
                // s -2 2 -2 2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                    dx2 = -2.0f,
                    dy2 = 2.0f,
                )
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // s -2 0 -2 -2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -2.0f,
                )
                // s 2 -2 2 -2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // h 2z
                horizontalLineToRelative(dx = 2.0f)
                close()
                // M 4 14
                moveTo(x = 4.0f, y = 14.0f)
                // s 2 0 2 2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                )
                // s -2 2 -2 2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                    dx2 = -2.0f,
                    dy2 = 2.0f,
                )
                // L 2 18
                lineTo(x = 2.0f, y = 18.0f)
                // s -2 0 -2 -2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -2.0f,
                )
                // s 2 -2 2 -2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // h 2z
                horizontalLineToRelative(dx = 2.0f)
                close()
                // M 7.872 6.043
                moveTo(x = 7.872f, y = 6.043f)
                // s 1.414 1.414 0 2.828
                reflectiveCurveToRelative(
                    dx1 = 1.414f,
                    dy1 = 1.414f,
                    dx2 = 0.0f,
                    dy2 = 2.828f,
                )
                // s -2.828 0 -2.828 0
                reflectiveCurveToRelative(
                    dx1 = -2.828f,
                    dy1 = 0.0f,
                    dx2 = -2.828f,
                    dy2 = 0.0f,
                )
                // L 3.629 7.458
                lineTo(x = 3.629f, y = 7.458f)
                // s -1.414 -1.414 0 -2.829
                reflectiveCurveToRelative(
                    dx1 = -1.414f,
                    dy1 = -1.414f,
                    dx2 = 0.0f,
                    dy2 = -2.829f,
                )
                // c 1.415 -1.414 2.829 0 2.829 0
                curveToRelative(
                    dx1 = 1.415f,
                    dy1 = -1.414f,
                    dx2 = 2.829f,
                    dy2 = 0.0f,
                    dx3 = 2.829f,
                    dy3 = 0.0f,
                )
                // l 1.414 1.414z
                lineToRelative(dx = 1.414f, dy = 1.414f)
                close()
                // M 26.957 8.871
                moveTo(x = 26.957f, y = 8.871f)
                // s -1.414 1.414 -2.828 0
                reflectiveCurveToRelative(
                    dx1 = -1.414f,
                    dy1 = 1.414f,
                    dx2 = -2.828f,
                    dy2 = 0.0f,
                )
                // s 0 -2.828 0 -2.828
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.828f,
                    dx2 = 0.0f,
                    dy2 = -2.828f,
                )
                // l 1.414 -1.414
                lineToRelative(dx = 1.414f, dy = -1.414f)
                // s 1.414 -1.414 2.828 0
                reflectiveCurveToRelative(
                    dx1 = 1.414f,
                    dy1 = -1.414f,
                    dx2 = 2.828f,
                    dy2 = 0.0f,
                )
                // s 0 2.828 0 2.828
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.828f,
                    dx2 = 0.0f,
                    dy2 = 2.828f,
                )
                // l -1.414 1.414z
                lineToRelative(dx = -1.414f, dy = 1.414f)
                close()
            }
            // M16 16 m-9 0 a9 9 0 1 1 18 0 a9 9 0 1 1 -18 0
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 16 16
                moveTo(x = 16.0f, y = 16.0f)
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
            // M28 20 c-0.825 0 -1.62 0.125 -2.369 0.357 C24.744 17.822 22.338 16 19.5 16 c-3.044 0 -5.592 2.096 -6.299 4.921 -0.754 -0.57 -1.682 -0.921 -2.701 -0.921 C8.015 20 6 22.015 6 24.5 c0 0.604 0.123 1.178 0.339 1.704 C5.91 26.085 5.467 26 5 26 c-2.762 0 -5 2.238 -5 5 s2.238 5 5 5 h23 c4.418 0 8 -3.581 8 -8 0 -4.418 -3.582 -8 -8 -8z
            path(
                fill = SolidColor(Color(0xFFE1E8ED)),
            ) {
                // M 28 20
                moveTo(x = 28.0f, y = 20.0f)
                // c -0.825 0 -1.62 0.125 -2.369 0.357
                curveToRelative(
                    dx1 = -0.825f,
                    dy1 = 0.0f,
                    dx2 = -1.62f,
                    dy2 = 0.125f,
                    dx3 = -2.369f,
                    dy3 = 0.357f,
                )
                // C 24.744 17.822 22.338 16 19.5 16
                curveTo(
                    x1 = 24.744f,
                    y1 = 17.822f,
                    x2 = 22.338f,
                    y2 = 16.0f,
                    x3 = 19.5f,
                    y3 = 16.0f,
                )
                // c -3.044 0 -5.592 2.096 -6.299 4.921
                curveToRelative(
                    dx1 = -3.044f,
                    dy1 = 0.0f,
                    dx2 = -5.592f,
                    dy2 = 2.096f,
                    dx3 = -6.299f,
                    dy3 = 4.921f,
                )
                // c -0.754 -0.57 -1.682 -0.921 -2.701 -0.921
                curveToRelative(
                    dx1 = -0.754f,
                    dy1 = -0.57f,
                    dx2 = -1.682f,
                    dy2 = -0.921f,
                    dx3 = -2.701f,
                    dy3 = -0.921f,
                )
                // C 8.015 20 6 22.015 6 24.5
                curveTo(
                    x1 = 8.015f,
                    y1 = 20.0f,
                    x2 = 6.0f,
                    y2 = 22.015f,
                    x3 = 6.0f,
                    y3 = 24.5f,
                )
                // c 0 0.604 0.123 1.178 0.339 1.704
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.604f,
                    dx2 = 0.123f,
                    dy2 = 1.178f,
                    dx3 = 0.339f,
                    dy3 = 1.704f,
                )
                // C 5.91 26.085 5.467 26 5 26
                curveTo(
                    x1 = 5.91f,
                    y1 = 26.085f,
                    x2 = 5.467f,
                    y2 = 26.0f,
                    x3 = 5.0f,
                    y3 = 26.0f,
                )
                // c -2.762 0 -5 2.238 -5 5
                curveToRelative(
                    dx1 = -2.762f,
                    dy1 = 0.0f,
                    dx2 = -5.0f,
                    dy2 = 2.238f,
                    dx3 = -5.0f,
                    dy3 = 5.0f,
                )
                // s 2.238 5 5 5
                reflectiveCurveToRelative(
                    dx1 = 2.238f,
                    dy1 = 5.0f,
                    dx2 = 5.0f,
                    dy2 = 5.0f,
                )
                // h 23
                horizontalLineToRelative(dx = 23.0f)
                // c 4.418 0 8 -3.581 8 -8
                curveToRelative(
                    dx1 = 4.418f,
                    dy1 = 0.0f,
                    dx2 = 8.0f,
                    dy2 = -3.581f,
                    dx3 = 8.0f,
                    dy3 = -8.0f,
                )
                // c 0 -4.418 -3.582 -8 -8 -8z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.418f,
                    dx2 = -3.582f,
                    dy2 = -8.0f,
                    dx3 = -8.0f,
                    dy3 = -8.0f,
                )
                close()
            }
        }.build().also { _emoji26c5 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji26c5: ImageVector? = null
