package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f54d: ImageVector
    get() {
        val current = _emoji1f54d
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f54d",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M26 9 l-8 -8 -8 8 v27 h16z
            path(
                fill = SolidColor(Color(0xFFA7A9AC)),
            ) {
                // M 26 9
                moveTo(x = 26.0f, y = 9.0f)
                // l -8 -8
                lineToRelative(dx = -8.0f, dy = -8.0f)
                // l -8 8
                lineToRelative(dx = -8.0f, dy = 8.0f)
                // v 27
                verticalLineToRelative(dy = 27.0f)
                // h 16z
                horizontalLineToRelative(dx = 16.0f)
                close()
            }
            // M26 10 c-0.256 0 -0.512 -0.098 -0.707 -0.293 L18 2.414 l-7.293 7.293 c-0.391 0.391 -1.023 0.391 -1.414 0 s-0.391 -1.023 0 -1.414 l8 -8 c0.391 -0.391 1.023 -0.391 1.414 0 l8 8 c0.391 0.391 0.391 1.023 0 1.414 -0.195 0.195 -0.451 0.293 -0.707 0.293z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 26 10
                moveTo(x = 26.0f, y = 10.0f)
                // c -0.256 0 -0.512 -0.098 -0.707 -0.293
                curveToRelative(
                    dx1 = -0.256f,
                    dy1 = 0.0f,
                    dx2 = -0.512f,
                    dy2 = -0.098f,
                    dx3 = -0.707f,
                    dy3 = -0.293f,
                )
                // L 18 2.414
                lineTo(x = 18.0f, y = 2.414f)
                // l -7.293 7.293
                lineToRelative(dx = -7.293f, dy = 7.293f)
                // c -0.391 0.391 -1.023 0.391 -1.414 0
                curveToRelative(
                    dx1 = -0.391f,
                    dy1 = 0.391f,
                    dx2 = -1.023f,
                    dy2 = 0.391f,
                    dx3 = -1.414f,
                    dy3 = 0.0f,
                )
                // s -0.391 -1.023 0 -1.414
                reflectiveCurveToRelative(
                    dx1 = -0.391f,
                    dy1 = -1.023f,
                    dx2 = 0.0f,
                    dy2 = -1.414f,
                )
                // l 8 -8
                lineToRelative(dx = 8.0f, dy = -8.0f)
                // c 0.391 -0.391 1.023 -0.391 1.414 0
                curveToRelative(
                    dx1 = 0.391f,
                    dy1 = -0.391f,
                    dx2 = 1.023f,
                    dy2 = -0.391f,
                    dx3 = 1.414f,
                    dy3 = 0.0f,
                )
                // l 8 8
                lineToRelative(dx = 8.0f, dy = 8.0f)
                // c 0.391 0.391 0.391 1.023 0 1.414
                curveToRelative(
                    dx1 = 0.391f,
                    dy1 = 0.391f,
                    dx2 = 0.391f,
                    dy2 = 1.023f,
                    dx3 = 0.0f,
                    dy3 = 1.414f,
                )
                // c -0.195 0.195 -0.451 0.293 -0.707 0.293z
                curveToRelative(
                    dx1 = -0.195f,
                    dy1 = 0.195f,
                    dx2 = -0.451f,
                    dy2 = 0.293f,
                    dx3 = -0.707f,
                    dy3 = 0.293f,
                )
                close()
            }
            // M11 36 H4 c-1.104 0 -2 -0.896 -2 -2 V20 c0 -1.104 0.896 -2 2 -2 h5 c1.104 0 2 0.896 2 2 v16z
            path(
                fill = SolidColor(Color(0xFFD1D3D4)),
            ) {
                // M 11 36
                moveTo(x = 11.0f, y = 36.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // c -1.104 0 -2 -0.896 -2 -2
                curveToRelative(
                    dx1 = -1.104f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -0.896f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // V 20
                verticalLineTo(y = 20.0f)
                // c 0 -1.104 0.896 -2 2 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.104f,
                    dx2 = 0.896f,
                    dy2 = -2.0f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // c 1.104 0 2 0.896 2 2
                curveToRelative(
                    dx1 = 1.104f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 0.896f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                // v 16z
                verticalLineToRelative(dy = 16.0f)
                close()
            }
            // M12 19.785 c0.171 -0.662 0.005 -1.395 -0.514 -1.914 L7.95 14.336 c-0.781 -0.781 -2.047 -0.781 -2.828 0 l-3.536 3.536 c-0.52 0.519 -0.686 1.251 -0.514 1.914 H12z
            path(
                fill = SolidColor(Color(0xFF67757F)),
            ) {
                // M 12 19.785
                moveTo(x = 12.0f, y = 19.785f)
                // c 0.171 -0.662 0.005 -1.395 -0.514 -1.914
                curveToRelative(
                    dx1 = 0.171f,
                    dy1 = -0.662f,
                    dx2 = 0.005f,
                    dy2 = -1.395f,
                    dx3 = -0.514f,
                    dy3 = -1.914f,
                )
                // L 7.95 14.336
                lineTo(x = 7.95f, y = 14.336f)
                // c -0.781 -0.781 -2.047 -0.781 -2.828 0
                curveToRelative(
                    dx1 = -0.781f,
                    dy1 = -0.781f,
                    dx2 = -2.047f,
                    dy2 = -0.781f,
                    dx3 = -2.828f,
                    dy3 = 0.0f,
                )
                // l -3.536 3.536
                lineToRelative(dx = -3.536f, dy = 3.536f)
                // c -0.52 0.519 -0.686 1.251 -0.514 1.914
                curveToRelative(
                    dx1 = -0.52f,
                    dy1 = 0.519f,
                    dx2 = -0.686f,
                    dy2 = 1.251f,
                    dx3 = -0.514f,
                    dy3 = 1.914f,
                )
                // H 12z
                horizontalLineTo(x = 12.0f)
                close()
            }
            // M2 20 h9 v1 L2 21z M25 36 h7 c1.104 0 2 -0.896 2 -2 L34 20 c0 -1.104 -0.896 -2 -2 -2 h-5 c-1.104 0 -2 0.896 -2 2 v16z
            path(
                fill = SolidColor(Color(0xFFD1D3D4)),
            ) {
                // M 2 20
                moveTo(x = 2.0f, y = 20.0f)
                // h 9
                horizontalLineToRelative(dx = 9.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // L 2 21z
                lineTo(x = 2.0f, y = 21.0f)
                close()
                // M 25 36
                moveTo(x = 25.0f, y = 36.0f)
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // c 1.104 0 2 -0.896 2 -2
                curveToRelative(
                    dx1 = 1.104f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = -0.896f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // L 34 20
                lineTo(x = 34.0f, y = 20.0f)
                // c 0 -1.104 -0.896 -2 -2 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.104f,
                    dx2 = -0.896f,
                    dy2 = -2.0f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // c -1.104 0 -2 0.896 -2 2
                curveToRelative(
                    dx1 = -1.104f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = 0.896f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // v 16z
                verticalLineToRelative(dy = 16.0f)
                close()
            }
            // M34.936 19.785 c0.171 -0.662 0.005 -1.395 -0.515 -1.914 l-3.536 -3.536 c-0.78 -0.781 -2.047 -0.781 -2.828 0 l-3.535 3.536 c-0.519 0.519 -0.686 1.251 -0.514 1.914 h10.928z
            path(
                fill = SolidColor(Color(0xFF67757F)),
            ) {
                // M 34.936 19.785
                moveTo(x = 34.936f, y = 19.785f)
                // c 0.171 -0.662 0.005 -1.395 -0.515 -1.914
                curveToRelative(
                    dx1 = 0.171f,
                    dy1 = -0.662f,
                    dx2 = 0.005f,
                    dy2 = -1.395f,
                    dx3 = -0.515f,
                    dy3 = -1.914f,
                )
                // l -3.536 -3.536
                lineToRelative(dx = -3.536f, dy = -3.536f)
                // c -0.78 -0.781 -2.047 -0.781 -2.828 0
                curveToRelative(
                    dx1 = -0.78f,
                    dy1 = -0.781f,
                    dx2 = -2.047f,
                    dy2 = -0.781f,
                    dx3 = -2.828f,
                    dy3 = 0.0f,
                )
                // l -3.535 3.536
                lineToRelative(dx = -3.535f, dy = 3.536f)
                // c -0.519 0.519 -0.686 1.251 -0.514 1.914
                curveToRelative(
                    dx1 = -0.519f,
                    dy1 = 0.519f,
                    dx2 = -0.686f,
                    dy2 = 1.251f,
                    dx3 = -0.514f,
                    dy3 = 1.914f,
                )
                // h 10.928z
                horizontalLineToRelative(dx = 10.928f)
                close()
            }
            // M25 20 h9 v1 h-9z
            path(
                fill = SolidColor(Color(0xFFD1D3D4)),
            ) {
                // M 25 20
                moveTo(x = 25.0f, y = 20.0f)
                // h 9
                horizontalLineToRelative(dx = 9.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // h -9z
                horizontalLineToRelative(dx = -9.0f)
                close()
            }
            // M12 19.785 c0 0.553 -0.448 1 -1 1 L2 20.785 c-0.552 0 -1 -0.447 -1 -1 0 -0.552 0.448 -1 1 -1 h9 c0.552 0 1 0.448 1 1z M35 19.785 c0 0.553 -0.447 1 -1 1 h-9 c-0.553 0 -1 -0.447 -1 -1 0 -0.552 0.447 -1 1 -1 h9 c0.553 0 1 0.448 1 1z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 12 19.785
                moveTo(x = 12.0f, y = 19.785f)
                // c 0 0.553 -0.448 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.448f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // L 2 20.785
                lineTo(x = 2.0f, y = 20.785f)
                // c -0.552 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // c 0 -0.552 0.448 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = 0.448f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 9
                horizontalLineToRelative(dx = 9.0f)
                // c 0.552 0 1 0.448 1 1z
                curveToRelative(
                    dx1 = 0.552f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.448f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                close()
                // M 35 19.785
                moveTo(x = 35.0f, y = 19.785f)
                // c 0 0.553 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // h -9
                horizontalLineToRelative(dx = -9.0f)
                // c -0.553 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.553f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // c 0 -0.552 0.447 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = 0.447f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 9
                horizontalLineToRelative(dx = 9.0f)
                // c 0.553 0 1 0.448 1 1z
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.448f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                close()
            }
            // M17.799 20 c-0.693 0 -1.33 -0.388 -1.703 -1.038 l-0.672 -1.173 h-1.581 c-0.714 0 -1.34 -0.346 -1.676 -0.926 -0.345 -0.597 -0.326 -1.344 0.05 -1.999 l0.765 -1.335 -0.766 -1.336 c-0.377 -0.657 -0.395 -1.404 -0.049 -2 0.336 -0.579 0.962 -0.924 1.675 -0.924 h1.581 l0.671 -1.172 c0.375 -0.651 1.011 -1.039 1.704 -1.039 0.67 0 1.295 0.368 1.674 0.984 l0.757 1.227 h1.855 c0.726 0 1.356 0.353 1.685 0.945 0.337 0.603 0.3 1.354 -0.102 2.006 l-0.809 1.31 0.808 1.309 c0.401 0.651 0.439 1.401 0.102 2.007 -0.329 0.591 -0.958 0.944 -1.684 0.944 H20.23 l-0.76 1.23 c-0.375 0.613 -1.001 0.98 -1.671 0.98z
            path(
                fill = SolidColor(Color(0xFF67757F)),
            ) {
                // M 17.799 20
                moveTo(x = 17.799f, y = 20.0f)
                // c -0.693 0 -1.33 -0.388 -1.703 -1.038
                curveToRelative(
                    dx1 = -0.693f,
                    dy1 = 0.0f,
                    dx2 = -1.33f,
                    dy2 = -0.388f,
                    dx3 = -1.703f,
                    dy3 = -1.038f,
                )
                // l -0.672 -1.173
                lineToRelative(dx = -0.672f, dy = -1.173f)
                // h -1.581
                horizontalLineToRelative(dx = -1.581f)
                // c -0.714 0 -1.34 -0.346 -1.676 -0.926
                curveToRelative(
                    dx1 = -0.714f,
                    dy1 = 0.0f,
                    dx2 = -1.34f,
                    dy2 = -0.346f,
                    dx3 = -1.676f,
                    dy3 = -0.926f,
                )
                // c -0.345 -0.597 -0.326 -1.344 0.05 -1.999
                curveToRelative(
                    dx1 = -0.345f,
                    dy1 = -0.597f,
                    dx2 = -0.326f,
                    dy2 = -1.344f,
                    dx3 = 0.05f,
                    dy3 = -1.999f,
                )
                // l 0.765 -1.335
                lineToRelative(dx = 0.765f, dy = -1.335f)
                // l -0.766 -1.336
                lineToRelative(dx = -0.766f, dy = -1.336f)
                // c -0.377 -0.657 -0.395 -1.404 -0.049 -2
                curveToRelative(
                    dx1 = -0.377f,
                    dy1 = -0.657f,
                    dx2 = -0.395f,
                    dy2 = -1.404f,
                    dx3 = -0.049f,
                    dy3 = -2.0f,
                )
                // c 0.336 -0.579 0.962 -0.924 1.675 -0.924
                curveToRelative(
                    dx1 = 0.336f,
                    dy1 = -0.579f,
                    dx2 = 0.962f,
                    dy2 = -0.924f,
                    dx3 = 1.675f,
                    dy3 = -0.924f,
                )
                // h 1.581
                horizontalLineToRelative(dx = 1.581f)
                // l 0.671 -1.172
                lineToRelative(dx = 0.671f, dy = -1.172f)
                // c 0.375 -0.651 1.011 -1.039 1.704 -1.039
                curveToRelative(
                    dx1 = 0.375f,
                    dy1 = -0.651f,
                    dx2 = 1.011f,
                    dy2 = -1.039f,
                    dx3 = 1.704f,
                    dy3 = -1.039f,
                )
                // c 0.67 0 1.295 0.368 1.674 0.984
                curveToRelative(
                    dx1 = 0.67f,
                    dy1 = 0.0f,
                    dx2 = 1.295f,
                    dy2 = 0.368f,
                    dx3 = 1.674f,
                    dy3 = 0.984f,
                )
                // l 0.757 1.227
                lineToRelative(dx = 0.757f, dy = 1.227f)
                // h 1.855
                horizontalLineToRelative(dx = 1.855f)
                // c 0.726 0 1.356 0.353 1.685 0.945
                curveToRelative(
                    dx1 = 0.726f,
                    dy1 = 0.0f,
                    dx2 = 1.356f,
                    dy2 = 0.353f,
                    dx3 = 1.685f,
                    dy3 = 0.945f,
                )
                // c 0.337 0.603 0.3 1.354 -0.102 2.006
                curveToRelative(
                    dx1 = 0.337f,
                    dy1 = 0.603f,
                    dx2 = 0.3f,
                    dy2 = 1.354f,
                    dx3 = -0.102f,
                    dy3 = 2.006f,
                )
                // l -0.809 1.31
                lineToRelative(dx = -0.809f, dy = 1.31f)
                // l 0.808 1.309
                lineToRelative(dx = 0.808f, dy = 1.309f)
                // c 0.401 0.651 0.439 1.401 0.102 2.007
                curveToRelative(
                    dx1 = 0.401f,
                    dy1 = 0.651f,
                    dx2 = 0.439f,
                    dy2 = 1.401f,
                    dx3 = 0.102f,
                    dy3 = 2.007f,
                )
                // c -0.329 0.591 -0.958 0.944 -1.684 0.944
                curveToRelative(
                    dx1 = -0.329f,
                    dy1 = 0.591f,
                    dx2 = -0.958f,
                    dy2 = 0.944f,
                    dx3 = -1.684f,
                    dy3 = 0.944f,
                )
                // H 20.23
                horizontalLineTo(x = 20.23f)
                // l -0.76 1.23
                lineToRelative(dx = -0.76f, dy = 1.23f)
                // c -0.375 0.613 -1.001 0.98 -1.671 0.98z
                curveToRelative(
                    dx1 = -0.375f,
                    dy1 = 0.613f,
                    dx2 = -1.001f,
                    dy2 = 0.98f,
                    dx3 = -1.671f,
                    dy3 = 0.98f,
                )
                close()
            }
            // M17.799 19 c-0.336 0 -0.64 -0.195 -0.836 -0.536 l-3.878 -6.768 c-0.2 -0.348 -0.219 -0.714 -0.052 -1 0.157 -0.271 0.453 -0.427 0.811 -0.427 h8.242 c0.363 0 0.658 0.157 0.811 0.431 0.161 0.288 0.133 0.651 -0.079 0.996 l-4.196 6.799 c-0.199 0.32 -0.499 0.505 -0.823 0.505z M13.987 11.265 l3.814 6.658 4.108 -6.656 -7.922 -0.002z
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 17.799 19
                moveTo(x = 17.799f, y = 19.0f)
                // c -0.336 0 -0.64 -0.195 -0.836 -0.536
                curveToRelative(
                    dx1 = -0.336f,
                    dy1 = 0.0f,
                    dx2 = -0.64f,
                    dy2 = -0.195f,
                    dx3 = -0.836f,
                    dy3 = -0.536f,
                )
                // l -3.878 -6.768
                lineToRelative(dx = -3.878f, dy = -6.768f)
                // c -0.2 -0.348 -0.219 -0.714 -0.052 -1
                curveToRelative(
                    dx1 = -0.2f,
                    dy1 = -0.348f,
                    dx2 = -0.219f,
                    dy2 = -0.714f,
                    dx3 = -0.052f,
                    dy3 = -1.0f,
                )
                // c 0.157 -0.271 0.453 -0.427 0.811 -0.427
                curveToRelative(
                    dx1 = 0.157f,
                    dy1 = -0.271f,
                    dx2 = 0.453f,
                    dy2 = -0.427f,
                    dx3 = 0.811f,
                    dy3 = -0.427f,
                )
                // h 8.242
                horizontalLineToRelative(dx = 8.242f)
                // c 0.363 0 0.658 0.157 0.811 0.431
                curveToRelative(
                    dx1 = 0.363f,
                    dy1 = 0.0f,
                    dx2 = 0.658f,
                    dy2 = 0.157f,
                    dx3 = 0.811f,
                    dy3 = 0.431f,
                )
                // c 0.161 0.288 0.133 0.651 -0.079 0.996
                curveToRelative(
                    dx1 = 0.161f,
                    dy1 = 0.288f,
                    dx2 = 0.133f,
                    dy2 = 0.651f,
                    dx3 = -0.079f,
                    dy3 = 0.996f,
                )
                // l -4.196 6.799
                lineToRelative(dx = -4.196f, dy = 6.799f)
                // c -0.199 0.32 -0.499 0.505 -0.823 0.505z
                curveToRelative(
                    dx1 = -0.199f,
                    dy1 = 0.32f,
                    dx2 = -0.499f,
                    dy2 = 0.505f,
                    dx3 = -0.823f,
                    dy3 = 0.505f,
                )
                close()
                // M 13.987 11.265
                moveTo(x = 13.987f, y = 11.265f)
                // l 3.814 6.658
                lineToRelative(dx = 3.814f, dy = 6.658f)
                // l 4.108 -6.656
                lineToRelative(dx = 4.108f, dy = -6.656f)
                // l -7.922 -0.002z
                lineToRelative(dx = -7.922f, dy = -0.002f)
                close()
            }
            // M22.086 16.789 h-8.242 c-0.358 0 -0.653 -0.155 -0.811 -0.427 -0.167 -0.288 -0.148 -0.652 0.052 -1 l3.878 -6.769 c0.196 -0.34 0.5 -0.536 0.836 -0.536 0.323 0 0.624 0.185 0.822 0.507 l4.196 6.798 c0.212 0.344 0.24 0.706 0.079 0.995 -0.152 0.275 -0.447 0.432 -0.81 0.432z M13.988 15.791 l7.922 0.002 -4.108 -6.658 -3.814 6.656z
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 22.086 16.789
                moveTo(x = 22.086f, y = 16.789f)
                // h -8.242
                horizontalLineToRelative(dx = -8.242f)
                // c -0.358 0 -0.653 -0.155 -0.811 -0.427
                curveToRelative(
                    dx1 = -0.358f,
                    dy1 = 0.0f,
                    dx2 = -0.653f,
                    dy2 = -0.155f,
                    dx3 = -0.811f,
                    dy3 = -0.427f,
                )
                // c -0.167 -0.288 -0.148 -0.652 0.052 -1
                curveToRelative(
                    dx1 = -0.167f,
                    dy1 = -0.288f,
                    dx2 = -0.148f,
                    dy2 = -0.652f,
                    dx3 = 0.052f,
                    dy3 = -1.0f,
                )
                // l 3.878 -6.769
                lineToRelative(dx = 3.878f, dy = -6.769f)
                // c 0.196 -0.34 0.5 -0.536 0.836 -0.536
                curveToRelative(
                    dx1 = 0.196f,
                    dy1 = -0.34f,
                    dx2 = 0.5f,
                    dy2 = -0.536f,
                    dx3 = 0.836f,
                    dy3 = -0.536f,
                )
                // c 0.323 0 0.624 0.185 0.822 0.507
                curveToRelative(
                    dx1 = 0.323f,
                    dy1 = 0.0f,
                    dx2 = 0.624f,
                    dy2 = 0.185f,
                    dx3 = 0.822f,
                    dy3 = 0.507f,
                )
                // l 4.196 6.798
                lineToRelative(dx = 4.196f, dy = 6.798f)
                // c 0.212 0.344 0.24 0.706 0.079 0.995
                curveToRelative(
                    dx1 = 0.212f,
                    dy1 = 0.344f,
                    dx2 = 0.24f,
                    dy2 = 0.706f,
                    dx3 = 0.079f,
                    dy3 = 0.995f,
                )
                // c -0.152 0.275 -0.447 0.432 -0.81 0.432z
                curveToRelative(
                    dx1 = -0.152f,
                    dy1 = 0.275f,
                    dx2 = -0.447f,
                    dy2 = 0.432f,
                    dx3 = -0.81f,
                    dy3 = 0.432f,
                )
                close()
                // M 13.988 15.791
                moveTo(x = 13.988f, y = 15.791f)
                // l 7.922 0.002
                lineToRelative(dx = 7.922f, dy = 0.002f)
                // l -4.108 -6.658
                lineToRelative(dx = -4.108f, dy = -6.658f)
                // l -3.814 6.656z
                lineToRelative(dx = -3.814f, dy = 6.656f)
                close()
            }
            // M15 27.531 h6 V34 h-6z
            path(
                fill = SolidColor(Color(0xFF67757F)),
            ) {
                // M 15 27.531
                moveTo(x = 15.0f, y = 27.531f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // V 34
                verticalLineTo(y = 34.0f)
                // h -6z
                horizontalLineToRelative(dx = -6.0f)
                close()
            }
            // M15 27.5 a3 2.5 0 1 0 6 0 a3 2.5 0 1 0 -6 0z
            path(
                fill = SolidColor(Color(0xFF67757F)),
            ) {
                // M 15 27.5
                moveTo(x = 15.0f, y = 27.5f)
                // a 3 2.5 0 1 0 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // a 3 2.5 0 1 0 -6 0z
                arcToRelative(
                    a = 3.0f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M10 34 h16 v2 H10z
            path(
                fill = SolidColor(Color(0xFFD1D3D4)),
            ) {
                // M 10 34
                moveTo(x = 10.0f, y = 34.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 10z
                horizontalLineTo(x = 10.0f)
                close()
            }
            // M8 28.785 c0 0.828 -0.671 -1 -1.5 -1 s-1.5 1.828 -1.5 1 v-4.5 c0 -0.828 0.671 -1.5 1.5 -1.5 s1.5 0.672 1.5 1.5 v4.5z M31 28.785 c0 0.828 -0.672 -1 -1.5 -1 s-1.5 1.828 -1.5 1 v-4.5 c0 -0.828 0.672 -1.5 1.5 -1.5 s1.5 0.672 1.5 1.5 v4.5z
            path(
                fill = SolidColor(Color(0xFF67757F)),
            ) {
                // M 8 28.785
                moveTo(x = 8.0f, y = 28.785f)
                // c 0 0.828 -0.671 -1 -1.5 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.828f,
                    dx2 = -0.671f,
                    dy2 = -1.0f,
                    dx3 = -1.5f,
                    dy3 = -1.0f,
                )
                // s -1.5 1.828 -1.5 1
                reflectiveCurveToRelative(
                    dx1 = -1.5f,
                    dy1 = 1.828f,
                    dx2 = -1.5f,
                    dy2 = 1.0f,
                )
                // v -4.5
                verticalLineToRelative(dy = -4.5f)
                // c 0 -0.828 0.671 -1.5 1.5 -1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.828f,
                    dx2 = 0.671f,
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
                // v 4.5z
                verticalLineToRelative(dy = 4.5f)
                close()
                // M 31 28.785
                moveTo(x = 31.0f, y = 28.785f)
                // c 0 0.828 -0.672 -1 -1.5 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.828f,
                    dx2 = -0.672f,
                    dy2 = -1.0f,
                    dx3 = -1.5f,
                    dy3 = -1.0f,
                )
                // s -1.5 1.828 -1.5 1
                reflectiveCurveToRelative(
                    dx1 = -1.5f,
                    dy1 = 1.828f,
                    dx2 = -1.5f,
                    dy2 = 1.0f,
                )
                // v -4.5
                verticalLineToRelative(dy = -4.5f)
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
                // v 4.5z
                verticalLineToRelative(dy = 4.5f)
                close()
            }
        }.build().also { _emoji1f54d = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f54d: ImageVector? = null
