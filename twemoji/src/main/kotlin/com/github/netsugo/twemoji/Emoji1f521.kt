package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f521: ImageVector
    get() {
        val current = _emoji1f521
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f521",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 32 c0 2.209 -1.791 4 -4 4 H4 c-2.209 0 -4 -1.791 -4 -4 V4 c0 -2.209 1.791 -4 4 -4 h28 c2.209 0 4 1.791 4 4 v28z
            path(
                fill = SolidColor(Color(0xFF3B88C3)),
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
            // M15.672 15.328 c0 0.703 0 1.786 -1.311 1.786 -0.798 0 -1.121 -0.437 -1.311 -1.159 -0.703 0.836 -1.558 1.273 -2.603 1.273 -2.565 0 -4.521 -2.185 -4.521 -5.262 0 -3.001 2.014 -5.3 4.521 -5.3 1.007 0 1.995 0.399 2.603 1.254 0.076 -0.665 0.646 -1.14 1.311 -1.14 1.311 0 1.311 1.083 1.311 1.786 v6.762z M10.828 14.72 c1.425 0 2.109 -1.444 2.109 -2.754 0 -1.311 -0.665 -2.792 -2.109 -2.792 -1.501 0 -2.166 1.481 -2.166 2.792 0.001 1.31 0.684 2.754 2.166 2.754z M14.182 25.705 c-0.684 0 -1.292 -0.532 -2.166 -0.532 -1.558 0 -2.298 1.387 -2.298 2.793 0 1.349 0.817 2.755 2.298 2.755 0.684 0 1.71 -0.57 2.033 -0.57 0.646 0 1.178 0.551 1.178 1.197 0 1.405 -2.356 1.88 -3.343 1.88 -2.945 0 -4.901 -2.412 -4.901 -5.262 0 -2.773 2.014 -5.3 4.901 -5.3 1.083 0 3.343 0.399 3.343 1.729 -0.001 0.569 -0.4 1.31 -1.045 1.31z M20.326 3.892 c0 -0.912 0.569 -1.52 1.367 -1.52 s1.368 0.608 1.368 1.52 v3.723 c0.722 -0.627 1.652 -0.95 2.603 -0.95 2.944 0 4.407 2.754 4.407 5.414 0 2.584 -1.747 5.148 -4.503 5.148 -0.93 0 -1.994 -0.418 -2.507 -1.254 -0.171 0.722 -0.608 1.14 -1.368 1.14 -0.798 0 -1.367 -0.608 -1.367 -1.52 L20.326 3.892z M25.208 14.72 c1.425 0 2.128 -1.481 2.128 -2.754 0 -1.292 -0.703 -2.792 -2.128 -2.792 -1.463 0 -2.146 1.368 -2.146 2.697 0 1.33 0.645 2.849 2.146 2.849z M29.672 31.594 c0 0.912 -0.569 1.521 -1.367 1.521 -0.76 0 -1.197 -0.418 -1.367 -1.14 -0.514 0.835 -1.578 1.253 -2.508 1.253 -2.755 0 -4.503 -2.564 -4.503 -5.147 0 -2.66 1.463 -5.414 4.407 -5.414 0.95 0 1.881 0.322 2.604 0.949 v-3.723 c0 -0.913 0.569 -1.52 1.367 -1.52 s1.367 0.608 1.367 1.52 v11.701z M24.79 25.173 c-1.425 0 -2.128 1.501 -2.128 2.793 0 1.273 0.703 2.755 2.128 2.755 1.501 0 2.147 -1.521 2.147 -2.85 0.001 -1.33 -0.684 -2.698 -2.147 -2.698z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 15.672 15.328
                moveTo(x = 15.672f, y = 15.328f)
                // c 0 0.703 0 1.786 -1.311 1.786
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.703f,
                    dx2 = 0.0f,
                    dy2 = 1.786f,
                    dx3 = -1.311f,
                    dy3 = 1.786f,
                )
                // c -0.798 0 -1.121 -0.437 -1.311 -1.159
                curveToRelative(
                    dx1 = -0.798f,
                    dy1 = 0.0f,
                    dx2 = -1.121f,
                    dy2 = -0.437f,
                    dx3 = -1.311f,
                    dy3 = -1.159f,
                )
                // c -0.703 0.836 -1.558 1.273 -2.603 1.273
                curveToRelative(
                    dx1 = -0.703f,
                    dy1 = 0.836f,
                    dx2 = -1.558f,
                    dy2 = 1.273f,
                    dx3 = -2.603f,
                    dy3 = 1.273f,
                )
                // c -2.565 0 -4.521 -2.185 -4.521 -5.262
                curveToRelative(
                    dx1 = -2.565f,
                    dy1 = 0.0f,
                    dx2 = -4.521f,
                    dy2 = -2.185f,
                    dx3 = -4.521f,
                    dy3 = -5.262f,
                )
                // c 0 -3.001 2.014 -5.3 4.521 -5.3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.001f,
                    dx2 = 2.014f,
                    dy2 = -5.3f,
                    dx3 = 4.521f,
                    dy3 = -5.3f,
                )
                // c 1.007 0 1.995 0.399 2.603 1.254
                curveToRelative(
                    dx1 = 1.007f,
                    dy1 = 0.0f,
                    dx2 = 1.995f,
                    dy2 = 0.399f,
                    dx3 = 2.603f,
                    dy3 = 1.254f,
                )
                // c 0.076 -0.665 0.646 -1.14 1.311 -1.14
                curveToRelative(
                    dx1 = 0.076f,
                    dy1 = -0.665f,
                    dx2 = 0.646f,
                    dy2 = -1.14f,
                    dx3 = 1.311f,
                    dy3 = -1.14f,
                )
                // c 1.311 0 1.311 1.083 1.311 1.786
                curveToRelative(
                    dx1 = 1.311f,
                    dy1 = 0.0f,
                    dx2 = 1.311f,
                    dy2 = 1.083f,
                    dx3 = 1.311f,
                    dy3 = 1.786f,
                )
                // v 6.762z
                verticalLineToRelative(dy = 6.762f)
                close()
                // M 10.828 14.72
                moveTo(x = 10.828f, y = 14.72f)
                // c 1.425 0 2.109 -1.444 2.109 -2.754
                curveToRelative(
                    dx1 = 1.425f,
                    dy1 = 0.0f,
                    dx2 = 2.109f,
                    dy2 = -1.444f,
                    dx3 = 2.109f,
                    dy3 = -2.754f,
                )
                // c 0 -1.311 -0.665 -2.792 -2.109 -2.792
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.311f,
                    dx2 = -0.665f,
                    dy2 = -2.792f,
                    dx3 = -2.109f,
                    dy3 = -2.792f,
                )
                // c -1.501 0 -2.166 1.481 -2.166 2.792
                curveToRelative(
                    dx1 = -1.501f,
                    dy1 = 0.0f,
                    dx2 = -2.166f,
                    dy2 = 1.481f,
                    dx3 = -2.166f,
                    dy3 = 2.792f,
                )
                // c 0.001 1.31 0.684 2.754 2.166 2.754z
                curveToRelative(
                    dx1 = 0.001f,
                    dy1 = 1.31f,
                    dx2 = 0.684f,
                    dy2 = 2.754f,
                    dx3 = 2.166f,
                    dy3 = 2.754f,
                )
                close()
                // M 14.182 25.705
                moveTo(x = 14.182f, y = 25.705f)
                // c -0.684 0 -1.292 -0.532 -2.166 -0.532
                curveToRelative(
                    dx1 = -0.684f,
                    dy1 = 0.0f,
                    dx2 = -1.292f,
                    dy2 = -0.532f,
                    dx3 = -2.166f,
                    dy3 = -0.532f,
                )
                // c -1.558 0 -2.298 1.387 -2.298 2.793
                curveToRelative(
                    dx1 = -1.558f,
                    dy1 = 0.0f,
                    dx2 = -2.298f,
                    dy2 = 1.387f,
                    dx3 = -2.298f,
                    dy3 = 2.793f,
                )
                // c 0 1.349 0.817 2.755 2.298 2.755
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.349f,
                    dx2 = 0.817f,
                    dy2 = 2.755f,
                    dx3 = 2.298f,
                    dy3 = 2.755f,
                )
                // c 0.684 0 1.71 -0.57 2.033 -0.57
                curveToRelative(
                    dx1 = 0.684f,
                    dy1 = 0.0f,
                    dx2 = 1.71f,
                    dy2 = -0.57f,
                    dx3 = 2.033f,
                    dy3 = -0.57f,
                )
                // c 0.646 0 1.178 0.551 1.178 1.197
                curveToRelative(
                    dx1 = 0.646f,
                    dy1 = 0.0f,
                    dx2 = 1.178f,
                    dy2 = 0.551f,
                    dx3 = 1.178f,
                    dy3 = 1.197f,
                )
                // c 0 1.405 -2.356 1.88 -3.343 1.88
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.405f,
                    dx2 = -2.356f,
                    dy2 = 1.88f,
                    dx3 = -3.343f,
                    dy3 = 1.88f,
                )
                // c -2.945 0 -4.901 -2.412 -4.901 -5.262
                curveToRelative(
                    dx1 = -2.945f,
                    dy1 = 0.0f,
                    dx2 = -4.901f,
                    dy2 = -2.412f,
                    dx3 = -4.901f,
                    dy3 = -5.262f,
                )
                // c 0 -2.773 2.014 -5.3 4.901 -5.3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.773f,
                    dx2 = 2.014f,
                    dy2 = -5.3f,
                    dx3 = 4.901f,
                    dy3 = -5.3f,
                )
                // c 1.083 0 3.343 0.399 3.343 1.729
                curveToRelative(
                    dx1 = 1.083f,
                    dy1 = 0.0f,
                    dx2 = 3.343f,
                    dy2 = 0.399f,
                    dx3 = 3.343f,
                    dy3 = 1.729f,
                )
                // c -0.001 0.569 -0.4 1.31 -1.045 1.31z
                curveToRelative(
                    dx1 = -0.001f,
                    dy1 = 0.569f,
                    dx2 = -0.4f,
                    dy2 = 1.31f,
                    dx3 = -1.045f,
                    dy3 = 1.31f,
                )
                close()
                // M 20.326 3.892
                moveTo(x = 20.326f, y = 3.892f)
                // c 0 -0.912 0.569 -1.52 1.367 -1.52
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.912f,
                    dx2 = 0.569f,
                    dy2 = -1.52f,
                    dx3 = 1.367f,
                    dy3 = -1.52f,
                )
                // s 1.368 0.608 1.368 1.52
                reflectiveCurveToRelative(
                    dx1 = 1.368f,
                    dy1 = 0.608f,
                    dx2 = 1.368f,
                    dy2 = 1.52f,
                )
                // v 3.723
                verticalLineToRelative(dy = 3.723f)
                // c 0.722 -0.627 1.652 -0.95 2.603 -0.95
                curveToRelative(
                    dx1 = 0.722f,
                    dy1 = -0.627f,
                    dx2 = 1.652f,
                    dy2 = -0.95f,
                    dx3 = 2.603f,
                    dy3 = -0.95f,
                )
                // c 2.944 0 4.407 2.754 4.407 5.414
                curveToRelative(
                    dx1 = 2.944f,
                    dy1 = 0.0f,
                    dx2 = 4.407f,
                    dy2 = 2.754f,
                    dx3 = 4.407f,
                    dy3 = 5.414f,
                )
                // c 0 2.584 -1.747 5.148 -4.503 5.148
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.584f,
                    dx2 = -1.747f,
                    dy2 = 5.148f,
                    dx3 = -4.503f,
                    dy3 = 5.148f,
                )
                // c -0.93 0 -1.994 -0.418 -2.507 -1.254
                curveToRelative(
                    dx1 = -0.93f,
                    dy1 = 0.0f,
                    dx2 = -1.994f,
                    dy2 = -0.418f,
                    dx3 = -2.507f,
                    dy3 = -1.254f,
                )
                // c -0.171 0.722 -0.608 1.14 -1.368 1.14
                curveToRelative(
                    dx1 = -0.171f,
                    dy1 = 0.722f,
                    dx2 = -0.608f,
                    dy2 = 1.14f,
                    dx3 = -1.368f,
                    dy3 = 1.14f,
                )
                // c -0.798 0 -1.367 -0.608 -1.367 -1.52
                curveToRelative(
                    dx1 = -0.798f,
                    dy1 = 0.0f,
                    dx2 = -1.367f,
                    dy2 = -0.608f,
                    dx3 = -1.367f,
                    dy3 = -1.52f,
                )
                // L 20.326 3.892z
                lineTo(x = 20.326f, y = 3.892f)
                close()
                // M 25.208 14.72
                moveTo(x = 25.208f, y = 14.72f)
                // c 1.425 0 2.128 -1.481 2.128 -2.754
                curveToRelative(
                    dx1 = 1.425f,
                    dy1 = 0.0f,
                    dx2 = 2.128f,
                    dy2 = -1.481f,
                    dx3 = 2.128f,
                    dy3 = -2.754f,
                )
                // c 0 -1.292 -0.703 -2.792 -2.128 -2.792
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.292f,
                    dx2 = -0.703f,
                    dy2 = -2.792f,
                    dx3 = -2.128f,
                    dy3 = -2.792f,
                )
                // c -1.463 0 -2.146 1.368 -2.146 2.697
                curveToRelative(
                    dx1 = -1.463f,
                    dy1 = 0.0f,
                    dx2 = -2.146f,
                    dy2 = 1.368f,
                    dx3 = -2.146f,
                    dy3 = 2.697f,
                )
                // c 0 1.33 0.645 2.849 2.146 2.849z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.33f,
                    dx2 = 0.645f,
                    dy2 = 2.849f,
                    dx3 = 2.146f,
                    dy3 = 2.849f,
                )
                close()
                // M 29.672 31.594
                moveTo(x = 29.672f, y = 31.594f)
                // c 0 0.912 -0.569 1.521 -1.367 1.521
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.912f,
                    dx2 = -0.569f,
                    dy2 = 1.521f,
                    dx3 = -1.367f,
                    dy3 = 1.521f,
                )
                // c -0.76 0 -1.197 -0.418 -1.367 -1.14
                curveToRelative(
                    dx1 = -0.76f,
                    dy1 = 0.0f,
                    dx2 = -1.197f,
                    dy2 = -0.418f,
                    dx3 = -1.367f,
                    dy3 = -1.14f,
                )
                // c -0.514 0.835 -1.578 1.253 -2.508 1.253
                curveToRelative(
                    dx1 = -0.514f,
                    dy1 = 0.835f,
                    dx2 = -1.578f,
                    dy2 = 1.253f,
                    dx3 = -2.508f,
                    dy3 = 1.253f,
                )
                // c -2.755 0 -4.503 -2.564 -4.503 -5.147
                curveToRelative(
                    dx1 = -2.755f,
                    dy1 = 0.0f,
                    dx2 = -4.503f,
                    dy2 = -2.564f,
                    dx3 = -4.503f,
                    dy3 = -5.147f,
                )
                // c 0 -2.66 1.463 -5.414 4.407 -5.414
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.66f,
                    dx2 = 1.463f,
                    dy2 = -5.414f,
                    dx3 = 4.407f,
                    dy3 = -5.414f,
                )
                // c 0.95 0 1.881 0.322 2.604 0.949
                curveToRelative(
                    dx1 = 0.95f,
                    dy1 = 0.0f,
                    dx2 = 1.881f,
                    dy2 = 0.322f,
                    dx3 = 2.604f,
                    dy3 = 0.949f,
                )
                // v -3.723
                verticalLineToRelative(dy = -3.723f)
                // c 0 -0.913 0.569 -1.52 1.367 -1.52
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.913f,
                    dx2 = 0.569f,
                    dy2 = -1.52f,
                    dx3 = 1.367f,
                    dy3 = -1.52f,
                )
                // s 1.367 0.608 1.367 1.52
                reflectiveCurveToRelative(
                    dx1 = 1.367f,
                    dy1 = 0.608f,
                    dx2 = 1.367f,
                    dy2 = 1.52f,
                )
                // v 11.701z
                verticalLineToRelative(dy = 11.701f)
                close()
                // M 24.79 25.173
                moveTo(x = 24.79f, y = 25.173f)
                // c -1.425 0 -2.128 1.501 -2.128 2.793
                curveToRelative(
                    dx1 = -1.425f,
                    dy1 = 0.0f,
                    dx2 = -2.128f,
                    dy2 = 1.501f,
                    dx3 = -2.128f,
                    dy3 = 2.793f,
                )
                // c 0 1.273 0.703 2.755 2.128 2.755
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.273f,
                    dx2 = 0.703f,
                    dy2 = 2.755f,
                    dx3 = 2.128f,
                    dy3 = 2.755f,
                )
                // c 1.501 0 2.147 -1.521 2.147 -2.85
                curveToRelative(
                    dx1 = 1.501f,
                    dy1 = 0.0f,
                    dx2 = 2.147f,
                    dy2 = -1.521f,
                    dx3 = 2.147f,
                    dy3 = -2.85f,
                )
                // c 0.001 -1.33 -0.684 -2.698 -2.147 -2.698z
                curveToRelative(
                    dx1 = 0.001f,
                    dy1 = -1.33f,
                    dx2 = -0.684f,
                    dy2 = -2.698f,
                    dx3 = -2.147f,
                    dy3 = -2.698f,
                )
                close()
            }
        }.build().also { _emoji1f521 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f521: ImageVector? = null
