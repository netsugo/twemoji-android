package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji2660: ImageVector
    get() {
        val current = _emoji2660
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji2660",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M32.799 20.336 C32.799 11.456 18 0.198 18 0.198 S3.201 11.456 3.201 20.336 c0 6.946 8.175 10.172 12.766 5.173 C15.631 29.688 11.247 33 7 33 h0.5 c-0.829 0 -1.5 0.672 -1.5 1.5 S6.671 36 7.5 36 h21 c0.828 0 1.5 -0.672 1.5 -1.5 s-0.672 -1.5 -1.5 -1.5 h0.5 c-4.246 0 -8.632 -3.312 -8.967 -7.491 4.591 4.999 12.766 1.773 12.766 -5.173z
            path(
                fill = SolidColor(Color(0xFF31373D)),
            ) {
                // M 32.799 20.336
                moveTo(x = 32.799f, y = 20.336f)
                // C 32.799 11.456 18 0.198 18 0.198
                curveTo(
                    x1 = 32.799f,
                    y1 = 11.456f,
                    x2 = 18.0f,
                    y2 = 0.198f,
                    x3 = 18.0f,
                    y3 = 0.198f,
                )
                // S 3.201 11.456 3.201 20.336
                reflectiveCurveTo(
                    x1 = 3.201f,
                    y1 = 11.456f,
                    x2 = 3.201f,
                    y2 = 20.336f,
                )
                // c 0 6.946 8.175 10.172 12.766 5.173
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 6.946f,
                    dx2 = 8.175f,
                    dy2 = 10.172f,
                    dx3 = 12.766f,
                    dy3 = 5.173f,
                )
                // C 15.631 29.688 11.247 33 7 33
                curveTo(
                    x1 = 15.631f,
                    y1 = 29.688f,
                    x2 = 11.247f,
                    y2 = 33.0f,
                    x3 = 7.0f,
                    y3 = 33.0f,
                )
                // h 0.5
                horizontalLineToRelative(dx = 0.5f)
                // c -0.829 0 -1.5 0.672 -1.5 1.5
                curveToRelative(
                    dx1 = -0.829f,
                    dy1 = 0.0f,
                    dx2 = -1.5f,
                    dy2 = 0.672f,
                    dx3 = -1.5f,
                    dy3 = 1.5f,
                )
                // S 6.671 36 7.5 36
                reflectiveCurveTo(
                    x1 = 6.671f,
                    y1 = 36.0f,
                    x2 = 7.5f,
                    y2 = 36.0f,
                )
                // h 21
                horizontalLineToRelative(dx = 21.0f)
                // c 0.828 0 1.5 -0.672 1.5 -1.5
                curveToRelative(
                    dx1 = 0.828f,
                    dy1 = 0.0f,
                    dx2 = 1.5f,
                    dy2 = -0.672f,
                    dx3 = 1.5f,
                    dy3 = -1.5f,
                )
                // s -0.672 -1.5 -1.5 -1.5
                reflectiveCurveToRelative(
                    dx1 = -0.672f,
                    dy1 = -1.5f,
                    dx2 = -1.5f,
                    dy2 = -1.5f,
                )
                // h 0.5
                horizontalLineToRelative(dx = 0.5f)
                // c -4.246 0 -8.632 -3.312 -8.967 -7.491
                curveToRelative(
                    dx1 = -4.246f,
                    dy1 = 0.0f,
                    dx2 = -8.632f,
                    dy2 = -3.312f,
                    dx3 = -8.967f,
                    dy3 = -7.491f,
                )
                // c 4.591 4.999 12.766 1.773 12.766 -5.173z
                curveToRelative(
                    dx1 = 4.591f,
                    dy1 = 4.999f,
                    dx2 = 12.766f,
                    dy2 = 1.773f,
                    dx3 = 12.766f,
                    dy3 = -5.173f,
                )
                close()
            }
        }.build().also { _emoji2660 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji2660: ImageVector? = null
