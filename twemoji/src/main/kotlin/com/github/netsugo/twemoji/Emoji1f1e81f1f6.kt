package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1e81f1f6: ImageVector
    get() {
        val current = _emoji1f1e81f1f6
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1e81f1f6",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            emoji1f1e81f1f6Chunk1()
            emoji1f1e81f1f6Chunk2()
            emoji1f1e81f1f6Chunk3()
        }.build().also { _emoji1f1e81f1f6 = it }
    }

private fun ImageVector.Builder.emoji1f1e81f1f6Chunk1() {
    // M31.992 5.008 H4.008 a4 4 0 0 0 -4 4 V27 a4 4 0 0 0 4 4 h27.984 a4 4 0 0 0 4 -4 V9.005 a4 4 0 0 0 -4 -3.997z
    path(
        fill = SolidColor(Color(0xFFEEEEEE)),
    ) {
        // M 31.992 5.008
        moveTo(x = 31.992f, y = 5.008f)
        // H 4.008
        horizontalLineTo(x = 4.008f)
        // a 4 4 0 0 0 -4 4
        arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.0f,
            dy1 = 4.0f,
        )
        // V 27
        verticalLineTo(y = 27.0f)
        // a 4 4 0 0 0 4 4
        arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.0f,
            dy1 = 4.0f,
        )
        // h 27.984
        horizontalLineToRelative(dx = 27.984f)
        // a 4 4 0 0 0 4 -4
        arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.0f,
            dy1 = -4.0f,
        )
        // V 9.005
        verticalLineTo(y = 9.005f)
        // a 4 4 0 0 0 -4 -3.997z
        arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.0f,
            dy1 = -3.997f,
        )
        close()
    }
    // M21 15 V5.008 H4.008 a4 4 0 0 0 -4 4 V21 H15 v9.994 h6 V21 h14.989 v-6z
    path(
        fill = SolidColor(Color(0xFFCE1124)),
    ) {
        // M 21 15
        moveTo(x = 21.0f, y = 15.0f)
        // V 5.008
        verticalLineTo(y = 5.008f)
        // H 4.008
        horizontalLineTo(x = 4.008f)
        // a 4 4 0 0 0 -4 4
        arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.0f,
            dy1 = 4.0f,
        )
        // V 21
        verticalLineTo(y = 21.0f)
        // H 15
        horizontalLineTo(x = 15.0f)
        // v 9.994
        verticalLineToRelative(dy = 9.994f)
        // h 6
        horizontalLineToRelative(dx = 6.0f)
        // V 21
        verticalLineTo(y = 21.0f)
        // h 14.989
        horizontalLineToRelative(dx = 14.989f)
        // v -6z
        verticalLineToRelative(dy = -6.0f)
        close()
    }
    // m13.443 9.636  l-0.038 -0.266 a0.335 0.335 0 0 1 0.1 0.008 0.918 0.918 0 0 1 0.129 0.069 0.446 0.446 0 0 0 -0.063 -0.186 0.66 0.66 0 0 0 -0.2 -0.131 0.485 0.485 0 0 1 0.088 -0.044 0.835 0.835 0 0 1 0.155 -0.015 1.074 1.074 0 0 0 -0.13 -0.125 0.537 0.537 0 0 0 -0.261 -0.031 0.724 0.724 0 0 1 0.094 -0.08 0.349 0.349 0 0 1 0.147 -0.024 0.446 0.446 0 0 0 -0.146 -0.11 0.95 0.95 0 0 0 -0.236 -0.024 0.36 0.36 0 0 1 0.079 -0.083 1.13 1.13 0 0 1 0.17 -0.066 1.26 1.26 0 0 0 -0.187 -0.079 c-0.043 -0.011 -0.131 0 -0.207 -0.009 a0.217 0.217 0 0 1 -0.119 -0.068 c0.025 -0.133 -0.022 -0.2 -0.09 -0.224 a0.313 0.313 0 0 0 -0.142 0 0.362 0.362 0 0 0 -0.15 0.107 s-0.371 -0.015 -0.589 0 c-0.156 0.011 -0.379 0.108 -0.528 0.065 -0.109 -0.031 -0.155 -0.167 -0.244 -0.231 l-0.242 -0.173 a6.477 6.477 0 0 0 1.83 -0.1 c0.32 -0.1 0.692 -0.26 0.7 -0.593 s-0.2 -0.616 -0.826 -0.61 a4.133 4.133 0 0 0 -1.044 0.129 c-0.268 0.06 -1.082 0.309 -1.436 0.377 s-0.773 0.177 -1.131 0.235 a2.68 2.68 0 0 1 -0.99 0 0.486 0.486 0 0 1 -0.317 -0.163 0.133 0.133 0 0 1 0 -0.146 c0.084 -0.118 0.278 -0.137 0.431 -0.168 0.07 -0.014 0.241 0.107 0.339 0.138 a1.186 1.186 0 0 0 0.429 0.048 0.847 0.847 0 0 0 0.355 -0.087 0.52 0.52 0 0 1 0.408 -0.1 c0.061 0.021 0.035 0.18 0.035 0.18 0.2 -0.083 0.274 -0.2 0.112 -0.364 a3.425 3.425 0 0 0 0.446 0.08 1.671 1.671 0 0 0 0.734 -0.108 0.6 0.6 0 0 0 0.431 -0.543 l-0.158 0.157 a1.115 1.115 0 0 1 -0.49 0.166 s0.039 -0.13 0 -0.186 a0.27 0.27 0 0 0 -0.211 -0.134 c0.1 0.112 0.029 0.164 -0.014 0.212 a0.576 0.576 0 0 1 -0.4 0.078 4.058 4.058 0 0 0 -1.12 -0.028 9.281 9.281 0 0 0 -1.023 0.214 1.176 1.176 0 0 0 -0.59 0.312 0.359 0.359 0 0 0 -0.1 0.321 c0.051 0.158 0.136 0.223 0.323 0.289 a2.855 2.855 0 0 0 1.355 0.072 c0.335 -0.046 0.808 -0.149 1.118 -0.217 0.44 -0.095 1.2 -0.3 1.413 -0.35 a0.734 0.734 0 0 0 0.094 0.251 0.6 0.6 0 0 0 0.261 0.132 c-0.022 -0.085 -0.062 -0.119 -0.061 -0.2 a0.28 0.28 0 0 1 0.084 -0.182 0.785 0.785 0 0 0 0.116 0.246 0.5 0.5 0 0 0 0.28 0.1 0.266 0.266 0 0 1 -0.081 -0.188 0.233 0.233 0 0 1 0.059 -0.175 0.741 0.741 0 0 0 0.167 0.25 0.465 0.465 0 0 0 0.259 0.029 0.316 0.316 0 0 1 -0.133 -0.1 0.164 0.164 0 0 1 -0.04 -0.129 c0.008 -0.071 0.113 -0.13 0.2 -0.149 A0.372 0.372 0 0 1 13.01 7 a0.225 0.225 0 0 1 0.068 0.291 c-0.223 0.365 -0.954 0.356 -1.362 0.388 a6.352 6.352 0 0 1 -0.768 -0.009 c-0.341 -0.01 -0.654 -0.09 -1.017 -0.1 a4.969 4.969 0 0 0 -0.721 0.045 c-0.474 0.057 -2.674 0.256 -2.674 0.256 l-0.6 0.054 a10.494 10.494 0 0 0 -1.165 -0.09 2.13 2.13 0 0 1 -0.373 0 v0.352 l-0.009 0.009 s-0.265 -0.162 -0.406 -0.232 c-0.264 -0.132 -0.817 -0.351 -0.817 -0.351 s-0.148 -0.149 -0.153 -0.257 0.054 -0.157 0.067 -0.227 a0.2 0.2 0 0 0 -0.037 -0.135 0.18 0.18 0 0 0 -0.227 -0.025 0.643 0.643 0 0 0 -0.138 0.146 c-0.137 -0.166 -0.246 -0.149 -0.35 -0.067 a0.229 0.229 0 0 0 -0.024 0.385 c-0.243 0.034 -0.249 0.2 -0.21 0.3 a0.283 0.283 0 0 0 0.214 0.154 c0.109 0.01 0.24 -0.081 0.352 0.038 l0.092 0.1 a0.542 0.542 0 0 1 -0.26 0.155 1.425 1.425 0 0 0 0.324 0.1 1.019 1.019 0 0 0 0.267 -0.051 0.351 0.351 0 0 1 -0.226 0.179 1.034 1.034 0 0 0 0.254 0.081 1.148 1.148 0 0 0 0.271 -0.048 c-0.043 0.1 -0.136 0.125 -0.215 0.17 a1.466 1.466 0 0 0 0.286 0.08 1.312 1.312 0 0 0 0.3 -0.034 0.488 0.488 0 0 1 -0.229 0.176 0.845 0.845 0 0 0 0.283 0.063 1.235 1.235 0 0 0 0.3 -0.1 1.52 1.52 0 0 0 0.151 0.115 c-0.142 0.03 -0.345 0.075 -0.442 0.108 a6.056 6.056 0 0 0 -0.722 0.343 0.747 0.747 0 0 1 -0.324 -0.052 c-0.085 -0.056 -0.1 -0.133 -0.153 -0.185 a0.265 0.265 0 0 0 -0.141 -0.057 0.166 0.166 0 0 0 -0.172 0.141 0.448 0.448 0 0 0 0.022 0.16 c-0.235 -0.008 -0.278 0.1 -0.275 0.222 s0.127 0.265 0.359 0.235 c-0.13 0.188 -0.028 0.311 0.084 0.344 a0.331 0.331 0 0 0 0.274 -0.053 c0.08 -0.067 0.088 -0.213 0.265 -0.217 h0.146 a0.419 0.419 0 0 1 -0.038 0.273 1.409 1.409 0 0 0 0.3 -0.161 0.767 0.767 0 0 0 0.14 -0.212 0.278 0.278 0 0 1 0.007 0.264 1.042 1.042 0 0 0 0.237 -0.124 0.884 0.884 0 0 0 0.137 -0.215 c0.06 0.091 0.019 0.169 0.006 0.251 a1.431 1.431 0 0 0 0.258 -0.147 A1.034 1.034 0 0 0 4.4 9.6 a0.364 0.364 0 0 1 0 0.264 0.835 0.835 0 0 0 0.24 -0.164 0.945 0.945 0 0 0 0.111 -0.266 0.848 0.848 0 0 0 0.3 -0.06 0.635 0.635 0 0 0 0.157 -0.209 5.532 5.532 0 0 0 0.746 -0.1 c0.48 -0.125 1.782 -0.625 2.565 -0.876 0.113 0.081 0.2 0.167 0.191 0.215 s-0.085 0.069 -0.12 0.116 0 0.088 0.023 0.122 0.125 0.057 0.154 0.1 0.039 0.078 0.01 0.117 c-0.058 0.079 -0.256 0.116 -0.352 0.16 -0.175 0.079 -0.469 0.251 -0.469 0.251 a0.661 0.661 0 0 1 -0.269 -0.038 c-0.083 -0.021 -0.186 -0.124 -0.273 -0.122 a0.244 0.244 0 0 0 -0.2 0.123 0.2 0.2 0 0 0 0.051 0.173 l0.16 0.1 a0.491 0.491 0 0 0 -0.1 0.176 0.175 0.175 0 0 0 0.064 0.139 0.2 0.2 0 0 0 0.15 0.085 A0.778 0.778 0 0 0 7.7 9.9 a0.244 0.244 0 0 0 0.275 0.253 0.161 0.161 0 0 0 0.145 -0.081 c0.032 -0.046 0.022 -0.163 0.075 -0.212 l0.214 -0.2 c0.1 0.053 0.1 0.137 0.086 0.223 a0.828 0.828 0 0 0 0.179 -0.153 0.653 0.653 0 0 0 0.055 -0.219 0.236 0.236 0 0 1 0.106 0.24 0.934 0.934 0 0 0 0.187 -0.151 0.909 0.909 0 0 0 0.091 -0.221 0.253 0.253 0 0 1 0.061 0.256 0.737 0.737 0 0 0 0.2 -0.193 0.8 0.8 0 0 0 0.05 -0.185 c0.2 0.009 0.318 -0.076 0.325 -0.162 0 -0.066 -0.075 -0.155 -0.232 -0.177 a0.787 0.787 0 0 1 -0.083 -0.145 0.2 0.2 0 0 1 0 -0.134 0.555 0.555 0 0 1 0.179 -0.222 c0.016 -0.013 0.041 -0.027 0.062 -0.041 l0.009 0.029 a0.217 0.217 0 0 0 0.112 0.127 0.2 0.2 0 0 0 0.166 -0.025 1.36 1.36 0 0 0 0.863 0.488 3.167 3.167 0 0 0 0.762 -0.018 7.46 7.46 0 0 0 0.543 -0.142 3.076 3.076 0 0 0 0.208 0.24 4.519 4.519 0 0 0 0.454 0.337 0.589 0.589 0 0 1 -0.183 0.158 c-0.074 0.033 -0.22 0.04 -0.271 0.1 a0.183 0.183 0 0 0 -0.019 0.206 0.263 0.263 0 0 0 0.178 0.079 l0.186 -0.037 a0.5 0.5 0 0 0 0.086 0.178 0.231 0.231 0 0 0 0.158 0.048 c0.079 0 0.105 0.006 0.164 -0.041 a0.553 0.553 0 0 0 0.087 -0.118 0.368 0.368 0 0 0 0.128 0.064 0.271 0.271 0 0 0 0.256 -0.078 0.122 0.122 0 0 0 0.021 -0.145 c-0.026 -0.055 -0.13 -0.126 -0.14 -0.19z
    path(
        fill = SolidColor(Color(0xFFFCD41C)),
        pathFillType = PathFillType.EvenOdd,
    ) {
        // M 13.443 9.636
        moveTo(x = 13.443f, y = 9.636f)
        // l -0.038 -0.266
        lineToRelative(dx = -0.038f, dy = -0.266f)
        // a 0.335 0.335 0 0 1 0.1 0.008
        arcToRelative(
            a = 0.335f,
            b = 0.335f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.1f,
            dy1 = 0.008f,
        )
        // a 0.918 0.918 0 0 1 0.129 0.069
        arcToRelative(
            a = 0.918f,
            b = 0.918f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.129f,
            dy1 = 0.069f,
        )
        // a 0.446 0.446 0 0 0 -0.063 -0.186
        arcToRelative(
            a = 0.446f,
            b = 0.446f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.063f,
            dy1 = -0.186f,
        )
        // a 0.66 0.66 0 0 0 -0.2 -0.131
        arcToRelative(
            a = 0.66f,
            b = 0.66f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.2f,
            dy1 = -0.131f,
        )
        // a 0.485 0.485 0 0 1 0.088 -0.044
        arcToRelative(
            a = 0.485f,
            b = 0.485f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.088f,
            dy1 = -0.044f,
        )
        // a 0.835 0.835 0 0 1 0.155 -0.015
        arcToRelative(
            a = 0.835f,
            b = 0.835f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.155f,
            dy1 = -0.015f,
        )
        // a 1.074 1.074 0 0 0 -0.13 -0.125
        arcToRelative(
            a = 1.074f,
            b = 1.074f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.13f,
            dy1 = -0.125f,
        )
        // a 0.537 0.537 0 0 0 -0.261 -0.031
        arcToRelative(
            a = 0.537f,
            b = 0.537f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.261f,
            dy1 = -0.031f,
        )
        // a 0.724 0.724 0 0 1 0.094 -0.08
        arcToRelative(
            a = 0.724f,
            b = 0.724f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.094f,
            dy1 = -0.08f,
        )
        // a 0.349 0.349 0 0 1 0.147 -0.024
        arcToRelative(
            a = 0.349f,
            b = 0.349f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.147f,
            dy1 = -0.024f,
        )
        // a 0.446 0.446 0 0 0 -0.146 -0.11
        arcToRelative(
            a = 0.446f,
            b = 0.446f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.146f,
            dy1 = -0.11f,
        )
        // a 0.95 0.95 0 0 0 -0.236 -0.024
        arcToRelative(
            a = 0.95f,
            b = 0.95f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.236f,
            dy1 = -0.024f,
        )
        // a 0.36 0.36 0 0 1 0.079 -0.083
        arcToRelative(
            a = 0.36f,
            b = 0.36f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.079f,
            dy1 = -0.083f,
        )
        // a 1.13 1.13 0 0 1 0.17 -0.066
        arcToRelative(
            a = 1.13f,
            b = 1.13f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.17f,
            dy1 = -0.066f,
        )
        // a 1.26 1.26 0 0 0 -0.187 -0.079
        arcToRelative(
            a = 1.26f,
            b = 1.26f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.187f,
            dy1 = -0.079f,
        )
        // c -0.043 -0.011 -0.131 0 -0.207 -0.009
        curveToRelative(
            dx1 = -0.043f,
            dy1 = -0.011f,
            dx2 = -0.131f,
            dy2 = 0.0f,
            dx3 = -0.207f,
            dy3 = -0.009f,
        )
        // a 0.217 0.217 0 0 1 -0.119 -0.068
        arcToRelative(
            a = 0.217f,
            b = 0.217f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.119f,
            dy1 = -0.068f,
        )
        // c 0.025 -0.133 -0.022 -0.2 -0.09 -0.224
        curveToRelative(
            dx1 = 0.025f,
            dy1 = -0.133f,
            dx2 = -0.022f,
            dy2 = -0.2f,
            dx3 = -0.09f,
            dy3 = -0.224f,
        )
        // a 0.313 0.313 0 0 0 -0.142 0
        arcToRelative(
            a = 0.313f,
            b = 0.313f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.142f,
            dy1 = 0.0f,
        )
        // a 0.362 0.362 0 0 0 -0.15 0.107
        arcToRelative(
            a = 0.362f,
            b = 0.362f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.15f,
            dy1 = 0.107f,
        )
        // s -0.371 -0.015 -0.589 0
        reflectiveCurveToRelative(
            dx1 = -0.371f,
            dy1 = -0.015f,
            dx2 = -0.589f,
            dy2 = 0.0f,
        )
        // c -0.156 0.011 -0.379 0.108 -0.528 0.065
        curveToRelative(
            dx1 = -0.156f,
            dy1 = 0.011f,
            dx2 = -0.379f,
            dy2 = 0.108f,
            dx3 = -0.528f,
            dy3 = 0.065f,
        )
        // c -0.109 -0.031 -0.155 -0.167 -0.244 -0.231
        curveToRelative(
            dx1 = -0.109f,
            dy1 = -0.031f,
            dx2 = -0.155f,
            dy2 = -0.167f,
            dx3 = -0.244f,
            dy3 = -0.231f,
        )
        // l -0.242 -0.173
        lineToRelative(dx = -0.242f, dy = -0.173f)
        // a 6.477 6.477 0 0 0 1.83 -0.1
        arcToRelative(
            a = 6.477f,
            b = 6.477f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.83f,
            dy1 = -0.1f,
        )
        // c 0.32 -0.1 0.692 -0.26 0.7 -0.593
        curveToRelative(
            dx1 = 0.32f,
            dy1 = -0.1f,
            dx2 = 0.692f,
            dy2 = -0.26f,
            dx3 = 0.7f,
            dy3 = -0.593f,
        )
        // s -0.2 -0.616 -0.826 -0.61
        reflectiveCurveToRelative(
            dx1 = -0.2f,
            dy1 = -0.616f,
            dx2 = -0.826f,
            dy2 = -0.61f,
        )
        // a 4.133 4.133 0 0 0 -1.044 0.129
        arcToRelative(
            a = 4.133f,
            b = 4.133f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.044f,
            dy1 = 0.129f,
        )
        // c -0.268 0.06 -1.082 0.309 -1.436 0.377
        curveToRelative(
            dx1 = -0.268f,
            dy1 = 0.06f,
            dx2 = -1.082f,
            dy2 = 0.309f,
            dx3 = -1.436f,
            dy3 = 0.377f,
        )
        // s -0.773 0.177 -1.131 0.235
        reflectiveCurveToRelative(
            dx1 = -0.773f,
            dy1 = 0.177f,
            dx2 = -1.131f,
            dy2 = 0.235f,
        )
        // a 2.68 2.68 0 0 1 -0.99 0
        arcToRelative(
            a = 2.68f,
            b = 2.68f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.99f,
            dy1 = 0.0f,
        )
        // a 0.486 0.486 0 0 1 -0.317 -0.163
        arcToRelative(
            a = 0.486f,
            b = 0.486f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.317f,
            dy1 = -0.163f,
        )
        // a 0.133 0.133 0 0 1 0 -0.146
        arcToRelative(
            a = 0.133f,
            b = 0.133f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -0.146f,
        )
        // c 0.084 -0.118 0.278 -0.137 0.431 -0.168
        curveToRelative(
            dx1 = 0.084f,
            dy1 = -0.118f,
            dx2 = 0.278f,
            dy2 = -0.137f,
            dx3 = 0.431f,
            dy3 = -0.168f,
        )
        // c 0.07 -0.014 0.241 0.107 0.339 0.138
        curveToRelative(
            dx1 = 0.07f,
            dy1 = -0.014f,
            dx2 = 0.241f,
            dy2 = 0.107f,
            dx3 = 0.339f,
            dy3 = 0.138f,
        )
        // a 1.186 1.186 0 0 0 0.429 0.048
        arcToRelative(
            a = 1.186f,
            b = 1.186f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.429f,
            dy1 = 0.048f,
        )
        // a 0.847 0.847 0 0 0 0.355 -0.087
        arcToRelative(
            a = 0.847f,
            b = 0.847f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.355f,
            dy1 = -0.087f,
        )
        // a 0.52 0.52 0 0 1 0.408 -0.1
        arcToRelative(
            a = 0.52f,
            b = 0.52f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.408f,
            dy1 = -0.1f,
        )
        // c 0.061 0.021 0.035 0.18 0.035 0.18
        curveToRelative(
            dx1 = 0.061f,
            dy1 = 0.021f,
            dx2 = 0.035f,
            dy2 = 0.18f,
            dx3 = 0.035f,
            dy3 = 0.18f,
        )
        // c 0.2 -0.083 0.274 -0.2 0.112 -0.364
        curveToRelative(
            dx1 = 0.2f,
            dy1 = -0.083f,
            dx2 = 0.274f,
            dy2 = -0.2f,
            dx3 = 0.112f,
            dy3 = -0.364f,
        )
        // a 3.425 3.425 0 0 0 0.446 0.08
        arcToRelative(
            a = 3.425f,
            b = 3.425f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.446f,
            dy1 = 0.08f,
        )
        // a 1.671 1.671 0 0 0 0.734 -0.108
        arcToRelative(
            a = 1.671f,
            b = 1.671f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.734f,
            dy1 = -0.108f,
        )
        // a 0.6 0.6 0 0 0 0.431 -0.543
        arcToRelative(
            a = 0.6f,
            b = 0.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.431f,
            dy1 = -0.543f,
        )
        // l -0.158 0.157
        lineToRelative(dx = -0.158f, dy = 0.157f)
        // a 1.115 1.115 0 0 1 -0.49 0.166
        arcToRelative(
            a = 1.115f,
            b = 1.115f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.49f,
            dy1 = 0.166f,
        )
        // s 0.039 -0.13 0 -0.186
        reflectiveCurveToRelative(
            dx1 = 0.039f,
            dy1 = -0.13f,
            dx2 = 0.0f,
            dy2 = -0.186f,
        )
        // a 0.27 0.27 0 0 0 -0.211 -0.134
        arcToRelative(
            a = 0.27f,
            b = 0.27f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.211f,
            dy1 = -0.134f,
        )
        // c 0.1 0.112 0.029 0.164 -0.014 0.212
        curveToRelative(
            dx1 = 0.1f,
            dy1 = 0.112f,
            dx2 = 0.029f,
            dy2 = 0.164f,
            dx3 = -0.014f,
            dy3 = 0.212f,
        )
        // a 0.576 0.576 0 0 1 -0.4 0.078
        arcToRelative(
            a = 0.576f,
            b = 0.576f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.4f,
            dy1 = 0.078f,
        )
        // a 4.058 4.058 0 0 0 -1.12 -0.028
        arcToRelative(
            a = 4.058f,
            b = 4.058f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.12f,
            dy1 = -0.028f,
        )
        // a 9.281 9.281 0 0 0 -1.023 0.214
        arcToRelative(
            a = 9.281f,
            b = 9.281f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.023f,
            dy1 = 0.214f,
        )
        // a 1.176 1.176 0 0 0 -0.59 0.312
        arcToRelative(
            a = 1.176f,
            b = 1.176f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.59f,
            dy1 = 0.312f,
        )
        // a 0.359 0.359 0 0 0 -0.1 0.321
        arcToRelative(
            a = 0.359f,
            b = 0.359f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.1f,
            dy1 = 0.321f,
        )
        // c 0.051 0.158 0.136 0.223 0.323 0.289
        curveToRelative(
            dx1 = 0.051f,
            dy1 = 0.158f,
            dx2 = 0.136f,
            dy2 = 0.223f,
            dx3 = 0.323f,
            dy3 = 0.289f,
        )
        // a 2.855 2.855 0 0 0 1.355 0.072
        arcToRelative(
            a = 2.855f,
            b = 2.855f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.355f,
            dy1 = 0.072f,
        )
        // c 0.335 -0.046 0.808 -0.149 1.118 -0.217
        curveToRelative(
            dx1 = 0.335f,
            dy1 = -0.046f,
            dx2 = 0.808f,
            dy2 = -0.149f,
            dx3 = 1.118f,
            dy3 = -0.217f,
        )
        // c 0.44 -0.095 1.2 -0.3 1.413 -0.35
        curveToRelative(
            dx1 = 0.44f,
            dy1 = -0.095f,
            dx2 = 1.2f,
            dy2 = -0.3f,
            dx3 = 1.413f,
            dy3 = -0.35f,
        )
        // a 0.734 0.734 0 0 0 0.094 0.251
        arcToRelative(
            a = 0.734f,
            b = 0.734f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.094f,
            dy1 = 0.251f,
        )
        // a 0.6 0.6 0 0 0 0.261 0.132
        arcToRelative(
            a = 0.6f,
            b = 0.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.261f,
            dy1 = 0.132f,
        )
        // c -0.022 -0.085 -0.062 -0.119 -0.061 -0.2
        curveToRelative(
            dx1 = -0.022f,
            dy1 = -0.085f,
            dx2 = -0.062f,
            dy2 = -0.119f,
            dx3 = -0.061f,
            dy3 = -0.2f,
        )
        // a 0.28 0.28 0 0 1 0.084 -0.182
        arcToRelative(
            a = 0.28f,
            b = 0.28f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.084f,
            dy1 = -0.182f,
        )
        // a 0.785 0.785 0 0 0 0.116 0.246
        arcToRelative(
            a = 0.785f,
            b = 0.785f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.116f,
            dy1 = 0.246f,
        )
        // a 0.5 0.5 0 0 0 0.28 0.1
        arcToRelative(
            a = 0.5f,
            b = 0.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.28f,
            dy1 = 0.1f,
        )
        // a 0.266 0.266 0 0 1 -0.081 -0.188
        arcToRelative(
            a = 0.266f,
            b = 0.266f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.081f,
            dy1 = -0.188f,
        )
        // a 0.233 0.233 0 0 1 0.059 -0.175
        arcToRelative(
            a = 0.233f,
            b = 0.233f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.059f,
            dy1 = -0.175f,
        )
        // a 0.741 0.741 0 0 0 0.167 0.25
        arcToRelative(
            a = 0.741f,
            b = 0.741f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.167f,
            dy1 = 0.25f,
        )
        // a 0.465 0.465 0 0 0 0.259 0.029
        arcToRelative(
            a = 0.465f,
            b = 0.465f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.259f,
            dy1 = 0.029f,
        )
        // a 0.316 0.316 0 0 1 -0.133 -0.1
        arcToRelative(
            a = 0.316f,
            b = 0.316f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.133f,
            dy1 = -0.1f,
        )
        // a 0.164 0.164 0 0 1 -0.04 -0.129
        arcToRelative(
            a = 0.164f,
            b = 0.164f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.04f,
            dy1 = -0.129f,
        )
        // c 0.008 -0.071 0.113 -0.13 0.2 -0.149
        curveToRelative(
            dx1 = 0.008f,
            dy1 = -0.071f,
            dx2 = 0.113f,
            dy2 = -0.13f,
            dx3 = 0.2f,
            dy3 = -0.149f,
        )
        // A 0.372 0.372 0 0 1 13.01 7
        arcTo(
            horizontalEllipseRadius = 0.372f,
            verticalEllipseRadius = 0.372f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 13.01f,
            y1 = 7.0f,
        )
        // a 0.225 0.225 0 0 1 0.068 0.291
        arcToRelative(
            a = 0.225f,
            b = 0.225f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.068f,
            dy1 = 0.291f,
        )
        // c -0.223 0.365 -0.954 0.356 -1.362 0.388
        curveToRelative(
            dx1 = -0.223f,
            dy1 = 0.365f,
            dx2 = -0.954f,
            dy2 = 0.356f,
            dx3 = -1.362f,
            dy3 = 0.388f,
        )
        // a 6.352 6.352 0 0 1 -0.768 -0.009
        arcToRelative(
            a = 6.352f,
            b = 6.352f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.768f,
            dy1 = -0.009f,
        )
        // c -0.341 -0.01 -0.654 -0.09 -1.017 -0.1
        curveToRelative(
            dx1 = -0.341f,
            dy1 = -0.01f,
            dx2 = -0.654f,
            dy2 = -0.09f,
            dx3 = -1.017f,
            dy3 = -0.1f,
        )
        // a 4.969 4.969 0 0 0 -0.721 0.045
        arcToRelative(
            a = 4.969f,
            b = 4.969f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.721f,
            dy1 = 0.045f,
        )
        // c -0.474 0.057 -2.674 0.256 -2.674 0.256
        curveToRelative(
            dx1 = -0.474f,
            dy1 = 0.057f,
            dx2 = -2.674f,
            dy2 = 0.256f,
            dx3 = -2.674f,
            dy3 = 0.256f,
        )
        // l -0.6 0.054
        lineToRelative(dx = -0.6f, dy = 0.054f)
        // a 10.494 10.494 0 0 0 -1.165 -0.09
        arcToRelative(
            a = 10.494f,
            b = 10.494f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.165f,
            dy1 = -0.09f,
        )
        // a 2.13 2.13 0 0 1 -0.373 0
        arcToRelative(
            a = 2.13f,
            b = 2.13f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.373f,
            dy1 = 0.0f,
        )
        // v 0.352
        verticalLineToRelative(dy = 0.352f)
        // l -0.009 0.009
        lineToRelative(dx = -0.009f, dy = 0.009f)
        // s -0.265 -0.162 -0.406 -0.232
        reflectiveCurveToRelative(
            dx1 = -0.265f,
            dy1 = -0.162f,
            dx2 = -0.406f,
            dy2 = -0.232f,
        )
        // c -0.264 -0.132 -0.817 -0.351 -0.817 -0.351
        curveToRelative(
            dx1 = -0.264f,
            dy1 = -0.132f,
            dx2 = -0.817f,
            dy2 = -0.351f,
            dx3 = -0.817f,
            dy3 = -0.351f,
        )
        // s -0.148 -0.149 -0.153 -0.257
        reflectiveCurveToRelative(
            dx1 = -0.148f,
            dy1 = -0.149f,
            dx2 = -0.153f,
            dy2 = -0.257f,
        )
        // s 0.054 -0.157 0.067 -0.227
        reflectiveCurveToRelative(
            dx1 = 0.054f,
            dy1 = -0.157f,
            dx2 = 0.067f,
            dy2 = -0.227f,
        )
        // a 0.2 0.2 0 0 0 -0.037 -0.135
        arcToRelative(
            a = 0.2f,
            b = 0.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.037f,
            dy1 = -0.135f,
        )
        // a 0.18 0.18 0 0 0 -0.227 -0.025
        arcToRelative(
            a = 0.18f,
            b = 0.18f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.227f,
            dy1 = -0.025f,
        )
        // a 0.643 0.643 0 0 0 -0.138 0.146
        arcToRelative(
            a = 0.643f,
            b = 0.643f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.138f,
            dy1 = 0.146f,
        )
        // c -0.137 -0.166 -0.246 -0.149 -0.35 -0.067
        curveToRelative(
            dx1 = -0.137f,
            dy1 = -0.166f,
            dx2 = -0.246f,
            dy2 = -0.149f,
            dx3 = -0.35f,
            dy3 = -0.067f,
        )
        // a 0.229 0.229 0 0 0 -0.024 0.385
        arcToRelative(
            a = 0.229f,
            b = 0.229f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.024f,
            dy1 = 0.385f,
        )
        // c -0.243 0.034 -0.249 0.2 -0.21 0.3
        curveToRelative(
            dx1 = -0.243f,
            dy1 = 0.034f,
            dx2 = -0.249f,
            dy2 = 0.2f,
            dx3 = -0.21f,
            dy3 = 0.3f,
        )
        // a 0.283 0.283 0 0 0 0.214 0.154
        arcToRelative(
            a = 0.283f,
            b = 0.283f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.214f,
            dy1 = 0.154f,
        )
        // c 0.109 0.01 0.24 -0.081 0.352 0.038
        curveToRelative(
            dx1 = 0.109f,
            dy1 = 0.01f,
            dx2 = 0.24f,
            dy2 = -0.081f,
            dx3 = 0.352f,
            dy3 = 0.038f,
        )
        // l 0.092 0.1
        lineToRelative(dx = 0.092f, dy = 0.1f)
        // a 0.542 0.542 0 0 1 -0.26 0.155
        arcToRelative(
            a = 0.542f,
            b = 0.542f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.26f,
            dy1 = 0.155f,
        )
        // a 1.425 1.425 0 0 0 0.324 0.1
        arcToRelative(
            a = 1.425f,
            b = 1.425f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.324f,
            dy1 = 0.1f,
        )
        // a 1.019 1.019 0 0 0 0.267 -0.051
        arcToRelative(
            a = 1.019f,
            b = 1.019f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.267f,
            dy1 = -0.051f,
        )
        // a 0.351 0.351 0 0 1 -0.226 0.179
        arcToRelative(
            a = 0.351f,
            b = 0.351f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.226f,
            dy1 = 0.179f,
        )
        // a 1.034 1.034 0 0 0 0.254 0.081
        arcToRelative(
            a = 1.034f,
            b = 1.034f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.254f,
            dy1 = 0.081f,
        )
        // a 1.148 1.148 0 0 0 0.271 -0.048
        arcToRelative(
            a = 1.148f,
            b = 1.148f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.271f,
            dy1 = -0.048f,
        )
        // c -0.043 0.1 -0.136 0.125 -0.215 0.17
        curveToRelative(
            dx1 = -0.043f,
            dy1 = 0.1f,
            dx2 = -0.136f,
            dy2 = 0.125f,
            dx3 = -0.215f,
            dy3 = 0.17f,
        )
        // a 1.466 1.466 0 0 0 0.286 0.08
        arcToRelative(
            a = 1.466f,
            b = 1.466f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.286f,
            dy1 = 0.08f,
        )
        // a 1.312 1.312 0 0 0 0.3 -0.034
        arcToRelative(
            a = 1.312f,
            b = 1.312f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.3f,
            dy1 = -0.034f,
        )
        // a 0.488 0.488 0 0 1 -0.229 0.176
        arcToRelative(
            a = 0.488f,
            b = 0.488f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.229f,
            dy1 = 0.176f,
        )
        // a 0.845 0.845 0 0 0 0.283 0.063
        arcToRelative(
            a = 0.845f,
            b = 0.845f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.283f,
            dy1 = 0.063f,
        )
        // a 1.235 1.235 0 0 0 0.3 -0.1
        arcToRelative(
            a = 1.235f,
            b = 1.235f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.3f,
            dy1 = -0.1f,
        )
        // a 1.52 1.52 0 0 0 0.151 0.115
        arcToRelative(
            a = 1.52f,
            b = 1.52f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.151f,
            dy1 = 0.115f,
        )
        // c -0.142 0.03 -0.345 0.075 -0.442 0.108
        curveToRelative(
            dx1 = -0.142f,
            dy1 = 0.03f,
            dx2 = -0.345f,
            dy2 = 0.075f,
            dx3 = -0.442f,
            dy3 = 0.108f,
        )
        // a 6.056 6.056 0 0 0 -0.722 0.343
        arcToRelative(
            a = 6.056f,
            b = 6.056f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.722f,
            dy1 = 0.343f,
        )
        // a 0.747 0.747 0 0 1 -0.324 -0.052
        arcToRelative(
            a = 0.747f,
            b = 0.747f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.324f,
            dy1 = -0.052f,
        )
        // c -0.085 -0.056 -0.1 -0.133 -0.153 -0.185
        curveToRelative(
            dx1 = -0.085f,
            dy1 = -0.056f,
            dx2 = -0.1f,
            dy2 = -0.133f,
            dx3 = -0.153f,
            dy3 = -0.185f,
        )
        // a 0.265 0.265 0 0 0 -0.141 -0.057
        arcToRelative(
            a = 0.265f,
            b = 0.265f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.141f,
            dy1 = -0.057f,
        )
        // a 0.166 0.166 0 0 0 -0.172 0.141
        arcToRelative(
            a = 0.166f,
            b = 0.166f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.172f,
            dy1 = 0.141f,
        )
        // a 0.448 0.448 0 0 0 0.022 0.16
        arcToRelative(
            a = 0.448f,
            b = 0.448f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.022f,
            dy1 = 0.16f,
        )
        // c -0.235 -0.008 -0.278 0.1 -0.275 0.222
        curveToRelative(
            dx1 = -0.235f,
            dy1 = -0.008f,
            dx2 = -0.278f,
            dy2 = 0.1f,
            dx3 = -0.275f,
            dy3 = 0.222f,
        )
        // s 0.127 0.265 0.359 0.235
        reflectiveCurveToRelative(
            dx1 = 0.127f,
            dy1 = 0.265f,
            dx2 = 0.359f,
            dy2 = 0.235f,
        )
        // c -0.13 0.188 -0.028 0.311 0.084 0.344
        curveToRelative(
            dx1 = -0.13f,
            dy1 = 0.188f,
            dx2 = -0.028f,
            dy2 = 0.311f,
            dx3 = 0.084f,
            dy3 = 0.344f,
        )
        // a 0.331 0.331 0 0 0 0.274 -0.053
        arcToRelative(
            a = 0.331f,
            b = 0.331f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.274f,
            dy1 = -0.053f,
        )
        // c 0.08 -0.067 0.088 -0.213 0.265 -0.217
        curveToRelative(
            dx1 = 0.08f,
            dy1 = -0.067f,
            dx2 = 0.088f,
            dy2 = -0.213f,
            dx3 = 0.265f,
            dy3 = -0.217f,
        )
        // h 0.146
        horizontalLineToRelative(dx = 0.146f)
        // a 0.419 0.419 0 0 1 -0.038 0.273
        arcToRelative(
            a = 0.419f,
            b = 0.419f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.038f,
            dy1 = 0.273f,
        )
        // a 1.409 1.409 0 0 0 0.3 -0.161
        arcToRelative(
            a = 1.409f,
            b = 1.409f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.3f,
            dy1 = -0.161f,
        )
        // a 0.767 0.767 0 0 0 0.14 -0.212
        arcToRelative(
            a = 0.767f,
            b = 0.767f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.14f,
            dy1 = -0.212f,
        )
        // a 0.278 0.278 0 0 1 0.007 0.264
        arcToRelative(
            a = 0.278f,
            b = 0.278f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.007f,
            dy1 = 0.264f,
        )
        // a 1.042 1.042 0 0 0 0.237 -0.124
        arcToRelative(
            a = 1.042f,
            b = 1.042f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.237f,
            dy1 = -0.124f,
        )
        // a 0.884 0.884 0 0 0 0.137 -0.215
        arcToRelative(
            a = 0.884f,
            b = 0.884f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.137f,
            dy1 = -0.215f,
        )
        // c 0.06 0.091 0.019 0.169 0.006 0.251
        curveToRelative(
            dx1 = 0.06f,
            dy1 = 0.091f,
            dx2 = 0.019f,
            dy2 = 0.169f,
            dx3 = 0.006f,
            dy3 = 0.251f,
        )
        // a 1.431 1.431 0 0 0 0.258 -0.147
        arcToRelative(
            a = 1.431f,
            b = 1.431f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.258f,
            dy1 = -0.147f,
        )
        // A 1.034 1.034 0 0 0 4.4 9.6
        arcTo(
            horizontalEllipseRadius = 1.034f,
            verticalEllipseRadius = 1.034f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 4.4f,
            y1 = 9.6f,
        )
        // a 0.364 0.364 0 0 1 0 0.264
        arcToRelative(
            a = 0.364f,
            b = 0.364f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 0.264f,
        )
        // a 0.835 0.835 0 0 0 0.24 -0.164
        arcToRelative(
            a = 0.835f,
            b = 0.835f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.24f,
            dy1 = -0.164f,
        )
        // a 0.945 0.945 0 0 0 0.111 -0.266
        arcToRelative(
            a = 0.945f,
            b = 0.945f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.111f,
            dy1 = -0.266f,
        )
        // a 0.848 0.848 0 0 0 0.3 -0.06
        arcToRelative(
            a = 0.848f,
            b = 0.848f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.3f,
            dy1 = -0.06f,
        )
        // a 0.635 0.635 0 0 0 0.157 -0.209
        arcToRelative(
            a = 0.635f,
            b = 0.635f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.157f,
            dy1 = -0.209f,
        )
        // a 5.532 5.532 0 0 0 0.746 -0.1
        arcToRelative(
            a = 5.532f,
            b = 5.532f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.746f,
            dy1 = -0.1f,
        )
        // c 0.48 -0.125 1.782 -0.625 2.565 -0.876
        curveToRelative(
            dx1 = 0.48f,
            dy1 = -0.125f,
            dx2 = 1.782f,
            dy2 = -0.625f,
            dx3 = 2.565f,
            dy3 = -0.876f,
        )
        // c 0.113 0.081 0.2 0.167 0.191 0.215
        curveToRelative(
            dx1 = 0.113f,
            dy1 = 0.081f,
            dx2 = 0.2f,
            dy2 = 0.167f,
            dx3 = 0.191f,
            dy3 = 0.215f,
        )
        // s -0.085 0.069 -0.12 0.116
        reflectiveCurveToRelative(
            dx1 = -0.085f,
            dy1 = 0.069f,
            dx2 = -0.12f,
            dy2 = 0.116f,
        )
        // s 0 0.088 0.023 0.122
        reflectiveCurveToRelative(
            dx1 = 0.0f,
            dy1 = 0.088f,
            dx2 = 0.023f,
            dy2 = 0.122f,
        )
        // s 0.125 0.057 0.154 0.1
        reflectiveCurveToRelative(
            dx1 = 0.125f,
            dy1 = 0.057f,
            dx2 = 0.154f,
            dy2 = 0.1f,
        )
        // s 0.039 0.078 0.01 0.117
        reflectiveCurveToRelative(
            dx1 = 0.039f,
            dy1 = 0.078f,
            dx2 = 0.01f,
            dy2 = 0.117f,
        )
        // c -0.058 0.079 -0.256 0.116 -0.352 0.16
        curveToRelative(
            dx1 = -0.058f,
            dy1 = 0.079f,
            dx2 = -0.256f,
            dy2 = 0.116f,
            dx3 = -0.352f,
            dy3 = 0.16f,
        )
        // c -0.175 0.079 -0.469 0.251 -0.469 0.251
        curveToRelative(
            dx1 = -0.175f,
            dy1 = 0.079f,
            dx2 = -0.469f,
            dy2 = 0.251f,
            dx3 = -0.469f,
            dy3 = 0.251f,
        )
        // a 0.661 0.661 0 0 1 -0.269 -0.038
        arcToRelative(
            a = 0.661f,
            b = 0.661f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.269f,
            dy1 = -0.038f,
        )
        // c -0.083 -0.021 -0.186 -0.124 -0.273 -0.122
        curveToRelative(
            dx1 = -0.083f,
            dy1 = -0.021f,
            dx2 = -0.186f,
            dy2 = -0.124f,
            dx3 = -0.273f,
            dy3 = -0.122f,
        )
        // a 0.244 0.244 0 0 0 -0.2 0.123
        arcToRelative(
            a = 0.244f,
            b = 0.244f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.2f,
            dy1 = 0.123f,
        )
        // a 0.2 0.2 0 0 0 0.051 0.173
        arcToRelative(
            a = 0.2f,
            b = 0.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.051f,
            dy1 = 0.173f,
        )
        // l 0.16 0.1
        lineToRelative(dx = 0.16f, dy = 0.1f)
        // a 0.491 0.491 0 0 0 -0.1 0.176
        arcToRelative(
            a = 0.491f,
            b = 0.491f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.1f,
            dy1 = 0.176f,
        )
        // a 0.175 0.175 0 0 0 0.064 0.139
        arcToRelative(
            a = 0.175f,
            b = 0.175f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.064f,
            dy1 = 0.139f,
        )
        // a 0.2 0.2 0 0 0 0.15 0.085
        arcToRelative(
            a = 0.2f,
            b = 0.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.15f,
            dy1 = 0.085f,
        )
        // A 0.778 0.778 0 0 0 7.7 9.9
        arcTo(
            horizontalEllipseRadius = 0.778f,
            verticalEllipseRadius = 0.778f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 7.7f,
            y1 = 9.9f,
        )
        // a 0.244 0.244 0 0 0 0.275 0.253
        arcToRelative(
            a = 0.244f,
            b = 0.244f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.275f,
            dy1 = 0.253f,
        )
        // a 0.161 0.161 0 0 0 0.145 -0.081
        arcToRelative(
            a = 0.161f,
            b = 0.161f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.145f,
            dy1 = -0.081f,
        )
        // c 0.032 -0.046 0.022 -0.163 0.075 -0.212
        curveToRelative(
            dx1 = 0.032f,
            dy1 = -0.046f,
            dx2 = 0.022f,
            dy2 = -0.163f,
            dx3 = 0.075f,
            dy3 = -0.212f,
        )
        // l 0.214 -0.2
        lineToRelative(dx = 0.214f, dy = -0.2f)
        // c 0.1 0.053 0.1 0.137 0.086 0.223
        curveToRelative(
            dx1 = 0.1f,
            dy1 = 0.053f,
            dx2 = 0.1f,
            dy2 = 0.137f,
            dx3 = 0.086f,
            dy3 = 0.223f,
        )
        // a 0.828 0.828 0 0 0 0.179 -0.153
        arcToRelative(
            a = 0.828f,
            b = 0.828f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.179f,
            dy1 = -0.153f,
        )
        // a 0.653 0.653 0 0 0 0.055 -0.219
        arcToRelative(
            a = 0.653f,
            b = 0.653f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.055f,
            dy1 = -0.219f,
        )
        // a 0.236 0.236 0 0 1 0.106 0.24
        arcToRelative(
            a = 0.236f,
            b = 0.236f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.106f,
            dy1 = 0.24f,
        )
        // a 0.934 0.934 0 0 0 0.187 -0.151
        arcToRelative(
            a = 0.934f,
            b = 0.934f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.187f,
            dy1 = -0.151f,
        )
        // a 0.909 0.909 0 0 0 0.091 -0.221
        arcToRelative(
            a = 0.909f,
            b = 0.909f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.091f,
            dy1 = -0.221f,
        )
        // a 0.253 0.253 0 0 1 0.061 0.256
        arcToRelative(
            a = 0.253f,
            b = 0.253f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.061f,
            dy1 = 0.256f,
        )
        // a 0.737 0.737 0 0 0 0.2 -0.193
        arcToRelative(
            a = 0.737f,
            b = 0.737f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.2f,
            dy1 = -0.193f,
        )
        // a 0.8 0.8 0 0 0 0.05 -0.185
        arcToRelative(
            a = 0.8f,
            b = 0.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.05f,
            dy1 = -0.185f,
        )
        // c 0.2 0.009 0.318 -0.076 0.325 -0.162
        curveToRelative(
            dx1 = 0.2f,
            dy1 = 0.009f,
            dx2 = 0.318f,
            dy2 = -0.076f,
            dx3 = 0.325f,
            dy3 = -0.162f,
        )
        // c 0 -0.066 -0.075 -0.155 -0.232 -0.177
        curveToRelative(
            dx1 = 0.0f,
            dy1 = -0.066f,
            dx2 = -0.075f,
            dy2 = -0.155f,
            dx3 = -0.232f,
            dy3 = -0.177f,
        )
        // a 0.787 0.787 0 0 1 -0.083 -0.145
        arcToRelative(
            a = 0.787f,
            b = 0.787f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.083f,
            dy1 = -0.145f,
        )
        // a 0.2 0.2 0 0 1 0 -0.134
        arcToRelative(
            a = 0.2f,
            b = 0.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -0.134f,
        )
        // a 0.555 0.555 0 0 1 0.179 -0.222
        arcToRelative(
            a = 0.555f,
            b = 0.555f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.179f,
            dy1 = -0.222f,
        )
        // c 0.016 -0.013 0.041 -0.027 0.062 -0.041
        curveToRelative(
            dx1 = 0.016f,
            dy1 = -0.013f,
            dx2 = 0.041f,
            dy2 = -0.027f,
            dx3 = 0.062f,
            dy3 = -0.041f,
        )
        // l 0.009 0.029
        lineToRelative(dx = 0.009f, dy = 0.029f)
        // a 0.217 0.217 0 0 0 0.112 0.127
        arcToRelative(
            a = 0.217f,
            b = 0.217f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.112f,
            dy1 = 0.127f,
        )
        // a 0.2 0.2 0 0 0 0.166 -0.025
        arcToRelative(
            a = 0.2f,
            b = 0.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.166f,
            dy1 = -0.025f,
        )
        // a 1.36 1.36 0 0 0 0.863 0.488
        arcToRelative(
            a = 1.36f,
            b = 1.36f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.863f,
            dy1 = 0.488f,
        )
        // a 3.167 3.167 0 0 0 0.762 -0.018
        arcToRelative(
            a = 3.167f,
            b = 3.167f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.762f,
            dy1 = -0.018f,
        )
        // a 7.46 7.46 0 0 0 0.543 -0.142
        arcToRelative(
            a = 7.46f,
            b = 7.46f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.543f,
            dy1 = -0.142f,
        )
        // a 3.076 3.076 0 0 0 0.208 0.24
        arcToRelative(
            a = 3.076f,
            b = 3.076f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.208f,
            dy1 = 0.24f,
        )
        // a 4.519 4.519 0 0 0 0.454 0.337
        arcToRelative(
            a = 4.519f,
            b = 4.519f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.454f,
            dy1 = 0.337f,
        )
        // a 0.589 0.589 0 0 1 -0.183 0.158
        arcToRelative(
            a = 0.589f,
            b = 0.589f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.183f,
            dy1 = 0.158f,
        )
        // c -0.074 0.033 -0.22 0.04 -0.271 0.1
        curveToRelative(
            dx1 = -0.074f,
            dy1 = 0.033f,
            dx2 = -0.22f,
            dy2 = 0.04f,
            dx3 = -0.271f,
            dy3 = 0.1f,
        )
        // a 0.183 0.183 0 0 0 -0.019 0.206
        arcToRelative(
            a = 0.183f,
            b = 0.183f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.019f,
            dy1 = 0.206f,
        )
        // a 0.263 0.263 0 0 0 0.178 0.079
        arcToRelative(
            a = 0.263f,
            b = 0.263f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.178f,
            dy1 = 0.079f,
        )
        // l 0.186 -0.037
        lineToRelative(dx = 0.186f, dy = -0.037f)
        // a 0.5 0.5 0 0 0 0.086 0.178
        arcToRelative(
            a = 0.5f,
            b = 0.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.086f,
            dy1 = 0.178f,
        )
        // a 0.231 0.231 0 0 0 0.158 0.048
        arcToRelative(
            a = 0.231f,
            b = 0.231f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.158f,
            dy1 = 0.048f,
        )
        // c 0.079 0 0.105 0.006 0.164 -0.041
        curveToRelative(
            dx1 = 0.079f,
            dy1 = 0.0f,
            dx2 = 0.105f,
            dy2 = 0.006f,
            dx3 = 0.164f,
            dy3 = -0.041f,
        )
        // a 0.553 0.553 0 0 0 0.087 -0.118
        arcToRelative(
            a = 0.553f,
            b = 0.553f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.087f,
            dy1 = -0.118f,
        )
        // a 0.368 0.368 0 0 0 0.128 0.064
        arcToRelative(
            a = 0.368f,
            b = 0.368f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.128f,
            dy1 = 0.064f,
        )
        // a 0.271 0.271 0 0 0 0.256 -0.078
        arcToRelative(
            a = 0.271f,
            b = 0.271f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.256f,
            dy1 = -0.078f,
        )
        // a 0.122 0.122 0 0 0 0.021 -0.145
        arcToRelative(
            a = 0.122f,
            b = 0.122f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.021f,
            dy1 = -0.145f,
        )
        // c -0.026 -0.055 -0.13 -0.126 -0.14 -0.19z
        curveToRelative(
            dx1 = -0.026f,
            dy1 = -0.055f,
            dx2 = -0.13f,
            dy2 = -0.126f,
            dx3 = -0.14f,
            dy3 = -0.19f,
        )
        close()
    }
    // m13.614 9.475  l0.066 0.042 -0.009 -0.078 a0.441 0.441 0 0 0 -0.072 -0.206 0.528 0.528 0 0 0 -0.144 -0.108 l0.017 -0.007 a0.771 0.771 0 0 1 0.145 -0.013 h0.083 l-0.053 -0.062 a1.043 1.043 0 0 0 -0.136 -0.13 0.342 0.342 0 0 0 -0.181 -0.042 l0.011 -0.007 a0.309 0.309 0 0 1 0.127 -0.019 h0.085 l-0.053 -0.062 a0.487 0.487 0 0 0 -0.161 -0.12 0.675 0.675 0 0 0 -0.17 -0.025 0.075 0.075 0 0 1 0.018 -0.015 1.084 1.084 0 0 1 0.163 -0.063 l0.087 -0.026 -0.081 -0.042 a1.266 1.266 0 0 0 -0.2 -0.082 0.4 0.4 0 0 0 -0.1 -0.005 0.621 0.621 0 0 1 -0.114 0 0.178 0.178 0 0 1 -0.085 -0.045 c0.027 -0.185 -0.083 -0.235 -0.118 -0.246 a0.354 0.354 0 0 0 -0.165 0 0.373 0.373 0 0 0 -0.154 0.105 c-0.074 0 -0.383 -0.012 -0.577 0 a1.336 1.336 0 0 0 -0.2 0.036 0.723 0.723 0 0 1 -0.32 0.031 0.285 0.285 0 0 1 -0.13 -0.116 0.509 0.509 0 0 0 -0.1 -0.11 l-0.146 -0.1 0.23 0.006 a4.854 4.854 0 0 0 1.493 -0.111 c0.334 -0.1 0.718 -0.271 0.73 -0.627 a0.572 0.572 0 0 0 -0.154 -0.427 0.939 0.939 0 0 0 -0.709 -0.221 4.149 4.149 0 0 0 -1.052 0.129 c-0.11 0.025 -0.305 0.079 -0.531 0.142 -0.326 0.092 -0.7 0.195 -0.9 0.235 -0.15 0.029 -0.315 0.065 -0.473 0.1 -0.222 0.049 -0.451 0.1 -0.657 0.134 a2.646 2.646 0 0 1 -0.977 0 0.457 0.457 0 0 1 -0.293 -0.147 0.1 0.1 0 0 1 0 -0.1 A0.546 0.546 0 0 1 8 6.924 l0.064 -0.012 a0.472 0.472 0 0 1 0.179 0.071 0.993 0.993 0 0 0 0.142 0.065 1.209 1.209 0 0 0 0.44 0.05 0.879 0.879 0 0 0 0.375 -0.092 0.493 0.493 0 0 1 0.378 -0.1 0.206 0.206 0 0 1 0.01 0.139 l-0.01 0.066 0.062 -0.026 c0.13 -0.055 0.2 -0.124 0.219 -0.2 a0.2 0.2 0 0 0 -0.027 -0.135 2.488 2.488 0 0 0 0.349 0.057 1.708 1.708 0 0 0 0.751 -0.11 0.637 0.637 0 0 0 0.453 -0.574 l0.008 -0.1 -0.229 0.228 a0.989 0.989 0 0 1 -0.415 0.146 0.24 0.24 0 0 0 -0.014 -0.161 0.3 0.3 0 0 0 -0.242 -0.151 L10.4 6.085 l0.056 0.062 c0.068 0.075 0.043 0.1 0 0.147 l-0.014 0.015 a0.558 0.558 0 0 1 -0.365 0.065 c-0.053 0 -0.106 -0.012 -0.163 -0.019 a3.642 3.642 0 0 0 -0.964 -0.009 9.327 9.327 0 0 0 -1.04 0.215 1.2 1.2 0 0 0 -0.609 0.323 0.4 0.4 0 0 0 -0.1 0.357 0.465 0.465 0 0 0 0.346 0.313 2.231 2.231 0 0 0 0.686 0.118 c-0.772 0.073 -1.686 0.156 -1.7 0.157 l-0.59 0.054 A10.2 10.2 0 0 0 4.772 7.8 h-0.028 a1.139 1.139 0 0 1 -0.181 0 L4.4 7.793 h-0.037 v0.344 a6.226 6.226 0 0 0 -0.364 -0.207 c-0.246 -0.123 -0.746 -0.323 -0.813 -0.35 a0.483 0.483 0 0 1 -0.136 -0.226 0.274 0.274 0 0 1 0.034 -0.131 0.386 0.386 0 0 0 0.032 -0.088 0.24 0.24 0 0 0 -0.044 -0.164 0.216 0.216 0 0 0 -0.272 -0.037 0.514 0.514 0 0 0 -0.122 0.12 0.245 0.245 0 0 0 -0.372 -0.037 0.318 0.318 0 0 0 -0.133 0.235 0.241 0.241 0 0 0 0.058 0.156 0.258 0.258 0 0 0 -0.16 0.117 0.255 0.255 0 0 0 -0.009 0.223 0.314 0.314 0 0 0 0.244 0.177 0.415 0.415 0 0 0 0.121 -0.012 c0.078 -0.015 0.146 -0.028 0.208 0.038 l0.069 0.074 a0.6 0.6 0 0 1 -0.223 0.119 l-0.081 0.032 0.084 0.037 a1.429 1.429 0 0 0 0.336 0.1 0.623 0.623 0 0 0 0.179 -0.024 0.474 0.474 0 0 1 -0.147 0.08 l-0.088 0.031 0.081 0.037 a0.994 0.994 0 0 0 0.267 0.085 0.706 0.706 0 0 0 0.176 -0.022 0.487 0.487 0 0 1 -0.081 0.046 0.577 0.577 0 0 0 -0.055 0.029 l-0.068 0.039 0.073 0.028 a1.462 1.462 0 0 0 0.3 0.082 1.035 1.035 0 0 0 0.207 -0.014 0.566 0.566 0 0 1 -0.145 0.085 l-0.079 0.036 0.081 0.032 a0.854 0.854 0 0 0 0.3 0.066 1.137 1.137 0 0 0 0.29 -0.092 c0.013 0.012 0.042 0.031 0.065 0.048 -0.131 0.029 -0.28 0.064 -0.361 0.092 a5.949 5.949 0 0 0 -0.72 0.34 0.639 0.639 0 0 1 -0.295 -0.043 0.281 0.281 0 0 1 -0.092 -0.1 0.43 0.43 0 0 0 -0.058 -0.074 0.3 0.3 0 0 0 -0.165 -0.068 0.2 0.2 0 0 0 -0.211 0.171 0.384 0.384 0 0 0 0.01 0.13 0.3 0.3 0 0 0 -0.2 0.07 0.25 0.25 0 0 0 -0.062 0.189 0.27 0.27 0 0 0 0.1 0.2 0.359 0.359 0 0 0 0.234 0.081 0.243 0.243 0 0 0 -0.019 0.194 0.235 0.235 0 0 0 0.159 0.144 0.372 0.372 0 0 0 0.309 -0.06 0.357 0.357 0 0 0 0.07 -0.091 0.187 0.187 0 0 1 0.171 -0.117 h0.117 a0.446 0.446 0 0 1 -0.044 0.222 l-0.029 0.079 0.078 -0.032 a1.454 1.454 0 0 0 0.312 -0.166 0.571 0.571 0 0 0 0.1 -0.15 0.323 0.323 0 0 1 -0.025 0.158 l-0.028 0.077 0.076 -0.029 a1.081 1.081 0 0 0 0.249 -0.131 0.642 0.642 0 0 0 0.106 -0.149 0.33 0.33 0 0 1 -0.013 0.1 0.535 0.535 0 0 0 -0.011 0.055 l-0.011 0.068 0.061 -0.045 a1.462 1.462 0 0 0 0.266 -0.152 0.844 0.844 0 0 0 0.132 -0.162 0.385 0.385 0 0 1 -0.02 0.159 l-0.021 0.076 0.072 -0.032 a0.875 0.875 0 0 0 0.256 -0.165 0.862 0.862 0 0 0 0.11 -0.254 0.777 0.777 0 0 0 0.289 -0.064 0.589 0.589 0 0 0 0.16 -0.205 5.142 5.142 0 0 0 0.732 -0.094 c0.27 -0.071 0.794 -0.258 1.349 -0.456 a50.06 50.06 0 0 1 1.2 -0.417 c0.113 0.064 0.162 0.123 0.157 0.168 a0.17 0.17 0 0 1 -0.043 0.039 0.435 0.435 0 0 0 -0.071 0.065 0.145 0.145 0 0 0 0.024 0.168 0.24 0.24 0 0 0 0.093 0.063 0.158 0.158 0 0 1 0.059 0.036 c0.026 0.041 0.024 0.057 0.011 0.075 a0.531 0.531 0 0 1 -0.22 0.1 c-0.044 0.015 -0.086 0.028 -0.118 0.043 a7.038 7.038 0 0 0 -0.466 0.249 0.409 0.409 0 0 1 -0.139 -0.01 l-0.107 -0.028 a0.447 0.447 0 0 1 -0.1 -0.052 0.363 0.363 0 0 0 -0.176 -0.071 h-0.002 a0.278 0.278 0 0 0 -0.229 0.139 0.13 0.13 0 0 0 -0.007 0.1 0.234 0.234 0 0 0 0.069 0.129 l0.125 0.079 a0.389 0.389 0 0 0 -0.083 0.163 0.214 0.214 0 0 0 0.075 0.169 l0.013 0.013 a0.211 0.211 0 0 0 0.158 0.083 0.646 0.646 0 0 0 0.136 -0.01 0.224 0.224 0 0 0 0.034 0.107 0.317 0.317 0 0 0 0.249 0.14 h0.031 a0.2 0.2 0 0 0 0.171 -0.1 0.3 0.3 0 0 0 0.032 -0.1 0.208 0.208 0 0 1 0.038 -0.106 l0.192 -0.18 c0.05 0.038 0.054 0.09 0.045 0.171 l-0.009 0.079 0.066 -0.043 a0.8 0.8 0 0 0 0.19 -0.164 0.475 0.475 0 0 0 0.051 -0.161 0.171 0.171 0 0 1 0.042 0.155 l-0.015 0.084 0.072 -0.046 a0.9 0.9 0 0 0 0.2 -0.163 0.654 0.654 0 0 0 0.075 -0.163 0.267 0.267 0 0 1 0.01 0.169 l-0.019 0.09 0.077 -0.049 a0.764 0.764 0 0 0 0.21 -0.208 0.745 0.745 0 0 0 0.047 -0.163 c0.2 0 0.323 -0.1 0.331 -0.2 0.006 -0.083 -0.079 -0.185 -0.247 -0.214 a0.693 0.693 0 0 1 -0.07 -0.124 0.155 0.155 0 0 1 0 -0.108 0.521 0.521 0 0 1 0.168 -0.206 l0.011 -0.011 a0.239 0.239 0 0 0 0.128 0.135 0.19 0.19 0 0 0 0.068 0.011 0.254 0.254 0 0 0 0.105 -0.031 1.379 1.379 0 0 0 0.848 0.482 h0.016 a3.157 3.157 0 0 0 0.772 -0.018 c0.13 -0.022 0.435 -0.11 0.523 -0.135 a2.9 2.9 0 0 0 0.2 0.224 4.177 4.177 0 0 0 0.424 0.317 0.464 0.464 0 0 1 -0.142 0.116 0.581 0.581 0 0 1 -0.1 0.028 0.356 0.356 0 0 0 -0.187 0.078 0.218 0.218 0 0 0 -0.026 0.246 0.291 0.291 0 0 0 0.221 0.1 l0.152 -0.03 a0.413 0.413 0 0 0 0.087 0.162 0.272 0.272 0 0 0 0.18 0.076 h0.006 a0.245 0.245 0 0 0 0.184 -0.068 0.416 0.416 0 0 0 0.076 -0.093 0.312 0.312 0 0 0 0.4 -0.046 0.158 0.158 0 0 0 0.025 -0.18 0.294 0.294 0 0 0 -0.065 -0.084 0.253 0.253 0 0 1 -0.067 -0.092 l-0.03 -0.228 a0.2 0.2 0 0 1 0.044 0.006 0.819 0.819 0 0 1 0.122 0.069z M4.14 8.77 l-0.018 -0.019 -0.022 0.011 a1.194 1.194 0 0 1 -0.287 0.1 0.614 0.614 0 0 1 -0.184 -0.032 0.469 0.469 0 0 0 0.163 -0.149 l0.057 -0.08 -0.1 0.022 a1.155 1.155 0 0 1 -0.292 0.033 0.955 0.955 0 0 1 -0.2 -0.048 0.3 0.3 0 0 0 0.155 -0.15 l0.031 -0.072 -0.069 0.014 a0.966 0.966 0 0 1 -0.257 0.046 0.612 0.612 0 0 1 -0.161 -0.044 0.329 0.329 0 0 0 0.165 -0.164 l0.031 -0.075 -0.077 0.025 a0.836 0.836 0 0 1 -0.253 0.049 0.993 0.993 0 0 1 -0.222 -0.057 0.459 0.459 0 0 0 0.189 -0.133 l0.011 -0.025 -0.11 -0.122 a0.265 0.265 0 0 0 -0.276 -0.06 0.41 0.41 0 0 1 -0.1 0.011 0.246 0.246 0 0 1 -0.183 -0.131 0.186 0.186 0 0 1 0 -0.158 0.228 0.228 0 0 1 0.176 -0.1 l0.093 -0.006 -0.069 -0.056 a0.192 0.192 0 0 1 -0.082 -0.149 0.245 0.245 0 0 1 0.1 -0.178 c0.09 -0.071 0.175 -0.087 0.3 0.062 l0.031 0.038 0.029 -0.04 A0.565 0.565 0 0 1 2.836 7 a0.145 0.145 0 0 1 0.181 0.015 0.162 0.162 0 0 1 0.029 0.105 0.324 0.324 0 0 1 -0.026 0.071 0.352 0.352 0 0 0 -0.041 0.165 0.566 0.566 0 0 0 0.163 0.281 l0.013 0.009 c0.006 0 0.555 0.22 0.815 0.349 0.134 0.067 0.383 0.22 0.4 0.229 l0.007 0.622 -0.109 0.023 a0.991 0.991 0 0 1 -0.128 -0.099z M9.392 8.625 a0.235 0.235 0 0 0 0 0.159 0.9 0.9 0 0 0 0.088 0.154 l0.009 0.012 h0.016 c0.135 0.019 0.2 0.092 0.2 0.137 s-0.105 0.137 -0.285 0.128 h-0.034 v0.034 a0.8 0.8 0 0 1 -0.046 0.174 0.474 0.474 0 0 1 -0.118 0.127 0.257 0.257 0 0 0 -0.082 -0.2 l-0.045 -0.04 -0.016 0.058 a0.875 0.875 0 0 1 -0.085 0.21 0.635 0.635 0 0 1 -0.115 0.1 0.3 0.3 0 0 0 -0.122 -0.2 L8.7 9.437 l-0.007 0.071 a0.621 0.621 0 0 1 -0.05 0.2 0.516 0.516 0 0 1 -0.106 0.1 0.2 0.2 0 0 0 -0.109 -0.181 l-0.023 -0.013 -0.234 0.219 a0.258 0.258 0 0 0 -0.061 0.146 0.226 0.226 0 0 1 -0.02 0.072 c-0.033 0.048 -0.047 0.056 -0.119 0.065 a0.241 0.241 0 0 1 -0.21 -0.109 0.212 0.212 0 0 1 -0.021 -0.107 v-0.044 l-0.04 0.009 a0.76 0.76 0 0 1 -0.154 0.017 0.144 0.144 0 0 1 -0.114 -0.061 l-0.013 -0.014 A0.136 0.136 0 0 1 7.36 9.7 a0.444 0.444 0 0 1 0.093 -0.155 l0.028 -0.032 -0.2 -0.125 a0.209 0.209 0 0 1 -0.04 -0.122 0.2 0.2 0 0 1 0.17 -0.1 0.3 0.3 0 0 1 0.139 0.06 l0.037 0.022 -0.026 0.01 0.142 0.037 a0.623 0.623 0 0 0 0.252 0.03 h0.013 s0.295 -0.171 0.466 -0.25 c0.029 -0.012 0.068 -0.025 0.11 -0.039 a0.552 0.552 0 0 0 0.256 -0.143 0.132 0.132 0 0 0 -0.008 -0.16 0.2 0.2 0 0 0 -0.091 -0.064 0.191 0.191 0 0 1 -0.066 -0.041 c-0.022 -0.029 -0.032 -0.063 -0.022 -0.077 a0.261 0.261 0 0 1 0.061 -0.051 0.164 0.164 0 0 0 0.068 -0.077 c0.028 -0.1 -0.027 -0.146 -0.146 -0.215 0.142 -0.045 0.269 -0.082 0.361 -0.1 0.021 -0.005 0.031 0 0.05 -0.008 a0.455 0.455 0 0 0 -0.089 0.184 l-0.018 0.065 0.068 -0.022 a1.454 1.454 0 0 1 0.4 -0.083 0.742 0.742 0 0 1 0.223 0.029 c0.005 0.016 0.019 0.054 0.034 0.09 a0.368 0.368 0 0 0 -0.039 0.024 0.6 0.6 0 0 0 -0.194 0.238z M9.332 8.108 a0.916 0.916 0 0 1 0.1 0.056 l-0.079 0.005 a1.426 1.426 0 0 0 -0.337 0.064 0.538 0.538 0 0 1 0.111 -0.155 0.55 0.55 0 0 1 0.205 0.03 m0.471 0.387 a0.146 0.146 0 0 1 -0.103 -0.106 s-0.019 -0.061 -0.006 -0.069 l0.189 0.163 a0.214 0.214 0 0 1 -0.083 0.012z M9.755 8.279 a1.265 1.265 0 0 0 -0.4 -0.242 0.592 0.592 0 0 0 -0.243 -0.03 L9.1 8 l-0.009 0.01 a1.169 1.169 0 0 0 -0.151 0.022 c-0.322 0.073 -1 0.315 -1.657 0.549 -0.553 0.2 -1.075 0.384 -1.342 0.454 a5.474 5.474 0 0 1 -0.739 0.093 h-0.021 l-0.01 0.019 a0.615 0.615 0 0 1 -0.142 0.194 0.794 0.794 0 0 1 -0.28 0.054 h-0.027 l-0.007 0.027 a0.881 0.881 0 0 1 -0.1 0.251 0.565 0.565 0 0 1 -0.159 0.111 0.367 0.367 0 0 0 -0.021 -0.209 L4.4 9.5 l-0.039 0.071 a1.022 1.022 0 0 1 -0.163 0.219 1.033 1.033 0 0 1 -0.18 0.108 0.243 0.243 0 0 0 -0.028 -0.2 l-0.033 -0.058 -0.029 0.06 a0.8 0.8 0 0 1 -0.128 0.2 0.7 0.7 0 0 1 -0.154 0.087 0.268 0.268 0 0 0 -0.034 -0.219 l-0.038 -0.057 -0.027 0.063 a0.713 0.713 0 0 1 -0.122 0.2 1.038 1.038 0 0 1 -0.213 0.121 0.353 0.353 0 0 0 0.009 -0.216 l-0.008 -0.027 h-0.174 a0.256 0.256 0 0 0 -0.233 0.153 0.332 0.332 0 0 1 -0.055 0.073 0.3 0.3 0 0 1 -0.24 0.045 0.162 0.162 0 0 1 -0.11 -0.1 0.215 0.215 0 0 1 0.047 -0.19 l0.052 -0.059 -0.083 0.011 a0.313 0.313 0 0 1 -0.248 -0.06 0.189 0.189 0 0 1 -0.07 -0.139 0.173 0.173 0 0 1 0.04 -0.135 0.282 0.282 0 0 1 0.2 -0.049 h0.052 l-0.015 -0.05 a0.4 0.4 0 0 1 -0.022 -0.142 0.132 0.132 0 0 1 0.134 -0.11 0.231 0.231 0 0 1 0.117 0.046 0.353 0.353 0 0 1 0.044 0.061 0.364 0.364 0 0 0 0.115 0.128 0.728 0.728 0 0 0 0.336 0.065 h0.017 a6.091 6.091 0 0 1 0.716 -0.339 c0.149 -0.052 0.581 -0.137 0.585 -0.137 l0.031 -0.006 -0.009 -0.694 0.383 -0.124 0.226 0.627 a0.457 0.457 0 0 1 0.085 0.017 l-0.265 -0.735 -0.427 0.123 v-0.266 l0.121 0.006 a1.4 1.4 0 0 0 0.189 0 h0.028 a11.12 11.12 0 0 1 1.166 0.089 l0.6 -0.054 c0.022 0 2.2 -0.2 2.674 -0.255 a5.017 5.017 0 0 1 0.716 -0.045 4.711 4.711 0 0 1 0.522 0.051 4.909 4.909 0 0 0 0.495 0.049 c0.08 0 0.153 0.006 0.222 0.009 a4.034 4.034 0 0 0 0.55 0 l0.175 -0.012 c0.427 -0.025 1.012 -0.06 1.216 -0.393 a0.263 0.263 0 0 0 -0.077 -0.34 0.409 0.409 0 0 0 -0.395 -0.1 c-0.083 0.019 -0.212 0.083 -0.224 0.18 a0.175 0.175 0 0 0 0.048 0.144 0.462 0.462 0 0 0 0.048 0.05 0.339 0.339 0 0 1 -0.153 -0.035 0.49 0.49 0 0 1 -0.13 -0.21 l-0.02 -0.07 -0.045 0.058 a0.268 0.268 0 0 0 -0.066 0.2 v0.019 a0.275 0.275 0 0 0 0.034 0.117 0.361 0.361 0 0 1 -0.172 -0.076 0.712 0.712 0 0 1 -0.106 -0.23 l-0.017 -0.058 L11.8 7 a0.316 0.316 0 0 0 -0.1 0.208 0.28 0.28 0 0 0 0.033 0.133 v0.011 a0.429 0.429 0 0 1 -0.173 -0.1 0.654 0.654 0 0 1 -0.085 -0.233 l-0.007 -0.038 -0.039 0.009 -0.253 0.065 c-0.331 0.085 -0.832 0.214 -1.159 0.285 h-0.023 c-0.306 0.066 -0.767 0.166 -1.093 0.211 a2.8 2.8 0 0 1 -1.337 -0.07 c-0.185 -0.065 -0.255 -0.127 -0.3 -0.265 a0.326 0.326 0 0 1 0.089 -0.284 1.139 1.139 0 0 1 0.572 -0.3 9.122 9.122 0 0 1 1.029 -0.213 3.56 3.56 0 0 1 0.947 0.009 c0.057 0.007 0.111 0.014 0.166 0.019 a0.61 0.61 0 0 0 0.427 -0.09 l0.013 -0.013 a0.157 0.157 0 0 0 0.054 -0.162 0.256 0.256 0 0 1 0.1 0.093 0.263 0.263 0 0 1 -0.006 0.151 l-0.024 0.06 0.063 -0.008 a1.127 1.127 0 0 0 0.512 -0.176 l0.077 -0.077 a0.577 0.577 0 0 1 -0.391 0.4 1.634 1.634 0 0 1 -0.718 0.105 3.435 3.435 0 0 1 -0.439 -0.079 l-0.13 -0.032 0.095 0.1 a0.188 0.188 0 0 1 0.075 0.154 c-0.008 0.042 -0.049 0.083 -0.118 0.121 0 -0.06 -0.009 -0.134 -0.066 -0.153 a0.55 0.55 0 0 0 -0.438 0.1 0.784 0.784 0 0 1 -0.338 0.082 1.15 1.15 0 0 1 -0.415 -0.046 1.068 1.068 0 0 1 -0.13 -0.06 0.436 0.436 0 0 0 -0.228 -0.079 l-0.063 0.012 a0.593 0.593 0 0 0 -0.391 0.172 0.171 0.171 0 0 0 0 0.188 0.506 0.506 0 0 0 0.341 0.178 2.7 2.7 0 0 0 1 0 c0.208 -0.034 0.438 -0.085 0.661 -0.135 0.158 -0.035 0.322 -0.071 0.471 -0.1 0.212 -0.04 0.583 -0.144 0.91 -0.236 0.225 -0.063 0.419 -0.117 0.527 -0.141 a4.124 4.124 0 0 1 1.036 -0.128 h0.019 a0.865 0.865 0 0 1 0.636 0.2 0.5 0.5 0 0 1 0.133 0.372 c-0.01 0.309 -0.367 0.461 -0.677 0.558 a4.745 4.745 0 0 1 -1.469 0.108 c-0.125 0 -0.242 -0.006 -0.346 -0.006 h-0.121 l0.1 0.067 0.242 0.173 a0.468 0.468 0 0 1 0.087 0.094 0.338 0.338 0 0 0 0.168 0.142 0.76 0.76 0 0 0 0.358 -0.029 1.26 1.26 0 0 1 0.183 -0.035 c0.214 -0.016 0.582 0 0.585 0 h0.016 l0.021 -0.02 a0.3 0.3 0 0 1 0.125 -0.089 0.264 0.264 0 0 1 0.121 0 c0.06 0.019 0.083 0.083 0.064 0.181 v0.017 l0.011 0.014 a0.263 0.263 0 0 0 0.142 0.081 0.793 0.793 0 0 0 0.127 0.006 0.285 0.285 0 0 1 0.076 0 0.7 0.7 0 0 1 0.1 0.036 0.6 0.6 0 0 0 -0.09 0.039 0.4 0.4 0 0 0 -0.091 0.094 l-0.041 0.059 h0.072 a0.936 0.936 0 0 1 0.223 0.022 0.283 0.283 0 0 1 0.071 0.042 0.211 0.211 0 0 0 -0.079 0.026 0.691 0.691 0 0 0 -0.1 0.085 l-0.074 0.073 0.1 -0.01 a0.476 0.476 0 0 1 0.236 0.025 0.655 0.655 0 0 1 0.069 0.061 0.46 0.46 0 0 0 -0.082 0.012 0.489 0.489 0 0 0 -0.1 0.048 l-0.06 0.038 0.065 0.028 a0.619 0.619 0 0 1 0.183 0.121 0.231 0.231 0 0 1 0.04 0.088 c-0.022 -0.011 -0.045 -0.023 -0.064 -0.03 a0.339 0.339 0 0 0 -0.115 -0.01 h-0.041 l0.044 0.307 a0.278 0.278 0 0 0 0.087 0.132 0.3 0.3 0 0 1 0.049 0.06 c0.019 0.05 0.018 0.061 -0.016 0.11 a0.243 0.243 0 0 1 -0.221 0.063 0.313 0.313 0 0 1 -0.11 -0.057 l-0.034 -0.026 -0.021 0.037 a0.519 0.519 0 0 1 -0.078 0.107 0.17 0.17 0 0 1 -0.144 0.051 0.2 0.2 0 0 1 -0.13 -0.056 0.439 0.439 0 0 1 -0.075 -0.16 l-0.008 -0.032 -0.22 0.044 a0.276 0.276 0 0 1 -0.137 -0.056 0.147 0.147 0 0 1 0.012 -0.167 0.341 0.341 0 0 1 0.149 -0.056 0.663 0.663 0 0 0 0.11 -0.031 0.619 0.619 0 0 0 0.2 -0.171 l0.026 -0.028 -0.034 -0.021 a4.557 4.557 0 0 1 -0.449 -0.333 2.842 2.842 0 0 1 -0.2 -0.235 l-0.016 -0.02 -0.024 0.007 s-0.394 0.116 -0.539 0.14 a3.143 3.143 0 0 1 -0.757 0.018 h-0.013 a1.34 1.34 0 0 1 -0.81 -0.467 c-0.06 -0.055 -0.122 -0.1 -0.184 -0.158 m2.023 -0.931 a0.467 0.467 0 0 0 -0.037 -0.09 0.209 0.209 0 0 1 -0.026 -0.1 0.221 0.221 0 0 1 0.032 -0.1 0.57 0.57 0 0 0 0.1 0.2 0.536 0.536 0 0 0 0.3 0.108 h0.086 l-0.056 -0.065 a0.213 0.213 0 0 1 -0.069 -0.147 v-0.021 a0.167 0.167 0 0 1 0.013 -0.085 0.425 0.425 0 0 0 0.126 0.182 0.629 0.629 0 0 0 0.312 0.048 l0.133 -0.009 -0.119 -0.062 a0.422 0.422 0 0 1 -0.122 -0.1 0.1 0.1 0 0 1 -0.031 -0.088 c0.005 -0.047 0.093 -0.1 0.167 -0.117 a0.344 0.344 0 0 1 0.333 0.083 0.187 0.187 0 0 1 0.058 0.242 c-0.183 0.3 -0.746 0.333 -1.156 0.358 -0.063 0 -0.123 0.007 -0.177 0.012 a4.051 4.051 0 0 1 -0.54 0 l-0.224 -0.01 a4.459 4.459 0 0 1 -0.487 -0.048 4.812 4.812 0 0 0 -0.53 -0.051 h-0.085 a5 5 0 0 0 -0.536 0.034 c0.249 -0.047 0.51 -0.1 0.707 -0.146 h0.023 c0.329 -0.071 0.83 -0.2 1.162 -0.286 l0.215 -0.055 a0.64 0.64 0 0 0 0.093 0.229 0.637 0.637 0 0 0 0.281 0.144 l0.06 0.015z
    path(
        fill = SolidColor(Color(0xFF806600)),
    ) {
        // M 13.614 9.475
        moveTo(x = 13.614f, y = 9.475f)
        // l 0.066 0.042
        lineToRelative(dx = 0.066f, dy = 0.042f)
        // l -0.009 -0.078
        lineToRelative(dx = -0.009f, dy = -0.078f)
        // a 0.441 0.441 0 0 0 -0.072 -0.206
        arcToRelative(
            a = 0.441f,
            b = 0.441f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.072f,
            dy1 = -0.206f,
        )
        // a 0.528 0.528 0 0 0 -0.144 -0.108
        arcToRelative(
            a = 0.528f,
            b = 0.528f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.144f,
            dy1 = -0.108f,
        )
        // l 0.017 -0.007
        lineToRelative(dx = 0.017f, dy = -0.007f)
        // a 0.771 0.771 0 0 1 0.145 -0.013
        arcToRelative(
            a = 0.771f,
            b = 0.771f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.145f,
            dy1 = -0.013f,
        )
        // h 0.083
        horizontalLineToRelative(dx = 0.083f)
        // l -0.053 -0.062
        lineToRelative(dx = -0.053f, dy = -0.062f)
        // a 1.043 1.043 0 0 0 -0.136 -0.13
        arcToRelative(
            a = 1.043f,
            b = 1.043f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.136f,
            dy1 = -0.13f,
        )
        // a 0.342 0.342 0 0 0 -0.181 -0.042
        arcToRelative(
            a = 0.342f,
            b = 0.342f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.181f,
            dy1 = -0.042f,
        )
        // l 0.011 -0.007
        lineToRelative(dx = 0.011f, dy = -0.007f)
        // a 0.309 0.309 0 0 1 0.127 -0.019
        arcToRelative(
            a = 0.309f,
            b = 0.309f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.127f,
            dy1 = -0.019f,
        )
        // h 0.085
        horizontalLineToRelative(dx = 0.085f)
        // l -0.053 -0.062
        lineToRelative(dx = -0.053f, dy = -0.062f)
        // a 0.487 0.487 0 0 0 -0.161 -0.12
        arcToRelative(
            a = 0.487f,
            b = 0.487f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.161f,
            dy1 = -0.12f,
        )
        // a 0.675 0.675 0 0 0 -0.17 -0.025
        arcToRelative(
            a = 0.675f,
            b = 0.675f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.17f,
            dy1 = -0.025f,
        )
        // a 0.075 0.075 0 0 1 0.018 -0.015
        arcToRelative(
            a = 0.075f,
            b = 0.075f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.018f,
            dy1 = -0.015f,
        )
        // a 1.084 1.084 0 0 1 0.163 -0.063
        arcToRelative(
            a = 1.084f,
            b = 1.084f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.163f,
            dy1 = -0.063f,
        )
        // l 0.087 -0.026
        lineToRelative(dx = 0.087f, dy = -0.026f)
        // l -0.081 -0.042
        lineToRelative(dx = -0.081f, dy = -0.042f)
        // a 1.266 1.266 0 0 0 -0.2 -0.082
        arcToRelative(
            a = 1.266f,
            b = 1.266f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.2f,
            dy1 = -0.082f,
        )
        // a 0.4 0.4 0 0 0 -0.1 -0.005
        arcToRelative(
            a = 0.4f,
            b = 0.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.1f,
            dy1 = -0.005f,
        )
        // a 0.621 0.621 0 0 1 -0.114 0
        arcToRelative(
            a = 0.621f,
            b = 0.621f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.114f,
            dy1 = 0.0f,
        )
        // a 0.178 0.178 0 0 1 -0.085 -0.045
        arcToRelative(
            a = 0.178f,
            b = 0.178f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.085f,
            dy1 = -0.045f,
        )
        // c 0.027 -0.185 -0.083 -0.235 -0.118 -0.246
        curveToRelative(
            dx1 = 0.027f,
            dy1 = -0.185f,
            dx2 = -0.083f,
            dy2 = -0.235f,
            dx3 = -0.118f,
            dy3 = -0.246f,
        )
        // a 0.354 0.354 0 0 0 -0.165 0
        arcToRelative(
            a = 0.354f,
            b = 0.354f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.165f,
            dy1 = 0.0f,
        )
        // a 0.373 0.373 0 0 0 -0.154 0.105
        arcToRelative(
            a = 0.373f,
            b = 0.373f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.154f,
            dy1 = 0.105f,
        )
        // c -0.074 0 -0.383 -0.012 -0.577 0
        curveToRelative(
            dx1 = -0.074f,
            dy1 = 0.0f,
            dx2 = -0.383f,
            dy2 = -0.012f,
            dx3 = -0.577f,
            dy3 = 0.0f,
        )
        // a 1.336 1.336 0 0 0 -0.2 0.036
        arcToRelative(
            a = 1.336f,
            b = 1.336f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.2f,
            dy1 = 0.036f,
        )
        // a 0.723 0.723 0 0 1 -0.32 0.031
        arcToRelative(
            a = 0.723f,
            b = 0.723f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.32f,
            dy1 = 0.031f,
        )
        // a 0.285 0.285 0 0 1 -0.13 -0.116
        arcToRelative(
            a = 0.285f,
            b = 0.285f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.13f,
            dy1 = -0.116f,
        )
        // a 0.509 0.509 0 0 0 -0.1 -0.11
        arcToRelative(
            a = 0.509f,
            b = 0.509f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.1f,
            dy1 = -0.11f,
        )
        // l -0.146 -0.1
        lineToRelative(dx = -0.146f, dy = -0.1f)
        // l 0.23 0.006
        lineToRelative(dx = 0.23f, dy = 0.006f)
        // a 4.854 4.854 0 0 0 1.493 -0.111
        arcToRelative(
            a = 4.854f,
            b = 4.854f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.493f,
            dy1 = -0.111f,
        )
        // c 0.334 -0.1 0.718 -0.271 0.73 -0.627
        curveToRelative(
            dx1 = 0.334f,
            dy1 = -0.1f,
            dx2 = 0.718f,
            dy2 = -0.271f,
            dx3 = 0.73f,
            dy3 = -0.627f,
        )
        // a 0.572 0.572 0 0 0 -0.154 -0.427
        arcToRelative(
            a = 0.572f,
            b = 0.572f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.154f,
            dy1 = -0.427f,
        )
        // a 0.939 0.939 0 0 0 -0.709 -0.221
        arcToRelative(
            a = 0.939f,
            b = 0.939f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.709f,
            dy1 = -0.221f,
        )
        // a 4.149 4.149 0 0 0 -1.052 0.129
        arcToRelative(
            a = 4.149f,
            b = 4.149f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.052f,
            dy1 = 0.129f,
        )
        // c -0.11 0.025 -0.305 0.079 -0.531 0.142
        curveToRelative(
            dx1 = -0.11f,
            dy1 = 0.025f,
            dx2 = -0.305f,
            dy2 = 0.079f,
            dx3 = -0.531f,
            dy3 = 0.142f,
        )
        // c -0.326 0.092 -0.7 0.195 -0.9 0.235
        curveToRelative(
            dx1 = -0.326f,
            dy1 = 0.092f,
            dx2 = -0.7f,
            dy2 = 0.195f,
            dx3 = -0.9f,
            dy3 = 0.235f,
        )
        // c -0.15 0.029 -0.315 0.065 -0.473 0.1
        curveToRelative(
            dx1 = -0.15f,
            dy1 = 0.029f,
            dx2 = -0.315f,
            dy2 = 0.065f,
            dx3 = -0.473f,
            dy3 = 0.1f,
        )
        // c -0.222 0.049 -0.451 0.1 -0.657 0.134
        curveToRelative(
            dx1 = -0.222f,
            dy1 = 0.049f,
            dx2 = -0.451f,
            dy2 = 0.1f,
            dx3 = -0.657f,
            dy3 = 0.134f,
        )
        // a 2.646 2.646 0 0 1 -0.977 0
        arcToRelative(
            a = 2.646f,
            b = 2.646f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.977f,
            dy1 = 0.0f,
        )
        // a 0.457 0.457 0 0 1 -0.293 -0.147
        arcToRelative(
            a = 0.457f,
            b = 0.457f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.293f,
            dy1 = -0.147f,
        )
        // a 0.1 0.1 0 0 1 0 -0.1
        arcToRelative(
            a = 0.1f,
            b = 0.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -0.1f,
        )
        // A 0.546 0.546 0 0 1 8 6.924
        arcTo(
            horizontalEllipseRadius = 0.546f,
            verticalEllipseRadius = 0.546f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 8.0f,
            y1 = 6.924f,
        )
        // l 0.064 -0.012
        lineToRelative(dx = 0.064f, dy = -0.012f)
        // a 0.472 0.472 0 0 1 0.179 0.071
        arcToRelative(
            a = 0.472f,
            b = 0.472f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.179f,
            dy1 = 0.071f,
        )
        // a 0.993 0.993 0 0 0 0.142 0.065
        arcToRelative(
            a = 0.993f,
            b = 0.993f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.142f,
            dy1 = 0.065f,
        )
        // a 1.209 1.209 0 0 0 0.44 0.05
        arcToRelative(
            a = 1.209f,
            b = 1.209f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.44f,
            dy1 = 0.05f,
        )
        // a 0.879 0.879 0 0 0 0.375 -0.092
        arcToRelative(
            a = 0.879f,
            b = 0.879f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.375f,
            dy1 = -0.092f,
        )
        // a 0.493 0.493 0 0 1 0.378 -0.1
        arcToRelative(
            a = 0.493f,
            b = 0.493f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.378f,
            dy1 = -0.1f,
        )
        // a 0.206 0.206 0 0 1 0.01 0.139
        arcToRelative(
            a = 0.206f,
            b = 0.206f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.01f,
            dy1 = 0.139f,
        )
        // l -0.01 0.066
        lineToRelative(dx = -0.01f, dy = 0.066f)
        // l 0.062 -0.026
        lineToRelative(dx = 0.062f, dy = -0.026f)
        // c 0.13 -0.055 0.2 -0.124 0.219 -0.2
        curveToRelative(
            dx1 = 0.13f,
            dy1 = -0.055f,
            dx2 = 0.2f,
            dy2 = -0.124f,
            dx3 = 0.219f,
            dy3 = -0.2f,
        )
        // a 0.2 0.2 0 0 0 -0.027 -0.135
        arcToRelative(
            a = 0.2f,
            b = 0.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.027f,
            dy1 = -0.135f,
        )
        // a 2.488 2.488 0 0 0 0.349 0.057
        arcToRelative(
            a = 2.488f,
            b = 2.488f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.349f,
            dy1 = 0.057f,
        )
        // a 1.708 1.708 0 0 0 0.751 -0.11
        arcToRelative(
            a = 1.708f,
            b = 1.708f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.751f,
            dy1 = -0.11f,
        )
        // a 0.637 0.637 0 0 0 0.453 -0.574
        arcToRelative(
            a = 0.637f,
            b = 0.637f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.453f,
            dy1 = -0.574f,
        )
        // l 0.008 -0.1
        lineToRelative(dx = 0.008f, dy = -0.1f)
        // l -0.229 0.228
        lineToRelative(dx = -0.229f, dy = 0.228f)
        // a 0.989 0.989 0 0 1 -0.415 0.146
        arcToRelative(
            a = 0.989f,
            b = 0.989f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.415f,
            dy1 = 0.146f,
        )
        // a 0.24 0.24 0 0 0 -0.014 -0.161
        arcToRelative(
            a = 0.24f,
            b = 0.24f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.014f,
            dy1 = -0.161f,
        )
        // a 0.3 0.3 0 0 0 -0.242 -0.151
        arcToRelative(
            a = 0.3f,
            b = 0.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.242f,
            dy1 = -0.151f,
        )
        // L 10.4 6.085
        lineTo(x = 10.4f, y = 6.085f)
        // l 0.056 0.062
        lineToRelative(dx = 0.056f, dy = 0.062f)
        // c 0.068 0.075 0.043 0.1 0 0.147
        curveToRelative(
            dx1 = 0.068f,
            dy1 = 0.075f,
            dx2 = 0.043f,
            dy2 = 0.1f,
            dx3 = 0.0f,
            dy3 = 0.147f,
        )
        // l -0.014 0.015
        lineToRelative(dx = -0.014f, dy = 0.015f)
        // a 0.558 0.558 0 0 1 -0.365 0.065
        arcToRelative(
            a = 0.558f,
            b = 0.558f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.365f,
            dy1 = 0.065f,
        )
        // c -0.053 0 -0.106 -0.012 -0.163 -0.019
        curveToRelative(
            dx1 = -0.053f,
            dy1 = 0.0f,
            dx2 = -0.106f,
            dy2 = -0.012f,
            dx3 = -0.163f,
            dy3 = -0.019f,
        )
        // a 3.642 3.642 0 0 0 -0.964 -0.009
        arcToRelative(
            a = 3.642f,
            b = 3.642f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.964f,
            dy1 = -0.009f,
        )
        // a 9.327 9.327 0 0 0 -1.04 0.215
        arcToRelative(
            a = 9.327f,
            b = 9.327f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.04f,
            dy1 = 0.215f,
        )
        // a 1.2 1.2 0 0 0 -0.609 0.323
        arcToRelative(
            a = 1.2f,
            b = 1.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.609f,
            dy1 = 0.323f,
        )
        // a 0.4 0.4 0 0 0 -0.1 0.357
        arcToRelative(
            a = 0.4f,
            b = 0.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.1f,
            dy1 = 0.357f,
        )
        // a 0.465 0.465 0 0 0 0.346 0.313
        arcToRelative(
            a = 0.465f,
            b = 0.465f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.346f,
            dy1 = 0.313f,
        )
        // a 2.231 2.231 0 0 0 0.686 0.118
        arcToRelative(
            a = 2.231f,
            b = 2.231f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.686f,
            dy1 = 0.118f,
        )
        // c -0.772 0.073 -1.686 0.156 -1.7 0.157
        curveToRelative(
            dx1 = -0.772f,
            dy1 = 0.073f,
            dx2 = -1.686f,
            dy2 = 0.156f,
            dx3 = -1.7f,
            dy3 = 0.157f,
        )
        // l -0.59 0.054
        lineToRelative(dx = -0.59f, dy = 0.054f)
        // A 10.2 10.2 0 0 0 4.772 7.8
        arcTo(
            horizontalEllipseRadius = 10.2f,
            verticalEllipseRadius = 10.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 4.772f,
            y1 = 7.8f,
        )
        // h -0.028
        horizontalLineToRelative(dx = -0.028f)
        // a 1.139 1.139 0 0 1 -0.181 0
        arcToRelative(
            a = 1.139f,
            b = 1.139f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.181f,
            dy1 = 0.0f,
        )
        // L 4.4 7.793
        lineTo(x = 4.4f, y = 7.793f)
        // h -0.037
        horizontalLineToRelative(dx = -0.037f)
        // v 0.344
        verticalLineToRelative(dy = 0.344f)
        // a 6.226 6.226 0 0 0 -0.364 -0.207
        arcToRelative(
            a = 6.226f,
            b = 6.226f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.364f,
            dy1 = -0.207f,
        )
        // c -0.246 -0.123 -0.746 -0.323 -0.813 -0.35
        curveToRelative(
            dx1 = -0.246f,
            dy1 = -0.123f,
            dx2 = -0.746f,
            dy2 = -0.323f,
            dx3 = -0.813f,
            dy3 = -0.35f,
        )
        // a 0.483 0.483 0 0 1 -0.136 -0.226
        arcToRelative(
            a = 0.483f,
            b = 0.483f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.136f,
            dy1 = -0.226f,
        )
        // a 0.274 0.274 0 0 1 0.034 -0.131
        arcToRelative(
            a = 0.274f,
            b = 0.274f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.034f,
            dy1 = -0.131f,
        )
        // a 0.386 0.386 0 0 0 0.032 -0.088
        arcToRelative(
            a = 0.386f,
            b = 0.386f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.032f,
            dy1 = -0.088f,
        )
        // a 0.24 0.24 0 0 0 -0.044 -0.164
        arcToRelative(
            a = 0.24f,
            b = 0.24f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.044f,
            dy1 = -0.164f,
        )
        // a 0.216 0.216 0 0 0 -0.272 -0.037
        arcToRelative(
            a = 0.216f,
            b = 0.216f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.272f,
            dy1 = -0.037f,
        )
        // a 0.514 0.514 0 0 0 -0.122 0.12
        arcToRelative(
            a = 0.514f,
            b = 0.514f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.122f,
            dy1 = 0.12f,
        )
        // a 0.245 0.245 0 0 0 -0.372 -0.037
        arcToRelative(
            a = 0.245f,
            b = 0.245f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.372f,
            dy1 = -0.037f,
        )
        // a 0.318 0.318 0 0 0 -0.133 0.235
        arcToRelative(
            a = 0.318f,
            b = 0.318f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.133f,
            dy1 = 0.235f,
        )
        // a 0.241 0.241 0 0 0 0.058 0.156
        arcToRelative(
            a = 0.241f,
            b = 0.241f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.058f,
            dy1 = 0.156f,
        )
        // a 0.258 0.258 0 0 0 -0.16 0.117
        arcToRelative(
            a = 0.258f,
            b = 0.258f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.16f,
            dy1 = 0.117f,
        )
        // a 0.255 0.255 0 0 0 -0.009 0.223
        arcToRelative(
            a = 0.255f,
            b = 0.255f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.009f,
            dy1 = 0.223f,
        )
        // a 0.314 0.314 0 0 0 0.244 0.177
        arcToRelative(
            a = 0.314f,
            b = 0.314f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.244f,
            dy1 = 0.177f,
        )
        // a 0.415 0.415 0 0 0 0.121 -0.012
        arcToRelative(
            a = 0.415f,
            b = 0.415f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.121f,
            dy1 = -0.012f,
        )
        // c 0.078 -0.015 0.146 -0.028 0.208 0.038
        curveToRelative(
            dx1 = 0.078f,
            dy1 = -0.015f,
            dx2 = 0.146f,
            dy2 = -0.028f,
            dx3 = 0.208f,
            dy3 = 0.038f,
        )
        // l 0.069 0.074
        lineToRelative(dx = 0.069f, dy = 0.074f)
        // a 0.6 0.6 0 0 1 -0.223 0.119
        arcToRelative(
            a = 0.6f,
            b = 0.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.223f,
            dy1 = 0.119f,
        )
        // l -0.081 0.032
        lineToRelative(dx = -0.081f, dy = 0.032f)
        // l 0.084 0.037
        lineToRelative(dx = 0.084f, dy = 0.037f)
        // a 1.429 1.429 0 0 0 0.336 0.1
        arcToRelative(
            a = 1.429f,
            b = 1.429f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.336f,
            dy1 = 0.1f,
        )
        // a 0.623 0.623 0 0 0 0.179 -0.024
        arcToRelative(
            a = 0.623f,
            b = 0.623f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.179f,
            dy1 = -0.024f,
        )
        // a 0.474 0.474 0 0 1 -0.147 0.08
        arcToRelative(
            a = 0.474f,
            b = 0.474f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.147f,
            dy1 = 0.08f,
        )
        // l -0.088 0.031
        lineToRelative(dx = -0.088f, dy = 0.031f)
        // l 0.081 0.037
        lineToRelative(dx = 0.081f, dy = 0.037f)
        // a 0.994 0.994 0 0 0 0.267 0.085
        arcToRelative(
            a = 0.994f,
            b = 0.994f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.267f,
            dy1 = 0.085f,
        )
        // a 0.706 0.706 0 0 0 0.176 -0.022
        arcToRelative(
            a = 0.706f,
            b = 0.706f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.176f,
            dy1 = -0.022f,
        )
        // a 0.487 0.487 0 0 1 -0.081 0.046
        arcToRelative(
            a = 0.487f,
            b = 0.487f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.081f,
            dy1 = 0.046f,
        )
        // a 0.577 0.577 0 0 0 -0.055 0.029
        arcToRelative(
            a = 0.577f,
            b = 0.577f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.055f,
            dy1 = 0.029f,
        )
        // l -0.068 0.039
        lineToRelative(dx = -0.068f, dy = 0.039f)
        // l 0.073 0.028
        lineToRelative(dx = 0.073f, dy = 0.028f)
        // a 1.462 1.462 0 0 0 0.3 0.082
        arcToRelative(
            a = 1.462f,
            b = 1.462f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.3f,
            dy1 = 0.082f,
        )
        // a 1.035 1.035 0 0 0 0.207 -0.014
        arcToRelative(
            a = 1.035f,
            b = 1.035f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.207f,
            dy1 = -0.014f,
        )
        // a 0.566 0.566 0 0 1 -0.145 0.085
        arcToRelative(
            a = 0.566f,
            b = 0.566f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.145f,
            dy1 = 0.085f,
        )
        // l -0.079 0.036
        lineToRelative(dx = -0.079f, dy = 0.036f)
        // l 0.081 0.032
        lineToRelative(dx = 0.081f, dy = 0.032f)
        // a 0.854 0.854 0 0 0 0.3 0.066
        arcToRelative(
            a = 0.854f,
            b = 0.854f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.3f,
            dy1 = 0.066f,
        )
        // a 1.137 1.137 0 0 0 0.29 -0.092
        arcToRelative(
            a = 1.137f,
            b = 1.137f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.29f,
            dy1 = -0.092f,
        )
        // c 0.013 0.012 0.042 0.031 0.065 0.048
        curveToRelative(
            dx1 = 0.013f,
            dy1 = 0.012f,
            dx2 = 0.042f,
            dy2 = 0.031f,
            dx3 = 0.065f,
            dy3 = 0.048f,
        )
        // c -0.131 0.029 -0.28 0.064 -0.361 0.092
        curveToRelative(
            dx1 = -0.131f,
            dy1 = 0.029f,
            dx2 = -0.28f,
            dy2 = 0.064f,
            dx3 = -0.361f,
            dy3 = 0.092f,
        )
        // a 5.949 5.949 0 0 0 -0.72 0.34
        arcToRelative(
            a = 5.949f,
            b = 5.949f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.72f,
            dy1 = 0.34f,
        )
        // a 0.639 0.639 0 0 1 -0.295 -0.043
        arcToRelative(
            a = 0.639f,
            b = 0.639f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.295f,
            dy1 = -0.043f,
        )
        // a 0.281 0.281 0 0 1 -0.092 -0.1
        arcToRelative(
            a = 0.281f,
            b = 0.281f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.092f,
            dy1 = -0.1f,
        )
        // a 0.43 0.43 0 0 0 -0.058 -0.074
        arcToRelative(
            a = 0.43f,
            b = 0.43f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.058f,
            dy1 = -0.074f,
        )
        // a 0.3 0.3 0 0 0 -0.165 -0.068
        arcToRelative(
            a = 0.3f,
            b = 0.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.165f,
            dy1 = -0.068f,
        )
        // a 0.2 0.2 0 0 0 -0.211 0.171
        arcToRelative(
            a = 0.2f,
            b = 0.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.211f,
            dy1 = 0.171f,
        )
        // a 0.384 0.384 0 0 0 0.01 0.13
        arcToRelative(
            a = 0.384f,
            b = 0.384f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.01f,
            dy1 = 0.13f,
        )
        // a 0.3 0.3 0 0 0 -0.2 0.07
        arcToRelative(
            a = 0.3f,
            b = 0.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.2f,
            dy1 = 0.07f,
        )
        // a 0.25 0.25 0 0 0 -0.062 0.189
        arcToRelative(
            a = 0.25f,
            b = 0.25f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.062f,
            dy1 = 0.189f,
        )
        // a 0.27 0.27 0 0 0 0.1 0.2
        arcToRelative(
            a = 0.27f,
            b = 0.27f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.1f,
            dy1 = 0.2f,
        )
        // a 0.359 0.359 0 0 0 0.234 0.081
        arcToRelative(
            a = 0.359f,
            b = 0.359f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.234f,
            dy1 = 0.081f,
        )
        // a 0.243 0.243 0 0 0 -0.019 0.194
        arcToRelative(
            a = 0.243f,
            b = 0.243f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.019f,
            dy1 = 0.194f,
        )
        // a 0.235 0.235 0 0 0 0.159 0.144
        arcToRelative(
            a = 0.235f,
            b = 0.235f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.159f,
            dy1 = 0.144f,
        )
        // a 0.372 0.372 0 0 0 0.309 -0.06
        arcToRelative(
            a = 0.372f,
            b = 0.372f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.309f,
            dy1 = -0.06f,
        )
        // a 0.357 0.357 0 0 0 0.07 -0.091
        arcToRelative(
            a = 0.357f,
            b = 0.357f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.07f,
            dy1 = -0.091f,
        )
        // a 0.187 0.187 0 0 1 0.171 -0.117
        arcToRelative(
            a = 0.187f,
            b = 0.187f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.171f,
            dy1 = -0.117f,
        )
        // h 0.117
        horizontalLineToRelative(dx = 0.117f)
        // a 0.446 0.446 0 0 1 -0.044 0.222
        arcToRelative(
            a = 0.446f,
            b = 0.446f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.044f,
            dy1 = 0.222f,
        )
        // l -0.029 0.079
        lineToRelative(dx = -0.029f, dy = 0.079f)
        // l 0.078 -0.032
        lineToRelative(dx = 0.078f, dy = -0.032f)
        // a 1.454 1.454 0 0 0 0.312 -0.166
        arcToRelative(
            a = 1.454f,
            b = 1.454f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.312f,
            dy1 = -0.166f,
        )
        // a 0.571 0.571 0 0 0 0.1 -0.15
        arcToRelative(
            a = 0.571f,
            b = 0.571f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.1f,
            dy1 = -0.15f,
        )
        // a 0.323 0.323 0 0 1 -0.025 0.158
        arcToRelative(
            a = 0.323f,
            b = 0.323f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.025f,
            dy1 = 0.158f,
        )
        // l -0.028 0.077
        lineToRelative(dx = -0.028f, dy = 0.077f)
        // l 0.076 -0.029
        lineToRelative(dx = 0.076f, dy = -0.029f)
        // a 1.081 1.081 0 0 0 0.249 -0.131
        arcToRelative(
            a = 1.081f,
            b = 1.081f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.249f,
            dy1 = -0.131f,
        )
        // a 0.642 0.642 0 0 0 0.106 -0.149
        arcToRelative(
            a = 0.642f,
            b = 0.642f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.106f,
            dy1 = -0.149f,
        )
        // a 0.33 0.33 0 0 1 -0.013 0.1
        arcToRelative(
            a = 0.33f,
            b = 0.33f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.013f,
            dy1 = 0.1f,
        )
        // a 0.535 0.535 0 0 0 -0.011 0.055
        arcToRelative(
            a = 0.535f,
            b = 0.535f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.011f,
            dy1 = 0.055f,
        )
        // l -0.011 0.068
        lineToRelative(dx = -0.011f, dy = 0.068f)
        // l 0.061 -0.045
        lineToRelative(dx = 0.061f, dy = -0.045f)
        // a 1.462 1.462 0 0 0 0.266 -0.152
        arcToRelative(
            a = 1.462f,
            b = 1.462f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.266f,
            dy1 = -0.152f,
        )
        // a 0.844 0.844 0 0 0 0.132 -0.162
        arcToRelative(
            a = 0.844f,
            b = 0.844f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.132f,
            dy1 = -0.162f,
        )
        // a 0.385 0.385 0 0 1 -0.02 0.159
        arcToRelative(
            a = 0.385f,
            b = 0.385f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.02f,
            dy1 = 0.159f,
        )
        // l -0.021 0.076
        lineToRelative(dx = -0.021f, dy = 0.076f)
        // l 0.072 -0.032
        lineToRelative(dx = 0.072f, dy = -0.032f)
        // a 0.875 0.875 0 0 0 0.256 -0.165
        arcToRelative(
            a = 0.875f,
            b = 0.875f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.256f,
            dy1 = -0.165f,
        )
        // a 0.862 0.862 0 0 0 0.11 -0.254
        arcToRelative(
            a = 0.862f,
            b = 0.862f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.11f,
            dy1 = -0.254f,
        )
        // a 0.777 0.777 0 0 0 0.289 -0.064
        arcToRelative(
            a = 0.777f,
            b = 0.777f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.289f,
            dy1 = -0.064f,
        )
        // a 0.589 0.589 0 0 0 0.16 -0.205
        arcToRelative(
            a = 0.589f,
            b = 0.589f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.16f,
            dy1 = -0.205f,
        )
        // a 5.142 5.142 0 0 0 0.732 -0.094
        arcToRelative(
            a = 5.142f,
            b = 5.142f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.732f,
            dy1 = -0.094f,
        )
        // c 0.27 -0.071 0.794 -0.258 1.349 -0.456
        curveToRelative(
            dx1 = 0.27f,
            dy1 = -0.071f,
            dx2 = 0.794f,
            dy2 = -0.258f,
            dx3 = 1.349f,
            dy3 = -0.456f,
        )
        // a 50.06 50.06 0 0 1 1.2 -0.417
        arcToRelative(
            a = 50.06f,
            b = 50.06f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.2f,
            dy1 = -0.417f,
        )
        // c 0.113 0.064 0.162 0.123 0.157 0.168
        curveToRelative(
            dx1 = 0.113f,
            dy1 = 0.064f,
            dx2 = 0.162f,
            dy2 = 0.123f,
            dx3 = 0.157f,
            dy3 = 0.168f,
        )
        // a 0.17 0.17 0 0 1 -0.043 0.039
        arcToRelative(
            a = 0.17f,
            b = 0.17f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.043f,
            dy1 = 0.039f,
        )
        // a 0.435 0.435 0 0 0 -0.071 0.065
        arcToRelative(
            a = 0.435f,
            b = 0.435f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.071f,
            dy1 = 0.065f,
        )
        // a 0.145 0.145 0 0 0 0.024 0.168
        arcToRelative(
            a = 0.145f,
            b = 0.145f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.024f,
            dy1 = 0.168f,
        )
        // a 0.24 0.24 0 0 0 0.093 0.063
        arcToRelative(
            a = 0.24f,
            b = 0.24f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.093f,
            dy1 = 0.063f,
        )
        // a 0.158 0.158 0 0 1 0.059 0.036
        arcToRelative(
            a = 0.158f,
            b = 0.158f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.059f,
            dy1 = 0.036f,
        )
        // c 0.026 0.041 0.024 0.057 0.011 0.075
        curveToRelative(
            dx1 = 0.026f,
            dy1 = 0.041f,
            dx2 = 0.024f,
            dy2 = 0.057f,
            dx3 = 0.011f,
            dy3 = 0.075f,
        )
        // a 0.531 0.531 0 0 1 -0.22 0.1
        arcToRelative(
            a = 0.531f,
            b = 0.531f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.22f,
            dy1 = 0.1f,
        )
        // c -0.044 0.015 -0.086 0.028 -0.118 0.043
        curveToRelative(
            dx1 = -0.044f,
            dy1 = 0.015f,
            dx2 = -0.086f,
            dy2 = 0.028f,
            dx3 = -0.118f,
            dy3 = 0.043f,
        )
        // a 7.038 7.038 0 0 0 -0.466 0.249
        arcToRelative(
            a = 7.038f,
            b = 7.038f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.466f,
            dy1 = 0.249f,
        )
        // a 0.409 0.409 0 0 1 -0.139 -0.01
        arcToRelative(
            a = 0.409f,
            b = 0.409f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.139f,
            dy1 = -0.01f,
        )
        // l -0.107 -0.028
        lineToRelative(dx = -0.107f, dy = -0.028f)
        // a 0.447 0.447 0 0 1 -0.1 -0.052
        arcToRelative(
            a = 0.447f,
            b = 0.447f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.1f,
            dy1 = -0.052f,
        )
        // a 0.363 0.363 0 0 0 -0.176 -0.071
        arcToRelative(
            a = 0.363f,
            b = 0.363f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.176f,
            dy1 = -0.071f,
        )
        // h -0.002
        horizontalLineToRelative(dx = -0.002f)
        // a 0.278 0.278 0 0 0 -0.229 0.139
        arcToRelative(
            a = 0.278f,
            b = 0.278f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.229f,
            dy1 = 0.139f,
        )
        // a 0.13 0.13 0 0 0 -0.007 0.1
        arcToRelative(
            a = 0.13f,
            b = 0.13f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.007f,
            dy1 = 0.1f,
        )
        // a 0.234 0.234 0 0 0 0.069 0.129
        arcToRelative(
            a = 0.234f,
            b = 0.234f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.069f,
            dy1 = 0.129f,
        )
        // l 0.125 0.079
        lineToRelative(dx = 0.125f, dy = 0.079f)
        // a 0.389 0.389 0 0 0 -0.083 0.163
        arcToRelative(
            a = 0.389f,
            b = 0.389f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.083f,
            dy1 = 0.163f,
        )
        // a 0.214 0.214 0 0 0 0.075 0.169
        arcToRelative(
            a = 0.214f,
            b = 0.214f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.075f,
            dy1 = 0.169f,
        )
        // l 0.013 0.013
        lineToRelative(dx = 0.013f, dy = 0.013f)
        // a 0.211 0.211 0 0 0 0.158 0.083
        arcToRelative(
            a = 0.211f,
            b = 0.211f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.158f,
            dy1 = 0.083f,
        )
        // a 0.646 0.646 0 0 0 0.136 -0.01
        arcToRelative(
            a = 0.646f,
            b = 0.646f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.136f,
            dy1 = -0.01f,
        )
        // a 0.224 0.224 0 0 0 0.034 0.107
        arcToRelative(
            a = 0.224f,
            b = 0.224f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.034f,
            dy1 = 0.107f,
        )
        // a 0.317 0.317 0 0 0 0.249 0.14
        arcToRelative(
            a = 0.317f,
            b = 0.317f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.249f,
            dy1 = 0.14f,
        )
        // h 0.031
        horizontalLineToRelative(dx = 0.031f)
        // a 0.2 0.2 0 0 0 0.171 -0.1
        arcToRelative(
            a = 0.2f,
            b = 0.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.171f,
            dy1 = -0.1f,
        )
        // a 0.3 0.3 0 0 0 0.032 -0.1
        arcToRelative(
            a = 0.3f,
            b = 0.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.032f,
            dy1 = -0.1f,
        )
        // a 0.208 0.208 0 0 1 0.038 -0.106
        arcToRelative(
            a = 0.208f,
            b = 0.208f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.038f,
            dy1 = -0.106f,
        )
        // l 0.192 -0.18
        lineToRelative(dx = 0.192f, dy = -0.18f)
        // c 0.05 0.038 0.054 0.09 0.045 0.171
        curveToRelative(
            dx1 = 0.05f,
            dy1 = 0.038f,
            dx2 = 0.054f,
            dy2 = 0.09f,
            dx3 = 0.045f,
            dy3 = 0.171f,
        )
        // l -0.009 0.079
        lineToRelative(dx = -0.009f, dy = 0.079f)
        // l 0.066 -0.043
        lineToRelative(dx = 0.066f, dy = -0.043f)
        // a 0.8 0.8 0 0 0 0.19 -0.164
        arcToRelative(
            a = 0.8f,
            b = 0.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.19f,
            dy1 = -0.164f,
        )
        // a 0.475 0.475 0 0 0 0.051 -0.161
        arcToRelative(
            a = 0.475f,
            b = 0.475f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.051f,
            dy1 = -0.161f,
        )
        // a 0.171 0.171 0 0 1 0.042 0.155
        arcToRelative(
            a = 0.171f,
            b = 0.171f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.042f,
            dy1 = 0.155f,
        )
        // l -0.015 0.084
        lineToRelative(dx = -0.015f, dy = 0.084f)
        // l 0.072 -0.046
        lineToRelative(dx = 0.072f, dy = -0.046f)
        // a 0.9 0.9 0 0 0 0.2 -0.163
        arcToRelative(
            a = 0.9f,
            b = 0.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.2f,
            dy1 = -0.163f,
        )
        // a 0.654 0.654 0 0 0 0.075 -0.163
        arcToRelative(
            a = 0.654f,
            b = 0.654f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.075f,
            dy1 = -0.163f,
        )
        // a 0.267 0.267 0 0 1 0.01 0.169
        arcToRelative(
            a = 0.267f,
            b = 0.267f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.01f,
            dy1 = 0.169f,
        )
        // l -0.019 0.09
        lineToRelative(dx = -0.019f, dy = 0.09f)
        // l 0.077 -0.049
        lineToRelative(dx = 0.077f, dy = -0.049f)
        // a 0.764 0.764 0 0 0 0.21 -0.208
        arcToRelative(
            a = 0.764f,
            b = 0.764f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.21f,
            dy1 = -0.208f,
        )
        // a 0.745 0.745 0 0 0 0.047 -0.163
        arcToRelative(
            a = 0.745f,
            b = 0.745f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.047f,
            dy1 = -0.163f,
        )
        // c 0.2 0 0.323 -0.1 0.331 -0.2
        curveToRelative(
            dx1 = 0.2f,
            dy1 = 0.0f,
            dx2 = 0.323f,
            dy2 = -0.1f,
            dx3 = 0.331f,
            dy3 = -0.2f,
        )
        // c 0.006 -0.083 -0.079 -0.185 -0.247 -0.214
        curveToRelative(
            dx1 = 0.006f,
            dy1 = -0.083f,
            dx2 = -0.079f,
            dy2 = -0.185f,
            dx3 = -0.247f,
            dy3 = -0.214f,
        )
        // a 0.693 0.693 0 0 1 -0.07 -0.124
        arcToRelative(
            a = 0.693f,
            b = 0.693f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.07f,
            dy1 = -0.124f,
        )
        // a 0.155 0.155 0 0 1 0 -0.108
        arcToRelative(
            a = 0.155f,
            b = 0.155f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -0.108f,
        )
        // a 0.521 0.521 0 0 1 0.168 -0.206
        arcToRelative(
            a = 0.521f,
            b = 0.521f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.168f,
            dy1 = -0.206f,
        )
        // l 0.011 -0.011
        lineToRelative(dx = 0.011f, dy = -0.011f)
        // a 0.239 0.239 0 0 0 0.128 0.135
        arcToRelative(
            a = 0.239f,
            b = 0.239f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.128f,
            dy1 = 0.135f,
        )
        // a 0.19 0.19 0 0 0 0.068 0.011
        arcToRelative(
            a = 0.19f,
            b = 0.19f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.068f,
            dy1 = 0.011f,
        )
        // a 0.254 0.254 0 0 0 0.105 -0.031
        arcToRelative(
            a = 0.254f,
            b = 0.254f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.105f,
            dy1 = -0.031f,
        )
        // a 1.379 1.379 0 0 0 0.848 0.482
        arcToRelative(
            a = 1.379f,
            b = 1.379f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.848f,
            dy1 = 0.482f,
        )
        // h 0.016
        horizontalLineToRelative(dx = 0.016f)
        // a 3.157 3.157 0 0 0 0.772 -0.018
        arcToRelative(
            a = 3.157f,
            b = 3.157f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.772f,
            dy1 = -0.018f,
        )
        // c 0.13 -0.022 0.435 -0.11 0.523 -0.135
        curveToRelative(
            dx1 = 0.13f,
            dy1 = -0.022f,
            dx2 = 0.435f,
            dy2 = -0.11f,
            dx3 = 0.523f,
            dy3 = -0.135f,
        )
        // a 2.9 2.9 0 0 0 0.2 0.224
        arcToRelative(
            a = 2.9f,
            b = 2.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.2f,
            dy1 = 0.224f,
        )
        // a 4.177 4.177 0 0 0 0.424 0.317
        arcToRelative(
            a = 4.177f,
            b = 4.177f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.424f,
            dy1 = 0.317f,
        )
        // a 0.464 0.464 0 0 1 -0.142 0.116
        arcToRelative(
            a = 0.464f,
            b = 0.464f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.142f,
            dy1 = 0.116f,
        )
        // a 0.581 0.581 0 0 1 -0.1 0.028
        arcToRelative(
            a = 0.581f,
            b = 0.581f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.1f,
            dy1 = 0.028f,
        )
        // a 0.356 0.356 0 0 0 -0.187 0.078
        arcToRelative(
            a = 0.356f,
            b = 0.356f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.187f,
            dy1 = 0.078f,
        )
        // a 0.218 0.218 0 0 0 -0.026 0.246
        arcToRelative(
            a = 0.218f,
            b = 0.218f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.026f,
            dy1 = 0.246f,
        )
        // a 0.291 0.291 0 0 0 0.221 0.1
        arcToRelative(
            a = 0.291f,
            b = 0.291f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.221f,
            dy1 = 0.1f,
        )
        // l 0.152 -0.03
        lineToRelative(dx = 0.152f, dy = -0.03f)
        // a 0.413 0.413 0 0 0 0.087 0.162
        arcToRelative(
            a = 0.413f,
            b = 0.413f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.087f,
            dy1 = 0.162f,
        )
        // a 0.272 0.272 0 0 0 0.18 0.076
        arcToRelative(
            a = 0.272f,
            b = 0.272f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.18f,
            dy1 = 0.076f,
        )
        // h 0.006
        horizontalLineToRelative(dx = 0.006f)
        // a 0.245 0.245 0 0 0 0.184 -0.068
        arcToRelative(
            a = 0.245f,
            b = 0.245f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.184f,
            dy1 = -0.068f,
        )
        // a 0.416 0.416 0 0 0 0.076 -0.093
        arcToRelative(
            a = 0.416f,
            b = 0.416f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.076f,
            dy1 = -0.093f,
        )
        // a 0.312 0.312 0 0 0 0.4 -0.046
        arcToRelative(
            a = 0.312f,
            b = 0.312f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.4f,
            dy1 = -0.046f,
        )
        // a 0.158 0.158 0 0 0 0.025 -0.18
        arcToRelative(
            a = 0.158f,
            b = 0.158f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.025f,
            dy1 = -0.18f,
        )
        // a 0.294 0.294 0 0 0 -0.065 -0.084
        arcToRelative(
            a = 0.294f,
            b = 0.294f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.065f,
            dy1 = -0.084f,
        )
        // a 0.253 0.253 0 0 1 -0.067 -0.092
        arcToRelative(
            a = 0.253f,
            b = 0.253f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.067f,
            dy1 = -0.092f,
        )
        // l -0.03 -0.228
        lineToRelative(dx = -0.03f, dy = -0.228f)
        // a 0.2 0.2 0 0 1 0.044 0.006
        arcToRelative(
            a = 0.2f,
            b = 0.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.044f,
            dy1 = 0.006f,
        )
        // a 0.819 0.819 0 0 1 0.122 0.069z
        arcToRelative(
            a = 0.819f,
            b = 0.819f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.122f,
            dy1 = 0.069f,
        )
        close()
        // M 4.14 8.77
        moveTo(x = 4.14f, y = 8.77f)
        // l -0.018 -0.019
        lineToRelative(dx = -0.018f, dy = -0.019f)
        // l -0.022 0.011
        lineToRelative(dx = -0.022f, dy = 0.011f)
        // a 1.194 1.194 0 0 1 -0.287 0.1
        arcToRelative(
            a = 1.194f,
            b = 1.194f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.287f,
            dy1 = 0.1f,
        )
        // a 0.614 0.614 0 0 1 -0.184 -0.032
        arcToRelative(
            a = 0.614f,
            b = 0.614f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.184f,
            dy1 = -0.032f,
        )
        // a 0.469 0.469 0 0 0 0.163 -0.149
        arcToRelative(
            a = 0.469f,
            b = 0.469f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.163f,
            dy1 = -0.149f,
        )
        // l 0.057 -0.08
        lineToRelative(dx = 0.057f, dy = -0.08f)
        // l -0.1 0.022
        lineToRelative(dx = -0.1f, dy = 0.022f)
        // a 1.155 1.155 0 0 1 -0.292 0.033
        arcToRelative(
            a = 1.155f,
            b = 1.155f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.292f,
            dy1 = 0.033f,
        )
        // a 0.955 0.955 0 0 1 -0.2 -0.048
        arcToRelative(
            a = 0.955f,
            b = 0.955f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.2f,
            dy1 = -0.048f,
        )
        // a 0.3 0.3 0 0 0 0.155 -0.15
        arcToRelative(
            a = 0.3f,
            b = 0.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.155f,
            dy1 = -0.15f,
        )
        // l 0.031 -0.072
        lineToRelative(dx = 0.031f, dy = -0.072f)
        // l -0.069 0.014
        lineToRelative(dx = -0.069f, dy = 0.014f)
        // a 0.966 0.966 0 0 1 -0.257 0.046
        arcToRelative(
            a = 0.966f,
            b = 0.966f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.257f,
            dy1 = 0.046f,
        )
        // a 0.612 0.612 0 0 1 -0.161 -0.044
        arcToRelative(
            a = 0.612f,
            b = 0.612f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.161f,
            dy1 = -0.044f,
        )
        // a 0.329 0.329 0 0 0 0.165 -0.164
        arcToRelative(
            a = 0.329f,
            b = 0.329f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.165f,
            dy1 = -0.164f,
        )
        // l 0.031 -0.075
        lineToRelative(dx = 0.031f, dy = -0.075f)
        // l -0.077 0.025
        lineToRelative(dx = -0.077f, dy = 0.025f)
        // a 0.836 0.836 0 0 1 -0.253 0.049
        arcToRelative(
            a = 0.836f,
            b = 0.836f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.253f,
            dy1 = 0.049f,
        )
        // a 0.993 0.993 0 0 1 -0.222 -0.057
        arcToRelative(
            a = 0.993f,
            b = 0.993f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.222f,
            dy1 = -0.057f,
        )
        // a 0.459 0.459 0 0 0 0.189 -0.133
        arcToRelative(
            a = 0.459f,
            b = 0.459f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.189f,
            dy1 = -0.133f,
        )
        // l 0.011 -0.025
        lineToRelative(dx = 0.011f, dy = -0.025f)
        // l -0.11 -0.122
        lineToRelative(dx = -0.11f, dy = -0.122f)
        // a 0.265 0.265 0 0 0 -0.276 -0.06
        arcToRelative(
            a = 0.265f,
            b = 0.265f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.276f,
            dy1 = -0.06f,
        )
        // a 0.41 0.41 0 0 1 -0.1 0.011
        arcToRelative(
            a = 0.41f,
            b = 0.41f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.1f,
            dy1 = 0.011f,
        )
        // a 0.246 0.246 0 0 1 -0.183 -0.131
        arcToRelative(
            a = 0.246f,
            b = 0.246f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.183f,
            dy1 = -0.131f,
        )
        // a 0.186 0.186 0 0 1 0 -0.158
        arcToRelative(
            a = 0.186f,
            b = 0.186f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -0.158f,
        )
        // a 0.228 0.228 0 0 1 0.176 -0.1
        arcToRelative(
            a = 0.228f,
            b = 0.228f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.176f,
            dy1 = -0.1f,
        )
        // l 0.093 -0.006
        lineToRelative(dx = 0.093f, dy = -0.006f)
        // l -0.069 -0.056
        lineToRelative(dx = -0.069f, dy = -0.056f)
        // a 0.192 0.192 0 0 1 -0.082 -0.149
        arcToRelative(
            a = 0.192f,
            b = 0.192f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.082f,
            dy1 = -0.149f,
        )
        // a 0.245 0.245 0 0 1 0.1 -0.178
        arcToRelative(
            a = 0.245f,
            b = 0.245f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.1f,
            dy1 = -0.178f,
        )
        // c 0.09 -0.071 0.175 -0.087 0.3 0.062
        curveToRelative(
            dx1 = 0.09f,
            dy1 = -0.071f,
            dx2 = 0.175f,
            dy2 = -0.087f,
            dx3 = 0.3f,
            dy3 = 0.062f,
        )
        // l 0.031 0.038
        lineToRelative(dx = 0.031f, dy = 0.038f)
        // l 0.029 -0.04
        lineToRelative(dx = 0.029f, dy = -0.04f)
        // A 0.565 0.565 0 0 1 2.836 7
        arcTo(
            horizontalEllipseRadius = 0.565f,
            verticalEllipseRadius = 0.565f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 2.836f,
            y1 = 7.0f,
        )
        // a 0.145 0.145 0 0 1 0.181 0.015
        arcToRelative(
            a = 0.145f,
            b = 0.145f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.181f,
            dy1 = 0.015f,
        )
        // a 0.162 0.162 0 0 1 0.029 0.105
        arcToRelative(
            a = 0.162f,
            b = 0.162f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.029f,
            dy1 = 0.105f,
        )
        // a 0.324 0.324 0 0 1 -0.026 0.071
        arcToRelative(
            a = 0.324f,
            b = 0.324f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.026f,
            dy1 = 0.071f,
        )
        // a 0.352 0.352 0 0 0 -0.041 0.165
        arcToRelative(
            a = 0.352f,
            b = 0.352f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.041f,
            dy1 = 0.165f,
        )
        // a 0.566 0.566 0 0 0 0.163 0.281
        arcToRelative(
            a = 0.566f,
            b = 0.566f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.163f,
            dy1 = 0.281f,
        )
        // l 0.013 0.009
        lineToRelative(dx = 0.013f, dy = 0.009f)
        // c 0.006 0 0.555 0.22 0.815 0.349
        curveToRelative(
            dx1 = 0.006f,
            dy1 = 0.0f,
            dx2 = 0.555f,
            dy2 = 0.22f,
            dx3 = 0.815f,
            dy3 = 0.349f,
        )
        // c 0.134 0.067 0.383 0.22 0.4 0.229
        curveToRelative(
            dx1 = 0.134f,
            dy1 = 0.067f,
            dx2 = 0.383f,
            dy2 = 0.22f,
            dx3 = 0.4f,
            dy3 = 0.229f,
        )
        // l 0.007 0.622
        lineToRelative(dx = 0.007f, dy = 0.622f)
        // l -0.109 0.023
        lineToRelative(dx = -0.109f, dy = 0.023f)
        // a 0.991 0.991 0 0 1 -0.128 -0.099z
        arcToRelative(
            a = 0.991f,
            b = 0.991f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.128f,
            dy1 = -0.099f,
        )
        close()
        // M 9.392 8.625
        moveTo(x = 9.392f, y = 8.625f)
        // a 0.235 0.235 0 0 0 0 0.159
        arcToRelative(
            a = 0.235f,
            b = 0.235f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 0.159f,
        )
        // a 0.9 0.9 0 0 0 0.088 0.154
        arcToRelative(
            a = 0.9f,
            b = 0.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.088f,
            dy1 = 0.154f,
        )
        // l 0.009 0.012
        lineToRelative(dx = 0.009f, dy = 0.012f)
        // h 0.016
        horizontalLineToRelative(dx = 0.016f)
        // c 0.135 0.019 0.2 0.092 0.2 0.137
        curveToRelative(
            dx1 = 0.135f,
            dy1 = 0.019f,
            dx2 = 0.2f,
            dy2 = 0.092f,
            dx3 = 0.2f,
            dy3 = 0.137f,
        )
        // s -0.105 0.137 -0.285 0.128
        reflectiveCurveToRelative(
            dx1 = -0.105f,
            dy1 = 0.137f,
            dx2 = -0.285f,
            dy2 = 0.128f,
        )
        // h -0.034
        horizontalLineToRelative(dx = -0.034f)
        // v 0.034
        verticalLineToRelative(dy = 0.034f)
        // a 0.8 0.8 0 0 1 -0.046 0.174
        arcToRelative(
            a = 0.8f,
            b = 0.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.046f,
            dy1 = 0.174f,
        )
        // a 0.474 0.474 0 0 1 -0.118 0.127
        arcToRelative(
            a = 0.474f,
            b = 0.474f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.118f,
            dy1 = 0.127f,
        )
        // a 0.257 0.257 0 0 0 -0.082 -0.2
        arcToRelative(
            a = 0.257f,
            b = 0.257f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.082f,
            dy1 = -0.2f,
        )
        // l -0.045 -0.04
        lineToRelative(dx = -0.045f, dy = -0.04f)
        // l -0.016 0.058
        lineToRelative(dx = -0.016f, dy = 0.058f)
        // a 0.875 0.875 0 0 1 -0.085 0.21
        arcToRelative(
            a = 0.875f,
            b = 0.875f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.085f,
            dy1 = 0.21f,
        )
        // a 0.635 0.635 0 0 1 -0.115 0.1
        arcToRelative(
            a = 0.635f,
            b = 0.635f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.115f,
            dy1 = 0.1f,
        )
        // a 0.3 0.3 0 0 0 -0.122 -0.2
        arcToRelative(
            a = 0.3f,
            b = 0.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.122f,
            dy1 = -0.2f,
        )
        // L 8.7 9.437
        lineTo(x = 8.7f, y = 9.437f)
        // l -0.007 0.071
        lineToRelative(dx = -0.007f, dy = 0.071f)
        // a 0.621 0.621 0 0 1 -0.05 0.2
        arcToRelative(
            a = 0.621f,
            b = 0.621f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.05f,
            dy1 = 0.2f,
        )
        // a 0.516 0.516 0 0 1 -0.106 0.1
        arcToRelative(
            a = 0.516f,
            b = 0.516f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.106f,
            dy1 = 0.1f,
        )
        // a 0.2 0.2 0 0 0 -0.109 -0.181
        arcToRelative(
            a = 0.2f,
            b = 0.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.109f,
            dy1 = -0.181f,
        )
        // l -0.023 -0.013
        lineToRelative(dx = -0.023f, dy = -0.013f)
        // l -0.234 0.219
        lineToRelative(dx = -0.234f, dy = 0.219f)
        // a 0.258 0.258 0 0 0 -0.061 0.146
        arcToRelative(
            a = 0.258f,
            b = 0.258f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.061f,
            dy1 = 0.146f,
        )
        // a 0.226 0.226 0 0 1 -0.02 0.072
        arcToRelative(
            a = 0.226f,
            b = 0.226f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.02f,
            dy1 = 0.072f,
        )
        // c -0.033 0.048 -0.047 0.056 -0.119 0.065
        curveToRelative(
            dx1 = -0.033f,
            dy1 = 0.048f,
            dx2 = -0.047f,
            dy2 = 0.056f,
            dx3 = -0.119f,
            dy3 = 0.065f,
        )
        // a 0.241 0.241 0 0 1 -0.21 -0.109
        arcToRelative(
            a = 0.241f,
            b = 0.241f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.21f,
            dy1 = -0.109f,
        )
        // a 0.212 0.212 0 0 1 -0.021 -0.107
        arcToRelative(
            a = 0.212f,
            b = 0.212f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.021f,
            dy1 = -0.107f,
        )
        // v -0.044
        verticalLineToRelative(dy = -0.044f)
        // l -0.04 0.009
        lineToRelative(dx = -0.04f, dy = 0.009f)
        // a 0.76 0.76 0 0 1 -0.154 0.017
        arcToRelative(
            a = 0.76f,
            b = 0.76f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.154f,
            dy1 = 0.017f,
        )
        // a 0.144 0.144 0 0 1 -0.114 -0.061
        arcToRelative(
            a = 0.144f,
            b = 0.144f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.114f,
            dy1 = -0.061f,
        )
        // l -0.013 -0.014
        lineToRelative(dx = -0.013f, dy = -0.014f)
        // A 0.136 0.136 0 0 1 7.36 9.7
        arcTo(
            horizontalEllipseRadius = 0.136f,
            verticalEllipseRadius = 0.136f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 7.36f,
            y1 = 9.7f,
        )
        // a 0.444 0.444 0 0 1 0.093 -0.155
        arcToRelative(
            a = 0.444f,
            b = 0.444f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.093f,
            dy1 = -0.155f,
        )
        // l 0.028 -0.032
        lineToRelative(dx = 0.028f, dy = -0.032f)
        // l -0.2 -0.125
        lineToRelative(dx = -0.2f, dy = -0.125f)
        // a 0.209 0.209 0 0 1 -0.04 -0.122
        arcToRelative(
            a = 0.209f,
            b = 0.209f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.04f,
            dy1 = -0.122f,
        )
        // a 0.2 0.2 0 0 1 0.17 -0.1
        arcToRelative(
            a = 0.2f,
            b = 0.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.17f,
            dy1 = -0.1f,
        )
        // a 0.3 0.3 0 0 1 0.139 0.06
        arcToRelative(
            a = 0.3f,
            b = 0.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.139f,
            dy1 = 0.06f,
        )
        // l 0.037 0.022
        lineToRelative(dx = 0.037f, dy = 0.022f)
        // l -0.026 0.01
        lineToRelative(dx = -0.026f, dy = 0.01f)
        // l 0.142 0.037
        lineToRelative(dx = 0.142f, dy = 0.037f)
        // a 0.623 0.623 0 0 0 0.252 0.03
        arcToRelative(
            a = 0.623f,
            b = 0.623f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.252f,
            dy1 = 0.03f,
        )
        // h 0.013
        horizontalLineToRelative(dx = 0.013f)
        // s 0.295 -0.171 0.466 -0.25
        reflectiveCurveToRelative(
            dx1 = 0.295f,
            dy1 = -0.171f,
            dx2 = 0.466f,
            dy2 = -0.25f,
        )
        // c 0.029 -0.012 0.068 -0.025 0.11 -0.039
        curveToRelative(
            dx1 = 0.029f,
            dy1 = -0.012f,
            dx2 = 0.068f,
            dy2 = -0.025f,
            dx3 = 0.11f,
            dy3 = -0.039f,
        )
        // a 0.552 0.552 0 0 0 0.256 -0.143
        arcToRelative(
            a = 0.552f,
            b = 0.552f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.256f,
            dy1 = -0.143f,
        )
        // a 0.132 0.132 0 0 0 -0.008 -0.16
        arcToRelative(
            a = 0.132f,
            b = 0.132f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.008f,
            dy1 = -0.16f,
        )
        // a 0.2 0.2 0 0 0 -0.091 -0.064
        arcToRelative(
            a = 0.2f,
            b = 0.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.091f,
            dy1 = -0.064f,
        )
        // a 0.191 0.191 0 0 1 -0.066 -0.041
        arcToRelative(
            a = 0.191f,
            b = 0.191f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.066f,
            dy1 = -0.041f,
        )
        // c -0.022 -0.029 -0.032 -0.063 -0.022 -0.077
        curveToRelative(
            dx1 = -0.022f,
            dy1 = -0.029f,
            dx2 = -0.032f,
            dy2 = -0.063f,
            dx3 = -0.022f,
            dy3 = -0.077f,
        )
        // a 0.261 0.261 0 0 1 0.061 -0.051
        arcToRelative(
            a = 0.261f,
            b = 0.261f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.061f,
            dy1 = -0.051f,
        )
        // a 0.164 0.164 0 0 0 0.068 -0.077
        arcToRelative(
            a = 0.164f,
            b = 0.164f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.068f,
            dy1 = -0.077f,
        )
        // c 0.028 -0.1 -0.027 -0.146 -0.146 -0.215
        curveToRelative(
            dx1 = 0.028f,
            dy1 = -0.1f,
            dx2 = -0.027f,
            dy2 = -0.146f,
            dx3 = -0.146f,
            dy3 = -0.215f,
        )
        // c 0.142 -0.045 0.269 -0.082 0.361 -0.1
        curveToRelative(
            dx1 = 0.142f,
            dy1 = -0.045f,
            dx2 = 0.269f,
            dy2 = -0.082f,
            dx3 = 0.361f,
            dy3 = -0.1f,
        )
        // c 0.021 -0.005 0.031 0 0.05 -0.008
        curveToRelative(
            dx1 = 0.021f,
            dy1 = -0.005f,
            dx2 = 0.031f,
            dy2 = 0.0f,
            dx3 = 0.05f,
            dy3 = -0.008f,
        )
        // a 0.455 0.455 0 0 0 -0.089 0.184
        arcToRelative(
            a = 0.455f,
            b = 0.455f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.089f,
            dy1 = 0.184f,
        )
        // l -0.018 0.065
        lineToRelative(dx = -0.018f, dy = 0.065f)
        // l 0.068 -0.022
        lineToRelative(dx = 0.068f, dy = -0.022f)
        // a 1.454 1.454 0 0 1 0.4 -0.083
        arcToRelative(
            a = 1.454f,
            b = 1.454f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.4f,
            dy1 = -0.083f,
        )
        // a 0.742 0.742 0 0 1 0.223 0.029
        arcToRelative(
            a = 0.742f,
            b = 0.742f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.223f,
            dy1 = 0.029f,
        )
        // c 0.005 0.016 0.019 0.054 0.034 0.09
        curveToRelative(
            dx1 = 0.005f,
            dy1 = 0.016f,
            dx2 = 0.019f,
            dy2 = 0.054f,
            dx3 = 0.034f,
            dy3 = 0.09f,
        )
        // a 0.368 0.368 0 0 0 -0.039 0.024
        arcToRelative(
            a = 0.368f,
            b = 0.368f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.039f,
            dy1 = 0.024f,
        )
        // a 0.6 0.6 0 0 0 -0.194 0.238z
        arcToRelative(
            a = 0.6f,
            b = 0.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.194f,
            dy1 = 0.238f,
        )
        close()
        // M 9.332 8.108
        moveTo(x = 9.332f, y = 8.108f)
        // a 0.916 0.916 0 0 1 0.1 0.056
        arcToRelative(
            a = 0.916f,
            b = 0.916f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.1f,
            dy1 = 0.056f,
        )
        // l -0.079 0.005
        lineToRelative(dx = -0.079f, dy = 0.005f)
        // a 1.426 1.426 0 0 0 -0.337 0.064
        arcToRelative(
            a = 1.426f,
            b = 1.426f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.337f,
            dy1 = 0.064f,
        )
        // a 0.538 0.538 0 0 1 0.111 -0.155
        arcToRelative(
            a = 0.538f,
            b = 0.538f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.111f,
            dy1 = -0.155f,
        )
        // a 0.55 0.55 0 0 1 0.205 0.03
        arcToRelative(
            a = 0.55f,
            b = 0.55f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.205f,
            dy1 = 0.03f,
        )
        // m 0.471 0.387
        moveToRelative(dx = 0.471f, dy = 0.387f)
        // a 0.146 0.146 0 0 1 -0.103 -0.106
        arcToRelative(
            a = 0.146f,
            b = 0.146f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.103f,
            dy1 = -0.106f,
        )
        // s -0.019 -0.061 -0.006 -0.069
        reflectiveCurveToRelative(
            dx1 = -0.019f,
            dy1 = -0.061f,
            dx2 = -0.006f,
            dy2 = -0.069f,
        )
        // l 0.189 0.163
        lineToRelative(dx = 0.189f, dy = 0.163f)
        // a 0.214 0.214 0 0 1 -0.083 0.012z
        arcToRelative(
            a = 0.214f,
            b = 0.214f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.083f,
            dy1 = 0.012f,
        )
        close()
        // M 9.755 8.279
        moveTo(x = 9.755f, y = 8.279f)
        // a 1.265 1.265 0 0 0 -0.4 -0.242
        arcToRelative(
            a = 1.265f,
            b = 1.265f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.4f,
            dy1 = -0.242f,
        )
        // a 0.592 0.592 0 0 0 -0.243 -0.03
        arcToRelative(
            a = 0.592f,
            b = 0.592f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.243f,
            dy1 = -0.03f,
        )
        // L 9.1 8
        lineTo(x = 9.1f, y = 8.0f)
        // l -0.009 0.01
        lineToRelative(dx = -0.009f, dy = 0.01f)
        // a 1.169 1.169 0 0 0 -0.151 0.022
        arcToRelative(
            a = 1.169f,
            b = 1.169f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.151f,
            dy1 = 0.022f,
        )
        // c -0.322 0.073 -1 0.315 -1.657 0.549
        curveToRelative(
            dx1 = -0.322f,
            dy1 = 0.073f,
            dx2 = -1.0f,
            dy2 = 0.315f,
            dx3 = -1.657f,
            dy3 = 0.549f,
        )
        // c -0.553 0.2 -1.075 0.384 -1.342 0.454
        curveToRelative(
            dx1 = -0.553f,
            dy1 = 0.2f,
            dx2 = -1.075f,
            dy2 = 0.384f,
            dx3 = -1.342f,
            dy3 = 0.454f,
        )
        // a 5.474 5.474 0 0 1 -0.739 0.093
        arcToRelative(
            a = 5.474f,
            b = 5.474f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.739f,
            dy1 = 0.093f,
        )
        // h -0.021
        horizontalLineToRelative(dx = -0.021f)
        // l -0.01 0.019
        lineToRelative(dx = -0.01f, dy = 0.019f)
        // a 0.615 0.615 0 0 1 -0.142 0.194
        arcToRelative(
            a = 0.615f,
            b = 0.615f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.142f,
            dy1 = 0.194f,
        )
        // a 0.794 0.794 0 0 1 -0.28 0.054
        arcToRelative(
            a = 0.794f,
            b = 0.794f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.28f,
            dy1 = 0.054f,
        )
        // h -0.027
        horizontalLineToRelative(dx = -0.027f)
        // l -0.007 0.027
        lineToRelative(dx = -0.007f, dy = 0.027f)
        // a 0.881 0.881 0 0 1 -0.1 0.251
        arcToRelative(
            a = 0.881f,
            b = 0.881f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.1f,
            dy1 = 0.251f,
        )
        // a 0.565 0.565 0 0 1 -0.159 0.111
        arcToRelative(
            a = 0.565f,
            b = 0.565f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.159f,
            dy1 = 0.111f,
        )
        // a 0.367 0.367 0 0 0 -0.021 -0.209
        arcToRelative(
            a = 0.367f,
            b = 0.367f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.021f,
            dy1 = -0.209f,
        )
        // L 4.4 9.5
        lineTo(x = 4.4f, y = 9.5f)
        // l -0.039 0.071
        lineToRelative(dx = -0.039f, dy = 0.071f)
        // a 1.022 1.022 0 0 1 -0.163 0.219
        arcToRelative(
            a = 1.022f,
            b = 1.022f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.163f,
            dy1 = 0.219f,
        )
        // a 1.033 1.033 0 0 1 -0.18 0.108
        arcToRelative(
            a = 1.033f,
            b = 1.033f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.18f,
            dy1 = 0.108f,
        )
        // a 0.243 0.243 0 0 0 -0.028 -0.2
        arcToRelative(
            a = 0.243f,
            b = 0.243f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.028f,
            dy1 = -0.2f,
        )
        // l -0.033 -0.058
        lineToRelative(dx = -0.033f, dy = -0.058f)
        // l -0.029 0.06
        lineToRelative(dx = -0.029f, dy = 0.06f)
        // a 0.8 0.8 0 0 1 -0.128 0.2
        arcToRelative(
            a = 0.8f,
            b = 0.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.128f,
            dy1 = 0.2f,
        )
        // a 0.7 0.7 0 0 1 -0.154 0.087
        arcToRelative(
            a = 0.7f,
            b = 0.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.154f,
            dy1 = 0.087f,
        )
        // a 0.268 0.268 0 0 0 -0.034 -0.219
        arcToRelative(
            a = 0.268f,
            b = 0.268f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.034f,
            dy1 = -0.219f,
        )
        // l -0.038 -0.057
        lineToRelative(dx = -0.038f, dy = -0.057f)
        // l -0.027 0.063
        lineToRelative(dx = -0.027f, dy = 0.063f)
        // a 0.713 0.713 0 0 1 -0.122 0.2
        arcToRelative(
            a = 0.713f,
            b = 0.713f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.122f,
            dy1 = 0.2f,
        )
        // a 1.038 1.038 0 0 1 -0.213 0.121
        arcToRelative(
            a = 1.038f,
            b = 1.038f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.213f,
            dy1 = 0.121f,
        )
        // a 0.353 0.353 0 0 0 0.009 -0.216
        arcToRelative(
            a = 0.353f,
            b = 0.353f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.009f,
            dy1 = -0.216f,
        )
        // l -0.008 -0.027
        lineToRelative(dx = -0.008f, dy = -0.027f)
        // h -0.174
        horizontalLineToRelative(dx = -0.174f)
        // a 0.256 0.256 0 0 0 -0.233 0.153
        arcToRelative(
            a = 0.256f,
            b = 0.256f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.233f,
            dy1 = 0.153f,
        )
        // a 0.332 0.332 0 0 1 -0.055 0.073
        arcToRelative(
            a = 0.332f,
            b = 0.332f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.055f,
            dy1 = 0.073f,
        )
        // a 0.3 0.3 0 0 1 -0.24 0.045
        arcToRelative(
            a = 0.3f,
            b = 0.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.24f,
            dy1 = 0.045f,
        )
        // a 0.162 0.162 0 0 1 -0.11 -0.1
        arcToRelative(
            a = 0.162f,
            b = 0.162f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.11f,
            dy1 = -0.1f,
        )
        // a 0.215 0.215 0 0 1 0.047 -0.19
        arcToRelative(
            a = 0.215f,
            b = 0.215f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.047f,
            dy1 = -0.19f,
        )
        // l 0.052 -0.059
        lineToRelative(dx = 0.052f, dy = -0.059f)
        // l -0.083 0.011
        lineToRelative(dx = -0.083f, dy = 0.011f)
        // a 0.313 0.313 0 0 1 -0.248 -0.06
        arcToRelative(
            a = 0.313f,
            b = 0.313f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.248f,
            dy1 = -0.06f,
        )
        // a 0.189 0.189 0 0 1 -0.07 -0.139
        arcToRelative(
            a = 0.189f,
            b = 0.189f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.07f,
            dy1 = -0.139f,
        )
        // a 0.173 0.173 0 0 1 0.04 -0.135
        arcToRelative(
            a = 0.173f,
            b = 0.173f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.04f,
            dy1 = -0.135f,
        )
        // a 0.282 0.282 0 0 1 0.2 -0.049
        arcToRelative(
            a = 0.282f,
            b = 0.282f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.2f,
            dy1 = -0.049f,
        )
        // h 0.052
        horizontalLineToRelative(dx = 0.052f)
        // l -0.015 -0.05
        lineToRelative(dx = -0.015f, dy = -0.05f)
        // a 0.4 0.4 0 0 1 -0.022 -0.142
        arcToRelative(
            a = 0.4f,
            b = 0.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.022f,
            dy1 = -0.142f,
        )
        // a 0.132 0.132 0 0 1 0.134 -0.11
        arcToRelative(
            a = 0.132f,
            b = 0.132f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.134f,
            dy1 = -0.11f,
        )
        // a 0.231 0.231 0 0 1 0.117 0.046
        arcToRelative(
            a = 0.231f,
            b = 0.231f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.117f,
            dy1 = 0.046f,
        )
        // a 0.353 0.353 0 0 1 0.044 0.061
        arcToRelative(
            a = 0.353f,
            b = 0.353f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.044f,
            dy1 = 0.061f,
        )
        // a 0.364 0.364 0 0 0 0.115 0.128
        arcToRelative(
            a = 0.364f,
            b = 0.364f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.115f,
            dy1 = 0.128f,
        )
        // a 0.728 0.728 0 0 0 0.336 0.065
        arcToRelative(
            a = 0.728f,
            b = 0.728f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.336f,
            dy1 = 0.065f,
        )
        // h 0.017
        horizontalLineToRelative(dx = 0.017f)
        // a 6.091 6.091 0 0 1 0.716 -0.339
        arcToRelative(
            a = 6.091f,
            b = 6.091f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.716f,
            dy1 = -0.339f,
        )
        // c 0.149 -0.052 0.581 -0.137 0.585 -0.137
        curveToRelative(
            dx1 = 0.149f,
            dy1 = -0.052f,
            dx2 = 0.581f,
            dy2 = -0.137f,
            dx3 = 0.585f,
            dy3 = -0.137f,
        )
        // l 0.031 -0.006
        lineToRelative(dx = 0.031f, dy = -0.006f)
        // l -0.009 -0.694
        lineToRelative(dx = -0.009f, dy = -0.694f)
        // l 0.383 -0.124
        lineToRelative(dx = 0.383f, dy = -0.124f)
        // l 0.226 0.627
        lineToRelative(dx = 0.226f, dy = 0.627f)
        // a 0.457 0.457 0 0 1 0.085 0.017
        arcToRelative(
            a = 0.457f,
            b = 0.457f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.085f,
            dy1 = 0.017f,
        )
        // l -0.265 -0.735
        lineToRelative(dx = -0.265f, dy = -0.735f)
        // l -0.427 0.123
        lineToRelative(dx = -0.427f, dy = 0.123f)
        // v -0.266
        verticalLineToRelative(dy = -0.266f)
        // l 0.121 0.006
        lineToRelative(dx = 0.121f, dy = 0.006f)
        // a 1.4 1.4 0 0 0 0.189 0
        arcToRelative(
            a = 1.4f,
            b = 1.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.189f,
            dy1 = 0.0f,
        )
        // h 0.028
        horizontalLineToRelative(dx = 0.028f)
        // a 11.12 11.12 0 0 1 1.166 0.089
        arcToRelative(
            a = 11.12f,
            b = 11.12f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.166f,
            dy1 = 0.089f,
        )
        // l 0.6 -0.054
        lineToRelative(dx = 0.6f, dy = -0.054f)
        // c 0.022 0 2.2 -0.2 2.674 -0.255
        curveToRelative(
            dx1 = 0.022f,
            dy1 = 0.0f,
            dx2 = 2.2f,
            dy2 = -0.2f,
            dx3 = 2.674f,
            dy3 = -0.255f,
        )
        // a 5.017 5.017 0 0 1 0.716 -0.045
        arcToRelative(
            a = 5.017f,
            b = 5.017f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.716f,
            dy1 = -0.045f,
        )
        // a 4.711 4.711 0 0 1 0.522 0.051
        arcToRelative(
            a = 4.711f,
            b = 4.711f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.522f,
            dy1 = 0.051f,
        )
        // a 4.909 4.909 0 0 0 0.495 0.049
        arcToRelative(
            a = 4.909f,
            b = 4.909f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.495f,
            dy1 = 0.049f,
        )
        // c 0.08 0 0.153 0.006 0.222 0.009
        curveToRelative(
            dx1 = 0.08f,
            dy1 = 0.0f,
            dx2 = 0.153f,
            dy2 = 0.006f,
            dx3 = 0.222f,
            dy3 = 0.009f,
        )
        // a 4.034 4.034 0 0 0 0.55 0
        arcToRelative(
            a = 4.034f,
            b = 4.034f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.55f,
            dy1 = 0.0f,
        )
        // l 0.175 -0.012
        lineToRelative(dx = 0.175f, dy = -0.012f)
        // c 0.427 -0.025 1.012 -0.06 1.216 -0.393
        curveToRelative(
            dx1 = 0.427f,
            dy1 = -0.025f,
            dx2 = 1.012f,
            dy2 = -0.06f,
            dx3 = 1.216f,
            dy3 = -0.393f,
        )
        // a 0.263 0.263 0 0 0 -0.077 -0.34
        arcToRelative(
            a = 0.263f,
            b = 0.263f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.077f,
            dy1 = -0.34f,
        )
        // a 0.409 0.409 0 0 0 -0.395 -0.1
        arcToRelative(
            a = 0.409f,
            b = 0.409f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.395f,
            dy1 = -0.1f,
        )
        // c -0.083 0.019 -0.212 0.083 -0.224 0.18
        curveToRelative(
            dx1 = -0.083f,
            dy1 = 0.019f,
            dx2 = -0.212f,
            dy2 = 0.083f,
            dx3 = -0.224f,
            dy3 = 0.18f,
        )
        // a 0.175 0.175 0 0 0 0.048 0.144
        arcToRelative(
            a = 0.175f,
            b = 0.175f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.048f,
            dy1 = 0.144f,
        )
        // a 0.462 0.462 0 0 0 0.048 0.05
        arcToRelative(
            a = 0.462f,
            b = 0.462f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.048f,
            dy1 = 0.05f,
        )
        // a 0.339 0.339 0 0 1 -0.153 -0.035
        arcToRelative(
            a = 0.339f,
            b = 0.339f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.153f,
            dy1 = -0.035f,
        )
        // a 0.49 0.49 0 0 1 -0.13 -0.21
        arcToRelative(
            a = 0.49f,
            b = 0.49f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.13f,
            dy1 = -0.21f,
        )
        // l -0.02 -0.07
        lineToRelative(dx = -0.02f, dy = -0.07f)
        // l -0.045 0.058
        lineToRelative(dx = -0.045f, dy = 0.058f)
        // a 0.268 0.268 0 0 0 -0.066 0.2
        arcToRelative(
            a = 0.268f,
            b = 0.268f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.066f,
            dy1 = 0.2f,
        )
        // v 0.019
        verticalLineToRelative(dy = 0.019f)
        // a 0.275 0.275 0 0 0 0.034 0.117
        arcToRelative(
            a = 0.275f,
            b = 0.275f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.034f,
            dy1 = 0.117f,
        )
        // a 0.361 0.361 0 0 1 -0.172 -0.076
        arcToRelative(
            a = 0.361f,
            b = 0.361f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.172f,
            dy1 = -0.076f,
        )
        // a 0.712 0.712 0 0 1 -0.106 -0.23
        arcToRelative(
            a = 0.712f,
            b = 0.712f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.106f,
            dy1 = -0.23f,
        )
        // l -0.017 -0.058
        lineToRelative(dx = -0.017f, dy = -0.058f)
        // L 11.8 7
        lineTo(x = 11.8f, y = 7.0f)
        // a 0.316 0.316 0 0 0 -0.1 0.208
        arcToRelative(
            a = 0.316f,
            b = 0.316f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.1f,
            dy1 = 0.208f,
        )
        // a 0.28 0.28 0 0 0 0.033 0.133
        arcToRelative(
            a = 0.28f,
            b = 0.28f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.033f,
            dy1 = 0.133f,
        )
        // v 0.011
        verticalLineToRelative(dy = 0.011f)
        // a 0.429 0.429 0 0 1 -0.173 -0.1
        arcToRelative(
            a = 0.429f,
            b = 0.429f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.173f,
            dy1 = -0.1f,
        )
        // a 0.654 0.654 0 0 1 -0.085 -0.233
        arcToRelative(
            a = 0.654f,
            b = 0.654f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.085f,
            dy1 = -0.233f,
        )
        // l -0.007 -0.038
        lineToRelative(dx = -0.007f, dy = -0.038f)
        // l -0.039 0.009
        lineToRelative(dx = -0.039f, dy = 0.009f)
        // l -0.253 0.065
        lineToRelative(dx = -0.253f, dy = 0.065f)
        // c -0.331 0.085 -0.832 0.214 -1.159 0.285
        curveToRelative(
            dx1 = -0.331f,
            dy1 = 0.085f,
            dx2 = -0.832f,
            dy2 = 0.214f,
            dx3 = -1.159f,
            dy3 = 0.285f,
        )
        // h -0.023
        horizontalLineToRelative(dx = -0.023f)
        // c -0.306 0.066 -0.767 0.166 -1.093 0.211
        curveToRelative(
            dx1 = -0.306f,
            dy1 = 0.066f,
            dx2 = -0.767f,
            dy2 = 0.166f,
            dx3 = -1.093f,
            dy3 = 0.211f,
        )
        // a 2.8 2.8 0 0 1 -1.337 -0.07
        arcToRelative(
            a = 2.8f,
            b = 2.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.337f,
            dy1 = -0.07f,
        )
        // c -0.185 -0.065 -0.255 -0.127 -0.3 -0.265
        curveToRelative(
            dx1 = -0.185f,
            dy1 = -0.065f,
            dx2 = -0.255f,
            dy2 = -0.127f,
            dx3 = -0.3f,
            dy3 = -0.265f,
        )
        // a 0.326 0.326 0 0 1 0.089 -0.284
        arcToRelative(
            a = 0.326f,
            b = 0.326f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.089f,
            dy1 = -0.284f,
        )
        // a 1.139 1.139 0 0 1 0.572 -0.3
        arcToRelative(
            a = 1.139f,
            b = 1.139f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.572f,
            dy1 = -0.3f,
        )
        // a 9.122 9.122 0 0 1 1.029 -0.213
        arcToRelative(
            a = 9.122f,
            b = 9.122f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.029f,
            dy1 = -0.213f,
        )
        // a 3.56 3.56 0 0 1 0.947 0.009
        arcToRelative(
            a = 3.56f,
            b = 3.56f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.947f,
            dy1 = 0.009f,
        )
        // c 0.057 0.007 0.111 0.014 0.166 0.019
        curveToRelative(
            dx1 = 0.057f,
            dy1 = 0.007f,
            dx2 = 0.111f,
            dy2 = 0.014f,
            dx3 = 0.166f,
            dy3 = 0.019f,
        )
        // a 0.61 0.61 0 0 0 0.427 -0.09
        arcToRelative(
            a = 0.61f,
            b = 0.61f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.427f,
            dy1 = -0.09f,
        )
        // l 0.013 -0.013
        lineToRelative(dx = 0.013f, dy = -0.013f)
        // a 0.157 0.157 0 0 0 0.054 -0.162
        arcToRelative(
            a = 0.157f,
            b = 0.157f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.054f,
            dy1 = -0.162f,
        )
        // a 0.256 0.256 0 0 1 0.1 0.093
        arcToRelative(
            a = 0.256f,
            b = 0.256f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.1f,
            dy1 = 0.093f,
        )
        // a 0.263 0.263 0 0 1 -0.006 0.151
        arcToRelative(
            a = 0.263f,
            b = 0.263f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.006f,
            dy1 = 0.151f,
        )
        // l -0.024 0.06
        lineToRelative(dx = -0.024f, dy = 0.06f)
        // l 0.063 -0.008
        lineToRelative(dx = 0.063f, dy = -0.008f)
        // a 1.127 1.127 0 0 0 0.512 -0.176
        arcToRelative(
            a = 1.127f,
            b = 1.127f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.512f,
            dy1 = -0.176f,
        )
        // l 0.077 -0.077
        lineToRelative(dx = 0.077f, dy = -0.077f)
        // a 0.577 0.577 0 0 1 -0.391 0.4
        arcToRelative(
            a = 0.577f,
            b = 0.577f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.391f,
            dy1 = 0.4f,
        )
        // a 1.634 1.634 0 0 1 -0.718 0.105
        arcToRelative(
            a = 1.634f,
            b = 1.634f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.718f,
            dy1 = 0.105f,
        )
        // a 3.435 3.435 0 0 1 -0.439 -0.079
        arcToRelative(
            a = 3.435f,
            b = 3.435f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.439f,
            dy1 = -0.079f,
        )
        // l -0.13 -0.032
        lineToRelative(dx = -0.13f, dy = -0.032f)
        // l 0.095 0.1
        lineToRelative(dx = 0.095f, dy = 0.1f)
        // a 0.188 0.188 0 0 1 0.075 0.154
        arcToRelative(
            a = 0.188f,
            b = 0.188f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.075f,
            dy1 = 0.154f,
        )
        // c -0.008 0.042 -0.049 0.083 -0.118 0.121
        curveToRelative(
            dx1 = -0.008f,
            dy1 = 0.042f,
            dx2 = -0.049f,
            dy2 = 0.083f,
            dx3 = -0.118f,
            dy3 = 0.121f,
        )
        // c 0 -0.06 -0.009 -0.134 -0.066 -0.153
        curveToRelative(
            dx1 = 0.0f,
            dy1 = -0.06f,
            dx2 = -0.009f,
            dy2 = -0.134f,
            dx3 = -0.066f,
            dy3 = -0.153f,
        )
        // a 0.55 0.55 0 0 0 -0.438 0.1
        arcToRelative(
            a = 0.55f,
            b = 0.55f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.438f,
            dy1 = 0.1f,
        )
        // a 0.784 0.784 0 0 1 -0.338 0.082
        arcToRelative(
            a = 0.784f,
            b = 0.784f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.338f,
            dy1 = 0.082f,
        )
        // a 1.15 1.15 0 0 1 -0.415 -0.046
        arcToRelative(
            a = 1.15f,
            b = 1.15f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.415f,
            dy1 = -0.046f,
        )
        // a 1.068 1.068 0 0 1 -0.13 -0.06
        arcToRelative(
            a = 1.068f,
            b = 1.068f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.13f,
            dy1 = -0.06f,
        )
        // a 0.436 0.436 0 0 0 -0.228 -0.079
        arcToRelative(
            a = 0.436f,
            b = 0.436f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.228f,
            dy1 = -0.079f,
        )
        // l -0.063 0.012
        lineToRelative(dx = -0.063f, dy = 0.012f)
        // a 0.593 0.593 0 0 0 -0.391 0.172
        arcToRelative(
            a = 0.593f,
            b = 0.593f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.391f,
            dy1 = 0.172f,
        )
        // a 0.171 0.171 0 0 0 0 0.188
        arcToRelative(
            a = 0.171f,
            b = 0.171f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 0.188f,
        )
        // a 0.506 0.506 0 0 0 0.341 0.178
        arcToRelative(
            a = 0.506f,
            b = 0.506f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.341f,
            dy1 = 0.178f,
        )
        // a 2.7 2.7 0 0 0 1 0
        arcToRelative(
            a = 2.7f,
            b = 2.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = 0.0f,
        )
        // c 0.208 -0.034 0.438 -0.085 0.661 -0.135
        curveToRelative(
            dx1 = 0.208f,
            dy1 = -0.034f,
            dx2 = 0.438f,
            dy2 = -0.085f,
            dx3 = 0.661f,
            dy3 = -0.135f,
        )
        // c 0.158 -0.035 0.322 -0.071 0.471 -0.1
        curveToRelative(
            dx1 = 0.158f,
            dy1 = -0.035f,
            dx2 = 0.322f,
            dy2 = -0.071f,
            dx3 = 0.471f,
            dy3 = -0.1f,
        )
        // c 0.212 -0.04 0.583 -0.144 0.91 -0.236
        curveToRelative(
            dx1 = 0.212f,
            dy1 = -0.04f,
            dx2 = 0.583f,
            dy2 = -0.144f,
            dx3 = 0.91f,
            dy3 = -0.236f,
        )
        // c 0.225 -0.063 0.419 -0.117 0.527 -0.141
        curveToRelative(
            dx1 = 0.225f,
            dy1 = -0.063f,
            dx2 = 0.419f,
            dy2 = -0.117f,
            dx3 = 0.527f,
            dy3 = -0.141f,
        )
        // a 4.124 4.124 0 0 1 1.036 -0.128
        arcToRelative(
            a = 4.124f,
            b = 4.124f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.036f,
            dy1 = -0.128f,
        )
        // h 0.019
        horizontalLineToRelative(dx = 0.019f)
        // a 0.865 0.865 0 0 1 0.636 0.2
        arcToRelative(
            a = 0.865f,
            b = 0.865f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.636f,
            dy1 = 0.2f,
        )
        // a 0.5 0.5 0 0 1 0.133 0.372
        arcToRelative(
            a = 0.5f,
            b = 0.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.133f,
            dy1 = 0.372f,
        )
        // c -0.01 0.309 -0.367 0.461 -0.677 0.558
        curveToRelative(
            dx1 = -0.01f,
            dy1 = 0.309f,
            dx2 = -0.367f,
            dy2 = 0.461f,
            dx3 = -0.677f,
            dy3 = 0.558f,
        )
        // a 4.745 4.745 0 0 1 -1.469 0.108
        arcToRelative(
            a = 4.745f,
            b = 4.745f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.469f,
            dy1 = 0.108f,
        )
        // c -0.125 0 -0.242 -0.006 -0.346 -0.006
        curveToRelative(
            dx1 = -0.125f,
            dy1 = 0.0f,
            dx2 = -0.242f,
            dy2 = -0.006f,
            dx3 = -0.346f,
            dy3 = -0.006f,
        )
        // h -0.121
        horizontalLineToRelative(dx = -0.121f)
        // l 0.1 0.067
        lineToRelative(dx = 0.1f, dy = 0.067f)
        // l 0.242 0.173
        lineToRelative(dx = 0.242f, dy = 0.173f)
        // a 0.468 0.468 0 0 1 0.087 0.094
        arcToRelative(
            a = 0.468f,
            b = 0.468f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.087f,
            dy1 = 0.094f,
        )
        // a 0.338 0.338 0 0 0 0.168 0.142
        arcToRelative(
            a = 0.338f,
            b = 0.338f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.168f,
            dy1 = 0.142f,
        )
        // a 0.76 0.76 0 0 0 0.358 -0.029
        arcToRelative(
            a = 0.76f,
            b = 0.76f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.358f,
            dy1 = -0.029f,
        )
        // a 1.26 1.26 0 0 1 0.183 -0.035
        arcToRelative(
            a = 1.26f,
            b = 1.26f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.183f,
            dy1 = -0.035f,
        )
        // c 0.214 -0.016 0.582 0 0.585 0
        curveToRelative(
            dx1 = 0.214f,
            dy1 = -0.016f,
            dx2 = 0.582f,
            dy2 = 0.0f,
            dx3 = 0.585f,
            dy3 = 0.0f,
        )
        // h 0.016
        horizontalLineToRelative(dx = 0.016f)
        // l 0.021 -0.02
        lineToRelative(dx = 0.021f, dy = -0.02f)
        // a 0.3 0.3 0 0 1 0.125 -0.089
        arcToRelative(
            a = 0.3f,
            b = 0.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.125f,
            dy1 = -0.089f,
        )
        // a 0.264 0.264 0 0 1 0.121 0
        arcToRelative(
            a = 0.264f,
            b = 0.264f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.121f,
            dy1 = 0.0f,
        )
        // c 0.06 0.019 0.083 0.083 0.064 0.181
        curveToRelative(
            dx1 = 0.06f,
            dy1 = 0.019f,
            dx2 = 0.083f,
            dy2 = 0.083f,
            dx3 = 0.064f,
            dy3 = 0.181f,
        )
        // v 0.017
        verticalLineToRelative(dy = 0.017f)
        // l 0.011 0.014
        lineToRelative(dx = 0.011f, dy = 0.014f)
        // a 0.263 0.263 0 0 0 0.142 0.081
        arcToRelative(
            a = 0.263f,
            b = 0.263f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.142f,
            dy1 = 0.081f,
        )
        // a 0.793 0.793 0 0 0 0.127 0.006
        arcToRelative(
            a = 0.793f,
            b = 0.793f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.127f,
            dy1 = 0.006f,
        )
        // a 0.285 0.285 0 0 1 0.076 0
        arcToRelative(
            a = 0.285f,
            b = 0.285f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.076f,
            dy1 = 0.0f,
        )
        // a 0.7 0.7 0 0 1 0.1 0.036
        arcToRelative(
            a = 0.7f,
            b = 0.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.1f,
            dy1 = 0.036f,
        )
        // a 0.6 0.6 0 0 0 -0.09 0.039
        arcToRelative(
            a = 0.6f,
            b = 0.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.09f,
            dy1 = 0.039f,
        )
        // a 0.4 0.4 0 0 0 -0.091 0.094
        arcToRelative(
            a = 0.4f,
            b = 0.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.091f,
            dy1 = 0.094f,
        )
        // l -0.041 0.059
        lineToRelative(dx = -0.041f, dy = 0.059f)
        // h 0.072
        horizontalLineToRelative(dx = 0.072f)
        // a 0.936 0.936 0 0 1 0.223 0.022
        arcToRelative(
            a = 0.936f,
            b = 0.936f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.223f,
            dy1 = 0.022f,
        )
        // a 0.283 0.283 0 0 1 0.071 0.042
        arcToRelative(
            a = 0.283f,
            b = 0.283f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.071f,
            dy1 = 0.042f,
        )
        // a 0.211 0.211 0 0 0 -0.079 0.026
        arcToRelative(
            a = 0.211f,
            b = 0.211f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.079f,
            dy1 = 0.026f,
        )
        // a 0.691 0.691 0 0 0 -0.1 0.085
        arcToRelative(
            a = 0.691f,
            b = 0.691f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.1f,
            dy1 = 0.085f,
        )
        // l -0.074 0.073
        lineToRelative(dx = -0.074f, dy = 0.073f)
        // l 0.1 -0.01
        lineToRelative(dx = 0.1f, dy = -0.01f)
        // a 0.476 0.476 0 0 1 0.236 0.025
        arcToRelative(
            a = 0.476f,
            b = 0.476f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.236f,
            dy1 = 0.025f,
        )
        // a 0.655 0.655 0 0 1 0.069 0.061
        arcToRelative(
            a = 0.655f,
            b = 0.655f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.069f,
            dy1 = 0.061f,
        )
        // a 0.46 0.46 0 0 0 -0.082 0.012
        arcToRelative(
            a = 0.46f,
            b = 0.46f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.082f,
            dy1 = 0.012f,
        )
        // a 0.489 0.489 0 0 0 -0.1 0.048
        arcToRelative(
            a = 0.489f,
            b = 0.489f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.1f,
            dy1 = 0.048f,
        )
        // l -0.06 0.038
        lineToRelative(dx = -0.06f, dy = 0.038f)
        // l 0.065 0.028
        lineToRelative(dx = 0.065f, dy = 0.028f)
        // a 0.619 0.619 0 0 1 0.183 0.121
        arcToRelative(
            a = 0.619f,
            b = 0.619f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.183f,
            dy1 = 0.121f,
        )
        // a 0.231 0.231 0 0 1 0.04 0.088
        arcToRelative(
            a = 0.231f,
            b = 0.231f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.04f,
            dy1 = 0.088f,
        )
        // c -0.022 -0.011 -0.045 -0.023 -0.064 -0.03
        curveToRelative(
            dx1 = -0.022f,
            dy1 = -0.011f,
            dx2 = -0.045f,
            dy2 = -0.023f,
            dx3 = -0.064f,
            dy3 = -0.03f,
        )
        // a 0.339 0.339 0 0 0 -0.115 -0.01
        arcToRelative(
            a = 0.339f,
            b = 0.339f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.115f,
            dy1 = -0.01f,
        )
        // h -0.041
        horizontalLineToRelative(dx = -0.041f)
        // l 0.044 0.307
        lineToRelative(dx = 0.044f, dy = 0.307f)
        // a 0.278 0.278 0 0 0 0.087 0.132
        arcToRelative(
            a = 0.278f,
            b = 0.278f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.087f,
            dy1 = 0.132f,
        )
        // a 0.3 0.3 0 0 1 0.049 0.06
        arcToRelative(
            a = 0.3f,
            b = 0.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.049f,
            dy1 = 0.06f,
        )
        // c 0.019 0.05 0.018 0.061 -0.016 0.11
        curveToRelative(
            dx1 = 0.019f,
            dy1 = 0.05f,
            dx2 = 0.018f,
            dy2 = 0.061f,
            dx3 = -0.016f,
            dy3 = 0.11f,
        )
        // a 0.243 0.243 0 0 1 -0.221 0.063
        arcToRelative(
            a = 0.243f,
            b = 0.243f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.221f,
            dy1 = 0.063f,
        )
        // a 0.313 0.313 0 0 1 -0.11 -0.057
        arcToRelative(
            a = 0.313f,
            b = 0.313f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.11f,
            dy1 = -0.057f,
        )
        // l -0.034 -0.026
        lineToRelative(dx = -0.034f, dy = -0.026f)
        // l -0.021 0.037
        lineToRelative(dx = -0.021f, dy = 0.037f)
        // a 0.519 0.519 0 0 1 -0.078 0.107
        arcToRelative(
            a = 0.519f,
            b = 0.519f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.078f,
            dy1 = 0.107f,
        )
        // a 0.17 0.17 0 0 1 -0.144 0.051
        arcToRelative(
            a = 0.17f,
            b = 0.17f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.144f,
            dy1 = 0.051f,
        )
        // a 0.2 0.2 0 0 1 -0.13 -0.056
        arcToRelative(
            a = 0.2f,
            b = 0.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.13f,
            dy1 = -0.056f,
        )
        // a 0.439 0.439 0 0 1 -0.075 -0.16
        arcToRelative(
            a = 0.439f,
            b = 0.439f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.075f,
            dy1 = -0.16f,
        )
        // l -0.008 -0.032
        lineToRelative(dx = -0.008f, dy = -0.032f)
        // l -0.22 0.044
        lineToRelative(dx = -0.22f, dy = 0.044f)
        // a 0.276 0.276 0 0 1 -0.137 -0.056
        arcToRelative(
            a = 0.276f,
            b = 0.276f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.137f,
            dy1 = -0.056f,
        )
        // a 0.147 0.147 0 0 1 0.012 -0.167
        arcToRelative(
            a = 0.147f,
            b = 0.147f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.012f,
            dy1 = -0.167f,
        )
        // a 0.341 0.341 0 0 1 0.149 -0.056
        arcToRelative(
            a = 0.341f,
            b = 0.341f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.149f,
            dy1 = -0.056f,
        )
        // a 0.663 0.663 0 0 0 0.11 -0.031
        arcToRelative(
            a = 0.663f,
            b = 0.663f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.11f,
            dy1 = -0.031f,
        )
        // a 0.619 0.619 0 0 0 0.2 -0.171
        arcToRelative(
            a = 0.619f,
            b = 0.619f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.2f,
            dy1 = -0.171f,
        )
        // l 0.026 -0.028
        lineToRelative(dx = 0.026f, dy = -0.028f)
        // l -0.034 -0.021
        lineToRelative(dx = -0.034f, dy = -0.021f)
        // a 4.557 4.557 0 0 1 -0.449 -0.333
        arcToRelative(
            a = 4.557f,
            b = 4.557f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.449f,
            dy1 = -0.333f,
        )
        // a 2.842 2.842 0 0 1 -0.2 -0.235
        arcToRelative(
            a = 2.842f,
            b = 2.842f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.2f,
            dy1 = -0.235f,
        )
        // l -0.016 -0.02
        lineToRelative(dx = -0.016f, dy = -0.02f)
        // l -0.024 0.007
        lineToRelative(dx = -0.024f, dy = 0.007f)
        // s -0.394 0.116 -0.539 0.14
        reflectiveCurveToRelative(
            dx1 = -0.394f,
            dy1 = 0.116f,
            dx2 = -0.539f,
            dy2 = 0.14f,
        )
        // a 3.143 3.143 0 0 1 -0.757 0.018
        arcToRelative(
            a = 3.143f,
            b = 3.143f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.757f,
            dy1 = 0.018f,
        )
        // h -0.013
        horizontalLineToRelative(dx = -0.013f)
        // a 1.34 1.34 0 0 1 -0.81 -0.467
        arcToRelative(
            a = 1.34f,
            b = 1.34f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.81f,
            dy1 = -0.467f,
        )
        // c -0.06 -0.055 -0.122 -0.1 -0.184 -0.158
        curveToRelative(
            dx1 = -0.06f,
            dy1 = -0.055f,
            dx2 = -0.122f,
            dy2 = -0.1f,
            dx3 = -0.184f,
            dy3 = -0.158f,
        )
        // m 2.023 -0.931
        moveToRelative(dx = 2.023f, dy = -0.931f)
        // a 0.467 0.467 0 0 0 -0.037 -0.09
        arcToRelative(
            a = 0.467f,
            b = 0.467f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.037f,
            dy1 = -0.09f,
        )
        // a 0.209 0.209 0 0 1 -0.026 -0.1
        arcToRelative(
            a = 0.209f,
            b = 0.209f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.026f,
            dy1 = -0.1f,
        )
        // a 0.221 0.221 0 0 1 0.032 -0.1
        arcToRelative(
            a = 0.221f,
            b = 0.221f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.032f,
            dy1 = -0.1f,
        )
        // a 0.57 0.57 0 0 0 0.1 0.2
        arcToRelative(
            a = 0.57f,
            b = 0.57f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.1f,
            dy1 = 0.2f,
        )
        // a 0.536 0.536 0 0 0 0.3 0.108
        arcToRelative(
            a = 0.536f,
            b = 0.536f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.3f,
            dy1 = 0.108f,
        )
        // h 0.086
        horizontalLineToRelative(dx = 0.086f)
        // l -0.056 -0.065
        lineToRelative(dx = -0.056f, dy = -0.065f)
        // a 0.213 0.213 0 0 1 -0.069 -0.147
        arcToRelative(
            a = 0.213f,
            b = 0.213f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.069f,
            dy1 = -0.147f,
        )
        // v -0.021
        verticalLineToRelative(dy = -0.021f)
        // a 0.167 0.167 0 0 1 0.013 -0.085
        arcToRelative(
            a = 0.167f,
            b = 0.167f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.013f,
            dy1 = -0.085f,
        )
        // a 0.425 0.425 0 0 0 0.126 0.182
        arcToRelative(
            a = 0.425f,
            b = 0.425f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.126f,
            dy1 = 0.182f,
        )
        // a 0.629 0.629 0 0 0 0.312 0.048
        arcToRelative(
            a = 0.629f,
            b = 0.629f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.312f,
            dy1 = 0.048f,
        )
        // l 0.133 -0.009
        lineToRelative(dx = 0.133f, dy = -0.009f)
        // l -0.119 -0.062
        lineToRelative(dx = -0.119f, dy = -0.062f)
        // a 0.422 0.422 0 0 1 -0.122 -0.1
        arcToRelative(
            a = 0.422f,
            b = 0.422f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.122f,
            dy1 = -0.1f,
        )
        // a 0.1 0.1 0 0 1 -0.031 -0.088
        arcToRelative(
            a = 0.1f,
            b = 0.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.031f,
            dy1 = -0.088f,
        )
        // c 0.005 -0.047 0.093 -0.1 0.167 -0.117
        curveToRelative(
            dx1 = 0.005f,
            dy1 = -0.047f,
            dx2 = 0.093f,
            dy2 = -0.1f,
            dx3 = 0.167f,
            dy3 = -0.117f,
        )
        // a 0.344 0.344 0 0 1 0.333 0.083
        arcToRelative(
            a = 0.344f,
            b = 0.344f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.333f,
            dy1 = 0.083f,
        )
        // a 0.187 0.187 0 0 1 0.058 0.242
        arcToRelative(
            a = 0.187f,
            b = 0.187f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.058f,
            dy1 = 0.242f,
        )
        // c -0.183 0.3 -0.746 0.333 -1.156 0.358
        curveToRelative(
            dx1 = -0.183f,
            dy1 = 0.3f,
            dx2 = -0.746f,
            dy2 = 0.333f,
            dx3 = -1.156f,
            dy3 = 0.358f,
        )
        // c -0.063 0 -0.123 0.007 -0.177 0.012
        curveToRelative(
            dx1 = -0.063f,
            dy1 = 0.0f,
            dx2 = -0.123f,
            dy2 = 0.007f,
            dx3 = -0.177f,
            dy3 = 0.012f,
        )
        // a 4.051 4.051 0 0 1 -0.54 0
        arcToRelative(
            a = 4.051f,
            b = 4.051f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.54f,
            dy1 = 0.0f,
        )
        // l -0.224 -0.01
        lineToRelative(dx = -0.224f, dy = -0.01f)
        // a 4.459 4.459 0 0 1 -0.487 -0.048
        arcToRelative(
            a = 4.459f,
            b = 4.459f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.487f,
            dy1 = -0.048f,
        )
        // a 4.812 4.812 0 0 0 -0.53 -0.051
        arcToRelative(
            a = 4.812f,
            b = 4.812f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.53f,
            dy1 = -0.051f,
        )
        // h -0.085
        horizontalLineToRelative(dx = -0.085f)
        // a 5 5 0 0 0 -0.536 0.034
        arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.536f,
            dy1 = 0.034f,
        )
        // c 0.249 -0.047 0.51 -0.1 0.707 -0.146
        curveToRelative(
            dx1 = 0.249f,
            dy1 = -0.047f,
            dx2 = 0.51f,
            dy2 = -0.1f,
            dx3 = 0.707f,
            dy3 = -0.146f,
        )
        // h 0.023
        horizontalLineToRelative(dx = 0.023f)
        // c 0.329 -0.071 0.83 -0.2 1.162 -0.286
        curveToRelative(
            dx1 = 0.329f,
            dy1 = -0.071f,
            dx2 = 0.83f,
            dy2 = -0.2f,
            dx3 = 1.162f,
            dy3 = -0.286f,
        )
        // l 0.215 -0.055
        lineToRelative(dx = 0.215f, dy = -0.055f)
        // a 0.64 0.64 0 0 0 0.093 0.229
        arcToRelative(
            a = 0.64f,
            b = 0.64f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.093f,
            dy1 = 0.229f,
        )
        // a 0.637 0.637 0 0 0 0.281 0.144
        arcToRelative(
            a = 0.637f,
            b = 0.637f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.281f,
            dy1 = 0.144f,
        )
        // l 0.06 0.015z
        lineToRelative(dx = 0.06f, dy = 0.015f)
        close()
    }
    // M4.578 7.816 c-0.159 0.4 0.489 0.58 0.575 0.143 a1.3 1.3 0 0 1 -0.575 -0.143
    path(
        fill = SolidColor(Color(0xFFFCD41C)),
        pathFillType = PathFillType.EvenOdd,
    ) {
        // M 4.578 7.816
        moveTo(x = 4.578f, y = 7.816f)
        // c -0.159 0.4 0.489 0.58 0.575 0.143
        curveToRelative(
            dx1 = -0.159f,
            dy1 = 0.4f,
            dx2 = 0.489f,
            dy2 = 0.58f,
            dx3 = 0.575f,
            dy3 = 0.143f,
        )
        // a 1.3 1.3 0 0 1 -0.575 -0.143
        arcToRelative(
            a = 1.3f,
            b = 1.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.575f,
            dy1 = -0.143f,
        )
    }
    // M6.5 7.752 a0.113 0.113 0 0 1 -0.02 -0.062 c-0.02 -0.036 -0.043 -0.071 -0.061 -0.108 s-0.056 -0.042 -0.034 -0.068 c0 0 0.062 -0.112 0 -0.177 -0.03 -0.033 -0.041 -0.048 -0.031 -0.084 a0.411 0.411 0 0 0 0.021 -0.17 0.2 0.2 0 0 0 -0.112 -0.177 0.075 0.075 0 0 1 -0.051 -0.082 0.233 0.233 0 0 0 -0.112 -0.216 c-0.058 -0.031 -0.054 -0.094 -0.078 -0.143 l-0.014 -0.015 a0.282 0.282 0 0 0 -0.12 -0.053 0.071 0.071 0 0 1 -0.058 -0.037 c-0.05 -0.089 -0.143 -0.052 -0.214 -0.077 s-0.132 -0.094 -0.222 -0.065 a0.129 0.129 0 0 1 -0.107 0 0.165 0.165 0 0 0 -0.165 0.011 0.161 0.161 0 0 1 -0.122 0.023 0.11 0.11 0 0 0 -0.069 0.007 0.862 0.862 0 0 0 -0.343 0.2 1.19 1.19 0 0 1 -0.19 0.192 0.238 0.238 0 0 0 -0.057 0.247 0.314 0.314 0 0 1 -0.028 0.227 0.307 0.307 0 0 1 -0.082 0.1 0.87 0.87 0 0 0 -0.2 0.239 0.829 0.829 0 0 0 -0.089 0.158 0.416 0.416 0 0 0 -0.012 0.237 0.138 0.138 0 0 1 0 0.1 v0.048 a0.98 0.98 0 0 1 0.061 0.379 s-0.041 0.149 0.046 0.137 a0.177 0.177 0 0 0 0.13 -0.08 c0.017 -0.028 0.041 -0.008 0.05 0.02 s0.021 0.069 0.034 0.1 0.041 0.072 0.076 0.073 c0.1 0 0.169 0.089 0.262 0.112 a0.87 0.87 0 0 0 0.311 0.085 0.672 0.672 0 0 0 0.412 -0.088 v0.007 c0 0.062 0.284 0 0.4 -0.06 a0.36 0.36 0 0 0 0.163 -0.2 0.237 0.237 0 0 1 0.233 -0.181 0.347 0.347 0 0 0 0.268 -0.159 0.2 0.2 0 0 0 0.03 -0.094 V7.94 c-0.012 -0.028 -0.039 -0.058 0.014 -0.074 h0.063 c0.038 -0.034 0.009 -0.077 0.017 -0.114z
    path(
        fill = SolidColor(Color(0xFFFCD41C)),
    ) {
        // M 6.5 7.752
        moveTo(x = 6.5f, y = 7.752f)
        // a 0.113 0.113 0 0 1 -0.02 -0.062
        arcToRelative(
            a = 0.113f,
            b = 0.113f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.02f,
            dy1 = -0.062f,
        )
        // c -0.02 -0.036 -0.043 -0.071 -0.061 -0.108
        curveToRelative(
            dx1 = -0.02f,
            dy1 = -0.036f,
            dx2 = -0.043f,
            dy2 = -0.071f,
            dx3 = -0.061f,
            dy3 = -0.108f,
        )
        // s -0.056 -0.042 -0.034 -0.068
        reflectiveCurveToRelative(
            dx1 = -0.056f,
            dy1 = -0.042f,
            dx2 = -0.034f,
            dy2 = -0.068f,
        )
        // c 0 0 0.062 -0.112 0 -0.177
        curveToRelative(
            dx1 = 0.0f,
            dy1 = 0.0f,
            dx2 = 0.062f,
            dy2 = -0.112f,
            dx3 = 0.0f,
            dy3 = -0.177f,
        )
        // c -0.03 -0.033 -0.041 -0.048 -0.031 -0.084
        curveToRelative(
            dx1 = -0.03f,
            dy1 = -0.033f,
            dx2 = -0.041f,
            dy2 = -0.048f,
            dx3 = -0.031f,
            dy3 = -0.084f,
        )
        // a 0.411 0.411 0 0 0 0.021 -0.17
        arcToRelative(
            a = 0.411f,
            b = 0.411f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.021f,
            dy1 = -0.17f,
        )
        // a 0.2 0.2 0 0 0 -0.112 -0.177
        arcToRelative(
            a = 0.2f,
            b = 0.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.112f,
            dy1 = -0.177f,
        )
        // a 0.075 0.075 0 0 1 -0.051 -0.082
        arcToRelative(
            a = 0.075f,
            b = 0.075f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.051f,
            dy1 = -0.082f,
        )
        // a 0.233 0.233 0 0 0 -0.112 -0.216
        arcToRelative(
            a = 0.233f,
            b = 0.233f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.112f,
            dy1 = -0.216f,
        )
        // c -0.058 -0.031 -0.054 -0.094 -0.078 -0.143
        curveToRelative(
            dx1 = -0.058f,
            dy1 = -0.031f,
            dx2 = -0.054f,
            dy2 = -0.094f,
            dx3 = -0.078f,
            dy3 = -0.143f,
        )
        // l -0.014 -0.015
        lineToRelative(dx = -0.014f, dy = -0.015f)
        // a 0.282 0.282 0 0 0 -0.12 -0.053
        arcToRelative(
            a = 0.282f,
            b = 0.282f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.12f,
            dy1 = -0.053f,
        )
        // a 0.071 0.071 0 0 1 -0.058 -0.037
        arcToRelative(
            a = 0.071f,
            b = 0.071f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.058f,
            dy1 = -0.037f,
        )
        // c -0.05 -0.089 -0.143 -0.052 -0.214 -0.077
        curveToRelative(
            dx1 = -0.05f,
            dy1 = -0.089f,
            dx2 = -0.143f,
            dy2 = -0.052f,
            dx3 = -0.214f,
            dy3 = -0.077f,
        )
        // s -0.132 -0.094 -0.222 -0.065
        reflectiveCurveToRelative(
            dx1 = -0.132f,
            dy1 = -0.094f,
            dx2 = -0.222f,
            dy2 = -0.065f,
        )
        // a 0.129 0.129 0 0 1 -0.107 0
        arcToRelative(
            a = 0.129f,
            b = 0.129f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.107f,
            dy1 = 0.0f,
        )
        // a 0.165 0.165 0 0 0 -0.165 0.011
        arcToRelative(
            a = 0.165f,
            b = 0.165f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.165f,
            dy1 = 0.011f,
        )
        // a 0.161 0.161 0 0 1 -0.122 0.023
        arcToRelative(
            a = 0.161f,
            b = 0.161f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.122f,
            dy1 = 0.023f,
        )
        // a 0.11 0.11 0 0 0 -0.069 0.007
        arcToRelative(
            a = 0.11f,
            b = 0.11f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.069f,
            dy1 = 0.007f,
        )
        // a 0.862 0.862 0 0 0 -0.343 0.2
        arcToRelative(
            a = 0.862f,
            b = 0.862f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.343f,
            dy1 = 0.2f,
        )
        // a 1.19 1.19 0 0 1 -0.19 0.192
        arcToRelative(
            a = 1.19f,
            b = 1.19f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.19f,
            dy1 = 0.192f,
        )
        // a 0.238 0.238 0 0 0 -0.057 0.247
        arcToRelative(
            a = 0.238f,
            b = 0.238f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.057f,
            dy1 = 0.247f,
        )
        // a 0.314 0.314 0 0 1 -0.028 0.227
        arcToRelative(
            a = 0.314f,
            b = 0.314f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.028f,
            dy1 = 0.227f,
        )
        // a 0.307 0.307 0 0 1 -0.082 0.1
        arcToRelative(
            a = 0.307f,
            b = 0.307f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.082f,
            dy1 = 0.1f,
        )
        // a 0.87 0.87 0 0 0 -0.2 0.239
        arcToRelative(
            a = 0.87f,
            b = 0.87f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.2f,
            dy1 = 0.239f,
        )
        // a 0.829 0.829 0 0 0 -0.089 0.158
        arcToRelative(
            a = 0.829f,
            b = 0.829f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.089f,
            dy1 = 0.158f,
        )
        // a 0.416 0.416 0 0 0 -0.012 0.237
        arcToRelative(
            a = 0.416f,
            b = 0.416f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.012f,
            dy1 = 0.237f,
        )
        // a 0.138 0.138 0 0 1 0 0.1
        arcToRelative(
            a = 0.138f,
            b = 0.138f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 0.1f,
        )
        // v 0.048
        verticalLineToRelative(dy = 0.048f)
        // a 0.98 0.98 0 0 1 0.061 0.379
        arcToRelative(
            a = 0.98f,
            b = 0.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.061f,
            dy1 = 0.379f,
        )
        // s -0.041 0.149 0.046 0.137
        reflectiveCurveToRelative(
            dx1 = -0.041f,
            dy1 = 0.149f,
            dx2 = 0.046f,
            dy2 = 0.137f,
        )
        // a 0.177 0.177 0 0 0 0.13 -0.08
        arcToRelative(
            a = 0.177f,
            b = 0.177f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.13f,
            dy1 = -0.08f,
        )
        // c 0.017 -0.028 0.041 -0.008 0.05 0.02
        curveToRelative(
            dx1 = 0.017f,
            dy1 = -0.028f,
            dx2 = 0.041f,
            dy2 = -0.008f,
            dx3 = 0.05f,
            dy3 = 0.02f,
        )
        // s 0.021 0.069 0.034 0.1
        reflectiveCurveToRelative(
            dx1 = 0.021f,
            dy1 = 0.069f,
            dx2 = 0.034f,
            dy2 = 0.1f,
        )
        // s 0.041 0.072 0.076 0.073
        reflectiveCurveToRelative(
            dx1 = 0.041f,
            dy1 = 0.072f,
            dx2 = 0.076f,
            dy2 = 0.073f,
        )
        // c 0.1 0 0.169 0.089 0.262 0.112
        curveToRelative(
            dx1 = 0.1f,
            dy1 = 0.0f,
            dx2 = 0.169f,
            dy2 = 0.089f,
            dx3 = 0.262f,
            dy3 = 0.112f,
        )
        // a 0.87 0.87 0 0 0 0.311 0.085
        arcToRelative(
            a = 0.87f,
            b = 0.87f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.311f,
            dy1 = 0.085f,
        )
        // a 0.672 0.672 0 0 0 0.412 -0.088
        arcToRelative(
            a = 0.672f,
            b = 0.672f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.412f,
            dy1 = -0.088f,
        )
        // v 0.007
        verticalLineToRelative(dy = 0.007f)
        // c 0 0.062 0.284 0 0.4 -0.06
        curveToRelative(
            dx1 = 0.0f,
            dy1 = 0.062f,
            dx2 = 0.284f,
            dy2 = 0.0f,
            dx3 = 0.4f,
            dy3 = -0.06f,
        )
        // a 0.36 0.36 0 0 0 0.163 -0.2
        arcToRelative(
            a = 0.36f,
            b = 0.36f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.163f,
            dy1 = -0.2f,
        )
        // a 0.237 0.237 0 0 1 0.233 -0.181
        arcToRelative(
            a = 0.237f,
            b = 0.237f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.233f,
            dy1 = -0.181f,
        )
        // a 0.347 0.347 0 0 0 0.268 -0.159
        arcToRelative(
            a = 0.347f,
            b = 0.347f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.268f,
            dy1 = -0.159f,
        )
        // a 0.2 0.2 0 0 0 0.03 -0.094
        arcToRelative(
            a = 0.2f,
            b = 0.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.03f,
            dy1 = -0.094f,
        )
        // V 7.94
        verticalLineTo(y = 7.94f)
        // c -0.012 -0.028 -0.039 -0.058 0.014 -0.074
        curveToRelative(
            dx1 = -0.012f,
            dy1 = -0.028f,
            dx2 = -0.039f,
            dy2 = -0.058f,
            dx3 = 0.014f,
            dy3 = -0.074f,
        )
        // h 0.063
        horizontalLineToRelative(dx = 0.063f)
        // c 0.038 -0.034 0.009 -0.077 0.017 -0.114z
        curveToRelative(
            dx1 = 0.038f,
            dy1 = -0.034f,
            dx2 = 0.009f,
            dy2 = -0.077f,
            dx3 = 0.017f,
            dy3 = -0.114f,
        )
        close()
    }
    // M5.792 7.243 a0.142 0.142 0 0 1 -0.179 0.056 c-0.01 -0.01 -0.065 -0.066 -0.084 -0.027 l-0.029 0.053 c-0.035 0.062 -0.118 0.183 -0.223 0.176 a0.089 0.089 0 0 1 -0.077 -0.065 c-0.016 -0.039 0.01 -0.057 0.04 -0.071 a0.069 0.069 0 0 0 0.025 -0.023 l0.013 -0.015 a0.238 0.238 0 0 1 0.135 -0.079 L5.4 7.248 c0.048 0 0.06 -0.04 0.066 -0.077 s0 -0.081 0 -0.122 a0.386 0.386 0 0 0 0.215 0.034 0.424 0.424 0 0 0 0.234 -0.1 c0.027 -0.021 0.019 -0.037 -0.008 -0.048 L5.9 6.929 l-0.032 -0.01 c-0.033 0 -0.068 0.011 -0.092 -0.022 s0 -0.039 0.015 -0.054 0.042 -0.043 0.009 -0.073 -0.056 -0.006 -0.076 0.014 a0.127 0.127 0 0 1 -0.117 0.039 0.206 0.206 0 0 0 -0.122 -0.023 0.1 0.1 0 0 1 -0.048 -0.008 0.04 0.04 0 0 1 0 -0.03 l0.067 -0.141 c0.014 -0.023 0.029 -0.048 0 -0.069 a0.054 0.054 0 0 0 -0.081 0.019 l-0.012 0.029 a0.424 0.424 0 0 0 -0.079 0.182 A1.208 1.208 0 0 0 5.35 7 c0.008 0.041 0 0.061 -0.047 0.053 -0.027 -0.005 -0.059 -0.007 -0.067 0.025 s0.027 0.043 0.054 0.052 0.04 0.011 0.039 0.032 -0.03 0.024 -0.048 0.026 c-0.045 0 -0.074 0.021 -0.079 0.07 a0.042 0.042 0 0 1 -0.039 0.042 0.05 0.05 0 0 1 -0.058 -0.029 0.128 0.128 0 0 0 -0.1 -0.084 c-0.02 -0.006 -0.041 -0.016 -0.042 -0.041 s0.022 -0.034 0.043 -0.036 c0.055 -0.008 0.054 -0.033 0.032 -0.076 s-0.014 -0.088 0.03 -0.1 a0.314 0.314 0 0 0 0.221 -0.308 c-0.01 -0.038 -0.028 -0.065 -0.072 -0.064 -0.045 0.054 -0.02 0.127 -0.051 0.186 s-0.042 0.078 -0.088 0.014 a0.3 0.3 0 0 0 -0.257 -0.126 c-0.094 0 -0.127 0.053 -0.092 0.141 a0.25 0.25 0 0 0 0.143 0.137 c0.076 0.033 0.086 0.081 0.028 0.146 s-0.053 0.126 0.018 0.17 a0.417 0.417 0 0 1 0.119 0.11 c0.04 0.054 0.031 0.094 -0.035 0.111 a0.125 0.125 0 0 1 -0.136 -0.038 c-0.076 -0.1 -0.207 -0.169 -0.216 -0.322 0 -0.037 -0.009 -0.11 -0.066 -0.1 s-0.017 0.074 -0.011 0.113 c0.015 0.094 0.046 0.188 -0.071 0.245 -0.03 0.014 -0.027 0.056 0 0.057 0.092 0 0.073 0.067 0.08 0.121 a0.681 0.681 0 0 0 0.02 0.1 c0.011 0.034 0.027 0.066 0.073 0.047 s0.04 0.016 0.038 0.041 c0 0.068 -0.011 0.135 -0.018 0.2 a0.134 0.134 0 0 0 0.056 0.137 0.313 0.313 0 0 0 0.4 -0.063 0.748 0.748 0 0 0 0.076 -0.162 c0.013 -0.029 0.011 -0.077 0.04 -0.081 s0.036 0.049 0.056 0.074 0.018 0.026 0.028 0.037 c0.035 0.041 0.066 0.036 0.094 -0.008 l0.036 -0.049 a0.537 0.537 0 0 0 0.061 -0.253 0.449 0.449 0 0 1 0.026 -0.113 l0.011 -0.028 c0.013 -0.02 0.036 -0.021 0.066 -0.009 0.06 0.025 0.021 0.066 0.016 0.1 v0.126 a0.03 0.03 0 0 1 0.01 0.032 l0.007 0.031 a0.059 0.059 0 0 1 0.016 0.046 c0.021 0.018 0.038 0.05 0.072 0.028 s0.014 -0.045 0.009 -0.07 a0.8 0.8 0 0 1 -0.017 -0.085 c-0.028 -0.192 0.023 -0.277 0.2 -0.335 0.018 -0.006 0.037 -0.012 0.036 -0.035 a0.039 0.039 0 0 0 -0.037 -0.035 0.159 0.159 0 0 0 -0.165 0.043z M5.557 6.913 a0.024 0.024 0 0 1 0 0.035 c-0.036 0.032 -0.06 0 -0.1 -0.024 0.043 -0.024 0.067 -0.042 0.1 -0.011 M4.868 6.8 a0.062 0.062 0 0 1 -0.052 -0.06 c0 -0.025 0.023 -0.024 0.041 -0.022 s0.049 0 0.047 0.04 c-0.004 0.015 -0.01 0.042 -0.036 0.042z M4.684 7.519 a0.231 0.231 0 0 1 -0.01 -0.123 c0 -0.017 -0.009 -0.049 0.025 -0.046 s0.029 0.029 0.028 0.05 a0.137 0.137 0 0 1 -0.043 0.116z M5.394 7.719 a0.147 0.147 0 0 1 -0.027 -0.109 c0 -0.017 0.01 -0.03 0.029 -0.029 s0.026 0.016 0.024 0.032 a0.162 0.162 0 0 1 -0.026 0.101z
    path(
        fill = SolidColor(Color(0xFF806600)),
    ) {
        // M 5.792 7.243
        moveTo(x = 5.792f, y = 7.243f)
        // a 0.142 0.142 0 0 1 -0.179 0.056
        arcToRelative(
            a = 0.142f,
            b = 0.142f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.179f,
            dy1 = 0.056f,
        )
        // c -0.01 -0.01 -0.065 -0.066 -0.084 -0.027
        curveToRelative(
            dx1 = -0.01f,
            dy1 = -0.01f,
            dx2 = -0.065f,
            dy2 = -0.066f,
            dx3 = -0.084f,
            dy3 = -0.027f,
        )
        // l -0.029 0.053
        lineToRelative(dx = -0.029f, dy = 0.053f)
        // c -0.035 0.062 -0.118 0.183 -0.223 0.176
        curveToRelative(
            dx1 = -0.035f,
            dy1 = 0.062f,
            dx2 = -0.118f,
            dy2 = 0.183f,
            dx3 = -0.223f,
            dy3 = 0.176f,
        )
        // a 0.089 0.089 0 0 1 -0.077 -0.065
        arcToRelative(
            a = 0.089f,
            b = 0.089f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.077f,
            dy1 = -0.065f,
        )
        // c -0.016 -0.039 0.01 -0.057 0.04 -0.071
        curveToRelative(
            dx1 = -0.016f,
            dy1 = -0.039f,
            dx2 = 0.01f,
            dy2 = -0.057f,
            dx3 = 0.04f,
            dy3 = -0.071f,
        )
        // a 0.069 0.069 0 0 0 0.025 -0.023
        arcToRelative(
            a = 0.069f,
            b = 0.069f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.025f,
            dy1 = -0.023f,
        )
        // l 0.013 -0.015
        lineToRelative(dx = 0.013f, dy = -0.015f)
        // a 0.238 0.238 0 0 1 0.135 -0.079
        arcToRelative(
            a = 0.238f,
            b = 0.238f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.135f,
            dy1 = -0.079f,
        )
        // L 5.4 7.248
        lineTo(x = 5.4f, y = 7.248f)
        // c 0.048 0 0.06 -0.04 0.066 -0.077
        curveToRelative(
            dx1 = 0.048f,
            dy1 = 0.0f,
            dx2 = 0.06f,
            dy2 = -0.04f,
            dx3 = 0.066f,
            dy3 = -0.077f,
        )
        // s 0 -0.081 0 -0.122
        reflectiveCurveToRelative(
            dx1 = 0.0f,
            dy1 = -0.081f,
            dx2 = 0.0f,
            dy2 = -0.122f,
        )
        // a 0.386 0.386 0 0 0 0.215 0.034
        arcToRelative(
            a = 0.386f,
            b = 0.386f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.215f,
            dy1 = 0.034f,
        )
        // a 0.424 0.424 0 0 0 0.234 -0.1
        arcToRelative(
            a = 0.424f,
            b = 0.424f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.234f,
            dy1 = -0.1f,
        )
        // c 0.027 -0.021 0.019 -0.037 -0.008 -0.048
        curveToRelative(
            dx1 = 0.027f,
            dy1 = -0.021f,
            dx2 = 0.019f,
            dy2 = -0.037f,
            dx3 = -0.008f,
            dy3 = -0.048f,
        )
        // L 5.9 6.929
        lineTo(x = 5.9f, y = 6.929f)
        // l -0.032 -0.01
        lineToRelative(dx = -0.032f, dy = -0.01f)
        // c -0.033 0 -0.068 0.011 -0.092 -0.022
        curveToRelative(
            dx1 = -0.033f,
            dy1 = 0.0f,
            dx2 = -0.068f,
            dy2 = 0.011f,
            dx3 = -0.092f,
            dy3 = -0.022f,
        )
        // s 0 -0.039 0.015 -0.054
        reflectiveCurveToRelative(
            dx1 = 0.0f,
            dy1 = -0.039f,
            dx2 = 0.015f,
            dy2 = -0.054f,
        )
        // s 0.042 -0.043 0.009 -0.073
        reflectiveCurveToRelative(
            dx1 = 0.042f,
            dy1 = -0.043f,
            dx2 = 0.009f,
            dy2 = -0.073f,
        )
        // s -0.056 -0.006 -0.076 0.014
        reflectiveCurveToRelative(
            dx1 = -0.056f,
            dy1 = -0.006f,
            dx2 = -0.076f,
            dy2 = 0.014f,
        )
        // a 0.127 0.127 0 0 1 -0.117 0.039
        arcToRelative(
            a = 0.127f,
            b = 0.127f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.117f,
            dy1 = 0.039f,
        )
        // a 0.206 0.206 0 0 0 -0.122 -0.023
        arcToRelative(
            a = 0.206f,
            b = 0.206f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.122f,
            dy1 = -0.023f,
        )
        // a 0.1 0.1 0 0 1 -0.048 -0.008
        arcToRelative(
            a = 0.1f,
            b = 0.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.048f,
            dy1 = -0.008f,
        )
        // a 0.04 0.04 0 0 1 0 -0.03
        arcToRelative(
            a = 0.04f,
            b = 0.04f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -0.03f,
        )
        // l 0.067 -0.141
        lineToRelative(dx = 0.067f, dy = -0.141f)
        // c 0.014 -0.023 0.029 -0.048 0 -0.069
        curveToRelative(
            dx1 = 0.014f,
            dy1 = -0.023f,
            dx2 = 0.029f,
            dy2 = -0.048f,
            dx3 = 0.0f,
            dy3 = -0.069f,
        )
        // a 0.054 0.054 0 0 0 -0.081 0.019
        arcToRelative(
            a = 0.054f,
            b = 0.054f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.081f,
            dy1 = 0.019f,
        )
        // l -0.012 0.029
        lineToRelative(dx = -0.012f, dy = 0.029f)
        // a 0.424 0.424 0 0 0 -0.079 0.182
        arcToRelative(
            a = 0.424f,
            b = 0.424f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.079f,
            dy1 = 0.182f,
        )
        // A 1.208 1.208 0 0 0 5.35 7
        arcTo(
            horizontalEllipseRadius = 1.208f,
            verticalEllipseRadius = 1.208f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 5.35f,
            y1 = 7.0f,
        )
        // c 0.008 0.041 0 0.061 -0.047 0.053
        curveToRelative(
            dx1 = 0.008f,
            dy1 = 0.041f,
            dx2 = 0.0f,
            dy2 = 0.061f,
            dx3 = -0.047f,
            dy3 = 0.053f,
        )
        // c -0.027 -0.005 -0.059 -0.007 -0.067 0.025
        curveToRelative(
            dx1 = -0.027f,
            dy1 = -0.005f,
            dx2 = -0.059f,
            dy2 = -0.007f,
            dx3 = -0.067f,
            dy3 = 0.025f,
        )
        // s 0.027 0.043 0.054 0.052
        reflectiveCurveToRelative(
            dx1 = 0.027f,
            dy1 = 0.043f,
            dx2 = 0.054f,
            dy2 = 0.052f,
        )
        // s 0.04 0.011 0.039 0.032
        reflectiveCurveToRelative(
            dx1 = 0.04f,
            dy1 = 0.011f,
            dx2 = 0.039f,
            dy2 = 0.032f,
        )
        // s -0.03 0.024 -0.048 0.026
        reflectiveCurveToRelative(
            dx1 = -0.03f,
            dy1 = 0.024f,
            dx2 = -0.048f,
            dy2 = 0.026f,
        )
        // c -0.045 0 -0.074 0.021 -0.079 0.07
        curveToRelative(
            dx1 = -0.045f,
            dy1 = 0.0f,
            dx2 = -0.074f,
            dy2 = 0.021f,
            dx3 = -0.079f,
            dy3 = 0.07f,
        )
        // a 0.042 0.042 0 0 1 -0.039 0.042
        arcToRelative(
            a = 0.042f,
            b = 0.042f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.039f,
            dy1 = 0.042f,
        )
        // a 0.05 0.05 0 0 1 -0.058 -0.029
        arcToRelative(
            a = 0.05f,
            b = 0.05f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.058f,
            dy1 = -0.029f,
        )
        // a 0.128 0.128 0 0 0 -0.1 -0.084
        arcToRelative(
            a = 0.128f,
            b = 0.128f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.1f,
            dy1 = -0.084f,
        )
        // c -0.02 -0.006 -0.041 -0.016 -0.042 -0.041
        curveToRelative(
            dx1 = -0.02f,
            dy1 = -0.006f,
            dx2 = -0.041f,
            dy2 = -0.016f,
            dx3 = -0.042f,
            dy3 = -0.041f,
        )
        // s 0.022 -0.034 0.043 -0.036
        reflectiveCurveToRelative(
            dx1 = 0.022f,
            dy1 = -0.034f,
            dx2 = 0.043f,
            dy2 = -0.036f,
        )
        // c 0.055 -0.008 0.054 -0.033 0.032 -0.076
        curveToRelative(
            dx1 = 0.055f,
            dy1 = -0.008f,
            dx2 = 0.054f,
            dy2 = -0.033f,
            dx3 = 0.032f,
            dy3 = -0.076f,
        )
        // s -0.014 -0.088 0.03 -0.1
        reflectiveCurveToRelative(
            dx1 = -0.014f,
            dy1 = -0.088f,
            dx2 = 0.03f,
            dy2 = -0.1f,
        )
        // a 0.314 0.314 0 0 0 0.221 -0.308
        arcToRelative(
            a = 0.314f,
            b = 0.314f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.221f,
            dy1 = -0.308f,
        )
        // c -0.01 -0.038 -0.028 -0.065 -0.072 -0.064
        curveToRelative(
            dx1 = -0.01f,
            dy1 = -0.038f,
            dx2 = -0.028f,
            dy2 = -0.065f,
            dx3 = -0.072f,
            dy3 = -0.064f,
        )
        // c -0.045 0.054 -0.02 0.127 -0.051 0.186
        curveToRelative(
            dx1 = -0.045f,
            dy1 = 0.054f,
            dx2 = -0.02f,
            dy2 = 0.127f,
            dx3 = -0.051f,
            dy3 = 0.186f,
        )
        // s -0.042 0.078 -0.088 0.014
        reflectiveCurveToRelative(
            dx1 = -0.042f,
            dy1 = 0.078f,
            dx2 = -0.088f,
            dy2 = 0.014f,
        )
        // a 0.3 0.3 0 0 0 -0.257 -0.126
        arcToRelative(
            a = 0.3f,
            b = 0.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.257f,
            dy1 = -0.126f,
        )
        // c -0.094 0 -0.127 0.053 -0.092 0.141
        curveToRelative(
            dx1 = -0.094f,
            dy1 = 0.0f,
            dx2 = -0.127f,
            dy2 = 0.053f,
            dx3 = -0.092f,
            dy3 = 0.141f,
        )
        // a 0.25 0.25 0 0 0 0.143 0.137
        arcToRelative(
            a = 0.25f,
            b = 0.25f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.143f,
            dy1 = 0.137f,
        )
        // c 0.076 0.033 0.086 0.081 0.028 0.146
        curveToRelative(
            dx1 = 0.076f,
            dy1 = 0.033f,
            dx2 = 0.086f,
            dy2 = 0.081f,
            dx3 = 0.028f,
            dy3 = 0.146f,
        )
        // s -0.053 0.126 0.018 0.17
        reflectiveCurveToRelative(
            dx1 = -0.053f,
            dy1 = 0.126f,
            dx2 = 0.018f,
            dy2 = 0.17f,
        )
        // a 0.417 0.417 0 0 1 0.119 0.11
        arcToRelative(
            a = 0.417f,
            b = 0.417f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.119f,
            dy1 = 0.11f,
        )
        // c 0.04 0.054 0.031 0.094 -0.035 0.111
        curveToRelative(
            dx1 = 0.04f,
            dy1 = 0.054f,
            dx2 = 0.031f,
            dy2 = 0.094f,
            dx3 = -0.035f,
            dy3 = 0.111f,
        )
        // a 0.125 0.125 0 0 1 -0.136 -0.038
        arcToRelative(
            a = 0.125f,
            b = 0.125f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.136f,
            dy1 = -0.038f,
        )
        // c -0.076 -0.1 -0.207 -0.169 -0.216 -0.322
        curveToRelative(
            dx1 = -0.076f,
            dy1 = -0.1f,
            dx2 = -0.207f,
            dy2 = -0.169f,
            dx3 = -0.216f,
            dy3 = -0.322f,
        )
        // c 0 -0.037 -0.009 -0.11 -0.066 -0.1
        curveToRelative(
            dx1 = 0.0f,
            dy1 = -0.037f,
            dx2 = -0.009f,
            dy2 = -0.11f,
            dx3 = -0.066f,
            dy3 = -0.1f,
        )
        // s -0.017 0.074 -0.011 0.113
        reflectiveCurveToRelative(
            dx1 = -0.017f,
            dy1 = 0.074f,
            dx2 = -0.011f,
            dy2 = 0.113f,
        )
        // c 0.015 0.094 0.046 0.188 -0.071 0.245
        curveToRelative(
            dx1 = 0.015f,
            dy1 = 0.094f,
            dx2 = 0.046f,
            dy2 = 0.188f,
            dx3 = -0.071f,
            dy3 = 0.245f,
        )
        // c -0.03 0.014 -0.027 0.056 0 0.057
        curveToRelative(
            dx1 = -0.03f,
            dy1 = 0.014f,
            dx2 = -0.027f,
            dy2 = 0.056f,
            dx3 = 0.0f,
            dy3 = 0.057f,
        )
        // c 0.092 0 0.073 0.067 0.08 0.121
        curveToRelative(
            dx1 = 0.092f,
            dy1 = 0.0f,
            dx2 = 0.073f,
            dy2 = 0.067f,
            dx3 = 0.08f,
            dy3 = 0.121f,
        )
        // a 0.681 0.681 0 0 0 0.02 0.1
        arcToRelative(
            a = 0.681f,
            b = 0.681f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.02f,
            dy1 = 0.1f,
        )
        // c 0.011 0.034 0.027 0.066 0.073 0.047
        curveToRelative(
            dx1 = 0.011f,
            dy1 = 0.034f,
            dx2 = 0.027f,
            dy2 = 0.066f,
            dx3 = 0.073f,
            dy3 = 0.047f,
        )
        // s 0.04 0.016 0.038 0.041
        reflectiveCurveToRelative(
            dx1 = 0.04f,
            dy1 = 0.016f,
            dx2 = 0.038f,
            dy2 = 0.041f,
        )
        // c 0 0.068 -0.011 0.135 -0.018 0.2
        curveToRelative(
            dx1 = 0.0f,
            dy1 = 0.068f,
            dx2 = -0.011f,
            dy2 = 0.135f,
            dx3 = -0.018f,
            dy3 = 0.2f,
        )
        // a 0.134 0.134 0 0 0 0.056 0.137
        arcToRelative(
            a = 0.134f,
            b = 0.134f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.056f,
            dy1 = 0.137f,
        )
        // a 0.313 0.313 0 0 0 0.4 -0.063
        arcToRelative(
            a = 0.313f,
            b = 0.313f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.4f,
            dy1 = -0.063f,
        )
        // a 0.748 0.748 0 0 0 0.076 -0.162
        arcToRelative(
            a = 0.748f,
            b = 0.748f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.076f,
            dy1 = -0.162f,
        )
        // c 0.013 -0.029 0.011 -0.077 0.04 -0.081
        curveToRelative(
            dx1 = 0.013f,
            dy1 = -0.029f,
            dx2 = 0.011f,
            dy2 = -0.077f,
            dx3 = 0.04f,
            dy3 = -0.081f,
        )
        // s 0.036 0.049 0.056 0.074
        reflectiveCurveToRelative(
            dx1 = 0.036f,
            dy1 = 0.049f,
            dx2 = 0.056f,
            dy2 = 0.074f,
        )
        // s 0.018 0.026 0.028 0.037
        reflectiveCurveToRelative(
            dx1 = 0.018f,
            dy1 = 0.026f,
            dx2 = 0.028f,
            dy2 = 0.037f,
        )
        // c 0.035 0.041 0.066 0.036 0.094 -0.008
        curveToRelative(
            dx1 = 0.035f,
            dy1 = 0.041f,
            dx2 = 0.066f,
            dy2 = 0.036f,
            dx3 = 0.094f,
            dy3 = -0.008f,
        )
        // l 0.036 -0.049
        lineToRelative(dx = 0.036f, dy = -0.049f)
        // a 0.537 0.537 0 0 0 0.061 -0.253
        arcToRelative(
            a = 0.537f,
            b = 0.537f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.061f,
            dy1 = -0.253f,
        )
        // a 0.449 0.449 0 0 1 0.026 -0.113
        arcToRelative(
            a = 0.449f,
            b = 0.449f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.026f,
            dy1 = -0.113f,
        )
        // l 0.011 -0.028
        lineToRelative(dx = 0.011f, dy = -0.028f)
        // c 0.013 -0.02 0.036 -0.021 0.066 -0.009
        curveToRelative(
            dx1 = 0.013f,
            dy1 = -0.02f,
            dx2 = 0.036f,
            dy2 = -0.021f,
            dx3 = 0.066f,
            dy3 = -0.009f,
        )
        // c 0.06 0.025 0.021 0.066 0.016 0.1
        curveToRelative(
            dx1 = 0.06f,
            dy1 = 0.025f,
            dx2 = 0.021f,
            dy2 = 0.066f,
            dx3 = 0.016f,
            dy3 = 0.1f,
        )
        // v 0.126
        verticalLineToRelative(dy = 0.126f)
        // a 0.03 0.03 0 0 1 0.01 0.032
        arcToRelative(
            a = 0.03f,
            b = 0.03f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.01f,
            dy1 = 0.032f,
        )
        // l 0.007 0.031
        lineToRelative(dx = 0.007f, dy = 0.031f)
        // a 0.059 0.059 0 0 1 0.016 0.046
        arcToRelative(
            a = 0.059f,
            b = 0.059f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.016f,
            dy1 = 0.046f,
        )
        // c 0.021 0.018 0.038 0.05 0.072 0.028
        curveToRelative(
            dx1 = 0.021f,
            dy1 = 0.018f,
            dx2 = 0.038f,
            dy2 = 0.05f,
            dx3 = 0.072f,
            dy3 = 0.028f,
        )
        // s 0.014 -0.045 0.009 -0.07
        reflectiveCurveToRelative(
            dx1 = 0.014f,
            dy1 = -0.045f,
            dx2 = 0.009f,
            dy2 = -0.07f,
        )
        // a 0.8 0.8 0 0 1 -0.017 -0.085
        arcToRelative(
            a = 0.8f,
            b = 0.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.017f,
            dy1 = -0.085f,
        )
        // c -0.028 -0.192 0.023 -0.277 0.2 -0.335
        curveToRelative(
            dx1 = -0.028f,
            dy1 = -0.192f,
            dx2 = 0.023f,
            dy2 = -0.277f,
            dx3 = 0.2f,
            dy3 = -0.335f,
        )
        // c 0.018 -0.006 0.037 -0.012 0.036 -0.035
        curveToRelative(
            dx1 = 0.018f,
            dy1 = -0.006f,
            dx2 = 0.037f,
            dy2 = -0.012f,
            dx3 = 0.036f,
            dy3 = -0.035f,
        )
        // a 0.039 0.039 0 0 0 -0.037 -0.035
        arcToRelative(
            a = 0.039f,
            b = 0.039f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.037f,
            dy1 = -0.035f,
        )
        // a 0.159 0.159 0 0 0 -0.165 0.043z
        arcToRelative(
            a = 0.159f,
            b = 0.159f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.165f,
            dy1 = 0.043f,
        )
        close()
        // M 5.557 6.913
        moveTo(x = 5.557f, y = 6.913f)
        // a 0.024 0.024 0 0 1 0 0.035
        arcToRelative(
            a = 0.024f,
            b = 0.024f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 0.035f,
        )
        // c -0.036 0.032 -0.06 0 -0.1 -0.024
        curveToRelative(
            dx1 = -0.036f,
            dy1 = 0.032f,
            dx2 = -0.06f,
            dy2 = 0.0f,
            dx3 = -0.1f,
            dy3 = -0.024f,
        )
        // c 0.043 -0.024 0.067 -0.042 0.1 -0.011
        curveToRelative(
            dx1 = 0.043f,
            dy1 = -0.024f,
            dx2 = 0.067f,
            dy2 = -0.042f,
            dx3 = 0.1f,
            dy3 = -0.011f,
        )
        // M 4.868 6.8
        moveTo(x = 4.868f, y = 6.8f)
        // a 0.062 0.062 0 0 1 -0.052 -0.06
        arcToRelative(
            a = 0.062f,
            b = 0.062f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.052f,
            dy1 = -0.06f,
        )
        // c 0 -0.025 0.023 -0.024 0.041 -0.022
        curveToRelative(
            dx1 = 0.0f,
            dy1 = -0.025f,
            dx2 = 0.023f,
            dy2 = -0.024f,
            dx3 = 0.041f,
            dy3 = -0.022f,
        )
        // s 0.049 0 0.047 0.04
        reflectiveCurveToRelative(
            dx1 = 0.049f,
            dy1 = 0.0f,
            dx2 = 0.047f,
            dy2 = 0.04f,
        )
        // c -0.004 0.015 -0.01 0.042 -0.036 0.042z
        curveToRelative(
            dx1 = -0.004f,
            dy1 = 0.015f,
            dx2 = -0.01f,
            dy2 = 0.042f,
            dx3 = -0.036f,
            dy3 = 0.042f,
        )
        close()
        // M 4.684 7.519
        moveTo(x = 4.684f, y = 7.519f)
        // a 0.231 0.231 0 0 1 -0.01 -0.123
        arcToRelative(
            a = 0.231f,
            b = 0.231f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.01f,
            dy1 = -0.123f,
        )
        // c 0 -0.017 -0.009 -0.049 0.025 -0.046
        curveToRelative(
            dx1 = 0.0f,
            dy1 = -0.017f,
            dx2 = -0.009f,
            dy2 = -0.049f,
            dx3 = 0.025f,
            dy3 = -0.046f,
        )
        // s 0.029 0.029 0.028 0.05
        reflectiveCurveToRelative(
            dx1 = 0.029f,
            dy1 = 0.029f,
            dx2 = 0.028f,
            dy2 = 0.05f,
        )
        // a 0.137 0.137 0 0 1 -0.043 0.116z
        arcToRelative(
            a = 0.137f,
            b = 0.137f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.043f,
            dy1 = 0.116f,
        )
        close()
        // M 5.394 7.719
        moveTo(x = 5.394f, y = 7.719f)
        // a 0.147 0.147 0 0 1 -0.027 -0.109
        arcToRelative(
            a = 0.147f,
            b = 0.147f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.027f,
            dy1 = -0.109f,
        )
        // c 0 -0.017 0.01 -0.03 0.029 -0.029
        curveToRelative(
            dx1 = 0.0f,
            dy1 = -0.017f,
            dx2 = 0.01f,
            dy2 = -0.03f,
            dx3 = 0.029f,
            dy3 = -0.029f,
        )
        // s 0.026 0.016 0.024 0.032
        reflectiveCurveToRelative(
            dx1 = 0.026f,
            dy1 = 0.016f,
            dx2 = 0.024f,
            dy2 = 0.032f,
        )
        // a 0.162 0.162 0 0 1 -0.026 0.101z
        arcToRelative(
            a = 0.162f,
            b = 0.162f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.026f,
            dy1 = 0.101f,
        )
        close()
    }
}

private fun ImageVector.Builder.emoji1f1e81f1f6Chunk2() {
    // M6.5 7.752 a0.113 0.113 0 0 1 -0.02 -0.062 c-0.02 -0.036 -0.043 -0.071 -0.061 -0.108 s-0.056 -0.042 -0.034 -0.068 c0 0 0.062 -0.112 0 -0.177 -0.03 -0.033 -0.041 -0.048 -0.031 -0.084 a0.411 0.411 0 0 0 0.021 -0.17 0.2 0.2 0 0 0 -0.112 -0.177 0.075 0.075 0 0 1 -0.051 -0.082 0.233 0.233 0 0 0 -0.112 -0.216 c-0.058 -0.031 -0.054 -0.094 -0.078 -0.143 l-0.014 -0.015 a0.282 0.282 0 0 0 -0.12 -0.053 0.071 0.071 0 0 1 -0.058 -0.037 c-0.05 -0.089 -0.143 -0.052 -0.214 -0.077 s-0.132 -0.094 -0.222 -0.065 a0.129 0.129 0 0 1 -0.107 0 0.165 0.165 0 0 0 -0.165 0.011 0.161 0.161 0 0 1 -0.122 0.023 0.11 0.11 0 0 0 -0.069 0.007 0.862 0.862 0 0 0 -0.343 0.2 1.19 1.19 0 0 1 -0.19 0.192 0.238 0.238 0 0 0 -0.057 0.247 0.314 0.314 0 0 1 -0.028 0.227 0.307 0.307 0 0 1 -0.082 0.1 0.87 0.87 0 0 0 -0.2 0.239 0.829 0.829 0 0 0 -0.089 0.158 0.416 0.416 0 0 0 -0.012 0.237 0.138 0.138 0 0 1 0 0.1 v0.048 a0.98 0.98 0 0 1 0.061 0.379 s-0.041 0.149 0.046 0.137 a0.177 0.177 0 0 0 0.13 -0.08 c0.017 -0.028 0.041 -0.008 0.05 0.02 s0.021 0.069 0.034 0.1 0.041 0.072 0.076 0.073 c0.1 0 0.169 0.089 0.262 0.112 a0.87 0.87 0 0 0 0.311 0.085 0.672 0.672 0 0 0 0.412 -0.088 v0.007 c0 0.062 0.284 0 0.4 -0.06 a0.36 0.36 0 0 0 0.163 -0.2 0.237 0.237 0 0 1 0.233 -0.181 0.347 0.347 0 0 0 0.268 -0.159 0.2 0.2 0 0 0 0.03 -0.094 L6.406 7.94 c-0.012 -0.028 -0.039 -0.058 0.014 -0.074 h0.063 c0.038 -0.034 0.009 -0.077 0.017 -0.114z M4.648 8.668 c-0.025 0 -0.058 0.012 -0.07 -0.018 s0.018 -0.041 0.032 -0.057 a0.709 0.709 0 0 0 0.1 -0.148 c0.012 -0.026 0.025 -0.058 -0.009 -0.076 s-0.046 0.014 -0.06 0.035 a0.878 0.878 0 0 1 -0.1 0.132 0.14 0.14 0 0 1 -0.128 0.042 c-0.081 -0.013 -0.1 -0.05 -0.07 -0.126 0.02 -0.045 0.044 -0.089 0.063 -0.134 0.025 -0.061 0 -0.093 -0.063 -0.084 a0.462 0.462 0 0 0 -0.209 0.1 c-0.013 0.011 -0.025 0.032 -0.046 0.021 s-0.009 -0.033 -0.012 -0.046 a0.51 0.51 0 0 1 0.289 -0.424 c0.049 -0.029 0.056 0.006 0.065 0.042 a0.467 0.467 0 0 0 0.25 0.332 0.678 0.678 0 0 0 0.231 0.034 c0.075 0.008 0.087 0.023 0.051 0.086 a0.523 0.523 0 0 1 -0.251 0.269 0.234 0.234 0 0 1 -0.064 0.02z M4.848 8.745 c-0.018 0 -0.041 0 -0.048 -0.02 s0.015 -0.031 0.029 -0.041 a0.589 0.589 0 0 0 0.238 -0.319 0.173 0.173 0 0 1 0.117 -0.112 0.519 0.519 0 0 0 0.162 -0.079 c0.056 -0.041 0.073 -0.018 0.072 0.04 v0.102 c0.002 0.411 -0.297 0.469 -0.571 0.429z M6.374 7.764 c-0.031 0.016 -0.037 -0.016 -0.05 -0.034 a0.459 0.459 0 0 0 -0.115 -0.13 c-0.027 -0.017 -0.056 -0.056 -0.087 -0.015 s0.009 0.056 0.03 0.079 A0.511 0.511 0 0 1 6.311 8 a0.218 0.218 0 0 1 -0.149 0.224 c-0.053 0.018 -0.077 0.009 -0.061 -0.052 a0.491 0.491 0 0 0 0 -0.2 c0 -0.037 -0.017 -0.075 -0.057 -0.07 s-0.037 0.046 -0.032 0.081 a0.328 0.328 0 0 1 -0.057 0.274 c-0.032 0.036 -0.06 0.057 -0.074 -0.013 a0.481 0.481 0 0 0 -0.035 -0.1 c-0.015 -0.03 -0.033 -0.07 -0.074 -0.052 s-0.025 0.059 -0.008 0.088 a0.419 0.419 0 0 1 0.036 0.12 0.281 0.281 0 0 1 -0.062 0.25 0.377 0.377 0 0 1 -0.348 0.132 h-0.015 A0.445 0.445 0 0 0 5.5 8.46 a0.153 0.153 0 0 1 0.012 -0.079 l0.006 -0.094 a0.174 0.174 0 0 1 0 -0.1 0.254 0.254 0 0 1 0.046 -0.234 s0.059 -0.043 0.054 -0.095 -0.072 -0.084 -0.107 -0.014 a0.58 0.58 0 0 1 -0.433 0.351 c-0.319 0.072 -0.538 -0.023 -0.575 -0.392 a1.4 1.4 0 0 1 0 -0.259 c0 -0.026 0.008 -0.057 -0.026 -0.064 s-0.045 0.027 -0.052 0.055 a0.694 0.694 0 0 0 -0.013 0.187 0.066 0.066 0 0 1 -0.044 0.073 0.685 0.685 0 0 0 -0.285 0.228 c-0.008 0.01 -0.016 0.023 -0.031 0.02 S4.028 8.02 4.027 8 a0.4 0.4 0 0 1 0.13 -0.3 c0.022 -0.024 0.087 -0.043 0.042 -0.089 s-0.077 0 -0.109 0.03 -0.035 0.045 -0.076 0.059 a0.258 0.258 0 0 1 0.086 -0.171 0.418 0.418 0 0 1 0.109 -0.076 c0.085 -0.048 0.086 -0.064 0.009 -0.121 a0.092 0.092 0 0 1 0.069 -0.03 0.07 0.07 0 0 0 0.069 -0.063 0.252 0.252 0 0 1 0.08 -0.15 0.08 0.08 0 0 0 0.015 -0.111 0.213 0.213 0 0 1 -0.025 -0.192 0.19 0.19 0 0 1 0.039 0.137 c0 0.03 0 0.064 0.044 0.06 s0.039 -0.033 0.037 -0.06 c0 -0.07 0 -0.142 -0.06 -0.2 -0.04 -0.037 0 -0.054 0.024 -0.056 0.072 0 0.109 -0.031 0.107 -0.109 s0.089 -0.045 0.111 -0.093 0.051 -0.085 0.114 -0.057 c0.032 0.014 0.056 0 0.072 -0.031 0.034 -0.06 0.076 -0.068 0.126 -0.021 s0.063 0.017 0.09 -0.016 c0.07 -0.084 0.075 -0.084 0.152 0 0.029 0.031 0.053 0.02 0.081 0 0.108 -0.081 0.156 -0.06 0.178 0.077 a0.082 0.082 0 0 0 0.071 0.013 0.041 0.041 0 0 1 0.032 -0.03 c0.052 -0.042 0.095 -0.044 0.115 0.03 a0.064 0.064 0 0 0 0.078 0.055 c0.092 0 0.111 0.012 0.128 0.106 a0.089 0.089 0 0 0 0.058 0.082 c0.1 0.035 0.121 0.093 0.1 0.2 s-0.021 0.1 0.078 0.108 c0.076 0.015 0.093 0.067 0.088 0.135 a0.1 0.1 0 0 1 0 0.076 0.029 0.029 0 0 1 -0.006 0.032 0.189 0.189 0 0 1 -0.044 0.1 0.06 0.06 0 0 0 0 0.077 c0.034 0.014 0.076 0 0.114 0.029 -0.041 0.036 -0.089 0.019 -0.131 0.027 -0.028 0.039 -0.007 0.061 0.026 0.081 a0.283 0.283 0 0 1 0.135 0.175 c-0.005 0.011 0.017 0.036 -0.01 0.051z
    path(
        fill = SolidColor(Color(0xFF806600)),
    ) {
        // M 6.5 7.752
        moveTo(x = 6.5f, y = 7.752f)
        // a 0.113 0.113 0 0 1 -0.02 -0.062
        arcToRelative(
            a = 0.113f,
            b = 0.113f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.02f,
            dy1 = -0.062f,
        )
        // c -0.02 -0.036 -0.043 -0.071 -0.061 -0.108
        curveToRelative(
            dx1 = -0.02f,
            dy1 = -0.036f,
            dx2 = -0.043f,
            dy2 = -0.071f,
            dx3 = -0.061f,
            dy3 = -0.108f,
        )
        // s -0.056 -0.042 -0.034 -0.068
        reflectiveCurveToRelative(
            dx1 = -0.056f,
            dy1 = -0.042f,
            dx2 = -0.034f,
            dy2 = -0.068f,
        )
        // c 0 0 0.062 -0.112 0 -0.177
        curveToRelative(
            dx1 = 0.0f,
            dy1 = 0.0f,
            dx2 = 0.062f,
            dy2 = -0.112f,
            dx3 = 0.0f,
            dy3 = -0.177f,
        )
        // c -0.03 -0.033 -0.041 -0.048 -0.031 -0.084
        curveToRelative(
            dx1 = -0.03f,
            dy1 = -0.033f,
            dx2 = -0.041f,
            dy2 = -0.048f,
            dx3 = -0.031f,
            dy3 = -0.084f,
        )
        // a 0.411 0.411 0 0 0 0.021 -0.17
        arcToRelative(
            a = 0.411f,
            b = 0.411f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.021f,
            dy1 = -0.17f,
        )
        // a 0.2 0.2 0 0 0 -0.112 -0.177
        arcToRelative(
            a = 0.2f,
            b = 0.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.112f,
            dy1 = -0.177f,
        )
        // a 0.075 0.075 0 0 1 -0.051 -0.082
        arcToRelative(
            a = 0.075f,
            b = 0.075f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.051f,
            dy1 = -0.082f,
        )
        // a 0.233 0.233 0 0 0 -0.112 -0.216
        arcToRelative(
            a = 0.233f,
            b = 0.233f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.112f,
            dy1 = -0.216f,
        )
        // c -0.058 -0.031 -0.054 -0.094 -0.078 -0.143
        curveToRelative(
            dx1 = -0.058f,
            dy1 = -0.031f,
            dx2 = -0.054f,
            dy2 = -0.094f,
            dx3 = -0.078f,
            dy3 = -0.143f,
        )
        // l -0.014 -0.015
        lineToRelative(dx = -0.014f, dy = -0.015f)
        // a 0.282 0.282 0 0 0 -0.12 -0.053
        arcToRelative(
            a = 0.282f,
            b = 0.282f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.12f,
            dy1 = -0.053f,
        )
        // a 0.071 0.071 0 0 1 -0.058 -0.037
        arcToRelative(
            a = 0.071f,
            b = 0.071f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.058f,
            dy1 = -0.037f,
        )
        // c -0.05 -0.089 -0.143 -0.052 -0.214 -0.077
        curveToRelative(
            dx1 = -0.05f,
            dy1 = -0.089f,
            dx2 = -0.143f,
            dy2 = -0.052f,
            dx3 = -0.214f,
            dy3 = -0.077f,
        )
        // s -0.132 -0.094 -0.222 -0.065
        reflectiveCurveToRelative(
            dx1 = -0.132f,
            dy1 = -0.094f,
            dx2 = -0.222f,
            dy2 = -0.065f,
        )
        // a 0.129 0.129 0 0 1 -0.107 0
        arcToRelative(
            a = 0.129f,
            b = 0.129f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.107f,
            dy1 = 0.0f,
        )
        // a 0.165 0.165 0 0 0 -0.165 0.011
        arcToRelative(
            a = 0.165f,
            b = 0.165f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.165f,
            dy1 = 0.011f,
        )
        // a 0.161 0.161 0 0 1 -0.122 0.023
        arcToRelative(
            a = 0.161f,
            b = 0.161f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.122f,
            dy1 = 0.023f,
        )
        // a 0.11 0.11 0 0 0 -0.069 0.007
        arcToRelative(
            a = 0.11f,
            b = 0.11f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.069f,
            dy1 = 0.007f,
        )
        // a 0.862 0.862 0 0 0 -0.343 0.2
        arcToRelative(
            a = 0.862f,
            b = 0.862f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.343f,
            dy1 = 0.2f,
        )
        // a 1.19 1.19 0 0 1 -0.19 0.192
        arcToRelative(
            a = 1.19f,
            b = 1.19f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.19f,
            dy1 = 0.192f,
        )
        // a 0.238 0.238 0 0 0 -0.057 0.247
        arcToRelative(
            a = 0.238f,
            b = 0.238f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.057f,
            dy1 = 0.247f,
        )
        // a 0.314 0.314 0 0 1 -0.028 0.227
        arcToRelative(
            a = 0.314f,
            b = 0.314f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.028f,
            dy1 = 0.227f,
        )
        // a 0.307 0.307 0 0 1 -0.082 0.1
        arcToRelative(
            a = 0.307f,
            b = 0.307f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.082f,
            dy1 = 0.1f,
        )
        // a 0.87 0.87 0 0 0 -0.2 0.239
        arcToRelative(
            a = 0.87f,
            b = 0.87f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.2f,
            dy1 = 0.239f,
        )
        // a 0.829 0.829 0 0 0 -0.089 0.158
        arcToRelative(
            a = 0.829f,
            b = 0.829f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.089f,
            dy1 = 0.158f,
        )
        // a 0.416 0.416 0 0 0 -0.012 0.237
        arcToRelative(
            a = 0.416f,
            b = 0.416f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.012f,
            dy1 = 0.237f,
        )
        // a 0.138 0.138 0 0 1 0 0.1
        arcToRelative(
            a = 0.138f,
            b = 0.138f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 0.1f,
        )
        // v 0.048
        verticalLineToRelative(dy = 0.048f)
        // a 0.98 0.98 0 0 1 0.061 0.379
        arcToRelative(
            a = 0.98f,
            b = 0.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.061f,
            dy1 = 0.379f,
        )
        // s -0.041 0.149 0.046 0.137
        reflectiveCurveToRelative(
            dx1 = -0.041f,
            dy1 = 0.149f,
            dx2 = 0.046f,
            dy2 = 0.137f,
        )
        // a 0.177 0.177 0 0 0 0.13 -0.08
        arcToRelative(
            a = 0.177f,
            b = 0.177f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.13f,
            dy1 = -0.08f,
        )
        // c 0.017 -0.028 0.041 -0.008 0.05 0.02
        curveToRelative(
            dx1 = 0.017f,
            dy1 = -0.028f,
            dx2 = 0.041f,
            dy2 = -0.008f,
            dx3 = 0.05f,
            dy3 = 0.02f,
        )
        // s 0.021 0.069 0.034 0.1
        reflectiveCurveToRelative(
            dx1 = 0.021f,
            dy1 = 0.069f,
            dx2 = 0.034f,
            dy2 = 0.1f,
        )
        // s 0.041 0.072 0.076 0.073
        reflectiveCurveToRelative(
            dx1 = 0.041f,
            dy1 = 0.072f,
            dx2 = 0.076f,
            dy2 = 0.073f,
        )
        // c 0.1 0 0.169 0.089 0.262 0.112
        curveToRelative(
            dx1 = 0.1f,
            dy1 = 0.0f,
            dx2 = 0.169f,
            dy2 = 0.089f,
            dx3 = 0.262f,
            dy3 = 0.112f,
        )
        // a 0.87 0.87 0 0 0 0.311 0.085
        arcToRelative(
            a = 0.87f,
            b = 0.87f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.311f,
            dy1 = 0.085f,
        )
        // a 0.672 0.672 0 0 0 0.412 -0.088
        arcToRelative(
            a = 0.672f,
            b = 0.672f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.412f,
            dy1 = -0.088f,
        )
        // v 0.007
        verticalLineToRelative(dy = 0.007f)
        // c 0 0.062 0.284 0 0.4 -0.06
        curveToRelative(
            dx1 = 0.0f,
            dy1 = 0.062f,
            dx2 = 0.284f,
            dy2 = 0.0f,
            dx3 = 0.4f,
            dy3 = -0.06f,
        )
        // a 0.36 0.36 0 0 0 0.163 -0.2
        arcToRelative(
            a = 0.36f,
            b = 0.36f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.163f,
            dy1 = -0.2f,
        )
        // a 0.237 0.237 0 0 1 0.233 -0.181
        arcToRelative(
            a = 0.237f,
            b = 0.237f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.233f,
            dy1 = -0.181f,
        )
        // a 0.347 0.347 0 0 0 0.268 -0.159
        arcToRelative(
            a = 0.347f,
            b = 0.347f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.268f,
            dy1 = -0.159f,
        )
        // a 0.2 0.2 0 0 0 0.03 -0.094
        arcToRelative(
            a = 0.2f,
            b = 0.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.03f,
            dy1 = -0.094f,
        )
        // L 6.406 7.94
        lineTo(x = 6.406f, y = 7.94f)
        // c -0.012 -0.028 -0.039 -0.058 0.014 -0.074
        curveToRelative(
            dx1 = -0.012f,
            dy1 = -0.028f,
            dx2 = -0.039f,
            dy2 = -0.058f,
            dx3 = 0.014f,
            dy3 = -0.074f,
        )
        // h 0.063
        horizontalLineToRelative(dx = 0.063f)
        // c 0.038 -0.034 0.009 -0.077 0.017 -0.114z
        curveToRelative(
            dx1 = 0.038f,
            dy1 = -0.034f,
            dx2 = 0.009f,
            dy2 = -0.077f,
            dx3 = 0.017f,
            dy3 = -0.114f,
        )
        close()
        // M 4.648 8.668
        moveTo(x = 4.648f, y = 8.668f)
        // c -0.025 0 -0.058 0.012 -0.07 -0.018
        curveToRelative(
            dx1 = -0.025f,
            dy1 = 0.0f,
            dx2 = -0.058f,
            dy2 = 0.012f,
            dx3 = -0.07f,
            dy3 = -0.018f,
        )
        // s 0.018 -0.041 0.032 -0.057
        reflectiveCurveToRelative(
            dx1 = 0.018f,
            dy1 = -0.041f,
            dx2 = 0.032f,
            dy2 = -0.057f,
        )
        // a 0.709 0.709 0 0 0 0.1 -0.148
        arcToRelative(
            a = 0.709f,
            b = 0.709f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.1f,
            dy1 = -0.148f,
        )
        // c 0.012 -0.026 0.025 -0.058 -0.009 -0.076
        curveToRelative(
            dx1 = 0.012f,
            dy1 = -0.026f,
            dx2 = 0.025f,
            dy2 = -0.058f,
            dx3 = -0.009f,
            dy3 = -0.076f,
        )
        // s -0.046 0.014 -0.06 0.035
        reflectiveCurveToRelative(
            dx1 = -0.046f,
            dy1 = 0.014f,
            dx2 = -0.06f,
            dy2 = 0.035f,
        )
        // a 0.878 0.878 0 0 1 -0.1 0.132
        arcToRelative(
            a = 0.878f,
            b = 0.878f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.1f,
            dy1 = 0.132f,
        )
        // a 0.14 0.14 0 0 1 -0.128 0.042
        arcToRelative(
            a = 0.14f,
            b = 0.14f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.128f,
            dy1 = 0.042f,
        )
        // c -0.081 -0.013 -0.1 -0.05 -0.07 -0.126
        curveToRelative(
            dx1 = -0.081f,
            dy1 = -0.013f,
            dx2 = -0.1f,
            dy2 = -0.05f,
            dx3 = -0.07f,
            dy3 = -0.126f,
        )
        // c 0.02 -0.045 0.044 -0.089 0.063 -0.134
        curveToRelative(
            dx1 = 0.02f,
            dy1 = -0.045f,
            dx2 = 0.044f,
            dy2 = -0.089f,
            dx3 = 0.063f,
            dy3 = -0.134f,
        )
        // c 0.025 -0.061 0 -0.093 -0.063 -0.084
        curveToRelative(
            dx1 = 0.025f,
            dy1 = -0.061f,
            dx2 = 0.0f,
            dy2 = -0.093f,
            dx3 = -0.063f,
            dy3 = -0.084f,
        )
        // a 0.462 0.462 0 0 0 -0.209 0.1
        arcToRelative(
            a = 0.462f,
            b = 0.462f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.209f,
            dy1 = 0.1f,
        )
        // c -0.013 0.011 -0.025 0.032 -0.046 0.021
        curveToRelative(
            dx1 = -0.013f,
            dy1 = 0.011f,
            dx2 = -0.025f,
            dy2 = 0.032f,
            dx3 = -0.046f,
            dy3 = 0.021f,
        )
        // s -0.009 -0.033 -0.012 -0.046
        reflectiveCurveToRelative(
            dx1 = -0.009f,
            dy1 = -0.033f,
            dx2 = -0.012f,
            dy2 = -0.046f,
        )
        // a 0.51 0.51 0 0 1 0.289 -0.424
        arcToRelative(
            a = 0.51f,
            b = 0.51f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.289f,
            dy1 = -0.424f,
        )
        // c 0.049 -0.029 0.056 0.006 0.065 0.042
        curveToRelative(
            dx1 = 0.049f,
            dy1 = -0.029f,
            dx2 = 0.056f,
            dy2 = 0.006f,
            dx3 = 0.065f,
            dy3 = 0.042f,
        )
        // a 0.467 0.467 0 0 0 0.25 0.332
        arcToRelative(
            a = 0.467f,
            b = 0.467f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.25f,
            dy1 = 0.332f,
        )
        // a 0.678 0.678 0 0 0 0.231 0.034
        arcToRelative(
            a = 0.678f,
            b = 0.678f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.231f,
            dy1 = 0.034f,
        )
        // c 0.075 0.008 0.087 0.023 0.051 0.086
        curveToRelative(
            dx1 = 0.075f,
            dy1 = 0.008f,
            dx2 = 0.087f,
            dy2 = 0.023f,
            dx3 = 0.051f,
            dy3 = 0.086f,
        )
        // a 0.523 0.523 0 0 1 -0.251 0.269
        arcToRelative(
            a = 0.523f,
            b = 0.523f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.251f,
            dy1 = 0.269f,
        )
        // a 0.234 0.234 0 0 1 -0.064 0.02z
        arcToRelative(
            a = 0.234f,
            b = 0.234f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.064f,
            dy1 = 0.02f,
        )
        close()
        // M 4.848 8.745
        moveTo(x = 4.848f, y = 8.745f)
        // c -0.018 0 -0.041 0 -0.048 -0.02
        curveToRelative(
            dx1 = -0.018f,
            dy1 = 0.0f,
            dx2 = -0.041f,
            dy2 = 0.0f,
            dx3 = -0.048f,
            dy3 = -0.02f,
        )
        // s 0.015 -0.031 0.029 -0.041
        reflectiveCurveToRelative(
            dx1 = 0.015f,
            dy1 = -0.031f,
            dx2 = 0.029f,
            dy2 = -0.041f,
        )
        // a 0.589 0.589 0 0 0 0.238 -0.319
        arcToRelative(
            a = 0.589f,
            b = 0.589f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.238f,
            dy1 = -0.319f,
        )
        // a 0.173 0.173 0 0 1 0.117 -0.112
        arcToRelative(
            a = 0.173f,
            b = 0.173f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.117f,
            dy1 = -0.112f,
        )
        // a 0.519 0.519 0 0 0 0.162 -0.079
        arcToRelative(
            a = 0.519f,
            b = 0.519f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.162f,
            dy1 = -0.079f,
        )
        // c 0.056 -0.041 0.073 -0.018 0.072 0.04
        curveToRelative(
            dx1 = 0.056f,
            dy1 = -0.041f,
            dx2 = 0.073f,
            dy2 = -0.018f,
            dx3 = 0.072f,
            dy3 = 0.04f,
        )
        // v 0.102
        verticalLineToRelative(dy = 0.102f)
        // c 0.002 0.411 -0.297 0.469 -0.571 0.429z
        curveToRelative(
            dx1 = 0.002f,
            dy1 = 0.411f,
            dx2 = -0.297f,
            dy2 = 0.469f,
            dx3 = -0.571f,
            dy3 = 0.429f,
        )
        close()
        // M 6.374 7.764
        moveTo(x = 6.374f, y = 7.764f)
        // c -0.031 0.016 -0.037 -0.016 -0.05 -0.034
        curveToRelative(
            dx1 = -0.031f,
            dy1 = 0.016f,
            dx2 = -0.037f,
            dy2 = -0.016f,
            dx3 = -0.05f,
            dy3 = -0.034f,
        )
        // a 0.459 0.459 0 0 0 -0.115 -0.13
        arcToRelative(
            a = 0.459f,
            b = 0.459f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.115f,
            dy1 = -0.13f,
        )
        // c -0.027 -0.017 -0.056 -0.056 -0.087 -0.015
        curveToRelative(
            dx1 = -0.027f,
            dy1 = -0.017f,
            dx2 = -0.056f,
            dy2 = -0.056f,
            dx3 = -0.087f,
            dy3 = -0.015f,
        )
        // s 0.009 0.056 0.03 0.079
        reflectiveCurveToRelative(
            dx1 = 0.009f,
            dy1 = 0.056f,
            dx2 = 0.03f,
            dy2 = 0.079f,
        )
        // A 0.511 0.511 0 0 1 6.311 8
        arcTo(
            horizontalEllipseRadius = 0.511f,
            verticalEllipseRadius = 0.511f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 6.311f,
            y1 = 8.0f,
        )
        // a 0.218 0.218 0 0 1 -0.149 0.224
        arcToRelative(
            a = 0.218f,
            b = 0.218f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.149f,
            dy1 = 0.224f,
        )
        // c -0.053 0.018 -0.077 0.009 -0.061 -0.052
        curveToRelative(
            dx1 = -0.053f,
            dy1 = 0.018f,
            dx2 = -0.077f,
            dy2 = 0.009f,
            dx3 = -0.061f,
            dy3 = -0.052f,
        )
        // a 0.491 0.491 0 0 0 0 -0.2
        arcToRelative(
            a = 0.491f,
            b = 0.491f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -0.2f,
        )
        // c 0 -0.037 -0.017 -0.075 -0.057 -0.07
        curveToRelative(
            dx1 = 0.0f,
            dy1 = -0.037f,
            dx2 = -0.017f,
            dy2 = -0.075f,
            dx3 = -0.057f,
            dy3 = -0.07f,
        )
        // s -0.037 0.046 -0.032 0.081
        reflectiveCurveToRelative(
            dx1 = -0.037f,
            dy1 = 0.046f,
            dx2 = -0.032f,
            dy2 = 0.081f,
        )
        // a 0.328 0.328 0 0 1 -0.057 0.274
        arcToRelative(
            a = 0.328f,
            b = 0.328f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.057f,
            dy1 = 0.274f,
        )
        // c -0.032 0.036 -0.06 0.057 -0.074 -0.013
        curveToRelative(
            dx1 = -0.032f,
            dy1 = 0.036f,
            dx2 = -0.06f,
            dy2 = 0.057f,
            dx3 = -0.074f,
            dy3 = -0.013f,
        )
        // a 0.481 0.481 0 0 0 -0.035 -0.1
        arcToRelative(
            a = 0.481f,
            b = 0.481f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.035f,
            dy1 = -0.1f,
        )
        // c -0.015 -0.03 -0.033 -0.07 -0.074 -0.052
        curveToRelative(
            dx1 = -0.015f,
            dy1 = -0.03f,
            dx2 = -0.033f,
            dy2 = -0.07f,
            dx3 = -0.074f,
            dy3 = -0.052f,
        )
        // s -0.025 0.059 -0.008 0.088
        reflectiveCurveToRelative(
            dx1 = -0.025f,
            dy1 = 0.059f,
            dx2 = -0.008f,
            dy2 = 0.088f,
        )
        // a 0.419 0.419 0 0 1 0.036 0.12
        arcToRelative(
            a = 0.419f,
            b = 0.419f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.036f,
            dy1 = 0.12f,
        )
        // a 0.281 0.281 0 0 1 -0.062 0.25
        arcToRelative(
            a = 0.281f,
            b = 0.281f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.062f,
            dy1 = 0.25f,
        )
        // a 0.377 0.377 0 0 1 -0.348 0.132
        arcToRelative(
            a = 0.377f,
            b = 0.377f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.348f,
            dy1 = 0.132f,
        )
        // h -0.015
        horizontalLineToRelative(dx = -0.015f)
        // A 0.445 0.445 0 0 0 5.5 8.46
        arcTo(
            horizontalEllipseRadius = 0.445f,
            verticalEllipseRadius = 0.445f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 5.5f,
            y1 = 8.46f,
        )
        // a 0.153 0.153 0 0 1 0.012 -0.079
        arcToRelative(
            a = 0.153f,
            b = 0.153f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.012f,
            dy1 = -0.079f,
        )
        // l 0.006 -0.094
        lineToRelative(dx = 0.006f, dy = -0.094f)
        // a 0.174 0.174 0 0 1 0 -0.1
        arcToRelative(
            a = 0.174f,
            b = 0.174f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -0.1f,
        )
        // a 0.254 0.254 0 0 1 0.046 -0.234
        arcToRelative(
            a = 0.254f,
            b = 0.254f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.046f,
            dy1 = -0.234f,
        )
        // s 0.059 -0.043 0.054 -0.095
        reflectiveCurveToRelative(
            dx1 = 0.059f,
            dy1 = -0.043f,
            dx2 = 0.054f,
            dy2 = -0.095f,
        )
        // s -0.072 -0.084 -0.107 -0.014
        reflectiveCurveToRelative(
            dx1 = -0.072f,
            dy1 = -0.084f,
            dx2 = -0.107f,
            dy2 = -0.014f,
        )
        // a 0.58 0.58 0 0 1 -0.433 0.351
        arcToRelative(
            a = 0.58f,
            b = 0.58f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.433f,
            dy1 = 0.351f,
        )
        // c -0.319 0.072 -0.538 -0.023 -0.575 -0.392
        curveToRelative(
            dx1 = -0.319f,
            dy1 = 0.072f,
            dx2 = -0.538f,
            dy2 = -0.023f,
            dx3 = -0.575f,
            dy3 = -0.392f,
        )
        // a 1.4 1.4 0 0 1 0 -0.259
        arcToRelative(
            a = 1.4f,
            b = 1.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -0.259f,
        )
        // c 0 -0.026 0.008 -0.057 -0.026 -0.064
        curveToRelative(
            dx1 = 0.0f,
            dy1 = -0.026f,
            dx2 = 0.008f,
            dy2 = -0.057f,
            dx3 = -0.026f,
            dy3 = -0.064f,
        )
        // s -0.045 0.027 -0.052 0.055
        reflectiveCurveToRelative(
            dx1 = -0.045f,
            dy1 = 0.027f,
            dx2 = -0.052f,
            dy2 = 0.055f,
        )
        // a 0.694 0.694 0 0 0 -0.013 0.187
        arcToRelative(
            a = 0.694f,
            b = 0.694f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.013f,
            dy1 = 0.187f,
        )
        // a 0.066 0.066 0 0 1 -0.044 0.073
        arcToRelative(
            a = 0.066f,
            b = 0.066f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.044f,
            dy1 = 0.073f,
        )
        // a 0.685 0.685 0 0 0 -0.285 0.228
        arcToRelative(
            a = 0.685f,
            b = 0.685f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.285f,
            dy1 = 0.228f,
        )
        // c -0.008 0.01 -0.016 0.023 -0.031 0.02
        curveToRelative(
            dx1 = -0.008f,
            dy1 = 0.01f,
            dx2 = -0.016f,
            dy2 = 0.023f,
            dx3 = -0.031f,
            dy3 = 0.02f,
        )
        // S 4.028 8.02 4.027 8
        reflectiveCurveTo(
            x1 = 4.028f,
            y1 = 8.02f,
            x2 = 4.027f,
            y2 = 8.0f,
        )
        // a 0.4 0.4 0 0 1 0.13 -0.3
        arcToRelative(
            a = 0.4f,
            b = 0.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.13f,
            dy1 = -0.3f,
        )
        // c 0.022 -0.024 0.087 -0.043 0.042 -0.089
        curveToRelative(
            dx1 = 0.022f,
            dy1 = -0.024f,
            dx2 = 0.087f,
            dy2 = -0.043f,
            dx3 = 0.042f,
            dy3 = -0.089f,
        )
        // s -0.077 0 -0.109 0.03
        reflectiveCurveToRelative(
            dx1 = -0.077f,
            dy1 = 0.0f,
            dx2 = -0.109f,
            dy2 = 0.03f,
        )
        // s -0.035 0.045 -0.076 0.059
        reflectiveCurveToRelative(
            dx1 = -0.035f,
            dy1 = 0.045f,
            dx2 = -0.076f,
            dy2 = 0.059f,
        )
        // a 0.258 0.258 0 0 1 0.086 -0.171
        arcToRelative(
            a = 0.258f,
            b = 0.258f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.086f,
            dy1 = -0.171f,
        )
        // a 0.418 0.418 0 0 1 0.109 -0.076
        arcToRelative(
            a = 0.418f,
            b = 0.418f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.109f,
            dy1 = -0.076f,
        )
        // c 0.085 -0.048 0.086 -0.064 0.009 -0.121
        curveToRelative(
            dx1 = 0.085f,
            dy1 = -0.048f,
            dx2 = 0.086f,
            dy2 = -0.064f,
            dx3 = 0.009f,
            dy3 = -0.121f,
        )
        // a 0.092 0.092 0 0 1 0.069 -0.03
        arcToRelative(
            a = 0.092f,
            b = 0.092f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.069f,
            dy1 = -0.03f,
        )
        // a 0.07 0.07 0 0 0 0.069 -0.063
        arcToRelative(
            a = 0.07f,
            b = 0.07f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.069f,
            dy1 = -0.063f,
        )
        // a 0.252 0.252 0 0 1 0.08 -0.15
        arcToRelative(
            a = 0.252f,
            b = 0.252f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.08f,
            dy1 = -0.15f,
        )
        // a 0.08 0.08 0 0 0 0.015 -0.111
        arcToRelative(
            a = 0.08f,
            b = 0.08f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.015f,
            dy1 = -0.111f,
        )
        // a 0.213 0.213 0 0 1 -0.025 -0.192
        arcToRelative(
            a = 0.213f,
            b = 0.213f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.025f,
            dy1 = -0.192f,
        )
        // a 0.19 0.19 0 0 1 0.039 0.137
        arcToRelative(
            a = 0.19f,
            b = 0.19f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.039f,
            dy1 = 0.137f,
        )
        // c 0 0.03 0 0.064 0.044 0.06
        curveToRelative(
            dx1 = 0.0f,
            dy1 = 0.03f,
            dx2 = 0.0f,
            dy2 = 0.064f,
            dx3 = 0.044f,
            dy3 = 0.06f,
        )
        // s 0.039 -0.033 0.037 -0.06
        reflectiveCurveToRelative(
            dx1 = 0.039f,
            dy1 = -0.033f,
            dx2 = 0.037f,
            dy2 = -0.06f,
        )
        // c 0 -0.07 0 -0.142 -0.06 -0.2
        curveToRelative(
            dx1 = 0.0f,
            dy1 = -0.07f,
            dx2 = 0.0f,
            dy2 = -0.142f,
            dx3 = -0.06f,
            dy3 = -0.2f,
        )
        // c -0.04 -0.037 0 -0.054 0.024 -0.056
        curveToRelative(
            dx1 = -0.04f,
            dy1 = -0.037f,
            dx2 = 0.0f,
            dy2 = -0.054f,
            dx3 = 0.024f,
            dy3 = -0.056f,
        )
        // c 0.072 0 0.109 -0.031 0.107 -0.109
        curveToRelative(
            dx1 = 0.072f,
            dy1 = 0.0f,
            dx2 = 0.109f,
            dy2 = -0.031f,
            dx3 = 0.107f,
            dy3 = -0.109f,
        )
        // s 0.089 -0.045 0.111 -0.093
        reflectiveCurveToRelative(
            dx1 = 0.089f,
            dy1 = -0.045f,
            dx2 = 0.111f,
            dy2 = -0.093f,
        )
        // s 0.051 -0.085 0.114 -0.057
        reflectiveCurveToRelative(
            dx1 = 0.051f,
            dy1 = -0.085f,
            dx2 = 0.114f,
            dy2 = -0.057f,
        )
        // c 0.032 0.014 0.056 0 0.072 -0.031
        curveToRelative(
            dx1 = 0.032f,
            dy1 = 0.014f,
            dx2 = 0.056f,
            dy2 = 0.0f,
            dx3 = 0.072f,
            dy3 = -0.031f,
        )
        // c 0.034 -0.06 0.076 -0.068 0.126 -0.021
        curveToRelative(
            dx1 = 0.034f,
            dy1 = -0.06f,
            dx2 = 0.076f,
            dy2 = -0.068f,
            dx3 = 0.126f,
            dy3 = -0.021f,
        )
        // s 0.063 0.017 0.09 -0.016
        reflectiveCurveToRelative(
            dx1 = 0.063f,
            dy1 = 0.017f,
            dx2 = 0.09f,
            dy2 = -0.016f,
        )
        // c 0.07 -0.084 0.075 -0.084 0.152 0
        curveToRelative(
            dx1 = 0.07f,
            dy1 = -0.084f,
            dx2 = 0.075f,
            dy2 = -0.084f,
            dx3 = 0.152f,
            dy3 = 0.0f,
        )
        // c 0.029 0.031 0.053 0.02 0.081 0
        curveToRelative(
            dx1 = 0.029f,
            dy1 = 0.031f,
            dx2 = 0.053f,
            dy2 = 0.02f,
            dx3 = 0.081f,
            dy3 = 0.0f,
        )
        // c 0.108 -0.081 0.156 -0.06 0.178 0.077
        curveToRelative(
            dx1 = 0.108f,
            dy1 = -0.081f,
            dx2 = 0.156f,
            dy2 = -0.06f,
            dx3 = 0.178f,
            dy3 = 0.077f,
        )
        // a 0.082 0.082 0 0 0 0.071 0.013
        arcToRelative(
            a = 0.082f,
            b = 0.082f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.071f,
            dy1 = 0.013f,
        )
        // a 0.041 0.041 0 0 1 0.032 -0.03
        arcToRelative(
            a = 0.041f,
            b = 0.041f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.032f,
            dy1 = -0.03f,
        )
        // c 0.052 -0.042 0.095 -0.044 0.115 0.03
        curveToRelative(
            dx1 = 0.052f,
            dy1 = -0.042f,
            dx2 = 0.095f,
            dy2 = -0.044f,
            dx3 = 0.115f,
            dy3 = 0.03f,
        )
        // a 0.064 0.064 0 0 0 0.078 0.055
        arcToRelative(
            a = 0.064f,
            b = 0.064f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.078f,
            dy1 = 0.055f,
        )
        // c 0.092 0 0.111 0.012 0.128 0.106
        curveToRelative(
            dx1 = 0.092f,
            dy1 = 0.0f,
            dx2 = 0.111f,
            dy2 = 0.012f,
            dx3 = 0.128f,
            dy3 = 0.106f,
        )
        // a 0.089 0.089 0 0 0 0.058 0.082
        arcToRelative(
            a = 0.089f,
            b = 0.089f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.058f,
            dy1 = 0.082f,
        )
        // c 0.1 0.035 0.121 0.093 0.1 0.2
        curveToRelative(
            dx1 = 0.1f,
            dy1 = 0.035f,
            dx2 = 0.121f,
            dy2 = 0.093f,
            dx3 = 0.1f,
            dy3 = 0.2f,
        )
        // s -0.021 0.1 0.078 0.108
        reflectiveCurveToRelative(
            dx1 = -0.021f,
            dy1 = 0.1f,
            dx2 = 0.078f,
            dy2 = 0.108f,
        )
        // c 0.076 0.015 0.093 0.067 0.088 0.135
        curveToRelative(
            dx1 = 0.076f,
            dy1 = 0.015f,
            dx2 = 0.093f,
            dy2 = 0.067f,
            dx3 = 0.088f,
            dy3 = 0.135f,
        )
        // a 0.1 0.1 0 0 1 0 0.076
        arcToRelative(
            a = 0.1f,
            b = 0.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 0.076f,
        )
        // a 0.029 0.029 0 0 1 -0.006 0.032
        arcToRelative(
            a = 0.029f,
            b = 0.029f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.006f,
            dy1 = 0.032f,
        )
        // a 0.189 0.189 0 0 1 -0.044 0.1
        arcToRelative(
            a = 0.189f,
            b = 0.189f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.044f,
            dy1 = 0.1f,
        )
        // a 0.06 0.06 0 0 0 0 0.077
        arcToRelative(
            a = 0.06f,
            b = 0.06f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 0.077f,
        )
        // c 0.034 0.014 0.076 0 0.114 0.029
        curveToRelative(
            dx1 = 0.034f,
            dy1 = 0.014f,
            dx2 = 0.076f,
            dy2 = 0.0f,
            dx3 = 0.114f,
            dy3 = 0.029f,
        )
        // c -0.041 0.036 -0.089 0.019 -0.131 0.027
        curveToRelative(
            dx1 = -0.041f,
            dy1 = 0.036f,
            dx2 = -0.089f,
            dy2 = 0.019f,
            dx3 = -0.131f,
            dy3 = 0.027f,
        )
        // c -0.028 0.039 -0.007 0.061 0.026 0.081
        curveToRelative(
            dx1 = -0.028f,
            dy1 = 0.039f,
            dx2 = -0.007f,
            dy2 = 0.061f,
            dx3 = 0.026f,
            dy3 = 0.081f,
        )
        // a 0.283 0.283 0 0 1 0.135 0.175
        arcToRelative(
            a = 0.283f,
            b = 0.283f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.135f,
            dy1 = 0.175f,
        )
        // c -0.005 0.011 0.017 0.036 -0.01 0.051z
        curveToRelative(
            dx1 = -0.005f,
            dy1 = 0.011f,
            dx2 = 0.017f,
            dy2 = 0.036f,
            dx3 = -0.01f,
            dy3 = 0.051f,
        )
        close()
    }
    // M6.2 7.015 a0.166 0.166 0 0 0 -0.088 0.13 c-0.009 0.045 -0.031 0.11 0.024 0.125 s0.055 -0.057 0.069 -0.1 l0.03 -0.071 c0.009 -0.036 0.015 -0.072 -0.035 -0.084z
    path(
        fill = SolidColor(Color(0xFF806600)),
    ) {
        // M 6.2 7.015
        moveTo(x = 6.2f, y = 7.015f)
        // a 0.166 0.166 0 0 0 -0.088 0.13
        arcToRelative(
            a = 0.166f,
            b = 0.166f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.088f,
            dy1 = 0.13f,
        )
        // c -0.009 0.045 -0.031 0.11 0.024 0.125
        curveToRelative(
            dx1 = -0.009f,
            dy1 = 0.045f,
            dx2 = -0.031f,
            dy2 = 0.11f,
            dx3 = 0.024f,
            dy3 = 0.125f,
        )
        // s 0.055 -0.057 0.069 -0.1
        reflectiveCurveToRelative(
            dx1 = 0.055f,
            dy1 = -0.057f,
            dx2 = 0.069f,
            dy2 = -0.1f,
        )
        // l 0.03 -0.071
        lineToRelative(dx = 0.03f, dy = -0.071f)
        // c 0.009 -0.036 0.015 -0.072 -0.035 -0.084z
        curveToRelative(
            dx1 = 0.009f,
            dy1 = -0.036f,
            dx2 = 0.015f,
            dy2 = -0.072f,
            dx3 = -0.035f,
            dy3 = -0.084f,
        )
        close()
    }
    // m3.018 6.93  l-0.007 -0.014 L3 6.912 a0.145 0.145 0 0 1 -0.037 -0.021 0.4 0.4 0 0 0 -0.3 -0.071 l-0.106 0.008 0.088 0.06 a0.253 0.253 0 0 1 0.142 0.226 v0.019 l0.016 0.009 a0.189 0.189 0 0 0 0.097 0.028 0.132 0.132 0 0 0 0.07 -0.02 0.156 0.156 0 0 0 0.048 -0.22z M2.388 7.025 h-0.014 a0.135 0.135 0 0 1 -0.043 0 0.419 0.419 0 0 0 -0.3 0.059 l-0.1 0.052 0.112 0.018 a0.248 0.248 0 0 1 0.222 0.137 l0.01 0.015 h0.04 a0.147 0.147 0 0 0 0.131 -0.06 0.144 0.144 0 0 0 -0.046 -0.212z M2.172 7.537 h-0.015 l-0.013 0.008 a0.124 0.124 0 0 1 -0.04 0.013 0.4 0.4 0 0 0 -0.248 0.173 l-0.066 0.085 0.1 -0.026 a0.264 0.264 0 0 1 0.266 0.04 l0.015 0.01 0.017 -0.006 a0.146 0.146 0 0 0 0.113 -0.116 0.153 0.153 0 0 0 -0.129 -0.181 M2.569 10 a0.163 0.163 0 0 0 -0.222 -0.048 l-0.047 0.026 0.017 0.017 -0.011 0.015 a0.353 0.353 0 0 0 -0.072 0.284 l0.008 0.1 0.059 -0.08 a0.263 0.263 0 0 1 0.232 -0.135 h0.017 l0.01 -0.016 A0.137 0.137 0 0 0 2.569 10 m-0.158 -0.959 L2.4 9.034 l-0.014 0.007 a0.19 0.19 0 0 1 -0.042 0.006 0.4 0.4 0 0 0 -0.278 0.13 l-0.078 0.072 0.106 -0.007 a0.25 0.25 0 0 1 0.252 0.088 l0.013 0.013 h0.019 a0.152 0.152 0 0 0 0.133 -0.1 0.155 0.155 0 0 0 -0.1 -0.202 m-0.298 0.409 L2.1 9.45 l-0.011 0.012 a0.142 0.142 0 0 1 -0.036 0.021 0.4 0.4 0 0 0 -0.207 0.227 l-0.045 0.1 0.1 -0.048 a0.25 0.25 0 0 1 0.266 -0.015 l0.017 0.006 0.016 -0.009 a0.153 0.153 0 0 0 0.087 -0.14 0.156 0.156 0 0 0 -0.174 -0.154 m5.167 -0.335  l-0.014 -0.007 -0.015 0.006 a0.139 0.139 0 0 1 -0.042 0.006 0.392 0.392 0 0 0 -0.277 0.129 l-0.076 0.071 0.1 -0.007 a0.258 0.258 0 0 1 0.252 0.093 l0.014 0.013 h0.018 a0.15 0.15 0 0 0 0.133 -0.1 0.159 0.159 0 0 0 -0.093 -0.204 m0.07 0.519 h-0.035 v0.019 l-0.026 0.015 a0.4 0.4 0 0 0 -0.193 0.236 l-0.038 0.1 0.092 -0.052 a0.262 0.262 0 0 1 0.27 -0.03 h0.018 l0.015 -0.01 a0.144 0.144 0 0 0 0.077 -0.144 0.158 0.158 0 0 0 -0.18 -0.134z M7.98 10.029 A0.155 0.155 0 0 0 7.758 10 l-0.013 0.009 v0.016 a0.137 0.137 0 0 1 -0.017 0.036 0.384 0.384 0 0 0 -0.038 0.3 l0.02 0.1 0.05 -0.092 a0.247 0.247 0 0 1 0.207 -0.16 l0.018 -0.005 0.008 -0.017 a0.146 0.146 0 0 0 -0.013 -0.158z M12.3 9.722  L12.285 9.728 12.279 9.743 a0.167 0.167 0 0 1 -0.024 0.034 0.4 0.4 0 0 0 -0.1 0.289 v0.107 l0.068 -0.082 a0.248 0.248 0 0 1 0.237 -0.115 h0.019 l0.011 -0.015 a0.151 0.151 0 0 0 0.024 -0.162 0.154 0.154 0 0 0 -0.214 -0.077z M12.716 9.984  L12.705 10 v0.016 a0.17 0.17 0 0 1 -0.009 0.039 0.37 0.37 0 0 0 0.029 0.3 l0.041 0.091 0.029 -0.1 a0.256 0.256 0 0 1 0.177 -0.2 l0.017 -0.008 v-0.018 a0.142 0.142 0 0 0 -0.047 -0.155 0.167 0.167 0 0 0 -0.226 0.019z M13.528 10 a0.145 0.145 0 0 0 -0.084 -0.138 0.156 0.156 0 0 0 -0.209 0.079 l-0.007 0.015 0.005 0.015 a0.155 0.155 0 0 1 0 0.04 0.386 0.386 0 0 0 0.106 0.281 l0.065 0.082 v-0.1 a0.251 0.251 0 0 1 0.109 -0.239 l0.014 -0.012z
    path(
        fill = SolidColor(Color(0xFF377BC8)),
    ) {
        // M 3.018 6.93
        moveTo(x = 3.018f, y = 6.93f)
        // l -0.007 -0.014
        lineToRelative(dx = -0.007f, dy = -0.014f)
        // L 3 6.912
        lineTo(x = 3.0f, y = 6.912f)
        // a 0.145 0.145 0 0 1 -0.037 -0.021
        arcToRelative(
            a = 0.145f,
            b = 0.145f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.037f,
            dy1 = -0.021f,
        )
        // a 0.4 0.4 0 0 0 -0.3 -0.071
        arcToRelative(
            a = 0.4f,
            b = 0.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.3f,
            dy1 = -0.071f,
        )
        // l -0.106 0.008
        lineToRelative(dx = -0.106f, dy = 0.008f)
        // l 0.088 0.06
        lineToRelative(dx = 0.088f, dy = 0.06f)
        // a 0.253 0.253 0 0 1 0.142 0.226
        arcToRelative(
            a = 0.253f,
            b = 0.253f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.142f,
            dy1 = 0.226f,
        )
        // v 0.019
        verticalLineToRelative(dy = 0.019f)
        // l 0.016 0.009
        lineToRelative(dx = 0.016f, dy = 0.009f)
        // a 0.189 0.189 0 0 0 0.097 0.028
        arcToRelative(
            a = 0.189f,
            b = 0.189f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.097f,
            dy1 = 0.028f,
        )
        // a 0.132 0.132 0 0 0 0.07 -0.02
        arcToRelative(
            a = 0.132f,
            b = 0.132f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.07f,
            dy1 = -0.02f,
        )
        // a 0.156 0.156 0 0 0 0.048 -0.22z
        arcToRelative(
            a = 0.156f,
            b = 0.156f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.048f,
            dy1 = -0.22f,
        )
        close()
        // M 2.388 7.025
        moveTo(x = 2.388f, y = 7.025f)
        // h -0.014
        horizontalLineToRelative(dx = -0.014f)
        // a 0.135 0.135 0 0 1 -0.043 0
        arcToRelative(
            a = 0.135f,
            b = 0.135f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.043f,
            dy1 = 0.0f,
        )
        // a 0.419 0.419 0 0 0 -0.3 0.059
        arcToRelative(
            a = 0.419f,
            b = 0.419f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.3f,
            dy1 = 0.059f,
        )
        // l -0.1 0.052
        lineToRelative(dx = -0.1f, dy = 0.052f)
        // l 0.112 0.018
        lineToRelative(dx = 0.112f, dy = 0.018f)
        // a 0.248 0.248 0 0 1 0.222 0.137
        arcToRelative(
            a = 0.248f,
            b = 0.248f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.222f,
            dy1 = 0.137f,
        )
        // l 0.01 0.015
        lineToRelative(dx = 0.01f, dy = 0.015f)
        // h 0.04
        horizontalLineToRelative(dx = 0.04f)
        // a 0.147 0.147 0 0 0 0.131 -0.06
        arcToRelative(
            a = 0.147f,
            b = 0.147f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.131f,
            dy1 = -0.06f,
        )
        // a 0.144 0.144 0 0 0 -0.046 -0.212z
        arcToRelative(
            a = 0.144f,
            b = 0.144f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.046f,
            dy1 = -0.212f,
        )
        close()
        // M 2.172 7.537
        moveTo(x = 2.172f, y = 7.537f)
        // h -0.015
        horizontalLineToRelative(dx = -0.015f)
        // l -0.013 0.008
        lineToRelative(dx = -0.013f, dy = 0.008f)
        // a 0.124 0.124 0 0 1 -0.04 0.013
        arcToRelative(
            a = 0.124f,
            b = 0.124f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.04f,
            dy1 = 0.013f,
        )
        // a 0.4 0.4 0 0 0 -0.248 0.173
        arcToRelative(
            a = 0.4f,
            b = 0.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.248f,
            dy1 = 0.173f,
        )
        // l -0.066 0.085
        lineToRelative(dx = -0.066f, dy = 0.085f)
        // l 0.1 -0.026
        lineToRelative(dx = 0.1f, dy = -0.026f)
        // a 0.264 0.264 0 0 1 0.266 0.04
        arcToRelative(
            a = 0.264f,
            b = 0.264f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.266f,
            dy1 = 0.04f,
        )
        // l 0.015 0.01
        lineToRelative(dx = 0.015f, dy = 0.01f)
        // l 0.017 -0.006
        lineToRelative(dx = 0.017f, dy = -0.006f)
        // a 0.146 0.146 0 0 0 0.113 -0.116
        arcToRelative(
            a = 0.146f,
            b = 0.146f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.113f,
            dy1 = -0.116f,
        )
        // a 0.153 0.153 0 0 0 -0.129 -0.181
        arcToRelative(
            a = 0.153f,
            b = 0.153f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.129f,
            dy1 = -0.181f,
        )
        // M 2.569 10
        moveTo(x = 2.569f, y = 10.0f)
        // a 0.163 0.163 0 0 0 -0.222 -0.048
        arcToRelative(
            a = 0.163f,
            b = 0.163f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.222f,
            dy1 = -0.048f,
        )
        // l -0.047 0.026
        lineToRelative(dx = -0.047f, dy = 0.026f)
        // l 0.017 0.017
        lineToRelative(dx = 0.017f, dy = 0.017f)
        // l -0.011 0.015
        lineToRelative(dx = -0.011f, dy = 0.015f)
        // a 0.353 0.353 0 0 0 -0.072 0.284
        arcToRelative(
            a = 0.353f,
            b = 0.353f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.072f,
            dy1 = 0.284f,
        )
        // l 0.008 0.1
        lineToRelative(dx = 0.008f, dy = 0.1f)
        // l 0.059 -0.08
        lineToRelative(dx = 0.059f, dy = -0.08f)
        // a 0.263 0.263 0 0 1 0.232 -0.135
        arcToRelative(
            a = 0.263f,
            b = 0.263f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.232f,
            dy1 = -0.135f,
        )
        // h 0.017
        horizontalLineToRelative(dx = 0.017f)
        // l 0.01 -0.016
        lineToRelative(dx = 0.01f, dy = -0.016f)
        // A 0.137 0.137 0 0 0 2.569 10
        arcTo(
            horizontalEllipseRadius = 0.137f,
            verticalEllipseRadius = 0.137f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 2.569f,
            y1 = 10.0f,
        )
        // m -0.158 -0.959
        moveToRelative(dx = -0.158f, dy = -0.959f)
        // L 2.4 9.034
        lineTo(x = 2.4f, y = 9.034f)
        // l -0.014 0.007
        lineToRelative(dx = -0.014f, dy = 0.007f)
        // a 0.19 0.19 0 0 1 -0.042 0.006
        arcToRelative(
            a = 0.19f,
            b = 0.19f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.042f,
            dy1 = 0.006f,
        )
        // a 0.4 0.4 0 0 0 -0.278 0.13
        arcToRelative(
            a = 0.4f,
            b = 0.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.278f,
            dy1 = 0.13f,
        )
        // l -0.078 0.072
        lineToRelative(dx = -0.078f, dy = 0.072f)
        // l 0.106 -0.007
        lineToRelative(dx = 0.106f, dy = -0.007f)
        // a 0.25 0.25 0 0 1 0.252 0.088
        arcToRelative(
            a = 0.25f,
            b = 0.25f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.252f,
            dy1 = 0.088f,
        )
        // l 0.013 0.013
        lineToRelative(dx = 0.013f, dy = 0.013f)
        // h 0.019
        horizontalLineToRelative(dx = 0.019f)
        // a 0.152 0.152 0 0 0 0.133 -0.1
        arcToRelative(
            a = 0.152f,
            b = 0.152f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.133f,
            dy1 = -0.1f,
        )
        // a 0.155 0.155 0 0 0 -0.1 -0.202
        arcToRelative(
            a = 0.155f,
            b = 0.155f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.1f,
            dy1 = -0.202f,
        )
        // m -0.298 0.409
        moveToRelative(dx = -0.298f, dy = 0.409f)
        // L 2.1 9.45
        lineTo(x = 2.1f, y = 9.45f)
        // l -0.011 0.012
        lineToRelative(dx = -0.011f, dy = 0.012f)
        // a 0.142 0.142 0 0 1 -0.036 0.021
        arcToRelative(
            a = 0.142f,
            b = 0.142f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.036f,
            dy1 = 0.021f,
        )
        // a 0.4 0.4 0 0 0 -0.207 0.227
        arcToRelative(
            a = 0.4f,
            b = 0.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.207f,
            dy1 = 0.227f,
        )
        // l -0.045 0.1
        lineToRelative(dx = -0.045f, dy = 0.1f)
        // l 0.1 -0.048
        lineToRelative(dx = 0.1f, dy = -0.048f)
        // a 0.25 0.25 0 0 1 0.266 -0.015
        arcToRelative(
            a = 0.25f,
            b = 0.25f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.266f,
            dy1 = -0.015f,
        )
        // l 0.017 0.006
        lineToRelative(dx = 0.017f, dy = 0.006f)
        // l 0.016 -0.009
        lineToRelative(dx = 0.016f, dy = -0.009f)
        // a 0.153 0.153 0 0 0 0.087 -0.14
        arcToRelative(
            a = 0.153f,
            b = 0.153f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.087f,
            dy1 = -0.14f,
        )
        // a 0.156 0.156 0 0 0 -0.174 -0.154
        arcToRelative(
            a = 0.156f,
            b = 0.156f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.174f,
            dy1 = -0.154f,
        )
        // m 5.167 -0.335
        moveToRelative(dx = 5.167f, dy = -0.335f)
        // l -0.014 -0.007
        lineToRelative(dx = -0.014f, dy = -0.007f)
        // l -0.015 0.006
        lineToRelative(dx = -0.015f, dy = 0.006f)
        // a 0.139 0.139 0 0 1 -0.042 0.006
        arcToRelative(
            a = 0.139f,
            b = 0.139f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.042f,
            dy1 = 0.006f,
        )
        // a 0.392 0.392 0 0 0 -0.277 0.129
        arcToRelative(
            a = 0.392f,
            b = 0.392f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.277f,
            dy1 = 0.129f,
        )
        // l -0.076 0.071
        lineToRelative(dx = -0.076f, dy = 0.071f)
        // l 0.1 -0.007
        lineToRelative(dx = 0.1f, dy = -0.007f)
        // a 0.258 0.258 0 0 1 0.252 0.093
        arcToRelative(
            a = 0.258f,
            b = 0.258f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.252f,
            dy1 = 0.093f,
        )
        // l 0.014 0.013
        lineToRelative(dx = 0.014f, dy = 0.013f)
        // h 0.018
        horizontalLineToRelative(dx = 0.018f)
        // a 0.15 0.15 0 0 0 0.133 -0.1
        arcToRelative(
            a = 0.15f,
            b = 0.15f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.133f,
            dy1 = -0.1f,
        )
        // a 0.159 0.159 0 0 0 -0.093 -0.204
        arcToRelative(
            a = 0.159f,
            b = 0.159f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.093f,
            dy1 = -0.204f,
        )
        // m 0.07 0.519
        moveToRelative(dx = 0.07f, dy = 0.519f)
        // h -0.035
        horizontalLineToRelative(dx = -0.035f)
        // v 0.019
        verticalLineToRelative(dy = 0.019f)
        // l -0.026 0.015
        lineToRelative(dx = -0.026f, dy = 0.015f)
        // a 0.4 0.4 0 0 0 -0.193 0.236
        arcToRelative(
            a = 0.4f,
            b = 0.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.193f,
            dy1 = 0.236f,
        )
        // l -0.038 0.1
        lineToRelative(dx = -0.038f, dy = 0.1f)
        // l 0.092 -0.052
        lineToRelative(dx = 0.092f, dy = -0.052f)
        // a 0.262 0.262 0 0 1 0.27 -0.03
        arcToRelative(
            a = 0.262f,
            b = 0.262f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.27f,
            dy1 = -0.03f,
        )
        // h 0.018
        horizontalLineToRelative(dx = 0.018f)
        // l 0.015 -0.01
        lineToRelative(dx = 0.015f, dy = -0.01f)
        // a 0.144 0.144 0 0 0 0.077 -0.144
        arcToRelative(
            a = 0.144f,
            b = 0.144f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.077f,
            dy1 = -0.144f,
        )
        // a 0.158 0.158 0 0 0 -0.18 -0.134z
        arcToRelative(
            a = 0.158f,
            b = 0.158f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.18f,
            dy1 = -0.134f,
        )
        close()
        // M 7.98 10.029
        moveTo(x = 7.98f, y = 10.029f)
        // A 0.155 0.155 0 0 0 7.758 10
        arcTo(
            horizontalEllipseRadius = 0.155f,
            verticalEllipseRadius = 0.155f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 7.758f,
            y1 = 10.0f,
        )
        // l -0.013 0.009
        lineToRelative(dx = -0.013f, dy = 0.009f)
        // v 0.016
        verticalLineToRelative(dy = 0.016f)
        // a 0.137 0.137 0 0 1 -0.017 0.036
        arcToRelative(
            a = 0.137f,
            b = 0.137f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.017f,
            dy1 = 0.036f,
        )
        // a 0.384 0.384 0 0 0 -0.038 0.3
        arcToRelative(
            a = 0.384f,
            b = 0.384f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.038f,
            dy1 = 0.3f,
        )
        // l 0.02 0.1
        lineToRelative(dx = 0.02f, dy = 0.1f)
        // l 0.05 -0.092
        lineToRelative(dx = 0.05f, dy = -0.092f)
        // a 0.247 0.247 0 0 1 0.207 -0.16
        arcToRelative(
            a = 0.247f,
            b = 0.247f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.207f,
            dy1 = -0.16f,
        )
        // l 0.018 -0.005
        lineToRelative(dx = 0.018f, dy = -0.005f)
        // l 0.008 -0.017
        lineToRelative(dx = 0.008f, dy = -0.017f)
        // a 0.146 0.146 0 0 0 -0.013 -0.158z
        arcToRelative(
            a = 0.146f,
            b = 0.146f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.013f,
            dy1 = -0.158f,
        )
        close()
        // M 12.3 9.722
        moveTo(x = 12.3f, y = 9.722f)
        // L 12.285 9.728
        lineTo(x = 12.285f, y = 9.728f)
        // L 12.279 9.743
        lineTo(x = 12.279f, y = 9.743f)
        // a 0.167 0.167 0 0 1 -0.024 0.034
        arcToRelative(
            a = 0.167f,
            b = 0.167f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.024f,
            dy1 = 0.034f,
        )
        // a 0.4 0.4 0 0 0 -0.1 0.289
        arcToRelative(
            a = 0.4f,
            b = 0.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.1f,
            dy1 = 0.289f,
        )
        // v 0.107
        verticalLineToRelative(dy = 0.107f)
        // l 0.068 -0.082
        lineToRelative(dx = 0.068f, dy = -0.082f)
        // a 0.248 0.248 0 0 1 0.237 -0.115
        arcToRelative(
            a = 0.248f,
            b = 0.248f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.237f,
            dy1 = -0.115f,
        )
        // h 0.019
        horizontalLineToRelative(dx = 0.019f)
        // l 0.011 -0.015
        lineToRelative(dx = 0.011f, dy = -0.015f)
        // a 0.151 0.151 0 0 0 0.024 -0.162
        arcToRelative(
            a = 0.151f,
            b = 0.151f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.024f,
            dy1 = -0.162f,
        )
        // a 0.154 0.154 0 0 0 -0.214 -0.077z
        arcToRelative(
            a = 0.154f,
            b = 0.154f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.214f,
            dy1 = -0.077f,
        )
        close()
        // M 12.716 9.984
        moveTo(x = 12.716f, y = 9.984f)
        // L 12.705 10
        lineTo(x = 12.705f, y = 10.0f)
        // v 0.016
        verticalLineToRelative(dy = 0.016f)
        // a 0.17 0.17 0 0 1 -0.009 0.039
        arcToRelative(
            a = 0.17f,
            b = 0.17f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.009f,
            dy1 = 0.039f,
        )
        // a 0.37 0.37 0 0 0 0.029 0.3
        arcToRelative(
            a = 0.37f,
            b = 0.37f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.029f,
            dy1 = 0.3f,
        )
        // l 0.041 0.091
        lineToRelative(dx = 0.041f, dy = 0.091f)
        // l 0.029 -0.1
        lineToRelative(dx = 0.029f, dy = -0.1f)
        // a 0.256 0.256 0 0 1 0.177 -0.2
        arcToRelative(
            a = 0.256f,
            b = 0.256f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.177f,
            dy1 = -0.2f,
        )
        // l 0.017 -0.008
        lineToRelative(dx = 0.017f, dy = -0.008f)
        // v -0.018
        verticalLineToRelative(dy = -0.018f)
        // a 0.142 0.142 0 0 0 -0.047 -0.155
        arcToRelative(
            a = 0.142f,
            b = 0.142f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.047f,
            dy1 = -0.155f,
        )
        // a 0.167 0.167 0 0 0 -0.226 0.019z
        arcToRelative(
            a = 0.167f,
            b = 0.167f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.226f,
            dy1 = 0.019f,
        )
        close()
        // M 13.528 10
        moveTo(x = 13.528f, y = 10.0f)
        // a 0.145 0.145 0 0 0 -0.084 -0.138
        arcToRelative(
            a = 0.145f,
            b = 0.145f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.084f,
            dy1 = -0.138f,
        )
        // a 0.156 0.156 0 0 0 -0.209 0.079
        arcToRelative(
            a = 0.156f,
            b = 0.156f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.209f,
            dy1 = 0.079f,
        )
        // l -0.007 0.015
        lineToRelative(dx = -0.007f, dy = 0.015f)
        // l 0.005 0.015
        lineToRelative(dx = 0.005f, dy = 0.015f)
        // a 0.155 0.155 0 0 1 0 0.04
        arcToRelative(
            a = 0.155f,
            b = 0.155f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 0.04f,
        )
        // a 0.386 0.386 0 0 0 0.106 0.281
        arcToRelative(
            a = 0.386f,
            b = 0.386f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.106f,
            dy1 = 0.281f,
        )
        // l 0.065 0.082
        lineToRelative(dx = 0.065f, dy = 0.082f)
        // v -0.1
        verticalLineToRelative(dy = -0.1f)
        // a 0.251 0.251 0 0 1 0.109 -0.239
        arcToRelative(
            a = 0.251f,
            b = 0.251f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.109f,
            dy1 = -0.239f,
        )
        // l 0.014 -0.012z
        lineToRelative(dx = 0.014f, dy = -0.012f)
        close()
    }
    // m13.443 13.87  l-0.038 -0.266 a0.335 0.335 0 0 1 0.1 0.008 0.918 0.918 0 0 1 0.129 0.069 0.446 0.446 0 0 0 -0.063 -0.186 0.66 0.66 0 0 0 -0.2 -0.131 0.485 0.485 0 0 1 0.088 -0.044 0.835 0.835 0 0 1 0.155 -0.015 1.074 1.074 0 0 0 -0.13 -0.125 0.537 0.537 0 0 0 -0.261 -0.031 0.724 0.724 0 0 1 0.094 -0.08 0.349 0.349 0 0 1 0.147 -0.024 0.435 0.435 0 0 0 -0.146 -0.109 0.967 0.967 0 0 0 -0.236 -0.025 0.381 0.381 0 0 1 0.079 -0.083 1.13 1.13 0 0 1 0.17 -0.066 1.26 1.26 0 0 0 -0.187 -0.079 c-0.043 -0.011 -0.131 0 -0.207 -0.009 a0.217 0.217 0 0 1 -0.119 -0.068 c0.025 -0.133 -0.022 -0.2 -0.09 -0.224 a0.313 0.313 0 0 0 -0.142 0 0.362 0.362 0 0 0 -0.15 0.107 s-0.371 -0.015 -0.589 0 c-0.156 0.011 -0.379 0.108 -0.528 0.065 -0.109 -0.031 -0.155 -0.167 -0.244 -0.231 l-0.242 -0.173 a6.477 6.477 0 0 0 1.83 -0.1 c0.32 -0.1 0.692 -0.26 0.7 -0.593 s-0.2 -0.616 -0.826 -0.61 a4.133 4.133 0 0 0 -1.044 0.129 c-0.268 0.06 -1.082 0.309 -1.436 0.377 s-0.773 0.177 -1.131 0.235 a2.659 2.659 0 0 1 -0.99 0 0.486 0.486 0 0 1 -0.317 -0.163 0.132 0.132 0 0 1 0 -0.145 c0.084 -0.119 0.278 -0.138 0.431 -0.169 0.07 -0.014 0.241 0.107 0.339 0.138 a1.186 1.186 0 0 0 0.429 0.048 0.832 0.832 0 0 0 0.355 -0.087 0.52 0.52 0 0 1 0.408 -0.1 c0.061 0.021 0.035 0.18 0.035 0.18 0.2 -0.083 0.274 -0.2 0.112 -0.364 a3.425 3.425 0 0 0 0.446 0.08 1.671 1.671 0 0 0 0.734 -0.108 0.6 0.6 0 0 0 0.431 -0.543 l-0.158 0.158 a1.127 1.127 0 0 1 -0.49 0.165 s0.039 -0.13 0 -0.185 a0.27 0.27 0 0 0 -0.211 -0.135 c0.1 0.112 0.029 0.164 -0.014 0.212 a0.576 0.576 0 0 1 -0.4 0.078 4.058 4.058 0 0 0 -1.12 -0.028 9.281 9.281 0 0 0 -1.035 0.214 1.176 1.176 0 0 0 -0.59 0.312 0.359 0.359 0 0 0 -0.1 0.321 c0.051 0.158 0.136 0.223 0.323 0.289 a2.855 2.855 0 0 0 1.355 0.072 c0.335 -0.046 0.808 -0.149 1.118 -0.217 0.44 -0.1 1.2 -0.3 1.413 -0.35 a0.734 0.734 0 0 0 0.094 0.251 0.6 0.6 0 0 0 0.261 0.132 c-0.022 -0.085 -0.062 -0.119 -0.061 -0.2 a0.28 0.28 0 0 1 0.084 -0.182 0.785 0.785 0 0 0 0.116 0.246 0.5 0.5 0 0 0 0.28 0.1 0.266 0.266 0 0 1 -0.081 -0.188 0.233 0.233 0 0 1 0.059 -0.175 0.741 0.741 0 0 0 0.167 0.25 0.465 0.465 0 0 0 0.259 0.029 0.316 0.316 0 0 1 -0.133 -0.1 0.164 0.164 0 0 1 -0.04 -0.129 c0.008 -0.071 0.113 -0.13 0.2 -0.149 a0.372 0.372 0 0 1 0.363 0.089 0.225 0.225 0 0 1 0.068 0.291 c-0.223 0.365 -0.954 0.356 -1.362 0.388 a6.352 6.352 0 0 1 -0.768 -0.009 c-0.341 -0.01 -0.654 -0.09 -1.017 -0.1 a4.969 4.969 0 0 0 -0.721 0.045 c-0.474 0.057 -2.674 0.256 -2.674 0.256 l-0.6 0.054 a10.494 10.494 0 0 0 -1.165 -0.09 2.22 2.22 0 0 1 -0.373 0 v0.351 l-0.009 0.01 s-0.265 -0.163 -0.406 -0.233 c-0.264 -0.132 -0.817 -0.351 -0.817 -0.351 s-0.148 -0.148 -0.153 -0.257 0.054 -0.157 0.067 -0.227 a0.2 0.2 0 0 0 -0.037 -0.135 0.18 0.18 0 0 0 -0.227 -0.025 0.643 0.643 0 0 0 -0.138 0.146 c-0.137 -0.166 -0.246 -0.149 -0.35 -0.067 a0.229 0.229 0 0 0 -0.024 0.385 c-0.243 0.034 -0.249 0.2 -0.21 0.3 a0.283 0.283 0 0 0 0.214 0.154 c0.109 0.01 0.24 -0.081 0.352 0.038 l0.092 0.1 a0.542 0.542 0 0 1 -0.26 0.155 1.425 1.425 0 0 0 0.324 0.1 1.019 1.019 0 0 0 0.267 -0.051 0.351 0.351 0 0 1 -0.226 0.179 1.034 1.034 0 0 0 0.254 0.081 1.148 1.148 0 0 0 0.271 -0.048 c-0.043 0.1 -0.136 0.125 -0.215 0.17 a1.466 1.466 0 0 0 0.286 0.08 1.312 1.312 0 0 0 0.3 -0.034 0.488 0.488 0 0 1 -0.229 0.176 0.845 0.845 0 0 0 0.283 0.063 1.235 1.235 0 0 0 0.3 -0.1 1.52 1.52 0 0 0 0.151 0.115 c-0.142 0.03 -0.345 0.075 -0.442 0.108 a6.056 6.056 0 0 0 -0.704 0.347 0.747 0.747 0 0 1 -0.324 -0.052 c-0.085 -0.056 -0.1 -0.133 -0.153 -0.184 a0.267 0.267 0 0 0 -0.141 -0.058 0.166 0.166 0 0 0 -0.172 0.141 0.448 0.448 0 0 0 0.022 0.16 c-0.235 -0.008 -0.278 0.1 -0.275 0.222 s0.127 0.265 0.359 0.235 c-0.13 0.188 -0.028 0.311 0.084 0.344 a0.331 0.331 0 0 0 0.274 -0.053 c0.08 -0.067 0.088 -0.213 0.265 -0.217 h0.146 a0.419 0.419 0 0 1 -0.038 0.273 1.438 1.438 0 0 0 0.3 -0.16 0.782 0.782 0 0 0 0.132 -0.215 0.278 0.278 0 0 1 0.007 0.264 1.042 1.042 0 0 0 0.237 -0.124 0.884 0.884 0 0 0 0.137 -0.215 c0.06 0.091 0.019 0.169 0.006 0.251 a1.431 1.431 0 0 0 0.258 -0.147 1.038 1.038 0 0 0 0.17 -0.228 0.361 0.361 0 0 1 0 0.263 0.835 0.835 0 0 0 0.242 -0.155 0.945 0.945 0 0 0 0.111 -0.266 0.848 0.848 0 0 0 0.3 -0.06 0.635 0.635 0 0 0 0.157 -0.209 5.532 5.532 0 0 0 0.746 -0.1 c0.48 -0.125 1.782 -0.625 2.565 -0.876 0.113 0.081 0.2 0.167 0.191 0.215 s-0.085 0.069 -0.12 0.116 0 0.088 0.023 0.122 0.125 0.057 0.154 0.1 0.039 0.078 0.01 0.117 c-0.058 0.079 -0.256 0.116 -0.352 0.16 -0.175 0.079 -0.469 0.251 -0.469 0.251 a0.661 0.661 0 0 1 -0.269 -0.038 c-0.083 -0.021 -0.186 -0.124 -0.273 -0.122 a0.244 0.244 0 0 0 -0.2 0.123 0.2 0.2 0 0 0 0.051 0.173 l0.16 0.1 a0.491 0.491 0 0 0 -0.1 0.176 0.175 0.175 0 0 0 0.064 0.139 0.2 0.2 0 0 0 0.15 0.085 0.778 0.778 0 0 0 0.165 -0.018 0.244 0.244 0 0 0 0.275 0.253 0.161 0.161 0 0 0 0.145 -0.081 c0.032 -0.046 0.022 -0.163 0.075 -0.212 l0.214 -0.2 c0.1 0.053 0.1 0.137 0.086 0.223 a0.828 0.828 0 0 0 0.179 -0.153 0.653 0.653 0 0 0 0.055 -0.219 0.236 0.236 0 0 1 0.106 0.24 0.934 0.934 0 0 0 0.185 -0.154 0.909 0.909 0 0 0 0.091 -0.221 0.253 0.253 0 0 1 0.061 0.256 0.737 0.737 0 0 0 0.2 -0.193 0.8 0.8 0 0 0 0.05 -0.185 c0.2 0.01 0.318 -0.076 0.325 -0.162 0 -0.066 -0.075 -0.155 -0.232 -0.177 a0.787 0.787 0 0 1 -0.083 -0.145 0.2 0.2 0 0 1 0 -0.134 0.555 0.555 0 0 1 0.179 -0.222 c0.016 -0.013 0.041 -0.027 0.062 -0.041 l0.009 0.029 a0.217 0.217 0 0 0 0.112 0.127 0.2 0.2 0 0 0 0.166 -0.025 1.36 1.36 0 0 0 0.863 0.488 3.167 3.167 0 0 0 0.762 -0.018 7.46 7.46 0 0 0 0.543 -0.142 2.894 2.894 0 0 0 0.208 0.24 4.519 4.519 0 0 0 0.454 0.337 0.6 0.6 0 0 1 -0.183 0.159 c-0.074 0.032 -0.22 0.039 -0.271 0.1 a0.184 0.184 0 0 0 -0.019 0.207 0.266 0.266 0 0 0 0.178 0.078 l0.186 -0.037 a0.5 0.5 0 0 0 0.086 0.178 0.231 0.231 0 0 0 0.158 0.048 c0.079 0 0.105 0.006 0.164 -0.041 a0.553 0.553 0 0 0 0.087 -0.118 0.368 0.368 0 0 0 0.128 0.064 0.271 0.271 0 0 0 0.256 -0.078 0.122 0.122 0 0 0 0.021 -0.145 c-0.024 -0.052 -0.128 -0.121 -0.138 -0.187z
    path(
        fill = SolidColor(Color(0xFFFCD41C)),
        pathFillType = PathFillType.EvenOdd,
    ) {
        // M 13.443 13.87
        moveTo(x = 13.443f, y = 13.87f)
        // l -0.038 -0.266
        lineToRelative(dx = -0.038f, dy = -0.266f)
        // a 0.335 0.335 0 0 1 0.1 0.008
        arcToRelative(
            a = 0.335f,
            b = 0.335f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.1f,
            dy1 = 0.008f,
        )
        // a 0.918 0.918 0 0 1 0.129 0.069
        arcToRelative(
            a = 0.918f,
            b = 0.918f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.129f,
            dy1 = 0.069f,
        )
        // a 0.446 0.446 0 0 0 -0.063 -0.186
        arcToRelative(
            a = 0.446f,
            b = 0.446f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.063f,
            dy1 = -0.186f,
        )
        // a 0.66 0.66 0 0 0 -0.2 -0.131
        arcToRelative(
            a = 0.66f,
            b = 0.66f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.2f,
            dy1 = -0.131f,
        )
        // a 0.485 0.485 0 0 1 0.088 -0.044
        arcToRelative(
            a = 0.485f,
            b = 0.485f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.088f,
            dy1 = -0.044f,
        )
        // a 0.835 0.835 0 0 1 0.155 -0.015
        arcToRelative(
            a = 0.835f,
            b = 0.835f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.155f,
            dy1 = -0.015f,
        )
        // a 1.074 1.074 0 0 0 -0.13 -0.125
        arcToRelative(
            a = 1.074f,
            b = 1.074f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.13f,
            dy1 = -0.125f,
        )
        // a 0.537 0.537 0 0 0 -0.261 -0.031
        arcToRelative(
            a = 0.537f,
            b = 0.537f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.261f,
            dy1 = -0.031f,
        )
        // a 0.724 0.724 0 0 1 0.094 -0.08
        arcToRelative(
            a = 0.724f,
            b = 0.724f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.094f,
            dy1 = -0.08f,
        )
        // a 0.349 0.349 0 0 1 0.147 -0.024
        arcToRelative(
            a = 0.349f,
            b = 0.349f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.147f,
            dy1 = -0.024f,
        )
        // a 0.435 0.435 0 0 0 -0.146 -0.109
        arcToRelative(
            a = 0.435f,
            b = 0.435f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.146f,
            dy1 = -0.109f,
        )
        // a 0.967 0.967 0 0 0 -0.236 -0.025
        arcToRelative(
            a = 0.967f,
            b = 0.967f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.236f,
            dy1 = -0.025f,
        )
        // a 0.381 0.381 0 0 1 0.079 -0.083
        arcToRelative(
            a = 0.381f,
            b = 0.381f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.079f,
            dy1 = -0.083f,
        )
        // a 1.13 1.13 0 0 1 0.17 -0.066
        arcToRelative(
            a = 1.13f,
            b = 1.13f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.17f,
            dy1 = -0.066f,
        )
        // a 1.26 1.26 0 0 0 -0.187 -0.079
        arcToRelative(
            a = 1.26f,
            b = 1.26f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.187f,
            dy1 = -0.079f,
        )
        // c -0.043 -0.011 -0.131 0 -0.207 -0.009
        curveToRelative(
            dx1 = -0.043f,
            dy1 = -0.011f,
            dx2 = -0.131f,
            dy2 = 0.0f,
            dx3 = -0.207f,
            dy3 = -0.009f,
        )
        // a 0.217 0.217 0 0 1 -0.119 -0.068
        arcToRelative(
            a = 0.217f,
            b = 0.217f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.119f,
            dy1 = -0.068f,
        )
        // c 0.025 -0.133 -0.022 -0.2 -0.09 -0.224
        curveToRelative(
            dx1 = 0.025f,
            dy1 = -0.133f,
            dx2 = -0.022f,
            dy2 = -0.2f,
            dx3 = -0.09f,
            dy3 = -0.224f,
        )
        // a 0.313 0.313 0 0 0 -0.142 0
        arcToRelative(
            a = 0.313f,
            b = 0.313f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.142f,
            dy1 = 0.0f,
        )
        // a 0.362 0.362 0 0 0 -0.15 0.107
        arcToRelative(
            a = 0.362f,
            b = 0.362f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.15f,
            dy1 = 0.107f,
        )
        // s -0.371 -0.015 -0.589 0
        reflectiveCurveToRelative(
            dx1 = -0.371f,
            dy1 = -0.015f,
            dx2 = -0.589f,
            dy2 = 0.0f,
        )
        // c -0.156 0.011 -0.379 0.108 -0.528 0.065
        curveToRelative(
            dx1 = -0.156f,
            dy1 = 0.011f,
            dx2 = -0.379f,
            dy2 = 0.108f,
            dx3 = -0.528f,
            dy3 = 0.065f,
        )
        // c -0.109 -0.031 -0.155 -0.167 -0.244 -0.231
        curveToRelative(
            dx1 = -0.109f,
            dy1 = -0.031f,
            dx2 = -0.155f,
            dy2 = -0.167f,
            dx3 = -0.244f,
            dy3 = -0.231f,
        )
        // l -0.242 -0.173
        lineToRelative(dx = -0.242f, dy = -0.173f)
        // a 6.477 6.477 0 0 0 1.83 -0.1
        arcToRelative(
            a = 6.477f,
            b = 6.477f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.83f,
            dy1 = -0.1f,
        )
        // c 0.32 -0.1 0.692 -0.26 0.7 -0.593
        curveToRelative(
            dx1 = 0.32f,
            dy1 = -0.1f,
            dx2 = 0.692f,
            dy2 = -0.26f,
            dx3 = 0.7f,
            dy3 = -0.593f,
        )
        // s -0.2 -0.616 -0.826 -0.61
        reflectiveCurveToRelative(
            dx1 = -0.2f,
            dy1 = -0.616f,
            dx2 = -0.826f,
            dy2 = -0.61f,
        )
        // a 4.133 4.133 0 0 0 -1.044 0.129
        arcToRelative(
            a = 4.133f,
            b = 4.133f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.044f,
            dy1 = 0.129f,
        )
        // c -0.268 0.06 -1.082 0.309 -1.436 0.377
        curveToRelative(
            dx1 = -0.268f,
            dy1 = 0.06f,
            dx2 = -1.082f,
            dy2 = 0.309f,
            dx3 = -1.436f,
            dy3 = 0.377f,
        )
        // s -0.773 0.177 -1.131 0.235
        reflectiveCurveToRelative(
            dx1 = -0.773f,
            dy1 = 0.177f,
            dx2 = -1.131f,
            dy2 = 0.235f,
        )
        // a 2.659 2.659 0 0 1 -0.99 0
        arcToRelative(
            a = 2.659f,
            b = 2.659f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.99f,
            dy1 = 0.0f,
        )
        // a 0.486 0.486 0 0 1 -0.317 -0.163
        arcToRelative(
            a = 0.486f,
            b = 0.486f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.317f,
            dy1 = -0.163f,
        )
        // a 0.132 0.132 0 0 1 0 -0.145
        arcToRelative(
            a = 0.132f,
            b = 0.132f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -0.145f,
        )
        // c 0.084 -0.119 0.278 -0.138 0.431 -0.169
        curveToRelative(
            dx1 = 0.084f,
            dy1 = -0.119f,
            dx2 = 0.278f,
            dy2 = -0.138f,
            dx3 = 0.431f,
            dy3 = -0.169f,
        )
        // c 0.07 -0.014 0.241 0.107 0.339 0.138
        curveToRelative(
            dx1 = 0.07f,
            dy1 = -0.014f,
            dx2 = 0.241f,
            dy2 = 0.107f,
            dx3 = 0.339f,
            dy3 = 0.138f,
        )
        // a 1.186 1.186 0 0 0 0.429 0.048
        arcToRelative(
            a = 1.186f,
            b = 1.186f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.429f,
            dy1 = 0.048f,
        )
        // a 0.832 0.832 0 0 0 0.355 -0.087
        arcToRelative(
            a = 0.832f,
            b = 0.832f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.355f,
            dy1 = -0.087f,
        )
        // a 0.52 0.52 0 0 1 0.408 -0.1
        arcToRelative(
            a = 0.52f,
            b = 0.52f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.408f,
            dy1 = -0.1f,
        )
        // c 0.061 0.021 0.035 0.18 0.035 0.18
        curveToRelative(
            dx1 = 0.061f,
            dy1 = 0.021f,
            dx2 = 0.035f,
            dy2 = 0.18f,
            dx3 = 0.035f,
            dy3 = 0.18f,
        )
        // c 0.2 -0.083 0.274 -0.2 0.112 -0.364
        curveToRelative(
            dx1 = 0.2f,
            dy1 = -0.083f,
            dx2 = 0.274f,
            dy2 = -0.2f,
            dx3 = 0.112f,
            dy3 = -0.364f,
        )
        // a 3.425 3.425 0 0 0 0.446 0.08
        arcToRelative(
            a = 3.425f,
            b = 3.425f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.446f,
            dy1 = 0.08f,
        )
        // a 1.671 1.671 0 0 0 0.734 -0.108
        arcToRelative(
            a = 1.671f,
            b = 1.671f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.734f,
            dy1 = -0.108f,
        )
        // a 0.6 0.6 0 0 0 0.431 -0.543
        arcToRelative(
            a = 0.6f,
            b = 0.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.431f,
            dy1 = -0.543f,
        )
        // l -0.158 0.158
        lineToRelative(dx = -0.158f, dy = 0.158f)
        // a 1.127 1.127 0 0 1 -0.49 0.165
        arcToRelative(
            a = 1.127f,
            b = 1.127f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.49f,
            dy1 = 0.165f,
        )
        // s 0.039 -0.13 0 -0.185
        reflectiveCurveToRelative(
            dx1 = 0.039f,
            dy1 = -0.13f,
            dx2 = 0.0f,
            dy2 = -0.185f,
        )
        // a 0.27 0.27 0 0 0 -0.211 -0.135
        arcToRelative(
            a = 0.27f,
            b = 0.27f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.211f,
            dy1 = -0.135f,
        )
        // c 0.1 0.112 0.029 0.164 -0.014 0.212
        curveToRelative(
            dx1 = 0.1f,
            dy1 = 0.112f,
            dx2 = 0.029f,
            dy2 = 0.164f,
            dx3 = -0.014f,
            dy3 = 0.212f,
        )
        // a 0.576 0.576 0 0 1 -0.4 0.078
        arcToRelative(
            a = 0.576f,
            b = 0.576f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.4f,
            dy1 = 0.078f,
        )
        // a 4.058 4.058 0 0 0 -1.12 -0.028
        arcToRelative(
            a = 4.058f,
            b = 4.058f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.12f,
            dy1 = -0.028f,
        )
        // a 9.281 9.281 0 0 0 -1.035 0.214
        arcToRelative(
            a = 9.281f,
            b = 9.281f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.035f,
            dy1 = 0.214f,
        )
        // a 1.176 1.176 0 0 0 -0.59 0.312
        arcToRelative(
            a = 1.176f,
            b = 1.176f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.59f,
            dy1 = 0.312f,
        )
        // a 0.359 0.359 0 0 0 -0.1 0.321
        arcToRelative(
            a = 0.359f,
            b = 0.359f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.1f,
            dy1 = 0.321f,
        )
        // c 0.051 0.158 0.136 0.223 0.323 0.289
        curveToRelative(
            dx1 = 0.051f,
            dy1 = 0.158f,
            dx2 = 0.136f,
            dy2 = 0.223f,
            dx3 = 0.323f,
            dy3 = 0.289f,
        )
        // a 2.855 2.855 0 0 0 1.355 0.072
        arcToRelative(
            a = 2.855f,
            b = 2.855f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.355f,
            dy1 = 0.072f,
        )
        // c 0.335 -0.046 0.808 -0.149 1.118 -0.217
        curveToRelative(
            dx1 = 0.335f,
            dy1 = -0.046f,
            dx2 = 0.808f,
            dy2 = -0.149f,
            dx3 = 1.118f,
            dy3 = -0.217f,
        )
        // c 0.44 -0.1 1.2 -0.3 1.413 -0.35
        curveToRelative(
            dx1 = 0.44f,
            dy1 = -0.1f,
            dx2 = 1.2f,
            dy2 = -0.3f,
            dx3 = 1.413f,
            dy3 = -0.35f,
        )
        // a 0.734 0.734 0 0 0 0.094 0.251
        arcToRelative(
            a = 0.734f,
            b = 0.734f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.094f,
            dy1 = 0.251f,
        )
        // a 0.6 0.6 0 0 0 0.261 0.132
        arcToRelative(
            a = 0.6f,
            b = 0.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.261f,
            dy1 = 0.132f,
        )
        // c -0.022 -0.085 -0.062 -0.119 -0.061 -0.2
        curveToRelative(
            dx1 = -0.022f,
            dy1 = -0.085f,
            dx2 = -0.062f,
            dy2 = -0.119f,
            dx3 = -0.061f,
            dy3 = -0.2f,
        )
        // a 0.28 0.28 0 0 1 0.084 -0.182
        arcToRelative(
            a = 0.28f,
            b = 0.28f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.084f,
            dy1 = -0.182f,
        )
        // a 0.785 0.785 0 0 0 0.116 0.246
        arcToRelative(
            a = 0.785f,
            b = 0.785f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.116f,
            dy1 = 0.246f,
        )
        // a 0.5 0.5 0 0 0 0.28 0.1
        arcToRelative(
            a = 0.5f,
            b = 0.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.28f,
            dy1 = 0.1f,
        )
        // a 0.266 0.266 0 0 1 -0.081 -0.188
        arcToRelative(
            a = 0.266f,
            b = 0.266f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.081f,
            dy1 = -0.188f,
        )
        // a 0.233 0.233 0 0 1 0.059 -0.175
        arcToRelative(
            a = 0.233f,
            b = 0.233f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.059f,
            dy1 = -0.175f,
        )
        // a 0.741 0.741 0 0 0 0.167 0.25
        arcToRelative(
            a = 0.741f,
            b = 0.741f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.167f,
            dy1 = 0.25f,
        )
        // a 0.465 0.465 0 0 0 0.259 0.029
        arcToRelative(
            a = 0.465f,
            b = 0.465f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.259f,
            dy1 = 0.029f,
        )
        // a 0.316 0.316 0 0 1 -0.133 -0.1
        arcToRelative(
            a = 0.316f,
            b = 0.316f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.133f,
            dy1 = -0.1f,
        )
        // a 0.164 0.164 0 0 1 -0.04 -0.129
        arcToRelative(
            a = 0.164f,
            b = 0.164f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.04f,
            dy1 = -0.129f,
        )
        // c 0.008 -0.071 0.113 -0.13 0.2 -0.149
        curveToRelative(
            dx1 = 0.008f,
            dy1 = -0.071f,
            dx2 = 0.113f,
            dy2 = -0.13f,
            dx3 = 0.2f,
            dy3 = -0.149f,
        )
        // a 0.372 0.372 0 0 1 0.363 0.089
        arcToRelative(
            a = 0.372f,
            b = 0.372f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.363f,
            dy1 = 0.089f,
        )
        // a 0.225 0.225 0 0 1 0.068 0.291
        arcToRelative(
            a = 0.225f,
            b = 0.225f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.068f,
            dy1 = 0.291f,
        )
        // c -0.223 0.365 -0.954 0.356 -1.362 0.388
        curveToRelative(
            dx1 = -0.223f,
            dy1 = 0.365f,
            dx2 = -0.954f,
            dy2 = 0.356f,
            dx3 = -1.362f,
            dy3 = 0.388f,
        )
        // a 6.352 6.352 0 0 1 -0.768 -0.009
        arcToRelative(
            a = 6.352f,
            b = 6.352f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.768f,
            dy1 = -0.009f,
        )
        // c -0.341 -0.01 -0.654 -0.09 -1.017 -0.1
        curveToRelative(
            dx1 = -0.341f,
            dy1 = -0.01f,
            dx2 = -0.654f,
            dy2 = -0.09f,
            dx3 = -1.017f,
            dy3 = -0.1f,
        )
        // a 4.969 4.969 0 0 0 -0.721 0.045
        arcToRelative(
            a = 4.969f,
            b = 4.969f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.721f,
            dy1 = 0.045f,
        )
        // c -0.474 0.057 -2.674 0.256 -2.674 0.256
        curveToRelative(
            dx1 = -0.474f,
            dy1 = 0.057f,
            dx2 = -2.674f,
            dy2 = 0.256f,
            dx3 = -2.674f,
            dy3 = 0.256f,
        )
        // l -0.6 0.054
        lineToRelative(dx = -0.6f, dy = 0.054f)
        // a 10.494 10.494 0 0 0 -1.165 -0.09
        arcToRelative(
            a = 10.494f,
            b = 10.494f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.165f,
            dy1 = -0.09f,
        )
        // a 2.22 2.22 0 0 1 -0.373 0
        arcToRelative(
            a = 2.22f,
            b = 2.22f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.373f,
            dy1 = 0.0f,
        )
        // v 0.351
        verticalLineToRelative(dy = 0.351f)
        // l -0.009 0.01
        lineToRelative(dx = -0.009f, dy = 0.01f)
        // s -0.265 -0.163 -0.406 -0.233
        reflectiveCurveToRelative(
            dx1 = -0.265f,
            dy1 = -0.163f,
            dx2 = -0.406f,
            dy2 = -0.233f,
        )
        // c -0.264 -0.132 -0.817 -0.351 -0.817 -0.351
        curveToRelative(
            dx1 = -0.264f,
            dy1 = -0.132f,
            dx2 = -0.817f,
            dy2 = -0.351f,
            dx3 = -0.817f,
            dy3 = -0.351f,
        )
        // s -0.148 -0.148 -0.153 -0.257
        reflectiveCurveToRelative(
            dx1 = -0.148f,
            dy1 = -0.148f,
            dx2 = -0.153f,
            dy2 = -0.257f,
        )
        // s 0.054 -0.157 0.067 -0.227
        reflectiveCurveToRelative(
            dx1 = 0.054f,
            dy1 = -0.157f,
            dx2 = 0.067f,
            dy2 = -0.227f,
        )
        // a 0.2 0.2 0 0 0 -0.037 -0.135
        arcToRelative(
            a = 0.2f,
            b = 0.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.037f,
            dy1 = -0.135f,
        )
        // a 0.18 0.18 0 0 0 -0.227 -0.025
        arcToRelative(
            a = 0.18f,
            b = 0.18f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.227f,
            dy1 = -0.025f,
        )
        // a 0.643 0.643 0 0 0 -0.138 0.146
        arcToRelative(
            a = 0.643f,
            b = 0.643f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.138f,
            dy1 = 0.146f,
        )
        // c -0.137 -0.166 -0.246 -0.149 -0.35 -0.067
        curveToRelative(
            dx1 = -0.137f,
            dy1 = -0.166f,
            dx2 = -0.246f,
            dy2 = -0.149f,
            dx3 = -0.35f,
            dy3 = -0.067f,
        )
        // a 0.229 0.229 0 0 0 -0.024 0.385
        arcToRelative(
            a = 0.229f,
            b = 0.229f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.024f,
            dy1 = 0.385f,
        )
        // c -0.243 0.034 -0.249 0.2 -0.21 0.3
        curveToRelative(
            dx1 = -0.243f,
            dy1 = 0.034f,
            dx2 = -0.249f,
            dy2 = 0.2f,
            dx3 = -0.21f,
            dy3 = 0.3f,
        )
        // a 0.283 0.283 0 0 0 0.214 0.154
        arcToRelative(
            a = 0.283f,
            b = 0.283f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.214f,
            dy1 = 0.154f,
        )
        // c 0.109 0.01 0.24 -0.081 0.352 0.038
        curveToRelative(
            dx1 = 0.109f,
            dy1 = 0.01f,
            dx2 = 0.24f,
            dy2 = -0.081f,
            dx3 = 0.352f,
            dy3 = 0.038f,
        )
        // l 0.092 0.1
        lineToRelative(dx = 0.092f, dy = 0.1f)
        // a 0.542 0.542 0 0 1 -0.26 0.155
        arcToRelative(
            a = 0.542f,
            b = 0.542f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.26f,
            dy1 = 0.155f,
        )
        // a 1.425 1.425 0 0 0 0.324 0.1
        arcToRelative(
            a = 1.425f,
            b = 1.425f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.324f,
            dy1 = 0.1f,
        )
        // a 1.019 1.019 0 0 0 0.267 -0.051
        arcToRelative(
            a = 1.019f,
            b = 1.019f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.267f,
            dy1 = -0.051f,
        )
        // a 0.351 0.351 0 0 1 -0.226 0.179
        arcToRelative(
            a = 0.351f,
            b = 0.351f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.226f,
            dy1 = 0.179f,
        )
        // a 1.034 1.034 0 0 0 0.254 0.081
        arcToRelative(
            a = 1.034f,
            b = 1.034f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.254f,
            dy1 = 0.081f,
        )
        // a 1.148 1.148 0 0 0 0.271 -0.048
        arcToRelative(
            a = 1.148f,
            b = 1.148f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.271f,
            dy1 = -0.048f,
        )
        // c -0.043 0.1 -0.136 0.125 -0.215 0.17
        curveToRelative(
            dx1 = -0.043f,
            dy1 = 0.1f,
            dx2 = -0.136f,
            dy2 = 0.125f,
            dx3 = -0.215f,
            dy3 = 0.17f,
        )
        // a 1.466 1.466 0 0 0 0.286 0.08
        arcToRelative(
            a = 1.466f,
            b = 1.466f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.286f,
            dy1 = 0.08f,
        )
        // a 1.312 1.312 0 0 0 0.3 -0.034
        arcToRelative(
            a = 1.312f,
            b = 1.312f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.3f,
            dy1 = -0.034f,
        )
        // a 0.488 0.488 0 0 1 -0.229 0.176
        arcToRelative(
            a = 0.488f,
            b = 0.488f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.229f,
            dy1 = 0.176f,
        )
        // a 0.845 0.845 0 0 0 0.283 0.063
        arcToRelative(
            a = 0.845f,
            b = 0.845f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.283f,
            dy1 = 0.063f,
        )
        // a 1.235 1.235 0 0 0 0.3 -0.1
        arcToRelative(
            a = 1.235f,
            b = 1.235f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.3f,
            dy1 = -0.1f,
        )
        // a 1.52 1.52 0 0 0 0.151 0.115
        arcToRelative(
            a = 1.52f,
            b = 1.52f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.151f,
            dy1 = 0.115f,
        )
        // c -0.142 0.03 -0.345 0.075 -0.442 0.108
        curveToRelative(
            dx1 = -0.142f,
            dy1 = 0.03f,
            dx2 = -0.345f,
            dy2 = 0.075f,
            dx3 = -0.442f,
            dy3 = 0.108f,
        )
        // a 6.056 6.056 0 0 0 -0.704 0.347
        arcToRelative(
            a = 6.056f,
            b = 6.056f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.704f,
            dy1 = 0.347f,
        )
        // a 0.747 0.747 0 0 1 -0.324 -0.052
        arcToRelative(
            a = 0.747f,
            b = 0.747f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.324f,
            dy1 = -0.052f,
        )
        // c -0.085 -0.056 -0.1 -0.133 -0.153 -0.184
        curveToRelative(
            dx1 = -0.085f,
            dy1 = -0.056f,
            dx2 = -0.1f,
            dy2 = -0.133f,
            dx3 = -0.153f,
            dy3 = -0.184f,
        )
        // a 0.267 0.267 0 0 0 -0.141 -0.058
        arcToRelative(
            a = 0.267f,
            b = 0.267f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.141f,
            dy1 = -0.058f,
        )
        // a 0.166 0.166 0 0 0 -0.172 0.141
        arcToRelative(
            a = 0.166f,
            b = 0.166f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.172f,
            dy1 = 0.141f,
        )
        // a 0.448 0.448 0 0 0 0.022 0.16
        arcToRelative(
            a = 0.448f,
            b = 0.448f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.022f,
            dy1 = 0.16f,
        )
        // c -0.235 -0.008 -0.278 0.1 -0.275 0.222
        curveToRelative(
            dx1 = -0.235f,
            dy1 = -0.008f,
            dx2 = -0.278f,
            dy2 = 0.1f,
            dx3 = -0.275f,
            dy3 = 0.222f,
        )
        // s 0.127 0.265 0.359 0.235
        reflectiveCurveToRelative(
            dx1 = 0.127f,
            dy1 = 0.265f,
            dx2 = 0.359f,
            dy2 = 0.235f,
        )
        // c -0.13 0.188 -0.028 0.311 0.084 0.344
        curveToRelative(
            dx1 = -0.13f,
            dy1 = 0.188f,
            dx2 = -0.028f,
            dy2 = 0.311f,
            dx3 = 0.084f,
            dy3 = 0.344f,
        )
        // a 0.331 0.331 0 0 0 0.274 -0.053
        arcToRelative(
            a = 0.331f,
            b = 0.331f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.274f,
            dy1 = -0.053f,
        )
        // c 0.08 -0.067 0.088 -0.213 0.265 -0.217
        curveToRelative(
            dx1 = 0.08f,
            dy1 = -0.067f,
            dx2 = 0.088f,
            dy2 = -0.213f,
            dx3 = 0.265f,
            dy3 = -0.217f,
        )
        // h 0.146
        horizontalLineToRelative(dx = 0.146f)
        // a 0.419 0.419 0 0 1 -0.038 0.273
        arcToRelative(
            a = 0.419f,
            b = 0.419f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.038f,
            dy1 = 0.273f,
        )
        // a 1.438 1.438 0 0 0 0.3 -0.16
        arcToRelative(
            a = 1.438f,
            b = 1.438f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.3f,
            dy1 = -0.16f,
        )
        // a 0.782 0.782 0 0 0 0.132 -0.215
        arcToRelative(
            a = 0.782f,
            b = 0.782f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.132f,
            dy1 = -0.215f,
        )
        // a 0.278 0.278 0 0 1 0.007 0.264
        arcToRelative(
            a = 0.278f,
            b = 0.278f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.007f,
            dy1 = 0.264f,
        )
        // a 1.042 1.042 0 0 0 0.237 -0.124
        arcToRelative(
            a = 1.042f,
            b = 1.042f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.237f,
            dy1 = -0.124f,
        )
        // a 0.884 0.884 0 0 0 0.137 -0.215
        arcToRelative(
            a = 0.884f,
            b = 0.884f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.137f,
            dy1 = -0.215f,
        )
        // c 0.06 0.091 0.019 0.169 0.006 0.251
        curveToRelative(
            dx1 = 0.06f,
            dy1 = 0.091f,
            dx2 = 0.019f,
            dy2 = 0.169f,
            dx3 = 0.006f,
            dy3 = 0.251f,
        )
        // a 1.431 1.431 0 0 0 0.258 -0.147
        arcToRelative(
            a = 1.431f,
            b = 1.431f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.258f,
            dy1 = -0.147f,
        )
        // a 1.038 1.038 0 0 0 0.17 -0.228
        arcToRelative(
            a = 1.038f,
            b = 1.038f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.17f,
            dy1 = -0.228f,
        )
        // a 0.361 0.361 0 0 1 0 0.263
        arcToRelative(
            a = 0.361f,
            b = 0.361f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 0.263f,
        )
        // a 0.835 0.835 0 0 0 0.242 -0.155
        arcToRelative(
            a = 0.835f,
            b = 0.835f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.242f,
            dy1 = -0.155f,
        )
        // a 0.945 0.945 0 0 0 0.111 -0.266
        arcToRelative(
            a = 0.945f,
            b = 0.945f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.111f,
            dy1 = -0.266f,
        )
        // a 0.848 0.848 0 0 0 0.3 -0.06
        arcToRelative(
            a = 0.848f,
            b = 0.848f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.3f,
            dy1 = -0.06f,
        )
        // a 0.635 0.635 0 0 0 0.157 -0.209
        arcToRelative(
            a = 0.635f,
            b = 0.635f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.157f,
            dy1 = -0.209f,
        )
        // a 5.532 5.532 0 0 0 0.746 -0.1
        arcToRelative(
            a = 5.532f,
            b = 5.532f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.746f,
            dy1 = -0.1f,
        )
        // c 0.48 -0.125 1.782 -0.625 2.565 -0.876
        curveToRelative(
            dx1 = 0.48f,
            dy1 = -0.125f,
            dx2 = 1.782f,
            dy2 = -0.625f,
            dx3 = 2.565f,
            dy3 = -0.876f,
        )
        // c 0.113 0.081 0.2 0.167 0.191 0.215
        curveToRelative(
            dx1 = 0.113f,
            dy1 = 0.081f,
            dx2 = 0.2f,
            dy2 = 0.167f,
            dx3 = 0.191f,
            dy3 = 0.215f,
        )
        // s -0.085 0.069 -0.12 0.116
        reflectiveCurveToRelative(
            dx1 = -0.085f,
            dy1 = 0.069f,
            dx2 = -0.12f,
            dy2 = 0.116f,
        )
        // s 0 0.088 0.023 0.122
        reflectiveCurveToRelative(
            dx1 = 0.0f,
            dy1 = 0.088f,
            dx2 = 0.023f,
            dy2 = 0.122f,
        )
        // s 0.125 0.057 0.154 0.1
        reflectiveCurveToRelative(
            dx1 = 0.125f,
            dy1 = 0.057f,
            dx2 = 0.154f,
            dy2 = 0.1f,
        )
        // s 0.039 0.078 0.01 0.117
        reflectiveCurveToRelative(
            dx1 = 0.039f,
            dy1 = 0.078f,
            dx2 = 0.01f,
            dy2 = 0.117f,
        )
        // c -0.058 0.079 -0.256 0.116 -0.352 0.16
        curveToRelative(
            dx1 = -0.058f,
            dy1 = 0.079f,
            dx2 = -0.256f,
            dy2 = 0.116f,
            dx3 = -0.352f,
            dy3 = 0.16f,
        )
        // c -0.175 0.079 -0.469 0.251 -0.469 0.251
        curveToRelative(
            dx1 = -0.175f,
            dy1 = 0.079f,
            dx2 = -0.469f,
            dy2 = 0.251f,
            dx3 = -0.469f,
            dy3 = 0.251f,
        )
        // a 0.661 0.661 0 0 1 -0.269 -0.038
        arcToRelative(
            a = 0.661f,
            b = 0.661f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.269f,
            dy1 = -0.038f,
        )
        // c -0.083 -0.021 -0.186 -0.124 -0.273 -0.122
        curveToRelative(
            dx1 = -0.083f,
            dy1 = -0.021f,
            dx2 = -0.186f,
            dy2 = -0.124f,
            dx3 = -0.273f,
            dy3 = -0.122f,
        )
        // a 0.244 0.244 0 0 0 -0.2 0.123
        arcToRelative(
            a = 0.244f,
            b = 0.244f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.2f,
            dy1 = 0.123f,
        )
        // a 0.2 0.2 0 0 0 0.051 0.173
        arcToRelative(
            a = 0.2f,
            b = 0.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.051f,
            dy1 = 0.173f,
        )
        // l 0.16 0.1
        lineToRelative(dx = 0.16f, dy = 0.1f)
        // a 0.491 0.491 0 0 0 -0.1 0.176
        arcToRelative(
            a = 0.491f,
            b = 0.491f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.1f,
            dy1 = 0.176f,
        )
        // a 0.175 0.175 0 0 0 0.064 0.139
        arcToRelative(
            a = 0.175f,
            b = 0.175f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.064f,
            dy1 = 0.139f,
        )
        // a 0.2 0.2 0 0 0 0.15 0.085
        arcToRelative(
            a = 0.2f,
            b = 0.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.15f,
            dy1 = 0.085f,
        )
        // a 0.778 0.778 0 0 0 0.165 -0.018
        arcToRelative(
            a = 0.778f,
            b = 0.778f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.165f,
            dy1 = -0.018f,
        )
        // a 0.244 0.244 0 0 0 0.275 0.253
        arcToRelative(
            a = 0.244f,
            b = 0.244f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.275f,
            dy1 = 0.253f,
        )
        // a 0.161 0.161 0 0 0 0.145 -0.081
        arcToRelative(
            a = 0.161f,
            b = 0.161f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.145f,
            dy1 = -0.081f,
        )
        // c 0.032 -0.046 0.022 -0.163 0.075 -0.212
        curveToRelative(
            dx1 = 0.032f,
            dy1 = -0.046f,
            dx2 = 0.022f,
            dy2 = -0.163f,
            dx3 = 0.075f,
            dy3 = -0.212f,
        )
        // l 0.214 -0.2
        lineToRelative(dx = 0.214f, dy = -0.2f)
        // c 0.1 0.053 0.1 0.137 0.086 0.223
        curveToRelative(
            dx1 = 0.1f,
            dy1 = 0.053f,
            dx2 = 0.1f,
            dy2 = 0.137f,
            dx3 = 0.086f,
            dy3 = 0.223f,
        )
        // a 0.828 0.828 0 0 0 0.179 -0.153
        arcToRelative(
            a = 0.828f,
            b = 0.828f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.179f,
            dy1 = -0.153f,
        )
        // a 0.653 0.653 0 0 0 0.055 -0.219
        arcToRelative(
            a = 0.653f,
            b = 0.653f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.055f,
            dy1 = -0.219f,
        )
        // a 0.236 0.236 0 0 1 0.106 0.24
        arcToRelative(
            a = 0.236f,
            b = 0.236f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.106f,
            dy1 = 0.24f,
        )
        // a 0.934 0.934 0 0 0 0.185 -0.154
        arcToRelative(
            a = 0.934f,
            b = 0.934f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.185f,
            dy1 = -0.154f,
        )
        // a 0.909 0.909 0 0 0 0.091 -0.221
        arcToRelative(
            a = 0.909f,
            b = 0.909f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.091f,
            dy1 = -0.221f,
        )
        // a 0.253 0.253 0 0 1 0.061 0.256
        arcToRelative(
            a = 0.253f,
            b = 0.253f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.061f,
            dy1 = 0.256f,
        )
        // a 0.737 0.737 0 0 0 0.2 -0.193
        arcToRelative(
            a = 0.737f,
            b = 0.737f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.2f,
            dy1 = -0.193f,
        )
        // a 0.8 0.8 0 0 0 0.05 -0.185
        arcToRelative(
            a = 0.8f,
            b = 0.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.05f,
            dy1 = -0.185f,
        )
        // c 0.2 0.01 0.318 -0.076 0.325 -0.162
        curveToRelative(
            dx1 = 0.2f,
            dy1 = 0.01f,
            dx2 = 0.318f,
            dy2 = -0.076f,
            dx3 = 0.325f,
            dy3 = -0.162f,
        )
        // c 0 -0.066 -0.075 -0.155 -0.232 -0.177
        curveToRelative(
            dx1 = 0.0f,
            dy1 = -0.066f,
            dx2 = -0.075f,
            dy2 = -0.155f,
            dx3 = -0.232f,
            dy3 = -0.177f,
        )
        // a 0.787 0.787 0 0 1 -0.083 -0.145
        arcToRelative(
            a = 0.787f,
            b = 0.787f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.083f,
            dy1 = -0.145f,
        )
        // a 0.2 0.2 0 0 1 0 -0.134
        arcToRelative(
            a = 0.2f,
            b = 0.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -0.134f,
        )
        // a 0.555 0.555 0 0 1 0.179 -0.222
        arcToRelative(
            a = 0.555f,
            b = 0.555f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.179f,
            dy1 = -0.222f,
        )
        // c 0.016 -0.013 0.041 -0.027 0.062 -0.041
        curveToRelative(
            dx1 = 0.016f,
            dy1 = -0.013f,
            dx2 = 0.041f,
            dy2 = -0.027f,
            dx3 = 0.062f,
            dy3 = -0.041f,
        )
        // l 0.009 0.029
        lineToRelative(dx = 0.009f, dy = 0.029f)
        // a 0.217 0.217 0 0 0 0.112 0.127
        arcToRelative(
            a = 0.217f,
            b = 0.217f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.112f,
            dy1 = 0.127f,
        )
        // a 0.2 0.2 0 0 0 0.166 -0.025
        arcToRelative(
            a = 0.2f,
            b = 0.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.166f,
            dy1 = -0.025f,
        )
        // a 1.36 1.36 0 0 0 0.863 0.488
        arcToRelative(
            a = 1.36f,
            b = 1.36f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.863f,
            dy1 = 0.488f,
        )
        // a 3.167 3.167 0 0 0 0.762 -0.018
        arcToRelative(
            a = 3.167f,
            b = 3.167f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.762f,
            dy1 = -0.018f,
        )
        // a 7.46 7.46 0 0 0 0.543 -0.142
        arcToRelative(
            a = 7.46f,
            b = 7.46f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.543f,
            dy1 = -0.142f,
        )
        // a 2.894 2.894 0 0 0 0.208 0.24
        arcToRelative(
            a = 2.894f,
            b = 2.894f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.208f,
            dy1 = 0.24f,
        )
        // a 4.519 4.519 0 0 0 0.454 0.337
        arcToRelative(
            a = 4.519f,
            b = 4.519f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.454f,
            dy1 = 0.337f,
        )
        // a 0.6 0.6 0 0 1 -0.183 0.159
        arcToRelative(
            a = 0.6f,
            b = 0.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.183f,
            dy1 = 0.159f,
        )
        // c -0.074 0.032 -0.22 0.039 -0.271 0.1
        curveToRelative(
            dx1 = -0.074f,
            dy1 = 0.032f,
            dx2 = -0.22f,
            dy2 = 0.039f,
            dx3 = -0.271f,
            dy3 = 0.1f,
        )
        // a 0.184 0.184 0 0 0 -0.019 0.207
        arcToRelative(
            a = 0.184f,
            b = 0.184f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.019f,
            dy1 = 0.207f,
        )
        // a 0.266 0.266 0 0 0 0.178 0.078
        arcToRelative(
            a = 0.266f,
            b = 0.266f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.178f,
            dy1 = 0.078f,
        )
        // l 0.186 -0.037
        lineToRelative(dx = 0.186f, dy = -0.037f)
        // a 0.5 0.5 0 0 0 0.086 0.178
        arcToRelative(
            a = 0.5f,
            b = 0.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.086f,
            dy1 = 0.178f,
        )
        // a 0.231 0.231 0 0 0 0.158 0.048
        arcToRelative(
            a = 0.231f,
            b = 0.231f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.158f,
            dy1 = 0.048f,
        )
        // c 0.079 0 0.105 0.006 0.164 -0.041
        curveToRelative(
            dx1 = 0.079f,
            dy1 = 0.0f,
            dx2 = 0.105f,
            dy2 = 0.006f,
            dx3 = 0.164f,
            dy3 = -0.041f,
        )
        // a 0.553 0.553 0 0 0 0.087 -0.118
        arcToRelative(
            a = 0.553f,
            b = 0.553f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.087f,
            dy1 = -0.118f,
        )
        // a 0.368 0.368 0 0 0 0.128 0.064
        arcToRelative(
            a = 0.368f,
            b = 0.368f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.128f,
            dy1 = 0.064f,
        )
        // a 0.271 0.271 0 0 0 0.256 -0.078
        arcToRelative(
            a = 0.271f,
            b = 0.271f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.256f,
            dy1 = -0.078f,
        )
        // a 0.122 0.122 0 0 0 0.021 -0.145
        arcToRelative(
            a = 0.122f,
            b = 0.122f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.021f,
            dy1 = -0.145f,
        )
        // c -0.024 -0.052 -0.128 -0.121 -0.138 -0.187z
        curveToRelative(
            dx1 = -0.024f,
            dy1 = -0.052f,
            dx2 = -0.128f,
            dy2 = -0.121f,
            dx3 = -0.138f,
            dy3 = -0.187f,
        )
        close()
    }
    // m13.614 13.709  l0.066 0.042 -0.009 -0.078 a0.441 0.441 0 0 0 -0.072 -0.206 0.528 0.528 0 0 0 -0.144 -0.108 l0.017 -0.007 a0.771 0.771 0 0 1 0.145 -0.013 h0.083 l-0.053 -0.062 a1.043 1.043 0 0 0 -0.136 -0.13 0.342 0.342 0 0 0 -0.181 -0.042 l0.011 -0.007 a0.309 0.309 0 0 1 0.127 -0.019 h0.085 l-0.056 -0.065 a0.487 0.487 0 0 0 -0.161 -0.12 0.675 0.675 0 0 0 -0.17 -0.025 0.075 0.075 0 0 1 0.018 -0.015 1.2 1.2 0 0 1 0.163 -0.063 l0.087 -0.026 -0.081 -0.042 a1.266 1.266 0 0 0 -0.2 -0.082 0.4 0.4 0 0 0 -0.1 -0.005 0.621 0.621 0 0 1 -0.114 0 0.178 0.178 0 0 1 -0.085 -0.045 c0.027 -0.185 -0.083 -0.235 -0.118 -0.246 a0.354 0.354 0 0 0 -0.165 0 0.373 0.373 0 0 0 -0.154 0.105 c-0.074 0 -0.383 -0.012 -0.577 0 a1.336 1.336 0 0 0 -0.2 0.036 0.723 0.723 0 0 1 -0.32 0.031 0.285 0.285 0 0 1 -0.13 -0.116 0.533 0.533 0 0 0 -0.1 -0.11 l-0.146 -0.1 0.23 0.006 a4.854 4.854 0 0 0 1.493 -0.111 c0.334 -0.105 0.718 -0.271 0.73 -0.627 a0.572 0.572 0 0 0 -0.154 -0.427 0.939 0.939 0 0 0 -0.709 -0.221 4.149 4.149 0 0 0 -1.052 0.129 c-0.11 0.025 -0.305 0.079 -0.531 0.142 -0.326 0.092 -0.7 0.2 -0.9 0.235 -0.15 0.029 -0.315 0.065 -0.473 0.1 -0.222 0.049 -0.451 0.1 -0.657 0.134 a2.646 2.646 0 0 1 -0.977 0 0.457 0.457 0 0 1 -0.293 -0.147 0.1 0.1 0 0 1 0 -0.1 0.546 0.546 0 0 1 0.349 -0.146 l0.064 -0.012 a0.472 0.472 0 0 1 0.179 0.071 0.993 0.993 0 0 0 0.142 0.065 1.209 1.209 0 0 0 0.44 0.05 0.879 0.879 0 0 0 0.375 -0.092 0.493 0.493 0 0 1 0.378 -0.1 0.206 0.206 0 0 1 0.01 0.139 l-0.01 0.066 0.062 -0.026 c0.13 -0.055 0.2 -0.123 0.219 -0.2 a0.2 0.2 0 0 0 -0.027 -0.135 2.488 2.488 0 0 0 0.349 0.057 1.708 1.708 0 0 0 0.751 -0.11 0.637 0.637 0 0 0 0.453 -0.574 l0.008 -0.1 -0.229 0.228 a0.989 0.989 0 0 1 -0.415 0.146 0.24 0.24 0 0 0 -0.014 -0.161 0.3 0.3 0 0 0 -0.242 -0.151 L10.4 10.319 l0.056 0.062 c0.068 0.075 0.043 0.1 0 0.147 l-0.014 0.015 a0.558 0.558 0 0 1 -0.365 0.065 c-0.053 0 -0.106 -0.012 -0.163 -0.019 a3.642 3.642 0 0 0 -0.964 -0.009 9.327 9.327 0 0 0 -1.04 0.215 1.2 1.2 0 0 0 -0.609 0.323 0.4 0.4 0 0 0 -0.1 0.357 0.465 0.465 0 0 0 0.346 0.313 2.231 2.231 0 0 0 0.686 0.118 c-0.772 0.073 -1.686 0.156 -1.7 0.157 l-0.59 0.054 a10.2 10.2 0 0 0 -1.171 -0.089 h-0.028 a1.139 1.139 0 0 1 -0.181 0 l-0.163 -0.001 h-0.037 v0.344 a6.226 6.226 0 0 0 -0.364 -0.207 c-0.246 -0.123 -0.746 -0.323 -0.813 -0.35 a0.483 0.483 0 0 1 -0.136 -0.226 0.274 0.274 0 0 1 0.034 -0.131 0.386 0.386 0 0 0 0.032 -0.088 0.24 0.24 0 0 0 -0.044 -0.164 0.216 0.216 0 0 0 -0.275 -0.036 0.514 0.514 0 0 0 -0.122 0.12 0.245 0.245 0 0 0 -0.372 -0.037 0.318 0.318 0 0 0 -0.133 0.235 0.241 0.241 0 0 0 0.058 0.156 0.258 0.258 0 0 0 -0.16 0.117 0.255 0.255 0 0 0 -0.009 0.223 0.314 0.314 0 0 0 0.244 0.177 0.415 0.415 0 0 0 0.121 -0.012 c0.078 -0.015 0.146 -0.028 0.208 0.038 l0.069 0.074 a0.6 0.6 0 0 1 -0.223 0.119 l-0.078 0.031 0.084 0.037 a1.429 1.429 0 0 0 0.336 0.1 0.623 0.623 0 0 0 0.179 -0.024 0.474 0.474 0 0 1 -0.147 0.08 l-0.083 0.031 0.081 0.037 a0.994 0.994 0 0 0 0.267 0.085 0.706 0.706 0 0 0 0.176 -0.022 0.487 0.487 0 0 1 -0.081 0.046 0.577 0.577 0 0 0 -0.055 0.029 l-0.068 0.039 0.073 0.028 a1.462 1.462 0 0 0 0.3 0.082 1.035 1.035 0 0 0 0.207 -0.014 0.566 0.566 0 0 1 -0.145 0.085 l-0.079 0.036 0.081 0.032 a0.854 0.854 0 0 0 0.3 0.066 1.137 1.137 0 0 0 0.29 -0.092 c0.013 0.012 0.042 0.031 0.065 0.048 -0.131 0.029 -0.28 0.064 -0.361 0.092 a5.949 5.949 0 0 0 -0.72 0.34 0.639 0.639 0 0 1 -0.292 -0.047 0.273 0.273 0 0 1 -0.092 -0.1 0.43 0.43 0 0 0 -0.056 -0.075 0.3 0.3 0 0 0 -0.165 -0.068 0.2 0.2 0 0 0 -0.211 0.171 0.384 0.384 0 0 0 0.01 0.13 0.3 0.3 0 0 0 -0.2 0.07 0.25 0.25 0 0 0 -0.062 0.189 0.27 0.27 0 0 0 0.1 0.2 0.359 0.359 0 0 0 0.234 0.081 0.243 0.243 0 0 0 -0.019 0.194 0.235 0.235 0 0 0 0.159 0.144 0.372 0.372 0 0 0 0.309 -0.06 0.357 0.357 0 0 0 0.07 -0.091 0.187 0.187 0 0 1 0.171 -0.117 h0.117 a0.446 0.446 0 0 1 -0.044 0.222 l-0.029 0.079 0.078 -0.032 a1.454 1.454 0 0 0 0.312 -0.166 0.571 0.571 0 0 0 0.1 -0.15 0.323 0.323 0 0 1 -0.025 0.158 l-0.028 0.077 0.076 -0.029 a1.081 1.081 0 0 0 0.249 -0.131 0.642 0.642 0 0 0 0.106 -0.149 0.33 0.33 0 0 1 -0.013 0.1 0.535 0.535 0 0 0 -0.011 0.055 l-0.011 0.068 0.063 -0.028 a1.462 1.462 0 0 0 0.266 -0.152 0.844 0.844 0 0 0 0.132 -0.162 0.385 0.385 0 0 1 -0.02 0.159 l-0.021 0.076 0.072 -0.032 a0.875 0.875 0 0 0 0.256 -0.165 0.862 0.862 0 0 0 0.11 -0.254 0.777 0.777 0 0 0 0.289 -0.064 0.589 0.589 0 0 0 0.16 -0.205 5.142 5.142 0 0 0 0.732 -0.094 c0.27 -0.071 0.794 -0.258 1.349 -0.456 a50.06 50.06 0 0 1 1.2 -0.417 c0.113 0.064 0.162 0.123 0.157 0.168 a0.17 0.17 0 0 1 -0.043 0.039 0.435 0.435 0 0 0 -0.071 0.065 0.145 0.145 0 0 0 0.024 0.168 0.24 0.24 0 0 0 0.093 0.063 0.146 0.146 0 0 1 0.059 0.037 c0.026 0.04 0.024 0.056 0.011 0.074 a0.531 0.531 0 0 1 -0.22 0.1 c-0.044 0.015 -0.086 0.028 -0.118 0.043 a7.038 7.038 0 0 0 -0.466 0.249 0.409 0.409 0 0 1 -0.139 -0.01 l-0.107 -0.028 a0.447 0.447 0 0 1 -0.1 -0.052 0.363 0.363 0 0 0 -0.176 -0.071 h-0.014 a0.278 0.278 0 0 0 -0.229 0.139 0.13 0.13 0 0 0 -0.007 0.1 0.234 0.234 0 0 0 0.069 0.129 l0.125 0.079 a0.389 0.389 0 0 0 -0.083 0.163 0.214 0.214 0 0 0 0.075 0.169 l0.013 0.013 a0.211 0.211 0 0 0 0.158 0.083 0.646 0.646 0 0 0 0.136 -0.01 0.221 0.221 0 0 0 0.034 0.107 0.317 0.317 0 0 0 0.249 0.14 h0.031 a0.2 0.2 0 0 0 0.171 -0.1 0.3 0.3 0 0 0 0.032 -0.1 0.208 0.208 0 0 1 0.038 -0.106 l0.192 -0.18 c0.05 0.038 0.054 0.09 0.045 0.171 l-0.009 0.079 0.066 -0.043 a0.8 0.8 0 0 0 0.19 -0.164 0.475 0.475 0 0 0 0.051 -0.161 0.171 0.171 0 0 1 0.042 0.155 l-0.015 0.084 0.072 -0.046 a0.9 0.9 0 0 0 0.2 -0.163 0.654 0.654 0 0 0 0.075 -0.163 0.267 0.267 0 0 1 0.01 0.169 l-0.019 0.09 0.077 -0.059 a0.764 0.764 0 0 0 0.21 -0.208 0.745 0.745 0 0 0 0.047 -0.163 c0.2 0 0.323 -0.1 0.331 -0.2 0.006 -0.083 -0.079 -0.185 -0.247 -0.214 a0.693 0.693 0 0 1 -0.07 -0.124 0.155 0.155 0 0 1 0 -0.108 0.521 0.521 0 0 1 0.168 -0.206 l0.019 -0.014 a0.239 0.239 0 0 0 0.128 0.135 0.19 0.19 0 0 0 0.068 0.011 0.254 0.254 0 0 0 0.105 -0.031 1.379 1.379 0 0 0 0.848 0.482 h0.016 a3.157 3.157 0 0 0 0.772 -0.018 6.75 6.75 0 0 0 0.523 -0.135 2.9 2.9 0 0 0 0.2 0.224 4.177 4.177 0 0 0 0.424 0.317 0.464 0.464 0 0 1 -0.142 0.116 0.581 0.581 0 0 1 -0.1 0.028 0.356 0.356 0 0 0 -0.187 0.078 0.218 0.218 0 0 0 -0.026 0.246 0.291 0.291 0 0 0 0.221 0.1 l0.152 -0.03 a0.413 0.413 0 0 0 0.087 0.162 0.272 0.272 0 0 0 0.18 0.076 h0.006 a0.245 0.245 0 0 0 0.184 -0.068 0.416 0.416 0 0 0 0.076 -0.093 0.312 0.312 0 0 0 0.4 -0.046 0.158 0.158 0 0 0 0.025 -0.18 0.294 0.294 0 0 0 -0.065 -0.084 0.253 0.253 0 0 1 -0.067 -0.092 l-0.032 -0.224 a0.2 0.2 0 0 1 0.044 0.006 0.819 0.819 0 0 1 0.116 0.066z M4.14 13 l-0.018 -0.019 L4.1 13 a1.194 1.194 0 0 1 -0.287 0.1 0.614 0.614 0 0 1 -0.184 -0.032 0.469 0.469 0 0 0 0.163 -0.149 l0.057 -0.08 -0.1 0.022 a1.155 1.155 0 0 1 -0.292 0.033 0.955 0.955 0 0 1 -0.2 -0.048 0.3 0.3 0 0 0 0.155 -0.15 l0.031 -0.072 -0.076 0.022 a0.966 0.966 0 0 1 -0.257 0.046 0.612 0.612 0 0 1 -0.161 -0.044 0.329 0.329 0 0 0 0.165 -0.164 l0.031 -0.075 -0.077 0.025 a0.868 0.868 0 0 1 -0.253 0.05 1.051 1.051 0 0 1 -0.226 -0.063 0.459 0.459 0 0 0 0.189 -0.133 l0.019 -0.025 -0.114 -0.122 a0.265 0.265 0 0 0 -0.276 -0.06 0.41 0.41 0 0 1 -0.1 0.011 0.246 0.246 0 0 1 -0.183 -0.131 0.186 0.186 0 0 1 0 -0.158 0.228 0.228 0 0 1 0.176 -0.095 l0.1 -0.018 -0.064 -0.054 a0.192 0.192 0 0 1 -0.082 -0.149 0.245 0.245 0 0 1 0.1 -0.178 c0.09 -0.071 0.175 -0.087 0.3 0.062 l0.031 0.038 0.029 -0.04 a0.565 0.565 0 0 1 0.124 -0.135 0.145 0.145 0 0 1 0.181 0.015 0.162 0.162 0 0 1 0.029 0.1 0.324 0.324 0 0 1 -0.026 0.071 0.352 0.352 0 0 0 -0.041 0.165 0.566 0.566 0 0 0 0.163 0.281 l0.013 0.009 c0.006 0 0.555 0.22 0.815 0.349 0.134 0.067 0.383 0.22 0.4 0.229 l0.007 0.623 c-0.025 0 -0.063 0.012 -0.109 0.022 A0.991 0.991 0 0 1 4.14 13z M9.583 12.617 a0.6 0.6 0 0 0 -0.191 0.238 0.235 0.235 0 0 0 0 0.159 0.9 0.9 0 0 0 0.088 0.154 l0.009 0.012 h0.016 c0.135 0.019 0.2 0.092 0.2 0.137 s-0.105 0.137 -0.285 0.128 h-0.031 v0.033 a0.8 0.8 0 0 1 -0.046 0.174 0.474 0.474 0 0 1 -0.118 0.127 0.257 0.257 0 0 0 -0.082 -0.2 l-0.045 -0.04 -0.016 0.058 a0.875 0.875 0 0 1 -0.085 0.21 0.635 0.635 0 0 1 -0.115 0.1 0.3 0.3 0 0 0 -0.122 -0.2 l-0.06 -0.036 -0.007 0.071 a0.621 0.621 0 0 1 -0.05 0.2 0.516 0.516 0 0 1 -0.106 0.1 0.2 0.2 0 0 0 -0.109 -0.181 l-0.023 -0.013 -0.234 0.219 a0.258 0.258 0 0 0 -0.061 0.146 0.226 0.226 0 0 1 -0.02 0.072 c-0.033 0.048 -0.047 0.056 -0.119 0.065 a0.241 0.241 0 0 1 -0.21 -0.109 0.212 0.212 0 0 1 -0.022 -0.107 v-0.044 l-0.039 0.01 a0.76 0.76 0 0 1 -0.154 0.017 0.144 0.144 0 0 1 -0.114 -0.061 l-0.013 -0.014 a0.136 0.136 0 0 1 -0.054 -0.109 0.444 0.444 0 0 1 0.093 -0.155 l0.028 -0.032 -0.2 -0.125 a0.209 0.209 0 0 1 -0.04 -0.122 0.2 0.2 0 0 1 0.17 -0.1 0.3 0.3 0 0 1 0.139 0.06 l0.037 0.022 -0.026 0.01 0.142 0.037 a0.623 0.623 0 0 0 0.252 0.03 h0.013 s0.295 -0.171 0.466 -0.25 c0.029 -0.012 0.068 -0.025 0.11 -0.039 a0.552 0.552 0 0 0 0.257 -0.131 0.132 0.132 0 0 0 -0.008 -0.16 0.2 0.2 0 0 0 -0.091 -0.064 0.191 0.191 0 0 1 -0.066 -0.041 c-0.022 -0.029 -0.032 -0.063 -0.022 -0.077 a0.261 0.261 0 0 1 0.057 -0.051 0.164 0.164 0 0 0 0.068 -0.077 c0.028 -0.1 -0.027 -0.146 -0.146 -0.215 0.142 -0.045 0.269 -0.082 0.361 -0.1 0.021 -0.005 0.031 0 0.05 -0.008 a0.455 0.455 0 0 0 -0.089 0.184 l-0.021 0.068 0.068 -0.022 a1.454 1.454 0 0 1 0.4 -0.083 0.742 0.742 0 0 1 0.223 0.029 c0.005 0.016 0.019 0.054 0.034 0.09 a0.368 0.368 0 0 0 -0.041 0.01z M13.403 13.559 h-0.041 l0.044 0.307 a0.278 0.278 0 0 0 0.087 0.132 0.3 0.3 0 0 1 0.049 0.06 c0.019 0.05 0.018 0.061 -0.016 0.11 a0.243 0.243 0 0 1 -0.221 0.063 0.313 0.313 0 0 1 -0.11 -0.057 l-0.034 -0.026 -0.021 0.037 a0.519 0.519 0 0 1 -0.078 0.107 0.17 0.17 0 0 1 -0.144 0.051 0.2 0.2 0 0 1 -0.13 -0.056 0.439 0.439 0 0 1 -0.075 -0.16 L12.7 14.1 l-0.22 0.044 a0.276 0.276 0 0 1 -0.137 -0.056 0.147 0.147 0 0 1 0.012 -0.167 0.341 0.341 0 0 1 0.149 -0.056 0.663 0.663 0 0 0 0.11 -0.031 0.619 0.619 0 0 0 0.2 -0.171 l0.025 -0.032 -0.034 -0.021 a4.557 4.557 0 0 1 -0.449 -0.333 2.842 2.842 0 0 1 -0.2 -0.235 l-0.016 -0.02 -0.024 0.007 s-0.394 0.116 -0.539 0.14 a3.143 3.143 0 0 1 -0.757 0.018 h-0.013 a1.34 1.34 0 0 1 -0.81 -0.467 c-0.06 -0.055 -0.122 -0.1 -0.184 -0.158 l-0.056 -0.048 a1.265 1.265 0 0 0 -0.4 -0.242 0.592 0.592 0 0 0 -0.243 -0.03 l-0.014 -0.008 -0.009 0.01 a1.169 1.169 0 0 0 -0.151 0.022 c-0.322 0.073 -1 0.315 -1.657 0.549 -0.553 0.2 -1.075 0.384 -1.342 0.454 a5.474 5.474 0 0 1 -0.739 0.093 h-0.021 l-0.01 0.019 a0.615 0.615 0 0 1 -0.142 0.194 0.794 0.794 0 0 1 -0.28 0.054 h-0.027 l-0.007 0.027 a0.881 0.881 0 0 1 -0.1 0.251 0.565 0.565 0 0 1 -0.159 0.111 0.367 0.367 0 0 0 -0.021 -0.209 l-0.035 -0.073 -0.039 0.071 a1.022 1.022 0 0 1 -0.163 0.219 1.033 1.033 0 0 1 -0.18 0.108 0.243 0.243 0 0 0 -0.028 -0.2 l-0.036 -0.056 -0.029 0.06 a0.8 0.8 0 0 1 -0.128 0.2 0.7 0.7 0 0 1 -0.154 0.087 0.268 0.268 0 0 0 -0.031 -0.225 l-0.038 -0.057 -0.027 0.063 a0.713 0.713 0 0 1 -0.122 0.2 1.038 1.038 0 0 1 -0.213 0.121 0.353 0.353 0 0 0 0.009 -0.216 l-0.008 -0.026 h-0.174 a0.256 0.256 0 0 0 -0.233 0.153 0.332 0.332 0 0 1 -0.055 0.073 0.3 0.3 0 0 1 -0.24 0.045 0.162 0.162 0 0 1 -0.11 -0.1 0.215 0.215 0 0 1 0.047 -0.19 l0.048 -0.069 -0.083 0.011 a0.313 0.313 0 0 1 -0.248 -0.06 0.189 0.189 0 0 1 -0.07 -0.139 0.173 0.173 0 0 1 0.04 -0.135 0.282 0.282 0 0 1 0.2 -0.049 h0.052 l-0.015 -0.05 a0.4 0.4 0 0 1 -0.022 -0.142 0.132 0.132 0 0 1 0.134 -0.11 0.231 0.231 0 0 1 0.117 0.046 0.353 0.353 0 0 1 0.044 0.061 0.364 0.364 0 0 0 0.115 0.128 0.728 0.728 0 0 0 0.345 0.058 h0.017 a6.091 6.091 0 0 1 0.716 -0.339 c0.149 -0.052 0.581 -0.137 0.585 -0.137 l0.031 -0.006 -0.009 -0.694 0.076 -0.022 a0.55 0.55 0 0 1 0.053 -0.1 l-0.129 0.038 v-0.266 l0.121 0.006 a1.4 1.4 0 0 0 0.189 0 h0.028 a11.12 11.12 0 0 1 1.166 0.089 l0.6 -0.054 c0.022 0 2.2 -0.2 2.674 -0.255 a5.017 5.017 0 0 1 0.716 -0.045 4.711 4.711 0 0 1 0.522 0.051 4.909 4.909 0 0 0 0.495 0.049 c0.08 0 0.153 0.006 0.222 0.009 a4.034 4.034 0 0 0 0.55 0 l0.175 -0.012 c0.427 -0.025 1.012 -0.06 1.216 -0.393 a0.263 0.263 0 0 0 -0.077 -0.34 0.409 0.409 0 0 0 -0.395 -0.1 c-0.083 0.019 -0.212 0.083 -0.224 0.18 a0.175 0.175 0 0 0 0.048 0.144 0.462 0.462 0 0 0 0.048 0.05 0.339 0.339 0 0 1 -0.153 -0.035 0.49 0.49 0 0 1 -0.124 -0.216 l-0.02 -0.07 -0.045 0.058 a0.268 0.268 0 0 0 -0.066 0.2 v0.019 a0.275 0.275 0 0 0 0.034 0.117 0.361 0.361 0 0 1 -0.172 -0.076 0.712 0.712 0 0 1 -0.106 -0.23 l-0.017 -0.058 -0.045 0.041 a0.316 0.316 0 0 0 -0.1 0.208 0.28 0.28 0 0 0 0.033 0.133 v0.011 a0.429 0.429 0 0 1 -0.173 -0.1 0.654 0.654 0 0 1 -0.085 -0.233 l-0.007 -0.038 -0.039 0.009 -0.253 0.065 c-0.331 0.085 -0.832 0.214 -1.159 0.285 h-0.023 c-0.306 0.066 -0.767 0.166 -1.093 0.211 a2.8 2.8 0 0 1 -1.337 -0.07 c-0.185 -0.065 -0.255 -0.127 -0.3 -0.265 a0.326 0.326 0 0 1 0.089 -0.284 1.139 1.139 0 0 1 0.572 -0.3 9.122 9.122 0 0 1 1.029 -0.213 3.56 3.56 0 0 1 0.947 0.009 c0.057 0.007 0.111 0.014 0.166 0.019 a0.61 0.61 0 0 0 0.427 -0.09 l0.013 -0.013 a0.157 0.157 0 0 0 0.054 -0.162 0.256 0.256 0 0 1 0.1 0.093 0.263 0.263 0 0 1 -0.006 0.151 l-0.024 0.06 0.063 -0.008 a1.127 1.127 0 0 0 0.512 -0.176 l0.077 -0.077 a0.575 0.575 0 0 1 -0.391 0.4 1.634 1.634 0 0 1 -0.718 0.1 3.435 3.435 0 0 1 -0.439 -0.079 l-0.13 -0.032 0.095 0.095 a0.188 0.188 0 0 1 0.075 0.154 c-0.008 0.042 -0.049 0.083 -0.118 0.121 0 -0.06 -0.009 -0.134 -0.066 -0.153 a0.55 0.55 0 0 0 -0.438 0.1 0.784 0.784 0 0 1 -0.338 0.082 1.15 1.15 0 0 1 -0.417 -0.046 1.068 1.068 0 0 1 -0.13 -0.06 0.436 0.436 0 0 0 -0.228 -0.079 l-0.063 0.012 a0.593 0.593 0 0 0 -0.391 0.172 0.171 0.171 0 0 0 0 0.188 0.506 0.506 0 0 0 0.341 0.178 2.7 2.7 0 0 0 1 0 c0.208 -0.034 0.438 -0.085 0.661 -0.135 0.158 -0.035 0.322 -0.071 0.471 -0.1 0.212 -0.04 0.583 -0.144 0.91 -0.236 0.225 -0.063 0.419 -0.117 0.527 -0.141 a4.124 4.124 0 0 1 1.036 -0.128 h0.019 a0.865 0.865 0 0 1 0.636 0.2 0.5 0.5 0 0 1 0.133 0.372 c-0.01 0.309 -0.367 0.461 -0.677 0.559 a4.775 4.775 0 0 1 -1.469 0.107 c-0.125 0 -0.242 -0.006 -0.346 -0.006 h-0.121 l0.1 0.067 0.242 0.173 a0.468 0.468 0 0 1 0.087 0.094 0.338 0.338 0 0 0 0.168 0.142 0.76 0.76 0 0 0 0.358 -0.029 1.26 1.26 0 0 1 0.183 -0.035 c0.214 -0.016 0.582 0 0.585 0 h0.016 l0.021 -0.02 a0.3 0.3 0 0 1 0.125 -0.089 0.279 0.279 0 0 1 0.121 0 c0.06 0.019 0.083 0.083 0.064 0.181 v0.017 l0.011 0.014 a0.263 0.263 0 0 0 0.142 0.081 0.793 0.793 0 0 0 0.127 0.006 0.285 0.285 0 0 1 0.076 0 0.7 0.7 0 0 1 0.1 0.036 0.6 0.6 0 0 0 -0.09 0.039 0.4 0.4 0 0 0 -0.091 0.094 l-0.041 0.059 h0.072 a0.936 0.936 0 0 1 0.223 0.022 0.283 0.283 0 0 1 0.071 0.042 0.211 0.211 0 0 0 -0.078 0.025 0.691 0.691 0 0 0 -0.1 0.085 l-0.074 0.073 0.1 -0.01 a0.476 0.476 0 0 1 0.236 0.025 0.655 0.655 0 0 1 0.069 0.061 0.46 0.46 0 0 0 -0.082 0.012 0.489 0.489 0 0 0 -0.1 0.048 l-0.06 0.038 0.065 0.028 a0.619 0.619 0 0 1 0.183 0.121 0.231 0.231 0 0 1 0.04 0.088 c-0.022 -0.011 -0.045 -0.023 -0.064 -0.03 a0.339 0.339 0 0 0 -0.117 0.016z M11.837 11.629 a0.467 0.467 0 0 0 -0.033 -0.089 0.208 0.208 0 0 1 -0.026 -0.1 0.221 0.221 0 0 1 0.032 -0.105 0.57 0.57 0 0 0 0.1 0.2 0.536 0.536 0 0 0 0.3 0.108 h0.086 l-0.056 -0.065 a0.213 0.213 0 0 1 -0.069 -0.147 v-0.021 a0.167 0.167 0 0 1 0.013 -0.085 0.425 0.425 0 0 0 0.126 0.182 0.629 0.629 0 0 0 0.312 0.048 l0.133 -0.009 -0.119 -0.062 a0.422 0.422 0 0 1 -0.122 -0.1 0.1 0.1 0 0 1 -0.031 -0.088 c0.005 -0.047 0.093 -0.1 0.167 -0.117 a0.344 0.344 0 0 1 0.333 0.083 0.187 0.187 0 0 1 0.058 0.242 c-0.183 0.3 -0.746 0.333 -1.156 0.358 -0.063 0 -0.123 0.007 -0.177 0.012 a4.051 4.051 0 0 1 -0.54 0 l-0.224 -0.01 a4.225 4.225 0 0 1 -0.487 -0.048 4.812 4.812 0 0 0 -0.53 -0.051 h-0.085 a5 5 0 0 0 -0.536 0.034 c0.249 -0.047 0.51 -0.1 0.707 -0.146 h0.023 c0.329 -0.071 0.83 -0.2 1.162 -0.286 l0.215 -0.055 a0.64 0.64 0 0 0 0.093 0.229 0.637 0.637 0 0 0 0.281 0.144 l0.06 0.015z
    path(
        fill = SolidColor(Color(0xFF806600)),
    ) {
        // M 13.614 13.709
        moveTo(x = 13.614f, y = 13.709f)
        // l 0.066 0.042
        lineToRelative(dx = 0.066f, dy = 0.042f)
        // l -0.009 -0.078
        lineToRelative(dx = -0.009f, dy = -0.078f)
        // a 0.441 0.441 0 0 0 -0.072 -0.206
        arcToRelative(
            a = 0.441f,
            b = 0.441f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.072f,
            dy1 = -0.206f,
        )
        // a 0.528 0.528 0 0 0 -0.144 -0.108
        arcToRelative(
            a = 0.528f,
            b = 0.528f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.144f,
            dy1 = -0.108f,
        )
        // l 0.017 -0.007
        lineToRelative(dx = 0.017f, dy = -0.007f)
        // a 0.771 0.771 0 0 1 0.145 -0.013
        arcToRelative(
            a = 0.771f,
            b = 0.771f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.145f,
            dy1 = -0.013f,
        )
        // h 0.083
        horizontalLineToRelative(dx = 0.083f)
        // l -0.053 -0.062
        lineToRelative(dx = -0.053f, dy = -0.062f)
        // a 1.043 1.043 0 0 0 -0.136 -0.13
        arcToRelative(
            a = 1.043f,
            b = 1.043f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.136f,
            dy1 = -0.13f,
        )
        // a 0.342 0.342 0 0 0 -0.181 -0.042
        arcToRelative(
            a = 0.342f,
            b = 0.342f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.181f,
            dy1 = -0.042f,
        )
        // l 0.011 -0.007
        lineToRelative(dx = 0.011f, dy = -0.007f)
        // a 0.309 0.309 0 0 1 0.127 -0.019
        arcToRelative(
            a = 0.309f,
            b = 0.309f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.127f,
            dy1 = -0.019f,
        )
        // h 0.085
        horizontalLineToRelative(dx = 0.085f)
        // l -0.056 -0.065
        lineToRelative(dx = -0.056f, dy = -0.065f)
        // a 0.487 0.487 0 0 0 -0.161 -0.12
        arcToRelative(
            a = 0.487f,
            b = 0.487f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.161f,
            dy1 = -0.12f,
        )
        // a 0.675 0.675 0 0 0 -0.17 -0.025
        arcToRelative(
            a = 0.675f,
            b = 0.675f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.17f,
            dy1 = -0.025f,
        )
        // a 0.075 0.075 0 0 1 0.018 -0.015
        arcToRelative(
            a = 0.075f,
            b = 0.075f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.018f,
            dy1 = -0.015f,
        )
        // a 1.2 1.2 0 0 1 0.163 -0.063
        arcToRelative(
            a = 1.2f,
            b = 1.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.163f,
            dy1 = -0.063f,
        )
        // l 0.087 -0.026
        lineToRelative(dx = 0.087f, dy = -0.026f)
        // l -0.081 -0.042
        lineToRelative(dx = -0.081f, dy = -0.042f)
        // a 1.266 1.266 0 0 0 -0.2 -0.082
        arcToRelative(
            a = 1.266f,
            b = 1.266f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.2f,
            dy1 = -0.082f,
        )
        // a 0.4 0.4 0 0 0 -0.1 -0.005
        arcToRelative(
            a = 0.4f,
            b = 0.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.1f,
            dy1 = -0.005f,
        )
        // a 0.621 0.621 0 0 1 -0.114 0
        arcToRelative(
            a = 0.621f,
            b = 0.621f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.114f,
            dy1 = 0.0f,
        )
        // a 0.178 0.178 0 0 1 -0.085 -0.045
        arcToRelative(
            a = 0.178f,
            b = 0.178f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.085f,
            dy1 = -0.045f,
        )
        // c 0.027 -0.185 -0.083 -0.235 -0.118 -0.246
        curveToRelative(
            dx1 = 0.027f,
            dy1 = -0.185f,
            dx2 = -0.083f,
            dy2 = -0.235f,
            dx3 = -0.118f,
            dy3 = -0.246f,
        )
        // a 0.354 0.354 0 0 0 -0.165 0
        arcToRelative(
            a = 0.354f,
            b = 0.354f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.165f,
            dy1 = 0.0f,
        )
        // a 0.373 0.373 0 0 0 -0.154 0.105
        arcToRelative(
            a = 0.373f,
            b = 0.373f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.154f,
            dy1 = 0.105f,
        )
        // c -0.074 0 -0.383 -0.012 -0.577 0
        curveToRelative(
            dx1 = -0.074f,
            dy1 = 0.0f,
            dx2 = -0.383f,
            dy2 = -0.012f,
            dx3 = -0.577f,
            dy3 = 0.0f,
        )
        // a 1.336 1.336 0 0 0 -0.2 0.036
        arcToRelative(
            a = 1.336f,
            b = 1.336f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.2f,
            dy1 = 0.036f,
        )
        // a 0.723 0.723 0 0 1 -0.32 0.031
        arcToRelative(
            a = 0.723f,
            b = 0.723f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.32f,
            dy1 = 0.031f,
        )
        // a 0.285 0.285 0 0 1 -0.13 -0.116
        arcToRelative(
            a = 0.285f,
            b = 0.285f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.13f,
            dy1 = -0.116f,
        )
        // a 0.533 0.533 0 0 0 -0.1 -0.11
        arcToRelative(
            a = 0.533f,
            b = 0.533f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.1f,
            dy1 = -0.11f,
        )
        // l -0.146 -0.1
        lineToRelative(dx = -0.146f, dy = -0.1f)
        // l 0.23 0.006
        lineToRelative(dx = 0.23f, dy = 0.006f)
        // a 4.854 4.854 0 0 0 1.493 -0.111
        arcToRelative(
            a = 4.854f,
            b = 4.854f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.493f,
            dy1 = -0.111f,
        )
        // c 0.334 -0.105 0.718 -0.271 0.73 -0.627
        curveToRelative(
            dx1 = 0.334f,
            dy1 = -0.105f,
            dx2 = 0.718f,
            dy2 = -0.271f,
            dx3 = 0.73f,
            dy3 = -0.627f,
        )
        // a 0.572 0.572 0 0 0 -0.154 -0.427
        arcToRelative(
            a = 0.572f,
            b = 0.572f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.154f,
            dy1 = -0.427f,
        )
        // a 0.939 0.939 0 0 0 -0.709 -0.221
        arcToRelative(
            a = 0.939f,
            b = 0.939f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.709f,
            dy1 = -0.221f,
        )
        // a 4.149 4.149 0 0 0 -1.052 0.129
        arcToRelative(
            a = 4.149f,
            b = 4.149f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.052f,
            dy1 = 0.129f,
        )
        // c -0.11 0.025 -0.305 0.079 -0.531 0.142
        curveToRelative(
            dx1 = -0.11f,
            dy1 = 0.025f,
            dx2 = -0.305f,
            dy2 = 0.079f,
            dx3 = -0.531f,
            dy3 = 0.142f,
        )
        // c -0.326 0.092 -0.7 0.2 -0.9 0.235
        curveToRelative(
            dx1 = -0.326f,
            dy1 = 0.092f,
            dx2 = -0.7f,
            dy2 = 0.2f,
            dx3 = -0.9f,
            dy3 = 0.235f,
        )
        // c -0.15 0.029 -0.315 0.065 -0.473 0.1
        curveToRelative(
            dx1 = -0.15f,
            dy1 = 0.029f,
            dx2 = -0.315f,
            dy2 = 0.065f,
            dx3 = -0.473f,
            dy3 = 0.1f,
        )
        // c -0.222 0.049 -0.451 0.1 -0.657 0.134
        curveToRelative(
            dx1 = -0.222f,
            dy1 = 0.049f,
            dx2 = -0.451f,
            dy2 = 0.1f,
            dx3 = -0.657f,
            dy3 = 0.134f,
        )
        // a 2.646 2.646 0 0 1 -0.977 0
        arcToRelative(
            a = 2.646f,
            b = 2.646f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.977f,
            dy1 = 0.0f,
        )
        // a 0.457 0.457 0 0 1 -0.293 -0.147
        arcToRelative(
            a = 0.457f,
            b = 0.457f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.293f,
            dy1 = -0.147f,
        )
        // a 0.1 0.1 0 0 1 0 -0.1
        arcToRelative(
            a = 0.1f,
            b = 0.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -0.1f,
        )
        // a 0.546 0.546 0 0 1 0.349 -0.146
        arcToRelative(
            a = 0.546f,
            b = 0.546f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.349f,
            dy1 = -0.146f,
        )
        // l 0.064 -0.012
        lineToRelative(dx = 0.064f, dy = -0.012f)
        // a 0.472 0.472 0 0 1 0.179 0.071
        arcToRelative(
            a = 0.472f,
            b = 0.472f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.179f,
            dy1 = 0.071f,
        )
        // a 0.993 0.993 0 0 0 0.142 0.065
        arcToRelative(
            a = 0.993f,
            b = 0.993f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.142f,
            dy1 = 0.065f,
        )
        // a 1.209 1.209 0 0 0 0.44 0.05
        arcToRelative(
            a = 1.209f,
            b = 1.209f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.44f,
            dy1 = 0.05f,
        )
        // a 0.879 0.879 0 0 0 0.375 -0.092
        arcToRelative(
            a = 0.879f,
            b = 0.879f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.375f,
            dy1 = -0.092f,
        )
        // a 0.493 0.493 0 0 1 0.378 -0.1
        arcToRelative(
            a = 0.493f,
            b = 0.493f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.378f,
            dy1 = -0.1f,
        )
        // a 0.206 0.206 0 0 1 0.01 0.139
        arcToRelative(
            a = 0.206f,
            b = 0.206f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.01f,
            dy1 = 0.139f,
        )
        // l -0.01 0.066
        lineToRelative(dx = -0.01f, dy = 0.066f)
        // l 0.062 -0.026
        lineToRelative(dx = 0.062f, dy = -0.026f)
        // c 0.13 -0.055 0.2 -0.123 0.219 -0.2
        curveToRelative(
            dx1 = 0.13f,
            dy1 = -0.055f,
            dx2 = 0.2f,
            dy2 = -0.123f,
            dx3 = 0.219f,
            dy3 = -0.2f,
        )
        // a 0.2 0.2 0 0 0 -0.027 -0.135
        arcToRelative(
            a = 0.2f,
            b = 0.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.027f,
            dy1 = -0.135f,
        )
        // a 2.488 2.488 0 0 0 0.349 0.057
        arcToRelative(
            a = 2.488f,
            b = 2.488f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.349f,
            dy1 = 0.057f,
        )
        // a 1.708 1.708 0 0 0 0.751 -0.11
        arcToRelative(
            a = 1.708f,
            b = 1.708f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.751f,
            dy1 = -0.11f,
        )
        // a 0.637 0.637 0 0 0 0.453 -0.574
        arcToRelative(
            a = 0.637f,
            b = 0.637f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.453f,
            dy1 = -0.574f,
        )
        // l 0.008 -0.1
        lineToRelative(dx = 0.008f, dy = -0.1f)
        // l -0.229 0.228
        lineToRelative(dx = -0.229f, dy = 0.228f)
        // a 0.989 0.989 0 0 1 -0.415 0.146
        arcToRelative(
            a = 0.989f,
            b = 0.989f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.415f,
            dy1 = 0.146f,
        )
        // a 0.24 0.24 0 0 0 -0.014 -0.161
        arcToRelative(
            a = 0.24f,
            b = 0.24f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.014f,
            dy1 = -0.161f,
        )
        // a 0.3 0.3 0 0 0 -0.242 -0.151
        arcToRelative(
            a = 0.3f,
            b = 0.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.242f,
            dy1 = -0.151f,
        )
        // L 10.4 10.319
        lineTo(x = 10.4f, y = 10.319f)
        // l 0.056 0.062
        lineToRelative(dx = 0.056f, dy = 0.062f)
        // c 0.068 0.075 0.043 0.1 0 0.147
        curveToRelative(
            dx1 = 0.068f,
            dy1 = 0.075f,
            dx2 = 0.043f,
            dy2 = 0.1f,
            dx3 = 0.0f,
            dy3 = 0.147f,
        )
        // l -0.014 0.015
        lineToRelative(dx = -0.014f, dy = 0.015f)
        // a 0.558 0.558 0 0 1 -0.365 0.065
        arcToRelative(
            a = 0.558f,
            b = 0.558f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.365f,
            dy1 = 0.065f,
        )
        // c -0.053 0 -0.106 -0.012 -0.163 -0.019
        curveToRelative(
            dx1 = -0.053f,
            dy1 = 0.0f,
            dx2 = -0.106f,
            dy2 = -0.012f,
            dx3 = -0.163f,
            dy3 = -0.019f,
        )
        // a 3.642 3.642 0 0 0 -0.964 -0.009
        arcToRelative(
            a = 3.642f,
            b = 3.642f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.964f,
            dy1 = -0.009f,
        )
        // a 9.327 9.327 0 0 0 -1.04 0.215
        arcToRelative(
            a = 9.327f,
            b = 9.327f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.04f,
            dy1 = 0.215f,
        )
        // a 1.2 1.2 0 0 0 -0.609 0.323
        arcToRelative(
            a = 1.2f,
            b = 1.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.609f,
            dy1 = 0.323f,
        )
        // a 0.4 0.4 0 0 0 -0.1 0.357
        arcToRelative(
            a = 0.4f,
            b = 0.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.1f,
            dy1 = 0.357f,
        )
        // a 0.465 0.465 0 0 0 0.346 0.313
        arcToRelative(
            a = 0.465f,
            b = 0.465f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.346f,
            dy1 = 0.313f,
        )
        // a 2.231 2.231 0 0 0 0.686 0.118
        arcToRelative(
            a = 2.231f,
            b = 2.231f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.686f,
            dy1 = 0.118f,
        )
        // c -0.772 0.073 -1.686 0.156 -1.7 0.157
        curveToRelative(
            dx1 = -0.772f,
            dy1 = 0.073f,
            dx2 = -1.686f,
            dy2 = 0.156f,
            dx3 = -1.7f,
            dy3 = 0.157f,
        )
        // l -0.59 0.054
        lineToRelative(dx = -0.59f, dy = 0.054f)
        // a 10.2 10.2 0 0 0 -1.171 -0.089
        arcToRelative(
            a = 10.2f,
            b = 10.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.171f,
            dy1 = -0.089f,
        )
        // h -0.028
        horizontalLineToRelative(dx = -0.028f)
        // a 1.139 1.139 0 0 1 -0.181 0
        arcToRelative(
            a = 1.139f,
            b = 1.139f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.181f,
            dy1 = 0.0f,
        )
        // l -0.163 -0.001
        lineToRelative(dx = -0.163f, dy = -0.001f)
        // h -0.037
        horizontalLineToRelative(dx = -0.037f)
        // v 0.344
        verticalLineToRelative(dy = 0.344f)
        // a 6.226 6.226 0 0 0 -0.364 -0.207
        arcToRelative(
            a = 6.226f,
            b = 6.226f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.364f,
            dy1 = -0.207f,
        )
        // c -0.246 -0.123 -0.746 -0.323 -0.813 -0.35
        curveToRelative(
            dx1 = -0.246f,
            dy1 = -0.123f,
            dx2 = -0.746f,
            dy2 = -0.323f,
            dx3 = -0.813f,
            dy3 = -0.35f,
        )
        // a 0.483 0.483 0 0 1 -0.136 -0.226
        arcToRelative(
            a = 0.483f,
            b = 0.483f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.136f,
            dy1 = -0.226f,
        )
        // a 0.274 0.274 0 0 1 0.034 -0.131
        arcToRelative(
            a = 0.274f,
            b = 0.274f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.034f,
            dy1 = -0.131f,
        )
        // a 0.386 0.386 0 0 0 0.032 -0.088
        arcToRelative(
            a = 0.386f,
            b = 0.386f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.032f,
            dy1 = -0.088f,
        )
        // a 0.24 0.24 0 0 0 -0.044 -0.164
        arcToRelative(
            a = 0.24f,
            b = 0.24f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.044f,
            dy1 = -0.164f,
        )
        // a 0.216 0.216 0 0 0 -0.275 -0.036
        arcToRelative(
            a = 0.216f,
            b = 0.216f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.275f,
            dy1 = -0.036f,
        )
        // a 0.514 0.514 0 0 0 -0.122 0.12
        arcToRelative(
            a = 0.514f,
            b = 0.514f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.122f,
            dy1 = 0.12f,
        )
        // a 0.245 0.245 0 0 0 -0.372 -0.037
        arcToRelative(
            a = 0.245f,
            b = 0.245f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.372f,
            dy1 = -0.037f,
        )
        // a 0.318 0.318 0 0 0 -0.133 0.235
        arcToRelative(
            a = 0.318f,
            b = 0.318f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.133f,
            dy1 = 0.235f,
        )
        // a 0.241 0.241 0 0 0 0.058 0.156
        arcToRelative(
            a = 0.241f,
            b = 0.241f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.058f,
            dy1 = 0.156f,
        )
        // a 0.258 0.258 0 0 0 -0.16 0.117
        arcToRelative(
            a = 0.258f,
            b = 0.258f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.16f,
            dy1 = 0.117f,
        )
        // a 0.255 0.255 0 0 0 -0.009 0.223
        arcToRelative(
            a = 0.255f,
            b = 0.255f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.009f,
            dy1 = 0.223f,
        )
        // a 0.314 0.314 0 0 0 0.244 0.177
        arcToRelative(
            a = 0.314f,
            b = 0.314f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.244f,
            dy1 = 0.177f,
        )
        // a 0.415 0.415 0 0 0 0.121 -0.012
        arcToRelative(
            a = 0.415f,
            b = 0.415f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.121f,
            dy1 = -0.012f,
        )
        // c 0.078 -0.015 0.146 -0.028 0.208 0.038
        curveToRelative(
            dx1 = 0.078f,
            dy1 = -0.015f,
            dx2 = 0.146f,
            dy2 = -0.028f,
            dx3 = 0.208f,
            dy3 = 0.038f,
        )
        // l 0.069 0.074
        lineToRelative(dx = 0.069f, dy = 0.074f)
        // a 0.6 0.6 0 0 1 -0.223 0.119
        arcToRelative(
            a = 0.6f,
            b = 0.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.223f,
            dy1 = 0.119f,
        )
        // l -0.078 0.031
        lineToRelative(dx = -0.078f, dy = 0.031f)
        // l 0.084 0.037
        lineToRelative(dx = 0.084f, dy = 0.037f)
        // a 1.429 1.429 0 0 0 0.336 0.1
        arcToRelative(
            a = 1.429f,
            b = 1.429f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.336f,
            dy1 = 0.1f,
        )
        // a 0.623 0.623 0 0 0 0.179 -0.024
        arcToRelative(
            a = 0.623f,
            b = 0.623f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.179f,
            dy1 = -0.024f,
        )
        // a 0.474 0.474 0 0 1 -0.147 0.08
        arcToRelative(
            a = 0.474f,
            b = 0.474f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.147f,
            dy1 = 0.08f,
        )
        // l -0.083 0.031
        lineToRelative(dx = -0.083f, dy = 0.031f)
        // l 0.081 0.037
        lineToRelative(dx = 0.081f, dy = 0.037f)
        // a 0.994 0.994 0 0 0 0.267 0.085
        arcToRelative(
            a = 0.994f,
            b = 0.994f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.267f,
            dy1 = 0.085f,
        )
        // a 0.706 0.706 0 0 0 0.176 -0.022
        arcToRelative(
            a = 0.706f,
            b = 0.706f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.176f,
            dy1 = -0.022f,
        )
        // a 0.487 0.487 0 0 1 -0.081 0.046
        arcToRelative(
            a = 0.487f,
            b = 0.487f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.081f,
            dy1 = 0.046f,
        )
        // a 0.577 0.577 0 0 0 -0.055 0.029
        arcToRelative(
            a = 0.577f,
            b = 0.577f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.055f,
            dy1 = 0.029f,
        )
        // l -0.068 0.039
        lineToRelative(dx = -0.068f, dy = 0.039f)
        // l 0.073 0.028
        lineToRelative(dx = 0.073f, dy = 0.028f)
        // a 1.462 1.462 0 0 0 0.3 0.082
        arcToRelative(
            a = 1.462f,
            b = 1.462f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.3f,
            dy1 = 0.082f,
        )
        // a 1.035 1.035 0 0 0 0.207 -0.014
        arcToRelative(
            a = 1.035f,
            b = 1.035f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.207f,
            dy1 = -0.014f,
        )
        // a 0.566 0.566 0 0 1 -0.145 0.085
        arcToRelative(
            a = 0.566f,
            b = 0.566f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.145f,
            dy1 = 0.085f,
        )
        // l -0.079 0.036
        lineToRelative(dx = -0.079f, dy = 0.036f)
        // l 0.081 0.032
        lineToRelative(dx = 0.081f, dy = 0.032f)
        // a 0.854 0.854 0 0 0 0.3 0.066
        arcToRelative(
            a = 0.854f,
            b = 0.854f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.3f,
            dy1 = 0.066f,
        )
        // a 1.137 1.137 0 0 0 0.29 -0.092
        arcToRelative(
            a = 1.137f,
            b = 1.137f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.29f,
            dy1 = -0.092f,
        )
        // c 0.013 0.012 0.042 0.031 0.065 0.048
        curveToRelative(
            dx1 = 0.013f,
            dy1 = 0.012f,
            dx2 = 0.042f,
            dy2 = 0.031f,
            dx3 = 0.065f,
            dy3 = 0.048f,
        )
        // c -0.131 0.029 -0.28 0.064 -0.361 0.092
        curveToRelative(
            dx1 = -0.131f,
            dy1 = 0.029f,
            dx2 = -0.28f,
            dy2 = 0.064f,
            dx3 = -0.361f,
            dy3 = 0.092f,
        )
        // a 5.949 5.949 0 0 0 -0.72 0.34
        arcToRelative(
            a = 5.949f,
            b = 5.949f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.72f,
            dy1 = 0.34f,
        )
        // a 0.639 0.639 0 0 1 -0.292 -0.047
        arcToRelative(
            a = 0.639f,
            b = 0.639f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.292f,
            dy1 = -0.047f,
        )
        // a 0.273 0.273 0 0 1 -0.092 -0.1
        arcToRelative(
            a = 0.273f,
            b = 0.273f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.092f,
            dy1 = -0.1f,
        )
        // a 0.43 0.43 0 0 0 -0.056 -0.075
        arcToRelative(
            a = 0.43f,
            b = 0.43f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.056f,
            dy1 = -0.075f,
        )
        // a 0.3 0.3 0 0 0 -0.165 -0.068
        arcToRelative(
            a = 0.3f,
            b = 0.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.165f,
            dy1 = -0.068f,
        )
        // a 0.2 0.2 0 0 0 -0.211 0.171
        arcToRelative(
            a = 0.2f,
            b = 0.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.211f,
            dy1 = 0.171f,
        )
        // a 0.384 0.384 0 0 0 0.01 0.13
        arcToRelative(
            a = 0.384f,
            b = 0.384f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.01f,
            dy1 = 0.13f,
        )
        // a 0.3 0.3 0 0 0 -0.2 0.07
        arcToRelative(
            a = 0.3f,
            b = 0.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.2f,
            dy1 = 0.07f,
        )
        // a 0.25 0.25 0 0 0 -0.062 0.189
        arcToRelative(
            a = 0.25f,
            b = 0.25f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.062f,
            dy1 = 0.189f,
        )
        // a 0.27 0.27 0 0 0 0.1 0.2
        arcToRelative(
            a = 0.27f,
            b = 0.27f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.1f,
            dy1 = 0.2f,
        )
        // a 0.359 0.359 0 0 0 0.234 0.081
        arcToRelative(
            a = 0.359f,
            b = 0.359f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.234f,
            dy1 = 0.081f,
        )
        // a 0.243 0.243 0 0 0 -0.019 0.194
        arcToRelative(
            a = 0.243f,
            b = 0.243f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.019f,
            dy1 = 0.194f,
        )
        // a 0.235 0.235 0 0 0 0.159 0.144
        arcToRelative(
            a = 0.235f,
            b = 0.235f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.159f,
            dy1 = 0.144f,
        )
        // a 0.372 0.372 0 0 0 0.309 -0.06
        arcToRelative(
            a = 0.372f,
            b = 0.372f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.309f,
            dy1 = -0.06f,
        )
        // a 0.357 0.357 0 0 0 0.07 -0.091
        arcToRelative(
            a = 0.357f,
            b = 0.357f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.07f,
            dy1 = -0.091f,
        )
        // a 0.187 0.187 0 0 1 0.171 -0.117
        arcToRelative(
            a = 0.187f,
            b = 0.187f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.171f,
            dy1 = -0.117f,
        )
        // h 0.117
        horizontalLineToRelative(dx = 0.117f)
        // a 0.446 0.446 0 0 1 -0.044 0.222
        arcToRelative(
            a = 0.446f,
            b = 0.446f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.044f,
            dy1 = 0.222f,
        )
        // l -0.029 0.079
        lineToRelative(dx = -0.029f, dy = 0.079f)
        // l 0.078 -0.032
        lineToRelative(dx = 0.078f, dy = -0.032f)
        // a 1.454 1.454 0 0 0 0.312 -0.166
        arcToRelative(
            a = 1.454f,
            b = 1.454f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.312f,
            dy1 = -0.166f,
        )
        // a 0.571 0.571 0 0 0 0.1 -0.15
        arcToRelative(
            a = 0.571f,
            b = 0.571f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.1f,
            dy1 = -0.15f,
        )
        // a 0.323 0.323 0 0 1 -0.025 0.158
        arcToRelative(
            a = 0.323f,
            b = 0.323f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.025f,
            dy1 = 0.158f,
        )
        // l -0.028 0.077
        lineToRelative(dx = -0.028f, dy = 0.077f)
        // l 0.076 -0.029
        lineToRelative(dx = 0.076f, dy = -0.029f)
        // a 1.081 1.081 0 0 0 0.249 -0.131
        arcToRelative(
            a = 1.081f,
            b = 1.081f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.249f,
            dy1 = -0.131f,
        )
        // a 0.642 0.642 0 0 0 0.106 -0.149
        arcToRelative(
            a = 0.642f,
            b = 0.642f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.106f,
            dy1 = -0.149f,
        )
        // a 0.33 0.33 0 0 1 -0.013 0.1
        arcToRelative(
            a = 0.33f,
            b = 0.33f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.013f,
            dy1 = 0.1f,
        )
        // a 0.535 0.535 0 0 0 -0.011 0.055
        arcToRelative(
            a = 0.535f,
            b = 0.535f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.011f,
            dy1 = 0.055f,
        )
        // l -0.011 0.068
        lineToRelative(dx = -0.011f, dy = 0.068f)
        // l 0.063 -0.028
        lineToRelative(dx = 0.063f, dy = -0.028f)
        // a 1.462 1.462 0 0 0 0.266 -0.152
        arcToRelative(
            a = 1.462f,
            b = 1.462f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.266f,
            dy1 = -0.152f,
        )
        // a 0.844 0.844 0 0 0 0.132 -0.162
        arcToRelative(
            a = 0.844f,
            b = 0.844f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.132f,
            dy1 = -0.162f,
        )
        // a 0.385 0.385 0 0 1 -0.02 0.159
        arcToRelative(
            a = 0.385f,
            b = 0.385f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.02f,
            dy1 = 0.159f,
        )
        // l -0.021 0.076
        lineToRelative(dx = -0.021f, dy = 0.076f)
        // l 0.072 -0.032
        lineToRelative(dx = 0.072f, dy = -0.032f)
        // a 0.875 0.875 0 0 0 0.256 -0.165
        arcToRelative(
            a = 0.875f,
            b = 0.875f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.256f,
            dy1 = -0.165f,
        )
        // a 0.862 0.862 0 0 0 0.11 -0.254
        arcToRelative(
            a = 0.862f,
            b = 0.862f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.11f,
            dy1 = -0.254f,
        )
        // a 0.777 0.777 0 0 0 0.289 -0.064
        arcToRelative(
            a = 0.777f,
            b = 0.777f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.289f,
            dy1 = -0.064f,
        )
        // a 0.589 0.589 0 0 0 0.16 -0.205
        arcToRelative(
            a = 0.589f,
            b = 0.589f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.16f,
            dy1 = -0.205f,
        )
        // a 5.142 5.142 0 0 0 0.732 -0.094
        arcToRelative(
            a = 5.142f,
            b = 5.142f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.732f,
            dy1 = -0.094f,
        )
        // c 0.27 -0.071 0.794 -0.258 1.349 -0.456
        curveToRelative(
            dx1 = 0.27f,
            dy1 = -0.071f,
            dx2 = 0.794f,
            dy2 = -0.258f,
            dx3 = 1.349f,
            dy3 = -0.456f,
        )
        // a 50.06 50.06 0 0 1 1.2 -0.417
        arcToRelative(
            a = 50.06f,
            b = 50.06f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.2f,
            dy1 = -0.417f,
        )
        // c 0.113 0.064 0.162 0.123 0.157 0.168
        curveToRelative(
            dx1 = 0.113f,
            dy1 = 0.064f,
            dx2 = 0.162f,
            dy2 = 0.123f,
            dx3 = 0.157f,
            dy3 = 0.168f,
        )
        // a 0.17 0.17 0 0 1 -0.043 0.039
        arcToRelative(
            a = 0.17f,
            b = 0.17f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.043f,
            dy1 = 0.039f,
        )
        // a 0.435 0.435 0 0 0 -0.071 0.065
        arcToRelative(
            a = 0.435f,
            b = 0.435f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.071f,
            dy1 = 0.065f,
        )
        // a 0.145 0.145 0 0 0 0.024 0.168
        arcToRelative(
            a = 0.145f,
            b = 0.145f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.024f,
            dy1 = 0.168f,
        )
        // a 0.24 0.24 0 0 0 0.093 0.063
        arcToRelative(
            a = 0.24f,
            b = 0.24f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.093f,
            dy1 = 0.063f,
        )
        // a 0.146 0.146 0 0 1 0.059 0.037
        arcToRelative(
            a = 0.146f,
            b = 0.146f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.059f,
            dy1 = 0.037f,
        )
        // c 0.026 0.04 0.024 0.056 0.011 0.074
        curveToRelative(
            dx1 = 0.026f,
            dy1 = 0.04f,
            dx2 = 0.024f,
            dy2 = 0.056f,
            dx3 = 0.011f,
            dy3 = 0.074f,
        )
        // a 0.531 0.531 0 0 1 -0.22 0.1
        arcToRelative(
            a = 0.531f,
            b = 0.531f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.22f,
            dy1 = 0.1f,
        )
        // c -0.044 0.015 -0.086 0.028 -0.118 0.043
        curveToRelative(
            dx1 = -0.044f,
            dy1 = 0.015f,
            dx2 = -0.086f,
            dy2 = 0.028f,
            dx3 = -0.118f,
            dy3 = 0.043f,
        )
        // a 7.038 7.038 0 0 0 -0.466 0.249
        arcToRelative(
            a = 7.038f,
            b = 7.038f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.466f,
            dy1 = 0.249f,
        )
        // a 0.409 0.409 0 0 1 -0.139 -0.01
        arcToRelative(
            a = 0.409f,
            b = 0.409f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.139f,
            dy1 = -0.01f,
        )
        // l -0.107 -0.028
        lineToRelative(dx = -0.107f, dy = -0.028f)
        // a 0.447 0.447 0 0 1 -0.1 -0.052
        arcToRelative(
            a = 0.447f,
            b = 0.447f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.1f,
            dy1 = -0.052f,
        )
        // a 0.363 0.363 0 0 0 -0.176 -0.071
        arcToRelative(
            a = 0.363f,
            b = 0.363f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.176f,
            dy1 = -0.071f,
        )
        // h -0.014
        horizontalLineToRelative(dx = -0.014f)
        // a 0.278 0.278 0 0 0 -0.229 0.139
        arcToRelative(
            a = 0.278f,
            b = 0.278f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.229f,
            dy1 = 0.139f,
        )
        // a 0.13 0.13 0 0 0 -0.007 0.1
        arcToRelative(
            a = 0.13f,
            b = 0.13f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.007f,
            dy1 = 0.1f,
        )
        // a 0.234 0.234 0 0 0 0.069 0.129
        arcToRelative(
            a = 0.234f,
            b = 0.234f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.069f,
            dy1 = 0.129f,
        )
        // l 0.125 0.079
        lineToRelative(dx = 0.125f, dy = 0.079f)
        // a 0.389 0.389 0 0 0 -0.083 0.163
        arcToRelative(
            a = 0.389f,
            b = 0.389f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.083f,
            dy1 = 0.163f,
        )
        // a 0.214 0.214 0 0 0 0.075 0.169
        arcToRelative(
            a = 0.214f,
            b = 0.214f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.075f,
            dy1 = 0.169f,
        )
        // l 0.013 0.013
        lineToRelative(dx = 0.013f, dy = 0.013f)
        // a 0.211 0.211 0 0 0 0.158 0.083
        arcToRelative(
            a = 0.211f,
            b = 0.211f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.158f,
            dy1 = 0.083f,
        )
        // a 0.646 0.646 0 0 0 0.136 -0.01
        arcToRelative(
            a = 0.646f,
            b = 0.646f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.136f,
            dy1 = -0.01f,
        )
        // a 0.221 0.221 0 0 0 0.034 0.107
        arcToRelative(
            a = 0.221f,
            b = 0.221f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.034f,
            dy1 = 0.107f,
        )
        // a 0.317 0.317 0 0 0 0.249 0.14
        arcToRelative(
            a = 0.317f,
            b = 0.317f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.249f,
            dy1 = 0.14f,
        )
        // h 0.031
        horizontalLineToRelative(dx = 0.031f)
        // a 0.2 0.2 0 0 0 0.171 -0.1
        arcToRelative(
            a = 0.2f,
            b = 0.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.171f,
            dy1 = -0.1f,
        )
        // a 0.3 0.3 0 0 0 0.032 -0.1
        arcToRelative(
            a = 0.3f,
            b = 0.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.032f,
            dy1 = -0.1f,
        )
        // a 0.208 0.208 0 0 1 0.038 -0.106
        arcToRelative(
            a = 0.208f,
            b = 0.208f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.038f,
            dy1 = -0.106f,
        )
        // l 0.192 -0.18
        lineToRelative(dx = 0.192f, dy = -0.18f)
        // c 0.05 0.038 0.054 0.09 0.045 0.171
        curveToRelative(
            dx1 = 0.05f,
            dy1 = 0.038f,
            dx2 = 0.054f,
            dy2 = 0.09f,
            dx3 = 0.045f,
            dy3 = 0.171f,
        )
        // l -0.009 0.079
        lineToRelative(dx = -0.009f, dy = 0.079f)
        // l 0.066 -0.043
        lineToRelative(dx = 0.066f, dy = -0.043f)
        // a 0.8 0.8 0 0 0 0.19 -0.164
        arcToRelative(
            a = 0.8f,
            b = 0.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.19f,
            dy1 = -0.164f,
        )
        // a 0.475 0.475 0 0 0 0.051 -0.161
        arcToRelative(
            a = 0.475f,
            b = 0.475f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.051f,
            dy1 = -0.161f,
        )
        // a 0.171 0.171 0 0 1 0.042 0.155
        arcToRelative(
            a = 0.171f,
            b = 0.171f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.042f,
            dy1 = 0.155f,
        )
        // l -0.015 0.084
        lineToRelative(dx = -0.015f, dy = 0.084f)
        // l 0.072 -0.046
        lineToRelative(dx = 0.072f, dy = -0.046f)
        // a 0.9 0.9 0 0 0 0.2 -0.163
        arcToRelative(
            a = 0.9f,
            b = 0.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.2f,
            dy1 = -0.163f,
        )
        // a 0.654 0.654 0 0 0 0.075 -0.163
        arcToRelative(
            a = 0.654f,
            b = 0.654f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.075f,
            dy1 = -0.163f,
        )
        // a 0.267 0.267 0 0 1 0.01 0.169
        arcToRelative(
            a = 0.267f,
            b = 0.267f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.01f,
            dy1 = 0.169f,
        )
        // l -0.019 0.09
        lineToRelative(dx = -0.019f, dy = 0.09f)
        // l 0.077 -0.059
        lineToRelative(dx = 0.077f, dy = -0.059f)
        // a 0.764 0.764 0 0 0 0.21 -0.208
        arcToRelative(
            a = 0.764f,
            b = 0.764f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.21f,
            dy1 = -0.208f,
        )
        // a 0.745 0.745 0 0 0 0.047 -0.163
        arcToRelative(
            a = 0.745f,
            b = 0.745f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.047f,
            dy1 = -0.163f,
        )
        // c 0.2 0 0.323 -0.1 0.331 -0.2
        curveToRelative(
            dx1 = 0.2f,
            dy1 = 0.0f,
            dx2 = 0.323f,
            dy2 = -0.1f,
            dx3 = 0.331f,
            dy3 = -0.2f,
        )
        // c 0.006 -0.083 -0.079 -0.185 -0.247 -0.214
        curveToRelative(
            dx1 = 0.006f,
            dy1 = -0.083f,
            dx2 = -0.079f,
            dy2 = -0.185f,
            dx3 = -0.247f,
            dy3 = -0.214f,
        )
        // a 0.693 0.693 0 0 1 -0.07 -0.124
        arcToRelative(
            a = 0.693f,
            b = 0.693f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.07f,
            dy1 = -0.124f,
        )
        // a 0.155 0.155 0 0 1 0 -0.108
        arcToRelative(
            a = 0.155f,
            b = 0.155f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -0.108f,
        )
        // a 0.521 0.521 0 0 1 0.168 -0.206
        arcToRelative(
            a = 0.521f,
            b = 0.521f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.168f,
            dy1 = -0.206f,
        )
        // l 0.019 -0.014
        lineToRelative(dx = 0.019f, dy = -0.014f)
        // a 0.239 0.239 0 0 0 0.128 0.135
        arcToRelative(
            a = 0.239f,
            b = 0.239f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.128f,
            dy1 = 0.135f,
        )
        // a 0.19 0.19 0 0 0 0.068 0.011
        arcToRelative(
            a = 0.19f,
            b = 0.19f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.068f,
            dy1 = 0.011f,
        )
        // a 0.254 0.254 0 0 0 0.105 -0.031
        arcToRelative(
            a = 0.254f,
            b = 0.254f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.105f,
            dy1 = -0.031f,
        )
        // a 1.379 1.379 0 0 0 0.848 0.482
        arcToRelative(
            a = 1.379f,
            b = 1.379f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.848f,
            dy1 = 0.482f,
        )
        // h 0.016
        horizontalLineToRelative(dx = 0.016f)
        // a 3.157 3.157 0 0 0 0.772 -0.018
        arcToRelative(
            a = 3.157f,
            b = 3.157f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.772f,
            dy1 = -0.018f,
        )
        // a 6.75 6.75 0 0 0 0.523 -0.135
        arcToRelative(
            a = 6.75f,
            b = 6.75f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.523f,
            dy1 = -0.135f,
        )
        // a 2.9 2.9 0 0 0 0.2 0.224
        arcToRelative(
            a = 2.9f,
            b = 2.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.2f,
            dy1 = 0.224f,
        )
        // a 4.177 4.177 0 0 0 0.424 0.317
        arcToRelative(
            a = 4.177f,
            b = 4.177f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.424f,
            dy1 = 0.317f,
        )
        // a 0.464 0.464 0 0 1 -0.142 0.116
        arcToRelative(
            a = 0.464f,
            b = 0.464f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.142f,
            dy1 = 0.116f,
        )
        // a 0.581 0.581 0 0 1 -0.1 0.028
        arcToRelative(
            a = 0.581f,
            b = 0.581f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.1f,
            dy1 = 0.028f,
        )
        // a 0.356 0.356 0 0 0 -0.187 0.078
        arcToRelative(
            a = 0.356f,
            b = 0.356f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.187f,
            dy1 = 0.078f,
        )
        // a 0.218 0.218 0 0 0 -0.026 0.246
        arcToRelative(
            a = 0.218f,
            b = 0.218f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.026f,
            dy1 = 0.246f,
        )
        // a 0.291 0.291 0 0 0 0.221 0.1
        arcToRelative(
            a = 0.291f,
            b = 0.291f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.221f,
            dy1 = 0.1f,
        )
        // l 0.152 -0.03
        lineToRelative(dx = 0.152f, dy = -0.03f)
        // a 0.413 0.413 0 0 0 0.087 0.162
        arcToRelative(
            a = 0.413f,
            b = 0.413f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.087f,
            dy1 = 0.162f,
        )
        // a 0.272 0.272 0 0 0 0.18 0.076
        arcToRelative(
            a = 0.272f,
            b = 0.272f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.18f,
            dy1 = 0.076f,
        )
        // h 0.006
        horizontalLineToRelative(dx = 0.006f)
        // a 0.245 0.245 0 0 0 0.184 -0.068
        arcToRelative(
            a = 0.245f,
            b = 0.245f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.184f,
            dy1 = -0.068f,
        )
        // a 0.416 0.416 0 0 0 0.076 -0.093
        arcToRelative(
            a = 0.416f,
            b = 0.416f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.076f,
            dy1 = -0.093f,
        )
        // a 0.312 0.312 0 0 0 0.4 -0.046
        arcToRelative(
            a = 0.312f,
            b = 0.312f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.4f,
            dy1 = -0.046f,
        )
        // a 0.158 0.158 0 0 0 0.025 -0.18
        arcToRelative(
            a = 0.158f,
            b = 0.158f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.025f,
            dy1 = -0.18f,
        )
        // a 0.294 0.294 0 0 0 -0.065 -0.084
        arcToRelative(
            a = 0.294f,
            b = 0.294f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.065f,
            dy1 = -0.084f,
        )
        // a 0.253 0.253 0 0 1 -0.067 -0.092
        arcToRelative(
            a = 0.253f,
            b = 0.253f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.067f,
            dy1 = -0.092f,
        )
        // l -0.032 -0.224
        lineToRelative(dx = -0.032f, dy = -0.224f)
        // a 0.2 0.2 0 0 1 0.044 0.006
        arcToRelative(
            a = 0.2f,
            b = 0.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.044f,
            dy1 = 0.006f,
        )
        // a 0.819 0.819 0 0 1 0.116 0.066z
        arcToRelative(
            a = 0.819f,
            b = 0.819f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.116f,
            dy1 = 0.066f,
        )
        close()
        // M 4.14 13
        moveTo(x = 4.14f, y = 13.0f)
        // l -0.018 -0.019
        lineToRelative(dx = -0.018f, dy = -0.019f)
        // L 4.1 13
        lineTo(x = 4.1f, y = 13.0f)
        // a 1.194 1.194 0 0 1 -0.287 0.1
        arcToRelative(
            a = 1.194f,
            b = 1.194f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.287f,
            dy1 = 0.1f,
        )
        // a 0.614 0.614 0 0 1 -0.184 -0.032
        arcToRelative(
            a = 0.614f,
            b = 0.614f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.184f,
            dy1 = -0.032f,
        )
        // a 0.469 0.469 0 0 0 0.163 -0.149
        arcToRelative(
            a = 0.469f,
            b = 0.469f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.163f,
            dy1 = -0.149f,
        )
        // l 0.057 -0.08
        lineToRelative(dx = 0.057f, dy = -0.08f)
        // l -0.1 0.022
        lineToRelative(dx = -0.1f, dy = 0.022f)
        // a 1.155 1.155 0 0 1 -0.292 0.033
        arcToRelative(
            a = 1.155f,
            b = 1.155f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.292f,
            dy1 = 0.033f,
        )
        // a 0.955 0.955 0 0 1 -0.2 -0.048
        arcToRelative(
            a = 0.955f,
            b = 0.955f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.2f,
            dy1 = -0.048f,
        )
        // a 0.3 0.3 0 0 0 0.155 -0.15
        arcToRelative(
            a = 0.3f,
            b = 0.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.155f,
            dy1 = -0.15f,
        )
        // l 0.031 -0.072
        lineToRelative(dx = 0.031f, dy = -0.072f)
        // l -0.076 0.022
        lineToRelative(dx = -0.076f, dy = 0.022f)
        // a 0.966 0.966 0 0 1 -0.257 0.046
        arcToRelative(
            a = 0.966f,
            b = 0.966f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.257f,
            dy1 = 0.046f,
        )
        // a 0.612 0.612 0 0 1 -0.161 -0.044
        arcToRelative(
            a = 0.612f,
            b = 0.612f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.161f,
            dy1 = -0.044f,
        )
        // a 0.329 0.329 0 0 0 0.165 -0.164
        arcToRelative(
            a = 0.329f,
            b = 0.329f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.165f,
            dy1 = -0.164f,
        )
        // l 0.031 -0.075
        lineToRelative(dx = 0.031f, dy = -0.075f)
        // l -0.077 0.025
        lineToRelative(dx = -0.077f, dy = 0.025f)
        // a 0.868 0.868 0 0 1 -0.253 0.05
        arcToRelative(
            a = 0.868f,
            b = 0.868f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.253f,
            dy1 = 0.05f,
        )
        // a 1.051 1.051 0 0 1 -0.226 -0.063
        arcToRelative(
            a = 1.051f,
            b = 1.051f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.226f,
            dy1 = -0.063f,
        )
        // a 0.459 0.459 0 0 0 0.189 -0.133
        arcToRelative(
            a = 0.459f,
            b = 0.459f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.189f,
            dy1 = -0.133f,
        )
        // l 0.019 -0.025
        lineToRelative(dx = 0.019f, dy = -0.025f)
        // l -0.114 -0.122
        lineToRelative(dx = -0.114f, dy = -0.122f)
        // a 0.265 0.265 0 0 0 -0.276 -0.06
        arcToRelative(
            a = 0.265f,
            b = 0.265f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.276f,
            dy1 = -0.06f,
        )
        // a 0.41 0.41 0 0 1 -0.1 0.011
        arcToRelative(
            a = 0.41f,
            b = 0.41f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.1f,
            dy1 = 0.011f,
        )
        // a 0.246 0.246 0 0 1 -0.183 -0.131
        arcToRelative(
            a = 0.246f,
            b = 0.246f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.183f,
            dy1 = -0.131f,
        )
        // a 0.186 0.186 0 0 1 0 -0.158
        arcToRelative(
            a = 0.186f,
            b = 0.186f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -0.158f,
        )
        // a 0.228 0.228 0 0 1 0.176 -0.095
        arcToRelative(
            a = 0.228f,
            b = 0.228f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.176f,
            dy1 = -0.095f,
        )
        // l 0.1 -0.018
        lineToRelative(dx = 0.1f, dy = -0.018f)
        // l -0.064 -0.054
        lineToRelative(dx = -0.064f, dy = -0.054f)
        // a 0.192 0.192 0 0 1 -0.082 -0.149
        arcToRelative(
            a = 0.192f,
            b = 0.192f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.082f,
            dy1 = -0.149f,
        )
        // a 0.245 0.245 0 0 1 0.1 -0.178
        arcToRelative(
            a = 0.245f,
            b = 0.245f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.1f,
            dy1 = -0.178f,
        )
        // c 0.09 -0.071 0.175 -0.087 0.3 0.062
        curveToRelative(
            dx1 = 0.09f,
            dy1 = -0.071f,
            dx2 = 0.175f,
            dy2 = -0.087f,
            dx3 = 0.3f,
            dy3 = 0.062f,
        )
        // l 0.031 0.038
        lineToRelative(dx = 0.031f, dy = 0.038f)
        // l 0.029 -0.04
        lineToRelative(dx = 0.029f, dy = -0.04f)
        // a 0.565 0.565 0 0 1 0.124 -0.135
        arcToRelative(
            a = 0.565f,
            b = 0.565f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.124f,
            dy1 = -0.135f,
        )
        // a 0.145 0.145 0 0 1 0.181 0.015
        arcToRelative(
            a = 0.145f,
            b = 0.145f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.181f,
            dy1 = 0.015f,
        )
        // a 0.162 0.162 0 0 1 0.029 0.1
        arcToRelative(
            a = 0.162f,
            b = 0.162f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.029f,
            dy1 = 0.1f,
        )
        // a 0.324 0.324 0 0 1 -0.026 0.071
        arcToRelative(
            a = 0.324f,
            b = 0.324f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.026f,
            dy1 = 0.071f,
        )
        // a 0.352 0.352 0 0 0 -0.041 0.165
        arcToRelative(
            a = 0.352f,
            b = 0.352f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.041f,
            dy1 = 0.165f,
        )
        // a 0.566 0.566 0 0 0 0.163 0.281
        arcToRelative(
            a = 0.566f,
            b = 0.566f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.163f,
            dy1 = 0.281f,
        )
        // l 0.013 0.009
        lineToRelative(dx = 0.013f, dy = 0.009f)
        // c 0.006 0 0.555 0.22 0.815 0.349
        curveToRelative(
            dx1 = 0.006f,
            dy1 = 0.0f,
            dx2 = 0.555f,
            dy2 = 0.22f,
            dx3 = 0.815f,
            dy3 = 0.349f,
        )
        // c 0.134 0.067 0.383 0.22 0.4 0.229
        curveToRelative(
            dx1 = 0.134f,
            dy1 = 0.067f,
            dx2 = 0.383f,
            dy2 = 0.22f,
            dx3 = 0.4f,
            dy3 = 0.229f,
        )
        // l 0.007 0.623
        lineToRelative(dx = 0.007f, dy = 0.623f)
        // c -0.025 0 -0.063 0.012 -0.109 0.022
        curveToRelative(
            dx1 = -0.025f,
            dy1 = 0.0f,
            dx2 = -0.063f,
            dy2 = 0.012f,
            dx3 = -0.109f,
            dy3 = 0.022f,
        )
        // A 0.991 0.991 0 0 1 4.14 13z
        arcTo(
            horizontalEllipseRadius = 0.991f,
            verticalEllipseRadius = 0.991f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 4.14f,
            y1 = 13.0f,
        )
        close()
        // M 9.583 12.617
        moveTo(x = 9.583f, y = 12.617f)
        // a 0.6 0.6 0 0 0 -0.191 0.238
        arcToRelative(
            a = 0.6f,
            b = 0.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.191f,
            dy1 = 0.238f,
        )
        // a 0.235 0.235 0 0 0 0 0.159
        arcToRelative(
            a = 0.235f,
            b = 0.235f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 0.159f,
        )
        // a 0.9 0.9 0 0 0 0.088 0.154
        arcToRelative(
            a = 0.9f,
            b = 0.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.088f,
            dy1 = 0.154f,
        )
        // l 0.009 0.012
        lineToRelative(dx = 0.009f, dy = 0.012f)
        // h 0.016
        horizontalLineToRelative(dx = 0.016f)
        // c 0.135 0.019 0.2 0.092 0.2 0.137
        curveToRelative(
            dx1 = 0.135f,
            dy1 = 0.019f,
            dx2 = 0.2f,
            dy2 = 0.092f,
            dx3 = 0.2f,
            dy3 = 0.137f,
        )
        // s -0.105 0.137 -0.285 0.128
        reflectiveCurveToRelative(
            dx1 = -0.105f,
            dy1 = 0.137f,
            dx2 = -0.285f,
            dy2 = 0.128f,
        )
        // h -0.031
        horizontalLineToRelative(dx = -0.031f)
        // v 0.033
        verticalLineToRelative(dy = 0.033f)
        // a 0.8 0.8 0 0 1 -0.046 0.174
        arcToRelative(
            a = 0.8f,
            b = 0.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.046f,
            dy1 = 0.174f,
        )
        // a 0.474 0.474 0 0 1 -0.118 0.127
        arcToRelative(
            a = 0.474f,
            b = 0.474f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.118f,
            dy1 = 0.127f,
        )
        // a 0.257 0.257 0 0 0 -0.082 -0.2
        arcToRelative(
            a = 0.257f,
            b = 0.257f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.082f,
            dy1 = -0.2f,
        )
        // l -0.045 -0.04
        lineToRelative(dx = -0.045f, dy = -0.04f)
        // l -0.016 0.058
        lineToRelative(dx = -0.016f, dy = 0.058f)
        // a 0.875 0.875 0 0 1 -0.085 0.21
        arcToRelative(
            a = 0.875f,
            b = 0.875f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.085f,
            dy1 = 0.21f,
        )
        // a 0.635 0.635 0 0 1 -0.115 0.1
        arcToRelative(
            a = 0.635f,
            b = 0.635f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.115f,
            dy1 = 0.1f,
        )
        // a 0.3 0.3 0 0 0 -0.122 -0.2
        arcToRelative(
            a = 0.3f,
            b = 0.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.122f,
            dy1 = -0.2f,
        )
        // l -0.06 -0.036
        lineToRelative(dx = -0.06f, dy = -0.036f)
        // l -0.007 0.071
        lineToRelative(dx = -0.007f, dy = 0.071f)
        // a 0.621 0.621 0 0 1 -0.05 0.2
        arcToRelative(
            a = 0.621f,
            b = 0.621f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.05f,
            dy1 = 0.2f,
        )
        // a 0.516 0.516 0 0 1 -0.106 0.1
        arcToRelative(
            a = 0.516f,
            b = 0.516f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.106f,
            dy1 = 0.1f,
        )
        // a 0.2 0.2 0 0 0 -0.109 -0.181
        arcToRelative(
            a = 0.2f,
            b = 0.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.109f,
            dy1 = -0.181f,
        )
        // l -0.023 -0.013
        lineToRelative(dx = -0.023f, dy = -0.013f)
        // l -0.234 0.219
        lineToRelative(dx = -0.234f, dy = 0.219f)
        // a 0.258 0.258 0 0 0 -0.061 0.146
        arcToRelative(
            a = 0.258f,
            b = 0.258f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.061f,
            dy1 = 0.146f,
        )
        // a 0.226 0.226 0 0 1 -0.02 0.072
        arcToRelative(
            a = 0.226f,
            b = 0.226f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.02f,
            dy1 = 0.072f,
        )
        // c -0.033 0.048 -0.047 0.056 -0.119 0.065
        curveToRelative(
            dx1 = -0.033f,
            dy1 = 0.048f,
            dx2 = -0.047f,
            dy2 = 0.056f,
            dx3 = -0.119f,
            dy3 = 0.065f,
        )
        // a 0.241 0.241 0 0 1 -0.21 -0.109
        arcToRelative(
            a = 0.241f,
            b = 0.241f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.21f,
            dy1 = -0.109f,
        )
        // a 0.212 0.212 0 0 1 -0.022 -0.107
        arcToRelative(
            a = 0.212f,
            b = 0.212f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.022f,
            dy1 = -0.107f,
        )
        // v -0.044
        verticalLineToRelative(dy = -0.044f)
        // l -0.039 0.01
        lineToRelative(dx = -0.039f, dy = 0.01f)
        // a 0.76 0.76 0 0 1 -0.154 0.017
        arcToRelative(
            a = 0.76f,
            b = 0.76f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.154f,
            dy1 = 0.017f,
        )
        // a 0.144 0.144 0 0 1 -0.114 -0.061
        arcToRelative(
            a = 0.144f,
            b = 0.144f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.114f,
            dy1 = -0.061f,
        )
        // l -0.013 -0.014
        lineToRelative(dx = -0.013f, dy = -0.014f)
        // a 0.136 0.136 0 0 1 -0.054 -0.109
        arcToRelative(
            a = 0.136f,
            b = 0.136f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.054f,
            dy1 = -0.109f,
        )
        // a 0.444 0.444 0 0 1 0.093 -0.155
        arcToRelative(
            a = 0.444f,
            b = 0.444f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.093f,
            dy1 = -0.155f,
        )
        // l 0.028 -0.032
        lineToRelative(dx = 0.028f, dy = -0.032f)
        // l -0.2 -0.125
        lineToRelative(dx = -0.2f, dy = -0.125f)
        // a 0.209 0.209 0 0 1 -0.04 -0.122
        arcToRelative(
            a = 0.209f,
            b = 0.209f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.04f,
            dy1 = -0.122f,
        )
        // a 0.2 0.2 0 0 1 0.17 -0.1
        arcToRelative(
            a = 0.2f,
            b = 0.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.17f,
            dy1 = -0.1f,
        )
        // a 0.3 0.3 0 0 1 0.139 0.06
        arcToRelative(
            a = 0.3f,
            b = 0.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.139f,
            dy1 = 0.06f,
        )
        // l 0.037 0.022
        lineToRelative(dx = 0.037f, dy = 0.022f)
        // l -0.026 0.01
        lineToRelative(dx = -0.026f, dy = 0.01f)
        // l 0.142 0.037
        lineToRelative(dx = 0.142f, dy = 0.037f)
        // a 0.623 0.623 0 0 0 0.252 0.03
        arcToRelative(
            a = 0.623f,
            b = 0.623f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.252f,
            dy1 = 0.03f,
        )
        // h 0.013
        horizontalLineToRelative(dx = 0.013f)
        // s 0.295 -0.171 0.466 -0.25
        reflectiveCurveToRelative(
            dx1 = 0.295f,
            dy1 = -0.171f,
            dx2 = 0.466f,
            dy2 = -0.25f,
        )
        // c 0.029 -0.012 0.068 -0.025 0.11 -0.039
        curveToRelative(
            dx1 = 0.029f,
            dy1 = -0.012f,
            dx2 = 0.068f,
            dy2 = -0.025f,
            dx3 = 0.11f,
            dy3 = -0.039f,
        )
        // a 0.552 0.552 0 0 0 0.257 -0.131
        arcToRelative(
            a = 0.552f,
            b = 0.552f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.257f,
            dy1 = -0.131f,
        )
        // a 0.132 0.132 0 0 0 -0.008 -0.16
        arcToRelative(
            a = 0.132f,
            b = 0.132f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.008f,
            dy1 = -0.16f,
        )
        // a 0.2 0.2 0 0 0 -0.091 -0.064
        arcToRelative(
            a = 0.2f,
            b = 0.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.091f,
            dy1 = -0.064f,
        )
        // a 0.191 0.191 0 0 1 -0.066 -0.041
        arcToRelative(
            a = 0.191f,
            b = 0.191f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.066f,
            dy1 = -0.041f,
        )
        // c -0.022 -0.029 -0.032 -0.063 -0.022 -0.077
        curveToRelative(
            dx1 = -0.022f,
            dy1 = -0.029f,
            dx2 = -0.032f,
            dy2 = -0.063f,
            dx3 = -0.022f,
            dy3 = -0.077f,
        )
        // a 0.261 0.261 0 0 1 0.057 -0.051
        arcToRelative(
            a = 0.261f,
            b = 0.261f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.057f,
            dy1 = -0.051f,
        )
        // a 0.164 0.164 0 0 0 0.068 -0.077
        arcToRelative(
            a = 0.164f,
            b = 0.164f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.068f,
            dy1 = -0.077f,
        )
        // c 0.028 -0.1 -0.027 -0.146 -0.146 -0.215
        curveToRelative(
            dx1 = 0.028f,
            dy1 = -0.1f,
            dx2 = -0.027f,
            dy2 = -0.146f,
            dx3 = -0.146f,
            dy3 = -0.215f,
        )
        // c 0.142 -0.045 0.269 -0.082 0.361 -0.1
        curveToRelative(
            dx1 = 0.142f,
            dy1 = -0.045f,
            dx2 = 0.269f,
            dy2 = -0.082f,
            dx3 = 0.361f,
            dy3 = -0.1f,
        )
        // c 0.021 -0.005 0.031 0 0.05 -0.008
        curveToRelative(
            dx1 = 0.021f,
            dy1 = -0.005f,
            dx2 = 0.031f,
            dy2 = 0.0f,
            dx3 = 0.05f,
            dy3 = -0.008f,
        )
        // a 0.455 0.455 0 0 0 -0.089 0.184
        arcToRelative(
            a = 0.455f,
            b = 0.455f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.089f,
            dy1 = 0.184f,
        )
        // l -0.021 0.068
        lineToRelative(dx = -0.021f, dy = 0.068f)
        // l 0.068 -0.022
        lineToRelative(dx = 0.068f, dy = -0.022f)
        // a 1.454 1.454 0 0 1 0.4 -0.083
        arcToRelative(
            a = 1.454f,
            b = 1.454f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.4f,
            dy1 = -0.083f,
        )
        // a 0.742 0.742 0 0 1 0.223 0.029
        arcToRelative(
            a = 0.742f,
            b = 0.742f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.223f,
            dy1 = 0.029f,
        )
        // c 0.005 0.016 0.019 0.054 0.034 0.09
        curveToRelative(
            dx1 = 0.005f,
            dy1 = 0.016f,
            dx2 = 0.019f,
            dy2 = 0.054f,
            dx3 = 0.034f,
            dy3 = 0.09f,
        )
        // a 0.368 0.368 0 0 0 -0.041 0.01z
        arcToRelative(
            a = 0.368f,
            b = 0.368f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.041f,
            dy1 = 0.01f,
        )
        close()
        // M 13.403 13.559
        moveTo(x = 13.403f, y = 13.559f)
        // h -0.041
        horizontalLineToRelative(dx = -0.041f)
        // l 0.044 0.307
        lineToRelative(dx = 0.044f, dy = 0.307f)
        // a 0.278 0.278 0 0 0 0.087 0.132
        arcToRelative(
            a = 0.278f,
            b = 0.278f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.087f,
            dy1 = 0.132f,
        )
        // a 0.3 0.3 0 0 1 0.049 0.06
        arcToRelative(
            a = 0.3f,
            b = 0.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.049f,
            dy1 = 0.06f,
        )
        // c 0.019 0.05 0.018 0.061 -0.016 0.11
        curveToRelative(
            dx1 = 0.019f,
            dy1 = 0.05f,
            dx2 = 0.018f,
            dy2 = 0.061f,
            dx3 = -0.016f,
            dy3 = 0.11f,
        )
        // a 0.243 0.243 0 0 1 -0.221 0.063
        arcToRelative(
            a = 0.243f,
            b = 0.243f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.221f,
            dy1 = 0.063f,
        )
        // a 0.313 0.313 0 0 1 -0.11 -0.057
        arcToRelative(
            a = 0.313f,
            b = 0.313f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.11f,
            dy1 = -0.057f,
        )
        // l -0.034 -0.026
        lineToRelative(dx = -0.034f, dy = -0.026f)
        // l -0.021 0.037
        lineToRelative(dx = -0.021f, dy = 0.037f)
        // a 0.519 0.519 0 0 1 -0.078 0.107
        arcToRelative(
            a = 0.519f,
            b = 0.519f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.078f,
            dy1 = 0.107f,
        )
        // a 0.17 0.17 0 0 1 -0.144 0.051
        arcToRelative(
            a = 0.17f,
            b = 0.17f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.144f,
            dy1 = 0.051f,
        )
        // a 0.2 0.2 0 0 1 -0.13 -0.056
        arcToRelative(
            a = 0.2f,
            b = 0.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.13f,
            dy1 = -0.056f,
        )
        // a 0.439 0.439 0 0 1 -0.075 -0.16
        arcToRelative(
            a = 0.439f,
            b = 0.439f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.075f,
            dy1 = -0.16f,
        )
        // L 12.7 14.1
        lineTo(x = 12.7f, y = 14.1f)
        // l -0.22 0.044
        lineToRelative(dx = -0.22f, dy = 0.044f)
        // a 0.276 0.276 0 0 1 -0.137 -0.056
        arcToRelative(
            a = 0.276f,
            b = 0.276f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.137f,
            dy1 = -0.056f,
        )
        // a 0.147 0.147 0 0 1 0.012 -0.167
        arcToRelative(
            a = 0.147f,
            b = 0.147f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.012f,
            dy1 = -0.167f,
        )
        // a 0.341 0.341 0 0 1 0.149 -0.056
        arcToRelative(
            a = 0.341f,
            b = 0.341f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.149f,
            dy1 = -0.056f,
        )
        // a 0.663 0.663 0 0 0 0.11 -0.031
        arcToRelative(
            a = 0.663f,
            b = 0.663f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.11f,
            dy1 = -0.031f,
        )
        // a 0.619 0.619 0 0 0 0.2 -0.171
        arcToRelative(
            a = 0.619f,
            b = 0.619f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.2f,
            dy1 = -0.171f,
        )
        // l 0.025 -0.032
        lineToRelative(dx = 0.025f, dy = -0.032f)
        // l -0.034 -0.021
        lineToRelative(dx = -0.034f, dy = -0.021f)
        // a 4.557 4.557 0 0 1 -0.449 -0.333
        arcToRelative(
            a = 4.557f,
            b = 4.557f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.449f,
            dy1 = -0.333f,
        )
        // a 2.842 2.842 0 0 1 -0.2 -0.235
        arcToRelative(
            a = 2.842f,
            b = 2.842f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.2f,
            dy1 = -0.235f,
        )
        // l -0.016 -0.02
        lineToRelative(dx = -0.016f, dy = -0.02f)
        // l -0.024 0.007
        lineToRelative(dx = -0.024f, dy = 0.007f)
        // s -0.394 0.116 -0.539 0.14
        reflectiveCurveToRelative(
            dx1 = -0.394f,
            dy1 = 0.116f,
            dx2 = -0.539f,
            dy2 = 0.14f,
        )
        // a 3.143 3.143 0 0 1 -0.757 0.018
        arcToRelative(
            a = 3.143f,
            b = 3.143f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.757f,
            dy1 = 0.018f,
        )
        // h -0.013
        horizontalLineToRelative(dx = -0.013f)
        // a 1.34 1.34 0 0 1 -0.81 -0.467
        arcToRelative(
            a = 1.34f,
            b = 1.34f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.81f,
            dy1 = -0.467f,
        )
        // c -0.06 -0.055 -0.122 -0.1 -0.184 -0.158
        curveToRelative(
            dx1 = -0.06f,
            dy1 = -0.055f,
            dx2 = -0.122f,
            dy2 = -0.1f,
            dx3 = -0.184f,
            dy3 = -0.158f,
        )
        // l -0.056 -0.048
        lineToRelative(dx = -0.056f, dy = -0.048f)
        // a 1.265 1.265 0 0 0 -0.4 -0.242
        arcToRelative(
            a = 1.265f,
            b = 1.265f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.4f,
            dy1 = -0.242f,
        )
        // a 0.592 0.592 0 0 0 -0.243 -0.03
        arcToRelative(
            a = 0.592f,
            b = 0.592f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.243f,
            dy1 = -0.03f,
        )
        // l -0.014 -0.008
        lineToRelative(dx = -0.014f, dy = -0.008f)
        // l -0.009 0.01
        lineToRelative(dx = -0.009f, dy = 0.01f)
        // a 1.169 1.169 0 0 0 -0.151 0.022
        arcToRelative(
            a = 1.169f,
            b = 1.169f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.151f,
            dy1 = 0.022f,
        )
        // c -0.322 0.073 -1 0.315 -1.657 0.549
        curveToRelative(
            dx1 = -0.322f,
            dy1 = 0.073f,
            dx2 = -1.0f,
            dy2 = 0.315f,
            dx3 = -1.657f,
            dy3 = 0.549f,
        )
        // c -0.553 0.2 -1.075 0.384 -1.342 0.454
        curveToRelative(
            dx1 = -0.553f,
            dy1 = 0.2f,
            dx2 = -1.075f,
            dy2 = 0.384f,
            dx3 = -1.342f,
            dy3 = 0.454f,
        )
        // a 5.474 5.474 0 0 1 -0.739 0.093
        arcToRelative(
            a = 5.474f,
            b = 5.474f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.739f,
            dy1 = 0.093f,
        )
        // h -0.021
        horizontalLineToRelative(dx = -0.021f)
        // l -0.01 0.019
        lineToRelative(dx = -0.01f, dy = 0.019f)
        // a 0.615 0.615 0 0 1 -0.142 0.194
        arcToRelative(
            a = 0.615f,
            b = 0.615f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.142f,
            dy1 = 0.194f,
        )
        // a 0.794 0.794 0 0 1 -0.28 0.054
        arcToRelative(
            a = 0.794f,
            b = 0.794f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.28f,
            dy1 = 0.054f,
        )
        // h -0.027
        horizontalLineToRelative(dx = -0.027f)
        // l -0.007 0.027
        lineToRelative(dx = -0.007f, dy = 0.027f)
        // a 0.881 0.881 0 0 1 -0.1 0.251
        arcToRelative(
            a = 0.881f,
            b = 0.881f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.1f,
            dy1 = 0.251f,
        )
        // a 0.565 0.565 0 0 1 -0.159 0.111
        arcToRelative(
            a = 0.565f,
            b = 0.565f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.159f,
            dy1 = 0.111f,
        )
        // a 0.367 0.367 0 0 0 -0.021 -0.209
        arcToRelative(
            a = 0.367f,
            b = 0.367f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.021f,
            dy1 = -0.209f,
        )
        // l -0.035 -0.073
        lineToRelative(dx = -0.035f, dy = -0.073f)
        // l -0.039 0.071
        lineToRelative(dx = -0.039f, dy = 0.071f)
        // a 1.022 1.022 0 0 1 -0.163 0.219
        arcToRelative(
            a = 1.022f,
            b = 1.022f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.163f,
            dy1 = 0.219f,
        )
        // a 1.033 1.033 0 0 1 -0.18 0.108
        arcToRelative(
            a = 1.033f,
            b = 1.033f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.18f,
            dy1 = 0.108f,
        )
        // a 0.243 0.243 0 0 0 -0.028 -0.2
        arcToRelative(
            a = 0.243f,
            b = 0.243f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.028f,
            dy1 = -0.2f,
        )
        // l -0.036 -0.056
        lineToRelative(dx = -0.036f, dy = -0.056f)
        // l -0.029 0.06
        lineToRelative(dx = -0.029f, dy = 0.06f)
        // a 0.8 0.8 0 0 1 -0.128 0.2
        arcToRelative(
            a = 0.8f,
            b = 0.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.128f,
            dy1 = 0.2f,
        )
        // a 0.7 0.7 0 0 1 -0.154 0.087
        arcToRelative(
            a = 0.7f,
            b = 0.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.154f,
            dy1 = 0.087f,
        )
        // a 0.268 0.268 0 0 0 -0.031 -0.225
        arcToRelative(
            a = 0.268f,
            b = 0.268f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.031f,
            dy1 = -0.225f,
        )
        // l -0.038 -0.057
        lineToRelative(dx = -0.038f, dy = -0.057f)
        // l -0.027 0.063
        lineToRelative(dx = -0.027f, dy = 0.063f)
        // a 0.713 0.713 0 0 1 -0.122 0.2
        arcToRelative(
            a = 0.713f,
            b = 0.713f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.122f,
            dy1 = 0.2f,
        )
        // a 1.038 1.038 0 0 1 -0.213 0.121
        arcToRelative(
            a = 1.038f,
            b = 1.038f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.213f,
            dy1 = 0.121f,
        )
        // a 0.353 0.353 0 0 0 0.009 -0.216
        arcToRelative(
            a = 0.353f,
            b = 0.353f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.009f,
            dy1 = -0.216f,
        )
        // l -0.008 -0.026
        lineToRelative(dx = -0.008f, dy = -0.026f)
        // h -0.174
        horizontalLineToRelative(dx = -0.174f)
        // a 0.256 0.256 0 0 0 -0.233 0.153
        arcToRelative(
            a = 0.256f,
            b = 0.256f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.233f,
            dy1 = 0.153f,
        )
        // a 0.332 0.332 0 0 1 -0.055 0.073
        arcToRelative(
            a = 0.332f,
            b = 0.332f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.055f,
            dy1 = 0.073f,
        )
        // a 0.3 0.3 0 0 1 -0.24 0.045
        arcToRelative(
            a = 0.3f,
            b = 0.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.24f,
            dy1 = 0.045f,
        )
        // a 0.162 0.162 0 0 1 -0.11 -0.1
        arcToRelative(
            a = 0.162f,
            b = 0.162f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.11f,
            dy1 = -0.1f,
        )
        // a 0.215 0.215 0 0 1 0.047 -0.19
        arcToRelative(
            a = 0.215f,
            b = 0.215f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.047f,
            dy1 = -0.19f,
        )
        // l 0.048 -0.069
        lineToRelative(dx = 0.048f, dy = -0.069f)
        // l -0.083 0.011
        lineToRelative(dx = -0.083f, dy = 0.011f)
        // a 0.313 0.313 0 0 1 -0.248 -0.06
        arcToRelative(
            a = 0.313f,
            b = 0.313f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.248f,
            dy1 = -0.06f,
        )
        // a 0.189 0.189 0 0 1 -0.07 -0.139
        arcToRelative(
            a = 0.189f,
            b = 0.189f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.07f,
            dy1 = -0.139f,
        )
        // a 0.173 0.173 0 0 1 0.04 -0.135
        arcToRelative(
            a = 0.173f,
            b = 0.173f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.04f,
            dy1 = -0.135f,
        )
        // a 0.282 0.282 0 0 1 0.2 -0.049
        arcToRelative(
            a = 0.282f,
            b = 0.282f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.2f,
            dy1 = -0.049f,
        )
        // h 0.052
        horizontalLineToRelative(dx = 0.052f)
        // l -0.015 -0.05
        lineToRelative(dx = -0.015f, dy = -0.05f)
        // a 0.4 0.4 0 0 1 -0.022 -0.142
        arcToRelative(
            a = 0.4f,
            b = 0.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.022f,
            dy1 = -0.142f,
        )
        // a 0.132 0.132 0 0 1 0.134 -0.11
        arcToRelative(
            a = 0.132f,
            b = 0.132f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.134f,
            dy1 = -0.11f,
        )
        // a 0.231 0.231 0 0 1 0.117 0.046
        arcToRelative(
            a = 0.231f,
            b = 0.231f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.117f,
            dy1 = 0.046f,
        )
        // a 0.353 0.353 0 0 1 0.044 0.061
        arcToRelative(
            a = 0.353f,
            b = 0.353f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.044f,
            dy1 = 0.061f,
        )
        // a 0.364 0.364 0 0 0 0.115 0.128
        arcToRelative(
            a = 0.364f,
            b = 0.364f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.115f,
            dy1 = 0.128f,
        )
        // a 0.728 0.728 0 0 0 0.345 0.058
        arcToRelative(
            a = 0.728f,
            b = 0.728f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.345f,
            dy1 = 0.058f,
        )
        // h 0.017
        horizontalLineToRelative(dx = 0.017f)
        // a 6.091 6.091 0 0 1 0.716 -0.339
        arcToRelative(
            a = 6.091f,
            b = 6.091f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.716f,
            dy1 = -0.339f,
        )
        // c 0.149 -0.052 0.581 -0.137 0.585 -0.137
        curveToRelative(
            dx1 = 0.149f,
            dy1 = -0.052f,
            dx2 = 0.581f,
            dy2 = -0.137f,
            dx3 = 0.585f,
            dy3 = -0.137f,
        )
        // l 0.031 -0.006
        lineToRelative(dx = 0.031f, dy = -0.006f)
        // l -0.009 -0.694
        lineToRelative(dx = -0.009f, dy = -0.694f)
        // l 0.076 -0.022
        lineToRelative(dx = 0.076f, dy = -0.022f)
        // a 0.55 0.55 0 0 1 0.053 -0.1
        arcToRelative(
            a = 0.55f,
            b = 0.55f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.053f,
            dy1 = -0.1f,
        )
        // l -0.129 0.038
        lineToRelative(dx = -0.129f, dy = 0.038f)
        // v -0.266
        verticalLineToRelative(dy = -0.266f)
        // l 0.121 0.006
        lineToRelative(dx = 0.121f, dy = 0.006f)
        // a 1.4 1.4 0 0 0 0.189 0
        arcToRelative(
            a = 1.4f,
            b = 1.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.189f,
            dy1 = 0.0f,
        )
        // h 0.028
        horizontalLineToRelative(dx = 0.028f)
        // a 11.12 11.12 0 0 1 1.166 0.089
        arcToRelative(
            a = 11.12f,
            b = 11.12f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.166f,
            dy1 = 0.089f,
        )
        // l 0.6 -0.054
        lineToRelative(dx = 0.6f, dy = -0.054f)
        // c 0.022 0 2.2 -0.2 2.674 -0.255
        curveToRelative(
            dx1 = 0.022f,
            dy1 = 0.0f,
            dx2 = 2.2f,
            dy2 = -0.2f,
            dx3 = 2.674f,
            dy3 = -0.255f,
        )
        // a 5.017 5.017 0 0 1 0.716 -0.045
        arcToRelative(
            a = 5.017f,
            b = 5.017f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.716f,
            dy1 = -0.045f,
        )
        // a 4.711 4.711 0 0 1 0.522 0.051
        arcToRelative(
            a = 4.711f,
            b = 4.711f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.522f,
            dy1 = 0.051f,
        )
        // a 4.909 4.909 0 0 0 0.495 0.049
        arcToRelative(
            a = 4.909f,
            b = 4.909f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.495f,
            dy1 = 0.049f,
        )
        // c 0.08 0 0.153 0.006 0.222 0.009
        curveToRelative(
            dx1 = 0.08f,
            dy1 = 0.0f,
            dx2 = 0.153f,
            dy2 = 0.006f,
            dx3 = 0.222f,
            dy3 = 0.009f,
        )
        // a 4.034 4.034 0 0 0 0.55 0
        arcToRelative(
            a = 4.034f,
            b = 4.034f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.55f,
            dy1 = 0.0f,
        )
        // l 0.175 -0.012
        lineToRelative(dx = 0.175f, dy = -0.012f)
        // c 0.427 -0.025 1.012 -0.06 1.216 -0.393
        curveToRelative(
            dx1 = 0.427f,
            dy1 = -0.025f,
            dx2 = 1.012f,
            dy2 = -0.06f,
            dx3 = 1.216f,
            dy3 = -0.393f,
        )
        // a 0.263 0.263 0 0 0 -0.077 -0.34
        arcToRelative(
            a = 0.263f,
            b = 0.263f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.077f,
            dy1 = -0.34f,
        )
        // a 0.409 0.409 0 0 0 -0.395 -0.1
        arcToRelative(
            a = 0.409f,
            b = 0.409f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.395f,
            dy1 = -0.1f,
        )
        // c -0.083 0.019 -0.212 0.083 -0.224 0.18
        curveToRelative(
            dx1 = -0.083f,
            dy1 = 0.019f,
            dx2 = -0.212f,
            dy2 = 0.083f,
            dx3 = -0.224f,
            dy3 = 0.18f,
        )
        // a 0.175 0.175 0 0 0 0.048 0.144
        arcToRelative(
            a = 0.175f,
            b = 0.175f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.048f,
            dy1 = 0.144f,
        )
        // a 0.462 0.462 0 0 0 0.048 0.05
        arcToRelative(
            a = 0.462f,
            b = 0.462f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.048f,
            dy1 = 0.05f,
        )
        // a 0.339 0.339 0 0 1 -0.153 -0.035
        arcToRelative(
            a = 0.339f,
            b = 0.339f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.153f,
            dy1 = -0.035f,
        )
        // a 0.49 0.49 0 0 1 -0.124 -0.216
        arcToRelative(
            a = 0.49f,
            b = 0.49f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.124f,
            dy1 = -0.216f,
        )
        // l -0.02 -0.07
        lineToRelative(dx = -0.02f, dy = -0.07f)
        // l -0.045 0.058
        lineToRelative(dx = -0.045f, dy = 0.058f)
        // a 0.268 0.268 0 0 0 -0.066 0.2
        arcToRelative(
            a = 0.268f,
            b = 0.268f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.066f,
            dy1 = 0.2f,
        )
        // v 0.019
        verticalLineToRelative(dy = 0.019f)
        // a 0.275 0.275 0 0 0 0.034 0.117
        arcToRelative(
            a = 0.275f,
            b = 0.275f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.034f,
            dy1 = 0.117f,
        )
        // a 0.361 0.361 0 0 1 -0.172 -0.076
        arcToRelative(
            a = 0.361f,
            b = 0.361f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.172f,
            dy1 = -0.076f,
        )
        // a 0.712 0.712 0 0 1 -0.106 -0.23
        arcToRelative(
            a = 0.712f,
            b = 0.712f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.106f,
            dy1 = -0.23f,
        )
        // l -0.017 -0.058
        lineToRelative(dx = -0.017f, dy = -0.058f)
        // l -0.045 0.041
        lineToRelative(dx = -0.045f, dy = 0.041f)
        // a 0.316 0.316 0 0 0 -0.1 0.208
        arcToRelative(
            a = 0.316f,
            b = 0.316f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.1f,
            dy1 = 0.208f,
        )
        // a 0.28 0.28 0 0 0 0.033 0.133
        arcToRelative(
            a = 0.28f,
            b = 0.28f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.033f,
            dy1 = 0.133f,
        )
        // v 0.011
        verticalLineToRelative(dy = 0.011f)
        // a 0.429 0.429 0 0 1 -0.173 -0.1
        arcToRelative(
            a = 0.429f,
            b = 0.429f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.173f,
            dy1 = -0.1f,
        )
        // a 0.654 0.654 0 0 1 -0.085 -0.233
        arcToRelative(
            a = 0.654f,
            b = 0.654f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.085f,
            dy1 = -0.233f,
        )
        // l -0.007 -0.038
        lineToRelative(dx = -0.007f, dy = -0.038f)
        // l -0.039 0.009
        lineToRelative(dx = -0.039f, dy = 0.009f)
        // l -0.253 0.065
        lineToRelative(dx = -0.253f, dy = 0.065f)
        // c -0.331 0.085 -0.832 0.214 -1.159 0.285
        curveToRelative(
            dx1 = -0.331f,
            dy1 = 0.085f,
            dx2 = -0.832f,
            dy2 = 0.214f,
            dx3 = -1.159f,
            dy3 = 0.285f,
        )
        // h -0.023
        horizontalLineToRelative(dx = -0.023f)
        // c -0.306 0.066 -0.767 0.166 -1.093 0.211
        curveToRelative(
            dx1 = -0.306f,
            dy1 = 0.066f,
            dx2 = -0.767f,
            dy2 = 0.166f,
            dx3 = -1.093f,
            dy3 = 0.211f,
        )
        // a 2.8 2.8 0 0 1 -1.337 -0.07
        arcToRelative(
            a = 2.8f,
            b = 2.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.337f,
            dy1 = -0.07f,
        )
        // c -0.185 -0.065 -0.255 -0.127 -0.3 -0.265
        curveToRelative(
            dx1 = -0.185f,
            dy1 = -0.065f,
            dx2 = -0.255f,
            dy2 = -0.127f,
            dx3 = -0.3f,
            dy3 = -0.265f,
        )
        // a 0.326 0.326 0 0 1 0.089 -0.284
        arcToRelative(
            a = 0.326f,
            b = 0.326f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.089f,
            dy1 = -0.284f,
        )
        // a 1.139 1.139 0 0 1 0.572 -0.3
        arcToRelative(
            a = 1.139f,
            b = 1.139f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.572f,
            dy1 = -0.3f,
        )
        // a 9.122 9.122 0 0 1 1.029 -0.213
        arcToRelative(
            a = 9.122f,
            b = 9.122f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.029f,
            dy1 = -0.213f,
        )
        // a 3.56 3.56 0 0 1 0.947 0.009
        arcToRelative(
            a = 3.56f,
            b = 3.56f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.947f,
            dy1 = 0.009f,
        )
        // c 0.057 0.007 0.111 0.014 0.166 0.019
        curveToRelative(
            dx1 = 0.057f,
            dy1 = 0.007f,
            dx2 = 0.111f,
            dy2 = 0.014f,
            dx3 = 0.166f,
            dy3 = 0.019f,
        )
        // a 0.61 0.61 0 0 0 0.427 -0.09
        arcToRelative(
            a = 0.61f,
            b = 0.61f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.427f,
            dy1 = -0.09f,
        )
        // l 0.013 -0.013
        lineToRelative(dx = 0.013f, dy = -0.013f)
        // a 0.157 0.157 0 0 0 0.054 -0.162
        arcToRelative(
            a = 0.157f,
            b = 0.157f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.054f,
            dy1 = -0.162f,
        )
        // a 0.256 0.256 0 0 1 0.1 0.093
        arcToRelative(
            a = 0.256f,
            b = 0.256f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.1f,
            dy1 = 0.093f,
        )
        // a 0.263 0.263 0 0 1 -0.006 0.151
        arcToRelative(
            a = 0.263f,
            b = 0.263f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.006f,
            dy1 = 0.151f,
        )
        // l -0.024 0.06
        lineToRelative(dx = -0.024f, dy = 0.06f)
        // l 0.063 -0.008
        lineToRelative(dx = 0.063f, dy = -0.008f)
        // a 1.127 1.127 0 0 0 0.512 -0.176
        arcToRelative(
            a = 1.127f,
            b = 1.127f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.512f,
            dy1 = -0.176f,
        )
        // l 0.077 -0.077
        lineToRelative(dx = 0.077f, dy = -0.077f)
        // a 0.575 0.575 0 0 1 -0.391 0.4
        arcToRelative(
            a = 0.575f,
            b = 0.575f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.391f,
            dy1 = 0.4f,
        )
        // a 1.634 1.634 0 0 1 -0.718 0.1
        arcToRelative(
            a = 1.634f,
            b = 1.634f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.718f,
            dy1 = 0.1f,
        )
        // a 3.435 3.435 0 0 1 -0.439 -0.079
        arcToRelative(
            a = 3.435f,
            b = 3.435f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.439f,
            dy1 = -0.079f,
        )
        // l -0.13 -0.032
        lineToRelative(dx = -0.13f, dy = -0.032f)
        // l 0.095 0.095
        lineToRelative(dx = 0.095f, dy = 0.095f)
        // a 0.188 0.188 0 0 1 0.075 0.154
        arcToRelative(
            a = 0.188f,
            b = 0.188f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.075f,
            dy1 = 0.154f,
        )
        // c -0.008 0.042 -0.049 0.083 -0.118 0.121
        curveToRelative(
            dx1 = -0.008f,
            dy1 = 0.042f,
            dx2 = -0.049f,
            dy2 = 0.083f,
            dx3 = -0.118f,
            dy3 = 0.121f,
        )
        // c 0 -0.06 -0.009 -0.134 -0.066 -0.153
        curveToRelative(
            dx1 = 0.0f,
            dy1 = -0.06f,
            dx2 = -0.009f,
            dy2 = -0.134f,
            dx3 = -0.066f,
            dy3 = -0.153f,
        )
        // a 0.55 0.55 0 0 0 -0.438 0.1
        arcToRelative(
            a = 0.55f,
            b = 0.55f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.438f,
            dy1 = 0.1f,
        )
        // a 0.784 0.784 0 0 1 -0.338 0.082
        arcToRelative(
            a = 0.784f,
            b = 0.784f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.338f,
            dy1 = 0.082f,
        )
        // a 1.15 1.15 0 0 1 -0.417 -0.046
        arcToRelative(
            a = 1.15f,
            b = 1.15f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.417f,
            dy1 = -0.046f,
        )
        // a 1.068 1.068 0 0 1 -0.13 -0.06
        arcToRelative(
            a = 1.068f,
            b = 1.068f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.13f,
            dy1 = -0.06f,
        )
        // a 0.436 0.436 0 0 0 -0.228 -0.079
        arcToRelative(
            a = 0.436f,
            b = 0.436f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.228f,
            dy1 = -0.079f,
        )
        // l -0.063 0.012
        lineToRelative(dx = -0.063f, dy = 0.012f)
        // a 0.593 0.593 0 0 0 -0.391 0.172
        arcToRelative(
            a = 0.593f,
            b = 0.593f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.391f,
            dy1 = 0.172f,
        )
        // a 0.171 0.171 0 0 0 0 0.188
        arcToRelative(
            a = 0.171f,
            b = 0.171f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 0.188f,
        )
        // a 0.506 0.506 0 0 0 0.341 0.178
        arcToRelative(
            a = 0.506f,
            b = 0.506f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.341f,
            dy1 = 0.178f,
        )
        // a 2.7 2.7 0 0 0 1 0
        arcToRelative(
            a = 2.7f,
            b = 2.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = 0.0f,
        )
        // c 0.208 -0.034 0.438 -0.085 0.661 -0.135
        curveToRelative(
            dx1 = 0.208f,
            dy1 = -0.034f,
            dx2 = 0.438f,
            dy2 = -0.085f,
            dx3 = 0.661f,
            dy3 = -0.135f,
        )
        // c 0.158 -0.035 0.322 -0.071 0.471 -0.1
        curveToRelative(
            dx1 = 0.158f,
            dy1 = -0.035f,
            dx2 = 0.322f,
            dy2 = -0.071f,
            dx3 = 0.471f,
            dy3 = -0.1f,
        )
        // c 0.212 -0.04 0.583 -0.144 0.91 -0.236
        curveToRelative(
            dx1 = 0.212f,
            dy1 = -0.04f,
            dx2 = 0.583f,
            dy2 = -0.144f,
            dx3 = 0.91f,
            dy3 = -0.236f,
        )
        // c 0.225 -0.063 0.419 -0.117 0.527 -0.141
        curveToRelative(
            dx1 = 0.225f,
            dy1 = -0.063f,
            dx2 = 0.419f,
            dy2 = -0.117f,
            dx3 = 0.527f,
            dy3 = -0.141f,
        )
        // a 4.124 4.124 0 0 1 1.036 -0.128
        arcToRelative(
            a = 4.124f,
            b = 4.124f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.036f,
            dy1 = -0.128f,
        )
        // h 0.019
        horizontalLineToRelative(dx = 0.019f)
        // a 0.865 0.865 0 0 1 0.636 0.2
        arcToRelative(
            a = 0.865f,
            b = 0.865f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.636f,
            dy1 = 0.2f,
        )
        // a 0.5 0.5 0 0 1 0.133 0.372
        arcToRelative(
            a = 0.5f,
            b = 0.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.133f,
            dy1 = 0.372f,
        )
        // c -0.01 0.309 -0.367 0.461 -0.677 0.559
        curveToRelative(
            dx1 = -0.01f,
            dy1 = 0.309f,
            dx2 = -0.367f,
            dy2 = 0.461f,
            dx3 = -0.677f,
            dy3 = 0.559f,
        )
        // a 4.775 4.775 0 0 1 -1.469 0.107
        arcToRelative(
            a = 4.775f,
            b = 4.775f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.469f,
            dy1 = 0.107f,
        )
        // c -0.125 0 -0.242 -0.006 -0.346 -0.006
        curveToRelative(
            dx1 = -0.125f,
            dy1 = 0.0f,
            dx2 = -0.242f,
            dy2 = -0.006f,
            dx3 = -0.346f,
            dy3 = -0.006f,
        )
        // h -0.121
        horizontalLineToRelative(dx = -0.121f)
        // l 0.1 0.067
        lineToRelative(dx = 0.1f, dy = 0.067f)
        // l 0.242 0.173
        lineToRelative(dx = 0.242f, dy = 0.173f)
        // a 0.468 0.468 0 0 1 0.087 0.094
        arcToRelative(
            a = 0.468f,
            b = 0.468f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.087f,
            dy1 = 0.094f,
        )
        // a 0.338 0.338 0 0 0 0.168 0.142
        arcToRelative(
            a = 0.338f,
            b = 0.338f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.168f,
            dy1 = 0.142f,
        )
        // a 0.76 0.76 0 0 0 0.358 -0.029
        arcToRelative(
            a = 0.76f,
            b = 0.76f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.358f,
            dy1 = -0.029f,
        )
        // a 1.26 1.26 0 0 1 0.183 -0.035
        arcToRelative(
            a = 1.26f,
            b = 1.26f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.183f,
            dy1 = -0.035f,
        )
        // c 0.214 -0.016 0.582 0 0.585 0
        curveToRelative(
            dx1 = 0.214f,
            dy1 = -0.016f,
            dx2 = 0.582f,
            dy2 = 0.0f,
            dx3 = 0.585f,
            dy3 = 0.0f,
        )
        // h 0.016
        horizontalLineToRelative(dx = 0.016f)
        // l 0.021 -0.02
        lineToRelative(dx = 0.021f, dy = -0.02f)
        // a 0.3 0.3 0 0 1 0.125 -0.089
        arcToRelative(
            a = 0.3f,
            b = 0.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.125f,
            dy1 = -0.089f,
        )
        // a 0.279 0.279 0 0 1 0.121 0
        arcToRelative(
            a = 0.279f,
            b = 0.279f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.121f,
            dy1 = 0.0f,
        )
        // c 0.06 0.019 0.083 0.083 0.064 0.181
        curveToRelative(
            dx1 = 0.06f,
            dy1 = 0.019f,
            dx2 = 0.083f,
            dy2 = 0.083f,
            dx3 = 0.064f,
            dy3 = 0.181f,
        )
        // v 0.017
        verticalLineToRelative(dy = 0.017f)
        // l 0.011 0.014
        lineToRelative(dx = 0.011f, dy = 0.014f)
        // a 0.263 0.263 0 0 0 0.142 0.081
        arcToRelative(
            a = 0.263f,
            b = 0.263f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.142f,
            dy1 = 0.081f,
        )
        // a 0.793 0.793 0 0 0 0.127 0.006
        arcToRelative(
            a = 0.793f,
            b = 0.793f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.127f,
            dy1 = 0.006f,
        )
        // a 0.285 0.285 0 0 1 0.076 0
        arcToRelative(
            a = 0.285f,
            b = 0.285f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.076f,
            dy1 = 0.0f,
        )
        // a 0.7 0.7 0 0 1 0.1 0.036
        arcToRelative(
            a = 0.7f,
            b = 0.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.1f,
            dy1 = 0.036f,
        )
        // a 0.6 0.6 0 0 0 -0.09 0.039
        arcToRelative(
            a = 0.6f,
            b = 0.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.09f,
            dy1 = 0.039f,
        )
        // a 0.4 0.4 0 0 0 -0.091 0.094
        arcToRelative(
            a = 0.4f,
            b = 0.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.091f,
            dy1 = 0.094f,
        )
        // l -0.041 0.059
        lineToRelative(dx = -0.041f, dy = 0.059f)
        // h 0.072
        horizontalLineToRelative(dx = 0.072f)
        // a 0.936 0.936 0 0 1 0.223 0.022
        arcToRelative(
            a = 0.936f,
            b = 0.936f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.223f,
            dy1 = 0.022f,
        )
        // a 0.283 0.283 0 0 1 0.071 0.042
        arcToRelative(
            a = 0.283f,
            b = 0.283f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.071f,
            dy1 = 0.042f,
        )
        // a 0.211 0.211 0 0 0 -0.078 0.025
        arcToRelative(
            a = 0.211f,
            b = 0.211f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.078f,
            dy1 = 0.025f,
        )
        // a 0.691 0.691 0 0 0 -0.1 0.085
        arcToRelative(
            a = 0.691f,
            b = 0.691f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.1f,
            dy1 = 0.085f,
        )
        // l -0.074 0.073
        lineToRelative(dx = -0.074f, dy = 0.073f)
        // l 0.1 -0.01
        lineToRelative(dx = 0.1f, dy = -0.01f)
        // a 0.476 0.476 0 0 1 0.236 0.025
        arcToRelative(
            a = 0.476f,
            b = 0.476f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.236f,
            dy1 = 0.025f,
        )
        // a 0.655 0.655 0 0 1 0.069 0.061
        arcToRelative(
            a = 0.655f,
            b = 0.655f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.069f,
            dy1 = 0.061f,
        )
        // a 0.46 0.46 0 0 0 -0.082 0.012
        arcToRelative(
            a = 0.46f,
            b = 0.46f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.082f,
            dy1 = 0.012f,
        )
        // a 0.489 0.489 0 0 0 -0.1 0.048
        arcToRelative(
            a = 0.489f,
            b = 0.489f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.1f,
            dy1 = 0.048f,
        )
        // l -0.06 0.038
        lineToRelative(dx = -0.06f, dy = 0.038f)
        // l 0.065 0.028
        lineToRelative(dx = 0.065f, dy = 0.028f)
        // a 0.619 0.619 0 0 1 0.183 0.121
        arcToRelative(
            a = 0.619f,
            b = 0.619f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.183f,
            dy1 = 0.121f,
        )
        // a 0.231 0.231 0 0 1 0.04 0.088
        arcToRelative(
            a = 0.231f,
            b = 0.231f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.04f,
            dy1 = 0.088f,
        )
        // c -0.022 -0.011 -0.045 -0.023 -0.064 -0.03
        curveToRelative(
            dx1 = -0.022f,
            dy1 = -0.011f,
            dx2 = -0.045f,
            dy2 = -0.023f,
            dx3 = -0.064f,
            dy3 = -0.03f,
        )
        // a 0.339 0.339 0 0 0 -0.117 0.016z
        arcToRelative(
            a = 0.339f,
            b = 0.339f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.117f,
            dy1 = 0.016f,
        )
        close()
        // M 11.837 11.629
        moveTo(x = 11.837f, y = 11.629f)
        // a 0.467 0.467 0 0 0 -0.033 -0.089
        arcToRelative(
            a = 0.467f,
            b = 0.467f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.033f,
            dy1 = -0.089f,
        )
        // a 0.208 0.208 0 0 1 -0.026 -0.1
        arcToRelative(
            a = 0.208f,
            b = 0.208f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.026f,
            dy1 = -0.1f,
        )
        // a 0.221 0.221 0 0 1 0.032 -0.105
        arcToRelative(
            a = 0.221f,
            b = 0.221f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.032f,
            dy1 = -0.105f,
        )
        // a 0.57 0.57 0 0 0 0.1 0.2
        arcToRelative(
            a = 0.57f,
            b = 0.57f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.1f,
            dy1 = 0.2f,
        )
        // a 0.536 0.536 0 0 0 0.3 0.108
        arcToRelative(
            a = 0.536f,
            b = 0.536f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.3f,
            dy1 = 0.108f,
        )
        // h 0.086
        horizontalLineToRelative(dx = 0.086f)
        // l -0.056 -0.065
        lineToRelative(dx = -0.056f, dy = -0.065f)
        // a 0.213 0.213 0 0 1 -0.069 -0.147
        arcToRelative(
            a = 0.213f,
            b = 0.213f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.069f,
            dy1 = -0.147f,
        )
        // v -0.021
        verticalLineToRelative(dy = -0.021f)
        // a 0.167 0.167 0 0 1 0.013 -0.085
        arcToRelative(
            a = 0.167f,
            b = 0.167f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.013f,
            dy1 = -0.085f,
        )
        // a 0.425 0.425 0 0 0 0.126 0.182
        arcToRelative(
            a = 0.425f,
            b = 0.425f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.126f,
            dy1 = 0.182f,
        )
        // a 0.629 0.629 0 0 0 0.312 0.048
        arcToRelative(
            a = 0.629f,
            b = 0.629f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.312f,
            dy1 = 0.048f,
        )
        // l 0.133 -0.009
        lineToRelative(dx = 0.133f, dy = -0.009f)
        // l -0.119 -0.062
        lineToRelative(dx = -0.119f, dy = -0.062f)
        // a 0.422 0.422 0 0 1 -0.122 -0.1
        arcToRelative(
            a = 0.422f,
            b = 0.422f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.122f,
            dy1 = -0.1f,
        )
        // a 0.1 0.1 0 0 1 -0.031 -0.088
        arcToRelative(
            a = 0.1f,
            b = 0.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.031f,
            dy1 = -0.088f,
        )
        // c 0.005 -0.047 0.093 -0.1 0.167 -0.117
        curveToRelative(
            dx1 = 0.005f,
            dy1 = -0.047f,
            dx2 = 0.093f,
            dy2 = -0.1f,
            dx3 = 0.167f,
            dy3 = -0.117f,
        )
        // a 0.344 0.344 0 0 1 0.333 0.083
        arcToRelative(
            a = 0.344f,
            b = 0.344f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.333f,
            dy1 = 0.083f,
        )
        // a 0.187 0.187 0 0 1 0.058 0.242
        arcToRelative(
            a = 0.187f,
            b = 0.187f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.058f,
            dy1 = 0.242f,
        )
        // c -0.183 0.3 -0.746 0.333 -1.156 0.358
        curveToRelative(
            dx1 = -0.183f,
            dy1 = 0.3f,
            dx2 = -0.746f,
            dy2 = 0.333f,
            dx3 = -1.156f,
            dy3 = 0.358f,
        )
        // c -0.063 0 -0.123 0.007 -0.177 0.012
        curveToRelative(
            dx1 = -0.063f,
            dy1 = 0.0f,
            dx2 = -0.123f,
            dy2 = 0.007f,
            dx3 = -0.177f,
            dy3 = 0.012f,
        )
        // a 4.051 4.051 0 0 1 -0.54 0
        arcToRelative(
            a = 4.051f,
            b = 4.051f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.54f,
            dy1 = 0.0f,
        )
        // l -0.224 -0.01
        lineToRelative(dx = -0.224f, dy = -0.01f)
        // a 4.225 4.225 0 0 1 -0.487 -0.048
        arcToRelative(
            a = 4.225f,
            b = 4.225f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.487f,
            dy1 = -0.048f,
        )
        // a 4.812 4.812 0 0 0 -0.53 -0.051
        arcToRelative(
            a = 4.812f,
            b = 4.812f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.53f,
            dy1 = -0.051f,
        )
        // h -0.085
        horizontalLineToRelative(dx = -0.085f)
        // a 5 5 0 0 0 -0.536 0.034
        arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.536f,
            dy1 = 0.034f,
        )
        // c 0.249 -0.047 0.51 -0.1 0.707 -0.146
        curveToRelative(
            dx1 = 0.249f,
            dy1 = -0.047f,
            dx2 = 0.51f,
            dy2 = -0.1f,
            dx3 = 0.707f,
            dy3 = -0.146f,
        )
        // h 0.023
        horizontalLineToRelative(dx = 0.023f)
        // c 0.329 -0.071 0.83 -0.2 1.162 -0.286
        curveToRelative(
            dx1 = 0.329f,
            dy1 = -0.071f,
            dx2 = 0.83f,
            dy2 = -0.2f,
            dx3 = 1.162f,
            dy3 = -0.286f,
        )
        // l 0.215 -0.055
        lineToRelative(dx = 0.215f, dy = -0.055f)
        // a 0.64 0.64 0 0 0 0.093 0.229
        arcToRelative(
            a = 0.64f,
            b = 0.64f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.093f,
            dy1 = 0.229f,
        )
        // a 0.637 0.637 0 0 0 0.281 0.144
        arcToRelative(
            a = 0.637f,
            b = 0.637f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.281f,
            dy1 = 0.144f,
        )
        // l 0.06 0.015z
        lineToRelative(dx = 0.06f, dy = 0.015f)
        close()
    }
    // M9.332 12.342 a0.916 0.916 0 0 1 0.1 0.056 l-0.079 0.005 a1.426 1.426 0 0 0 -0.337 0.064 0.538 0.538 0 0 1 0.111 -0.155 0.55 0.55 0 0 1 0.205 0.03 m0.355 0.21  l0.003 0.002 -0.002 0.001z
    path(
        fill = SolidColor(Color(0xFF806600)),
    ) {
        // M 9.332 12.342
        moveTo(x = 9.332f, y = 12.342f)
        // a 0.916 0.916 0 0 1 0.1 0.056
        arcToRelative(
            a = 0.916f,
            b = 0.916f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.1f,
            dy1 = 0.056f,
        )
        // l -0.079 0.005
        lineToRelative(dx = -0.079f, dy = 0.005f)
        // a 1.426 1.426 0 0 0 -0.337 0.064
        arcToRelative(
            a = 1.426f,
            b = 1.426f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.337f,
            dy1 = 0.064f,
        )
        // a 0.538 0.538 0 0 1 0.111 -0.155
        arcToRelative(
            a = 0.538f,
            b = 0.538f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.111f,
            dy1 = -0.155f,
        )
        // a 0.55 0.55 0 0 1 0.205 0.03
        arcToRelative(
            a = 0.55f,
            b = 0.55f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.205f,
            dy1 = 0.03f,
        )
        // m 0.355 0.21
        moveToRelative(dx = 0.355f, dy = 0.21f)
        // l 0.003 0.002
        lineToRelative(dx = 0.003f, dy = 0.002f)
        // l -0.002 0.001z
        lineToRelative(dx = -0.002f, dy = 0.001f)
        close()
    }
    // M9.8 12.729 a0.146 0.146 0 0 1 -0.107 -0.106 s-0.019 -0.061 -0.006 -0.069 l0.189 0.163 a0.214 0.214 0 0 1 -0.076 0.012
    path(
        fill = SolidColor(Color(0xFF806600)),
    ) {
        // M 9.8 12.729
        moveTo(x = 9.8f, y = 12.729f)
        // a 0.146 0.146 0 0 1 -0.107 -0.106
        arcToRelative(
            a = 0.146f,
            b = 0.146f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.107f,
            dy1 = -0.106f,
        )
        // s -0.019 -0.061 -0.006 -0.069
        reflectiveCurveToRelative(
            dx1 = -0.019f,
            dy1 = -0.061f,
            dx2 = -0.006f,
            dy2 = -0.069f,
        )
        // l 0.189 0.163
        lineToRelative(dx = 0.189f, dy = 0.163f)
        // a 0.214 0.214 0 0 1 -0.076 0.012
        arcToRelative(
            a = 0.214f,
            b = 0.214f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.076f,
            dy1 = 0.012f,
        )
    }
}

private fun ImageVector.Builder.emoji1f1e81f1f6Chunk3() {
    // M4.578 12.05 c-0.159 0.4 0.489 0.58 0.575 0.143 a1.3 1.3 0 0 1 -0.575 -0.143
    path(
        fill = SolidColor(Color(0xFFFCD41C)),
        pathFillType = PathFillType.EvenOdd,
    ) {
        // M 4.578 12.05
        moveTo(x = 4.578f, y = 12.05f)
        // c -0.159 0.4 0.489 0.58 0.575 0.143
        curveToRelative(
            dx1 = -0.159f,
            dy1 = 0.4f,
            dx2 = 0.489f,
            dy2 = 0.58f,
            dx3 = 0.575f,
            dy3 = 0.143f,
        )
        // a 1.3 1.3 0 0 1 -0.575 -0.143
        arcToRelative(
            a = 1.3f,
            b = 1.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.575f,
            dy1 = -0.143f,
        )
    }
    // M6.5 11.986 a0.113 0.113 0 0 1 -0.019 -0.062 c-0.02 -0.036 -0.043 -0.071 -0.061 -0.108 s-0.056 -0.042 -0.034 -0.068 c0 0 0.062 -0.112 0 -0.177 -0.03 -0.033 -0.041 -0.048 -0.031 -0.084 a0.411 0.411 0 0 0 0.021 -0.17 0.2 0.2 0 0 0 -0.112 -0.177 0.075 0.075 0 0 1 -0.051 -0.082 0.233 0.233 0 0 0 -0.115 -0.216 c-0.058 -0.031 -0.054 -0.094 -0.078 -0.143 l-0.014 -0.015 a0.282 0.282 0 0 0 -0.12 -0.053 0.071 0.071 0 0 1 -0.058 -0.037 c-0.05 -0.089 -0.143 -0.052 -0.214 -0.077 s-0.132 -0.094 -0.222 -0.065 a0.133 0.133 0 0 1 -0.107 0 0.163 0.163 0 0 0 -0.165 0.01 0.161 0.161 0 0 1 -0.12 0.024 0.11 0.11 0 0 0 -0.069 0.007 0.874 0.874 0 0 0 -0.343 0.2 1.19 1.19 0 0 1 -0.19 0.192 0.238 0.238 0 0 0 -0.057 0.247 0.314 0.314 0 0 1 -0.028 0.227 0.307 0.307 0 0 1 -0.082 0.1 0.87 0.87 0 0 0 -0.2 0.239 0.829 0.829 0 0 0 -0.089 0.158 0.416 0.416 0 0 0 -0.012 0.237 0.138 0.138 0 0 1 0 0.1 v0.048 a0.98 0.98 0 0 1 0.061 0.379 s-0.041 0.149 0.046 0.137 a0.174 0.174 0 0 0 0.13 -0.08 c0.017 -0.028 0.041 -0.008 0.05 0.02 s0.021 0.069 0.034 0.1 0.041 0.072 0.076 0.073 c0.1 0 0.169 0.089 0.262 0.112 a0.87 0.87 0 0 0 0.311 0.085 0.672 0.672 0 0 0 0.412 -0.088 v0.007 c0 0.062 0.284 0 0.4 -0.06 a0.36 0.36 0 0 0 0.163 -0.2 0.237 0.237 0 0 1 0.233 -0.181 0.347 0.347 0 0 0 0.268 -0.159 0.2 0.2 0 0 0 0.024 -0.086 v-0.127 c-0.012 -0.028 -0.039 -0.058 0.014 -0.074 h0.063 c0.044 -0.033 0.015 -0.076 0.023 -0.113z
    path(
        fill = SolidColor(Color(0xFFFCD41C)),
    ) {
        // M 6.5 11.986
        moveTo(x = 6.5f, y = 11.986f)
        // a 0.113 0.113 0 0 1 -0.019 -0.062
        arcToRelative(
            a = 0.113f,
            b = 0.113f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.019f,
            dy1 = -0.062f,
        )
        // c -0.02 -0.036 -0.043 -0.071 -0.061 -0.108
        curveToRelative(
            dx1 = -0.02f,
            dy1 = -0.036f,
            dx2 = -0.043f,
            dy2 = -0.071f,
            dx3 = -0.061f,
            dy3 = -0.108f,
        )
        // s -0.056 -0.042 -0.034 -0.068
        reflectiveCurveToRelative(
            dx1 = -0.056f,
            dy1 = -0.042f,
            dx2 = -0.034f,
            dy2 = -0.068f,
        )
        // c 0 0 0.062 -0.112 0 -0.177
        curveToRelative(
            dx1 = 0.0f,
            dy1 = 0.0f,
            dx2 = 0.062f,
            dy2 = -0.112f,
            dx3 = 0.0f,
            dy3 = -0.177f,
        )
        // c -0.03 -0.033 -0.041 -0.048 -0.031 -0.084
        curveToRelative(
            dx1 = -0.03f,
            dy1 = -0.033f,
            dx2 = -0.041f,
            dy2 = -0.048f,
            dx3 = -0.031f,
            dy3 = -0.084f,
        )
        // a 0.411 0.411 0 0 0 0.021 -0.17
        arcToRelative(
            a = 0.411f,
            b = 0.411f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.021f,
            dy1 = -0.17f,
        )
        // a 0.2 0.2 0 0 0 -0.112 -0.177
        arcToRelative(
            a = 0.2f,
            b = 0.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.112f,
            dy1 = -0.177f,
        )
        // a 0.075 0.075 0 0 1 -0.051 -0.082
        arcToRelative(
            a = 0.075f,
            b = 0.075f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.051f,
            dy1 = -0.082f,
        )
        // a 0.233 0.233 0 0 0 -0.115 -0.216
        arcToRelative(
            a = 0.233f,
            b = 0.233f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.115f,
            dy1 = -0.216f,
        )
        // c -0.058 -0.031 -0.054 -0.094 -0.078 -0.143
        curveToRelative(
            dx1 = -0.058f,
            dy1 = -0.031f,
            dx2 = -0.054f,
            dy2 = -0.094f,
            dx3 = -0.078f,
            dy3 = -0.143f,
        )
        // l -0.014 -0.015
        lineToRelative(dx = -0.014f, dy = -0.015f)
        // a 0.282 0.282 0 0 0 -0.12 -0.053
        arcToRelative(
            a = 0.282f,
            b = 0.282f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.12f,
            dy1 = -0.053f,
        )
        // a 0.071 0.071 0 0 1 -0.058 -0.037
        arcToRelative(
            a = 0.071f,
            b = 0.071f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.058f,
            dy1 = -0.037f,
        )
        // c -0.05 -0.089 -0.143 -0.052 -0.214 -0.077
        curveToRelative(
            dx1 = -0.05f,
            dy1 = -0.089f,
            dx2 = -0.143f,
            dy2 = -0.052f,
            dx3 = -0.214f,
            dy3 = -0.077f,
        )
        // s -0.132 -0.094 -0.222 -0.065
        reflectiveCurveToRelative(
            dx1 = -0.132f,
            dy1 = -0.094f,
            dx2 = -0.222f,
            dy2 = -0.065f,
        )
        // a 0.133 0.133 0 0 1 -0.107 0
        arcToRelative(
            a = 0.133f,
            b = 0.133f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.107f,
            dy1 = 0.0f,
        )
        // a 0.163 0.163 0 0 0 -0.165 0.01
        arcToRelative(
            a = 0.163f,
            b = 0.163f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.165f,
            dy1 = 0.01f,
        )
        // a 0.161 0.161 0 0 1 -0.12 0.024
        arcToRelative(
            a = 0.161f,
            b = 0.161f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.12f,
            dy1 = 0.024f,
        )
        // a 0.11 0.11 0 0 0 -0.069 0.007
        arcToRelative(
            a = 0.11f,
            b = 0.11f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.069f,
            dy1 = 0.007f,
        )
        // a 0.874 0.874 0 0 0 -0.343 0.2
        arcToRelative(
            a = 0.874f,
            b = 0.874f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.343f,
            dy1 = 0.2f,
        )
        // a 1.19 1.19 0 0 1 -0.19 0.192
        arcToRelative(
            a = 1.19f,
            b = 1.19f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.19f,
            dy1 = 0.192f,
        )
        // a 0.238 0.238 0 0 0 -0.057 0.247
        arcToRelative(
            a = 0.238f,
            b = 0.238f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.057f,
            dy1 = 0.247f,
        )
        // a 0.314 0.314 0 0 1 -0.028 0.227
        arcToRelative(
            a = 0.314f,
            b = 0.314f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.028f,
            dy1 = 0.227f,
        )
        // a 0.307 0.307 0 0 1 -0.082 0.1
        arcToRelative(
            a = 0.307f,
            b = 0.307f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.082f,
            dy1 = 0.1f,
        )
        // a 0.87 0.87 0 0 0 -0.2 0.239
        arcToRelative(
            a = 0.87f,
            b = 0.87f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.2f,
            dy1 = 0.239f,
        )
        // a 0.829 0.829 0 0 0 -0.089 0.158
        arcToRelative(
            a = 0.829f,
            b = 0.829f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.089f,
            dy1 = 0.158f,
        )
        // a 0.416 0.416 0 0 0 -0.012 0.237
        arcToRelative(
            a = 0.416f,
            b = 0.416f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.012f,
            dy1 = 0.237f,
        )
        // a 0.138 0.138 0 0 1 0 0.1
        arcToRelative(
            a = 0.138f,
            b = 0.138f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 0.1f,
        )
        // v 0.048
        verticalLineToRelative(dy = 0.048f)
        // a 0.98 0.98 0 0 1 0.061 0.379
        arcToRelative(
            a = 0.98f,
            b = 0.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.061f,
            dy1 = 0.379f,
        )
        // s -0.041 0.149 0.046 0.137
        reflectiveCurveToRelative(
            dx1 = -0.041f,
            dy1 = 0.149f,
            dx2 = 0.046f,
            dy2 = 0.137f,
        )
        // a 0.174 0.174 0 0 0 0.13 -0.08
        arcToRelative(
            a = 0.174f,
            b = 0.174f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.13f,
            dy1 = -0.08f,
        )
        // c 0.017 -0.028 0.041 -0.008 0.05 0.02
        curveToRelative(
            dx1 = 0.017f,
            dy1 = -0.028f,
            dx2 = 0.041f,
            dy2 = -0.008f,
            dx3 = 0.05f,
            dy3 = 0.02f,
        )
        // s 0.021 0.069 0.034 0.1
        reflectiveCurveToRelative(
            dx1 = 0.021f,
            dy1 = 0.069f,
            dx2 = 0.034f,
            dy2 = 0.1f,
        )
        // s 0.041 0.072 0.076 0.073
        reflectiveCurveToRelative(
            dx1 = 0.041f,
            dy1 = 0.072f,
            dx2 = 0.076f,
            dy2 = 0.073f,
        )
        // c 0.1 0 0.169 0.089 0.262 0.112
        curveToRelative(
            dx1 = 0.1f,
            dy1 = 0.0f,
            dx2 = 0.169f,
            dy2 = 0.089f,
            dx3 = 0.262f,
            dy3 = 0.112f,
        )
        // a 0.87 0.87 0 0 0 0.311 0.085
        arcToRelative(
            a = 0.87f,
            b = 0.87f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.311f,
            dy1 = 0.085f,
        )
        // a 0.672 0.672 0 0 0 0.412 -0.088
        arcToRelative(
            a = 0.672f,
            b = 0.672f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.412f,
            dy1 = -0.088f,
        )
        // v 0.007
        verticalLineToRelative(dy = 0.007f)
        // c 0 0.062 0.284 0 0.4 -0.06
        curveToRelative(
            dx1 = 0.0f,
            dy1 = 0.062f,
            dx2 = 0.284f,
            dy2 = 0.0f,
            dx3 = 0.4f,
            dy3 = -0.06f,
        )
        // a 0.36 0.36 0 0 0 0.163 -0.2
        arcToRelative(
            a = 0.36f,
            b = 0.36f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.163f,
            dy1 = -0.2f,
        )
        // a 0.237 0.237 0 0 1 0.233 -0.181
        arcToRelative(
            a = 0.237f,
            b = 0.237f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.233f,
            dy1 = -0.181f,
        )
        // a 0.347 0.347 0 0 0 0.268 -0.159
        arcToRelative(
            a = 0.347f,
            b = 0.347f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.268f,
            dy1 = -0.159f,
        )
        // a 0.2 0.2 0 0 0 0.024 -0.086
        arcToRelative(
            a = 0.2f,
            b = 0.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.024f,
            dy1 = -0.086f,
        )
        // v -0.127
        verticalLineToRelative(dy = -0.127f)
        // c -0.012 -0.028 -0.039 -0.058 0.014 -0.074
        curveToRelative(
            dx1 = -0.012f,
            dy1 = -0.028f,
            dx2 = -0.039f,
            dy2 = -0.058f,
            dx3 = 0.014f,
            dy3 = -0.074f,
        )
        // h 0.063
        horizontalLineToRelative(dx = 0.063f)
        // c 0.044 -0.033 0.015 -0.076 0.023 -0.113z
        curveToRelative(
            dx1 = 0.044f,
            dy1 = -0.033f,
            dx2 = 0.015f,
            dy2 = -0.076f,
            dx3 = 0.023f,
            dy3 = -0.113f,
        )
        close()
    }
    // M5.792 11.477 a0.141 0.141 0 0 1 -0.179 0.056 c-0.01 -0.01 -0.065 -0.066 -0.084 -0.027 l-0.027 0.053 c-0.035 0.062 -0.118 0.183 -0.223 0.176 a0.089 0.089 0 0 1 -0.079 -0.065 c-0.016 -0.039 0.01 -0.057 0.04 -0.071 a0.069 0.069 0 0 0 0.025 -0.023 l0.013 -0.015 a0.238 0.238 0 0 1 0.135 -0.079 L5.4 11.482 c0.048 0 0.06 -0.04 0.066 -0.077 s0 -0.081 0 -0.122 a0.377 0.377 0 0 0 0.215 0.034 0.424 0.424 0 0 0 0.234 -0.1 c0.027 -0.021 0.019 -0.037 -0.008 -0.048 l-0.007 -0.006 -0.032 -0.01 c-0.033 0 -0.068 0.011 -0.092 -0.022 s0 -0.039 0.015 -0.054 0.043 -0.046 0.013 -0.073 -0.056 -0.006 -0.076 0.014 a0.127 0.127 0 0 1 -0.117 0.039 0.206 0.206 0 0 0 -0.125 -0.021 0.1 0.1 0 0 1 -0.048 -0.008 0.04 0.04 0 0 1 0 -0.03 l0.067 -0.141 c0.014 -0.023 0.029 -0.048 0 -0.069 a0.054 0.054 0 0 0 -0.081 0.019 l-0.014 0.024 a0.424 0.424 0 0 0 -0.079 0.182 1.227 1.227 0 0 0 0.019 0.218 c0.008 0.041 0 0.06 -0.047 0.052 -0.027 0 -0.059 -0.007 -0.067 0.025 s0.027 0.043 0.054 0.052 0.04 0.011 0.039 0.032 -0.03 0.024 -0.048 0.026 c-0.045 0 -0.074 0.021 -0.079 0.07 a0.042 0.042 0 0 1 -0.039 0.042 0.049 0.049 0 0 1 -0.058 -0.029 0.128 0.128 0 0 0 -0.1 -0.084 c-0.02 -0.006 -0.041 -0.016 -0.042 -0.041 s0.022 -0.033 0.043 -0.036 c0.055 -0.008 0.054 -0.033 0.032 -0.076 s-0.014 -0.088 0.03 -0.1 a0.314 0.314 0 0 0 0.221 -0.308 c-0.01 -0.038 -0.028 -0.065 -0.072 -0.064 -0.045 0.054 -0.02 0.127 -0.051 0.186 s-0.042 0.078 -0.088 0.014 a0.3 0.3 0 0 0 -0.257 -0.126 c-0.094 0 -0.127 0.053 -0.092 0.141 a0.25 0.25 0 0 0 0.143 0.137 c0.076 0.033 0.086 0.081 0.028 0.146 s-0.053 0.126 0.018 0.17 a0.417 0.417 0 0 1 0.119 0.11 c0.04 0.054 0.031 0.094 -0.035 0.111 a0.125 0.125 0 0 1 -0.136 -0.038 c-0.076 -0.1 -0.207 -0.169 -0.216 -0.322 0 -0.037 -0.009 -0.11 -0.066 -0.1 s-0.017 0.074 -0.011 0.113 c0.015 0.094 0.046 0.188 -0.071 0.245 -0.03 0.014 -0.027 0.056 0 0.057 0.092 0 0.073 0.067 0.08 0.121 a0.681 0.681 0 0 0 0.02 0.1 c0.011 0.034 0.027 0.066 0.073 0.047 s0.04 0.016 0.038 0.041 c0 0.068 -0.011 0.136 -0.018 0.2 a0.134 0.134 0 0 0 0.056 0.137 0.313 0.313 0 0 0 0.4 -0.063 0.748 0.748 0 0 0 0.076 -0.162 c0.013 -0.028 0.011 -0.077 0.04 -0.081 s0.036 0.049 0.056 0.074 0.018 0.026 0.028 0.037 c0.035 0.041 0.066 0.036 0.094 -0.008 l0.027 -0.047 a0.537 0.537 0 0 0 0.061 -0.253 0.449 0.449 0 0 1 0.026 -0.113 l0.011 -0.028 c0.013 -0.02 0.036 -0.021 0.066 -0.009 0.06 0.025 0.021 0.066 0.016 0.1 v0.126 a0.03 0.03 0 0 1 0.01 0.032 l0.007 0.031 a0.059 0.059 0 0 1 0.016 0.046 c0.021 0.018 0.038 0.05 0.072 0.029 s0.014 -0.046 0.009 -0.071 a0.8 0.8 0 0 1 -0.017 -0.085 c-0.028 -0.191 0.023 -0.277 0.2 -0.335 0.018 -0.006 0.037 -0.012 0.036 -0.035 a0.039 0.039 0 0 0 -0.036 -0.035 0.159 0.159 0 0 0 -0.157 0.045z M5.557 11.147 a0.024 0.024 0 0 1 0 0.035 c-0.036 0.032 -0.06 0 -0.1 -0.024 0.043 -0.019 0.067 -0.042 0.1 -0.011z M4.868 11.031 a0.062 0.062 0 0 1 -0.052 -0.06 c0 -0.025 0.023 -0.024 0.041 -0.022 s0.049 0.005 0.047 0.04 c-0.004 0.018 -0.01 0.046 -0.036 0.042z M4.684 11.75 a0.231 0.231 0 0 1 -0.01 -0.123 c0 -0.017 -0.009 -0.049 0.025 -0.046 s0.029 0.029 0.028 0.05 a0.137 0.137 0 0 1 -0.043 0.119z M5.394 11.95 a0.147 0.147 0 0 1 -0.027 -0.109 c0 -0.017 0.01 -0.03 0.029 -0.029 s0.026 0.016 0.024 0.032 a0.162 0.162 0 0 1 -0.026 0.104z
    path(
        fill = SolidColor(Color(0xFF806600)),
    ) {
        // M 5.792 11.477
        moveTo(x = 5.792f, y = 11.477f)
        // a 0.141 0.141 0 0 1 -0.179 0.056
        arcToRelative(
            a = 0.141f,
            b = 0.141f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.179f,
            dy1 = 0.056f,
        )
        // c -0.01 -0.01 -0.065 -0.066 -0.084 -0.027
        curveToRelative(
            dx1 = -0.01f,
            dy1 = -0.01f,
            dx2 = -0.065f,
            dy2 = -0.066f,
            dx3 = -0.084f,
            dy3 = -0.027f,
        )
        // l -0.027 0.053
        lineToRelative(dx = -0.027f, dy = 0.053f)
        // c -0.035 0.062 -0.118 0.183 -0.223 0.176
        curveToRelative(
            dx1 = -0.035f,
            dy1 = 0.062f,
            dx2 = -0.118f,
            dy2 = 0.183f,
            dx3 = -0.223f,
            dy3 = 0.176f,
        )
        // a 0.089 0.089 0 0 1 -0.079 -0.065
        arcToRelative(
            a = 0.089f,
            b = 0.089f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.079f,
            dy1 = -0.065f,
        )
        // c -0.016 -0.039 0.01 -0.057 0.04 -0.071
        curveToRelative(
            dx1 = -0.016f,
            dy1 = -0.039f,
            dx2 = 0.01f,
            dy2 = -0.057f,
            dx3 = 0.04f,
            dy3 = -0.071f,
        )
        // a 0.069 0.069 0 0 0 0.025 -0.023
        arcToRelative(
            a = 0.069f,
            b = 0.069f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.025f,
            dy1 = -0.023f,
        )
        // l 0.013 -0.015
        lineToRelative(dx = 0.013f, dy = -0.015f)
        // a 0.238 0.238 0 0 1 0.135 -0.079
        arcToRelative(
            a = 0.238f,
            b = 0.238f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.135f,
            dy1 = -0.079f,
        )
        // L 5.4 11.482
        lineTo(x = 5.4f, y = 11.482f)
        // c 0.048 0 0.06 -0.04 0.066 -0.077
        curveToRelative(
            dx1 = 0.048f,
            dy1 = 0.0f,
            dx2 = 0.06f,
            dy2 = -0.04f,
            dx3 = 0.066f,
            dy3 = -0.077f,
        )
        // s 0 -0.081 0 -0.122
        reflectiveCurveToRelative(
            dx1 = 0.0f,
            dy1 = -0.081f,
            dx2 = 0.0f,
            dy2 = -0.122f,
        )
        // a 0.377 0.377 0 0 0 0.215 0.034
        arcToRelative(
            a = 0.377f,
            b = 0.377f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.215f,
            dy1 = 0.034f,
        )
        // a 0.424 0.424 0 0 0 0.234 -0.1
        arcToRelative(
            a = 0.424f,
            b = 0.424f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.234f,
            dy1 = -0.1f,
        )
        // c 0.027 -0.021 0.019 -0.037 -0.008 -0.048
        curveToRelative(
            dx1 = 0.027f,
            dy1 = -0.021f,
            dx2 = 0.019f,
            dy2 = -0.037f,
            dx3 = -0.008f,
            dy3 = -0.048f,
        )
        // l -0.007 -0.006
        lineToRelative(dx = -0.007f, dy = -0.006f)
        // l -0.032 -0.01
        lineToRelative(dx = -0.032f, dy = -0.01f)
        // c -0.033 0 -0.068 0.011 -0.092 -0.022
        curveToRelative(
            dx1 = -0.033f,
            dy1 = 0.0f,
            dx2 = -0.068f,
            dy2 = 0.011f,
            dx3 = -0.092f,
            dy3 = -0.022f,
        )
        // s 0 -0.039 0.015 -0.054
        reflectiveCurveToRelative(
            dx1 = 0.0f,
            dy1 = -0.039f,
            dx2 = 0.015f,
            dy2 = -0.054f,
        )
        // s 0.043 -0.046 0.013 -0.073
        reflectiveCurveToRelative(
            dx1 = 0.043f,
            dy1 = -0.046f,
            dx2 = 0.013f,
            dy2 = -0.073f,
        )
        // s -0.056 -0.006 -0.076 0.014
        reflectiveCurveToRelative(
            dx1 = -0.056f,
            dy1 = -0.006f,
            dx2 = -0.076f,
            dy2 = 0.014f,
        )
        // a 0.127 0.127 0 0 1 -0.117 0.039
        arcToRelative(
            a = 0.127f,
            b = 0.127f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.117f,
            dy1 = 0.039f,
        )
        // a 0.206 0.206 0 0 0 -0.125 -0.021
        arcToRelative(
            a = 0.206f,
            b = 0.206f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.125f,
            dy1 = -0.021f,
        )
        // a 0.1 0.1 0 0 1 -0.048 -0.008
        arcToRelative(
            a = 0.1f,
            b = 0.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.048f,
            dy1 = -0.008f,
        )
        // a 0.04 0.04 0 0 1 0 -0.03
        arcToRelative(
            a = 0.04f,
            b = 0.04f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -0.03f,
        )
        // l 0.067 -0.141
        lineToRelative(dx = 0.067f, dy = -0.141f)
        // c 0.014 -0.023 0.029 -0.048 0 -0.069
        curveToRelative(
            dx1 = 0.014f,
            dy1 = -0.023f,
            dx2 = 0.029f,
            dy2 = -0.048f,
            dx3 = 0.0f,
            dy3 = -0.069f,
        )
        // a 0.054 0.054 0 0 0 -0.081 0.019
        arcToRelative(
            a = 0.054f,
            b = 0.054f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.081f,
            dy1 = 0.019f,
        )
        // l -0.014 0.024
        lineToRelative(dx = -0.014f, dy = 0.024f)
        // a 0.424 0.424 0 0 0 -0.079 0.182
        arcToRelative(
            a = 0.424f,
            b = 0.424f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.079f,
            dy1 = 0.182f,
        )
        // a 1.227 1.227 0 0 0 0.019 0.218
        arcToRelative(
            a = 1.227f,
            b = 1.227f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.019f,
            dy1 = 0.218f,
        )
        // c 0.008 0.041 0 0.06 -0.047 0.052
        curveToRelative(
            dx1 = 0.008f,
            dy1 = 0.041f,
            dx2 = 0.0f,
            dy2 = 0.06f,
            dx3 = -0.047f,
            dy3 = 0.052f,
        )
        // c -0.027 0 -0.059 -0.007 -0.067 0.025
        curveToRelative(
            dx1 = -0.027f,
            dy1 = 0.0f,
            dx2 = -0.059f,
            dy2 = -0.007f,
            dx3 = -0.067f,
            dy3 = 0.025f,
        )
        // s 0.027 0.043 0.054 0.052
        reflectiveCurveToRelative(
            dx1 = 0.027f,
            dy1 = 0.043f,
            dx2 = 0.054f,
            dy2 = 0.052f,
        )
        // s 0.04 0.011 0.039 0.032
        reflectiveCurveToRelative(
            dx1 = 0.04f,
            dy1 = 0.011f,
            dx2 = 0.039f,
            dy2 = 0.032f,
        )
        // s -0.03 0.024 -0.048 0.026
        reflectiveCurveToRelative(
            dx1 = -0.03f,
            dy1 = 0.024f,
            dx2 = -0.048f,
            dy2 = 0.026f,
        )
        // c -0.045 0 -0.074 0.021 -0.079 0.07
        curveToRelative(
            dx1 = -0.045f,
            dy1 = 0.0f,
            dx2 = -0.074f,
            dy2 = 0.021f,
            dx3 = -0.079f,
            dy3 = 0.07f,
        )
        // a 0.042 0.042 0 0 1 -0.039 0.042
        arcToRelative(
            a = 0.042f,
            b = 0.042f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.039f,
            dy1 = 0.042f,
        )
        // a 0.049 0.049 0 0 1 -0.058 -0.029
        arcToRelative(
            a = 0.049f,
            b = 0.049f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.058f,
            dy1 = -0.029f,
        )
        // a 0.128 0.128 0 0 0 -0.1 -0.084
        arcToRelative(
            a = 0.128f,
            b = 0.128f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.1f,
            dy1 = -0.084f,
        )
        // c -0.02 -0.006 -0.041 -0.016 -0.042 -0.041
        curveToRelative(
            dx1 = -0.02f,
            dy1 = -0.006f,
            dx2 = -0.041f,
            dy2 = -0.016f,
            dx3 = -0.042f,
            dy3 = -0.041f,
        )
        // s 0.022 -0.033 0.043 -0.036
        reflectiveCurveToRelative(
            dx1 = 0.022f,
            dy1 = -0.033f,
            dx2 = 0.043f,
            dy2 = -0.036f,
        )
        // c 0.055 -0.008 0.054 -0.033 0.032 -0.076
        curveToRelative(
            dx1 = 0.055f,
            dy1 = -0.008f,
            dx2 = 0.054f,
            dy2 = -0.033f,
            dx3 = 0.032f,
            dy3 = -0.076f,
        )
        // s -0.014 -0.088 0.03 -0.1
        reflectiveCurveToRelative(
            dx1 = -0.014f,
            dy1 = -0.088f,
            dx2 = 0.03f,
            dy2 = -0.1f,
        )
        // a 0.314 0.314 0 0 0 0.221 -0.308
        arcToRelative(
            a = 0.314f,
            b = 0.314f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.221f,
            dy1 = -0.308f,
        )
        // c -0.01 -0.038 -0.028 -0.065 -0.072 -0.064
        curveToRelative(
            dx1 = -0.01f,
            dy1 = -0.038f,
            dx2 = -0.028f,
            dy2 = -0.065f,
            dx3 = -0.072f,
            dy3 = -0.064f,
        )
        // c -0.045 0.054 -0.02 0.127 -0.051 0.186
        curveToRelative(
            dx1 = -0.045f,
            dy1 = 0.054f,
            dx2 = -0.02f,
            dy2 = 0.127f,
            dx3 = -0.051f,
            dy3 = 0.186f,
        )
        // s -0.042 0.078 -0.088 0.014
        reflectiveCurveToRelative(
            dx1 = -0.042f,
            dy1 = 0.078f,
            dx2 = -0.088f,
            dy2 = 0.014f,
        )
        // a 0.3 0.3 0 0 0 -0.257 -0.126
        arcToRelative(
            a = 0.3f,
            b = 0.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.257f,
            dy1 = -0.126f,
        )
        // c -0.094 0 -0.127 0.053 -0.092 0.141
        curveToRelative(
            dx1 = -0.094f,
            dy1 = 0.0f,
            dx2 = -0.127f,
            dy2 = 0.053f,
            dx3 = -0.092f,
            dy3 = 0.141f,
        )
        // a 0.25 0.25 0 0 0 0.143 0.137
        arcToRelative(
            a = 0.25f,
            b = 0.25f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.143f,
            dy1 = 0.137f,
        )
        // c 0.076 0.033 0.086 0.081 0.028 0.146
        curveToRelative(
            dx1 = 0.076f,
            dy1 = 0.033f,
            dx2 = 0.086f,
            dy2 = 0.081f,
            dx3 = 0.028f,
            dy3 = 0.146f,
        )
        // s -0.053 0.126 0.018 0.17
        reflectiveCurveToRelative(
            dx1 = -0.053f,
            dy1 = 0.126f,
            dx2 = 0.018f,
            dy2 = 0.17f,
        )
        // a 0.417 0.417 0 0 1 0.119 0.11
        arcToRelative(
            a = 0.417f,
            b = 0.417f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.119f,
            dy1 = 0.11f,
        )
        // c 0.04 0.054 0.031 0.094 -0.035 0.111
        curveToRelative(
            dx1 = 0.04f,
            dy1 = 0.054f,
            dx2 = 0.031f,
            dy2 = 0.094f,
            dx3 = -0.035f,
            dy3 = 0.111f,
        )
        // a 0.125 0.125 0 0 1 -0.136 -0.038
        arcToRelative(
            a = 0.125f,
            b = 0.125f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.136f,
            dy1 = -0.038f,
        )
        // c -0.076 -0.1 -0.207 -0.169 -0.216 -0.322
        curveToRelative(
            dx1 = -0.076f,
            dy1 = -0.1f,
            dx2 = -0.207f,
            dy2 = -0.169f,
            dx3 = -0.216f,
            dy3 = -0.322f,
        )
        // c 0 -0.037 -0.009 -0.11 -0.066 -0.1
        curveToRelative(
            dx1 = 0.0f,
            dy1 = -0.037f,
            dx2 = -0.009f,
            dy2 = -0.11f,
            dx3 = -0.066f,
            dy3 = -0.1f,
        )
        // s -0.017 0.074 -0.011 0.113
        reflectiveCurveToRelative(
            dx1 = -0.017f,
            dy1 = 0.074f,
            dx2 = -0.011f,
            dy2 = 0.113f,
        )
        // c 0.015 0.094 0.046 0.188 -0.071 0.245
        curveToRelative(
            dx1 = 0.015f,
            dy1 = 0.094f,
            dx2 = 0.046f,
            dy2 = 0.188f,
            dx3 = -0.071f,
            dy3 = 0.245f,
        )
        // c -0.03 0.014 -0.027 0.056 0 0.057
        curveToRelative(
            dx1 = -0.03f,
            dy1 = 0.014f,
            dx2 = -0.027f,
            dy2 = 0.056f,
            dx3 = 0.0f,
            dy3 = 0.057f,
        )
        // c 0.092 0 0.073 0.067 0.08 0.121
        curveToRelative(
            dx1 = 0.092f,
            dy1 = 0.0f,
            dx2 = 0.073f,
            dy2 = 0.067f,
            dx3 = 0.08f,
            dy3 = 0.121f,
        )
        // a 0.681 0.681 0 0 0 0.02 0.1
        arcToRelative(
            a = 0.681f,
            b = 0.681f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.02f,
            dy1 = 0.1f,
        )
        // c 0.011 0.034 0.027 0.066 0.073 0.047
        curveToRelative(
            dx1 = 0.011f,
            dy1 = 0.034f,
            dx2 = 0.027f,
            dy2 = 0.066f,
            dx3 = 0.073f,
            dy3 = 0.047f,
        )
        // s 0.04 0.016 0.038 0.041
        reflectiveCurveToRelative(
            dx1 = 0.04f,
            dy1 = 0.016f,
            dx2 = 0.038f,
            dy2 = 0.041f,
        )
        // c 0 0.068 -0.011 0.136 -0.018 0.2
        curveToRelative(
            dx1 = 0.0f,
            dy1 = 0.068f,
            dx2 = -0.011f,
            dy2 = 0.136f,
            dx3 = -0.018f,
            dy3 = 0.2f,
        )
        // a 0.134 0.134 0 0 0 0.056 0.137
        arcToRelative(
            a = 0.134f,
            b = 0.134f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.056f,
            dy1 = 0.137f,
        )
        // a 0.313 0.313 0 0 0 0.4 -0.063
        arcToRelative(
            a = 0.313f,
            b = 0.313f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.4f,
            dy1 = -0.063f,
        )
        // a 0.748 0.748 0 0 0 0.076 -0.162
        arcToRelative(
            a = 0.748f,
            b = 0.748f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.076f,
            dy1 = -0.162f,
        )
        // c 0.013 -0.028 0.011 -0.077 0.04 -0.081
        curveToRelative(
            dx1 = 0.013f,
            dy1 = -0.028f,
            dx2 = 0.011f,
            dy2 = -0.077f,
            dx3 = 0.04f,
            dy3 = -0.081f,
        )
        // s 0.036 0.049 0.056 0.074
        reflectiveCurveToRelative(
            dx1 = 0.036f,
            dy1 = 0.049f,
            dx2 = 0.056f,
            dy2 = 0.074f,
        )
        // s 0.018 0.026 0.028 0.037
        reflectiveCurveToRelative(
            dx1 = 0.018f,
            dy1 = 0.026f,
            dx2 = 0.028f,
            dy2 = 0.037f,
        )
        // c 0.035 0.041 0.066 0.036 0.094 -0.008
        curveToRelative(
            dx1 = 0.035f,
            dy1 = 0.041f,
            dx2 = 0.066f,
            dy2 = 0.036f,
            dx3 = 0.094f,
            dy3 = -0.008f,
        )
        // l 0.027 -0.047
        lineToRelative(dx = 0.027f, dy = -0.047f)
        // a 0.537 0.537 0 0 0 0.061 -0.253
        arcToRelative(
            a = 0.537f,
            b = 0.537f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.061f,
            dy1 = -0.253f,
        )
        // a 0.449 0.449 0 0 1 0.026 -0.113
        arcToRelative(
            a = 0.449f,
            b = 0.449f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.026f,
            dy1 = -0.113f,
        )
        // l 0.011 -0.028
        lineToRelative(dx = 0.011f, dy = -0.028f)
        // c 0.013 -0.02 0.036 -0.021 0.066 -0.009
        curveToRelative(
            dx1 = 0.013f,
            dy1 = -0.02f,
            dx2 = 0.036f,
            dy2 = -0.021f,
            dx3 = 0.066f,
            dy3 = -0.009f,
        )
        // c 0.06 0.025 0.021 0.066 0.016 0.1
        curveToRelative(
            dx1 = 0.06f,
            dy1 = 0.025f,
            dx2 = 0.021f,
            dy2 = 0.066f,
            dx3 = 0.016f,
            dy3 = 0.1f,
        )
        // v 0.126
        verticalLineToRelative(dy = 0.126f)
        // a 0.03 0.03 0 0 1 0.01 0.032
        arcToRelative(
            a = 0.03f,
            b = 0.03f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.01f,
            dy1 = 0.032f,
        )
        // l 0.007 0.031
        lineToRelative(dx = 0.007f, dy = 0.031f)
        // a 0.059 0.059 0 0 1 0.016 0.046
        arcToRelative(
            a = 0.059f,
            b = 0.059f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.016f,
            dy1 = 0.046f,
        )
        // c 0.021 0.018 0.038 0.05 0.072 0.029
        curveToRelative(
            dx1 = 0.021f,
            dy1 = 0.018f,
            dx2 = 0.038f,
            dy2 = 0.05f,
            dx3 = 0.072f,
            dy3 = 0.029f,
        )
        // s 0.014 -0.046 0.009 -0.071
        reflectiveCurveToRelative(
            dx1 = 0.014f,
            dy1 = -0.046f,
            dx2 = 0.009f,
            dy2 = -0.071f,
        )
        // a 0.8 0.8 0 0 1 -0.017 -0.085
        arcToRelative(
            a = 0.8f,
            b = 0.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.017f,
            dy1 = -0.085f,
        )
        // c -0.028 -0.191 0.023 -0.277 0.2 -0.335
        curveToRelative(
            dx1 = -0.028f,
            dy1 = -0.191f,
            dx2 = 0.023f,
            dy2 = -0.277f,
            dx3 = 0.2f,
            dy3 = -0.335f,
        )
        // c 0.018 -0.006 0.037 -0.012 0.036 -0.035
        curveToRelative(
            dx1 = 0.018f,
            dy1 = -0.006f,
            dx2 = 0.037f,
            dy2 = -0.012f,
            dx3 = 0.036f,
            dy3 = -0.035f,
        )
        // a 0.039 0.039 0 0 0 -0.036 -0.035
        arcToRelative(
            a = 0.039f,
            b = 0.039f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.036f,
            dy1 = -0.035f,
        )
        // a 0.159 0.159 0 0 0 -0.157 0.045z
        arcToRelative(
            a = 0.159f,
            b = 0.159f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.157f,
            dy1 = 0.045f,
        )
        close()
        // M 5.557 11.147
        moveTo(x = 5.557f, y = 11.147f)
        // a 0.024 0.024 0 0 1 0 0.035
        arcToRelative(
            a = 0.024f,
            b = 0.024f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 0.035f,
        )
        // c -0.036 0.032 -0.06 0 -0.1 -0.024
        curveToRelative(
            dx1 = -0.036f,
            dy1 = 0.032f,
            dx2 = -0.06f,
            dy2 = 0.0f,
            dx3 = -0.1f,
            dy3 = -0.024f,
        )
        // c 0.043 -0.019 0.067 -0.042 0.1 -0.011z
        curveToRelative(
            dx1 = 0.043f,
            dy1 = -0.019f,
            dx2 = 0.067f,
            dy2 = -0.042f,
            dx3 = 0.1f,
            dy3 = -0.011f,
        )
        close()
        // M 4.868 11.031
        moveTo(x = 4.868f, y = 11.031f)
        // a 0.062 0.062 0 0 1 -0.052 -0.06
        arcToRelative(
            a = 0.062f,
            b = 0.062f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.052f,
            dy1 = -0.06f,
        )
        // c 0 -0.025 0.023 -0.024 0.041 -0.022
        curveToRelative(
            dx1 = 0.0f,
            dy1 = -0.025f,
            dx2 = 0.023f,
            dy2 = -0.024f,
            dx3 = 0.041f,
            dy3 = -0.022f,
        )
        // s 0.049 0.005 0.047 0.04
        reflectiveCurveToRelative(
            dx1 = 0.049f,
            dy1 = 0.005f,
            dx2 = 0.047f,
            dy2 = 0.04f,
        )
        // c -0.004 0.018 -0.01 0.046 -0.036 0.042z
        curveToRelative(
            dx1 = -0.004f,
            dy1 = 0.018f,
            dx2 = -0.01f,
            dy2 = 0.046f,
            dx3 = -0.036f,
            dy3 = 0.042f,
        )
        close()
        // M 4.684 11.75
        moveTo(x = 4.684f, y = 11.75f)
        // a 0.231 0.231 0 0 1 -0.01 -0.123
        arcToRelative(
            a = 0.231f,
            b = 0.231f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.01f,
            dy1 = -0.123f,
        )
        // c 0 -0.017 -0.009 -0.049 0.025 -0.046
        curveToRelative(
            dx1 = 0.0f,
            dy1 = -0.017f,
            dx2 = -0.009f,
            dy2 = -0.049f,
            dx3 = 0.025f,
            dy3 = -0.046f,
        )
        // s 0.029 0.029 0.028 0.05
        reflectiveCurveToRelative(
            dx1 = 0.029f,
            dy1 = 0.029f,
            dx2 = 0.028f,
            dy2 = 0.05f,
        )
        // a 0.137 0.137 0 0 1 -0.043 0.119z
        arcToRelative(
            a = 0.137f,
            b = 0.137f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.043f,
            dy1 = 0.119f,
        )
        close()
        // M 5.394 11.95
        moveTo(x = 5.394f, y = 11.95f)
        // a 0.147 0.147 0 0 1 -0.027 -0.109
        arcToRelative(
            a = 0.147f,
            b = 0.147f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.027f,
            dy1 = -0.109f,
        )
        // c 0 -0.017 0.01 -0.03 0.029 -0.029
        curveToRelative(
            dx1 = 0.0f,
            dy1 = -0.017f,
            dx2 = 0.01f,
            dy2 = -0.03f,
            dx3 = 0.029f,
            dy3 = -0.029f,
        )
        // s 0.026 0.016 0.024 0.032
        reflectiveCurveToRelative(
            dx1 = 0.026f,
            dy1 = 0.016f,
            dx2 = 0.024f,
            dy2 = 0.032f,
        )
        // a 0.162 0.162 0 0 1 -0.026 0.104z
        arcToRelative(
            a = 0.162f,
            b = 0.162f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.026f,
            dy1 = 0.104f,
        )
        close()
    }
    // M6.5 11.986 a0.113 0.113 0 0 1 -0.019 -0.062 c-0.02 -0.036 -0.043 -0.071 -0.061 -0.108 s-0.056 -0.042 -0.034 -0.068 c0 0 0.062 -0.112 0 -0.177 -0.03 -0.033 -0.041 -0.048 -0.031 -0.084 a0.411 0.411 0 0 0 0.021 -0.17 0.2 0.2 0 0 0 -0.112 -0.177 0.075 0.075 0 0 1 -0.051 -0.082 0.233 0.233 0 0 0 -0.115 -0.216 c-0.058 -0.031 -0.054 -0.094 -0.078 -0.143 l-0.014 -0.015 a0.282 0.282 0 0 0 -0.12 -0.053 0.071 0.071 0 0 1 -0.058 -0.037 c-0.05 -0.089 -0.143 -0.052 -0.214 -0.077 s-0.132 -0.094 -0.222 -0.065 a0.133 0.133 0 0 1 -0.107 0 0.163 0.163 0 0 0 -0.165 0.01 0.161 0.161 0 0 1 -0.12 0.024 0.11 0.11 0 0 0 -0.069 0.007 0.874 0.874 0 0 0 -0.343 0.2 1.19 1.19 0 0 1 -0.19 0.192 0.238 0.238 0 0 0 -0.057 0.247 0.314 0.314 0 0 1 -0.028 0.227 0.307 0.307 0 0 1 -0.082 0.1 0.87 0.87 0 0 0 -0.2 0.239 0.829 0.829 0 0 0 -0.089 0.158 0.416 0.416 0 0 0 -0.012 0.237 0.138 0.138 0 0 1 0 0.1 v0.048 a0.98 0.98 0 0 1 0.061 0.379 s-0.041 0.149 0.046 0.137 a0.174 0.174 0 0 0 0.13 -0.08 c0.017 -0.028 0.041 -0.008 0.05 0.02 s0.021 0.069 0.034 0.1 0.041 0.072 0.076 0.073 c0.1 0 0.169 0.089 0.262 0.112 a0.87 0.87 0 0 0 0.311 0.085 0.672 0.672 0 0 0 0.412 -0.088 v0.007 c0 0.062 0.284 0 0.4 -0.06 a0.36 0.36 0 0 0 0.163 -0.2 0.237 0.237 0 0 1 0.233 -0.181 0.347 0.347 0 0 0 0.268 -0.159 0.2 0.2 0 0 0 0.024 -0.086 v-0.127 c-0.012 -0.028 -0.039 -0.058 0.014 -0.074 h0.063 c0.044 -0.033 0.015 -0.076 0.023 -0.113z M4.647 12.9 c-0.025 0 -0.058 0.012 -0.07 -0.018 s0.018 -0.041 0.032 -0.057 a0.709 0.709 0 0 0 0.1 -0.148 c0.012 -0.026 0.025 -0.058 -0.009 -0.076 s-0.046 0.014 -0.06 0.035 a0.83 0.83 0 0 1 -0.1 0.132 0.14 0.14 0 0 1 -0.128 0.042 c-0.081 -0.013 -0.1 -0.05 -0.07 -0.126 0.02 -0.045 0.044 -0.089 0.063 -0.134 0.025 -0.061 0 -0.093 -0.063 -0.083 a0.443 0.443 0 0 0 -0.209 0.1 c-0.013 0.01 -0.025 0.031 -0.046 0.02 s-0.009 -0.033 -0.012 -0.046 a0.51 0.51 0 0 1 0.289 -0.424 c0.049 -0.029 0.056 0.006 0.065 0.042 a0.467 0.467 0 0 0 0.25 0.332 0.654 0.654 0 0 0 0.231 0.034 c0.075 0.008 0.087 0.023 0.051 0.086 a0.523 0.523 0 0 1 -0.251 0.269 0.234 0.234 0 0 1 -0.063 0.02 m0.2 0.077 c-0.018 0 -0.041 0 -0.048 -0.02 s0.015 -0.031 0.029 -0.041 a0.589 0.589 0 0 0 0.238 -0.319 0.173 0.173 0 0 1 0.117 -0.112 0.519 0.519 0 0 0 0.162 -0.079 c0.056 -0.041 0.073 -0.018 0.072 0.04 v0.102 c0.003 0.413 -0.296 0.471 -0.57 0.431z M6.373 12 c-0.031 0.015 -0.037 -0.017 -0.05 -0.035 a0.459 0.459 0 0 0 -0.114 -0.134 c-0.027 -0.017 -0.056 -0.056 -0.087 -0.015 s0.009 0.056 0.03 0.079 a0.511 0.511 0 0 1 0.159 0.34 0.218 0.218 0 0 1 -0.149 0.224 c-0.053 0.018 -0.077 0.009 -0.061 -0.052 a0.491 0.491 0 0 0 0 -0.2 c0 -0.036 -0.017 -0.075 -0.057 -0.07 s-0.037 0.046 -0.032 0.081 a0.327 0.327 0 0 1 -0.057 0.274 c-0.032 0.036 -0.06 0.057 -0.074 -0.013 a0.481 0.481 0 0 0 -0.035 -0.1 c-0.015 -0.03 -0.033 -0.07 -0.074 -0.052 s-0.025 0.059 -0.008 0.088 a0.429 0.429 0 0 1 0.036 0.119 0.281 0.281 0 0 1 -0.062 0.25 0.377 0.377 0 0 1 -0.348 0.132 h-0.015 a0.445 0.445 0 0 0 0.118 -0.227 0.153 0.153 0 0 1 0.012 -0.079 l0.006 -0.094 a0.174 0.174 0 0 1 0 -0.1 0.251 0.251 0 0 1 0.046 -0.233 s0.059 -0.043 0.054 -0.1 -0.072 -0.084 -0.107 -0.014 a0.58 0.58 0 0 1 -0.433 0.351 c-0.319 0.072 -0.538 -0.023 -0.575 -0.392 a1.4 1.4 0 0 1 0 -0.259 c0 -0.026 0.008 -0.057 -0.026 -0.064 s-0.045 0.027 -0.052 0.055 a0.694 0.694 0 0 0 -0.013 0.187 0.068 0.068 0 0 1 -0.044 0.074 0.675 0.675 0 0 0 -0.285 0.227 c-0.008 0.01 -0.016 0.024 -0.031 0.02 s-0.021 -0.027 -0.022 -0.045 a0.4 0.4 0 0 1 0.13 -0.3 c0.022 -0.024 0.087 -0.043 0.042 -0.089 s-0.077 0 -0.109 0.03 -0.035 0.045 -0.076 0.059 a0.258 0.258 0 0 1 0.087 -0.173 0.418 0.418 0 0 1 0.109 -0.076 c0.085 -0.048 0.086 -0.064 0.009 -0.121 a0.092 0.092 0 0 1 0.069 -0.03 0.07 0.07 0 0 0 0.069 -0.063 0.255 0.255 0 0 1 0.08 -0.15 0.08 0.08 0 0 0 0.015 -0.111 0.212 0.212 0 0 1 -0.025 -0.191 0.189 0.189 0 0 1 0.039 0.137 c0 0.029 0 0.063 0.044 0.059 s0.039 -0.033 0.037 -0.06 c0 -0.07 0 -0.142 -0.06 -0.2 -0.04 -0.037 0 -0.054 0.024 -0.056 0.072 0 0.109 -0.031 0.107 -0.109 s0.089 -0.045 0.111 -0.093 0.051 -0.085 0.114 -0.057 c0.032 0.014 0.056 0 0.072 -0.031 0.034 -0.06 0.076 -0.068 0.126 -0.02 s0.063 0.016 0.09 -0.017 c0.07 -0.084 0.075 -0.084 0.152 0 0.029 0.031 0.053 0.02 0.081 0 0.108 -0.081 0.156 -0.06 0.178 0.077 a0.082 0.082 0 0 0 0.071 0.013 0.041 0.041 0 0 1 0.031 -0.031 c0.052 -0.042 0.095 -0.044 0.115 0.03 a0.064 0.064 0 0 0 0.078 0.055 c0.092 0 0.111 0.012 0.128 0.106 a0.089 0.089 0 0 0 0.058 0.082 c0.1 0.035 0.121 0.093 0.1 0.2 s-0.021 0.1 0.078 0.108 c0.076 0.015 0.093 0.067 0.088 0.135 a0.1 0.1 0 0 1 0 0.076 0.029 0.029 0 0 1 -0.006 0.032 0.189 0.189 0 0 1 -0.044 0.1 0.06 0.06 0 0 0 0 0.077 c0.034 0.014 0.076 0 0.114 0.029 -0.041 0.036 -0.089 0.019 -0.131 0.027 -0.028 0.039 -0.007 0.061 0.026 0.081 a0.283 0.283 0 0 1 0.135 0.175 c-0.001 0.025 0.021 0.05 -0.006 0.067z
    path(
        fill = SolidColor(Color(0xFF806600)),
    ) {
        // M 6.5 11.986
        moveTo(x = 6.5f, y = 11.986f)
        // a 0.113 0.113 0 0 1 -0.019 -0.062
        arcToRelative(
            a = 0.113f,
            b = 0.113f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.019f,
            dy1 = -0.062f,
        )
        // c -0.02 -0.036 -0.043 -0.071 -0.061 -0.108
        curveToRelative(
            dx1 = -0.02f,
            dy1 = -0.036f,
            dx2 = -0.043f,
            dy2 = -0.071f,
            dx3 = -0.061f,
            dy3 = -0.108f,
        )
        // s -0.056 -0.042 -0.034 -0.068
        reflectiveCurveToRelative(
            dx1 = -0.056f,
            dy1 = -0.042f,
            dx2 = -0.034f,
            dy2 = -0.068f,
        )
        // c 0 0 0.062 -0.112 0 -0.177
        curveToRelative(
            dx1 = 0.0f,
            dy1 = 0.0f,
            dx2 = 0.062f,
            dy2 = -0.112f,
            dx3 = 0.0f,
            dy3 = -0.177f,
        )
        // c -0.03 -0.033 -0.041 -0.048 -0.031 -0.084
        curveToRelative(
            dx1 = -0.03f,
            dy1 = -0.033f,
            dx2 = -0.041f,
            dy2 = -0.048f,
            dx3 = -0.031f,
            dy3 = -0.084f,
        )
        // a 0.411 0.411 0 0 0 0.021 -0.17
        arcToRelative(
            a = 0.411f,
            b = 0.411f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.021f,
            dy1 = -0.17f,
        )
        // a 0.2 0.2 0 0 0 -0.112 -0.177
        arcToRelative(
            a = 0.2f,
            b = 0.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.112f,
            dy1 = -0.177f,
        )
        // a 0.075 0.075 0 0 1 -0.051 -0.082
        arcToRelative(
            a = 0.075f,
            b = 0.075f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.051f,
            dy1 = -0.082f,
        )
        // a 0.233 0.233 0 0 0 -0.115 -0.216
        arcToRelative(
            a = 0.233f,
            b = 0.233f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.115f,
            dy1 = -0.216f,
        )
        // c -0.058 -0.031 -0.054 -0.094 -0.078 -0.143
        curveToRelative(
            dx1 = -0.058f,
            dy1 = -0.031f,
            dx2 = -0.054f,
            dy2 = -0.094f,
            dx3 = -0.078f,
            dy3 = -0.143f,
        )
        // l -0.014 -0.015
        lineToRelative(dx = -0.014f, dy = -0.015f)
        // a 0.282 0.282 0 0 0 -0.12 -0.053
        arcToRelative(
            a = 0.282f,
            b = 0.282f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.12f,
            dy1 = -0.053f,
        )
        // a 0.071 0.071 0 0 1 -0.058 -0.037
        arcToRelative(
            a = 0.071f,
            b = 0.071f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.058f,
            dy1 = -0.037f,
        )
        // c -0.05 -0.089 -0.143 -0.052 -0.214 -0.077
        curveToRelative(
            dx1 = -0.05f,
            dy1 = -0.089f,
            dx2 = -0.143f,
            dy2 = -0.052f,
            dx3 = -0.214f,
            dy3 = -0.077f,
        )
        // s -0.132 -0.094 -0.222 -0.065
        reflectiveCurveToRelative(
            dx1 = -0.132f,
            dy1 = -0.094f,
            dx2 = -0.222f,
            dy2 = -0.065f,
        )
        // a 0.133 0.133 0 0 1 -0.107 0
        arcToRelative(
            a = 0.133f,
            b = 0.133f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.107f,
            dy1 = 0.0f,
        )
        // a 0.163 0.163 0 0 0 -0.165 0.01
        arcToRelative(
            a = 0.163f,
            b = 0.163f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.165f,
            dy1 = 0.01f,
        )
        // a 0.161 0.161 0 0 1 -0.12 0.024
        arcToRelative(
            a = 0.161f,
            b = 0.161f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.12f,
            dy1 = 0.024f,
        )
        // a 0.11 0.11 0 0 0 -0.069 0.007
        arcToRelative(
            a = 0.11f,
            b = 0.11f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.069f,
            dy1 = 0.007f,
        )
        // a 0.874 0.874 0 0 0 -0.343 0.2
        arcToRelative(
            a = 0.874f,
            b = 0.874f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.343f,
            dy1 = 0.2f,
        )
        // a 1.19 1.19 0 0 1 -0.19 0.192
        arcToRelative(
            a = 1.19f,
            b = 1.19f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.19f,
            dy1 = 0.192f,
        )
        // a 0.238 0.238 0 0 0 -0.057 0.247
        arcToRelative(
            a = 0.238f,
            b = 0.238f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.057f,
            dy1 = 0.247f,
        )
        // a 0.314 0.314 0 0 1 -0.028 0.227
        arcToRelative(
            a = 0.314f,
            b = 0.314f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.028f,
            dy1 = 0.227f,
        )
        // a 0.307 0.307 0 0 1 -0.082 0.1
        arcToRelative(
            a = 0.307f,
            b = 0.307f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.082f,
            dy1 = 0.1f,
        )
        // a 0.87 0.87 0 0 0 -0.2 0.239
        arcToRelative(
            a = 0.87f,
            b = 0.87f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.2f,
            dy1 = 0.239f,
        )
        // a 0.829 0.829 0 0 0 -0.089 0.158
        arcToRelative(
            a = 0.829f,
            b = 0.829f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.089f,
            dy1 = 0.158f,
        )
        // a 0.416 0.416 0 0 0 -0.012 0.237
        arcToRelative(
            a = 0.416f,
            b = 0.416f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.012f,
            dy1 = 0.237f,
        )
        // a 0.138 0.138 0 0 1 0 0.1
        arcToRelative(
            a = 0.138f,
            b = 0.138f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 0.1f,
        )
        // v 0.048
        verticalLineToRelative(dy = 0.048f)
        // a 0.98 0.98 0 0 1 0.061 0.379
        arcToRelative(
            a = 0.98f,
            b = 0.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.061f,
            dy1 = 0.379f,
        )
        // s -0.041 0.149 0.046 0.137
        reflectiveCurveToRelative(
            dx1 = -0.041f,
            dy1 = 0.149f,
            dx2 = 0.046f,
            dy2 = 0.137f,
        )
        // a 0.174 0.174 0 0 0 0.13 -0.08
        arcToRelative(
            a = 0.174f,
            b = 0.174f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.13f,
            dy1 = -0.08f,
        )
        // c 0.017 -0.028 0.041 -0.008 0.05 0.02
        curveToRelative(
            dx1 = 0.017f,
            dy1 = -0.028f,
            dx2 = 0.041f,
            dy2 = -0.008f,
            dx3 = 0.05f,
            dy3 = 0.02f,
        )
        // s 0.021 0.069 0.034 0.1
        reflectiveCurveToRelative(
            dx1 = 0.021f,
            dy1 = 0.069f,
            dx2 = 0.034f,
            dy2 = 0.1f,
        )
        // s 0.041 0.072 0.076 0.073
        reflectiveCurveToRelative(
            dx1 = 0.041f,
            dy1 = 0.072f,
            dx2 = 0.076f,
            dy2 = 0.073f,
        )
        // c 0.1 0 0.169 0.089 0.262 0.112
        curveToRelative(
            dx1 = 0.1f,
            dy1 = 0.0f,
            dx2 = 0.169f,
            dy2 = 0.089f,
            dx3 = 0.262f,
            dy3 = 0.112f,
        )
        // a 0.87 0.87 0 0 0 0.311 0.085
        arcToRelative(
            a = 0.87f,
            b = 0.87f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.311f,
            dy1 = 0.085f,
        )
        // a 0.672 0.672 0 0 0 0.412 -0.088
        arcToRelative(
            a = 0.672f,
            b = 0.672f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.412f,
            dy1 = -0.088f,
        )
        // v 0.007
        verticalLineToRelative(dy = 0.007f)
        // c 0 0.062 0.284 0 0.4 -0.06
        curveToRelative(
            dx1 = 0.0f,
            dy1 = 0.062f,
            dx2 = 0.284f,
            dy2 = 0.0f,
            dx3 = 0.4f,
            dy3 = -0.06f,
        )
        // a 0.36 0.36 0 0 0 0.163 -0.2
        arcToRelative(
            a = 0.36f,
            b = 0.36f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.163f,
            dy1 = -0.2f,
        )
        // a 0.237 0.237 0 0 1 0.233 -0.181
        arcToRelative(
            a = 0.237f,
            b = 0.237f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.233f,
            dy1 = -0.181f,
        )
        // a 0.347 0.347 0 0 0 0.268 -0.159
        arcToRelative(
            a = 0.347f,
            b = 0.347f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.268f,
            dy1 = -0.159f,
        )
        // a 0.2 0.2 0 0 0 0.024 -0.086
        arcToRelative(
            a = 0.2f,
            b = 0.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.024f,
            dy1 = -0.086f,
        )
        // v -0.127
        verticalLineToRelative(dy = -0.127f)
        // c -0.012 -0.028 -0.039 -0.058 0.014 -0.074
        curveToRelative(
            dx1 = -0.012f,
            dy1 = -0.028f,
            dx2 = -0.039f,
            dy2 = -0.058f,
            dx3 = 0.014f,
            dy3 = -0.074f,
        )
        // h 0.063
        horizontalLineToRelative(dx = 0.063f)
        // c 0.044 -0.033 0.015 -0.076 0.023 -0.113z
        curveToRelative(
            dx1 = 0.044f,
            dy1 = -0.033f,
            dx2 = 0.015f,
            dy2 = -0.076f,
            dx3 = 0.023f,
            dy3 = -0.113f,
        )
        close()
        // M 4.647 12.9
        moveTo(x = 4.647f, y = 12.9f)
        // c -0.025 0 -0.058 0.012 -0.07 -0.018
        curveToRelative(
            dx1 = -0.025f,
            dy1 = 0.0f,
            dx2 = -0.058f,
            dy2 = 0.012f,
            dx3 = -0.07f,
            dy3 = -0.018f,
        )
        // s 0.018 -0.041 0.032 -0.057
        reflectiveCurveToRelative(
            dx1 = 0.018f,
            dy1 = -0.041f,
            dx2 = 0.032f,
            dy2 = -0.057f,
        )
        // a 0.709 0.709 0 0 0 0.1 -0.148
        arcToRelative(
            a = 0.709f,
            b = 0.709f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.1f,
            dy1 = -0.148f,
        )
        // c 0.012 -0.026 0.025 -0.058 -0.009 -0.076
        curveToRelative(
            dx1 = 0.012f,
            dy1 = -0.026f,
            dx2 = 0.025f,
            dy2 = -0.058f,
            dx3 = -0.009f,
            dy3 = -0.076f,
        )
        // s -0.046 0.014 -0.06 0.035
        reflectiveCurveToRelative(
            dx1 = -0.046f,
            dy1 = 0.014f,
            dx2 = -0.06f,
            dy2 = 0.035f,
        )
        // a 0.83 0.83 0 0 1 -0.1 0.132
        arcToRelative(
            a = 0.83f,
            b = 0.83f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.1f,
            dy1 = 0.132f,
        )
        // a 0.14 0.14 0 0 1 -0.128 0.042
        arcToRelative(
            a = 0.14f,
            b = 0.14f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.128f,
            dy1 = 0.042f,
        )
        // c -0.081 -0.013 -0.1 -0.05 -0.07 -0.126
        curveToRelative(
            dx1 = -0.081f,
            dy1 = -0.013f,
            dx2 = -0.1f,
            dy2 = -0.05f,
            dx3 = -0.07f,
            dy3 = -0.126f,
        )
        // c 0.02 -0.045 0.044 -0.089 0.063 -0.134
        curveToRelative(
            dx1 = 0.02f,
            dy1 = -0.045f,
            dx2 = 0.044f,
            dy2 = -0.089f,
            dx3 = 0.063f,
            dy3 = -0.134f,
        )
        // c 0.025 -0.061 0 -0.093 -0.063 -0.083
        curveToRelative(
            dx1 = 0.025f,
            dy1 = -0.061f,
            dx2 = 0.0f,
            dy2 = -0.093f,
            dx3 = -0.063f,
            dy3 = -0.083f,
        )
        // a 0.443 0.443 0 0 0 -0.209 0.1
        arcToRelative(
            a = 0.443f,
            b = 0.443f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.209f,
            dy1 = 0.1f,
        )
        // c -0.013 0.01 -0.025 0.031 -0.046 0.02
        curveToRelative(
            dx1 = -0.013f,
            dy1 = 0.01f,
            dx2 = -0.025f,
            dy2 = 0.031f,
            dx3 = -0.046f,
            dy3 = 0.02f,
        )
        // s -0.009 -0.033 -0.012 -0.046
        reflectiveCurveToRelative(
            dx1 = -0.009f,
            dy1 = -0.033f,
            dx2 = -0.012f,
            dy2 = -0.046f,
        )
        // a 0.51 0.51 0 0 1 0.289 -0.424
        arcToRelative(
            a = 0.51f,
            b = 0.51f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.289f,
            dy1 = -0.424f,
        )
        // c 0.049 -0.029 0.056 0.006 0.065 0.042
        curveToRelative(
            dx1 = 0.049f,
            dy1 = -0.029f,
            dx2 = 0.056f,
            dy2 = 0.006f,
            dx3 = 0.065f,
            dy3 = 0.042f,
        )
        // a 0.467 0.467 0 0 0 0.25 0.332
        arcToRelative(
            a = 0.467f,
            b = 0.467f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.25f,
            dy1 = 0.332f,
        )
        // a 0.654 0.654 0 0 0 0.231 0.034
        arcToRelative(
            a = 0.654f,
            b = 0.654f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.231f,
            dy1 = 0.034f,
        )
        // c 0.075 0.008 0.087 0.023 0.051 0.086
        curveToRelative(
            dx1 = 0.075f,
            dy1 = 0.008f,
            dx2 = 0.087f,
            dy2 = 0.023f,
            dx3 = 0.051f,
            dy3 = 0.086f,
        )
        // a 0.523 0.523 0 0 1 -0.251 0.269
        arcToRelative(
            a = 0.523f,
            b = 0.523f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.251f,
            dy1 = 0.269f,
        )
        // a 0.234 0.234 0 0 1 -0.063 0.02
        arcToRelative(
            a = 0.234f,
            b = 0.234f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.063f,
            dy1 = 0.02f,
        )
        // m 0.2 0.077
        moveToRelative(dx = 0.2f, dy = 0.077f)
        // c -0.018 0 -0.041 0 -0.048 -0.02
        curveToRelative(
            dx1 = -0.018f,
            dy1 = 0.0f,
            dx2 = -0.041f,
            dy2 = 0.0f,
            dx3 = -0.048f,
            dy3 = -0.02f,
        )
        // s 0.015 -0.031 0.029 -0.041
        reflectiveCurveToRelative(
            dx1 = 0.015f,
            dy1 = -0.031f,
            dx2 = 0.029f,
            dy2 = -0.041f,
        )
        // a 0.589 0.589 0 0 0 0.238 -0.319
        arcToRelative(
            a = 0.589f,
            b = 0.589f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.238f,
            dy1 = -0.319f,
        )
        // a 0.173 0.173 0 0 1 0.117 -0.112
        arcToRelative(
            a = 0.173f,
            b = 0.173f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.117f,
            dy1 = -0.112f,
        )
        // a 0.519 0.519 0 0 0 0.162 -0.079
        arcToRelative(
            a = 0.519f,
            b = 0.519f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.162f,
            dy1 = -0.079f,
        )
        // c 0.056 -0.041 0.073 -0.018 0.072 0.04
        curveToRelative(
            dx1 = 0.056f,
            dy1 = -0.041f,
            dx2 = 0.073f,
            dy2 = -0.018f,
            dx3 = 0.072f,
            dy3 = 0.04f,
        )
        // v 0.102
        verticalLineToRelative(dy = 0.102f)
        // c 0.003 0.413 -0.296 0.471 -0.57 0.431z
        curveToRelative(
            dx1 = 0.003f,
            dy1 = 0.413f,
            dx2 = -0.296f,
            dy2 = 0.471f,
            dx3 = -0.57f,
            dy3 = 0.431f,
        )
        close()
        // M 6.373 12
        moveTo(x = 6.373f, y = 12.0f)
        // c -0.031 0.015 -0.037 -0.017 -0.05 -0.035
        curveToRelative(
            dx1 = -0.031f,
            dy1 = 0.015f,
            dx2 = -0.037f,
            dy2 = -0.017f,
            dx3 = -0.05f,
            dy3 = -0.035f,
        )
        // a 0.459 0.459 0 0 0 -0.114 -0.134
        arcToRelative(
            a = 0.459f,
            b = 0.459f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.114f,
            dy1 = -0.134f,
        )
        // c -0.027 -0.017 -0.056 -0.056 -0.087 -0.015
        curveToRelative(
            dx1 = -0.027f,
            dy1 = -0.017f,
            dx2 = -0.056f,
            dy2 = -0.056f,
            dx3 = -0.087f,
            dy3 = -0.015f,
        )
        // s 0.009 0.056 0.03 0.079
        reflectiveCurveToRelative(
            dx1 = 0.009f,
            dy1 = 0.056f,
            dx2 = 0.03f,
            dy2 = 0.079f,
        )
        // a 0.511 0.511 0 0 1 0.159 0.34
        arcToRelative(
            a = 0.511f,
            b = 0.511f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.159f,
            dy1 = 0.34f,
        )
        // a 0.218 0.218 0 0 1 -0.149 0.224
        arcToRelative(
            a = 0.218f,
            b = 0.218f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.149f,
            dy1 = 0.224f,
        )
        // c -0.053 0.018 -0.077 0.009 -0.061 -0.052
        curveToRelative(
            dx1 = -0.053f,
            dy1 = 0.018f,
            dx2 = -0.077f,
            dy2 = 0.009f,
            dx3 = -0.061f,
            dy3 = -0.052f,
        )
        // a 0.491 0.491 0 0 0 0 -0.2
        arcToRelative(
            a = 0.491f,
            b = 0.491f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -0.2f,
        )
        // c 0 -0.036 -0.017 -0.075 -0.057 -0.07
        curveToRelative(
            dx1 = 0.0f,
            dy1 = -0.036f,
            dx2 = -0.017f,
            dy2 = -0.075f,
            dx3 = -0.057f,
            dy3 = -0.07f,
        )
        // s -0.037 0.046 -0.032 0.081
        reflectiveCurveToRelative(
            dx1 = -0.037f,
            dy1 = 0.046f,
            dx2 = -0.032f,
            dy2 = 0.081f,
        )
        // a 0.327 0.327 0 0 1 -0.057 0.274
        arcToRelative(
            a = 0.327f,
            b = 0.327f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.057f,
            dy1 = 0.274f,
        )
        // c -0.032 0.036 -0.06 0.057 -0.074 -0.013
        curveToRelative(
            dx1 = -0.032f,
            dy1 = 0.036f,
            dx2 = -0.06f,
            dy2 = 0.057f,
            dx3 = -0.074f,
            dy3 = -0.013f,
        )
        // a 0.481 0.481 0 0 0 -0.035 -0.1
        arcToRelative(
            a = 0.481f,
            b = 0.481f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.035f,
            dy1 = -0.1f,
        )
        // c -0.015 -0.03 -0.033 -0.07 -0.074 -0.052
        curveToRelative(
            dx1 = -0.015f,
            dy1 = -0.03f,
            dx2 = -0.033f,
            dy2 = -0.07f,
            dx3 = -0.074f,
            dy3 = -0.052f,
        )
        // s -0.025 0.059 -0.008 0.088
        reflectiveCurveToRelative(
            dx1 = -0.025f,
            dy1 = 0.059f,
            dx2 = -0.008f,
            dy2 = 0.088f,
        )
        // a 0.429 0.429 0 0 1 0.036 0.119
        arcToRelative(
            a = 0.429f,
            b = 0.429f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.036f,
            dy1 = 0.119f,
        )
        // a 0.281 0.281 0 0 1 -0.062 0.25
        arcToRelative(
            a = 0.281f,
            b = 0.281f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.062f,
            dy1 = 0.25f,
        )
        // a 0.377 0.377 0 0 1 -0.348 0.132
        arcToRelative(
            a = 0.377f,
            b = 0.377f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.348f,
            dy1 = 0.132f,
        )
        // h -0.015
        horizontalLineToRelative(dx = -0.015f)
        // a 0.445 0.445 0 0 0 0.118 -0.227
        arcToRelative(
            a = 0.445f,
            b = 0.445f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.118f,
            dy1 = -0.227f,
        )
        // a 0.153 0.153 0 0 1 0.012 -0.079
        arcToRelative(
            a = 0.153f,
            b = 0.153f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.012f,
            dy1 = -0.079f,
        )
        // l 0.006 -0.094
        lineToRelative(dx = 0.006f, dy = -0.094f)
        // a 0.174 0.174 0 0 1 0 -0.1
        arcToRelative(
            a = 0.174f,
            b = 0.174f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -0.1f,
        )
        // a 0.251 0.251 0 0 1 0.046 -0.233
        arcToRelative(
            a = 0.251f,
            b = 0.251f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.046f,
            dy1 = -0.233f,
        )
        // s 0.059 -0.043 0.054 -0.1
        reflectiveCurveToRelative(
            dx1 = 0.059f,
            dy1 = -0.043f,
            dx2 = 0.054f,
            dy2 = -0.1f,
        )
        // s -0.072 -0.084 -0.107 -0.014
        reflectiveCurveToRelative(
            dx1 = -0.072f,
            dy1 = -0.084f,
            dx2 = -0.107f,
            dy2 = -0.014f,
        )
        // a 0.58 0.58 0 0 1 -0.433 0.351
        arcToRelative(
            a = 0.58f,
            b = 0.58f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.433f,
            dy1 = 0.351f,
        )
        // c -0.319 0.072 -0.538 -0.023 -0.575 -0.392
        curveToRelative(
            dx1 = -0.319f,
            dy1 = 0.072f,
            dx2 = -0.538f,
            dy2 = -0.023f,
            dx3 = -0.575f,
            dy3 = -0.392f,
        )
        // a 1.4 1.4 0 0 1 0 -0.259
        arcToRelative(
            a = 1.4f,
            b = 1.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -0.259f,
        )
        // c 0 -0.026 0.008 -0.057 -0.026 -0.064
        curveToRelative(
            dx1 = 0.0f,
            dy1 = -0.026f,
            dx2 = 0.008f,
            dy2 = -0.057f,
            dx3 = -0.026f,
            dy3 = -0.064f,
        )
        // s -0.045 0.027 -0.052 0.055
        reflectiveCurveToRelative(
            dx1 = -0.045f,
            dy1 = 0.027f,
            dx2 = -0.052f,
            dy2 = 0.055f,
        )
        // a 0.694 0.694 0 0 0 -0.013 0.187
        arcToRelative(
            a = 0.694f,
            b = 0.694f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.013f,
            dy1 = 0.187f,
        )
        // a 0.068 0.068 0 0 1 -0.044 0.074
        arcToRelative(
            a = 0.068f,
            b = 0.068f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.044f,
            dy1 = 0.074f,
        )
        // a 0.675 0.675 0 0 0 -0.285 0.227
        arcToRelative(
            a = 0.675f,
            b = 0.675f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.285f,
            dy1 = 0.227f,
        )
        // c -0.008 0.01 -0.016 0.024 -0.031 0.02
        curveToRelative(
            dx1 = -0.008f,
            dy1 = 0.01f,
            dx2 = -0.016f,
            dy2 = 0.024f,
            dx3 = -0.031f,
            dy3 = 0.02f,
        )
        // s -0.021 -0.027 -0.022 -0.045
        reflectiveCurveToRelative(
            dx1 = -0.021f,
            dy1 = -0.027f,
            dx2 = -0.022f,
            dy2 = -0.045f,
        )
        // a 0.4 0.4 0 0 1 0.13 -0.3
        arcToRelative(
            a = 0.4f,
            b = 0.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.13f,
            dy1 = -0.3f,
        )
        // c 0.022 -0.024 0.087 -0.043 0.042 -0.089
        curveToRelative(
            dx1 = 0.022f,
            dy1 = -0.024f,
            dx2 = 0.087f,
            dy2 = -0.043f,
            dx3 = 0.042f,
            dy3 = -0.089f,
        )
        // s -0.077 0 -0.109 0.03
        reflectiveCurveToRelative(
            dx1 = -0.077f,
            dy1 = 0.0f,
            dx2 = -0.109f,
            dy2 = 0.03f,
        )
        // s -0.035 0.045 -0.076 0.059
        reflectiveCurveToRelative(
            dx1 = -0.035f,
            dy1 = 0.045f,
            dx2 = -0.076f,
            dy2 = 0.059f,
        )
        // a 0.258 0.258 0 0 1 0.087 -0.173
        arcToRelative(
            a = 0.258f,
            b = 0.258f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.087f,
            dy1 = -0.173f,
        )
        // a 0.418 0.418 0 0 1 0.109 -0.076
        arcToRelative(
            a = 0.418f,
            b = 0.418f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.109f,
            dy1 = -0.076f,
        )
        // c 0.085 -0.048 0.086 -0.064 0.009 -0.121
        curveToRelative(
            dx1 = 0.085f,
            dy1 = -0.048f,
            dx2 = 0.086f,
            dy2 = -0.064f,
            dx3 = 0.009f,
            dy3 = -0.121f,
        )
        // a 0.092 0.092 0 0 1 0.069 -0.03
        arcToRelative(
            a = 0.092f,
            b = 0.092f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.069f,
            dy1 = -0.03f,
        )
        // a 0.07 0.07 0 0 0 0.069 -0.063
        arcToRelative(
            a = 0.07f,
            b = 0.07f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.069f,
            dy1 = -0.063f,
        )
        // a 0.255 0.255 0 0 1 0.08 -0.15
        arcToRelative(
            a = 0.255f,
            b = 0.255f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.08f,
            dy1 = -0.15f,
        )
        // a 0.08 0.08 0 0 0 0.015 -0.111
        arcToRelative(
            a = 0.08f,
            b = 0.08f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.015f,
            dy1 = -0.111f,
        )
        // a 0.212 0.212 0 0 1 -0.025 -0.191
        arcToRelative(
            a = 0.212f,
            b = 0.212f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.025f,
            dy1 = -0.191f,
        )
        // a 0.189 0.189 0 0 1 0.039 0.137
        arcToRelative(
            a = 0.189f,
            b = 0.189f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.039f,
            dy1 = 0.137f,
        )
        // c 0 0.029 0 0.063 0.044 0.059
        curveToRelative(
            dx1 = 0.0f,
            dy1 = 0.029f,
            dx2 = 0.0f,
            dy2 = 0.063f,
            dx3 = 0.044f,
            dy3 = 0.059f,
        )
        // s 0.039 -0.033 0.037 -0.06
        reflectiveCurveToRelative(
            dx1 = 0.039f,
            dy1 = -0.033f,
            dx2 = 0.037f,
            dy2 = -0.06f,
        )
        // c 0 -0.07 0 -0.142 -0.06 -0.2
        curveToRelative(
            dx1 = 0.0f,
            dy1 = -0.07f,
            dx2 = 0.0f,
            dy2 = -0.142f,
            dx3 = -0.06f,
            dy3 = -0.2f,
        )
        // c -0.04 -0.037 0 -0.054 0.024 -0.056
        curveToRelative(
            dx1 = -0.04f,
            dy1 = -0.037f,
            dx2 = 0.0f,
            dy2 = -0.054f,
            dx3 = 0.024f,
            dy3 = -0.056f,
        )
        // c 0.072 0 0.109 -0.031 0.107 -0.109
        curveToRelative(
            dx1 = 0.072f,
            dy1 = 0.0f,
            dx2 = 0.109f,
            dy2 = -0.031f,
            dx3 = 0.107f,
            dy3 = -0.109f,
        )
        // s 0.089 -0.045 0.111 -0.093
        reflectiveCurveToRelative(
            dx1 = 0.089f,
            dy1 = -0.045f,
            dx2 = 0.111f,
            dy2 = -0.093f,
        )
        // s 0.051 -0.085 0.114 -0.057
        reflectiveCurveToRelative(
            dx1 = 0.051f,
            dy1 = -0.085f,
            dx2 = 0.114f,
            dy2 = -0.057f,
        )
        // c 0.032 0.014 0.056 0 0.072 -0.031
        curveToRelative(
            dx1 = 0.032f,
            dy1 = 0.014f,
            dx2 = 0.056f,
            dy2 = 0.0f,
            dx3 = 0.072f,
            dy3 = -0.031f,
        )
        // c 0.034 -0.06 0.076 -0.068 0.126 -0.02
        curveToRelative(
            dx1 = 0.034f,
            dy1 = -0.06f,
            dx2 = 0.076f,
            dy2 = -0.068f,
            dx3 = 0.126f,
            dy3 = -0.02f,
        )
        // s 0.063 0.016 0.09 -0.017
        reflectiveCurveToRelative(
            dx1 = 0.063f,
            dy1 = 0.016f,
            dx2 = 0.09f,
            dy2 = -0.017f,
        )
        // c 0.07 -0.084 0.075 -0.084 0.152 0
        curveToRelative(
            dx1 = 0.07f,
            dy1 = -0.084f,
            dx2 = 0.075f,
            dy2 = -0.084f,
            dx3 = 0.152f,
            dy3 = 0.0f,
        )
        // c 0.029 0.031 0.053 0.02 0.081 0
        curveToRelative(
            dx1 = 0.029f,
            dy1 = 0.031f,
            dx2 = 0.053f,
            dy2 = 0.02f,
            dx3 = 0.081f,
            dy3 = 0.0f,
        )
        // c 0.108 -0.081 0.156 -0.06 0.178 0.077
        curveToRelative(
            dx1 = 0.108f,
            dy1 = -0.081f,
            dx2 = 0.156f,
            dy2 = -0.06f,
            dx3 = 0.178f,
            dy3 = 0.077f,
        )
        // a 0.082 0.082 0 0 0 0.071 0.013
        arcToRelative(
            a = 0.082f,
            b = 0.082f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.071f,
            dy1 = 0.013f,
        )
        // a 0.041 0.041 0 0 1 0.031 -0.031
        arcToRelative(
            a = 0.041f,
            b = 0.041f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.031f,
            dy1 = -0.031f,
        )
        // c 0.052 -0.042 0.095 -0.044 0.115 0.03
        curveToRelative(
            dx1 = 0.052f,
            dy1 = -0.042f,
            dx2 = 0.095f,
            dy2 = -0.044f,
            dx3 = 0.115f,
            dy3 = 0.03f,
        )
        // a 0.064 0.064 0 0 0 0.078 0.055
        arcToRelative(
            a = 0.064f,
            b = 0.064f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.078f,
            dy1 = 0.055f,
        )
        // c 0.092 0 0.111 0.012 0.128 0.106
        curveToRelative(
            dx1 = 0.092f,
            dy1 = 0.0f,
            dx2 = 0.111f,
            dy2 = 0.012f,
            dx3 = 0.128f,
            dy3 = 0.106f,
        )
        // a 0.089 0.089 0 0 0 0.058 0.082
        arcToRelative(
            a = 0.089f,
            b = 0.089f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.058f,
            dy1 = 0.082f,
        )
        // c 0.1 0.035 0.121 0.093 0.1 0.2
        curveToRelative(
            dx1 = 0.1f,
            dy1 = 0.035f,
            dx2 = 0.121f,
            dy2 = 0.093f,
            dx3 = 0.1f,
            dy3 = 0.2f,
        )
        // s -0.021 0.1 0.078 0.108
        reflectiveCurveToRelative(
            dx1 = -0.021f,
            dy1 = 0.1f,
            dx2 = 0.078f,
            dy2 = 0.108f,
        )
        // c 0.076 0.015 0.093 0.067 0.088 0.135
        curveToRelative(
            dx1 = 0.076f,
            dy1 = 0.015f,
            dx2 = 0.093f,
            dy2 = 0.067f,
            dx3 = 0.088f,
            dy3 = 0.135f,
        )
        // a 0.1 0.1 0 0 1 0 0.076
        arcToRelative(
            a = 0.1f,
            b = 0.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 0.076f,
        )
        // a 0.029 0.029 0 0 1 -0.006 0.032
        arcToRelative(
            a = 0.029f,
            b = 0.029f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.006f,
            dy1 = 0.032f,
        )
        // a 0.189 0.189 0 0 1 -0.044 0.1
        arcToRelative(
            a = 0.189f,
            b = 0.189f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.044f,
            dy1 = 0.1f,
        )
        // a 0.06 0.06 0 0 0 0 0.077
        arcToRelative(
            a = 0.06f,
            b = 0.06f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 0.077f,
        )
        // c 0.034 0.014 0.076 0 0.114 0.029
        curveToRelative(
            dx1 = 0.034f,
            dy1 = 0.014f,
            dx2 = 0.076f,
            dy2 = 0.0f,
            dx3 = 0.114f,
            dy3 = 0.029f,
        )
        // c -0.041 0.036 -0.089 0.019 -0.131 0.027
        curveToRelative(
            dx1 = -0.041f,
            dy1 = 0.036f,
            dx2 = -0.089f,
            dy2 = 0.019f,
            dx3 = -0.131f,
            dy3 = 0.027f,
        )
        // c -0.028 0.039 -0.007 0.061 0.026 0.081
        curveToRelative(
            dx1 = -0.028f,
            dy1 = 0.039f,
            dx2 = -0.007f,
            dy2 = 0.061f,
            dx3 = 0.026f,
            dy3 = 0.081f,
        )
        // a 0.283 0.283 0 0 1 0.135 0.175
        arcToRelative(
            a = 0.283f,
            b = 0.283f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.135f,
            dy1 = 0.175f,
        )
        // c -0.001 0.025 0.021 0.05 -0.006 0.067z
        curveToRelative(
            dx1 = -0.001f,
            dy1 = 0.025f,
            dx2 = 0.021f,
            dy2 = 0.05f,
            dx3 = -0.006f,
            dy3 = 0.067f,
        )
        close()
    }
    // M6.2 11.249 a0.166 0.166 0 0 0 -0.088 0.13 c-0.009 0.045 -0.031 0.111 0.024 0.125 s0.055 -0.057 0.069 -0.1 l0.03 -0.071 c0.009 -0.033 0.015 -0.072 -0.035 -0.084z
    path(
        fill = SolidColor(Color(0xFF806600)),
    ) {
        // M 6.2 11.249
        moveTo(x = 6.2f, y = 11.249f)
        // a 0.166 0.166 0 0 0 -0.088 0.13
        arcToRelative(
            a = 0.166f,
            b = 0.166f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.088f,
            dy1 = 0.13f,
        )
        // c -0.009 0.045 -0.031 0.111 0.024 0.125
        curveToRelative(
            dx1 = -0.009f,
            dy1 = 0.045f,
            dx2 = -0.031f,
            dy2 = 0.111f,
            dx3 = 0.024f,
            dy3 = 0.125f,
        )
        // s 0.055 -0.057 0.069 -0.1
        reflectiveCurveToRelative(
            dx1 = 0.055f,
            dy1 = -0.057f,
            dx2 = 0.069f,
            dy2 = -0.1f,
        )
        // l 0.03 -0.071
        lineToRelative(dx = 0.03f, dy = -0.071f)
        // c 0.009 -0.033 0.015 -0.072 -0.035 -0.084z
        curveToRelative(
            dx1 = 0.009f,
            dy1 = -0.033f,
            dx2 = 0.015f,
            dy2 = -0.072f,
            dx3 = -0.035f,
            dy3 = -0.084f,
        )
        close()
    }
    // m3.018 11.164  l-0.007 -0.014 h-0.015 a0.145 0.145 0 0 1 -0.037 -0.021 0.4 0.4 0 0 0 -0.3 -0.071 l-0.106 0.008 0.088 0.06 a0.253 0.253 0 0 1 0.142 0.226 v0.019 l0.016 0.009 a0.189 0.189 0 0 0 0.101 0.02 0.132 0.132 0 0 0 0.07 -0.02 0.156 0.156 0 0 0 0.048 -0.216z M2.388 11.259 h-0.014 a0.135 0.135 0 0 1 -0.043 0 0.419 0.419 0 0 0 -0.3 0.059 l-0.1 0.052 0.112 0.018 a0.248 0.248 0 0 1 0.222 0.137 l0.01 0.015 h0.04 a0.147 0.147 0 0 0 0.131 -0.06 0.144 0.144 0 0 0 -0.043 -0.214z M2.172 11.771 h-0.015 l-0.013 0.008 a0.124 0.124 0 0 1 -0.04 0.013 0.4 0.4 0 0 0 -0.248 0.173 l-0.066 0.085 0.1 -0.026 a0.264 0.264 0 0 1 0.266 0.04 l0.015 0.01 0.017 -0.006 a0.146 0.146 0 0 0 0.113 -0.116 0.153 0.153 0 0 0 -0.129 -0.181 m0.397 2.465 a0.164 0.164 0 0 0 -0.222 -0.048 l-0.045 0.024 0.017 0.017 -0.011 0.015 a0.353 0.353 0 0 0 -0.072 0.284 l0.008 0.1 0.059 -0.08 a0.263 0.263 0 0 1 0.232 -0.135 h0.017 l0.01 -0.016 a0.137 0.137 0 0 0 0.007 -0.161 m-0.158 -0.961  l-0.011 -0.007 -0.014 0.007 a0.145 0.145 0 0 1 -0.042 0.006 0.4 0.4 0 0 0 -0.278 0.13 l-0.078 0.072 0.106 -0.007 a0.25 0.25 0 0 1 0.252 0.088 l0.013 0.013 h0.019 a0.152 0.152 0 0 0 0.133 -0.1 0.155 0.155 0 0 0 -0.1 -0.202 m-0.298 0.409 L2.1 13.684 l-0.011 0.011 a0.142 0.142 0 0 1 -0.036 0.021 0.4 0.4 0 0 0 -0.207 0.228 l-0.045 0.1 0.1 -0.048 a0.25 0.25 0 0 1 0.266 -0.015 l0.017 0.006 0.016 -0.009 a0.153 0.153 0 0 0 0.087 -0.14 0.156 0.156 0 0 0 -0.174 -0.154z M7.28 13.349  L7.266 13.342 7.251 13.348 a0.139 0.139 0 0 1 -0.042 0.006 0.392 0.392 0 0 0 -0.277 0.129 l-0.076 0.071 0.1 -0.007 a0.258 0.258 0 0 1 0.252 0.093 l0.014 0.013 h0.018 a0.15 0.15 0 0 0 0.133 -0.1 0.159 0.159 0 0 0 -0.093 -0.204 m0.07 0.519 h-0.035 v0.018 l-0.026 0.015 a0.4 0.4 0 0 0 -0.193 0.236 l-0.038 0.1 0.092 -0.052 a0.262 0.262 0 0 1 0.27 -0.03 h0.018 l0.015 -0.01 a0.144 0.144 0 0 0 0.077 -0.144 0.158 0.158 0 0 0 -0.18 -0.133z M7.98 14.263 a0.155 0.155 0 0 0 -0.222 -0.027 l-0.013 0.009 v0.016 a0.157 0.157 0 0 1 -0.017 0.037 0.381 0.381 0 0 0 -0.038 0.3 l0.02 0.1 0.05 -0.092 a0.249 0.249 0 0 1 0.207 -0.16 l0.018 -0.005 0.008 -0.017 a0.146 0.146 0 0 0 -0.013 -0.161z M12.3 13.956  L12.285 13.962 12.279 13.977 a0.144 0.144 0 0 1 -0.024 0.034 0.4 0.4 0 0 0 -0.1 0.289 v0.107 l0.068 -0.082 a0.248 0.248 0 0 1 0.237 -0.115 h0.019 l0.011 -0.015 a0.151 0.151 0 0 0 0.024 -0.162 0.154 0.154 0 0 0 -0.214 -0.077z M12.716 14.218  L12.705 14.23 v0.016 a0.17 0.17 0 0 1 -0.009 0.039 0.37 0.37 0 0 0 0.029 0.3 l0.041 0.091 0.029 -0.1 a0.256 0.256 0 0 1 0.177 -0.2 l0.017 -0.008 v-0.018 a0.143 0.143 0 0 0 -0.047 -0.155 0.168 0.168 0 0 0 -0.226 0.023z M13.528 14.236 a0.145 0.145 0 0 0 -0.084 -0.138 0.156 0.156 0 0 0 -0.209 0.079 l-0.007 0.015 0.005 0.015 a0.155 0.155 0 0 1 0 0.04 0.386 0.386 0 0 0 0.106 0.281 l0.065 0.082 v-0.1 a0.251 0.251 0 0 1 0.109 -0.239 l0.014 -0.012z
    path(
        fill = SolidColor(Color(0xFF377BC8)),
    ) {
        // M 3.018 11.164
        moveTo(x = 3.018f, y = 11.164f)
        // l -0.007 -0.014
        lineToRelative(dx = -0.007f, dy = -0.014f)
        // h -0.015
        horizontalLineToRelative(dx = -0.015f)
        // a 0.145 0.145 0 0 1 -0.037 -0.021
        arcToRelative(
            a = 0.145f,
            b = 0.145f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.037f,
            dy1 = -0.021f,
        )
        // a 0.4 0.4 0 0 0 -0.3 -0.071
        arcToRelative(
            a = 0.4f,
            b = 0.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.3f,
            dy1 = -0.071f,
        )
        // l -0.106 0.008
        lineToRelative(dx = -0.106f, dy = 0.008f)
        // l 0.088 0.06
        lineToRelative(dx = 0.088f, dy = 0.06f)
        // a 0.253 0.253 0 0 1 0.142 0.226
        arcToRelative(
            a = 0.253f,
            b = 0.253f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.142f,
            dy1 = 0.226f,
        )
        // v 0.019
        verticalLineToRelative(dy = 0.019f)
        // l 0.016 0.009
        lineToRelative(dx = 0.016f, dy = 0.009f)
        // a 0.189 0.189 0 0 0 0.101 0.02
        arcToRelative(
            a = 0.189f,
            b = 0.189f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.101f,
            dy1 = 0.02f,
        )
        // a 0.132 0.132 0 0 0 0.07 -0.02
        arcToRelative(
            a = 0.132f,
            b = 0.132f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.07f,
            dy1 = -0.02f,
        )
        // a 0.156 0.156 0 0 0 0.048 -0.216z
        arcToRelative(
            a = 0.156f,
            b = 0.156f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.048f,
            dy1 = -0.216f,
        )
        close()
        // M 2.388 11.259
        moveTo(x = 2.388f, y = 11.259f)
        // h -0.014
        horizontalLineToRelative(dx = -0.014f)
        // a 0.135 0.135 0 0 1 -0.043 0
        arcToRelative(
            a = 0.135f,
            b = 0.135f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.043f,
            dy1 = 0.0f,
        )
        // a 0.419 0.419 0 0 0 -0.3 0.059
        arcToRelative(
            a = 0.419f,
            b = 0.419f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.3f,
            dy1 = 0.059f,
        )
        // l -0.1 0.052
        lineToRelative(dx = -0.1f, dy = 0.052f)
        // l 0.112 0.018
        lineToRelative(dx = 0.112f, dy = 0.018f)
        // a 0.248 0.248 0 0 1 0.222 0.137
        arcToRelative(
            a = 0.248f,
            b = 0.248f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.222f,
            dy1 = 0.137f,
        )
        // l 0.01 0.015
        lineToRelative(dx = 0.01f, dy = 0.015f)
        // h 0.04
        horizontalLineToRelative(dx = 0.04f)
        // a 0.147 0.147 0 0 0 0.131 -0.06
        arcToRelative(
            a = 0.147f,
            b = 0.147f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.131f,
            dy1 = -0.06f,
        )
        // a 0.144 0.144 0 0 0 -0.043 -0.214z
        arcToRelative(
            a = 0.144f,
            b = 0.144f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.043f,
            dy1 = -0.214f,
        )
        close()
        // M 2.172 11.771
        moveTo(x = 2.172f, y = 11.771f)
        // h -0.015
        horizontalLineToRelative(dx = -0.015f)
        // l -0.013 0.008
        lineToRelative(dx = -0.013f, dy = 0.008f)
        // a 0.124 0.124 0 0 1 -0.04 0.013
        arcToRelative(
            a = 0.124f,
            b = 0.124f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.04f,
            dy1 = 0.013f,
        )
        // a 0.4 0.4 0 0 0 -0.248 0.173
        arcToRelative(
            a = 0.4f,
            b = 0.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.248f,
            dy1 = 0.173f,
        )
        // l -0.066 0.085
        lineToRelative(dx = -0.066f, dy = 0.085f)
        // l 0.1 -0.026
        lineToRelative(dx = 0.1f, dy = -0.026f)
        // a 0.264 0.264 0 0 1 0.266 0.04
        arcToRelative(
            a = 0.264f,
            b = 0.264f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.266f,
            dy1 = 0.04f,
        )
        // l 0.015 0.01
        lineToRelative(dx = 0.015f, dy = 0.01f)
        // l 0.017 -0.006
        lineToRelative(dx = 0.017f, dy = -0.006f)
        // a 0.146 0.146 0 0 0 0.113 -0.116
        arcToRelative(
            a = 0.146f,
            b = 0.146f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.113f,
            dy1 = -0.116f,
        )
        // a 0.153 0.153 0 0 0 -0.129 -0.181
        arcToRelative(
            a = 0.153f,
            b = 0.153f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.129f,
            dy1 = -0.181f,
        )
        // m 0.397 2.465
        moveToRelative(dx = 0.397f, dy = 2.465f)
        // a 0.164 0.164 0 0 0 -0.222 -0.048
        arcToRelative(
            a = 0.164f,
            b = 0.164f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.222f,
            dy1 = -0.048f,
        )
        // l -0.045 0.024
        lineToRelative(dx = -0.045f, dy = 0.024f)
        // l 0.017 0.017
        lineToRelative(dx = 0.017f, dy = 0.017f)
        // l -0.011 0.015
        lineToRelative(dx = -0.011f, dy = 0.015f)
        // a 0.353 0.353 0 0 0 -0.072 0.284
        arcToRelative(
            a = 0.353f,
            b = 0.353f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.072f,
            dy1 = 0.284f,
        )
        // l 0.008 0.1
        lineToRelative(dx = 0.008f, dy = 0.1f)
        // l 0.059 -0.08
        lineToRelative(dx = 0.059f, dy = -0.08f)
        // a 0.263 0.263 0 0 1 0.232 -0.135
        arcToRelative(
            a = 0.263f,
            b = 0.263f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.232f,
            dy1 = -0.135f,
        )
        // h 0.017
        horizontalLineToRelative(dx = 0.017f)
        // l 0.01 -0.016
        lineToRelative(dx = 0.01f, dy = -0.016f)
        // a 0.137 0.137 0 0 0 0.007 -0.161
        arcToRelative(
            a = 0.137f,
            b = 0.137f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.007f,
            dy1 = -0.161f,
        )
        // m -0.158 -0.961
        moveToRelative(dx = -0.158f, dy = -0.961f)
        // l -0.011 -0.007
        lineToRelative(dx = -0.011f, dy = -0.007f)
        // l -0.014 0.007
        lineToRelative(dx = -0.014f, dy = 0.007f)
        // a 0.145 0.145 0 0 1 -0.042 0.006
        arcToRelative(
            a = 0.145f,
            b = 0.145f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.042f,
            dy1 = 0.006f,
        )
        // a 0.4 0.4 0 0 0 -0.278 0.13
        arcToRelative(
            a = 0.4f,
            b = 0.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.278f,
            dy1 = 0.13f,
        )
        // l -0.078 0.072
        lineToRelative(dx = -0.078f, dy = 0.072f)
        // l 0.106 -0.007
        lineToRelative(dx = 0.106f, dy = -0.007f)
        // a 0.25 0.25 0 0 1 0.252 0.088
        arcToRelative(
            a = 0.25f,
            b = 0.25f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.252f,
            dy1 = 0.088f,
        )
        // l 0.013 0.013
        lineToRelative(dx = 0.013f, dy = 0.013f)
        // h 0.019
        horizontalLineToRelative(dx = 0.019f)
        // a 0.152 0.152 0 0 0 0.133 -0.1
        arcToRelative(
            a = 0.152f,
            b = 0.152f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.133f,
            dy1 = -0.1f,
        )
        // a 0.155 0.155 0 0 0 -0.1 -0.202
        arcToRelative(
            a = 0.155f,
            b = 0.155f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.1f,
            dy1 = -0.202f,
        )
        // m -0.298 0.409
        moveToRelative(dx = -0.298f, dy = 0.409f)
        // L 2.1 13.684
        lineTo(x = 2.1f, y = 13.684f)
        // l -0.011 0.011
        lineToRelative(dx = -0.011f, dy = 0.011f)
        // a 0.142 0.142 0 0 1 -0.036 0.021
        arcToRelative(
            a = 0.142f,
            b = 0.142f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.036f,
            dy1 = 0.021f,
        )
        // a 0.4 0.4 0 0 0 -0.207 0.228
        arcToRelative(
            a = 0.4f,
            b = 0.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.207f,
            dy1 = 0.228f,
        )
        // l -0.045 0.1
        lineToRelative(dx = -0.045f, dy = 0.1f)
        // l 0.1 -0.048
        lineToRelative(dx = 0.1f, dy = -0.048f)
        // a 0.25 0.25 0 0 1 0.266 -0.015
        arcToRelative(
            a = 0.25f,
            b = 0.25f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.266f,
            dy1 = -0.015f,
        )
        // l 0.017 0.006
        lineToRelative(dx = 0.017f, dy = 0.006f)
        // l 0.016 -0.009
        lineToRelative(dx = 0.016f, dy = -0.009f)
        // a 0.153 0.153 0 0 0 0.087 -0.14
        arcToRelative(
            a = 0.153f,
            b = 0.153f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.087f,
            dy1 = -0.14f,
        )
        // a 0.156 0.156 0 0 0 -0.174 -0.154z
        arcToRelative(
            a = 0.156f,
            b = 0.156f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.174f,
            dy1 = -0.154f,
        )
        close()
        // M 7.28 13.349
        moveTo(x = 7.28f, y = 13.349f)
        // L 7.266 13.342
        lineTo(x = 7.266f, y = 13.342f)
        // L 7.251 13.348
        lineTo(x = 7.251f, y = 13.348f)
        // a 0.139 0.139 0 0 1 -0.042 0.006
        arcToRelative(
            a = 0.139f,
            b = 0.139f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.042f,
            dy1 = 0.006f,
        )
        // a 0.392 0.392 0 0 0 -0.277 0.129
        arcToRelative(
            a = 0.392f,
            b = 0.392f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.277f,
            dy1 = 0.129f,
        )
        // l -0.076 0.071
        lineToRelative(dx = -0.076f, dy = 0.071f)
        // l 0.1 -0.007
        lineToRelative(dx = 0.1f, dy = -0.007f)
        // a 0.258 0.258 0 0 1 0.252 0.093
        arcToRelative(
            a = 0.258f,
            b = 0.258f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.252f,
            dy1 = 0.093f,
        )
        // l 0.014 0.013
        lineToRelative(dx = 0.014f, dy = 0.013f)
        // h 0.018
        horizontalLineToRelative(dx = 0.018f)
        // a 0.15 0.15 0 0 0 0.133 -0.1
        arcToRelative(
            a = 0.15f,
            b = 0.15f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.133f,
            dy1 = -0.1f,
        )
        // a 0.159 0.159 0 0 0 -0.093 -0.204
        arcToRelative(
            a = 0.159f,
            b = 0.159f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.093f,
            dy1 = -0.204f,
        )
        // m 0.07 0.519
        moveToRelative(dx = 0.07f, dy = 0.519f)
        // h -0.035
        horizontalLineToRelative(dx = -0.035f)
        // v 0.018
        verticalLineToRelative(dy = 0.018f)
        // l -0.026 0.015
        lineToRelative(dx = -0.026f, dy = 0.015f)
        // a 0.4 0.4 0 0 0 -0.193 0.236
        arcToRelative(
            a = 0.4f,
            b = 0.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.193f,
            dy1 = 0.236f,
        )
        // l -0.038 0.1
        lineToRelative(dx = -0.038f, dy = 0.1f)
        // l 0.092 -0.052
        lineToRelative(dx = 0.092f, dy = -0.052f)
        // a 0.262 0.262 0 0 1 0.27 -0.03
        arcToRelative(
            a = 0.262f,
            b = 0.262f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.27f,
            dy1 = -0.03f,
        )
        // h 0.018
        horizontalLineToRelative(dx = 0.018f)
        // l 0.015 -0.01
        lineToRelative(dx = 0.015f, dy = -0.01f)
        // a 0.144 0.144 0 0 0 0.077 -0.144
        arcToRelative(
            a = 0.144f,
            b = 0.144f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.077f,
            dy1 = -0.144f,
        )
        // a 0.158 0.158 0 0 0 -0.18 -0.133z
        arcToRelative(
            a = 0.158f,
            b = 0.158f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.18f,
            dy1 = -0.133f,
        )
        close()
        // M 7.98 14.263
        moveTo(x = 7.98f, y = 14.263f)
        // a 0.155 0.155 0 0 0 -0.222 -0.027
        arcToRelative(
            a = 0.155f,
            b = 0.155f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.222f,
            dy1 = -0.027f,
        )
        // l -0.013 0.009
        lineToRelative(dx = -0.013f, dy = 0.009f)
        // v 0.016
        verticalLineToRelative(dy = 0.016f)
        // a 0.157 0.157 0 0 1 -0.017 0.037
        arcToRelative(
            a = 0.157f,
            b = 0.157f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.017f,
            dy1 = 0.037f,
        )
        // a 0.381 0.381 0 0 0 -0.038 0.3
        arcToRelative(
            a = 0.381f,
            b = 0.381f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.038f,
            dy1 = 0.3f,
        )
        // l 0.02 0.1
        lineToRelative(dx = 0.02f, dy = 0.1f)
        // l 0.05 -0.092
        lineToRelative(dx = 0.05f, dy = -0.092f)
        // a 0.249 0.249 0 0 1 0.207 -0.16
        arcToRelative(
            a = 0.249f,
            b = 0.249f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.207f,
            dy1 = -0.16f,
        )
        // l 0.018 -0.005
        lineToRelative(dx = 0.018f, dy = -0.005f)
        // l 0.008 -0.017
        lineToRelative(dx = 0.008f, dy = -0.017f)
        // a 0.146 0.146 0 0 0 -0.013 -0.161z
        arcToRelative(
            a = 0.146f,
            b = 0.146f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.013f,
            dy1 = -0.161f,
        )
        close()
        // M 12.3 13.956
        moveTo(x = 12.3f, y = 13.956f)
        // L 12.285 13.962
        lineTo(x = 12.285f, y = 13.962f)
        // L 12.279 13.977
        lineTo(x = 12.279f, y = 13.977f)
        // a 0.144 0.144 0 0 1 -0.024 0.034
        arcToRelative(
            a = 0.144f,
            b = 0.144f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.024f,
            dy1 = 0.034f,
        )
        // a 0.4 0.4 0 0 0 -0.1 0.289
        arcToRelative(
            a = 0.4f,
            b = 0.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.1f,
            dy1 = 0.289f,
        )
        // v 0.107
        verticalLineToRelative(dy = 0.107f)
        // l 0.068 -0.082
        lineToRelative(dx = 0.068f, dy = -0.082f)
        // a 0.248 0.248 0 0 1 0.237 -0.115
        arcToRelative(
            a = 0.248f,
            b = 0.248f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.237f,
            dy1 = -0.115f,
        )
        // h 0.019
        horizontalLineToRelative(dx = 0.019f)
        // l 0.011 -0.015
        lineToRelative(dx = 0.011f, dy = -0.015f)
        // a 0.151 0.151 0 0 0 0.024 -0.162
        arcToRelative(
            a = 0.151f,
            b = 0.151f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.024f,
            dy1 = -0.162f,
        )
        // a 0.154 0.154 0 0 0 -0.214 -0.077z
        arcToRelative(
            a = 0.154f,
            b = 0.154f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.214f,
            dy1 = -0.077f,
        )
        close()
        // M 12.716 14.218
        moveTo(x = 12.716f, y = 14.218f)
        // L 12.705 14.23
        lineTo(x = 12.705f, y = 14.23f)
        // v 0.016
        verticalLineToRelative(dy = 0.016f)
        // a 0.17 0.17 0 0 1 -0.009 0.039
        arcToRelative(
            a = 0.17f,
            b = 0.17f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.009f,
            dy1 = 0.039f,
        )
        // a 0.37 0.37 0 0 0 0.029 0.3
        arcToRelative(
            a = 0.37f,
            b = 0.37f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.029f,
            dy1 = 0.3f,
        )
        // l 0.041 0.091
        lineToRelative(dx = 0.041f, dy = 0.091f)
        // l 0.029 -0.1
        lineToRelative(dx = 0.029f, dy = -0.1f)
        // a 0.256 0.256 0 0 1 0.177 -0.2
        arcToRelative(
            a = 0.256f,
            b = 0.256f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.177f,
            dy1 = -0.2f,
        )
        // l 0.017 -0.008
        lineToRelative(dx = 0.017f, dy = -0.008f)
        // v -0.018
        verticalLineToRelative(dy = -0.018f)
        // a 0.143 0.143 0 0 0 -0.047 -0.155
        arcToRelative(
            a = 0.143f,
            b = 0.143f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.047f,
            dy1 = -0.155f,
        )
        // a 0.168 0.168 0 0 0 -0.226 0.023z
        arcToRelative(
            a = 0.168f,
            b = 0.168f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.226f,
            dy1 = 0.023f,
        )
        close()
        // M 13.528 14.236
        moveTo(x = 13.528f, y = 14.236f)
        // a 0.145 0.145 0 0 0 -0.084 -0.138
        arcToRelative(
            a = 0.145f,
            b = 0.145f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.084f,
            dy1 = -0.138f,
        )
        // a 0.156 0.156 0 0 0 -0.209 0.079
        arcToRelative(
            a = 0.156f,
            b = 0.156f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.209f,
            dy1 = 0.079f,
        )
        // l -0.007 0.015
        lineToRelative(dx = -0.007f, dy = 0.015f)
        // l 0.005 0.015
        lineToRelative(dx = 0.005f, dy = 0.015f)
        // a 0.155 0.155 0 0 1 0 0.04
        arcToRelative(
            a = 0.155f,
            b = 0.155f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 0.04f,
        )
        // a 0.386 0.386 0 0 0 0.106 0.281
        arcToRelative(
            a = 0.386f,
            b = 0.386f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.106f,
            dy1 = 0.281f,
        )
        // l 0.065 0.082
        lineToRelative(dx = 0.065f, dy = 0.082f)
        // v -0.1
        verticalLineToRelative(dy = -0.1f)
        // a 0.251 0.251 0 0 1 0.109 -0.239
        arcToRelative(
            a = 0.251f,
            b = 0.251f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.109f,
            dy1 = -0.239f,
        )
        // l 0.014 -0.012z
        lineToRelative(dx = 0.014f, dy = -0.012f)
        close()
    }
    // M6.388 12.107 s0.052 0.044 0.006 0.209
    path(
        fill = SolidColor(Color(0xFF806600)),
    ) {
        // M 6.388 12.107
        moveTo(x = 6.388f, y = 12.107f)
        // s 0.052 0.044 0.006 0.209
        reflectiveCurveToRelative(
            dx1 = 0.052f,
            dy1 = 0.044f,
            dx2 = 0.006f,
            dy2 = 0.209f,
        )
    }
}

@Suppress("ObjectPropertyName")
private var _emoji1f1e81f1f6: ImageVector? = null
