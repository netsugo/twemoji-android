package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f48a: ImageVector
    get() {
        val current = _emoji1f48a
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f48a",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M33.207 19.773 l-8.868 -8.855 L11.105 24.54 l8.684 8.685 0.001 -0.001 C21.509 34.939 23.881 36 26.5 36 c5.246 0 9.5 -4.254 9.5 -9.5 0 -2.628 -1.068 -5.007 -2.793 -6.727z
            path(
                fill = SolidColor(Color(0xFFBB1A34)),
            ) {
                // M 33.207 19.773
                moveTo(x = 33.207f, y = 19.773f)
                // l -8.868 -8.855
                lineToRelative(dx = -8.868f, dy = -8.855f)
                // L 11.105 24.54
                lineTo(x = 11.105f, y = 24.54f)
                // l 8.684 8.685
                lineToRelative(dx = 8.684f, dy = 8.685f)
                // l 0.001 -0.001
                lineToRelative(dx = 0.001f, dy = -0.001f)
                // C 21.509 34.939 23.881 36 26.5 36
                curveTo(
                    x1 = 21.509f,
                    y1 = 34.939f,
                    x2 = 23.881f,
                    y2 = 36.0f,
                    x3 = 26.5f,
                    y3 = 36.0f,
                )
                // c 5.246 0 9.5 -4.254 9.5 -9.5
                curveToRelative(
                    dx1 = 5.246f,
                    dy1 = 0.0f,
                    dx2 = 9.5f,
                    dy2 = -4.254f,
                    dx3 = 9.5f,
                    dy3 = -9.5f,
                )
                // c 0 -2.628 -1.068 -5.007 -2.793 -6.727z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.628f,
                    dx2 = -1.068f,
                    dy2 = -5.007f,
                    dx3 = -2.793f,
                    dy3 = -6.727f,
                )
                close()
            }
            // M15.921 2.513 C14.229 0.957 11.979 0 9.5 0 4.253 0 0 4.253 0 9.5 c0 2.479 0.958 4.73 2.514 6.421 l-0.014 0.014 8.605 8.605 13.234 -13.622 -8.418 -8.405z
            path(
                fill = SolidColor(Color(0xFFFDCB58)),
            ) {
                // M 15.921 2.513
                moveTo(x = 15.921f, y = 2.513f)
                // C 14.229 0.957 11.979 0 9.5 0
                curveTo(
                    x1 = 14.229f,
                    y1 = 0.957f,
                    x2 = 11.979f,
                    y2 = 0.0f,
                    x3 = 9.5f,
                    y3 = 0.0f,
                )
                // C 4.253 0 0 4.253 0 9.5
                curveTo(
                    x1 = 4.253f,
                    y1 = 0.0f,
                    x2 = 0.0f,
                    y2 = 4.253f,
                    x3 = 0.0f,
                    y3 = 9.5f,
                )
                // c 0 2.479 0.958 4.73 2.514 6.421
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.479f,
                    dx2 = 0.958f,
                    dy2 = 4.73f,
                    dx3 = 2.514f,
                    dy3 = 6.421f,
                )
                // l -0.014 0.014
                lineToRelative(dx = -0.014f, dy = 0.014f)
                // l 8.605 8.605
                lineToRelative(dx = 8.605f, dy = 8.605f)
                // l 13.234 -13.622
                lineToRelative(dx = 13.234f, dy = -13.622f)
                // l -8.418 -8.405z
                lineToRelative(dx = -8.418f, dy = -8.405f)
                close()
            }
        }.build().also { _emoji1f48a = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f48a: ImageVector? = null
