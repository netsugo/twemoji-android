package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f9f5: ImageVector
    get() {
        val current = _emoji1f9f5
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f9f5",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M35 36 c-0.419 0 -0.809 -0.265 -0.948 -0.684 C33.388 33.326 31.595 32 25 32 c-0.553 0 -1 -0.447 -1 -1 s0.447 -1 1 -1 c5.635 0 9.653 0.797 10.948 4.684 0.175 0.524 -0.108 1.091 -0.632 1.265 -0.105 0.034 -0.212 0.051 -0.316 0.051z
            path(
                fill = SolidColor(Color(0xFF553788)),
            ) {
                // M 35 36
                moveTo(x = 35.0f, y = 36.0f)
                // c -0.419 0 -0.809 -0.265 -0.948 -0.684
                curveToRelative(
                    dx1 = -0.419f,
                    dy1 = 0.0f,
                    dx2 = -0.809f,
                    dy2 = -0.265f,
                    dx3 = -0.948f,
                    dy3 = -0.684f,
                )
                // C 33.388 33.326 31.595 32 25 32
                curveTo(
                    x1 = 33.388f,
                    y1 = 33.326f,
                    x2 = 31.595f,
                    y2 = 32.0f,
                    x3 = 25.0f,
                    y3 = 32.0f,
                )
                // c -0.553 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.553f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // s 0.447 -1 1 -1
                reflectiveCurveToRelative(
                    dx1 = 0.447f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // c 5.635 0 9.653 0.797 10.948 4.684
                curveToRelative(
                    dx1 = 5.635f,
                    dy1 = 0.0f,
                    dx2 = 9.653f,
                    dy2 = 0.797f,
                    dx3 = 10.948f,
                    dy3 = 4.684f,
                )
                // c 0.175 0.524 -0.108 1.091 -0.632 1.265
                curveToRelative(
                    dx1 = 0.175f,
                    dy1 = 0.524f,
                    dx2 = -0.108f,
                    dy2 = 1.091f,
                    dx3 = -0.632f,
                    dy3 = 1.265f,
                )
                // c -0.105 0.034 -0.212 0.051 -0.316 0.051z
                curveToRelative(
                    dx1 = -0.105f,
                    dy1 = 0.034f,
                    dx2 = -0.212f,
                    dy2 = 0.051f,
                    dx3 = -0.316f,
                    dy3 = 0.051f,
                )
                close()
            }
            // M3 3 h22 v30 H3z
            path(
                fill = SolidColor(Color(0xFF553788)),
            ) {
                // M 3 3
                moveTo(x = 3.0f, y = 3.0f)
                // h 22
                horizontalLineToRelative(dx = 22.0f)
                // v 30
                verticalLineToRelative(dy = 30.0f)
                // H 3z
                horizontalLineTo(x = 3.0f)
                close()
            }
            // M26 4 L2 4 c-0.55 0 -2 -3 -2 -3 0 -0.55 0.45 -1 1 -1 h26 c0.55 0 1 0.45 1 1 0 0 -1.45 3 -2 3z M26 32 L2 32 c-0.55 0 -2 3 -2 3 0 0.55 0.45 1 1 1 h26 c0.55 0 1 -0.45 1 -1 0 0 -1.45 -3 -2 -3z
            path(
                fill = SolidColor(Color(0xFFC1694F)),
            ) {
                // M 26 4
                moveTo(x = 26.0f, y = 4.0f)
                // L 2 4
                lineTo(x = 2.0f, y = 4.0f)
                // c -0.55 0 -2 -3 -2 -3
                curveToRelative(
                    dx1 = -0.55f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -3.0f,
                    dx3 = -2.0f,
                    dy3 = -3.0f,
                )
                // c 0 -0.55 0.45 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.55f,
                    dx2 = 0.45f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 26
                horizontalLineToRelative(dx = 26.0f)
                // c 0.55 0 1 0.45 1 1
                curveToRelative(
                    dx1 = 0.55f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.45f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // c 0 0 -1.45 3 -2 3z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -1.45f,
                    dy2 = 3.0f,
                    dx3 = -2.0f,
                    dy3 = 3.0f,
                )
                close()
                // M 26 32
                moveTo(x = 26.0f, y = 32.0f)
                // L 2 32
                lineTo(x = 2.0f, y = 32.0f)
                // c -0.55 0 -2 3 -2 3
                curveToRelative(
                    dx1 = -0.55f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = 3.0f,
                    dx3 = -2.0f,
                    dy3 = 3.0f,
                )
                // c 0 0.55 0.45 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.55f,
                    dx2 = 0.45f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // h 26
                horizontalLineToRelative(dx = 26.0f)
                // c 0.55 0 1 -0.45 1 -1
                curveToRelative(
                    dx1 = 0.55f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -0.45f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // c 0 0 -1.45 -3 -2 -3z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -1.45f,
                    dy2 = -3.0f,
                    dx3 = -2.0f,
                    dy3 = -3.0f,
                )
                close()
            }
            // M23 7 L5 7 c-0.55 0 -1 -0.45 -1 -1 s0.45 -1 1 -1 h18 c0.55 0 1 0.45 1 1 s-0.45 1 -1 1z M23 11 L5 11 c-0.55 0 -1 -0.45 -1 -1 s0.45 -1 1 -1 h18 c0.55 0 1 0.45 1 1 s-0.45 1 -1 1z M23 15 L5 15 c-0.55 0 -1 -0.45 -1 -1 s0.45 -1 1 -1 h18 c0.55 0 1 0.45 1 1 s-0.45 1 -1 1z M23 19 L5 19 c-0.55 0 -1 -0.45 -1 -1 s0.45 -1 1 -1 h18 c0.55 0 1 0.45 1 1 s-0.45 1 -1 1z M23 23 L5 23 c-0.55 0 -1 -0.45 -1 -1 s0.45 -1 1 -1 h18 c0.55 0 1 0.45 1 1 s-0.45 1 -1 1z M23 27 L5 27 c-0.55 0 -1 -0.45 -1 -1 s0.45 -1 1 -1 h18 c0.55 0 1 0.45 1 1 s-0.45 1 -1 1z M23 31 L5 31 c-0.55 0 -1 -0.45 -1 -1 s0.45 -1 1 -1 h18 c0.55 0 1 0.45 1 1 s-0.45 1 -1 1z
            path(
                fill = SolidColor(Color(0xFF744EAA)),
            ) {
                // M 23 7
                moveTo(x = 23.0f, y = 7.0f)
                // L 5 7
                lineTo(x = 5.0f, y = 7.0f)
                // c -0.55 0 -1 -0.45 -1 -1
                curveToRelative(
                    dx1 = -0.55f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.45f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // s 0.45 -1 1 -1
                reflectiveCurveToRelative(
                    dx1 = 0.45f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // c 0.55 0 1 0.45 1 1
                curveToRelative(
                    dx1 = 0.55f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.45f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // s -0.45 1 -1 1z
                reflectiveCurveToRelative(
                    dx1 = -0.45f,
                    dy1 = 1.0f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                close()
                // M 23 11
                moveTo(x = 23.0f, y = 11.0f)
                // L 5 11
                lineTo(x = 5.0f, y = 11.0f)
                // c -0.55 0 -1 -0.45 -1 -1
                curveToRelative(
                    dx1 = -0.55f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.45f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // s 0.45 -1 1 -1
                reflectiveCurveToRelative(
                    dx1 = 0.45f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // c 0.55 0 1 0.45 1 1
                curveToRelative(
                    dx1 = 0.55f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.45f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // s -0.45 1 -1 1z
                reflectiveCurveToRelative(
                    dx1 = -0.45f,
                    dy1 = 1.0f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                close()
                // M 23 15
                moveTo(x = 23.0f, y = 15.0f)
                // L 5 15
                lineTo(x = 5.0f, y = 15.0f)
                // c -0.55 0 -1 -0.45 -1 -1
                curveToRelative(
                    dx1 = -0.55f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.45f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // s 0.45 -1 1 -1
                reflectiveCurveToRelative(
                    dx1 = 0.45f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // c 0.55 0 1 0.45 1 1
                curveToRelative(
                    dx1 = 0.55f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.45f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // s -0.45 1 -1 1z
                reflectiveCurveToRelative(
                    dx1 = -0.45f,
                    dy1 = 1.0f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                close()
                // M 23 19
                moveTo(x = 23.0f, y = 19.0f)
                // L 5 19
                lineTo(x = 5.0f, y = 19.0f)
                // c -0.55 0 -1 -0.45 -1 -1
                curveToRelative(
                    dx1 = -0.55f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.45f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // s 0.45 -1 1 -1
                reflectiveCurveToRelative(
                    dx1 = 0.45f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // c 0.55 0 1 0.45 1 1
                curveToRelative(
                    dx1 = 0.55f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.45f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // s -0.45 1 -1 1z
                reflectiveCurveToRelative(
                    dx1 = -0.45f,
                    dy1 = 1.0f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                close()
                // M 23 23
                moveTo(x = 23.0f, y = 23.0f)
                // L 5 23
                lineTo(x = 5.0f, y = 23.0f)
                // c -0.55 0 -1 -0.45 -1 -1
                curveToRelative(
                    dx1 = -0.55f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.45f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // s 0.45 -1 1 -1
                reflectiveCurveToRelative(
                    dx1 = 0.45f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // c 0.55 0 1 0.45 1 1
                curveToRelative(
                    dx1 = 0.55f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.45f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // s -0.45 1 -1 1z
                reflectiveCurveToRelative(
                    dx1 = -0.45f,
                    dy1 = 1.0f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                close()
                // M 23 27
                moveTo(x = 23.0f, y = 27.0f)
                // L 5 27
                lineTo(x = 5.0f, y = 27.0f)
                // c -0.55 0 -1 -0.45 -1 -1
                curveToRelative(
                    dx1 = -0.55f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.45f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // s 0.45 -1 1 -1
                reflectiveCurveToRelative(
                    dx1 = 0.45f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // c 0.55 0 1 0.45 1 1
                curveToRelative(
                    dx1 = 0.55f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.45f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // s -0.45 1 -1 1z
                reflectiveCurveToRelative(
                    dx1 = -0.45f,
                    dy1 = 1.0f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                close()
                // M 23 31
                moveTo(x = 23.0f, y = 31.0f)
                // L 5 31
                lineTo(x = 5.0f, y = 31.0f)
                // c -0.55 0 -1 -0.45 -1 -1
                curveToRelative(
                    dx1 = -0.55f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.45f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // s 0.45 -1 1 -1
                reflectiveCurveToRelative(
                    dx1 = 0.45f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // c 0.55 0 1 0.45 1 1
                curveToRelative(
                    dx1 = 0.55f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.45f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // s -0.45 1 -1 1z
                reflectiveCurveToRelative(
                    dx1 = -0.45f,
                    dy1 = 1.0f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                close()
            }
            // M17.261 7 L7.739 7 C7.332 7 7 6.668 7 6.261 v-0.522 C7 5.332 7.332 5 7.739 5 h9.523 c0.406 0 0.738 0.332 0.738 0.739 v0.523 c0 0.406 -0.332 0.738 -0.739 0.738z M17.261 11 L7.739 11 C7.332 11 7 10.668 7 10.261 v-0.522 C7 9.332 7.332 9 7.739 9 h9.523 c0.406 0 0.738 0.332 0.738 0.739 v0.523 c0 0.406 -0.332 0.738 -0.739 0.738z M17.261 15 L7.739 15 C7.332 15 7 14.668 7 14.261 v-0.523 c0 -0.406 0.332 -0.738 0.739 -0.738 h9.523 c0.406 0 0.738 0.332 0.738 0.739 v0.523 c0 0.406 -0.332 0.738 -0.739 0.738z M17.261 19 L7.739 19 C7.332 19 7 18.668 7 18.261 v-0.523 c0 -0.406 0.332 -0.738 0.739 -0.738 h9.523 c0.406 0 0.738 0.332 0.738 0.739 v0.523 c0 0.406 -0.332 0.738 -0.739 0.738z M17.261 23 L7.739 23 C7.332 23 7 22.668 7 22.261 v-0.523 c0 -0.406 0.332 -0.738 0.739 -0.738 h9.523 c0.406 0 0.738 0.332 0.738 0.739 v0.523 c0 0.406 -0.332 0.738 -0.739 0.738z M17.261 27 L7.739 27 C7.332 27 7 26.668 7 26.261 v-0.523 c0 -0.406 0.332 -0.738 0.739 -0.738 h9.523 c0.406 0 0.738 0.332 0.738 0.739 v0.523 c0 0.406 -0.332 0.738 -0.739 0.738z M17.261 31 L7.739 31 C7.332 31 7 30.668 7 30.261 v-0.523 c0 -0.406 0.332 -0.738 0.739 -0.738 h9.523 c0.406 0 0.738 0.332 0.738 0.739 v0.523 c0 0.406 -0.332 0.738 -0.739 0.738z
            path(
                fill = SolidColor(Color(0xFF9266CC)),
            ) {
                // M 17.261 7
                moveTo(x = 17.261f, y = 7.0f)
                // L 7.739 7
                lineTo(x = 7.739f, y = 7.0f)
                // C 7.332 7 7 6.668 7 6.261
                curveTo(
                    x1 = 7.332f,
                    y1 = 7.0f,
                    x2 = 7.0f,
                    y2 = 6.668f,
                    x3 = 7.0f,
                    y3 = 6.261f,
                )
                // v -0.522
                verticalLineToRelative(dy = -0.522f)
                // C 7 5.332 7.332 5 7.739 5
                curveTo(
                    x1 = 7.0f,
                    y1 = 5.332f,
                    x2 = 7.332f,
                    y2 = 5.0f,
                    x3 = 7.739f,
                    y3 = 5.0f,
                )
                // h 9.523
                horizontalLineToRelative(dx = 9.523f)
                // c 0.406 0 0.738 0.332 0.738 0.739
                curveToRelative(
                    dx1 = 0.406f,
                    dy1 = 0.0f,
                    dx2 = 0.738f,
                    dy2 = 0.332f,
                    dx3 = 0.738f,
                    dy3 = 0.739f,
                )
                // v 0.523
                verticalLineToRelative(dy = 0.523f)
                // c 0 0.406 -0.332 0.738 -0.739 0.738z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.406f,
                    dx2 = -0.332f,
                    dy2 = 0.738f,
                    dx3 = -0.739f,
                    dy3 = 0.738f,
                )
                close()
                // M 17.261 11
                moveTo(x = 17.261f, y = 11.0f)
                // L 7.739 11
                lineTo(x = 7.739f, y = 11.0f)
                // C 7.332 11 7 10.668 7 10.261
                curveTo(
                    x1 = 7.332f,
                    y1 = 11.0f,
                    x2 = 7.0f,
                    y2 = 10.668f,
                    x3 = 7.0f,
                    y3 = 10.261f,
                )
                // v -0.522
                verticalLineToRelative(dy = -0.522f)
                // C 7 9.332 7.332 9 7.739 9
                curveTo(
                    x1 = 7.0f,
                    y1 = 9.332f,
                    x2 = 7.332f,
                    y2 = 9.0f,
                    x3 = 7.739f,
                    y3 = 9.0f,
                )
                // h 9.523
                horizontalLineToRelative(dx = 9.523f)
                // c 0.406 0 0.738 0.332 0.738 0.739
                curveToRelative(
                    dx1 = 0.406f,
                    dy1 = 0.0f,
                    dx2 = 0.738f,
                    dy2 = 0.332f,
                    dx3 = 0.738f,
                    dy3 = 0.739f,
                )
                // v 0.523
                verticalLineToRelative(dy = 0.523f)
                // c 0 0.406 -0.332 0.738 -0.739 0.738z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.406f,
                    dx2 = -0.332f,
                    dy2 = 0.738f,
                    dx3 = -0.739f,
                    dy3 = 0.738f,
                )
                close()
                // M 17.261 15
                moveTo(x = 17.261f, y = 15.0f)
                // L 7.739 15
                lineTo(x = 7.739f, y = 15.0f)
                // C 7.332 15 7 14.668 7 14.261
                curveTo(
                    x1 = 7.332f,
                    y1 = 15.0f,
                    x2 = 7.0f,
                    y2 = 14.668f,
                    x3 = 7.0f,
                    y3 = 14.261f,
                )
                // v -0.523
                verticalLineToRelative(dy = -0.523f)
                // c 0 -0.406 0.332 -0.738 0.739 -0.738
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.406f,
                    dx2 = 0.332f,
                    dy2 = -0.738f,
                    dx3 = 0.739f,
                    dy3 = -0.738f,
                )
                // h 9.523
                horizontalLineToRelative(dx = 9.523f)
                // c 0.406 0 0.738 0.332 0.738 0.739
                curveToRelative(
                    dx1 = 0.406f,
                    dy1 = 0.0f,
                    dx2 = 0.738f,
                    dy2 = 0.332f,
                    dx3 = 0.738f,
                    dy3 = 0.739f,
                )
                // v 0.523
                verticalLineToRelative(dy = 0.523f)
                // c 0 0.406 -0.332 0.738 -0.739 0.738z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.406f,
                    dx2 = -0.332f,
                    dy2 = 0.738f,
                    dx3 = -0.739f,
                    dy3 = 0.738f,
                )
                close()
                // M 17.261 19
                moveTo(x = 17.261f, y = 19.0f)
                // L 7.739 19
                lineTo(x = 7.739f, y = 19.0f)
                // C 7.332 19 7 18.668 7 18.261
                curveTo(
                    x1 = 7.332f,
                    y1 = 19.0f,
                    x2 = 7.0f,
                    y2 = 18.668f,
                    x3 = 7.0f,
                    y3 = 18.261f,
                )
                // v -0.523
                verticalLineToRelative(dy = -0.523f)
                // c 0 -0.406 0.332 -0.738 0.739 -0.738
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.406f,
                    dx2 = 0.332f,
                    dy2 = -0.738f,
                    dx3 = 0.739f,
                    dy3 = -0.738f,
                )
                // h 9.523
                horizontalLineToRelative(dx = 9.523f)
                // c 0.406 0 0.738 0.332 0.738 0.739
                curveToRelative(
                    dx1 = 0.406f,
                    dy1 = 0.0f,
                    dx2 = 0.738f,
                    dy2 = 0.332f,
                    dx3 = 0.738f,
                    dy3 = 0.739f,
                )
                // v 0.523
                verticalLineToRelative(dy = 0.523f)
                // c 0 0.406 -0.332 0.738 -0.739 0.738z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.406f,
                    dx2 = -0.332f,
                    dy2 = 0.738f,
                    dx3 = -0.739f,
                    dy3 = 0.738f,
                )
                close()
                // M 17.261 23
                moveTo(x = 17.261f, y = 23.0f)
                // L 7.739 23
                lineTo(x = 7.739f, y = 23.0f)
                // C 7.332 23 7 22.668 7 22.261
                curveTo(
                    x1 = 7.332f,
                    y1 = 23.0f,
                    x2 = 7.0f,
                    y2 = 22.668f,
                    x3 = 7.0f,
                    y3 = 22.261f,
                )
                // v -0.523
                verticalLineToRelative(dy = -0.523f)
                // c 0 -0.406 0.332 -0.738 0.739 -0.738
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.406f,
                    dx2 = 0.332f,
                    dy2 = -0.738f,
                    dx3 = 0.739f,
                    dy3 = -0.738f,
                )
                // h 9.523
                horizontalLineToRelative(dx = 9.523f)
                // c 0.406 0 0.738 0.332 0.738 0.739
                curveToRelative(
                    dx1 = 0.406f,
                    dy1 = 0.0f,
                    dx2 = 0.738f,
                    dy2 = 0.332f,
                    dx3 = 0.738f,
                    dy3 = 0.739f,
                )
                // v 0.523
                verticalLineToRelative(dy = 0.523f)
                // c 0 0.406 -0.332 0.738 -0.739 0.738z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.406f,
                    dx2 = -0.332f,
                    dy2 = 0.738f,
                    dx3 = -0.739f,
                    dy3 = 0.738f,
                )
                close()
                // M 17.261 27
                moveTo(x = 17.261f, y = 27.0f)
                // L 7.739 27
                lineTo(x = 7.739f, y = 27.0f)
                // C 7.332 27 7 26.668 7 26.261
                curveTo(
                    x1 = 7.332f,
                    y1 = 27.0f,
                    x2 = 7.0f,
                    y2 = 26.668f,
                    x3 = 7.0f,
                    y3 = 26.261f,
                )
                // v -0.523
                verticalLineToRelative(dy = -0.523f)
                // c 0 -0.406 0.332 -0.738 0.739 -0.738
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.406f,
                    dx2 = 0.332f,
                    dy2 = -0.738f,
                    dx3 = 0.739f,
                    dy3 = -0.738f,
                )
                // h 9.523
                horizontalLineToRelative(dx = 9.523f)
                // c 0.406 0 0.738 0.332 0.738 0.739
                curveToRelative(
                    dx1 = 0.406f,
                    dy1 = 0.0f,
                    dx2 = 0.738f,
                    dy2 = 0.332f,
                    dx3 = 0.738f,
                    dy3 = 0.739f,
                )
                // v 0.523
                verticalLineToRelative(dy = 0.523f)
                // c 0 0.406 -0.332 0.738 -0.739 0.738z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.406f,
                    dx2 = -0.332f,
                    dy2 = 0.738f,
                    dx3 = -0.739f,
                    dy3 = 0.738f,
                )
                close()
                // M 17.261 31
                moveTo(x = 17.261f, y = 31.0f)
                // L 7.739 31
                lineTo(x = 7.739f, y = 31.0f)
                // C 7.332 31 7 30.668 7 30.261
                curveTo(
                    x1 = 7.332f,
                    y1 = 31.0f,
                    x2 = 7.0f,
                    y2 = 30.668f,
                    x3 = 7.0f,
                    y3 = 30.261f,
                )
                // v -0.523
                verticalLineToRelative(dy = -0.523f)
                // c 0 -0.406 0.332 -0.738 0.739 -0.738
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.406f,
                    dx2 = 0.332f,
                    dy2 = -0.738f,
                    dx3 = 0.739f,
                    dy3 = -0.738f,
                )
                // h 9.523
                horizontalLineToRelative(dx = 9.523f)
                // c 0.406 0 0.738 0.332 0.738 0.739
                curveToRelative(
                    dx1 = 0.406f,
                    dy1 = 0.0f,
                    dx2 = 0.738f,
                    dy2 = 0.332f,
                    dx3 = 0.738f,
                    dy3 = 0.739f,
                )
                // v 0.523
                verticalLineToRelative(dy = 0.523f)
                // c 0 0.406 -0.332 0.738 -0.739 0.738z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.406f,
                    dx2 = -0.332f,
                    dy2 = 0.738f,
                    dx3 = -0.739f,
                    dy3 = 0.738f,
                )
                close()
            }
        }.build().also { _emoji1f9f5 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f9f5: ImageVector? = null
