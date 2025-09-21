package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f6f4: ImageVector
    get() {
        val current = _emoji1f6f4
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f6f4",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M4.5 31.5 m-4.5 0 a4.5 4.5 0 1 1 9 0 a4.5 4.5 0 1 1 -9 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 4.5 31.5
                moveTo(x = 4.5f, y = 31.5f)
                // m -4.5 0
                moveToRelative(dx = -4.5f, dy = 0.0f)
                // a 4.5 4.5 0 1 1 9 0
                arcToRelative(
                    a = 4.5f,
                    b = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 9.0f,
                    dy1 = 0.0f,
                )
                // a 4.5 4.5 0 1 1 -9 0
                arcToRelative(
                    a = 4.5f,
                    b = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -9.0f,
                    dy1 = 0.0f,
                )
            }
            // M4.5 31.5 m-3 0 a3 3 0 1 1 6 0 a3 3 0 1 1 -6 0
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 4.5 31.5
                moveTo(x = 4.5f, y = 31.5f)
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
            // M31.5 31.5 m-4.5 0 a4.5 4.5 0 1 1 9 0 a4.5 4.5 0 1 1 -9 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 31.5 31.5
                moveTo(x = 31.5f, y = 31.5f)
                // m -4.5 0
                moveToRelative(dx = -4.5f, dy = 0.0f)
                // a 4.5 4.5 0 1 1 9 0
                arcToRelative(
                    a = 4.5f,
                    b = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 9.0f,
                    dy1 = 0.0f,
                )
                // a 4.5 4.5 0 1 1 -9 0
                arcToRelative(
                    a = 4.5f,
                    b = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -9.0f,
                    dy1 = 0.0f,
                )
            }
            // M31.5 31.5 m-3 0 a3 3 0 1 1 6 0 a3 3 0 1 1 -6 0
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 31.5 31.5
                moveTo(x = 31.5f, y = 31.5f)
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
            // M31.5 33 h-20 c-0.825 0 -1.5 -0.675 -1.5 -1.5 s0.675 -1.5 1.5 -1.5 h20 c0.825 0 1.5 0.675 1.5 1.5 s-0.675 1.5 -1.5 1.5z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 31.5 33
                moveTo(x = 31.5f, y = 33.0f)
                // h -20
                horizontalLineToRelative(dx = -20.0f)
                // c -0.825 0 -1.5 -0.675 -1.5 -1.5
                curveToRelative(
                    dx1 = -0.825f,
                    dy1 = 0.0f,
                    dx2 = -1.5f,
                    dy2 = -0.675f,
                    dx3 = -1.5f,
                    dy3 = -1.5f,
                )
                // s 0.675 -1.5 1.5 -1.5
                reflectiveCurveToRelative(
                    dx1 = 0.675f,
                    dy1 = -1.5f,
                    dx2 = 1.5f,
                    dy2 = -1.5f,
                )
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // c 0.825 0 1.5 0.675 1.5 1.5
                curveToRelative(
                    dx1 = 0.825f,
                    dy1 = 0.0f,
                    dx2 = 1.5f,
                    dy2 = 0.675f,
                    dx3 = 1.5f,
                    dy3 = 1.5f,
                )
                // s -0.675 1.5 -1.5 1.5z
                reflectiveCurveToRelative(
                    dx1 = -0.675f,
                    dy1 = 1.5f,
                    dx2 = -1.5f,
                    dy2 = 1.5f,
                )
                close()
            }
            // M26.012 31.746 c-0.003 -0.082 -0.012 -0.163 -0.012 -0.246 0 -3.038 2.462 -5.5 5.5 -5.5 1.21 0 2.326 0.396 3.234 1.058 l0.89 -1.205 c-1.158 -0.847 -2.58 -1.353 -4.125 -1.353 -3.866 0 -7 3.134 -7 7 0 0.102 0.011 0.201 0.015 0.302 l1.498 -0.056z M5.629 26.117 c2.495 0.52 4.369 2.73 4.371 5.378 l3.5 0.003 c-0.001 -4.34 -3.074 -7.962 -7.163 -8.81 -0.232 1.13 -0.476 2.31 -0.708 3.429z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 26.012 31.746
                moveTo(x = 26.012f, y = 31.746f)
                // c -0.003 -0.082 -0.012 -0.163 -0.012 -0.246
                curveToRelative(
                    dx1 = -0.003f,
                    dy1 = -0.082f,
                    dx2 = -0.012f,
                    dy2 = -0.163f,
                    dx3 = -0.012f,
                    dy3 = -0.246f,
                )
                // c 0 -3.038 2.462 -5.5 5.5 -5.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.038f,
                    dx2 = 2.462f,
                    dy2 = -5.5f,
                    dx3 = 5.5f,
                    dy3 = -5.5f,
                )
                // c 1.21 0 2.326 0.396 3.234 1.058
                curveToRelative(
                    dx1 = 1.21f,
                    dy1 = 0.0f,
                    dx2 = 2.326f,
                    dy2 = 0.396f,
                    dx3 = 3.234f,
                    dy3 = 1.058f,
                )
                // l 0.89 -1.205
                lineToRelative(dx = 0.89f, dy = -1.205f)
                // c -1.158 -0.847 -2.58 -1.353 -4.125 -1.353
                curveToRelative(
                    dx1 = -1.158f,
                    dy1 = -0.847f,
                    dx2 = -2.58f,
                    dy2 = -1.353f,
                    dx3 = -4.125f,
                    dy3 = -1.353f,
                )
                // c -3.866 0 -7 3.134 -7 7
                curveToRelative(
                    dx1 = -3.866f,
                    dy1 = 0.0f,
                    dx2 = -7.0f,
                    dy2 = 3.134f,
                    dx3 = -7.0f,
                    dy3 = 7.0f,
                )
                // c 0 0.102 0.011 0.201 0.015 0.302
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.102f,
                    dx2 = 0.011f,
                    dy2 = 0.201f,
                    dx3 = 0.015f,
                    dy3 = 0.302f,
                )
                // l 1.498 -0.056z
                lineToRelative(dx = 1.498f, dy = -0.056f)
                close()
                // M 5.629 26.117
                moveTo(x = 5.629f, y = 26.117f)
                // c 2.495 0.52 4.369 2.73 4.371 5.378
                curveToRelative(
                    dx1 = 2.495f,
                    dy1 = 0.52f,
                    dx2 = 4.369f,
                    dy2 = 2.73f,
                    dx3 = 4.371f,
                    dy3 = 5.378f,
                )
                // l 3.5 0.003
                lineToRelative(dx = 3.5f, dy = 0.003f)
                // c -0.001 -4.34 -3.074 -7.962 -7.163 -8.81
                curveToRelative(
                    dx1 = -0.001f,
                    dy1 = -4.34f,
                    dx2 = -3.074f,
                    dy2 = -7.962f,
                    dx3 = -7.163f,
                    dy3 = -8.81f,
                )
                // c -0.232 1.13 -0.476 2.31 -0.708 3.429z
                curveToRelative(
                    dx1 = -0.232f,
                    dy1 = 1.13f,
                    dx2 = -0.476f,
                    dy2 = 2.31f,
                    dx3 = -0.708f,
                    dy3 = 3.429f,
                )
                close()
            }
            // M4.395 31.998 c-0.269 -0.057 -0.442 -0.324 -0.385 -0.593 l6.002 -28.238 c0.057 -0.269 0.324 -0.442 0.593 -0.385 0.269 0.057 0.442 0.324 0.385 0.593 L4.988 31.613 c-0.057 0.269 -0.324 0.442 -0.593 0.385z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 4.395 31.998
                moveTo(x = 4.395f, y = 31.998f)
                // c -0.269 -0.057 -0.442 -0.324 -0.385 -0.593
                curveToRelative(
                    dx1 = -0.269f,
                    dy1 = -0.057f,
                    dx2 = -0.442f,
                    dy2 = -0.324f,
                    dx3 = -0.385f,
                    dy3 = -0.593f,
                )
                // l 6.002 -28.238
                lineToRelative(dx = 6.002f, dy = -28.238f)
                // c 0.057 -0.269 0.324 -0.442 0.593 -0.385
                curveToRelative(
                    dx1 = 0.057f,
                    dy1 = -0.269f,
                    dx2 = 0.324f,
                    dy2 = -0.442f,
                    dx3 = 0.593f,
                    dy3 = -0.385f,
                )
                // c 0.269 0.057 0.442 0.324 0.385 0.593
                curveToRelative(
                    dx1 = 0.269f,
                    dy1 = 0.057f,
                    dx2 = 0.442f,
                    dy2 = 0.324f,
                    dx3 = 0.385f,
                    dy3 = 0.593f,
                )
                // L 4.988 31.613
                lineTo(x = 4.988f, y = 31.613f)
                // c -0.057 0.269 -0.324 0.442 -0.593 0.385z
                curveToRelative(
                    dx1 = -0.057f,
                    dy1 = 0.269f,
                    dx2 = -0.324f,
                    dy2 = 0.442f,
                    dx3 = -0.593f,
                    dy3 = 0.385f,
                )
                close()
            }
            // M6.123 26.261 l-0.978 -0.208 c-0.538 -0.114 -0.885 -0.648 -0.77 -1.186 l1.247 -5.869 c0.114 -0.538 0.648 -0.885 1.186 -0.77 l0.978 0.208 c0.538 0.114 0.885 0.648 0.77 1.186 L7.31 25.49 c-0.115 0.538 -0.649 0.885 -1.187 0.771z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 6.123 26.261
                moveTo(x = 6.123f, y = 26.261f)
                // l -0.978 -0.208
                lineToRelative(dx = -0.978f, dy = -0.208f)
                // c -0.538 -0.114 -0.885 -0.648 -0.77 -1.186
                curveToRelative(
                    dx1 = -0.538f,
                    dy1 = -0.114f,
                    dx2 = -0.885f,
                    dy2 = -0.648f,
                    dx3 = -0.77f,
                    dy3 = -1.186f,
                )
                // l 1.247 -5.869
                lineToRelative(dx = 1.247f, dy = -5.869f)
                // c 0.114 -0.538 0.648 -0.885 1.186 -0.77
                curveToRelative(
                    dx1 = 0.114f,
                    dy1 = -0.538f,
                    dx2 = 0.648f,
                    dy2 = -0.885f,
                    dx3 = 1.186f,
                    dy3 = -0.77f,
                )
                // l 0.978 0.208
                lineToRelative(dx = 0.978f, dy = 0.208f)
                // c 0.538 0.114 0.885 0.648 0.77 1.186
                curveToRelative(
                    dx1 = 0.538f,
                    dy1 = 0.114f,
                    dx2 = 0.885f,
                    dy2 = 0.648f,
                    dx3 = 0.77f,
                    dy3 = 1.186f,
                )
                // L 7.31 25.49
                lineTo(x = 7.31f, y = 25.49f)
                // c -0.115 0.538 -0.649 0.885 -1.187 0.771z
                curveToRelative(
                    dx1 = -0.115f,
                    dy1 = 0.538f,
                    dx2 = -0.649f,
                    dy2 = 0.885f,
                    dx3 = -1.187f,
                    dy3 = 0.771f,
                )
                close()
            }
            // M9.3 4.324 l-1.957 -0.416 c-0.807 -0.172 -1.327 -0.972 -1.155 -1.779 0.171 -0.807 0.972 -1.327 1.779 -1.156 l1.956 0.416 c0.807 0.172 1.327 0.972 1.155 1.779 -0.171 0.807 -0.972 1.327 -1.778 1.156z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 9.3 4.324
                moveTo(x = 9.3f, y = 4.324f)
                // l -1.957 -0.416
                lineToRelative(dx = -1.957f, dy = -0.416f)
                // c -0.807 -0.172 -1.327 -0.972 -1.155 -1.779
                curveToRelative(
                    dx1 = -0.807f,
                    dy1 = -0.172f,
                    dx2 = -1.327f,
                    dy2 = -0.972f,
                    dx3 = -1.155f,
                    dy3 = -1.779f,
                )
                // c 0.171 -0.807 0.972 -1.327 1.779 -1.156
                curveToRelative(
                    dx1 = 0.171f,
                    dy1 = -0.807f,
                    dx2 = 0.972f,
                    dy2 = -1.327f,
                    dx3 = 1.779f,
                    dy3 = -1.156f,
                )
                // l 1.956 0.416
                lineToRelative(dx = 1.956f, dy = 0.416f)
                // c 0.807 0.172 1.327 0.972 1.155 1.779
                curveToRelative(
                    dx1 = 0.807f,
                    dy1 = 0.172f,
                    dx2 = 1.327f,
                    dy2 = 0.972f,
                    dx3 = 1.155f,
                    dy3 = 1.779f,
                )
                // c -0.171 0.807 -0.972 1.327 -1.778 1.156z
                curveToRelative(
                    dx1 = -0.171f,
                    dy1 = 0.807f,
                    dx2 = -0.972f,
                    dy2 = 1.327f,
                    dx3 = -1.778f,
                    dy3 = 1.156f,
                )
                close()
            }
            // M10.84 1.675 c-0.807 -0.172 -1.608 0.348 -1.779 1.155 L7.71 9.188 c-0.114 0.538 0.232 1.072 0.77 1.186 l0.978 0.208 c0.538 0.114 1.072 -0.232 1.186 -0.77 l1.351 -6.358 c0.172 -0.807 -0.348 -1.607 -1.155 -1.779z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 10.84 1.675
                moveTo(x = 10.84f, y = 1.675f)
                // c -0.807 -0.172 -1.608 0.348 -1.779 1.155
                curveToRelative(
                    dx1 = -0.807f,
                    dy1 = -0.172f,
                    dx2 = -1.608f,
                    dy2 = 0.348f,
                    dx3 = -1.779f,
                    dy3 = 1.155f,
                )
                // L 7.71 9.188
                lineTo(x = 7.71f, y = 9.188f)
                // c -0.114 0.538 0.232 1.072 0.77 1.186
                curveToRelative(
                    dx1 = -0.114f,
                    dy1 = 0.538f,
                    dx2 = 0.232f,
                    dy2 = 1.072f,
                    dx3 = 0.77f,
                    dy3 = 1.186f,
                )
                // l 0.978 0.208
                lineToRelative(dx = 0.978f, dy = 0.208f)
                // c 0.538 0.114 1.072 -0.232 1.186 -0.77
                curveToRelative(
                    dx1 = 0.538f,
                    dy1 = 0.114f,
                    dx2 = 1.072f,
                    dy2 = -0.232f,
                    dx3 = 1.186f,
                    dy3 = -0.77f,
                )
                // l 1.351 -6.358
                lineToRelative(dx = 1.351f, dy = -6.358f)
                // c 0.172 -0.807 -0.348 -1.607 -1.155 -1.779z
                curveToRelative(
                    dx1 = 0.172f,
                    dy1 = -0.807f,
                    dx2 = -0.348f,
                    dy2 = -1.607f,
                    dx3 = -1.155f,
                    dy3 = -1.779f,
                )
                close()
            }
            // M14.105 5.345 l-2.934 -0.624 c-0.807 -0.172 -1.327 -0.972 -1.155 -1.779 0.172 -0.807 0.972 -1.327 1.779 -1.155 l2.934 0.624 c0.807 0.172 1.327 0.972 1.155 1.779 -0.171 0.807 -0.972 1.327 -1.779 1.155z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 14.105 5.345
                moveTo(x = 14.105f, y = 5.345f)
                // l -2.934 -0.624
                lineToRelative(dx = -2.934f, dy = -0.624f)
                // c -0.807 -0.172 -1.327 -0.972 -1.155 -1.779
                curveToRelative(
                    dx1 = -0.807f,
                    dy1 = -0.172f,
                    dx2 = -1.327f,
                    dy2 = -0.972f,
                    dx3 = -1.155f,
                    dy3 = -1.779f,
                )
                // c 0.172 -0.807 0.972 -1.327 1.779 -1.155
                curveToRelative(
                    dx1 = 0.172f,
                    dy1 = -0.807f,
                    dx2 = 0.972f,
                    dy2 = -1.327f,
                    dx3 = 1.779f,
                    dy3 = -1.155f,
                )
                // l 2.934 0.624
                lineToRelative(dx = 2.934f, dy = 0.624f)
                // c 0.807 0.172 1.327 0.972 1.155 1.779
                curveToRelative(
                    dx1 = 0.807f,
                    dy1 = 0.172f,
                    dx2 = 1.327f,
                    dy2 = 0.972f,
                    dx3 = 1.155f,
                    dy3 = 1.779f,
                )
                // c -0.171 0.807 -0.972 1.327 -1.779 1.155z
                curveToRelative(
                    dx1 = -0.171f,
                    dy1 = 0.807f,
                    dx2 = -0.972f,
                    dy2 = 1.327f,
                    dx3 = -1.779f,
                    dy3 = 1.155f,
                )
                close()
            }
            // M15.903 4.194 c-0.172 0.81 -0.969 1.328 -1.779 1.155 -0.81 -0.172 -1.328 -0.969 -1.155 -1.779 0.172 -0.81 0.969 -1.328 1.779 -1.155 s1.328 0.968 1.155 1.779z
            path(
                fill = SolidColor(Color(0xFFEA596E)),
            ) {
                // M 15.903 4.194
                moveTo(x = 15.903f, y = 4.194f)
                // c -0.172 0.81 -0.969 1.328 -1.779 1.155
                curveToRelative(
                    dx1 = -0.172f,
                    dy1 = 0.81f,
                    dx2 = -0.969f,
                    dy2 = 1.328f,
                    dx3 = -1.779f,
                    dy3 = 1.155f,
                )
                // c -0.81 -0.172 -1.328 -0.969 -1.155 -1.779
                curveToRelative(
                    dx1 = -0.81f,
                    dy1 = -0.172f,
                    dx2 = -1.328f,
                    dy2 = -0.969f,
                    dx3 = -1.155f,
                    dy3 = -1.779f,
                )
                // c 0.172 -0.81 0.969 -1.328 1.779 -1.155
                curveToRelative(
                    dx1 = 0.172f,
                    dy1 = -0.81f,
                    dx2 = 0.969f,
                    dy2 = -1.328f,
                    dx3 = 1.779f,
                    dy3 = -1.155f,
                )
                // s 1.328 0.968 1.155 1.779z
                reflectiveCurveToRelative(
                    dx1 = 1.328f,
                    dy1 = 0.968f,
                    dx2 = 1.155f,
                    dy2 = 1.779f,
                )
                close()
            }
            // M35.19 26.46 m-0.74 0 a0.74 0.74 0 1 1 1.48 0 a0.74 0.74 0 1 1 -1.48 0
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 35.19 26.46
                moveTo(x = 35.19f, y = 26.46f)
                // m -0.74 0
                moveToRelative(dx = -0.74f, dy = 0.0f)
                // a 0.74 0.74 0 1 1 1.48 0
                arcToRelative(
                    a = 0.74f,
                    b = 0.74f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 1.48f,
                    dy1 = 0.0f,
                )
                // a 0.74 0.74 0 1 1 -1.48 0
                arcToRelative(
                    a = 0.74f,
                    b = 0.74f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -1.48f,
                    dy1 = 0.0f,
                )
            }
        }.build().also { _emoji1f6f4 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f6f4: ImageVector? = null
