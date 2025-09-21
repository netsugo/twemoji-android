package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f6e5: ImageVector
    get() {
        val current = _emoji1f6e5
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f6e5",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M35 19 c0 0.553 -0.447 1 -1 1 h-3 c-0.553 0 -1 -0.447 -1 -1 v-2 c0 -0.552 0.447 -1 1 -1 h3 c0.553 0 1 0.448 1 1 v2z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 35 19
                moveTo(x = 35.0f, y = 19.0f)
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
                // v -2
                verticalLineToRelative(dy = -2.0f)
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
                // v 2z
                verticalLineToRelative(dy = 2.0f)
                close()
            }
            // M32 18 h2 v7 h-2z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 32 18
                moveTo(x = 32.0f, y = 18.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // M6 19.219 S11 15 16 15 h0.029 L16 20 s0 1 -4 1 -6 -1.781 -6 -1.781z
            path(
                fill = SolidColor(Color(0xFFE1E8ED)),
            ) {
                // M 6 19.219
                moveTo(x = 6.0f, y = 19.219f)
                // S 11 15 16 15
                reflectiveCurveTo(
                    x1 = 11.0f,
                    y1 = 15.0f,
                    x2 = 16.0f,
                    y2 = 15.0f,
                )
                // h 0.029
                horizontalLineToRelative(dx = 0.029f)
                // L 16 20
                lineTo(x = 16.0f, y = 20.0f)
                // s 0 1 -4 1
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.0f,
                    dx2 = -4.0f,
                    dy2 = 1.0f,
                )
                // s -6 -1.781 -6 -1.781z
                reflectiveCurveToRelative(
                    dx1 = -6.0f,
                    dy1 = -1.781f,
                    dx2 = -6.0f,
                    dy2 = -1.781f,
                )
                close()
            }
            // M7.248 19.101 C10.798 16.41 14 16.043 15 16.043 V20 c0 3.162 -7.752 -0.899 -7.752 -0.899z
            path(
                fill = SolidColor(Color(0xFF3B88C3)),
            ) {
                // M 7.248 19.101
                moveTo(x = 7.248f, y = 19.101f)
                // C 10.798 16.41 14 16.043 15 16.043
                curveTo(
                    x1 = 10.798f,
                    y1 = 16.41f,
                    x2 = 14.0f,
                    y2 = 16.043f,
                    x3 = 15.0f,
                    y3 = 16.043f,
                )
                // V 20
                verticalLineTo(y = 20.0f)
                // c 0 3.162 -7.752 -0.899 -7.752 -0.899z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.162f,
                    dx2 = -7.752f,
                    dy2 = -0.899f,
                    dx3 = -7.752f,
                    dy3 = -0.899f,
                )
                close()
            }
            // M33 24.964 s0.5 -4.013 -1 -5.731 L1 18.086 s2 3.439 6 5.732 c4 2.291 26 1.146 26 1.146z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 33 24.964
                moveTo(x = 33.0f, y = 24.964f)
                // s 0.5 -4.013 -1 -5.731
                reflectiveCurveToRelative(
                    dx1 = 0.5f,
                    dy1 = -4.013f,
                    dx2 = -1.0f,
                    dy2 = -5.731f,
                )
                // L 1 18.086
                lineTo(x = 1.0f, y = 18.086f)
                // s 2 3.439 6 5.732
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 3.439f,
                    dx2 = 6.0f,
                    dy2 = 5.732f,
                )
                // c 4 2.291 26 1.146 26 1.146z
                curveToRelative(
                    dx1 = 4.0f,
                    dy1 = 2.291f,
                    dx2 = 26.0f,
                    dy2 = 1.146f,
                    dx3 = 26.0f,
                    dy3 = 1.146f,
                )
                close()
            }
            // M7 23.817 c4 2.292 26 1.146 26 1.146 s0.288 -2.335 -0.24 -4.206 L2.078 19.589 c0.977 1.205 2.614 2.905 4.922 4.228z
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 7 23.817
                moveTo(x = 7.0f, y = 23.817f)
                // c 4 2.292 26 1.146 26 1.146
                curveToRelative(
                    dx1 = 4.0f,
                    dy1 = 2.292f,
                    dx2 = 26.0f,
                    dy2 = 1.146f,
                    dx3 = 26.0f,
                    dy3 = 1.146f,
                )
                // s 0.288 -2.335 -0.24 -4.206
                reflectiveCurveToRelative(
                    dx1 = 0.288f,
                    dy1 = -2.335f,
                    dx2 = -0.24f,
                    dy2 = -4.206f,
                )
                // L 2.078 19.589
                lineTo(x = 2.078f, y = 19.589f)
                // c 0.977 1.205 2.614 2.905 4.922 4.228z
                curveToRelative(
                    dx1 = 0.977f,
                    dy1 = 1.205f,
                    dx2 = 2.614f,
                    dy2 = 2.905f,
                    dx3 = 4.922f,
                    dy3 = 4.228f,
                )
                close()
            }
            // M0 24 h36 v12 H0z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 0 24
                moveTo(x = 0.0f, y = 24.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // H 0z
                horizontalLineTo(x = 0.0f)
                close()
            }
        }.build().also { _emoji1f6e5 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f6e5: ImageVector? = null
