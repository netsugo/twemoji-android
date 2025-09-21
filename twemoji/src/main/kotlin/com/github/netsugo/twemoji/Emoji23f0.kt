package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji23f0: ImageVector
    get() {
        val current = _emoji23f0
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji23f0",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M20 6.042 c0 1.112 -0.903 2.014 -2 2.014 s-2 -0.902 -2 -2.014 V2.014 C16 0.901 16.903 0 18 0 s2 0.901 2 2.014 v4.028z
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 20 6.042
                moveTo(x = 20.0f, y = 6.042f)
                // c 0 1.112 -0.903 2.014 -2 2.014
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.112f,
                    dx2 = -0.903f,
                    dy2 = 2.014f,
                    dx3 = -2.0f,
                    dy3 = 2.014f,
                )
                // s -2 -0.902 -2 -2.014
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = -0.902f,
                    dx2 = -2.0f,
                    dy2 = -2.014f,
                )
                // V 2.014
                verticalLineTo(y = 2.014f)
                // C 16 0.901 16.903 0 18 0
                curveTo(
                    x1 = 16.0f,
                    y1 = 0.901f,
                    x2 = 16.903f,
                    y2 = 0.0f,
                    x3 = 18.0f,
                    y3 = 0.0f,
                )
                // s 2 0.901 2 2.014
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.901f,
                    dx2 = 2.0f,
                    dy2 = 2.014f,
                )
                // v 4.028z
                verticalLineToRelative(dy = 4.028f)
                close()
            }
            // M9.18 36 c-0.224 0 -0.452 -0.052 -0.666 -0.159 -0.736 -0.374 -1.035 -1.28 -0.667 -2.027 l8.94 -18.127 c0.252 -0.512 0.768 -0.835 1.333 -0.835 s1.081 0.323 1.333 0.835 l8.941 18.127 c0.368 0.747 0.07 1.653 -0.666 2.027 -0.736 0.372 -1.631 0.07 -1.999 -0.676 L18.121 19.74 l-7.607 15.425 c-0.262 0.529 -0.788 0.835 -1.334 0.835z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 9.18 36
                moveTo(x = 9.18f, y = 36.0f)
                // c -0.224 0 -0.452 -0.052 -0.666 -0.159
                curveToRelative(
                    dx1 = -0.224f,
                    dy1 = 0.0f,
                    dx2 = -0.452f,
                    dy2 = -0.052f,
                    dx3 = -0.666f,
                    dy3 = -0.159f,
                )
                // c -0.736 -0.374 -1.035 -1.28 -0.667 -2.027
                curveToRelative(
                    dx1 = -0.736f,
                    dy1 = -0.374f,
                    dx2 = -1.035f,
                    dy2 = -1.28f,
                    dx3 = -0.667f,
                    dy3 = -2.027f,
                )
                // l 8.94 -18.127
                lineToRelative(dx = 8.94f, dy = -18.127f)
                // c 0.252 -0.512 0.768 -0.835 1.333 -0.835
                curveToRelative(
                    dx1 = 0.252f,
                    dy1 = -0.512f,
                    dx2 = 0.768f,
                    dy2 = -0.835f,
                    dx3 = 1.333f,
                    dy3 = -0.835f,
                )
                // s 1.081 0.323 1.333 0.835
                reflectiveCurveToRelative(
                    dx1 = 1.081f,
                    dy1 = 0.323f,
                    dx2 = 1.333f,
                    dy2 = 0.835f,
                )
                // l 8.941 18.127
                lineToRelative(dx = 8.941f, dy = 18.127f)
                // c 0.368 0.747 0.07 1.653 -0.666 2.027
                curveToRelative(
                    dx1 = 0.368f,
                    dy1 = 0.747f,
                    dx2 = 0.07f,
                    dy2 = 1.653f,
                    dx3 = -0.666f,
                    dy3 = 2.027f,
                )
                // c -0.736 0.372 -1.631 0.07 -1.999 -0.676
                curveToRelative(
                    dx1 = -0.736f,
                    dy1 = 0.372f,
                    dx2 = -1.631f,
                    dy2 = 0.07f,
                    dx3 = -1.999f,
                    dy3 = -0.676f,
                )
                // L 18.121 19.74
                lineTo(x = 18.121f, y = 19.74f)
                // l -7.607 15.425
                lineToRelative(dx = -7.607f, dy = 15.425f)
                // c -0.262 0.529 -0.788 0.835 -1.334 0.835z
                curveToRelative(
                    dx1 = -0.262f,
                    dy1 = 0.529f,
                    dx2 = -0.788f,
                    dy2 = 0.835f,
                    dx3 = -1.334f,
                    dy3 = 0.835f,
                )
                close()
            }
            // M18.121 20.392 c-0.263 0 -0.516 -0.106 -0.702 -0.295 L3.512 5.998 c-0.388 -0.394 -0.388 -1.031 0 -1.424 s1.017 -0.393 1.404 0 L18.121 17.96 31.324 4.573 c0.389 -0.393 1.017 -0.393 1.405 0 0.388 0.394 0.388 1.031 0 1.424 l-13.905 14.1 c-0.187 0.188 -0.439 0.295 -0.703 0.295z
            path(
                fill = SolidColor(Color(0xFF58595B)),
            ) {
                // M 18.121 20.392
                moveTo(x = 18.121f, y = 20.392f)
                // c -0.263 0 -0.516 -0.106 -0.702 -0.295
                curveToRelative(
                    dx1 = -0.263f,
                    dy1 = 0.0f,
                    dx2 = -0.516f,
                    dy2 = -0.106f,
                    dx3 = -0.702f,
                    dy3 = -0.295f,
                )
                // L 3.512 5.998
                lineTo(x = 3.512f, y = 5.998f)
                // c -0.388 -0.394 -0.388 -1.031 0 -1.424
                curveToRelative(
                    dx1 = -0.388f,
                    dy1 = -0.394f,
                    dx2 = -0.388f,
                    dy2 = -1.031f,
                    dx3 = 0.0f,
                    dy3 = -1.424f,
                )
                // s 1.017 -0.393 1.404 0
                reflectiveCurveToRelative(
                    dx1 = 1.017f,
                    dy1 = -0.393f,
                    dx2 = 1.404f,
                    dy2 = 0.0f,
                )
                // L 18.121 17.96
                lineTo(x = 18.121f, y = 17.96f)
                // L 31.324 4.573
                lineTo(x = 31.324f, y = 4.573f)
                // c 0.389 -0.393 1.017 -0.393 1.405 0
                curveToRelative(
                    dx1 = 0.389f,
                    dy1 = -0.393f,
                    dx2 = 1.017f,
                    dy2 = -0.393f,
                    dx3 = 1.405f,
                    dy3 = 0.0f,
                )
                // c 0.388 0.394 0.388 1.031 0 1.424
                curveToRelative(
                    dx1 = 0.388f,
                    dy1 = 0.394f,
                    dx2 = 0.388f,
                    dy2 = 1.031f,
                    dx3 = 0.0f,
                    dy3 = 1.424f,
                )
                // l -13.905 14.1
                lineToRelative(dx = -13.905f, dy = 14.1f)
                // c -0.187 0.188 -0.439 0.295 -0.703 0.295z
                curveToRelative(
                    dx1 = -0.187f,
                    dy1 = 0.188f,
                    dx2 = -0.439f,
                    dy2 = 0.295f,
                    dx3 = -0.703f,
                    dy3 = 0.295f,
                )
                close()
            }
            // M34.015 19.385 c0 8.898 -7.115 16.111 -15.894 16.111 -8.777 0 -15.893 -7.213 -15.893 -16.111 0 -8.9 7.116 -16.113 15.893 -16.113 8.778 -0.001 15.894 7.213 15.894 16.113z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 34.015 19.385
                moveTo(x = 34.015f, y = 19.385f)
                // c 0 8.898 -7.115 16.111 -15.894 16.111
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 8.898f,
                    dx2 = -7.115f,
                    dy2 = 16.111f,
                    dx3 = -15.894f,
                    dy3 = 16.111f,
                )
                // c -8.777 0 -15.893 -7.213 -15.893 -16.111
                curveToRelative(
                    dx1 = -8.777f,
                    dy1 = 0.0f,
                    dx2 = -15.893f,
                    dy2 = -7.213f,
                    dx3 = -15.893f,
                    dy3 = -16.111f,
                )
                // c 0 -8.9 7.116 -16.113 15.893 -16.113
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -8.9f,
                    dx2 = 7.116f,
                    dy2 = -16.113f,
                    dx3 = 15.893f,
                    dy3 = -16.113f,
                )
                // c 8.778 -0.001 15.894 7.213 15.894 16.113z
                curveToRelative(
                    dx1 = 8.778f,
                    dy1 = -0.001f,
                    dx2 = 15.894f,
                    dy2 = 7.213f,
                    dx3 = 15.894f,
                    dy3 = 16.113f,
                )
                close()
            }
            // M30.041 19.385 c0 6.674 -5.335 12.084 -11.92 12.084 -6.583 0 -11.919 -5.41 -11.919 -12.084 C6.202 12.71 11.538 7.3 18.121 7.3 c6.585 -0.001 11.92 5.41 11.92 12.085z
            path(
                fill = SolidColor(Color(0xFFE6E7E8)),
            ) {
                // M 30.041 19.385
                moveTo(x = 30.041f, y = 19.385f)
                // c 0 6.674 -5.335 12.084 -11.92 12.084
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 6.674f,
                    dx2 = -5.335f,
                    dy2 = 12.084f,
                    dx3 = -11.92f,
                    dy3 = 12.084f,
                )
                // c -6.583 0 -11.919 -5.41 -11.919 -12.084
                curveToRelative(
                    dx1 = -6.583f,
                    dy1 = 0.0f,
                    dx2 = -11.919f,
                    dy2 = -5.41f,
                    dx3 = -11.919f,
                    dy3 = -12.084f,
                )
                // C 6.202 12.71 11.538 7.3 18.121 7.3
                curveTo(
                    x1 = 6.202f,
                    y1 = 12.71f,
                    x2 = 11.538f,
                    y2 = 7.3f,
                    x3 = 18.121f,
                    y3 = 7.3f,
                )
                // c 6.585 -0.001 11.92 5.41 11.92 12.085z
                curveToRelative(
                    dx1 = 6.585f,
                    dy1 = -0.001f,
                    dx2 = 11.92f,
                    dy2 = 5.41f,
                    dx3 = 11.92f,
                    dy3 = 12.085f,
                )
                close()
            }
            // M30.04 1.257 c-1.646 0 -3.135 0.676 -4.214 1.77 l8.429 8.544 C35.333 10.478 36 8.968 36 7.299 c0 -3.336 -2.669 -6.042 -5.96 -6.042z M5.96 1.257 c1.645 0 3.135 0.676 4.214 1.77 l-8.429 8.544 C0.667 10.478 0 8.968 0 7.299 c0 -3.336 2.668 -6.042 5.96 -6.042z
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 30.04 1.257
                moveTo(x = 30.04f, y = 1.257f)
                // c -1.646 0 -3.135 0.676 -4.214 1.77
                curveToRelative(
                    dx1 = -1.646f,
                    dy1 = 0.0f,
                    dx2 = -3.135f,
                    dy2 = 0.676f,
                    dx3 = -4.214f,
                    dy3 = 1.77f,
                )
                // l 8.429 8.544
                lineToRelative(dx = 8.429f, dy = 8.544f)
                // C 35.333 10.478 36 8.968 36 7.299
                curveTo(
                    x1 = 35.333f,
                    y1 = 10.478f,
                    x2 = 36.0f,
                    y2 = 8.968f,
                    x3 = 36.0f,
                    y3 = 7.299f,
                )
                // c 0 -3.336 -2.669 -6.042 -5.96 -6.042z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.336f,
                    dx2 = -2.669f,
                    dy2 = -6.042f,
                    dx3 = -5.96f,
                    dy3 = -6.042f,
                )
                close()
                // M 5.96 1.257
                moveTo(x = 5.96f, y = 1.257f)
                // c 1.645 0 3.135 0.676 4.214 1.77
                curveToRelative(
                    dx1 = 1.645f,
                    dy1 = 0.0f,
                    dx2 = 3.135f,
                    dy2 = 0.676f,
                    dx3 = 4.214f,
                    dy3 = 1.77f,
                )
                // l -8.429 8.544
                lineToRelative(dx = -8.429f, dy = 8.544f)
                // C 0.667 10.478 0 8.968 0 7.299
                curveTo(
                    x1 = 0.667f,
                    y1 = 10.478f,
                    x2 = 0.0f,
                    y2 = 8.968f,
                    x3 = 0.0f,
                    y3 = 7.299f,
                )
                // c 0 -3.336 2.668 -6.042 5.96 -6.042z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.336f,
                    dx2 = 2.668f,
                    dy2 = -6.042f,
                    dx3 = 5.96f,
                    dy3 = -6.042f,
                )
                close()
            }
            // M23 20 h-5 c-0.552 0 -1 -0.447 -1 -1 v-9 c0 -0.552 0.448 -1 1 -1 s1 0.448 1 1 v8 h4 c0.553 0 1 0.448 1 1 0 0.553 -0.447 1 -1 1z
            path(
                fill = SolidColor(Color(0xFF414042)),
            ) {
                // M 23 20
                moveTo(x = 23.0f, y = 20.0f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // c -0.552 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // v -9
                verticalLineToRelative(dy = -9.0f)
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
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // c 0.553 0 1 0.448 1 1
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.448f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
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
        }.build().also { _emoji23f0 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji23f0: ImageVector? = null
