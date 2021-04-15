package com.gamania.testlibrary

class TestModel(var acc: Int,var ver: Int) {
    private var version: Int = ver
    private var account: Int = acc

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