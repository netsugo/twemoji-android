package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f400: ImageVector
    get() {
        val current = _emoji1f400
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f400",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M30 36 H6 c-0.552 0 -1 -0.447 -1 -1 s0.448 -1 1 -1 h24 c2.542 0 4 -1.367 4 -3.75 0 -1.537 -1.643 -3.25 -4 -3.25 h-7 c-0.553 0 -1 -0.447 -1 -1 s0.447 -1 1 -1 h7 c3.589 0 6 2.715 6 5.25 0 3.493 -2.355 5.75 -6 5.75z
            path(
                fill = SolidColor(Color(0xFFEA596E)),
            ) {
                // M 30 36
                moveTo(x = 30.0f, y = 36.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // c -0.552 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // s 0.448 -1 1 -1
                reflectiveCurveToRelative(
                    dx1 = 0.448f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // h 24
                horizontalLineToRelative(dx = 24.0f)
                // c 2.542 0 4 -1.367 4 -3.75
                curveToRelative(
                    dx1 = 2.542f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = -1.367f,
                    dx3 = 4.0f,
                    dy3 = -3.75f,
                )
                // c 0 -1.537 -1.643 -3.25 -4 -3.25
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.537f,
                    dx2 = -1.643f,
                    dy2 = -3.25f,
                    dx3 = -4.0f,
                    dy3 = -3.25f,
                )
                // h -7
                horizontalLineToRelative(dx = -7.0f)
                // c -0.553 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.553f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // s 0.447 -1 1 -1
                reflectiveCurveToRelative(
                    dx1 = 0.447f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // c 3.589 0 6 2.715 6 5.25
                curveToRelative(
                    dx1 = 3.589f,
                    dy1 = 0.0f,
                    dx2 = 6.0f,
                    dy2 = 2.715f,
                    dx3 = 6.0f,
                    dy3 = 5.25f,
                )
                // c 0 3.493 -2.355 5.75 -6 5.75z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.493f,
                    dx2 = -2.355f,
                    dy2 = 5.75f,
                    dx3 = -6.0f,
                    dy3 = 5.75f,
                )
                close()
            }
            // M12 24.5 c0 -3.037 3.604 -5.938 1 -7.5 -3.407 -2.044 -6.879 4.293 -9 5 -3 1 -4 3.407 -4 5 0 1.838 1.986 1.725 5 2 1.906 0.175 5.594 0.125 9 1 2.942 0.756 -2 -2.462 -2 -5.5z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 12 24.5
                moveTo(x = 12.0f, y = 24.5f)
                // c 0 -3.037 3.604 -5.938 1 -7.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.037f,
                    dx2 = 3.604f,
                    dy2 = -5.938f,
                    dx3 = 1.0f,
                    dy3 = -7.5f,
                )
                // c -3.407 -2.044 -6.879 4.293 -9 5
                curveToRelative(
                    dx1 = -3.407f,
                    dy1 = -2.044f,
                    dx2 = -6.879f,
                    dy2 = 4.293f,
                    dx3 = -9.0f,
                    dy3 = 5.0f,
                )
                // c -3 1 -4 3.407 -4 5
                curveToRelative(
                    dx1 = -3.0f,
                    dy1 = 1.0f,
                    dx2 = -4.0f,
                    dy2 = 3.407f,
                    dx3 = -4.0f,
                    dy3 = 5.0f,
                )
                // c 0 1.838 1.986 1.725 5 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.838f,
                    dx2 = 1.986f,
                    dy2 = 1.725f,
                    dx3 = 5.0f,
                    dy3 = 2.0f,
                )
                // c 1.906 0.175 5.594 0.125 9 1
                curveToRelative(
                    dx1 = 1.906f,
                    dy1 = 0.175f,
                    dx2 = 5.594f,
                    dy2 = 0.125f,
                    dx3 = 9.0f,
                    dy3 = 1.0f,
                )
                // c 2.942 0.756 -2 -2.462 -2 -5.5z
                curveToRelative(
                    dx1 = 2.942f,
                    dy1 = 0.756f,
                    dx2 = -2.0f,
                    dy2 = -2.462f,
                    dx3 = -2.0f,
                    dy3 = -5.5f,
                )
                close()
            }
            // M33 23.5 C33 15 29.247 11 24 11 c-10 0 -14 7 -14 14 0 5.247 6.753 6 12 6 s11 -2.253 11 -7.5z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 33 23.5
                moveTo(x = 33.0f, y = 23.5f)
                // C 33 15 29.247 11 24 11
                curveTo(
                    x1 = 33.0f,
                    y1 = 15.0f,
                    x2 = 29.247f,
                    y2 = 11.0f,
                    x3 = 24.0f,
                    y3 = 11.0f,
                )
                // c -10 0 -14 7 -14 14
                curveToRelative(
                    dx1 = -10.0f,
                    dy1 = 0.0f,
                    dx2 = -14.0f,
                    dy2 = 7.0f,
                    dx3 = -14.0f,
                    dy3 = 14.0f,
                )
                // c 0 5.247 6.753 6 12 6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 5.247f,
                    dx2 = 6.753f,
                    dy2 = 6.0f,
                    dx3 = 12.0f,
                    dy3 = 6.0f,
                )
                // s 11 -2.253 11 -7.5z
                reflectiveCurveToRelative(
                    dx1 = 11.0f,
                    dy1 = -2.253f,
                    dx2 = 11.0f,
                    dy2 = -7.5f,
                )
                close()
            }
            // M9.781 17.844 c0 -2.594 -2.375 -3.219 -1.188 -5.031 0.706 -1.078 2.588 -0.635 3.051 -0.582 -0.037 1.332 1.605 1.875 2.054 1.049 0.378 0.372 0.71 0.83 0.962 1.361 0.914 1.923 -0.461 4.49 -1.958 5.201 -1.494 0.711 -2.921 0.132 -2.921 -1.998z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 9.781 17.844
                moveTo(x = 9.781f, y = 17.844f)
                // c 0 -2.594 -2.375 -3.219 -1.188 -5.031
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.594f,
                    dx2 = -2.375f,
                    dy2 = -3.219f,
                    dx3 = -1.188f,
                    dy3 = -5.031f,
                )
                // c 0.706 -1.078 2.588 -0.635 3.051 -0.582
                curveToRelative(
                    dx1 = 0.706f,
                    dy1 = -1.078f,
                    dx2 = 2.588f,
                    dy2 = -0.635f,
                    dx3 = 3.051f,
                    dy3 = -0.582f,
                )
                // c -0.037 1.332 1.605 1.875 2.054 1.049
                curveToRelative(
                    dx1 = -0.037f,
                    dy1 = 1.332f,
                    dx2 = 1.605f,
                    dy2 = 1.875f,
                    dx3 = 2.054f,
                    dy3 = 1.049f,
                )
                // c 0.378 0.372 0.71 0.83 0.962 1.361
                curveToRelative(
                    dx1 = 0.378f,
                    dy1 = 0.372f,
                    dx2 = 0.71f,
                    dy2 = 0.83f,
                    dx3 = 0.962f,
                    dy3 = 1.361f,
                )
                // c 0.914 1.923 -0.461 4.49 -1.958 5.201
                curveToRelative(
                    dx1 = 0.914f,
                    dy1 = 1.923f,
                    dx2 = -0.461f,
                    dy2 = 4.49f,
                    dx3 = -1.958f,
                    dy3 = 5.201f,
                )
                // c -1.494 0.711 -2.921 0.132 -2.921 -1.998z
                curveToRelative(
                    dx1 = -1.494f,
                    dy1 = 0.711f,
                    dx2 = -2.921f,
                    dy2 = 0.132f,
                    dx3 = -2.921f,
                    dy3 = -1.998f,
                )
                close()
            }
            // M13.633 16.14 c0.084 1.279 -0.481 2.67 -1.396 2.915 -0.914 0.246 -1.277 -0.728 -1.608 -1.961 -0.331 -1.233 -0.95 -2.686 -0.036 -2.932 0.915 -0.246 2.931 0.317 3.04 1.978z
            path(
                fill = SolidColor(Color(0xFFE6AAAA)),
            ) {
                // M 13.633 16.14
                moveTo(x = 13.633f, y = 16.14f)
                // c 0.084 1.279 -0.481 2.67 -1.396 2.915
                curveToRelative(
                    dx1 = 0.084f,
                    dy1 = 1.279f,
                    dx2 = -0.481f,
                    dy2 = 2.67f,
                    dx3 = -1.396f,
                    dy3 = 2.915f,
                )
                // c -0.914 0.246 -1.277 -0.728 -1.608 -1.961
                curveToRelative(
                    dx1 = -0.914f,
                    dy1 = 0.246f,
                    dx2 = -1.277f,
                    dy2 = -0.728f,
                    dx3 = -1.608f,
                    dy3 = -1.961f,
                )
                // c -0.331 -1.233 -0.95 -2.686 -0.036 -2.932
                curveToRelative(
                    dx1 = -0.331f,
                    dy1 = -1.233f,
                    dx2 = -0.95f,
                    dy2 = -2.686f,
                    dx3 = -0.036f,
                    dy3 = -2.932f,
                )
                // c 0.915 -0.246 2.931 0.317 3.04 1.978z
                curveToRelative(
                    dx1 = 0.915f,
                    dy1 = -0.246f,
                    dx2 = 2.931f,
                    dy2 = 0.317f,
                    dx3 = 3.04f,
                    dy3 = 1.978f,
                )
                close()
            }
            // M8 23 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 8 23
                moveTo(x = 8.0f, y = 23.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // a 1 1 0 1 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 1 1 -2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
            }
            // M10.594 18.312 c-1.26 -1.717 -2.834 -1.977 -4.49 -1.979 -0.729 0 -0.687 0.479 -0.104 0.542 1.076 0.115 1.963 0.406 2.077 0.667 0.076 0.175 -0.702 -0.042 -1.431 -0.042 -1.167 0 -1.042 0.298 -0.167 0.521 1.875 0.479 1.833 1.219 2.896 1.188 1.063 -0.033 1.219 -0.897 1.219 -0.897z M26.442 11.325 c-1.65 -0.616 -3.942 -2.241 -6.192 -1.991 -0.751 0.083 -0.462 0.519 0 0.625 0.609 0.141 1.438 0.704 1.731 0.933 0.281 0.219 -2.314 -0.558 -4.065 0.109 -0.872 0.332 -0.514 0.562 0.031 0.5 0.816 -0.094 1.609 0.172 2.641 0.797 1.031 0.624 6.932 -0.571 5.854 -0.973z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 10.594 18.312
                moveTo(x = 10.594f, y = 18.312f)
                // c -1.26 -1.717 -2.834 -1.977 -4.49 -1.979
                curveToRelative(
                    dx1 = -1.26f,
                    dy1 = -1.717f,
                    dx2 = -2.834f,
                    dy2 = -1.977f,
                    dx3 = -4.49f,
                    dy3 = -1.979f,
                )
                // c -0.729 0 -0.687 0.479 -0.104 0.542
                curveToRelative(
                    dx1 = -0.729f,
                    dy1 = 0.0f,
                    dx2 = -0.687f,
                    dy2 = 0.479f,
                    dx3 = -0.104f,
                    dy3 = 0.542f,
                )
                // c 1.076 0.115 1.963 0.406 2.077 0.667
                curveToRelative(
                    dx1 = 1.076f,
                    dy1 = 0.115f,
                    dx2 = 1.963f,
                    dy2 = 0.406f,
                    dx3 = 2.077f,
                    dy3 = 0.667f,
                )
                // c 0.076 0.175 -0.702 -0.042 -1.431 -0.042
                curveToRelative(
                    dx1 = 0.076f,
                    dy1 = 0.175f,
                    dx2 = -0.702f,
                    dy2 = -0.042f,
                    dx3 = -1.431f,
                    dy3 = -0.042f,
                )
                // c -1.167 0 -1.042 0.298 -0.167 0.521
                curveToRelative(
                    dx1 = -1.167f,
                    dy1 = 0.0f,
                    dx2 = -1.042f,
                    dy2 = 0.298f,
                    dx3 = -0.167f,
                    dy3 = 0.521f,
                )
                // c 1.875 0.479 1.833 1.219 2.896 1.188
                curveToRelative(
                    dx1 = 1.875f,
                    dy1 = 0.479f,
                    dx2 = 1.833f,
                    dy2 = 1.219f,
                    dx3 = 2.896f,
                    dy3 = 1.188f,
                )
                // c 1.063 -0.033 1.219 -0.897 1.219 -0.897z
                curveToRelative(
                    dx1 = 1.063f,
                    dy1 = -0.033f,
                    dx2 = 1.219f,
                    dy2 = -0.897f,
                    dx3 = 1.219f,
                    dy3 = -0.897f,
                )
                close()
                // M 26.442 11.325
                moveTo(x = 26.442f, y = 11.325f)
                // c -1.65 -0.616 -3.942 -2.241 -6.192 -1.991
                curveToRelative(
                    dx1 = -1.65f,
                    dy1 = -0.616f,
                    dx2 = -3.942f,
                    dy2 = -2.241f,
                    dx3 = -6.192f,
                    dy3 = -1.991f,
                )
                // c -0.751 0.083 -0.462 0.519 0 0.625
                curveToRelative(
                    dx1 = -0.751f,
                    dy1 = 0.083f,
                    dx2 = -0.462f,
                    dy2 = 0.519f,
                    dx3 = 0.0f,
                    dy3 = 0.625f,
                )
                // c 0.609 0.141 1.438 0.704 1.731 0.933
                curveToRelative(
                    dx1 = 0.609f,
                    dy1 = 0.141f,
                    dx2 = 1.438f,
                    dy2 = 0.704f,
                    dx3 = 1.731f,
                    dy3 = 0.933f,
                )
                // c 0.281 0.219 -2.314 -0.558 -4.065 0.109
                curveToRelative(
                    dx1 = 0.281f,
                    dy1 = 0.219f,
                    dx2 = -2.314f,
                    dy2 = -0.558f,
                    dx3 = -4.065f,
                    dy3 = 0.109f,
                )
                // c -0.872 0.332 -0.514 0.562 0.031 0.5
                curveToRelative(
                    dx1 = -0.872f,
                    dy1 = 0.332f,
                    dx2 = -0.514f,
                    dy2 = 0.562f,
                    dx3 = 0.031f,
                    dy3 = 0.5f,
                )
                // c 0.816 -0.094 1.609 0.172 2.641 0.797
                curveToRelative(
                    dx1 = 0.816f,
                    dy1 = -0.094f,
                    dx2 = 1.609f,
                    dy2 = 0.172f,
                    dx3 = 2.641f,
                    dy3 = 0.797f,
                )
                // c 1.031 0.624 6.932 -0.571 5.854 -0.973z
                curveToRelative(
                    dx1 = 1.031f,
                    dy1 = 0.624f,
                    dx2 = 6.932f,
                    dy2 = -0.571f,
                    dx3 = 5.854f,
                    dy3 = -0.973f,
                )
                close()
            }
        }.build().also { _emoji1f400 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f400: ImageVector? = null
