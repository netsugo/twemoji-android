package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1fa72: ImageVector
    get() {
        val current = _emoji1fa72
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1fa72",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 17.96 V10 l-8.296 -2 H8.348 L0.052 10 v7.96 C0.052 21.426 12.376 32 14.835 32 h6.382 C23.4 32 36 21.715 36 17.96z
            path(
                fill = SolidColor(Color(0xFF2976AA)),
            ) {
                // M 36 17.96
                moveTo(x = 36.0f, y = 17.96f)
                // V 10
                verticalLineTo(y = 10.0f)
                // l -8.296 -2
                lineToRelative(dx = -8.296f, dy = -2.0f)
                // H 8.348
                horizontalLineTo(x = 8.348f)
                // L 0.052 10
                lineTo(x = 0.052f, y = 10.0f)
                // v 7.96
                verticalLineToRelative(dy = 7.96f)
                // C 0.052 21.426 12.376 32 14.835 32
                curveTo(
                    x1 = 0.052f,
                    y1 = 21.426f,
                    x2 = 12.376f,
                    y2 = 32.0f,
                    x3 = 14.835f,
                    y3 = 32.0f,
                )
                // h 6.382
                horizontalLineToRelative(dx = 6.382f)
                // C 23.4 32 36 21.715 36 17.96z
                curveTo(
                    x1 = 23.4f,
                    y1 = 32.0f,
                    x2 = 36.0f,
                    y2 = 21.715f,
                    x3 = 36.0f,
                    y3 = 17.96f,
                )
                close()
            }
            // M4.617 18.577 l-1.892 -0.647 C4 14.201 4 10.904 4 9.32 h2 c0 1.692 0 5.213 -1.383 9.257z M31.435 18.729 C30 14.622 30 11.041 30 9.32 h2 c0 1.611 0 4.963 1.323 8.75 l-1.888 0.659z
            path(
                fill = SolidColor(Color(0xFF5DADEC)),
            ) {
                // M 4.617 18.577
                moveTo(x = 4.617f, y = 18.577f)
                // l -1.892 -0.647
                lineToRelative(dx = -1.892f, dy = -0.647f)
                // C 4 14.201 4 10.904 4 9.32
                curveTo(
                    x1 = 4.0f,
                    y1 = 14.201f,
                    x2 = 4.0f,
                    y2 = 10.904f,
                    x3 = 4.0f,
                    y3 = 9.32f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // c 0 1.692 0 5.213 -1.383 9.257z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.692f,
                    dx2 = 0.0f,
                    dy2 = 5.213f,
                    dx3 = -1.383f,
                    dy3 = 9.257f,
                )
                close()
                // M 31.435 18.729
                moveTo(x = 31.435f, y = 18.729f)
                // C 30 14.622 30 11.041 30 9.32
                curveTo(
                    x1 = 30.0f,
                    y1 = 14.622f,
                    x2 = 30.0f,
                    y2 = 11.041f,
                    x3 = 30.0f,
                    y3 = 9.32f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // c 0 1.611 0 4.963 1.323 8.75
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.611f,
                    dx2 = 0.0f,
                    dy2 = 4.963f,
                    dx3 = 1.323f,
                    dy3 = 8.75f,
                )
                // l -1.888 0.659z
                lineToRelative(dx = -1.888f, dy = 0.659f)
                close()
            }
            // M36 10 H0.052 V8.199 c0 -0.735 0.596 -1.331 1.331 -1.331 h33.286 c0.735 0 1.331 0.596 1.331 1.331 V10z
            path(
                fill = SolidColor(Color(0xFF5DADEC)),
            ) {
                // M 36 10
                moveTo(x = 36.0f, y = 10.0f)
                // H 0.052
                horizontalLineTo(x = 0.052f)
                // V 8.199
                verticalLineTo(y = 8.199f)
                // c 0 -0.735 0.596 -1.331 1.331 -1.331
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.735f,
                    dx2 = 0.596f,
                    dy2 = -1.331f,
                    dx3 = 1.331f,
                    dy3 = -1.331f,
                )
                // h 33.286
                horizontalLineToRelative(dx = 33.286f)
                // c 0.735 0 1.331 0.596 1.331 1.331
                curveToRelative(
                    dx1 = 0.735f,
                    dy1 = 0.0f,
                    dx2 = 1.331f,
                    dy2 = 0.596f,
                    dx3 = 1.331f,
                    dy3 = 1.331f,
                )
                // V 10z
                verticalLineTo(y = 10.0f)
                close()
            }
            // M3.702 18.154 l-0.03 0.099 c0.011 -0.033 0.018 -0.065 0.03 -0.099 -1.464 -0.547 -2.75 -0.865 -3.649 -1.019 v0.825 C0.052 21.426 12.409 32 14.854 32 h0.934 c-1.155 -8.143 -7.473 -12.122 -12.086 -13.846z M36 17.96 v-0.747 c-0.897 0.147 -2.196 0.459 -3.677 1.005 0.021 0.061 0.035 0.12 0.057 0.181 -0.021 -0.061 -0.036 -0.12 -0.057 -0.181 -4.6 1.696 -10.905 5.635 -12.059 13.782 h0.934 C23.369 32 36 21.715 36 17.96z
            path(
                fill = SolidColor(Color(0xFF1D567C)),
            ) {
                // M 3.702 18.154
                moveTo(x = 3.702f, y = 18.154f)
                // l -0.03 0.099
                lineToRelative(dx = -0.03f, dy = 0.099f)
                // c 0.011 -0.033 0.018 -0.065 0.03 -0.099
                curveToRelative(
                    dx1 = 0.011f,
                    dy1 = -0.033f,
                    dx2 = 0.018f,
                    dy2 = -0.065f,
                    dx3 = 0.03f,
                    dy3 = -0.099f,
                )
                // c -1.464 -0.547 -2.75 -0.865 -3.649 -1.019
                curveToRelative(
                    dx1 = -1.464f,
                    dy1 = -0.547f,
                    dx2 = -2.75f,
                    dy2 = -0.865f,
                    dx3 = -3.649f,
                    dy3 = -1.019f,
                )
                // v 0.825
                verticalLineToRelative(dy = 0.825f)
                // C 0.052 21.426 12.409 32 14.854 32
                curveTo(
                    x1 = 0.052f,
                    y1 = 21.426f,
                    x2 = 12.409f,
                    y2 = 32.0f,
                    x3 = 14.854f,
                    y3 = 32.0f,
                )
                // h 0.934
                horizontalLineToRelative(dx = 0.934f)
                // c -1.155 -8.143 -7.473 -12.122 -12.086 -13.846z
                curveToRelative(
                    dx1 = -1.155f,
                    dy1 = -8.143f,
                    dx2 = -7.473f,
                    dy2 = -12.122f,
                    dx3 = -12.086f,
                    dy3 = -13.846f,
                )
                close()
                // M 36 17.96
                moveTo(x = 36.0f, y = 17.96f)
                // v -0.747
                verticalLineToRelative(dy = -0.747f)
                // c -0.897 0.147 -2.196 0.459 -3.677 1.005
                curveToRelative(
                    dx1 = -0.897f,
                    dy1 = 0.147f,
                    dx2 = -2.196f,
                    dy2 = 0.459f,
                    dx3 = -3.677f,
                    dy3 = 1.005f,
                )
                // c 0.021 0.061 0.035 0.12 0.057 0.181
                curveToRelative(
                    dx1 = 0.021f,
                    dy1 = 0.061f,
                    dx2 = 0.035f,
                    dy2 = 0.12f,
                    dx3 = 0.057f,
                    dy3 = 0.181f,
                )
                // c -0.021 -0.061 -0.036 -0.12 -0.057 -0.181
                curveToRelative(
                    dx1 = -0.021f,
                    dy1 = -0.061f,
                    dx2 = -0.036f,
                    dy2 = -0.12f,
                    dx3 = -0.057f,
                    dy3 = -0.181f,
                )
                // c -4.6 1.696 -10.905 5.635 -12.059 13.782
                curveToRelative(
                    dx1 = -4.6f,
                    dy1 = 1.696f,
                    dx2 = -10.905f,
                    dy2 = 5.635f,
                    dx3 = -12.059f,
                    dy3 = 13.782f,
                )
                // h 0.934
                horizontalLineToRelative(dx = 0.934f)
                // C 23.369 32 36 21.715 36 17.96z
                curveTo(
                    x1 = 23.369f,
                    y1 = 32.0f,
                    x2 = 36.0f,
                    y2 = 21.715f,
                    x3 = 36.0f,
                    y3 = 17.96f,
                )
                close()
            }
        }.build().also { _emoji1fa72 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1fa72: ImageVector? = null
