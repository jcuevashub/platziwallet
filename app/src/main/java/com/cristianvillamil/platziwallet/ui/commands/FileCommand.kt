package com.cristianvillamil.platziwallet.ui.commands

import android.content.Context

interface FileCommand {
    fun execute(context: Context, finaName: String, vararg arguments: String)
}