package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f6fa: ImageVector
    get() {
        val current = _emoji1f6fa
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f6fa",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M19 9 h2 v11 h-2z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 19 9
                moveTo(x = 19.0f, y = 9.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 11
                verticalLineToRelative(dy = 11.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // M10 9 c-2 2 -4 5 -4 7 0 4 5 1 5 1 V9 h-1z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 10 9
                moveTo(x = 10.0f, y = 9.0f)
                // c -2 2 -4 5 -4 7
                curveToRelative(
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                    dx2 = -4.0f,
                    dy2 = 5.0f,
                    dx3 = -4.0f,
                    dy3 = 7.0f,
                )
                // c 0 4 5 1 5 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.0f,
                    dx2 = 5.0f,
                    dy2 = 1.0f,
                    dx3 = 5.0f,
                    dy3 = 1.0f,
                )
                // V 9
                verticalLineTo(y = 9.0f)
                // h -1z
                horizontalLineToRelative(dx = -1.0f)
                close()
            }
            // M5 32 m-4 0 a4 4 0 1 1 8 0 a4 4 0 1 1 -8 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 5 32
                moveTo(x = 5.0f, y = 32.0f)
                // m -4 0
                moveToRelative(dx = -4.0f, dy = 0.0f)
                // a 4 4 0 1 1 8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 8.0f,
                    dy1 = 0.0f,
                )
                // a 4 4 0 1 1 -8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -8.0f,
                    dy1 = 0.0f,
                )
            }
            // M5 32 m-2 0 a2 2 0 1 1 4 0 a2 2 0 1 1 -4 0
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 5 32
                moveTo(x = 5.0f, y = 32.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
            }
            // M29 23 h-2 c-1.105 0 -2 0.895 -2 2 v5 c0 1.105 0.895 2 2 2 h2 c1.105 0 2 -0.895 2 -2 v-5 c0 -1.105 -0.895 -2 -2 -2z M19 23 h-2 c-1.105 0 -2 0.895 -2 2 v5 c0 1.105 0.895 2 2 2 h2 c1.105 0 2 -0.895 2 -2 v-5 c0 -1.105 -0.895 -2 -2 -2z
            path(
                fill = SolidColor(Color(0xFF1E5200)),
            ) {
                // M 29 23
                moveTo(x = 29.0f, y = 23.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // c -1.105 0 -2 0.895 -2 2
                curveToRelative(
                    dx1 = -1.105f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = 0.895f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // c 0 1.105 0.895 2 2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.105f,
                    dx2 = 0.895f,
                    dy2 = 2.0f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // c 1.105 0 2 -0.895 2 -2
                curveToRelative(
                    dx1 = 1.105f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = -0.895f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // c 0 -1.105 -0.895 -2 -2 -2z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.105f,
                    dx2 = -0.895f,
                    dy2 = -2.0f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                close()
                // M 19 23
                moveTo(x = 19.0f, y = 23.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // c -1.105 0 -2 0.895 -2 2
                curveToRelative(
                    dx1 = -1.105f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = 0.895f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // c 0 1.105 0.895 2 2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.105f,
                    dx2 = 0.895f,
                    dy2 = 2.0f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // c 1.105 0 2 -0.895 2 -2
                curveToRelative(
                    dx1 = 1.105f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = -0.895f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // c 0 -1.105 -0.895 -2 -2 -2z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.105f,
                    dx2 = -0.895f,
                    dy2 = -2.0f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                close()
            }
            // M2 28.377 c-1.387 0.225 -2.581 -1.152 -1 -2.435 2 -1.623 7 -2.435 9 -1.623 S12 33 11 33 s-4 -5.435 -9 -4.623z
            path(
                fill = SolidColor(Color(0xFF5C913B)),
            ) {
                // M 2 28.377
                moveTo(x = 2.0f, y = 28.377f)
                // c -1.387 0.225 -2.581 -1.152 -1 -2.435
                curveToRelative(
                    dx1 = -1.387f,
                    dy1 = 0.225f,
                    dx2 = -2.581f,
                    dy2 = -1.152f,
                    dx3 = -1.0f,
                    dy3 = -2.435f,
                )
                // c 2 -1.623 7 -2.435 9 -1.623
                curveToRelative(
                    dx1 = 2.0f,
                    dy1 = -1.623f,
                    dx2 = 7.0f,
                    dy2 = -2.435f,
                    dx3 = 9.0f,
                    dy3 = -1.623f,
                )
                // S 12 33 11 33
                reflectiveCurveTo(
                    x1 = 12.0f,
                    y1 = 33.0f,
                    x2 = 11.0f,
                    y2 = 33.0f,
                )
                // s -4 -5.435 -9 -4.623z
                reflectiveCurveToRelative(
                    dx1 = -4.0f,
                    dy1 = -5.435f,
                    dx2 = -9.0f,
                    dy2 = -4.623f,
                )
                close()
            }
            // M11 33 h13 c1 0 2 0 2 -2 0 -1 1 -4 3 -4 s5 3 5 4 0 2 1 2 1 -1 1 -2 V19 h-8 c0 3 -1 8 -1 8 s-1 -1 -1 1 c0 0.606 -1 2 -2 2 h-1 c-1 0 -2 -0.666 -2 -1.672 V19 c0 -1 -2 -1 -2 0 v9.328 C19 29.334 18.262 30 17.341 30 h-3.33 C13 30 12 29 12 28 v-9 H5 c0 6 5 14 6 14z
            path(
                fill = SolidColor(Color(0xFF3E721D)),
            ) {
                // M 11 33
                moveTo(x = 11.0f, y = 33.0f)
                // h 13
                horizontalLineToRelative(dx = 13.0f)
                // c 1 0 2 0 2 -2
                curveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 0.0f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // c 0 -1 1 -4 3 -4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -4.0f,
                    dx3 = 3.0f,
                    dy3 = -4.0f,
                )
                // s 5 3 5 4
                reflectiveCurveToRelative(
                    dx1 = 5.0f,
                    dy1 = 3.0f,
                    dx2 = 5.0f,
                    dy2 = 4.0f,
                )
                // s 0 2 1 2
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                    dx2 = 1.0f,
                    dy2 = 2.0f,
                )
                // s 1 -1 1 -2
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -2.0f,
                )
                // V 19
                verticalLineTo(y = 19.0f)
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // c 0 3 -1 8 -1 8
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.0f,
                    dx2 = -1.0f,
                    dy2 = 8.0f,
                    dx3 = -1.0f,
                    dy3 = 8.0f,
                )
                // s -1 -1 -1 1
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                // c 0 0.606 -1 2 -2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.606f,
                    dx2 = -1.0f,
                    dy2 = 2.0f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // c -1 0 -2 -0.666 -2 -1.672
                curveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -0.666f,
                    dx3 = -2.0f,
                    dy3 = -1.672f,
                )
                // V 19
                verticalLineTo(y = 19.0f)
                // c 0 -1 -2 -1 -2 0
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.0f,
                    dx2 = -2.0f,
                    dy2 = -1.0f,
                    dx3 = -2.0f,
                    dy3 = 0.0f,
                )
                // v 9.328
                verticalLineToRelative(dy = 9.328f)
                // C 19 29.334 18.262 30 17.341 30
                curveTo(
                    x1 = 19.0f,
                    y1 = 29.334f,
                    x2 = 18.262f,
                    y2 = 30.0f,
                    x3 = 17.341f,
                    y3 = 30.0f,
                )
                // h -3.33
                horizontalLineToRelative(dx = -3.33f)
                // C 13 30 12 29 12 28
                curveTo(
                    x1 = 13.0f,
                    y1 = 30.0f,
                    x2 = 12.0f,
                    y2 = 29.0f,
                    x3 = 12.0f,
                    y3 = 28.0f,
                )
                // v -9
                verticalLineToRelative(dy = -9.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
                // c 0 6 5 14 6 14z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 6.0f,
                    dx2 = 5.0f,
                    dy2 = 14.0f,
                    dx3 = 6.0f,
                    dy3 = 14.0f,
                )
                close()
            }
            // M34 32 c0 1 1 0 1 -2 0 -3 -0.833 -5 -5 -5 s-5 3 -5 5 c0 1 1 3 1 2 s0.667 -2 4 -2 4 1 4 2z
            path(
                fill = SolidColor(Color(0xFF5C913B)),
            ) {
                // M 34 32
                moveTo(x = 34.0f, y = 32.0f)
                // c 0 1 1 0 1 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.0f,
                    dx2 = 1.0f,
                    dy2 = 0.0f,
                    dx3 = 1.0f,
                    dy3 = -2.0f,
                )
                // c 0 -3 -0.833 -5 -5 -5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.0f,
                    dx2 = -0.833f,
                    dy2 = -5.0f,
                    dx3 = -5.0f,
                    dy3 = -5.0f,
                )
                // s -5 3 -5 5
                reflectiveCurveToRelative(
                    dx1 = -5.0f,
                    dy1 = 3.0f,
                    dx2 = -5.0f,
                    dy2 = 5.0f,
                )
                // c 0 1 1 3 1 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.0f,
                    dx2 = 1.0f,
                    dy2 = 3.0f,
                    dx3 = 1.0f,
                    dy3 = 2.0f,
                )
                // s 0.667 -2 4 -2
                reflectiveCurveToRelative(
                    dx1 = 0.667f,
                    dy1 = -2.0f,
                    dx2 = 4.0f,
                    dy2 = -2.0f,
                )
                // s 4 1 4 2z
                reflectiveCurveToRelative(
                    dx1 = 4.0f,
                    dy1 = 1.0f,
                    dx2 = 4.0f,
                    dy2 = 2.0f,
                )
                close()
            }
            // M12 19 H5 c0 -1 1 -3 1 -3 h4 c0.552 0 1 -0.448 1 -1 v-4 s-2 0 -2 -2 c0 -0.326 0.106 -0.652 0.25 -0.944 C9.573 7.4 10.258 7 10.99 7 H33 c2 0 3 5 3 12 h-8 s0 -8 -3 -8 H12 v8z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 12 19
                moveTo(x = 12.0f, y = 19.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
                // c 0 -1 1 -3 1 -3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -3.0f,
                    dx3 = 1.0f,
                    dy3 = -3.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // c 0.552 0 1 -0.448 1 -1
                curveToRelative(
                    dx1 = 0.552f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -0.448f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // s -2 0 -2 -2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -2.0f,
                )
                // c 0 -0.326 0.106 -0.652 0.25 -0.944
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.326f,
                    dx2 = 0.106f,
                    dy2 = -0.652f,
                    dx3 = 0.25f,
                    dy3 = -0.944f,
                )
                // C 9.573 7.4 10.258 7 10.99 7
                curveTo(
                    x1 = 9.573f,
                    y1 = 7.4f,
                    x2 = 10.258f,
                    y2 = 7.0f,
                    x3 = 10.99f,
                    y3 = 7.0f,
                )
                // H 33
                horizontalLineTo(x = 33.0f)
                // c 2 0 3 5 3 12
                curveToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                    dx2 = 3.0f,
                    dy2 = 5.0f,
                    dx3 = 3.0f,
                    dy3 = 12.0f,
                )
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // s 0 -8 -3 -8
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -8.0f,
                    dx2 = -3.0f,
                    dy2 = -8.0f,
                )
                // H 12
                horizontalLineTo(x = 12.0f)
                // v 8z
                verticalLineToRelative(dy = 8.0f)
                close()
            }
            // M30 32 m-4 0 a4 4 0 1 1 8 0 a4 4 0 1 1 -8 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 30 32
                moveTo(x = 30.0f, y = 32.0f)
                // m -4 0
                moveToRelative(dx = -4.0f, dy = 0.0f)
                // a 4 4 0 1 1 8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 8.0f,
                    dy1 = 0.0f,
                )
                // a 4 4 0 1 1 -8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -8.0f,
                    dy1 = 0.0f,
                )
            }
            // M30 32 m-2 0 a2 2 0 1 1 4 0 a2 2 0 1 1 -4 0
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 30 32
                moveTo(x = 30.0f, y = 32.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
            }
            // M9 18.5 v-1 c0 -0.276 -0.224 -0.5 -0.5 -0.5 H5.552 C5.286 17.648 5 18.464 5 19 h3.5 c0.276 0 0.5 -0.224 0.5 -0.5z
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 9 18.5
                moveTo(x = 9.0f, y = 18.5f)
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // c 0 -0.276 -0.224 -0.5 -0.5 -0.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.276f,
                    dx2 = -0.224f,
                    dy2 = -0.5f,
                    dx3 = -0.5f,
                    dy3 = -0.5f,
                )
                // H 5.552
                horizontalLineTo(x = 5.552f)
                // C 5.286 17.648 5 18.464 5 19
                curveTo(
                    x1 = 5.286f,
                    y1 = 17.648f,
                    x2 = 5.0f,
                    y2 = 18.464f,
                    x3 = 5.0f,
                    y3 = 19.0f,
                )
                // h 3.5
                horizontalLineToRelative(dx = 3.5f)
                // c 0.276 0 0.5 -0.224 0.5 -0.5z
                curveToRelative(
                    dx1 = 0.276f,
                    dy1 = 0.0f,
                    dx2 = 0.5f,
                    dy2 = -0.224f,
                    dx3 = 0.5f,
                    dy3 = -0.5f,
                )
                close()
            }
        }.build().also { _emoji1f6fa = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f6fa: ImageVector? = null
