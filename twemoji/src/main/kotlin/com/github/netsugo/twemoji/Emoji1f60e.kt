package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f60e: ImageVector
    get() {
        val current = _emoji1f60e
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f60e",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 18 c0 9.941 -8.059 18 -18 18 S0 27.941 0 18 8.059 0 18 0 s18 8.059 18 18
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 36 18
                moveTo(x = 36.0f, y = 18.0f)
                // c 0 9.941 -8.059 18 -18 18
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 9.941f,
                    dx2 = -8.059f,
                    dy2 = 18.0f,
                    dx3 = -18.0f,
                    dy3 = 18.0f,
                )
                // S 0 27.941 0 18
                reflectiveCurveTo(
                    x1 = 0.0f,
                    y1 = 27.941f,
                    x2 = 0.0f,
                    y2 = 18.0f,
                )
                // S 8.059 0 18 0
                reflectiveCurveTo(
                    x1 = 8.059f,
                    y1 = 0.0f,
                    x2 = 18.0f,
                    y2 = 0.0f,
                )
                // s 18 8.059 18 18
                reflectiveCurveToRelative(
                    dx1 = 18.0f,
                    dy1 = 8.059f,
                    dx2 = 18.0f,
                    dy2 = 18.0f,
                )
            }
            // M1.24 11.018 c0.24 0.239 1.438 0.957 1.677 1.675 0.24 0.717 0.72 4.784 2.158 5.981 1.483 1.232 7.077 0.774 8.148 0.24 2.397 -1.195 2.691 -4.531 3.115 -6.221 0.239 -0.957 1.677 -0.957 1.677 -0.957 s1.438 0 1.678 0.956 c0.424 1.691 0.72 5.027 3.115 6.221 1.072 0.535 6.666 0.994 8.151 -0.238 1.436 -1.197 1.915 -5.264 2.155 -5.982 0.238 -0.717 1.438 -1.435 1.677 -1.674 0.241 -0.239 0.241 -1.196 0 -1.436 -0.479 -0.478 -6.134 -0.904 -12.223 -0.239 -1.215 0.133 -1.677 0.478 -4.554 0.478 -2.875 0 -3.339 -0.346 -4.553 -0.478 -6.085 -0.666 -11.741 -0.24 -12.221 0.238 -0.239 0.239 -0.239 1.197 0 1.436z
            path(
                fill = SolidColor(Color(0xFF292F33)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                // M 1.24 11.018
                moveTo(x = 1.24f, y = 11.018f)
                // c 0.24 0.239 1.438 0.957 1.677 1.675
                curveToRelative(
                    dx1 = 0.24f,
                    dy1 = 0.239f,
                    dx2 = 1.438f,
                    dy2 = 0.957f,
                    dx3 = 1.677f,
                    dy3 = 1.675f,
                )
                // c 0.24 0.717 0.72 4.784 2.158 5.981
                curveToRelative(
                    dx1 = 0.24f,
                    dy1 = 0.717f,
                    dx2 = 0.72f,
                    dy2 = 4.784f,
                    dx3 = 2.158f,
                    dy3 = 5.981f,
                )
                // c 1.483 1.232 7.077 0.774 8.148 0.24
                curveToRelative(
                    dx1 = 1.483f,
                    dy1 = 1.232f,
                    dx2 = 7.077f,
                    dy2 = 0.774f,
                    dx3 = 8.148f,
                    dy3 = 0.24f,
                )
                // c 2.397 -1.195 2.691 -4.531 3.115 -6.221
                curveToRelative(
                    dx1 = 2.397f,
                    dy1 = -1.195f,
                    dx2 = 2.691f,
                    dy2 = -4.531f,
                    dx3 = 3.115f,
                    dy3 = -6.221f,
                )
                // c 0.239 -0.957 1.677 -0.957 1.677 -0.957
                curveToRelative(
                    dx1 = 0.239f,
                    dy1 = -0.957f,
                    dx2 = 1.677f,
                    dy2 = -0.957f,
                    dx3 = 1.677f,
                    dy3 = -0.957f,
                )
                // s 1.438 0 1.678 0.956
                reflectiveCurveToRelative(
                    dx1 = 1.438f,
                    dy1 = 0.0f,
                    dx2 = 1.678f,
                    dy2 = 0.956f,
                )
                // c 0.424 1.691 0.72 5.027 3.115 6.221
                curveToRelative(
                    dx1 = 0.424f,
                    dy1 = 1.691f,
                    dx2 = 0.72f,
                    dy2 = 5.027f,
                    dx3 = 3.115f,
                    dy3 = 6.221f,
                )
                // c 1.072 0.535 6.666 0.994 8.151 -0.238
                curveToRelative(
                    dx1 = 1.072f,
                    dy1 = 0.535f,
                    dx2 = 6.666f,
                    dy2 = 0.994f,
                    dx3 = 8.151f,
                    dy3 = -0.238f,
                )
                // c 1.436 -1.197 1.915 -5.264 2.155 -5.982
                curveToRelative(
                    dx1 = 1.436f,
                    dy1 = -1.197f,
                    dx2 = 1.915f,
                    dy2 = -5.264f,
                    dx3 = 2.155f,
                    dy3 = -5.982f,
                )
                // c 0.238 -0.717 1.438 -1.435 1.677 -1.674
                curveToRelative(
                    dx1 = 0.238f,
                    dy1 = -0.717f,
                    dx2 = 1.438f,
                    dy2 = -1.435f,
                    dx3 = 1.677f,
                    dy3 = -1.674f,
                )
                // c 0.241 -0.239 0.241 -1.196 0 -1.436
                curveToRelative(
                    dx1 = 0.241f,
                    dy1 = -0.239f,
                    dx2 = 0.241f,
                    dy2 = -1.196f,
                    dx3 = 0.0f,
                    dy3 = -1.436f,
                )
                // c -0.479 -0.478 -6.134 -0.904 -12.223 -0.239
                curveToRelative(
                    dx1 = -0.479f,
                    dy1 = -0.478f,
                    dx2 = -6.134f,
                    dy2 = -0.904f,
                    dx3 = -12.223f,
                    dy3 = -0.239f,
                )
                // c -1.215 0.133 -1.677 0.478 -4.554 0.478
                curveToRelative(
                    dx1 = -1.215f,
                    dy1 = 0.133f,
                    dx2 = -1.677f,
                    dy2 = 0.478f,
                    dx3 = -4.554f,
                    dy3 = 0.478f,
                )
                // c -2.875 0 -3.339 -0.346 -4.553 -0.478
                curveToRelative(
                    dx1 = -2.875f,
                    dy1 = 0.0f,
                    dx2 = -3.339f,
                    dy2 = -0.346f,
                    dx3 = -4.553f,
                    dy3 = -0.478f,
                )
                // c -6.085 -0.666 -11.741 -0.24 -12.221 0.238
                curveToRelative(
                    dx1 = -6.085f,
                    dy1 = -0.666f,
                    dx2 = -11.741f,
                    dy2 = -0.24f,
                    dx3 = -12.221f,
                    dy3 = 0.238f,
                )
                // c -0.239 0.239 -0.239 1.197 0 1.436z
                curveToRelative(
                    dx1 = -0.239f,
                    dy1 = 0.239f,
                    dx2 = -0.239f,
                    dy2 = 1.197f,
                    dx3 = 0.0f,
                    dy3 = 1.436f,
                )
                close()
            }
            // M27.335 23.629 c-0.178 -0.161 -0.444 -0.171 -0.635 -0.029 -0.039 0.029 -3.922 2.9 -8.7 2.9 -4.766 0 -8.662 -2.871 -8.7 -2.9 -0.191 -0.142 -0.457 -0.13 -0.635 0.029 -0.177 0.16 -0.217 0.424 -0.094 0.628 C8.7 24.472 11.788 29.5 18 29.5 s9.301 -5.028 9.429 -5.243 c0.123 -0.205 0.084 -0.468 -0.094 -0.628z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 27.335 23.629
                moveTo(x = 27.335f, y = 23.629f)
                // c -0.178 -0.161 -0.444 -0.171 -0.635 -0.029
                curveToRelative(
                    dx1 = -0.178f,
                    dy1 = -0.161f,
                    dx2 = -0.444f,
                    dy2 = -0.171f,
                    dx3 = -0.635f,
                    dy3 = -0.029f,
                )
                // c -0.039 0.029 -3.922 2.9 -8.7 2.9
                curveToRelative(
                    dx1 = -0.039f,
                    dy1 = 0.029f,
                    dx2 = -3.922f,
                    dy2 = 2.9f,
                    dx3 = -8.7f,
                    dy3 = 2.9f,
                )
                // c -4.766 0 -8.662 -2.871 -8.7 -2.9
                curveToRelative(
                    dx1 = -4.766f,
                    dy1 = 0.0f,
                    dx2 = -8.662f,
                    dy2 = -2.871f,
                    dx3 = -8.7f,
                    dy3 = -2.9f,
                )
                // c -0.191 -0.142 -0.457 -0.13 -0.635 0.029
                curveToRelative(
                    dx1 = -0.191f,
                    dy1 = -0.142f,
                    dx2 = -0.457f,
                    dy2 = -0.13f,
                    dx3 = -0.635f,
                    dy3 = 0.029f,
                )
                // c -0.177 0.16 -0.217 0.424 -0.094 0.628
                curveToRelative(
                    dx1 = -0.177f,
                    dy1 = 0.16f,
                    dx2 = -0.217f,
                    dy2 = 0.424f,
                    dx3 = -0.094f,
                    dy3 = 0.628f,
                )
                // C 8.7 24.472 11.788 29.5 18 29.5
                curveTo(
                    x1 = 8.7f,
                    y1 = 24.472f,
                    x2 = 11.788f,
                    y2 = 29.5f,
                    x3 = 18.0f,
                    y3 = 29.5f,
                )
                // s 9.301 -5.028 9.429 -5.243
                reflectiveCurveToRelative(
                    dx1 = 9.301f,
                    dy1 = -5.028f,
                    dx2 = 9.429f,
                    dy2 = -5.243f,
                )
                // c 0.123 -0.205 0.084 -0.468 -0.094 -0.628z
                curveToRelative(
                    dx1 = 0.123f,
                    dy1 = -0.205f,
                    dx2 = 0.084f,
                    dy2 = -0.468f,
                    dx3 = -0.094f,
                    dy3 = -0.628f,
                )
                close()
            }
        }.build().also { _emoji1f60e = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f60e: ImageVector? = null
