package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f4f4: ImageVector
    get() {
        val current = _emoji1f4f4
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f4f4",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 32 c0 4 -4 4 -4 4 H4 c-4 0 -4 -4 -4 -4 V4 c0 -4 4 -4 4 -4 h28 s4 0 4 4 v28z
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 36 32
                moveTo(x = 36.0f, y = 32.0f)
                // c 0 4 -4 4 -4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.0f,
                    dx2 = -4.0f,
                    dy2 = 4.0f,
                    dx3 = -4.0f,
                    dy3 = 4.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // c -4 0 -4 -4 -4 -4
                curveToRelative(
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = -4.0f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
                // c 0 -4 4 -4 4 -4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.0f,
                    dx2 = 4.0f,
                    dy2 = -4.0f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // s 4 0 4 4
                reflectiveCurveToRelative(
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = 4.0f,
                )
                // v 28z
                verticalLineToRelative(dy = 28.0f)
                close()
            }
            // M7.243 16.916 c0 -2.971 2 -5.256 4.913 -5.256 2.871 0 4.913 2.356 4.913 5.256 0 2.957 -1.985 5.256 -4.913 5.256 -2.899 0 -4.913 -2.3 -4.913 -5.256z M14.841 16.916 c0 -1.728 -0.9 -3.285 -2.685 -3.285 -1.785 0 -2.685 1.557 -2.685 3.285 0 1.743 0.872 3.285 2.685 3.285 1.814 -0.001 2.685 -1.543 2.685 -3.285z M18.526 12.945 c0 -0.586 0.4 -1.114 1.114 -1.114 h3.656 c0.628 0 0.957 0.485 0.957 0.985 0 0.486 -0.314 0.985 -0.957 0.985 h-2.628 v2.085 h2.214 c0.686 0 1.028 0.486 1.028 0.971 0 0.5 -0.343 1 -1.028 1 h-2.214 v3.113 c0 0.714 -0.457 1.114 -1.071 1.114 -0.614 0 -1.071 -0.4 -1.071 -1.114 v-8.025z M26.297 12.945 c0 -0.586 0.4 -1.114 1.114 -1.114 h3.656 c0.628 0 0.957 0.485 0.957 0.985 0 0.486 -0.314 0.985 -0.957 0.985 L28.44 13.801 v2.085 h2.214 c0.686 0 1.028 0.486 1.028 0.971 0 0.5 -0.343 1 -1.028 1 L28.44 17.857 v3.113 c0 0.714 -0.457 1.114 -1.071 1.114 -0.614 0 -1.071 -0.4 -1.071 -1.114 v-8.025z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 7.243 16.916
                moveTo(x = 7.243f, y = 16.916f)
                // c 0 -2.971 2 -5.256 4.913 -5.256
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.971f,
                    dx2 = 2.0f,
                    dy2 = -5.256f,
                    dx3 = 4.913f,
                    dy3 = -5.256f,
                )
                // c 2.871 0 4.913 2.356 4.913 5.256
                curveToRelative(
                    dx1 = 2.871f,
                    dy1 = 0.0f,
                    dx2 = 4.913f,
                    dy2 = 2.356f,
                    dx3 = 4.913f,
                    dy3 = 5.256f,
                )
                // c 0 2.957 -1.985 5.256 -4.913 5.256
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.957f,
                    dx2 = -1.985f,
                    dy2 = 5.256f,
                    dx3 = -4.913f,
                    dy3 = 5.256f,
                )
                // c -2.899 0 -4.913 -2.3 -4.913 -5.256z
                curveToRelative(
                    dx1 = -2.899f,
                    dy1 = 0.0f,
                    dx2 = -4.913f,
                    dy2 = -2.3f,
                    dx3 = -4.913f,
                    dy3 = -5.256f,
                )
                close()
                // M 14.841 16.916
                moveTo(x = 14.841f, y = 16.916f)
                // c 0 -1.728 -0.9 -3.285 -2.685 -3.285
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.728f,
                    dx2 = -0.9f,
                    dy2 = -3.285f,
                    dx3 = -2.685f,
                    dy3 = -3.285f,
                )
                // c -1.785 0 -2.685 1.557 -2.685 3.285
                curveToRelative(
                    dx1 = -1.785f,
                    dy1 = 0.0f,
                    dx2 = -2.685f,
                    dy2 = 1.557f,
                    dx3 = -2.685f,
                    dy3 = 3.285f,
                )
                // c 0 1.743 0.872 3.285 2.685 3.285
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.743f,
                    dx2 = 0.872f,
                    dy2 = 3.285f,
                    dx3 = 2.685f,
                    dy3 = 3.285f,
                )
                // c 1.814 -0.001 2.685 -1.543 2.685 -3.285z
                curveToRelative(
                    dx1 = 1.814f,
                    dy1 = -0.001f,
                    dx2 = 2.685f,
                    dy2 = -1.543f,
                    dx3 = 2.685f,
                    dy3 = -3.285f,
                )
                close()
                // M 18.526 12.945
                moveTo(x = 18.526f, y = 12.945f)
                // c 0 -0.586 0.4 -1.114 1.114 -1.114
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.586f,
                    dx2 = 0.4f,
                    dy2 = -1.114f,
                    dx3 = 1.114f,
                    dy3 = -1.114f,
                )
                // h 3.656
                horizontalLineToRelative(dx = 3.656f)
                // c 0.628 0 0.957 0.485 0.957 0.985
                curveToRelative(
                    dx1 = 0.628f,
                    dy1 = 0.0f,
                    dx2 = 0.957f,
                    dy2 = 0.485f,
                    dx3 = 0.957f,
                    dy3 = 0.985f,
                )
                // c 0 0.486 -0.314 0.985 -0.957 0.985
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.486f,
                    dx2 = -0.314f,
                    dy2 = 0.985f,
                    dx3 = -0.957f,
                    dy3 = 0.985f,
                )
                // h -2.628
                horizontalLineToRelative(dx = -2.628f)
                // v 2.085
                verticalLineToRelative(dy = 2.085f)
                // h 2.214
                horizontalLineToRelative(dx = 2.214f)
                // c 0.686 0 1.028 0.486 1.028 0.971
                curveToRelative(
                    dx1 = 0.686f,
                    dy1 = 0.0f,
                    dx2 = 1.028f,
                    dy2 = 0.486f,
                    dx3 = 1.028f,
                    dy3 = 0.971f,
                )
                // c 0 0.5 -0.343 1 -1.028 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.5f,
                    dx2 = -0.343f,
                    dy2 = 1.0f,
                    dx3 = -1.028f,
                    dy3 = 1.0f,
                )
                // h -2.214
                horizontalLineToRelative(dx = -2.214f)
                // v 3.113
                verticalLineToRelative(dy = 3.113f)
                // c 0 0.714 -0.457 1.114 -1.071 1.114
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.714f,
                    dx2 = -0.457f,
                    dy2 = 1.114f,
                    dx3 = -1.071f,
                    dy3 = 1.114f,
                )
                // c -0.614 0 -1.071 -0.4 -1.071 -1.114
                curveToRelative(
                    dx1 = -0.614f,
                    dy1 = 0.0f,
                    dx2 = -1.071f,
                    dy2 = -0.4f,
                    dx3 = -1.071f,
                    dy3 = -1.114f,
                )
                // v -8.025z
                verticalLineToRelative(dy = -8.025f)
                close()
                // M 26.297 12.945
                moveTo(x = 26.297f, y = 12.945f)
                // c 0 -0.586 0.4 -1.114 1.114 -1.114
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.586f,
                    dx2 = 0.4f,
                    dy2 = -1.114f,
                    dx3 = 1.114f,
                    dy3 = -1.114f,
                )
                // h 3.656
                horizontalLineToRelative(dx = 3.656f)
                // c 0.628 0 0.957 0.485 0.957 0.985
                curveToRelative(
                    dx1 = 0.628f,
                    dy1 = 0.0f,
                    dx2 = 0.957f,
                    dy2 = 0.485f,
                    dx3 = 0.957f,
                    dy3 = 0.985f,
                )
                // c 0 0.486 -0.314 0.985 -0.957 0.985
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.486f,
                    dx2 = -0.314f,
                    dy2 = 0.985f,
                    dx3 = -0.957f,
                    dy3 = 0.985f,
                )
                // L 28.44 13.801
                lineTo(x = 28.44f, y = 13.801f)
                // v 2.085
                verticalLineToRelative(dy = 2.085f)
                // h 2.214
                horizontalLineToRelative(dx = 2.214f)
                // c 0.686 0 1.028 0.486 1.028 0.971
                curveToRelative(
                    dx1 = 0.686f,
                    dy1 = 0.0f,
                    dx2 = 1.028f,
                    dy2 = 0.486f,
                    dx3 = 1.028f,
                    dy3 = 0.971f,
                )
                // c 0 0.5 -0.343 1 -1.028 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.5f,
                    dx2 = -0.343f,
                    dy2 = 1.0f,
                    dx3 = -1.028f,
                    dy3 = 1.0f,
                )
                // L 28.44 17.857
                lineTo(x = 28.44f, y = 17.857f)
                // v 3.113
                verticalLineToRelative(dy = 3.113f)
                // c 0 0.714 -0.457 1.114 -1.071 1.114
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.714f,
                    dx2 = -0.457f,
                    dy2 = 1.114f,
                    dx3 = -1.071f,
                    dy3 = 1.114f,
                )
                // c -0.614 0 -1.071 -0.4 -1.071 -1.114
                curveToRelative(
                    dx1 = -0.614f,
                    dy1 = 0.0f,
                    dx2 = -1.071f,
                    dy2 = -0.4f,
                    dx3 = -1.071f,
                    dy3 = -1.114f,
                )
                // v -8.025z
                verticalLineToRelative(dy = -8.025f)
                close()
            }
            // M19 24 v4 H5 V8 h14 v2 h2 V6 c0 -3 -3 -3 -3 -3 H6 C3 3 3 6 3 6 v24 c0 3 3 3 3 3 h12 c3 0 3 -3 3 -3 v-6 h-2z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 19 24
                moveTo(x = 19.0f, y = 24.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // c 0 -3 -3 -3 -3 -3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.0f,
                    dx2 = -3.0f,
                    dy2 = -3.0f,
                    dx3 = -3.0f,
                    dy3 = -3.0f,
                )
                // H 6
                horizontalLineTo(x = 6.0f)
                // C 3 3 3 6 3 6
                curveTo(
                    x1 = 3.0f,
                    y1 = 3.0f,
                    x2 = 3.0f,
                    y2 = 6.0f,
                    x3 = 3.0f,
                    y3 = 6.0f,
                )
                // v 24
                verticalLineToRelative(dy = 24.0f)
                // c 0 3 3 3 3 3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.0f,
                    dx2 = 3.0f,
                    dy2 = 3.0f,
                    dx3 = 3.0f,
                    dy3 = 3.0f,
                )
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // c 3 0 3 -3 3 -3
                curveToRelative(
                    dx1 = 3.0f,
                    dy1 = 0.0f,
                    dx2 = 3.0f,
                    dy2 = -3.0f,
                    dx3 = 3.0f,
                    dy3 = -3.0f,
                )
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
        }.build().also { _emoji1f4f4 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f4f4: ImageVector? = null
