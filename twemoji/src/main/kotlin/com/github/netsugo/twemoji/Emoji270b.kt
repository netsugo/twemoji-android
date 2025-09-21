package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji270b: ImageVector
    get() {
        val current = _emoji270b
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji270b",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M20.5 2.965 c-1.381 0 -2.5 1.119 -2.5 2.5 v0.005 L15.5 0.465 c-1.381 0 -2.5 1.119 -2.5 2.5 V4.25 l-2.5 -1.535 c-1.381 0 -2.5 1.119 -2.5 2.5 V8.75 L7 18 h13.542 L20.5 2.965z
            path(
                fill = SolidColor(Color(0xFFEF9645)),
            ) {
                // M 20.5 2.965
                moveTo(x = 20.5f, y = 2.965f)
                // c -1.381 0 -2.5 1.119 -2.5 2.5
                curveToRelative(
                    dx1 = -1.381f,
                    dy1 = 0.0f,
                    dx2 = -2.5f,
                    dy2 = 1.119f,
                    dx3 = -2.5f,
                    dy3 = 2.5f,
                )
                // v 0.005
                verticalLineToRelative(dy = 0.005f)
                // L 15.5 0.465
                lineTo(x = 15.5f, y = 0.465f)
                // c -1.381 0 -2.5 1.119 -2.5 2.5
                curveToRelative(
                    dx1 = -1.381f,
                    dy1 = 0.0f,
                    dx2 = -2.5f,
                    dy2 = 1.119f,
                    dx3 = -2.5f,
                    dy3 = 2.5f,
                )
                // V 4.25
                verticalLineTo(y = 4.25f)
                // l -2.5 -1.535
                lineToRelative(dx = -2.5f, dy = -1.535f)
                // c -1.381 0 -2.5 1.119 -2.5 2.5
                curveToRelative(
                    dx1 = -1.381f,
                    dy1 = 0.0f,
                    dx2 = -2.5f,
                    dy2 = 1.119f,
                    dx3 = -2.5f,
                    dy3 = 2.5f,
                )
                // V 8.75
                verticalLineTo(y = 8.75f)
                // L 7 18
                lineTo(x = 7.0f, y = 18.0f)
                // h 13.542
                horizontalLineToRelative(dx = 13.542f)
                // L 20.5 2.965z
                lineTo(x = 20.5f, y = 2.965f)
                close()
            }
            // M31.375 16.219 c-1.381 -0.611 -3.354 0.208 -4.75 2.188 -0.917 1.3 -1.187 3.151 -2.391 3.344 -0.46 0.073 -1.234 -0.313 -1.234 -1.397 V4.5 s0 -2 -2 -2 -2 2 -2 2 v11.633 c0 -0.029 -1 -0.064 -1 -0.082 V2 s0 -2 -2 -2 -2 2 -2 2 v14.053 c0 0.017 -1 0.041 -1 0.069 V4.25 s0 -2 -2 -2 -2 2 -2 2 v12.638 c0 0.118 -1 0.251 -1 0.398 V8.75 s0 -2 -2 -2 -2 2 -2 2 V24 c0 6.627 5.373 12 12 12 4.775 0 8.06 -2.598 9.896 -5.292 1.557 -2.285 2.009 -4.658 2.104 -5.375 0 0 0.123 -1.479 1.156 -2.865 1.469 -1.969 2.5 -3.156 3.125 -3.866 0.317 -0.358 0.625 -1.706 -0.906 -2.383z
            path(
                fill = SolidColor(Color(0xFFFFDC5D)),
            ) {
                // M 31.375 16.219
                moveTo(x = 31.375f, y = 16.219f)
                // c -1.381 -0.611 -3.354 0.208 -4.75 2.188
                curveToRelative(
                    dx1 = -1.381f,
                    dy1 = -0.611f,
                    dx2 = -3.354f,
                    dy2 = 0.208f,
                    dx3 = -4.75f,
                    dy3 = 2.188f,
                )
                // c -0.917 1.3 -1.187 3.151 -2.391 3.344
                curveToRelative(
                    dx1 = -0.917f,
                    dy1 = 1.3f,
                    dx2 = -1.187f,
                    dy2 = 3.151f,
                    dx3 = -2.391f,
                    dy3 = 3.344f,
                )
                // c -0.46 0.073 -1.234 -0.313 -1.234 -1.397
                curveToRelative(
                    dx1 = -0.46f,
                    dy1 = 0.073f,
                    dx2 = -1.234f,
                    dy2 = -0.313f,
                    dx3 = -1.234f,
                    dy3 = -1.397f,
                )
                // V 4.5
                verticalLineTo(y = 4.5f)
                // s 0 -2 -2 -2
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                    dx2 = -2.0f,
                    dy2 = -2.0f,
                )
                // s -2 2 -2 2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                    dx2 = -2.0f,
                    dy2 = 2.0f,
                )
                // v 11.633
                verticalLineToRelative(dy = 11.633f)
                // c 0 -0.029 -1 -0.064 -1 -0.082
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.029f,
                    dx2 = -1.0f,
                    dy2 = -0.064f,
                    dx3 = -1.0f,
                    dy3 = -0.082f,
                )
                // V 2
                verticalLineTo(y = 2.0f)
                // s 0 -2 -2 -2
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                    dx2 = -2.0f,
                    dy2 = -2.0f,
                )
                // s -2 2 -2 2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                    dx2 = -2.0f,
                    dy2 = 2.0f,
                )
                // v 14.053
                verticalLineToRelative(dy = 14.053f)
                // c 0 0.017 -1 0.041 -1 0.069
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.017f,
                    dx2 = -1.0f,
                    dy2 = 0.041f,
                    dx3 = -1.0f,
                    dy3 = 0.069f,
                )
                // V 4.25
                verticalLineTo(y = 4.25f)
                // s 0 -2 -2 -2
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                    dx2 = -2.0f,
                    dy2 = -2.0f,
                )
                // s -2 2 -2 2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                    dx2 = -2.0f,
                    dy2 = 2.0f,
                )
                // v 12.638
                verticalLineToRelative(dy = 12.638f)
                // c 0 0.118 -1 0.251 -1 0.398
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.118f,
                    dx2 = -1.0f,
                    dy2 = 0.251f,
                    dx3 = -1.0f,
                    dy3 = 0.398f,
                )
                // V 8.75
                verticalLineTo(y = 8.75f)
                // s 0 -2 -2 -2
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                    dx2 = -2.0f,
                    dy2 = -2.0f,
                )
                // s -2 2 -2 2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                    dx2 = -2.0f,
                    dy2 = 2.0f,
                )
                // V 24
                verticalLineTo(y = 24.0f)
                // c 0 6.627 5.373 12 12 12
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 6.627f,
                    dx2 = 5.373f,
                    dy2 = 12.0f,
                    dx3 = 12.0f,
                    dy3 = 12.0f,
                )
                // c 4.775 0 8.06 -2.598 9.896 -5.292
                curveToRelative(
                    dx1 = 4.775f,
                    dy1 = 0.0f,
                    dx2 = 8.06f,
                    dy2 = -2.598f,
                    dx3 = 9.896f,
                    dy3 = -5.292f,
                )
                // c 1.557 -2.285 2.009 -4.658 2.104 -5.375
                curveToRelative(
                    dx1 = 1.557f,
                    dy1 = -2.285f,
                    dx2 = 2.009f,
                    dy2 = -4.658f,
                    dx3 = 2.104f,
                    dy3 = -5.375f,
                )
                // c 0 0 0.123 -1.479 1.156 -2.865
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 0.123f,
                    dy2 = -1.479f,
                    dx3 = 1.156f,
                    dy3 = -2.865f,
                )
                // c 1.469 -1.969 2.5 -3.156 3.125 -3.866
                curveToRelative(
                    dx1 = 1.469f,
                    dy1 = -1.969f,
                    dx2 = 2.5f,
                    dy2 = -3.156f,
                    dx3 = 3.125f,
                    dy3 = -3.866f,
                )
                // c 0.317 -0.358 0.625 -1.706 -0.906 -2.383z
                curveToRelative(
                    dx1 = 0.317f,
                    dy1 = -0.358f,
                    dx2 = 0.625f,
                    dy2 = -1.706f,
                    dx3 = -0.906f,
                    dy3 = -2.383f,
                )
                close()
            }
            // M23.439 21.471 c-0.297 -0.266 -0.372 -0.552 -0.417 -0.808 -1.892 0.259 -4.457 0.789 -6.427 2.715 -2.556 2.499 -2.992 5.2 -2.971 7.007 0.017 1.457 0.812 2.147 1.045 -0.012 0.292 -2.706 2.254 -8.063 8.784 -8.58 0.028 -0.002 0.387 -0.024 0.591 -0.035 0 0 -0.352 -0.06 -0.605 -0.287z
            path(
                fill = SolidColor(Color(0xFFEF9645)),
            ) {
                // M 23.439 21.471
                moveTo(x = 23.439f, y = 21.471f)
                // c -0.297 -0.266 -0.372 -0.552 -0.417 -0.808
                curveToRelative(
                    dx1 = -0.297f,
                    dy1 = -0.266f,
                    dx2 = -0.372f,
                    dy2 = -0.552f,
                    dx3 = -0.417f,
                    dy3 = -0.808f,
                )
                // c -1.892 0.259 -4.457 0.789 -6.427 2.715
                curveToRelative(
                    dx1 = -1.892f,
                    dy1 = 0.259f,
                    dx2 = -4.457f,
                    dy2 = 0.789f,
                    dx3 = -6.427f,
                    dy3 = 2.715f,
                )
                // c -2.556 2.499 -2.992 5.2 -2.971 7.007
                curveToRelative(
                    dx1 = -2.556f,
                    dy1 = 2.499f,
                    dx2 = -2.992f,
                    dy2 = 5.2f,
                    dx3 = -2.971f,
                    dy3 = 7.007f,
                )
                // c 0.017 1.457 0.812 2.147 1.045 -0.012
                curveToRelative(
                    dx1 = 0.017f,
                    dy1 = 1.457f,
                    dx2 = 0.812f,
                    dy2 = 2.147f,
                    dx3 = 1.045f,
                    dy3 = -0.012f,
                )
                // c 0.292 -2.706 2.254 -8.063 8.784 -8.58
                curveToRelative(
                    dx1 = 0.292f,
                    dy1 = -2.706f,
                    dx2 = 2.254f,
                    dy2 = -8.063f,
                    dx3 = 8.784f,
                    dy3 = -8.58f,
                )
                // c 0.028 -0.002 0.387 -0.024 0.591 -0.035
                curveToRelative(
                    dx1 = 0.028f,
                    dy1 = -0.002f,
                    dx2 = 0.387f,
                    dy2 = -0.024f,
                    dx3 = 0.591f,
                    dy3 = -0.035f,
                )
                // c 0 0 -0.352 -0.06 -0.605 -0.287z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -0.352f,
                    dy2 = -0.06f,
                    dx3 = -0.605f,
                    dy3 = -0.287f,
                )
                close()
            }
        }.build().also { _emoji270b = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji270b: ImageVector? = null
