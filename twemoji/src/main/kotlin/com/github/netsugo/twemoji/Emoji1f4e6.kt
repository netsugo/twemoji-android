package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f4e6: ImageVector
    get() {
        val current = _emoji1f4e6
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f4e6",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M4 11 v12.375 c0 2.042 1.093 2.484 1.093 2.484 l11.574 9.099 C18.489 36.39 18 33.375 18 33.375 V22 L4 11z
            path(
                fill = SolidColor(Color(0xFF662113)),
            ) {
                // M 4 11
                moveTo(x = 4.0f, y = 11.0f)
                // v 12.375
                verticalLineToRelative(dy = 12.375f)
                // c 0 2.042 1.093 2.484 1.093 2.484
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.042f,
                    dx2 = 1.093f,
                    dy2 = 2.484f,
                    dx3 = 1.093f,
                    dy3 = 2.484f,
                )
                // l 11.574 9.099
                lineToRelative(dx = 11.574f, dy = 9.099f)
                // C 18.489 36.39 18 33.375 18 33.375
                curveTo(
                    x1 = 18.489f,
                    y1 = 36.39f,
                    x2 = 18.0f,
                    y2 = 33.375f,
                    x3 = 18.0f,
                    y3 = 33.375f,
                )
                // V 22
                verticalLineTo(y = 22.0f)
                // L 4 11z
                lineTo(x = 4.0f, y = 11.0f)
                close()
            }
            // M32 11 v12.375 c0 2.042 -1.063 2.484 -1.063 2.484 s-9.767 7.667 -11.588 9.099 C17.526 36.39 18 33.375 18 33.375 V22 l14 -11z
            path(
                fill = SolidColor(Color(0xFFC1694F)),
            ) {
                // M 32 11
                moveTo(x = 32.0f, y = 11.0f)
                // v 12.375
                verticalLineToRelative(dy = 12.375f)
                // c 0 2.042 -1.063 2.484 -1.063 2.484
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.042f,
                    dx2 = -1.063f,
                    dy2 = 2.484f,
                    dx3 = -1.063f,
                    dy3 = 2.484f,
                )
                // s -9.767 7.667 -11.588 9.099
                reflectiveCurveToRelative(
                    dx1 = -9.767f,
                    dy1 = 7.667f,
                    dx2 = -11.588f,
                    dy2 = 9.099f,
                )
                // C 17.526 36.39 18 33.375 18 33.375
                curveTo(
                    x1 = 17.526f,
                    y1 = 36.39f,
                    x2 = 18.0f,
                    y2 = 33.375f,
                    x3 = 18.0f,
                    y3 = 33.375f,
                )
                // V 22
                verticalLineTo(y = 22.0f)
                // l 14 -11z
                lineToRelative(dx = 14.0f, dy = -11.0f)
                close()
            }
            // M19.289 0.5 c-0.753 -0.61 -1.988 -0.61 -2.742 0 L4.565 10.029 c-0.754 0.61 -0.754 1.607 0 2.216 l12.023 9.646 c0.754 0.609 1.989 0.609 2.743 0 l12.104 -9.73 c0.754 -0.609 0.754 -1.606 0 -2.216 L19.289 0.5z
            path(
                fill = SolidColor(Color(0xFFD99E82)),
            ) {
                // M 19.289 0.5
                moveTo(x = 19.289f, y = 0.5f)
                // c -0.753 -0.61 -1.988 -0.61 -2.742 0
                curveToRelative(
                    dx1 = -0.753f,
                    dy1 = -0.61f,
                    dx2 = -1.988f,
                    dy2 = -0.61f,
                    dx3 = -2.742f,
                    dy3 = 0.0f,
                )
                // L 4.565 10.029
                lineTo(x = 4.565f, y = 10.029f)
                // c -0.754 0.61 -0.754 1.607 0 2.216
                curveToRelative(
                    dx1 = -0.754f,
                    dy1 = 0.61f,
                    dx2 = -0.754f,
                    dy2 = 1.607f,
                    dx3 = 0.0f,
                    dy3 = 2.216f,
                )
                // l 12.023 9.646
                lineToRelative(dx = 12.023f, dy = 9.646f)
                // c 0.754 0.609 1.989 0.609 2.743 0
                curveToRelative(
                    dx1 = 0.754f,
                    dy1 = 0.609f,
                    dx2 = 1.989f,
                    dy2 = 0.609f,
                    dx3 = 2.743f,
                    dy3 = 0.0f,
                )
                // l 12.104 -9.73
                lineToRelative(dx = 12.104f, dy = -9.73f)
                // c 0.754 -0.609 0.754 -1.606 0 -2.216
                curveToRelative(
                    dx1 = 0.754f,
                    dy1 = -0.609f,
                    dx2 = 0.754f,
                    dy2 = -1.606f,
                    dx3 = 0.0f,
                    dy3 = -2.216f,
                )
                // L 19.289 0.5z
                lineTo(x = 19.289f, y = 0.5f)
                close()
            }
            // M18 35.75 c-0.552 0 -1 -0.482 -1 -1.078 V21.745 c0 -0.596 0.448 -1.078 1 -1.078 0.553 0 1 0.482 1 1.078 v12.927 c0 0.596 -0.447 1.078 -1 1.078z
            path(
                fill = SolidColor(Color(0xFFD99E82)),
            ) {
                // M 18 35.75
                moveTo(x = 18.0f, y = 35.75f)
                // c -0.552 0 -1 -0.482 -1 -1.078
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.482f,
                    dx3 = -1.0f,
                    dy3 = -1.078f,
                )
                // V 21.745
                verticalLineTo(y = 21.745f)
                // c 0 -0.596 0.448 -1.078 1 -1.078
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.596f,
                    dx2 = 0.448f,
                    dy2 = -1.078f,
                    dx3 = 1.0f,
                    dy3 = -1.078f,
                )
                // c 0.553 0 1 0.482 1 1.078
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.482f,
                    dx3 = 1.0f,
                    dy3 = 1.078f,
                )
                // v 12.927
                verticalLineToRelative(dy = 12.927f)
                // c 0 0.596 -0.447 1.078 -1 1.078z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.596f,
                    dx2 = -0.447f,
                    dy2 = 1.078f,
                    dx3 = -1.0f,
                    dy3 = 1.078f,
                )
                close()
            }
            // M28 18.836 c0 1.104 0.104 1.646 -1 2.442 l-2.469 1.878 c-1.104 0.797 -1.531 0.113 -1.531 -0.992 v-2.961 c0 -0.193 -0.026 -0.4 -0.278 -0.608 C20.144 16.47 10.134 8.519 8.31 7.051 l4.625 -3.678 c1.266 0.926 10.753 8.252 14.722 11.377 0.197 0.156 0.343 0.328 0.343 0.516 v3.57z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 28 18.836
                moveTo(x = 28.0f, y = 18.836f)
                // c 0 1.104 0.104 1.646 -1 2.442
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = 0.104f,
                    dy2 = 1.646f,
                    dx3 = -1.0f,
                    dy3 = 2.442f,
                )
                // l -2.469 1.878
                lineToRelative(dx = -2.469f, dy = 1.878f)
                // c -1.104 0.797 -1.531 0.113 -1.531 -0.992
                curveToRelative(
                    dx1 = -1.104f,
                    dy1 = 0.797f,
                    dx2 = -1.531f,
                    dy2 = 0.113f,
                    dx3 = -1.531f,
                    dy3 = -0.992f,
                )
                // v -2.961
                verticalLineToRelative(dy = -2.961f)
                // c 0 -0.193 -0.026 -0.4 -0.278 -0.608
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.193f,
                    dx2 = -0.026f,
                    dy2 = -0.4f,
                    dx3 = -0.278f,
                    dy3 = -0.608f,
                )
                // C 20.144 16.47 10.134 8.519 8.31 7.051
                curveTo(
                    x1 = 20.144f,
                    y1 = 16.47f,
                    x2 = 10.134f,
                    y2 = 8.519f,
                    x3 = 8.31f,
                    y3 = 7.051f,
                )
                // l 4.625 -3.678
                lineToRelative(dx = 4.625f, dy = -3.678f)
                // c 1.266 0.926 10.753 8.252 14.722 11.377
                curveToRelative(
                    dx1 = 1.266f,
                    dy1 = 0.926f,
                    dx2 = 10.753f,
                    dy2 = 8.252f,
                    dx3 = 14.722f,
                    dy3 = 11.377f,
                )
                // c 0.197 0.156 0.343 0.328 0.343 0.516
                curveToRelative(
                    dx1 = 0.197f,
                    dy1 = 0.156f,
                    dx2 = 0.343f,
                    dy2 = 0.328f,
                    dx3 = 0.343f,
                    dy3 = 0.516f,
                )
                // v 3.57z
                verticalLineToRelative(dy = 3.57f)
                close()
            }
            // M27.656 14.75 C23.688 11.625 14.201 4.299 12.935 3.373 l-1.721 1.368 -2.904 2.31 c1.825 1.468 11.834 9.419 14.412 11.544 0.151 0.125 0.217 0.25 0.248 0.371 L27.903 15 c-0.06 -0.087 -0.146 -0.171 -0.247 -0.25z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 27.656 14.75
                moveTo(x = 27.656f, y = 14.75f)
                // C 23.688 11.625 14.201 4.299 12.935 3.373
                curveTo(
                    x1 = 23.688f,
                    y1 = 11.625f,
                    x2 = 14.201f,
                    y2 = 4.299f,
                    x3 = 12.935f,
                    y3 = 3.373f,
                )
                // l -1.721 1.368
                lineToRelative(dx = -1.721f, dy = 1.368f)
                // l -2.904 2.31
                lineToRelative(dx = -2.904f, dy = 2.31f)
                // c 1.825 1.468 11.834 9.419 14.412 11.544
                curveToRelative(
                    dx1 = 1.825f,
                    dy1 = 1.468f,
                    dx2 = 11.834f,
                    dy2 = 9.419f,
                    dx3 = 14.412f,
                    dy3 = 11.544f,
                )
                // c 0.151 0.125 0.217 0.25 0.248 0.371
                curveToRelative(
                    dx1 = 0.151f,
                    dy1 = 0.125f,
                    dx2 = 0.217f,
                    dy2 = 0.25f,
                    dx3 = 0.248f,
                    dy3 = 0.371f,
                )
                // L 27.903 15
                lineTo(x = 27.903f, y = 15.0f)
                // c -0.06 -0.087 -0.146 -0.171 -0.247 -0.25z
                curveToRelative(
                    dx1 = -0.06f,
                    dy1 = -0.087f,
                    dx2 = -0.146f,
                    dy2 = -0.171f,
                    dx3 = -0.247f,
                    dy3 = -0.25f,
                )
                close()
            }
            // M28 18.836 v-3.57 c0 -0.188 -0.146 -0.359 -0.344 -0.516 -3.968 -3.125 -13.455 -10.451 -14.721 -11.377 l-2.073 1.649 c3.393 2.669 12.481 9.681 14.86 11.573 0.256 0.204 0.278 0.415 0.278 0.608 v4.836 l1 -0.761 c1.104 -0.797 1 -1.338 1 -2.442z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 28 18.836
                moveTo(x = 28.0f, y = 18.836f)
                // v -3.57
                verticalLineToRelative(dy = -3.57f)
                // c 0 -0.188 -0.146 -0.359 -0.344 -0.516
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.188f,
                    dx2 = -0.146f,
                    dy2 = -0.359f,
                    dx3 = -0.344f,
                    dy3 = -0.516f,
                )
                // c -3.968 -3.125 -13.455 -10.451 -14.721 -11.377
                curveToRelative(
                    dx1 = -3.968f,
                    dy1 = -3.125f,
                    dx2 = -13.455f,
                    dy2 = -10.451f,
                    dx3 = -14.721f,
                    dy3 = -11.377f,
                )
                // l -2.073 1.649
                lineToRelative(dx = -2.073f, dy = 1.649f)
                // c 3.393 2.669 12.481 9.681 14.86 11.573
                curveToRelative(
                    dx1 = 3.393f,
                    dy1 = 2.669f,
                    dx2 = 12.481f,
                    dy2 = 9.681f,
                    dx3 = 14.86f,
                    dy3 = 11.573f,
                )
                // c 0.256 0.204 0.278 0.415 0.278 0.608
                curveToRelative(
                    dx1 = 0.256f,
                    dy1 = 0.204f,
                    dx2 = 0.278f,
                    dy2 = 0.415f,
                    dx3 = 0.278f,
                    dy3 = 0.608f,
                )
                // v 4.836
                verticalLineToRelative(dy = 4.836f)
                // l 1 -0.761
                lineToRelative(dx = 1.0f, dy = -0.761f)
                // c 1.104 -0.797 1 -1.338 1 -2.442z
                curveToRelative(
                    dx1 = 1.104f,
                    dy1 = -0.797f,
                    dx2 = 1.0f,
                    dy2 = -1.338f,
                    dx3 = 1.0f,
                    dy3 = -2.442f,
                )
                close()
            }
            // M27.656 14.75 C23.688 11.625 14.201 4.299 12.935 3.373 l-2.073 1.649 c3.393 2.669 12.481 9.681 14.86 11.573 0.037 0.029 0.06 0.059 0.087 0.088 L27.903 15 c-0.06 -0.087 -0.146 -0.171 -0.247 -0.25z
            path(
                fill = SolidColor(Color(0xFFE1E8ED)),
            ) {
                // M 27.656 14.75
                moveTo(x = 27.656f, y = 14.75f)
                // C 23.688 11.625 14.201 4.299 12.935 3.373
                curveTo(
                    x1 = 23.688f,
                    y1 = 11.625f,
                    x2 = 14.201f,
                    y2 = 4.299f,
                    x3 = 12.935f,
                    y3 = 3.373f,
                )
                // l -2.073 1.649
                lineToRelative(dx = -2.073f, dy = 1.649f)
                // c 3.393 2.669 12.481 9.681 14.86 11.573
                curveToRelative(
                    dx1 = 3.393f,
                    dy1 = 2.669f,
                    dx2 = 12.481f,
                    dy2 = 9.681f,
                    dx3 = 14.86f,
                    dy3 = 11.573f,
                )
                // c 0.037 0.029 0.06 0.059 0.087 0.088
                curveToRelative(
                    dx1 = 0.037f,
                    dy1 = 0.029f,
                    dx2 = 0.06f,
                    dy2 = 0.059f,
                    dx3 = 0.087f,
                    dy3 = 0.088f,
                )
                // L 27.903 15
                lineTo(x = 27.903f, y = 15.0f)
                // c -0.06 -0.087 -0.146 -0.171 -0.247 -0.25z
                curveToRelative(
                    dx1 = -0.06f,
                    dy1 = -0.087f,
                    dx2 = -0.146f,
                    dy2 = -0.171f,
                    dx3 = -0.247f,
                    dy3 = -0.25f,
                )
                close()
            }
        }.build().also { _emoji1f4e6 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f4e6: ImageVector? = null
