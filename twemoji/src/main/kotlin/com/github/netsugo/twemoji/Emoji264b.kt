package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji264b: ImageVector
    get() {
        val current = _emoji264b
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji264b",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 32 c0 2.209 -1.791 4 -4 4 H4 c-2.209 0 -4 -1.791 -4 -4 V4 c0 -2.209 1.791 -4 4 -4 h28 c2.209 0 4 1.791 4 4 v28z
            path(
                fill = SolidColor(Color(0xFF9266CC)),
            ) {
                // M 36 32
                moveTo(x = 36.0f, y = 32.0f)
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
                // V 4
                verticalLineTo(y = 4.0f)
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
                // v 28z
                verticalLineToRelative(dy = 28.0f)
                close()
            }
            // M11 17.279 c-2.813 0 -5.28 -2.467 -5.28 -5.279 0 -3.878 3.779 -6.279 7.28 -6.279 13.634 0 17.007 6.433 17.145 6.707 0.315 0.632 0.06 1.4 -0.572 1.716 -0.626 0.315 -1.39 0.064 -1.71 -0.559 -0.06 -0.108 -2.674 -4.676 -12.747 -5.247 0.773 0.914 1.164 2.142 1.164 3.663 -0.001 2.538 -2.019 5.278 -5.28 5.278z M9.834 9.269 c-0.922 0.653 -1.556 1.597 -1.556 2.731 0 1.232 1.214 2.721 2.722 2.721 1.627 0 2.721 -1.407 2.721 -2.72 0 -1.056 -0.269 -1.812 -0.799 -2.247 -0.969 -0.794 -2.593 -0.6 -2.609 -0.597 -0.143 0.028 -0.313 0.046 -0.479 0.112z M22.999 30.279 c-13.634 0 -17.007 -6.434 -17.144 -6.707 -0.316 -0.632 -0.06 -1.4 0.572 -1.717 0.627 -0.312 1.391 -0.062 1.71 0.56 0.06 0.108 2.674 4.677 12.746 5.247 -0.773 -0.913 -1.163 -2.141 -1.163 -3.662 0 -2.539 2.019 -5.279 5.279 -5.279 2.812 0 5.28 2.467 5.28 5.279 0 3.879 -3.779 6.279 -7.28 6.279z M24.999 21.279 c-1.628 0 -2.721 1.407 -2.721 2.721 0 1.056 0.269 1.812 0.799 2.247 0.97 0.794 2.673 0.6 2.688 0.597 0.142 -0.029 0.234 -0.062 0.399 -0.112 0.923 -0.653 1.556 -1.598 1.556 -2.731 0.001 -1.233 -1.213 -2.722 -2.721 -2.722z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 11 17.279
                moveTo(x = 11.0f, y = 17.279f)
                // c -2.813 0 -5.28 -2.467 -5.28 -5.279
                curveToRelative(
                    dx1 = -2.813f,
                    dy1 = 0.0f,
                    dx2 = -5.28f,
                    dy2 = -2.467f,
                    dx3 = -5.28f,
                    dy3 = -5.279f,
                )
                // c 0 -3.878 3.779 -6.279 7.28 -6.279
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.878f,
                    dx2 = 3.779f,
                    dy2 = -6.279f,
                    dx3 = 7.28f,
                    dy3 = -6.279f,
                )
                // c 13.634 0 17.007 6.433 17.145 6.707
                curveToRelative(
                    dx1 = 13.634f,
                    dy1 = 0.0f,
                    dx2 = 17.007f,
                    dy2 = 6.433f,
                    dx3 = 17.145f,
                    dy3 = 6.707f,
                )
                // c 0.315 0.632 0.06 1.4 -0.572 1.716
                curveToRelative(
                    dx1 = 0.315f,
                    dy1 = 0.632f,
                    dx2 = 0.06f,
                    dy2 = 1.4f,
                    dx3 = -0.572f,
                    dy3 = 1.716f,
                )
                // c -0.626 0.315 -1.39 0.064 -1.71 -0.559
                curveToRelative(
                    dx1 = -0.626f,
                    dy1 = 0.315f,
                    dx2 = -1.39f,
                    dy2 = 0.064f,
                    dx3 = -1.71f,
                    dy3 = -0.559f,
                )
                // c -0.06 -0.108 -2.674 -4.676 -12.747 -5.247
                curveToRelative(
                    dx1 = -0.06f,
                    dy1 = -0.108f,
                    dx2 = -2.674f,
                    dy2 = -4.676f,
                    dx3 = -12.747f,
                    dy3 = -5.247f,
                )
                // c 0.773 0.914 1.164 2.142 1.164 3.663
                curveToRelative(
                    dx1 = 0.773f,
                    dy1 = 0.914f,
                    dx2 = 1.164f,
                    dy2 = 2.142f,
                    dx3 = 1.164f,
                    dy3 = 3.663f,
                )
                // c -0.001 2.538 -2.019 5.278 -5.28 5.278z
                curveToRelative(
                    dx1 = -0.001f,
                    dy1 = 2.538f,
                    dx2 = -2.019f,
                    dy2 = 5.278f,
                    dx3 = -5.28f,
                    dy3 = 5.278f,
                )
                close()
                // M 9.834 9.269
                moveTo(x = 9.834f, y = 9.269f)
                // c -0.922 0.653 -1.556 1.597 -1.556 2.731
                curveToRelative(
                    dx1 = -0.922f,
                    dy1 = 0.653f,
                    dx2 = -1.556f,
                    dy2 = 1.597f,
                    dx3 = -1.556f,
                    dy3 = 2.731f,
                )
                // c 0 1.232 1.214 2.721 2.722 2.721
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.232f,
                    dx2 = 1.214f,
                    dy2 = 2.721f,
                    dx3 = 2.722f,
                    dy3 = 2.721f,
                )
                // c 1.627 0 2.721 -1.407 2.721 -2.72
                curveToRelative(
                    dx1 = 1.627f,
                    dy1 = 0.0f,
                    dx2 = 2.721f,
                    dy2 = -1.407f,
                    dx3 = 2.721f,
                    dy3 = -2.72f,
                )
                // c 0 -1.056 -0.269 -1.812 -0.799 -2.247
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.056f,
                    dx2 = -0.269f,
                    dy2 = -1.812f,
                    dx3 = -0.799f,
                    dy3 = -2.247f,
                )
                // c -0.969 -0.794 -2.593 -0.6 -2.609 -0.597
                curveToRelative(
                    dx1 = -0.969f,
                    dy1 = -0.794f,
                    dx2 = -2.593f,
                    dy2 = -0.6f,
                    dx3 = -2.609f,
                    dy3 = -0.597f,
                )
                // c -0.143 0.028 -0.313 0.046 -0.479 0.112z
                curveToRelative(
                    dx1 = -0.143f,
                    dy1 = 0.028f,
                    dx2 = -0.313f,
                    dy2 = 0.046f,
                    dx3 = -0.479f,
                    dy3 = 0.112f,
                )
                close()
                // M 22.999 30.279
                moveTo(x = 22.999f, y = 30.279f)
                // c -13.634 0 -17.007 -6.434 -17.144 -6.707
                curveToRelative(
                    dx1 = -13.634f,
                    dy1 = 0.0f,
                    dx2 = -17.007f,
                    dy2 = -6.434f,
                    dx3 = -17.144f,
                    dy3 = -6.707f,
                )
                // c -0.316 -0.632 -0.06 -1.4 0.572 -1.717
                curveToRelative(
                    dx1 = -0.316f,
                    dy1 = -0.632f,
                    dx2 = -0.06f,
                    dy2 = -1.4f,
                    dx3 = 0.572f,
                    dy3 = -1.717f,
                )
                // c 0.627 -0.312 1.391 -0.062 1.71 0.56
                curveToRelative(
                    dx1 = 0.627f,
                    dy1 = -0.312f,
                    dx2 = 1.391f,
                    dy2 = -0.062f,
                    dx3 = 1.71f,
                    dy3 = 0.56f,
                )
                // c 0.06 0.108 2.674 4.677 12.746 5.247
                curveToRelative(
                    dx1 = 0.06f,
                    dy1 = 0.108f,
                    dx2 = 2.674f,
                    dy2 = 4.677f,
                    dx3 = 12.746f,
                    dy3 = 5.247f,
                )
                // c -0.773 -0.913 -1.163 -2.141 -1.163 -3.662
                curveToRelative(
                    dx1 = -0.773f,
                    dy1 = -0.913f,
                    dx2 = -1.163f,
                    dy2 = -2.141f,
                    dx3 = -1.163f,
                    dy3 = -3.662f,
                )
                // c 0 -2.539 2.019 -5.279 5.279 -5.279
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.539f,
                    dx2 = 2.019f,
                    dy2 = -5.279f,
                    dx3 = 5.279f,
                    dy3 = -5.279f,
                )
                // c 2.812 0 5.28 2.467 5.28 5.279
                curveToRelative(
                    dx1 = 2.812f,
                    dy1 = 0.0f,
                    dx2 = 5.28f,
                    dy2 = 2.467f,
                    dx3 = 5.28f,
                    dy3 = 5.279f,
                )
                // c 0 3.879 -3.779 6.279 -7.28 6.279z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.879f,
                    dx2 = -3.779f,
                    dy2 = 6.279f,
                    dx3 = -7.28f,
                    dy3 = 6.279f,
                )
                close()
                // M 24.999 21.279
                moveTo(x = 24.999f, y = 21.279f)
                // c -1.628 0 -2.721 1.407 -2.721 2.721
                curveToRelative(
                    dx1 = -1.628f,
                    dy1 = 0.0f,
                    dx2 = -2.721f,
                    dy2 = 1.407f,
                    dx3 = -2.721f,
                    dy3 = 2.721f,
                )
                // c 0 1.056 0.269 1.812 0.799 2.247
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.056f,
                    dx2 = 0.269f,
                    dy2 = 1.812f,
                    dx3 = 0.799f,
                    dy3 = 2.247f,
                )
                // c 0.97 0.794 2.673 0.6 2.688 0.597
                curveToRelative(
                    dx1 = 0.97f,
                    dy1 = 0.794f,
                    dx2 = 2.673f,
                    dy2 = 0.6f,
                    dx3 = 2.688f,
                    dy3 = 0.597f,
                )
                // c 0.142 -0.029 0.234 -0.062 0.399 -0.112
                curveToRelative(
                    dx1 = 0.142f,
                    dy1 = -0.029f,
                    dx2 = 0.234f,
                    dy2 = -0.062f,
                    dx3 = 0.399f,
                    dy3 = -0.112f,
                )
                // c 0.923 -0.653 1.556 -1.598 1.556 -2.731
                curveToRelative(
                    dx1 = 0.923f,
                    dy1 = -0.653f,
                    dx2 = 1.556f,
                    dy2 = -1.598f,
                    dx3 = 1.556f,
                    dy3 = -2.731f,
                )
                // c 0.001 -1.233 -1.213 -2.722 -2.721 -2.722z
                curveToRelative(
                    dx1 = 0.001f,
                    dy1 = -1.233f,
                    dx2 = -1.213f,
                    dy2 = -2.722f,
                    dx3 = -2.721f,
                    dy3 = -2.722f,
                )
                close()
            }
            // M14.002 11.99 c0 -1.68 -1.361 -3.041 -3.041 -3.041 S7.92 10.31 7.92 11.99 s1.361 3.041 3.041 3.041 3.041 -1.362 3.041 -3.041z M28.002 23.99 c0 -1.68 -1.361 -3.041 -3.041 -3.041 S21.92 22.31 21.92 23.99 s1.361 3.041 3.041 3.041 3.041 -1.361 3.041 -3.041z
            path(
                fill = SolidColor(Color(0xFF9266CC)),
            ) {
                // M 14.002 11.99
                moveTo(x = 14.002f, y = 11.99f)
                // c 0 -1.68 -1.361 -3.041 -3.041 -3.041
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.68f,
                    dx2 = -1.361f,
                    dy2 = -3.041f,
                    dx3 = -3.041f,
                    dy3 = -3.041f,
                )
                // S 7.92 10.31 7.92 11.99
                reflectiveCurveTo(
                    x1 = 7.92f,
                    y1 = 10.31f,
                    x2 = 7.92f,
                    y2 = 11.99f,
                )
                // s 1.361 3.041 3.041 3.041
                reflectiveCurveToRelative(
                    dx1 = 1.361f,
                    dy1 = 3.041f,
                    dx2 = 3.041f,
                    dy2 = 3.041f,
                )
                // s 3.041 -1.362 3.041 -3.041z
                reflectiveCurveToRelative(
                    dx1 = 3.041f,
                    dy1 = -1.362f,
                    dx2 = 3.041f,
                    dy2 = -3.041f,
                )
                close()
                // M 28.002 23.99
                moveTo(x = 28.002f, y = 23.99f)
                // c 0 -1.68 -1.361 -3.041 -3.041 -3.041
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.68f,
                    dx2 = -1.361f,
                    dy2 = -3.041f,
                    dx3 = -3.041f,
                    dy3 = -3.041f,
                )
                // S 21.92 22.31 21.92 23.99
                reflectiveCurveTo(
                    x1 = 21.92f,
                    y1 = 22.31f,
                    x2 = 21.92f,
                    y2 = 23.99f,
                )
                // s 1.361 3.041 3.041 3.041
                reflectiveCurveToRelative(
                    dx1 = 1.361f,
                    dy1 = 3.041f,
                    dx2 = 3.041f,
                    dy2 = 3.041f,
                )
                // s 3.041 -1.361 3.041 -3.041z
                reflectiveCurveToRelative(
                    dx1 = 3.041f,
                    dy1 = -1.361f,
                    dx2 = 3.041f,
                    dy2 = -3.041f,
                )
                close()
            }
        }.build().also { _emoji264b = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji264b: ImageVector? = null
