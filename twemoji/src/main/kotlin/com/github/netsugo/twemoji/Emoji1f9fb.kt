package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f9fb: ImageVector
    get() {
        val current = _emoji1f9fb
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f9fb",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M7 0 h17 v24 H7z
            path(
                fill = SolidColor(Color(0xFFE1E8ED)),
            ) {
                // M 7 0
                moveTo(x = 7.0f, y = 0.0f)
                // h 17
                horizontalLineToRelative(dx = 17.0f)
                // v 24
                verticalLineToRelative(dy = 24.0f)
                // H 7z
                horizontalLineTo(x = 7.0f)
                close()
            }
            // M7 12 h17 v12 H7z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 7 12
                moveTo(x = 7.0f, y = 12.0f)
                // h 17
                horizontalLineToRelative(dx = 17.0f)
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // H 7z
                horizontalLineTo(x = 7.0f)
                close()
            }
            // M0 12 a7 12 0 1 0 14 0 a7 12 0 1 0 -14 0z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 0 12
                moveTo(x = 0.0f, y = 12.0f)
                // a 7 12 0 1 0 14 0
                arcToRelative(
                    a = 7.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 14.0f,
                    dy1 = 0.0f,
                )
                // a 7 12 0 1 0 -14 0z
                arcToRelative(
                    a = 7.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -14.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M16 12 a8 12 0 1 0 16 0 a8 12 0 1 0 -16 0z
            path(
                fill = SolidColor(Color(0xFFE1E8ED)),
            ) {
                // M 16 12
                moveTo(x = 16.0f, y = 12.0f)
                // a 8 12 0 1 0 16 0
                arcToRelative(
                    a = 8.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 16.0f,
                    dy1 = 0.0f,
                )
                // a 8 12 0 1 0 -16 0z
                arcToRelative(
                    a = 8.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -16.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M32 12 v12 c0 9 4 12 4 12 H18 s-4 -3 -4 -12 V11 l18 1z
            path(
                fill = SolidColor(Color(0xFFE1E8ED)),
            ) {
                // M 32 12
                moveTo(x = 32.0f, y = 12.0f)
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // c 0 9 4 12 4 12
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 9.0f,
                    dx2 = 4.0f,
                    dy2 = 12.0f,
                    dx3 = 4.0f,
                    dy3 = 12.0f,
                )
                // H 18
                horizontalLineTo(x = 18.0f)
                // s -4 -3 -4 -12
                reflectiveCurveToRelative(
                    dx1 = -4.0f,
                    dy1 = -3.0f,
                    dx2 = -4.0f,
                    dy2 = -12.0f,
                )
                // V 11
                verticalLineTo(y = 11.0f)
                // l 18 1z
                lineToRelative(dx = 18.0f, dy = 1.0f)
                close()
            }
            // M32 12 c0 -4.924 -1.979 -9.15 -4.807 -11 H11.322 C13.549 3.284 15 7.316 15 12 v14 c0.429 5.683 2.683 8.3 3.383 9 H35.05 C33.867 33.496 32 30.151 32 24 V12z
            path(
                fill = SolidColor(Color(0xFFF5F8FA)),
            ) {
                // M 32 12
                moveTo(x = 32.0f, y = 12.0f)
                // c 0 -4.924 -1.979 -9.15 -4.807 -11
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.924f,
                    dx2 = -1.979f,
                    dy2 = -9.15f,
                    dx3 = -4.807f,
                    dy3 = -11.0f,
                )
                // H 11.322
                horizontalLineTo(x = 11.322f)
                // C 13.549 3.284 15 7.316 15 12
                curveTo(
                    x1 = 13.549f,
                    y1 = 3.284f,
                    x2 = 15.0f,
                    y2 = 7.316f,
                    x3 = 15.0f,
                    y3 = 12.0f,
                )
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // c 0.429 5.683 2.683 8.3 3.383 9
                curveToRelative(
                    dx1 = 0.429f,
                    dy1 = 5.683f,
                    dx2 = 2.683f,
                    dy2 = 8.3f,
                    dx3 = 3.383f,
                    dy3 = 9.0f,
                )
                // H 35.05
                horizontalLineTo(x = 35.05f)
                // C 33.867 33.496 32 30.151 32 24
                curveTo(
                    x1 = 33.867f,
                    y1 = 33.496f,
                    x2 = 32.0f,
                    y2 = 30.151f,
                    x3 = 32.0f,
                    y3 = 24.0f,
                )
                // V 12z
                verticalLineTo(y = 12.0f)
                close()
            }
            // M3 12 a3 5 0 1 0 6 0 a3 5 0 1 0 -6 0z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 3 12
                moveTo(x = 3.0f, y = 12.0f)
                // a 3 5 0 1 0 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // a 3 5 0 1 0 -6 0z
                arcToRelative(
                    a = 3.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M3.25 10.01 C3.712 8.24 4.768 7 6 7 c1.657 0 3 2.239 3 5 0 0.616 -0.076 1.2 -0.198 1.745 -0.649 -2.088 -2.871 -3.642 -5.552 -3.735z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 3.25 10.01
                moveTo(x = 3.25f, y = 10.01f)
                // C 3.712 8.24 4.768 7 6 7
                curveTo(
                    x1 = 3.712f,
                    y1 = 8.24f,
                    x2 = 4.768f,
                    y2 = 7.0f,
                    x3 = 6.0f,
                    y3 = 7.0f,
                )
                // c 1.657 0 3 2.239 3 5
                curveToRelative(
                    dx1 = 1.657f,
                    dy1 = 0.0f,
                    dx2 = 3.0f,
                    dy2 = 2.239f,
                    dx3 = 3.0f,
                    dy3 = 5.0f,
                )
                // c 0 0.616 -0.076 1.2 -0.198 1.745
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.616f,
                    dx2 = -0.076f,
                    dy2 = 1.2f,
                    dx3 = -0.198f,
                    dy3 = 1.745f,
                )
                // c -0.649 -2.088 -2.871 -3.642 -5.552 -3.735z
                curveToRelative(
                    dx1 = -0.649f,
                    dy1 = -2.088f,
                    dx2 = -2.871f,
                    dy2 = -3.642f,
                    dx3 = -5.552f,
                    dy3 = -3.735f,
                )
                close()
            }
            // M16.5 13 L15 13 v-1 h1.5 c0.275 0 0.5 0.225 0.5 0.5 s-0.225 0.5 -0.5 0.5z M20.5 13 h-2 c-0.275 0 -0.5 -0.225 -0.5 -0.5 s0.225 -0.5 0.5 -0.5 h2 c0.275 0 0.5 0.225 0.5 0.5 s-0.225 0.5 -0.5 0.5z M24.5 13 h-2 c-0.275 0 -0.5 -0.225 -0.5 -0.5 s0.225 -0.5 0.5 -0.5 h2 c0.275 0 0.5 0.225 0.5 0.5 s-0.225 0.5 -0.5 0.5z M28.5 13 h-2 c-0.275 0 -0.5 -0.225 -0.5 -0.5 s0.225 -0.5 0.5 -0.5 h2 c0.275 0 0.5 0.225 0.5 0.5 s-0.225 0.5 -0.5 0.5z M32 13 h-1.5 c-0.275 0 -0.5 -0.225 -0.5 -0.5 s0.225 -0.5 0.5 -0.5 L32 12 v1z M16.5 25 L15 25 v-1 h1.5 c0.275 0 0.5 0.225 0.5 0.5 s-0.225 0.5 -0.5 0.5z M20.5 25 h-2 c-0.275 0 -0.5 -0.225 -0.5 -0.5 s0.225 -0.5 0.5 -0.5 h2 c0.275 0 0.5 0.225 0.5 0.5 s-0.225 0.5 -0.5 0.5z M24.5 25 h-2 c-0.275 0 -0.5 -0.225 -0.5 -0.5 s0.225 -0.5 0.5 -0.5 h2 c0.275 0 0.5 0.225 0.5 0.5 s-0.225 0.5 -0.5 0.5z M28.5 25 h-2 c-0.275 0 -0.5 -0.225 -0.5 -0.5 s0.225 -0.5 0.5 -0.5 h2 c0.275 0 0.5 0.225 0.5 0.5 s-0.225 0.5 -0.5 0.5z M32 25 h-1.5 c-0.275 0 -0.5 -0.225 -0.5 -0.5 s0.225 -0.5 0.5 -0.5 L32 24 v1z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 16.5 13
                moveTo(x = 16.5f, y = 13.0f)
                // L 15 13
                lineTo(x = 15.0f, y = 13.0f)
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // h 1.5
                horizontalLineToRelative(dx = 1.5f)
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
                // M 20.5 13
                moveTo(x = 20.5f, y = 13.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
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
                // h 2
                horizontalLineToRelative(dx = 2.0f)
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
                // M 24.5 13
                moveTo(x = 24.5f, y = 13.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
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
                // h 2
                horizontalLineToRelative(dx = 2.0f)
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
                // M 28.5 13
                moveTo(x = 28.5f, y = 13.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
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
                // h 2
                horizontalLineToRelative(dx = 2.0f)
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
                // M 32 13
                moveTo(x = 32.0f, y = 13.0f)
                // h -1.5
                horizontalLineToRelative(dx = -1.5f)
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
                // L 32 12
                lineTo(x = 32.0f, y = 12.0f)
                // v 1z
                verticalLineToRelative(dy = 1.0f)
                close()
                // M 16.5 25
                moveTo(x = 16.5f, y = 25.0f)
                // L 15 25
                lineTo(x = 15.0f, y = 25.0f)
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // h 1.5
                horizontalLineToRelative(dx = 1.5f)
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
                // M 20.5 25
                moveTo(x = 20.5f, y = 25.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
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
                // h 2
                horizontalLineToRelative(dx = 2.0f)
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
                // M 24.5 25
                moveTo(x = 24.5f, y = 25.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
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
                // h 2
                horizontalLineToRelative(dx = 2.0f)
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
                // M 28.5 25
                moveTo(x = 28.5f, y = 25.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
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
                // h 2
                horizontalLineToRelative(dx = 2.0f)
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
                // M 32 25
                moveTo(x = 32.0f, y = 25.0f)
                // h -1.5
                horizontalLineToRelative(dx = -1.5f)
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
                // L 32 24
                lineTo(x = 32.0f, y = 24.0f)
                // v 1z
                verticalLineToRelative(dy = 1.0f)
                close()
            }
        }.build().also { _emoji1f9fb = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f9fb: ImageVector? = null
