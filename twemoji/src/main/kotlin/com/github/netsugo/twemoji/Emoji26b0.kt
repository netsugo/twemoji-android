package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji26b0: ImageVector
    get() {
        val current = _emoji26b0
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji26b0",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M31 12 l-1.412 10.235 L7.353 36 5 28z
            path(
                fill = SolidColor(Color(0xFFC1694F)),
            ) {
                // M 31 12
                moveTo(x = 31.0f, y = 12.0f)
                // l -1.412 10.235
                lineToRelative(dx = -1.412f, dy = 10.235f)
                // L 7.353 36
                lineTo(x = 7.353f, y = 36.0f)
                // L 5 28z
                lineTo(x = 5.0f, y = 28.0f)
                close()
            }
            // M1 22 v7.647 L7.353 36 v-8z
            path(
                fill = SolidColor(Color(0xFF662113)),
            ) {
                // M 1 22
                moveTo(x = 1.0f, y = 22.0f)
                // v 7.647
                verticalLineToRelative(dy = 7.647f)
                // L 7.353 36
                lineTo(x = 7.353f, y = 36.0f)
                // v -8z
                verticalLineToRelative(dy = -8.0f)
                close()
            }
            // M34 5 v7.706 l-4.412 9.529 V15 L31 9z
            path(
                fill = SolidColor(Color(0xFFA04E3C)),
            ) {
                // M 34 5
                moveTo(x = 34.0f, y = 5.0f)
                // v 7.706
                verticalLineToRelative(dy = 7.706f)
                // l -4.412 9.529
                lineToRelative(dx = -4.412f, dy = 9.529f)
                // V 15
                verticalLineTo(y = 15.0f)
                // L 31 9z
                lineTo(x = 31.0f, y = 9.0f)
                close()
            }
            // M34 5 l-4.412 9.824 L7.353 28.588 1 22 17.941 2.118 28.529 0z
            path(
                fill = SolidColor(Color(0xFFD99E82)),
            ) {
                // M 34 5
                moveTo(x = 34.0f, y = 5.0f)
                // l -4.412 9.824
                lineToRelative(dx = -4.412f, dy = 9.824f)
                // L 7.353 28.588
                lineTo(x = 7.353f, y = 28.588f)
                // L 1 22
                lineTo(x = 1.0f, y = 22.0f)
                // L 17.941 2.118
                lineTo(x = 17.941f, y = 2.118f)
                // L 28.529 0z
                lineTo(x = 28.529f, y = 0.0f)
                close()
            }
            // M12.001 30 c-0.323 0 -0.64 -0.156 -0.833 -0.445 -0.306 -0.46 -0.182 -1.08 0.277 -1.387 l3 -2 c0.459 -0.307 1.08 -0.183 1.387 0.277 0.306 0.46 0.182 1.08 -0.277 1.387 l-3 2 c-0.171 0.113 -0.364 0.168 -0.554 0.168z M23.001 23 c-0.323 0 -0.641 -0.156 -0.833 -0.445 -0.307 -0.46 -0.183 -1.08 0.277 -1.387 l3 -2 c0.461 -0.306 1.08 -0.182 1.387 0.277 0.307 0.46 0.183 1.08 -0.277 1.387 l-3 2 c-0.171 0.113 -0.364 0.168 -0.554 0.168z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 12.001 30
                moveTo(x = 12.001f, y = 30.0f)
                // c -0.323 0 -0.64 -0.156 -0.833 -0.445
                curveToRelative(
                    dx1 = -0.323f,
                    dy1 = 0.0f,
                    dx2 = -0.64f,
                    dy2 = -0.156f,
                    dx3 = -0.833f,
                    dy3 = -0.445f,
                )
                // c -0.306 -0.46 -0.182 -1.08 0.277 -1.387
                curveToRelative(
                    dx1 = -0.306f,
                    dy1 = -0.46f,
                    dx2 = -0.182f,
                    dy2 = -1.08f,
                    dx3 = 0.277f,
                    dy3 = -1.387f,
                )
                // l 3 -2
                lineToRelative(dx = 3.0f, dy = -2.0f)
                // c 0.459 -0.307 1.08 -0.183 1.387 0.277
                curveToRelative(
                    dx1 = 0.459f,
                    dy1 = -0.307f,
                    dx2 = 1.08f,
                    dy2 = -0.183f,
                    dx3 = 1.387f,
                    dy3 = 0.277f,
                )
                // c 0.306 0.46 0.182 1.08 -0.277 1.387
                curveToRelative(
                    dx1 = 0.306f,
                    dy1 = 0.46f,
                    dx2 = 0.182f,
                    dy2 = 1.08f,
                    dx3 = -0.277f,
                    dy3 = 1.387f,
                )
                // l -3 2
                lineToRelative(dx = -3.0f, dy = 2.0f)
                // c -0.171 0.113 -0.364 0.168 -0.554 0.168z
                curveToRelative(
                    dx1 = -0.171f,
                    dy1 = 0.113f,
                    dx2 = -0.364f,
                    dy2 = 0.168f,
                    dx3 = -0.554f,
                    dy3 = 0.168f,
                )
                close()
                // M 23.001 23
                moveTo(x = 23.001f, y = 23.0f)
                // c -0.323 0 -0.641 -0.156 -0.833 -0.445
                curveToRelative(
                    dx1 = -0.323f,
                    dy1 = 0.0f,
                    dx2 = -0.641f,
                    dy2 = -0.156f,
                    dx3 = -0.833f,
                    dy3 = -0.445f,
                )
                // c -0.307 -0.46 -0.183 -1.08 0.277 -1.387
                curveToRelative(
                    dx1 = -0.307f,
                    dy1 = -0.46f,
                    dx2 = -0.183f,
                    dy2 = -1.08f,
                    dx3 = 0.277f,
                    dy3 = -1.387f,
                )
                // l 3 -2
                lineToRelative(dx = 3.0f, dy = -2.0f)
                // c 0.461 -0.306 1.08 -0.182 1.387 0.277
                curveToRelative(
                    dx1 = 0.461f,
                    dy1 = -0.306f,
                    dx2 = 1.08f,
                    dy2 = -0.182f,
                    dx3 = 1.387f,
                    dy3 = 0.277f,
                )
                // c 0.307 0.46 0.183 1.08 -0.277 1.387
                curveToRelative(
                    dx1 = 0.307f,
                    dy1 = 0.46f,
                    dx2 = 0.183f,
                    dy2 = 1.08f,
                    dx3 = -0.277f,
                    dy3 = 1.387f,
                )
                // l -3 2
                lineToRelative(dx = -3.0f, dy = 2.0f)
                // c -0.171 0.113 -0.364 0.168 -0.554 0.168z
                curveToRelative(
                    dx1 = -0.171f,
                    dy1 = 0.113f,
                    dx2 = -0.364f,
                    dy2 = 0.168f,
                    dx3 = -0.554f,
                    dy3 = 0.168f,
                )
                close()
            }
            // M9 25 c-0.258 0 -0.514 -0.1 -0.708 -0.293 l-3 -3 c-0.382 -0.382 -0.392 -0.997 -0.022 -1.391 l15 -16 c0.15 -0.16 0.349 -0.266 0.565 -0.302 l6 -1 c0.315 -0.054 0.642 0.05 0.871 0.279 l2 2 c0.284 0.283 0.371 0.707 0.223 1.079 l-2 5 c-0.07 0.176 -0.189 0.328 -0.343 0.439 l-18 13 C9.41 24.938 9.205 25 9 25z M7.392 20.978 l1.713 1.713 L26.18 10.359 l1.646 -4.119 -1.169 -1.17 -5.159 0.86 L7.392 20.978z
            path(
                fill = SolidColor(Color(0xFFC1694F)),
            ) {
                // M 9 25
                moveTo(x = 9.0f, y = 25.0f)
                // c -0.258 0 -0.514 -0.1 -0.708 -0.293
                curveToRelative(
                    dx1 = -0.258f,
                    dy1 = 0.0f,
                    dx2 = -0.514f,
                    dy2 = -0.1f,
                    dx3 = -0.708f,
                    dy3 = -0.293f,
                )
                // l -3 -3
                lineToRelative(dx = -3.0f, dy = -3.0f)
                // c -0.382 -0.382 -0.392 -0.997 -0.022 -1.391
                curveToRelative(
                    dx1 = -0.382f,
                    dy1 = -0.382f,
                    dx2 = -0.392f,
                    dy2 = -0.997f,
                    dx3 = -0.022f,
                    dy3 = -1.391f,
                )
                // l 15 -16
                lineToRelative(dx = 15.0f, dy = -16.0f)
                // c 0.15 -0.16 0.349 -0.266 0.565 -0.302
                curveToRelative(
                    dx1 = 0.15f,
                    dy1 = -0.16f,
                    dx2 = 0.349f,
                    dy2 = -0.266f,
                    dx3 = 0.565f,
                    dy3 = -0.302f,
                )
                // l 6 -1
                lineToRelative(dx = 6.0f, dy = -1.0f)
                // c 0.315 -0.054 0.642 0.05 0.871 0.279
                curveToRelative(
                    dx1 = 0.315f,
                    dy1 = -0.054f,
                    dx2 = 0.642f,
                    dy2 = 0.05f,
                    dx3 = 0.871f,
                    dy3 = 0.279f,
                )
                // l 2 2
                lineToRelative(dx = 2.0f, dy = 2.0f)
                // c 0.284 0.283 0.371 0.707 0.223 1.079
                curveToRelative(
                    dx1 = 0.284f,
                    dy1 = 0.283f,
                    dx2 = 0.371f,
                    dy2 = 0.707f,
                    dx3 = 0.223f,
                    dy3 = 1.079f,
                )
                // l -2 5
                lineToRelative(dx = -2.0f, dy = 5.0f)
                // c -0.07 0.176 -0.189 0.328 -0.343 0.439
                curveToRelative(
                    dx1 = -0.07f,
                    dy1 = 0.176f,
                    dx2 = -0.189f,
                    dy2 = 0.328f,
                    dx3 = -0.343f,
                    dy3 = 0.439f,
                )
                // l -18 13
                lineToRelative(dx = -18.0f, dy = 13.0f)
                // C 9.41 24.938 9.205 25 9 25z
                curveTo(
                    x1 = 9.41f,
                    y1 = 24.938f,
                    x2 = 9.205f,
                    y2 = 25.0f,
                    x3 = 9.0f,
                    y3 = 25.0f,
                )
                close()
                // M 7.392 20.978
                moveTo(x = 7.392f, y = 20.978f)
                // l 1.713 1.713
                lineToRelative(dx = 1.713f, dy = 1.713f)
                // L 26.18 10.359
                lineTo(x = 26.18f, y = 10.359f)
                // l 1.646 -4.119
                lineToRelative(dx = 1.646f, dy = -4.119f)
                // l -1.169 -1.17
                lineToRelative(dx = -1.169f, dy = -1.17f)
                // l -5.159 0.86
                lineToRelative(dx = -5.159f, dy = 0.86f)
                // L 7.392 20.978z
                lineTo(x = 7.392f, y = 20.978f)
                close()
            }
        }.build().also { _emoji26b0 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji26b0: ImageVector? = null
