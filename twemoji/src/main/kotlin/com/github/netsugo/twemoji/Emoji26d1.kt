package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji26d1: ImageVector
    get() {
        val current = _emoji26d1
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji26d1",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M29 17 v5 c0 4.142 -4.896 9 -11 9 S7 26.142 7 22 v-5 H5 v5 c0 5.246 5.268 11 13 11 s13 -5.754 13 -11 v-5 h-2z
            path(
                fill = SolidColor(Color(0xFFD99E82)),
            ) {
                // M 29 17
                moveTo(x = 29.0f, y = 17.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // c 0 4.142 -4.896 9 -11 9
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.142f,
                    dx2 = -4.896f,
                    dy2 = 9.0f,
                    dx3 = -11.0f,
                    dy3 = 9.0f,
                )
                // S 7 26.142 7 22
                reflectiveCurveTo(
                    x1 = 7.0f,
                    y1 = 26.142f,
                    x2 = 7.0f,
                    y2 = 22.0f,
                )
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // c 0 5.246 5.268 11 13 11
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 5.246f,
                    dx2 = 5.268f,
                    dy2 = 11.0f,
                    dx3 = 13.0f,
                    dy3 = 11.0f,
                )
                // s 13 -5.754 13 -11
                reflectiveCurveToRelative(
                    dx1 = 13.0f,
                    dy1 = -5.754f,
                    dx2 = 13.0f,
                    dy2 = -11.0f,
                )
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // M22 32.083 C22 33.142 21.142 34 20.083 34 h-4.166 C14.858 34 14 33.142 14 32.083 v-0.166 c0 -1.059 0.858 -1.917 1.917 -1.917 h4.166 c1.059 0 1.917 0.858 1.917 1.917 v0.166z
            path(
                fill = SolidColor(Color(0xFFC1694F)),
            ) {
                // M 22 32.083
                moveTo(x = 22.0f, y = 32.083f)
                // C 22 33.142 21.142 34 20.083 34
                curveTo(
                    x1 = 22.0f,
                    y1 = 33.142f,
                    x2 = 21.142f,
                    y2 = 34.0f,
                    x3 = 20.083f,
                    y3 = 34.0f,
                )
                // h -4.166
                horizontalLineToRelative(dx = -4.166f)
                // C 14.858 34 14 33.142 14 32.083
                curveTo(
                    x1 = 14.858f,
                    y1 = 34.0f,
                    x2 = 14.0f,
                    y2 = 33.142f,
                    x3 = 14.0f,
                    y3 = 32.083f,
                )
                // v -0.166
                verticalLineToRelative(dy = -0.166f)
                // c 0 -1.059 0.858 -1.917 1.917 -1.917
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.059f,
                    dx2 = 0.858f,
                    dy2 = -1.917f,
                    dx3 = 1.917f,
                    dy3 = -1.917f,
                )
                // h 4.166
                horizontalLineToRelative(dx = 4.166f)
                // c 1.059 0 1.917 0.858 1.917 1.917
                curveToRelative(
                    dx1 = 1.059f,
                    dy1 = 0.0f,
                    dx2 = 1.917f,
                    dy2 = 0.858f,
                    dx3 = 1.917f,
                    dy3 = 1.917f,
                )
                // v 0.166z
                verticalLineToRelative(dy = 0.166f)
                close()
            }
            // M2 17 c0 -2.762 6.611 -5 16 -5 s16 2.238 16 5 c0 2.761 -6.611 6 -16 6 S2 19.761 2 17z
            path(
                fill = SolidColor(Color(0xFFEA596E)),
            ) {
                // M 2 17
                moveTo(x = 2.0f, y = 17.0f)
                // c 0 -2.762 6.611 -5 16 -5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.762f,
                    dx2 = 6.611f,
                    dy2 = -5.0f,
                    dx3 = 16.0f,
                    dy3 = -5.0f,
                )
                // s 16 2.238 16 5
                reflectiveCurveToRelative(
                    dx1 = 16.0f,
                    dy1 = 2.238f,
                    dx2 = 16.0f,
                    dy2 = 5.0f,
                )
                // c 0 2.761 -6.611 6 -16 6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.761f,
                    dx2 = -6.611f,
                    dy2 = 6.0f,
                    dx3 = -16.0f,
                    dy3 = 6.0f,
                )
                // S 2 19.761 2 17z
                reflectiveCurveTo(
                    x1 = 2.0f,
                    y1 = 19.761f,
                    x2 = 2.0f,
                    y2 = 17.0f,
                )
                close()
            }
            // M3 16 C3 9 9.198 2 18 2 s15 7 15 14 c0 1 -6.198 4 -15 4 S3 17 3 16z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 3 16
                moveTo(x = 3.0f, y = 16.0f)
                // C 3 9 9.198 2 18 2
                curveTo(
                    x1 = 3.0f,
                    y1 = 9.0f,
                    x2 = 9.198f,
                    y2 = 2.0f,
                    x3 = 18.0f,
                    y3 = 2.0f,
                )
                // s 15 7 15 14
                reflectiveCurveToRelative(
                    dx1 = 15.0f,
                    dy1 = 7.0f,
                    dx2 = 15.0f,
                    dy2 = 14.0f,
                )
                // c 0 1 -6.198 4 -15 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.0f,
                    dx2 = -6.198f,
                    dy2 = 4.0f,
                    dx3 = -15.0f,
                    dy3 = 4.0f,
                )
                // S 3 17 3 16z
                reflectiveCurveTo(
                    x1 = 3.0f,
                    y1 = 17.0f,
                    x2 = 3.0f,
                    y2 = 16.0f,
                )
                close()
            }
            // M25 19 c-0.553 0 -1 -0.448 -1 -1 0 -7.728 -1.93 -13.625 -1.949 -13.684 -0.174 -0.524 0.109 -1.09 0.634 -1.265 0.522 -0.173 1.089 0.109 1.264 0.632 0.08 0.24 1.876 5.71 2.04 13.223 1.139 -0.161 3.165 -0.602 5.564 -1.801 0.494 -0.247 1.094 -0.047 1.342 0.447 0.247 0.494 0.047 1.095 -0.447 1.342 C28.284 18.976 25.132 19 25 19z M11 19 c-0.132 0 -3.284 -0.024 -7.447 -2.106 -0.494 -0.247 -0.694 -0.848 -0.447 -1.342 0.247 -0.493 0.847 -0.695 1.342 -0.447 2.399 1.2 4.425 1.64 5.565 1.801 0.164 -7.513 1.959 -12.983 2.039 -13.223 0.175 -0.524 0.744 -0.805 1.264 -0.632 0.524 0.174 0.808 0.741 0.633 1.265 C13.929 4.374 12 10.271 12 18 c0 0.552 -0.448 1 -1 1z
            path(
                fill = SolidColor(Color(0xFFA0041E)),
            ) {
                // M 25 19
                moveTo(x = 25.0f, y = 19.0f)
                // c -0.553 0 -1 -0.448 -1 -1
                curveToRelative(
                    dx1 = -0.553f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.448f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // c 0 -7.728 -1.93 -13.625 -1.949 -13.684
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -7.728f,
                    dx2 = -1.93f,
                    dy2 = -13.625f,
                    dx3 = -1.949f,
                    dy3 = -13.684f,
                )
                // c -0.174 -0.524 0.109 -1.09 0.634 -1.265
                curveToRelative(
                    dx1 = -0.174f,
                    dy1 = -0.524f,
                    dx2 = 0.109f,
                    dy2 = -1.09f,
                    dx3 = 0.634f,
                    dy3 = -1.265f,
                )
                // c 0.522 -0.173 1.089 0.109 1.264 0.632
                curveToRelative(
                    dx1 = 0.522f,
                    dy1 = -0.173f,
                    dx2 = 1.089f,
                    dy2 = 0.109f,
                    dx3 = 1.264f,
                    dy3 = 0.632f,
                )
                // c 0.08 0.24 1.876 5.71 2.04 13.223
                curveToRelative(
                    dx1 = 0.08f,
                    dy1 = 0.24f,
                    dx2 = 1.876f,
                    dy2 = 5.71f,
                    dx3 = 2.04f,
                    dy3 = 13.223f,
                )
                // c 1.139 -0.161 3.165 -0.602 5.564 -1.801
                curveToRelative(
                    dx1 = 1.139f,
                    dy1 = -0.161f,
                    dx2 = 3.165f,
                    dy2 = -0.602f,
                    dx3 = 5.564f,
                    dy3 = -1.801f,
                )
                // c 0.494 -0.247 1.094 -0.047 1.342 0.447
                curveToRelative(
                    dx1 = 0.494f,
                    dy1 = -0.247f,
                    dx2 = 1.094f,
                    dy2 = -0.047f,
                    dx3 = 1.342f,
                    dy3 = 0.447f,
                )
                // c 0.247 0.494 0.047 1.095 -0.447 1.342
                curveToRelative(
                    dx1 = 0.247f,
                    dy1 = 0.494f,
                    dx2 = 0.047f,
                    dy2 = 1.095f,
                    dx3 = -0.447f,
                    dy3 = 1.342f,
                )
                // C 28.284 18.976 25.132 19 25 19z
                curveTo(
                    x1 = 28.284f,
                    y1 = 18.976f,
                    x2 = 25.132f,
                    y2 = 19.0f,
                    x3 = 25.0f,
                    y3 = 19.0f,
                )
                close()
                // M 11 19
                moveTo(x = 11.0f, y = 19.0f)
                // c -0.132 0 -3.284 -0.024 -7.447 -2.106
                curveToRelative(
                    dx1 = -0.132f,
                    dy1 = 0.0f,
                    dx2 = -3.284f,
                    dy2 = -0.024f,
                    dx3 = -7.447f,
                    dy3 = -2.106f,
                )
                // c -0.494 -0.247 -0.694 -0.848 -0.447 -1.342
                curveToRelative(
                    dx1 = -0.494f,
                    dy1 = -0.247f,
                    dx2 = -0.694f,
                    dy2 = -0.848f,
                    dx3 = -0.447f,
                    dy3 = -1.342f,
                )
                // c 0.247 -0.493 0.847 -0.695 1.342 -0.447
                curveToRelative(
                    dx1 = 0.247f,
                    dy1 = -0.493f,
                    dx2 = 0.847f,
                    dy2 = -0.695f,
                    dx3 = 1.342f,
                    dy3 = -0.447f,
                )
                // c 2.399 1.2 4.425 1.64 5.565 1.801
                curveToRelative(
                    dx1 = 2.399f,
                    dy1 = 1.2f,
                    dx2 = 4.425f,
                    dy2 = 1.64f,
                    dx3 = 5.565f,
                    dy3 = 1.801f,
                )
                // c 0.164 -7.513 1.959 -12.983 2.039 -13.223
                curveToRelative(
                    dx1 = 0.164f,
                    dy1 = -7.513f,
                    dx2 = 1.959f,
                    dy2 = -12.983f,
                    dx3 = 2.039f,
                    dy3 = -13.223f,
                )
                // c 0.175 -0.524 0.744 -0.805 1.264 -0.632
                curveToRelative(
                    dx1 = 0.175f,
                    dy1 = -0.524f,
                    dx2 = 0.744f,
                    dy2 = -0.805f,
                    dx3 = 1.264f,
                    dy3 = -0.632f,
                )
                // c 0.524 0.174 0.808 0.741 0.633 1.265
                curveToRelative(
                    dx1 = 0.524f,
                    dy1 = 0.174f,
                    dx2 = 0.808f,
                    dy2 = 0.741f,
                    dx3 = 0.633f,
                    dy3 = 1.265f,
                )
                // C 13.929 4.374 12 10.271 12 18
                curveTo(
                    x1 = 13.929f,
                    y1 = 4.374f,
                    x2 = 12.0f,
                    y2 = 10.271f,
                    x3 = 12.0f,
                    y3 = 18.0f,
                )
                // c 0 0.552 -0.448 1 -1 1z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = -0.448f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                close()
            }
            // M21 12 h-2 v-2 c0 -0.552 -0.448 -1 -1 -1 s-1 0.448 -1 1 v2 h-2 c-0.552 0 -1 0.448 -1 1 s0.448 1 1 1 h2 v2 c0 0.552 0.448 1 1 1 s1 -0.448 1 -1 v-2 h2 c0.553 0 1 -0.448 1 -1 s-0.447 -1 -1 -1z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 21 12
                moveTo(x = 21.0f, y = 12.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // c 0 -0.552 -0.448 -1 -1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = -0.448f,
                    dy2 = -1.0f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // s -1 0.448 -1 1
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.448f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // c -0.552 0 -1 0.448 -1 1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = 0.448f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // s 0.448 1 1 1
                reflectiveCurveToRelative(
                    dx1 = 0.448f,
                    dy1 = 1.0f,
                    dx2 = 1.0f,
                    dy2 = 1.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // c 0 0.552 0.448 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = 0.448f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // s 1 -0.448 1 -1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = -0.448f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // c 0.553 0 1 -0.448 1 -1
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -0.448f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // s -0.447 -1 -1 -1z
                reflectiveCurveToRelative(
                    dx1 = -0.447f,
                    dy1 = -1.0f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                )
                close()
            }
        }.build().also { _emoji26d1 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji26d1: ImageVector? = null
