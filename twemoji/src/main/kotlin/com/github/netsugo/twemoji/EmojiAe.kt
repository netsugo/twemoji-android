package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val EmojiAe: ImageVector
    get() {
        val current = _emojiAe
        if (current != null) return current

        return ImageVector.Builder(
            name = ".EmojiAe",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M18 0 C8.059 0 0 8.06 0 18 c0 9.941 8.059 18 18 18 s18 -8.059 18 -18 c0 -9.94 -8.059 -18 -18 -18z M18 34 C9.164 34 2 26.837 2 18 2 9.164 9.164 2 18 2 c8.837 0 16 7.164 16 16 0 8.837 -7.163 16 -16 16z
            path(
                fill = SolidColor(Color(0xFF31373D)),
            ) {
                // M 18 0
                moveTo(x = 18.0f, y = 0.0f)
                // C 8.059 0 0 8.06 0 18
                curveTo(
                    x1 = 8.059f,
                    y1 = 0.0f,
                    x2 = 0.0f,
                    y2 = 8.06f,
                    x3 = 0.0f,
                    y3 = 18.0f,
                )
                // c 0 9.941 8.059 18 18 18
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 9.941f,
                    dx2 = 8.059f,
                    dy2 = 18.0f,
                    dx3 = 18.0f,
                    dy3 = 18.0f,
                )
                // s 18 -8.059 18 -18
                reflectiveCurveToRelative(
                    dx1 = 18.0f,
                    dy1 = -8.059f,
                    dx2 = 18.0f,
                    dy2 = -18.0f,
                )
                // c 0 -9.94 -8.059 -18 -18 -18z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -9.94f,
                    dx2 = -8.059f,
                    dy2 = -18.0f,
                    dx3 = -18.0f,
                    dy3 = -18.0f,
                )
                close()
                // M 18 34
                moveTo(x = 18.0f, y = 34.0f)
                // C 9.164 34 2 26.837 2 18
                curveTo(
                    x1 = 9.164f,
                    y1 = 34.0f,
                    x2 = 2.0f,
                    y2 = 26.837f,
                    x3 = 2.0f,
                    y3 = 18.0f,
                )
                // C 2 9.164 9.164 2 18 2
                curveTo(
                    x1 = 2.0f,
                    y1 = 9.164f,
                    x2 = 9.164f,
                    y2 = 2.0f,
                    x3 = 18.0f,
                    y3 = 2.0f,
                )
                // c 8.837 0 16 7.164 16 16
                curveToRelative(
                    dx1 = 8.837f,
                    dy1 = 0.0f,
                    dx2 = 16.0f,
                    dy2 = 7.164f,
                    dx3 = 16.0f,
                    dy3 = 16.0f,
                )
                // c 0 8.837 -7.163 16 -16 16z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 8.837f,
                    dx2 = -7.163f,
                    dy2 = 16.0f,
                    dx3 = -16.0f,
                    dy3 = 16.0f,
                )
                close()
            }
            // M10.777 9.342 c0 -1.488 0.837 -2.418 2.388 -2.418 h5.457 c4.775 0 7.72 2.14 7.72 7.007 0 3.411 -2.573 5.364 -5.736 5.86 l5.272 5.644 c0.433 0.465 0.619 0.93 0.619 1.364 0 1.209 -0.961 2.387 -2.324 2.387 -0.559 0 -1.303 -0.217 -1.799 -0.806 l-6.883 -8.341 h-0.062 v6.728 c0 1.551 -0.992 2.418 -2.326 2.418 s-2.326 -0.867 -2.326 -2.418 L10.777 9.342z M15.428 16.69 h3.193 c1.705 0 2.884 -1.023 2.884 -2.759 0 -1.767 -1.18 -2.729 -2.884 -2.729 h-3.193 v5.488z
            path(
                fill = SolidColor(Color(0xFF31373D)),
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
        }.build().also { _emojiAe = it }
    }

@Suppress("ObjectPropertyName")
private var _emojiAe: ImageVector? = null
