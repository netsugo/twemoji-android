package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val EmojiE50a: ImageVector
    get() {
        val current = _emojiE50a
        if (current != null) return current

        return ImageVector.Builder(
            name = ".EmojiE50a",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M18.04 13.95 L0 26 v8 c0 1.104 0.896 2 2 2 h32 c1.104 0 2 -0.896 2 -2 v-7.989 L18.04 13.95z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 18.04 13.95
                moveTo(x = 18.04f, y = 13.95f)
                // L 0 26
                lineTo(x = 0.0f, y = 26.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // c 0 1.104 0.896 2 2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = 0.896f,
                    dy2 = 2.0f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                // h 32
                horizontalLineToRelative(dx = 32.0f)
                // c 1.104 0 2 -0.896 2 -2
                curveToRelative(
                    dx1 = 1.104f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = -0.896f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // v -7.989
                verticalLineToRelative(dy = -7.989f)
                // L 18.04 13.95z
                lineTo(x = 18.04f, y = 13.95f)
                close()
            }
            // M0 33 h36 v1 L0 34z M0 30 h36 v1 L0 31z M0 27 h36 v1 L0 28z M1.497 25 h32.998 l-1.489 -1 L2.994 24z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 0 33
                moveTo(x = 0.0f, y = 33.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // L 0 34z
                lineTo(x = 0.0f, y = 34.0f)
                close()
                // M 0 30
                moveTo(x = 0.0f, y = 30.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // L 0 31z
                lineTo(x = 0.0f, y = 31.0f)
                close()
                // M 0 27
                moveTo(x = 0.0f, y = 27.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // L 0 28z
                lineTo(x = 0.0f, y = 28.0f)
                close()
                // M 1.497 25
                moveTo(x = 1.497f, y = 25.0f)
                // h 32.998
                horizontalLineToRelative(dx = 32.998f)
                // l -1.489 -1
                lineToRelative(dx = -1.489f, dy = -1.0f)
                // L 2.994 24z
                lineTo(x = 2.994f, y = 24.0f)
                close()
            }
            // M18 0 C10.82 0 5 1.343 5 3 v33 h26 V3 c0 -1.657 -5.82 -3 -13 -3z
            path(
                fill = SolidColor(Color(0xFFE1E8ED)),
            ) {
                // M 18 0
                moveTo(x = 18.0f, y = 0.0f)
                // C 10.82 0 5 1.343 5 3
                curveTo(
                    x1 = 10.82f,
                    y1 = 0.0f,
                    x2 = 5.0f,
                    y2 = 1.343f,
                    x3 = 5.0f,
                    y3 = 3.0f,
                )
                // v 33
                verticalLineToRelative(dy = 33.0f)
                // h 26
                horizontalLineToRelative(dx = 26.0f)
                // V 3
                verticalLineTo(y = 3.0f)
                // c 0 -1.657 -5.82 -3 -13 -3z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.657f,
                    dx2 = -5.82f,
                    dy2 = -3.0f,
                    dx3 = -13.0f,
                    dy3 = -3.0f,
                )
                close()
            }
            // M18 13 c7.18 0 13 1.344 13 3 v-2 c0 -1.657 -5.82 -3 -13 -3 S5 12.343 5 14 v2 c0 -1.656 5.82 -3 13 -3z M18 25 c7.18 0 13 1.344 13 3 v-2 c0 -1.656 -5.82 -3 -13 -3 S5 24.344 5 26 v2 c0 -1.656 5.82 -3 13 -3z M18 31 c7.18 0 13 1.344 13 3 v-2 c0 -1.656 -5.82 -3 -13 -3 S5 30.344 5 32 v2 c0 -1.656 5.82 -3 13 -3z M18 7 c7.18 0 13 1.344 13 3 L31 8 c0 -1.657 -5.82 -3 -13 -3 S5 6.343 5 8 v2 c0 -1.656 5.82 -3 13 -3z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 18 13
                moveTo(x = 18.0f, y = 13.0f)
                // c 7.18 0 13 1.344 13 3
                curveToRelative(
                    dx1 = 7.18f,
                    dy1 = 0.0f,
                    dx2 = 13.0f,
                    dy2 = 1.344f,
                    dx3 = 13.0f,
                    dy3 = 3.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // c 0 -1.657 -5.82 -3 -13 -3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.657f,
                    dx2 = -5.82f,
                    dy2 = -3.0f,
                    dx3 = -13.0f,
                    dy3 = -3.0f,
                )
                // S 5 12.343 5 14
                reflectiveCurveTo(
                    x1 = 5.0f,
                    y1 = 12.343f,
                    x2 = 5.0f,
                    y2 = 14.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // c 0 -1.656 5.82 -3 13 -3z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.656f,
                    dx2 = 5.82f,
                    dy2 = -3.0f,
                    dx3 = 13.0f,
                    dy3 = -3.0f,
                )
                close()
                // M 18 25
                moveTo(x = 18.0f, y = 25.0f)
                // c 7.18 0 13 1.344 13 3
                curveToRelative(
                    dx1 = 7.18f,
                    dy1 = 0.0f,
                    dx2 = 13.0f,
                    dy2 = 1.344f,
                    dx3 = 13.0f,
                    dy3 = 3.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // c 0 -1.656 -5.82 -3 -13 -3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.656f,
                    dx2 = -5.82f,
                    dy2 = -3.0f,
                    dx3 = -13.0f,
                    dy3 = -3.0f,
                )
                // S 5 24.344 5 26
                reflectiveCurveTo(
                    x1 = 5.0f,
                    y1 = 24.344f,
                    x2 = 5.0f,
                    y2 = 26.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // c 0 -1.656 5.82 -3 13 -3z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.656f,
                    dx2 = 5.82f,
                    dy2 = -3.0f,
                    dx3 = 13.0f,
                    dy3 = -3.0f,
                )
                close()
                // M 18 31
                moveTo(x = 18.0f, y = 31.0f)
                // c 7.18 0 13 1.344 13 3
                curveToRelative(
                    dx1 = 7.18f,
                    dy1 = 0.0f,
                    dx2 = 13.0f,
                    dy2 = 1.344f,
                    dx3 = 13.0f,
                    dy3 = 3.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // c 0 -1.656 -5.82 -3 -13 -3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.656f,
                    dx2 = -5.82f,
                    dy2 = -3.0f,
                    dx3 = -13.0f,
                    dy3 = -3.0f,
                )
                // S 5 30.344 5 32
                reflectiveCurveTo(
                    x1 = 5.0f,
                    y1 = 30.344f,
                    x2 = 5.0f,
                    y2 = 32.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // c 0 -1.656 5.82 -3 13 -3z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.656f,
                    dx2 = 5.82f,
                    dy2 = -3.0f,
                    dx3 = 13.0f,
                    dy3 = -3.0f,
                )
                close()
                // M 18 7
                moveTo(x = 18.0f, y = 7.0f)
                // c 7.18 0 13 1.344 13 3
                curveToRelative(
                    dx1 = 7.18f,
                    dy1 = 0.0f,
                    dx2 = 13.0f,
                    dy2 = 1.344f,
                    dx3 = 13.0f,
                    dy3 = 3.0f,
                )
                // L 31 8
                lineTo(x = 31.0f, y = 8.0f)
                // c 0 -1.657 -5.82 -3 -13 -3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.657f,
                    dx2 = -5.82f,
                    dy2 = -3.0f,
                    dx3 = -13.0f,
                    dy3 = -3.0f,
                )
                // S 5 6.343 5 8
                reflectiveCurveTo(
                    x1 = 5.0f,
                    y1 = 6.343f,
                    x2 = 5.0f,
                    y2 = 8.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // c 0 -1.656 5.82 -3 13 -3z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.656f,
                    dx2 = 5.82f,
                    dy2 = -3.0f,
                    dx3 = 13.0f,
                    dy3 = -3.0f,
                )
                close()
            }
            // M14 0.146 L14 36 h2 L16 0.039 c-0.685 0.024 -1.354 0.059 -2 0.107z M8 1.084 L8 36 h2 L10 0.639 c-0.732 0.132 -1.406 0.28 -2 0.445z M20 0.039 L20 36 h2 L22 0.146 c-0.646 -0.048 -1.315 -0.083 -2 -0.107z M26 0.639 L26 36 h2 L28 1.084 c-0.594 -0.165 -1.269 -0.313 -2 -0.445z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 14 0.146
                moveTo(x = 14.0f, y = 0.146f)
                // L 14 36
                lineTo(x = 14.0f, y = 36.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // L 16 0.039
                lineTo(x = 16.0f, y = 0.039f)
                // c -0.685 0.024 -1.354 0.059 -2 0.107z
                curveToRelative(
                    dx1 = -0.685f,
                    dy1 = 0.024f,
                    dx2 = -1.354f,
                    dy2 = 0.059f,
                    dx3 = -2.0f,
                    dy3 = 0.107f,
                )
                close()
                // M 8 1.084
                moveTo(x = 8.0f, y = 1.084f)
                // L 8 36
                lineTo(x = 8.0f, y = 36.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // L 10 0.639
                lineTo(x = 10.0f, y = 0.639f)
                // c -0.732 0.132 -1.406 0.28 -2 0.445z
                curveToRelative(
                    dx1 = -0.732f,
                    dy1 = 0.132f,
                    dx2 = -1.406f,
                    dy2 = 0.28f,
                    dx3 = -2.0f,
                    dy3 = 0.445f,
                )
                close()
                // M 20 0.039
                moveTo(x = 20.0f, y = 0.039f)
                // L 20 36
                lineTo(x = 20.0f, y = 36.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // L 22 0.146
                lineTo(x = 22.0f, y = 0.146f)
                // c -0.646 -0.048 -1.315 -0.083 -2 -0.107z
                curveToRelative(
                    dx1 = -0.646f,
                    dy1 = -0.048f,
                    dx2 = -1.315f,
                    dy2 = -0.083f,
                    dx3 = -2.0f,
                    dy3 = -0.107f,
                )
                close()
                // M 26 0.639
                moveTo(x = 26.0f, y = 0.639f)
                // L 26 36
                lineTo(x = 26.0f, y = 36.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // L 28 1.084
                lineTo(x = 28.0f, y = 1.084f)
                // c -0.594 -0.165 -1.269 -0.313 -2 -0.445z
                curveToRelative(
                    dx1 = -0.594f,
                    dy1 = -0.165f,
                    dx2 = -1.269f,
                    dy2 = -0.313f,
                    dx3 = -2.0f,
                    dy3 = -0.445f,
                )
                close()
            }
            // M18 19 c7.18 0 13 1.344 13 3 v-2 c0 -1.657 -5.82 -3 -13 -3 S5 18.343 5 20 v2 c0 -1.656 5.82 -3 13 -3z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 18 19
                moveTo(x = 18.0f, y = 19.0f)
                // c 7.18 0 13 1.344 13 3
                curveToRelative(
                    dx1 = 7.18f,
                    dy1 = 0.0f,
                    dx2 = 13.0f,
                    dy2 = 1.344f,
                    dx3 = 13.0f,
                    dy3 = 3.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // c 0 -1.657 -5.82 -3 -13 -3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.657f,
                    dx2 = -5.82f,
                    dy2 = -3.0f,
                    dx3 = -13.0f,
                    dy3 = -3.0f,
                )
                // S 5 18.343 5 20
                reflectiveCurveTo(
                    x1 = 5.0f,
                    y1 = 18.343f,
                    x2 = 5.0f,
                    y2 = 20.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // c 0 -1.656 5.82 -3 13 -3z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.656f,
                    dx2 = 5.82f,
                    dy2 = -3.0f,
                    dx3 = 13.0f,
                    dy3 = -3.0f,
                )
                close()
            }
            // M11.13 5.583 h-0.708 c-0.576 0 -0.815 -0.42 -0.815 -0.828 0 -0.419 0.3 -0.827 0.815 -0.827 h1.703 c0.516 0 0.804 0.372 0.804 0.851 v6.825 c0 0.6 -0.384 0.935 -0.899 0.935 s-0.899 -0.335 -0.899 -0.935 L11.131 5.583z M14.01 7.73 c0 -1.955 0.756 -4.414 3.179 -4.414 s3.178 2.459 3.178 4.414 c0 1.955 -0.755 4.414 -3.178 4.414 S14.01 9.685 14.01 7.73z M18.495 7.73 c0 -0.912 -0.084 -2.783 -1.307 -2.783 -1.224 0 -1.308 1.871 -1.308 2.783 0 0.852 0.084 2.782 1.308 2.782 1.223 0.001 1.307 -1.93 1.307 -2.782z M27.087 6.758 c0 1.811 -1.835 4.353 -3.046 5.481 -0.096 0.096 -0.24 0.192 -0.384 0.288 -0.132 0.084 -0.264 0.084 -0.36 0.084 -0.335 0 -0.852 -0.444 -0.852 -0.875 0 -0.168 0.108 -0.312 0.252 -0.492 0.48 -0.588 1.26 -1.356 1.655 -1.919 l-0.023 -0.024 c-0.216 0.096 -0.492 0.144 -0.756 0.144 -1.439 0 -2.507 -1.271 -2.507 -2.687 0 -1.559 1.235 -2.974 3.011 -2.974 1.847 0 3.01 1.379 3.01 2.974z M25.216 6.758 c0 -0.671 -0.419 -1.247 -1.139 -1.247 -0.684 0 -1.14 0.552 -1.14 1.247 0 0.636 0.384 1.248 1.14 1.248 0.684 -0.001 1.139 -0.541 1.139 -1.248z
            path(
                fill = SolidColor(Color(0xFFBE1931)),
            ) {
                // M 11.13 5.583
                moveTo(x = 11.13f, y = 5.583f)
                // h -0.708
                horizontalLineToRelative(dx = -0.708f)
                // c -0.576 0 -0.815 -0.42 -0.815 -0.828
                curveToRelative(
                    dx1 = -0.576f,
                    dy1 = 0.0f,
                    dx2 = -0.815f,
                    dy2 = -0.42f,
                    dx3 = -0.815f,
                    dy3 = -0.828f,
                )
                // c 0 -0.419 0.3 -0.827 0.815 -0.827
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.419f,
                    dx2 = 0.3f,
                    dy2 = -0.827f,
                    dx3 = 0.815f,
                    dy3 = -0.827f,
                )
                // h 1.703
                horizontalLineToRelative(dx = 1.703f)
                // c 0.516 0 0.804 0.372 0.804 0.851
                curveToRelative(
                    dx1 = 0.516f,
                    dy1 = 0.0f,
                    dx2 = 0.804f,
                    dy2 = 0.372f,
                    dx3 = 0.804f,
                    dy3 = 0.851f,
                )
                // v 6.825
                verticalLineToRelative(dy = 6.825f)
                // c 0 0.6 -0.384 0.935 -0.899 0.935
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.6f,
                    dx2 = -0.384f,
                    dy2 = 0.935f,
                    dx3 = -0.899f,
                    dy3 = 0.935f,
                )
                // s -0.899 -0.335 -0.899 -0.935
                reflectiveCurveToRelative(
                    dx1 = -0.899f,
                    dy1 = -0.335f,
                    dx2 = -0.899f,
                    dy2 = -0.935f,
                )
                // L 11.131 5.583z
                lineTo(x = 11.131f, y = 5.583f)
                close()
                // M 14.01 7.73
                moveTo(x = 14.01f, y = 7.73f)
                // c 0 -1.955 0.756 -4.414 3.179 -4.414
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.955f,
                    dx2 = 0.756f,
                    dy2 = -4.414f,
                    dx3 = 3.179f,
                    dy3 = -4.414f,
                )
                // s 3.178 2.459 3.178 4.414
                reflectiveCurveToRelative(
                    dx1 = 3.178f,
                    dy1 = 2.459f,
                    dx2 = 3.178f,
                    dy2 = 4.414f,
                )
                // c 0 1.955 -0.755 4.414 -3.178 4.414
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.955f,
                    dx2 = -0.755f,
                    dy2 = 4.414f,
                    dx3 = -3.178f,
                    dy3 = 4.414f,
                )
                // S 14.01 9.685 14.01 7.73z
                reflectiveCurveTo(
                    x1 = 14.01f,
                    y1 = 9.685f,
                    x2 = 14.01f,
                    y2 = 7.73f,
                )
                close()
                // M 18.495 7.73
                moveTo(x = 18.495f, y = 7.73f)
                // c 0 -0.912 -0.084 -2.783 -1.307 -2.783
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.912f,
                    dx2 = -0.084f,
                    dy2 = -2.783f,
                    dx3 = -1.307f,
                    dy3 = -2.783f,
                )
                // c -1.224 0 -1.308 1.871 -1.308 2.783
                curveToRelative(
                    dx1 = -1.224f,
                    dy1 = 0.0f,
                    dx2 = -1.308f,
                    dy2 = 1.871f,
                    dx3 = -1.308f,
                    dy3 = 2.783f,
                )
                // c 0 0.852 0.084 2.782 1.308 2.782
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.852f,
                    dx2 = 0.084f,
                    dy2 = 2.782f,
                    dx3 = 1.308f,
                    dy3 = 2.782f,
                )
                // c 1.223 0.001 1.307 -1.93 1.307 -2.782z
                curveToRelative(
                    dx1 = 1.223f,
                    dy1 = 0.001f,
                    dx2 = 1.307f,
                    dy2 = -1.93f,
                    dx3 = 1.307f,
                    dy3 = -2.782f,
                )
                close()
                // M 27.087 6.758
                moveTo(x = 27.087f, y = 6.758f)
                // c 0 1.811 -1.835 4.353 -3.046 5.481
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.811f,
                    dx2 = -1.835f,
                    dy2 = 4.353f,
                    dx3 = -3.046f,
                    dy3 = 5.481f,
                )
                // c -0.096 0.096 -0.24 0.192 -0.384 0.288
                curveToRelative(
                    dx1 = -0.096f,
                    dy1 = 0.096f,
                    dx2 = -0.24f,
                    dy2 = 0.192f,
                    dx3 = -0.384f,
                    dy3 = 0.288f,
                )
                // c -0.132 0.084 -0.264 0.084 -0.36 0.084
                curveToRelative(
                    dx1 = -0.132f,
                    dy1 = 0.084f,
                    dx2 = -0.264f,
                    dy2 = 0.084f,
                    dx3 = -0.36f,
                    dy3 = 0.084f,
                )
                // c -0.335 0 -0.852 -0.444 -0.852 -0.875
                curveToRelative(
                    dx1 = -0.335f,
                    dy1 = 0.0f,
                    dx2 = -0.852f,
                    dy2 = -0.444f,
                    dx3 = -0.852f,
                    dy3 = -0.875f,
                )
                // c 0 -0.168 0.108 -0.312 0.252 -0.492
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.168f,
                    dx2 = 0.108f,
                    dy2 = -0.312f,
                    dx3 = 0.252f,
                    dy3 = -0.492f,
                )
                // c 0.48 -0.588 1.26 -1.356 1.655 -1.919
                curveToRelative(
                    dx1 = 0.48f,
                    dy1 = -0.588f,
                    dx2 = 1.26f,
                    dy2 = -1.356f,
                    dx3 = 1.655f,
                    dy3 = -1.919f,
                )
                // l -0.023 -0.024
                lineToRelative(dx = -0.023f, dy = -0.024f)
                // c -0.216 0.096 -0.492 0.144 -0.756 0.144
                curveToRelative(
                    dx1 = -0.216f,
                    dy1 = 0.096f,
                    dx2 = -0.492f,
                    dy2 = 0.144f,
                    dx3 = -0.756f,
                    dy3 = 0.144f,
                )
                // c -1.439 0 -2.507 -1.271 -2.507 -2.687
                curveToRelative(
                    dx1 = -1.439f,
                    dy1 = 0.0f,
                    dx2 = -2.507f,
                    dy2 = -1.271f,
                    dx3 = -2.507f,
                    dy3 = -2.687f,
                )
                // c 0 -1.559 1.235 -2.974 3.011 -2.974
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.559f,
                    dx2 = 1.235f,
                    dy2 = -2.974f,
                    dx3 = 3.011f,
                    dy3 = -2.974f,
                )
                // c 1.847 0 3.01 1.379 3.01 2.974z
                curveToRelative(
                    dx1 = 1.847f,
                    dy1 = 0.0f,
                    dx2 = 3.01f,
                    dy2 = 1.379f,
                    dx3 = 3.01f,
                    dy3 = 2.974f,
                )
                close()
                // M 25.216 6.758
                moveTo(x = 25.216f, y = 6.758f)
                // c 0 -0.671 -0.419 -1.247 -1.139 -1.247
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.671f,
                    dx2 = -0.419f,
                    dy2 = -1.247f,
                    dx3 = -1.139f,
                    dy3 = -1.247f,
                )
                // c -0.684 0 -1.14 0.552 -1.14 1.247
                curveToRelative(
                    dx1 = -0.684f,
                    dy1 = 0.0f,
                    dx2 = -1.14f,
                    dy2 = 0.552f,
                    dx3 = -1.14f,
                    dy3 = 1.247f,
                )
                // c 0 0.636 0.384 1.248 1.14 1.248
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.636f,
                    dx2 = 0.384f,
                    dy2 = 1.248f,
                    dx3 = 1.14f,
                    dy3 = 1.248f,
                )
                // c 0.684 -0.001 1.139 -0.541 1.139 -1.248z
                curveToRelative(
                    dx1 = 0.684f,
                    dy1 = -0.001f,
                    dx2 = 1.139f,
                    dy2 = -0.541f,
                    dx3 = 1.139f,
                    dy3 = -1.248f,
                )
                close()
            }
        }.build().also { _emojiE50a = it }
    }

@Suppress("ObjectPropertyName")
private var _emojiE50a: ImageVector? = null
