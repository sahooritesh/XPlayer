package com.one4ll.xplayer.helpers

import android.os.Build

fun IS_MARSHMALLOW_OR_LETTER() =  Build.VERSION.SDK_INT >= Build.VERSION_CODES.M
fun IS_NOUGHOT_OR_LETTER() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.N
fun IS_NOUGHOT_MR1_OR_LETTER() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.N_MR1
fun IS_OREO_OR_LETTER() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.O
fun IS_PIE_OR_LETTER() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.P