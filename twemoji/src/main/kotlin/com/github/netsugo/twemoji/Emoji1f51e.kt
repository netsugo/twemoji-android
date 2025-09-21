package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f51e: ImageVector
    get() {
        val current = _emoji1f51e
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f51e",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M34.999 17.999 c0 9.389 -7.611 17 -17 17 s-17 -7.611 -17 -17 7.611 -17 17 -17 17 7.611 17 17
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 34.999 17.999
                moveTo(x = 34.999f, y = 17.999f)
                // c 0 9.389 -7.611 17 -17 17
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 9.389f,
                    dx2 = -7.611f,
                    dy2 = 17.0f,
                    dx3 = -17.0f,
                    dy3 = 17.0f,
                )
                // s -17 -7.611 -17 -17
                reflectiveCurveToRelative(
                    dx1 = -17.0f,
                    dy1 = -7.611f,
                    dx2 = -17.0f,
                    dy2 = -17.0f,
                )
                // s 7.611 -17 17 -17
                reflectiveCurveToRelative(
                    dx1 = 7.611f,
                    dy1 = -17.0f,
                    dx2 = 17.0f,
                    dy2 = -17.0f,
                )
                // s 17 7.611 17 17
                reflectiveCurveToRelative(
                    dx1 = 17.0f,
                    dy1 = 7.611f,
                    dx2 = 17.0f,
                    dy2 = 17.0f,
                )
            }
            // M9.521 12.245 L7.85 12.245 c-1.358 0 -1.924 -0.991 -1.924 -1.953 0 -0.99 0.707 -1.952 1.924 -1.952 h4.019 c1.217 0 1.896 0.876 1.896 2.007 v16.104 c0 1.414 -0.906 2.207 -2.122 2.207 -1.216 0 -2.122 -0.793 -2.122 -2.207 L9.521 12.245z M16.828 22.375 c0 -2.264 1.245 -3.934 3.027 -4.895 -1.33 -0.963 -2.15 -2.265 -2.15 -4.047 0 -3.312 2.745 -5.434 6.112 -5.434 3.283 0 6.14 2.093 6.14 5.434 0 1.583 -0.791 3.17 -2.178 4.047 1.924 0.96 3.027 2.715 3.027 4.895 0 3.934 -3.197 6.451 -6.989 6.451 -3.906 0 -6.989 -2.658 -6.989 -6.451z M21.241 22.092 c0 1.443 0.849 2.832 2.575 2.832 1.612 0 2.576 -1.389 2.576 -2.832 0 -1.783 -1.02 -2.83 -2.576 -2.83 -1.641 0 -2.575 1.246 -2.575 2.83z M21.779 13.886 c0 1.274 0.736 2.151 2.037 2.151 1.302 0 2.066 -0.877 2.066 -2.151 0 -1.217 -0.736 -2.151 -2.066 -2.151 -1.33 0 -2.037 0.934 -2.037 2.151z
            path(
                fill = SolidColor(Color(0xFFF5F8FA)),
            ) {
                // M 9.521 12.245
                moveTo(x = 9.521f, y = 12.245f)
                // L 7.85 12.245
                lineTo(x = 7.85f, y = 12.245f)
                // c -1.358 0 -1.924 -0.991 -1.924 -1.953
                curveToRelative(
                    dx1 = -1.358f,
                    dy1 = 0.0f,
                    dx2 = -1.924f,
                    dy2 = -0.991f,
                    dx3 = -1.924f,
                    dy3 = -1.953f,
                )
                // c 0 -0.99 0.707 -1.952 1.924 -1.952
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.99f,
                    dx2 = 0.707f,
                    dy2 = -1.952f,
                    dx3 = 1.924f,
                    dy3 = -1.952f,
                )
                // h 4.019
                horizontalLineToRelative(dx = 4.019f)
                // c 1.217 0 1.896 0.876 1.896 2.007
                curveToRelative(
                    dx1 = 1.217f,
                    dy1 = 0.0f,
                    dx2 = 1.896f,
                    dy2 = 0.876f,
                    dx3 = 1.896f,
                    dy3 = 2.007f,
                )
                // v 16.104
                verticalLineToRelative(dy = 16.104f)
                // c 0 1.414 -0.906 2.207 -2.122 2.207
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.414f,
                    dx2 = -0.906f,
                    dy2 = 2.207f,
                    dx3 = -2.122f,
                    dy3 = 2.207f,
                )
                // c -1.216 0 -2.122 -0.793 -2.122 -2.207
                curveToRelative(
                    dx1 = -1.216f,
                    dy1 = 0.0f,
                    dx2 = -2.122f,
                    dy2 = -0.793f,
                    dx3 = -2.122f,
                    dy3 = -2.207f,
                )
                // L 9.521 12.245z
                lineTo(x = 9.521f, y = 12.245f)
                close()
                // M 16.828 22.375
                moveTo(x = 16.828f, y = 22.375f)
                // c 0 -2.264 1.245 -3.934 3.027 -4.895
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.264f,
                    dx2 = 1.245f,
                    dy2 = -3.934f,
                    dx3 = 3.027f,
                    dy3 = -4.895f,
                )
                // c -1.33 -0.963 -2.15 -2.265 -2.15 -4.047
                curveToRelative(
                    dx1 = -1.33f,
                    dy1 = -0.963f,
                    dx2 = -2.15f,
                    dy2 = -2.265f,
                    dx3 = -2.15f,
                    dy3 = -4.047f,
                )
                // c 0 -3.312 2.745 -5.434 6.112 -5.434
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.312f,
                    dx2 = 2.745f,
                    dy2 = -5.434f,
                    dx3 = 6.112f,
                    dy3 = -5.434f,
                )
                // c 3.283 0 6.14 2.093 6.14 5.434
                curveToRelative(
                    dx1 = 3.283f,
                    dy1 = 0.0f,
                    dx2 = 6.14f,
                    dy2 = 2.093f,
                    dx3 = 6.14f,
                    dy3 = 5.434f,
                )
                // c 0 1.583 -0.791 3.17 -2.178 4.047
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.583f,
                    dx2 = -0.791f,
                    dy2 = 3.17f,
                    dx3 = -2.178f,
                    dy3 = 4.047f,
                )
                // c 1.924 0.96 3.027 2.715 3.027 4.895
                curveToRelative(
                    dx1 = 1.924f,
                    dy1 = 0.96f,
                    dx2 = 3.027f,
                    dy2 = 2.715f,
                    dx3 = 3.027f,
                    dy3 = 4.895f,
                )
                // c 0 3.934 -3.197 6.451 -6.989 6.451
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.934f,
                    dx2 = -3.197f,
                    dy2 = 6.451f,
                    dx3 = -6.989f,
                    dy3 = 6.451f,
                )
                // c -3.906 0 -6.989 -2.658 -6.989 -6.451z
                curveToRelative(
                    dx1 = -3.906f,
                    dy1 = 0.0f,
                    dx2 = -6.989f,
                    dy2 = -2.658f,
                    dx3 = -6.989f,
                    dy3 = -6.451f,
                )
                close()
                // M 21.241 22.092
                moveTo(x = 21.241f, y = 22.092f)
                // c 0 1.443 0.849 2.832 2.575 2.832
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.443f,
                    dx2 = 0.849f,
                    dy2 = 2.832f,
                    dx3 = 2.575f,
                    dy3 = 2.832f,
                )
                // c 1.612 0 2.576 -1.389 2.576 -2.832
                curveToRelative(
                    dx1 = 1.612f,
                    dy1 = 0.0f,
                    dx2 = 2.576f,
                    dy2 = -1.389f,
                    dx3 = 2.576f,
                    dy3 = -2.832f,
                )
                // c 0 -1.783 -1.02 -2.83 -2.576 -2.83
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.783f,
                    dx2 = -1.02f,
                    dy2 = -2.83f,
                    dx3 = -2.576f,
                    dy3 = -2.83f,
                )
                // c -1.641 0 -2.575 1.246 -2.575 2.83z
                curveToRelative(
                    dx1 = -1.641f,
                    dy1 = 0.0f,
                    dx2 = -2.575f,
                    dy2 = 1.246f,
                    dx3 = -2.575f,
                    dy3 = 2.83f,
                )
                close()
                // M 21.779 13.886
                moveTo(x = 21.779f, y = 13.886f)
                // c 0 1.274 0.736 2.151 2.037 2.151
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.274f,
                    dx2 = 0.736f,
                    dy2 = 2.151f,
                    dx3 = 2.037f,
                    dy3 = 2.151f,
                )
                // c 1.302 0 2.066 -0.877 2.066 -2.151
                curveToRelative(
                    dx1 = 1.302f,
                    dy1 = 0.0f,
                    dx2 = 2.066f,
                    dy2 = -0.877f,
                    dx3 = 2.066f,
                    dy3 = -2.151f,
                )
                // c 0 -1.217 -0.736 -2.151 -2.066 -2.151
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.217f,
                    dx2 = -0.736f,
                    dy2 = -2.151f,
                    dx3 = -2.066f,
                    dy3 = -2.151f,
                )
                // c -1.33 0 -2.037 0.934 -2.037 2.151z
                curveToRelative(
                    dx1 = -1.33f,
                    dy1 = 0.0f,
                    dx2 = -2.037f,
                    dy2 = 0.934f,
                    dx3 = -2.037f,
                    dy3 = 2.151f,
                )
                close()
            }
            // M18 0 C8.059 0 0 8.06 0 18 c0 9.941 8.059 18 18 18 s18 -8.059 18 -18 c0 -9.94 -8.059 -18 -18 -18z M34 18 c0 3.969 -1.453 7.592 -3.845 10.389 L7.612 5.845 C10.409 3.453 14.032 2 18 2 c8.837 0 16 7.164 16 16z M2 18 c0 -3.968 1.453 -7.591 3.844 -10.387 l22.543 22.543 C25.591 32.548 21.968 34 18 34 9.164 34 2 26.837 2 18z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
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
                // c 0 -9.94 -8.059 -18 -18 -18z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -9.94f,
                    dx2 = -8.059f,
                    dy2 = -18.0f,
                    dx3 = -18.0f,
                    dy3 = -18.0f,
                )
                close()
                // M 34 18
                moveTo(x = 34.0f, y = 18.0f)
                // c 0 3.969 -1.453 7.592 -3.845 10.389
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.969f,
                    dx2 = -1.453f,
                    dy2 = 7.592f,
                    dx3 = -3.845f,
                    dy3 = 10.389f,
                )
                // L 7.612 5.845
                lineTo(x = 7.612f, y = 5.845f)
                // C 10.409 3.453 14.032 2 18 2
                curveTo(
                    x1 = 10.409f,
                    y1 = 3.453f,
                    x2 = 14.032f,
                    y2 = 2.0f,
                    x3 = 18.0f,
                    y3 = 2.0f,
                )
                // c 8.837 0 16 7.164 16 16z
                curveToRelative(
                    dx1 = 8.837f,
                    dy1 = 0.0f,
                    dx2 = 16.0f,
                    dy2 = 7.164f,
                    dx3 = 16.0f,
                    dy3 = 16.0f,
                )
                close()
                // M 2 18
                moveTo(x = 2.0f, y = 18.0f)
                // c 0 -3.968 1.453 -7.591 3.844 -10.387
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.968f,
                    dx2 = 1.453f,
                    dy2 = -7.591f,
                    dx3 = 3.844f,
                    dy3 = -10.387f,
                )
                // l 22.543 22.543
                lineToRelative(dx = 22.543f, dy = 22.543f)
                // C 25.591 32.548 21.968 34 18 34
                curveTo(
                    x1 = 25.591f,
                    y1 = 32.548f,
                    x2 = 21.968f,
                    y2 = 34.0f,
                    x3 = 18.0f,
                    y3 = 34.0f,
                )
                // C 9.164 34 2 26.837 2 18z
                curveTo(
                    x1 = 9.164f,
                    y1 = 34.0f,
                    x2 = 2.0f,
                    y2 = 26.837f,
                    x3 = 2.0f,
                    y3 = 18.0f,
                )
                close()
            }
        }.build().also { _emoji1f51e = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f51e: ImageVector? = null
