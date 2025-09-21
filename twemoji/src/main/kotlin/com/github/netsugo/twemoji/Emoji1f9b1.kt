package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f9b1: ImageVector
    get() {
        val current = _emoji1f9b1
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f9b1",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M0 21 h30 v15 H0z
            path(
                fill = SolidColor(Color(0xFFFFDC5D)),
            ) {
                // M 0 21
                moveTo(x = 0.0f, y = 21.0f)
                // h 30
                horizontalLineToRelative(dx = 30.0f)
                // v 15
                verticalLineToRelative(dy = 15.0f)
                // H 0z
                horizontalLineTo(x = 0.0f)
                close()
            }
            // M35 26.417 c0 -1.812 -0.954 -3.39 -2.381 -4.29 0.216 -0.563 0.348 -1.169 0.348 -1.81 0 -2.595 -1.95 -4.709 -4.459 -5.02 0.239 -0.657 0.392 -1.357 0.392 -2.097 0 -3.369 -2.731 -6.1 -6.1 -6.1 -0.803 0 -1.566 0.165 -2.267 0.447 -0.704 -2.595 -3.05 -4.514 -5.866 -4.514 -1.769 0 -3.347 0.765 -4.461 1.966 C9.347 2.669 7.127 1 4.5 1 2.704 1 1.111 1.792 0 3.03 v27.447 c1.289 0.645 2.834 1.023 4.5 1.023 2.635 0 4.955 -0.956 6.44 -2.414 0.968 2.56 4.071 4.447 7.794 4.447 2.188 0 4.166 -0.655 5.626 -1.71 0.4 1.394 0.511 2.668 0.542 4.177 h6.948 c0.688 -0.911 1.117 -2.131 1.117 -3.483 0 -0.653 -0.108 -1.271 -0.285 -1.842 C34.075 29.768 35 28.202 35 26.417z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 35 26.417
                moveTo(x = 35.0f, y = 26.417f)
                // c 0 -1.812 -0.954 -3.39 -2.381 -4.29
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.812f,
                    dx2 = -0.954f,
                    dy2 = -3.39f,
                    dx3 = -2.381f,
                    dy3 = -4.29f,
                )
                // c 0.216 -0.563 0.348 -1.169 0.348 -1.81
                curveToRelative(
                    dx1 = 0.216f,
                    dy1 = -0.563f,
                    dx2 = 0.348f,
                    dy2 = -1.169f,
                    dx3 = 0.348f,
                    dy3 = -1.81f,
                )
                // c 0 -2.595 -1.95 -4.709 -4.459 -5.02
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.595f,
                    dx2 = -1.95f,
                    dy2 = -4.709f,
                    dx3 = -4.459f,
                    dy3 = -5.02f,
                )
                // c 0.239 -0.657 0.392 -1.357 0.392 -2.097
                curveToRelative(
                    dx1 = 0.239f,
                    dy1 = -0.657f,
                    dx2 = 0.392f,
                    dy2 = -1.357f,
                    dx3 = 0.392f,
                    dy3 = -2.097f,
                )
                // c 0 -3.369 -2.731 -6.1 -6.1 -6.1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.369f,
                    dx2 = -2.731f,
                    dy2 = -6.1f,
                    dx3 = -6.1f,
                    dy3 = -6.1f,
                )
                // c -0.803 0 -1.566 0.165 -2.267 0.447
                curveToRelative(
                    dx1 = -0.803f,
                    dy1 = 0.0f,
                    dx2 = -1.566f,
                    dy2 = 0.165f,
                    dx3 = -2.267f,
                    dy3 = 0.447f,
                )
                // c -0.704 -2.595 -3.05 -4.514 -5.866 -4.514
                curveToRelative(
                    dx1 = -0.704f,
                    dy1 = -2.595f,
                    dx2 = -3.05f,
                    dy2 = -4.514f,
                    dx3 = -5.866f,
                    dy3 = -4.514f,
                )
                // c -1.769 0 -3.347 0.765 -4.461 1.966
                curveToRelative(
                    dx1 = -1.769f,
                    dy1 = 0.0f,
                    dx2 = -3.347f,
                    dy2 = 0.765f,
                    dx3 = -4.461f,
                    dy3 = 1.966f,
                )
                // C 9.347 2.669 7.127 1 4.5 1
                curveTo(
                    x1 = 9.347f,
                    y1 = 2.669f,
                    x2 = 7.127f,
                    y2 = 1.0f,
                    x3 = 4.5f,
                    y3 = 1.0f,
                )
                // C 2.704 1 1.111 1.792 0 3.03
                curveTo(
                    x1 = 2.704f,
                    y1 = 1.0f,
                    x2 = 1.111f,
                    y2 = 1.792f,
                    x3 = 0.0f,
                    y3 = 3.03f,
                )
                // v 27.447
                verticalLineToRelative(dy = 27.447f)
                // c 1.289 0.645 2.834 1.023 4.5 1.023
                curveToRelative(
                    dx1 = 1.289f,
                    dy1 = 0.645f,
                    dx2 = 2.834f,
                    dy2 = 1.023f,
                    dx3 = 4.5f,
                    dy3 = 1.023f,
                )
                // c 2.635 0 4.955 -0.956 6.44 -2.414
                curveToRelative(
                    dx1 = 2.635f,
                    dy1 = 0.0f,
                    dx2 = 4.955f,
                    dy2 = -0.956f,
                    dx3 = 6.44f,
                    dy3 = -2.414f,
                )
                // c 0.968 2.56 4.071 4.447 7.794 4.447
                curveToRelative(
                    dx1 = 0.968f,
                    dy1 = 2.56f,
                    dx2 = 4.071f,
                    dy2 = 4.447f,
                    dx3 = 7.794f,
                    dy3 = 4.447f,
                )
                // c 2.188 0 4.166 -0.655 5.626 -1.71
                curveToRelative(
                    dx1 = 2.188f,
                    dy1 = 0.0f,
                    dx2 = 4.166f,
                    dy2 = -0.655f,
                    dx3 = 5.626f,
                    dy3 = -1.71f,
                )
                // c 0.4 1.394 0.511 2.668 0.542 4.177
                curveToRelative(
                    dx1 = 0.4f,
                    dy1 = 1.394f,
                    dx2 = 0.511f,
                    dy2 = 2.668f,
                    dx3 = 0.542f,
                    dy3 = 4.177f,
                )
                // h 6.948
                horizontalLineToRelative(dx = 6.948f)
                // c 0.688 -0.911 1.117 -2.131 1.117 -3.483
                curveToRelative(
                    dx1 = 0.688f,
                    dy1 = -0.911f,
                    dx2 = 1.117f,
                    dy2 = -2.131f,
                    dx3 = 1.117f,
                    dy3 = -3.483f,
                )
                // c 0 -0.653 -0.108 -1.271 -0.285 -1.842
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.653f,
                    dx2 = -0.108f,
                    dy2 = -1.271f,
                    dx3 = -0.285f,
                    dy3 = -1.842f,
                )
                // C 34.075 29.768 35 28.202 35 26.417z
                curveTo(
                    x1 = 34.075f,
                    y1 = 29.768f,
                    x2 = 35.0f,
                    y2 = 28.202f,
                    x3 = 35.0f,
                    y3 = 26.417f,
                )
                close()
            }
        }.build().also { _emoji1f9b1 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f9b1: ImageVector? = null
