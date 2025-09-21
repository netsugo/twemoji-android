package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f5c4: ImageVector
    get() {
        val current = _emoji1f5c4
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f5c4",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M30 34 c0 1.104 -0.896 2 -2 2 H8 c-1.104 0 -2 -0.896 -2 -2 V2 c0 -1.104 0.896 -2 2 -2 h20 c1.104 0 2 0.896 2 2 v32z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 30 34
                moveTo(x = 30.0f, y = 34.0f)
                // c 0 1.104 -0.896 2 -2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = -0.896f,
                    dy2 = 2.0f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // H 8
                horizontalLineTo(x = 8.0f)
                // c -1.104 0 -2 -0.896 -2 -2
                curveToRelative(
                    dx1 = -1.104f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -0.896f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // V 2
                verticalLineTo(y = 2.0f)
                // c 0 -1.104 0.896 -2 2 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.104f,
                    dx2 = 0.896f,
                    dy2 = -2.0f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // c 1.104 0 2 0.896 2 2
                curveToRelative(
                    dx1 = 1.104f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 0.896f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                // v 32z
                verticalLineToRelative(dy = 32.0f)
                close()
            }
            // M28 16 c0 0.552 -0.447 1 -1 1 L9 17 c-0.552 0 -1 -0.448 -1 -1 L8 3 c0 -0.552 0.448 -1 1 -1 h18 c0.553 0 1 0.448 1 1 v13z M28 33 c0 0.553 -0.447 1 -1 1 L9 34 c-0.552 0 -1 -0.447 -1 -1 L8 20 c0 -0.553 0.448 -1 1 -1 h18 c0.553 0 1 0.447 1 1 v13z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 28 16
                moveTo(x = 28.0f, y = 16.0f)
                // c 0 0.552 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // L 9 17
                lineTo(x = 9.0f, y = 17.0f)
                // c -0.552 0 -1 -0.448 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.448f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // L 8 3
                lineTo(x = 8.0f, y = 3.0f)
                // c 0 -0.552 0.448 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = 0.448f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // c 0.553 0 1 0.448 1 1
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.448f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // v 13z
                verticalLineToRelative(dy = 13.0f)
                close()
                // M 28 33
                moveTo(x = 28.0f, y = 33.0f)
                // c 0 0.553 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // L 9 34
                lineTo(x = 9.0f, y = 34.0f)
                // c -0.552 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // L 8 20
                lineTo(x = 8.0f, y = 20.0f)
                // c 0 -0.553 0.448 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.553f,
                    dx2 = 0.448f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // c 0.553 0 1 0.447 1 1
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.447f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // v 13z
                verticalLineToRelative(dy = 13.0f)
                close()
            }
            // M22 8 c0 0.552 -0.447 1 -1 1 h-6 c-0.552 0 -1 -0.448 -1 -1 L14 5 c0 -0.552 0.448 -1 1 -1 h6 c0.553 0 1 0.448 1 1 v3z M22 25 c0 0.553 -0.447 1 -1 1 h-6 c-0.552 0 -1 -0.447 -1 -1 v-3 c0 -0.553 0.448 -1 1 -1 h6 c0.553 0 1 0.447 1 1 v3z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 22 8
                moveTo(x = 22.0f, y = 8.0f)
                // c 0 0.552 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // c -0.552 0 -1 -0.448 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.448f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // L 14 5
                lineTo(x = 14.0f, y = 5.0f)
                // c 0 -0.552 0.448 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = 0.448f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // c 0.553 0 1 0.448 1 1
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.448f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // v 3z
                verticalLineToRelative(dy = 3.0f)
                close()
                // M 22 25
                moveTo(x = 22.0f, y = 25.0f)
                // c 0 0.553 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // c -0.552 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // c 0 -0.553 0.448 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.553f,
                    dx2 = 0.448f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // c 0.553 0 1 0.447 1 1
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.447f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // v 3z
                verticalLineToRelative(dy = 3.0f)
                close()
            }
            // M15 5 h6 v3 h-6z M15 22 h6 v3 h-6z M24 13.03 c0 0.536 -0.435 0.97 -0.97 0.97 L12.97 14 c-0.536 0 -0.97 -0.435 -0.97 -0.97 v-0.06 c0 -0.536 0.434 -0.97 0.97 -0.97 h10.06 c0.535 0 0.97 0.435 0.97 0.97 v0.06z M24 30.029 c0 0.536 -0.435 0.971 -0.97 0.971 L12.97 31 c-0.536 0 -0.97 -0.435 -0.97 -0.971 v-0.059 c0 -0.535 0.434 -0.97 0.97 -0.97 h10.06 c0.535 0 0.97 0.435 0.97 0.971 v0.058z
            path(
                fill = SolidColor(Color(0xFFE1E8ED)),
            ) {
                // M 15 5
                moveTo(x = 15.0f, y = 5.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h -6z
                horizontalLineToRelative(dx = -6.0f)
                close()
                // M 15 22
                moveTo(x = 15.0f, y = 22.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h -6z
                horizontalLineToRelative(dx = -6.0f)
                close()
                // M 24 13.03
                moveTo(x = 24.0f, y = 13.03f)
                // c 0 0.536 -0.435 0.97 -0.97 0.97
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.536f,
                    dx2 = -0.435f,
                    dy2 = 0.97f,
                    dx3 = -0.97f,
                    dy3 = 0.97f,
                )
                // L 12.97 14
                lineTo(x = 12.97f, y = 14.0f)
                // c -0.536 0 -0.97 -0.435 -0.97 -0.97
                curveToRelative(
                    dx1 = -0.536f,
                    dy1 = 0.0f,
                    dx2 = -0.97f,
                    dy2 = -0.435f,
                    dx3 = -0.97f,
                    dy3 = -0.97f,
                )
                // v -0.06
                verticalLineToRelative(dy = -0.06f)
                // c 0 -0.536 0.434 -0.97 0.97 -0.97
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.536f,
                    dx2 = 0.434f,
                    dy2 = -0.97f,
                    dx3 = 0.97f,
                    dy3 = -0.97f,
                )
                // h 10.06
                horizontalLineToRelative(dx = 10.06f)
                // c 0.535 0 0.97 0.435 0.97 0.97
                curveToRelative(
                    dx1 = 0.535f,
                    dy1 = 0.0f,
                    dx2 = 0.97f,
                    dy2 = 0.435f,
                    dx3 = 0.97f,
                    dy3 = 0.97f,
                )
                // v 0.06z
                verticalLineToRelative(dy = 0.06f)
                close()
                // M 24 30.029
                moveTo(x = 24.0f, y = 30.029f)
                // c 0 0.536 -0.435 0.971 -0.97 0.971
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.536f,
                    dx2 = -0.435f,
                    dy2 = 0.971f,
                    dx3 = -0.97f,
                    dy3 = 0.971f,
                )
                // L 12.97 31
                lineTo(x = 12.97f, y = 31.0f)
                // c -0.536 0 -0.97 -0.435 -0.97 -0.971
                curveToRelative(
                    dx1 = -0.536f,
                    dy1 = 0.0f,
                    dx2 = -0.97f,
                    dy2 = -0.435f,
                    dx3 = -0.97f,
                    dy3 = -0.971f,
                )
                // v -0.059
                verticalLineToRelative(dy = -0.059f)
                // c 0 -0.535 0.434 -0.97 0.97 -0.97
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.535f,
                    dx2 = 0.434f,
                    dy2 = -0.97f,
                    dx3 = 0.97f,
                    dy3 = -0.97f,
                )
                // h 10.06
                horizontalLineToRelative(dx = 10.06f)
                // c 0.535 0 0.97 0.435 0.97 0.971
                curveToRelative(
                    dx1 = 0.535f,
                    dy1 = 0.0f,
                    dx2 = 0.97f,
                    dy2 = 0.435f,
                    dx3 = 0.97f,
                    dy3 = 0.971f,
                )
                // v 0.058z
                verticalLineToRelative(dy = 0.058f)
                close()
            }
        }.build().also { _emoji1f5c4 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f5c4: ImageVector? = null
