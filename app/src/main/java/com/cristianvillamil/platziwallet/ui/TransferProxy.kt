package com.cristianvillamil.platziwallet.ui

class TransferProxy {
    val MAX_TRANSFER_AMOUNT = 100000
    val MIN_TRANSFER_AMOUNT = 100

    fun checkTransfer(amount: Double) : String {
        return when {
            amount > MAX_TRANSFER_AMOUNT -> {
                "La transacción excede el monto"
            }
            amount < MAX_TRANSFER_AMOUNT -> {
                "La transacción deve ser mayor $MIN_TRANSFER_AMOUNT"
            }
            else -> {
                doTransfer(amount)
                "La transferencia se hizo correctamente"
            }
        }
    }

    private fun doTransfer(amount: Double) {

    }
}