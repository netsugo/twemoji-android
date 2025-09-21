package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f916: ImageVector
    get() {
        val current = _emoji1f916
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f916",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M31 14.5 a2.5 3.5 0 1 0 5 0 a2.5 3.5 0 1 0 -5 0z
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 31 14.5
                moveTo(x = 31.0f, y = 14.5f)
                // a 2.5 3.5 0 1 0 5 0
                arcToRelative(
                    a = 2.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // a 2.5 3.5 0 1 0 -5 0z
                arcToRelative(
                    a = 2.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -5.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M0 14.5 a2.5 3.5 0 1 0 5 0 a2.5 3.5 0 1 0 -5 0z
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 0 14.5
                moveTo(x = 0.0f, y = 14.5f)
                // a 2.5 3.5 0 1 0 5 0
                arcToRelative(
                    a = 2.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // a 2.5 3.5 0 1 0 -5 0z
                arcToRelative(
                    a = 2.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -5.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M34 19 c0 0.553 -0.447 1 -1 1 h-3 c-0.553 0 -1 -0.447 -1 -1 v-9 c0 -0.552 0.447 -1 1 -1 h3 c0.553 0 1 0.448 1 1 v9z M7 19 c0 0.553 -0.448 1 -1 1 H3 c-0.552 0 -1 -0.447 -1 -1 v-9 c0 -0.552 0.448 -1 1 -1 h3 c0.552 0 1 0.448 1 1 v9z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 34 19
                moveTo(x = 34.0f, y = 19.0f)
                // c 0 0.553 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // c -0.553 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.553f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // v -9
                verticalLineToRelative(dy = -9.0f)
                // c 0 -0.552 0.447 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = 0.447f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // c 0.553 0 1 0.448 1 1
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.448f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // v 9z
                verticalLineToRelative(dy = 9.0f)
                close()
                // M 7 19
                moveTo(x = 7.0f, y = 19.0f)
                // c 0 0.553 -0.448 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.448f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // H 3
                horizontalLineTo(x = 3.0f)
                // c -0.552 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // v -9
                verticalLineToRelative(dy = -9.0f)
                // c 0 -0.552 0.448 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = 0.448f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // c 0.552 0 1 0.448 1 1
                curveToRelative(
                    dx1 = 0.552f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.448f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // v 9z
                verticalLineToRelative(dy = 9.0f)
                close()
            }
            // M28 5 c0 2.761 -4.478 4 -10 4 C12.477 9 8 7.761 8 5 s4.477 -5 10 -5 c5.522 0 10 2.239 10 5z
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 28 5
                moveTo(x = 28.0f, y = 5.0f)
                // c 0 2.761 -4.478 4 -10 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.761f,
                    dx2 = -4.478f,
                    dy2 = 4.0f,
                    dx3 = -10.0f,
                    dy3 = 4.0f,
                )
                // C 12.477 9 8 7.761 8 5
                curveTo(
                    x1 = 12.477f,
                    y1 = 9.0f,
                    x2 = 8.0f,
                    y2 = 7.761f,
                    x3 = 8.0f,
                    y3 = 5.0f,
                )
                // s 4.477 -5 10 -5
                reflectiveCurveToRelative(
                    dx1 = 4.477f,
                    dy1 = -5.0f,
                    dx2 = 10.0f,
                    dy2 = -5.0f,
                )
                // c 5.522 0 10 2.239 10 5z
                curveToRelative(
                    dx1 = 5.522f,
                    dy1 = 0.0f,
                    dx2 = 10.0f,
                    dy2 = 2.239f,
                    dx3 = 10.0f,
                    dy3 = 5.0f,
                )
                close()
            }
            // M25 4.083 C25 5.694 21.865 7 18 7 c-3.866 0 -7 -1.306 -7 -2.917 0 -1.611 3.134 -2.917 7 -2.917 3.865 0 7 1.306 7 2.917z
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 25 4.083
                moveTo(x = 25.0f, y = 4.083f)
                // C 25 5.694 21.865 7 18 7
                curveTo(
                    x1 = 25.0f,
                    y1 = 5.694f,
                    x2 = 21.865f,
                    y2 = 7.0f,
                    x3 = 18.0f,
                    y3 = 7.0f,
                )
                // c -3.866 0 -7 -1.306 -7 -2.917
                curveToRelative(
                    dx1 = -3.866f,
                    dy1 = 0.0f,
                    dx2 = -7.0f,
                    dy2 = -1.306f,
                    dx3 = -7.0f,
                    dy3 = -2.917f,
                )
                // c 0 -1.611 3.134 -2.917 7 -2.917
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.611f,
                    dx2 = 3.134f,
                    dy2 = -2.917f,
                    dx3 = 7.0f,
                    dy3 = -2.917f,
                )
                // c 3.865 0 7 1.306 7 2.917z
                curveToRelative(
                    dx1 = 3.865f,
                    dy1 = 0.0f,
                    dx2 = 7.0f,
                    dy2 = 1.306f,
                    dx3 = 7.0f,
                    dy3 = 2.917f,
                )
                close()
            }
            // M30 5.5 C30 6.881 28.881 7 27.5 7 h-19 C7.119 7 6 6.881 6 5.5 S7.119 3 8.5 3 h19 C28.881 3 30 4.119 30 5.5z
            path(
                fill = SolidColor(Color(0xFF226699)),
            ) {
                // M 30 5.5
                moveTo(x = 30.0f, y = 5.5f)
                // C 30 6.881 28.881 7 27.5 7
                curveTo(
                    x1 = 30.0f,
                    y1 = 6.881f,
                    x2 = 28.881f,
                    y2 = 7.0f,
                    x3 = 27.5f,
                    y3 = 7.0f,
                )
                // h -19
                horizontalLineToRelative(dx = -19.0f)
                // C 7.119 7 6 6.881 6 5.5
                curveTo(
                    x1 = 7.119f,
                    y1 = 7.0f,
                    x2 = 6.0f,
                    y2 = 6.881f,
                    x3 = 6.0f,
                    y3 = 5.5f,
                )
                // S 7.119 3 8.5 3
                reflectiveCurveTo(
                    x1 = 7.119f,
                    y1 = 3.0f,
                    x2 = 8.5f,
                    y2 = 3.0f,
                )
                // h 19
                horizontalLineToRelative(dx = 19.0f)
                // C 28.881 3 30 4.119 30 5.5z
                curveTo(
                    x1 = 28.881f,
                    y1 = 3.0f,
                    x2 = 30.0f,
                    y2 = 4.119f,
                    x3 = 30.0f,
                    y3 = 5.5f,
                )
                close()
            }
            // M30 6 H6 c-1.104 0 -2 0.896 -2 2 v26 h28 V8 c0 -1.104 -0.896 -2 -2 -2z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 30 6
                moveTo(x = 30.0f, y = 6.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // c -1.104 0 -2 0.896 -2 2
                curveToRelative(
                    dx1 = -1.104f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = 0.896f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // v 26
                verticalLineToRelative(dy = 26.0f)
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // c 0 -1.104 -0.896 -2 -2 -2z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.104f,
                    dx2 = -0.896f,
                    dy2 = -2.0f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                close()
            }
            // M35 33 v-1 c0 -1.104 -0.896 -2 -2 -2 H22.071 l-3.364 3.364 c-0.391 0.391 -1.023 0.391 -1.414 0 L13.929 30 H3 c-1.104 0 -2 0.896 -2 2 v1 c0 1.104 -0.104 2 1 2 h32 c1.104 0 1 -0.896 1 -2z
            path(
                fill = SolidColor(Color(0xFF3B88C3)),
            ) {
                // M 35 33
                moveTo(x = 35.0f, y = 33.0f)
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // c 0 -1.104 -0.896 -2 -2 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.104f,
                    dx2 = -0.896f,
                    dy2 = -2.0f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // H 22.071
                horizontalLineTo(x = 22.071f)
                // l -3.364 3.364
                lineToRelative(dx = -3.364f, dy = 3.364f)
                // c -0.391 0.391 -1.023 0.391 -1.414 0
                curveToRelative(
                    dx1 = -0.391f,
                    dy1 = 0.391f,
                    dx2 = -1.023f,
                    dy2 = 0.391f,
                    dx3 = -1.414f,
                    dy3 = 0.0f,
                )
                // L 13.929 30
                lineTo(x = 13.929f, y = 30.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // c -1.104 0 -2 0.896 -2 2
                curveToRelative(
                    dx1 = -1.104f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = 0.896f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // c 0 1.104 -0.104 2 1 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = -0.104f,
                    dy2 = 2.0f,
                    dx3 = 1.0f,
                    dy3 = 2.0f,
                )
                // h 32
                horizontalLineToRelative(dx = 32.0f)
                // c 1.104 0 1 -0.896 1 -2z
                curveToRelative(
                    dx1 = 1.104f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -0.896f,
                    dx3 = 1.0f,
                    dy3 = -2.0f,
                )
                close()
            }
            // M24.5 14.5 m-4.5 0 a4.5 4.5 0 1 1 9 0 a4.5 4.5 0 1 1 -9 0
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 24.5 14.5
                moveTo(x = 24.5f, y = 14.5f)
                // m -4.5 0
                moveToRelative(dx = -4.5f, dy = 0.0f)
                // a 4.5 4.5 0 1 1 9 0
                arcToRelative(
                    a = 4.5f,
                    b = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 9.0f,
                    dy1 = 0.0f,
                )
                // a 4.5 4.5 0 1 1 -9 0
                arcToRelative(
                    a = 4.5f,
                    b = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -9.0f,
                    dy1 = 0.0f,
                )
            }
            // M24.5 14.5 m-2.721 0 a2.721 2.721 0 1 1 5.442 0 a2.721 2.721 0 1 1 -5.442 0
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 24.5 14.5
                moveTo(x = 24.5f, y = 14.5f)
                // m -2.721 0
                moveToRelative(dx = -2.721f, dy = 0.0f)
                // a 2.721 2.721 0 1 1 5.442 0
                arcToRelative(
                    a = 2.721f,
                    b = 2.721f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 5.442f,
                    dy1 = 0.0f,
                )
                // a 2.721 2.721 0 1 1 -5.442 0
                arcToRelative(
                    a = 2.721f,
                    b = 2.721f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -5.442f,
                    dy1 = 0.0f,
                )
            }
            // M11.5 14.5 m-4.5 0 a4.5 4.5 0 1 1 9 0 a4.5 4.5 0 1 1 -9 0
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 11.5 14.5
                moveTo(x = 11.5f, y = 14.5f)
                // m -4.5 0
                moveToRelative(dx = -4.5f, dy = 0.0f)
                // a 4.5 4.5 0 1 1 9 0
                arcToRelative(
                    a = 4.5f,
                    b = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 9.0f,
                    dy1 = 0.0f,
                )
                // a 4.5 4.5 0 1 1 -9 0
                arcToRelative(
                    a = 4.5f,
                    b = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -9.0f,
                    dy1 = 0.0f,
                )
            }
            // M29 25.5 c0 1.381 -1.119 2.5 -2.5 2.5 h-17 C8.119 28 7 26.881 7 25.5 S8.119 23 9.5 23 h17 c1.381 0 2.5 1.119 2.5 2.5z
            path(
                fill = SolidColor(Color(0xFFF5F8FA)),
            ) {
                // M 29 25.5
                moveTo(x = 29.0f, y = 25.5f)
                // c 0 1.381 -1.119 2.5 -2.5 2.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.381f,
                    dx2 = -1.119f,
                    dy2 = 2.5f,
                    dx3 = -2.5f,
                    dy3 = 2.5f,
                )
                // h -17
                horizontalLineToRelative(dx = -17.0f)
                // C 8.119 28 7 26.881 7 25.5
                curveTo(
                    x1 = 8.119f,
                    y1 = 28.0f,
                    x2 = 7.0f,
                    y2 = 26.881f,
                    x3 = 7.0f,
                    y3 = 25.5f,
                )
                // S 8.119 23 9.5 23
                reflectiveCurveTo(
                    x1 = 8.119f,
                    y1 = 23.0f,
                    x2 = 9.5f,
                    y2 = 23.0f,
                )
                // h 17
                horizontalLineToRelative(dx = 17.0f)
                // c 1.381 0 2.5 1.119 2.5 2.5z
                curveToRelative(
                    dx1 = 1.381f,
                    dy1 = 0.0f,
                    dx2 = 2.5f,
                    dy2 = 1.119f,
                    dx3 = 2.5f,
                    dy3 = 2.5f,
                )
                close()
            }
            // M17 23 h2 v5 h-2z M12 23 h2 v5 h-2z M22 23 h2 v5 h-2z M7 25.5 c0 1.21 0.859 2.218 2 2.45 v-4.9 c-1.141 0.232 -2 1.24 -2 2.45z M27 23.05 v4.899 c1.141 -0.232 2 -1.24 2 -2.45 s-0.859 -2.217 -2 -2.449z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 17 23
                moveTo(x = 17.0f, y = 23.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
                // M 12 23
                moveTo(x = 12.0f, y = 23.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
                // M 22 23
                moveTo(x = 22.0f, y = 23.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
                // M 7 25.5
                moveTo(x = 7.0f, y = 25.5f)
                // c 0 1.21 0.859 2.218 2 2.45
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.21f,
                    dx2 = 0.859f,
                    dy2 = 2.218f,
                    dx3 = 2.0f,
                    dy3 = 2.45f,
                )
                // v -4.9
                verticalLineToRelative(dy = -4.9f)
                // c -1.141 0.232 -2 1.24 -2 2.45z
                curveToRelative(
                    dx1 = -1.141f,
                    dy1 = 0.232f,
                    dx2 = -2.0f,
                    dy2 = 1.24f,
                    dx3 = -2.0f,
                    dy3 = 2.45f,
                )
                close()
                // M 27 23.05
                moveTo(x = 27.0f, y = 23.05f)
                // v 4.899
                verticalLineToRelative(dy = 4.899f)
                // c 1.141 -0.232 2 -1.24 2 -2.45
                curveToRelative(
                    dx1 = 1.141f,
                    dy1 = -0.232f,
                    dx2 = 2.0f,
                    dy2 = -1.24f,
                    dx3 = 2.0f,
                    dy3 = -2.45f,
                )
                // s -0.859 -2.217 -2 -2.449z
                reflectiveCurveToRelative(
                    dx1 = -0.859f,
                    dy1 = -2.217f,
                    dx2 = -2.0f,
                    dy2 = -2.449f,
                )
                close()
            }
            // M11.5 14.5 m-2.721 0 a2.721 2.721 0 1 1 5.442 0 a2.721 2.721 0 1 1 -5.442 0
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 11.5 14.5
                moveTo(x = 11.5f, y = 14.5f)
                // m -2.721 0
                moveToRelative(dx = -2.721f, dy = 0.0f)
                // a 2.721 2.721 0 1 1 5.442 0
                arcToRelative(
                    a = 2.721f,
                    b = 2.721f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 5.442f,
                    dy1 = 0.0f,
                )
                // a 2.721 2.721 0 1 1 -5.442 0
                arcToRelative(
                    a = 2.721f,
                    b = 2.721f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -5.442f,
                    dy1 = 0.0f,
                )
            }
        }.build().also { _emoji1f916 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f916: ImageVector? = null
