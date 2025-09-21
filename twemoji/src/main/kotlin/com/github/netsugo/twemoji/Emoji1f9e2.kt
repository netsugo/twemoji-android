package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f9e2: ImageVector
    get() {
        val current = _emoji1f9e2
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f9e2",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M21.2087 5.9621 a0.944 1.565 92.505 1 0 0.0825 -1.8862 a0.944 1.565 92.505 1 0 -0.0825 1.8862z
            path(
                fill = SolidColor(Color(0xFF2B7BB9)),
            ) {
                // M 21.2087 5.9621
                moveTo(x = 21.2087f, y = 5.9621f)
                // a 0.944 1.565 92.505 1 0 0.0825 -1.8862
                arcToRelative(
                    a = 0.944f,
                    b = 1.565f,
                    theta = 92.505f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 0.0825f,
                    dy1 = -1.8862f,
                )
                // a 0.944 1.565 92.505 1 0 -0.0825 1.8862z
                arcToRelative(
                    a = 0.944f,
                    b = 1.565f,
                    theta = 92.505f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -0.0825f,
                    dy1 = 1.8862f,
                )
                close()
            }
            // M29.831 27.74 s3.523 1.385 5.185 0.088 c0.125 -1.17 -3.311 -2.035 -3.311 -2.035 l-1.874 1.947z M7.527 25.549 S2.271 33.375 0.77 32.031 c0 0 -0.425 -1.397 1.23 -4.218 1.656 -2.822 5.527 -2.264 5.527 -2.264z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 29.831 27.74
                moveTo(x = 29.831f, y = 27.74f)
                // s 3.523 1.385 5.185 0.088
                reflectiveCurveToRelative(
                    dx1 = 3.523f,
                    dy1 = 1.385f,
                    dx2 = 5.185f,
                    dy2 = 0.088f,
                )
                // c 0.125 -1.17 -3.311 -2.035 -3.311 -2.035
                curveToRelative(
                    dx1 = 0.125f,
                    dy1 = -1.17f,
                    dx2 = -3.311f,
                    dy2 = -2.035f,
                    dx3 = -3.311f,
                    dy3 = -2.035f,
                )
                // l -1.874 1.947z
                lineToRelative(dx = -1.874f, dy = 1.947f)
                close()
                // M 7.527 25.549
                moveTo(x = 7.527f, y = 25.549f)
                // S 2.271 33.375 0.77 32.031
                reflectiveCurveTo(
                    x1 = 2.271f,
                    y1 = 33.375f,
                    x2 = 0.77f,
                    y2 = 32.031f,
                )
                // c 0 0 -0.425 -1.397 1.23 -4.218
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -0.425f,
                    dy2 = -1.397f,
                    dx3 = 1.23f,
                    dy3 = -4.218f,
                )
                // c 1.656 -2.822 5.527 -2.264 5.527 -2.264z
                curveToRelative(
                    dx1 = 1.656f,
                    dy1 = -2.822f,
                    dx2 = 5.527f,
                    dy2 = -2.264f,
                    dx3 = 5.527f,
                    dy3 = -2.264f,
                )
                close()
            }
            // M19.766 4.82 s-8.537 0.43 -13.735 16.348 c7.494 0 16.785 0.555 16.785 0.555 s7.799 3.982 8.889 4.469 c1.089 0.487 3.311 1.637 3.311 1.637 s1.089 -5.531 0.305 -9.69 S30.79 4.997 19.766 4.82z
            path(
                fill = SolidColor(Color(0xFF1C6399)),
            ) {
                // M 19.766 4.82
                moveTo(x = 19.766f, y = 4.82f)
                // s -8.537 0.43 -13.735 16.348
                reflectiveCurveToRelative(
                    dx1 = -8.537f,
                    dy1 = 0.43f,
                    dx2 = -13.735f,
                    dy2 = 16.348f,
                )
                // c 7.494 0 16.785 0.555 16.785 0.555
                curveToRelative(
                    dx1 = 7.494f,
                    dy1 = 0.0f,
                    dx2 = 16.785f,
                    dy2 = 0.555f,
                    dx3 = 16.785f,
                    dy3 = 0.555f,
                )
                // s 7.799 3.982 8.889 4.469
                reflectiveCurveToRelative(
                    dx1 = 7.799f,
                    dy1 = 3.982f,
                    dx2 = 8.889f,
                    dy2 = 4.469f,
                )
                // c 1.089 0.487 3.311 1.637 3.311 1.637
                curveToRelative(
                    dx1 = 1.089f,
                    dy1 = 0.487f,
                    dx2 = 3.311f,
                    dy2 = 1.637f,
                    dx3 = 3.311f,
                    dy3 = 1.637f,
                )
                // s 1.089 -5.531 0.305 -9.69
                reflectiveCurveToRelative(
                    dx1 = 1.089f,
                    dy1 = -5.531f,
                    dx2 = 0.305f,
                    dy2 = -9.69f,
                )
                // S 30.79 4.997 19.766 4.82z
                reflectiveCurveTo(
                    x1 = 30.79f,
                    y1 = 4.997f,
                    x2 = 19.766f,
                    y2 = 4.82f,
                )
                close()
            }
            // M3.354 25.167 C1.521 28.209 0.138 30.988 0.77 32.031 c0 0 -0.203 -0.761 0.775 -1.633 0.892 -0.795 2.805 -1.522 6.461 -1.522 5.534 0 13.006 4.498 16.119 5.562 2.375 0.812 2.875 0.188 4.188 -1.25 1.4 -1.534 3.716 -6.904 3.716 -6.904 s-7.47 -4.107 -11.871 -5.726 -5.358 -1.427 -6.752 -1.401 c-3.056 0.057 -5.314 0.671 -7.375 2.011 0 0 -1.494 2.036 -2.677 3.999z
            path(
                fill = SolidColor(Color(0xFF1C6399)),
            ) {
                // M 3.354 25.167
                moveTo(x = 3.354f, y = 25.167f)
                // C 1.521 28.209 0.138 30.988 0.77 32.031
                curveTo(
                    x1 = 1.521f,
                    y1 = 28.209f,
                    x2 = 0.138f,
                    y2 = 30.988f,
                    x3 = 0.77f,
                    y3 = 32.031f,
                )
                // c 0 0 -0.203 -0.761 0.775 -1.633
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -0.203f,
                    dy2 = -0.761f,
                    dx3 = 0.775f,
                    dy3 = -1.633f,
                )
                // c 0.892 -0.795 2.805 -1.522 6.461 -1.522
                curveToRelative(
                    dx1 = 0.892f,
                    dy1 = -0.795f,
                    dx2 = 2.805f,
                    dy2 = -1.522f,
                    dx3 = 6.461f,
                    dy3 = -1.522f,
                )
                // c 5.534 0 13.006 4.498 16.119 5.562
                curveToRelative(
                    dx1 = 5.534f,
                    dy1 = 0.0f,
                    dx2 = 13.006f,
                    dy2 = 4.498f,
                    dx3 = 16.119f,
                    dy3 = 5.562f,
                )
                // c 2.375 0.812 2.875 0.188 4.188 -1.25
                curveToRelative(
                    dx1 = 2.375f,
                    dy1 = 0.812f,
                    dx2 = 2.875f,
                    dy2 = 0.188f,
                    dx3 = 4.188f,
                    dy3 = -1.25f,
                )
                // c 1.4 -1.534 3.716 -6.904 3.716 -6.904
                curveToRelative(
                    dx1 = 1.4f,
                    dy1 = -1.534f,
                    dx2 = 3.716f,
                    dy2 = -6.904f,
                    dx3 = 3.716f,
                    dy3 = -6.904f,
                )
                // s -7.47 -4.107 -11.871 -5.726
                reflectiveCurveToRelative(
                    dx1 = -7.47f,
                    dy1 = -4.107f,
                    dx2 = -11.871f,
                    dy2 = -5.726f,
                )
                // s -5.358 -1.427 -6.752 -1.401
                reflectiveCurveToRelative(
                    dx1 = -5.358f,
                    dy1 = -1.427f,
                    dx2 = -6.752f,
                    dy2 = -1.401f,
                )
                // c -3.056 0.057 -5.314 0.671 -7.375 2.011
                curveToRelative(
                    dx1 = -3.056f,
                    dy1 = 0.057f,
                    dx2 = -5.314f,
                    dy2 = 0.671f,
                    dx3 = -7.375f,
                    dy3 = 2.011f,
                )
                // c 0 0 -1.494 2.036 -2.677 3.999z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -1.494f,
                    dy2 = 2.036f,
                    dx3 = -2.677f,
                    dy3 = 3.999f,
                )
                close()
            }
            // M30.588 11.339 c-0.61 -3.443 -4.011 -5.076 -4.011 -5.076 -1.895 -0.883 -4.158 -1.448 -6.864 -1.491 0 0 -12.192 -0.105 -13.681 16.395 0 0 2.541 -1.115 7.92 -0.793 7.299 0.438 14.414 4.117 15.986 4.812 0.83 -2.779 1.367 -9.798 0.65 -13.847z
            path(
                fill = SolidColor(Color(0xFF50A5E6)),
            ) {
                // M 30.588 11.339
                moveTo(x = 30.588f, y = 11.339f)
                // c -0.61 -3.443 -4.011 -5.076 -4.011 -5.076
                curveToRelative(
                    dx1 = -0.61f,
                    dy1 = -3.443f,
                    dx2 = -4.011f,
                    dy2 = -5.076f,
                    dx3 = -4.011f,
                    dy3 = -5.076f,
                )
                // c -1.895 -0.883 -4.158 -1.448 -6.864 -1.491
                curveToRelative(
                    dx1 = -1.895f,
                    dy1 = -0.883f,
                    dx2 = -4.158f,
                    dy2 = -1.448f,
                    dx3 = -6.864f,
                    dy3 = -1.491f,
                )
                // c 0 0 -12.192 -0.105 -13.681 16.395
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -12.192f,
                    dy2 = -0.105f,
                    dx3 = -13.681f,
                    dy3 = 16.395f,
                )
                // c 0 0 2.541 -1.115 7.92 -0.793
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 2.541f,
                    dy2 = -1.115f,
                    dx3 = 7.92f,
                    dy3 = -0.793f,
                )
                // c 7.299 0.438 14.414 4.117 15.986 4.812
                curveToRelative(
                    dx1 = 7.299f,
                    dy1 = 0.438f,
                    dx2 = 14.414f,
                    dy2 = 4.117f,
                    dx3 = 15.986f,
                    dy3 = 4.812f,
                )
                // c 0.83 -2.779 1.367 -9.798 0.65 -13.847z
                curveToRelative(
                    dx1 = 0.83f,
                    dy1 = -2.779f,
                    dx2 = 1.367f,
                    dy2 = -9.798f,
                    dx3 = 0.65f,
                    dy3 = -13.847f,
                )
                close()
            }
        }.build().also { _emoji1f9e2 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f9e2: ImageVector? = null
