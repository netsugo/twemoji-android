package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1f7: ImageVector
    get() {
        val current = _emoji1f1f7
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1f7",
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
            // M10.777 9.342 c0 -1.488 0.837 -2.418 2.388 -2.418 h5.457 c4.775 0 7.72 2.14 7.72 7.007 0 3.411 -2.573 5.364 -5.736 5.86 l5.272 5.644 c0.433 0.465 0.619 0.93 0.619 1.364 0 1.209 -0.961 2.387 -2.324 2.387 -0.559 0 -1.303 -0.217 -1.799 -0.806 l-6.883 -8.341 h-0.062 v6.728 c0 1.551 -0.992 2.418 -2.326 2.418 s-2.326 -0.867 -2.326 -2.418 L10.777 9.342z M15.428 16.69 h3.193 c1.705 0 2.884 -1.023 2.884 -2.759 0 -1.767 -1.18 -2.729 -2.884 -2.729 h-3.193 v5.488z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 10.777 9.342
                moveTo(x = 10.777f, y = 9.342f)
                // c 0 -1.488 0.837 -2.418 2.388 -2.418
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.488f,
                    dx2 = 0.837f,
                    dy2 = -2.418f,
                    dx3 = 2.388f,
                    dy3 = -2.418f,
                )
                // h 5.457
                horizontalLineToRelative(dx = 5.457f)
                // c 4.775 0 7.72 2.14 7.72 7.007
                curveToRelative(
                    dx1 = 4.775f,
                    dy1 = 0.0f,
                    dx2 = 7.72f,
                    dy2 = 2.14f,
                    dx3 = 7.72f,
                    dy3 = 7.007f,
                )
                // c 0 3.411 -2.573 5.364 -5.736 5.86
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.411f,
                    dx2 = -2.573f,
                    dy2 = 5.364f,
                    dx3 = -5.736f,
                    dy3 = 5.86f,
                )
                // l 5.272 5.644
                lineToRelative(dx = 5.272f, dy = 5.644f)
                // c 0.433 0.465 0.619 0.93 0.619 1.364
                curveToRelative(
                    dx1 = 0.433f,
                    dy1 = 0.465f,
                    dx2 = 0.619f,
                    dy2 = 0.93f,
                    dx3 = 0.619f,
                    dy3 = 1.364f,
                )
                // c 0 1.209 -0.961 2.387 -2.324 2.387
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.209f,
                    dx2 = -0.961f,
                    dy2 = 2.387f,
                    dx3 = -2.324f,
                    dy3 = 2.387f,
                )
                // c -0.559 0 -1.303 -0.217 -1.799 -0.806
                curveToRelative(
                    dx1 = -0.559f,
                    dy1 = 0.0f,
                    dx2 = -1.303f,
                    dy2 = -0.217f,
                    dx3 = -1.799f,
                    dy3 = -0.806f,
                )
                // l -6.883 -8.341
                lineToRelative(dx = -6.883f, dy = -8.341f)
                // h -0.062
                horizontalLineToRelative(dx = -0.062f)
                // v 6.728
                verticalLineToRelative(dy = 6.728f)
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
                // L 10.777 9.342z
                lineTo(x = 10.777f, y = 9.342f)
                close()
                // M 15.428 16.69
                moveTo(x = 15.428f, y = 16.69f)
                // h 3.193
                horizontalLineToRelative(dx = 3.193f)
                // c 1.705 0 2.884 -1.023 2.884 -2.759
                curveToRelative(
                    dx1 = 1.705f,
                    dy1 = 0.0f,
                    dx2 = 2.884f,
                    dy2 = -1.023f,
                    dx3 = 2.884f,
                    dy3 = -2.759f,
                )
                // c 0 -1.767 -1.18 -2.729 -2.884 -2.729
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.767f,
                    dx2 = -1.18f,
                    dy2 = -2.729f,
                    dx3 = -2.884f,
                    dy3 = -2.729f,
                )
                // h -3.193
                horizontalLineToRelative(dx = -3.193f)
                // v 5.488z
                verticalLineToRelative(dy = 5.488f)
                close()
            }
        }.build().also { _emoji1f1f7 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1f7: ImageVector? = null
