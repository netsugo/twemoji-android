package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f355: ImageVector
    get() {
        val current = _emoji1f355
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f355",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M18 4 c7.257 0 13 4 14.699 2 0.197 -0.323 0.301 -0.657 0.301 -1 0 -2 -6.716 -5 -15 -5 C9.716 0 3 3 3 5 c0 0.343 0.104 0.677 0.301 1 C5 8 10.743 4 18 4z
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 18 4
                moveTo(x = 18.0f, y = 4.0f)
                // c 7.257 0 13 4 14.699 2
                curveToRelative(
                    dx1 = 7.257f,
                    dy1 = 0.0f,
                    dx2 = 13.0f,
                    dy2 = 4.0f,
                    dx3 = 14.699f,
                    dy3 = 2.0f,
                )
                // c 0.197 -0.323 0.301 -0.657 0.301 -1
                curveToRelative(
                    dx1 = 0.197f,
                    dy1 = -0.323f,
                    dx2 = 0.301f,
                    dy2 = -0.657f,
                    dx3 = 0.301f,
                    dy3 = -1.0f,
                )
                // c 0 -2 -6.716 -5 -15 -5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                    dx2 = -6.716f,
                    dy2 = -5.0f,
                    dx3 = -15.0f,
                    dy3 = -5.0f,
                )
                // C 9.716 0 3 3 3 5
                curveTo(
                    x1 = 9.716f,
                    y1 = 0.0f,
                    x2 = 3.0f,
                    y2 = 3.0f,
                    x3 = 3.0f,
                    y3 = 5.0f,
                )
                // c 0 0.343 0.104 0.677 0.301 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.343f,
                    dx2 = 0.104f,
                    dy2 = 0.677f,
                    dx3 = 0.301f,
                    dy3 = 1.0f,
                )
                // C 5 8 10.743 4 18 4z
                curveTo(
                    x1 = 5.0f,
                    y1 = 8.0f,
                    x2 = 10.743f,
                    y2 = 4.0f,
                    x3 = 18.0f,
                    y3 = 4.0f,
                )
                close()
            }
            // M18 3 C11.787 3 7.384 4.81 5.727 5.618 c-0.477 0.233 -0.539 0.84 -0.415 1.278 S16 34 16 34 s0.896 2 2 2 2 -2 2 -2 L30.704 6.779 s0.213 -0.842 -0.569 -1.229 C28.392 4.689 24.047 3 18 3z
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 18 3
                moveTo(x = 18.0f, y = 3.0f)
                // C 11.787 3 7.384 4.81 5.727 5.618
                curveTo(
                    x1 = 11.787f,
                    y1 = 3.0f,
                    x2 = 7.384f,
                    y2 = 4.81f,
                    x3 = 5.727f,
                    y3 = 5.618f,
                )
                // c -0.477 0.233 -0.539 0.84 -0.415 1.278
                curveToRelative(
                    dx1 = -0.477f,
                    dy1 = 0.233f,
                    dx2 = -0.539f,
                    dy2 = 0.84f,
                    dx3 = -0.415f,
                    dy3 = 1.278f,
                )
                // S 16 34 16 34
                reflectiveCurveTo(
                    x1 = 16.0f,
                    y1 = 34.0f,
                    x2 = 16.0f,
                    y2 = 34.0f,
                )
                // s 0.896 2 2 2
                reflectiveCurveToRelative(
                    dx1 = 0.896f,
                    dy1 = 2.0f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                )
                // s 2 -2 2 -2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // L 30.704 6.779
                lineTo(x = 30.704f, y = 6.779f)
                // s 0.213 -0.842 -0.569 -1.229
                reflectiveCurveToRelative(
                    dx1 = 0.213f,
                    dy1 = -0.842f,
                    dx2 = -0.569f,
                    dy2 = -1.229f,
                )
                // C 28.392 4.689 24.047 3 18 3z
                curveTo(
                    x1 = 28.392f,
                    y1 = 4.689f,
                    x2 = 24.047f,
                    y2 = 3.0f,
                    x3 = 18.0f,
                    y3 = 3.0f,
                )
                close()
            }
            // M18 31 c0 -2.208 -1.791 -4 -4 -4 -0.254 0 -0.5 0.029 -0.741 0.075 L16 34 s0.071 0.14 0.19 0.342 C17.279 33.627 18 32.399 18 31z M17 20 c0 -2.209 -1.792 -4 -4 -4 -1.426 0 -2.67 0.752 -3.378 1.876 l2.362 5.978 c0.327 0.086 0.663 0.146 1.016 0.146 2.208 0 4 -1.792 4 -4z
            path(
                fill = SolidColor(Color(0xFFBE1931)),
            ) {
                // M 18 31
                moveTo(x = 18.0f, y = 31.0f)
                // c 0 -2.208 -1.791 -4 -4 -4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.208f,
                    dx2 = -1.791f,
                    dy2 = -4.0f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                // c -0.254 0 -0.5 0.029 -0.741 0.075
                curveToRelative(
                    dx1 = -0.254f,
                    dy1 = 0.0f,
                    dx2 = -0.5f,
                    dy2 = 0.029f,
                    dx3 = -0.741f,
                    dy3 = 0.075f,
                )
                // L 16 34
                lineTo(x = 16.0f, y = 34.0f)
                // s 0.071 0.14 0.19 0.342
                reflectiveCurveToRelative(
                    dx1 = 0.071f,
                    dy1 = 0.14f,
                    dx2 = 0.19f,
                    dy2 = 0.342f,
                )
                // C 17.279 33.627 18 32.399 18 31z
                curveTo(
                    x1 = 17.279f,
                    y1 = 33.627f,
                    x2 = 18.0f,
                    y2 = 32.399f,
                    x3 = 18.0f,
                    y3 = 31.0f,
                )
                close()
                // M 17 20
                moveTo(x = 17.0f, y = 20.0f)
                // c 0 -2.209 -1.792 -4 -4 -4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.209f,
                    dx2 = -1.792f,
                    dy2 = -4.0f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                // c -1.426 0 -2.67 0.752 -3.378 1.876
                curveToRelative(
                    dx1 = -1.426f,
                    dy1 = 0.0f,
                    dx2 = -2.67f,
                    dy2 = 0.752f,
                    dx3 = -3.378f,
                    dy3 = 1.876f,
                )
                // l 2.362 5.978
                lineToRelative(dx = 2.362f, dy = 5.978f)
                // c 0.327 0.086 0.663 0.146 1.016 0.146
                curveToRelative(
                    dx1 = 0.327f,
                    dy1 = 0.086f,
                    dx2 = 0.663f,
                    dy2 = 0.146f,
                    dx3 = 1.016f,
                    dy3 = 0.146f,
                )
                // c 2.208 0 4 -1.792 4 -4z
                curveToRelative(
                    dx1 = 2.208f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = -1.792f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                close()
            }
            // M16 8 m-4 0 a4 4 0 1 1 8 0 a4 4 0 1 1 -8 0
            path(
                fill = SolidColor(Color(0xFFBE1931)),
            ) {
                // M 16 8
                moveTo(x = 16.0f, y = 8.0f)
                // m -4 0
                moveToRelative(dx = -4.0f, dy = 0.0f)
                // a 4 4 0 1 1 8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 8.0f,
                    dy1 = 0.0f,
                )
                // a 4 4 0 1 1 -8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -8.0f,
                    dy1 = 0.0f,
                )
            }
            // M25 9 c-2.208 0 -4 1.791 -4 4 s1.792 4 4 4 c0.682 0 1.315 -0.187 1.877 -0.488 l1.89 -4.806 C28.227 10.135 26.752 9 25 9z M19 25 c0 1.868 1.288 3.425 3.019 3.864 l2.893 -7.357 C24.342 21.194 23.697 21 23 21 c-2.208 0 -4 1.792 -4 4z M10 12 c0 -2.209 -1.791 -4 -4 -4 -0.087 0 -0.169 0.02 -0.255 0.026 0.55 1.412 1.575 4.016 2.775 7.057 C9.416 14.349 10 13.248 10 12z
            path(
                fill = SolidColor(Color(0xFFBE1931)),
            ) {
                // M 25 9
                moveTo(x = 25.0f, y = 9.0f)
                // c -2.208 0 -4 1.791 -4 4
                curveToRelative(
                    dx1 = -2.208f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = 1.791f,
                    dx3 = -4.0f,
                    dy3 = 4.0f,
                )
                // s 1.792 4 4 4
                reflectiveCurveToRelative(
                    dx1 = 1.792f,
                    dy1 = 4.0f,
                    dx2 = 4.0f,
                    dy2 = 4.0f,
                )
                // c 0.682 0 1.315 -0.187 1.877 -0.488
                curveToRelative(
                    dx1 = 0.682f,
                    dy1 = 0.0f,
                    dx2 = 1.315f,
                    dy2 = -0.187f,
                    dx3 = 1.877f,
                    dy3 = -0.488f,
                )
                // l 1.89 -4.806
                lineToRelative(dx = 1.89f, dy = -4.806f)
                // C 28.227 10.135 26.752 9 25 9z
                curveTo(
                    x1 = 28.227f,
                    y1 = 10.135f,
                    x2 = 26.752f,
                    y2 = 9.0f,
                    x3 = 25.0f,
                    y3 = 9.0f,
                )
                close()
                // M 19 25
                moveTo(x = 19.0f, y = 25.0f)
                // c 0 1.868 1.288 3.425 3.019 3.864
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.868f,
                    dx2 = 1.288f,
                    dy2 = 3.425f,
                    dx3 = 3.019f,
                    dy3 = 3.864f,
                )
                // l 2.893 -7.357
                lineToRelative(dx = 2.893f, dy = -7.357f)
                // C 24.342 21.194 23.697 21 23 21
                curveTo(
                    x1 = 24.342f,
                    y1 = 21.194f,
                    x2 = 23.697f,
                    y2 = 21.0f,
                    x3 = 23.0f,
                    y3 = 21.0f,
                )
                // c -2.208 0 -4 1.792 -4 4z
                curveToRelative(
                    dx1 = -2.208f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = 1.792f,
                    dx3 = -4.0f,
                    dy3 = 4.0f,
                )
                close()
                // M 10 12
                moveTo(x = 10.0f, y = 12.0f)
                // c 0 -2.209 -1.791 -4 -4 -4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.209f,
                    dx2 = -1.791f,
                    dy2 = -4.0f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                // c -0.087 0 -0.169 0.02 -0.255 0.026
                curveToRelative(
                    dx1 = -0.087f,
                    dy1 = 0.0f,
                    dx2 = -0.169f,
                    dy2 = 0.02f,
                    dx3 = -0.255f,
                    dy3 = 0.026f,
                )
                // c 0.55 1.412 1.575 4.016 2.775 7.057
                curveToRelative(
                    dx1 = 0.55f,
                    dy1 = 1.412f,
                    dx2 = 1.575f,
                    dy2 = 4.016f,
                    dx3 = 2.775f,
                    dy3 = 7.057f,
                )
                // C 9.416 14.349 10 13.248 10 12z
                curveTo(
                    x1 = 9.416f,
                    y1 = 14.349f,
                    x2 = 10.0f,
                    y2 = 13.248f,
                    x3 = 10.0f,
                    y3 = 12.0f,
                )
                close()
            }
        }.build().also { _emoji1f355 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f355: ImageVector? = null
