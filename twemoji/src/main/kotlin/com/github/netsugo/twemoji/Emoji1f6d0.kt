package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f6d0: ImageVector
    get() {
        val current = _emoji1f6d0
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f6d0",
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
            // M21.52 10.704 c0.521 1.843 -0.267 3.68 -1.764 4.103 -1.494 0.423 -3.128 -0.729 -3.649 -2.573 -0.522 -1.843 0.268 -3.68 1.762 -4.103 1.494 -0.423 3.129 0.729 3.651 2.573z M10.917 14.625 C11.958 15.75 13 17 14 18 s6.625 -2.667 7.625 -2.667 S25 17 26 21 c0.527 2.107 0.792 4.458 0.542 5 -0.852 1.528 -3.538 3.665 -4.542 4 h5 c1 0 2 1 2 2 s-1 2 -2 2 L15.708 34 c-2.5 0 -2.177 -2.665 -0.708 -4 2.292 -2.083 3.625 -3.25 4.625 -4.25 0 -1 -0.875 -5.042 -1.875 -5.042 C17.75 20.708 15 22 14 22 c-2 0 -3.924 -4.04 -5 -6 -0.708 -1.292 1.094 -2.264 1.917 -1.375z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 21.52 10.704
                moveTo(x = 21.52f, y = 10.704f)
                // c 0.521 1.843 -0.267 3.68 -1.764 4.103
                curveToRelative(
                    dx1 = 0.521f,
                    dy1 = 1.843f,
                    dx2 = -0.267f,
                    dy2 = 3.68f,
                    dx3 = -1.764f,
                    dy3 = 4.103f,
                )
                // c -1.494 0.423 -3.128 -0.729 -3.649 -2.573
                curveToRelative(
                    dx1 = -1.494f,
                    dy1 = 0.423f,
                    dx2 = -3.128f,
                    dy2 = -0.729f,
                    dx3 = -3.649f,
                    dy3 = -2.573f,
                )
                // c -0.522 -1.843 0.268 -3.68 1.762 -4.103
                curveToRelative(
                    dx1 = -0.522f,
                    dy1 = -1.843f,
                    dx2 = 0.268f,
                    dy2 = -3.68f,
                    dx3 = 1.762f,
                    dy3 = -4.103f,
                )
                // c 1.494 -0.423 3.129 0.729 3.651 2.573z
                curveToRelative(
                    dx1 = 1.494f,
                    dy1 = -0.423f,
                    dx2 = 3.129f,
                    dy2 = 0.729f,
                    dx3 = 3.651f,
                    dy3 = 2.573f,
                )
                close()
                // M 10.917 14.625
                moveTo(x = 10.917f, y = 14.625f)
                // C 11.958 15.75 13 17 14 18
                curveTo(
                    x1 = 11.958f,
                    y1 = 15.75f,
                    x2 = 13.0f,
                    y2 = 17.0f,
                    x3 = 14.0f,
                    y3 = 18.0f,
                )
                // s 6.625 -2.667 7.625 -2.667
                reflectiveCurveToRelative(
                    dx1 = 6.625f,
                    dy1 = -2.667f,
                    dx2 = 7.625f,
                    dy2 = -2.667f,
                )
                // S 25 17 26 21
                reflectiveCurveTo(
                    x1 = 25.0f,
                    y1 = 17.0f,
                    x2 = 26.0f,
                    y2 = 21.0f,
                )
                // c 0.527 2.107 0.792 4.458 0.542 5
                curveToRelative(
                    dx1 = 0.527f,
                    dy1 = 2.107f,
                    dx2 = 0.792f,
                    dy2 = 4.458f,
                    dx3 = 0.542f,
                    dy3 = 5.0f,
                )
                // c -0.852 1.528 -3.538 3.665 -4.542 4
                curveToRelative(
                    dx1 = -0.852f,
                    dy1 = 1.528f,
                    dx2 = -3.538f,
                    dy2 = 3.665f,
                    dx3 = -4.542f,
                    dy3 = 4.0f,
                )
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // c 1 0 2 1 2 2
                curveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 1.0f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                // s -1 2 -2 2
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 2.0f,
                    dx2 = -2.0f,
                    dy2 = 2.0f,
                )
                // L 15.708 34
                lineTo(x = 15.708f, y = 34.0f)
                // c -2.5 0 -2.177 -2.665 -0.708 -4
                curveToRelative(
                    dx1 = -2.5f,
                    dy1 = 0.0f,
                    dx2 = -2.177f,
                    dy2 = -2.665f,
                    dx3 = -0.708f,
                    dy3 = -4.0f,
                )
                // c 2.292 -2.083 3.625 -3.25 4.625 -4.25
                curveToRelative(
                    dx1 = 2.292f,
                    dy1 = -2.083f,
                    dx2 = 3.625f,
                    dy2 = -3.25f,
                    dx3 = 4.625f,
                    dy3 = -4.25f,
                )
                // c 0 -1 -0.875 -5.042 -1.875 -5.042
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.0f,
                    dx2 = -0.875f,
                    dy2 = -5.042f,
                    dx3 = -1.875f,
                    dy3 = -5.042f,
                )
                // C 17.75 20.708 15 22 14 22
                curveTo(
                    x1 = 17.75f,
                    y1 = 20.708f,
                    x2 = 15.0f,
                    y2 = 22.0f,
                    x3 = 14.0f,
                    y3 = 22.0f,
                )
                // c -2 0 -3.924 -4.04 -5 -6
                curveToRelative(
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                    dx2 = -3.924f,
                    dy2 = -4.04f,
                    dx3 = -5.0f,
                    dy3 = -6.0f,
                )
                // c -0.708 -1.292 1.094 -2.264 1.917 -1.375z
                curveToRelative(
                    dx1 = -0.708f,
                    dy1 = -1.292f,
                    dx2 = 1.094f,
                    dy2 = -2.264f,
                    dx3 = 1.917f,
                    dy3 = -1.375f,
                )
                close()
            }
            // M30.559 8.626 l-11.69 -6.649 c-0.573 -0.25 -0.918 -0.334 -1.149 -0.316 l-0.021 -0.001 -0.021 0.001 c-0.237 -0.018 -0.549 0.066 -1.001 0.316 L4.986 8.626 c-0.645 0.368 -0.871 1.188 -0.504 1.834 0.368 0.646 1.189 0.871 1.834 0.504 l11.456 -6.516 11.456 6.516 c0.646 0.367 1.467 0.142 1.835 -0.504 0.367 -0.646 0.141 -1.466 -0.504 -1.834z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 30.559 8.626
                moveTo(x = 30.559f, y = 8.626f)
                // l -11.69 -6.649
                lineToRelative(dx = -11.69f, dy = -6.649f)
                // c -0.573 -0.25 -0.918 -0.334 -1.149 -0.316
                curveToRelative(
                    dx1 = -0.573f,
                    dy1 = -0.25f,
                    dx2 = -0.918f,
                    dy2 = -0.334f,
                    dx3 = -1.149f,
                    dy3 = -0.316f,
                )
                // l -0.021 -0.001
                lineToRelative(dx = -0.021f, dy = -0.001f)
                // l -0.021 0.001
                lineToRelative(dx = -0.021f, dy = 0.001f)
                // c -0.237 -0.018 -0.549 0.066 -1.001 0.316
                curveToRelative(
                    dx1 = -0.237f,
                    dy1 = -0.018f,
                    dx2 = -0.549f,
                    dy2 = 0.066f,
                    dx3 = -1.001f,
                    dy3 = 0.316f,
                )
                // L 4.986 8.626
                lineTo(x = 4.986f, y = 8.626f)
                // c -0.645 0.368 -0.871 1.188 -0.504 1.834
                curveToRelative(
                    dx1 = -0.645f,
                    dy1 = 0.368f,
                    dx2 = -0.871f,
                    dy2 = 1.188f,
                    dx3 = -0.504f,
                    dy3 = 1.834f,
                )
                // c 0.368 0.646 1.189 0.871 1.834 0.504
                curveToRelative(
                    dx1 = 0.368f,
                    dy1 = 0.646f,
                    dx2 = 1.189f,
                    dy2 = 0.871f,
                    dx3 = 1.834f,
                    dy3 = 0.504f,
                )
                // l 11.456 -6.516
                lineToRelative(dx = 11.456f, dy = -6.516f)
                // l 11.456 6.516
                lineToRelative(dx = 11.456f, dy = 6.516f)
                // c 0.646 0.367 1.467 0.142 1.835 -0.504
                curveToRelative(
                    dx1 = 0.646f,
                    dy1 = 0.367f,
                    dx2 = 1.467f,
                    dy2 = 0.142f,
                    dx3 = 1.835f,
                    dy3 = -0.504f,
                )
                // c 0.367 -0.646 0.141 -1.466 -0.504 -1.834z
                curveToRelative(
                    dx1 = 0.367f,
                    dy1 = -0.646f,
                    dx2 = 0.141f,
                    dy2 = -1.466f,
                    dx3 = -0.504f,
                    dy3 = -1.834f,
                )
                close()
            }
        }.build().also { _emoji1f6d0 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f6d0: ImageVector? = null
