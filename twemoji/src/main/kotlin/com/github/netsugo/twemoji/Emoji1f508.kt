package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f508: ImageVector
    get() {
        val current = _emoji1f508
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f508",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M9 10 s-2 0 -2 2 v12 c0 2 2 2 2 2 h6 l8 8 s1 1 2 1 h1 s1 0 1 -1 V2 s0 -1 -1 -1 h-1 c-1 0 -2 1 -2 1 l-8 8 H9z
            path(
                fill = SolidColor(Color(0xFF8899A6)),
            ) {
                // M 9 10
                moveTo(x = 9.0f, y = 10.0f)
                // s -2 0 -2 2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = 2.0f,
                )
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // c 0 2 2 2 2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // l 8 8
                lineToRelative(dx = 8.0f, dy = 8.0f)
                // s 1 1 2 1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                    dx2 = 2.0f,
                    dy2 = 1.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // s 1 0 1 -1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // V 2
                verticalLineTo(y = 2.0f)
                // s 0 -1 -1 -1
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.0f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                )
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // c -1 0 -2 1 -2 1
                curveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = 1.0f,
                    dx3 = -2.0f,
                    dy3 = 1.0f,
                )
                // l -8 8
                lineToRelative(dx = -8.0f, dy = 8.0f)
                // H 9z
                horizontalLineTo(x = 9.0f)
                close()
            }
            // M15 26 l8 8 s1 1 2 1 h1 s1 0 1 -1 V2 s0 -1 -1 -1 h-1 c-1 0 -2 1 -2 1 l-8 8 v16z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 15 26
                moveTo(x = 15.0f, y = 26.0f)
                // l 8 8
                lineToRelative(dx = 8.0f, dy = 8.0f)
                // s 1 1 2 1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                    dx2 = 2.0f,
                    dy2 = 1.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // s 1 0 1 -1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // V 2
                verticalLineTo(y = 2.0f)
                // s 0 -1 -1 -1
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.0f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                )
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // c -1 0 -2 1 -2 1
                curveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = 1.0f,
                    dx3 = -2.0f,
                    dy3 = 1.0f,
                )
                // l -8 8
                lineToRelative(dx = -8.0f, dy = 8.0f)
                // v 16z
                verticalLineToRelative(dy = 16.0f)
                close()
            }
        }.build().also { _emoji1f508 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f508: ImageVector? = null
