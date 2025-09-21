package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji26f5: ImageVector
    get() {
        val current = _emoji26f5
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji26f5",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M20 26 c0 0.553 -0.447 1 -1 1 -0.552 0 -1 -0.447 -1 -1 V1 c0 -0.552 0.448 -1 1 -1 0.553 0 1 0.448 1 1 v25z
            path(
                fill = SolidColor(Color(0xFFA7A9AC)),
            ) {
                // M 20 26
                moveTo(x = 20.0f, y = 26.0f)
                // c 0 0.553 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // c -0.552 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // V 1
                verticalLineTo(y = 1.0f)
                // c 0 -0.552 0.448 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = 0.448f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // c 0.553 0 1 0.448 1 1
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.448f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // v 25z
                verticalLineToRelative(dy = 25.0f)
                close()
            }
            // M3 24 h31 v8 H12 c-6 0 -9 -8 -9 -8z
            path(
                fill = SolidColor(Color(0xFFD1D3D4)),
            ) {
                // M 3 24
                moveTo(x = 3.0f, y = 24.0f)
                // h 31
                horizontalLineToRelative(dx = 31.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // H 12
                horizontalLineTo(x = 12.0f)
                // c -6 0 -9 -8 -9 -8z
                curveToRelative(
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                    dx2 = -9.0f,
                    dy2 = -8.0f,
                    dx3 = -9.0f,
                    dy3 = -8.0f,
                )
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
            // M5 22 s2 -5 5 -9 8 -8 8 -8 -1 11 -1 16 v1 s-3 -1 -6 -1 -6 1 -6 1z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 5 22
                moveTo(x = 5.0f, y = 22.0f)
                // s 2 -5 5 -9
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = -5.0f,
                    dx2 = 5.0f,
                    dy2 = -9.0f,
                )
                // s 8 -8 8 -8
                reflectiveCurveToRelative(
                    dx1 = 8.0f,
                    dy1 = -8.0f,
                    dx2 = 8.0f,
                    dy2 = -8.0f,
                )
                // s -1 11 -1 16
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 11.0f,
                    dx2 = -1.0f,
                    dy2 = 16.0f,
                )
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // s -3 -1 -6 -1
                reflectiveCurveToRelative(
                    dx1 = -3.0f,
                    dy1 = -1.0f,
                    dx2 = -6.0f,
                    dy2 = -1.0f,
                )
                // s -6 1 -6 1z
                reflectiveCurveToRelative(
                    dx1 = -6.0f,
                    dy1 = 1.0f,
                    dx2 = -6.0f,
                    dy2 = 1.0f,
                )
                close()
            }
            // M20 2 s6 6 9 11 c2.771 4.618 4 9 4 9 s-3 -1 -6 -1 -6 1 -6 1 v-1 c0 -9 -1 -19 -1 -19z
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 20 2
                moveTo(x = 20.0f, y = 2.0f)
                // s 6 6 9 11
                reflectiveCurveToRelative(
                    dx1 = 6.0f,
                    dy1 = 6.0f,
                    dx2 = 9.0f,
                    dy2 = 11.0f,
                )
                // c 2.771 4.618 4 9 4 9
                curveToRelative(
                    dx1 = 2.771f,
                    dy1 = 4.618f,
                    dx2 = 4.0f,
                    dy2 = 9.0f,
                    dx3 = 4.0f,
                    dy3 = 9.0f,
                )
                // s -3 -1 -6 -1
                reflectiveCurveToRelative(
                    dx1 = -3.0f,
                    dy1 = -1.0f,
                    dx2 = -6.0f,
                    dy2 = -1.0f,
                )
                // s -6 1 -6 1
                reflectiveCurveToRelative(
                    dx1 = -6.0f,
                    dy1 = 1.0f,
                    dx2 = -6.0f,
                    dy2 = 1.0f,
                )
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // c 0 -9 -1 -19 -1 -19z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -9.0f,
                    dx2 = -1.0f,
                    dy2 = -19.0f,
                    dx3 = -1.0f,
                    dy3 = -19.0f,
                )
                close()
            }
            // M2 24 c-0.552 0 -1 0.447 -1 1 s0.448 1 1 1 h33 v-2 H2z
            path(
                fill = SolidColor(Color(0xFFE6E7E8)),
            ) {
                // M 2 24
                moveTo(x = 2.0f, y = 24.0f)
                // c -0.552 0 -1 0.447 -1 1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = 0.447f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // s 0.448 1 1 1
                reflectiveCurveToRelative(
                    dx1 = 0.448f,
                    dy1 = 1.0f,
                    dx2 = 1.0f,
                    dy2 = 1.0f,
                )
                // h 33
                horizontalLineToRelative(dx = 33.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 2z
                horizontalLineTo(x = 2.0f)
                close()
            }
        }.build().also { _emoji26f5 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji26f5: ImageVector? = null
