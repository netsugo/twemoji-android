package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji2638: ImageVector
    get() {
        val current = _emoji2638
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji2638",
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
            // M32 17 h-1.051 c-0.217 -2.832 -1.341 -5.411 -3.088 -7.447 l1.159 -1.159 c0.391 -0.391 0.391 -1.023 0 -1.414 s-1.023 -0.391 -1.414 0 l-1.159 1.159 C24.411 6.392 21.833 5.268 19 5.051 L19 4 c0 -0.552 -0.447 -1 -1 -1 s-1 0.448 -1 1 v1.051 c-2.833 0.217 -5.411 1.341 -7.448 3.088 L8.487 7.073 c-0.391 -0.391 -1.023 -0.391 -1.414 0 s-0.391 1.023 0 1.414 l1.066 1.066 C6.391 11.589 5.268 14.168 5.051 17 L4 17 c-0.552 0 -1 0.447 -1 1 s0.448 1 1 1 h1.051 c0.217 2.833 1.341 5.411 3.088 7.447 L6.98 27.606 c-0.391 0.391 -0.391 1.023 0 1.414 0.195 0.195 0.451 0.293 0.707 0.293 s0.512 -0.098 0.707 -0.293 l1.159 -1.159 c2.036 1.747 4.615 2.871 7.447 3.088 L17 32 c0 0.553 0.447 1 1 1 s1 -0.447 1 -1 v-1.051 c2.832 -0.217 5.41 -1.341 7.447 -3.088 l1.066 1.066 c0.195 0.195 0.451 0.293 0.707 0.293 s0.512 -0.098 0.707 -0.293 c0.391 -0.391 0.391 -1.023 0 -1.414 l-1.066 -1.066 c1.747 -2.037 2.871 -4.615 3.088 -7.448 L32 18.999 c0.553 0 1 -0.447 1 -1 S32.553 17 32 17z M26.448 10.967 c1.391 1.667 2.294 3.751 2.501 6.033 h-6.04 c-0.119 -0.649 -0.363 -1.252 -0.707 -1.788 l4.246 -4.245z M19 7.051 c2.283 0.207 4.366 1.111 6.034 2.501 l-4.22 4.22 c-0.539 -0.369 -1.152 -0.636 -1.814 -0.771 v-5.95z M21 17.9 c0 1.654 -1.346 3 -3 3 s-3 -1.346 -3 -3 1.346 -3 3 -3 3 1.346 3 3z M17 7.051 v5.95 c-0.662 0.135 -1.275 0.402 -1.814 0.771 l-4.22 -4.22 c1.667 -1.39 3.751 -2.294 6.034 -2.501z M9.552 10.967 l4.246 4.246 c-0.344 0.536 -0.588 1.139 -0.707 1.788 h-6.04 c0.207 -2.284 1.11 -4.367 2.501 -6.034z M9.552 25.034 C8.161 23.366 7.258 21.283 7.051 19 h6.08 c0.141 0.622 0.392 1.203 0.741 1.714 l-4.32 4.32z M17 28.949 c-2.283 -0.207 -4.366 -1.111 -6.034 -2.501 l4.345 -4.345 c0.509 0.327 1.076 0.572 1.688 0.697 v6.149z M19 28.949 v-6.15 c0.612 -0.125 1.179 -0.37 1.688 -0.697 l4.345 4.346 c-1.667 1.391 -3.75 2.294 -6.033 2.501z M26.447 25.034 l-4.32 -4.32 c0.35 -0.511 0.601 -1.092 0.741 -1.715 h6.08 c-0.206 2.284 -1.11 4.368 -2.501 6.035z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 32 17
                moveTo(x = 32.0f, y = 17.0f)
                // h -1.051
                horizontalLineToRelative(dx = -1.051f)
                // c -0.217 -2.832 -1.341 -5.411 -3.088 -7.447
                curveToRelative(
                    dx1 = -0.217f,
                    dy1 = -2.832f,
                    dx2 = -1.341f,
                    dy2 = -5.411f,
                    dx3 = -3.088f,
                    dy3 = -7.447f,
                )
                // l 1.159 -1.159
                lineToRelative(dx = 1.159f, dy = -1.159f)
                // c 0.391 -0.391 0.391 -1.023 0 -1.414
                curveToRelative(
                    dx1 = 0.391f,
                    dy1 = -0.391f,
                    dx2 = 0.391f,
                    dy2 = -1.023f,
                    dx3 = 0.0f,
                    dy3 = -1.414f,
                )
                // s -1.023 -0.391 -1.414 0
                reflectiveCurveToRelative(
                    dx1 = -1.023f,
                    dy1 = -0.391f,
                    dx2 = -1.414f,
                    dy2 = 0.0f,
                )
                // l -1.159 1.159
                lineToRelative(dx = -1.159f, dy = 1.159f)
                // C 24.411 6.392 21.833 5.268 19 5.051
                curveTo(
                    x1 = 24.411f,
                    y1 = 6.392f,
                    x2 = 21.833f,
                    y2 = 5.268f,
                    x3 = 19.0f,
                    y3 = 5.051f,
                )
                // L 19 4
                lineTo(x = 19.0f, y = 4.0f)
                // c 0 -0.552 -0.447 -1 -1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = -0.447f,
                    dy2 = -1.0f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // s -1 0.448 -1 1
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.448f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                // v 1.051
                verticalLineToRelative(dy = 1.051f)
                // c -2.833 0.217 -5.411 1.341 -7.448 3.088
                curveToRelative(
                    dx1 = -2.833f,
                    dy1 = 0.217f,
                    dx2 = -5.411f,
                    dy2 = 1.341f,
                    dx3 = -7.448f,
                    dy3 = 3.088f,
                )
                // L 8.487 7.073
                lineTo(x = 8.487f, y = 7.073f)
                // c -0.391 -0.391 -1.023 -0.391 -1.414 0
                curveToRelative(
                    dx1 = -0.391f,
                    dy1 = -0.391f,
                    dx2 = -1.023f,
                    dy2 = -0.391f,
                    dx3 = -1.414f,
                    dy3 = 0.0f,
                )
                // s -0.391 1.023 0 1.414
                reflectiveCurveToRelative(
                    dx1 = -0.391f,
                    dy1 = 1.023f,
                    dx2 = 0.0f,
                    dy2 = 1.414f,
                )
                // l 1.066 1.066
                lineToRelative(dx = 1.066f, dy = 1.066f)
                // C 6.391 11.589 5.268 14.168 5.051 17
                curveTo(
                    x1 = 6.391f,
                    y1 = 11.589f,
                    x2 = 5.268f,
                    y2 = 14.168f,
                    x3 = 5.051f,
                    y3 = 17.0f,
                )
                // L 4 17
                lineTo(x = 4.0f, y = 17.0f)
                // c -0.552 0 -1 0.447 -1 1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = 0.447f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // s 0.448 1 1 1
                reflectiveCurveToRelative(
                    dx1 = 0.448f,
                    dy1 = 1.0f,
                    dx2 = 1.0f,
                    dy2 = 1.0f,
                )
                // h 1.051
                horizontalLineToRelative(dx = 1.051f)
                // c 0.217 2.833 1.341 5.411 3.088 7.447
                curveToRelative(
                    dx1 = 0.217f,
                    dy1 = 2.833f,
                    dx2 = 1.341f,
                    dy2 = 5.411f,
                    dx3 = 3.088f,
                    dy3 = 7.447f,
                )
                // L 6.98 27.606
                lineTo(x = 6.98f, y = 27.606f)
                // c -0.391 0.391 -0.391 1.023 0 1.414
                curveToRelative(
                    dx1 = -0.391f,
                    dy1 = 0.391f,
                    dx2 = -0.391f,
                    dy2 = 1.023f,
                    dx3 = 0.0f,
                    dy3 = 1.414f,
                )
                // c 0.195 0.195 0.451 0.293 0.707 0.293
                curveToRelative(
                    dx1 = 0.195f,
                    dy1 = 0.195f,
                    dx2 = 0.451f,
                    dy2 = 0.293f,
                    dx3 = 0.707f,
                    dy3 = 0.293f,
                )
                // s 0.512 -0.098 0.707 -0.293
                reflectiveCurveToRelative(
                    dx1 = 0.512f,
                    dy1 = -0.098f,
                    dx2 = 0.707f,
                    dy2 = -0.293f,
                )
                // l 1.159 -1.159
                lineToRelative(dx = 1.159f, dy = -1.159f)
                // c 2.036 1.747 4.615 2.871 7.447 3.088
                curveToRelative(
                    dx1 = 2.036f,
                    dy1 = 1.747f,
                    dx2 = 4.615f,
                    dy2 = 2.871f,
                    dx3 = 7.447f,
                    dy3 = 3.088f,
                )
                // L 17 32
                lineTo(x = 17.0f, y = 32.0f)
                // c 0 0.553 0.447 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = 0.447f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // s 1 -0.447 1 -1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = -0.447f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // v -1.051
                verticalLineToRelative(dy = -1.051f)
                // c 2.832 -0.217 5.41 -1.341 7.447 -3.088
                curveToRelative(
                    dx1 = 2.832f,
                    dy1 = -0.217f,
                    dx2 = 5.41f,
                    dy2 = -1.341f,
                    dx3 = 7.447f,
                    dy3 = -3.088f,
                )
                // l 1.066 1.066
                lineToRelative(dx = 1.066f, dy = 1.066f)
                // c 0.195 0.195 0.451 0.293 0.707 0.293
                curveToRelative(
                    dx1 = 0.195f,
                    dy1 = 0.195f,
                    dx2 = 0.451f,
                    dy2 = 0.293f,
                    dx3 = 0.707f,
                    dy3 = 0.293f,
                )
                // s 0.512 -0.098 0.707 -0.293
                reflectiveCurveToRelative(
                    dx1 = 0.512f,
                    dy1 = -0.098f,
                    dx2 = 0.707f,
                    dy2 = -0.293f,
                )
                // c 0.391 -0.391 0.391 -1.023 0 -1.414
                curveToRelative(
                    dx1 = 0.391f,
                    dy1 = -0.391f,
                    dx2 = 0.391f,
                    dy2 = -1.023f,
                    dx3 = 0.0f,
                    dy3 = -1.414f,
                )
                // l -1.066 -1.066
                lineToRelative(dx = -1.066f, dy = -1.066f)
                // c 1.747 -2.037 2.871 -4.615 3.088 -7.448
                curveToRelative(
                    dx1 = 1.747f,
                    dy1 = -2.037f,
                    dx2 = 2.871f,
                    dy2 = -4.615f,
                    dx3 = 3.088f,
                    dy3 = -7.448f,
                )
                // L 32 18.999
                lineTo(x = 32.0f, y = 18.999f)
                // c 0.553 0 1 -0.447 1 -1
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -0.447f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // S 32.553 17 32 17z
                reflectiveCurveTo(
                    x1 = 32.553f,
                    y1 = 17.0f,
                    x2 = 32.0f,
                    y2 = 17.0f,
                )
                close()
                // M 26.448 10.967
                moveTo(x = 26.448f, y = 10.967f)
                // c 1.391 1.667 2.294 3.751 2.501 6.033
                curveToRelative(
                    dx1 = 1.391f,
                    dy1 = 1.667f,
                    dx2 = 2.294f,
                    dy2 = 3.751f,
                    dx3 = 2.501f,
                    dy3 = 6.033f,
                )
                // h -6.04
                horizontalLineToRelative(dx = -6.04f)
                // c -0.119 -0.649 -0.363 -1.252 -0.707 -1.788
                curveToRelative(
                    dx1 = -0.119f,
                    dy1 = -0.649f,
                    dx2 = -0.363f,
                    dy2 = -1.252f,
                    dx3 = -0.707f,
                    dy3 = -1.788f,
                )
                // l 4.246 -4.245z
                lineToRelative(dx = 4.246f, dy = -4.245f)
                close()
                // M 19 7.051
                moveTo(x = 19.0f, y = 7.051f)
                // c 2.283 0.207 4.366 1.111 6.034 2.501
                curveToRelative(
                    dx1 = 2.283f,
                    dy1 = 0.207f,
                    dx2 = 4.366f,
                    dy2 = 1.111f,
                    dx3 = 6.034f,
                    dy3 = 2.501f,
                )
                // l -4.22 4.22
                lineToRelative(dx = -4.22f, dy = 4.22f)
                // c -0.539 -0.369 -1.152 -0.636 -1.814 -0.771
                curveToRelative(
                    dx1 = -0.539f,
                    dy1 = -0.369f,
                    dx2 = -1.152f,
                    dy2 = -0.636f,
                    dx3 = -1.814f,
                    dy3 = -0.771f,
                )
                // v -5.95z
                verticalLineToRelative(dy = -5.95f)
                close()
                // M 21 17.9
                moveTo(x = 21.0f, y = 17.9f)
                // c 0 1.654 -1.346 3 -3 3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.654f,
                    dx2 = -1.346f,
                    dy2 = 3.0f,
                    dx3 = -3.0f,
                    dy3 = 3.0f,
                )
                // s -3 -1.346 -3 -3
                reflectiveCurveToRelative(
                    dx1 = -3.0f,
                    dy1 = -1.346f,
                    dx2 = -3.0f,
                    dy2 = -3.0f,
                )
                // s 1.346 -3 3 -3
                reflectiveCurveToRelative(
                    dx1 = 1.346f,
                    dy1 = -3.0f,
                    dx2 = 3.0f,
                    dy2 = -3.0f,
                )
                // s 3 1.346 3 3z
                reflectiveCurveToRelative(
                    dx1 = 3.0f,
                    dy1 = 1.346f,
                    dx2 = 3.0f,
                    dy2 = 3.0f,
                )
                close()
                // M 17 7.051
                moveTo(x = 17.0f, y = 7.051f)
                // v 5.95
                verticalLineToRelative(dy = 5.95f)
                // c -0.662 0.135 -1.275 0.402 -1.814 0.771
                curveToRelative(
                    dx1 = -0.662f,
                    dy1 = 0.135f,
                    dx2 = -1.275f,
                    dy2 = 0.402f,
                    dx3 = -1.814f,
                    dy3 = 0.771f,
                )
                // l -4.22 -4.22
                lineToRelative(dx = -4.22f, dy = -4.22f)
                // c 1.667 -1.39 3.751 -2.294 6.034 -2.501z
                curveToRelative(
                    dx1 = 1.667f,
                    dy1 = -1.39f,
                    dx2 = 3.751f,
                    dy2 = -2.294f,
                    dx3 = 6.034f,
                    dy3 = -2.501f,
                )
                close()
                // M 9.552 10.967
                moveTo(x = 9.552f, y = 10.967f)
                // l 4.246 4.246
                lineToRelative(dx = 4.246f, dy = 4.246f)
                // c -0.344 0.536 -0.588 1.139 -0.707 1.788
                curveToRelative(
                    dx1 = -0.344f,
                    dy1 = 0.536f,
                    dx2 = -0.588f,
                    dy2 = 1.139f,
                    dx3 = -0.707f,
                    dy3 = 1.788f,
                )
                // h -6.04
                horizontalLineToRelative(dx = -6.04f)
                // c 0.207 -2.284 1.11 -4.367 2.501 -6.034z
                curveToRelative(
                    dx1 = 0.207f,
                    dy1 = -2.284f,
                    dx2 = 1.11f,
                    dy2 = -4.367f,
                    dx3 = 2.501f,
                    dy3 = -6.034f,
                )
                close()
                // M 9.552 25.034
                moveTo(x = 9.552f, y = 25.034f)
                // C 8.161 23.366 7.258 21.283 7.051 19
                curveTo(
                    x1 = 8.161f,
                    y1 = 23.366f,
                    x2 = 7.258f,
                    y2 = 21.283f,
                    x3 = 7.051f,
                    y3 = 19.0f,
                )
                // h 6.08
                horizontalLineToRelative(dx = 6.08f)
                // c 0.141 0.622 0.392 1.203 0.741 1.714
                curveToRelative(
                    dx1 = 0.141f,
                    dy1 = 0.622f,
                    dx2 = 0.392f,
                    dy2 = 1.203f,
                    dx3 = 0.741f,
                    dy3 = 1.714f,
                )
                // l -4.32 4.32z
                lineToRelative(dx = -4.32f, dy = 4.32f)
                close()
                // M 17 28.949
                moveTo(x = 17.0f, y = 28.949f)
                // c -2.283 -0.207 -4.366 -1.111 -6.034 -2.501
                curveToRelative(
                    dx1 = -2.283f,
                    dy1 = -0.207f,
                    dx2 = -4.366f,
                    dy2 = -1.111f,
                    dx3 = -6.034f,
                    dy3 = -2.501f,
                )
                // l 4.345 -4.345
                lineToRelative(dx = 4.345f, dy = -4.345f)
                // c 0.509 0.327 1.076 0.572 1.688 0.697
                curveToRelative(
                    dx1 = 0.509f,
                    dy1 = 0.327f,
                    dx2 = 1.076f,
                    dy2 = 0.572f,
                    dx3 = 1.688f,
                    dy3 = 0.697f,
                )
                // v 6.149z
                verticalLineToRelative(dy = 6.149f)
                close()
                // M 19 28.949
                moveTo(x = 19.0f, y = 28.949f)
                // v -6.15
                verticalLineToRelative(dy = -6.15f)
                // c 0.612 -0.125 1.179 -0.37 1.688 -0.697
                curveToRelative(
                    dx1 = 0.612f,
                    dy1 = -0.125f,
                    dx2 = 1.179f,
                    dy2 = -0.37f,
                    dx3 = 1.688f,
                    dy3 = -0.697f,
                )
                // l 4.345 4.346
                lineToRelative(dx = 4.345f, dy = 4.346f)
                // c -1.667 1.391 -3.75 2.294 -6.033 2.501z
                curveToRelative(
                    dx1 = -1.667f,
                    dy1 = 1.391f,
                    dx2 = -3.75f,
                    dy2 = 2.294f,
                    dx3 = -6.033f,
                    dy3 = 2.501f,
                )
                close()
                // M 26.447 25.034
                moveTo(x = 26.447f, y = 25.034f)
                // l -4.32 -4.32
                lineToRelative(dx = -4.32f, dy = -4.32f)
                // c 0.35 -0.511 0.601 -1.092 0.741 -1.715
                curveToRelative(
                    dx1 = 0.35f,
                    dy1 = -0.511f,
                    dx2 = 0.601f,
                    dy2 = -1.092f,
                    dx3 = 0.741f,
                    dy3 = -1.715f,
                )
                // h 6.08
                horizontalLineToRelative(dx = 6.08f)
                // c -0.206 2.284 -1.11 4.368 -2.501 6.035z
                curveToRelative(
                    dx1 = -0.206f,
                    dy1 = 2.284f,
                    dx2 = -1.11f,
                    dy2 = 4.368f,
                    dx3 = -2.501f,
                    dy3 = 6.035f,
                )
                close()
            }
        }.build().also { _emoji2638 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji2638: ImageVector? = null
