package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji26ea: ImageVector
    get() {
        val current = _emoji26ea
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji26ea",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M20 2 h-1 V1 c0 -0.552 -0.447 -1 -1 -1 s-1 0.448 -1 1 v1 h-1 c-0.553 0 -1 0.448 -1 1 s0.447 1 1 1 h1 v6 c0 0.552 0.447 1 1 1 s1 -0.448 1 -1 V4 h1 c0.553 0 1 -0.448 1 -1 s-0.447 -1 -1 -1z
            path(
                fill = SolidColor(Color(0xFFBCBEC0)),
            ) {
                // M 20 2
                moveTo(x = 20.0f, y = 2.0f)
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // V 1
                verticalLineTo(y = 1.0f)
                // c 0 -0.552 -0.447 -1 -1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = -0.447f,
                    dy2 = -1.0f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // s -1 0.448 -1 1
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.448f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // c -0.553 0 -1 0.448 -1 1
                curveToRelative(
                    dx1 = -0.553f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = 0.448f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // s 0.447 1 1 1
                reflectiveCurveToRelative(
                    dx1 = 0.447f,
                    dy1 = 1.0f,
                    dx2 = 1.0f,
                    dy2 = 1.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // c 0 0.552 0.447 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = 0.447f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // s 1 -0.448 1 -1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = -0.448f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // c 0.553 0 1 -0.448 1 -1
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -0.448f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // s -0.447 -1 -1 -1z
                reflectiveCurveToRelative(
                    dx1 = -0.447f,
                    dy1 = -1.0f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                )
                close()
            }
            // M18 9 l-5.143 4 H13 v9 h10 v-9 h0.143z
            path(
                fill = SolidColor(Color(0xFFFFD983)),
            ) {
                // M 18 9
                moveTo(x = 18.0f, y = 9.0f)
                // l -5.143 4
                lineToRelative(dx = -5.143f, dy = 4.0f)
                // H 13
                horizontalLineTo(x = 13.0f)
                // v 9
                verticalLineToRelative(dy = 9.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // v -9
                verticalLineToRelative(dy = -9.0f)
                // h 0.143z
                horizontalLineToRelative(dx = 0.143f)
                close()
            }
            // M19.999 15 c0 -1.104 -0.896 -2 -1.999 -2 -1.105 0 -2 0.896 -2 2 v7 h4 l-0.001 -7z
            path(
                fill = SolidColor(Color(0xFF662113)),
            ) {
                // M 19.999 15
                moveTo(x = 19.999f, y = 15.0f)
                // c 0 -1.104 -0.896 -2 -1.999 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.104f,
                    dx2 = -0.896f,
                    dy2 = -2.0f,
                    dx3 = -1.999f,
                    dy3 = -2.0f,
                )
                // c -1.105 0 -2 0.896 -2 2
                curveToRelative(
                    dx1 = -1.105f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = 0.896f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // l -0.001 -7z
                lineToRelative(dx = -0.001f, dy = -7.0f)
                close()
            }
            // M17.999 18 L4 26 v9 c0 0.553 0.448 1 1 1 h26 c0.553 0 1 -0.447 1 -1 v-9 l-14.001 -8z
            path(
                fill = SolidColor(Color(0xFFFFD983)),
            ) {
                // M 17.999 18
                moveTo(x = 17.999f, y = 18.0f)
                // L 4 26
                lineTo(x = 4.0f, y = 26.0f)
                // v 9
                verticalLineToRelative(dy = 9.0f)
                // c 0 0.553 0.448 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = 0.448f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // h 26
                horizontalLineToRelative(dx = 26.0f)
                // c 0.553 0 1 -0.447 1 -1
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -0.447f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // v -9
                verticalLineToRelative(dy = -9.0f)
                // l -14.001 -8z
                lineToRelative(dx = -14.001f, dy = -8.0f)
                close()
            }
            // M31.998 27 c-0.168 0 -0.339 -0.042 -0.495 -0.132 l-13.504 -7.717 -13.504 7.717 c-0.478 0.276 -1.09 0.107 -1.364 -0.372 s-0.107 -1.09 0.372 -1.364 l14 -8 c0.308 -0.176 0.685 -0.176 0.992 0 l14 8 c0.48 0.274 0.647 0.885 0.372 1.364 -0.184 0.323 -0.521 0.504 -0.869 0.504z M22.999 14 c-0.219 0 -0.439 -0.072 -0.624 -0.219 l-4.376 -3.5 -4.374 3.5 c-0.432 0.343 -1.061 0.275 -1.406 -0.156 -0.345 -0.432 -0.275 -1.061 0.156 -1.406 l4.999 -4 c0.365 -0.292 0.884 -0.292 1.25 0 l5.001 4 c0.431 0.345 0.501 0.974 0.156 1.405 -0.198 0.247 -0.488 0.376 -0.782 0.376z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 31.998 27
                moveTo(x = 31.998f, y = 27.0f)
                // c -0.168 0 -0.339 -0.042 -0.495 -0.132
                curveToRelative(
                    dx1 = -0.168f,
                    dy1 = 0.0f,
                    dx2 = -0.339f,
                    dy2 = -0.042f,
                    dx3 = -0.495f,
                    dy3 = -0.132f,
                )
                // l -13.504 -7.717
                lineToRelative(dx = -13.504f, dy = -7.717f)
                // l -13.504 7.717
                lineToRelative(dx = -13.504f, dy = 7.717f)
                // c -0.478 0.276 -1.09 0.107 -1.364 -0.372
                curveToRelative(
                    dx1 = -0.478f,
                    dy1 = 0.276f,
                    dx2 = -1.09f,
                    dy2 = 0.107f,
                    dx3 = -1.364f,
                    dy3 = -0.372f,
                )
                // s -0.107 -1.09 0.372 -1.364
                reflectiveCurveToRelative(
                    dx1 = -0.107f,
                    dy1 = -1.09f,
                    dx2 = 0.372f,
                    dy2 = -1.364f,
                )
                // l 14 -8
                lineToRelative(dx = 14.0f, dy = -8.0f)
                // c 0.308 -0.176 0.685 -0.176 0.992 0
                curveToRelative(
                    dx1 = 0.308f,
                    dy1 = -0.176f,
                    dx2 = 0.685f,
                    dy2 = -0.176f,
                    dx3 = 0.992f,
                    dy3 = 0.0f,
                )
                // l 14 8
                lineToRelative(dx = 14.0f, dy = 8.0f)
                // c 0.48 0.274 0.647 0.885 0.372 1.364
                curveToRelative(
                    dx1 = 0.48f,
                    dy1 = 0.274f,
                    dx2 = 0.647f,
                    dy2 = 0.885f,
                    dx3 = 0.372f,
                    dy3 = 1.364f,
                )
                // c -0.184 0.323 -0.521 0.504 -0.869 0.504z
                curveToRelative(
                    dx1 = -0.184f,
                    dy1 = 0.323f,
                    dx2 = -0.521f,
                    dy2 = 0.504f,
                    dx3 = -0.869f,
                    dy3 = 0.504f,
                )
                close()
                // M 22.999 14
                moveTo(x = 22.999f, y = 14.0f)
                // c -0.219 0 -0.439 -0.072 -0.624 -0.219
                curveToRelative(
                    dx1 = -0.219f,
                    dy1 = 0.0f,
                    dx2 = -0.439f,
                    dy2 = -0.072f,
                    dx3 = -0.624f,
                    dy3 = -0.219f,
                )
                // l -4.376 -3.5
                lineToRelative(dx = -4.376f, dy = -3.5f)
                // l -4.374 3.5
                lineToRelative(dx = -4.374f, dy = 3.5f)
                // c -0.432 0.343 -1.061 0.275 -1.406 -0.156
                curveToRelative(
                    dx1 = -0.432f,
                    dy1 = 0.343f,
                    dx2 = -1.061f,
                    dy2 = 0.275f,
                    dx3 = -1.406f,
                    dy3 = -0.156f,
                )
                // c -0.345 -0.432 -0.275 -1.061 0.156 -1.406
                curveToRelative(
                    dx1 = -0.345f,
                    dy1 = -0.432f,
                    dx2 = -0.275f,
                    dy2 = -1.061f,
                    dx3 = 0.156f,
                    dy3 = -1.406f,
                )
                // l 4.999 -4
                lineToRelative(dx = 4.999f, dy = -4.0f)
                // c 0.365 -0.292 0.884 -0.292 1.25 0
                curveToRelative(
                    dx1 = 0.365f,
                    dy1 = -0.292f,
                    dx2 = 0.884f,
                    dy2 = -0.292f,
                    dx3 = 1.25f,
                    dy3 = 0.0f,
                )
                // l 5.001 4
                lineToRelative(dx = 5.001f, dy = 4.0f)
                // c 0.431 0.345 0.501 0.974 0.156 1.405
                curveToRelative(
                    dx1 = 0.431f,
                    dy1 = 0.345f,
                    dx2 = 0.501f,
                    dy2 = 0.974f,
                    dx3 = 0.156f,
                    dy3 = 1.405f,
                )
                // c -0.198 0.247 -0.488 0.376 -0.782 0.376z
                curveToRelative(
                    dx1 = -0.198f,
                    dy1 = 0.247f,
                    dx2 = -0.488f,
                    dy2 = 0.376f,
                    dx3 = -0.782f,
                    dy3 = 0.376f,
                )
                close()
            }
            // M12.999 31 c0 -1.104 -0.895 -2 -1.999 -2 -1.105 0 -2 0.896 -2 2 v5 h4 v-5 h-0.001z M19.999 29 c0 -1.104 -0.896 -2 -1.999 -2 -1.105 0 -2 0.896 -2 2 v7 h4 l-0.001 -7z M26.999 31 c0 -1.104 -0.896 -2 -1.999 -2 -1.105 0 -2 0.896 -2 2 v5 h4 l-0.001 -5z
            path(
                fill = SolidColor(Color(0xFF662113)),
            ) {
                // M 12.999 31
                moveTo(x = 12.999f, y = 31.0f)
                // c 0 -1.104 -0.895 -2 -1.999 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.104f,
                    dx2 = -0.895f,
                    dy2 = -2.0f,
                    dx3 = -1.999f,
                    dy3 = -2.0f,
                )
                // c -1.105 0 -2 0.896 -2 2
                curveToRelative(
                    dx1 = -1.105f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = 0.896f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // h -0.001z
                horizontalLineToRelative(dx = -0.001f)
                close()
                // M 19.999 29
                moveTo(x = 19.999f, y = 29.0f)
                // c 0 -1.104 -0.896 -2 -1.999 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.104f,
                    dx2 = -0.896f,
                    dy2 = -2.0f,
                    dx3 = -1.999f,
                    dy3 = -2.0f,
                )
                // c -1.105 0 -2 0.896 -2 2
                curveToRelative(
                    dx1 = -1.105f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = 0.896f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // l -0.001 -7z
                lineToRelative(dx = -0.001f, dy = -7.0f)
                close()
                // M 26.999 31
                moveTo(x = 26.999f, y = 31.0f)
                // c 0 -1.104 -0.896 -2 -1.999 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.104f,
                    dx2 = -0.896f,
                    dy2 = -2.0f,
                    dx3 = -1.999f,
                    dy3 = -2.0f,
                )
                // c -1.105 0 -2 0.896 -2 2
                curveToRelative(
                    dx1 = -1.105f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = 0.896f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // l -0.001 -5z
                lineToRelative(dx = -0.001f, dy = -5.0f)
                close()
            }
        }.build().also { _emoji26ea = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji26ea: ImageVector? = null
