package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji2733: ImageVector
    get() {
        val current = _emoji2733
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji2733",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 32 c0 2.209 -1.791 4 -4 4 H4 c-2.209 0 -4 -1.791 -4 -4 V4 c0 -2.209 1.791 -4 4 -4 h28 c2.209 0 4 1.791 4 4 v28z
            path(
                fill = SolidColor(Color(0xFF77B255)),
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
            // M31.999 16 h-9.171 l6.899 -6.899 c0.781 -0.781 0.782 -2.047 0.001 -2.828 -0.782 -0.782 -2.048 -0.781 -2.829 0 L20 13.172 V4 c0 -1.104 -0.896 -2 -2 -2 s-2 0.896 -2 2 v9.171 L9.101 6.272 c-0.781 -0.781 -2.048 -0.781 -2.828 0 -0.781 0.781 -0.781 2.047 0 2.828 l6.9 6.9 H4 c-1.104 0 -2.001 0.896 -2 2 0 1.104 0.896 2 1.999 2 h9.174 l-6.9 6.9 c-0.781 0.78 -0.781 2.047 0 2.828 0.78 0.78 2.047 0.78 2.827 0 l6.9 -6.9 V32 c0 1.104 0.896 2 2 2 s2 -0.896 2 -2 v-9.172 l6.899 6.899 c0.781 0.781 2.047 0.782 2.828 0.001 0.781 -0.781 0.781 -2.048 0 -2.829 L22.828 20 h9.171 C33.104 20 34 19.105 34 18.001 34 16.896 33.104 16 31.999 16z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 31.999 16
                moveTo(x = 31.999f, y = 16.0f)
                // h -9.171
                horizontalLineToRelative(dx = -9.171f)
                // l 6.899 -6.899
                lineToRelative(dx = 6.899f, dy = -6.899f)
                // c 0.781 -0.781 0.782 -2.047 0.001 -2.828
                curveToRelative(
                    dx1 = 0.781f,
                    dy1 = -0.781f,
                    dx2 = 0.782f,
                    dy2 = -2.047f,
                    dx3 = 0.001f,
                    dy3 = -2.828f,
                )
                // c -0.782 -0.782 -2.048 -0.781 -2.829 0
                curveToRelative(
                    dx1 = -0.782f,
                    dy1 = -0.782f,
                    dx2 = -2.048f,
                    dy2 = -0.781f,
                    dx3 = -2.829f,
                    dy3 = 0.0f,
                )
                // L 20 13.172
                lineTo(x = 20.0f, y = 13.172f)
                // V 4
                verticalLineTo(y = 4.0f)
                // c 0 -1.104 -0.896 -2 -2 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.104f,
                    dx2 = -0.896f,
                    dy2 = -2.0f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // s -2 0.896 -2 2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 0.896f,
                    dx2 = -2.0f,
                    dy2 = 2.0f,
                )
                // v 9.171
                verticalLineToRelative(dy = 9.171f)
                // L 9.101 6.272
                lineTo(x = 9.101f, y = 6.272f)
                // c -0.781 -0.781 -2.048 -0.781 -2.828 0
                curveToRelative(
                    dx1 = -0.781f,
                    dy1 = -0.781f,
                    dx2 = -2.048f,
                    dy2 = -0.781f,
                    dx3 = -2.828f,
                    dy3 = 0.0f,
                )
                // c -0.781 0.781 -0.781 2.047 0 2.828
                curveToRelative(
                    dx1 = -0.781f,
                    dy1 = 0.781f,
                    dx2 = -0.781f,
                    dy2 = 2.047f,
                    dx3 = 0.0f,
                    dy3 = 2.828f,
                )
                // l 6.9 6.9
                lineToRelative(dx = 6.9f, dy = 6.9f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // c -1.104 0 -2.001 0.896 -2 2
                curveToRelative(
                    dx1 = -1.104f,
                    dy1 = 0.0f,
                    dx2 = -2.001f,
                    dy2 = 0.896f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // c 0 1.104 0.896 2 1.999 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = 0.896f,
                    dy2 = 2.0f,
                    dx3 = 1.999f,
                    dy3 = 2.0f,
                )
                // h 9.174
                horizontalLineToRelative(dx = 9.174f)
                // l -6.9 6.9
                lineToRelative(dx = -6.9f, dy = 6.9f)
                // c -0.781 0.78 -0.781 2.047 0 2.828
                curveToRelative(
                    dx1 = -0.781f,
                    dy1 = 0.78f,
                    dx2 = -0.781f,
                    dy2 = 2.047f,
                    dx3 = 0.0f,
                    dy3 = 2.828f,
                )
                // c 0.78 0.78 2.047 0.78 2.827 0
                curveToRelative(
                    dx1 = 0.78f,
                    dy1 = 0.78f,
                    dx2 = 2.047f,
                    dy2 = 0.78f,
                    dx3 = 2.827f,
                    dy3 = 0.0f,
                )
                // l 6.9 -6.9
                lineToRelative(dx = 6.9f, dy = -6.9f)
                // V 32
                verticalLineTo(y = 32.0f)
                // c 0 1.104 0.896 2 2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = 0.896f,
                    dy2 = 2.0f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                // s 2 -0.896 2 -2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = -0.896f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // v -9.172
                verticalLineToRelative(dy = -9.172f)
                // l 6.899 6.899
                lineToRelative(dx = 6.899f, dy = 6.899f)
                // c 0.781 0.781 2.047 0.782 2.828 0.001
                curveToRelative(
                    dx1 = 0.781f,
                    dy1 = 0.781f,
                    dx2 = 2.047f,
                    dy2 = 0.782f,
                    dx3 = 2.828f,
                    dy3 = 0.001f,
                )
                // c 0.781 -0.781 0.781 -2.048 0 -2.829
                curveToRelative(
                    dx1 = 0.781f,
                    dy1 = -0.781f,
                    dx2 = 0.781f,
                    dy2 = -2.048f,
                    dx3 = 0.0f,
                    dy3 = -2.829f,
                )
                // L 22.828 20
                lineTo(x = 22.828f, y = 20.0f)
                // h 9.171
                horizontalLineToRelative(dx = 9.171f)
                // C 33.104 20 34 19.105 34 18.001
                curveTo(
                    x1 = 33.104f,
                    y1 = 20.0f,
                    x2 = 34.0f,
                    y2 = 19.105f,
                    x3 = 34.0f,
                    y3 = 18.001f,
                )
                // C 34 16.896 33.104 16 31.999 16z
                curveTo(
                    x1 = 34.0f,
                    y1 = 16.896f,
                    x2 = 33.104f,
                    y2 = 16.0f,
                    x3 = 31.999f,
                    y3 = 16.0f,
                )
                close()
            }
        }.build().also { _emoji2733 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji2733: ImageVector? = null
