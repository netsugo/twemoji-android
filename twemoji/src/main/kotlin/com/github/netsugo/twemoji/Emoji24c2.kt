package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji24c2: ImageVector
    get() {
        val current = _emoji24c2
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji24c2",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 18 c0 9.941 -8.059 18 -18 18 S0 27.941 0 18 8.059 0 18 0 s18 8.059 18 18z
            path(
                fill = SolidColor(Color(0xFF3B88C3)),
            ) {
                // M 36 18
                moveTo(x = 36.0f, y = 18.0f)
                // c 0 9.941 -8.059 18 -18 18
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 9.941f,
                    dx2 = -8.059f,
                    dy2 = 18.0f,
                    dx3 = -18.0f,
                    dy3 = 18.0f,
                )
                // S 0 27.941 0 18
                reflectiveCurveTo(
                    x1 = 0.0f,
                    y1 = 27.941f,
                    x2 = 0.0f,
                    y2 = 18.0f,
                )
                // S 8.059 0 18 0
                reflectiveCurveTo(
                    x1 = 8.059f,
                    y1 = 0.0f,
                    x2 = 18.0f,
                    y2 = 0.0f,
                )
                // s 18 8.059 18 18z
                reflectiveCurveToRelative(
                    dx1 = 18.0f,
                    dy1 = 8.059f,
                    dx2 = 18.0f,
                    dy2 = 18.0f,
                )
                close()
            }
            // M8.174 9.125 c0.186 -1.116 1.395 -2.387 3.039 -2.387 1.55 0 2.76 1.116 3.101 2.232 l3.659 12.278 h0.062 L21.692 8.97 c0.341 -1.116 1.55 -2.232 3.101 -2.232 1.642 0 2.852 1.271 3.039 2.387 l2.883 17.302 c0.031 0.186 0.031 0.372 0.031 0.526 0 1.365 -0.992 2.232 -2.232 2.232 -1.582 0 -2.201 -0.713 -2.418 -2.17 l-1.83 -12.619 h-0.062 l-3.721 12.991 c-0.217 0.744 -0.805 1.798 -2.48 1.798 -1.674 0 -2.263 -1.054 -2.48 -1.798 l-3.721 -12.991 h-0.062 l-1.83 12.62 c-0.217 1.457 -0.837 2.17 -2.418 2.17 -1.24 0 -2.232 -0.867 -2.232 -2.232 0 -0.154 0 -0.341 0.031 -0.526 L8.174 9.125z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 8.174 9.125
                moveTo(x = 8.174f, y = 9.125f)
                // c 0.186 -1.116 1.395 -2.387 3.039 -2.387
                curveToRelative(
                    dx1 = 0.186f,
                    dy1 = -1.116f,
                    dx2 = 1.395f,
                    dy2 = -2.387f,
                    dx3 = 3.039f,
                    dy3 = -2.387f,
                )
                // c 1.55 0 2.76 1.116 3.101 2.232
                curveToRelative(
                    dx1 = 1.55f,
                    dy1 = 0.0f,
                    dx2 = 2.76f,
                    dy2 = 1.116f,
                    dx3 = 3.101f,
                    dy3 = 2.232f,
                )
                // l 3.659 12.278
                lineToRelative(dx = 3.659f, dy = 12.278f)
                // h 0.062
                horizontalLineToRelative(dx = 0.062f)
                // L 21.692 8.97
                lineTo(x = 21.692f, y = 8.97f)
                // c 0.341 -1.116 1.55 -2.232 3.101 -2.232
                curveToRelative(
                    dx1 = 0.341f,
                    dy1 = -1.116f,
                    dx2 = 1.55f,
                    dy2 = -2.232f,
                    dx3 = 3.101f,
                    dy3 = -2.232f,
                )
                // c 1.642 0 2.852 1.271 3.039 2.387
                curveToRelative(
                    dx1 = 1.642f,
                    dy1 = 0.0f,
                    dx2 = 2.852f,
                    dy2 = 1.271f,
                    dx3 = 3.039f,
                    dy3 = 2.387f,
                )
                // l 2.883 17.302
                lineToRelative(dx = 2.883f, dy = 17.302f)
                // c 0.031 0.186 0.031 0.372 0.031 0.526
                curveToRelative(
                    dx1 = 0.031f,
                    dy1 = 0.186f,
                    dx2 = 0.031f,
                    dy2 = 0.372f,
                    dx3 = 0.031f,
                    dy3 = 0.526f,
                )
                // c 0 1.365 -0.992 2.232 -2.232 2.232
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.365f,
                    dx2 = -0.992f,
                    dy2 = 2.232f,
                    dx3 = -2.232f,
                    dy3 = 2.232f,
                )
                // c -1.582 0 -2.201 -0.713 -2.418 -2.17
                curveToRelative(
                    dx1 = -1.582f,
                    dy1 = 0.0f,
                    dx2 = -2.201f,
                    dy2 = -0.713f,
                    dx3 = -2.418f,
                    dy3 = -2.17f,
                )
                // l -1.83 -12.619
                lineToRelative(dx = -1.83f, dy = -12.619f)
                // h -0.062
                horizontalLineToRelative(dx = -0.062f)
                // l -3.721 12.991
                lineToRelative(dx = -3.721f, dy = 12.991f)
                // c -0.217 0.744 -0.805 1.798 -2.48 1.798
                curveToRelative(
                    dx1 = -0.217f,
                    dy1 = 0.744f,
                    dx2 = -0.805f,
                    dy2 = 1.798f,
                    dx3 = -2.48f,
                    dy3 = 1.798f,
                )
                // c -1.674 0 -2.263 -1.054 -2.48 -1.798
                curveToRelative(
                    dx1 = -1.674f,
                    dy1 = 0.0f,
                    dx2 = -2.263f,
                    dy2 = -1.054f,
                    dx3 = -2.48f,
                    dy3 = -1.798f,
                )
                // l -3.721 -12.991
                lineToRelative(dx = -3.721f, dy = -12.991f)
                // h -0.062
                horizontalLineToRelative(dx = -0.062f)
                // l -1.83 12.62
                lineToRelative(dx = -1.83f, dy = 12.62f)
                // c -0.217 1.457 -0.837 2.17 -2.418 2.17
                curveToRelative(
                    dx1 = -0.217f,
                    dy1 = 1.457f,
                    dx2 = -0.837f,
                    dy2 = 2.17f,
                    dx3 = -2.418f,
                    dy3 = 2.17f,
                )
                // c -1.24 0 -2.232 -0.867 -2.232 -2.232
                curveToRelative(
                    dx1 = -1.24f,
                    dy1 = 0.0f,
                    dx2 = -2.232f,
                    dy2 = -0.867f,
                    dx3 = -2.232f,
                    dy3 = -2.232f,
                )
                // c 0 -0.154 0 -0.341 0.031 -0.526
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.154f,
                    dx2 = 0.0f,
                    dy2 = -0.341f,
                    dx3 = 0.031f,
                    dy3 = -0.526f,
                )
                // L 8.174 9.125z
                lineTo(x = 8.174f, y = 9.125f)
                close()
            }
        }.build().also { _emoji24c2 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji24c2: ImageVector? = null
