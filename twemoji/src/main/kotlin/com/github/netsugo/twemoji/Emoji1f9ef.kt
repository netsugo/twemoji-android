package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f9ef: ImageVector
    get() {
        val current = _emoji1f9ef
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f9ef",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M18 10 c-1.1 0 -2 -0.9 -2 -2 V5 c0 -1.1 0.9 -2 2 -2 s2 0.9 2 2 v3 c0 1.1 -0.9 2 -2 2z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 18 10
                moveTo(x = 18.0f, y = 10.0f)
                // c -1.1 0 -2 -0.9 -2 -2
                curveToRelative(
                    dx1 = -1.1f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -0.9f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // V 5
                verticalLineTo(y = 5.0f)
                // c 0 -1.1 0.9 -2 2 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.1f,
                    dx2 = 0.9f,
                    dy2 = -2.0f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // s 2 0.9 2 2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.9f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                )
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // c 0 1.1 -0.9 2 -2 2z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.1f,
                    dx2 = -0.9f,
                    dy2 = 2.0f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                close()
            }
            // M18 15 m-6 0 a6 6 0 1 1 12 0 a6 6 0 1 1 -12 0
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 18 15
                moveTo(x = 18.0f, y = 15.0f)
                // m -6 0
                moveToRelative(dx = -6.0f, dy = 0.0f)
                // a 6 6 0 1 1 12 0
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 12.0f,
                    dy1 = 0.0f,
                )
                // a 6 6 0 1 1 -12 0
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -12.0f,
                    dy1 = 0.0f,
                )
            }
            // M16 8 h4 v4 h-4z M22 36 h-8 c-1.1 0 -2 -0.9 -2 -2 L12 15 h12 v19 c0 1.1 -0.9 2 -2 2z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 16 8
                moveTo(x = 16.0f, y = 8.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
                // M 22 36
                moveTo(x = 22.0f, y = 36.0f)
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // c -1.1 0 -2 -0.9 -2 -2
                curveToRelative(
                    dx1 = -1.1f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -0.9f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // L 12 15
                lineTo(x = 12.0f, y = 15.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // v 19
                verticalLineToRelative(dy = 19.0f)
                // c 0 1.1 -0.9 2 -2 2z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.1f,
                    dx2 = -0.9f,
                    dy2 = 2.0f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                close()
            }
            // M9.406 35.849 l-4.492 -1.263 c-0.529 -0.149 -0.838 -0.533 -0.685 -0.853 l4.439 -9.311 c0.458 -0.96 1.278 -1.621 1.823 -1.467 l0.22 0.062 c0.545 0.153 0.9 1.144 0.791 2.202 l-1.065 10.26 c-0.038 0.353 -0.501 0.519 -1.031 0.37z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 9.406 35.849
                moveTo(x = 9.406f, y = 35.849f)
                // l -4.492 -1.263
                lineToRelative(dx = -4.492f, dy = -1.263f)
                // c -0.529 -0.149 -0.838 -0.533 -0.685 -0.853
                curveToRelative(
                    dx1 = -0.529f,
                    dy1 = -0.149f,
                    dx2 = -0.838f,
                    dy2 = -0.533f,
                    dx3 = -0.685f,
                    dy3 = -0.853f,
                )
                // l 4.439 -9.311
                lineToRelative(dx = 4.439f, dy = -9.311f)
                // c 0.458 -0.96 1.278 -1.621 1.823 -1.467
                curveToRelative(
                    dx1 = 0.458f,
                    dy1 = -0.96f,
                    dx2 = 1.278f,
                    dy2 = -1.621f,
                    dx3 = 1.823f,
                    dy3 = -1.467f,
                )
                // l 0.22 0.062
                lineToRelative(dx = 0.22f, dy = 0.062f)
                // c 0.545 0.153 0.9 1.144 0.791 2.202
                curveToRelative(
                    dx1 = 0.545f,
                    dy1 = 0.153f,
                    dx2 = 0.9f,
                    dy2 = 1.144f,
                    dx3 = 0.791f,
                    dy3 = 2.202f,
                )
                // l -1.065 10.26
                lineToRelative(dx = -1.065f, dy = 10.26f)
                // c -0.038 0.353 -0.501 0.519 -1.031 0.37z
                curveToRelative(
                    dx1 = -0.038f,
                    dy1 = 0.353f,
                    dx2 = -0.501f,
                    dy2 = 0.519f,
                    dx3 = -1.031f,
                    dy3 = 0.37f,
                )
                close()
            }
            // M26.022 2.248 l-9.848 1.736 c-0.542 0.095 -1.063 -0.27 -1.158 -0.811 -0.095 -0.542 0.27 -1.063 0.811 -1.158 L25.675 0.279 c0.542 -0.096 1.063 0.27 1.158 0.811 0.095 0.542 -0.27 1.063 -0.811 1.158z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 26.022 2.248
                moveTo(x = 26.022f, y = 2.248f)
                // l -9.848 1.736
                lineToRelative(dx = -9.848f, dy = 1.736f)
                // c -0.542 0.095 -1.063 -0.27 -1.158 -0.811
                curveToRelative(
                    dx1 = -0.542f,
                    dy1 = 0.095f,
                    dx2 = -1.063f,
                    dy2 = -0.27f,
                    dx3 = -1.158f,
                    dy3 = -0.811f,
                )
                // c -0.095 -0.542 0.27 -1.063 0.811 -1.158
                curveToRelative(
                    dx1 = -0.095f,
                    dy1 = -0.542f,
                    dx2 = 0.27f,
                    dy2 = -1.063f,
                    dx3 = 0.811f,
                    dy3 = -1.158f,
                )
                // L 25.675 0.279
                lineTo(x = 25.675f, y = 0.279f)
                // c 0.542 -0.096 1.063 0.27 1.158 0.811
                curveToRelative(
                    dx1 = 0.542f,
                    dy1 = -0.096f,
                    dx2 = 1.063f,
                    dy2 = 0.27f,
                    dx3 = 1.158f,
                    dy3 = 0.811f,
                )
                // c 0.095 0.542 -0.27 1.063 -0.811 1.158z
                curveToRelative(
                    dx1 = 0.095f,
                    dy1 = 0.542f,
                    dx2 = -0.27f,
                    dy2 = 1.063f,
                    dx3 = -0.811f,
                    dy3 = 1.158f,
                )
                close()
            }
            // M25.055 7.36 l-9.397 -3.42 c-0.517 -0.188 -0.786 -0.765 -0.598 -1.282 0.188 -0.517 0.765 -0.786 1.282 -0.598 l9.397 3.42 c0.517 0.188 0.786 0.765 0.598 1.282 -0.188 0.517 -0.765 0.786 -1.282 0.598z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 25.055 7.36
                moveTo(x = 25.055f, y = 7.36f)
                // l -9.397 -3.42
                lineToRelative(dx = -9.397f, dy = -3.42f)
                // c -0.517 -0.188 -0.786 -0.765 -0.598 -1.282
                curveToRelative(
                    dx1 = -0.517f,
                    dy1 = -0.188f,
                    dx2 = -0.786f,
                    dy2 = -0.765f,
                    dx3 = -0.598f,
                    dy3 = -1.282f,
                )
                // c 0.188 -0.517 0.765 -0.786 1.282 -0.598
                curveToRelative(
                    dx1 = 0.188f,
                    dy1 = -0.517f,
                    dx2 = 0.765f,
                    dy2 = -0.786f,
                    dx3 = 1.282f,
                    dy3 = -0.598f,
                )
                // l 9.397 3.42
                lineToRelative(dx = 9.397f, dy = 3.42f)
                // c 0.517 0.188 0.786 0.765 0.598 1.282
                curveToRelative(
                    dx1 = 0.517f,
                    dy1 = 0.188f,
                    dx2 = 0.786f,
                    dy2 = 0.765f,
                    dx3 = 0.598f,
                    dy3 = 1.282f,
                )
                // c -0.188 0.517 -0.765 0.786 -1.282 0.598z
                curveToRelative(
                    dx1 = -0.188f,
                    dy1 = 0.517f,
                    dx2 = -0.765f,
                    dy2 = 0.786f,
                    dx3 = -1.282f,
                    dy3 = 0.598f,
                )
                close()
            }
            // M10.524 24.407 c-0.042 0 -0.085 -0.004 -0.128 -0.011 -0.408 -0.07 -0.682 -0.459 -0.612 -0.867 0.726 -4.203 0.161 -6.198 -0.336 -7.958 -0.386 -1.364 -0.75 -2.653 -0.33 -4.556 C10.052 6.786 13.745 5.25 16 5.25 c0.414 0 0.75 0.336 0.75 0.75 s-0.336 0.75 -0.75 0.75 c-1.225 0 -4.586 0.824 -5.417 4.589 -0.339 1.535 -0.067 2.495 0.309 3.824 0.515 1.819 1.155 4.083 0.372 8.622 -0.064 0.364 -0.382 0.622 -0.74 0.622z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 10.524 24.407
                moveTo(x = 10.524f, y = 24.407f)
                // c -0.042 0 -0.085 -0.004 -0.128 -0.011
                curveToRelative(
                    dx1 = -0.042f,
                    dy1 = 0.0f,
                    dx2 = -0.085f,
                    dy2 = -0.004f,
                    dx3 = -0.128f,
                    dy3 = -0.011f,
                )
                // c -0.408 -0.07 -0.682 -0.459 -0.612 -0.867
                curveToRelative(
                    dx1 = -0.408f,
                    dy1 = -0.07f,
                    dx2 = -0.682f,
                    dy2 = -0.459f,
                    dx3 = -0.612f,
                    dy3 = -0.867f,
                )
                // c 0.726 -4.203 0.161 -6.198 -0.336 -7.958
                curveToRelative(
                    dx1 = 0.726f,
                    dy1 = -4.203f,
                    dx2 = 0.161f,
                    dy2 = -6.198f,
                    dx3 = -0.336f,
                    dy3 = -7.958f,
                )
                // c -0.386 -1.364 -0.75 -2.653 -0.33 -4.556
                curveToRelative(
                    dx1 = -0.386f,
                    dy1 = -1.364f,
                    dx2 = -0.75f,
                    dy2 = -2.653f,
                    dx3 = -0.33f,
                    dy3 = -4.556f,
                )
                // C 10.052 6.786 13.745 5.25 16 5.25
                curveTo(
                    x1 = 10.052f,
                    y1 = 6.786f,
                    x2 = 13.745f,
                    y2 = 5.25f,
                    x3 = 16.0f,
                    y3 = 5.25f,
                )
                // c 0.414 0 0.75 0.336 0.75 0.75
                curveToRelative(
                    dx1 = 0.414f,
                    dy1 = 0.0f,
                    dx2 = 0.75f,
                    dy2 = 0.336f,
                    dx3 = 0.75f,
                    dy3 = 0.75f,
                )
                // s -0.336 0.75 -0.75 0.75
                reflectiveCurveToRelative(
                    dx1 = -0.336f,
                    dy1 = 0.75f,
                    dx2 = -0.75f,
                    dy2 = 0.75f,
                )
                // c -1.225 0 -4.586 0.824 -5.417 4.589
                curveToRelative(
                    dx1 = -1.225f,
                    dy1 = 0.0f,
                    dx2 = -4.586f,
                    dy2 = 0.824f,
                    dx3 = -5.417f,
                    dy3 = 4.589f,
                )
                // c -0.339 1.535 -0.067 2.495 0.309 3.824
                curveToRelative(
                    dx1 = -0.339f,
                    dy1 = 1.535f,
                    dx2 = -0.067f,
                    dy2 = 2.495f,
                    dx3 = 0.309f,
                    dy3 = 3.824f,
                )
                // c 0.515 1.819 1.155 4.083 0.372 8.622
                curveToRelative(
                    dx1 = 0.515f,
                    dy1 = 1.819f,
                    dx2 = 1.155f,
                    dy2 = 4.083f,
                    dx3 = 0.372f,
                    dy3 = 8.622f,
                )
                // c -0.064 0.364 -0.382 0.622 -0.74 0.622z
                curveToRelative(
                    dx1 = -0.064f,
                    dy1 = 0.364f,
                    dx2 = -0.382f,
                    dy2 = 0.622f,
                    dx3 = -0.74f,
                    dy3 = 0.622f,
                )
                close()
            }
            // M16 7 m-3 0 a3 3 0 1 1 6 0 a3 3 0 1 1 -6 0
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 16 7
                moveTo(x = 16.0f, y = 7.0f)
                // m -3 0
                moveToRelative(dx = -3.0f, dy = 0.0f)
                // a 3 3 0 1 1 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // a 3 3 0 1 1 -6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
            }
            // M16 7 m-2 0 a2 2 0 1 1 4 0 a2 2 0 1 1 -4 0
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 16 7
                moveTo(x = 16.0f, y = 7.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
            }
            // M16.5 10 c-0.828 0 -1.5 1.567 -1.5 3.5 v22 c0 0.275 0.225 0.5 0.5 0.5 h2 c0.275 0 0.5 -0.225 0.5 -0.5 v-22 c0 -1.933 -0.672 -3.5 -1.5 -3.5z
            path(
                fill = SolidColor(Color(0xFFEA596E)),
            ) {
                // M 16.5 10
                moveTo(x = 16.5f, y = 10.0f)
                // c -0.828 0 -1.5 1.567 -1.5 3.5
                curveToRelative(
                    dx1 = -0.828f,
                    dy1 = 0.0f,
                    dx2 = -1.5f,
                    dy2 = 1.567f,
                    dx3 = -1.5f,
                    dy3 = 3.5f,
                )
                // v 22
                verticalLineToRelative(dy = 22.0f)
                // c 0 0.275 0.225 0.5 0.5 0.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.275f,
                    dx2 = 0.225f,
                    dy2 = 0.5f,
                    dx3 = 0.5f,
                    dy3 = 0.5f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // c 0.275 0 0.5 -0.225 0.5 -0.5
                curveToRelative(
                    dx1 = 0.275f,
                    dy1 = 0.0f,
                    dx2 = 0.5f,
                    dy2 = -0.225f,
                    dx3 = 0.5f,
                    dy3 = -0.5f,
                )
                // v -22
                verticalLineToRelative(dy = -22.0f)
                // c 0 -1.933 -0.672 -3.5 -1.5 -3.5z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.933f,
                    dx2 = -0.672f,
                    dy2 = -3.5f,
                    dx3 = -1.5f,
                    dy3 = -3.5f,
                )
                close()
            }
            // M20.5 18 h-5 c-0.825 0 -1.5 -0.675 -1.5 -1.5 v-2 c0 -0.825 0.675 -1.5 1.5 -1.5 h5 c0.825 0 1.5 0.675 1.5 1.5 v2 c0 0.825 -0.675 1.5 -1.5 1.5z
            path(
                fill = SolidColor(Color(0xFFF5F8FA)),
            ) {
                // M 20.5 18
                moveTo(x = 20.5f, y = 18.0f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // c -0.825 0 -1.5 -0.675 -1.5 -1.5
                curveToRelative(
                    dx1 = -0.825f,
                    dy1 = 0.0f,
                    dx2 = -1.5f,
                    dy2 = -0.675f,
                    dx3 = -1.5f,
                    dy3 = -1.5f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // c 0 -0.825 0.675 -1.5 1.5 -1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.825f,
                    dx2 = 0.675f,
                    dy2 = -1.5f,
                    dx3 = 1.5f,
                    dy3 = -1.5f,
                )
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // c 0.825 0 1.5 0.675 1.5 1.5
                curveToRelative(
                    dx1 = 0.825f,
                    dy1 = 0.0f,
                    dx2 = 1.5f,
                    dy2 = 0.675f,
                    dx3 = 1.5f,
                    dy3 = 1.5f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // c 0 0.825 -0.675 1.5 -1.5 1.5z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.825f,
                    dx2 = -0.675f,
                    dy2 = 1.5f,
                    dx3 = -1.5f,
                    dy3 = 1.5f,
                )
                close()
            }
            // M16 5 c-0.552 0 -1.052 0.224 -1.414 0.586 L16 7 l1.414 -1.414 C17.052 5.224 16.552 5 16 5z
            path(
                fill = SolidColor(Color(0xFF77B255)),
            ) {
                // M 16 5
                moveTo(x = 16.0f, y = 5.0f)
                // c -0.552 0 -1.052 0.224 -1.414 0.586
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.052f,
                    dy2 = 0.224f,
                    dx3 = -1.414f,
                    dy3 = 0.586f,
                )
                // L 16 7
                lineTo(x = 16.0f, y = 7.0f)
                // l 1.414 -1.414
                lineToRelative(dx = 1.414f, dy = -1.414f)
                // C 17.052 5.224 16.552 5 16 5z
                curveTo(
                    x1 = 17.052f,
                    y1 = 5.224f,
                    x2 = 16.552f,
                    y2 = 5.0f,
                    x3 = 16.0f,
                    y3 = 5.0f,
                )
                close()
            }
        }.build().also { _emoji1f9ef = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f9ef: ImageVector? = null
