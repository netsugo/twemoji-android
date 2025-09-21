package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f68f: ImageVector
    get() {
        val current = _emoji1f68f
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f68f",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M14 7 h2 v29 h-2z
            path(
                fill = SolidColor(Color(0xFF6D6E71)),
            ) {
                // M 14 7
                moveTo(x = 14.0f, y = 7.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 29
                verticalLineToRelative(dy = 29.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // M15 19 h3 v2 h-3z M15 13 h3 v2 h-3z
            path(
                fill = SolidColor(Color(0xFF6D6E71)),
            ) {
                // M 15 19
                moveTo(x = 15.0f, y = 19.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -3z
                horizontalLineToRelative(dx = -3.0f)
                close()
                // M 15 13
                moveTo(x = 15.0f, y = 13.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -3z
                horizontalLineToRelative(dx = -3.0f)
                close()
            }
            // M29 24 c0 0.553 -0.447 1 -1 1 h-9 c-0.553 0 -1 -0.447 -1 -1 V10 c0 -0.552 0.447 -1 1 -1 h9 c0.553 0 1 0.448 1 1 v14z
            path(
                fill = SolidColor(Color(0xFFBCBEC0)),
            ) {
                // M 29 24
                moveTo(x = 29.0f, y = 24.0f)
                // c 0 0.553 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // h -9
                horizontalLineToRelative(dx = -9.0f)
                // c -0.553 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.553f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // V 10
                verticalLineTo(y = 10.0f)
                // c 0 -0.552 0.447 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = 0.447f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 9
                horizontalLineToRelative(dx = 9.0f)
                // c 0.553 0 1 0.448 1 1
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.448f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // v 14z
                verticalLineToRelative(dy = 14.0f)
                close()
            }
            // M29 13 v-3 c0 -0.552 -0.447 -1 -1 -1 h-9 c-0.553 0 -1 0.448 -1 1 v3 h11z
            path(
                fill = SolidColor(Color(0xFFBE1931)),
            ) {
                // M 29 13
                moveTo(x = 29.0f, y = 13.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // c 0 -0.552 -0.447 -1 -1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = -0.447f,
                    dy2 = -1.0f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // h -9
                horizontalLineToRelative(dx = -9.0f)
                // c -0.553 0 -1 0.448 -1 1
                curveToRelative(
                    dx1 = -0.553f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = 0.448f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h 11z
                horizontalLineToRelative(dx = 11.0f)
                close()
            }
            // M21 34 L9 34 l-1 1 v1 h14 v-1z M19 32 h-8 l-1 1 v1 h10 v-1z
            path(
                fill = SolidColor(Color(0xFF6D6E71)),
            ) {
                // M 21 34
                moveTo(x = 21.0f, y = 34.0f)
                // L 9 34
                lineTo(x = 9.0f, y = 34.0f)
                // l -1 1
                lineToRelative(dx = -1.0f, dy = 1.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // v -1z
                verticalLineToRelative(dy = -1.0f)
                close()
                // M 19 32
                moveTo(x = 19.0f, y = 32.0f)
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // l -1 1
                lineToRelative(dx = -1.0f, dy = 1.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // v -1z
                verticalLineToRelative(dy = -1.0f)
                close()
            }
            // M15 4 m-4 0 a4 4 0 1 1 8 0 a4 4 0 1 1 -8 0
            path(
                fill = SolidColor(Color(0xFFBE1931)),
            ) {
                // M 15 4
                moveTo(x = 15.0f, y = 4.0f)
                // m -4 0
                moveToRelative(dx = -4.0f, dy = 0.0f)
                // a 4 4 0 1 1 8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 8.0f,
                    dy1 = 0.0f,
                )
                // a 4 4 0 1 1 -8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -8.0f,
                    dy1 = 0.0f,
                )
            }
            // M20 13 h3 v3 h-3z
            path(
                fill = SolidColor(Color(0xFF808285)),
            ) {
                // M 20 13
                moveTo(x = 20.0f, y = 13.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h -3z
                horizontalLineToRelative(dx = -3.0f)
                close()
            }
            // M20 17 h3 v3 h-3z M20 21 h3 v3 h-3z
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 20 17
                moveTo(x = 20.0f, y = 17.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h -3z
                horizontalLineToRelative(dx = -3.0f)
                close()
                // M 20 21
                moveTo(x = 20.0f, y = 21.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h -3z
                horizontalLineToRelative(dx = -3.0f)
                close()
            }
            // M24 13 h3 v3 h-3z M24 17 h3 v3 h-3z
            path(
                fill = SolidColor(Color(0xFF808285)),
            ) {
                // M 24 13
                moveTo(x = 24.0f, y = 13.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h -3z
                horizontalLineToRelative(dx = -3.0f)
                close()
                // M 24 17
                moveTo(x = 24.0f, y = 17.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h -3z
                horizontalLineToRelative(dx = -3.0f)
                close()
            }
            // M24 21 h3 v3 h-3z
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 24 21
                moveTo(x = 24.0f, y = 21.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h -3z
                horizontalLineToRelative(dx = -3.0f)
                close()
            }
            // M13 2 h4 v4 h-4z M20 10 h7 v2 h-7z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 13 2
                moveTo(x = 13.0f, y = 2.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
                // M 20 10
                moveTo(x = 20.0f, y = 10.0f)
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -7z
                horizontalLineToRelative(dx = -7.0f)
                close()
            }
        }.build().also { _emoji1f68f = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f68f: ImageVector? = null
