package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f4bd: ImageVector
    get() {
        val current = _emoji1f4bd
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f4bd",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 32 c0 2.209 -1.791 4 -4 4 H4 c-2.209 0 -4 -1.791 -4 -4 V4 c0 -2.209 1.791 -4 4 -4 h28 c2.209 0 4 1.791 4 4 v28z
            path(
                fill = SolidColor(Color(0xFF292F33)),
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
            // M34 18 c0 8.837 -7.163 16 -16 16 -8.836 0 -16 -7.163 -16 -16 C2 9.164 9.164 2 18 2 c8.837 0 16 7.164 16 16z M18 15.333 c-1.473 0 -2.667 1.194 -2.667 2.667 0 1.473 1.194 2.667 2.667 2.667 1.473 0 2.667 -1.194 2.667 -2.667 0 -1.473 -1.194 -2.667 -2.667 -2.667z
            path(
                fill = SolidColor(Color(0xFFFFD983)),
            ) {
                // M 34 18
                moveTo(x = 34.0f, y = 18.0f)
                // c 0 8.837 -7.163 16 -16 16
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 8.837f,
                    dx2 = -7.163f,
                    dy2 = 16.0f,
                    dx3 = -16.0f,
                    dy3 = 16.0f,
                )
                // c -8.836 0 -16 -7.163 -16 -16
                curveToRelative(
                    dx1 = -8.836f,
                    dy1 = 0.0f,
                    dx2 = -16.0f,
                    dy2 = -7.163f,
                    dx3 = -16.0f,
                    dy3 = -16.0f,
                )
                // C 2 9.164 9.164 2 18 2
                curveTo(
                    x1 = 2.0f,
                    y1 = 9.164f,
                    x2 = 9.164f,
                    y2 = 2.0f,
                    x3 = 18.0f,
                    y3 = 2.0f,
                )
                // c 8.837 0 16 7.164 16 16z
                curveToRelative(
                    dx1 = 8.837f,
                    dy1 = 0.0f,
                    dx2 = 16.0f,
                    dy2 = 7.164f,
                    dx3 = 16.0f,
                    dy3 = 16.0f,
                )
                close()
                // M 18 15.333
                moveTo(x = 18.0f, y = 15.333f)
                // c -1.473 0 -2.667 1.194 -2.667 2.667
                curveToRelative(
                    dx1 = -1.473f,
                    dy1 = 0.0f,
                    dx2 = -2.667f,
                    dy2 = 1.194f,
                    dx3 = -2.667f,
                    dy3 = 2.667f,
                )
                // c 0 1.473 1.194 2.667 2.667 2.667
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.473f,
                    dx2 = 1.194f,
                    dy2 = 2.667f,
                    dx3 = 2.667f,
                    dy3 = 2.667f,
                )
                // c 1.473 0 2.667 -1.194 2.667 -2.667
                curveToRelative(
                    dx1 = 1.473f,
                    dy1 = 0.0f,
                    dx2 = 2.667f,
                    dy2 = -1.194f,
                    dx3 = 2.667f,
                    dy3 = -2.667f,
                )
                // c 0 -1.473 -1.194 -2.667 -2.667 -2.667z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.473f,
                    dx2 = -1.194f,
                    dy2 = -2.667f,
                    dx3 = -2.667f,
                    dy3 = -2.667f,
                )
                close()
            }
            // M13.811 17.535 c0.109 -0.982 0.531 -1.868 1.193 -2.53 L7.943 7.943 c-2.226 2.226 -3.712 5.187 -4.075 8.487 l9.943 1.105z M22.189 18.465 c-0.109 0.981 -0.532 1.867 -1.194 2.53 l7.062 7.062 c2.226 -2.226 3.712 -5.187 4.075 -8.487 l-9.943 -1.105z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 13.811 17.535
                moveTo(x = 13.811f, y = 17.535f)
                // c 0.109 -0.982 0.531 -1.868 1.193 -2.53
                curveToRelative(
                    dx1 = 0.109f,
                    dy1 = -0.982f,
                    dx2 = 0.531f,
                    dy2 = -1.868f,
                    dx3 = 1.193f,
                    dy3 = -2.53f,
                )
                // L 7.943 7.943
                lineTo(x = 7.943f, y = 7.943f)
                // c -2.226 2.226 -3.712 5.187 -4.075 8.487
                curveToRelative(
                    dx1 = -2.226f,
                    dy1 = 2.226f,
                    dx2 = -3.712f,
                    dy2 = 5.187f,
                    dx3 = -4.075f,
                    dy3 = 8.487f,
                )
                // l 9.943 1.105z
                lineToRelative(dx = 9.943f, dy = 1.105f)
                close()
                // M 22.189 18.465
                moveTo(x = 22.189f, y = 18.465f)
                // c -0.109 0.981 -0.532 1.867 -1.194 2.53
                curveToRelative(
                    dx1 = -0.109f,
                    dy1 = 0.981f,
                    dx2 = -0.532f,
                    dy2 = 1.867f,
                    dx3 = -1.194f,
                    dy3 = 2.53f,
                )
                // l 7.062 7.062
                lineToRelative(dx = 7.062f, dy = 7.062f)
                // c 2.226 -2.226 3.712 -5.187 4.075 -8.487
                curveToRelative(
                    dx1 = 2.226f,
                    dy1 = -2.226f,
                    dx2 = 3.712f,
                    dy2 = -5.187f,
                    dx3 = 4.075f,
                    dy3 = -8.487f,
                )
                // l -9.943 -1.105z
                lineToRelative(dx = -9.943f, dy = -1.105f)
                close()
            }
            // M18.469 22.189 l1.111 9.941 c3.295 -0.365 6.253 -1.85 8.476 -4.074 l-7.062 -7.062 c-0.661 0.662 -1.546 1.086 -2.525 1.195z M17.559 13.809 l-1.048 -9.953 c-3.333 0.347 -6.324 1.843 -8.569 4.087 l7.062 7.062 c0.668 -0.668 1.564 -1.092 2.555 -1.196z
            path(
                fill = SolidColor(Color(0xFFFFE8B6)),
            ) {
                // M 18.469 22.189
                moveTo(x = 18.469f, y = 22.189f)
                // l 1.111 9.941
                lineToRelative(dx = 1.111f, dy = 9.941f)
                // c 3.295 -0.365 6.253 -1.85 8.476 -4.074
                curveToRelative(
                    dx1 = 3.295f,
                    dy1 = -0.365f,
                    dx2 = 6.253f,
                    dy2 = -1.85f,
                    dx3 = 8.476f,
                    dy3 = -4.074f,
                )
                // l -7.062 -7.062
                lineToRelative(dx = -7.062f, dy = -7.062f)
                // c -0.661 0.662 -1.546 1.086 -2.525 1.195z
                curveToRelative(
                    dx1 = -0.661f,
                    dy1 = 0.662f,
                    dx2 = -1.546f,
                    dy2 = 1.086f,
                    dx3 = -2.525f,
                    dy3 = 1.195f,
                )
                close()
                // M 17.559 13.809
                moveTo(x = 17.559f, y = 13.809f)
                // l -1.048 -9.953
                lineToRelative(dx = -1.048f, dy = -9.953f)
                // c -3.333 0.347 -6.324 1.843 -8.569 4.087
                curveToRelative(
                    dx1 = -3.333f,
                    dy1 = 0.347f,
                    dx2 = -6.324f,
                    dy2 = 1.843f,
                    dx3 = -8.569f,
                    dy3 = 4.087f,
                )
                // l 7.062 7.062
                lineToRelative(dx = 7.062f, dy = 7.062f)
                // c 0.668 -0.668 1.564 -1.092 2.555 -1.196z
                curveToRelative(
                    dx1 = 0.668f,
                    dy1 = -0.668f,
                    dx2 = 1.564f,
                    dy2 = -1.092f,
                    dx3 = 2.555f,
                    dy3 = -1.196f,
                )
                close()
            }
            // M36 21 c0 1.104 -0.896 2 -2 2 H23 c-1.104 0 -2 -0.896 -2 -2 v-6 c0 -1.104 0.896 -2 2 -2 h11 c1.104 0 2 0.896 2 2 v6z
            path(
                fill = SolidColor(Color(0xFFF5F8FA)),
            ) {
                // M 36 21
                moveTo(x = 36.0f, y = 21.0f)
                // c 0 1.104 -0.896 2 -2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = -0.896f,
                    dy2 = 2.0f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // H 23
                horizontalLineTo(x = 23.0f)
                // c -1.104 0 -2 -0.896 -2 -2
                curveToRelative(
                    dx1 = -1.104f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -0.896f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // c 0 -1.104 0.896 -2 2 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.104f,
                    dx2 = 0.896f,
                    dy2 = -2.0f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // h 11
                horizontalLineToRelative(dx = 11.0f)
                // c 1.104 0 2 0.896 2 2
                curveToRelative(
                    dx1 = 1.104f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 0.896f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                // v 6z
                verticalLineToRelative(dy = 6.0f)
                close()
            }
        }.build().also { _emoji1f4bd = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f4bd: ImageVector? = null
