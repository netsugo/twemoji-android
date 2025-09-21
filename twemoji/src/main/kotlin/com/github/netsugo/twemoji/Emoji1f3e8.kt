package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f3e8: ImageVector
    get() {
        val current = _emoji1f3e8
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f3e8",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M21 15 c0 2.209 -1.791 4 -4 4 H4 c-2.209 0 -4 -1.791 -4 -4 v-3 c0 -2.209 1.791 -4 4 -4 h13 c2.209 0 4 1.791 4 4 v3z
            path(
                fill = SolidColor(Color(0xFFC1694F)),
            ) {
                // M 21 15
                moveTo(x = 21.0f, y = 15.0f)
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
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // c 0 -2.209 1.791 -4 4 -4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.209f,
                    dx2 = 1.791f,
                    dy2 = -4.0f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // h 13
                horizontalLineToRelative(dx = 13.0f)
                // c 2.209 0 4 1.791 4 4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = 1.791f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // v 3z
                verticalLineToRelative(dy = 3.0f)
                close()
            }
            // M36 6 c0 2.209 -1.791 4 -4 4 H20 c-2.209 0 -4 -1.791 -4 -4 V5 c0 -2.209 1.791 -4 4 -4 h12 c2.209 0 4 1.791 4 4 v1z
            path(
                fill = SolidColor(Color(0xFFC1694F)),
            ) {
                // M 36 6
                moveTo(x = 36.0f, y = 6.0f)
                // c 0 2.209 -1.791 4 -4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = -1.791f,
                    dy2 = 4.0f,
                    dx3 = -4.0f,
                    dy3 = 4.0f,
                )
                // H 20
                horizontalLineTo(x = 20.0f)
                // c -2.209 0 -4 -1.791 -4 -4
                curveToRelative(
                    dx1 = -2.209f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = -1.791f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                // V 5
                verticalLineTo(y = 5.0f)
                // c 0 -2.209 1.791 -4 4 -4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.209f,
                    dx2 = 1.791f,
                    dy2 = -4.0f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // c 2.209 0 4 1.791 4 4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = 1.791f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // v 1z
                verticalLineToRelative(dy = 1.0f)
                close()
            }
            // M0 12 v22 c0 1.104 0.896 2 2 2 h31 V12 H0z
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 0 12
                moveTo(x = 0.0f, y = 12.0f)
                // v 22
                verticalLineToRelative(dy = 22.0f)
                // c 0 1.104 0.896 2 2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = 0.896f,
                    dy2 = 2.0f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                // h 31
                horizontalLineToRelative(dx = 31.0f)
                // V 12
                verticalLineTo(y = 12.0f)
                // H 0z
                horizontalLineTo(x = 0.0f)
                close()
            }
            // M2 32 h12 v4 L2 36z M2 26 h16 v4 L2 30z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 2 32
                moveTo(x = 2.0f, y = 32.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // L 2 36z
                lineTo(x = 2.0f, y = 36.0f)
                close()
                // M 2 26
                moveTo(x = 2.0f, y = 26.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // L 2 30z
                lineTo(x = 2.0f, y = 30.0f)
                close()
            }
            // M16 5 v31 h18 c1.104 0 2 -0.896 2 -2 V5 H16z
            path(
                fill = SolidColor(Color(0xFFFFE8B6)),
            ) {
                // M 16 5
                moveTo(x = 16.0f, y = 5.0f)
                // v 31
                verticalLineToRelative(dy = 31.0f)
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // c 1.104 0 2 -0.896 2 -2
                curveToRelative(
                    dx1 = 1.104f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = -0.896f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // V 5
                verticalLineTo(y = 5.0f)
                // H 16z
                horizontalLineTo(x = 16.0f)
                close()
            }
            // M18 20 h16 v4 L18 24z M18 14 h16 v4 L18 18z M18 8 h16 v4 L18 12z M18 26 h16 v4 L18 30z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 18 20
                moveTo(x = 18.0f, y = 20.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // L 18 24z
                lineTo(x = 18.0f, y = 24.0f)
                close()
                // M 18 14
                moveTo(x = 18.0f, y = 14.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // L 18 18z
                lineTo(x = 18.0f, y = 18.0f)
                close()
                // M 18 8
                moveTo(x = 18.0f, y = 8.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // L 18 12z
                lineTo(x = 18.0f, y = 12.0f)
                close()
                // M 18 26
                moveTo(x = 18.0f, y = 26.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // L 18 30z
                lineTo(x = 18.0f, y = 30.0f)
                close()
            }
            // M22 7 h2 v24 h-2z M28 7 h2 v24 h-2z
            path(
                fill = SolidColor(Color(0xFFFFE8B6)),
            ) {
                // M 22 7
                moveTo(x = 22.0f, y = 7.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 24
                verticalLineToRelative(dy = 24.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
                // M 28 7
                moveTo(x = 28.0f, y = 7.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 24
                verticalLineToRelative(dy = 24.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // M22 32 h8 v4 h-8z M10 14 v4 H6 v-4 H4 v10 h2 v-4 h4 v4 h2 V14z
            path(
                fill = SolidColor(Color(0xFF3B88C3)),
            ) {
                // M 22 32
                moveTo(x = 22.0f, y = 32.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -8z
                horizontalLineToRelative(dx = -8.0f)
                close()
                // M 10 14
                moveTo(x = 10.0f, y = 14.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 14z
                verticalLineTo(y = 14.0f)
                close()
            }
            // M7 25 h2 v6 L7 31z M14 25 h2 v6 h-2z
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 7 25
                moveTo(x = 7.0f, y = 25.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // L 7 31z
                lineTo(x = 7.0f, y = 31.0f)
                close()
                // M 14 25
                moveTo(x = 14.0f, y = 25.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
        }.build().also { _emoji1f3e8 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f3e8: ImageVector? = null
