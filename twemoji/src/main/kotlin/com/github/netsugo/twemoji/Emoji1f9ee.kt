package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f9ee: ImageVector
    get() {
        val current = _emoji1f9ee
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f9ee",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M3 16 v-2 h30 v2z M3 23 v-2 h30 v2z M3 30 v-2 h30 v2z M3 9 L3 7 h30 v2z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 3 16
                moveTo(x = 3.0f, y = 16.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 30
                horizontalLineToRelative(dx = 30.0f)
                // v 2z
                verticalLineToRelative(dy = 2.0f)
                close()
                // M 3 23
                moveTo(x = 3.0f, y = 23.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 30
                horizontalLineToRelative(dx = 30.0f)
                // v 2z
                verticalLineToRelative(dy = 2.0f)
                close()
                // M 3 30
                moveTo(x = 3.0f, y = 30.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 30
                horizontalLineToRelative(dx = 30.0f)
                // v 2z
                verticalLineToRelative(dy = 2.0f)
                close()
                // M 3 9
                moveTo(x = 3.0f, y = 9.0f)
                // L 3 7
                lineTo(x = 3.0f, y = 7.0f)
                // h 30
                horizontalLineToRelative(dx = 30.0f)
                // v 2z
                verticalLineToRelative(dy = 2.0f)
                close()
            }
            // M35 33 V1 c0 -0.552 -0.448 -1 -1 -1 h-1 c-0.552 0 -1 0.448 -1 1 H4 c0 -0.552 -0.448 -1 -1 -1 H2 c-0.552 0 -1 0.448 -1 1 v32 h34z M4 4 h28 v29 H4 V4z
            path(
                fill = SolidColor(Color(0xFFD5AB88)),
            ) {
                // M 35 33
                moveTo(x = 35.0f, y = 33.0f)
                // V 1
                verticalLineTo(y = 1.0f)
                // c 0 -0.552 -0.448 -1 -1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = -0.448f,
                    dy2 = -1.0f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // c -0.552 0 -1 0.448 -1 1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = 0.448f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // c 0 -0.552 -0.448 -1 -1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = -0.448f,
                    dy2 = -1.0f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // H 2
                horizontalLineTo(x = 2.0f)
                // c -0.552 0 -1 0.448 -1 1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = 0.448f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // v 32
                verticalLineToRelative(dy = 32.0f)
                // h 34z
                horizontalLineToRelative(dx = 34.0f)
                close()
                // M 4 4
                moveTo(x = 4.0f, y = 4.0f)
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // v 29
                verticalLineToRelative(dy = 29.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // V 4z
                verticalLineTo(y = 4.0f)
                close()
            }
            // M19 5.5 c-0.829 0 -1.5 0.671 -1.5 1.5 0 -0.829 -0.671 -1.5 -1.5 -1.5 s-1.5 0.671 -1.5 1.5 c0 -0.829 -0.671 -1.5 -1.5 -1.5 s-1.5 0.671 -1.5 1.5 c0 -0.829 -0.671 -1.5 -1.5 -1.5 S8.5 6.171 8.5 7 c0 -0.829 -0.671 -1.5 -1.5 -1.5 S5.5 6.171 5.5 7 v2 c0 0.829 0.671 1.5 1.5 1.5 S8.5 9.829 8.5 9 c0 0.829 0.671 1.5 1.5 1.5 s1.5 -0.671 1.5 -1.5 c0 0.829 0.671 1.5 1.5 1.5 s1.5 -0.671 1.5 -1.5 c0 0.829 0.671 1.5 1.5 1.5 s1.5 -0.671 1.5 -1.5 c0 0.829 0.671 1.5 1.5 1.5 0.828 0 1.5 -0.671 1.5 -1.5 V7 c0 -0.829 -0.672 -1.5 -1.5 -1.5z
            path(
                fill = SolidColor(Color(0xFF3B94D9)),
            ) {
                // M 19 5.5
                moveTo(x = 19.0f, y = 5.5f)
                // c -0.829 0 -1.5 0.671 -1.5 1.5
                curveToRelative(
                    dx1 = -0.829f,
                    dy1 = 0.0f,
                    dx2 = -1.5f,
                    dy2 = 0.671f,
                    dx3 = -1.5f,
                    dy3 = 1.5f,
                )
                // c 0 -0.829 -0.671 -1.5 -1.5 -1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.829f,
                    dx2 = -0.671f,
                    dy2 = -1.5f,
                    dx3 = -1.5f,
                    dy3 = -1.5f,
                )
                // s -1.5 0.671 -1.5 1.5
                reflectiveCurveToRelative(
                    dx1 = -1.5f,
                    dy1 = 0.671f,
                    dx2 = -1.5f,
                    dy2 = 1.5f,
                )
                // c 0 -0.829 -0.671 -1.5 -1.5 -1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.829f,
                    dx2 = -0.671f,
                    dy2 = -1.5f,
                    dx3 = -1.5f,
                    dy3 = -1.5f,
                )
                // s -1.5 0.671 -1.5 1.5
                reflectiveCurveToRelative(
                    dx1 = -1.5f,
                    dy1 = 0.671f,
                    dx2 = -1.5f,
                    dy2 = 1.5f,
                )
                // c 0 -0.829 -0.671 -1.5 -1.5 -1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.829f,
                    dx2 = -0.671f,
                    dy2 = -1.5f,
                    dx3 = -1.5f,
                    dy3 = -1.5f,
                )
                // S 8.5 6.171 8.5 7
                reflectiveCurveTo(
                    x1 = 8.5f,
                    y1 = 6.171f,
                    x2 = 8.5f,
                    y2 = 7.0f,
                )
                // c 0 -0.829 -0.671 -1.5 -1.5 -1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.829f,
                    dx2 = -0.671f,
                    dy2 = -1.5f,
                    dx3 = -1.5f,
                    dy3 = -1.5f,
                )
                // S 5.5 6.171 5.5 7
                reflectiveCurveTo(
                    x1 = 5.5f,
                    y1 = 6.171f,
                    x2 = 5.5f,
                    y2 = 7.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // c 0 0.829 0.671 1.5 1.5 1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.829f,
                    dx2 = 0.671f,
                    dy2 = 1.5f,
                    dx3 = 1.5f,
                    dy3 = 1.5f,
                )
                // S 8.5 9.829 8.5 9
                reflectiveCurveTo(
                    x1 = 8.5f,
                    y1 = 9.829f,
                    x2 = 8.5f,
                    y2 = 9.0f,
                )
                // c 0 0.829 0.671 1.5 1.5 1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.829f,
                    dx2 = 0.671f,
                    dy2 = 1.5f,
                    dx3 = 1.5f,
                    dy3 = 1.5f,
                )
                // s 1.5 -0.671 1.5 -1.5
                reflectiveCurveToRelative(
                    dx1 = 1.5f,
                    dy1 = -0.671f,
                    dx2 = 1.5f,
                    dy2 = -1.5f,
                )
                // c 0 0.829 0.671 1.5 1.5 1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.829f,
                    dx2 = 0.671f,
                    dy2 = 1.5f,
                    dx3 = 1.5f,
                    dy3 = 1.5f,
                )
                // s 1.5 -0.671 1.5 -1.5
                reflectiveCurveToRelative(
                    dx1 = 1.5f,
                    dy1 = -0.671f,
                    dx2 = 1.5f,
                    dy2 = -1.5f,
                )
                // c 0 0.829 0.671 1.5 1.5 1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.829f,
                    dx2 = 0.671f,
                    dy2 = 1.5f,
                    dx3 = 1.5f,
                    dy3 = 1.5f,
                )
                // s 1.5 -0.671 1.5 -1.5
                reflectiveCurveToRelative(
                    dx1 = 1.5f,
                    dy1 = -0.671f,
                    dx2 = 1.5f,
                    dy2 = -1.5f,
                )
                // c 0 0.829 0.671 1.5 1.5 1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.829f,
                    dx2 = 0.671f,
                    dy2 = 1.5f,
                    dx3 = 1.5f,
                    dy3 = 1.5f,
                )
                // c 0.828 0 1.5 -0.671 1.5 -1.5
                curveToRelative(
                    dx1 = 0.828f,
                    dy1 = 0.0f,
                    dx2 = 1.5f,
                    dy2 = -0.671f,
                    dx3 = 1.5f,
                    dy3 = -1.5f,
                )
                // V 7
                verticalLineTo(y = 7.0f)
                // c 0 -0.829 -0.672 -1.5 -1.5 -1.5z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.829f,
                    dx2 = -0.672f,
                    dy2 = -1.5f,
                    dx3 = -1.5f,
                    dy3 = -1.5f,
                )
                close()
            }
            // M19 12.5 c-0.829 0 -1.5 0.671 -1.5 1.5 0 -0.829 -0.671 -1.5 -1.5 -1.5 s-1.5 0.671 -1.5 1.5 c0 -0.829 -0.671 -1.5 -1.5 -1.5 s-1.5 0.671 -1.5 1.5 c0 -0.829 -0.671 -1.5 -1.5 -1.5 s-1.5 0.671 -1.5 1.5 c0 -0.829 -0.671 -1.5 -1.5 -1.5 s-1.5 0.671 -1.5 1.5 v2 c0 0.829 0.671 1.5 1.5 1.5 s1.5 -0.671 1.5 -1.5 c0 0.829 0.671 1.5 1.5 1.5 s1.5 -0.671 1.5 -1.5 c0 0.829 0.671 1.5 1.5 1.5 s1.5 -0.671 1.5 -1.5 c0 0.829 0.671 1.5 1.5 1.5 s1.5 -0.671 1.5 -1.5 c0 0.829 0.671 1.5 1.5 1.5 0.828 0 1.5 -0.671 1.5 -1.5 v-2 c0 -0.829 -0.672 -1.5 -1.5 -1.5z
            path(
                fill = SolidColor(Color(0xFFBE1931)),
            ) {
                // M 19 12.5
                moveTo(x = 19.0f, y = 12.5f)
                // c -0.829 0 -1.5 0.671 -1.5 1.5
                curveToRelative(
                    dx1 = -0.829f,
                    dy1 = 0.0f,
                    dx2 = -1.5f,
                    dy2 = 0.671f,
                    dx3 = -1.5f,
                    dy3 = 1.5f,
                )
                // c 0 -0.829 -0.671 -1.5 -1.5 -1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.829f,
                    dx2 = -0.671f,
                    dy2 = -1.5f,
                    dx3 = -1.5f,
                    dy3 = -1.5f,
                )
                // s -1.5 0.671 -1.5 1.5
                reflectiveCurveToRelative(
                    dx1 = -1.5f,
                    dy1 = 0.671f,
                    dx2 = -1.5f,
                    dy2 = 1.5f,
                )
                // c 0 -0.829 -0.671 -1.5 -1.5 -1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.829f,
                    dx2 = -0.671f,
                    dy2 = -1.5f,
                    dx3 = -1.5f,
                    dy3 = -1.5f,
                )
                // s -1.5 0.671 -1.5 1.5
                reflectiveCurveToRelative(
                    dx1 = -1.5f,
                    dy1 = 0.671f,
                    dx2 = -1.5f,
                    dy2 = 1.5f,
                )
                // c 0 -0.829 -0.671 -1.5 -1.5 -1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.829f,
                    dx2 = -0.671f,
                    dy2 = -1.5f,
                    dx3 = -1.5f,
                    dy3 = -1.5f,
                )
                // s -1.5 0.671 -1.5 1.5
                reflectiveCurveToRelative(
                    dx1 = -1.5f,
                    dy1 = 0.671f,
                    dx2 = -1.5f,
                    dy2 = 1.5f,
                )
                // c 0 -0.829 -0.671 -1.5 -1.5 -1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.829f,
                    dx2 = -0.671f,
                    dy2 = -1.5f,
                    dx3 = -1.5f,
                    dy3 = -1.5f,
                )
                // s -1.5 0.671 -1.5 1.5
                reflectiveCurveToRelative(
                    dx1 = -1.5f,
                    dy1 = 0.671f,
                    dx2 = -1.5f,
                    dy2 = 1.5f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // c 0 0.829 0.671 1.5 1.5 1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.829f,
                    dx2 = 0.671f,
                    dy2 = 1.5f,
                    dx3 = 1.5f,
                    dy3 = 1.5f,
                )
                // s 1.5 -0.671 1.5 -1.5
                reflectiveCurveToRelative(
                    dx1 = 1.5f,
                    dy1 = -0.671f,
                    dx2 = 1.5f,
                    dy2 = -1.5f,
                )
                // c 0 0.829 0.671 1.5 1.5 1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.829f,
                    dx2 = 0.671f,
                    dy2 = 1.5f,
                    dx3 = 1.5f,
                    dy3 = 1.5f,
                )
                // s 1.5 -0.671 1.5 -1.5
                reflectiveCurveToRelative(
                    dx1 = 1.5f,
                    dy1 = -0.671f,
                    dx2 = 1.5f,
                    dy2 = -1.5f,
                )
                // c 0 0.829 0.671 1.5 1.5 1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.829f,
                    dx2 = 0.671f,
                    dy2 = 1.5f,
                    dx3 = 1.5f,
                    dy3 = 1.5f,
                )
                // s 1.5 -0.671 1.5 -1.5
                reflectiveCurveToRelative(
                    dx1 = 1.5f,
                    dy1 = -0.671f,
                    dx2 = 1.5f,
                    dy2 = -1.5f,
                )
                // c 0 0.829 0.671 1.5 1.5 1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.829f,
                    dx2 = 0.671f,
                    dy2 = 1.5f,
                    dx3 = 1.5f,
                    dy3 = 1.5f,
                )
                // s 1.5 -0.671 1.5 -1.5
                reflectiveCurveToRelative(
                    dx1 = 1.5f,
                    dy1 = -0.671f,
                    dx2 = 1.5f,
                    dy2 = -1.5f,
                )
                // c 0 0.829 0.671 1.5 1.5 1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.829f,
                    dx2 = 0.671f,
                    dy2 = 1.5f,
                    dx3 = 1.5f,
                    dy3 = 1.5f,
                )
                // c 0.828 0 1.5 -0.671 1.5 -1.5
                curveToRelative(
                    dx1 = 0.828f,
                    dy1 = 0.0f,
                    dx2 = 1.5f,
                    dy2 = -0.671f,
                    dx3 = 1.5f,
                    dy3 = -1.5f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // c 0 -0.829 -0.672 -1.5 -1.5 -1.5z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.829f,
                    dx2 = -0.672f,
                    dy2 = -1.5f,
                    dx3 = -1.5f,
                    dy3 = -1.5f,
                )
                close()
            }
            // M19 19.5 c-0.829 0 -1.5 0.672 -1.5 1.5 0 -0.828 -0.671 -1.5 -1.5 -1.5 s-1.5 0.672 -1.5 1.5 c0 -0.828 -0.671 -1.5 -1.5 -1.5 s-1.5 0.672 -1.5 1.5 c0 -0.828 -0.671 -1.5 -1.5 -1.5 s-1.5 0.672 -1.5 1.5 c0 -0.828 -0.671 -1.5 -1.5 -1.5 s-1.5 0.672 -1.5 1.5 v2 c0 0.828 0.671 1.5 1.5 1.5 s1.5 -0.672 1.5 -1.5 c0 0.828 0.671 1.5 1.5 1.5 s1.5 -0.672 1.5 -1.5 c0 0.828 0.671 1.5 1.5 1.5 s1.5 -0.672 1.5 -1.5 c0 0.828 0.671 1.5 1.5 1.5 s1.5 -0.672 1.5 -1.5 c0 0.828 0.671 1.5 1.5 1.5 0.828 0 1.5 -0.672 1.5 -1.5 v-2 c0 -0.828 -0.672 -1.5 -1.5 -1.5z
            path(
                fill = SolidColor(Color(0xFF5C913B)),
            ) {
                // M 19 19.5
                moveTo(x = 19.0f, y = 19.5f)
                // c -0.829 0 -1.5 0.672 -1.5 1.5
                curveToRelative(
                    dx1 = -0.829f,
                    dy1 = 0.0f,
                    dx2 = -1.5f,
                    dy2 = 0.672f,
                    dx3 = -1.5f,
                    dy3 = 1.5f,
                )
                // c 0 -0.828 -0.671 -1.5 -1.5 -1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.828f,
                    dx2 = -0.671f,
                    dy2 = -1.5f,
                    dx3 = -1.5f,
                    dy3 = -1.5f,
                )
                // s -1.5 0.672 -1.5 1.5
                reflectiveCurveToRelative(
                    dx1 = -1.5f,
                    dy1 = 0.672f,
                    dx2 = -1.5f,
                    dy2 = 1.5f,
                )
                // c 0 -0.828 -0.671 -1.5 -1.5 -1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.828f,
                    dx2 = -0.671f,
                    dy2 = -1.5f,
                    dx3 = -1.5f,
                    dy3 = -1.5f,
                )
                // s -1.5 0.672 -1.5 1.5
                reflectiveCurveToRelative(
                    dx1 = -1.5f,
                    dy1 = 0.672f,
                    dx2 = -1.5f,
                    dy2 = 1.5f,
                )
                // c 0 -0.828 -0.671 -1.5 -1.5 -1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.828f,
                    dx2 = -0.671f,
                    dy2 = -1.5f,
                    dx3 = -1.5f,
                    dy3 = -1.5f,
                )
                // s -1.5 0.672 -1.5 1.5
                reflectiveCurveToRelative(
                    dx1 = -1.5f,
                    dy1 = 0.672f,
                    dx2 = -1.5f,
                    dy2 = 1.5f,
                )
                // c 0 -0.828 -0.671 -1.5 -1.5 -1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.828f,
                    dx2 = -0.671f,
                    dy2 = -1.5f,
                    dx3 = -1.5f,
                    dy3 = -1.5f,
                )
                // s -1.5 0.672 -1.5 1.5
                reflectiveCurveToRelative(
                    dx1 = -1.5f,
                    dy1 = 0.672f,
                    dx2 = -1.5f,
                    dy2 = 1.5f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // c 0 0.828 0.671 1.5 1.5 1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.828f,
                    dx2 = 0.671f,
                    dy2 = 1.5f,
                    dx3 = 1.5f,
                    dy3 = 1.5f,
                )
                // s 1.5 -0.672 1.5 -1.5
                reflectiveCurveToRelative(
                    dx1 = 1.5f,
                    dy1 = -0.672f,
                    dx2 = 1.5f,
                    dy2 = -1.5f,
                )
                // c 0 0.828 0.671 1.5 1.5 1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.828f,
                    dx2 = 0.671f,
                    dy2 = 1.5f,
                    dx3 = 1.5f,
                    dy3 = 1.5f,
                )
                // s 1.5 -0.672 1.5 -1.5
                reflectiveCurveToRelative(
                    dx1 = 1.5f,
                    dy1 = -0.672f,
                    dx2 = 1.5f,
                    dy2 = -1.5f,
                )
                // c 0 0.828 0.671 1.5 1.5 1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.828f,
                    dx2 = 0.671f,
                    dy2 = 1.5f,
                    dx3 = 1.5f,
                    dy3 = 1.5f,
                )
                // s 1.5 -0.672 1.5 -1.5
                reflectiveCurveToRelative(
                    dx1 = 1.5f,
                    dy1 = -0.672f,
                    dx2 = 1.5f,
                    dy2 = -1.5f,
                )
                // c 0 0.828 0.671 1.5 1.5 1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.828f,
                    dx2 = 0.671f,
                    dy2 = 1.5f,
                    dx3 = 1.5f,
                    dy3 = 1.5f,
                )
                // s 1.5 -0.672 1.5 -1.5
                reflectiveCurveToRelative(
                    dx1 = 1.5f,
                    dy1 = -0.672f,
                    dx2 = 1.5f,
                    dy2 = -1.5f,
                )
                // c 0 0.828 0.671 1.5 1.5 1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.828f,
                    dx2 = 0.671f,
                    dy2 = 1.5f,
                    dx3 = 1.5f,
                    dy3 = 1.5f,
                )
                // c 0.828 0 1.5 -0.672 1.5 -1.5
                curveToRelative(
                    dx1 = 0.828f,
                    dy1 = 0.0f,
                    dx2 = 1.5f,
                    dy2 = -0.672f,
                    dx3 = 1.5f,
                    dy3 = -1.5f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // c 0 -0.828 -0.672 -1.5 -1.5 -1.5z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.828f,
                    dx2 = -0.672f,
                    dy2 = -1.5f,
                    dx3 = -1.5f,
                    dy3 = -1.5f,
                )
                close()
            }
            // M19 26.5 c-0.829 0 -1.5 0.672 -1.5 1.5 0 -0.828 -0.671 -1.5 -1.5 -1.5 s-1.5 0.672 -1.5 1.5 c0 -0.828 -0.671 -1.5 -1.5 -1.5 s-1.5 0.672 -1.5 1.5 c0 -0.828 -0.671 -1.5 -1.5 -1.5 s-1.5 0.672 -1.5 1.5 c0 -0.828 -0.671 -1.5 -1.5 -1.5 s-1.5 0.672 -1.5 1.5 v2 c0 0.828 0.671 1.5 1.5 1.5 s1.5 -0.672 1.5 -1.5 c0 0.828 0.671 1.5 1.5 1.5 s1.5 -0.672 1.5 -1.5 c0 0.828 0.671 1.5 1.5 1.5 s1.5 -0.672 1.5 -1.5 c0 0.828 0.671 1.5 1.5 1.5 s1.5 -0.672 1.5 -1.5 c0 0.828 0.671 1.5 1.5 1.5 0.828 0 1.5 -0.672 1.5 -1.5 v-2 c0 -0.828 -0.672 -1.5 -1.5 -1.5z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 19 26.5
                moveTo(x = 19.0f, y = 26.5f)
                // c -0.829 0 -1.5 0.672 -1.5 1.5
                curveToRelative(
                    dx1 = -0.829f,
                    dy1 = 0.0f,
                    dx2 = -1.5f,
                    dy2 = 0.672f,
                    dx3 = -1.5f,
                    dy3 = 1.5f,
                )
                // c 0 -0.828 -0.671 -1.5 -1.5 -1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.828f,
                    dx2 = -0.671f,
                    dy2 = -1.5f,
                    dx3 = -1.5f,
                    dy3 = -1.5f,
                )
                // s -1.5 0.672 -1.5 1.5
                reflectiveCurveToRelative(
                    dx1 = -1.5f,
                    dy1 = 0.672f,
                    dx2 = -1.5f,
                    dy2 = 1.5f,
                )
                // c 0 -0.828 -0.671 -1.5 -1.5 -1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.828f,
                    dx2 = -0.671f,
                    dy2 = -1.5f,
                    dx3 = -1.5f,
                    dy3 = -1.5f,
                )
                // s -1.5 0.672 -1.5 1.5
                reflectiveCurveToRelative(
                    dx1 = -1.5f,
                    dy1 = 0.672f,
                    dx2 = -1.5f,
                    dy2 = 1.5f,
                )
                // c 0 -0.828 -0.671 -1.5 -1.5 -1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.828f,
                    dx2 = -0.671f,
                    dy2 = -1.5f,
                    dx3 = -1.5f,
                    dy3 = -1.5f,
                )
                // s -1.5 0.672 -1.5 1.5
                reflectiveCurveToRelative(
                    dx1 = -1.5f,
                    dy1 = 0.672f,
                    dx2 = -1.5f,
                    dy2 = 1.5f,
                )
                // c 0 -0.828 -0.671 -1.5 -1.5 -1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.828f,
                    dx2 = -0.671f,
                    dy2 = -1.5f,
                    dx3 = -1.5f,
                    dy3 = -1.5f,
                )
                // s -1.5 0.672 -1.5 1.5
                reflectiveCurveToRelative(
                    dx1 = -1.5f,
                    dy1 = 0.672f,
                    dx2 = -1.5f,
                    dy2 = 1.5f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // c 0 0.828 0.671 1.5 1.5 1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.828f,
                    dx2 = 0.671f,
                    dy2 = 1.5f,
                    dx3 = 1.5f,
                    dy3 = 1.5f,
                )
                // s 1.5 -0.672 1.5 -1.5
                reflectiveCurveToRelative(
                    dx1 = 1.5f,
                    dy1 = -0.672f,
                    dx2 = 1.5f,
                    dy2 = -1.5f,
                )
                // c 0 0.828 0.671 1.5 1.5 1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.828f,
                    dx2 = 0.671f,
                    dy2 = 1.5f,
                    dx3 = 1.5f,
                    dy3 = 1.5f,
                )
                // s 1.5 -0.672 1.5 -1.5
                reflectiveCurveToRelative(
                    dx1 = 1.5f,
                    dy1 = -0.672f,
                    dx2 = 1.5f,
                    dy2 = -1.5f,
                )
                // c 0 0.828 0.671 1.5 1.5 1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.828f,
                    dx2 = 0.671f,
                    dy2 = 1.5f,
                    dx3 = 1.5f,
                    dy3 = 1.5f,
                )
                // s 1.5 -0.672 1.5 -1.5
                reflectiveCurveToRelative(
                    dx1 = 1.5f,
                    dy1 = -0.672f,
                    dx2 = 1.5f,
                    dy2 = -1.5f,
                )
                // c 0 0.828 0.671 1.5 1.5 1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.828f,
                    dx2 = 0.671f,
                    dy2 = 1.5f,
                    dx3 = 1.5f,
                    dy3 = 1.5f,
                )
                // s 1.5 -0.672 1.5 -1.5
                reflectiveCurveToRelative(
                    dx1 = 1.5f,
                    dy1 = -0.672f,
                    dx2 = 1.5f,
                    dy2 = -1.5f,
                )
                // c 0 0.828 0.671 1.5 1.5 1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.828f,
                    dx2 = 0.671f,
                    dy2 = 1.5f,
                    dx3 = 1.5f,
                    dy3 = 1.5f,
                )
                // c 0.828 0 1.5 -0.672 1.5 -1.5
                curveToRelative(
                    dx1 = 0.828f,
                    dy1 = 0.0f,
                    dx2 = 1.5f,
                    dy2 = -0.672f,
                    dx3 = 1.5f,
                    dy3 = -1.5f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // c 0 -0.828 -0.672 -1.5 -1.5 -1.5z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.828f,
                    dx2 = -0.672f,
                    dy2 = -1.5f,
                    dx3 = -1.5f,
                    dy3 = -1.5f,
                )
                close()
            }
            // M29 10.5 c-0.828 0 -1.5 -0.671 -1.5 -1.5 V7 c0 -0.829 0.672 -1.5 1.5 -1.5 s1.5 0.671 1.5 1.5 v2 c0 0.829 -0.672 1.5 -1.5 1.5z
            path(
                fill = SolidColor(Color(0xFF3B94D9)),
            ) {
                // M 29 10.5
                moveTo(x = 29.0f, y = 10.5f)
                // c -0.828 0 -1.5 -0.671 -1.5 -1.5
                curveToRelative(
                    dx1 = -0.828f,
                    dy1 = 0.0f,
                    dx2 = -1.5f,
                    dy2 = -0.671f,
                    dx3 = -1.5f,
                    dy3 = -1.5f,
                )
                // V 7
                verticalLineTo(y = 7.0f)
                // c 0 -0.829 0.672 -1.5 1.5 -1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.829f,
                    dx2 = 0.672f,
                    dy2 = -1.5f,
                    dx3 = 1.5f,
                    dy3 = -1.5f,
                )
                // s 1.5 0.671 1.5 1.5
                reflectiveCurveToRelative(
                    dx1 = 1.5f,
                    dy1 = 0.671f,
                    dx2 = 1.5f,
                    dy2 = 1.5f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // c 0 0.829 -0.672 1.5 -1.5 1.5z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.829f,
                    dx2 = -0.672f,
                    dy2 = 1.5f,
                    dx3 = -1.5f,
                    dy3 = 1.5f,
                )
                close()
            }
            // M29 17.5 c-0.828 0 -1.5 -0.671 -1.5 -1.5 v-2 c0 -0.829 0.672 -1.5 1.5 -1.5 s1.5 0.671 1.5 1.5 v2 c0 0.829 -0.672 1.5 -1.5 1.5z
            path(
                fill = SolidColor(Color(0xFFBE1931)),
            ) {
                // M 29 17.5
                moveTo(x = 29.0f, y = 17.5f)
                // c -0.828 0 -1.5 -0.671 -1.5 -1.5
                curveToRelative(
                    dx1 = -0.828f,
                    dy1 = 0.0f,
                    dx2 = -1.5f,
                    dy2 = -0.671f,
                    dx3 = -1.5f,
                    dy3 = -1.5f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // c 0 -0.829 0.672 -1.5 1.5 -1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.829f,
                    dx2 = 0.672f,
                    dy2 = -1.5f,
                    dx3 = 1.5f,
                    dy3 = -1.5f,
                )
                // s 1.5 0.671 1.5 1.5
                reflectiveCurveToRelative(
                    dx1 = 1.5f,
                    dy1 = 0.671f,
                    dx2 = 1.5f,
                    dy2 = 1.5f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // c 0 0.829 -0.672 1.5 -1.5 1.5z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.829f,
                    dx2 = -0.672f,
                    dy2 = 1.5f,
                    dx3 = -1.5f,
                    dy3 = 1.5f,
                )
                close()
            }
            // M29 24.5 c-0.828 0 -1.5 -0.672 -1.5 -1.5 v-2 c0 -0.828 0.672 -1.5 1.5 -1.5 s1.5 0.672 1.5 1.5 v2 c0 0.828 -0.672 1.5 -1.5 1.5z
            path(
                fill = SolidColor(Color(0xFF5C913B)),
            ) {
                // M 29 24.5
                moveTo(x = 29.0f, y = 24.5f)
                // c -0.828 0 -1.5 -0.672 -1.5 -1.5
                curveToRelative(
                    dx1 = -0.828f,
                    dy1 = 0.0f,
                    dx2 = -1.5f,
                    dy2 = -0.672f,
                    dx3 = -1.5f,
                    dy3 = -1.5f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
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
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // c 0 0.828 -0.672 1.5 -1.5 1.5z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.828f,
                    dx2 = -0.672f,
                    dy2 = 1.5f,
                    dx3 = -1.5f,
                    dy3 = 1.5f,
                )
                close()
            }
            // M29 31.5 c-0.828 0 -1.5 -0.672 -1.5 -1.5 v-2 c0 -0.828 0.672 -1.5 1.5 -1.5 s1.5 0.672 1.5 1.5 v2 c0 0.828 -0.672 1.5 -1.5 1.5z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 29 31.5
                moveTo(x = 29.0f, y = 31.5f)
                // c -0.828 0 -1.5 -0.672 -1.5 -1.5
                curveToRelative(
                    dx1 = -0.828f,
                    dy1 = 0.0f,
                    dx2 = -1.5f,
                    dy2 = -0.672f,
                    dx3 = -1.5f,
                    dy3 = -1.5f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
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
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // c 0 0.828 -0.672 1.5 -1.5 1.5z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.828f,
                    dx2 = -0.672f,
                    dy2 = 1.5f,
                    dx3 = -1.5f,
                    dy3 = 1.5f,
                )
                close()
            }
            // M35 33 H1 c-0.552 0 -1 0.448 -1 1 v1 c0 0.552 0.448 1 1 1 h34 c0.552 0 1 -0.448 1 -1 v-1 c0 -0.552 -0.448 -1 -1 -1z
            path(
                fill = SolidColor(Color(0xFFBF6952)),
            ) {
                // M 35 33
                moveTo(x = 35.0f, y = 33.0f)
                // H 1
                horizontalLineTo(x = 1.0f)
                // c -0.552 0 -1 0.448 -1 1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = 0.448f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // c 0 0.552 0.448 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = 0.448f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // h 34
                horizontalLineToRelative(dx = 34.0f)
                // c 0.552 0 1 -0.448 1 -1
                curveToRelative(
                    dx1 = 0.552f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -0.448f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // c 0 -0.552 -0.448 -1 -1 -1z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = -0.448f,
                    dy2 = -1.0f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                close()
            }
        }.build().also { _emoji1f9ee = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f9ee: ImageVector? = null
