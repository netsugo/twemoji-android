package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f4bf: ImageVector
    get() {
        val current = _emoji1f4bf
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f4bf",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 18 c0 9.941 -8.059 18 -18 18 S0 27.941 0 18 8.059 0 18 0 s18 8.059 18 18z M18 15 c-1.657 0 -3 1.343 -3 3 s1.343 3 3 3 3 -1.343 3 -3 -1.343 -3 -3 -3z
            path(
                fill = SolidColor(Color(0xFF8899A6)),
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
                // s 18 8.059 18 18z
                reflectiveCurveToRelative(
                    dx1 = 18.0f,
                    dy1 = 8.059f,
                    dx2 = 18.0f,
                    dy2 = 18.0f,
                )
                close()
                // M 18 15
                moveTo(x = 18.0f, y = 15.0f)
                // c -1.657 0 -3 1.343 -3 3
                curveToRelative(
                    dx1 = -1.657f,
                    dy1 = 0.0f,
                    dx2 = -3.0f,
                    dy2 = 1.343f,
                    dx3 = -3.0f,
                    dy3 = 3.0f,
                )
                // s 1.343 3 3 3
                reflectiveCurveToRelative(
                    dx1 = 1.343f,
                    dy1 = 3.0f,
                    dx2 = 3.0f,
                    dy2 = 3.0f,
                )
                // s 3 -1.343 3 -3
                reflectiveCurveToRelative(
                    dx1 = 3.0f,
                    dy1 = -1.343f,
                    dx2 = 3.0f,
                    dy2 = -3.0f,
                )
                // s -1.343 -3 -3 -3z
                reflectiveCurveToRelative(
                    dx1 = -1.343f,
                    dy1 = -3.0f,
                    dx2 = -3.0f,
                    dy2 = -3.0f,
                )
                close()
            }
            // M13.288 17.476 c0.122 -1.104 0.598 -2.101 1.343 -2.846 L6.686 6.686 C4.182 9.19 2.51 12.521 2.102 16.233 l11.186 1.243z M22.713 18.524 c-0.122 1.104 -0.598 2.101 -1.343 2.846 l7.944 7.944 c2.504 -2.504 4.176 -5.835 4.584 -9.547 l-11.185 -1.243z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 13.288 17.476
                moveTo(x = 13.288f, y = 17.476f)
                // c 0.122 -1.104 0.598 -2.101 1.343 -2.846
                curveToRelative(
                    dx1 = 0.122f,
                    dy1 = -1.104f,
                    dx2 = 0.598f,
                    dy2 = -2.101f,
                    dx3 = 1.343f,
                    dy3 = -2.846f,
                )
                // L 6.686 6.686
                lineTo(x = 6.686f, y = 6.686f)
                // C 4.182 9.19 2.51 12.521 2.102 16.233
                curveTo(
                    x1 = 4.182f,
                    y1 = 9.19f,
                    x2 = 2.51f,
                    y2 = 12.521f,
                    x3 = 2.102f,
                    y3 = 16.233f,
                )
                // l 11.186 1.243z
                lineToRelative(dx = 11.186f, dy = 1.243f)
                close()
                // M 22.713 18.524
                moveTo(x = 22.713f, y = 18.524f)
                // c -0.122 1.104 -0.598 2.101 -1.343 2.846
                curveToRelative(
                    dx1 = -0.122f,
                    dy1 = 1.104f,
                    dx2 = -0.598f,
                    dy2 = 2.101f,
                    dx3 = -1.343f,
                    dy3 = 2.846f,
                )
                // l 7.944 7.944
                lineToRelative(dx = 7.944f, dy = 7.944f)
                // c 2.504 -2.504 4.176 -5.835 4.584 -9.547
                curveToRelative(
                    dx1 = 2.504f,
                    dy1 = -2.504f,
                    dx2 = 4.176f,
                    dy2 = -5.835f,
                    dx3 = 4.584f,
                    dy3 = -9.547f,
                )
                // l -11.185 -1.243z
                lineToRelative(dx = -11.185f, dy = -1.243f)
                close()
            }
            // M18.527 22.712 l1.251 11.183 c3.707 -0.41 7.034 -2.081 9.536 -4.582 l-7.944 -7.944 c-0.745 0.744 -1.741 1.22 -2.843 1.343z M17.504 13.285 L16.325 2.089 c-3.749 0.39 -7.114 2.073 -9.639 4.598 l7.944 7.944 c0.752 -0.751 1.759 -1.229 2.874 -1.346z
            path(
                fill = SolidColor(Color(0xFFF5F8FA)),
            ) {
                // M 18.527 22.712
                moveTo(x = 18.527f, y = 22.712f)
                // l 1.251 11.183
                lineToRelative(dx = 1.251f, dy = 11.183f)
                // c 3.707 -0.41 7.034 -2.081 9.536 -4.582
                curveToRelative(
                    dx1 = 3.707f,
                    dy1 = -0.41f,
                    dx2 = 7.034f,
                    dy2 = -2.081f,
                    dx3 = 9.536f,
                    dy3 = -4.582f,
                )
                // l -7.944 -7.944
                lineToRelative(dx = -7.944f, dy = -7.944f)
                // c -0.745 0.744 -1.741 1.22 -2.843 1.343z
                curveToRelative(
                    dx1 = -0.745f,
                    dy1 = 0.744f,
                    dx2 = -1.741f,
                    dy2 = 1.22f,
                    dx3 = -2.843f,
                    dy3 = 1.343f,
                )
                close()
                // M 17.504 13.285
                moveTo(x = 17.504f, y = 13.285f)
                // L 16.325 2.089
                lineTo(x = 16.325f, y = 2.089f)
                // c -3.749 0.39 -7.114 2.073 -9.639 4.598
                curveToRelative(
                    dx1 = -3.749f,
                    dy1 = 0.39f,
                    dx2 = -7.114f,
                    dy2 = 2.073f,
                    dx3 = -9.639f,
                    dy3 = 4.598f,
                )
                // l 7.944 7.944
                lineToRelative(dx = 7.944f, dy = 7.944f)
                // c 0.752 -0.751 1.759 -1.229 2.874 -1.346z
                curveToRelative(
                    dx1 = 0.752f,
                    dy1 = -0.751f,
                    dx2 = 1.759f,
                    dy2 = -1.229f,
                    dx3 = 2.874f,
                    dy3 = -1.346f,
                )
                close()
            }
        }.build().also { _emoji1f4bf = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f4bf: ImageVector? = null
