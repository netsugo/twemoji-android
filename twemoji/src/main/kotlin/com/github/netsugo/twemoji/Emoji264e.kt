package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji264e: ImageVector
    get() {
        val current = _emoji264e
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji264e",
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
            // M29 30 L7 30 c-0.829 0 -1.5 -0.672 -1.5 -1.5 S6.171 27 7 27 h22 c0.828 0 1.5 0.672 1.5 1.5 S29.828 30 29 30z M29 25 h-8 c-0.63 0 -1.192 -0.395 -1.408 -0.986 -0.216 -0.593 -0.038 -1.257 0.443 -1.662 1.242 -1.045 4.464 -4.346 4.464 -7.04 0 -4.186 -3.305 -6.687 -6.5 -6.687 s-6.5 2.478 -6.5 6.625 c0 2.699 3.23 6.046 4.474 7.109 0.478 0.407 0.651 1.07 0.434 1.66 -0.217 0.588 -0.779 0.981 -1.407 0.981 L7 25 c-0.829 0 -1.5 -0.672 -1.5 -1.5 S6.171 22 7 22 h4.465 c-1.452 -1.774 -2.966 -4.23 -2.966 -6.75 0 -6.025 4.83 -9.625 9.5 -9.625 4.568 0 9.5 3.704 9.5 9.687 0 2.507 -1.496 4.932 -2.94 6.688 L29 22 c0.828 0 1.5 0.672 1.5 1.5 S29.828 25 29 25z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 29 30
                moveTo(x = 29.0f, y = 30.0f)
                // L 7 30
                lineTo(x = 7.0f, y = 30.0f)
                // c -0.829 0 -1.5 -0.672 -1.5 -1.5
                curveToRelative(
                    dx1 = -0.829f,
                    dy1 = 0.0f,
                    dx2 = -1.5f,
                    dy2 = -0.672f,
                    dx3 = -1.5f,
                    dy3 = -1.5f,
                )
                // S 6.171 27 7 27
                reflectiveCurveTo(
                    x1 = 6.171f,
                    y1 = 27.0f,
                    x2 = 7.0f,
                    y2 = 27.0f,
                )
                // h 22
                horizontalLineToRelative(dx = 22.0f)
                // c 0.828 0 1.5 0.672 1.5 1.5
                curveToRelative(
                    dx1 = 0.828f,
                    dy1 = 0.0f,
                    dx2 = 1.5f,
                    dy2 = 0.672f,
                    dx3 = 1.5f,
                    dy3 = 1.5f,
                )
                // S 29.828 30 29 30z
                reflectiveCurveTo(
                    x1 = 29.828f,
                    y1 = 30.0f,
                    x2 = 29.0f,
                    y2 = 30.0f,
                )
                close()
                // M 29 25
                moveTo(x = 29.0f, y = 25.0f)
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // c -0.63 0 -1.192 -0.395 -1.408 -0.986
                curveToRelative(
                    dx1 = -0.63f,
                    dy1 = 0.0f,
                    dx2 = -1.192f,
                    dy2 = -0.395f,
                    dx3 = -1.408f,
                    dy3 = -0.986f,
                )
                // c -0.216 -0.593 -0.038 -1.257 0.443 -1.662
                curveToRelative(
                    dx1 = -0.216f,
                    dy1 = -0.593f,
                    dx2 = -0.038f,
                    dy2 = -1.257f,
                    dx3 = 0.443f,
                    dy3 = -1.662f,
                )
                // c 1.242 -1.045 4.464 -4.346 4.464 -7.04
                curveToRelative(
                    dx1 = 1.242f,
                    dy1 = -1.045f,
                    dx2 = 4.464f,
                    dy2 = -4.346f,
                    dx3 = 4.464f,
                    dy3 = -7.04f,
                )
                // c 0 -4.186 -3.305 -6.687 -6.5 -6.687
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.186f,
                    dx2 = -3.305f,
                    dy2 = -6.687f,
                    dx3 = -6.5f,
                    dy3 = -6.687f,
                )
                // s -6.5 2.478 -6.5 6.625
                reflectiveCurveToRelative(
                    dx1 = -6.5f,
                    dy1 = 2.478f,
                    dx2 = -6.5f,
                    dy2 = 6.625f,
                )
                // c 0 2.699 3.23 6.046 4.474 7.109
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.699f,
                    dx2 = 3.23f,
                    dy2 = 6.046f,
                    dx3 = 4.474f,
                    dy3 = 7.109f,
                )
                // c 0.478 0.407 0.651 1.07 0.434 1.66
                curveToRelative(
                    dx1 = 0.478f,
                    dy1 = 0.407f,
                    dx2 = 0.651f,
                    dy2 = 1.07f,
                    dx3 = 0.434f,
                    dy3 = 1.66f,
                )
                // c -0.217 0.588 -0.779 0.981 -1.407 0.981
                curveToRelative(
                    dx1 = -0.217f,
                    dy1 = 0.588f,
                    dx2 = -0.779f,
                    dy2 = 0.981f,
                    dx3 = -1.407f,
                    dy3 = 0.981f,
                )
                // L 7 25
                lineTo(x = 7.0f, y = 25.0f)
                // c -0.829 0 -1.5 -0.672 -1.5 -1.5
                curveToRelative(
                    dx1 = -0.829f,
                    dy1 = 0.0f,
                    dx2 = -1.5f,
                    dy2 = -0.672f,
                    dx3 = -1.5f,
                    dy3 = -1.5f,
                )
                // S 6.171 22 7 22
                reflectiveCurveTo(
                    x1 = 6.171f,
                    y1 = 22.0f,
                    x2 = 7.0f,
                    y2 = 22.0f,
                )
                // h 4.465
                horizontalLineToRelative(dx = 4.465f)
                // c -1.452 -1.774 -2.966 -4.23 -2.966 -6.75
                curveToRelative(
                    dx1 = -1.452f,
                    dy1 = -1.774f,
                    dx2 = -2.966f,
                    dy2 = -4.23f,
                    dx3 = -2.966f,
                    dy3 = -6.75f,
                )
                // c 0 -6.025 4.83 -9.625 9.5 -9.625
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -6.025f,
                    dx2 = 4.83f,
                    dy2 = -9.625f,
                    dx3 = 9.5f,
                    dy3 = -9.625f,
                )
                // c 4.568 0 9.5 3.704 9.5 9.687
                curveToRelative(
                    dx1 = 4.568f,
                    dy1 = 0.0f,
                    dx2 = 9.5f,
                    dy2 = 3.704f,
                    dx3 = 9.5f,
                    dy3 = 9.687f,
                )
                // c 0 2.507 -1.496 4.932 -2.94 6.688
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.507f,
                    dx2 = -1.496f,
                    dy2 = 4.932f,
                    dx3 = -2.94f,
                    dy3 = 6.688f,
                )
                // L 29 22
                lineTo(x = 29.0f, y = 22.0f)
                // c 0.828 0 1.5 0.672 1.5 1.5
                curveToRelative(
                    dx1 = 0.828f,
                    dy1 = 0.0f,
                    dx2 = 1.5f,
                    dy2 = 0.672f,
                    dx3 = 1.5f,
                    dy3 = 1.5f,
                )
                // S 29.828 25 29 25z
                reflectiveCurveTo(
                    x1 = 29.828f,
                    y1 = 25.0f,
                    x2 = 29.0f,
                    y2 = 25.0f,
                )
                close()
            }
        }.build().also { _emoji264e = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji264e: ImageVector? = null
