package com.example.binaryconverter

import com.example.binaryconverter.extensions.NoNegativeBinaryException
import com.example.binaryconverter.extensions.toBinary

fun convert(input: String): String {
    try {
        return input.toBinary()
    } catch (e: NoNegativeBinaryException) {
        e.message?.let {
            return it
        }
    }

    return "0"
}