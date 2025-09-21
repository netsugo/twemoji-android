package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f39a: ImageVector
    get() {
        val current = _emoji1f39a
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f39a",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M33 32 c0 2.209 -1.791 4 -4 4 H7 c-2.209 0 -4 -1.791 -4 -4 V4 c0 -2.209 1.791 -4 4 -4 h22 c2.209 0 4 1.791 4 4 v28z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 33 32
                moveTo(x = 33.0f, y = 32.0f)
                // c 0 2.209 -1.791 4 -4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = -1.791f,
                    dy2 = 4.0f,
                    dx3 = -4.0f,
                    dy3 = 4.0f,
                )
                // H 7
                horizontalLineTo(x = 7.0f)
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
                // h 22
                horizontalLineToRelative(dx = 22.0f)
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
            // M19 31 c0 0.553 -0.448 1 -1 1 s-1 -0.447 -1 -1 V5 c0 -0.552 0.448 -1 1 -1 s1 0.448 1 1 v26z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 19 31
                moveTo(x = 19.0f, y = 31.0f)
                // c 0 0.553 -0.448 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.448f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // s -1 -0.447 -1 -1
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = -0.447f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                )
                // V 5
                verticalLineTo(y = 5.0f)
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
                // v 26z
                verticalLineToRelative(dy = 26.0f)
                close()
            }
            // M15 6 c0 0.552 -0.448 1 -1 1 h-4 c-0.552 0 -1 -0.448 -1 -1 s0.448 -1 1 -1 h4 c0.552 0 1 0.448 1 1z M15 18 c0 0.553 -0.448 1 -1 1 h-4 c-0.552 0 -1 -0.447 -1 -1 0 -0.552 0.448 -1 1 -1 h4 c0.552 0 1 0.448 1 1z M15 30 c0 0.553 -0.448 1 -1 1 h-4 c-0.552 0 -1 -0.447 -1 -1 0 -0.553 0.448 -1 1 -1 h4 c0.552 0 1 0.447 1 1z M27 6 c0 0.552 -0.447 1 -1 1 h-4 c-0.553 0 -1 -0.448 -1 -1 s0.447 -1 1 -1 h4 c0.553 0 1 0.448 1 1z M27 18 c0 0.553 -0.447 1 -1 1 h-4 c-0.553 0 -1 -0.447 -1 -1 0 -0.552 0.447 -1 1 -1 h4 c0.553 0 1 0.448 1 1z M27 30 c0 0.553 -0.447 1 -1 1 h-4 c-0.553 0 -1 -0.447 -1 -1 0 -0.553 0.447 -1 1 -1 h4 c0.553 0 1 0.447 1 1z M15 24.106 c0 0.494 -0.4 0.894 -0.893 0.894 h-2.214 c-0.493 0 -0.893 -0.4 -0.893 -0.894 v-0.213 c0 -0.493 0.4 -0.893 0.893 -0.893 h2.214 c0.493 0 0.893 0.4 0.893 0.894 v0.212z M25 24.106 c0 0.494 -0.4 0.894 -0.893 0.894 h-2.215 c-0.492 0 -0.892 -0.4 -0.892 -0.894 v-0.213 c0 -0.493 0.4 -0.893 0.893 -0.893 h2.215 c0.492 0 0.892 0.4 0.892 0.894 v0.212z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 15 6
                moveTo(x = 15.0f, y = 6.0f)
                // c 0 0.552 -0.448 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = -0.448f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // c -0.552 0 -1 -0.448 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.448f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // s 0.448 -1 1 -1
                reflectiveCurveToRelative(
                    dx1 = 0.448f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // c 0.552 0 1 0.448 1 1z
                curveToRelative(
                    dx1 = 0.552f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.448f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                close()
                // M 15 18
                moveTo(x = 15.0f, y = 18.0f)
                // c 0 0.553 -0.448 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.448f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // c -0.552 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // c 0 -0.552 0.448 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = 0.448f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // c 0.552 0 1 0.448 1 1z
                curveToRelative(
                    dx1 = 0.552f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.448f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                close()
                // M 15 30
                moveTo(x = 15.0f, y = 30.0f)
                // c 0 0.553 -0.448 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.448f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // c -0.552 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // c 0 -0.553 0.448 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.553f,
                    dx2 = 0.448f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // c 0.552 0 1 0.447 1 1z
                curveToRelative(
                    dx1 = 0.552f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.447f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                close()
                // M 27 6
                moveTo(x = 27.0f, y = 6.0f)
                // c 0 0.552 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // c -0.553 0 -1 -0.448 -1 -1
                curveToRelative(
                    dx1 = -0.553f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.448f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // s 0.447 -1 1 -1
                reflectiveCurveToRelative(
                    dx1 = 0.447f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // c 0.553 0 1 0.448 1 1z
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.448f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                close()
                // M 27 18
                moveTo(x = 27.0f, y = 18.0f)
                // c 0 0.553 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // c -0.553 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.553f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // c 0 -0.552 0.447 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = 0.447f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // c 0.553 0 1 0.448 1 1z
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.448f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                close()
                // M 27 30
                moveTo(x = 27.0f, y = 30.0f)
                // c 0 0.553 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // c -0.553 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.553f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // c 0 -0.553 0.447 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.553f,
                    dx2 = 0.447f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // c 0.553 0 1 0.447 1 1z
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.447f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                close()
                // M 15 24.106
                moveTo(x = 15.0f, y = 24.106f)
                // c 0 0.494 -0.4 0.894 -0.893 0.894
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.494f,
                    dx2 = -0.4f,
                    dy2 = 0.894f,
                    dx3 = -0.893f,
                    dy3 = 0.894f,
                )
                // h -2.214
                horizontalLineToRelative(dx = -2.214f)
                // c -0.493 0 -0.893 -0.4 -0.893 -0.894
                curveToRelative(
                    dx1 = -0.493f,
                    dy1 = 0.0f,
                    dx2 = -0.893f,
                    dy2 = -0.4f,
                    dx3 = -0.893f,
                    dy3 = -0.894f,
                )
                // v -0.213
                verticalLineToRelative(dy = -0.213f)
                // c 0 -0.493 0.4 -0.893 0.893 -0.893
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.493f,
                    dx2 = 0.4f,
                    dy2 = -0.893f,
                    dx3 = 0.893f,
                    dy3 = -0.893f,
                )
                // h 2.214
                horizontalLineToRelative(dx = 2.214f)
                // c 0.493 0 0.893 0.4 0.893 0.894
                curveToRelative(
                    dx1 = 0.493f,
                    dy1 = 0.0f,
                    dx2 = 0.893f,
                    dy2 = 0.4f,
                    dx3 = 0.893f,
                    dy3 = 0.894f,
                )
                // v 0.212z
                verticalLineToRelative(dy = 0.212f)
                close()
                // M 25 24.106
                moveTo(x = 25.0f, y = 24.106f)
                // c 0 0.494 -0.4 0.894 -0.893 0.894
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.494f,
                    dx2 = -0.4f,
                    dy2 = 0.894f,
                    dx3 = -0.893f,
                    dy3 = 0.894f,
                )
                // h -2.215
                horizontalLineToRelative(dx = -2.215f)
                // c -0.492 0 -0.892 -0.4 -0.892 -0.894
                curveToRelative(
                    dx1 = -0.492f,
                    dy1 = 0.0f,
                    dx2 = -0.892f,
                    dy2 = -0.4f,
                    dx3 = -0.892f,
                    dy3 = -0.894f,
                )
                // v -0.213
                verticalLineToRelative(dy = -0.213f)
                // c 0 -0.493 0.4 -0.893 0.893 -0.893
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.493f,
                    dx2 = 0.4f,
                    dy2 = -0.893f,
                    dx3 = 0.893f,
                    dy3 = -0.893f,
                )
                // h 2.215
                horizontalLineToRelative(dx = 2.215f)
                // c 0.492 0 0.892 0.4 0.892 0.894
                curveToRelative(
                    dx1 = 0.492f,
                    dy1 = 0.0f,
                    dx2 = 0.892f,
                    dy2 = 0.4f,
                    dx3 = 0.892f,
                    dy3 = 0.894f,
                )
                // v 0.212z
                verticalLineToRelative(dy = 0.212f)
                close()
            }
            // M25 13 c0 1.104 -0.896 2 -2 2 H13 c-1.104 0 -2 -0.896 -2 -2 v-2 c0 -1.104 0.896 -2 2 -2 h10 c1.104 0 2 0.896 2 2 v2z
            path(
                fill = SolidColor(Color(0xFF226699)),
            ) {
                // M 25 13
                moveTo(x = 25.0f, y = 13.0f)
                // c 0 1.104 -0.896 2 -2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = -0.896f,
                    dy2 = 2.0f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // H 13
                horizontalLineTo(x = 13.0f)
                // c -1.104 0 -2 -0.896 -2 -2
                curveToRelative(
                    dx1 = -1.104f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -0.896f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // c 0 -1.104 0.896 -2 2 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.104f,
                    dx2 = 0.896f,
                    dy2 = -2.0f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // c 1.104 0 2 0.896 2 2
                curveToRelative(
                    dx1 = 1.104f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 0.896f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                // v 2z
                verticalLineToRelative(dy = 2.0f)
                close()
            }
        }.build().also { _emoji1f39a = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f39a: ImageVector? = null
