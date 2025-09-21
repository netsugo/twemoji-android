package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1f3: ImageVector
    get() {
        val current = _emoji1f1f3
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1f3",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 32 c0 2.209 -1.791 4 -4 4 H4 c-2.209 0 -4 -1.791 -4 -4 V4 c0 -2.209 1.791 -4 4 -4 h28 c2.209 0 4 1.791 4 4 v28z
            path(
                fill = SolidColor(Color(0xFF3B88C3)),
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
            // M8.591 9.156 c0 -1.55 0.992 -2.418 2.326 -2.418 0.589 0 1.55 0.465 1.954 1.023 L22.7 20.877 h0.062 V9.156 c0 -1.55 0.992 -2.418 2.324 -2.418 1.334 0 2.326 0.868 2.326 2.418 v17.611 c0 1.551 -0.992 2.418 -2.326 2.418 -0.588 0 -1.518 -0.465 -1.953 -1.022 l-9.829 -12.961 h-0.062 v11.565 c0 1.551 -0.992 2.418 -2.326 2.418 s-2.326 -0.867 -2.326 -2.418 V9.156z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 8.591 9.156
                moveTo(x = 8.591f, y = 9.156f)
                // c 0 -1.55 0.992 -2.418 2.326 -2.418
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.55f,
                    dx2 = 0.992f,
                    dy2 = -2.418f,
                    dx3 = 2.326f,
                    dy3 = -2.418f,
                )
                // c 0.589 0 1.55 0.465 1.954 1.023
                curveToRelative(
                    dx1 = 0.589f,
                    dy1 = 0.0f,
                    dx2 = 1.55f,
                    dy2 = 0.465f,
                    dx3 = 1.954f,
                    dy3 = 1.023f,
                )
                // L 22.7 20.877
                lineTo(x = 22.7f, y = 20.877f)
                // h 0.062
                horizontalLineToRelative(dx = 0.062f)
                // V 9.156
                verticalLineTo(y = 9.156f)
                // c 0 -1.55 0.992 -2.418 2.324 -2.418
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.55f,
                    dx2 = 0.992f,
                    dy2 = -2.418f,
                    dx3 = 2.324f,
                    dy3 = -2.418f,
                )
                // c 1.334 0 2.326 0.868 2.326 2.418
                curveToRelative(
                    dx1 = 1.334f,
                    dy1 = 0.0f,
                    dx2 = 2.326f,
                    dy2 = 0.868f,
                    dx3 = 2.326f,
                    dy3 = 2.418f,
                )
                // v 17.611
                verticalLineToRelative(dy = 17.611f)
                // c 0 1.551 -0.992 2.418 -2.326 2.418
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.551f,
                    dx2 = -0.992f,
                    dy2 = 2.418f,
                    dx3 = -2.326f,
                    dy3 = 2.418f,
                )
                // c -0.588 0 -1.518 -0.465 -1.953 -1.022
                curveToRelative(
                    dx1 = -0.588f,
                    dy1 = 0.0f,
                    dx2 = -1.518f,
                    dy2 = -0.465f,
                    dx3 = -1.953f,
                    dy3 = -1.022f,
                )
                // l -9.829 -12.961
                lineToRelative(dx = -9.829f, dy = -12.961f)
                // h -0.062
                horizontalLineToRelative(dx = -0.062f)
                // v 11.565
                verticalLineToRelative(dy = 11.565f)
                // c 0 1.551 -0.992 2.418 -2.326 2.418
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.551f,
                    dx2 = -0.992f,
                    dy2 = 2.418f,
                    dx3 = -2.326f,
                    dy3 = 2.418f,
                )
                // s -2.326 -0.867 -2.326 -2.418
                reflectiveCurveToRelative(
                    dx1 = -2.326f,
                    dy1 = -0.867f,
                    dx2 = -2.326f,
                    dy2 = -2.418f,
                )
                // V 9.156z
                verticalLineTo(y = 9.156f)
                close()
            }
        }.build().also { _emoji1f1f3 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1f3: ImageVector? = null
