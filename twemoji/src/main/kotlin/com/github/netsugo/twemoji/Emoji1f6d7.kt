package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f6d7: ImageVector
    get() {
        val current = _emoji1f6d7
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f6d7",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 32 c0 2.209 -1.791 4 -4 4 H4 c-2.209 0 -4 -1.791 -4 -4 V4 c0 -2.209 1.791 -4 4 -4 h28 c2.209 0 4 1.791 4 4 v28z
            path(
                fill = SolidColor(Color(0xFF226699)),
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
            // M30 34 L6 34 c-1.654 0 -3 -1.346 -3 -3 L3 13 c0 -1.654 1.346 -3 3 -3 h24 c1.654 0 3 1.346 3 3 v18 c0 1.654 -1.346 3 -3 3z M6 12 c-0.551 0 -1 0.449 -1 1 v18 c0 0.552 0.449 1 1 1 h24 c0.552 0 1 -0.448 1 -1 L31 13 c0 -0.551 -0.448 -1 -1 -1 L6 12z M13 2.172 L9.172 6 L11.5 6 v3 h3 L14.5 6 h2.328z M24.5 5.172 v-3 h-3 v3 h-2.328 L23 9 l3.828 -3.828z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 30 34
                moveTo(x = 30.0f, y = 34.0f)
                // L 6 34
                lineTo(x = 6.0f, y = 34.0f)
                // c -1.654 0 -3 -1.346 -3 -3
                curveToRelative(
                    dx1 = -1.654f,
                    dy1 = 0.0f,
                    dx2 = -3.0f,
                    dy2 = -1.346f,
                    dx3 = -3.0f,
                    dy3 = -3.0f,
                )
                // L 3 13
                lineTo(x = 3.0f, y = 13.0f)
                // c 0 -1.654 1.346 -3 3 -3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.654f,
                    dx2 = 1.346f,
                    dy2 = -3.0f,
                    dx3 = 3.0f,
                    dy3 = -3.0f,
                )
                // h 24
                horizontalLineToRelative(dx = 24.0f)
                // c 1.654 0 3 1.346 3 3
                curveToRelative(
                    dx1 = 1.654f,
                    dy1 = 0.0f,
                    dx2 = 3.0f,
                    dy2 = 1.346f,
                    dx3 = 3.0f,
                    dy3 = 3.0f,
                )
                // v 18
                verticalLineToRelative(dy = 18.0f)
                // c 0 1.654 -1.346 3 -3 3z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.654f,
                    dx2 = -1.346f,
                    dy2 = 3.0f,
                    dx3 = -3.0f,
                    dy3 = 3.0f,
                )
                close()
                // M 6 12
                moveTo(x = 6.0f, y = 12.0f)
                // c -0.551 0 -1 0.449 -1 1
                curveToRelative(
                    dx1 = -0.551f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = 0.449f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // v 18
                verticalLineToRelative(dy = 18.0f)
                // c 0 0.552 0.449 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = 0.449f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // h 24
                horizontalLineToRelative(dx = 24.0f)
                // c 0.552 0 1 -0.448 1 -1
                curveToRelative(
                    dx1 = 0.552f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -0.448f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // L 31 13
                lineTo(x = 31.0f, y = 13.0f)
                // c 0 -0.551 -0.448 -1 -1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.551f,
                    dx2 = -0.448f,
                    dy2 = -1.0f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // L 6 12z
                lineTo(x = 6.0f, y = 12.0f)
                close()
                // M 13 2.172
                moveTo(x = 13.0f, y = 2.172f)
                // L 9.172 6
                lineTo(x = 9.172f, y = 6.0f)
                // L 11.5 6
                lineTo(x = 11.5f, y = 6.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // L 14.5 6
                lineTo(x = 14.5f, y = 6.0f)
                // h 2.328z
                horizontalLineToRelative(dx = 2.328f)
                close()
                // M 24.5 5.172
                moveTo(x = 24.5f, y = 5.172f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h -2.328
                horizontalLineToRelative(dx = -2.328f)
                // L 23 9
                lineTo(x = 23.0f, y = 9.0f)
                // l 3.828 -3.828z
                lineToRelative(dx = 3.828f, dy = -3.828f)
                close()
            }
            // M19 18.75 h-0.102 c0.651 -0.371 1.102 -1.123 1.102 -2 0 -1.243 -0.895 -2.25 -2 -2.25 s-2 1.007 -2 2.25 c0 0.877 0.451 1.629 1.102 2 L17 18.75 c-1.1 0 -2 0.9 -2 2 L15 24 c0 0.55 0.45 1 1 1 v4.25 c0 0.412 0.338 0.75 0.75 0.75 s0.75 -0.338 0.75 -0.75 v-3.5 h1 v3.5 c0 0.412 0.338 0.75 0.75 0.75 s0.75 -0.338 0.75 -0.75 L20 25 c0.55 0 1 -0.45 1 -1 v-3.25 c0 -1.1 -0.9 -2 -2 -2z M11 18.75 h-0.102 c0.651 -0.371 1.102 -1.123 1.102 -2 0 -1.243 -0.895 -2.25 -2 -2.25 s-2 1.007 -2 2.25 c0 0.877 0.451 1.629 1.102 2 L9 18.75 c-1.1 0 -2 0.9 -2 2 L7 24 c0 0.55 0.45 1 1 1 v4.25 c0 0.412 0.338 0.75 0.75 0.75 s0.75 -0.338 0.75 -0.75 v-3.5 h1 v3.5 c0 0.412 0.338 0.75 0.75 0.75 s0.75 -0.338 0.75 -0.75 L12 25 c0.55 0 1 -0.45 1 -1 v-3.25 c0 -1.1 -0.9 -2 -2 -2z M27 18.75 h-0.102 c0.651 -0.371 1.102 -1.123 1.102 -2 0 -1.243 -0.895 -2.25 -2 -2.25 s-2 1.007 -2 2.25 c0 0.877 0.451 1.629 1.102 2 L25 18.75 c-1.1 0 -2 0.9 -2 2 L23 24 c0 0.55 0.45 1 1 1 v4.25 c0 0.412 0.338 0.75 0.75 0.75 s0.75 -0.338 0.75 -0.75 v-3.5 h1 v3.5 c0 0.412 0.338 0.75 0.75 0.75 s0.75 -0.338 0.75 -0.75 L28 25 c0.55 0 1 -0.45 1 -1 v-3.25 c0 -1.1 -0.9 -2 -2 -2z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 19 18.75
                moveTo(x = 19.0f, y = 18.75f)
                // h -0.102
                horizontalLineToRelative(dx = -0.102f)
                // c 0.651 -0.371 1.102 -1.123 1.102 -2
                curveToRelative(
                    dx1 = 0.651f,
                    dy1 = -0.371f,
                    dx2 = 1.102f,
                    dy2 = -1.123f,
                    dx3 = 1.102f,
                    dy3 = -2.0f,
                )
                // c 0 -1.243 -0.895 -2.25 -2 -2.25
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.243f,
                    dx2 = -0.895f,
                    dy2 = -2.25f,
                    dx3 = -2.0f,
                    dy3 = -2.25f,
                )
                // s -2 1.007 -2 2.25
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 1.007f,
                    dx2 = -2.0f,
                    dy2 = 2.25f,
                )
                // c 0 0.877 0.451 1.629 1.102 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.877f,
                    dx2 = 0.451f,
                    dy2 = 1.629f,
                    dx3 = 1.102f,
                    dy3 = 2.0f,
                )
                // L 17 18.75
                lineTo(x = 17.0f, y = 18.75f)
                // c -1.1 0 -2 0.9 -2 2
                curveToRelative(
                    dx1 = -1.1f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = 0.9f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // L 15 24
                lineTo(x = 15.0f, y = 24.0f)
                // c 0 0.55 0.45 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.55f,
                    dx2 = 0.45f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // v 4.25
                verticalLineToRelative(dy = 4.25f)
                // c 0 0.412 0.338 0.75 0.75 0.75
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.412f,
                    dx2 = 0.338f,
                    dy2 = 0.75f,
                    dx3 = 0.75f,
                    dy3 = 0.75f,
                )
                // s 0.75 -0.338 0.75 -0.75
                reflectiveCurveToRelative(
                    dx1 = 0.75f,
                    dy1 = -0.338f,
                    dx2 = 0.75f,
                    dy2 = -0.75f,
                )
                // v -3.5
                verticalLineToRelative(dy = -3.5f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // v 3.5
                verticalLineToRelative(dy = 3.5f)
                // c 0 0.412 0.338 0.75 0.75 0.75
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.412f,
                    dx2 = 0.338f,
                    dy2 = 0.75f,
                    dx3 = 0.75f,
                    dy3 = 0.75f,
                )
                // s 0.75 -0.338 0.75 -0.75
                reflectiveCurveToRelative(
                    dx1 = 0.75f,
                    dy1 = -0.338f,
                    dx2 = 0.75f,
                    dy2 = -0.75f,
                )
                // L 20 25
                lineTo(x = 20.0f, y = 25.0f)
                // c 0.55 0 1 -0.45 1 -1
                curveToRelative(
                    dx1 = 0.55f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -0.45f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // v -3.25
                verticalLineToRelative(dy = -3.25f)
                // c 0 -1.1 -0.9 -2 -2 -2z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.1f,
                    dx2 = -0.9f,
                    dy2 = -2.0f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                close()
                // M 11 18.75
                moveTo(x = 11.0f, y = 18.75f)
                // h -0.102
                horizontalLineToRelative(dx = -0.102f)
                // c 0.651 -0.371 1.102 -1.123 1.102 -2
                curveToRelative(
                    dx1 = 0.651f,
                    dy1 = -0.371f,
                    dx2 = 1.102f,
                    dy2 = -1.123f,
                    dx3 = 1.102f,
                    dy3 = -2.0f,
                )
                // c 0 -1.243 -0.895 -2.25 -2 -2.25
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.243f,
                    dx2 = -0.895f,
                    dy2 = -2.25f,
                    dx3 = -2.0f,
                    dy3 = -2.25f,
                )
                // s -2 1.007 -2 2.25
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 1.007f,
                    dx2 = -2.0f,
                    dy2 = 2.25f,
                )
                // c 0 0.877 0.451 1.629 1.102 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.877f,
                    dx2 = 0.451f,
                    dy2 = 1.629f,
                    dx3 = 1.102f,
                    dy3 = 2.0f,
                )
                // L 9 18.75
                lineTo(x = 9.0f, y = 18.75f)
                // c -1.1 0 -2 0.9 -2 2
                curveToRelative(
                    dx1 = -1.1f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = 0.9f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // L 7 24
                lineTo(x = 7.0f, y = 24.0f)
                // c 0 0.55 0.45 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.55f,
                    dx2 = 0.45f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // v 4.25
                verticalLineToRelative(dy = 4.25f)
                // c 0 0.412 0.338 0.75 0.75 0.75
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.412f,
                    dx2 = 0.338f,
                    dy2 = 0.75f,
                    dx3 = 0.75f,
                    dy3 = 0.75f,
                )
                // s 0.75 -0.338 0.75 -0.75
                reflectiveCurveToRelative(
                    dx1 = 0.75f,
                    dy1 = -0.338f,
                    dx2 = 0.75f,
                    dy2 = -0.75f,
                )
                // v -3.5
                verticalLineToRelative(dy = -3.5f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // v 3.5
                verticalLineToRelative(dy = 3.5f)
                // c 0 0.412 0.338 0.75 0.75 0.75
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.412f,
                    dx2 = 0.338f,
                    dy2 = 0.75f,
                    dx3 = 0.75f,
                    dy3 = 0.75f,
                )
                // s 0.75 -0.338 0.75 -0.75
                reflectiveCurveToRelative(
                    dx1 = 0.75f,
                    dy1 = -0.338f,
                    dx2 = 0.75f,
                    dy2 = -0.75f,
                )
                // L 12 25
                lineTo(x = 12.0f, y = 25.0f)
                // c 0.55 0 1 -0.45 1 -1
                curveToRelative(
                    dx1 = 0.55f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -0.45f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // v -3.25
                verticalLineToRelative(dy = -3.25f)
                // c 0 -1.1 -0.9 -2 -2 -2z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.1f,
                    dx2 = -0.9f,
                    dy2 = -2.0f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                close()
                // M 27 18.75
                moveTo(x = 27.0f, y = 18.75f)
                // h -0.102
                horizontalLineToRelative(dx = -0.102f)
                // c 0.651 -0.371 1.102 -1.123 1.102 -2
                curveToRelative(
                    dx1 = 0.651f,
                    dy1 = -0.371f,
                    dx2 = 1.102f,
                    dy2 = -1.123f,
                    dx3 = 1.102f,
                    dy3 = -2.0f,
                )
                // c 0 -1.243 -0.895 -2.25 -2 -2.25
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.243f,
                    dx2 = -0.895f,
                    dy2 = -2.25f,
                    dx3 = -2.0f,
                    dy3 = -2.25f,
                )
                // s -2 1.007 -2 2.25
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 1.007f,
                    dx2 = -2.0f,
                    dy2 = 2.25f,
                )
                // c 0 0.877 0.451 1.629 1.102 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.877f,
                    dx2 = 0.451f,
                    dy2 = 1.629f,
                    dx3 = 1.102f,
                    dy3 = 2.0f,
                )
                // L 25 18.75
                lineTo(x = 25.0f, y = 18.75f)
                // c -1.1 0 -2 0.9 -2 2
                curveToRelative(
                    dx1 = -1.1f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = 0.9f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // L 23 24
                lineTo(x = 23.0f, y = 24.0f)
                // c 0 0.55 0.45 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.55f,
                    dx2 = 0.45f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // v 4.25
                verticalLineToRelative(dy = 4.25f)
                // c 0 0.412 0.338 0.75 0.75 0.75
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.412f,
                    dx2 = 0.338f,
                    dy2 = 0.75f,
                    dx3 = 0.75f,
                    dy3 = 0.75f,
                )
                // s 0.75 -0.338 0.75 -0.75
                reflectiveCurveToRelative(
                    dx1 = 0.75f,
                    dy1 = -0.338f,
                    dx2 = 0.75f,
                    dy2 = -0.75f,
                )
                // v -3.5
                verticalLineToRelative(dy = -3.5f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // v 3.5
                verticalLineToRelative(dy = 3.5f)
                // c 0 0.412 0.338 0.75 0.75 0.75
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.412f,
                    dx2 = 0.338f,
                    dy2 = 0.75f,
                    dx3 = 0.75f,
                    dy3 = 0.75f,
                )
                // s 0.75 -0.338 0.75 -0.75
                reflectiveCurveToRelative(
                    dx1 = 0.75f,
                    dy1 = -0.338f,
                    dx2 = 0.75f,
                    dy2 = -0.75f,
                )
                // L 28 25
                lineTo(x = 28.0f, y = 25.0f)
                // c 0.55 0 1 -0.45 1 -1
                curveToRelative(
                    dx1 = 0.55f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -0.45f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // v -3.25
                verticalLineToRelative(dy = -3.25f)
                // c 0 -1.1 -0.9 -2 -2 -2z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.1f,
                    dx2 = -0.9f,
                    dy2 = -2.0f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                close()
            }
        }.build().also { _emoji1f6d7 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f6d7: ImageVector? = null
