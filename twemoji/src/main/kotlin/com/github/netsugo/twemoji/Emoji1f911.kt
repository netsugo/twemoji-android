package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f911: ImageVector
    get() {
        val current = _emoji1f911
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f911",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 18 c0 9.941 -8.059 18 -18 18 -9.94 0 -18 -8.059 -18 -18 C0 8.06 8.06 0 18 0 c9.941 0 18 8.06 18 18
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 36 18
                moveTo(x = 36.0f, y = 18.0f)
                // c 0 9.941 -8.059 18 -18 18
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 9.941f,
                    dx2 = -8.059f,
                    dy2 = 18.0f,
                    dx3 = -18.0f,
                    dy3 = 18.0f,
                )
                // c -9.94 0 -18 -8.059 -18 -18
                curveToRelative(
                    dx1 = -9.94f,
                    dy1 = 0.0f,
                    dx2 = -18.0f,
                    dy2 = -8.059f,
                    dx3 = -18.0f,
                    dy3 = -18.0f,
                )
                // C 0 8.06 8.06 0 18 0
                curveTo(
                    x1 = 0.0f,
                    y1 = 8.06f,
                    x2 = 8.06f,
                    y2 = 0.0f,
                    x3 = 18.0f,
                    y3 = 0.0f,
                )
                // c 9.941 0 18 8.06 18 18
                curveToRelative(
                    dx1 = 9.941f,
                    dy1 = 0.0f,
                    dx2 = 18.0f,
                    dy2 = 8.06f,
                    dx3 = 18.0f,
                    dy3 = 18.0f,
                )
            }
            // M7 21.263 c0 3.964 4.596 9 11 9 s11 -5 11 -9 c0 0 -10.333 2.756 -22 0z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 7 21.263
                moveTo(x = 7.0f, y = 21.263f)
                // c 0 3.964 4.596 9 11 9
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.964f,
                    dx2 = 4.596f,
                    dy2 = 9.0f,
                    dx3 = 11.0f,
                    dy3 = 9.0f,
                )
                // s 11 -5 11 -9
                reflectiveCurveToRelative(
                    dx1 = 11.0f,
                    dy1 = -5.0f,
                    dx2 = 11.0f,
                    dy2 = -9.0f,
                )
                // c 0 0 -10.333 2.756 -22 0z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -10.333f,
                    dy2 = 2.756f,
                    dx3 = -22.0f,
                    dy3 = 0.0f,
                )
                close()
            }
            // M12 23.003 v6.961 c0 3 2 6 6 6 s6 -3 6 -6 v-6.92 c-6.291 1.292 -12 -0.041 -12 -0.041z
            path(
                fill = SolidColor(Color(0xFF5D9040)),
            ) {
                // M 12 23.003
                moveTo(x = 12.0f, y = 23.003f)
                // v 6.961
                verticalLineToRelative(dy = 6.961f)
                // c 0 3 2 6 6 6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.0f,
                    dx2 = 2.0f,
                    dy2 = 6.0f,
                    dx3 = 6.0f,
                    dy3 = 6.0f,
                )
                // s 6 -3 6 -6
                reflectiveCurveToRelative(
                    dx1 = 6.0f,
                    dy1 = -3.0f,
                    dx2 = 6.0f,
                    dy2 = -6.0f,
                )
                // v -6.92
                verticalLineToRelative(dy = -6.92f)
                // c -6.291 1.292 -12 -0.041 -12 -0.041z
                curveToRelative(
                    dx1 = -6.291f,
                    dy1 = 1.292f,
                    dx2 = -12.0f,
                    dy2 = -0.041f,
                    dx3 = -12.0f,
                    dy3 = -0.041f,
                )
                close()
            }
            // M12.284 12.33 c-0.756 -0.292 -1.471 -0.568 -1.471 -0.968 0 -0.659 0.884 -0.693 1.061 -0.693 0.625 0 0.936 0.234 1.21 0.441 0.21 0.159 0.428 0.323 0.731 0.323 0.564 0 0.821 -0.397 0.821 -0.766 0 -0.736 -0.902 -1.256 -1.858 -1.474 L12.778 8.8 c0 -0.518 -0.421 -0.939 -0.939 -0.939 s-0.939 0.421 -0.939 0.939 v0.426 c-1.144 0.333 -1.845 1.174 -1.845 2.235 0 1.311 1.293 1.849 2.434 2.323 0.817 0.34 1.589 0.661 1.589 1.162 0 0.366 -0.46 0.762 -1.203 0.762 -0.75 0 -1.18 -0.3 -1.56 -0.564 -0.262 -0.183 -0.51 -0.356 -0.806 -0.356 -0.43 0 -0.766 0.362 -0.766 0.824 0 0.679 0.931 1.356 2.157 1.594 v0.47 c0 0.518 0.421 0.938 0.939 0.938 s0.939 -0.421 0.939 -0.938 l-0.005 -0.498 c1.296 -0.315 2.062 -1.222 2.062 -2.459 0.001 -1.404 -1.414 -1.95 -2.551 -2.389z M26.694 14.736 c0 -1.404 -1.415 -1.95 -2.552 -2.389 -0.756 -0.292 -1.47 -0.568 -1.47 -0.968 0 -0.659 0.884 -0.693 1.061 -0.693 0.625 0 0.935 0.234 1.21 0.441 0.211 0.159 0.428 0.323 0.73 0.323 0.565 0 0.822 -0.397 0.822 -0.766 0 -0.737 -0.902 -1.256 -1.858 -1.474 v-0.392 c0 -0.518 -0.422 -0.939 -0.939 -0.939 -0.518 0 -0.94 0.421 -0.94 0.939 v0.426 c-1.143 0.333 -1.845 1.174 -1.845 2.235 0 1.311 1.293 1.849 2.434 2.323 0.817 0.34 1.589 0.661 1.589 1.162 0 0.366 -0.459 0.762 -1.202 0.762 -0.75 0 -1.18 -0.3 -1.559 -0.564 -0.263 -0.183 -0.511 -0.356 -0.806 -0.356 -0.431 0 -0.767 0.362 -0.767 0.824 0 0.679 0.931 1.356 2.156 1.594 v0.47 c0 0.517 0.423 0.938 0.941 0.938 s0.938 -0.421 0.938 -0.938 l-0.003 -0.498 c1.295 -0.317 2.06 -1.223 2.06 -2.46z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 12.284 12.33
                moveTo(x = 12.284f, y = 12.33f)
                // c -0.756 -0.292 -1.471 -0.568 -1.471 -0.968
                curveToRelative(
                    dx1 = -0.756f,
                    dy1 = -0.292f,
                    dx2 = -1.471f,
                    dy2 = -0.568f,
                    dx3 = -1.471f,
                    dy3 = -0.968f,
                )
                // c 0 -0.659 0.884 -0.693 1.061 -0.693
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.659f,
                    dx2 = 0.884f,
                    dy2 = -0.693f,
                    dx3 = 1.061f,
                    dy3 = -0.693f,
                )
                // c 0.625 0 0.936 0.234 1.21 0.441
                curveToRelative(
                    dx1 = 0.625f,
                    dy1 = 0.0f,
                    dx2 = 0.936f,
                    dy2 = 0.234f,
                    dx3 = 1.21f,
                    dy3 = 0.441f,
                )
                // c 0.21 0.159 0.428 0.323 0.731 0.323
                curveToRelative(
                    dx1 = 0.21f,
                    dy1 = 0.159f,
                    dx2 = 0.428f,
                    dy2 = 0.323f,
                    dx3 = 0.731f,
                    dy3 = 0.323f,
                )
                // c 0.564 0 0.821 -0.397 0.821 -0.766
                curveToRelative(
                    dx1 = 0.564f,
                    dy1 = 0.0f,
                    dx2 = 0.821f,
                    dy2 = -0.397f,
                    dx3 = 0.821f,
                    dy3 = -0.766f,
                )
                // c 0 -0.736 -0.902 -1.256 -1.858 -1.474
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.736f,
                    dx2 = -0.902f,
                    dy2 = -1.256f,
                    dx3 = -1.858f,
                    dy3 = -1.474f,
                )
                // L 12.778 8.8
                lineTo(x = 12.778f, y = 8.8f)
                // c 0 -0.518 -0.421 -0.939 -0.939 -0.939
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.518f,
                    dx2 = -0.421f,
                    dy2 = -0.939f,
                    dx3 = -0.939f,
                    dy3 = -0.939f,
                )
                // s -0.939 0.421 -0.939 0.939
                reflectiveCurveToRelative(
                    dx1 = -0.939f,
                    dy1 = 0.421f,
                    dx2 = -0.939f,
                    dy2 = 0.939f,
                )
                // v 0.426
                verticalLineToRelative(dy = 0.426f)
                // c -1.144 0.333 -1.845 1.174 -1.845 2.235
                curveToRelative(
                    dx1 = -1.144f,
                    dy1 = 0.333f,
                    dx2 = -1.845f,
                    dy2 = 1.174f,
                    dx3 = -1.845f,
                    dy3 = 2.235f,
                )
                // c 0 1.311 1.293 1.849 2.434 2.323
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.311f,
                    dx2 = 1.293f,
                    dy2 = 1.849f,
                    dx3 = 2.434f,
                    dy3 = 2.323f,
                )
                // c 0.817 0.34 1.589 0.661 1.589 1.162
                curveToRelative(
                    dx1 = 0.817f,
                    dy1 = 0.34f,
                    dx2 = 1.589f,
                    dy2 = 0.661f,
                    dx3 = 1.589f,
                    dy3 = 1.162f,
                )
                // c 0 0.366 -0.46 0.762 -1.203 0.762
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.366f,
                    dx2 = -0.46f,
                    dy2 = 0.762f,
                    dx3 = -1.203f,
                    dy3 = 0.762f,
                )
                // c -0.75 0 -1.18 -0.3 -1.56 -0.564
                curveToRelative(
                    dx1 = -0.75f,
                    dy1 = 0.0f,
                    dx2 = -1.18f,
                    dy2 = -0.3f,
                    dx3 = -1.56f,
                    dy3 = -0.564f,
                )
                // c -0.262 -0.183 -0.51 -0.356 -0.806 -0.356
                curveToRelative(
                    dx1 = -0.262f,
                    dy1 = -0.183f,
                    dx2 = -0.51f,
                    dy2 = -0.356f,
                    dx3 = -0.806f,
                    dy3 = -0.356f,
                )
                // c -0.43 0 -0.766 0.362 -0.766 0.824
                curveToRelative(
                    dx1 = -0.43f,
                    dy1 = 0.0f,
                    dx2 = -0.766f,
                    dy2 = 0.362f,
                    dx3 = -0.766f,
                    dy3 = 0.824f,
                )
                // c 0 0.679 0.931 1.356 2.157 1.594
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.679f,
                    dx2 = 0.931f,
                    dy2 = 1.356f,
                    dx3 = 2.157f,
                    dy3 = 1.594f,
                )
                // v 0.47
                verticalLineToRelative(dy = 0.47f)
                // c 0 0.518 0.421 0.938 0.939 0.938
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.518f,
                    dx2 = 0.421f,
                    dy2 = 0.938f,
                    dx3 = 0.939f,
                    dy3 = 0.938f,
                )
                // s 0.939 -0.421 0.939 -0.938
                reflectiveCurveToRelative(
                    dx1 = 0.939f,
                    dy1 = -0.421f,
                    dx2 = 0.939f,
                    dy2 = -0.938f,
                )
                // l -0.005 -0.498
                lineToRelative(dx = -0.005f, dy = -0.498f)
                // c 1.296 -0.315 2.062 -1.222 2.062 -2.459
                curveToRelative(
                    dx1 = 1.296f,
                    dy1 = -0.315f,
                    dx2 = 2.062f,
                    dy2 = -1.222f,
                    dx3 = 2.062f,
                    dy3 = -2.459f,
                )
                // c 0.001 -1.404 -1.414 -1.95 -2.551 -2.389z
                curveToRelative(
                    dx1 = 0.001f,
                    dy1 = -1.404f,
                    dx2 = -1.414f,
                    dy2 = -1.95f,
                    dx3 = -2.551f,
                    dy3 = -2.389f,
                )
                close()
                // M 26.694 14.736
                moveTo(x = 26.694f, y = 14.736f)
                // c 0 -1.404 -1.415 -1.95 -2.552 -2.389
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.404f,
                    dx2 = -1.415f,
                    dy2 = -1.95f,
                    dx3 = -2.552f,
                    dy3 = -2.389f,
                )
                // c -0.756 -0.292 -1.47 -0.568 -1.47 -0.968
                curveToRelative(
                    dx1 = -0.756f,
                    dy1 = -0.292f,
                    dx2 = -1.47f,
                    dy2 = -0.568f,
                    dx3 = -1.47f,
                    dy3 = -0.968f,
                )
                // c 0 -0.659 0.884 -0.693 1.061 -0.693
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.659f,
                    dx2 = 0.884f,
                    dy2 = -0.693f,
                    dx3 = 1.061f,
                    dy3 = -0.693f,
                )
                // c 0.625 0 0.935 0.234 1.21 0.441
                curveToRelative(
                    dx1 = 0.625f,
                    dy1 = 0.0f,
                    dx2 = 0.935f,
                    dy2 = 0.234f,
                    dx3 = 1.21f,
                    dy3 = 0.441f,
                )
                // c 0.211 0.159 0.428 0.323 0.73 0.323
                curveToRelative(
                    dx1 = 0.211f,
                    dy1 = 0.159f,
                    dx2 = 0.428f,
                    dy2 = 0.323f,
                    dx3 = 0.73f,
                    dy3 = 0.323f,
                )
                // c 0.565 0 0.822 -0.397 0.822 -0.766
                curveToRelative(
                    dx1 = 0.565f,
                    dy1 = 0.0f,
                    dx2 = 0.822f,
                    dy2 = -0.397f,
                    dx3 = 0.822f,
                    dy3 = -0.766f,
                )
                // c 0 -0.737 -0.902 -1.256 -1.858 -1.474
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.737f,
                    dx2 = -0.902f,
                    dy2 = -1.256f,
                    dx3 = -1.858f,
                    dy3 = -1.474f,
                )
                // v -0.392
                verticalLineToRelative(dy = -0.392f)
                // c 0 -0.518 -0.422 -0.939 -0.939 -0.939
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.518f,
                    dx2 = -0.422f,
                    dy2 = -0.939f,
                    dx3 = -0.939f,
                    dy3 = -0.939f,
                )
                // c -0.518 0 -0.94 0.421 -0.94 0.939
                curveToRelative(
                    dx1 = -0.518f,
                    dy1 = 0.0f,
                    dx2 = -0.94f,
                    dy2 = 0.421f,
                    dx3 = -0.94f,
                    dy3 = 0.939f,
                )
                // v 0.426
                verticalLineToRelative(dy = 0.426f)
                // c -1.143 0.333 -1.845 1.174 -1.845 2.235
                curveToRelative(
                    dx1 = -1.143f,
                    dy1 = 0.333f,
                    dx2 = -1.845f,
                    dy2 = 1.174f,
                    dx3 = -1.845f,
                    dy3 = 2.235f,
                )
                // c 0 1.311 1.293 1.849 2.434 2.323
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.311f,
                    dx2 = 1.293f,
                    dy2 = 1.849f,
                    dx3 = 2.434f,
                    dy3 = 2.323f,
                )
                // c 0.817 0.34 1.589 0.661 1.589 1.162
                curveToRelative(
                    dx1 = 0.817f,
                    dy1 = 0.34f,
                    dx2 = 1.589f,
                    dy2 = 0.661f,
                    dx3 = 1.589f,
                    dy3 = 1.162f,
                )
                // c 0 0.366 -0.459 0.762 -1.202 0.762
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.366f,
                    dx2 = -0.459f,
                    dy2 = 0.762f,
                    dx3 = -1.202f,
                    dy3 = 0.762f,
                )
                // c -0.75 0 -1.18 -0.3 -1.559 -0.564
                curveToRelative(
                    dx1 = -0.75f,
                    dy1 = 0.0f,
                    dx2 = -1.18f,
                    dy2 = -0.3f,
                    dx3 = -1.559f,
                    dy3 = -0.564f,
                )
                // c -0.263 -0.183 -0.511 -0.356 -0.806 -0.356
                curveToRelative(
                    dx1 = -0.263f,
                    dy1 = -0.183f,
                    dx2 = -0.511f,
                    dy2 = -0.356f,
                    dx3 = -0.806f,
                    dy3 = -0.356f,
                )
                // c -0.431 0 -0.767 0.362 -0.767 0.824
                curveToRelative(
                    dx1 = -0.431f,
                    dy1 = 0.0f,
                    dx2 = -0.767f,
                    dy2 = 0.362f,
                    dx3 = -0.767f,
                    dy3 = 0.824f,
                )
                // c 0 0.679 0.931 1.356 2.156 1.594
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.679f,
                    dx2 = 0.931f,
                    dy2 = 1.356f,
                    dx3 = 2.156f,
                    dy3 = 1.594f,
                )
                // v 0.47
                verticalLineToRelative(dy = 0.47f)
                // c 0 0.517 0.423 0.938 0.941 0.938
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.517f,
                    dx2 = 0.423f,
                    dy2 = 0.938f,
                    dx3 = 0.941f,
                    dy3 = 0.938f,
                )
                // s 0.938 -0.421 0.938 -0.938
                reflectiveCurveToRelative(
                    dx1 = 0.938f,
                    dy1 = -0.421f,
                    dx2 = 0.938f,
                    dy2 = -0.938f,
                )
                // l -0.003 -0.498
                lineToRelative(dx = -0.003f, dy = -0.498f)
                // c 1.295 -0.317 2.06 -1.223 2.06 -2.46z
                curveToRelative(
                    dx1 = 1.295f,
                    dy1 = -0.317f,
                    dx2 = 2.06f,
                    dy2 = -1.223f,
                    dx3 = 2.06f,
                    dy3 = -2.46f,
                )
                close()
            }
            // M20.97 31.069 c0 -1.368 -1.379 -1.901 -2.487 -2.329 -0.737 -0.284 -1.434 -0.554 -1.434 -0.943 0 -0.643 0.861 -0.675 1.034 -0.675 0.609 0 0.912 0.229 1.18 0.43 0.205 0.155 0.418 0.315 0.713 0.315 0.55 0 0.801 -0.388 0.801 -0.747 0 -0.717 -0.879 -1.224 -1.812 -1.437 V25.3 c0 -0.505 -0.411 -0.916 -0.916 -0.916 s-0.916 0.411 -0.916 0.916 v0.415 c-1.115 0.324 -1.799 1.145 -1.799 2.179 0 1.278 1.261 1.803 2.373 2.265 0.797 0.331 1.549 0.644 1.549 1.132 0 0.357 -0.448 0.743 -1.173 0.743 -0.731 0 -1.15 -0.292 -1.52 -0.551 -0.255 -0.178 -0.497 -0.347 -0.785 -0.347 -0.419 0 -0.748 0.354 -0.748 0.804 0 0.663 0.907 1.322 2.102 1.554 v0.459 c0 0.504 0.411 0.914 0.917 0.914 0.505 0 0.915 -0.41 0.915 -0.914 l-0.003 -0.486 c1.263 -0.309 2.009 -1.193 2.009 -2.398z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 20.97 31.069
                moveTo(x = 20.97f, y = 31.069f)
                // c 0 -1.368 -1.379 -1.901 -2.487 -2.329
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.368f,
                    dx2 = -1.379f,
                    dy2 = -1.901f,
                    dx3 = -2.487f,
                    dy3 = -2.329f,
                )
                // c -0.737 -0.284 -1.434 -0.554 -1.434 -0.943
                curveToRelative(
                    dx1 = -0.737f,
                    dy1 = -0.284f,
                    dx2 = -1.434f,
                    dy2 = -0.554f,
                    dx3 = -1.434f,
                    dy3 = -0.943f,
                )
                // c 0 -0.643 0.861 -0.675 1.034 -0.675
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.643f,
                    dx2 = 0.861f,
                    dy2 = -0.675f,
                    dx3 = 1.034f,
                    dy3 = -0.675f,
                )
                // c 0.609 0 0.912 0.229 1.18 0.43
                curveToRelative(
                    dx1 = 0.609f,
                    dy1 = 0.0f,
                    dx2 = 0.912f,
                    dy2 = 0.229f,
                    dx3 = 1.18f,
                    dy3 = 0.43f,
                )
                // c 0.205 0.155 0.418 0.315 0.713 0.315
                curveToRelative(
                    dx1 = 0.205f,
                    dy1 = 0.155f,
                    dx2 = 0.418f,
                    dy2 = 0.315f,
                    dx3 = 0.713f,
                    dy3 = 0.315f,
                )
                // c 0.55 0 0.801 -0.388 0.801 -0.747
                curveToRelative(
                    dx1 = 0.55f,
                    dy1 = 0.0f,
                    dx2 = 0.801f,
                    dy2 = -0.388f,
                    dx3 = 0.801f,
                    dy3 = -0.747f,
                )
                // c 0 -0.717 -0.879 -1.224 -1.812 -1.437
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.717f,
                    dx2 = -0.879f,
                    dy2 = -1.224f,
                    dx3 = -1.812f,
                    dy3 = -1.437f,
                )
                // V 25.3
                verticalLineTo(y = 25.3f)
                // c 0 -0.505 -0.411 -0.916 -0.916 -0.916
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.505f,
                    dx2 = -0.411f,
                    dy2 = -0.916f,
                    dx3 = -0.916f,
                    dy3 = -0.916f,
                )
                // s -0.916 0.411 -0.916 0.916
                reflectiveCurveToRelative(
                    dx1 = -0.916f,
                    dy1 = 0.411f,
                    dx2 = -0.916f,
                    dy2 = 0.916f,
                )
                // v 0.415
                verticalLineToRelative(dy = 0.415f)
                // c -1.115 0.324 -1.799 1.145 -1.799 2.179
                curveToRelative(
                    dx1 = -1.115f,
                    dy1 = 0.324f,
                    dx2 = -1.799f,
                    dy2 = 1.145f,
                    dx3 = -1.799f,
                    dy3 = 2.179f,
                )
                // c 0 1.278 1.261 1.803 2.373 2.265
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.278f,
                    dx2 = 1.261f,
                    dy2 = 1.803f,
                    dx3 = 2.373f,
                    dy3 = 2.265f,
                )
                // c 0.797 0.331 1.549 0.644 1.549 1.132
                curveToRelative(
                    dx1 = 0.797f,
                    dy1 = 0.331f,
                    dx2 = 1.549f,
                    dy2 = 0.644f,
                    dx3 = 1.549f,
                    dy3 = 1.132f,
                )
                // c 0 0.357 -0.448 0.743 -1.173 0.743
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.357f,
                    dx2 = -0.448f,
                    dy2 = 0.743f,
                    dx3 = -1.173f,
                    dy3 = 0.743f,
                )
                // c -0.731 0 -1.15 -0.292 -1.52 -0.551
                curveToRelative(
                    dx1 = -0.731f,
                    dy1 = 0.0f,
                    dx2 = -1.15f,
                    dy2 = -0.292f,
                    dx3 = -1.52f,
                    dy3 = -0.551f,
                )
                // c -0.255 -0.178 -0.497 -0.347 -0.785 -0.347
                curveToRelative(
                    dx1 = -0.255f,
                    dy1 = -0.178f,
                    dx2 = -0.497f,
                    dy2 = -0.347f,
                    dx3 = -0.785f,
                    dy3 = -0.347f,
                )
                // c -0.419 0 -0.748 0.354 -0.748 0.804
                curveToRelative(
                    dx1 = -0.419f,
                    dy1 = 0.0f,
                    dx2 = -0.748f,
                    dy2 = 0.354f,
                    dx3 = -0.748f,
                    dy3 = 0.804f,
                )
                // c 0 0.663 0.907 1.322 2.102 1.554
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.663f,
                    dx2 = 0.907f,
                    dy2 = 1.322f,
                    dx3 = 2.102f,
                    dy3 = 1.554f,
                )
                // v 0.459
                verticalLineToRelative(dy = 0.459f)
                // c 0 0.504 0.411 0.914 0.917 0.914
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.504f,
                    dx2 = 0.411f,
                    dy2 = 0.914f,
                    dx3 = 0.917f,
                    dy3 = 0.914f,
                )
                // c 0.505 0 0.915 -0.41 0.915 -0.914
                curveToRelative(
                    dx1 = 0.505f,
                    dy1 = 0.0f,
                    dx2 = 0.915f,
                    dy2 = -0.41f,
                    dx3 = 0.915f,
                    dy3 = -0.914f,
                )
                // l -0.003 -0.486
                lineToRelative(dx = -0.003f, dy = -0.486f)
                // c 1.263 -0.309 2.009 -1.193 2.009 -2.398z
                curveToRelative(
                    dx1 = 1.263f,
                    dy1 = -0.309f,
                    dx2 = 2.009f,
                    dy2 = -1.193f,
                    dx3 = 2.009f,
                    dy3 = -2.398f,
                )
                close()
            }
        }.build().also { _emoji1f911 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f911: ImageVector? = null
