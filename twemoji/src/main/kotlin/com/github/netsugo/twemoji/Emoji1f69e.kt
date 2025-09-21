package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f69e: ImageVector
    get() {
        val current = _emoji1f69e
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f69e",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M0 35 h36 V10 S29.999 0 26.999 0 17 9 15 11 s-4.5 0.5 -6 -1 -3 -3 -4 -3 -5 7 -5 7 v21z
            path(
                fill = SolidColor(Color(0xFFD1D3D4)),
            ) {
                // M 0 35
                moveTo(x = 0.0f, y = 35.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // V 10
                verticalLineTo(y = 10.0f)
                // S 29.999 0 26.999 0
                reflectiveCurveTo(
                    x1 = 29.999f,
                    y1 = 0.0f,
                    x2 = 26.999f,
                    y2 = 0.0f,
                )
                // S 17 9 15 11
                reflectiveCurveTo(
                    x1 = 17.0f,
                    y1 = 9.0f,
                    x2 = 15.0f,
                    y2 = 11.0f,
                )
                // s -4.5 0.5 -6 -1
                reflectiveCurveToRelative(
                    dx1 = -4.5f,
                    dy1 = 0.5f,
                    dx2 = -6.0f,
                    dy2 = -1.0f,
                )
                // s -3 -3 -4 -3
                reflectiveCurveToRelative(
                    dx1 = -3.0f,
                    dy1 = -3.0f,
                    dx2 = -4.0f,
                    dy2 = -3.0f,
                )
                // s -5 7 -5 7
                reflectiveCurveToRelative(
                    dx1 = -5.0f,
                    dy1 = 7.0f,
                    dx2 = -5.0f,
                    dy2 = 7.0f,
                )
                // v 21z
                verticalLineToRelative(dy = 21.0f)
                close()
            }
            // M0 34 h36 v2 H0z
            path(
                fill = SolidColor(Color(0xFF939598)),
            ) {
                // M 0 34
                moveTo(x = 0.0f, y = 34.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 0z
                horizontalLineTo(x = 0.0f)
                close()
            }
            // M11 32 m-3 0 a3 3 0 1 1 6 0 a3 3 0 1 1 -6 0
            path(
                fill = SolidColor(Color(0xFF58595B)),
            ) {
                // M 11 32
                moveTo(x = 11.0f, y = 32.0f)
                // m -3 0
                moveToRelative(dx = -3.0f, dy = 0.0f)
                // a 3 3 0 1 1 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // a 3 3 0 1 1 -6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
            }
            // M11 32 m-2 0 a2 2 0 1 1 4 0 a2 2 0 1 1 -4 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 11 32
                moveTo(x = 11.0f, y = 32.0f)
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
            // M22 32 c0 -1.657 -1.344 -3 -3 -3 -1.657 0 -3 1.343 -3 3 s1.343 3 3 3 c1.656 0 3 -1.343 3 -3z
            path(
                fill = SolidColor(Color(0xFF58595B)),
            ) {
                // M 22 32
                moveTo(x = 22.0f, y = 32.0f)
                // c 0 -1.657 -1.344 -3 -3 -3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.657f,
                    dx2 = -1.344f,
                    dy2 = -3.0f,
                    dx3 = -3.0f,
                    dy3 = -3.0f,
                )
                // c -1.657 0 -3 1.343 -3 3
                curveToRelative(
                    dx1 = -1.657f,
                    dy1 = 0.0f,
                    dx2 = -3.0f,
                    dy2 = 1.343f,
                    dx3 = -3.0f,
                    dy3 = 3.0f,
                )
                // s 1.343 3 3 3
                reflectiveCurveToRelative(
                    dx1 = 1.343f,
                    dy1 = 3.0f,
                    dx2 = 3.0f,
                    dy2 = 3.0f,
                )
                // c 1.656 0 3 -1.343 3 -3z
                curveToRelative(
                    dx1 = 1.656f,
                    dy1 = 0.0f,
                    dx2 = 3.0f,
                    dy2 = -1.343f,
                    dx3 = 3.0f,
                    dy3 = -3.0f,
                )
                close()
            }
            // M21 32 c0 -1.105 -0.896 -2 -2 -2 s-2 0.895 -2 2 0.896 2 2 2 2 -0.895 2 -2z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 21 32
                moveTo(x = 21.0f, y = 32.0f)
                // c 0 -1.105 -0.896 -2 -2 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.105f,
                    dx2 = -0.896f,
                    dy2 = -2.0f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // s -2 0.895 -2 2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 0.895f,
                    dx2 = -2.0f,
                    dy2 = 2.0f,
                )
                // s 0.896 2 2 2
                reflectiveCurveToRelative(
                    dx1 = 0.896f,
                    dy1 = 2.0f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                )
                // s 2 -0.895 2 -2z
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = -0.895f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                close()
            }
            // M36 14 H7 c-2.209 0 -4 1.791 -4 4 v10 c0 2.209 1.791 4 4 4 h29 V14z
            path(
                fill = SolidColor(Color(0xFFFFE8B6)),
            ) {
                // M 36 14
                moveTo(x = 36.0f, y = 14.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
                // c -2.209 0 -4 1.791 -4 4
                curveToRelative(
                    dx1 = -2.209f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = 1.791f,
                    dx3 = -4.0f,
                    dy3 = 4.0f,
                )
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // c 0 2.209 1.791 4 4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = 1.791f,
                    dy2 = 4.0f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // h 29
                horizontalLineToRelative(dx = 29.0f)
                // V 14z
                verticalLineTo(y = 14.0f)
                close()
            }
            // M36 14 H7 c-1.477 0 -2.752 0.81 -3.445 2 H36 v-2z
            path(
                fill = SolidColor(Color(0xFF77B255)),
            ) {
                // M 36 14
                moveTo(x = 36.0f, y = 14.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
                // c -1.477 0 -2.752 0.81 -3.445 2
                curveToRelative(
                    dx1 = -1.477f,
                    dy1 = 0.0f,
                    dx2 = -2.752f,
                    dy2 = 0.81f,
                    dx3 = -3.445f,
                    dy3 = 2.0f,
                )
                // H 36
                horizontalLineTo(x = 36.0f)
                // v -2z
                verticalLineToRelative(dy = -2.0f)
                close()
            }
            // M36 28 H3 c0 2.209 1.791 4 4 4 h29 v-4z
            path(
                fill = SolidColor(Color(0xFF5C913B)),
            ) {
                // M 36 28
                moveTo(x = 36.0f, y = 28.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // c 0 2.209 1.791 4 4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = 1.791f,
                    dy2 = 4.0f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // h 29
                horizontalLineToRelative(dx = 29.0f)
                // v -4z
                verticalLineToRelative(dy = -4.0f)
                close()
            }
            // M3 26 h33 v2 H3z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 3 26
                moveTo(x = 3.0f, y = 26.0f)
                // h 33
                horizontalLineToRelative(dx = 33.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 3z
                horizontalLineTo(x = 3.0f)
                close()
            }
            // M3 19 h6 v5 L3 24z M15 22 c0 0.553 -0.447 1 -1 1 h-2 c-0.552 0 -1 -0.447 -1 -1 v-2 c0 -0.553 0.448 -1 1 -1 h2 c0.553 0 1 0.447 1 1 v2z M20 22 c0 0.553 -0.447 1 -1 1 h-2 c-0.552 0 -1 -0.447 -1 -1 v-2 c0 -0.553 0.448 -1 1 -1 h2 c0.553 0 1 0.447 1 1 v2z M27 22 c0 0.553 -0.447 1 -1 1 h-2 c-0.553 0 -1 -0.447 -1 -1 v-2 c0 -0.553 0.447 -1 1 -1 h2 c0.553 0 1 0.447 1 1 v2z M34 22 c0 0.553 -0.447 1 -1 1 h-2 c-0.553 0 -1 -0.447 -1 -1 v-2 c0 -0.553 0.447 -1 1 -1 h2 c0.553 0 1 0.447 1 1 v2z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 3 19
                moveTo(x = 3.0f, y = 19.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // L 3 24z
                lineTo(x = 3.0f, y = 24.0f)
                close()
                // M 15 22
                moveTo(x = 15.0f, y = 22.0f)
                // c 0 0.553 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // c -0.552 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // c 0 -0.553 0.448 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.553f,
                    dx2 = 0.448f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // c 0.553 0 1 0.447 1 1
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.447f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // v 2z
                verticalLineToRelative(dy = 2.0f)
                close()
                // M 20 22
                moveTo(x = 20.0f, y = 22.0f)
                // c 0 0.553 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // c -0.552 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // c 0 -0.553 0.448 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.553f,
                    dx2 = 0.448f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // c 0.553 0 1 0.447 1 1
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.447f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // v 2z
                verticalLineToRelative(dy = 2.0f)
                close()
                // M 27 22
                moveTo(x = 27.0f, y = 22.0f)
                // c 0 0.553 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // h -2
                horizontalLineToRelative(dx = -2.0f)
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
                // c 0 -0.553 0.447 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.553f,
                    dx2 = 0.447f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // c 0.553 0 1 0.447 1 1
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.447f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // v 2z
                verticalLineToRelative(dy = 2.0f)
                close()
                // M 34 22
                moveTo(x = 34.0f, y = 22.0f)
                // c 0 0.553 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // h -2
                horizontalLineToRelative(dx = -2.0f)
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
                // c 0 -0.553 0.447 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.553f,
                    dx2 = 0.447f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // c 0.553 0 1 0.447 1 1
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.447f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // v 2z
                verticalLineToRelative(dy = 2.0f)
                close()
            }
            // M27.5 30 h-5 c-0.827 0 -1.5 -0.673 -1.5 -1.5 v-10 c0 -0.827 0.673 -1.5 1.5 -1.5 h5 c0.827 0 1.5 0.673 1.5 1.5 v10 c0 0.827 -0.673 1.5 -1.5 1.5z M22.5 18 c-0.275 0 -0.5 0.224 -0.5 0.5 v10 c0 0.275 0.225 0.5 0.5 0.5 h5 c0.275 0 0.5 -0.225 0.5 -0.5 v-10 c0 -0.276 -0.225 -0.5 -0.5 -0.5 h-5z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 27.5 30
                moveTo(x = 27.5f, y = 30.0f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // c -0.827 0 -1.5 -0.673 -1.5 -1.5
                curveToRelative(
                    dx1 = -0.827f,
                    dy1 = 0.0f,
                    dx2 = -1.5f,
                    dy2 = -0.673f,
                    dx3 = -1.5f,
                    dy3 = -1.5f,
                )
                // v -10
                verticalLineToRelative(dy = -10.0f)
                // c 0 -0.827 0.673 -1.5 1.5 -1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.827f,
                    dx2 = 0.673f,
                    dy2 = -1.5f,
                    dx3 = 1.5f,
                    dy3 = -1.5f,
                )
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // c 0.827 0 1.5 0.673 1.5 1.5
                curveToRelative(
                    dx1 = 0.827f,
                    dy1 = 0.0f,
                    dx2 = 1.5f,
                    dy2 = 0.673f,
                    dx3 = 1.5f,
                    dy3 = 1.5f,
                )
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // c 0 0.827 -0.673 1.5 -1.5 1.5z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.827f,
                    dx2 = -0.673f,
                    dy2 = 1.5f,
                    dx3 = -1.5f,
                    dy3 = 1.5f,
                )
                close()
                // M 22.5 18
                moveTo(x = 22.5f, y = 18.0f)
                // c -0.275 0 -0.5 0.224 -0.5 0.5
                curveToRelative(
                    dx1 = -0.275f,
                    dy1 = 0.0f,
                    dx2 = -0.5f,
                    dy2 = 0.224f,
                    dx3 = -0.5f,
                    dy3 = 0.5f,
                )
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // c 0 0.275 0.225 0.5 0.5 0.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.275f,
                    dx2 = 0.225f,
                    dy2 = 0.5f,
                    dx3 = 0.5f,
                    dy3 = 0.5f,
                )
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // c 0.275 0 0.5 -0.225 0.5 -0.5
                curveToRelative(
                    dx1 = 0.275f,
                    dy1 = 0.0f,
                    dx2 = 0.5f,
                    dy2 = -0.225f,
                    dx3 = 0.5f,
                    dy3 = -0.5f,
                )
                // v -10
                verticalLineToRelative(dy = -10.0f)
                // c 0 -0.276 -0.225 -0.5 -0.5 -0.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.276f,
                    dx2 = -0.225f,
                    dy2 = -0.5f,
                    dx3 = -0.5f,
                    dy3 = -0.5f,
                )
                // h -5z
                horizontalLineToRelative(dx = -5.0f)
                close()
            }
        }.build().also { _emoji1f69e = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f69e: ImageVector? = null
