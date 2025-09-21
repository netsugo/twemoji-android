package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji26a7: ImageVector
    get() {
        val current = _emoji26a7
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji26a7",
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
            // M18 24.3 c-3.749 0 -6.8 -3.051 -6.8 -6.8 s3.051 -6.8 6.8 -6.8 6.8 3.051 6.8 6.8 -3.051 6.8 -6.8 6.8z M18 13.1 c-2.426 0 -4.4 1.974 -4.4 4.4 s1.974 4.4 4.4 4.4 4.4 -1.974 4.4 -4.4 -1.974 -4.4 -4.4 -4.4z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 18 24.3
                moveTo(x = 18.0f, y = 24.3f)
                // c -3.749 0 -6.8 -3.051 -6.8 -6.8
                curveToRelative(
                    dx1 = -3.749f,
                    dy1 = 0.0f,
                    dx2 = -6.8f,
                    dy2 = -3.051f,
                    dx3 = -6.8f,
                    dy3 = -6.8f,
                )
                // s 3.051 -6.8 6.8 -6.8
                reflectiveCurveToRelative(
                    dx1 = 3.051f,
                    dy1 = -6.8f,
                    dx2 = 6.8f,
                    dy2 = -6.8f,
                )
                // s 6.8 3.051 6.8 6.8
                reflectiveCurveToRelative(
                    dx1 = 6.8f,
                    dy1 = 3.051f,
                    dx2 = 6.8f,
                    dy2 = 6.8f,
                )
                // s -3.051 6.8 -6.8 6.8z
                reflectiveCurveToRelative(
                    dx1 = -3.051f,
                    dy1 = 6.8f,
                    dx2 = -6.8f,
                    dy2 = 6.8f,
                )
                close()
                // M 18 13.1
                moveTo(x = 18.0f, y = 13.1f)
                // c -2.426 0 -4.4 1.974 -4.4 4.4
                curveToRelative(
                    dx1 = -2.426f,
                    dy1 = 0.0f,
                    dx2 = -4.4f,
                    dy2 = 1.974f,
                    dx3 = -4.4f,
                    dy3 = 4.4f,
                )
                // s 1.974 4.4 4.4 4.4
                reflectiveCurveToRelative(
                    dx1 = 1.974f,
                    dy1 = 4.4f,
                    dx2 = 4.4f,
                    dy2 = 4.4f,
                )
                // s 4.4 -1.974 4.4 -4.4
                reflectiveCurveToRelative(
                    dx1 = 4.4f,
                    dy1 = -1.974f,
                    dx2 = 4.4f,
                    dy2 = -4.4f,
                )
                // s -1.974 -4.4 -4.4 -4.4z
                reflectiveCurveToRelative(
                    dx1 = -1.974f,
                    dy1 = -4.4f,
                    dx2 = -4.4f,
                    dy2 = -4.4f,
                )
                close()
            }
            // M18 31.5 c-0.663 0 -1.2 -0.538 -1.2 -1.2 v-7.2 c0 -0.663 0.537 -1.2 1.2 -1.2 s1.2 0.538 1.2 1.2 v7.2 c0 0.662 -0.537 1.2 -1.2 1.2z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 18 31.5
                moveTo(x = 18.0f, y = 31.5f)
                // c -0.663 0 -1.2 -0.538 -1.2 -1.2
                curveToRelative(
                    dx1 = -0.663f,
                    dy1 = 0.0f,
                    dx2 = -1.2f,
                    dy2 = -0.538f,
                    dx3 = -1.2f,
                    dy3 = -1.2f,
                )
                // v -7.2
                verticalLineToRelative(dy = -7.2f)
                // c 0 -0.663 0.537 -1.2 1.2 -1.2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.663f,
                    dx2 = 0.537f,
                    dy2 = -1.2f,
                    dx3 = 1.2f,
                    dy3 = -1.2f,
                )
                // s 1.2 0.538 1.2 1.2
                reflectiveCurveToRelative(
                    dx1 = 1.2f,
                    dy1 = 0.538f,
                    dx2 = 1.2f,
                    dy2 = 1.2f,
                )
                // v 7.2
                verticalLineToRelative(dy = 7.2f)
                // c 0 0.662 -0.537 1.2 -1.2 1.2z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.662f,
                    dx2 = -0.537f,
                    dy2 = 1.2f,
                    dx3 = -1.2f,
                    dy3 = 1.2f,
                )
                close()
            }
            // M21.9 28.3 h-7.8 c-0.663 0 -1.2 -0.537 -1.2 -1.2 s0.537 -1.2 1.2 -1.2 h7.8 c0.663 0 1.2 0.538 1.2 1.2 s-0.537 1.2 -1.2 1.2z M28.8 5.5 h-7.175 c-0.663 0 -1.2 0.537 -1.2 1.2 s0.537 1.2 1.2 1.2 h4.278 l-5.6 5.503 L22 15.1 l5.6 -5.503 L27.6 13.9 c0 0.662 0.538 1.2 1.2 1.2 0.663 0 1.2 -0.538 1.2 -1.2 L30 6.7 c0 -0.663 -0.538 -1.2 -1.2 -1.2z M13.606 10.791 l-2.315 2.315 c-0.469 0.469 -1.229 0.468 -1.697 0 -0.468 -0.468 -0.469 -1.228 0 -1.697 l2.315 -2.315 c0.469 -0.469 1.229 -0.468 1.697 0 0.469 0.468 0.469 1.228 0 1.697z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 21.9 28.3
                moveTo(x = 21.9f, y = 28.3f)
                // h -7.8
                horizontalLineToRelative(dx = -7.8f)
                // c -0.663 0 -1.2 -0.537 -1.2 -1.2
                curveToRelative(
                    dx1 = -0.663f,
                    dy1 = 0.0f,
                    dx2 = -1.2f,
                    dy2 = -0.537f,
                    dx3 = -1.2f,
                    dy3 = -1.2f,
                )
                // s 0.537 -1.2 1.2 -1.2
                reflectiveCurveToRelative(
                    dx1 = 0.537f,
                    dy1 = -1.2f,
                    dx2 = 1.2f,
                    dy2 = -1.2f,
                )
                // h 7.8
                horizontalLineToRelative(dx = 7.8f)
                // c 0.663 0 1.2 0.538 1.2 1.2
                curveToRelative(
                    dx1 = 0.663f,
                    dy1 = 0.0f,
                    dx2 = 1.2f,
                    dy2 = 0.538f,
                    dx3 = 1.2f,
                    dy3 = 1.2f,
                )
                // s -0.537 1.2 -1.2 1.2z
                reflectiveCurveToRelative(
                    dx1 = -0.537f,
                    dy1 = 1.2f,
                    dx2 = -1.2f,
                    dy2 = 1.2f,
                )
                close()
                // M 28.8 5.5
                moveTo(x = 28.8f, y = 5.5f)
                // h -7.175
                horizontalLineToRelative(dx = -7.175f)
                // c -0.663 0 -1.2 0.537 -1.2 1.2
                curveToRelative(
                    dx1 = -0.663f,
                    dy1 = 0.0f,
                    dx2 = -1.2f,
                    dy2 = 0.537f,
                    dx3 = -1.2f,
                    dy3 = 1.2f,
                )
                // s 0.537 1.2 1.2 1.2
                reflectiveCurveToRelative(
                    dx1 = 0.537f,
                    dy1 = 1.2f,
                    dx2 = 1.2f,
                    dy2 = 1.2f,
                )
                // h 4.278
                horizontalLineToRelative(dx = 4.278f)
                // l -5.6 5.503
                lineToRelative(dx = -5.6f, dy = 5.503f)
                // L 22 15.1
                lineTo(x = 22.0f, y = 15.1f)
                // l 5.6 -5.503
                lineToRelative(dx = 5.6f, dy = -5.503f)
                // L 27.6 13.9
                lineTo(x = 27.6f, y = 13.9f)
                // c 0 0.662 0.538 1.2 1.2 1.2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.662f,
                    dx2 = 0.538f,
                    dy2 = 1.2f,
                    dx3 = 1.2f,
                    dy3 = 1.2f,
                )
                // c 0.663 0 1.2 -0.538 1.2 -1.2
                curveToRelative(
                    dx1 = 0.663f,
                    dy1 = 0.0f,
                    dx2 = 1.2f,
                    dy2 = -0.538f,
                    dx3 = 1.2f,
                    dy3 = -1.2f,
                )
                // L 30 6.7
                lineTo(x = 30.0f, y = 6.7f)
                // c 0 -0.663 -0.538 -1.2 -1.2 -1.2z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.663f,
                    dx2 = -0.538f,
                    dy2 = -1.2f,
                    dx3 = -1.2f,
                    dy3 = -1.2f,
                )
                close()
                // M 13.606 10.791
                moveTo(x = 13.606f, y = 10.791f)
                // l -2.315 2.315
                lineToRelative(dx = -2.315f, dy = 2.315f)
                // c -0.469 0.469 -1.229 0.468 -1.697 0
                curveToRelative(
                    dx1 = -0.469f,
                    dy1 = 0.469f,
                    dx2 = -1.229f,
                    dy2 = 0.468f,
                    dx3 = -1.697f,
                    dy3 = 0.0f,
                )
                // c -0.468 -0.468 -0.469 -1.228 0 -1.697
                curveToRelative(
                    dx1 = -0.468f,
                    dy1 = -0.468f,
                    dx2 = -0.469f,
                    dy2 = -1.228f,
                    dx3 = 0.0f,
                    dy3 = -1.697f,
                )
                // l 2.315 -2.315
                lineToRelative(dx = 2.315f, dy = -2.315f)
                // c 0.469 -0.469 1.229 -0.468 1.697 0
                curveToRelative(
                    dx1 = 0.469f,
                    dy1 = -0.469f,
                    dx2 = 1.229f,
                    dy2 = -0.468f,
                    dx3 = 1.697f,
                    dy3 = 0.0f,
                )
                // c 0.469 0.468 0.469 1.228 0 1.697z
                curveToRelative(
                    dx1 = 0.469f,
                    dy1 = 0.468f,
                    dx2 = 0.469f,
                    dy2 = 1.228f,
                    dx3 = 0.0f,
                    dy3 = 1.697f,
                )
                close()
            }
            // M7.2 5.5 h7.175 c0.663 0 1.2 0.537 1.2 1.2 s-0.537 1.2 -1.2 1.2 h-4.278 l5.6 5.503 L14 15.1 8.4 9.597 V13.9 c0 0.662 -0.537 1.2 -1.2 1.2 S6 14.562 6 13.9 V6.7 c0 -0.663 0.537 -1.2 1.2 -1.2z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 7.2 5.5
                moveTo(x = 7.2f, y = 5.5f)
                // h 7.175
                horizontalLineToRelative(dx = 7.175f)
                // c 0.663 0 1.2 0.537 1.2 1.2
                curveToRelative(
                    dx1 = 0.663f,
                    dy1 = 0.0f,
                    dx2 = 1.2f,
                    dy2 = 0.537f,
                    dx3 = 1.2f,
                    dy3 = 1.2f,
                )
                // s -0.537 1.2 -1.2 1.2
                reflectiveCurveToRelative(
                    dx1 = -0.537f,
                    dy1 = 1.2f,
                    dx2 = -1.2f,
                    dy2 = 1.2f,
                )
                // h -4.278
                horizontalLineToRelative(dx = -4.278f)
                // l 5.6 5.503
                lineToRelative(dx = 5.6f, dy = 5.503f)
                // L 14 15.1
                lineTo(x = 14.0f, y = 15.1f)
                // L 8.4 9.597
                lineTo(x = 8.4f, y = 9.597f)
                // V 13.9
                verticalLineTo(y = 13.9f)
                // c 0 0.662 -0.537 1.2 -1.2 1.2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.662f,
                    dx2 = -0.537f,
                    dy2 = 1.2f,
                    dx3 = -1.2f,
                    dy3 = 1.2f,
                )
                // S 6 14.562 6 13.9
                reflectiveCurveTo(
                    x1 = 6.0f,
                    y1 = 14.562f,
                    x2 = 6.0f,
                    y2 = 13.9f,
                )
                // V 6.7
                verticalLineTo(y = 6.7f)
                // c 0 -0.663 0.537 -1.2 1.2 -1.2z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.663f,
                    dx2 = 0.537f,
                    dy2 = -1.2f,
                    dx3 = 1.2f,
                    dy3 = -1.2f,
                )
                close()
            }
        }.build().also { _emoji26a7 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji26a7: ImageVector? = null
