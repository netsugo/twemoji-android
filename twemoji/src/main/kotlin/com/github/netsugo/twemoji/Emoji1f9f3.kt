package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f9f3: ImageVector
    get() {
        val current = _emoji1f9f3
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f9f3",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M22 2 h-8 c-0.55 0 -1 -0.45 -1 -1 s0.45 -1 1 -1 h8 c0.55 0 1 0.45 1 1 s-0.45 1 -1 1z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 22 2
                moveTo(x = 22.0f, y = 2.0f)
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // c -0.55 0 -1 -0.45 -1 -1
                curveToRelative(
                    dx1 = -0.55f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.45f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // s 0.45 -1 1 -1
                reflectiveCurveToRelative(
                    dx1 = 0.45f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // c 0.55 0 1 0.45 1 1
                curveToRelative(
                    dx1 = 0.55f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.45f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // s -0.45 1 -1 1z
                reflectiveCurveToRelative(
                    dx1 = -0.45f,
                    dy1 = 1.0f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                close()
            }
            // M13 1 h2 v2 h-2z M21 1 h2 v2 h-2z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 13 1
                moveTo(x = 13.0f, y = 1.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
                // M 21 1
                moveTo(x = 21.0f, y = 1.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // M13 3 h2 v6 h-2z M21 3 h2 v6 h-2z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 13 3
                moveTo(x = 13.0f, y = 3.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
                // M 21 3
                moveTo(x = 21.0f, y = 3.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // M7 25 c-0.55 0 -1 -0.45 -1 -1 v-6 c0 -0.55 0.45 -1 1 -1 s1 0.45 1 1 v6 c0 0.55 -0.45 1 -1 1z M10 34.2 L9 34.2 c-0.55 0 -1 -0.45 -1 -1 v-1 c0 -0.55 0.45 -1 1 -1 h1 c0.55 0 1 0.45 1 1 v1 c0 0.55 -0.45 1 -1 1z M27 34.2 h-1 c-0.55 0 -1 -0.45 -1 -1 v-1 c0 -0.55 0.45 -1 1 -1 h1 c0.55 0 1 0.45 1 1 v1 c0 0.55 -0.45 1 -1 1z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 7 25
                moveTo(x = 7.0f, y = 25.0f)
                // c -0.55 0 -1 -0.45 -1 -1
                curveToRelative(
                    dx1 = -0.55f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.45f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // c 0 -0.55 0.45 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.55f,
                    dx2 = 0.45f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // s 1 0.45 1 1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.45f,
                    dx2 = 1.0f,
                    dy2 = 1.0f,
                )
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // c 0 0.55 -0.45 1 -1 1z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.55f,
                    dx2 = -0.45f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                close()
                // M 10 34.2
                moveTo(x = 10.0f, y = 34.2f)
                // L 9 34.2
                lineTo(x = 9.0f, y = 34.2f)
                // c -0.55 0 -1 -0.45 -1 -1
                curveToRelative(
                    dx1 = -0.55f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.45f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // c 0 -0.55 0.45 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.55f,
                    dx2 = 0.45f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // c 0.55 0 1 0.45 1 1
                curveToRelative(
                    dx1 = 0.55f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.45f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // c 0 0.55 -0.45 1 -1 1z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.55f,
                    dx2 = -0.45f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                close()
                // M 27 34.2
                moveTo(x = 27.0f, y = 34.2f)
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // c -0.55 0 -1 -0.45 -1 -1
                curveToRelative(
                    dx1 = -0.55f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.45f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // c 0 -0.55 0.45 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.55f,
                    dx2 = 0.45f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // c 0.55 0 1 0.45 1 1
                curveToRelative(
                    dx1 = 0.55f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.45f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // c 0 0.55 -0.45 1 -1 1z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.55f,
                    dx2 = -0.45f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                close()
            }
            // M27 33 H9 c-1.1 0 -2 -0.9 -2 -2 V10 c0 -1.1 0.9 -2 2 -2 h18 c1.1 0 2 0.9 2 2 v21 c0 1.1 -0.9 2 -2 2z
            path(
                fill = SolidColor(Color(0xFF4289C1)),
            ) {
                // M 27 33
                moveTo(x = 27.0f, y = 33.0f)
                // H 9
                horizontalLineTo(x = 9.0f)
                // c -1.1 0 -2 -0.9 -2 -2
                curveToRelative(
                    dx1 = -1.1f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -0.9f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // V 10
                verticalLineTo(y = 10.0f)
                // c 0 -1.1 0.9 -2 2 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.1f,
                    dx2 = 0.9f,
                    dy2 = -2.0f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // c 1.1 0 2 0.9 2 2
                curveToRelative(
                    dx1 = 1.1f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 0.9f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                // v 21
                verticalLineToRelative(dy = 21.0f)
                // c 0 1.1 -0.9 2 -2 2z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.1f,
                    dx2 = -0.9f,
                    dy2 = 2.0f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                close()
            }
            // M26 18 L10 18 c-0.55 0 -1 -0.45 -1 -1 v-6 c0 -0.55 0.45 -1 1 -1 h16 c0.55 0 1 0.45 1 1 v6 c0 0.55 -0.45 1 -1 1z M26 31 L10 31 c-0.55 0 -1 -0.45 -1 -1 L9 20 c0 -0.55 0.45 -1 1 -1 h16 c0.55 0 1 0.45 1 1 v10 c0 0.55 -0.45 1 -1 1z
            path(
                fill = SolidColor(Color(0xFF5DADEC)),
            ) {
                // M 26 18
                moveTo(x = 26.0f, y = 18.0f)
                // L 10 18
                lineTo(x = 10.0f, y = 18.0f)
                // c -0.55 0 -1 -0.45 -1 -1
                curveToRelative(
                    dx1 = -0.55f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.45f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // c 0 -0.55 0.45 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.55f,
                    dx2 = 0.45f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // c 0.55 0 1 0.45 1 1
                curveToRelative(
                    dx1 = 0.55f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.45f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // c 0 0.55 -0.45 1 -1 1z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.55f,
                    dx2 = -0.45f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                close()
                // M 26 31
                moveTo(x = 26.0f, y = 31.0f)
                // L 10 31
                lineTo(x = 10.0f, y = 31.0f)
                // c -0.55 0 -1 -0.45 -1 -1
                curveToRelative(
                    dx1 = -0.55f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.45f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // L 9 20
                lineTo(x = 9.0f, y = 20.0f)
                // c 0 -0.55 0.45 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.55f,
                    dx2 = 0.45f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // c 0.55 0 1 0.45 1 1
                curveToRelative(
                    dx1 = 0.55f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.45f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // c 0 0.55 -0.45 1 -1 1z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.55f,
                    dx2 = -0.45f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                close()
            }
            // M9 35 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 9 35
                moveTo(x = 9.0f, y = 35.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // a 1 1 0 1 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 1 1 -2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
            }
            // M27 35 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 27 35
                moveTo(x = 27.0f, y = 35.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // a 1 1 0 1 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 1 1 -2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
            }
            // M25.5 12 h-15 c-0.275 0 -0.5 -0.225 -0.5 -0.5 s0.225 -0.5 0.5 -0.5 h15 c0.275 0 0.5 0.225 0.5 0.5 s-0.225 0.5 -0.5 0.5z M25.5 21 h-15 c-0.275 0 -0.5 -0.225 -0.5 -0.5 s0.225 -0.5 0.5 -0.5 h15 c0.275 0 0.5 0.225 0.5 0.5 s-0.225 0.5 -0.5 0.5z
            path(
                fill = SolidColor(Color(0xFF2A6797)),
            ) {
                // M 25.5 12
                moveTo(x = 25.5f, y = 12.0f)
                // h -15
                horizontalLineToRelative(dx = -15.0f)
                // c -0.275 0 -0.5 -0.225 -0.5 -0.5
                curveToRelative(
                    dx1 = -0.275f,
                    dy1 = 0.0f,
                    dx2 = -0.5f,
                    dy2 = -0.225f,
                    dx3 = -0.5f,
                    dy3 = -0.5f,
                )
                // s 0.225 -0.5 0.5 -0.5
                reflectiveCurveToRelative(
                    dx1 = 0.225f,
                    dy1 = -0.5f,
                    dx2 = 0.5f,
                    dy2 = -0.5f,
                )
                // h 15
                horizontalLineToRelative(dx = 15.0f)
                // c 0.275 0 0.5 0.225 0.5 0.5
                curveToRelative(
                    dx1 = 0.275f,
                    dy1 = 0.0f,
                    dx2 = 0.5f,
                    dy2 = 0.225f,
                    dx3 = 0.5f,
                    dy3 = 0.5f,
                )
                // s -0.225 0.5 -0.5 0.5z
                reflectiveCurveToRelative(
                    dx1 = -0.225f,
                    dy1 = 0.5f,
                    dx2 = -0.5f,
                    dy2 = 0.5f,
                )
                close()
                // M 25.5 21
                moveTo(x = 25.5f, y = 21.0f)
                // h -15
                horizontalLineToRelative(dx = -15.0f)
                // c -0.275 0 -0.5 -0.225 -0.5 -0.5
                curveToRelative(
                    dx1 = -0.275f,
                    dy1 = 0.0f,
                    dx2 = -0.5f,
                    dy2 = -0.225f,
                    dx3 = -0.5f,
                    dy3 = -0.5f,
                )
                // s 0.225 -0.5 0.5 -0.5
                reflectiveCurveToRelative(
                    dx1 = 0.225f,
                    dy1 = -0.5f,
                    dx2 = 0.5f,
                    dy2 = -0.5f,
                )
                // h 15
                horizontalLineToRelative(dx = 15.0f)
                // c 0.275 0 0.5 0.225 0.5 0.5
                curveToRelative(
                    dx1 = 0.275f,
                    dy1 = 0.0f,
                    dx2 = 0.5f,
                    dy2 = 0.225f,
                    dx3 = 0.5f,
                    dy3 = 0.5f,
                )
                // s -0.225 0.5 -0.5 0.5z
                reflectiveCurveToRelative(
                    dx1 = -0.225f,
                    dy1 = 0.5f,
                    dx2 = -0.5f,
                    dy2 = 0.5f,
                )
                close()
            }
            // M11.5 12 h-1 c-0.275 0 -0.5 -0.225 -0.5 -0.5 s0.225 -0.5 0.5 -0.5 h1 c0.275 0 0.5 0.225 0.5 0.5 s-0.225 0.5 -0.5 0.5z M11.5 21 h-1 c-0.275 0 -0.5 -0.225 -0.5 -0.5 s0.225 -0.5 0.5 -0.5 h1 c0.275 0 0.5 0.225 0.5 0.5 s-0.225 0.5 -0.5 0.5z
            path(
                fill = SolidColor(Color(0xFFF5F8FA)),
            ) {
                // M 11.5 12
                moveTo(x = 11.5f, y = 12.0f)
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // c -0.275 0 -0.5 -0.225 -0.5 -0.5
                curveToRelative(
                    dx1 = -0.275f,
                    dy1 = 0.0f,
                    dx2 = -0.5f,
                    dy2 = -0.225f,
                    dx3 = -0.5f,
                    dy3 = -0.5f,
                )
                // s 0.225 -0.5 0.5 -0.5
                reflectiveCurveToRelative(
                    dx1 = 0.225f,
                    dy1 = -0.5f,
                    dx2 = 0.5f,
                    dy2 = -0.5f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // c 0.275 0 0.5 0.225 0.5 0.5
                curveToRelative(
                    dx1 = 0.275f,
                    dy1 = 0.0f,
                    dx2 = 0.5f,
                    dy2 = 0.225f,
                    dx3 = 0.5f,
                    dy3 = 0.5f,
                )
                // s -0.225 0.5 -0.5 0.5z
                reflectiveCurveToRelative(
                    dx1 = -0.225f,
                    dy1 = 0.5f,
                    dx2 = -0.5f,
                    dy2 = 0.5f,
                )
                close()
                // M 11.5 21
                moveTo(x = 11.5f, y = 21.0f)
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // c -0.275 0 -0.5 -0.225 -0.5 -0.5
                curveToRelative(
                    dx1 = -0.275f,
                    dy1 = 0.0f,
                    dx2 = -0.5f,
                    dy2 = -0.225f,
                    dx3 = -0.5f,
                    dy3 = -0.5f,
                )
                // s 0.225 -0.5 0.5 -0.5
                reflectiveCurveToRelative(
                    dx1 = 0.225f,
                    dy1 = -0.5f,
                    dx2 = 0.5f,
                    dy2 = -0.5f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // c 0.275 0 0.5 0.225 0.5 0.5
                curveToRelative(
                    dx1 = 0.275f,
                    dy1 = 0.0f,
                    dx2 = 0.5f,
                    dy2 = 0.225f,
                    dx3 = 0.5f,
                    dy3 = 0.5f,
                )
                // s -0.225 0.5 -0.5 0.5z
                reflectiveCurveToRelative(
                    dx1 = -0.225f,
                    dy1 = 0.5f,
                    dx2 = -0.5f,
                    dy2 = 0.5f,
                )
                close()
            }
        }.build().also { _emoji1f9f3 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f9f3: ImageVector? = null
