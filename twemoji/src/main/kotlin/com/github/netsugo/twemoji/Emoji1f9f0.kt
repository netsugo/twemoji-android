package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f9f0: ImageVector
    get() {
        val current = _emoji1f9f0
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f9f0",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M26 0.5 H10 C8.07 0.5 6.5 2.07 6.5 4 v4 h3 V4 c0 -0.271 0.229 -0.5 0.5 -0.5 h16 c0.271 0 0.5 0.229 0.5 0.5 v4 h3 V4 c0 -1.93 -1.57 -3.5 -3.5 -3.5z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 26 0.5
                moveTo(x = 26.0f, y = 0.5f)
                // H 10
                horizontalLineTo(x = 10.0f)
                // C 8.07 0.5 6.5 2.07 6.5 4
                curveTo(
                    x1 = 8.07f,
                    y1 = 0.5f,
                    x2 = 6.5f,
                    y2 = 2.07f,
                    x3 = 6.5f,
                    y3 = 4.0f,
                )
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // c 0 -0.271 0.229 -0.5 0.5 -0.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.271f,
                    dx2 = 0.229f,
                    dy2 = -0.5f,
                    dx3 = 0.5f,
                    dy3 = -0.5f,
                )
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // c 0.271 0 0.5 0.229 0.5 0.5
                curveToRelative(
                    dx1 = 0.271f,
                    dy1 = 0.0f,
                    dx2 = 0.5f,
                    dy2 = 0.229f,
                    dx3 = 0.5f,
                    dy3 = 0.5f,
                )
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // c 0 -1.93 -1.57 -3.5 -3.5 -3.5z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.93f,
                    dx2 = -1.57f,
                    dy2 = -3.5f,
                    dx3 = -3.5f,
                    dy3 = -3.5f,
                )
                close()
            }
            // M36 31.765 S36 36 31.765 36 H4.235 C0 36 0 31.765 0 31.765 V11.647 c0 -4.235 4.235 -4.235 4.235 -4.235 h27.529 s4.235 0 4.235 4.235 v20.118z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 36 31.765
                moveTo(x = 36.0f, y = 31.765f)
                // S 36 36 31.765 36
                reflectiveCurveTo(
                    x1 = 36.0f,
                    y1 = 36.0f,
                    x2 = 31.765f,
                    y2 = 36.0f,
                )
                // H 4.235
                horizontalLineTo(x = 4.235f)
                // C 0 36 0 31.765 0 31.765
                curveTo(
                    x1 = 0.0f,
                    y1 = 36.0f,
                    x2 = 0.0f,
                    y2 = 31.765f,
                    x3 = 0.0f,
                    y3 = 31.765f,
                )
                // V 11.647
                verticalLineTo(y = 11.647f)
                // c 0 -4.235 4.235 -4.235 4.235 -4.235
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.235f,
                    dx2 = 4.235f,
                    dy2 = -4.235f,
                    dx3 = 4.235f,
                    dy3 = -4.235f,
                )
                // h 27.529
                horizontalLineToRelative(dx = 27.529f)
                // s 4.235 0 4.235 4.235
                reflectiveCurveToRelative(
                    dx1 = 4.235f,
                    dy1 = 0.0f,
                    dx2 = 4.235f,
                    dy2 = 4.235f,
                )
                // v 20.118z
                verticalLineToRelative(dy = 20.118f)
                close()
            }
            // M4 22 h28 v2 H4z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 4 22
                moveTo(x = 4.0f, y = 22.0f)
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 4z
                horizontalLineTo(x = 4.0f)
                close()
            }
            // M0 15 h36 v2 L0 17z M4 24 h28 v2 L4 26z M4 30 h28 v2 L4 32z
            path(
                fill = SolidColor(Color(0xFFBE1931)),
            ) {
                // M 0 15
                moveTo(x = 0.0f, y = 15.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // L 0 17z
                lineTo(x = 0.0f, y = 17.0f)
                close()
                // M 4 24
                moveTo(x = 4.0f, y = 24.0f)
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // L 4 26z
                lineTo(x = 4.0f, y = 26.0f)
                close()
                // M 4 30
                moveTo(x = 4.0f, y = 30.0f)
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // L 4 32z
                lineTo(x = 4.0f, y = 32.0f)
                close()
            }
            // M4 28 h28 v2 H4z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 4 28
                moveTo(x = 4.0f, y = 28.0f)
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 4z
                horizontalLineTo(x = 4.0f)
                close()
            }
            // M10 19 L8 19 c-0.552 0 -1 -0.448 -1 -1 v-4 c0 -0.552 0.448 -1 1 -1 h2 c0.552 0 1 0.448 1 1 v4 c0 0.552 -0.448 1 -1 1z M28 19 h-2 c-0.552 0 -1 -0.448 -1 -1 v-4 c0 -0.552 0.448 -1 1 -1 h2 c0.552 0 1 0.448 1 1 v4 c0 0.552 -0.448 1 -1 1z
            path(
                fill = SolidColor(Color(0xFFAAB8C2)),
            ) {
                // M 10 19
                moveTo(x = 10.0f, y = 19.0f)
                // L 8 19
                lineTo(x = 8.0f, y = 19.0f)
                // c -0.552 0 -1 -0.448 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.448f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // c 0 -0.552 0.448 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = 0.448f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // c 0.552 0 1 0.448 1 1
                curveToRelative(
                    dx1 = 0.552f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.448f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // c 0 0.552 -0.448 1 -1 1z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = -0.448f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                close()
                // M 28 19
                moveTo(x = 28.0f, y = 19.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // c -0.552 0 -1 -0.448 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.448f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // c 0 -0.552 0.448 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = 0.448f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // c 0.552 0 1 0.448 1 1
                curveToRelative(
                    dx1 = 0.552f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.448f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // c 0 0.552 -0.448 1 -1 1z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = -0.448f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                close()
            }
            // M25 17 v1 c0 0.552 0.448 1 1 1 h2 c0.552 0 1 -0.448 1 -1 v-1 h-4z M7 17 v1 c0 0.552 0.448 1 1 1 h2 c0.552 0 1 -0.448 1 -1 v-1 H7z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 25 17
                moveTo(x = 25.0f, y = 17.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // c 0 0.552 0.448 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = 0.448f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // c 0.552 0 1 -0.448 1 -1
                curveToRelative(
                    dx1 = 0.552f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -0.448f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
                // M 7 17
                moveTo(x = 7.0f, y = 17.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // c 0 0.552 0.448 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = 0.448f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // c 0.552 0 1 -0.448 1 -1
                curveToRelative(
                    dx1 = 0.552f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -0.448f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // H 7z
                horizontalLineTo(x = 7.0f)
                close()
            }
            // M26 15 h2 v3 h-2z M8 15 h2 v3 H8z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 26 15
                moveTo(x = 26.0f, y = 15.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
                // M 8 15
                moveTo(x = 8.0f, y = 15.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // H 8z
                horizontalLineTo(x = 8.0f)
                close()
            }
        }.build().also { _emoji1f9f0 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f9f0: ImageVector? = null
