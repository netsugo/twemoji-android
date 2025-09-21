package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1ea1f1f8: ImageVector
    get() {
        val current = _emoji1f1ea1f1f8
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1ea1f1f8",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 27 c0 2.209 -1.791 4 -4 4 H4 c-2.209 0 -4 -1.791 -4 -4 V9 c0 -2.209 1.791 -4 4 -4 h28 c2.209 0 4 1.791 4 4 v18z
            path(
                fill = SolidColor(Color(0xFFC60A1D)),
            ) {
                // M 36 27
                moveTo(x = 36.0f, y = 27.0f)
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
                // V 9
                verticalLineTo(y = 9.0f)
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
                // v 18z
                verticalLineToRelative(dy = 18.0f)
                close()
            }
            // M0 12 h36 v12 H0z
            path(
                fill = SolidColor(Color(0xFFFFC400)),
            ) {
                // M 0 12
                moveTo(x = 0.0f, y = 12.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // H 0z
                horizontalLineTo(x = 0.0f)
                close()
            }
            // M9 17 v3 c0 1.657 1.343 3 3 3 s3 -1.343 3 -3 v-3 H9z
            path(
                fill = SolidColor(Color(0xFFEA596E)),
            ) {
                // M 9 17
                moveTo(x = 9.0f, y = 17.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // c 0 1.657 1.343 3 3 3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.657f,
                    dx2 = 1.343f,
                    dy2 = 3.0f,
                    dx3 = 3.0f,
                    dy3 = 3.0f,
                )
                // s 3 -1.343 3 -3
                reflectiveCurveToRelative(
                    dx1 = 3.0f,
                    dy1 = -1.343f,
                    dx2 = 3.0f,
                    dy2 = -3.0f,
                )
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // H 9z
                horizontalLineTo(x = 9.0f)
                close()
            }
            // M12 16 h3 v3 h-3z
            path(
                fill = SolidColor(Color(0xFFF4A2B2)),
            ) {
                // M 12 16
                moveTo(x = 12.0f, y = 16.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h -3z
                horizontalLineToRelative(dx = -3.0f)
                close()
            }
            // M9 16 h3 v3 H9z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 9 16
                moveTo(x = 9.0f, y = 16.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // H 9z
                horizontalLineTo(x = 9.0f)
                close()
            }
            // M9 14.5 a3 1.5 0 1 0 6 0 a3 1.5 0 1 0 -6 0z
            path(
                fill = SolidColor(Color(0xFFEA596E)),
            ) {
                // M 9 14.5
                moveTo(x = 9.0f, y = 14.5f)
                // a 3 1.5 0 1 0 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // a 3 1.5 0 1 0 -6 0z
                arcToRelative(
                    a = 3.0f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M9 13.75 a3 0.75 0 1 0 6 0 a3 0.75 0 1 0 -6 0z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 9 13.75
                moveTo(x = 9.0f, y = 13.75f)
                // a 3 0.75 0 1 0 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 0.75f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // a 3 0.75 0 1 0 -6 0z
                arcToRelative(
                    a = 3.0f,
                    b = 0.75f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M7 16 h1 v7 L7 23z M16 16 h1 v7 h-1z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 7 16
                moveTo(x = 7.0f, y = 16.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // L 7 23z
                lineTo(x = 7.0f, y = 23.0f)
                close()
                // M 16 16
                moveTo(x = 16.0f, y = 16.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // h -1z
                horizontalLineToRelative(dx = -1.0f)
                close()
            }
            // M6 22 h3 v1 L6 23z M15 22 h3 v1 h-3z M7 15 h1 v1 L7 16z M16 15 h1 v1 h-1z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 6 22
                moveTo(x = 6.0f, y = 22.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // L 6 23z
                lineTo(x = 6.0f, y = 23.0f)
                close()
                // M 15 22
                moveTo(x = 15.0f, y = 22.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // h -3z
                horizontalLineToRelative(dx = -3.0f)
                close()
                // M 7 15
                moveTo(x = 7.0f, y = 15.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // L 7 16z
                lineTo(x = 7.0f, y = 16.0f)
                close()
                // M 16 15
                moveTo(x = 16.0f, y = 15.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // h -1z
                horizontalLineToRelative(dx = -1.0f)
                close()
            }
        }.build().also { _emoji1f1ea1f1f8 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1ea1f1f8: ImageVector? = null
