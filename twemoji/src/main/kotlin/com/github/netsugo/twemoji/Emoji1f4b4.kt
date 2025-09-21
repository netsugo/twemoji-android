package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f4b4: ImageVector
    get() {
        val current = _emoji1f4b4
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f4b4",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M2 11 c-2 0 -2 2 -2 2 v21 s0 2 2 2 h32 c2 0 2 -2 2 -2 V13 s0 -2 -2 -2 H2z
            path(
                fill = SolidColor(Color(0xFFE5A157)),
            ) {
                // M 2 11
                moveTo(x = 2.0f, y = 11.0f)
                // c -2 0 -2 2 -2 2
                curveToRelative(
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = 2.0f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // v 21
                verticalLineToRelative(dy = 21.0f)
                // s 0 2 2 2
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                )
                // h 32
                horizontalLineToRelative(dx = 32.0f)
                // c 2 0 2 -2 2 -2
                curveToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // V 13
                verticalLineTo(y = 13.0f)
                // s 0 -2 -2 -2
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                    dx2 = -2.0f,
                    dy2 = -2.0f,
                )
                // H 2z
                horizontalLineTo(x = 2.0f)
                close()
            }
            // M2 6 C0 6 0 8 0 8 v20 s0 2 2 2 h32 c2 0 2 -2 2 -2 V8 s0 -2 -2 -2 H2z
            path(
                fill = SolidColor(Color(0xFFFFD983)),
            ) {
                // M 2 6
                moveTo(x = 2.0f, y = 6.0f)
                // C 0 6 0 8 0 8
                curveTo(
                    x1 = 0.0f,
                    y1 = 6.0f,
                    x2 = 0.0f,
                    y2 = 8.0f,
                    x3 = 0.0f,
                    y3 = 8.0f,
                )
                // v 20
                verticalLineToRelative(dy = 20.0f)
                // s 0 2 2 2
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                )
                // h 32
                horizontalLineToRelative(dx = 32.0f)
                // c 2 0 2 -2 2 -2
                curveToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // V 8
                verticalLineTo(y = 8.0f)
                // s 0 -2 -2 -2
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                    dx2 = -2.0f,
                    dy2 = -2.0f,
                )
                // H 2z
                horizontalLineTo(x = 2.0f)
                close()
            }
            // M25 18 m-6.5 0 a6.5 6.5 0 1 1 13 0 a6.5 6.5 0 1 1 -13 0
            path(
                fill = SolidColor(Color(0xFFEDB980)),
            ) {
                // M 25 18
                moveTo(x = 25.0f, y = 18.0f)
                // m -6.5 0
                moveToRelative(dx = -6.5f, dy = 0.0f)
                // a 6.5 6.5 0 1 1 13 0
                arcToRelative(
                    a = 6.5f,
                    b = 6.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 13.0f,
                    dy1 = 0.0f,
                )
                // a 6.5 6.5 0 1 1 -13 0
                arcToRelative(
                    a = 6.5f,
                    b = 6.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -13.0f,
                    dy1 = 0.0f,
                )
            }
            // M33 28.5 H3 c-0.827 0 -1.5 -0.673 -1.5 -1.5 V9 c0 -0.827 0.673 -1.5 1.5 -1.5 h30 c0.827 0 1.5 0.673 1.5 1.5 v18 c0 0.827 -0.673 1.5 -1.5 1.5z M3 8.5 c-0.275 0 -0.5 0.224 -0.5 0.5 v18 c0 0.275 0.225 0.5 0.5 0.5 h30 c0.275 0 0.5 -0.225 0.5 -0.5 V9 c0 -0.276 -0.225 -0.5 -0.5 -0.5 H3z
            path(
                fill = SolidColor(Color(0xFFE5A157)),
            ) {
                // M 33 28.5
                moveTo(x = 33.0f, y = 28.5f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // c -0.827 0 -1.5 -0.673 -1.5 -1.5
                curveToRelative(
                    dx1 = -0.827f,
                    dy1 = 0.0f,
                    dx2 = -1.5f,
                    dy2 = -0.673f,
                    dx3 = -1.5f,
                    dy3 = -1.5f,
                )
                // V 9
                verticalLineTo(y = 9.0f)
                // c 0 -0.827 0.673 -1.5 1.5 -1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.827f,
                    dx2 = 0.673f,
                    dy2 = -1.5f,
                    dx3 = 1.5f,
                    dy3 = -1.5f,
                )
                // h 30
                horizontalLineToRelative(dx = 30.0f)
                // c 0.827 0 1.5 0.673 1.5 1.5
                curveToRelative(
                    dx1 = 0.827f,
                    dy1 = 0.0f,
                    dx2 = 1.5f,
                    dy2 = 0.673f,
                    dx3 = 1.5f,
                    dy3 = 1.5f,
                )
                // v 18
                verticalLineToRelative(dy = 18.0f)
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
                // M 3 8.5
                moveTo(x = 3.0f, y = 8.5f)
                // c -0.275 0 -0.5 0.224 -0.5 0.5
                curveToRelative(
                    dx1 = -0.275f,
                    dy1 = 0.0f,
                    dx2 = -0.5f,
                    dy2 = 0.224f,
                    dx3 = -0.5f,
                    dy3 = 0.5f,
                )
                // v 18
                verticalLineToRelative(dy = 18.0f)
                // c 0 0.275 0.225 0.5 0.5 0.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.275f,
                    dx2 = 0.225f,
                    dy2 = 0.5f,
                    dx3 = 0.5f,
                    dy3 = 0.5f,
                )
                // h 30
                horizontalLineToRelative(dx = 30.0f)
                // c 0.275 0 0.5 -0.225 0.5 -0.5
                curveToRelative(
                    dx1 = 0.275f,
                    dy1 = 0.0f,
                    dx2 = 0.5f,
                    dy2 = -0.225f,
                    dx3 = 0.5f,
                    dy3 = -0.5f,
                )
                // V 9
                verticalLineTo(y = 9.0f)
                // c 0 -0.276 -0.225 -0.5 -0.5 -0.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.276f,
                    dx2 = -0.225f,
                    dy2 = -0.5f,
                    dx3 = -0.5f,
                    dy3 = -0.5f,
                )
                // H 3z
                horizontalLineTo(x = 3.0f)
                close()
            }
            // M14 6 h8 v24.062 h-8z
            path(
                fill = SolidColor(Color(0xFFFFE8B6)),
            ) {
                // M 14 6
                moveTo(x = 14.0f, y = 6.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v 24.062
                verticalLineToRelative(dy = 24.062f)
                // h -8z
                horizontalLineToRelative(dx = -8.0f)
                close()
            }
            // M14 30 h8 v6 h-8z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 14 30
                moveTo(x = 14.0f, y = 30.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h -8z
                horizontalLineToRelative(dx = -8.0f)
                close()
            }
            // M7.238 18.415 H4.864 c-0.398 0 -0.709 -0.19 -0.709 -0.57 0 -0.383 0.312 -0.573 0.709 -0.573 h1.664 l-2.772 -4.28 c-0.173 -0.259 -0.26 -0.449 -0.26 -0.691 0 -0.33 0.33 -0.573 0.607 -0.573 0.278 0 0.554 0.122 0.797 0.485 L8 16.874 l3.102 -4.662 c0.243 -0.364 0.52 -0.485 0.797 -0.485 0.276 0 0.605 0.243 0.605 0.573 0 0.243 -0.086 0.432 -0.259 0.691 l-2.772 4.28 h1.664 c0.399 0 0.711 0.191 0.711 0.573 0 0.381 -0.312 0.57 -0.711 0.57 H8.764 v1.229 h2.373 c0.399 0 0.711 0.192 0.711 0.573 0 0.381 -0.312 0.571 -0.711 0.571 H8.764 v2.668 c0 0.502 -0.312 0.815 -0.763 0.815 s-0.762 -0.313 -0.762 -0.815 v-2.668 H4.864 c-0.398 0 -0.709 -0.19 -0.709 -0.571 0 -0.381 0.312 -0.573 0.709 -0.573 h2.375 v-1.228z
            path(
                fill = SolidColor(Color(0xFFE5A157)),
            ) {
                // M 7.238 18.415
                moveTo(x = 7.238f, y = 18.415f)
                // H 4.864
                horizontalLineTo(x = 4.864f)
                // c -0.398 0 -0.709 -0.19 -0.709 -0.57
                curveToRelative(
                    dx1 = -0.398f,
                    dy1 = 0.0f,
                    dx2 = -0.709f,
                    dy2 = -0.19f,
                    dx3 = -0.709f,
                    dy3 = -0.57f,
                )
                // c 0 -0.383 0.312 -0.573 0.709 -0.573
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.383f,
                    dx2 = 0.312f,
                    dy2 = -0.573f,
                    dx3 = 0.709f,
                    dy3 = -0.573f,
                )
                // h 1.664
                horizontalLineToRelative(dx = 1.664f)
                // l -2.772 -4.28
                lineToRelative(dx = -2.772f, dy = -4.28f)
                // c -0.173 -0.259 -0.26 -0.449 -0.26 -0.691
                curveToRelative(
                    dx1 = -0.173f,
                    dy1 = -0.259f,
                    dx2 = -0.26f,
                    dy2 = -0.449f,
                    dx3 = -0.26f,
                    dy3 = -0.691f,
                )
                // c 0 -0.33 0.33 -0.573 0.607 -0.573
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.33f,
                    dx2 = 0.33f,
                    dy2 = -0.573f,
                    dx3 = 0.607f,
                    dy3 = -0.573f,
                )
                // c 0.278 0 0.554 0.122 0.797 0.485
                curveToRelative(
                    dx1 = 0.278f,
                    dy1 = 0.0f,
                    dx2 = 0.554f,
                    dy2 = 0.122f,
                    dx3 = 0.797f,
                    dy3 = 0.485f,
                )
                // L 8 16.874
                lineTo(x = 8.0f, y = 16.874f)
                // l 3.102 -4.662
                lineToRelative(dx = 3.102f, dy = -4.662f)
                // c 0.243 -0.364 0.52 -0.485 0.797 -0.485
                curveToRelative(
                    dx1 = 0.243f,
                    dy1 = -0.364f,
                    dx2 = 0.52f,
                    dy2 = -0.485f,
                    dx3 = 0.797f,
                    dy3 = -0.485f,
                )
                // c 0.276 0 0.605 0.243 0.605 0.573
                curveToRelative(
                    dx1 = 0.276f,
                    dy1 = 0.0f,
                    dx2 = 0.605f,
                    dy2 = 0.243f,
                    dx3 = 0.605f,
                    dy3 = 0.573f,
                )
                // c 0 0.243 -0.086 0.432 -0.259 0.691
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.243f,
                    dx2 = -0.086f,
                    dy2 = 0.432f,
                    dx3 = -0.259f,
                    dy3 = 0.691f,
                )
                // l -2.772 4.28
                lineToRelative(dx = -2.772f, dy = 4.28f)
                // h 1.664
                horizontalLineToRelative(dx = 1.664f)
                // c 0.399 0 0.711 0.191 0.711 0.573
                curveToRelative(
                    dx1 = 0.399f,
                    dy1 = 0.0f,
                    dx2 = 0.711f,
                    dy2 = 0.191f,
                    dx3 = 0.711f,
                    dy3 = 0.573f,
                )
                // c 0 0.381 -0.312 0.57 -0.711 0.57
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.381f,
                    dx2 = -0.312f,
                    dy2 = 0.57f,
                    dx3 = -0.711f,
                    dy3 = 0.57f,
                )
                // H 8.764
                horizontalLineTo(x = 8.764f)
                // v 1.229
                verticalLineToRelative(dy = 1.229f)
                // h 2.373
                horizontalLineToRelative(dx = 2.373f)
                // c 0.399 0 0.711 0.192 0.711 0.573
                curveToRelative(
                    dx1 = 0.399f,
                    dy1 = 0.0f,
                    dx2 = 0.711f,
                    dy2 = 0.192f,
                    dx3 = 0.711f,
                    dy3 = 0.573f,
                )
                // c 0 0.381 -0.312 0.571 -0.711 0.571
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.381f,
                    dx2 = -0.312f,
                    dy2 = 0.571f,
                    dx3 = -0.711f,
                    dy3 = 0.571f,
                )
                // H 8.764
                horizontalLineTo(x = 8.764f)
                // v 2.668
                verticalLineToRelative(dy = 2.668f)
                // c 0 0.502 -0.312 0.815 -0.763 0.815
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.502f,
                    dx2 = -0.312f,
                    dy2 = 0.815f,
                    dx3 = -0.763f,
                    dy3 = 0.815f,
                )
                // s -0.762 -0.313 -0.762 -0.815
                reflectiveCurveToRelative(
                    dx1 = -0.762f,
                    dy1 = -0.313f,
                    dx2 = -0.762f,
                    dy2 = -0.815f,
                )
                // v -2.668
                verticalLineToRelative(dy = -2.668f)
                // H 4.864
                horizontalLineTo(x = 4.864f)
                // c -0.398 0 -0.709 -0.19 -0.709 -0.571
                curveToRelative(
                    dx1 = -0.398f,
                    dy1 = 0.0f,
                    dx2 = -0.709f,
                    dy2 = -0.19f,
                    dx3 = -0.709f,
                    dy3 = -0.571f,
                )
                // c 0 -0.381 0.312 -0.573 0.709 -0.573
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.381f,
                    dx2 = 0.312f,
                    dy2 = -0.573f,
                    dx3 = 0.709f,
                    dy3 = -0.573f,
                )
                // h 2.375
                horizontalLineToRelative(dx = 2.375f)
                // v -1.228z
                verticalLineToRelative(dy = -1.228f)
                close()
            }
        }.build().also { _emoji1f4b4 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f4b4: ImageVector? = null
