package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1ed1f1f7: ImageVector
    get() {
        val current = _emoji1f1ed1f1f7
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1ed1f1f7",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M0 12.9 h36 v10.2 H0z
            path(
                fill = SolidColor(Color(0xFFEEEEEE)),
            ) {
                // M 0 12.9
                moveTo(x = 0.0f, y = 12.9f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // v 10.2
                verticalLineToRelative(dy = 10.2f)
                // H 0z
                horizontalLineTo(x = 0.0f)
                close()
            }
            // M36 27 c0 2.209 -1.791 4 -4 4 H4 c-2.209 0 -4 -1.791 -4 -4 v-4 h36 v4z
            path(
                fill = SolidColor(Color(0xFF171796)),
            ) {
                // M 36 27
                moveTo(x = 36.0f, y = 27.0f)
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
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // v 4z
                verticalLineToRelative(dy = 4.0f)
                close()
            }
            // M32 5 H4 C1.791 5 0 6.791 0 9 v4 h36 V9 c0 -2.209 -1.791 -4 -4 -4z
            path(
                fill = SolidColor(Color(0xFFD52B1E)),
            ) {
                // M 32 5
                moveTo(x = 32.0f, y = 5.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // C 1.791 5 0 6.791 0 9
                curveTo(
                    x1 = 1.791f,
                    y1 = 5.0f,
                    x2 = 0.0f,
                    y2 = 6.791f,
                    x3 = 0.0f,
                    y3 = 9.0f,
                )
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // V 9
                verticalLineTo(y = 9.0f)
                // c 0 -2.209 -1.791 -4 -4 -4z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.209f,
                    dx2 = -1.791f,
                    dy2 = -4.0f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                close()
            }
            // M11.409 7.436 V18.97 c0 3.64 2.951 6.591 6.591 6.591 s6.591 -2.951 6.591 -6.591 V7.436 H11.409z
            path(
                fill = SolidColor(Color(0xFFD52B1E)),
            ) {
                // M 11.409 7.436
                moveTo(x = 11.409f, y = 7.436f)
                // V 18.97
                verticalLineTo(y = 18.97f)
                // c 0 3.64 2.951 6.591 6.591 6.591
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.64f,
                    dx2 = 2.951f,
                    dy2 = 6.591f,
                    dx3 = 6.591f,
                    dy3 = 6.591f,
                )
                // s 6.591 -2.951 6.591 -6.591
                reflectiveCurveToRelative(
                    dx1 = 6.591f,
                    dy1 = -2.951f,
                    dx2 = 6.591f,
                    dy2 = -6.591f,
                )
                // V 7.436
                verticalLineTo(y = 7.436f)
                // H 11.409z
                horizontalLineTo(x = 11.409f)
                close()
            }
            // M14.25 18 h2.5 v2.5 h-2.5z M16.75 20.5 h2.5 L19.25 23 h-2.5z M16.75 15.5 h2.5 L19.25 18 h-2.5z M19.25 18 h2.5 v2.5 h-2.5z M19.25 13 h2.5 v2.5 h-2.5z M21.75 15.5 h2.341 L24.091 18 L21.75 18z M14.25 13 h2.5 v2.5 h-2.5z M21.75 23 h0.805 c0.626 -0.707 1.089 -1.559 1.334 -2.5 L21.75 20.5 L21.75 23z M19.25 23 v1.931 c0.929 -0.195 1.778 -0.605 2.5 -1.171 L21.75 23 h-2.5z M14.25 23 v-2.5 h-2.139 c0.245 0.941 0.707 1.793 1.334 2.5 h0.805z M11.909 15.5 h2.341 L14.25 18 h-2.341z M14.25 23 v0.76 c0.722 0.566 1.571 0.976 2.5 1.171 L16.75 23 h-2.5z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 14.25 18
                moveTo(x = 14.25f, y = 18.0f)
                // h 2.5
                horizontalLineToRelative(dx = 2.5f)
                // v 2.5
                verticalLineToRelative(dy = 2.5f)
                // h -2.5z
                horizontalLineToRelative(dx = -2.5f)
                close()
                // M 16.75 20.5
                moveTo(x = 16.75f, y = 20.5f)
                // h 2.5
                horizontalLineToRelative(dx = 2.5f)
                // L 19.25 23
                lineTo(x = 19.25f, y = 23.0f)
                // h -2.5z
                horizontalLineToRelative(dx = -2.5f)
                close()
                // M 16.75 15.5
                moveTo(x = 16.75f, y = 15.5f)
                // h 2.5
                horizontalLineToRelative(dx = 2.5f)
                // L 19.25 18
                lineTo(x = 19.25f, y = 18.0f)
                // h -2.5z
                horizontalLineToRelative(dx = -2.5f)
                close()
                // M 19.25 18
                moveTo(x = 19.25f, y = 18.0f)
                // h 2.5
                horizontalLineToRelative(dx = 2.5f)
                // v 2.5
                verticalLineToRelative(dy = 2.5f)
                // h -2.5z
                horizontalLineToRelative(dx = -2.5f)
                close()
                // M 19.25 13
                moveTo(x = 19.25f, y = 13.0f)
                // h 2.5
                horizontalLineToRelative(dx = 2.5f)
                // v 2.5
                verticalLineToRelative(dy = 2.5f)
                // h -2.5z
                horizontalLineToRelative(dx = -2.5f)
                close()
                // M 21.75 15.5
                moveTo(x = 21.75f, y = 15.5f)
                // h 2.341
                horizontalLineToRelative(dx = 2.341f)
                // L 24.091 18
                lineTo(x = 24.091f, y = 18.0f)
                // L 21.75 18z
                lineTo(x = 21.75f, y = 18.0f)
                close()
                // M 14.25 13
                moveTo(x = 14.25f, y = 13.0f)
                // h 2.5
                horizontalLineToRelative(dx = 2.5f)
                // v 2.5
                verticalLineToRelative(dy = 2.5f)
                // h -2.5z
                horizontalLineToRelative(dx = -2.5f)
                close()
                // M 21.75 23
                moveTo(x = 21.75f, y = 23.0f)
                // h 0.805
                horizontalLineToRelative(dx = 0.805f)
                // c 0.626 -0.707 1.089 -1.559 1.334 -2.5
                curveToRelative(
                    dx1 = 0.626f,
                    dy1 = -0.707f,
                    dx2 = 1.089f,
                    dy2 = -1.559f,
                    dx3 = 1.334f,
                    dy3 = -2.5f,
                )
                // L 21.75 20.5
                lineTo(x = 21.75f, y = 20.5f)
                // L 21.75 23z
                lineTo(x = 21.75f, y = 23.0f)
                close()
                // M 19.25 23
                moveTo(x = 19.25f, y = 23.0f)
                // v 1.931
                verticalLineToRelative(dy = 1.931f)
                // c 0.929 -0.195 1.778 -0.605 2.5 -1.171
                curveToRelative(
                    dx1 = 0.929f,
                    dy1 = -0.195f,
                    dx2 = 1.778f,
                    dy2 = -0.605f,
                    dx3 = 2.5f,
                    dy3 = -1.171f,
                )
                // L 21.75 23
                lineTo(x = 21.75f, y = 23.0f)
                // h -2.5z
                horizontalLineToRelative(dx = -2.5f)
                close()
                // M 14.25 23
                moveTo(x = 14.25f, y = 23.0f)
                // v -2.5
                verticalLineToRelative(dy = -2.5f)
                // h -2.139
                horizontalLineToRelative(dx = -2.139f)
                // c 0.245 0.941 0.707 1.793 1.334 2.5
                curveToRelative(
                    dx1 = 0.245f,
                    dy1 = 0.941f,
                    dx2 = 0.707f,
                    dy2 = 1.793f,
                    dx3 = 1.334f,
                    dy3 = 2.5f,
                )
                // h 0.805z
                horizontalLineToRelative(dx = 0.805f)
                close()
                // M 11.909 15.5
                moveTo(x = 11.909f, y = 15.5f)
                // h 2.341
                horizontalLineToRelative(dx = 2.341f)
                // L 14.25 18
                lineTo(x = 14.25f, y = 18.0f)
                // h -2.341z
                horizontalLineToRelative(dx = -2.341f)
                close()
                // M 14.25 23
                moveTo(x = 14.25f, y = 23.0f)
                // v 0.76
                verticalLineToRelative(dy = 0.76f)
                // c 0.722 0.566 1.571 0.976 2.5 1.171
                curveToRelative(
                    dx1 = 0.722f,
                    dy1 = 0.566f,
                    dx2 = 1.571f,
                    dy2 = 0.976f,
                    dx3 = 2.5f,
                    dy3 = 1.171f,
                )
                // L 16.75 23
                lineTo(x = 16.75f, y = 23.0f)
                // h -2.5z
                horizontalLineToRelative(dx = -2.5f)
                close()
            }
            // M24.757 8.141 l-1.998 0.791 -1.328 -1.682 -1.829 1.126 L18 6.949 l-1.603 1.428 -1.826 -1.128 -1.331 1.684 -1.995 -0.793 -1.122 2.08 1.331 2.862 0.176 -0.082 c0.78 -0.363 1.603 -0.662 2.443 -0.888 l0.04 -0.011 c0.854 -0.227 1.702 -0.378 2.523 -0.451 l0.064 -0.006 c0.705 -0.06 1.896 -0.06 2.601 0 l0.058 0.005 c0.824 0.074 1.678 0.226 2.536 0.453 l0.033 0.009 c0.836 0.225 1.658 0.524 2.441 0.889 l0.175 0.082 1.331 -2.861 -1.118 -2.08z
            path(
                fill = SolidColor(Color(0xFF171796)),
            ) {
                // M 24.757 8.141
                moveTo(x = 24.757f, y = 8.141f)
                // l -1.998 0.791
                lineToRelative(dx = -1.998f, dy = 0.791f)
                // l -1.328 -1.682
                lineToRelative(dx = -1.328f, dy = -1.682f)
                // l -1.829 1.126
                lineToRelative(dx = -1.829f, dy = 1.126f)
                // L 18 6.949
                lineTo(x = 18.0f, y = 6.949f)
                // l -1.603 1.428
                lineToRelative(dx = -1.603f, dy = 1.428f)
                // l -1.826 -1.128
                lineToRelative(dx = -1.826f, dy = -1.128f)
                // l -1.331 1.684
                lineToRelative(dx = -1.331f, dy = 1.684f)
                // l -1.995 -0.793
                lineToRelative(dx = -1.995f, dy = -0.793f)
                // l -1.122 2.08
                lineToRelative(dx = -1.122f, dy = 2.08f)
                // l 1.331 2.862
                lineToRelative(dx = 1.331f, dy = 2.862f)
                // l 0.176 -0.082
                lineToRelative(dx = 0.176f, dy = -0.082f)
                // c 0.78 -0.363 1.603 -0.662 2.443 -0.888
                curveToRelative(
                    dx1 = 0.78f,
                    dy1 = -0.363f,
                    dx2 = 1.603f,
                    dy2 = -0.662f,
                    dx3 = 2.443f,
                    dy3 = -0.888f,
                )
                // l 0.04 -0.011
                lineToRelative(dx = 0.04f, dy = -0.011f)
                // c 0.854 -0.227 1.702 -0.378 2.523 -0.451
                curveToRelative(
                    dx1 = 0.854f,
                    dy1 = -0.227f,
                    dx2 = 1.702f,
                    dy2 = -0.378f,
                    dx3 = 2.523f,
                    dy3 = -0.451f,
                )
                // l 0.064 -0.006
                lineToRelative(dx = 0.064f, dy = -0.006f)
                // c 0.705 -0.06 1.896 -0.06 2.601 0
                curveToRelative(
                    dx1 = 0.705f,
                    dy1 = -0.06f,
                    dx2 = 1.896f,
                    dy2 = -0.06f,
                    dx3 = 2.601f,
                    dy3 = 0.0f,
                )
                // l 0.058 0.005
                lineToRelative(dx = 0.058f, dy = 0.005f)
                // c 0.824 0.074 1.678 0.226 2.536 0.453
                curveToRelative(
                    dx1 = 0.824f,
                    dy1 = 0.074f,
                    dx2 = 1.678f,
                    dy2 = 0.226f,
                    dx3 = 2.536f,
                    dy3 = 0.453f,
                )
                // l 0.033 0.009
                lineToRelative(dx = 0.033f, dy = 0.009f)
                // c 0.836 0.225 1.658 0.524 2.441 0.889
                curveToRelative(
                    dx1 = 0.836f,
                    dy1 = 0.225f,
                    dx2 = 1.658f,
                    dy2 = 0.524f,
                    dx3 = 2.441f,
                    dy3 = 0.889f,
                )
                // l 0.175 0.082
                lineToRelative(dx = 0.175f, dy = 0.082f)
                // l 1.331 -2.861
                lineToRelative(dx = 1.331f, dy = -2.861f)
                // l -1.118 -2.08z
                lineToRelative(dx = -1.118f, dy = -2.08f)
                close()
            }
            // M16.638 8.681 l0.221 2.563 c0.33 -0.026 0.729 -0.051 1.141 -0.051 0.412 0 0.811 0.025 1.141 0.051 l0.221 -2.563 L18 7.468 l-1.362 1.213z M24.579 8.628 l-1.698 0.673 -0.668 2.489 c0.731 0.206 1.45 0.468 2.144 0.779 l1.086 -2.336 -0.864 -1.605z M11.422 8.626 l-0.866 1.606 1.087 2.336 c0.69 -0.31 1.409 -0.572 2.144 -0.779 l-0.67 -2.49 -1.695 -0.673z
            path(
                fill = SolidColor(Color(0xFF0193DD)),
            ) {
                // M 16.638 8.681
                moveTo(x = 16.638f, y = 8.681f)
                // l 0.221 2.563
                lineToRelative(dx = 0.221f, dy = 2.563f)
                // c 0.33 -0.026 0.729 -0.051 1.141 -0.051
                curveToRelative(
                    dx1 = 0.33f,
                    dy1 = -0.026f,
                    dx2 = 0.729f,
                    dy2 = -0.051f,
                    dx3 = 1.141f,
                    dy3 = -0.051f,
                )
                // c 0.412 0 0.811 0.025 1.141 0.051
                curveToRelative(
                    dx1 = 0.412f,
                    dy1 = 0.0f,
                    dx2 = 0.811f,
                    dy2 = 0.025f,
                    dx3 = 1.141f,
                    dy3 = 0.051f,
                )
                // l 0.221 -2.563
                lineToRelative(dx = 0.221f, dy = -2.563f)
                // L 18 7.468
                lineTo(x = 18.0f, y = 7.468f)
                // l -1.362 1.213z
                lineToRelative(dx = -1.362f, dy = 1.213f)
                close()
                // M 24.579 8.628
                moveTo(x = 24.579f, y = 8.628f)
                // l -1.698 0.673
                lineToRelative(dx = -1.698f, dy = 0.673f)
                // l -0.668 2.489
                lineToRelative(dx = -0.668f, dy = 2.489f)
                // c 0.731 0.206 1.45 0.468 2.144 0.779
                curveToRelative(
                    dx1 = 0.731f,
                    dy1 = 0.206f,
                    dx2 = 1.45f,
                    dy2 = 0.468f,
                    dx3 = 2.144f,
                    dy3 = 0.779f,
                )
                // l 1.086 -2.336
                lineToRelative(dx = 1.086f, dy = -2.336f)
                // l -0.864 -1.605z
                lineToRelative(dx = -0.864f, dy = -1.605f)
                close()
                // M 11.422 8.626
                moveTo(x = 11.422f, y = 8.626f)
                // l -0.866 1.606
                lineToRelative(dx = -0.866f, dy = 1.606f)
                // l 1.087 2.336
                lineToRelative(dx = 1.087f, dy = 2.336f)
                // c 0.69 -0.31 1.409 -0.572 2.144 -0.779
                curveToRelative(
                    dx1 = 0.69f,
                    dy1 = -0.31f,
                    dx2 = 1.409f,
                    dy2 = -0.572f,
                    dx3 = 2.144f,
                    dy3 = -0.779f,
                )
                // l -0.67 -2.49
                lineToRelative(dx = -0.67f, dy = -2.49f)
                // l -1.695 -0.673z
                lineToRelative(dx = -1.695f, dy = -0.673f)
                close()
            }
        }.build().also { _emoji1f1ed1f1f7 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1ed1f1f7: ImageVector? = null
