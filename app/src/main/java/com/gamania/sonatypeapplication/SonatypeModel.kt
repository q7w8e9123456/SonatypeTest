package com.gamania.sonatypeapplication

class SonatypeModel {
    private var version: Int = 0
    private var account: Int = 0

    fun setModelValue(ver: Int) {
        version = ver
    }

    fun getModelValue(): Int {
        return version
    }

    fun setAccount(acc: Int) {
        account = acc
    }

    fun getAccount(): Int {
        return account
    }
}