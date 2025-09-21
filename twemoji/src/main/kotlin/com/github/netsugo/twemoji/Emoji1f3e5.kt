package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f3e5: ImageVector
    get() {
        val current = _emoji1f3e5
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f3e5",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M0 9 v25 a2 2 0 0 0 2 2 h32 a2 2 0 0 0 2 -2 V9 H0Z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 0 9
                moveTo(x = 0.0f, y = 9.0f)
                // v 25
                verticalLineToRelative(dy = 25.0f)
                // a 2 2 0 0 0 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // h 32
                horizontalLineToRelative(dx = 32.0f)
                // a 2 2 0 0 0 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // V 9
                verticalLineTo(y = 9.0f)
                // H 0z
                horizontalLineTo(x = 0.0f)
                close()
            }
            // M34 7 H2 a2 2 0 0 0 -2 2 h36 a2 2 0 0 0 -2 -2Z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 34 7
                moveTo(x = 34.0f, y = 7.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // a 2 2 0 0 0 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // a 2 2 0 0 0 -2 -2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                close()
            }
            // M2 18 h32 v4 L2 22 v-4Z M2 12 h32 v4 L2 16 v-4Z M2 24 h32 v4 L2 28 v-4Z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 2 18
                moveTo(x = 2.0f, y = 18.0f)
                // h 32
                horizontalLineToRelative(dx = 32.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // L 2 22
                lineTo(x = 2.0f, y = 22.0f)
                // v -4z
                verticalLineToRelative(dy = -4.0f)
                close()
                // M 2 12
                moveTo(x = 2.0f, y = 12.0f)
                // h 32
                horizontalLineToRelative(dx = 32.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // L 2 16
                lineTo(x = 2.0f, y = 16.0f)
                // v -4z
                verticalLineToRelative(dy = -4.0f)
                close()
                // M 2 24
                moveTo(x = 2.0f, y = 24.0f)
                // h 32
                horizontalLineToRelative(dx = 32.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // L 2 28
                lineTo(x = 2.0f, y = 28.0f)
                // v -4z
                verticalLineToRelative(dy = -4.0f)
                close()
            }
            // M34 24 H2 v4 h32 v-4Z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 34 24
                moveTo(x = 34.0f, y = 24.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h 32
                horizontalLineToRelative(dx = 32.0f)
                // v -4z
                verticalLineToRelative(dy = -4.0f)
                close()
            }
            // M8 2 h20 v34 H8 V2Z
            path(
                fill = SolidColor(Color(0xFFE1E8ED)),
            ) {
                // M 8 2
                moveTo(x = 8.0f, y = 2.0f)
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // v 34
                verticalLineToRelative(dy = 34.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // V 2z
                verticalLineTo(y = 2.0f)
                close()
            }
            // M10 20 h16 v4 L10 24 v-4Z M10 14 h16 v4 L10 18 v-4Z M10 26 h16 v4 L10 30 v-4Z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 10 20
                moveTo(x = 10.0f, y = 20.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // L 10 24
                lineTo(x = 10.0f, y = 24.0f)
                // v -4z
                verticalLineToRelative(dy = -4.0f)
                close()
                // M 10 14
                moveTo(x = 10.0f, y = 14.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // L 10 18
                lineTo(x = 10.0f, y = 18.0f)
                // v -4z
                verticalLineToRelative(dy = -4.0f)
                close()
                // M 10 26
                moveTo(x = 10.0f, y = 26.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // L 10 30
                lineTo(x = 10.0f, y = 30.0f)
                // v -4z
                verticalLineToRelative(dy = -4.0f)
                close()
            }
            // M13 32 h10 v4 H13 v-4Z
            path(
                fill = SolidColor(Color(0xFF3B88C3)),
            ) {
                // M 13 32
                moveTo(x = 13.0f, y = 32.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // H 13
                horizontalLineTo(x = 13.0f)
                // v -4z
                verticalLineToRelative(dy = -4.0f)
                close()
            }
            // M22 6.5 v3 h-2.5 L19.5 12 h-3 L16.5 9.5 L14 9.5 v-3 h2.5 L16.5 4 h3 v2.5 L22 6.5Z M17.5 7.5 L15 7.5 v1 h2.5 L17.5 11 h1 L18.5 8.5 L21 8.5 v-1 h-2.5 L18.5 5 h-1 v2.5Z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 22 6.5
                moveTo(x = 22.0f, y = 6.5f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h -2.5
                horizontalLineToRelative(dx = -2.5f)
                // L 19.5 12
                lineTo(x = 19.5f, y = 12.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // L 16.5 9.5
                lineTo(x = 16.5f, y = 9.5f)
                // L 14 9.5
                lineTo(x = 14.0f, y = 9.5f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // h 2.5
                horizontalLineToRelative(dx = 2.5f)
                // L 16.5 4
                lineTo(x = 16.5f, y = 4.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 2.5
                verticalLineToRelative(dy = 2.5f)
                // L 22 6.5z
                lineTo(x = 22.0f, y = 6.5f)
                close()
                // M 17.5 7.5
                moveTo(x = 17.5f, y = 7.5f)
                // L 15 7.5
                lineTo(x = 15.0f, y = 7.5f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // h 2.5
                horizontalLineToRelative(dx = 2.5f)
                // L 17.5 11
                lineTo(x = 17.5f, y = 11.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // L 18.5 8.5
                lineTo(x = 18.5f, y = 8.5f)
                // L 21 8.5
                lineTo(x = 21.0f, y = 8.5f)
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // h -2.5
                horizontalLineToRelative(dx = -2.5f)
                // L 18.5 5
                lineTo(x = 18.5f, y = 5.0f)
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // v 2.5z
                verticalLineToRelative(dy = 2.5f)
                close()
            }
            // M26 0 H10 a2 2 0 0 0 -2 2 h20 a2 2 0 0 0 -2 -2Z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 26 0
                moveTo(x = 26.0f, y = 0.0f)
                // H 10
                horizontalLineTo(x = 10.0f)
                // a 2 2 0 0 0 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // a 2 2 0 0 0 -2 -2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                close()
            }
        }.build().also { _emoji1f3e5 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f3e5: ImageVector? = null
