package com.cristianvillamil.platziwallet.ui.observale

interface Observable {
    fun addObserver(observer: Observer)
    fun removeObserver(observer: Observer)

    fun notifyObserver(newValue: Double)
}