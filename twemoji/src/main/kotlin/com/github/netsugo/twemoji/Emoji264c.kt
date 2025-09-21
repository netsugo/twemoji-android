package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji264c: ImageVector
    get() {
        val current = _emoji264c
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji264c",
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
            // M11.999 27.5 c-3.584 0 -6.5 -2.916 -6.5 -6.5 s2.916 -6.5 6.5 -6.5 6.5 2.916 6.5 6.5 -2.916 6.5 -6.5 6.5z M11.999 17.5 c-1.93 0 -3.5 1.57 -3.5 3.5 s1.57 3.5 3.5 3.5 3.5 -1.57 3.5 -3.5 -1.57 -3.5 -3.5 -3.5z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 11.999 27.5
                moveTo(x = 11.999f, y = 27.5f)
                // c -3.584 0 -6.5 -2.916 -6.5 -6.5
                curveToRelative(
                    dx1 = -3.584f,
                    dy1 = 0.0f,
                    dx2 = -6.5f,
                    dy2 = -2.916f,
                    dx3 = -6.5f,
                    dy3 = -6.5f,
                )
                // s 2.916 -6.5 6.5 -6.5
                reflectiveCurveToRelative(
                    dx1 = 2.916f,
                    dy1 = -6.5f,
                    dx2 = 6.5f,
                    dy2 = -6.5f,
                )
                // s 6.5 2.916 6.5 6.5
                reflectiveCurveToRelative(
                    dx1 = 6.5f,
                    dy1 = 2.916f,
                    dx2 = 6.5f,
                    dy2 = 6.5f,
                )
                // s -2.916 6.5 -6.5 6.5z
                reflectiveCurveToRelative(
                    dx1 = -2.916f,
                    dy1 = 6.5f,
                    dx2 = -6.5f,
                    dy2 = 6.5f,
                )
                close()
                // M 11.999 17.5
                moveTo(x = 11.999f, y = 17.5f)
                // c -1.93 0 -3.5 1.57 -3.5 3.5
                curveToRelative(
                    dx1 = -1.93f,
                    dy1 = 0.0f,
                    dx2 = -3.5f,
                    dy2 = 1.57f,
                    dx3 = -3.5f,
                    dy3 = 3.5f,
                )
                // s 1.57 3.5 3.5 3.5
                reflectiveCurveToRelative(
                    dx1 = 1.57f,
                    dy1 = 3.5f,
                    dx2 = 3.5f,
                    dy2 = 3.5f,
                )
                // s 3.5 -1.57 3.5 -3.5
                reflectiveCurveToRelative(
                    dx1 = 3.5f,
                    dy1 = -1.57f,
                    dx2 = 3.5f,
                    dy2 = -3.5f,
                )
                // s -1.57 -3.5 -3.5 -3.5z
                reflectiveCurveToRelative(
                    dx1 = -1.57f,
                    dy1 = -3.5f,
                    dx2 = -3.5f,
                    dy2 = -3.5f,
                )
                close()
            }
            // M25.553 29.768 c-0.654 0 -1.337 -0.114 -2.028 -0.345 -1.654 -0.552 -2.783 -1.78 -3.18 -3.46 -0.64 -2.71 0.737 -6.167 3.594 -9.024 1.911 -1.912 2.75 -4.625 1.993 -6.452 C25.251 8.845 23.418 8.5 22 8.5 c-2.173 0 -4.5 1.406 -4.5 3.5 0 1.821 0.388 2.812 0.798 3.862 0.618 1.581 1.257 3.216 0.125 6.612 -0.262 0.784 -1.111 1.211 -1.897 0.948 -0.786 -0.262 -1.21 -1.111 -0.948 -1.897 0.789 -2.366 0.465 -3.196 -0.073 -4.57 C15.057 15.811 14.5 14.387 14.5 12 c0 -4.015 3.893 -6.5 7.5 -6.5 4.448 0 6.109 2.405 6.703 3.839 1.221 2.947 0.134 6.944 -2.643 9.722 -2.382 2.382 -3.12 4.837 -2.795 6.213 0.157 0.667 0.541 1.081 1.209 1.304 0.91 0.305 1.701 0.244 2.285 -0.178 0.456 -0.329 0.74 -0.865 0.74 -1.399 0 -0.828 0.672 -1.5 1.5 -1.5 s1.5 0.672 1.5 1.5 c0 1.504 -0.742 2.938 -1.986 3.834 -0.86 0.618 -1.873 0.933 -2.96 0.933z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 25.553 29.768
                moveTo(x = 25.553f, y = 29.768f)
                // c -0.654 0 -1.337 -0.114 -2.028 -0.345
                curveToRelative(
                    dx1 = -0.654f,
                    dy1 = 0.0f,
                    dx2 = -1.337f,
                    dy2 = -0.114f,
                    dx3 = -2.028f,
                    dy3 = -0.345f,
                )
                // c -1.654 -0.552 -2.783 -1.78 -3.18 -3.46
                curveToRelative(
                    dx1 = -1.654f,
                    dy1 = -0.552f,
                    dx2 = -2.783f,
                    dy2 = -1.78f,
                    dx3 = -3.18f,
                    dy3 = -3.46f,
                )
                // c -0.64 -2.71 0.737 -6.167 3.594 -9.024
                curveToRelative(
                    dx1 = -0.64f,
                    dy1 = -2.71f,
                    dx2 = 0.737f,
                    dy2 = -6.167f,
                    dx3 = 3.594f,
                    dy3 = -9.024f,
                )
                // c 1.911 -1.912 2.75 -4.625 1.993 -6.452
                curveToRelative(
                    dx1 = 1.911f,
                    dy1 = -1.912f,
                    dx2 = 2.75f,
                    dy2 = -4.625f,
                    dx3 = 1.993f,
                    dy3 = -6.452f,
                )
                // C 25.251 8.845 23.418 8.5 22 8.5
                curveTo(
                    x1 = 25.251f,
                    y1 = 8.845f,
                    x2 = 23.418f,
                    y2 = 8.5f,
                    x3 = 22.0f,
                    y3 = 8.5f,
                )
                // c -2.173 0 -4.5 1.406 -4.5 3.5
                curveToRelative(
                    dx1 = -2.173f,
                    dy1 = 0.0f,
                    dx2 = -4.5f,
                    dy2 = 1.406f,
                    dx3 = -4.5f,
                    dy3 = 3.5f,
                )
                // c 0 1.821 0.388 2.812 0.798 3.862
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.821f,
                    dx2 = 0.388f,
                    dy2 = 2.812f,
                    dx3 = 0.798f,
                    dy3 = 3.862f,
                )
                // c 0.618 1.581 1.257 3.216 0.125 6.612
                curveToRelative(
                    dx1 = 0.618f,
                    dy1 = 1.581f,
                    dx2 = 1.257f,
                    dy2 = 3.216f,
                    dx3 = 0.125f,
                    dy3 = 6.612f,
                )
                // c -0.262 0.784 -1.111 1.211 -1.897 0.948
                curveToRelative(
                    dx1 = -0.262f,
                    dy1 = 0.784f,
                    dx2 = -1.111f,
                    dy2 = 1.211f,
                    dx3 = -1.897f,
                    dy3 = 0.948f,
                )
                // c -0.786 -0.262 -1.21 -1.111 -0.948 -1.897
                curveToRelative(
                    dx1 = -0.786f,
                    dy1 = -0.262f,
                    dx2 = -1.21f,
                    dy2 = -1.111f,
                    dx3 = -0.948f,
                    dy3 = -1.897f,
                )
                // c 0.789 -2.366 0.465 -3.196 -0.073 -4.57
                curveToRelative(
                    dx1 = 0.789f,
                    dy1 = -2.366f,
                    dx2 = 0.465f,
                    dy2 = -3.196f,
                    dx3 = -0.073f,
                    dy3 = -4.57f,
                )
                // C 15.057 15.811 14.5 14.387 14.5 12
                curveTo(
                    x1 = 15.057f,
                    y1 = 15.811f,
                    x2 = 14.5f,
                    y2 = 14.387f,
                    x3 = 14.5f,
                    y3 = 12.0f,
                )
                // c 0 -4.015 3.893 -6.5 7.5 -6.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.015f,
                    dx2 = 3.893f,
                    dy2 = -6.5f,
                    dx3 = 7.5f,
                    dy3 = -6.5f,
                )
                // c 4.448 0 6.109 2.405 6.703 3.839
                curveToRelative(
                    dx1 = 4.448f,
                    dy1 = 0.0f,
                    dx2 = 6.109f,
                    dy2 = 2.405f,
                    dx3 = 6.703f,
                    dy3 = 3.839f,
                )
                // c 1.221 2.947 0.134 6.944 -2.643 9.722
                curveToRelative(
                    dx1 = 1.221f,
                    dy1 = 2.947f,
                    dx2 = 0.134f,
                    dy2 = 6.944f,
                    dx3 = -2.643f,
                    dy3 = 9.722f,
                )
                // c -2.382 2.382 -3.12 4.837 -2.795 6.213
                curveToRelative(
                    dx1 = -2.382f,
                    dy1 = 2.382f,
                    dx2 = -3.12f,
                    dy2 = 4.837f,
                    dx3 = -2.795f,
                    dy3 = 6.213f,
                )
                // c 0.157 0.667 0.541 1.081 1.209 1.304
                curveToRelative(
                    dx1 = 0.157f,
                    dy1 = 0.667f,
                    dx2 = 0.541f,
                    dy2 = 1.081f,
                    dx3 = 1.209f,
                    dy3 = 1.304f,
                )
                // c 0.91 0.305 1.701 0.244 2.285 -0.178
                curveToRelative(
                    dx1 = 0.91f,
                    dy1 = 0.305f,
                    dx2 = 1.701f,
                    dy2 = 0.244f,
                    dx3 = 2.285f,
                    dy3 = -0.178f,
                )
                // c 0.456 -0.329 0.74 -0.865 0.74 -1.399
                curveToRelative(
                    dx1 = 0.456f,
                    dy1 = -0.329f,
                    dx2 = 0.74f,
                    dy2 = -0.865f,
                    dx3 = 0.74f,
                    dy3 = -1.399f,
                )
                // c 0 -0.828 0.672 -1.5 1.5 -1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.828f,
                    dx2 = 0.672f,
                    dy2 = -1.5f,
                    dx3 = 1.5f,
                    dy3 = -1.5f,
                )
                // s 1.5 0.672 1.5 1.5
                reflectiveCurveToRelative(
                    dx1 = 1.5f,
                    dy1 = 0.672f,
                    dx2 = 1.5f,
                    dy2 = 1.5f,
                )
                // c 0 1.504 -0.742 2.938 -1.986 3.834
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.504f,
                    dx2 = -0.742f,
                    dy2 = 2.938f,
                    dx3 = -1.986f,
                    dy3 = 3.834f,
                )
                // c -0.86 0.618 -1.873 0.933 -2.96 0.933z
                curveToRelative(
                    dx1 = -0.86f,
                    dy1 = 0.618f,
                    dx2 = -1.873f,
                    dy2 = 0.933f,
                    dx3 = -2.96f,
                    dy3 = 0.933f,
                )
                close()
            }
        }.build().also { _emoji264c = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji264c: ImageVector? = null
