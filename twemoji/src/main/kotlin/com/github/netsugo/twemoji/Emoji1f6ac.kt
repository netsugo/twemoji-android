package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f6ac: ImageVector
    get() {
        val current = _emoji1f6ac
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f6ac",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M13 30 H2 s-2 0 -2 -2 v-5 c0 -2 2 -2 2 -2 h11 v9z
            path(
                fill = SolidColor(Color(0xFFD99E82)),
            ) {
                // M 13 30
                moveTo(x = 13.0f, y = 30.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // s -2 0 -2 -2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -2.0f,
                )
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // c 0 -2 2 -2 2 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // h 11
                horizontalLineToRelative(dx = 11.0f)
                // v 9z
                verticalLineToRelative(dy = 9.0f)
                close()
            }
            // M12 21 h14 v9 H12z
            path(
                fill = SolidColor(Color(0xFFE1E8ED)),
            ) {
                // M 12 21
                moveTo(x = 12.0f, y = 21.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // v 9
                verticalLineToRelative(dy = 9.0f)
                // H 12z
                horizontalLineTo(x = 12.0f)
                close()
            }
            // M31 21 h-6 v9 h6 s2 0 2 -2 v-5 c0 -2 -2 -2 -2 -2z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 31 21
                moveTo(x = 31.0f, y = 21.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // v 9
                verticalLineToRelative(dy = 9.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // s 2 0 2 -2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // c 0 -2 -2 -2 -2 -2z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                    dx2 = -2.0f,
                    dy2 = -2.0f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                close()
            }
            // M27.79 20 c-0.488 0 -0.916 -0.358 -0.988 -0.855 -0.029 -0.2 -0.654 -4.924 4.475 -8.002 2.498 -1.499 3.063 -4.246 2.532 -6.164 C33.561 4.083 32.673 2 29.791 2 c-3.142 0 -3.963 1.77 -4.15 2.562 -0.282 1.197 0 2.141 0.625 2.594 0.649 0.47 1.423 0.332 1.932 0.017 0.389 -0.24 0.594 -0.646 0.594 -1.173 0 -0.552 0.447 -1 1 -1 0.553 0 1 0.448 1 1 0 1.221 -0.562 2.269 -1.542 2.874 -1.106 0.683 -2.819 0.538 -3.919 -0.077 -1.351 -0.756 -2.061 -2.623 -1.589 -4.619 C24.358 1.562 26.62 0 29.791 0 c2.908 0 5.186 1.703 5.945 4.445 0.889 3.208 -0.522 6.667 -3.431 8.412 -4 2.4 -3.53 5.962 -3.525 5.998 0.08 0.547 -0.299 1.055 -0.845 1.134 -0.048 0.008 -0.097 0.011 -0.145 0.011z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 27.79 20
                moveTo(x = 27.79f, y = 20.0f)
                // c -0.488 0 -0.916 -0.358 -0.988 -0.855
                curveToRelative(
                    dx1 = -0.488f,
                    dy1 = 0.0f,
                    dx2 = -0.916f,
                    dy2 = -0.358f,
                    dx3 = -0.988f,
                    dy3 = -0.855f,
                )
                // c -0.029 -0.2 -0.654 -4.924 4.475 -8.002
                curveToRelative(
                    dx1 = -0.029f,
                    dy1 = -0.2f,
                    dx2 = -0.654f,
                    dy2 = -4.924f,
                    dx3 = 4.475f,
                    dy3 = -8.002f,
                )
                // c 2.498 -1.499 3.063 -4.246 2.532 -6.164
                curveToRelative(
                    dx1 = 2.498f,
                    dy1 = -1.499f,
                    dx2 = 3.063f,
                    dy2 = -4.246f,
                    dx3 = 2.532f,
                    dy3 = -6.164f,
                )
                // C 33.561 4.083 32.673 2 29.791 2
                curveTo(
                    x1 = 33.561f,
                    y1 = 4.083f,
                    x2 = 32.673f,
                    y2 = 2.0f,
                    x3 = 29.791f,
                    y3 = 2.0f,
                )
                // c -3.142 0 -3.963 1.77 -4.15 2.562
                curveToRelative(
                    dx1 = -3.142f,
                    dy1 = 0.0f,
                    dx2 = -3.963f,
                    dy2 = 1.77f,
                    dx3 = -4.15f,
                    dy3 = 2.562f,
                )
                // c -0.282 1.197 0 2.141 0.625 2.594
                curveToRelative(
                    dx1 = -0.282f,
                    dy1 = 1.197f,
                    dx2 = 0.0f,
                    dy2 = 2.141f,
                    dx3 = 0.625f,
                    dy3 = 2.594f,
                )
                // c 0.649 0.47 1.423 0.332 1.932 0.017
                curveToRelative(
                    dx1 = 0.649f,
                    dy1 = 0.47f,
                    dx2 = 1.423f,
                    dy2 = 0.332f,
                    dx3 = 1.932f,
                    dy3 = 0.017f,
                )
                // c 0.389 -0.24 0.594 -0.646 0.594 -1.173
                curveToRelative(
                    dx1 = 0.389f,
                    dy1 = -0.24f,
                    dx2 = 0.594f,
                    dy2 = -0.646f,
                    dx3 = 0.594f,
                    dy3 = -1.173f,
                )
                // c 0 -0.552 0.447 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = 0.447f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // c 0.553 0 1 0.448 1 1
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.448f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // c 0 1.221 -0.562 2.269 -1.542 2.874
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.221f,
                    dx2 = -0.562f,
                    dy2 = 2.269f,
                    dx3 = -1.542f,
                    dy3 = 2.874f,
                )
                // c -1.106 0.683 -2.819 0.538 -3.919 -0.077
                curveToRelative(
                    dx1 = -1.106f,
                    dy1 = 0.683f,
                    dx2 = -2.819f,
                    dy2 = 0.538f,
                    dx3 = -3.919f,
                    dy3 = -0.077f,
                )
                // c -1.351 -0.756 -2.061 -2.623 -1.589 -4.619
                curveToRelative(
                    dx1 = -1.351f,
                    dy1 = -0.756f,
                    dx2 = -2.061f,
                    dy2 = -2.623f,
                    dx3 = -1.589f,
                    dy3 = -4.619f,
                )
                // C 24.358 1.562 26.62 0 29.791 0
                curveTo(
                    x1 = 24.358f,
                    y1 = 1.562f,
                    x2 = 26.62f,
                    y2 = 0.0f,
                    x3 = 29.791f,
                    y3 = 0.0f,
                )
                // c 2.908 0 5.186 1.703 5.945 4.445
                curveToRelative(
                    dx1 = 2.908f,
                    dy1 = 0.0f,
                    dx2 = 5.186f,
                    dy2 = 1.703f,
                    dx3 = 5.945f,
                    dy3 = 4.445f,
                )
                // c 0.889 3.208 -0.522 6.667 -3.431 8.412
                curveToRelative(
                    dx1 = 0.889f,
                    dy1 = 3.208f,
                    dx2 = -0.522f,
                    dy2 = 6.667f,
                    dx3 = -3.431f,
                    dy3 = 8.412f,
                )
                // c -4 2.4 -3.53 5.962 -3.525 5.998
                curveToRelative(
                    dx1 = -4.0f,
                    dy1 = 2.4f,
                    dx2 = -3.53f,
                    dy2 = 5.962f,
                    dx3 = -3.525f,
                    dy3 = 5.998f,
                )
                // c 0.08 0.547 -0.299 1.055 -0.845 1.134
                curveToRelative(
                    dx1 = 0.08f,
                    dy1 = 0.547f,
                    dx2 = -0.299f,
                    dy2 = 1.055f,
                    dx3 = -0.845f,
                    dy3 = 1.134f,
                )
                // c -0.048 0.008 -0.097 0.011 -0.145 0.011z
                curveToRelative(
                    dx1 = -0.048f,
                    dy1 = 0.008f,
                    dx2 = -0.097f,
                    dy2 = 0.011f,
                    dx3 = -0.145f,
                    dy3 = 0.011f,
                )
                close()
            }
        }.build().also { _emoji1f6ac = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f6ac: ImageVector? = null
