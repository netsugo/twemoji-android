package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f6eb: ImageVector
    get() {
        val current = _emoji1f6eb
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f6eb",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 23 v13 H0 V23 h36z
            path(
                fill = SolidColor(Color(0xFF5D9040)),
            ) {
                // M 36 23
                moveTo(x = 36.0f, y = 23.0f)
                // v 13
                verticalLineToRelative(dy = 13.0f)
                // H 0
                horizontalLineTo(x = 0.0f)
                // V 23
                verticalLineTo(y = 23.0f)
                // h 36z
                horizontalLineToRelative(dx = 36.0f)
                close()
            }
            // M0 25 h36 v6 H0z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 0 25
                moveTo(x = 0.0f, y = 25.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // H 0z
                horizontalLineTo(x = 0.0f)
                close()
            }
            // M10 28 c0 0.553 -0.448 1 -1 1 L3 29 c-0.552 0 -1 -0.447 -1 -1 0 -0.553 0.448 -1 1 -1 h6 c0.552 0 1 0.447 1 1z M22 28 c0 0.553 -0.447 1 -1 1 h-6 c-0.552 0 -1 -0.447 -1 -1 0 -0.553 0.448 -1 1 -1 h6 c0.553 0 1 0.447 1 1z M34 28 c0 0.553 -0.447 1 -1 1 h-6 c-0.553 0 -1 -0.447 -1 -1 0 -0.553 0.447 -1 1 -1 h6 c0.553 0 1 0.447 1 1z
            path(
                fill = SolidColor(Color(0xFFF5F8FA)),
            ) {
                // M 10 28
                moveTo(x = 10.0f, y = 28.0f)
                // c 0 0.553 -0.448 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.448f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // L 3 29
                lineTo(x = 3.0f, y = 29.0f)
                // c -0.552 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // c 0 -0.553 0.448 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.553f,
                    dx2 = 0.448f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // c 0.552 0 1 0.447 1 1z
                curveToRelative(
                    dx1 = 0.552f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.447f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                close()
                // M 22 28
                moveTo(x = 22.0f, y = 28.0f)
                // c 0 0.553 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // c -0.552 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // c 0 -0.553 0.448 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.553f,
                    dx2 = 0.448f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // c 0.553 0 1 0.447 1 1z
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.447f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                close()
                // M 34 28
                moveTo(x = 34.0f, y = 28.0f)
                // c 0 0.553 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // c -0.553 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.553f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // c 0 -0.553 0.447 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.553f,
                    dx2 = 0.447f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // c 0.553 0 1 0.447 1 1z
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.447f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                close()
            }
            // M19.034 16.656 m-1.5 0 a1.5 1.5 0 1 1 3 0 a1.5 1.5 0 1 1 -3 0
            path(
                fill = SolidColor(Color(0xFF67757F)),
            ) {
                // M 19.034 16.656
                moveTo(x = 19.034f, y = 16.656f)
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
            // M28.489 13.071 m-1.5 0 a1.5 1.5 0 1 1 3 0 a1.5 1.5 0 1 1 -3 0
            path(
                fill = SolidColor(Color(0xFF67757F)),
            ) {
                // M 28.489 13.071
                moveTo(x = 28.489f, y = 13.071f)
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
            // M16.354 11.337 c1.037 1.093 8.003 -0.963 5.677 -2.258 C14.968 4.524 9.104 4.587 10.865 6.23 c1.984 1.85 3.309 3.227 5.489 5.107z
            path(
                fill = SolidColor(Color(0xFF5DADEC)),
            ) {
                // M 16.354 11.337
                moveTo(x = 16.354f, y = 11.337f)
                // c 1.037 1.093 8.003 -0.963 5.677 -2.258
                curveToRelative(
                    dx1 = 1.037f,
                    dy1 = 1.093f,
                    dx2 = 8.003f,
                    dy2 = -0.963f,
                    dx3 = 5.677f,
                    dy3 = -2.258f,
                )
                // C 14.968 4.524 9.104 4.587 10.865 6.23
                curveTo(
                    x1 = 14.968f,
                    y1 = 4.524f,
                    x2 = 9.104f,
                    y2 = 4.587f,
                    x3 = 10.865f,
                    y3 = 6.23f,
                )
                // c 1.984 1.85 3.309 3.227 5.489 5.107z
                curveToRelative(
                    dx1 = 1.984f,
                    dy1 = 1.85f,
                    dx2 = 3.309f,
                    dy2 = 3.227f,
                    dx3 = 5.489f,
                    dy3 = 5.107f,
                )
                close()
            }
            // M34.972 7.575 c0.409 1.889 -3.829 3.899 -5.718 4.308 l-17.072 3.699 c-1.889 0.409 -9.158 0.381 -9.567 -1.508 -0.437 -2.017 4.211 -4.494 6.1 -4.903 l19.058 -4.129 c1.888 -0.409 6.79 0.644 7.199 2.533z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 34.972 7.575
                moveTo(x = 34.972f, y = 7.575f)
                // c 0.409 1.889 -3.829 3.899 -5.718 4.308
                curveToRelative(
                    dx1 = 0.409f,
                    dy1 = 1.889f,
                    dx2 = -3.829f,
                    dy2 = 3.899f,
                    dx3 = -5.718f,
                    dy3 = 4.308f,
                )
                // l -17.072 3.699
                lineToRelative(dx = -17.072f, dy = 3.699f)
                // c -1.889 0.409 -9.158 0.381 -9.567 -1.508
                curveToRelative(
                    dx1 = -1.889f,
                    dy1 = 0.409f,
                    dx2 = -9.158f,
                    dy2 = 0.381f,
                    dx3 = -9.567f,
                    dy3 = -1.508f,
                )
                // c -0.437 -2.017 4.211 -4.494 6.1 -4.903
                curveToRelative(
                    dx1 = -0.437f,
                    dy1 = -2.017f,
                    dx2 = 4.211f,
                    dy2 = -4.494f,
                    dx3 = 6.1f,
                    dy3 = -4.903f,
                )
                // l 19.058 -4.129
                lineToRelative(dx = 19.058f, dy = -4.129f)
                // c 1.888 -0.409 6.79 0.644 7.199 2.533z
                curveToRelative(
                    dx1 = 1.888f,
                    dy1 = -0.409f,
                    dx2 = 6.79f,
                    dy2 = 0.644f,
                    dx3 = 7.199f,
                    dy3 = 2.533f,
                )
                close()
            }
            // M30.844 5.181 c-0.38 0.378 -0.982 0.612 -1.356 0.913 -0.545 0.438 -0.369 1.839 0.843 1.384 1.038 -0.389 1.928 -1.168 2.361 -1.768 -0.581 -0.224 -1.216 -0.403 -1.848 -0.529z
            path(
                fill = SolidColor(Color(0xFF67757F)),
            ) {
                // M 30.844 5.181
                moveTo(x = 30.844f, y = 5.181f)
                // c -0.38 0.378 -0.982 0.612 -1.356 0.913
                curveToRelative(
                    dx1 = -0.38f,
                    dy1 = 0.378f,
                    dx2 = -0.982f,
                    dy2 = 0.612f,
                    dx3 = -1.356f,
                    dy3 = 0.913f,
                )
                // c -0.545 0.438 -0.369 1.839 0.843 1.384
                curveToRelative(
                    dx1 = -0.545f,
                    dy1 = 0.438f,
                    dx2 = -0.369f,
                    dy2 = 1.839f,
                    dx3 = 0.843f,
                    dy3 = 1.384f,
                )
                // c 1.038 -0.389 1.928 -1.168 2.361 -1.768
                curveToRelative(
                    dx1 = 1.038f,
                    dy1 = -0.389f,
                    dx2 = 1.928f,
                    dy2 = -1.168f,
                    dx3 = 2.361f,
                    dy3 = -1.768f,
                )
                // c -0.581 -0.224 -1.216 -0.403 -1.848 -0.529z
                curveToRelative(
                    dx1 = -0.581f,
                    dy1 = -0.224f,
                    dx2 = -1.216f,
                    dy2 = -0.403f,
                    dx3 = -1.848f,
                    dy3 = -0.529f,
                )
                close()
            }
            // M2.586 13.7 c-0.177 -0.818 -1.325 -5.873 -1.502 -6.691 -0.532 -2.455 3.588 0.745 5.756 2.845 -1.785 0.921 -3.434 1.92 -4.254 3.846z M3.378 13.909 c0.872 -0.759 4.017 -1.382 2.407 1.013 -2.296 3.567 -4.528 3.986 -4.062 2.863 0.526 -1.265 1.045 -2.56 1.655 -3.876z M15.632 13.205 c0.492 -1.418 7.691 -2.434 6.106 -0.3 -4.55 7.068 -9.914 9.438 -8.991 7.212 1.041 -2.506 1.676 -4.307 2.885 -6.912z
            path(
                fill = SolidColor(Color(0xFF5DADEC)),
            ) {
                // M 2.586 13.7
                moveTo(x = 2.586f, y = 13.7f)
                // c -0.177 -0.818 -1.325 -5.873 -1.502 -6.691
                curveToRelative(
                    dx1 = -0.177f,
                    dy1 = -0.818f,
                    dx2 = -1.325f,
                    dy2 = -5.873f,
                    dx3 = -1.502f,
                    dy3 = -6.691f,
                )
                // c -0.532 -2.455 3.588 0.745 5.756 2.845
                curveToRelative(
                    dx1 = -0.532f,
                    dy1 = -2.455f,
                    dx2 = 3.588f,
                    dy2 = 0.745f,
                    dx3 = 5.756f,
                    dy3 = 2.845f,
                )
                // c -1.785 0.921 -3.434 1.92 -4.254 3.846z
                curveToRelative(
                    dx1 = -1.785f,
                    dy1 = 0.921f,
                    dx2 = -3.434f,
                    dy2 = 1.92f,
                    dx3 = -4.254f,
                    dy3 = 3.846f,
                )
                close()
                // M 3.378 13.909
                moveTo(x = 3.378f, y = 13.909f)
                // c 0.872 -0.759 4.017 -1.382 2.407 1.013
                curveToRelative(
                    dx1 = 0.872f,
                    dy1 = -0.759f,
                    dx2 = 4.017f,
                    dy2 = -1.382f,
                    dx3 = 2.407f,
                    dy3 = 1.013f,
                )
                // c -2.296 3.567 -4.528 3.986 -4.062 2.863
                curveToRelative(
                    dx1 = -2.296f,
                    dy1 = 3.567f,
                    dx2 = -4.528f,
                    dy2 = 3.986f,
                    dx3 = -4.062f,
                    dy3 = 2.863f,
                )
                // c 0.526 -1.265 1.045 -2.56 1.655 -3.876z
                curveToRelative(
                    dx1 = 0.526f,
                    dy1 = -1.265f,
                    dx2 = 1.045f,
                    dy2 = -2.56f,
                    dx3 = 1.655f,
                    dy3 = -3.876f,
                )
                close()
                // M 15.632 13.205
                moveTo(x = 15.632f, y = 13.205f)
                // c 0.492 -1.418 7.691 -2.434 6.106 -0.3
                curveToRelative(
                    dx1 = 0.492f,
                    dy1 = -1.418f,
                    dx2 = 7.691f,
                    dy2 = -2.434f,
                    dx3 = 6.106f,
                    dy3 = -0.3f,
                )
                // c -4.55 7.068 -9.914 9.438 -8.991 7.212
                curveToRelative(
                    dx1 = -4.55f,
                    dy1 = 7.068f,
                    dx2 = -9.914f,
                    dy2 = 9.438f,
                    dx3 = -8.991f,
                    dy3 = 7.212f,
                )
                // c 1.041 -2.506 1.676 -4.307 2.885 -6.912z
                curveToRelative(
                    dx1 = 1.041f,
                    dy1 = -2.506f,
                    dx2 = 1.676f,
                    dy2 = -4.307f,
                    dx3 = 2.885f,
                    dy3 = -6.912f,
                )
                close()
            }
            // M26.942 8.292 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFF9AAAB4)),
            ) {
                // M 26.942 8.292
                moveTo(x = 26.942f, y = 8.292f)
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
            // M24.01 8.927 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFF9AAAB4)),
            ) {
                // M 24.01 8.927
                moveTo(x = 24.01f, y = 8.927f)
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
            // M21.078 9.563 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFF9AAAB4)),
            ) {
                // M 21.078 9.563
                moveTo(x = 21.078f, y = 9.563f)
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
            // M18.146 10.198 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFF9AAAB4)),
            ) {
                // M 18.146 10.198
                moveTo(x = 18.146f, y = 10.198f)
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
            // M15.214 10.833 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFF9AAAB4)),
            ) {
                // M 15.214 10.833
                moveTo(x = 15.214f, y = 10.833f)
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
            // M12.282 11.468 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFF9AAAB4)),
            ) {
                // M 12.282 11.468
                moveTo(x = 12.282f, y = 11.468f)
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
        }.build().also { _emoji1f6eb = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f6eb: ImageVector? = null
