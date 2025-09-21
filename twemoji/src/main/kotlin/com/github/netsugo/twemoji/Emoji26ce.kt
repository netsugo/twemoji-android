package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji26ce: ImageVector
    get() {
        val current = _emoji26ce
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji26ce",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 32 c0 2.209 -1.791 4 -4 4 H4 c-2.209 0 -4 -1.791 -4 -4 V4 c0 -2.209 1.791 -4 4 -4 h28 c2.209 0 4 1.791 4 4 v28z
            path(
                fill = SolidColor(Color(0xFF9266CC)),
            ) {
                // M 36 32
                moveTo(x = 36.0f, y = 32.0f)
                // c 0 2.209 -1.791 4 -4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = -1.791f,
                    dy2 = 4.0f,
                    dx3 = -4.0f,
                    dy3 = 4.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // c -2.209 0 -4 -1.791 -4 -4
                curveToRelative(
                    dx1 = -2.209f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = -1.791f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
                // c 0 -2.209 1.791 -4 4 -4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.209f,
                    dx2 = 1.791f,
                    dy2 = -4.0f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // c 2.209 0 4 1.791 4 4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = 1.791f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // v 28z
                verticalLineToRelative(dy = 28.0f)
                close()
            }
            // M18 30.5 c-5.526 0 -8 -4.27 -8 -8.5 V7 c0 -0.829 0.671 -1.5 1.5 -1.5 S13 6.171 13 7 v15 c0 1.29 0.36 5.5 5 5.5 s5 -4.21 5 -5.5 V7 c0 -0.829 0.672 -1.5 1.5 -1.5 S26 6.171 26 7 v15 c0 4.23 -2.474 8.5 -8 8.5z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 18 30.5
                moveTo(x = 18.0f, y = 30.5f)
                // c -5.526 0 -8 -4.27 -8 -8.5
                curveToRelative(
                    dx1 = -5.526f,
                    dy1 = 0.0f,
                    dx2 = -8.0f,
                    dy2 = -4.27f,
                    dx3 = -8.0f,
                    dy3 = -8.5f,
                )
                // V 7
                verticalLineTo(y = 7.0f)
                // c 0 -0.829 0.671 -1.5 1.5 -1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.829f,
                    dx2 = 0.671f,
                    dy2 = -1.5f,
                    dx3 = 1.5f,
                    dy3 = -1.5f,
                )
                // S 13 6.171 13 7
                reflectiveCurveTo(
                    x1 = 13.0f,
                    y1 = 6.171f,
                    x2 = 13.0f,
                    y2 = 7.0f,
                )
                // v 15
                verticalLineToRelative(dy = 15.0f)
                // c 0 1.29 0.36 5.5 5 5.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.29f,
                    dx2 = 0.36f,
                    dy2 = 5.5f,
                    dx3 = 5.0f,
                    dy3 = 5.5f,
                )
                // s 5 -4.21 5 -5.5
                reflectiveCurveToRelative(
                    dx1 = 5.0f,
                    dy1 = -4.21f,
                    dx2 = 5.0f,
                    dy2 = -5.5f,
                )
                // V 7
                verticalLineTo(y = 7.0f)
                // c 0 -0.829 0.672 -1.5 1.5 -1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.829f,
                    dx2 = 0.672f,
                    dy2 = -1.5f,
                    dx3 = 1.5f,
                    dy3 = -1.5f,
                )
                // S 26 6.171 26 7
                reflectiveCurveTo(
                    x1 = 26.0f,
                    y1 = 6.171f,
                    x2 = 26.0f,
                    y2 = 7.0f,
                )
                // v 15
                verticalLineToRelative(dy = 15.0f)
                // c 0 4.23 -2.474 8.5 -8 8.5z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.23f,
                    dx2 = -2.474f,
                    dy2 = 8.5f,
                    dx3 = -8.0f,
                    dy3 = 8.5f,
                )
                close()
            }
            // M4 21.5 c-0.384 0 -0.768 -0.146 -1.061 -0.44 -0.586 -0.586 -0.586 -1.535 0 -2.121 0.525 -0.525 0.987 -1.019 1.414 -1.475 C6.428 15.25 8.066 13.5 12 13.5 c2.43 0 4.649 1.387 6.795 2.728 C20.664 17.396 22.431 18.5 24 18.5 c2.633 0 3.518 -0.945 5.457 -3.015 0.447 -0.479 0.933 -0.996 1.483 -1.545 0.586 -0.586 1.535 -0.586 2.121 0 0.586 0.585 0.586 1.536 0 2.121 -0.524 0.525 -0.986 1.019 -1.414 1.475 C29.572 19.751 27.934 21.5 24 21.5 c-2.431 0 -4.649 -1.387 -6.795 -2.728 C15.335 17.604 13.57 16.5 12 16.5 c-2.633 0 -3.518 0.945 -5.457 3.015 -0.448 0.479 -0.933 0.996 -1.483 1.546 -0.292 0.293 -0.676 0.439 -1.06 0.439z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 4 21.5
                moveTo(x = 4.0f, y = 21.5f)
                // c -0.384 0 -0.768 -0.146 -1.061 -0.44
                curveToRelative(
                    dx1 = -0.384f,
                    dy1 = 0.0f,
                    dx2 = -0.768f,
                    dy2 = -0.146f,
                    dx3 = -1.061f,
                    dy3 = -0.44f,
                )
                // c -0.586 -0.586 -0.586 -1.535 0 -2.121
                curveToRelative(
                    dx1 = -0.586f,
                    dy1 = -0.586f,
                    dx2 = -0.586f,
                    dy2 = -1.535f,
                    dx3 = 0.0f,
                    dy3 = -2.121f,
                )
                // c 0.525 -0.525 0.987 -1.019 1.414 -1.475
                curveToRelative(
                    dx1 = 0.525f,
                    dy1 = -0.525f,
                    dx2 = 0.987f,
                    dy2 = -1.019f,
                    dx3 = 1.414f,
                    dy3 = -1.475f,
                )
                // C 6.428 15.25 8.066 13.5 12 13.5
                curveTo(
                    x1 = 6.428f,
                    y1 = 15.25f,
                    x2 = 8.066f,
                    y2 = 13.5f,
                    x3 = 12.0f,
                    y3 = 13.5f,
                )
                // c 2.43 0 4.649 1.387 6.795 2.728
                curveToRelative(
                    dx1 = 2.43f,
                    dy1 = 0.0f,
                    dx2 = 4.649f,
                    dy2 = 1.387f,
                    dx3 = 6.795f,
                    dy3 = 2.728f,
                )
                // C 20.664 17.396 22.431 18.5 24 18.5
                curveTo(
                    x1 = 20.664f,
                    y1 = 17.396f,
                    x2 = 22.431f,
                    y2 = 18.5f,
                    x3 = 24.0f,
                    y3 = 18.5f,
                )
                // c 2.633 0 3.518 -0.945 5.457 -3.015
                curveToRelative(
                    dx1 = 2.633f,
                    dy1 = 0.0f,
                    dx2 = 3.518f,
                    dy2 = -0.945f,
                    dx3 = 5.457f,
                    dy3 = -3.015f,
                )
                // c 0.447 -0.479 0.933 -0.996 1.483 -1.545
                curveToRelative(
                    dx1 = 0.447f,
                    dy1 = -0.479f,
                    dx2 = 0.933f,
                    dy2 = -0.996f,
                    dx3 = 1.483f,
                    dy3 = -1.545f,
                )
                // c 0.586 -0.586 1.535 -0.586 2.121 0
                curveToRelative(
                    dx1 = 0.586f,
                    dy1 = -0.586f,
                    dx2 = 1.535f,
                    dy2 = -0.586f,
                    dx3 = 2.121f,
                    dy3 = 0.0f,
                )
                // c 0.586 0.585 0.586 1.536 0 2.121
                curveToRelative(
                    dx1 = 0.586f,
                    dy1 = 0.585f,
                    dx2 = 0.586f,
                    dy2 = 1.536f,
                    dx3 = 0.0f,
                    dy3 = 2.121f,
                )
                // c -0.524 0.525 -0.986 1.019 -1.414 1.475
                curveToRelative(
                    dx1 = -0.524f,
                    dy1 = 0.525f,
                    dx2 = -0.986f,
                    dy2 = 1.019f,
                    dx3 = -1.414f,
                    dy3 = 1.475f,
                )
                // C 29.572 19.751 27.934 21.5 24 21.5
                curveTo(
                    x1 = 29.572f,
                    y1 = 19.751f,
                    x2 = 27.934f,
                    y2 = 21.5f,
                    x3 = 24.0f,
                    y3 = 21.5f,
                )
                // c -2.431 0 -4.649 -1.387 -6.795 -2.728
                curveToRelative(
                    dx1 = -2.431f,
                    dy1 = 0.0f,
                    dx2 = -4.649f,
                    dy2 = -1.387f,
                    dx3 = -6.795f,
                    dy3 = -2.728f,
                )
                // C 15.335 17.604 13.57 16.5 12 16.5
                curveTo(
                    x1 = 15.335f,
                    y1 = 17.604f,
                    x2 = 13.57f,
                    y2 = 16.5f,
                    x3 = 12.0f,
                    y3 = 16.5f,
                )
                // c -2.633 0 -3.518 0.945 -5.457 3.015
                curveToRelative(
                    dx1 = -2.633f,
                    dy1 = 0.0f,
                    dx2 = -3.518f,
                    dy2 = 0.945f,
                    dx3 = -5.457f,
                    dy3 = 3.015f,
                )
                // c -0.448 0.479 -0.933 0.996 -1.483 1.546
                curveToRelative(
                    dx1 = -0.448f,
                    dy1 = 0.479f,
                    dx2 = -0.933f,
                    dy2 = 0.996f,
                    dx3 = -1.483f,
                    dy3 = 1.546f,
                )
                // c -0.292 0.293 -0.676 0.439 -1.06 0.439z
                curveToRelative(
                    dx1 = -0.292f,
                    dy1 = 0.293f,
                    dx2 = -0.676f,
                    dy2 = 0.439f,
                    dx3 = -1.06f,
                    dy3 = 0.439f,
                )
                close()
            }
        }.build().also { _emoji26ce = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji26ce: ImageVector? = null
