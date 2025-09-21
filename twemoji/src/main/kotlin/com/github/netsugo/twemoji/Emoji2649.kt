package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji2649: ImageVector
    get() {
        val current = _emoji2649
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji2649",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 32 c0 2.209 -1.791 4 -4 4 H4 c-2.209 0 -4 -1.791 -4 -4 V4 c0 -2.209 1.791 -4 4 -4 h28 c2.209 0 4 1.791 4 4 v28z
            path(
                fill = SolidColor(Color(0xFF9266CC)),
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
            // M18 29.5 c-4.687 0 -8.5 -3.813 -8.5 -8.5 0 -4.687 3.813 -8.5 8.5 -8.5 4.687 0 8.5 3.813 8.5 8.5 0 4.687 -3.813 8.5 -8.5 8.5z M18 15.5 c-3.033 0 -5.5 2.467 -5.5 5.5 0 3.032 2.467 5.5 5.5 5.5 3.032 0 5.5 -2.468 5.5 -5.5 0 -3.033 -2.468 -5.5 -5.5 -5.5z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 18 29.5
                moveTo(x = 18.0f, y = 29.5f)
                // c -4.687 0 -8.5 -3.813 -8.5 -8.5
                curveToRelative(
                    dx1 = -4.687f,
                    dy1 = 0.0f,
                    dx2 = -8.5f,
                    dy2 = -3.813f,
                    dx3 = -8.5f,
                    dy3 = -8.5f,
                )
                // c 0 -4.687 3.813 -8.5 8.5 -8.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.687f,
                    dx2 = 3.813f,
                    dy2 = -8.5f,
                    dx3 = 8.5f,
                    dy3 = -8.5f,
                )
                // c 4.687 0 8.5 3.813 8.5 8.5
                curveToRelative(
                    dx1 = 4.687f,
                    dy1 = 0.0f,
                    dx2 = 8.5f,
                    dy2 = 3.813f,
                    dx3 = 8.5f,
                    dy3 = 8.5f,
                )
                // c 0 4.687 -3.813 8.5 -8.5 8.5z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.687f,
                    dx2 = -3.813f,
                    dy2 = 8.5f,
                    dx3 = -8.5f,
                    dy3 = 8.5f,
                )
                close()
                // M 18 15.5
                moveTo(x = 18.0f, y = 15.5f)
                // c -3.033 0 -5.5 2.467 -5.5 5.5
                curveToRelative(
                    dx1 = -3.033f,
                    dy1 = 0.0f,
                    dx2 = -5.5f,
                    dy2 = 2.467f,
                    dx3 = -5.5f,
                    dy3 = 5.5f,
                )
                // c 0 3.032 2.467 5.5 5.5 5.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.032f,
                    dx2 = 2.467f,
                    dy2 = 5.5f,
                    dx3 = 5.5f,
                    dy3 = 5.5f,
                )
                // c 3.032 0 5.5 -2.468 5.5 -5.5
                curveToRelative(
                    dx1 = 3.032f,
                    dy1 = 0.0f,
                    dx2 = 5.5f,
                    dy2 = -2.468f,
                    dx3 = 5.5f,
                    dy3 = -5.5f,
                )
                // c 0 -3.033 -2.468 -5.5 -5.5 -5.5z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.033f,
                    dx2 = -2.468f,
                    dy2 = -5.5f,
                    dx3 = -5.5f,
                    dy3 = -5.5f,
                )
                close()
            }
            // M18 15.5 c-5.109 0 -7.58 -2.79 -8.131 -3.507 C9.388 11.543 8.053 10.5 7 10.5 c-1.297 0 -1.94 0.563 -1.967 0.587 -0.604 0.543 -1.547 0.519 -2.106 -0.07 -0.559 -0.59 -0.562 -1.503 0.013 -2.077 C3.086 8.792 4.452 7.5 7 7.5 s4.811 2.189 5.061 2.439 c0.07 0.07 0.133 0.146 0.188 0.229 0.057 0.08 1.69 2.332 5.752 2.332 4.083 0 5.736 -2.309 5.752 -2.332 0.055 -0.082 0.117 -0.159 0.188 -0.229 C24.19 9.689 26.452 7.5 29 7.5 s3.913 1.292 4.061 1.439 c0.586 0.585 0.586 1.536 0 2.121 -0.586 0.586 -1.535 0.586 -2.121 0 -0.002 0 -0.645 -0.561 -1.94 -0.561 -1.052 0 -2.384 1.04 -2.869 1.494 -0.552 0.718 -3.024 3.507 -8.131 3.507z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 18 15.5
                moveTo(x = 18.0f, y = 15.5f)
                // c -5.109 0 -7.58 -2.79 -8.131 -3.507
                curveToRelative(
                    dx1 = -5.109f,
                    dy1 = 0.0f,
                    dx2 = -7.58f,
                    dy2 = -2.79f,
                    dx3 = -8.131f,
                    dy3 = -3.507f,
                )
                // C 9.388 11.543 8.053 10.5 7 10.5
                curveTo(
                    x1 = 9.388f,
                    y1 = 11.543f,
                    x2 = 8.053f,
                    y2 = 10.5f,
                    x3 = 7.0f,
                    y3 = 10.5f,
                )
                // c -1.297 0 -1.94 0.563 -1.967 0.587
                curveToRelative(
                    dx1 = -1.297f,
                    dy1 = 0.0f,
                    dx2 = -1.94f,
                    dy2 = 0.563f,
                    dx3 = -1.967f,
                    dy3 = 0.587f,
                )
                // c -0.604 0.543 -1.547 0.519 -2.106 -0.07
                curveToRelative(
                    dx1 = -0.604f,
                    dy1 = 0.543f,
                    dx2 = -1.547f,
                    dy2 = 0.519f,
                    dx3 = -2.106f,
                    dy3 = -0.07f,
                )
                // c -0.559 -0.59 -0.562 -1.503 0.013 -2.077
                curveToRelative(
                    dx1 = -0.559f,
                    dy1 = -0.59f,
                    dx2 = -0.562f,
                    dy2 = -1.503f,
                    dx3 = 0.013f,
                    dy3 = -2.077f,
                )
                // C 3.086 8.792 4.452 7.5 7 7.5
                curveTo(
                    x1 = 3.086f,
                    y1 = 8.792f,
                    x2 = 4.452f,
                    y2 = 7.5f,
                    x3 = 7.0f,
                    y3 = 7.5f,
                )
                // s 4.811 2.189 5.061 2.439
                reflectiveCurveToRelative(
                    dx1 = 4.811f,
                    dy1 = 2.189f,
                    dx2 = 5.061f,
                    dy2 = 2.439f,
                )
                // c 0.07 0.07 0.133 0.146 0.188 0.229
                curveToRelative(
                    dx1 = 0.07f,
                    dy1 = 0.07f,
                    dx2 = 0.133f,
                    dy2 = 0.146f,
                    dx3 = 0.188f,
                    dy3 = 0.229f,
                )
                // c 0.057 0.08 1.69 2.332 5.752 2.332
                curveToRelative(
                    dx1 = 0.057f,
                    dy1 = 0.08f,
                    dx2 = 1.69f,
                    dy2 = 2.332f,
                    dx3 = 5.752f,
                    dy3 = 2.332f,
                )
                // c 4.083 0 5.736 -2.309 5.752 -2.332
                curveToRelative(
                    dx1 = 4.083f,
                    dy1 = 0.0f,
                    dx2 = 5.736f,
                    dy2 = -2.309f,
                    dx3 = 5.752f,
                    dy3 = -2.332f,
                )
                // c 0.055 -0.082 0.117 -0.159 0.188 -0.229
                curveToRelative(
                    dx1 = 0.055f,
                    dy1 = -0.082f,
                    dx2 = 0.117f,
                    dy2 = -0.159f,
                    dx3 = 0.188f,
                    dy3 = -0.229f,
                )
                // C 24.19 9.689 26.452 7.5 29 7.5
                curveTo(
                    x1 = 24.19f,
                    y1 = 9.689f,
                    x2 = 26.452f,
                    y2 = 7.5f,
                    x3 = 29.0f,
                    y3 = 7.5f,
                )
                // s 3.913 1.292 4.061 1.439
                reflectiveCurveToRelative(
                    dx1 = 3.913f,
                    dy1 = 1.292f,
                    dx2 = 4.061f,
                    dy2 = 1.439f,
                )
                // c 0.586 0.585 0.586 1.536 0 2.121
                curveToRelative(
                    dx1 = 0.586f,
                    dy1 = 0.585f,
                    dx2 = 0.586f,
                    dy2 = 1.536f,
                    dx3 = 0.0f,
                    dy3 = 2.121f,
                )
                // c -0.586 0.586 -1.535 0.586 -2.121 0
                curveToRelative(
                    dx1 = -0.586f,
                    dy1 = 0.586f,
                    dx2 = -1.535f,
                    dy2 = 0.586f,
                    dx3 = -2.121f,
                    dy3 = 0.0f,
                )
                // c -0.002 0 -0.645 -0.561 -1.94 -0.561
                curveToRelative(
                    dx1 = -0.002f,
                    dy1 = 0.0f,
                    dx2 = -0.645f,
                    dy2 = -0.561f,
                    dx3 = -1.94f,
                    dy3 = -0.561f,
                )
                // c -1.052 0 -2.384 1.04 -2.869 1.494
                curveToRelative(
                    dx1 = -1.052f,
                    dy1 = 0.0f,
                    dx2 = -2.384f,
                    dy2 = 1.04f,
                    dx3 = -2.869f,
                    dy3 = 1.494f,
                )
                // c -0.552 0.718 -3.024 3.507 -8.131 3.507z
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.718f,
                    dx2 = -3.024f,
                    dy2 = 3.507f,
                    dx3 = -8.131f,
                    dy3 = 3.507f,
                )
                close()
            }
        }.build().also { _emoji2649 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji2649: ImageVector? = null
