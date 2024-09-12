package com.cristianvillamil.platziwallet.ui

import android.app.AlarmManager

class TransferFacade {
    val analyticsManager: AnalyticsManager = AnalyticsManager()
    val securityManager = SecurityManager()
    val  transferManager : TransferManager = TransferManager()

    fun transfer() {
        val token = securityManager.getToken()
        analyticsManager.registerTransfer(token)
        transferManager.tranfer(token)
    }
}