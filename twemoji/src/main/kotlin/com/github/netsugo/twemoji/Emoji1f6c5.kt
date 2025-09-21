package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f6c5: ImageVector
    get() {
        val current = _emoji1f6c5
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f6c5",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 32 c0 2.209 -1.791 4 -4 4 H4 c-2.209 0 -4 -1.791 -4 -4 V4 c0 -2.209 1.791 -4 4 -4 h28 c2.209 0 4 1.791 4 4 v28z
            path(
                fill = SolidColor(Color(0xFF226699)),
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
            // M26 17 h-1 v13 h1 c1.104 0 2 -0.896 2 -2 v-9 c0 -1.104 -0.896 -2 -2 -2z M10 17 c-1.104 0 -2 0.896 -2 2 v9 c0 1.104 0.896 2 2 2 h1 L11 17 h-1z M22 17 v-2 c0 -1.104 -0.896 -2 -2 -2 h-4 c-1.104 0 -2 0.896 -2 2 v2 h-1 v13 h10 L23 17 h-1z M16 16 c0 -0.553 0.448 -1 1 -1 h2 c0.553 0 1 0.447 1 1 v1 h-4 v-1z
            path(
                fill = SolidColor(Color(0xFFF5F8FA)),
            ) {
                // M 26 17
                moveTo(x = 26.0f, y = 17.0f)
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // v 13
                verticalLineToRelative(dy = 13.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // c 1.104 0 2 -0.896 2 -2
                curveToRelative(
                    dx1 = 1.104f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = -0.896f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // v -9
                verticalLineToRelative(dy = -9.0f)
                // c 0 -1.104 -0.896 -2 -2 -2z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.104f,
                    dx2 = -0.896f,
                    dy2 = -2.0f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                close()
                // M 10 17
                moveTo(x = 10.0f, y = 17.0f)
                // c -1.104 0 -2 0.896 -2 2
                curveToRelative(
                    dx1 = -1.104f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = 0.896f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // v 9
                verticalLineToRelative(dy = 9.0f)
                // c 0 1.104 0.896 2 2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = 0.896f,
                    dy2 = 2.0f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // L 11 17
                lineTo(x = 11.0f, y = 17.0f)
                // h -1z
                horizontalLineToRelative(dx = -1.0f)
                close()
                // M 22 17
                moveTo(x = 22.0f, y = 17.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // c 0 -1.104 -0.896 -2 -2 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.104f,
                    dx2 = -0.896f,
                    dy2 = -2.0f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // c -1.104 0 -2 0.896 -2 2
                curveToRelative(
                    dx1 = -1.104f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = 0.896f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // v 13
                verticalLineToRelative(dy = 13.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // L 23 17
                lineTo(x = 23.0f, y = 17.0f)
                // h -1z
                horizontalLineToRelative(dx = -1.0f)
                close()
                // M 16 16
                moveTo(x = 16.0f, y = 16.0f)
                // c 0 -0.553 0.448 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.553f,
                    dx2 = 0.448f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // c 0.553 0 1 0.447 1 1
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.447f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v -1z
                verticalLineToRelative(dy = -1.0f)
                close()
            }
            // M32 10 L4 10 c-1.104 0 -2 0.896 -2 2 v20 c0 1.104 0.896 2 2 2 h28 c1.104 0 2 -0.896 2 -2 L34 12 c0 -1.104 -0.896 -2 -2 -2z M32 31 c0 0.553 -0.447 1 -1 1 L5 32 c-0.552 0 -1 -0.447 -1 -1 L4 13 c0 -0.553 0.448 -1 1 -1 h26 c0.553 0 1 0.447 1 1 v18z M24 4 h-6.35 c-0.563 -1.179 -1.756 -2 -3.15 -2 C12.567 2 11 3.567 11 5.5 S12.567 9 14.5 9 c1.762 0 3.205 -1.306 3.45 -3 h1.719 c0.247 0.926 0.747 2 1.331 2 s1.084 -1.074 1.331 -2 L23 6 c0 1.104 0.448 2 1 2 s1 -1 1 -3 c0 -1.105 -0.448 -1 -1 -1z M13.5 7 c-0.829 0 -1.5 -0.671 -1.5 -1.5 S12.671 4 13.5 4 s1.5 0.671 1.5 1.5 S14.329 7 13.5 7z
            path(
                fill = SolidColor(Color(0xFFF5F8FA)),
            ) {
                // M 32 10
                moveTo(x = 32.0f, y = 10.0f)
                // L 4 10
                lineTo(x = 4.0f, y = 10.0f)
                // c -1.104 0 -2 0.896 -2 2
                curveToRelative(
                    dx1 = -1.104f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = 0.896f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // v 20
                verticalLineToRelative(dy = 20.0f)
                // c 0 1.104 0.896 2 2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = 0.896f,
                    dy2 = 2.0f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // c 1.104 0 2 -0.896 2 -2
                curveToRelative(
                    dx1 = 1.104f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = -0.896f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // L 34 12
                lineTo(x = 34.0f, y = 12.0f)
                // c 0 -1.104 -0.896 -2 -2 -2z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.104f,
                    dx2 = -0.896f,
                    dy2 = -2.0f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                close()
                // M 32 31
                moveTo(x = 32.0f, y = 31.0f)
                // c 0 0.553 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // L 5 32
                lineTo(x = 5.0f, y = 32.0f)
                // c -0.552 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // L 4 13
                lineTo(x = 4.0f, y = 13.0f)
                // c 0 -0.553 0.448 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.553f,
                    dx2 = 0.448f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 26
                horizontalLineToRelative(dx = 26.0f)
                // c 0.553 0 1 0.447 1 1
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.447f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // v 18z
                verticalLineToRelative(dy = 18.0f)
                close()
                // M 24 4
                moveTo(x = 24.0f, y = 4.0f)
                // h -6.35
                horizontalLineToRelative(dx = -6.35f)
                // c -0.563 -1.179 -1.756 -2 -3.15 -2
                curveToRelative(
                    dx1 = -0.563f,
                    dy1 = -1.179f,
                    dx2 = -1.756f,
                    dy2 = -2.0f,
                    dx3 = -3.15f,
                    dy3 = -2.0f,
                )
                // C 12.567 2 11 3.567 11 5.5
                curveTo(
                    x1 = 12.567f,
                    y1 = 2.0f,
                    x2 = 11.0f,
                    y2 = 3.567f,
                    x3 = 11.0f,
                    y3 = 5.5f,
                )
                // S 12.567 9 14.5 9
                reflectiveCurveTo(
                    x1 = 12.567f,
                    y1 = 9.0f,
                    x2 = 14.5f,
                    y2 = 9.0f,
                )
                // c 1.762 0 3.205 -1.306 3.45 -3
                curveToRelative(
                    dx1 = 1.762f,
                    dy1 = 0.0f,
                    dx2 = 3.205f,
                    dy2 = -1.306f,
                    dx3 = 3.45f,
                    dy3 = -3.0f,
                )
                // h 1.719
                horizontalLineToRelative(dx = 1.719f)
                // c 0.247 0.926 0.747 2 1.331 2
                curveToRelative(
                    dx1 = 0.247f,
                    dy1 = 0.926f,
                    dx2 = 0.747f,
                    dy2 = 2.0f,
                    dx3 = 1.331f,
                    dy3 = 2.0f,
                )
                // s 1.084 -1.074 1.331 -2
                reflectiveCurveToRelative(
                    dx1 = 1.084f,
                    dy1 = -1.074f,
                    dx2 = 1.331f,
                    dy2 = -2.0f,
                )
                // L 23 6
                lineTo(x = 23.0f, y = 6.0f)
                // c 0 1.104 0.448 2 1 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = 0.448f,
                    dy2 = 2.0f,
                    dx3 = 1.0f,
                    dy3 = 2.0f,
                )
                // s 1 -1 1 -3
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -3.0f,
                )
                // c 0 -1.105 -0.448 -1 -1 -1z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.105f,
                    dx2 = -0.448f,
                    dy2 = -1.0f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                close()
                // M 13.5 7
                moveTo(x = 13.5f, y = 7.0f)
                // c -0.829 0 -1.5 -0.671 -1.5 -1.5
                curveToRelative(
                    dx1 = -0.829f,
                    dy1 = 0.0f,
                    dx2 = -1.5f,
                    dy2 = -0.671f,
                    dx3 = -1.5f,
                    dy3 = -1.5f,
                )
                // S 12.671 4 13.5 4
                reflectiveCurveTo(
                    x1 = 12.671f,
                    y1 = 4.0f,
                    x2 = 13.5f,
                    y2 = 4.0f,
                )
                // s 1.5 0.671 1.5 1.5
                reflectiveCurveToRelative(
                    dx1 = 1.5f,
                    dy1 = 0.671f,
                    dx2 = 1.5f,
                    dy2 = 1.5f,
                )
                // S 14.329 7 13.5 7z
                reflectiveCurveTo(
                    x1 = 14.329f,
                    y1 = 7.0f,
                    x2 = 13.5f,
                    y2 = 7.0f,
                )
                close()
            }
        }.build().also { _emoji1f6c5 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f6c5: ImageVector? = null
