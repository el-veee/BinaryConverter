package com.example.binaryconverter.extensions

fun String.toBinary(): String {

    return try {
        this.toUInt().toString(radix = 2)
    } catch (e: java.lang.NumberFormatException) {
        "Error Invalid Number Format"
    }
}

class NoNegativeBinaryException(message: String) : Exception(message)


