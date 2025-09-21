package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji26f0: ImageVector
    get() {
        val current = _emoji26f0
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji26f0",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M19.083 35.5 L12.25 12.292 s-1.42 0.761 -2.604 1.637 c-0.313 0.231 -1.977 2.79 -2.312 3.04 -1.762 1.315 -3.552 2.841 -3.792 3.167 C3.083 20.76 0 36 0 36 l19.083 -0.5z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 19.083 35.5
                moveTo(x = 19.083f, y = 35.5f)
                // L 12.25 12.292
                lineTo(x = 12.25f, y = 12.292f)
                // s -1.42 0.761 -2.604 1.637
                reflectiveCurveToRelative(
                    dx1 = -1.42f,
                    dy1 = 0.761f,
                    dx2 = -2.604f,
                    dy2 = 1.637f,
                )
                // c -0.313 0.231 -1.977 2.79 -2.312 3.04
                curveToRelative(
                    dx1 = -0.313f,
                    dy1 = 0.231f,
                    dx2 = -1.977f,
                    dy2 = 2.79f,
                    dx3 = -2.312f,
                    dy3 = 3.04f,
                )
                // c -1.762 1.315 -3.552 2.841 -3.792 3.167
                curveToRelative(
                    dx1 = -1.762f,
                    dy1 = 1.315f,
                    dx2 = -3.552f,
                    dy2 = 2.841f,
                    dx3 = -3.792f,
                    dy3 = 3.167f,
                )
                // C 3.083 20.76 0 36 0 36
                curveTo(
                    x1 = 3.083f,
                    y1 = 20.76f,
                    x2 = 0.0f,
                    y2 = 36.0f,
                    x3 = 0.0f,
                    y3 = 36.0f,
                )
                // l 19.083 -0.5z
                lineToRelative(dx = 19.083f, dy = -0.5f)
                close()
            }
            // M26.5 15.25 l-7.312 -9.212 L18 2.25 l-5.373 6.484 -0.971 1.172 C11.25 10.688 10 15.25 10 15.25 L8.75 20 3.252 30.054 0.917 34.791 32 35 l-5.5 -19.75z
            path(
                fill = SolidColor(Color(0xFF4B545D)),
            ) {
                // M 26.5 15.25
                moveTo(x = 26.5f, y = 15.25f)
                // l -7.312 -9.212
                lineToRelative(dx = -7.312f, dy = -9.212f)
                // L 18 2.25
                lineTo(x = 18.0f, y = 2.25f)
                // l -5.373 6.484
                lineToRelative(dx = -5.373f, dy = 6.484f)
                // l -0.971 1.172
                lineToRelative(dx = -0.971f, dy = 1.172f)
                // C 11.25 10.688 10 15.25 10 15.25
                curveTo(
                    x1 = 11.25f,
                    y1 = 10.688f,
                    x2 = 10.0f,
                    y2 = 15.25f,
                    x3 = 10.0f,
                    y3 = 15.25f,
                )
                // L 8.75 20
                lineTo(x = 8.75f, y = 20.0f)
                // L 3.252 30.054
                lineTo(x = 3.252f, y = 30.054f)
                // L 0.917 34.791
                lineTo(x = 0.917f, y = 34.791f)
                // L 32 35
                lineTo(x = 32.0f, y = 35.0f)
                // l -5.5 -19.75z
                lineToRelative(dx = -5.5f, dy = -19.75f)
                close()
            }
            // M12 34 h2 l2 -15.75 1.234 -1.797 3.578 -5.234 0.094 -1.469 -3.287 4.454 L15 17.752 l-2.388 7.362 L12 27 l-1.791 3.134 L8 34z M24.059 16.384 l-1.965 5.897 L21 26 l2.792 7.625 3.552 -0.062 S23 26.625 23 26 c0 -0.12 0.625 -2.687 0.625 -2.687 l1.094 -4.531 L25 17.25 l-0.941 -0.866z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 12 34
                moveTo(x = 12.0f, y = 34.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // l 2 -15.75
                lineToRelative(dx = 2.0f, dy = -15.75f)
                // l 1.234 -1.797
                lineToRelative(dx = 1.234f, dy = -1.797f)
                // l 3.578 -5.234
                lineToRelative(dx = 3.578f, dy = -5.234f)
                // l 0.094 -1.469
                lineToRelative(dx = 0.094f, dy = -1.469f)
                // l -3.287 4.454
                lineToRelative(dx = -3.287f, dy = 4.454f)
                // L 15 17.752
                lineTo(x = 15.0f, y = 17.752f)
                // l -2.388 7.362
                lineToRelative(dx = -2.388f, dy = 7.362f)
                // L 12 27
                lineTo(x = 12.0f, y = 27.0f)
                // l -1.791 3.134
                lineToRelative(dx = -1.791f, dy = 3.134f)
                // L 8 34z
                lineTo(x = 8.0f, y = 34.0f)
                close()
                // M 24.059 16.384
                moveTo(x = 24.059f, y = 16.384f)
                // l -1.965 5.897
                lineToRelative(dx = -1.965f, dy = 5.897f)
                // L 21 26
                lineTo(x = 21.0f, y = 26.0f)
                // l 2.792 7.625
                lineToRelative(dx = 2.792f, dy = 7.625f)
                // l 3.552 -0.062
                lineToRelative(dx = 3.552f, dy = -0.062f)
                // S 23 26.625 23 26
                reflectiveCurveTo(
                    x1 = 23.0f,
                    y1 = 26.625f,
                    x2 = 23.0f,
                    y2 = 26.0f,
                )
                // c 0 -0.12 0.625 -2.687 0.625 -2.687
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.12f,
                    dx2 = 0.625f,
                    dy2 = -2.687f,
                    dx3 = 0.625f,
                    dy3 = -2.687f,
                )
                // l 1.094 -4.531
                lineToRelative(dx = 1.094f, dy = -4.531f)
                // L 25 17.25
                lineTo(x = 25.0f, y = 17.25f)
                // l -0.941 -0.866z
                lineToRelative(dx = -0.941f, dy = -0.866f)
                close()
            }
            // M36 36 s-0.384 -3.845 -0.854 -7.083 c0 0 -0.146 -3.885 -1.271 -5.167 -1.049 -1.195 -2.624 -1.875 -2.833 -1.962 l-1.229 -3.523 L27.953 13 l-2.422 -2.125 -1.844 -1.626 -0.505 -0.621 L18 2.25 l2.289 7.299 0.524 1.67 3.246 5.165 0.66 2.397 1.438 2.281 0.774 2.701 L28 27.5 26 34 l10 2z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 36 36
                moveTo(x = 36.0f, y = 36.0f)
                // s -0.384 -3.845 -0.854 -7.083
                reflectiveCurveToRelative(
                    dx1 = -0.384f,
                    dy1 = -3.845f,
                    dx2 = -0.854f,
                    dy2 = -7.083f,
                )
                // c 0 0 -0.146 -3.885 -1.271 -5.167
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -0.146f,
                    dy2 = -3.885f,
                    dx3 = -1.271f,
                    dy3 = -5.167f,
                )
                // c -1.049 -1.195 -2.624 -1.875 -2.833 -1.962
                curveToRelative(
                    dx1 = -1.049f,
                    dy1 = -1.195f,
                    dx2 = -2.624f,
                    dy2 = -1.875f,
                    dx3 = -2.833f,
                    dy3 = -1.962f,
                )
                // l -1.229 -3.523
                lineToRelative(dx = -1.229f, dy = -3.523f)
                // L 27.953 13
                lineTo(x = 27.953f, y = 13.0f)
                // l -2.422 -2.125
                lineToRelative(dx = -2.422f, dy = -2.125f)
                // l -1.844 -1.626
                lineToRelative(dx = -1.844f, dy = -1.626f)
                // l -0.505 -0.621
                lineToRelative(dx = -0.505f, dy = -0.621f)
                // L 18 2.25
                lineTo(x = 18.0f, y = 2.25f)
                // l 2.289 7.299
                lineToRelative(dx = 2.289f, dy = 7.299f)
                // l 0.524 1.67
                lineToRelative(dx = 0.524f, dy = 1.67f)
                // l 3.246 5.165
                lineToRelative(dx = 3.246f, dy = 5.165f)
                // l 0.66 2.397
                lineToRelative(dx = 0.66f, dy = 2.397f)
                // l 1.438 2.281
                lineToRelative(dx = 1.438f, dy = 2.281f)
                // l 0.774 2.701
                lineToRelative(dx = 0.774f, dy = 2.701f)
                // L 28 27.5
                lineTo(x = 28.0f, y = 27.5f)
                // L 26 34
                lineTo(x = 26.0f, y = 34.0f)
                // l 10 2z
                lineToRelative(dx = 10.0f, dy = 2.0f)
                close()
            }
            // M33.708 32.438 c-1.345 0 -4.958 0.562 -5.458 0.562 -2 0 -4.25 -1.75 -5.25 -1.75 S19.406 33 17.406 33 c-1.688 0 -2.406 -0.812 -4.719 -0.812 -0.748 0 -4.096 0.871 -4.812 0.781 C6.052 32.741 5.115 32 4.656 32 2 32 0 36 0 36 h36 s-0.875 -3.562 -2.292 -3.562z
            path(
                fill = SolidColor(Color(0xFF5C903F)),
            ) {
                // M 33.708 32.438
                moveTo(x = 33.708f, y = 32.438f)
                // c -1.345 0 -4.958 0.562 -5.458 0.562
                curveToRelative(
                    dx1 = -1.345f,
                    dy1 = 0.0f,
                    dx2 = -4.958f,
                    dy2 = 0.562f,
                    dx3 = -5.458f,
                    dy3 = 0.562f,
                )
                // c -2 0 -4.25 -1.75 -5.25 -1.75
                curveToRelative(
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                    dx2 = -4.25f,
                    dy2 = -1.75f,
                    dx3 = -5.25f,
                    dy3 = -1.75f,
                )
                // S 19.406 33 17.406 33
                reflectiveCurveTo(
                    x1 = 19.406f,
                    y1 = 33.0f,
                    x2 = 17.406f,
                    y2 = 33.0f,
                )
                // c -1.688 0 -2.406 -0.812 -4.719 -0.812
                curveToRelative(
                    dx1 = -1.688f,
                    dy1 = 0.0f,
                    dx2 = -2.406f,
                    dy2 = -0.812f,
                    dx3 = -4.719f,
                    dy3 = -0.812f,
                )
                // c -0.748 0 -4.096 0.871 -4.812 0.781
                curveToRelative(
                    dx1 = -0.748f,
                    dy1 = 0.0f,
                    dx2 = -4.096f,
                    dy2 = 0.871f,
                    dx3 = -4.812f,
                    dy3 = 0.781f,
                )
                // C 6.052 32.741 5.115 32 4.656 32
                curveTo(
                    x1 = 6.052f,
                    y1 = 32.741f,
                    x2 = 5.115f,
                    y2 = 32.0f,
                    x3 = 4.656f,
                    y3 = 32.0f,
                )
                // C 2 32 0 36 0 36
                curveTo(
                    x1 = 2.0f,
                    y1 = 32.0f,
                    x2 = 0.0f,
                    y2 = 36.0f,
                    x3 = 0.0f,
                    y3 = 36.0f,
                )
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // s -0.875 -3.562 -2.292 -3.562z
                reflectiveCurveToRelative(
                    dx1 = -0.875f,
                    dy1 = -3.562f,
                    dx2 = -2.292f,
                    dy2 = -3.562f,
                )
                close()
            }
        }.build().also { _emoji26f0 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji26f0: ImageVector? = null
