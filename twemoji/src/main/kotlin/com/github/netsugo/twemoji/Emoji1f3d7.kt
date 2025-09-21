package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f3d7: ImageVector
    get() {
        val current = _emoji1f3d7
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f3d7",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M28.25 8.513 c0 -0.145 -0.117 -0.263 -0.263 -0.263 h-0.475 c-0.145 0 -0.263 0.118 -0.263 0.263 v11.475 c0 0.145 0.117 0.263 0.263 0.263 h0.475 c0.145 0 0.263 -0.117 0.263 -0.263 V8.513z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 28.25 8.513
                moveTo(x = 28.25f, y = 8.513f)
                // c 0 -0.145 -0.117 -0.263 -0.263 -0.263
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.145f,
                    dx2 = -0.117f,
                    dy2 = -0.263f,
                    dx3 = -0.263f,
                    dy3 = -0.263f,
                )
                // h -0.475
                horizontalLineToRelative(dx = -0.475f)
                // c -0.145 0 -0.263 0.118 -0.263 0.263
                curveToRelative(
                    dx1 = -0.145f,
                    dy1 = 0.0f,
                    dx2 = -0.263f,
                    dy2 = 0.118f,
                    dx3 = -0.263f,
                    dy3 = 0.263f,
                )
                // v 11.475
                verticalLineToRelative(dy = 11.475f)
                // c 0 0.145 0.117 0.263 0.263 0.263
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.145f,
                    dx2 = 0.117f,
                    dy2 = 0.263f,
                    dx3 = 0.263f,
                    dy3 = 0.263f,
                )
                // h 0.475
                horizontalLineToRelative(dx = 0.475f)
                // c 0.145 0 0.263 -0.117 0.263 -0.263
                curveToRelative(
                    dx1 = 0.145f,
                    dy1 = 0.0f,
                    dx2 = 0.263f,
                    dy2 = -0.117f,
                    dx3 = 0.263f,
                    dy3 = -0.263f,
                )
                // V 8.513z
                verticalLineTo(y = 8.513f)
                close()
            }
            // M27.75 19.75 m-1.5 0 a1.5 1.5 0 1 1 3 0 a1.5 1.5 0 1 1 -3 0
            path(
                fill = SolidColor(Color(0xFFF19020)),
            ) {
                // M 27.75 19.75
                moveTo(x = 27.75f, y = 19.75f)
                // m -1.5 0
                moveToRelative(dx = -1.5f, dy = 0.0f)
                // a 1.5 1.5 0 1 1 3 0
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = 0.0f,
                )
                // a 1.5 1.5 0 1 1 -3 0
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = 0.0f,
                )
            }
            // M27.75 22.25 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFF19020)),
            ) {
                // M 27.75 22.25
                moveTo(x = 27.75f, y = 22.25f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // a 1 1 0 1 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 1 1 -2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
            }
            // M33.25 8.25 h-4.129 L9.946 0.29 9.944 0.289 h-0.001 c-0.016 -0.007 -0.032 -0.005 -0.047 -0.01 C9.849 0.265 9.802 0.25 9.75 0.25 h-0.002 c-0.066 0 -0.13 0.014 -0.19 0.038 -0.045 0.02 -0.084 0.05 -0.122 0.082 -0.012 0.009 -0.026 0.014 -0.037 0.025 -0.047 0.046 -0.085 0.102 -0.11 0.164 L9.289 0.56 c-0.004 0.009 -0.003 0.02 -0.006 0.029 l-5.541 7.81 c-0.003 0.004 -0.003 0.01 -0.006 0.014 -0.285 0.176 -0.486 0.477 -0.486 0.837 v2 c0 0.552 0.448 1 1 1 h1.495 L2.031 34 L0.25 34 v2 h18.958 v-2 h-1.74 l-3.713 -21.75 L33.25 12.25 c0.553 0 1 -0.448 1 -1 v-2 c0 -0.552 -0.447 -1 -1 -1z M11.481 12.25 L9.75 13.639 8.02 12.25 h3.461z M9.75 21.3 l3.667 2.404 -3.667 2 -3.667 -2 L9.75 21.3z M6.111 22.01 l0.474 -2.784 1.866 1.223 -2.34 1.561z M11.049 20.449 l1.87 -1.225 0.477 2.789 -2.347 -1.564z M9.75 19.583 l-2.828 -1.885 2.828 -2.322 2.828 2.322 -2.828 1.885z M7.187 15.696 l0.362 -2.127 1.131 0.928 -1.493 1.199z M10.82 14.498 l1.132 -0.929 0.364 2.13 -1.496 -1.201z M5.073 8.25 L9.25 2.362 L9.25 6.25 h-2 c-0.552 0 -1 0.448 -1 1 v1 L5.073 8.25z M5.603 24.988 l2.73 1.489 -3.29 1.794 0.56 -3.283z M15.443 34 L4.067 34 l0.686 -4.024 L9.75 27.25 l5.006 2.731 0.687 4.019z M13.903 24.985 l0.562 3.291 -3.298 -1.799 2.736 -1.492z M13.25 8.25 v-1 c0 -0.552 -0.448 -1 -1 -1 h-2 L10.25 1.499 L26.513 8.25 L13.25 8.25z M15.25 11.25 h-1.16 v-2 h1.16 v2z M18.25 11.25 h-2 v-2 h2 v2z M21.25 11.25 h-2 v-2 h2 v2z M24.25 11.25 h-2 v-2 h2 v2z M27.25 11.25 h-2 v-2 h2 v2z M30.25 11.25 h-2 v-2 h2 v2z M33.25 10.75 c0 0.276 -0.224 0.5 -0.5 0.5 h-1.5 v-2 h1.5 c0.276 0 0.5 0.224 0.5 0.5 v1z
            path(
                fill = SolidColor(Color(0xFFBD2032)),
            ) {
                // M 33.25 8.25
                moveTo(x = 33.25f, y = 8.25f)
                // h -4.129
                horizontalLineToRelative(dx = -4.129f)
                // L 9.946 0.29
                lineTo(x = 9.946f, y = 0.29f)
                // L 9.944 0.289
                lineTo(x = 9.944f, y = 0.289f)
                // h -0.001
                horizontalLineToRelative(dx = -0.001f)
                // c -0.016 -0.007 -0.032 -0.005 -0.047 -0.01
                curveToRelative(
                    dx1 = -0.016f,
                    dy1 = -0.007f,
                    dx2 = -0.032f,
                    dy2 = -0.005f,
                    dx3 = -0.047f,
                    dy3 = -0.01f,
                )
                // C 9.849 0.265 9.802 0.25 9.75 0.25
                curveTo(
                    x1 = 9.849f,
                    y1 = 0.265f,
                    x2 = 9.802f,
                    y2 = 0.25f,
                    x3 = 9.75f,
                    y3 = 0.25f,
                )
                // h -0.002
                horizontalLineToRelative(dx = -0.002f)
                // c -0.066 0 -0.13 0.014 -0.19 0.038
                curveToRelative(
                    dx1 = -0.066f,
                    dy1 = 0.0f,
                    dx2 = -0.13f,
                    dy2 = 0.014f,
                    dx3 = -0.19f,
                    dy3 = 0.038f,
                )
                // c -0.045 0.02 -0.084 0.05 -0.122 0.082
                curveToRelative(
                    dx1 = -0.045f,
                    dy1 = 0.02f,
                    dx2 = -0.084f,
                    dy2 = 0.05f,
                    dx3 = -0.122f,
                    dy3 = 0.082f,
                )
                // c -0.012 0.009 -0.026 0.014 -0.037 0.025
                curveToRelative(
                    dx1 = -0.012f,
                    dy1 = 0.009f,
                    dx2 = -0.026f,
                    dy2 = 0.014f,
                    dx3 = -0.037f,
                    dy3 = 0.025f,
                )
                // c -0.047 0.046 -0.085 0.102 -0.11 0.164
                curveToRelative(
                    dx1 = -0.047f,
                    dy1 = 0.046f,
                    dx2 = -0.085f,
                    dy2 = 0.102f,
                    dx3 = -0.11f,
                    dy3 = 0.164f,
                )
                // L 9.289 0.56
                lineTo(x = 9.289f, y = 0.56f)
                // c -0.004 0.009 -0.003 0.02 -0.006 0.029
                curveToRelative(
                    dx1 = -0.004f,
                    dy1 = 0.009f,
                    dx2 = -0.003f,
                    dy2 = 0.02f,
                    dx3 = -0.006f,
                    dy3 = 0.029f,
                )
                // l -5.541 7.81
                lineToRelative(dx = -5.541f, dy = 7.81f)
                // c -0.003 0.004 -0.003 0.01 -0.006 0.014
                curveToRelative(
                    dx1 = -0.003f,
                    dy1 = 0.004f,
                    dx2 = -0.003f,
                    dy2 = 0.01f,
                    dx3 = -0.006f,
                    dy3 = 0.014f,
                )
                // c -0.285 0.176 -0.486 0.477 -0.486 0.837
                curveToRelative(
                    dx1 = -0.285f,
                    dy1 = 0.176f,
                    dx2 = -0.486f,
                    dy2 = 0.477f,
                    dx3 = -0.486f,
                    dy3 = 0.837f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // c 0 0.552 0.448 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = 0.448f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // h 1.495
                horizontalLineToRelative(dx = 1.495f)
                // L 2.031 34
                lineTo(x = 2.031f, y = 34.0f)
                // L 0.25 34
                lineTo(x = 0.25f, y = 34.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 18.958
                horizontalLineToRelative(dx = 18.958f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -1.74
                horizontalLineToRelative(dx = -1.74f)
                // l -3.713 -21.75
                lineToRelative(dx = -3.713f, dy = -21.75f)
                // L 33.25 12.25
                lineTo(x = 33.25f, y = 12.25f)
                // c 0.553 0 1 -0.448 1 -1
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -0.448f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // c 0 -0.552 -0.447 -1 -1 -1z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = -0.447f,
                    dy2 = -1.0f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                close()
                // M 11.481 12.25
                moveTo(x = 11.481f, y = 12.25f)
                // L 9.75 13.639
                lineTo(x = 9.75f, y = 13.639f)
                // L 8.02 12.25
                lineTo(x = 8.02f, y = 12.25f)
                // h 3.461z
                horizontalLineToRelative(dx = 3.461f)
                close()
                // M 9.75 21.3
                moveTo(x = 9.75f, y = 21.3f)
                // l 3.667 2.404
                lineToRelative(dx = 3.667f, dy = 2.404f)
                // l -3.667 2
                lineToRelative(dx = -3.667f, dy = 2.0f)
                // l -3.667 -2
                lineToRelative(dx = -3.667f, dy = -2.0f)
                // L 9.75 21.3z
                lineTo(x = 9.75f, y = 21.3f)
                close()
                // M 6.111 22.01
                moveTo(x = 6.111f, y = 22.01f)
                // l 0.474 -2.784
                lineToRelative(dx = 0.474f, dy = -2.784f)
                // l 1.866 1.223
                lineToRelative(dx = 1.866f, dy = 1.223f)
                // l -2.34 1.561z
                lineToRelative(dx = -2.34f, dy = 1.561f)
                close()
                // M 11.049 20.449
                moveTo(x = 11.049f, y = 20.449f)
                // l 1.87 -1.225
                lineToRelative(dx = 1.87f, dy = -1.225f)
                // l 0.477 2.789
                lineToRelative(dx = 0.477f, dy = 2.789f)
                // l -2.347 -1.564z
                lineToRelative(dx = -2.347f, dy = -1.564f)
                close()
                // M 9.75 19.583
                moveTo(x = 9.75f, y = 19.583f)
                // l -2.828 -1.885
                lineToRelative(dx = -2.828f, dy = -1.885f)
                // l 2.828 -2.322
                lineToRelative(dx = 2.828f, dy = -2.322f)
                // l 2.828 2.322
                lineToRelative(dx = 2.828f, dy = 2.322f)
                // l -2.828 1.885z
                lineToRelative(dx = -2.828f, dy = 1.885f)
                close()
                // M 7.187 15.696
                moveTo(x = 7.187f, y = 15.696f)
                // l 0.362 -2.127
                lineToRelative(dx = 0.362f, dy = -2.127f)
                // l 1.131 0.928
                lineToRelative(dx = 1.131f, dy = 0.928f)
                // l -1.493 1.199z
                lineToRelative(dx = -1.493f, dy = 1.199f)
                close()
                // M 10.82 14.498
                moveTo(x = 10.82f, y = 14.498f)
                // l 1.132 -0.929
                lineToRelative(dx = 1.132f, dy = -0.929f)
                // l 0.364 2.13
                lineToRelative(dx = 0.364f, dy = 2.13f)
                // l -1.496 -1.201z
                lineToRelative(dx = -1.496f, dy = -1.201f)
                close()
                // M 5.073 8.25
                moveTo(x = 5.073f, y = 8.25f)
                // L 9.25 2.362
                lineTo(x = 9.25f, y = 2.362f)
                // L 9.25 6.25
                lineTo(x = 9.25f, y = 6.25f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // c -0.552 0 -1 0.448 -1 1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = 0.448f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // L 5.073 8.25z
                lineTo(x = 5.073f, y = 8.25f)
                close()
                // M 5.603 24.988
                moveTo(x = 5.603f, y = 24.988f)
                // l 2.73 1.489
                lineToRelative(dx = 2.73f, dy = 1.489f)
                // l -3.29 1.794
                lineToRelative(dx = -3.29f, dy = 1.794f)
                // l 0.56 -3.283z
                lineToRelative(dx = 0.56f, dy = -3.283f)
                close()
                // M 15.443 34
                moveTo(x = 15.443f, y = 34.0f)
                // L 4.067 34
                lineTo(x = 4.067f, y = 34.0f)
                // l 0.686 -4.024
                lineToRelative(dx = 0.686f, dy = -4.024f)
                // L 9.75 27.25
                lineTo(x = 9.75f, y = 27.25f)
                // l 5.006 2.731
                lineToRelative(dx = 5.006f, dy = 2.731f)
                // l 0.687 4.019z
                lineToRelative(dx = 0.687f, dy = 4.019f)
                close()
                // M 13.903 24.985
                moveTo(x = 13.903f, y = 24.985f)
                // l 0.562 3.291
                lineToRelative(dx = 0.562f, dy = 3.291f)
                // l -3.298 -1.799
                lineToRelative(dx = -3.298f, dy = -1.799f)
                // l 2.736 -1.492z
                lineToRelative(dx = 2.736f, dy = -1.492f)
                close()
                // M 13.25 8.25
                moveTo(x = 13.25f, y = 8.25f)
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // c 0 -0.552 -0.448 -1 -1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = -0.448f,
                    dy2 = -1.0f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // L 10.25 1.499
                lineTo(x = 10.25f, y = 1.499f)
                // L 26.513 8.25
                lineTo(x = 26.513f, y = 8.25f)
                // L 13.25 8.25z
                lineTo(x = 13.25f, y = 8.25f)
                close()
                // M 15.25 11.25
                moveTo(x = 15.25f, y = 11.25f)
                // h -1.16
                horizontalLineToRelative(dx = -1.16f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 1.16
                horizontalLineToRelative(dx = 1.16f)
                // v 2z
                verticalLineToRelative(dy = 2.0f)
                close()
                // M 18.25 11.25
                moveTo(x = 18.25f, y = 11.25f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2z
                verticalLineToRelative(dy = 2.0f)
                close()
                // M 21.25 11.25
                moveTo(x = 21.25f, y = 11.25f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2z
                verticalLineToRelative(dy = 2.0f)
                close()
                // M 24.25 11.25
                moveTo(x = 24.25f, y = 11.25f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2z
                verticalLineToRelative(dy = 2.0f)
                close()
                // M 27.25 11.25
                moveTo(x = 27.25f, y = 11.25f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2z
                verticalLineToRelative(dy = 2.0f)
                close()
                // M 30.25 11.25
                moveTo(x = 30.25f, y = 11.25f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2z
                verticalLineToRelative(dy = 2.0f)
                close()
                // M 33.25 10.75
                moveTo(x = 33.25f, y = 10.75f)
                // c 0 0.276 -0.224 0.5 -0.5 0.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.276f,
                    dx2 = -0.224f,
                    dy2 = 0.5f,
                    dx3 = -0.5f,
                    dy3 = 0.5f,
                )
                // h -1.5
                horizontalLineToRelative(dx = -1.5f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 1.5
                horizontalLineToRelative(dx = 1.5f)
                // c 0.276 0 0.5 0.224 0.5 0.5
                curveToRelative(
                    dx1 = 0.276f,
                    dy1 = 0.0f,
                    dx2 = 0.5f,
                    dy2 = 0.224f,
                    dx3 = 0.5f,
                    dy3 = 0.5f,
                )
                // v 1z
                verticalLineToRelative(dy = 1.0f)
                close()
            }
            // M12.25 7.25 h-2 c-0.552 0 -1 0.448 -1 1 v2 c0 0.552 0.448 1 1 1 h3 v-4 h-1z
            path(
                fill = SolidColor(Color(0xFF4B545D)),
            ) {
                // M 12.25 7.25
                moveTo(x = 12.25f, y = 7.25f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // c -0.552 0 -1 0.448 -1 1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = 0.448f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // c 0 0.552 0.448 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = 0.448f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h -1z
                horizontalLineToRelative(dx = -1.0f)
                close()
            }
            // M11.25 7.25 h2 v4 h-2z
            path(
                fill = SolidColor(Color(0xFFCDD7DF)),
            ) {
                // M 11.25 7.25
                moveTo(x = 11.25f, y = 7.25f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // M34.844 24 v-1 H20.656 v1 h0.844 v2.469 h-0.844 v1 h14.188 v-1 H34 V24z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 34.844 24
                moveTo(x = 34.844f, y = 24.0f)
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // H 20.656
                horizontalLineTo(x = 20.656f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // h 0.844
                horizontalLineToRelative(dx = 0.844f)
                // v 2.469
                verticalLineToRelative(dy = 2.469f)
                // h -0.844
                horizontalLineToRelative(dx = -0.844f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // h 14.188
                horizontalLineToRelative(dx = 14.188f)
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // H 34
                horizontalLineTo(x = 34.0f)
                // V 24z
                verticalLineTo(y = 24.0f)
                close()
            }
        }.build().also { _emoji1f3d7 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f3d7: ImageVector? = null
