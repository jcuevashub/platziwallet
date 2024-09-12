package com.cristianvillamil.platziwallet.ui.observale

import com.cristianvillamil.platziwallet.ui.home.data.MessageFactory

interface Observer {
    fun nofifyChange(newValue: Boolean)
}