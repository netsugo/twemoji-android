package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1f5: ImageVector
    get() {
        val current = _emoji1f1f5
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1f5",
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
            // M10.777 9.342 c0 -1.458 0.868 -2.418 2.419 -2.418 h5.488 c4.559 0 7.938 2.977 7.938 7.41 0 4.527 -3.504 7.349 -7.751 7.349 L15.43 21.683 v5.085 c0 1.551 -0.992 2.418 -2.326 2.418 s-2.326 -0.867 -2.326 -2.418 L10.778 9.342z M15.428 17.59 h3.162 c1.954 0 3.194 -1.426 3.194 -3.287 0 -1.86 -1.24 -3.287 -3.194 -3.287 h-3.162 v6.574z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 10.777 9.342
                moveTo(x = 10.777f, y = 9.342f)
                // c 0 -1.458 0.868 -2.418 2.419 -2.418
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.458f,
                    dx2 = 0.868f,
                    dy2 = -2.418f,
                    dx3 = 2.419f,
                    dy3 = -2.418f,
                )
                // h 5.488
                horizontalLineToRelative(dx = 5.488f)
                // c 4.559 0 7.938 2.977 7.938 7.41
                curveToRelative(
                    dx1 = 4.559f,
                    dy1 = 0.0f,
                    dx2 = 7.938f,
                    dy2 = 2.977f,
                    dx3 = 7.938f,
                    dy3 = 7.41f,
                )
                // c 0 4.527 -3.504 7.349 -7.751 7.349
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.527f,
                    dx2 = -3.504f,
                    dy2 = 7.349f,
                    dx3 = -7.751f,
                    dy3 = 7.349f,
                )
                // L 15.43 21.683
                lineTo(x = 15.43f, y = 21.683f)
                // v 5.085
                verticalLineToRelative(dy = 5.085f)
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
                // L 10.778 9.342z
                lineTo(x = 10.778f, y = 9.342f)
                close()
                // M 15.428 17.59
                moveTo(x = 15.428f, y = 17.59f)
                // h 3.162
                horizontalLineToRelative(dx = 3.162f)
                // c 1.954 0 3.194 -1.426 3.194 -3.287
                curveToRelative(
                    dx1 = 1.954f,
                    dy1 = 0.0f,
                    dx2 = 3.194f,
                    dy2 = -1.426f,
                    dx3 = 3.194f,
                    dy3 = -3.287f,
                )
                // c 0 -1.86 -1.24 -3.287 -3.194 -3.287
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.86f,
                    dx2 = -1.24f,
                    dy2 = -3.287f,
                    dx3 = -3.194f,
                    dy3 = -3.287f,
                )
                // h -3.162
                horizontalLineToRelative(dx = -3.162f)
                // v 6.574z
                verticalLineToRelative(dy = 6.574f)
                close()
            }
        }.build().also { _emoji1f1f5 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1f5: ImageVector? = null
