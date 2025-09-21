package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f4f1: ImageVector
    get() {
        val current = _emoji1f4f1
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f4f1",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M11 36 s-4 0 -4 -4 V4 s0 -4 4 -4 h14 s4 0 4 4 v28 s0 4 -4 4 H11z
            path(
                fill = SolidColor(Color(0xFF31373D)),
            ) {
                // M 11 36
                moveTo(x = 11.0f, y = 36.0f)
                // s -4 0 -4 -4
                reflectiveCurveToRelative(
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = -4.0f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
                // s 0 -4 4 -4
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.0f,
                    dx2 = 4.0f,
                    dy2 = -4.0f,
                )
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // s 4 0 4 4
                reflectiveCurveToRelative(
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = 4.0f,
                )
                // v 28
                verticalLineToRelative(dy = 28.0f)
                // s 0 4 -4 4
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.0f,
                    dx2 = -4.0f,
                    dy2 = 4.0f,
                )
                // H 11z
                horizontalLineTo(x = 11.0f)
                close()
            }
            // M9 5 h18 v26 H9z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 9 5
                moveTo(x = 9.0f, y = 5.0f)
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // v 26
                verticalLineToRelative(dy = 26.0f)
                // H 9z
                horizontalLineTo(x = 9.0f)
                close()
            }
        }.build().also { _emoji1f4f1 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f4f1: ImageVector? = null
