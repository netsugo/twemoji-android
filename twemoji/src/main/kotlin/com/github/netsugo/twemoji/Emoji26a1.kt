package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji26a1: ImageVector
    get() {
        val current = _emoji26a1
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji26a1",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M32.938 15.651 C32.792 15.26 32.418 15 32 15 H19.925 L26.89 1.458 c0.219 -0.426 0.106 -0.947 -0.271 -1.243 C26.437 0.071 26.218 0 26 0 c-0.233 0 -0.466 0.082 -0.653 0.243 L18 6.588 3.347 19.243 c-0.316 0.273 -0.43 0.714 -0.284 1.105 S3.582 21 4 21 h12.075 L9.11 34.542 c-0.219 0.426 -0.106 0.947 0.271 1.243 0.182 0.144 0.401 0.215 0.619 0.215 0.233 0 0.466 -0.082 0.653 -0.243 L18 29.412 l14.653 -12.655 c0.317 -0.273 0.43 -0.714 0.285 -1.106z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 32.938 15.651
                moveTo(x = 32.938f, y = 15.651f)
                // C 32.792 15.26 32.418 15 32 15
                curveTo(
                    x1 = 32.792f,
                    y1 = 15.26f,
                    x2 = 32.418f,
                    y2 = 15.0f,
                    x3 = 32.0f,
                    y3 = 15.0f,
                )
                // H 19.925
                horizontalLineTo(x = 19.925f)
                // L 26.89 1.458
                lineTo(x = 26.89f, y = 1.458f)
                // c 0.219 -0.426 0.106 -0.947 -0.271 -1.243
                curveToRelative(
                    dx1 = 0.219f,
                    dy1 = -0.426f,
                    dx2 = 0.106f,
                    dy2 = -0.947f,
                    dx3 = -0.271f,
                    dy3 = -1.243f,
                )
                // C 26.437 0.071 26.218 0 26 0
                curveTo(
                    x1 = 26.437f,
                    y1 = 0.071f,
                    x2 = 26.218f,
                    y2 = 0.0f,
                    x3 = 26.0f,
                    y3 = 0.0f,
                )
                // c -0.233 0 -0.466 0.082 -0.653 0.243
                curveToRelative(
                    dx1 = -0.233f,
                    dy1 = 0.0f,
                    dx2 = -0.466f,
                    dy2 = 0.082f,
                    dx3 = -0.653f,
                    dy3 = 0.243f,
                )
                // L 18 6.588
                lineTo(x = 18.0f, y = 6.588f)
                // L 3.347 19.243
                lineTo(x = 3.347f, y = 19.243f)
                // c -0.316 0.273 -0.43 0.714 -0.284 1.105
                curveToRelative(
                    dx1 = -0.316f,
                    dy1 = 0.273f,
                    dx2 = -0.43f,
                    dy2 = 0.714f,
                    dx3 = -0.284f,
                    dy3 = 1.105f,
                )
                // S 3.582 21 4 21
                reflectiveCurveTo(
                    x1 = 3.582f,
                    y1 = 21.0f,
                    x2 = 4.0f,
                    y2 = 21.0f,
                )
                // h 12.075
                horizontalLineToRelative(dx = 12.075f)
                // L 9.11 34.542
                lineTo(x = 9.11f, y = 34.542f)
                // c -0.219 0.426 -0.106 0.947 0.271 1.243
                curveToRelative(
                    dx1 = -0.219f,
                    dy1 = 0.426f,
                    dx2 = -0.106f,
                    dy2 = 0.947f,
                    dx3 = 0.271f,
                    dy3 = 1.243f,
                )
                // c 0.182 0.144 0.401 0.215 0.619 0.215
                curveToRelative(
                    dx1 = 0.182f,
                    dy1 = 0.144f,
                    dx2 = 0.401f,
                    dy2 = 0.215f,
                    dx3 = 0.619f,
                    dy3 = 0.215f,
                )
                // c 0.233 0 0.466 -0.082 0.653 -0.243
                curveToRelative(
                    dx1 = 0.233f,
                    dy1 = 0.0f,
                    dx2 = 0.466f,
                    dy2 = -0.082f,
                    dx3 = 0.653f,
                    dy3 = -0.243f,
                )
                // L 18 29.412
                lineTo(x = 18.0f, y = 29.412f)
                // l 14.653 -12.655
                lineToRelative(dx = 14.653f, dy = -12.655f)
                // c 0.317 -0.273 0.43 -0.714 0.285 -1.106z
                curveToRelative(
                    dx1 = 0.317f,
                    dy1 = -0.273f,
                    dx2 = 0.43f,
                    dy2 = -0.714f,
                    dx3 = 0.285f,
                    dy3 = -1.106f,
                )
                close()
            }
        }.build().also { _emoji26a1 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji26a1: ImageVector? = null
