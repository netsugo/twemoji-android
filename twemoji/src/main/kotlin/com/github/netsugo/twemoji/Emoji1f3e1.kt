package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f3e1: ImageVector
    get() {
        val current = _emoji1f3e1
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f3e1",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 33.5 c0 0.828 -0.672 1.5 -1.5 1.5 h-33 C0.672 35 0 34.328 0 33.5 S0.672 32 1.5 32 h33 c0.828 0 1.5 0.672 1.5 1.5z
            path(
                fill = SolidColor(Color(0xFF5C913B)),
            ) {
                // M 36 33.5
                moveTo(x = 36.0f, y = 33.5f)
                // c 0 0.828 -0.672 1.5 -1.5 1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.828f,
                    dx2 = -0.672f,
                    dy2 = 1.5f,
                    dx3 = -1.5f,
                    dy3 = 1.5f,
                )
                // h -33
                horizontalLineToRelative(dx = -33.0f)
                // C 0.672 35 0 34.328 0 33.5
                curveTo(
                    x1 = 0.672f,
                    y1 = 35.0f,
                    x2 = 0.0f,
                    y2 = 34.328f,
                    x3 = 0.0f,
                    y3 = 33.5f,
                )
                // S 0.672 32 1.5 32
                reflectiveCurveTo(
                    x1 = 0.672f,
                    y1 = 32.0f,
                    x2 = 1.5f,
                    y2 = 32.0f,
                )
                // h 33
                horizontalLineToRelative(dx = 33.0f)
                // c 0.828 0 1.5 0.672 1.5 1.5z
                curveToRelative(
                    dx1 = 0.828f,
                    dy1 = 0.0f,
                    dx2 = 1.5f,
                    dy2 = 0.672f,
                    dx3 = 1.5f,
                    dy3 = 1.5f,
                )
                close()
            }
            // M12.344 14.702 h-2 c-0.276 0 -0.5 -0.224 -0.5 -0.5 v-7 c0 -0.276 0.224 -0.5 0.5 -0.5 h2 c0.276 0 0.5 0.224 0.5 0.5 v7 c0 0.276 -0.224 0.5 -0.5 0.5z
            path(
                fill = SolidColor(Color(0xFFA0041E)),
            ) {
                // M 12.344 14.702
                moveTo(x = 12.344f, y = 14.702f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // c -0.276 0 -0.5 -0.224 -0.5 -0.5
                curveToRelative(
                    dx1 = -0.276f,
                    dy1 = 0.0f,
                    dx2 = -0.5f,
                    dy2 = -0.224f,
                    dx3 = -0.5f,
                    dy3 = -0.5f,
                )
                // v -7
                verticalLineToRelative(dy = -7.0f)
                // c 0 -0.276 0.224 -0.5 0.5 -0.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.276f,
                    dx2 = 0.224f,
                    dy2 = -0.5f,
                    dx3 = 0.5f,
                    dy3 = -0.5f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // c 0.276 0 0.5 0.224 0.5 0.5
                curveToRelative(
                    dx1 = 0.276f,
                    dy1 = 0.0f,
                    dx2 = 0.5f,
                    dy2 = 0.224f,
                    dx3 = 0.5f,
                    dy3 = 0.5f,
                )
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // c 0 0.276 -0.224 0.5 -0.5 0.5z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.276f,
                    dx2 = -0.224f,
                    dy2 = 0.5f,
                    dx3 = -0.5f,
                    dy3 = 0.5f,
                )
                close()
            }
            // M5.942 32 c-0.137 -4.657 -0.506 -8 -0.942 -8 -0.435 0 -0.804 3.343 -0.941 8 h1.883z
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 5.942 32
                moveTo(x = 5.942f, y = 32.0f)
                // c -0.137 -4.657 -0.506 -8 -0.942 -8
                curveToRelative(
                    dx1 = -0.137f,
                    dy1 = -4.657f,
                    dx2 = -0.506f,
                    dy2 = -8.0f,
                    dx3 = -0.942f,
                    dy3 = -8.0f,
                )
                // c -0.435 0 -0.804 3.343 -0.941 8
                curveToRelative(
                    dx1 = -0.435f,
                    dy1 = 0.0f,
                    dx2 = -0.804f,
                    dy2 = 3.343f,
                    dx3 = -0.941f,
                    dy3 = 8.0f,
                )
                // h 1.883z
                horizontalLineToRelative(dx = 1.883f)
                close()
            }
            // M10 18.731 C10 24.306 7.762 26 5 26 c-2.761 0 -5 -1.694 -5 -7.269 C0 13.154 4 5 5 5 s5 8.154 5 13.731z
            path(
                fill = SolidColor(Color(0xFF77B255)),
            ) {
                // M 10 18.731
                moveTo(x = 10.0f, y = 18.731f)
                // C 10 24.306 7.762 26 5 26
                curveTo(
                    x1 = 10.0f,
                    y1 = 24.306f,
                    x2 = 7.762f,
                    y2 = 26.0f,
                    x3 = 5.0f,
                    y3 = 26.0f,
                )
                // c -2.761 0 -5 -1.694 -5 -7.269
                curveToRelative(
                    dx1 = -2.761f,
                    dy1 = 0.0f,
                    dx2 = -5.0f,
                    dy2 = -1.694f,
                    dx3 = -5.0f,
                    dy3 = -7.269f,
                )
                // C 0 13.154 4 5 5 5
                curveTo(
                    x1 = 0.0f,
                    y1 = 13.154f,
                    x2 = 4.0f,
                    y2 = 5.0f,
                    x3 = 5.0f,
                    y3 = 5.0f,
                )
                // s 5 8.154 5 13.731z
                reflectiveCurveToRelative(
                    dx1 = 5.0f,
                    dy1 = 8.154f,
                    dx2 = 5.0f,
                    dy2 = 13.731f,
                )
                close()
            }
            // M8 16 L21 3 l13 13 v16 H8z
            path(
                fill = SolidColor(Color(0xFFFFE8B6)),
            ) {
                // M 8 16
                moveTo(x = 8.0f, y = 16.0f)
                // L 21 3
                lineTo(x = 21.0f, y = 3.0f)
                // l 13 13
                lineToRelative(dx = 13.0f, dy = 13.0f)
                // v 16
                verticalLineToRelative(dy = 16.0f)
                // H 8z
                horizontalLineTo(x = 8.0f)
                close()
            }
            // M21 16 h1 v16 h-1z
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 21 16
                moveTo(x = 21.0f, y = 16.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // v 16
                verticalLineToRelative(dy = 16.0f)
                // h -1z
                horizontalLineToRelative(dx = -1.0f)
                close()
            }
            // M34 17 c-0.256 0 -0.512 -0.098 -0.707 -0.293 L21 4.414 8.707 16.707 c-0.391 0.391 -1.023 0.391 -1.414 0 s-0.391 -1.023 0 -1.414 l13 -13 c0.391 -0.391 1.023 -0.391 1.414 0 l13 13 c0.391 0.391 0.391 1.023 0 1.414 -0.195 0.195 -0.451 0.293 -0.707 0.293z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 34 17
                moveTo(x = 34.0f, y = 17.0f)
                // c -0.256 0 -0.512 -0.098 -0.707 -0.293
                curveToRelative(
                    dx1 = -0.256f,
                    dy1 = 0.0f,
                    dx2 = -0.512f,
                    dy2 = -0.098f,
                    dx3 = -0.707f,
                    dy3 = -0.293f,
                )
                // L 21 4.414
                lineTo(x = 21.0f, y = 4.414f)
                // L 8.707 16.707
                lineTo(x = 8.707f, y = 16.707f)
                // c -0.391 0.391 -1.023 0.391 -1.414 0
                curveToRelative(
                    dx1 = -0.391f,
                    dy1 = 0.391f,
                    dx2 = -1.023f,
                    dy2 = 0.391f,
                    dx3 = -1.414f,
                    dy3 = 0.0f,
                )
                // s -0.391 -1.023 0 -1.414
                reflectiveCurveToRelative(
                    dx1 = -0.391f,
                    dy1 = -1.023f,
                    dx2 = 0.0f,
                    dy2 = -1.414f,
                )
                // l 13 -13
                lineToRelative(dx = 13.0f, dy = -13.0f)
                // c 0.391 -0.391 1.023 -0.391 1.414 0
                curveToRelative(
                    dx1 = 0.391f,
                    dy1 = -0.391f,
                    dx2 = 1.023f,
                    dy2 = -0.391f,
                    dx3 = 1.414f,
                    dy3 = 0.0f,
                )
                // l 13 13
                lineToRelative(dx = 13.0f, dy = 13.0f)
                // c 0.391 0.391 0.391 1.023 0 1.414
                curveToRelative(
                    dx1 = 0.391f,
                    dy1 = 0.391f,
                    dx2 = 0.391f,
                    dy2 = 1.023f,
                    dx3 = 0.0f,
                    dy3 = 1.414f,
                )
                // c -0.195 0.195 -0.451 0.293 -0.707 0.293z
                curveToRelative(
                    dx1 = -0.195f,
                    dy1 = 0.195f,
                    dx2 = -0.451f,
                    dy2 = 0.293f,
                    dx3 = -0.707f,
                    dy3 = 0.293f,
                )
                close()
            }
            // M21 17 c-0.256 0 -0.512 -0.098 -0.707 -0.293 -0.391 -0.391 -0.391 -1.023 0 -1.414 l6.5 -6.5 c0.391 -0.391 1.023 -0.391 1.414 0 s0.391 1.023 0 1.414 l-6.5 6.5 c-0.195 0.195 -0.451 0.293 -0.707 0.293z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 21 17
                moveTo(x = 21.0f, y = 17.0f)
                // c -0.256 0 -0.512 -0.098 -0.707 -0.293
                curveToRelative(
                    dx1 = -0.256f,
                    dy1 = 0.0f,
                    dx2 = -0.512f,
                    dy2 = -0.098f,
                    dx3 = -0.707f,
                    dy3 = -0.293f,
                )
                // c -0.391 -0.391 -0.391 -1.023 0 -1.414
                curveToRelative(
                    dx1 = -0.391f,
                    dy1 = -0.391f,
                    dx2 = -0.391f,
                    dy2 = -1.023f,
                    dx3 = 0.0f,
                    dy3 = -1.414f,
                )
                // l 6.5 -6.5
                lineToRelative(dx = 6.5f, dy = -6.5f)
                // c 0.391 -0.391 1.023 -0.391 1.414 0
                curveToRelative(
                    dx1 = 0.391f,
                    dy1 = -0.391f,
                    dx2 = 1.023f,
                    dy2 = -0.391f,
                    dx3 = 1.414f,
                    dy3 = 0.0f,
                )
                // s 0.391 1.023 0 1.414
                reflectiveCurveToRelative(
                    dx1 = 0.391f,
                    dy1 = 1.023f,
                    dx2 = 0.0f,
                    dy2 = 1.414f,
                )
                // l -6.5 6.5
                lineToRelative(dx = -6.5f, dy = 6.5f)
                // c -0.195 0.195 -0.451 0.293 -0.707 0.293z
                curveToRelative(
                    dx1 = -0.195f,
                    dy1 = 0.195f,
                    dx2 = -0.451f,
                    dy2 = 0.293f,
                    dx3 = -0.707f,
                    dy3 = 0.293f,
                )
                close()
            }
            // M13 26 h4 v6 h-4z
            path(
                fill = SolidColor(Color(0xFFC1694F)),
            ) {
                // M 13 26
                moveTo(x = 13.0f, y = 26.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // M13 17 h4 v4 h-4z M25.5 17 h4 v4 h-4z M25.5 26 h4 v4 h-4z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 13 17
                moveTo(x = 13.0f, y = 17.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
                // M 25.5 17
                moveTo(x = 25.5f, y = 17.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
                // M 25.5 26
                moveTo(x = 25.5f, y = 26.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // M10.625 29.991 c0 1.613 -0.858 2.103 -1.917 2.103 -1.058 0 -1.917 -0.49 -1.917 -2.103 0 -1.613 1.533 -3.973 1.917 -3.973 s1.917 2.359 1.917 3.973z M35.875 29.991 c0 1.613 -0.858 2.103 -1.917 2.103 -1.058 0 -1.917 -0.49 -1.917 -2.103 0 -1.613 1.533 -3.973 1.917 -3.973 0.384 0 1.917 2.359 1.917 3.973z
            path(
                fill = SolidColor(Color(0xFF77B255)),
            ) {
                // M 10.625 29.991
                moveTo(x = 10.625f, y = 29.991f)
                // c 0 1.613 -0.858 2.103 -1.917 2.103
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.613f,
                    dx2 = -0.858f,
                    dy2 = 2.103f,
                    dx3 = -1.917f,
                    dy3 = 2.103f,
                )
                // c -1.058 0 -1.917 -0.49 -1.917 -2.103
                curveToRelative(
                    dx1 = -1.058f,
                    dy1 = 0.0f,
                    dx2 = -1.917f,
                    dy2 = -0.49f,
                    dx3 = -1.917f,
                    dy3 = -2.103f,
                )
                // c 0 -1.613 1.533 -3.973 1.917 -3.973
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.613f,
                    dx2 = 1.533f,
                    dy2 = -3.973f,
                    dx3 = 1.917f,
                    dy3 = -3.973f,
                )
                // s 1.917 2.359 1.917 3.973z
                reflectiveCurveToRelative(
                    dx1 = 1.917f,
                    dy1 = 2.359f,
                    dx2 = 1.917f,
                    dy2 = 3.973f,
                )
                close()
                // M 35.875 29.991
                moveTo(x = 35.875f, y = 29.991f)
                // c 0 1.613 -0.858 2.103 -1.917 2.103
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.613f,
                    dx2 = -0.858f,
                    dy2 = 2.103f,
                    dx3 = -1.917f,
                    dy3 = 2.103f,
                )
                // c -1.058 0 -1.917 -0.49 -1.917 -2.103
                curveToRelative(
                    dx1 = -1.058f,
                    dy1 = 0.0f,
                    dx2 = -1.917f,
                    dy2 = -0.49f,
                    dx3 = -1.917f,
                    dy3 = -2.103f,
                )
                // c 0 -1.613 1.533 -3.973 1.917 -3.973
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.613f,
                    dx2 = 1.533f,
                    dy2 = -3.973f,
                    dx3 = 1.917f,
                    dy3 = -3.973f,
                )
                // c 0.384 0 1.917 2.359 1.917 3.973z
                curveToRelative(
                    dx1 = 0.384f,
                    dy1 = 0.0f,
                    dx2 = 1.917f,
                    dy2 = 2.359f,
                    dx3 = 1.917f,
                    dy3 = 3.973f,
                )
                close()
            }
        }.build().also { _emoji1f3e1 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f3e1: ImageVector? = null
