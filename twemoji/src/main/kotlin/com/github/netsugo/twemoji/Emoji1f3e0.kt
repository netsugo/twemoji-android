package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f3e0: ImageVector
    get() {
        val current = _emoji1f3e0
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f3e0",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M9.344 14.702 h-2 c-0.276 0 -0.5 -0.224 -0.5 -0.5 v-7 c0 -0.276 0.224 -0.5 0.5 -0.5 h2 c0.276 0 0.5 0.224 0.5 0.5 v7 c0 0.276 -0.224 0.5 -0.5 0.5z
            path(
                fill = SolidColor(Color(0xFFA0041E)),
            ) {
                // M 9.344 14.702
                moveTo(x = 9.344f, y = 14.702f)
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
            // M5 16 L18 3 l13 13 v17 H5z
            path(
                fill = SolidColor(Color(0xFFFFE8B6)),
            ) {
                // M 5 16
                moveTo(x = 5.0f, y = 16.0f)
                // L 18 3
                lineTo(x = 18.0f, y = 3.0f)
                // l 13 13
                lineToRelative(dx = 13.0f, dy = 13.0f)
                // v 17
                verticalLineToRelative(dy = 17.0f)
                // H 5z
                horizontalLineTo(x = 5.0f)
                close()
            }
            // M18 16 h1 v16 h-1z
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 18 16
                moveTo(x = 18.0f, y = 16.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // v 16
                verticalLineToRelative(dy = 16.0f)
                // h -1z
                horizontalLineToRelative(dx = -1.0f)
                close()
            }
            // M31 17 c-0.256 0 -0.512 -0.098 -0.707 -0.293 L18 4.414 5.707 16.707 c-0.391 0.391 -1.023 0.391 -1.414 0 s-0.391 -1.023 0 -1.414 l13 -13 c0.391 -0.391 1.023 -0.391 1.414 0 l13 13 c0.391 0.391 0.391 1.023 0 1.414 -0.195 0.195 -0.451 0.293 -0.707 0.293z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 31 17
                moveTo(x = 31.0f, y = 17.0f)
                // c -0.256 0 -0.512 -0.098 -0.707 -0.293
                curveToRelative(
                    dx1 = -0.256f,
                    dy1 = 0.0f,
                    dx2 = -0.512f,
                    dy2 = -0.098f,
                    dx3 = -0.707f,
                    dy3 = -0.293f,
                )
                // L 18 4.414
                lineTo(x = 18.0f, y = 4.414f)
                // L 5.707 16.707
                lineTo(x = 5.707f, y = 16.707f)
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
            // M18 17 c-0.256 0 -0.512 -0.098 -0.707 -0.293 -0.391 -0.391 -0.391 -1.023 0 -1.414 l6.5 -6.5 c0.391 -0.391 1.023 -0.391 1.414 0 s0.391 1.023 0 1.414 l-6.5 6.5 c-0.195 0.195 -0.451 0.293 -0.707 0.293z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 18 17
                moveTo(x = 18.0f, y = 17.0f)
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
            // M10 26 h4 v6 h-4z
            path(
                fill = SolidColor(Color(0xFFC1694F)),
            ) {
                // M 10 26
                moveTo(x = 10.0f, y = 26.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // M10 17 h4 v4 h-4z M22.5 17 h4 v4 h-4z M22.5 26 h4 v4 h-4z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 10 17
                moveTo(x = 10.0f, y = 17.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
                // M 22.5 17
                moveTo(x = 22.5f, y = 17.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
                // M 22.5 26
                moveTo(x = 22.5f, y = 26.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // M33.5 33.5 c0 0.828 -0.672 1.5 -1.5 1.5 H4 c-0.828 0 -1.5 -0.672 -1.5 -1.5 S3.172 32 4 32 h28 c0.828 0 1.5 0.672 1.5 1.5z
            path(
                fill = SolidColor(Color(0xFF5C913B)),
            ) {
                // M 33.5 33.5
                moveTo(x = 33.5f, y = 33.5f)
                // c 0 0.828 -0.672 1.5 -1.5 1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.828f,
                    dx2 = -0.672f,
                    dy2 = 1.5f,
                    dx3 = -1.5f,
                    dy3 = 1.5f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // c -0.828 0 -1.5 -0.672 -1.5 -1.5
                curveToRelative(
                    dx1 = -0.828f,
                    dy1 = 0.0f,
                    dx2 = -1.5f,
                    dy2 = -0.672f,
                    dx3 = -1.5f,
                    dy3 = -1.5f,
                )
                // S 3.172 32 4 32
                reflectiveCurveTo(
                    x1 = 3.172f,
                    y1 = 32.0f,
                    x2 = 4.0f,
                    y2 = 32.0f,
                )
                // h 28
                horizontalLineToRelative(dx = 28.0f)
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
        }.build().also { _emoji1f3e0 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f3e0: ImageVector? = null
