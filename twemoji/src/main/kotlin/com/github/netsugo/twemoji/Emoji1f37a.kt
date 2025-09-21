package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f37a: ImageVector
    get() {
        val current = _emoji1f37a
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f37a",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M31 5.718 h-6 v4 h4 s2 0 2 2 v12 c0 2 -2 2 -2 2 h-4 v4 h6 c2.206 0 4 -1.794 4 -4 v-16 c0 -2.206 -1.794 -4 -4 -4z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 31 5.718
                moveTo(x = 31.0f, y = 5.718f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // s 2 0 2 2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                )
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // c 0 2 -2 2 -2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                    dx2 = -2.0f,
                    dy2 = 2.0f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // c 2.206 0 4 -1.794 4 -4
                curveToRelative(
                    dx1 = 2.206f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = -1.794f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // v -16
                verticalLineToRelative(dy = -16.0f)
                // c 0 -2.206 -1.794 -4 -4 -4z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.206f,
                    dx2 = -1.794f,
                    dy2 = -4.0f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                close()
            }
            // M27 6 H3 v26 c0 2.209 1.791 4 4 4 h16 c2.209 0 4 -1.791 4 -4 V6z
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 27 6
                moveTo(x = 27.0f, y = 6.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // v 26
                verticalLineToRelative(dy = 26.0f)
                // c 0 2.209 1.791 4 4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = 1.791f,
                    dy2 = 4.0f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // c 2.209 0 4 -1.791 4 -4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = -1.791f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // V 6z
                verticalLineTo(y = 6.0f)
                close()
            }
            // M8.5 32 c-0.552 0 -1 -0.447 -1 -1 L7.5 15 c0 -0.552 0.448 -1 1 -1 s1 0.448 1 1 v16 c0 0.553 -0.448 1 -1 1z M15 32 c-0.552 0 -1 -0.447 -1 -1 L14 15 c0 -0.552 0.448 -1 1 -1 s1 0.448 1 1 v16 c0 0.553 -0.448 1 -1 1z M21.5 32 c-0.553 0 -1 -0.447 -1 -1 L20.5 15 c0 -0.552 0.447 -1 1 -1 s1 0.448 1 1 v16 c0 0.553 -0.447 1 -1 1z
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 8.5 32
                moveTo(x = 8.5f, y = 32.0f)
                // c -0.552 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // L 7.5 15
                lineTo(x = 7.5f, y = 15.0f)
                // c 0 -0.552 0.448 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = 0.448f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // s 1 0.448 1 1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.448f,
                    dx2 = 1.0f,
                    dy2 = 1.0f,
                )
                // v 16
                verticalLineToRelative(dy = 16.0f)
                // c 0 0.553 -0.448 1 -1 1z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.448f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                close()
                // M 15 32
                moveTo(x = 15.0f, y = 32.0f)
                // c -0.552 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // L 14 15
                lineTo(x = 14.0f, y = 15.0f)
                // c 0 -0.552 0.448 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = 0.448f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // s 1 0.448 1 1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.448f,
                    dx2 = 1.0f,
                    dy2 = 1.0f,
                )
                // v 16
                verticalLineToRelative(dy = 16.0f)
                // c 0 0.553 -0.448 1 -1 1z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.448f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                close()
                // M 21.5 32
                moveTo(x = 21.5f, y = 32.0f)
                // c -0.553 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.553f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // L 20.5 15
                lineTo(x = 20.5f, y = 15.0f)
                // c 0 -0.552 0.447 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = 0.447f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // s 1 0.448 1 1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.448f,
                    dx2 = 1.0f,
                    dy2 = 1.0f,
                )
                // v 16
                verticalLineToRelative(dy = 16.0f)
                // c 0 0.553 -0.447 1 -1 1z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                close()
            }
            // M3 5 v7.445 c0.59 0.344 1.268 0.555 2 0.555 1.674 0 3.104 -1.031 3.701 -2.491 0.35 0.302 0.801 0.491 1.299 0.491 0.677 0 1.273 -0.338 1.635 -0.853 C12.345 11.258 13.583 12 15 12 c1.301 0 2.445 -0.631 3.176 -1.593 C18.54 11.338 19.44 12 20.5 12 c0.949 0 1.765 -0.535 2.188 -1.314 l0.147 -0.361 c0.497 0.271 1.059 0.439 1.665 0.439 0.981 0 1.865 -0.406 2.5 -1.056 V5 H3z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 3 5
                moveTo(x = 3.0f, y = 5.0f)
                // v 7.445
                verticalLineToRelative(dy = 7.445f)
                // c 0.59 0.344 1.268 0.555 2 0.555
                curveToRelative(
                    dx1 = 0.59f,
                    dy1 = 0.344f,
                    dx2 = 1.268f,
                    dy2 = 0.555f,
                    dx3 = 2.0f,
                    dy3 = 0.555f,
                )
                // c 1.674 0 3.104 -1.031 3.701 -2.491
                curveToRelative(
                    dx1 = 1.674f,
                    dy1 = 0.0f,
                    dx2 = 3.104f,
                    dy2 = -1.031f,
                    dx3 = 3.701f,
                    dy3 = -2.491f,
                )
                // c 0.35 0.302 0.801 0.491 1.299 0.491
                curveToRelative(
                    dx1 = 0.35f,
                    dy1 = 0.302f,
                    dx2 = 0.801f,
                    dy2 = 0.491f,
                    dx3 = 1.299f,
                    dy3 = 0.491f,
                )
                // c 0.677 0 1.273 -0.338 1.635 -0.853
                curveToRelative(
                    dx1 = 0.677f,
                    dy1 = 0.0f,
                    dx2 = 1.273f,
                    dy2 = -0.338f,
                    dx3 = 1.635f,
                    dy3 = -0.853f,
                )
                // C 12.345 11.258 13.583 12 15 12
                curveTo(
                    x1 = 12.345f,
                    y1 = 11.258f,
                    x2 = 13.583f,
                    y2 = 12.0f,
                    x3 = 15.0f,
                    y3 = 12.0f,
                )
                // c 1.301 0 2.445 -0.631 3.176 -1.593
                curveToRelative(
                    dx1 = 1.301f,
                    dy1 = 0.0f,
                    dx2 = 2.445f,
                    dy2 = -0.631f,
                    dx3 = 3.176f,
                    dy3 = -1.593f,
                )
                // C 18.54 11.338 19.44 12 20.5 12
                curveTo(
                    x1 = 18.54f,
                    y1 = 11.338f,
                    x2 = 19.44f,
                    y2 = 12.0f,
                    x3 = 20.5f,
                    y3 = 12.0f,
                )
                // c 0.949 0 1.765 -0.535 2.188 -1.314
                curveToRelative(
                    dx1 = 0.949f,
                    dy1 = 0.0f,
                    dx2 = 1.765f,
                    dy2 = -0.535f,
                    dx3 = 2.188f,
                    dy3 = -1.314f,
                )
                // l 0.147 -0.361
                lineToRelative(dx = 0.147f, dy = -0.361f)
                // c 0.497 0.271 1.059 0.439 1.665 0.439
                curveToRelative(
                    dx1 = 0.497f,
                    dy1 = 0.271f,
                    dx2 = 1.059f,
                    dy2 = 0.439f,
                    dx3 = 1.665f,
                    dy3 = 0.439f,
                )
                // c 0.981 0 1.865 -0.406 2.5 -1.056
                curveToRelative(
                    dx1 = 0.981f,
                    dy1 = 0.0f,
                    dx2 = 1.865f,
                    dy2 = -0.406f,
                    dx3 = 2.5f,
                    dy3 = -1.056f,
                )
                // V 5
                verticalLineTo(y = 5.0f)
                // H 3z
                horizontalLineTo(x = 3.0f)
                close()
            }
            // M24 0 H4 C2.343 0 1 1.343 1 3 v4 c0 2.209 1.791 4 4 4 1.674 0 3.104 -1.031 3.701 -2.491 0.35 0.302 0.801 0.491 1.299 0.491 0.677 0 1.273 -0.338 1.635 -0.853 C12.345 9.258 13.583 10 15 10 c1.301 0 2.445 -0.631 3.176 -1.593 C18.54 9.338 19.44 10 20.5 10 c0.949 0 1.765 -0.535 2.188 -1.314 0.398 0.195 0.839 0.314 1.312 0.314 1.657 0 3 -1.343 3 -3 V3 c0 -1.657 -1.343 -3 -3 -3z
            path(
                fill = SolidColor(Color(0xFFEEEEEE)),
            ) {
                // M 24 0
                moveTo(x = 24.0f, y = 0.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // C 2.343 0 1 1.343 1 3
                curveTo(
                    x1 = 2.343f,
                    y1 = 0.0f,
                    x2 = 1.0f,
                    y2 = 1.343f,
                    x3 = 1.0f,
                    y3 = 3.0f,
                )
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // c 0 2.209 1.791 4 4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = 1.791f,
                    dy2 = 4.0f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // c 1.674 0 3.104 -1.031 3.701 -2.491
                curveToRelative(
                    dx1 = 1.674f,
                    dy1 = 0.0f,
                    dx2 = 3.104f,
                    dy2 = -1.031f,
                    dx3 = 3.701f,
                    dy3 = -2.491f,
                )
                // c 0.35 0.302 0.801 0.491 1.299 0.491
                curveToRelative(
                    dx1 = 0.35f,
                    dy1 = 0.302f,
                    dx2 = 0.801f,
                    dy2 = 0.491f,
                    dx3 = 1.299f,
                    dy3 = 0.491f,
                )
                // c 0.677 0 1.273 -0.338 1.635 -0.853
                curveToRelative(
                    dx1 = 0.677f,
                    dy1 = 0.0f,
                    dx2 = 1.273f,
                    dy2 = -0.338f,
                    dx3 = 1.635f,
                    dy3 = -0.853f,
                )
                // C 12.345 9.258 13.583 10 15 10
                curveTo(
                    x1 = 12.345f,
                    y1 = 9.258f,
                    x2 = 13.583f,
                    y2 = 10.0f,
                    x3 = 15.0f,
                    y3 = 10.0f,
                )
                // c 1.301 0 2.445 -0.631 3.176 -1.593
                curveToRelative(
                    dx1 = 1.301f,
                    dy1 = 0.0f,
                    dx2 = 2.445f,
                    dy2 = -0.631f,
                    dx3 = 3.176f,
                    dy3 = -1.593f,
                )
                // C 18.54 9.338 19.44 10 20.5 10
                curveTo(
                    x1 = 18.54f,
                    y1 = 9.338f,
                    x2 = 19.44f,
                    y2 = 10.0f,
                    x3 = 20.5f,
                    y3 = 10.0f,
                )
                // c 0.949 0 1.765 -0.535 2.188 -1.314
                curveToRelative(
                    dx1 = 0.949f,
                    dy1 = 0.0f,
                    dx2 = 1.765f,
                    dy2 = -0.535f,
                    dx3 = 2.188f,
                    dy3 = -1.314f,
                )
                // c 0.398 0.195 0.839 0.314 1.312 0.314
                curveToRelative(
                    dx1 = 0.398f,
                    dy1 = 0.195f,
                    dx2 = 0.839f,
                    dy2 = 0.314f,
                    dx3 = 1.312f,
                    dy3 = 0.314f,
                )
                // c 1.657 0 3 -1.343 3 -3
                curveToRelative(
                    dx1 = 1.657f,
                    dy1 = 0.0f,
                    dx2 = 3.0f,
                    dy2 = -1.343f,
                    dx3 = 3.0f,
                    dy3 = -3.0f,
                )
                // V 3
                verticalLineTo(y = 3.0f)
                // c 0 -1.657 -1.343 -3 -3 -3z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.657f,
                    dx2 = -1.343f,
                    dy2 = -3.0f,
                    dx3 = -3.0f,
                    dy3 = -3.0f,
                )
                close()
            }
        }.build().also { _emoji1f37a = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f37a: ImageVector? = null
