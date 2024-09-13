package com.cristianvillamil.platziwallet.ui.commands

import android.content.Context
import android.util.Log
import java.io.BufferedReader
import java.io.InputStreamReader

class ReadCommand : FileCommand {
    override fun execute(context: Context, finaName: String, vararg arguments: String) {
        var fileString = ""
        val inputStream = context.openFileInput(finaName)
        val stringBuilder = StringBuilder()
        val inputStreamReader = InputStreamReader(inputStream)
        val bufferedReader = BufferedReader(inputStreamReader)
        bufferedReader.forEachLine { stringBuilder.append("\n").append(it) }
        fileString = stringBuilder.toString()
        Log.e("ReadedFile", fileString)
    }
}