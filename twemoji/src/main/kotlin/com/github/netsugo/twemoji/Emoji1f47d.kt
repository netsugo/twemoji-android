package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f47d: ImageVector
    get() {
        val current = _emoji1f47d
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f47d",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M35 17 c0 9.389 -13.223 19 -17 19 -3.778 0 -17 -9.611 -17 -19 S8.611 0 18 0 s17 7.611 17 17z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 35 17
                moveTo(x = 35.0f, y = 17.0f)
                // c 0 9.389 -13.223 19 -17 19
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 9.389f,
                    dx2 = -13.223f,
                    dy2 = 19.0f,
                    dx3 = -17.0f,
                    dy3 = 19.0f,
                )
                // c -3.778 0 -17 -9.611 -17 -19
                curveToRelative(
                    dx1 = -3.778f,
                    dy1 = 0.0f,
                    dx2 = -17.0f,
                    dy2 = -9.611f,
                    dx3 = -17.0f,
                    dy3 = -19.0f,
                )
                // S 8.611 0 18 0
                reflectiveCurveTo(
                    x1 = 8.611f,
                    y1 = 0.0f,
                    x2 = 18.0f,
                    y2 = 0.0f,
                )
                // s 17 7.611 17 17z
                reflectiveCurveToRelative(
                    dx1 = 17.0f,
                    dy1 = 7.611f,
                    dx2 = 17.0f,
                    dy2 = 17.0f,
                )
                close()
            }
            // M13.503 14.845 c3.124 3.124 4.39 6.923 2.828 8.485 -1.562 1.562 -5.361 0.297 -8.485 -2.828 -3.125 -3.124 -4.391 -6.923 -2.828 -8.485 s5.361 -0.296 8.485 2.828z M22.497 14.845 c-3.124 3.124 -4.39 6.923 -2.828 8.485 1.562 1.562 5.361 0.297 8.485 -2.828 3.125 -3.125 4.391 -6.923 2.828 -8.485 -1.562 -1.562 -5.361 -0.297 -8.485 2.828z M18 31 c-2.347 0 -3.575 -1.16 -3.707 -1.293 -0.391 -0.391 -0.391 -1.023 0 -1.414 0.387 -0.387 1.013 -0.391 1.404 -0.01 0.051 0.047 0.806 0.717 2.303 0.717 1.519 0 2.273 -0.689 2.305 -0.719 0.398 -0.374 1.027 -0.363 1.408 0.029 0.379 0.393 0.38 1.011 -0.006 1.396 C21.575 29.84 20.347 31 18 31z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 13.503 14.845
                moveTo(x = 13.503f, y = 14.845f)
                // c 3.124 3.124 4.39 6.923 2.828 8.485
                curveToRelative(
                    dx1 = 3.124f,
                    dy1 = 3.124f,
                    dx2 = 4.39f,
                    dy2 = 6.923f,
                    dx3 = 2.828f,
                    dy3 = 8.485f,
                )
                // c -1.562 1.562 -5.361 0.297 -8.485 -2.828
                curveToRelative(
                    dx1 = -1.562f,
                    dy1 = 1.562f,
                    dx2 = -5.361f,
                    dy2 = 0.297f,
                    dx3 = -8.485f,
                    dy3 = -2.828f,
                )
                // c -3.125 -3.124 -4.391 -6.923 -2.828 -8.485
                curveToRelative(
                    dx1 = -3.125f,
                    dy1 = -3.124f,
                    dx2 = -4.391f,
                    dy2 = -6.923f,
                    dx3 = -2.828f,
                    dy3 = -8.485f,
                )
                // s 5.361 -0.296 8.485 2.828z
                reflectiveCurveToRelative(
                    dx1 = 5.361f,
                    dy1 = -0.296f,
                    dx2 = 8.485f,
                    dy2 = 2.828f,
                )
                close()
                // M 22.497 14.845
                moveTo(x = 22.497f, y = 14.845f)
                // c -3.124 3.124 -4.39 6.923 -2.828 8.485
                curveToRelative(
                    dx1 = -3.124f,
                    dy1 = 3.124f,
                    dx2 = -4.39f,
                    dy2 = 6.923f,
                    dx3 = -2.828f,
                    dy3 = 8.485f,
                )
                // c 1.562 1.562 5.361 0.297 8.485 -2.828
                curveToRelative(
                    dx1 = 1.562f,
                    dy1 = 1.562f,
                    dx2 = 5.361f,
                    dy2 = 0.297f,
                    dx3 = 8.485f,
                    dy3 = -2.828f,
                )
                // c 3.125 -3.125 4.391 -6.923 2.828 -8.485
                curveToRelative(
                    dx1 = 3.125f,
                    dy1 = -3.125f,
                    dx2 = 4.391f,
                    dy2 = -6.923f,
                    dx3 = 2.828f,
                    dy3 = -8.485f,
                )
                // c -1.562 -1.562 -5.361 -0.297 -8.485 2.828z
                curveToRelative(
                    dx1 = -1.562f,
                    dy1 = -1.562f,
                    dx2 = -5.361f,
                    dy2 = -0.297f,
                    dx3 = -8.485f,
                    dy3 = 2.828f,
                )
                close()
                // M 18 31
                moveTo(x = 18.0f, y = 31.0f)
                // c -2.347 0 -3.575 -1.16 -3.707 -1.293
                curveToRelative(
                    dx1 = -2.347f,
                    dy1 = 0.0f,
                    dx2 = -3.575f,
                    dy2 = -1.16f,
                    dx3 = -3.707f,
                    dy3 = -1.293f,
                )
                // c -0.391 -0.391 -0.391 -1.023 0 -1.414
                curveToRelative(
                    dx1 = -0.391f,
                    dy1 = -0.391f,
                    dx2 = -0.391f,
                    dy2 = -1.023f,
                    dx3 = 0.0f,
                    dy3 = -1.414f,
                )
                // c 0.387 -0.387 1.013 -0.391 1.404 -0.01
                curveToRelative(
                    dx1 = 0.387f,
                    dy1 = -0.387f,
                    dx2 = 1.013f,
                    dy2 = -0.391f,
                    dx3 = 1.404f,
                    dy3 = -0.01f,
                )
                // c 0.051 0.047 0.806 0.717 2.303 0.717
                curveToRelative(
                    dx1 = 0.051f,
                    dy1 = 0.047f,
                    dx2 = 0.806f,
                    dy2 = 0.717f,
                    dx3 = 2.303f,
                    dy3 = 0.717f,
                )
                // c 1.519 0 2.273 -0.689 2.305 -0.719
                curveToRelative(
                    dx1 = 1.519f,
                    dy1 = 0.0f,
                    dx2 = 2.273f,
                    dy2 = -0.689f,
                    dx3 = 2.305f,
                    dy3 = -0.719f,
                )
                // c 0.398 -0.374 1.027 -0.363 1.408 0.029
                curveToRelative(
                    dx1 = 0.398f,
                    dy1 = -0.374f,
                    dx2 = 1.027f,
                    dy2 = -0.363f,
                    dx3 = 1.408f,
                    dy3 = 0.029f,
                )
                // c 0.379 0.393 0.38 1.011 -0.006 1.396
                curveToRelative(
                    dx1 = 0.379f,
                    dy1 = 0.393f,
                    dx2 = 0.38f,
                    dy2 = 1.011f,
                    dx3 = -0.006f,
                    dy3 = 1.396f,
                )
                // C 21.575 29.84 20.347 31 18 31z
                curveTo(
                    x1 = 21.575f,
                    y1 = 29.84f,
                    x2 = 20.347f,
                    y2 = 31.0f,
                    x3 = 18.0f,
                    y3 = 31.0f,
                )
                close()
            }
        }.build().also { _emoji1f47d = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f47d: ImageVector? = null
