package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji26f1: ImageVector
    get() {
        val current = _emoji26f1
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji26f1",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M34 31 H2 c-1.104 0 -2 0.896 -2 2 v3 h36 v-3 c0 -1.104 -0.896 -2 -2 -2z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 34 31
                moveTo(x = 34.0f, y = 31.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // c -1.104 0 -2 0.896 -2 2
                curveToRelative(
                    dx1 = -1.104f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = 0.896f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // c 0 -1.104 -0.896 -2 -2 -2z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.104f,
                    dx2 = -0.896f,
                    dy2 = -2.0f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                close()
            }
            // M16.996 32.5 c-0.175 0.809 -0.975 1.323 -1.784 1.147 -0.81 -0.176 -1.324 -0.975 -1.148 -1.784 L20.004 1.5 c0.176 -0.81 0.975 -1.323 1.784 -1.148 0.809 0.176 1.323 0.975 1.147 1.784 L16.996 32.5z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 16.996 32.5
                moveTo(x = 16.996f, y = 32.5f)
                // c -0.175 0.809 -0.975 1.323 -1.784 1.147
                curveToRelative(
                    dx1 = -0.175f,
                    dy1 = 0.809f,
                    dx2 = -0.975f,
                    dy2 = 1.323f,
                    dx3 = -1.784f,
                    dy3 = 1.147f,
                )
                // c -0.81 -0.176 -1.324 -0.975 -1.148 -1.784
                curveToRelative(
                    dx1 = -0.81f,
                    dy1 = -0.176f,
                    dx2 = -1.324f,
                    dy2 = -0.975f,
                    dx3 = -1.148f,
                    dy3 = -1.784f,
                )
                // L 20.004 1.5
                lineTo(x = 20.004f, y = 1.5f)
                // c 0.176 -0.81 0.975 -1.323 1.784 -1.148
                curveToRelative(
                    dx1 = 0.176f,
                    dy1 = -0.81f,
                    dx2 = 0.975f,
                    dy2 = -1.323f,
                    dx3 = 1.784f,
                    dy3 = -1.148f,
                )
                // c 0.809 0.176 1.323 0.975 1.147 1.784
                curveToRelative(
                    dx1 = 0.809f,
                    dy1 = 0.176f,
                    dx2 = 1.323f,
                    dy2 = 0.975f,
                    dx3 = 1.147f,
                    dy3 = 1.784f,
                )
                // L 16.996 32.5z
                lineTo(x = 16.996f, y = 32.5f)
                close()
            }
            // M21.363 2.307 C12.458 0.375 4.004 4.495 2.481 11.512 c0 0 -0.424 1.954 0.553 2.167 0.977 0.212 3.356 -1.318 3.356 -1.318 l24.431 5.303 s1.53 2.379 2.508 2.591 c0.977 0.212 1.401 -1.742 1.401 -1.742 1.524 -7.018 -4.461 -14.273 -13.367 -16.206z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 21.363 2.307
                moveTo(x = 21.363f, y = 2.307f)
                // C 12.458 0.375 4.004 4.495 2.481 11.512
                curveTo(
                    x1 = 12.458f,
                    y1 = 0.375f,
                    x2 = 4.004f,
                    y2 = 4.495f,
                    x3 = 2.481f,
                    y3 = 11.512f,
                )
                // c 0 0 -0.424 1.954 0.553 2.167
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -0.424f,
                    dy2 = 1.954f,
                    dx3 = 0.553f,
                    dy3 = 2.167f,
                )
                // c 0.977 0.212 3.356 -1.318 3.356 -1.318
                curveToRelative(
                    dx1 = 0.977f,
                    dy1 = 0.212f,
                    dx2 = 3.356f,
                    dy2 = -1.318f,
                    dx3 = 3.356f,
                    dy3 = -1.318f,
                )
                // l 24.431 5.303
                lineToRelative(dx = 24.431f, dy = 5.303f)
                // s 1.53 2.379 2.508 2.591
                reflectiveCurveToRelative(
                    dx1 = 1.53f,
                    dy1 = 2.379f,
                    dx2 = 2.508f,
                    dy2 = 2.591f,
                )
                // c 0.977 0.212 1.401 -1.742 1.401 -1.742
                curveToRelative(
                    dx1 = 0.977f,
                    dy1 = 0.212f,
                    dx2 = 1.401f,
                    dy2 = -1.742f,
                    dx3 = 1.401f,
                    dy3 = -1.742f,
                )
                // c 1.524 -7.018 -4.461 -14.273 -13.367 -16.206z
                curveToRelative(
                    dx1 = 1.524f,
                    dy1 = -7.018f,
                    dx2 = -4.461f,
                    dy2 = -14.273f,
                    dx3 = -13.367f,
                    dy3 = -16.206f,
                )
                close()
            }
            // M21.363 2.307 C14.617 0.843 7.914 5.344 6.391 12.36 c0 0 -0.424 1.955 1.53 2.379 s5.31 -0.894 5.31 -0.894 l10.749 2.333 s2.508 2.59 4.463 3.015 c1.954 0.424 2.378 -1.53 2.378 -1.53 1.524 -7.017 -2.712 -13.892 -9.458 -15.356z
            path(
                fill = SolidColor(Color(0xFFE1E8ED)),
            ) {
                // M 21.363 2.307
                moveTo(x = 21.363f, y = 2.307f)
                // C 14.617 0.843 7.914 5.344 6.391 12.36
                curveTo(
                    x1 = 14.617f,
                    y1 = 0.843f,
                    x2 = 7.914f,
                    y2 = 5.344f,
                    x3 = 6.391f,
                    y3 = 12.36f,
                )
                // c 0 0 -0.424 1.955 1.53 2.379
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -0.424f,
                    dy2 = 1.955f,
                    dx3 = 1.53f,
                    dy3 = 2.379f,
                )
                // s 5.31 -0.894 5.31 -0.894
                reflectiveCurveToRelative(
                    dx1 = 5.31f,
                    dy1 = -0.894f,
                    dx2 = 5.31f,
                    dy2 = -0.894f,
                )
                // l 10.749 2.333
                lineToRelative(dx = 10.749f, dy = 2.333f)
                // s 2.508 2.59 4.463 3.015
                reflectiveCurveToRelative(
                    dx1 = 2.508f,
                    dy1 = 2.59f,
                    dx2 = 4.463f,
                    dy2 = 3.015f,
                )
                // c 1.954 0.424 2.378 -1.53 2.378 -1.53
                curveToRelative(
                    dx1 = 1.954f,
                    dy1 = 0.424f,
                    dx2 = 2.378f,
                    dy2 = -1.53f,
                    dx3 = 2.378f,
                    dy3 = -1.53f,
                )
                // c 1.524 -7.017 -2.712 -13.892 -9.458 -15.356z
                curveToRelative(
                    dx1 = 1.524f,
                    dy1 = -7.017f,
                    dx2 = -2.712f,
                    dy2 = -13.892f,
                    dx3 = -9.458f,
                    dy3 = -15.356f,
                )
                close()
            }
            // M21.363 2.307 c-3.508 -0.761 -6.609 4.521 -8.132 11.538 0 0 2.507 2.591 4.462 3.015 l0.977 0.212 c1.955 0.424 5.31 -0.894 5.31 -0.894 1.524 -7.016 0.892 -13.109 -2.617 -13.871z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 21.363 2.307
                moveTo(x = 21.363f, y = 2.307f)
                // c -3.508 -0.761 -6.609 4.521 -8.132 11.538
                curveToRelative(
                    dx1 = -3.508f,
                    dy1 = -0.761f,
                    dx2 = -6.609f,
                    dy2 = 4.521f,
                    dx3 = -8.132f,
                    dy3 = 11.538f,
                )
                // c 0 0 2.507 2.591 4.462 3.015
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 2.507f,
                    dy2 = 2.591f,
                    dx3 = 4.462f,
                    dy3 = 3.015f,
                )
                // l 0.977 0.212
                lineToRelative(dx = 0.977f, dy = 0.212f)
                // c 1.955 0.424 5.31 -0.894 5.31 -0.894
                curveToRelative(
                    dx1 = 1.955f,
                    dy1 = 0.424f,
                    dx2 = 5.31f,
                    dy2 = -0.894f,
                    dx3 = 5.31f,
                    dy3 = -0.894f,
                )
                // c 1.524 -7.016 0.892 -13.109 -2.617 -13.871z
                curveToRelative(
                    dx1 = 1.524f,
                    dy1 = -7.016f,
                    dx2 = 0.892f,
                    dy2 = -13.109f,
                    dx3 = -2.617f,
                    dy3 = -13.871f,
                )
                close()
            }
        }.build().also { _emoji26f1 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji26f1: ImageVector? = null
