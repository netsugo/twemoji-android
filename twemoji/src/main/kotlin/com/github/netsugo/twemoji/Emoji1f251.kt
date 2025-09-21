package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f251: ImageVector
    get() {
        val current = _emoji1f251
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f251",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 18 c0 9.941 -8.059 18 -18 18 S0 27.941 0 18 C0 8.06 8.059 0 18 0 s18 8.06 18 18z
            path(
                fill = SolidColor(Color(0xFFF4900C)),
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
                // C 0 8.06 8.059 0 18 0
                curveTo(
                    x1 = 0.0f,
                    y1 = 8.06f,
                    x2 = 8.059f,
                    y2 = 0.0f,
                    x3 = 18.0f,
                    y3 = 0.0f,
                )
                // s 18 8.06 18 18z
                reflectiveCurveToRelative(
                    dx1 = 18.0f,
                    dy1 = 8.06f,
                    dx2 = 18.0f,
                    dy2 = 18.0f,
                )
                close()
            }
            // M6.988 9.546 c-0.494 0 -0.78 -0.39 -0.78 -0.962 0 -0.546 0.286 -0.936 0.78 -0.936 h22.049 c0.468 0 0.754 0.39 0.754 0.936 s-0.286 0.962 -0.754 0.962 h-2.6 v17.915 c0 1.899 -0.858 2.652 -3.276 2.652 -1.093 0 -2.392 -0.131 -3.406 -0.365 -0.494 -0.103 -0.78 -0.467 -0.78 -0.935 0 -0.078 0 -0.182 0.026 -0.285 0.104 -0.521 0.416 -0.807 0.858 -0.807 0.078 0 0.182 0 0.26 0.025 0.884 0.234 2.027 0.391 2.834 0.391 1.092 0 1.404 -0.234 1.404 -1.248 L24.357 9.546 L6.988 9.546z M20.066 22.078 c0 1.664 -0.728 2.314 -2.366 2.314 h-6.136 c-1.664 0 -2.392 -0.65 -2.392 -2.314 v-6.941 c0 -1.664 0.728 -2.314 2.392 -2.314 L17.7 12.823 c1.638 0 2.366 0.65 2.366 2.314 v6.941z M17.259 22.521 c0.546 0 0.806 -0.156 0.806 -0.729 v-6.37 c0 -0.572 -0.26 -0.728 -0.806 -0.728 h-5.304 c-0.52 0 -0.78 0.156 -0.78 0.728 v6.37 c0 0.572 0.26 0.729 0.78 0.729 h5.304z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 6.988 9.546
                moveTo(x = 6.988f, y = 9.546f)
                // c -0.494 0 -0.78 -0.39 -0.78 -0.962
                curveToRelative(
                    dx1 = -0.494f,
                    dy1 = 0.0f,
                    dx2 = -0.78f,
                    dy2 = -0.39f,
                    dx3 = -0.78f,
                    dy3 = -0.962f,
                )
                // c 0 -0.546 0.286 -0.936 0.78 -0.936
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.546f,
                    dx2 = 0.286f,
                    dy2 = -0.936f,
                    dx3 = 0.78f,
                    dy3 = -0.936f,
                )
                // h 22.049
                horizontalLineToRelative(dx = 22.049f)
                // c 0.468 0 0.754 0.39 0.754 0.936
                curveToRelative(
                    dx1 = 0.468f,
                    dy1 = 0.0f,
                    dx2 = 0.754f,
                    dy2 = 0.39f,
                    dx3 = 0.754f,
                    dy3 = 0.936f,
                )
                // s -0.286 0.962 -0.754 0.962
                reflectiveCurveToRelative(
                    dx1 = -0.286f,
                    dy1 = 0.962f,
                    dx2 = -0.754f,
                    dy2 = 0.962f,
                )
                // h -2.6
                horizontalLineToRelative(dx = -2.6f)
                // v 17.915
                verticalLineToRelative(dy = 17.915f)
                // c 0 1.899 -0.858 2.652 -3.276 2.652
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.899f,
                    dx2 = -0.858f,
                    dy2 = 2.652f,
                    dx3 = -3.276f,
                    dy3 = 2.652f,
                )
                // c -1.093 0 -2.392 -0.131 -3.406 -0.365
                curveToRelative(
                    dx1 = -1.093f,
                    dy1 = 0.0f,
                    dx2 = -2.392f,
                    dy2 = -0.131f,
                    dx3 = -3.406f,
                    dy3 = -0.365f,
                )
                // c -0.494 -0.103 -0.78 -0.467 -0.78 -0.935
                curveToRelative(
                    dx1 = -0.494f,
                    dy1 = -0.103f,
                    dx2 = -0.78f,
                    dy2 = -0.467f,
                    dx3 = -0.78f,
                    dy3 = -0.935f,
                )
                // c 0 -0.078 0 -0.182 0.026 -0.285
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.078f,
                    dx2 = 0.0f,
                    dy2 = -0.182f,
                    dx3 = 0.026f,
                    dy3 = -0.285f,
                )
                // c 0.104 -0.521 0.416 -0.807 0.858 -0.807
                curveToRelative(
                    dx1 = 0.104f,
                    dy1 = -0.521f,
                    dx2 = 0.416f,
                    dy2 = -0.807f,
                    dx3 = 0.858f,
                    dy3 = -0.807f,
                )
                // c 0.078 0 0.182 0 0.26 0.025
                curveToRelative(
                    dx1 = 0.078f,
                    dy1 = 0.0f,
                    dx2 = 0.182f,
                    dy2 = 0.0f,
                    dx3 = 0.26f,
                    dy3 = 0.025f,
                )
                // c 0.884 0.234 2.027 0.391 2.834 0.391
                curveToRelative(
                    dx1 = 0.884f,
                    dy1 = 0.234f,
                    dx2 = 2.027f,
                    dy2 = 0.391f,
                    dx3 = 2.834f,
                    dy3 = 0.391f,
                )
                // c 1.092 0 1.404 -0.234 1.404 -1.248
                curveToRelative(
                    dx1 = 1.092f,
                    dy1 = 0.0f,
                    dx2 = 1.404f,
                    dy2 = -0.234f,
                    dx3 = 1.404f,
                    dy3 = -1.248f,
                )
                // L 24.357 9.546
                lineTo(x = 24.357f, y = 9.546f)
                // L 6.988 9.546z
                lineTo(x = 6.988f, y = 9.546f)
                close()
                // M 20.066 22.078
                moveTo(x = 20.066f, y = 22.078f)
                // c 0 1.664 -0.728 2.314 -2.366 2.314
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.664f,
                    dx2 = -0.728f,
                    dy2 = 2.314f,
                    dx3 = -2.366f,
                    dy3 = 2.314f,
                )
                // h -6.136
                horizontalLineToRelative(dx = -6.136f)
                // c -1.664 0 -2.392 -0.65 -2.392 -2.314
                curveToRelative(
                    dx1 = -1.664f,
                    dy1 = 0.0f,
                    dx2 = -2.392f,
                    dy2 = -0.65f,
                    dx3 = -2.392f,
                    dy3 = -2.314f,
                )
                // v -6.941
                verticalLineToRelative(dy = -6.941f)
                // c 0 -1.664 0.728 -2.314 2.392 -2.314
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.664f,
                    dx2 = 0.728f,
                    dy2 = -2.314f,
                    dx3 = 2.392f,
                    dy3 = -2.314f,
                )
                // L 17.7 12.823
                lineTo(x = 17.7f, y = 12.823f)
                // c 1.638 0 2.366 0.65 2.366 2.314
                curveToRelative(
                    dx1 = 1.638f,
                    dy1 = 0.0f,
                    dx2 = 2.366f,
                    dy2 = 0.65f,
                    dx3 = 2.366f,
                    dy3 = 2.314f,
                )
                // v 6.941z
                verticalLineToRelative(dy = 6.941f)
                close()
                // M 17.259 22.521
                moveTo(x = 17.259f, y = 22.521f)
                // c 0.546 0 0.806 -0.156 0.806 -0.729
                curveToRelative(
                    dx1 = 0.546f,
                    dy1 = 0.0f,
                    dx2 = 0.806f,
                    dy2 = -0.156f,
                    dx3 = 0.806f,
                    dy3 = -0.729f,
                )
                // v -6.37
                verticalLineToRelative(dy = -6.37f)
                // c 0 -0.572 -0.26 -0.728 -0.806 -0.728
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.572f,
                    dx2 = -0.26f,
                    dy2 = -0.728f,
                    dx3 = -0.806f,
                    dy3 = -0.728f,
                )
                // h -5.304
                horizontalLineToRelative(dx = -5.304f)
                // c -0.52 0 -0.78 0.156 -0.78 0.728
                curveToRelative(
                    dx1 = -0.52f,
                    dy1 = 0.0f,
                    dx2 = -0.78f,
                    dy2 = 0.156f,
                    dx3 = -0.78f,
                    dy3 = 0.728f,
                )
                // v 6.37
                verticalLineToRelative(dy = 6.37f)
                // c 0 0.572 0.26 0.729 0.78 0.729
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.572f,
                    dx2 = 0.26f,
                    dy2 = 0.729f,
                    dx3 = 0.78f,
                    dy3 = 0.729f,
                )
                // h 5.304z
                horizontalLineToRelative(dx = 5.304f)
                close()
            }
        }.build().also { _emoji1f251 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f251: ImageVector? = null
