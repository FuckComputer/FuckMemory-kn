package com.github.purofle.test

import kotlinx.cinterop.IntVar
import kotlinx.cinterop.allocArray
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.nativeHeap

fun main(args: Array<String>) {
    val fileSize = 1024*1024
    memScoped {
        while (true) {
            val buf = nativeHeap.allocArray<IntVar>(fileSize.shr(2))
        }
    }
}