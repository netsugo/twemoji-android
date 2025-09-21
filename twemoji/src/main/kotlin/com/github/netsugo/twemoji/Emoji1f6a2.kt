package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f6a2: ImageVector
    get() {
        val current = _emoji1f6a2
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f6a2",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M16 0 h4 v5 h-4z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 16 0
                moveTo(x = 16.0f, y = 0.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // M16 2 h4 v4 h-4z
            path(
                fill = SolidColor(Color(0xFFD1D3D4)),
            ) {
                // M 16 2
                moveTo(x = 16.0f, y = 2.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // M18 2 h2 v4 h-2z
            path(
                fill = SolidColor(Color(0xFFA7A9AC)),
            ) {
                // M 18 2
                moveTo(x = 18.0f, y = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // M18 19 H5 s1.355 8 4.875 14 C13.394 39 18 33 18 33 s4.606 6 8.125 0 C29.645 27 31 19 31 19 H18z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 18 19
                moveTo(x = 18.0f, y = 19.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
                // s 1.355 8 4.875 14
                reflectiveCurveToRelative(
                    dx1 = 1.355f,
                    dy1 = 8.0f,
                    dx2 = 4.875f,
                    dy2 = 14.0f,
                )
                // C 13.394 39 18 33 18 33
                curveTo(
                    x1 = 13.394f,
                    y1 = 39.0f,
                    x2 = 18.0f,
                    y2 = 33.0f,
                    x3 = 18.0f,
                    y3 = 33.0f,
                )
                // s 4.606 6 8.125 0
                reflectiveCurveToRelative(
                    dx1 = 4.606f,
                    dy1 = 6.0f,
                    dx2 = 8.125f,
                    dy2 = 0.0f,
                )
                // C 29.645 27 31 19 31 19
                curveTo(
                    x1 = 29.645f,
                    y1 = 27.0f,
                    x2 = 31.0f,
                    y2 = 19.0f,
                    x3 = 31.0f,
                    y3 = 19.0f,
                )
                // H 18z
                horizontalLineTo(x = 18.0f)
                close()
            }
            // M18 19 H5 s1.355 8 4.875 14 C13.394 39 18 33 18 33 V19z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 18 19
                moveTo(x = 18.0f, y = 19.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
                // s 1.355 8 4.875 14
                reflectiveCurveToRelative(
                    dx1 = 1.355f,
                    dy1 = 8.0f,
                    dx2 = 4.875f,
                    dy2 = 14.0f,
                )
                // C 13.394 39 18 33 18 33
                curveTo(
                    x1 = 13.394f,
                    y1 = 39.0f,
                    x2 = 18.0f,
                    y2 = 33.0f,
                    x3 = 18.0f,
                    y3 = 33.0f,
                )
                // V 19z
                verticalLineTo(y = 19.0f)
                close()
            }
            // M0 30 h36 v6 H0z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 0 30
                moveTo(x = 0.0f, y = 30.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // H 0z
                horizontalLineTo(x = 0.0f)
                close()
            }
            // M30 9 h-2.45 l-0.242 -4 H8.692 l-0.241 4 H6 v6 h2.088 l-0.242 4 h20.308 l-0.242 -4 H30z
            path(
                fill = SolidColor(Color(0xFFE6E7E8)),
            ) {
                // M 30 9
                moveTo(x = 30.0f, y = 9.0f)
                // h -2.45
                horizontalLineToRelative(dx = -2.45f)
                // l -0.242 -4
                lineToRelative(dx = -0.242f, dy = -4.0f)
                // H 8.692
                horizontalLineTo(x = 8.692f)
                // l -0.241 4
                lineToRelative(dx = -0.241f, dy = 4.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h 2.088
                horizontalLineToRelative(dx = 2.088f)
                // l -0.242 4
                lineToRelative(dx = -0.242f, dy = 4.0f)
                // h 20.308
                horizontalLineToRelative(dx = 20.308f)
                // l -0.242 -4
                lineToRelative(dx = -0.242f, dy = -4.0f)
                // H 30z
                horizontalLineTo(x = 30.0f)
                close()
            }
            // M10 15 h16 v4 H10z
            path(
                fill = SolidColor(Color(0xFFD1D3D4)),
            ) {
                // M 10 15
                moveTo(x = 10.0f, y = 15.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // H 10z
                horizontalLineTo(x = 10.0f)
                close()
            }
            // M8 11 h20 v2 H8z
            path(
                fill = SolidColor(Color(0xFF6D6E71)),
            ) {
                // M 8 11
                moveTo(x = 8.0f, y = 11.0f)
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 8z
                horizontalLineTo(x = 8.0f)
                close()
            }
            // M10 7 h16 v2 H10z
            path(
                fill = SolidColor(Color(0xFFBCBEC0)),
            ) {
                // M 10 7
                moveTo(x = 10.0f, y = 7.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 10z
                horizontalLineTo(x = 10.0f)
                close()
            }
            // M5.913 23 h24.174 c0.201 -0.747 0.368 -1.427 0.5 -2 H5.413 c0.132 0.573 0.299 1.253 0.5 2z
            path(
                fill = SolidColor(Color(0xFFBE1931)),
            ) {
                // M 5.913 23
                moveTo(x = 5.913f, y = 23.0f)
                // h 24.174
                horizontalLineToRelative(dx = 24.174f)
                // c 0.201 -0.747 0.368 -1.427 0.5 -2
                curveToRelative(
                    dx1 = 0.201f,
                    dy1 = -0.747f,
                    dx2 = 0.368f,
                    dy2 = -1.427f,
                    dx3 = 0.5f,
                    dy3 = -2.0f,
                )
                // H 5.413
                horizontalLineTo(x = 5.413f)
                // c 0.132 0.573 0.299 1.253 0.5 2z
                curveToRelative(
                    dx1 = 0.132f,
                    dy1 = 0.573f,
                    dx2 = 0.299f,
                    dy2 = 1.253f,
                    dx3 = 0.5f,
                    dy3 = 2.0f,
                )
                close()
            }
            // M18 23 h12.087 c0.201 -0.747 0.368 -1.427 0.5 -2 H18 v2z
            path(
                fill = SolidColor(Color(0xFFA0041E)),
            ) {
                // M 18 23
                moveTo(x = 18.0f, y = 23.0f)
                // h 12.087
                horizontalLineToRelative(dx = 12.087f)
                // c 0.201 -0.747 0.368 -1.427 0.5 -2
                curveToRelative(
                    dx1 = 0.201f,
                    dy1 = -0.747f,
                    dx2 = 0.368f,
                    dy2 = -1.427f,
                    dx3 = 0.5f,
                    dy3 = -2.0f,
                )
                // H 18
                horizontalLineTo(x = 18.0f)
                // v 2z
                verticalLineToRelative(dy = 2.0f)
                close()
            }
            // M12 17 h12 v2 H12z
            path(
                fill = SolidColor(Color(0xFFBCBEC0)),
            ) {
                // M 12 17
                moveTo(x = 12.0f, y = 17.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 12z
                horizontalLineTo(x = 12.0f)
                close()
            }
            // M16 0 h2 v2 h-2z
            path(
                fill = SolidColor(Color(0xFF58595B)),
            ) {
                // M 16 0
                moveTo(x = 16.0f, y = 0.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
        }.build().also { _emoji1f6a2 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f6a2: ImageVector? = null
