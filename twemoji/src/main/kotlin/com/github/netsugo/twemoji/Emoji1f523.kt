package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f523: ImageVector
    get() {
        val current = _emoji1f523
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f523",
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
            // M12.83 27.757 l0.741 -0.854 c0.494 -0.57 0.836 -0.874 1.444 -0.874 0.551 0 1.045 0.475 1.045 1.196 0 0.513 -0.437 1.121 -1.045 1.805 l-0.475 0.514 1.292 1.462 c0.266 0.305 0.418 0.514 0.418 0.95 0 0.646 -0.608 1.272 -1.33 1.272 -0.437 0 -0.722 -0.133 -1.007 -0.437 l-1.311 -1.368 c-1.235 1.083 -2.489 1.805 -4.179 1.805 -2.546 0 -4.654 -1.443 -4.654 -4.103 0 -1.881 1.311 -3.268 2.869 -4.123 -0.741 -0.74 -1.254 -1.501 -1.254 -2.565 0 -2.166 2.033 -3.191 3.989 -3.191 1.71 0 3.876 0.969 3.876 2.982 0 1.519 -1.197 2.697 -2.413 3.324 l1.994 2.205z M8.137 26.56 c-0.855 0.552 -1.634 1.216 -1.634 2.299 0 1.197 0.817 1.862 1.976 1.862 1.025 0 1.69 -0.418 2.413 -1.102 L8.137 26.56z M9.372 21.412 c-0.494 0 -1.14 0.379 -1.14 0.949 s0.266 0.912 1.007 1.634 c0.57 -0.285 1.387 -0.798 1.387 -1.481 0 -0.856 -0.76 -1.102 -1.254 -1.102z M19.73 22.323 c0 -1.652 1.234 -3.077 2.926 -3.077 1.689 0 2.925 1.425 2.925 3.077 0 1.653 -1.235 3.059 -2.925 3.059 -1.691 0 -2.926 -1.405 -2.926 -3.059z M23.644 22.323 c0 -0.607 -0.36 -1.14 -0.987 -1.14 s-0.988 0.532 -0.988 1.14 c0 0.608 0.361 1.121 0.988 1.121 0.626 0 0.987 -0.512 0.987 -1.121z M28.26 19.74 c0.247 -0.475 0.438 -0.608 0.874 -0.608 0.589 0 1.12 0.476 1.12 1.063 0 0.152 0 0.285 -0.151 0.57 l-6.384 11.949 c-0.284 0.399 -0.399 0.627 -0.854 0.627 -0.494 0 -1.084 -0.475 -1.084 -1.045 0 -0.285 0.114 -0.551 0.19 -0.703 L28.26 19.74z M26.417 30.169 c0 -1.652 1.235 -3.077 2.926 -3.077 1.69 0 2.925 1.425 2.925 3.077 0 1.653 -1.234 3.059 -2.925 3.059 -1.691 0 -2.926 -1.406 -2.926 -3.059z M30.33 30.169 c0 -0.607 -0.36 -1.14 -0.987 -1.14 s-0.987 0.532 -0.987 1.14 c0 0.608 0.36 1.121 0.987 1.121 s0.987 -0.513 0.987 -1.121z M3 3 h14 v3 L3 6z M17 9 L3 9 v3 h5 v5 h4 v-5 h5z M32 5 l-5 -2 v8.203 c-0.538 -0.126 -1.19 -0.203 -2 -0.203 -2 0 -4 2 -4 4 0 1 1 2 3 2 3 0 5 -2 5 -4 L29 6.8 L32 8 L32 5z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 12.83 27.757
                moveTo(x = 12.83f, y = 27.757f)
                // l 0.741 -0.854
                lineToRelative(dx = 0.741f, dy = -0.854f)
                // c 0.494 -0.57 0.836 -0.874 1.444 -0.874
                curveToRelative(
                    dx1 = 0.494f,
                    dy1 = -0.57f,
                    dx2 = 0.836f,
                    dy2 = -0.874f,
                    dx3 = 1.444f,
                    dy3 = -0.874f,
                )
                // c 0.551 0 1.045 0.475 1.045 1.196
                curveToRelative(
                    dx1 = 0.551f,
                    dy1 = 0.0f,
                    dx2 = 1.045f,
                    dy2 = 0.475f,
                    dx3 = 1.045f,
                    dy3 = 1.196f,
                )
                // c 0 0.513 -0.437 1.121 -1.045 1.805
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.513f,
                    dx2 = -0.437f,
                    dy2 = 1.121f,
                    dx3 = -1.045f,
                    dy3 = 1.805f,
                )
                // l -0.475 0.514
                lineToRelative(dx = -0.475f, dy = 0.514f)
                // l 1.292 1.462
                lineToRelative(dx = 1.292f, dy = 1.462f)
                // c 0.266 0.305 0.418 0.514 0.418 0.95
                curveToRelative(
                    dx1 = 0.266f,
                    dy1 = 0.305f,
                    dx2 = 0.418f,
                    dy2 = 0.514f,
                    dx3 = 0.418f,
                    dy3 = 0.95f,
                )
                // c 0 0.646 -0.608 1.272 -1.33 1.272
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.646f,
                    dx2 = -0.608f,
                    dy2 = 1.272f,
                    dx3 = -1.33f,
                    dy3 = 1.272f,
                )
                // c -0.437 0 -0.722 -0.133 -1.007 -0.437
                curveToRelative(
                    dx1 = -0.437f,
                    dy1 = 0.0f,
                    dx2 = -0.722f,
                    dy2 = -0.133f,
                    dx3 = -1.007f,
                    dy3 = -0.437f,
                )
                // l -1.311 -1.368
                lineToRelative(dx = -1.311f, dy = -1.368f)
                // c -1.235 1.083 -2.489 1.805 -4.179 1.805
                curveToRelative(
                    dx1 = -1.235f,
                    dy1 = 1.083f,
                    dx2 = -2.489f,
                    dy2 = 1.805f,
                    dx3 = -4.179f,
                    dy3 = 1.805f,
                )
                // c -2.546 0 -4.654 -1.443 -4.654 -4.103
                curveToRelative(
                    dx1 = -2.546f,
                    dy1 = 0.0f,
                    dx2 = -4.654f,
                    dy2 = -1.443f,
                    dx3 = -4.654f,
                    dy3 = -4.103f,
                )
                // c 0 -1.881 1.311 -3.268 2.869 -4.123
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.881f,
                    dx2 = 1.311f,
                    dy2 = -3.268f,
                    dx3 = 2.869f,
                    dy3 = -4.123f,
                )
                // c -0.741 -0.74 -1.254 -1.501 -1.254 -2.565
                curveToRelative(
                    dx1 = -0.741f,
                    dy1 = -0.74f,
                    dx2 = -1.254f,
                    dy2 = -1.501f,
                    dx3 = -1.254f,
                    dy3 = -2.565f,
                )
                // c 0 -2.166 2.033 -3.191 3.989 -3.191
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.166f,
                    dx2 = 2.033f,
                    dy2 = -3.191f,
                    dx3 = 3.989f,
                    dy3 = -3.191f,
                )
                // c 1.71 0 3.876 0.969 3.876 2.982
                curveToRelative(
                    dx1 = 1.71f,
                    dy1 = 0.0f,
                    dx2 = 3.876f,
                    dy2 = 0.969f,
                    dx3 = 3.876f,
                    dy3 = 2.982f,
                )
                // c 0 1.519 -1.197 2.697 -2.413 3.324
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.519f,
                    dx2 = -1.197f,
                    dy2 = 2.697f,
                    dx3 = -2.413f,
                    dy3 = 3.324f,
                )
                // l 1.994 2.205z
                lineToRelative(dx = 1.994f, dy = 2.205f)
                close()
                // M 8.137 26.56
                moveTo(x = 8.137f, y = 26.56f)
                // c -0.855 0.552 -1.634 1.216 -1.634 2.299
                curveToRelative(
                    dx1 = -0.855f,
                    dy1 = 0.552f,
                    dx2 = -1.634f,
                    dy2 = 1.216f,
                    dx3 = -1.634f,
                    dy3 = 2.299f,
                )
                // c 0 1.197 0.817 1.862 1.976 1.862
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.197f,
                    dx2 = 0.817f,
                    dy2 = 1.862f,
                    dx3 = 1.976f,
                    dy3 = 1.862f,
                )
                // c 1.025 0 1.69 -0.418 2.413 -1.102
                curveToRelative(
                    dx1 = 1.025f,
                    dy1 = 0.0f,
                    dx2 = 1.69f,
                    dy2 = -0.418f,
                    dx3 = 2.413f,
                    dy3 = -1.102f,
                )
                // L 8.137 26.56z
                lineTo(x = 8.137f, y = 26.56f)
                close()
                // M 9.372 21.412
                moveTo(x = 9.372f, y = 21.412f)
                // c -0.494 0 -1.14 0.379 -1.14 0.949
                curveToRelative(
                    dx1 = -0.494f,
                    dy1 = 0.0f,
                    dx2 = -1.14f,
                    dy2 = 0.379f,
                    dx3 = -1.14f,
                    dy3 = 0.949f,
                )
                // s 0.266 0.912 1.007 1.634
                reflectiveCurveToRelative(
                    dx1 = 0.266f,
                    dy1 = 0.912f,
                    dx2 = 1.007f,
                    dy2 = 1.634f,
                )
                // c 0.57 -0.285 1.387 -0.798 1.387 -1.481
                curveToRelative(
                    dx1 = 0.57f,
                    dy1 = -0.285f,
                    dx2 = 1.387f,
                    dy2 = -0.798f,
                    dx3 = 1.387f,
                    dy3 = -1.481f,
                )
                // c 0 -0.856 -0.76 -1.102 -1.254 -1.102z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.856f,
                    dx2 = -0.76f,
                    dy2 = -1.102f,
                    dx3 = -1.254f,
                    dy3 = -1.102f,
                )
                close()
                // M 19.73 22.323
                moveTo(x = 19.73f, y = 22.323f)
                // c 0 -1.652 1.234 -3.077 2.926 -3.077
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.652f,
                    dx2 = 1.234f,
                    dy2 = -3.077f,
                    dx3 = 2.926f,
                    dy3 = -3.077f,
                )
                // c 1.689 0 2.925 1.425 2.925 3.077
                curveToRelative(
                    dx1 = 1.689f,
                    dy1 = 0.0f,
                    dx2 = 2.925f,
                    dy2 = 1.425f,
                    dx3 = 2.925f,
                    dy3 = 3.077f,
                )
                // c 0 1.653 -1.235 3.059 -2.925 3.059
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.653f,
                    dx2 = -1.235f,
                    dy2 = 3.059f,
                    dx3 = -2.925f,
                    dy3 = 3.059f,
                )
                // c -1.691 0 -2.926 -1.405 -2.926 -3.059z
                curveToRelative(
                    dx1 = -1.691f,
                    dy1 = 0.0f,
                    dx2 = -2.926f,
                    dy2 = -1.405f,
                    dx3 = -2.926f,
                    dy3 = -3.059f,
                )
                close()
                // M 23.644 22.323
                moveTo(x = 23.644f, y = 22.323f)
                // c 0 -0.607 -0.36 -1.14 -0.987 -1.14
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.607f,
                    dx2 = -0.36f,
                    dy2 = -1.14f,
                    dx3 = -0.987f,
                    dy3 = -1.14f,
                )
                // s -0.988 0.532 -0.988 1.14
                reflectiveCurveToRelative(
                    dx1 = -0.988f,
                    dy1 = 0.532f,
                    dx2 = -0.988f,
                    dy2 = 1.14f,
                )
                // c 0 0.608 0.361 1.121 0.988 1.121
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.608f,
                    dx2 = 0.361f,
                    dy2 = 1.121f,
                    dx3 = 0.988f,
                    dy3 = 1.121f,
                )
                // c 0.626 0 0.987 -0.512 0.987 -1.121z
                curveToRelative(
                    dx1 = 0.626f,
                    dy1 = 0.0f,
                    dx2 = 0.987f,
                    dy2 = -0.512f,
                    dx3 = 0.987f,
                    dy3 = -1.121f,
                )
                close()
                // M 28.26 19.74
                moveTo(x = 28.26f, y = 19.74f)
                // c 0.247 -0.475 0.438 -0.608 0.874 -0.608
                curveToRelative(
                    dx1 = 0.247f,
                    dy1 = -0.475f,
                    dx2 = 0.438f,
                    dy2 = -0.608f,
                    dx3 = 0.874f,
                    dy3 = -0.608f,
                )
                // c 0.589 0 1.12 0.476 1.12 1.063
                curveToRelative(
                    dx1 = 0.589f,
                    dy1 = 0.0f,
                    dx2 = 1.12f,
                    dy2 = 0.476f,
                    dx3 = 1.12f,
                    dy3 = 1.063f,
                )
                // c 0 0.152 0 0.285 -0.151 0.57
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.152f,
                    dx2 = 0.0f,
                    dy2 = 0.285f,
                    dx3 = -0.151f,
                    dy3 = 0.57f,
                )
                // l -6.384 11.949
                lineToRelative(dx = -6.384f, dy = 11.949f)
                // c -0.284 0.399 -0.399 0.627 -0.854 0.627
                curveToRelative(
                    dx1 = -0.284f,
                    dy1 = 0.399f,
                    dx2 = -0.399f,
                    dy2 = 0.627f,
                    dx3 = -0.854f,
                    dy3 = 0.627f,
                )
                // c -0.494 0 -1.084 -0.475 -1.084 -1.045
                curveToRelative(
                    dx1 = -0.494f,
                    dy1 = 0.0f,
                    dx2 = -1.084f,
                    dy2 = -0.475f,
                    dx3 = -1.084f,
                    dy3 = -1.045f,
                )
                // c 0 -0.285 0.114 -0.551 0.19 -0.703
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.285f,
                    dx2 = 0.114f,
                    dy2 = -0.551f,
                    dx3 = 0.19f,
                    dy3 = -0.703f,
                )
                // L 28.26 19.74z
                lineTo(x = 28.26f, y = 19.74f)
                close()
                // M 26.417 30.169
                moveTo(x = 26.417f, y = 30.169f)
                // c 0 -1.652 1.235 -3.077 2.926 -3.077
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.652f,
                    dx2 = 1.235f,
                    dy2 = -3.077f,
                    dx3 = 2.926f,
                    dy3 = -3.077f,
                )
                // c 1.69 0 2.925 1.425 2.925 3.077
                curveToRelative(
                    dx1 = 1.69f,
                    dy1 = 0.0f,
                    dx2 = 2.925f,
                    dy2 = 1.425f,
                    dx3 = 2.925f,
                    dy3 = 3.077f,
                )
                // c 0 1.653 -1.234 3.059 -2.925 3.059
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.653f,
                    dx2 = -1.234f,
                    dy2 = 3.059f,
                    dx3 = -2.925f,
                    dy3 = 3.059f,
                )
                // c -1.691 0 -2.926 -1.406 -2.926 -3.059z
                curveToRelative(
                    dx1 = -1.691f,
                    dy1 = 0.0f,
                    dx2 = -2.926f,
                    dy2 = -1.406f,
                    dx3 = -2.926f,
                    dy3 = -3.059f,
                )
                close()
                // M 30.33 30.169
                moveTo(x = 30.33f, y = 30.169f)
                // c 0 -0.607 -0.36 -1.14 -0.987 -1.14
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.607f,
                    dx2 = -0.36f,
                    dy2 = -1.14f,
                    dx3 = -0.987f,
                    dy3 = -1.14f,
                )
                // s -0.987 0.532 -0.987 1.14
                reflectiveCurveToRelative(
                    dx1 = -0.987f,
                    dy1 = 0.532f,
                    dx2 = -0.987f,
                    dy2 = 1.14f,
                )
                // c 0 0.608 0.36 1.121 0.987 1.121
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.608f,
                    dx2 = 0.36f,
                    dy2 = 1.121f,
                    dx3 = 0.987f,
                    dy3 = 1.121f,
                )
                // s 0.987 -0.513 0.987 -1.121z
                reflectiveCurveToRelative(
                    dx1 = 0.987f,
                    dy1 = -0.513f,
                    dx2 = 0.987f,
                    dy2 = -1.121f,
                )
                close()
                // M 3 3
                moveTo(x = 3.0f, y = 3.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // L 3 6z
                lineTo(x = 3.0f, y = 6.0f)
                close()
                // M 17 9
                moveTo(x = 17.0f, y = 9.0f)
                // L 3 9
                lineTo(x = 3.0f, y = 9.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // h 5z
                horizontalLineToRelative(dx = 5.0f)
                close()
                // M 32 5
                moveTo(x = 32.0f, y = 5.0f)
                // l -5 -2
                lineToRelative(dx = -5.0f, dy = -2.0f)
                // v 8.203
                verticalLineToRelative(dy = 8.203f)
                // c -0.538 -0.126 -1.19 -0.203 -2 -0.203
                curveToRelative(
                    dx1 = -0.538f,
                    dy1 = -0.126f,
                    dx2 = -1.19f,
                    dy2 = -0.203f,
                    dx3 = -2.0f,
                    dy3 = -0.203f,
                )
                // c -2 0 -4 2 -4 4
                curveToRelative(
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = 2.0f,
                    dx3 = -4.0f,
                    dy3 = 4.0f,
                )
                // c 0 1 1 2 3 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.0f,
                    dx2 = 1.0f,
                    dy2 = 2.0f,
                    dx3 = 3.0f,
                    dy3 = 2.0f,
                )
                // c 3 0 5 -2 5 -4
                curveToRelative(
                    dx1 = 3.0f,
                    dy1 = 0.0f,
                    dx2 = 5.0f,
                    dy2 = -2.0f,
                    dx3 = 5.0f,
                    dy3 = -4.0f,
                )
                // L 29 6.8
                lineTo(x = 29.0f, y = 6.8f)
                // L 32 8
                lineTo(x = 32.0f, y = 8.0f)
                // L 32 5z
                lineTo(x = 32.0f, y = 5.0f)
                close()
            }
        }.build().also { _emoji1f523 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f523: ImageVector? = null
