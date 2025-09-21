package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f199: ImageVector
    get() {
        val current = _emoji1f199
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f199",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 32 c0 2.209 -1.791 4 -4 4 H4 c-2.209 0 -4 -1.791 -4 -4 V4 c0 -2.209 1.791 -4 4 -4 h28 c2.209 0 4 1.791 4 4 v28z
            path(
                fill = SolidColor(Color(0xFF3B88C3)),
            ) {
                // M 36 32
                moveTo(x = 36.0f, y = 32.0f)
                // c 0 2.209 -1.791 4 -4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = -1.791f,
                    dy2 = 4.0f,
                    dx3 = -4.0f,
                    dy3 = 4.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // c -2.209 0 -4 -1.791 -4 -4
                curveToRelative(
                    dx1 = -2.209f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = -1.791f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
                // c 0 -2.209 1.791 -4 4 -4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.209f,
                    dx2 = 1.791f,
                    dy2 = -4.0f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // c 2.209 0 4 1.791 4 4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = 1.791f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // v 28z
                verticalLineToRelative(dy = 28.0f)
                close()
            }
            // M2.281 11.562 c0 -1.05 0.672 -1.638 1.575 -1.638 s1.575 0.588 1.575 1.638 v7.328 c0 1.932 1.239 3.464 3.233 3.464 1.911 0 3.212 -1.616 3.212 -3.464 v-7.328 c0 -1.05 0.672 -1.638 1.575 -1.638 0.903 0 1.575 0.588 1.575 1.638 v7.496 c0 3.527 -2.898 6.193 -6.362 6.193 -3.506 0 -6.383 -2.625 -6.383 -6.193 v-7.496z M16.792 11.689 c0 -0.987 0.588 -1.638 1.638 -1.638 h3.717 c3.086 0 5.375 2.016 5.375 5.018 0 3.066 -2.373 4.976 -5.25 4.976 h-2.33 v3.443 c0 1.05 -0.672 1.638 -1.575 1.638 -0.903 0 -1.575 -0.588 -1.575 -1.638 L16.792 11.689z M19.941 17.273 h2.142 c1.323 0 2.163 -0.966 2.163 -2.225 0 -1.26 -0.84 -2.226 -2.163 -2.226 h-2.142 v4.451z M29.391 23.614 c0 -0.903 0.736 -1.638 1.639 -1.638 s1.637 0.734 1.637 1.638 c0 0.903 -0.734 1.638 -1.637 1.638 s-1.639 -0.734 -1.639 -1.638z M29.518 11.227 c0 -0.882 0.65 -1.428 1.512 -1.428 0.84 0 1.512 0.567 1.512 1.428 v8.084 c0 0.86 -0.672 1.428 -1.512 1.428 -0.861 0 -1.512 -0.547 -1.512 -1.428 v-8.084z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 2.281 11.562
                moveTo(x = 2.281f, y = 11.562f)
                // c 0 -1.05 0.672 -1.638 1.575 -1.638
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.05f,
                    dx2 = 0.672f,
                    dy2 = -1.638f,
                    dx3 = 1.575f,
                    dy3 = -1.638f,
                )
                // s 1.575 0.588 1.575 1.638
                reflectiveCurveToRelative(
                    dx1 = 1.575f,
                    dy1 = 0.588f,
                    dx2 = 1.575f,
                    dy2 = 1.638f,
                )
                // v 7.328
                verticalLineToRelative(dy = 7.328f)
                // c 0 1.932 1.239 3.464 3.233 3.464
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.932f,
                    dx2 = 1.239f,
                    dy2 = 3.464f,
                    dx3 = 3.233f,
                    dy3 = 3.464f,
                )
                // c 1.911 0 3.212 -1.616 3.212 -3.464
                curveToRelative(
                    dx1 = 1.911f,
                    dy1 = 0.0f,
                    dx2 = 3.212f,
                    dy2 = -1.616f,
                    dx3 = 3.212f,
                    dy3 = -3.464f,
                )
                // v -7.328
                verticalLineToRelative(dy = -7.328f)
                // c 0 -1.05 0.672 -1.638 1.575 -1.638
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.05f,
                    dx2 = 0.672f,
                    dy2 = -1.638f,
                    dx3 = 1.575f,
                    dy3 = -1.638f,
                )
                // c 0.903 0 1.575 0.588 1.575 1.638
                curveToRelative(
                    dx1 = 0.903f,
                    dy1 = 0.0f,
                    dx2 = 1.575f,
                    dy2 = 0.588f,
                    dx3 = 1.575f,
                    dy3 = 1.638f,
                )
                // v 7.496
                verticalLineToRelative(dy = 7.496f)
                // c 0 3.527 -2.898 6.193 -6.362 6.193
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.527f,
                    dx2 = -2.898f,
                    dy2 = 6.193f,
                    dx3 = -6.362f,
                    dy3 = 6.193f,
                )
                // c -3.506 0 -6.383 -2.625 -6.383 -6.193
                curveToRelative(
                    dx1 = -3.506f,
                    dy1 = 0.0f,
                    dx2 = -6.383f,
                    dy2 = -2.625f,
                    dx3 = -6.383f,
                    dy3 = -6.193f,
                )
                // v -7.496z
                verticalLineToRelative(dy = -7.496f)
                close()
                // M 16.792 11.689
                moveTo(x = 16.792f, y = 11.689f)
                // c 0 -0.987 0.588 -1.638 1.638 -1.638
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.987f,
                    dx2 = 0.588f,
                    dy2 = -1.638f,
                    dx3 = 1.638f,
                    dy3 = -1.638f,
                )
                // h 3.717
                horizontalLineToRelative(dx = 3.717f)
                // c 3.086 0 5.375 2.016 5.375 5.018
                curveToRelative(
                    dx1 = 3.086f,
                    dy1 = 0.0f,
                    dx2 = 5.375f,
                    dy2 = 2.016f,
                    dx3 = 5.375f,
                    dy3 = 5.018f,
                )
                // c 0 3.066 -2.373 4.976 -5.25 4.976
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.066f,
                    dx2 = -2.373f,
                    dy2 = 4.976f,
                    dx3 = -5.25f,
                    dy3 = 4.976f,
                )
                // h -2.33
                horizontalLineToRelative(dx = -2.33f)
                // v 3.443
                verticalLineToRelative(dy = 3.443f)
                // c 0 1.05 -0.672 1.638 -1.575 1.638
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.05f,
                    dx2 = -0.672f,
                    dy2 = 1.638f,
                    dx3 = -1.575f,
                    dy3 = 1.638f,
                )
                // c -0.903 0 -1.575 -0.588 -1.575 -1.638
                curveToRelative(
                    dx1 = -0.903f,
                    dy1 = 0.0f,
                    dx2 = -1.575f,
                    dy2 = -0.588f,
                    dx3 = -1.575f,
                    dy3 = -1.638f,
                )
                // L 16.792 11.689z
                lineTo(x = 16.792f, y = 11.689f)
                close()
                // M 19.941 17.273
                moveTo(x = 19.941f, y = 17.273f)
                // h 2.142
                horizontalLineToRelative(dx = 2.142f)
                // c 1.323 0 2.163 -0.966 2.163 -2.225
                curveToRelative(
                    dx1 = 1.323f,
                    dy1 = 0.0f,
                    dx2 = 2.163f,
                    dy2 = -0.966f,
                    dx3 = 2.163f,
                    dy3 = -2.225f,
                )
                // c 0 -1.26 -0.84 -2.226 -2.163 -2.226
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.26f,
                    dx2 = -0.84f,
                    dy2 = -2.226f,
                    dx3 = -2.163f,
                    dy3 = -2.226f,
                )
                // h -2.142
                horizontalLineToRelative(dx = -2.142f)
                // v 4.451z
                verticalLineToRelative(dy = 4.451f)
                close()
                // M 29.391 23.614
                moveTo(x = 29.391f, y = 23.614f)
                // c 0 -0.903 0.736 -1.638 1.639 -1.638
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.903f,
                    dx2 = 0.736f,
                    dy2 = -1.638f,
                    dx3 = 1.639f,
                    dy3 = -1.638f,
                )
                // s 1.637 0.734 1.637 1.638
                reflectiveCurveToRelative(
                    dx1 = 1.637f,
                    dy1 = 0.734f,
                    dx2 = 1.637f,
                    dy2 = 1.638f,
                )
                // c 0 0.903 -0.734 1.638 -1.637 1.638
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.903f,
                    dx2 = -0.734f,
                    dy2 = 1.638f,
                    dx3 = -1.637f,
                    dy3 = 1.638f,
                )
                // s -1.639 -0.734 -1.639 -1.638z
                reflectiveCurveToRelative(
                    dx1 = -1.639f,
                    dy1 = -0.734f,
                    dx2 = -1.639f,
                    dy2 = -1.638f,
                )
                close()
                // M 29.518 11.227
                moveTo(x = 29.518f, y = 11.227f)
                // c 0 -0.882 0.65 -1.428 1.512 -1.428
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.882f,
                    dx2 = 0.65f,
                    dy2 = -1.428f,
                    dx3 = 1.512f,
                    dy3 = -1.428f,
                )
                // c 0.84 0 1.512 0.567 1.512 1.428
                curveToRelative(
                    dx1 = 0.84f,
                    dy1 = 0.0f,
                    dx2 = 1.512f,
                    dy2 = 0.567f,
                    dx3 = 1.512f,
                    dy3 = 1.428f,
                )
                // v 8.084
                verticalLineToRelative(dy = 8.084f)
                // c 0 0.86 -0.672 1.428 -1.512 1.428
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.86f,
                    dx2 = -0.672f,
                    dy2 = 1.428f,
                    dx3 = -1.512f,
                    dy3 = 1.428f,
                )
                // c -0.861 0 -1.512 -0.547 -1.512 -1.428
                curveToRelative(
                    dx1 = -0.861f,
                    dy1 = 0.0f,
                    dx2 = -1.512f,
                    dy2 = -0.547f,
                    dx3 = -1.512f,
                    dy3 = -1.428f,
                )
                // v -8.084z
                verticalLineToRelative(dy = -8.084f)
                close()
            }
        }.build().also { _emoji1f199 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f199: ImageVector? = null
