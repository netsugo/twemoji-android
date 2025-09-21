package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f3a4: ImageVector
    get() {
        val current = _emoji1f3a4
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f3a4",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M35.999 11.917 c0 3.803 -3.082 6.885 -6.885 6.885 -3.802 0 -6.884 -3.082 -6.884 -6.885 0 -3.802 3.082 -6.884 6.884 -6.884 3.803 0 6.885 3.082 6.885 6.884z
            path(
                fill = SolidColor(Color(0xFF8899A6)),
            ) {
                // M 35.999 11.917
                moveTo(x = 35.999f, y = 11.917f)
                // c 0 3.803 -3.082 6.885 -6.885 6.885
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.803f,
                    dx2 = -3.082f,
                    dy2 = 6.885f,
                    dx3 = -6.885f,
                    dy3 = 6.885f,
                )
                // c -3.802 0 -6.884 -3.082 -6.884 -6.885
                curveToRelative(
                    dx1 = -3.802f,
                    dy1 = 0.0f,
                    dx2 = -6.884f,
                    dy2 = -3.082f,
                    dx3 = -6.884f,
                    dy3 = -6.885f,
                )
                // c 0 -3.802 3.082 -6.884 6.884 -6.884
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.802f,
                    dx2 = 3.082f,
                    dy2 = -6.884f,
                    dx3 = 6.884f,
                    dy3 = -6.884f,
                )
                // c 3.803 0 6.885 3.082 6.885 6.884z
                curveToRelative(
                    dx1 = 3.803f,
                    dy1 = 0.0f,
                    dx2 = 6.885f,
                    dy2 = 3.082f,
                    dx3 = 6.885f,
                    dy3 = 6.884f,
                )
                close()
            }
            // M32.81 18.568 c-0.336 0.336 -0.881 0.336 -1.217 0 L22.466 9.44 c-0.336 -0.336 -0.336 -0.881 0 -1.217 l1.217 -1.217 c0.336 -0.336 0.881 -0.336 1.217 0 l9.127 9.128 c0.336 0.336 0.336 0.881 0 1.217 l-1.217 1.217z M26.739 18.704 l-4.325 -4.327 c-0.778 -0.779 -1.995 -0.733 -2.719 0.101 l-9.158 10.574 c-1.219 1.408 -1.461 3.354 -0.711 4.73 l-4.911 4.912 1.409 1.409 4.877 -4.877 c1.381 0.84 3.411 0.609 4.862 -0.648 l10.575 -9.157 c0.834 -0.723 0.881 -1.94 0.101 -2.717z
            path(
                fill = SolidColor(Color(0xFF31373D)),
            ) {
                // M 32.81 18.568
                moveTo(x = 32.81f, y = 18.568f)
                // c -0.336 0.336 -0.881 0.336 -1.217 0
                curveToRelative(
                    dx1 = -0.336f,
                    dy1 = 0.336f,
                    dx2 = -0.881f,
                    dy2 = 0.336f,
                    dx3 = -1.217f,
                    dy3 = 0.0f,
                )
                // L 22.466 9.44
                lineTo(x = 22.466f, y = 9.44f)
                // c -0.336 -0.336 -0.336 -0.881 0 -1.217
                curveToRelative(
                    dx1 = -0.336f,
                    dy1 = -0.336f,
                    dx2 = -0.336f,
                    dy2 = -0.881f,
                    dx3 = 0.0f,
                    dy3 = -1.217f,
                )
                // l 1.217 -1.217
                lineToRelative(dx = 1.217f, dy = -1.217f)
                // c 0.336 -0.336 0.881 -0.336 1.217 0
                curveToRelative(
                    dx1 = 0.336f,
                    dy1 = -0.336f,
                    dx2 = 0.881f,
                    dy2 = -0.336f,
                    dx3 = 1.217f,
                    dy3 = 0.0f,
                )
                // l 9.127 9.128
                lineToRelative(dx = 9.127f, dy = 9.128f)
                // c 0.336 0.336 0.336 0.881 0 1.217
                curveToRelative(
                    dx1 = 0.336f,
                    dy1 = 0.336f,
                    dx2 = 0.336f,
                    dy2 = 0.881f,
                    dx3 = 0.0f,
                    dy3 = 1.217f,
                )
                // l -1.217 1.217z
                lineToRelative(dx = -1.217f, dy = 1.217f)
                close()
                // M 26.739 18.704
                moveTo(x = 26.739f, y = 18.704f)
                // l -4.325 -4.327
                lineToRelative(dx = -4.325f, dy = -4.327f)
                // c -0.778 -0.779 -1.995 -0.733 -2.719 0.101
                curveToRelative(
                    dx1 = -0.778f,
                    dy1 = -0.779f,
                    dx2 = -1.995f,
                    dy2 = -0.733f,
                    dx3 = -2.719f,
                    dy3 = 0.101f,
                )
                // l -9.158 10.574
                lineToRelative(dx = -9.158f, dy = 10.574f)
                // c -1.219 1.408 -1.461 3.354 -0.711 4.73
                curveToRelative(
                    dx1 = -1.219f,
                    dy1 = 1.408f,
                    dx2 = -1.461f,
                    dy2 = 3.354f,
                    dx3 = -0.711f,
                    dy3 = 4.73f,
                )
                // l -4.911 4.912
                lineToRelative(dx = -4.911f, dy = 4.912f)
                // l 1.409 1.409
                lineToRelative(dx = 1.409f, dy = 1.409f)
                // l 4.877 -4.877
                lineToRelative(dx = 4.877f, dy = -4.877f)
                // c 1.381 0.84 3.411 0.609 4.862 -0.648
                curveToRelative(
                    dx1 = 1.381f,
                    dy1 = 0.84f,
                    dx2 = 3.411f,
                    dy2 = 0.609f,
                    dx3 = 4.862f,
                    dy3 = -0.648f,
                )
                // l 10.575 -9.157
                lineToRelative(dx = 10.575f, dy = -9.157f)
                // c 0.834 -0.723 0.881 -1.94 0.101 -2.717z
                curveToRelative(
                    dx1 = 0.834f,
                    dy1 = -0.723f,
                    dx2 = 0.881f,
                    dy2 = -1.94f,
                    dx3 = 0.101f,
                    dy3 = -2.717f,
                )
                close()
            }
            // M4 6 v8.122 C3.686 14.047 3.352 14 3 14 c-1.657 0 -3 0.896 -3 2 s1.343 2 3 2 3 -0.896 3 -2 L6 9.889 l5 2.222 v5.011 c-0.314 -0.075 -0.648 -0.122 -1 -0.122 -1.657 0 -3 0.896 -3 2 s1.343 2 3 2 2.999 -0.896 3 -2 v-9 L4 6z M18 1 v8.123 C17.685 9.048 17.353 9 17 9 c-1.657 0 -3 0.895 -3 2 0 1.104 1.343 2 3 2 1.656 0 3 -0.896 3 -2 L20 1 h-2z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 4 6
                moveTo(x = 4.0f, y = 6.0f)
                // v 8.122
                verticalLineToRelative(dy = 8.122f)
                // C 3.686 14.047 3.352 14 3 14
                curveTo(
                    x1 = 3.686f,
                    y1 = 14.047f,
                    x2 = 3.352f,
                    y2 = 14.0f,
                    x3 = 3.0f,
                    y3 = 14.0f,
                )
                // c -1.657 0 -3 0.896 -3 2
                curveToRelative(
                    dx1 = -1.657f,
                    dy1 = 0.0f,
                    dx2 = -3.0f,
                    dy2 = 0.896f,
                    dx3 = -3.0f,
                    dy3 = 2.0f,
                )
                // s 1.343 2 3 2
                reflectiveCurveToRelative(
                    dx1 = 1.343f,
                    dy1 = 2.0f,
                    dx2 = 3.0f,
                    dy2 = 2.0f,
                )
                // s 3 -0.896 3 -2
                reflectiveCurveToRelative(
                    dx1 = 3.0f,
                    dy1 = -0.896f,
                    dx2 = 3.0f,
                    dy2 = -2.0f,
                )
                // L 6 9.889
                lineTo(x = 6.0f, y = 9.889f)
                // l 5 2.222
                lineToRelative(dx = 5.0f, dy = 2.222f)
                // v 5.011
                verticalLineToRelative(dy = 5.011f)
                // c -0.314 -0.075 -0.648 -0.122 -1 -0.122
                curveToRelative(
                    dx1 = -0.314f,
                    dy1 = -0.075f,
                    dx2 = -0.648f,
                    dy2 = -0.122f,
                    dx3 = -1.0f,
                    dy3 = -0.122f,
                )
                // c -1.657 0 -3 0.896 -3 2
                curveToRelative(
                    dx1 = -1.657f,
                    dy1 = 0.0f,
                    dx2 = -3.0f,
                    dy2 = 0.896f,
                    dx3 = -3.0f,
                    dy3 = 2.0f,
                )
                // s 1.343 2 3 2
                reflectiveCurveToRelative(
                    dx1 = 1.343f,
                    dy1 = 2.0f,
                    dx2 = 3.0f,
                    dy2 = 2.0f,
                )
                // s 2.999 -0.896 3 -2
                reflectiveCurveToRelative(
                    dx1 = 2.999f,
                    dy1 = -0.896f,
                    dx2 = 3.0f,
                    dy2 = -2.0f,
                )
                // v -9
                verticalLineToRelative(dy = -9.0f)
                // L 4 6z
                lineTo(x = 4.0f, y = 6.0f)
                close()
                // M 18 1
                moveTo(x = 18.0f, y = 1.0f)
                // v 8.123
                verticalLineToRelative(dy = 8.123f)
                // C 17.685 9.048 17.353 9 17 9
                curveTo(
                    x1 = 17.685f,
                    y1 = 9.048f,
                    x2 = 17.353f,
                    y2 = 9.0f,
                    x3 = 17.0f,
                    y3 = 9.0f,
                )
                // c -1.657 0 -3 0.895 -3 2
                curveToRelative(
                    dx1 = -1.657f,
                    dy1 = 0.0f,
                    dx2 = -3.0f,
                    dy2 = 0.895f,
                    dx3 = -3.0f,
                    dy3 = 2.0f,
                )
                // c 0 1.104 1.343 2 3 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = 1.343f,
                    dy2 = 2.0f,
                    dx3 = 3.0f,
                    dy3 = 2.0f,
                )
                // c 1.656 0 3 -0.896 3 -2
                curveToRelative(
                    dx1 = 1.656f,
                    dy1 = 0.0f,
                    dx2 = 3.0f,
                    dy2 = -0.896f,
                    dx3 = 3.0f,
                    dy3 = -2.0f,
                )
                // L 20 1
                lineTo(x = 20.0f, y = 1.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
        }.build().also { _emoji1f3a4 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f3a4: ImageVector? = null
