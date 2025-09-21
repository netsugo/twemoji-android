package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1fae0: ImageVector
    get() {
        val current = _emoji1fae0
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1fae0",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M35.07 32.558 a1.92 1.92 0 0 0 0.836 -2.241 c-0.259 -0.81 -1.07 -1.317 -1.921 -1.317 H32 a1 1 0 0 1 0 -2 h1.5 a1.5 1.5 0 1 0 -0.04 -3 c-0.8 0.021 -1.46 -0.623 -1.46 -1.423 v-0.003 c0 -0.293 0.06 -0.578 0.176 -0.847 a15.294 15.294 0 0 0 1.294 -7.191 C32.978 6.66 26.411 0.269 18.524 0.009 9.724 -0.281 2.5 6.766 2.5 15.5 c0 2.371 0.548 4.609 1.5 6.619 v1.88 c0 1.086 -0.865 2.021 -1.951 2 a2 2 0 0 0 -2.034 2.167 C0.101 29.225 1.069 30 2.133 30 h8.039 A1.17 1.17 0 0 1 11 32 l-3.03 0.757 a1.281 1.281 0 0 0 0 2.485 c1.932 0.483 3.914 0.737 5.905 0.756 l2.712 0.026 c1.406 0.014 2.803 -0.31 4.029 -1 a8.289 8.289 0 0 1 5.642 -0.913 c3.028 0.588 6.167 0.034 8.812 -1.553z
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 35.07 32.558
                moveTo(x = 35.07f, y = 32.558f)
                // a 1.92 1.92 0 0 0 0.836 -2.241
                arcToRelative(
                    a = 1.92f,
                    b = 1.92f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.836f,
                    dy1 = -2.241f,
                )
                // c -0.259 -0.81 -1.07 -1.317 -1.921 -1.317
                curveToRelative(
                    dx1 = -0.259f,
                    dy1 = -0.81f,
                    dx2 = -1.07f,
                    dy2 = -1.317f,
                    dx3 = -1.921f,
                    dy3 = -1.317f,
                )
                // H 32
                horizontalLineTo(x = 32.0f)
                // a 1 1 0 0 1 0 -2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                )
                // h 1.5
                horizontalLineToRelative(dx = 1.5f)
                // a 1.5 1.5 0 1 0 -0.04 -3
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -0.04f,
                    dy1 = -3.0f,
                )
                // c -0.8 0.021 -1.46 -0.623 -1.46 -1.423
                curveToRelative(
                    dx1 = -0.8f,
                    dy1 = 0.021f,
                    dx2 = -1.46f,
                    dy2 = -0.623f,
                    dx3 = -1.46f,
                    dy3 = -1.423f,
                )
                // v -0.003
                verticalLineToRelative(dy = -0.003f)
                // c 0 -0.293 0.06 -0.578 0.176 -0.847
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.293f,
                    dx2 = 0.06f,
                    dy2 = -0.578f,
                    dx3 = 0.176f,
                    dy3 = -0.847f,
                )
                // a 15.294 15.294 0 0 0 1.294 -7.191
                arcToRelative(
                    a = 15.294f,
                    b = 15.294f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.294f,
                    dy1 = -7.191f,
                )
                // C 32.978 6.66 26.411 0.269 18.524 0.009
                curveTo(
                    x1 = 32.978f,
                    y1 = 6.66f,
                    x2 = 26.411f,
                    y2 = 0.269f,
                    x3 = 18.524f,
                    y3 = 0.009f,
                )
                // C 9.724 -0.281 2.5 6.766 2.5 15.5
                curveTo(
                    x1 = 9.724f,
                    y1 = -0.281f,
                    x2 = 2.5f,
                    y2 = 6.766f,
                    x3 = 2.5f,
                    y3 = 15.5f,
                )
                // c 0 2.371 0.548 4.609 1.5 6.619
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.371f,
                    dx2 = 0.548f,
                    dy2 = 4.609f,
                    dx3 = 1.5f,
                    dy3 = 6.619f,
                )
                // v 1.88
                verticalLineToRelative(dy = 1.88f)
                // c 0 1.086 -0.865 2.021 -1.951 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.086f,
                    dx2 = -0.865f,
                    dy2 = 2.021f,
                    dx3 = -1.951f,
                    dy3 = 2.0f,
                )
                // a 2 2 0 0 0 -2.034 2.167
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.034f,
                    dy1 = 2.167f,
                )
                // C 0.101 29.225 1.069 30 2.133 30
                curveTo(
                    x1 = 0.101f,
                    y1 = 29.225f,
                    x2 = 1.069f,
                    y2 = 30.0f,
                    x3 = 2.133f,
                    y3 = 30.0f,
                )
                // h 8.039
                horizontalLineToRelative(dx = 8.039f)
                // A 1.17 1.17 0 0 1 11 32
                arcTo(
                    horizontalEllipseRadius = 1.17f,
                    verticalEllipseRadius = 1.17f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 11.0f,
                    y1 = 32.0f,
                )
                // l -3.03 0.757
                lineToRelative(dx = -3.03f, dy = 0.757f)
                // a 1.281 1.281 0 0 0 0 2.485
                arcToRelative(
                    a = 1.281f,
                    b = 1.281f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 2.485f,
                )
                // c 1.932 0.483 3.914 0.737 5.905 0.756
                curveToRelative(
                    dx1 = 1.932f,
                    dy1 = 0.483f,
                    dx2 = 3.914f,
                    dy2 = 0.737f,
                    dx3 = 5.905f,
                    dy3 = 0.756f,
                )
                // l 2.712 0.026
                lineToRelative(dx = 2.712f, dy = 0.026f)
                // c 1.406 0.014 2.803 -0.31 4.029 -1
                curveToRelative(
                    dx1 = 1.406f,
                    dy1 = 0.014f,
                    dx2 = 2.803f,
                    dy2 = -0.31f,
                    dx3 = 4.029f,
                    dy3 = -1.0f,
                )
                // a 8.289 8.289 0 0 1 5.642 -0.913
                arcToRelative(
                    a = 8.289f,
                    b = 8.289f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 5.642f,
                    dy1 = -0.913f,
                )
                // c 3.028 0.588 6.167 0.034 8.812 -1.553z
                curveToRelative(
                    dx1 = 3.028f,
                    dy1 = 0.588f,
                    dx2 = 6.167f,
                    dy2 = 0.034f,
                    dx3 = 8.812f,
                    dy3 = -1.553f,
                )
                close()
            }
            // M18.736 24.003 c-0.754 0 -1.504 -0.078 -2.244 -0.234 -2.693 -0.571 -5.003 -2.115 -6.338 -4.236 a1 1 0 0 1 1.692 -1.066 c1.033 1.642 2.925 2.892 5.06 3.345 1.767 0.375 4.507 0.393 7.536 -1.642 a1 1 0 0 1 1.116 1.66 c-2.129 1.43 -4.489 2.173 -6.822 2.173z
            path(
                fill = SolidColor(Color(0xFF65471B)),
            ) {
                // M 18.736 24.003
                moveTo(x = 18.736f, y = 24.003f)
                // c -0.754 0 -1.504 -0.078 -2.244 -0.234
                curveToRelative(
                    dx1 = -0.754f,
                    dy1 = 0.0f,
                    dx2 = -1.504f,
                    dy2 = -0.078f,
                    dx3 = -2.244f,
                    dy3 = -0.234f,
                )
                // c -2.693 -0.571 -5.003 -2.115 -6.338 -4.236
                curveToRelative(
                    dx1 = -2.693f,
                    dy1 = -0.571f,
                    dx2 = -5.003f,
                    dy2 = -2.115f,
                    dx3 = -6.338f,
                    dy3 = -4.236f,
                )
                // a 1 1 0 0 1 1.692 -1.066
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.692f,
                    dy1 = -1.066f,
                )
                // c 1.033 1.642 2.925 2.892 5.06 3.345
                curveToRelative(
                    dx1 = 1.033f,
                    dy1 = 1.642f,
                    dx2 = 2.925f,
                    dy2 = 2.892f,
                    dx3 = 5.06f,
                    dy3 = 3.345f,
                )
                // c 1.767 0.375 4.507 0.393 7.536 -1.642
                curveToRelative(
                    dx1 = 1.767f,
                    dy1 = 0.375f,
                    dx2 = 4.507f,
                    dy2 = 0.393f,
                    dx3 = 7.536f,
                    dy3 = -1.642f,
                )
                // a 1 1 0 0 1 1.116 1.66
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.116f,
                    dy1 = 1.66f,
                )
                // c -2.129 1.43 -4.489 2.173 -6.822 2.173z
                curveToRelative(
                    dx1 = -2.129f,
                    dy1 = 1.43f,
                    dx2 = -4.489f,
                    dy2 = 2.173f,
                    dx3 = -6.822f,
                    dy3 = 2.173f,
                )
                close()
            }
            // M12 12 a2 3 0 1 0 4 0 a2 3 0 1 0 -4 0z
            path(
                fill = SolidColor(Color(0xFF65471B)),
            ) {
                // M 12 12
                moveTo(x = 12.0f, y = 12.0f)
                // a 2 3 0 1 0 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 3 0 1 0 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M21 14 a2 3 0 1 0 4 0 a2 3 0 1 0 -4 0z
            path(
                fill = SolidColor(Color(0xFF65471B)),
            ) {
                // M 21 14
                moveTo(x = 21.0f, y = 14.0f)
                // a 2 3 0 1 0 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 3 0 1 0 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _emoji1fae0 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1fae0: ImageVector? = null
